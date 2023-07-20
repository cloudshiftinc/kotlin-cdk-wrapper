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
import software.amazon.awscdk.services.ecs.CfnTaskDefinition
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTaskDefinitionHealthCheckPropertyDsl {
    private val cdkBuilder: CfnTaskDefinition.HealthCheckProperty.Builder =
        CfnTaskDefinition.HealthCheckProperty.builder()

    private val _command: MutableList<String> = mutableListOf()

    public fun command(vararg command: String) {
        _command.addAll(listOf(*command))
    }

    public fun command(command: Collection<String>) {
        _command.addAll(command)
    }

    public fun interval(interval: Number) {
        cdkBuilder.interval(interval)
    }

    public fun retries(retries: Number) {
        cdkBuilder.retries(retries)
    }

    public fun startPeriod(startPeriod: Number) {
        cdkBuilder.startPeriod(startPeriod)
    }

    public fun timeout(timeout: Number) {
        cdkBuilder.timeout(timeout)
    }

    public fun build(): CfnTaskDefinition.HealthCheckProperty {
        if (_command.isNotEmpty()) cdkBuilder.command(_command)
        return cdkBuilder.build()
    }
}
