package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSubscription internal constructor(
  private val cdkObject: software.amazon.awscdk.services.sns.CfnSubscription,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun deliveryPolicy(): Any? = unwrap(this).getDeliveryPolicy()

  public open fun deliveryPolicy(`value`: Any) {
    unwrap(this).setDeliveryPolicy(`value`)
  }

  public open fun endpoint(): String? = unwrap(this).getEndpoint()

  public open fun endpoint(`value`: String) {
    unwrap(this).setEndpoint(`value`)
  }

  public open fun filterPolicy(): Any? = unwrap(this).getFilterPolicy()

  public open fun filterPolicy(`value`: Any) {
    unwrap(this).setFilterPolicy(`value`)
  }

  public open fun filterPolicyScope(): String? = unwrap(this).getFilterPolicyScope()

  public open fun filterPolicyScope(`value`: String) {
    unwrap(this).setFilterPolicyScope(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun protocol(): String = unwrap(this).getProtocol()

  public open fun protocol(`value`: String) {
    unwrap(this).setProtocol(`value`)
  }

  public open fun rawMessageDelivery(): Any? = unwrap(this).getRawMessageDelivery()

  public open fun rawMessageDelivery(`value`: Boolean) {
    unwrap(this).setRawMessageDelivery(`value`)
  }

  public open fun rawMessageDelivery(`value`: IResolvable) {
    unwrap(this).setRawMessageDelivery(`value`.let(IResolvable::unwrap))
  }

  public open fun redrivePolicy(): Any? = unwrap(this).getRedrivePolicy()

  public open fun redrivePolicy(`value`: Any) {
    unwrap(this).setRedrivePolicy(`value`)
  }

  public open fun region(): String? = unwrap(this).getRegion()

  public open fun region(`value`: String) {
    unwrap(this).setRegion(`value`)
  }

  public open fun replayPolicy(): Any? = unwrap(this).getReplayPolicy()

  public open fun replayPolicy(`value`: Any) {
    unwrap(this).setReplayPolicy(`value`)
  }

  public open fun subscriptionRoleArn(): String? = unwrap(this).getSubscriptionRoleArn()

  public open fun subscriptionRoleArn(`value`: String) {
    unwrap(this).setSubscriptionRoleArn(`value`)
  }

  public open fun topicArn(): String = unwrap(this).getTopicArn()

  public open fun topicArn(`value`: String) {
    unwrap(this).setTopicArn(`value`)
  }

  public interface Builder {
    public fun deliveryPolicy(deliveryPolicy: Any) {
    }

    public fun endpoint(endpoint: String) {
    }

    public fun filterPolicy(filterPolicy: Any) {
    }

    public fun filterPolicyScope(filterPolicyScope: String) {
    }

    public fun protocol(protocol: String) {
    }

    public fun rawMessageDelivery(rawMessageDelivery: Boolean) {
    }

    public fun rawMessageDelivery(rawMessageDelivery: IResolvable) {
    }

    public fun redrivePolicy(redrivePolicy: Any) {
    }

    public fun region(region: String) {
    }

    public fun replayPolicy(replayPolicy: Any) {
    }

    public fun subscriptionRoleArn(subscriptionRoleArn: String) {
    }

    public fun topicArn(topicArn: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sns.CfnSubscription.Builder =
        software.amazon.awscdk.services.sns.CfnSubscription.Builder.create(scope, id)

    public override fun deliveryPolicy(deliveryPolicy: Any) {
      cdkBuilder.deliveryPolicy(deliveryPolicy)
    }

    public override fun endpoint(endpoint: String) {
      cdkBuilder.endpoint(endpoint)
    }

    public override fun filterPolicy(filterPolicy: Any) {
      cdkBuilder.filterPolicy(filterPolicy)
    }

    public override fun filterPolicyScope(filterPolicyScope: String) {
      cdkBuilder.filterPolicyScope(filterPolicyScope)
    }

    public override fun protocol(protocol: String) {
      cdkBuilder.protocol(protocol)
    }

    public override fun rawMessageDelivery(rawMessageDelivery: Boolean) {
      cdkBuilder.rawMessageDelivery(rawMessageDelivery)
    }

    public override fun rawMessageDelivery(rawMessageDelivery: IResolvable) {
      cdkBuilder.rawMessageDelivery(rawMessageDelivery.let(IResolvable::unwrap))
    }

    public override fun redrivePolicy(redrivePolicy: Any) {
      cdkBuilder.redrivePolicy(redrivePolicy)
    }

    public override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public override fun replayPolicy(replayPolicy: Any) {
      cdkBuilder.replayPolicy(replayPolicy)
    }

    public override fun subscriptionRoleArn(subscriptionRoleArn: String) {
      cdkBuilder.subscriptionRoleArn(subscriptionRoleArn)
    }

    public override fun topicArn(topicArn: String) {
      cdkBuilder.topicArn(topicArn)
    }

    public fun build(): software.amazon.awscdk.services.sns.CfnSubscription = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSubscription {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSubscription(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.CfnSubscription):
        CfnSubscription = CfnSubscription(cdkObject)

    internal fun unwrap(wrapped: CfnSubscription):
        software.amazon.awscdk.services.sns.CfnSubscription = wrapped.cdkObject
  }
}
