@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardLayoutConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.LayoutConfigurationProperty.Builder =
      CfnDashboard.LayoutConfigurationProperty.builder()

  /**
   * @param freeFormLayout A free-form is optimized for a fixed width and has more control over the
   * exact placement of layout elements.
   */
  public fun freeFormLayout(freeFormLayout: IResolvable) {
    cdkBuilder.freeFormLayout(freeFormLayout)
  }

  /**
   * @param freeFormLayout A free-form is optimized for a fixed width and has more control over the
   * exact placement of layout elements.
   */
  public fun freeFormLayout(freeFormLayout: CfnDashboard.FreeFormLayoutConfigurationProperty) {
    cdkBuilder.freeFormLayout(freeFormLayout)
  }

  /**
   * @param gridLayout A type of layout that can be used on a sheet.
   * In a grid layout, visuals snap to a grid with standard spacing and alignment. Dashboards are
   * displayed as designed, with options to fit to screen or view at actual size. A grid layout can be
   * configured to behave in one of two ways when the viewport is resized: `FIXED` or `RESPONSIVE` .
   */
  public fun gridLayout(gridLayout: IResolvable) {
    cdkBuilder.gridLayout(gridLayout)
  }

  /**
   * @param gridLayout A type of layout that can be used on a sheet.
   * In a grid layout, visuals snap to a grid with standard spacing and alignment. Dashboards are
   * displayed as designed, with options to fit to screen or view at actual size. A grid layout can be
   * configured to behave in one of two ways when the viewport is resized: `FIXED` or `RESPONSIVE` .
   */
  public fun gridLayout(gridLayout: CfnDashboard.GridLayoutConfigurationProperty) {
    cdkBuilder.gridLayout(gridLayout)
  }

  /**
   * @param sectionBasedLayout A section based layout organizes visuals into multiple sections and
   * has customized header, footer and page break.
   */
  public fun sectionBasedLayout(sectionBasedLayout: IResolvable) {
    cdkBuilder.sectionBasedLayout(sectionBasedLayout)
  }

  /**
   * @param sectionBasedLayout A section based layout organizes visuals into multiple sections and
   * has customized header, footer and page break.
   */
  public
      fun sectionBasedLayout(sectionBasedLayout: CfnDashboard.SectionBasedLayoutConfigurationProperty) {
    cdkBuilder.sectionBasedLayout(sectionBasedLayout)
  }

  public fun build(): CfnDashboard.LayoutConfigurationProperty = cdkBuilder.build()
}
