@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The configuration of a tree map.
 *
 * Example:
 *
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-treemapconfiguration.html)
 */
@CdkDslMarker
public class CfnDashboardTreeMapConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.TreeMapConfigurationProperty.Builder =
      CfnDashboard.TreeMapConfigurationProperty.builder()

  /**
   * @param colorLabelOptions The label options (label text, label visibility) for the colors
   * displayed in a tree map.
   */
  public fun colorLabelOptions(colorLabelOptions: IResolvable) {
    cdkBuilder.colorLabelOptions(colorLabelOptions)
  }

  /**
   * @param colorLabelOptions The label options (label text, label visibility) for the colors
   * displayed in a tree map.
   */
  public fun colorLabelOptions(colorLabelOptions: CfnDashboard.ChartAxisLabelOptionsProperty) {
    cdkBuilder.colorLabelOptions(colorLabelOptions)
  }

  /**
   * @param colorScale The color options (gradient color, point of divergence) of a tree map.
   */
  public fun colorScale(colorScale: IResolvable) {
    cdkBuilder.colorScale(colorScale)
  }

  /**
   * @param colorScale The color options (gradient color, point of divergence) of a tree map.
   */
  public fun colorScale(colorScale: CfnDashboard.ColorScaleProperty) {
    cdkBuilder.colorScale(colorScale)
  }

  /**
   * @param dataLabels The options that determine if visual data labels are displayed.
   */
  public fun dataLabels(dataLabels: IResolvable) {
    cdkBuilder.dataLabels(dataLabels)
  }

  /**
   * @param dataLabels The options that determine if visual data labels are displayed.
   */
  public fun dataLabels(dataLabels: CfnDashboard.DataLabelOptionsProperty) {
    cdkBuilder.dataLabels(dataLabels)
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
  public fun fieldWells(fieldWells: CfnDashboard.TreeMapFieldWellsProperty) {
    cdkBuilder.fieldWells(fieldWells)
  }

  /**
   * @param groupLabelOptions The label options (label text, label visibility) of the groups that
   * are displayed in a tree map.
   */
  public fun groupLabelOptions(groupLabelOptions: IResolvable) {
    cdkBuilder.groupLabelOptions(groupLabelOptions)
  }

  /**
   * @param groupLabelOptions The label options (label text, label visibility) of the groups that
   * are displayed in a tree map.
   */
  public fun groupLabelOptions(groupLabelOptions: CfnDashboard.ChartAxisLabelOptionsProperty) {
    cdkBuilder.groupLabelOptions(groupLabelOptions)
  }

  /**
   * @param legend The legend display setup of the visual.
   */
  public fun legend(legend: IResolvable) {
    cdkBuilder.legend(legend)
  }

  /**
   * @param legend The legend display setup of the visual.
   */
  public fun legend(legend: CfnDashboard.LegendOptionsProperty) {
    cdkBuilder.legend(legend)
  }

  /**
   * @param sizeLabelOptions The label options (label text, label visibility) of the sizes that are
   * displayed in a tree map.
   */
  public fun sizeLabelOptions(sizeLabelOptions: IResolvable) {
    cdkBuilder.sizeLabelOptions(sizeLabelOptions)
  }

  /**
   * @param sizeLabelOptions The label options (label text, label visibility) of the sizes that are
   * displayed in a tree map.
   */
  public fun sizeLabelOptions(sizeLabelOptions: CfnDashboard.ChartAxisLabelOptionsProperty) {
    cdkBuilder.sizeLabelOptions(sizeLabelOptions)
  }

  /**
   * @param sortConfiguration The sort configuration of a tree map.
   */
  public fun sortConfiguration(sortConfiguration: IResolvable) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  /**
   * @param sortConfiguration The sort configuration of a tree map.
   */
  public fun sortConfiguration(sortConfiguration: CfnDashboard.TreeMapSortConfigurationProperty) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  /**
   * @param tooltip The tooltip display setup of the visual.
   */
  public fun tooltip(tooltip: IResolvable) {
    cdkBuilder.tooltip(tooltip)
  }

  /**
   * @param tooltip The tooltip display setup of the visual.
   */
  public fun tooltip(tooltip: CfnDashboard.TooltipOptionsProperty) {
    cdkBuilder.tooltip(tooltip)
  }

  public fun build(): CfnDashboard.TreeMapConfigurationProperty = cdkBuilder.build()
}
