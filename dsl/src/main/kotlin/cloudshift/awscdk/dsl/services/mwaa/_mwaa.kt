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

package cloudshift.awscdk.dsl.services.mwaa

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mwaa.CfnEnvironment
import software.amazon.awscdk.services.mwaa.CfnEnvironmentProps
import software.constructs.Construct

public object mwaa {
    /**
     * The `AWS::MWAA::Environment` resource creates an Amazon Managed Workflows for Apache Airflow
     * (MWAA) environment.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mwaa.*;
     * Object airflowConfigurationOptions;
     * Object tags;
     * CfnEnvironment cfnEnvironment = CfnEnvironment.Builder.create(this, "MyCfnEnvironment")
     * .name("name")
     * // the properties below are optional
     * .airflowConfigurationOptions(airflowConfigurationOptions)
     * .airflowVersion("airflowVersion")
     * .dagS3Path("dagS3Path")
     * .environmentClass("environmentClass")
     * .executionRoleArn("executionRoleArn")
     * .kmsKey("kmsKey")
     * .loggingConfiguration(LoggingConfigurationProperty.builder()
     * .dagProcessingLogs(ModuleLoggingConfigurationProperty.builder()
     * .cloudWatchLogGroupArn("cloudWatchLogGroupArn")
     * .enabled(false)
     * .logLevel("logLevel")
     * .build())
     * .schedulerLogs(ModuleLoggingConfigurationProperty.builder()
     * .cloudWatchLogGroupArn("cloudWatchLogGroupArn")
     * .enabled(false)
     * .logLevel("logLevel")
     * .build())
     * .taskLogs(ModuleLoggingConfigurationProperty.builder()
     * .cloudWatchLogGroupArn("cloudWatchLogGroupArn")
     * .enabled(false)
     * .logLevel("logLevel")
     * .build())
     * .webserverLogs(ModuleLoggingConfigurationProperty.builder()
     * .cloudWatchLogGroupArn("cloudWatchLogGroupArn")
     * .enabled(false)
     * .logLevel("logLevel")
     * .build())
     * .workerLogs(ModuleLoggingConfigurationProperty.builder()
     * .cloudWatchLogGroupArn("cloudWatchLogGroupArn")
     * .enabled(false)
     * .logLevel("logLevel")
     * .build())
     * .build())
     * .maxWorkers(123)
     * .minWorkers(123)
     * .networkConfiguration(NetworkConfigurationProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build())
     * .pluginsS3ObjectVersion("pluginsS3ObjectVersion")
     * .pluginsS3Path("pluginsS3Path")
     * .requirementsS3ObjectVersion("requirementsS3ObjectVersion")
     * .requirementsS3Path("requirementsS3Path")
     * .schedulers(123)
     * .sourceBucketArn("sourceBucketArn")
     * .startupScriptS3ObjectVersion("startupScriptS3ObjectVersion")
     * .startupScriptS3Path("startupScriptS3Path")
     * .tags(tags)
     * .webserverAccessMode("webserverAccessMode")
     * .weeklyMaintenanceWindowStart("weeklyMaintenanceWindowStart")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html)
     */
    public inline fun cfnEnvironment(
        scope: Construct,
        id: String,
        block: CfnEnvironmentDsl.() -> Unit = {},
    ): CfnEnvironment {
        val builder = CfnEnvironmentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The type of Apache Airflow logs to send to CloudWatch Logs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mwaa.*;
     * LoggingConfigurationProperty loggingConfigurationProperty =
     * LoggingConfigurationProperty.builder()
     * .dagProcessingLogs(ModuleLoggingConfigurationProperty.builder()
     * .cloudWatchLogGroupArn("cloudWatchLogGroupArn")
     * .enabled(false)
     * .logLevel("logLevel")
     * .build())
     * .schedulerLogs(ModuleLoggingConfigurationProperty.builder()
     * .cloudWatchLogGroupArn("cloudWatchLogGroupArn")
     * .enabled(false)
     * .logLevel("logLevel")
     * .build())
     * .taskLogs(ModuleLoggingConfigurationProperty.builder()
     * .cloudWatchLogGroupArn("cloudWatchLogGroupArn")
     * .enabled(false)
     * .logLevel("logLevel")
     * .build())
     * .webserverLogs(ModuleLoggingConfigurationProperty.builder()
     * .cloudWatchLogGroupArn("cloudWatchLogGroupArn")
     * .enabled(false)
     * .logLevel("logLevel")
     * .build())
     * .workerLogs(ModuleLoggingConfigurationProperty.builder()
     * .cloudWatchLogGroupArn("cloudWatchLogGroupArn")
     * .enabled(false)
     * .logLevel("logLevel")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mwaa-environment-loggingconfiguration.html)
     */
    public inline fun cfnEnvironmentLoggingConfigurationProperty(
        block: CfnEnvironmentLoggingConfigurationPropertyDsl.() -> Unit = {}
    ): CfnEnvironment.LoggingConfigurationProperty {
        val builder = CfnEnvironmentLoggingConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines the type of logs to send for the Apache Airflow log type (e.g. `DagProcessingLogs` ).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mwaa.*;
     * ModuleLoggingConfigurationProperty moduleLoggingConfigurationProperty =
     * ModuleLoggingConfigurationProperty.builder()
     * .cloudWatchLogGroupArn("cloudWatchLogGroupArn")
     * .enabled(false)
     * .logLevel("logLevel")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mwaa-environment-moduleloggingconfiguration.html)
     */
    public inline fun cfnEnvironmentModuleLoggingConfigurationProperty(
        block: CfnEnvironmentModuleLoggingConfigurationPropertyDsl.() -> Unit = {}
    ): CfnEnvironment.ModuleLoggingConfigurationProperty {
        val builder = CfnEnvironmentModuleLoggingConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The VPC networking components used to secure and enable network traffic between the AWS
     * resources for your environment.
     *
     * To learn more, see
     * [About networking on Amazon MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/networking-about.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mwaa.*;
     * NetworkConfigurationProperty networkConfigurationProperty =
     * NetworkConfigurationProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mwaa-environment-networkconfiguration.html)
     */
    public inline fun cfnEnvironmentNetworkConfigurationProperty(
        block: CfnEnvironmentNetworkConfigurationPropertyDsl.() -> Unit = {}
    ): CfnEnvironment.NetworkConfigurationProperty {
        val builder = CfnEnvironmentNetworkConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnEnvironment`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mwaa.*;
     * Object airflowConfigurationOptions;
     * Object tags;
     * CfnEnvironmentProps cfnEnvironmentProps = CfnEnvironmentProps.builder()
     * .name("name")
     * // the properties below are optional
     * .airflowConfigurationOptions(airflowConfigurationOptions)
     * .airflowVersion("airflowVersion")
     * .dagS3Path("dagS3Path")
     * .environmentClass("environmentClass")
     * .executionRoleArn("executionRoleArn")
     * .kmsKey("kmsKey")
     * .loggingConfiguration(LoggingConfigurationProperty.builder()
     * .dagProcessingLogs(ModuleLoggingConfigurationProperty.builder()
     * .cloudWatchLogGroupArn("cloudWatchLogGroupArn")
     * .enabled(false)
     * .logLevel("logLevel")
     * .build())
     * .schedulerLogs(ModuleLoggingConfigurationProperty.builder()
     * .cloudWatchLogGroupArn("cloudWatchLogGroupArn")
     * .enabled(false)
     * .logLevel("logLevel")
     * .build())
     * .taskLogs(ModuleLoggingConfigurationProperty.builder()
     * .cloudWatchLogGroupArn("cloudWatchLogGroupArn")
     * .enabled(false)
     * .logLevel("logLevel")
     * .build())
     * .webserverLogs(ModuleLoggingConfigurationProperty.builder()
     * .cloudWatchLogGroupArn("cloudWatchLogGroupArn")
     * .enabled(false)
     * .logLevel("logLevel")
     * .build())
     * .workerLogs(ModuleLoggingConfigurationProperty.builder()
     * .cloudWatchLogGroupArn("cloudWatchLogGroupArn")
     * .enabled(false)
     * .logLevel("logLevel")
     * .build())
     * .build())
     * .maxWorkers(123)
     * .minWorkers(123)
     * .networkConfiguration(NetworkConfigurationProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build())
     * .pluginsS3ObjectVersion("pluginsS3ObjectVersion")
     * .pluginsS3Path("pluginsS3Path")
     * .requirementsS3ObjectVersion("requirementsS3ObjectVersion")
     * .requirementsS3Path("requirementsS3Path")
     * .schedulers(123)
     * .sourceBucketArn("sourceBucketArn")
     * .startupScriptS3ObjectVersion("startupScriptS3ObjectVersion")
     * .startupScriptS3Path("startupScriptS3Path")
     * .tags(tags)
     * .webserverAccessMode("webserverAccessMode")
     * .weeklyMaintenanceWindowStart("weeklyMaintenanceWindowStart")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mwaa-environment.html)
     */
    public inline fun cfnEnvironmentProps(
        block: CfnEnvironmentPropsDsl.() -> Unit = {}
    ): CfnEnvironmentProps {
        val builder = CfnEnvironmentPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
