@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CfnSubscriptionProps {
  public fun deliveryPolicy(): Any? = unwrap(this).getDeliveryPolicy()

  public fun endpoint(): String? = unwrap(this).getEndpoint()

  public fun filterPolicy(): Any? = unwrap(this).getFilterPolicy()

  public fun filterPolicyScope(): String? = unwrap(this).getFilterPolicyScope()

  public fun protocol(): String

  public fun rawMessageDelivery(): Any? = unwrap(this).getRawMessageDelivery()

  public fun redrivePolicy(): Any? = unwrap(this).getRedrivePolicy()

  public fun region(): String? = unwrap(this).getRegion()

  public fun replayPolicy(): Any? = unwrap(this).getReplayPolicy()

  public fun subscriptionRoleArn(): String? = unwrap(this).getSubscriptionRoleArn()

  public fun topicArn(): String

  @CdkDslMarker
  public interface Builder {
    public fun deliveryPolicy(deliveryPolicy: Any)

    public fun endpoint(endpoint: String)

    public fun filterPolicy(filterPolicy: Any)

    public fun filterPolicyScope(filterPolicyScope: String)

    public fun protocol(protocol: String)

    public fun rawMessageDelivery(rawMessageDelivery: Boolean)

    public fun rawMessageDelivery(rawMessageDelivery: IResolvable)

    public fun redrivePolicy(redrivePolicy: Any)

    public fun region(region: String)

    public fun replayPolicy(replayPolicy: Any)

    public fun subscriptionRoleArn(subscriptionRoleArn: String)

    public fun topicArn(topicArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sns.CfnSubscriptionProps.Builder =
        software.amazon.awscdk.services.sns.CfnSubscriptionProps.builder()

    override fun deliveryPolicy(deliveryPolicy: Any) {
      cdkBuilder.deliveryPolicy(deliveryPolicy)
    }

    override fun endpoint(endpoint: String) {
      cdkBuilder.endpoint(endpoint)
    }

    override fun filterPolicy(filterPolicy: Any) {
      cdkBuilder.filterPolicy(filterPolicy)
    }

    override fun filterPolicyScope(filterPolicyScope: String) {
      cdkBuilder.filterPolicyScope(filterPolicyScope)
    }

    override fun protocol(protocol: String) {
      cdkBuilder.protocol(protocol)
    }

    override fun rawMessageDelivery(rawMessageDelivery: Boolean) {
      cdkBuilder.rawMessageDelivery(rawMessageDelivery)
    }

    override fun rawMessageDelivery(rawMessageDelivery: IResolvable) {
      cdkBuilder.rawMessageDelivery(rawMessageDelivery.let(IResolvable::unwrap))
    }

    override fun redrivePolicy(redrivePolicy: Any) {
      cdkBuilder.redrivePolicy(redrivePolicy)
    }

    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    override fun replayPolicy(replayPolicy: Any) {
      cdkBuilder.replayPolicy(replayPolicy)
    }

    override fun subscriptionRoleArn(subscriptionRoleArn: String) {
      cdkBuilder.subscriptionRoleArn(subscriptionRoleArn)
    }

    override fun topicArn(topicArn: String) {
      cdkBuilder.topicArn(topicArn)
    }

    public fun build(): software.amazon.awscdk.services.sns.CfnSubscriptionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sns.CfnSubscriptionProps,
  ) : CdkObject(cdkObject), CfnSubscriptionProps {
    override fun deliveryPolicy(): Any? = unwrap(this).getDeliveryPolicy()

    override fun endpoint(): String? = unwrap(this).getEndpoint()

    override fun filterPolicy(): Any? = unwrap(this).getFilterPolicy()

    override fun filterPolicyScope(): String? = unwrap(this).getFilterPolicyScope()

    override fun protocol(): String = unwrap(this).getProtocol()

    override fun rawMessageDelivery(): Any? = unwrap(this).getRawMessageDelivery()

    override fun redrivePolicy(): Any? = unwrap(this).getRedrivePolicy()

    override fun region(): String? = unwrap(this).getRegion()

    override fun replayPolicy(): Any? = unwrap(this).getReplayPolicy()

    override fun subscriptionRoleArn(): String? = unwrap(this).getSubscriptionRoleArn()

    override fun topicArn(): String = unwrap(this).getTopicArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSubscriptionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.CfnSubscriptionProps):
        CfnSubscriptionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSubscriptionProps):
        software.amazon.awscdk.services.sns.CfnSubscriptionProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.sns.CfnSubscriptionProps
  }
}
