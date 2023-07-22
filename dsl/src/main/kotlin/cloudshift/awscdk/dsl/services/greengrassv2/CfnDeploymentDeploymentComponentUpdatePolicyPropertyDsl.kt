@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrassv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.greengrassv2.CfnDeployment

@CdkDslMarker
public class CfnDeploymentDeploymentComponentUpdatePolicyPropertyDsl {
  private val cdkBuilder: CfnDeployment.DeploymentComponentUpdatePolicyProperty.Builder =
      CfnDeployment.DeploymentComponentUpdatePolicyProperty.builder()

  /**
   * @param action Whether or not to notify components and wait for components to become safe to
   * update.
   * Choose from the following options:
   *
   * * `NOTIFY_COMPONENTS` – The deployment notifies each component before it stops and updates that
   * component. Components can use the
   * [SubscribeToComponentUpdates](https://docs.aws.amazon.com/greengrass/v2/developerguide/interprocess-communication.html#ipc-operation-subscribetocomponentupdates)
   * IPC operation to receive these notifications. Then, components can respond with the
   * [DeferComponentUpdate](https://docs.aws.amazon.com/greengrass/v2/developerguide/interprocess-communication.html#ipc-operation-defercomponentupdate)
   * IPC operation. For more information, see the [Create
   * deployments](https://docs.aws.amazon.com/greengrass/v2/developerguide/create-deployments.html) in
   * the *AWS IoT Greengrass V2 Developer Guide* .
   * * `SKIP_NOTIFY_COMPONENTS` – The deployment doesn't notify components or wait for them to be
   * safe to update.
   *
   * Default: `NOTIFY_COMPONENTS`
   */
  public fun action(action: String) {
    cdkBuilder.action(action)
  }

  /**
   * @param timeoutInSeconds The amount of time in seconds that each component on a device has to
   * report that it's safe to update.
   * If the component waits for longer than this timeout, then the deployment proceeds on the
   * device.
   *
   * Default: `60`
   */
  public fun timeoutInSeconds(timeoutInSeconds: Number) {
    cdkBuilder.timeoutInSeconds(timeoutInSeconds)
  }

  public fun build(): CfnDeployment.DeploymentComponentUpdatePolicyProperty = cdkBuilder.build()
}
