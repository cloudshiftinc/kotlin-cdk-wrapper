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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTemplateVisualPalettePropertyDsl {
    private val cdkBuilder: CfnTemplate.VisualPaletteProperty.Builder =
        CfnTemplate.VisualPaletteProperty.builder()

    private val _colorMap: MutableList<Any> = mutableListOf()

    public fun chartColor(chartColor: String) {
        cdkBuilder.chartColor(chartColor)
    }

    public fun colorMap(vararg colorMap: Any) {
        _colorMap.addAll(listOf(*colorMap))
    }

    public fun colorMap(colorMap: Collection<Any>) {
        _colorMap.addAll(colorMap)
    }

    public fun colorMap(colorMap: IResolvable) {
        cdkBuilder.colorMap(colorMap)
    }

    public fun build(): CfnTemplate.VisualPaletteProperty {
        if (_colorMap.isNotEmpty()) cdkBuilder.colorMap(_colorMap)
        return cdkBuilder.build()
    }
}
