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

package cloudshift.awscdk.dsl.services.emrserverless

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
     * .name("name")
     * .networkConfiguration(NetworkConfigurationProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build())
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
     * The conﬁguration for an application to automatically start on job submission.
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
     * The conﬁguration for an application to automatically stop after a certain amount of time
     * being idle.
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
     * The initial capacity configuration per worker.
     *
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
     * .name("name")
     * .networkConfiguration(NetworkConfigurationProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build())
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
     * The resource configuration of the initial capacity configuration.
     *
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
