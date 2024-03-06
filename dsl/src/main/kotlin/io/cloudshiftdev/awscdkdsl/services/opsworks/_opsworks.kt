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

package io.cloudshiftdev.awscdkdsl.services.opsworks

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.opsworks.CfnApp
import software.amazon.awscdk.services.opsworks.CfnAppProps
import software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachment
import software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachmentProps
import software.amazon.awscdk.services.opsworks.CfnInstance
import software.amazon.awscdk.services.opsworks.CfnInstanceProps
import software.amazon.awscdk.services.opsworks.CfnLayer
import software.amazon.awscdk.services.opsworks.CfnLayerProps
import software.amazon.awscdk.services.opsworks.CfnStack
import software.amazon.awscdk.services.opsworks.CfnStackProps
import software.amazon.awscdk.services.opsworks.CfnUserProfile
import software.amazon.awscdk.services.opsworks.CfnUserProfileProps
import software.amazon.awscdk.services.opsworks.CfnVolume
import software.amazon.awscdk.services.opsworks.CfnVolumeProps
import software.constructs.Construct

public object opsworks {
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opsworks.*;
     * CfnApp cfnApp = CfnApp.Builder.create(this, "MyCfnApp")
     * .name("name")
     * .stackId("stackId")
     * .type("type")
     * // the properties below are optional
     * .appSource(SourceProperty.builder()
     * .password("password")
     * .revision("revision")
     * .sshKey("sshKey")
     * .type("type")
     * .url("url")
     * .username("username")
     * .build())
     * .attributes(Map.of(
     * "attributesKey", "attributes"))
     * .dataSources(List.of(DataSourceProperty.builder()
     * .arn("arn")
     * .databaseName("databaseName")
     * .type("type")
     * .build()))
     * .description("description")
     * .domains(List.of("domains"))
     * .enableSsl(false)
     * .environment(List.of(EnvironmentVariableProperty.builder()
     * .key("key")
     * .value("value")
     * // the properties below are optional
     * .secure(false)
     * .build()))
     * .shortname("shortname")
     * .sslConfiguration(SslConfigurationProperty.builder()
     * .certificate("certificate")
     * .chain("chain")
     * .privateKey("privateKey")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html)
     */
    public inline fun cfnApp(
        scope: Construct,
        id: String,
        block: CfnAppDsl.() -> Unit = {},
    ): CfnApp {
        val builder = CfnAppDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opsworks.*;
     * DataSourceProperty dataSourceProperty = DataSourceProperty.builder()
     * .arn("arn")
     * .databaseName("databaseName")
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-datasource.html)
     */
    public inline fun cfnAppDataSourceProperty(
        block: CfnAppDataSourcePropertyDsl.() -> Unit = {}
    ): CfnApp.DataSourceProperty {
        val builder = CfnAppDataSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opsworks.*;
     * EnvironmentVariableProperty environmentVariableProperty = EnvironmentVariableProperty.builder()
     * .key("key")
     * .value("value")
     * // the properties below are optional
     * .secure(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-environmentvariable.html)
     */
    public inline fun cfnAppEnvironmentVariableProperty(
        block: CfnAppEnvironmentVariablePropertyDsl.() -> Unit = {}
    ): CfnApp.EnvironmentVariableProperty {
        val builder = CfnAppEnvironmentVariablePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnApp`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opsworks.*;
     * CfnAppProps cfnAppProps = CfnAppProps.builder()
     * .name("name")
     * .stackId("stackId")
     * .type("type")
     * // the properties below are optional
     * .appSource(SourceProperty.builder()
     * .password("password")
     * .revision("revision")
     * .sshKey("sshKey")
     * .type("type")
     * .url("url")
     * .username("username")
     * .build())
     * .attributes(Map.of(
     * "attributesKey", "attributes"))
     * .dataSources(List.of(DataSourceProperty.builder()
     * .arn("arn")
     * .databaseName("databaseName")
     * .type("type")
     * .build()))
     * .description("description")
     * .domains(List.of("domains"))
     * .enableSsl(false)
     * .environment(List.of(EnvironmentVariableProperty.builder()
     * .key("key")
     * .value("value")
     * // the properties below are optional
     * .secure(false)
     * .build()))
     * .shortname("shortname")
     * .sslConfiguration(SslConfigurationProperty.builder()
     * .certificate("certificate")
     * .chain("chain")
     * .privateKey("privateKey")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html)
     */
    public inline fun cfnAppProps(block: CfnAppPropsDsl.() -> Unit = {}): CfnAppProps {
        val builder = CfnAppPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opsworks.*;
     * SourceProperty sourceProperty = SourceProperty.builder()
     * .password("password")
     * .revision("revision")
     * .sshKey("sshKey")
     * .type("type")
     * .url("url")
     * .username("username")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-source.html)
     */
    public inline fun cfnAppSourceProperty(
        block: CfnAppSourcePropertyDsl.() -> Unit = {}
    ): CfnApp.SourceProperty {
        val builder = CfnAppSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opsworks.*;
     * SslConfigurationProperty sslConfigurationProperty = SslConfigurationProperty.builder()
     * .certificate("certificate")
     * .chain("chain")
     * .privateKey("privateKey")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-sslconfiguration.html)
     */
    public inline fun cfnAppSslConfigurationProperty(
        block: CfnAppSslConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApp.SslConfigurationProperty {
        val builder = CfnAppSslConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-elbattachment.html.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opsworks.*;
     * CfnElasticLoadBalancerAttachment cfnElasticLoadBalancerAttachment =
     * CfnElasticLoadBalancerAttachment.Builder.create(this, "MyCfnElasticLoadBalancerAttachment")
     * .elasticLoadBalancerName("elasticLoadBalancerName")
     * .layerId("layerId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-elasticloadbalancerattachment.html)
     */
    public inline fun cfnElasticLoadBalancerAttachment(
        scope: Construct,
        id: String,
        block: CfnElasticLoadBalancerAttachmentDsl.() -> Unit = {},
    ): CfnElasticLoadBalancerAttachment {
        val builder = CfnElasticLoadBalancerAttachmentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnElasticLoadBalancerAttachment`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opsworks.*;
     * CfnElasticLoadBalancerAttachmentProps cfnElasticLoadBalancerAttachmentProps =
     * CfnElasticLoadBalancerAttachmentProps.builder()
     * .elasticLoadBalancerName("elasticLoadBalancerName")
     * .layerId("layerId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-elasticloadbalancerattachment.html)
     */
    public inline fun cfnElasticLoadBalancerAttachmentProps(
        block: CfnElasticLoadBalancerAttachmentPropsDsl.() -> Unit = {}
    ): CfnElasticLoadBalancerAttachmentProps {
        val builder = CfnElasticLoadBalancerAttachmentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opsworks.*;
     * CfnInstance cfnInstance = CfnInstance.Builder.create(this, "MyCfnInstance")
     * .instanceType("instanceType")
     * .layerIds(List.of("layerIds"))
     * .stackId("stackId")
     * // the properties below are optional
     * .agentVersion("agentVersion")
     * .amiId("amiId")
     * .architecture("architecture")
     * .autoScalingType("autoScalingType")
     * .availabilityZone("availabilityZone")
     * .blockDeviceMappings(List.of(BlockDeviceMappingProperty.builder()
     * .deviceName("deviceName")
     * .ebs(EbsBlockDeviceProperty.builder()
     * .deleteOnTermination(false)
     * .iops(123)
     * .snapshotId("snapshotId")
     * .volumeSize(123)
     * .volumeType("volumeType")
     * .build())
     * .noDevice("noDevice")
     * .virtualName("virtualName")
     * .build()))
     * .ebsOptimized(false)
     * .elasticIps(List.of("elasticIps"))
     * .hostname("hostname")
     * .installUpdatesOnBoot(false)
     * .os("os")
     * .rootDeviceType("rootDeviceType")
     * .sshKeyName("sshKeyName")
     * .subnetId("subnetId")
     * .tenancy("tenancy")
     * .timeBasedAutoScaling(TimeBasedAutoScalingProperty.builder()
     * .friday(Map.of(
     * "fridayKey", "friday"))
     * .monday(Map.of(
     * "mondayKey", "monday"))
     * .saturday(Map.of(
     * "saturdayKey", "saturday"))
     * .sunday(Map.of(
     * "sundayKey", "sunday"))
     * .thursday(Map.of(
     * "thursdayKey", "thursday"))
     * .tuesday(Map.of(
     * "tuesdayKey", "tuesday"))
     * .wednesday(Map.of(
     * "wednesdayKey", "wednesday"))
     * .build())
     * .virtualizationType("virtualizationType")
     * .volumes(List.of("volumes"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html)
     */
    public inline fun cfnInstance(
        scope: Construct,
        id: String,
        block: CfnInstanceDsl.() -> Unit = {},
    ): CfnInstance {
        val builder = CfnInstanceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opsworks.*;
     * BlockDeviceMappingProperty blockDeviceMappingProperty = BlockDeviceMappingProperty.builder()
     * .deviceName("deviceName")
     * .ebs(EbsBlockDeviceProperty.builder()
     * .deleteOnTermination(false)
     * .iops(123)
     * .snapshotId("snapshotId")
     * .volumeSize(123)
     * .volumeType("volumeType")
     * .build())
     * .noDevice("noDevice")
     * .virtualName("virtualName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html)
     */
    public inline fun cfnInstanceBlockDeviceMappingProperty(
        block: CfnInstanceBlockDeviceMappingPropertyDsl.() -> Unit = {}
    ): CfnInstance.BlockDeviceMappingProperty {
        val builder = CfnInstanceBlockDeviceMappingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opsworks.*;
     * EbsBlockDeviceProperty ebsBlockDeviceProperty = EbsBlockDeviceProperty.builder()
     * .deleteOnTermination(false)
     * .iops(123)
     * .snapshotId("snapshotId")
     * .volumeSize(123)
     * .volumeType("volumeType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html)
     */
    public inline fun cfnInstanceEbsBlockDeviceProperty(
        block: CfnInstanceEbsBlockDevicePropertyDsl.() -> Unit = {}
    ): CfnInstance.EbsBlockDeviceProperty {
        val builder = CfnInstanceEbsBlockDevicePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnInstance`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opsworks.*;
     * CfnInstanceProps cfnInstanceProps = CfnInstanceProps.builder()
     * .instanceType("instanceType")
     * .layerIds(List.of("layerIds"))
     * .stackId("stackId")
     * // the properties below are optional
     * .agentVersion("agentVersion")
     * .amiId("amiId")
     * .architecture("architecture")
     * .autoScalingType("autoScalingType")
     * .availabilityZone("availabilityZone")
     * .blockDeviceMappings(List.of(BlockDeviceMappingProperty.builder()
     * .deviceName("deviceName")
     * .ebs(EbsBlockDeviceProperty.builder()
     * .deleteOnTermination(false)
     * .iops(123)
     * .snapshotId("snapshotId")
     * .volumeSize(123)
     * .volumeType("volumeType")
     * .build())
     * .noDevice("noDevice")
     * .virtualName("virtualName")
     * .build()))
     * .ebsOptimized(false)
     * .elasticIps(List.of("elasticIps"))
     * .hostname("hostname")
     * .installUpdatesOnBoot(false)
     * .os("os")
     * .rootDeviceType("rootDeviceType")
     * .sshKeyName("sshKeyName")
     * .subnetId("subnetId")
     * .tenancy("tenancy")
     * .timeBasedAutoScaling(TimeBasedAutoScalingProperty.builder()
     * .friday(Map.of(
     * "fridayKey", "friday"))
     * .monday(Map.of(
     * "mondayKey", "monday"))
     * .saturday(Map.of(
     * "saturdayKey", "saturday"))
     * .sunday(Map.of(
     * "sundayKey", "sunday"))
     * .thursday(Map.of(
     * "thursdayKey", "thursday"))
     * .tuesday(Map.of(
     * "tuesdayKey", "tuesday"))
     * .wednesday(Map.of(
     * "wednesdayKey", "wednesday"))
     * .build())
     * .virtualizationType("virtualizationType")
     * .volumes(List.of("volumes"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html)
     */
    public inline fun cfnInstanceProps(
        block: CfnInstancePropsDsl.() -> Unit = {}
    ): CfnInstanceProps {
        val builder = CfnInstancePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opsworks.*;
     * TimeBasedAutoScalingProperty timeBasedAutoScalingProperty =
     * TimeBasedAutoScalingProperty.builder()
     * .friday(Map.of(
     * "fridayKey", "friday"))
     * .monday(Map.of(
     * "mondayKey", "monday"))
     * .saturday(Map.of(
     * "saturdayKey", "saturday"))
     * .sunday(Map.of(
     * "sundayKey", "sunday"))
     * .thursday(Map.of(
     * "thursdayKey", "thursday"))
     * .tuesday(Map.of(
     * "tuesdayKey", "tuesday"))
     * .wednesday(Map.of(
     * "wednesdayKey", "wednesday"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html)
     */
    public inline fun cfnInstanceTimeBasedAutoScalingProperty(
        block: CfnInstanceTimeBasedAutoScalingPropertyDsl.() -> Unit = {}
    ): CfnInstance.TimeBasedAutoScalingProperty {
        val builder = CfnInstanceTimeBasedAutoScalingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opsworks.*;
     * Object customJson;
     * CfnLayer cfnLayer = CfnLayer.Builder.create(this, "MyCfnLayer")
     * .autoAssignElasticIps(false)
     * .autoAssignPublicIps(false)
     * .enableAutoHealing(false)
     * .name("name")
     * .shortname("shortname")
     * .stackId("stackId")
     * .type("type")
     * // the properties below are optional
     * .attributes(Map.of(
     * "attributesKey", "attributes"))
     * .customInstanceProfileArn("customInstanceProfileArn")
     * .customJson(customJson)
     * .customRecipes(RecipesProperty.builder()
     * .configure(List.of("configure"))
     * .deploy(List.of("deploy"))
     * .setup(List.of("setup"))
     * .shutdown(List.of("shutdown"))
     * .undeploy(List.of("undeploy"))
     * .build())
     * .customSecurityGroupIds(List.of("customSecurityGroupIds"))
     * .installUpdatesOnBoot(false)
     * .lifecycleEventConfiguration(LifecycleEventConfigurationProperty.builder()
     * .shutdownEventConfiguration(ShutdownEventConfigurationProperty.builder()
     * .delayUntilElbConnectionsDrained(false)
     * .executionTimeout(123)
     * .build())
     * .build())
     * .loadBasedAutoScaling(LoadBasedAutoScalingProperty.builder()
     * .downScaling(AutoScalingThresholdsProperty.builder()
     * .cpuThreshold(123)
     * .ignoreMetricsTime(123)
     * .instanceCount(123)
     * .loadThreshold(123)
     * .memoryThreshold(123)
     * .thresholdsWaitTime(123)
     * .build())
     * .enable(false)
     * .upScaling(AutoScalingThresholdsProperty.builder()
     * .cpuThreshold(123)
     * .ignoreMetricsTime(123)
     * .instanceCount(123)
     * .loadThreshold(123)
     * .memoryThreshold(123)
     * .thresholdsWaitTime(123)
     * .build())
     * .build())
     * .packages(List.of("packages"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .useEbsOptimizedInstances(false)
     * .volumeConfigurations(List.of(VolumeConfigurationProperty.builder()
     * .encrypted(false)
     * .iops(123)
     * .mountPoint("mountPoint")
     * .numberOfDisks(123)
     * .raidLevel(123)
     * .size(123)
     * .volumeType("volumeType")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html)
     */
    public inline fun cfnLayer(
        scope: Construct,
        id: String,
        block: CfnLayerDsl.() -> Unit = {},
    ): CfnLayer {
        val builder = CfnLayerDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opsworks.*;
     * AutoScalingThresholdsProperty autoScalingThresholdsProperty =
     * AutoScalingThresholdsProperty.builder()
     * .cpuThreshold(123)
     * .ignoreMetricsTime(123)
     * .instanceCount(123)
     * .loadThreshold(123)
     * .memoryThreshold(123)
     * .thresholdsWaitTime(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-autoscalingthresholds.html)
     */
    public inline fun cfnLayerAutoScalingThresholdsProperty(
        block: CfnLayerAutoScalingThresholdsPropertyDsl.() -> Unit = {}
    ): CfnLayer.AutoScalingThresholdsProperty {
        val builder = CfnLayerAutoScalingThresholdsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opsworks.*;
     * LifecycleEventConfigurationProperty lifecycleEventConfigurationProperty =
     * LifecycleEventConfigurationProperty.builder()
     * .shutdownEventConfiguration(ShutdownEventConfigurationProperty.builder()
     * .delayUntilElbConnectionsDrained(false)
     * .executionTimeout(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration.html)
     */
    public inline fun cfnLayerLifecycleEventConfigurationProperty(
        block: CfnLayerLifecycleEventConfigurationPropertyDsl.() -> Unit = {}
    ): CfnLayer.LifecycleEventConfigurationProperty {
        val builder = CfnLayerLifecycleEventConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opsworks.*;
     * LoadBasedAutoScalingProperty loadBasedAutoScalingProperty =
     * LoadBasedAutoScalingProperty.builder()
     * .downScaling(AutoScalingThresholdsProperty.builder()
     * .cpuThreshold(123)
     * .ignoreMetricsTime(123)
     * .instanceCount(123)
     * .loadThreshold(123)
     * .memoryThreshold(123)
     * .thresholdsWaitTime(123)
     * .build())
     * .enable(false)
     * .upScaling(AutoScalingThresholdsProperty.builder()
     * .cpuThreshold(123)
     * .ignoreMetricsTime(123)
     * .instanceCount(123)
     * .loadThreshold(123)
     * .memoryThreshold(123)
     * .thresholdsWaitTime(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling.html)
     */
    public inline fun cfnLayerLoadBasedAutoScalingProperty(
        block: CfnLayerLoadBasedAutoScalingPropertyDsl.() -> Unit = {}
    ): CfnLayer.LoadBasedAutoScalingProperty {
        val builder = CfnLayerLoadBasedAutoScalingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnLayer`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opsworks.*;
     * Object customJson;
     * CfnLayerProps cfnLayerProps = CfnLayerProps.builder()
     * .autoAssignElasticIps(false)
     * .autoAssignPublicIps(false)
     * .enableAutoHealing(false)
     * .name("name")
     * .shortname("shortname")
     * .stackId("stackId")
     * .type("type")
     * // the properties below are optional
     * .attributes(Map.of(
     * "attributesKey", "attributes"))
     * .customInstanceProfileArn("customInstanceProfileArn")
     * .customJson(customJson)
     * .customRecipes(RecipesProperty.builder()
     * .configure(List.of("configure"))
     * .deploy(List.of("deploy"))
     * .setup(List.of("setup"))
     * .shutdown(List.of("shutdown"))
     * .undeploy(List.of("undeploy"))
     * .build())
     * .customSecurityGroupIds(List.of("customSecurityGroupIds"))
     * .installUpdatesOnBoot(false)
     * .lifecycleEventConfiguration(LifecycleEventConfigurationProperty.builder()
     * .shutdownEventConfiguration(ShutdownEventConfigurationProperty.builder()
     * .delayUntilElbConnectionsDrained(false)
     * .executionTimeout(123)
     * .build())
     * .build())
     * .loadBasedAutoScaling(LoadBasedAutoScalingProperty.builder()
     * .downScaling(AutoScalingThresholdsProperty.builder()
     * .cpuThreshold(123)
     * .ignoreMetricsTime(123)
     * .instanceCount(123)
     * .loadThreshold(123)
     * .memoryThreshold(123)
     * .thresholdsWaitTime(123)
     * .build())
     * .enable(false)
     * .upScaling(AutoScalingThresholdsProperty.builder()
     * .cpuThreshold(123)
     * .ignoreMetricsTime(123)
     * .instanceCount(123)
     * .loadThreshold(123)
     * .memoryThreshold(123)
     * .thresholdsWaitTime(123)
     * .build())
     * .build())
     * .packages(List.of("packages"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .useEbsOptimizedInstances(false)
     * .volumeConfigurations(List.of(VolumeConfigurationProperty.builder()
     * .encrypted(false)
     * .iops(123)
     * .mountPoint("mountPoint")
     * .numberOfDisks(123)
     * .raidLevel(123)
     * .size(123)
     * .volumeType("volumeType")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html)
     */
    public inline fun cfnLayerProps(block: CfnLayerPropsDsl.() -> Unit = {}): CfnLayerProps {
        val builder = CfnLayerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opsworks.*;
     * RecipesProperty recipesProperty = RecipesProperty.builder()
     * .configure(List.of("configure"))
     * .deploy(List.of("deploy"))
     * .setup(List.of("setup"))
     * .shutdown(List.of("shutdown"))
     * .undeploy(List.of("undeploy"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html)
     */
    public inline fun cfnLayerRecipesProperty(
        block: CfnLayerRecipesPropertyDsl.() -> Unit = {}
    ): CfnLayer.RecipesProperty {
        val builder = CfnLayerRecipesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opsworks.*;
     * ShutdownEventConfigurationProperty shutdownEventConfigurationProperty =
     * ShutdownEventConfigurationProperty.builder()
     * .delayUntilElbConnectionsDrained(false)
     * .executionTimeout(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-shutdowneventconfiguration.html)
     */
    public inline fun cfnLayerShutdownEventConfigurationProperty(
        block: CfnLayerShutdownEventConfigurationPropertyDsl.() -> Unit = {}
    ): CfnLayer.ShutdownEventConfigurationProperty {
        val builder = CfnLayerShutdownEventConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opsworks.*;
     * VolumeConfigurationProperty volumeConfigurationProperty = VolumeConfigurationProperty.builder()
     * .encrypted(false)
     * .iops(123)
     * .mountPoint("mountPoint")
     * .numberOfDisks(123)
     * .raidLevel(123)
     * .size(123)
     * .volumeType("volumeType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html)
     */
    public inline fun cfnLayerVolumeConfigurationProperty(
        block: CfnLayerVolumeConfigurationPropertyDsl.() -> Unit = {}
    ): CfnLayer.VolumeConfigurationProperty {
        val builder = CfnLayerVolumeConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opsworks.*;
     * Object customJson;
     * CfnStack cfnStack = CfnStack.Builder.create(this, "MyCfnStack")
     * .defaultInstanceProfileArn("defaultInstanceProfileArn")
     * .name("name")
     * .serviceRoleArn("serviceRoleArn")
     * // the properties below are optional
     * .agentVersion("agentVersion")
     * .attributes(Map.of(
     * "attributesKey", "attributes"))
     * .chefConfiguration(ChefConfigurationProperty.builder()
     * .berkshelfVersion("berkshelfVersion")
     * .manageBerkshelf(false)
     * .build())
     * .cloneAppIds(List.of("cloneAppIds"))
     * .clonePermissions(false)
     * .configurationManager(StackConfigurationManagerProperty.builder()
     * .name("name")
     * .version("version")
     * .build())
     * .customCookbooksSource(SourceProperty.builder()
     * .password("password")
     * .revision("revision")
     * .sshKey("sshKey")
     * .type("type")
     * .url("url")
     * .username("username")
     * .build())
     * .customJson(customJson)
     * .defaultAvailabilityZone("defaultAvailabilityZone")
     * .defaultOs("defaultOs")
     * .defaultRootDeviceType("defaultRootDeviceType")
     * .defaultSshKeyName("defaultSshKeyName")
     * .defaultSubnetId("defaultSubnetId")
     * .ecsClusterArn("ecsClusterArn")
     * .elasticIps(List.of(ElasticIpProperty.builder()
     * .ip("ip")
     * // the properties below are optional
     * .name("name")
     * .build()))
     * .hostnameTheme("hostnameTheme")
     * .rdsDbInstances(List.of(RdsDbInstanceProperty.builder()
     * .dbPassword("dbPassword")
     * .dbUser("dbUser")
     * .rdsDbInstanceArn("rdsDbInstanceArn")
     * .build()))
     * .sourceStackId("sourceStackId")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .useCustomCookbooks(false)
     * .useOpsworksSecurityGroups(false)
     * .vpcId("vpcId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html)
     */
    public inline fun cfnStack(
        scope: Construct,
        id: String,
        block: CfnStackDsl.() -> Unit = {},
    ): CfnStack {
        val builder = CfnStackDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opsworks.*;
     * ChefConfigurationProperty chefConfigurationProperty = ChefConfigurationProperty.builder()
     * .berkshelfVersion("berkshelfVersion")
     * .manageBerkshelf(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-chefconfiguration.html)
     */
    public inline fun cfnStackChefConfigurationProperty(
        block: CfnStackChefConfigurationPropertyDsl.() -> Unit = {}
    ): CfnStack.ChefConfigurationProperty {
        val builder = CfnStackChefConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opsworks.*;
     * ElasticIpProperty elasticIpProperty = ElasticIpProperty.builder()
     * .ip("ip")
     * // the properties below are optional
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-elasticip.html)
     */
    public inline fun cfnStackElasticIpProperty(
        block: CfnStackElasticIpPropertyDsl.() -> Unit = {}
    ): CfnStack.ElasticIpProperty {
        val builder = CfnStackElasticIpPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnStack`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opsworks.*;
     * Object customJson;
     * CfnStackProps cfnStackProps = CfnStackProps.builder()
     * .defaultInstanceProfileArn("defaultInstanceProfileArn")
     * .name("name")
     * .serviceRoleArn("serviceRoleArn")
     * // the properties below are optional
     * .agentVersion("agentVersion")
     * .attributes(Map.of(
     * "attributesKey", "attributes"))
     * .chefConfiguration(ChefConfigurationProperty.builder()
     * .berkshelfVersion("berkshelfVersion")
     * .manageBerkshelf(false)
     * .build())
     * .cloneAppIds(List.of("cloneAppIds"))
     * .clonePermissions(false)
     * .configurationManager(StackConfigurationManagerProperty.builder()
     * .name("name")
     * .version("version")
     * .build())
     * .customCookbooksSource(SourceProperty.builder()
     * .password("password")
     * .revision("revision")
     * .sshKey("sshKey")
     * .type("type")
     * .url("url")
     * .username("username")
     * .build())
     * .customJson(customJson)
     * .defaultAvailabilityZone("defaultAvailabilityZone")
     * .defaultOs("defaultOs")
     * .defaultRootDeviceType("defaultRootDeviceType")
     * .defaultSshKeyName("defaultSshKeyName")
     * .defaultSubnetId("defaultSubnetId")
     * .ecsClusterArn("ecsClusterArn")
     * .elasticIps(List.of(ElasticIpProperty.builder()
     * .ip("ip")
     * // the properties below are optional
     * .name("name")
     * .build()))
     * .hostnameTheme("hostnameTheme")
     * .rdsDbInstances(List.of(RdsDbInstanceProperty.builder()
     * .dbPassword("dbPassword")
     * .dbUser("dbUser")
     * .rdsDbInstanceArn("rdsDbInstanceArn")
     * .build()))
     * .sourceStackId("sourceStackId")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .useCustomCookbooks(false)
     * .useOpsworksSecurityGroups(false)
     * .vpcId("vpcId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html)
     */
    public inline fun cfnStackProps(block: CfnStackPropsDsl.() -> Unit = {}): CfnStackProps {
        val builder = CfnStackPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opsworks.*;
     * RdsDbInstanceProperty rdsDbInstanceProperty = RdsDbInstanceProperty.builder()
     * .dbPassword("dbPassword")
     * .dbUser("dbUser")
     * .rdsDbInstanceArn("rdsDbInstanceArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-rdsdbinstance.html)
     */
    public inline fun cfnStackRdsDbInstanceProperty(
        block: CfnStackRdsDbInstancePropertyDsl.() -> Unit = {}
    ): CfnStack.RdsDbInstanceProperty {
        val builder = CfnStackRdsDbInstancePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opsworks.*;
     * SourceProperty sourceProperty = SourceProperty.builder()
     * .password("password")
     * .revision("revision")
     * .sshKey("sshKey")
     * .type("type")
     * .url("url")
     * .username("username")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html)
     */
    public inline fun cfnStackSourceProperty(
        block: CfnStackSourcePropertyDsl.() -> Unit = {}
    ): CfnStack.SourceProperty {
        val builder = CfnStackSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opsworks.*;
     * StackConfigurationManagerProperty stackConfigurationManagerProperty =
     * StackConfigurationManagerProperty.builder()
     * .name("name")
     * .version("version")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-stackconfigurationmanager.html)
     */
    public inline fun cfnStackStackConfigurationManagerProperty(
        block: CfnStackStackConfigurationManagerPropertyDsl.() -> Unit = {}
    ): CfnStack.StackConfigurationManagerProperty {
        val builder = CfnStackStackConfigurationManagerPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opsworks.*;
     * CfnUserProfile cfnUserProfile = CfnUserProfile.Builder.create(this, "MyCfnUserProfile")
     * .iamUserArn("iamUserArn")
     * // the properties below are optional
     * .allowSelfManagement(false)
     * .sshPublicKey("sshPublicKey")
     * .sshUsername("sshUsername")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html)
     */
    public inline fun cfnUserProfile(
        scope: Construct,
        id: String,
        block: CfnUserProfileDsl.() -> Unit = {},
    ): CfnUserProfile {
        val builder = CfnUserProfileDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnUserProfile`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opsworks.*;
     * CfnUserProfileProps cfnUserProfileProps = CfnUserProfileProps.builder()
     * .iamUserArn("iamUserArn")
     * // the properties below are optional
     * .allowSelfManagement(false)
     * .sshPublicKey("sshPublicKey")
     * .sshUsername("sshUsername")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html)
     */
    public inline fun cfnUserProfileProps(
        block: CfnUserProfilePropsDsl.() -> Unit = {}
    ): CfnUserProfileProps {
        val builder = CfnUserProfilePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opsworks.*;
     * CfnVolume cfnVolume = CfnVolume.Builder.create(this, "MyCfnVolume")
     * .ec2VolumeId("ec2VolumeId")
     * .stackId("stackId")
     * // the properties below are optional
     * .mountPoint("mountPoint")
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html)
     */
    public inline fun cfnVolume(
        scope: Construct,
        id: String,
        block: CfnVolumeDsl.() -> Unit = {},
    ): CfnVolume {
        val builder = CfnVolumeDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnVolume`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opsworks.*;
     * CfnVolumeProps cfnVolumeProps = CfnVolumeProps.builder()
     * .ec2VolumeId("ec2VolumeId")
     * .stackId("stackId")
     * // the properties below are optional
     * .mountPoint("mountPoint")
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html)
     */
    public inline fun cfnVolumeProps(block: CfnVolumePropsDsl.() -> Unit = {}): CfnVolumeProps {
        val builder = CfnVolumePropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
