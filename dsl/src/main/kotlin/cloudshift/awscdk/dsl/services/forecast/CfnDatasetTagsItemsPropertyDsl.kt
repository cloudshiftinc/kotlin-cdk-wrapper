@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.forecast

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.forecast.CfnDataset
import kotlin.String

/**
 * A key-value pair to associate with a resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.forecast.*;
 * TagsItemsProperty tagsItemsProperty = TagsItemsProperty.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-forecast-dataset-tagsitems.html)
 */
@CdkDslMarker
public class CfnDatasetTagsItemsPropertyDsl {
    private val cdkBuilder: CfnDataset.TagsItemsProperty.Builder =
        CfnDataset.TagsItemsProperty.builder()

    /**
     * @param key The key name of the tag.
     * You can specify a value that is 1 to 128 Unicode characters in length and cannot be prefixed
     * with aws:. You can use any of the following characters: the set of Unicode letters, digits,
     * whitespace, _, ., /, =, +, and -.
     */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /**
     * @param value The value for the tag.
     * You can specify a value that is 0 to 256 Unicode characters in length and cannot be prefixed
     * with aws:. You can use any of the following characters: the set of Unicode letters, digits,
     * whitespace, _, ., /, =, +, and -.
     */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnDataset.TagsItemsProperty = cdkBuilder.build()
}
