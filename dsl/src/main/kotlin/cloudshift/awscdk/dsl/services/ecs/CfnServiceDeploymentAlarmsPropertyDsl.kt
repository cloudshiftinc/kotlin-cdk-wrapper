@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnService

/**
 * One of the methods which provide a way for you to quickly identify when a deployment has failed,
 * and then to optionally roll back the failure to the last working deployment.
 *
 * When the alarms are generated, Amazon ECS sets the service deployment to failed. Set the rollback
 * parameter to have Amazon ECS to roll back your service to the last completed deployment after a
 * failure.
 *
 * You can only use the `DeploymentAlarms` method to detect failures when the `DeploymentController`
 * is set to `ECS` (rolling update).
 *
 * For more information, see [Rolling
 * update](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-type-ecs.html) in the
 * **Amazon Elastic Container Service Developer Guide** .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * DeploymentAlarmsProperty deploymentAlarmsProperty = DeploymentAlarmsProperty.builder()
 * .alarmNames(List.of("alarmNames"))
 * .enable(false)
 * .rollback(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentalarms.html)
 */
@CdkDslMarker
public class CfnServiceDeploymentAlarmsPropertyDsl {
  private val cdkBuilder: CfnService.DeploymentAlarmsProperty.Builder =
      CfnService.DeploymentAlarmsProperty.builder()

  private val _alarmNames: MutableList<String> = mutableListOf()

  /**
   * @param alarmNames One or more CloudWatch alarm names. 
   * Use a "," to separate the alarms.
   */
  public fun alarmNames(vararg alarmNames: String) {
    _alarmNames.addAll(listOf(*alarmNames))
  }

  /**
   * @param alarmNames One or more CloudWatch alarm names. 
   * Use a "," to separate the alarms.
   */
  public fun alarmNames(alarmNames: Collection<String>) {
    _alarmNames.addAll(alarmNames)
  }

  /**
   * @param enable Determines whether to use the CloudWatch alarm option in the service deployment
   * process. 
   */
  public fun enable(enable: Boolean) {
    cdkBuilder.enable(enable)
  }

  /**
   * @param enable Determines whether to use the CloudWatch alarm option in the service deployment
   * process. 
   */
  public fun enable(enable: IResolvable) {
    cdkBuilder.enable(enable)
  }

  /**
   * @param rollback Determines whether to configure Amazon ECS to roll back the service if a
   * service deployment fails. 
   * If rollback is used, when a service deployment fails, the service is rolled back to the last
   * deployment that completed successfully.
   */
  public fun rollback(rollback: Boolean) {
    cdkBuilder.rollback(rollback)
  }

  /**
   * @param rollback Determines whether to configure Amazon ECS to roll back the service if a
   * service deployment fails. 
   * If rollback is used, when a service deployment fails, the service is rolled back to the last
   * deployment that completed successfully.
   */
  public fun rollback(rollback: IResolvable) {
    cdkBuilder.rollback(rollback)
  }

  public fun build(): CfnService.DeploymentAlarmsProperty {
    if(_alarmNames.isNotEmpty()) cdkBuilder.alarmNames(_alarmNames)
    return cdkBuilder.build()
  }
}
