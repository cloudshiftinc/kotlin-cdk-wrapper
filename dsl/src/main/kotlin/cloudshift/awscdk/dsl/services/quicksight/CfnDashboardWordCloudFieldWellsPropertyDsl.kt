@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardWordCloudFieldWellsPropertyDsl {
  private val cdkBuilder: CfnDashboard.WordCloudFieldWellsProperty.Builder =
      CfnDashboard.WordCloudFieldWellsProperty.builder()

  /**
   * @param wordCloudAggregatedFieldWells The aggregated field wells of a word cloud.
   */
  public fun wordCloudAggregatedFieldWells(wordCloudAggregatedFieldWells: IResolvable) {
    cdkBuilder.wordCloudAggregatedFieldWells(wordCloudAggregatedFieldWells)
  }

  /**
   * @param wordCloudAggregatedFieldWells The aggregated field wells of a word cloud.
   */
  public
      fun wordCloudAggregatedFieldWells(wordCloudAggregatedFieldWells: CfnDashboard.WordCloudAggregatedFieldWellsProperty) {
    cdkBuilder.wordCloudAggregatedFieldWells(wordCloudAggregatedFieldWells)
  }

  public fun build(): CfnDashboard.WordCloudFieldWellsProperty = cdkBuilder.build()
}
