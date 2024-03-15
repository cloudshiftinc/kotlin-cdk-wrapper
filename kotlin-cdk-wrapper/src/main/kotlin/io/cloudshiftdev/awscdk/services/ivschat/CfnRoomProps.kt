@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ivschat

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

public interface CfnRoomProps {
  public fun loggingConfigurationIdentifiers(): List<String> =
      unwrap(this).getLoggingConfigurationIdentifiers() ?: emptyList()

  public fun maximumMessageLength(): Number? = unwrap(this).getMaximumMessageLength()

  public fun maximumMessageRatePerSecond(): Number? = unwrap(this).getMaximumMessageRatePerSecond()

  public fun messageReviewHandler(): Any? = unwrap(this).getMessageReviewHandler()

  public fun name(): String? = unwrap(this).getName()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun loggingConfigurationIdentifiers(loggingConfigurationIdentifiers: List<String>)

    public fun loggingConfigurationIdentifiers(vararg loggingConfigurationIdentifiers: String)

    public fun maximumMessageLength(maximumMessageLength: Number)

    public fun maximumMessageRatePerSecond(maximumMessageRatePerSecond: Number)

    public fun messageReviewHandler(messageReviewHandler: IResolvable)

    public fun messageReviewHandler(messageReviewHandler: CfnRoom.MessageReviewHandlerProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("714a5b381acd25976032e32895346cb9f72b174549e6f02a573beebdb7cce783")
    public
        fun messageReviewHandler(messageReviewHandler: CfnRoom.MessageReviewHandlerProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ivschat.CfnRoomProps.Builder =
        software.amazon.awscdk.services.ivschat.CfnRoomProps.builder()

    override fun loggingConfigurationIdentifiers(loggingConfigurationIdentifiers: List<String>) {
      cdkBuilder.loggingConfigurationIdentifiers(loggingConfigurationIdentifiers)
    }

    override fun loggingConfigurationIdentifiers(vararg loggingConfigurationIdentifiers: String):
        Unit = loggingConfigurationIdentifiers(loggingConfigurationIdentifiers.toList())

    override fun maximumMessageLength(maximumMessageLength: Number) {
      cdkBuilder.maximumMessageLength(maximumMessageLength)
    }

    override fun maximumMessageRatePerSecond(maximumMessageRatePerSecond: Number) {
      cdkBuilder.maximumMessageRatePerSecond(maximumMessageRatePerSecond)
    }

    override fun messageReviewHandler(messageReviewHandler: IResolvable) {
      cdkBuilder.messageReviewHandler(messageReviewHandler.let(IResolvable::unwrap))
    }

    override fun messageReviewHandler(messageReviewHandler: CfnRoom.MessageReviewHandlerProperty) {
      cdkBuilder.messageReviewHandler(messageReviewHandler.let(CfnRoom.MessageReviewHandlerProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("714a5b381acd25976032e32895346cb9f72b174549e6f02a573beebdb7cce783")
    override
        fun messageReviewHandler(messageReviewHandler: CfnRoom.MessageReviewHandlerProperty.Builder.() -> Unit):
        Unit = messageReviewHandler(CfnRoom.MessageReviewHandlerProperty(messageReviewHandler))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ivschat.CfnRoomProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ivschat.CfnRoomProps,
  ) : CdkObject(cdkObject), CfnRoomProps {
    override fun loggingConfigurationIdentifiers(): List<String> =
        unwrap(this).getLoggingConfigurationIdentifiers() ?: emptyList()

    override fun maximumMessageLength(): Number? = unwrap(this).getMaximumMessageLength()

    override fun maximumMessageRatePerSecond(): Number? =
        unwrap(this).getMaximumMessageRatePerSecond()

    override fun messageReviewHandler(): Any? = unwrap(this).getMessageReviewHandler()

    override fun name(): String? = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRoomProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ivschat.CfnRoomProps): CfnRoomProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRoomProps): software.amazon.awscdk.services.ivschat.CfnRoomProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ivschat.CfnRoomProps
  }
}
