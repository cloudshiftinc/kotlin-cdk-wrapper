@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.InitCommandOptions
import software.amazon.awscdk.services.ec2.InitCommandWaitDuration
import software.amazon.awscdk.services.ec2.InitServiceRestartHandle

/**
 * Options for InitCommand.
 *
 * Example:
 * ```
 * InitServiceRestartHandle handle = new InitServiceRestartHandle();
 * CloudFormationInit.fromElements(InitCommand.shellCommand("/usr/bin/custom-nginx-install.sh",
 * InitCommandOptions.builder().serviceRestartHandles(List.of(handle)).build()),
 * InitService.enable("nginx", InitServiceOptions.builder().serviceRestartHandle(handle).build()));
 * ```
 */
@CdkDslMarker
public class InitCommandOptionsDsl {
    private val cdkBuilder: InitCommandOptions.Builder = InitCommandOptions.builder()

    private val _serviceRestartHandles: MutableList<InitServiceRestartHandle> = mutableListOf()

    /** @param cwd The working directory. */
    public fun cwd(cwd: String) {
        cdkBuilder.cwd(cwd)
    }

    /**
     * @param env Sets environment variables for the command. This property overwrites, rather than
     *   appends, the existing environment.
     */
    public fun env(env: Map<String, String>) {
        cdkBuilder.env(env)
    }

    /** @param ignoreErrors Continue running if this command fails. */
    public fun ignoreErrors(ignoreErrors: Boolean) {
        cdkBuilder.ignoreErrors(ignoreErrors)
    }

    /**
     * @param key Identifier key for this command. Commands are executed in lexicographical order of
     *   their key names.
     */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /** @param serviceRestartHandles Restart the given service(s) after this command has run. */
    public fun serviceRestartHandles(vararg serviceRestartHandles: InitServiceRestartHandle) {
        _serviceRestartHandles.addAll(listOf(*serviceRestartHandles))
    }

    /** @param serviceRestartHandles Restart the given service(s) after this command has run. */
    public fun serviceRestartHandles(serviceRestartHandles: Collection<InitServiceRestartHandle>) {
        _serviceRestartHandles.addAll(serviceRestartHandles)
    }

    /**
     * @param testCmd Command to determine whether this command should be run. If the test passes
     *   (exits with error code of 0), the command is run.
     */
    public fun testCmd(testCmd: String) {
        cdkBuilder.testCmd(testCmd)
    }

    /**
     * @param waitAfterCompletion The duration to wait after a command has finished in case the
     *   command causes a reboot. Set this value to `InitCommandWaitDuration.none()` if you do not
     *   want to wait for every command; `InitCommandWaitDuration.forever()` directs cfn-init to
     *   exit and resume only after the reboot is complete.
     *
     * For Windows systems only.
     */
    public fun waitAfterCompletion(waitAfterCompletion: InitCommandWaitDuration) {
        cdkBuilder.waitAfterCompletion(waitAfterCompletion)
    }

    public fun build(): InitCommandOptions {
        if (_serviceRestartHandles.isNotEmpty())
            cdkBuilder.serviceRestartHandles(_serviceRestartHandles)
        return cdkBuilder.build()
    }
}
