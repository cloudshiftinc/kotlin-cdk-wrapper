@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisGaugeChartVisualPropertyDsl {
  private val cdkBuilder: CfnAnalysis.GaugeChartVisualProperty.Builder =
      CfnAnalysis.GaugeChartVisualProperty.builder()

  private val _actions: MutableList<Any> = mutableListOf()

  public fun actions(vararg actions: Any) {
    _actions.addAll(listOf(*actions))
  }

  public fun actions(actions: Collection<Any>) {
    _actions.addAll(actions)
  }

  public fun actions(actions: IResolvable) {
    cdkBuilder.actions(actions)
  }

  public fun chartConfiguration(chartConfiguration: IResolvable) {
    cdkBuilder.chartConfiguration(chartConfiguration)
  }

  public fun chartConfiguration(chartConfiguration: CfnAnalysis.GaugeChartConfigurationProperty) {
    cdkBuilder.chartConfiguration(chartConfiguration)
  }

  public fun conditionalFormatting(conditionalFormatting: IResolvable) {
    cdkBuilder.conditionalFormatting(conditionalFormatting)
  }

  public
      fun conditionalFormatting(conditionalFormatting: CfnAnalysis.GaugeChartConditionalFormattingProperty) {
    cdkBuilder.conditionalFormatting(conditionalFormatting)
  }

  public fun subtitle(subtitle: IResolvable) {
    cdkBuilder.subtitle(subtitle)
  }

  public fun subtitle(subtitle: CfnAnalysis.VisualSubtitleLabelOptionsProperty) {
    cdkBuilder.subtitle(subtitle)
  }

  public fun title(title: IResolvable) {
    cdkBuilder.title(title)
  }

  public fun title(title: CfnAnalysis.VisualTitleLabelOptionsProperty) {
    cdkBuilder.title(title)
  }

  public fun visualId(visualId: String) {
    cdkBuilder.visualId(visualId)
  }

  public fun build(): CfnAnalysis.GaugeChartVisualProperty {
    if(_actions.isNotEmpty()) cdkBuilder.actions(_actions)
    return cdkBuilder.build()
  }
}
