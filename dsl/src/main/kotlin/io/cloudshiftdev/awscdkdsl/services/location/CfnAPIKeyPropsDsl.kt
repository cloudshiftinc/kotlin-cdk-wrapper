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

package io.cloudshiftdev.awscdkdsl.services.location

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.location.CfnAPIKey
import software.amazon.awscdk.services.location.CfnAPIKeyProps

/**
 * Properties for defining a `CfnAPIKey`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.location.*;
 * CfnAPIKeyProps cfnAPIKeyProps = CfnAPIKeyProps.builder()
 * .keyName("keyName")
 * .restrictions(ApiKeyRestrictionsProperty.builder()
 * .allowActions(List.of("allowActions"))
 * .allowResources(List.of("allowResources"))
 * // the properties below are optional
 * .allowReferers(List.of("allowReferers"))
 * .build())
 * // the properties below are optional
 * .description("description")
 * .expireTime("expireTime")
 * .forceDelete(false)
 * .forceUpdate(false)
 * .noExpiry(false)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-apikey.html)
 */
@CdkDslMarker
public class CfnAPIKeyPropsDsl {
    private val cdkBuilder: CfnAPIKeyProps.Builder = CfnAPIKeyProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param description Updates the description for the API key resource. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param expireTime The optional timestamp for when the API key resource will expire in
     *   [ISO 8601 format](https://docs.aws.amazon.com/https://www.iso.org/iso-8601-date-and-time-format.html)
     *   .
     */
    public fun expireTime(expireTime: String) {
        cdkBuilder.expireTime(expireTime)
    }

    /**
     * @param forceDelete ForceDelete bypasses an API key's expiry conditions and deletes the key.
     *   Set the parameter `true` to delete the key or to `false` to not preemptively delete the API
     *   key.
     *
     * Valid values: `true` , or `false` .
     *
     * This action is irreversible. Only use ForceDelete if you are certain the key is no longer in
     * use.
     */
    public fun forceDelete(forceDelete: Boolean) {
        cdkBuilder.forceDelete(forceDelete)
    }

    /**
     * @param forceDelete ForceDelete bypasses an API key's expiry conditions and deletes the key.
     *   Set the parameter `true` to delete the key or to `false` to not preemptively delete the API
     *   key.
     *
     * Valid values: `true` , or `false` .
     *
     * This action is irreversible. Only use ForceDelete if you are certain the key is no longer in
     * use.
     */
    public fun forceDelete(forceDelete: IResolvable) {
        cdkBuilder.forceDelete(forceDelete)
    }

    /**
     * @param forceUpdate The boolean flag to be included for updating `ExpireTime` or Restrictions
     *   details. Must be set to `true` to update an API key resource that has been used in the past
     *   7 days. `False` if force update is not preferred.
     */
    public fun forceUpdate(forceUpdate: Boolean) {
        cdkBuilder.forceUpdate(forceUpdate)
    }

    /**
     * @param forceUpdate The boolean flag to be included for updating `ExpireTime` or Restrictions
     *   details. Must be set to `true` to update an API key resource that has been used in the past
     *   7 days. `False` if force update is not preferred.
     */
    public fun forceUpdate(forceUpdate: IResolvable) {
        cdkBuilder.forceUpdate(forceUpdate)
    }

    /**
     * @param keyName A custom name for the API key resource. Requirements:
     * * Contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-), periods (.), and
     *   underscores (_).
     * * Must be a unique API key name.
     * * No spaces allowed. For example, `ExampleAPIKey` .
     */
    public fun keyName(keyName: String) {
        cdkBuilder.keyName(keyName)
    }

    /**
     * @param noExpiry Whether the API key should expire. Set to `true` to set the API key to have
     *   no expiration time.
     */
    public fun noExpiry(noExpiry: Boolean) {
        cdkBuilder.noExpiry(noExpiry)
    }

    /**
     * @param noExpiry Whether the API key should expire. Set to `true` to set the API key to have
     *   no expiration time.
     */
    public fun noExpiry(noExpiry: IResolvable) {
        cdkBuilder.noExpiry(noExpiry)
    }

    /** @param restrictions The API key restrictions for the API key resource. */
    public fun restrictions(restrictions: IResolvable) {
        cdkBuilder.restrictions(restrictions)
    }

    /** @param restrictions The API key restrictions for the API key resource. */
    public fun restrictions(restrictions: CfnAPIKey.ApiKeyRestrictionsProperty) {
        cdkBuilder.restrictions(restrictions)
    }

    /**
     * @param tags Applies one or more tags to the map resource. A tag is a key-value pair that
     *   helps manage, identify, search, and filter your resources by labelling them.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags Applies one or more tags to the map resource. A tag is a key-value pair that
     *   helps manage, identify, search, and filter your resources by labelling them.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnAPIKeyProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
