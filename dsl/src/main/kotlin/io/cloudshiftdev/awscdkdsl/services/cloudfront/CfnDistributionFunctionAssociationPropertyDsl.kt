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

package io.cloudshiftdev.awscdkdsl.services.cloudfront

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudfront.CfnDistribution

/**
 * A CloudFront function that is associated with a cache behavior in a CloudFront distribution.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * FunctionAssociationProperty functionAssociationProperty = FunctionAssociationProperty.builder()
 * .eventType("eventType")
 * .functionArn("functionArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-functionassociation.html)
 */
@CdkDslMarker
public class CfnDistributionFunctionAssociationPropertyDsl {
    private val cdkBuilder: CfnDistribution.FunctionAssociationProperty.Builder =
        CfnDistribution.FunctionAssociationProperty.builder()

    /**
     * @param eventType The event type of the function, either `viewer-request` or `viewer-response`
     *   . You cannot use origin-facing event types ( `origin-request` and `origin-response` ) with
     *   a CloudFront function.
     */
    public fun eventType(eventType: String) {
        cdkBuilder.eventType(eventType)
    }

    /** @param functionArn The Amazon Resource Name (ARN) of the function. */
    public fun functionArn(functionArn: String) {
        cdkBuilder.functionArn(functionArn)
    }

    public fun build(): CfnDistribution.FunctionAssociationProperty = cdkBuilder.build()
}
