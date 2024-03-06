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

package io.cloudshiftdev.awscdkdsl.services.gamelift

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.gamelift.CfnFleet

/**
 * A set of instructions for launching server processes on each instance in a fleet.
 *
 * Server processes run either an executable in a custom game build or a Realtime Servers script.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.gamelift.*;
 * ServerProcessProperty serverProcessProperty = ServerProcessProperty.builder()
 * .concurrentExecutions(123)
 * .launchPath("launchPath")
 * // the properties below are optional
 * .parameters("parameters")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-serverprocess.html)
 */
@CdkDslMarker
public class CfnFleetServerProcessPropertyDsl {
    private val cdkBuilder: CfnFleet.ServerProcessProperty.Builder =
        CfnFleet.ServerProcessProperty.builder()

    /**
     * @param concurrentExecutions The number of server processes using this configuration that run
     *   concurrently on each instance.
     */
    public fun concurrentExecutions(concurrentExecutions: Number) {
        cdkBuilder.concurrentExecutions(concurrentExecutions)
    }

    /**
     * @param launchPath The location of a game build executable or Realtime script. Game builds and
     *   Realtime scripts are installed on instances at the root:
     * * Windows (custom game builds only): `C:\game` . Example: " `C:\game\MyGame\server.exe` "
     * * Linux: `/local/game` . Examples: " `/local/game/MyGame/server.exe` " or "
     *   `/local/game/MyRealtimeScript.js` "
     *
     * Amazon GameLift doesn't support the use of setup scripts that launch the game executable. For
     * custom game builds, this parameter must indicate the executable that calls the server SDK
     * operations `initSDK()` and `ProcessReady()` .
     */
    public fun launchPath(launchPath: String) {
        cdkBuilder.launchPath(launchPath)
    }

    /**
     * @param parameters An optional list of parameters to pass to the server executable or Realtime
     *   script on launch. Length Constraints: Minimum length of 1. Maximum length of 1024.
     *
     * Pattern: [A-Za-z0-9_:.+/- =&#64;{},?'[]"]+
     */
    public fun parameters(parameters: String) {
        cdkBuilder.parameters(parameters)
    }

    public fun build(): CfnFleet.ServerProcessProperty = cdkBuilder.build()
}
