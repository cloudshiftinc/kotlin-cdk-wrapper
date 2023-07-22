@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnStep
import software.constructs.Construct

@CdkDslMarker
public class CfnStepDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnStep.Builder = CfnStep.Builder.create(scope, id)

  /**
   * This specifies what action to take when the cluster step fails.
   *
   * Possible values are `CANCEL_AND_WAIT` and `CONTINUE` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-emr-step-actiononfailure)
   * @param actionOnFailure This specifies what action to take when the cluster step fails. 
   */
  public fun actionOnFailure(actionOnFailure: String) {
    cdkBuilder.actionOnFailure(actionOnFailure)
  }

  /**
   * The `HadoopJarStepConfig` property type specifies a job flow step consisting of a JAR file
   * whose main function will be executed.
   *
   * The main function submits a job for the cluster to execute as a step on the master node, and
   * then waits for the job to finish or fail before executing subsequent steps.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-emr-step-hadoopjarstep)
   * @param hadoopJarStep The `HadoopJarStepConfig` property type specifies a job flow step
   * consisting of a JAR file whose main function will be executed. 
   */
  public fun hadoopJarStep(hadoopJarStep: IResolvable) {
    cdkBuilder.hadoopJarStep(hadoopJarStep)
  }

  /**
   * The `HadoopJarStepConfig` property type specifies a job flow step consisting of a JAR file
   * whose main function will be executed.
   *
   * The main function submits a job for the cluster to execute as a step on the master node, and
   * then waits for the job to finish or fail before executing subsequent steps.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-emr-step-hadoopjarstep)
   * @param hadoopJarStep The `HadoopJarStepConfig` property type specifies a job flow step
   * consisting of a JAR file whose main function will be executed. 
   */
  public fun hadoopJarStep(hadoopJarStep: CfnStep.HadoopJarStepConfigProperty) {
    cdkBuilder.hadoopJarStep(hadoopJarStep)
  }

  /**
   * A string that uniquely identifies the cluster (job flow).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-emr-step-jobflowid)
   * @param jobFlowId A string that uniquely identifies the cluster (job flow). 
   */
  public fun jobFlowId(jobFlowId: String) {
    cdkBuilder.jobFlowId(jobFlowId)
  }

  /**
   * The name of the cluster step.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-emr-step-name)
   * @param name The name of the cluster step. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnStep = cdkBuilder.build()
}
