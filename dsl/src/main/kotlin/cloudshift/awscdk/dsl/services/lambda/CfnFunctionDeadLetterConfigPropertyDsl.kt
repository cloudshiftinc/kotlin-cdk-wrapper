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

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.lambda.CfnFunction
import kotlin.String

@CdkDslMarker
public class CfnFunctionDeadLetterConfigPropertyDsl {
    private val cdkBuilder: CfnFunction.DeadLetterConfigProperty.Builder =
        CfnFunction.DeadLetterConfigProperty.builder()

    public fun targetArn(targetArn: String) {
        cdkBuilder.targetArn(targetArn)
    }

    public fun build(): CfnFunction.DeadLetterConfigProperty = cdkBuilder.build()
}
