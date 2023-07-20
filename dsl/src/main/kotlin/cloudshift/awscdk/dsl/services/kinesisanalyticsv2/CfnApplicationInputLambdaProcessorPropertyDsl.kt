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

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication
import kotlin.String

@CdkDslMarker
public class CfnApplicationInputLambdaProcessorPropertyDsl {
    private val cdkBuilder: CfnApplication.InputLambdaProcessorProperty.Builder =
        CfnApplication.InputLambdaProcessorProperty.builder()

    public fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
    }

    public fun build(): CfnApplication.InputLambdaProcessorProperty = cdkBuilder.build()
}
