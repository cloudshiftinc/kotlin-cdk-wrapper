@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.amplify

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies the AWS::Amplify::Domain resource that enables you to connect a custom domain to your
 * app.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.amplify.*;
 * CfnDomain cfnDomain = CfnDomain.Builder.create(this, "MyCfnDomain")
 * .appId("appId")
 * .domainName("domainName")
 * .subDomainSettings(List.of(SubDomainSettingProperty.builder()
 * .branchName("branchName")
 * .prefix("prefix")
 * .build()))
 * // the properties below are optional
 * .autoSubDomainCreationPatterns(List.of("autoSubDomainCreationPatterns"))
 * .autoSubDomainIamRole("autoSubDomainIamRole")
 * .certificate(CertificateProperty.builder()
 * .certificateArn("certificateArn")
 * .certificateType("certificateType")
 * .certificateVerificationDnsRecord("certificateVerificationDnsRecord")
 * .build())
 * .certificateSettings(CertificateSettingsProperty.builder()
 * .certificateType("certificateType")
 * .customCertificateArn("customCertificateArn")
 * .build())
 * .enableAutoSubDomain(false)
 * .updateStatus("updateStatus")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html)
 */
public open class CfnDomain internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.amplify.CfnDomain,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The unique ID for an Amplify app.
   */
  public open fun appId(): String = unwrap(this).getAppId()

  /**
   * The unique ID for an Amplify app.
   */
  public open fun appId(`value`: String) {
    unwrap(this).setAppId(`value`)
  }

  /**
   * ARN for the Domain Association.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Branch patterns for the automatically created subdomain.
   */
  public open fun attrAutoSubDomainCreationPatterns(): List<String> =
      unwrap(this).getAttrAutoSubDomainCreationPatterns()

  /**
   * The IAM service role for the subdomain.
   */
  public open fun attrAutoSubDomainIamRole(): String = unwrap(this).getAttrAutoSubDomainIamRole()

  /**
   * DNS Record for certificate verification.
   */
  public open fun attrCertificateRecord(): String = unwrap(this).getAttrCertificateRecord()

  /**
   * Name of the domain.
   */
  public open fun attrDomainName(): String = unwrap(this).getAttrDomainName()

  /**
   * Status for the Domain Association.
   */
  public open fun attrDomainStatus(): String = unwrap(this).getAttrDomainStatus()

  /**
   * Specifies whether the automated creation of subdomains for branches is enabled.
   */
  public open fun attrEnableAutoSubDomain(): IResolvable =
      unwrap(this).getAttrEnableAutoSubDomain().let(IResolvable::wrap)

  /**
   * Reason for the current status of the domain.
   */
  public open fun attrStatusReason(): String = unwrap(this).getAttrStatusReason()

  /**
   * Sets the branch patterns for automatic subdomain creation.
   */
  public open fun autoSubDomainCreationPatterns(): List<String> =
      unwrap(this).getAutoSubDomainCreationPatterns() ?: emptyList()

  /**
   * Sets the branch patterns for automatic subdomain creation.
   */
  public open fun autoSubDomainCreationPatterns(`value`: List<String>) {
    unwrap(this).setAutoSubDomainCreationPatterns(`value`)
  }

  /**
   * Sets the branch patterns for automatic subdomain creation.
   */
  public open fun autoSubDomainCreationPatterns(vararg `value`: String): Unit =
      autoSubDomainCreationPatterns(`value`.toList())

  /**
   * The required AWS Identity and Access Management (IAMlong) service role for the Amazon Resource
   * Name (ARN) for automatically creating subdomains.
   */
  public open fun autoSubDomainIamRole(): String? = unwrap(this).getAutoSubDomainIamRole()

  /**
   * The required AWS Identity and Access Management (IAMlong) service role for the Amazon Resource
   * Name (ARN) for automatically creating subdomains.
   */
  public open fun autoSubDomainIamRole(`value`: String) {
    unwrap(this).setAutoSubDomainIamRole(`value`)
  }

  /**
   * Describes the SSL/TLS certificate for the domain association.
   */
  public open fun certificate(): Any? = unwrap(this).getCertificate()

  /**
   * Describes the SSL/TLS certificate for the domain association.
   */
  public open fun certificate(`value`: IResolvable) {
    unwrap(this).setCertificate(`value`.let(IResolvable::unwrap))
  }

  /**
   * Describes the SSL/TLS certificate for the domain association.
   */
  public open fun certificate(`value`: CertificateProperty) {
    unwrap(this).setCertificate(`value`.let(CertificateProperty::unwrap))
  }

  /**
   * Describes the SSL/TLS certificate for the domain association.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a6e3585827032c066c49cb10aff2eecb6e23d7f11bb97c9340e9659d87230e8c")
  public open fun certificate(`value`: CertificateProperty.Builder.() -> Unit): Unit =
      certificate(CertificateProperty(`value`))

  /**
   * The type of SSL/TLS certificate to use for your custom domain.
   */
  public open fun certificateSettings(): Any? = unwrap(this).getCertificateSettings()

  /**
   * The type of SSL/TLS certificate to use for your custom domain.
   */
  public open fun certificateSettings(`value`: IResolvable) {
    unwrap(this).setCertificateSettings(`value`.let(IResolvable::unwrap))
  }

  /**
   * The type of SSL/TLS certificate to use for your custom domain.
   */
  public open fun certificateSettings(`value`: CertificateSettingsProperty) {
    unwrap(this).setCertificateSettings(`value`.let(CertificateSettingsProperty::unwrap))
  }

  /**
   * The type of SSL/TLS certificate to use for your custom domain.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("eca13eafa77ea02b50a6d71f0c4d4b9f988fee0952bb0ed539ec11e876779828")
  public open fun certificateSettings(`value`: CertificateSettingsProperty.Builder.() -> Unit): Unit
      = certificateSettings(CertificateSettingsProperty(`value`))

  /**
   * The domain name for the domain association.
   */
  public open fun domainName(): String = unwrap(this).getDomainName()

  /**
   * The domain name for the domain association.
   */
  public open fun domainName(`value`: String) {
    unwrap(this).setDomainName(`value`)
  }

  /**
   * Enables the automated creation of subdomains for branches.
   */
  public open fun enableAutoSubDomain(): Any? = unwrap(this).getEnableAutoSubDomain()

  /**
   * Enables the automated creation of subdomains for branches.
   */
  public open fun enableAutoSubDomain(`value`: Boolean) {
    unwrap(this).setEnableAutoSubDomain(`value`)
  }

  /**
   * Enables the automated creation of subdomains for branches.
   */
  public open fun enableAutoSubDomain(`value`: IResolvable) {
    unwrap(this).setEnableAutoSubDomain(`value`.let(IResolvable::unwrap))
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The setting for the subdomain.
   */
  public open fun subDomainSettings(): Any = unwrap(this).getSubDomainSettings()

  /**
   * The setting for the subdomain.
   */
  public open fun subDomainSettings(`value`: IResolvable) {
    unwrap(this).setSubDomainSettings(`value`.let(IResolvable::unwrap))
  }

  /**
   * The setting for the subdomain.
   */
  public open fun subDomainSettings(`value`: List<Any>) {
    unwrap(this).setSubDomainSettings(`value`)
  }

  /**
   * The setting for the subdomain.
   */
  public open fun subDomainSettings(vararg `value`: Any): Unit = subDomainSettings(`value`.toList())

  /**
   * The status of the domain update operation that is currently in progress.
   */
  public open fun updateStatus(): String? = unwrap(this).getUpdateStatus()

  /**
   * The status of the domain update operation that is currently in progress.
   */
  public open fun updateStatus(`value`: String) {
    unwrap(this).setUpdateStatus(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.amplify.CfnDomain].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The unique ID for an Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-appid)
     * @param appId The unique ID for an Amplify app. 
     */
    public fun appId(appId: String)

    /**
     * Sets the branch patterns for automatic subdomain creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-autosubdomaincreationpatterns)
     * @param autoSubDomainCreationPatterns Sets the branch patterns for automatic subdomain
     * creation. 
     */
    public fun autoSubDomainCreationPatterns(autoSubDomainCreationPatterns: List<String>)

    /**
     * Sets the branch patterns for automatic subdomain creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-autosubdomaincreationpatterns)
     * @param autoSubDomainCreationPatterns Sets the branch patterns for automatic subdomain
     * creation. 
     */
    public fun autoSubDomainCreationPatterns(vararg autoSubDomainCreationPatterns: String)

    /**
     * The required AWS Identity and Access Management (IAMlong) service role for the Amazon
     * Resource Name (ARN) for automatically creating subdomains.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-autosubdomainiamrole)
     * @param autoSubDomainIamRole The required AWS Identity and Access Management (IAMlong) service
     * role for the Amazon Resource Name (ARN) for automatically creating subdomains. 
     */
    public fun autoSubDomainIamRole(autoSubDomainIamRole: String)

    /**
     * Describes the SSL/TLS certificate for the domain association.
     *
     * This can be your own custom certificate or the default certificate that Amplify provisions
     * for you.
     *
     * If you are updating your domain to use a different certificate, `Certificate` points to the
     * new certificate that is being created instead of the current active certificate. Otherwise,
     * `Certificate` points to the current active certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-certificate)
     * @param certificate Describes the SSL/TLS certificate for the domain association. 
     */
    public fun certificate(certificate: IResolvable)

    /**
     * Describes the SSL/TLS certificate for the domain association.
     *
     * This can be your own custom certificate or the default certificate that Amplify provisions
     * for you.
     *
     * If you are updating your domain to use a different certificate, `Certificate` points to the
     * new certificate that is being created instead of the current active certificate. Otherwise,
     * `Certificate` points to the current active certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-certificate)
     * @param certificate Describes the SSL/TLS certificate for the domain association. 
     */
    public fun certificate(certificate: CertificateProperty)

    /**
     * Describes the SSL/TLS certificate for the domain association.
     *
     * This can be your own custom certificate or the default certificate that Amplify provisions
     * for you.
     *
     * If you are updating your domain to use a different certificate, `Certificate` points to the
     * new certificate that is being created instead of the current active certificate. Otherwise,
     * `Certificate` points to the current active certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-certificate)
     * @param certificate Describes the SSL/TLS certificate for the domain association. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dba241ba2559bec2214c0d05d5c597cbd5bc0702b76b33a82125935135728c64")
    public fun certificate(certificate: CertificateProperty.Builder.() -> Unit)

    /**
     * The type of SSL/TLS certificate to use for your custom domain.
     *
     * If you don't specify a certificate type, Amplify uses the default certificate that it
     * provisions and manages for you.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-certificatesettings)
     * @param certificateSettings The type of SSL/TLS certificate to use for your custom domain. 
     */
    public fun certificateSettings(certificateSettings: IResolvable)

    /**
     * The type of SSL/TLS certificate to use for your custom domain.
     *
     * If you don't specify a certificate type, Amplify uses the default certificate that it
     * provisions and manages for you.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-certificatesettings)
     * @param certificateSettings The type of SSL/TLS certificate to use for your custom domain. 
     */
    public fun certificateSettings(certificateSettings: CertificateSettingsProperty)

    /**
     * The type of SSL/TLS certificate to use for your custom domain.
     *
     * If you don't specify a certificate type, Amplify uses the default certificate that it
     * provisions and manages for you.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-certificatesettings)
     * @param certificateSettings The type of SSL/TLS certificate to use for your custom domain. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("24aef84ec6083e0cc92f1f4e75c3a6a1a183923d7a3b8111b5fd53349c26a456")
    public
        fun certificateSettings(certificateSettings: CertificateSettingsProperty.Builder.() -> Unit)

    /**
     * The domain name for the domain association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-domainname)
     * @param domainName The domain name for the domain association. 
     */
    public fun domainName(domainName: String)

    /**
     * Enables the automated creation of subdomains for branches.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-enableautosubdomain)
     * @param enableAutoSubDomain Enables the automated creation of subdomains for branches. 
     */
    public fun enableAutoSubDomain(enableAutoSubDomain: Boolean)

    /**
     * Enables the automated creation of subdomains for branches.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-enableautosubdomain)
     * @param enableAutoSubDomain Enables the automated creation of subdomains for branches. 
     */
    public fun enableAutoSubDomain(enableAutoSubDomain: IResolvable)

    /**
     * The setting for the subdomain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-subdomainsettings)
     * @param subDomainSettings The setting for the subdomain. 
     */
    public fun subDomainSettings(subDomainSettings: IResolvable)

    /**
     * The setting for the subdomain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-subdomainsettings)
     * @param subDomainSettings The setting for the subdomain. 
     */
    public fun subDomainSettings(subDomainSettings: List<Any>)

    /**
     * The setting for the subdomain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-subdomainsettings)
     * @param subDomainSettings The setting for the subdomain. 
     */
    public fun subDomainSettings(vararg subDomainSettings: Any)

    /**
     * The status of the domain update operation that is currently in progress.
     *
     * The following list describes the valid update states.
     *
     * * **REQUESTING_CERTIFICATE** - The certificate is in the process of being updated.
     * * **PENDING_VERIFICATION** - Indicates that an Amplify managed certificate is in the process
     * of being verified. This occurs during the creation of a custom domain or when a custom domain is
     * updated to use a managed certificate.
     * * **IMPORTING_CUSTOM_CERTIFICATE** - Indicates that an Amplify custom certificate is in the
     * process of being imported. This occurs during the creation of a custom domain or when a custom
     * domain is updated to use a custom certificate.
     * * **PENDING_DEPLOYMENT** - Indicates that the subdomain or certificate changes are being
     * propagated.
     * * **AWAITING_APP_CNAME** - Amplify is waiting for CNAME records corresponding to subdomains
     * to be propagated. If your custom domain is on Route 53, Amplify handles this for you
     * automatically. For more information about custom domains, see [Setting up custom
     * domains](https://docs.aws.amazon.com/amplify/latest/userguide/custom-domains.html) in the
     * *Amplify Hosting User Guide* .
     * * **UPDATE_COMPLETE** - The certificate has been associated with a domain.
     * * **UPDATE_FAILED** - The certificate has failed to be provisioned or associated, and there
     * is no existing active certificate to roll back to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-updatestatus)
     * @param updateStatus The status of the domain update operation that is currently in progress. 
     */
    public fun updateStatus(updateStatus: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.amplify.CfnDomain.Builder =
        software.amazon.awscdk.services.amplify.CfnDomain.Builder.create(scope, id)

    /**
     * The unique ID for an Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-appid)
     * @param appId The unique ID for an Amplify app. 
     */
    override fun appId(appId: String) {
      cdkBuilder.appId(appId)
    }

    /**
     * Sets the branch patterns for automatic subdomain creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-autosubdomaincreationpatterns)
     * @param autoSubDomainCreationPatterns Sets the branch patterns for automatic subdomain
     * creation. 
     */
    override fun autoSubDomainCreationPatterns(autoSubDomainCreationPatterns: List<String>) {
      cdkBuilder.autoSubDomainCreationPatterns(autoSubDomainCreationPatterns)
    }

    /**
     * Sets the branch patterns for automatic subdomain creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-autosubdomaincreationpatterns)
     * @param autoSubDomainCreationPatterns Sets the branch patterns for automatic subdomain
     * creation. 
     */
    override fun autoSubDomainCreationPatterns(vararg autoSubDomainCreationPatterns: String): Unit =
        autoSubDomainCreationPatterns(autoSubDomainCreationPatterns.toList())

    /**
     * The required AWS Identity and Access Management (IAMlong) service role for the Amazon
     * Resource Name (ARN) for automatically creating subdomains.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-autosubdomainiamrole)
     * @param autoSubDomainIamRole The required AWS Identity and Access Management (IAMlong) service
     * role for the Amazon Resource Name (ARN) for automatically creating subdomains. 
     */
    override fun autoSubDomainIamRole(autoSubDomainIamRole: String) {
      cdkBuilder.autoSubDomainIamRole(autoSubDomainIamRole)
    }

    /**
     * Describes the SSL/TLS certificate for the domain association.
     *
     * This can be your own custom certificate or the default certificate that Amplify provisions
     * for you.
     *
     * If you are updating your domain to use a different certificate, `Certificate` points to the
     * new certificate that is being created instead of the current active certificate. Otherwise,
     * `Certificate` points to the current active certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-certificate)
     * @param certificate Describes the SSL/TLS certificate for the domain association. 
     */
    override fun certificate(certificate: IResolvable) {
      cdkBuilder.certificate(certificate.let(IResolvable::unwrap))
    }

    /**
     * Describes the SSL/TLS certificate for the domain association.
     *
     * This can be your own custom certificate or the default certificate that Amplify provisions
     * for you.
     *
     * If you are updating your domain to use a different certificate, `Certificate` points to the
     * new certificate that is being created instead of the current active certificate. Otherwise,
     * `Certificate` points to the current active certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-certificate)
     * @param certificate Describes the SSL/TLS certificate for the domain association. 
     */
    override fun certificate(certificate: CertificateProperty) {
      cdkBuilder.certificate(certificate.let(CertificateProperty::unwrap))
    }

    /**
     * Describes the SSL/TLS certificate for the domain association.
     *
     * This can be your own custom certificate or the default certificate that Amplify provisions
     * for you.
     *
     * If you are updating your domain to use a different certificate, `Certificate` points to the
     * new certificate that is being created instead of the current active certificate. Otherwise,
     * `Certificate` points to the current active certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-certificate)
     * @param certificate Describes the SSL/TLS certificate for the domain association. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dba241ba2559bec2214c0d05d5c597cbd5bc0702b76b33a82125935135728c64")
    override fun certificate(certificate: CertificateProperty.Builder.() -> Unit): Unit =
        certificate(CertificateProperty(certificate))

    /**
     * The type of SSL/TLS certificate to use for your custom domain.
     *
     * If you don't specify a certificate type, Amplify uses the default certificate that it
     * provisions and manages for you.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-certificatesettings)
     * @param certificateSettings The type of SSL/TLS certificate to use for your custom domain. 
     */
    override fun certificateSettings(certificateSettings: IResolvable) {
      cdkBuilder.certificateSettings(certificateSettings.let(IResolvable::unwrap))
    }

    /**
     * The type of SSL/TLS certificate to use for your custom domain.
     *
     * If you don't specify a certificate type, Amplify uses the default certificate that it
     * provisions and manages for you.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-certificatesettings)
     * @param certificateSettings The type of SSL/TLS certificate to use for your custom domain. 
     */
    override fun certificateSettings(certificateSettings: CertificateSettingsProperty) {
      cdkBuilder.certificateSettings(certificateSettings.let(CertificateSettingsProperty::unwrap))
    }

    /**
     * The type of SSL/TLS certificate to use for your custom domain.
     *
     * If you don't specify a certificate type, Amplify uses the default certificate that it
     * provisions and manages for you.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-certificatesettings)
     * @param certificateSettings The type of SSL/TLS certificate to use for your custom domain. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("24aef84ec6083e0cc92f1f4e75c3a6a1a183923d7a3b8111b5fd53349c26a456")
    override
        fun certificateSettings(certificateSettings: CertificateSettingsProperty.Builder.() -> Unit):
        Unit = certificateSettings(CertificateSettingsProperty(certificateSettings))

    /**
     * The domain name for the domain association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-domainname)
     * @param domainName The domain name for the domain association. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * Enables the automated creation of subdomains for branches.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-enableautosubdomain)
     * @param enableAutoSubDomain Enables the automated creation of subdomains for branches. 
     */
    override fun enableAutoSubDomain(enableAutoSubDomain: Boolean) {
      cdkBuilder.enableAutoSubDomain(enableAutoSubDomain)
    }

    /**
     * Enables the automated creation of subdomains for branches.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-enableautosubdomain)
     * @param enableAutoSubDomain Enables the automated creation of subdomains for branches. 
     */
    override fun enableAutoSubDomain(enableAutoSubDomain: IResolvable) {
      cdkBuilder.enableAutoSubDomain(enableAutoSubDomain.let(IResolvable::unwrap))
    }

    /**
     * The setting for the subdomain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-subdomainsettings)
     * @param subDomainSettings The setting for the subdomain. 
     */
    override fun subDomainSettings(subDomainSettings: IResolvable) {
      cdkBuilder.subDomainSettings(subDomainSettings.let(IResolvable::unwrap))
    }

    /**
     * The setting for the subdomain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-subdomainsettings)
     * @param subDomainSettings The setting for the subdomain. 
     */
    override fun subDomainSettings(subDomainSettings: List<Any>) {
      cdkBuilder.subDomainSettings(subDomainSettings)
    }

    /**
     * The setting for the subdomain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-subdomainsettings)
     * @param subDomainSettings The setting for the subdomain. 
     */
    override fun subDomainSettings(vararg subDomainSettings: Any): Unit =
        subDomainSettings(subDomainSettings.toList())

    /**
     * The status of the domain update operation that is currently in progress.
     *
     * The following list describes the valid update states.
     *
     * * **REQUESTING_CERTIFICATE** - The certificate is in the process of being updated.
     * * **PENDING_VERIFICATION** - Indicates that an Amplify managed certificate is in the process
     * of being verified. This occurs during the creation of a custom domain or when a custom domain is
     * updated to use a managed certificate.
     * * **IMPORTING_CUSTOM_CERTIFICATE** - Indicates that an Amplify custom certificate is in the
     * process of being imported. This occurs during the creation of a custom domain or when a custom
     * domain is updated to use a custom certificate.
     * * **PENDING_DEPLOYMENT** - Indicates that the subdomain or certificate changes are being
     * propagated.
     * * **AWAITING_APP_CNAME** - Amplify is waiting for CNAME records corresponding to subdomains
     * to be propagated. If your custom domain is on Route 53, Amplify handles this for you
     * automatically. For more information about custom domains, see [Setting up custom
     * domains](https://docs.aws.amazon.com/amplify/latest/userguide/custom-domains.html) in the
     * *Amplify Hosting User Guide* .
     * * **UPDATE_COMPLETE** - The certificate has been associated with a domain.
     * * **UPDATE_FAILED** - The certificate has failed to be provisioned or associated, and there
     * is no existing active certificate to roll back to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-updatestatus)
     * @param updateStatus The status of the domain update operation that is currently in progress. 
     */
    override fun updateStatus(updateStatus: String) {
      cdkBuilder.updateStatus(updateStatus)
    }

    public fun build(): software.amazon.awscdk.services.amplify.CfnDomain = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.amplify.CfnDomain.CFN_RESOURCE_TYPE_NAME

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

  /**
   * The SubDomainSetting property type enables you to connect a subdomain (for example,
   * example.exampledomain.com) to a specific branch.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.amplify.*;
   * SubDomainSettingProperty subDomainSettingProperty = SubDomainSettingProperty.builder()
   * .branchName("branchName")
   * .prefix("prefix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-domain-subdomainsetting.html)
   */
  public interface SubDomainSettingProperty {
    /**
     * The branch name setting for the subdomain.
     *
     * *Length Constraints:* Minimum length of 1. Maximum length of 255.
     *
     * *Pattern:* (?s).+
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-domain-subdomainsetting.html#cfn-amplify-domain-subdomainsetting-branchname)
     */
    public fun branchName(): String

    /**
     * The prefix setting for the subdomain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-domain-subdomainsetting.html#cfn-amplify-domain-subdomainsetting-prefix)
     */
    public fun prefix(): String

    /**
     * A builder for [SubDomainSettingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param branchName The branch name setting for the subdomain. 
       * *Length Constraints:* Minimum length of 1. Maximum length of 255.
       *
       * *Pattern:* (?s).+
       */
      public fun branchName(branchName: String)

      /**
       * @param prefix The prefix setting for the subdomain. 
       */
      public fun prefix(prefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplify.CfnDomain.SubDomainSettingProperty.Builder =
          software.amazon.awscdk.services.amplify.CfnDomain.SubDomainSettingProperty.builder()

      /**
       * @param branchName The branch name setting for the subdomain. 
       * *Length Constraints:* Minimum length of 1. Maximum length of 255.
       *
       * *Pattern:* (?s).+
       */
      override fun branchName(branchName: String) {
        cdkBuilder.branchName(branchName)
      }

      /**
       * @param prefix The prefix setting for the subdomain. 
       */
      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      public fun build(): software.amazon.awscdk.services.amplify.CfnDomain.SubDomainSettingProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.amplify.CfnDomain.SubDomainSettingProperty,
    ) : CdkObject(cdkObject), SubDomainSettingProperty {
      /**
       * The branch name setting for the subdomain.
       *
       * *Length Constraints:* Minimum length of 1. Maximum length of 255.
       *
       * *Pattern:* (?s).+
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-domain-subdomainsetting.html#cfn-amplify-domain-subdomainsetting-branchname)
       */
      override fun branchName(): String = unwrap(this).getBranchName()

      /**
       * The prefix setting for the subdomain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-domain-subdomainsetting.html#cfn-amplify-domain-subdomainsetting-prefix)
       */
      override fun prefix(): String = unwrap(this).getPrefix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SubDomainSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplify.CfnDomain.SubDomainSettingProperty):
          SubDomainSettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SubDomainSettingProperty):
          software.amazon.awscdk.services.amplify.CfnDomain.SubDomainSettingProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.amplify.CfnDomain.SubDomainSettingProperty
    }
  }

  /**
   * Describes the SSL/TLS certificate for the domain association.
   *
   * This can be your own custom certificate or the default certificate that Amplify provisions for
   * you.
   *
   * If you are updating your domain to use a different certificate, `Certificate` points to the new
   * certificate that is being created instead of the current active certificate. Otherwise,
   * `Certificate` points to the current active certificate.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.amplify.*;
   * CertificateProperty certificateProperty = CertificateProperty.builder()
   * .certificateArn("certificateArn")
   * .certificateType("certificateType")
   * .certificateVerificationDnsRecord("certificateVerificationDnsRecord")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-domain-certificate.html)
   */
  public interface CertificateProperty {
    /**
     * The Amazon resource name (ARN) for a custom certificate that you have already added to AWS
     * Certificate Manager in your AWS account .
     *
     * This field is required only when the certificate type is `CUSTOM` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-domain-certificate.html#cfn-amplify-domain-certificate-certificatearn)
     */
    public fun certificateArn(): String? = unwrap(this).getCertificateArn()

    /**
     * The type of SSL/TLS certificate that you want to use.
     *
     * Specify `AMPLIFY_MANAGED` to use the default certificate that Amplify provisions for you.
     *
     * Specify `CUSTOM` to use your own certificate that you have already added to AWS Certificate
     * Manager in your AWS account . Make sure you request (or import) the certificate in the US East
     * (N. Virginia) Region (us-east-1). For more information about using ACM, see [Importing
     * certificates into AWS Certificate
     * Manager](https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html) in the *ACM
     * User guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-domain-certificate.html#cfn-amplify-domain-certificate-certificatetype)
     */
    public fun certificateType(): String? = unwrap(this).getCertificateType()

    /**
     * The DNS record for certificate verification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-domain-certificate.html#cfn-amplify-domain-certificate-certificateverificationdnsrecord)
     */
    public fun certificateVerificationDnsRecord(): String? =
        unwrap(this).getCertificateVerificationDnsRecord()

    /**
     * A builder for [CertificateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param certificateArn The Amazon resource name (ARN) for a custom certificate that you have
       * already added to AWS Certificate Manager in your AWS account .
       * This field is required only when the certificate type is `CUSTOM` .
       */
      public fun certificateArn(certificateArn: String)

      /**
       * @param certificateType The type of SSL/TLS certificate that you want to use.
       * Specify `AMPLIFY_MANAGED` to use the default certificate that Amplify provisions for you.
       *
       * Specify `CUSTOM` to use your own certificate that you have already added to AWS Certificate
       * Manager in your AWS account . Make sure you request (or import) the certificate in the US East
       * (N. Virginia) Region (us-east-1). For more information about using ACM, see [Importing
       * certificates into AWS Certificate
       * Manager](https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html) in the *ACM
       * User guide* .
       */
      public fun certificateType(certificateType: String)

      /**
       * @param certificateVerificationDnsRecord The DNS record for certificate verification.
       */
      public fun certificateVerificationDnsRecord(certificateVerificationDnsRecord: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplify.CfnDomain.CertificateProperty.Builder =
          software.amazon.awscdk.services.amplify.CfnDomain.CertificateProperty.builder()

      /**
       * @param certificateArn The Amazon resource name (ARN) for a custom certificate that you have
       * already added to AWS Certificate Manager in your AWS account .
       * This field is required only when the certificate type is `CUSTOM` .
       */
      override fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
      }

      /**
       * @param certificateType The type of SSL/TLS certificate that you want to use.
       * Specify `AMPLIFY_MANAGED` to use the default certificate that Amplify provisions for you.
       *
       * Specify `CUSTOM` to use your own certificate that you have already added to AWS Certificate
       * Manager in your AWS account . Make sure you request (or import) the certificate in the US East
       * (N. Virginia) Region (us-east-1). For more information about using ACM, see [Importing
       * certificates into AWS Certificate
       * Manager](https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html) in the *ACM
       * User guide* .
       */
      override fun certificateType(certificateType: String) {
        cdkBuilder.certificateType(certificateType)
      }

      /**
       * @param certificateVerificationDnsRecord The DNS record for certificate verification.
       */
      override fun certificateVerificationDnsRecord(certificateVerificationDnsRecord: String) {
        cdkBuilder.certificateVerificationDnsRecord(certificateVerificationDnsRecord)
      }

      public fun build(): software.amazon.awscdk.services.amplify.CfnDomain.CertificateProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.amplify.CfnDomain.CertificateProperty,
    ) : CdkObject(cdkObject), CertificateProperty {
      /**
       * The Amazon resource name (ARN) for a custom certificate that you have already added to AWS
       * Certificate Manager in your AWS account .
       *
       * This field is required only when the certificate type is `CUSTOM` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-domain-certificate.html#cfn-amplify-domain-certificate-certificatearn)
       */
      override fun certificateArn(): String? = unwrap(this).getCertificateArn()

      /**
       * The type of SSL/TLS certificate that you want to use.
       *
       * Specify `AMPLIFY_MANAGED` to use the default certificate that Amplify provisions for you.
       *
       * Specify `CUSTOM` to use your own certificate that you have already added to AWS Certificate
       * Manager in your AWS account . Make sure you request (or import) the certificate in the US East
       * (N. Virginia) Region (us-east-1). For more information about using ACM, see [Importing
       * certificates into AWS Certificate
       * Manager](https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html) in the *ACM
       * User guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-domain-certificate.html#cfn-amplify-domain-certificate-certificatetype)
       */
      override fun certificateType(): String? = unwrap(this).getCertificateType()

      /**
       * The DNS record for certificate verification.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-domain-certificate.html#cfn-amplify-domain-certificate-certificateverificationdnsrecord)
       */
      override fun certificateVerificationDnsRecord(): String? =
          unwrap(this).getCertificateVerificationDnsRecord()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CertificateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplify.CfnDomain.CertificateProperty):
          CertificateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CertificateProperty):
          software.amazon.awscdk.services.amplify.CfnDomain.CertificateProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.amplify.CfnDomain.CertificateProperty
    }
  }

  /**
   * The type of SSL/TLS certificate to use for your custom domain.
   *
   * If a certificate type isn't specified, Amplify uses the default `AMPLIFY_MANAGED` certificate.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.amplify.*;
   * CertificateSettingsProperty certificateSettingsProperty = CertificateSettingsProperty.builder()
   * .certificateType("certificateType")
   * .customCertificateArn("customCertificateArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-domain-certificatesettings.html)
   */
  public interface CertificateSettingsProperty {
    /**
     * The certificate type.
     *
     * Specify `AMPLIFY_MANAGED` to use the default certificate that Amplify provisions for you.
     *
     * Specify `CUSTOM` to use your own certificate that you have already added to AWS Certificate
     * Manager in your AWS account . Make sure you request (or import) the certificate in the US East
     * (N. Virginia) Region (us-east-1). For more information about using ACM, see [Importing
     * certificates into AWS Certificate
     * Manager](https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html) in the *ACM
     * User guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-domain-certificatesettings.html#cfn-amplify-domain-certificatesettings-certificatetype)
     */
    public fun certificateType(): String? = unwrap(this).getCertificateType()

    /**
     * The Amazon resource name (ARN) for the custom certificate that you have already added to AWS
     * Certificate Manager in your AWS account .
     *
     * This field is required only when the certificate type is `CUSTOM` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-domain-certificatesettings.html#cfn-amplify-domain-certificatesettings-customcertificatearn)
     */
    public fun customCertificateArn(): String? = unwrap(this).getCustomCertificateArn()

    /**
     * A builder for [CertificateSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param certificateType The certificate type.
       * Specify `AMPLIFY_MANAGED` to use the default certificate that Amplify provisions for you.
       *
       * Specify `CUSTOM` to use your own certificate that you have already added to AWS Certificate
       * Manager in your AWS account . Make sure you request (or import) the certificate in the US East
       * (N. Virginia) Region (us-east-1). For more information about using ACM, see [Importing
       * certificates into AWS Certificate
       * Manager](https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html) in the *ACM
       * User guide* .
       */
      public fun certificateType(certificateType: String)

      /**
       * @param customCertificateArn The Amazon resource name (ARN) for the custom certificate that
       * you have already added to AWS Certificate Manager in your AWS account .
       * This field is required only when the certificate type is `CUSTOM` .
       */
      public fun customCertificateArn(customCertificateArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplify.CfnDomain.CertificateSettingsProperty.Builder =
          software.amazon.awscdk.services.amplify.CfnDomain.CertificateSettingsProperty.builder()

      /**
       * @param certificateType The certificate type.
       * Specify `AMPLIFY_MANAGED` to use the default certificate that Amplify provisions for you.
       *
       * Specify `CUSTOM` to use your own certificate that you have already added to AWS Certificate
       * Manager in your AWS account . Make sure you request (or import) the certificate in the US East
       * (N. Virginia) Region (us-east-1). For more information about using ACM, see [Importing
       * certificates into AWS Certificate
       * Manager](https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html) in the *ACM
       * User guide* .
       */
      override fun certificateType(certificateType: String) {
        cdkBuilder.certificateType(certificateType)
      }

      /**
       * @param customCertificateArn The Amazon resource name (ARN) for the custom certificate that
       * you have already added to AWS Certificate Manager in your AWS account .
       * This field is required only when the certificate type is `CUSTOM` .
       */
      override fun customCertificateArn(customCertificateArn: String) {
        cdkBuilder.customCertificateArn(customCertificateArn)
      }

      public fun build():
          software.amazon.awscdk.services.amplify.CfnDomain.CertificateSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.amplify.CfnDomain.CertificateSettingsProperty,
    ) : CdkObject(cdkObject), CertificateSettingsProperty {
      /**
       * The certificate type.
       *
       * Specify `AMPLIFY_MANAGED` to use the default certificate that Amplify provisions for you.
       *
       * Specify `CUSTOM` to use your own certificate that you have already added to AWS Certificate
       * Manager in your AWS account . Make sure you request (or import) the certificate in the US East
       * (N. Virginia) Region (us-east-1). For more information about using ACM, see [Importing
       * certificates into AWS Certificate
       * Manager](https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html) in the *ACM
       * User guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-domain-certificatesettings.html#cfn-amplify-domain-certificatesettings-certificatetype)
       */
      override fun certificateType(): String? = unwrap(this).getCertificateType()

      /**
       * The Amazon resource name (ARN) for the custom certificate that you have already added to
       * AWS Certificate Manager in your AWS account .
       *
       * This field is required only when the certificate type is `CUSTOM` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-domain-certificatesettings.html#cfn-amplify-domain-certificatesettings-customcertificatearn)
       */
      override fun customCertificateArn(): String? = unwrap(this).getCustomCertificateArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CertificateSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplify.CfnDomain.CertificateSettingsProperty):
          CertificateSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CertificateSettingsProperty):
          software.amazon.awscdk.services.amplify.CfnDomain.CertificateSettingsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.amplify.CfnDomain.CertificateSettingsProperty
    }
  }
}
