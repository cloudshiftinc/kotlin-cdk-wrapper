@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnTheme
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnThemeDataColorPalettePropertyDsl {
    private val cdkBuilder: CfnTheme.DataColorPaletteProperty.Builder =
        CfnTheme.DataColorPaletteProperty.builder()

    private val _colors: MutableList<String> = mutableListOf()

    private val _minMaxGradient: MutableList<String> = mutableListOf()

    public fun colors(vararg colors: String) {
        _colors.addAll(listOf(*colors))
    }

    public fun colors(colors: Collection<String>) {
        _colors.addAll(colors)
    }

    public fun emptyFillColor(emptyFillColor: String) {
        cdkBuilder.emptyFillColor(emptyFillColor)
    }

    public fun minMaxGradient(vararg minMaxGradient: String) {
        _minMaxGradient.addAll(listOf(*minMaxGradient))
    }

    public fun minMaxGradient(minMaxGradient: Collection<String>) {
        _minMaxGradient.addAll(minMaxGradient)
    }

    public fun build(): CfnTheme.DataColorPaletteProperty {
        if (_colors.isNotEmpty()) cdkBuilder.colors(_colors)
        if (_minMaxGradient.isNotEmpty()) cdkBuilder.minMaxGradient(_minMaxGradient)
        return cdkBuilder.build()
    }
}
