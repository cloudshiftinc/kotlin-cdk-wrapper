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

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pipes.CfnPipe
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnPipeBatchContainerOverridesPropertyDsl {
    private val cdkBuilder: CfnPipe.BatchContainerOverridesProperty.Builder =
        CfnPipe.BatchContainerOverridesProperty.builder()

    private val _command: MutableList<String> = mutableListOf()

    private val _environment: MutableList<Any> = mutableListOf()

    private val _resourceRequirements: MutableList<Any> = mutableListOf()

    public fun command(vararg command: String) {
        _command.addAll(listOf(*command))
    }

    public fun command(command: Collection<String>) {
        _command.addAll(command)
    }

    public fun environment(vararg environment: Any) {
        _environment.addAll(listOf(*environment))
    }

    public fun environment(environment: Collection<Any>) {
        _environment.addAll(environment)
    }

    public fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment)
    }

    public fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
    }

    public fun resourceRequirements(vararg resourceRequirements: Any) {
        _resourceRequirements.addAll(listOf(*resourceRequirements))
    }

    public fun resourceRequirements(resourceRequirements: Collection<Any>) {
        _resourceRequirements.addAll(resourceRequirements)
    }

    public fun resourceRequirements(resourceRequirements: IResolvable) {
        cdkBuilder.resourceRequirements(resourceRequirements)
    }

    public fun build(): CfnPipe.BatchContainerOverridesProperty {
        if (_command.isNotEmpty()) cdkBuilder.command(_command)
        if (_environment.isNotEmpty()) cdkBuilder.environment(_environment)
        if (_resourceRequirements.isNotEmpty()) cdkBuilder.resourceRequirements(_resourceRequirements)
        return cdkBuilder.build()
    }
}
