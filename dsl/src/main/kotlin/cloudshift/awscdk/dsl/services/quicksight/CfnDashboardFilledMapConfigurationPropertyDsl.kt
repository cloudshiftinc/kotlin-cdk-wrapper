@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The configuration for a `FilledMapVisual` .
 *
 * Example:
 *
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-filledmapconfiguration.html)
 */
@CdkDslMarker
public class CfnDashboardFilledMapConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.FilledMapConfigurationProperty.Builder =
      CfnDashboard.FilledMapConfigurationProperty.builder()

  /**
   * @param fieldWells The field wells of the visual.
   */
  public fun fieldWells(fieldWells: IResolvable) {
    cdkBuilder.fieldWells(fieldWells)
  }

  /**
   * @param fieldWells The field wells of the visual.
   */
  public fun fieldWells(fieldWells: CfnDashboard.FilledMapFieldWellsProperty) {
    cdkBuilder.fieldWells(fieldWells)
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
   * @param mapStyleOptions The map style options of the filled map visual.
   */
  public fun mapStyleOptions(mapStyleOptions: IResolvable) {
    cdkBuilder.mapStyleOptions(mapStyleOptions)
  }

  /**
   * @param mapStyleOptions The map style options of the filled map visual.
   */
  public fun mapStyleOptions(mapStyleOptions: CfnDashboard.GeospatialMapStyleOptionsProperty) {
    cdkBuilder.mapStyleOptions(mapStyleOptions)
  }

  /**
   * @param sortConfiguration The sort configuration of a `FilledMapVisual` .
   */
  public fun sortConfiguration(sortConfiguration: IResolvable) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  /**
   * @param sortConfiguration The sort configuration of a `FilledMapVisual` .
   */
  public fun sortConfiguration(sortConfiguration: CfnDashboard.FilledMapSortConfigurationProperty) {
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

  /**
   * @param windowOptions The window options of the filled map visual.
   */
  public fun windowOptions(windowOptions: IResolvable) {
    cdkBuilder.windowOptions(windowOptions)
  }

  /**
   * @param windowOptions The window options of the filled map visual.
   */
  public fun windowOptions(windowOptions: CfnDashboard.GeospatialWindowOptionsProperty) {
    cdkBuilder.windowOptions(windowOptions)
  }

  public fun build(): CfnDashboard.FilledMapConfigurationProperty = cdkBuilder.build()
}
