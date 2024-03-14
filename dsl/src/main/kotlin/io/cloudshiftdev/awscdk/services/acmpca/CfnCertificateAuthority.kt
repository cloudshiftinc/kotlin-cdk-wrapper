package io.cloudshiftdev.awscdk.services.acmpca

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

public open class CfnCertificateAuthority internal constructor(
  private val cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificateAuthority,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCertificateSigningRequest(): String =
      unwrap(this).getAttrCertificateSigningRequest()

  public open fun csrExtensions(): Any? = unwrap(this).getCsrExtensions()

  public open fun csrExtensions(`value`: IResolvable) {
    unwrap(this).setCsrExtensions(`value`.let(IResolvable::unwrap))
  }

  public open fun csrExtensions(`value`: CsrExtensionsProperty) {
    unwrap(this).setCsrExtensions(`value`.let(CsrExtensionsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fcfad6e60f76a697015566819c3bb647af8a3d6be9901dbda0a8c3613fde9afe")
  public open fun csrExtensions(`value`: CsrExtensionsProperty.Builder.() -> Unit): Unit =
      csrExtensions(CsrExtensionsProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun keyAlgorithm(): String = unwrap(this).getKeyAlgorithm()

  public open fun keyAlgorithm(`value`: String) {
    unwrap(this).setKeyAlgorithm(`value`)
  }

  public open fun keyStorageSecurityStandard(): String? =
      unwrap(this).getKeyStorageSecurityStandard()

  public open fun keyStorageSecurityStandard(`value`: String) {
    unwrap(this).setKeyStorageSecurityStandard(`value`)
  }

  public open fun revocationConfiguration(): Any? = unwrap(this).getRevocationConfiguration()

  public open fun revocationConfiguration(`value`: IResolvable) {
    unwrap(this).setRevocationConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun revocationConfiguration(`value`: RevocationConfigurationProperty) {
    unwrap(this).setRevocationConfiguration(`value`.let(RevocationConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("872c32b575520dea0d4be4d42390262794c9658a7cb0ff2a4cf08e81a1dbdebf")
  public open
      fun revocationConfiguration(`value`: RevocationConfigurationProperty.Builder.() -> Unit): Unit
      = revocationConfiguration(RevocationConfigurationProperty(`value`))

  public open fun signingAlgorithm(): String = unwrap(this).getSigningAlgorithm()

  public open fun signingAlgorithm(`value`: String) {
    unwrap(this).setSigningAlgorithm(`value`)
  }

  public open fun subject(): Any = unwrap(this).getSubject()

  public open fun subject(`value`: IResolvable) {
    unwrap(this).setSubject(`value`.let(IResolvable::unwrap))
  }

  public open fun subject(`value`: SubjectProperty) {
    unwrap(this).setSubject(`value`.let(SubjectProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1f0cdc0265ff00f08c1503121d08f39681bf21d2d1e4672885f52f80dbac91b7")
  public open fun subject(`value`: SubjectProperty.Builder.() -> Unit): Unit =
      subject(SubjectProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun type(): String = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  public open fun usageMode(): String? = unwrap(this).getUsageMode()

  public open fun usageMode(`value`: String) {
    unwrap(this).setUsageMode(`value`)
  }

  public interface Builder {
    public fun csrExtensions(csrExtensions: IResolvable)

    public fun csrExtensions(csrExtensions: CsrExtensionsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3588d79ec2a4bbbfd46f35946af39067613e03a5bfac28f5bb29032a8c13e2cf")
    public fun csrExtensions(csrExtensions: CsrExtensionsProperty.Builder.() -> Unit)

    public fun keyAlgorithm(keyAlgorithm: String)

    public fun keyStorageSecurityStandard(keyStorageSecurityStandard: String)

    public fun revocationConfiguration(revocationConfiguration: IResolvable)

    public fun revocationConfiguration(revocationConfiguration: RevocationConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b3e444ce362ba61faaa26b8350cddfed08d805dca8f5b73a4b307724c9fed74")
    public
        fun revocationConfiguration(revocationConfiguration: RevocationConfigurationProperty.Builder.() -> Unit)

    public fun signingAlgorithm(signingAlgorithm: String)

    public fun subject(subject: IResolvable)

    public fun subject(subject: SubjectProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("627b67d75d0d706282cd5f2d373217b36fe336f138ddb77c4e08238b89bbb54c")
    public fun subject(subject: SubjectProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun type(type: String)

    public fun usageMode(usageMode: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.Builder =
        software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.Builder.create(scope, id)

    override fun csrExtensions(csrExtensions: IResolvable) {
      cdkBuilder.csrExtensions(csrExtensions.let(IResolvable::unwrap))
    }

    override fun csrExtensions(csrExtensions: CsrExtensionsProperty) {
      cdkBuilder.csrExtensions(csrExtensions.let(CsrExtensionsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3588d79ec2a4bbbfd46f35946af39067613e03a5bfac28f5bb29032a8c13e2cf")
    override fun csrExtensions(csrExtensions: CsrExtensionsProperty.Builder.() -> Unit): Unit =
        csrExtensions(CsrExtensionsProperty(csrExtensions))

    override fun keyAlgorithm(keyAlgorithm: String) {
      cdkBuilder.keyAlgorithm(keyAlgorithm)
    }

    override fun keyStorageSecurityStandard(keyStorageSecurityStandard: String) {
      cdkBuilder.keyStorageSecurityStandard(keyStorageSecurityStandard)
    }

    override fun revocationConfiguration(revocationConfiguration: IResolvable) {
      cdkBuilder.revocationConfiguration(revocationConfiguration.let(IResolvable::unwrap))
    }

    override fun revocationConfiguration(revocationConfiguration: RevocationConfigurationProperty) {
      cdkBuilder.revocationConfiguration(revocationConfiguration.let(RevocationConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b3e444ce362ba61faaa26b8350cddfed08d805dca8f5b73a4b307724c9fed74")
    override
        fun revocationConfiguration(revocationConfiguration: RevocationConfigurationProperty.Builder.() -> Unit):
        Unit = revocationConfiguration(RevocationConfigurationProperty(revocationConfiguration))

    override fun signingAlgorithm(signingAlgorithm: String) {
      cdkBuilder.signingAlgorithm(signingAlgorithm)
    }

    override fun subject(subject: IResolvable) {
      cdkBuilder.subject(subject.let(IResolvable::unwrap))
    }

    override fun subject(subject: SubjectProperty) {
      cdkBuilder.subject(subject.let(SubjectProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("627b67d75d0d706282cd5f2d373217b36fe336f138ddb77c4e08238b89bbb54c")
    override fun subject(subject: SubjectProperty.Builder.() -> Unit): Unit =
        subject(SubjectProperty(subject))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    override fun usageMode(usageMode: String) {
      cdkBuilder.usageMode(usageMode)
    }

    public fun build(): software.amazon.awscdk.services.acmpca.CfnCertificateAuthority =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCertificateAuthority {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCertificateAuthority(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificateAuthority):
        CfnCertificateAuthority = CfnCertificateAuthority(cdkObject)

    internal fun unwrap(wrapped: CfnCertificateAuthority):
        software.amazon.awscdk.services.acmpca.CfnCertificateAuthority = wrapped.cdkObject
  }

  public interface EdiPartyNameProperty {
    public fun nameAssigner(): String

    public fun partyName(): String

    public interface Builder {
      public fun nameAssigner(nameAssigner: String)

      public fun partyName(partyName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.EdiPartyNameProperty.Builder
          =
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.EdiPartyNameProperty.builder()

      override fun nameAssigner(nameAssigner: String) {
        cdkBuilder.nameAssigner(nameAssigner)
      }

      override fun partyName(partyName: String) {
        cdkBuilder.partyName(partyName)
      }

      public fun build():
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.EdiPartyNameProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.EdiPartyNameProperty,
    ) : EdiPartyNameProperty {
      override fun nameAssigner(): String = unwrap(this).getNameAssigner()

      override fun partyName(): String = unwrap(this).getPartyName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EdiPartyNameProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.EdiPartyNameProperty):
          EdiPartyNameProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EdiPartyNameProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.EdiPartyNameProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface OtherNameProperty {
    public fun typeId(): String

    public fun `value`(): String

    public interface Builder {
      public fun typeId(typeId: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.OtherNameProperty.Builder =
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.OtherNameProperty.builder()

      override fun typeId(typeId: String) {
        cdkBuilder.typeId(typeId)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.OtherNameProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.OtherNameProperty,
    ) : OtherNameProperty {
      override fun typeId(): String = unwrap(this).getTypeId()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OtherNameProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.OtherNameProperty):
          OtherNameProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OtherNameProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.OtherNameProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AccessDescriptionProperty {
    public fun accessLocation(): Any

    public fun accessMethod(): Any

    public interface Builder {
      public fun accessLocation(accessLocation: IResolvable)

      public fun accessLocation(accessLocation: GeneralNameProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb5a597013ed07b1773f4061cf6b689bdab60e580241398175d0e17b064edaa9")
      public fun accessLocation(accessLocation: GeneralNameProperty.Builder.() -> Unit)

      public fun accessMethod(accessMethod: IResolvable)

      public fun accessMethod(accessMethod: AccessMethodProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("20b75f916b502e4fd62642433190cfbf1527eebbacdd86547ac494a10c71f682")
      public fun accessMethod(accessMethod: AccessMethodProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.AccessDescriptionProperty.Builder
          =
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.AccessDescriptionProperty.builder()

      override fun accessLocation(accessLocation: IResolvable) {
        cdkBuilder.accessLocation(accessLocation.let(IResolvable::unwrap))
      }

      override fun accessLocation(accessLocation: GeneralNameProperty) {
        cdkBuilder.accessLocation(accessLocation.let(GeneralNameProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb5a597013ed07b1773f4061cf6b689bdab60e580241398175d0e17b064edaa9")
      override fun accessLocation(accessLocation: GeneralNameProperty.Builder.() -> Unit): Unit =
          accessLocation(GeneralNameProperty(accessLocation))

      override fun accessMethod(accessMethod: IResolvable) {
        cdkBuilder.accessMethod(accessMethod.let(IResolvable::unwrap))
      }

      override fun accessMethod(accessMethod: AccessMethodProperty) {
        cdkBuilder.accessMethod(accessMethod.let(AccessMethodProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("20b75f916b502e4fd62642433190cfbf1527eebbacdd86547ac494a10c71f682")
      override fun accessMethod(accessMethod: AccessMethodProperty.Builder.() -> Unit): Unit =
          accessMethod(AccessMethodProperty(accessMethod))

      public fun build():
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.AccessDescriptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.AccessDescriptionProperty,
    ) : AccessDescriptionProperty {
      override fun accessLocation(): Any = unwrap(this).getAccessLocation()

      override fun accessMethod(): Any = unwrap(this).getAccessMethod()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AccessDescriptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.AccessDescriptionProperty):
          AccessDescriptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessDescriptionProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.AccessDescriptionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface KeyUsageProperty {
    public fun crlSign(): Any? = unwrap(this).getCrlSign()

    public fun dataEncipherment(): Any? = unwrap(this).getDataEncipherment()

    public fun decipherOnly(): Any? = unwrap(this).getDecipherOnly()

    public fun digitalSignature(): Any? = unwrap(this).getDigitalSignature()

    public fun encipherOnly(): Any? = unwrap(this).getEncipherOnly()

    public fun keyAgreement(): Any? = unwrap(this).getKeyAgreement()

    public fun keyCertSign(): Any? = unwrap(this).getKeyCertSign()

    public fun keyEncipherment(): Any? = unwrap(this).getKeyEncipherment()

    public fun nonRepudiation(): Any? = unwrap(this).getNonRepudiation()

    public interface Builder {
      public fun crlSign(crlSign: Boolean)

      public fun crlSign(crlSign: IResolvable)

      public fun dataEncipherment(dataEncipherment: Boolean)

      public fun dataEncipherment(dataEncipherment: IResolvable)

      public fun decipherOnly(decipherOnly: Boolean)

      public fun decipherOnly(decipherOnly: IResolvable)

      public fun digitalSignature(digitalSignature: Boolean)

      public fun digitalSignature(digitalSignature: IResolvable)

      public fun encipherOnly(encipherOnly: Boolean)

      public fun encipherOnly(encipherOnly: IResolvable)

      public fun keyAgreement(keyAgreement: Boolean)

      public fun keyAgreement(keyAgreement: IResolvable)

      public fun keyCertSign(keyCertSign: Boolean)

      public fun keyCertSign(keyCertSign: IResolvable)

      public fun keyEncipherment(keyEncipherment: Boolean)

      public fun keyEncipherment(keyEncipherment: IResolvable)

      public fun nonRepudiation(nonRepudiation: Boolean)

      public fun nonRepudiation(nonRepudiation: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.KeyUsageProperty.Builder =
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.KeyUsageProperty.builder()

      override fun crlSign(crlSign: Boolean) {
        cdkBuilder.crlSign(crlSign)
      }

      override fun crlSign(crlSign: IResolvable) {
        cdkBuilder.crlSign(crlSign.let(IResolvable::unwrap))
      }

      override fun dataEncipherment(dataEncipherment: Boolean) {
        cdkBuilder.dataEncipherment(dataEncipherment)
      }

      override fun dataEncipherment(dataEncipherment: IResolvable) {
        cdkBuilder.dataEncipherment(dataEncipherment.let(IResolvable::unwrap))
      }

      override fun decipherOnly(decipherOnly: Boolean) {
        cdkBuilder.decipherOnly(decipherOnly)
      }

      override fun decipherOnly(decipherOnly: IResolvable) {
        cdkBuilder.decipherOnly(decipherOnly.let(IResolvable::unwrap))
      }

      override fun digitalSignature(digitalSignature: Boolean) {
        cdkBuilder.digitalSignature(digitalSignature)
      }

      override fun digitalSignature(digitalSignature: IResolvable) {
        cdkBuilder.digitalSignature(digitalSignature.let(IResolvable::unwrap))
      }

      override fun encipherOnly(encipherOnly: Boolean) {
        cdkBuilder.encipherOnly(encipherOnly)
      }

      override fun encipherOnly(encipherOnly: IResolvable) {
        cdkBuilder.encipherOnly(encipherOnly.let(IResolvable::unwrap))
      }

      override fun keyAgreement(keyAgreement: Boolean) {
        cdkBuilder.keyAgreement(keyAgreement)
      }

      override fun keyAgreement(keyAgreement: IResolvable) {
        cdkBuilder.keyAgreement(keyAgreement.let(IResolvable::unwrap))
      }

      override fun keyCertSign(keyCertSign: Boolean) {
        cdkBuilder.keyCertSign(keyCertSign)
      }

      override fun keyCertSign(keyCertSign: IResolvable) {
        cdkBuilder.keyCertSign(keyCertSign.let(IResolvable::unwrap))
      }

      override fun keyEncipherment(keyEncipherment: Boolean) {
        cdkBuilder.keyEncipherment(keyEncipherment)
      }

      override fun keyEncipherment(keyEncipherment: IResolvable) {
        cdkBuilder.keyEncipherment(keyEncipherment.let(IResolvable::unwrap))
      }

      override fun nonRepudiation(nonRepudiation: Boolean) {
        cdkBuilder.nonRepudiation(nonRepudiation)
      }

      override fun nonRepudiation(nonRepudiation: IResolvable) {
        cdkBuilder.nonRepudiation(nonRepudiation.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.KeyUsageProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.KeyUsageProperty,
    ) : KeyUsageProperty {
      override fun crlSign(): Any? = unwrap(this).getCrlSign()

      override fun dataEncipherment(): Any? = unwrap(this).getDataEncipherment()

      override fun decipherOnly(): Any? = unwrap(this).getDecipherOnly()

      override fun digitalSignature(): Any? = unwrap(this).getDigitalSignature()

      override fun encipherOnly(): Any? = unwrap(this).getEncipherOnly()

      override fun keyAgreement(): Any? = unwrap(this).getKeyAgreement()

      override fun keyCertSign(): Any? = unwrap(this).getKeyCertSign()

      override fun keyEncipherment(): Any? = unwrap(this).getKeyEncipherment()

      override fun nonRepudiation(): Any? = unwrap(this).getNonRepudiation()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KeyUsageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.KeyUsageProperty):
          KeyUsageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KeyUsageProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.KeyUsageProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface CsrExtensionsProperty {
    public fun keyUsage(): Any? = unwrap(this).getKeyUsage()

    public fun subjectInformationAccess(): Any? = unwrap(this).getSubjectInformationAccess()

    public interface Builder {
      public fun keyUsage(keyUsage: IResolvable)

      public fun keyUsage(keyUsage: KeyUsageProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2eec907f4ab3f8f3fe73d3fa8e50c0be7a1ced4cf16db0702e97fb00670a2812")
      public fun keyUsage(keyUsage: KeyUsageProperty.Builder.() -> Unit)

      public fun subjectInformationAccess(subjectInformationAccess: IResolvable)

      public fun subjectInformationAccess(subjectInformationAccess: List<Any>)

      public fun subjectInformationAccess(vararg subjectInformationAccess: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CsrExtensionsProperty.Builder
          =
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CsrExtensionsProperty.builder()

      override fun keyUsage(keyUsage: IResolvable) {
        cdkBuilder.keyUsage(keyUsage.let(IResolvable::unwrap))
      }

      override fun keyUsage(keyUsage: KeyUsageProperty) {
        cdkBuilder.keyUsage(keyUsage.let(KeyUsageProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2eec907f4ab3f8f3fe73d3fa8e50c0be7a1ced4cf16db0702e97fb00670a2812")
      override fun keyUsage(keyUsage: KeyUsageProperty.Builder.() -> Unit): Unit =
          keyUsage(KeyUsageProperty(keyUsage))

      override fun subjectInformationAccess(subjectInformationAccess: IResolvable) {
        cdkBuilder.subjectInformationAccess(subjectInformationAccess.let(IResolvable::unwrap))
      }

      override fun subjectInformationAccess(subjectInformationAccess: List<Any>) {
        cdkBuilder.subjectInformationAccess(subjectInformationAccess)
      }

      override fun subjectInformationAccess(vararg subjectInformationAccess: Any): Unit =
          subjectInformationAccess(subjectInformationAccess.toList())

      public fun build():
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CsrExtensionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CsrExtensionsProperty,
    ) : CsrExtensionsProperty {
      override fun keyUsage(): Any? = unwrap(this).getKeyUsage()

      override fun subjectInformationAccess(): Any? = unwrap(this).getSubjectInformationAccess()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CsrExtensionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CsrExtensionsProperty):
          CsrExtensionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CsrExtensionsProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CsrExtensionsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface RevocationConfigurationProperty {
    public fun crlConfiguration(): Any? = unwrap(this).getCrlConfiguration()

    public fun ocspConfiguration(): Any? = unwrap(this).getOcspConfiguration()

    public interface Builder {
      public fun crlConfiguration(crlConfiguration: IResolvable)

      public fun crlConfiguration(crlConfiguration: CrlConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f5e08ccbba1511e80806605dced01835b990496478d99ab49fcf289028aa4592")
      public fun crlConfiguration(crlConfiguration: CrlConfigurationProperty.Builder.() -> Unit)

      public fun ocspConfiguration(ocspConfiguration: IResolvable)

      public fun ocspConfiguration(ocspConfiguration: OcspConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b9cc9b7b1bbd7af3bd90deea00d53454783d53fa73e507b733560d62cdc208a0")
      public fun ocspConfiguration(ocspConfiguration: OcspConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.RevocationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.RevocationConfigurationProperty.builder()

      override fun crlConfiguration(crlConfiguration: IResolvable) {
        cdkBuilder.crlConfiguration(crlConfiguration.let(IResolvable::unwrap))
      }

      override fun crlConfiguration(crlConfiguration: CrlConfigurationProperty) {
        cdkBuilder.crlConfiguration(crlConfiguration.let(CrlConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f5e08ccbba1511e80806605dced01835b990496478d99ab49fcf289028aa4592")
      override fun crlConfiguration(crlConfiguration: CrlConfigurationProperty.Builder.() -> Unit):
          Unit = crlConfiguration(CrlConfigurationProperty(crlConfiguration))

      override fun ocspConfiguration(ocspConfiguration: IResolvable) {
        cdkBuilder.ocspConfiguration(ocspConfiguration.let(IResolvable::unwrap))
      }

      override fun ocspConfiguration(ocspConfiguration: OcspConfigurationProperty) {
        cdkBuilder.ocspConfiguration(ocspConfiguration.let(OcspConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b9cc9b7b1bbd7af3bd90deea00d53454783d53fa73e507b733560d62cdc208a0")
      override
          fun ocspConfiguration(ocspConfiguration: OcspConfigurationProperty.Builder.() -> Unit):
          Unit = ocspConfiguration(OcspConfigurationProperty(ocspConfiguration))

      public fun build():
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.RevocationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.RevocationConfigurationProperty,
    ) : RevocationConfigurationProperty {
      override fun crlConfiguration(): Any? = unwrap(this).getCrlConfiguration()

      override fun ocspConfiguration(): Any? = unwrap(this).getOcspConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RevocationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.RevocationConfigurationProperty):
          RevocationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RevocationConfigurationProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.RevocationConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SubjectProperty {
    public fun commonName(): String? = unwrap(this).getCommonName()

    public fun country(): String? = unwrap(this).getCountry()

    public fun customAttributes(): Any? = unwrap(this).getCustomAttributes()

    public fun distinguishedNameQualifier(): String? = unwrap(this).getDistinguishedNameQualifier()

    public fun generationQualifier(): String? = unwrap(this).getGenerationQualifier()

    public fun givenName(): String? = unwrap(this).getGivenName()

    public fun initials(): String? = unwrap(this).getInitials()

    public fun locality(): String? = unwrap(this).getLocality()

    public fun organization(): String? = unwrap(this).getOrganization()

    public fun organizationalUnit(): String? = unwrap(this).getOrganizationalUnit()

    public fun pseudonym(): String? = unwrap(this).getPseudonym()

    public fun serialNumber(): String? = unwrap(this).getSerialNumber()

    public fun state(): String? = unwrap(this).getState()

    public fun surname(): String? = unwrap(this).getSurname()

    public fun title(): String? = unwrap(this).getTitle()

    public interface Builder {
      public fun commonName(commonName: String)

      public fun country(country: String)

      public fun customAttributes(customAttributes: IResolvable)

      public fun customAttributes(customAttributes: List<Any>)

      public fun customAttributes(vararg customAttributes: Any)

      public fun distinguishedNameQualifier(distinguishedNameQualifier: String)

      public fun generationQualifier(generationQualifier: String)

      public fun givenName(givenName: String)

      public fun initials(initials: String)

      public fun locality(locality: String)

      public fun organization(organization: String)

      public fun organizationalUnit(organizationalUnit: String)

      public fun pseudonym(pseudonym: String)

      public fun serialNumber(serialNumber: String)

      public fun state(state: String)

      public fun surname(surname: String)

      public fun title(title: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.SubjectProperty.Builder =
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.SubjectProperty.builder()

      override fun commonName(commonName: String) {
        cdkBuilder.commonName(commonName)
      }

      override fun country(country: String) {
        cdkBuilder.country(country)
      }

      override fun customAttributes(customAttributes: IResolvable) {
        cdkBuilder.customAttributes(customAttributes.let(IResolvable::unwrap))
      }

      override fun customAttributes(customAttributes: List<Any>) {
        cdkBuilder.customAttributes(customAttributes)
      }

      override fun customAttributes(vararg customAttributes: Any): Unit =
          customAttributes(customAttributes.toList())

      override fun distinguishedNameQualifier(distinguishedNameQualifier: String) {
        cdkBuilder.distinguishedNameQualifier(distinguishedNameQualifier)
      }

      override fun generationQualifier(generationQualifier: String) {
        cdkBuilder.generationQualifier(generationQualifier)
      }

      override fun givenName(givenName: String) {
        cdkBuilder.givenName(givenName)
      }

      override fun initials(initials: String) {
        cdkBuilder.initials(initials)
      }

      override fun locality(locality: String) {
        cdkBuilder.locality(locality)
      }

      override fun organization(organization: String) {
        cdkBuilder.organization(organization)
      }

      override fun organizationalUnit(organizationalUnit: String) {
        cdkBuilder.organizationalUnit(organizationalUnit)
      }

      override fun pseudonym(pseudonym: String) {
        cdkBuilder.pseudonym(pseudonym)
      }

      override fun serialNumber(serialNumber: String) {
        cdkBuilder.serialNumber(serialNumber)
      }

      override fun state(state: String) {
        cdkBuilder.state(state)
      }

      override fun surname(surname: String) {
        cdkBuilder.surname(surname)
      }

      override fun title(title: String) {
        cdkBuilder.title(title)
      }

      public fun build():
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.SubjectProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.SubjectProperty,
    ) : SubjectProperty {
      override fun commonName(): String? = unwrap(this).getCommonName()

      override fun country(): String? = unwrap(this).getCountry()

      override fun customAttributes(): Any? = unwrap(this).getCustomAttributes()

      override fun distinguishedNameQualifier(): String? =
          unwrap(this).getDistinguishedNameQualifier()

      override fun generationQualifier(): String? = unwrap(this).getGenerationQualifier()

      override fun givenName(): String? = unwrap(this).getGivenName()

      override fun initials(): String? = unwrap(this).getInitials()

      override fun locality(): String? = unwrap(this).getLocality()

      override fun organization(): String? = unwrap(this).getOrganization()

      override fun organizationalUnit(): String? = unwrap(this).getOrganizationalUnit()

      override fun pseudonym(): String? = unwrap(this).getPseudonym()

      override fun serialNumber(): String? = unwrap(this).getSerialNumber()

      override fun state(): String? = unwrap(this).getState()

      override fun surname(): String? = unwrap(this).getSurname()

      override fun title(): String? = unwrap(this).getTitle()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SubjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.SubjectProperty):
          SubjectProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SubjectProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.SubjectProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface AccessMethodProperty {
    public fun accessMethodType(): String? = unwrap(this).getAccessMethodType()

    public fun customObjectIdentifier(): String? = unwrap(this).getCustomObjectIdentifier()

    public interface Builder {
      public fun accessMethodType(accessMethodType: String)

      public fun customObjectIdentifier(customObjectIdentifier: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.AccessMethodProperty.Builder
          =
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.AccessMethodProperty.builder()

      override fun accessMethodType(accessMethodType: String) {
        cdkBuilder.accessMethodType(accessMethodType)
      }

      override fun customObjectIdentifier(customObjectIdentifier: String) {
        cdkBuilder.customObjectIdentifier(customObjectIdentifier)
      }

      public fun build():
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.AccessMethodProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.AccessMethodProperty,
    ) : AccessMethodProperty {
      override fun accessMethodType(): String? = unwrap(this).getAccessMethodType()

      override fun customObjectIdentifier(): String? = unwrap(this).getCustomObjectIdentifier()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AccessMethodProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.AccessMethodProperty):
          AccessMethodProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessMethodProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.AccessMethodProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CrlConfigurationProperty {
    public fun crlDistributionPointExtensionConfiguration(): Any? =
        unwrap(this).getCrlDistributionPointExtensionConfiguration()

    public fun customCname(): String? = unwrap(this).getCustomCname()

    public fun enabled(): Any? = unwrap(this).getEnabled()

    public fun expirationInDays(): Number? = unwrap(this).getExpirationInDays()

    public fun s3BucketName(): String? = unwrap(this).getS3BucketName()

    public fun s3ObjectAcl(): String? = unwrap(this).getS3ObjectAcl()

    public interface Builder {
      public
          fun crlDistributionPointExtensionConfiguration(crlDistributionPointExtensionConfiguration: IResolvable)

      public
          fun crlDistributionPointExtensionConfiguration(crlDistributionPointExtensionConfiguration: CrlDistributionPointExtensionConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("791b3eddadee92703cdbb0776ac5a510f3d85f553de3e80da8cb9947358a4eea")
      public
          fun crlDistributionPointExtensionConfiguration(crlDistributionPointExtensionConfiguration: CrlDistributionPointExtensionConfigurationProperty.Builder.() -> Unit)

      public fun customCname(customCname: String)

      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)

      public fun expirationInDays(expirationInDays: Number)

      public fun s3BucketName(s3BucketName: String)

      public fun s3ObjectAcl(s3ObjectAcl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CrlConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CrlConfigurationProperty.builder()

      override
          fun crlDistributionPointExtensionConfiguration(crlDistributionPointExtensionConfiguration: IResolvable) {
        cdkBuilder.crlDistributionPointExtensionConfiguration(crlDistributionPointExtensionConfiguration.let(IResolvable::unwrap))
      }

      override
          fun crlDistributionPointExtensionConfiguration(crlDistributionPointExtensionConfiguration: CrlDistributionPointExtensionConfigurationProperty) {
        cdkBuilder.crlDistributionPointExtensionConfiguration(crlDistributionPointExtensionConfiguration.let(CrlDistributionPointExtensionConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("791b3eddadee92703cdbb0776ac5a510f3d85f553de3e80da8cb9947358a4eea")
      override
          fun crlDistributionPointExtensionConfiguration(crlDistributionPointExtensionConfiguration: CrlDistributionPointExtensionConfigurationProperty.Builder.() -> Unit):
          Unit =
          crlDistributionPointExtensionConfiguration(CrlDistributionPointExtensionConfigurationProperty(crlDistributionPointExtensionConfiguration))

      override fun customCname(customCname: String) {
        cdkBuilder.customCname(customCname)
      }

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      override fun expirationInDays(expirationInDays: Number) {
        cdkBuilder.expirationInDays(expirationInDays)
      }

      override fun s3BucketName(s3BucketName: String) {
        cdkBuilder.s3BucketName(s3BucketName)
      }

      override fun s3ObjectAcl(s3ObjectAcl: String) {
        cdkBuilder.s3ObjectAcl(s3ObjectAcl)
      }

      public fun build():
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CrlConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CrlConfigurationProperty,
    ) : CrlConfigurationProperty {
      override fun crlDistributionPointExtensionConfiguration(): Any? =
          unwrap(this).getCrlDistributionPointExtensionConfiguration()

      override fun customCname(): String? = unwrap(this).getCustomCname()

      override fun enabled(): Any? = unwrap(this).getEnabled()

      override fun expirationInDays(): Number? = unwrap(this).getExpirationInDays()

      override fun s3BucketName(): String? = unwrap(this).getS3BucketName()

      override fun s3ObjectAcl(): String? = unwrap(this).getS3ObjectAcl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CrlConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CrlConfigurationProperty):
          CrlConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CrlConfigurationProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CrlConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CrlDistributionPointExtensionConfigurationProperty {
    public fun omitExtension(): Any

    public interface Builder {
      public fun omitExtension(omitExtension: Boolean)

      public fun omitExtension(omitExtension: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CrlDistributionPointExtensionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CrlDistributionPointExtensionConfigurationProperty.builder()

      override fun omitExtension(omitExtension: Boolean) {
        cdkBuilder.omitExtension(omitExtension)
      }

      override fun omitExtension(omitExtension: IResolvable) {
        cdkBuilder.omitExtension(omitExtension.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CrlDistributionPointExtensionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CrlDistributionPointExtensionConfigurationProperty,
    ) : CrlDistributionPointExtensionConfigurationProperty {
      override fun omitExtension(): Any = unwrap(this).getOmitExtension()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          CrlDistributionPointExtensionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CrlDistributionPointExtensionConfigurationProperty):
          CrlDistributionPointExtensionConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CrlDistributionPointExtensionConfigurationProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CrlDistributionPointExtensionConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface OcspConfigurationProperty {
    public fun enabled(): Any? = unwrap(this).getEnabled()

    public fun ocspCustomCname(): String? = unwrap(this).getOcspCustomCname()

    public interface Builder {
      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)

      public fun ocspCustomCname(ocspCustomCname: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.OcspConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.OcspConfigurationProperty.builder()

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      override fun ocspCustomCname(ocspCustomCname: String) {
        cdkBuilder.ocspCustomCname(ocspCustomCname)
      }

      public fun build():
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.OcspConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.OcspConfigurationProperty,
    ) : OcspConfigurationProperty {
      override fun enabled(): Any? = unwrap(this).getEnabled()

      override fun ocspCustomCname(): String? = unwrap(this).getOcspCustomCname()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OcspConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.OcspConfigurationProperty):
          OcspConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OcspConfigurationProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.OcspConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface GeneralNameProperty {
    public fun directoryName(): Any? = unwrap(this).getDirectoryName()

    public fun dnsName(): String? = unwrap(this).getDnsName()

    public fun ediPartyName(): Any? = unwrap(this).getEdiPartyName()

    public fun ipAddress(): String? = unwrap(this).getIpAddress()

    public fun otherName(): Any? = unwrap(this).getOtherName()

    public fun registeredId(): String? = unwrap(this).getRegisteredId()

    public fun rfc822Name(): String? = unwrap(this).getRfc822Name()

    public fun uniformResourceIdentifier(): String? = unwrap(this).getUniformResourceIdentifier()

    public interface Builder {
      public fun directoryName(directoryName: IResolvable)

      public fun directoryName(directoryName: SubjectProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("61005aaa2bf810d7111074131f5352858d75a129bb0188bf7efc61268a97422f")
      public fun directoryName(directoryName: SubjectProperty.Builder.() -> Unit)

      public fun dnsName(dnsName: String)

      public fun ediPartyName(ediPartyName: IResolvable)

      public fun ediPartyName(ediPartyName: EdiPartyNameProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("606f0642ac76285ab8808b7d7ee57f3ef364d63570bb212e71923cf7da7835c7")
      public fun ediPartyName(ediPartyName: EdiPartyNameProperty.Builder.() -> Unit)

      public fun ipAddress(ipAddress: String)

      public fun otherName(otherName: IResolvable)

      public fun otherName(otherName: OtherNameProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8cf63f0806fe92adb04a674f7b59871bd20f023fd0d1f22ca3aaf221887d7206")
      public fun otherName(otherName: OtherNameProperty.Builder.() -> Unit)

      public fun registeredId(registeredId: String)

      public fun rfc822Name(rfc822Name: String)

      public fun uniformResourceIdentifier(uniformResourceIdentifier: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.GeneralNameProperty.Builder
          =
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.GeneralNameProperty.builder()

      override fun directoryName(directoryName: IResolvable) {
        cdkBuilder.directoryName(directoryName.let(IResolvable::unwrap))
      }

      override fun directoryName(directoryName: SubjectProperty) {
        cdkBuilder.directoryName(directoryName.let(SubjectProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("61005aaa2bf810d7111074131f5352858d75a129bb0188bf7efc61268a97422f")
      override fun directoryName(directoryName: SubjectProperty.Builder.() -> Unit): Unit =
          directoryName(SubjectProperty(directoryName))

      override fun dnsName(dnsName: String) {
        cdkBuilder.dnsName(dnsName)
      }

      override fun ediPartyName(ediPartyName: IResolvable) {
        cdkBuilder.ediPartyName(ediPartyName.let(IResolvable::unwrap))
      }

      override fun ediPartyName(ediPartyName: EdiPartyNameProperty) {
        cdkBuilder.ediPartyName(ediPartyName.let(EdiPartyNameProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("606f0642ac76285ab8808b7d7ee57f3ef364d63570bb212e71923cf7da7835c7")
      override fun ediPartyName(ediPartyName: EdiPartyNameProperty.Builder.() -> Unit): Unit =
          ediPartyName(EdiPartyNameProperty(ediPartyName))

      override fun ipAddress(ipAddress: String) {
        cdkBuilder.ipAddress(ipAddress)
      }

      override fun otherName(otherName: IResolvable) {
        cdkBuilder.otherName(otherName.let(IResolvable::unwrap))
      }

      override fun otherName(otherName: OtherNameProperty) {
        cdkBuilder.otherName(otherName.let(OtherNameProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8cf63f0806fe92adb04a674f7b59871bd20f023fd0d1f22ca3aaf221887d7206")
      override fun otherName(otherName: OtherNameProperty.Builder.() -> Unit): Unit =
          otherName(OtherNameProperty(otherName))

      override fun registeredId(registeredId: String) {
        cdkBuilder.registeredId(registeredId)
      }

      override fun rfc822Name(rfc822Name: String) {
        cdkBuilder.rfc822Name(rfc822Name)
      }

      override fun uniformResourceIdentifier(uniformResourceIdentifier: String) {
        cdkBuilder.uniformResourceIdentifier(uniformResourceIdentifier)
      }

      public fun build():
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.GeneralNameProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.GeneralNameProperty,
    ) : GeneralNameProperty {
      override fun directoryName(): Any? = unwrap(this).getDirectoryName()

      override fun dnsName(): String? = unwrap(this).getDnsName()

      override fun ediPartyName(): Any? = unwrap(this).getEdiPartyName()

      override fun ipAddress(): String? = unwrap(this).getIpAddress()

      override fun otherName(): Any? = unwrap(this).getOtherName()

      override fun registeredId(): String? = unwrap(this).getRegisteredId()

      override fun rfc822Name(): String? = unwrap(this).getRfc822Name()

      override fun uniformResourceIdentifier(): String? =
          unwrap(this).getUniformResourceIdentifier()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GeneralNameProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.GeneralNameProperty):
          GeneralNameProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GeneralNameProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.GeneralNameProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CustomAttributeProperty {
    public fun objectIdentifier(): String

    public fun `value`(): String

    public interface Builder {
      public fun objectIdentifier(objectIdentifier: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CustomAttributeProperty.Builder
          =
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CustomAttributeProperty.builder()

      override fun objectIdentifier(objectIdentifier: String) {
        cdkBuilder.objectIdentifier(objectIdentifier)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CustomAttributeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CustomAttributeProperty,
    ) : CustomAttributeProperty {
      override fun objectIdentifier(): String = unwrap(this).getObjectIdentifier()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CustomAttributeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CustomAttributeProperty):
          CustomAttributeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomAttributeProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CustomAttributeProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
