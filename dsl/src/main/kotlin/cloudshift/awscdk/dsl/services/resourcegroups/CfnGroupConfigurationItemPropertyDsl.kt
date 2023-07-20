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

package cloudshift.awscdk.dsl.services.resourcegroups

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.resourcegroups.CfnGroup
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnGroupConfigurationItemPropertyDsl {
    private val cdkBuilder: CfnGroup.ConfigurationItemProperty.Builder =
        CfnGroup.ConfigurationItemProperty.builder()

    private val _parameters: MutableList<Any> = mutableListOf()

    public fun parameters(vararg parameters: Any) {
        _parameters.addAll(listOf(*parameters))
    }

    public fun parameters(parameters: Collection<Any>) {
        _parameters.addAll(parameters)
    }

    public fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnGroup.ConfigurationItemProperty {
        if (_parameters.isNotEmpty()) cdkBuilder.parameters(_parameters)
        return cdkBuilder.build()
    }
}
