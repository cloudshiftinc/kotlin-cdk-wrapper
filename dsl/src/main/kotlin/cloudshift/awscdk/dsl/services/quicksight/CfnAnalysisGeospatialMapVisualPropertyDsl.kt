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
public class CfnAnalysisGeospatialMapVisualPropertyDsl {
  private val cdkBuilder: CfnAnalysis.GeospatialMapVisualProperty.Builder =
      CfnAnalysis.GeospatialMapVisualProperty.builder()

  private val _actions: MutableList<Any> = mutableListOf()

  private val _columnHierarchies: MutableList<Any> = mutableListOf()

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
   * @param chartConfiguration The configuration settings of the visual.
   */
  public fun chartConfiguration(chartConfiguration: IResolvable) {
    cdkBuilder.chartConfiguration(chartConfiguration)
  }

  /**
   * @param chartConfiguration The configuration settings of the visual.
   */
  public
      fun chartConfiguration(chartConfiguration: CfnAnalysis.GeospatialMapConfigurationProperty) {
    cdkBuilder.chartConfiguration(chartConfiguration)
  }

  /**
   * @param columnHierarchies The column hierarchy that is used during drill-downs and drill-ups.
   */
  public fun columnHierarchies(vararg columnHierarchies: Any) {
    _columnHierarchies.addAll(listOf(*columnHierarchies))
  }

  /**
   * @param columnHierarchies The column hierarchy that is used during drill-downs and drill-ups.
   */
  public fun columnHierarchies(columnHierarchies: Collection<Any>) {
    _columnHierarchies.addAll(columnHierarchies)
  }

  /**
   * @param columnHierarchies The column hierarchy that is used during drill-downs and drill-ups.
   */
  public fun columnHierarchies(columnHierarchies: IResolvable) {
    cdkBuilder.columnHierarchies(columnHierarchies)
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
  public fun subtitle(subtitle: CfnAnalysis.VisualSubtitleLabelOptionsProperty) {
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
  public fun title(title: CfnAnalysis.VisualTitleLabelOptionsProperty) {
    cdkBuilder.title(title)
  }

  /**
   * @param visualId The unique identifier of a visual. 
   * This identifier must be unique within the context of a dashboard, template, or analysis. Two
   * dashboards, analyses, or templates can have visuals with the same identifiers..
   */
  public fun visualId(visualId: String) {
    cdkBuilder.visualId(visualId)
  }

  public fun build(): CfnAnalysis.GeospatialMapVisualProperty {
    if(_actions.isNotEmpty()) cdkBuilder.actions(_actions)
    if(_columnHierarchies.isNotEmpty()) cdkBuilder.columnHierarchies(_columnHierarchies)
    return cdkBuilder.build()
  }
}
