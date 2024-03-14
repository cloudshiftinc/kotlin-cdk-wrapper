package io.cloudshiftdev.awscdk.services.pcaconnectorad

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTemplate internal constructor(
  private val cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate,
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

  @Suppress("INAPPLICABLE_JVM_NAME")
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

  public interface Builder {
    public fun connectorArn(connectorArn: String) {
    }

    public fun definition(definition: IResolvable) {
    }

    public fun definition(definition: TemplateDefinitionProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cef2610f97300dba7dafb1ad089a958eae72f1f84cf52f8f01ac23b494d60356")
    public fun definition(definition: TemplateDefinitionProperty.Builder.() -> Unit) {
    }

    public fun name(name: String) {
    }

    public fun reenrollAllCertificateHolders(reenrollAllCertificateHolders: Boolean) {
    }

    public fun reenrollAllCertificateHolders(reenrollAllCertificateHolders: IResolvable) {
    }

    public fun tags(tags: Map<String, String>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.Builder =
        software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.Builder.create(scope, id)

    public override fun connectorArn(connectorArn: String) {
      cdkBuilder.connectorArn(connectorArn)
    }

    public override fun definition(definition: IResolvable) {
      cdkBuilder.definition(definition.let(IResolvable::unwrap))
    }

    public override fun definition(definition: TemplateDefinitionProperty) {
      cdkBuilder.definition(definition.let(TemplateDefinitionProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cef2610f97300dba7dafb1ad089a958eae72f1f84cf52f8f01ac23b494d60356")
    public override fun definition(definition: TemplateDefinitionProperty.Builder.() -> Unit): Unit
        = definition(TemplateDefinitionProperty(definition))

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun reenrollAllCertificateHolders(reenrollAllCertificateHolders: Boolean) {
      cdkBuilder.reenrollAllCertificateHolders(reenrollAllCertificateHolders)
    }

    public override fun reenrollAllCertificateHolders(reenrollAllCertificateHolders: IResolvable) {
      cdkBuilder.reenrollAllCertificateHolders(reenrollAllCertificateHolders.let(IResolvable::unwrap))
    }

    public override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.pcaconnectorad.CfnTemplate =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

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

    public interface Builder {
      public fun applicationPolicies(applicationPolicies: IResolvable) {
      }

      public fun applicationPolicies(applicationPolicies: ApplicationPoliciesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8201469e5ac85f25a2c135e7e4ed5c98b23b3a388d059e52d970ec6e4eed8bed")
      public
          fun applicationPolicies(applicationPolicies: ApplicationPoliciesProperty.Builder.() -> Unit) {
      }

      public fun keyUsage(keyUsage: IResolvable) {
      }

      public fun keyUsage(keyUsage: KeyUsageProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8fdb8ba610d030b037f4ef5b4054447e0abc901ccda837564f1317f8515adc8d")
      public fun keyUsage(keyUsage: KeyUsageProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ExtensionsV3Property.Builder =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ExtensionsV3Property.builder()

      public override fun applicationPolicies(applicationPolicies: IResolvable) {
        cdkBuilder.applicationPolicies(applicationPolicies.let(IResolvable::unwrap))
      }

      public override fun applicationPolicies(applicationPolicies: ApplicationPoliciesProperty) {
        cdkBuilder.applicationPolicies(applicationPolicies.let(ApplicationPoliciesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8201469e5ac85f25a2c135e7e4ed5c98b23b3a388d059e52d970ec6e4eed8bed")
      public override
          fun applicationPolicies(applicationPolicies: ApplicationPoliciesProperty.Builder.() -> Unit):
          Unit = applicationPolicies(ApplicationPoliciesProperty(applicationPolicies))

      public override fun keyUsage(keyUsage: IResolvable) {
        cdkBuilder.keyUsage(keyUsage.let(IResolvable::unwrap))
      }

      public override fun keyUsage(keyUsage: KeyUsageProperty) {
        cdkBuilder.keyUsage(keyUsage.let(KeyUsageProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8fdb8ba610d030b037f4ef5b4054447e0abc901ccda837564f1317f8515adc8d")
      public override fun keyUsage(keyUsage: KeyUsageProperty.Builder.() -> Unit): Unit =
          keyUsage(KeyUsageProperty(keyUsage))

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ExtensionsV3Property =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ExtensionsV3Property,
    ) : ExtensionsV3Property {
      public override fun applicationPolicies(): Any? = unwrap(this).getApplicationPolicies()

      public override fun keyUsage(): Any = unwrap(this).getKeyUsage()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ExtensionsV3Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ExtensionsV3Property):
          ExtensionsV3Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExtensionsV3Property):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ExtensionsV3Property = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface KeyUsageFlagsProperty {
    public fun dataEncipherment(): Any? = unwrap(this).getDataEncipherment()

    public fun digitalSignature(): Any? = unwrap(this).getDigitalSignature()

    public fun keyAgreement(): Any? = unwrap(this).getKeyAgreement()

    public fun keyEncipherment(): Any? = unwrap(this).getKeyEncipherment()

    public fun nonRepudiation(): Any? = unwrap(this).getNonRepudiation()

    public interface Builder {
      public fun dataEncipherment(dataEncipherment: Boolean) {
      }

      public fun dataEncipherment(dataEncipherment: IResolvable) {
      }

      public fun digitalSignature(digitalSignature: Boolean) {
      }

      public fun digitalSignature(digitalSignature: IResolvable) {
      }

      public fun keyAgreement(keyAgreement: Boolean) {
      }

      public fun keyAgreement(keyAgreement: IResolvable) {
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
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsageFlagsProperty.Builder =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsageFlagsProperty.builder()

      public override fun dataEncipherment(dataEncipherment: Boolean) {
        cdkBuilder.dataEncipherment(dataEncipherment)
      }

      public override fun dataEncipherment(dataEncipherment: IResolvable) {
        cdkBuilder.dataEncipherment(dataEncipherment.let(IResolvable::unwrap))
      }

      public override fun digitalSignature(digitalSignature: Boolean) {
        cdkBuilder.digitalSignature(digitalSignature)
      }

      public override fun digitalSignature(digitalSignature: IResolvable) {
        cdkBuilder.digitalSignature(digitalSignature.let(IResolvable::unwrap))
      }

      public override fun keyAgreement(keyAgreement: Boolean) {
        cdkBuilder.keyAgreement(keyAgreement)
      }

      public override fun keyAgreement(keyAgreement: IResolvable) {
        cdkBuilder.keyAgreement(keyAgreement.let(IResolvable::unwrap))
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

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsageFlagsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsageFlagsProperty,
    ) : KeyUsageFlagsProperty {
      public override fun dataEncipherment(): Any? = unwrap(this).getDataEncipherment()

      public override fun digitalSignature(): Any? = unwrap(this).getDigitalSignature()

      public override fun keyAgreement(): Any? = unwrap(this).getKeyAgreement()

      public override fun keyEncipherment(): Any? = unwrap(this).getKeyEncipherment()

      public override fun nonRepudiation(): Any? = unwrap(this).getNonRepudiation()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KeyUsageFlagsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsageFlagsProperty):
          KeyUsageFlagsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KeyUsageFlagsProperty):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsageFlagsProperty =
          (wrapped as Wrapper).cdkObject
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

    public interface Builder {
      public fun certificateValidity(certificateValidity: IResolvable) {
      }

      public fun certificateValidity(certificateValidity: CertificateValidityProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f7ddf8a48640e737a7dfb8c01e91d6ec86073099caa5ab11876f97de1c9d158e")
      public
          fun certificateValidity(certificateValidity: CertificateValidityProperty.Builder.() -> Unit) {
      }

      public fun enrollmentFlags(enrollmentFlags: IResolvable) {
      }

      public fun enrollmentFlags(enrollmentFlags: EnrollmentFlagsV2Property) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2a1cd137d82b18c2e0e4e97700db5329cc81e74cfa8a4bf9419e1f91d4ea49c5")
      public fun enrollmentFlags(enrollmentFlags: EnrollmentFlagsV2Property.Builder.() -> Unit) {
      }

      public fun extensions(extensions: IResolvable) {
      }

      public fun extensions(extensions: ExtensionsV2Property) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb6ebcef6730c962cd58bb1186d3f8631c828df66203546ae139d1b2ccd20777")
      public fun extensions(extensions: ExtensionsV2Property.Builder.() -> Unit) {
      }

      public fun generalFlags(generalFlags: IResolvable) {
      }

      public fun generalFlags(generalFlags: GeneralFlagsV2Property) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d5bad24f0c50e9df1b3bbd2144d57cf0f6992496e2136c9734c09b1d0529f10")
      public fun generalFlags(generalFlags: GeneralFlagsV2Property.Builder.() -> Unit) {
      }

      public fun privateKeyAttributes(privateKeyAttributes: IResolvable) {
      }

      public fun privateKeyAttributes(privateKeyAttributes: PrivateKeyAttributesV2Property) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ba95fa0808a14ad4ce0aa08eca2cfa255df3a5ba6dfbdfb46b03028de13bc3de")
      public
          fun privateKeyAttributes(privateKeyAttributes: PrivateKeyAttributesV2Property.Builder.() -> Unit) {
      }

      public fun privateKeyFlags(privateKeyFlags: IResolvable) {
      }

      public fun privateKeyFlags(privateKeyFlags: PrivateKeyFlagsV2Property) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f2c5a481fc2c9f7b56b47b9c458feb8a9ff5f1a3a33ffac98279acb301662149")
      public fun privateKeyFlags(privateKeyFlags: PrivateKeyFlagsV2Property.Builder.() -> Unit) {
      }

      public fun subjectNameFlags(subjectNameFlags: IResolvable) {
      }

      public fun subjectNameFlags(subjectNameFlags: SubjectNameFlagsV2Property) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("83b125f0bd827f94cfd9493a0411c660dd8e0a0890d0b23276b036d39d32491a")
      public fun subjectNameFlags(subjectNameFlags: SubjectNameFlagsV2Property.Builder.() -> Unit) {
      }

      public fun supersededTemplates(supersededTemplates: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateV2Property.Builder =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateV2Property.builder()

      public override fun certificateValidity(certificateValidity: IResolvable) {
        cdkBuilder.certificateValidity(certificateValidity.let(IResolvable::unwrap))
      }

      public override fun certificateValidity(certificateValidity: CertificateValidityProperty) {
        cdkBuilder.certificateValidity(certificateValidity.let(CertificateValidityProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f7ddf8a48640e737a7dfb8c01e91d6ec86073099caa5ab11876f97de1c9d158e")
      public override
          fun certificateValidity(certificateValidity: CertificateValidityProperty.Builder.() -> Unit):
          Unit = certificateValidity(CertificateValidityProperty(certificateValidity))

      public override fun enrollmentFlags(enrollmentFlags: IResolvable) {
        cdkBuilder.enrollmentFlags(enrollmentFlags.let(IResolvable::unwrap))
      }

      public override fun enrollmentFlags(enrollmentFlags: EnrollmentFlagsV2Property) {
        cdkBuilder.enrollmentFlags(enrollmentFlags.let(EnrollmentFlagsV2Property::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2a1cd137d82b18c2e0e4e97700db5329cc81e74cfa8a4bf9419e1f91d4ea49c5")
      public override
          fun enrollmentFlags(enrollmentFlags: EnrollmentFlagsV2Property.Builder.() -> Unit): Unit =
          enrollmentFlags(EnrollmentFlagsV2Property(enrollmentFlags))

      public override fun extensions(extensions: IResolvable) {
        cdkBuilder.extensions(extensions.let(IResolvable::unwrap))
      }

      public override fun extensions(extensions: ExtensionsV2Property) {
        cdkBuilder.extensions(extensions.let(ExtensionsV2Property::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb6ebcef6730c962cd58bb1186d3f8631c828df66203546ae139d1b2ccd20777")
      public override fun extensions(extensions: ExtensionsV2Property.Builder.() -> Unit): Unit =
          extensions(ExtensionsV2Property(extensions))

      public override fun generalFlags(generalFlags: IResolvable) {
        cdkBuilder.generalFlags(generalFlags.let(IResolvable::unwrap))
      }

      public override fun generalFlags(generalFlags: GeneralFlagsV2Property) {
        cdkBuilder.generalFlags(generalFlags.let(GeneralFlagsV2Property::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d5bad24f0c50e9df1b3bbd2144d57cf0f6992496e2136c9734c09b1d0529f10")
      public override fun generalFlags(generalFlags: GeneralFlagsV2Property.Builder.() -> Unit):
          Unit = generalFlags(GeneralFlagsV2Property(generalFlags))

      public override fun privateKeyAttributes(privateKeyAttributes: IResolvable) {
        cdkBuilder.privateKeyAttributes(privateKeyAttributes.let(IResolvable::unwrap))
      }

      public override
          fun privateKeyAttributes(privateKeyAttributes: PrivateKeyAttributesV2Property) {
        cdkBuilder.privateKeyAttributes(privateKeyAttributes.let(PrivateKeyAttributesV2Property::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ba95fa0808a14ad4ce0aa08eca2cfa255df3a5ba6dfbdfb46b03028de13bc3de")
      public override
          fun privateKeyAttributes(privateKeyAttributes: PrivateKeyAttributesV2Property.Builder.() -> Unit):
          Unit = privateKeyAttributes(PrivateKeyAttributesV2Property(privateKeyAttributes))

      public override fun privateKeyFlags(privateKeyFlags: IResolvable) {
        cdkBuilder.privateKeyFlags(privateKeyFlags.let(IResolvable::unwrap))
      }

      public override fun privateKeyFlags(privateKeyFlags: PrivateKeyFlagsV2Property) {
        cdkBuilder.privateKeyFlags(privateKeyFlags.let(PrivateKeyFlagsV2Property::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f2c5a481fc2c9f7b56b47b9c458feb8a9ff5f1a3a33ffac98279acb301662149")
      public override
          fun privateKeyFlags(privateKeyFlags: PrivateKeyFlagsV2Property.Builder.() -> Unit): Unit =
          privateKeyFlags(PrivateKeyFlagsV2Property(privateKeyFlags))

      public override fun subjectNameFlags(subjectNameFlags: IResolvable) {
        cdkBuilder.subjectNameFlags(subjectNameFlags.let(IResolvable::unwrap))
      }

      public override fun subjectNameFlags(subjectNameFlags: SubjectNameFlagsV2Property) {
        cdkBuilder.subjectNameFlags(subjectNameFlags.let(SubjectNameFlagsV2Property::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("83b125f0bd827f94cfd9493a0411c660dd8e0a0890d0b23276b036d39d32491a")
      public override
          fun subjectNameFlags(subjectNameFlags: SubjectNameFlagsV2Property.Builder.() -> Unit):
          Unit = subjectNameFlags(SubjectNameFlagsV2Property(subjectNameFlags))

      public override fun supersededTemplates(supersededTemplates: List<String>) {
        cdkBuilder.supersededTemplates(supersededTemplates)
      }

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateV2Property =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateV2Property,
    ) : TemplateV2Property {
      public override fun certificateValidity(): Any = unwrap(this).getCertificateValidity()

      public override fun enrollmentFlags(): Any = unwrap(this).getEnrollmentFlags()

      public override fun extensions(): Any = unwrap(this).getExtensions()

      public override fun generalFlags(): Any = unwrap(this).getGeneralFlags()

      public override fun privateKeyAttributes(): Any = unwrap(this).getPrivateKeyAttributes()

      public override fun privateKeyFlags(): Any = unwrap(this).getPrivateKeyFlags()

      public override fun subjectNameFlags(): Any = unwrap(this).getSubjectNameFlags()

      public override fun supersededTemplates(): List<String> =
          unwrap(this).getSupersededTemplates() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TemplateV2Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateV2Property):
          TemplateV2Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TemplateV2Property):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateV2Property = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface KeyUsageProperty {
    public fun critical(): Any? = unwrap(this).getCritical()

    public fun usageFlags(): Any

    public interface Builder {
      public fun critical(critical: Boolean) {
      }

      public fun critical(critical: IResolvable) {
      }

      public fun usageFlags(usageFlags: IResolvable) {
      }

      public fun usageFlags(usageFlags: KeyUsageFlagsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ad3e4f3b9ba170b2557434b15baa9537680ce57819b2f576d9ac89d90bd87379")
      public fun usageFlags(usageFlags: KeyUsageFlagsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsageProperty.Builder =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsageProperty.builder()

      public override fun critical(critical: Boolean) {
        cdkBuilder.critical(critical)
      }

      public override fun critical(critical: IResolvable) {
        cdkBuilder.critical(critical.let(IResolvable::unwrap))
      }

      public override fun usageFlags(usageFlags: IResolvable) {
        cdkBuilder.usageFlags(usageFlags.let(IResolvable::unwrap))
      }

      public override fun usageFlags(usageFlags: KeyUsageFlagsProperty) {
        cdkBuilder.usageFlags(usageFlags.let(KeyUsageFlagsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ad3e4f3b9ba170b2557434b15baa9537680ce57819b2f576d9ac89d90bd87379")
      public override fun usageFlags(usageFlags: KeyUsageFlagsProperty.Builder.() -> Unit): Unit =
          usageFlags(KeyUsageFlagsProperty(usageFlags))

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsageProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsageProperty,
    ) : KeyUsageProperty {
      public override fun critical(): Any? = unwrap(this).getCritical()

      public override fun usageFlags(): Any = unwrap(this).getUsageFlags()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KeyUsageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsageProperty):
          KeyUsageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KeyUsageProperty):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsageProperty = (wrapped as
          Wrapper).cdkObject
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

    public interface Builder {
      public fun certificateValidity(certificateValidity: IResolvable) {
      }

      public fun certificateValidity(certificateValidity: CertificateValidityProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1b6b6939ffe11c55beac7c67c3b4879e5a1a4029250ca09537762918500b3ccc")
      public
          fun certificateValidity(certificateValidity: CertificateValidityProperty.Builder.() -> Unit) {
      }

      public fun enrollmentFlags(enrollmentFlags: IResolvable) {
      }

      public fun enrollmentFlags(enrollmentFlags: EnrollmentFlagsV3Property) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2387907f2e61871793058ad93675ef9449de1ad63481d0d6102b41edcd1993ae")
      public fun enrollmentFlags(enrollmentFlags: EnrollmentFlagsV3Property.Builder.() -> Unit) {
      }

      public fun extensions(extensions: IResolvable) {
      }

      public fun extensions(extensions: ExtensionsV3Property) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1ab1155439ebdbb752b82bf871553f556cbe9afb7ea2c4be5e4beae179a5a3de")
      public fun extensions(extensions: ExtensionsV3Property.Builder.() -> Unit) {
      }

      public fun generalFlags(generalFlags: IResolvable) {
      }

      public fun generalFlags(generalFlags: GeneralFlagsV3Property) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7c4023e5983bceddfc9b5909dc8a23d93ee4b23655c9b9b3ff5673973fcab4f2")
      public fun generalFlags(generalFlags: GeneralFlagsV3Property.Builder.() -> Unit) {
      }

      public fun hashAlgorithm(hashAlgorithm: String) {
      }

      public fun privateKeyAttributes(privateKeyAttributes: IResolvable) {
      }

      public fun privateKeyAttributes(privateKeyAttributes: PrivateKeyAttributesV3Property) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0a42e704bd0416ff8c15f257af353a2711d4c678bdcf6cc476e03a97d0ae4919")
      public
          fun privateKeyAttributes(privateKeyAttributes: PrivateKeyAttributesV3Property.Builder.() -> Unit) {
      }

      public fun privateKeyFlags(privateKeyFlags: IResolvable) {
      }

      public fun privateKeyFlags(privateKeyFlags: PrivateKeyFlagsV3Property) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("19bacd33063fdaa7addef79b60830df1aa411968033af897c8760077c983846c")
      public fun privateKeyFlags(privateKeyFlags: PrivateKeyFlagsV3Property.Builder.() -> Unit) {
      }

      public fun subjectNameFlags(subjectNameFlags: IResolvable) {
      }

      public fun subjectNameFlags(subjectNameFlags: SubjectNameFlagsV3Property) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6e3e2f0d878259f2c2177ed7ce9a7646b08c78946cf7ba3f021bd62f50e9936c")
      public fun subjectNameFlags(subjectNameFlags: SubjectNameFlagsV3Property.Builder.() -> Unit) {
      }

      public fun supersededTemplates(supersededTemplates: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateV3Property.Builder =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateV3Property.builder()

      public override fun certificateValidity(certificateValidity: IResolvable) {
        cdkBuilder.certificateValidity(certificateValidity.let(IResolvable::unwrap))
      }

      public override fun certificateValidity(certificateValidity: CertificateValidityProperty) {
        cdkBuilder.certificateValidity(certificateValidity.let(CertificateValidityProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1b6b6939ffe11c55beac7c67c3b4879e5a1a4029250ca09537762918500b3ccc")
      public override
          fun certificateValidity(certificateValidity: CertificateValidityProperty.Builder.() -> Unit):
          Unit = certificateValidity(CertificateValidityProperty(certificateValidity))

      public override fun enrollmentFlags(enrollmentFlags: IResolvable) {
        cdkBuilder.enrollmentFlags(enrollmentFlags.let(IResolvable::unwrap))
      }

      public override fun enrollmentFlags(enrollmentFlags: EnrollmentFlagsV3Property) {
        cdkBuilder.enrollmentFlags(enrollmentFlags.let(EnrollmentFlagsV3Property::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2387907f2e61871793058ad93675ef9449de1ad63481d0d6102b41edcd1993ae")
      public override
          fun enrollmentFlags(enrollmentFlags: EnrollmentFlagsV3Property.Builder.() -> Unit): Unit =
          enrollmentFlags(EnrollmentFlagsV3Property(enrollmentFlags))

      public override fun extensions(extensions: IResolvable) {
        cdkBuilder.extensions(extensions.let(IResolvable::unwrap))
      }

      public override fun extensions(extensions: ExtensionsV3Property) {
        cdkBuilder.extensions(extensions.let(ExtensionsV3Property::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1ab1155439ebdbb752b82bf871553f556cbe9afb7ea2c4be5e4beae179a5a3de")
      public override fun extensions(extensions: ExtensionsV3Property.Builder.() -> Unit): Unit =
          extensions(ExtensionsV3Property(extensions))

      public override fun generalFlags(generalFlags: IResolvable) {
        cdkBuilder.generalFlags(generalFlags.let(IResolvable::unwrap))
      }

      public override fun generalFlags(generalFlags: GeneralFlagsV3Property) {
        cdkBuilder.generalFlags(generalFlags.let(GeneralFlagsV3Property::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7c4023e5983bceddfc9b5909dc8a23d93ee4b23655c9b9b3ff5673973fcab4f2")
      public override fun generalFlags(generalFlags: GeneralFlagsV3Property.Builder.() -> Unit):
          Unit = generalFlags(GeneralFlagsV3Property(generalFlags))

      public override fun hashAlgorithm(hashAlgorithm: String) {
        cdkBuilder.hashAlgorithm(hashAlgorithm)
      }

      public override fun privateKeyAttributes(privateKeyAttributes: IResolvable) {
        cdkBuilder.privateKeyAttributes(privateKeyAttributes.let(IResolvable::unwrap))
      }

      public override
          fun privateKeyAttributes(privateKeyAttributes: PrivateKeyAttributesV3Property) {
        cdkBuilder.privateKeyAttributes(privateKeyAttributes.let(PrivateKeyAttributesV3Property::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0a42e704bd0416ff8c15f257af353a2711d4c678bdcf6cc476e03a97d0ae4919")
      public override
          fun privateKeyAttributes(privateKeyAttributes: PrivateKeyAttributesV3Property.Builder.() -> Unit):
          Unit = privateKeyAttributes(PrivateKeyAttributesV3Property(privateKeyAttributes))

      public override fun privateKeyFlags(privateKeyFlags: IResolvable) {
        cdkBuilder.privateKeyFlags(privateKeyFlags.let(IResolvable::unwrap))
      }

      public override fun privateKeyFlags(privateKeyFlags: PrivateKeyFlagsV3Property) {
        cdkBuilder.privateKeyFlags(privateKeyFlags.let(PrivateKeyFlagsV3Property::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("19bacd33063fdaa7addef79b60830df1aa411968033af897c8760077c983846c")
      public override
          fun privateKeyFlags(privateKeyFlags: PrivateKeyFlagsV3Property.Builder.() -> Unit): Unit =
          privateKeyFlags(PrivateKeyFlagsV3Property(privateKeyFlags))

      public override fun subjectNameFlags(subjectNameFlags: IResolvable) {
        cdkBuilder.subjectNameFlags(subjectNameFlags.let(IResolvable::unwrap))
      }

      public override fun subjectNameFlags(subjectNameFlags: SubjectNameFlagsV3Property) {
        cdkBuilder.subjectNameFlags(subjectNameFlags.let(SubjectNameFlagsV3Property::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6e3e2f0d878259f2c2177ed7ce9a7646b08c78946cf7ba3f021bd62f50e9936c")
      public override
          fun subjectNameFlags(subjectNameFlags: SubjectNameFlagsV3Property.Builder.() -> Unit):
          Unit = subjectNameFlags(SubjectNameFlagsV3Property(subjectNameFlags))

      public override fun supersededTemplates(supersededTemplates: List<String>) {
        cdkBuilder.supersededTemplates(supersededTemplates)
      }

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateV3Property =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateV3Property,
    ) : TemplateV3Property {
      public override fun certificateValidity(): Any = unwrap(this).getCertificateValidity()

      public override fun enrollmentFlags(): Any = unwrap(this).getEnrollmentFlags()

      public override fun extensions(): Any = unwrap(this).getExtensions()

      public override fun generalFlags(): Any = unwrap(this).getGeneralFlags()

      public override fun hashAlgorithm(): String = unwrap(this).getHashAlgorithm()

      public override fun privateKeyAttributes(): Any = unwrap(this).getPrivateKeyAttributes()

      public override fun privateKeyFlags(): Any = unwrap(this).getPrivateKeyFlags()

      public override fun subjectNameFlags(): Any = unwrap(this).getSubjectNameFlags()

      public override fun supersededTemplates(): List<String> =
          unwrap(this).getSupersededTemplates() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TemplateV3Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateV3Property):
          TemplateV3Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TemplateV3Property):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateV3Property = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface TemplateDefinitionProperty {
    public fun templateV2(): Any? = unwrap(this).getTemplateV2()

    public fun templateV3(): Any? = unwrap(this).getTemplateV3()

    public fun templateV4(): Any? = unwrap(this).getTemplateV4()

    public interface Builder {
      public fun templateV2(templateV2: IResolvable) {
      }

      public fun templateV2(templateV2: TemplateV2Property) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("01b45117b08b7836177cd5f5bd6dfea2d426f968546b6c8f9616e636271e91dc")
      public fun templateV2(templateV2: TemplateV2Property.Builder.() -> Unit) {
      }

      public fun templateV3(templateV3: IResolvable) {
      }

      public fun templateV3(templateV3: TemplateV3Property) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f5142db8cbb835d2c94551906d0f203a25d0aa36fd7966e642016fae6fef13f6")
      public fun templateV3(templateV3: TemplateV3Property.Builder.() -> Unit) {
      }

      public fun templateV4(templateV4: IResolvable) {
      }

      public fun templateV4(templateV4: TemplateV4Property) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a274da345eb1b0d816427862afd3c0b8bb813f2ec62ebf00e8c40e80ee736a4f")
      public fun templateV4(templateV4: TemplateV4Property.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateDefinitionProperty.builder()

      public override fun templateV2(templateV2: IResolvable) {
        cdkBuilder.templateV2(templateV2.let(IResolvable::unwrap))
      }

      public override fun templateV2(templateV2: TemplateV2Property) {
        cdkBuilder.templateV2(templateV2.let(TemplateV2Property::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("01b45117b08b7836177cd5f5bd6dfea2d426f968546b6c8f9616e636271e91dc")
      public override fun templateV2(templateV2: TemplateV2Property.Builder.() -> Unit): Unit =
          templateV2(TemplateV2Property(templateV2))

      public override fun templateV3(templateV3: IResolvable) {
        cdkBuilder.templateV3(templateV3.let(IResolvable::unwrap))
      }

      public override fun templateV3(templateV3: TemplateV3Property) {
        cdkBuilder.templateV3(templateV3.let(TemplateV3Property::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f5142db8cbb835d2c94551906d0f203a25d0aa36fd7966e642016fae6fef13f6")
      public override fun templateV3(templateV3: TemplateV3Property.Builder.() -> Unit): Unit =
          templateV3(TemplateV3Property(templateV3))

      public override fun templateV4(templateV4: IResolvable) {
        cdkBuilder.templateV4(templateV4.let(IResolvable::unwrap))
      }

      public override fun templateV4(templateV4: TemplateV4Property) {
        cdkBuilder.templateV4(templateV4.let(TemplateV4Property::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a274da345eb1b0d816427862afd3c0b8bb813f2ec62ebf00e8c40e80ee736a4f")
      public override fun templateV4(templateV4: TemplateV4Property.Builder.() -> Unit): Unit =
          templateV4(TemplateV4Property(templateV4))

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateDefinitionProperty,
    ) : TemplateDefinitionProperty {
      public override fun templateV2(): Any? = unwrap(this).getTemplateV2()

      public override fun templateV3(): Any? = unwrap(this).getTemplateV3()

      public override fun templateV4(): Any? = unwrap(this).getTemplateV4()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TemplateDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateDefinitionProperty):
          TemplateDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TemplateDefinitionProperty):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateDefinitionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface KeyUsagePropertyProperty {
    public fun propertyFlags(): Any? = unwrap(this).getPropertyFlags()

    public fun propertyType(): String? = unwrap(this).getPropertyType()

    public interface Builder {
      public fun propertyFlags(propertyFlags: IResolvable) {
      }

      public fun propertyFlags(propertyFlags: KeyUsagePropertyFlagsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7d650478be89420c8682f59b49461f47f84cdefa1fef1dfc8316cc539e14cce6")
      public fun propertyFlags(propertyFlags: KeyUsagePropertyFlagsProperty.Builder.() -> Unit) {
      }

      public fun propertyType(propertyType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsagePropertyProperty.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsagePropertyProperty.builder()

      public override fun propertyFlags(propertyFlags: IResolvable) {
        cdkBuilder.propertyFlags(propertyFlags.let(IResolvable::unwrap))
      }

      public override fun propertyFlags(propertyFlags: KeyUsagePropertyFlagsProperty) {
        cdkBuilder.propertyFlags(propertyFlags.let(KeyUsagePropertyFlagsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7d650478be89420c8682f59b49461f47f84cdefa1fef1dfc8316cc539e14cce6")
      public override
          fun propertyFlags(propertyFlags: KeyUsagePropertyFlagsProperty.Builder.() -> Unit): Unit =
          propertyFlags(KeyUsagePropertyFlagsProperty(propertyFlags))

      public override fun propertyType(propertyType: String) {
        cdkBuilder.propertyType(propertyType)
      }

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsagePropertyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsagePropertyProperty,
    ) : KeyUsagePropertyProperty {
      public override fun propertyFlags(): Any? = unwrap(this).getPropertyFlags()

      public override fun propertyType(): String? = unwrap(this).getPropertyType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KeyUsagePropertyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsagePropertyProperty):
          KeyUsagePropertyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KeyUsagePropertyProperty):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsagePropertyProperty =
          (wrapped as Wrapper).cdkObject
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

    public interface Builder {
      public fun requireCommonName(requireCommonName: Boolean) {
      }

      public fun requireCommonName(requireCommonName: IResolvable) {
      }

      public fun requireDirectoryPath(requireDirectoryPath: Boolean) {
      }

      public fun requireDirectoryPath(requireDirectoryPath: IResolvable) {
      }

      public fun requireDnsAsCn(requireDnsAsCn: Boolean) {
      }

      public fun requireDnsAsCn(requireDnsAsCn: IResolvable) {
      }

      public fun requireEmail(requireEmail: Boolean) {
      }

      public fun requireEmail(requireEmail: IResolvable) {
      }

      public fun sanRequireDirectoryGuid(sanRequireDirectoryGuid: Boolean) {
      }

      public fun sanRequireDirectoryGuid(sanRequireDirectoryGuid: IResolvable) {
      }

      public fun sanRequireDns(sanRequireDns: Boolean) {
      }

      public fun sanRequireDns(sanRequireDns: IResolvable) {
      }

      public fun sanRequireDomainDns(sanRequireDomainDns: Boolean) {
      }

      public fun sanRequireDomainDns(sanRequireDomainDns: IResolvable) {
      }

      public fun sanRequireEmail(sanRequireEmail: Boolean) {
      }

      public fun sanRequireEmail(sanRequireEmail: IResolvable) {
      }

      public fun sanRequireSpn(sanRequireSpn: Boolean) {
      }

      public fun sanRequireSpn(sanRequireSpn: IResolvable) {
      }

      public fun sanRequireUpn(sanRequireUpn: Boolean) {
      }

      public fun sanRequireUpn(sanRequireUpn: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.SubjectNameFlagsV2Property.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.SubjectNameFlagsV2Property.builder()

      public override fun requireCommonName(requireCommonName: Boolean) {
        cdkBuilder.requireCommonName(requireCommonName)
      }

      public override fun requireCommonName(requireCommonName: IResolvable) {
        cdkBuilder.requireCommonName(requireCommonName.let(IResolvable::unwrap))
      }

      public override fun requireDirectoryPath(requireDirectoryPath: Boolean) {
        cdkBuilder.requireDirectoryPath(requireDirectoryPath)
      }

      public override fun requireDirectoryPath(requireDirectoryPath: IResolvable) {
        cdkBuilder.requireDirectoryPath(requireDirectoryPath.let(IResolvable::unwrap))
      }

      public override fun requireDnsAsCn(requireDnsAsCn: Boolean) {
        cdkBuilder.requireDnsAsCn(requireDnsAsCn)
      }

      public override fun requireDnsAsCn(requireDnsAsCn: IResolvable) {
        cdkBuilder.requireDnsAsCn(requireDnsAsCn.let(IResolvable::unwrap))
      }

      public override fun requireEmail(requireEmail: Boolean) {
        cdkBuilder.requireEmail(requireEmail)
      }

      public override fun requireEmail(requireEmail: IResolvable) {
        cdkBuilder.requireEmail(requireEmail.let(IResolvable::unwrap))
      }

      public override fun sanRequireDirectoryGuid(sanRequireDirectoryGuid: Boolean) {
        cdkBuilder.sanRequireDirectoryGuid(sanRequireDirectoryGuid)
      }

      public override fun sanRequireDirectoryGuid(sanRequireDirectoryGuid: IResolvable) {
        cdkBuilder.sanRequireDirectoryGuid(sanRequireDirectoryGuid.let(IResolvable::unwrap))
      }

      public override fun sanRequireDns(sanRequireDns: Boolean) {
        cdkBuilder.sanRequireDns(sanRequireDns)
      }

      public override fun sanRequireDns(sanRequireDns: IResolvable) {
        cdkBuilder.sanRequireDns(sanRequireDns.let(IResolvable::unwrap))
      }

      public override fun sanRequireDomainDns(sanRequireDomainDns: Boolean) {
        cdkBuilder.sanRequireDomainDns(sanRequireDomainDns)
      }

      public override fun sanRequireDomainDns(sanRequireDomainDns: IResolvable) {
        cdkBuilder.sanRequireDomainDns(sanRequireDomainDns.let(IResolvable::unwrap))
      }

      public override fun sanRequireEmail(sanRequireEmail: Boolean) {
        cdkBuilder.sanRequireEmail(sanRequireEmail)
      }

      public override fun sanRequireEmail(sanRequireEmail: IResolvable) {
        cdkBuilder.sanRequireEmail(sanRequireEmail.let(IResolvable::unwrap))
      }

      public override fun sanRequireSpn(sanRequireSpn: Boolean) {
        cdkBuilder.sanRequireSpn(sanRequireSpn)
      }

      public override fun sanRequireSpn(sanRequireSpn: IResolvable) {
        cdkBuilder.sanRequireSpn(sanRequireSpn.let(IResolvable::unwrap))
      }

      public override fun sanRequireUpn(sanRequireUpn: Boolean) {
        cdkBuilder.sanRequireUpn(sanRequireUpn)
      }

      public override fun sanRequireUpn(sanRequireUpn: IResolvable) {
        cdkBuilder.sanRequireUpn(sanRequireUpn.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.SubjectNameFlagsV2Property =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.SubjectNameFlagsV2Property,
    ) : SubjectNameFlagsV2Property {
      public override fun requireCommonName(): Any? = unwrap(this).getRequireCommonName()

      public override fun requireDirectoryPath(): Any? = unwrap(this).getRequireDirectoryPath()

      public override fun requireDnsAsCn(): Any? = unwrap(this).getRequireDnsAsCn()

      public override fun requireEmail(): Any? = unwrap(this).getRequireEmail()

      public override fun sanRequireDirectoryGuid(): Any? =
          unwrap(this).getSanRequireDirectoryGuid()

      public override fun sanRequireDns(): Any? = unwrap(this).getSanRequireDns()

      public override fun sanRequireDomainDns(): Any? = unwrap(this).getSanRequireDomainDns()

      public override fun sanRequireEmail(): Any? = unwrap(this).getSanRequireEmail()

      public override fun sanRequireSpn(): Any? = unwrap(this).getSanRequireSpn()

      public override fun sanRequireUpn(): Any? = unwrap(this).getSanRequireUpn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SubjectNameFlagsV2Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.SubjectNameFlagsV2Property):
          SubjectNameFlagsV2Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SubjectNameFlagsV2Property):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.SubjectNameFlagsV2Property =
          (wrapped as Wrapper).cdkObject
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

    public interface Builder {
      public fun requireCommonName(requireCommonName: Boolean) {
      }

      public fun requireCommonName(requireCommonName: IResolvable) {
      }

      public fun requireDirectoryPath(requireDirectoryPath: Boolean) {
      }

      public fun requireDirectoryPath(requireDirectoryPath: IResolvable) {
      }

      public fun requireDnsAsCn(requireDnsAsCn: Boolean) {
      }

      public fun requireDnsAsCn(requireDnsAsCn: IResolvable) {
      }

      public fun requireEmail(requireEmail: Boolean) {
      }

      public fun requireEmail(requireEmail: IResolvable) {
      }

      public fun sanRequireDirectoryGuid(sanRequireDirectoryGuid: Boolean) {
      }

      public fun sanRequireDirectoryGuid(sanRequireDirectoryGuid: IResolvable) {
      }

      public fun sanRequireDns(sanRequireDns: Boolean) {
      }

      public fun sanRequireDns(sanRequireDns: IResolvable) {
      }

      public fun sanRequireDomainDns(sanRequireDomainDns: Boolean) {
      }

      public fun sanRequireDomainDns(sanRequireDomainDns: IResolvable) {
      }

      public fun sanRequireEmail(sanRequireEmail: Boolean) {
      }

      public fun sanRequireEmail(sanRequireEmail: IResolvable) {
      }

      public fun sanRequireSpn(sanRequireSpn: Boolean) {
      }

      public fun sanRequireSpn(sanRequireSpn: IResolvable) {
      }

      public fun sanRequireUpn(sanRequireUpn: Boolean) {
      }

      public fun sanRequireUpn(sanRequireUpn: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.SubjectNameFlagsV4Property.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.SubjectNameFlagsV4Property.builder()

      public override fun requireCommonName(requireCommonName: Boolean) {
        cdkBuilder.requireCommonName(requireCommonName)
      }

      public override fun requireCommonName(requireCommonName: IResolvable) {
        cdkBuilder.requireCommonName(requireCommonName.let(IResolvable::unwrap))
      }

      public override fun requireDirectoryPath(requireDirectoryPath: Boolean) {
        cdkBuilder.requireDirectoryPath(requireDirectoryPath)
      }

      public override fun requireDirectoryPath(requireDirectoryPath: IResolvable) {
        cdkBuilder.requireDirectoryPath(requireDirectoryPath.let(IResolvable::unwrap))
      }

      public override fun requireDnsAsCn(requireDnsAsCn: Boolean) {
        cdkBuilder.requireDnsAsCn(requireDnsAsCn)
      }

      public override fun requireDnsAsCn(requireDnsAsCn: IResolvable) {
        cdkBuilder.requireDnsAsCn(requireDnsAsCn.let(IResolvable::unwrap))
      }

      public override fun requireEmail(requireEmail: Boolean) {
        cdkBuilder.requireEmail(requireEmail)
      }

      public override fun requireEmail(requireEmail: IResolvable) {
        cdkBuilder.requireEmail(requireEmail.let(IResolvable::unwrap))
      }

      public override fun sanRequireDirectoryGuid(sanRequireDirectoryGuid: Boolean) {
        cdkBuilder.sanRequireDirectoryGuid(sanRequireDirectoryGuid)
      }

      public override fun sanRequireDirectoryGuid(sanRequireDirectoryGuid: IResolvable) {
        cdkBuilder.sanRequireDirectoryGuid(sanRequireDirectoryGuid.let(IResolvable::unwrap))
      }

      public override fun sanRequireDns(sanRequireDns: Boolean) {
        cdkBuilder.sanRequireDns(sanRequireDns)
      }

      public override fun sanRequireDns(sanRequireDns: IResolvable) {
        cdkBuilder.sanRequireDns(sanRequireDns.let(IResolvable::unwrap))
      }

      public override fun sanRequireDomainDns(sanRequireDomainDns: Boolean) {
        cdkBuilder.sanRequireDomainDns(sanRequireDomainDns)
      }

      public override fun sanRequireDomainDns(sanRequireDomainDns: IResolvable) {
        cdkBuilder.sanRequireDomainDns(sanRequireDomainDns.let(IResolvable::unwrap))
      }

      public override fun sanRequireEmail(sanRequireEmail: Boolean) {
        cdkBuilder.sanRequireEmail(sanRequireEmail)
      }

      public override fun sanRequireEmail(sanRequireEmail: IResolvable) {
        cdkBuilder.sanRequireEmail(sanRequireEmail.let(IResolvable::unwrap))
      }

      public override fun sanRequireSpn(sanRequireSpn: Boolean) {
        cdkBuilder.sanRequireSpn(sanRequireSpn)
      }

      public override fun sanRequireSpn(sanRequireSpn: IResolvable) {
        cdkBuilder.sanRequireSpn(sanRequireSpn.let(IResolvable::unwrap))
      }

      public override fun sanRequireUpn(sanRequireUpn: Boolean) {
        cdkBuilder.sanRequireUpn(sanRequireUpn)
      }

      public override fun sanRequireUpn(sanRequireUpn: IResolvable) {
        cdkBuilder.sanRequireUpn(sanRequireUpn.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.SubjectNameFlagsV4Property =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.SubjectNameFlagsV4Property,
    ) : SubjectNameFlagsV4Property {
      public override fun requireCommonName(): Any? = unwrap(this).getRequireCommonName()

      public override fun requireDirectoryPath(): Any? = unwrap(this).getRequireDirectoryPath()

      public override fun requireDnsAsCn(): Any? = unwrap(this).getRequireDnsAsCn()

      public override fun requireEmail(): Any? = unwrap(this).getRequireEmail()

      public override fun sanRequireDirectoryGuid(): Any? =
          unwrap(this).getSanRequireDirectoryGuid()

      public override fun sanRequireDns(): Any? = unwrap(this).getSanRequireDns()

      public override fun sanRequireDomainDns(): Any? = unwrap(this).getSanRequireDomainDns()

      public override fun sanRequireEmail(): Any? = unwrap(this).getSanRequireEmail()

      public override fun sanRequireSpn(): Any? = unwrap(this).getSanRequireSpn()

      public override fun sanRequireUpn(): Any? = unwrap(this).getSanRequireUpn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SubjectNameFlagsV4Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.SubjectNameFlagsV4Property):
          SubjectNameFlagsV4Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SubjectNameFlagsV4Property):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.SubjectNameFlagsV4Property =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface GeneralFlagsV4Property {
    public fun autoEnrollment(): Any? = unwrap(this).getAutoEnrollment()

    public fun machineType(): Any? = unwrap(this).getMachineType()

    public interface Builder {
      public fun autoEnrollment(autoEnrollment: Boolean) {
      }

      public fun autoEnrollment(autoEnrollment: IResolvable) {
      }

      public fun machineType(machineType: Boolean) {
      }

      public fun machineType(machineType: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.GeneralFlagsV4Property.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.GeneralFlagsV4Property.builder()

      public override fun autoEnrollment(autoEnrollment: Boolean) {
        cdkBuilder.autoEnrollment(autoEnrollment)
      }

      public override fun autoEnrollment(autoEnrollment: IResolvable) {
        cdkBuilder.autoEnrollment(autoEnrollment.let(IResolvable::unwrap))
      }

      public override fun machineType(machineType: Boolean) {
        cdkBuilder.machineType(machineType)
      }

      public override fun machineType(machineType: IResolvable) {
        cdkBuilder.machineType(machineType.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.GeneralFlagsV4Property =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.GeneralFlagsV4Property,
    ) : GeneralFlagsV4Property {
      public override fun autoEnrollment(): Any? = unwrap(this).getAutoEnrollment()

      public override fun machineType(): Any? = unwrap(this).getMachineType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GeneralFlagsV4Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.GeneralFlagsV4Property):
          GeneralFlagsV4Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GeneralFlagsV4Property):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.GeneralFlagsV4Property =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface PrivateKeyAttributesV2Property {
    public fun cryptoProviders(): List<String> = unwrap(this).getCryptoProviders() ?: emptyList()

    public fun keySpec(): String

    public fun minimalKeyLength(): Number

    public interface Builder {
      public fun cryptoProviders(cryptoProviders: List<String>) {
      }

      public fun keySpec(keySpec: String) {
      }

      public fun minimalKeyLength(minimalKeyLength: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyAttributesV2Property.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyAttributesV2Property.builder()

      public override fun cryptoProviders(cryptoProviders: List<String>) {
        cdkBuilder.cryptoProviders(cryptoProviders)
      }

      public override fun keySpec(keySpec: String) {
        cdkBuilder.keySpec(keySpec)
      }

      public override fun minimalKeyLength(minimalKeyLength: Number) {
        cdkBuilder.minimalKeyLength(minimalKeyLength)
      }

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyAttributesV2Property
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyAttributesV2Property,
    ) : PrivateKeyAttributesV2Property {
      public override fun cryptoProviders(): List<String> = unwrap(this).getCryptoProviders() ?:
          emptyList()

      public override fun keySpec(): String = unwrap(this).getKeySpec()

      public override fun minimalKeyLength(): Number = unwrap(this).getMinimalKeyLength()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PrivateKeyAttributesV2Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyAttributesV2Property):
          PrivateKeyAttributesV2Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrivateKeyAttributesV2Property):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyAttributesV2Property
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface PrivateKeyAttributesV4Property {
    public fun algorithm(): String? = unwrap(this).getAlgorithm()

    public fun cryptoProviders(): List<String> = unwrap(this).getCryptoProviders() ?: emptyList()

    public fun keySpec(): String

    public fun keyUsageProperty(): Any? = unwrap(this).getKeyUsageProperty()

    public fun minimalKeyLength(): Number

    public interface Builder {
      public fun algorithm(algorithm: String) {
      }

      public fun cryptoProviders(cryptoProviders: List<String>) {
      }

      public fun keySpec(keySpec: String) {
      }

      public fun keyUsageProperty(keyUsageProperty: IResolvable) {
      }

      public fun keyUsageProperty(keyUsageProperty: KeyUsagePropertyProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("39c25c064000533e637d6eed426bb566a63aa39c6166838f67748c5adafccb96")
      public fun keyUsageProperty(keyUsageProperty: KeyUsagePropertyProperty.Builder.() -> Unit) {
      }

      public fun minimalKeyLength(minimalKeyLength: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyAttributesV4Property.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyAttributesV4Property.builder()

      public override fun algorithm(algorithm: String) {
        cdkBuilder.algorithm(algorithm)
      }

      public override fun cryptoProviders(cryptoProviders: List<String>) {
        cdkBuilder.cryptoProviders(cryptoProviders)
      }

      public override fun keySpec(keySpec: String) {
        cdkBuilder.keySpec(keySpec)
      }

      public override fun keyUsageProperty(keyUsageProperty: IResolvable) {
        cdkBuilder.keyUsageProperty(keyUsageProperty.let(IResolvable::unwrap))
      }

      public override fun keyUsageProperty(keyUsageProperty: KeyUsagePropertyProperty) {
        cdkBuilder.keyUsageProperty(keyUsageProperty.let(KeyUsagePropertyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("39c25c064000533e637d6eed426bb566a63aa39c6166838f67748c5adafccb96")
      public override
          fun keyUsageProperty(keyUsageProperty: KeyUsagePropertyProperty.Builder.() -> Unit): Unit
          = keyUsageProperty(KeyUsagePropertyProperty(keyUsageProperty))

      public override fun minimalKeyLength(minimalKeyLength: Number) {
        cdkBuilder.minimalKeyLength(minimalKeyLength)
      }

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyAttributesV4Property
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyAttributesV4Property,
    ) : PrivateKeyAttributesV4Property {
      public override fun algorithm(): String? = unwrap(this).getAlgorithm()

      public override fun cryptoProviders(): List<String> = unwrap(this).getCryptoProviders() ?:
          emptyList()

      public override fun keySpec(): String = unwrap(this).getKeySpec()

      public override fun keyUsageProperty(): Any? = unwrap(this).getKeyUsageProperty()

      public override fun minimalKeyLength(): Number = unwrap(this).getMinimalKeyLength()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PrivateKeyAttributesV4Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyAttributesV4Property):
          PrivateKeyAttributesV4Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrivateKeyAttributesV4Property):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyAttributesV4Property
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface PrivateKeyAttributesV3Property {
    public fun algorithm(): String

    public fun cryptoProviders(): List<String> = unwrap(this).getCryptoProviders() ?: emptyList()

    public fun keySpec(): String

    public fun keyUsageProperty(): Any

    public fun minimalKeyLength(): Number

    public interface Builder {
      public fun algorithm(algorithm: String) {
      }

      public fun cryptoProviders(cryptoProviders: List<String>) {
      }

      public fun keySpec(keySpec: String) {
      }

      public fun keyUsageProperty(keyUsageProperty: IResolvable) {
      }

      public fun keyUsageProperty(keyUsageProperty: KeyUsagePropertyProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ccd5bffefaa9ac6fdcbd555901a072569107b00d07950ec2c4793559eb0cc6d9")
      public fun keyUsageProperty(keyUsageProperty: KeyUsagePropertyProperty.Builder.() -> Unit) {
      }

      public fun minimalKeyLength(minimalKeyLength: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyAttributesV3Property.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyAttributesV3Property.builder()

      public override fun algorithm(algorithm: String) {
        cdkBuilder.algorithm(algorithm)
      }

      public override fun cryptoProviders(cryptoProviders: List<String>) {
        cdkBuilder.cryptoProviders(cryptoProviders)
      }

      public override fun keySpec(keySpec: String) {
        cdkBuilder.keySpec(keySpec)
      }

      public override fun keyUsageProperty(keyUsageProperty: IResolvable) {
        cdkBuilder.keyUsageProperty(keyUsageProperty.let(IResolvable::unwrap))
      }

      public override fun keyUsageProperty(keyUsageProperty: KeyUsagePropertyProperty) {
        cdkBuilder.keyUsageProperty(keyUsageProperty.let(KeyUsagePropertyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ccd5bffefaa9ac6fdcbd555901a072569107b00d07950ec2c4793559eb0cc6d9")
      public override
          fun keyUsageProperty(keyUsageProperty: KeyUsagePropertyProperty.Builder.() -> Unit): Unit
          = keyUsageProperty(KeyUsagePropertyProperty(keyUsageProperty))

      public override fun minimalKeyLength(minimalKeyLength: Number) {
        cdkBuilder.minimalKeyLength(minimalKeyLength)
      }

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyAttributesV3Property
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyAttributesV3Property,
    ) : PrivateKeyAttributesV3Property {
      public override fun algorithm(): String = unwrap(this).getAlgorithm()

      public override fun cryptoProviders(): List<String> = unwrap(this).getCryptoProviders() ?:
          emptyList()

      public override fun keySpec(): String = unwrap(this).getKeySpec()

      public override fun keyUsageProperty(): Any = unwrap(this).getKeyUsageProperty()

      public override fun minimalKeyLength(): Number = unwrap(this).getMinimalKeyLength()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PrivateKeyAttributesV3Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyAttributesV3Property):
          PrivateKeyAttributesV3Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrivateKeyAttributesV3Property):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyAttributesV3Property
          = (wrapped as Wrapper).cdkObject
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

    public interface Builder {
      public
          fun enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull: Boolean) {
      }

      public
          fun enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull: IResolvable) {
      }

      public fun includeSymmetricAlgorithms(includeSymmetricAlgorithms: Boolean) {
      }

      public fun includeSymmetricAlgorithms(includeSymmetricAlgorithms: IResolvable) {
      }

      public fun noSecurityExtension(noSecurityExtension: Boolean) {
      }

      public fun noSecurityExtension(noSecurityExtension: IResolvable) {
      }

      public
          fun removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore: Boolean) {
      }

      public
          fun removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore: IResolvable) {
      }

      public fun userInteractionRequired(userInteractionRequired: Boolean) {
      }

      public fun userInteractionRequired(userInteractionRequired: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.EnrollmentFlagsV3Property.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.EnrollmentFlagsV3Property.builder()

      public override
          fun enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull: Boolean) {
        cdkBuilder.enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull)
      }

      public override
          fun enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull: IResolvable) {
        cdkBuilder.enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull.let(IResolvable::unwrap))
      }

      public override fun includeSymmetricAlgorithms(includeSymmetricAlgorithms: Boolean) {
        cdkBuilder.includeSymmetricAlgorithms(includeSymmetricAlgorithms)
      }

      public override fun includeSymmetricAlgorithms(includeSymmetricAlgorithms: IResolvable) {
        cdkBuilder.includeSymmetricAlgorithms(includeSymmetricAlgorithms.let(IResolvable::unwrap))
      }

      public override fun noSecurityExtension(noSecurityExtension: Boolean) {
        cdkBuilder.noSecurityExtension(noSecurityExtension)
      }

      public override fun noSecurityExtension(noSecurityExtension: IResolvable) {
        cdkBuilder.noSecurityExtension(noSecurityExtension.let(IResolvable::unwrap))
      }

      public override
          fun removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore: Boolean) {
        cdkBuilder.removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore)
      }

      public override
          fun removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore: IResolvable) {
        cdkBuilder.removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore.let(IResolvable::unwrap))
      }

      public override fun userInteractionRequired(userInteractionRequired: Boolean) {
        cdkBuilder.userInteractionRequired(userInteractionRequired)
      }

      public override fun userInteractionRequired(userInteractionRequired: IResolvable) {
        cdkBuilder.userInteractionRequired(userInteractionRequired.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.EnrollmentFlagsV3Property =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.EnrollmentFlagsV3Property,
    ) : EnrollmentFlagsV3Property {
      public override fun enableKeyReuseOnNtTokenKeysetStorageFull(): Any? =
          unwrap(this).getEnableKeyReuseOnNtTokenKeysetStorageFull()

      public override fun includeSymmetricAlgorithms(): Any? =
          unwrap(this).getIncludeSymmetricAlgorithms()

      public override fun noSecurityExtension(): Any? = unwrap(this).getNoSecurityExtension()

      public override fun removeInvalidCertificateFromPersonalStore(): Any? =
          unwrap(this).getRemoveInvalidCertificateFromPersonalStore()

      public override fun userInteractionRequired(): Any? =
          unwrap(this).getUserInteractionRequired()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EnrollmentFlagsV3Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.EnrollmentFlagsV3Property):
          EnrollmentFlagsV3Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnrollmentFlagsV3Property):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.EnrollmentFlagsV3Property =
          (wrapped as Wrapper).cdkObject
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

    public interface Builder {
      public
          fun enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull: Boolean) {
      }

      public
          fun enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull: IResolvable) {
      }

      public fun includeSymmetricAlgorithms(includeSymmetricAlgorithms: Boolean) {
      }

      public fun includeSymmetricAlgorithms(includeSymmetricAlgorithms: IResolvable) {
      }

      public fun noSecurityExtension(noSecurityExtension: Boolean) {
      }

      public fun noSecurityExtension(noSecurityExtension: IResolvable) {
      }

      public
          fun removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore: Boolean) {
      }

      public
          fun removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore: IResolvable) {
      }

      public fun userInteractionRequired(userInteractionRequired: Boolean) {
      }

      public fun userInteractionRequired(userInteractionRequired: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.EnrollmentFlagsV2Property.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.EnrollmentFlagsV2Property.builder()

      public override
          fun enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull: Boolean) {
        cdkBuilder.enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull)
      }

      public override
          fun enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull: IResolvable) {
        cdkBuilder.enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull.let(IResolvable::unwrap))
      }

      public override fun includeSymmetricAlgorithms(includeSymmetricAlgorithms: Boolean) {
        cdkBuilder.includeSymmetricAlgorithms(includeSymmetricAlgorithms)
      }

      public override fun includeSymmetricAlgorithms(includeSymmetricAlgorithms: IResolvable) {
        cdkBuilder.includeSymmetricAlgorithms(includeSymmetricAlgorithms.let(IResolvable::unwrap))
      }

      public override fun noSecurityExtension(noSecurityExtension: Boolean) {
        cdkBuilder.noSecurityExtension(noSecurityExtension)
      }

      public override fun noSecurityExtension(noSecurityExtension: IResolvable) {
        cdkBuilder.noSecurityExtension(noSecurityExtension.let(IResolvable::unwrap))
      }

      public override
          fun removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore: Boolean) {
        cdkBuilder.removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore)
      }

      public override
          fun removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore: IResolvable) {
        cdkBuilder.removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore.let(IResolvable::unwrap))
      }

      public override fun userInteractionRequired(userInteractionRequired: Boolean) {
        cdkBuilder.userInteractionRequired(userInteractionRequired)
      }

      public override fun userInteractionRequired(userInteractionRequired: IResolvable) {
        cdkBuilder.userInteractionRequired(userInteractionRequired.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.EnrollmentFlagsV2Property =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.EnrollmentFlagsV2Property,
    ) : EnrollmentFlagsV2Property {
      public override fun enableKeyReuseOnNtTokenKeysetStorageFull(): Any? =
          unwrap(this).getEnableKeyReuseOnNtTokenKeysetStorageFull()

      public override fun includeSymmetricAlgorithms(): Any? =
          unwrap(this).getIncludeSymmetricAlgorithms()

      public override fun noSecurityExtension(): Any? = unwrap(this).getNoSecurityExtension()

      public override fun removeInvalidCertificateFromPersonalStore(): Any? =
          unwrap(this).getRemoveInvalidCertificateFromPersonalStore()

      public override fun userInteractionRequired(): Any? =
          unwrap(this).getUserInteractionRequired()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EnrollmentFlagsV2Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.EnrollmentFlagsV2Property):
          EnrollmentFlagsV2Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnrollmentFlagsV2Property):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.EnrollmentFlagsV2Property =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ApplicationPolicyProperty {
    public fun policyObjectIdentifier(): String? = unwrap(this).getPolicyObjectIdentifier()

    public fun policyType(): String? = unwrap(this).getPolicyType()

    public interface Builder {
      public fun policyObjectIdentifier(policyObjectIdentifier: String) {
      }

      public fun policyType(policyType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ApplicationPolicyProperty.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ApplicationPolicyProperty.builder()

      public override fun policyObjectIdentifier(policyObjectIdentifier: String) {
        cdkBuilder.policyObjectIdentifier(policyObjectIdentifier)
      }

      public override fun policyType(policyType: String) {
        cdkBuilder.policyType(policyType)
      }

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ApplicationPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ApplicationPolicyProperty,
    ) : ApplicationPolicyProperty {
      public override fun policyObjectIdentifier(): String? =
          unwrap(this).getPolicyObjectIdentifier()

      public override fun policyType(): String? = unwrap(this).getPolicyType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ApplicationPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ApplicationPolicyProperty):
          ApplicationPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApplicationPolicyProperty):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ApplicationPolicyProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ApplicationPoliciesProperty {
    public fun critical(): Any? = unwrap(this).getCritical()

    public fun policies(): Any

    public interface Builder {
      public fun critical(critical: Boolean) {
      }

      public fun critical(critical: IResolvable) {
      }

      public fun policies(policies: IResolvable) {
      }

      public fun policies(policies: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ApplicationPoliciesProperty.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ApplicationPoliciesProperty.builder()

      public override fun critical(critical: Boolean) {
        cdkBuilder.critical(critical)
      }

      public override fun critical(critical: IResolvable) {
        cdkBuilder.critical(critical.let(IResolvable::unwrap))
      }

      public override fun policies(policies: IResolvable) {
        cdkBuilder.policies(policies.let(IResolvable::unwrap))
      }

      public override fun policies(policies: List<Any>) {
        cdkBuilder.policies(policies)
      }

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ApplicationPoliciesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ApplicationPoliciesProperty,
    ) : ApplicationPoliciesProperty {
      public override fun critical(): Any? = unwrap(this).getCritical()

      public override fun policies(): Any = unwrap(this).getPolicies()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ApplicationPoliciesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ApplicationPoliciesProperty):
          ApplicationPoliciesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApplicationPoliciesProperty):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ApplicationPoliciesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface KeyUsagePropertyFlagsProperty {
    public fun decrypt(): Any? = unwrap(this).getDecrypt()

    public fun keyAgreement(): Any? = unwrap(this).getKeyAgreement()

    public fun sign(): Any? = unwrap(this).getSign()

    public interface Builder {
      public fun decrypt(decrypt: Boolean) {
      }

      public fun decrypt(decrypt: IResolvable) {
      }

      public fun keyAgreement(keyAgreement: Boolean) {
      }

      public fun keyAgreement(keyAgreement: IResolvable) {
      }

      public fun sign(sign: Boolean) {
      }

      public fun sign(sign: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsagePropertyFlagsProperty.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsagePropertyFlagsProperty.builder()

      public override fun decrypt(decrypt: Boolean) {
        cdkBuilder.decrypt(decrypt)
      }

      public override fun decrypt(decrypt: IResolvable) {
        cdkBuilder.decrypt(decrypt.let(IResolvable::unwrap))
      }

      public override fun keyAgreement(keyAgreement: Boolean) {
        cdkBuilder.keyAgreement(keyAgreement)
      }

      public override fun keyAgreement(keyAgreement: IResolvable) {
        cdkBuilder.keyAgreement(keyAgreement.let(IResolvable::unwrap))
      }

      public override fun sign(sign: Boolean) {
        cdkBuilder.sign(sign)
      }

      public override fun sign(sign: IResolvable) {
        cdkBuilder.sign(sign.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsagePropertyFlagsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsagePropertyFlagsProperty,
    ) : KeyUsagePropertyFlagsProperty {
      public override fun decrypt(): Any? = unwrap(this).getDecrypt()

      public override fun keyAgreement(): Any? = unwrap(this).getKeyAgreement()

      public override fun sign(): Any? = unwrap(this).getSign()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KeyUsagePropertyFlagsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsagePropertyFlagsProperty):
          KeyUsagePropertyFlagsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KeyUsagePropertyFlagsProperty):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsagePropertyFlagsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ExtensionsV2Property {
    public fun applicationPolicies(): Any? = unwrap(this).getApplicationPolicies()

    public fun keyUsage(): Any

    public interface Builder {
      public fun applicationPolicies(applicationPolicies: IResolvable) {
      }

      public fun applicationPolicies(applicationPolicies: ApplicationPoliciesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a828670bec1d28e8cc1a2d50058b79d351f6c153d40af2f570d8060b6444d726")
      public
          fun applicationPolicies(applicationPolicies: ApplicationPoliciesProperty.Builder.() -> Unit) {
      }

      public fun keyUsage(keyUsage: IResolvable) {
      }

      public fun keyUsage(keyUsage: KeyUsageProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9c693eed2a201cdc50ab632d8b3801ac042a7a5b25b4ead1c4ddc1c28256cf4e")
      public fun keyUsage(keyUsage: KeyUsageProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ExtensionsV2Property.Builder =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ExtensionsV2Property.builder()

      public override fun applicationPolicies(applicationPolicies: IResolvable) {
        cdkBuilder.applicationPolicies(applicationPolicies.let(IResolvable::unwrap))
      }

      public override fun applicationPolicies(applicationPolicies: ApplicationPoliciesProperty) {
        cdkBuilder.applicationPolicies(applicationPolicies.let(ApplicationPoliciesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a828670bec1d28e8cc1a2d50058b79d351f6c153d40af2f570d8060b6444d726")
      public override
          fun applicationPolicies(applicationPolicies: ApplicationPoliciesProperty.Builder.() -> Unit):
          Unit = applicationPolicies(ApplicationPoliciesProperty(applicationPolicies))

      public override fun keyUsage(keyUsage: IResolvable) {
        cdkBuilder.keyUsage(keyUsage.let(IResolvable::unwrap))
      }

      public override fun keyUsage(keyUsage: KeyUsageProperty) {
        cdkBuilder.keyUsage(keyUsage.let(KeyUsageProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9c693eed2a201cdc50ab632d8b3801ac042a7a5b25b4ead1c4ddc1c28256cf4e")
      public override fun keyUsage(keyUsage: KeyUsageProperty.Builder.() -> Unit): Unit =
          keyUsage(KeyUsageProperty(keyUsage))

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ExtensionsV2Property =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ExtensionsV2Property,
    ) : ExtensionsV2Property {
      public override fun applicationPolicies(): Any? = unwrap(this).getApplicationPolicies()

      public override fun keyUsage(): Any = unwrap(this).getKeyUsage()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ExtensionsV2Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ExtensionsV2Property):
          ExtensionsV2Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExtensionsV2Property):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ExtensionsV2Property = (wrapped
          as Wrapper).cdkObject
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

    public interface Builder {
      public fun requireCommonName(requireCommonName: Boolean) {
      }

      public fun requireCommonName(requireCommonName: IResolvable) {
      }

      public fun requireDirectoryPath(requireDirectoryPath: Boolean) {
      }

      public fun requireDirectoryPath(requireDirectoryPath: IResolvable) {
      }

      public fun requireDnsAsCn(requireDnsAsCn: Boolean) {
      }

      public fun requireDnsAsCn(requireDnsAsCn: IResolvable) {
      }

      public fun requireEmail(requireEmail: Boolean) {
      }

      public fun requireEmail(requireEmail: IResolvable) {
      }

      public fun sanRequireDirectoryGuid(sanRequireDirectoryGuid: Boolean) {
      }

      public fun sanRequireDirectoryGuid(sanRequireDirectoryGuid: IResolvable) {
      }

      public fun sanRequireDns(sanRequireDns: Boolean) {
      }

      public fun sanRequireDns(sanRequireDns: IResolvable) {
      }

      public fun sanRequireDomainDns(sanRequireDomainDns: Boolean) {
      }

      public fun sanRequireDomainDns(sanRequireDomainDns: IResolvable) {
      }

      public fun sanRequireEmail(sanRequireEmail: Boolean) {
      }

      public fun sanRequireEmail(sanRequireEmail: IResolvable) {
      }

      public fun sanRequireSpn(sanRequireSpn: Boolean) {
      }

      public fun sanRequireSpn(sanRequireSpn: IResolvable) {
      }

      public fun sanRequireUpn(sanRequireUpn: Boolean) {
      }

      public fun sanRequireUpn(sanRequireUpn: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.SubjectNameFlagsV3Property.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.SubjectNameFlagsV3Property.builder()

      public override fun requireCommonName(requireCommonName: Boolean) {
        cdkBuilder.requireCommonName(requireCommonName)
      }

      public override fun requireCommonName(requireCommonName: IResolvable) {
        cdkBuilder.requireCommonName(requireCommonName.let(IResolvable::unwrap))
      }

      public override fun requireDirectoryPath(requireDirectoryPath: Boolean) {
        cdkBuilder.requireDirectoryPath(requireDirectoryPath)
      }

      public override fun requireDirectoryPath(requireDirectoryPath: IResolvable) {
        cdkBuilder.requireDirectoryPath(requireDirectoryPath.let(IResolvable::unwrap))
      }

      public override fun requireDnsAsCn(requireDnsAsCn: Boolean) {
        cdkBuilder.requireDnsAsCn(requireDnsAsCn)
      }

      public override fun requireDnsAsCn(requireDnsAsCn: IResolvable) {
        cdkBuilder.requireDnsAsCn(requireDnsAsCn.let(IResolvable::unwrap))
      }

      public override fun requireEmail(requireEmail: Boolean) {
        cdkBuilder.requireEmail(requireEmail)
      }

      public override fun requireEmail(requireEmail: IResolvable) {
        cdkBuilder.requireEmail(requireEmail.let(IResolvable::unwrap))
      }

      public override fun sanRequireDirectoryGuid(sanRequireDirectoryGuid: Boolean) {
        cdkBuilder.sanRequireDirectoryGuid(sanRequireDirectoryGuid)
      }

      public override fun sanRequireDirectoryGuid(sanRequireDirectoryGuid: IResolvable) {
        cdkBuilder.sanRequireDirectoryGuid(sanRequireDirectoryGuid.let(IResolvable::unwrap))
      }

      public override fun sanRequireDns(sanRequireDns: Boolean) {
        cdkBuilder.sanRequireDns(sanRequireDns)
      }

      public override fun sanRequireDns(sanRequireDns: IResolvable) {
        cdkBuilder.sanRequireDns(sanRequireDns.let(IResolvable::unwrap))
      }

      public override fun sanRequireDomainDns(sanRequireDomainDns: Boolean) {
        cdkBuilder.sanRequireDomainDns(sanRequireDomainDns)
      }

      public override fun sanRequireDomainDns(sanRequireDomainDns: IResolvable) {
        cdkBuilder.sanRequireDomainDns(sanRequireDomainDns.let(IResolvable::unwrap))
      }

      public override fun sanRequireEmail(sanRequireEmail: Boolean) {
        cdkBuilder.sanRequireEmail(sanRequireEmail)
      }

      public override fun sanRequireEmail(sanRequireEmail: IResolvable) {
        cdkBuilder.sanRequireEmail(sanRequireEmail.let(IResolvable::unwrap))
      }

      public override fun sanRequireSpn(sanRequireSpn: Boolean) {
        cdkBuilder.sanRequireSpn(sanRequireSpn)
      }

      public override fun sanRequireSpn(sanRequireSpn: IResolvable) {
        cdkBuilder.sanRequireSpn(sanRequireSpn.let(IResolvable::unwrap))
      }

      public override fun sanRequireUpn(sanRequireUpn: Boolean) {
        cdkBuilder.sanRequireUpn(sanRequireUpn)
      }

      public override fun sanRequireUpn(sanRequireUpn: IResolvable) {
        cdkBuilder.sanRequireUpn(sanRequireUpn.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.SubjectNameFlagsV3Property =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.SubjectNameFlagsV3Property,
    ) : SubjectNameFlagsV3Property {
      public override fun requireCommonName(): Any? = unwrap(this).getRequireCommonName()

      public override fun requireDirectoryPath(): Any? = unwrap(this).getRequireDirectoryPath()

      public override fun requireDnsAsCn(): Any? = unwrap(this).getRequireDnsAsCn()

      public override fun requireEmail(): Any? = unwrap(this).getRequireEmail()

      public override fun sanRequireDirectoryGuid(): Any? =
          unwrap(this).getSanRequireDirectoryGuid()

      public override fun sanRequireDns(): Any? = unwrap(this).getSanRequireDns()

      public override fun sanRequireDomainDns(): Any? = unwrap(this).getSanRequireDomainDns()

      public override fun sanRequireEmail(): Any? = unwrap(this).getSanRequireEmail()

      public override fun sanRequireSpn(): Any? = unwrap(this).getSanRequireSpn()

      public override fun sanRequireUpn(): Any? = unwrap(this).getSanRequireUpn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SubjectNameFlagsV3Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.SubjectNameFlagsV3Property):
          SubjectNameFlagsV3Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SubjectNameFlagsV3Property):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.SubjectNameFlagsV3Property =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface PrivateKeyFlagsV3Property {
    public fun clientVersion(): String

    public fun exportableKey(): Any? = unwrap(this).getExportableKey()

    public fun requireAlternateSignatureAlgorithm(): Any? =
        unwrap(this).getRequireAlternateSignatureAlgorithm()

    public fun strongKeyProtectionRequired(): Any? = unwrap(this).getStrongKeyProtectionRequired()

    public interface Builder {
      public fun clientVersion(clientVersion: String) {
      }

      public fun exportableKey(exportableKey: Boolean) {
      }

      public fun exportableKey(exportableKey: IResolvable) {
      }

      public fun requireAlternateSignatureAlgorithm(requireAlternateSignatureAlgorithm: Boolean) {
      }

      public
          fun requireAlternateSignatureAlgorithm(requireAlternateSignatureAlgorithm: IResolvable) {
      }

      public fun strongKeyProtectionRequired(strongKeyProtectionRequired: Boolean) {
      }

      public fun strongKeyProtectionRequired(strongKeyProtectionRequired: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyFlagsV3Property.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyFlagsV3Property.builder()

      public override fun clientVersion(clientVersion: String) {
        cdkBuilder.clientVersion(clientVersion)
      }

      public override fun exportableKey(exportableKey: Boolean) {
        cdkBuilder.exportableKey(exportableKey)
      }

      public override fun exportableKey(exportableKey: IResolvable) {
        cdkBuilder.exportableKey(exportableKey.let(IResolvable::unwrap))
      }

      public override
          fun requireAlternateSignatureAlgorithm(requireAlternateSignatureAlgorithm: Boolean) {
        cdkBuilder.requireAlternateSignatureAlgorithm(requireAlternateSignatureAlgorithm)
      }

      public override
          fun requireAlternateSignatureAlgorithm(requireAlternateSignatureAlgorithm: IResolvable) {
        cdkBuilder.requireAlternateSignatureAlgorithm(requireAlternateSignatureAlgorithm.let(IResolvable::unwrap))
      }

      public override fun strongKeyProtectionRequired(strongKeyProtectionRequired: Boolean) {
        cdkBuilder.strongKeyProtectionRequired(strongKeyProtectionRequired)
      }

      public override fun strongKeyProtectionRequired(strongKeyProtectionRequired: IResolvable) {
        cdkBuilder.strongKeyProtectionRequired(strongKeyProtectionRequired.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyFlagsV3Property =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyFlagsV3Property,
    ) : PrivateKeyFlagsV3Property {
      public override fun clientVersion(): String = unwrap(this).getClientVersion()

      public override fun exportableKey(): Any? = unwrap(this).getExportableKey()

      public override fun requireAlternateSignatureAlgorithm(): Any? =
          unwrap(this).getRequireAlternateSignatureAlgorithm()

      public override fun strongKeyProtectionRequired(): Any? =
          unwrap(this).getStrongKeyProtectionRequired()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PrivateKeyFlagsV3Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyFlagsV3Property):
          PrivateKeyFlagsV3Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrivateKeyFlagsV3Property):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyFlagsV3Property =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface PrivateKeyFlagsV2Property {
    public fun clientVersion(): String

    public fun exportableKey(): Any? = unwrap(this).getExportableKey()

    public fun strongKeyProtectionRequired(): Any? = unwrap(this).getStrongKeyProtectionRequired()

    public interface Builder {
      public fun clientVersion(clientVersion: String) {
      }

      public fun exportableKey(exportableKey: Boolean) {
      }

      public fun exportableKey(exportableKey: IResolvable) {
      }

      public fun strongKeyProtectionRequired(strongKeyProtectionRequired: Boolean) {
      }

      public fun strongKeyProtectionRequired(strongKeyProtectionRequired: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyFlagsV2Property.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyFlagsV2Property.builder()

      public override fun clientVersion(clientVersion: String) {
        cdkBuilder.clientVersion(clientVersion)
      }

      public override fun exportableKey(exportableKey: Boolean) {
        cdkBuilder.exportableKey(exportableKey)
      }

      public override fun exportableKey(exportableKey: IResolvable) {
        cdkBuilder.exportableKey(exportableKey.let(IResolvable::unwrap))
      }

      public override fun strongKeyProtectionRequired(strongKeyProtectionRequired: Boolean) {
        cdkBuilder.strongKeyProtectionRequired(strongKeyProtectionRequired)
      }

      public override fun strongKeyProtectionRequired(strongKeyProtectionRequired: IResolvable) {
        cdkBuilder.strongKeyProtectionRequired(strongKeyProtectionRequired.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyFlagsV2Property =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyFlagsV2Property,
    ) : PrivateKeyFlagsV2Property {
      public override fun clientVersion(): String = unwrap(this).getClientVersion()

      public override fun exportableKey(): Any? = unwrap(this).getExportableKey()

      public override fun strongKeyProtectionRequired(): Any? =
          unwrap(this).getStrongKeyProtectionRequired()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PrivateKeyFlagsV2Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyFlagsV2Property):
          PrivateKeyFlagsV2Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrivateKeyFlagsV2Property):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyFlagsV2Property =
          (wrapped as Wrapper).cdkObject
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

    public interface Builder {
      public
          fun enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull: Boolean) {
      }

      public
          fun enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull: IResolvable) {
      }

      public fun includeSymmetricAlgorithms(includeSymmetricAlgorithms: Boolean) {
      }

      public fun includeSymmetricAlgorithms(includeSymmetricAlgorithms: IResolvable) {
      }

      public fun noSecurityExtension(noSecurityExtension: Boolean) {
      }

      public fun noSecurityExtension(noSecurityExtension: IResolvable) {
      }

      public
          fun removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore: Boolean) {
      }

      public
          fun removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore: IResolvable) {
      }

      public fun userInteractionRequired(userInteractionRequired: Boolean) {
      }

      public fun userInteractionRequired(userInteractionRequired: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.EnrollmentFlagsV4Property.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.EnrollmentFlagsV4Property.builder()

      public override
          fun enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull: Boolean) {
        cdkBuilder.enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull)
      }

      public override
          fun enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull: IResolvable) {
        cdkBuilder.enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull.let(IResolvable::unwrap))
      }

      public override fun includeSymmetricAlgorithms(includeSymmetricAlgorithms: Boolean) {
        cdkBuilder.includeSymmetricAlgorithms(includeSymmetricAlgorithms)
      }

      public override fun includeSymmetricAlgorithms(includeSymmetricAlgorithms: IResolvable) {
        cdkBuilder.includeSymmetricAlgorithms(includeSymmetricAlgorithms.let(IResolvable::unwrap))
      }

      public override fun noSecurityExtension(noSecurityExtension: Boolean) {
        cdkBuilder.noSecurityExtension(noSecurityExtension)
      }

      public override fun noSecurityExtension(noSecurityExtension: IResolvable) {
        cdkBuilder.noSecurityExtension(noSecurityExtension.let(IResolvable::unwrap))
      }

      public override
          fun removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore: Boolean) {
        cdkBuilder.removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore)
      }

      public override
          fun removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore: IResolvable) {
        cdkBuilder.removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore.let(IResolvable::unwrap))
      }

      public override fun userInteractionRequired(userInteractionRequired: Boolean) {
        cdkBuilder.userInteractionRequired(userInteractionRequired)
      }

      public override fun userInteractionRequired(userInteractionRequired: IResolvable) {
        cdkBuilder.userInteractionRequired(userInteractionRequired.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.EnrollmentFlagsV4Property =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.EnrollmentFlagsV4Property,
    ) : EnrollmentFlagsV4Property {
      public override fun enableKeyReuseOnNtTokenKeysetStorageFull(): Any? =
          unwrap(this).getEnableKeyReuseOnNtTokenKeysetStorageFull()

      public override fun includeSymmetricAlgorithms(): Any? =
          unwrap(this).getIncludeSymmetricAlgorithms()

      public override fun noSecurityExtension(): Any? = unwrap(this).getNoSecurityExtension()

      public override fun removeInvalidCertificateFromPersonalStore(): Any? =
          unwrap(this).getRemoveInvalidCertificateFromPersonalStore()

      public override fun userInteractionRequired(): Any? =
          unwrap(this).getUserInteractionRequired()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EnrollmentFlagsV4Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.EnrollmentFlagsV4Property):
          EnrollmentFlagsV4Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnrollmentFlagsV4Property):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.EnrollmentFlagsV4Property =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface GeneralFlagsV2Property {
    public fun autoEnrollment(): Any? = unwrap(this).getAutoEnrollment()

    public fun machineType(): Any? = unwrap(this).getMachineType()

    public interface Builder {
      public fun autoEnrollment(autoEnrollment: Boolean) {
      }

      public fun autoEnrollment(autoEnrollment: IResolvable) {
      }

      public fun machineType(machineType: Boolean) {
      }

      public fun machineType(machineType: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.GeneralFlagsV2Property.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.GeneralFlagsV2Property.builder()

      public override fun autoEnrollment(autoEnrollment: Boolean) {
        cdkBuilder.autoEnrollment(autoEnrollment)
      }

      public override fun autoEnrollment(autoEnrollment: IResolvable) {
        cdkBuilder.autoEnrollment(autoEnrollment.let(IResolvable::unwrap))
      }

      public override fun machineType(machineType: Boolean) {
        cdkBuilder.machineType(machineType)
      }

      public override fun machineType(machineType: IResolvable) {
        cdkBuilder.machineType(machineType.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.GeneralFlagsV2Property =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.GeneralFlagsV2Property,
    ) : GeneralFlagsV2Property {
      public override fun autoEnrollment(): Any? = unwrap(this).getAutoEnrollment()

      public override fun machineType(): Any? = unwrap(this).getMachineType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GeneralFlagsV2Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.GeneralFlagsV2Property):
          GeneralFlagsV2Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GeneralFlagsV2Property):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.GeneralFlagsV2Property =
          (wrapped as Wrapper).cdkObject
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

    public interface Builder {
      public fun certificateValidity(certificateValidity: IResolvable) {
      }

      public fun certificateValidity(certificateValidity: CertificateValidityProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("55dd8886fc4c9948f8aa99716fca4040366000833355877e601984221f778f4e")
      public
          fun certificateValidity(certificateValidity: CertificateValidityProperty.Builder.() -> Unit) {
      }

      public fun enrollmentFlags(enrollmentFlags: IResolvable) {
      }

      public fun enrollmentFlags(enrollmentFlags: EnrollmentFlagsV4Property) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d51914c61b8f44a21a9a22e35001e6c0c694326a9d9131492a526e81ca0a49a3")
      public fun enrollmentFlags(enrollmentFlags: EnrollmentFlagsV4Property.Builder.() -> Unit) {
      }

      public fun extensions(extensions: IResolvable) {
      }

      public fun extensions(extensions: ExtensionsV4Property) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0a63a09053edb0fe5c88cc378c47555e4c8b13312e68297cc01e6bf85b458588")
      public fun extensions(extensions: ExtensionsV4Property.Builder.() -> Unit) {
      }

      public fun generalFlags(generalFlags: IResolvable) {
      }

      public fun generalFlags(generalFlags: GeneralFlagsV4Property) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("80c2c7feaa734b88333c5a09f8ed2ab4625a9dc2d0bfd63f47ee74feba72ae97")
      public fun generalFlags(generalFlags: GeneralFlagsV4Property.Builder.() -> Unit) {
      }

      public fun hashAlgorithm(hashAlgorithm: String) {
      }

      public fun privateKeyAttributes(privateKeyAttributes: IResolvable) {
      }

      public fun privateKeyAttributes(privateKeyAttributes: PrivateKeyAttributesV4Property) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e5fdb8ab909b7abf3d0405077de5868673cea833a48d9786672c9c8ccf972267")
      public
          fun privateKeyAttributes(privateKeyAttributes: PrivateKeyAttributesV4Property.Builder.() -> Unit) {
      }

      public fun privateKeyFlags(privateKeyFlags: IResolvable) {
      }

      public fun privateKeyFlags(privateKeyFlags: PrivateKeyFlagsV4Property) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("87e0334fce042b80678ea7decf78aae0e4ef5fc1969d92f39affe94d6a863693")
      public fun privateKeyFlags(privateKeyFlags: PrivateKeyFlagsV4Property.Builder.() -> Unit) {
      }

      public fun subjectNameFlags(subjectNameFlags: IResolvable) {
      }

      public fun subjectNameFlags(subjectNameFlags: SubjectNameFlagsV4Property) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ab6eca7ccc213d5db4890825ad29953086900441d71d217ea45feb46d6ad1f9")
      public fun subjectNameFlags(subjectNameFlags: SubjectNameFlagsV4Property.Builder.() -> Unit) {
      }

      public fun supersededTemplates(supersededTemplates: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateV4Property.Builder =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateV4Property.builder()

      public override fun certificateValidity(certificateValidity: IResolvable) {
        cdkBuilder.certificateValidity(certificateValidity.let(IResolvable::unwrap))
      }

      public override fun certificateValidity(certificateValidity: CertificateValidityProperty) {
        cdkBuilder.certificateValidity(certificateValidity.let(CertificateValidityProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("55dd8886fc4c9948f8aa99716fca4040366000833355877e601984221f778f4e")
      public override
          fun certificateValidity(certificateValidity: CertificateValidityProperty.Builder.() -> Unit):
          Unit = certificateValidity(CertificateValidityProperty(certificateValidity))

      public override fun enrollmentFlags(enrollmentFlags: IResolvable) {
        cdkBuilder.enrollmentFlags(enrollmentFlags.let(IResolvable::unwrap))
      }

      public override fun enrollmentFlags(enrollmentFlags: EnrollmentFlagsV4Property) {
        cdkBuilder.enrollmentFlags(enrollmentFlags.let(EnrollmentFlagsV4Property::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d51914c61b8f44a21a9a22e35001e6c0c694326a9d9131492a526e81ca0a49a3")
      public override
          fun enrollmentFlags(enrollmentFlags: EnrollmentFlagsV4Property.Builder.() -> Unit): Unit =
          enrollmentFlags(EnrollmentFlagsV4Property(enrollmentFlags))

      public override fun extensions(extensions: IResolvable) {
        cdkBuilder.extensions(extensions.let(IResolvable::unwrap))
      }

      public override fun extensions(extensions: ExtensionsV4Property) {
        cdkBuilder.extensions(extensions.let(ExtensionsV4Property::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0a63a09053edb0fe5c88cc378c47555e4c8b13312e68297cc01e6bf85b458588")
      public override fun extensions(extensions: ExtensionsV4Property.Builder.() -> Unit): Unit =
          extensions(ExtensionsV4Property(extensions))

      public override fun generalFlags(generalFlags: IResolvable) {
        cdkBuilder.generalFlags(generalFlags.let(IResolvable::unwrap))
      }

      public override fun generalFlags(generalFlags: GeneralFlagsV4Property) {
        cdkBuilder.generalFlags(generalFlags.let(GeneralFlagsV4Property::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("80c2c7feaa734b88333c5a09f8ed2ab4625a9dc2d0bfd63f47ee74feba72ae97")
      public override fun generalFlags(generalFlags: GeneralFlagsV4Property.Builder.() -> Unit):
          Unit = generalFlags(GeneralFlagsV4Property(generalFlags))

      public override fun hashAlgorithm(hashAlgorithm: String) {
        cdkBuilder.hashAlgorithm(hashAlgorithm)
      }

      public override fun privateKeyAttributes(privateKeyAttributes: IResolvable) {
        cdkBuilder.privateKeyAttributes(privateKeyAttributes.let(IResolvable::unwrap))
      }

      public override
          fun privateKeyAttributes(privateKeyAttributes: PrivateKeyAttributesV4Property) {
        cdkBuilder.privateKeyAttributes(privateKeyAttributes.let(PrivateKeyAttributesV4Property::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e5fdb8ab909b7abf3d0405077de5868673cea833a48d9786672c9c8ccf972267")
      public override
          fun privateKeyAttributes(privateKeyAttributes: PrivateKeyAttributesV4Property.Builder.() -> Unit):
          Unit = privateKeyAttributes(PrivateKeyAttributesV4Property(privateKeyAttributes))

      public override fun privateKeyFlags(privateKeyFlags: IResolvable) {
        cdkBuilder.privateKeyFlags(privateKeyFlags.let(IResolvable::unwrap))
      }

      public override fun privateKeyFlags(privateKeyFlags: PrivateKeyFlagsV4Property) {
        cdkBuilder.privateKeyFlags(privateKeyFlags.let(PrivateKeyFlagsV4Property::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("87e0334fce042b80678ea7decf78aae0e4ef5fc1969d92f39affe94d6a863693")
      public override
          fun privateKeyFlags(privateKeyFlags: PrivateKeyFlagsV4Property.Builder.() -> Unit): Unit =
          privateKeyFlags(PrivateKeyFlagsV4Property(privateKeyFlags))

      public override fun subjectNameFlags(subjectNameFlags: IResolvable) {
        cdkBuilder.subjectNameFlags(subjectNameFlags.let(IResolvable::unwrap))
      }

      public override fun subjectNameFlags(subjectNameFlags: SubjectNameFlagsV4Property) {
        cdkBuilder.subjectNameFlags(subjectNameFlags.let(SubjectNameFlagsV4Property::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ab6eca7ccc213d5db4890825ad29953086900441d71d217ea45feb46d6ad1f9")
      public override
          fun subjectNameFlags(subjectNameFlags: SubjectNameFlagsV4Property.Builder.() -> Unit):
          Unit = subjectNameFlags(SubjectNameFlagsV4Property(subjectNameFlags))

      public override fun supersededTemplates(supersededTemplates: List<String>) {
        cdkBuilder.supersededTemplates(supersededTemplates)
      }

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateV4Property =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateV4Property,
    ) : TemplateV4Property {
      public override fun certificateValidity(): Any = unwrap(this).getCertificateValidity()

      public override fun enrollmentFlags(): Any = unwrap(this).getEnrollmentFlags()

      public override fun extensions(): Any = unwrap(this).getExtensions()

      public override fun generalFlags(): Any = unwrap(this).getGeneralFlags()

      public override fun hashAlgorithm(): String? = unwrap(this).getHashAlgorithm()

      public override fun privateKeyAttributes(): Any = unwrap(this).getPrivateKeyAttributes()

      public override fun privateKeyFlags(): Any = unwrap(this).getPrivateKeyFlags()

      public override fun subjectNameFlags(): Any = unwrap(this).getSubjectNameFlags()

      public override fun supersededTemplates(): List<String> =
          unwrap(this).getSupersededTemplates() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TemplateV4Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateV4Property):
          TemplateV4Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TemplateV4Property):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateV4Property = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface CertificateValidityProperty {
    public fun renewalPeriod(): Any

    public fun validityPeriod(): Any

    public interface Builder {
      public fun renewalPeriod(renewalPeriod: IResolvable) {
      }

      public fun renewalPeriod(renewalPeriod: ValidityPeriodProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("074d06ca33d33e75e9aa8418600945d8d29663f6d1be76c0343c2cf70cff619c")
      public fun renewalPeriod(renewalPeriod: ValidityPeriodProperty.Builder.() -> Unit) {
      }

      public fun validityPeriod(validityPeriod: IResolvable) {
      }

      public fun validityPeriod(validityPeriod: ValidityPeriodProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("762e9ab84bc09a28664eaa5d5953d5389f0fa6cb433ee08b768232b09f3c7410")
      public fun validityPeriod(validityPeriod: ValidityPeriodProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.CertificateValidityProperty.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.CertificateValidityProperty.builder()

      public override fun renewalPeriod(renewalPeriod: IResolvable) {
        cdkBuilder.renewalPeriod(renewalPeriod.let(IResolvable::unwrap))
      }

      public override fun renewalPeriod(renewalPeriod: ValidityPeriodProperty) {
        cdkBuilder.renewalPeriod(renewalPeriod.let(ValidityPeriodProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("074d06ca33d33e75e9aa8418600945d8d29663f6d1be76c0343c2cf70cff619c")
      public override fun renewalPeriod(renewalPeriod: ValidityPeriodProperty.Builder.() -> Unit):
          Unit = renewalPeriod(ValidityPeriodProperty(renewalPeriod))

      public override fun validityPeriod(validityPeriod: IResolvable) {
        cdkBuilder.validityPeriod(validityPeriod.let(IResolvable::unwrap))
      }

      public override fun validityPeriod(validityPeriod: ValidityPeriodProperty) {
        cdkBuilder.validityPeriod(validityPeriod.let(ValidityPeriodProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("762e9ab84bc09a28664eaa5d5953d5389f0fa6cb433ee08b768232b09f3c7410")
      public override fun validityPeriod(validityPeriod: ValidityPeriodProperty.Builder.() -> Unit):
          Unit = validityPeriod(ValidityPeriodProperty(validityPeriod))

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.CertificateValidityProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.CertificateValidityProperty,
    ) : CertificateValidityProperty {
      public override fun renewalPeriod(): Any = unwrap(this).getRenewalPeriod()

      public override fun validityPeriod(): Any = unwrap(this).getValidityPeriod()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CertificateValidityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.CertificateValidityProperty):
          CertificateValidityProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CertificateValidityProperty):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.CertificateValidityProperty =
          (wrapped as Wrapper).cdkObject
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

    public interface Builder {
      public fun clientVersion(clientVersion: String) {
      }

      public fun exportableKey(exportableKey: Boolean) {
      }

      public fun exportableKey(exportableKey: IResolvable) {
      }

      public fun requireAlternateSignatureAlgorithm(requireAlternateSignatureAlgorithm: Boolean) {
      }

      public
          fun requireAlternateSignatureAlgorithm(requireAlternateSignatureAlgorithm: IResolvable) {
      }

      public fun requireSameKeyRenewal(requireSameKeyRenewal: Boolean) {
      }

      public fun requireSameKeyRenewal(requireSameKeyRenewal: IResolvable) {
      }

      public fun strongKeyProtectionRequired(strongKeyProtectionRequired: Boolean) {
      }

      public fun strongKeyProtectionRequired(strongKeyProtectionRequired: IResolvable) {
      }

      public fun useLegacyProvider(useLegacyProvider: Boolean) {
      }

      public fun useLegacyProvider(useLegacyProvider: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyFlagsV4Property.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyFlagsV4Property.builder()

      public override fun clientVersion(clientVersion: String) {
        cdkBuilder.clientVersion(clientVersion)
      }

      public override fun exportableKey(exportableKey: Boolean) {
        cdkBuilder.exportableKey(exportableKey)
      }

      public override fun exportableKey(exportableKey: IResolvable) {
        cdkBuilder.exportableKey(exportableKey.let(IResolvable::unwrap))
      }

      public override
          fun requireAlternateSignatureAlgorithm(requireAlternateSignatureAlgorithm: Boolean) {
        cdkBuilder.requireAlternateSignatureAlgorithm(requireAlternateSignatureAlgorithm)
      }

      public override
          fun requireAlternateSignatureAlgorithm(requireAlternateSignatureAlgorithm: IResolvable) {
        cdkBuilder.requireAlternateSignatureAlgorithm(requireAlternateSignatureAlgorithm.let(IResolvable::unwrap))
      }

      public override fun requireSameKeyRenewal(requireSameKeyRenewal: Boolean) {
        cdkBuilder.requireSameKeyRenewal(requireSameKeyRenewal)
      }

      public override fun requireSameKeyRenewal(requireSameKeyRenewal: IResolvable) {
        cdkBuilder.requireSameKeyRenewal(requireSameKeyRenewal.let(IResolvable::unwrap))
      }

      public override fun strongKeyProtectionRequired(strongKeyProtectionRequired: Boolean) {
        cdkBuilder.strongKeyProtectionRequired(strongKeyProtectionRequired)
      }

      public override fun strongKeyProtectionRequired(strongKeyProtectionRequired: IResolvable) {
        cdkBuilder.strongKeyProtectionRequired(strongKeyProtectionRequired.let(IResolvable::unwrap))
      }

      public override fun useLegacyProvider(useLegacyProvider: Boolean) {
        cdkBuilder.useLegacyProvider(useLegacyProvider)
      }

      public override fun useLegacyProvider(useLegacyProvider: IResolvable) {
        cdkBuilder.useLegacyProvider(useLegacyProvider.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyFlagsV4Property =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyFlagsV4Property,
    ) : PrivateKeyFlagsV4Property {
      public override fun clientVersion(): String = unwrap(this).getClientVersion()

      public override fun exportableKey(): Any? = unwrap(this).getExportableKey()

      public override fun requireAlternateSignatureAlgorithm(): Any? =
          unwrap(this).getRequireAlternateSignatureAlgorithm()

      public override fun requireSameKeyRenewal(): Any? = unwrap(this).getRequireSameKeyRenewal()

      public override fun strongKeyProtectionRequired(): Any? =
          unwrap(this).getStrongKeyProtectionRequired()

      public override fun useLegacyProvider(): Any? = unwrap(this).getUseLegacyProvider()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PrivateKeyFlagsV4Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyFlagsV4Property):
          PrivateKeyFlagsV4Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrivateKeyFlagsV4Property):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyFlagsV4Property =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ExtensionsV4Property {
    public fun applicationPolicies(): Any? = unwrap(this).getApplicationPolicies()

    public fun keyUsage(): Any

    public interface Builder {
      public fun applicationPolicies(applicationPolicies: IResolvable) {
      }

      public fun applicationPolicies(applicationPolicies: ApplicationPoliciesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("675d22ebbe7e9e9c07c73217c59014a96cdbd81d23ef77e4d48bc82a7ba6ae7b")
      public
          fun applicationPolicies(applicationPolicies: ApplicationPoliciesProperty.Builder.() -> Unit) {
      }

      public fun keyUsage(keyUsage: IResolvable) {
      }

      public fun keyUsage(keyUsage: KeyUsageProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("776a28e32dec6f401fe6ac8cef051766a5972ba4f4657a12e9d95cbe6aeaa65a")
      public fun keyUsage(keyUsage: KeyUsageProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ExtensionsV4Property.Builder =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ExtensionsV4Property.builder()

      public override fun applicationPolicies(applicationPolicies: IResolvable) {
        cdkBuilder.applicationPolicies(applicationPolicies.let(IResolvable::unwrap))
      }

      public override fun applicationPolicies(applicationPolicies: ApplicationPoliciesProperty) {
        cdkBuilder.applicationPolicies(applicationPolicies.let(ApplicationPoliciesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("675d22ebbe7e9e9c07c73217c59014a96cdbd81d23ef77e4d48bc82a7ba6ae7b")
      public override
          fun applicationPolicies(applicationPolicies: ApplicationPoliciesProperty.Builder.() -> Unit):
          Unit = applicationPolicies(ApplicationPoliciesProperty(applicationPolicies))

      public override fun keyUsage(keyUsage: IResolvable) {
        cdkBuilder.keyUsage(keyUsage.let(IResolvable::unwrap))
      }

      public override fun keyUsage(keyUsage: KeyUsageProperty) {
        cdkBuilder.keyUsage(keyUsage.let(KeyUsageProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("776a28e32dec6f401fe6ac8cef051766a5972ba4f4657a12e9d95cbe6aeaa65a")
      public override fun keyUsage(keyUsage: KeyUsageProperty.Builder.() -> Unit): Unit =
          keyUsage(KeyUsageProperty(keyUsage))

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ExtensionsV4Property =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ExtensionsV4Property,
    ) : ExtensionsV4Property {
      public override fun applicationPolicies(): Any? = unwrap(this).getApplicationPolicies()

      public override fun keyUsage(): Any = unwrap(this).getKeyUsage()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ExtensionsV4Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ExtensionsV4Property):
          ExtensionsV4Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExtensionsV4Property):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ExtensionsV4Property = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface GeneralFlagsV3Property {
    public fun autoEnrollment(): Any? = unwrap(this).getAutoEnrollment()

    public fun machineType(): Any? = unwrap(this).getMachineType()

    public interface Builder {
      public fun autoEnrollment(autoEnrollment: Boolean) {
      }

      public fun autoEnrollment(autoEnrollment: IResolvable) {
      }

      public fun machineType(machineType: Boolean) {
      }

      public fun machineType(machineType: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.GeneralFlagsV3Property.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.GeneralFlagsV3Property.builder()

      public override fun autoEnrollment(autoEnrollment: Boolean) {
        cdkBuilder.autoEnrollment(autoEnrollment)
      }

      public override fun autoEnrollment(autoEnrollment: IResolvable) {
        cdkBuilder.autoEnrollment(autoEnrollment.let(IResolvable::unwrap))
      }

      public override fun machineType(machineType: Boolean) {
        cdkBuilder.machineType(machineType)
      }

      public override fun machineType(machineType: IResolvable) {
        cdkBuilder.machineType(machineType.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.GeneralFlagsV3Property =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.GeneralFlagsV3Property,
    ) : GeneralFlagsV3Property {
      public override fun autoEnrollment(): Any? = unwrap(this).getAutoEnrollment()

      public override fun machineType(): Any? = unwrap(this).getMachineType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GeneralFlagsV3Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.GeneralFlagsV3Property):
          GeneralFlagsV3Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GeneralFlagsV3Property):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.GeneralFlagsV3Property =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ValidityPeriodProperty {
    public fun period(): Number

    public fun periodType(): String

    public interface Builder {
      public fun period(period: Number) {
      }

      public fun periodType(periodType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ValidityPeriodProperty.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ValidityPeriodProperty.builder()

      public override fun period(period: Number) {
        cdkBuilder.period(period)
      }

      public override fun periodType(periodType: String) {
        cdkBuilder.periodType(periodType)
      }

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ValidityPeriodProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ValidityPeriodProperty,
    ) : ValidityPeriodProperty {
      public override fun period(): Number = unwrap(this).getPeriod()

      public override fun periodType(): String = unwrap(this).getPeriodType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ValidityPeriodProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ValidityPeriodProperty):
          ValidityPeriodProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ValidityPeriodProperty):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ValidityPeriodProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
