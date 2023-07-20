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

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput
import kotlin.String

@CdkDslMarker
public class CfnApplicationOutputLambdaOutputPropertyDsl {
    private val cdkBuilder: CfnApplicationOutput.LambdaOutputProperty.Builder =
        CfnApplicationOutput.LambdaOutputProperty.builder()

    public fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnApplicationOutput.LambdaOutputProperty = cdkBuilder.build()
}
