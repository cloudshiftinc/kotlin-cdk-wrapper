@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ce

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAnomalySubscription internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ce.CfnAnomalySubscription,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrAccountId(): String = unwrap(this).getAttrAccountId()

  public open fun attrSubscriptionArn(): String = unwrap(this).getAttrSubscriptionArn()

  public open fun frequency(): String = unwrap(this).getFrequency()

  public open fun frequency(`value`: String) {
    unwrap(this).setFrequency(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun monitorArnList(): List<String> = unwrap(this).getMonitorArnList()

  public open fun monitorArnList(`value`: List<String>) {
    unwrap(this).setMonitorArnList(`value`)
  }

  public open fun monitorArnList(vararg `value`: String): Unit = monitorArnList(`value`.toList())

  public open fun resourceTags(): Any? = unwrap(this).getResourceTags()

  public open fun resourceTags(`value`: IResolvable) {
    unwrap(this).setResourceTags(`value`.let(IResolvable::unwrap))
  }

  public open fun resourceTags(__idx_ac66f0: List<Any>) {
    unwrap(this).setResourceTags(__idx_ac66f0)
  }

  public open fun resourceTags(vararg __idx_ac66f0: Any): Unit = resourceTags(__idx_ac66f0.toList())

  public open fun subscribers(): Any = unwrap(this).getSubscribers()

  public open fun subscribers(`value`: IResolvable) {
    unwrap(this).setSubscribers(`value`.let(IResolvable::unwrap))
  }

  public open fun subscribers(__idx_ac66f0: List<Any>) {
    unwrap(this).setSubscribers(__idx_ac66f0)
  }

  public open fun subscribers(vararg __idx_ac66f0: Any): Unit = subscribers(__idx_ac66f0.toList())

  public open fun subscriptionName(): String = unwrap(this).getSubscriptionName()

  public open fun subscriptionName(`value`: String) {
    unwrap(this).setSubscriptionName(`value`)
  }

  public open fun threshold(): Number? = unwrap(this).getThreshold()

  public open fun threshold(`value`: Number) {
    unwrap(this).setThreshold(`value`)
  }

  public open fun thresholdExpression(): String? = unwrap(this).getThresholdExpression()

  public open fun thresholdExpression(`value`: String) {
    unwrap(this).setThresholdExpression(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun frequency(frequency: String)

    public fun monitorArnList(monitorArnList: List<String>)

    public fun monitorArnList(vararg monitorArnList: String)

    public fun resourceTags(resourceTags: IResolvable)

    public fun resourceTags(resourceTags: List<Any>)

    public fun resourceTags(vararg resourceTags: Any)

    public fun subscribers(subscribers: IResolvable)

    public fun subscribers(subscribers: List<Any>)

    public fun subscribers(vararg subscribers: Any)

    public fun subscriptionName(subscriptionName: String)

    public fun threshold(threshold: Number)

    public fun thresholdExpression(thresholdExpression: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ce.CfnAnomalySubscription.Builder =
        software.amazon.awscdk.services.ce.CfnAnomalySubscription.Builder.create(scope, id)

    override fun frequency(frequency: String) {
      cdkBuilder.frequency(frequency)
    }

    override fun monitorArnList(monitorArnList: List<String>) {
      cdkBuilder.monitorArnList(monitorArnList)
    }

    override fun monitorArnList(vararg monitorArnList: String): Unit =
        monitorArnList(monitorArnList.toList())

    override fun resourceTags(resourceTags: IResolvable) {
      cdkBuilder.resourceTags(resourceTags.let(IResolvable::unwrap))
    }

    override fun resourceTags(resourceTags: List<Any>) {
      cdkBuilder.resourceTags(resourceTags)
    }

    override fun resourceTags(vararg resourceTags: Any): Unit = resourceTags(resourceTags.toList())

    override fun subscribers(subscribers: IResolvable) {
      cdkBuilder.subscribers(subscribers.let(IResolvable::unwrap))
    }

    override fun subscribers(subscribers: List<Any>) {
      cdkBuilder.subscribers(subscribers)
    }

    override fun subscribers(vararg subscribers: Any): Unit = subscribers(subscribers.toList())

    override fun subscriptionName(subscriptionName: String) {
      cdkBuilder.subscriptionName(subscriptionName)
    }

    override fun threshold(threshold: Number) {
      cdkBuilder.threshold(threshold)
    }

    override fun thresholdExpression(thresholdExpression: String) {
      cdkBuilder.thresholdExpression(thresholdExpression)
    }

    public fun build(): software.amazon.awscdk.services.ce.CfnAnomalySubscription =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ce.CfnAnomalySubscription.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAnomalySubscription {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAnomalySubscription(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ce.CfnAnomalySubscription):
        CfnAnomalySubscription = CfnAnomalySubscription(cdkObject)

    internal fun unwrap(wrapped: CfnAnomalySubscription):
        software.amazon.awscdk.services.ce.CfnAnomalySubscription = wrapped.cdkObject
  }

  public interface ResourceTagProperty {
    public fun key(): String

    public fun `value`(): String

    @CdkDslMarker
    public interface Builder {
      public fun key(key: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ce.CfnAnomalySubscription.ResourceTagProperty.Builder =
          software.amazon.awscdk.services.ce.CfnAnomalySubscription.ResourceTagProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.ce.CfnAnomalySubscription.ResourceTagProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ce.CfnAnomalySubscription.ResourceTagProperty,
    ) : CdkObject(cdkObject), ResourceTagProperty {
      override fun key(): String = unwrap(this).getKey()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceTagProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ce.CfnAnomalySubscription.ResourceTagProperty):
          ResourceTagProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceTagProperty):
          software.amazon.awscdk.services.ce.CfnAnomalySubscription.ResourceTagProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ce.CfnAnomalySubscription.ResourceTagProperty
    }
  }

  public interface SubscriberProperty {
    public fun address(): String

    public fun status(): String? = unwrap(this).getStatus()

    public fun type(): String

    @CdkDslMarker
    public interface Builder {
      public fun address(address: String)

      public fun status(status: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ce.CfnAnomalySubscription.SubscriberProperty.Builder =
          software.amazon.awscdk.services.ce.CfnAnomalySubscription.SubscriberProperty.builder()

      override fun address(address: String) {
        cdkBuilder.address(address)
      }

      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.ce.CfnAnomalySubscription.SubscriberProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ce.CfnAnomalySubscription.SubscriberProperty,
    ) : CdkObject(cdkObject), SubscriberProperty {
      override fun address(): String = unwrap(this).getAddress()

      override fun status(): String? = unwrap(this).getStatus()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SubscriberProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ce.CfnAnomalySubscription.SubscriberProperty):
          SubscriberProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SubscriberProperty):
          software.amazon.awscdk.services.ce.CfnAnomalySubscription.SubscriberProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ce.CfnAnomalySubscription.SubscriberProperty
    }
  }
}
