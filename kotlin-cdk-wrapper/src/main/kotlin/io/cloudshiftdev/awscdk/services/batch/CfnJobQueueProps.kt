@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Properties for defining a `CfnJobQueue`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.batch.*;
 * CfnJobQueueProps cfnJobQueueProps = CfnJobQueueProps.builder()
 * .computeEnvironmentOrder(List.of(ComputeEnvironmentOrderProperty.builder()
 * .computeEnvironment("computeEnvironment")
 * .order(123)
 * .build()))
 * .priority(123)
 * // the properties below are optional
 * .jobQueueName("jobQueueName")
 * .jobStateTimeLimitActions(List.of(JobStateTimeLimitActionProperty.builder()
 * .action("action")
 * .maxTimeSeconds(123)
 * .reason("reason")
 * .state("state")
 * .build()))
 * .schedulingPolicyArn("schedulingPolicyArn")
 * .state("state")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html)
 */
public interface CfnJobQueueProps {
  /**
   * The set of compute environments mapped to a job queue and their order relative to each other.
   *
   * The job scheduler uses this parameter to determine which compute environment runs a specific
   * job. Compute environments must be in the `VALID` state before you can associate them with a job
   * queue. You can associate up to three compute environments with a job queue. All of the compute
   * environments must be either EC2 ( `EC2` or `SPOT` ) or Fargate ( `FARGATE` or `FARGATE_SPOT` );
   * EC2 and Fargate compute environments can't be mixed.
   *
   *
   * All compute environments that are associated with a job queue must share the same architecture.
   * AWS Batch doesn't support mixing compute environment architecture types in a single job queue.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-computeenvironmentorder)
   */
  public fun computeEnvironmentOrder(): Any

  /**
   * The name of the job queue.
   *
   * It can be up to 128 letters long. It can contain uppercase and lowercase letters, numbers,
   * hyphens (-), and underscores (_).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-jobqueuename)
   */
  public fun jobQueueName(): String? = unwrap(this).getJobQueueName()

  /**
   * The set of actions that AWS Batch perform on jobs that remain at the head of the job queue in
   * the specified state longer than specified times.
   *
   * AWS Batch will perform each action after `maxTimeSeconds` has passed.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-jobstatetimelimitactions)
   */
  public fun jobStateTimeLimitActions(): Any? = unwrap(this).getJobStateTimeLimitActions()

  /**
   * The priority of the job queue.
   *
   * Job queues with a higher priority (or a higher integer value for the `priority` parameter) are
   * evaluated first when associated with the same compute environment. Priority is determined in
   * descending order. For example, a job queue with a priority value of `10` is given scheduling
   * preference over a job queue with a priority value of `1` . All of the compute environments must be
   * either EC2 ( `EC2` or `SPOT` ) or Fargate ( `FARGATE` or `FARGATE_SPOT` ); EC2 and Fargate compute
   * environments can't be mixed.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-priority)
   */
  public fun priority(): Number

  /**
   * The Amazon Resource Name (ARN) of the scheduling policy.
   *
   * The format is `aws: *Partition* :batch: *Region* : *Account* :scheduling-policy/ *Name*` . For
   * example, `aws:aws:batch:us-west-2:123456789012:scheduling-policy/MySchedulingPolicy` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-schedulingpolicyarn)
   */
  public fun schedulingPolicyArn(): String? = unwrap(this).getSchedulingPolicyArn()

  /**
   * The state of the job queue.
   *
   * If the job queue state is `ENABLED` , it is able to accept jobs. If the job queue state is
   * `DISABLED` , new jobs can't be added to the queue, but jobs already in the queue can finish.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-state)
   */
  public fun state(): String? = unwrap(this).getState()

  /**
   * The tags that are applied to the job queue.
   *
   * For more information, see [Tagging your AWS Batch
   * resources](https://docs.aws.amazon.com/batch/latest/userguide/using-tags.html) in *AWS Batch User
   * Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnJobQueueProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param computeEnvironmentOrder The set of compute environments mapped to a job queue and
     * their order relative to each other. 
     * The job scheduler uses this parameter to determine which compute environment runs a specific
     * job. Compute environments must be in the `VALID` state before you can associate them with a job
     * queue. You can associate up to three compute environments with a job queue. All of the compute
     * environments must be either EC2 ( `EC2` or `SPOT` ) or Fargate ( `FARGATE` or `FARGATE_SPOT` );
     * EC2 and Fargate compute environments can't be mixed.
     *
     *
     * All compute environments that are associated with a job queue must share the same
     * architecture. AWS Batch doesn't support mixing compute environment architecture types in a
     * single job queue.
     */
    public fun computeEnvironmentOrder(computeEnvironmentOrder: IResolvable)

