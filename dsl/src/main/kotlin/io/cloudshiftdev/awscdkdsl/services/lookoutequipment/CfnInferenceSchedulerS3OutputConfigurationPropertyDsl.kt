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

package io.cloudshiftdev.awscdkdsl.services.lookoutequipment

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler

/**
 * Specifies configuration information for the output results from the inference, including output
 * S3 location.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lookoutequipment.*;
 * S3OutputConfigurationProperty s3OutputConfigurationProperty =
 * S3OutputConfigurationProperty.builder()
 * .bucket("bucket")
 * // the properties below are optional
 * .prefix("prefix")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutequipment-inferencescheduler-s3outputconfiguration.html)
 */
@CdkDslMarker
public class CfnInferenceSchedulerS3OutputConfigurationPropertyDsl {
    private val cdkBuilder: CfnInferenceScheduler.S3OutputConfigurationProperty.Builder =
        CfnInferenceScheduler.S3OutputConfigurationProperty.builder()

    /** @param bucket the value to be set. */
    public fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
    }

    /** @param prefix the value to be set. */
    public fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
    }

    public fun build(): CfnInferenceScheduler.S3OutputConfigurationProperty = cdkBuilder.build()
}
