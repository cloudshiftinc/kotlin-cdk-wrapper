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

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.imagebuilder.CfnImageRecipe
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnImageRecipeComponentParameterPropertyDsl {
    private val cdkBuilder: CfnImageRecipe.ComponentParameterProperty.Builder =
        CfnImageRecipe.ComponentParameterProperty.builder()

    private val _value: MutableList<String> = mutableListOf()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun `value`(vararg `value`: String) {
        _value.addAll(listOf(*`value`))
    }

    public fun `value`(`value`: Collection<String>) {
        _value.addAll(`value`)
    }

    public fun build(): CfnImageRecipe.ComponentParameterProperty {
        if (_value.isNotEmpty()) cdkBuilder.`value`(_value)
        return cdkBuilder.build()
    }
}
