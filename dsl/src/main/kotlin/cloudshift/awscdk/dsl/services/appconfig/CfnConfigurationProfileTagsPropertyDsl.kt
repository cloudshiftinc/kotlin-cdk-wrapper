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

package cloudshift.awscdk.dsl.services.appconfig

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appconfig.CfnConfigurationProfile

/**
 * Metadata to assign to the configuration profile.
 *
 * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key and an
 * optional value, both of which you define.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appconfig.*;
 * TagsProperty tagsProperty = TagsProperty.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-configurationprofile-tags.html)
 */
@CdkDslMarker
public class CfnConfigurationProfileTagsPropertyDsl {
    private val cdkBuilder: CfnConfigurationProfile.TagsProperty.Builder =
        CfnConfigurationProfile.TagsProperty.builder()

    /**
     * @param key The key-value string map. The valid character set is `[a-zA-Z+-=._:/]` . The tag
     *   key can be up to 128 characters and must not start with `aws:` .
     */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /** @param value The tag value can be up to 256 characters. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnConfigurationProfile.TagsProperty = cdkBuilder.build()
}
