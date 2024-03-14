package io.cloudshiftdev.awscdk.services.acmpca

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
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

public open class CfnCertificate internal constructor(
  private val cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificate,
) : CfnResource(cdkObject), IInspectable {
  public open fun apiPassthrough(): Any? = unwrap(this).getApiPassthrough()

  public open fun apiPassthrough(`value`: IResolvable) {
    unwrap(this).setApiPassthrough(`value`.let(IResolvable::unwrap))
  }

  public open fun apiPassthrough(`value`: ApiPassthroughProperty) {
    unwrap(this).setApiPassthrough(`value`.let(ApiPassthroughProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("565c1eb4508e02ca7ca34fce3c451b90ca042a9298862ac73b56d596bd6a0763")
  public open fun apiPassthrough(`value`: ApiPassthroughProperty.Builder.() -> Unit): Unit =
      apiPassthrough(ApiPassthroughProperty(`value`))

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCertificate(): String = unwrap(this).getAttrCertificate()

  public open fun certificateAuthorityArn(): String = unwrap(this).getCertificateAuthorityArn()

  public open fun certificateAuthorityArn(`value`: String) {
    unwrap(this).setCertificateAuthorityArn(`value`)
  }

  public open fun certificateSigningRequest(): String = unwrap(this).getCertificateSigningRequest()

  public open fun certificateSigningRequest(`value`: String) {
    unwrap(this).setCertificateSigningRequest(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun signingAlgorithm(): String = unwrap(this).getSigningAlgorithm()

  public open fun signingAlgorithm(`value`: String) {
    unwrap(this).setSigningAlgorithm(`value`)
  }

  public open fun templateArn(): String? = unwrap(this).getTemplateArn()

  public open fun templateArn(`value`: String) {
    unwrap(this).setTemplateArn(`value`)
  }

  public open fun validity(): Any = unwrap(this).getValidity()

  public open fun validity(`value`: IResolvable) {
    unwrap(this).setValidity(`value`.let(IResolvable::unwrap))
  }

  public open fun validity(`value`: ValidityProperty) {
    unwrap(this).setValidity(`value`.let(ValidityProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("49edde1d6c8262ee5dcb27fe688ac660fb85fa61e2337bf0b4e487da3603efcf")
  public open fun validity(`value`: ValidityProperty.Builder.() -> Unit): Unit =
      validity(ValidityProperty(`value`))

  public open fun validityNotBefore(): Any? = unwrap(this).getValidityNotBefore()

  public open fun validityNotBefore(`value`: IResolvable) {
    unwrap(this).setValidityNotBefore(`value`.let(IResolvable::unwrap))
  }

  public open fun validityNotBefore(`value`: ValidityProperty) {
    unwrap(this).setValidityNotBefore(`value`.let(ValidityProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2ba2695733c613ab9a83ef7001d6ab81b5677e6f4d6ebd3f8cee4103528512f5")
  public open fun validityNotBefore(`value`: ValidityProperty.Builder.() -> Unit): Unit =
      validityNotBefore(ValidityProperty(`value`))

  public interface Builder {
    public fun apiPassthrough(apiPassthrough: IResolvable) {
    }

    public fun apiPassthrough(apiPassthrough: ApiPassthroughProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4a0f3e97e90bcc47dd6dd05629ad56eda48248296dea15b86de83bdfb30aae6c")
    public fun apiPassthrough(apiPassthrough: ApiPassthroughProperty.Builder.() -> Unit) {
    }

    public fun certificateAuthorityArn(certificateAuthorityArn: String) {
    }

    public fun certificateSigningRequest(certificateSigningRequest: String) {
    }

    public fun signingAlgorithm(signingAlgorithm: String) {
    }

    public fun templateArn(templateArn: String) {
    }

    public fun validity(validity: IResolvable) {
    }

    public fun validity(validity: ValidityProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2135e3b738ee43a1c9aefd8287583ea25e162de9c55128b22203b9a5eb39483a")
    public fun validity(validity: ValidityProperty.Builder.() -> Unit) {
    }

    public fun validityNotBefore(validityNotBefore: IResolvable) {
    }

    public fun validityNotBefore(validityNotBefore: ValidityProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef057b0455ab55481fcb02ec9d1a835d1d51f8b02a71a15350ad792b8eca4b82")
    public fun validityNotBefore(validityNotBefore: ValidityProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.acmpca.CfnCertificate.Builder =
        software.amazon.awscdk.services.acmpca.CfnCertificate.Builder.create(scope, id)

    public override fun apiPassthrough(apiPassthrough: IResolvable) {
      cdkBuilder.apiPassthrough(apiPassthrough.let(IResolvable::unwrap))
    }

    public override fun apiPassthrough(apiPassthrough: ApiPassthroughProperty) {
      cdkBuilder.apiPassthrough(apiPassthrough.let(ApiPassthroughProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4a0f3e97e90bcc47dd6dd05629ad56eda48248296dea15b86de83bdfb30aae6c")
    public override fun apiPassthrough(apiPassthrough: ApiPassthroughProperty.Builder.() -> Unit):
        Unit = apiPassthrough(ApiPassthroughProperty(apiPassthrough))

    public override fun certificateAuthorityArn(certificateAuthorityArn: String) {
      cdkBuilder.certificateAuthorityArn(certificateAuthorityArn)
    }

    public override fun certificateSigningRequest(certificateSigningRequest: String) {
      cdkBuilder.certificateSigningRequest(certificateSigningRequest)
    }

    public override fun signingAlgorithm(signingAlgorithm: String) {
      cdkBuilder.signingAlgorithm(signingAlgorithm)
    }

    public override fun templateArn(templateArn: String) {
      cdkBuilder.templateArn(templateArn)
    }

    public override fun validity(validity: IResolvable) {
      cdkBuilder.validity(validity.let(IResolvable::unwrap))
    }

    public override fun validity(validity: ValidityProperty) {
      cdkBuilder.validity(validity.let(ValidityProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2135e3b738ee43a1c9aefd8287583ea25e162de9c55128b22203b9a5eb39483a")
    public override fun validity(validity: ValidityProperty.Builder.() -> Unit): Unit =
        validity(ValidityProperty(validity))

    public override fun validityNotBefore(validityNotBefore: IResolvable) {
      cdkBuilder.validityNotBefore(validityNotBefore.let(IResolvable::unwrap))
    }

    public override fun validityNotBefore(validityNotBefore: ValidityProperty) {
      cdkBuilder.validityNotBefore(validityNotBefore.let(ValidityProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef057b0455ab55481fcb02ec9d1a835d1d51f8b02a71a15350ad792b8eca4b82")
    public override fun validityNotBefore(validityNotBefore: ValidityProperty.Builder.() -> Unit):
        Unit = validityNotBefore(ValidityProperty(validityNotBefore))

    public fun build(): software.amazon.awscdk.services.acmpca.CfnCertificate = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCertificate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCertificate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificate):
        CfnCertificate = CfnCertificate(cdkObject)

    internal fun unwrap(wrapped: CfnCertificate):
        software.amazon.awscdk.services.acmpca.CfnCertificate = wrapped.cdkObject
  }

  public interface PolicyInformationProperty {
    public fun certPolicyId(): String

    public fun policyQualifiers(): Any? = unwrap(this).getPolicyQualifiers()

    public interface Builder {
      public fun certPolicyId(certPolicyId: String) {
      }

      public fun policyQualifiers(policyQualifiers: IResolvable) {
      }

      public fun policyQualifiers(policyQualifiers: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificate.PolicyInformationProperty.Builder =
          software.amazon.awscdk.services.acmpca.CfnCertificate.PolicyInformationProperty.builder()

      public override fun certPolicyId(certPolicyId: String) {
        cdkBuilder.certPolicyId(certPolicyId)
      }

      public override fun policyQualifiers(policyQualifiers: IResolvable) {
        cdkBuilder.policyQualifiers(policyQualifiers.let(IResolvable::unwrap))
      }

      public override fun policyQualifiers(policyQualifiers: List<Any>) {
        cdkBuilder.policyQualifiers(policyQualifiers)
      }

      public fun build():
          software.amazon.awscdk.services.acmpca.CfnCertificate.PolicyInformationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificate.PolicyInformationProperty,
    ) : PolicyInformationProperty {
      public override fun certPolicyId(): String = unwrap(this).getCertPolicyId()

      public override fun policyQualifiers(): Any? = unwrap(this).getPolicyQualifiers()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PolicyInformationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificate.PolicyInformationProperty):
          PolicyInformationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PolicyInformationProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificate.PolicyInformationProperty = (wrapped
          as Wrapper).cdkObject
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
      public fun commonName(commonName: String) {
      }

      public fun country(country: String) {
      }

      public fun customAttributes(customAttributes: IResolvable) {
      }

      public fun customAttributes(customAttributes: List<Any>) {
      }

      public fun distinguishedNameQualifier(distinguishedNameQualifier: String) {
      }

      public fun generationQualifier(generationQualifier: String) {
      }

      public fun givenName(givenName: String) {
      }

      public fun initials(initials: String) {
      }

      public fun locality(locality: String) {
      }

      public fun organization(organization: String) {
      }

      public fun organizationalUnit(organizationalUnit: String) {
      }

      public fun pseudonym(pseudonym: String) {
      }

      public fun serialNumber(serialNumber: String) {
      }

      public fun state(state: String) {
      }

      public fun surname(surname: String) {
      }

      public fun title(title: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificate.SubjectProperty.Builder =
          software.amazon.awscdk.services.acmpca.CfnCertificate.SubjectProperty.builder()

      public override fun commonName(commonName: String) {
        cdkBuilder.commonName(commonName)
      }

      public override fun country(country: String) {
        cdkBuilder.country(country)
      }

      public override fun customAttributes(customAttributes: IResolvable) {
        cdkBuilder.customAttributes(customAttributes.let(IResolvable::unwrap))
      }

      public override fun customAttributes(customAttributes: List<Any>) {
        cdkBuilder.customAttributes(customAttributes)
      }

      public override fun distinguishedNameQualifier(distinguishedNameQualifier: String) {
        cdkBuilder.distinguishedNameQualifier(distinguishedNameQualifier)
      }

      public override fun generationQualifier(generationQualifier: String) {
        cdkBuilder.generationQualifier(generationQualifier)
      }

      public override fun givenName(givenName: String) {
        cdkBuilder.givenName(givenName)
      }

      public override fun initials(initials: String) {
        cdkBuilder.initials(initials)
      }

      public override fun locality(locality: String) {
        cdkBuilder.locality(locality)
      }

      public override fun organization(organization: String) {
        cdkBuilder.organization(organization)
      }

      public override fun organizationalUnit(organizationalUnit: String) {
        cdkBuilder.organizationalUnit(organizationalUnit)
      }

      public override fun pseudonym(pseudonym: String) {
        cdkBuilder.pseudonym(pseudonym)
      }

      public override fun serialNumber(serialNumber: String) {
        cdkBuilder.serialNumber(serialNumber)
      }

      public override fun state(state: String) {
        cdkBuilder.state(state)
      }

      public override fun surname(surname: String) {
        cdkBuilder.surname(surname)
      }

      public override fun title(title: String) {
        cdkBuilder.title(title)
      }

      public fun build(): software.amazon.awscdk.services.acmpca.CfnCertificate.SubjectProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificate.SubjectProperty,
    ) : SubjectProperty {
      public override fun commonName(): String? = unwrap(this).getCommonName()

      public override fun country(): String? = unwrap(this).getCountry()

      public override fun customAttributes(): Any? = unwrap(this).getCustomAttributes()

      public override fun distinguishedNameQualifier(): String? =
          unwrap(this).getDistinguishedNameQualifier()

      public override fun generationQualifier(): String? = unwrap(this).getGenerationQualifier()

      public override fun givenName(): String? = unwrap(this).getGivenName()

      public override fun initials(): String? = unwrap(this).getInitials()

      public override fun locality(): String? = unwrap(this).getLocality()

      public override fun organization(): String? = unwrap(this).getOrganization()

      public override fun organizationalUnit(): String? = unwrap(this).getOrganizationalUnit()

      public override fun pseudonym(): String? = unwrap(this).getPseudonym()

      public override fun serialNumber(): String? = unwrap(this).getSerialNumber()

      public override fun state(): String? = unwrap(this).getState()

      public override fun surname(): String? = unwrap(this).getSurname()

      public override fun title(): String? = unwrap(this).getTitle()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SubjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificate.SubjectProperty):
          SubjectProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SubjectProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificate.SubjectProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface PolicyQualifierInfoProperty {
    public fun policyQualifierId(): String

    public fun qualifier(): Any

    public interface Builder {
      public fun policyQualifierId(policyQualifierId: String) {
      }

      public fun qualifier(qualifier: IResolvable) {
      }

      public fun qualifier(qualifier: QualifierProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8ee9cc5d6a73f316af21c3d09037a6a30842ae9ad855c30559512fada499d86a")
      public fun qualifier(qualifier: QualifierProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificate.PolicyQualifierInfoProperty.Builder
          =
          software.amazon.awscdk.services.acmpca.CfnCertificate.PolicyQualifierInfoProperty.builder()

      public override fun policyQualifierId(policyQualifierId: String) {
        cdkBuilder.policyQualifierId(policyQualifierId)
      }

      public override fun qualifier(qualifier: IResolvable) {
        cdkBuilder.qualifier(qualifier.let(IResolvable::unwrap))
      }

      public override fun qualifier(qualifier: QualifierProperty) {
        cdkBuilder.qualifier(qualifier.let(QualifierProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8ee9cc5d6a73f316af21c3d09037a6a30842ae9ad855c30559512fada499d86a")
      public override fun qualifier(qualifier: QualifierProperty.Builder.() -> Unit): Unit =
          qualifier(QualifierProperty(qualifier))

      public fun build():
          software.amazon.awscdk.services.acmpca.CfnCertificate.PolicyQualifierInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificate.PolicyQualifierInfoProperty,
    ) : PolicyQualifierInfoProperty {
      public override fun policyQualifierId(): String = unwrap(this).getPolicyQualifierId()

      public override fun qualifier(): Any = unwrap(this).getQualifier()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PolicyQualifierInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificate.PolicyQualifierInfoProperty):
          PolicyQualifierInfoProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PolicyQualifierInfoProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificate.PolicyQualifierInfoProperty =
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
      public fun directoryName(directoryName: IResolvable) {
      }

      public fun directoryName(directoryName: SubjectProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("96b850009393b18157988126a30febc9603e07c94088e24394c1d0568c06bd3e")
      public fun directoryName(directoryName: SubjectProperty.Builder.() -> Unit) {
      }

      public fun dnsName(dnsName: String) {
      }

      public fun ediPartyName(ediPartyName: IResolvable) {
      }

      public fun ediPartyName(ediPartyName: EdiPartyNameProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e8f9859ee6c7e211c3066fc9466926f9f9403e42f2c69f794333b0ed6fe97aa6")
      public fun ediPartyName(ediPartyName: EdiPartyNameProperty.Builder.() -> Unit) {
      }

      public fun ipAddress(ipAddress: String) {
      }

      public fun otherName(otherName: IResolvable) {
      }

      public fun otherName(otherName: OtherNameProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a26c7790fb156970216368ee9c7f92b35bf5d47e6291f46ff359bcc77c84b626")
      public fun otherName(otherName: OtherNameProperty.Builder.() -> Unit) {
      }

      public fun registeredId(registeredId: String) {
      }

      public fun rfc822Name(rfc822Name: String) {
      }

      public fun uniformResourceIdentifier(uniformResourceIdentifier: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificate.GeneralNameProperty.Builder =
          software.amazon.awscdk.services.acmpca.CfnCertificate.GeneralNameProperty.builder()

      public override fun directoryName(directoryName: IResolvable) {
        cdkBuilder.directoryName(directoryName.let(IResolvable::unwrap))
      }

      public override fun directoryName(directoryName: SubjectProperty) {
        cdkBuilder.directoryName(directoryName.let(SubjectProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("96b850009393b18157988126a30febc9603e07c94088e24394c1d0568c06bd3e")
      public override fun directoryName(directoryName: SubjectProperty.Builder.() -> Unit): Unit =
          directoryName(SubjectProperty(directoryName))

      public override fun dnsName(dnsName: String) {
        cdkBuilder.dnsName(dnsName)
      }

      public override fun ediPartyName(ediPartyName: IResolvable) {
        cdkBuilder.ediPartyName(ediPartyName.let(IResolvable::unwrap))
      }

      public override fun ediPartyName(ediPartyName: EdiPartyNameProperty) {
        cdkBuilder.ediPartyName(ediPartyName.let(EdiPartyNameProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e8f9859ee6c7e211c3066fc9466926f9f9403e42f2c69f794333b0ed6fe97aa6")
      public override fun ediPartyName(ediPartyName: EdiPartyNameProperty.Builder.() -> Unit): Unit
          = ediPartyName(EdiPartyNameProperty(ediPartyName))

      public override fun ipAddress(ipAddress: String) {
        cdkBuilder.ipAddress(ipAddress)
      }

      public override fun otherName(otherName: IResolvable) {
        cdkBuilder.otherName(otherName.let(IResolvable::unwrap))
      }

      public override fun otherName(otherName: OtherNameProperty) {
        cdkBuilder.otherName(otherName.let(OtherNameProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a26c7790fb156970216368ee9c7f92b35bf5d47e6291f46ff359bcc77c84b626")
      public override fun otherName(otherName: OtherNameProperty.Builder.() -> Unit): Unit =
          otherName(OtherNameProperty(otherName))

      public override fun registeredId(registeredId: String) {
        cdkBuilder.registeredId(registeredId)
      }

      public override fun rfc822Name(rfc822Name: String) {
        cdkBuilder.rfc822Name(rfc822Name)
      }

      public override fun uniformResourceIdentifier(uniformResourceIdentifier: String) {
        cdkBuilder.uniformResourceIdentifier(uniformResourceIdentifier)
      }

      public fun build(): software.amazon.awscdk.services.acmpca.CfnCertificate.GeneralNameProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificate.GeneralNameProperty,
    ) : GeneralNameProperty {
      public override fun directoryName(): Any? = unwrap(this).getDirectoryName()

      public override fun dnsName(): String? = unwrap(this).getDnsName()

      public override fun ediPartyName(): Any? = unwrap(this).getEdiPartyName()

      public override fun ipAddress(): String? = unwrap(this).getIpAddress()

      public override fun otherName(): Any? = unwrap(this).getOtherName()

      public override fun registeredId(): String? = unwrap(this).getRegisteredId()

      public override fun rfc822Name(): String? = unwrap(this).getRfc822Name()

      public override fun uniformResourceIdentifier(): String? =
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
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificate.GeneralNameProperty):
          GeneralNameProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GeneralNameProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificate.GeneralNameProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EdiPartyNameProperty {
    public fun nameAssigner(): String

    public fun partyName(): String

    public interface Builder {
      public fun nameAssigner(nameAssigner: String) {
      }

      public fun partyName(partyName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificate.EdiPartyNameProperty.Builder =
          software.amazon.awscdk.services.acmpca.CfnCertificate.EdiPartyNameProperty.builder()

      public override fun nameAssigner(nameAssigner: String) {
        cdkBuilder.nameAssigner(nameAssigner)
      }

      public override fun partyName(partyName: String) {
        cdkBuilder.partyName(partyName)
      }

      public fun build(): software.amazon.awscdk.services.acmpca.CfnCertificate.EdiPartyNameProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificate.EdiPartyNameProperty,
    ) : EdiPartyNameProperty {
      public override fun nameAssigner(): String = unwrap(this).getNameAssigner()

      public override fun partyName(): String = unwrap(this).getPartyName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EdiPartyNameProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificate.EdiPartyNameProperty):
          EdiPartyNameProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EdiPartyNameProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificate.EdiPartyNameProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CustomExtensionProperty {
    public fun critical(): Any? = unwrap(this).getCritical()

    public fun objectIdentifier(): String

    public fun `value`(): String

    public interface Builder {
      public fun critical(critical: Boolean) {
      }

      public fun critical(critical: IResolvable) {
      }

      public fun objectIdentifier(objectIdentifier: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificate.CustomExtensionProperty.Builder =
          software.amazon.awscdk.services.acmpca.CfnCertificate.CustomExtensionProperty.builder()

      public override fun critical(critical: Boolean) {
        cdkBuilder.critical(critical)
      }

      public override fun critical(critical: IResolvable) {
        cdkBuilder.critical(critical.let(IResolvable::unwrap))
      }

      public override fun objectIdentifier(objectIdentifier: String) {
        cdkBuilder.objectIdentifier(objectIdentifier)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.acmpca.CfnCertificate.CustomExtensionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificate.CustomExtensionProperty,
    ) : CustomExtensionProperty {
      public override fun critical(): Any? = unwrap(this).getCritical()

      public override fun objectIdentifier(): String = unwrap(this).getObjectIdentifier()

      public override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CustomExtensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificate.CustomExtensionProperty):
          CustomExtensionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomExtensionProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificate.CustomExtensionProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ApiPassthroughProperty {
    public fun extensions(): Any? = unwrap(this).getExtensions()

    public fun subject(): Any? = unwrap(this).getSubject()

    public interface Builder {
      public fun extensions(extensions: IResolvable) {
      }

      public fun extensions(extensions: ExtensionsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("737c1adb62e6848e2a5f445164e3c36994488e6feea295330c4dcc0fb119bb4d")
      public fun extensions(extensions: ExtensionsProperty.Builder.() -> Unit) {
      }

      public fun subject(subject: IResolvable) {
      }

      public fun subject(subject: SubjectProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f3305f385f07191a605279b3db7c1e906d8d10c24265cc76c3142c585c3d0ffd")
      public fun subject(subject: SubjectProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificate.ApiPassthroughProperty.Builder =
          software.amazon.awscdk.services.acmpca.CfnCertificate.ApiPassthroughProperty.builder()

      public override fun extensions(extensions: IResolvable) {
        cdkBuilder.extensions(extensions.let(IResolvable::unwrap))
      }

      public override fun extensions(extensions: ExtensionsProperty) {
        cdkBuilder.extensions(extensions.let(ExtensionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("737c1adb62e6848e2a5f445164e3c36994488e6feea295330c4dcc0fb119bb4d")
      public override fun extensions(extensions: ExtensionsProperty.Builder.() -> Unit): Unit =
          extensions(ExtensionsProperty(extensions))

      public override fun subject(subject: IResolvable) {
        cdkBuilder.subject(subject.let(IResolvable::unwrap))
      }

      public override fun subject(subject: SubjectProperty) {
        cdkBuilder.subject(subject.let(SubjectProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f3305f385f07191a605279b3db7c1e906d8d10c24265cc76c3142c585c3d0ffd")
      public override fun subject(subject: SubjectProperty.Builder.() -> Unit): Unit =
          subject(SubjectProperty(subject))

      public fun build():
          software.amazon.awscdk.services.acmpca.CfnCertificate.ApiPassthroughProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificate.ApiPassthroughProperty,
    ) : ApiPassthroughProperty {
      public override fun extensions(): Any? = unwrap(this).getExtensions()

      public override fun subject(): Any? = unwrap(this).getSubject()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ApiPassthroughProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificate.ApiPassthroughProperty):
          ApiPassthroughProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApiPassthroughProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificate.ApiPassthroughProperty = (wrapped as
          Wrapper).cdkObject
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
      public fun crlSign(crlSign: Boolean) {
      }

      public fun crlSign(crlSign: IResolvable) {
      }

      public fun dataEncipherment(dataEncipherment: Boolean) {
      }

      public fun dataEncipherment(dataEncipherment: IResolvable) {
      }

      public fun decipherOnly(decipherOnly: Boolean) {
      }

      public fun decipherOnly(decipherOnly: IResolvable) {
      }

      public fun digitalSignature(digitalSignature: Boolean) {
      }

      public fun digitalSignature(digitalSignature: IResolvable) {
      }

      public fun encipherOnly(encipherOnly: Boolean) {
      }

      public fun encipherOnly(encipherOnly: IResolvable) {
      }

      public fun keyAgreement(keyAgreement: Boolean) {
      }

      public fun keyAgreement(keyAgreement: IResolvable) {
      }

      public fun keyCertSign(keyCertSign: Boolean) {
      }

      public fun keyCertSign(keyCertSign: IResolvable) {
      }

      public fun keyEncipherment(keyEncipherment: Boolean) {
      }

      public fun keyEncipherment(keyEncipherment: IResolvable) {
      }

      public fun nonRepudiation(nonRepudiation: Boolean) {
      }

      public fun nonRepudiation(nonRepudiation: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificate.KeyUsageProperty.Builder =
          software.amazon.awscdk.services.acmpca.CfnCertificate.KeyUsageProperty.builder()

      public override fun crlSign(crlSign: Boolean) {
        cdkBuilder.crlSign(crlSign)
      }

      public override fun crlSign(crlSign: IResolvable) {
        cdkBuilder.crlSign(crlSign.let(IResolvable::unwrap))
      }

      public override fun dataEncipherment(dataEncipherment: Boolean) {
        cdkBuilder.dataEncipherment(dataEncipherment)
      }

      public override fun dataEncipherment(dataEncipherment: IResolvable) {
        cdkBuilder.dataEncipherment(dataEncipherment.let(IResolvable::unwrap))
      }

      public override fun decipherOnly(decipherOnly: Boolean) {
        cdkBuilder.decipherOnly(decipherOnly)
      }

      public override fun decipherOnly(decipherOnly: IResolvable) {
        cdkBuilder.decipherOnly(decipherOnly.let(IResolvable::unwrap))
      }

      public override fun digitalSignature(digitalSignature: Boolean) {
        cdkBuilder.digitalSignature(digitalSignature)
      }

      public override fun digitalSignature(digitalSignature: IResolvable) {
        cdkBuilder.digitalSignature(digitalSignature.let(IResolvable::unwrap))
      }

      public override fun encipherOnly(encipherOnly: Boolean) {
        cdkBuilder.encipherOnly(encipherOnly)
      }

      public override fun encipherOnly(encipherOnly: IResolvable) {
        cdkBuilder.encipherOnly(encipherOnly.let(IResolvable::unwrap))
      }

      public override fun keyAgreement(keyAgreement: Boolean) {
        cdkBuilder.keyAgreement(keyAgreement)
      }

      public override fun keyAgreement(keyAgreement: IResolvable) {
        cdkBuilder.keyAgreement(keyAgreement.let(IResolvable::unwrap))
      }

      public override fun keyCertSign(keyCertSign: Boolean) {
        cdkBuilder.keyCertSign(keyCertSign)
      }

      public override fun keyCertSign(keyCertSign: IResolvable) {
        cdkBuilder.keyCertSign(keyCertSign.let(IResolvable::unwrap))
      }

      public override fun keyEncipherment(keyEncipherment: Boolean) {
        cdkBuilder.keyEncipherment(keyEncipherment)
      }

      public override fun keyEncipherment(keyEncipherment: IResolvable) {
        cdkBuilder.keyEncipherment(keyEncipherment.let(IResolvable::unwrap))
      }

      public override fun nonRepudiation(nonRepudiation: Boolean) {
        cdkBuilder.nonRepudiation(nonRepudiation)
      }

      public override fun nonRepudiation(nonRepudiation: IResolvable) {
        cdkBuilder.nonRepudiation(nonRepudiation.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.acmpca.CfnCertificate.KeyUsageProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificate.KeyUsageProperty,
    ) : KeyUsageProperty {
      public override fun crlSign(): Any? = unwrap(this).getCrlSign()

      public override fun dataEncipherment(): Any? = unwrap(this).getDataEncipherment()

      public override fun decipherOnly(): Any? = unwrap(this).getDecipherOnly()

      public override fun digitalSignature(): Any? = unwrap(this).getDigitalSignature()

      public override fun encipherOnly(): Any? = unwrap(this).getEncipherOnly()

      public override fun keyAgreement(): Any? = unwrap(this).getKeyAgreement()

      public override fun keyCertSign(): Any? = unwrap(this).getKeyCertSign()

      public override fun keyEncipherment(): Any? = unwrap(this).getKeyEncipherment()

      public override fun nonRepudiation(): Any? = unwrap(this).getNonRepudiation()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KeyUsageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificate.KeyUsageProperty):
          KeyUsageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KeyUsageProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificate.KeyUsageProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CustomAttributeProperty {
    public fun objectIdentifier(): String

    public fun `value`(): String

    public interface Builder {
      public fun objectIdentifier(objectIdentifier: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificate.CustomAttributeProperty.Builder =
          software.amazon.awscdk.services.acmpca.CfnCertificate.CustomAttributeProperty.builder()

      public override fun objectIdentifier(objectIdentifier: String) {
        cdkBuilder.objectIdentifier(objectIdentifier)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.acmpca.CfnCertificate.CustomAttributeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificate.CustomAttributeProperty,
    ) : CustomAttributeProperty {
      public override fun objectIdentifier(): String = unwrap(this).getObjectIdentifier()

      public override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CustomAttributeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificate.CustomAttributeProperty):
          CustomAttributeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomAttributeProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificate.CustomAttributeProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ExtensionsProperty {
    public fun certificatePolicies(): Any? = unwrap(this).getCertificatePolicies()

    public fun customExtensions(): Any? = unwrap(this).getCustomExtensions()

    public fun extendedKeyUsage(): Any? = unwrap(this).getExtendedKeyUsage()

    public fun keyUsage(): Any? = unwrap(this).getKeyUsage()

    public fun subjectAlternativeNames(): Any? = unwrap(this).getSubjectAlternativeNames()

    public interface Builder {
      public fun certificatePolicies(certificatePolicies: IResolvable) {
      }

      public fun certificatePolicies(certificatePolicies: List<Any>) {
      }

      public fun customExtensions(customExtensions: IResolvable) {
      }

      public fun customExtensions(customExtensions: List<Any>) {
      }

      public fun extendedKeyUsage(extendedKeyUsage: IResolvable) {
      }

      public fun extendedKeyUsage(extendedKeyUsage: List<Any>) {
      }

      public fun keyUsage(keyUsage: IResolvable) {
      }

      public fun keyUsage(keyUsage: KeyUsageProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("54805af00844784ad9ab9b73287f368f891631f66e0dfcec483a64c96173c64d")
      public fun keyUsage(keyUsage: KeyUsageProperty.Builder.() -> Unit) {
      }

      public fun subjectAlternativeNames(subjectAlternativeNames: IResolvable) {
      }

      public fun subjectAlternativeNames(subjectAlternativeNames: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificate.ExtensionsProperty.Builder =
          software.amazon.awscdk.services.acmpca.CfnCertificate.ExtensionsProperty.builder()

      public override fun certificatePolicies(certificatePolicies: IResolvable) {
        cdkBuilder.certificatePolicies(certificatePolicies.let(IResolvable::unwrap))
      }

      public override fun certificatePolicies(certificatePolicies: List<Any>) {
        cdkBuilder.certificatePolicies(certificatePolicies)
      }

      public override fun customExtensions(customExtensions: IResolvable) {
        cdkBuilder.customExtensions(customExtensions.let(IResolvable::unwrap))
      }

      public override fun customExtensions(customExtensions: List<Any>) {
        cdkBuilder.customExtensions(customExtensions)
      }

      public override fun extendedKeyUsage(extendedKeyUsage: IResolvable) {
        cdkBuilder.extendedKeyUsage(extendedKeyUsage.let(IResolvable::unwrap))
      }

      public override fun extendedKeyUsage(extendedKeyUsage: List<Any>) {
        cdkBuilder.extendedKeyUsage(extendedKeyUsage)
      }

      public override fun keyUsage(keyUsage: IResolvable) {
        cdkBuilder.keyUsage(keyUsage.let(IResolvable::unwrap))
      }

      public override fun keyUsage(keyUsage: KeyUsageProperty) {
        cdkBuilder.keyUsage(keyUsage.let(KeyUsageProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("54805af00844784ad9ab9b73287f368f891631f66e0dfcec483a64c96173c64d")
      public override fun keyUsage(keyUsage: KeyUsageProperty.Builder.() -> Unit): Unit =
          keyUsage(KeyUsageProperty(keyUsage))

      public override fun subjectAlternativeNames(subjectAlternativeNames: IResolvable) {
        cdkBuilder.subjectAlternativeNames(subjectAlternativeNames.let(IResolvable::unwrap))
      }

      public override fun subjectAlternativeNames(subjectAlternativeNames: List<Any>) {
        cdkBuilder.subjectAlternativeNames(subjectAlternativeNames)
      }

      public fun build(): software.amazon.awscdk.services.acmpca.CfnCertificate.ExtensionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificate.ExtensionsProperty,
    ) : ExtensionsProperty {
      public override fun certificatePolicies(): Any? = unwrap(this).getCertificatePolicies()

      public override fun customExtensions(): Any? = unwrap(this).getCustomExtensions()

      public override fun extendedKeyUsage(): Any? = unwrap(this).getExtendedKeyUsage()

      public override fun keyUsage(): Any? = unwrap(this).getKeyUsage()

      public override fun subjectAlternativeNames(): Any? =
          unwrap(this).getSubjectAlternativeNames()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ExtensionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificate.ExtensionsProperty):
          ExtensionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExtensionsProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificate.ExtensionsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ExtendedKeyUsageProperty {
    public fun extendedKeyUsageObjectIdentifier(): String? =
        unwrap(this).getExtendedKeyUsageObjectIdentifier()

    public fun extendedKeyUsageType(): String? = unwrap(this).getExtendedKeyUsageType()

    public interface Builder {
      public fun extendedKeyUsageObjectIdentifier(extendedKeyUsageObjectIdentifier: String) {
      }

      public fun extendedKeyUsageType(extendedKeyUsageType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificate.ExtendedKeyUsageProperty.Builder =
          software.amazon.awscdk.services.acmpca.CfnCertificate.ExtendedKeyUsageProperty.builder()

      public override
          fun extendedKeyUsageObjectIdentifier(extendedKeyUsageObjectIdentifier: String) {
        cdkBuilder.extendedKeyUsageObjectIdentifier(extendedKeyUsageObjectIdentifier)
      }

      public override fun extendedKeyUsageType(extendedKeyUsageType: String) {
        cdkBuilder.extendedKeyUsageType(extendedKeyUsageType)
      }

      public fun build():
          software.amazon.awscdk.services.acmpca.CfnCertificate.ExtendedKeyUsageProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificate.ExtendedKeyUsageProperty,
    ) : ExtendedKeyUsageProperty {
      public override fun extendedKeyUsageObjectIdentifier(): String? =
          unwrap(this).getExtendedKeyUsageObjectIdentifier()

      public override fun extendedKeyUsageType(): String? = unwrap(this).getExtendedKeyUsageType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ExtendedKeyUsageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificate.ExtendedKeyUsageProperty):
          ExtendedKeyUsageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExtendedKeyUsageProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificate.ExtendedKeyUsageProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface QualifierProperty {
    public fun cpsUri(): String

    public interface Builder {
      public fun cpsUri(cpsUri: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificate.QualifierProperty.Builder =
          software.amazon.awscdk.services.acmpca.CfnCertificate.QualifierProperty.builder()

      public override fun cpsUri(cpsUri: String) {
        cdkBuilder.cpsUri(cpsUri)
      }

      public fun build(): software.amazon.awscdk.services.acmpca.CfnCertificate.QualifierProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificate.QualifierProperty,
    ) : QualifierProperty {
      public override fun cpsUri(): String = unwrap(this).getCpsUri()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): QualifierProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificate.QualifierProperty):
          QualifierProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: QualifierProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificate.QualifierProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface OtherNameProperty {
    public fun typeId(): String

    public fun `value`(): String

    public interface Builder {
      public fun typeId(typeId: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificate.OtherNameProperty.Builder =
          software.amazon.awscdk.services.acmpca.CfnCertificate.OtherNameProperty.builder()

      public override fun typeId(typeId: String) {
        cdkBuilder.typeId(typeId)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.acmpca.CfnCertificate.OtherNameProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificate.OtherNameProperty,
    ) : OtherNameProperty {
      public override fun typeId(): String = unwrap(this).getTypeId()

      public override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OtherNameProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificate.OtherNameProperty):
          OtherNameProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OtherNameProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificate.OtherNameProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ValidityProperty {
    public fun type(): String

    public fun `value`(): Number

    public interface Builder {
      public fun type(type: String) {
      }

      public fun `value`(`value`: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificate.ValidityProperty.Builder =
          software.amazon.awscdk.services.acmpca.CfnCertificate.ValidityProperty.builder()

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.acmpca.CfnCertificate.ValidityProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificate.ValidityProperty,
    ) : ValidityProperty {
      public override fun type(): String = unwrap(this).getType()

      public override fun `value`(): Number = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ValidityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificate.ValidityProperty):
          ValidityProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ValidityProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificate.ValidityProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
