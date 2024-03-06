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
import software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettingsProps

/**
 * Properties for defining a `CfnIpAccessSettings`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.workspacesweb.*;
 * CfnIpAccessSettingsProps cfnIpAccessSettingsProps = CfnIpAccessSettingsProps.builder()
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
public class CfnIpAccessSettingsPropsDsl {
    private val cdkBuilder: CfnIpAccessSettingsProps.Builder = CfnIpAccessSettingsProps.builder()

    private val _ipRules: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param additionalEncryptionContext Additional encryption context of the IP access settings.
     */
    public fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>) {
        cdkBuilder.additionalEncryptionContext(additionalEncryptionContext)
    }

    /**
     * @param additionalEncryptionContext Additional encryption context of the IP access settings.
     */
    public fun additionalEncryptionContext(additionalEncryptionContext: IResolvable) {
        cdkBuilder.additionalEncryptionContext(additionalEncryptionContext)
    }

    /**
     * @param customerManagedKey The custom managed key of the IP access settings. *Pattern* :
     *   `^arn:[\w+=\/,.&#64;-]+:kms:[a-zA-Z0-9\-]*:[a-zA-Z0-9]{1,12}:key\/[a-zA-Z0-9-]+$`
     */
    public fun customerManagedKey(customerManagedKey: String) {
        cdkBuilder.customerManagedKey(customerManagedKey)
    }

    /** @param description The description of the IP access settings. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param displayName The display name of the IP access settings. */
    public fun displayName(displayName: String) {
        cdkBuilder.displayName(displayName)
    }

    /** @param ipRules The IP rules of the IP access settings. */
    public fun ipRules(vararg ipRules: Any) {
        _ipRules.addAll(listOf(*ipRules))
    }

    /** @param ipRules The IP rules of the IP access settings. */
    public fun ipRules(ipRules: Collection<Any>) {
        _ipRules.addAll(ipRules)
    }

    /** @param ipRules The IP rules of the IP access settings. */
    public fun ipRules(ipRules: IResolvable) {
        cdkBuilder.ipRules(ipRules)
    }

    /** @param tags The tags to add to the browser settings resource. A tag is a key-value pair. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags to add to the browser settings resource. A tag is a key-value pair. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnIpAccessSettingsProps {
        if (_ipRules.isNotEmpty()) cdkBuilder.ipRules(_ipRules)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
