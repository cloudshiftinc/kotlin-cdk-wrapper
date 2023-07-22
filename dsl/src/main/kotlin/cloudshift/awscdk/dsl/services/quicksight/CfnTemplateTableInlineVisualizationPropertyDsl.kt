@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The inline visualization of a specific type to display within a chart.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TableInlineVisualizationProperty tableInlineVisualizationProperty =
 * TableInlineVisualizationProperty.builder()
 * .dataBars(DataBarsOptionsProperty.builder()
 * .fieldId("fieldId")
 * // the properties below are optional
 * .negativeColor("negativeColor")
 * .positiveColor("positiveColor")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-tableinlinevisualization.html)
 */
@CdkDslMarker
public class CfnTemplateTableInlineVisualizationPropertyDsl {
  private val cdkBuilder: CfnTemplate.TableInlineVisualizationProperty.Builder =
      CfnTemplate.TableInlineVisualizationProperty.builder()

  /**
   * @param dataBars The configuration of the inline visualization of the data bars within a chart.
   */
  public fun dataBars(dataBars: IResolvable) {
    cdkBuilder.dataBars(dataBars)
  }

  /**
   * @param dataBars The configuration of the inline visualization of the data bars within a chart.
   */
  public fun dataBars(dataBars: CfnTemplate.DataBarsOptionsProperty) {
    cdkBuilder.dataBars(dataBars)
  }

  public fun build(): CfnTemplate.TableInlineVisualizationProperty = cdkBuilder.build()
}
