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
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettings
import software.constructs.Construct

/**
 * This resource specifies IP access settings that can be associated with a web portal.
 *
 * For more information, see
 * [Set up IP access controls (optional)](https://docs.aws.amazon.com/workspaces-web/latest/adminguide/ip-access-controls.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.workspacesweb.*;
 * CfnIpAccessSettings cfnIpAccessSettings = CfnIpAccessSettings.Builder.create(this,
 * "MyCfnIpAccessSettings")
 * .ipRules(List.of(IpRuleProperty.builder()
 * .ipRange("ipRange")
 * // the properties below are optional
 * .description("description")
 * .build()))
 * // the properties below are optional
 * .additionalEncryptionContext(Map.of(
 * "additionalEncryptionContextKey", "additionalEncryptionContext"))
 * .customerManagedKey("customerManagedKey")
 * .description("description")
 * .displayName("displayName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-ipaccesssettings.html)
 */
@CdkDslMarker
public class CfnIpAccessSettingsDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnIpAccessSettings.Builder =
        CfnIpAccessSettings.Builder.create(scope, id)

    private val _ipRules: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * Additional encryption context of the IP access settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-ipaccesssettings.html#cfn-workspacesweb-ipaccesssettings-additionalencryptioncontext)
     *
     * @param additionalEncryptionContext Additional encryption context of the IP access settings.
     */
    public fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>) {
        cdkBuilder.additionalEncryptionContext(additionalEncryptionContext)
    }

    /**
     * Additional encryption context of the IP access settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-ipaccesssettings.html#cfn-workspacesweb-ipaccesssettings-additionalencryptioncontext)
     *
     * @param additionalEncryptionContext Additional encryption context of the IP access settings.
     */
    public fun additionalEncryptionContext(additionalEncryptionContext: IResolvable) {
        cdkBuilder.additionalEncryptionContext(additionalEncryptionContext)
    }

    /**
     * The custom managed key of the IP access settings.
     *
     * *Pattern* : `^arn:[\w+=\/,.&#64;-]+:kms:[a-zA-Z0-9\-]*:[a-zA-Z0-9]{1,12}:key\/[a-zA-Z0-9-]+$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-ipaccesssettings.html#cfn-workspacesweb-ipaccesssettings-customermanagedkey)
     *
     * @param customerManagedKey The custom managed key of the IP access settings.
     */
    public fun customerManagedKey(customerManagedKey: String) {
        cdkBuilder.customerManagedKey(customerManagedKey)
    }

    /**
     * The description of the IP access settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-ipaccesssettings.html#cfn-workspacesweb-ipaccesssettings-description)
     *
     * @param description The description of the IP access settings.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The display name of the IP access settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-ipaccesssettings.html#cfn-workspacesweb-ipaccesssettings-displayname)
     *
     * @param displayName The display name of the IP access settings.
     */
    public fun displayName(displayName: String) {
        cdkBuilder.displayName(displayName)
    }

    /**
     * The IP rules of the IP access settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-ipaccesssettings.html#cfn-workspacesweb-ipaccesssettings-iprules)
     *
     * @param ipRules The IP rules of the IP access settings.
     */
    public fun ipRules(vararg ipRules: Any) {
        _ipRules.addAll(listOf(*ipRules))
    }

    /**
     * The IP rules of the IP access settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-ipaccesssettings.html#cfn-workspacesweb-ipaccesssettings-iprules)
     *
     * @param ipRules The IP rules of the IP access settings.
     */
    public fun ipRules(ipRules: Collection<Any>) {
        _ipRules.addAll(ipRules)
    }

    /**
     * The IP rules of the IP access settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-ipaccesssettings.html#cfn-workspacesweb-ipaccesssettings-iprules)
     *
     * @param ipRules The IP rules of the IP access settings.
     */
    public fun ipRules(ipRules: IResolvable) {
        cdkBuilder.ipRules(ipRules)
    }

    /**
     * The tags to add to the browser settings resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-ipaccesssettings.html#cfn-workspacesweb-ipaccesssettings-tags)
     *
     * @param tags The tags to add to the browser settings resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags to add to the browser settings resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-ipaccesssettings.html#cfn-workspacesweb-ipaccesssettings-tags)
     *
     * @param tags The tags to add to the browser settings resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnIpAccessSettings {
        if (_ipRules.isNotEmpty()) cdkBuilder.ipRules(_ipRules)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
