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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3objectlambda.*;
 * ContentTransformationProperty contentTransformationProperty =
 * ContentTransformationProperty.builder()
 * .awsLambda(AwsLambdaProperty.builder()
 * .functionArn("functionArn")
 * // the properties below are optional
 * .functionPayload("functionPayload")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-contenttransformation.html)
 */
@CdkDslMarker
public class CfnAccessPointContentTransformationPropertyDsl {
    private val cdkBuilder: CfnAccessPoint.ContentTransformationProperty.Builder =
        CfnAccessPoint.ContentTransformationProperty.builder()

    /** @param awsLambda the value to be set. */
    public fun awsLambda(awsLambda: IResolvable) {
        cdkBuilder.awsLambda(awsLambda)
    }

    /** @param awsLambda the value to be set. */
    public fun awsLambda(awsLambda: CfnAccessPoint.AwsLambdaProperty) {
        cdkBuilder.awsLambda(awsLambda)
    }

    public fun build(): CfnAccessPoint.ContentTransformationProperty = cdkBuilder.build()
}
