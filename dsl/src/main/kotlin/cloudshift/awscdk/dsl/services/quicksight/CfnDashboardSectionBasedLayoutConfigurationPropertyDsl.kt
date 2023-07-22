@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardSectionBasedLayoutConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.SectionBasedLayoutConfigurationProperty.Builder =
      CfnDashboard.SectionBasedLayoutConfigurationProperty.builder()

  private val _bodySections: MutableList<Any> = mutableListOf()

  private val _footerSections: MutableList<Any> = mutableListOf()

  private val _headerSections: MutableList<Any> = mutableListOf()

  /**
   * @param bodySections A list of body section configurations. 
   */
  public fun bodySections(vararg bodySections: Any) {
    _bodySections.addAll(listOf(*bodySections))
  }

  /**
   * @param bodySections A list of body section configurations. 
   */
  public fun bodySections(bodySections: Collection<Any>) {
    _bodySections.addAll(bodySections)
  }

  /**
   * @param bodySections A list of body section configurations. 
   */
  public fun bodySections(bodySections: IResolvable) {
    cdkBuilder.bodySections(bodySections)
  }

  /**
   * @param canvasSizeOptions The options for the canvas of a section-based layout. 
   */
  public fun canvasSizeOptions(canvasSizeOptions: IResolvable) {
    cdkBuilder.canvasSizeOptions(canvasSizeOptions)
  }

  /**
   * @param canvasSizeOptions The options for the canvas of a section-based layout. 
   */
  public
      fun canvasSizeOptions(canvasSizeOptions: CfnDashboard.SectionBasedLayoutCanvasSizeOptionsProperty) {
    cdkBuilder.canvasSizeOptions(canvasSizeOptions)
  }

  /**
   * @param footerSections A list of footer section configurations. 
   */
  public fun footerSections(vararg footerSections: Any) {
    _footerSections.addAll(listOf(*footerSections))
  }

  /**
   * @param footerSections A list of footer section configurations. 
   */
  public fun footerSections(footerSections: Collection<Any>) {
    _footerSections.addAll(footerSections)
  }

  /**
   * @param footerSections A list of footer section configurations. 
   */
  public fun footerSections(footerSections: IResolvable) {
    cdkBuilder.footerSections(footerSections)
  }

  /**
   * @param headerSections A list of header section configurations. 
   */
  public fun headerSections(vararg headerSections: Any) {
    _headerSections.addAll(listOf(*headerSections))
  }

  /**
   * @param headerSections A list of header section configurations. 
   */
  public fun headerSections(headerSections: Collection<Any>) {
    _headerSections.addAll(headerSections)
  }

  /**
   * @param headerSections A list of header section configurations. 
   */
  public fun headerSections(headerSections: IResolvable) {
    cdkBuilder.headerSections(headerSections)
  }

  public fun build(): CfnDashboard.SectionBasedLayoutConfigurationProperty {
    if(_bodySections.isNotEmpty()) cdkBuilder.bodySections(_bodySections)
    if(_footerSections.isNotEmpty()) cdkBuilder.footerSections(_footerSections)
    if(_headerSections.isNotEmpty()) cdkBuilder.headerSections(_headerSections)
    return cdkBuilder.build()
  }
}
