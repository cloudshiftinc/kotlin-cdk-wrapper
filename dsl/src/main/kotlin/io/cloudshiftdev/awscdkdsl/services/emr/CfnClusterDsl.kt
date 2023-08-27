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

package io.cloudshiftdev.awscdkdsl.services.emr

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnCluster
import software.constructs.Construct

/**
 * The `AWS::EMR::Cluster` resource specifies an Amazon EMR cluster.
 *
 * This cluster is a collection of Amazon EC2 instances that run open source big data frameworks and
 * applications to process and analyze vast amounts of data. For more information, see the
 * [Amazon EMR Management Guide](https://docs.aws.amazon.com//emr/latest/ManagementGuide/) .
 *
 * Amazon EMR now supports launching task instance groups and task instance fleets as part of the
 * `AWS::EMR::Cluster` resource. This can be done by using the `JobFlowInstancesConfig` property
 * type's `TaskInstanceGroups` and `TaskInstanceFleets` subproperties. Using these subproperties
 * reduces delays in provisioning task nodes compared to specifying task nodes with the
 * `AWS::EMR::InstanceGroupConfig` and `AWS::EMR::InstanceFleetConfig` resources. Please refer to
 * the examples at the bottom of this page to learn how to use these subproperties.
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
 * .throughput(123)
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
 * .throughput(123)
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
 * .throughput(123)
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
 * .throughput(123)
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
 * .throughput(123)
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
 * .throughput(123)
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
@CdkDslMarker
public class CfnClusterDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnCluster.Builder = CfnCluster.Builder.create(scope, id)

    private val _applications: MutableList<Any> = mutableListOf()

    private val _bootstrapActions: MutableList<Any> = mutableListOf()

    private val _configurations: MutableList<Any> = mutableListOf()

    private val _steps: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * A JSON string for selecting additional features.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-additionalinfo)
     *
     * @param additionalInfo A JSON string for selecting additional features.
     */
    public fun additionalInfo(additionalInfo: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(additionalInfo)
        cdkBuilder.additionalInfo(builder.map)
    }

    /**
     * A JSON string for selecting additional features.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-additionalinfo)
     *
     * @param additionalInfo A JSON string for selecting additional features.
     */
    public fun additionalInfo(additionalInfo: Any) {
        cdkBuilder.additionalInfo(additionalInfo)
    }

    /**
     * The applications to install on this cluster, for example, Spark, Flink, Oozie, Zeppelin, and
     * so on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-applications)
     *
     * @param applications The applications to install on this cluster, for example, Spark, Flink,
     *   Oozie, Zeppelin, and so on.
     */
    public fun applications(vararg applications: Any) {
        _applications.addAll(listOf(*applications))
    }

    /**
     * The applications to install on this cluster, for example, Spark, Flink, Oozie, Zeppelin, and
     * so on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-applications)
     *
     * @param applications The applications to install on this cluster, for example, Spark, Flink,
     *   Oozie, Zeppelin, and so on.
     */
    public fun applications(applications: Collection<Any>) {
        _applications.addAll(applications)
    }

    /**
     * The applications to install on this cluster, for example, Spark, Flink, Oozie, Zeppelin, and
     * so on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-applications)
     *
     * @param applications The applications to install on this cluster, for example, Spark, Flink,
     *   Oozie, Zeppelin, and so on.
     */
    public fun applications(applications: IResolvable) {
        cdkBuilder.applications(applications)
    }

    /**
     * An IAM role for automatic scaling policies.
     *
     * The default role is `EMR_AutoScaling_DefaultRole` . The IAM role provides permissions that
     * the automatic scaling feature requires to launch and terminate Amazon EC2 instances in an
     * instance group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-autoscalingrole)
     *
     * @param autoScalingRole An IAM role for automatic scaling policies.
     */
    public fun autoScalingRole(autoScalingRole: String) {
        cdkBuilder.autoScalingRole(autoScalingRole)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-autoterminationpolicy)
     *
     * @param autoTerminationPolicy
     */
    public fun autoTerminationPolicy(autoTerminationPolicy: IResolvable) {
        cdkBuilder.autoTerminationPolicy(autoTerminationPolicy)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-autoterminationpolicy)
     *
     * @param autoTerminationPolicy
     */
    public fun autoTerminationPolicy(
        autoTerminationPolicy: CfnCluster.AutoTerminationPolicyProperty
    ) {
        cdkBuilder.autoTerminationPolicy(autoTerminationPolicy)
    }

    /**
     * A list of bootstrap actions to run before Hadoop starts on the cluster nodes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-bootstrapactions)
     *
     * @param bootstrapActions A list of bootstrap actions to run before Hadoop starts on the
     *   cluster nodes.
     */
    public fun bootstrapActions(vararg bootstrapActions: Any) {
        _bootstrapActions.addAll(listOf(*bootstrapActions))
    }

    /**
     * A list of bootstrap actions to run before Hadoop starts on the cluster nodes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-bootstrapactions)
     *
     * @param bootstrapActions A list of bootstrap actions to run before Hadoop starts on the
     *   cluster nodes.
     */
    public fun bootstrapActions(bootstrapActions: Collection<Any>) {
        _bootstrapActions.addAll(bootstrapActions)
    }

    /**
     * A list of bootstrap actions to run before Hadoop starts on the cluster nodes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-bootstrapactions)
     *
     * @param bootstrapActions A list of bootstrap actions to run before Hadoop starts on the
     *   cluster nodes.
     */
    public fun bootstrapActions(bootstrapActions: IResolvable) {
        cdkBuilder.bootstrapActions(bootstrapActions)
    }

    /**
     * Applies only to Amazon EMR releases 4.x and later. The list of configurations that are
     * supplied to the Amazon EMR cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-configurations)
     *
     * @param configurations Applies only to Amazon EMR releases 4.x and later. The list of
     *   configurations that are supplied to the Amazon EMR cluster.
     */
    public fun configurations(vararg configurations: Any) {
        _configurations.addAll(listOf(*configurations))
    }

    /**
     * Applies only to Amazon EMR releases 4.x and later. The list of configurations that are
     * supplied to the Amazon EMR cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-configurations)
     *
     * @param configurations Applies only to Amazon EMR releases 4.x and later. The list of
     *   configurations that are supplied to the Amazon EMR cluster.
     */
    public fun configurations(configurations: Collection<Any>) {
        _configurations.addAll(configurations)
    }

    /**
     * Applies only to Amazon EMR releases 4.x and later. The list of configurations that are
     * supplied to the Amazon EMR cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-configurations)
     *
     * @param configurations Applies only to Amazon EMR releases 4.x and later. The list of
     *   configurations that are supplied to the Amazon EMR cluster.
     */
    public fun configurations(configurations: IResolvable) {
        cdkBuilder.configurations(configurations)
    }

    /**
     * Available only in Amazon EMR releases 5.7.0 and later. The ID of a custom Amazon EBS-backed
     * Linux AMI if the cluster uses a custom AMI.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-customamiid)
     *
     * @param customAmiId Available only in Amazon EMR releases 5.7.0 and later. The ID of a custom
     *   Amazon EBS-backed Linux AMI if the cluster uses a custom AMI.
     */
    public fun customAmiId(customAmiId: String) {
        cdkBuilder.customAmiId(customAmiId)
    }

    /**
     * The size, in GiB, of the Amazon EBS root device volume of the Linux AMI that is used for each
     * Amazon EC2 instance.
     *
     * Available in Amazon EMR releases 4.x and later.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-ebsrootvolumesize)
     *
     * @param ebsRootVolumeSize The size, in GiB, of the Amazon EBS root device volume of the Linux
     *   AMI that is used for each Amazon EC2 instance.
     */
    public fun ebsRootVolumeSize(ebsRootVolumeSize: Number) {
        cdkBuilder.ebsRootVolumeSize(ebsRootVolumeSize)
    }

    /**
     * A specification of the number and type of Amazon EC2 instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-instances)
     *
     * @param instances A specification of the number and type of Amazon EC2 instances.
     */
    public fun instances(instances: IResolvable) {
        cdkBuilder.instances(instances)
    }

    /**
     * A specification of the number and type of Amazon EC2 instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-instances)
     *
     * @param instances A specification of the number and type of Amazon EC2 instances.
     */
    public fun instances(instances: CfnCluster.JobFlowInstancesConfigProperty) {
        cdkBuilder.instances(instances)
    }

    /**
     * Also called instance profile and Amazon EC2 role.
     *
     * An IAM role for an Amazon EMR cluster. The Amazon EC2 instances of the cluster assume this
     * role. The default role is `EMR_EC2_DefaultRole` . In order to use the default role, you must
     * have already created it using the AWS CLI or console.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-jobflowrole)
     *
     * @param jobFlowRole Also called instance profile and Amazon EC2 role.
     */
    public fun jobFlowRole(jobFlowRole: String) {
        cdkBuilder.jobFlowRole(jobFlowRole)
    }

    /**
     * Attributes for Kerberos configuration when Kerberos authentication is enabled using a
     * security configuration.
     *
     * For more information see
     * [Use Kerberos Authentication](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-kerberos.html)
     * in the *Amazon EMR Management Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-kerberosattributes)
     *
     * @param kerberosAttributes Attributes for Kerberos configuration when Kerberos authentication
     *   is enabled using a security configuration.
     */
    public fun kerberosAttributes(kerberosAttributes: IResolvable) {
        cdkBuilder.kerberosAttributes(kerberosAttributes)
    }

    /**
     * Attributes for Kerberos configuration when Kerberos authentication is enabled using a
     * security configuration.
     *
     * For more information see
     * [Use Kerberos Authentication](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-kerberos.html)
     * in the *Amazon EMR Management Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-kerberosattributes)
     *
     * @param kerberosAttributes Attributes for Kerberos configuration when Kerberos authentication
     *   is enabled using a security configuration.
     */
    public fun kerberosAttributes(kerberosAttributes: CfnCluster.KerberosAttributesProperty) {
        cdkBuilder.kerberosAttributes(kerberosAttributes)
    }

    /**
     * The AWS KMS key used for encrypting log files.
     *
     * This attribute is only available with Amazon EMR 5.30.0 and later, excluding Amazon EMR
     * 6.0.0.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-logencryptionkmskeyid)
     *
     * @param logEncryptionKmsKeyId The AWS KMS key used for encrypting log files.
     */
    public fun logEncryptionKmsKeyId(logEncryptionKmsKeyId: String) {
        cdkBuilder.logEncryptionKmsKeyId(logEncryptionKmsKeyId)
    }

    /**
     * The path to the Amazon S3 location where logs for this cluster are stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-loguri)
     *
     * @param logUri The path to the Amazon S3 location where logs for this cluster are stored.
     */
    public fun logUri(logUri: String) {
        cdkBuilder.logUri(logUri)
    }

    /**
     * Creates or updates a managed scaling policy for an Amazon EMR cluster.
     *
     * The managed scaling policy defines the limits for resources, such as Amazon EC2 instances
     * that can be added or terminated from a cluster. The policy only applies to the core and task
     * nodes. The master node cannot be scaled after initial configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-managedscalingpolicy)
     *
     * @param managedScalingPolicy Creates or updates a managed scaling policy for an Amazon EMR
     *   cluster.
     */
    public fun managedScalingPolicy(managedScalingPolicy: IResolvable) {
        cdkBuilder.managedScalingPolicy(managedScalingPolicy)
    }

    /**
     * Creates or updates a managed scaling policy for an Amazon EMR cluster.
     *
     * The managed scaling policy defines the limits for resources, such as Amazon EC2 instances
     * that can be added or terminated from a cluster. The policy only applies to the core and task
     * nodes. The master node cannot be scaled after initial configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-managedscalingpolicy)
     *
     * @param managedScalingPolicy Creates or updates a managed scaling policy for an Amazon EMR
     *   cluster.
     */
    public fun managedScalingPolicy(managedScalingPolicy: CfnCluster.ManagedScalingPolicyProperty) {
        cdkBuilder.managedScalingPolicy(managedScalingPolicy)
    }

    /**
     * The name of the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-name)
     *
     * @param name The name of the cluster.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-osreleaselabel)
     *
     * @param osReleaseLabel
     */
    public fun osReleaseLabel(osReleaseLabel: String) {
        cdkBuilder.osReleaseLabel(osReleaseLabel)
    }

    /**
     * The Amazon EMR release label, which determines the version of open-source application
     * packages installed on the cluster.
     *
     * Release labels are in the form `emr-x.x.x` , where x.x.x is an Amazon EMR release version
     * such as `emr-5.14.0` . For more information about Amazon EMR release versions and included
     * application versions and features, see
     * [](https://docs.aws.amazon.com/emr/latest/ReleaseGuide/) . The release label applies only to
     * Amazon EMR releases version 4.0 and later. Earlier versions use `AmiVersion` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-releaselabel)
     *
     * @param releaseLabel The Amazon EMR release label, which determines the version of open-source
     *   application packages installed on the cluster.
     */
    public fun releaseLabel(releaseLabel: String) {
        cdkBuilder.releaseLabel(releaseLabel)
    }

    /**
     * The way that individual Amazon EC2 instances terminate when an automatic scale-in activity
     * occurs or an instance group is resized.
     *
     * `TERMINATE_AT_INSTANCE_HOUR` indicates that Amazon EMR terminates nodes at the instance-hour
     * boundary, regardless of when the request to terminate the instance was submitted. This option
     * is only available with Amazon EMR 5.1.0 and later and is the default for clusters created
     * using that version. `TERMINATE_AT_TASK_COMPLETION` indicates that Amazon EMR adds nodes to a
     * deny list and drains tasks from nodes before terminating the Amazon EC2 instances, regardless
     * of the instance-hour boundary. With either behavior, Amazon EMR removes the least active
     * nodes first and blocks instance termination if it could lead to HDFS corruption.
     * `TERMINATE_AT_TASK_COMPLETION` is available only in Amazon EMR releases 4.1.0 and later, and
     * is the default for versions of Amazon EMR earlier than 5.1.0.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-scaledownbehavior)
     *
     * @param scaleDownBehavior The way that individual Amazon EC2 instances terminate when an
     *   automatic scale-in activity occurs or an instance group is resized.
     */
    public fun scaleDownBehavior(scaleDownBehavior: String) {
        cdkBuilder.scaleDownBehavior(scaleDownBehavior)
    }

    /**
     * The name of the security configuration applied to the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-securityconfiguration)
     *
     * @param securityConfiguration The name of the security configuration applied to the cluster.
     */
    public fun securityConfiguration(securityConfiguration: String) {
        cdkBuilder.securityConfiguration(securityConfiguration)
    }

    /**
     * The IAM role that Amazon EMR assumes in order to access AWS resources on your behalf.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-servicerole)
     *
     * @param serviceRole The IAM role that Amazon EMR assumes in order to access AWS resources on
     *   your behalf.
     */
    public fun serviceRole(serviceRole: String) {
        cdkBuilder.serviceRole(serviceRole)
    }

    /**
     * Specifies the number of steps that can be executed concurrently.
     *
     * The default value is `1` . The maximum value is `256` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-stepconcurrencylevel)
     *
     * @param stepConcurrencyLevel Specifies the number of steps that can be executed concurrently.
     */
    public fun stepConcurrencyLevel(stepConcurrencyLevel: Number) {
        cdkBuilder.stepConcurrencyLevel(stepConcurrencyLevel)
    }

    /**
     * A list of steps to run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-steps)
     *
     * @param steps A list of steps to run.
     */
    public fun steps(vararg steps: Any) {
        _steps.addAll(listOf(*steps))
    }

    /**
     * A list of steps to run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-steps)
     *
     * @param steps A list of steps to run.
     */
    public fun steps(steps: Collection<Any>) {
        _steps.addAll(steps)
    }

    /**
     * A list of steps to run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-steps)
     *
     * @param steps A list of steps to run.
     */
    public fun steps(steps: IResolvable) {
        cdkBuilder.steps(steps)
    }

    /**
     * A list of tags associated with a cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-tags)
     *
     * @param tags A list of tags associated with a cluster.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * A list of tags associated with a cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-tags)
     *
     * @param tags A list of tags associated with a cluster.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * Indicates whether the cluster is visible to all IAM users of the AWS account associated with
     * the cluster.
     *
     * If this value is set to `true` , all IAM users of that AWS account can view and manage the
     * cluster if they have the proper policy permissions set. If this value is `false` , only the
     * IAM user that created the cluster can view and manage it. This value can be changed using the
     * SetVisibleToAllUsers action.
     *
     * When you create clusters directly through the EMR console or API, this value is set to `true`
     * by default. However, for `AWS::EMR::Cluster` resources in CloudFormation, the default is
     * `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-visibletoallusers)
     *
     * @param visibleToAllUsers Indicates whether the cluster is visible to all IAM users of the AWS
     *   account associated with the cluster.
     */
    public fun visibleToAllUsers(visibleToAllUsers: Boolean) {
        cdkBuilder.visibleToAllUsers(visibleToAllUsers)
    }

    /**
     * Indicates whether the cluster is visible to all IAM users of the AWS account associated with
     * the cluster.
     *
     * If this value is set to `true` , all IAM users of that AWS account can view and manage the
     * cluster if they have the proper policy permissions set. If this value is `false` , only the
     * IAM user that created the cluster can view and manage it. This value can be changed using the
     * SetVisibleToAllUsers action.
     *
     * When you create clusters directly through the EMR console or API, this value is set to `true`
     * by default. However, for `AWS::EMR::Cluster` resources in CloudFormation, the default is
     * `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-visibletoallusers)
     *
     * @param visibleToAllUsers Indicates whether the cluster is visible to all IAM users of the AWS
     *   account associated with the cluster.
     */
    public fun visibleToAllUsers(visibleToAllUsers: IResolvable) {
        cdkBuilder.visibleToAllUsers(visibleToAllUsers)
    }

    public fun build(): CfnCluster {
        if (_applications.isNotEmpty()) cdkBuilder.applications(_applications)
        if (_bootstrapActions.isNotEmpty()) cdkBuilder.bootstrapActions(_bootstrapActions)
        if (_configurations.isNotEmpty()) cdkBuilder.configurations(_configurations)
        if (_steps.isNotEmpty()) cdkBuilder.steps(_steps)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
