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

  public fun baseliningJobName(baseliningJobName: String) {
    cdkBuilder.baseliningJobName(baseliningJobName)
  }

  public fun constraintsResource(constraintsResource: IResolvable) {
    cdkBuilder.constraintsResource(constraintsResource)
  }

  public
      fun constraintsResource(constraintsResource: CfnModelQualityJobDefinition.ConstraintsResourceProperty) {
    cdkBuilder.constraintsResource(constraintsResource)
  }

  public fun build(): CfnModelQualityJobDefinition.ModelQualityBaselineConfigProperty =
      cdkBuilder.build()
}
