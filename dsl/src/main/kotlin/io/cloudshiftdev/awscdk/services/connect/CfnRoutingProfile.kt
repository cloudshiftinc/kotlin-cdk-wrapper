package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRoutingProfile internal constructor(
  private val cdkObject: software.amazon.awscdk.services.connect.CfnRoutingProfile,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun agentAvailabilityTimer(): String? = unwrap(this).getAgentAvailabilityTimer()

  public open fun agentAvailabilityTimer(`value`: String) {
    unwrap(this).setAgentAvailabilityTimer(`value`)
  }

  public open fun attrRoutingProfileArn(): String = unwrap(this).getAttrRoutingProfileArn()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun defaultOutboundQueueArn(): String = unwrap(this).getDefaultOutboundQueueArn()

  public open fun defaultOutboundQueueArn(`value`: String) {
    unwrap(this).setDefaultOutboundQueueArn(`value`)
  }

  public open fun description(): String = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceArn(): String = unwrap(this).getInstanceArn()

  public open fun instanceArn(`value`: String) {
    unwrap(this).setInstanceArn(`value`)
  }

  public open fun mediaConcurrencies(): Any = unwrap(this).getMediaConcurrencies()

  public open fun mediaConcurrencies(`value`: IResolvable) {
    unwrap(this).setMediaConcurrencies(`value`.let(IResolvable::unwrap))
  }

  public open fun mediaConcurrencies(__idx_ac66f0: List<Any>) {
    unwrap(this).setMediaConcurrencies(__idx_ac66f0)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun queueConfigs(): Any? = unwrap(this).getQueueConfigs()

  public open fun queueConfigs(`value`: IResolvable) {
    unwrap(this).setQueueConfigs(`value`.let(IResolvable::unwrap))
  }

  public open fun queueConfigs(__idx_ac66f0: List<Any>) {
    unwrap(this).setQueueConfigs(__idx_ac66f0)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun agentAvailabilityTimer(agentAvailabilityTimer: String) {
    }

    public fun defaultOutboundQueueArn(defaultOutboundQueueArn: String) {
    }

    public fun description(description: String) {
    }

    public fun instanceArn(instanceArn: String) {
    }

    public fun mediaConcurrencies(mediaConcurrencies: IResolvable) {
    }

    public fun mediaConcurrencies(mediaConcurrencies: List<Any>) {
    }

    public fun name(name: String) {
    }

    public fun queueConfigs(queueConfigs: IResolvable) {
    }

    public fun queueConfigs(queueConfigs: List<Any>) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnRoutingProfile.Builder =
        software.amazon.awscdk.services.connect.CfnRoutingProfile.Builder.create(scope, id)

    public override fun agentAvailabilityTimer(agentAvailabilityTimer: String) {
      cdkBuilder.agentAvailabilityTimer(agentAvailabilityTimer)
    }

    public override fun defaultOutboundQueueArn(defaultOutboundQueueArn: String) {
      cdkBuilder.defaultOutboundQueueArn(defaultOutboundQueueArn)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    public override fun mediaConcurrencies(mediaConcurrencies: IResolvable) {
      cdkBuilder.mediaConcurrencies(mediaConcurrencies.let(IResolvable::unwrap))
    }

    public override fun mediaConcurrencies(mediaConcurrencies: List<Any>) {
      cdkBuilder.mediaConcurrencies(mediaConcurrencies)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun queueConfigs(queueConfigs: IResolvable) {
      cdkBuilder.queueConfigs(queueConfigs.let(IResolvable::unwrap))
    }

    public override fun queueConfigs(queueConfigs: List<Any>) {
      cdkBuilder.queueConfigs(queueConfigs)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnRoutingProfile =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRoutingProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRoutingProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnRoutingProfile):
        CfnRoutingProfile = CfnRoutingProfile(cdkObject)

    internal fun unwrap(wrapped: CfnRoutingProfile):
        software.amazon.awscdk.services.connect.CfnRoutingProfile = wrapped.cdkObject
  }

  public interface CrossChannelBehaviorProperty {
    public fun behaviorType(): String

    public interface Builder {
      public fun behaviorType(behaviorType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnRoutingProfile.CrossChannelBehaviorProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnRoutingProfile.CrossChannelBehaviorProperty.builder()

      public override fun behaviorType(behaviorType: String) {
        cdkBuilder.behaviorType(behaviorType)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnRoutingProfile.CrossChannelBehaviorProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnRoutingProfile.CrossChannelBehaviorProperty,
    ) : CrossChannelBehaviorProperty {
      public override fun behaviorType(): String = unwrap(this).getBehaviorType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CrossChannelBehaviorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnRoutingProfile.CrossChannelBehaviorProperty):
          CrossChannelBehaviorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CrossChannelBehaviorProperty):
          software.amazon.awscdk.services.connect.CfnRoutingProfile.CrossChannelBehaviorProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MediaConcurrencyProperty {
    public fun channel(): String

    public fun concurrency(): Number

    public fun crossChannelBehavior(): Any? = unwrap(this).getCrossChannelBehavior()

    public interface Builder {
      public fun channel(channel: String) {
      }

      public fun concurrency(concurrency: Number) {
      }

      public fun crossChannelBehavior(crossChannelBehavior: IResolvable) {
      }

      public fun crossChannelBehavior(crossChannelBehavior: CrossChannelBehaviorProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cfcde8aa362d223ee3c2ab2d6377b352befebe3fface34711f13a5df2121a4ab")
      public
          fun crossChannelBehavior(crossChannelBehavior: CrossChannelBehaviorProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnRoutingProfile.MediaConcurrencyProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnRoutingProfile.MediaConcurrencyProperty.builder()

      public override fun channel(channel: String) {
        cdkBuilder.channel(channel)
      }

      public override fun concurrency(concurrency: Number) {
        cdkBuilder.concurrency(concurrency)
      }

      public override fun crossChannelBehavior(crossChannelBehavior: IResolvable) {
        cdkBuilder.crossChannelBehavior(crossChannelBehavior.let(IResolvable::unwrap))
      }

      public override fun crossChannelBehavior(crossChannelBehavior: CrossChannelBehaviorProperty) {
        cdkBuilder.crossChannelBehavior(crossChannelBehavior.let(CrossChannelBehaviorProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cfcde8aa362d223ee3c2ab2d6377b352befebe3fface34711f13a5df2121a4ab")
      public override
          fun crossChannelBehavior(crossChannelBehavior: CrossChannelBehaviorProperty.Builder.() -> Unit):
          Unit = crossChannelBehavior(CrossChannelBehaviorProperty(crossChannelBehavior))

      public fun build():
          software.amazon.awscdk.services.connect.CfnRoutingProfile.MediaConcurrencyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnRoutingProfile.MediaConcurrencyProperty,
    ) : MediaConcurrencyProperty {
      public override fun channel(): String = unwrap(this).getChannel()

      public override fun concurrency(): Number = unwrap(this).getConcurrency()

      public override fun crossChannelBehavior(): Any? = unwrap(this).getCrossChannelBehavior()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MediaConcurrencyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnRoutingProfile.MediaConcurrencyProperty):
          MediaConcurrencyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MediaConcurrencyProperty):
          software.amazon.awscdk.services.connect.CfnRoutingProfile.MediaConcurrencyProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface RoutingProfileQueueConfigProperty {
    public fun delay(): Number

    public fun priority(): Number

    public fun queueReference(): Any

    public interface Builder {
      public fun delay(delay: Number) {
      }

      public fun priority(priority: Number) {
      }

      public fun queueReference(queueReference: IResolvable) {
      }

      public fun queueReference(queueReference: RoutingProfileQueueReferenceProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cddc030719541bcfcb2fe6a3158c8c91e398771a27ed58cebda8879e7b5a6947")
      public
          fun queueReference(queueReference: RoutingProfileQueueReferenceProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnRoutingProfile.RoutingProfileQueueConfigProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnRoutingProfile.RoutingProfileQueueConfigProperty.builder()

      public override fun delay(delay: Number) {
        cdkBuilder.delay(delay)
      }

      public override fun priority(priority: Number) {
        cdkBuilder.priority(priority)
      }

      public override fun queueReference(queueReference: IResolvable) {
        cdkBuilder.queueReference(queueReference.let(IResolvable::unwrap))
      }

      public override fun queueReference(queueReference: RoutingProfileQueueReferenceProperty) {
        cdkBuilder.queueReference(queueReference.let(RoutingProfileQueueReferenceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cddc030719541bcfcb2fe6a3158c8c91e398771a27ed58cebda8879e7b5a6947")
      public override
          fun queueReference(queueReference: RoutingProfileQueueReferenceProperty.Builder.() -> Unit):
          Unit = queueReference(RoutingProfileQueueReferenceProperty(queueReference))

      public fun build():
          software.amazon.awscdk.services.connect.CfnRoutingProfile.RoutingProfileQueueConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnRoutingProfile.RoutingProfileQueueConfigProperty,
    ) : RoutingProfileQueueConfigProperty {
      public override fun delay(): Number = unwrap(this).getDelay()

      public override fun priority(): Number = unwrap(this).getPriority()

      public override fun queueReference(): Any = unwrap(this).getQueueReference()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          RoutingProfileQueueConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnRoutingProfile.RoutingProfileQueueConfigProperty):
          RoutingProfileQueueConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RoutingProfileQueueConfigProperty):
          software.amazon.awscdk.services.connect.CfnRoutingProfile.RoutingProfileQueueConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface RoutingProfileQueueReferenceProperty {
    public fun channel(): String

    public fun queueArn(): String

    public interface Builder {
      public fun channel(channel: String) {
      }

      public fun queueArn(queueArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnRoutingProfile.RoutingProfileQueueReferenceProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnRoutingProfile.RoutingProfileQueueReferenceProperty.builder()

      public override fun channel(channel: String) {
        cdkBuilder.channel(channel)
      }

      public override fun queueArn(queueArn: String) {
        cdkBuilder.queueArn(queueArn)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnRoutingProfile.RoutingProfileQueueReferenceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnRoutingProfile.RoutingProfileQueueReferenceProperty,
    ) : RoutingProfileQueueReferenceProperty {
      public override fun channel(): String = unwrap(this).getChannel()

      public override fun queueArn(): String = unwrap(this).getQueueArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          RoutingProfileQueueReferenceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnRoutingProfile.RoutingProfileQueueReferenceProperty):
          RoutingProfileQueueReferenceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RoutingProfileQueueReferenceProperty):
          software.amazon.awscdk.services.connect.CfnRoutingProfile.RoutingProfileQueueReferenceProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
