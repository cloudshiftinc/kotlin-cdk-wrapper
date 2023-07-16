@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateKPIOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.KPIOptionsProperty.Builder =
      CfnTemplate.KPIOptionsProperty.builder()

  public fun comparison(comparison: IResolvable) {
    cdkBuilder.comparison(comparison)
  }

  public fun comparison(comparison: CfnTemplate.ComparisonConfigurationProperty) {
    cdkBuilder.comparison(comparison)
  }

  public fun primaryValueDisplayType(primaryValueDisplayType: String) {
    cdkBuilder.primaryValueDisplayType(primaryValueDisplayType)
  }

  public fun primaryValueFontConfiguration(primaryValueFontConfiguration: IResolvable) {
    cdkBuilder.primaryValueFontConfiguration(primaryValueFontConfiguration)
  }

  public
      fun primaryValueFontConfiguration(primaryValueFontConfiguration: CfnTemplate.FontConfigurationProperty) {
    cdkBuilder.primaryValueFontConfiguration(primaryValueFontConfiguration)
  }

  public fun progressBar(progressBar: IResolvable) {
    cdkBuilder.progressBar(progressBar)
  }

  public fun progressBar(progressBar: CfnTemplate.ProgressBarOptionsProperty) {
    cdkBuilder.progressBar(progressBar)
  }

  public fun secondaryValue(secondaryValue: IResolvable) {
    cdkBuilder.secondaryValue(secondaryValue)
  }

  public fun secondaryValue(secondaryValue: CfnTemplate.SecondaryValueOptionsProperty) {
    cdkBuilder.secondaryValue(secondaryValue)
  }

  public fun secondaryValueFontConfiguration(secondaryValueFontConfiguration: IResolvable) {
    cdkBuilder.secondaryValueFontConfiguration(secondaryValueFontConfiguration)
  }

  public
      fun secondaryValueFontConfiguration(secondaryValueFontConfiguration: CfnTemplate.FontConfigurationProperty) {
    cdkBuilder.secondaryValueFontConfiguration(secondaryValueFontConfiguration)
  }

  public fun trendArrows(trendArrows: IResolvable) {
    cdkBuilder.trendArrows(trendArrows)
  }

  public fun trendArrows(trendArrows: CfnTemplate.TrendArrowOptionsProperty) {
    cdkBuilder.trendArrows(trendArrows)
  }

  public fun build(): CfnTemplate.KPIOptionsProperty = cdkBuilder.build()
}
