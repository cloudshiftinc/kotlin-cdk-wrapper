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

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnCalculatedAttributeDefinitionAttributeDetailsPropertyDsl {
    private val cdkBuilder: CfnCalculatedAttributeDefinition.AttributeDetailsProperty.Builder =
        CfnCalculatedAttributeDefinition.AttributeDetailsProperty.builder()

    private val _attributes: MutableList<Any> = mutableListOf()

    public fun attributes(vararg attributes: Any) {
        _attributes.addAll(listOf(*attributes))
    }

    public fun attributes(attributes: Collection<Any>) {
        _attributes.addAll(attributes)
    }

    public fun attributes(attributes: IResolvable) {
        cdkBuilder.attributes(attributes)
    }

    public fun expression(expression: String) {
        cdkBuilder.expression(expression)
    }

    public fun build(): CfnCalculatedAttributeDefinition.AttributeDetailsProperty {
        if (_attributes.isNotEmpty()) cdkBuilder.attributes(_attributes)
        return cdkBuilder.build()
    }
}
