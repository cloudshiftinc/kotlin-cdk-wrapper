@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnJobQueue internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.batch.CfnJobQueue,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrJobQueueArn(): String = unwrap(this).getAttrJobQueueArn()

  public open fun computeEnvironmentOrder(): Any = unwrap(this).getComputeEnvironmentOrder()

  public open fun computeEnvironmentOrder(`value`: IResolvable) {
    unwrap(this).setComputeEnvironmentOrder(`value`.let(IResolvable::unwrap))
  }

  public open fun computeEnvironmentOrder(__idx_ac66f0: List<Any>) {
    unwrap(this).setComputeEnvironmentOrder(__idx_ac66f0)
  }

  public open fun computeEnvironmentOrder(vararg __idx_ac66f0: Any): Unit =
      computeEnvironmentOrder(__idx_ac66f0.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun jobQueueName(): String? = unwrap(this).getJobQueueName()

  public open fun jobQueueName(`value`: String) {
    unwrap(this).setJobQueueName(`value`)
  }

  public open fun priority(): Number = unwrap(this).getPriority()

  public open fun priority(`value`: Number) {
    unwrap(this).setPriority(`value`)
  }

  public open fun schedulingPolicyArn(): String? = unwrap(this).getSchedulingPolicyArn()

  public open fun schedulingPolicyArn(`value`: String) {
    unwrap(this).setSchedulingPolicyArn(`value`)
  }

  public open fun state(): String? = unwrap(this).getState()

  public open fun state(`value`: String) {
    unwrap(this).setState(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.CfnJobQueue.Builder =
        software.amazon.awscdk.services.batch.CfnJobQueue.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.batch.CfnJobQueue = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.batch.CfnJobQueue.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnJobQueue {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnJobQueue(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobQueue): CfnJobQueue =
        CfnJobQueue(cdkObject)

    internal fun unwrap(wrapped: CfnJobQueue): software.amazon.awscdk.services.batch.CfnJobQueue =
        wrapped.cdkObject
  }

  public interface ComputeEnvironmentOrderProperty {
    public fun computeEnvironment(): String

    public fun order(): Number

    @CdkDslMarker
    public interface Builder {
      public fun computeEnvironment(computeEnvironment: String)

      public fun order(order: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobQueue.ComputeEnvironmentOrderProperty.Builder
          =
          software.amazon.awscdk.services.batch.CfnJobQueue.ComputeEnvironmentOrderProperty.builder()

      override fun computeEnvironment(computeEnvironment: String) {
        cdkBuilder.computeEnvironment(computeEnvironment)
      }

      override fun order(order: Number) {
        cdkBuilder.order(order)
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnJobQueue.ComputeEnvironmentOrderProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.batch.CfnJobQueue.ComputeEnvironmentOrderProperty,
    ) : CdkObject(cdkObject), ComputeEnvironmentOrderProperty {
      override fun computeEnvironment(): String = unwrap(this).getComputeEnvironment()

      override fun order(): Number = unwrap(this).getOrder()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ComputeEnvironmentOrderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobQueue.ComputeEnvironmentOrderProperty):
          ComputeEnvironmentOrderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComputeEnvironmentOrderProperty):
          software.amazon.awscdk.services.batch.CfnJobQueue.ComputeEnvironmentOrderProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnJobQueue.ComputeEnvironmentOrderProperty
    }
  }
}
