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
 * The visual display options for the visual palette.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * VisualPaletteProperty visualPaletteProperty = VisualPaletteProperty.builder()
 * .chartColor("chartColor")
 * .colorMap(List.of(DataPathColorProperty.builder()
 * .color("color")
 * .element(DataPathValueProperty.builder()
 * .fieldId("fieldId")
 * .fieldValue("fieldValue")
 * .build())
 * // the properties below are optional
 * .timeGranularity("timeGranularity")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-visualpalette.html)
 */
@CdkDslMarker
public class CfnAnalysisVisualPalettePropertyDsl {
    private val cdkBuilder: CfnAnalysis.VisualPaletteProperty.Builder =
        CfnAnalysis.VisualPaletteProperty.builder()

    private val _colorMap: MutableList<Any> = mutableListOf()

    /** @param chartColor The chart color options for the visual palette. */
    public fun chartColor(chartColor: String) {
        cdkBuilder.chartColor(chartColor)
    }

    /** @param colorMap The color map options for the visual palette. */
    public fun colorMap(vararg colorMap: Any) {
        _colorMap.addAll(listOf(*colorMap))
    }

    /** @param colorMap The color map options for the visual palette. */
    public fun colorMap(colorMap: Collection<Any>) {
        _colorMap.addAll(colorMap)
    }

    /** @param colorMap The color map options for the visual palette. */
    public fun colorMap(colorMap: IResolvable) {
        cdkBuilder.colorMap(colorMap)
    }

    public fun build(): CfnAnalysis.VisualPaletteProperty {
        if (_colorMap.isNotEmpty()) cdkBuilder.colorMap(_colorMap)
        return cdkBuilder.build()
    }
}