    /**
     * @param computeEnvironmentOrder The set of compute environments mapped to a job queue and
     * their order relative to each other. 
     * The job scheduler uses this parameter to determine which compute environment runs a specific
     * job. Compute environments must be in the `VALID` state before you can associate them with a job
     * queue. You can associate up to three compute environments with a job queue. All of the compute
     * environments must be either EC2 ( `EC2` or `SPOT` ) or Fargate ( `FARGATE` or `FARGATE_SPOT` );
     * EC2 and Fargate compute environments can't be mixed.
     *
     *
     * All compute environments that are associated with a job queue must share the same
     * architecture. AWS Batch doesn't support mixing compute environment architecture types in a
     * single job queue.
     */
    public fun computeEnvironmentOrder(computeEnvironmentOrder: List<Any>)

    /**
     * @param computeEnvironmentOrder The set of compute environments mapped to a job queue and
     * their order relative to each other. 
     * The job scheduler uses this parameter to determine which compute environment runs a specific
     * job. Compute environments must be in the `VALID` state before you can associate them with a job
     * queue. You can associate up to three compute environments with a job queue. All of the compute
     * environments must be either EC2 ( `EC2` or `SPOT` ) or Fargate ( `FARGATE` or `FARGATE_SPOT` );
     * EC2 and Fargate compute environments can't be mixed.
     *
     *
     * All compute environments that are associated with a job queue must share the same
     * architecture. AWS Batch doesn't support mixing compute environment architecture types in a
     * single job queue.
     */
    public fun computeEnvironmentOrder(vararg computeEnvironmentOrder: Any)

    /**
     * @param jobQueueName The name of the job queue.
     * It can be up to 128 letters long. It can contain uppercase and lowercase letters, numbers,
     * hyphens (-), and underscores (_).
     */
    public fun jobQueueName(jobQueueName: String)

    /**
     * @param jobStateTimeLimitActions The set of actions that AWS Batch perform on jobs that remain
     * at the head of the job queue in the specified state longer than specified times.
     * AWS Batch will perform each action after `maxTimeSeconds` has passed.
     */
    public fun jobStateTimeLimitActions(jobStateTimeLimitActions: IResolvable)

    /**
     * @param jobStateTimeLimitActions The set of actions that AWS Batch perform on jobs that remain
     * at the head of the job queue in the specified state longer than specified times.
     * AWS Batch will perform each action after `maxTimeSeconds` has passed.
     */
    public fun jobStateTimeLimitActions(jobStateTimeLimitActions: List<Any>)

    /**
     * @param jobStateTimeLimitActions The set of actions that AWS Batch perform on jobs that remain
     * at the head of the job queue in the specified state longer than specified times.
     * AWS Batch will perform each action after `maxTimeSeconds` has passed.
     */
    public fun jobStateTimeLimitActions(vararg jobStateTimeLimitActions: Any)

    /**
     * @param priority The priority of the job queue. 
     * Job queues with a higher priority (or a higher integer value for the `priority` parameter)
     * are evaluated first when associated with the same compute environment. Priority is determined in
     * descending order. For example, a job queue with a priority value of `10` is given scheduling
     * preference over a job queue with a priority value of `1` . All of the compute environments must
     * be either EC2 ( `EC2` or `SPOT` ) or Fargate ( `FARGATE` or `FARGATE_SPOT` ); EC2 and Fargate
     * compute environments can't be mixed.
     */
    public fun priority(priority: Number)

    /**
     * @param schedulingPolicyArn The Amazon Resource Name (ARN) of the scheduling policy.
     * The format is `aws: *Partition* :batch: *Region* : *Account* :scheduling-policy/ *Name*` .
     * For example, `aws:aws:batch:us-west-2:123456789012:scheduling-policy/MySchedulingPolicy` .
     */
    public fun schedulingPolicyArn(schedulingPolicyArn: String)

    /**
     * @param state The state of the job queue.
     * If the job queue state is `ENABLED` , it is able to accept jobs. If the job queue state is
     * `DISABLED` , new jobs can't be added to the queue, but jobs already in the queue can finish.
     */
    public fun state(state: String)

