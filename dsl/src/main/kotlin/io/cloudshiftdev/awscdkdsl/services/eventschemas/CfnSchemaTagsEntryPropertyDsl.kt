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

package io.cloudshiftdev.awscdkdsl.services.eventschemas

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.eventschemas.CfnSchema

/**
 * Tags to associate with the schema.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.eventschemas.*;
 * TagsEntryProperty tagsEntryProperty = TagsEntryProperty.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eventschemas-schema-tagsentry.html)
 */
@CdkDslMarker
public class CfnSchemaTagsEntryPropertyDsl {
    private val cdkBuilder: CfnSchema.TagsEntryProperty.Builder =
        CfnSchema.TagsEntryProperty.builder()

    /** @param key They key of a key-value pair. */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /** @param value They value of a key-value pair. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnSchema.TagsEntryProperty = cdkBuilder.build()
}
