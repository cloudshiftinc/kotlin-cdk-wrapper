package io.cloudshiftdev.awscdk.services.ivschat

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
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

public open class CfnRoom internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ivschat.CfnRoom,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun loggingConfigurationIdentifiers(): List<String> =
      unwrap(this).getLoggingConfigurationIdentifiers() ?: emptyList()

  public open fun loggingConfigurationIdentifiers(`value`: List<String>) {
    unwrap(this).setLoggingConfigurationIdentifiers(`value`)
  }

  public open fun maximumMessageLength(): Number? = unwrap(this).getMaximumMessageLength()

  public open fun maximumMessageLength(`value`: Number) {
    unwrap(this).setMaximumMessageLength(`value`)
  }

  public open fun maximumMessageRatePerSecond(): Number? =
      unwrap(this).getMaximumMessageRatePerSecond()

  public open fun maximumMessageRatePerSecond(`value`: Number) {
    unwrap(this).setMaximumMessageRatePerSecond(`value`)
  }

  public open fun messageReviewHandler(): Any? = unwrap(this).getMessageReviewHandler()

  public open fun messageReviewHandler(`value`: IResolvable) {
    unwrap(this).setMessageReviewHandler(`value`.let(IResolvable::unwrap))
  }

  public open fun messageReviewHandler(`value`: MessageReviewHandlerProperty) {
    unwrap(this).setMessageReviewHandler(`value`.let(MessageReviewHandlerProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0e29e2644e41e61c4918568854141c919460123dfe0df4cbd64ae77718ca4c93")
  public open fun messageReviewHandler(`value`: MessageReviewHandlerProperty.Builder.() -> Unit):
      Unit = messageReviewHandler(MessageReviewHandlerProperty(`value`))

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun loggingConfigurationIdentifiers(loggingConfigurationIdentifiers: List<String>) {
    }

    public fun maximumMessageLength(maximumMessageLength: Number) {
    }

    public fun maximumMessageRatePerSecond(maximumMessageRatePerSecond: Number) {
    }

    public fun messageReviewHandler(messageReviewHandler: IResolvable) {
    }

    public fun messageReviewHandler(messageReviewHandler: MessageReviewHandlerProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e81b16974c7ad0a6acdf5a37615c7459552040bc7b0daa1c70fc56505d6925b")
    public
        fun messageReviewHandler(messageReviewHandler: MessageReviewHandlerProperty.Builder.() -> Unit) {
    }

    public fun name(name: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ivschat.CfnRoom.Builder =
        software.amazon.awscdk.services.ivschat.CfnRoom.Builder.create(scope, id)

    public override
        fun loggingConfigurationIdentifiers(loggingConfigurationIdentifiers: List<String>) {
      cdkBuilder.loggingConfigurationIdentifiers(loggingConfigurationIdentifiers)
    }

    public override fun maximumMessageLength(maximumMessageLength: Number) {
      cdkBuilder.maximumMessageLength(maximumMessageLength)
    }

    public override fun maximumMessageRatePerSecond(maximumMessageRatePerSecond: Number) {
      cdkBuilder.maximumMessageRatePerSecond(maximumMessageRatePerSecond)
    }

    public override fun messageReviewHandler(messageReviewHandler: IResolvable) {
      cdkBuilder.messageReviewHandler(messageReviewHandler.let(IResolvable::unwrap))
    }

    public override fun messageReviewHandler(messageReviewHandler: MessageReviewHandlerProperty) {
      cdkBuilder.messageReviewHandler(messageReviewHandler.let(MessageReviewHandlerProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e81b16974c7ad0a6acdf5a37615c7459552040bc7b0daa1c70fc56505d6925b")
    public override
        fun messageReviewHandler(messageReviewHandler: MessageReviewHandlerProperty.Builder.() -> Unit):
        Unit = messageReviewHandler(MessageReviewHandlerProperty(messageReviewHandler))

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ivschat.CfnRoom = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRoom {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRoom(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ivschat.CfnRoom): CfnRoom =
        CfnRoom(cdkObject)

    internal fun unwrap(wrapped: CfnRoom): software.amazon.awscdk.services.ivschat.CfnRoom =
        wrapped.cdkObject
  }

  public interface MessageReviewHandlerProperty {
    public fun fallbackResult(): String? = unwrap(this).getFallbackResult()

    public fun uri(): String? = unwrap(this).getUri()

    public interface Builder {
      public fun fallbackResult(fallbackResult: String) {
      }

      public fun uri(uri: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ivschat.CfnRoom.MessageReviewHandlerProperty.Builder =
          software.amazon.awscdk.services.ivschat.CfnRoom.MessageReviewHandlerProperty.builder()

      public override fun fallbackResult(fallbackResult: String) {
        cdkBuilder.fallbackResult(fallbackResult)
      }

      public override fun uri(uri: String) {
        cdkBuilder.uri(uri)
      }

      public fun build():
          software.amazon.awscdk.services.ivschat.CfnRoom.MessageReviewHandlerProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ivschat.CfnRoom.MessageReviewHandlerProperty,
    ) : MessageReviewHandlerProperty {
      public override fun fallbackResult(): String? = unwrap(this).getFallbackResult()

      public override fun uri(): String? = unwrap(this).getUri()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MessageReviewHandlerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ivschat.CfnRoom.MessageReviewHandlerProperty):
          MessageReviewHandlerProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MessageReviewHandlerProperty):
          software.amazon.awscdk.services.ivschat.CfnRoom.MessageReviewHandlerProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
