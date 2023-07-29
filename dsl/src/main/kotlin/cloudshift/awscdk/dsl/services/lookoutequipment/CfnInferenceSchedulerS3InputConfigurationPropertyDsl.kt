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

package cloudshift.awscdk.dsl.services.lookoutequipment

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler

/**
 * Specifies configuration information for the input data for the inference, including input data S3
 * location.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lookoutequipment.*;
 * S3InputConfigurationProperty s3InputConfigurationProperty =
 * S3InputConfigurationProperty.builder()
 * .bucket("bucket")
 * // the properties below are optional
 * .prefix("prefix")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutequipment-inferencescheduler-s3inputconfiguration.html)
 */
@CdkDslMarker
public class CfnInferenceSchedulerS3InputConfigurationPropertyDsl {
    private val cdkBuilder: CfnInferenceScheduler.S3InputConfigurationProperty.Builder =
        CfnInferenceScheduler.S3InputConfigurationProperty.builder()

    /** @param bucket the value to be set. */
    public fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
    }

    /** @param prefix the value to be set. */
    public fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
    }

    public fun build(): CfnInferenceScheduler.S3InputConfigurationProperty = cdkBuilder.build()
}
