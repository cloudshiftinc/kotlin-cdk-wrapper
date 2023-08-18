@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.s3objectlambda

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3objectlambda.*;
 * AwsLambdaProperty awsLambdaProperty = AwsLambdaProperty.builder()
 * .functionArn("functionArn")
 * // the properties below are optional
 * .functionPayload("functionPayload")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-awslambda.html)
 */
@CdkDslMarker
public class CfnAccessPointAwsLambdaPropertyDsl {
    private val cdkBuilder: CfnAccessPoint.AwsLambdaProperty.Builder =
        CfnAccessPoint.AwsLambdaProperty.builder()

    /** @param functionArn the value to be set. */
    public fun functionArn(functionArn: String) {
        cdkBuilder.functionArn(functionArn)
    }

    /** @param functionPayload the value to be set. */
    public fun functionPayload(functionPayload: String) {
        cdkBuilder.functionPayload(functionPayload)
    }

    public fun build(): CfnAccessPoint.AwsLambdaProperty = cdkBuilder.build()
}
