@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The conditional formatting of a `FilledMapVisual` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * FilledMapConditionalFormattingProperty filledMapConditionalFormattingProperty =
 * FilledMapConditionalFormattingProperty.builder()
 * .conditionalFormattingOptions(List.of(FilledMapConditionalFormattingOptionProperty.builder()
 * .shape(FilledMapShapeConditionalFormattingProperty.builder()
 * .fieldId("fieldId")
 * // the properties below are optional
 * .format(ShapeConditionalFormatProperty.builder()
 * .backgroundColor(ConditionalFormattingColorProperty.builder()
 * .gradient(ConditionalFormattingGradientColorProperty.builder()
 * .color(GradientColorProperty.builder()
 * .stops(List.of(GradientStopProperty.builder()
 * .gradientOffset(123)
 * // the properties below are optional
 * .color("color")
 * .dataValue(123)
 * .build()))
 * .build())
 * .expression("expression")
 * .build())
 * .solid(ConditionalFormattingSolidColorProperty.builder()
 * .expression("expression")
 * // the properties below are optional
 * .color("color")
 * .build())
 * .build())
 * .build())
 * .build())
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-filledmapconditionalformatting.html)
 */
@CdkDslMarker
public class CfnTemplateFilledMapConditionalFormattingPropertyDsl {
  private val cdkBuilder: CfnTemplate.FilledMapConditionalFormattingProperty.Builder =
      CfnTemplate.FilledMapConditionalFormattingProperty.builder()

  private val _conditionalFormattingOptions: MutableList<Any> = mutableListOf()

  /**
   * @param conditionalFormattingOptions Conditional formatting options of a `FilledMapVisual` . 
   */
  public fun conditionalFormattingOptions(vararg conditionalFormattingOptions: Any) {
    _conditionalFormattingOptions.addAll(listOf(*conditionalFormattingOptions))
  }

  /**
   * @param conditionalFormattingOptions Conditional formatting options of a `FilledMapVisual` . 
   */
  public fun conditionalFormattingOptions(conditionalFormattingOptions: Collection<Any>) {
    _conditionalFormattingOptions.addAll(conditionalFormattingOptions)
  }

  /**
   * @param conditionalFormattingOptions Conditional formatting options of a `FilledMapVisual` . 
   */
  public fun conditionalFormattingOptions(conditionalFormattingOptions: IResolvable) {
    cdkBuilder.conditionalFormattingOptions(conditionalFormattingOptions)
  }

  public fun build(): CfnTemplate.FilledMapConditionalFormattingProperty {
    if(_conditionalFormattingOptions.isNotEmpty())
        cdkBuilder.conditionalFormattingOptions(_conditionalFormattingOptions)
    return cdkBuilder.build()
  }
}
