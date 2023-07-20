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

package cloudshift.awscdk.dsl.services.iottwinmaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iottwinmaker.CfnComponentType
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnComponentTypeFunctionPropertyDsl {
    private val cdkBuilder: CfnComponentType.FunctionProperty.Builder =
        CfnComponentType.FunctionProperty.builder()

    private val _requiredProperties: MutableList<String> = mutableListOf()

    public fun implementedBy(implementedBy: IResolvable) {
        cdkBuilder.implementedBy(implementedBy)
    }

    public fun implementedBy(implementedBy: CfnComponentType.DataConnectorProperty) {
        cdkBuilder.implementedBy(implementedBy)
    }

    public fun requiredProperties(vararg requiredProperties: String) {
        _requiredProperties.addAll(listOf(*requiredProperties))
    }

    public fun requiredProperties(requiredProperties: Collection<String>) {
        _requiredProperties.addAll(requiredProperties)
    }

    public fun scope(scope: String) {
        cdkBuilder.scope(scope)
    }

    public fun build(): CfnComponentType.FunctionProperty {
        if (_requiredProperties.isNotEmpty()) cdkBuilder.requiredProperties(_requiredProperties)
        return cdkBuilder.build()
    }
}
