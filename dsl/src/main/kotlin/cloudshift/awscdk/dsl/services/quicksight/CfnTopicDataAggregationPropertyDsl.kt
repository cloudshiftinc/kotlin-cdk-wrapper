@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTopic

@CdkDslMarker
public class CfnTopicDataAggregationPropertyDsl {
  private val cdkBuilder: CfnTopic.DataAggregationProperty.Builder =
      CfnTopic.DataAggregationProperty.builder()

  public fun datasetRowDateGranularity(datasetRowDateGranularity: String) {
    cdkBuilder.datasetRowDateGranularity(datasetRowDateGranularity)
  }

  public fun defaultDateColumnName(defaultDateColumnName: String) {
    cdkBuilder.defaultDateColumnName(defaultDateColumnName)
  }

  public fun build(): CfnTopic.DataAggregationProperty = cdkBuilder.build()
}
