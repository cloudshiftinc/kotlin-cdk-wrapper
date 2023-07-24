@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * The configuration for a section-based layout.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * SectionBasedLayoutConfigurationProperty sectionBasedLayoutConfigurationProperty =
 * SectionBasedLayoutConfigurationProperty.builder()
 * .bodySections(List.of(BodySectionConfigurationProperty.builder()
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
 * .build()))
 * .canvasSizeOptions(SectionBasedLayoutCanvasSizeOptionsProperty.builder()
 * .paperCanvasSizeOptions(SectionBasedLayoutPaperCanvasSizeOptionsProperty.builder()
 * .paperMargin(SpacingProperty.builder()
 * .bottom("bottom")
 * .left("left")
 * .right("right")
 * .top("top")
 * .build())
 * .paperOrientation("paperOrientation")
 * .paperSize("paperSize")
 * .build())
 * .build())
 * .footerSections(List.of(HeaderFooterSectionConfigurationProperty.builder()
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
 * .build()))
 * .headerSections(List.of(HeaderFooterSectionConfigurationProperty.builder()
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
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-sectionbasedlayoutconfiguration.html)
 */
@CdkDslMarker
public class CfnDashboardSectionBasedLayoutConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.SectionBasedLayoutConfigurationProperty.Builder =
        CfnDashboard.SectionBasedLayoutConfigurationProperty.builder()

    private val _bodySections: MutableList<Any> = mutableListOf()

    private val _footerSections: MutableList<Any> = mutableListOf()

    private val _headerSections: MutableList<Any> = mutableListOf()

    /**
     * @param bodySections A list of body section configurations.
     */
    public fun bodySections(vararg bodySections: Any) {
        _bodySections.addAll(listOf(*bodySections))
    }

    /**
     * @param bodySections A list of body section configurations.
     */
    public fun bodySections(bodySections: Collection<Any>) {
        _bodySections.addAll(bodySections)
    }

    /**
     * @param bodySections A list of body section configurations.
     */
    public fun bodySections(bodySections: IResolvable) {
        cdkBuilder.bodySections(bodySections)
    }

    /**
     * @param canvasSizeOptions The options for the canvas of a section-based layout.
     */
    public fun canvasSizeOptions(canvasSizeOptions: IResolvable) {
        cdkBuilder.canvasSizeOptions(canvasSizeOptions)
    }

    /**
     * @param canvasSizeOptions The options for the canvas of a section-based layout.
     */
    public fun canvasSizeOptions(canvasSizeOptions: CfnDashboard.SectionBasedLayoutCanvasSizeOptionsProperty) {
        cdkBuilder.canvasSizeOptions(canvasSizeOptions)
    }

    /**
     * @param footerSections A list of footer section configurations.
     */
    public fun footerSections(vararg footerSections: Any) {
        _footerSections.addAll(listOf(*footerSections))
    }

    /**
     * @param footerSections A list of footer section configurations.
     */
    public fun footerSections(footerSections: Collection<Any>) {
        _footerSections.addAll(footerSections)
    }

    /**
     * @param footerSections A list of footer section configurations.
     */
    public fun footerSections(footerSections: IResolvable) {
        cdkBuilder.footerSections(footerSections)
    }

    /**
     * @param headerSections A list of header section configurations.
     */
    public fun headerSections(vararg headerSections: Any) {
        _headerSections.addAll(listOf(*headerSections))
    }

    /**
     * @param headerSections A list of header section configurations.
     */
    public fun headerSections(headerSections: Collection<Any>) {
        _headerSections.addAll(headerSections)
    }

    /**
     * @param headerSections A list of header section configurations.
     */
    public fun headerSections(headerSections: IResolvable) {
        cdkBuilder.headerSections(headerSections)
    }

    public fun build(): CfnDashboard.SectionBasedLayoutConfigurationProperty {
        if (_bodySections.isNotEmpty()) cdkBuilder.bodySections(_bodySections)
        if (_footerSections.isNotEmpty()) cdkBuilder.footerSections(_footerSections)
        if (_headerSections.isNotEmpty()) cdkBuilder.headerSections(_headerSections)
        return cdkBuilder.build()
    }
}
