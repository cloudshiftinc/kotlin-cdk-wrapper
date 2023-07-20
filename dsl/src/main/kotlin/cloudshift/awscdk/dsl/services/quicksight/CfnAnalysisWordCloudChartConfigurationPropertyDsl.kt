@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisWordCloudChartConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.WordCloudChartConfigurationProperty.Builder =
      CfnAnalysis.WordCloudChartConfigurationProperty.builder()

  public fun categoryLabelOptions(categoryLabelOptions: IResolvable) {
    cdkBuilder.categoryLabelOptions(categoryLabelOptions)
  }

  public fun categoryLabelOptions(categoryLabelOptions: CfnAnalysis.ChartAxisLabelOptionsProperty) {
    cdkBuilder.categoryLabelOptions(categoryLabelOptions)
  }

  public fun fieldWells(fieldWells: IResolvable) {
    cdkBuilder.fieldWells(fieldWells)
  }

  public fun fieldWells(fieldWells: CfnAnalysis.WordCloudFieldWellsProperty) {
    cdkBuilder.fieldWells(fieldWells)
  }

  public fun sortConfiguration(sortConfiguration: IResolvable) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  public fun sortConfiguration(sortConfiguration: CfnAnalysis.WordCloudSortConfigurationProperty) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  public fun wordCloudOptions(wordCloudOptions: IResolvable) {
    cdkBuilder.wordCloudOptions(wordCloudOptions)
  }

  public fun wordCloudOptions(wordCloudOptions: CfnAnalysis.WordCloudOptionsProperty) {
    cdkBuilder.wordCloudOptions(wordCloudOptions)
  }

  public fun build(): CfnAnalysis.WordCloudChartConfigurationProperty = cdkBuilder.build()
}
