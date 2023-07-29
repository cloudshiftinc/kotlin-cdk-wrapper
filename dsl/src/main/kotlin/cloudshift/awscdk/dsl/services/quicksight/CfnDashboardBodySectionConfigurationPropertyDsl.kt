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
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The configuration of a body section.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * BodySectionConfigurationProperty bodySectionConfigurationProperty =
 * BodySectionConfigurationProperty.builder()
 * .content(BodySectionContentProperty.builder()
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
 * .build())
 * .sectionId("sectionId")
 * // the properties below are optional
 * .pageBreakConfiguration(SectionPageBreakConfigurationProperty.builder()
 * .after(SectionAfterPageBreakProperty.builder()
 * .status("status")
 * .build())
 * .build())
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-bodysectionconfiguration.html)
 */
@CdkDslMarker
public class CfnDashboardBodySectionConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.BodySectionConfigurationProperty.Builder =
        CfnDashboard.BodySectionConfigurationProperty.builder()

    /** @param content The configuration of content in a body section. */
    public fun content(content: IResolvable) {
        cdkBuilder.content(content)
    }

    /** @param content The configuration of content in a body section. */
    public fun content(content: CfnDashboard.BodySectionContentProperty) {
        cdkBuilder.content(content)
    }

    /** @param pageBreakConfiguration The configuration of a page break for a section. */
    public fun pageBreakConfiguration(pageBreakConfiguration: IResolvable) {
        cdkBuilder.pageBreakConfiguration(pageBreakConfiguration)
    }

    /** @param pageBreakConfiguration The configuration of a page break for a section. */
    public fun pageBreakConfiguration(
        pageBreakConfiguration: CfnDashboard.SectionPageBreakConfigurationProperty
    ) {
        cdkBuilder.pageBreakConfiguration(pageBreakConfiguration)
    }

    /** @param sectionId The unique identifier of a body section. */
    public fun sectionId(sectionId: String) {
        cdkBuilder.sectionId(sectionId)
    }

    /** @param style The style options of a body section. */
    public fun style(style: IResolvable) {
        cdkBuilder.style(style)
    }

    /** @param style The style options of a body section. */
    public fun style(style: CfnDashboard.SectionStyleProperty) {
        cdkBuilder.style(style)
    }

    public fun build(): CfnDashboard.BodySectionConfigurationProperty = cdkBuilder.build()
}
