package io.cloudshiftdev.awscdk.services.mediapackage

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

public open class CfnChannel internal constructor(
  private val cdkObject: software.amazon.awscdk.services.mediapackage.CfnChannel,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun egressAccessLogs(): Any? = unwrap(this).getEgressAccessLogs()

  public open fun egressAccessLogs(`value`: IResolvable) {
    unwrap(this).setEgressAccessLogs(`value`.let(IResolvable::unwrap))
  }

  public open fun egressAccessLogs(`value`: LogConfigurationProperty) {
    unwrap(this).setEgressAccessLogs(`value`.let(LogConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("896c2c8f0f915a4ef95780c75bfc92db9a4ae391aa063dd24e1d93e66e6bcc10")
  public open fun egressAccessLogs(`value`: LogConfigurationProperty.Builder.() -> Unit): Unit =
      egressAccessLogs(LogConfigurationProperty(`value`))

  public open fun hlsIngest(): Any? = unwrap(this).getHlsIngest()

  public open fun hlsIngest(`value`: IResolvable) {
    unwrap(this).setHlsIngest(`value`.let(IResolvable::unwrap))
  }

  public open fun hlsIngest(`value`: HlsIngestProperty) {
    unwrap(this).setHlsIngest(`value`.let(HlsIngestProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a1f40df248ceb5b3ee0c429330e28bced8d4e450636d9a942e60d83755f65381")
  public open fun hlsIngest(`value`: HlsIngestProperty.Builder.() -> Unit): Unit =
      hlsIngest(HlsIngestProperty(`value`))

  public open fun id(): String = unwrap(this).getId()

  public open fun id(`value`: String) {
    unwrap(this).setId(`value`)
  }

  public open fun ingressAccessLogs(): Any? = unwrap(this).getIngressAccessLogs()

  public open fun ingressAccessLogs(`value`: IResolvable) {
    unwrap(this).setIngressAccessLogs(`value`.let(IResolvable::unwrap))
  }

  public open fun ingressAccessLogs(`value`: LogConfigurationProperty) {
    unwrap(this).setIngressAccessLogs(`value`.let(LogConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e7e808a86fd328e4349b6639d1391d6c712402dcae23723d44c262fa677a8fea")
  public open fun ingressAccessLogs(`value`: LogConfigurationProperty.Builder.() -> Unit): Unit =
      ingressAccessLogs(LogConfigurationProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun description(description: String)

    public fun egressAccessLogs(egressAccessLogs: IResolvable)

    public fun egressAccessLogs(egressAccessLogs: LogConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9bc4e83f696f474d194475eef3cdd052f78dac16858f80a86e40597b5f6dee93")
    public fun egressAccessLogs(egressAccessLogs: LogConfigurationProperty.Builder.() -> Unit)

    public fun hlsIngest(hlsIngest: IResolvable)

    public fun hlsIngest(hlsIngest: HlsIngestProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce45ba853ca8be3bd9aaafb4a65d0f49b8ab1a9bcd8a3458828730810b0a45ad")
    public fun hlsIngest(hlsIngest: HlsIngestProperty.Builder.() -> Unit)

    public fun id(id: String)

    public fun ingressAccessLogs(ingressAccessLogs: IResolvable)

    public fun ingressAccessLogs(ingressAccessLogs: LogConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a1cc6a4df1a4648db43d3aff87ead5bb75c6d116955a455cb6f77090b6136e8b")
    public fun ingressAccessLogs(ingressAccessLogs: LogConfigurationProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediapackage.CfnChannel.Builder =
        software.amazon.awscdk.services.mediapackage.CfnChannel.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun egressAccessLogs(egressAccessLogs: IResolvable) {
      cdkBuilder.egressAccessLogs(egressAccessLogs.let(IResolvable::unwrap))
    }

    override fun egressAccessLogs(egressAccessLogs: LogConfigurationProperty) {
      cdkBuilder.egressAccessLogs(egressAccessLogs.let(LogConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9bc4e83f696f474d194475eef3cdd052f78dac16858f80a86e40597b5f6dee93")
    override fun egressAccessLogs(egressAccessLogs: LogConfigurationProperty.Builder.() -> Unit):
        Unit = egressAccessLogs(LogConfigurationProperty(egressAccessLogs))

    override fun hlsIngest(hlsIngest: IResolvable) {
      cdkBuilder.hlsIngest(hlsIngest.let(IResolvable::unwrap))
    }

    override fun hlsIngest(hlsIngest: HlsIngestProperty) {
      cdkBuilder.hlsIngest(hlsIngest.let(HlsIngestProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce45ba853ca8be3bd9aaafb4a65d0f49b8ab1a9bcd8a3458828730810b0a45ad")
    override fun hlsIngest(hlsIngest: HlsIngestProperty.Builder.() -> Unit): Unit =
        hlsIngest(HlsIngestProperty(hlsIngest))

    override fun id(id: String) {
      cdkBuilder.id(id)
    }

    override fun ingressAccessLogs(ingressAccessLogs: IResolvable) {
      cdkBuilder.ingressAccessLogs(ingressAccessLogs.let(IResolvable::unwrap))
    }

    override fun ingressAccessLogs(ingressAccessLogs: LogConfigurationProperty) {
      cdkBuilder.ingressAccessLogs(ingressAccessLogs.let(LogConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a1cc6a4df1a4648db43d3aff87ead5bb75c6d116955a455cb6f77090b6136e8b")
    override fun ingressAccessLogs(ingressAccessLogs: LogConfigurationProperty.Builder.() -> Unit):
        Unit = ingressAccessLogs(LogConfigurationProperty(ingressAccessLogs))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.mediapackage.CfnChannel = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnChannel {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnChannel(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnChannel):
        CfnChannel = CfnChannel(cdkObject)

    internal fun unwrap(wrapped: CfnChannel):
        software.amazon.awscdk.services.mediapackage.CfnChannel = wrapped.cdkObject
  }

  public interface IngestEndpointProperty {
    public fun id(): String

    public fun password(): String

    public fun url(): String

    public fun username(): String

    public interface Builder {
      public fun id(id: String)

      public fun password(password: String)

      public fun url(url: String)

      public fun username(username: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnChannel.IngestEndpointProperty.Builder =
          software.amazon.awscdk.services.mediapackage.CfnChannel.IngestEndpointProperty.builder()

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      override fun password(password: String) {
        cdkBuilder.password(password)
      }

      override fun url(url: String) {
        cdkBuilder.url(url)
      }

      override fun username(username: String) {
        cdkBuilder.username(username)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnChannel.IngestEndpointProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnChannel.IngestEndpointProperty,
    ) : IngestEndpointProperty {
      override fun id(): String = unwrap(this).getId()

      override fun password(): String = unwrap(this).getPassword()

      override fun url(): String = unwrap(this).getUrl()

      override fun username(): String = unwrap(this).getUsername()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IngestEndpointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnChannel.IngestEndpointProperty):
          IngestEndpointProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IngestEndpointProperty):
          software.amazon.awscdk.services.mediapackage.CfnChannel.IngestEndpointProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface HlsIngestProperty {
    public fun ingestEndpoints(): Any? = unwrap(this).getIngestEndpoints()

    public interface Builder {
      public fun ingestEndpoints(ingestEndpoints: IResolvable)

      public fun ingestEndpoints(ingestEndpoints: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnChannel.HlsIngestProperty.Builder =
          software.amazon.awscdk.services.mediapackage.CfnChannel.HlsIngestProperty.builder()

      override fun ingestEndpoints(ingestEndpoints: IResolvable) {
        cdkBuilder.ingestEndpoints(ingestEndpoints.let(IResolvable::unwrap))
      }

      override fun ingestEndpoints(ingestEndpoints: List<Any>) {
        cdkBuilder.ingestEndpoints(ingestEndpoints)
      }

      public fun build(): software.amazon.awscdk.services.mediapackage.CfnChannel.HlsIngestProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnChannel.HlsIngestProperty,
    ) : HlsIngestProperty {
      override fun ingestEndpoints(): Any? = unwrap(this).getIngestEndpoints()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HlsIngestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnChannel.HlsIngestProperty):
          HlsIngestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HlsIngestProperty):
          software.amazon.awscdk.services.mediapackage.CfnChannel.HlsIngestProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface LogConfigurationProperty {
    public fun logGroupName(): String? = unwrap(this).getLogGroupName()

    public interface Builder {
      public fun logGroupName(logGroupName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnChannel.LogConfigurationProperty.Builder =
          software.amazon.awscdk.services.mediapackage.CfnChannel.LogConfigurationProperty.builder()

      override fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnChannel.LogConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnChannel.LogConfigurationProperty,
    ) : LogConfigurationProperty {
      override fun logGroupName(): String? = unwrap(this).getLogGroupName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LogConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnChannel.LogConfigurationProperty):
          LogConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogConfigurationProperty):
          software.amazon.awscdk.services.mediapackage.CfnChannel.LogConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
