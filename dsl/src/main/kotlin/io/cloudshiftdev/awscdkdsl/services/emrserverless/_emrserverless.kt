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

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.emrserverless.CfnApplication
import software.amazon.awscdk.services.emrserverless.CfnApplicationProps
import software.constructs.Construct

public object emrserverless {
    /**
     * The `AWS::EMRServerless::Application` resource specifies an EMR Serverless application.
     *
     * An application uses open source analytics frameworks to run jobs that process data. To create
     * an application, you must specify the release version for the open source framework version
     * you want to use and the type of application you want, such as Apache Spark or Apache Hive.
     * After you create an application, you can submit data processing jobs or interactive requests
     * to it.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emrserverless.*;
     * ConfigurationObjectProperty configurationObjectProperty_;
     * CfnApplication cfnApplication = CfnApplication.Builder.create(this, "MyCfnApplication")
     * .releaseLabel("releaseLabel")
     * .type("type")
     * // the properties below are optional
     * .architecture("architecture")
     * .autoStartConfiguration(AutoStartConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .autoStopConfiguration(AutoStopConfigurationProperty.builder()
     * .enabled(false)
     * .idleTimeoutMinutes(123)
     * .build())
     * .imageConfiguration(ImageConfigurationInputProperty.builder()
     * .imageUri("imageUri")
     * .build())
     * .initialCapacity(List.of(InitialCapacityConfigKeyValuePairProperty.builder()
     * .key("key")
     * .value(InitialCapacityConfigProperty.builder()
     * .workerConfiguration(WorkerConfigurationProperty.builder()
     * .cpu("cpu")
     * .memory("memory")
     * // the properties below are optional
     * .disk("disk")
     * .build())
     * .workerCount(123)
     * .build())
     * .build()))
     * .maximumCapacity(MaximumAllowedResourcesProperty.builder()
     * .cpu("cpu")
     * .memory("memory")
     * // the properties below are optional
     * .disk("disk")
     * .build())
     * .monitoringConfiguration(MonitoringConfigurationProperty.builder()
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
     * .build())
     * .name("name")
     * .networkConfiguration(NetworkConfigurationProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build())
     * .runtimeConfiguration(List.of(ConfigurationObjectProperty.builder()
     * .classification("classification")
     * // the properties below are optional
     * .configurations(List.of(configurationObjectProperty_))
     * .properties(Map.of(
     * "propertiesKey", "properties"))
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .workerTypeSpecifications(Map.of(
     * "workerTypeSpecificationsKey", WorkerTypeSpecificationInputProperty.builder()
     * .imageConfiguration(ImageConfigurationInputProperty.builder()
     * .imageUri("imageUri")
     * .build())
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html)
     */
    public inline fun cfnApplication(
        scope: Construct,
        id: String,
        block: CfnApplicationDsl.() -> Unit = {},
    ): CfnApplication {
        val builder = CfnApplicationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration for Auto Start of Application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emrserverless.*;
     * AutoStartConfigurationProperty autoStartConfigurationProperty =
     * AutoStartConfigurationProperty.builder()
     * .enabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-autostartconfiguration.html)
     */
    public inline fun cfnApplicationAutoStartConfigurationProperty(
        block: CfnApplicationAutoStartConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplication.AutoStartConfigurationProperty {
        val builder = CfnApplicationAutoStartConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration for Auto Stop of Application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emrserverless.*;
     * AutoStopConfigurationProperty autoStopConfigurationProperty =
     * AutoStopConfigurationProperty.builder()
     * .enabled(false)
     * .idleTimeoutMinutes(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-autostopconfiguration.html)
     */
    public inline fun cfnApplicationAutoStopConfigurationProperty(
        block: CfnApplicationAutoStopConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplication.AutoStopConfigurationProperty {
        val builder = CfnApplicationAutoStopConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Amazon CloudWatch configuration for monitoring logs.
     *
     * You can configure your jobs to send log information to CloudWatch .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emrserverless.*;
     * CloudWatchLoggingConfigurationProperty cloudWatchLoggingConfigurationProperty =
     * CloudWatchLoggingConfigurationProperty.builder()
     * .enabled(false)
     * .encryptionKeyArn("encryptionKeyArn")
     * .logGroupName("logGroupName")
     * .logStreamNamePrefix("logStreamNamePrefix")
     * .logTypeMap(List.of(LogTypeMapKeyValuePairProperty.builder()
     * .key("key")
     * .value(List.of("value"))
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-cloudwatchloggingconfiguration.html)
     */
    public inline fun cfnApplicationCloudWatchLoggingConfigurationProperty(
        block: CfnApplicationCloudWatchLoggingConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplication.CloudWatchLoggingConfigurationProperty {
        val builder = CfnApplicationCloudWatchLoggingConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration for a JobRun.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emrserverless.*;
     * ConfigurationObjectProperty configurationObjectProperty_;
     * ConfigurationObjectProperty configurationObjectProperty = ConfigurationObjectProperty.builder()
     * .classification("classification")
     * // the properties below are optional
     * .configurations(List.of(configurationObjectProperty_))
     * .properties(Map.of(
     * "propertiesKey", "properties"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-configurationobject.html)
     */
    public inline fun cfnApplicationConfigurationObjectProperty(
        block: CfnApplicationConfigurationObjectPropertyDsl.() -> Unit = {}
    ): CfnApplication.ConfigurationObjectProperty {
        val builder = CfnApplicationConfigurationObjectPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The image configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emrserverless.*;
     * ImageConfigurationInputProperty imageConfigurationInputProperty =
     * ImageConfigurationInputProperty.builder()
     * .imageUri("imageUri")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-imageconfigurationinput.html)
     */
    public inline fun cfnApplicationImageConfigurationInputProperty(
        block: CfnApplicationImageConfigurationInputPropertyDsl.() -> Unit = {}
    ): CfnApplication.ImageConfigurationInputProperty {
        val builder = CfnApplicationImageConfigurationInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emrserverless.*;
     * InitialCapacityConfigKeyValuePairProperty initialCapacityConfigKeyValuePairProperty =
     * InitialCapacityConfigKeyValuePairProperty.builder()
     * .key("key")
     * .value(InitialCapacityConfigProperty.builder()
     * .workerConfiguration(WorkerConfigurationProperty.builder()
     * .cpu("cpu")
     * .memory("memory")
     * // the properties below are optional
     * .disk("disk")
     * .build())
     * .workerCount(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-initialcapacityconfigkeyvaluepair.html)
     */
    public inline fun cfnApplicationInitialCapacityConfigKeyValuePairProperty(
        block: CfnApplicationInitialCapacityConfigKeyValuePairPropertyDsl.() -> Unit = {}
    ): CfnApplication.InitialCapacityConfigKeyValuePairProperty {
        val builder = CfnApplicationInitialCapacityConfigKeyValuePairPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The initial capacity configuration per worker.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emrserverless.*;
     * InitialCapacityConfigProperty initialCapacityConfigProperty =
     * InitialCapacityConfigProperty.builder()
     * .workerConfiguration(WorkerConfigurationProperty.builder()
     * .cpu("cpu")
     * .memory("memory")
     * // the properties below are optional
     * .disk("disk")
     * .build())
     * .workerCount(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-initialcapacityconfig.html)
     */
    public inline fun cfnApplicationInitialCapacityConfigProperty(
        block: CfnApplicationInitialCapacityConfigPropertyDsl.() -> Unit = {}
    ): CfnApplication.InitialCapacityConfigProperty {
        val builder = CfnApplicationInitialCapacityConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emrserverless.*;
     * LogTypeMapKeyValuePairProperty logTypeMapKeyValuePairProperty =
     * LogTypeMapKeyValuePairProperty.builder()
     * .key("key")
     * .value(List.of("value"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-logtypemapkeyvaluepair.html)
     */
    public inline fun cfnApplicationLogTypeMapKeyValuePairProperty(
        block: CfnApplicationLogTypeMapKeyValuePairPropertyDsl.() -> Unit = {}
    ): CfnApplication.LogTypeMapKeyValuePairProperty {
        val builder = CfnApplicationLogTypeMapKeyValuePairPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The managed log persistence configuration for a job run.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emrserverless.*;
     * ManagedPersistenceMonitoringConfigurationProperty
     * managedPersistenceMonitoringConfigurationProperty =
     * ManagedPersistenceMonitoringConfigurationProperty.builder()
     * .enabled(false)
     * .encryptionKeyArn("encryptionKeyArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-managedpersistencemonitoringconfiguration.html)
     */
    public inline fun cfnApplicationManagedPersistenceMonitoringConfigurationProperty(
        block: CfnApplicationManagedPersistenceMonitoringConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplication.ManagedPersistenceMonitoringConfigurationProperty {
        val builder = CfnApplicationManagedPersistenceMonitoringConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The maximum allowed cumulative resources for an application.
     *
     * No new resources will be created once the limit is hit.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emrserverless.*;
     * MaximumAllowedResourcesProperty maximumAllowedResourcesProperty =
     * MaximumAllowedResourcesProperty.builder()
     * .cpu("cpu")
     * .memory("memory")
     * // the properties below are optional
     * .disk("disk")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-maximumallowedresources.html)
     */
    public inline fun cfnApplicationMaximumAllowedResourcesProperty(
        block: CfnApplicationMaximumAllowedResourcesPropertyDsl.() -> Unit = {}
    ): CfnApplication.MaximumAllowedResourcesProperty {
        val builder = CfnApplicationMaximumAllowedResourcesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnApplicationMonitoringConfigurationProperty(
        block: CfnApplicationMonitoringConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplication.MonitoringConfigurationProperty {
        val builder = CfnApplicationMonitoringConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The network configuration for customer VPC connectivity.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emrserverless.*;
     * NetworkConfigurationProperty networkConfigurationProperty =
     * NetworkConfigurationProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-networkconfiguration.html)
     */
    public inline fun cfnApplicationNetworkConfigurationProperty(
        block: CfnApplicationNetworkConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplication.NetworkConfigurationProperty {
        val builder = CfnApplicationNetworkConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnApplication`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emrserverless.*;
     * ConfigurationObjectProperty configurationObjectProperty_;
     * CfnApplicationProps cfnApplicationProps = CfnApplicationProps.builder()
     * .releaseLabel("releaseLabel")
     * .type("type")
     * // the properties below are optional
     * .architecture("architecture")
     * .autoStartConfiguration(AutoStartConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .autoStopConfiguration(AutoStopConfigurationProperty.builder()
     * .enabled(false)
     * .idleTimeoutMinutes(123)
     * .build())
     * .imageConfiguration(ImageConfigurationInputProperty.builder()
     * .imageUri("imageUri")
     * .build())
     * .initialCapacity(List.of(InitialCapacityConfigKeyValuePairProperty.builder()
     * .key("key")
     * .value(InitialCapacityConfigProperty.builder()
     * .workerConfiguration(WorkerConfigurationProperty.builder()
     * .cpu("cpu")
     * .memory("memory")
     * // the properties below are optional
     * .disk("disk")
     * .build())
     * .workerCount(123)
     * .build())
     * .build()))
     * .maximumCapacity(MaximumAllowedResourcesProperty.builder()
     * .cpu("cpu")
     * .memory("memory")
     * // the properties below are optional
     * .disk("disk")
     * .build())
     * .monitoringConfiguration(MonitoringConfigurationProperty.builder()
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
     * .build())
     * .name("name")
     * .networkConfiguration(NetworkConfigurationProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build())
     * .runtimeConfiguration(List.of(ConfigurationObjectProperty.builder()
     * .classification("classification")
     * // the properties below are optional
     * .configurations(List.of(configurationObjectProperty_))
     * .properties(Map.of(
     * "propertiesKey", "properties"))
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .workerTypeSpecifications(Map.of(
     * "workerTypeSpecificationsKey", WorkerTypeSpecificationInputProperty.builder()
     * .imageConfiguration(ImageConfigurationInputProperty.builder()
     * .imageUri("imageUri")
     * .build())
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html)
     */
    public inline fun cfnApplicationProps(
        block: CfnApplicationPropsDsl.() -> Unit = {}
    ): CfnApplicationProps {
        val builder = CfnApplicationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnApplicationS3MonitoringConfigurationProperty(
        block: CfnApplicationS3MonitoringConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplication.S3MonitoringConfigurationProperty {
        val builder = CfnApplicationS3MonitoringConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emrserverless.*;
     * WorkerConfigurationProperty workerConfigurationProperty = WorkerConfigurationProperty.builder()
     * .cpu("cpu")
     * .memory("memory")
     * // the properties below are optional
     * .disk("disk")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-workerconfiguration.html)
     */
    public inline fun cfnApplicationWorkerConfigurationProperty(
        block: CfnApplicationWorkerConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplication.WorkerConfigurationProperty {
        val builder = CfnApplicationWorkerConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The specifications for a worker type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emrserverless.*;
     * WorkerTypeSpecificationInputProperty workerTypeSpecificationInputProperty =
     * WorkerTypeSpecificationInputProperty.builder()
     * .imageConfiguration(ImageConfigurationInputProperty.builder()
     * .imageUri("imageUri")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-workertypespecificationinput.html)
     */
    public inline fun cfnApplicationWorkerTypeSpecificationInputProperty(
        block: CfnApplicationWorkerTypeSpecificationInputPropertyDsl.() -> Unit = {}
    ): CfnApplication.WorkerTypeSpecificationInputProperty {
        val builder = CfnApplicationWorkerTypeSpecificationInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
