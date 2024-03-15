@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.gamelift

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnGameSessionQueueProps {
  public fun customEventData(): String? = unwrap(this).getCustomEventData()

  public fun destinations(): Any? = unwrap(this).getDestinations()

  public fun filterConfiguration(): Any? = unwrap(this).getFilterConfiguration()

  public fun name(): String

  public fun notificationTarget(): String? = unwrap(this).getNotificationTarget()

  public fun playerLatencyPolicies(): Any? = unwrap(this).getPlayerLatencyPolicies()

  public fun priorityConfiguration(): Any? = unwrap(this).getPriorityConfiguration()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun timeoutInSeconds(): Number? = unwrap(this).getTimeoutInSeconds()

  @CdkDslMarker
  public interface Builder {
    public fun customEventData(customEventData: String)

    public fun destinations(destinations: IResolvable)

    public fun destinations(destinations: List<Any>)

    public fun destinations(vararg destinations: Any)

    public fun filterConfiguration(filterConfiguration: IResolvable)

    public
        fun filterConfiguration(filterConfiguration: CfnGameSessionQueue.FilterConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7ee629f678dc10d378126b98cf23a19aec2e85b6dd1c79670aa81dfc33559e5e")
    public
        fun filterConfiguration(filterConfiguration: CfnGameSessionQueue.FilterConfigurationProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun notificationTarget(notificationTarget: String)

    public fun playerLatencyPolicies(playerLatencyPolicies: IResolvable)

    public fun playerLatencyPolicies(playerLatencyPolicies: List<Any>)

    public fun playerLatencyPolicies(vararg playerLatencyPolicies: Any)

    public fun priorityConfiguration(priorityConfiguration: IResolvable)

    public
        fun priorityConfiguration(priorityConfiguration: CfnGameSessionQueue.PriorityConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("54230d7209758eb9ffae19555357a8734a2df16adec9c256d744ecff7c0bef91")
    public
        fun priorityConfiguration(priorityConfiguration: CfnGameSessionQueue.PriorityConfigurationProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun timeoutInSeconds(timeoutInSeconds: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.gamelift.CfnGameSessionQueueProps.Builder =
        software.amazon.awscdk.services.gamelift.CfnGameSessionQueueProps.builder()

    override fun customEventData(customEventData: String) {
      cdkBuilder.customEventData(customEventData)
    }

    override fun destinations(destinations: IResolvable) {
      cdkBuilder.destinations(destinations.let(IResolvable::unwrap))
    }

    override fun destinations(destinations: List<Any>) {
      cdkBuilder.destinations(destinations)
    }

    override fun destinations(vararg destinations: Any): Unit = destinations(destinations.toList())

    override fun filterConfiguration(filterConfiguration: IResolvable) {
      cdkBuilder.filterConfiguration(filterConfiguration.let(IResolvable::unwrap))
    }

    override
        fun filterConfiguration(filterConfiguration: CfnGameSessionQueue.FilterConfigurationProperty) {
      cdkBuilder.filterConfiguration(filterConfiguration.let(CfnGameSessionQueue.FilterConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7ee629f678dc10d378126b98cf23a19aec2e85b6dd1c79670aa81dfc33559e5e")
    override
        fun filterConfiguration(filterConfiguration: CfnGameSessionQueue.FilterConfigurationProperty.Builder.() -> Unit):
        Unit =
        filterConfiguration(CfnGameSessionQueue.FilterConfigurationProperty(filterConfiguration))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun notificationTarget(notificationTarget: String) {
      cdkBuilder.notificationTarget(notificationTarget)
    }

    override fun playerLatencyPolicies(playerLatencyPolicies: IResolvable) {
      cdkBuilder.playerLatencyPolicies(playerLatencyPolicies.let(IResolvable::unwrap))
    }

    override fun playerLatencyPolicies(playerLatencyPolicies: List<Any>) {
      cdkBuilder.playerLatencyPolicies(playerLatencyPolicies)
    }

    override fun playerLatencyPolicies(vararg playerLatencyPolicies: Any): Unit =
        playerLatencyPolicies(playerLatencyPolicies.toList())

    override fun priorityConfiguration(priorityConfiguration: IResolvable) {
      cdkBuilder.priorityConfiguration(priorityConfiguration.let(IResolvable::unwrap))
    }

    override
        fun priorityConfiguration(priorityConfiguration: CfnGameSessionQueue.PriorityConfigurationProperty) {
      cdkBuilder.priorityConfiguration(priorityConfiguration.let(CfnGameSessionQueue.PriorityConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("54230d7209758eb9ffae19555357a8734a2df16adec9c256d744ecff7c0bef91")
    override
        fun priorityConfiguration(priorityConfiguration: CfnGameSessionQueue.PriorityConfigurationProperty.Builder.() -> Unit):
        Unit =
        priorityConfiguration(CfnGameSessionQueue.PriorityConfigurationProperty(priorityConfiguration))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun timeoutInSeconds(timeoutInSeconds: Number) {
      cdkBuilder.timeoutInSeconds(timeoutInSeconds)
    }

    public fun build(): software.amazon.awscdk.services.gamelift.CfnGameSessionQueueProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.gamelift.CfnGameSessionQueueProps,
  ) : CdkObject(cdkObject), CfnGameSessionQueueProps {
    override fun customEventData(): String? = unwrap(this).getCustomEventData()

    override fun destinations(): Any? = unwrap(this).getDestinations()

    override fun filterConfiguration(): Any? = unwrap(this).getFilterConfiguration()

    override fun name(): String = unwrap(this).getName()

    override fun notificationTarget(): String? = unwrap(this).getNotificationTarget()

    override fun playerLatencyPolicies(): Any? = unwrap(this).getPlayerLatencyPolicies()

    override fun priorityConfiguration(): Any? = unwrap(this).getPriorityConfiguration()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun timeoutInSeconds(): Number? = unwrap(this).getTimeoutInSeconds()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGameSessionQueueProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnGameSessionQueueProps):
        CfnGameSessionQueueProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGameSessionQueueProps):
        software.amazon.awscdk.services.gamelift.CfnGameSessionQueueProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.gamelift.CfnGameSessionQueueProps
  }
}
