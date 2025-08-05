@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Construct
import kotlin.Any
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A deploy specifications for EC2 deploy action.
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
public abstract class Ec2DeploySpecifications(
  cdkObject: software.amazon.awscdk.services.codepipeline.actions.Ec2DeploySpecifications,
) : CdkObject(cdkObject) {
  /**
   * The callback invoked when this deploy specifications is bound to an action.
   *
   * @return the action configurations
   * @param scope the Construct tree scope. 
   */
  public open fun bind(scope: Construct): Any =
      unwrap(this).bind(scope.let(Construct.Companion::unwrap))

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codepipeline.actions.Ec2DeploySpecifications,
  ) : Ec2DeploySpecifications(cdkObject)

  public companion object {
    public fun `inline`(props: Ec2DeploySpecificationsInlineProps): Ec2DeploySpecifications =
        software.amazon.awscdk.services.codepipeline.actions.Ec2DeploySpecifications.`inline`(props.let(Ec2DeploySpecificationsInlineProps.Companion::unwrap)).let(Ec2DeploySpecifications::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a71c6ca71f4f61681f512d064789b48a6f7437c881f224146948eb61b131a6a9")
    public fun `inline`(props: Ec2DeploySpecificationsInlineProps.Builder.() -> Unit):
        Ec2DeploySpecifications = `inline`(Ec2DeploySpecificationsInlineProps(props))

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.Ec2DeploySpecifications):
        Ec2DeploySpecifications = CdkObjectWrappers.wrap(cdkObject) as? Ec2DeploySpecifications ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Ec2DeploySpecifications):
        software.amazon.awscdk.services.codepipeline.actions.Ec2DeploySpecifications = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.Ec2DeploySpecifications
  }
}
