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
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
import kotlin.String

@CdkDslMarker
public class CfnApplicationV2InputLambdaProcessorPropertyDsl {
    private val cdkBuilder: CfnApplicationV2.InputLambdaProcessorProperty.Builder =
        CfnApplicationV2.InputLambdaProcessorProperty.builder()

    public fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
    }

    public fun build(): CfnApplicationV2.InputLambdaProcessorProperty = cdkBuilder.build()
}
