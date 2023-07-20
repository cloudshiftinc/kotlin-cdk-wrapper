@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateWordCloudFieldWellsPropertyDsl {
  private val cdkBuilder: CfnTemplate.WordCloudFieldWellsProperty.Builder =
      CfnTemplate.WordCloudFieldWellsProperty.builder()

  public fun wordCloudAggregatedFieldWells(wordCloudAggregatedFieldWells: IResolvable) {
    cdkBuilder.wordCloudAggregatedFieldWells(wordCloudAggregatedFieldWells)
  }

  public
      fun wordCloudAggregatedFieldWells(wordCloudAggregatedFieldWells: CfnTemplate.WordCloudAggregatedFieldWellsProperty) {
    cdkBuilder.wordCloudAggregatedFieldWells(wordCloudAggregatedFieldWells)
  }

  public fun build(): CfnTemplate.WordCloudFieldWellsProperty = cdkBuilder.build()
}
