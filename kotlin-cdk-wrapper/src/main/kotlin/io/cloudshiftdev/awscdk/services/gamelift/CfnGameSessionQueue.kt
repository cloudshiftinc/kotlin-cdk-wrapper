@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.gamelift

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
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
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnGameSessionQueue internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.gamelift.CfnGameSessionQueue,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrName(): String = unwrap(this).getAttrName()

  public open fun customEventData(): String? = unwrap(this).getCustomEventData()

  public open fun customEventData(`value`: String) {
    unwrap(this).setCustomEventData(`value`)
  }

  public open fun destinations(): Any? = unwrap(this).getDestinations()

  public open fun destinations(`value`: IResolvable) {
    unwrap(this).setDestinations(`value`.let(IResolvable::unwrap))
  }

  public open fun destinations(__idx_ac66f0: List<Any>) {
    unwrap(this).setDestinations(__idx_ac66f0)
  }

  public open fun destinations(vararg __idx_ac66f0: Any): Unit = destinations(__idx_ac66f0.toList())

  public open fun filterConfiguration(): Any? = unwrap(this).getFilterConfiguration()

  public open fun filterConfiguration(`value`: IResolvable) {
    unwrap(this).setFilterConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun filterConfiguration(`value`: FilterConfigurationProperty) {
    unwrap(this).setFilterConfiguration(`value`.let(FilterConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("204b2efaf1bd7eea2f0f012001883b66c4d8a2dac69fa996de9c68c877aeb4bf")
  public open fun filterConfiguration(`value`: FilterConfigurationProperty.Builder.() -> Unit): Unit
      = filterConfiguration(FilterConfigurationProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun notificationTarget(): String? = unwrap(this).getNotificationTarget()

  public open fun notificationTarget(`value`: String) {
    unwrap(this).setNotificationTarget(`value`)
  }

  public open fun playerLatencyPolicies(): Any? = unwrap(this).getPlayerLatencyPolicies()

  public open fun playerLatencyPolicies(`value`: IResolvable) {
    unwrap(this).setPlayerLatencyPolicies(`value`.let(IResolvable::unwrap))
  }

  public open fun playerLatencyPolicies(__idx_ac66f0: List<Any>) {
    unwrap(this).setPlayerLatencyPolicies(__idx_ac66f0)
  }

  public open fun playerLatencyPolicies(vararg __idx_ac66f0: Any): Unit =
      playerLatencyPolicies(__idx_ac66f0.toList())

  public open fun priorityConfiguration(): Any? = unwrap(this).getPriorityConfiguration()

  public open fun priorityConfiguration(`value`: IResolvable) {
    unwrap(this).setPriorityConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun priorityConfiguration(`value`: PriorityConfigurationProperty) {
    unwrap(this).setPriorityConfiguration(`value`.let(PriorityConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3462340d66fa05af70cf735631e6378419bbdc3d8440fa54dab6b48cbb54e7f3")
  public open fun priorityConfiguration(`value`: PriorityConfigurationProperty.Builder.() -> Unit):
      Unit = priorityConfiguration(PriorityConfigurationProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun timeoutInSeconds(): Number? = unwrap(this).getTimeoutInSeconds()

  public open fun timeoutInSeconds(`value`: Number) {
    unwrap(this).setTimeoutInSeconds(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun customEventData(customEventData: String)

    public fun destinations(destinations: IResolvable)

    public fun destinations(destinations: List<Any>)

    public fun destinations(vararg destinations: Any)

    public fun filterConfiguration(filterConfiguration: IResolvable)

    public fun filterConfiguration(filterConfiguration: FilterConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4717dd2c850e96d586fa6e1e0676b2e373d9cb31137318484e8a75790af3a5aa")
    public
        fun filterConfiguration(filterConfiguration: FilterConfigurationProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun notificationTarget(notificationTarget: String)

    public fun playerLatencyPolicies(playerLatencyPolicies: IResolvable)

    public fun playerLatencyPolicies(playerLatencyPolicies: List<Any>)

    public fun playerLatencyPolicies(vararg playerLatencyPolicies: Any)

    public fun priorityConfiguration(priorityConfiguration: IResolvable)

    public fun priorityConfiguration(priorityConfiguration: PriorityConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c59baed8336d52c5e8b8ad2a6ba6539415b0e2244a21170289c872eadd1474fd")
    public
        fun priorityConfiguration(priorityConfiguration: PriorityConfigurationProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun timeoutInSeconds(timeoutInSeconds: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.Builder =
        software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.Builder.create(scope, id)

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

    override fun filterConfiguration(filterConfiguration: FilterConfigurationProperty) {
      cdkBuilder.filterConfiguration(filterConfiguration.let(FilterConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4717dd2c850e96d586fa6e1e0676b2e373d9cb31137318484e8a75790af3a5aa")
    override
        fun filterConfiguration(filterConfiguration: FilterConfigurationProperty.Builder.() -> Unit):
        Unit = filterConfiguration(FilterConfigurationProperty(filterConfiguration))

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

    override fun priorityConfiguration(priorityConfiguration: PriorityConfigurationProperty) {
      cdkBuilder.priorityConfiguration(priorityConfiguration.let(PriorityConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c59baed8336d52c5e8b8ad2a6ba6539415b0e2244a21170289c872eadd1474fd")
    override
        fun priorityConfiguration(priorityConfiguration: PriorityConfigurationProperty.Builder.() -> Unit):
        Unit = priorityConfiguration(PriorityConfigurationProperty(priorityConfiguration))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun timeoutInSeconds(timeoutInSeconds: Number) {
      cdkBuilder.timeoutInSeconds(timeoutInSeconds)
    }

    public fun build(): software.amazon.awscdk.services.gamelift.CfnGameSessionQueue =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGameSessionQueue {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGameSessionQueue(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnGameSessionQueue):
        CfnGameSessionQueue = CfnGameSessionQueue(cdkObject)

    internal fun unwrap(wrapped: CfnGameSessionQueue):
        software.amazon.awscdk.services.gamelift.CfnGameSessionQueue = wrapped.cdkObject
  }

  public interface PriorityConfigurationProperty {
    public fun locationOrder(): List<String> = unwrap(this).getLocationOrder() ?: emptyList()

    public fun priorityOrder(): List<String> = unwrap(this).getPriorityOrder() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun locationOrder(locationOrder: List<String>)

      public fun locationOrder(vararg locationOrder: String)

      public fun priorityOrder(priorityOrder: List<String>)

      public fun priorityOrder(vararg priorityOrder: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.PriorityConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.PriorityConfigurationProperty.builder()

      override fun locationOrder(locationOrder: List<String>) {
        cdkBuilder.locationOrder(locationOrder)
      }

      override fun locationOrder(vararg locationOrder: String): Unit =
          locationOrder(locationOrder.toList())

      override fun priorityOrder(priorityOrder: List<String>) {
        cdkBuilder.priorityOrder(priorityOrder)
      }

      override fun priorityOrder(vararg priorityOrder: String): Unit =
          priorityOrder(priorityOrder.toList())

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.PriorityConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.PriorityConfigurationProperty,
    ) : CdkObject(cdkObject), PriorityConfigurationProperty {
      override fun locationOrder(): List<String> = unwrap(this).getLocationOrder() ?: emptyList()

      override fun priorityOrder(): List<String> = unwrap(this).getPriorityOrder() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PriorityConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.PriorityConfigurationProperty):
          PriorityConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PriorityConfigurationProperty):
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.PriorityConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.PriorityConfigurationProperty
    }
  }

  public interface DestinationProperty {
    public fun destinationArn(): String? = unwrap(this).getDestinationArn()

    @CdkDslMarker
    public interface Builder {
      public fun destinationArn(destinationArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.DestinationProperty.Builder =
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.DestinationProperty.builder()

      override fun destinationArn(destinationArn: String) {
        cdkBuilder.destinationArn(destinationArn)
      }

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.DestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.DestinationProperty,
    ) : CdkObject(cdkObject), DestinationProperty {
      override fun destinationArn(): String? = unwrap(this).getDestinationArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.DestinationProperty):
          DestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DestinationProperty):
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.DestinationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.DestinationProperty
    }
  }

  public interface PlayerLatencyPolicyProperty {
    public fun maximumIndividualPlayerLatencyMilliseconds(): Number? =
        unwrap(this).getMaximumIndividualPlayerLatencyMilliseconds()

    public fun policyDurationSeconds(): Number? = unwrap(this).getPolicyDurationSeconds()

    @CdkDslMarker
    public interface Builder {
      public
          fun maximumIndividualPlayerLatencyMilliseconds(maximumIndividualPlayerLatencyMilliseconds: Number)

      public fun policyDurationSeconds(policyDurationSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.PlayerLatencyPolicyProperty.Builder
          =
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.PlayerLatencyPolicyProperty.builder()

      override
          fun maximumIndividualPlayerLatencyMilliseconds(maximumIndividualPlayerLatencyMilliseconds: Number) {
        cdkBuilder.maximumIndividualPlayerLatencyMilliseconds(maximumIndividualPlayerLatencyMilliseconds)
      }

      override fun policyDurationSeconds(policyDurationSeconds: Number) {
        cdkBuilder.policyDurationSeconds(policyDurationSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.PlayerLatencyPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.PlayerLatencyPolicyProperty,
    ) : CdkObject(cdkObject), PlayerLatencyPolicyProperty {
      override fun maximumIndividualPlayerLatencyMilliseconds(): Number? =
          unwrap(this).getMaximumIndividualPlayerLatencyMilliseconds()

      override fun policyDurationSeconds(): Number? = unwrap(this).getPolicyDurationSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PlayerLatencyPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.PlayerLatencyPolicyProperty):
          PlayerLatencyPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PlayerLatencyPolicyProperty):
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.PlayerLatencyPolicyProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.PlayerLatencyPolicyProperty
    }
  }

  public interface FilterConfigurationProperty {
    public fun allowedLocations(): List<String> = unwrap(this).getAllowedLocations() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun allowedLocations(allowedLocations: List<String>)

      public fun allowedLocations(vararg allowedLocations: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.FilterConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.FilterConfigurationProperty.builder()

      override fun allowedLocations(allowedLocations: List<String>) {
        cdkBuilder.allowedLocations(allowedLocations)
      }

      override fun allowedLocations(vararg allowedLocations: String): Unit =
          allowedLocations(allowedLocations.toList())

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.FilterConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.FilterConfigurationProperty,
    ) : CdkObject(cdkObject), FilterConfigurationProperty {
      override fun allowedLocations(): List<String> = unwrap(this).getAllowedLocations() ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FilterConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.FilterConfigurationProperty):
          FilterConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterConfigurationProperty):
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.FilterConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.FilterConfigurationProperty
    }
  }

  public interface GameSessionQueueDestinationProperty {
    public fun destinationArn(): String? = unwrap(this).getDestinationArn()

    @CdkDslMarker
    public interface Builder {
      public fun destinationArn(destinationArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.GameSessionQueueDestinationProperty.Builder
          =
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.GameSessionQueueDestinationProperty.builder()

      override fun destinationArn(destinationArn: String) {
        cdkBuilder.destinationArn(destinationArn)
      }

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.GameSessionQueueDestinationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.GameSessionQueueDestinationProperty,
    ) : CdkObject(cdkObject), GameSessionQueueDestinationProperty {
      override fun destinationArn(): String? = unwrap(this).getDestinationArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          GameSessionQueueDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.GameSessionQueueDestinationProperty):
          GameSessionQueueDestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GameSessionQueueDestinationProperty):
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.GameSessionQueueDestinationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.GameSessionQueueDestinationProperty
    }
  }
}
