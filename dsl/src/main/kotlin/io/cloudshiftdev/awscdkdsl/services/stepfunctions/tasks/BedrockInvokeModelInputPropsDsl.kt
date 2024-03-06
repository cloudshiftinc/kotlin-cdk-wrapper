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
import software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelInputProps

/**
 * Location to retrieve the input data, prior to calling Bedrock InvokeModel.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.stepfunctions.tasks.*;
 * BedrockInvokeModelInputProps bedrockInvokeModelInputProps =
 * BedrockInvokeModelInputProps.builder()
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
public class BedrockInvokeModelInputPropsDsl {
    private val cdkBuilder: BedrockInvokeModelInputProps.Builder =
        BedrockInvokeModelInputProps.builder()

    /**
     * @param s3Location S3 object to retrieve the input data from. If the S3 location is not set,
     *   then the Body must be set.
     */
    public fun s3Location(s3Location: LocationDsl.() -> Unit = {}) {
        val builder = LocationDsl()
        builder.apply(s3Location)
        cdkBuilder.s3Location(builder.build())
    }

    /**
     * @param s3Location S3 object to retrieve the input data from. If the S3 location is not set,
     *   then the Body must be set.
     */
    public fun s3Location(s3Location: Location) {
        cdkBuilder.s3Location(s3Location)
    }

    public fun build(): BedrockInvokeModelInputProps = cdkBuilder.build()
}
