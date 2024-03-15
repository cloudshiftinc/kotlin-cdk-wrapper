@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pcaconnectorad

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTemplate internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrTemplateArn(): String = unwrap(this).getAttrTemplateArn()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun connectorArn(): String = unwrap(this).getConnectorArn()

  public open fun connectorArn(`value`: String) {
    unwrap(this).setConnectorArn(`value`)
  }

  public open fun definition(): Any = unwrap(this).getDefinition()

  public open fun definition(`value`: IResolvable) {
    unwrap(this).setDefinition(`value`.let(IResolvable::unwrap))
  }

  public open fun definition(`value`: TemplateDefinitionProperty) {
    unwrap(this).setDefinition(`value`.let(TemplateDefinitionProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1a945e718eb9858d45f14af1ebccdba3cdd6a3f1bf515eb44c6f3d126a0ea02a")
  public open fun definition(`value`: TemplateDefinitionProperty.Builder.() -> Unit): Unit =
      definition(TemplateDefinitionProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun reenrollAllCertificateHolders(): Any? =
      unwrap(this).getReenrollAllCertificateHolders()

  public open fun reenrollAllCertificateHolders(`value`: Boolean) {
    unwrap(this).setReenrollAllCertificateHolders(`value`)
  }

  public open fun reenrollAllCertificateHolders(`value`: IResolvable) {
    unwrap(this).setReenrollAllCertificateHolders(`value`.let(IResolvable::unwrap))
  }

  public open fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public open fun tags(`value`: Map<String, String>) {
    unwrap(this).setTags(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun connectorArn(connectorArn: String)

    public fun definition(definition: IResolvable)

    public fun definition(definition: TemplateDefinitionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cef2610f97300dba7dafb1ad089a958eae72f1f84cf52f8f01ac23b494d60356")
    public fun definition(definition: TemplateDefinitionProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun reenrollAllCertificateHolders(reenrollAllCertificateHolders: Boolean)

    public fun reenrollAllCertificateHolders(reenrollAllCertificateHolders: IResolvable)

    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.Builder =
        software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.Builder.create(scope, id)

    override fun connectorArn(connectorArn: String) {
      cdkBuilder.connectorArn(connectorArn)
    }

    override fun definition(definition: IResolvable) {
      cdkBuilder.definition(definition.let(IResolvable::unwrap))
    }

    override fun definition(definition: TemplateDefinitionProperty) {
      cdkBuilder.definition(definition.let(TemplateDefinitionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cef2610f97300dba7dafb1ad089a958eae72f1f84cf52f8f01ac23b494d60356")
    override fun definition(definition: TemplateDefinitionProperty.Builder.() -> Unit): Unit =
        definition(TemplateDefinitionProperty(definition))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun reenrollAllCertificateHolders(reenrollAllCertificateHolders: Boolean) {
      cdkBuilder.reenrollAllCertificateHolders(reenrollAllCertificateHolders)
    }

    override fun reenrollAllCertificateHolders(reenrollAllCertificateHolders: IResolvable) {
      cdkBuilder.reenrollAllCertificateHolders(reenrollAllCertificateHolders.let(IResolvable::unwrap))
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.pcaconnectorad.CfnTemplate =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTemplate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTemplate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate):
        CfnTemplate = CfnTemplate(cdkObject)

    internal fun unwrap(wrapped: CfnTemplate):
        software.amazon.awscdk.services.pcaconnectorad.CfnTemplate = wrapped.cdkObject
  }

  public interface ExtensionsV3Property {
    public fun applicationPolicies(): Any? = unwrap(this).getApplicationPolicies()

    public fun keyUsage(): Any

    @CdkDslMarker
    public interface Builder {
      public fun applicationPolicies(applicationPolicies: IResolvable)

      public fun applicationPolicies(applicationPolicies: ApplicationPoliciesProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8201469e5ac85f25a2c135e7e4ed5c98b23b3a388d059e52d970ec6e4eed8bed")
      public
          fun applicationPolicies(applicationPolicies: ApplicationPoliciesProperty.Builder.() -> Unit)

      public fun keyUsage(keyUsage: IResolvable)

      public fun keyUsage(keyUsage: KeyUsageProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8fdb8ba610d030b037f4ef5b4054447e0abc901ccda837564f1317f8515adc8d")
      public fun keyUsage(keyUsage: KeyUsageProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ExtensionsV3Property.Builder =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ExtensionsV3Property.builder()

      override fun applicationPolicies(applicationPolicies: IResolvable) {
        cdkBuilder.applicationPolicies(applicationPolicies.let(IResolvable::unwrap))
      }

      override fun applicationPolicies(applicationPolicies: ApplicationPoliciesProperty) {
        cdkBuilder.applicationPolicies(applicationPolicies.let(ApplicationPoliciesProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8201469e5ac85f25a2c135e7e4ed5c98b23b3a388d059e52d970ec6e4eed8bed")
      override
          fun applicationPolicies(applicationPolicies: ApplicationPoliciesProperty.Builder.() -> Unit):
          Unit = applicationPolicies(ApplicationPoliciesProperty(applicationPolicies))

      override fun keyUsage(keyUsage: IResolvable) {
        cdkBuilder.keyUsage(keyUsage.let(IResolvable::unwrap))
      }

      override fun keyUsage(keyUsage: KeyUsageProperty) {
        cdkBuilder.keyUsage(keyUsage.let(KeyUsageProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8fdb8ba610d030b037f4ef5b4054447e0abc901ccda837564f1317f8515adc8d")
      override fun keyUsage(keyUsage: KeyUsageProperty.Builder.() -> Unit): Unit =
          keyUsage(KeyUsageProperty(keyUsage))

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ExtensionsV3Property =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ExtensionsV3Property,
    ) : CdkObject(cdkObject), ExtensionsV3Property {
      override fun applicationPolicies(): Any? = unwrap(this).getApplicationPolicies()

      override fun keyUsage(): Any = unwrap(this).getKeyUsage()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ExtensionsV3Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ExtensionsV3Property):
          ExtensionsV3Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExtensionsV3Property):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ExtensionsV3Property = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ExtensionsV3Property
    }
  }

  public interface KeyUsageFlagsProperty {
    public fun dataEncipherment(): Any? = unwrap(this).getDataEncipherment()

    public fun digitalSignature(): Any? = unwrap(this).getDigitalSignature()

    public fun keyAgreement(): Any? = unwrap(this).getKeyAgreement()

    public fun keyEncipherment(): Any? = unwrap(this).getKeyEncipherment()

    public fun nonRepudiation(): Any? = unwrap(this).getNonRepudiation()

    @CdkDslMarker
    public interface Builder {
      public fun dataEncipherment(dataEncipherment: Boolean)

      public fun dataEncipherment(dataEncipherment: IResolvable)

      public fun digitalSignature(digitalSignature: Boolean)

      public fun digitalSignature(digitalSignature: IResolvable)

      public fun keyAgreement(keyAgreement: Boolean)

      public fun keyAgreement(keyAgreement: IResolvable)

      public fun keyEncipherment(keyEncipherment: Boolean)

      public fun keyEncipherment(keyEncipherment: IResolvable)

      public fun nonRepudiation(nonRepudiation: Boolean)

      public fun nonRepudiation(nonRepudiation: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsageFlagsProperty.Builder =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsageFlagsProperty.builder()

      override fun dataEncipherment(dataEncipherment: Boolean) {
        cdkBuilder.dataEncipherment(dataEncipherment)
      }

      override fun dataEncipherment(dataEncipherment: IResolvable) {
        cdkBuilder.dataEncipherment(dataEncipherment.let(IResolvable::unwrap))
      }

      override fun digitalSignature(digitalSignature: Boolean) {
        cdkBuilder.digitalSignature(digitalSignature)
      }

      override fun digitalSignature(digitalSignature: IResolvable) {
        cdkBuilder.digitalSignature(digitalSignature.let(IResolvable::unwrap))
      }

      override fun keyAgreement(keyAgreement: Boolean) {
        cdkBuilder.keyAgreement(keyAgreement)
      }

      override fun keyAgreement(keyAgreement: IResolvable) {
        cdkBuilder.keyAgreement(keyAgreement.let(IResolvable::unwrap))
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
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsageFlagsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsageFlagsProperty,
    ) : CdkObject(cdkObject), KeyUsageFlagsProperty {
      override fun dataEncipherment(): Any? = unwrap(this).getDataEncipherment()

      override fun digitalSignature(): Any? = unwrap(this).getDigitalSignature()

      override fun keyAgreement(): Any? = unwrap(this).getKeyAgreement()

      override fun keyEncipherment(): Any? = unwrap(this).getKeyEncipherment()

      override fun nonRepudiation(): Any? = unwrap(this).getNonRepudiation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KeyUsageFlagsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsageFlagsProperty):
          KeyUsageFlagsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KeyUsageFlagsProperty):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsageFlagsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsageFlagsProperty
    }
  }

  public interface TemplateV2Property {
    public fun certificateValidity(): Any

    public fun enrollmentFlags(): Any

    public fun extensions(): Any

    public fun generalFlags(): Any

    public fun privateKeyAttributes(): Any

    public fun privateKeyFlags(): Any

    public fun subjectNameFlags(): Any

    public fun supersededTemplates(): List<String> = unwrap(this).getSupersededTemplates() ?:
        emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun certificateValidity(certificateValidity: IResolvable)

      public fun certificateValidity(certificateValidity: CertificateValidityProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f7ddf8a48640e737a7dfb8c01e91d6ec86073099caa5ab11876f97de1c9d158e")
      public
          fun certificateValidity(certificateValidity: CertificateValidityProperty.Builder.() -> Unit)

      public fun enrollmentFlags(enrollmentFlags: IResolvable)

      public fun enrollmentFlags(enrollmentFlags: EnrollmentFlagsV2Property)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2a1cd137d82b18c2e0e4e97700db5329cc81e74cfa8a4bf9419e1f91d4ea49c5")
      public fun enrollmentFlags(enrollmentFlags: EnrollmentFlagsV2Property.Builder.() -> Unit)

      public fun extensions(extensions: IResolvable)

      public fun extensions(extensions: ExtensionsV2Property)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb6ebcef6730c962cd58bb1186d3f8631c828df66203546ae139d1b2ccd20777")
      public fun extensions(extensions: ExtensionsV2Property.Builder.() -> Unit)

      public fun generalFlags(generalFlags: IResolvable)

      public fun generalFlags(generalFlags: GeneralFlagsV2Property)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d5bad24f0c50e9df1b3bbd2144d57cf0f6992496e2136c9734c09b1d0529f10")
      public fun generalFlags(generalFlags: GeneralFlagsV2Property.Builder.() -> Unit)

      public fun privateKeyAttributes(privateKeyAttributes: IResolvable)

      public fun privateKeyAttributes(privateKeyAttributes: PrivateKeyAttributesV2Property)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ba95fa0808a14ad4ce0aa08eca2cfa255df3a5ba6dfbdfb46b03028de13bc3de")
      public
          fun privateKeyAttributes(privateKeyAttributes: PrivateKeyAttributesV2Property.Builder.() -> Unit)

      public fun privateKeyFlags(privateKeyFlags: IResolvable)

      public fun privateKeyFlags(privateKeyFlags: PrivateKeyFlagsV2Property)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f2c5a481fc2c9f7b56b47b9c458feb8a9ff5f1a3a33ffac98279acb301662149")
      public fun privateKeyFlags(privateKeyFlags: PrivateKeyFlagsV2Property.Builder.() -> Unit)

      public fun subjectNameFlags(subjectNameFlags: IResolvable)

      public fun subjectNameFlags(subjectNameFlags: SubjectNameFlagsV2Property)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("83b125f0bd827f94cfd9493a0411c660dd8e0a0890d0b23276b036d39d32491a")
      public fun subjectNameFlags(subjectNameFlags: SubjectNameFlagsV2Property.Builder.() -> Unit)

      public fun supersededTemplates(supersededTemplates: List<String>)

      public fun supersededTemplates(vararg supersededTemplates: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateV2Property.Builder =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateV2Property.builder()

      override fun certificateValidity(certificateValidity: IResolvable) {
        cdkBuilder.certificateValidity(certificateValidity.let(IResolvable::unwrap))
      }

      override fun certificateValidity(certificateValidity: CertificateValidityProperty) {
        cdkBuilder.certificateValidity(certificateValidity.let(CertificateValidityProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f7ddf8a48640e737a7dfb8c01e91d6ec86073099caa5ab11876f97de1c9d158e")
      override
          fun certificateValidity(certificateValidity: CertificateValidityProperty.Builder.() -> Unit):
          Unit = certificateValidity(CertificateValidityProperty(certificateValidity))

      override fun enrollmentFlags(enrollmentFlags: IResolvable) {
        cdkBuilder.enrollmentFlags(enrollmentFlags.let(IResolvable::unwrap))
      }

      override fun enrollmentFlags(enrollmentFlags: EnrollmentFlagsV2Property) {
        cdkBuilder.enrollmentFlags(enrollmentFlags.let(EnrollmentFlagsV2Property::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2a1cd137d82b18c2e0e4e97700db5329cc81e74cfa8a4bf9419e1f91d4ea49c5")
      override fun enrollmentFlags(enrollmentFlags: EnrollmentFlagsV2Property.Builder.() -> Unit):
          Unit = enrollmentFlags(EnrollmentFlagsV2Property(enrollmentFlags))

      override fun extensions(extensions: IResolvable) {
        cdkBuilder.extensions(extensions.let(IResolvable::unwrap))
      }

      override fun extensions(extensions: ExtensionsV2Property) {
        cdkBuilder.extensions(extensions.let(ExtensionsV2Property::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb6ebcef6730c962cd58bb1186d3f8631c828df66203546ae139d1b2ccd20777")
      override fun extensions(extensions: ExtensionsV2Property.Builder.() -> Unit): Unit =
          extensions(ExtensionsV2Property(extensions))

      override fun generalFlags(generalFlags: IResolvable) {
        cdkBuilder.generalFlags(generalFlags.let(IResolvable::unwrap))
      }

      override fun generalFlags(generalFlags: GeneralFlagsV2Property) {
        cdkBuilder.generalFlags(generalFlags.let(GeneralFlagsV2Property::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d5bad24f0c50e9df1b3bbd2144d57cf0f6992496e2136c9734c09b1d0529f10")
      override fun generalFlags(generalFlags: GeneralFlagsV2Property.Builder.() -> Unit): Unit =
          generalFlags(GeneralFlagsV2Property(generalFlags))

      override fun privateKeyAttributes(privateKeyAttributes: IResolvable) {
        cdkBuilder.privateKeyAttributes(privateKeyAttributes.let(IResolvable::unwrap))
      }

      override fun privateKeyAttributes(privateKeyAttributes: PrivateKeyAttributesV2Property) {
        cdkBuilder.privateKeyAttributes(privateKeyAttributes.let(PrivateKeyAttributesV2Property::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ba95fa0808a14ad4ce0aa08eca2cfa255df3a5ba6dfbdfb46b03028de13bc3de")
      override
          fun privateKeyAttributes(privateKeyAttributes: PrivateKeyAttributesV2Property.Builder.() -> Unit):
          Unit = privateKeyAttributes(PrivateKeyAttributesV2Property(privateKeyAttributes))

      override fun privateKeyFlags(privateKeyFlags: IResolvable) {
        cdkBuilder.privateKeyFlags(privateKeyFlags.let(IResolvable::unwrap))
      }

      override fun privateKeyFlags(privateKeyFlags: PrivateKeyFlagsV2Property) {
        cdkBuilder.privateKeyFlags(privateKeyFlags.let(PrivateKeyFlagsV2Property::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f2c5a481fc2c9f7b56b47b9c458feb8a9ff5f1a3a33ffac98279acb301662149")
      override fun privateKeyFlags(privateKeyFlags: PrivateKeyFlagsV2Property.Builder.() -> Unit):
          Unit = privateKeyFlags(PrivateKeyFlagsV2Property(privateKeyFlags))

      override fun subjectNameFlags(subjectNameFlags: IResolvable) {
        cdkBuilder.subjectNameFlags(subjectNameFlags.let(IResolvable::unwrap))
      }

      override fun subjectNameFlags(subjectNameFlags: SubjectNameFlagsV2Property) {
        cdkBuilder.subjectNameFlags(subjectNameFlags.let(SubjectNameFlagsV2Property::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("83b125f0bd827f94cfd9493a0411c660dd8e0a0890d0b23276b036d39d32491a")
      override
          fun subjectNameFlags(subjectNameFlags: SubjectNameFlagsV2Property.Builder.() -> Unit):
          Unit = subjectNameFlags(SubjectNameFlagsV2Property(subjectNameFlags))

      override fun supersededTemplates(supersededTemplates: List<String>) {
        cdkBuilder.supersededTemplates(supersededTemplates)
      }

      override fun supersededTemplates(vararg supersededTemplates: String): Unit =
          supersededTemplates(supersededTemplates.toList())

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateV2Property =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateV2Property,
    ) : CdkObject(cdkObject), TemplateV2Property {
      override fun certificateValidity(): Any = unwrap(this).getCertificateValidity()

      override fun enrollmentFlags(): Any = unwrap(this).getEnrollmentFlags()

      override fun extensions(): Any = unwrap(this).getExtensions()

      override fun generalFlags(): Any = unwrap(this).getGeneralFlags()

      override fun privateKeyAttributes(): Any = unwrap(this).getPrivateKeyAttributes()

      override fun privateKeyFlags(): Any = unwrap(this).getPrivateKeyFlags()

      override fun subjectNameFlags(): Any = unwrap(this).getSubjectNameFlags()

      override fun supersededTemplates(): List<String> = unwrap(this).getSupersededTemplates() ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TemplateV2Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateV2Property):
          TemplateV2Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TemplateV2Property):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateV2Property = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateV2Property
    }
  }

  public interface KeyUsageProperty {
    public fun critical(): Any? = unwrap(this).getCritical()

    public fun usageFlags(): Any

    @CdkDslMarker
    public interface Builder {
      public fun critical(critical: Boolean)

      public fun critical(critical: IResolvable)

      public fun usageFlags(usageFlags: IResolvable)

      public fun usageFlags(usageFlags: KeyUsageFlagsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ad3e4f3b9ba170b2557434b15baa9537680ce57819b2f576d9ac89d90bd87379")
      public fun usageFlags(usageFlags: KeyUsageFlagsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsageProperty.Builder =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsageProperty.builder()

      override fun critical(critical: Boolean) {
        cdkBuilder.critical(critical)
      }

      override fun critical(critical: IResolvable) {
        cdkBuilder.critical(critical.let(IResolvable::unwrap))
      }

      override fun usageFlags(usageFlags: IResolvable) {
        cdkBuilder.usageFlags(usageFlags.let(IResolvable::unwrap))
      }

      override fun usageFlags(usageFlags: KeyUsageFlagsProperty) {
        cdkBuilder.usageFlags(usageFlags.let(KeyUsageFlagsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ad3e4f3b9ba170b2557434b15baa9537680ce57819b2f576d9ac89d90bd87379")
      override fun usageFlags(usageFlags: KeyUsageFlagsProperty.Builder.() -> Unit): Unit =
          usageFlags(KeyUsageFlagsProperty(usageFlags))

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsageProperty,
    ) : CdkObject(cdkObject), KeyUsageProperty {
      override fun critical(): Any? = unwrap(this).getCritical()

      override fun usageFlags(): Any = unwrap(this).getUsageFlags()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KeyUsageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsageProperty):
          KeyUsageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KeyUsageProperty):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsageProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsageProperty
    }
  }

  public interface TemplateV3Property {
    public fun certificateValidity(): Any

    public fun enrollmentFlags(): Any

    public fun extensions(): Any

    public fun generalFlags(): Any

    public fun hashAlgorithm(): String

    public fun privateKeyAttributes(): Any

    public fun privateKeyFlags(): Any

    public fun subjectNameFlags(): Any

    public fun supersededTemplates(): List<String> = unwrap(this).getSupersededTemplates() ?:
        emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun certificateValidity(certificateValidity: IResolvable)

      public fun certificateValidity(certificateValidity: CertificateValidityProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1b6b6939ffe11c55beac7c67c3b4879e5a1a4029250ca09537762918500b3ccc")
      public
          fun certificateValidity(certificateValidity: CertificateValidityProperty.Builder.() -> Unit)

      public fun enrollmentFlags(enrollmentFlags: IResolvable)

      public fun enrollmentFlags(enrollmentFlags: EnrollmentFlagsV3Property)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2387907f2e61871793058ad93675ef9449de1ad63481d0d6102b41edcd1993ae")
      public fun enrollmentFlags(enrollmentFlags: EnrollmentFlagsV3Property.Builder.() -> Unit)

      public fun extensions(extensions: IResolvable)

      public fun extensions(extensions: ExtensionsV3Property)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1ab1155439ebdbb752b82bf871553f556cbe9afb7ea2c4be5e4beae179a5a3de")
      public fun extensions(extensions: ExtensionsV3Property.Builder.() -> Unit)

      public fun generalFlags(generalFlags: IResolvable)

      public fun generalFlags(generalFlags: GeneralFlagsV3Property)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7c4023e5983bceddfc9b5909dc8a23d93ee4b23655c9b9b3ff5673973fcab4f2")
      public fun generalFlags(generalFlags: GeneralFlagsV3Property.Builder.() -> Unit)

      public fun hashAlgorithm(hashAlgorithm: String)

      public fun privateKeyAttributes(privateKeyAttributes: IResolvable)

      public fun privateKeyAttributes(privateKeyAttributes: PrivateKeyAttributesV3Property)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0a42e704bd0416ff8c15f257af353a2711d4c678bdcf6cc476e03a97d0ae4919")
      public
          fun privateKeyAttributes(privateKeyAttributes: PrivateKeyAttributesV3Property.Builder.() -> Unit)

      public fun privateKeyFlags(privateKeyFlags: IResolvable)

      public fun privateKeyFlags(privateKeyFlags: PrivateKeyFlagsV3Property)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("19bacd33063fdaa7addef79b60830df1aa411968033af897c8760077c983846c")
      public fun privateKeyFlags(privateKeyFlags: PrivateKeyFlagsV3Property.Builder.() -> Unit)

      public fun subjectNameFlags(subjectNameFlags: IResolvable)

      public fun subjectNameFlags(subjectNameFlags: SubjectNameFlagsV3Property)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6e3e2f0d878259f2c2177ed7ce9a7646b08c78946cf7ba3f021bd62f50e9936c")
      public fun subjectNameFlags(subjectNameFlags: SubjectNameFlagsV3Property.Builder.() -> Unit)

      public fun supersededTemplates(supersededTemplates: List<String>)

      public fun supersededTemplates(vararg supersededTemplates: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateV3Property.Builder =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateV3Property.builder()

      override fun certificateValidity(certificateValidity: IResolvable) {
        cdkBuilder.certificateValidity(certificateValidity.let(IResolvable::unwrap))
      }

      override fun certificateValidity(certificateValidity: CertificateValidityProperty) {
        cdkBuilder.certificateValidity(certificateValidity.let(CertificateValidityProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1b6b6939ffe11c55beac7c67c3b4879e5a1a4029250ca09537762918500b3ccc")
      override
          fun certificateValidity(certificateValidity: CertificateValidityProperty.Builder.() -> Unit):
          Unit = certificateValidity(CertificateValidityProperty(certificateValidity))

      override fun enrollmentFlags(enrollmentFlags: IResolvable) {
        cdkBuilder.enrollmentFlags(enrollmentFlags.let(IResolvable::unwrap))
      }

      override fun enrollmentFlags(enrollmentFlags: EnrollmentFlagsV3Property) {
        cdkBuilder.enrollmentFlags(enrollmentFlags.let(EnrollmentFlagsV3Property::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2387907f2e61871793058ad93675ef9449de1ad63481d0d6102b41edcd1993ae")
      override fun enrollmentFlags(enrollmentFlags: EnrollmentFlagsV3Property.Builder.() -> Unit):
          Unit = enrollmentFlags(EnrollmentFlagsV3Property(enrollmentFlags))

      override fun extensions(extensions: IResolvable) {
        cdkBuilder.extensions(extensions.let(IResolvable::unwrap))
      }

      override fun extensions(extensions: ExtensionsV3Property) {
        cdkBuilder.extensions(extensions.let(ExtensionsV3Property::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1ab1155439ebdbb752b82bf871553f556cbe9afb7ea2c4be5e4beae179a5a3de")
      override fun extensions(extensions: ExtensionsV3Property.Builder.() -> Unit): Unit =
          extensions(ExtensionsV3Property(extensions))

      override fun generalFlags(generalFlags: IResolvable) {
        cdkBuilder.generalFlags(generalFlags.let(IResolvable::unwrap))
      }

      override fun generalFlags(generalFlags: GeneralFlagsV3Property) {
        cdkBuilder.generalFlags(generalFlags.let(GeneralFlagsV3Property::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7c4023e5983bceddfc9b5909dc8a23d93ee4b23655c9b9b3ff5673973fcab4f2")
      override fun generalFlags(generalFlags: GeneralFlagsV3Property.Builder.() -> Unit): Unit =
          generalFlags(GeneralFlagsV3Property(generalFlags))

      override fun hashAlgorithm(hashAlgorithm: String) {
        cdkBuilder.hashAlgorithm(hashAlgorithm)
      }

      override fun privateKeyAttributes(privateKeyAttributes: IResolvable) {
        cdkBuilder.privateKeyAttributes(privateKeyAttributes.let(IResolvable::unwrap))
      }

      override fun privateKeyAttributes(privateKeyAttributes: PrivateKeyAttributesV3Property) {
        cdkBuilder.privateKeyAttributes(privateKeyAttributes.let(PrivateKeyAttributesV3Property::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0a42e704bd0416ff8c15f257af353a2711d4c678bdcf6cc476e03a97d0ae4919")
      override
          fun privateKeyAttributes(privateKeyAttributes: PrivateKeyAttributesV3Property.Builder.() -> Unit):
          Unit = privateKeyAttributes(PrivateKeyAttributesV3Property(privateKeyAttributes))

      override fun privateKeyFlags(privateKeyFlags: IResolvable) {
        cdkBuilder.privateKeyFlags(privateKeyFlags.let(IResolvable::unwrap))
      }

      override fun privateKeyFlags(privateKeyFlags: PrivateKeyFlagsV3Property) {
        cdkBuilder.privateKeyFlags(privateKeyFlags.let(PrivateKeyFlagsV3Property::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("19bacd33063fdaa7addef79b60830df1aa411968033af897c8760077c983846c")
      override fun privateKeyFlags(privateKeyFlags: PrivateKeyFlagsV3Property.Builder.() -> Unit):
          Unit = privateKeyFlags(PrivateKeyFlagsV3Property(privateKeyFlags))

      override fun subjectNameFlags(subjectNameFlags: IResolvable) {
        cdkBuilder.subjectNameFlags(subjectNameFlags.let(IResolvable::unwrap))
      }

      override fun subjectNameFlags(subjectNameFlags: SubjectNameFlagsV3Property) {
        cdkBuilder.subjectNameFlags(subjectNameFlags.let(SubjectNameFlagsV3Property::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6e3e2f0d878259f2c2177ed7ce9a7646b08c78946cf7ba3f021bd62f50e9936c")
      override
          fun subjectNameFlags(subjectNameFlags: SubjectNameFlagsV3Property.Builder.() -> Unit):
          Unit = subjectNameFlags(SubjectNameFlagsV3Property(subjectNameFlags))

      override fun supersededTemplates(supersededTemplates: List<String>) {
        cdkBuilder.supersededTemplates(supersededTemplates)
      }

      override fun supersededTemplates(vararg supersededTemplates: String): Unit =
          supersededTemplates(supersededTemplates.toList())

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateV3Property =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateV3Property,
    ) : CdkObject(cdkObject), TemplateV3Property {
      override fun certificateValidity(): Any = unwrap(this).getCertificateValidity()

      override fun enrollmentFlags(): Any = unwrap(this).getEnrollmentFlags()

      override fun extensions(): Any = unwrap(this).getExtensions()

      override fun generalFlags(): Any = unwrap(this).getGeneralFlags()

      override fun hashAlgorithm(): String = unwrap(this).getHashAlgorithm()

      override fun privateKeyAttributes(): Any = unwrap(this).getPrivateKeyAttributes()

      override fun privateKeyFlags(): Any = unwrap(this).getPrivateKeyFlags()

      override fun subjectNameFlags(): Any = unwrap(this).getSubjectNameFlags()

      override fun supersededTemplates(): List<String> = unwrap(this).getSupersededTemplates() ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TemplateV3Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateV3Property):
          TemplateV3Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TemplateV3Property):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateV3Property = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateV3Property
    }
  }

  public interface TemplateDefinitionProperty {
    public fun templateV2(): Any? = unwrap(this).getTemplateV2()

    public fun templateV3(): Any? = unwrap(this).getTemplateV3()

    public fun templateV4(): Any? = unwrap(this).getTemplateV4()

    @CdkDslMarker
    public interface Builder {
      public fun templateV2(templateV2: IResolvable)

      public fun templateV2(templateV2: TemplateV2Property)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("01b45117b08b7836177cd5f5bd6dfea2d426f968546b6c8f9616e636271e91dc")
      public fun templateV2(templateV2: TemplateV2Property.Builder.() -> Unit)

      public fun templateV3(templateV3: IResolvable)

      public fun templateV3(templateV3: TemplateV3Property)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f5142db8cbb835d2c94551906d0f203a25d0aa36fd7966e642016fae6fef13f6")
      public fun templateV3(templateV3: TemplateV3Property.Builder.() -> Unit)

      public fun templateV4(templateV4: IResolvable)

      public fun templateV4(templateV4: TemplateV4Property)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a274da345eb1b0d816427862afd3c0b8bb813f2ec62ebf00e8c40e80ee736a4f")
      public fun templateV4(templateV4: TemplateV4Property.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateDefinitionProperty.builder()

      override fun templateV2(templateV2: IResolvable) {
        cdkBuilder.templateV2(templateV2.let(IResolvable::unwrap))
      }

      override fun templateV2(templateV2: TemplateV2Property) {
        cdkBuilder.templateV2(templateV2.let(TemplateV2Property::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("01b45117b08b7836177cd5f5bd6dfea2d426f968546b6c8f9616e636271e91dc")
      override fun templateV2(templateV2: TemplateV2Property.Builder.() -> Unit): Unit =
          templateV2(TemplateV2Property(templateV2))

      override fun templateV3(templateV3: IResolvable) {
        cdkBuilder.templateV3(templateV3.let(IResolvable::unwrap))
      }

      override fun templateV3(templateV3: TemplateV3Property) {
        cdkBuilder.templateV3(templateV3.let(TemplateV3Property::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f5142db8cbb835d2c94551906d0f203a25d0aa36fd7966e642016fae6fef13f6")
      override fun templateV3(templateV3: TemplateV3Property.Builder.() -> Unit): Unit =
          templateV3(TemplateV3Property(templateV3))

      override fun templateV4(templateV4: IResolvable) {
        cdkBuilder.templateV4(templateV4.let(IResolvable::unwrap))
      }

      override fun templateV4(templateV4: TemplateV4Property) {
        cdkBuilder.templateV4(templateV4.let(TemplateV4Property::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a274da345eb1b0d816427862afd3c0b8bb813f2ec62ebf00e8c40e80ee736a4f")
      override fun templateV4(templateV4: TemplateV4Property.Builder.() -> Unit): Unit =
          templateV4(TemplateV4Property(templateV4))

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateDefinitionProperty,
    ) : CdkObject(cdkObject), TemplateDefinitionProperty {
      override fun templateV2(): Any? = unwrap(this).getTemplateV2()

      override fun templateV3(): Any? = unwrap(this).getTemplateV3()

      override fun templateV4(): Any? = unwrap(this).getTemplateV4()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TemplateDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateDefinitionProperty):
          TemplateDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TemplateDefinitionProperty):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateDefinitionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateDefinitionProperty
    }
  }

  public interface KeyUsagePropertyProperty {
    public fun propertyFlags(): Any? = unwrap(this).getPropertyFlags()

    public fun propertyType(): String? = unwrap(this).getPropertyType()

    @CdkDslMarker
    public interface Builder {
      public fun propertyFlags(propertyFlags: IResolvable)

      public fun propertyFlags(propertyFlags: KeyUsagePropertyFlagsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7d650478be89420c8682f59b49461f47f84cdefa1fef1dfc8316cc539e14cce6")
      public fun propertyFlags(propertyFlags: KeyUsagePropertyFlagsProperty.Builder.() -> Unit)

      public fun propertyType(propertyType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsagePropertyProperty.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsagePropertyProperty.builder()

      override fun propertyFlags(propertyFlags: IResolvable) {
        cdkBuilder.propertyFlags(propertyFlags.let(IResolvable::unwrap))
      }

      override fun propertyFlags(propertyFlags: KeyUsagePropertyFlagsProperty) {
        cdkBuilder.propertyFlags(propertyFlags.let(KeyUsagePropertyFlagsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7d650478be89420c8682f59b49461f47f84cdefa1fef1dfc8316cc539e14cce6")
      override fun propertyFlags(propertyFlags: KeyUsagePropertyFlagsProperty.Builder.() -> Unit):
          Unit = propertyFlags(KeyUsagePropertyFlagsProperty(propertyFlags))

      override fun propertyType(propertyType: String) {
        cdkBuilder.propertyType(propertyType)
      }

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsagePropertyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsagePropertyProperty,
    ) : CdkObject(cdkObject), KeyUsagePropertyProperty {
      override fun propertyFlags(): Any? = unwrap(this).getPropertyFlags()

      override fun propertyType(): String? = unwrap(this).getPropertyType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KeyUsagePropertyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsagePropertyProperty):
          KeyUsagePropertyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KeyUsagePropertyProperty):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsagePropertyProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsagePropertyProperty
    }
  }

  public interface SubjectNameFlagsV2Property {
    public fun requireCommonName(): Any? = unwrap(this).getRequireCommonName()

    public fun requireDirectoryPath(): Any? = unwrap(this).getRequireDirectoryPath()

    public fun requireDnsAsCn(): Any? = unwrap(this).getRequireDnsAsCn()

    public fun requireEmail(): Any? = unwrap(this).getRequireEmail()

    public fun sanRequireDirectoryGuid(): Any? = unwrap(this).getSanRequireDirectoryGuid()

    public fun sanRequireDns(): Any? = unwrap(this).getSanRequireDns()

    public fun sanRequireDomainDns(): Any? = unwrap(this).getSanRequireDomainDns()

    public fun sanRequireEmail(): Any? = unwrap(this).getSanRequireEmail()

    public fun sanRequireSpn(): Any? = unwrap(this).getSanRequireSpn()

    public fun sanRequireUpn(): Any? = unwrap(this).getSanRequireUpn()

    @CdkDslMarker
    public interface Builder {
      public fun requireCommonName(requireCommonName: Boolean)

      public fun requireCommonName(requireCommonName: IResolvable)

      public fun requireDirectoryPath(requireDirectoryPath: Boolean)

      public fun requireDirectoryPath(requireDirectoryPath: IResolvable)

      public fun requireDnsAsCn(requireDnsAsCn: Boolean)

      public fun requireDnsAsCn(requireDnsAsCn: IResolvable)

      public fun requireEmail(requireEmail: Boolean)

      public fun requireEmail(requireEmail: IResolvable)

      public fun sanRequireDirectoryGuid(sanRequireDirectoryGuid: Boolean)

      public fun sanRequireDirectoryGuid(sanRequireDirectoryGuid: IResolvable)

      public fun sanRequireDns(sanRequireDns: Boolean)

      public fun sanRequireDns(sanRequireDns: IResolvable)

      public fun sanRequireDomainDns(sanRequireDomainDns: Boolean)

      public fun sanRequireDomainDns(sanRequireDomainDns: IResolvable)

      public fun sanRequireEmail(sanRequireEmail: Boolean)

      public fun sanRequireEmail(sanRequireEmail: IResolvable)

      public fun sanRequireSpn(sanRequireSpn: Boolean)

      public fun sanRequireSpn(sanRequireSpn: IResolvable)

      public fun sanRequireUpn(sanRequireUpn: Boolean)

      public fun sanRequireUpn(sanRequireUpn: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.SubjectNameFlagsV2Property.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.SubjectNameFlagsV2Property.builder()

      override fun requireCommonName(requireCommonName: Boolean) {
        cdkBuilder.requireCommonName(requireCommonName)
      }

      override fun requireCommonName(requireCommonName: IResolvable) {
        cdkBuilder.requireCommonName(requireCommonName.let(IResolvable::unwrap))
      }

      override fun requireDirectoryPath(requireDirectoryPath: Boolean) {
        cdkBuilder.requireDirectoryPath(requireDirectoryPath)
      }

      override fun requireDirectoryPath(requireDirectoryPath: IResolvable) {
        cdkBuilder.requireDirectoryPath(requireDirectoryPath.let(IResolvable::unwrap))
      }

      override fun requireDnsAsCn(requireDnsAsCn: Boolean) {
        cdkBuilder.requireDnsAsCn(requireDnsAsCn)
      }

      override fun requireDnsAsCn(requireDnsAsCn: IResolvable) {
        cdkBuilder.requireDnsAsCn(requireDnsAsCn.let(IResolvable::unwrap))
      }

      override fun requireEmail(requireEmail: Boolean) {
        cdkBuilder.requireEmail(requireEmail)
      }

      override fun requireEmail(requireEmail: IResolvable) {
        cdkBuilder.requireEmail(requireEmail.let(IResolvable::unwrap))
      }

      override fun sanRequireDirectoryGuid(sanRequireDirectoryGuid: Boolean) {
        cdkBuilder.sanRequireDirectoryGuid(sanRequireDirectoryGuid)
      }

      override fun sanRequireDirectoryGuid(sanRequireDirectoryGuid: IResolvable) {
        cdkBuilder.sanRequireDirectoryGuid(sanRequireDirectoryGuid.let(IResolvable::unwrap))
      }

      override fun sanRequireDns(sanRequireDns: Boolean) {
        cdkBuilder.sanRequireDns(sanRequireDns)
      }

      override fun sanRequireDns(sanRequireDns: IResolvable) {
        cdkBuilder.sanRequireDns(sanRequireDns.let(IResolvable::unwrap))
      }

      override fun sanRequireDomainDns(sanRequireDomainDns: Boolean) {
        cdkBuilder.sanRequireDomainDns(sanRequireDomainDns)
      }

      override fun sanRequireDomainDns(sanRequireDomainDns: IResolvable) {
        cdkBuilder.sanRequireDomainDns(sanRequireDomainDns.let(IResolvable::unwrap))
      }

      override fun sanRequireEmail(sanRequireEmail: Boolean) {
        cdkBuilder.sanRequireEmail(sanRequireEmail)
      }

      override fun sanRequireEmail(sanRequireEmail: IResolvable) {
        cdkBuilder.sanRequireEmail(sanRequireEmail.let(IResolvable::unwrap))
      }

      override fun sanRequireSpn(sanRequireSpn: Boolean) {
        cdkBuilder.sanRequireSpn(sanRequireSpn)
      }

      override fun sanRequireSpn(sanRequireSpn: IResolvable) {
        cdkBuilder.sanRequireSpn(sanRequireSpn.let(IResolvable::unwrap))
      }

      override fun sanRequireUpn(sanRequireUpn: Boolean) {
        cdkBuilder.sanRequireUpn(sanRequireUpn)
      }

      override fun sanRequireUpn(sanRequireUpn: IResolvable) {
        cdkBuilder.sanRequireUpn(sanRequireUpn.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.SubjectNameFlagsV2Property =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.SubjectNameFlagsV2Property,
    ) : CdkObject(cdkObject), SubjectNameFlagsV2Property {
      override fun requireCommonName(): Any? = unwrap(this).getRequireCommonName()

      override fun requireDirectoryPath(): Any? = unwrap(this).getRequireDirectoryPath()

      override fun requireDnsAsCn(): Any? = unwrap(this).getRequireDnsAsCn()

      override fun requireEmail(): Any? = unwrap(this).getRequireEmail()

      override fun sanRequireDirectoryGuid(): Any? = unwrap(this).getSanRequireDirectoryGuid()

      override fun sanRequireDns(): Any? = unwrap(this).getSanRequireDns()

      override fun sanRequireDomainDns(): Any? = unwrap(this).getSanRequireDomainDns()

      override fun sanRequireEmail(): Any? = unwrap(this).getSanRequireEmail()

      override fun sanRequireSpn(): Any? = unwrap(this).getSanRequireSpn()

      override fun sanRequireUpn(): Any? = unwrap(this).getSanRequireUpn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SubjectNameFlagsV2Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.SubjectNameFlagsV2Property):
          SubjectNameFlagsV2Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SubjectNameFlagsV2Property):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.SubjectNameFlagsV2Property =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.SubjectNameFlagsV2Property
    }
  }

  public interface SubjectNameFlagsV4Property {
    public fun requireCommonName(): Any? = unwrap(this).getRequireCommonName()

    public fun requireDirectoryPath(): Any? = unwrap(this).getRequireDirectoryPath()

    public fun requireDnsAsCn(): Any? = unwrap(this).getRequireDnsAsCn()

    public fun requireEmail(): Any? = unwrap(this).getRequireEmail()

    public fun sanRequireDirectoryGuid(): Any? = unwrap(this).getSanRequireDirectoryGuid()

    public fun sanRequireDns(): Any? = unwrap(this).getSanRequireDns()

    public fun sanRequireDomainDns(): Any? = unwrap(this).getSanRequireDomainDns()

    public fun sanRequireEmail(): Any? = unwrap(this).getSanRequireEmail()

    public fun sanRequireSpn(): Any? = unwrap(this).getSanRequireSpn()

    public fun sanRequireUpn(): Any? = unwrap(this).getSanRequireUpn()

    @CdkDslMarker
    public interface Builder {
      public fun requireCommonName(requireCommonName: Boolean)

      public fun requireCommonName(requireCommonName: IResolvable)

      public fun requireDirectoryPath(requireDirectoryPath: Boolean)

      public fun requireDirectoryPath(requireDirectoryPath: IResolvable)

      public fun requireDnsAsCn(requireDnsAsCn: Boolean)

      public fun requireDnsAsCn(requireDnsAsCn: IResolvable)

      public fun requireEmail(requireEmail: Boolean)

      public fun requireEmail(requireEmail: IResolvable)

      public fun sanRequireDirectoryGuid(sanRequireDirectoryGuid: Boolean)

      public fun sanRequireDirectoryGuid(sanRequireDirectoryGuid: IResolvable)

      public fun sanRequireDns(sanRequireDns: Boolean)

      public fun sanRequireDns(sanRequireDns: IResolvable)

      public fun sanRequireDomainDns(sanRequireDomainDns: Boolean)

      public fun sanRequireDomainDns(sanRequireDomainDns: IResolvable)

      public fun sanRequireEmail(sanRequireEmail: Boolean)

      public fun sanRequireEmail(sanRequireEmail: IResolvable)

      public fun sanRequireSpn(sanRequireSpn: Boolean)

      public fun sanRequireSpn(sanRequireSpn: IResolvable)

      public fun sanRequireUpn(sanRequireUpn: Boolean)

      public fun sanRequireUpn(sanRequireUpn: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.SubjectNameFlagsV4Property.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.SubjectNameFlagsV4Property.builder()

      override fun requireCommonName(requireCommonName: Boolean) {
        cdkBuilder.requireCommonName(requireCommonName)
      }

      override fun requireCommonName(requireCommonName: IResolvable) {
        cdkBuilder.requireCommonName(requireCommonName.let(IResolvable::unwrap))
      }

      override fun requireDirectoryPath(requireDirectoryPath: Boolean) {
        cdkBuilder.requireDirectoryPath(requireDirectoryPath)
      }

      override fun requireDirectoryPath(requireDirectoryPath: IResolvable) {
        cdkBuilder.requireDirectoryPath(requireDirectoryPath.let(IResolvable::unwrap))
      }

      override fun requireDnsAsCn(requireDnsAsCn: Boolean) {
        cdkBuilder.requireDnsAsCn(requireDnsAsCn)
      }

      override fun requireDnsAsCn(requireDnsAsCn: IResolvable) {
        cdkBuilder.requireDnsAsCn(requireDnsAsCn.let(IResolvable::unwrap))
      }

      override fun requireEmail(requireEmail: Boolean) {
        cdkBuilder.requireEmail(requireEmail)
      }

      override fun requireEmail(requireEmail: IResolvable) {
        cdkBuilder.requireEmail(requireEmail.let(IResolvable::unwrap))
      }

      override fun sanRequireDirectoryGuid(sanRequireDirectoryGuid: Boolean) {
        cdkBuilder.sanRequireDirectoryGuid(sanRequireDirectoryGuid)
      }

      override fun sanRequireDirectoryGuid(sanRequireDirectoryGuid: IResolvable) {
        cdkBuilder.sanRequireDirectoryGuid(sanRequireDirectoryGuid.let(IResolvable::unwrap))
      }

      override fun sanRequireDns(sanRequireDns: Boolean) {
        cdkBuilder.sanRequireDns(sanRequireDns)
      }

      override fun sanRequireDns(sanRequireDns: IResolvable) {
        cdkBuilder.sanRequireDns(sanRequireDns.let(IResolvable::unwrap))
      }

      override fun sanRequireDomainDns(sanRequireDomainDns: Boolean) {
        cdkBuilder.sanRequireDomainDns(sanRequireDomainDns)
      }

      override fun sanRequireDomainDns(sanRequireDomainDns: IResolvable) {
        cdkBuilder.sanRequireDomainDns(sanRequireDomainDns.let(IResolvable::unwrap))
      }

      override fun sanRequireEmail(sanRequireEmail: Boolean) {
        cdkBuilder.sanRequireEmail(sanRequireEmail)
      }

      override fun sanRequireEmail(sanRequireEmail: IResolvable) {
        cdkBuilder.sanRequireEmail(sanRequireEmail.let(IResolvable::unwrap))
      }

      override fun sanRequireSpn(sanRequireSpn: Boolean) {
        cdkBuilder.sanRequireSpn(sanRequireSpn)
      }

      override fun sanRequireSpn(sanRequireSpn: IResolvable) {
        cdkBuilder.sanRequireSpn(sanRequireSpn.let(IResolvable::unwrap))
      }

      override fun sanRequireUpn(sanRequireUpn: Boolean) {
        cdkBuilder.sanRequireUpn(sanRequireUpn)
      }

      override fun sanRequireUpn(sanRequireUpn: IResolvable) {
        cdkBuilder.sanRequireUpn(sanRequireUpn.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.SubjectNameFlagsV4Property =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.SubjectNameFlagsV4Property,
    ) : CdkObject(cdkObject), SubjectNameFlagsV4Property {
      override fun requireCommonName(): Any? = unwrap(this).getRequireCommonName()

      override fun requireDirectoryPath(): Any? = unwrap(this).getRequireDirectoryPath()

      override fun requireDnsAsCn(): Any? = unwrap(this).getRequireDnsAsCn()

      override fun requireEmail(): Any? = unwrap(this).getRequireEmail()

      override fun sanRequireDirectoryGuid(): Any? = unwrap(this).getSanRequireDirectoryGuid()

      override fun sanRequireDns(): Any? = unwrap(this).getSanRequireDns()

      override fun sanRequireDomainDns(): Any? = unwrap(this).getSanRequireDomainDns()

      override fun sanRequireEmail(): Any? = unwrap(this).getSanRequireEmail()

      override fun sanRequireSpn(): Any? = unwrap(this).getSanRequireSpn()

      override fun sanRequireUpn(): Any? = unwrap(this).getSanRequireUpn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SubjectNameFlagsV4Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.SubjectNameFlagsV4Property):
          SubjectNameFlagsV4Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SubjectNameFlagsV4Property):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.SubjectNameFlagsV4Property =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.SubjectNameFlagsV4Property
    }
  }

  public interface GeneralFlagsV4Property {
    public fun autoEnrollment(): Any? = unwrap(this).getAutoEnrollment()

    public fun machineType(): Any? = unwrap(this).getMachineType()

    @CdkDslMarker
    public interface Builder {
      public fun autoEnrollment(autoEnrollment: Boolean)

      public fun autoEnrollment(autoEnrollment: IResolvable)

      public fun machineType(machineType: Boolean)

      public fun machineType(machineType: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.GeneralFlagsV4Property.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.GeneralFlagsV4Property.builder()

      override fun autoEnrollment(autoEnrollment: Boolean) {
        cdkBuilder.autoEnrollment(autoEnrollment)
      }

      override fun autoEnrollment(autoEnrollment: IResolvable) {
        cdkBuilder.autoEnrollment(autoEnrollment.let(IResolvable::unwrap))
      }

      override fun machineType(machineType: Boolean) {
        cdkBuilder.machineType(machineType)
      }

      override fun machineType(machineType: IResolvable) {
        cdkBuilder.machineType(machineType.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.GeneralFlagsV4Property =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.GeneralFlagsV4Property,
    ) : CdkObject(cdkObject), GeneralFlagsV4Property {
      override fun autoEnrollment(): Any? = unwrap(this).getAutoEnrollment()

      override fun machineType(): Any? = unwrap(this).getMachineType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GeneralFlagsV4Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.GeneralFlagsV4Property):
          GeneralFlagsV4Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GeneralFlagsV4Property):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.GeneralFlagsV4Property =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.GeneralFlagsV4Property
    }
  }

  public interface PrivateKeyAttributesV2Property {
    public fun cryptoProviders(): List<String> = unwrap(this).getCryptoProviders() ?: emptyList()

    public fun keySpec(): String

    public fun minimalKeyLength(): Number

    @CdkDslMarker
    public interface Builder {
      public fun cryptoProviders(cryptoProviders: List<String>)

      public fun cryptoProviders(vararg cryptoProviders: String)

      public fun keySpec(keySpec: String)

      public fun minimalKeyLength(minimalKeyLength: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyAttributesV2Property.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyAttributesV2Property.builder()

      override fun cryptoProviders(cryptoProviders: List<String>) {
        cdkBuilder.cryptoProviders(cryptoProviders)
      }

      override fun cryptoProviders(vararg cryptoProviders: String): Unit =
          cryptoProviders(cryptoProviders.toList())

      override fun keySpec(keySpec: String) {
        cdkBuilder.keySpec(keySpec)
      }

      override fun minimalKeyLength(minimalKeyLength: Number) {
        cdkBuilder.minimalKeyLength(minimalKeyLength)
      }

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyAttributesV2Property
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyAttributesV2Property,
    ) : CdkObject(cdkObject), PrivateKeyAttributesV2Property {
      override fun cryptoProviders(): List<String> = unwrap(this).getCryptoProviders() ?:
          emptyList()

      override fun keySpec(): String = unwrap(this).getKeySpec()

      override fun minimalKeyLength(): Number = unwrap(this).getMinimalKeyLength()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PrivateKeyAttributesV2Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyAttributesV2Property):
          PrivateKeyAttributesV2Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrivateKeyAttributesV2Property):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyAttributesV2Property
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyAttributesV2Property
    }
  }

  public interface PrivateKeyAttributesV4Property {
    public fun algorithm(): String? = unwrap(this).getAlgorithm()

    public fun cryptoProviders(): List<String> = unwrap(this).getCryptoProviders() ?: emptyList()

    public fun keySpec(): String

    public fun keyUsageProperty(): Any? = unwrap(this).getKeyUsageProperty()

    public fun minimalKeyLength(): Number

    @CdkDslMarker
    public interface Builder {
      public fun algorithm(algorithm: String)

      public fun cryptoProviders(cryptoProviders: List<String>)

      public fun cryptoProviders(vararg cryptoProviders: String)

      public fun keySpec(keySpec: String)

      public fun keyUsageProperty(keyUsageProperty: IResolvable)

      public fun keyUsageProperty(keyUsageProperty: KeyUsagePropertyProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("39c25c064000533e637d6eed426bb566a63aa39c6166838f67748c5adafccb96")
      public fun keyUsageProperty(keyUsageProperty: KeyUsagePropertyProperty.Builder.() -> Unit)

      public fun minimalKeyLength(minimalKeyLength: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyAttributesV4Property.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyAttributesV4Property.builder()

      override fun algorithm(algorithm: String) {
        cdkBuilder.algorithm(algorithm)
      }

      override fun cryptoProviders(cryptoProviders: List<String>) {
        cdkBuilder.cryptoProviders(cryptoProviders)
      }

      override fun cryptoProviders(vararg cryptoProviders: String): Unit =
          cryptoProviders(cryptoProviders.toList())

      override fun keySpec(keySpec: String) {
        cdkBuilder.keySpec(keySpec)
      }

      override fun keyUsageProperty(keyUsageProperty: IResolvable) {
        cdkBuilder.keyUsageProperty(keyUsageProperty.let(IResolvable::unwrap))
      }

      override fun keyUsageProperty(keyUsageProperty: KeyUsagePropertyProperty) {
        cdkBuilder.keyUsageProperty(keyUsageProperty.let(KeyUsagePropertyProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("39c25c064000533e637d6eed426bb566a63aa39c6166838f67748c5adafccb96")
      override fun keyUsageProperty(keyUsageProperty: KeyUsagePropertyProperty.Builder.() -> Unit):
          Unit = keyUsageProperty(KeyUsagePropertyProperty(keyUsageProperty))

      override fun minimalKeyLength(minimalKeyLength: Number) {
        cdkBuilder.minimalKeyLength(minimalKeyLength)
      }

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyAttributesV4Property
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyAttributesV4Property,
    ) : CdkObject(cdkObject), PrivateKeyAttributesV4Property {
      override fun algorithm(): String? = unwrap(this).getAlgorithm()

      override fun cryptoProviders(): List<String> = unwrap(this).getCryptoProviders() ?:
          emptyList()

      override fun keySpec(): String = unwrap(this).getKeySpec()

      override fun keyUsageProperty(): Any? = unwrap(this).getKeyUsageProperty()

      override fun minimalKeyLength(): Number = unwrap(this).getMinimalKeyLength()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PrivateKeyAttributesV4Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyAttributesV4Property):
          PrivateKeyAttributesV4Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrivateKeyAttributesV4Property):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyAttributesV4Property
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyAttributesV4Property
    }
  }

  public interface PrivateKeyAttributesV3Property {
    public fun algorithm(): String

    public fun cryptoProviders(): List<String> = unwrap(this).getCryptoProviders() ?: emptyList()

    public fun keySpec(): String

    public fun keyUsageProperty(): Any

    public fun minimalKeyLength(): Number

    @CdkDslMarker
    public interface Builder {
      public fun algorithm(algorithm: String)

      public fun cryptoProviders(cryptoProviders: List<String>)

      public fun cryptoProviders(vararg cryptoProviders: String)

      public fun keySpec(keySpec: String)

      public fun keyUsageProperty(keyUsageProperty: IResolvable)

      public fun keyUsageProperty(keyUsageProperty: KeyUsagePropertyProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ccd5bffefaa9ac6fdcbd555901a072569107b00d07950ec2c4793559eb0cc6d9")
      public fun keyUsageProperty(keyUsageProperty: KeyUsagePropertyProperty.Builder.() -> Unit)

      public fun minimalKeyLength(minimalKeyLength: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyAttributesV3Property.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyAttributesV3Property.builder()

      override fun algorithm(algorithm: String) {
        cdkBuilder.algorithm(algorithm)
      }

      override fun cryptoProviders(cryptoProviders: List<String>) {
        cdkBuilder.cryptoProviders(cryptoProviders)
      }

      override fun cryptoProviders(vararg cryptoProviders: String): Unit =
          cryptoProviders(cryptoProviders.toList())

      override fun keySpec(keySpec: String) {
        cdkBuilder.keySpec(keySpec)
      }

      override fun keyUsageProperty(keyUsageProperty: IResolvable) {
        cdkBuilder.keyUsageProperty(keyUsageProperty.let(IResolvable::unwrap))
      }

      override fun keyUsageProperty(keyUsageProperty: KeyUsagePropertyProperty) {
        cdkBuilder.keyUsageProperty(keyUsageProperty.let(KeyUsagePropertyProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ccd5bffefaa9ac6fdcbd555901a072569107b00d07950ec2c4793559eb0cc6d9")
      override fun keyUsageProperty(keyUsageProperty: KeyUsagePropertyProperty.Builder.() -> Unit):
          Unit = keyUsageProperty(KeyUsagePropertyProperty(keyUsageProperty))

      override fun minimalKeyLength(minimalKeyLength: Number) {
        cdkBuilder.minimalKeyLength(minimalKeyLength)
      }

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyAttributesV3Property
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyAttributesV3Property,
    ) : CdkObject(cdkObject), PrivateKeyAttributesV3Property {
      override fun algorithm(): String = unwrap(this).getAlgorithm()

      override fun cryptoProviders(): List<String> = unwrap(this).getCryptoProviders() ?:
          emptyList()

      override fun keySpec(): String = unwrap(this).getKeySpec()

      override fun keyUsageProperty(): Any = unwrap(this).getKeyUsageProperty()

      override fun minimalKeyLength(): Number = unwrap(this).getMinimalKeyLength()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PrivateKeyAttributesV3Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyAttributesV3Property):
          PrivateKeyAttributesV3Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrivateKeyAttributesV3Property):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyAttributesV3Property
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyAttributesV3Property
    }
  }

  public interface EnrollmentFlagsV3Property {
    public fun enableKeyReuseOnNtTokenKeysetStorageFull(): Any? =
        unwrap(this).getEnableKeyReuseOnNtTokenKeysetStorageFull()

    public fun includeSymmetricAlgorithms(): Any? = unwrap(this).getIncludeSymmetricAlgorithms()

    public fun noSecurityExtension(): Any? = unwrap(this).getNoSecurityExtension()

    public fun removeInvalidCertificateFromPersonalStore(): Any? =
        unwrap(this).getRemoveInvalidCertificateFromPersonalStore()

    public fun userInteractionRequired(): Any? = unwrap(this).getUserInteractionRequired()

    @CdkDslMarker
    public interface Builder {
      public
          fun enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull: Boolean)

      public
          fun enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull: IResolvable)

      public fun includeSymmetricAlgorithms(includeSymmetricAlgorithms: Boolean)

      public fun includeSymmetricAlgorithms(includeSymmetricAlgorithms: IResolvable)

      public fun noSecurityExtension(noSecurityExtension: Boolean)

      public fun noSecurityExtension(noSecurityExtension: IResolvable)

      public
          fun removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore: Boolean)

      public
          fun removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore: IResolvable)

      public fun userInteractionRequired(userInteractionRequired: Boolean)

      public fun userInteractionRequired(userInteractionRequired: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.EnrollmentFlagsV3Property.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.EnrollmentFlagsV3Property.builder()

      override
          fun enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull: Boolean) {
        cdkBuilder.enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull)
      }

      override
          fun enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull: IResolvable) {
        cdkBuilder.enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull.let(IResolvable::unwrap))
      }

      override fun includeSymmetricAlgorithms(includeSymmetricAlgorithms: Boolean) {
        cdkBuilder.includeSymmetricAlgorithms(includeSymmetricAlgorithms)
      }

      override fun includeSymmetricAlgorithms(includeSymmetricAlgorithms: IResolvable) {
        cdkBuilder.includeSymmetricAlgorithms(includeSymmetricAlgorithms.let(IResolvable::unwrap))
      }

      override fun noSecurityExtension(noSecurityExtension: Boolean) {
        cdkBuilder.noSecurityExtension(noSecurityExtension)
      }

      override fun noSecurityExtension(noSecurityExtension: IResolvable) {
        cdkBuilder.noSecurityExtension(noSecurityExtension.let(IResolvable::unwrap))
      }

      override
          fun removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore: Boolean) {
        cdkBuilder.removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore)
      }

      override
          fun removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore: IResolvable) {
        cdkBuilder.removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore.let(IResolvable::unwrap))
      }

      override fun userInteractionRequired(userInteractionRequired: Boolean) {
        cdkBuilder.userInteractionRequired(userInteractionRequired)
      }

      override fun userInteractionRequired(userInteractionRequired: IResolvable) {
        cdkBuilder.userInteractionRequired(userInteractionRequired.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.EnrollmentFlagsV3Property =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.EnrollmentFlagsV3Property,
    ) : CdkObject(cdkObject), EnrollmentFlagsV3Property {
      override fun enableKeyReuseOnNtTokenKeysetStorageFull(): Any? =
          unwrap(this).getEnableKeyReuseOnNtTokenKeysetStorageFull()

      override fun includeSymmetricAlgorithms(): Any? = unwrap(this).getIncludeSymmetricAlgorithms()

      override fun noSecurityExtension(): Any? = unwrap(this).getNoSecurityExtension()

      override fun removeInvalidCertificateFromPersonalStore(): Any? =
          unwrap(this).getRemoveInvalidCertificateFromPersonalStore()

      override fun userInteractionRequired(): Any? = unwrap(this).getUserInteractionRequired()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EnrollmentFlagsV3Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.EnrollmentFlagsV3Property):
          EnrollmentFlagsV3Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnrollmentFlagsV3Property):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.EnrollmentFlagsV3Property =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.EnrollmentFlagsV3Property
    }
  }

  public interface EnrollmentFlagsV2Property {
    public fun enableKeyReuseOnNtTokenKeysetStorageFull(): Any? =
        unwrap(this).getEnableKeyReuseOnNtTokenKeysetStorageFull()

    public fun includeSymmetricAlgorithms(): Any? = unwrap(this).getIncludeSymmetricAlgorithms()

    public fun noSecurityExtension(): Any? = unwrap(this).getNoSecurityExtension()

    public fun removeInvalidCertificateFromPersonalStore(): Any? =
        unwrap(this).getRemoveInvalidCertificateFromPersonalStore()

    public fun userInteractionRequired(): Any? = unwrap(this).getUserInteractionRequired()

    @CdkDslMarker
    public interface Builder {
      public
          fun enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull: Boolean)

      public
          fun enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull: IResolvable)

      public fun includeSymmetricAlgorithms(includeSymmetricAlgorithms: Boolean)

      public fun includeSymmetricAlgorithms(includeSymmetricAlgorithms: IResolvable)

      public fun noSecurityExtension(noSecurityExtension: Boolean)

      public fun noSecurityExtension(noSecurityExtension: IResolvable)

      public
          fun removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore: Boolean)

      public
          fun removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore: IResolvable)

      public fun userInteractionRequired(userInteractionRequired: Boolean)

      public fun userInteractionRequired(userInteractionRequired: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.EnrollmentFlagsV2Property.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.EnrollmentFlagsV2Property.builder()

      override
          fun enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull: Boolean) {
        cdkBuilder.enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull)
      }

      override
          fun enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull: IResolvable) {
        cdkBuilder.enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull.let(IResolvable::unwrap))
      }

      override fun includeSymmetricAlgorithms(includeSymmetricAlgorithms: Boolean) {
        cdkBuilder.includeSymmetricAlgorithms(includeSymmetricAlgorithms)
      }

      override fun includeSymmetricAlgorithms(includeSymmetricAlgorithms: IResolvable) {
        cdkBuilder.includeSymmetricAlgorithms(includeSymmetricAlgorithms.let(IResolvable::unwrap))
      }

      override fun noSecurityExtension(noSecurityExtension: Boolean) {
        cdkBuilder.noSecurityExtension(noSecurityExtension)
      }

      override fun noSecurityExtension(noSecurityExtension: IResolvable) {
        cdkBuilder.noSecurityExtension(noSecurityExtension.let(IResolvable::unwrap))
      }

      override
          fun removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore: Boolean) {
        cdkBuilder.removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore)
      }

      override
          fun removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore: IResolvable) {
        cdkBuilder.removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore.let(IResolvable::unwrap))
      }

      override fun userInteractionRequired(userInteractionRequired: Boolean) {
        cdkBuilder.userInteractionRequired(userInteractionRequired)
      }

      override fun userInteractionRequired(userInteractionRequired: IResolvable) {
        cdkBuilder.userInteractionRequired(userInteractionRequired.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.EnrollmentFlagsV2Property =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.EnrollmentFlagsV2Property,
    ) : CdkObject(cdkObject), EnrollmentFlagsV2Property {
      override fun enableKeyReuseOnNtTokenKeysetStorageFull(): Any? =
          unwrap(this).getEnableKeyReuseOnNtTokenKeysetStorageFull()

      override fun includeSymmetricAlgorithms(): Any? = unwrap(this).getIncludeSymmetricAlgorithms()

      override fun noSecurityExtension(): Any? = unwrap(this).getNoSecurityExtension()

      override fun removeInvalidCertificateFromPersonalStore(): Any? =
          unwrap(this).getRemoveInvalidCertificateFromPersonalStore()

      override fun userInteractionRequired(): Any? = unwrap(this).getUserInteractionRequired()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EnrollmentFlagsV2Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.EnrollmentFlagsV2Property):
          EnrollmentFlagsV2Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnrollmentFlagsV2Property):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.EnrollmentFlagsV2Property =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.EnrollmentFlagsV2Property
    }
  }

  public interface ApplicationPolicyProperty {
    public fun policyObjectIdentifier(): String? = unwrap(this).getPolicyObjectIdentifier()

    public fun policyType(): String? = unwrap(this).getPolicyType()

    @CdkDslMarker
    public interface Builder {
      public fun policyObjectIdentifier(policyObjectIdentifier: String)

      public fun policyType(policyType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ApplicationPolicyProperty.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ApplicationPolicyProperty.builder()

      override fun policyObjectIdentifier(policyObjectIdentifier: String) {
        cdkBuilder.policyObjectIdentifier(policyObjectIdentifier)
      }

      override fun policyType(policyType: String) {
        cdkBuilder.policyType(policyType)
      }

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ApplicationPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ApplicationPolicyProperty,
    ) : CdkObject(cdkObject), ApplicationPolicyProperty {
      override fun policyObjectIdentifier(): String? = unwrap(this).getPolicyObjectIdentifier()

      override fun policyType(): String? = unwrap(this).getPolicyType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ApplicationPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ApplicationPolicyProperty):
          ApplicationPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApplicationPolicyProperty):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ApplicationPolicyProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ApplicationPolicyProperty
    }
  }

  public interface ApplicationPoliciesProperty {
    public fun critical(): Any? = unwrap(this).getCritical()

    public fun policies(): Any

    @CdkDslMarker
    public interface Builder {
      public fun critical(critical: Boolean)

      public fun critical(critical: IResolvable)

      public fun policies(policies: IResolvable)

      public fun policies(policies: List<Any>)

      public fun policies(vararg policies: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ApplicationPoliciesProperty.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ApplicationPoliciesProperty.builder()

      override fun critical(critical: Boolean) {
        cdkBuilder.critical(critical)
      }

      override fun critical(critical: IResolvable) {
        cdkBuilder.critical(critical.let(IResolvable::unwrap))
      }

      override fun policies(policies: IResolvable) {
        cdkBuilder.policies(policies.let(IResolvable::unwrap))
      }

      override fun policies(policies: List<Any>) {
        cdkBuilder.policies(policies)
      }

      override fun policies(vararg policies: Any): Unit = policies(policies.toList())

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ApplicationPoliciesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ApplicationPoliciesProperty,
    ) : CdkObject(cdkObject), ApplicationPoliciesProperty {
      override fun critical(): Any? = unwrap(this).getCritical()

      override fun policies(): Any = unwrap(this).getPolicies()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ApplicationPoliciesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ApplicationPoliciesProperty):
          ApplicationPoliciesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApplicationPoliciesProperty):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ApplicationPoliciesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ApplicationPoliciesProperty
    }
  }

  public interface KeyUsagePropertyFlagsProperty {
    public fun decrypt(): Any? = unwrap(this).getDecrypt()

    public fun keyAgreement(): Any? = unwrap(this).getKeyAgreement()

    public fun sign(): Any? = unwrap(this).getSign()

    @CdkDslMarker
    public interface Builder {
      public fun decrypt(decrypt: Boolean)

      public fun decrypt(decrypt: IResolvable)

      public fun keyAgreement(keyAgreement: Boolean)

      public fun keyAgreement(keyAgreement: IResolvable)

      public fun sign(sign: Boolean)

      public fun sign(sign: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsagePropertyFlagsProperty.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsagePropertyFlagsProperty.builder()

      override fun decrypt(decrypt: Boolean) {
        cdkBuilder.decrypt(decrypt)
      }

      override fun decrypt(decrypt: IResolvable) {
        cdkBuilder.decrypt(decrypt.let(IResolvable::unwrap))
      }

      override fun keyAgreement(keyAgreement: Boolean) {
        cdkBuilder.keyAgreement(keyAgreement)
      }

      override fun keyAgreement(keyAgreement: IResolvable) {
        cdkBuilder.keyAgreement(keyAgreement.let(IResolvable::unwrap))
      }

      override fun sign(sign: Boolean) {
        cdkBuilder.sign(sign)
      }

      override fun sign(sign: IResolvable) {
        cdkBuilder.sign(sign.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsagePropertyFlagsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsagePropertyFlagsProperty,
    ) : CdkObject(cdkObject), KeyUsagePropertyFlagsProperty {
      override fun decrypt(): Any? = unwrap(this).getDecrypt()

      override fun keyAgreement(): Any? = unwrap(this).getKeyAgreement()

      override fun sign(): Any? = unwrap(this).getSign()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KeyUsagePropertyFlagsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsagePropertyFlagsProperty):
          KeyUsagePropertyFlagsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KeyUsagePropertyFlagsProperty):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsagePropertyFlagsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsagePropertyFlagsProperty
    }
  }

  public interface ExtensionsV2Property {
    public fun applicationPolicies(): Any? = unwrap(this).getApplicationPolicies()

    public fun keyUsage(): Any

    @CdkDslMarker
    public interface Builder {
      public fun applicationPolicies(applicationPolicies: IResolvable)

      public fun applicationPolicies(applicationPolicies: ApplicationPoliciesProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a828670bec1d28e8cc1a2d50058b79d351f6c153d40af2f570d8060b6444d726")
      public
          fun applicationPolicies(applicationPolicies: ApplicationPoliciesProperty.Builder.() -> Unit)

      public fun keyUsage(keyUsage: IResolvable)

      public fun keyUsage(keyUsage: KeyUsageProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9c693eed2a201cdc50ab632d8b3801ac042a7a5b25b4ead1c4ddc1c28256cf4e")
      public fun keyUsage(keyUsage: KeyUsageProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ExtensionsV2Property.Builder =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ExtensionsV2Property.builder()

      override fun applicationPolicies(applicationPolicies: IResolvable) {
        cdkBuilder.applicationPolicies(applicationPolicies.let(IResolvable::unwrap))
      }

      override fun applicationPolicies(applicationPolicies: ApplicationPoliciesProperty) {
        cdkBuilder.applicationPolicies(applicationPolicies.let(ApplicationPoliciesProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a828670bec1d28e8cc1a2d50058b79d351f6c153d40af2f570d8060b6444d726")
      override
          fun applicationPolicies(applicationPolicies: ApplicationPoliciesProperty.Builder.() -> Unit):
          Unit = applicationPolicies(ApplicationPoliciesProperty(applicationPolicies))

      override fun keyUsage(keyUsage: IResolvable) {
        cdkBuilder.keyUsage(keyUsage.let(IResolvable::unwrap))
      }

      override fun keyUsage(keyUsage: KeyUsageProperty) {
        cdkBuilder.keyUsage(keyUsage.let(KeyUsageProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9c693eed2a201cdc50ab632d8b3801ac042a7a5b25b4ead1c4ddc1c28256cf4e")
      override fun keyUsage(keyUsage: KeyUsageProperty.Builder.() -> Unit): Unit =
          keyUsage(KeyUsageProperty(keyUsage))

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ExtensionsV2Property =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ExtensionsV2Property,
    ) : CdkObject(cdkObject), ExtensionsV2Property {
      override fun applicationPolicies(): Any? = unwrap(this).getApplicationPolicies()

      override fun keyUsage(): Any = unwrap(this).getKeyUsage()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ExtensionsV2Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ExtensionsV2Property):
          ExtensionsV2Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExtensionsV2Property):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ExtensionsV2Property = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ExtensionsV2Property
    }
  }

  public interface SubjectNameFlagsV3Property {
    public fun requireCommonName(): Any? = unwrap(this).getRequireCommonName()

    public fun requireDirectoryPath(): Any? = unwrap(this).getRequireDirectoryPath()

    public fun requireDnsAsCn(): Any? = unwrap(this).getRequireDnsAsCn()

    public fun requireEmail(): Any? = unwrap(this).getRequireEmail()

    public fun sanRequireDirectoryGuid(): Any? = unwrap(this).getSanRequireDirectoryGuid()

    public fun sanRequireDns(): Any? = unwrap(this).getSanRequireDns()

    public fun sanRequireDomainDns(): Any? = unwrap(this).getSanRequireDomainDns()

    public fun sanRequireEmail(): Any? = unwrap(this).getSanRequireEmail()

    public fun sanRequireSpn(): Any? = unwrap(this).getSanRequireSpn()

    public fun sanRequireUpn(): Any? = unwrap(this).getSanRequireUpn()

    @CdkDslMarker
    public interface Builder {
      public fun requireCommonName(requireCommonName: Boolean)

      public fun requireCommonName(requireCommonName: IResolvable)

      public fun requireDirectoryPath(requireDirectoryPath: Boolean)

      public fun requireDirectoryPath(requireDirectoryPath: IResolvable)

      public fun requireDnsAsCn(requireDnsAsCn: Boolean)

      public fun requireDnsAsCn(requireDnsAsCn: IResolvable)

      public fun requireEmail(requireEmail: Boolean)

      public fun requireEmail(requireEmail: IResolvable)

      public fun sanRequireDirectoryGuid(sanRequireDirectoryGuid: Boolean)

      public fun sanRequireDirectoryGuid(sanRequireDirectoryGuid: IResolvable)

      public fun sanRequireDns(sanRequireDns: Boolean)

      public fun sanRequireDns(sanRequireDns: IResolvable)

      public fun sanRequireDomainDns(sanRequireDomainDns: Boolean)

      public fun sanRequireDomainDns(sanRequireDomainDns: IResolvable)

      public fun sanRequireEmail(sanRequireEmail: Boolean)

      public fun sanRequireEmail(sanRequireEmail: IResolvable)

      public fun sanRequireSpn(sanRequireSpn: Boolean)

      public fun sanRequireSpn(sanRequireSpn: IResolvable)

      public fun sanRequireUpn(sanRequireUpn: Boolean)

      public fun sanRequireUpn(sanRequireUpn: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.SubjectNameFlagsV3Property.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.SubjectNameFlagsV3Property.builder()

      override fun requireCommonName(requireCommonName: Boolean) {
        cdkBuilder.requireCommonName(requireCommonName)
      }

      override fun requireCommonName(requireCommonName: IResolvable) {
        cdkBuilder.requireCommonName(requireCommonName.let(IResolvable::unwrap))
      }

      override fun requireDirectoryPath(requireDirectoryPath: Boolean) {
        cdkBuilder.requireDirectoryPath(requireDirectoryPath)
      }

      override fun requireDirectoryPath(requireDirectoryPath: IResolvable) {
        cdkBuilder.requireDirectoryPath(requireDirectoryPath.let(IResolvable::unwrap))
      }

      override fun requireDnsAsCn(requireDnsAsCn: Boolean) {
        cdkBuilder.requireDnsAsCn(requireDnsAsCn)
      }

      override fun requireDnsAsCn(requireDnsAsCn: IResolvable) {
        cdkBuilder.requireDnsAsCn(requireDnsAsCn.let(IResolvable::unwrap))
      }

      override fun requireEmail(requireEmail: Boolean) {
        cdkBuilder.requireEmail(requireEmail)
      }

      override fun requireEmail(requireEmail: IResolvable) {
        cdkBuilder.requireEmail(requireEmail.let(IResolvable::unwrap))
      }

      override fun sanRequireDirectoryGuid(sanRequireDirectoryGuid: Boolean) {
        cdkBuilder.sanRequireDirectoryGuid(sanRequireDirectoryGuid)
      }

      override fun sanRequireDirectoryGuid(sanRequireDirectoryGuid: IResolvable) {
        cdkBuilder.sanRequireDirectoryGuid(sanRequireDirectoryGuid.let(IResolvable::unwrap))
      }

      override fun sanRequireDns(sanRequireDns: Boolean) {
        cdkBuilder.sanRequireDns(sanRequireDns)
      }

      override fun sanRequireDns(sanRequireDns: IResolvable) {
        cdkBuilder.sanRequireDns(sanRequireDns.let(IResolvable::unwrap))
      }

      override fun sanRequireDomainDns(sanRequireDomainDns: Boolean) {
        cdkBuilder.sanRequireDomainDns(sanRequireDomainDns)
      }

      override fun sanRequireDomainDns(sanRequireDomainDns: IResolvable) {
        cdkBuilder.sanRequireDomainDns(sanRequireDomainDns.let(IResolvable::unwrap))
      }

      override fun sanRequireEmail(sanRequireEmail: Boolean) {
        cdkBuilder.sanRequireEmail(sanRequireEmail)
      }

      override fun sanRequireEmail(sanRequireEmail: IResolvable) {
        cdkBuilder.sanRequireEmail(sanRequireEmail.let(IResolvable::unwrap))
      }

      override fun sanRequireSpn(sanRequireSpn: Boolean) {
        cdkBuilder.sanRequireSpn(sanRequireSpn)
      }

      override fun sanRequireSpn(sanRequireSpn: IResolvable) {
        cdkBuilder.sanRequireSpn(sanRequireSpn.let(IResolvable::unwrap))
      }

      override fun sanRequireUpn(sanRequireUpn: Boolean) {
        cdkBuilder.sanRequireUpn(sanRequireUpn)
      }

      override fun sanRequireUpn(sanRequireUpn: IResolvable) {
        cdkBuilder.sanRequireUpn(sanRequireUpn.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.SubjectNameFlagsV3Property =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.SubjectNameFlagsV3Property,
    ) : CdkObject(cdkObject), SubjectNameFlagsV3Property {
      override fun requireCommonName(): Any? = unwrap(this).getRequireCommonName()

      override fun requireDirectoryPath(): Any? = unwrap(this).getRequireDirectoryPath()

      override fun requireDnsAsCn(): Any? = unwrap(this).getRequireDnsAsCn()

      override fun requireEmail(): Any? = unwrap(this).getRequireEmail()

      override fun sanRequireDirectoryGuid(): Any? = unwrap(this).getSanRequireDirectoryGuid()

      override fun sanRequireDns(): Any? = unwrap(this).getSanRequireDns()

      override fun sanRequireDomainDns(): Any? = unwrap(this).getSanRequireDomainDns()

      override fun sanRequireEmail(): Any? = unwrap(this).getSanRequireEmail()

      override fun sanRequireSpn(): Any? = unwrap(this).getSanRequireSpn()

      override fun sanRequireUpn(): Any? = unwrap(this).getSanRequireUpn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SubjectNameFlagsV3Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.SubjectNameFlagsV3Property):
          SubjectNameFlagsV3Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SubjectNameFlagsV3Property):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.SubjectNameFlagsV3Property =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.SubjectNameFlagsV3Property
    }
  }

  public interface PrivateKeyFlagsV3Property {
    public fun clientVersion(): String

    public fun exportableKey(): Any? = unwrap(this).getExportableKey()

    public fun requireAlternateSignatureAlgorithm(): Any? =
        unwrap(this).getRequireAlternateSignatureAlgorithm()

    public fun strongKeyProtectionRequired(): Any? = unwrap(this).getStrongKeyProtectionRequired()

    @CdkDslMarker
    public interface Builder {
      public fun clientVersion(clientVersion: String)

      public fun exportableKey(exportableKey: Boolean)

      public fun exportableKey(exportableKey: IResolvable)

      public fun requireAlternateSignatureAlgorithm(requireAlternateSignatureAlgorithm: Boolean)

      public fun requireAlternateSignatureAlgorithm(requireAlternateSignatureAlgorithm: IResolvable)

      public fun strongKeyProtectionRequired(strongKeyProtectionRequired: Boolean)

      public fun strongKeyProtectionRequired(strongKeyProtectionRequired: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyFlagsV3Property.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyFlagsV3Property.builder()

      override fun clientVersion(clientVersion: String) {
        cdkBuilder.clientVersion(clientVersion)
      }

      override fun exportableKey(exportableKey: Boolean) {
        cdkBuilder.exportableKey(exportableKey)
      }

      override fun exportableKey(exportableKey: IResolvable) {
        cdkBuilder.exportableKey(exportableKey.let(IResolvable::unwrap))
      }

      override fun requireAlternateSignatureAlgorithm(requireAlternateSignatureAlgorithm: Boolean) {
        cdkBuilder.requireAlternateSignatureAlgorithm(requireAlternateSignatureAlgorithm)
      }

      override
          fun requireAlternateSignatureAlgorithm(requireAlternateSignatureAlgorithm: IResolvable) {
        cdkBuilder.requireAlternateSignatureAlgorithm(requireAlternateSignatureAlgorithm.let(IResolvable::unwrap))
      }

      override fun strongKeyProtectionRequired(strongKeyProtectionRequired: Boolean) {
        cdkBuilder.strongKeyProtectionRequired(strongKeyProtectionRequired)
      }

      override fun strongKeyProtectionRequired(strongKeyProtectionRequired: IResolvable) {
        cdkBuilder.strongKeyProtectionRequired(strongKeyProtectionRequired.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyFlagsV3Property =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyFlagsV3Property,
    ) : CdkObject(cdkObject), PrivateKeyFlagsV3Property {
      override fun clientVersion(): String = unwrap(this).getClientVersion()

      override fun exportableKey(): Any? = unwrap(this).getExportableKey()

      override fun requireAlternateSignatureAlgorithm(): Any? =
          unwrap(this).getRequireAlternateSignatureAlgorithm()

      override fun strongKeyProtectionRequired(): Any? =
          unwrap(this).getStrongKeyProtectionRequired()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PrivateKeyFlagsV3Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyFlagsV3Property):
          PrivateKeyFlagsV3Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrivateKeyFlagsV3Property):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyFlagsV3Property =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyFlagsV3Property
    }
  }

  public interface PrivateKeyFlagsV2Property {
    public fun clientVersion(): String

    public fun exportableKey(): Any? = unwrap(this).getExportableKey()

    public fun strongKeyProtectionRequired(): Any? = unwrap(this).getStrongKeyProtectionRequired()

    @CdkDslMarker
    public interface Builder {
      public fun clientVersion(clientVersion: String)

      public fun exportableKey(exportableKey: Boolean)

      public fun exportableKey(exportableKey: IResolvable)

      public fun strongKeyProtectionRequired(strongKeyProtectionRequired: Boolean)

      public fun strongKeyProtectionRequired(strongKeyProtectionRequired: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyFlagsV2Property.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyFlagsV2Property.builder()

      override fun clientVersion(clientVersion: String) {
        cdkBuilder.clientVersion(clientVersion)
      }

      override fun exportableKey(exportableKey: Boolean) {
        cdkBuilder.exportableKey(exportableKey)
      }

      override fun exportableKey(exportableKey: IResolvable) {
        cdkBuilder.exportableKey(exportableKey.let(IResolvable::unwrap))
      }

      override fun strongKeyProtectionRequired(strongKeyProtectionRequired: Boolean) {
        cdkBuilder.strongKeyProtectionRequired(strongKeyProtectionRequired)
      }

      override fun strongKeyProtectionRequired(strongKeyProtectionRequired: IResolvable) {
        cdkBuilder.strongKeyProtectionRequired(strongKeyProtectionRequired.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyFlagsV2Property =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyFlagsV2Property,
    ) : CdkObject(cdkObject), PrivateKeyFlagsV2Property {
      override fun clientVersion(): String = unwrap(this).getClientVersion()

      override fun exportableKey(): Any? = unwrap(this).getExportableKey()

      override fun strongKeyProtectionRequired(): Any? =
          unwrap(this).getStrongKeyProtectionRequired()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PrivateKeyFlagsV2Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyFlagsV2Property):
          PrivateKeyFlagsV2Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrivateKeyFlagsV2Property):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyFlagsV2Property =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyFlagsV2Property
    }
  }

  public interface EnrollmentFlagsV4Property {
    public fun enableKeyReuseOnNtTokenKeysetStorageFull(): Any? =
        unwrap(this).getEnableKeyReuseOnNtTokenKeysetStorageFull()

    public fun includeSymmetricAlgorithms(): Any? = unwrap(this).getIncludeSymmetricAlgorithms()

    public fun noSecurityExtension(): Any? = unwrap(this).getNoSecurityExtension()

    public fun removeInvalidCertificateFromPersonalStore(): Any? =
        unwrap(this).getRemoveInvalidCertificateFromPersonalStore()

    public fun userInteractionRequired(): Any? = unwrap(this).getUserInteractionRequired()

    @CdkDslMarker
    public interface Builder {
      public
          fun enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull: Boolean)

      public
          fun enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull: IResolvable)

      public fun includeSymmetricAlgorithms(includeSymmetricAlgorithms: Boolean)

      public fun includeSymmetricAlgorithms(includeSymmetricAlgorithms: IResolvable)

      public fun noSecurityExtension(noSecurityExtension: Boolean)

      public fun noSecurityExtension(noSecurityExtension: IResolvable)

      public
          fun removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore: Boolean)

      public
          fun removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore: IResolvable)

      public fun userInteractionRequired(userInteractionRequired: Boolean)

      public fun userInteractionRequired(userInteractionRequired: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.EnrollmentFlagsV4Property.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.EnrollmentFlagsV4Property.builder()

      override
          fun enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull: Boolean) {
        cdkBuilder.enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull)
      }

      override
          fun enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull: IResolvable) {
        cdkBuilder.enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull.let(IResolvable::unwrap))
      }

      override fun includeSymmetricAlgorithms(includeSymmetricAlgorithms: Boolean) {
        cdkBuilder.includeSymmetricAlgorithms(includeSymmetricAlgorithms)
      }

      override fun includeSymmetricAlgorithms(includeSymmetricAlgorithms: IResolvable) {
        cdkBuilder.includeSymmetricAlgorithms(includeSymmetricAlgorithms.let(IResolvable::unwrap))
      }

      override fun noSecurityExtension(noSecurityExtension: Boolean) {
        cdkBuilder.noSecurityExtension(noSecurityExtension)
      }

      override fun noSecurityExtension(noSecurityExtension: IResolvable) {
        cdkBuilder.noSecurityExtension(noSecurityExtension.let(IResolvable::unwrap))
      }

      override
          fun removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore: Boolean) {
        cdkBuilder.removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore)
      }

      override
          fun removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore: IResolvable) {
        cdkBuilder.removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore.let(IResolvable::unwrap))
      }

      override fun userInteractionRequired(userInteractionRequired: Boolean) {
        cdkBuilder.userInteractionRequired(userInteractionRequired)
      }

      override fun userInteractionRequired(userInteractionRequired: IResolvable) {
        cdkBuilder.userInteractionRequired(userInteractionRequired.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.EnrollmentFlagsV4Property =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.EnrollmentFlagsV4Property,
    ) : CdkObject(cdkObject), EnrollmentFlagsV4Property {
      override fun enableKeyReuseOnNtTokenKeysetStorageFull(): Any? =
          unwrap(this).getEnableKeyReuseOnNtTokenKeysetStorageFull()

      override fun includeSymmetricAlgorithms(): Any? = unwrap(this).getIncludeSymmetricAlgorithms()

      override fun noSecurityExtension(): Any? = unwrap(this).getNoSecurityExtension()

      override fun removeInvalidCertificateFromPersonalStore(): Any? =
          unwrap(this).getRemoveInvalidCertificateFromPersonalStore()

      override fun userInteractionRequired(): Any? = unwrap(this).getUserInteractionRequired()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EnrollmentFlagsV4Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.EnrollmentFlagsV4Property):
          EnrollmentFlagsV4Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnrollmentFlagsV4Property):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.EnrollmentFlagsV4Property =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.EnrollmentFlagsV4Property
    }
  }

  public interface GeneralFlagsV2Property {
    public fun autoEnrollment(): Any? = unwrap(this).getAutoEnrollment()

    public fun machineType(): Any? = unwrap(this).getMachineType()

    @CdkDslMarker
    public interface Builder {
      public fun autoEnrollment(autoEnrollment: Boolean)

      public fun autoEnrollment(autoEnrollment: IResolvable)

      public fun machineType(machineType: Boolean)

      public fun machineType(machineType: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.GeneralFlagsV2Property.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.GeneralFlagsV2Property.builder()

      override fun autoEnrollment(autoEnrollment: Boolean) {
        cdkBuilder.autoEnrollment(autoEnrollment)
      }

      override fun autoEnrollment(autoEnrollment: IResolvable) {
        cdkBuilder.autoEnrollment(autoEnrollment.let(IResolvable::unwrap))
      }

      override fun machineType(machineType: Boolean) {
        cdkBuilder.machineType(machineType)
      }

      override fun machineType(machineType: IResolvable) {
        cdkBuilder.machineType(machineType.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.GeneralFlagsV2Property =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.GeneralFlagsV2Property,
    ) : CdkObject(cdkObject), GeneralFlagsV2Property {
      override fun autoEnrollment(): Any? = unwrap(this).getAutoEnrollment()

      override fun machineType(): Any? = unwrap(this).getMachineType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GeneralFlagsV2Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.GeneralFlagsV2Property):
          GeneralFlagsV2Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GeneralFlagsV2Property):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.GeneralFlagsV2Property =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.GeneralFlagsV2Property
    }
  }

  public interface TemplateV4Property {
    public fun certificateValidity(): Any

    public fun enrollmentFlags(): Any

    public fun extensions(): Any

    public fun generalFlags(): Any

    public fun hashAlgorithm(): String? = unwrap(this).getHashAlgorithm()

    public fun privateKeyAttributes(): Any

    public fun privateKeyFlags(): Any

    public fun subjectNameFlags(): Any

    public fun supersededTemplates(): List<String> = unwrap(this).getSupersededTemplates() ?:
        emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun certificateValidity(certificateValidity: IResolvable)

      public fun certificateValidity(certificateValidity: CertificateValidityProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("55dd8886fc4c9948f8aa99716fca4040366000833355877e601984221f778f4e")
      public
          fun certificateValidity(certificateValidity: CertificateValidityProperty.Builder.() -> Unit)

      public fun enrollmentFlags(enrollmentFlags: IResolvable)

      public fun enrollmentFlags(enrollmentFlags: EnrollmentFlagsV4Property)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d51914c61b8f44a21a9a22e35001e6c0c694326a9d9131492a526e81ca0a49a3")
      public fun enrollmentFlags(enrollmentFlags: EnrollmentFlagsV4Property.Builder.() -> Unit)

      public fun extensions(extensions: IResolvable)

      public fun extensions(extensions: ExtensionsV4Property)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0a63a09053edb0fe5c88cc378c47555e4c8b13312e68297cc01e6bf85b458588")
      public fun extensions(extensions: ExtensionsV4Property.Builder.() -> Unit)

      public fun generalFlags(generalFlags: IResolvable)

      public fun generalFlags(generalFlags: GeneralFlagsV4Property)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("80c2c7feaa734b88333c5a09f8ed2ab4625a9dc2d0bfd63f47ee74feba72ae97")
      public fun generalFlags(generalFlags: GeneralFlagsV4Property.Builder.() -> Unit)

      public fun hashAlgorithm(hashAlgorithm: String)

      public fun privateKeyAttributes(privateKeyAttributes: IResolvable)

      public fun privateKeyAttributes(privateKeyAttributes: PrivateKeyAttributesV4Property)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e5fdb8ab909b7abf3d0405077de5868673cea833a48d9786672c9c8ccf972267")
      public
          fun privateKeyAttributes(privateKeyAttributes: PrivateKeyAttributesV4Property.Builder.() -> Unit)

      public fun privateKeyFlags(privateKeyFlags: IResolvable)

      public fun privateKeyFlags(privateKeyFlags: PrivateKeyFlagsV4Property)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("87e0334fce042b80678ea7decf78aae0e4ef5fc1969d92f39affe94d6a863693")
      public fun privateKeyFlags(privateKeyFlags: PrivateKeyFlagsV4Property.Builder.() -> Unit)

      public fun subjectNameFlags(subjectNameFlags: IResolvable)

      public fun subjectNameFlags(subjectNameFlags: SubjectNameFlagsV4Property)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ab6eca7ccc213d5db4890825ad29953086900441d71d217ea45feb46d6ad1f9")
      public fun subjectNameFlags(subjectNameFlags: SubjectNameFlagsV4Property.Builder.() -> Unit)

      public fun supersededTemplates(supersededTemplates: List<String>)

      public fun supersededTemplates(vararg supersededTemplates: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateV4Property.Builder =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateV4Property.builder()

      override fun certificateValidity(certificateValidity: IResolvable) {
        cdkBuilder.certificateValidity(certificateValidity.let(IResolvable::unwrap))
      }

      override fun certificateValidity(certificateValidity: CertificateValidityProperty) {
        cdkBuilder.certificateValidity(certificateValidity.let(CertificateValidityProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("55dd8886fc4c9948f8aa99716fca4040366000833355877e601984221f778f4e")
      override
          fun certificateValidity(certificateValidity: CertificateValidityProperty.Builder.() -> Unit):
          Unit = certificateValidity(CertificateValidityProperty(certificateValidity))

      override fun enrollmentFlags(enrollmentFlags: IResolvable) {
        cdkBuilder.enrollmentFlags(enrollmentFlags.let(IResolvable::unwrap))
      }

      override fun enrollmentFlags(enrollmentFlags: EnrollmentFlagsV4Property) {
        cdkBuilder.enrollmentFlags(enrollmentFlags.let(EnrollmentFlagsV4Property::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d51914c61b8f44a21a9a22e35001e6c0c694326a9d9131492a526e81ca0a49a3")
      override fun enrollmentFlags(enrollmentFlags: EnrollmentFlagsV4Property.Builder.() -> Unit):
          Unit = enrollmentFlags(EnrollmentFlagsV4Property(enrollmentFlags))

      override fun extensions(extensions: IResolvable) {
        cdkBuilder.extensions(extensions.let(IResolvable::unwrap))
      }

      override fun extensions(extensions: ExtensionsV4Property) {
        cdkBuilder.extensions(extensions.let(ExtensionsV4Property::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0a63a09053edb0fe5c88cc378c47555e4c8b13312e68297cc01e6bf85b458588")
      override fun extensions(extensions: ExtensionsV4Property.Builder.() -> Unit): Unit =
          extensions(ExtensionsV4Property(extensions))

      override fun generalFlags(generalFlags: IResolvable) {
        cdkBuilder.generalFlags(generalFlags.let(IResolvable::unwrap))
      }

      override fun generalFlags(generalFlags: GeneralFlagsV4Property) {
        cdkBuilder.generalFlags(generalFlags.let(GeneralFlagsV4Property::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("80c2c7feaa734b88333c5a09f8ed2ab4625a9dc2d0bfd63f47ee74feba72ae97")
      override fun generalFlags(generalFlags: GeneralFlagsV4Property.Builder.() -> Unit): Unit =
          generalFlags(GeneralFlagsV4Property(generalFlags))

      override fun hashAlgorithm(hashAlgorithm: String) {
        cdkBuilder.hashAlgorithm(hashAlgorithm)
      }

      override fun privateKeyAttributes(privateKeyAttributes: IResolvable) {
        cdkBuilder.privateKeyAttributes(privateKeyAttributes.let(IResolvable::unwrap))
      }

      override fun privateKeyAttributes(privateKeyAttributes: PrivateKeyAttributesV4Property) {
        cdkBuilder.privateKeyAttributes(privateKeyAttributes.let(PrivateKeyAttributesV4Property::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e5fdb8ab909b7abf3d0405077de5868673cea833a48d9786672c9c8ccf972267")
      override
          fun privateKeyAttributes(privateKeyAttributes: PrivateKeyAttributesV4Property.Builder.() -> Unit):
          Unit = privateKeyAttributes(PrivateKeyAttributesV4Property(privateKeyAttributes))

      override fun privateKeyFlags(privateKeyFlags: IResolvable) {
        cdkBuilder.privateKeyFlags(privateKeyFlags.let(IResolvable::unwrap))
      }

      override fun privateKeyFlags(privateKeyFlags: PrivateKeyFlagsV4Property) {
        cdkBuilder.privateKeyFlags(privateKeyFlags.let(PrivateKeyFlagsV4Property::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("87e0334fce042b80678ea7decf78aae0e4ef5fc1969d92f39affe94d6a863693")
      override fun privateKeyFlags(privateKeyFlags: PrivateKeyFlagsV4Property.Builder.() -> Unit):
          Unit = privateKeyFlags(PrivateKeyFlagsV4Property(privateKeyFlags))

      override fun subjectNameFlags(subjectNameFlags: IResolvable) {
        cdkBuilder.subjectNameFlags(subjectNameFlags.let(IResolvable::unwrap))
      }

      override fun subjectNameFlags(subjectNameFlags: SubjectNameFlagsV4Property) {
        cdkBuilder.subjectNameFlags(subjectNameFlags.let(SubjectNameFlagsV4Property::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ab6eca7ccc213d5db4890825ad29953086900441d71d217ea45feb46d6ad1f9")
      override
          fun subjectNameFlags(subjectNameFlags: SubjectNameFlagsV4Property.Builder.() -> Unit):
          Unit = subjectNameFlags(SubjectNameFlagsV4Property(subjectNameFlags))

      override fun supersededTemplates(supersededTemplates: List<String>) {
        cdkBuilder.supersededTemplates(supersededTemplates)
      }

      override fun supersededTemplates(vararg supersededTemplates: String): Unit =
          supersededTemplates(supersededTemplates.toList())

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateV4Property =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateV4Property,
    ) : CdkObject(cdkObject), TemplateV4Property {
      override fun certificateValidity(): Any = unwrap(this).getCertificateValidity()

      override fun enrollmentFlags(): Any = unwrap(this).getEnrollmentFlags()

      override fun extensions(): Any = unwrap(this).getExtensions()

      override fun generalFlags(): Any = unwrap(this).getGeneralFlags()

      override fun hashAlgorithm(): String? = unwrap(this).getHashAlgorithm()

      override fun privateKeyAttributes(): Any = unwrap(this).getPrivateKeyAttributes()

      override fun privateKeyFlags(): Any = unwrap(this).getPrivateKeyFlags()

      override fun subjectNameFlags(): Any = unwrap(this).getSubjectNameFlags()

      override fun supersededTemplates(): List<String> = unwrap(this).getSupersededTemplates() ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TemplateV4Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateV4Property):
          TemplateV4Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TemplateV4Property):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateV4Property = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateV4Property
    }
  }

  public interface CertificateValidityProperty {
    public fun renewalPeriod(): Any

    public fun validityPeriod(): Any

    @CdkDslMarker
    public interface Builder {
      public fun renewalPeriod(renewalPeriod: IResolvable)

      public fun renewalPeriod(renewalPeriod: ValidityPeriodProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("074d06ca33d33e75e9aa8418600945d8d29663f6d1be76c0343c2cf70cff619c")
      public fun renewalPeriod(renewalPeriod: ValidityPeriodProperty.Builder.() -> Unit)

      public fun validityPeriod(validityPeriod: IResolvable)

      public fun validityPeriod(validityPeriod: ValidityPeriodProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("762e9ab84bc09a28664eaa5d5953d5389f0fa6cb433ee08b768232b09f3c7410")
      public fun validityPeriod(validityPeriod: ValidityPeriodProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.CertificateValidityProperty.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.CertificateValidityProperty.builder()

      override fun renewalPeriod(renewalPeriod: IResolvable) {
        cdkBuilder.renewalPeriod(renewalPeriod.let(IResolvable::unwrap))
      }

      override fun renewalPeriod(renewalPeriod: ValidityPeriodProperty) {
        cdkBuilder.renewalPeriod(renewalPeriod.let(ValidityPeriodProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("074d06ca33d33e75e9aa8418600945d8d29663f6d1be76c0343c2cf70cff619c")
      override fun renewalPeriod(renewalPeriod: ValidityPeriodProperty.Builder.() -> Unit): Unit =
          renewalPeriod(ValidityPeriodProperty(renewalPeriod))

      override fun validityPeriod(validityPeriod: IResolvable) {
        cdkBuilder.validityPeriod(validityPeriod.let(IResolvable::unwrap))
      }

      override fun validityPeriod(validityPeriod: ValidityPeriodProperty) {
        cdkBuilder.validityPeriod(validityPeriod.let(ValidityPeriodProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("762e9ab84bc09a28664eaa5d5953d5389f0fa6cb433ee08b768232b09f3c7410")
      override fun validityPeriod(validityPeriod: ValidityPeriodProperty.Builder.() -> Unit): Unit =
          validityPeriod(ValidityPeriodProperty(validityPeriod))

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.CertificateValidityProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.CertificateValidityProperty,
    ) : CdkObject(cdkObject), CertificateValidityProperty {
      override fun renewalPeriod(): Any = unwrap(this).getRenewalPeriod()

      override fun validityPeriod(): Any = unwrap(this).getValidityPeriod()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CertificateValidityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.CertificateValidityProperty):
          CertificateValidityProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CertificateValidityProperty):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.CertificateValidityProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.CertificateValidityProperty
    }
  }

  public interface PrivateKeyFlagsV4Property {
    public fun clientVersion(): String

    public fun exportableKey(): Any? = unwrap(this).getExportableKey()

    public fun requireAlternateSignatureAlgorithm(): Any? =
        unwrap(this).getRequireAlternateSignatureAlgorithm()

    public fun requireSameKeyRenewal(): Any? = unwrap(this).getRequireSameKeyRenewal()

    public fun strongKeyProtectionRequired(): Any? = unwrap(this).getStrongKeyProtectionRequired()

    public fun useLegacyProvider(): Any? = unwrap(this).getUseLegacyProvider()

    @CdkDslMarker
    public interface Builder {
      public fun clientVersion(clientVersion: String)

      public fun exportableKey(exportableKey: Boolean)

      public fun exportableKey(exportableKey: IResolvable)

      public fun requireAlternateSignatureAlgorithm(requireAlternateSignatureAlgorithm: Boolean)

      public fun requireAlternateSignatureAlgorithm(requireAlternateSignatureAlgorithm: IResolvable)

      public fun requireSameKeyRenewal(requireSameKeyRenewal: Boolean)

      public fun requireSameKeyRenewal(requireSameKeyRenewal: IResolvable)

      public fun strongKeyProtectionRequired(strongKeyProtectionRequired: Boolean)

      public fun strongKeyProtectionRequired(strongKeyProtectionRequired: IResolvable)

      public fun useLegacyProvider(useLegacyProvider: Boolean)

      public fun useLegacyProvider(useLegacyProvider: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyFlagsV4Property.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyFlagsV4Property.builder()

      override fun clientVersion(clientVersion: String) {
        cdkBuilder.clientVersion(clientVersion)
      }

      override fun exportableKey(exportableKey: Boolean) {
        cdkBuilder.exportableKey(exportableKey)
      }

      override fun exportableKey(exportableKey: IResolvable) {
        cdkBuilder.exportableKey(exportableKey.let(IResolvable::unwrap))
      }

      override fun requireAlternateSignatureAlgorithm(requireAlternateSignatureAlgorithm: Boolean) {
        cdkBuilder.requireAlternateSignatureAlgorithm(requireAlternateSignatureAlgorithm)
      }

      override
          fun requireAlternateSignatureAlgorithm(requireAlternateSignatureAlgorithm: IResolvable) {
        cdkBuilder.requireAlternateSignatureAlgorithm(requireAlternateSignatureAlgorithm.let(IResolvable::unwrap))
      }

      override fun requireSameKeyRenewal(requireSameKeyRenewal: Boolean) {
        cdkBuilder.requireSameKeyRenewal(requireSameKeyRenewal)
      }

      override fun requireSameKeyRenewal(requireSameKeyRenewal: IResolvable) {
        cdkBuilder.requireSameKeyRenewal(requireSameKeyRenewal.let(IResolvable::unwrap))
      }

      override fun strongKeyProtectionRequired(strongKeyProtectionRequired: Boolean) {
        cdkBuilder.strongKeyProtectionRequired(strongKeyProtectionRequired)
      }

      override fun strongKeyProtectionRequired(strongKeyProtectionRequired: IResolvable) {
        cdkBuilder.strongKeyProtectionRequired(strongKeyProtectionRequired.let(IResolvable::unwrap))
      }

      override fun useLegacyProvider(useLegacyProvider: Boolean) {
        cdkBuilder.useLegacyProvider(useLegacyProvider)
      }

      override fun useLegacyProvider(useLegacyProvider: IResolvable) {
        cdkBuilder.useLegacyProvider(useLegacyProvider.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyFlagsV4Property =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyFlagsV4Property,
    ) : CdkObject(cdkObject), PrivateKeyFlagsV4Property {
      override fun clientVersion(): String = unwrap(this).getClientVersion()

      override fun exportableKey(): Any? = unwrap(this).getExportableKey()

      override fun requireAlternateSignatureAlgorithm(): Any? =
          unwrap(this).getRequireAlternateSignatureAlgorithm()

      override fun requireSameKeyRenewal(): Any? = unwrap(this).getRequireSameKeyRenewal()

      override fun strongKeyProtectionRequired(): Any? =
          unwrap(this).getStrongKeyProtectionRequired()

      override fun useLegacyProvider(): Any? = unwrap(this).getUseLegacyProvider()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PrivateKeyFlagsV4Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyFlagsV4Property):
          PrivateKeyFlagsV4Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrivateKeyFlagsV4Property):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyFlagsV4Property =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyFlagsV4Property
    }
  }

  public interface ExtensionsV4Property {
    public fun applicationPolicies(): Any? = unwrap(this).getApplicationPolicies()

    public fun keyUsage(): Any

    @CdkDslMarker
    public interface Builder {
      public fun applicationPolicies(applicationPolicies: IResolvable)

      public fun applicationPolicies(applicationPolicies: ApplicationPoliciesProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("675d22ebbe7e9e9c07c73217c59014a96cdbd81d23ef77e4d48bc82a7ba6ae7b")
      public
          fun applicationPolicies(applicationPolicies: ApplicationPoliciesProperty.Builder.() -> Unit)

      public fun keyUsage(keyUsage: IResolvable)

      public fun keyUsage(keyUsage: KeyUsageProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("776a28e32dec6f401fe6ac8cef051766a5972ba4f4657a12e9d95cbe6aeaa65a")
      public fun keyUsage(keyUsage: KeyUsageProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ExtensionsV4Property.Builder =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ExtensionsV4Property.builder()

      override fun applicationPolicies(applicationPolicies: IResolvable) {
        cdkBuilder.applicationPolicies(applicationPolicies.let(IResolvable::unwrap))
      }

      override fun applicationPolicies(applicationPolicies: ApplicationPoliciesProperty) {
        cdkBuilder.applicationPolicies(applicationPolicies.let(ApplicationPoliciesProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("675d22ebbe7e9e9c07c73217c59014a96cdbd81d23ef77e4d48bc82a7ba6ae7b")
      override
          fun applicationPolicies(applicationPolicies: ApplicationPoliciesProperty.Builder.() -> Unit):
          Unit = applicationPolicies(ApplicationPoliciesProperty(applicationPolicies))

      override fun keyUsage(keyUsage: IResolvable) {
        cdkBuilder.keyUsage(keyUsage.let(IResolvable::unwrap))
      }

      override fun keyUsage(keyUsage: KeyUsageProperty) {
        cdkBuilder.keyUsage(keyUsage.let(KeyUsageProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("776a28e32dec6f401fe6ac8cef051766a5972ba4f4657a12e9d95cbe6aeaa65a")
      override fun keyUsage(keyUsage: KeyUsageProperty.Builder.() -> Unit): Unit =
          keyUsage(KeyUsageProperty(keyUsage))

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ExtensionsV4Property =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ExtensionsV4Property,
    ) : CdkObject(cdkObject), ExtensionsV4Property {
      override fun applicationPolicies(): Any? = unwrap(this).getApplicationPolicies()

      override fun keyUsage(): Any = unwrap(this).getKeyUsage()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ExtensionsV4Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ExtensionsV4Property):
          ExtensionsV4Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExtensionsV4Property):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ExtensionsV4Property = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ExtensionsV4Property
    }
  }

  public interface GeneralFlagsV3Property {
    public fun autoEnrollment(): Any? = unwrap(this).getAutoEnrollment()

    public fun machineType(): Any? = unwrap(this).getMachineType()

    @CdkDslMarker
    public interface Builder {
      public fun autoEnrollment(autoEnrollment: Boolean)

      public fun autoEnrollment(autoEnrollment: IResolvable)

      public fun machineType(machineType: Boolean)

      public fun machineType(machineType: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.GeneralFlagsV3Property.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.GeneralFlagsV3Property.builder()

      override fun autoEnrollment(autoEnrollment: Boolean) {
        cdkBuilder.autoEnrollment(autoEnrollment)
      }

      override fun autoEnrollment(autoEnrollment: IResolvable) {
        cdkBuilder.autoEnrollment(autoEnrollment.let(IResolvable::unwrap))
      }

      override fun machineType(machineType: Boolean) {
        cdkBuilder.machineType(machineType)
      }

      override fun machineType(machineType: IResolvable) {
        cdkBuilder.machineType(machineType.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.GeneralFlagsV3Property =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.GeneralFlagsV3Property,
    ) : CdkObject(cdkObject), GeneralFlagsV3Property {
      override fun autoEnrollment(): Any? = unwrap(this).getAutoEnrollment()

      override fun machineType(): Any? = unwrap(this).getMachineType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GeneralFlagsV3Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.GeneralFlagsV3Property):
          GeneralFlagsV3Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GeneralFlagsV3Property):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.GeneralFlagsV3Property =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.GeneralFlagsV3Property
    }
  }

  public interface ValidityPeriodProperty {
    public fun period(): Number

    public fun periodType(): String

    @CdkDslMarker
    public interface Builder {
      public fun period(period: Number)

      public fun periodType(periodType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ValidityPeriodProperty.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ValidityPeriodProperty.builder()

      override fun period(period: Number) {
        cdkBuilder.period(period)
      }

      override fun periodType(periodType: String) {
        cdkBuilder.periodType(periodType)
      }

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ValidityPeriodProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ValidityPeriodProperty,
    ) : CdkObject(cdkObject), ValidityPeriodProperty {
      override fun period(): Number = unwrap(this).getPeriod()

      override fun periodType(): String = unwrap(this).getPeriodType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ValidityPeriodProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ValidityPeriodProperty):
          ValidityPeriodProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ValidityPeriodProperty):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ValidityPeriodProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ValidityPeriodProperty
    }
  }
}
