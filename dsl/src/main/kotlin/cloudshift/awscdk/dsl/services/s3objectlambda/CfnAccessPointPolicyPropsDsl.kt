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

package cloudshift.awscdk.dsl.services.s3objectlambda

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPointPolicyProps

/**
 * Properties for defining a `CfnAccessPointPolicy`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3objectlambda.*;
 * Object policyDocument;
 * CfnAccessPointPolicyProps cfnAccessPointPolicyProps = CfnAccessPointPolicyProps.builder()
 * .objectLambdaAccessPoint("objectLambdaAccessPoint")
 * .policyDocument(policyDocument)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3objectlambda-accesspointpolicy.html)
 */
@CdkDslMarker
public class CfnAccessPointPolicyPropsDsl {
    private val cdkBuilder: CfnAccessPointPolicyProps.Builder = CfnAccessPointPolicyProps.builder()

    /**
     * @param objectLambdaAccessPoint An access point with an attached AWS Lambda function used to
     *   access transformed data from an Amazon S3 bucket.
     */
    public fun objectLambdaAccessPoint(objectLambdaAccessPoint: String) {
        cdkBuilder.objectLambdaAccessPoint(objectLambdaAccessPoint)
    }

    /** @param policyDocument Object Lambda Access Point resource policy document. */
    public fun policyDocument(policyDocument: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(policyDocument)
        cdkBuilder.policyDocument(builder.map)
    }

    /** @param policyDocument Object Lambda Access Point resource policy document. */
    public fun policyDocument(policyDocument: Any) {
        cdkBuilder.policyDocument(policyDocument)
    }

    public fun build(): CfnAccessPointPolicyProps = cdkBuilder.build()
}
