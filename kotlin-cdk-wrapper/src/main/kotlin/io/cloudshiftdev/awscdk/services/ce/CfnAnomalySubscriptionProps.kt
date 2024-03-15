@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ce

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnAnomalySubscriptionProps {
  public fun frequency(): String

  public fun monitorArnList(): List<String>

  public fun resourceTags(): Any? = unwrap(this).getResourceTags()

  public fun subscribers(): Any

  public fun subscriptionName(): String

  public fun threshold(): Number? = unwrap(this).getThreshold()

  public fun thresholdExpression(): String? = unwrap(this).getThresholdExpression()

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

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ce.CfnAnomalySubscriptionProps.Builder =
        software.amazon.awscdk.services.ce.CfnAnomalySubscriptionProps.builder()

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

    public fun build(): software.amazon.awscdk.services.ce.CfnAnomalySubscriptionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ce.CfnAnomalySubscriptionProps,
  ) : CdkObject(cdkObject), CfnAnomalySubscriptionProps {
    override fun frequency(): String = unwrap(this).getFrequency()

    override fun monitorArnList(): List<String> = unwrap(this).getMonitorArnList()

    override fun resourceTags(): Any? = unwrap(this).getResourceTags()

    override fun subscribers(): Any = unwrap(this).getSubscribers()

    override fun subscriptionName(): String = unwrap(this).getSubscriptionName()

    override fun threshold(): Number? = unwrap(this).getThreshold()

    override fun thresholdExpression(): String? = unwrap(this).getThresholdExpression()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAnomalySubscriptionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ce.CfnAnomalySubscriptionProps):
        CfnAnomalySubscriptionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAnomalySubscriptionProps):
        software.amazon.awscdk.services.ce.CfnAnomalySubscriptionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ce.CfnAnomalySubscriptionProps
  }
}
