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

package io.cloudshiftdev.awscdkdsl.services.events.targets

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.events.targets.Tag

/**
 * Metadata that you apply to a resource to help categorize and organize the resource.
 *
 * Each tag consists of a key and an optional value, both of which you define.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.targets.*;
 * Tag tag = Tag.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 */
@CdkDslMarker
public class TagDsl {
    private val cdkBuilder: Tag.Builder = Tag.builder()

    /** @param key Key is the name of the tag. */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /** @param value Value is the metadata contents of the tag. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): Tag = cdkBuilder.build()
}
