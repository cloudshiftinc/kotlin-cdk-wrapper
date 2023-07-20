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

package cloudshift.awscdk.dsl.services.apprunner

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apprunner.CfnService
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnServiceCodeConfigurationValuesPropertyDsl {
    private val cdkBuilder: CfnService.CodeConfigurationValuesProperty.Builder =
        CfnService.CodeConfigurationValuesProperty.builder()

    private val _runtimeEnvironmentSecrets: MutableList<Any> = mutableListOf()

    private val _runtimeEnvironmentVariables: MutableList<Any> = mutableListOf()

    public fun buildCommand(buildCommand: String) {
        cdkBuilder.buildCommand(buildCommand)
    }

    public fun port(port: String) {
        cdkBuilder.port(port)
    }

    public fun runtime(runtime: String) {
        cdkBuilder.runtime(runtime)
    }

    public fun runtimeEnvironmentSecrets(vararg runtimeEnvironmentSecrets: Any) {
        _runtimeEnvironmentSecrets.addAll(listOf(*runtimeEnvironmentSecrets))
    }

    public fun runtimeEnvironmentSecrets(runtimeEnvironmentSecrets: Collection<Any>) {
        _runtimeEnvironmentSecrets.addAll(runtimeEnvironmentSecrets)
    }

    public fun runtimeEnvironmentSecrets(runtimeEnvironmentSecrets: IResolvable) {
        cdkBuilder.runtimeEnvironmentSecrets(runtimeEnvironmentSecrets)
    }

    public fun runtimeEnvironmentVariables(vararg runtimeEnvironmentVariables: Any) {
        _runtimeEnvironmentVariables.addAll(listOf(*runtimeEnvironmentVariables))
    }

    public fun runtimeEnvironmentVariables(runtimeEnvironmentVariables: Collection<Any>) {
        _runtimeEnvironmentVariables.addAll(runtimeEnvironmentVariables)
    }

    public fun runtimeEnvironmentVariables(runtimeEnvironmentVariables: IResolvable) {
        cdkBuilder.runtimeEnvironmentVariables(runtimeEnvironmentVariables)
    }

    public fun startCommand(startCommand: String) {
        cdkBuilder.startCommand(startCommand)
    }

    public fun build(): CfnService.CodeConfigurationValuesProperty {
        if (_runtimeEnvironmentSecrets.isNotEmpty()) {
            cdkBuilder.runtimeEnvironmentSecrets(_runtimeEnvironmentSecrets)
        }
        if (_runtimeEnvironmentVariables.isNotEmpty()) {
            cdkBuilder.runtimeEnvironmentVariables(_runtimeEnvironmentVariables)
        }
        return cdkBuilder.build()
    }
}
