@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.CfnPrimaryTaskSet
import software.constructs.Construct

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
