@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.workspacesweb

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * This resource specifies a web portal, which users use to start browsing sessions.
 *
 * A `Standard` web portal can't start browsing sessions unless you have at defined and associated
 * an `IdentityProvider` and `NetworkSettings` resource. An `IAM Identity Center` web portal does not
 * require an `IdentityProvider` resource.
 *
 * For more information about web portals, see [What is Amazon WorkSpaces
 * Web?](https://docs.aws.amazon.com/workspaces-web/latest/adminguide/what-is-workspaces-web.html.html)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.workspacesweb.*;
 * CfnPortal cfnPortal = CfnPortal.Builder.create(this, "MyCfnPortal")
 * .additionalEncryptionContext(Map.of(
 * "additionalEncryptionContextKey", "additionalEncryptionContext"))
 * .authenticationType("authenticationType")
 * .browserSettingsArn("browserSettingsArn")
 * .customerManagedKey("customerManagedKey")
 * .displayName("displayName")
 * .ipAccessSettingsArn("ipAccessSettingsArn")
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
public open class CfnPortal(
  cdkObject: software.amazon.awscdk.services.workspacesweb.CfnPortal,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.workspacesweb.CfnPortal(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPortalProps,
  ) :
      this(software.amazon.awscdk.services.workspacesweb.CfnPortal(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnPortalProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPortalProps.Builder.() -> Unit,
  ) : this(scope, id, CfnPortalProps(props)
  )

  /**
   * The additional encryption context of the portal.
   */
  public open fun additionalEncryptionContext(): Any? =
      unwrap(this).getAdditionalEncryptionContext()

  /**
   * The additional encryption context of the portal.
   */
  public open fun additionalEncryptionContext(`value`: IResolvable) {
    unwrap(this).setAdditionalEncryptionContext(`value`.let(IResolvable::unwrap))
  }

  /**
   * The additional encryption context of the portal.
   */
  public open fun additionalEncryptionContext(`value`: Map<String, String>) {
    unwrap(this).setAdditionalEncryptionContext(`value`)
  }

  /**
   * The browser that users see when using a streaming session.
   */
  public open fun attrBrowserType(): String = unwrap(this).getAttrBrowserType()

  /**
   * The creation date of the web portal.
   */
  public open fun attrCreationDate(): String = unwrap(this).getAttrCreationDate()

  /**
   * The ARN of the web portal.
   */
  public open fun attrPortalArn(): String = unwrap(this).getAttrPortalArn()

  /**
   * The endpoint URL of the web portal that users access in order to start streaming sessions.
   */
  public open fun attrPortalEndpoint(): String = unwrap(this).getAttrPortalEndpoint()

  /**
   * The status of the web portal.
   */
  public open fun attrPortalStatus(): String = unwrap(this).getAttrPortalStatus()

  /**
   * The renderer that is used in streaming sessions.
   */
  public open fun attrRendererType(): String = unwrap(this).getAttrRendererType()

  /**
   * The SAML metadata of the service provider.
   */
  public open fun attrServiceProviderSamlMetadata(): String =
      unwrap(this).getAttrServiceProviderSamlMetadata()

  /**
   * A message that explains why the web portal is in its current status.
   */
  public open fun attrStatusReason(): String = unwrap(this).getAttrStatusReason()

  /**
   * The type of authentication integration points used when signing into the web portal.
   *
   * Defaults to `Standard` .
   */
  public open fun authenticationType(): String? = unwrap(this).getAuthenticationType()

  /**
   * The type of authentication integration points used when signing into the web portal.
   *
   * Defaults to `Standard` .
   */
  public open fun authenticationType(`value`: String) {
    unwrap(this).setAuthenticationType(`value`)
  }

  /**
   * The ARN of the browser settings that is associated with this web portal.
   */
  public open fun browserSettingsArn(): String? = unwrap(this).getBrowserSettingsArn()

  /**
   * The ARN of the browser settings that is associated with this web portal.
   */
  public open fun browserSettingsArn(`value`: String) {
    unwrap(this).setBrowserSettingsArn(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The customer managed key of the web portal.
   */
  public open fun customerManagedKey(): String? = unwrap(this).getCustomerManagedKey()

  /**
   * The customer managed key of the web portal.
   */
  public open fun customerManagedKey(`value`: String) {
    unwrap(this).setCustomerManagedKey(`value`)
  }

  /**
   * The name of the web portal.
   */
  public open fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * The name of the web portal.
   */
  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
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
   * The ARN of the IP access settings that is associated with the web portal.
   */
  public open fun ipAccessSettingsArn(): String? = unwrap(this).getIpAccessSettingsArn()

  /**
   * The ARN of the IP access settings that is associated with the web portal.
   */
  public open fun ipAccessSettingsArn(`value`: String) {
    unwrap(this).setIpAccessSettingsArn(`value`)
  }

  /**
   * The ARN of the network settings that is associated with the web portal.
   */
  public open fun networkSettingsArn(): String? = unwrap(this).getNetworkSettingsArn()

  /**
   * The ARN of the network settings that is associated with the web portal.
   */
  public open fun networkSettingsArn(`value`: String) {
    unwrap(this).setNetworkSettingsArn(`value`)
  }

  /**
   * The tags to add to the web portal.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags to add to the web portal.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags to add to the web portal.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The ARN of the trust store that is associated with the web portal.
   */
  public open fun trustStoreArn(): String? = unwrap(this).getTrustStoreArn()

  /**
   * The ARN of the trust store that is associated with the web portal.
   */
  public open fun trustStoreArn(`value`: String) {
    unwrap(this).setTrustStoreArn(`value`)
  }

  /**
   * The ARN of the user access logging settings that is associated with the web portal.
   */
  public open fun userAccessLoggingSettingsArn(): String? =
      unwrap(this).getUserAccessLoggingSettingsArn()

  /**
   * The ARN of the user access logging settings that is associated with the web portal.
   */
  public open fun userAccessLoggingSettingsArn(`value`: String) {
    unwrap(this).setUserAccessLoggingSettingsArn(`value`)
  }

  /**
   * The ARN of the user settings that is associated with the web portal.
   */
  public open fun userSettingsArn(): String? = unwrap(this).getUserSettingsArn()

  /**
   * The ARN of the user settings that is associated with the web portal.
   */
  public open fun userSettingsArn(`value`: String) {
    unwrap(this).setUserSettingsArn(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.workspacesweb.CfnPortal].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The additional encryption context of the portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-additionalencryptioncontext)
     * @param additionalEncryptionContext The additional encryption context of the portal. 
     */
    public fun additionalEncryptionContext(additionalEncryptionContext: IResolvable)

    /**
     * The additional encryption context of the portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-additionalencryptioncontext)
     * @param additionalEncryptionContext The additional encryption context of the portal. 
     */
    public fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>)

    /**
     * The type of authentication integration points used when signing into the web portal. Defaults
     * to `Standard` .
     *
     * `Standard` web portals are authenticated directly through your identity provider (IdP). User
     * and group access to your web portal is controlled through your IdP. You need to include an IdP
     * resource in your template to integrate your IdP with your web portal. Completing the
     * configuration for your IdP requires exchanging WorkSpaces Web’s SP metadata with your IdP’s IdP
     * metadata. If your IdP requires the SP metadata first before returning the IdP metadata, you
     * should follow these steps:
     *
     *
     * * Create and deploy a CloudFormation template with a `Standard` portal with no
     * `IdentityProvider` resource.
     * * Retrieve the SP metadata using `Fn:GetAtt` , the WorkSpaces Web console, or by the calling
     * the `GetPortalServiceProviderMetadata` API.
     * * Submit the data to your IdP.
     * * Add an `IdentityProvider` resource to your CloudFormation template.
     *
     *
     * `IAM Identity Center` web portals are authenticated through AWS IAM Identity Center . They
     * provide additional features, such as IdP-initiated authentication. Identity sources (including
     * external identity provider integration) and other identity provider information must be
     * configured in IAM Identity Center . User and group assignment must be done through the
     * WorkSpaces Web console. These cannot be configured in CloudFormation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-authenticationtype)
     * @param authenticationType The type of authentication integration points used when signing
     * into the web portal. Defaults to `Standard` . 
     */
    public fun authenticationType(authenticationType: String)

    /**
     * The ARN of the browser settings that is associated with this web portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-browsersettingsarn)
     * @param browserSettingsArn The ARN of the browser settings that is associated with this web
     * portal. 
     */
    public fun browserSettingsArn(browserSettingsArn: String)

    /**
     * The customer managed key of the web portal.
     *
     * *Pattern* : `^arn:[\w+=\/,.&#64;-]+:kms:[a-zA-Z0-9\-]*:[a-zA-Z0-9]{1,12}:key\/[a-zA-Z0-9-]+$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-customermanagedkey)
     * @param customerManagedKey The customer managed key of the web portal. 
     */
    public fun customerManagedKey(customerManagedKey: String)

    /**
     * The name of the web portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-displayname)
     * @param displayName The name of the web portal. 
     */
    public fun displayName(displayName: String)

    /**
     * The ARN of the IP access settings that is associated with the web portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-ipaccesssettingsarn)
     * @param ipAccessSettingsArn The ARN of the IP access settings that is associated with the web
     * portal. 
     */
    public fun ipAccessSettingsArn(ipAccessSettingsArn: String)

    /**
     * The ARN of the network settings that is associated with the web portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-networksettingsarn)
     * @param networkSettingsArn The ARN of the network settings that is associated with the web
     * portal. 
     */
    public fun networkSettingsArn(networkSettingsArn: String)

    /**
     * The tags to add to the web portal.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-tags)
     * @param tags The tags to add to the web portal. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags to add to the web portal.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-tags)
     * @param tags The tags to add to the web portal. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The ARN of the trust store that is associated with the web portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-truststorearn)
     * @param trustStoreArn The ARN of the trust store that is associated with the web portal. 
     */
    public fun trustStoreArn(trustStoreArn: String)

    /**
     * The ARN of the user access logging settings that is associated with the web portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-useraccessloggingsettingsarn)
     * @param userAccessLoggingSettingsArn The ARN of the user access logging settings that is
     * associated with the web portal. 
     */
    public fun userAccessLoggingSettingsArn(userAccessLoggingSettingsArn: String)

    /**
     * The ARN of the user settings that is associated with the web portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-usersettingsarn)
     * @param userSettingsArn The ARN of the user settings that is associated with the web portal. 
     */
    public fun userSettingsArn(userSettingsArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.workspacesweb.CfnPortal.Builder =
        software.amazon.awscdk.services.workspacesweb.CfnPortal.Builder.create(scope, id)

    /**
     * The additional encryption context of the portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-additionalencryptioncontext)
     * @param additionalEncryptionContext The additional encryption context of the portal. 
     */
    override fun additionalEncryptionContext(additionalEncryptionContext: IResolvable) {
      cdkBuilder.additionalEncryptionContext(additionalEncryptionContext.let(IResolvable::unwrap))
    }

    /**
     * The additional encryption context of the portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-additionalencryptioncontext)
     * @param additionalEncryptionContext The additional encryption context of the portal. 
     */
    override fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>) {
      cdkBuilder.additionalEncryptionContext(additionalEncryptionContext)
    }

    /**
     * The type of authentication integration points used when signing into the web portal. Defaults
     * to `Standard` .
     *
     * `Standard` web portals are authenticated directly through your identity provider (IdP). User
     * and group access to your web portal is controlled through your IdP. You need to include an IdP
     * resource in your template to integrate your IdP with your web portal. Completing the
     * configuration for your IdP requires exchanging WorkSpaces Web’s SP metadata with your IdP’s IdP
     * metadata. If your IdP requires the SP metadata first before returning the IdP metadata, you
     * should follow these steps:
     *
     *
     * * Create and deploy a CloudFormation template with a `Standard` portal with no
     * `IdentityProvider` resource.
     * * Retrieve the SP metadata using `Fn:GetAtt` , the WorkSpaces Web console, or by the calling
     * the `GetPortalServiceProviderMetadata` API.
     * * Submit the data to your IdP.
     * * Add an `IdentityProvider` resource to your CloudFormation template.
     *
     *
     * `IAM Identity Center` web portals are authenticated through AWS IAM Identity Center . They
     * provide additional features, such as IdP-initiated authentication. Identity sources (including
     * external identity provider integration) and other identity provider information must be
     * configured in IAM Identity Center . User and group assignment must be done through the
     * WorkSpaces Web console. These cannot be configured in CloudFormation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-authenticationtype)
     * @param authenticationType The type of authentication integration points used when signing
     * into the web portal. Defaults to `Standard` . 
     */
    override fun authenticationType(authenticationType: String) {
      cdkBuilder.authenticationType(authenticationType)
    }

    /**
     * The ARN of the browser settings that is associated with this web portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-browsersettingsarn)
     * @param browserSettingsArn The ARN of the browser settings that is associated with this web
     * portal. 
     */
    override fun browserSettingsArn(browserSettingsArn: String) {
      cdkBuilder.browserSettingsArn(browserSettingsArn)
    }

    /**
     * The customer managed key of the web portal.
     *
     * *Pattern* : `^arn:[\w+=\/,.&#64;-]+:kms:[a-zA-Z0-9\-]*:[a-zA-Z0-9]{1,12}:key\/[a-zA-Z0-9-]+$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-customermanagedkey)
     * @param customerManagedKey The customer managed key of the web portal. 
     */
    override fun customerManagedKey(customerManagedKey: String) {
      cdkBuilder.customerManagedKey(customerManagedKey)
    }

    /**
     * The name of the web portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-displayname)
     * @param displayName The name of the web portal. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * The ARN of the IP access settings that is associated with the web portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-ipaccesssettingsarn)
     * @param ipAccessSettingsArn The ARN of the IP access settings that is associated with the web
     * portal. 
     */
    override fun ipAccessSettingsArn(ipAccessSettingsArn: String) {
      cdkBuilder.ipAccessSettingsArn(ipAccessSettingsArn)
    }

    /**
     * The ARN of the network settings that is associated with the web portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-networksettingsarn)
     * @param networkSettingsArn The ARN of the network settings that is associated with the web
     * portal. 
     */
    override fun networkSettingsArn(networkSettingsArn: String) {
      cdkBuilder.networkSettingsArn(networkSettingsArn)
    }

    /**
     * The tags to add to the web portal.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-tags)
     * @param tags The tags to add to the web portal. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags to add to the web portal.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-tags)
     * @param tags The tags to add to the web portal. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The ARN of the trust store that is associated with the web portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-truststorearn)
     * @param trustStoreArn The ARN of the trust store that is associated with the web portal. 
     */
    override fun trustStoreArn(trustStoreArn: String) {
      cdkBuilder.trustStoreArn(trustStoreArn)
    }

    /**
     * The ARN of the user access logging settings that is associated with the web portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-useraccessloggingsettingsarn)
     * @param userAccessLoggingSettingsArn The ARN of the user access logging settings that is
     * associated with the web portal. 
     */
    override fun userAccessLoggingSettingsArn(userAccessLoggingSettingsArn: String) {
      cdkBuilder.userAccessLoggingSettingsArn(userAccessLoggingSettingsArn)
    }

    /**
     * The ARN of the user settings that is associated with the web portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-usersettingsarn)
     * @param userSettingsArn The ARN of the user settings that is associated with the web portal. 
     */
    override fun userSettingsArn(userSettingsArn: String) {
      cdkBuilder.userSettingsArn(userSettingsArn)
    }

    public fun build(): software.amazon.awscdk.services.workspacesweb.CfnPortal = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.workspacesweb.CfnPortal.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPortal {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPortal(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.workspacesweb.CfnPortal): CfnPortal
        = CfnPortal(cdkObject)

    internal fun unwrap(wrapped: CfnPortal): software.amazon.awscdk.services.workspacesweb.CfnPortal
        = wrapped.cdkObject as software.amazon.awscdk.services.workspacesweb.CfnPortal
  }
}
