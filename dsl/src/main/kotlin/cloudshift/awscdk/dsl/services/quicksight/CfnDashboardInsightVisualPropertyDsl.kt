@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * An insight visual.
 *
 * For more information, see [Working with
 * insights](https://docs.aws.amazon.com/quicksight/latest/user/computational-insights.html) in the
 * *Amazon QuickSight User Guide* .
 *
 * Example:
 *
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-insightvisual.html)
 */
@CdkDslMarker
public class CfnDashboardInsightVisualPropertyDsl {
  private val cdkBuilder: CfnDashboard.InsightVisualProperty.Builder =
      CfnDashboard.InsightVisualProperty.builder()

  private val _actions: MutableList<Any> = mutableListOf()

  /**
   * @param actions The list of custom actions that are configured for a visual.
   */
  public fun actions(vararg actions: Any) {
    _actions.addAll(listOf(*actions))
  }

  /**
   * @param actions The list of custom actions that are configured for a visual.
   */
  public fun actions(actions: Collection<Any>) {
    _actions.addAll(actions)
  }

  /**
   * @param actions The list of custom actions that are configured for a visual.
   */
  public fun actions(actions: IResolvable) {
    cdkBuilder.actions(actions)
  }

  /**
   * @param dataSetIdentifier The dataset that is used in the insight visual. 
   */
  public fun dataSetIdentifier(dataSetIdentifier: String) {
    cdkBuilder.dataSetIdentifier(dataSetIdentifier)
  }

  /**
   * @param insightConfiguration The configuration of an insight visual.
   */
  public fun insightConfiguration(insightConfiguration: IResolvable) {
    cdkBuilder.insightConfiguration(insightConfiguration)
  }

  /**
   * @param insightConfiguration The configuration of an insight visual.
   */
  public fun insightConfiguration(insightConfiguration: CfnDashboard.InsightConfigurationProperty) {
    cdkBuilder.insightConfiguration(insightConfiguration)
  }

  /**
   * @param subtitle The subtitle that is displayed on the visual.
   */
  public fun subtitle(subtitle: IResolvable) {
    cdkBuilder.subtitle(subtitle)
  }

  /**
   * @param subtitle The subtitle that is displayed on the visual.
   */
  public fun subtitle(subtitle: CfnDashboard.VisualSubtitleLabelOptionsProperty) {
    cdkBuilder.subtitle(subtitle)
  }

  /**
   * @param title The title that is displayed on the visual.
   */
  public fun title(title: IResolvable) {
    cdkBuilder.title(title)
  }

  /**
   * @param title The title that is displayed on the visual.
   */
  public fun title(title: CfnDashboard.VisualTitleLabelOptionsProperty) {
    cdkBuilder.title(title)
  }

  /**
   * @param visualId The unique identifier of a visual. 
   * This identifier must be unique within the context of a dashboard, template, or analysis. Two
   * dashboards, analyses, or templates can have visuals with the same identifiers.
   */
  public fun visualId(visualId: String) {
    cdkBuilder.visualId(visualId)
  }

  public fun build(): CfnDashboard.InsightVisualProperty {
    if(_actions.isNotEmpty()) cdkBuilder.actions(_actions)
    return cdkBuilder.build()
  }
}
