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

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnFlow

/**
 * Determines how Amazon AppFlow handles the success response that it gets from the connector after
 * placing data.
 *
 * For example, this setting would determine where to write the response from the destination
 * connector upon a successful insert operation.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * SuccessResponseHandlingConfigProperty successResponseHandlingConfigProperty =
 * SuccessResponseHandlingConfigProperty.builder()
 * .bucketName("bucketName")
 * .bucketPrefix("bucketPrefix")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-successresponsehandlingconfig.html)
 */
@CdkDslMarker
public class CfnFlowSuccessResponseHandlingConfigPropertyDsl {
    private val cdkBuilder: CfnFlow.SuccessResponseHandlingConfigProperty.Builder =
        CfnFlow.SuccessResponseHandlingConfigProperty.builder()

    /** @param bucketName The name of the Amazon S3 bucket. */
    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    /** @param bucketPrefix The Amazon S3 bucket prefix. */
    public fun bucketPrefix(bucketPrefix: String) {
        cdkBuilder.bucketPrefix(bucketPrefix)
    }

    public fun build(): CfnFlow.SuccessResponseHandlingConfigProperty = cdkBuilder.build()
}
