package io.cloudshiftdev.awscdk.services.voiceid

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDomain internal constructor(
  private val cdkObject: software.amazon.awscdk.services.voiceid.CfnDomain,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrDomainId(): String = unwrap(this).getAttrDomainId()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun serverSideEncryptionConfiguration(): Any =
      unwrap(this).getServerSideEncryptionConfiguration()

  public open fun serverSideEncryptionConfiguration(`value`: IResolvable) {
    unwrap(this).setServerSideEncryptionConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open
      fun serverSideEncryptionConfiguration(`value`: ServerSideEncryptionConfigurationProperty) {
    unwrap(this).setServerSideEncryptionConfiguration(`value`.let(ServerSideEncryptionConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ece0becb0a9c77d8a84053f162dcdade92b96fda76ce55032e2bf5aef10e61c1")
  public open
      fun serverSideEncryptionConfiguration(`value`: ServerSideEncryptionConfigurationProperty.Builder.() -> Unit):
      Unit = serverSideEncryptionConfiguration(ServerSideEncryptionConfigurationProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun description(description: String) {
    }

    public fun name(name: String) {
    }

    public fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable) {
    }

    public
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: ServerSideEncryptionConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4d16ac974d8a28511745e058ff5c8b8c4d693e620b140c0705ffaf6509c9e5c3")
    public
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: ServerSideEncryptionConfigurationProperty.Builder.() -> Unit) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.voiceid.CfnDomain.Builder =
        software.amazon.awscdk.services.voiceid.CfnDomain.Builder.create(scope, id)

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable) {
      cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration.let(IResolvable::unwrap))
    }

    public override
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: ServerSideEncryptionConfigurationProperty) {
      cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration.let(ServerSideEncryptionConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4d16ac974d8a28511745e058ff5c8b8c4d693e620b140c0705ffaf6509c9e5c3")
    public override
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: ServerSideEncryptionConfigurationProperty.Builder.() -> Unit):
        Unit =
        serverSideEncryptionConfiguration(ServerSideEncryptionConfigurationProperty(serverSideEncryptionConfiguration))

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.voiceid.CfnDomain = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDomain {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDomain(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.voiceid.CfnDomain): CfnDomain =
        CfnDomain(cdkObject)

    internal fun unwrap(wrapped: CfnDomain): software.amazon.awscdk.services.voiceid.CfnDomain =
        wrapped.cdkObject
  }

  public interface ServerSideEncryptionConfigurationProperty {
    public fun kmsKeyId(): String

    public interface Builder {
      public fun kmsKeyId(kmsKeyId: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.voiceid.CfnDomain.ServerSideEncryptionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.voiceid.CfnDomain.ServerSideEncryptionConfigurationProperty.builder()

      public override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      public fun build():
          software.amazon.awscdk.services.voiceid.CfnDomain.ServerSideEncryptionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.voiceid.CfnDomain.ServerSideEncryptionConfigurationProperty,
    ) : ServerSideEncryptionConfigurationProperty {
      public override fun kmsKeyId(): String = unwrap(this).getKmsKeyId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServerSideEncryptionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.voiceid.CfnDomain.ServerSideEncryptionConfigurationProperty):
          ServerSideEncryptionConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServerSideEncryptionConfigurationProperty):
          software.amazon.awscdk.services.voiceid.CfnDomain.ServerSideEncryptionConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
