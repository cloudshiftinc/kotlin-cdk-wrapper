@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesis

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

public open class CfnStream internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.kinesis.CfnStream,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun retentionPeriodHours(): Number? = unwrap(this).getRetentionPeriodHours()

  public open fun retentionPeriodHours(`value`: Number) {
    unwrap(this).setRetentionPeriodHours(`value`)
  }

  public open fun shardCount(): Number? = unwrap(this).getShardCount()

  public open fun shardCount(`value`: Number) {
    unwrap(this).setShardCount(`value`)
  }

  public open fun streamEncryption(): Any? = unwrap(this).getStreamEncryption()

  public open fun streamEncryption(`value`: IResolvable) {
    unwrap(this).setStreamEncryption(`value`.let(IResolvable::unwrap))
  }

  public open fun streamEncryption(`value`: StreamEncryptionProperty) {
    unwrap(this).setStreamEncryption(`value`.let(StreamEncryptionProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("54f1667151efeab12661cd89c473fe61606299a374291b0b28b42608ef7b2a4d")
  public open fun streamEncryption(`value`: StreamEncryptionProperty.Builder.() -> Unit): Unit =
      streamEncryption(StreamEncryptionProperty(`value`))

  public open fun streamModeDetails(): Any? = unwrap(this).getStreamModeDetails()

  public open fun streamModeDetails(`value`: IResolvable) {
    unwrap(this).setStreamModeDetails(`value`.let(IResolvable::unwrap))
  }

  public open fun streamModeDetails(`value`: StreamModeDetailsProperty) {
    unwrap(this).setStreamModeDetails(`value`.let(StreamModeDetailsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("378fd36c3cd99313e05dd397ed480ede6103160f38b7c4109968393e32667b2d")
  public open fun streamModeDetails(`value`: StreamModeDetailsProperty.Builder.() -> Unit): Unit =
      streamModeDetails(StreamModeDetailsProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun name(name: String)

    public fun retentionPeriodHours(retentionPeriodHours: Number)

    public fun shardCount(shardCount: Number)

    public fun streamEncryption(streamEncryption: IResolvable)

    public fun streamEncryption(streamEncryption: StreamEncryptionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("13144c49d575e3934185ca810fda708916113c21ab18297ad3c3810ee15617ff")
    public fun streamEncryption(streamEncryption: StreamEncryptionProperty.Builder.() -> Unit)

    public fun streamModeDetails(streamModeDetails: IResolvable)

    public fun streamModeDetails(streamModeDetails: StreamModeDetailsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("88c9ad7dc25f819c3732b2119e267de19d8b6b442bcabf2ab6ed2ae9a306d457")
    public fun streamModeDetails(streamModeDetails: StreamModeDetailsProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kinesis.CfnStream.Builder =
        software.amazon.awscdk.services.kinesis.CfnStream.Builder.create(scope, id)

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun retentionPeriodHours(retentionPeriodHours: Number) {
      cdkBuilder.retentionPeriodHours(retentionPeriodHours)
    }

    override fun shardCount(shardCount: Number) {
      cdkBuilder.shardCount(shardCount)
    }

    override fun streamEncryption(streamEncryption: IResolvable) {
      cdkBuilder.streamEncryption(streamEncryption.let(IResolvable::unwrap))
    }

    override fun streamEncryption(streamEncryption: StreamEncryptionProperty) {
      cdkBuilder.streamEncryption(streamEncryption.let(StreamEncryptionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("13144c49d575e3934185ca810fda708916113c21ab18297ad3c3810ee15617ff")
    override fun streamEncryption(streamEncryption: StreamEncryptionProperty.Builder.() -> Unit):
        Unit = streamEncryption(StreamEncryptionProperty(streamEncryption))

    override fun streamModeDetails(streamModeDetails: IResolvable) {
      cdkBuilder.streamModeDetails(streamModeDetails.let(IResolvable::unwrap))
    }

    override fun streamModeDetails(streamModeDetails: StreamModeDetailsProperty) {
      cdkBuilder.streamModeDetails(streamModeDetails.let(StreamModeDetailsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("88c9ad7dc25f819c3732b2119e267de19d8b6b442bcabf2ab6ed2ae9a306d457")
    override fun streamModeDetails(streamModeDetails: StreamModeDetailsProperty.Builder.() -> Unit):
        Unit = streamModeDetails(StreamModeDetailsProperty(streamModeDetails))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.kinesis.CfnStream = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.kinesis.CfnStream.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStream {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStream(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kinesis.CfnStream): CfnStream =
        CfnStream(cdkObject)

    internal fun unwrap(wrapped: CfnStream): software.amazon.awscdk.services.kinesis.CfnStream =
        wrapped.cdkObject
  }

  public interface StreamModeDetailsProperty {
    public fun streamMode(): String

    @CdkDslMarker
    public interface Builder {
      public fun streamMode(streamMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesis.CfnStream.StreamModeDetailsProperty.Builder =
          software.amazon.awscdk.services.kinesis.CfnStream.StreamModeDetailsProperty.builder()

      override fun streamMode(streamMode: String) {
        cdkBuilder.streamMode(streamMode)
      }

      public fun build():
          software.amazon.awscdk.services.kinesis.CfnStream.StreamModeDetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesis.CfnStream.StreamModeDetailsProperty,
    ) : CdkObject(cdkObject), StreamModeDetailsProperty {
      override fun streamMode(): String = unwrap(this).getStreamMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StreamModeDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesis.CfnStream.StreamModeDetailsProperty):
          StreamModeDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StreamModeDetailsProperty):
          software.amazon.awscdk.services.kinesis.CfnStream.StreamModeDetailsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesis.CfnStream.StreamModeDetailsProperty
    }
  }

  public interface StreamEncryptionProperty {
    public fun encryptionType(): String

    public fun keyId(): String

    @CdkDslMarker
    public interface Builder {
      public fun encryptionType(encryptionType: String)

      public fun keyId(keyId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesis.CfnStream.StreamEncryptionProperty.Builder =
          software.amazon.awscdk.services.kinesis.CfnStream.StreamEncryptionProperty.builder()

      override fun encryptionType(encryptionType: String) {
        cdkBuilder.encryptionType(encryptionType)
      }

      override fun keyId(keyId: String) {
        cdkBuilder.keyId(keyId)
      }

      public fun build(): software.amazon.awscdk.services.kinesis.CfnStream.StreamEncryptionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesis.CfnStream.StreamEncryptionProperty,
    ) : CdkObject(cdkObject), StreamEncryptionProperty {
      override fun encryptionType(): String = unwrap(this).getEncryptionType()

      override fun keyId(): String = unwrap(this).getKeyId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StreamEncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesis.CfnStream.StreamEncryptionProperty):
          StreamEncryptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StreamEncryptionProperty):
          software.amazon.awscdk.services.kinesis.CfnStream.StreamEncryptionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesis.CfnStream.StreamEncryptionProperty
    }
  }
}
