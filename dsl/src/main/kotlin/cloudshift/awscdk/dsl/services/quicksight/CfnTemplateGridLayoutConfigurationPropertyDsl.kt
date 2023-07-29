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
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The configuration for a grid layout. Also called a tiled layout.
 *
 * Visuals snap to a grid with standard spacing and alignment. Dashboards are displayed as designed,
 * with options to fit to screen or view at actual size.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * GridLayoutConfigurationProperty gridLayoutConfigurationProperty =
 * GridLayoutConfigurationProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-gridlayoutconfiguration.html)
 */
@CdkDslMarker
public class CfnTemplateGridLayoutConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.GridLayoutConfigurationProperty.Builder =
        CfnTemplate.GridLayoutConfigurationProperty.builder()

    private val _elements: MutableList<Any> = mutableListOf()

    /** @param canvasSizeOptions the value to be set. */
    public fun canvasSizeOptions(canvasSizeOptions: IResolvable) {
        cdkBuilder.canvasSizeOptions(canvasSizeOptions)
    }

    /** @param canvasSizeOptions the value to be set. */
    public fun canvasSizeOptions(
        canvasSizeOptions: CfnTemplate.GridLayoutCanvasSizeOptionsProperty
    ) {
        cdkBuilder.canvasSizeOptions(canvasSizeOptions)
    }

    /** @param elements The elements that are included in a grid layout. */
    public fun elements(vararg elements: Any) {
        _elements.addAll(listOf(*elements))
    }

    /** @param elements The elements that are included in a grid layout. */
    public fun elements(elements: Collection<Any>) {
        _elements.addAll(elements)
    }

    /** @param elements The elements that are included in a grid layout. */
    public fun elements(elements: IResolvable) {
        cdkBuilder.elements(elements)
    }

    public fun build(): CfnTemplate.GridLayoutConfigurationProperty {
        if (_elements.isNotEmpty()) cdkBuilder.elements(_elements)
        return cdkBuilder.build()
    }
}
