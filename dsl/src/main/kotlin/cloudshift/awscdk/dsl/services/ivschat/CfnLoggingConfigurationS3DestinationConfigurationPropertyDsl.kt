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

package cloudshift.awscdk.dsl.services.ivschat

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration

/**
 * The S3DestinationConfiguration property type specifies an S3 location where chat logs will be
 * stored.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ivschat.*;
 * S3DestinationConfigurationProperty s3DestinationConfigurationProperty =
 * S3DestinationConfigurationProperty.builder()
 * .bucketName("bucketName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-loggingconfiguration-s3destinationconfiguration.html)
 */
@CdkDslMarker
public class CfnLoggingConfigurationS3DestinationConfigurationPropertyDsl {
    private val cdkBuilder: CfnLoggingConfiguration.S3DestinationConfigurationProperty.Builder =
        CfnLoggingConfiguration.S3DestinationConfigurationProperty.builder()

    /** @param bucketName Name of the Amazon S3 bucket where chat activity will be logged. */
    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    public fun build(): CfnLoggingConfiguration.S3DestinationConfigurationProperty =
        cdkBuilder.build()
}
