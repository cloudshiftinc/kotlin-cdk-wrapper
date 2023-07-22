@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.gamelift.CfnFleet

/**
 * A set of instructions for launching server processes on each instance in a fleet.
 *
 * Server processes run either an executable in a custom game build or a Realtime Servers script.
 *
 * Example:
 *
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
   * concurrently on each instance. 
   */
  public fun concurrentExecutions(concurrentExecutions: Number) {
    cdkBuilder.concurrentExecutions(concurrentExecutions)
  }

  /**
   * @param launchPath The location of a game build executable or the Realtime script file that
   * contains the `Init()` function. 
   * Game builds and Realtime scripts are installed on instances at the root:
   *
   * * Windows (custom game builds only): `C:\game` . Example: " `C:\game\MyGame\server.exe` "
   * * Linux: `/local/game` . Examples: " `/local/game/MyGame/server.exe` " or "
   * `/local/game/MyRealtimeScript.js` "
   */
  public fun launchPath(launchPath: String) {
    cdkBuilder.launchPath(launchPath)
  }

  /**
   * @param parameters An optional list of parameters to pass to the server executable or Realtime
   * script on launch.
   */
  public fun parameters(parameters: String) {
    cdkBuilder.parameters(parameters)
  }

  public fun build(): CfnFleet.ServerProcessProperty = cdkBuilder.build()
}
