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

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.backup.TagCondition
import software.amazon.awscdk.services.backup.TagOperation

/**
 * A tag condition.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.backup.*;
 * TagCondition tagCondition = TagCondition.builder()
 * .key("key")
 * .value("value")
 * // the properties below are optional
 * .operation(TagOperation.STRING_EQUALS)
 * .build();
 * ```
 */
@CdkDslMarker
public class TagConditionDsl {
    private val cdkBuilder: TagCondition.Builder = TagCondition.builder()

    /**
     * @param key The key in a key-value pair. For example, in `"ec2:ResourceTag/Department":
     *   "accounting"`, `ec2:ResourceTag/Department` is the key.
     */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /**
     * @param operation An operation that is applied to a key-value pair used to filter resources in
     *   a selection.
     */
    public fun operation(operation: TagOperation) {
        cdkBuilder.operation(operation)
    }

    /**
     * @param value The value in a key-value pair. For example, in `"ec2:ResourceTag/Department":
     *   "accounting"`, `accounting` is the value.
     */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): TagCondition = cdkBuilder.build()
}
