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

package cloudshift.awscdk.dsl.services.amazonmq

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.amazonmq.CfnBroker

/**
 * A key-value pair to associate with the broker.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amazonmq.*;
 * TagsEntryProperty tagsEntryProperty = TagsEntryProperty.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-tagsentry.html)
 */
@CdkDslMarker
public class CfnBrokerTagsEntryPropertyDsl {
    private val cdkBuilder: CfnBroker.TagsEntryProperty.Builder =
        CfnBroker.TagsEntryProperty.builder()

    /** @param key The key in a key-value pair. */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /** @param value The value in a key-value pair. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnBroker.TagsEntryProperty = cdkBuilder.build()
}
