@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.emr

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Use `InstanceGroupConfig` to define instance groups for an EMR cluster.
 *
 * A cluster can not use both instance groups and instance fleets. For more information, see [Create
 * a Cluster with Instance Fleets or Uniform Instance
 * Groups](https://docs.aws.amazon.com//emr/latest/ManagementGuide/emr-instance-group-configuration.html)
 * in the *Amazon EMR Management Guide* .
 *
 *
 * You can currently only add task instance groups to a cluster with this resource. If you use this
 * resource, CloudFormation waits for the cluster launch to complete before adding the task instance
 * group to the cluster. In order to add task instance groups to the cluster as part of the cluster
 * launch and minimize delays in provisioning task nodes, use the `TaskInstanceGroups` subproperty for
 * the [AWS::EMR::Cluster
 * JobFlowInstancesConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html)
 * property instead. To use this subproperty, see
 * [AWS::EMR::Cluster](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html)
 * for examples.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.emr.*;
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
 * .throughput(123)
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
public open class CfnInstanceGroupConfig internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnInstanceGroupConfigProps,
  ) :
      this(software.amazon.awscdk.services.emr.CfnInstanceGroupConfig(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnInstanceGroupConfigProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnInstanceGroupConfigProps.Builder.() -> Unit,
  ) : this(scope, id, CfnInstanceGroupConfigProps(props)
  )

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * `AutoScalingPolicy` is a subproperty of `InstanceGroupConfig` .
   */
  public open fun autoScalingPolicy(): Any? = unwrap(this).getAutoScalingPolicy()

  /**
   * `AutoScalingPolicy` is a subproperty of `InstanceGroupConfig` .
   */
  public open fun autoScalingPolicy(`value`: IResolvable) {
    unwrap(this).setAutoScalingPolicy(`value`.let(IResolvable::unwrap))
  }

  /**
   * `AutoScalingPolicy` is a subproperty of `InstanceGroupConfig` .
   */
  public open fun autoScalingPolicy(`value`: AutoScalingPolicyProperty) {
    unwrap(this).setAutoScalingPolicy(`value`.let(AutoScalingPolicyProperty::unwrap))
  }

  /**
   * `AutoScalingPolicy` is a subproperty of `InstanceGroupConfig` .
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d3b20186e04388a4cc0fc1d79c58701e008033b44a48b712553e6c0d4661999c")
  public open fun autoScalingPolicy(`value`: AutoScalingPolicyProperty.Builder.() -> Unit): Unit =
      autoScalingPolicy(AutoScalingPolicyProperty(`value`))

  /**
   * If specified, indicates that the instance group uses Spot Instances.
   */
  public open fun bidPrice(): String? = unwrap(this).getBidPrice()

  /**
   * If specified, indicates that the instance group uses Spot Instances.
   */
  public open fun bidPrice(`value`: String) {
    unwrap(this).setBidPrice(`value`)
  }

  /**
   * Amazon EMR releases 4.x or later.
   */
  public open fun configurations(): Any? = unwrap(this).getConfigurations()

  /**
   * Amazon EMR releases 4.x or later.
   */
  public open fun configurations(`value`: IResolvable) {
    unwrap(this).setConfigurations(`value`.let(IResolvable::unwrap))
  }

  /**
   * Amazon EMR releases 4.x or later.
   */
  public open fun configurations(`value`: List<Any>) {
    unwrap(this).setConfigurations(`value`)
  }

  /**
   * Amazon EMR releases 4.x or later.
   */
  public open fun configurations(vararg `value`: Any): Unit = configurations(`value`.toList())

  /**
   * The custom AMI ID to use for the provisioned instance group.
   */
  public open fun customAmiId(): String? = unwrap(this).getCustomAmiId()

  /**
   * The custom AMI ID to use for the provisioned instance group.
   */
  public open fun customAmiId(`value`: String) {
    unwrap(this).setCustomAmiId(`value`)
  }

  /**
   * `EbsConfiguration` determines the EBS volumes to attach to EMR cluster instances.
   */
  public open fun ebsConfiguration(): Any? = unwrap(this).getEbsConfiguration()

  /**
   * `EbsConfiguration` determines the EBS volumes to attach to EMR cluster instances.
   */
  public open fun ebsConfiguration(`value`: IResolvable) {
    unwrap(this).setEbsConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * `EbsConfiguration` determines the EBS volumes to attach to EMR cluster instances.
   */
  public open fun ebsConfiguration(`value`: EbsConfigurationProperty) {
    unwrap(this).setEbsConfiguration(`value`.let(EbsConfigurationProperty::unwrap))
  }

  /**
   * `EbsConfiguration` determines the EBS volumes to attach to EMR cluster instances.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e1fd9233911cbdd87f366aed768a80386f049d0dad92a434b624452198e8d8ab")
  public open fun ebsConfiguration(`value`: EbsConfigurationProperty.Builder.() -> Unit): Unit =
      ebsConfiguration(EbsConfigurationProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Target number of instances for the instance group.
   */
  public open fun instanceCount(): Number = unwrap(this).getInstanceCount()

  /**
   * Target number of instances for the instance group.
   */
  public open fun instanceCount(`value`: Number) {
    unwrap(this).setInstanceCount(`value`)
  }

  /**
   * The role of the instance group in the cluster.
   */
  public open fun instanceRole(): String = unwrap(this).getInstanceRole()

  /**
   * The role of the instance group in the cluster.
   */
  public open fun instanceRole(`value`: String) {
    unwrap(this).setInstanceRole(`value`)
  }

  /**
   * The Amazon EC2 instance type for all instances in the instance group.
   */
  public open fun instanceType(): String = unwrap(this).getInstanceType()

  /**
   * The Amazon EC2 instance type for all instances in the instance group.
   */
  public open fun instanceType(`value`: String) {
    unwrap(this).setInstanceType(`value`)
  }

  /**
   * The ID of an Amazon EMR cluster that you want to associate this instance group with.
   */
  public open fun jobFlowId(): String = unwrap(this).getJobFlowId()

  /**
   * The ID of an Amazon EMR cluster that you want to associate this instance group with.
   */
  public open fun jobFlowId(`value`: String) {
    unwrap(this).setJobFlowId(`value`)
  }

  /**
   * Market type of the Amazon EC2 instances used to create a cluster node.
   */
  public open fun market(): String? = unwrap(this).getMarket()

  /**
   * Market type of the Amazon EC2 instances used to create a cluster node.
   */
  public open fun market(`value`: String) {
    unwrap(this).setMarket(`value`)
  }

  /**
   * Friendly name given to the instance group.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * Friendly name given to the instance group.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.emr.CfnInstanceGroupConfig].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * `AutoScalingPolicy` is a subproperty of `InstanceGroupConfig` .
     *
     * `AutoScalingPolicy` defines how an instance group dynamically adds and terminates EC2
     * instances in response to the value of a CloudWatch metric. For more information, see [Using
     * Automatic Scaling in Amazon
     * EMR](https://docs.aws.amazon.com//emr/latest/ManagementGuide/emr-automatic-scaling.html) in the
     * *Amazon EMR Management Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-autoscalingpolicy)
     * @param autoScalingPolicy `AutoScalingPolicy` is a subproperty of `InstanceGroupConfig` . 
     */
    public fun autoScalingPolicy(autoScalingPolicy: IResolvable)

    /**
     * `AutoScalingPolicy` is a subproperty of `InstanceGroupConfig` .
     *
     * `AutoScalingPolicy` defines how an instance group dynamically adds and terminates EC2
     * instances in response to the value of a CloudWatch metric. For more information, see [Using
     * Automatic Scaling in Amazon
     * EMR](https://docs.aws.amazon.com//emr/latest/ManagementGuide/emr-automatic-scaling.html) in the
     * *Amazon EMR Management Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-autoscalingpolicy)
     * @param autoScalingPolicy `AutoScalingPolicy` is a subproperty of `InstanceGroupConfig` . 
     */
    public fun autoScalingPolicy(autoScalingPolicy: AutoScalingPolicyProperty)

    /**
     * `AutoScalingPolicy` is a subproperty of `InstanceGroupConfig` .
     *
     * `AutoScalingPolicy` defines how an instance group dynamically adds and terminates EC2
     * instances in response to the value of a CloudWatch metric. For more information, see [Using
     * Automatic Scaling in Amazon
     * EMR](https://docs.aws.amazon.com//emr/latest/ManagementGuide/emr-automatic-scaling.html) in the
     * *Amazon EMR Management Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-autoscalingpolicy)
     * @param autoScalingPolicy `AutoScalingPolicy` is a subproperty of `InstanceGroupConfig` . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd88ae6c4f06f17baab5b23770cd6888d70dabae31bd89baad6c5babd94ffa21")
    public fun autoScalingPolicy(autoScalingPolicy: AutoScalingPolicyProperty.Builder.() -> Unit)

    /**
     * If specified, indicates that the instance group uses Spot Instances.
     *
     * This is the maximum price you are willing to pay for Spot Instances. Specify `OnDemandPrice`
     * to set the amount equal to the On-Demand price, or specify an amount in USD.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-bidprice)
     * @param bidPrice If specified, indicates that the instance group uses Spot Instances. 
     */
    public fun bidPrice(bidPrice: String)

    /**
     * Amazon EMR releases 4.x or later.
     *
     * The list of configurations supplied for an Amazon EMR cluster instance group. You can specify
     * a separate configuration for each instance group (master, core, and task).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-configurations)
     * @param configurations Amazon EMR releases 4.x or later. 
     */
    public fun configurations(configurations: IResolvable)

    /**
     * Amazon EMR releases 4.x or later.
     *
     * The list of configurations supplied for an Amazon EMR cluster instance group. You can specify
     * a separate configuration for each instance group (master, core, and task).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-configurations)
     * @param configurations Amazon EMR releases 4.x or later. 
     */
    public fun configurations(configurations: List<Any>)

    /**
     * Amazon EMR releases 4.x or later.
     *
     * The list of configurations supplied for an Amazon EMR cluster instance group. You can specify
     * a separate configuration for each instance group (master, core, and task).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-configurations)
     * @param configurations Amazon EMR releases 4.x or later. 
     */
    public fun configurations(vararg configurations: Any)

    /**
     * The custom AMI ID to use for the provisioned instance group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-customamiid)
     * @param customAmiId The custom AMI ID to use for the provisioned instance group. 
     */
    public fun customAmiId(customAmiId: String)

    /**
     * `EbsConfiguration` determines the EBS volumes to attach to EMR cluster instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-ebsconfiguration)
     * @param ebsConfiguration `EbsConfiguration` determines the EBS volumes to attach to EMR
     * cluster instances. 
     */
    public fun ebsConfiguration(ebsConfiguration: IResolvable)

    /**
     * `EbsConfiguration` determines the EBS volumes to attach to EMR cluster instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-ebsconfiguration)
     * @param ebsConfiguration `EbsConfiguration` determines the EBS volumes to attach to EMR
     * cluster instances. 
     */
    public fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty)

    /**
     * `EbsConfiguration` determines the EBS volumes to attach to EMR cluster instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-ebsconfiguration)
     * @param ebsConfiguration `EbsConfiguration` determines the EBS volumes to attach to EMR
     * cluster instances. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("10da914fab90d1dd604ab7d79e6cf336e54f95c0ebfdc9e325f2bf8429e83cb0")
    public fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty.Builder.() -> Unit)

    /**
     * Target number of instances for the instance group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-instancecount)
     * @param instanceCount Target number of instances for the instance group. 
     */
    public fun instanceCount(instanceCount: Number)

    /**
     * The role of the instance group in the cluster.
     *
     * *Allowed Values* : TASK
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-instancerole)
     * @param instanceRole The role of the instance group in the cluster. 
     */
    public fun instanceRole(instanceRole: String)

    /**
     * The Amazon EC2 instance type for all instances in the instance group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-instancetype)
     * @param instanceType The Amazon EC2 instance type for all instances in the instance group. 
     */
    public fun instanceType(instanceType: String)

    /**
     * The ID of an Amazon EMR cluster that you want to associate this instance group with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-jobflowid)
     * @param jobFlowId The ID of an Amazon EMR cluster that you want to associate this instance
     * group with. 
     */
    public fun jobFlowId(jobFlowId: String)

    /**
     * Market type of the Amazon EC2 instances used to create a cluster node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-market)
     * @param market Market type of the Amazon EC2 instances used to create a cluster node. 
     */
    public fun market(market: String)

    /**
     * Friendly name given to the instance group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-name)
     * @param name Friendly name given to the instance group. 
     */
    public fun name(name: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.Builder =
        software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.Builder.create(scope, id)

    /**
     * `AutoScalingPolicy` is a subproperty of `InstanceGroupConfig` .
     *
     * `AutoScalingPolicy` defines how an instance group dynamically adds and terminates EC2
     * instances in response to the value of a CloudWatch metric. For more information, see [Using
     * Automatic Scaling in Amazon
     * EMR](https://docs.aws.amazon.com//emr/latest/ManagementGuide/emr-automatic-scaling.html) in the
     * *Amazon EMR Management Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-autoscalingpolicy)
     * @param autoScalingPolicy `AutoScalingPolicy` is a subproperty of `InstanceGroupConfig` . 
     */
    override fun autoScalingPolicy(autoScalingPolicy: IResolvable) {
      cdkBuilder.autoScalingPolicy(autoScalingPolicy.let(IResolvable::unwrap))
    }

    /**
     * `AutoScalingPolicy` is a subproperty of `InstanceGroupConfig` .
     *
     * `AutoScalingPolicy` defines how an instance group dynamically adds and terminates EC2
     * instances in response to the value of a CloudWatch metric. For more information, see [Using
     * Automatic Scaling in Amazon
     * EMR](https://docs.aws.amazon.com//emr/latest/ManagementGuide/emr-automatic-scaling.html) in the
     * *Amazon EMR Management Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-autoscalingpolicy)
     * @param autoScalingPolicy `AutoScalingPolicy` is a subproperty of `InstanceGroupConfig` . 
     */
    override fun autoScalingPolicy(autoScalingPolicy: AutoScalingPolicyProperty) {
      cdkBuilder.autoScalingPolicy(autoScalingPolicy.let(AutoScalingPolicyProperty::unwrap))
    }

    /**
     * `AutoScalingPolicy` is a subproperty of `InstanceGroupConfig` .
     *
     * `AutoScalingPolicy` defines how an instance group dynamically adds and terminates EC2
     * instances in response to the value of a CloudWatch metric. For more information, see [Using
     * Automatic Scaling in Amazon
     * EMR](https://docs.aws.amazon.com//emr/latest/ManagementGuide/emr-automatic-scaling.html) in the
     * *Amazon EMR Management Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-autoscalingpolicy)
     * @param autoScalingPolicy `AutoScalingPolicy` is a subproperty of `InstanceGroupConfig` . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd88ae6c4f06f17baab5b23770cd6888d70dabae31bd89baad6c5babd94ffa21")
    override fun autoScalingPolicy(autoScalingPolicy: AutoScalingPolicyProperty.Builder.() -> Unit):
        Unit = autoScalingPolicy(AutoScalingPolicyProperty(autoScalingPolicy))

    /**
     * If specified, indicates that the instance group uses Spot Instances.
     *
     * This is the maximum price you are willing to pay for Spot Instances. Specify `OnDemandPrice`
     * to set the amount equal to the On-Demand price, or specify an amount in USD.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-bidprice)
     * @param bidPrice If specified, indicates that the instance group uses Spot Instances. 
     */
    override fun bidPrice(bidPrice: String) {
      cdkBuilder.bidPrice(bidPrice)
    }

    /**
     * Amazon EMR releases 4.x or later.
     *
     * The list of configurations supplied for an Amazon EMR cluster instance group. You can specify
     * a separate configuration for each instance group (master, core, and task).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-configurations)
     * @param configurations Amazon EMR releases 4.x or later. 
     */
    override fun configurations(configurations: IResolvable) {
      cdkBuilder.configurations(configurations.let(IResolvable::unwrap))
    }

    /**
     * Amazon EMR releases 4.x or later.
     *
     * The list of configurations supplied for an Amazon EMR cluster instance group. You can specify
     * a separate configuration for each instance group (master, core, and task).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-configurations)
     * @param configurations Amazon EMR releases 4.x or later. 
     */
    override fun configurations(configurations: List<Any>) {
      cdkBuilder.configurations(configurations)
    }

    /**
     * Amazon EMR releases 4.x or later.
     *
     * The list of configurations supplied for an Amazon EMR cluster instance group. You can specify
     * a separate configuration for each instance group (master, core, and task).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-configurations)
     * @param configurations Amazon EMR releases 4.x or later. 
     */
    override fun configurations(vararg configurations: Any): Unit =
        configurations(configurations.toList())

    /**
     * The custom AMI ID to use for the provisioned instance group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-customamiid)
     * @param customAmiId The custom AMI ID to use for the provisioned instance group. 
     */
    override fun customAmiId(customAmiId: String) {
      cdkBuilder.customAmiId(customAmiId)
    }

    /**
     * `EbsConfiguration` determines the EBS volumes to attach to EMR cluster instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-ebsconfiguration)
     * @param ebsConfiguration `EbsConfiguration` determines the EBS volumes to attach to EMR
     * cluster instances. 
     */
    override fun ebsConfiguration(ebsConfiguration: IResolvable) {
      cdkBuilder.ebsConfiguration(ebsConfiguration.let(IResolvable::unwrap))
    }

    /**
     * `EbsConfiguration` determines the EBS volumes to attach to EMR cluster instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-ebsconfiguration)
     * @param ebsConfiguration `EbsConfiguration` determines the EBS volumes to attach to EMR
     * cluster instances. 
     */
    override fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty) {
      cdkBuilder.ebsConfiguration(ebsConfiguration.let(EbsConfigurationProperty::unwrap))
    }

    /**
     * `EbsConfiguration` determines the EBS volumes to attach to EMR cluster instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-ebsconfiguration)
     * @param ebsConfiguration `EbsConfiguration` determines the EBS volumes to attach to EMR
     * cluster instances. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("10da914fab90d1dd604ab7d79e6cf336e54f95c0ebfdc9e325f2bf8429e83cb0")
    override fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty.Builder.() -> Unit):
        Unit = ebsConfiguration(EbsConfigurationProperty(ebsConfiguration))

    /**
     * Target number of instances for the instance group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-instancecount)
     * @param instanceCount Target number of instances for the instance group. 
     */
    override fun instanceCount(instanceCount: Number) {
      cdkBuilder.instanceCount(instanceCount)
    }

    /**
     * The role of the instance group in the cluster.
     *
     * *Allowed Values* : TASK
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-instancerole)
     * @param instanceRole The role of the instance group in the cluster. 
     */
    override fun instanceRole(instanceRole: String) {
      cdkBuilder.instanceRole(instanceRole)
    }

    /**
     * The Amazon EC2 instance type for all instances in the instance group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-instancetype)
     * @param instanceType The Amazon EC2 instance type for all instances in the instance group. 
     */
    override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    /**
     * The ID of an Amazon EMR cluster that you want to associate this instance group with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-jobflowid)
     * @param jobFlowId The ID of an Amazon EMR cluster that you want to associate this instance
     * group with. 
     */
    override fun jobFlowId(jobFlowId: String) {
      cdkBuilder.jobFlowId(jobFlowId)
    }

    /**
     * Market type of the Amazon EC2 instances used to create a cluster node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-market)
     * @param market Market type of the Amazon EC2 instances used to create a cluster node. 
     */
    override fun market(market: String) {
      cdkBuilder.market(market)
    }

    /**
     * Friendly name given to the instance group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-name)
     * @param name Friendly name given to the instance group. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.emr.CfnInstanceGroupConfig =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnInstanceGroupConfig {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnInstanceGroupConfig(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig):
        CfnInstanceGroupConfig = CfnInstanceGroupConfig(cdkObject)

    internal fun unwrap(wrapped: CfnInstanceGroupConfig):
        software.amazon.awscdk.services.emr.CfnInstanceGroupConfig = wrapped.cdkObject
  }

  /**
   * `AutoScalingPolicy` defines how an instance group dynamically adds and terminates EC2 instances
   * in response to the value of a CloudWatch metric.
   *
   * For more information, see [Using Automatic Scaling in Amazon
   * EMR](https://docs.aws.amazon.com//emr/latest/ManagementGuide/emr-automatic-scaling.html) in the
   * *Amazon EMR Management Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.emr.*;
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
  public interface AutoScalingPolicyProperty {
    /**
     * The upper and lower Amazon EC2 instance limits for an automatic scaling policy.
     *
     * Automatic scaling activity will not cause an instance group to grow above or below these
     * limits.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-autoscalingpolicy.html#cfn-emr-instancegroupconfig-autoscalingpolicy-constraints)
     */
    public fun constraints(): Any

    /**
     * The scale-in and scale-out rules that comprise the automatic scaling policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-autoscalingpolicy.html#cfn-emr-instancegroupconfig-autoscalingpolicy-rules)
     */
    public fun rules(): Any

    /**
     * A builder for [AutoScalingPolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param constraints The upper and lower Amazon EC2 instance limits for an automatic scaling
       * policy. 
       * Automatic scaling activity will not cause an instance group to grow above or below these
       * limits.
       */
      public fun constraints(constraints: IResolvable)

      /**
       * @param constraints The upper and lower Amazon EC2 instance limits for an automatic scaling
       * policy. 
       * Automatic scaling activity will not cause an instance group to grow above or below these
       * limits.
       */
      public fun constraints(constraints: ScalingConstraintsProperty)

      /**
       * @param constraints The upper and lower Amazon EC2 instance limits for an automatic scaling
       * policy. 
       * Automatic scaling activity will not cause an instance group to grow above or below these
       * limits.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("01406679afd1c42bc4036bdc27379e34d686b0628cb2ae42b0b0ae00bd22e65d")
      public fun constraints(constraints: ScalingConstraintsProperty.Builder.() -> Unit)

      /**
       * @param rules The scale-in and scale-out rules that comprise the automatic scaling policy. 
       */
      public fun rules(rules: IResolvable)

      /**
       * @param rules The scale-in and scale-out rules that comprise the automatic scaling policy. 
       */
      public fun rules(rules: List<Any>)

      /**
       * @param rules The scale-in and scale-out rules that comprise the automatic scaling policy. 
       */
      public fun rules(vararg rules: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.AutoScalingPolicyProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.AutoScalingPolicyProperty.builder()

      /**
       * @param constraints The upper and lower Amazon EC2 instance limits for an automatic scaling
       * policy. 
       * Automatic scaling activity will not cause an instance group to grow above or below these
       * limits.
       */
      override fun constraints(constraints: IResolvable) {
        cdkBuilder.constraints(constraints.let(IResolvable::unwrap))
      }

      /**
       * @param constraints The upper and lower Amazon EC2 instance limits for an automatic scaling
       * policy. 
       * Automatic scaling activity will not cause an instance group to grow above or below these
       * limits.
       */
      override fun constraints(constraints: ScalingConstraintsProperty) {
        cdkBuilder.constraints(constraints.let(ScalingConstraintsProperty::unwrap))
      }

      /**
       * @param constraints The upper and lower Amazon EC2 instance limits for an automatic scaling
       * policy. 
       * Automatic scaling activity will not cause an instance group to grow above or below these
       * limits.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("01406679afd1c42bc4036bdc27379e34d686b0628cb2ae42b0b0ae00bd22e65d")
      override fun constraints(constraints: ScalingConstraintsProperty.Builder.() -> Unit): Unit =
          constraints(ScalingConstraintsProperty(constraints))

      /**
       * @param rules The scale-in and scale-out rules that comprise the automatic scaling policy. 
       */
      override fun rules(rules: IResolvable) {
        cdkBuilder.rules(rules.let(IResolvable::unwrap))
      }

      /**
       * @param rules The scale-in and scale-out rules that comprise the automatic scaling policy. 
       */
      override fun rules(rules: List<Any>) {
        cdkBuilder.rules(rules)
      }

      /**
       * @param rules The scale-in and scale-out rules that comprise the automatic scaling policy. 
       */
      override fun rules(vararg rules: Any): Unit = rules(rules.toList())

      public fun build():
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.AutoScalingPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.AutoScalingPolicyProperty,
    ) : CdkObject(cdkObject), AutoScalingPolicyProperty {
      /**
       * The upper and lower Amazon EC2 instance limits for an automatic scaling policy.
       *
       * Automatic scaling activity will not cause an instance group to grow above or below these
       * limits.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-autoscalingpolicy.html#cfn-emr-instancegroupconfig-autoscalingpolicy-constraints)
       */
      override fun constraints(): Any = unwrap(this).getConstraints()

      /**
       * The scale-in and scale-out rules that comprise the automatic scaling policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-autoscalingpolicy.html#cfn-emr-instancegroupconfig-autoscalingpolicy-rules)
       */
      override fun rules(): Any = unwrap(this).getRules()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AutoScalingPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.AutoScalingPolicyProperty):
          AutoScalingPolicyProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AutoScalingPolicyProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoScalingPolicyProperty):
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.AutoScalingPolicyProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.AutoScalingPolicyProperty
    }
  }

  /**
   * `CloudWatchAlarmDefinition` is a subproperty of the `ScalingTrigger` property, which determines
   * when to trigger an automatic scaling activity.
   *
   * Scaling activity begins when you satisfy the defined alarm conditions.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.emr.*;
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
  public interface CloudWatchAlarmDefinitionProperty {
    /**
     * Determines how the metric specified by `MetricName` is compared to the value specified by
     * `Threshold` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-emr-instancegroupconfig-cloudwatchalarmdefinition-comparisonoperator)
     */
    public fun comparisonOperator(): String

    /**
     * A CloudWatch metric dimension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-emr-instancegroupconfig-cloudwatchalarmdefinition-dimensions)
     */
    public fun dimensions(): Any? = unwrap(this).getDimensions()

    /**
     * The number of periods, in five-minute increments, during which the alarm condition must exist
     * before the alarm triggers automatic scaling activity.
     *
     * The default value is `1` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-emr-instancegroupconfig-cloudwatchalarmdefinition-evaluationperiods)
     */
    public fun evaluationPeriods(): Number? = unwrap(this).getEvaluationPeriods()

    /**
     * The name of the CloudWatch metric that is watched to determine an alarm condition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-emr-instancegroupconfig-cloudwatchalarmdefinition-metricname)
     */
    public fun metricName(): String

    /**
     * The namespace for the CloudWatch metric.
     *
     * The default is `AWS/ElasticMapReduce` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-emr-instancegroupconfig-cloudwatchalarmdefinition-namespace)
     */
    public fun namespace(): String? = unwrap(this).getNamespace()

    /**
     * The period, in seconds, over which the statistic is applied.
     *
     * CloudWatch metrics for Amazon EMR are emitted every five minutes (300 seconds), so if you
     * specify a CloudWatch metric, specify `300` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-emr-instancegroupconfig-cloudwatchalarmdefinition-period)
     */
    public fun period(): Number

    /**
     * The statistic to apply to the metric associated with the alarm.
     *
     * The default is `AVERAGE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-emr-instancegroupconfig-cloudwatchalarmdefinition-statistic)
     */
    public fun statistic(): String? = unwrap(this).getStatistic()

    /**
     * The value against which the specified statistic is compared.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-emr-instancegroupconfig-cloudwatchalarmdefinition-threshold)
     */
    public fun threshold(): Number

    /**
     * The unit of measure associated with the CloudWatch metric being watched.
     *
     * The value specified for `Unit` must correspond to the units specified in the CloudWatch
     * metric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-emr-instancegroupconfig-cloudwatchalarmdefinition-unit)
     */
    public fun unit(): String? = unwrap(this).getUnit()

    /**
     * A builder for [CloudWatchAlarmDefinitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param comparisonOperator Determines how the metric specified by `MetricName` is compared
       * to the value specified by `Threshold` . 
       */
      public fun comparisonOperator(comparisonOperator: String)

      /**
       * @param dimensions A CloudWatch metric dimension.
       */
      public fun dimensions(dimensions: IResolvable)

      /**
       * @param dimensions A CloudWatch metric dimension.
       */
      public fun dimensions(dimensions: List<Any>)

      /**
       * @param dimensions A CloudWatch metric dimension.
       */
      public fun dimensions(vararg dimensions: Any)

      /**
       * @param evaluationPeriods The number of periods, in five-minute increments, during which the
       * alarm condition must exist before the alarm triggers automatic scaling activity.
       * The default value is `1` .
       */
      public fun evaluationPeriods(evaluationPeriods: Number)

      /**
       * @param metricName The name of the CloudWatch metric that is watched to determine an alarm
       * condition. 
       */
      public fun metricName(metricName: String)

      /**
       * @param namespace The namespace for the CloudWatch metric.
       * The default is `AWS/ElasticMapReduce` .
       */
      public fun namespace(namespace: String)

      /**
       * @param period The period, in seconds, over which the statistic is applied. 
       * CloudWatch metrics for Amazon EMR are emitted every five minutes (300 seconds), so if you
       * specify a CloudWatch metric, specify `300` .
       */
      public fun period(period: Number)

      /**
       * @param statistic The statistic to apply to the metric associated with the alarm.
       * The default is `AVERAGE` .
       */
      public fun statistic(statistic: String)

      /**
       * @param threshold The value against which the specified statistic is compared. 
       */
      public fun threshold(threshold: Number)

      /**
       * @param unit The unit of measure associated with the CloudWatch metric being watched.
       * The value specified for `Unit` must correspond to the units specified in the CloudWatch
       * metric.
       */
      public fun unit(unit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty.builder()

      /**
       * @param comparisonOperator Determines how the metric specified by `MetricName` is compared
       * to the value specified by `Threshold` . 
       */
      override fun comparisonOperator(comparisonOperator: String) {
        cdkBuilder.comparisonOperator(comparisonOperator)
      }

      /**
       * @param dimensions A CloudWatch metric dimension.
       */
      override fun dimensions(dimensions: IResolvable) {
        cdkBuilder.dimensions(dimensions.let(IResolvable::unwrap))
      }

      /**
       * @param dimensions A CloudWatch metric dimension.
       */
      override fun dimensions(dimensions: List<Any>) {
        cdkBuilder.dimensions(dimensions)
      }

      /**
       * @param dimensions A CloudWatch metric dimension.
       */
      override fun dimensions(vararg dimensions: Any): Unit = dimensions(dimensions.toList())

      /**
       * @param evaluationPeriods The number of periods, in five-minute increments, during which the
       * alarm condition must exist before the alarm triggers automatic scaling activity.
       * The default value is `1` .
       */
      override fun evaluationPeriods(evaluationPeriods: Number) {
        cdkBuilder.evaluationPeriods(evaluationPeriods)
      }

      /**
       * @param metricName The name of the CloudWatch metric that is watched to determine an alarm
       * condition. 
       */
      override fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
      }

      /**
       * @param namespace The namespace for the CloudWatch metric.
       * The default is `AWS/ElasticMapReduce` .
       */
      override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      /**
       * @param period The period, in seconds, over which the statistic is applied. 
       * CloudWatch metrics for Amazon EMR are emitted every five minutes (300 seconds), so if you
       * specify a CloudWatch metric, specify `300` .
       */
      override fun period(period: Number) {
        cdkBuilder.period(period)
      }

      /**
       * @param statistic The statistic to apply to the metric associated with the alarm.
       * The default is `AVERAGE` .
       */
      override fun statistic(statistic: String) {
        cdkBuilder.statistic(statistic)
      }

      /**
       * @param threshold The value against which the specified statistic is compared. 
       */
      override fun threshold(threshold: Number) {
        cdkBuilder.threshold(threshold)
      }

      /**
       * @param unit The unit of measure associated with the CloudWatch metric being watched.
       * The value specified for `Unit` must correspond to the units specified in the CloudWatch
       * metric.
       */
      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty,
    ) : CdkObject(cdkObject), CloudWatchAlarmDefinitionProperty {
      /**
       * Determines how the metric specified by `MetricName` is compared to the value specified by
       * `Threshold` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-emr-instancegroupconfig-cloudwatchalarmdefinition-comparisonoperator)
       */
      override fun comparisonOperator(): String = unwrap(this).getComparisonOperator()

      /**
       * A CloudWatch metric dimension.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-emr-instancegroupconfig-cloudwatchalarmdefinition-dimensions)
       */
      override fun dimensions(): Any? = unwrap(this).getDimensions()

      /**
       * The number of periods, in five-minute increments, during which the alarm condition must
       * exist before the alarm triggers automatic scaling activity.
       *
       * The default value is `1` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-emr-instancegroupconfig-cloudwatchalarmdefinition-evaluationperiods)
       */
      override fun evaluationPeriods(): Number? = unwrap(this).getEvaluationPeriods()

      /**
       * The name of the CloudWatch metric that is watched to determine an alarm condition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-emr-instancegroupconfig-cloudwatchalarmdefinition-metricname)
       */
      override fun metricName(): String = unwrap(this).getMetricName()

      /**
       * The namespace for the CloudWatch metric.
       *
       * The default is `AWS/ElasticMapReduce` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-emr-instancegroupconfig-cloudwatchalarmdefinition-namespace)
       */
      override fun namespace(): String? = unwrap(this).getNamespace()

      /**
       * The period, in seconds, over which the statistic is applied.
       *
       * CloudWatch metrics for Amazon EMR are emitted every five minutes (300 seconds), so if you
       * specify a CloudWatch metric, specify `300` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-emr-instancegroupconfig-cloudwatchalarmdefinition-period)
       */
      override fun period(): Number = unwrap(this).getPeriod()

      /**
       * The statistic to apply to the metric associated with the alarm.
       *
       * The default is `AVERAGE` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-emr-instancegroupconfig-cloudwatchalarmdefinition-statistic)
       */
      override fun statistic(): String? = unwrap(this).getStatistic()

      /**
       * The value against which the specified statistic is compared.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-emr-instancegroupconfig-cloudwatchalarmdefinition-threshold)
       */
      override fun threshold(): Number = unwrap(this).getThreshold()

      /**
       * The unit of measure associated with the CloudWatch metric being watched.
       *
       * The value specified for `Unit` must correspond to the units specified in the CloudWatch
       * metric.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-cloudwatchalarmdefinition.html#cfn-emr-instancegroupconfig-cloudwatchalarmdefinition-unit)
       */
      override fun unit(): String? = unwrap(this).getUnit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CloudWatchAlarmDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty):
          CloudWatchAlarmDefinitionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CloudWatchAlarmDefinitionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchAlarmDefinitionProperty):
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty
    }
  }

  /**
   * `Configurations` is a property of the `AWS::EMR::Cluster` resource that specifies the
   * configuration of applications on an Amazon EMR cluster.
   *
   * Configurations are optional. You can use them to have EMR customize applications and software
   * bundled with Amazon EMR when a cluster is created. A configuration consists of a classification,
   * properties, and optional nested configurations. A classification refers to an application-specific
   * configuration file. Properties are the settings you want to change in that file. For more
   * information, see [Configuring
   * Applications](https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-configure-apps.html) .
   *
   *
   * Applies only to Amazon EMR releases 4.0 and later.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.emr.*;
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
  public interface ConfigurationProperty {
    /**
     * The classification within a configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-configuration.html#cfn-emr-instancegroupconfig-configuration-classification)
     */
    public fun classification(): String? = unwrap(this).getClassification()

    /**
     * Within a configuration classification, a set of properties that represent the settings that
     * you want to change in the configuration file.
     *
     * Duplicates not allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-configuration.html#cfn-emr-instancegroupconfig-configuration-configurationproperties)
     */
    public fun configurationProperties(): Any? = unwrap(this).getConfigurationProperties()

    /**
     * A list of additional configurations to apply within a configuration object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-configuration.html#cfn-emr-instancegroupconfig-configuration-configurations)
     */
    public fun configurations(): Any? = unwrap(this).getConfigurations()

    /**
     * A builder for [ConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param classification The classification within a configuration.
       */
      public fun classification(classification: String)

      /**
       * @param configurationProperties Within a configuration classification, a set of properties
       * that represent the settings that you want to change in the configuration file.
       * Duplicates not allowed.
       */
      public fun configurationProperties(configurationProperties: IResolvable)

      /**
       * @param configurationProperties Within a configuration classification, a set of properties
       * that represent the settings that you want to change in the configuration file.
       * Duplicates not allowed.
       */
      public fun configurationProperties(configurationProperties: Map<String, String>)

      /**
       * @param configurations A list of additional configurations to apply within a configuration
       * object.
       */
      public fun configurations(configurations: IResolvable)

      /**
       * @param configurations A list of additional configurations to apply within a configuration
       * object.
       */
      public fun configurations(configurations: List<Any>)

      /**
       * @param configurations A list of additional configurations to apply within a configuration
       * object.
       */
      public fun configurations(vararg configurations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ConfigurationProperty.Builder =
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ConfigurationProperty.builder()

      /**
       * @param classification The classification within a configuration.
       */
      override fun classification(classification: String) {
        cdkBuilder.classification(classification)
      }

      /**
       * @param configurationProperties Within a configuration classification, a set of properties
       * that represent the settings that you want to change in the configuration file.
       * Duplicates not allowed.
       */
      override fun configurationProperties(configurationProperties: IResolvable) {
        cdkBuilder.configurationProperties(configurationProperties.let(IResolvable::unwrap))
      }

      /**
       * @param configurationProperties Within a configuration classification, a set of properties
       * that represent the settings that you want to change in the configuration file.
       * Duplicates not allowed.
       */
      override fun configurationProperties(configurationProperties: Map<String, String>) {
        cdkBuilder.configurationProperties(configurationProperties)
      }

      /**
       * @param configurations A list of additional configurations to apply within a configuration
       * object.
       */
      override fun configurations(configurations: IResolvable) {
        cdkBuilder.configurations(configurations.let(IResolvable::unwrap))
      }

      /**
       * @param configurations A list of additional configurations to apply within a configuration
       * object.
       */
      override fun configurations(configurations: List<Any>) {
        cdkBuilder.configurations(configurations)
      }

      /**
       * @param configurations A list of additional configurations to apply within a configuration
       * object.
       */
      override fun configurations(vararg configurations: Any): Unit =
          configurations(configurations.toList())

      public fun build():
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ConfigurationProperty,
    ) : CdkObject(cdkObject), ConfigurationProperty {
      /**
       * The classification within a configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-configuration.html#cfn-emr-instancegroupconfig-configuration-classification)
       */
      override fun classification(): String? = unwrap(this).getClassification()

      /**
       * Within a configuration classification, a set of properties that represent the settings that
       * you want to change in the configuration file.
       *
       * Duplicates not allowed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-configuration.html#cfn-emr-instancegroupconfig-configuration-configurationproperties)
       */
      override fun configurationProperties(): Any? = unwrap(this).getConfigurationProperties()

      /**
       * A list of additional configurations to apply within a configuration object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-configuration.html#cfn-emr-instancegroupconfig-configuration-configurations)
       */
      override fun configurations(): Any? = unwrap(this).getConfigurations()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ConfigurationProperty):
          ConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as? ConfigurationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfigurationProperty):
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ConfigurationProperty
    }
  }

  /**
   * Configuration of requested EBS block device associated with the instance group with count of
   * volumes that are associated to every instance.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.emr.*;
   * EbsBlockDeviceConfigProperty ebsBlockDeviceConfigProperty =
   * EbsBlockDeviceConfigProperty.builder()
   * .volumeSpecification(VolumeSpecificationProperty.builder()
   * .sizeInGb(123)
   * .volumeType("volumeType")
   * // the properties below are optional
   * .iops(123)
   * .throughput(123)
   * .build())
   * // the properties below are optional
   * .volumesPerInstance(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-ebsblockdeviceconfig.html)
   */
  public interface EbsBlockDeviceConfigProperty {
    /**
     * EBS volume specifications such as volume type, IOPS, size (GiB) and throughput (MiB/s) that
     * are requested for the EBS volume attached to an Amazon EC2 instance in the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-ebsblockdeviceconfig.html#cfn-emr-instancegroupconfig-ebsblockdeviceconfig-volumespecification)
     */
    public fun volumeSpecification(): Any

    /**
     * Number of EBS volumes with a specific volume configuration that are associated with every
     * instance in the instance group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-ebsblockdeviceconfig.html#cfn-emr-instancegroupconfig-ebsblockdeviceconfig-volumesperinstance)
     */
    public fun volumesPerInstance(): Number? = unwrap(this).getVolumesPerInstance()

    /**
     * A builder for [EbsBlockDeviceConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param volumeSpecification EBS volume specifications such as volume type, IOPS, size (GiB)
       * and throughput (MiB/s) that are requested for the EBS volume attached to an Amazon EC2
       * instance in the cluster. 
       */
      public fun volumeSpecification(volumeSpecification: IResolvable)

      /**
       * @param volumeSpecification EBS volume specifications such as volume type, IOPS, size (GiB)
       * and throughput (MiB/s) that are requested for the EBS volume attached to an Amazon EC2
       * instance in the cluster. 
       */
      public fun volumeSpecification(volumeSpecification: VolumeSpecificationProperty)

      /**
       * @param volumeSpecification EBS volume specifications such as volume type, IOPS, size (GiB)
       * and throughput (MiB/s) that are requested for the EBS volume attached to an Amazon EC2
       * instance in the cluster. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8399936429f874eedde1fb8ebf36c6005862947edb9047af93bba4e2933689f6")
      public
          fun volumeSpecification(volumeSpecification: VolumeSpecificationProperty.Builder.() -> Unit)

      /**
       * @param volumesPerInstance Number of EBS volumes with a specific volume configuration that
       * are associated with every instance in the instance group.
       */
      public fun volumesPerInstance(volumesPerInstance: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsBlockDeviceConfigProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsBlockDeviceConfigProperty.builder()

      /**
       * @param volumeSpecification EBS volume specifications such as volume type, IOPS, size (GiB)
       * and throughput (MiB/s) that are requested for the EBS volume attached to an Amazon EC2
       * instance in the cluster. 
       */
      override fun volumeSpecification(volumeSpecification: IResolvable) {
        cdkBuilder.volumeSpecification(volumeSpecification.let(IResolvable::unwrap))
      }

      /**
       * @param volumeSpecification EBS volume specifications such as volume type, IOPS, size (GiB)
       * and throughput (MiB/s) that are requested for the EBS volume attached to an Amazon EC2
       * instance in the cluster. 
       */
      override fun volumeSpecification(volumeSpecification: VolumeSpecificationProperty) {
        cdkBuilder.volumeSpecification(volumeSpecification.let(VolumeSpecificationProperty::unwrap))
      }

      /**
       * @param volumeSpecification EBS volume specifications such as volume type, IOPS, size (GiB)
       * and throughput (MiB/s) that are requested for the EBS volume attached to an Amazon EC2
       * instance in the cluster. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8399936429f874eedde1fb8ebf36c6005862947edb9047af93bba4e2933689f6")
      override
          fun volumeSpecification(volumeSpecification: VolumeSpecificationProperty.Builder.() -> Unit):
          Unit = volumeSpecification(VolumeSpecificationProperty(volumeSpecification))

      /**
       * @param volumesPerInstance Number of EBS volumes with a specific volume configuration that
       * are associated with every instance in the instance group.
       */
      override fun volumesPerInstance(volumesPerInstance: Number) {
        cdkBuilder.volumesPerInstance(volumesPerInstance)
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsBlockDeviceConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsBlockDeviceConfigProperty,
    ) : CdkObject(cdkObject), EbsBlockDeviceConfigProperty {
      /**
       * EBS volume specifications such as volume type, IOPS, size (GiB) and throughput (MiB/s) that
       * are requested for the EBS volume attached to an Amazon EC2 instance in the cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-ebsblockdeviceconfig.html#cfn-emr-instancegroupconfig-ebsblockdeviceconfig-volumespecification)
       */
      override fun volumeSpecification(): Any = unwrap(this).getVolumeSpecification()

      /**
       * Number of EBS volumes with a specific volume configuration that are associated with every
       * instance in the instance group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-ebsblockdeviceconfig.html#cfn-emr-instancegroupconfig-ebsblockdeviceconfig-volumesperinstance)
       */
      override fun volumesPerInstance(): Number? = unwrap(this).getVolumesPerInstance()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EbsBlockDeviceConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsBlockDeviceConfigProperty):
          EbsBlockDeviceConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EbsBlockDeviceConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EbsBlockDeviceConfigProperty):
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsBlockDeviceConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsBlockDeviceConfigProperty
    }
  }

  /**
   * The Amazon EBS configuration of a cluster instance.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.emr.*;
   * EbsConfigurationProperty ebsConfigurationProperty = EbsConfigurationProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-ebsconfiguration.html)
   */
  public interface EbsConfigurationProperty {
    /**
     * An array of Amazon EBS volume specifications attached to a cluster instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-ebsconfiguration.html#cfn-emr-instancegroupconfig-ebsconfiguration-ebsblockdeviceconfigs)
     */
    public fun ebsBlockDeviceConfigs(): Any? = unwrap(this).getEbsBlockDeviceConfigs()

    /**
     * Indicates whether an Amazon EBS volume is EBS-optimized.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-ebsconfiguration.html#cfn-emr-instancegroupconfig-ebsconfiguration-ebsoptimized)
     */
    public fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()

    /**
     * A builder for [EbsConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ebsBlockDeviceConfigs An array of Amazon EBS volume specifications attached to a
       * cluster instance.
       */
      public fun ebsBlockDeviceConfigs(ebsBlockDeviceConfigs: IResolvable)

      /**
       * @param ebsBlockDeviceConfigs An array of Amazon EBS volume specifications attached to a
       * cluster instance.
       */
      public fun ebsBlockDeviceConfigs(ebsBlockDeviceConfigs: List<Any>)

      /**
       * @param ebsBlockDeviceConfigs An array of Amazon EBS volume specifications attached to a
       * cluster instance.
       */
      public fun ebsBlockDeviceConfigs(vararg ebsBlockDeviceConfigs: Any)

      /**
       * @param ebsOptimized Indicates whether an Amazon EBS volume is EBS-optimized.
       */
      public fun ebsOptimized(ebsOptimized: Boolean)

      /**
       * @param ebsOptimized Indicates whether an Amazon EBS volume is EBS-optimized.
       */
      public fun ebsOptimized(ebsOptimized: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsConfigurationProperty.builder()

      /**
       * @param ebsBlockDeviceConfigs An array of Amazon EBS volume specifications attached to a
       * cluster instance.
       */
      override fun ebsBlockDeviceConfigs(ebsBlockDeviceConfigs: IResolvable) {
        cdkBuilder.ebsBlockDeviceConfigs(ebsBlockDeviceConfigs.let(IResolvable::unwrap))
      }

      /**
       * @param ebsBlockDeviceConfigs An array of Amazon EBS volume specifications attached to a
       * cluster instance.
       */
      override fun ebsBlockDeviceConfigs(ebsBlockDeviceConfigs: List<Any>) {
        cdkBuilder.ebsBlockDeviceConfigs(ebsBlockDeviceConfigs)
      }

      /**
       * @param ebsBlockDeviceConfigs An array of Amazon EBS volume specifications attached to a
       * cluster instance.
       */
      override fun ebsBlockDeviceConfigs(vararg ebsBlockDeviceConfigs: Any): Unit =
          ebsBlockDeviceConfigs(ebsBlockDeviceConfigs.toList())

      /**
       * @param ebsOptimized Indicates whether an Amazon EBS volume is EBS-optimized.
       */
      override fun ebsOptimized(ebsOptimized: Boolean) {
        cdkBuilder.ebsOptimized(ebsOptimized)
      }

      /**
       * @param ebsOptimized Indicates whether an Amazon EBS volume is EBS-optimized.
       */
      override fun ebsOptimized(ebsOptimized: IResolvable) {
        cdkBuilder.ebsOptimized(ebsOptimized.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsConfigurationProperty,
    ) : CdkObject(cdkObject), EbsConfigurationProperty {
      /**
       * An array of Amazon EBS volume specifications attached to a cluster instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-ebsconfiguration.html#cfn-emr-instancegroupconfig-ebsconfiguration-ebsblockdeviceconfigs)
       */
      override fun ebsBlockDeviceConfigs(): Any? = unwrap(this).getEbsBlockDeviceConfigs()

      /**
       * Indicates whether an Amazon EBS volume is EBS-optimized.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-ebsconfiguration.html#cfn-emr-instancegroupconfig-ebsconfiguration-ebsoptimized)
       */
      override fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EbsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsConfigurationProperty):
          EbsConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as? EbsConfigurationProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EbsConfigurationProperty):
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsConfigurationProperty
    }
  }

  /**
   * `MetricDimension` is a subproperty of the `CloudWatchAlarmDefinition` property type.
   *
   * `MetricDimension` specifies a CloudWatch dimension, which is specified with a `Key` `Value`
   * pair. The key is known as a `Name` in CloudWatch. By default, Amazon EMR uses one dimension whose
   * `Key` is `JobFlowID` and `Value` is a variable representing the cluster ID, which is
   * `${emr.clusterId}` . This enables the automatic scaling rule for EMR to bootstrap when the cluster
   * ID becomes available during cluster creation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.emr.*;
   * MetricDimensionProperty metricDimensionProperty = MetricDimensionProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-metricdimension.html)
   */
  public interface MetricDimensionProperty {
    /**
     * The dimension name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-metricdimension.html#cfn-emr-instancegroupconfig-metricdimension-key)
     */
    public fun key(): String

    /**
     * The dimension value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-metricdimension.html#cfn-emr-instancegroupconfig-metricdimension-value)
     */
    public fun `value`(): String

    /**
     * A builder for [MetricDimensionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The dimension name. 
       */
      public fun key(key: String)

      /**
       * @param value The dimension value. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.MetricDimensionProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.MetricDimensionProperty.builder()

      /**
       * @param key The dimension name. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The dimension value. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.MetricDimensionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.MetricDimensionProperty,
    ) : CdkObject(cdkObject), MetricDimensionProperty {
      /**
       * The dimension name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-metricdimension.html#cfn-emr-instancegroupconfig-metricdimension-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The dimension value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-metricdimension.html#cfn-emr-instancegroupconfig-metricdimension-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetricDimensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.MetricDimensionProperty):
          MetricDimensionProperty = CdkObjectWrappers.wrap(cdkObject) as? MetricDimensionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricDimensionProperty):
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.MetricDimensionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.MetricDimensionProperty
    }
  }

  /**
   * `ScalingAction` is a subproperty of the `ScalingRule` property type.
   *
   * `ScalingAction` determines the type of adjustment the automatic scaling activity makes when
   * triggered, and the periodicity of the adjustment.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.emr.*;
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
  public interface ScalingActionProperty {
    /**
     * Not available for instance groups.
     *
     * Instance groups use the market type specified for the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-scalingaction.html#cfn-emr-instancegroupconfig-scalingaction-market)
     */
    public fun market(): String? = unwrap(this).getMarket()

    /**
     * The type of adjustment the automatic scaling activity makes when triggered, and the
     * periodicity of the adjustment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-scalingaction.html#cfn-emr-instancegroupconfig-scalingaction-simplescalingpolicyconfiguration)
     */
    public fun simpleScalingPolicyConfiguration(): Any

    /**
     * A builder for [ScalingActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param market Not available for instance groups.
       * Instance groups use the market type specified for the group.
       */
      public fun market(market: String)

      /**
       * @param simpleScalingPolicyConfiguration The type of adjustment the automatic scaling
       * activity makes when triggered, and the periodicity of the adjustment. 
       */
      public fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: IResolvable)

      /**
       * @param simpleScalingPolicyConfiguration The type of adjustment the automatic scaling
       * activity makes when triggered, and the periodicity of the adjustment. 
       */
      public
          fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: SimpleScalingPolicyConfigurationProperty)

      /**
       * @param simpleScalingPolicyConfiguration The type of adjustment the automatic scaling
       * activity makes when triggered, and the periodicity of the adjustment. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1b4e742cbe99e2be6df8555644d40367564190d0d7e0bbad9cb163fa5a0c378c")
      public
          fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: SimpleScalingPolicyConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingActionProperty.Builder =
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingActionProperty.builder()

      /**
       * @param market Not available for instance groups.
       * Instance groups use the market type specified for the group.
       */
      override fun market(market: String) {
        cdkBuilder.market(market)
      }

      /**
       * @param simpleScalingPolicyConfiguration The type of adjustment the automatic scaling
       * activity makes when triggered, and the periodicity of the adjustment. 
       */
      override fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: IResolvable) {
        cdkBuilder.simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param simpleScalingPolicyConfiguration The type of adjustment the automatic scaling
       * activity makes when triggered, and the periodicity of the adjustment. 
       */
      override
          fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: SimpleScalingPolicyConfigurationProperty) {
        cdkBuilder.simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration.let(SimpleScalingPolicyConfigurationProperty::unwrap))
      }

      /**
       * @param simpleScalingPolicyConfiguration The type of adjustment the automatic scaling
       * activity makes when triggered, and the periodicity of the adjustment. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1b4e742cbe99e2be6df8555644d40367564190d0d7e0bbad9cb163fa5a0c378c")
      override
          fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: SimpleScalingPolicyConfigurationProperty.Builder.() -> Unit):
          Unit =
          simpleScalingPolicyConfiguration(SimpleScalingPolicyConfigurationProperty(simpleScalingPolicyConfiguration))

      public fun build():
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingActionProperty,
    ) : CdkObject(cdkObject), ScalingActionProperty {
      /**
       * Not available for instance groups.
       *
       * Instance groups use the market type specified for the group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-scalingaction.html#cfn-emr-instancegroupconfig-scalingaction-market)
       */
      override fun market(): String? = unwrap(this).getMarket()

      /**
       * The type of adjustment the automatic scaling activity makes when triggered, and the
       * periodicity of the adjustment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-scalingaction.html#cfn-emr-instancegroupconfig-scalingaction-simplescalingpolicyconfiguration)
       */
      override fun simpleScalingPolicyConfiguration(): Any =
          unwrap(this).getSimpleScalingPolicyConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScalingActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingActionProperty):
          ScalingActionProperty = CdkObjectWrappers.wrap(cdkObject) as? ScalingActionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalingActionProperty):
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingActionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingActionProperty
    }
  }

  /**
   * `ScalingConstraints` is a subproperty of the `AutoScalingPolicy` property type.
   *
   * `ScalingConstraints` defines the upper and lower EC2 instance limits for an automatic scaling
   * policy. Automatic scaling activities triggered by automatic scaling rules will not cause an
   * instance group to grow above or shrink below these limits.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.emr.*;
   * ScalingConstraintsProperty scalingConstraintsProperty = ScalingConstraintsProperty.builder()
   * .maxCapacity(123)
   * .minCapacity(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-scalingconstraints.html)
   */
  public interface ScalingConstraintsProperty {
    /**
     * The upper boundary of Amazon EC2 instances in an instance group beyond which scaling
     * activities are not allowed to grow.
     *
     * Scale-out activities will not add instances beyond this boundary.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-scalingconstraints.html#cfn-emr-instancegroupconfig-scalingconstraints-maxcapacity)
     */
    public fun maxCapacity(): Number

    /**
     * The lower boundary of Amazon EC2 instances in an instance group below which scaling
     * activities are not allowed to shrink.
     *
     * Scale-in activities will not terminate instances below this boundary.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-scalingconstraints.html#cfn-emr-instancegroupconfig-scalingconstraints-mincapacity)
     */
    public fun minCapacity(): Number

    /**
     * A builder for [ScalingConstraintsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxCapacity The upper boundary of Amazon EC2 instances in an instance group beyond
       * which scaling activities are not allowed to grow. 
       * Scale-out activities will not add instances beyond this boundary.
       */
      public fun maxCapacity(maxCapacity: Number)

      /**
       * @param minCapacity The lower boundary of Amazon EC2 instances in an instance group below
       * which scaling activities are not allowed to shrink. 
       * Scale-in activities will not terminate instances below this boundary.
       */
      public fun minCapacity(minCapacity: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingConstraintsProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingConstraintsProperty.builder()

      /**
       * @param maxCapacity The upper boundary of Amazon EC2 instances in an instance group beyond
       * which scaling activities are not allowed to grow. 
       * Scale-out activities will not add instances beyond this boundary.
       */
      override fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
      }

      /**
       * @param minCapacity The lower boundary of Amazon EC2 instances in an instance group below
       * which scaling activities are not allowed to shrink. 
       * Scale-in activities will not terminate instances below this boundary.
       */
      override fun minCapacity(minCapacity: Number) {
        cdkBuilder.minCapacity(minCapacity)
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingConstraintsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingConstraintsProperty,
    ) : CdkObject(cdkObject), ScalingConstraintsProperty {
      /**
       * The upper boundary of Amazon EC2 instances in an instance group beyond which scaling
       * activities are not allowed to grow.
       *
       * Scale-out activities will not add instances beyond this boundary.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-scalingconstraints.html#cfn-emr-instancegroupconfig-scalingconstraints-maxcapacity)
       */
      override fun maxCapacity(): Number = unwrap(this).getMaxCapacity()

      /**
       * The lower boundary of Amazon EC2 instances in an instance group below which scaling
       * activities are not allowed to shrink.
       *
       * Scale-in activities will not terminate instances below this boundary.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-scalingconstraints.html#cfn-emr-instancegroupconfig-scalingconstraints-mincapacity)
       */
      override fun minCapacity(): Number = unwrap(this).getMinCapacity()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScalingConstraintsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingConstraintsProperty):
          ScalingConstraintsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ScalingConstraintsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalingConstraintsProperty):
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingConstraintsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingConstraintsProperty
    }
  }

  /**
   * `ScalingRule` is a subproperty of the `AutoScalingPolicy` property type.
   *
   * `ScalingRule` defines the scale-in or scale-out rules for scaling activity, including the
   * CloudWatch metric alarm that triggers activity, how EC2 instances are added or removed, and the
   * periodicity of adjustments. The automatic scaling policy for an instance group can comprise one or
   * more automatic scaling rules.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.emr.*;
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
  public interface ScalingRuleProperty {
    /**
     * The conditions that trigger an automatic scaling activity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-scalingrule.html#cfn-emr-instancegroupconfig-scalingrule-action)
     */
    public fun action(): Any

    /**
     * A friendly, more verbose description of the automatic scaling rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-scalingrule.html#cfn-emr-instancegroupconfig-scalingrule-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * The name used to identify an automatic scaling rule.
     *
     * Rule names must be unique within a scaling policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-scalingrule.html#cfn-emr-instancegroupconfig-scalingrule-name)
     */
    public fun name(): String

    /**
     * The CloudWatch alarm definition that determines when automatic scaling activity is triggered.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-scalingrule.html#cfn-emr-instancegroupconfig-scalingrule-trigger)
     */
    public fun trigger(): Any

    /**
     * A builder for [ScalingRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param action The conditions that trigger an automatic scaling activity. 
       */
      public fun action(action: IResolvable)

      /**
       * @param action The conditions that trigger an automatic scaling activity. 
       */
      public fun action(action: ScalingActionProperty)

      /**
       * @param action The conditions that trigger an automatic scaling activity. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5be4adc4ad3b93edcb0dade3bf50215d364d7cebb6acaf9cb97a0ca0925400b5")
      public fun action(action: ScalingActionProperty.Builder.() -> Unit)

      /**
       * @param description A friendly, more verbose description of the automatic scaling rule.
       */
      public fun description(description: String)

      /**
       * @param name The name used to identify an automatic scaling rule. 
       * Rule names must be unique within a scaling policy.
       */
      public fun name(name: String)

      /**
       * @param trigger The CloudWatch alarm definition that determines when automatic scaling
       * activity is triggered. 
       */
      public fun trigger(trigger: IResolvable)

      /**
       * @param trigger The CloudWatch alarm definition that determines when automatic scaling
       * activity is triggered. 
       */
      public fun trigger(trigger: ScalingTriggerProperty)

      /**
       * @param trigger The CloudWatch alarm definition that determines when automatic scaling
       * activity is triggered. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e4d96ac0cbfebcef3807e3b8d913b449a32564081bed6cf769acd7a5902dc643")
      public fun trigger(trigger: ScalingTriggerProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingRuleProperty.Builder =
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingRuleProperty.builder()

      /**
       * @param action The conditions that trigger an automatic scaling activity. 
       */
      override fun action(action: IResolvable) {
        cdkBuilder.action(action.let(IResolvable::unwrap))
      }

      /**
       * @param action The conditions that trigger an automatic scaling activity. 
       */
      override fun action(action: ScalingActionProperty) {
        cdkBuilder.action(action.let(ScalingActionProperty::unwrap))
      }

      /**
       * @param action The conditions that trigger an automatic scaling activity. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5be4adc4ad3b93edcb0dade3bf50215d364d7cebb6acaf9cb97a0ca0925400b5")
      override fun action(action: ScalingActionProperty.Builder.() -> Unit): Unit =
          action(ScalingActionProperty(action))

      /**
       * @param description A friendly, more verbose description of the automatic scaling rule.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param name The name used to identify an automatic scaling rule. 
       * Rule names must be unique within a scaling policy.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param trigger The CloudWatch alarm definition that determines when automatic scaling
       * activity is triggered. 
       */
      override fun trigger(trigger: IResolvable) {
        cdkBuilder.trigger(trigger.let(IResolvable::unwrap))
      }

      /**
       * @param trigger The CloudWatch alarm definition that determines when automatic scaling
       * activity is triggered. 
       */
      override fun trigger(trigger: ScalingTriggerProperty) {
        cdkBuilder.trigger(trigger.let(ScalingTriggerProperty::unwrap))
      }

      /**
       * @param trigger The CloudWatch alarm definition that determines when automatic scaling
       * activity is triggered. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e4d96ac0cbfebcef3807e3b8d913b449a32564081bed6cf769acd7a5902dc643")
      override fun trigger(trigger: ScalingTriggerProperty.Builder.() -> Unit): Unit =
          trigger(ScalingTriggerProperty(trigger))

      public fun build():
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingRuleProperty,
    ) : CdkObject(cdkObject), ScalingRuleProperty {
      /**
       * The conditions that trigger an automatic scaling activity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-scalingrule.html#cfn-emr-instancegroupconfig-scalingrule-action)
       */
      override fun action(): Any = unwrap(this).getAction()

      /**
       * A friendly, more verbose description of the automatic scaling rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-scalingrule.html#cfn-emr-instancegroupconfig-scalingrule-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * The name used to identify an automatic scaling rule.
       *
       * Rule names must be unique within a scaling policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-scalingrule.html#cfn-emr-instancegroupconfig-scalingrule-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The CloudWatch alarm definition that determines when automatic scaling activity is
       * triggered.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-scalingrule.html#cfn-emr-instancegroupconfig-scalingrule-trigger)
       */
      override fun trigger(): Any = unwrap(this).getTrigger()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScalingRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingRuleProperty):
          ScalingRuleProperty = CdkObjectWrappers.wrap(cdkObject) as? ScalingRuleProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalingRuleProperty):
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingRuleProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingRuleProperty
    }
  }

  /**
   * `ScalingTrigger` is a subproperty of the `ScalingRule` property type.
   *
   * `ScalingTrigger` determines the conditions that trigger an automatic scaling activity.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.emr.*;
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
  public interface ScalingTriggerProperty {
    /**
     * The definition of a CloudWatch metric alarm.
     *
     * When the defined alarm conditions are met along with other trigger parameters, scaling
     * activity begins.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-scalingtrigger.html#cfn-emr-instancegroupconfig-scalingtrigger-cloudwatchalarmdefinition)
     */
    public fun cloudWatchAlarmDefinition(): Any

    /**
     * A builder for [ScalingTriggerProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cloudWatchAlarmDefinition The definition of a CloudWatch metric alarm. 
       * When the defined alarm conditions are met along with other trigger parameters, scaling
       * activity begins.
       */
      public fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: IResolvable)

      /**
       * @param cloudWatchAlarmDefinition The definition of a CloudWatch metric alarm. 
       * When the defined alarm conditions are met along with other trigger parameters, scaling
       * activity begins.
       */
      public
          fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: CloudWatchAlarmDefinitionProperty)

      /**
       * @param cloudWatchAlarmDefinition The definition of a CloudWatch metric alarm. 
       * When the defined alarm conditions are met along with other trigger parameters, scaling
       * activity begins.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("92cd633a19dd947577f74d812aa0c1d86eb6eeff63302bf3443be123681c8c74")
      public
          fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: CloudWatchAlarmDefinitionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingTriggerProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingTriggerProperty.builder()

      /**
       * @param cloudWatchAlarmDefinition The definition of a CloudWatch metric alarm. 
       * When the defined alarm conditions are met along with other trigger parameters, scaling
       * activity begins.
       */
      override fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: IResolvable) {
        cdkBuilder.cloudWatchAlarmDefinition(cloudWatchAlarmDefinition.let(IResolvable::unwrap))
      }

      /**
       * @param cloudWatchAlarmDefinition The definition of a CloudWatch metric alarm. 
       * When the defined alarm conditions are met along with other trigger parameters, scaling
       * activity begins.
       */
      override
          fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: CloudWatchAlarmDefinitionProperty) {
        cdkBuilder.cloudWatchAlarmDefinition(cloudWatchAlarmDefinition.let(CloudWatchAlarmDefinitionProperty::unwrap))
      }

      /**
       * @param cloudWatchAlarmDefinition The definition of a CloudWatch metric alarm. 
       * When the defined alarm conditions are met along with other trigger parameters, scaling
       * activity begins.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("92cd633a19dd947577f74d812aa0c1d86eb6eeff63302bf3443be123681c8c74")
      override
          fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: CloudWatchAlarmDefinitionProperty.Builder.() -> Unit):
          Unit =
          cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty(cloudWatchAlarmDefinition))

      public fun build():
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingTriggerProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingTriggerProperty,
    ) : CdkObject(cdkObject), ScalingTriggerProperty {
      /**
       * The definition of a CloudWatch metric alarm.
       *
       * When the defined alarm conditions are met along with other trigger parameters, scaling
       * activity begins.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-scalingtrigger.html#cfn-emr-instancegroupconfig-scalingtrigger-cloudwatchalarmdefinition)
       */
      override fun cloudWatchAlarmDefinition(): Any = unwrap(this).getCloudWatchAlarmDefinition()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScalingTriggerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingTriggerProperty):
          ScalingTriggerProperty = CdkObjectWrappers.wrap(cdkObject) as? ScalingTriggerProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalingTriggerProperty):
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingTriggerProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingTriggerProperty
    }
  }

  /**
   * `SimpleScalingPolicyConfiguration` is a subproperty of the `ScalingAction` property type.
   *
   * `SimpleScalingPolicyConfiguration` determines how an automatic scaling action adds or removes
   * instances, the cooldown period, and the number of EC2 instances that are added each time the
   * CloudWatch metric alarm condition is satisfied.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.emr.*;
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
  public interface SimpleScalingPolicyConfigurationProperty {
    /**
     * The way in which Amazon EC2 instances are added (if `ScalingAdjustment` is a positive number)
     * or terminated (if `ScalingAdjustment` is a negative number) each time the scaling activity is
     * triggered.
     *
     * `CHANGE_IN_CAPACITY` is the default. `CHANGE_IN_CAPACITY` indicates that the Amazon EC2
     * instance count increments or decrements by `ScalingAdjustment` , which should be expressed as an
     * integer. `PERCENT_CHANGE_IN_CAPACITY` indicates the instance count increments or decrements by
     * the percentage specified by `ScalingAdjustment` , which should be expressed as an integer. For
     * example, 20 indicates an increase in 20% increments of cluster capacity. `EXACT_CAPACITY`
     * indicates the scaling activity results in an instance group with the number of Amazon EC2
     * instances specified by `ScalingAdjustment` , which should be expressed as a positive integer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-simplescalingpolicyconfiguration.html#cfn-emr-instancegroupconfig-simplescalingpolicyconfiguration-adjustmenttype)
     */
    public fun adjustmentType(): String? = unwrap(this).getAdjustmentType()

    /**
     * The amount of time, in seconds, after a scaling activity completes before any further
     * trigger-related scaling activities can start.
     *
     * The default value is 0.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-simplescalingpolicyconfiguration.html#cfn-emr-instancegroupconfig-simplescalingpolicyconfiguration-cooldown)
     */
    public fun coolDown(): Number? = unwrap(this).getCoolDown()

    /**
     * The amount by which to scale in or scale out, based on the specified `AdjustmentType` .
     *
     * A positive value adds to the instance group's Amazon EC2 instance count while a negative
     * number removes instances. If `AdjustmentType` is set to `EXACT_CAPACITY` , the number should
     * only be a positive integer. If `AdjustmentType` is set to `PERCENT_CHANGE_IN_CAPACITY` , the
     * value should express the percentage as an integer. For example, -20 indicates a decrease in 20%
     * increments of cluster capacity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-simplescalingpolicyconfiguration.html#cfn-emr-instancegroupconfig-simplescalingpolicyconfiguration-scalingadjustment)
     */
    public fun scalingAdjustment(): Number

    /**
     * A builder for [SimpleScalingPolicyConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param adjustmentType The way in which Amazon EC2 instances are added (if
       * `ScalingAdjustment` is a positive number) or terminated (if `ScalingAdjustment` is a negative
       * number) each time the scaling activity is triggered.
       * `CHANGE_IN_CAPACITY` is the default. `CHANGE_IN_CAPACITY` indicates that the Amazon EC2
       * instance count increments or decrements by `ScalingAdjustment` , which should be expressed as
       * an integer. `PERCENT_CHANGE_IN_CAPACITY` indicates the instance count increments or decrements
       * by the percentage specified by `ScalingAdjustment` , which should be expressed as an integer.
       * For example, 20 indicates an increase in 20% increments of cluster capacity. `EXACT_CAPACITY`
       * indicates the scaling activity results in an instance group with the number of Amazon EC2
       * instances specified by `ScalingAdjustment` , which should be expressed as a positive integer.
       */
      public fun adjustmentType(adjustmentType: String)

      /**
       * @param coolDown The amount of time, in seconds, after a scaling activity completes before
       * any further trigger-related scaling activities can start.
       * The default value is 0.
       */
      public fun coolDown(coolDown: Number)

      /**
       * @param scalingAdjustment The amount by which to scale in or scale out, based on the
       * specified `AdjustmentType` . 
       * A positive value adds to the instance group's Amazon EC2 instance count while a negative
       * number removes instances. If `AdjustmentType` is set to `EXACT_CAPACITY` , the number should
       * only be a positive integer. If `AdjustmentType` is set to `PERCENT_CHANGE_IN_CAPACITY` , the
       * value should express the percentage as an integer. For example, -20 indicates a decrease in
       * 20% increments of cluster capacity.
       */
      public fun scalingAdjustment(scalingAdjustment: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.SimpleScalingPolicyConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.SimpleScalingPolicyConfigurationProperty.builder()

      /**
       * @param adjustmentType The way in which Amazon EC2 instances are added (if
       * `ScalingAdjustment` is a positive number) or terminated (if `ScalingAdjustment` is a negative
       * number) each time the scaling activity is triggered.
       * `CHANGE_IN_CAPACITY` is the default. `CHANGE_IN_CAPACITY` indicates that the Amazon EC2
       * instance count increments or decrements by `ScalingAdjustment` , which should be expressed as
       * an integer. `PERCENT_CHANGE_IN_CAPACITY` indicates the instance count increments or decrements
       * by the percentage specified by `ScalingAdjustment` , which should be expressed as an integer.
       * For example, 20 indicates an increase in 20% increments of cluster capacity. `EXACT_CAPACITY`
       * indicates the scaling activity results in an instance group with the number of Amazon EC2
       * instances specified by `ScalingAdjustment` , which should be expressed as a positive integer.
       */
      override fun adjustmentType(adjustmentType: String) {
        cdkBuilder.adjustmentType(adjustmentType)
      }

      /**
       * @param coolDown The amount of time, in seconds, after a scaling activity completes before
       * any further trigger-related scaling activities can start.
       * The default value is 0.
       */
      override fun coolDown(coolDown: Number) {
        cdkBuilder.coolDown(coolDown)
      }

      /**
       * @param scalingAdjustment The amount by which to scale in or scale out, based on the
       * specified `AdjustmentType` . 
       * A positive value adds to the instance group's Amazon EC2 instance count while a negative
       * number removes instances. If `AdjustmentType` is set to `EXACT_CAPACITY` , the number should
       * only be a positive integer. If `AdjustmentType` is set to `PERCENT_CHANGE_IN_CAPACITY` , the
       * value should express the percentage as an integer. For example, -20 indicates a decrease in
       * 20% increments of cluster capacity.
       */
      override fun scalingAdjustment(scalingAdjustment: Number) {
        cdkBuilder.scalingAdjustment(scalingAdjustment)
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.SimpleScalingPolicyConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.SimpleScalingPolicyConfigurationProperty,
    ) : CdkObject(cdkObject), SimpleScalingPolicyConfigurationProperty {
      /**
       * The way in which Amazon EC2 instances are added (if `ScalingAdjustment` is a positive
       * number) or terminated (if `ScalingAdjustment` is a negative number) each time the scaling
       * activity is triggered.
       *
       * `CHANGE_IN_CAPACITY` is the default. `CHANGE_IN_CAPACITY` indicates that the Amazon EC2
       * instance count increments or decrements by `ScalingAdjustment` , which should be expressed as
       * an integer. `PERCENT_CHANGE_IN_CAPACITY` indicates the instance count increments or decrements
       * by the percentage specified by `ScalingAdjustment` , which should be expressed as an integer.
       * For example, 20 indicates an increase in 20% increments of cluster capacity. `EXACT_CAPACITY`
       * indicates the scaling activity results in an instance group with the number of Amazon EC2
       * instances specified by `ScalingAdjustment` , which should be expressed as a positive integer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-simplescalingpolicyconfiguration.html#cfn-emr-instancegroupconfig-simplescalingpolicyconfiguration-adjustmenttype)
       */
      override fun adjustmentType(): String? = unwrap(this).getAdjustmentType()

      /**
       * The amount of time, in seconds, after a scaling activity completes before any further
       * trigger-related scaling activities can start.
       *
       * The default value is 0.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-simplescalingpolicyconfiguration.html#cfn-emr-instancegroupconfig-simplescalingpolicyconfiguration-cooldown)
       */
      override fun coolDown(): Number? = unwrap(this).getCoolDown()

      /**
       * The amount by which to scale in or scale out, based on the specified `AdjustmentType` .
       *
       * A positive value adds to the instance group's Amazon EC2 instance count while a negative
       * number removes instances. If `AdjustmentType` is set to `EXACT_CAPACITY` , the number should
       * only be a positive integer. If `AdjustmentType` is set to `PERCENT_CHANGE_IN_CAPACITY` , the
       * value should express the percentage as an integer. For example, -20 indicates a decrease in
       * 20% increments of cluster capacity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-simplescalingpolicyconfiguration.html#cfn-emr-instancegroupconfig-simplescalingpolicyconfiguration-scalingadjustment)
       */
      override fun scalingAdjustment(): Number = unwrap(this).getScalingAdjustment()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SimpleScalingPolicyConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.SimpleScalingPolicyConfigurationProperty):
          SimpleScalingPolicyConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SimpleScalingPolicyConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SimpleScalingPolicyConfigurationProperty):
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.SimpleScalingPolicyConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.SimpleScalingPolicyConfigurationProperty
    }
  }

  /**
   * `VolumeSpecification` is a subproperty of the `EbsBlockDeviceConfig` property type.
   *
   * `VolumeSecification` determines the volume type, IOPS, and size (GiB) for EBS volumes attached
   * to EC2 instances.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.emr.*;
   * VolumeSpecificationProperty volumeSpecificationProperty = VolumeSpecificationProperty.builder()
   * .sizeInGb(123)
   * .volumeType("volumeType")
   * // the properties below are optional
   * .iops(123)
   * .throughput(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-volumespecification.html)
   */
  public interface VolumeSpecificationProperty {
    /**
     * The number of I/O operations per second (IOPS) that the volume supports.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-volumespecification.html#cfn-emr-instancegroupconfig-volumespecification-iops)
     */
    public fun iops(): Number? = unwrap(this).getIops()

    /**
     * The volume size, in gibibytes (GiB).
     *
     * This can be a number from 1 - 1024. If the volume type is EBS-optimized, the minimum value is
     * 10.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-volumespecification.html#cfn-emr-instancegroupconfig-volumespecification-sizeingb)
     */
    public fun sizeInGb(): Number

    /**
     * The throughput, in mebibyte per second (MiB/s).
     *
     * This optional parameter can be a number from 125 - 1000 and is valid only for gp3 volumes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-volumespecification.html#cfn-emr-instancegroupconfig-volumespecification-throughput)
     */
    public fun throughput(): Number? = unwrap(this).getThroughput()

    /**
     * The volume type.
     *
     * Volume types supported are gp3, gp2, io1, st1, sc1, and standard.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-volumespecification.html#cfn-emr-instancegroupconfig-volumespecification-volumetype)
     */
    public fun volumeType(): String

    /**
     * A builder for [VolumeSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param iops The number of I/O operations per second (IOPS) that the volume supports.
       */
      public fun iops(iops: Number)

      /**
       * @param sizeInGb The volume size, in gibibytes (GiB). 
       * This can be a number from 1 - 1024. If the volume type is EBS-optimized, the minimum value
       * is 10.
       */
      public fun sizeInGb(sizeInGb: Number)

      /**
       * @param throughput The throughput, in mebibyte per second (MiB/s).
       * This optional parameter can be a number from 125 - 1000 and is valid only for gp3 volumes.
       */
      public fun throughput(throughput: Number)

      /**
       * @param volumeType The volume type. 
       * Volume types supported are gp3, gp2, io1, st1, sc1, and standard.
       */
      public fun volumeType(volumeType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.VolumeSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.VolumeSpecificationProperty.builder()

      /**
       * @param iops The number of I/O operations per second (IOPS) that the volume supports.
       */
      override fun iops(iops: Number) {
        cdkBuilder.iops(iops)
      }

      /**
       * @param sizeInGb The volume size, in gibibytes (GiB). 
       * This can be a number from 1 - 1024. If the volume type is EBS-optimized, the minimum value
       * is 10.
       */
      override fun sizeInGb(sizeInGb: Number) {
        cdkBuilder.sizeInGb(sizeInGb)
      }

      /**
       * @param throughput The throughput, in mebibyte per second (MiB/s).
       * This optional parameter can be a number from 125 - 1000 and is valid only for gp3 volumes.
       */
      override fun throughput(throughput: Number) {
        cdkBuilder.throughput(throughput)
      }

      /**
       * @param volumeType The volume type. 
       * Volume types supported are gp3, gp2, io1, st1, sc1, and standard.
       */
      override fun volumeType(volumeType: String) {
        cdkBuilder.volumeType(volumeType)
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.VolumeSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.VolumeSpecificationProperty,
    ) : CdkObject(cdkObject), VolumeSpecificationProperty {
      /**
       * The number of I/O operations per second (IOPS) that the volume supports.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-volumespecification.html#cfn-emr-instancegroupconfig-volumespecification-iops)
       */
      override fun iops(): Number? = unwrap(this).getIops()

      /**
       * The volume size, in gibibytes (GiB).
       *
       * This can be a number from 1 - 1024. If the volume type is EBS-optimized, the minimum value
       * is 10.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-volumespecification.html#cfn-emr-instancegroupconfig-volumespecification-sizeingb)
       */
      override fun sizeInGb(): Number = unwrap(this).getSizeInGb()

      /**
       * The throughput, in mebibyte per second (MiB/s).
       *
       * This optional parameter can be a number from 125 - 1000 and is valid only for gp3 volumes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-volumespecification.html#cfn-emr-instancegroupconfig-volumespecification-throughput)
       */
      override fun throughput(): Number? = unwrap(this).getThroughput()

      /**
       * The volume type.
       *
       * Volume types supported are gp3, gp2, io1, st1, sc1, and standard.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-volumespecification.html#cfn-emr-instancegroupconfig-volumespecification-volumetype)
       */
      override fun volumeType(): String = unwrap(this).getVolumeType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VolumeSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.VolumeSpecificationProperty):
          VolumeSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          VolumeSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VolumeSpecificationProperty):
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.VolumeSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.VolumeSpecificationProperty
    }
  }
}
