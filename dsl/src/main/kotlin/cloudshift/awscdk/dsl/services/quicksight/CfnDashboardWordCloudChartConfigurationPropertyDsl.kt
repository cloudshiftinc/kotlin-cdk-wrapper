@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardWordCloudChartConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.WordCloudChartConfigurationProperty.Builder =
      CfnDashboard.WordCloudChartConfigurationProperty.builder()

  /**
   * @param categoryLabelOptions The label options (label text, label visibility, and sort icon
   * visibility) for the word cloud category.
   */
  public fun categoryLabelOptions(categoryLabelOptions: IResolvable) {
    cdkBuilder.categoryLabelOptions(categoryLabelOptions)
  }

  /**
   * @param categoryLabelOptions The label options (label text, label visibility, and sort icon
   * visibility) for the word cloud category.
   */
  public
      fun categoryLabelOptions(categoryLabelOptions: CfnDashboard.ChartAxisLabelOptionsProperty) {
    cdkBuilder.categoryLabelOptions(categoryLabelOptions)
  }

  /**
   * @param fieldWells The field wells of the visual.
   */
  public fun fieldWells(fieldWells: IResolvable) {
    cdkBuilder.fieldWells(fieldWells)
  }

  /**
   * @param fieldWells The field wells of the visual.
   */
  public fun fieldWells(fieldWells: CfnDashboard.WordCloudFieldWellsProperty) {
    cdkBuilder.fieldWells(fieldWells)
  }

  /**
   * @param sortConfiguration The sort configuration of a word cloud visual.
   */
  public fun sortConfiguration(sortConfiguration: IResolvable) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  /**
   * @param sortConfiguration The sort configuration of a word cloud visual.
   */
  public fun sortConfiguration(sortConfiguration: CfnDashboard.WordCloudSortConfigurationProperty) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  /**
   * @param wordCloudOptions The options for a word cloud visual.
   */
  public fun wordCloudOptions(wordCloudOptions: IResolvable) {
    cdkBuilder.wordCloudOptions(wordCloudOptions)
  }

  /**
   * @param wordCloudOptions The options for a word cloud visual.
   */
  public fun wordCloudOptions(wordCloudOptions: CfnDashboard.WordCloudOptionsProperty) {
    cdkBuilder.wordCloudOptions(wordCloudOptions)
  }

  public fun build(): CfnDashboard.WordCloudChartConfigurationProperty = cdkBuilder.build()
}
