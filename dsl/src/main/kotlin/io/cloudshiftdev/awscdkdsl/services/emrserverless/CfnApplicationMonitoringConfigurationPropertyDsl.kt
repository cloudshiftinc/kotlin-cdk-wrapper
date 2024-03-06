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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emrserverless.CfnApplication

/**
 * The configuration setting for monitoring.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emrserverless.*;
 * MonitoringConfigurationProperty monitoringConfigurationProperty =
 * MonitoringConfigurationProperty.builder()
 * .cloudWatchLoggingConfiguration(CloudWatchLoggingConfigurationProperty.builder()
 * .enabled(false)
 * .encryptionKeyArn("encryptionKeyArn")
 * .logGroupName("logGroupName")
 * .logStreamNamePrefix("logStreamNamePrefix")
 * .logTypeMap(List.of(LogTypeMapKeyValuePairProperty.builder()
 * .key("key")
 * .value(List.of("value"))
 * .build()))
 * .build())
 * .managedPersistenceMonitoringConfiguration(ManagedPersistenceMonitoringConfigurationProperty.builder()
 * .enabled(false)
 * .encryptionKeyArn("encryptionKeyArn")
 * .build())
 * .s3MonitoringConfiguration(S3MonitoringConfigurationProperty.builder()
 * .encryptionKeyArn("encryptionKeyArn")
 * .logUri("logUri")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-monitoringconfiguration.html)
 */
@CdkDslMarker
public class CfnApplicationMonitoringConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplication.MonitoringConfigurationProperty.Builder =
        CfnApplication.MonitoringConfigurationProperty.builder()

    /**
     * @param cloudWatchLoggingConfiguration The Amazon CloudWatch configuration for monitoring
     *   logs. You can configure your jobs to send log information to CloudWatch .
     */
    public fun cloudWatchLoggingConfiguration(cloudWatchLoggingConfiguration: IResolvable) {
        cdkBuilder.cloudWatchLoggingConfiguration(cloudWatchLoggingConfiguration)
    }

    /**
     * @param cloudWatchLoggingConfiguration The Amazon CloudWatch configuration for monitoring
     *   logs. You can configure your jobs to send log information to CloudWatch .
     */
    public fun cloudWatchLoggingConfiguration(
        cloudWatchLoggingConfiguration: CfnApplication.CloudWatchLoggingConfigurationProperty
    ) {
        cdkBuilder.cloudWatchLoggingConfiguration(cloudWatchLoggingConfiguration)
    }

    /**
     * @param managedPersistenceMonitoringConfiguration The managed log persistence configuration
     *   for a job run.
     */
    public fun managedPersistenceMonitoringConfiguration(
        managedPersistenceMonitoringConfiguration: IResolvable
    ) {
        cdkBuilder.managedPersistenceMonitoringConfiguration(
            managedPersistenceMonitoringConfiguration
        )
    }

    /**
     * @param managedPersistenceMonitoringConfiguration The managed log persistence configuration
     *   for a job run.
     */
    public fun managedPersistenceMonitoringConfiguration(
        managedPersistenceMonitoringConfiguration:
            CfnApplication.ManagedPersistenceMonitoringConfigurationProperty
    ) {
        cdkBuilder.managedPersistenceMonitoringConfiguration(
            managedPersistenceMonitoringConfiguration
        )
    }

    /**
     * @param s3MonitoringConfiguration The Amazon S3 configuration for monitoring log publishing.
     */
    public fun s3MonitoringConfiguration(s3MonitoringConfiguration: IResolvable) {
        cdkBuilder.s3MonitoringConfiguration(s3MonitoringConfiguration)
    }

    /**
     * @param s3MonitoringConfiguration The Amazon S3 configuration for monitoring log publishing.
     */
    public fun s3MonitoringConfiguration(
        s3MonitoringConfiguration: CfnApplication.S3MonitoringConfigurationProperty
    ) {
        cdkBuilder.s3MonitoringConfiguration(s3MonitoringConfiguration)
    }

    public fun build(): CfnApplication.MonitoringConfigurationProperty = cdkBuilder.build()
}
