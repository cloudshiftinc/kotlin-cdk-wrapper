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
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnFlow

/**
 * The settings that determine how Amazon AppFlow handles an error when placing data in the
 * destination.
 *
 * For example, this setting would determine if the flow should fail after one insertion error, or
 * continue and attempt to insert every record regardless of the initial failure.
 * `ErrorHandlingConfig` is a part of the destination connector details.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * ErrorHandlingConfigProperty errorHandlingConfigProperty = ErrorHandlingConfigProperty.builder()
 * .bucketName("bucketName")
 * .bucketPrefix("bucketPrefix")
 * .failOnFirstError(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-errorhandlingconfig.html)
 */
@CdkDslMarker
public class CfnFlowErrorHandlingConfigPropertyDsl {
    private val cdkBuilder: CfnFlow.ErrorHandlingConfigProperty.Builder =
        CfnFlow.ErrorHandlingConfigProperty.builder()

    /** @param bucketName Specifies the name of the Amazon S3 bucket. */
    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    /** @param bucketPrefix Specifies the Amazon S3 bucket prefix. */
    public fun bucketPrefix(bucketPrefix: String) {
        cdkBuilder.bucketPrefix(bucketPrefix)
    }

    /**
     * @param failOnFirstError Specifies if the flow should fail after the first instance of a
     *   failure when attempting to place data in the destination.
     */
    public fun failOnFirstError(failOnFirstError: Boolean) {
        cdkBuilder.failOnFirstError(failOnFirstError)
    }

    /**
     * @param failOnFirstError Specifies if the flow should fail after the first instance of a
     *   failure when attempting to place data in the destination.
     */
    public fun failOnFirstError(failOnFirstError: IResolvable) {
        cdkBuilder.failOnFirstError(failOnFirstError)
    }

    public fun build(): CfnFlow.ErrorHandlingConfigProperty = cdkBuilder.build()
}
