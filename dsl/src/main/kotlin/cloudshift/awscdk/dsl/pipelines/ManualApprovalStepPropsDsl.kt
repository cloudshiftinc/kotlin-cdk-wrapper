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

package cloudshift.awscdk.dsl.pipelines

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.pipelines.ManualApprovalStepProps
import kotlin.String

@CdkDslMarker
public class ManualApprovalStepPropsDsl {
    private val cdkBuilder: ManualApprovalStepProps.Builder = ManualApprovalStepProps.builder()

    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    public fun build(): ManualApprovalStepProps = cdkBuilder.build()
}
