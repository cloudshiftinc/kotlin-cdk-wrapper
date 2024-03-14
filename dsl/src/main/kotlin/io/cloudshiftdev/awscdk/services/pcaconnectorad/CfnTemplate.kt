package io.cloudshiftdev.awscdk.services.pcaconnectorad

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
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
  internal override val cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * The Amazon Resource Name (ARN) that was returned when you called
   * [CreateTemplate](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateTemplate.html)
   * .
   */
  public open fun attrTemplateArn(): String = unwrap(this).getAttrTemplateArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The Amazon Resource Name (ARN) that was returned when you called
   * [CreateConnector](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html)
   * .
   */
  public open fun connectorArn(): String = unwrap(this).getConnectorArn()

  /**
   * The Amazon Resource Name (ARN) that was returned when you called
   * [CreateConnector](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html)
   * .
   */
  public open fun connectorArn(`value`: String) {
    unwrap(this).setConnectorArn(`value`)
  }

  /**
   * Template configuration to define the information included in certificates.
   */
  public open fun definition(): Any = unwrap(this).getDefinition()

  /**
   * Template configuration to define the information included in certificates.
   */
  public open fun definition(`value`: IResolvable) {
    unwrap(this).setDefinition(`value`.let(IResolvable::unwrap))
  }

  /**
   * Template configuration to define the information included in certificates.
   */
  public open fun definition(`value`: TemplateDefinitionProperty) {
    unwrap(this).setDefinition(`value`.let(TemplateDefinitionProperty::unwrap))
  }

  /**
   * Template configuration to define the information included in certificates.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1a945e718eb9858d45f14af1ebccdba3cdd6a3f1bf515eb44c6f3d126a0ea02a")
  public open fun definition(`value`: TemplateDefinitionProperty.Builder.() -> Unit): Unit =
      definition(TemplateDefinitionProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Name of the templates.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * Name of the templates.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * This setting allows the major version of a template to be increased automatically.
   */
  public open fun reenrollAllCertificateHolders(): Any? =
      unwrap(this).getReenrollAllCertificateHolders()

  /**
   * This setting allows the major version of a template to be increased automatically.
   */
  public open fun reenrollAllCertificateHolders(`value`: Boolean) {
    unwrap(this).setReenrollAllCertificateHolders(`value`)
  }

  /**
   * This setting allows the major version of a template to be increased automatically.
   */
  public open fun reenrollAllCertificateHolders(`value`: IResolvable) {
    unwrap(this).setReenrollAllCertificateHolders(`value`.let(IResolvable::unwrap))
  }

  /**
   * Metadata assigned to a template consisting of a key-value pair.
   */
  public open fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * Metadata assigned to a template consisting of a key-value pair.
   */
  public open fun tags(`value`: Map<String, String>) {
    unwrap(this).setTags(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.pcaconnectorad.CfnTemplate].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) that was returned when you called
     * [CreateConnector](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-template.html#cfn-pcaconnectorad-template-connectorarn)
     * @param connectorArn The Amazon Resource Name (ARN) that was returned when you called
     * [CreateConnector](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html)
     * . 
     */
    public fun connectorArn(connectorArn: String)

    /**
     * Template configuration to define the information included in certificates.
     *
     * Define certificate validity and renewal periods, certificate request handling and enrollment
     * options, key usage extensions, application policies, and cryptography settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-template.html#cfn-pcaconnectorad-template-definition)
     * @param definition Template configuration to define the information included in certificates. 
     */
    public fun definition(definition: IResolvable)

    /**
     * Template configuration to define the information included in certificates.
     *
     * Define certificate validity and renewal periods, certificate request handling and enrollment
     * options, key usage extensions, application policies, and cryptography settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-template.html#cfn-pcaconnectorad-template-definition)
     * @param definition Template configuration to define the information included in certificates. 
     */
    public fun definition(definition: TemplateDefinitionProperty)

    /**
     * Template configuration to define the information included in certificates.
     *
     * Define certificate validity and renewal periods, certificate request handling and enrollment
     * options, key usage extensions, application policies, and cryptography settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-template.html#cfn-pcaconnectorad-template-definition)
     * @param definition Template configuration to define the information included in certificates. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cef2610f97300dba7dafb1ad089a958eae72f1f84cf52f8f01ac23b494d60356")
    public fun definition(definition: TemplateDefinitionProperty.Builder.() -> Unit)

    /**
     * Name of the templates.
     *
     * Template names must be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-template.html#cfn-pcaconnectorad-template-name)
     * @param name Name of the templates. 
     */
    public fun name(name: String)

    /**
     * This setting allows the major version of a template to be increased automatically.
     *
     * All members of Active Directory groups that are allowed to enroll with a template will
     * receive a new certificate issued using that template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-template.html#cfn-pcaconnectorad-template-reenrollallcertificateholders)
     * @param reenrollAllCertificateHolders This setting allows the major version of a template to
     * be increased automatically. 
     */
    public fun reenrollAllCertificateHolders(reenrollAllCertificateHolders: Boolean)

    /**
     * This setting allows the major version of a template to be increased automatically.
     *
     * All members of Active Directory groups that are allowed to enroll with a template will
     * receive a new certificate issued using that template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-template.html#cfn-pcaconnectorad-template-reenrollallcertificateholders)
     * @param reenrollAllCertificateHolders This setting allows the major version of a template to
     * be increased automatically. 
     */
    public fun reenrollAllCertificateHolders(reenrollAllCertificateHolders: IResolvable)

    /**
     * Metadata assigned to a template consisting of a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-template.html#cfn-pcaconnectorad-template-tags)
     * @param tags Metadata assigned to a template consisting of a key-value pair. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.Builder =
        software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) that was returned when you called
     * [CreateConnector](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-template.html#cfn-pcaconnectorad-template-connectorarn)
     * @param connectorArn The Amazon Resource Name (ARN) that was returned when you called
     * [CreateConnector](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html)
     * . 
     */
    override fun connectorArn(connectorArn: String) {
      cdkBuilder.connectorArn(connectorArn)
    }

    /**
     * Template configuration to define the information included in certificates.
     *
     * Define certificate validity and renewal periods, certificate request handling and enrollment
     * options, key usage extensions, application policies, and cryptography settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-template.html#cfn-pcaconnectorad-template-definition)
     * @param definition Template configuration to define the information included in certificates. 
     */
    override fun definition(definition: IResolvable) {
      cdkBuilder.definition(definition.let(IResolvable::unwrap))
    }

    /**
     * Template configuration to define the information included in certificates.
     *
     * Define certificate validity and renewal periods, certificate request handling and enrollment
     * options, key usage extensions, application policies, and cryptography settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-template.html#cfn-pcaconnectorad-template-definition)
     * @param definition Template configuration to define the information included in certificates. 
     */
    override fun definition(definition: TemplateDefinitionProperty) {
      cdkBuilder.definition(definition.let(TemplateDefinitionProperty::unwrap))
    }

    /**
     * Template configuration to define the information included in certificates.
     *
     * Define certificate validity and renewal periods, certificate request handling and enrollment
     * options, key usage extensions, application policies, and cryptography settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-template.html#cfn-pcaconnectorad-template-definition)
     * @param definition Template configuration to define the information included in certificates. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cef2610f97300dba7dafb1ad089a958eae72f1f84cf52f8f01ac23b494d60356")
    override fun definition(definition: TemplateDefinitionProperty.Builder.() -> Unit): Unit =
        definition(TemplateDefinitionProperty(definition))

    /**
     * Name of the templates.
     *
     * Template names must be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-template.html#cfn-pcaconnectorad-template-name)
     * @param name Name of the templates. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * This setting allows the major version of a template to be increased automatically.
     *
     * All members of Active Directory groups that are allowed to enroll with a template will
     * receive a new certificate issued using that template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-template.html#cfn-pcaconnectorad-template-reenrollallcertificateholders)
     * @param reenrollAllCertificateHolders This setting allows the major version of a template to
     * be increased automatically. 
     */
    override fun reenrollAllCertificateHolders(reenrollAllCertificateHolders: Boolean) {
      cdkBuilder.reenrollAllCertificateHolders(reenrollAllCertificateHolders)
    }

    /**
     * This setting allows the major version of a template to be increased automatically.
     *
     * All members of Active Directory groups that are allowed to enroll with a template will
     * receive a new certificate issued using that template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-template.html#cfn-pcaconnectorad-template-reenrollallcertificateholders)
     * @param reenrollAllCertificateHolders This setting allows the major version of a template to
     * be increased automatically. 
     */
    override fun reenrollAllCertificateHolders(reenrollAllCertificateHolders: IResolvable) {
      cdkBuilder.reenrollAllCertificateHolders(reenrollAllCertificateHolders.let(IResolvable::unwrap))
    }

    /**
     * Metadata assigned to a template consisting of a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-template.html#cfn-pcaconnectorad-template-tags)
     * @param tags Metadata assigned to a template consisting of a key-value pair. 
     */
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
    /**
     * Application policies specify what the certificate is used for and its purpose.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-extensionsv3.html#cfn-pcaconnectorad-template-extensionsv3-applicationpolicies)
     */
    public fun applicationPolicies(): Any? = unwrap(this).getApplicationPolicies()

    /**
     * The key usage extension defines the purpose (e.g., encipherment, signature, certificate
     * signing) of the key contained in the certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-extensionsv3.html#cfn-pcaconnectorad-template-extensionsv3-keyusage)
     */
    public fun keyUsage(): Any

    /**
     * A builder for [ExtensionsV3Property]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param applicationPolicies Application policies specify what the certificate is used for
       * and its purpose.
       */
      public fun applicationPolicies(applicationPolicies: IResolvable)

      /**
       * @param applicationPolicies Application policies specify what the certificate is used for
       * and its purpose.
       */
      public fun applicationPolicies(applicationPolicies: ApplicationPoliciesProperty)

      /**
       * @param applicationPolicies Application policies specify what the certificate is used for
       * and its purpose.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8201469e5ac85f25a2c135e7e4ed5c98b23b3a388d059e52d970ec6e4eed8bed")
      public
          fun applicationPolicies(applicationPolicies: ApplicationPoliciesProperty.Builder.() -> Unit)

      /**
       * @param keyUsage The key usage extension defines the purpose (e.g., encipherment, signature,
       * certificate signing) of the key contained in the certificate. 
       */
      public fun keyUsage(keyUsage: IResolvable)

      /**
       * @param keyUsage The key usage extension defines the purpose (e.g., encipherment, signature,
       * certificate signing) of the key contained in the certificate. 
       */
      public fun keyUsage(keyUsage: KeyUsageProperty)

      /**
       * @param keyUsage The key usage extension defines the purpose (e.g., encipherment, signature,
       * certificate signing) of the key contained in the certificate. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8fdb8ba610d030b037f4ef5b4054447e0abc901ccda837564f1317f8515adc8d")
      public fun keyUsage(keyUsage: KeyUsageProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ExtensionsV3Property.Builder =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ExtensionsV3Property.builder()

      /**
       * @param applicationPolicies Application policies specify what the certificate is used for
       * and its purpose.
       */
      override fun applicationPolicies(applicationPolicies: IResolvable) {
        cdkBuilder.applicationPolicies(applicationPolicies.let(IResolvable::unwrap))
      }

      /**
       * @param applicationPolicies Application policies specify what the certificate is used for
       * and its purpose.
       */
      override fun applicationPolicies(applicationPolicies: ApplicationPoliciesProperty) {
        cdkBuilder.applicationPolicies(applicationPolicies.let(ApplicationPoliciesProperty::unwrap))
      }

      /**
       * @param applicationPolicies Application policies specify what the certificate is used for
       * and its purpose.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8201469e5ac85f25a2c135e7e4ed5c98b23b3a388d059e52d970ec6e4eed8bed")
      override
          fun applicationPolicies(applicationPolicies: ApplicationPoliciesProperty.Builder.() -> Unit):
          Unit = applicationPolicies(ApplicationPoliciesProperty(applicationPolicies))

      /**
       * @param keyUsage The key usage extension defines the purpose (e.g., encipherment, signature,
       * certificate signing) of the key contained in the certificate. 
       */
      override fun keyUsage(keyUsage: IResolvable) {
        cdkBuilder.keyUsage(keyUsage.let(IResolvable::unwrap))
      }

      /**
       * @param keyUsage The key usage extension defines the purpose (e.g., encipherment, signature,
       * certificate signing) of the key contained in the certificate. 
       */
      override fun keyUsage(keyUsage: KeyUsageProperty) {
        cdkBuilder.keyUsage(keyUsage.let(KeyUsageProperty::unwrap))
      }

      /**
       * @param keyUsage The key usage extension defines the purpose (e.g., encipherment, signature,
       * certificate signing) of the key contained in the certificate. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
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
      /**
       * Application policies specify what the certificate is used for and its purpose.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-extensionsv3.html#cfn-pcaconnectorad-template-extensionsv3-applicationpolicies)
       */
      override fun applicationPolicies(): Any? = unwrap(this).getApplicationPolicies()

      /**
       * The key usage extension defines the purpose (e.g., encipherment, signature, certificate
       * signing) of the key contained in the certificate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-extensionsv3.html#cfn-pcaconnectorad-template-extensionsv3-keyusage)
       */
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
    /**
     * DataEncipherment is asserted when the subject public key is used for directly enciphering raw
     * user data without the use of an intermediate symmetric cipher.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-keyusageflags.html#cfn-pcaconnectorad-template-keyusageflags-dataencipherment)
     */
    public fun dataEncipherment(): Any? = unwrap(this).getDataEncipherment()

    /**
     * The digitalSignature is asserted when the subject public key is used for verifying digital
     * signatures.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-keyusageflags.html#cfn-pcaconnectorad-template-keyusageflags-digitalsignature)
     */
    public fun digitalSignature(): Any? = unwrap(this).getDigitalSignature()

    /**
     * KeyAgreement is asserted when the subject public key is used for key agreement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-keyusageflags.html#cfn-pcaconnectorad-template-keyusageflags-keyagreement)
     */
    public fun keyAgreement(): Any? = unwrap(this).getKeyAgreement()

    /**
     * KeyEncipherment is asserted when the subject public key is used for enciphering private or
     * secret keys, i.e., for key transport.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-keyusageflags.html#cfn-pcaconnectorad-template-keyusageflags-keyencipherment)
     */
    public fun keyEncipherment(): Any? = unwrap(this).getKeyEncipherment()

    /**
     * NonRepudiation is asserted when the subject public key is used to verify digital signatures.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-keyusageflags.html#cfn-pcaconnectorad-template-keyusageflags-nonrepudiation)
     */
    public fun nonRepudiation(): Any? = unwrap(this).getNonRepudiation()

    /**
     * A builder for [KeyUsageFlagsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataEncipherment DataEncipherment is asserted when the subject public key is used
       * for directly enciphering raw user data without the use of an intermediate symmetric cipher.
       */
      public fun dataEncipherment(dataEncipherment: Boolean)

      /**
       * @param dataEncipherment DataEncipherment is asserted when the subject public key is used
       * for directly enciphering raw user data without the use of an intermediate symmetric cipher.
       */
      public fun dataEncipherment(dataEncipherment: IResolvable)

      /**
       * @param digitalSignature The digitalSignature is asserted when the subject public key is
       * used for verifying digital signatures.
       */
      public fun digitalSignature(digitalSignature: Boolean)

      /**
       * @param digitalSignature The digitalSignature is asserted when the subject public key is
       * used for verifying digital signatures.
       */
      public fun digitalSignature(digitalSignature: IResolvable)

      /**
       * @param keyAgreement KeyAgreement is asserted when the subject public key is used for key
       * agreement.
       */
      public fun keyAgreement(keyAgreement: Boolean)

      /**
       * @param keyAgreement KeyAgreement is asserted when the subject public key is used for key
       * agreement.
       */
      public fun keyAgreement(keyAgreement: IResolvable)

      /**
       * @param keyEncipherment KeyEncipherment is asserted when the subject public key is used for
       * enciphering private or secret keys, i.e., for key transport.
       */
      public fun keyEncipherment(keyEncipherment: Boolean)

      /**
       * @param keyEncipherment KeyEncipherment is asserted when the subject public key is used for
       * enciphering private or secret keys, i.e., for key transport.
       */
      public fun keyEncipherment(keyEncipherment: IResolvable)

      /**
       * @param nonRepudiation NonRepudiation is asserted when the subject public key is used to
       * verify digital signatures.
       */
      public fun nonRepudiation(nonRepudiation: Boolean)

      /**
       * @param nonRepudiation NonRepudiation is asserted when the subject public key is used to
       * verify digital signatures.
       */
      public fun nonRepudiation(nonRepudiation: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsageFlagsProperty.Builder =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsageFlagsProperty.builder()

      /**
       * @param dataEncipherment DataEncipherment is asserted when the subject public key is used
       * for directly enciphering raw user data without the use of an intermediate symmetric cipher.
       */
      override fun dataEncipherment(dataEncipherment: Boolean) {
        cdkBuilder.dataEncipherment(dataEncipherment)
      }

      /**
       * @param dataEncipherment DataEncipherment is asserted when the subject public key is used
       * for directly enciphering raw user data without the use of an intermediate symmetric cipher.
       */
      override fun dataEncipherment(dataEncipherment: IResolvable) {
        cdkBuilder.dataEncipherment(dataEncipherment.let(IResolvable::unwrap))
      }

      /**
       * @param digitalSignature The digitalSignature is asserted when the subject public key is
       * used for verifying digital signatures.
       */
      override fun digitalSignature(digitalSignature: Boolean) {
        cdkBuilder.digitalSignature(digitalSignature)
      }

      /**
       * @param digitalSignature The digitalSignature is asserted when the subject public key is
       * used for verifying digital signatures.
       */
      override fun digitalSignature(digitalSignature: IResolvable) {
        cdkBuilder.digitalSignature(digitalSignature.let(IResolvable::unwrap))
      }

      /**
       * @param keyAgreement KeyAgreement is asserted when the subject public key is used for key
       * agreement.
       */
      override fun keyAgreement(keyAgreement: Boolean) {
        cdkBuilder.keyAgreement(keyAgreement)
      }

      /**
       * @param keyAgreement KeyAgreement is asserted when the subject public key is used for key
       * agreement.
       */
      override fun keyAgreement(keyAgreement: IResolvable) {
        cdkBuilder.keyAgreement(keyAgreement.let(IResolvable::unwrap))
      }

      /**
       * @param keyEncipherment KeyEncipherment is asserted when the subject public key is used for
       * enciphering private or secret keys, i.e., for key transport.
       */
      override fun keyEncipherment(keyEncipherment: Boolean) {
        cdkBuilder.keyEncipherment(keyEncipherment)
      }

      /**
       * @param keyEncipherment KeyEncipherment is asserted when the subject public key is used for
       * enciphering private or secret keys, i.e., for key transport.
       */
      override fun keyEncipherment(keyEncipherment: IResolvable) {
        cdkBuilder.keyEncipherment(keyEncipherment.let(IResolvable::unwrap))
      }

      /**
       * @param nonRepudiation NonRepudiation is asserted when the subject public key is used to
       * verify digital signatures.
       */
      override fun nonRepudiation(nonRepudiation: Boolean) {
        cdkBuilder.nonRepudiation(nonRepudiation)
      }

      /**
       * @param nonRepudiation NonRepudiation is asserted when the subject public key is used to
       * verify digital signatures.
       */
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
      /**
       * DataEncipherment is asserted when the subject public key is used for directly enciphering
       * raw user data without the use of an intermediate symmetric cipher.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-keyusageflags.html#cfn-pcaconnectorad-template-keyusageflags-dataencipherment)
       */
      override fun dataEncipherment(): Any? = unwrap(this).getDataEncipherment()

      /**
       * The digitalSignature is asserted when the subject public key is used for verifying digital
       * signatures.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-keyusageflags.html#cfn-pcaconnectorad-template-keyusageflags-digitalsignature)
       */
      override fun digitalSignature(): Any? = unwrap(this).getDigitalSignature()

      /**
       * KeyAgreement is asserted when the subject public key is used for key agreement.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-keyusageflags.html#cfn-pcaconnectorad-template-keyusageflags-keyagreement)
       */
      override fun keyAgreement(): Any? = unwrap(this).getKeyAgreement()

      /**
       * KeyEncipherment is asserted when the subject public key is used for enciphering private or
       * secret keys, i.e., for key transport.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-keyusageflags.html#cfn-pcaconnectorad-template-keyusageflags-keyencipherment)
       */
      override fun keyEncipherment(): Any? = unwrap(this).getKeyEncipherment()

      /**
       * NonRepudiation is asserted when the subject public key is used to verify digital
       * signatures.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-keyusageflags.html#cfn-pcaconnectorad-template-keyusageflags-nonrepudiation)
       */
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
    /**
     * Certificate validity describes the validity and renewal periods of a certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev2.html#cfn-pcaconnectorad-template-templatev2-certificatevalidity)
     */
    public fun certificateValidity(): Any

    /**
     * Enrollment flags describe the enrollment settings for certificates such as using the existing
     * private key and deleting expired or revoked certificates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev2.html#cfn-pcaconnectorad-template-templatev2-enrollmentflags)
     */
    public fun enrollmentFlags(): Any

    /**
     * Extensions describe the key usage extensions and application policies for a template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev2.html#cfn-pcaconnectorad-template-templatev2-extensions)
     */
    public fun extensions(): Any

    /**
     * General flags describe whether the template is used for computers or users and if the
     * template can be used with autoenrollment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev2.html#cfn-pcaconnectorad-template-templatev2-generalflags)
     */
    public fun generalFlags(): Any

    /**
     * Private key attributes allow you to specify the minimal key length, key spec, and
     * cryptographic providers for the private key of a certificate for v2 templates.
     *
     * V2 templates allow you to use Legacy Cryptographic Service Providers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev2.html#cfn-pcaconnectorad-template-templatev2-privatekeyattributes)
     */
    public fun privateKeyAttributes(): Any

    /**
     * Private key flags for v2 templates specify the client compatibility, if the private key can
     * be exported, and if user input is required when using a private key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev2.html#cfn-pcaconnectorad-template-templatev2-privatekeyflags)
     */
    public fun privateKeyFlags(): Any

    /**
     * Subject name flags describe the subject name and subject alternate name that is included in a
     * certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev2.html#cfn-pcaconnectorad-template-templatev2-subjectnameflags)
     */
    public fun subjectNameFlags(): Any

    /**
     * List of templates in Active Directory that are superseded by this template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev2.html#cfn-pcaconnectorad-template-templatev2-supersededtemplates)
     */
    public fun supersededTemplates(): List<String> = unwrap(this).getSupersededTemplates() ?:
        emptyList()

    /**
     * A builder for [TemplateV2Property]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param certificateValidity Certificate validity describes the validity and renewal periods
       * of a certificate. 
       */
      public fun certificateValidity(certificateValidity: IResolvable)

      /**
       * @param certificateValidity Certificate validity describes the validity and renewal periods
       * of a certificate. 
       */
      public fun certificateValidity(certificateValidity: CertificateValidityProperty)

      /**
       * @param certificateValidity Certificate validity describes the validity and renewal periods
       * of a certificate. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f7ddf8a48640e737a7dfb8c01e91d6ec86073099caa5ab11876f97de1c9d158e")
      public
          fun certificateValidity(certificateValidity: CertificateValidityProperty.Builder.() -> Unit)

      /**
       * @param enrollmentFlags Enrollment flags describe the enrollment settings for certificates
       * such as using the existing private key and deleting expired or revoked certificates. 
       */
      public fun enrollmentFlags(enrollmentFlags: IResolvable)

      /**
       * @param enrollmentFlags Enrollment flags describe the enrollment settings for certificates
       * such as using the existing private key and deleting expired or revoked certificates. 
       */
      public fun enrollmentFlags(enrollmentFlags: EnrollmentFlagsV2Property)

      /**
       * @param enrollmentFlags Enrollment flags describe the enrollment settings for certificates
       * such as using the existing private key and deleting expired or revoked certificates. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2a1cd137d82b18c2e0e4e97700db5329cc81e74cfa8a4bf9419e1f91d4ea49c5")
      public fun enrollmentFlags(enrollmentFlags: EnrollmentFlagsV2Property.Builder.() -> Unit)

      /**
       * @param extensions Extensions describe the key usage extensions and application policies for
       * a template. 
       */
      public fun extensions(extensions: IResolvable)

      /**
       * @param extensions Extensions describe the key usage extensions and application policies for
       * a template. 
       */
      public fun extensions(extensions: ExtensionsV2Property)

      /**
       * @param extensions Extensions describe the key usage extensions and application policies for
       * a template. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb6ebcef6730c962cd58bb1186d3f8631c828df66203546ae139d1b2ccd20777")
      public fun extensions(extensions: ExtensionsV2Property.Builder.() -> Unit)

      /**
       * @param generalFlags General flags describe whether the template is used for computers or
       * users and if the template can be used with autoenrollment. 
       */
      public fun generalFlags(generalFlags: IResolvable)

      /**
       * @param generalFlags General flags describe whether the template is used for computers or
       * users and if the template can be used with autoenrollment. 
       */
      public fun generalFlags(generalFlags: GeneralFlagsV2Property)

      /**
       * @param generalFlags General flags describe whether the template is used for computers or
       * users and if the template can be used with autoenrollment. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d5bad24f0c50e9df1b3bbd2144d57cf0f6992496e2136c9734c09b1d0529f10")
      public fun generalFlags(generalFlags: GeneralFlagsV2Property.Builder.() -> Unit)

      /**
       * @param privateKeyAttributes Private key attributes allow you to specify the minimal key
       * length, key spec, and cryptographic providers for the private key of a certificate for v2
       * templates. 
       * V2 templates allow you to use Legacy Cryptographic Service Providers.
       */
      public fun privateKeyAttributes(privateKeyAttributes: IResolvable)

      /**
       * @param privateKeyAttributes Private key attributes allow you to specify the minimal key
       * length, key spec, and cryptographic providers for the private key of a certificate for v2
       * templates. 
       * V2 templates allow you to use Legacy Cryptographic Service Providers.
       */
      public fun privateKeyAttributes(privateKeyAttributes: PrivateKeyAttributesV2Property)

      /**
       * @param privateKeyAttributes Private key attributes allow you to specify the minimal key
       * length, key spec, and cryptographic providers for the private key of a certificate for v2
       * templates. 
       * V2 templates allow you to use Legacy Cryptographic Service Providers.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ba95fa0808a14ad4ce0aa08eca2cfa255df3a5ba6dfbdfb46b03028de13bc3de")
      public
          fun privateKeyAttributes(privateKeyAttributes: PrivateKeyAttributesV2Property.Builder.() -> Unit)

      /**
       * @param privateKeyFlags Private key flags for v2 templates specify the client compatibility,
       * if the private key can be exported, and if user input is required when using a private key. 
       */
      public fun privateKeyFlags(privateKeyFlags: IResolvable)

      /**
       * @param privateKeyFlags Private key flags for v2 templates specify the client compatibility,
       * if the private key can be exported, and if user input is required when using a private key. 
       */
      public fun privateKeyFlags(privateKeyFlags: PrivateKeyFlagsV2Property)

      /**
       * @param privateKeyFlags Private key flags for v2 templates specify the client compatibility,
       * if the private key can be exported, and if user input is required when using a private key. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f2c5a481fc2c9f7b56b47b9c458feb8a9ff5f1a3a33ffac98279acb301662149")
      public fun privateKeyFlags(privateKeyFlags: PrivateKeyFlagsV2Property.Builder.() -> Unit)

      /**
       * @param subjectNameFlags Subject name flags describe the subject name and subject alternate
       * name that is included in a certificate. 
       */
      public fun subjectNameFlags(subjectNameFlags: IResolvable)

      /**
       * @param subjectNameFlags Subject name flags describe the subject name and subject alternate
       * name that is included in a certificate. 
       */
      public fun subjectNameFlags(subjectNameFlags: SubjectNameFlagsV2Property)

      /**
       * @param subjectNameFlags Subject name flags describe the subject name and subject alternate
       * name that is included in a certificate. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("83b125f0bd827f94cfd9493a0411c660dd8e0a0890d0b23276b036d39d32491a")
      public fun subjectNameFlags(subjectNameFlags: SubjectNameFlagsV2Property.Builder.() -> Unit)

      /**
       * @param supersededTemplates List of templates in Active Directory that are superseded by
       * this template.
       */
      public fun supersededTemplates(supersededTemplates: List<String>)

      /**
       * @param supersededTemplates List of templates in Active Directory that are superseded by
       * this template.
       */
      public fun supersededTemplates(vararg supersededTemplates: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateV2Property.Builder =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateV2Property.builder()

      /**
       * @param certificateValidity Certificate validity describes the validity and renewal periods
       * of a certificate. 
       */
      override fun certificateValidity(certificateValidity: IResolvable) {
        cdkBuilder.certificateValidity(certificateValidity.let(IResolvable::unwrap))
      }

      /**
       * @param certificateValidity Certificate validity describes the validity and renewal periods
       * of a certificate. 
       */
      override fun certificateValidity(certificateValidity: CertificateValidityProperty) {
        cdkBuilder.certificateValidity(certificateValidity.let(CertificateValidityProperty::unwrap))
      }

      /**
       * @param certificateValidity Certificate validity describes the validity and renewal periods
       * of a certificate. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f7ddf8a48640e737a7dfb8c01e91d6ec86073099caa5ab11876f97de1c9d158e")
      override
          fun certificateValidity(certificateValidity: CertificateValidityProperty.Builder.() -> Unit):
          Unit = certificateValidity(CertificateValidityProperty(certificateValidity))

      /**
       * @param enrollmentFlags Enrollment flags describe the enrollment settings for certificates
       * such as using the existing private key and deleting expired or revoked certificates. 
       */
      override fun enrollmentFlags(enrollmentFlags: IResolvable) {
        cdkBuilder.enrollmentFlags(enrollmentFlags.let(IResolvable::unwrap))
      }

      /**
       * @param enrollmentFlags Enrollment flags describe the enrollment settings for certificates
       * such as using the existing private key and deleting expired or revoked certificates. 
       */
      override fun enrollmentFlags(enrollmentFlags: EnrollmentFlagsV2Property) {
        cdkBuilder.enrollmentFlags(enrollmentFlags.let(EnrollmentFlagsV2Property::unwrap))
      }

      /**
       * @param enrollmentFlags Enrollment flags describe the enrollment settings for certificates
       * such as using the existing private key and deleting expired or revoked certificates. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2a1cd137d82b18c2e0e4e97700db5329cc81e74cfa8a4bf9419e1f91d4ea49c5")
      override fun enrollmentFlags(enrollmentFlags: EnrollmentFlagsV2Property.Builder.() -> Unit):
          Unit = enrollmentFlags(EnrollmentFlagsV2Property(enrollmentFlags))

      /**
       * @param extensions Extensions describe the key usage extensions and application policies for
       * a template. 
       */
      override fun extensions(extensions: IResolvable) {
        cdkBuilder.extensions(extensions.let(IResolvable::unwrap))
      }

      /**
       * @param extensions Extensions describe the key usage extensions and application policies for
       * a template. 
       */
      override fun extensions(extensions: ExtensionsV2Property) {
        cdkBuilder.extensions(extensions.let(ExtensionsV2Property::unwrap))
      }

      /**
       * @param extensions Extensions describe the key usage extensions and application policies for
       * a template. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb6ebcef6730c962cd58bb1186d3f8631c828df66203546ae139d1b2ccd20777")
      override fun extensions(extensions: ExtensionsV2Property.Builder.() -> Unit): Unit =
          extensions(ExtensionsV2Property(extensions))

      /**
       * @param generalFlags General flags describe whether the template is used for computers or
       * users and if the template can be used with autoenrollment. 
       */
      override fun generalFlags(generalFlags: IResolvable) {
        cdkBuilder.generalFlags(generalFlags.let(IResolvable::unwrap))
      }

      /**
       * @param generalFlags General flags describe whether the template is used for computers or
       * users and if the template can be used with autoenrollment. 
       */
      override fun generalFlags(generalFlags: GeneralFlagsV2Property) {
        cdkBuilder.generalFlags(generalFlags.let(GeneralFlagsV2Property::unwrap))
      }

      /**
       * @param generalFlags General flags describe whether the template is used for computers or
       * users and if the template can be used with autoenrollment. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d5bad24f0c50e9df1b3bbd2144d57cf0f6992496e2136c9734c09b1d0529f10")
      override fun generalFlags(generalFlags: GeneralFlagsV2Property.Builder.() -> Unit): Unit =
          generalFlags(GeneralFlagsV2Property(generalFlags))

      /**
       * @param privateKeyAttributes Private key attributes allow you to specify the minimal key
       * length, key spec, and cryptographic providers for the private key of a certificate for v2
       * templates. 
       * V2 templates allow you to use Legacy Cryptographic Service Providers.
       */
      override fun privateKeyAttributes(privateKeyAttributes: IResolvable) {
        cdkBuilder.privateKeyAttributes(privateKeyAttributes.let(IResolvable::unwrap))
      }

      /**
       * @param privateKeyAttributes Private key attributes allow you to specify the minimal key
       * length, key spec, and cryptographic providers for the private key of a certificate for v2
       * templates. 
       * V2 templates allow you to use Legacy Cryptographic Service Providers.
       */
      override fun privateKeyAttributes(privateKeyAttributes: PrivateKeyAttributesV2Property) {
        cdkBuilder.privateKeyAttributes(privateKeyAttributes.let(PrivateKeyAttributesV2Property::unwrap))
      }

      /**
       * @param privateKeyAttributes Private key attributes allow you to specify the minimal key
       * length, key spec, and cryptographic providers for the private key of a certificate for v2
       * templates. 
       * V2 templates allow you to use Legacy Cryptographic Service Providers.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ba95fa0808a14ad4ce0aa08eca2cfa255df3a5ba6dfbdfb46b03028de13bc3de")
      override
          fun privateKeyAttributes(privateKeyAttributes: PrivateKeyAttributesV2Property.Builder.() -> Unit):
          Unit = privateKeyAttributes(PrivateKeyAttributesV2Property(privateKeyAttributes))

      /**
       * @param privateKeyFlags Private key flags for v2 templates specify the client compatibility,
       * if the private key can be exported, and if user input is required when using a private key. 
       */
      override fun privateKeyFlags(privateKeyFlags: IResolvable) {
        cdkBuilder.privateKeyFlags(privateKeyFlags.let(IResolvable::unwrap))
      }

      /**
       * @param privateKeyFlags Private key flags for v2 templates specify the client compatibility,
       * if the private key can be exported, and if user input is required when using a private key. 
       */
      override fun privateKeyFlags(privateKeyFlags: PrivateKeyFlagsV2Property) {
        cdkBuilder.privateKeyFlags(privateKeyFlags.let(PrivateKeyFlagsV2Property::unwrap))
      }

      /**
       * @param privateKeyFlags Private key flags for v2 templates specify the client compatibility,
       * if the private key can be exported, and if user input is required when using a private key. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f2c5a481fc2c9f7b56b47b9c458feb8a9ff5f1a3a33ffac98279acb301662149")
      override fun privateKeyFlags(privateKeyFlags: PrivateKeyFlagsV2Property.Builder.() -> Unit):
          Unit = privateKeyFlags(PrivateKeyFlagsV2Property(privateKeyFlags))

      /**
       * @param subjectNameFlags Subject name flags describe the subject name and subject alternate
       * name that is included in a certificate. 
       */
      override fun subjectNameFlags(subjectNameFlags: IResolvable) {
        cdkBuilder.subjectNameFlags(subjectNameFlags.let(IResolvable::unwrap))
      }

      /**
       * @param subjectNameFlags Subject name flags describe the subject name and subject alternate
       * name that is included in a certificate. 
       */
      override fun subjectNameFlags(subjectNameFlags: SubjectNameFlagsV2Property) {
        cdkBuilder.subjectNameFlags(subjectNameFlags.let(SubjectNameFlagsV2Property::unwrap))
      }

      /**
       * @param subjectNameFlags Subject name flags describe the subject name and subject alternate
       * name that is included in a certificate. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("83b125f0bd827f94cfd9493a0411c660dd8e0a0890d0b23276b036d39d32491a")
      override
          fun subjectNameFlags(subjectNameFlags: SubjectNameFlagsV2Property.Builder.() -> Unit):
          Unit = subjectNameFlags(SubjectNameFlagsV2Property(subjectNameFlags))

      /**
       * @param supersededTemplates List of templates in Active Directory that are superseded by
       * this template.
       */
      override fun supersededTemplates(supersededTemplates: List<String>) {
        cdkBuilder.supersededTemplates(supersededTemplates)
      }

      /**
       * @param supersededTemplates List of templates in Active Directory that are superseded by
       * this template.
       */
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
      /**
       * Certificate validity describes the validity and renewal periods of a certificate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev2.html#cfn-pcaconnectorad-template-templatev2-certificatevalidity)
       */
      override fun certificateValidity(): Any = unwrap(this).getCertificateValidity()

      /**
       * Enrollment flags describe the enrollment settings for certificates such as using the
       * existing private key and deleting expired or revoked certificates.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev2.html#cfn-pcaconnectorad-template-templatev2-enrollmentflags)
       */
      override fun enrollmentFlags(): Any = unwrap(this).getEnrollmentFlags()

      /**
       * Extensions describe the key usage extensions and application policies for a template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev2.html#cfn-pcaconnectorad-template-templatev2-extensions)
       */
      override fun extensions(): Any = unwrap(this).getExtensions()

      /**
       * General flags describe whether the template is used for computers or users and if the
       * template can be used with autoenrollment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev2.html#cfn-pcaconnectorad-template-templatev2-generalflags)
       */
      override fun generalFlags(): Any = unwrap(this).getGeneralFlags()

      /**
       * Private key attributes allow you to specify the minimal key length, key spec, and
       * cryptographic providers for the private key of a certificate for v2 templates.
       *
       * V2 templates allow you to use Legacy Cryptographic Service Providers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev2.html#cfn-pcaconnectorad-template-templatev2-privatekeyattributes)
       */
      override fun privateKeyAttributes(): Any = unwrap(this).getPrivateKeyAttributes()

      /**
       * Private key flags for v2 templates specify the client compatibility, if the private key can
       * be exported, and if user input is required when using a private key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev2.html#cfn-pcaconnectorad-template-templatev2-privatekeyflags)
       */
      override fun privateKeyFlags(): Any = unwrap(this).getPrivateKeyFlags()

      /**
       * Subject name flags describe the subject name and subject alternate name that is included in
       * a certificate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev2.html#cfn-pcaconnectorad-template-templatev2-subjectnameflags)
       */
      override fun subjectNameFlags(): Any = unwrap(this).getSubjectNameFlags()

      /**
       * List of templates in Active Directory that are superseded by this template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev2.html#cfn-pcaconnectorad-template-templatev2-supersededtemplates)
       */
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
    /**
     * Sets the key usage extension to critical.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-keyusage.html#cfn-pcaconnectorad-template-keyusage-critical)
     */
    public fun critical(): Any? = unwrap(this).getCritical()

    /**
     * The key usage flags represent the purpose (e.g., encipherment, signature) of the key
     * contained in the certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-keyusage.html#cfn-pcaconnectorad-template-keyusage-usageflags)
     */
    public fun usageFlags(): Any

    /**
     * A builder for [KeyUsageProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param critical Sets the key usage extension to critical.
       */
      public fun critical(critical: Boolean)

      /**
       * @param critical Sets the key usage extension to critical.
       */
      public fun critical(critical: IResolvable)

      /**
       * @param usageFlags The key usage flags represent the purpose (e.g., encipherment, signature)
       * of the key contained in the certificate. 
       */
      public fun usageFlags(usageFlags: IResolvable)

      /**
       * @param usageFlags The key usage flags represent the purpose (e.g., encipherment, signature)
       * of the key contained in the certificate. 
       */
      public fun usageFlags(usageFlags: KeyUsageFlagsProperty)

      /**
       * @param usageFlags The key usage flags represent the purpose (e.g., encipherment, signature)
       * of the key contained in the certificate. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ad3e4f3b9ba170b2557434b15baa9537680ce57819b2f576d9ac89d90bd87379")
      public fun usageFlags(usageFlags: KeyUsageFlagsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsageProperty.Builder =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsageProperty.builder()

      /**
       * @param critical Sets the key usage extension to critical.
       */
      override fun critical(critical: Boolean) {
        cdkBuilder.critical(critical)
      }

      /**
       * @param critical Sets the key usage extension to critical.
       */
      override fun critical(critical: IResolvable) {
        cdkBuilder.critical(critical.let(IResolvable::unwrap))
      }

      /**
       * @param usageFlags The key usage flags represent the purpose (e.g., encipherment, signature)
       * of the key contained in the certificate. 
       */
      override fun usageFlags(usageFlags: IResolvable) {
        cdkBuilder.usageFlags(usageFlags.let(IResolvable::unwrap))
      }

      /**
       * @param usageFlags The key usage flags represent the purpose (e.g., encipherment, signature)
       * of the key contained in the certificate. 
       */
      override fun usageFlags(usageFlags: KeyUsageFlagsProperty) {
        cdkBuilder.usageFlags(usageFlags.let(KeyUsageFlagsProperty::unwrap))
      }

      /**
       * @param usageFlags The key usage flags represent the purpose (e.g., encipherment, signature)
       * of the key contained in the certificate. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
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
      /**
       * Sets the key usage extension to critical.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-keyusage.html#cfn-pcaconnectorad-template-keyusage-critical)
       */
      override fun critical(): Any? = unwrap(this).getCritical()

      /**
       * The key usage flags represent the purpose (e.g., encipherment, signature) of the key
       * contained in the certificate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-keyusage.html#cfn-pcaconnectorad-template-keyusage-usageflags)
       */
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
    /**
     * Certificate validity describes the validity and renewal periods of a certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev3.html#cfn-pcaconnectorad-template-templatev3-certificatevalidity)
     */
    public fun certificateValidity(): Any

    /**
     * Enrollment flags describe the enrollment settings for certificates such as using the existing
     * private key and deleting expired or revoked certificates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev3.html#cfn-pcaconnectorad-template-templatev3-enrollmentflags)
     */
    public fun enrollmentFlags(): Any

    /**
     * Extensions describe the key usage extensions and application policies for a template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev3.html#cfn-pcaconnectorad-template-templatev3-extensions)
     */
    public fun extensions(): Any

    /**
     * General flags describe whether the template is used for computers or users and if the
     * template can be used with autoenrollment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev3.html#cfn-pcaconnectorad-template-templatev3-generalflags)
     */
    public fun generalFlags(): Any

    /**
     * Specifies the hash algorithm used to hash the private key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev3.html#cfn-pcaconnectorad-template-templatev3-hashalgorithm)
     */
    public fun hashAlgorithm(): String

    /**
     * Private key attributes allow you to specify the algorithm, minimal key length, key spec, key
     * usage, and cryptographic providers for the private key of a certificate for v3 templates.
     *
     * V3 templates allow you to use Key Storage Providers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev3.html#cfn-pcaconnectorad-template-templatev3-privatekeyattributes)
     */
    public fun privateKeyAttributes(): Any

    /**
     * Private key flags for v3 templates specify the client compatibility, if the private key can
     * be exported, if user input is required when using a private key, and if an alternate signature
     * algorithm should be used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev3.html#cfn-pcaconnectorad-template-templatev3-privatekeyflags)
     */
    public fun privateKeyFlags(): Any

    /**
     * Subject name flags describe the subject name and subject alternate name that is included in a
     * certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev3.html#cfn-pcaconnectorad-template-templatev3-subjectnameflags)
     */
    public fun subjectNameFlags(): Any

    /**
     * List of templates in Active Directory that are superseded by this template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev3.html#cfn-pcaconnectorad-template-templatev3-supersededtemplates)
     */
    public fun supersededTemplates(): List<String> = unwrap(this).getSupersededTemplates() ?:
        emptyList()

    /**
     * A builder for [TemplateV3Property]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param certificateValidity Certificate validity describes the validity and renewal periods
       * of a certificate. 
       */
      public fun certificateValidity(certificateValidity: IResolvable)

      /**
       * @param certificateValidity Certificate validity describes the validity and renewal periods
       * of a certificate. 
       */
      public fun certificateValidity(certificateValidity: CertificateValidityProperty)

      /**
       * @param certificateValidity Certificate validity describes the validity and renewal periods
       * of a certificate. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1b6b6939ffe11c55beac7c67c3b4879e5a1a4029250ca09537762918500b3ccc")
      public
          fun certificateValidity(certificateValidity: CertificateValidityProperty.Builder.() -> Unit)

      /**
       * @param enrollmentFlags Enrollment flags describe the enrollment settings for certificates
       * such as using the existing private key and deleting expired or revoked certificates. 
       */
      public fun enrollmentFlags(enrollmentFlags: IResolvable)

      /**
       * @param enrollmentFlags Enrollment flags describe the enrollment settings for certificates
       * such as using the existing private key and deleting expired or revoked certificates. 
       */
      public fun enrollmentFlags(enrollmentFlags: EnrollmentFlagsV3Property)

      /**
       * @param enrollmentFlags Enrollment flags describe the enrollment settings for certificates
       * such as using the existing private key and deleting expired or revoked certificates. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2387907f2e61871793058ad93675ef9449de1ad63481d0d6102b41edcd1993ae")
      public fun enrollmentFlags(enrollmentFlags: EnrollmentFlagsV3Property.Builder.() -> Unit)

      /**
       * @param extensions Extensions describe the key usage extensions and application policies for
       * a template. 
       */
      public fun extensions(extensions: IResolvable)

      /**
       * @param extensions Extensions describe the key usage extensions and application policies for
       * a template. 
       */
      public fun extensions(extensions: ExtensionsV3Property)

      /**
       * @param extensions Extensions describe the key usage extensions and application policies for
       * a template. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1ab1155439ebdbb752b82bf871553f556cbe9afb7ea2c4be5e4beae179a5a3de")
      public fun extensions(extensions: ExtensionsV3Property.Builder.() -> Unit)

      /**
       * @param generalFlags General flags describe whether the template is used for computers or
       * users and if the template can be used with autoenrollment. 
       */
      public fun generalFlags(generalFlags: IResolvable)

      /**
       * @param generalFlags General flags describe whether the template is used for computers or
       * users and if the template can be used with autoenrollment. 
       */
      public fun generalFlags(generalFlags: GeneralFlagsV3Property)

      /**
       * @param generalFlags General flags describe whether the template is used for computers or
       * users and if the template can be used with autoenrollment. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7c4023e5983bceddfc9b5909dc8a23d93ee4b23655c9b9b3ff5673973fcab4f2")
      public fun generalFlags(generalFlags: GeneralFlagsV3Property.Builder.() -> Unit)

      /**
       * @param hashAlgorithm Specifies the hash algorithm used to hash the private key. 
       */
      public fun hashAlgorithm(hashAlgorithm: String)

      /**
       * @param privateKeyAttributes Private key attributes allow you to specify the algorithm,
       * minimal key length, key spec, key usage, and cryptographic providers for the private key of a
       * certificate for v3 templates. 
       * V3 templates allow you to use Key Storage Providers.
       */
      public fun privateKeyAttributes(privateKeyAttributes: IResolvable)

      /**
       * @param privateKeyAttributes Private key attributes allow you to specify the algorithm,
       * minimal key length, key spec, key usage, and cryptographic providers for the private key of a
       * certificate for v3 templates. 
       * V3 templates allow you to use Key Storage Providers.
       */
      public fun privateKeyAttributes(privateKeyAttributes: PrivateKeyAttributesV3Property)

      /**
       * @param privateKeyAttributes Private key attributes allow you to specify the algorithm,
       * minimal key length, key spec, key usage, and cryptographic providers for the private key of a
       * certificate for v3 templates. 
       * V3 templates allow you to use Key Storage Providers.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0a42e704bd0416ff8c15f257af353a2711d4c678bdcf6cc476e03a97d0ae4919")
      public
          fun privateKeyAttributes(privateKeyAttributes: PrivateKeyAttributesV3Property.Builder.() -> Unit)

      /**
       * @param privateKeyFlags Private key flags for v3 templates specify the client compatibility,
       * if the private key can be exported, if user input is required when using a private key, and if
       * an alternate signature algorithm should be used. 
       */
      public fun privateKeyFlags(privateKeyFlags: IResolvable)

      /**
       * @param privateKeyFlags Private key flags for v3 templates specify the client compatibility,
       * if the private key can be exported, if user input is required when using a private key, and if
       * an alternate signature algorithm should be used. 
       */
      public fun privateKeyFlags(privateKeyFlags: PrivateKeyFlagsV3Property)

      /**
       * @param privateKeyFlags Private key flags for v3 templates specify the client compatibility,
       * if the private key can be exported, if user input is required when using a private key, and if
       * an alternate signature algorithm should be used. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("19bacd33063fdaa7addef79b60830df1aa411968033af897c8760077c983846c")
      public fun privateKeyFlags(privateKeyFlags: PrivateKeyFlagsV3Property.Builder.() -> Unit)

      /**
       * @param subjectNameFlags Subject name flags describe the subject name and subject alternate
       * name that is included in a certificate. 
       */
      public fun subjectNameFlags(subjectNameFlags: IResolvable)

      /**
       * @param subjectNameFlags Subject name flags describe the subject name and subject alternate
       * name that is included in a certificate. 
       */
      public fun subjectNameFlags(subjectNameFlags: SubjectNameFlagsV3Property)

      /**
       * @param subjectNameFlags Subject name flags describe the subject name and subject alternate
       * name that is included in a certificate. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6e3e2f0d878259f2c2177ed7ce9a7646b08c78946cf7ba3f021bd62f50e9936c")
      public fun subjectNameFlags(subjectNameFlags: SubjectNameFlagsV3Property.Builder.() -> Unit)

      /**
       * @param supersededTemplates List of templates in Active Directory that are superseded by
       * this template.
       */
      public fun supersededTemplates(supersededTemplates: List<String>)

      /**
       * @param supersededTemplates List of templates in Active Directory that are superseded by
       * this template.
       */
      public fun supersededTemplates(vararg supersededTemplates: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateV3Property.Builder =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateV3Property.builder()

      /**
       * @param certificateValidity Certificate validity describes the validity and renewal periods
       * of a certificate. 
       */
      override fun certificateValidity(certificateValidity: IResolvable) {
        cdkBuilder.certificateValidity(certificateValidity.let(IResolvable::unwrap))
      }

      /**
       * @param certificateValidity Certificate validity describes the validity and renewal periods
       * of a certificate. 
       */
      override fun certificateValidity(certificateValidity: CertificateValidityProperty) {
        cdkBuilder.certificateValidity(certificateValidity.let(CertificateValidityProperty::unwrap))
      }

      /**
       * @param certificateValidity Certificate validity describes the validity and renewal periods
       * of a certificate. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1b6b6939ffe11c55beac7c67c3b4879e5a1a4029250ca09537762918500b3ccc")
      override
          fun certificateValidity(certificateValidity: CertificateValidityProperty.Builder.() -> Unit):
          Unit = certificateValidity(CertificateValidityProperty(certificateValidity))

      /**
       * @param enrollmentFlags Enrollment flags describe the enrollment settings for certificates
       * such as using the existing private key and deleting expired or revoked certificates. 
       */
      override fun enrollmentFlags(enrollmentFlags: IResolvable) {
        cdkBuilder.enrollmentFlags(enrollmentFlags.let(IResolvable::unwrap))
      }

      /**
       * @param enrollmentFlags Enrollment flags describe the enrollment settings for certificates
       * such as using the existing private key and deleting expired or revoked certificates. 
       */
      override fun enrollmentFlags(enrollmentFlags: EnrollmentFlagsV3Property) {
        cdkBuilder.enrollmentFlags(enrollmentFlags.let(EnrollmentFlagsV3Property::unwrap))
      }

      /**
       * @param enrollmentFlags Enrollment flags describe the enrollment settings for certificates
       * such as using the existing private key and deleting expired or revoked certificates. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2387907f2e61871793058ad93675ef9449de1ad63481d0d6102b41edcd1993ae")
      override fun enrollmentFlags(enrollmentFlags: EnrollmentFlagsV3Property.Builder.() -> Unit):
          Unit = enrollmentFlags(EnrollmentFlagsV3Property(enrollmentFlags))

      /**
       * @param extensions Extensions describe the key usage extensions and application policies for
       * a template. 
       */
      override fun extensions(extensions: IResolvable) {
        cdkBuilder.extensions(extensions.let(IResolvable::unwrap))
      }

      /**
       * @param extensions Extensions describe the key usage extensions and application policies for
       * a template. 
       */
      override fun extensions(extensions: ExtensionsV3Property) {
        cdkBuilder.extensions(extensions.let(ExtensionsV3Property::unwrap))
      }

      /**
       * @param extensions Extensions describe the key usage extensions and application policies for
       * a template. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1ab1155439ebdbb752b82bf871553f556cbe9afb7ea2c4be5e4beae179a5a3de")
      override fun extensions(extensions: ExtensionsV3Property.Builder.() -> Unit): Unit =
          extensions(ExtensionsV3Property(extensions))

      /**
       * @param generalFlags General flags describe whether the template is used for computers or
       * users and if the template can be used with autoenrollment. 
       */
      override fun generalFlags(generalFlags: IResolvable) {
        cdkBuilder.generalFlags(generalFlags.let(IResolvable::unwrap))
      }

      /**
       * @param generalFlags General flags describe whether the template is used for computers or
       * users and if the template can be used with autoenrollment. 
       */
      override fun generalFlags(generalFlags: GeneralFlagsV3Property) {
        cdkBuilder.generalFlags(generalFlags.let(GeneralFlagsV3Property::unwrap))
      }

      /**
       * @param generalFlags General flags describe whether the template is used for computers or
       * users and if the template can be used with autoenrollment. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7c4023e5983bceddfc9b5909dc8a23d93ee4b23655c9b9b3ff5673973fcab4f2")
      override fun generalFlags(generalFlags: GeneralFlagsV3Property.Builder.() -> Unit): Unit =
          generalFlags(GeneralFlagsV3Property(generalFlags))

      /**
       * @param hashAlgorithm Specifies the hash algorithm used to hash the private key. 
       */
      override fun hashAlgorithm(hashAlgorithm: String) {
        cdkBuilder.hashAlgorithm(hashAlgorithm)
      }

      /**
       * @param privateKeyAttributes Private key attributes allow you to specify the algorithm,
       * minimal key length, key spec, key usage, and cryptographic providers for the private key of a
       * certificate for v3 templates. 
       * V3 templates allow you to use Key Storage Providers.
       */
      override fun privateKeyAttributes(privateKeyAttributes: IResolvable) {
        cdkBuilder.privateKeyAttributes(privateKeyAttributes.let(IResolvable::unwrap))
      }

      /**
       * @param privateKeyAttributes Private key attributes allow you to specify the algorithm,
       * minimal key length, key spec, key usage, and cryptographic providers for the private key of a
       * certificate for v3 templates. 
       * V3 templates allow you to use Key Storage Providers.
       */
      override fun privateKeyAttributes(privateKeyAttributes: PrivateKeyAttributesV3Property) {
        cdkBuilder.privateKeyAttributes(privateKeyAttributes.let(PrivateKeyAttributesV3Property::unwrap))
      }

      /**
       * @param privateKeyAttributes Private key attributes allow you to specify the algorithm,
       * minimal key length, key spec, key usage, and cryptographic providers for the private key of a
       * certificate for v3 templates. 
       * V3 templates allow you to use Key Storage Providers.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0a42e704bd0416ff8c15f257af353a2711d4c678bdcf6cc476e03a97d0ae4919")
      override
          fun privateKeyAttributes(privateKeyAttributes: PrivateKeyAttributesV3Property.Builder.() -> Unit):
          Unit = privateKeyAttributes(PrivateKeyAttributesV3Property(privateKeyAttributes))

      /**
       * @param privateKeyFlags Private key flags for v3 templates specify the client compatibility,
       * if the private key can be exported, if user input is required when using a private key, and if
       * an alternate signature algorithm should be used. 
       */
      override fun privateKeyFlags(privateKeyFlags: IResolvable) {
        cdkBuilder.privateKeyFlags(privateKeyFlags.let(IResolvable::unwrap))
      }

      /**
       * @param privateKeyFlags Private key flags for v3 templates specify the client compatibility,
       * if the private key can be exported, if user input is required when using a private key, and if
       * an alternate signature algorithm should be used. 
       */
      override fun privateKeyFlags(privateKeyFlags: PrivateKeyFlagsV3Property) {
        cdkBuilder.privateKeyFlags(privateKeyFlags.let(PrivateKeyFlagsV3Property::unwrap))
      }

      /**
       * @param privateKeyFlags Private key flags for v3 templates specify the client compatibility,
       * if the private key can be exported, if user input is required when using a private key, and if
       * an alternate signature algorithm should be used. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("19bacd33063fdaa7addef79b60830df1aa411968033af897c8760077c983846c")
      override fun privateKeyFlags(privateKeyFlags: PrivateKeyFlagsV3Property.Builder.() -> Unit):
          Unit = privateKeyFlags(PrivateKeyFlagsV3Property(privateKeyFlags))

      /**
       * @param subjectNameFlags Subject name flags describe the subject name and subject alternate
       * name that is included in a certificate. 
       */
      override fun subjectNameFlags(subjectNameFlags: IResolvable) {
        cdkBuilder.subjectNameFlags(subjectNameFlags.let(IResolvable::unwrap))
      }

      /**
       * @param subjectNameFlags Subject name flags describe the subject name and subject alternate
       * name that is included in a certificate. 
       */
      override fun subjectNameFlags(subjectNameFlags: SubjectNameFlagsV3Property) {
        cdkBuilder.subjectNameFlags(subjectNameFlags.let(SubjectNameFlagsV3Property::unwrap))
      }

      /**
       * @param subjectNameFlags Subject name flags describe the subject name and subject alternate
       * name that is included in a certificate. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6e3e2f0d878259f2c2177ed7ce9a7646b08c78946cf7ba3f021bd62f50e9936c")
      override
          fun subjectNameFlags(subjectNameFlags: SubjectNameFlagsV3Property.Builder.() -> Unit):
          Unit = subjectNameFlags(SubjectNameFlagsV3Property(subjectNameFlags))

      /**
       * @param supersededTemplates List of templates in Active Directory that are superseded by
       * this template.
       */
      override fun supersededTemplates(supersededTemplates: List<String>) {
        cdkBuilder.supersededTemplates(supersededTemplates)
      }

      /**
       * @param supersededTemplates List of templates in Active Directory that are superseded by
       * this template.
       */
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
      /**
       * Certificate validity describes the validity and renewal periods of a certificate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev3.html#cfn-pcaconnectorad-template-templatev3-certificatevalidity)
       */
      override fun certificateValidity(): Any = unwrap(this).getCertificateValidity()

      /**
       * Enrollment flags describe the enrollment settings for certificates such as using the
       * existing private key and deleting expired or revoked certificates.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev3.html#cfn-pcaconnectorad-template-templatev3-enrollmentflags)
       */
      override fun enrollmentFlags(): Any = unwrap(this).getEnrollmentFlags()

      /**
       * Extensions describe the key usage extensions and application policies for a template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev3.html#cfn-pcaconnectorad-template-templatev3-extensions)
       */
      override fun extensions(): Any = unwrap(this).getExtensions()

      /**
       * General flags describe whether the template is used for computers or users and if the
       * template can be used with autoenrollment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev3.html#cfn-pcaconnectorad-template-templatev3-generalflags)
       */
      override fun generalFlags(): Any = unwrap(this).getGeneralFlags()

      /**
       * Specifies the hash algorithm used to hash the private key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev3.html#cfn-pcaconnectorad-template-templatev3-hashalgorithm)
       */
      override fun hashAlgorithm(): String = unwrap(this).getHashAlgorithm()

      /**
       * Private key attributes allow you to specify the algorithm, minimal key length, key spec,
       * key usage, and cryptographic providers for the private key of a certificate for v3 templates.
       *
       * V3 templates allow you to use Key Storage Providers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev3.html#cfn-pcaconnectorad-template-templatev3-privatekeyattributes)
       */
      override fun privateKeyAttributes(): Any = unwrap(this).getPrivateKeyAttributes()

      /**
       * Private key flags for v3 templates specify the client compatibility, if the private key can
       * be exported, if user input is required when using a private key, and if an alternate signature
       * algorithm should be used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev3.html#cfn-pcaconnectorad-template-templatev3-privatekeyflags)
       */
      override fun privateKeyFlags(): Any = unwrap(this).getPrivateKeyFlags()

      /**
       * Subject name flags describe the subject name and subject alternate name that is included in
       * a certificate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev3.html#cfn-pcaconnectorad-template-templatev3-subjectnameflags)
       */
      override fun subjectNameFlags(): Any = unwrap(this).getSubjectNameFlags()

      /**
       * List of templates in Active Directory that are superseded by this template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev3.html#cfn-pcaconnectorad-template-templatev3-supersededtemplates)
       */
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
    /**
     * Template configuration to define the information included in certificates.
     *
     * Define certificate validity and renewal periods, certificate request handling and enrollment
     * options, key usage extensions, application policies, and cryptography settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatedefinition.html#cfn-pcaconnectorad-template-templatedefinition-templatev2)
     */
    public fun templateV2(): Any? = unwrap(this).getTemplateV2()

    /**
     * Template configuration to define the information included in certificates.
     *
     * Define certificate validity and renewal periods, certificate request handling and enrollment
     * options, key usage extensions, application policies, and cryptography settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatedefinition.html#cfn-pcaconnectorad-template-templatedefinition-templatev3)
     */
    public fun templateV3(): Any? = unwrap(this).getTemplateV3()

    /**
     * Template configuration to define the information included in certificates.
     *
     * Define certificate validity and renewal periods, certificate request handling and enrollment
     * options, key usage extensions, application policies, and cryptography settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatedefinition.html#cfn-pcaconnectorad-template-templatedefinition-templatev4)
     */
    public fun templateV4(): Any? = unwrap(this).getTemplateV4()

    /**
     * A builder for [TemplateDefinitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param templateV2 Template configuration to define the information included in
       * certificates.
       * Define certificate validity and renewal periods, certificate request handling and
       * enrollment options, key usage extensions, application policies, and cryptography settings.
       */
      public fun templateV2(templateV2: IResolvable)

      /**
       * @param templateV2 Template configuration to define the information included in
       * certificates.
       * Define certificate validity and renewal periods, certificate request handling and
       * enrollment options, key usage extensions, application policies, and cryptography settings.
       */
      public fun templateV2(templateV2: TemplateV2Property)

      /**
       * @param templateV2 Template configuration to define the information included in
       * certificates.
       * Define certificate validity and renewal periods, certificate request handling and
       * enrollment options, key usage extensions, application policies, and cryptography settings.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("01b45117b08b7836177cd5f5bd6dfea2d426f968546b6c8f9616e636271e91dc")
      public fun templateV2(templateV2: TemplateV2Property.Builder.() -> Unit)

      /**
       * @param templateV3 Template configuration to define the information included in
       * certificates.
       * Define certificate validity and renewal periods, certificate request handling and
       * enrollment options, key usage extensions, application policies, and cryptography settings.
       */
      public fun templateV3(templateV3: IResolvable)

      /**
       * @param templateV3 Template configuration to define the information included in
       * certificates.
       * Define certificate validity and renewal periods, certificate request handling and
       * enrollment options, key usage extensions, application policies, and cryptography settings.
       */
      public fun templateV3(templateV3: TemplateV3Property)

      /**
       * @param templateV3 Template configuration to define the information included in
       * certificates.
       * Define certificate validity and renewal periods, certificate request handling and
       * enrollment options, key usage extensions, application policies, and cryptography settings.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f5142db8cbb835d2c94551906d0f203a25d0aa36fd7966e642016fae6fef13f6")
      public fun templateV3(templateV3: TemplateV3Property.Builder.() -> Unit)

      /**
       * @param templateV4 Template configuration to define the information included in
       * certificates.
       * Define certificate validity and renewal periods, certificate request handling and
       * enrollment options, key usage extensions, application policies, and cryptography settings.
       */
      public fun templateV4(templateV4: IResolvable)

      /**
       * @param templateV4 Template configuration to define the information included in
       * certificates.
       * Define certificate validity and renewal periods, certificate request handling and
       * enrollment options, key usage extensions, application policies, and cryptography settings.
       */
      public fun templateV4(templateV4: TemplateV4Property)

      /**
       * @param templateV4 Template configuration to define the information included in
       * certificates.
       * Define certificate validity and renewal periods, certificate request handling and
       * enrollment options, key usage extensions, application policies, and cryptography settings.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a274da345eb1b0d816427862afd3c0b8bb813f2ec62ebf00e8c40e80ee736a4f")
      public fun templateV4(templateV4: TemplateV4Property.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateDefinitionProperty.builder()

      /**
       * @param templateV2 Template configuration to define the information included in
       * certificates.
       * Define certificate validity and renewal periods, certificate request handling and
       * enrollment options, key usage extensions, application policies, and cryptography settings.
       */
      override fun templateV2(templateV2: IResolvable) {
        cdkBuilder.templateV2(templateV2.let(IResolvable::unwrap))
      }

      /**
       * @param templateV2 Template configuration to define the information included in
       * certificates.
       * Define certificate validity and renewal periods, certificate request handling and
       * enrollment options, key usage extensions, application policies, and cryptography settings.
       */
      override fun templateV2(templateV2: TemplateV2Property) {
        cdkBuilder.templateV2(templateV2.let(TemplateV2Property::unwrap))
      }

      /**
       * @param templateV2 Template configuration to define the information included in
       * certificates.
       * Define certificate validity and renewal periods, certificate request handling and
       * enrollment options, key usage extensions, application policies, and cryptography settings.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("01b45117b08b7836177cd5f5bd6dfea2d426f968546b6c8f9616e636271e91dc")
      override fun templateV2(templateV2: TemplateV2Property.Builder.() -> Unit): Unit =
          templateV2(TemplateV2Property(templateV2))

      /**
       * @param templateV3 Template configuration to define the information included in
       * certificates.
       * Define certificate validity and renewal periods, certificate request handling and
       * enrollment options, key usage extensions, application policies, and cryptography settings.
       */
      override fun templateV3(templateV3: IResolvable) {
        cdkBuilder.templateV3(templateV3.let(IResolvable::unwrap))
      }

      /**
       * @param templateV3 Template configuration to define the information included in
       * certificates.
       * Define certificate validity and renewal periods, certificate request handling and
       * enrollment options, key usage extensions, application policies, and cryptography settings.
       */
      override fun templateV3(templateV3: TemplateV3Property) {
        cdkBuilder.templateV3(templateV3.let(TemplateV3Property::unwrap))
      }

      /**
       * @param templateV3 Template configuration to define the information included in
       * certificates.
       * Define certificate validity and renewal periods, certificate request handling and
       * enrollment options, key usage extensions, application policies, and cryptography settings.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f5142db8cbb835d2c94551906d0f203a25d0aa36fd7966e642016fae6fef13f6")
      override fun templateV3(templateV3: TemplateV3Property.Builder.() -> Unit): Unit =
          templateV3(TemplateV3Property(templateV3))

      /**
       * @param templateV4 Template configuration to define the information included in
       * certificates.
       * Define certificate validity and renewal periods, certificate request handling and
       * enrollment options, key usage extensions, application policies, and cryptography settings.
       */
      override fun templateV4(templateV4: IResolvable) {
        cdkBuilder.templateV4(templateV4.let(IResolvable::unwrap))
      }

      /**
       * @param templateV4 Template configuration to define the information included in
       * certificates.
       * Define certificate validity and renewal periods, certificate request handling and
       * enrollment options, key usage extensions, application policies, and cryptography settings.
       */
      override fun templateV4(templateV4: TemplateV4Property) {
        cdkBuilder.templateV4(templateV4.let(TemplateV4Property::unwrap))
      }

      /**
       * @param templateV4 Template configuration to define the information included in
       * certificates.
       * Define certificate validity and renewal periods, certificate request handling and
       * enrollment options, key usage extensions, application policies, and cryptography settings.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
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
      /**
       * Template configuration to define the information included in certificates.
       *
       * Define certificate validity and renewal periods, certificate request handling and
       * enrollment options, key usage extensions, application policies, and cryptography settings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatedefinition.html#cfn-pcaconnectorad-template-templatedefinition-templatev2)
       */
      override fun templateV2(): Any? = unwrap(this).getTemplateV2()

      /**
       * Template configuration to define the information included in certificates.
       *
       * Define certificate validity and renewal periods, certificate request handling and
       * enrollment options, key usage extensions, application policies, and cryptography settings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatedefinition.html#cfn-pcaconnectorad-template-templatedefinition-templatev3)
       */
      override fun templateV3(): Any? = unwrap(this).getTemplateV3()

      /**
       * Template configuration to define the information included in certificates.
       *
       * Define certificate validity and renewal periods, certificate request handling and
       * enrollment options, key usage extensions, application policies, and cryptography settings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatedefinition.html#cfn-pcaconnectorad-template-templatedefinition-templatev4)
       */
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
    /**
     * You can specify key usage for encryption, key agreement, and signature.
     *
     * You can use property flags or property type but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-keyusageproperty.html#cfn-pcaconnectorad-template-keyusageproperty-propertyflags)
     */
    public fun propertyFlags(): Any? = unwrap(this).getPropertyFlags()

    /**
     * You can specify all key usages using property type ALL.
     *
     * You can use property type or property flags but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-keyusageproperty.html#cfn-pcaconnectorad-template-keyusageproperty-propertytype)
     */
    public fun propertyType(): String? = unwrap(this).getPropertyType()

    /**
     * A builder for [KeyUsagePropertyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param propertyFlags You can specify key usage for encryption, key agreement, and
       * signature.
       * You can use property flags or property type but not both.
       */
      public fun propertyFlags(propertyFlags: IResolvable)

      /**
       * @param propertyFlags You can specify key usage for encryption, key agreement, and
       * signature.
       * You can use property flags or property type but not both.
       */
      public fun propertyFlags(propertyFlags: KeyUsagePropertyFlagsProperty)

      /**
       * @param propertyFlags You can specify key usage for encryption, key agreement, and
       * signature.
       * You can use property flags or property type but not both.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7d650478be89420c8682f59b49461f47f84cdefa1fef1dfc8316cc539e14cce6")
      public fun propertyFlags(propertyFlags: KeyUsagePropertyFlagsProperty.Builder.() -> Unit)

      /**
       * @param propertyType You can specify all key usages using property type ALL.
       * You can use property type or property flags but not both.
       */
      public fun propertyType(propertyType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsagePropertyProperty.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsagePropertyProperty.builder()

      /**
       * @param propertyFlags You can specify key usage for encryption, key agreement, and
       * signature.
       * You can use property flags or property type but not both.
       */
      override fun propertyFlags(propertyFlags: IResolvable) {
        cdkBuilder.propertyFlags(propertyFlags.let(IResolvable::unwrap))
      }

      /**
       * @param propertyFlags You can specify key usage for encryption, key agreement, and
       * signature.
       * You can use property flags or property type but not both.
       */
      override fun propertyFlags(propertyFlags: KeyUsagePropertyFlagsProperty) {
        cdkBuilder.propertyFlags(propertyFlags.let(KeyUsagePropertyFlagsProperty::unwrap))
      }

      /**
       * @param propertyFlags You can specify key usage for encryption, key agreement, and
       * signature.
       * You can use property flags or property type but not both.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7d650478be89420c8682f59b49461f47f84cdefa1fef1dfc8316cc539e14cce6")
      override fun propertyFlags(propertyFlags: KeyUsagePropertyFlagsProperty.Builder.() -> Unit):
          Unit = propertyFlags(KeyUsagePropertyFlagsProperty(propertyFlags))

      /**
       * @param propertyType You can specify all key usages using property type ALL.
       * You can use property type or property flags but not both.
       */
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
      /**
       * You can specify key usage for encryption, key agreement, and signature.
       *
       * You can use property flags or property type but not both.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-keyusageproperty.html#cfn-pcaconnectorad-template-keyusageproperty-propertyflags)
       */
      override fun propertyFlags(): Any? = unwrap(this).getPropertyFlags()

      /**
       * You can specify all key usages using property type ALL.
       *
       * You can use property type or property flags but not both.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-keyusageproperty.html#cfn-pcaconnectorad-template-keyusageproperty-propertytype)
       */
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
    /**
     * Include the common name in the subject name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv2.html#cfn-pcaconnectorad-template-subjectnameflagsv2-requirecommonname)
     */
    public fun requireCommonName(): Any? = unwrap(this).getRequireCommonName()

    /**
     * Include the directory path in the subject name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv2.html#cfn-pcaconnectorad-template-subjectnameflagsv2-requiredirectorypath)
     */
    public fun requireDirectoryPath(): Any? = unwrap(this).getRequireDirectoryPath()

    /**
     * Include the DNS as common name in the subject name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv2.html#cfn-pcaconnectorad-template-subjectnameflagsv2-requirednsascn)
     */
    public fun requireDnsAsCn(): Any? = unwrap(this).getRequireDnsAsCn()

    /**
     * Include the subject's email in the subject name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv2.html#cfn-pcaconnectorad-template-subjectnameflagsv2-requireemail)
     */
    public fun requireEmail(): Any? = unwrap(this).getRequireEmail()

    /**
     * Include the globally unique identifier (GUID) in the subject alternate name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv2.html#cfn-pcaconnectorad-template-subjectnameflagsv2-sanrequiredirectoryguid)
     */
    public fun sanRequireDirectoryGuid(): Any? = unwrap(this).getSanRequireDirectoryGuid()

    /**
     * Include the DNS in the subject alternate name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv2.html#cfn-pcaconnectorad-template-subjectnameflagsv2-sanrequiredns)
     */
    public fun sanRequireDns(): Any? = unwrap(this).getSanRequireDns()

    /**
     * Include the domain DNS in the subject alternate name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv2.html#cfn-pcaconnectorad-template-subjectnameflagsv2-sanrequiredomaindns)
     */
    public fun sanRequireDomainDns(): Any? = unwrap(this).getSanRequireDomainDns()

    /**
     * Include the subject's email in the subject alternate name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv2.html#cfn-pcaconnectorad-template-subjectnameflagsv2-sanrequireemail)
     */
    public fun sanRequireEmail(): Any? = unwrap(this).getSanRequireEmail()

    /**
     * Include the service principal name (SPN) in the subject alternate name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv2.html#cfn-pcaconnectorad-template-subjectnameflagsv2-sanrequirespn)
     */
    public fun sanRequireSpn(): Any? = unwrap(this).getSanRequireSpn()

    /**
     * Include the user principal name (UPN) in the subject alternate name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv2.html#cfn-pcaconnectorad-template-subjectnameflagsv2-sanrequireupn)
     */
    public fun sanRequireUpn(): Any? = unwrap(this).getSanRequireUpn()

    /**
     * A builder for [SubjectNameFlagsV2Property]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param requireCommonName Include the common name in the subject name.
       */
      public fun requireCommonName(requireCommonName: Boolean)

      /**
       * @param requireCommonName Include the common name in the subject name.
       */
      public fun requireCommonName(requireCommonName: IResolvable)

      /**
       * @param requireDirectoryPath Include the directory path in the subject name.
       */
      public fun requireDirectoryPath(requireDirectoryPath: Boolean)

      /**
       * @param requireDirectoryPath Include the directory path in the subject name.
       */
      public fun requireDirectoryPath(requireDirectoryPath: IResolvable)

      /**
       * @param requireDnsAsCn Include the DNS as common name in the subject name.
       */
      public fun requireDnsAsCn(requireDnsAsCn: Boolean)

      /**
       * @param requireDnsAsCn Include the DNS as common name in the subject name.
       */
      public fun requireDnsAsCn(requireDnsAsCn: IResolvable)

      /**
       * @param requireEmail Include the subject's email in the subject name.
       */
      public fun requireEmail(requireEmail: Boolean)

      /**
       * @param requireEmail Include the subject's email in the subject name.
       */
      public fun requireEmail(requireEmail: IResolvable)

      /**
       * @param sanRequireDirectoryGuid Include the globally unique identifier (GUID) in the subject
       * alternate name.
       */
      public fun sanRequireDirectoryGuid(sanRequireDirectoryGuid: Boolean)

      /**
       * @param sanRequireDirectoryGuid Include the globally unique identifier (GUID) in the subject
       * alternate name.
       */
      public fun sanRequireDirectoryGuid(sanRequireDirectoryGuid: IResolvable)

      /**
       * @param sanRequireDns Include the DNS in the subject alternate name.
       */
      public fun sanRequireDns(sanRequireDns: Boolean)

      /**
       * @param sanRequireDns Include the DNS in the subject alternate name.
       */
      public fun sanRequireDns(sanRequireDns: IResolvable)

      /**
       * @param sanRequireDomainDns Include the domain DNS in the subject alternate name.
       */
      public fun sanRequireDomainDns(sanRequireDomainDns: Boolean)

      /**
       * @param sanRequireDomainDns Include the domain DNS in the subject alternate name.
       */
      public fun sanRequireDomainDns(sanRequireDomainDns: IResolvable)

      /**
       * @param sanRequireEmail Include the subject's email in the subject alternate name.
       */
      public fun sanRequireEmail(sanRequireEmail: Boolean)

      /**
       * @param sanRequireEmail Include the subject's email in the subject alternate name.
       */
      public fun sanRequireEmail(sanRequireEmail: IResolvable)

      /**
       * @param sanRequireSpn Include the service principal name (SPN) in the subject alternate
       * name.
       */
      public fun sanRequireSpn(sanRequireSpn: Boolean)

      /**
       * @param sanRequireSpn Include the service principal name (SPN) in the subject alternate
       * name.
       */
      public fun sanRequireSpn(sanRequireSpn: IResolvable)

      /**
       * @param sanRequireUpn Include the user principal name (UPN) in the subject alternate name.
       */
      public fun sanRequireUpn(sanRequireUpn: Boolean)

      /**
       * @param sanRequireUpn Include the user principal name (UPN) in the subject alternate name.
       */
      public fun sanRequireUpn(sanRequireUpn: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.SubjectNameFlagsV2Property.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.SubjectNameFlagsV2Property.builder()

      /**
       * @param requireCommonName Include the common name in the subject name.
       */
      override fun requireCommonName(requireCommonName: Boolean) {
        cdkBuilder.requireCommonName(requireCommonName)
      }

      /**
       * @param requireCommonName Include the common name in the subject name.
       */
      override fun requireCommonName(requireCommonName: IResolvable) {
        cdkBuilder.requireCommonName(requireCommonName.let(IResolvable::unwrap))
      }

      /**
       * @param requireDirectoryPath Include the directory path in the subject name.
       */
      override fun requireDirectoryPath(requireDirectoryPath: Boolean) {
        cdkBuilder.requireDirectoryPath(requireDirectoryPath)
      }

      /**
       * @param requireDirectoryPath Include the directory path in the subject name.
       */
      override fun requireDirectoryPath(requireDirectoryPath: IResolvable) {
        cdkBuilder.requireDirectoryPath(requireDirectoryPath.let(IResolvable::unwrap))
      }

      /**
       * @param requireDnsAsCn Include the DNS as common name in the subject name.
       */
      override fun requireDnsAsCn(requireDnsAsCn: Boolean) {
        cdkBuilder.requireDnsAsCn(requireDnsAsCn)
      }

      /**
       * @param requireDnsAsCn Include the DNS as common name in the subject name.
       */
      override fun requireDnsAsCn(requireDnsAsCn: IResolvable) {
        cdkBuilder.requireDnsAsCn(requireDnsAsCn.let(IResolvable::unwrap))
      }

      /**
       * @param requireEmail Include the subject's email in the subject name.
       */
      override fun requireEmail(requireEmail: Boolean) {
        cdkBuilder.requireEmail(requireEmail)
      }

      /**
       * @param requireEmail Include the subject's email in the subject name.
       */
      override fun requireEmail(requireEmail: IResolvable) {
        cdkBuilder.requireEmail(requireEmail.let(IResolvable::unwrap))
      }

      /**
       * @param sanRequireDirectoryGuid Include the globally unique identifier (GUID) in the subject
       * alternate name.
       */
      override fun sanRequireDirectoryGuid(sanRequireDirectoryGuid: Boolean) {
        cdkBuilder.sanRequireDirectoryGuid(sanRequireDirectoryGuid)
      }

      /**
       * @param sanRequireDirectoryGuid Include the globally unique identifier (GUID) in the subject
       * alternate name.
       */
      override fun sanRequireDirectoryGuid(sanRequireDirectoryGuid: IResolvable) {
        cdkBuilder.sanRequireDirectoryGuid(sanRequireDirectoryGuid.let(IResolvable::unwrap))
      }

      /**
       * @param sanRequireDns Include the DNS in the subject alternate name.
       */
      override fun sanRequireDns(sanRequireDns: Boolean) {
        cdkBuilder.sanRequireDns(sanRequireDns)
      }

      /**
       * @param sanRequireDns Include the DNS in the subject alternate name.
       */
      override fun sanRequireDns(sanRequireDns: IResolvable) {
        cdkBuilder.sanRequireDns(sanRequireDns.let(IResolvable::unwrap))
      }

      /**
       * @param sanRequireDomainDns Include the domain DNS in the subject alternate name.
       */
      override fun sanRequireDomainDns(sanRequireDomainDns: Boolean) {
        cdkBuilder.sanRequireDomainDns(sanRequireDomainDns)
      }

      /**
       * @param sanRequireDomainDns Include the domain DNS in the subject alternate name.
       */
      override fun sanRequireDomainDns(sanRequireDomainDns: IResolvable) {
        cdkBuilder.sanRequireDomainDns(sanRequireDomainDns.let(IResolvable::unwrap))
      }

      /**
       * @param sanRequireEmail Include the subject's email in the subject alternate name.
       */
      override fun sanRequireEmail(sanRequireEmail: Boolean) {
        cdkBuilder.sanRequireEmail(sanRequireEmail)
      }

      /**
       * @param sanRequireEmail Include the subject's email in the subject alternate name.
       */
      override fun sanRequireEmail(sanRequireEmail: IResolvable) {
        cdkBuilder.sanRequireEmail(sanRequireEmail.let(IResolvable::unwrap))
      }

      /**
       * @param sanRequireSpn Include the service principal name (SPN) in the subject alternate
       * name.
       */
      override fun sanRequireSpn(sanRequireSpn: Boolean) {
        cdkBuilder.sanRequireSpn(sanRequireSpn)
      }

      /**
       * @param sanRequireSpn Include the service principal name (SPN) in the subject alternate
       * name.
       */
      override fun sanRequireSpn(sanRequireSpn: IResolvable) {
        cdkBuilder.sanRequireSpn(sanRequireSpn.let(IResolvable::unwrap))
      }

      /**
       * @param sanRequireUpn Include the user principal name (UPN) in the subject alternate name.
       */
      override fun sanRequireUpn(sanRequireUpn: Boolean) {
        cdkBuilder.sanRequireUpn(sanRequireUpn)
      }

      /**
       * @param sanRequireUpn Include the user principal name (UPN) in the subject alternate name.
       */
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
      /**
       * Include the common name in the subject name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv2.html#cfn-pcaconnectorad-template-subjectnameflagsv2-requirecommonname)
       */
      override fun requireCommonName(): Any? = unwrap(this).getRequireCommonName()

      /**
       * Include the directory path in the subject name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv2.html#cfn-pcaconnectorad-template-subjectnameflagsv2-requiredirectorypath)
       */
      override fun requireDirectoryPath(): Any? = unwrap(this).getRequireDirectoryPath()

      /**
       * Include the DNS as common name in the subject name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv2.html#cfn-pcaconnectorad-template-subjectnameflagsv2-requirednsascn)
       */
      override fun requireDnsAsCn(): Any? = unwrap(this).getRequireDnsAsCn()

      /**
       * Include the subject's email in the subject name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv2.html#cfn-pcaconnectorad-template-subjectnameflagsv2-requireemail)
       */
      override fun requireEmail(): Any? = unwrap(this).getRequireEmail()

      /**
       * Include the globally unique identifier (GUID) in the subject alternate name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv2.html#cfn-pcaconnectorad-template-subjectnameflagsv2-sanrequiredirectoryguid)
       */
      override fun sanRequireDirectoryGuid(): Any? = unwrap(this).getSanRequireDirectoryGuid()

      /**
       * Include the DNS in the subject alternate name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv2.html#cfn-pcaconnectorad-template-subjectnameflagsv2-sanrequiredns)
       */
      override fun sanRequireDns(): Any? = unwrap(this).getSanRequireDns()

      /**
       * Include the domain DNS in the subject alternate name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv2.html#cfn-pcaconnectorad-template-subjectnameflagsv2-sanrequiredomaindns)
       */
      override fun sanRequireDomainDns(): Any? = unwrap(this).getSanRequireDomainDns()

      /**
       * Include the subject's email in the subject alternate name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv2.html#cfn-pcaconnectorad-template-subjectnameflagsv2-sanrequireemail)
       */
      override fun sanRequireEmail(): Any? = unwrap(this).getSanRequireEmail()

      /**
       * Include the service principal name (SPN) in the subject alternate name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv2.html#cfn-pcaconnectorad-template-subjectnameflagsv2-sanrequirespn)
       */
      override fun sanRequireSpn(): Any? = unwrap(this).getSanRequireSpn()

      /**
       * Include the user principal name (UPN) in the subject alternate name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv2.html#cfn-pcaconnectorad-template-subjectnameflagsv2-sanrequireupn)
       */
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
    /**
     * Include the common name in the subject name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv4.html#cfn-pcaconnectorad-template-subjectnameflagsv4-requirecommonname)
     */
    public fun requireCommonName(): Any? = unwrap(this).getRequireCommonName()

    /**
     * Include the directory path in the subject name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv4.html#cfn-pcaconnectorad-template-subjectnameflagsv4-requiredirectorypath)
     */
    public fun requireDirectoryPath(): Any? = unwrap(this).getRequireDirectoryPath()

    /**
     * Include the DNS as common name in the subject name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv4.html#cfn-pcaconnectorad-template-subjectnameflagsv4-requirednsascn)
     */
    public fun requireDnsAsCn(): Any? = unwrap(this).getRequireDnsAsCn()

    /**
     * Include the subject's email in the subject name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv4.html#cfn-pcaconnectorad-template-subjectnameflagsv4-requireemail)
     */
    public fun requireEmail(): Any? = unwrap(this).getRequireEmail()

    /**
     * Include the globally unique identifier (GUID) in the subject alternate name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv4.html#cfn-pcaconnectorad-template-subjectnameflagsv4-sanrequiredirectoryguid)
     */
    public fun sanRequireDirectoryGuid(): Any? = unwrap(this).getSanRequireDirectoryGuid()

    /**
     * Include the DNS in the subject alternate name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv4.html#cfn-pcaconnectorad-template-subjectnameflagsv4-sanrequiredns)
     */
    public fun sanRequireDns(): Any? = unwrap(this).getSanRequireDns()

    /**
     * Include the domain DNS in the subject alternate name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv4.html#cfn-pcaconnectorad-template-subjectnameflagsv4-sanrequiredomaindns)
     */
    public fun sanRequireDomainDns(): Any? = unwrap(this).getSanRequireDomainDns()

    /**
     * Include the subject's email in the subject alternate name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv4.html#cfn-pcaconnectorad-template-subjectnameflagsv4-sanrequireemail)
     */
    public fun sanRequireEmail(): Any? = unwrap(this).getSanRequireEmail()

    /**
     * Include the service principal name (SPN) in the subject alternate name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv4.html#cfn-pcaconnectorad-template-subjectnameflagsv4-sanrequirespn)
     */
    public fun sanRequireSpn(): Any? = unwrap(this).getSanRequireSpn()

    /**
     * Include the user principal name (UPN) in the subject alternate name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv4.html#cfn-pcaconnectorad-template-subjectnameflagsv4-sanrequireupn)
     */
    public fun sanRequireUpn(): Any? = unwrap(this).getSanRequireUpn()

    /**
     * A builder for [SubjectNameFlagsV4Property]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param requireCommonName Include the common name in the subject name.
       */
      public fun requireCommonName(requireCommonName: Boolean)

      /**
       * @param requireCommonName Include the common name in the subject name.
       */
      public fun requireCommonName(requireCommonName: IResolvable)

      /**
       * @param requireDirectoryPath Include the directory path in the subject name.
       */
      public fun requireDirectoryPath(requireDirectoryPath: Boolean)

      /**
       * @param requireDirectoryPath Include the directory path in the subject name.
       */
      public fun requireDirectoryPath(requireDirectoryPath: IResolvable)

      /**
       * @param requireDnsAsCn Include the DNS as common name in the subject name.
       */
      public fun requireDnsAsCn(requireDnsAsCn: Boolean)

      /**
       * @param requireDnsAsCn Include the DNS as common name in the subject name.
       */
      public fun requireDnsAsCn(requireDnsAsCn: IResolvable)

      /**
       * @param requireEmail Include the subject's email in the subject name.
       */
      public fun requireEmail(requireEmail: Boolean)

      /**
       * @param requireEmail Include the subject's email in the subject name.
       */
      public fun requireEmail(requireEmail: IResolvable)

      /**
       * @param sanRequireDirectoryGuid Include the globally unique identifier (GUID) in the subject
       * alternate name.
       */
      public fun sanRequireDirectoryGuid(sanRequireDirectoryGuid: Boolean)

      /**
       * @param sanRequireDirectoryGuid Include the globally unique identifier (GUID) in the subject
       * alternate name.
       */
      public fun sanRequireDirectoryGuid(sanRequireDirectoryGuid: IResolvable)

      /**
       * @param sanRequireDns Include the DNS in the subject alternate name.
       */
      public fun sanRequireDns(sanRequireDns: Boolean)

      /**
       * @param sanRequireDns Include the DNS in the subject alternate name.
       */
      public fun sanRequireDns(sanRequireDns: IResolvable)

      /**
       * @param sanRequireDomainDns Include the domain DNS in the subject alternate name.
       */
      public fun sanRequireDomainDns(sanRequireDomainDns: Boolean)

      /**
       * @param sanRequireDomainDns Include the domain DNS in the subject alternate name.
       */
      public fun sanRequireDomainDns(sanRequireDomainDns: IResolvable)

      /**
       * @param sanRequireEmail Include the subject's email in the subject alternate name.
       */
      public fun sanRequireEmail(sanRequireEmail: Boolean)

      /**
       * @param sanRequireEmail Include the subject's email in the subject alternate name.
       */
      public fun sanRequireEmail(sanRequireEmail: IResolvable)

      /**
       * @param sanRequireSpn Include the service principal name (SPN) in the subject alternate
       * name.
       */
      public fun sanRequireSpn(sanRequireSpn: Boolean)

      /**
       * @param sanRequireSpn Include the service principal name (SPN) in the subject alternate
       * name.
       */
      public fun sanRequireSpn(sanRequireSpn: IResolvable)

      /**
       * @param sanRequireUpn Include the user principal name (UPN) in the subject alternate name.
       */
      public fun sanRequireUpn(sanRequireUpn: Boolean)

      /**
       * @param sanRequireUpn Include the user principal name (UPN) in the subject alternate name.
       */
      public fun sanRequireUpn(sanRequireUpn: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.SubjectNameFlagsV4Property.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.SubjectNameFlagsV4Property.builder()

      /**
       * @param requireCommonName Include the common name in the subject name.
       */
      override fun requireCommonName(requireCommonName: Boolean) {
        cdkBuilder.requireCommonName(requireCommonName)
      }

      /**
       * @param requireCommonName Include the common name in the subject name.
       */
      override fun requireCommonName(requireCommonName: IResolvable) {
        cdkBuilder.requireCommonName(requireCommonName.let(IResolvable::unwrap))
      }

      /**
       * @param requireDirectoryPath Include the directory path in the subject name.
       */
      override fun requireDirectoryPath(requireDirectoryPath: Boolean) {
        cdkBuilder.requireDirectoryPath(requireDirectoryPath)
      }

      /**
       * @param requireDirectoryPath Include the directory path in the subject name.
       */
      override fun requireDirectoryPath(requireDirectoryPath: IResolvable) {
        cdkBuilder.requireDirectoryPath(requireDirectoryPath.let(IResolvable::unwrap))
      }

      /**
       * @param requireDnsAsCn Include the DNS as common name in the subject name.
       */
      override fun requireDnsAsCn(requireDnsAsCn: Boolean) {
        cdkBuilder.requireDnsAsCn(requireDnsAsCn)
      }

      /**
       * @param requireDnsAsCn Include the DNS as common name in the subject name.
       */
      override fun requireDnsAsCn(requireDnsAsCn: IResolvable) {
        cdkBuilder.requireDnsAsCn(requireDnsAsCn.let(IResolvable::unwrap))
      }

      /**
       * @param requireEmail Include the subject's email in the subject name.
       */
      override fun requireEmail(requireEmail: Boolean) {
        cdkBuilder.requireEmail(requireEmail)
      }

      /**
       * @param requireEmail Include the subject's email in the subject name.
       */
      override fun requireEmail(requireEmail: IResolvable) {
        cdkBuilder.requireEmail(requireEmail.let(IResolvable::unwrap))
      }

      /**
       * @param sanRequireDirectoryGuid Include the globally unique identifier (GUID) in the subject
       * alternate name.
       */
      override fun sanRequireDirectoryGuid(sanRequireDirectoryGuid: Boolean) {
        cdkBuilder.sanRequireDirectoryGuid(sanRequireDirectoryGuid)
      }

      /**
       * @param sanRequireDirectoryGuid Include the globally unique identifier (GUID) in the subject
       * alternate name.
       */
      override fun sanRequireDirectoryGuid(sanRequireDirectoryGuid: IResolvable) {
        cdkBuilder.sanRequireDirectoryGuid(sanRequireDirectoryGuid.let(IResolvable::unwrap))
      }

      /**
       * @param sanRequireDns Include the DNS in the subject alternate name.
       */
      override fun sanRequireDns(sanRequireDns: Boolean) {
        cdkBuilder.sanRequireDns(sanRequireDns)
      }

      /**
       * @param sanRequireDns Include the DNS in the subject alternate name.
       */
      override fun sanRequireDns(sanRequireDns: IResolvable) {
        cdkBuilder.sanRequireDns(sanRequireDns.let(IResolvable::unwrap))
      }

      /**
       * @param sanRequireDomainDns Include the domain DNS in the subject alternate name.
       */
      override fun sanRequireDomainDns(sanRequireDomainDns: Boolean) {
        cdkBuilder.sanRequireDomainDns(sanRequireDomainDns)
      }

      /**
       * @param sanRequireDomainDns Include the domain DNS in the subject alternate name.
       */
      override fun sanRequireDomainDns(sanRequireDomainDns: IResolvable) {
        cdkBuilder.sanRequireDomainDns(sanRequireDomainDns.let(IResolvable::unwrap))
      }

      /**
       * @param sanRequireEmail Include the subject's email in the subject alternate name.
       */
      override fun sanRequireEmail(sanRequireEmail: Boolean) {
        cdkBuilder.sanRequireEmail(sanRequireEmail)
      }

      /**
       * @param sanRequireEmail Include the subject's email in the subject alternate name.
       */
      override fun sanRequireEmail(sanRequireEmail: IResolvable) {
        cdkBuilder.sanRequireEmail(sanRequireEmail.let(IResolvable::unwrap))
      }

      /**
       * @param sanRequireSpn Include the service principal name (SPN) in the subject alternate
       * name.
       */
      override fun sanRequireSpn(sanRequireSpn: Boolean) {
        cdkBuilder.sanRequireSpn(sanRequireSpn)
      }

      /**
       * @param sanRequireSpn Include the service principal name (SPN) in the subject alternate
       * name.
       */
      override fun sanRequireSpn(sanRequireSpn: IResolvable) {
        cdkBuilder.sanRequireSpn(sanRequireSpn.let(IResolvable::unwrap))
      }

      /**
       * @param sanRequireUpn Include the user principal name (UPN) in the subject alternate name.
       */
      override fun sanRequireUpn(sanRequireUpn: Boolean) {
        cdkBuilder.sanRequireUpn(sanRequireUpn)
      }

      /**
       * @param sanRequireUpn Include the user principal name (UPN) in the subject alternate name.
       */
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
      /**
       * Include the common name in the subject name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv4.html#cfn-pcaconnectorad-template-subjectnameflagsv4-requirecommonname)
       */
      override fun requireCommonName(): Any? = unwrap(this).getRequireCommonName()

      /**
       * Include the directory path in the subject name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv4.html#cfn-pcaconnectorad-template-subjectnameflagsv4-requiredirectorypath)
       */
      override fun requireDirectoryPath(): Any? = unwrap(this).getRequireDirectoryPath()

      /**
       * Include the DNS as common name in the subject name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv4.html#cfn-pcaconnectorad-template-subjectnameflagsv4-requirednsascn)
       */
      override fun requireDnsAsCn(): Any? = unwrap(this).getRequireDnsAsCn()

      /**
       * Include the subject's email in the subject name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv4.html#cfn-pcaconnectorad-template-subjectnameflagsv4-requireemail)
       */
      override fun requireEmail(): Any? = unwrap(this).getRequireEmail()

      /**
       * Include the globally unique identifier (GUID) in the subject alternate name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv4.html#cfn-pcaconnectorad-template-subjectnameflagsv4-sanrequiredirectoryguid)
       */
      override fun sanRequireDirectoryGuid(): Any? = unwrap(this).getSanRequireDirectoryGuid()

      /**
       * Include the DNS in the subject alternate name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv4.html#cfn-pcaconnectorad-template-subjectnameflagsv4-sanrequiredns)
       */
      override fun sanRequireDns(): Any? = unwrap(this).getSanRequireDns()

      /**
       * Include the domain DNS in the subject alternate name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv4.html#cfn-pcaconnectorad-template-subjectnameflagsv4-sanrequiredomaindns)
       */
      override fun sanRequireDomainDns(): Any? = unwrap(this).getSanRequireDomainDns()

      /**
       * Include the subject's email in the subject alternate name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv4.html#cfn-pcaconnectorad-template-subjectnameflagsv4-sanrequireemail)
       */
      override fun sanRequireEmail(): Any? = unwrap(this).getSanRequireEmail()

      /**
       * Include the service principal name (SPN) in the subject alternate name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv4.html#cfn-pcaconnectorad-template-subjectnameflagsv4-sanrequirespn)
       */
      override fun sanRequireSpn(): Any? = unwrap(this).getSanRequireSpn()

      /**
       * Include the user principal name (UPN) in the subject alternate name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv4.html#cfn-pcaconnectorad-template-subjectnameflagsv4-sanrequireupn)
       */
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
    /**
     * Allows certificate issuance using autoenrollment.
     *
     * Set to TRUE to allow autoenrollment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-generalflagsv4.html#cfn-pcaconnectorad-template-generalflagsv4-autoenrollment)
     */
    public fun autoEnrollment(): Any? = unwrap(this).getAutoEnrollment()

    /**
     * Defines if the template is for machines or users.
     *
     * Set to TRUE if the template is for machines. Set to FALSE if the template is for users
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-generalflagsv4.html#cfn-pcaconnectorad-template-generalflagsv4-machinetype)
     */
    public fun machineType(): Any? = unwrap(this).getMachineType()

    /**
     * A builder for [GeneralFlagsV4Property]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param autoEnrollment Allows certificate issuance using autoenrollment.
       * Set to TRUE to allow autoenrollment.
       */
      public fun autoEnrollment(autoEnrollment: Boolean)

      /**
       * @param autoEnrollment Allows certificate issuance using autoenrollment.
       * Set to TRUE to allow autoenrollment.
       */
      public fun autoEnrollment(autoEnrollment: IResolvable)

      /**
       * @param machineType Defines if the template is for machines or users.
       * Set to TRUE if the template is for machines. Set to FALSE if the template is for users
       */
      public fun machineType(machineType: Boolean)

      /**
       * @param machineType Defines if the template is for machines or users.
       * Set to TRUE if the template is for machines. Set to FALSE if the template is for users
       */
      public fun machineType(machineType: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.GeneralFlagsV4Property.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.GeneralFlagsV4Property.builder()

      /**
       * @param autoEnrollment Allows certificate issuance using autoenrollment.
       * Set to TRUE to allow autoenrollment.
       */
      override fun autoEnrollment(autoEnrollment: Boolean) {
        cdkBuilder.autoEnrollment(autoEnrollment)
      }

      /**
       * @param autoEnrollment Allows certificate issuance using autoenrollment.
       * Set to TRUE to allow autoenrollment.
       */
      override fun autoEnrollment(autoEnrollment: IResolvable) {
        cdkBuilder.autoEnrollment(autoEnrollment.let(IResolvable::unwrap))
      }

      /**
       * @param machineType Defines if the template is for machines or users.
       * Set to TRUE if the template is for machines. Set to FALSE if the template is for users
       */
      override fun machineType(machineType: Boolean) {
        cdkBuilder.machineType(machineType)
      }

      /**
       * @param machineType Defines if the template is for machines or users.
       * Set to TRUE if the template is for machines. Set to FALSE if the template is for users
       */
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
      /**
       * Allows certificate issuance using autoenrollment.
       *
       * Set to TRUE to allow autoenrollment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-generalflagsv4.html#cfn-pcaconnectorad-template-generalflagsv4-autoenrollment)
       */
      override fun autoEnrollment(): Any? = unwrap(this).getAutoEnrollment()

      /**
       * Defines if the template is for machines or users.
       *
       * Set to TRUE if the template is for machines. Set to FALSE if the template is for users
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-generalflagsv4.html#cfn-pcaconnectorad-template-generalflagsv4-machinetype)
       */
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
    /**
     * Defines the cryptographic providers used to generate the private key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyattributesv2.html#cfn-pcaconnectorad-template-privatekeyattributesv2-cryptoproviders)
     */
    public fun cryptoProviders(): List<String> = unwrap(this).getCryptoProviders() ?: emptyList()

    /**
     * Defines the purpose of the private key.
     *
     * Set it to "KEY_EXCHANGE" or "SIGNATURE" value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyattributesv2.html#cfn-pcaconnectorad-template-privatekeyattributesv2-keyspec)
     */
    public fun keySpec(): String

    /**
     * Set the minimum key length of the private key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyattributesv2.html#cfn-pcaconnectorad-template-privatekeyattributesv2-minimalkeylength)
     */
    public fun minimalKeyLength(): Number

    /**
     * A builder for [PrivateKeyAttributesV2Property]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cryptoProviders Defines the cryptographic providers used to generate the private
       * key.
       */
      public fun cryptoProviders(cryptoProviders: List<String>)

      /**
       * @param cryptoProviders Defines the cryptographic providers used to generate the private
       * key.
       */
      public fun cryptoProviders(vararg cryptoProviders: String)

      /**
       * @param keySpec Defines the purpose of the private key. 
       * Set it to "KEY_EXCHANGE" or "SIGNATURE" value.
       */
      public fun keySpec(keySpec: String)

      /**
       * @param minimalKeyLength Set the minimum key length of the private key. 
       */
      public fun minimalKeyLength(minimalKeyLength: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyAttributesV2Property.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyAttributesV2Property.builder()

      /**
       * @param cryptoProviders Defines the cryptographic providers used to generate the private
       * key.
       */
      override fun cryptoProviders(cryptoProviders: List<String>) {
        cdkBuilder.cryptoProviders(cryptoProviders)
      }

      /**
       * @param cryptoProviders Defines the cryptographic providers used to generate the private
       * key.
       */
      override fun cryptoProviders(vararg cryptoProviders: String): Unit =
          cryptoProviders(cryptoProviders.toList())

      /**
       * @param keySpec Defines the purpose of the private key. 
       * Set it to "KEY_EXCHANGE" or "SIGNATURE" value.
       */
      override fun keySpec(keySpec: String) {
        cdkBuilder.keySpec(keySpec)
      }

      /**
       * @param minimalKeyLength Set the minimum key length of the private key. 
       */
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
      /**
       * Defines the cryptographic providers used to generate the private key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyattributesv2.html#cfn-pcaconnectorad-template-privatekeyattributesv2-cryptoproviders)
       */
      override fun cryptoProviders(): List<String> = unwrap(this).getCryptoProviders() ?:
          emptyList()

      /**
       * Defines the purpose of the private key.
       *
       * Set it to "KEY_EXCHANGE" or "SIGNATURE" value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyattributesv2.html#cfn-pcaconnectorad-template-privatekeyattributesv2-keyspec)
       */
      override fun keySpec(): String = unwrap(this).getKeySpec()

      /**
       * Set the minimum key length of the private key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyattributesv2.html#cfn-pcaconnectorad-template-privatekeyattributesv2-minimalkeylength)
       */
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
    /**
     * Defines the algorithm used to generate the private key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyattributesv4.html#cfn-pcaconnectorad-template-privatekeyattributesv4-algorithm)
     */
    public fun algorithm(): String? = unwrap(this).getAlgorithm()

    /**
     * Defines the cryptographic providers used to generate the private key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyattributesv4.html#cfn-pcaconnectorad-template-privatekeyattributesv4-cryptoproviders)
     */
    public fun cryptoProviders(): List<String> = unwrap(this).getCryptoProviders() ?: emptyList()

    /**
     * Defines the purpose of the private key.
     *
     * Set it to "KEY_EXCHANGE" or "SIGNATURE" value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyattributesv4.html#cfn-pcaconnectorad-template-privatekeyattributesv4-keyspec)
     */
    public fun keySpec(): String

    /**
     * The key usage property defines the purpose of the private key contained in the certificate.
     *
     * You can specify specific purposes using property flags or all by using property type ALL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyattributesv4.html#cfn-pcaconnectorad-template-privatekeyattributesv4-keyusageproperty)
     */
    public fun keyUsageProperty(): Any? = unwrap(this).getKeyUsageProperty()

    /**
     * Set the minimum key length of the private key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyattributesv4.html#cfn-pcaconnectorad-template-privatekeyattributesv4-minimalkeylength)
     */
    public fun minimalKeyLength(): Number

    /**
     * A builder for [PrivateKeyAttributesV4Property]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param algorithm Defines the algorithm used to generate the private key.
       */
      public fun algorithm(algorithm: String)

      /**
       * @param cryptoProviders Defines the cryptographic providers used to generate the private
       * key.
       */
      public fun cryptoProviders(cryptoProviders: List<String>)

      /**
       * @param cryptoProviders Defines the cryptographic providers used to generate the private
       * key.
       */
      public fun cryptoProviders(vararg cryptoProviders: String)

      /**
       * @param keySpec Defines the purpose of the private key. 
       * Set it to "KEY_EXCHANGE" or "SIGNATURE" value.
       */
      public fun keySpec(keySpec: String)

      /**
       * @param keyUsageProperty The key usage property defines the purpose of the private key
       * contained in the certificate.
       * You can specify specific purposes using property flags or all by using property type ALL.
       */
      public fun keyUsageProperty(keyUsageProperty: IResolvable)

      /**
       * @param keyUsageProperty The key usage property defines the purpose of the private key
       * contained in the certificate.
       * You can specify specific purposes using property flags or all by using property type ALL.
       */
      public fun keyUsageProperty(keyUsageProperty: KeyUsagePropertyProperty)

      /**
       * @param keyUsageProperty The key usage property defines the purpose of the private key
       * contained in the certificate.
       * You can specify specific purposes using property flags or all by using property type ALL.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("39c25c064000533e637d6eed426bb566a63aa39c6166838f67748c5adafccb96")
      public fun keyUsageProperty(keyUsageProperty: KeyUsagePropertyProperty.Builder.() -> Unit)

      /**
       * @param minimalKeyLength Set the minimum key length of the private key. 
       */
      public fun minimalKeyLength(minimalKeyLength: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyAttributesV4Property.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyAttributesV4Property.builder()

      /**
       * @param algorithm Defines the algorithm used to generate the private key.
       */
      override fun algorithm(algorithm: String) {
        cdkBuilder.algorithm(algorithm)
      }

      /**
       * @param cryptoProviders Defines the cryptographic providers used to generate the private
       * key.
       */
      override fun cryptoProviders(cryptoProviders: List<String>) {
        cdkBuilder.cryptoProviders(cryptoProviders)
      }

      /**
       * @param cryptoProviders Defines the cryptographic providers used to generate the private
       * key.
       */
      override fun cryptoProviders(vararg cryptoProviders: String): Unit =
          cryptoProviders(cryptoProviders.toList())

      /**
       * @param keySpec Defines the purpose of the private key. 
       * Set it to "KEY_EXCHANGE" or "SIGNATURE" value.
       */
      override fun keySpec(keySpec: String) {
        cdkBuilder.keySpec(keySpec)
      }

      /**
       * @param keyUsageProperty The key usage property defines the purpose of the private key
       * contained in the certificate.
       * You can specify specific purposes using property flags or all by using property type ALL.
       */
      override fun keyUsageProperty(keyUsageProperty: IResolvable) {
        cdkBuilder.keyUsageProperty(keyUsageProperty.let(IResolvable::unwrap))
      }

      /**
       * @param keyUsageProperty The key usage property defines the purpose of the private key
       * contained in the certificate.
       * You can specify specific purposes using property flags or all by using property type ALL.
       */
      override fun keyUsageProperty(keyUsageProperty: KeyUsagePropertyProperty) {
        cdkBuilder.keyUsageProperty(keyUsageProperty.let(KeyUsagePropertyProperty::unwrap))
      }

      /**
       * @param keyUsageProperty The key usage property defines the purpose of the private key
       * contained in the certificate.
       * You can specify specific purposes using property flags or all by using property type ALL.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("39c25c064000533e637d6eed426bb566a63aa39c6166838f67748c5adafccb96")
      override fun keyUsageProperty(keyUsageProperty: KeyUsagePropertyProperty.Builder.() -> Unit):
          Unit = keyUsageProperty(KeyUsagePropertyProperty(keyUsageProperty))

      /**
       * @param minimalKeyLength Set the minimum key length of the private key. 
       */
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
      /**
       * Defines the algorithm used to generate the private key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyattributesv4.html#cfn-pcaconnectorad-template-privatekeyattributesv4-algorithm)
       */
      override fun algorithm(): String? = unwrap(this).getAlgorithm()

      /**
       * Defines the cryptographic providers used to generate the private key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyattributesv4.html#cfn-pcaconnectorad-template-privatekeyattributesv4-cryptoproviders)
       */
      override fun cryptoProviders(): List<String> = unwrap(this).getCryptoProviders() ?:
          emptyList()

      /**
       * Defines the purpose of the private key.
       *
       * Set it to "KEY_EXCHANGE" or "SIGNATURE" value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyattributesv4.html#cfn-pcaconnectorad-template-privatekeyattributesv4-keyspec)
       */
      override fun keySpec(): String = unwrap(this).getKeySpec()

      /**
       * The key usage property defines the purpose of the private key contained in the certificate.
       *
       * You can specify specific purposes using property flags or all by using property type ALL.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyattributesv4.html#cfn-pcaconnectorad-template-privatekeyattributesv4-keyusageproperty)
       */
      override fun keyUsageProperty(): Any? = unwrap(this).getKeyUsageProperty()

      /**
       * Set the minimum key length of the private key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyattributesv4.html#cfn-pcaconnectorad-template-privatekeyattributesv4-minimalkeylength)
       */
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
    /**
     * Defines the algorithm used to generate the private key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyattributesv3.html#cfn-pcaconnectorad-template-privatekeyattributesv3-algorithm)
     */
    public fun algorithm(): String

    /**
     * Defines the cryptographic providers used to generate the private key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyattributesv3.html#cfn-pcaconnectorad-template-privatekeyattributesv3-cryptoproviders)
     */
    public fun cryptoProviders(): List<String> = unwrap(this).getCryptoProviders() ?: emptyList()

    /**
     * Defines the purpose of the private key.
     *
     * Set it to "KEY_EXCHANGE" or "SIGNATURE" value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyattributesv3.html#cfn-pcaconnectorad-template-privatekeyattributesv3-keyspec)
     */
    public fun keySpec(): String

    /**
     * The key usage property defines the purpose of the private key contained in the certificate.
     *
     * You can specify specific purposes using property flags or all by using property type ALL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyattributesv3.html#cfn-pcaconnectorad-template-privatekeyattributesv3-keyusageproperty)
     */
    public fun keyUsageProperty(): Any

    /**
     * Set the minimum key length of the private key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyattributesv3.html#cfn-pcaconnectorad-template-privatekeyattributesv3-minimalkeylength)
     */
    public fun minimalKeyLength(): Number

    /**
     * A builder for [PrivateKeyAttributesV3Property]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param algorithm Defines the algorithm used to generate the private key. 
       */
      public fun algorithm(algorithm: String)

      /**
       * @param cryptoProviders Defines the cryptographic providers used to generate the private
       * key.
       */
      public fun cryptoProviders(cryptoProviders: List<String>)

      /**
       * @param cryptoProviders Defines the cryptographic providers used to generate the private
       * key.
       */
      public fun cryptoProviders(vararg cryptoProviders: String)

      /**
       * @param keySpec Defines the purpose of the private key. 
       * Set it to "KEY_EXCHANGE" or "SIGNATURE" value.
       */
      public fun keySpec(keySpec: String)

      /**
       * @param keyUsageProperty The key usage property defines the purpose of the private key
       * contained in the certificate. 
       * You can specify specific purposes using property flags or all by using property type ALL.
       */
      public fun keyUsageProperty(keyUsageProperty: IResolvable)

      /**
       * @param keyUsageProperty The key usage property defines the purpose of the private key
       * contained in the certificate. 
       * You can specify specific purposes using property flags or all by using property type ALL.
       */
      public fun keyUsageProperty(keyUsageProperty: KeyUsagePropertyProperty)

      /**
       * @param keyUsageProperty The key usage property defines the purpose of the private key
       * contained in the certificate. 
       * You can specify specific purposes using property flags or all by using property type ALL.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ccd5bffefaa9ac6fdcbd555901a072569107b00d07950ec2c4793559eb0cc6d9")
      public fun keyUsageProperty(keyUsageProperty: KeyUsagePropertyProperty.Builder.() -> Unit)

      /**
       * @param minimalKeyLength Set the minimum key length of the private key. 
       */
      public fun minimalKeyLength(minimalKeyLength: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyAttributesV3Property.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyAttributesV3Property.builder()

      /**
       * @param algorithm Defines the algorithm used to generate the private key. 
       */
      override fun algorithm(algorithm: String) {
        cdkBuilder.algorithm(algorithm)
      }

      /**
       * @param cryptoProviders Defines the cryptographic providers used to generate the private
       * key.
       */
      override fun cryptoProviders(cryptoProviders: List<String>) {
        cdkBuilder.cryptoProviders(cryptoProviders)
      }

      /**
       * @param cryptoProviders Defines the cryptographic providers used to generate the private
       * key.
       */
      override fun cryptoProviders(vararg cryptoProviders: String): Unit =
          cryptoProviders(cryptoProviders.toList())

      /**
       * @param keySpec Defines the purpose of the private key. 
       * Set it to "KEY_EXCHANGE" or "SIGNATURE" value.
       */
      override fun keySpec(keySpec: String) {
        cdkBuilder.keySpec(keySpec)
      }

      /**
       * @param keyUsageProperty The key usage property defines the purpose of the private key
       * contained in the certificate. 
       * You can specify specific purposes using property flags or all by using property type ALL.
       */
      override fun keyUsageProperty(keyUsageProperty: IResolvable) {
        cdkBuilder.keyUsageProperty(keyUsageProperty.let(IResolvable::unwrap))
      }

      /**
       * @param keyUsageProperty The key usage property defines the purpose of the private key
       * contained in the certificate. 
       * You can specify specific purposes using property flags or all by using property type ALL.
       */
      override fun keyUsageProperty(keyUsageProperty: KeyUsagePropertyProperty) {
        cdkBuilder.keyUsageProperty(keyUsageProperty.let(KeyUsagePropertyProperty::unwrap))
      }

      /**
       * @param keyUsageProperty The key usage property defines the purpose of the private key
       * contained in the certificate. 
       * You can specify specific purposes using property flags or all by using property type ALL.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ccd5bffefaa9ac6fdcbd555901a072569107b00d07950ec2c4793559eb0cc6d9")
      override fun keyUsageProperty(keyUsageProperty: KeyUsagePropertyProperty.Builder.() -> Unit):
          Unit = keyUsageProperty(KeyUsagePropertyProperty(keyUsageProperty))

      /**
       * @param minimalKeyLength Set the minimum key length of the private key. 
       */
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
      /**
       * Defines the algorithm used to generate the private key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyattributesv3.html#cfn-pcaconnectorad-template-privatekeyattributesv3-algorithm)
       */
      override fun algorithm(): String = unwrap(this).getAlgorithm()

      /**
       * Defines the cryptographic providers used to generate the private key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyattributesv3.html#cfn-pcaconnectorad-template-privatekeyattributesv3-cryptoproviders)
       */
      override fun cryptoProviders(): List<String> = unwrap(this).getCryptoProviders() ?:
          emptyList()

      /**
       * Defines the purpose of the private key.
       *
       * Set it to "KEY_EXCHANGE" or "SIGNATURE" value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyattributesv3.html#cfn-pcaconnectorad-template-privatekeyattributesv3-keyspec)
       */
      override fun keySpec(): String = unwrap(this).getKeySpec()

      /**
       * The key usage property defines the purpose of the private key contained in the certificate.
       *
       * You can specify specific purposes using property flags or all by using property type ALL.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyattributesv3.html#cfn-pcaconnectorad-template-privatekeyattributesv3-keyusageproperty)
       */
      override fun keyUsageProperty(): Any = unwrap(this).getKeyUsageProperty()

      /**
       * Set the minimum key length of the private key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyattributesv3.html#cfn-pcaconnectorad-template-privatekeyattributesv3-minimalkeylength)
       */
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
    /**
     * Allow renewal using the same key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-enrollmentflagsv3.html#cfn-pcaconnectorad-template-enrollmentflagsv3-enablekeyreuseonnttokenkeysetstoragefull)
     */
    public fun enableKeyReuseOnNtTokenKeysetStorageFull(): Any? =
        unwrap(this).getEnableKeyReuseOnNtTokenKeysetStorageFull()

    /**
     * Include symmetric algorithms allowed by the subject.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-enrollmentflagsv3.html#cfn-pcaconnectorad-template-enrollmentflagsv3-includesymmetricalgorithms)
     */
    public fun includeSymmetricAlgorithms(): Any? = unwrap(this).getIncludeSymmetricAlgorithms()

    /**
     * This flag instructs the CA to not include the security extension szOID_NTDS_CA_SECURITY_EXT
     * (OID:1.3.6.1.4.1.311.25.2), as specified in [MS-WCCE] sections 2.2.2.7.7.4 and
     * 3.2.2.6.2.1.4.5.9, in the issued certificate. This addresses a Windows Kerberos
     * elevation-of-privilege vulnerability.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-enrollmentflagsv3.html#cfn-pcaconnectorad-template-enrollmentflagsv3-nosecurityextension)
     */
    public fun noSecurityExtension(): Any? = unwrap(this).getNoSecurityExtension()

    /**
     * Delete expired or revoked certificates instead of archiving them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-enrollmentflagsv3.html#cfn-pcaconnectorad-template-enrollmentflagsv3-removeinvalidcertificatefrompersonalstore)
     */
    public fun removeInvalidCertificateFromPersonalStore(): Any? =
        unwrap(this).getRemoveInvalidCertificateFromPersonalStore()

    /**
     * Require user interaction when the subject is enrolled and the private key associated with the
     * certificate is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-enrollmentflagsv3.html#cfn-pcaconnectorad-template-enrollmentflagsv3-userinteractionrequired)
     */
    public fun userInteractionRequired(): Any? = unwrap(this).getUserInteractionRequired()

    /**
     * A builder for [EnrollmentFlagsV3Property]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enableKeyReuseOnNtTokenKeysetStorageFull Allow renewal using the same key.
       */
      public
          fun enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull: Boolean)

      /**
       * @param enableKeyReuseOnNtTokenKeysetStorageFull Allow renewal using the same key.
       */
      public
          fun enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull: IResolvable)

      /**
       * @param includeSymmetricAlgorithms Include symmetric algorithms allowed by the subject.
       */
      public fun includeSymmetricAlgorithms(includeSymmetricAlgorithms: Boolean)

      /**
       * @param includeSymmetricAlgorithms Include symmetric algorithms allowed by the subject.
       */
      public fun includeSymmetricAlgorithms(includeSymmetricAlgorithms: IResolvable)

      /**
       * @param noSecurityExtension This flag instructs the CA to not include the security extension
       * szOID_NTDS_CA_SECURITY_EXT (OID:1.3.6.1.4.1.311.25.2), as specified in [MS-WCCE] sections
       * 2.2.2.7.7.4 and 3.2.2.6.2.1.4.5.9, in the issued certificate. This addresses a Windows
       * Kerberos elevation-of-privilege vulnerability.
       */
      public fun noSecurityExtension(noSecurityExtension: Boolean)

      /**
       * @param noSecurityExtension This flag instructs the CA to not include the security extension
       * szOID_NTDS_CA_SECURITY_EXT (OID:1.3.6.1.4.1.311.25.2), as specified in [MS-WCCE] sections
       * 2.2.2.7.7.4 and 3.2.2.6.2.1.4.5.9, in the issued certificate. This addresses a Windows
       * Kerberos elevation-of-privilege vulnerability.
       */
      public fun noSecurityExtension(noSecurityExtension: IResolvable)

      /**
       * @param removeInvalidCertificateFromPersonalStore Delete expired or revoked certificates
       * instead of archiving them.
       */
      public
          fun removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore: Boolean)

      /**
       * @param removeInvalidCertificateFromPersonalStore Delete expired or revoked certificates
       * instead of archiving them.
       */
      public
          fun removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore: IResolvable)

      /**
       * @param userInteractionRequired Require user interaction when the subject is enrolled and
       * the private key associated with the certificate is used.
       */
      public fun userInteractionRequired(userInteractionRequired: Boolean)

      /**
       * @param userInteractionRequired Require user interaction when the subject is enrolled and
       * the private key associated with the certificate is used.
       */
      public fun userInteractionRequired(userInteractionRequired: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.EnrollmentFlagsV3Property.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.EnrollmentFlagsV3Property.builder()

      /**
       * @param enableKeyReuseOnNtTokenKeysetStorageFull Allow renewal using the same key.
       */
      override
          fun enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull: Boolean) {
        cdkBuilder.enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull)
      }

      /**
       * @param enableKeyReuseOnNtTokenKeysetStorageFull Allow renewal using the same key.
       */
      override
          fun enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull: IResolvable) {
        cdkBuilder.enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull.let(IResolvable::unwrap))
      }

      /**
       * @param includeSymmetricAlgorithms Include symmetric algorithms allowed by the subject.
       */
      override fun includeSymmetricAlgorithms(includeSymmetricAlgorithms: Boolean) {
        cdkBuilder.includeSymmetricAlgorithms(includeSymmetricAlgorithms)
      }

      /**
       * @param includeSymmetricAlgorithms Include symmetric algorithms allowed by the subject.
       */
      override fun includeSymmetricAlgorithms(includeSymmetricAlgorithms: IResolvable) {
        cdkBuilder.includeSymmetricAlgorithms(includeSymmetricAlgorithms.let(IResolvable::unwrap))
      }

      /**
       * @param noSecurityExtension This flag instructs the CA to not include the security extension
       * szOID_NTDS_CA_SECURITY_EXT (OID:1.3.6.1.4.1.311.25.2), as specified in [MS-WCCE] sections
       * 2.2.2.7.7.4 and 3.2.2.6.2.1.4.5.9, in the issued certificate. This addresses a Windows
       * Kerberos elevation-of-privilege vulnerability.
       */
      override fun noSecurityExtension(noSecurityExtension: Boolean) {
        cdkBuilder.noSecurityExtension(noSecurityExtension)
      }

      /**
       * @param noSecurityExtension This flag instructs the CA to not include the security extension
       * szOID_NTDS_CA_SECURITY_EXT (OID:1.3.6.1.4.1.311.25.2), as specified in [MS-WCCE] sections
       * 2.2.2.7.7.4 and 3.2.2.6.2.1.4.5.9, in the issued certificate. This addresses a Windows
       * Kerberos elevation-of-privilege vulnerability.
       */
      override fun noSecurityExtension(noSecurityExtension: IResolvable) {
        cdkBuilder.noSecurityExtension(noSecurityExtension.let(IResolvable::unwrap))
      }

      /**
       * @param removeInvalidCertificateFromPersonalStore Delete expired or revoked certificates
       * instead of archiving them.
       */
      override
          fun removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore: Boolean) {
        cdkBuilder.removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore)
      }

      /**
       * @param removeInvalidCertificateFromPersonalStore Delete expired or revoked certificates
       * instead of archiving them.
       */
      override
          fun removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore: IResolvable) {
        cdkBuilder.removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore.let(IResolvable::unwrap))
      }

      /**
       * @param userInteractionRequired Require user interaction when the subject is enrolled and
       * the private key associated with the certificate is used.
       */
      override fun userInteractionRequired(userInteractionRequired: Boolean) {
        cdkBuilder.userInteractionRequired(userInteractionRequired)
      }

      /**
       * @param userInteractionRequired Require user interaction when the subject is enrolled and
       * the private key associated with the certificate is used.
       */
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
      /**
       * Allow renewal using the same key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-enrollmentflagsv3.html#cfn-pcaconnectorad-template-enrollmentflagsv3-enablekeyreuseonnttokenkeysetstoragefull)
       */
      override fun enableKeyReuseOnNtTokenKeysetStorageFull(): Any? =
          unwrap(this).getEnableKeyReuseOnNtTokenKeysetStorageFull()

      /**
       * Include symmetric algorithms allowed by the subject.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-enrollmentflagsv3.html#cfn-pcaconnectorad-template-enrollmentflagsv3-includesymmetricalgorithms)
       */
      override fun includeSymmetricAlgorithms(): Any? = unwrap(this).getIncludeSymmetricAlgorithms()

      /**
       * This flag instructs the CA to not include the security extension szOID_NTDS_CA_SECURITY_EXT
       * (OID:1.3.6.1.4.1.311.25.2), as specified in [MS-WCCE] sections 2.2.2.7.7.4 and
       * 3.2.2.6.2.1.4.5.9, in the issued certificate. This addresses a Windows Kerberos
       * elevation-of-privilege vulnerability.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-enrollmentflagsv3.html#cfn-pcaconnectorad-template-enrollmentflagsv3-nosecurityextension)
       */
      override fun noSecurityExtension(): Any? = unwrap(this).getNoSecurityExtension()

      /**
       * Delete expired or revoked certificates instead of archiving them.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-enrollmentflagsv3.html#cfn-pcaconnectorad-template-enrollmentflagsv3-removeinvalidcertificatefrompersonalstore)
       */
      override fun removeInvalidCertificateFromPersonalStore(): Any? =
          unwrap(this).getRemoveInvalidCertificateFromPersonalStore()

      /**
       * Require user interaction when the subject is enrolled and the private key associated with
       * the certificate is used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-enrollmentflagsv3.html#cfn-pcaconnectorad-template-enrollmentflagsv3-userinteractionrequired)
       */
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
    /**
     * Allow renewal using the same key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-enrollmentflagsv2.html#cfn-pcaconnectorad-template-enrollmentflagsv2-enablekeyreuseonnttokenkeysetstoragefull)
     */
    public fun enableKeyReuseOnNtTokenKeysetStorageFull(): Any? =
        unwrap(this).getEnableKeyReuseOnNtTokenKeysetStorageFull()

    /**
     * Include symmetric algorithms allowed by the subject.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-enrollmentflagsv2.html#cfn-pcaconnectorad-template-enrollmentflagsv2-includesymmetricalgorithms)
     */
    public fun includeSymmetricAlgorithms(): Any? = unwrap(this).getIncludeSymmetricAlgorithms()

    /**
     * This flag instructs the CA to not include the security extension szOID_NTDS_CA_SECURITY_EXT
     * (OID:1.3.6.1.4.1.311.25.2), as specified in [MS-WCCE] sections 2.2.2.7.7.4 and
     * 3.2.2.6.2.1.4.5.9, in the issued certificate. This addresses a Windows Kerberos
     * elevation-of-privilege vulnerability.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-enrollmentflagsv2.html#cfn-pcaconnectorad-template-enrollmentflagsv2-nosecurityextension)
     */
    public fun noSecurityExtension(): Any? = unwrap(this).getNoSecurityExtension()

    /**
     * Delete expired or revoked certificates instead of archiving them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-enrollmentflagsv2.html#cfn-pcaconnectorad-template-enrollmentflagsv2-removeinvalidcertificatefrompersonalstore)
     */
    public fun removeInvalidCertificateFromPersonalStore(): Any? =
        unwrap(this).getRemoveInvalidCertificateFromPersonalStore()

    /**
     * Require user interaction when the subject is enrolled and the private key associated with the
     * certificate is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-enrollmentflagsv2.html#cfn-pcaconnectorad-template-enrollmentflagsv2-userinteractionrequired)
     */
    public fun userInteractionRequired(): Any? = unwrap(this).getUserInteractionRequired()

    /**
     * A builder for [EnrollmentFlagsV2Property]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enableKeyReuseOnNtTokenKeysetStorageFull Allow renewal using the same key.
       */
      public
          fun enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull: Boolean)

      /**
       * @param enableKeyReuseOnNtTokenKeysetStorageFull Allow renewal using the same key.
       */
      public
          fun enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull: IResolvable)

      /**
       * @param includeSymmetricAlgorithms Include symmetric algorithms allowed by the subject.
       */
      public fun includeSymmetricAlgorithms(includeSymmetricAlgorithms: Boolean)

      /**
       * @param includeSymmetricAlgorithms Include symmetric algorithms allowed by the subject.
       */
      public fun includeSymmetricAlgorithms(includeSymmetricAlgorithms: IResolvable)

      /**
       * @param noSecurityExtension This flag instructs the CA to not include the security extension
       * szOID_NTDS_CA_SECURITY_EXT (OID:1.3.6.1.4.1.311.25.2), as specified in [MS-WCCE] sections
       * 2.2.2.7.7.4 and 3.2.2.6.2.1.4.5.9, in the issued certificate. This addresses a Windows
       * Kerberos elevation-of-privilege vulnerability.
       */
      public fun noSecurityExtension(noSecurityExtension: Boolean)

      /**
       * @param noSecurityExtension This flag instructs the CA to not include the security extension
       * szOID_NTDS_CA_SECURITY_EXT (OID:1.3.6.1.4.1.311.25.2), as specified in [MS-WCCE] sections
       * 2.2.2.7.7.4 and 3.2.2.6.2.1.4.5.9, in the issued certificate. This addresses a Windows
       * Kerberos elevation-of-privilege vulnerability.
       */
      public fun noSecurityExtension(noSecurityExtension: IResolvable)

      /**
       * @param removeInvalidCertificateFromPersonalStore Delete expired or revoked certificates
       * instead of archiving them.
       */
      public
          fun removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore: Boolean)

      /**
       * @param removeInvalidCertificateFromPersonalStore Delete expired or revoked certificates
       * instead of archiving them.
       */
      public
          fun removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore: IResolvable)

      /**
       * @param userInteractionRequired Require user interaction when the subject is enrolled and
       * the private key associated with the certificate is used.
       */
      public fun userInteractionRequired(userInteractionRequired: Boolean)

      /**
       * @param userInteractionRequired Require user interaction when the subject is enrolled and
       * the private key associated with the certificate is used.
       */
      public fun userInteractionRequired(userInteractionRequired: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.EnrollmentFlagsV2Property.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.EnrollmentFlagsV2Property.builder()

      /**
       * @param enableKeyReuseOnNtTokenKeysetStorageFull Allow renewal using the same key.
       */
      override
          fun enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull: Boolean) {
        cdkBuilder.enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull)
      }

      /**
       * @param enableKeyReuseOnNtTokenKeysetStorageFull Allow renewal using the same key.
       */
      override
          fun enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull: IResolvable) {
        cdkBuilder.enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull.let(IResolvable::unwrap))
      }

      /**
       * @param includeSymmetricAlgorithms Include symmetric algorithms allowed by the subject.
       */
      override fun includeSymmetricAlgorithms(includeSymmetricAlgorithms: Boolean) {
        cdkBuilder.includeSymmetricAlgorithms(includeSymmetricAlgorithms)
      }

      /**
       * @param includeSymmetricAlgorithms Include symmetric algorithms allowed by the subject.
       */
      override fun includeSymmetricAlgorithms(includeSymmetricAlgorithms: IResolvable) {
        cdkBuilder.includeSymmetricAlgorithms(includeSymmetricAlgorithms.let(IResolvable::unwrap))
      }

      /**
       * @param noSecurityExtension This flag instructs the CA to not include the security extension
       * szOID_NTDS_CA_SECURITY_EXT (OID:1.3.6.1.4.1.311.25.2), as specified in [MS-WCCE] sections
       * 2.2.2.7.7.4 and 3.2.2.6.2.1.4.5.9, in the issued certificate. This addresses a Windows
       * Kerberos elevation-of-privilege vulnerability.
       */
      override fun noSecurityExtension(noSecurityExtension: Boolean) {
        cdkBuilder.noSecurityExtension(noSecurityExtension)
      }

      /**
       * @param noSecurityExtension This flag instructs the CA to not include the security extension
       * szOID_NTDS_CA_SECURITY_EXT (OID:1.3.6.1.4.1.311.25.2), as specified in [MS-WCCE] sections
       * 2.2.2.7.7.4 and 3.2.2.6.2.1.4.5.9, in the issued certificate. This addresses a Windows
       * Kerberos elevation-of-privilege vulnerability.
       */
      override fun noSecurityExtension(noSecurityExtension: IResolvable) {
        cdkBuilder.noSecurityExtension(noSecurityExtension.let(IResolvable::unwrap))
      }

      /**
       * @param removeInvalidCertificateFromPersonalStore Delete expired or revoked certificates
       * instead of archiving them.
       */
      override
          fun removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore: Boolean) {
        cdkBuilder.removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore)
      }

      /**
       * @param removeInvalidCertificateFromPersonalStore Delete expired or revoked certificates
       * instead of archiving them.
       */
      override
          fun removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore: IResolvable) {
        cdkBuilder.removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore.let(IResolvable::unwrap))
      }

      /**
       * @param userInteractionRequired Require user interaction when the subject is enrolled and
       * the private key associated with the certificate is used.
       */
      override fun userInteractionRequired(userInteractionRequired: Boolean) {
        cdkBuilder.userInteractionRequired(userInteractionRequired)
      }

      /**
       * @param userInteractionRequired Require user interaction when the subject is enrolled and
       * the private key associated with the certificate is used.
       */
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
      /**
       * Allow renewal using the same key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-enrollmentflagsv2.html#cfn-pcaconnectorad-template-enrollmentflagsv2-enablekeyreuseonnttokenkeysetstoragefull)
       */
      override fun enableKeyReuseOnNtTokenKeysetStorageFull(): Any? =
          unwrap(this).getEnableKeyReuseOnNtTokenKeysetStorageFull()

      /**
       * Include symmetric algorithms allowed by the subject.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-enrollmentflagsv2.html#cfn-pcaconnectorad-template-enrollmentflagsv2-includesymmetricalgorithms)
       */
      override fun includeSymmetricAlgorithms(): Any? = unwrap(this).getIncludeSymmetricAlgorithms()

      /**
       * This flag instructs the CA to not include the security extension szOID_NTDS_CA_SECURITY_EXT
       * (OID:1.3.6.1.4.1.311.25.2), as specified in [MS-WCCE] sections 2.2.2.7.7.4 and
       * 3.2.2.6.2.1.4.5.9, in the issued certificate. This addresses a Windows Kerberos
       * elevation-of-privilege vulnerability.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-enrollmentflagsv2.html#cfn-pcaconnectorad-template-enrollmentflagsv2-nosecurityextension)
       */
      override fun noSecurityExtension(): Any? = unwrap(this).getNoSecurityExtension()

      /**
       * Delete expired or revoked certificates instead of archiving them.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-enrollmentflagsv2.html#cfn-pcaconnectorad-template-enrollmentflagsv2-removeinvalidcertificatefrompersonalstore)
       */
      override fun removeInvalidCertificateFromPersonalStore(): Any? =
          unwrap(this).getRemoveInvalidCertificateFromPersonalStore()

      /**
       * Require user interaction when the subject is enrolled and the private key associated with
       * the certificate is used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-enrollmentflagsv2.html#cfn-pcaconnectorad-template-enrollmentflagsv2-userinteractionrequired)
       */
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
    /**
     * The object identifier (OID) of an application policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-applicationpolicy.html#cfn-pcaconnectorad-template-applicationpolicy-policyobjectidentifier)
     */
    public fun policyObjectIdentifier(): String? = unwrap(this).getPolicyObjectIdentifier()

    /**
     * The type of application policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-applicationpolicy.html#cfn-pcaconnectorad-template-applicationpolicy-policytype)
     */
    public fun policyType(): String? = unwrap(this).getPolicyType()

    /**
     * A builder for [ApplicationPolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param policyObjectIdentifier The object identifier (OID) of an application policy.
       */
      public fun policyObjectIdentifier(policyObjectIdentifier: String)

      /**
       * @param policyType The type of application policy.
       */
      public fun policyType(policyType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ApplicationPolicyProperty.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ApplicationPolicyProperty.builder()

      /**
       * @param policyObjectIdentifier The object identifier (OID) of an application policy.
       */
      override fun policyObjectIdentifier(policyObjectIdentifier: String) {
        cdkBuilder.policyObjectIdentifier(policyObjectIdentifier)
      }

      /**
       * @param policyType The type of application policy.
       */
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
      /**
       * The object identifier (OID) of an application policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-applicationpolicy.html#cfn-pcaconnectorad-template-applicationpolicy-policyobjectidentifier)
       */
      override fun policyObjectIdentifier(): String? = unwrap(this).getPolicyObjectIdentifier()

      /**
       * The type of application policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-applicationpolicy.html#cfn-pcaconnectorad-template-applicationpolicy-policytype)
       */
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
    /**
     * Marks the application policy extension as critical.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-applicationpolicies.html#cfn-pcaconnectorad-template-applicationpolicies-critical)
     */
    public fun critical(): Any? = unwrap(this).getCritical()

    /**
     * Application policies describe what the certificate can be used for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-applicationpolicies.html#cfn-pcaconnectorad-template-applicationpolicies-policies)
     */
    public fun policies(): Any

    /**
     * A builder for [ApplicationPoliciesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param critical Marks the application policy extension as critical.
       */
      public fun critical(critical: Boolean)

      /**
       * @param critical Marks the application policy extension as critical.
       */
      public fun critical(critical: IResolvable)

      /**
       * @param policies Application policies describe what the certificate can be used for. 
       */
      public fun policies(policies: IResolvable)

      /**
       * @param policies Application policies describe what the certificate can be used for. 
       */
      public fun policies(policies: List<Any>)

      /**
       * @param policies Application policies describe what the certificate can be used for. 
       */
      public fun policies(vararg policies: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ApplicationPoliciesProperty.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ApplicationPoliciesProperty.builder()

      /**
       * @param critical Marks the application policy extension as critical.
       */
      override fun critical(critical: Boolean) {
        cdkBuilder.critical(critical)
      }

      /**
       * @param critical Marks the application policy extension as critical.
       */
      override fun critical(critical: IResolvable) {
        cdkBuilder.critical(critical.let(IResolvable::unwrap))
      }

      /**
       * @param policies Application policies describe what the certificate can be used for. 
       */
      override fun policies(policies: IResolvable) {
        cdkBuilder.policies(policies.let(IResolvable::unwrap))
      }

      /**
       * @param policies Application policies describe what the certificate can be used for. 
       */
      override fun policies(policies: List<Any>) {
        cdkBuilder.policies(policies)
      }

      /**
       * @param policies Application policies describe what the certificate can be used for. 
       */
      override fun policies(vararg policies: Any): Unit = policies(policies.toList())

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ApplicationPoliciesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ApplicationPoliciesProperty,
    ) : CdkObject(cdkObject), ApplicationPoliciesProperty {
      /**
       * Marks the application policy extension as critical.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-applicationpolicies.html#cfn-pcaconnectorad-template-applicationpolicies-critical)
       */
      override fun critical(): Any? = unwrap(this).getCritical()

      /**
       * Application policies describe what the certificate can be used for.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-applicationpolicies.html#cfn-pcaconnectorad-template-applicationpolicies-policies)
       */
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
    /**
     * Allows key for encryption and decryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-keyusagepropertyflags.html#cfn-pcaconnectorad-template-keyusagepropertyflags-decrypt)
     */
    public fun decrypt(): Any? = unwrap(this).getDecrypt()

    /**
     * Allows key exchange without encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-keyusagepropertyflags.html#cfn-pcaconnectorad-template-keyusagepropertyflags-keyagreement)
     */
    public fun keyAgreement(): Any? = unwrap(this).getKeyAgreement()

    /**
     * Allow key use for digital signature.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-keyusagepropertyflags.html#cfn-pcaconnectorad-template-keyusagepropertyflags-sign)
     */
    public fun sign(): Any? = unwrap(this).getSign()

    /**
     * A builder for [KeyUsagePropertyFlagsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param decrypt Allows key for encryption and decryption.
       */
      public fun decrypt(decrypt: Boolean)

      /**
       * @param decrypt Allows key for encryption and decryption.
       */
      public fun decrypt(decrypt: IResolvable)

      /**
       * @param keyAgreement Allows key exchange without encryption.
       */
      public fun keyAgreement(keyAgreement: Boolean)

      /**
       * @param keyAgreement Allows key exchange without encryption.
       */
      public fun keyAgreement(keyAgreement: IResolvable)

      /**
       * @param sign Allow key use for digital signature.
       */
      public fun sign(sign: Boolean)

      /**
       * @param sign Allow key use for digital signature.
       */
      public fun sign(sign: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsagePropertyFlagsProperty.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.KeyUsagePropertyFlagsProperty.builder()

      /**
       * @param decrypt Allows key for encryption and decryption.
       */
      override fun decrypt(decrypt: Boolean) {
        cdkBuilder.decrypt(decrypt)
      }

      /**
       * @param decrypt Allows key for encryption and decryption.
       */
      override fun decrypt(decrypt: IResolvable) {
        cdkBuilder.decrypt(decrypt.let(IResolvable::unwrap))
      }

      /**
       * @param keyAgreement Allows key exchange without encryption.
       */
      override fun keyAgreement(keyAgreement: Boolean) {
        cdkBuilder.keyAgreement(keyAgreement)
      }

      /**
       * @param keyAgreement Allows key exchange without encryption.
       */
      override fun keyAgreement(keyAgreement: IResolvable) {
        cdkBuilder.keyAgreement(keyAgreement.let(IResolvable::unwrap))
      }

      /**
       * @param sign Allow key use for digital signature.
       */
      override fun sign(sign: Boolean) {
        cdkBuilder.sign(sign)
      }

      /**
       * @param sign Allow key use for digital signature.
       */
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
      /**
       * Allows key for encryption and decryption.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-keyusagepropertyflags.html#cfn-pcaconnectorad-template-keyusagepropertyflags-decrypt)
       */
      override fun decrypt(): Any? = unwrap(this).getDecrypt()

      /**
       * Allows key exchange without encryption.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-keyusagepropertyflags.html#cfn-pcaconnectorad-template-keyusagepropertyflags-keyagreement)
       */
      override fun keyAgreement(): Any? = unwrap(this).getKeyAgreement()

      /**
       * Allow key use for digital signature.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-keyusagepropertyflags.html#cfn-pcaconnectorad-template-keyusagepropertyflags-sign)
       */
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
    /**
     * Application policies specify what the certificate is used for and its purpose.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-extensionsv2.html#cfn-pcaconnectorad-template-extensionsv2-applicationpolicies)
     */
    public fun applicationPolicies(): Any? = unwrap(this).getApplicationPolicies()

    /**
     * The key usage extension defines the purpose (e.g., encipherment, signature, certificate
     * signing) of the key contained in the certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-extensionsv2.html#cfn-pcaconnectorad-template-extensionsv2-keyusage)
     */
    public fun keyUsage(): Any

    /**
     * A builder for [ExtensionsV2Property]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param applicationPolicies Application policies specify what the certificate is used for
       * and its purpose.
       */
      public fun applicationPolicies(applicationPolicies: IResolvable)

      /**
       * @param applicationPolicies Application policies specify what the certificate is used for
       * and its purpose.
       */
      public fun applicationPolicies(applicationPolicies: ApplicationPoliciesProperty)

      /**
       * @param applicationPolicies Application policies specify what the certificate is used for
       * and its purpose.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a828670bec1d28e8cc1a2d50058b79d351f6c153d40af2f570d8060b6444d726")
      public
          fun applicationPolicies(applicationPolicies: ApplicationPoliciesProperty.Builder.() -> Unit)

      /**
       * @param keyUsage The key usage extension defines the purpose (e.g., encipherment, signature,
       * certificate signing) of the key contained in the certificate. 
       */
      public fun keyUsage(keyUsage: IResolvable)

      /**
       * @param keyUsage The key usage extension defines the purpose (e.g., encipherment, signature,
       * certificate signing) of the key contained in the certificate. 
       */
      public fun keyUsage(keyUsage: KeyUsageProperty)

      /**
       * @param keyUsage The key usage extension defines the purpose (e.g., encipherment, signature,
       * certificate signing) of the key contained in the certificate. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9c693eed2a201cdc50ab632d8b3801ac042a7a5b25b4ead1c4ddc1c28256cf4e")
      public fun keyUsage(keyUsage: KeyUsageProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ExtensionsV2Property.Builder =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ExtensionsV2Property.builder()

      /**
       * @param applicationPolicies Application policies specify what the certificate is used for
       * and its purpose.
       */
      override fun applicationPolicies(applicationPolicies: IResolvable) {
        cdkBuilder.applicationPolicies(applicationPolicies.let(IResolvable::unwrap))
      }

      /**
       * @param applicationPolicies Application policies specify what the certificate is used for
       * and its purpose.
       */
      override fun applicationPolicies(applicationPolicies: ApplicationPoliciesProperty) {
        cdkBuilder.applicationPolicies(applicationPolicies.let(ApplicationPoliciesProperty::unwrap))
      }

      /**
       * @param applicationPolicies Application policies specify what the certificate is used for
       * and its purpose.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a828670bec1d28e8cc1a2d50058b79d351f6c153d40af2f570d8060b6444d726")
      override
          fun applicationPolicies(applicationPolicies: ApplicationPoliciesProperty.Builder.() -> Unit):
          Unit = applicationPolicies(ApplicationPoliciesProperty(applicationPolicies))

      /**
       * @param keyUsage The key usage extension defines the purpose (e.g., encipherment, signature,
       * certificate signing) of the key contained in the certificate. 
       */
      override fun keyUsage(keyUsage: IResolvable) {
        cdkBuilder.keyUsage(keyUsage.let(IResolvable::unwrap))
      }

      /**
       * @param keyUsage The key usage extension defines the purpose (e.g., encipherment, signature,
       * certificate signing) of the key contained in the certificate. 
       */
      override fun keyUsage(keyUsage: KeyUsageProperty) {
        cdkBuilder.keyUsage(keyUsage.let(KeyUsageProperty::unwrap))
      }

      /**
       * @param keyUsage The key usage extension defines the purpose (e.g., encipherment, signature,
       * certificate signing) of the key contained in the certificate. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
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
      /**
       * Application policies specify what the certificate is used for and its purpose.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-extensionsv2.html#cfn-pcaconnectorad-template-extensionsv2-applicationpolicies)
       */
      override fun applicationPolicies(): Any? = unwrap(this).getApplicationPolicies()

      /**
       * The key usage extension defines the purpose (e.g., encipherment, signature, certificate
       * signing) of the key contained in the certificate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-extensionsv2.html#cfn-pcaconnectorad-template-extensionsv2-keyusage)
       */
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
    /**
     * Include the common name in the subject name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv3.html#cfn-pcaconnectorad-template-subjectnameflagsv3-requirecommonname)
     */
    public fun requireCommonName(): Any? = unwrap(this).getRequireCommonName()

    /**
     * Include the directory path in the subject name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv3.html#cfn-pcaconnectorad-template-subjectnameflagsv3-requiredirectorypath)
     */
    public fun requireDirectoryPath(): Any? = unwrap(this).getRequireDirectoryPath()

    /**
     * Include the DNS as common name in the subject name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv3.html#cfn-pcaconnectorad-template-subjectnameflagsv3-requirednsascn)
     */
    public fun requireDnsAsCn(): Any? = unwrap(this).getRequireDnsAsCn()

    /**
     * Include the subject's email in the subject name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv3.html#cfn-pcaconnectorad-template-subjectnameflagsv3-requireemail)
     */
    public fun requireEmail(): Any? = unwrap(this).getRequireEmail()

    /**
     * Include the globally unique identifier (GUID) in the subject alternate name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv3.html#cfn-pcaconnectorad-template-subjectnameflagsv3-sanrequiredirectoryguid)
     */
    public fun sanRequireDirectoryGuid(): Any? = unwrap(this).getSanRequireDirectoryGuid()

    /**
     * Include the DNS in the subject alternate name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv3.html#cfn-pcaconnectorad-template-subjectnameflagsv3-sanrequiredns)
     */
    public fun sanRequireDns(): Any? = unwrap(this).getSanRequireDns()

    /**
     * Include the domain DNS in the subject alternate name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv3.html#cfn-pcaconnectorad-template-subjectnameflagsv3-sanrequiredomaindns)
     */
    public fun sanRequireDomainDns(): Any? = unwrap(this).getSanRequireDomainDns()

    /**
     * Include the subject's email in the subject alternate name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv3.html#cfn-pcaconnectorad-template-subjectnameflagsv3-sanrequireemail)
     */
    public fun sanRequireEmail(): Any? = unwrap(this).getSanRequireEmail()

    /**
     * Include the service principal name (SPN) in the subject alternate name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv3.html#cfn-pcaconnectorad-template-subjectnameflagsv3-sanrequirespn)
     */
    public fun sanRequireSpn(): Any? = unwrap(this).getSanRequireSpn()

    /**
     * Include the user principal name (UPN) in the subject alternate name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv3.html#cfn-pcaconnectorad-template-subjectnameflagsv3-sanrequireupn)
     */
    public fun sanRequireUpn(): Any? = unwrap(this).getSanRequireUpn()

    /**
     * A builder for [SubjectNameFlagsV3Property]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param requireCommonName Include the common name in the subject name.
       */
      public fun requireCommonName(requireCommonName: Boolean)

      /**
       * @param requireCommonName Include the common name in the subject name.
       */
      public fun requireCommonName(requireCommonName: IResolvable)

      /**
       * @param requireDirectoryPath Include the directory path in the subject name.
       */
      public fun requireDirectoryPath(requireDirectoryPath: Boolean)

      /**
       * @param requireDirectoryPath Include the directory path in the subject name.
       */
      public fun requireDirectoryPath(requireDirectoryPath: IResolvable)

      /**
       * @param requireDnsAsCn Include the DNS as common name in the subject name.
       */
      public fun requireDnsAsCn(requireDnsAsCn: Boolean)

      /**
       * @param requireDnsAsCn Include the DNS as common name in the subject name.
       */
      public fun requireDnsAsCn(requireDnsAsCn: IResolvable)

      /**
       * @param requireEmail Include the subject's email in the subject name.
       */
      public fun requireEmail(requireEmail: Boolean)

      /**
       * @param requireEmail Include the subject's email in the subject name.
       */
      public fun requireEmail(requireEmail: IResolvable)

      /**
       * @param sanRequireDirectoryGuid Include the globally unique identifier (GUID) in the subject
       * alternate name.
       */
      public fun sanRequireDirectoryGuid(sanRequireDirectoryGuid: Boolean)

      /**
       * @param sanRequireDirectoryGuid Include the globally unique identifier (GUID) in the subject
       * alternate name.
       */
      public fun sanRequireDirectoryGuid(sanRequireDirectoryGuid: IResolvable)

      /**
       * @param sanRequireDns Include the DNS in the subject alternate name.
       */
      public fun sanRequireDns(sanRequireDns: Boolean)

      /**
       * @param sanRequireDns Include the DNS in the subject alternate name.
       */
      public fun sanRequireDns(sanRequireDns: IResolvable)

      /**
       * @param sanRequireDomainDns Include the domain DNS in the subject alternate name.
       */
      public fun sanRequireDomainDns(sanRequireDomainDns: Boolean)

      /**
       * @param sanRequireDomainDns Include the domain DNS in the subject alternate name.
       */
      public fun sanRequireDomainDns(sanRequireDomainDns: IResolvable)

      /**
       * @param sanRequireEmail Include the subject's email in the subject alternate name.
       */
      public fun sanRequireEmail(sanRequireEmail: Boolean)

      /**
       * @param sanRequireEmail Include the subject's email in the subject alternate name.
       */
      public fun sanRequireEmail(sanRequireEmail: IResolvable)

      /**
       * @param sanRequireSpn Include the service principal name (SPN) in the subject alternate
       * name.
       */
      public fun sanRequireSpn(sanRequireSpn: Boolean)

      /**
       * @param sanRequireSpn Include the service principal name (SPN) in the subject alternate
       * name.
       */
      public fun sanRequireSpn(sanRequireSpn: IResolvable)

      /**
       * @param sanRequireUpn Include the user principal name (UPN) in the subject alternate name.
       */
      public fun sanRequireUpn(sanRequireUpn: Boolean)

      /**
       * @param sanRequireUpn Include the user principal name (UPN) in the subject alternate name.
       */
      public fun sanRequireUpn(sanRequireUpn: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.SubjectNameFlagsV3Property.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.SubjectNameFlagsV3Property.builder()

      /**
       * @param requireCommonName Include the common name in the subject name.
       */
      override fun requireCommonName(requireCommonName: Boolean) {
        cdkBuilder.requireCommonName(requireCommonName)
      }

      /**
       * @param requireCommonName Include the common name in the subject name.
       */
      override fun requireCommonName(requireCommonName: IResolvable) {
        cdkBuilder.requireCommonName(requireCommonName.let(IResolvable::unwrap))
      }

      /**
       * @param requireDirectoryPath Include the directory path in the subject name.
       */
      override fun requireDirectoryPath(requireDirectoryPath: Boolean) {
        cdkBuilder.requireDirectoryPath(requireDirectoryPath)
      }

      /**
       * @param requireDirectoryPath Include the directory path in the subject name.
       */
      override fun requireDirectoryPath(requireDirectoryPath: IResolvable) {
        cdkBuilder.requireDirectoryPath(requireDirectoryPath.let(IResolvable::unwrap))
      }

      /**
       * @param requireDnsAsCn Include the DNS as common name in the subject name.
       */
      override fun requireDnsAsCn(requireDnsAsCn: Boolean) {
        cdkBuilder.requireDnsAsCn(requireDnsAsCn)
      }

      /**
       * @param requireDnsAsCn Include the DNS as common name in the subject name.
       */
      override fun requireDnsAsCn(requireDnsAsCn: IResolvable) {
        cdkBuilder.requireDnsAsCn(requireDnsAsCn.let(IResolvable::unwrap))
      }

      /**
       * @param requireEmail Include the subject's email in the subject name.
       */
      override fun requireEmail(requireEmail: Boolean) {
        cdkBuilder.requireEmail(requireEmail)
      }

      /**
       * @param requireEmail Include the subject's email in the subject name.
       */
      override fun requireEmail(requireEmail: IResolvable) {
        cdkBuilder.requireEmail(requireEmail.let(IResolvable::unwrap))
      }

      /**
       * @param sanRequireDirectoryGuid Include the globally unique identifier (GUID) in the subject
       * alternate name.
       */
      override fun sanRequireDirectoryGuid(sanRequireDirectoryGuid: Boolean) {
        cdkBuilder.sanRequireDirectoryGuid(sanRequireDirectoryGuid)
      }

      /**
       * @param sanRequireDirectoryGuid Include the globally unique identifier (GUID) in the subject
       * alternate name.
       */
      override fun sanRequireDirectoryGuid(sanRequireDirectoryGuid: IResolvable) {
        cdkBuilder.sanRequireDirectoryGuid(sanRequireDirectoryGuid.let(IResolvable::unwrap))
      }

      /**
       * @param sanRequireDns Include the DNS in the subject alternate name.
       */
      override fun sanRequireDns(sanRequireDns: Boolean) {
        cdkBuilder.sanRequireDns(sanRequireDns)
      }

      /**
       * @param sanRequireDns Include the DNS in the subject alternate name.
       */
      override fun sanRequireDns(sanRequireDns: IResolvable) {
        cdkBuilder.sanRequireDns(sanRequireDns.let(IResolvable::unwrap))
      }

      /**
       * @param sanRequireDomainDns Include the domain DNS in the subject alternate name.
       */
      override fun sanRequireDomainDns(sanRequireDomainDns: Boolean) {
        cdkBuilder.sanRequireDomainDns(sanRequireDomainDns)
      }

      /**
       * @param sanRequireDomainDns Include the domain DNS in the subject alternate name.
       */
      override fun sanRequireDomainDns(sanRequireDomainDns: IResolvable) {
        cdkBuilder.sanRequireDomainDns(sanRequireDomainDns.let(IResolvable::unwrap))
      }

      /**
       * @param sanRequireEmail Include the subject's email in the subject alternate name.
       */
      override fun sanRequireEmail(sanRequireEmail: Boolean) {
        cdkBuilder.sanRequireEmail(sanRequireEmail)
      }

      /**
       * @param sanRequireEmail Include the subject's email in the subject alternate name.
       */
      override fun sanRequireEmail(sanRequireEmail: IResolvable) {
        cdkBuilder.sanRequireEmail(sanRequireEmail.let(IResolvable::unwrap))
      }

      /**
       * @param sanRequireSpn Include the service principal name (SPN) in the subject alternate
       * name.
       */
      override fun sanRequireSpn(sanRequireSpn: Boolean) {
        cdkBuilder.sanRequireSpn(sanRequireSpn)
      }

      /**
       * @param sanRequireSpn Include the service principal name (SPN) in the subject alternate
       * name.
       */
      override fun sanRequireSpn(sanRequireSpn: IResolvable) {
        cdkBuilder.sanRequireSpn(sanRequireSpn.let(IResolvable::unwrap))
      }

      /**
       * @param sanRequireUpn Include the user principal name (UPN) in the subject alternate name.
       */
      override fun sanRequireUpn(sanRequireUpn: Boolean) {
        cdkBuilder.sanRequireUpn(sanRequireUpn)
      }

      /**
       * @param sanRequireUpn Include the user principal name (UPN) in the subject alternate name.
       */
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
      /**
       * Include the common name in the subject name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv3.html#cfn-pcaconnectorad-template-subjectnameflagsv3-requirecommonname)
       */
      override fun requireCommonName(): Any? = unwrap(this).getRequireCommonName()

      /**
       * Include the directory path in the subject name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv3.html#cfn-pcaconnectorad-template-subjectnameflagsv3-requiredirectorypath)
       */
      override fun requireDirectoryPath(): Any? = unwrap(this).getRequireDirectoryPath()

      /**
       * Include the DNS as common name in the subject name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv3.html#cfn-pcaconnectorad-template-subjectnameflagsv3-requirednsascn)
       */
      override fun requireDnsAsCn(): Any? = unwrap(this).getRequireDnsAsCn()

      /**
       * Include the subject's email in the subject name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv3.html#cfn-pcaconnectorad-template-subjectnameflagsv3-requireemail)
       */
      override fun requireEmail(): Any? = unwrap(this).getRequireEmail()

      /**
       * Include the globally unique identifier (GUID) in the subject alternate name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv3.html#cfn-pcaconnectorad-template-subjectnameflagsv3-sanrequiredirectoryguid)
       */
      override fun sanRequireDirectoryGuid(): Any? = unwrap(this).getSanRequireDirectoryGuid()

      /**
       * Include the DNS in the subject alternate name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv3.html#cfn-pcaconnectorad-template-subjectnameflagsv3-sanrequiredns)
       */
      override fun sanRequireDns(): Any? = unwrap(this).getSanRequireDns()

      /**
       * Include the domain DNS in the subject alternate name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv3.html#cfn-pcaconnectorad-template-subjectnameflagsv3-sanrequiredomaindns)
       */
      override fun sanRequireDomainDns(): Any? = unwrap(this).getSanRequireDomainDns()

      /**
       * Include the subject's email in the subject alternate name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv3.html#cfn-pcaconnectorad-template-subjectnameflagsv3-sanrequireemail)
       */
      override fun sanRequireEmail(): Any? = unwrap(this).getSanRequireEmail()

      /**
       * Include the service principal name (SPN) in the subject alternate name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv3.html#cfn-pcaconnectorad-template-subjectnameflagsv3-sanrequirespn)
       */
      override fun sanRequireSpn(): Any? = unwrap(this).getSanRequireSpn()

      /**
       * Include the user principal name (UPN) in the subject alternate name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-subjectnameflagsv3.html#cfn-pcaconnectorad-template-subjectnameflagsv3-sanrequireupn)
       */
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
    /**
     * Defines the minimum client compatibility.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyflagsv3.html#cfn-pcaconnectorad-template-privatekeyflagsv3-clientversion)
     */
    public fun clientVersion(): String

    /**
     * Allows the private key to be exported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyflagsv3.html#cfn-pcaconnectorad-template-privatekeyflagsv3-exportablekey)
     */
    public fun exportableKey(): Any? = unwrap(this).getExportableKey()

    /**
     * Reguires the PKCS #1 v2.1 signature format for certificates. You should verify that your CA,
     * objects, and applications can accept this signature format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyflagsv3.html#cfn-pcaconnectorad-template-privatekeyflagsv3-requirealternatesignaturealgorithm)
     */
    public fun requireAlternateSignatureAlgorithm(): Any? =
        unwrap(this).getRequireAlternateSignatureAlgorithm()

    /**
     * Requirer user input when using the private key for enrollment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyflagsv3.html#cfn-pcaconnectorad-template-privatekeyflagsv3-strongkeyprotectionrequired)
     */
    public fun strongKeyProtectionRequired(): Any? = unwrap(this).getStrongKeyProtectionRequired()

    /**
     * A builder for [PrivateKeyFlagsV3Property]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param clientVersion Defines the minimum client compatibility. 
       */
      public fun clientVersion(clientVersion: String)

      /**
       * @param exportableKey Allows the private key to be exported.
       */
      public fun exportableKey(exportableKey: Boolean)

      /**
       * @param exportableKey Allows the private key to be exported.
       */
      public fun exportableKey(exportableKey: IResolvable)

      /**
       * @param requireAlternateSignatureAlgorithm Reguires the PKCS #1 v2.1 signature format for
       * certificates. You should verify that your CA, objects, and applications can accept this
       * signature format.
       */
      public fun requireAlternateSignatureAlgorithm(requireAlternateSignatureAlgorithm: Boolean)

      /**
       * @param requireAlternateSignatureAlgorithm Reguires the PKCS #1 v2.1 signature format for
       * certificates. You should verify that your CA, objects, and applications can accept this
       * signature format.
       */
      public fun requireAlternateSignatureAlgorithm(requireAlternateSignatureAlgorithm: IResolvable)

      /**
       * @param strongKeyProtectionRequired Requirer user input when using the private key for
       * enrollment.
       */
      public fun strongKeyProtectionRequired(strongKeyProtectionRequired: Boolean)

      /**
       * @param strongKeyProtectionRequired Requirer user input when using the private key for
       * enrollment.
       */
      public fun strongKeyProtectionRequired(strongKeyProtectionRequired: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyFlagsV3Property.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyFlagsV3Property.builder()

      /**
       * @param clientVersion Defines the minimum client compatibility. 
       */
      override fun clientVersion(clientVersion: String) {
        cdkBuilder.clientVersion(clientVersion)
      }

      /**
       * @param exportableKey Allows the private key to be exported.
       */
      override fun exportableKey(exportableKey: Boolean) {
        cdkBuilder.exportableKey(exportableKey)
      }

      /**
       * @param exportableKey Allows the private key to be exported.
       */
      override fun exportableKey(exportableKey: IResolvable) {
        cdkBuilder.exportableKey(exportableKey.let(IResolvable::unwrap))
      }

      /**
       * @param requireAlternateSignatureAlgorithm Reguires the PKCS #1 v2.1 signature format for
       * certificates. You should verify that your CA, objects, and applications can accept this
       * signature format.
       */
      override fun requireAlternateSignatureAlgorithm(requireAlternateSignatureAlgorithm: Boolean) {
        cdkBuilder.requireAlternateSignatureAlgorithm(requireAlternateSignatureAlgorithm)
      }

      /**
       * @param requireAlternateSignatureAlgorithm Reguires the PKCS #1 v2.1 signature format for
       * certificates. You should verify that your CA, objects, and applications can accept this
       * signature format.
       */
      override
          fun requireAlternateSignatureAlgorithm(requireAlternateSignatureAlgorithm: IResolvable) {
        cdkBuilder.requireAlternateSignatureAlgorithm(requireAlternateSignatureAlgorithm.let(IResolvable::unwrap))
      }

      /**
       * @param strongKeyProtectionRequired Requirer user input when using the private key for
       * enrollment.
       */
      override fun strongKeyProtectionRequired(strongKeyProtectionRequired: Boolean) {
        cdkBuilder.strongKeyProtectionRequired(strongKeyProtectionRequired)
      }

      /**
       * @param strongKeyProtectionRequired Requirer user input when using the private key for
       * enrollment.
       */
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
      /**
       * Defines the minimum client compatibility.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyflagsv3.html#cfn-pcaconnectorad-template-privatekeyflagsv3-clientversion)
       */
      override fun clientVersion(): String = unwrap(this).getClientVersion()

      /**
       * Allows the private key to be exported.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyflagsv3.html#cfn-pcaconnectorad-template-privatekeyflagsv3-exportablekey)
       */
      override fun exportableKey(): Any? = unwrap(this).getExportableKey()

      /**
       * Reguires the PKCS #1 v2.1 signature format for certificates. You should verify that your
       * CA, objects, and applications can accept this signature format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyflagsv3.html#cfn-pcaconnectorad-template-privatekeyflagsv3-requirealternatesignaturealgorithm)
       */
      override fun requireAlternateSignatureAlgorithm(): Any? =
          unwrap(this).getRequireAlternateSignatureAlgorithm()

      /**
       * Requirer user input when using the private key for enrollment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyflagsv3.html#cfn-pcaconnectorad-template-privatekeyflagsv3-strongkeyprotectionrequired)
       */
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
    /**
     * Defines the minimum client compatibility.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyflagsv2.html#cfn-pcaconnectorad-template-privatekeyflagsv2-clientversion)
     */
    public fun clientVersion(): String

    /**
     * Allows the private key to be exported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyflagsv2.html#cfn-pcaconnectorad-template-privatekeyflagsv2-exportablekey)
     */
    public fun exportableKey(): Any? = unwrap(this).getExportableKey()

    /**
     * Require user input when using the private key for enrollment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyflagsv2.html#cfn-pcaconnectorad-template-privatekeyflagsv2-strongkeyprotectionrequired)
     */
    public fun strongKeyProtectionRequired(): Any? = unwrap(this).getStrongKeyProtectionRequired()

    /**
     * A builder for [PrivateKeyFlagsV2Property]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param clientVersion Defines the minimum client compatibility. 
       */
      public fun clientVersion(clientVersion: String)

      /**
       * @param exportableKey Allows the private key to be exported.
       */
      public fun exportableKey(exportableKey: Boolean)

      /**
       * @param exportableKey Allows the private key to be exported.
       */
      public fun exportableKey(exportableKey: IResolvable)

      /**
       * @param strongKeyProtectionRequired Require user input when using the private key for
       * enrollment.
       */
      public fun strongKeyProtectionRequired(strongKeyProtectionRequired: Boolean)

      /**
       * @param strongKeyProtectionRequired Require user input when using the private key for
       * enrollment.
       */
      public fun strongKeyProtectionRequired(strongKeyProtectionRequired: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyFlagsV2Property.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyFlagsV2Property.builder()

      /**
       * @param clientVersion Defines the minimum client compatibility. 
       */
      override fun clientVersion(clientVersion: String) {
        cdkBuilder.clientVersion(clientVersion)
      }

      /**
       * @param exportableKey Allows the private key to be exported.
       */
      override fun exportableKey(exportableKey: Boolean) {
        cdkBuilder.exportableKey(exportableKey)
      }

      /**
       * @param exportableKey Allows the private key to be exported.
       */
      override fun exportableKey(exportableKey: IResolvable) {
        cdkBuilder.exportableKey(exportableKey.let(IResolvable::unwrap))
      }

      /**
       * @param strongKeyProtectionRequired Require user input when using the private key for
       * enrollment.
       */
      override fun strongKeyProtectionRequired(strongKeyProtectionRequired: Boolean) {
        cdkBuilder.strongKeyProtectionRequired(strongKeyProtectionRequired)
      }

      /**
       * @param strongKeyProtectionRequired Require user input when using the private key for
       * enrollment.
       */
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
      /**
       * Defines the minimum client compatibility.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyflagsv2.html#cfn-pcaconnectorad-template-privatekeyflagsv2-clientversion)
       */
      override fun clientVersion(): String = unwrap(this).getClientVersion()

      /**
       * Allows the private key to be exported.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyflagsv2.html#cfn-pcaconnectorad-template-privatekeyflagsv2-exportablekey)
       */
      override fun exportableKey(): Any? = unwrap(this).getExportableKey()

      /**
       * Require user input when using the private key for enrollment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyflagsv2.html#cfn-pcaconnectorad-template-privatekeyflagsv2-strongkeyprotectionrequired)
       */
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
    /**
     * Allow renewal using the same key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-enrollmentflagsv4.html#cfn-pcaconnectorad-template-enrollmentflagsv4-enablekeyreuseonnttokenkeysetstoragefull)
     */
    public fun enableKeyReuseOnNtTokenKeysetStorageFull(): Any? =
        unwrap(this).getEnableKeyReuseOnNtTokenKeysetStorageFull()

    /**
     * Include symmetric algorithms allowed by the subject.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-enrollmentflagsv4.html#cfn-pcaconnectorad-template-enrollmentflagsv4-includesymmetricalgorithms)
     */
    public fun includeSymmetricAlgorithms(): Any? = unwrap(this).getIncludeSymmetricAlgorithms()

    /**
     * This flag instructs the CA to not include the security extension szOID_NTDS_CA_SECURITY_EXT
     * (OID:1.3.6.1.4.1.311.25.2), as specified in [MS-WCCE] sections 2.2.2.7.7.4 and
     * 3.2.2.6.2.1.4.5.9, in the issued certificate. This addresses a Windows Kerberos
     * elevation-of-privilege vulnerability.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-enrollmentflagsv4.html#cfn-pcaconnectorad-template-enrollmentflagsv4-nosecurityextension)
     */
    public fun noSecurityExtension(): Any? = unwrap(this).getNoSecurityExtension()

    /**
     * Delete expired or revoked certificates instead of archiving them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-enrollmentflagsv4.html#cfn-pcaconnectorad-template-enrollmentflagsv4-removeinvalidcertificatefrompersonalstore)
     */
    public fun removeInvalidCertificateFromPersonalStore(): Any? =
        unwrap(this).getRemoveInvalidCertificateFromPersonalStore()

    /**
     * Require user interaction when the subject is enrolled and the private key associated with the
     * certificate is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-enrollmentflagsv4.html#cfn-pcaconnectorad-template-enrollmentflagsv4-userinteractionrequired)
     */
    public fun userInteractionRequired(): Any? = unwrap(this).getUserInteractionRequired()

    /**
     * A builder for [EnrollmentFlagsV4Property]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enableKeyReuseOnNtTokenKeysetStorageFull Allow renewal using the same key.
       */
      public
          fun enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull: Boolean)

      /**
       * @param enableKeyReuseOnNtTokenKeysetStorageFull Allow renewal using the same key.
       */
      public
          fun enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull: IResolvable)

      /**
       * @param includeSymmetricAlgorithms Include symmetric algorithms allowed by the subject.
       */
      public fun includeSymmetricAlgorithms(includeSymmetricAlgorithms: Boolean)

      /**
       * @param includeSymmetricAlgorithms Include symmetric algorithms allowed by the subject.
       */
      public fun includeSymmetricAlgorithms(includeSymmetricAlgorithms: IResolvable)

      /**
       * @param noSecurityExtension This flag instructs the CA to not include the security extension
       * szOID_NTDS_CA_SECURITY_EXT (OID:1.3.6.1.4.1.311.25.2), as specified in [MS-WCCE] sections
       * 2.2.2.7.7.4 and 3.2.2.6.2.1.4.5.9, in the issued certificate. This addresses a Windows
       * Kerberos elevation-of-privilege vulnerability.
       */
      public fun noSecurityExtension(noSecurityExtension: Boolean)

      /**
       * @param noSecurityExtension This flag instructs the CA to not include the security extension
       * szOID_NTDS_CA_SECURITY_EXT (OID:1.3.6.1.4.1.311.25.2), as specified in [MS-WCCE] sections
       * 2.2.2.7.7.4 and 3.2.2.6.2.1.4.5.9, in the issued certificate. This addresses a Windows
       * Kerberos elevation-of-privilege vulnerability.
       */
      public fun noSecurityExtension(noSecurityExtension: IResolvable)

      /**
       * @param removeInvalidCertificateFromPersonalStore Delete expired or revoked certificates
       * instead of archiving them.
       */
      public
          fun removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore: Boolean)

      /**
       * @param removeInvalidCertificateFromPersonalStore Delete expired or revoked certificates
       * instead of archiving them.
       */
      public
          fun removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore: IResolvable)

      /**
       * @param userInteractionRequired Require user interaction when the subject is enrolled and
       * the private key associated with the certificate is used.
       */
      public fun userInteractionRequired(userInteractionRequired: Boolean)

      /**
       * @param userInteractionRequired Require user interaction when the subject is enrolled and
       * the private key associated with the certificate is used.
       */
      public fun userInteractionRequired(userInteractionRequired: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.EnrollmentFlagsV4Property.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.EnrollmentFlagsV4Property.builder()

      /**
       * @param enableKeyReuseOnNtTokenKeysetStorageFull Allow renewal using the same key.
       */
      override
          fun enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull: Boolean) {
        cdkBuilder.enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull)
      }

      /**
       * @param enableKeyReuseOnNtTokenKeysetStorageFull Allow renewal using the same key.
       */
      override
          fun enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull: IResolvable) {
        cdkBuilder.enableKeyReuseOnNtTokenKeysetStorageFull(enableKeyReuseOnNtTokenKeysetStorageFull.let(IResolvable::unwrap))
      }

      /**
       * @param includeSymmetricAlgorithms Include symmetric algorithms allowed by the subject.
       */
      override fun includeSymmetricAlgorithms(includeSymmetricAlgorithms: Boolean) {
        cdkBuilder.includeSymmetricAlgorithms(includeSymmetricAlgorithms)
      }

      /**
       * @param includeSymmetricAlgorithms Include symmetric algorithms allowed by the subject.
       */
      override fun includeSymmetricAlgorithms(includeSymmetricAlgorithms: IResolvable) {
        cdkBuilder.includeSymmetricAlgorithms(includeSymmetricAlgorithms.let(IResolvable::unwrap))
      }

      /**
       * @param noSecurityExtension This flag instructs the CA to not include the security extension
       * szOID_NTDS_CA_SECURITY_EXT (OID:1.3.6.1.4.1.311.25.2), as specified in [MS-WCCE] sections
       * 2.2.2.7.7.4 and 3.2.2.6.2.1.4.5.9, in the issued certificate. This addresses a Windows
       * Kerberos elevation-of-privilege vulnerability.
       */
      override fun noSecurityExtension(noSecurityExtension: Boolean) {
        cdkBuilder.noSecurityExtension(noSecurityExtension)
      }

      /**
       * @param noSecurityExtension This flag instructs the CA to not include the security extension
       * szOID_NTDS_CA_SECURITY_EXT (OID:1.3.6.1.4.1.311.25.2), as specified in [MS-WCCE] sections
       * 2.2.2.7.7.4 and 3.2.2.6.2.1.4.5.9, in the issued certificate. This addresses a Windows
       * Kerberos elevation-of-privilege vulnerability.
       */
      override fun noSecurityExtension(noSecurityExtension: IResolvable) {
        cdkBuilder.noSecurityExtension(noSecurityExtension.let(IResolvable::unwrap))
      }

      /**
       * @param removeInvalidCertificateFromPersonalStore Delete expired or revoked certificates
       * instead of archiving them.
       */
      override
          fun removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore: Boolean) {
        cdkBuilder.removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore)
      }

      /**
       * @param removeInvalidCertificateFromPersonalStore Delete expired or revoked certificates
       * instead of archiving them.
       */
      override
          fun removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore: IResolvable) {
        cdkBuilder.removeInvalidCertificateFromPersonalStore(removeInvalidCertificateFromPersonalStore.let(IResolvable::unwrap))
      }

      /**
       * @param userInteractionRequired Require user interaction when the subject is enrolled and
       * the private key associated with the certificate is used.
       */
      override fun userInteractionRequired(userInteractionRequired: Boolean) {
        cdkBuilder.userInteractionRequired(userInteractionRequired)
      }

      /**
       * @param userInteractionRequired Require user interaction when the subject is enrolled and
       * the private key associated with the certificate is used.
       */
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
      /**
       * Allow renewal using the same key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-enrollmentflagsv4.html#cfn-pcaconnectorad-template-enrollmentflagsv4-enablekeyreuseonnttokenkeysetstoragefull)
       */
      override fun enableKeyReuseOnNtTokenKeysetStorageFull(): Any? =
          unwrap(this).getEnableKeyReuseOnNtTokenKeysetStorageFull()

      /**
       * Include symmetric algorithms allowed by the subject.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-enrollmentflagsv4.html#cfn-pcaconnectorad-template-enrollmentflagsv4-includesymmetricalgorithms)
       */
      override fun includeSymmetricAlgorithms(): Any? = unwrap(this).getIncludeSymmetricAlgorithms()

      /**
       * This flag instructs the CA to not include the security extension szOID_NTDS_CA_SECURITY_EXT
       * (OID:1.3.6.1.4.1.311.25.2), as specified in [MS-WCCE] sections 2.2.2.7.7.4 and
       * 3.2.2.6.2.1.4.5.9, in the issued certificate. This addresses a Windows Kerberos
       * elevation-of-privilege vulnerability.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-enrollmentflagsv4.html#cfn-pcaconnectorad-template-enrollmentflagsv4-nosecurityextension)
       */
      override fun noSecurityExtension(): Any? = unwrap(this).getNoSecurityExtension()

      /**
       * Delete expired or revoked certificates instead of archiving them.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-enrollmentflagsv4.html#cfn-pcaconnectorad-template-enrollmentflagsv4-removeinvalidcertificatefrompersonalstore)
       */
      override fun removeInvalidCertificateFromPersonalStore(): Any? =
          unwrap(this).getRemoveInvalidCertificateFromPersonalStore()

      /**
       * Require user interaction when the subject is enrolled and the private key associated with
       * the certificate is used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-enrollmentflagsv4.html#cfn-pcaconnectorad-template-enrollmentflagsv4-userinteractionrequired)
       */
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
    /**
     * Allows certificate issuance using autoenrollment.
     *
     * Set to TRUE to allow autoenrollment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-generalflagsv2.html#cfn-pcaconnectorad-template-generalflagsv2-autoenrollment)
     */
    public fun autoEnrollment(): Any? = unwrap(this).getAutoEnrollment()

    /**
     * Defines if the template is for machines or users.
     *
     * Set to TRUE if the template is for machines. Set to FALSE if the template is for users.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-generalflagsv2.html#cfn-pcaconnectorad-template-generalflagsv2-machinetype)
     */
    public fun machineType(): Any? = unwrap(this).getMachineType()

    /**
     * A builder for [GeneralFlagsV2Property]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param autoEnrollment Allows certificate issuance using autoenrollment.
       * Set to TRUE to allow autoenrollment.
       */
      public fun autoEnrollment(autoEnrollment: Boolean)

      /**
       * @param autoEnrollment Allows certificate issuance using autoenrollment.
       * Set to TRUE to allow autoenrollment.
       */
      public fun autoEnrollment(autoEnrollment: IResolvable)

      /**
       * @param machineType Defines if the template is for machines or users.
       * Set to TRUE if the template is for machines. Set to FALSE if the template is for users.
       */
      public fun machineType(machineType: Boolean)

      /**
       * @param machineType Defines if the template is for machines or users.
       * Set to TRUE if the template is for machines. Set to FALSE if the template is for users.
       */
      public fun machineType(machineType: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.GeneralFlagsV2Property.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.GeneralFlagsV2Property.builder()

      /**
       * @param autoEnrollment Allows certificate issuance using autoenrollment.
       * Set to TRUE to allow autoenrollment.
       */
      override fun autoEnrollment(autoEnrollment: Boolean) {
        cdkBuilder.autoEnrollment(autoEnrollment)
      }

      /**
       * @param autoEnrollment Allows certificate issuance using autoenrollment.
       * Set to TRUE to allow autoenrollment.
       */
      override fun autoEnrollment(autoEnrollment: IResolvable) {
        cdkBuilder.autoEnrollment(autoEnrollment.let(IResolvable::unwrap))
      }

      /**
       * @param machineType Defines if the template is for machines or users.
       * Set to TRUE if the template is for machines. Set to FALSE if the template is for users.
       */
      override fun machineType(machineType: Boolean) {
        cdkBuilder.machineType(machineType)
      }

      /**
       * @param machineType Defines if the template is for machines or users.
       * Set to TRUE if the template is for machines. Set to FALSE if the template is for users.
       */
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
      /**
       * Allows certificate issuance using autoenrollment.
       *
       * Set to TRUE to allow autoenrollment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-generalflagsv2.html#cfn-pcaconnectorad-template-generalflagsv2-autoenrollment)
       */
      override fun autoEnrollment(): Any? = unwrap(this).getAutoEnrollment()

      /**
       * Defines if the template is for machines or users.
       *
       * Set to TRUE if the template is for machines. Set to FALSE if the template is for users.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-generalflagsv2.html#cfn-pcaconnectorad-template-generalflagsv2-machinetype)
       */
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
    /**
     * Certificate validity describes the validity and renewal periods of a certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev4.html#cfn-pcaconnectorad-template-templatev4-certificatevalidity)
     */
    public fun certificateValidity(): Any

    /**
     * Enrollment flags describe the enrollment settings for certificates using the existing private
     * key and deleting expired or revoked certificates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev4.html#cfn-pcaconnectorad-template-templatev4-enrollmentflags)
     */
    public fun enrollmentFlags(): Any

    /**
     * Extensions describe the key usage extensions and application policies for a template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev4.html#cfn-pcaconnectorad-template-templatev4-extensions)
     */
    public fun extensions(): Any

    /**
     * General flags describe whether the template is used for computers or users and if the
     * template can be used with autoenrollment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev4.html#cfn-pcaconnectorad-template-templatev4-generalflags)
     */
    public fun generalFlags(): Any

    /**
     * Specifies the hash algorithm used to hash the private key.
     *
     * Hash algorithm can only be specified when using Key Storage Providers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev4.html#cfn-pcaconnectorad-template-templatev4-hashalgorithm)
     */
    public fun hashAlgorithm(): String? = unwrap(this).getHashAlgorithm()

    /**
     * Private key attributes allow you to specify the minimal key length, key spec, key usage, and
     * cryptographic providers for the private key of a certificate for v4 templates.
     *
     * V4 templates allow you to use either Key Storage Providers or Legacy Cryptographic Service
     * Providers. You specify the cryptography provider category in private key flags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev4.html#cfn-pcaconnectorad-template-templatev4-privatekeyattributes)
     */
    public fun privateKeyAttributes(): Any

    /**
     * Private key flags for v4 templates specify the client compatibility, if the private key can
     * be exported, if user input is required when using a private key, if an alternate signature
     * algorithm should be used, and if certificates are renewed using the same private key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev4.html#cfn-pcaconnectorad-template-templatev4-privatekeyflags)
     */
    public fun privateKeyFlags(): Any

    /**
     * Subject name flags describe the subject name and subject alternate name that is included in a
     * certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev4.html#cfn-pcaconnectorad-template-templatev4-subjectnameflags)
     */
    public fun subjectNameFlags(): Any

    /**
     * List of templates in Active Directory that are superseded by this template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev4.html#cfn-pcaconnectorad-template-templatev4-supersededtemplates)
     */
    public fun supersededTemplates(): List<String> = unwrap(this).getSupersededTemplates() ?:
        emptyList()

    /**
     * A builder for [TemplateV4Property]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param certificateValidity Certificate validity describes the validity and renewal periods
       * of a certificate. 
       */
      public fun certificateValidity(certificateValidity: IResolvable)

      /**
       * @param certificateValidity Certificate validity describes the validity and renewal periods
       * of a certificate. 
       */
      public fun certificateValidity(certificateValidity: CertificateValidityProperty)

      /**
       * @param certificateValidity Certificate validity describes the validity and renewal periods
       * of a certificate. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("55dd8886fc4c9948f8aa99716fca4040366000833355877e601984221f778f4e")
      public
          fun certificateValidity(certificateValidity: CertificateValidityProperty.Builder.() -> Unit)

      /**
       * @param enrollmentFlags Enrollment flags describe the enrollment settings for certificates
       * using the existing private key and deleting expired or revoked certificates. 
       */
      public fun enrollmentFlags(enrollmentFlags: IResolvable)

      /**
       * @param enrollmentFlags Enrollment flags describe the enrollment settings for certificates
       * using the existing private key and deleting expired or revoked certificates. 
       */
      public fun enrollmentFlags(enrollmentFlags: EnrollmentFlagsV4Property)

      /**
       * @param enrollmentFlags Enrollment flags describe the enrollment settings for certificates
       * using the existing private key and deleting expired or revoked certificates. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d51914c61b8f44a21a9a22e35001e6c0c694326a9d9131492a526e81ca0a49a3")
      public fun enrollmentFlags(enrollmentFlags: EnrollmentFlagsV4Property.Builder.() -> Unit)

      /**
       * @param extensions Extensions describe the key usage extensions and application policies for
       * a template. 
       */
      public fun extensions(extensions: IResolvable)

      /**
       * @param extensions Extensions describe the key usage extensions and application policies for
       * a template. 
       */
      public fun extensions(extensions: ExtensionsV4Property)

      /**
       * @param extensions Extensions describe the key usage extensions and application policies for
       * a template. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0a63a09053edb0fe5c88cc378c47555e4c8b13312e68297cc01e6bf85b458588")
      public fun extensions(extensions: ExtensionsV4Property.Builder.() -> Unit)

      /**
       * @param generalFlags General flags describe whether the template is used for computers or
       * users and if the template can be used with autoenrollment. 
       */
      public fun generalFlags(generalFlags: IResolvable)

      /**
       * @param generalFlags General flags describe whether the template is used for computers or
       * users and if the template can be used with autoenrollment. 
       */
      public fun generalFlags(generalFlags: GeneralFlagsV4Property)

      /**
       * @param generalFlags General flags describe whether the template is used for computers or
       * users and if the template can be used with autoenrollment. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("80c2c7feaa734b88333c5a09f8ed2ab4625a9dc2d0bfd63f47ee74feba72ae97")
      public fun generalFlags(generalFlags: GeneralFlagsV4Property.Builder.() -> Unit)

      /**
       * @param hashAlgorithm Specifies the hash algorithm used to hash the private key.
       * Hash algorithm can only be specified when using Key Storage Providers.
       */
      public fun hashAlgorithm(hashAlgorithm: String)

      /**
       * @param privateKeyAttributes Private key attributes allow you to specify the minimal key
       * length, key spec, key usage, and cryptographic providers for the private key of a certificate
       * for v4 templates. 
       * V4 templates allow you to use either Key Storage Providers or Legacy Cryptographic Service
       * Providers. You specify the cryptography provider category in private key flags.
       */
      public fun privateKeyAttributes(privateKeyAttributes: IResolvable)

      /**
       * @param privateKeyAttributes Private key attributes allow you to specify the minimal key
       * length, key spec, key usage, and cryptographic providers for the private key of a certificate
       * for v4 templates. 
       * V4 templates allow you to use either Key Storage Providers or Legacy Cryptographic Service
       * Providers. You specify the cryptography provider category in private key flags.
       */
      public fun privateKeyAttributes(privateKeyAttributes: PrivateKeyAttributesV4Property)

      /**
       * @param privateKeyAttributes Private key attributes allow you to specify the minimal key
       * length, key spec, key usage, and cryptographic providers for the private key of a certificate
       * for v4 templates. 
       * V4 templates allow you to use either Key Storage Providers or Legacy Cryptographic Service
       * Providers. You specify the cryptography provider category in private key flags.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e5fdb8ab909b7abf3d0405077de5868673cea833a48d9786672c9c8ccf972267")
      public
          fun privateKeyAttributes(privateKeyAttributes: PrivateKeyAttributesV4Property.Builder.() -> Unit)

      /**
       * @param privateKeyFlags Private key flags for v4 templates specify the client compatibility,
       * if the private key can be exported, if user input is required when using a private key, if an
       * alternate signature algorithm should be used, and if certificates are renewed using the same
       * private key. 
       */
      public fun privateKeyFlags(privateKeyFlags: IResolvable)

      /**
       * @param privateKeyFlags Private key flags for v4 templates specify the client compatibility,
       * if the private key can be exported, if user input is required when using a private key, if an
       * alternate signature algorithm should be used, and if certificates are renewed using the same
       * private key. 
       */
      public fun privateKeyFlags(privateKeyFlags: PrivateKeyFlagsV4Property)

      /**
       * @param privateKeyFlags Private key flags for v4 templates specify the client compatibility,
       * if the private key can be exported, if user input is required when using a private key, if an
       * alternate signature algorithm should be used, and if certificates are renewed using the same
       * private key. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("87e0334fce042b80678ea7decf78aae0e4ef5fc1969d92f39affe94d6a863693")
      public fun privateKeyFlags(privateKeyFlags: PrivateKeyFlagsV4Property.Builder.() -> Unit)

      /**
       * @param subjectNameFlags Subject name flags describe the subject name and subject alternate
       * name that is included in a certificate. 
       */
      public fun subjectNameFlags(subjectNameFlags: IResolvable)

      /**
       * @param subjectNameFlags Subject name flags describe the subject name and subject alternate
       * name that is included in a certificate. 
       */
      public fun subjectNameFlags(subjectNameFlags: SubjectNameFlagsV4Property)

      /**
       * @param subjectNameFlags Subject name flags describe the subject name and subject alternate
       * name that is included in a certificate. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ab6eca7ccc213d5db4890825ad29953086900441d71d217ea45feb46d6ad1f9")
      public fun subjectNameFlags(subjectNameFlags: SubjectNameFlagsV4Property.Builder.() -> Unit)

      /**
       * @param supersededTemplates List of templates in Active Directory that are superseded by
       * this template.
       */
      public fun supersededTemplates(supersededTemplates: List<String>)

      /**
       * @param supersededTemplates List of templates in Active Directory that are superseded by
       * this template.
       */
      public fun supersededTemplates(vararg supersededTemplates: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateV4Property.Builder =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.TemplateV4Property.builder()

      /**
       * @param certificateValidity Certificate validity describes the validity and renewal periods
       * of a certificate. 
       */
      override fun certificateValidity(certificateValidity: IResolvable) {
        cdkBuilder.certificateValidity(certificateValidity.let(IResolvable::unwrap))
      }

      /**
       * @param certificateValidity Certificate validity describes the validity and renewal periods
       * of a certificate. 
       */
      override fun certificateValidity(certificateValidity: CertificateValidityProperty) {
        cdkBuilder.certificateValidity(certificateValidity.let(CertificateValidityProperty::unwrap))
      }

      /**
       * @param certificateValidity Certificate validity describes the validity and renewal periods
       * of a certificate. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("55dd8886fc4c9948f8aa99716fca4040366000833355877e601984221f778f4e")
      override
          fun certificateValidity(certificateValidity: CertificateValidityProperty.Builder.() -> Unit):
          Unit = certificateValidity(CertificateValidityProperty(certificateValidity))

      /**
       * @param enrollmentFlags Enrollment flags describe the enrollment settings for certificates
       * using the existing private key and deleting expired or revoked certificates. 
       */
      override fun enrollmentFlags(enrollmentFlags: IResolvable) {
        cdkBuilder.enrollmentFlags(enrollmentFlags.let(IResolvable::unwrap))
      }

      /**
       * @param enrollmentFlags Enrollment flags describe the enrollment settings for certificates
       * using the existing private key and deleting expired or revoked certificates. 
       */
      override fun enrollmentFlags(enrollmentFlags: EnrollmentFlagsV4Property) {
        cdkBuilder.enrollmentFlags(enrollmentFlags.let(EnrollmentFlagsV4Property::unwrap))
      }

      /**
       * @param enrollmentFlags Enrollment flags describe the enrollment settings for certificates
       * using the existing private key and deleting expired or revoked certificates. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d51914c61b8f44a21a9a22e35001e6c0c694326a9d9131492a526e81ca0a49a3")
      override fun enrollmentFlags(enrollmentFlags: EnrollmentFlagsV4Property.Builder.() -> Unit):
          Unit = enrollmentFlags(EnrollmentFlagsV4Property(enrollmentFlags))

      /**
       * @param extensions Extensions describe the key usage extensions and application policies for
       * a template. 
       */
      override fun extensions(extensions: IResolvable) {
        cdkBuilder.extensions(extensions.let(IResolvable::unwrap))
      }

      /**
       * @param extensions Extensions describe the key usage extensions and application policies for
       * a template. 
       */
      override fun extensions(extensions: ExtensionsV4Property) {
        cdkBuilder.extensions(extensions.let(ExtensionsV4Property::unwrap))
      }

      /**
       * @param extensions Extensions describe the key usage extensions and application policies for
       * a template. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0a63a09053edb0fe5c88cc378c47555e4c8b13312e68297cc01e6bf85b458588")
      override fun extensions(extensions: ExtensionsV4Property.Builder.() -> Unit): Unit =
          extensions(ExtensionsV4Property(extensions))

      /**
       * @param generalFlags General flags describe whether the template is used for computers or
       * users and if the template can be used with autoenrollment. 
       */
      override fun generalFlags(generalFlags: IResolvable) {
        cdkBuilder.generalFlags(generalFlags.let(IResolvable::unwrap))
      }

      /**
       * @param generalFlags General flags describe whether the template is used for computers or
       * users and if the template can be used with autoenrollment. 
       */
      override fun generalFlags(generalFlags: GeneralFlagsV4Property) {
        cdkBuilder.generalFlags(generalFlags.let(GeneralFlagsV4Property::unwrap))
      }

      /**
       * @param generalFlags General flags describe whether the template is used for computers or
       * users and if the template can be used with autoenrollment. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("80c2c7feaa734b88333c5a09f8ed2ab4625a9dc2d0bfd63f47ee74feba72ae97")
      override fun generalFlags(generalFlags: GeneralFlagsV4Property.Builder.() -> Unit): Unit =
          generalFlags(GeneralFlagsV4Property(generalFlags))

      /**
       * @param hashAlgorithm Specifies the hash algorithm used to hash the private key.
       * Hash algorithm can only be specified when using Key Storage Providers.
       */
      override fun hashAlgorithm(hashAlgorithm: String) {
        cdkBuilder.hashAlgorithm(hashAlgorithm)
      }

      /**
       * @param privateKeyAttributes Private key attributes allow you to specify the minimal key
       * length, key spec, key usage, and cryptographic providers for the private key of a certificate
       * for v4 templates. 
       * V4 templates allow you to use either Key Storage Providers or Legacy Cryptographic Service
       * Providers. You specify the cryptography provider category in private key flags.
       */
      override fun privateKeyAttributes(privateKeyAttributes: IResolvable) {
        cdkBuilder.privateKeyAttributes(privateKeyAttributes.let(IResolvable::unwrap))
      }

      /**
       * @param privateKeyAttributes Private key attributes allow you to specify the minimal key
       * length, key spec, key usage, and cryptographic providers for the private key of a certificate
       * for v4 templates. 
       * V4 templates allow you to use either Key Storage Providers or Legacy Cryptographic Service
       * Providers. You specify the cryptography provider category in private key flags.
       */
      override fun privateKeyAttributes(privateKeyAttributes: PrivateKeyAttributesV4Property) {
        cdkBuilder.privateKeyAttributes(privateKeyAttributes.let(PrivateKeyAttributesV4Property::unwrap))
      }

      /**
       * @param privateKeyAttributes Private key attributes allow you to specify the minimal key
       * length, key spec, key usage, and cryptographic providers for the private key of a certificate
       * for v4 templates. 
       * V4 templates allow you to use either Key Storage Providers or Legacy Cryptographic Service
       * Providers. You specify the cryptography provider category in private key flags.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e5fdb8ab909b7abf3d0405077de5868673cea833a48d9786672c9c8ccf972267")
      override
          fun privateKeyAttributes(privateKeyAttributes: PrivateKeyAttributesV4Property.Builder.() -> Unit):
          Unit = privateKeyAttributes(PrivateKeyAttributesV4Property(privateKeyAttributes))

      /**
       * @param privateKeyFlags Private key flags for v4 templates specify the client compatibility,
       * if the private key can be exported, if user input is required when using a private key, if an
       * alternate signature algorithm should be used, and if certificates are renewed using the same
       * private key. 
       */
      override fun privateKeyFlags(privateKeyFlags: IResolvable) {
        cdkBuilder.privateKeyFlags(privateKeyFlags.let(IResolvable::unwrap))
      }

      /**
       * @param privateKeyFlags Private key flags for v4 templates specify the client compatibility,
       * if the private key can be exported, if user input is required when using a private key, if an
       * alternate signature algorithm should be used, and if certificates are renewed using the same
       * private key. 
       */
      override fun privateKeyFlags(privateKeyFlags: PrivateKeyFlagsV4Property) {
        cdkBuilder.privateKeyFlags(privateKeyFlags.let(PrivateKeyFlagsV4Property::unwrap))
      }

      /**
       * @param privateKeyFlags Private key flags for v4 templates specify the client compatibility,
       * if the private key can be exported, if user input is required when using a private key, if an
       * alternate signature algorithm should be used, and if certificates are renewed using the same
       * private key. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("87e0334fce042b80678ea7decf78aae0e4ef5fc1969d92f39affe94d6a863693")
      override fun privateKeyFlags(privateKeyFlags: PrivateKeyFlagsV4Property.Builder.() -> Unit):
          Unit = privateKeyFlags(PrivateKeyFlagsV4Property(privateKeyFlags))

      /**
       * @param subjectNameFlags Subject name flags describe the subject name and subject alternate
       * name that is included in a certificate. 
       */
      override fun subjectNameFlags(subjectNameFlags: IResolvable) {
        cdkBuilder.subjectNameFlags(subjectNameFlags.let(IResolvable::unwrap))
      }

      /**
       * @param subjectNameFlags Subject name flags describe the subject name and subject alternate
       * name that is included in a certificate. 
       */
      override fun subjectNameFlags(subjectNameFlags: SubjectNameFlagsV4Property) {
        cdkBuilder.subjectNameFlags(subjectNameFlags.let(SubjectNameFlagsV4Property::unwrap))
      }

      /**
       * @param subjectNameFlags Subject name flags describe the subject name and subject alternate
       * name that is included in a certificate. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ab6eca7ccc213d5db4890825ad29953086900441d71d217ea45feb46d6ad1f9")
      override
          fun subjectNameFlags(subjectNameFlags: SubjectNameFlagsV4Property.Builder.() -> Unit):
          Unit = subjectNameFlags(SubjectNameFlagsV4Property(subjectNameFlags))

      /**
       * @param supersededTemplates List of templates in Active Directory that are superseded by
       * this template.
       */
      override fun supersededTemplates(supersededTemplates: List<String>) {
        cdkBuilder.supersededTemplates(supersededTemplates)
      }

      /**
       * @param supersededTemplates List of templates in Active Directory that are superseded by
       * this template.
       */
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
      /**
       * Certificate validity describes the validity and renewal periods of a certificate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev4.html#cfn-pcaconnectorad-template-templatev4-certificatevalidity)
       */
      override fun certificateValidity(): Any = unwrap(this).getCertificateValidity()

      /**
       * Enrollment flags describe the enrollment settings for certificates using the existing
       * private key and deleting expired or revoked certificates.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev4.html#cfn-pcaconnectorad-template-templatev4-enrollmentflags)
       */
      override fun enrollmentFlags(): Any = unwrap(this).getEnrollmentFlags()

      /**
       * Extensions describe the key usage extensions and application policies for a template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev4.html#cfn-pcaconnectorad-template-templatev4-extensions)
       */
      override fun extensions(): Any = unwrap(this).getExtensions()

      /**
       * General flags describe whether the template is used for computers or users and if the
       * template can be used with autoenrollment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev4.html#cfn-pcaconnectorad-template-templatev4-generalflags)
       */
      override fun generalFlags(): Any = unwrap(this).getGeneralFlags()

      /**
       * Specifies the hash algorithm used to hash the private key.
       *
       * Hash algorithm can only be specified when using Key Storage Providers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev4.html#cfn-pcaconnectorad-template-templatev4-hashalgorithm)
       */
      override fun hashAlgorithm(): String? = unwrap(this).getHashAlgorithm()

      /**
       * Private key attributes allow you to specify the minimal key length, key spec, key usage,
       * and cryptographic providers for the private key of a certificate for v4 templates.
       *
       * V4 templates allow you to use either Key Storage Providers or Legacy Cryptographic Service
       * Providers. You specify the cryptography provider category in private key flags.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev4.html#cfn-pcaconnectorad-template-templatev4-privatekeyattributes)
       */
      override fun privateKeyAttributes(): Any = unwrap(this).getPrivateKeyAttributes()

      /**
       * Private key flags for v4 templates specify the client compatibility, if the private key can
       * be exported, if user input is required when using a private key, if an alternate signature
       * algorithm should be used, and if certificates are renewed using the same private key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev4.html#cfn-pcaconnectorad-template-templatev4-privatekeyflags)
       */
      override fun privateKeyFlags(): Any = unwrap(this).getPrivateKeyFlags()

      /**
       * Subject name flags describe the subject name and subject alternate name that is included in
       * a certificate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev4.html#cfn-pcaconnectorad-template-templatev4-subjectnameflags)
       */
      override fun subjectNameFlags(): Any = unwrap(this).getSubjectNameFlags()

      /**
       * List of templates in Active Directory that are superseded by this template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-templatev4.html#cfn-pcaconnectorad-template-templatev4-supersededtemplates)
       */
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
    /**
     * Renewal period is the period of time before certificate expiration when a new certificate
     * will be requested.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-certificatevalidity.html#cfn-pcaconnectorad-template-certificatevalidity-renewalperiod)
     */
    public fun renewalPeriod(): Any

    /**
     * Information describing the end of the validity period of the certificate.
     *
     * This parameter sets the “Not After” date for the certificate. Certificate validity is the
     * period of time during which a certificate is valid. Validity can be expressed as an explicit
     * date and time when the certificate expires, or as a span of time after issuance, stated in days,
     * months, or years. For more information, see Validity in RFC 5280. This value is unaffected when
     * ValidityNotBefore is also specified. For example, if Validity is set to 20 days in the future,
     * the certificate will expire 20 days from issuance time regardless of the ValidityNotBefore
     * value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-certificatevalidity.html#cfn-pcaconnectorad-template-certificatevalidity-validityperiod)
     */
    public fun validityPeriod(): Any

    /**
     * A builder for [CertificateValidityProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param renewalPeriod Renewal period is the period of time before certificate expiration
       * when a new certificate will be requested. 
       */
      public fun renewalPeriod(renewalPeriod: IResolvable)

      /**
       * @param renewalPeriod Renewal period is the period of time before certificate expiration
       * when a new certificate will be requested. 
       */
      public fun renewalPeriod(renewalPeriod: ValidityPeriodProperty)

      /**
       * @param renewalPeriod Renewal period is the period of time before certificate expiration
       * when a new certificate will be requested. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("074d06ca33d33e75e9aa8418600945d8d29663f6d1be76c0343c2cf70cff619c")
      public fun renewalPeriod(renewalPeriod: ValidityPeriodProperty.Builder.() -> Unit)

      /**
       * @param validityPeriod Information describing the end of the validity period of the
       * certificate. 
       * This parameter sets the “Not After” date for the certificate. Certificate validity is the
       * period of time during which a certificate is valid. Validity can be expressed as an explicit
       * date and time when the certificate expires, or as a span of time after issuance, stated in
       * days, months, or years. For more information, see Validity in RFC 5280. This value is
       * unaffected when ValidityNotBefore is also specified. For example, if Validity is set to 20
       * days in the future, the certificate will expire 20 days from issuance time regardless of the
       * ValidityNotBefore value.
       */
      public fun validityPeriod(validityPeriod: IResolvable)

      /**
       * @param validityPeriod Information describing the end of the validity period of the
       * certificate. 
       * This parameter sets the “Not After” date for the certificate. Certificate validity is the
       * period of time during which a certificate is valid. Validity can be expressed as an explicit
       * date and time when the certificate expires, or as a span of time after issuance, stated in
       * days, months, or years. For more information, see Validity in RFC 5280. This value is
       * unaffected when ValidityNotBefore is also specified. For example, if Validity is set to 20
       * days in the future, the certificate will expire 20 days from issuance time regardless of the
       * ValidityNotBefore value.
       */
      public fun validityPeriod(validityPeriod: ValidityPeriodProperty)

      /**
       * @param validityPeriod Information describing the end of the validity period of the
       * certificate. 
       * This parameter sets the “Not After” date for the certificate. Certificate validity is the
       * period of time during which a certificate is valid. Validity can be expressed as an explicit
       * date and time when the certificate expires, or as a span of time after issuance, stated in
       * days, months, or years. For more information, see Validity in RFC 5280. This value is
       * unaffected when ValidityNotBefore is also specified. For example, if Validity is set to 20
       * days in the future, the certificate will expire 20 days from issuance time regardless of the
       * ValidityNotBefore value.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("762e9ab84bc09a28664eaa5d5953d5389f0fa6cb433ee08b768232b09f3c7410")
      public fun validityPeriod(validityPeriod: ValidityPeriodProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.CertificateValidityProperty.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.CertificateValidityProperty.builder()

      /**
       * @param renewalPeriod Renewal period is the period of time before certificate expiration
       * when a new certificate will be requested. 
       */
      override fun renewalPeriod(renewalPeriod: IResolvable) {
        cdkBuilder.renewalPeriod(renewalPeriod.let(IResolvable::unwrap))
      }

      /**
       * @param renewalPeriod Renewal period is the period of time before certificate expiration
       * when a new certificate will be requested. 
       */
      override fun renewalPeriod(renewalPeriod: ValidityPeriodProperty) {
        cdkBuilder.renewalPeriod(renewalPeriod.let(ValidityPeriodProperty::unwrap))
      }

      /**
       * @param renewalPeriod Renewal period is the period of time before certificate expiration
       * when a new certificate will be requested. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("074d06ca33d33e75e9aa8418600945d8d29663f6d1be76c0343c2cf70cff619c")
      override fun renewalPeriod(renewalPeriod: ValidityPeriodProperty.Builder.() -> Unit): Unit =
          renewalPeriod(ValidityPeriodProperty(renewalPeriod))

      /**
       * @param validityPeriod Information describing the end of the validity period of the
       * certificate. 
       * This parameter sets the “Not After” date for the certificate. Certificate validity is the
       * period of time during which a certificate is valid. Validity can be expressed as an explicit
       * date and time when the certificate expires, or as a span of time after issuance, stated in
       * days, months, or years. For more information, see Validity in RFC 5280. This value is
       * unaffected when ValidityNotBefore is also specified. For example, if Validity is set to 20
       * days in the future, the certificate will expire 20 days from issuance time regardless of the
       * ValidityNotBefore value.
       */
      override fun validityPeriod(validityPeriod: IResolvable) {
        cdkBuilder.validityPeriod(validityPeriod.let(IResolvable::unwrap))
      }

      /**
       * @param validityPeriod Information describing the end of the validity period of the
       * certificate. 
       * This parameter sets the “Not After” date for the certificate. Certificate validity is the
       * period of time during which a certificate is valid. Validity can be expressed as an explicit
       * date and time when the certificate expires, or as a span of time after issuance, stated in
       * days, months, or years. For more information, see Validity in RFC 5280. This value is
       * unaffected when ValidityNotBefore is also specified. For example, if Validity is set to 20
       * days in the future, the certificate will expire 20 days from issuance time regardless of the
       * ValidityNotBefore value.
       */
      override fun validityPeriod(validityPeriod: ValidityPeriodProperty) {
        cdkBuilder.validityPeriod(validityPeriod.let(ValidityPeriodProperty::unwrap))
      }

      /**
       * @param validityPeriod Information describing the end of the validity period of the
       * certificate. 
       * This parameter sets the “Not After” date for the certificate. Certificate validity is the
       * period of time during which a certificate is valid. Validity can be expressed as an explicit
       * date and time when the certificate expires, or as a span of time after issuance, stated in
       * days, months, or years. For more information, see Validity in RFC 5280. This value is
       * unaffected when ValidityNotBefore is also specified. For example, if Validity is set to 20
       * days in the future, the certificate will expire 20 days from issuance time regardless of the
       * ValidityNotBefore value.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
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
      /**
       * Renewal period is the period of time before certificate expiration when a new certificate
       * will be requested.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-certificatevalidity.html#cfn-pcaconnectorad-template-certificatevalidity-renewalperiod)
       */
      override fun renewalPeriod(): Any = unwrap(this).getRenewalPeriod()

      /**
       * Information describing the end of the validity period of the certificate.
       *
       * This parameter sets the “Not After” date for the certificate. Certificate validity is the
       * period of time during which a certificate is valid. Validity can be expressed as an explicit
       * date and time when the certificate expires, or as a span of time after issuance, stated in
       * days, months, or years. For more information, see Validity in RFC 5280. This value is
       * unaffected when ValidityNotBefore is also specified. For example, if Validity is set to 20
       * days in the future, the certificate will expire 20 days from issuance time regardless of the
       * ValidityNotBefore value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-certificatevalidity.html#cfn-pcaconnectorad-template-certificatevalidity-validityperiod)
       */
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
    /**
     * Defines the minimum client compatibility.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyflagsv4.html#cfn-pcaconnectorad-template-privatekeyflagsv4-clientversion)
     */
    public fun clientVersion(): String

    /**
     * Allows the private key to be exported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyflagsv4.html#cfn-pcaconnectorad-template-privatekeyflagsv4-exportablekey)
     */
    public fun exportableKey(): Any? = unwrap(this).getExportableKey()

    /**
     * Requires the PKCS #1 v2.1 signature format for certificates. You should verify that your CA,
     * objects, and applications can accept this signature format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyflagsv4.html#cfn-pcaconnectorad-template-privatekeyflagsv4-requirealternatesignaturealgorithm)
     */
    public fun requireAlternateSignatureAlgorithm(): Any? =
        unwrap(this).getRequireAlternateSignatureAlgorithm()

    /**
     * Renew certificate using the same private key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyflagsv4.html#cfn-pcaconnectorad-template-privatekeyflagsv4-requiresamekeyrenewal)
     */
    public fun requireSameKeyRenewal(): Any? = unwrap(this).getRequireSameKeyRenewal()

    /**
     * Require user input when using the private key for enrollment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyflagsv4.html#cfn-pcaconnectorad-template-privatekeyflagsv4-strongkeyprotectionrequired)
     */
    public fun strongKeyProtectionRequired(): Any? = unwrap(this).getStrongKeyProtectionRequired()

    /**
     * Specifies the cryptographic service provider category used to generate private keys.
     *
     * Set to TRUE to use Legacy Cryptographic Service Providers and FALSE to use Key Storage
     * Providers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyflagsv4.html#cfn-pcaconnectorad-template-privatekeyflagsv4-uselegacyprovider)
     */
    public fun useLegacyProvider(): Any? = unwrap(this).getUseLegacyProvider()

    /**
     * A builder for [PrivateKeyFlagsV4Property]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param clientVersion Defines the minimum client compatibility. 
       */
      public fun clientVersion(clientVersion: String)

      /**
       * @param exportableKey Allows the private key to be exported.
       */
      public fun exportableKey(exportableKey: Boolean)

      /**
       * @param exportableKey Allows the private key to be exported.
       */
      public fun exportableKey(exportableKey: IResolvable)

      /**
       * @param requireAlternateSignatureAlgorithm Requires the PKCS #1 v2.1 signature format for
       * certificates. You should verify that your CA, objects, and applications can accept this
       * signature format.
       */
      public fun requireAlternateSignatureAlgorithm(requireAlternateSignatureAlgorithm: Boolean)

      /**
       * @param requireAlternateSignatureAlgorithm Requires the PKCS #1 v2.1 signature format for
       * certificates. You should verify that your CA, objects, and applications can accept this
       * signature format.
       */
      public fun requireAlternateSignatureAlgorithm(requireAlternateSignatureAlgorithm: IResolvable)

      /**
       * @param requireSameKeyRenewal Renew certificate using the same private key.
       */
      public fun requireSameKeyRenewal(requireSameKeyRenewal: Boolean)

      /**
       * @param requireSameKeyRenewal Renew certificate using the same private key.
       */
      public fun requireSameKeyRenewal(requireSameKeyRenewal: IResolvable)

      /**
       * @param strongKeyProtectionRequired Require user input when using the private key for
       * enrollment.
       */
      public fun strongKeyProtectionRequired(strongKeyProtectionRequired: Boolean)

      /**
       * @param strongKeyProtectionRequired Require user input when using the private key for
       * enrollment.
       */
      public fun strongKeyProtectionRequired(strongKeyProtectionRequired: IResolvable)

      /**
       * @param useLegacyProvider Specifies the cryptographic service provider category used to
       * generate private keys.
       * Set to TRUE to use Legacy Cryptographic Service Providers and FALSE to use Key Storage
       * Providers.
       */
      public fun useLegacyProvider(useLegacyProvider: Boolean)

      /**
       * @param useLegacyProvider Specifies the cryptographic service provider category used to
       * generate private keys.
       * Set to TRUE to use Legacy Cryptographic Service Providers and FALSE to use Key Storage
       * Providers.
       */
      public fun useLegacyProvider(useLegacyProvider: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyFlagsV4Property.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.PrivateKeyFlagsV4Property.builder()

      /**
       * @param clientVersion Defines the minimum client compatibility. 
       */
      override fun clientVersion(clientVersion: String) {
        cdkBuilder.clientVersion(clientVersion)
      }

      /**
       * @param exportableKey Allows the private key to be exported.
       */
      override fun exportableKey(exportableKey: Boolean) {
        cdkBuilder.exportableKey(exportableKey)
      }

      /**
       * @param exportableKey Allows the private key to be exported.
       */
      override fun exportableKey(exportableKey: IResolvable) {
        cdkBuilder.exportableKey(exportableKey.let(IResolvable::unwrap))
      }

      /**
       * @param requireAlternateSignatureAlgorithm Requires the PKCS #1 v2.1 signature format for
       * certificates. You should verify that your CA, objects, and applications can accept this
       * signature format.
       */
      override fun requireAlternateSignatureAlgorithm(requireAlternateSignatureAlgorithm: Boolean) {
        cdkBuilder.requireAlternateSignatureAlgorithm(requireAlternateSignatureAlgorithm)
      }

      /**
       * @param requireAlternateSignatureAlgorithm Requires the PKCS #1 v2.1 signature format for
       * certificates. You should verify that your CA, objects, and applications can accept this
       * signature format.
       */
      override
          fun requireAlternateSignatureAlgorithm(requireAlternateSignatureAlgorithm: IResolvable) {
        cdkBuilder.requireAlternateSignatureAlgorithm(requireAlternateSignatureAlgorithm.let(IResolvable::unwrap))
      }

      /**
       * @param requireSameKeyRenewal Renew certificate using the same private key.
       */
      override fun requireSameKeyRenewal(requireSameKeyRenewal: Boolean) {
        cdkBuilder.requireSameKeyRenewal(requireSameKeyRenewal)
      }

      /**
       * @param requireSameKeyRenewal Renew certificate using the same private key.
       */
      override fun requireSameKeyRenewal(requireSameKeyRenewal: IResolvable) {
        cdkBuilder.requireSameKeyRenewal(requireSameKeyRenewal.let(IResolvable::unwrap))
      }

      /**
       * @param strongKeyProtectionRequired Require user input when using the private key for
       * enrollment.
       */
      override fun strongKeyProtectionRequired(strongKeyProtectionRequired: Boolean) {
        cdkBuilder.strongKeyProtectionRequired(strongKeyProtectionRequired)
      }

      /**
       * @param strongKeyProtectionRequired Require user input when using the private key for
       * enrollment.
       */
      override fun strongKeyProtectionRequired(strongKeyProtectionRequired: IResolvable) {
        cdkBuilder.strongKeyProtectionRequired(strongKeyProtectionRequired.let(IResolvable::unwrap))
      }

      /**
       * @param useLegacyProvider Specifies the cryptographic service provider category used to
       * generate private keys.
       * Set to TRUE to use Legacy Cryptographic Service Providers and FALSE to use Key Storage
       * Providers.
       */
      override fun useLegacyProvider(useLegacyProvider: Boolean) {
        cdkBuilder.useLegacyProvider(useLegacyProvider)
      }

      /**
       * @param useLegacyProvider Specifies the cryptographic service provider category used to
       * generate private keys.
       * Set to TRUE to use Legacy Cryptographic Service Providers and FALSE to use Key Storage
       * Providers.
       */
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
      /**
       * Defines the minimum client compatibility.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyflagsv4.html#cfn-pcaconnectorad-template-privatekeyflagsv4-clientversion)
       */
      override fun clientVersion(): String = unwrap(this).getClientVersion()

      /**
       * Allows the private key to be exported.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyflagsv4.html#cfn-pcaconnectorad-template-privatekeyflagsv4-exportablekey)
       */
      override fun exportableKey(): Any? = unwrap(this).getExportableKey()

      /**
       * Requires the PKCS #1 v2.1 signature format for certificates. You should verify that your
       * CA, objects, and applications can accept this signature format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyflagsv4.html#cfn-pcaconnectorad-template-privatekeyflagsv4-requirealternatesignaturealgorithm)
       */
      override fun requireAlternateSignatureAlgorithm(): Any? =
          unwrap(this).getRequireAlternateSignatureAlgorithm()

      /**
       * Renew certificate using the same private key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyflagsv4.html#cfn-pcaconnectorad-template-privatekeyflagsv4-requiresamekeyrenewal)
       */
      override fun requireSameKeyRenewal(): Any? = unwrap(this).getRequireSameKeyRenewal()

      /**
       * Require user input when using the private key for enrollment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyflagsv4.html#cfn-pcaconnectorad-template-privatekeyflagsv4-strongkeyprotectionrequired)
       */
      override fun strongKeyProtectionRequired(): Any? =
          unwrap(this).getStrongKeyProtectionRequired()

      /**
       * Specifies the cryptographic service provider category used to generate private keys.
       *
       * Set to TRUE to use Legacy Cryptographic Service Providers and FALSE to use Key Storage
       * Providers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyflagsv4.html#cfn-pcaconnectorad-template-privatekeyflagsv4-uselegacyprovider)
       */
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
    /**
     * Application policies specify what the certificate is used for and its purpose.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-extensionsv4.html#cfn-pcaconnectorad-template-extensionsv4-applicationpolicies)
     */
    public fun applicationPolicies(): Any? = unwrap(this).getApplicationPolicies()

    /**
     * The key usage extension defines the purpose (e.g., encipherment, signature) of the key
     * contained in the certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-extensionsv4.html#cfn-pcaconnectorad-template-extensionsv4-keyusage)
     */
    public fun keyUsage(): Any

    /**
     * A builder for [ExtensionsV4Property]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param applicationPolicies Application policies specify what the certificate is used for
       * and its purpose.
       */
      public fun applicationPolicies(applicationPolicies: IResolvable)

      /**
       * @param applicationPolicies Application policies specify what the certificate is used for
       * and its purpose.
       */
      public fun applicationPolicies(applicationPolicies: ApplicationPoliciesProperty)

      /**
       * @param applicationPolicies Application policies specify what the certificate is used for
       * and its purpose.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("675d22ebbe7e9e9c07c73217c59014a96cdbd81d23ef77e4d48bc82a7ba6ae7b")
      public
          fun applicationPolicies(applicationPolicies: ApplicationPoliciesProperty.Builder.() -> Unit)

      /**
       * @param keyUsage The key usage extension defines the purpose (e.g., encipherment, signature)
       * of the key contained in the certificate. 
       */
      public fun keyUsage(keyUsage: IResolvable)

      /**
       * @param keyUsage The key usage extension defines the purpose (e.g., encipherment, signature)
       * of the key contained in the certificate. 
       */
      public fun keyUsage(keyUsage: KeyUsageProperty)

      /**
       * @param keyUsage The key usage extension defines the purpose (e.g., encipherment, signature)
       * of the key contained in the certificate. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("776a28e32dec6f401fe6ac8cef051766a5972ba4f4657a12e9d95cbe6aeaa65a")
      public fun keyUsage(keyUsage: KeyUsageProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ExtensionsV4Property.Builder =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ExtensionsV4Property.builder()

      /**
       * @param applicationPolicies Application policies specify what the certificate is used for
       * and its purpose.
       */
      override fun applicationPolicies(applicationPolicies: IResolvable) {
        cdkBuilder.applicationPolicies(applicationPolicies.let(IResolvable::unwrap))
      }

      /**
       * @param applicationPolicies Application policies specify what the certificate is used for
       * and its purpose.
       */
      override fun applicationPolicies(applicationPolicies: ApplicationPoliciesProperty) {
        cdkBuilder.applicationPolicies(applicationPolicies.let(ApplicationPoliciesProperty::unwrap))
      }

      /**
       * @param applicationPolicies Application policies specify what the certificate is used for
       * and its purpose.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("675d22ebbe7e9e9c07c73217c59014a96cdbd81d23ef77e4d48bc82a7ba6ae7b")
      override
          fun applicationPolicies(applicationPolicies: ApplicationPoliciesProperty.Builder.() -> Unit):
          Unit = applicationPolicies(ApplicationPoliciesProperty(applicationPolicies))

      /**
       * @param keyUsage The key usage extension defines the purpose (e.g., encipherment, signature)
       * of the key contained in the certificate. 
       */
      override fun keyUsage(keyUsage: IResolvable) {
        cdkBuilder.keyUsage(keyUsage.let(IResolvable::unwrap))
      }

      /**
       * @param keyUsage The key usage extension defines the purpose (e.g., encipherment, signature)
       * of the key contained in the certificate. 
       */
      override fun keyUsage(keyUsage: KeyUsageProperty) {
        cdkBuilder.keyUsage(keyUsage.let(KeyUsageProperty::unwrap))
      }

      /**
       * @param keyUsage The key usage extension defines the purpose (e.g., encipherment, signature)
       * of the key contained in the certificate. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
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
      /**
       * Application policies specify what the certificate is used for and its purpose.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-extensionsv4.html#cfn-pcaconnectorad-template-extensionsv4-applicationpolicies)
       */
      override fun applicationPolicies(): Any? = unwrap(this).getApplicationPolicies()

      /**
       * The key usage extension defines the purpose (e.g., encipherment, signature) of the key
       * contained in the certificate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-extensionsv4.html#cfn-pcaconnectorad-template-extensionsv4-keyusage)
       */
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
    /**
     * Allows certificate issuance using autoenrollment.
     *
     * Set to TRUE to allow autoenrollment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-generalflagsv3.html#cfn-pcaconnectorad-template-generalflagsv3-autoenrollment)
     */
    public fun autoEnrollment(): Any? = unwrap(this).getAutoEnrollment()

    /**
     * Defines if the template is for machines or users.
     *
     * Set to TRUE if the template is for machines. Set to FALSE if the template is for users
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-generalflagsv3.html#cfn-pcaconnectorad-template-generalflagsv3-machinetype)
     */
    public fun machineType(): Any? = unwrap(this).getMachineType()

    /**
     * A builder for [GeneralFlagsV3Property]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param autoEnrollment Allows certificate issuance using autoenrollment.
       * Set to TRUE to allow autoenrollment.
       */
      public fun autoEnrollment(autoEnrollment: Boolean)

      /**
       * @param autoEnrollment Allows certificate issuance using autoenrollment.
       * Set to TRUE to allow autoenrollment.
       */
      public fun autoEnrollment(autoEnrollment: IResolvable)

      /**
       * @param machineType Defines if the template is for machines or users.
       * Set to TRUE if the template is for machines. Set to FALSE if the template is for users
       */
      public fun machineType(machineType: Boolean)

      /**
       * @param machineType Defines if the template is for machines or users.
       * Set to TRUE if the template is for machines. Set to FALSE if the template is for users
       */
      public fun machineType(machineType: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.GeneralFlagsV3Property.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.GeneralFlagsV3Property.builder()

      /**
       * @param autoEnrollment Allows certificate issuance using autoenrollment.
       * Set to TRUE to allow autoenrollment.
       */
      override fun autoEnrollment(autoEnrollment: Boolean) {
        cdkBuilder.autoEnrollment(autoEnrollment)
      }

      /**
       * @param autoEnrollment Allows certificate issuance using autoenrollment.
       * Set to TRUE to allow autoenrollment.
       */
      override fun autoEnrollment(autoEnrollment: IResolvable) {
        cdkBuilder.autoEnrollment(autoEnrollment.let(IResolvable::unwrap))
      }

      /**
       * @param machineType Defines if the template is for machines or users.
       * Set to TRUE if the template is for machines. Set to FALSE if the template is for users
       */
      override fun machineType(machineType: Boolean) {
        cdkBuilder.machineType(machineType)
      }

      /**
       * @param machineType Defines if the template is for machines or users.
       * Set to TRUE if the template is for machines. Set to FALSE if the template is for users
       */
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
      /**
       * Allows certificate issuance using autoenrollment.
       *
       * Set to TRUE to allow autoenrollment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-generalflagsv3.html#cfn-pcaconnectorad-template-generalflagsv3-autoenrollment)
       */
      override fun autoEnrollment(): Any? = unwrap(this).getAutoEnrollment()

      /**
       * Defines if the template is for machines or users.
       *
       * Set to TRUE if the template is for machines. Set to FALSE if the template is for users
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-generalflagsv3.html#cfn-pcaconnectorad-template-generalflagsv3-machinetype)
       */
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
    /**
     * The numeric value for the validity period.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-validityperiod.html#cfn-pcaconnectorad-template-validityperiod-period)
     */
    public fun period(): Number

    /**
     * The unit of time.
     *
     * You can select hours, days, weeks, months, and years.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-validityperiod.html#cfn-pcaconnectorad-template-validityperiod-periodtype)
     */
    public fun periodType(): String

    /**
     * A builder for [ValidityPeriodProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param period The numeric value for the validity period. 
       */
      public fun period(period: Number)

      /**
       * @param periodType The unit of time. 
       * You can select hours, days, weeks, months, and years.
       */
      public fun periodType(periodType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ValidityPeriodProperty.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplate.ValidityPeriodProperty.builder()

      /**
       * @param period The numeric value for the validity period. 
       */
      override fun period(period: Number) {
        cdkBuilder.period(period)
      }

      /**
       * @param periodType The unit of time. 
       * You can select hours, days, weeks, months, and years.
       */
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
      /**
       * The numeric value for the validity period.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-validityperiod.html#cfn-pcaconnectorad-template-validityperiod-period)
       */
      override fun period(): Number = unwrap(this).getPeriod()

      /**
       * The unit of time.
       *
       * You can select hours, days, weeks, months, and years.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-validityperiod.html#cfn-pcaconnectorad-template-validityperiod-periodtype)
       */
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
