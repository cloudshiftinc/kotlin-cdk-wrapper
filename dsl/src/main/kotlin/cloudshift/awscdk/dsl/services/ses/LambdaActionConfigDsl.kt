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
import software.amazon.awscdk.services.ses.LambdaActionConfig
import kotlin.String

@CdkDslMarker
public class LambdaActionConfigDsl {
    private val cdkBuilder: LambdaActionConfig.Builder = LambdaActionConfig.builder()

    public fun functionArn(functionArn: String) {
        cdkBuilder.functionArn(functionArn)
    }

    public fun invocationType(invocationType: String) {
        cdkBuilder.invocationType(invocationType)
    }

    public fun topicArn(topicArn: String) {
        cdkBuilder.topicArn(topicArn)
    }

    public fun build(): LambdaActionConfig = cdkBuilder.build()
}
