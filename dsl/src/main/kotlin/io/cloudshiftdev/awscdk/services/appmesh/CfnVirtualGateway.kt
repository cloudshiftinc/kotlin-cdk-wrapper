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

public open class CfnVirtualGateway internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualGateway,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrMeshName(): String = unwrap(this).getAttrMeshName()

  public open fun attrMeshOwner(): String = unwrap(this).getAttrMeshOwner()

  public open fun attrResourceOwner(): String = unwrap(this).getAttrResourceOwner()

  public open fun attrUid(): String = unwrap(this).getAttrUid()

  public open fun attrVirtualGatewayName(): String = unwrap(this).getAttrVirtualGatewayName()

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

  public open fun spec(`value`: VirtualGatewaySpecProperty) {
    unwrap(this).setSpec(`value`.let(VirtualGatewaySpecProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("025e16cf37efee7630e01c04f34aa544249e28bf97500f033b54dea93a273194")
  public open fun spec(`value`: VirtualGatewaySpecProperty.Builder.() -> Unit): Unit =
      spec(VirtualGatewaySpecProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun virtualGatewayName(): String? = unwrap(this).getVirtualGatewayName()

  public open fun virtualGatewayName(`value`: String) {
    unwrap(this).setVirtualGatewayName(`value`)
  }

  public interface Builder {
    public fun meshName(meshName: String)

    public fun meshOwner(meshOwner: String)

    public fun spec(spec: IResolvable)

    public fun spec(spec: VirtualGatewaySpecProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("094bb9fb45cd48eb4c6e5ae3a26fad70117ef541162b6d88b9be58fdb278c487")
    public fun spec(spec: VirtualGatewaySpecProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun virtualGatewayName(virtualGatewayName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.CfnVirtualGateway.Builder =
        software.amazon.awscdk.services.appmesh.CfnVirtualGateway.Builder.create(scope, id)

    override fun meshName(meshName: String) {
      cdkBuilder.meshName(meshName)
    }

    override fun meshOwner(meshOwner: String) {
      cdkBuilder.meshOwner(meshOwner)
    }

    override fun spec(spec: IResolvable) {
      cdkBuilder.spec(spec.let(IResolvable::unwrap))
    }

    override fun spec(spec: VirtualGatewaySpecProperty) {
      cdkBuilder.spec(spec.let(VirtualGatewaySpecProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("094bb9fb45cd48eb4c6e5ae3a26fad70117ef541162b6d88b9be58fdb278c487")
    override fun spec(spec: VirtualGatewaySpecProperty.Builder.() -> Unit): Unit =
        spec(VirtualGatewaySpecProperty(spec))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun virtualGatewayName(virtualGatewayName: String) {
      cdkBuilder.virtualGatewayName(virtualGatewayName)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.CfnVirtualGateway =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVirtualGateway {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVirtualGateway(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualGateway):
        CfnVirtualGateway = CfnVirtualGateway(cdkObject)

    internal fun unwrap(wrapped: CfnVirtualGateway):
        software.amazon.awscdk.services.appmesh.CfnVirtualGateway = wrapped.cdkObject
  }

  public interface VirtualGatewayListenerTlsCertificateProperty {
    public fun acm(): Any? = unwrap(this).getAcm()

    public fun `file`(): Any? = unwrap(this).getFile()

    public fun sds(): Any? = unwrap(this).getSds()

    public interface Builder {
      public fun acm(acm: IResolvable)

      public fun acm(acm: VirtualGatewayListenerTlsAcmCertificateProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("955a2e7dfe97a7d269bf8d0bf307c405bfd93e80de5e9caa5da1a7d3fef06a12")
      public fun acm(acm: VirtualGatewayListenerTlsAcmCertificateProperty.Builder.() -> Unit)

      public fun `file`(`file`: IResolvable)

      public fun `file`(`file`: VirtualGatewayListenerTlsFileCertificateProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a7010dda9b3079e64cbb1104220ae67bcedc7ce4636d07acaf75cf2fe68f6e17")
      public fun `file`(`file`: VirtualGatewayListenerTlsFileCertificateProperty.Builder.() -> Unit)

      public fun sds(sds: IResolvable)

      public fun sds(sds: VirtualGatewayListenerTlsSdsCertificateProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b402b96a37c49380628f6ab0adc6c798705b3149f11690616a0c7a373ba825d4")
      public fun sds(sds: VirtualGatewayListenerTlsSdsCertificateProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsCertificateProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsCertificateProperty.builder()

      override fun acm(acm: IResolvable) {
        cdkBuilder.acm(acm.let(IResolvable::unwrap))
      }

      override fun acm(acm: VirtualGatewayListenerTlsAcmCertificateProperty) {
        cdkBuilder.acm(acm.let(VirtualGatewayListenerTlsAcmCertificateProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("955a2e7dfe97a7d269bf8d0bf307c405bfd93e80de5e9caa5da1a7d3fef06a12")
      override fun acm(acm: VirtualGatewayListenerTlsAcmCertificateProperty.Builder.() -> Unit):
          Unit = acm(VirtualGatewayListenerTlsAcmCertificateProperty(acm))

      override fun `file`(`file`: IResolvable) {
        cdkBuilder.`file`(`file`.let(IResolvable::unwrap))
      }

      override fun `file`(`file`: VirtualGatewayListenerTlsFileCertificateProperty) {
        cdkBuilder.`file`(`file`.let(VirtualGatewayListenerTlsFileCertificateProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a7010dda9b3079e64cbb1104220ae67bcedc7ce4636d07acaf75cf2fe68f6e17")
      override
          fun `file`(`file`: VirtualGatewayListenerTlsFileCertificateProperty.Builder.() -> Unit):
          Unit = `file`(VirtualGatewayListenerTlsFileCertificateProperty(`file`))

      override fun sds(sds: IResolvable) {
        cdkBuilder.sds(sds.let(IResolvable::unwrap))
      }

      override fun sds(sds: VirtualGatewayListenerTlsSdsCertificateProperty) {
        cdkBuilder.sds(sds.let(VirtualGatewayListenerTlsSdsCertificateProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b402b96a37c49380628f6ab0adc6c798705b3149f11690616a0c7a373ba825d4")
      override fun sds(sds: VirtualGatewayListenerTlsSdsCertificateProperty.Builder.() -> Unit):
          Unit = sds(VirtualGatewayListenerTlsSdsCertificateProperty(sds))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsCertificateProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsCertificateProperty,
    ) : VirtualGatewayListenerTlsCertificateProperty {
      override fun acm(): Any? = unwrap(this).getAcm()

      override fun `file`(): Any? = unwrap(this).getFile()

      override fun sds(): Any? = unwrap(this).getSds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          VirtualGatewayListenerTlsCertificateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsCertificateProperty):
          VirtualGatewayListenerTlsCertificateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualGatewayListenerTlsCertificateProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsCertificateProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface VirtualGatewaySpecProperty {
    public fun backendDefaults(): Any? = unwrap(this).getBackendDefaults()

    public fun listeners(): Any

    public fun logging(): Any? = unwrap(this).getLogging()

    public interface Builder {
      public fun backendDefaults(backendDefaults: IResolvable)

      public fun backendDefaults(backendDefaults: VirtualGatewayBackendDefaultsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ee3d22885b2d139341c2aeba121cacb7ebe803c4c40f7a4a8da7c7eadf1c84a")
      public
          fun backendDefaults(backendDefaults: VirtualGatewayBackendDefaultsProperty.Builder.() -> Unit)

      public fun listeners(listeners: IResolvable)

      public fun listeners(listeners: List<Any>)

      public fun logging(logging: IResolvable)

      public fun logging(logging: VirtualGatewayLoggingProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fc43ec4ecdc5774b6458f4680f421067e260b060788cd997e0907a7ebe8c7d39")
      public fun logging(logging: VirtualGatewayLoggingProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewaySpecProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewaySpecProperty.builder()

      override fun backendDefaults(backendDefaults: IResolvable) {
        cdkBuilder.backendDefaults(backendDefaults.let(IResolvable::unwrap))
      }

      override fun backendDefaults(backendDefaults: VirtualGatewayBackendDefaultsProperty) {
        cdkBuilder.backendDefaults(backendDefaults.let(VirtualGatewayBackendDefaultsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ee3d22885b2d139341c2aeba121cacb7ebe803c4c40f7a4a8da7c7eadf1c84a")
      override
          fun backendDefaults(backendDefaults: VirtualGatewayBackendDefaultsProperty.Builder.() -> Unit):
          Unit = backendDefaults(VirtualGatewayBackendDefaultsProperty(backendDefaults))

      override fun listeners(listeners: IResolvable) {
        cdkBuilder.listeners(listeners.let(IResolvable::unwrap))
      }

      override fun listeners(listeners: List<Any>) {
        cdkBuilder.listeners(listeners)
      }

      override fun logging(logging: IResolvable) {
        cdkBuilder.logging(logging.let(IResolvable::unwrap))
      }

      override fun logging(logging: VirtualGatewayLoggingProperty) {
        cdkBuilder.logging(logging.let(VirtualGatewayLoggingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fc43ec4ecdc5774b6458f4680f421067e260b060788cd997e0907a7ebe8c7d39")
      override fun logging(logging: VirtualGatewayLoggingProperty.Builder.() -> Unit): Unit =
          logging(VirtualGatewayLoggingProperty(logging))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewaySpecProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewaySpecProperty,
    ) : VirtualGatewaySpecProperty {
      override fun backendDefaults(): Any? = unwrap(this).getBackendDefaults()

      override fun listeners(): Any = unwrap(this).getListeners()

      override fun logging(): Any? = unwrap(this).getLogging()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VirtualGatewaySpecProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewaySpecProperty):
          VirtualGatewaySpecProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualGatewaySpecProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewaySpecProperty =
          (wrapped as Wrapper).cdkObject
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
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.LoggingFormatProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.LoggingFormatProperty.builder()

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
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.LoggingFormatProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.LoggingFormatProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualGateway.LoggingFormatProperty):
          LoggingFormatProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggingFormatProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.LoggingFormatProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface VirtualGatewayHttpConnectionPoolProperty {
    public fun maxConnections(): Number

    public fun maxPendingRequests(): Number? = unwrap(this).getMaxPendingRequests()

    public interface Builder {
      public fun maxConnections(maxConnections: Number)

      public fun maxPendingRequests(maxPendingRequests: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayHttpConnectionPoolProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayHttpConnectionPoolProperty.builder()

      override fun maxConnections(maxConnections: Number) {
        cdkBuilder.maxConnections(maxConnections)
      }

      override fun maxPendingRequests(maxPendingRequests: Number) {
        cdkBuilder.maxPendingRequests(maxPendingRequests)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayHttpConnectionPoolProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayHttpConnectionPoolProperty,
    ) : VirtualGatewayHttpConnectionPoolProperty {
      override fun maxConnections(): Number = unwrap(this).getMaxConnections()

      override fun maxPendingRequests(): Number? = unwrap(this).getMaxPendingRequests()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          VirtualGatewayHttpConnectionPoolProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayHttpConnectionPoolProperty):
          VirtualGatewayHttpConnectionPoolProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualGatewayHttpConnectionPoolProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayHttpConnectionPoolProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface VirtualGatewayTlsValidationContextTrustProperty {
    public fun acm(): Any? = unwrap(this).getAcm()

    public fun `file`(): Any? = unwrap(this).getFile()

    public fun sds(): Any? = unwrap(this).getSds()

    public interface Builder {
      public fun acm(acm: IResolvable)

      public fun acm(acm: VirtualGatewayTlsValidationContextAcmTrustProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5314e2221182f554e3066ad56d4734be3c0295254df3514e126a70adb977d6ab")
      public fun acm(acm: VirtualGatewayTlsValidationContextAcmTrustProperty.Builder.() -> Unit)

      public fun `file`(`file`: IResolvable)

      public fun `file`(`file`: VirtualGatewayTlsValidationContextFileTrustProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("acca65be2158b86d96fa276a3c6b39ef56598f53394d7c3d311ed0f5c14444f5")
      public
          fun `file`(`file`: VirtualGatewayTlsValidationContextFileTrustProperty.Builder.() -> Unit)

      public fun sds(sds: IResolvable)

      public fun sds(sds: VirtualGatewayTlsValidationContextSdsTrustProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c854926e0fedfde0952e64ef90808f02cabe4f11b6b60801674473fd28c2cfe4")
      public fun sds(sds: VirtualGatewayTlsValidationContextSdsTrustProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextTrustProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextTrustProperty.builder()

      override fun acm(acm: IResolvable) {
        cdkBuilder.acm(acm.let(IResolvable::unwrap))
      }

      override fun acm(acm: VirtualGatewayTlsValidationContextAcmTrustProperty) {
        cdkBuilder.acm(acm.let(VirtualGatewayTlsValidationContextAcmTrustProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5314e2221182f554e3066ad56d4734be3c0295254df3514e126a70adb977d6ab")
      override fun acm(acm: VirtualGatewayTlsValidationContextAcmTrustProperty.Builder.() -> Unit):
          Unit = acm(VirtualGatewayTlsValidationContextAcmTrustProperty(acm))

      override fun `file`(`file`: IResolvable) {
        cdkBuilder.`file`(`file`.let(IResolvable::unwrap))
      }

      override fun `file`(`file`: VirtualGatewayTlsValidationContextFileTrustProperty) {
        cdkBuilder.`file`(`file`.let(VirtualGatewayTlsValidationContextFileTrustProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("acca65be2158b86d96fa276a3c6b39ef56598f53394d7c3d311ed0f5c14444f5")
      override
          fun `file`(`file`: VirtualGatewayTlsValidationContextFileTrustProperty.Builder.() -> Unit):
          Unit = `file`(VirtualGatewayTlsValidationContextFileTrustProperty(`file`))

      override fun sds(sds: IResolvable) {
        cdkBuilder.sds(sds.let(IResolvable::unwrap))
      }

      override fun sds(sds: VirtualGatewayTlsValidationContextSdsTrustProperty) {
        cdkBuilder.sds(sds.let(VirtualGatewayTlsValidationContextSdsTrustProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c854926e0fedfde0952e64ef90808f02cabe4f11b6b60801674473fd28c2cfe4")
      override fun sds(sds: VirtualGatewayTlsValidationContextSdsTrustProperty.Builder.() -> Unit):
          Unit = sds(VirtualGatewayTlsValidationContextSdsTrustProperty(sds))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextTrustProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextTrustProperty,
    ) : VirtualGatewayTlsValidationContextTrustProperty {
      override fun acm(): Any? = unwrap(this).getAcm()

      override fun `file`(): Any? = unwrap(this).getFile()

      override fun sds(): Any? = unwrap(this).getSds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          VirtualGatewayTlsValidationContextTrustProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextTrustProperty):
          VirtualGatewayTlsValidationContextTrustProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualGatewayTlsValidationContextTrustProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextTrustProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface VirtualGatewayTlsValidationContextSdsTrustProperty {
    public fun secretName(): String

    public interface Builder {
      public fun secretName(secretName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextSdsTrustProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextSdsTrustProperty.builder()

      override fun secretName(secretName: String) {
        cdkBuilder.secretName(secretName)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextSdsTrustProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextSdsTrustProperty,
    ) : VirtualGatewayTlsValidationContextSdsTrustProperty {
      override fun secretName(): String = unwrap(this).getSecretName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          VirtualGatewayTlsValidationContextSdsTrustProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextSdsTrustProperty):
          VirtualGatewayTlsValidationContextSdsTrustProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualGatewayTlsValidationContextSdsTrustProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextSdsTrustProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface VirtualGatewayAccessLogProperty {
    public fun `file`(): Any? = unwrap(this).getFile()

    public interface Builder {
      public fun `file`(`file`: IResolvable)

      public fun `file`(`file`: VirtualGatewayFileAccessLogProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f3121bb369a8d15cefa43e3b6240a991fbdfa32882bb1e89c72730747fbbe49")
      public fun `file`(`file`: VirtualGatewayFileAccessLogProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayAccessLogProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayAccessLogProperty.builder()

      override fun `file`(`file`: IResolvable) {
        cdkBuilder.`file`(`file`.let(IResolvable::unwrap))
      }

      override fun `file`(`file`: VirtualGatewayFileAccessLogProperty) {
        cdkBuilder.`file`(`file`.let(VirtualGatewayFileAccessLogProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f3121bb369a8d15cefa43e3b6240a991fbdfa32882bb1e89c72730747fbbe49")
      override fun `file`(`file`: VirtualGatewayFileAccessLogProperty.Builder.() -> Unit): Unit =
          `file`(VirtualGatewayFileAccessLogProperty(`file`))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayAccessLogProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayAccessLogProperty,
    ) : VirtualGatewayAccessLogProperty {
      override fun `file`(): Any? = unwrap(this).getFile()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VirtualGatewayAccessLogProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayAccessLogProperty):
          VirtualGatewayAccessLogProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualGatewayAccessLogProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayAccessLogProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface VirtualGatewayHealthCheckPolicyProperty {
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
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty.builder()

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

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty,
    ) : VirtualGatewayHealthCheckPolicyProperty {
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

      public operator fun invoke(block: Builder.() -> Unit = {}):
          VirtualGatewayHealthCheckPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty):
          VirtualGatewayHealthCheckPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualGatewayHealthCheckPolicyProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface VirtualGatewayBackendDefaultsProperty {
    public fun clientPolicy(): Any? = unwrap(this).getClientPolicy()

    public interface Builder {
      public fun clientPolicy(clientPolicy: IResolvable)

      public fun clientPolicy(clientPolicy: VirtualGatewayClientPolicyProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3a690241443363f80e1ed79e901ce310d93493a7b7f0c7575c6724a892480cf7")
      public fun clientPolicy(clientPolicy: VirtualGatewayClientPolicyProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayBackendDefaultsProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayBackendDefaultsProperty.builder()

      override fun clientPolicy(clientPolicy: IResolvable) {
        cdkBuilder.clientPolicy(clientPolicy.let(IResolvable::unwrap))
      }

      override fun clientPolicy(clientPolicy: VirtualGatewayClientPolicyProperty) {
        cdkBuilder.clientPolicy(clientPolicy.let(VirtualGatewayClientPolicyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3a690241443363f80e1ed79e901ce310d93493a7b7f0c7575c6724a892480cf7")
      override
          fun clientPolicy(clientPolicy: VirtualGatewayClientPolicyProperty.Builder.() -> Unit):
          Unit = clientPolicy(VirtualGatewayClientPolicyProperty(clientPolicy))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayBackendDefaultsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayBackendDefaultsProperty,
    ) : VirtualGatewayBackendDefaultsProperty {
      override fun clientPolicy(): Any? = unwrap(this).getClientPolicy()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          VirtualGatewayBackendDefaultsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayBackendDefaultsProperty):
          VirtualGatewayBackendDefaultsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualGatewayBackendDefaultsProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayBackendDefaultsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface VirtualGatewayListenerTlsValidationContextProperty {
    public fun subjectAlternativeNames(): Any? = unwrap(this).getSubjectAlternativeNames()

    public fun trust(): Any

    public interface Builder {
      public fun subjectAlternativeNames(subjectAlternativeNames: IResolvable)

      public fun subjectAlternativeNames(subjectAlternativeNames: SubjectAlternativeNamesProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d86a964ec948a76a692ee81b044ffab0a1f298dc0cf139e8ff41cea0d5c6e56b")
      public
          fun subjectAlternativeNames(subjectAlternativeNames: SubjectAlternativeNamesProperty.Builder.() -> Unit)

      public fun trust(trust: IResolvable)

      public fun trust(trust: VirtualGatewayListenerTlsValidationContextTrustProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c148b9e3778a689288c963548b5350d16829a1dacc1b95ccc54a944f2dbde3db")
      public
          fun trust(trust: VirtualGatewayListenerTlsValidationContextTrustProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsValidationContextProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsValidationContextProperty.builder()

      override fun subjectAlternativeNames(subjectAlternativeNames: IResolvable) {
        cdkBuilder.subjectAlternativeNames(subjectAlternativeNames.let(IResolvable::unwrap))
      }

      override
          fun subjectAlternativeNames(subjectAlternativeNames: SubjectAlternativeNamesProperty) {
        cdkBuilder.subjectAlternativeNames(subjectAlternativeNames.let(SubjectAlternativeNamesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d86a964ec948a76a692ee81b044ffab0a1f298dc0cf139e8ff41cea0d5c6e56b")
      override
          fun subjectAlternativeNames(subjectAlternativeNames: SubjectAlternativeNamesProperty.Builder.() -> Unit):
          Unit = subjectAlternativeNames(SubjectAlternativeNamesProperty(subjectAlternativeNames))

      override fun trust(trust: IResolvable) {
        cdkBuilder.trust(trust.let(IResolvable::unwrap))
      }

      override fun trust(trust: VirtualGatewayListenerTlsValidationContextTrustProperty) {
        cdkBuilder.trust(trust.let(VirtualGatewayListenerTlsValidationContextTrustProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c148b9e3778a689288c963548b5350d16829a1dacc1b95ccc54a944f2dbde3db")
      override
          fun trust(trust: VirtualGatewayListenerTlsValidationContextTrustProperty.Builder.() -> Unit):
          Unit = trust(VirtualGatewayListenerTlsValidationContextTrustProperty(trust))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsValidationContextProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsValidationContextProperty,
    ) : VirtualGatewayListenerTlsValidationContextProperty {
      override fun subjectAlternativeNames(): Any? = unwrap(this).getSubjectAlternativeNames()

      override fun trust(): Any = unwrap(this).getTrust()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          VirtualGatewayListenerTlsValidationContextProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsValidationContextProperty):
          VirtualGatewayListenerTlsValidationContextProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualGatewayListenerTlsValidationContextProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsValidationContextProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface VirtualGatewayFileAccessLogProperty {
    public fun format(): Any? = unwrap(this).getFormat()

    public fun path(): String

    public interface Builder {
      public fun format(format: IResolvable)

      public fun format(format: LoggingFormatProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f0af80698308ec03c64f1fe49c0b1bf8419e8c41c1f1ca3588c2e5ef6b79f803")
      public fun format(format: LoggingFormatProperty.Builder.() -> Unit)

      public fun path(path: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayFileAccessLogProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayFileAccessLogProperty.builder()

      override fun format(format: IResolvable) {
        cdkBuilder.format(format.let(IResolvable::unwrap))
      }

      override fun format(format: LoggingFormatProperty) {
        cdkBuilder.format(format.let(LoggingFormatProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f0af80698308ec03c64f1fe49c0b1bf8419e8c41c1f1ca3588c2e5ef6b79f803")
      override fun format(format: LoggingFormatProperty.Builder.() -> Unit): Unit =
          format(LoggingFormatProperty(format))

      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayFileAccessLogProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayFileAccessLogProperty,
    ) : VirtualGatewayFileAccessLogProperty {
      override fun format(): Any? = unwrap(this).getFormat()

      override fun path(): String = unwrap(this).getPath()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          VirtualGatewayFileAccessLogProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayFileAccessLogProperty):
          VirtualGatewayFileAccessLogProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualGatewayFileAccessLogProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayFileAccessLogProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface VirtualGatewayListenerProperty {
    public fun connectionPool(): Any? = unwrap(this).getConnectionPool()

    public fun healthCheck(): Any? = unwrap(this).getHealthCheck()

    public fun portMapping(): Any

    public fun tls(): Any? = unwrap(this).getTls()

    public interface Builder {
      public fun connectionPool(connectionPool: IResolvable)

      public fun connectionPool(connectionPool: VirtualGatewayConnectionPoolProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c5cada049a248eeb43391db32e3ebef2974b4bea2bbca850ab09fd507f39aa1d")
      public
          fun connectionPool(connectionPool: VirtualGatewayConnectionPoolProperty.Builder.() -> Unit)

      public fun healthCheck(healthCheck: IResolvable)

      public fun healthCheck(healthCheck: VirtualGatewayHealthCheckPolicyProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3b2c7143fe6682175577fe24f6600fd4ed58d4b409e5ae64d20cb47851922c6a")
      public
          fun healthCheck(healthCheck: VirtualGatewayHealthCheckPolicyProperty.Builder.() -> Unit)

      public fun portMapping(portMapping: IResolvable)

      public fun portMapping(portMapping: VirtualGatewayPortMappingProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("657e1415a121679f54184b01da35c8125c99f3fe79fe4c2ca31228f05c022c2f")
      public fun portMapping(portMapping: VirtualGatewayPortMappingProperty.Builder.() -> Unit)

      public fun tls(tls: IResolvable)

      public fun tls(tls: VirtualGatewayListenerTlsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d474295a8d3ce631a448df4daacc876d7efbbc32b6a303fcdf045c661c58ad0b")
      public fun tls(tls: VirtualGatewayListenerTlsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerProperty.builder()

      override fun connectionPool(connectionPool: IResolvable) {
        cdkBuilder.connectionPool(connectionPool.let(IResolvable::unwrap))
      }

      override fun connectionPool(connectionPool: VirtualGatewayConnectionPoolProperty) {
        cdkBuilder.connectionPool(connectionPool.let(VirtualGatewayConnectionPoolProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c5cada049a248eeb43391db32e3ebef2974b4bea2bbca850ab09fd507f39aa1d")
      override
          fun connectionPool(connectionPool: VirtualGatewayConnectionPoolProperty.Builder.() -> Unit):
          Unit = connectionPool(VirtualGatewayConnectionPoolProperty(connectionPool))

      override fun healthCheck(healthCheck: IResolvable) {
        cdkBuilder.healthCheck(healthCheck.let(IResolvable::unwrap))
      }

      override fun healthCheck(healthCheck: VirtualGatewayHealthCheckPolicyProperty) {
        cdkBuilder.healthCheck(healthCheck.let(VirtualGatewayHealthCheckPolicyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3b2c7143fe6682175577fe24f6600fd4ed58d4b409e5ae64d20cb47851922c6a")
      override
          fun healthCheck(healthCheck: VirtualGatewayHealthCheckPolicyProperty.Builder.() -> Unit):
          Unit = healthCheck(VirtualGatewayHealthCheckPolicyProperty(healthCheck))

      override fun portMapping(portMapping: IResolvable) {
        cdkBuilder.portMapping(portMapping.let(IResolvable::unwrap))
      }

      override fun portMapping(portMapping: VirtualGatewayPortMappingProperty) {
        cdkBuilder.portMapping(portMapping.let(VirtualGatewayPortMappingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("657e1415a121679f54184b01da35c8125c99f3fe79fe4c2ca31228f05c022c2f")
      override fun portMapping(portMapping: VirtualGatewayPortMappingProperty.Builder.() -> Unit):
          Unit = portMapping(VirtualGatewayPortMappingProperty(portMapping))

      override fun tls(tls: IResolvable) {
        cdkBuilder.tls(tls.let(IResolvable::unwrap))
      }

      override fun tls(tls: VirtualGatewayListenerTlsProperty) {
        cdkBuilder.tls(tls.let(VirtualGatewayListenerTlsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d474295a8d3ce631a448df4daacc876d7efbbc32b6a303fcdf045c661c58ad0b")
      override fun tls(tls: VirtualGatewayListenerTlsProperty.Builder.() -> Unit): Unit =
          tls(VirtualGatewayListenerTlsProperty(tls))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerProperty,
    ) : VirtualGatewayListenerProperty {
      override fun connectionPool(): Any? = unwrap(this).getConnectionPool()

      override fun healthCheck(): Any? = unwrap(this).getHealthCheck()

      override fun portMapping(): Any = unwrap(this).getPortMapping()

      override fun tls(): Any? = unwrap(this).getTls()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VirtualGatewayListenerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerProperty):
          VirtualGatewayListenerProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualGatewayListenerProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface VirtualGatewayListenerTlsSdsCertificateProperty {
    public fun secretName(): String

    public interface Builder {
      public fun secretName(secretName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsSdsCertificateProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsSdsCertificateProperty.builder()

      override fun secretName(secretName: String) {
        cdkBuilder.secretName(secretName)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsSdsCertificateProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsSdsCertificateProperty,
    ) : VirtualGatewayListenerTlsSdsCertificateProperty {
      override fun secretName(): String = unwrap(this).getSecretName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          VirtualGatewayListenerTlsSdsCertificateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsSdsCertificateProperty):
          VirtualGatewayListenerTlsSdsCertificateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualGatewayListenerTlsSdsCertificateProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsSdsCertificateProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface VirtualGatewayTlsValidationContextAcmTrustProperty {
    public fun certificateAuthorityArns(): List<String>

    public interface Builder {
      public fun certificateAuthorityArns(certificateAuthorityArns: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextAcmTrustProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextAcmTrustProperty.builder()

      override fun certificateAuthorityArns(certificateAuthorityArns: List<String>) {
        cdkBuilder.certificateAuthorityArns(certificateAuthorityArns)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextAcmTrustProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextAcmTrustProperty,
    ) : VirtualGatewayTlsValidationContextAcmTrustProperty {
      override fun certificateAuthorityArns(): List<String> =
          unwrap(this).getCertificateAuthorityArns() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          VirtualGatewayTlsValidationContextAcmTrustProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextAcmTrustProperty):
          VirtualGatewayTlsValidationContextAcmTrustProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualGatewayTlsValidationContextAcmTrustProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextAcmTrustProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface VirtualGatewayPortMappingProperty {
    public fun port(): Number

    public fun protocol(): String

    public interface Builder {
      public fun port(port: Number)

      public fun protocol(protocol: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayPortMappingProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayPortMappingProperty.builder()

      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayPortMappingProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayPortMappingProperty,
    ) : VirtualGatewayPortMappingProperty {
      override fun port(): Number = unwrap(this).getPort()

      override fun protocol(): String = unwrap(this).getProtocol()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          VirtualGatewayPortMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayPortMappingProperty):
          VirtualGatewayPortMappingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualGatewayPortMappingProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayPortMappingProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface VirtualGatewayGrpcConnectionPoolProperty {
    public fun maxRequests(): Number

    public interface Builder {
      public fun maxRequests(maxRequests: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayGrpcConnectionPoolProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayGrpcConnectionPoolProperty.builder()

      override fun maxRequests(maxRequests: Number) {
        cdkBuilder.maxRequests(maxRequests)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayGrpcConnectionPoolProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayGrpcConnectionPoolProperty,
    ) : VirtualGatewayGrpcConnectionPoolProperty {
      override fun maxRequests(): Number = unwrap(this).getMaxRequests()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          VirtualGatewayGrpcConnectionPoolProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayGrpcConnectionPoolProperty):
          VirtualGatewayGrpcConnectionPoolProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualGatewayGrpcConnectionPoolProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayGrpcConnectionPoolProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface VirtualGatewayClientPolicyTlsProperty {
    public fun certificate(): Any? = unwrap(this).getCertificate()

    public fun enforce(): Any? = unwrap(this).getEnforce()

    public fun ports(): Any? = unwrap(this).getPorts()

    public fun validation(): Any

    public interface Builder {
      public fun certificate(certificate: IResolvable)

      public fun certificate(certificate: VirtualGatewayClientTlsCertificateProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9d120604ee5d384b9e8738c9093a173c24626571e32d3c7dc3b55eb74631d86e")
      public
          fun certificate(certificate: VirtualGatewayClientTlsCertificateProperty.Builder.() -> Unit)

      public fun enforce(enforce: Boolean)

      public fun enforce(enforce: IResolvable)

      public fun ports(ports: IResolvable)

      public fun ports(ports: List<Number>)

      public fun validation(validation: IResolvable)

      public fun validation(validation: VirtualGatewayTlsValidationContextProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1eb2e0a02d82d061ee3111c6eb4c399e8eae838b0aef535fa010973ed97daacc")
      public
          fun validation(validation: VirtualGatewayTlsValidationContextProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayClientPolicyTlsProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayClientPolicyTlsProperty.builder()

      override fun certificate(certificate: IResolvable) {
        cdkBuilder.certificate(certificate.let(IResolvable::unwrap))
      }

      override fun certificate(certificate: VirtualGatewayClientTlsCertificateProperty) {
        cdkBuilder.certificate(certificate.let(VirtualGatewayClientTlsCertificateProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9d120604ee5d384b9e8738c9093a173c24626571e32d3c7dc3b55eb74631d86e")
      override
          fun certificate(certificate: VirtualGatewayClientTlsCertificateProperty.Builder.() -> Unit):
          Unit = certificate(VirtualGatewayClientTlsCertificateProperty(certificate))

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

      override fun validation(validation: VirtualGatewayTlsValidationContextProperty) {
        cdkBuilder.validation(validation.let(VirtualGatewayTlsValidationContextProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1eb2e0a02d82d061ee3111c6eb4c399e8eae838b0aef535fa010973ed97daacc")
      override
          fun validation(validation: VirtualGatewayTlsValidationContextProperty.Builder.() -> Unit):
          Unit = validation(VirtualGatewayTlsValidationContextProperty(validation))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayClientPolicyTlsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayClientPolicyTlsProperty,
    ) : VirtualGatewayClientPolicyTlsProperty {
      override fun certificate(): Any? = unwrap(this).getCertificate()

      override fun enforce(): Any? = unwrap(this).getEnforce()

      override fun ports(): Any? = unwrap(this).getPorts()

      override fun validation(): Any = unwrap(this).getValidation()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          VirtualGatewayClientPolicyTlsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayClientPolicyTlsProperty):
          VirtualGatewayClientPolicyTlsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualGatewayClientPolicyTlsProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayClientPolicyTlsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface VirtualGatewayLoggingProperty {
    public fun accessLog(): Any? = unwrap(this).getAccessLog()

    public interface Builder {
      public fun accessLog(accessLog: IResolvable)

      public fun accessLog(accessLog: VirtualGatewayAccessLogProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d556fd726fd3953f33b7516a900555f84c031a98b200a68c6567b23bcc5e8a2b")
      public fun accessLog(accessLog: VirtualGatewayAccessLogProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayLoggingProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayLoggingProperty.builder()

      override fun accessLog(accessLog: IResolvable) {
        cdkBuilder.accessLog(accessLog.let(IResolvable::unwrap))
      }

      override fun accessLog(accessLog: VirtualGatewayAccessLogProperty) {
        cdkBuilder.accessLog(accessLog.let(VirtualGatewayAccessLogProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d556fd726fd3953f33b7516a900555f84c031a98b200a68c6567b23bcc5e8a2b")
      override fun accessLog(accessLog: VirtualGatewayAccessLogProperty.Builder.() -> Unit): Unit =
          accessLog(VirtualGatewayAccessLogProperty(accessLog))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayLoggingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayLoggingProperty,
    ) : VirtualGatewayLoggingProperty {
      override fun accessLog(): Any? = unwrap(this).getAccessLog()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VirtualGatewayLoggingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayLoggingProperty):
          VirtualGatewayLoggingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualGatewayLoggingProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayLoggingProperty =
          (wrapped as Wrapper).cdkObject
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
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.JsonFormatRefProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.JsonFormatRefProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.JsonFormatRefProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.JsonFormatRefProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualGateway.JsonFormatRefProperty):
          JsonFormatRefProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JsonFormatRefProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.JsonFormatRefProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface VirtualGatewayHttp2ConnectionPoolProperty {
    public fun maxRequests(): Number

    public interface Builder {
      public fun maxRequests(maxRequests: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayHttp2ConnectionPoolProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayHttp2ConnectionPoolProperty.builder()

      override fun maxRequests(maxRequests: Number) {
        cdkBuilder.maxRequests(maxRequests)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayHttp2ConnectionPoolProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayHttp2ConnectionPoolProperty,
    ) : VirtualGatewayHttp2ConnectionPoolProperty {
      override fun maxRequests(): Number = unwrap(this).getMaxRequests()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          VirtualGatewayHttp2ConnectionPoolProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayHttp2ConnectionPoolProperty):
          VirtualGatewayHttp2ConnectionPoolProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualGatewayHttp2ConnectionPoolProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayHttp2ConnectionPoolProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface VirtualGatewayClientPolicyProperty {
    public fun tls(): Any? = unwrap(this).getTls()

    public interface Builder {
      public fun tls(tls: IResolvable)

      public fun tls(tls: VirtualGatewayClientPolicyTlsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a90df689980811315d993811a1c8a499a4caddedf7d36096cf2b83ab791594d2")
      public fun tls(tls: VirtualGatewayClientPolicyTlsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayClientPolicyProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayClientPolicyProperty.builder()

      override fun tls(tls: IResolvable) {
        cdkBuilder.tls(tls.let(IResolvable::unwrap))
      }

      override fun tls(tls: VirtualGatewayClientPolicyTlsProperty) {
        cdkBuilder.tls(tls.let(VirtualGatewayClientPolicyTlsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a90df689980811315d993811a1c8a499a4caddedf7d36096cf2b83ab791594d2")
      override fun tls(tls: VirtualGatewayClientPolicyTlsProperty.Builder.() -> Unit): Unit =
          tls(VirtualGatewayClientPolicyTlsProperty(tls))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayClientPolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayClientPolicyProperty,
    ) : VirtualGatewayClientPolicyProperty {
      override fun tls(): Any? = unwrap(this).getTls()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          VirtualGatewayClientPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayClientPolicyProperty):
          VirtualGatewayClientPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualGatewayClientPolicyProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayClientPolicyProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SubjectAlternativeNameMatchersProperty {
    public fun exact(): List<String> = unwrap(this).getExact() ?: emptyList()

    public interface Builder {
      public fun exact(exact: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.SubjectAlternativeNameMatchersProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.SubjectAlternativeNameMatchersProperty.builder()

      override fun exact(exact: List<String>) {
        cdkBuilder.exact(exact)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.SubjectAlternativeNameMatchersProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.SubjectAlternativeNameMatchersProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualGateway.SubjectAlternativeNameMatchersProperty):
          SubjectAlternativeNameMatchersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SubjectAlternativeNameMatchersProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.SubjectAlternativeNameMatchersProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface VirtualGatewayConnectionPoolProperty {
    public fun grpc(): Any? = unwrap(this).getGrpc()

    public fun http(): Any? = unwrap(this).getHttp()

    public fun http2(): Any? = unwrap(this).getHttp2()

    public interface Builder {
      public fun grpc(grpc: IResolvable)

      public fun grpc(grpc: VirtualGatewayGrpcConnectionPoolProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a25f48a5ee10f30339abbee65b6c6e07b9f1f003e8da5e78cb6c4c6d327a91b5")
      public fun grpc(grpc: VirtualGatewayGrpcConnectionPoolProperty.Builder.() -> Unit)

      public fun http(http: IResolvable)

      public fun http(http: VirtualGatewayHttpConnectionPoolProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5c70cd067c2e83ae385dfcd845e6cb49427e9df5d911a20d6365bad3f5341667")
      public fun http(http: VirtualGatewayHttpConnectionPoolProperty.Builder.() -> Unit)

      public fun http2(http2: IResolvable)

      public fun http2(http2: VirtualGatewayHttp2ConnectionPoolProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f65d3e5bc347b419e2c7219eb4760135c7cee1a447515c55cf6d2fec7e51724d")
      public fun http2(http2: VirtualGatewayHttp2ConnectionPoolProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayConnectionPoolProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayConnectionPoolProperty.builder()

      override fun grpc(grpc: IResolvable) {
        cdkBuilder.grpc(grpc.let(IResolvable::unwrap))
      }

      override fun grpc(grpc: VirtualGatewayGrpcConnectionPoolProperty) {
        cdkBuilder.grpc(grpc.let(VirtualGatewayGrpcConnectionPoolProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a25f48a5ee10f30339abbee65b6c6e07b9f1f003e8da5e78cb6c4c6d327a91b5")
      override fun grpc(grpc: VirtualGatewayGrpcConnectionPoolProperty.Builder.() -> Unit): Unit =
          grpc(VirtualGatewayGrpcConnectionPoolProperty(grpc))

      override fun http(http: IResolvable) {
        cdkBuilder.http(http.let(IResolvable::unwrap))
      }

      override fun http(http: VirtualGatewayHttpConnectionPoolProperty) {
        cdkBuilder.http(http.let(VirtualGatewayHttpConnectionPoolProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5c70cd067c2e83ae385dfcd845e6cb49427e9df5d911a20d6365bad3f5341667")
      override fun http(http: VirtualGatewayHttpConnectionPoolProperty.Builder.() -> Unit): Unit =
          http(VirtualGatewayHttpConnectionPoolProperty(http))

      override fun http2(http2: IResolvable) {
        cdkBuilder.http2(http2.let(IResolvable::unwrap))
      }

      override fun http2(http2: VirtualGatewayHttp2ConnectionPoolProperty) {
        cdkBuilder.http2(http2.let(VirtualGatewayHttp2ConnectionPoolProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f65d3e5bc347b419e2c7219eb4760135c7cee1a447515c55cf6d2fec7e51724d")
      override fun http2(http2: VirtualGatewayHttp2ConnectionPoolProperty.Builder.() -> Unit): Unit
          = http2(VirtualGatewayHttp2ConnectionPoolProperty(http2))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayConnectionPoolProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayConnectionPoolProperty,
    ) : VirtualGatewayConnectionPoolProperty {
      override fun grpc(): Any? = unwrap(this).getGrpc()

      override fun http(): Any? = unwrap(this).getHttp()

      override fun http2(): Any? = unwrap(this).getHttp2()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          VirtualGatewayConnectionPoolProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayConnectionPoolProperty):
          VirtualGatewayConnectionPoolProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualGatewayConnectionPoolProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayConnectionPoolProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface VirtualGatewayTlsValidationContextFileTrustProperty {
    public fun certificateChain(): String

    public interface Builder {
      public fun certificateChain(certificateChain: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextFileTrustProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextFileTrustProperty.builder()

      override fun certificateChain(certificateChain: String) {
        cdkBuilder.certificateChain(certificateChain)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextFileTrustProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextFileTrustProperty,
    ) : VirtualGatewayTlsValidationContextFileTrustProperty {
      override fun certificateChain(): String = unwrap(this).getCertificateChain()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          VirtualGatewayTlsValidationContextFileTrustProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextFileTrustProperty):
          VirtualGatewayTlsValidationContextFileTrustProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualGatewayTlsValidationContextFileTrustProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextFileTrustProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface VirtualGatewayListenerTlsValidationContextTrustProperty {
    public fun `file`(): Any? = unwrap(this).getFile()

    public fun sds(): Any? = unwrap(this).getSds()

    public interface Builder {
      public fun `file`(`file`: IResolvable)

      public fun `file`(`file`: VirtualGatewayTlsValidationContextFileTrustProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b4de2ecb488740d08277bc1fa4e871749734532dcb1227e56489e327a130b12a")
      public
          fun `file`(`file`: VirtualGatewayTlsValidationContextFileTrustProperty.Builder.() -> Unit)

      public fun sds(sds: IResolvable)

      public fun sds(sds: VirtualGatewayTlsValidationContextSdsTrustProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4f1cfe943aebbb2e614f42b76e13c96552308637e185c7db165b6bb01900f2a4")
      public fun sds(sds: VirtualGatewayTlsValidationContextSdsTrustProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsValidationContextTrustProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsValidationContextTrustProperty.builder()

      override fun `file`(`file`: IResolvable) {
        cdkBuilder.`file`(`file`.let(IResolvable::unwrap))
      }

      override fun `file`(`file`: VirtualGatewayTlsValidationContextFileTrustProperty) {
        cdkBuilder.`file`(`file`.let(VirtualGatewayTlsValidationContextFileTrustProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b4de2ecb488740d08277bc1fa4e871749734532dcb1227e56489e327a130b12a")
      override
          fun `file`(`file`: VirtualGatewayTlsValidationContextFileTrustProperty.Builder.() -> Unit):
          Unit = `file`(VirtualGatewayTlsValidationContextFileTrustProperty(`file`))

      override fun sds(sds: IResolvable) {
        cdkBuilder.sds(sds.let(IResolvable::unwrap))
      }

      override fun sds(sds: VirtualGatewayTlsValidationContextSdsTrustProperty) {
        cdkBuilder.sds(sds.let(VirtualGatewayTlsValidationContextSdsTrustProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4f1cfe943aebbb2e614f42b76e13c96552308637e185c7db165b6bb01900f2a4")
      override fun sds(sds: VirtualGatewayTlsValidationContextSdsTrustProperty.Builder.() -> Unit):
          Unit = sds(VirtualGatewayTlsValidationContextSdsTrustProperty(sds))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsValidationContextTrustProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsValidationContextTrustProperty,
    ) : VirtualGatewayListenerTlsValidationContextTrustProperty {
      override fun `file`(): Any? = unwrap(this).getFile()

      override fun sds(): Any? = unwrap(this).getSds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          VirtualGatewayListenerTlsValidationContextTrustProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsValidationContextTrustProperty):
          VirtualGatewayListenerTlsValidationContextTrustProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualGatewayListenerTlsValidationContextTrustProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsValidationContextTrustProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SubjectAlternativeNamesProperty {
    public fun match(): Any

    public interface Builder {
      public fun match(match: IResolvable)

      public fun match(match: SubjectAlternativeNameMatchersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e2c5ca1739420154623a0d64dc8ce13e81856585fdf6194b0f04e7299c9efc05")
      public fun match(match: SubjectAlternativeNameMatchersProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.SubjectAlternativeNamesProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.SubjectAlternativeNamesProperty.builder()

      override fun match(match: IResolvable) {
        cdkBuilder.match(match.let(IResolvable::unwrap))
      }

      override fun match(match: SubjectAlternativeNameMatchersProperty) {
        cdkBuilder.match(match.let(SubjectAlternativeNameMatchersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e2c5ca1739420154623a0d64dc8ce13e81856585fdf6194b0f04e7299c9efc05")
      override fun match(match: SubjectAlternativeNameMatchersProperty.Builder.() -> Unit): Unit =
          match(SubjectAlternativeNameMatchersProperty(match))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.SubjectAlternativeNamesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.SubjectAlternativeNamesProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualGateway.SubjectAlternativeNamesProperty):
          SubjectAlternativeNamesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SubjectAlternativeNamesProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.SubjectAlternativeNamesProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface VirtualGatewayListenerTlsProperty {
    public fun certificate(): Any

    public fun mode(): String

    public fun validation(): Any? = unwrap(this).getValidation()

    public interface Builder {
      public fun certificate(certificate: IResolvable)

      public fun certificate(certificate: VirtualGatewayListenerTlsCertificateProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f22287334a0f1622f27c197f3d7fc9f6db3366876f9d04e39a24753b4a9c965c")
      public
          fun certificate(certificate: VirtualGatewayListenerTlsCertificateProperty.Builder.() -> Unit)

      public fun mode(mode: String)

      public fun validation(validation: IResolvable)

      public fun validation(validation: VirtualGatewayListenerTlsValidationContextProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("49804e56c344e5028b80553eeac2c64d3adb322daa597e1e029053463ab8bef4")
      public
          fun validation(validation: VirtualGatewayListenerTlsValidationContextProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsProperty.builder()

      override fun certificate(certificate: IResolvable) {
        cdkBuilder.certificate(certificate.let(IResolvable::unwrap))
      }

      override fun certificate(certificate: VirtualGatewayListenerTlsCertificateProperty) {
        cdkBuilder.certificate(certificate.let(VirtualGatewayListenerTlsCertificateProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f22287334a0f1622f27c197f3d7fc9f6db3366876f9d04e39a24753b4a9c965c")
      override
          fun certificate(certificate: VirtualGatewayListenerTlsCertificateProperty.Builder.() -> Unit):
          Unit = certificate(VirtualGatewayListenerTlsCertificateProperty(certificate))

      override fun mode(mode: String) {
        cdkBuilder.mode(mode)
      }

      override fun validation(validation: IResolvable) {
        cdkBuilder.validation(validation.let(IResolvable::unwrap))
      }

      override fun validation(validation: VirtualGatewayListenerTlsValidationContextProperty) {
        cdkBuilder.validation(validation.let(VirtualGatewayListenerTlsValidationContextProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("49804e56c344e5028b80553eeac2c64d3adb322daa597e1e029053463ab8bef4")
      override
          fun validation(validation: VirtualGatewayListenerTlsValidationContextProperty.Builder.() -> Unit):
          Unit = validation(VirtualGatewayListenerTlsValidationContextProperty(validation))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsProperty,
    ) : VirtualGatewayListenerTlsProperty {
      override fun certificate(): Any = unwrap(this).getCertificate()

      override fun mode(): String = unwrap(this).getMode()

      override fun validation(): Any? = unwrap(this).getValidation()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          VirtualGatewayListenerTlsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsProperty):
          VirtualGatewayListenerTlsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualGatewayListenerTlsProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface VirtualGatewayClientTlsCertificateProperty {
    public fun `file`(): Any? = unwrap(this).getFile()

    public fun sds(): Any? = unwrap(this).getSds()

    public interface Builder {
      public fun `file`(`file`: IResolvable)

      public fun `file`(`file`: VirtualGatewayListenerTlsFileCertificateProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5ca69fac264b48ac447be901cf3db1123d068a277af2769cd36232d3b1f2cf70")
      public fun `file`(`file`: VirtualGatewayListenerTlsFileCertificateProperty.Builder.() -> Unit)

      public fun sds(sds: IResolvable)

      public fun sds(sds: VirtualGatewayListenerTlsSdsCertificateProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("003675a5f0d1468a62b543a888053eef80c314e2965bdebad6ba4731b1e844fa")
      public fun sds(sds: VirtualGatewayListenerTlsSdsCertificateProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayClientTlsCertificateProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayClientTlsCertificateProperty.builder()

      override fun `file`(`file`: IResolvable) {
        cdkBuilder.`file`(`file`.let(IResolvable::unwrap))
      }

      override fun `file`(`file`: VirtualGatewayListenerTlsFileCertificateProperty) {
        cdkBuilder.`file`(`file`.let(VirtualGatewayListenerTlsFileCertificateProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5ca69fac264b48ac447be901cf3db1123d068a277af2769cd36232d3b1f2cf70")
      override
          fun `file`(`file`: VirtualGatewayListenerTlsFileCertificateProperty.Builder.() -> Unit):
          Unit = `file`(VirtualGatewayListenerTlsFileCertificateProperty(`file`))

      override fun sds(sds: IResolvable) {
        cdkBuilder.sds(sds.let(IResolvable::unwrap))
      }

      override fun sds(sds: VirtualGatewayListenerTlsSdsCertificateProperty) {
        cdkBuilder.sds(sds.let(VirtualGatewayListenerTlsSdsCertificateProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("003675a5f0d1468a62b543a888053eef80c314e2965bdebad6ba4731b1e844fa")
      override fun sds(sds: VirtualGatewayListenerTlsSdsCertificateProperty.Builder.() -> Unit):
          Unit = sds(VirtualGatewayListenerTlsSdsCertificateProperty(sds))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayClientTlsCertificateProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayClientTlsCertificateProperty,
    ) : VirtualGatewayClientTlsCertificateProperty {
      override fun `file`(): Any? = unwrap(this).getFile()

      override fun sds(): Any? = unwrap(this).getSds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          VirtualGatewayClientTlsCertificateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayClientTlsCertificateProperty):
          VirtualGatewayClientTlsCertificateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualGatewayClientTlsCertificateProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayClientTlsCertificateProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface VirtualGatewayTlsValidationContextProperty {
    public fun subjectAlternativeNames(): Any? = unwrap(this).getSubjectAlternativeNames()

    public fun trust(): Any

    public interface Builder {
      public fun subjectAlternativeNames(subjectAlternativeNames: IResolvable)

      public fun subjectAlternativeNames(subjectAlternativeNames: SubjectAlternativeNamesProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("edaf23f43617162815f82a930a2a301f6c99b891800fb28eaa8887babfe2ccba")
      public
          fun subjectAlternativeNames(subjectAlternativeNames: SubjectAlternativeNamesProperty.Builder.() -> Unit)

      public fun trust(trust: IResolvable)

      public fun trust(trust: VirtualGatewayTlsValidationContextTrustProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cbcc999aee919483ce3fa632feef20067653951c342ca9eff59c026f4655f5dc")
      public fun trust(trust: VirtualGatewayTlsValidationContextTrustProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextProperty.builder()

      override fun subjectAlternativeNames(subjectAlternativeNames: IResolvable) {
        cdkBuilder.subjectAlternativeNames(subjectAlternativeNames.let(IResolvable::unwrap))
      }

      override
          fun subjectAlternativeNames(subjectAlternativeNames: SubjectAlternativeNamesProperty) {
        cdkBuilder.subjectAlternativeNames(subjectAlternativeNames.let(SubjectAlternativeNamesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("edaf23f43617162815f82a930a2a301f6c99b891800fb28eaa8887babfe2ccba")
      override
          fun subjectAlternativeNames(subjectAlternativeNames: SubjectAlternativeNamesProperty.Builder.() -> Unit):
          Unit = subjectAlternativeNames(SubjectAlternativeNamesProperty(subjectAlternativeNames))

      override fun trust(trust: IResolvable) {
        cdkBuilder.trust(trust.let(IResolvable::unwrap))
      }

      override fun trust(trust: VirtualGatewayTlsValidationContextTrustProperty) {
        cdkBuilder.trust(trust.let(VirtualGatewayTlsValidationContextTrustProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cbcc999aee919483ce3fa632feef20067653951c342ca9eff59c026f4655f5dc")
      override fun trust(trust: VirtualGatewayTlsValidationContextTrustProperty.Builder.() -> Unit):
          Unit = trust(VirtualGatewayTlsValidationContextTrustProperty(trust))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextProperty,
    ) : VirtualGatewayTlsValidationContextProperty {
      override fun subjectAlternativeNames(): Any? = unwrap(this).getSubjectAlternativeNames()

      override fun trust(): Any = unwrap(this).getTrust()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          VirtualGatewayTlsValidationContextProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextProperty):
          VirtualGatewayTlsValidationContextProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualGatewayTlsValidationContextProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface VirtualGatewayListenerTlsAcmCertificateProperty {
    public fun certificateArn(): String

    public interface Builder {
      public fun certificateArn(certificateArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsAcmCertificateProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsAcmCertificateProperty.builder()

      override fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsAcmCertificateProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsAcmCertificateProperty,
    ) : VirtualGatewayListenerTlsAcmCertificateProperty {
      override fun certificateArn(): String = unwrap(this).getCertificateArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          VirtualGatewayListenerTlsAcmCertificateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsAcmCertificateProperty):
          VirtualGatewayListenerTlsAcmCertificateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualGatewayListenerTlsAcmCertificateProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsAcmCertificateProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface VirtualGatewayListenerTlsFileCertificateProperty {
    public fun certificateChain(): String

    public fun privateKey(): String

    public interface Builder {
      public fun certificateChain(certificateChain: String)

      public fun privateKey(privateKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsFileCertificateProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsFileCertificateProperty.builder()

      override fun certificateChain(certificateChain: String) {
        cdkBuilder.certificateChain(certificateChain)
      }

      override fun privateKey(privateKey: String) {
        cdkBuilder.privateKey(privateKey)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsFileCertificateProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsFileCertificateProperty,
    ) : VirtualGatewayListenerTlsFileCertificateProperty {
      override fun certificateChain(): String = unwrap(this).getCertificateChain()

      override fun privateKey(): String = unwrap(this).getPrivateKey()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          VirtualGatewayListenerTlsFileCertificateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsFileCertificateProperty):
          VirtualGatewayListenerTlsFileCertificateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualGatewayListenerTlsFileCertificateProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsFileCertificateProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