    /**
     * @param tags The tags that are applied to the job queue.
     * For more information, see [Tagging your AWS Batch
     * resources](https://docs.aws.amazon.com/batch/latest/userguide/using-tags.html) in *AWS Batch
     * User Guide* .
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.CfnJobQueueProps.Builder =
        software.amazon.awscdk.services.batch.CfnJobQueueProps.builder()

    /**
     * @param computeEnvironmentOrder The set of compute environments mapped to a job queue and
     * their order relative to each other. 
     * The job scheduler uses this parameter to determine which compute environment runs a specific
     * job. Compute environments must be in the `VALID` state before you can associate them with a job
     * queue. You can associate up to three compute environments with a job queue. All of the compute
     * environments must be either EC2 ( `EC2` or `SPOT` ) or Fargate ( `FARGATE` or `FARGATE_SPOT` );
     * EC2 and Fargate compute environments can't be mixed.
     *
     *
     * All compute environments that are associated with a job queue must share the same
     * architecture. AWS Batch doesn't support mixing compute environment architecture types in a
     * single job queue.
     */
    override fun computeEnvironmentOrder(computeEnvironmentOrder: IResolvable) {
      cdkBuilder.computeEnvironmentOrder(computeEnvironmentOrder.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param computeEnvironmentOrder The set of compute environments mapped to a job queue and
     * their order relative to each other. 
     * The job scheduler uses this parameter to determine which compute environment runs a specific
     * job. Compute environments must be in the `VALID` state before you can associate them with a job
     * queue. You can associate up to three compute environments with a job queue. All of the compute
     * environments must be either EC2 ( `EC2` or `SPOT` ) or Fargate ( `FARGATE` or `FARGATE_SPOT` );
     * EC2 and Fargate compute environments can't be mixed.
     *
     *
     * All compute environments that are associated with a job queue must share the same
     * architecture. AWS Batch doesn't support mixing compute environment architecture types in a
     * single job queue.
     */
    override fun computeEnvironmentOrder(computeEnvironmentOrder: List<Any>) {
      cdkBuilder.computeEnvironmentOrder(computeEnvironmentOrder.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param computeEnvironmentOrder The set of compute environments mapped to a job queue and
     * their order relative to each other. 
     * The job scheduler uses this parameter to determine which compute environment runs a specific
     * job. Compute environments must be in the `VALID` state before you can associate them with a job
     * queue. You can associate up to three compute environments with a job queue. All of the compute
     * environments must be either EC2 ( `EC2` or `SPOT` ) or Fargate ( `FARGATE` or `FARGATE_SPOT` );
     * EC2 and Fargate compute environments can't be mixed.
     *
     *
     * All compute environments that are associated with a job queue must share the same
     * architecture. AWS Batch doesn't support mixing compute environment architecture types in a
     * single job queue.
     */
    override fun computeEnvironmentOrder(vararg computeEnvironmentOrder: Any): Unit =
        computeEnvironmentOrder(computeEnvironmentOrder.toList())

    /**
     * @param jobQueueName The name of the job queue.
     * It can be up to 128 letters long. It can contain uppercase and lowercase letters, numbers,
     * hyphens (-), and underscores (_).
     */
    override fun jobQueueName(jobQueueName: String) {
      cdkBuilder.jobQueueName(jobQueueName)
    }

    /**
     * @param jobStateTimeLimitActions The set of actions that AWS Batch perform on jobs that remain
     * at the head of the job queue in the specified state longer than specified times.
     * AWS Batch will perform each action after `maxTimeSeconds` has passed.
     */
    override fun jobStateTimeLimitActions(jobStateTimeLimitActions: IResolvable) {
      cdkBuilder.jobStateTimeLimitActions(jobStateTimeLimitActions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param jobStateTimeLimitActions The set of actions that AWS Batch perform on jobs that remain
     * at the head of the job queue in the specified state longer than specified times.
     * AWS Batch will perform each action after `maxTimeSeconds` has passed.
     */
    override fun jobStateTimeLimitActions(jobStateTimeLimitActions: List<Any>) {
      cdkBuilder.jobStateTimeLimitActions(jobStateTimeLimitActions.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param jobStateTimeLimitActions The set of actions that AWS Batch perform on jobs that remain
     * at the head of the job queue in the specified state longer than specified times.
     * AWS Batch will perform each action after `maxTimeSeconds` has passed.
     */
    override fun jobStateTimeLimitActions(vararg jobStateTimeLimitActions: Any): Unit =
        jobStateTimeLimitActions(jobStateTimeLimitActions.toList())

    /**
     * @param priority The priority of the job queue. 
     * Job queues with a higher priority (or a higher integer value for the `priority` parameter)
     * are evaluated first when associated with the same compute environment. Priority is determined in
     * descending order. For example, a job queue with a priority value of `10` is given scheduling
     * preference over a job queue with a priority value of `1` . All of the compute environments must
     * be either EC2 ( `EC2` or `SPOT` ) or Fargate ( `FARGATE` or `FARGATE_SPOT` ); EC2 and Fargate
     * compute environments can't be mixed.
     */
    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    /**
     * @param schedulingPolicyArn The Amazon Resource Name (ARN) of the scheduling policy.
     * The format is `aws: *Partition* :batch: *Region* : *Account* :scheduling-policy/ *Name*` .
     * For example, `aws:aws:batch:us-west-2:123456789012:scheduling-policy/MySchedulingPolicy` .
     */
    override fun schedulingPolicyArn(schedulingPolicyArn: String) {
      cdkBuilder.schedulingPolicyArn(schedulingPolicyArn)
    }

    /**
     * @param state The state of the job queue.
     * If the job queue state is `ENABLED` , it is able to accept jobs. If the job queue state is
     * `DISABLED` , new jobs can't be added to the queue, but jobs already in the queue can finish.
     */
    override fun state(state: String) {
      cdkBuilder.state(state)
    }

    /**
     * @param tags The tags that are applied to the job queue.
     * For more information, see [Tagging your AWS Batch
     * resources](https://docs.aws.amazon.com/batch/latest/userguide/using-tags.html) in *AWS Batch
     * User Guide* .
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.batch.CfnJobQueueProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.batch.CfnJobQueueProps,
  ) : CdkObject(cdkObject),
      CfnJobQueueProps {
    /**
     * The set of compute environments mapped to a job queue and their order relative to each other.
     *
     * The job scheduler uses this parameter to determine which compute environment runs a specific
     * job. Compute environments must be in the `VALID` state before you can associate them with a job
     * queue. You can associate up to three compute environments with a job queue. All of the compute
     * environments must be either EC2 ( `EC2` or `SPOT` ) or Fargate ( `FARGATE` or `FARGATE_SPOT` );
     * EC2 and Fargate compute environments can't be mixed.
     *
     *
     * All compute environments that are associated with a job queue must share the same
     * architecture. AWS Batch doesn't support mixing compute environment architecture types in a
     * single job queue.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-computeenvironmentorder)
     */
    override fun computeEnvironmentOrder(): Any = unwrap(this).getComputeEnvironmentOrder()

    /**
     * The name of the job queue.
     *
     * It can be up to 128 letters long. It can contain uppercase and lowercase letters, numbers,
     * hyphens (-), and underscores (_).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-jobqueuename)
     */
    override fun jobQueueName(): String? = unwrap(this).getJobQueueName()

    /**
     * The set of actions that AWS Batch perform on jobs that remain at the head of the job queue in
     * the specified state longer than specified times.
     *
     * AWS Batch will perform each action after `maxTimeSeconds` has passed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-jobstatetimelimitactions)
     */
    override fun jobStateTimeLimitActions(): Any? = unwrap(this).getJobStateTimeLimitActions()

    /**
     * The priority of the job queue.
     *
     * Job queues with a higher priority (or a higher integer value for the `priority` parameter)
     * are evaluated first when associated with the same compute environment. Priority is determined in
     * descending order. For example, a job queue with a priority value of `10` is given scheduling
     * preference over a job queue with a priority value of `1` . All of the compute environments must
     * be either EC2 ( `EC2` or `SPOT` ) or Fargate ( `FARGATE` or `FARGATE_SPOT` ); EC2 and Fargate
     * compute environments can't be mixed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-priority)
     */
    override fun priority(): Number = unwrap(this).getPriority()

    /**
     * The Amazon Resource Name (ARN) of the scheduling policy.
     *
     * The format is `aws: *Partition* :batch: *Region* : *Account* :scheduling-policy/ *Name*` .
     * For example, `aws:aws:batch:us-west-2:123456789012:scheduling-policy/MySchedulingPolicy` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-schedulingpolicyarn)
     */
    override fun schedulingPolicyArn(): String? = unwrap(this).getSchedulingPolicyArn()

    /**
     * The state of the job queue.
     *
     * If the job queue state is `ENABLED` , it is able to accept jobs. If the job queue state is
     * `DISABLED` , new jobs can't be added to the queue, but jobs already in the queue can finish.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-state)
     */
    override fun state(): String? = unwrap(this).getState()

    /**
     * The tags that are applied to the job queue.
     *
     * For more information, see [Tagging your AWS Batch
     * resources](https://docs.aws.amazon.com/batch/latest/userguide/using-tags.html) in *AWS Batch
     * User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnJobQueueProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobQueueProps):
        CfnJobQueueProps = CdkObjectWrappers.wrap(cdkObject) as? CfnJobQueueProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnJobQueueProps):
        software.amazon.awscdk.services.batch.CfnJobQueueProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.batch.CfnJobQueueProps
  }
}
