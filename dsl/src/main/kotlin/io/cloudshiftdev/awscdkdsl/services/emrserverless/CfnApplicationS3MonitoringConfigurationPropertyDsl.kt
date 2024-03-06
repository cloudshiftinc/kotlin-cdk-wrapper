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

package io.cloudshiftdev.awscdkdsl.services.emrserverless

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.emrserverless.CfnApplication

/**
 * The Amazon S3 configuration for monitoring log publishing.
 *
 * You can configure your jobs to send log information to Amazon S3.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emrserverless.*;
 * S3MonitoringConfigurationProperty s3MonitoringConfigurationProperty =
 * S3MonitoringConfigurationProperty.builder()
 * .encryptionKeyArn("encryptionKeyArn")
 * .logUri("logUri")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-s3monitoringconfiguration.html)
 */
@CdkDslMarker
public class CfnApplicationS3MonitoringConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplication.S3MonitoringConfigurationProperty.Builder =
        CfnApplication.S3MonitoringConfigurationProperty.builder()

    /**
     * @param encryptionKeyArn The KMS key ARN to encrypt the logs published to the given Amazon S3
     *   destination.
     */
    public fun encryptionKeyArn(encryptionKeyArn: String) {
        cdkBuilder.encryptionKeyArn(encryptionKeyArn)
    }

    /** @param logUri The Amazon S3 destination URI for log publishing. */
    public fun logUri(logUri: String) {
        cdkBuilder.logUri(logUri)
    }

    public fun build(): CfnApplication.S3MonitoringConfigurationProperty = cdkBuilder.build()
}
