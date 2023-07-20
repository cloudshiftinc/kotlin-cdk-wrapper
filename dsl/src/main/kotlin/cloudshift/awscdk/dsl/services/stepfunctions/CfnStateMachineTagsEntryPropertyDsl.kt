@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.stepfunctions.CfnStateMachine
import kotlin.String

@CdkDslMarker
public class CfnStateMachineTagsEntryPropertyDsl {
    private val cdkBuilder: CfnStateMachine.TagsEntryProperty.Builder =
        CfnStateMachine.TagsEntryProperty.builder()

    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnStateMachine.TagsEntryProperty = cdkBuilder.build()
}
