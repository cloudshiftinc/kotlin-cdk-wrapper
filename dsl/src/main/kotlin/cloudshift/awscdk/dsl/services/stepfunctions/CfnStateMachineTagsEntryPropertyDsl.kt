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

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.stepfunctions.CfnStateMachine

/**
 * The `TagsEntry` property specifies *tags* to identify a state machine.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.stepfunctions.*;
 * TagsEntryProperty tagsEntryProperty = TagsEntryProperty.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-tagsentry.html)
 */
@CdkDslMarker
public class CfnStateMachineTagsEntryPropertyDsl {
    private val cdkBuilder: CfnStateMachine.TagsEntryProperty.Builder =
        CfnStateMachine.TagsEntryProperty.builder()

    /** @param key The `key` for a key-value pair in a tag entry. */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /** @param value The `value` for a key-value pair in a tag entry. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnStateMachine.TagsEntryProperty = cdkBuilder.build()
}
