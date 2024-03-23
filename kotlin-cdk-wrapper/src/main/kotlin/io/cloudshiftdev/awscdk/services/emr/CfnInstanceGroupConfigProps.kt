@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.emr

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnInstanceGroupConfig`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.emr.*;
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
public interface CfnInstanceGroupConfigProps {
  /**
   * `AutoScalingPolicy` is a subproperty of `InstanceGroupConfig` .
   *
   * `AutoScalingPolicy` defines how an instance group dynamically adds and terminates EC2 instances
   * in response to the value of a CloudWatch metric. For more information, see [Using Automatic
   * Scaling in Amazon
   * EMR](https://docs.aws.amazon.com//emr/latest/ManagementGuide/emr-automatic-scaling.html) in the
   * *Amazon EMR Management Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-autoscalingpolicy)
   */
  public fun autoScalingPolicy(): Any? = unwrap(this).getAutoScalingPolicy()

  /**
   * If specified, indicates that the instance group uses Spot Instances.
   *
   * This is the maximum price you are willing to pay for Spot Instances. Specify `OnDemandPrice` to
   * set the amount equal to the On-Demand price, or specify an amount in USD.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-bidprice)
   */
  public fun bidPrice(): String? = unwrap(this).getBidPrice()

  /**
   * Amazon EMR releases 4.x or later.
   *
   * The list of configurations supplied for an Amazon EMR cluster instance group. You can specify a
   * separate configuration for each instance group (master, core, and task).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-configurations)
   */
  public fun configurations(): Any? = unwrap(this).getConfigurations()

  /**
   * The custom AMI ID to use for the provisioned instance group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-customamiid)
   */
  public fun customAmiId(): String? = unwrap(this).getCustomAmiId()

  /**
   * `EbsConfiguration` determines the EBS volumes to attach to EMR cluster instances.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-ebsconfiguration)
   */
  public fun ebsConfiguration(): Any? = unwrap(this).getEbsConfiguration()

  /**
   * Target number of instances for the instance group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-instancecount)
   */
  public fun instanceCount(): Number

  /**
   * The role of the instance group in the cluster.
   *
   * *Allowed Values* : TASK
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-instancerole)
   */
  public fun instanceRole(): String

  /**
   * The Amazon EC2 instance type for all instances in the instance group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-instancetype)
   */
  public fun instanceType(): String

  /**
   * The ID of an Amazon EMR cluster that you want to associate this instance group with.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-jobflowid)
   */
  public fun jobFlowId(): String

  /**
   * Market type of the Amazon EC2 instances used to create a cluster node.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-market)
   */
  public fun market(): String? = unwrap(this).getMarket()

  /**
   * Friendly name given to the instance group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * A builder for [CfnInstanceGroupConfigProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param autoScalingPolicy `AutoScalingPolicy` is a subproperty of `InstanceGroupConfig` .
     * `AutoScalingPolicy` defines how an instance group dynamically adds and terminates EC2
     * instances in response to the value of a CloudWatch metric. For more information, see [Using
     * Automatic Scaling in Amazon
     * EMR](https://docs.aws.amazon.com//emr/latest/ManagementGuide/emr-automatic-scaling.html) in the
     * *Amazon EMR Management Guide* .
     */
    public fun autoScalingPolicy(autoScalingPolicy: IResolvable)

    /**
     * @param autoScalingPolicy `AutoScalingPolicy` is a subproperty of `InstanceGroupConfig` .
     * `AutoScalingPolicy` defines how an instance group dynamically adds and terminates EC2
     * instances in response to the value of a CloudWatch metric. For more information, see [Using
     * Automatic Scaling in Amazon
     * EMR](https://docs.aws.amazon.com//emr/latest/ManagementGuide/emr-automatic-scaling.html) in the
     * *Amazon EMR Management Guide* .
     */
    public
        fun autoScalingPolicy(autoScalingPolicy: CfnInstanceGroupConfig.AutoScalingPolicyProperty)

    /**
     * @param autoScalingPolicy `AutoScalingPolicy` is a subproperty of `InstanceGroupConfig` .
     * `AutoScalingPolicy` defines how an instance group dynamically adds and terminates EC2
     * instances in response to the value of a CloudWatch metric. For more information, see [Using
     * Automatic Scaling in Amazon
     * EMR](https://docs.aws.amazon.com//emr/latest/ManagementGuide/emr-automatic-scaling.html) in the
     * *Amazon EMR Management Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0c77469ce0a8910e5660e4e7165b7a702421295111d465a666f7e13b46ac2f56")
    public
        fun autoScalingPolicy(autoScalingPolicy: CfnInstanceGroupConfig.AutoScalingPolicyProperty.Builder.() -> Unit)

    /**
     * @param bidPrice If specified, indicates that the instance group uses Spot Instances.
     * This is the maximum price you are willing to pay for Spot Instances. Specify `OnDemandPrice`
     * to set the amount equal to the On-Demand price, or specify an amount in USD.
     */
    public fun bidPrice(bidPrice: String)

    /**
     * @param configurations Amazon EMR releases 4.x or later.
     * The list of configurations supplied for an Amazon EMR cluster instance group. You can specify
     * a separate configuration for each instance group (master, core, and task).
     */
    public fun configurations(configurations: IResolvable)

    /**
     * @param configurations Amazon EMR releases 4.x or later.
     * The list of configurations supplied for an Amazon EMR cluster instance group. You can specify
     * a separate configuration for each instance group (master, core, and task).
     */
    public fun configurations(configurations: List<Any>)

    /**
     * @param configurations Amazon EMR releases 4.x or later.
     * The list of configurations supplied for an Amazon EMR cluster instance group. You can specify
     * a separate configuration for each instance group (master, core, and task).
     */
    public fun configurations(vararg configurations: Any)

    /**
     * @param customAmiId The custom AMI ID to use for the provisioned instance group.
     */
    public fun customAmiId(customAmiId: String)

    /**
     * @param ebsConfiguration `EbsConfiguration` determines the EBS volumes to attach to EMR
     * cluster instances.
     */
    public fun ebsConfiguration(ebsConfiguration: IResolvable)

    /**
     * @param ebsConfiguration `EbsConfiguration` determines the EBS volumes to attach to EMR
     * cluster instances.
     */
    public fun ebsConfiguration(ebsConfiguration: CfnInstanceGroupConfig.EbsConfigurationProperty)

    /**
     * @param ebsConfiguration `EbsConfiguration` determines the EBS volumes to attach to EMR
     * cluster instances.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1237a96e8a338e38523c58a7a4468de8e20eea902b7f50c54927bb9611523942")
    public
        fun ebsConfiguration(ebsConfiguration: CfnInstanceGroupConfig.EbsConfigurationProperty.Builder.() -> Unit)

    /**
     * @param instanceCount Target number of instances for the instance group. 
     */
    public fun instanceCount(instanceCount: Number)

    /**
     * @param instanceRole The role of the instance group in the cluster. 
     * *Allowed Values* : TASK
     */
    public fun instanceRole(instanceRole: String)

    /**
     * @param instanceType The Amazon EC2 instance type for all instances in the instance group. 
     */
    public fun instanceType(instanceType: String)

    /**
     * @param jobFlowId The ID of an Amazon EMR cluster that you want to associate this instance
     * group with. 
     */
    public fun jobFlowId(jobFlowId: String)

    /**
     * @param market Market type of the Amazon EC2 instances used to create a cluster node.
     */
    public fun market(market: String)

    /**
     * @param name Friendly name given to the instance group.
     */
    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.emr.CfnInstanceGroupConfigProps.Builder
        = software.amazon.awscdk.services.emr.CfnInstanceGroupConfigProps.builder()

    /**
     * @param autoScalingPolicy `AutoScalingPolicy` is a subproperty of `InstanceGroupConfig` .
     * `AutoScalingPolicy` defines how an instance group dynamically adds and terminates EC2
     * instances in response to the value of a CloudWatch metric. For more information, see [Using
     * Automatic Scaling in Amazon
     * EMR](https://docs.aws.amazon.com//emr/latest/ManagementGuide/emr-automatic-scaling.html) in the
     * *Amazon EMR Management Guide* .
     */
    override fun autoScalingPolicy(autoScalingPolicy: IResolvable) {
      cdkBuilder.autoScalingPolicy(autoScalingPolicy.let(IResolvable::unwrap))
    }

    /**
     * @param autoScalingPolicy `AutoScalingPolicy` is a subproperty of `InstanceGroupConfig` .
     * `AutoScalingPolicy` defines how an instance group dynamically adds and terminates EC2
     * instances in response to the value of a CloudWatch metric. For more information, see [Using
     * Automatic Scaling in Amazon
     * EMR](https://docs.aws.amazon.com//emr/latest/ManagementGuide/emr-automatic-scaling.html) in the
     * *Amazon EMR Management Guide* .
     */
    override
        fun autoScalingPolicy(autoScalingPolicy: CfnInstanceGroupConfig.AutoScalingPolicyProperty) {
      cdkBuilder.autoScalingPolicy(autoScalingPolicy.let(CfnInstanceGroupConfig.AutoScalingPolicyProperty::unwrap))
    }

    /**
     * @param autoScalingPolicy `AutoScalingPolicy` is a subproperty of `InstanceGroupConfig` .
     * `AutoScalingPolicy` defines how an instance group dynamically adds and terminates EC2
     * instances in response to the value of a CloudWatch metric. For more information, see [Using
     * Automatic Scaling in Amazon
     * EMR](https://docs.aws.amazon.com//emr/latest/ManagementGuide/emr-automatic-scaling.html) in the
     * *Amazon EMR Management Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0c77469ce0a8910e5660e4e7165b7a702421295111d465a666f7e13b46ac2f56")
    override
        fun autoScalingPolicy(autoScalingPolicy: CfnInstanceGroupConfig.AutoScalingPolicyProperty.Builder.() -> Unit):
        Unit =
        autoScalingPolicy(CfnInstanceGroupConfig.AutoScalingPolicyProperty(autoScalingPolicy))

    /**
     * @param bidPrice If specified, indicates that the instance group uses Spot Instances.
     * This is the maximum price you are willing to pay for Spot Instances. Specify `OnDemandPrice`
     * to set the amount equal to the On-Demand price, or specify an amount in USD.
     */
    override fun bidPrice(bidPrice: String) {
      cdkBuilder.bidPrice(bidPrice)
    }

    /**
     * @param configurations Amazon EMR releases 4.x or later.
     * The list of configurations supplied for an Amazon EMR cluster instance group. You can specify
     * a separate configuration for each instance group (master, core, and task).
     */
    override fun configurations(configurations: IResolvable) {
      cdkBuilder.configurations(configurations.let(IResolvable::unwrap))
    }

    /**
     * @param configurations Amazon EMR releases 4.x or later.
     * The list of configurations supplied for an Amazon EMR cluster instance group. You can specify
     * a separate configuration for each instance group (master, core, and task).
     */
    override fun configurations(configurations: List<Any>) {
      cdkBuilder.configurations(configurations)
    }

    /**
     * @param configurations Amazon EMR releases 4.x or later.
     * The list of configurations supplied for an Amazon EMR cluster instance group. You can specify
     * a separate configuration for each instance group (master, core, and task).
     */
    override fun configurations(vararg configurations: Any): Unit =
        configurations(configurations.toList())

    /**
     * @param customAmiId The custom AMI ID to use for the provisioned instance group.
     */
    override fun customAmiId(customAmiId: String) {
      cdkBuilder.customAmiId(customAmiId)
    }

    /**
     * @param ebsConfiguration `EbsConfiguration` determines the EBS volumes to attach to EMR
     * cluster instances.
     */
    override fun ebsConfiguration(ebsConfiguration: IResolvable) {
      cdkBuilder.ebsConfiguration(ebsConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param ebsConfiguration `EbsConfiguration` determines the EBS volumes to attach to EMR
     * cluster instances.
     */
    override
        fun ebsConfiguration(ebsConfiguration: CfnInstanceGroupConfig.EbsConfigurationProperty) {
      cdkBuilder.ebsConfiguration(ebsConfiguration.let(CfnInstanceGroupConfig.EbsConfigurationProperty::unwrap))
    }

    /**
     * @param ebsConfiguration `EbsConfiguration` determines the EBS volumes to attach to EMR
     * cluster instances.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1237a96e8a338e38523c58a7a4468de8e20eea902b7f50c54927bb9611523942")
    override
        fun ebsConfiguration(ebsConfiguration: CfnInstanceGroupConfig.EbsConfigurationProperty.Builder.() -> Unit):
        Unit = ebsConfiguration(CfnInstanceGroupConfig.EbsConfigurationProperty(ebsConfiguration))

    /**
     * @param instanceCount Target number of instances for the instance group. 
     */
    override fun instanceCount(instanceCount: Number) {
      cdkBuilder.instanceCount(instanceCount)
    }

    /**
     * @param instanceRole The role of the instance group in the cluster. 
     * *Allowed Values* : TASK
     */
    override fun instanceRole(instanceRole: String) {
      cdkBuilder.instanceRole(instanceRole)
    }

    /**
     * @param instanceType The Amazon EC2 instance type for all instances in the instance group. 
     */
    override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    /**
     * @param jobFlowId The ID of an Amazon EMR cluster that you want to associate this instance
     * group with. 
     */
    override fun jobFlowId(jobFlowId: String) {
      cdkBuilder.jobFlowId(jobFlowId)
    }

    /**
     * @param market Market type of the Amazon EC2 instances used to create a cluster node.
     */
    override fun market(market: String) {
      cdkBuilder.market(market)
    }

    /**
     * @param name Friendly name given to the instance group.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.emr.CfnInstanceGroupConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.emr.CfnInstanceGroupConfigProps,
  ) : CdkObject(cdkObject), CfnInstanceGroupConfigProps {
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
     */
    override fun autoScalingPolicy(): Any? = unwrap(this).getAutoScalingPolicy()

    /**
     * If specified, indicates that the instance group uses Spot Instances.
     *
     * This is the maximum price you are willing to pay for Spot Instances. Specify `OnDemandPrice`
     * to set the amount equal to the On-Demand price, or specify an amount in USD.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-bidprice)
     */
    override fun bidPrice(): String? = unwrap(this).getBidPrice()

    /**
     * Amazon EMR releases 4.x or later.
     *
     * The list of configurations supplied for an Amazon EMR cluster instance group. You can specify
     * a separate configuration for each instance group (master, core, and task).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-configurations)
     */
    override fun configurations(): Any? = unwrap(this).getConfigurations()

    /**
     * The custom AMI ID to use for the provisioned instance group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-customamiid)
     */
    override fun customAmiId(): String? = unwrap(this).getCustomAmiId()

    /**
     * `EbsConfiguration` determines the EBS volumes to attach to EMR cluster instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-ebsconfiguration)
     */
    override fun ebsConfiguration(): Any? = unwrap(this).getEbsConfiguration()

    /**
     * Target number of instances for the instance group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-instancecount)
     */
    override fun instanceCount(): Number = unwrap(this).getInstanceCount()

    /**
     * The role of the instance group in the cluster.
     *
     * *Allowed Values* : TASK
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-instancerole)
     */
    override fun instanceRole(): String = unwrap(this).getInstanceRole()

    /**
     * The Amazon EC2 instance type for all instances in the instance group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-instancetype)
     */
    override fun instanceType(): String = unwrap(this).getInstanceType()

    /**
     * The ID of an Amazon EMR cluster that you want to associate this instance group with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-jobflowid)
     */
    override fun jobFlowId(): String = unwrap(this).getJobFlowId()

    /**
     * Market type of the Amazon EC2 instances used to create a cluster node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-market)
     */
    override fun market(): String? = unwrap(this).getMarket()

    /**
     * Friendly name given to the instance group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-name)
     */
    override fun name(): String? = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnInstanceGroupConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceGroupConfigProps):
        CfnInstanceGroupConfigProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnInstanceGroupConfigProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInstanceGroupConfigProps):
        software.amazon.awscdk.services.emr.CfnInstanceGroupConfigProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.emr.CfnInstanceGroupConfigProps
  }
}
