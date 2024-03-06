@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.workspacesweb

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.workspacesweb.CfnPortal
import software.constructs.Construct

/**
 * This resource specifies a web portal, which users use to start browsing sessions.
 *
 * A `Standard` web portal can't start browsing sessions unless you have at defined and associated
 * an `IdentityProvider` and `NetworkSettings` resource. An `IAM Identity Center` web portal does
 * not require an `IdentityProvider` resource.
 *
 * For more information about web portals, see
 * [What is Amazon WorkSpaces Web?](https://docs.aws.amazon.com/workspaces-web/latest/adminguide/what-is-workspaces-web.html.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.workspacesweb.*;
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
@CdkDslMarker
public class CfnPortalDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnPortal.Builder = CfnPortal.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The additional encryption context of the portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-additionalencryptioncontext)
     *
     * @param additionalEncryptionContext The additional encryption context of the portal.
     */
    public fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>) {
        cdkBuilder.additionalEncryptionContext(additionalEncryptionContext)
    }

    /**
     * The additional encryption context of the portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-additionalencryptioncontext)
     *
     * @param additionalEncryptionContext The additional encryption context of the portal.
     */
    public fun additionalEncryptionContext(additionalEncryptionContext: IResolvable) {
        cdkBuilder.additionalEncryptionContext(additionalEncryptionContext)
    }

    /**
     * The type of authentication integration points used when signing into the web portal. Defaults
     * to `Standard` .
     *
     * `Standard` web portals are authenticated directly through your identity provider (IdP). User
     * and group access to your web portal is controlled through your IdP. You need to include an
     * IdP resource in your template to integrate your IdP with your web portal. Completing the
     * configuration for your IdP requires exchanging WorkSpaces Web’s SP metadata with your IdP’s
     * IdP metadata. If your IdP requires the SP metadata first before returning the IdP metadata,
     * you should follow these steps:
     * * Create and deploy a CloudFormation template with a `Standard` portal with no
     *   `IdentityProvider` resource.
     * * Retrieve the SP metadata using `Fn:GetAtt` , the WorkSpaces Web console, or by the calling
     *   the `GetPortalServiceProviderMetadata` API.
     * * Submit the data to your IdP.
     * * Add an `IdentityProvider` resource to your CloudFormation template.
     *
     * `IAM Identity Center` web portals are authenticated through AWS IAM Identity Center . They
     * provide additional features, such as IdP-initiated authentication. Identity sources
     * (including external identity provider integration) and other identity provider information
     * must be configured in IAM Identity Center . User and group assignment must be done through
     * the WorkSpaces Web console. These cannot be configured in CloudFormation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-authenticationtype)
     *
     * @param authenticationType The type of authentication integration points used when signing
     *   into the web portal. Defaults to `Standard` .
     */
    public fun authenticationType(authenticationType: String) {
        cdkBuilder.authenticationType(authenticationType)
    }

    /**
     * The ARN of the browser settings that is associated with this web portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-browsersettingsarn)
     *
     * @param browserSettingsArn The ARN of the browser settings that is associated with this web
     *   portal.
     */
    public fun browserSettingsArn(browserSettingsArn: String) {
        cdkBuilder.browserSettingsArn(browserSettingsArn)
    }

    /**
     * The customer managed key of the web portal.
     *
     * *Pattern* : `^arn:[\w+=\/,.&#64;-]+:kms:[a-zA-Z0-9\-]*:[a-zA-Z0-9]{1,12}:key\/[a-zA-Z0-9-]+$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-customermanagedkey)
     *
     * @param customerManagedKey The customer managed key of the web portal.
     */
    public fun customerManagedKey(customerManagedKey: String) {
        cdkBuilder.customerManagedKey(customerManagedKey)
    }

    /**
     * The name of the web portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-displayname)
     *
     * @param displayName The name of the web portal.
     */
    public fun displayName(displayName: String) {
        cdkBuilder.displayName(displayName)
    }

    /**
     * The ARN of the IP access settings that is associated with the web portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-ipaccesssettingsarn)
     *
     * @param ipAccessSettingsArn The ARN of the IP access settings that is associated with the web
     *   portal.
     */
    public fun ipAccessSettingsArn(ipAccessSettingsArn: String) {
        cdkBuilder.ipAccessSettingsArn(ipAccessSettingsArn)
    }

    /**
     * The ARN of the network settings that is associated with the web portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-networksettingsarn)
     *
     * @param networkSettingsArn The ARN of the network settings that is associated with the web
     *   portal.
     */
    public fun networkSettingsArn(networkSettingsArn: String) {
        cdkBuilder.networkSettingsArn(networkSettingsArn)
    }

    /**
     * The tags to add to the web portal.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-tags)
     *
     * @param tags The tags to add to the web portal.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags to add to the web portal.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-tags)
     *
     * @param tags The tags to add to the web portal.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The ARN of the trust store that is associated with the web portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-truststorearn)
     *
     * @param trustStoreArn The ARN of the trust store that is associated with the web portal.
     */
    public fun trustStoreArn(trustStoreArn: String) {
        cdkBuilder.trustStoreArn(trustStoreArn)
    }

    /**
     * The ARN of the user access logging settings that is associated with the web portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-useraccessloggingsettingsarn)
     *
     * @param userAccessLoggingSettingsArn The ARN of the user access logging settings that is
     *   associated with the web portal.
     */
    public fun userAccessLoggingSettingsArn(userAccessLoggingSettingsArn: String) {
        cdkBuilder.userAccessLoggingSettingsArn(userAccessLoggingSettingsArn)
    }

    /**
     * The ARN of the user settings that is associated with the web portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html#cfn-workspacesweb-portal-usersettingsarn)
     *
     * @param userSettingsArn The ARN of the user settings that is associated with the web portal.
     */
    public fun userSettingsArn(userSettingsArn: String) {
        cdkBuilder.userSettingsArn(userSettingsArn)
    }

    public fun build(): CfnPortal {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
