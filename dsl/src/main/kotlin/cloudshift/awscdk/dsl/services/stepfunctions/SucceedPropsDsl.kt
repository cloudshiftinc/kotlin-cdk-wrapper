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
import software.amazon.awscdk.services.stepfunctions.SucceedProps
import kotlin.String

@CdkDslMarker
public class SucceedPropsDsl {
    private val cdkBuilder: SucceedProps.Builder = SucceedProps.builder()

    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    public fun inputPath(inputPath: String) {
        cdkBuilder.inputPath(inputPath)
    }

    public fun outputPath(outputPath: String) {
        cdkBuilder.outputPath(outputPath)
    }

    public fun build(): SucceedProps = cdkBuilder.build()
}
