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

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnService
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnServiceServiceConnectServicePropertyDsl {
    private val cdkBuilder: CfnService.ServiceConnectServiceProperty.Builder =
        CfnService.ServiceConnectServiceProperty.builder()

    private val _clientAliases: MutableList<Any> = mutableListOf()

    public fun clientAliases(vararg clientAliases: Any) {
        _clientAliases.addAll(listOf(*clientAliases))
    }

    public fun clientAliases(clientAliases: Collection<Any>) {
        _clientAliases.addAll(clientAliases)
    }

    public fun clientAliases(clientAliases: IResolvable) {
        cdkBuilder.clientAliases(clientAliases)
    }

    public fun discoveryName(discoveryName: String) {
        cdkBuilder.discoveryName(discoveryName)
    }

    public fun ingressPortOverride(ingressPortOverride: Number) {
        cdkBuilder.ingressPortOverride(ingressPortOverride)
    }

    public fun portName(portName: String) {
        cdkBuilder.portName(portName)
    }

    public fun build(): CfnService.ServiceConnectServiceProperty {
        if (_clientAliases.isNotEmpty()) cdkBuilder.clientAliases(_clientAliases)
        return cdkBuilder.build()
    }
}
