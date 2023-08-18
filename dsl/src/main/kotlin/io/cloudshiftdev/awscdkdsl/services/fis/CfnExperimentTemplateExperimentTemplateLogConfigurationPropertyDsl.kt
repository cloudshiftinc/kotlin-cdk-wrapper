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

package io.cloudshiftdev.awscdkdsl.services.fis

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Number
import kotlin.Unit
import software.amazon.awscdk.services.fis.CfnExperimentTemplate

/**
 * Specifies the configuration for experiment logging.
 *
 * For more information, see
 * [Experiment logging](https://docs.aws.amazon.com/fis/latest/userguide/monitoring-logging.html) in
 * the *AWS Fault Injection Simulator User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.fis.*;
 * Object cloudWatchLogsConfiguration;
 * Object s3Configuration;
 * ExperimentTemplateLogConfigurationProperty experimentTemplateLogConfigurationProperty =
 * ExperimentTemplateLogConfigurationProperty.builder()
 * .logSchemaVersion(123)
 * // the properties below are optional
 * .cloudWatchLogsConfiguration(cloudWatchLogsConfiguration)
 * .s3Configuration(s3Configuration)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplatelogconfiguration.html)
 */
@CdkDslMarker
public class CfnExperimentTemplateExperimentTemplateLogConfigurationPropertyDsl {
    private val cdkBuilder:
        CfnExperimentTemplate.ExperimentTemplateLogConfigurationProperty.Builder =
        CfnExperimentTemplate.ExperimentTemplateLogConfigurationProperty.builder()

    /**
     * @param cloudWatchLogsConfiguration The configuration for experiment logging to CloudWatch
     *   Logs .
     */
    public fun cloudWatchLogsConfiguration(
        cloudWatchLogsConfiguration: MapBuilder.() -> Unit = {}
    ) {
        val builder = MapBuilder()
        builder.apply(cloudWatchLogsConfiguration)
        cdkBuilder.cloudWatchLogsConfiguration(builder.map)
    }

    /**
     * @param cloudWatchLogsConfiguration The configuration for experiment logging to CloudWatch
     *   Logs .
     */
    public fun cloudWatchLogsConfiguration(cloudWatchLogsConfiguration: Any) {
        cdkBuilder.cloudWatchLogsConfiguration(cloudWatchLogsConfiguration)
    }

    /** @param logSchemaVersion The schema version. */
    public fun logSchemaVersion(logSchemaVersion: Number) {
        cdkBuilder.logSchemaVersion(logSchemaVersion)
    }

    /** @param s3Configuration The configuration for experiment logging to Amazon S3 . */
    public fun s3Configuration(s3Configuration: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(s3Configuration)
        cdkBuilder.s3Configuration(builder.map)
    }

    /** @param s3Configuration The configuration for experiment logging to Amazon S3 . */
    public fun s3Configuration(s3Configuration: Any) {
        cdkBuilder.s3Configuration(s3Configuration)
    }

    public fun build(): CfnExperimentTemplate.ExperimentTemplateLogConfigurationProperty =
        cdkBuilder.build()
}
