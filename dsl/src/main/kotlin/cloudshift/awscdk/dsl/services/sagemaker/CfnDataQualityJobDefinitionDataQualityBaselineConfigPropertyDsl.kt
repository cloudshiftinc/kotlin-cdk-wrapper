@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition

@CdkDslMarker
public class CfnDataQualityJobDefinitionDataQualityBaselineConfigPropertyDsl {
  private val cdkBuilder: CfnDataQualityJobDefinition.DataQualityBaselineConfigProperty.Builder =
      CfnDataQualityJobDefinition.DataQualityBaselineConfigProperty.builder()

  public fun baseliningJobName(baseliningJobName: String) {
    cdkBuilder.baseliningJobName(baseliningJobName)
  }

  public fun constraintsResource(constraintsResource: IResolvable) {
    cdkBuilder.constraintsResource(constraintsResource)
  }

  public
      fun constraintsResource(constraintsResource: CfnDataQualityJobDefinition.ConstraintsResourceProperty) {
    cdkBuilder.constraintsResource(constraintsResource)
  }

  public fun statisticsResource(statisticsResource: IResolvable) {
    cdkBuilder.statisticsResource(statisticsResource)
  }

  public
      fun statisticsResource(statisticsResource: CfnDataQualityJobDefinition.StatisticsResourceProperty) {
    cdkBuilder.statisticsResource(statisticsResource)
  }

  public fun build(): CfnDataQualityJobDefinition.DataQualityBaselineConfigProperty =
      cdkBuilder.build()
}
