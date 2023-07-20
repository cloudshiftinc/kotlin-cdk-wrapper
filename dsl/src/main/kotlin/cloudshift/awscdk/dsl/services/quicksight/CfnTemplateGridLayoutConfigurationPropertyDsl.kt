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
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTemplateGridLayoutConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.GridLayoutConfigurationProperty.Builder =
        CfnTemplate.GridLayoutConfigurationProperty.builder()

    private val _elements: MutableList<Any> = mutableListOf()

    public fun canvasSizeOptions(canvasSizeOptions: IResolvable) {
        cdkBuilder.canvasSizeOptions(canvasSizeOptions)
    }

    public fun canvasSizeOptions(canvasSizeOptions: CfnTemplate.GridLayoutCanvasSizeOptionsProperty) {
        cdkBuilder.canvasSizeOptions(canvasSizeOptions)
    }

    public fun elements(vararg elements: Any) {
        _elements.addAll(listOf(*elements))
    }

    public fun elements(elements: Collection<Any>) {
        _elements.addAll(elements)
    }

    public fun elements(elements: IResolvable) {
        cdkBuilder.elements(elements)
    }

    public fun build(): CfnTemplate.GridLayoutConfigurationProperty {
        if (_elements.isNotEmpty()) cdkBuilder.elements(_elements)
        return cdkBuilder.build()
    }
}
