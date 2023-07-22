@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.CfnPrimaryTaskSet
import software.constructs.Construct

/**
 * Modifies which task set in a service is the primary task set.
 *
 * Any parameters that are updated on the primary task set in a service will transition to the
 * service. This is used when a service uses the `EXTERNAL` deployment controller type. For more
 * information, see [Amazon ECS Deployment
 * Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html) in the
 * *Amazon Elastic Container Service Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * CfnPrimaryTaskSet cfnPrimaryTaskSet = CfnPrimaryTaskSet.Builder.create(this,
 * "MyCfnPrimaryTaskSet")
 * .cluster("cluster")
 * .service("service")
 * .taskSetId("taskSetId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-primarytaskset.html)
 */
@CdkDslMarker
public class CfnPrimaryTaskSetDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnPrimaryTaskSet.Builder = CfnPrimaryTaskSet.Builder.create(scope, id)

  /**
   * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that
   * the task set exists in.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-primarytaskset.html#cfn-ecs-primarytaskset-cluster)
   * @param cluster The short name or full Amazon Resource Name (ARN) of the cluster that hosts the
   * service that the task set exists in. 
   */
  public fun cluster(cluster: String) {
    cdkBuilder.cluster(cluster)
  }

  /**
   * The short name or full Amazon Resource Name (ARN) of the service that the task set exists in.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-primarytaskset.html#cfn-ecs-primarytaskset-service)
   * @param service The short name or full Amazon Resource Name (ARN) of the service that the task
   * set exists in. 
   */
  public fun service(service: String) {
    cdkBuilder.service(service)
  }

  /**
   * The short name or full Amazon Resource Name (ARN) of the task set to set as the primary task
   * set in the deployment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-primarytaskset.html#cfn-ecs-primarytaskset-tasksetid)
   * @param taskSetId The short name or full Amazon Resource Name (ARN) of the task set to set as
   * the primary task set in the deployment. 
   */
  public fun taskSetId(taskSetId: String) {
    cdkBuilder.taskSetId(taskSetId)
  }

  public fun build(): CfnPrimaryTaskSet = cdkBuilder.build()
}
