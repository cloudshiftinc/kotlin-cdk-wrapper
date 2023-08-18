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

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * An element within a free-form layout.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * FreeFormLayoutElementProperty freeFormLayoutElementProperty =
 * FreeFormLayoutElementProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-freeformlayoutelement.html)
 */
@CdkDslMarker
public class CfnAnalysisFreeFormLayoutElementPropertyDsl {
    private val cdkBuilder: CfnAnalysis.FreeFormLayoutElementProperty.Builder =
        CfnAnalysis.FreeFormLayoutElementProperty.builder()

    private val _renderingRules: MutableList<Any> = mutableListOf()

    /** @param backgroundStyle The background style configuration of a free-form layout element. */
    public fun backgroundStyle(backgroundStyle: IResolvable) {
        cdkBuilder.backgroundStyle(backgroundStyle)
    }

    /** @param backgroundStyle The background style configuration of a free-form layout element. */
    public fun backgroundStyle(
        backgroundStyle: CfnAnalysis.FreeFormLayoutElementBackgroundStyleProperty
    ) {
        cdkBuilder.backgroundStyle(backgroundStyle)
    }

    /** @param borderStyle The border style configuration of a free-form layout element. */
    public fun borderStyle(borderStyle: IResolvable) {
        cdkBuilder.borderStyle(borderStyle)
    }

    /** @param borderStyle The border style configuration of a free-form layout element. */
    public fun borderStyle(borderStyle: CfnAnalysis.FreeFormLayoutElementBorderStyleProperty) {
        cdkBuilder.borderStyle(borderStyle)
    }

    /** @param elementId A unique identifier for an element within a free-form layout. */
    public fun elementId(elementId: String) {
        cdkBuilder.elementId(elementId)
    }

    /** @param elementType The type of element. */
    public fun elementType(elementType: String) {
        cdkBuilder.elementType(elementType)
    }

    /** @param height The height of an element within a free-form layout. */
    public fun height(height: String) {
        cdkBuilder.height(height)
    }

    /**
     * @param loadingAnimation The loading animation configuration of a free-form layout element.
     */
    public fun loadingAnimation(loadingAnimation: IResolvable) {
        cdkBuilder.loadingAnimation(loadingAnimation)
    }

    /**
     * @param loadingAnimation The loading animation configuration of a free-form layout element.
     */
    public fun loadingAnimation(loadingAnimation: CfnAnalysis.LoadingAnimationProperty) {
        cdkBuilder.loadingAnimation(loadingAnimation)
    }

    /**
     * @param renderingRules The rendering rules that determine when an element should be displayed
     *   within a free-form layout.
     */
    public fun renderingRules(vararg renderingRules: Any) {
        _renderingRules.addAll(listOf(*renderingRules))
    }

    /**
     * @param renderingRules The rendering rules that determine when an element should be displayed
     *   within a free-form layout.
     */
    public fun renderingRules(renderingRules: Collection<Any>) {
        _renderingRules.addAll(renderingRules)
    }

    /**
     * @param renderingRules The rendering rules that determine when an element should be displayed
     *   within a free-form layout.
     */
    public fun renderingRules(renderingRules: IResolvable) {
        cdkBuilder.renderingRules(renderingRules)
    }

    /**
     * @param selectedBorderStyle The border style configuration of a free-form layout element. This
     *   border style is used when the element is selected.
     */
    public fun selectedBorderStyle(selectedBorderStyle: IResolvable) {
        cdkBuilder.selectedBorderStyle(selectedBorderStyle)
    }

    /**
     * @param selectedBorderStyle The border style configuration of a free-form layout element. This
     *   border style is used when the element is selected.
     */
    public fun selectedBorderStyle(
        selectedBorderStyle: CfnAnalysis.FreeFormLayoutElementBorderStyleProperty
    ) {
        cdkBuilder.selectedBorderStyle(selectedBorderStyle)
    }

    /** @param visibility The visibility of an element within a free-form layout. */
    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    /** @param width The width of an element within a free-form layout. */
    public fun width(width: String) {
        cdkBuilder.width(width)
    }

    /** @param xAxisLocation The x-axis coordinate of the element. */
    public fun xAxisLocation(xAxisLocation: String) {
        cdkBuilder.xAxisLocation(xAxisLocation)
    }

    /** @param yAxisLocation The y-axis coordinate of the element. */
    public fun yAxisLocation(yAxisLocation: String) {
        cdkBuilder.yAxisLocation(yAxisLocation)
    }

    public fun build(): CfnAnalysis.FreeFormLayoutElementProperty {
        if (_renderingRules.isNotEmpty()) cdkBuilder.renderingRules(_renderingRules)
        return cdkBuilder.build()
    }
}
