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
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnDistribution

/**
 * A complex type that contains a Lambda&#64;Edge function association.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * LambdaFunctionAssociationProperty lambdaFunctionAssociationProperty =
 * LambdaFunctionAssociationProperty.builder()
 * .eventType("eventType")
 * .includeBody(false)
 * .lambdaFunctionArn("lambdaFunctionArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-lambdafunctionassociation.html)
 */
@CdkDslMarker
public class CfnDistributionLambdaFunctionAssociationPropertyDsl {
    private val cdkBuilder: CfnDistribution.LambdaFunctionAssociationProperty.Builder =
        CfnDistribution.LambdaFunctionAssociationProperty.builder()

    /**
     * @param eventType Specifies the event type that triggers a Lambda&#64;Edge function
     *   invocation. You can specify the following values:.
     * * `viewer-request` : The function executes when CloudFront receives a request from a viewer
     *   and before it checks to see whether the requested object is in the edge cache.
     * * `origin-request` : The function executes only when CloudFront sends a request to your
     *   origin. When the requested object is in the edge cache, the function doesn't execute.
     * * `origin-response` : The function executes after CloudFront receives a response from the
     *   origin and before it caches the object in the response. When the requested object is in the
     *   edge cache, the function doesn't execute.
     * * `viewer-response` : The function executes before CloudFront returns the requested object to
     *   the viewer. The function executes regardless of whether the object was already in the edge
     *   cache.
     *
     * If the origin returns an HTTP status code other than HTTP 200 (OK), the function doesn't
     * execute.
     */
    public fun eventType(eventType: String) {
        cdkBuilder.eventType(eventType)
    }

    /**
     * @param includeBody A flag that allows a Lambda&#64;Edge function to have read access to the
     *   body content. For more information, see
     *   [Accessing the Request Body by Choosing the Include Body Option](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/lambda-include-body-access.html)
     *   in the Amazon CloudFront Developer Guide.
     */
    public fun includeBody(includeBody: Boolean) {
        cdkBuilder.includeBody(includeBody)
    }

    /**
     * @param includeBody A flag that allows a Lambda&#64;Edge function to have read access to the
     *   body content. For more information, see
     *   [Accessing the Request Body by Choosing the Include Body Option](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/lambda-include-body-access.html)
     *   in the Amazon CloudFront Developer Guide.
     */
    public fun includeBody(includeBody: IResolvable) {
        cdkBuilder.includeBody(includeBody)
    }

    /**
     * @param lambdaFunctionArn The ARN of the Lambda&#64;Edge function. You must specify the ARN of
     *   a function version; you can't specify an alias or $LATEST.
     */
    public fun lambdaFunctionArn(lambdaFunctionArn: String) {
        cdkBuilder.lambdaFunctionArn(lambdaFunctionArn)
    }

    public fun build(): CfnDistribution.LambdaFunctionAssociationProperty = cdkBuilder.build()
}
