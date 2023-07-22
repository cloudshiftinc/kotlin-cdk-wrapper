@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The free-form layout configuration of a section.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * FreeFormSectionLayoutConfigurationProperty freeFormSectionLayoutConfigurationProperty =
 * FreeFormSectionLayoutConfigurationProperty.builder()
 * .elements(List.of(FreeFormLayoutElementProperty.builder()
 * .elementId("elementId")
 * .elementType("elementType")
 * .height("height")
 * .width("width")
 * .xAxisLocation("xAxisLocation")
 * .yAxisLocation("yAxisLocation")
 * // the properties below are optional
 * .backgroundStyle(FreeFormLayoutElementBackgroundStyleProperty.builder()
 * .color("color")
 * .visibility("visibility")
 * .build())
 * .borderStyle(FreeFormLayoutElementBorderStyleProperty.builder()
 * .color("color")
 * .visibility("visibility")
 * .build())
 * .loadingAnimation(LoadingAnimationProperty.builder()
 * .visibility("visibility")
 * .build())
 * .renderingRules(List.of(SheetElementRenderingRuleProperty.builder()
 * .configurationOverrides(SheetElementConfigurationOverridesProperty.builder()
 * .visibility("visibility")
 * .build())
 * .expression("expression")
 * .build()))
 * .selectedBorderStyle(FreeFormLayoutElementBorderStyleProperty.builder()
 * .color("color")
 * .visibility("visibility")
 * .build())
 * .visibility("visibility")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-freeformsectionlayoutconfiguration.html)
 */
@CdkDslMarker
public class CfnAnalysisFreeFormSectionLayoutConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.FreeFormSectionLayoutConfigurationProperty.Builder =
      CfnAnalysis.FreeFormSectionLayoutConfigurationProperty.builder()

  private val _elements: MutableList<Any> = mutableListOf()

  /**
   * @param elements The elements that are included in the free-form layout. 
   */
  public fun elements(vararg elements: Any) {
    _elements.addAll(listOf(*elements))
  }

  /**
   * @param elements The elements that are included in the free-form layout. 
   */
  public fun elements(elements: Collection<Any>) {
    _elements.addAll(elements)
  }

  /**
   * @param elements The elements that are included in the free-form layout. 
   */
  public fun elements(elements: IResolvable) {
    cdkBuilder.elements(elements)
  }

  public fun build(): CfnAnalysis.FreeFormSectionLayoutConfigurationProperty {
    if(_elements.isNotEmpty()) cdkBuilder.elements(_elements)
    return cdkBuilder.build()
  }
}
