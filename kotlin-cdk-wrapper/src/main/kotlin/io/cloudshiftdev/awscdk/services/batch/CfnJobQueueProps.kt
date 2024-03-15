@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface CfnJobQueueProps {
  public fun computeEnvironmentOrder(): Any

  public fun jobQueueName(): String? = unwrap(this).getJobQueueName()

  public fun priority(): Number

  public fun schedulingPolicyArn(): String? = unwrap(this).getSchedulingPolicyArn()

  public fun state(): String? = unwrap(this).getState()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  @CdkDslMarker
  public interface Builder {
    public fun computeEnvironmentOrder(computeEnvironmentOrder: IResolvable)

    public fun computeEnvironmentOrder(computeEnvironmentOrder: List<Any>)

    public fun computeEnvironmentOrder(vararg computeEnvironmentOrder: Any)

    public fun jobQueueName(jobQueueName: String)

    public fun priority(priority: Number)

    public fun schedulingPolicyArn(schedulingPolicyArn: String)

    public fun state(state: String)

    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.CfnJobQueueProps.Builder =
        software.amazon.awscdk.services.batch.CfnJobQueueProps.builder()

    override fun computeEnvironmentOrder(computeEnvironmentOrder: IResolvable) {
      cdkBuilder.computeEnvironmentOrder(computeEnvironmentOrder.let(IResolvable::unwrap))
    }

    override fun computeEnvironmentOrder(computeEnvironmentOrder: List<Any>) {
      cdkBuilder.computeEnvironmentOrder(computeEnvironmentOrder)
    }

    override fun computeEnvironmentOrder(vararg computeEnvironmentOrder: Any): Unit =
        computeEnvironmentOrder(computeEnvironmentOrder.toList())

    override fun jobQueueName(jobQueueName: String) {
      cdkBuilder.jobQueueName(jobQueueName)
    }

    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    override fun schedulingPolicyArn(schedulingPolicyArn: String) {
      cdkBuilder.schedulingPolicyArn(schedulingPolicyArn)
    }

    override fun state(state: String) {
      cdkBuilder.state(state)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.batch.CfnJobQueueProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.batch.CfnJobQueueProps,
  ) : CdkObject(cdkObject), CfnJobQueueProps {
    override fun computeEnvironmentOrder(): Any = unwrap(this).getComputeEnvironmentOrder()

    override fun jobQueueName(): String? = unwrap(this).getJobQueueName()

    override fun priority(): Number = unwrap(this).getPriority()

    override fun schedulingPolicyArn(): String? = unwrap(this).getSchedulingPolicyArn()

    override fun state(): String? = unwrap(this).getState()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnJobQueueProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobQueueProps):
        CfnJobQueueProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnJobQueueProps):
        software.amazon.awscdk.services.batch.CfnJobQueueProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.batch.CfnJobQueueProps
  }
}
