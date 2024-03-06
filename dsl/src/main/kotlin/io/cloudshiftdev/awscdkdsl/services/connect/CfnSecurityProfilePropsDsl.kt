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

package io.cloudshiftdev.awscdkdsl.services.connect

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnSecurityProfileProps

/**
 * Properties for defining a `CfnSecurityProfile`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * CfnSecurityProfileProps cfnSecurityProfileProps = CfnSecurityProfileProps.builder()
 * .instanceArn("instanceArn")
 * .securityProfileName("securityProfileName")
 * // the properties below are optional
 * .allowedAccessControlTags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .description("description")
 * .permissions(List.of("permissions"))
 * .tagRestrictedResources(List.of("tagRestrictedResources"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securityprofile.html)
 */
@CdkDslMarker
public class CfnSecurityProfilePropsDsl {
    private val cdkBuilder: CfnSecurityProfileProps.Builder = CfnSecurityProfileProps.builder()

    private val _allowedAccessControlTags: MutableList<Any> = mutableListOf()

    private val _permissions: MutableList<String> = mutableListOf()

    private val _tagRestrictedResources: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param allowedAccessControlTags The list of tags that a security profile uses to restrict
     *   access to resources in Amazon Connect.
     */
    public fun allowedAccessControlTags(vararg allowedAccessControlTags: Any) {
        _allowedAccessControlTags.addAll(listOf(*allowedAccessControlTags))
    }

    /**
     * @param allowedAccessControlTags The list of tags that a security profile uses to restrict
     *   access to resources in Amazon Connect.
     */
    public fun allowedAccessControlTags(allowedAccessControlTags: Collection<Any>) {
        _allowedAccessControlTags.addAll(allowedAccessControlTags)
    }

    /**
     * @param allowedAccessControlTags The list of tags that a security profile uses to restrict
     *   access to resources in Amazon Connect.
     */
    public fun allowedAccessControlTags(allowedAccessControlTags: IResolvable) {
        cdkBuilder.allowedAccessControlTags(allowedAccessControlTags)
    }

    /** @param description The description of the security profile. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param instanceArn The identifier of the Amazon Connect instance. */
    public fun instanceArn(instanceArn: String) {
        cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * @param permissions Permissions assigned to the security profile. For a list of valid
     *   permissions, see
     *   [List of security profile permissions](https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-list.html)
     *   .
     */
    public fun permissions(vararg permissions: String) {
        _permissions.addAll(listOf(*permissions))
    }

    /**
     * @param permissions Permissions assigned to the security profile. For a list of valid
     *   permissions, see
     *   [List of security profile permissions](https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-list.html)
     *   .
     */
    public fun permissions(permissions: Collection<String>) {
        _permissions.addAll(permissions)
    }

    /** @param securityProfileName The name for the security profile. */
    public fun securityProfileName(securityProfileName: String) {
        cdkBuilder.securityProfileName(securityProfileName)
    }

    /**
     * @param tagRestrictedResources The list of resources that a security profile applies tag
     *   restrictions to in Amazon Connect.
     */
    public fun tagRestrictedResources(vararg tagRestrictedResources: String) {
        _tagRestrictedResources.addAll(listOf(*tagRestrictedResources))
    }

    /**
     * @param tagRestrictedResources The list of resources that a security profile applies tag
     *   restrictions to in Amazon Connect.
     */
    public fun tagRestrictedResources(tagRestrictedResources: Collection<String>) {
        _tagRestrictedResources.addAll(tagRestrictedResources)
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource. For
     *   example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource. For
     *   example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnSecurityProfileProps {
        if (_allowedAccessControlTags.isNotEmpty())
            cdkBuilder.allowedAccessControlTags(_allowedAccessControlTags)
        if (_permissions.isNotEmpty()) cdkBuilder.permissions(_permissions)
        if (_tagRestrictedResources.isNotEmpty())
            cdkBuilder.tagRestrictedResources(_tagRestrictedResources)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
