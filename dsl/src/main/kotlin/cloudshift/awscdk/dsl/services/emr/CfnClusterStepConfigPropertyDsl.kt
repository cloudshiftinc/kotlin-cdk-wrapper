@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnCluster

/**
 * `StepConfig` is a property of the `AWS::EMR::Cluster` resource.
 *
 * The `StepConfig` property type specifies a cluster (job flow) step, which runs only on the master
 * node. Steps are used to submit data processing jobs to the cluster.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emr.*;
 * StepConfigProperty stepConfigProperty = StepConfigProperty.builder()
 * .hadoopJarStep(HadoopJarStepConfigProperty.builder()
 * .jar("jar")
 * // the properties below are optional
 * .args(List.of("args"))
 * .mainClass("mainClass")
 * .stepProperties(List.of(KeyValueProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build())
 * .name("name")
 * // the properties below are optional
 * .actionOnFailure("actionOnFailure")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-stepconfig.html)
 */
@CdkDslMarker
public class CfnClusterStepConfigPropertyDsl {
  private val cdkBuilder: CfnCluster.StepConfigProperty.Builder =
      CfnCluster.StepConfigProperty.builder()

  /**
   * @param actionOnFailure The action to take when the cluster step fails.
   * Possible values are `CANCEL_AND_WAIT` and `CONTINUE` .
   */
  public fun actionOnFailure(actionOnFailure: String) {
    cdkBuilder.actionOnFailure(actionOnFailure)
  }

  /**
   * @param hadoopJarStep The JAR file used for the step. 
   */
  public fun hadoopJarStep(hadoopJarStep: IResolvable) {
    cdkBuilder.hadoopJarStep(hadoopJarStep)
  }

  /**
   * @param hadoopJarStep The JAR file used for the step. 
   */
  public fun hadoopJarStep(hadoopJarStep: CfnCluster.HadoopJarStepConfigProperty) {
    cdkBuilder.hadoopJarStep(hadoopJarStep)
  }

  /**
   * @param name The name of the step. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnCluster.StepConfigProperty = cdkBuilder.build()
}
