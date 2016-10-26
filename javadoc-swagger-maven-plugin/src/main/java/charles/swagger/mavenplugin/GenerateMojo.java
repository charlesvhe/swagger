package charles.swagger.mavenplugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

/**
 * Created by Charles on 2016/10/26.
 */
@Mojo(name = "generate")
public class GenerateMojo extends AbstractMojo {
    @Parameter
    private String basePath;

    public void execute() throws MojoExecutionException, MojoFailureException {
        MavenProject project = (MavenProject) this.getPluginContext().get("project");
        System.out.println("basePath: " + basePath);
    }

    public String getBasePath() {
        return basePath;
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }
}
