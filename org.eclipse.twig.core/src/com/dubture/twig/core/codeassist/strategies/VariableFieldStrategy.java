package com.dubture.twig.core.codeassist.strategies;

import org.eclipse.php.core.codeassist.ICompletionContext;
import org.eclipse.php.internal.core.codeassist.ICompletionReporter;

import com.dubture.twig.core.codeassist.context.VariableFieldContext;


/**
 * 
 * 
 * @see VariableFieldContext
 * 
 * @author "Robert Gruendler <r.gruendler@gmail.com>"
 *
 */
@SuppressWarnings("restriction")
public class VariableFieldStrategy extends AbstractTwigCompletionStrategy {

	
	
	public VariableFieldStrategy(ICompletionContext context) {
		super(context);

	}

	@Override
	public void apply(ICompletionReporter reporter) throws Exception {
						
		//VariableFieldContext ctx = (VariableFieldContext) getContext();
		
	}
}