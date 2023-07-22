@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition

@CdkDslMarker
public class CfnModelQualityJobDefinitionModelQualityBaselineConfigPropertyDsl {
  private val cdkBuilder: CfnModelQualityJobDefinition.ModelQualityBaselineConfigProperty.Builder =
      CfnModelQualityJobDefinition.ModelQualityBaselineConfigProperty.builder()

  /**
   * @param baseliningJobName The name of the job that performs baselining for the monitoring job.
   */
  public fun baseliningJobName(baseliningJobName: String) {
    cdkBuilder.baseliningJobName(baseliningJobName)
  }

  /**
   * @param constraintsResource The constraints resource for a monitoring job.
   */
  public fun constraintsResource(constraintsResource: IResolvable) {
    cdkBuilder.constraintsResource(constraintsResource)
  }

  /**
   * @param constraintsResource The constraints resource for a monitoring job.
   */
  public
      fun constraintsResource(constraintsResource: CfnModelQualityJobDefinition.ConstraintsResourceProperty) {
    cdkBuilder.constraintsResource(constraintsResource)
  }

  public fun build(): CfnModelQualityJobDefinition.ModelQualityBaselineConfigProperty =
      cdkBuilder.build()
}
