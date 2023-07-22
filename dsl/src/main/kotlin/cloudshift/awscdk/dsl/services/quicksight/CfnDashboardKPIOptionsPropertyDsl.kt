@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardKPIOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.KPIOptionsProperty.Builder =
      CfnDashboard.KPIOptionsProperty.builder()

  /**
   * @param comparison The comparison configuration of a KPI visual.
   */
  public fun comparison(comparison: IResolvable) {
    cdkBuilder.comparison(comparison)
  }

  /**
   * @param comparison The comparison configuration of a KPI visual.
   */
  public fun comparison(comparison: CfnDashboard.ComparisonConfigurationProperty) {
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
      fun primaryValueFontConfiguration(primaryValueFontConfiguration: CfnDashboard.FontConfigurationProperty) {
    cdkBuilder.primaryValueFontConfiguration(primaryValueFontConfiguration)
  }

  /**
   * @param progressBar The options that determine the presentation of the progress bar of a KPI
   * visual.
   */
  public fun progressBar(progressBar: IResolvable) {
    cdkBuilder.progressBar(progressBar)
  }

  /**
   * @param progressBar The options that determine the presentation of the progress bar of a KPI
   * visual.
   */
  public fun progressBar(progressBar: CfnDashboard.ProgressBarOptionsProperty) {
    cdkBuilder.progressBar(progressBar)
  }

  /**
   * @param secondaryValue The options that determine the presentation of the secondary value of a
   * KPI visual.
   */
  public fun secondaryValue(secondaryValue: IResolvable) {
    cdkBuilder.secondaryValue(secondaryValue)
  }

  /**
   * @param secondaryValue The options that determine the presentation of the secondary value of a
   * KPI visual.
   */
  public fun secondaryValue(secondaryValue: CfnDashboard.SecondaryValueOptionsProperty) {
    cdkBuilder.secondaryValue(secondaryValue)
  }

  /**
   * @param secondaryValueFontConfiguration The options that determine the secondary value font
   * configuration.
   */
  public fun secondaryValueFontConfiguration(secondaryValueFontConfiguration: IResolvable) {
    cdkBuilder.secondaryValueFontConfiguration(secondaryValueFontConfiguration)
  }

  /**
   * @param secondaryValueFontConfiguration The options that determine the secondary value font
   * configuration.
   */
  public
      fun secondaryValueFontConfiguration(secondaryValueFontConfiguration: CfnDashboard.FontConfigurationProperty) {
    cdkBuilder.secondaryValueFontConfiguration(secondaryValueFontConfiguration)
  }

  /**
   * @param trendArrows The options that determine the presentation of trend arrows in a KPI visual.
   */
  public fun trendArrows(trendArrows: IResolvable) {
    cdkBuilder.trendArrows(trendArrows)
  }

  /**
   * @param trendArrows The options that determine the presentation of trend arrows in a KPI visual.
   */
  public fun trendArrows(trendArrows: CfnDashboard.TrendArrowOptionsProperty) {
    cdkBuilder.trendArrows(trendArrows)
  }

  public fun build(): CfnDashboard.KPIOptionsProperty = cdkBuilder.build()
}
