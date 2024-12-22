@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.workspacesweb

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Properties for defining a `CfnPortal`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.workspacesweb.*;
 * CfnPortalProps cfnPortalProps = CfnPortalProps.builder()
 * .additionalEncryptionContext(Map.of(
 * "additionalEncryptionContextKey", "additionalEncryptionContext"))
 * .authenticationType("authenticationType")
 * .browserSettingsArn("browserSettingsArn")
 * .customerManagedKey("customerManagedKey")
 * .dataProtectionSettingsArn("dataProtectionSettingsArn")
 * .displayName("displayName")
 * .instanceType("instanceType")
 * .ipAccessSettingsArn("ipAccessSettingsArn")
 * .maxConcurrentSessions(123)
 * .networkSettingsArn("networkSettingsArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .trustStoreArn("trustStoreArn")
 * .userAccessLoggingSettingsArn("userAccessLoggingSettingsArn")
 * .userSettingsArn("userSettingsArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html)
 */
public interface CfnPortalProps {
  /**
   * The additional encryption context of the portal.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-additionalencryptioncontext)
   */
  public fun additionalEncryptionContext(): Any? = unwrap(this).getAdditionalEncryptionContext()

  /**
   * The type of authentication integration points used when signing into the web portal. Defaults
   * to `Standard` .
   *
   * `Standard` web portals are authenticated directly through your identity provider (IdP). User
   * and group access to your web portal is controlled through your IdP. You need to include an IdP
   * resource in your template to integrate your IdP with your web portal. Completing the configuration
   * for your IdP requires exchanging WorkSpaces Secure Browser’s SP metadata with your IdP’s IdP
   * metadata. If your IdP requires the SP metadata first before returning the IdP metadata, you should
   * follow these steps:
   *
   *
   * * Create and deploy a CloudFormation template with a `Standard` portal with no
   * `IdentityProvider` resource.
   * * Retrieve the SP metadata using `Fn:GetAtt` , the WorkSpaces Secure Browser console, or by the
   * calling the `GetPortalServiceProviderMetadata` API.
   * * Submit the data to your IdP.
   * * Add an `IdentityProvider` resource to your CloudFormation template.
   *
   *
   * `IAM Identity Center` web portals are authenticated through AWS IAM Identity Center . They
   * provide additional features, such as IdP-initiated authentication. Identity sources (including
   * external identity provider integration) and other identity provider information must be configured
   * in IAM Identity Center . User and group assignment must be done through the WorkSpaces Secure
   * Browser console. These cannot be configured in CloudFormation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-authenticationtype)
   */
  public fun authenticationType(): String? = unwrap(this).getAuthenticationType()

  /**
   * The ARN of the browser settings that is associated with this web portal.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-browsersettingsarn)
   */
  public fun browserSettingsArn(): String? = unwrap(this).getBrowserSettingsArn()

  /**
   * The customer managed key of the web portal.
   *
   * *Pattern* : `^arn:[\w+=\/,.&#64;-]+:kms:[a-zA-Z0-9\-]*:[a-zA-Z0-9]{1,12}:key\/[a-zA-Z0-9-]+$`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-customermanagedkey)
   */
  public fun customerManagedKey(): String? = unwrap(this).getCustomerManagedKey()

  /**
   * The ARN of the data protection settings.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-dataprotectionsettingsarn)
   */
  public fun dataProtectionSettingsArn(): String? = unwrap(this).getDataProtectionSettingsArn()

  /**
   * The name of the web portal.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-displayname)
   */
  public fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * The type and resources of the underlying instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-instancetype)
   */
  public fun instanceType(): String? = unwrap(this).getInstanceType()

  /**
   * The ARN of the IP access settings that is associated with the web portal.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-ipaccesssettingsarn)
   */
  public fun ipAccessSettingsArn(): String? = unwrap(this).getIpAccessSettingsArn()

  /**
   * The maximum number of concurrent sessions for the portal.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-maxconcurrentsessions)
   */
  public fun maxConcurrentSessions(): Number? = unwrap(this).getMaxConcurrentSessions()

  /**
   * The ARN of the network settings that is associated with the web portal.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-networksettingsarn)
   */
  public fun networkSettingsArn(): String? = unwrap(this).getNetworkSettingsArn()

  /**
   * The tags to add to the web portal.
   *
   * A tag is a key-value pair.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The ARN of the trust store that is associated with the web portal.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-truststorearn)
   */
  public fun trustStoreArn(): String? = unwrap(this).getTrustStoreArn()

  /**
   * The ARN of the user access logging settings that is associated with the web portal.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-useraccessloggingsettingsarn)
   */
  public fun userAccessLoggingSettingsArn(): String? =
      unwrap(this).getUserAccessLoggingSettingsArn()

  /**
   * The ARN of the user settings that is associated with the web portal.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-usersettingsarn)
   */
  public fun userSettingsArn(): String? = unwrap(this).getUserSettingsArn()

  /**
   * A builder for [CfnPortalProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param additionalEncryptionContext The additional encryption context of the portal.
     */
    public fun additionalEncryptionContext(additionalEncryptionContext: IResolvable)

    /**
     * @param additionalEncryptionContext The additional encryption context of the portal.
     */
    public fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>)

    /**
     * @param authenticationType The type of authentication integration points used when signing
     * into the web portal. Defaults to `Standard` .
     * `Standard` web portals are authenticated directly through your identity provider (IdP). User
     * and group access to your web portal is controlled through your IdP. You need to include an IdP
     * resource in your template to integrate your IdP with your web portal. Completing the
     * configuration for your IdP requires exchanging WorkSpaces Secure Browser’s SP metadata with your
     * IdP’s IdP metadata. If your IdP requires the SP metadata first before returning the IdP
     * metadata, you should follow these steps:
     *
     *
     * * Create and deploy a CloudFormation template with a `Standard` portal with no
     * `IdentityProvider` resource.
     * * Retrieve the SP metadata using `Fn:GetAtt` , the WorkSpaces Secure Browser console, or by
     * the calling the `GetPortalServiceProviderMetadata` API.
     * * Submit the data to your IdP.
     * * Add an `IdentityProvider` resource to your CloudFormation template.
     *
     *
     * `IAM Identity Center` web portals are authenticated through AWS IAM Identity Center . They
     * provide additional features, such as IdP-initiated authentication. Identity sources (including
     * external identity provider integration) and other identity provider information must be
     * configured in IAM Identity Center . User and group assignment must be done through the
     * WorkSpaces Secure Browser console. These cannot be configured in CloudFormation.
     */
    public fun authenticationType(authenticationType: String)

    /**
     * @param browserSettingsArn The ARN of the browser settings that is associated with this web
     * portal.
     */
    public fun browserSettingsArn(browserSettingsArn: String)

    /**
     * @param customerManagedKey The customer managed key of the web portal.
     * *Pattern* : `^arn:[\w+=\/,.&#64;-]+:kms:[a-zA-Z0-9\-]*:[a-zA-Z0-9]{1,12}:key\/[a-zA-Z0-9-]+$`
     */
    public fun customerManagedKey(customerManagedKey: String)

    /**
     * @param dataProtectionSettingsArn The ARN of the data protection settings.
     */
    public fun dataProtectionSettingsArn(dataProtectionSettingsArn: String)

    /**
     * @param displayName The name of the web portal.
     */
    public fun displayName(displayName: String)

    /**
     * @param instanceType The type and resources of the underlying instance.
     */
    public fun instanceType(instanceType: String)

    /**
     * @param ipAccessSettingsArn The ARN of the IP access settings that is associated with the web
     * portal.
     */
    public fun ipAccessSettingsArn(ipAccessSettingsArn: String)

    /**
     * @param maxConcurrentSessions The maximum number of concurrent sessions for the portal.
     */
    public fun maxConcurrentSessions(maxConcurrentSessions: Number)

    /**
     * @param networkSettingsArn The ARN of the network settings that is associated with the web
     * portal.
     */
    public fun networkSettingsArn(networkSettingsArn: String)

    /**
     * @param tags The tags to add to the web portal.
     * A tag is a key-value pair.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to add to the web portal.
     * A tag is a key-value pair.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param trustStoreArn The ARN of the trust store that is associated with the web portal.
     */
    public fun trustStoreArn(trustStoreArn: String)

    /**
     * @param userAccessLoggingSettingsArn The ARN of the user access logging settings that is
     * associated with the web portal.
     */
    public fun userAccessLoggingSettingsArn(userAccessLoggingSettingsArn: String)

    /**
     * @param userSettingsArn The ARN of the user settings that is associated with the web portal.
     */
    public fun userSettingsArn(userSettingsArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.workspacesweb.CfnPortalProps.Builder =
        software.amazon.awscdk.services.workspacesweb.CfnPortalProps.builder()

    /**
     * @param additionalEncryptionContext The additional encryption context of the portal.
     */
    override fun additionalEncryptionContext(additionalEncryptionContext: IResolvable) {
      cdkBuilder.additionalEncryptionContext(additionalEncryptionContext.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param additionalEncryptionContext The additional encryption context of the portal.
     */
    override fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>) {
      cdkBuilder.additionalEncryptionContext(additionalEncryptionContext)
    }

    /**
     * @param authenticationType The type of authentication integration points used when signing
     * into the web portal. Defaults to `Standard` .
     * `Standard` web portals are authenticated directly through your identity provider (IdP). User
     * and group access to your web portal is controlled through your IdP. You need to include an IdP
     * resource in your template to integrate your IdP with your web portal. Completing the
     * configuration for your IdP requires exchanging WorkSpaces Secure Browser’s SP metadata with your
     * IdP’s IdP metadata. If your IdP requires the SP metadata first before returning the IdP
     * metadata, you should follow these steps:
     *
     *
     * * Create and deploy a CloudFormation template with a `Standard` portal with no
     * `IdentityProvider` resource.
     * * Retrieve the SP metadata using `Fn:GetAtt` , the WorkSpaces Secure Browser console, or by
     * the calling the `GetPortalServiceProviderMetadata` API.
     * * Submit the data to your IdP.
     * * Add an `IdentityProvider` resource to your CloudFormation template.
     *
     *
     * `IAM Identity Center` web portals are authenticated through AWS IAM Identity Center . They
     * provide additional features, such as IdP-initiated authentication. Identity sources (including
     * external identity provider integration) and other identity provider information must be
     * configured in IAM Identity Center . User and group assignment must be done through the
     * WorkSpaces Secure Browser console. These cannot be configured in CloudFormation.
     */
    override fun authenticationType(authenticationType: String) {
      cdkBuilder.authenticationType(authenticationType)
    }

    /**
     * @param browserSettingsArn The ARN of the browser settings that is associated with this web
     * portal.
     */
    override fun browserSettingsArn(browserSettingsArn: String) {
      cdkBuilder.browserSettingsArn(browserSettingsArn)
    }

    /**
     * @param customerManagedKey The customer managed key of the web portal.
     * *Pattern* : `^arn:[\w+=\/,.&#64;-]+:kms:[a-zA-Z0-9\-]*:[a-zA-Z0-9]{1,12}:key\/[a-zA-Z0-9-]+$`
     */
    override fun customerManagedKey(customerManagedKey: String) {
      cdkBuilder.customerManagedKey(customerManagedKey)
    }

    /**
     * @param dataProtectionSettingsArn The ARN of the data protection settings.
     */
    override fun dataProtectionSettingsArn(dataProtectionSettingsArn: String) {
      cdkBuilder.dataProtectionSettingsArn(dataProtectionSettingsArn)
    }

    /**
     * @param displayName The name of the web portal.
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * @param instanceType The type and resources of the underlying instance.
     */
    override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    /**
     * @param ipAccessSettingsArn The ARN of the IP access settings that is associated with the web
     * portal.
     */
    override fun ipAccessSettingsArn(ipAccessSettingsArn: String) {
      cdkBuilder.ipAccessSettingsArn(ipAccessSettingsArn)
    }

    /**
     * @param maxConcurrentSessions The maximum number of concurrent sessions for the portal.
     */
    override fun maxConcurrentSessions(maxConcurrentSessions: Number) {
      cdkBuilder.maxConcurrentSessions(maxConcurrentSessions)
    }

    /**
     * @param networkSettingsArn The ARN of the network settings that is associated with the web
     * portal.
     */
    override fun networkSettingsArn(networkSettingsArn: String) {
      cdkBuilder.networkSettingsArn(networkSettingsArn)
    }

    /**
     * @param tags The tags to add to the web portal.
     * A tag is a key-value pair.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags to add to the web portal.
     * A tag is a key-value pair.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param trustStoreArn The ARN of the trust store that is associated with the web portal.
     */
    override fun trustStoreArn(trustStoreArn: String) {
      cdkBuilder.trustStoreArn(trustStoreArn)
    }

    /**
     * @param userAccessLoggingSettingsArn The ARN of the user access logging settings that is
     * associated with the web portal.
     */
    override fun userAccessLoggingSettingsArn(userAccessLoggingSettingsArn: String) {
      cdkBuilder.userAccessLoggingSettingsArn(userAccessLoggingSettingsArn)
    }

    /**
     * @param userSettingsArn The ARN of the user settings that is associated with the web portal.
     */
    override fun userSettingsArn(userSettingsArn: String) {
      cdkBuilder.userSettingsArn(userSettingsArn)
    }

    public fun build(): software.amazon.awscdk.services.workspacesweb.CfnPortalProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.workspacesweb.CfnPortalProps,
  ) : CdkObject(cdkObject),
      CfnPortalProps {
    /**
     * The additional encryption context of the portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-additionalencryptioncontext)
     */
    override fun additionalEncryptionContext(): Any? = unwrap(this).getAdditionalEncryptionContext()

    /**
     * The type of authentication integration points used when signing into the web portal. Defaults
     * to `Standard` .
     *
     * `Standard` web portals are authenticated directly through your identity provider (IdP). User
     * and group access to your web portal is controlled through your IdP. You need to include an IdP
     * resource in your template to integrate your IdP with your web portal. Completing the
     * configuration for your IdP requires exchanging WorkSpaces Secure Browser’s SP metadata with your
     * IdP’s IdP metadata. If your IdP requires the SP metadata first before returning the IdP
     * metadata, you should follow these steps:
     *
     *
     * * Create and deploy a CloudFormation template with a `Standard` portal with no
     * `IdentityProvider` resource.
     * * Retrieve the SP metadata using `Fn:GetAtt` , the WorkSpaces Secure Browser console, or by
     * the calling the `GetPortalServiceProviderMetadata` API.
     * * Submit the data to your IdP.
     * * Add an `IdentityProvider` resource to your CloudFormation template.
     *
     *
     * `IAM Identity Center` web portals are authenticated through AWS IAM Identity Center . They
     * provide additional features, such as IdP-initiated authentication. Identity sources (including
     * external identity provider integration) and other identity provider information must be
     * configured in IAM Identity Center . User and group assignment must be done through the
     * WorkSpaces Secure Browser console. These cannot be configured in CloudFormation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-authenticationtype)
     */
    override fun authenticationType(): String? = unwrap(this).getAuthenticationType()

    /**
     * The ARN of the browser settings that is associated with this web portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-browsersettingsarn)
     */
    override fun browserSettingsArn(): String? = unwrap(this).getBrowserSettingsArn()

    /**
     * The customer managed key of the web portal.
     *
     * *Pattern* : `^arn:[\w+=\/,.&#64;-]+:kms:[a-zA-Z0-9\-]*:[a-zA-Z0-9]{1,12}:key\/[a-zA-Z0-9-]+$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-customermanagedkey)
     */
    override fun customerManagedKey(): String? = unwrap(this).getCustomerManagedKey()

    /**
     * The ARN of the data protection settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-dataprotectionsettingsarn)
     */
    override fun dataProtectionSettingsArn(): String? = unwrap(this).getDataProtectionSettingsArn()

    /**
     * The name of the web portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-displayname)
     */
    override fun displayName(): String? = unwrap(this).getDisplayName()

    /**
     * The type and resources of the underlying instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-instancetype)
     */
    override fun instanceType(): String? = unwrap(this).getInstanceType()

    /**
     * The ARN of the IP access settings that is associated with the web portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-ipaccesssettingsarn)
     */
    override fun ipAccessSettingsArn(): String? = unwrap(this).getIpAccessSettingsArn()

    /**
     * The maximum number of concurrent sessions for the portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-maxconcurrentsessions)
     */
    override fun maxConcurrentSessions(): Number? = unwrap(this).getMaxConcurrentSessions()

    /**
     * The ARN of the network settings that is associated with the web portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-networksettingsarn)
     */
    override fun networkSettingsArn(): String? = unwrap(this).getNetworkSettingsArn()

    /**
     * The tags to add to the web portal.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The ARN of the trust store that is associated with the web portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-truststorearn)
     */
    override fun trustStoreArn(): String? = unwrap(this).getTrustStoreArn()

    /**
     * The ARN of the user access logging settings that is associated with the web portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-useraccessloggingsettingsarn)
     */
    override fun userAccessLoggingSettingsArn(): String? =
        unwrap(this).getUserAccessLoggingSettingsArn()

    /**
     * The ARN of the user settings that is associated with the web portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-usersettingsarn)
     */
    override fun userSettingsArn(): String? = unwrap(this).getUserSettingsArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPortalProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.workspacesweb.CfnPortalProps):
        CfnPortalProps = CdkObjectWrappers.wrap(cdkObject) as? CfnPortalProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPortalProps):
        software.amazon.awscdk.services.workspacesweb.CfnPortalProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.workspacesweb.CfnPortalProps
  }
}
