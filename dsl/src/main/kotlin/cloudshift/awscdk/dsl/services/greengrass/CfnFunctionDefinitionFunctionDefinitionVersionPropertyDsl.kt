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

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinition
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnFunctionDefinitionFunctionDefinitionVersionPropertyDsl {
    private val cdkBuilder: CfnFunctionDefinition.FunctionDefinitionVersionProperty.Builder =
        CfnFunctionDefinition.FunctionDefinitionVersionProperty.builder()

    private val _functions: MutableList<Any> = mutableListOf()

    public fun defaultConfig(defaultConfig: IResolvable) {
        cdkBuilder.defaultConfig(defaultConfig)
    }

    public fun defaultConfig(defaultConfig: CfnFunctionDefinition.DefaultConfigProperty) {
        cdkBuilder.defaultConfig(defaultConfig)
    }

    public fun functions(vararg functions: Any) {
        _functions.addAll(listOf(*functions))
    }

    public fun functions(functions: Collection<Any>) {
        _functions.addAll(functions)
    }

    public fun functions(functions: IResolvable) {
        cdkBuilder.functions(functions)
    }

    public fun build(): CfnFunctionDefinition.FunctionDefinitionVersionProperty {
        if (_functions.isNotEmpty()) cdkBuilder.functions(_functions)
        return cdkBuilder.build()
    }
}
