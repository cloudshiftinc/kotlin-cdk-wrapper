@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The configuration of a header or footer section.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * HeaderFooterSectionConfigurationProperty headerFooterSectionConfigurationProperty =
 * HeaderFooterSectionConfigurationProperty.builder()
 * .layout(SectionLayoutConfigurationProperty.builder()
 * .freeFormLayout(FreeFormSectionLayoutConfigurationProperty.builder()
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
 * .build())
 * .build())
 * .sectionId("sectionId")
 * // the properties below are optional
 * .style(SectionStyleProperty.builder()
 * .height("height")
 * .padding(SpacingProperty.builder()
 * .bottom("bottom")
 * .left("left")
 * .right("right")
 * .top("top")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-headerfootersectionconfiguration.html)
 */
@CdkDslMarker
public class CfnTemplateHeaderFooterSectionConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.HeaderFooterSectionConfigurationProperty.Builder =
        CfnTemplate.HeaderFooterSectionConfigurationProperty.builder()

    /** @param layout The layout configuration of the header or footer section. */
    public fun layout(layout: IResolvable) {
        cdkBuilder.layout(layout)
    }

    /** @param layout The layout configuration of the header or footer section. */
    public fun layout(layout: CfnTemplate.SectionLayoutConfigurationProperty) {
        cdkBuilder.layout(layout)
    }

    /** @param sectionId The unique identifier of the header or footer section. */
    public fun sectionId(sectionId: String) {
        cdkBuilder.sectionId(sectionId)
    }

    /** @param style The style options of a header or footer section. */
    public fun style(style: IResolvable) {
        cdkBuilder.style(style)
    }

    /** @param style The style options of a header or footer section. */
    public fun style(style: CfnTemplate.SectionStyleProperty) {
        cdkBuilder.style(style)
    }

    public fun build(): CfnTemplate.HeaderFooterSectionConfigurationProperty = cdkBuilder.build()
}
