package io.cloudshiftdev.awscdk.services.amplify

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDomain internal constructor(
  private val cdkObject: software.amazon.awscdk.services.amplify.CfnDomain,
) : CfnResource(cdkObject), IInspectable {
  public open fun appId(): String = unwrap(this).getAppId()

  public open fun appId(`value`: String) {
    unwrap(this).setAppId(`value`)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrAutoSubDomainCreationPatterns(): List<String> =
      unwrap(this).getAttrAutoSubDomainCreationPatterns()

  public open fun attrAutoSubDomainIamRole(): String = unwrap(this).getAttrAutoSubDomainIamRole()

  public open fun attrCertificateRecord(): String = unwrap(this).getAttrCertificateRecord()

  public open fun attrDomainName(): String = unwrap(this).getAttrDomainName()

  public open fun attrDomainStatus(): String = unwrap(this).getAttrDomainStatus()

  public open fun attrEnableAutoSubDomain(): IResolvable =
      unwrap(this).getAttrEnableAutoSubDomain().let(IResolvable::wrap)

  public open fun attrStatusReason(): String = unwrap(this).getAttrStatusReason()

  public open fun autoSubDomainCreationPatterns(): List<String> =
      unwrap(this).getAutoSubDomainCreationPatterns() ?: emptyList()

  public open fun autoSubDomainCreationPatterns(`value`: List<String>) {
    unwrap(this).setAutoSubDomainCreationPatterns(`value`)
  }

  public open fun autoSubDomainCreationPatterns(vararg `value`: String): Unit =
      autoSubDomainCreationPatterns(`value`.toList())

  public open fun autoSubDomainIamRole(): String? = unwrap(this).getAutoSubDomainIamRole()

  public open fun autoSubDomainIamRole(`value`: String) {
    unwrap(this).setAutoSubDomainIamRole(`value`)
  }

  public open fun certificate(): Any? = unwrap(this).getCertificate()

  public open fun certificate(`value`: IResolvable) {
    unwrap(this).setCertificate(`value`.let(IResolvable::unwrap))
  }

  public open fun certificate(`value`: CertificateProperty) {
    unwrap(this).setCertificate(`value`.let(CertificateProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a6e3585827032c066c49cb10aff2eecb6e23d7f11bb97c9340e9659d87230e8c")
  public open fun certificate(`value`: CertificateProperty.Builder.() -> Unit): Unit =
      certificate(CertificateProperty(`value`))

  public open fun certificateSettings(): Any? = unwrap(this).getCertificateSettings()

  public open fun certificateSettings(`value`: IResolvable) {
    unwrap(this).setCertificateSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun certificateSettings(`value`: CertificateSettingsProperty) {
    unwrap(this).setCertificateSettings(`value`.let(CertificateSettingsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("eca13eafa77ea02b50a6d71f0c4d4b9f988fee0952bb0ed539ec11e876779828")
  public open fun certificateSettings(`value`: CertificateSettingsProperty.Builder.() -> Unit): Unit
      = certificateSettings(CertificateSettingsProperty(`value`))

  public open fun domainName(): String = unwrap(this).getDomainName()

  public open fun domainName(`value`: String) {
    unwrap(this).setDomainName(`value`)
  }

  public open fun enableAutoSubDomain(): Any? = unwrap(this).getEnableAutoSubDomain()

  public open fun enableAutoSubDomain(`value`: Boolean) {
    unwrap(this).setEnableAutoSubDomain(`value`)
  }

  public open fun enableAutoSubDomain(`value`: IResolvable) {
    unwrap(this).setEnableAutoSubDomain(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun subDomainSettings(): Any = unwrap(this).getSubDomainSettings()

  public open fun subDomainSettings(`value`: IResolvable) {
    unwrap(this).setSubDomainSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun subDomainSettings(__idx_ac66f0: List<Any>) {
    unwrap(this).setSubDomainSettings(__idx_ac66f0)
  }

  public open fun subDomainSettings(vararg __idx_ac66f0: Any): Unit =
      subDomainSettings(__idx_ac66f0.toList())

  public open fun updateStatus(): String? = unwrap(this).getUpdateStatus()

  public open fun updateStatus(`value`: String) {
    unwrap(this).setUpdateStatus(`value`)
  }

  public interface Builder {
    public fun appId(appId: String)

    public fun autoSubDomainCreationPatterns(autoSubDomainCreationPatterns: List<String>)

    public fun autoSubDomainCreationPatterns(vararg autoSubDomainCreationPatterns: String)

    public fun autoSubDomainIamRole(autoSubDomainIamRole: String)

    public fun certificate(certificate: IResolvable)

    public fun certificate(certificate: CertificateProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dba241ba2559bec2214c0d05d5c597cbd5bc0702b76b33a82125935135728c64")
    public fun certificate(certificate: CertificateProperty.Builder.() -> Unit)

    public fun certificateSettings(certificateSettings: IResolvable)

    public fun certificateSettings(certificateSettings: CertificateSettingsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("24aef84ec6083e0cc92f1f4e75c3a6a1a183923d7a3b8111b5fd53349c26a456")
    public
        fun certificateSettings(certificateSettings: CertificateSettingsProperty.Builder.() -> Unit)

    public fun domainName(domainName: String)

    public fun enableAutoSubDomain(enableAutoSubDomain: Boolean)

    public fun enableAutoSubDomain(enableAutoSubDomain: IResolvable)

    public fun subDomainSettings(subDomainSettings: IResolvable)

    public fun subDomainSettings(subDomainSettings: List<Any>)

    public fun subDomainSettings(vararg subDomainSettings: Any)

    public fun updateStatus(updateStatus: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.amplify.CfnDomain.Builder =
        software.amazon.awscdk.services.amplify.CfnDomain.Builder.create(scope, id)

    override fun appId(appId: String) {
      cdkBuilder.appId(appId)
    }

    override fun autoSubDomainCreationPatterns(autoSubDomainCreationPatterns: List<String>) {
      cdkBuilder.autoSubDomainCreationPatterns(autoSubDomainCreationPatterns)
    }

    override fun autoSubDomainCreationPatterns(vararg autoSubDomainCreationPatterns: String): Unit =
        autoSubDomainCreationPatterns(autoSubDomainCreationPatterns.toList())

    override fun autoSubDomainIamRole(autoSubDomainIamRole: String) {
      cdkBuilder.autoSubDomainIamRole(autoSubDomainIamRole)
    }

    override fun certificate(certificate: IResolvable) {
      cdkBuilder.certificate(certificate.let(IResolvable::unwrap))
    }

    override fun certificate(certificate: CertificateProperty) {
      cdkBuilder.certificate(certificate.let(CertificateProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dba241ba2559bec2214c0d05d5c597cbd5bc0702b76b33a82125935135728c64")
    override fun certificate(certificate: CertificateProperty.Builder.() -> Unit): Unit =
        certificate(CertificateProperty(certificate))

    override fun certificateSettings(certificateSettings: IResolvable) {
      cdkBuilder.certificateSettings(certificateSettings.let(IResolvable::unwrap))
    }

    override fun certificateSettings(certificateSettings: CertificateSettingsProperty) {
      cdkBuilder.certificateSettings(certificateSettings.let(CertificateSettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("24aef84ec6083e0cc92f1f4e75c3a6a1a183923d7a3b8111b5fd53349c26a456")
    override
        fun certificateSettings(certificateSettings: CertificateSettingsProperty.Builder.() -> Unit):
        Unit = certificateSettings(CertificateSettingsProperty(certificateSettings))

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    override fun enableAutoSubDomain(enableAutoSubDomain: Boolean) {
      cdkBuilder.enableAutoSubDomain(enableAutoSubDomain)
    }

    override fun enableAutoSubDomain(enableAutoSubDomain: IResolvable) {
      cdkBuilder.enableAutoSubDomain(enableAutoSubDomain.let(IResolvable::unwrap))
    }

    override fun subDomainSettings(subDomainSettings: IResolvable) {
      cdkBuilder.subDomainSettings(subDomainSettings.let(IResolvable::unwrap))
    }

    override fun subDomainSettings(subDomainSettings: List<Any>) {
      cdkBuilder.subDomainSettings(subDomainSettings)
    }

    override fun subDomainSettings(vararg subDomainSettings: Any): Unit =
        subDomainSettings(subDomainSettings.toList())

    override fun updateStatus(updateStatus: String) {
      cdkBuilder.updateStatus(updateStatus)
    }

    public fun build(): software.amazon.awscdk.services.amplify.CfnDomain = cdkBuilder.build()
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

    internal fun wrap(cdkObject: software.amazon.awscdk.services.amplify.CfnDomain): CfnDomain =
        CfnDomain(cdkObject)

    internal fun unwrap(wrapped: CfnDomain): software.amazon.awscdk.services.amplify.CfnDomain =
        wrapped.cdkObject
  }

  public interface SubDomainSettingProperty {
    public fun branchName(): String

    public fun prefix(): String

    public interface Builder {
      public fun branchName(branchName: String)

      public fun prefix(prefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplify.CfnDomain.SubDomainSettingProperty.Builder =
          software.amazon.awscdk.services.amplify.CfnDomain.SubDomainSettingProperty.builder()

      override fun branchName(branchName: String) {
        cdkBuilder.branchName(branchName)
      }

      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      public fun build(): software.amazon.awscdk.services.amplify.CfnDomain.SubDomainSettingProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplify.CfnDomain.SubDomainSettingProperty,
    ) : SubDomainSettingProperty {
      override fun branchName(): String = unwrap(this).getBranchName()

      override fun prefix(): String = unwrap(this).getPrefix()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SubDomainSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplify.CfnDomain.SubDomainSettingProperty):
          SubDomainSettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SubDomainSettingProperty):
          software.amazon.awscdk.services.amplify.CfnDomain.SubDomainSettingProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CertificateProperty {
    public fun certificateArn(): String? = unwrap(this).getCertificateArn()

    public fun certificateType(): String? = unwrap(this).getCertificateType()

    public fun certificateVerificationDnsRecord(): String? =
        unwrap(this).getCertificateVerificationDnsRecord()

    public interface Builder {
      public fun certificateArn(certificateArn: String)

      public fun certificateType(certificateType: String)

      public fun certificateVerificationDnsRecord(certificateVerificationDnsRecord: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplify.CfnDomain.CertificateProperty.Builder =
          software.amazon.awscdk.services.amplify.CfnDomain.CertificateProperty.builder()

      override fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
      }

      override fun certificateType(certificateType: String) {
        cdkBuilder.certificateType(certificateType)
      }

      override fun certificateVerificationDnsRecord(certificateVerificationDnsRecord: String) {
        cdkBuilder.certificateVerificationDnsRecord(certificateVerificationDnsRecord)
      }

      public fun build(): software.amazon.awscdk.services.amplify.CfnDomain.CertificateProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.amplify.CfnDomain.CertificateProperty,
    ) : CertificateProperty {
      override fun certificateArn(): String? = unwrap(this).getCertificateArn()

      override fun certificateType(): String? = unwrap(this).getCertificateType()

      override fun certificateVerificationDnsRecord(): String? =
          unwrap(this).getCertificateVerificationDnsRecord()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CertificateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplify.CfnDomain.CertificateProperty):
          CertificateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CertificateProperty):
          software.amazon.awscdk.services.amplify.CfnDomain.CertificateProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CertificateSettingsProperty {
    public fun certificateType(): String? = unwrap(this).getCertificateType()

    public fun customCertificateArn(): String? = unwrap(this).getCustomCertificateArn()

    public interface Builder {
      public fun certificateType(certificateType: String)

      public fun customCertificateArn(customCertificateArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplify.CfnDomain.CertificateSettingsProperty.Builder =
          software.amazon.awscdk.services.amplify.CfnDomain.CertificateSettingsProperty.builder()

      override fun certificateType(certificateType: String) {
        cdkBuilder.certificateType(certificateType)
      }

      override fun customCertificateArn(customCertificateArn: String) {
        cdkBuilder.customCertificateArn(customCertificateArn)
      }

      public fun build():
          software.amazon.awscdk.services.amplify.CfnDomain.CertificateSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplify.CfnDomain.CertificateSettingsProperty,
    ) : CertificateSettingsProperty {
      override fun certificateType(): String? = unwrap(this).getCertificateType()

      override fun customCertificateArn(): String? = unwrap(this).getCustomCertificateArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CertificateSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplify.CfnDomain.CertificateSettingsProperty):
          CertificateSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CertificateSettingsProperty):
          software.amazon.awscdk.services.amplify.CfnDomain.CertificateSettingsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
