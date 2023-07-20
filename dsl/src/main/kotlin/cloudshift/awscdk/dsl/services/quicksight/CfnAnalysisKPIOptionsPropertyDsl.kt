@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisKPIOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.KPIOptionsProperty.Builder =
      CfnAnalysis.KPIOptionsProperty.builder()

  public fun comparison(comparison: IResolvable) {
    cdkBuilder.comparison(comparison)
  }

  public fun comparison(comparison: CfnAnalysis.ComparisonConfigurationProperty) {
    cdkBuilder.comparison(comparison)
  }

  public fun primaryValueDisplayType(primaryValueDisplayType: String) {
    cdkBuilder.primaryValueDisplayType(primaryValueDisplayType)
  }

  public fun primaryValueFontConfiguration(primaryValueFontConfiguration: IResolvable) {
    cdkBuilder.primaryValueFontConfiguration(primaryValueFontConfiguration)
  }

  public
      fun primaryValueFontConfiguration(primaryValueFontConfiguration: CfnAnalysis.FontConfigurationProperty) {
    cdkBuilder.primaryValueFontConfiguration(primaryValueFontConfiguration)
  }

  public fun progressBar(progressBar: IResolvable) {
    cdkBuilder.progressBar(progressBar)
  }

  public fun progressBar(progressBar: CfnAnalysis.ProgressBarOptionsProperty) {
    cdkBuilder.progressBar(progressBar)
  }

  public fun secondaryValue(secondaryValue: IResolvable) {
    cdkBuilder.secondaryValue(secondaryValue)
  }

  public fun secondaryValue(secondaryValue: CfnAnalysis.SecondaryValueOptionsProperty) {
    cdkBuilder.secondaryValue(secondaryValue)
  }

  public fun secondaryValueFontConfiguration(secondaryValueFontConfiguration: IResolvable) {
    cdkBuilder.secondaryValueFontConfiguration(secondaryValueFontConfiguration)
  }

  public
      fun secondaryValueFontConfiguration(secondaryValueFontConfiguration: CfnAnalysis.FontConfigurationProperty) {
    cdkBuilder.secondaryValueFontConfiguration(secondaryValueFontConfiguration)
  }

  public fun trendArrows(trendArrows: IResolvable) {
    cdkBuilder.trendArrows(trendArrows)
  }

  public fun trendArrows(trendArrows: CfnAnalysis.TrendArrowOptionsProperty) {
    cdkBuilder.trendArrows(trendArrows)
  }

  public fun build(): CfnAnalysis.KPIOptionsProperty = cdkBuilder.build()
}
