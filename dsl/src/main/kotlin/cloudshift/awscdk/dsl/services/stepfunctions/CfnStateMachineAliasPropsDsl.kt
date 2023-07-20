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

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias
import software.amazon.awscdk.services.stepfunctions.CfnStateMachineAliasProps
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnStateMachineAliasPropsDsl {
    private val cdkBuilder: CfnStateMachineAliasProps.Builder = CfnStateMachineAliasProps.builder()

    private val _routingConfiguration: MutableList<Any> = mutableListOf()

    public fun deploymentPreference(deploymentPreference: IResolvable) {
        cdkBuilder.deploymentPreference(deploymentPreference)
    }

    public fun deploymentPreference(deploymentPreference: CfnStateMachineAlias.DeploymentPreferenceProperty) {
        cdkBuilder.deploymentPreference(deploymentPreference)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun routingConfiguration(vararg routingConfiguration: Any) {
        _routingConfiguration.addAll(listOf(*routingConfiguration))
    }

    public fun routingConfiguration(routingConfiguration: Collection<Any>) {
        _routingConfiguration.addAll(routingConfiguration)
    }

    public fun routingConfiguration(routingConfiguration: IResolvable) {
        cdkBuilder.routingConfiguration(routingConfiguration)
    }

    public fun build(): CfnStateMachineAliasProps {
        if (_routingConfiguration.isNotEmpty()) cdkBuilder.routingConfiguration(_routingConfiguration)
        return cdkBuilder.build()
    }
}
