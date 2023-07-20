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

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.gamelift.CfnFleet
import kotlin.Any
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnFleetRuntimeConfigurationPropertyDsl {
    private val cdkBuilder: CfnFleet.RuntimeConfigurationProperty.Builder =
        CfnFleet.RuntimeConfigurationProperty.builder()

    private val _serverProcesses: MutableList<Any> = mutableListOf()

    public fun gameSessionActivationTimeoutSeconds(gameSessionActivationTimeoutSeconds: Number) {
        cdkBuilder.gameSessionActivationTimeoutSeconds(gameSessionActivationTimeoutSeconds)
    }

    public fun maxConcurrentGameSessionActivations(maxConcurrentGameSessionActivations: Number) {
        cdkBuilder.maxConcurrentGameSessionActivations(maxConcurrentGameSessionActivations)
    }

    public fun serverProcesses(vararg serverProcesses: Any) {
        _serverProcesses.addAll(listOf(*serverProcesses))
    }

    public fun serverProcesses(serverProcesses: Collection<Any>) {
        _serverProcesses.addAll(serverProcesses)
    }

    public fun serverProcesses(serverProcesses: IResolvable) {
        cdkBuilder.serverProcesses(serverProcesses)
    }

    public fun build(): CfnFleet.RuntimeConfigurationProperty {
        if (_serverProcesses.isNotEmpty()) cdkBuilder.serverProcesses(_serverProcesses)
        return cdkBuilder.build()
    }
}
