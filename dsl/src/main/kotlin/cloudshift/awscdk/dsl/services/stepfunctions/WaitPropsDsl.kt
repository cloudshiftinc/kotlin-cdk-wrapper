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
import software.amazon.awscdk.services.stepfunctions.WaitProps
import software.amazon.awscdk.services.stepfunctions.WaitTime
import kotlin.String

@CdkDslMarker
public class WaitPropsDsl {
    private val cdkBuilder: WaitProps.Builder = WaitProps.builder()

    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    public fun time(time: WaitTime) {
        cdkBuilder.time(time)
    }

    public fun build(): WaitProps = cdkBuilder.build()
}
