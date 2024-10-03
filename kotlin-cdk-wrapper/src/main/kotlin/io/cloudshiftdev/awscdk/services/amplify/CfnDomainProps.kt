@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.amplify

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnDomain`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.amplify.*;
 * CfnDomainProps cfnDomainProps = CfnDomainProps.builder()
 * .appId("appId")
 * .domainName("domainName")
 * .subDomainSettings(List.of(SubDomainSettingProperty.builder()
 * .branchName("branchName")
 * .prefix("prefix")
 * .build()))
 * // the properties below are optional
 * .autoSubDomainCreationPatterns(List.of("autoSubDomainCreationPatterns"))
 * .autoSubDomainIamRole("autoSubDomainIamRole")
 * .certificateSettings(CertificateSettingsProperty.builder()
 * .certificateType("certificateType")
 * .customCertificateArn("customCertificateArn")
 * .build())
 * .enableAutoSubDomain(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html)
 */
public interface CfnDomainProps {
  /**
   * The unique ID for an Amplify app.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-appid)
   */
  public fun appId(): String

  /**
   * Sets the branch patterns for automatic subdomain creation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-autosubdomaincreationpatterns)
   */
  public fun autoSubDomainCreationPatterns(): List<String> =
      unwrap(this).getAutoSubDomainCreationPatterns() ?: emptyList()

  /**
   * The required AWS Identity and Access Management (IAMlong) service role for the Amazon Resource
   * Name (ARN) for automatically creating subdomains.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-autosubdomainiamrole)
   */
  public fun autoSubDomainIamRole(): String? = unwrap(this).getAutoSubDomainIamRole()

  /**
   * The type of SSL/TLS certificate to use for your custom domain.
   *
   * If you don't specify a certificate type, Amplify uses the default certificate that it
   * provisions and manages for you.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-certificatesettings)
   */
  public fun certificateSettings(): Any? = unwrap(this).getCertificateSettings()

  /**
   * The domain name for the domain association.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-domainname)
   */
  public fun domainName(): String

  /**
   * Enables the automated creation of subdomains for branches.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-enableautosubdomain)
   */
  public fun enableAutoSubDomain(): Any? = unwrap(this).getEnableAutoSubDomain()

  /**
   * The setting for the subdomain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-subdomainsettings)
   */
  public fun subDomainSettings(): Any

  /**
   * A builder for [CfnDomainProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param appId The unique ID for an Amplify app. 
     */
    public fun appId(appId: String)

    /**
     * @param autoSubDomainCreationPatterns Sets the branch patterns for automatic subdomain
     * creation.
     */
    public fun autoSubDomainCreationPatterns(autoSubDomainCreationPatterns: List<String>)

    /**
     * @param autoSubDomainCreationPatterns Sets the branch patterns for automatic subdomain
     * creation.
     */
    public fun autoSubDomainCreationPatterns(vararg autoSubDomainCreationPatterns: String)

    /**
     * @param autoSubDomainIamRole The required AWS Identity and Access Management (IAMlong) service
     * role for the Amazon Resource Name (ARN) for automatically creating subdomains.
     */
    public fun autoSubDomainIamRole(autoSubDomainIamRole: String)

    /**
     * @param certificateSettings The type of SSL/TLS certificate to use for your custom domain.
     * If you don't specify a certificate type, Amplify uses the default certificate that it
     * provisions and manages for you.
     */
    public fun certificateSettings(certificateSettings: IResolvable)

    /**
     * @param certificateSettings The type of SSL/TLS certificate to use for your custom domain.
     * If you don't specify a certificate type, Amplify uses the default certificate that it
     * provisions and manages for you.
     */
    public fun certificateSettings(certificateSettings: CfnDomain.CertificateSettingsProperty)

    /**
     * @param certificateSettings The type of SSL/TLS certificate to use for your custom domain.
     * If you don't specify a certificate type, Amplify uses the default certificate that it
     * provisions and manages for you.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e349f2ec27d3a6fc697ced7e01c95b182e14bc3646efc46ef9dcf118a330c2b2")
    public
        fun certificateSettings(certificateSettings: CfnDomain.CertificateSettingsProperty.Builder.() -> Unit)

    /**
     * @param domainName The domain name for the domain association. 
     */
    public fun domainName(domainName: String)

    /**
     * @param enableAutoSubDomain Enables the automated creation of subdomains for branches.
     */
    public fun enableAutoSubDomain(enableAutoSubDomain: Boolean)

    /**
     * @param enableAutoSubDomain Enables the automated creation of subdomains for branches.
     */
    public fun enableAutoSubDomain(enableAutoSubDomain: IResolvable)

    /**
     * @param subDomainSettings The setting for the subdomain. 
     */
    public fun subDomainSettings(subDomainSettings: IResolvable)

    /**
     * @param subDomainSettings The setting for the subdomain. 
     */
    public fun subDomainSettings(subDomainSettings: List<Any>)

    /**
     * @param subDomainSettings The setting for the subdomain. 
     */
    public fun subDomainSettings(vararg subDomainSettings: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.amplify.CfnDomainProps.Builder =
        software.amazon.awscdk.services.amplify.CfnDomainProps.builder()

    /**
     * @param appId The unique ID for an Amplify app. 
     */
    override fun appId(appId: String) {
      cdkBuilder.appId(appId)
    }

    /**
     * @param autoSubDomainCreationPatterns Sets the branch patterns for automatic subdomain
     * creation.
     */
    override fun autoSubDomainCreationPatterns(autoSubDomainCreationPatterns: List<String>) {
      cdkBuilder.autoSubDomainCreationPatterns(autoSubDomainCreationPatterns)
    }

    /**
     * @param autoSubDomainCreationPatterns Sets the branch patterns for automatic subdomain
     * creation.
     */
    override fun autoSubDomainCreationPatterns(vararg autoSubDomainCreationPatterns: String): Unit =
        autoSubDomainCreationPatterns(autoSubDomainCreationPatterns.toList())

    /**
     * @param autoSubDomainIamRole The required AWS Identity and Access Management (IAMlong) service
     * role for the Amazon Resource Name (ARN) for automatically creating subdomains.
     */
    override fun autoSubDomainIamRole(autoSubDomainIamRole: String) {
      cdkBuilder.autoSubDomainIamRole(autoSubDomainIamRole)
    }

    /**
     * @param certificateSettings The type of SSL/TLS certificate to use for your custom domain.
     * If you don't specify a certificate type, Amplify uses the default certificate that it
     * provisions and manages for you.
     */
    override fun certificateSettings(certificateSettings: IResolvable) {
      cdkBuilder.certificateSettings(certificateSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param certificateSettings The type of SSL/TLS certificate to use for your custom domain.
     * If you don't specify a certificate type, Amplify uses the default certificate that it
     * provisions and manages for you.
     */
    override fun certificateSettings(certificateSettings: CfnDomain.CertificateSettingsProperty) {
      cdkBuilder.certificateSettings(certificateSettings.let(CfnDomain.CertificateSettingsProperty.Companion::unwrap))
    }

    /**
     * @param certificateSettings The type of SSL/TLS certificate to use for your custom domain.
     * If you don't specify a certificate type, Amplify uses the default certificate that it
     * provisions and manages for you.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e349f2ec27d3a6fc697ced7e01c95b182e14bc3646efc46ef9dcf118a330c2b2")
    override
        fun certificateSettings(certificateSettings: CfnDomain.CertificateSettingsProperty.Builder.() -> Unit):
        Unit = certificateSettings(CfnDomain.CertificateSettingsProperty(certificateSettings))

    /**
     * @param domainName The domain name for the domain association. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * @param enableAutoSubDomain Enables the automated creation of subdomains for branches.
     */
    override fun enableAutoSubDomain(enableAutoSubDomain: Boolean) {
      cdkBuilder.enableAutoSubDomain(enableAutoSubDomain)
    }

    /**
     * @param enableAutoSubDomain Enables the automated creation of subdomains for branches.
     */
    override fun enableAutoSubDomain(enableAutoSubDomain: IResolvable) {
      cdkBuilder.enableAutoSubDomain(enableAutoSubDomain.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param subDomainSettings The setting for the subdomain. 
     */
    override fun subDomainSettings(subDomainSettings: IResolvable) {
      cdkBuilder.subDomainSettings(subDomainSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param subDomainSettings The setting for the subdomain. 
     */
    override fun subDomainSettings(subDomainSettings: List<Any>) {
      cdkBuilder.subDomainSettings(subDomainSettings.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param subDomainSettings The setting for the subdomain. 
     */
    override fun subDomainSettings(vararg subDomainSettings: Any): Unit =
        subDomainSettings(subDomainSettings.toList())

    public fun build(): software.amazon.awscdk.services.amplify.CfnDomainProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.amplify.CfnDomainProps,
  ) : CdkObject(cdkObject),
      CfnDomainProps {
    /**
     * The unique ID for an Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-appid)
     */
    override fun appId(): String = unwrap(this).getAppId()

    /**
     * Sets the branch patterns for automatic subdomain creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-autosubdomaincreationpatterns)
     */
    override fun autoSubDomainCreationPatterns(): List<String> =
        unwrap(this).getAutoSubDomainCreationPatterns() ?: emptyList()

    /**
     * The required AWS Identity and Access Management (IAMlong) service role for the Amazon
     * Resource Name (ARN) for automatically creating subdomains.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-autosubdomainiamrole)
     */
    override fun autoSubDomainIamRole(): String? = unwrap(this).getAutoSubDomainIamRole()

    /**
     * The type of SSL/TLS certificate to use for your custom domain.
     *
     * If you don't specify a certificate type, Amplify uses the default certificate that it
     * provisions and manages for you.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-certificatesettings)
     */
    override fun certificateSettings(): Any? = unwrap(this).getCertificateSettings()

    /**
     * The domain name for the domain association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-domainname)
     */
    override fun domainName(): String = unwrap(this).getDomainName()

    /**
     * Enables the automated creation of subdomains for branches.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-enableautosubdomain)
     */
    override fun enableAutoSubDomain(): Any? = unwrap(this).getEnableAutoSubDomain()

    /**
     * The setting for the subdomain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-subdomainsettings)
     */
    override fun subDomainSettings(): Any = unwrap(this).getSubDomainSettings()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDomainProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.amplify.CfnDomainProps):
        CfnDomainProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDomainProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDomainProps):
        software.amazon.awscdk.services.amplify.CfnDomainProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.amplify.CfnDomainProps
  }
}
