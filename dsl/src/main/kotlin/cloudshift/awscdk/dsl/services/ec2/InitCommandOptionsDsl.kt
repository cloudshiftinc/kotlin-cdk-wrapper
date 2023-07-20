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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.InitCommandOptions
import software.amazon.awscdk.services.ec2.InitCommandWaitDuration
import software.amazon.awscdk.services.ec2.InitServiceRestartHandle
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class InitCommandOptionsDsl {
    private val cdkBuilder: InitCommandOptions.Builder = InitCommandOptions.builder()

    private val _serviceRestartHandles: MutableList<InitServiceRestartHandle> = mutableListOf()

    public fun cwd(cwd: String) {
        cdkBuilder.cwd(cwd)
    }

    public fun env(env: Map<String, String>) {
        cdkBuilder.env(env)
    }

    public fun ignoreErrors(ignoreErrors: Boolean) {
        cdkBuilder.ignoreErrors(ignoreErrors)
    }

    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun serviceRestartHandles(vararg serviceRestartHandles: InitServiceRestartHandle) {
        _serviceRestartHandles.addAll(listOf(*serviceRestartHandles))
    }

    public fun serviceRestartHandles(serviceRestartHandles: Collection<InitServiceRestartHandle>) {
        _serviceRestartHandles.addAll(serviceRestartHandles)
    }

    public fun testCmd(testCmd: String) {
        cdkBuilder.testCmd(testCmd)
    }

    public fun waitAfterCompletion(waitAfterCompletion: InitCommandWaitDuration) {
        cdkBuilder.waitAfterCompletion(waitAfterCompletion)
    }

    public fun build(): InitCommandOptions {
        if (_serviceRestartHandles.isNotEmpty()) cdkBuilder.serviceRestartHandles(_serviceRestartHandles)
        return cdkBuilder.build()
    }
}
