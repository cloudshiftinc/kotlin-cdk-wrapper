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

package cloudshift.awscdk.dsl.services.s3objectlambda

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint
import kotlin.String

@CdkDslMarker
public class CfnAccessPointAwsLambdaPropertyDsl {
    private val cdkBuilder: CfnAccessPoint.AwsLambdaProperty.Builder =
        CfnAccessPoint.AwsLambdaProperty.builder()

    public fun functionArn(functionArn: String) {
        cdkBuilder.functionArn(functionArn)
    }

    public fun functionPayload(functionPayload: String) {
        cdkBuilder.functionPayload(functionPayload)
    }

    public fun build(): CfnAccessPoint.AwsLambdaProperty = cdkBuilder.build()
}
