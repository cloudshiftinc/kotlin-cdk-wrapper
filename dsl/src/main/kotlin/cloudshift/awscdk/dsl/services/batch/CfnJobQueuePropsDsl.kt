@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnJobQueueProps

@CdkDslMarker
public class CfnJobQueuePropsDsl {
  private val cdkBuilder: CfnJobQueueProps.Builder = CfnJobQueueProps.builder()

  private val _computeEnvironmentOrder: MutableList<Any> = mutableListOf()

  /**
   * @param computeEnvironmentOrder The set of compute environments mapped to a job queue and their
   * order relative to each other. 
   * The job scheduler uses this parameter to determine which compute environment runs a specific
   * job. Compute environments must be in the `VALID` state before you can associate them with a job
   * queue. You can associate up to three compute environments with a job queue. All of the compute
   * environments must be either EC2 ( `EC2` or `SPOT` ) or Fargate ( `FARGATE` or `FARGATE_SPOT` );
   * EC2 and Fargate compute environments can't be mixed.
   *
   *
   * All compute environments that are associated with a job queue must share the same architecture.
   * AWS Batch doesn't support mixing compute environment architecture types in a single job queue.
   */
  public fun computeEnvironmentOrder(vararg computeEnvironmentOrder: Any) {
    _computeEnvironmentOrder.addAll(listOf(*computeEnvironmentOrder))
  }

  /**
   * @param computeEnvironmentOrder The set of compute environments mapped to a job queue and their
   * order relative to each other. 
   * The job scheduler uses this parameter to determine which compute environment runs a specific
   * job. Compute environments must be in the `VALID` state before you can associate them with a job
   * queue. You can associate up to three compute environments with a job queue. All of the compute
   * environments must be either EC2 ( `EC2` or `SPOT` ) or Fargate ( `FARGATE` or `FARGATE_SPOT` );
   * EC2 and Fargate compute environments can't be mixed.
   *
   *
   * All compute environments that are associated with a job queue must share the same architecture.
   * AWS Batch doesn't support mixing compute environment architecture types in a single job queue.
   */
  public fun computeEnvironmentOrder(computeEnvironmentOrder: Collection<Any>) {
    _computeEnvironmentOrder.addAll(computeEnvironmentOrder)
  }

  /**
   * @param computeEnvironmentOrder The set of compute environments mapped to a job queue and their
   * order relative to each other. 
   * The job scheduler uses this parameter to determine which compute environment runs a specific
   * job. Compute environments must be in the `VALID` state before you can associate them with a job
   * queue. You can associate up to three compute environments with a job queue. All of the compute
   * environments must be either EC2 ( `EC2` or `SPOT` ) or Fargate ( `FARGATE` or `FARGATE_SPOT` );
   * EC2 and Fargate compute environments can't be mixed.
   *
   *
   * All compute environments that are associated with a job queue must share the same architecture.
   * AWS Batch doesn't support mixing compute environment architecture types in a single job queue.
   */
  public fun computeEnvironmentOrder(computeEnvironmentOrder: IResolvable) {
    cdkBuilder.computeEnvironmentOrder(computeEnvironmentOrder)
  }

  /**
   * @param jobQueueName The name of the job queue.
   * It can be up to 128 letters long. It can contain uppercase and lowercase letters, numbers,
   * hyphens (-), and underscores (_).
   */
  public fun jobQueueName(jobQueueName: String) {
    cdkBuilder.jobQueueName(jobQueueName)
  }

  /**
   * @param priority The priority of the job queue. 
   * Job queues with a higher priority (or a higher integer value for the `priority` parameter) are
   * evaluated first when associated with the same compute environment. Priority is determined in
   * descending order. For example, a job queue with a priority value of `10` is given scheduling
   * preference over a job queue with a priority value of `1` . All of the compute environments must be
   * either EC2 ( `EC2` or `SPOT` ) or Fargate ( `FARGATE` or `FARGATE_SPOT` ); EC2 and Fargate compute
   * environments can't be mixed.
   */
  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  /**
   * @param schedulingPolicyArn The Amazon Resource Name (ARN) of the scheduling policy.
   * The format is `aws: *Partition* :batch: *Region* : *Account* :scheduling-policy/ *Name*` . For
   * example, `aws:aws:batch:us-west-2:123456789012:scheduling-policy/MySchedulingPolicy` .
   */
  public fun schedulingPolicyArn(schedulingPolicyArn: String) {
    cdkBuilder.schedulingPolicyArn(schedulingPolicyArn)
  }

  /**
   * @param state The state of the job queue.
   * If the job queue state is `ENABLED` , it is able to accept jobs. If the job queue state is
   * `DISABLED` , new jobs can't be added to the queue, but jobs already in the queue can finish.
   */
  public fun state(state: String) {
    cdkBuilder.state(state)
  }

  /**
   * @param tags The tags that are applied to the job queue.
   * For more information, see [Tagging your AWS Batch
   * resources](https://docs.aws.amazon.com/batch/latest/userguide/using-tags.html) in *AWS Batch User
   * Guide* .
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnJobQueueProps {
    if(_computeEnvironmentOrder.isNotEmpty())
        cdkBuilder.computeEnvironmentOrder(_computeEnvironmentOrder)
    return cdkBuilder.build()
  }
}
