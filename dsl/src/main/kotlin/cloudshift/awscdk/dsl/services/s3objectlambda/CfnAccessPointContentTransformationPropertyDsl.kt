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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint

@CdkDslMarker
public class CfnAccessPointContentTransformationPropertyDsl {
    private val cdkBuilder: CfnAccessPoint.ContentTransformationProperty.Builder =
        CfnAccessPoint.ContentTransformationProperty.builder()

    public fun awsLambda(awsLambda: IResolvable) {
        cdkBuilder.awsLambda(awsLambda)
    }

    public fun awsLambda(awsLambda: CfnAccessPoint.AwsLambdaProperty) {
        cdkBuilder.awsLambda(awsLambda)
    }

    public fun build(): CfnAccessPoint.ContentTransformationProperty = cdkBuilder.build()
}
