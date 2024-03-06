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

package io.cloudshiftdev.awscdkdsl.services.stepfunctions.tasks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.services.s3.LocationDsl
import kotlin.Unit
import software.amazon.awscdk.services.s3.Location
import software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelOutputProps

/**
 * Location where the Bedrock InvokeModel API response is written.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.stepfunctions.tasks.*;
 * BedrockInvokeModelOutputProps bedrockInvokeModelOutputProps =
 * BedrockInvokeModelOutputProps.builder()
 * .s3Location(Location.builder()
 * .bucketName("bucketName")
 * .objectKey("objectKey")
 * // the properties below are optional
 * .objectVersion("objectVersion")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-bedrock.html)
 */
@CdkDslMarker
public class BedrockInvokeModelOutputPropsDsl {
    private val cdkBuilder: BedrockInvokeModelOutputProps.Builder =
        BedrockInvokeModelOutputProps.builder()

    /**
     * @param s3Location S3 object where the Bedrock InvokeModel API response is written. If you
     *   specify this field, the API response body is replaced with a reference to the Amazon S3
     *   location of the original output.
     */
    public fun s3Location(s3Location: LocationDsl.() -> Unit = {}) {
        val builder = LocationDsl()
        builder.apply(s3Location)
        cdkBuilder.s3Location(builder.build())
    }

    /**
     * @param s3Location S3 object where the Bedrock InvokeModel API response is written. If you
     *   specify this field, the API response body is replaced with a reference to the Amazon S3
     *   location of the original output.
     */
    public fun s3Location(s3Location: Location) {
        cdkBuilder.s3Location(s3Location)
    }

    public fun build(): BedrockInvokeModelOutputProps = cdkBuilder.build()
}
