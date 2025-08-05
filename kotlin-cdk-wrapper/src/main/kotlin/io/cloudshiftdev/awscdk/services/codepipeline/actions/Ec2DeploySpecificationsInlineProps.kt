@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties of `Ec2DeploySpecifications.inline()`.
 *
 * Example:
 *
 * ```
 * Artifact sourceOutput = new Artifact();
 * Pipeline pipeline = Pipeline.Builder.create(this, "MyPipeline")
 * .pipelineType(PipelineType.V2)
 * .build();
 * Ec2DeployAction deployAction = Ec2DeployAction.Builder.create()
 * .actionName("Ec2Deploy")
 * .input(sourceOutput)
 * .instanceType(Ec2InstanceType.EC2)
 * .instanceTagKey("Name")
 * .instanceTagValue("MyInstance")
 * .deploySpecifications(Ec2DeploySpecifications.inline(Ec2DeploySpecificationsInlineProps.builder()
 * .targetDirectory("/home/ec2-user/deploy")
 * .preScript("scripts/pre-deploy.sh")
 * .postScript("scripts/post-deploy.sh")
 * .build()))
 * .build();
 * IStage deployStage = pipeline.addStage(StageOptions.builder()
 * .stageName("Deploy")
 * .actions(List.of(deployAction))
 * .build());
 * ```
 */
public interface Ec2DeploySpecificationsInlineProps {
  /**
   * Path to the executable script file that runs AFTER the Deploy phase.
   *
   * It should start from the root directory of your uploaded source artifact.
   * Use an absolute path like `uploadDir/postScript.sh`.
   */
  public fun postScript(): String

  /**
   * Path to the executable script file that runs BEFORE the Deploy phase.
   *
   * It should start from the root directory of your uploaded source artifact.
   * Use an absolute path like `uploadDir/preScript.sh`.
   *
   * Default: - No script
   */
  public fun preScript(): String? = unwrap(this).getPreScript()

  /**
   * The location of the target directory you want to deploy to.
   *
   * Use an absolute path like `/home/ec2-user/deploy`.
   */
  public fun targetDirectory(): String

  /**
   * A builder for [Ec2DeploySpecificationsInlineProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param postScript Path to the executable script file that runs AFTER the Deploy phase. 
     * It should start from the root directory of your uploaded source artifact.
     * Use an absolute path like `uploadDir/postScript.sh`.
     */
    public fun postScript(postScript: String)

    /**
     * @param preScript Path to the executable script file that runs BEFORE the Deploy phase.
     * It should start from the root directory of your uploaded source artifact.
     * Use an absolute path like `uploadDir/preScript.sh`.
     */
    public fun preScript(preScript: String)

    /**
     * @param targetDirectory The location of the target directory you want to deploy to. 
     * Use an absolute path like `/home/ec2-user/deploy`.
     */
    public fun targetDirectory(targetDirectory: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.Ec2DeploySpecificationsInlineProps.Builder
        =
        software.amazon.awscdk.services.codepipeline.actions.Ec2DeploySpecificationsInlineProps.builder()

    /**
     * @param postScript Path to the executable script file that runs AFTER the Deploy phase. 
     * It should start from the root directory of your uploaded source artifact.
     * Use an absolute path like `uploadDir/postScript.sh`.
     */
    override fun postScript(postScript: String) {
      cdkBuilder.postScript(postScript)
    }

    /**
     * @param preScript Path to the executable script file that runs BEFORE the Deploy phase.
     * It should start from the root directory of your uploaded source artifact.
     * Use an absolute path like `uploadDir/preScript.sh`.
     */
    override fun preScript(preScript: String) {
      cdkBuilder.preScript(preScript)
    }

    /**
     * @param targetDirectory The location of the target directory you want to deploy to. 
     * Use an absolute path like `/home/ec2-user/deploy`.
     */
    override fun targetDirectory(targetDirectory: String) {
      cdkBuilder.targetDirectory(targetDirectory)
    }

    public fun build():
        software.amazon.awscdk.services.codepipeline.actions.Ec2DeploySpecificationsInlineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codepipeline.actions.Ec2DeploySpecificationsInlineProps,
  ) : CdkObject(cdkObject),
      Ec2DeploySpecificationsInlineProps {
    /**
     * Path to the executable script file that runs AFTER the Deploy phase.
     *
     * It should start from the root directory of your uploaded source artifact.
     * Use an absolute path like `uploadDir/postScript.sh`.
     */
    override fun postScript(): String = unwrap(this).getPostScript()

    /**
     * Path to the executable script file that runs BEFORE the Deploy phase.
     *
     * It should start from the root directory of your uploaded source artifact.
     * Use an absolute path like `uploadDir/preScript.sh`.
     *
     * Default: - No script
     */
    override fun preScript(): String? = unwrap(this).getPreScript()

    /**
     * The location of the target directory you want to deploy to.
     *
     * Use an absolute path like `/home/ec2-user/deploy`.
     */
    override fun targetDirectory(): String = unwrap(this).getTargetDirectory()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Ec2DeploySpecificationsInlineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.Ec2DeploySpecificationsInlineProps):
        Ec2DeploySpecificationsInlineProps = CdkObjectWrappers.wrap(cdkObject) as?
        Ec2DeploySpecificationsInlineProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: Ec2DeploySpecificationsInlineProps):
        software.amazon.awscdk.services.codepipeline.actions.Ec2DeploySpecificationsInlineProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.Ec2DeploySpecificationsInlineProps
  }
}
