/*
 * generated by Xtext
 */
package istic.idm.project.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class VideoGenAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("istic/idm/project/parser/antlr/internal/InternalVideoGen.tokens");
	}
}