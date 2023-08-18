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
import software.amazon.awscdk.services.cloudfront.LambdaEdgeEventType
import software.amazon.awscdk.services.cloudfront.LambdaFunctionAssociation
import software.amazon.awscdk.services.lambda.IVersion

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * import software.amazon.awscdk.services.lambda.*;
 * Version version;
 * LambdaFunctionAssociation lambdaFunctionAssociation = LambdaFunctionAssociation.builder()
 * .eventType(LambdaEdgeEventType.ORIGIN_REQUEST)
 * .lambdaFunction(version)
 * // the properties below are optional
 * .includeBody(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class LambdaFunctionAssociationDsl {
    private val cdkBuilder: LambdaFunctionAssociation.Builder = LambdaFunctionAssociation.builder()

    /**
     * @param eventType The lambda event type defines at which event the lambda is called during the
     *   request lifecycle.
     */
    public fun eventType(eventType: LambdaEdgeEventType) {
        cdkBuilder.eventType(eventType)
    }

    /**
     * @param includeBody Allows a Lambda function to have read access to the body content. Only
     *   valid for "request" event types (`ORIGIN_REQUEST` or `VIEWER_REQUEST`). See
     *   https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/lambda-include-body-access.html
     */
    public fun includeBody(includeBody: Boolean) {
        cdkBuilder.includeBody(includeBody)
    }

    /** @param lambdaFunction A version of the lambda to associate. */
    public fun lambdaFunction(lambdaFunction: IVersion) {
        cdkBuilder.lambdaFunction(lambdaFunction)
    }

    public fun build(): LambdaFunctionAssociation = cdkBuilder.build()
}
