@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition

@CdkDslMarker
public class CfnModelBiasJobDefinitionModelBiasBaselineConfigPropertyDsl {
  private val cdkBuilder: CfnModelBiasJobDefinition.ModelBiasBaselineConfigProperty.Builder =
      CfnModelBiasJobDefinition.ModelBiasBaselineConfigProperty.builder()

  /**
   * @param baseliningJobName The name of the baseline model bias job.
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
      fun constraintsResource(constraintsResource: CfnModelBiasJobDefinition.ConstraintsResourceProperty) {
    cdkBuilder.constraintsResource(constraintsResource)
  }

  public fun build(): CfnModelBiasJobDefinition.ModelBiasBaselineConfigProperty = cdkBuilder.build()
}
