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

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ses.StopActionConfig
import kotlin.String

@CdkDslMarker
public class StopActionConfigDsl {
    private val cdkBuilder: StopActionConfig.Builder = StopActionConfig.builder()

    public fun scope(scope: String) {
        cdkBuilder.scope(scope)
    }

    public fun topicArn(topicArn: String) {
        cdkBuilder.topicArn(topicArn)
    }

    public fun build(): StopActionConfig = cdkBuilder.build()
}
