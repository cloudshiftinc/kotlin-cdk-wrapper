package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVirtualNode internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrMeshName(): String = unwrap(this).getAttrMeshName()

  public open fun attrMeshOwner(): String = unwrap(this).getAttrMeshOwner()

  public open fun attrResourceOwner(): String = unwrap(this).getAttrResourceOwner()

  public open fun attrUid(): String = unwrap(this).getAttrUid()

  public open fun attrVirtualNodeName(): String = unwrap(this).getAttrVirtualNodeName()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun meshName(): String = unwrap(this).getMeshName()

  public open fun meshName(`value`: String) {
    unwrap(this).setMeshName(`value`)
  }

  public open fun meshOwner(): String? = unwrap(this).getMeshOwner()

  public open fun meshOwner(`value`: String) {
    unwrap(this).setMeshOwner(`value`)
  }

  public open fun spec(): Any = unwrap(this).getSpec()

  public open fun spec(`value`: IResolvable) {
    unwrap(this).setSpec(`value`.let(IResolvable::unwrap))
  }

  public open fun spec(`value`: VirtualNodeSpecProperty) {
    unwrap(this).setSpec(`value`.let(VirtualNodeSpecProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("670c355d7ff77c011573957b0f75401a6b1a2dc8af7cbc3a4a6c564a14244a52")
  public open fun spec(`value`: VirtualNodeSpecProperty.Builder.() -> Unit): Unit =
      spec(VirtualNodeSpecProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun virtualNodeName(): String? = unwrap(this).getVirtualNodeName()

  public open fun virtualNodeName(`value`: String) {
    unwrap(this).setVirtualNodeName(`value`)
  }

  public interface Builder {
    public fun meshName(meshName: String)

    public fun meshOwner(meshOwner: String)

    public fun spec(spec: IResolvable)

    public fun spec(spec: VirtualNodeSpecProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1155f49a4f07152dc7878b95fb5bfab1a0c3e50c20c9713c79e31d05776f1ee6")
    public fun spec(spec: VirtualNodeSpecProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun virtualNodeName(virtualNodeName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.CfnVirtualNode.Builder =
        software.amazon.awscdk.services.appmesh.CfnVirtualNode.Builder.create(scope, id)

    override fun meshName(meshName: String) {
      cdkBuilder.meshName(meshName)
    }

    override fun meshOwner(meshOwner: String) {
      cdkBuilder.meshOwner(meshOwner)
    }

    override fun spec(spec: IResolvable) {
      cdkBuilder.spec(spec.let(IResolvable::unwrap))
    }

    override fun spec(spec: VirtualNodeSpecProperty) {
      cdkBuilder.spec(spec.let(VirtualNodeSpecProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1155f49a4f07152dc7878b95fb5bfab1a0c3e50c20c9713c79e31d05776f1ee6")
    override fun spec(spec: VirtualNodeSpecProperty.Builder.() -> Unit): Unit =
        spec(VirtualNodeSpecProperty(spec))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun virtualNodeName(virtualNodeName: String) {
      cdkBuilder.virtualNodeName(virtualNodeName)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.CfnVirtualNode = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVirtualNode {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVirtualNode(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode):
        CfnVirtualNode = CfnVirtualNode(cdkObject)

    internal fun unwrap(wrapped: CfnVirtualNode):
        software.amazon.awscdk.services.appmesh.CfnVirtualNode = wrapped.cdkObject
  }

  public interface TlsValidationContextAcmTrustProperty {
    public fun certificateAuthorityArns(): List<String>

    public interface Builder {
      public fun certificateAuthorityArns(certificateAuthorityArns: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextAcmTrustProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextAcmTrustProperty.builder()

      override fun certificateAuthorityArns(certificateAuthorityArns: List<String>) {
        cdkBuilder.certificateAuthorityArns(certificateAuthorityArns)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextAcmTrustProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextAcmTrustProperty,
    ) : TlsValidationContextAcmTrustProperty {
      override fun certificateAuthorityArns(): List<String> =
          unwrap(this).getCertificateAuthorityArns() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          TlsValidationContextAcmTrustProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextAcmTrustProperty):
          TlsValidationContextAcmTrustProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TlsValidationContextAcmTrustProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextAcmTrustProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface HttpTimeoutProperty {
    public fun idle(): Any? = unwrap(this).getIdle()

    public fun perRequest(): Any? = unwrap(this).getPerRequest()

    public interface Builder {
      public fun idle(idle: IResolvable)

      public fun idle(idle: DurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a2f3e48fe5f784e249dbd62ccb6d52a3c4d1e206053d4dd61b1b0226c7e0eba6")
      public fun idle(idle: DurationProperty.Builder.() -> Unit)

      public fun perRequest(perRequest: IResolvable)

      public fun perRequest(perRequest: DurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9a4ffbaa43003f5b92e407476af9a078f5806499ab4d93b1de0978b4e5ebcd64")
      public fun perRequest(perRequest: DurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.HttpTimeoutProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.HttpTimeoutProperty.builder()

      override fun idle(idle: IResolvable) {
        cdkBuilder.idle(idle.let(IResolvable::unwrap))
      }

      override fun idle(idle: DurationProperty) {
        cdkBuilder.idle(idle.let(DurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a2f3e48fe5f784e249dbd62ccb6d52a3c4d1e206053d4dd61b1b0226c7e0eba6")
      override fun idle(idle: DurationProperty.Builder.() -> Unit): Unit =
          idle(DurationProperty(idle))

      override fun perRequest(perRequest: IResolvable) {
        cdkBuilder.perRequest(perRequest.let(IResolvable::unwrap))
      }

      override fun perRequest(perRequest: DurationProperty) {
        cdkBuilder.perRequest(perRequest.let(DurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9a4ffbaa43003f5b92e407476af9a078f5806499ab4d93b1de0978b4e5ebcd64")
      override fun perRequest(perRequest: DurationProperty.Builder.() -> Unit): Unit =
          perRequest(DurationProperty(perRequest))

      public fun build(): software.amazon.awscdk.services.appmesh.CfnVirtualNode.HttpTimeoutProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.HttpTimeoutProperty,
    ) : HttpTimeoutProperty {
      override fun idle(): Any? = unwrap(this).getIdle()

      override fun perRequest(): Any? = unwrap(this).getPerRequest()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HttpTimeoutProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.HttpTimeoutProperty):
          HttpTimeoutProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpTimeoutProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.HttpTimeoutProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AccessLogProperty {
    public fun `file`(): Any? = unwrap(this).getFile()

    public interface Builder {
      public fun `file`(`file`: IResolvable)

      public fun `file`(`file`: FileAccessLogProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("77a047efa54dbe4f6bd35e41f99e0b994b871af1fe1cd5f0d009d1c2c47a2962")
      public fun `file`(`file`: FileAccessLogProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.AccessLogProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.AccessLogProperty.builder()

      override fun `file`(`file`: IResolvable) {
        cdkBuilder.`file`(`file`.let(IResolvable::unwrap))
      }

      override fun `file`(`file`: FileAccessLogProperty) {
        cdkBuilder.`file`(`file`.let(FileAccessLogProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("77a047efa54dbe4f6bd35e41f99e0b994b871af1fe1cd5f0d009d1c2c47a2962")
      override fun `file`(`file`: FileAccessLogProperty.Builder.() -> Unit): Unit =
          `file`(FileAccessLogProperty(`file`))

      public fun build(): software.amazon.awscdk.services.appmesh.CfnVirtualNode.AccessLogProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.AccessLogProperty,
    ) : AccessLogProperty {
      override fun `file`(): Any? = unwrap(this).getFile()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AccessLogProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.AccessLogProperty):
          AccessLogProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessLogProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.AccessLogProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface TlsValidationContextFileTrustProperty {
    public fun certificateChain(): String

    public interface Builder {
      public fun certificateChain(certificateChain: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextFileTrustProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextFileTrustProperty.builder()

      override fun certificateChain(certificateChain: String) {
        cdkBuilder.certificateChain(certificateChain)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextFileTrustProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextFileTrustProperty,
    ) : TlsValidationContextFileTrustProperty {
      override fun certificateChain(): String = unwrap(this).getCertificateChain()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          TlsValidationContextFileTrustProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextFileTrustProperty):
          TlsValidationContextFileTrustProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TlsValidationContextFileTrustProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextFileTrustProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ListenerTlsSdsCertificateProperty {
    public fun secretName(): String

    public interface Builder {
      public fun secretName(secretName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsSdsCertificateProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsSdsCertificateProperty.builder()

      override fun secretName(secretName: String) {
        cdkBuilder.secretName(secretName)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsSdsCertificateProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsSdsCertificateProperty,
    ) : ListenerTlsSdsCertificateProperty {
      override fun secretName(): String = unwrap(this).getSecretName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ListenerTlsSdsCertificateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsSdsCertificateProperty):
          ListenerTlsSdsCertificateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ListenerTlsSdsCertificateProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsSdsCertificateProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ClientPolicyProperty {
    public fun tls(): Any? = unwrap(this).getTls()

    public interface Builder {
      public fun tls(tls: IResolvable)

      public fun tls(tls: ClientPolicyTlsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6e457bcfa4301806bc603707bed028637b0f3e6140ab3f94a7f2bce997ede57f")
      public fun tls(tls: ClientPolicyTlsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientPolicyProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientPolicyProperty.builder()

      override fun tls(tls: IResolvable) {
        cdkBuilder.tls(tls.let(IResolvable::unwrap))
      }

      override fun tls(tls: ClientPolicyTlsProperty) {
        cdkBuilder.tls(tls.let(ClientPolicyTlsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6e457bcfa4301806bc603707bed028637b0f3e6140ab3f94a7f2bce997ede57f")
      override fun tls(tls: ClientPolicyTlsProperty.Builder.() -> Unit): Unit =
          tls(ClientPolicyTlsProperty(tls))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientPolicyProperty,
    ) : ClientPolicyProperty {
      override fun tls(): Any? = unwrap(this).getTls()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ClientPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientPolicyProperty):
          ClientPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClientPolicyProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientPolicyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ListenerTlsAcmCertificateProperty {
    public fun certificateArn(): String

    public interface Builder {
      public fun certificateArn(certificateArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsAcmCertificateProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsAcmCertificateProperty.builder()

      override fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsAcmCertificateProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsAcmCertificateProperty,
    ) : ListenerTlsAcmCertificateProperty {
      override fun certificateArn(): String = unwrap(this).getCertificateArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ListenerTlsAcmCertificateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsAcmCertificateProperty):
          ListenerTlsAcmCertificateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ListenerTlsAcmCertificateProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsAcmCertificateProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface FileAccessLogProperty {
    public fun format(): Any? = unwrap(this).getFormat()

    public fun path(): String

    public interface Builder {
      public fun format(format: IResolvable)

      public fun format(format: LoggingFormatProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b235caa145ca773f775f76940aff30e31dc76f06c6ef5577b6a0326b5350a3ec")
      public fun format(format: LoggingFormatProperty.Builder.() -> Unit)

      public fun path(path: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.FileAccessLogProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.FileAccessLogProperty.builder()

      override fun format(format: IResolvable) {
        cdkBuilder.format(format.let(IResolvable::unwrap))
      }

      override fun format(format: LoggingFormatProperty) {
        cdkBuilder.format(format.let(LoggingFormatProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b235caa145ca773f775f76940aff30e31dc76f06c6ef5577b6a0326b5350a3ec")
      override fun format(format: LoggingFormatProperty.Builder.() -> Unit): Unit =
          format(LoggingFormatProperty(format))

      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.FileAccessLogProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.FileAccessLogProperty,
    ) : FileAccessLogProperty {
      override fun format(): Any? = unwrap(this).getFormat()

      override fun path(): String = unwrap(this).getPath()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FileAccessLogProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.FileAccessLogProperty):
          FileAccessLogProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FileAccessLogProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.FileAccessLogProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface LoggingFormatProperty {
    public fun json(): Any? = unwrap(this).getJson()

    public fun text(): String? = unwrap(this).getText()

    public interface Builder {
      public fun json(json: IResolvable)

      public fun json(json: List<Any>)

      public fun text(text: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.LoggingFormatProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.LoggingFormatProperty.builder()

      override fun json(json: IResolvable) {
        cdkBuilder.json(json.let(IResolvable::unwrap))
      }

      override fun json(json: List<Any>) {
        cdkBuilder.json(json)
      }

      override fun text(text: String) {
        cdkBuilder.text(text)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.LoggingFormatProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.LoggingFormatProperty,
    ) : LoggingFormatProperty {
      override fun json(): Any? = unwrap(this).getJson()

      override fun text(): String? = unwrap(this).getText()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LoggingFormatProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.LoggingFormatProperty):
          LoggingFormatProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggingFormatProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.LoggingFormatProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AwsCloudMapServiceDiscoveryProperty {
    public fun attributes(): Any? = unwrap(this).getAttributes()

    public fun ipPreference(): String? = unwrap(this).getIpPreference()

    public fun namespaceName(): String

    public fun serviceName(): String

    public interface Builder {
      public fun attributes(attributes: IResolvable)

      public fun attributes(attributes: List<Any>)

      public fun ipPreference(ipPreference: String)

      public fun namespaceName(namespaceName: String)

      public fun serviceName(serviceName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.AwsCloudMapServiceDiscoveryProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.AwsCloudMapServiceDiscoveryProperty.builder()

      override fun attributes(attributes: IResolvable) {
        cdkBuilder.attributes(attributes.let(IResolvable::unwrap))
      }

      override fun attributes(attributes: List<Any>) {
        cdkBuilder.attributes(attributes)
      }

      override fun ipPreference(ipPreference: String) {
        cdkBuilder.ipPreference(ipPreference)
      }

      override fun namespaceName(namespaceName: String) {
        cdkBuilder.namespaceName(namespaceName)
      }

      override fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.AwsCloudMapServiceDiscoveryProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.AwsCloudMapServiceDiscoveryProperty,
    ) : AwsCloudMapServiceDiscoveryProperty {
      override fun attributes(): Any? = unwrap(this).getAttributes()

      override fun ipPreference(): String? = unwrap(this).getIpPreference()

      override fun namespaceName(): String = unwrap(this).getNamespaceName()

      override fun serviceName(): String = unwrap(this).getServiceName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AwsCloudMapServiceDiscoveryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.AwsCloudMapServiceDiscoveryProperty):
          AwsCloudMapServiceDiscoveryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AwsCloudMapServiceDiscoveryProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.AwsCloudMapServiceDiscoveryProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface LoggingProperty {
    public fun accessLog(): Any? = unwrap(this).getAccessLog()

    public interface Builder {
      public fun accessLog(accessLog: IResolvable)

      public fun accessLog(accessLog: AccessLogProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a35f0f98ded7a2bd9905d69c135fe419b32fd83db36df883dded919d62b585dd")
      public fun accessLog(accessLog: AccessLogProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.LoggingProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.LoggingProperty.builder()

      override fun accessLog(accessLog: IResolvable) {
        cdkBuilder.accessLog(accessLog.let(IResolvable::unwrap))
      }

      override fun accessLog(accessLog: AccessLogProperty) {
        cdkBuilder.accessLog(accessLog.let(AccessLogProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a35f0f98ded7a2bd9905d69c135fe419b32fd83db36df883dded919d62b585dd")
      override fun accessLog(accessLog: AccessLogProperty.Builder.() -> Unit): Unit =
          accessLog(AccessLogProperty(accessLog))

      public fun build(): software.amazon.awscdk.services.appmesh.CfnVirtualNode.LoggingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.LoggingProperty,
    ) : LoggingProperty {
      override fun accessLog(): Any? = unwrap(this).getAccessLog()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LoggingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.LoggingProperty):
          LoggingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggingProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.LoggingProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SubjectAlternativeNameMatchersProperty {
    public fun exact(): List<String> = unwrap(this).getExact() ?: emptyList()

    public interface Builder {
      public fun exact(exact: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.SubjectAlternativeNameMatchersProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.SubjectAlternativeNameMatchersProperty.builder()

      override fun exact(exact: List<String>) {
        cdkBuilder.exact(exact)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.SubjectAlternativeNameMatchersProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.SubjectAlternativeNameMatchersProperty,
    ) : SubjectAlternativeNameMatchersProperty {
      override fun exact(): List<String> = unwrap(this).getExact() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SubjectAlternativeNameMatchersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.SubjectAlternativeNameMatchersProperty):
          SubjectAlternativeNameMatchersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SubjectAlternativeNameMatchersProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.SubjectAlternativeNameMatchersProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ListenerTlsValidationContextProperty {
    public fun subjectAlternativeNames(): Any? = unwrap(this).getSubjectAlternativeNames()

    public fun trust(): Any

    public interface Builder {
      public fun subjectAlternativeNames(subjectAlternativeNames: IResolvable)

      public fun subjectAlternativeNames(subjectAlternativeNames: SubjectAlternativeNamesProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("edc06a6797214a405c22d9acce7c7f1acb2bfbdb52657dcab08d01ef2ae82b3c")
      public
          fun subjectAlternativeNames(subjectAlternativeNames: SubjectAlternativeNamesProperty.Builder.() -> Unit)

      public fun trust(trust: IResolvable)

      public fun trust(trust: ListenerTlsValidationContextTrustProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c8f9cbc6a44f432cb74fd5cb2ae2ba93efbd7535b4ace97cf387e0b803dd7212")
      public fun trust(trust: ListenerTlsValidationContextTrustProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsValidationContextProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsValidationContextProperty.builder()

      override fun subjectAlternativeNames(subjectAlternativeNames: IResolvable) {
        cdkBuilder.subjectAlternativeNames(subjectAlternativeNames.let(IResolvable::unwrap))
      }

      override
          fun subjectAlternativeNames(subjectAlternativeNames: SubjectAlternativeNamesProperty) {
        cdkBuilder.subjectAlternativeNames(subjectAlternativeNames.let(SubjectAlternativeNamesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("edc06a6797214a405c22d9acce7c7f1acb2bfbdb52657dcab08d01ef2ae82b3c")
      override
          fun subjectAlternativeNames(subjectAlternativeNames: SubjectAlternativeNamesProperty.Builder.() -> Unit):
          Unit = subjectAlternativeNames(SubjectAlternativeNamesProperty(subjectAlternativeNames))

      override fun trust(trust: IResolvable) {
        cdkBuilder.trust(trust.let(IResolvable::unwrap))
      }

      override fun trust(trust: ListenerTlsValidationContextTrustProperty) {
        cdkBuilder.trust(trust.let(ListenerTlsValidationContextTrustProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c8f9cbc6a44f432cb74fd5cb2ae2ba93efbd7535b4ace97cf387e0b803dd7212")
      override fun trust(trust: ListenerTlsValidationContextTrustProperty.Builder.() -> Unit): Unit
          = trust(ListenerTlsValidationContextTrustProperty(trust))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsValidationContextProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsValidationContextProperty,
    ) : ListenerTlsValidationContextProperty {
      override fun subjectAlternativeNames(): Any? = unwrap(this).getSubjectAlternativeNames()

      override fun trust(): Any = unwrap(this).getTrust()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ListenerTlsValidationContextProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsValidationContextProperty):
          ListenerTlsValidationContextProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ListenerTlsValidationContextProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsValidationContextProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface VirtualNodeGrpcConnectionPoolProperty {
    public fun maxRequests(): Number

    public interface Builder {
      public fun maxRequests(maxRequests: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeGrpcConnectionPoolProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeGrpcConnectionPoolProperty.builder()

      override fun maxRequests(maxRequests: Number) {
        cdkBuilder.maxRequests(maxRequests)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeGrpcConnectionPoolProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeGrpcConnectionPoolProperty,
    ) : VirtualNodeGrpcConnectionPoolProperty {
      override fun maxRequests(): Number = unwrap(this).getMaxRequests()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          VirtualNodeGrpcConnectionPoolProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeGrpcConnectionPoolProperty):
          VirtualNodeGrpcConnectionPoolProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualNodeGrpcConnectionPoolProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeGrpcConnectionPoolProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ClientPolicyTlsProperty {
    public fun certificate(): Any? = unwrap(this).getCertificate()

    public fun enforce(): Any? = unwrap(this).getEnforce()

    public fun ports(): Any? = unwrap(this).getPorts()

    public fun validation(): Any

    public interface Builder {
      public fun certificate(certificate: IResolvable)

      public fun certificate(certificate: ClientTlsCertificateProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f1308834fc19d7fc2de1cdaf4e6ba553f82ed9303e831028cacbf0dedef967b")
      public fun certificate(certificate: ClientTlsCertificateProperty.Builder.() -> Unit)

      public fun enforce(enforce: Boolean)

      public fun enforce(enforce: IResolvable)

      public fun ports(ports: IResolvable)

      public fun ports(ports: List<Number>)

      public fun validation(validation: IResolvable)

      public fun validation(validation: TlsValidationContextProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("52251e4e5cf1a4945988da2a08bc8a38c4b08b204471dd117c172382e28c6f5f")
      public fun validation(validation: TlsValidationContextProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientPolicyTlsProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientPolicyTlsProperty.builder()

      override fun certificate(certificate: IResolvable) {
        cdkBuilder.certificate(certificate.let(IResolvable::unwrap))
      }

      override fun certificate(certificate: ClientTlsCertificateProperty) {
        cdkBuilder.certificate(certificate.let(ClientTlsCertificateProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f1308834fc19d7fc2de1cdaf4e6ba553f82ed9303e831028cacbf0dedef967b")
      override fun certificate(certificate: ClientTlsCertificateProperty.Builder.() -> Unit): Unit =
          certificate(ClientTlsCertificateProperty(certificate))

      override fun enforce(enforce: Boolean) {
        cdkBuilder.enforce(enforce)
      }

      override fun enforce(enforce: IResolvable) {
        cdkBuilder.enforce(enforce.let(IResolvable::unwrap))
      }

      override fun ports(ports: IResolvable) {
        cdkBuilder.ports(ports.let(IResolvable::unwrap))
      }

      override fun ports(ports: List<Number>) {
        cdkBuilder.ports(ports)
      }

      override fun validation(validation: IResolvable) {
        cdkBuilder.validation(validation.let(IResolvable::unwrap))
      }

      override fun validation(validation: TlsValidationContextProperty) {
        cdkBuilder.validation(validation.let(TlsValidationContextProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("52251e4e5cf1a4945988da2a08bc8a38c4b08b204471dd117c172382e28c6f5f")
      override fun validation(validation: TlsValidationContextProperty.Builder.() -> Unit): Unit =
          validation(TlsValidationContextProperty(validation))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientPolicyTlsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientPolicyTlsProperty,
    ) : ClientPolicyTlsProperty {
      override fun certificate(): Any? = unwrap(this).getCertificate()

      override fun enforce(): Any? = unwrap(this).getEnforce()

      override fun ports(): Any? = unwrap(this).getPorts()

      override fun validation(): Any = unwrap(this).getValidation()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ClientPolicyTlsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientPolicyTlsProperty):
          ClientPolicyTlsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClientPolicyTlsProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientPolicyTlsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ListenerTlsCertificateProperty {
    public fun acm(): Any? = unwrap(this).getAcm()

    public fun `file`(): Any? = unwrap(this).getFile()

    public fun sds(): Any? = unwrap(this).getSds()

    public interface Builder {
      public fun acm(acm: IResolvable)

      public fun acm(acm: ListenerTlsAcmCertificateProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bb032ee5102ad80e953ad2ce55b834aa42e25e80b7ff85776f6fa47e9ebfb403")
      public fun acm(acm: ListenerTlsAcmCertificateProperty.Builder.() -> Unit)

      public fun `file`(`file`: IResolvable)

      public fun `file`(`file`: ListenerTlsFileCertificateProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("74fad4106711e75536bcbf59b5fd58437dc9a98979579dc2f7c7ac7a876bd97c")
      public fun `file`(`file`: ListenerTlsFileCertificateProperty.Builder.() -> Unit)

      public fun sds(sds: IResolvable)

      public fun sds(sds: ListenerTlsSdsCertificateProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c82a3641aca69e99c1d0e545d21e29720899db03c76f37ab907a7b496c450a10")
      public fun sds(sds: ListenerTlsSdsCertificateProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsCertificateProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsCertificateProperty.builder()

      override fun acm(acm: IResolvable) {
        cdkBuilder.acm(acm.let(IResolvable::unwrap))
      }

      override fun acm(acm: ListenerTlsAcmCertificateProperty) {
        cdkBuilder.acm(acm.let(ListenerTlsAcmCertificateProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bb032ee5102ad80e953ad2ce55b834aa42e25e80b7ff85776f6fa47e9ebfb403")
      override fun acm(acm: ListenerTlsAcmCertificateProperty.Builder.() -> Unit): Unit =
          acm(ListenerTlsAcmCertificateProperty(acm))

      override fun `file`(`file`: IResolvable) {
        cdkBuilder.`file`(`file`.let(IResolvable::unwrap))
      }

      override fun `file`(`file`: ListenerTlsFileCertificateProperty) {
        cdkBuilder.`file`(`file`.let(ListenerTlsFileCertificateProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("74fad4106711e75536bcbf59b5fd58437dc9a98979579dc2f7c7ac7a876bd97c")
      override fun `file`(`file`: ListenerTlsFileCertificateProperty.Builder.() -> Unit): Unit =
          `file`(ListenerTlsFileCertificateProperty(`file`))

      override fun sds(sds: IResolvable) {
        cdkBuilder.sds(sds.let(IResolvable::unwrap))
      }

      override fun sds(sds: ListenerTlsSdsCertificateProperty) {
        cdkBuilder.sds(sds.let(ListenerTlsSdsCertificateProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c82a3641aca69e99c1d0e545d21e29720899db03c76f37ab907a7b496c450a10")
      override fun sds(sds: ListenerTlsSdsCertificateProperty.Builder.() -> Unit): Unit =
          sds(ListenerTlsSdsCertificateProperty(sds))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsCertificateProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsCertificateProperty,
    ) : ListenerTlsCertificateProperty {
      override fun acm(): Any? = unwrap(this).getAcm()

      override fun `file`(): Any? = unwrap(this).getFile()

      override fun sds(): Any? = unwrap(this).getSds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ListenerTlsCertificateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsCertificateProperty):
          ListenerTlsCertificateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ListenerTlsCertificateProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsCertificateProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface VirtualNodeConnectionPoolProperty {
    public fun grpc(): Any? = unwrap(this).getGrpc()

    public fun http(): Any? = unwrap(this).getHttp()

    public fun http2(): Any? = unwrap(this).getHttp2()

    public fun tcp(): Any? = unwrap(this).getTcp()

    public interface Builder {
      public fun grpc(grpc: IResolvable)

      public fun grpc(grpc: VirtualNodeGrpcConnectionPoolProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("28974c9fe5f41ea5caad4092771fd829ab391c7effd1481770a6d4e6ae948c68")
      public fun grpc(grpc: VirtualNodeGrpcConnectionPoolProperty.Builder.() -> Unit)

      public fun http(http: IResolvable)

      public fun http(http: VirtualNodeHttpConnectionPoolProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("710d3775ee0701901c1c87a294918f36b97a7e8b73c0ed6e5c74d48b9fc15889")
      public fun http(http: VirtualNodeHttpConnectionPoolProperty.Builder.() -> Unit)

      public fun http2(http2: IResolvable)

      public fun http2(http2: VirtualNodeHttp2ConnectionPoolProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4c61792de0aa041e7cf5c767a0b49fa9b652f59742fb071d8a3e72d0db73aa56")
      public fun http2(http2: VirtualNodeHttp2ConnectionPoolProperty.Builder.() -> Unit)

      public fun tcp(tcp: IResolvable)

      public fun tcp(tcp: VirtualNodeTcpConnectionPoolProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5fb0def611e45703cfc80421c772a7a82487c79e2f0cff1f064cd444fcca638f")
      public fun tcp(tcp: VirtualNodeTcpConnectionPoolProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeConnectionPoolProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeConnectionPoolProperty.builder()

      override fun grpc(grpc: IResolvable) {
        cdkBuilder.grpc(grpc.let(IResolvable::unwrap))
      }

      override fun grpc(grpc: VirtualNodeGrpcConnectionPoolProperty) {
        cdkBuilder.grpc(grpc.let(VirtualNodeGrpcConnectionPoolProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("28974c9fe5f41ea5caad4092771fd829ab391c7effd1481770a6d4e6ae948c68")
      override fun grpc(grpc: VirtualNodeGrpcConnectionPoolProperty.Builder.() -> Unit): Unit =
          grpc(VirtualNodeGrpcConnectionPoolProperty(grpc))

      override fun http(http: IResolvable) {
        cdkBuilder.http(http.let(IResolvable::unwrap))
      }

      override fun http(http: VirtualNodeHttpConnectionPoolProperty) {
        cdkBuilder.http(http.let(VirtualNodeHttpConnectionPoolProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("710d3775ee0701901c1c87a294918f36b97a7e8b73c0ed6e5c74d48b9fc15889")
      override fun http(http: VirtualNodeHttpConnectionPoolProperty.Builder.() -> Unit): Unit =
          http(VirtualNodeHttpConnectionPoolProperty(http))

      override fun http2(http2: IResolvable) {
        cdkBuilder.http2(http2.let(IResolvable::unwrap))
      }

      override fun http2(http2: VirtualNodeHttp2ConnectionPoolProperty) {
        cdkBuilder.http2(http2.let(VirtualNodeHttp2ConnectionPoolProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4c61792de0aa041e7cf5c767a0b49fa9b652f59742fb071d8a3e72d0db73aa56")
      override fun http2(http2: VirtualNodeHttp2ConnectionPoolProperty.Builder.() -> Unit): Unit =
          http2(VirtualNodeHttp2ConnectionPoolProperty(http2))

      override fun tcp(tcp: IResolvable) {
        cdkBuilder.tcp(tcp.let(IResolvable::unwrap))
      }

      override fun tcp(tcp: VirtualNodeTcpConnectionPoolProperty) {
        cdkBuilder.tcp(tcp.let(VirtualNodeTcpConnectionPoolProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5fb0def611e45703cfc80421c772a7a82487c79e2f0cff1f064cd444fcca638f")
      override fun tcp(tcp: VirtualNodeTcpConnectionPoolProperty.Builder.() -> Unit): Unit =
          tcp(VirtualNodeTcpConnectionPoolProperty(tcp))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeConnectionPoolProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeConnectionPoolProperty,
    ) : VirtualNodeConnectionPoolProperty {
      override fun grpc(): Any? = unwrap(this).getGrpc()

      override fun http(): Any? = unwrap(this).getHttp()

      override fun http2(): Any? = unwrap(this).getHttp2()

      override fun tcp(): Any? = unwrap(this).getTcp()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          VirtualNodeConnectionPoolProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeConnectionPoolProperty):
          VirtualNodeConnectionPoolProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualNodeConnectionPoolProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeConnectionPoolProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DurationProperty {
    public fun unit(): String

    public fun `value`(): Number

    public interface Builder {
      public fun unit(unit: String)

      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.DurationProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.DurationProperty.builder()

      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.appmesh.CfnVirtualNode.DurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.DurationProperty,
    ) : DurationProperty {
      override fun unit(): String = unwrap(this).getUnit()

      override fun `value`(): Number = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.DurationProperty):
          DurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DurationProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.DurationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ListenerProperty {
    public fun connectionPool(): Any? = unwrap(this).getConnectionPool()

    public fun healthCheck(): Any? = unwrap(this).getHealthCheck()

    public fun outlierDetection(): Any? = unwrap(this).getOutlierDetection()

    public fun portMapping(): Any

    public fun timeout(): Any? = unwrap(this).getTimeout()

    public fun tls(): Any? = unwrap(this).getTls()

    public interface Builder {
      public fun connectionPool(connectionPool: IResolvable)

      public fun connectionPool(connectionPool: VirtualNodeConnectionPoolProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("73e8bb2088b07f1d9c17f979646d8caac2840f3c300b54d8ece5dc4e2dc29cdc")
      public
          fun connectionPool(connectionPool: VirtualNodeConnectionPoolProperty.Builder.() -> Unit)

      public fun healthCheck(healthCheck: IResolvable)

      public fun healthCheck(healthCheck: HealthCheckProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("610909536009ea3eb8f02b76bcc5d28f01ecb6ef2da3be37c321acd89b42f00b")
      public fun healthCheck(healthCheck: HealthCheckProperty.Builder.() -> Unit)

      public fun outlierDetection(outlierDetection: IResolvable)

      public fun outlierDetection(outlierDetection: OutlierDetectionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("efa48cf3186219ec8ba58de0ca22dba76fb8b02bee554c5e3928ede7f82343e0")
      public fun outlierDetection(outlierDetection: OutlierDetectionProperty.Builder.() -> Unit)

      public fun portMapping(portMapping: IResolvable)

      public fun portMapping(portMapping: PortMappingProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3a9ffae0ca6685027997ecf8c0f50d78da5f5be9757ddf54526a3adfb2adeffe")
      public fun portMapping(portMapping: PortMappingProperty.Builder.() -> Unit)

      public fun timeout(timeout: IResolvable)

      public fun timeout(timeout: ListenerTimeoutProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("297ae121626d7760558e8ac310372c9625a8836052094f88a2ba4837a1305a16")
      public fun timeout(timeout: ListenerTimeoutProperty.Builder.() -> Unit)

      public fun tls(tls: IResolvable)

      public fun tls(tls: ListenerTlsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0008091fd2d52098801ae827f99c4c6aecd3332fb40603851df92a3eeb7cc68f")
      public fun tls(tls: ListenerTlsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerProperty.builder()

      override fun connectionPool(connectionPool: IResolvable) {
        cdkBuilder.connectionPool(connectionPool.let(IResolvable::unwrap))
      }

      override fun connectionPool(connectionPool: VirtualNodeConnectionPoolProperty) {
        cdkBuilder.connectionPool(connectionPool.let(VirtualNodeConnectionPoolProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("73e8bb2088b07f1d9c17f979646d8caac2840f3c300b54d8ece5dc4e2dc29cdc")
      override
          fun connectionPool(connectionPool: VirtualNodeConnectionPoolProperty.Builder.() -> Unit):
          Unit = connectionPool(VirtualNodeConnectionPoolProperty(connectionPool))

      override fun healthCheck(healthCheck: IResolvable) {
        cdkBuilder.healthCheck(healthCheck.let(IResolvable::unwrap))
      }

      override fun healthCheck(healthCheck: HealthCheckProperty) {
        cdkBuilder.healthCheck(healthCheck.let(HealthCheckProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("610909536009ea3eb8f02b76bcc5d28f01ecb6ef2da3be37c321acd89b42f00b")
      override fun healthCheck(healthCheck: HealthCheckProperty.Builder.() -> Unit): Unit =
          healthCheck(HealthCheckProperty(healthCheck))

      override fun outlierDetection(outlierDetection: IResolvable) {
        cdkBuilder.outlierDetection(outlierDetection.let(IResolvable::unwrap))
      }

      override fun outlierDetection(outlierDetection: OutlierDetectionProperty) {
        cdkBuilder.outlierDetection(outlierDetection.let(OutlierDetectionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("efa48cf3186219ec8ba58de0ca22dba76fb8b02bee554c5e3928ede7f82343e0")
      override fun outlierDetection(outlierDetection: OutlierDetectionProperty.Builder.() -> Unit):
          Unit = outlierDetection(OutlierDetectionProperty(outlierDetection))

      override fun portMapping(portMapping: IResolvable) {
        cdkBuilder.portMapping(portMapping.let(IResolvable::unwrap))
      }

      override fun portMapping(portMapping: PortMappingProperty) {
        cdkBuilder.portMapping(portMapping.let(PortMappingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3a9ffae0ca6685027997ecf8c0f50d78da5f5be9757ddf54526a3adfb2adeffe")
      override fun portMapping(portMapping: PortMappingProperty.Builder.() -> Unit): Unit =
          portMapping(PortMappingProperty(portMapping))

      override fun timeout(timeout: IResolvable) {
        cdkBuilder.timeout(timeout.let(IResolvable::unwrap))
      }

      override fun timeout(timeout: ListenerTimeoutProperty) {
        cdkBuilder.timeout(timeout.let(ListenerTimeoutProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("297ae121626d7760558e8ac310372c9625a8836052094f88a2ba4837a1305a16")
      override fun timeout(timeout: ListenerTimeoutProperty.Builder.() -> Unit): Unit =
          timeout(ListenerTimeoutProperty(timeout))

      override fun tls(tls: IResolvable) {
        cdkBuilder.tls(tls.let(IResolvable::unwrap))
      }

      override fun tls(tls: ListenerTlsProperty) {
        cdkBuilder.tls(tls.let(ListenerTlsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0008091fd2d52098801ae827f99c4c6aecd3332fb40603851df92a3eeb7cc68f")
      override fun tls(tls: ListenerTlsProperty.Builder.() -> Unit): Unit =
          tls(ListenerTlsProperty(tls))

      public fun build(): software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerProperty,
    ) : ListenerProperty {
      override fun connectionPool(): Any? = unwrap(this).getConnectionPool()

      override fun healthCheck(): Any? = unwrap(this).getHealthCheck()

      override fun outlierDetection(): Any? = unwrap(this).getOutlierDetection()

      override fun portMapping(): Any = unwrap(this).getPortMapping()

      override fun timeout(): Any? = unwrap(this).getTimeout()

      override fun tls(): Any? = unwrap(this).getTls()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ListenerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerProperty):
          ListenerProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ListenerProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface JsonFormatRefProperty {
    public fun key(): String

    public fun `value`(): String

    public interface Builder {
      public fun key(key: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.JsonFormatRefProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.JsonFormatRefProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.JsonFormatRefProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.JsonFormatRefProperty,
    ) : JsonFormatRefProperty {
      override fun key(): String = unwrap(this).getKey()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): JsonFormatRefProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.JsonFormatRefProperty):
          JsonFormatRefProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JsonFormatRefProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.JsonFormatRefProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ListenerTlsValidationContextTrustProperty {
    public fun `file`(): Any? = unwrap(this).getFile()

    public fun sds(): Any? = unwrap(this).getSds()

    public interface Builder {
      public fun `file`(`file`: IResolvable)

      public fun `file`(`file`: TlsValidationContextFileTrustProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("620bb98ce49c51057e2bf1be641b9c5f54afa1d2fa0f7d061d3190010ad556b8")
      public fun `file`(`file`: TlsValidationContextFileTrustProperty.Builder.() -> Unit)

      public fun sds(sds: IResolvable)

      public fun sds(sds: TlsValidationContextSdsTrustProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a0fa3c2e113d57cb6586f5dd27bc894489a059a0e7b77a0f92b1cce375da7328")
      public fun sds(sds: TlsValidationContextSdsTrustProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsValidationContextTrustProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsValidationContextTrustProperty.builder()

      override fun `file`(`file`: IResolvable) {
        cdkBuilder.`file`(`file`.let(IResolvable::unwrap))
      }

      override fun `file`(`file`: TlsValidationContextFileTrustProperty) {
        cdkBuilder.`file`(`file`.let(TlsValidationContextFileTrustProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("620bb98ce49c51057e2bf1be641b9c5f54afa1d2fa0f7d061d3190010ad556b8")
      override fun `file`(`file`: TlsValidationContextFileTrustProperty.Builder.() -> Unit): Unit =
          `file`(TlsValidationContextFileTrustProperty(`file`))

      override fun sds(sds: IResolvable) {
        cdkBuilder.sds(sds.let(IResolvable::unwrap))
      }

      override fun sds(sds: TlsValidationContextSdsTrustProperty) {
        cdkBuilder.sds(sds.let(TlsValidationContextSdsTrustProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a0fa3c2e113d57cb6586f5dd27bc894489a059a0e7b77a0f92b1cce375da7328")
      override fun sds(sds: TlsValidationContextSdsTrustProperty.Builder.() -> Unit): Unit =
          sds(TlsValidationContextSdsTrustProperty(sds))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsValidationContextTrustProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsValidationContextTrustProperty,
    ) : ListenerTlsValidationContextTrustProperty {
      override fun `file`(): Any? = unwrap(this).getFile()

      override fun sds(): Any? = unwrap(this).getSds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ListenerTlsValidationContextTrustProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsValidationContextTrustProperty):
          ListenerTlsValidationContextTrustProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ListenerTlsValidationContextTrustProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsValidationContextTrustProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface VirtualNodeSpecProperty {
    public fun backendDefaults(): Any? = unwrap(this).getBackendDefaults()

    public fun backends(): Any? = unwrap(this).getBackends()

    public fun listeners(): Any? = unwrap(this).getListeners()

    public fun logging(): Any? = unwrap(this).getLogging()

    public fun serviceDiscovery(): Any? = unwrap(this).getServiceDiscovery()

    public interface Builder {
      public fun backendDefaults(backendDefaults: IResolvable)

      public fun backendDefaults(backendDefaults: BackendDefaultsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("93c3429e7267bbe197b1993db796cff2ee93608dd5dc9265b57428a20d027d41")
      public fun backendDefaults(backendDefaults: BackendDefaultsProperty.Builder.() -> Unit)

      public fun backends(backends: IResolvable)

      public fun backends(backends: List<Any>)

      public fun listeners(listeners: IResolvable)

      public fun listeners(listeners: List<Any>)

      public fun logging(logging: IResolvable)

      public fun logging(logging: LoggingProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6441afb3d8eb2098051cfdb3da250f0894bb2b65ac3918ec37dbf49f66a0feb3")
      public fun logging(logging: LoggingProperty.Builder.() -> Unit)

      public fun serviceDiscovery(serviceDiscovery: IResolvable)

      public fun serviceDiscovery(serviceDiscovery: ServiceDiscoveryProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("87f3a53ccc7e8f18b7a781960027007b7d263e276f31f2c1caa0c5b74cefef6b")
      public fun serviceDiscovery(serviceDiscovery: ServiceDiscoveryProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeSpecProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeSpecProperty.builder()

      override fun backendDefaults(backendDefaults: IResolvable) {
        cdkBuilder.backendDefaults(backendDefaults.let(IResolvable::unwrap))
      }

      override fun backendDefaults(backendDefaults: BackendDefaultsProperty) {
        cdkBuilder.backendDefaults(backendDefaults.let(BackendDefaultsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("93c3429e7267bbe197b1993db796cff2ee93608dd5dc9265b57428a20d027d41")
      override fun backendDefaults(backendDefaults: BackendDefaultsProperty.Builder.() -> Unit):
          Unit = backendDefaults(BackendDefaultsProperty(backendDefaults))

      override fun backends(backends: IResolvable) {
        cdkBuilder.backends(backends.let(IResolvable::unwrap))
      }

      override fun backends(backends: List<Any>) {
        cdkBuilder.backends(backends)
      }

      override fun listeners(listeners: IResolvable) {
        cdkBuilder.listeners(listeners.let(IResolvable::unwrap))
      }

      override fun listeners(listeners: List<Any>) {
        cdkBuilder.listeners(listeners)
      }

      override fun logging(logging: IResolvable) {
        cdkBuilder.logging(logging.let(IResolvable::unwrap))
      }

      override fun logging(logging: LoggingProperty) {
        cdkBuilder.logging(logging.let(LoggingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6441afb3d8eb2098051cfdb3da250f0894bb2b65ac3918ec37dbf49f66a0feb3")
      override fun logging(logging: LoggingProperty.Builder.() -> Unit): Unit =
          logging(LoggingProperty(logging))

      override fun serviceDiscovery(serviceDiscovery: IResolvable) {
        cdkBuilder.serviceDiscovery(serviceDiscovery.let(IResolvable::unwrap))
      }

      override fun serviceDiscovery(serviceDiscovery: ServiceDiscoveryProperty) {
        cdkBuilder.serviceDiscovery(serviceDiscovery.let(ServiceDiscoveryProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("87f3a53ccc7e8f18b7a781960027007b7d263e276f31f2c1caa0c5b74cefef6b")
      override fun serviceDiscovery(serviceDiscovery: ServiceDiscoveryProperty.Builder.() -> Unit):
          Unit = serviceDiscovery(ServiceDiscoveryProperty(serviceDiscovery))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeSpecProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeSpecProperty,
    ) : VirtualNodeSpecProperty {
      override fun backendDefaults(): Any? = unwrap(this).getBackendDefaults()

      override fun backends(): Any? = unwrap(this).getBackends()

      override fun listeners(): Any? = unwrap(this).getListeners()

      override fun logging(): Any? = unwrap(this).getLogging()

      override fun serviceDiscovery(): Any? = unwrap(this).getServiceDiscovery()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VirtualNodeSpecProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeSpecProperty):
          VirtualNodeSpecProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualNodeSpecProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeSpecProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface VirtualNodeTcpConnectionPoolProperty {
    public fun maxConnections(): Number

    public interface Builder {
      public fun maxConnections(maxConnections: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeTcpConnectionPoolProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeTcpConnectionPoolProperty.builder()

      override fun maxConnections(maxConnections: Number) {
        cdkBuilder.maxConnections(maxConnections)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeTcpConnectionPoolProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeTcpConnectionPoolProperty,
    ) : VirtualNodeTcpConnectionPoolProperty {
      override fun maxConnections(): Number = unwrap(this).getMaxConnections()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          VirtualNodeTcpConnectionPoolProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeTcpConnectionPoolProperty):
          VirtualNodeTcpConnectionPoolProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualNodeTcpConnectionPoolProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeTcpConnectionPoolProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface BackendProperty {
    public fun virtualService(): Any? = unwrap(this).getVirtualService()

    public interface Builder {
      public fun virtualService(virtualService: IResolvable)

      public fun virtualService(virtualService: VirtualServiceBackendProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5c45154c7b732c8f59abc0fb00ae92eae74b98e93f2cff81eb01385b916a79fb")
      public fun virtualService(virtualService: VirtualServiceBackendProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.BackendProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.BackendProperty.builder()

      override fun virtualService(virtualService: IResolvable) {
        cdkBuilder.virtualService(virtualService.let(IResolvable::unwrap))
      }

      override fun virtualService(virtualService: VirtualServiceBackendProperty) {
        cdkBuilder.virtualService(virtualService.let(VirtualServiceBackendProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5c45154c7b732c8f59abc0fb00ae92eae74b98e93f2cff81eb01385b916a79fb")
      override fun virtualService(virtualService: VirtualServiceBackendProperty.Builder.() -> Unit):
          Unit = virtualService(VirtualServiceBackendProperty(virtualService))

      public fun build(): software.amazon.awscdk.services.appmesh.CfnVirtualNode.BackendProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.BackendProperty,
    ) : BackendProperty {
      override fun virtualService(): Any? = unwrap(this).getVirtualService()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BackendProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.BackendProperty):
          BackendProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BackendProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.BackendProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AwsCloudMapInstanceAttributeProperty {
    public fun key(): String

    public fun `value`(): String

    public interface Builder {
      public fun key(key: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.AwsCloudMapInstanceAttributeProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.AwsCloudMapInstanceAttributeProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.AwsCloudMapInstanceAttributeProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.AwsCloudMapInstanceAttributeProperty,
    ) : AwsCloudMapInstanceAttributeProperty {
      override fun key(): String = unwrap(this).getKey()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AwsCloudMapInstanceAttributeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.AwsCloudMapInstanceAttributeProperty):
          AwsCloudMapInstanceAttributeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AwsCloudMapInstanceAttributeProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.AwsCloudMapInstanceAttributeProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ListenerTlsProperty {
    public fun certificate(): Any

    public fun mode(): String

    public fun validation(): Any? = unwrap(this).getValidation()

    public interface Builder {
      public fun certificate(certificate: IResolvable)

      public fun certificate(certificate: ListenerTlsCertificateProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("15a66daa66c3b460d194e3fe5bc22be0a14ffea04b50cf2142dd0d8be36258b5")
      public fun certificate(certificate: ListenerTlsCertificateProperty.Builder.() -> Unit)

      public fun mode(mode: String)

      public fun validation(validation: IResolvable)

      public fun validation(validation: ListenerTlsValidationContextProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("36ab8e075abb74c1fa39f8eee4d5f3d39a37610e664f68a221417bfb3fc5132b")
      public fun validation(validation: ListenerTlsValidationContextProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsProperty.builder()

      override fun certificate(certificate: IResolvable) {
        cdkBuilder.certificate(certificate.let(IResolvable::unwrap))
      }

      override fun certificate(certificate: ListenerTlsCertificateProperty) {
        cdkBuilder.certificate(certificate.let(ListenerTlsCertificateProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("15a66daa66c3b460d194e3fe5bc22be0a14ffea04b50cf2142dd0d8be36258b5")
      override fun certificate(certificate: ListenerTlsCertificateProperty.Builder.() -> Unit): Unit
          = certificate(ListenerTlsCertificateProperty(certificate))

      override fun mode(mode: String) {
        cdkBuilder.mode(mode)
      }

      override fun validation(validation: IResolvable) {
        cdkBuilder.validation(validation.let(IResolvable::unwrap))
      }

      override fun validation(validation: ListenerTlsValidationContextProperty) {
        cdkBuilder.validation(validation.let(ListenerTlsValidationContextProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("36ab8e075abb74c1fa39f8eee4d5f3d39a37610e664f68a221417bfb3fc5132b")
      override fun validation(validation: ListenerTlsValidationContextProperty.Builder.() -> Unit):
          Unit = validation(ListenerTlsValidationContextProperty(validation))

      public fun build(): software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsProperty,
    ) : ListenerTlsProperty {
      override fun certificate(): Any = unwrap(this).getCertificate()

      override fun mode(): String = unwrap(this).getMode()

      override fun validation(): Any? = unwrap(this).getValidation()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ListenerTlsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsProperty):
          ListenerTlsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ListenerTlsProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface VirtualServiceBackendProperty {
    public fun clientPolicy(): Any? = unwrap(this).getClientPolicy()

    public fun virtualServiceName(): String

    public interface Builder {
      public fun clientPolicy(clientPolicy: IResolvable)

      public fun clientPolicy(clientPolicy: ClientPolicyProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("022f978780cab0ef15845ab544ecf5221e76f3617033f5630cf66211959b3666")
      public fun clientPolicy(clientPolicy: ClientPolicyProperty.Builder.() -> Unit)

      public fun virtualServiceName(virtualServiceName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualServiceBackendProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualServiceBackendProperty.builder()

      override fun clientPolicy(clientPolicy: IResolvable) {
        cdkBuilder.clientPolicy(clientPolicy.let(IResolvable::unwrap))
      }

      override fun clientPolicy(clientPolicy: ClientPolicyProperty) {
        cdkBuilder.clientPolicy(clientPolicy.let(ClientPolicyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("022f978780cab0ef15845ab544ecf5221e76f3617033f5630cf66211959b3666")
      override fun clientPolicy(clientPolicy: ClientPolicyProperty.Builder.() -> Unit): Unit =
          clientPolicy(ClientPolicyProperty(clientPolicy))

      override fun virtualServiceName(virtualServiceName: String) {
        cdkBuilder.virtualServiceName(virtualServiceName)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualServiceBackendProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualServiceBackendProperty,
    ) : VirtualServiceBackendProperty {
      override fun clientPolicy(): Any? = unwrap(this).getClientPolicy()

      override fun virtualServiceName(): String = unwrap(this).getVirtualServiceName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VirtualServiceBackendProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualServiceBackendProperty):
          VirtualServiceBackendProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualServiceBackendProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualServiceBackendProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface PortMappingProperty {
    public fun port(): Number

    public fun protocol(): String

    public interface Builder {
      public fun port(port: Number)

      public fun protocol(protocol: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.PortMappingProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.PortMappingProperty.builder()

      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      public fun build(): software.amazon.awscdk.services.appmesh.CfnVirtualNode.PortMappingProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.PortMappingProperty,
    ) : PortMappingProperty {
      override fun port(): Number = unwrap(this).getPort()

      override fun protocol(): String = unwrap(this).getProtocol()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PortMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.PortMappingProperty):
          PortMappingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PortMappingProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.PortMappingProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface GrpcTimeoutProperty {
    public fun idle(): Any? = unwrap(this).getIdle()

    public fun perRequest(): Any? = unwrap(this).getPerRequest()

    public interface Builder {
      public fun idle(idle: IResolvable)

      public fun idle(idle: DurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("90b25b27f96c7e2df24ce038e0a897063f89275adfac0b54881036c661e0e80b")
      public fun idle(idle: DurationProperty.Builder.() -> Unit)

      public fun perRequest(perRequest: IResolvable)

      public fun perRequest(perRequest: DurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("266c0d44ee846fcab305abe9d71f1af2ec6a53d4d89660754765ee39a43917cd")
      public fun perRequest(perRequest: DurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.GrpcTimeoutProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.GrpcTimeoutProperty.builder()

      override fun idle(idle: IResolvable) {
        cdkBuilder.idle(idle.let(IResolvable::unwrap))
      }

      override fun idle(idle: DurationProperty) {
        cdkBuilder.idle(idle.let(DurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("90b25b27f96c7e2df24ce038e0a897063f89275adfac0b54881036c661e0e80b")
      override fun idle(idle: DurationProperty.Builder.() -> Unit): Unit =
          idle(DurationProperty(idle))

      override fun perRequest(perRequest: IResolvable) {
        cdkBuilder.perRequest(perRequest.let(IResolvable::unwrap))
      }

      override fun perRequest(perRequest: DurationProperty) {
        cdkBuilder.perRequest(perRequest.let(DurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("266c0d44ee846fcab305abe9d71f1af2ec6a53d4d89660754765ee39a43917cd")
      override fun perRequest(perRequest: DurationProperty.Builder.() -> Unit): Unit =
          perRequest(DurationProperty(perRequest))

      public fun build(): software.amazon.awscdk.services.appmesh.CfnVirtualNode.GrpcTimeoutProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.GrpcTimeoutProperty,
    ) : GrpcTimeoutProperty {
      override fun idle(): Any? = unwrap(this).getIdle()

      override fun perRequest(): Any? = unwrap(this).getPerRequest()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GrpcTimeoutProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.GrpcTimeoutProperty):
          GrpcTimeoutProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GrpcTimeoutProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.GrpcTimeoutProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ListenerTlsFileCertificateProperty {
    public fun certificateChain(): String

    public fun privateKey(): String

    public interface Builder {
      public fun certificateChain(certificateChain: String)

      public fun privateKey(privateKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsFileCertificateProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsFileCertificateProperty.builder()

      override fun certificateChain(certificateChain: String) {
        cdkBuilder.certificateChain(certificateChain)
      }

      override fun privateKey(privateKey: String) {
        cdkBuilder.privateKey(privateKey)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsFileCertificateProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsFileCertificateProperty,
    ) : ListenerTlsFileCertificateProperty {
      override fun certificateChain(): String = unwrap(this).getCertificateChain()

      override fun privateKey(): String = unwrap(this).getPrivateKey()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ListenerTlsFileCertificateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsFileCertificateProperty):
          ListenerTlsFileCertificateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ListenerTlsFileCertificateProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsFileCertificateProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface TlsValidationContextProperty {
    public fun subjectAlternativeNames(): Any? = unwrap(this).getSubjectAlternativeNames()

    public fun trust(): Any

    public interface Builder {
      public fun subjectAlternativeNames(subjectAlternativeNames: IResolvable)

      public fun subjectAlternativeNames(subjectAlternativeNames: SubjectAlternativeNamesProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2fbac1c9e17d90922149c31c7fa1e1e1a4509bfe76c8b013c33c69fa977e3697")
      public
          fun subjectAlternativeNames(subjectAlternativeNames: SubjectAlternativeNamesProperty.Builder.() -> Unit)

      public fun trust(trust: IResolvable)

      public fun trust(trust: TlsValidationContextTrustProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c010c0c915933602efc06c66a1d3dbf78856d82cf99b1638743b881d342f088a")
      public fun trust(trust: TlsValidationContextTrustProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextProperty.builder()

      override fun subjectAlternativeNames(subjectAlternativeNames: IResolvable) {
        cdkBuilder.subjectAlternativeNames(subjectAlternativeNames.let(IResolvable::unwrap))
      }

      override
          fun subjectAlternativeNames(subjectAlternativeNames: SubjectAlternativeNamesProperty) {
        cdkBuilder.subjectAlternativeNames(subjectAlternativeNames.let(SubjectAlternativeNamesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2fbac1c9e17d90922149c31c7fa1e1e1a4509bfe76c8b013c33c69fa977e3697")
      override
          fun subjectAlternativeNames(subjectAlternativeNames: SubjectAlternativeNamesProperty.Builder.() -> Unit):
          Unit = subjectAlternativeNames(SubjectAlternativeNamesProperty(subjectAlternativeNames))

      override fun trust(trust: IResolvable) {
        cdkBuilder.trust(trust.let(IResolvable::unwrap))
      }

      override fun trust(trust: TlsValidationContextTrustProperty) {
        cdkBuilder.trust(trust.let(TlsValidationContextTrustProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c010c0c915933602efc06c66a1d3dbf78856d82cf99b1638743b881d342f088a")
      override fun trust(trust: TlsValidationContextTrustProperty.Builder.() -> Unit): Unit =
          trust(TlsValidationContextTrustProperty(trust))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextProperty,
    ) : TlsValidationContextProperty {
      override fun subjectAlternativeNames(): Any? = unwrap(this).getSubjectAlternativeNames()

      override fun trust(): Any = unwrap(this).getTrust()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TlsValidationContextProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextProperty):
          TlsValidationContextProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TlsValidationContextProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TlsValidationContextTrustProperty {
    public fun acm(): Any? = unwrap(this).getAcm()

    public fun `file`(): Any? = unwrap(this).getFile()

    public fun sds(): Any? = unwrap(this).getSds()

    public interface Builder {
      public fun acm(acm: IResolvable)

      public fun acm(acm: TlsValidationContextAcmTrustProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb63f15a5cad48e41bf4fe1e5f2aa2ae1aeda3bc331063aadec52e56a1e06a08")
      public fun acm(acm: TlsValidationContextAcmTrustProperty.Builder.() -> Unit)

      public fun `file`(`file`: IResolvable)

      public fun `file`(`file`: TlsValidationContextFileTrustProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6597900f308a602deef50656d736b7ddb34b29ef5b3a7cb8a83e55d8de744860")
      public fun `file`(`file`: TlsValidationContextFileTrustProperty.Builder.() -> Unit)

      public fun sds(sds: IResolvable)

      public fun sds(sds: TlsValidationContextSdsTrustProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d24627abc7e81d199764f87dccbc7e922ddeeee1622a06fda7588dc04cd2bd4a")
      public fun sds(sds: TlsValidationContextSdsTrustProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextTrustProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextTrustProperty.builder()

      override fun acm(acm: IResolvable) {
        cdkBuilder.acm(acm.let(IResolvable::unwrap))
      }

      override fun acm(acm: TlsValidationContextAcmTrustProperty) {
        cdkBuilder.acm(acm.let(TlsValidationContextAcmTrustProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb63f15a5cad48e41bf4fe1e5f2aa2ae1aeda3bc331063aadec52e56a1e06a08")
      override fun acm(acm: TlsValidationContextAcmTrustProperty.Builder.() -> Unit): Unit =
          acm(TlsValidationContextAcmTrustProperty(acm))

      override fun `file`(`file`: IResolvable) {
        cdkBuilder.`file`(`file`.let(IResolvable::unwrap))
      }

      override fun `file`(`file`: TlsValidationContextFileTrustProperty) {
        cdkBuilder.`file`(`file`.let(TlsValidationContextFileTrustProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6597900f308a602deef50656d736b7ddb34b29ef5b3a7cb8a83e55d8de744860")
      override fun `file`(`file`: TlsValidationContextFileTrustProperty.Builder.() -> Unit): Unit =
          `file`(TlsValidationContextFileTrustProperty(`file`))

      override fun sds(sds: IResolvable) {
        cdkBuilder.sds(sds.let(IResolvable::unwrap))
      }

      override fun sds(sds: TlsValidationContextSdsTrustProperty) {
        cdkBuilder.sds(sds.let(TlsValidationContextSdsTrustProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d24627abc7e81d199764f87dccbc7e922ddeeee1622a06fda7588dc04cd2bd4a")
      override fun sds(sds: TlsValidationContextSdsTrustProperty.Builder.() -> Unit): Unit =
          sds(TlsValidationContextSdsTrustProperty(sds))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextTrustProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextTrustProperty,
    ) : TlsValidationContextTrustProperty {
      override fun acm(): Any? = unwrap(this).getAcm()

      override fun `file`(): Any? = unwrap(this).getFile()

      override fun sds(): Any? = unwrap(this).getSds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          TlsValidationContextTrustProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextTrustProperty):
          TlsValidationContextTrustProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TlsValidationContextTrustProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextTrustProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TlsValidationContextSdsTrustProperty {
    public fun secretName(): String

    public interface Builder {
      public fun secretName(secretName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextSdsTrustProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextSdsTrustProperty.builder()

      override fun secretName(secretName: String) {
        cdkBuilder.secretName(secretName)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextSdsTrustProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextSdsTrustProperty,
    ) : TlsValidationContextSdsTrustProperty {
      override fun secretName(): String = unwrap(this).getSecretName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          TlsValidationContextSdsTrustProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextSdsTrustProperty):
          TlsValidationContextSdsTrustProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TlsValidationContextSdsTrustProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextSdsTrustProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface BackendDefaultsProperty {
    public fun clientPolicy(): Any? = unwrap(this).getClientPolicy()

    public interface Builder {
      public fun clientPolicy(clientPolicy: IResolvable)

      public fun clientPolicy(clientPolicy: ClientPolicyProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ec82bae459447564b82e97e36187eb807c00ee08eac5befe6bb4c7f379c5866d")
      public fun clientPolicy(clientPolicy: ClientPolicyProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.BackendDefaultsProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.BackendDefaultsProperty.builder()

      override fun clientPolicy(clientPolicy: IResolvable) {
        cdkBuilder.clientPolicy(clientPolicy.let(IResolvable::unwrap))
      }

      override fun clientPolicy(clientPolicy: ClientPolicyProperty) {
        cdkBuilder.clientPolicy(clientPolicy.let(ClientPolicyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ec82bae459447564b82e97e36187eb807c00ee08eac5befe6bb4c7f379c5866d")
      override fun clientPolicy(clientPolicy: ClientPolicyProperty.Builder.() -> Unit): Unit =
          clientPolicy(ClientPolicyProperty(clientPolicy))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.BackendDefaultsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.BackendDefaultsProperty,
    ) : BackendDefaultsProperty {
      override fun clientPolicy(): Any? = unwrap(this).getClientPolicy()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BackendDefaultsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.BackendDefaultsProperty):
          BackendDefaultsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BackendDefaultsProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.BackendDefaultsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface DnsServiceDiscoveryProperty {
    public fun hostname(): String

    public fun ipPreference(): String? = unwrap(this).getIpPreference()

    public fun responseType(): String? = unwrap(this).getResponseType()

    public interface Builder {
      public fun hostname(hostname: String)

      public fun ipPreference(ipPreference: String)

      public fun responseType(responseType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.DnsServiceDiscoveryProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.DnsServiceDiscoveryProperty.builder()

      override fun hostname(hostname: String) {
        cdkBuilder.hostname(hostname)
      }

      override fun ipPreference(ipPreference: String) {
        cdkBuilder.ipPreference(ipPreference)
      }

      override fun responseType(responseType: String) {
        cdkBuilder.responseType(responseType)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.DnsServiceDiscoveryProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.DnsServiceDiscoveryProperty,
    ) : DnsServiceDiscoveryProperty {
      override fun hostname(): String = unwrap(this).getHostname()

      override fun ipPreference(): String? = unwrap(this).getIpPreference()

      override fun responseType(): String? = unwrap(this).getResponseType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DnsServiceDiscoveryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.DnsServiceDiscoveryProperty):
          DnsServiceDiscoveryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DnsServiceDiscoveryProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.DnsServiceDiscoveryProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TcpTimeoutProperty {
    public fun idle(): Any? = unwrap(this).getIdle()

    public interface Builder {
      public fun idle(idle: IResolvable)

      public fun idle(idle: DurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1202822280c7976ca3248e5db1a8cd0d1890e751704b05a427555359639593d4")
      public fun idle(idle: DurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TcpTimeoutProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TcpTimeoutProperty.builder()

      override fun idle(idle: IResolvable) {
        cdkBuilder.idle(idle.let(IResolvable::unwrap))
      }

      override fun idle(idle: DurationProperty) {
        cdkBuilder.idle(idle.let(DurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1202822280c7976ca3248e5db1a8cd0d1890e751704b05a427555359639593d4")
      override fun idle(idle: DurationProperty.Builder.() -> Unit): Unit =
          idle(DurationProperty(idle))

      public fun build(): software.amazon.awscdk.services.appmesh.CfnVirtualNode.TcpTimeoutProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TcpTimeoutProperty,
    ) : TcpTimeoutProperty {
      override fun idle(): Any? = unwrap(this).getIdle()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TcpTimeoutProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.TcpTimeoutProperty):
          TcpTimeoutProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TcpTimeoutProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TcpTimeoutProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ServiceDiscoveryProperty {
    public fun awsCloudMap(): Any? = unwrap(this).getAwsCloudMap()

    public fun dns(): Any? = unwrap(this).getDns()

    public interface Builder {
      public fun awsCloudMap(awsCloudMap: IResolvable)

      public fun awsCloudMap(awsCloudMap: AwsCloudMapServiceDiscoveryProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4f4452b939a9d3b4aa9934695f09cb4d64015d289bd0701da15ccf4ca562756d")
      public fun awsCloudMap(awsCloudMap: AwsCloudMapServiceDiscoveryProperty.Builder.() -> Unit)

      public fun dns(dns: IResolvable)

      public fun dns(dns: DnsServiceDiscoveryProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e79e4905cd9f949ff7be9422a85e0a6091b615a3075d869480e67de3930a3937")
      public fun dns(dns: DnsServiceDiscoveryProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ServiceDiscoveryProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ServiceDiscoveryProperty.builder()

      override fun awsCloudMap(awsCloudMap: IResolvable) {
        cdkBuilder.awsCloudMap(awsCloudMap.let(IResolvable::unwrap))
      }

      override fun awsCloudMap(awsCloudMap: AwsCloudMapServiceDiscoveryProperty) {
        cdkBuilder.awsCloudMap(awsCloudMap.let(AwsCloudMapServiceDiscoveryProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4f4452b939a9d3b4aa9934695f09cb4d64015d289bd0701da15ccf4ca562756d")
      override fun awsCloudMap(awsCloudMap: AwsCloudMapServiceDiscoveryProperty.Builder.() -> Unit):
          Unit = awsCloudMap(AwsCloudMapServiceDiscoveryProperty(awsCloudMap))

      override fun dns(dns: IResolvable) {
        cdkBuilder.dns(dns.let(IResolvable::unwrap))
      }

      override fun dns(dns: DnsServiceDiscoveryProperty) {
        cdkBuilder.dns(dns.let(DnsServiceDiscoveryProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e79e4905cd9f949ff7be9422a85e0a6091b615a3075d869480e67de3930a3937")
      override fun dns(dns: DnsServiceDiscoveryProperty.Builder.() -> Unit): Unit =
          dns(DnsServiceDiscoveryProperty(dns))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ServiceDiscoveryProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ServiceDiscoveryProperty,
    ) : ServiceDiscoveryProperty {
      override fun awsCloudMap(): Any? = unwrap(this).getAwsCloudMap()

      override fun dns(): Any? = unwrap(this).getDns()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ServiceDiscoveryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.ServiceDiscoveryProperty):
          ServiceDiscoveryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceDiscoveryProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ServiceDiscoveryProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface SubjectAlternativeNamesProperty {
    public fun match(): Any

    public interface Builder {
      public fun match(match: IResolvable)

      public fun match(match: SubjectAlternativeNameMatchersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d75a28480f58e64c5c9aef98fb928d9df770b21bd41a24aa274293535ab4932")
      public fun match(match: SubjectAlternativeNameMatchersProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.SubjectAlternativeNamesProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.SubjectAlternativeNamesProperty.builder()

      override fun match(match: IResolvable) {
        cdkBuilder.match(match.let(IResolvable::unwrap))
      }

      override fun match(match: SubjectAlternativeNameMatchersProperty) {
        cdkBuilder.match(match.let(SubjectAlternativeNameMatchersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d75a28480f58e64c5c9aef98fb928d9df770b21bd41a24aa274293535ab4932")
      override fun match(match: SubjectAlternativeNameMatchersProperty.Builder.() -> Unit): Unit =
          match(SubjectAlternativeNameMatchersProperty(match))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.SubjectAlternativeNamesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.SubjectAlternativeNamesProperty,
    ) : SubjectAlternativeNamesProperty {
      override fun match(): Any = unwrap(this).getMatch()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SubjectAlternativeNamesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.SubjectAlternativeNamesProperty):
          SubjectAlternativeNamesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SubjectAlternativeNamesProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.SubjectAlternativeNamesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface VirtualNodeHttpConnectionPoolProperty {
    public fun maxConnections(): Number

    public fun maxPendingRequests(): Number? = unwrap(this).getMaxPendingRequests()

    public interface Builder {
      public fun maxConnections(maxConnections: Number)

      public fun maxPendingRequests(maxPendingRequests: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeHttpConnectionPoolProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeHttpConnectionPoolProperty.builder()

      override fun maxConnections(maxConnections: Number) {
        cdkBuilder.maxConnections(maxConnections)
      }

      override fun maxPendingRequests(maxPendingRequests: Number) {
        cdkBuilder.maxPendingRequests(maxPendingRequests)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeHttpConnectionPoolProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeHttpConnectionPoolProperty,
    ) : VirtualNodeHttpConnectionPoolProperty {
      override fun maxConnections(): Number = unwrap(this).getMaxConnections()

      override fun maxPendingRequests(): Number? = unwrap(this).getMaxPendingRequests()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          VirtualNodeHttpConnectionPoolProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeHttpConnectionPoolProperty):
          VirtualNodeHttpConnectionPoolProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualNodeHttpConnectionPoolProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeHttpConnectionPoolProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface OutlierDetectionProperty {
    public fun baseEjectionDuration(): Any

    public fun interval(): Any

    public fun maxEjectionPercent(): Number

    public fun maxServerErrors(): Number

    public interface Builder {
      public fun baseEjectionDuration(baseEjectionDuration: IResolvable)

      public fun baseEjectionDuration(baseEjectionDuration: DurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0867a5ae648b42fd076947eb99dfd241a5aecb6a534ba6a6d59ba9bd2717b04f")
      public fun baseEjectionDuration(baseEjectionDuration: DurationProperty.Builder.() -> Unit)

      public fun interval(interval: IResolvable)

      public fun interval(interval: DurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("27d118dd24b02a9b9c8cd6e041185ff348351f81340827bd053f9e032927a5c3")
      public fun interval(interval: DurationProperty.Builder.() -> Unit)

      public fun maxEjectionPercent(maxEjectionPercent: Number)

      public fun maxServerErrors(maxServerErrors: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.OutlierDetectionProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.OutlierDetectionProperty.builder()

      override fun baseEjectionDuration(baseEjectionDuration: IResolvable) {
        cdkBuilder.baseEjectionDuration(baseEjectionDuration.let(IResolvable::unwrap))
      }

      override fun baseEjectionDuration(baseEjectionDuration: DurationProperty) {
        cdkBuilder.baseEjectionDuration(baseEjectionDuration.let(DurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0867a5ae648b42fd076947eb99dfd241a5aecb6a534ba6a6d59ba9bd2717b04f")
      override fun baseEjectionDuration(baseEjectionDuration: DurationProperty.Builder.() -> Unit):
          Unit = baseEjectionDuration(DurationProperty(baseEjectionDuration))

      override fun interval(interval: IResolvable) {
        cdkBuilder.interval(interval.let(IResolvable::unwrap))
      }

      override fun interval(interval: DurationProperty) {
        cdkBuilder.interval(interval.let(DurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("27d118dd24b02a9b9c8cd6e041185ff348351f81340827bd053f9e032927a5c3")
      override fun interval(interval: DurationProperty.Builder.() -> Unit): Unit =
          interval(DurationProperty(interval))

      override fun maxEjectionPercent(maxEjectionPercent: Number) {
        cdkBuilder.maxEjectionPercent(maxEjectionPercent)
      }

      override fun maxServerErrors(maxServerErrors: Number) {
        cdkBuilder.maxServerErrors(maxServerErrors)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.OutlierDetectionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.OutlierDetectionProperty,
    ) : OutlierDetectionProperty {
      override fun baseEjectionDuration(): Any = unwrap(this).getBaseEjectionDuration()

      override fun interval(): Any = unwrap(this).getInterval()

      override fun maxEjectionPercent(): Number = unwrap(this).getMaxEjectionPercent()

      override fun maxServerErrors(): Number = unwrap(this).getMaxServerErrors()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OutlierDetectionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.OutlierDetectionProperty):
          OutlierDetectionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutlierDetectionProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.OutlierDetectionProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ClientTlsCertificateProperty {
    public fun `file`(): Any? = unwrap(this).getFile()

    public fun sds(): Any? = unwrap(this).getSds()

    public interface Builder {
      public fun `file`(`file`: IResolvable)

      public fun `file`(`file`: ListenerTlsFileCertificateProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("89dca484bf00da5c3810ab17ce2c7fd790d5f2cb61f116d8e1691f971a7974de")
      public fun `file`(`file`: ListenerTlsFileCertificateProperty.Builder.() -> Unit)

      public fun sds(sds: IResolvable)

      public fun sds(sds: ListenerTlsSdsCertificateProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f178bacd4f943b1f35bfc93258a12bc42329f24ada864adbe4f0230c8eec7dc1")
      public fun sds(sds: ListenerTlsSdsCertificateProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientTlsCertificateProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientTlsCertificateProperty.builder()

      override fun `file`(`file`: IResolvable) {
        cdkBuilder.`file`(`file`.let(IResolvable::unwrap))
      }

      override fun `file`(`file`: ListenerTlsFileCertificateProperty) {
        cdkBuilder.`file`(`file`.let(ListenerTlsFileCertificateProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("89dca484bf00da5c3810ab17ce2c7fd790d5f2cb61f116d8e1691f971a7974de")
      override fun `file`(`file`: ListenerTlsFileCertificateProperty.Builder.() -> Unit): Unit =
          `file`(ListenerTlsFileCertificateProperty(`file`))

      override fun sds(sds: IResolvable) {
        cdkBuilder.sds(sds.let(IResolvable::unwrap))
      }

      override fun sds(sds: ListenerTlsSdsCertificateProperty) {
        cdkBuilder.sds(sds.let(ListenerTlsSdsCertificateProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f178bacd4f943b1f35bfc93258a12bc42329f24ada864adbe4f0230c8eec7dc1")
      override fun sds(sds: ListenerTlsSdsCertificateProperty.Builder.() -> Unit): Unit =
          sds(ListenerTlsSdsCertificateProperty(sds))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientTlsCertificateProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientTlsCertificateProperty,
    ) : ClientTlsCertificateProperty {
      override fun `file`(): Any? = unwrap(this).getFile()

      override fun sds(): Any? = unwrap(this).getSds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ClientTlsCertificateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientTlsCertificateProperty):
          ClientTlsCertificateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClientTlsCertificateProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientTlsCertificateProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface VirtualNodeHttp2ConnectionPoolProperty {
    public fun maxRequests(): Number

    public interface Builder {
      public fun maxRequests(maxRequests: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeHttp2ConnectionPoolProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeHttp2ConnectionPoolProperty.builder()

      override fun maxRequests(maxRequests: Number) {
        cdkBuilder.maxRequests(maxRequests)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeHttp2ConnectionPoolProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeHttp2ConnectionPoolProperty,
    ) : VirtualNodeHttp2ConnectionPoolProperty {
      override fun maxRequests(): Number = unwrap(this).getMaxRequests()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          VirtualNodeHttp2ConnectionPoolProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeHttp2ConnectionPoolProperty):
          VirtualNodeHttp2ConnectionPoolProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualNodeHttp2ConnectionPoolProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeHttp2ConnectionPoolProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface HealthCheckProperty {
    public fun healthyThreshold(): Number

    public fun intervalMillis(): Number

    public fun path(): String? = unwrap(this).getPath()

    public fun port(): Number? = unwrap(this).getPort()

    public fun protocol(): String

    public fun timeoutMillis(): Number

    public fun unhealthyThreshold(): Number

    public interface Builder {
      public fun healthyThreshold(healthyThreshold: Number)

      public fun intervalMillis(intervalMillis: Number)

      public fun path(path: String)

      public fun port(port: Number)

      public fun protocol(protocol: String)

      public fun timeoutMillis(timeoutMillis: Number)

      public fun unhealthyThreshold(unhealthyThreshold: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.HealthCheckProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.HealthCheckProperty.builder()

      override fun healthyThreshold(healthyThreshold: Number) {
        cdkBuilder.healthyThreshold(healthyThreshold)
      }

      override fun intervalMillis(intervalMillis: Number) {
        cdkBuilder.intervalMillis(intervalMillis)
      }

      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      override fun timeoutMillis(timeoutMillis: Number) {
        cdkBuilder.timeoutMillis(timeoutMillis)
      }

      override fun unhealthyThreshold(unhealthyThreshold: Number) {
        cdkBuilder.unhealthyThreshold(unhealthyThreshold)
      }

      public fun build(): software.amazon.awscdk.services.appmesh.CfnVirtualNode.HealthCheckProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.HealthCheckProperty,
    ) : HealthCheckProperty {
      override fun healthyThreshold(): Number = unwrap(this).getHealthyThreshold()

      override fun intervalMillis(): Number = unwrap(this).getIntervalMillis()

      override fun path(): String? = unwrap(this).getPath()

      override fun port(): Number? = unwrap(this).getPort()

      override fun protocol(): String = unwrap(this).getProtocol()

      override fun timeoutMillis(): Number = unwrap(this).getTimeoutMillis()

      override fun unhealthyThreshold(): Number = unwrap(this).getUnhealthyThreshold()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HealthCheckProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.HealthCheckProperty):
          HealthCheckProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HealthCheckProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.HealthCheckProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ListenerTimeoutProperty {
    public fun grpc(): Any? = unwrap(this).getGrpc()

    public fun http(): Any? = unwrap(this).getHttp()

    public fun http2(): Any? = unwrap(this).getHttp2()

    public fun tcp(): Any? = unwrap(this).getTcp()

    public interface Builder {
      public fun grpc(grpc: IResolvable)

      public fun grpc(grpc: GrpcTimeoutProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("24ab94bdef721a1d71e64b1366e6fa97856af0605600c4386e2b3a4d3bee9b92")
      public fun grpc(grpc: GrpcTimeoutProperty.Builder.() -> Unit)

      public fun http(http: IResolvable)

      public fun http(http: HttpTimeoutProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ec837eab74e9ee033aded64202fddce06d4c51d521c77b554e3b17d74c2afcdf")
      public fun http(http: HttpTimeoutProperty.Builder.() -> Unit)

      public fun http2(http2: IResolvable)

      public fun http2(http2: HttpTimeoutProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ecd650fe52c88cc09a88346ca59cdd8ee5cb66f5e62241a9f55df42e85e5ae76")
      public fun http2(http2: HttpTimeoutProperty.Builder.() -> Unit)

      public fun tcp(tcp: IResolvable)

      public fun tcp(tcp: TcpTimeoutProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2367403a8ddfd6a378681f9db77a7303388e580a270a1a2f8e7fc4b2c32ce07a")
      public fun tcp(tcp: TcpTimeoutProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTimeoutProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTimeoutProperty.builder()

      override fun grpc(grpc: IResolvable) {
        cdkBuilder.grpc(grpc.let(IResolvable::unwrap))
      }

      override fun grpc(grpc: GrpcTimeoutProperty) {
        cdkBuilder.grpc(grpc.let(GrpcTimeoutProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("24ab94bdef721a1d71e64b1366e6fa97856af0605600c4386e2b3a4d3bee9b92")
      override fun grpc(grpc: GrpcTimeoutProperty.Builder.() -> Unit): Unit =
          grpc(GrpcTimeoutProperty(grpc))

      override fun http(http: IResolvable) {
        cdkBuilder.http(http.let(IResolvable::unwrap))
      }

      override fun http(http: HttpTimeoutProperty) {
        cdkBuilder.http(http.let(HttpTimeoutProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ec837eab74e9ee033aded64202fddce06d4c51d521c77b554e3b17d74c2afcdf")
      override fun http(http: HttpTimeoutProperty.Builder.() -> Unit): Unit =
          http(HttpTimeoutProperty(http))

      override fun http2(http2: IResolvable) {
        cdkBuilder.http2(http2.let(IResolvable::unwrap))
      }

      override fun http2(http2: HttpTimeoutProperty) {
        cdkBuilder.http2(http2.let(HttpTimeoutProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ecd650fe52c88cc09a88346ca59cdd8ee5cb66f5e62241a9f55df42e85e5ae76")
      override fun http2(http2: HttpTimeoutProperty.Builder.() -> Unit): Unit =
          http2(HttpTimeoutProperty(http2))

      override fun tcp(tcp: IResolvable) {
        cdkBuilder.tcp(tcp.let(IResolvable::unwrap))
      }

      override fun tcp(tcp: TcpTimeoutProperty) {
        cdkBuilder.tcp(tcp.let(TcpTimeoutProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2367403a8ddfd6a378681f9db77a7303388e580a270a1a2f8e7fc4b2c32ce07a")
      override fun tcp(tcp: TcpTimeoutProperty.Builder.() -> Unit): Unit =
          tcp(TcpTimeoutProperty(tcp))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTimeoutProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTimeoutProperty,
    ) : ListenerTimeoutProperty {
      override fun grpc(): Any? = unwrap(this).getGrpc()

      override fun http(): Any? = unwrap(this).getHttp()

      override fun http2(): Any? = unwrap(this).getHttp2()

      override fun tcp(): Any? = unwrap(this).getTcp()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ListenerTimeoutProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTimeoutProperty):
          ListenerTimeoutProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ListenerTimeoutProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTimeoutProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
