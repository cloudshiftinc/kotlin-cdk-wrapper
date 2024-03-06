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
import software.amazon.awscdk.services.workspacesweb.CfnPortalProps

/**
 * Properties for defining a `CfnPortal`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.workspacesweb.*;
 * CfnPortalProps cfnPortalProps = CfnPortalProps.builder()
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
public class CfnPortalPropsDsl {
    private val cdkBuilder: CfnPortalProps.Builder = CfnPortalProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param additionalEncryptionContext The additional encryption context of the portal. */
    public fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>) {
        cdkBuilder.additionalEncryptionContext(additionalEncryptionContext)
    }

    /** @param additionalEncryptionContext The additional encryption context of the portal. */
    public fun additionalEncryptionContext(additionalEncryptionContext: IResolvable) {
        cdkBuilder.additionalEncryptionContext(additionalEncryptionContext)
    }

    /**
     * @param authenticationType The type of authentication integration points used when signing
     *   into the web portal. Defaults to `Standard` . `Standard` web portals are authenticated
     *   directly through your identity provider (IdP). User and group access to your web portal is
     *   controlled through your IdP. You need to include an IdP resource in your template to
     *   integrate your IdP with your web portal. Completing the configuration for your IdP requires
     *   exchanging WorkSpaces Web’s SP metadata with your IdP’s IdP metadata. If your IdP requires
     *   the SP metadata first before returning the IdP metadata, you should follow these steps:
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
     */
    public fun authenticationType(authenticationType: String) {
        cdkBuilder.authenticationType(authenticationType)
    }

    /**
     * @param browserSettingsArn The ARN of the browser settings that is associated with this web
     *   portal.
     */
    public fun browserSettingsArn(browserSettingsArn: String) {
        cdkBuilder.browserSettingsArn(browserSettingsArn)
    }

    /**
     * @param customerManagedKey The customer managed key of the web portal. *Pattern* :
     *   `^arn:[\w+=\/,.&#64;-]+:kms:[a-zA-Z0-9\-]*:[a-zA-Z0-9]{1,12}:key\/[a-zA-Z0-9-]+$`
     */
    public fun customerManagedKey(customerManagedKey: String) {
        cdkBuilder.customerManagedKey(customerManagedKey)
    }

    /** @param displayName The name of the web portal. */
    public fun displayName(displayName: String) {
        cdkBuilder.displayName(displayName)
    }

    /**
     * @param ipAccessSettingsArn The ARN of the IP access settings that is associated with the web
     *   portal.
     */
    public fun ipAccessSettingsArn(ipAccessSettingsArn: String) {
        cdkBuilder.ipAccessSettingsArn(ipAccessSettingsArn)
    }

    /**
     * @param networkSettingsArn The ARN of the network settings that is associated with the web
     *   portal.
     */
    public fun networkSettingsArn(networkSettingsArn: String) {
        cdkBuilder.networkSettingsArn(networkSettingsArn)
    }

    /** @param tags The tags to add to the web portal. A tag is a key-value pair. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags to add to the web portal. A tag is a key-value pair. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /** @param trustStoreArn The ARN of the trust store that is associated with the web portal. */
    public fun trustStoreArn(trustStoreArn: String) {
        cdkBuilder.trustStoreArn(trustStoreArn)
    }

    /**
     * @param userAccessLoggingSettingsArn The ARN of the user access logging settings that is
     *   associated with the web portal.
     */
    public fun userAccessLoggingSettingsArn(userAccessLoggingSettingsArn: String) {
        cdkBuilder.userAccessLoggingSettingsArn(userAccessLoggingSettingsArn)
    }

    /**
     * @param userSettingsArn The ARN of the user settings that is associated with the web portal.
     */
    public fun userSettingsArn(userSettingsArn: String) {
        cdkBuilder.userSettingsArn(userSettingsArn)
    }

    public fun build(): CfnPortalProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
