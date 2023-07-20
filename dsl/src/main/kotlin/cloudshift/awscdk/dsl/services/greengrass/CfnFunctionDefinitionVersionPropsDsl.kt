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
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersionProps
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnFunctionDefinitionVersionPropsDsl {
    private val cdkBuilder: CfnFunctionDefinitionVersionProps.Builder =
        CfnFunctionDefinitionVersionProps.builder()

    private val _functions: MutableList<Any> = mutableListOf()

    public fun defaultConfig(defaultConfig: IResolvable) {
        cdkBuilder.defaultConfig(defaultConfig)
    }

    public fun defaultConfig(defaultConfig: CfnFunctionDefinitionVersion.DefaultConfigProperty) {
        cdkBuilder.defaultConfig(defaultConfig)
    }

    public fun functionDefinitionId(functionDefinitionId: String) {
        cdkBuilder.functionDefinitionId(functionDefinitionId)
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

    public fun build(): CfnFunctionDefinitionVersionProps {
        if (_functions.isNotEmpty()) cdkBuilder.functions(_functions)
        return cdkBuilder.build()
    }
}
