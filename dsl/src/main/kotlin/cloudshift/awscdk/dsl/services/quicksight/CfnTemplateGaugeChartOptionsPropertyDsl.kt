@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateGaugeChartOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.GaugeChartOptionsProperty.Builder =
      CfnTemplate.GaugeChartOptionsProperty.builder()

  /**
   * @param arc The arc configuration of a `GaugeChartVisual` .
   */
  public fun arc(arc: IResolvable) {
    cdkBuilder.arc(arc)
  }

  /**
   * @param arc The arc configuration of a `GaugeChartVisual` .
   */
  public fun arc(arc: CfnTemplate.ArcConfigurationProperty) {
    cdkBuilder.arc(arc)
  }

  /**
   * @param arcAxis The arc axis configuration of a `GaugeChartVisual` .
   */
  public fun arcAxis(arcAxis: IResolvable) {
    cdkBuilder.arcAxis(arcAxis)
  }

  /**
   * @param arcAxis The arc axis configuration of a `GaugeChartVisual` .
   */
  public fun arcAxis(arcAxis: CfnTemplate.ArcAxisConfigurationProperty) {
    cdkBuilder.arcAxis(arcAxis)
  }

  /**
   * @param comparison The comparison configuration of a `GaugeChartVisual` .
   */
  public fun comparison(comparison: IResolvable) {
    cdkBuilder.comparison(comparison)
  }

  /**
   * @param comparison The comparison configuration of a `GaugeChartVisual` .
   */
  public fun comparison(comparison: CfnTemplate.ComparisonConfigurationProperty) {
    cdkBuilder.comparison(comparison)
  }

  /**
   * @param primaryValueDisplayType The options that determine the primary value display type.
   */
  public fun primaryValueDisplayType(primaryValueDisplayType: String) {
    cdkBuilder.primaryValueDisplayType(primaryValueDisplayType)
  }

  /**
   * @param primaryValueFontConfiguration The options that determine the primary value font
   * configuration.
   */
  public fun primaryValueFontConfiguration(primaryValueFontConfiguration: IResolvable) {
    cdkBuilder.primaryValueFontConfiguration(primaryValueFontConfiguration)
  }

  /**
   * @param primaryValueFontConfiguration The options that determine the primary value font
   * configuration.
   */
  public
      fun primaryValueFontConfiguration(primaryValueFontConfiguration: CfnTemplate.FontConfigurationProperty) {
    cdkBuilder.primaryValueFontConfiguration(primaryValueFontConfiguration)
  }

  public fun build(): CfnTemplate.GaugeChartOptionsProperty = cdkBuilder.build()
}
