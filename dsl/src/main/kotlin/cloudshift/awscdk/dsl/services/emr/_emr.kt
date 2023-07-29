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

package cloudshift.awscdk.dsl.services.emr

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnCluster
import software.amazon.awscdk.services.emr.CfnClusterProps
import software.amazon.awscdk.services.emr.CfnInstanceFleetConfig
import software.amazon.awscdk.services.emr.CfnInstanceFleetConfigProps
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfig
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfigProps
import software.amazon.awscdk.services.emr.CfnSecurityConfiguration
import software.amazon.awscdk.services.emr.CfnSecurityConfigurationProps
import software.amazon.awscdk.services.emr.CfnStep
import software.amazon.awscdk.services.emr.CfnStepProps
import software.amazon.awscdk.services.emr.CfnStudio
import software.amazon.awscdk.services.emr.CfnStudioProps
import software.amazon.awscdk.services.emr.CfnStudioSessionMapping
import software.amazon.awscdk.services.emr.CfnStudioSessionMappingProps
import software.constructs.Construct

public object emr {
    /**
     * The `AWS::EMR::Cluster` resource specifies an Amazon EMR cluster.
     *
     * This cluster is a collection of Amazon EC2 instances that run open source big data frameworks
     * and applications to process and analyze vast amounts of data. For more information, see the
     * [Amazon EMR Management Guide](https://docs.aws.amazon.com//emr/latest/ManagementGuide/) .
     *
     * Amazon EMR now supports launching task instance groups and task instance fleets as part of
     * the `AWS::EMR::Cluster` resource. This can be done by using the `JobFlowInstancesConfig`
     * property type's `TaskInstanceGroups` and `TaskInstanceFleets` subproperties. Using these
     * subproperties reduces delays in provisioning task nodes compared to specifying task nodes
     * with the `AWS::EMR::InstanceGroupConfig` and `AWS::EMR::InstanceFleetConfig` resources.
     * Please refer to the examples at the bottom of this page to learn how to use these
     * subproperties.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * Object additionalInfo;
     * ConfigurationProperty configurationProperty_;
     * CfnCluster cfnCluster = CfnCluster.Builder.create(this, "MyCfnCluster")
     * .instances(JobFlowInstancesConfigProperty.builder()
     * .additionalMasterSecurityGroups(List.of("additionalMasterSecurityGroups"))
     * .additionalSlaveSecurityGroups(List.of("additionalSlaveSecurityGroups"))
     * .coreInstanceFleet(InstanceFleetConfigProperty.builder()
     * .instanceTypeConfigs(List.of(InstanceTypeConfigProperty.builder()
     * .instanceType("instanceType")
     * // the properties below are optional
     * .bidPrice("bidPrice")
     * .bidPriceAsPercentageOfOnDemandPrice(123)
     * .configurations(List.of(ConfigurationProperty.builder()
     * .classification("classification")
     * .configurationProperties(Map.of(
     * "configurationPropertiesKey", "configurationProperties"))
     * .configurations(List.of(configurationProperty_))
     * .build()))
     * .customAmiId("customAmiId")
     * .ebsConfiguration(EbsConfigurationProperty.builder()
     * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
     * .volumeSpecification(VolumeSpecificationProperty.builder()
     * .sizeInGb(123)
     * .volumeType("volumeType")
     * // the properties below are optional
     * .iops(123)
     * .build())
     * // the properties below are optional
     * .volumesPerInstance(123)
     * .build()))
     * .ebsOptimized(false)
     * .build())
     * .weightedCapacity(123)
     * .build()))
     * .launchSpecifications(InstanceFleetProvisioningSpecificationsProperty.builder()
     * .onDemandSpecification(OnDemandProvisioningSpecificationProperty.builder()
     * .allocationStrategy("allocationStrategy")
     * .build())
     * .spotSpecification(SpotProvisioningSpecificationProperty.builder()
     * .timeoutAction("timeoutAction")
     * .timeoutDurationMinutes(123)
     * // the properties below are optional
     * .allocationStrategy("allocationStrategy")
     * .blockDurationMinutes(123)
     * .build())
     * .build())
     * .name("name")
     * .targetOnDemandCapacity(123)
     * .targetSpotCapacity(123)
     * .build())
     * .coreInstanceGroup(InstanceGroupConfigProperty.builder()
     * .instanceCount(123)
     * .instanceType("instanceType")
     * // the properties below are optional
     * .autoScalingPolicy(AutoScalingPolicyProperty.builder()
     * .constraints(ScalingConstraintsProperty.builder()
     * .maxCapacity(123)
     * .minCapacity(123)
     * .build())
     * .rules(List.of(ScalingRuleProperty.builder()
     * .action(ScalingActionProperty.builder()
     * .simpleScalingPolicyConfiguration(SimpleScalingPolicyConfigurationProperty.builder()
     * .scalingAdjustment(123)
     * // the properties below are optional
     * .adjustmentType("adjustmentType")
     * .coolDown(123)
     * .build())
     * // the properties below are optional
     * .market("market")
     * .build())
     * .name("name")
     * .trigger(ScalingTriggerProperty.builder()
     * .cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty.builder()
     * .comparisonOperator("comparisonOperator")
     * .metricName("metricName")
     * .period(123)
     * .threshold(123)
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .evaluationPeriods(123)
     * .namespace("namespace")
     * .statistic("statistic")
     * .unit("unit")
     * .build())
     * .build())
     * // the properties below are optional
     * .description("description")
     * .build()))
     * .build())
     * .bidPrice("bidPrice")
     * .configurations(List.of(ConfigurationProperty.builder()
     * .classification("classification")
     * .configurationProperties(Map.of(
     * "configurationPropertiesKey", "configurationProperties"))
     * .configurations(List.of(configurationProperty_))
     * .build()))
     * .customAmiId("customAmiId")
     * .ebsConfiguration(EbsConfigurationProperty.builder()
     * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
     * .volumeSpecification(VolumeSpecificationProperty.builder()
     * .sizeInGb(123)
     * .volumeType("volumeType")
     * // the properties below are optional
     * .iops(123)
     * .build())
     * // the properties below are optional
     * .volumesPerInstance(123)
     * .build()))
     * .ebsOptimized(false)
     * .build())
     * .market("market")
     * .name("name")
     * .build())
     * .ec2KeyName("ec2KeyName")
     * .ec2SubnetId("ec2SubnetId")
     * .ec2SubnetIds(List.of("ec2SubnetIds"))
     * .emrManagedMasterSecurityGroup("emrManagedMasterSecurityGroup")
     * .emrManagedSlaveSecurityGroup("emrManagedSlaveSecurityGroup")
     * .hadoopVersion("hadoopVersion")
     * .keepJobFlowAliveWhenNoSteps(false)
     * .masterInstanceFleet(InstanceFleetConfigProperty.builder()
     * .instanceTypeConfigs(List.of(InstanceTypeConfigProperty.builder()
     * .instanceType("instanceType")
     * // the properties below are optional
     * .bidPrice("bidPrice")
     * .bidPriceAsPercentageOfOnDemandPrice(123)
     * .configurations(List.of(ConfigurationProperty.builder()
     * .classification("classification")
     * .configurationProperties(Map.of(
     * "configurationPropertiesKey", "configurationProperties"))
     * .configurations(List.of(configurationProperty_))
     * .build()))
     * .customAmiId("customAmiId")
     * .ebsConfiguration(EbsConfigurationProperty.builder()
     * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
     * .volumeSpecification(VolumeSpecificationProperty.builder()
     * .sizeInGb(123)
     * .volumeType("volumeType")
     * // the properties below are optional
     * .iops(123)
     * .build())
     * // the properties below are optional
     * .volumesPerInstance(123)
     * .build()))
     * .ebsOptimized(false)
     * .build())
     * .weightedCapacity(123)
     * .build()))
     * .launchSpecifications(InstanceFleetProvisioningSpecificationsProperty.builder()
     * .onDemandSpecification(OnDemandProvisioningSpecificationProperty.builder()
     * .allocationStrategy("allocationStrategy")
     * .build())
     * .spotSpecification(SpotProvisioningSpecificationProperty.builder()
     * .timeoutAction("timeoutAction")
     * .timeoutDurationMinutes(123)
     * // the properties below are optional
     * .allocationStrategy("allocationStrategy")
     * .blockDurationMinutes(123)
     * .build())
     * .build())
     * .name("name")
     * .targetOnDemandCapacity(123)
     * .targetSpotCapacity(123)
     * .build())
     * .masterInstanceGroup(InstanceGroupConfigProperty.builder()
     * .instanceCount(123)
     * .instanceType("instanceType")
     * // the properties below are optional
     * .autoScalingPolicy(AutoScalingPolicyProperty.builder()
     * .constraints(ScalingConstraintsProperty.builder()
     * .maxCapacity(123)
     * .minCapacity(123)
     * .build())
     * .rules(List.of(ScalingRuleProperty.builder()
     * .action(ScalingActionProperty.builder()
     * .simpleScalingPolicyConfiguration(SimpleScalingPolicyConfigurationProperty.builder()
     * .scalingAdjustment(123)
     * // the properties below are optional
     * .adjustmentType("adjustmentType")
     * .coolDown(123)
     * .build())
     * // the properties below are optional
     * .market("market")
     * .build())
     * .name("name")
     * .trigger(ScalingTriggerProperty.builder()
     * .cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty.builder()
     * .comparisonOperator("comparisonOperator")
     * .metricName("metricName")
     * .period(123)
     * .threshold(123)
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .evaluationPeriods(123)
     * .namespace("namespace")
     * .statistic("statistic")
     * .unit("unit")
     * .build())
     * .build())
     * // the properties below are optional
     * .description("description")
     * .build()))
     * .build())
     * .bidPrice("bidPrice")
     * .configurations(List.of(ConfigurationProperty.builder()
     * .classification("classification")
     * .configurationProperties(Map.of(
     * "configurationPropertiesKey", "configurationProperties"))
     * .configurations(List.of(configurationProperty_))
     * .build()))
     * .customAmiId("customAmiId")
     * .ebsConfiguration(EbsConfigurationProperty.builder()
     * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
     * .volumeSpecification(VolumeSpecificationProperty.builder()
     * .sizeInGb(123)
     * .volumeType("volumeType")
     * // the properties below are optional
     * .iops(123)
     * .build())
     * // the properties below are optional
     * .volumesPerInstance(123)
     * .build()))
     * .ebsOptimized(false)
     * .build())
     * .market("market")
     * .name("name")
     * .build())
     * .placement(PlacementTypeProperty.builder()
     * .availabilityZone("availabilityZone")
     * .build())
     * .serviceAccessSecurityGroup("serviceAccessSecurityGroup")
     * .taskInstanceFleets(List.of(InstanceFleetConfigProperty.builder()
     * .instanceTypeConfigs(List.of(InstanceTypeConfigProperty.builder()
     * .instanceType("instanceType")
     * // the properties below are optional
     * .bidPrice("bidPrice")
     * .bidPriceAsPercentageOfOnDemandPrice(123)
     * .configurations(List.of(ConfigurationProperty.builder()
     * .classification("classification")
     * .configurationProperties(Map.of(
     * "configurationPropertiesKey", "configurationProperties"))
     * .configurations(List.of(configurationProperty_))
     * .build()))
     * .customAmiId("customAmiId")
     * .ebsConfiguration(EbsConfigurationProperty.builder()
     * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
     * .volumeSpecification(VolumeSpecificationProperty.builder()
     * .sizeInGb(123)
     * .volumeType("volumeType")
     * // the properties below are optional
     * .iops(123)
     * .build())
     * // the properties below are optional
     * .volumesPerInstance(123)
     * .build()))
     * .ebsOptimized(false)
     * .build())
     * .weightedCapacity(123)
     * .build()))
     * .launchSpecifications(InstanceFleetProvisioningSpecificationsProperty.builder()
     * .onDemandSpecification(OnDemandProvisioningSpecificationProperty.builder()
     * .allocationStrategy("allocationStrategy")
     * .build())
     * .spotSpecification(SpotProvisioningSpecificationProperty.builder()
     * .timeoutAction("timeoutAction")
     * .timeoutDurationMinutes(123)
     * // the properties below are optional
     * .allocationStrategy("allocationStrategy")
     * .blockDurationMinutes(123)
     * .build())
     * .build())
     * .name("name")
     * .targetOnDemandCapacity(123)
     * .targetSpotCapacity(123)
     * .build()))
     * .taskInstanceGroups(List.of(InstanceGroupConfigProperty.builder()
     * .instanceCount(123)
     * .instanceType("instanceType")
     * // the properties below are optional
     * .autoScalingPolicy(AutoScalingPolicyProperty.builder()
     * .constraints(ScalingConstraintsProperty.builder()
     * .maxCapacity(123)
     * .minCapacity(123)
     * .build())
     * .rules(List.of(ScalingRuleProperty.builder()
     * .action(ScalingActionProperty.builder()
     * .simpleScalingPolicyConfiguration(SimpleScalingPolicyConfigurationProperty.builder()
     * .scalingAdjustment(123)
     * // the properties below are optional
     * .adjustmentType("adjustmentType")
     * .coolDown(123)
     * .build())
     * // the properties below are optional
     * .market("market")
     * .build())
     * .name("name")
     * .trigger(ScalingTriggerProperty.builder()
     * .cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty.builder()
     * .comparisonOperator("comparisonOperator")
     * .metricName("metricName")
     * .period(123)
     * .threshold(123)
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .evaluationPeriods(123)
     * .namespace("namespace")
     * .statistic("statistic")
     * .unit("unit")
     * .build())
     * .build())
     * // the properties below are optional
     * .description("description")
     * .build()))
     * .build())
     * .bidPrice("bidPrice")
     * .configurations(List.of(ConfigurationProperty.builder()
     * .classification("classification")
     * .configurationProperties(Map.of(
     * "configurationPropertiesKey", "configurationProperties"))
     * .configurations(List.of(configurationProperty_))
     * .build()))
     * .customAmiId("customAmiId")
     * .ebsConfiguration(EbsConfigurationProperty.builder()
     * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
     * .volumeSpecification(VolumeSpecificationProperty.builder()
     * .sizeInGb(123)
     * .volumeType("volumeType")
     * // the properties below are optional
     * .iops(123)
     * .build())
     * // the properties below are optional
     * .volumesPerInstance(123)
     * .build()))
     * .ebsOptimized(false)
     * .build())
     * .market("market")
     * .name("name")
     * .build()))
     * .terminationProtected(false)
     * .build())
     * .jobFlowRole("jobFlowRole")
     * .name("name")
     * .serviceRole("serviceRole")
     * // the properties below are optional
     * .additionalInfo(additionalInfo)
     * .applications(List.of(ApplicationProperty.builder()
     * .additionalInfo(Map.of(
     * "additionalInfoKey", "additionalInfo"))
     * .args(List.of("args"))
     * .name("name")
     * .version("version")
     * .build()))
     * .autoScalingRole("autoScalingRole")
     * .autoTerminationPolicy(AutoTerminationPolicyProperty.builder()
     * .idleTimeout(123)
     * .build())
     * .bootstrapActions(List.of(BootstrapActionConfigProperty.builder()
     * .name("name")
     * .scriptBootstrapAction(ScriptBootstrapActionConfigProperty.builder()
     * .path("path")
     * // the properties below are optional
     * .args(List.of("args"))
     * .build())
     * .build()))
     * .configurations(List.of(ConfigurationProperty.builder()
     * .classification("classification")
     * .configurationProperties(Map.of(
     * "configurationPropertiesKey", "configurationProperties"))
     * .configurations(List.of(configurationProperty_))
     * .build()))
     * .customAmiId("customAmiId")
     * .ebsRootVolumeSize(123)
     * .kerberosAttributes(KerberosAttributesProperty.builder()
     * .kdcAdminPassword("kdcAdminPassword")
     * .realm("realm")
     * // the properties below are optional
     * .adDomainJoinPassword("adDomainJoinPassword")
     * .adDomainJoinUser("adDomainJoinUser")
     * .crossRealmTrustPrincipalPassword("crossRealmTrustPrincipalPassword")
     * .build())
     * .logEncryptionKmsKeyId("logEncryptionKmsKeyId")
     * .logUri("logUri")
     * .managedScalingPolicy(ManagedScalingPolicyProperty.builder()
     * .computeLimits(ComputeLimitsProperty.builder()
     * .maximumCapacityUnits(123)
     * .minimumCapacityUnits(123)
     * .unitType("unitType")
     * // the properties below are optional
     * .maximumCoreCapacityUnits(123)
     * .maximumOnDemandCapacityUnits(123)
     * .build())
     * .build())
     * .osReleaseLabel("osReleaseLabel")
     * .releaseLabel("releaseLabel")
     * .scaleDownBehavior("scaleDownBehavior")
     * .securityConfiguration("securityConfiguration")
     * .stepConcurrencyLevel(123)
     * .steps(List.of(StepConfigProperty.builder()
     * .hadoopJarStep(HadoopJarStepConfigProperty.builder()
     * .jar("jar")
     * // the properties below are optional
     * .args(List.of("args"))
     * .mainClass("mainClass")
     * .stepProperties(List.of(KeyValueProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build())
     * .name("name")
     * // the properties below are optional
     * .actionOnFailure("actionOnFailure")
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .visibleToAllUsers(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html)
     */
    public inline fun cfnCluster(
        scope: Construct,
        id: String,
        block: CfnClusterDsl.() -> Unit = {},
    ): CfnCluster {
        val builder = CfnClusterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * `Application` is a property of `AWS::EMR::Cluster` .
     *
     * The `Application` property type defines the open-source big data applications for EMR to
     * install and configure when a cluster is created.
     *
     * With Amazon EMR release version 4.0 and later, the only accepted parameter is the application
     * `Name` . To pass arguments to these applications, you use configuration classifications
     * specified using JSON objects in a `Configuration` property. For more information, see
     * [Configuring Applications](https://docs.aws.amazon.com//emr/latest/ReleaseGuide/emr-configure-apps.html)
     * .
     *
     * With earlier Amazon EMR releases, the application is any AWS or third-party software that you
     * can add to the cluster. You can specify the version of the application and arguments to pass
     * to it. Amazon EMR accepts and forwards the argument list to the corresponding installation
     * script as a bootstrap action argument.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * ApplicationProperty applicationProperty = ApplicationProperty.builder()
     * .additionalInfo(Map.of(
     * "additionalInfoKey", "additionalInfo"))
     * .args(List.of("args"))
     * .name("name")
     * .version("version")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-application.html)
     */
    public inline fun cfnClusterApplicationProperty(
        block: CfnClusterApplicationPropertyDsl.() -> Unit = {}
    ): CfnCluster.ApplicationProperty {
        val builder = CfnClusterApplicationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `AutoScalingPolicy` is a subproperty of `InstanceGroupConfig` .
     *
     * `AutoScalingPolicy` defines how an instance group dynamically adds and terminates EC2
     * instances in response to the value of a CloudWatch metric. For more information, see
     * [Using Automatic Scaling in Amazon EMR](https://docs.aws.amazon.com//emr/latest/ManagementGuide/emr-automatic-scaling.html)
     * in the *Amazon EMR Management Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * AutoScalingPolicyProperty autoScalingPolicyProperty = AutoScalingPolicyProperty.builder()
     * .constraints(ScalingConstraintsProperty.builder()
     * .maxCapacity(123)
     * .minCapacity(123)
     * .build())
     * .rules(List.of(ScalingRuleProperty.builder()
     * .action(ScalingActionProperty.builder()
     * .simpleScalingPolicyConfiguration(SimpleScalingPolicyConfigurationProperty.builder()
     * .scalingAdjustment(123)
     * // the properties below are optional
     * .adjustmentType("adjustmentType")
     * .coolDown(123)
     * .build())
     * // the properties below are optional
     * .market("market")
     * .build())
     * .name("name")
     * .trigger(ScalingTriggerProperty.builder()
     * .cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty.builder()
     * .comparisonOperator("comparisonOperator")
     * .metricName("metricName")
     * .period(123)
     * .threshold(123)
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .evaluationPeriods(123)
     * .namespace("namespace")
     * .statistic("statistic")
     * .unit("unit")
     * .build())
     * .build())
     * // the properties below are optional
     * .description("description")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-autoscalingpolicy.html)
     */
    public inline fun cfnClusterAutoScalingPolicyProperty(
        block: CfnClusterAutoScalingPolicyPropertyDsl.() -> Unit = {}
    ): CfnCluster.AutoScalingPolicyProperty {
        val builder = CfnClusterAutoScalingPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * AutoTerminationPolicyProperty autoTerminationPolicyProperty =
     * AutoTerminationPolicyProperty.builder()
     * .idleTimeout(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-autoterminationpolicy.html)
     */
    public inline fun cfnClusterAutoTerminationPolicyProperty(
        block: CfnClusterAutoTerminationPolicyPropertyDsl.() -> Unit = {}
    ): CfnCluster.AutoTerminationPolicyProperty {
        val builder = CfnClusterAutoTerminationPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `BootstrapActionConfig` is a property of `AWS::EMR::Cluster` that can be used to run
     * bootstrap actions on EMR clusters.
     *
     * You can use a bootstrap action to install software and configure EC2 instances for all
     * cluster nodes before EMR installs and configures open-source big data applications on cluster
     * instances. For more information, see
     * [Create Bootstrap Actions to Install Additional Software](https://docs.aws.amazon.com//emr/latest/ManagementGuide/emr-plan-bootstrap.html)
     * in the *Amazon EMR Management Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * BootstrapActionConfigProperty bootstrapActionConfigProperty =
     * BootstrapActionConfigProperty.builder()
     * .name("name")
     * .scriptBootstrapAction(ScriptBootstrapActionConfigProperty.builder()
     * .path("path")
     * // the properties below are optional
     * .args(List.of("args"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-bootstrapactionconfig.html)
     */
    public inline fun cfnClusterBootstrapActionConfigProperty(
        block: CfnClusterBootstrapActionConfigPropertyDsl.() -> Unit = {}
    ): CfnCluster.BootstrapActionConfigProperty {
        val builder = CfnClusterBootstrapActionConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `CloudWatchAlarmDefinition` is a subproperty of the `ScalingTrigger` property, which
     * determines when to trigger an automatic scaling activity.
     *
     * Scaling activity begins when you satisfy the defined alarm conditions.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * CloudWatchAlarmDefinitionProperty cloudWatchAlarmDefinitionProperty =
     * CloudWatchAlarmDefinitionProperty.builder()
     * .comparisonOperator("comparisonOperator")
     * .metricName("metricName")
     * .period(123)
     * .threshold(123)
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .evaluationPeriods(123)
     * .namespace("namespace")
     * .statistic("statistic")
     * .unit("unit")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-cloudwatchalarmdefinition.html)
     */
    public inline fun cfnClusterCloudWatchAlarmDefinitionProperty(
        block: CfnClusterCloudWatchAlarmDefinitionPropertyDsl.() -> Unit = {}
    ): CfnCluster.CloudWatchAlarmDefinitionProperty {
        val builder = CfnClusterCloudWatchAlarmDefinitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Amazon EC2 unit limits for a managed scaling policy.
     *
     * The managed scaling activity of a cluster can not be above or below these limits. The limit
     * only applies to the core and task nodes. The master node cannot be scaled after initial
     * configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * ComputeLimitsProperty computeLimitsProperty = ComputeLimitsProperty.builder()
     * .maximumCapacityUnits(123)
     * .minimumCapacityUnits(123)
     * .unitType("unitType")
     * // the properties below are optional
     * .maximumCoreCapacityUnits(123)
     * .maximumOnDemandCapacityUnits(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-computelimits.html)
     */
    public inline fun cfnClusterComputeLimitsProperty(
        block: CfnClusterComputeLimitsPropertyDsl.() -> Unit = {}
    ): CfnCluster.ComputeLimitsProperty {
        val builder = CfnClusterComputeLimitsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Used only with Amazon EMR release 4.0 and later.
     *
     * `Configuration` is a subproperty of `InstanceFleetConfig` or `InstanceGroupConfig` .
     * `Configuration` specifies optional configurations for customizing open-source big data
     * applications and environment parameters. A configuration consists of a classification,
     * properties, and optional nested configurations. A classification refers to an
     * application-specific configuration file. Properties are the settings you want to change in
     * that file. For more information, see
     * [Configuring Applications](https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-configure-apps.html)
     * in the *Amazon EMR Release Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * ConfigurationProperty configurationProperty_;
     * ConfigurationProperty configurationProperty = ConfigurationProperty.builder()
     * .classification("classification")
     * .configurationProperties(Map.of(
     * "configurationPropertiesKey", "configurationProperties"))
     * .configurations(List.of(configurationProperty_))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-configuration.html)
     */
    public inline fun cfnClusterConfigurationProperty(
        block: CfnClusterConfigurationPropertyDsl.() -> Unit = {}
    ): CfnCluster.ConfigurationProperty {
        val builder = CfnClusterConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `EbsBlockDeviceConfig` is a subproperty of the `EbsConfiguration` property type.
     *
     * `EbsBlockDeviceConfig` defines the number and type of EBS volumes to associate with all EC2
     * instances in an EMR cluster.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * EbsBlockDeviceConfigProperty ebsBlockDeviceConfigProperty =
     * EbsBlockDeviceConfigProperty.builder()
     * .volumeSpecification(VolumeSpecificationProperty.builder()
     * .sizeInGb(123)
     * .volumeType("volumeType")
     * // the properties below are optional
     * .iops(123)
     * .build())
     * // the properties below are optional
     * .volumesPerInstance(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-ebsblockdeviceconfig.html)
     */
    public inline fun cfnClusterEbsBlockDeviceConfigProperty(
        block: CfnClusterEbsBlockDeviceConfigPropertyDsl.() -> Unit = {}
    ): CfnCluster.EbsBlockDeviceConfigProperty {
        val builder = CfnClusterEbsBlockDeviceConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `EbsConfiguration` is a subproperty of `InstanceFleetConfig` or `InstanceGroupConfig` .
     *
     * `EbsConfiguration` determines the EBS volumes to attach to EMR cluster instances.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * EbsConfigurationProperty ebsConfigurationProperty = EbsConfigurationProperty.builder()
     * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
     * .volumeSpecification(VolumeSpecificationProperty.builder()
     * .sizeInGb(123)
     * .volumeType("volumeType")
     * // the properties below are optional
     * .iops(123)
     * .build())
     * // the properties below are optional
     * .volumesPerInstance(123)
     * .build()))
     * .ebsOptimized(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-ebsconfiguration.html)
     */
    public inline fun cfnClusterEbsConfigurationProperty(
        block: CfnClusterEbsConfigurationPropertyDsl.() -> Unit = {}
    ): CfnCluster.EbsConfigurationProperty {
        val builder = CfnClusterEbsConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `HadoopJarStepConfig` property type specifies a job flow step consisting of a JAR file
     * whose main function will be executed.
     *
     * The main function submits a job for the cluster to execute as a step on the master node, and
     * then waits for the job to finish or fail before executing subsequent steps.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * HadoopJarStepConfigProperty hadoopJarStepConfigProperty = HadoopJarStepConfigProperty.builder()
     * .jar("jar")
     * // the properties below are optional
     * .args(List.of("args"))
     * .mainClass("mainClass")
     * .stepProperties(List.of(KeyValueProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-hadoopjarstepconfig.html)
     */
    public inline fun cfnClusterHadoopJarStepConfigProperty(
        block: CfnClusterHadoopJarStepConfigPropertyDsl.() -> Unit = {}
    ): CfnCluster.HadoopJarStepConfigProperty {
        val builder = CfnClusterHadoopJarStepConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use `InstanceFleetConfig` to define instance fleets for an EMR cluster.
     *
     * A cluster can not use both instance fleets and instance groups. For more information, see
     * [Configure Instance Fleets](https://docs.aws.amazon.com//emr/latest/ManagementGuide/emr-instance-group-configuration.html)
     * in the *Amazon EMR Management Guide* .
     *
     * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later,
     * excluding 5.0.x versions.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * ConfigurationProperty configurationProperty_;
     * InstanceFleetConfigProperty instanceFleetConfigProperty = InstanceFleetConfigProperty.builder()
     * .instanceTypeConfigs(List.of(InstanceTypeConfigProperty.builder()
     * .instanceType("instanceType")
     * // the properties below are optional
     * .bidPrice("bidPrice")
     * .bidPriceAsPercentageOfOnDemandPrice(123)
     * .configurations(List.of(ConfigurationProperty.builder()
     * .classification("classification")
     * .configurationProperties(Map.of(
     * "configurationPropertiesKey", "configurationProperties"))
     * .configurations(List.of(configurationProperty_))
     * .build()))
     * .customAmiId("customAmiId")
     * .ebsConfiguration(EbsConfigurationProperty.builder()
     * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
     * .volumeSpecification(VolumeSpecificationProperty.builder()
     * .sizeInGb(123)
     * .volumeType("volumeType")
     * // the properties below are optional
     * .iops(123)
     * .build())
     * // the properties below are optional
     * .volumesPerInstance(123)
     * .build()))
     * .ebsOptimized(false)
     * .build())
     * .weightedCapacity(123)
     * .build()))
     * .launchSpecifications(InstanceFleetProvisioningSpecificationsProperty.builder()
     * .onDemandSpecification(OnDemandProvisioningSpecificationProperty.builder()
     * .allocationStrategy("allocationStrategy")
     * .build())
     * .spotSpecification(SpotProvisioningSpecificationProperty.builder()
     * .timeoutAction("timeoutAction")
     * .timeoutDurationMinutes(123)
     * // the properties below are optional
     * .allocationStrategy("allocationStrategy")
     * .blockDurationMinutes(123)
     * .build())
     * .build())
     * .name("name")
     * .targetOnDemandCapacity(123)
     * .targetSpotCapacity(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancefleetconfig.html)
     */
    public inline fun cfnClusterInstanceFleetConfigProperty(
        block: CfnClusterInstanceFleetConfigPropertyDsl.() -> Unit = {}
    ): CfnCluster.InstanceFleetConfigProperty {
        val builder = CfnClusterInstanceFleetConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `InstanceFleetProvisioningSpecification` is a subproperty of `InstanceFleetConfig` .
     *
     * `InstanceFleetProvisioningSpecification` defines the launch specification for Spot instances
     * in an instance fleet, which determines the defined duration and provisioning timeout behavior
     * for Spot instances.
     *
     * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later,
     * excluding 5.0.x versions.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * InstanceFleetProvisioningSpecificationsProperty instanceFleetProvisioningSpecificationsProperty
     * = InstanceFleetProvisioningSpecificationsProperty.builder()
     * .onDemandSpecification(OnDemandProvisioningSpecificationProperty.builder()
     * .allocationStrategy("allocationStrategy")
     * .build())
     * .spotSpecification(SpotProvisioningSpecificationProperty.builder()
     * .timeoutAction("timeoutAction")
     * .timeoutDurationMinutes(123)
     * // the properties below are optional
     * .allocationStrategy("allocationStrategy")
     * .blockDurationMinutes(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancefleetprovisioningspecifications.html)
     */
    public inline fun cfnClusterInstanceFleetProvisioningSpecificationsProperty(
        block: CfnClusterInstanceFleetProvisioningSpecificationsPropertyDsl.() -> Unit = {}
    ): CfnCluster.InstanceFleetProvisioningSpecificationsProperty {
        val builder = CfnClusterInstanceFleetProvisioningSpecificationsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use `InstanceGroupConfig` to define instance groups for an EMR cluster.
     *
     * A cluster can not use both instance groups and instance fleets. For more information, see
     * [Create a Cluster with Instance Fleets or Uniform Instance Groups](https://docs.aws.amazon.com//emr/latest/ManagementGuide/emr-instance-group-configuration.html)
     * in the *Amazon EMR Management Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * ConfigurationProperty configurationProperty_;
     * InstanceGroupConfigProperty instanceGroupConfigProperty = InstanceGroupConfigProperty.builder()
     * .instanceCount(123)
     * .instanceType("instanceType")
     * // the properties below are optional
     * .autoScalingPolicy(AutoScalingPolicyProperty.builder()
     * .constraints(ScalingConstraintsProperty.builder()
     * .maxCapacity(123)
     * .minCapacity(123)
     * .build())
     * .rules(List.of(ScalingRuleProperty.builder()
     * .action(ScalingActionProperty.builder()
     * .simpleScalingPolicyConfiguration(SimpleScalingPolicyConfigurationProperty.builder()
     * .scalingAdjustment(123)
     * // the properties below are optional
     * .adjustmentType("adjustmentType")
     * .coolDown(123)
     * .build())
     * // the properties below are optional
     * .market("market")
     * .build())
     * .name("name")
     * .trigger(ScalingTriggerProperty.builder()
     * .cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty.builder()
     * .comparisonOperator("comparisonOperator")
     * .metricName("metricName")
     * .period(123)
     * .threshold(123)
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .evaluationPeriods(123)
     * .namespace("namespace")
     * .statistic("statistic")
     * .unit("unit")
     * .build())
     * .build())
     * // the properties below are optional
     * .description("description")
     * .build()))
     * .build())
     * .bidPrice("bidPrice")
     * .configurations(List.of(ConfigurationProperty.builder()
     * .classification("classification")
     * .configurationProperties(Map.of(
     * "configurationPropertiesKey", "configurationProperties"))
     * .configurations(List.of(configurationProperty_))
     * .build()))
     * .customAmiId("customAmiId")
     * .ebsConfiguration(EbsConfigurationProperty.builder()
     * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
     * .volumeSpecification(VolumeSpecificationProperty.builder()
     * .sizeInGb(123)
     * .volumeType("volumeType")
     * // the properties below are optional
     * .iops(123)
     * .build())
     * // the properties below are optional
     * .volumesPerInstance(123)
     * .build()))
     * .ebsOptimized(false)
     * .build())
     * .market("market")
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancegroupconfig.html)
     */
    public inline fun cfnClusterInstanceGroupConfigProperty(
        block: CfnClusterInstanceGroupConfigPropertyDsl.() -> Unit = {}
    ): CfnCluster.InstanceGroupConfigProperty {
        val builder = CfnClusterInstanceGroupConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later,
     * excluding 5.0.x versions.
     *
     * `InstanceTypeConfig` is a sub-property of `InstanceFleetConfig` . `InstanceTypeConfig`
     * determines the EC2 instances that Amazon EMR attempts to provision to fulfill On-Demand and
     * Spot target capacities.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * ConfigurationProperty configurationProperty_;
     * InstanceTypeConfigProperty instanceTypeConfigProperty = InstanceTypeConfigProperty.builder()
     * .instanceType("instanceType")
     * // the properties below are optional
     * .bidPrice("bidPrice")
     * .bidPriceAsPercentageOfOnDemandPrice(123)
     * .configurations(List.of(ConfigurationProperty.builder()
     * .classification("classification")
     * .configurationProperties(Map.of(
     * "configurationPropertiesKey", "configurationProperties"))
     * .configurations(List.of(configurationProperty_))
     * .build()))
     * .customAmiId("customAmiId")
     * .ebsConfiguration(EbsConfigurationProperty.builder()
     * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
     * .volumeSpecification(VolumeSpecificationProperty.builder()
     * .sizeInGb(123)
     * .volumeType("volumeType")
     * // the properties below are optional
     * .iops(123)
     * .build())
     * // the properties below are optional
     * .volumesPerInstance(123)
     * .build()))
     * .ebsOptimized(false)
     * .build())
     * .weightedCapacity(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancetypeconfig.html)
     */
    public inline fun cfnClusterInstanceTypeConfigProperty(
        block: CfnClusterInstanceTypeConfigPropertyDsl.() -> Unit = {}
    ): CfnCluster.InstanceTypeConfigProperty {
        val builder = CfnClusterInstanceTypeConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `JobFlowInstancesConfig` is a property of the `AWS::EMR::Cluster` resource.
     *
     * `JobFlowInstancesConfig` defines the instance groups or instance fleets that comprise the
     * cluster. `JobFlowInstancesConfig` must contain either `InstanceFleetConfig` or
     * `InstanceGroupConfig` . They cannot be used together.
     *
     * You can now define task instance groups or task instance fleets using the
     * `TaskInstanceGroups` and `TaskInstanceFleets` subproperties. Using these subproperties
     * reduces delays in provisioning task nodes compared to specifying task nodes with the
     * `InstanceFleetConfig` and `InstanceGroupConfig` resources.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * ConfigurationProperty configurationProperty_;
     * JobFlowInstancesConfigProperty jobFlowInstancesConfigProperty =
     * JobFlowInstancesConfigProperty.builder()
     * .additionalMasterSecurityGroups(List.of("additionalMasterSecurityGroups"))
     * .additionalSlaveSecurityGroups(List.of("additionalSlaveSecurityGroups"))
     * .coreInstanceFleet(InstanceFleetConfigProperty.builder()
     * .instanceTypeConfigs(List.of(InstanceTypeConfigProperty.builder()
     * .instanceType("instanceType")
     * // the properties below are optional
     * .bidPrice("bidPrice")
     * .bidPriceAsPercentageOfOnDemandPrice(123)
     * .configurations(List.of(ConfigurationProperty.builder()
     * .classification("classification")
     * .configurationProperties(Map.of(
     * "configurationPropertiesKey", "configurationProperties"))
     * .configurations(List.of(configurationProperty_))
     * .build()))
     * .customAmiId("customAmiId")
     * .ebsConfiguration(EbsConfigurationProperty.builder()
     * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
     * .volumeSpecification(VolumeSpecificationProperty.builder()
     * .sizeInGb(123)
     * .volumeType("volumeType")
     * // the properties below are optional
     * .iops(123)
     * .build())
     * // the properties below are optional
     * .volumesPerInstance(123)
     * .build()))
     * .ebsOptimized(false)
     * .build())
     * .weightedCapacity(123)
     * .build()))
     * .launchSpecifications(InstanceFleetProvisioningSpecificationsProperty.builder()
     * .onDemandSpecification(OnDemandProvisioningSpecificationProperty.builder()
     * .allocationStrategy("allocationStrategy")
     * .build())
     * .spotSpecification(SpotProvisioningSpecificationProperty.builder()
     * .timeoutAction("timeoutAction")
     * .timeoutDurationMinutes(123)
     * // the properties below are optional
     * .allocationStrategy("allocationStrategy")
     * .blockDurationMinutes(123)
     * .build())
     * .build())
     * .name("name")
     * .targetOnDemandCapacity(123)
     * .targetSpotCapacity(123)
     * .build())
     * .coreInstanceGroup(InstanceGroupConfigProperty.builder()
     * .instanceCount(123)
     * .instanceType("instanceType")
     * // the properties below are optional
     * .autoScalingPolicy(AutoScalingPolicyProperty.builder()
     * .constraints(ScalingConstraintsProperty.builder()
     * .maxCapacity(123)
     * .minCapacity(123)
     * .build())
     * .rules(List.of(ScalingRuleProperty.builder()
     * .action(ScalingActionProperty.builder()
     * .simpleScalingPolicyConfiguration(SimpleScalingPolicyConfigurationProperty.builder()
     * .scalingAdjustment(123)
     * // the properties below are optional
     * .adjustmentType("adjustmentType")
     * .coolDown(123)
     * .build())
     * // the properties below are optional
     * .market("market")
     * .build())
     * .name("name")
     * .trigger(ScalingTriggerProperty.builder()
     * .cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty.builder()
     * .comparisonOperator("comparisonOperator")
     * .metricName("metricName")
     * .period(123)
     * .threshold(123)
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .evaluationPeriods(123)
     * .namespace("namespace")
     * .statistic("statistic")
     * .unit("unit")
     * .build())
     * .build())
     * // the properties below are optional
     * .description("description")
     * .build()))
     * .build())
     * .bidPrice("bidPrice")
     * .configurations(List.of(ConfigurationProperty.builder()
     * .classification("classification")
     * .configurationProperties(Map.of(
     * "configurationPropertiesKey", "configurationProperties"))
     * .configurations(List.of(configurationProperty_))
     * .build()))
     * .customAmiId("customAmiId")
     * .ebsConfiguration(EbsConfigurationProperty.builder()
     * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
     * .volumeSpecification(VolumeSpecificationProperty.builder()
     * .sizeInGb(123)
     * .volumeType("volumeType")
     * // the properties below are optional
     * .iops(123)
     * .build())
     * // the properties below are optional
     * .volumesPerInstance(123)
     * .build()))
     * .ebsOptimized(false)
     * .build())
     * .market("market")
     * .name("name")
     * .build())
     * .ec2KeyName("ec2KeyName")
     * .ec2SubnetId("ec2SubnetId")
     * .ec2SubnetIds(List.of("ec2SubnetIds"))
     * .emrManagedMasterSecurityGroup("emrManagedMasterSecurityGroup")
     * .emrManagedSlaveSecurityGroup("emrManagedSlaveSecurityGroup")
     * .hadoopVersion("hadoopVersion")
     * .keepJobFlowAliveWhenNoSteps(false)
     * .masterInstanceFleet(InstanceFleetConfigProperty.builder()
     * .instanceTypeConfigs(List.of(InstanceTypeConfigProperty.builder()
     * .instanceType("instanceType")
     * // the properties below are optional
     * .bidPrice("bidPrice")
     * .bidPriceAsPercentageOfOnDemandPrice(123)
     * .configurations(List.of(ConfigurationProperty.builder()
     * .classification("classification")
     * .configurationProperties(Map.of(
     * "configurationPropertiesKey", "configurationProperties"))
     * .configurations(List.of(configurationProperty_))
     * .build()))
     * .customAmiId("customAmiId")
     * .ebsConfiguration(EbsConfigurationProperty.builder()
     * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
     * .volumeSpecification(VolumeSpecificationProperty.builder()
     * .sizeInGb(123)
     * .volumeType("volumeType")
     * // the properties below are optional
     * .iops(123)
     * .build())
     * // the properties below are optional
     * .volumesPerInstance(123)
     * .build()))
     * .ebsOptimized(false)
     * .build())
     * .weightedCapacity(123)
     * .build()))
     * .launchSpecifications(InstanceFleetProvisioningSpecificationsProperty.builder()
     * .onDemandSpecification(OnDemandProvisioningSpecificationProperty.builder()
     * .allocationStrategy("allocationStrategy")
     * .build())
     * .spotSpecification(SpotProvisioningSpecificationProperty.builder()
     * .timeoutAction("timeoutAction")
     * .timeoutDurationMinutes(123)
     * // the properties below are optional
     * .allocationStrategy("allocationStrategy")
     * .blockDurationMinutes(123)
     * .build())
     * .build())
     * .name("name")
     * .targetOnDemandCapacity(123)
     * .targetSpotCapacity(123)
     * .build())
     * .masterInstanceGroup(InstanceGroupConfigProperty.builder()
     * .instanceCount(123)
     * .instanceType("instanceType")
     * // the properties below are optional
     * .autoScalingPolicy(AutoScalingPolicyProperty.builder()
     * .constraints(ScalingConstraintsProperty.builder()
     * .maxCapacity(123)
     * .minCapacity(123)
     * .build())
     * .rules(List.of(ScalingRuleProperty.builder()
     * .action(ScalingActionProperty.builder()
     * .simpleScalingPolicyConfiguration(SimpleScalingPolicyConfigurationProperty.builder()
     * .scalingAdjustment(123)
     * // the properties below are optional
     * .adjustmentType("adjustmentType")
     * .coolDown(123)
     * .build())
     * // the properties below are optional
     * .market("market")
     * .build())
     * .name("name")
     * .trigger(ScalingTriggerProperty.builder()
     * .cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty.builder()
     * .comparisonOperator("comparisonOperator")
     * .metricName("metricName")
     * .period(123)
     * .threshold(123)
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .evaluationPeriods(123)
     * .namespace("namespace")
     * .statistic("statistic")
     * .unit("unit")
     * .build())
     * .build())
     * // the properties below are optional
     * .description("description")
     * .build()))
     * .build())
     * .bidPrice("bidPrice")
     * .configurations(List.of(ConfigurationProperty.builder()
     * .classification("classification")
     * .configurationProperties(Map.of(
     * "configurationPropertiesKey", "configurationProperties"))
     * .configurations(List.of(configurationProperty_))
     * .build()))
     * .customAmiId("customAmiId")
     * .ebsConfiguration(EbsConfigurationProperty.builder()
     * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
     * .volumeSpecification(VolumeSpecificationProperty.builder()
     * .sizeInGb(123)
     * .volumeType("volumeType")
     * // the properties below are optional
     * .iops(123)
     * .build())
     * // the properties below are optional
     * .volumesPerInstance(123)
     * .build()))
     * .ebsOptimized(false)
     * .build())
     * .market("market")
     * .name("name")
     * .build())
     * .placement(PlacementTypeProperty.builder()
     * .availabilityZone("availabilityZone")
     * .build())
     * .serviceAccessSecurityGroup("serviceAccessSecurityGroup")
     * .taskInstanceFleets(List.of(InstanceFleetConfigProperty.builder()
     * .instanceTypeConfigs(List.of(InstanceTypeConfigProperty.builder()
     * .instanceType("instanceType")
     * // the properties below are optional
     * .bidPrice("bidPrice")
     * .bidPriceAsPercentageOfOnDemandPrice(123)
     * .configurations(List.of(ConfigurationProperty.builder()
     * .classification("classification")
     * .configurationProperties(Map.of(
     * "configurationPropertiesKey", "configurationProperties"))
     * .configurations(List.of(configurationProperty_))
     * .build()))
     * .customAmiId("customAmiId")
     * .ebsConfiguration(EbsConfigurationProperty.builder()
     * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
     * .volumeSpecification(VolumeSpecificationProperty.builder()
     * .sizeInGb(123)
     * .volumeType("volumeType")
     * // the properties below are optional
     * .iops(123)
     * .build())
     * // the properties below are optional
     * .volumesPerInstance(123)
     * .build()))
     * .ebsOptimized(false)
     * .build())
     * .weightedCapacity(123)
     * .build()))
     * .launchSpecifications(InstanceFleetProvisioningSpecificationsProperty.builder()
     * .onDemandSpecification(OnDemandProvisioningSpecificationProperty.builder()
     * .allocationStrategy("allocationStrategy")
     * .build())
     * .spotSpecification(SpotProvisioningSpecificationProperty.builder()
     * .timeoutAction("timeoutAction")
     * .timeoutDurationMinutes(123)
     * // the properties below are optional
     * .allocationStrategy("allocationStrategy")
     * .blockDurationMinutes(123)
     * .build())
     * .build())
     * .name("name")
     * .targetOnDemandCapacity(123)
     * .targetSpotCapacity(123)
     * .build()))
     * .taskInstanceGroups(List.of(InstanceGroupConfigProperty.builder()
     * .instanceCount(123)
     * .instanceType("instanceType")
     * // the properties below are optional
     * .autoScalingPolicy(AutoScalingPolicyProperty.builder()
     * .constraints(ScalingConstraintsProperty.builder()
     * .maxCapacity(123)
     * .minCapacity(123)
     * .build())
     * .rules(List.of(ScalingRuleProperty.builder()
     * .action(ScalingActionProperty.builder()
     * .simpleScalingPolicyConfiguration(SimpleScalingPolicyConfigurationProperty.builder()
     * .scalingAdjustment(123)
     * // the properties below are optional
     * .adjustmentType("adjustmentType")
     * .coolDown(123)
     * .build())
     * // the properties below are optional
     * .market("market")
     * .build())
     * .name("name")
     * .trigger(ScalingTriggerProperty.builder()
     * .cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty.builder()
     * .comparisonOperator("comparisonOperator")
     * .metricName("metricName")
     * .period(123)
     * .threshold(123)
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .evaluationPeriods(123)
     * .namespace("namespace")
     * .statistic("statistic")
     * .unit("unit")
     * .build())
     * .build())
     * // the properties below are optional
     * .description("description")
     * .build()))
     * .build())
     * .bidPrice("bidPrice")
     * .configurations(List.of(ConfigurationProperty.builder()
     * .classification("classification")
     * .configurationProperties(Map.of(
     * "configurationPropertiesKey", "configurationProperties"))
     * .configurations(List.of(configurationProperty_))
     * .build()))
     * .customAmiId("customAmiId")
     * .ebsConfiguration(EbsConfigurationProperty.builder()
     * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
     * .volumeSpecification(VolumeSpecificationProperty.builder()
     * .sizeInGb(123)
     * .volumeType("volumeType")
     * // the properties below are optional
     * .iops(123)
     * .build())
     * // the properties below are optional
     * .volumesPerInstance(123)
     * .build()))
     * .ebsOptimized(false)
     * .build())
     * .market("market")
     * .name("name")
     * .build()))
     * .terminationProtected(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig.html)
     */
    public inline fun cfnClusterJobFlowInstancesConfigProperty(
        block: CfnClusterJobFlowInstancesConfigPropertyDsl.() -> Unit = {}
    ): CfnCluster.JobFlowInstancesConfigProperty {
        val builder = CfnClusterJobFlowInstancesConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `KerberosAttributes` is a property of the `AWS::EMR::Cluster` resource.
     *
     * `KerberosAttributes` define the cluster-specific Kerberos configuration when Kerberos
     * authentication is enabled using a security configuration. The cluster-specific configuration
     * must be compatible with the security configuration. For more information see
     * [Use Kerberos Authentication](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-kerberos.html)
     * in the *EMR Management Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * KerberosAttributesProperty kerberosAttributesProperty = KerberosAttributesProperty.builder()
     * .kdcAdminPassword("kdcAdminPassword")
     * .realm("realm")
     * // the properties below are optional
     * .adDomainJoinPassword("adDomainJoinPassword")
     * .adDomainJoinUser("adDomainJoinUser")
     * .crossRealmTrustPrincipalPassword("crossRealmTrustPrincipalPassword")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-kerberosattributes.html)
     */
    public inline fun cfnClusterKerberosAttributesProperty(
        block: CfnClusterKerberosAttributesPropertyDsl.() -> Unit = {}
    ): CfnCluster.KerberosAttributesProperty {
        val builder = CfnClusterKerberosAttributesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `KeyValue` is a subproperty of the `HadoopJarStepConfig` property type.
     *
     * `KeyValue` is used to pass parameters to a step.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * KeyValueProperty keyValueProperty = KeyValueProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-keyvalue.html)
     */
    public inline fun cfnClusterKeyValueProperty(
        block: CfnClusterKeyValuePropertyDsl.() -> Unit = {}
    ): CfnCluster.KeyValueProperty {
        val builder = CfnClusterKeyValuePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Managed scaling policy for an Amazon EMR cluster.
     *
     * The policy specifies the limits for resources that can be added or terminated from a cluster.
     * The policy only applies to the core and task nodes. The master node cannot be scaled after
     * initial configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * ManagedScalingPolicyProperty managedScalingPolicyProperty =
     * ManagedScalingPolicyProperty.builder()
     * .computeLimits(ComputeLimitsProperty.builder()
     * .maximumCapacityUnits(123)
     * .minimumCapacityUnits(123)
     * .unitType("unitType")
     * // the properties below are optional
     * .maximumCoreCapacityUnits(123)
     * .maximumOnDemandCapacityUnits(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-managedscalingpolicy.html)
     */
    public inline fun cfnClusterManagedScalingPolicyProperty(
        block: CfnClusterManagedScalingPolicyPropertyDsl.() -> Unit = {}
    ): CfnCluster.ManagedScalingPolicyProperty {
        val builder = CfnClusterManagedScalingPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `MetricDimension` is a subproperty of the `CloudWatchAlarmDefinition` property type.
     *
     * `MetricDimension` specifies a CloudWatch dimension, which is specified with a `Key` `Value`
     * pair. The key is known as a `Name` in CloudWatch. By default, Amazon EMR uses one dimension
     * whose `Key` is `JobFlowID` and `Value` is a variable representing the cluster ID, which is
     * `${emr.clusterId}` . This enables the automatic scaling rule for EMR to bootstrap when the
     * cluster ID becomes available during cluster creation.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * MetricDimensionProperty metricDimensionProperty = MetricDimensionProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-metricdimension.html)
     */
    public inline fun cfnClusterMetricDimensionProperty(
        block: CfnClusterMetricDimensionPropertyDsl.() -> Unit = {}
    ): CfnCluster.MetricDimensionProperty {
        val builder = CfnClusterMetricDimensionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The launch specification for On-Demand Instances in the instance fleet, which determines the
     * allocation strategy.
     *
     * The instance fleet configuration is available only in Amazon EMR releases 4.8.0 and later,
     * excluding 5.0.x versions. On-Demand Instances allocation strategy is available in Amazon EMR
     * releases 5.12.1 and later.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * OnDemandProvisioningSpecificationProperty onDemandProvisioningSpecificationProperty =
     * OnDemandProvisioningSpecificationProperty.builder()
     * .allocationStrategy("allocationStrategy")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-ondemandprovisioningspecification.html)
     */
    public inline fun cfnClusterOnDemandProvisioningSpecificationProperty(
        block: CfnClusterOnDemandProvisioningSpecificationPropertyDsl.() -> Unit = {}
    ): CfnCluster.OnDemandProvisioningSpecificationProperty {
        val builder = CfnClusterOnDemandProvisioningSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `PlacementType` is a property of the `AWS::EMR::Cluster` resource.
     *
     * `PlacementType` determines the Amazon EC2 Availability Zone configuration of the cluster (job
     * flow).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * PlacementTypeProperty placementTypeProperty = PlacementTypeProperty.builder()
     * .availabilityZone("availabilityZone")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-placementtype.html)
     */
    public inline fun cfnClusterPlacementTypeProperty(
        block: CfnClusterPlacementTypePropertyDsl.() -> Unit = {}
    ): CfnCluster.PlacementTypeProperty {
        val builder = CfnClusterPlacementTypePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnCluster`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * Object additionalInfo;
     * ConfigurationProperty configurationProperty_;
     * CfnClusterProps cfnClusterProps = CfnClusterProps.builder()
     * .instances(JobFlowInstancesConfigProperty.builder()
     * .additionalMasterSecurityGroups(List.of("additionalMasterSecurityGroups"))
     * .additionalSlaveSecurityGroups(List.of("additionalSlaveSecurityGroups"))
     * .coreInstanceFleet(InstanceFleetConfigProperty.builder()
     * .instanceTypeConfigs(List.of(InstanceTypeConfigProperty.builder()
     * .instanceType("instanceType")
     * // the properties below are optional
     * .bidPrice("bidPrice")
     * .bidPriceAsPercentageOfOnDemandPrice(123)
     * .configurations(List.of(ConfigurationProperty.builder()
     * .classification("classification")
     * .configurationProperties(Map.of(
     * "configurationPropertiesKey", "configurationProperties"))
     * .configurations(List.of(configurationProperty_))
     * .build()))
     * .customAmiId("customAmiId")
     * .ebsConfiguration(EbsConfigurationProperty.builder()
     * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
     * .volumeSpecification(VolumeSpecificationProperty.builder()
     * .sizeInGb(123)
     * .volumeType("volumeType")
     * // the properties below are optional
     * .iops(123)
     * .build())
     * // the properties below are optional
     * .volumesPerInstance(123)
     * .build()))
     * .ebsOptimized(false)
     * .build())
     * .weightedCapacity(123)
     * .build()))
     * .launchSpecifications(InstanceFleetProvisioningSpecificationsProperty.builder()
     * .onDemandSpecification(OnDemandProvisioningSpecificationProperty.builder()
     * .allocationStrategy("allocationStrategy")
     * .build())
     * .spotSpecification(SpotProvisioningSpecificationProperty.builder()
     * .timeoutAction("timeoutAction")
     * .timeoutDurationMinutes(123)
     * // the properties below are optional
     * .allocationStrategy("allocationStrategy")
     * .blockDurationMinutes(123)
     * .build())
     * .build())
     * .name("name")
     * .targetOnDemandCapacity(123)
     * .targetSpotCapacity(123)
     * .build())
     * .coreInstanceGroup(InstanceGroupConfigProperty.builder()
     * .instanceCount(123)
     * .instanceType("instanceType")
     * // the properties below are optional
     * .autoScalingPolicy(AutoScalingPolicyProperty.builder()
     * .constraints(ScalingConstraintsProperty.builder()
     * .maxCapacity(123)
     * .minCapacity(123)
     * .build())
     * .rules(List.of(ScalingRuleProperty.builder()
     * .action(ScalingActionProperty.builder()
     * .simpleScalingPolicyConfiguration(SimpleScalingPolicyConfigurationProperty.builder()
     * .scalingAdjustment(123)
     * // the properties below are optional
     * .adjustmentType("adjustmentType")
     * .coolDown(123)
     * .build())
     * // the properties below are optional
     * .market("market")
     * .build())
     * .name("name")
     * .trigger(ScalingTriggerProperty.builder()
     * .cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty.builder()
     * .comparisonOperator("comparisonOperator")
     * .metricName("metricName")
     * .period(123)
     * .threshold(123)
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .evaluationPeriods(123)
     * .namespace("namespace")
     * .statistic("statistic")
     * .unit("unit")
     * .build())
     * .build())
     * // the properties below are optional
     * .description("description")
     * .build()))
     * .build())
     * .bidPrice("bidPrice")
     * .configurations(List.of(ConfigurationProperty.builder()
     * .classification("classification")
     * .configurationProperties(Map.of(
     * "configurationPropertiesKey", "configurationProperties"))
     * .configurations(List.of(configurationProperty_))
     * .build()))
     * .customAmiId("customAmiId")
     * .ebsConfiguration(EbsConfigurationProperty.builder()
     * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
     * .volumeSpecification(VolumeSpecificationProperty.builder()
     * .sizeInGb(123)
     * .volumeType("volumeType")
     * // the properties below are optional
     * .iops(123)
     * .build())
     * // the properties below are optional
     * .volumesPerInstance(123)
     * .build()))
     * .ebsOptimized(false)
     * .build())
     * .market("market")
     * .name("name")
     * .build())
     * .ec2KeyName("ec2KeyName")
     * .ec2SubnetId("ec2SubnetId")
     * .ec2SubnetIds(List.of("ec2SubnetIds"))
     * .emrManagedMasterSecurityGroup("emrManagedMasterSecurityGroup")
     * .emrManagedSlaveSecurityGroup("emrManagedSlaveSecurityGroup")
     * .hadoopVersion("hadoopVersion")
     * .keepJobFlowAliveWhenNoSteps(false)
     * .masterInstanceFleet(InstanceFleetConfigProperty.builder()
     * .instanceTypeConfigs(List.of(InstanceTypeConfigProperty.builder()
     * .instanceType("instanceType")
     * // the properties below are optional
     * .bidPrice("bidPrice")
     * .bidPriceAsPercentageOfOnDemandPrice(123)
     * .configurations(List.of(ConfigurationProperty.builder()
     * .classification("classification")
     * .configurationProperties(Map.of(
     * "configurationPropertiesKey", "configurationProperties"))
     * .configurations(List.of(configurationProperty_))
     * .build()))
     * .customAmiId("customAmiId")
     * .ebsConfiguration(EbsConfigurationProperty.builder()
     * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
     * .volumeSpecification(VolumeSpecificationProperty.builder()
     * .sizeInGb(123)
     * .volumeType("volumeType")
     * // the properties below are optional
     * .iops(123)
     * .build())
     * // the properties below are optional
     * .volumesPerInstance(123)
     * .build()))
     * .ebsOptimized(false)
     * .build())
     * .weightedCapacity(123)
     * .build()))
     * .launchSpecifications(InstanceFleetProvisioningSpecificationsProperty.builder()
     * .onDemandSpecification(OnDemandProvisioningSpecificationProperty.builder()
     * .allocationStrategy("allocationStrategy")
     * .build())
     * .spotSpecification(SpotProvisioningSpecificationProperty.builder()
     * .timeoutAction("timeoutAction")
     * .timeoutDurationMinutes(123)
     * // the properties below are optional
     * .allocationStrategy("allocationStrategy")
     * .blockDurationMinutes(123)
     * .build())
     * .build())
     * .name("name")
     * .targetOnDemandCapacity(123)
     * .targetSpotCapacity(123)
     * .build())
     * .masterInstanceGroup(InstanceGroupConfigProperty.builder()
     * .instanceCount(123)
     * .instanceType("instanceType")
     * // the properties below are optional
     * .autoScalingPolicy(AutoScalingPolicyProperty.builder()
     * .constraints(ScalingConstraintsProperty.builder()
     * .maxCapacity(123)
     * .minCapacity(123)
     * .build())
     * .rules(List.of(ScalingRuleProperty.builder()
     * .action(ScalingActionProperty.builder()
     * .simpleScalingPolicyConfiguration(SimpleScalingPolicyConfigurationProperty.builder()
     * .scalingAdjustment(123)
     * // the properties below are optional
     * .adjustmentType("adjustmentType")
     * .coolDown(123)
     * .build())
     * // the properties below are optional
     * .market("market")
     * .build())
     * .name("name")
     * .trigger(ScalingTriggerProperty.builder()
     * .cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty.builder()
     * .comparisonOperator("comparisonOperator")
     * .metricName("metricName")
     * .period(123)
     * .threshold(123)
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .evaluationPeriods(123)
     * .namespace("namespace")
     * .statistic("statistic")
     * .unit("unit")
     * .build())
     * .build())
     * // the properties below are optional
     * .description("description")
     * .build()))
     * .build())
     * .bidPrice("bidPrice")
     * .configurations(List.of(ConfigurationProperty.builder()
     * .classification("classification")
     * .configurationProperties(Map.of(
     * "configurationPropertiesKey", "configurationProperties"))
     * .configurations(List.of(configurationProperty_))
     * .build()))
     * .customAmiId("customAmiId")
     * .ebsConfiguration(EbsConfigurationProperty.builder()
     * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
     * .volumeSpecification(VolumeSpecificationProperty.builder()
     * .sizeInGb(123)
     * .volumeType("volumeType")
     * // the properties below are optional
     * .iops(123)
     * .build())
     * // the properties below are optional
     * .volumesPerInstance(123)
     * .build()))
     * .ebsOptimized(false)
     * .build())
     * .market("market")
     * .name("name")
     * .build())
     * .placement(PlacementTypeProperty.builder()
     * .availabilityZone("availabilityZone")
     * .build())
     * .serviceAccessSecurityGroup("serviceAccessSecurityGroup")
     * .taskInstanceFleets(List.of(InstanceFleetConfigProperty.builder()
     * .instanceTypeConfigs(List.of(InstanceTypeConfigProperty.builder()
     * .instanceType("instanceType")
     * // the properties below are optional
     * .bidPrice("bidPrice")
     * .bidPriceAsPercentageOfOnDemandPrice(123)
     * .configurations(List.of(ConfigurationProperty.builder()
     * .classification("classification")
     * .configurationProperties(Map.of(
     * "configurationPropertiesKey", "configurationProperties"))
     * .configurations(List.of(configurationProperty_))
     * .build()))
     * .customAmiId("customAmiId")
     * .ebsConfiguration(EbsConfigurationProperty.builder()
     * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
     * .volumeSpecification(VolumeSpecificationProperty.builder()
     * .sizeInGb(123)
     * .volumeType("volumeType")
     * // the properties below are optional
     * .iops(123)
     * .build())
     * // the properties below are optional
     * .volumesPerInstance(123)
     * .build()))
     * .ebsOptimized(false)
     * .build())
     * .weightedCapacity(123)
     * .build()))
     * .launchSpecifications(InstanceFleetProvisioningSpecificationsProperty.builder()
     * .onDemandSpecification(OnDemandProvisioningSpecificationProperty.builder()
     * .allocationStrategy("allocationStrategy")
     * .build())
     * .spotSpecification(SpotProvisioningSpecificationProperty.builder()
     * .timeoutAction("timeoutAction")
     * .timeoutDurationMinutes(123)
     * // the properties below are optional
     * .allocationStrategy("allocationStrategy")
     * .blockDurationMinutes(123)
     * .build())
     * .build())
     * .name("name")
     * .targetOnDemandCapacity(123)
     * .targetSpotCapacity(123)
     * .build()))
     * .taskInstanceGroups(List.of(InstanceGroupConfigProperty.builder()
     * .instanceCount(123)
     * .instanceType("instanceType")
     * // the properties below are optional
     * .autoScalingPolicy(AutoScalingPolicyProperty.builder()
     * .constraints(ScalingConstraintsProperty.builder()
     * .maxCapacity(123)
     * .minCapacity(123)
     * .build())
     * .rules(List.of(ScalingRuleProperty.builder()
     * .action(ScalingActionProperty.builder()
     * .simpleScalingPolicyConfiguration(SimpleScalingPolicyConfigurationProperty.builder()
     * .scalingAdjustment(123)
     * // the properties below are optional
     * .adjustmentType("adjustmentType")
     * .coolDown(123)
     * .build())
     * // the properties below are optional
     * .market("market")
     * .build())
     * .name("name")
     * .trigger(ScalingTriggerProperty.builder()
     * .cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty.builder()
     * .comparisonOperator("comparisonOperator")
     * .metricName("metricName")
     * .period(123)
     * .threshold(123)
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .evaluationPeriods(123)
     * .namespace("namespace")
     * .statistic("statistic")
     * .unit("unit")
     * .build())
     * .build())
     * // the properties below are optional
     * .description("description")
     * .build()))
     * .build())
     * .bidPrice("bidPrice")
     * .configurations(List.of(ConfigurationProperty.builder()
     * .classification("classification")
     * .configurationProperties(Map.of(
     * "configurationPropertiesKey", "configurationProperties"))
     * .configurations(List.of(configurationProperty_))
     * .build()))
     * .customAmiId("customAmiId")
     * .ebsConfiguration(EbsConfigurationProperty.builder()
     * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
     * .volumeSpecification(VolumeSpecificationProperty.builder()
     * .sizeInGb(123)
     * .volumeType("volumeType")
     * // the properties below are optional
     * .iops(123)
     * .build())
     * // the properties below are optional
     * .volumesPerInstance(123)
     * .build()))
     * .ebsOptimized(false)
     * .build())
     * .market("market")
     * .name("name")
     * .build()))
     * .terminationProtected(false)
     * .build())
     * .jobFlowRole("jobFlowRole")
     * .name("name")
     * .serviceRole("serviceRole")
     * // the properties below are optional
     * .additionalInfo(additionalInfo)
     * .applications(List.of(ApplicationProperty.builder()
     * .additionalInfo(Map.of(
     * "additionalInfoKey", "additionalInfo"))
     * .args(List.of("args"))
     * .name("name")
     * .version("version")
     * .build()))
     * .autoScalingRole("autoScalingRole")
     * .autoTerminationPolicy(AutoTerminationPolicyProperty.builder()
     * .idleTimeout(123)
     * .build())
     * .bootstrapActions(List.of(BootstrapActionConfigProperty.builder()
     * .name("name")
     * .scriptBootstrapAction(ScriptBootstrapActionConfigProperty.builder()
     * .path("path")
     * // the properties below are optional
     * .args(List.of("args"))
     * .build())
     * .build()))
     * .configurations(List.of(ConfigurationProperty.builder()
     * .classification("classification")
     * .configurationProperties(Map.of(
     * "configurationPropertiesKey", "configurationProperties"))
     * .configurations(List.of(configurationProperty_))
     * .build()))
     * .customAmiId("customAmiId")
     * .ebsRootVolumeSize(123)
     * .kerberosAttributes(KerberosAttributesProperty.builder()
     * .kdcAdminPassword("kdcAdminPassword")
     * .realm("realm")
     * // the properties below are optional
     * .adDomainJoinPassword("adDomainJoinPassword")
     * .adDomainJoinUser("adDomainJoinUser")
     * .crossRealmTrustPrincipalPassword("crossRealmTrustPrincipalPassword")
     * .build())
     * .logEncryptionKmsKeyId("logEncryptionKmsKeyId")
     * .logUri("logUri")
     * .managedScalingPolicy(ManagedScalingPolicyProperty.builder()
     * .computeLimits(ComputeLimitsProperty.builder()
     * .maximumCapacityUnits(123)
     * .minimumCapacityUnits(123)
     * .unitType("unitType")
     * // the properties below are optional
     * .maximumCoreCapacityUnits(123)
     * .maximumOnDemandCapacityUnits(123)
     * .build())
     * .build())
     * .osReleaseLabel("osReleaseLabel")
     * .releaseLabel("releaseLabel")
     * .scaleDownBehavior("scaleDownBehavior")
     * .securityConfiguration("securityConfiguration")
     * .stepConcurrencyLevel(123)
     * .steps(List.of(StepConfigProperty.builder()
     * .hadoopJarStep(HadoopJarStepConfigProperty.builder()
     * .jar("jar")
     * // the properties below are optional
     * .args(List.of("args"))
     * .mainClass("mainClass")
     * .stepProperties(List.of(KeyValueProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build())
     * .name("name")
     * // the properties below are optional
     * .actionOnFailure("actionOnFailure")
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .visibleToAllUsers(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html)
     */
    public inline fun cfnClusterProps(block: CfnClusterPropsDsl.() -> Unit = {}): CfnClusterProps {
        val builder = CfnClusterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `ScalingAction` is a subproperty of the `ScalingRule` property type.
     *
     * `ScalingAction` determines the type of adjustment the automatic scaling activity makes when
     * triggered, and the periodicity of the adjustment.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * ScalingActionProperty scalingActionProperty = ScalingActionProperty.builder()
     * .simpleScalingPolicyConfiguration(SimpleScalingPolicyConfigurationProperty.builder()
     * .scalingAdjustment(123)
     * // the properties below are optional
     * .adjustmentType("adjustmentType")
     * .coolDown(123)
     * .build())
     * // the properties below are optional
     * .market("market")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-scalingaction.html)
     */
    public inline fun cfnClusterScalingActionProperty(
        block: CfnClusterScalingActionPropertyDsl.() -> Unit = {}
    ): CfnCluster.ScalingActionProperty {
        val builder = CfnClusterScalingActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `ScalingConstraints` is a subproperty of the `AutoScalingPolicy` property type.
     *
     * `ScalingConstraints` defines the upper and lower EC2 instance limits for an automatic scaling
     * policy. Automatic scaling activities triggered by automatic scaling rules will not cause an
     * instance group to grow above or shrink below these limits.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * ScalingConstraintsProperty scalingConstraintsProperty = ScalingConstraintsProperty.builder()
     * .maxCapacity(123)
     * .minCapacity(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-scalingconstraints.html)
     */
    public inline fun cfnClusterScalingConstraintsProperty(
        block: CfnClusterScalingConstraintsPropertyDsl.() -> Unit = {}
    ): CfnCluster.ScalingConstraintsProperty {
        val builder = CfnClusterScalingConstraintsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `ScalingRule` is a subproperty of the `AutoScalingPolicy` property type.
     *
     * `ScalingRule` defines the scale-in or scale-out rules for scaling activity, including the
     * CloudWatch metric alarm that triggers activity, how EC2 instances are added or removed, and
     * the periodicity of adjustments. The automatic scaling policy for an instance group can
     * comprise one or more automatic scaling rules.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * ScalingRuleProperty scalingRuleProperty = ScalingRuleProperty.builder()
     * .action(ScalingActionProperty.builder()
     * .simpleScalingPolicyConfiguration(SimpleScalingPolicyConfigurationProperty.builder()
     * .scalingAdjustment(123)
     * // the properties below are optional
     * .adjustmentType("adjustmentType")
     * .coolDown(123)
     * .build())
     * // the properties below are optional
     * .market("market")
     * .build())
     * .name("name")
     * .trigger(ScalingTriggerProperty.builder()
     * .cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty.builder()
     * .comparisonOperator("comparisonOperator")
     * .metricName("metricName")
     * .period(123)
     * .threshold(123)
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .evaluationPeriods(123)
     * .namespace("namespace")
     * .statistic("statistic")
     * .unit("unit")
     * .build())
     * .build())
     * // the properties below are optional
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-scalingrule.html)
     */
    public inline fun cfnClusterScalingRuleProperty(
        block: CfnClusterScalingRulePropertyDsl.() -> Unit = {}
    ): CfnCluster.ScalingRuleProperty {
        val builder = CfnClusterScalingRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `ScalingTrigger` is a subproperty of the `ScalingRule` property type.
     *
     * `ScalingTrigger` determines the conditions that trigger an automatic scaling activity.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * ScalingTriggerProperty scalingTriggerProperty = ScalingTriggerProperty.builder()
     * .cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty.builder()
     * .comparisonOperator("comparisonOperator")
     * .metricName("metricName")
     * .period(123)
     * .threshold(123)
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .evaluationPeriods(123)
     * .namespace("namespace")
     * .statistic("statistic")
     * .unit("unit")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-scalingtrigger.html)
     */
    public inline fun cfnClusterScalingTriggerProperty(
        block: CfnClusterScalingTriggerPropertyDsl.() -> Unit = {}
    ): CfnCluster.ScalingTriggerProperty {
        val builder = CfnClusterScalingTriggerPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `ScriptBootstrapActionConfig` is a subproperty of the `BootstrapActionConfig` property type.
     *
     * `ScriptBootstrapActionConfig` specifies the arguments and location of the bootstrap script
     * for EMR to run on all cluster nodes before it installs open-source big data applications on
     * them.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * ScriptBootstrapActionConfigProperty scriptBootstrapActionConfigProperty =
     * ScriptBootstrapActionConfigProperty.builder()
     * .path("path")
     * // the properties below are optional
     * .args(List.of("args"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-scriptbootstrapactionconfig.html)
     */
    public inline fun cfnClusterScriptBootstrapActionConfigProperty(
        block: CfnClusterScriptBootstrapActionConfigPropertyDsl.() -> Unit = {}
    ): CfnCluster.ScriptBootstrapActionConfigProperty {
        val builder = CfnClusterScriptBootstrapActionConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `SimpleScalingPolicyConfiguration` is a subproperty of the `ScalingAction` property type.
     *
     * `SimpleScalingPolicyConfiguration` determines how an automatic scaling action adds or removes
     * instances, the cooldown period, and the number of EC2 instances that are added each time the
     * CloudWatch metric alarm condition is satisfied.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * SimpleScalingPolicyConfigurationProperty simpleScalingPolicyConfigurationProperty =
     * SimpleScalingPolicyConfigurationProperty.builder()
     * .scalingAdjustment(123)
     * // the properties below are optional
     * .adjustmentType("adjustmentType")
     * .coolDown(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-simplescalingpolicyconfiguration.html)
     */
    public inline fun cfnClusterSimpleScalingPolicyConfigurationProperty(
        block: CfnClusterSimpleScalingPolicyConfigurationPropertyDsl.() -> Unit = {}
    ): CfnCluster.SimpleScalingPolicyConfigurationProperty {
        val builder = CfnClusterSimpleScalingPolicyConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `SpotProvisioningSpecification` is a subproperty of the
     * `InstanceFleetProvisioningSpecifications` property type.
     *
     * `SpotProvisioningSpecification` determines the launch specification for Spot instances in the
     * instance fleet, which includes the defined duration and provisioning timeout behavior.
     *
     * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later,
     * excluding 5.0.x versions.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * SpotProvisioningSpecificationProperty spotProvisioningSpecificationProperty =
     * SpotProvisioningSpecificationProperty.builder()
     * .timeoutAction("timeoutAction")
     * .timeoutDurationMinutes(123)
     * // the properties below are optional
     * .allocationStrategy("allocationStrategy")
     * .blockDurationMinutes(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-spotprovisioningspecification.html)
     */
    public inline fun cfnClusterSpotProvisioningSpecificationProperty(
        block: CfnClusterSpotProvisioningSpecificationPropertyDsl.() -> Unit = {}
    ): CfnCluster.SpotProvisioningSpecificationProperty {
        val builder = CfnClusterSpotProvisioningSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `StepConfig` is a property of the `AWS::EMR::Cluster` resource.
     *
     * The `StepConfig` property type specifies a cluster (job flow) step, which runs only on the
     * master node. Steps are used to submit data processing jobs to the cluster.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * StepConfigProperty stepConfigProperty = StepConfigProperty.builder()
     * .hadoopJarStep(HadoopJarStepConfigProperty.builder()
     * .jar("jar")
     * // the properties below are optional
     * .args(List.of("args"))
     * .mainClass("mainClass")
     * .stepProperties(List.of(KeyValueProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build())
     * .name("name")
     * // the properties below are optional
     * .actionOnFailure("actionOnFailure")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-stepconfig.html)
     */
    public inline fun cfnClusterStepConfigProperty(
        block: CfnClusterStepConfigPropertyDsl.() -> Unit = {}
    ): CfnCluster.StepConfigProperty {
        val builder = CfnClusterStepConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `VolumeSpecification` is a subproperty of the `EbsBlockDeviceConfig` property type.
     *
     * `VolumeSecification` determines the volume type, IOPS, and size (GiB) for EBS volumes
     * attached to EC2 instances.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * VolumeSpecificationProperty volumeSpecificationProperty = VolumeSpecificationProperty.builder()
     * .sizeInGb(123)
     * .volumeType("volumeType")
     * // the properties below are optional
     * .iops(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-volumespecification.html)
     */
    public inline fun cfnClusterVolumeSpecificationProperty(
        block: CfnClusterVolumeSpecificationPropertyDsl.() -> Unit = {}
    ): CfnCluster.VolumeSpecificationProperty {
        val builder = CfnClusterVolumeSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use `InstanceFleetConfig` to define instance fleets for an EMR cluster.
     *
     * A cluster can not use both instance fleets and instance groups. For more information, see
     * [Configure Instance Fleets](https://docs.aws.amazon.com//emr/latest/ManagementGuide/emr-instance-group-configuration.html)
     * in the *Amazon EMR Management Guide* .
     *
     * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later,
     * excluding 5.0.x versions. &gt; You can currently only add a task instance fleet to a cluster
     * with this resource. If you use this resource, CloudFormation waits for the cluster launch to
     * complete before adding the task instance fleet to the cluster. In order to add a task
     * instance fleet to the cluster as part of the cluster launch and minimize delays in
     * provisioning task nodes, use the `TaskInstanceFleets` subproperty for the
     * [AWS::EMR::Cluster JobFlowInstancesConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html)
     * property instead. To use this subproperty, see
     * [AWS::EMR::Cluster](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html)
     * for examples.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * ConfigurationProperty configurationProperty_;
     * CfnInstanceFleetConfig cfnInstanceFleetConfig = CfnInstanceFleetConfig.Builder.create(this,
     * "MyCfnInstanceFleetConfig")
     * .clusterId("clusterId")
     * .instanceFleetType("instanceFleetType")
     * // the properties below are optional
     * .instanceTypeConfigs(List.of(InstanceTypeConfigProperty.builder()
     * .instanceType("instanceType")
     * // the properties below are optional
     * .bidPrice("bidPrice")
     * .bidPriceAsPercentageOfOnDemandPrice(123)
     * .configurations(List.of(ConfigurationProperty.builder()
     * .classification("classification")
     * .configurationProperties(Map.of(
     * "configurationPropertiesKey", "configurationProperties"))
     * .configurations(List.of(configurationProperty_))
     * .build()))
     * .customAmiId("customAmiId")
     * .ebsConfiguration(EbsConfigurationProperty.builder()
     * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
     * .volumeSpecification(VolumeSpecificationProperty.builder()
     * .sizeInGb(123)
     * .volumeType("volumeType")
     * // the properties below are optional
     * .iops(123)
     * .build())
     * // the properties below are optional
     * .volumesPerInstance(123)
     * .build()))
     * .ebsOptimized(false)
     * .build())
     * .weightedCapacity(123)
     * .build()))
     * .launchSpecifications(InstanceFleetProvisioningSpecificationsProperty.builder()
     * .onDemandSpecification(OnDemandProvisioningSpecificationProperty.builder()
     * .allocationStrategy("allocationStrategy")
     * .build())
     * .spotSpecification(SpotProvisioningSpecificationProperty.builder()
     * .timeoutAction("timeoutAction")
     * .timeoutDurationMinutes(123)
     * // the properties below are optional
     * .allocationStrategy("allocationStrategy")
     * .blockDurationMinutes(123)
     * .build())
     * .build())
     * .name("name")
     * .targetOnDemandCapacity(123)
     * .targetSpotCapacity(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancefleetconfig.html)
     */
    public inline fun cfnInstanceFleetConfig(
        scope: Construct,
        id: String,
        block: CfnInstanceFleetConfigDsl.() -> Unit = {},
    ): CfnInstanceFleetConfig {
        val builder = CfnInstanceFleetConfigDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Used only with Amazon EMR release 4.0 and later.
     *
     * `Configuration` specifies optional configurations for customizing open-source big data
     * applications and environment parameters. A configuration consists of a classification,
     * properties, and optional nested configurations. A classification refers to an
     * application-specific configuration file. Properties are the settings you want to change in
     * that file. For more information, see
     * [Configuring Applications](https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-configure-apps.html)
     * in the *Amazon EMR Release Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * ConfigurationProperty configurationProperty_;
     * ConfigurationProperty configurationProperty = ConfigurationProperty.builder()
     * .classification("classification")
     * .configurationProperties(Map.of(
     * "configurationPropertiesKey", "configurationProperties"))
     * .configurations(List.of(configurationProperty_))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-configuration.html)
     */
    public inline fun cfnInstanceFleetConfigConfigurationProperty(
        block: CfnInstanceFleetConfigConfigurationPropertyDsl.() -> Unit = {}
    ): CfnInstanceFleetConfig.ConfigurationProperty {
        val builder = CfnInstanceFleetConfigConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `EbsBlockDeviceConfig` is a subproperty of the `EbsConfiguration` property type.
     *
     * `EbsBlockDeviceConfig` defines the number and type of EBS volumes to associate with all EC2
     * instances in an EMR cluster.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * EbsBlockDeviceConfigProperty ebsBlockDeviceConfigProperty =
     * EbsBlockDeviceConfigProperty.builder()
     * .volumeSpecification(VolumeSpecificationProperty.builder()
     * .sizeInGb(123)
     * .volumeType("volumeType")
     * // the properties below are optional
     * .iops(123)
     * .build())
     * // the properties below are optional
     * .volumesPerInstance(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-ebsblockdeviceconfig.html)
     */
    public inline fun cfnInstanceFleetConfigEbsBlockDeviceConfigProperty(
        block: CfnInstanceFleetConfigEbsBlockDeviceConfigPropertyDsl.() -> Unit = {}
    ): CfnInstanceFleetConfig.EbsBlockDeviceConfigProperty {
        val builder = CfnInstanceFleetConfigEbsBlockDeviceConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `EbsConfiguration` determines the EBS volumes to attach to EMR cluster instances.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * EbsConfigurationProperty ebsConfigurationProperty = EbsConfigurationProperty.builder()
     * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
     * .volumeSpecification(VolumeSpecificationProperty.builder()
     * .sizeInGb(123)
     * .volumeType("volumeType")
     * // the properties below are optional
     * .iops(123)
     * .build())
     * // the properties below are optional
     * .volumesPerInstance(123)
     * .build()))
     * .ebsOptimized(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-ebsconfiguration.html)
     */
    public inline fun cfnInstanceFleetConfigEbsConfigurationProperty(
        block: CfnInstanceFleetConfigEbsConfigurationPropertyDsl.() -> Unit = {}
    ): CfnInstanceFleetConfig.EbsConfigurationProperty {
        val builder = CfnInstanceFleetConfigEbsConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later,
     * excluding 5.0.x versions.
     *
     * `InstanceTypeConfig` is a sub-property of `InstanceFleetConfig` . `InstanceTypeConfig`
     * determines the EC2 instances that Amazon EMR attempts to provision to fulfill On-Demand and
     * Spot target capacities.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * InstanceFleetProvisioningSpecificationsProperty instanceFleetProvisioningSpecificationsProperty
     * = InstanceFleetProvisioningSpecificationsProperty.builder()
     * .onDemandSpecification(OnDemandProvisioningSpecificationProperty.builder()
     * .allocationStrategy("allocationStrategy")
     * .build())
     * .spotSpecification(SpotProvisioningSpecificationProperty.builder()
     * .timeoutAction("timeoutAction")
     * .timeoutDurationMinutes(123)
     * // the properties below are optional
     * .allocationStrategy("allocationStrategy")
     * .blockDurationMinutes(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-instancefleetprovisioningspecifications.html)
     */
    public inline fun cfnInstanceFleetConfigInstanceFleetProvisioningSpecificationsProperty(
        block: CfnInstanceFleetConfigInstanceFleetProvisioningSpecificationsPropertyDsl.() -> Unit =
            {}
    ): CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty {
        val builder = CfnInstanceFleetConfigInstanceFleetProvisioningSpecificationsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `InstanceType` config is a subproperty of `InstanceFleetConfig` .
     *
     * An instance type configuration specifies each instance type in an instance fleet. The
     * configuration determines the EC2 instances Amazon EMR attempts to provision to fulfill
     * On-Demand and Spot target capacities.
     *
     * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later,
     * excluding 5.0.x versions.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * ConfigurationProperty configurationProperty_;
     * InstanceTypeConfigProperty instanceTypeConfigProperty = InstanceTypeConfigProperty.builder()
     * .instanceType("instanceType")
     * // the properties below are optional
     * .bidPrice("bidPrice")
     * .bidPriceAsPercentageOfOnDemandPrice(123)
     * .configurations(List.of(ConfigurationProperty.builder()
     * .classification("classification")
     * .configurationProperties(Map.of(
     * "configurationPropertiesKey", "configurationProperties"))
     * .configurations(List.of(configurationProperty_))
     * .build()))
     * .customAmiId("customAmiId")
     * .ebsConfiguration(EbsConfigurationProperty.builder()
     * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
     * .volumeSpecification(VolumeSpecificationProperty.builder()
     * .sizeInGb(123)
     * .volumeType("volumeType")
     * // the properties below are optional
     * .iops(123)
     * .build())
     * // the properties below are optional
     * .volumesPerInstance(123)
     * .build()))
     * .ebsOptimized(false)
     * .build())
     * .weightedCapacity(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-instancetypeconfig.html)
     */
    public inline fun cfnInstanceFleetConfigInstanceTypeConfigProperty(
        block: CfnInstanceFleetConfigInstanceTypeConfigPropertyDsl.() -> Unit = {}
    ): CfnInstanceFleetConfig.InstanceTypeConfigProperty {
        val builder = CfnInstanceFleetConfigInstanceTypeConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The launch specification for On-Demand Instances in the instance fleet, which determines the
     * allocation strategy.
     *
     * The instance fleet configuration is available only in Amazon EMR releases 4.8.0 and later,
     * excluding 5.0.x versions. On-Demand Instances allocation strategy is available in Amazon EMR
     * releases 5.12.1 and later.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * OnDemandProvisioningSpecificationProperty onDemandProvisioningSpecificationProperty =
     * OnDemandProvisioningSpecificationProperty.builder()
     * .allocationStrategy("allocationStrategy")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-ondemandprovisioningspecification.html)
     */
    public inline fun cfnInstanceFleetConfigOnDemandProvisioningSpecificationProperty(
        block: CfnInstanceFleetConfigOnDemandProvisioningSpecificationPropertyDsl.() -> Unit = {}
    ): CfnInstanceFleetConfig.OnDemandProvisioningSpecificationProperty {
        val builder = CfnInstanceFleetConfigOnDemandProvisioningSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnInstanceFleetConfig`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * ConfigurationProperty configurationProperty_;
     * CfnInstanceFleetConfigProps cfnInstanceFleetConfigProps = CfnInstanceFleetConfigProps.builder()
     * .clusterId("clusterId")
     * .instanceFleetType("instanceFleetType")
     * // the properties below are optional
     * .instanceTypeConfigs(List.of(InstanceTypeConfigProperty.builder()
     * .instanceType("instanceType")
     * // the properties below are optional
     * .bidPrice("bidPrice")
     * .bidPriceAsPercentageOfOnDemandPrice(123)
     * .configurations(List.of(ConfigurationProperty.builder()
     * .classification("classification")
     * .configurationProperties(Map.of(
     * "configurationPropertiesKey", "configurationProperties"))
     * .configurations(List.of(configurationProperty_))
     * .build()))
     * .customAmiId("customAmiId")
     * .ebsConfiguration(EbsConfigurationProperty.builder()
     * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
     * .volumeSpecification(VolumeSpecificationProperty.builder()
     * .sizeInGb(123)
     * .volumeType("volumeType")
     * // the properties below are optional
     * .iops(123)
     * .build())
     * // the properties below are optional
     * .volumesPerInstance(123)
     * .build()))
     * .ebsOptimized(false)
     * .build())
     * .weightedCapacity(123)
     * .build()))
     * .launchSpecifications(InstanceFleetProvisioningSpecificationsProperty.builder()
     * .onDemandSpecification(OnDemandProvisioningSpecificationProperty.builder()
     * .allocationStrategy("allocationStrategy")
     * .build())
     * .spotSpecification(SpotProvisioningSpecificationProperty.builder()
     * .timeoutAction("timeoutAction")
     * .timeoutDurationMinutes(123)
     * // the properties below are optional
     * .allocationStrategy("allocationStrategy")
     * .blockDurationMinutes(123)
     * .build())
     * .build())
     * .name("name")
     * .targetOnDemandCapacity(123)
     * .targetSpotCapacity(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancefleetconfig.html)
     */
    public inline fun cfnInstanceFleetConfigProps(
        block: CfnInstanceFleetConfigPropsDsl.() -> Unit = {}
    ): CfnInstanceFleetConfigProps {
        val builder = CfnInstanceFleetConfigPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `SpotProvisioningSpecification` is a subproperty of the
     * `InstanceFleetProvisioningSpecifications` property type.
     *
     * `SpotProvisioningSpecification` determines the launch specification for Spot instances in the
     * instance fleet, which includes the defined duration and provisioning timeout behavior.
     *
     * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later,
     * excluding 5.0.x versions.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * SpotProvisioningSpecificationProperty spotProvisioningSpecificationProperty =
     * SpotProvisioningSpecificationProperty.builder()
     * .timeoutAction("timeoutAction")
     * .timeoutDurationMinutes(123)
     * // the properties below are optional
     * .allocationStrategy("allocationStrategy")
     * .blockDurationMinutes(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-spotprovisioningspecification.html)
     */
    public inline fun cfnInstanceFleetConfigSpotProvisioningSpecificationProperty(
        block: CfnInstanceFleetConfigSpotProvisioningSpecificationPropertyDsl.() -> Unit = {}
    ): CfnInstanceFleetConfig.SpotProvisioningSpecificationProperty {
        val builder = CfnInstanceFleetConfigSpotProvisioningSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `VolumeSpecification` is a subproperty of the `EbsBlockDeviceConfig` property type.
     *
     * `VolumeSecification` determines the volume type, IOPS, and size (GiB) for EBS volumes
     * attached to EC2 instances.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * VolumeSpecificationProperty volumeSpecificationProperty = VolumeSpecificationProperty.builder()
     * .sizeInGb(123)
     * .volumeType("volumeType")
     * // the properties below are optional
     * .iops(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-volumespecification.html)
     */
    public inline fun cfnInstanceFleetConfigVolumeSpecificationProperty(
        block: CfnInstanceFleetConfigVolumeSpecificationPropertyDsl.() -> Unit = {}
    ): CfnInstanceFleetConfig.VolumeSpecificationProperty {
        val builder = CfnInstanceFleetConfigVolumeSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use `InstanceGroupConfig` to define instance groups for an EMR cluster.
     *
     * A cluster can not use both instance groups and instance fleets. For more information, see
     * [Create a Cluster with Instance Fleets or Uniform Instance Groups](https://docs.aws.amazon.com//emr/latest/ManagementGuide/emr-instance-group-configuration.html)
     * in the *Amazon EMR Management Guide* .
     *
     * You can currently only add task instance groups to a cluster with this resource. If you use
     * this resource, CloudFormation waits for the cluster launch to complete before adding the task
     * instance group to the cluster. In order to add task instance groups to the cluster as part of
     * the cluster launch and minimize delays in provisioning task nodes, use the
     * `TaskInstanceGroups` subproperty for the
     * [AWS::EMR::Cluster JobFlowInstancesConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html)
     * property instead. To use this subproperty, see
     * [AWS::EMR::Cluster](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html)
     * for examples.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * ConfigurationProperty configurationProperty_;
     * CfnInstanceGroupConfig cfnInstanceGroupConfig = CfnInstanceGroupConfig.Builder.create(this,
     * "MyCfnInstanceGroupConfig")
     * .instanceCount(123)
     * .instanceRole("instanceRole")
     * .instanceType("instanceType")
     * .jobFlowId("jobFlowId")
     * // the properties below are optional
     * .autoScalingPolicy(AutoScalingPolicyProperty.builder()
     * .constraints(ScalingConstraintsProperty.builder()
     * .maxCapacity(123)
     * .minCapacity(123)
     * .build())
     * .rules(List.of(ScalingRuleProperty.builder()
     * .action(ScalingActionProperty.builder()
     * .simpleScalingPolicyConfiguration(SimpleScalingPolicyConfigurationProperty.builder()
     * .scalingAdjustment(123)
     * // the properties below are optional
     * .adjustmentType("adjustmentType")
     * .coolDown(123)
     * .build())
     * // the properties below are optional
     * .market("market")
     * .build())
     * .name("name")
     * .trigger(ScalingTriggerProperty.builder()
     * .cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty.builder()
     * .comparisonOperator("comparisonOperator")
     * .metricName("metricName")
     * .period(123)
     * .threshold(123)
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .evaluationPeriods(123)
     * .namespace("namespace")
     * .statistic("statistic")
     * .unit("unit")
     * .build())
     * .build())
     * // the properties below are optional
     * .description("description")
     * .build()))
     * .build())
     * .bidPrice("bidPrice")
     * .configurations(List.of(ConfigurationProperty.builder()
     * .classification("classification")
     * .configurationProperties(Map.of(
     * "configurationPropertiesKey", "configurationProperties"))
     * .configurations(List.of(configurationProperty_))
     * .build()))
     * .customAmiId("customAmiId")
     * .ebsConfiguration(EbsConfigurationProperty.builder()
     * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
     * .volumeSpecification(VolumeSpecificationProperty.builder()
     * .sizeInGb(123)
     * .volumeType("volumeType")
     * // the properties below are optional
     * .iops(123)
     * .build())
     * // the properties below are optional
     * .volumesPerInstance(123)
     * .build()))
     * .ebsOptimized(false)
     * .build())
     * .market("market")
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html)
     */
    public inline fun cfnInstanceGroupConfig(
        scope: Construct,
        id: String,
        block: CfnInstanceGroupConfigDsl.() -> Unit = {},
    ): CfnInstanceGroupConfig {
        val builder = CfnInstanceGroupConfigDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * `AutoScalingPolicy` defines how an instance group dynamically adds and terminates EC2
     * instances in response to the value of a CloudWatch metric.
     *
     * For more information, see
     * [Using Automatic Scaling in Amazon EMR](https://docs.aws.amazon.com//emr/latest/ManagementGuide/emr-automatic-scaling.html)
     * in the *Amazon EMR Management Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * AutoScalingPolicyProperty autoScalingPolicyProperty = AutoScalingPolicyProperty.builder()
     * .constraints(ScalingConstraintsProperty.builder()
     * .maxCapacity(123)
     * .minCapacity(123)
     * .build())
     * .rules(List.of(ScalingRuleProperty.builder()
     * .action(ScalingActionProperty.builder()
     * .simpleScalingPolicyConfiguration(SimpleScalingPolicyConfigurationProperty.builder()
     * .scalingAdjustment(123)
     * // the properties below are optional
     * .adjustmentType("adjustmentType")
     * .coolDown(123)
     * .build())
     * // the properties below are optional
     * .market("market")
     * .build())
     * .name("name")
     * .trigger(ScalingTriggerProperty.builder()
     * .cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty.builder()
     * .comparisonOperator("comparisonOperator")
     * .metricName("metricName")
     * .period(123)
     * .threshold(123)
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .evaluationPeriods(123)
     * .namespace("namespace")
     * .statistic("statistic")
     * .unit("unit")
     * .build())
     * .build())
     * // the properties below are optional
     * .description("description")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-autoscalingpolicy.html)
     */
    public inline fun cfnInstanceGroupConfigAutoScalingPolicyProperty(
        block: CfnInstanceGroupConfigAutoScalingPolicyPropertyDsl.() -> Unit = {}
    ): CfnInstanceGroupConfig.AutoScalingPolicyProperty {
        val builder = CfnInstanceGroupConfigAutoScalingPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `CloudWatchAlarmDefinition` is a subproperty of the `ScalingTrigger` property, which
     * determines when to trigger an automatic scaling activity.
     *
     * Scaling activity begins when you satisfy the defined alarm conditions.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * CloudWatchAlarmDefinitionProperty cloudWatchAlarmDefinitionProperty =
     * CloudWatchAlarmDefinitionProperty.builder()
     * .comparisonOperator("comparisonOperator")
     * .metricName("metricName")
     * .period(123)
     * .threshold(123)
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .evaluationPeriods(123)
     * .namespace("namespace")
     * .statistic("statistic")
     * .unit("unit")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-cloudwatchalarmdefinition.html)
     */
    public inline fun cfnInstanceGroupConfigCloudWatchAlarmDefinitionProperty(
        block: CfnInstanceGroupConfigCloudWatchAlarmDefinitionPropertyDsl.() -> Unit = {}
    ): CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty {
        val builder = CfnInstanceGroupConfigCloudWatchAlarmDefinitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `Configurations` is a property of the `AWS::EMR::Cluster` resource that specifies the
     * configuration of applications on an Amazon EMR cluster.
     *
     * Configurations are optional. You can use them to have EMR customize applications and software
     * bundled with Amazon EMR when a cluster is created. A configuration consists of a
     * classification, properties, and optional nested configurations. A classification refers to an
     * application-specific configuration file. Properties are the settings you want to change in
     * that file. For more information, see
     * [Configuring Applications](https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-configure-apps.html)
     * .
     *
     * Applies only to Amazon EMR releases 4.0 and later.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * ConfigurationProperty configurationProperty_;
     * ConfigurationProperty configurationProperty = ConfigurationProperty.builder()
     * .classification("classification")
     * .configurationProperties(Map.of(
     * "configurationPropertiesKey", "configurationProperties"))
     * .configurations(List.of(configurationProperty_))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-configuration.html)
     */
    public inline fun cfnInstanceGroupConfigConfigurationProperty(
        block: CfnInstanceGroupConfigConfigurationPropertyDsl.() -> Unit = {}
    ): CfnInstanceGroupConfig.ConfigurationProperty {
        val builder = CfnInstanceGroupConfigConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration of requested EBS block device associated with the instance group with count of
     * volumes that are associated to every instance.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * EbsBlockDeviceConfigProperty ebsBlockDeviceConfigProperty =
     * EbsBlockDeviceConfigProperty.builder()
     * .volumeSpecification(VolumeSpecificationProperty.builder()
     * .sizeInGb(123)
     * .volumeType("volumeType")
     * // the properties below are optional
     * .iops(123)
     * .build())
     * // the properties below are optional
     * .volumesPerInstance(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-ebsblockdeviceconfig.html)
     */
    public inline fun cfnInstanceGroupConfigEbsBlockDeviceConfigProperty(
        block: CfnInstanceGroupConfigEbsBlockDeviceConfigPropertyDsl.() -> Unit = {}
    ): CfnInstanceGroupConfig.EbsBlockDeviceConfigProperty {
        val builder = CfnInstanceGroupConfigEbsBlockDeviceConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Amazon EBS configuration of a cluster instance.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * EbsConfigurationProperty ebsConfigurationProperty = EbsConfigurationProperty.builder()
     * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
     * .volumeSpecification(VolumeSpecificationProperty.builder()
     * .sizeInGb(123)
     * .volumeType("volumeType")
     * // the properties below are optional
     * .iops(123)
     * .build())
     * // the properties below are optional
     * .volumesPerInstance(123)
     * .build()))
     * .ebsOptimized(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-ebsconfiguration.html)
     */
    public inline fun cfnInstanceGroupConfigEbsConfigurationProperty(
        block: CfnInstanceGroupConfigEbsConfigurationPropertyDsl.() -> Unit = {}
    ): CfnInstanceGroupConfig.EbsConfigurationProperty {
        val builder = CfnInstanceGroupConfigEbsConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `MetricDimension` is a subproperty of the `CloudWatchAlarmDefinition` property type.
     *
     * `MetricDimension` specifies a CloudWatch dimension, which is specified with a `Key` `Value`
     * pair. The key is known as a `Name` in CloudWatch. By default, Amazon EMR uses one dimension
     * whose `Key` is `JobFlowID` and `Value` is a variable representing the cluster ID, which is
     * `${emr.clusterId}` . This enables the automatic scaling rule for EMR to bootstrap when the
     * cluster ID becomes available during cluster creation.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * MetricDimensionProperty metricDimensionProperty = MetricDimensionProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-metricdimension.html)
     */
    public inline fun cfnInstanceGroupConfigMetricDimensionProperty(
        block: CfnInstanceGroupConfigMetricDimensionPropertyDsl.() -> Unit = {}
    ): CfnInstanceGroupConfig.MetricDimensionProperty {
        val builder = CfnInstanceGroupConfigMetricDimensionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnInstanceGroupConfig`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * ConfigurationProperty configurationProperty_;
     * CfnInstanceGroupConfigProps cfnInstanceGroupConfigProps = CfnInstanceGroupConfigProps.builder()
     * .instanceCount(123)
     * .instanceRole("instanceRole")
     * .instanceType("instanceType")
     * .jobFlowId("jobFlowId")
     * // the properties below are optional
     * .autoScalingPolicy(AutoScalingPolicyProperty.builder()
     * .constraints(ScalingConstraintsProperty.builder()
     * .maxCapacity(123)
     * .minCapacity(123)
     * .build())
     * .rules(List.of(ScalingRuleProperty.builder()
     * .action(ScalingActionProperty.builder()
     * .simpleScalingPolicyConfiguration(SimpleScalingPolicyConfigurationProperty.builder()
     * .scalingAdjustment(123)
     * // the properties below are optional
     * .adjustmentType("adjustmentType")
     * .coolDown(123)
     * .build())
     * // the properties below are optional
     * .market("market")
     * .build())
     * .name("name")
     * .trigger(ScalingTriggerProperty.builder()
     * .cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty.builder()
     * .comparisonOperator("comparisonOperator")
     * .metricName("metricName")
     * .period(123)
     * .threshold(123)
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .evaluationPeriods(123)
     * .namespace("namespace")
     * .statistic("statistic")
     * .unit("unit")
     * .build())
     * .build())
     * // the properties below are optional
     * .description("description")
     * .build()))
     * .build())
     * .bidPrice("bidPrice")
     * .configurations(List.of(ConfigurationProperty.builder()
     * .classification("classification")
     * .configurationProperties(Map.of(
     * "configurationPropertiesKey", "configurationProperties"))
     * .configurations(List.of(configurationProperty_))
     * .build()))
     * .customAmiId("customAmiId")
     * .ebsConfiguration(EbsConfigurationProperty.builder()
     * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
     * .volumeSpecification(VolumeSpecificationProperty.builder()
     * .sizeInGb(123)
     * .volumeType("volumeType")
     * // the properties below are optional
     * .iops(123)
     * .build())
     * // the properties below are optional
     * .volumesPerInstance(123)
     * .build()))
     * .ebsOptimized(false)
     * .build())
     * .market("market")
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html)
     */
    public inline fun cfnInstanceGroupConfigProps(
        block: CfnInstanceGroupConfigPropsDsl.() -> Unit = {}
    ): CfnInstanceGroupConfigProps {
        val builder = CfnInstanceGroupConfigPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `ScalingAction` is a subproperty of the `ScalingRule` property type.
     *
     * `ScalingAction` determines the type of adjustment the automatic scaling activity makes when
     * triggered, and the periodicity of the adjustment.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * ScalingActionProperty scalingActionProperty = ScalingActionProperty.builder()
     * .simpleScalingPolicyConfiguration(SimpleScalingPolicyConfigurationProperty.builder()
     * .scalingAdjustment(123)
     * // the properties below are optional
     * .adjustmentType("adjustmentType")
     * .coolDown(123)
     * .build())
     * // the properties below are optional
     * .market("market")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-scalingaction.html)
     */
    public inline fun cfnInstanceGroupConfigScalingActionProperty(
        block: CfnInstanceGroupConfigScalingActionPropertyDsl.() -> Unit = {}
    ): CfnInstanceGroupConfig.ScalingActionProperty {
        val builder = CfnInstanceGroupConfigScalingActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `ScalingConstraints` is a subproperty of the `AutoScalingPolicy` property type.
     *
     * `ScalingConstraints` defines the upper and lower EC2 instance limits for an automatic scaling
     * policy. Automatic scaling activities triggered by automatic scaling rules will not cause an
     * instance group to grow above or shrink below these limits.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * ScalingConstraintsProperty scalingConstraintsProperty = ScalingConstraintsProperty.builder()
     * .maxCapacity(123)
     * .minCapacity(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-scalingconstraints.html)
     */
    public inline fun cfnInstanceGroupConfigScalingConstraintsProperty(
        block: CfnInstanceGroupConfigScalingConstraintsPropertyDsl.() -> Unit = {}
    ): CfnInstanceGroupConfig.ScalingConstraintsProperty {
        val builder = CfnInstanceGroupConfigScalingConstraintsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `ScalingRule` is a subproperty of the `AutoScalingPolicy` property type.
     *
     * `ScalingRule` defines the scale-in or scale-out rules for scaling activity, including the
     * CloudWatch metric alarm that triggers activity, how EC2 instances are added or removed, and
     * the periodicity of adjustments. The automatic scaling policy for an instance group can
     * comprise one or more automatic scaling rules.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * ScalingRuleProperty scalingRuleProperty = ScalingRuleProperty.builder()
     * .action(ScalingActionProperty.builder()
     * .simpleScalingPolicyConfiguration(SimpleScalingPolicyConfigurationProperty.builder()
     * .scalingAdjustment(123)
     * // the properties below are optional
     * .adjustmentType("adjustmentType")
     * .coolDown(123)
     * .build())
     * // the properties below are optional
     * .market("market")
     * .build())
     * .name("name")
     * .trigger(ScalingTriggerProperty.builder()
     * .cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty.builder()
     * .comparisonOperator("comparisonOperator")
     * .metricName("metricName")
     * .period(123)
     * .threshold(123)
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .evaluationPeriods(123)
     * .namespace("namespace")
     * .statistic("statistic")
     * .unit("unit")
     * .build())
     * .build())
     * // the properties below are optional
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-scalingrule.html)
     */
    public inline fun cfnInstanceGroupConfigScalingRuleProperty(
        block: CfnInstanceGroupConfigScalingRulePropertyDsl.() -> Unit = {}
    ): CfnInstanceGroupConfig.ScalingRuleProperty {
        val builder = CfnInstanceGroupConfigScalingRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `ScalingTrigger` is a subproperty of the `ScalingRule` property type.
     *
     * `ScalingTrigger` determines the conditions that trigger an automatic scaling activity.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * ScalingTriggerProperty scalingTriggerProperty = ScalingTriggerProperty.builder()
     * .cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty.builder()
     * .comparisonOperator("comparisonOperator")
     * .metricName("metricName")
     * .period(123)
     * .threshold(123)
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .evaluationPeriods(123)
     * .namespace("namespace")
     * .statistic("statistic")
     * .unit("unit")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-scalingtrigger.html)
     */
    public inline fun cfnInstanceGroupConfigScalingTriggerProperty(
        block: CfnInstanceGroupConfigScalingTriggerPropertyDsl.() -> Unit = {}
    ): CfnInstanceGroupConfig.ScalingTriggerProperty {
        val builder = CfnInstanceGroupConfigScalingTriggerPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `SimpleScalingPolicyConfiguration` is a subproperty of the `ScalingAction` property type.
     *
     * `SimpleScalingPolicyConfiguration` determines how an automatic scaling action adds or removes
     * instances, the cooldown period, and the number of EC2 instances that are added each time the
     * CloudWatch metric alarm condition is satisfied.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * SimpleScalingPolicyConfigurationProperty simpleScalingPolicyConfigurationProperty =
     * SimpleScalingPolicyConfigurationProperty.builder()
     * .scalingAdjustment(123)
     * // the properties below are optional
     * .adjustmentType("adjustmentType")
     * .coolDown(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-simplescalingpolicyconfiguration.html)
     */
    public inline fun cfnInstanceGroupConfigSimpleScalingPolicyConfigurationProperty(
        block: CfnInstanceGroupConfigSimpleScalingPolicyConfigurationPropertyDsl.() -> Unit = {}
    ): CfnInstanceGroupConfig.SimpleScalingPolicyConfigurationProperty {
        val builder = CfnInstanceGroupConfigSimpleScalingPolicyConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `VolumeSpecification` is a subproperty of the `EbsBlockDeviceConfig` property type.
     *
     * `VolumeSecification` determines the volume type, IOPS, and size (GiB) for EBS volumes
     * attached to EC2 instances.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * VolumeSpecificationProperty volumeSpecificationProperty = VolumeSpecificationProperty.builder()
     * .sizeInGb(123)
     * .volumeType("volumeType")
     * // the properties below are optional
     * .iops(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-volumespecification.html)
     */
    public inline fun cfnInstanceGroupConfigVolumeSpecificationProperty(
        block: CfnInstanceGroupConfigVolumeSpecificationPropertyDsl.() -> Unit = {}
    ): CfnInstanceGroupConfig.VolumeSpecificationProperty {
        val builder = CfnInstanceGroupConfigVolumeSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use a `SecurityConfiguration` resource to configure data encryption, Kerberos authentication
     * (available in Amazon EMR release version 5.10.0 and later), and Amazon S3 authorization for
     * EMRFS (available in EMR 5.10.0 and later). You can re-use a security configuration for any
     * number of clusters in your account. For more information and example security configuration
     * JSON objects, see
     * [Create a Security Configuration](https://docs.aws.amazon.com//emr/latest/ManagementGuide/emr-create-security-configuration.html)
     * in the *Amazon EMR Management Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * Object securityConfiguration;
     * CfnSecurityConfiguration cfnSecurityConfiguration =
     * CfnSecurityConfiguration.Builder.create(this, "MyCfnSecurityConfiguration")
     * .securityConfiguration(securityConfiguration)
     * // the properties below are optional
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-securityconfiguration.html)
     */
    public inline fun cfnSecurityConfiguration(
        scope: Construct,
        id: String,
        block: CfnSecurityConfigurationDsl.() -> Unit = {},
    ): CfnSecurityConfiguration {
        val builder = CfnSecurityConfigurationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSecurityConfiguration`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * Object securityConfiguration;
     * CfnSecurityConfigurationProps cfnSecurityConfigurationProps =
     * CfnSecurityConfigurationProps.builder()
     * .securityConfiguration(securityConfiguration)
     * // the properties below are optional
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-securityconfiguration.html)
     */
    public inline fun cfnSecurityConfigurationProps(
        block: CfnSecurityConfigurationPropsDsl.() -> Unit = {}
    ): CfnSecurityConfigurationProps {
        val builder = CfnSecurityConfigurationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use `Step` to specify a cluster (job flow) step, which runs only on the master node.
     *
     * Steps are used to submit data processing jobs to a cluster.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * CfnStep cfnStep = CfnStep.Builder.create(this, "MyCfnStep")
     * .actionOnFailure("actionOnFailure")
     * .hadoopJarStep(HadoopJarStepConfigProperty.builder()
     * .jar("jar")
     * // the properties below are optional
     * .args(List.of("args"))
     * .mainClass("mainClass")
     * .stepProperties(List.of(KeyValueProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build())
     * .jobFlowId("jobFlowId")
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html)
     */
    public inline fun cfnStep(
        scope: Construct,
        id: String,
        block: CfnStepDsl.() -> Unit = {},
    ): CfnStep {
        val builder = CfnStepDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A job flow step consisting of a JAR file whose main function will be executed.
     *
     * The main function submits a job for Hadoop to execute and waits for the job to finish or
     * fail.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * HadoopJarStepConfigProperty hadoopJarStepConfigProperty = HadoopJarStepConfigProperty.builder()
     * .jar("jar")
     * // the properties below are optional
     * .args(List.of("args"))
     * .mainClass("mainClass")
     * .stepProperties(List.of(KeyValueProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-step-hadoopjarstepconfig.html)
     */
    public inline fun cfnStepHadoopJarStepConfigProperty(
        block: CfnStepHadoopJarStepConfigPropertyDsl.() -> Unit = {}
    ): CfnStep.HadoopJarStepConfigProperty {
        val builder = CfnStepHadoopJarStepConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `KeyValue` is a subproperty of the `HadoopJarStepConfig` property type.
     *
     * `KeyValue` is used to pass parameters to a step.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * KeyValueProperty keyValueProperty = KeyValueProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-step-keyvalue.html)
     */
    public inline fun cfnStepKeyValueProperty(
        block: CfnStepKeyValuePropertyDsl.() -> Unit = {}
    ): CfnStep.KeyValueProperty {
        val builder = CfnStepKeyValuePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnStep`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * CfnStepProps cfnStepProps = CfnStepProps.builder()
     * .actionOnFailure("actionOnFailure")
     * .hadoopJarStep(HadoopJarStepConfigProperty.builder()
     * .jar("jar")
     * // the properties below are optional
     * .args(List.of("args"))
     * .mainClass("mainClass")
     * .stepProperties(List.of(KeyValueProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build())
     * .jobFlowId("jobFlowId")
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html)
     */
    public inline fun cfnStepProps(block: CfnStepPropsDsl.() -> Unit = {}): CfnStepProps {
        val builder = CfnStepPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::EMR::Studio` resource specifies an Amazon EMR Studio.
     *
     * An EMR Studio is a web-based, integrated development environment for fully managed Jupyter
     * notebooks that run on Amazon EMR clusters. For more information, see the
     * [*Amazon EMR Management Guide*](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-studio.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * CfnStudio cfnStudio = CfnStudio.Builder.create(this, "MyCfnStudio")
     * .authMode("authMode")
     * .defaultS3Location("defaultS3Location")
     * .engineSecurityGroupId("engineSecurityGroupId")
     * .name("name")
     * .serviceRole("serviceRole")
     * .subnetIds(List.of("subnetIds"))
     * .vpcId("vpcId")
     * .workspaceSecurityGroupId("workspaceSecurityGroupId")
     * // the properties below are optional
     * .description("description")
     * .idpAuthUrl("idpAuthUrl")
     * .idpRelayStateParameterName("idpRelayStateParameterName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .userRole("userRole")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html)
     */
    public inline fun cfnStudio(
        scope: Construct,
        id: String,
        block: CfnStudioDsl.() -> Unit = {},
    ): CfnStudio {
        val builder = CfnStudioDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnStudio`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * CfnStudioProps cfnStudioProps = CfnStudioProps.builder()
     * .authMode("authMode")
     * .defaultS3Location("defaultS3Location")
     * .engineSecurityGroupId("engineSecurityGroupId")
     * .name("name")
     * .serviceRole("serviceRole")
     * .subnetIds(List.of("subnetIds"))
     * .vpcId("vpcId")
     * .workspaceSecurityGroupId("workspaceSecurityGroupId")
     * // the properties below are optional
     * .description("description")
     * .idpAuthUrl("idpAuthUrl")
     * .idpRelayStateParameterName("idpRelayStateParameterName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .userRole("userRole")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html)
     */
    public inline fun cfnStudioProps(block: CfnStudioPropsDsl.() -> Unit = {}): CfnStudioProps {
        val builder = CfnStudioPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::EMR::StudioSessionMapping` resource is an Amazon EMR resource type that maps a user
     * or group to the Amazon EMR Studio specified by `StudioId` , and applies a session policy that
     * defines Studio permissions for that user or group.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * CfnStudioSessionMapping cfnStudioSessionMapping = CfnStudioSessionMapping.Builder.create(this,
     * "MyCfnStudioSessionMapping")
     * .identityName("identityName")
     * .identityType("identityType")
     * .sessionPolicyArn("sessionPolicyArn")
     * .studioId("studioId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studiosessionmapping.html)
     */
    public inline fun cfnStudioSessionMapping(
        scope: Construct,
        id: String,
        block: CfnStudioSessionMappingDsl.() -> Unit = {},
    ): CfnStudioSessionMapping {
        val builder = CfnStudioSessionMappingDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnStudioSessionMapping`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.emr.*;
     * CfnStudioSessionMappingProps cfnStudioSessionMappingProps =
     * CfnStudioSessionMappingProps.builder()
     * .identityName("identityName")
     * .identityType("identityType")
     * .sessionPolicyArn("sessionPolicyArn")
     * .studioId("studioId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studiosessionmapping.html)
     */
    public inline fun cfnStudioSessionMappingProps(
        block: CfnStudioSessionMappingPropsDsl.() -> Unit = {}
    ): CfnStudioSessionMappingProps {
        val builder = CfnStudioSessionMappingPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
