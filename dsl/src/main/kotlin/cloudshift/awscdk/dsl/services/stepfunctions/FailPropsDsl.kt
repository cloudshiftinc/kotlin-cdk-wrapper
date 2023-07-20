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
import software.amazon.awscdk.services.stepfunctions.FailProps
import kotlin.String

@CdkDslMarker
public class FailPropsDsl {
    private val cdkBuilder: FailProps.Builder = FailProps.builder()

    public fun cause(cause: String) {
        cdkBuilder.cause(cause)
    }

    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    public fun error(error: String) {
        cdkBuilder.error(error)
    }

    public fun build(): FailProps = cdkBuilder.build()
}
