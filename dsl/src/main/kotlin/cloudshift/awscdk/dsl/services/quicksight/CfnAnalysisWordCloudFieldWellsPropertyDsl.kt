@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisWordCloudFieldWellsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.WordCloudFieldWellsProperty.Builder =
      CfnAnalysis.WordCloudFieldWellsProperty.builder()

  public fun wordCloudAggregatedFieldWells(wordCloudAggregatedFieldWells: IResolvable) {
    cdkBuilder.wordCloudAggregatedFieldWells(wordCloudAggregatedFieldWells)
  }

  public
      fun wordCloudAggregatedFieldWells(wordCloudAggregatedFieldWells: CfnAnalysis.WordCloudAggregatedFieldWellsProperty) {
    cdkBuilder.wordCloudAggregatedFieldWells(wordCloudAggregatedFieldWells)
  }

  public fun build(): CfnAnalysis.WordCloudFieldWellsProperty = cdkBuilder.build()
}
