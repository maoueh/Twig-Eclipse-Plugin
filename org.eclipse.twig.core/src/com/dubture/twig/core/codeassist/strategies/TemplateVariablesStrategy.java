package com.dubture.twig.core.codeassist.strategies;


import org.eclipse.dltk.core.IField;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.internal.core.SourceRange;
import org.eclipse.php.core.codeassist.ICompletionContext;
import org.eclipse.php.internal.core.codeassist.ICompletionReporter;
import org.eclipse.php.internal.core.codeassist.strategies.GlobalElementStrategy;
import org.eclipse.php.internal.core.typeinference.PHPModelUtils;

import com.dubture.twig.core.codeassist.context.AbstractTwigCompletionContext;


/**
 * 
 * Completes local variables in templates
 * 
 * @author Robert Gruendler <r.gruendler@gmail.com>
 *
 */
@SuppressWarnings({ "restriction", "deprecation" })
public class TemplateVariablesStrategy extends GlobalElementStrategy {

	public TemplateVariablesStrategy(ICompletionContext context) {
		super(context);

	}

	@Override
	public void apply(ICompletionReporter reporter) throws Exception {

		ICompletionContext context = getContext();
		AbstractTwigCompletionContext abstractContext = (AbstractTwigCompletionContext) context;
		String prefix = abstractContext.getPrefix();

		IField[] fields = PHPModelUtils.getFileFields(
					abstractContext.getSourceModule(), prefix, false, null);

		SourceRange replaceRange = getReplacementRange(context);
		
		for (IModelElement var : fields) {
			reporter.reportField((IField) var, "", replaceRange, false);
		}		

	}
}