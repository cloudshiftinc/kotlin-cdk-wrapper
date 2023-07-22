@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.gamelift.CfnFleet

@CdkDslMarker
public class CfnFleetRuntimeConfigurationPropertyDsl {
  private val cdkBuilder: CfnFleet.RuntimeConfigurationProperty.Builder =
      CfnFleet.RuntimeConfigurationProperty.builder()

  private val _serverProcesses: MutableList<Any> = mutableListOf()

  /**
   * @param gameSessionActivationTimeoutSeconds The maximum amount of time (in seconds) allowed to
   * launch a new game session and have it report ready to host players.
   * During this time, the game session is in status `ACTIVATING` . If the game session does not
   * become active before the timeout, it is ended and the game session status is changed to
   * `TERMINATED` .
   */
  public fun gameSessionActivationTimeoutSeconds(gameSessionActivationTimeoutSeconds: Number) {
    cdkBuilder.gameSessionActivationTimeoutSeconds(gameSessionActivationTimeoutSeconds)
  }

  /**
   * @param maxConcurrentGameSessionActivations The number of game sessions in status `ACTIVATING`
   * to allow on an instance.
   * This setting limits the instance resources that can be used for new game activations at any one
   * time.
   */
  public fun maxConcurrentGameSessionActivations(maxConcurrentGameSessionActivations: Number) {
    cdkBuilder.maxConcurrentGameSessionActivations(maxConcurrentGameSessionActivations)
  }

  /**
   * @param serverProcesses A collection of server process configurations that identify what server
   * processes to run on each instance in a fleet.
   */
  public fun serverProcesses(vararg serverProcesses: Any) {
    _serverProcesses.addAll(listOf(*serverProcesses))
  }

  /**
   * @param serverProcesses A collection of server process configurations that identify what server
   * processes to run on each instance in a fleet.
   */
  public fun serverProcesses(serverProcesses: Collection<Any>) {
    _serverProcesses.addAll(serverProcesses)
  }

  /**
   * @param serverProcesses A collection of server process configurations that identify what server
   * processes to run on each instance in a fleet.
   */
  public fun serverProcesses(serverProcesses: IResolvable) {
    cdkBuilder.serverProcesses(serverProcesses)
  }

  public fun build(): CfnFleet.RuntimeConfigurationProperty {
    if(_serverProcesses.isNotEmpty()) cdkBuilder.serverProcesses(_serverProcesses)
    return cdkBuilder.build()
  }
}
