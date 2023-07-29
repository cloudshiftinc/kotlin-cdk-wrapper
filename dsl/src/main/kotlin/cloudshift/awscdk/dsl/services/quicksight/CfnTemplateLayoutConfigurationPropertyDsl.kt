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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The configuration that determines what the type of layout will be used on a sheet.
 *
 * This is a union type structure. For this structure to be valid, only one of the attributes can be
 * defined.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * LayoutConfigurationProperty layoutConfigurationProperty = LayoutConfigurationProperty.builder()
 * .freeFormLayout(FreeFormLayoutConfigurationProperty.builder()
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
 * // the properties below are optional
 * .canvasSizeOptions(FreeFormLayoutCanvasSizeOptionsProperty.builder()
 * .screenCanvasSizeOptions(FreeFormLayoutScreenCanvasSizeOptionsProperty.builder()
 * .optimizedViewPortWidth("optimizedViewPortWidth")
 * .build())
 * .build())
 * .build())
 * .gridLayout(GridLayoutConfigurationProperty.builder()
 * .elements(List.of(GridLayoutElementProperty.builder()
 * .columnSpan(123)
 * .elementId("elementId")
 * .elementType("elementType")
 * .rowSpan(123)
 * // the properties below are optional
 * .columnIndex(123)
 * .rowIndex(123)
 * .build()))
 * // the properties below are optional
 * .canvasSizeOptions(GridLayoutCanvasSizeOptionsProperty.builder()
 * .screenCanvasSizeOptions(GridLayoutScreenCanvasSizeOptionsProperty.builder()
 * .resizeOption("resizeOption")
 * // the properties below are optional
 * .optimizedViewPortWidth("optimizedViewPortWidth")
 * .build())
 * .build())
 * .build())
 * .sectionBasedLayout(SectionBasedLayoutConfigurationProperty.builder()
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
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-layoutconfiguration.html)
 */
@CdkDslMarker
public class CfnTemplateLayoutConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.LayoutConfigurationProperty.Builder =
        CfnTemplate.LayoutConfigurationProperty.builder()

    /**
     * @param freeFormLayout A free-form is optimized for a fixed width and has more control over
     *   the exact placement of layout elements.
     */
    public fun freeFormLayout(freeFormLayout: IResolvable) {
        cdkBuilder.freeFormLayout(freeFormLayout)
    }

    /**
     * @param freeFormLayout A free-form is optimized for a fixed width and has more control over
     *   the exact placement of layout elements.
     */
    public fun freeFormLayout(freeFormLayout: CfnTemplate.FreeFormLayoutConfigurationProperty) {
        cdkBuilder.freeFormLayout(freeFormLayout)
    }

    /**
     * @param gridLayout A type of layout that can be used on a sheet. In a grid layout, visuals
     *   snap to a grid with standard spacing and alignment. Dashboards are displayed as designed,
     *   with options to fit to screen or view at actual size. A grid layout can be configured to
     *   behave in one of two ways when the viewport is resized: `FIXED` or `RESPONSIVE` .
     */
    public fun gridLayout(gridLayout: IResolvable) {
        cdkBuilder.gridLayout(gridLayout)
    }

    /**
     * @param gridLayout A type of layout that can be used on a sheet. In a grid layout, visuals
     *   snap to a grid with standard spacing and alignment. Dashboards are displayed as designed,
     *   with options to fit to screen or view at actual size. A grid layout can be configured to
     *   behave in one of two ways when the viewport is resized: `FIXED` or `RESPONSIVE` .
     */
    public fun gridLayout(gridLayout: CfnTemplate.GridLayoutConfigurationProperty) {
        cdkBuilder.gridLayout(gridLayout)
    }

    /**
     * @param sectionBasedLayout A section based layout organizes visuals into multiple sections and
     *   has customized header, footer and page break.
     */
    public fun sectionBasedLayout(sectionBasedLayout: IResolvable) {
        cdkBuilder.sectionBasedLayout(sectionBasedLayout)
    }

    /**
     * @param sectionBasedLayout A section based layout organizes visuals into multiple sections and
     *   has customized header, footer and page break.
     */
    public fun sectionBasedLayout(
        sectionBasedLayout: CfnTemplate.SectionBasedLayoutConfigurationProperty
    ) {
        cdkBuilder.sectionBasedLayout(sectionBasedLayout)
    }

    public fun build(): CfnTemplate.LayoutConfigurationProperty = cdkBuilder.build()
}
