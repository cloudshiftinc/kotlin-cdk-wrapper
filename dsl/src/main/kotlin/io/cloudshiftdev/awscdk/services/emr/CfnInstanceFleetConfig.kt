package io.cloudshiftdev.awscdk.services.emr

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnInstanceFleetConfig internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.emr.CfnInstanceFleetConfig,
) : CfnResource(cdkObject), IInspectable {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The unique identifier of the EMR cluster.
   */
  public open fun clusterId(): String = unwrap(this).getClusterId()

  /**
   * The unique identifier of the EMR cluster.
   */
  public open fun clusterId(`value`: String) {
    unwrap(this).setClusterId(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The node type that the instance fleet hosts.
   */
  public open fun instanceFleetType(): String = unwrap(this).getInstanceFleetType()

  /**
   * The node type that the instance fleet hosts.
   */
  public open fun instanceFleetType(`value`: String) {
    unwrap(this).setInstanceFleetType(`value`)
  }

  /**
   * `InstanceTypeConfigs` determine the EC2 instances that Amazon EMR attempts to provision to
   * fulfill On-Demand and Spot target capacities.
   */
  public open fun instanceTypeConfigs(): Any? = unwrap(this).getInstanceTypeConfigs()

  /**
   * `InstanceTypeConfigs` determine the EC2 instances that Amazon EMR attempts to provision to
   * fulfill On-Demand and Spot target capacities.
   */
  public open fun instanceTypeConfigs(`value`: IResolvable) {
    unwrap(this).setInstanceTypeConfigs(`value`.let(IResolvable::unwrap))
  }

  /**
   * `InstanceTypeConfigs` determine the EC2 instances that Amazon EMR attempts to provision to
   * fulfill On-Demand and Spot target capacities.
   */
  public open fun instanceTypeConfigs(__idx_ac66f0: List<Any>) {
    unwrap(this).setInstanceTypeConfigs(__idx_ac66f0)
  }

  /**
   * `InstanceTypeConfigs` determine the EC2 instances that Amazon EMR attempts to provision to
   * fulfill On-Demand and Spot target capacities.
   */
  public open fun instanceTypeConfigs(vararg __idx_ac66f0: Any): Unit =
      instanceTypeConfigs(__idx_ac66f0.toList())

  /**
   * The launch specification for the instance fleet.
   */
  public open fun launchSpecifications(): Any? = unwrap(this).getLaunchSpecifications()

  /**
   * The launch specification for the instance fleet.
   */
  public open fun launchSpecifications(`value`: IResolvable) {
    unwrap(this).setLaunchSpecifications(`value`.let(IResolvable::unwrap))
  }

  /**
   * The launch specification for the instance fleet.
   */
  public open fun launchSpecifications(`value`: InstanceFleetProvisioningSpecificationsProperty) {
    unwrap(this).setLaunchSpecifications(`value`.let(InstanceFleetProvisioningSpecificationsProperty::unwrap))
  }

  /**
   * The launch specification for the instance fleet.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("59463fc90141d3db0594e562d25534fc10970df80ba58a791c6e74504ce572c3")
  public open
      fun launchSpecifications(`value`: InstanceFleetProvisioningSpecificationsProperty.Builder.() -> Unit):
      Unit = launchSpecifications(InstanceFleetProvisioningSpecificationsProperty(`value`))

  /**
   * The friendly name of the instance fleet.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The friendly name of the instance fleet.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The target capacity of On-Demand units for the instance fleet, which determines how many
   * On-Demand instances to provision.
   */
  public open fun targetOnDemandCapacity(): Number? = unwrap(this).getTargetOnDemandCapacity()

  /**
   * The target capacity of On-Demand units for the instance fleet, which determines how many
   * On-Demand instances to provision.
   */
  public open fun targetOnDemandCapacity(`value`: Number) {
    unwrap(this).setTargetOnDemandCapacity(`value`)
  }

  /**
   * The target capacity of Spot units for the instance fleet, which determines how many Spot
   * instances to provision.
   */
  public open fun targetSpotCapacity(): Number? = unwrap(this).getTargetSpotCapacity()

  /**
   * The target capacity of Spot units for the instance fleet, which determines how many Spot
   * instances to provision.
   */
  public open fun targetSpotCapacity(`value`: Number) {
    unwrap(this).setTargetSpotCapacity(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.emr.CfnInstanceFleetConfig].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The unique identifier of the EMR cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancefleetconfig.html#cfn-emr-instancefleetconfig-clusterid)
     * @param clusterId The unique identifier of the EMR cluster. 
     */
    public fun clusterId(clusterId: String)

    /**
     * The node type that the instance fleet hosts.
     *
     * *Allowed Values* : TASK
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancefleetconfig.html#cfn-emr-instancefleetconfig-instancefleettype)
     * @param instanceFleetType The node type that the instance fleet hosts. 
     */
    public fun instanceFleetType(instanceFleetType: String)

    /**
     * `InstanceTypeConfigs` determine the EC2 instances that Amazon EMR attempts to provision to
     * fulfill On-Demand and Spot target capacities.
     *
     *
     * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later,
     * excluding 5.0.x versions.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancefleetconfig.html#cfn-emr-instancefleetconfig-instancetypeconfigs)
     * @param instanceTypeConfigs `InstanceTypeConfigs` determine the EC2 instances that Amazon EMR
     * attempts to provision to fulfill On-Demand and Spot target capacities. 
     */
    public fun instanceTypeConfigs(instanceTypeConfigs: IResolvable)

    /**
     * `InstanceTypeConfigs` determine the EC2 instances that Amazon EMR attempts to provision to
     * fulfill On-Demand and Spot target capacities.
     *
     *
     * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later,
     * excluding 5.0.x versions.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancefleetconfig.html#cfn-emr-instancefleetconfig-instancetypeconfigs)
     * @param instanceTypeConfigs `InstanceTypeConfigs` determine the EC2 instances that Amazon EMR
     * attempts to provision to fulfill On-Demand and Spot target capacities. 
     */
    public fun instanceTypeConfigs(instanceTypeConfigs: List<Any>)

    /**
     * `InstanceTypeConfigs` determine the EC2 instances that Amazon EMR attempts to provision to
     * fulfill On-Demand and Spot target capacities.
     *
     *
     * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later,
     * excluding 5.0.x versions.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancefleetconfig.html#cfn-emr-instancefleetconfig-instancetypeconfigs)
     * @param instanceTypeConfigs `InstanceTypeConfigs` determine the EC2 instances that Amazon EMR
     * attempts to provision to fulfill On-Demand and Spot target capacities. 
     */
    public fun instanceTypeConfigs(vararg instanceTypeConfigs: Any)

    /**
     * The launch specification for the instance fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancefleetconfig.html#cfn-emr-instancefleetconfig-launchspecifications)
     * @param launchSpecifications The launch specification for the instance fleet. 
     */
    public fun launchSpecifications(launchSpecifications: IResolvable)

    /**
     * The launch specification for the instance fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancefleetconfig.html#cfn-emr-instancefleetconfig-launchspecifications)
     * @param launchSpecifications The launch specification for the instance fleet. 
     */
    public
        fun launchSpecifications(launchSpecifications: InstanceFleetProvisioningSpecificationsProperty)

    /**
     * The launch specification for the instance fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancefleetconfig.html#cfn-emr-instancefleetconfig-launchspecifications)
     * @param launchSpecifications The launch specification for the instance fleet. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3f74ea9b1d554ae601b9ffdba85400e95b5dba44cb815f9838f8e9d46262fd9")
    public
        fun launchSpecifications(launchSpecifications: InstanceFleetProvisioningSpecificationsProperty.Builder.() -> Unit)

    /**
     * The friendly name of the instance fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancefleetconfig.html#cfn-emr-instancefleetconfig-name)
     * @param name The friendly name of the instance fleet. 
     */
    public fun name(name: String)

    /**
     * The target capacity of On-Demand units for the instance fleet, which determines how many
     * On-Demand instances to provision.
     *
     * When the instance fleet launches, Amazon EMR tries to provision On-Demand instances as
     * specified by `InstanceTypeConfig` . Each instance configuration has a specified
     * `WeightedCapacity` . When an On-Demand instance is provisioned, the `WeightedCapacity` units
     * count toward the target capacity. Amazon EMR provisions instances until the target capacity is
     * totally fulfilled, even if this results in an overage. For example, if there are 2 units
     * remaining to fulfill capacity, and Amazon EMR can only provision an instance with a
     * `WeightedCapacity` of 5 units, the instance is provisioned, and the target capacity is exceeded
     * by 3 units.
     *
     *
     * If not specified or set to 0, only Spot instances are provisioned for the instance fleet
     * using `TargetSpotCapacity` . At least one of `TargetSpotCapacity` and `TargetOnDemandCapacity`
     * should be greater than 0. For a master instance fleet, only one of `TargetSpotCapacity` and
     * `TargetOnDemandCapacity` can be specified, and its value must be 1.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancefleetconfig.html#cfn-emr-instancefleetconfig-targetondemandcapacity)
     * @param targetOnDemandCapacity The target capacity of On-Demand units for the instance fleet,
     * which determines how many On-Demand instances to provision. 
     */
    public fun targetOnDemandCapacity(targetOnDemandCapacity: Number)

    /**
     * The target capacity of Spot units for the instance fleet, which determines how many Spot
     * instances to provision.
     *
     * When the instance fleet launches, Amazon EMR tries to provision Spot instances as specified
     * by `InstanceTypeConfig` . Each instance configuration has a specified `WeightedCapacity` . When
     * a Spot instance is provisioned, the `WeightedCapacity` units count toward the target capacity.
     * Amazon EMR provisions instances until the target capacity is totally fulfilled, even if this
     * results in an overage. For example, if there are 2 units remaining to fulfill capacity, and
     * Amazon EMR can only provision an instance with a `WeightedCapacity` of 5 units, the instance is
     * provisioned, and the target capacity is exceeded by 3 units.
     *
     *
     * If not specified or set to 0, only On-Demand instances are provisioned for the instance
     * fleet. At least one of `TargetSpotCapacity` and `TargetOnDemandCapacity` should be greater than
     * 0. For a master instance fleet, only one of `TargetSpotCapacity` and `TargetOnDemandCapacity`
     * can be specified, and its value must be 1.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancefleetconfig.html#cfn-emr-instancefleetconfig-targetspotcapacity)
     * @param targetSpotCapacity The target capacity of Spot units for the instance fleet, which
     * determines how many Spot instances to provision. 
     */
    public fun targetSpotCapacity(targetSpotCapacity: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.Builder =
        software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.Builder.create(scope, id)

    /**
     * The unique identifier of the EMR cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancefleetconfig.html#cfn-emr-instancefleetconfig-clusterid)
     * @param clusterId The unique identifier of the EMR cluster. 
     */
    override fun clusterId(clusterId: String) {
      cdkBuilder.clusterId(clusterId)
    }

    /**
     * The node type that the instance fleet hosts.
     *
     * *Allowed Values* : TASK
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancefleetconfig.html#cfn-emr-instancefleetconfig-instancefleettype)
     * @param instanceFleetType The node type that the instance fleet hosts. 
     */
    override fun instanceFleetType(instanceFleetType: String) {
      cdkBuilder.instanceFleetType(instanceFleetType)
    }

    /**
     * `InstanceTypeConfigs` determine the EC2 instances that Amazon EMR attempts to provision to
     * fulfill On-Demand and Spot target capacities.
     *
     *
     * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later,
     * excluding 5.0.x versions.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancefleetconfig.html#cfn-emr-instancefleetconfig-instancetypeconfigs)
     * @param instanceTypeConfigs `InstanceTypeConfigs` determine the EC2 instances that Amazon EMR
     * attempts to provision to fulfill On-Demand and Spot target capacities. 
     */
    override fun instanceTypeConfigs(instanceTypeConfigs: IResolvable) {
      cdkBuilder.instanceTypeConfigs(instanceTypeConfigs.let(IResolvable::unwrap))
    }

    /**
     * `InstanceTypeConfigs` determine the EC2 instances that Amazon EMR attempts to provision to
     * fulfill On-Demand and Spot target capacities.
     *
     *
     * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later,
     * excluding 5.0.x versions.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancefleetconfig.html#cfn-emr-instancefleetconfig-instancetypeconfigs)
     * @param instanceTypeConfigs `InstanceTypeConfigs` determine the EC2 instances that Amazon EMR
     * attempts to provision to fulfill On-Demand and Spot target capacities. 
     */
    override fun instanceTypeConfigs(instanceTypeConfigs: List<Any>) {
      cdkBuilder.instanceTypeConfigs(instanceTypeConfigs)
    }

    /**
     * `InstanceTypeConfigs` determine the EC2 instances that Amazon EMR attempts to provision to
     * fulfill On-Demand and Spot target capacities.
     *
     *
     * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later,
     * excluding 5.0.x versions.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancefleetconfig.html#cfn-emr-instancefleetconfig-instancetypeconfigs)
     * @param instanceTypeConfigs `InstanceTypeConfigs` determine the EC2 instances that Amazon EMR
     * attempts to provision to fulfill On-Demand and Spot target capacities. 
     */
    override fun instanceTypeConfigs(vararg instanceTypeConfigs: Any): Unit =
        instanceTypeConfigs(instanceTypeConfigs.toList())

    /**
     * The launch specification for the instance fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancefleetconfig.html#cfn-emr-instancefleetconfig-launchspecifications)
     * @param launchSpecifications The launch specification for the instance fleet. 
     */
    override fun launchSpecifications(launchSpecifications: IResolvable) {
      cdkBuilder.launchSpecifications(launchSpecifications.let(IResolvable::unwrap))
    }

    /**
     * The launch specification for the instance fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancefleetconfig.html#cfn-emr-instancefleetconfig-launchspecifications)
     * @param launchSpecifications The launch specification for the instance fleet. 
     */
    override
        fun launchSpecifications(launchSpecifications: InstanceFleetProvisioningSpecificationsProperty) {
      cdkBuilder.launchSpecifications(launchSpecifications.let(InstanceFleetProvisioningSpecificationsProperty::unwrap))
    }

    /**
     * The launch specification for the instance fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancefleetconfig.html#cfn-emr-instancefleetconfig-launchspecifications)
     * @param launchSpecifications The launch specification for the instance fleet. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3f74ea9b1d554ae601b9ffdba85400e95b5dba44cb815f9838f8e9d46262fd9")
    override
        fun launchSpecifications(launchSpecifications: InstanceFleetProvisioningSpecificationsProperty.Builder.() -> Unit):
        Unit =
        launchSpecifications(InstanceFleetProvisioningSpecificationsProperty(launchSpecifications))

    /**
     * The friendly name of the instance fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancefleetconfig.html#cfn-emr-instancefleetconfig-name)
     * @param name The friendly name of the instance fleet. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The target capacity of On-Demand units for the instance fleet, which determines how many
     * On-Demand instances to provision.
     *
     * When the instance fleet launches, Amazon EMR tries to provision On-Demand instances as
     * specified by `InstanceTypeConfig` . Each instance configuration has a specified
     * `WeightedCapacity` . When an On-Demand instance is provisioned, the `WeightedCapacity` units
     * count toward the target capacity. Amazon EMR provisions instances until the target capacity is
     * totally fulfilled, even if this results in an overage. For example, if there are 2 units
     * remaining to fulfill capacity, and Amazon EMR can only provision an instance with a
     * `WeightedCapacity` of 5 units, the instance is provisioned, and the target capacity is exceeded
     * by 3 units.
     *
     *
     * If not specified or set to 0, only Spot instances are provisioned for the instance fleet
     * using `TargetSpotCapacity` . At least one of `TargetSpotCapacity` and `TargetOnDemandCapacity`
     * should be greater than 0. For a master instance fleet, only one of `TargetSpotCapacity` and
     * `TargetOnDemandCapacity` can be specified, and its value must be 1.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancefleetconfig.html#cfn-emr-instancefleetconfig-targetondemandcapacity)
     * @param targetOnDemandCapacity The target capacity of On-Demand units for the instance fleet,
     * which determines how many On-Demand instances to provision. 
     */
    override fun targetOnDemandCapacity(targetOnDemandCapacity: Number) {
      cdkBuilder.targetOnDemandCapacity(targetOnDemandCapacity)
    }

    /**
     * The target capacity of Spot units for the instance fleet, which determines how many Spot
     * instances to provision.
     *
     * When the instance fleet launches, Amazon EMR tries to provision Spot instances as specified
     * by `InstanceTypeConfig` . Each instance configuration has a specified `WeightedCapacity` . When
     * a Spot instance is provisioned, the `WeightedCapacity` units count toward the target capacity.
     * Amazon EMR provisions instances until the target capacity is totally fulfilled, even if this
     * results in an overage. For example, if there are 2 units remaining to fulfill capacity, and
     * Amazon EMR can only provision an instance with a `WeightedCapacity` of 5 units, the instance is
     * provisioned, and the target capacity is exceeded by 3 units.
     *
     *
     * If not specified or set to 0, only On-Demand instances are provisioned for the instance
     * fleet. At least one of `TargetSpotCapacity` and `TargetOnDemandCapacity` should be greater than
     * 0. For a master instance fleet, only one of `TargetSpotCapacity` and `TargetOnDemandCapacity`
     * can be specified, and its value must be 1.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancefleetconfig.html#cfn-emr-instancefleetconfig-targetspotcapacity)
     * @param targetSpotCapacity The target capacity of Spot units for the instance fleet, which
     * determines how many Spot instances to provision. 
     */
    override fun targetSpotCapacity(targetSpotCapacity: Number) {
      cdkBuilder.targetSpotCapacity(targetSpotCapacity)
    }

    public fun build(): software.amazon.awscdk.services.emr.CfnInstanceFleetConfig =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnInstanceFleetConfig {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnInstanceFleetConfig(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceFleetConfig):
        CfnInstanceFleetConfig = CfnInstanceFleetConfig(cdkObject)

    internal fun unwrap(wrapped: CfnInstanceFleetConfig):
        software.amazon.awscdk.services.emr.CfnInstanceFleetConfig = wrapped.cdkObject
  }

  public interface EbsConfigurationProperty {
    /**
     * An array of Amazon EBS volume specifications attached to a cluster instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-ebsconfiguration.html#cfn-emr-instancefleetconfig-ebsconfiguration-ebsblockdeviceconfigs)
     */
    public fun ebsBlockDeviceConfigs(): Any? = unwrap(this).getEbsBlockDeviceConfigs()

    /**
     * Indicates whether an Amazon EBS volume is EBS-optimized.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-ebsconfiguration.html#cfn-emr-instancefleetconfig-ebsconfiguration-ebsoptimized)
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
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsConfigurationProperty.builder()

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
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsConfigurationProperty,
    ) : CdkObject(cdkObject), EbsConfigurationProperty {
      /**
       * An array of Amazon EBS volume specifications attached to a cluster instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-ebsconfiguration.html#cfn-emr-instancefleetconfig-ebsconfiguration-ebsblockdeviceconfigs)
       */
      override fun ebsBlockDeviceConfigs(): Any? = unwrap(this).getEbsBlockDeviceConfigs()

      /**
       * Indicates whether an Amazon EBS volume is EBS-optimized.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-ebsconfiguration.html#cfn-emr-instancefleetconfig-ebsconfiguration-ebsoptimized)
       */
      override fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EbsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsConfigurationProperty):
          EbsConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EbsConfigurationProperty):
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsConfigurationProperty
    }
  }

  public interface OnDemandProvisioningSpecificationProperty {
    /**
     * Specifies the strategy to use in launching On-Demand instance fleets.
     *
     * Currently, the only option is `lowest-price` (the default), which launches the lowest price
     * first.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-ondemandprovisioningspecification.html#cfn-emr-instancefleetconfig-ondemandprovisioningspecification-allocationstrategy)
     */
    public fun allocationStrategy(): String

    /**
     * A builder for [OnDemandProvisioningSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allocationStrategy Specifies the strategy to use in launching On-Demand instance
       * fleets. 
       * Currently, the only option is `lowest-price` (the default), which launches the lowest price
       * first.
       */
      public fun allocationStrategy(allocationStrategy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.OnDemandProvisioningSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.OnDemandProvisioningSpecificationProperty.builder()

      /**
       * @param allocationStrategy Specifies the strategy to use in launching On-Demand instance
       * fleets. 
       * Currently, the only option is `lowest-price` (the default), which launches the lowest price
       * first.
       */
      override fun allocationStrategy(allocationStrategy: String) {
        cdkBuilder.allocationStrategy(allocationStrategy)
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.OnDemandProvisioningSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.OnDemandProvisioningSpecificationProperty,
    ) : CdkObject(cdkObject), OnDemandProvisioningSpecificationProperty {
      /**
       * Specifies the strategy to use in launching On-Demand instance fleets.
       *
       * Currently, the only option is `lowest-price` (the default), which launches the lowest price
       * first.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-ondemandprovisioningspecification.html#cfn-emr-instancefleetconfig-ondemandprovisioningspecification-allocationstrategy)
       */
      override fun allocationStrategy(): String = unwrap(this).getAllocationStrategy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          OnDemandProvisioningSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.OnDemandProvisioningSpecificationProperty):
          OnDemandProvisioningSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OnDemandProvisioningSpecificationProperty):
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.OnDemandProvisioningSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.OnDemandProvisioningSpecificationProperty
    }
  }

  public interface ConfigurationProperty {
    /**
     * The classification within a configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-configuration.html#cfn-emr-instancefleetconfig-configuration-classification)
     */
    public fun classification(): String? = unwrap(this).getClassification()

    /**
     * Within a configuration classification, a set of properties that represent the settings that
     * you want to change in the configuration file.
     *
     * Duplicates not allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-configuration.html#cfn-emr-instancefleetconfig-configuration-configurationproperties)
     */
    public fun configurationProperties(): Any? = unwrap(this).getConfigurationProperties()

    /**
     * A list of additional configurations to apply within a configuration object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-configuration.html#cfn-emr-instancefleetconfig-configuration-configurations)
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
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.ConfigurationProperty.Builder =
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.ConfigurationProperty.builder()

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
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.ConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.ConfigurationProperty,
    ) : CdkObject(cdkObject), ConfigurationProperty {
      /**
       * The classification within a configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-configuration.html#cfn-emr-instancefleetconfig-configuration-classification)
       */
      override fun classification(): String? = unwrap(this).getClassification()

      /**
       * Within a configuration classification, a set of properties that represent the settings that
       * you want to change in the configuration file.
       *
       * Duplicates not allowed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-configuration.html#cfn-emr-instancefleetconfig-configuration-configurationproperties)
       */
      override fun configurationProperties(): Any? = unwrap(this).getConfigurationProperties()

      /**
       * A list of additional configurations to apply within a configuration object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-configuration.html#cfn-emr-instancefleetconfig-configuration-configurations)
       */
      override fun configurations(): Any? = unwrap(this).getConfigurations()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.ConfigurationProperty):
          ConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfigurationProperty):
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.ConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.ConfigurationProperty
    }
  }

  public interface EbsBlockDeviceConfigProperty {
    /**
     * EBS volume specifications such as volume type, IOPS, size (GiB) and throughput (MiB/s) that
     * are requested for the EBS volume attached to an Amazon EC2 instance in the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-ebsblockdeviceconfig.html#cfn-emr-instancefleetconfig-ebsblockdeviceconfig-volumespecification)
     */
    public fun volumeSpecification(): Any

    /**
     * Number of EBS volumes with a specific volume configuration that are associated with every
     * instance in the instance group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-ebsblockdeviceconfig.html#cfn-emr-instancefleetconfig-ebsblockdeviceconfig-volumesperinstance)
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
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("90f563601bc0cff8fe8978211b8b5efe67eccc0935bce406e80f312dbf2d6bc9")
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
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsBlockDeviceConfigProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsBlockDeviceConfigProperty.builder()

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
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("90f563601bc0cff8fe8978211b8b5efe67eccc0935bce406e80f312dbf2d6bc9")
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
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsBlockDeviceConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsBlockDeviceConfigProperty,
    ) : CdkObject(cdkObject), EbsBlockDeviceConfigProperty {
      /**
       * EBS volume specifications such as volume type, IOPS, size (GiB) and throughput (MiB/s) that
       * are requested for the EBS volume attached to an Amazon EC2 instance in the cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-ebsblockdeviceconfig.html#cfn-emr-instancefleetconfig-ebsblockdeviceconfig-volumespecification)
       */
      override fun volumeSpecification(): Any = unwrap(this).getVolumeSpecification()

      /**
       * Number of EBS volumes with a specific volume configuration that are associated with every
       * instance in the instance group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-ebsblockdeviceconfig.html#cfn-emr-instancefleetconfig-ebsblockdeviceconfig-volumesperinstance)
       */
      override fun volumesPerInstance(): Number? = unwrap(this).getVolumesPerInstance()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EbsBlockDeviceConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsBlockDeviceConfigProperty):
          EbsBlockDeviceConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EbsBlockDeviceConfigProperty):
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsBlockDeviceConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsBlockDeviceConfigProperty
    }
  }

  public interface SpotProvisioningSpecificationProperty {
    /**
     * Specifies one of the following strategies to launch Spot Instance fleets:
     * `price-capacity-optimized` , `capacity-optimized` , `lowest-price` , or `diversified` .
     *
     * For more information on the provisioning strategies, see [Allocation strategies for Spot
     * Instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-allocation-strategy.html)
     * in the *Amazon EC2 User Guide for Linux Instances* .
     *
     *
     * When you launch a Spot Instance fleet with the old console, it automatically launches with
     * the `capacity-optimized` strategy. You can't change the allocation strategy from the old
     * console.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-spotprovisioningspecification.html#cfn-emr-instancefleetconfig-spotprovisioningspecification-allocationstrategy)
     */
    public fun allocationStrategy(): String? = unwrap(this).getAllocationStrategy()

    /**
     * The defined duration for Spot Instances (also known as Spot blocks) in minutes.
     *
     * When specified, the Spot Instance does not terminate before the defined duration expires, and
     * defined duration pricing for Spot Instances applies. Valid values are 60, 120, 180, 240, 300, or
     * 360. The duration period starts as soon as a Spot Instance receives its instance ID. At the end
     * of the duration, Amazon EC2 marks the Spot Instance for termination and provides a Spot Instance
     * termination notice, which gives the instance a two-minute warning before it terminates.
     *
     *
     * Spot Instances with a defined duration (also known as Spot blocks) are no longer available to
     * new customers from July 1, 2021. For customers who have previously used the feature, we will
     * continue to support Spot Instances with a defined duration until December 31, 2022.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-spotprovisioningspecification.html#cfn-emr-instancefleetconfig-spotprovisioningspecification-blockdurationminutes)
     */
    public fun blockDurationMinutes(): Number? = unwrap(this).getBlockDurationMinutes()

    /**
     * The action to take when `TargetSpotCapacity` has not been fulfilled when the
     * `TimeoutDurationMinutes` has expired;
     *
     * that is, when all Spot Instances could not be provisioned within the Spot provisioning
     * timeout. Valid values are `TERMINATE_CLUSTER` and `SWITCH_TO_ON_DEMAND` . SWITCH_TO_ON_DEMAND
     * specifies that if no Spot Instances are available, On-Demand Instances should be provisioned to
     * fulfill any remaining Spot capacity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-spotprovisioningspecification.html#cfn-emr-instancefleetconfig-spotprovisioningspecification-timeoutaction)
     */
    public fun timeoutAction(): String

    /**
     * The Spot provisioning timeout period in minutes.
     *
     * If Spot Instances are not provisioned within this time period, the `TimeOutAction` is taken.
     * Minimum value is 5 and maximum value is 1440. The timeout applies only during initial
     * provisioning, when the cluster is first created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-spotprovisioningspecification.html#cfn-emr-instancefleetconfig-spotprovisioningspecification-timeoutdurationminutes)
     */
    public fun timeoutDurationMinutes(): Number

    /**
     * A builder for [SpotProvisioningSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allocationStrategy Specifies one of the following strategies to launch Spot Instance
       * fleets: `price-capacity-optimized` , `capacity-optimized` , `lowest-price` , or `diversified`
       * .
       * For more information on the provisioning strategies, see [Allocation strategies for Spot
       * Instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-allocation-strategy.html)
       * in the *Amazon EC2 User Guide for Linux Instances* .
       *
       *
       * When you launch a Spot Instance fleet with the old console, it automatically launches with
       * the `capacity-optimized` strategy. You can't change the allocation strategy from the old
       * console.
       */
      public fun allocationStrategy(allocationStrategy: String)

      /**
       * @param blockDurationMinutes The defined duration for Spot Instances (also known as Spot
       * blocks) in minutes.
       * When specified, the Spot Instance does not terminate before the defined duration expires,
       * and defined duration pricing for Spot Instances applies. Valid values are 60, 120, 180, 240,
       * 300, or 360. The duration period starts as soon as a Spot Instance receives its instance ID.
       * At the end of the duration, Amazon EC2 marks the Spot Instance for termination and provides a
       * Spot Instance termination notice, which gives the instance a two-minute warning before it
       * terminates.
       *
       *
       * Spot Instances with a defined duration (also known as Spot blocks) are no longer available
       * to new customers from July 1, 2021. For customers who have previously used the feature, we
       * will continue to support Spot Instances with a defined duration until December 31, 2022.
       */
      public fun blockDurationMinutes(blockDurationMinutes: Number)

      /**
       * @param timeoutAction The action to take when `TargetSpotCapacity` has not been fulfilled
       * when the `TimeoutDurationMinutes` has expired;. 
       * that is, when all Spot Instances could not be provisioned within the Spot provisioning
       * timeout. Valid values are `TERMINATE_CLUSTER` and `SWITCH_TO_ON_DEMAND` . SWITCH_TO_ON_DEMAND
       * specifies that if no Spot Instances are available, On-Demand Instances should be provisioned
       * to fulfill any remaining Spot capacity.
       */
      public fun timeoutAction(timeoutAction: String)

      /**
       * @param timeoutDurationMinutes The Spot provisioning timeout period in minutes. 
       * If Spot Instances are not provisioned within this time period, the `TimeOutAction` is
       * taken. Minimum value is 5 and maximum value is 1440. The timeout applies only during initial
       * provisioning, when the cluster is first created.
       */
      public fun timeoutDurationMinutes(timeoutDurationMinutes: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.SpotProvisioningSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.SpotProvisioningSpecificationProperty.builder()

      /**
       * @param allocationStrategy Specifies one of the following strategies to launch Spot Instance
       * fleets: `price-capacity-optimized` , `capacity-optimized` , `lowest-price` , or `diversified`
       * .
       * For more information on the provisioning strategies, see [Allocation strategies for Spot
       * Instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-allocation-strategy.html)
       * in the *Amazon EC2 User Guide for Linux Instances* .
       *
       *
       * When you launch a Spot Instance fleet with the old console, it automatically launches with
       * the `capacity-optimized` strategy. You can't change the allocation strategy from the old
       * console.
       */
      override fun allocationStrategy(allocationStrategy: String) {
        cdkBuilder.allocationStrategy(allocationStrategy)
      }

      /**
       * @param blockDurationMinutes The defined duration for Spot Instances (also known as Spot
       * blocks) in minutes.
       * When specified, the Spot Instance does not terminate before the defined duration expires,
       * and defined duration pricing for Spot Instances applies. Valid values are 60, 120, 180, 240,
       * 300, or 360. The duration period starts as soon as a Spot Instance receives its instance ID.
       * At the end of the duration, Amazon EC2 marks the Spot Instance for termination and provides a
       * Spot Instance termination notice, which gives the instance a two-minute warning before it
       * terminates.
       *
       *
       * Spot Instances with a defined duration (also known as Spot blocks) are no longer available
       * to new customers from July 1, 2021. For customers who have previously used the feature, we
       * will continue to support Spot Instances with a defined duration until December 31, 2022.
       */
      override fun blockDurationMinutes(blockDurationMinutes: Number) {
        cdkBuilder.blockDurationMinutes(blockDurationMinutes)
      }

      /**
       * @param timeoutAction The action to take when `TargetSpotCapacity` has not been fulfilled
       * when the `TimeoutDurationMinutes` has expired;. 
       * that is, when all Spot Instances could not be provisioned within the Spot provisioning
       * timeout. Valid values are `TERMINATE_CLUSTER` and `SWITCH_TO_ON_DEMAND` . SWITCH_TO_ON_DEMAND
       * specifies that if no Spot Instances are available, On-Demand Instances should be provisioned
       * to fulfill any remaining Spot capacity.
       */
      override fun timeoutAction(timeoutAction: String) {
        cdkBuilder.timeoutAction(timeoutAction)
      }

      /**
       * @param timeoutDurationMinutes The Spot provisioning timeout period in minutes. 
       * If Spot Instances are not provisioned within this time period, the `TimeOutAction` is
       * taken. Minimum value is 5 and maximum value is 1440. The timeout applies only during initial
       * provisioning, when the cluster is first created.
       */
      override fun timeoutDurationMinutes(timeoutDurationMinutes: Number) {
        cdkBuilder.timeoutDurationMinutes(timeoutDurationMinutes)
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.SpotProvisioningSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.SpotProvisioningSpecificationProperty,
    ) : CdkObject(cdkObject), SpotProvisioningSpecificationProperty {
      /**
       * Specifies one of the following strategies to launch Spot Instance fleets:
       * `price-capacity-optimized` , `capacity-optimized` , `lowest-price` , or `diversified` .
       *
       * For more information on the provisioning strategies, see [Allocation strategies for Spot
       * Instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-allocation-strategy.html)
       * in the *Amazon EC2 User Guide for Linux Instances* .
       *
       *
       * When you launch a Spot Instance fleet with the old console, it automatically launches with
       * the `capacity-optimized` strategy. You can't change the allocation strategy from the old
       * console.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-spotprovisioningspecification.html#cfn-emr-instancefleetconfig-spotprovisioningspecification-allocationstrategy)
       */
      override fun allocationStrategy(): String? = unwrap(this).getAllocationStrategy()

      /**
       * The defined duration for Spot Instances (also known as Spot blocks) in minutes.
       *
       * When specified, the Spot Instance does not terminate before the defined duration expires,
       * and defined duration pricing for Spot Instances applies. Valid values are 60, 120, 180, 240,
       * 300, or 360. The duration period starts as soon as a Spot Instance receives its instance ID.
       * At the end of the duration, Amazon EC2 marks the Spot Instance for termination and provides a
       * Spot Instance termination notice, which gives the instance a two-minute warning before it
       * terminates.
       *
       *
       * Spot Instances with a defined duration (also known as Spot blocks) are no longer available
       * to new customers from July 1, 2021. For customers who have previously used the feature, we
       * will continue to support Spot Instances with a defined duration until December 31, 2022.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-spotprovisioningspecification.html#cfn-emr-instancefleetconfig-spotprovisioningspecification-blockdurationminutes)
       */
      override fun blockDurationMinutes(): Number? = unwrap(this).getBlockDurationMinutes()

      /**
       * The action to take when `TargetSpotCapacity` has not been fulfilled when the
       * `TimeoutDurationMinutes` has expired;
       *
       * that is, when all Spot Instances could not be provisioned within the Spot provisioning
       * timeout. Valid values are `TERMINATE_CLUSTER` and `SWITCH_TO_ON_DEMAND` . SWITCH_TO_ON_DEMAND
       * specifies that if no Spot Instances are available, On-Demand Instances should be provisioned
       * to fulfill any remaining Spot capacity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-spotprovisioningspecification.html#cfn-emr-instancefleetconfig-spotprovisioningspecification-timeoutaction)
       */
      override fun timeoutAction(): String = unwrap(this).getTimeoutAction()

      /**
       * The Spot provisioning timeout period in minutes.
       *
       * If Spot Instances are not provisioned within this time period, the `TimeOutAction` is
       * taken. Minimum value is 5 and maximum value is 1440. The timeout applies only during initial
       * provisioning, when the cluster is first created.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-spotprovisioningspecification.html#cfn-emr-instancefleetconfig-spotprovisioningspecification-timeoutdurationminutes)
       */
      override fun timeoutDurationMinutes(): Number = unwrap(this).getTimeoutDurationMinutes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SpotProvisioningSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.SpotProvisioningSpecificationProperty):
          SpotProvisioningSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpotProvisioningSpecificationProperty):
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.SpotProvisioningSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.SpotProvisioningSpecificationProperty
    }
  }

  public interface InstanceTypeConfigProperty {
    /**
     * The bid price for each Amazon EC2 Spot Instance type as defined by `InstanceType` .
     *
     * Expressed in USD. If neither `BidPrice` nor `BidPriceAsPercentageOfOnDemandPrice` is
     * provided, `BidPriceAsPercentageOfOnDemandPrice` defaults to 100%.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-instancetypeconfig.html#cfn-emr-instancefleetconfig-instancetypeconfig-bidprice)
     */
    public fun bidPrice(): String? = unwrap(this).getBidPrice()

    /**
     * The bid price, as a percentage of On-Demand price, for each Amazon EC2 Spot Instance as
     * defined by `InstanceType` .
     *
     * Expressed as a number (for example, 20 specifies 20%). If neither `BidPrice` nor
     * `BidPriceAsPercentageOfOnDemandPrice` is provided, `BidPriceAsPercentageOfOnDemandPrice`
     * defaults to 100%.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-instancetypeconfig.html#cfn-emr-instancefleetconfig-instancetypeconfig-bidpriceaspercentageofondemandprice)
     */
    public fun bidPriceAsPercentageOfOnDemandPrice(): Number? =
        unwrap(this).getBidPriceAsPercentageOfOnDemandPrice()

    /**
     * Amazon EMR releases 4.x or later.
     *
     * An optional configuration specification to be used when provisioning cluster instances, which
     * can include configurations for applications and software bundled with Amazon EMR. A
     * configuration consists of a classification, properties, and optional nested configurations. A
     * classification refers to an application-specific configuration file. Properties are the settings
     * you want to change in that file. For more information, see [Configuring
     * Applications](https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-configure-apps.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-instancetypeconfig.html#cfn-emr-instancefleetconfig-instancetypeconfig-configurations)
     */
    public fun configurations(): Any? = unwrap(this).getConfigurations()

    /**
     * The custom AMI ID to use for the instance type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-instancetypeconfig.html#cfn-emr-instancefleetconfig-instancetypeconfig-customamiid)
     */
    public fun customAmiId(): String? = unwrap(this).getCustomAmiId()

    /**
     * The configuration of Amazon Elastic Block Store (Amazon EBS) attached to each instance as
     * defined by `InstanceType` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-instancetypeconfig.html#cfn-emr-instancefleetconfig-instancetypeconfig-ebsconfiguration)
     */
    public fun ebsConfiguration(): Any? = unwrap(this).getEbsConfiguration()

    /**
     * An Amazon EC2 instance type, such as `m3.xlarge` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-instancetypeconfig.html#cfn-emr-instancefleetconfig-instancetypeconfig-instancetype)
     */
    public fun instanceType(): String

    /**
     * The number of units that a provisioned instance of this type provides toward fulfilling the
     * target capacities defined in `InstanceFleetConfig` .
     *
     * This value is 1 for a master instance fleet, and must be 1 or greater for core and task
     * instance fleets. Defaults to 1 if not specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-instancetypeconfig.html#cfn-emr-instancefleetconfig-instancetypeconfig-weightedcapacity)
     */
    public fun weightedCapacity(): Number? = unwrap(this).getWeightedCapacity()

    /**
     * A builder for [InstanceTypeConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bidPrice The bid price for each Amazon EC2 Spot Instance type as defined by
       * `InstanceType` .
       * Expressed in USD. If neither `BidPrice` nor `BidPriceAsPercentageOfOnDemandPrice` is
       * provided, `BidPriceAsPercentageOfOnDemandPrice` defaults to 100%.
       */
      public fun bidPrice(bidPrice: String)

      /**
       * @param bidPriceAsPercentageOfOnDemandPrice The bid price, as a percentage of On-Demand
       * price, for each Amazon EC2 Spot Instance as defined by `InstanceType` .
       * Expressed as a number (for example, 20 specifies 20%). If neither `BidPrice` nor
       * `BidPriceAsPercentageOfOnDemandPrice` is provided, `BidPriceAsPercentageOfOnDemandPrice`
       * defaults to 100%.
       */
      public fun bidPriceAsPercentageOfOnDemandPrice(bidPriceAsPercentageOfOnDemandPrice: Number)

      /**
       * @param configurations Amazon EMR releases 4.x or later.
       * An optional configuration specification to be used when provisioning cluster instances,
       * which can include configurations for applications and software bundled with Amazon EMR. A
       * configuration consists of a classification, properties, and optional nested configurations. A
       * classification refers to an application-specific configuration file. Properties are the
       * settings you want to change in that file. For more information, see [Configuring
       * Applications](https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-configure-apps.html) .
       */
      public fun configurations(configurations: IResolvable)

      /**
       * @param configurations Amazon EMR releases 4.x or later.
       * An optional configuration specification to be used when provisioning cluster instances,
       * which can include configurations for applications and software bundled with Amazon EMR. A
       * configuration consists of a classification, properties, and optional nested configurations. A
       * classification refers to an application-specific configuration file. Properties are the
       * settings you want to change in that file. For more information, see [Configuring
       * Applications](https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-configure-apps.html) .
       */
      public fun configurations(configurations: List<Any>)

      /**
       * @param configurations Amazon EMR releases 4.x or later.
       * An optional configuration specification to be used when provisioning cluster instances,
       * which can include configurations for applications and software bundled with Amazon EMR. A
       * configuration consists of a classification, properties, and optional nested configurations. A
       * classification refers to an application-specific configuration file. Properties are the
       * settings you want to change in that file. For more information, see [Configuring
       * Applications](https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-configure-apps.html) .
       */
      public fun configurations(vararg configurations: Any)

      /**
       * @param customAmiId The custom AMI ID to use for the instance type.
       */
      public fun customAmiId(customAmiId: String)

      /**
       * @param ebsConfiguration The configuration of Amazon Elastic Block Store (Amazon EBS)
       * attached to each instance as defined by `InstanceType` .
       */
      public fun ebsConfiguration(ebsConfiguration: IResolvable)

      /**
       * @param ebsConfiguration The configuration of Amazon Elastic Block Store (Amazon EBS)
       * attached to each instance as defined by `InstanceType` .
       */
      public fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty)

      /**
       * @param ebsConfiguration The configuration of Amazon Elastic Block Store (Amazon EBS)
       * attached to each instance as defined by `InstanceType` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("999d0f487e09e440d0c0b84be779862db4ba6ef5f90ffde2250d398c6529e2bf")
      public fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty.Builder.() -> Unit)

      /**
       * @param instanceType An Amazon EC2 instance type, such as `m3.xlarge` . 
       */
      public fun instanceType(instanceType: String)

      /**
       * @param weightedCapacity The number of units that a provisioned instance of this type
       * provides toward fulfilling the target capacities defined in `InstanceFleetConfig` .
       * This value is 1 for a master instance fleet, and must be 1 or greater for core and task
       * instance fleets. Defaults to 1 if not specified.
       */
      public fun weightedCapacity(weightedCapacity: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceTypeConfigProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceTypeConfigProperty.builder()

      /**
       * @param bidPrice The bid price for each Amazon EC2 Spot Instance type as defined by
       * `InstanceType` .
       * Expressed in USD. If neither `BidPrice` nor `BidPriceAsPercentageOfOnDemandPrice` is
       * provided, `BidPriceAsPercentageOfOnDemandPrice` defaults to 100%.
       */
      override fun bidPrice(bidPrice: String) {
        cdkBuilder.bidPrice(bidPrice)
      }

      /**
       * @param bidPriceAsPercentageOfOnDemandPrice The bid price, as a percentage of On-Demand
       * price, for each Amazon EC2 Spot Instance as defined by `InstanceType` .
       * Expressed as a number (for example, 20 specifies 20%). If neither `BidPrice` nor
       * `BidPriceAsPercentageOfOnDemandPrice` is provided, `BidPriceAsPercentageOfOnDemandPrice`
       * defaults to 100%.
       */
      override
          fun bidPriceAsPercentageOfOnDemandPrice(bidPriceAsPercentageOfOnDemandPrice: Number) {
        cdkBuilder.bidPriceAsPercentageOfOnDemandPrice(bidPriceAsPercentageOfOnDemandPrice)
      }

      /**
       * @param configurations Amazon EMR releases 4.x or later.
       * An optional configuration specification to be used when provisioning cluster instances,
       * which can include configurations for applications and software bundled with Amazon EMR. A
       * configuration consists of a classification, properties, and optional nested configurations. A
       * classification refers to an application-specific configuration file. Properties are the
       * settings you want to change in that file. For more information, see [Configuring
       * Applications](https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-configure-apps.html) .
       */
      override fun configurations(configurations: IResolvable) {
        cdkBuilder.configurations(configurations.let(IResolvable::unwrap))
      }

      /**
       * @param configurations Amazon EMR releases 4.x or later.
       * An optional configuration specification to be used when provisioning cluster instances,
       * which can include configurations for applications and software bundled with Amazon EMR. A
       * configuration consists of a classification, properties, and optional nested configurations. A
       * classification refers to an application-specific configuration file. Properties are the
       * settings you want to change in that file. For more information, see [Configuring
       * Applications](https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-configure-apps.html) .
       */
      override fun configurations(configurations: List<Any>) {
        cdkBuilder.configurations(configurations)
      }

      /**
       * @param configurations Amazon EMR releases 4.x or later.
       * An optional configuration specification to be used when provisioning cluster instances,
       * which can include configurations for applications and software bundled with Amazon EMR. A
       * configuration consists of a classification, properties, and optional nested configurations. A
       * classification refers to an application-specific configuration file. Properties are the
       * settings you want to change in that file. For more information, see [Configuring
       * Applications](https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-configure-apps.html) .
       */
      override fun configurations(vararg configurations: Any): Unit =
          configurations(configurations.toList())

      /**
       * @param customAmiId The custom AMI ID to use for the instance type.
       */
      override fun customAmiId(customAmiId: String) {
        cdkBuilder.customAmiId(customAmiId)
      }

      /**
       * @param ebsConfiguration The configuration of Amazon Elastic Block Store (Amazon EBS)
       * attached to each instance as defined by `InstanceType` .
       */
      override fun ebsConfiguration(ebsConfiguration: IResolvable) {
        cdkBuilder.ebsConfiguration(ebsConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param ebsConfiguration The configuration of Amazon Elastic Block Store (Amazon EBS)
       * attached to each instance as defined by `InstanceType` .
       */
      override fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty) {
        cdkBuilder.ebsConfiguration(ebsConfiguration.let(EbsConfigurationProperty::unwrap))
      }

      /**
       * @param ebsConfiguration The configuration of Amazon Elastic Block Store (Amazon EBS)
       * attached to each instance as defined by `InstanceType` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("999d0f487e09e440d0c0b84be779862db4ba6ef5f90ffde2250d398c6529e2bf")
      override fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty.Builder.() -> Unit):
          Unit = ebsConfiguration(EbsConfigurationProperty(ebsConfiguration))

      /**
       * @param instanceType An Amazon EC2 instance type, such as `m3.xlarge` . 
       */
      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      /**
       * @param weightedCapacity The number of units that a provisioned instance of this type
       * provides toward fulfilling the target capacities defined in `InstanceFleetConfig` .
       * This value is 1 for a master instance fleet, and must be 1 or greater for core and task
       * instance fleets. Defaults to 1 if not specified.
       */
      override fun weightedCapacity(weightedCapacity: Number) {
        cdkBuilder.weightedCapacity(weightedCapacity)
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceTypeConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceTypeConfigProperty,
    ) : CdkObject(cdkObject), InstanceTypeConfigProperty {
      /**
       * The bid price for each Amazon EC2 Spot Instance type as defined by `InstanceType` .
       *
       * Expressed in USD. If neither `BidPrice` nor `BidPriceAsPercentageOfOnDemandPrice` is
       * provided, `BidPriceAsPercentageOfOnDemandPrice` defaults to 100%.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-instancetypeconfig.html#cfn-emr-instancefleetconfig-instancetypeconfig-bidprice)
       */
      override fun bidPrice(): String? = unwrap(this).getBidPrice()

      /**
       * The bid price, as a percentage of On-Demand price, for each Amazon EC2 Spot Instance as
       * defined by `InstanceType` .
       *
       * Expressed as a number (for example, 20 specifies 20%). If neither `BidPrice` nor
       * `BidPriceAsPercentageOfOnDemandPrice` is provided, `BidPriceAsPercentageOfOnDemandPrice`
       * defaults to 100%.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-instancetypeconfig.html#cfn-emr-instancefleetconfig-instancetypeconfig-bidpriceaspercentageofondemandprice)
       */
      override fun bidPriceAsPercentageOfOnDemandPrice(): Number? =
          unwrap(this).getBidPriceAsPercentageOfOnDemandPrice()

      /**
       * Amazon EMR releases 4.x or later.
       *
       * An optional configuration specification to be used when provisioning cluster instances,
       * which can include configurations for applications and software bundled with Amazon EMR. A
       * configuration consists of a classification, properties, and optional nested configurations. A
       * classification refers to an application-specific configuration file. Properties are the
       * settings you want to change in that file. For more information, see [Configuring
       * Applications](https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-configure-apps.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-instancetypeconfig.html#cfn-emr-instancefleetconfig-instancetypeconfig-configurations)
       */
      override fun configurations(): Any? = unwrap(this).getConfigurations()

      /**
       * The custom AMI ID to use for the instance type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-instancetypeconfig.html#cfn-emr-instancefleetconfig-instancetypeconfig-customamiid)
       */
      override fun customAmiId(): String? = unwrap(this).getCustomAmiId()

      /**
       * The configuration of Amazon Elastic Block Store (Amazon EBS) attached to each instance as
       * defined by `InstanceType` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-instancetypeconfig.html#cfn-emr-instancefleetconfig-instancetypeconfig-ebsconfiguration)
       */
      override fun ebsConfiguration(): Any? = unwrap(this).getEbsConfiguration()

      /**
       * An Amazon EC2 instance type, such as `m3.xlarge` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-instancetypeconfig.html#cfn-emr-instancefleetconfig-instancetypeconfig-instancetype)
       */
      override fun instanceType(): String = unwrap(this).getInstanceType()

      /**
       * The number of units that a provisioned instance of this type provides toward fulfilling the
       * target capacities defined in `InstanceFleetConfig` .
       *
       * This value is 1 for a master instance fleet, and must be 1 or greater for core and task
       * instance fleets. Defaults to 1 if not specified.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-instancetypeconfig.html#cfn-emr-instancefleetconfig-instancetypeconfig-weightedcapacity)
       */
      override fun weightedCapacity(): Number? = unwrap(this).getWeightedCapacity()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InstanceTypeConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceTypeConfigProperty):
          InstanceTypeConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceTypeConfigProperty):
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceTypeConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceTypeConfigProperty
    }
  }

  public interface VolumeSpecificationProperty {
    /**
     * The number of I/O operations per second (IOPS) that the volume supports.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-volumespecification.html#cfn-emr-instancefleetconfig-volumespecification-iops)
     */
    public fun iops(): Number? = unwrap(this).getIops()

    /**
     * The volume size, in gibibytes (GiB).
     *
     * This can be a number from 1 - 1024. If the volume type is EBS-optimized, the minimum value is
     * 10.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-volumespecification.html#cfn-emr-instancefleetconfig-volumespecification-sizeingb)
     */
    public fun sizeInGb(): Number

    /**
     * The throughput, in mebibyte per second (MiB/s).
     *
     * This optional parameter can be a number from 125 - 1000 and is valid only for gp3 volumes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-volumespecification.html#cfn-emr-instancefleetconfig-volumespecification-throughput)
     */
    public fun throughput(): Number? = unwrap(this).getThroughput()

    /**
     * The volume type.
     *
     * Volume types supported are gp3, gp2, io1, st1, sc1, and standard.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-volumespecification.html#cfn-emr-instancefleetconfig-volumespecification-volumetype)
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
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.VolumeSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.VolumeSpecificationProperty.builder()

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
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.VolumeSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.VolumeSpecificationProperty,
    ) : CdkObject(cdkObject), VolumeSpecificationProperty {
      /**
       * The number of I/O operations per second (IOPS) that the volume supports.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-volumespecification.html#cfn-emr-instancefleetconfig-volumespecification-iops)
       */
      override fun iops(): Number? = unwrap(this).getIops()

      /**
       * The volume size, in gibibytes (GiB).
       *
       * This can be a number from 1 - 1024. If the volume type is EBS-optimized, the minimum value
       * is 10.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-volumespecification.html#cfn-emr-instancefleetconfig-volumespecification-sizeingb)
       */
      override fun sizeInGb(): Number = unwrap(this).getSizeInGb()

      /**
       * The throughput, in mebibyte per second (MiB/s).
       *
       * This optional parameter can be a number from 125 - 1000 and is valid only for gp3 volumes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-volumespecification.html#cfn-emr-instancefleetconfig-volumespecification-throughput)
       */
      override fun throughput(): Number? = unwrap(this).getThroughput()

      /**
       * The volume type.
       *
       * Volume types supported are gp3, gp2, io1, st1, sc1, and standard.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-volumespecification.html#cfn-emr-instancefleetconfig-volumespecification-volumetype)
       */
      override fun volumeType(): String = unwrap(this).getVolumeType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VolumeSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.VolumeSpecificationProperty):
          VolumeSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VolumeSpecificationProperty):
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.VolumeSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.VolumeSpecificationProperty
    }
  }

  public interface InstanceFleetProvisioningSpecificationsProperty {
    /**
     * The launch specification for On-Demand Instances in the instance fleet, which determines the
     * allocation strategy.
     *
     *
     * The instance fleet configuration is available only in Amazon EMR releases 4.8.0 and later,
     * excluding 5.0.x versions. On-Demand Instances allocation strategy is available in Amazon EMR
     * releases 5.12.1 and later.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-instancefleetprovisioningspecifications.html#cfn-emr-instancefleetconfig-instancefleetprovisioningspecifications-ondemandspecification)
     */
    public fun onDemandSpecification(): Any? = unwrap(this).getOnDemandSpecification()

    /**
     * The launch specification for Spot instances in the fleet, which determines the defined
     * duration, provisioning timeout behavior, and allocation strategy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-instancefleetprovisioningspecifications.html#cfn-emr-instancefleetconfig-instancefleetprovisioningspecifications-spotspecification)
     */
    public fun spotSpecification(): Any? = unwrap(this).getSpotSpecification()

    /**
     * A builder for [InstanceFleetProvisioningSpecificationsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param onDemandSpecification The launch specification for On-Demand Instances in the
       * instance fleet, which determines the allocation strategy.
       *
       * The instance fleet configuration is available only in Amazon EMR releases 4.8.0 and later,
       * excluding 5.0.x versions. On-Demand Instances allocation strategy is available in Amazon EMR
       * releases 5.12.1 and later.
       */
      public fun onDemandSpecification(onDemandSpecification: IResolvable)

      /**
       * @param onDemandSpecification The launch specification for On-Demand Instances in the
       * instance fleet, which determines the allocation strategy.
       *
       * The instance fleet configuration is available only in Amazon EMR releases 4.8.0 and later,
       * excluding 5.0.x versions. On-Demand Instances allocation strategy is available in Amazon EMR
       * releases 5.12.1 and later.
       */
      public
          fun onDemandSpecification(onDemandSpecification: OnDemandProvisioningSpecificationProperty)

      /**
       * @param onDemandSpecification The launch specification for On-Demand Instances in the
       * instance fleet, which determines the allocation strategy.
       *
       * The instance fleet configuration is available only in Amazon EMR releases 4.8.0 and later,
       * excluding 5.0.x versions. On-Demand Instances allocation strategy is available in Amazon EMR
       * releases 5.12.1 and later.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ab6e3f21606b4de7054e8b9b81faf0552c480fe77fd8cf07532502405e65bf1c")
      public
          fun onDemandSpecification(onDemandSpecification: OnDemandProvisioningSpecificationProperty.Builder.() -> Unit)

      /**
       * @param spotSpecification The launch specification for Spot instances in the fleet, which
       * determines the defined duration, provisioning timeout behavior, and allocation strategy.
       */
      public fun spotSpecification(spotSpecification: IResolvable)

      /**
       * @param spotSpecification The launch specification for Spot instances in the fleet, which
       * determines the defined duration, provisioning timeout behavior, and allocation strategy.
       */
      public fun spotSpecification(spotSpecification: SpotProvisioningSpecificationProperty)

      /**
       * @param spotSpecification The launch specification for Spot instances in the fleet, which
       * determines the defined duration, provisioning timeout behavior, and allocation strategy.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("adf4fa6f990e98f7c46c7bfa05dc84b8118c0023a37aef58de9fc82d05931529")
      public
          fun spotSpecification(spotSpecification: SpotProvisioningSpecificationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty.builder()

      /**
       * @param onDemandSpecification The launch specification for On-Demand Instances in the
       * instance fleet, which determines the allocation strategy.
       *
       * The instance fleet configuration is available only in Amazon EMR releases 4.8.0 and later,
       * excluding 5.0.x versions. On-Demand Instances allocation strategy is available in Amazon EMR
       * releases 5.12.1 and later.
       */
      override fun onDemandSpecification(onDemandSpecification: IResolvable) {
        cdkBuilder.onDemandSpecification(onDemandSpecification.let(IResolvable::unwrap))
      }

      /**
       * @param onDemandSpecification The launch specification for On-Demand Instances in the
       * instance fleet, which determines the allocation strategy.
       *
       * The instance fleet configuration is available only in Amazon EMR releases 4.8.0 and later,
       * excluding 5.0.x versions. On-Demand Instances allocation strategy is available in Amazon EMR
       * releases 5.12.1 and later.
       */
      override
          fun onDemandSpecification(onDemandSpecification: OnDemandProvisioningSpecificationProperty) {
        cdkBuilder.onDemandSpecification(onDemandSpecification.let(OnDemandProvisioningSpecificationProperty::unwrap))
      }

      /**
       * @param onDemandSpecification The launch specification for On-Demand Instances in the
       * instance fleet, which determines the allocation strategy.
       *
       * The instance fleet configuration is available only in Amazon EMR releases 4.8.0 and later,
       * excluding 5.0.x versions. On-Demand Instances allocation strategy is available in Amazon EMR
       * releases 5.12.1 and later.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ab6e3f21606b4de7054e8b9b81faf0552c480fe77fd8cf07532502405e65bf1c")
      override
          fun onDemandSpecification(onDemandSpecification: OnDemandProvisioningSpecificationProperty.Builder.() -> Unit):
          Unit =
          onDemandSpecification(OnDemandProvisioningSpecificationProperty(onDemandSpecification))

      /**
       * @param spotSpecification The launch specification for Spot instances in the fleet, which
       * determines the defined duration, provisioning timeout behavior, and allocation strategy.
       */
      override fun spotSpecification(spotSpecification: IResolvable) {
        cdkBuilder.spotSpecification(spotSpecification.let(IResolvable::unwrap))
      }

      /**
       * @param spotSpecification The launch specification for Spot instances in the fleet, which
       * determines the defined duration, provisioning timeout behavior, and allocation strategy.
       */
      override fun spotSpecification(spotSpecification: SpotProvisioningSpecificationProperty) {
        cdkBuilder.spotSpecification(spotSpecification.let(SpotProvisioningSpecificationProperty::unwrap))
      }

      /**
       * @param spotSpecification The launch specification for Spot instances in the fleet, which
       * determines the defined duration, provisioning timeout behavior, and allocation strategy.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("adf4fa6f990e98f7c46c7bfa05dc84b8118c0023a37aef58de9fc82d05931529")
      override
          fun spotSpecification(spotSpecification: SpotProvisioningSpecificationProperty.Builder.() -> Unit):
          Unit = spotSpecification(SpotProvisioningSpecificationProperty(spotSpecification))

      public fun build():
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty,
    ) : CdkObject(cdkObject), InstanceFleetProvisioningSpecificationsProperty {
      /**
       * The launch specification for On-Demand Instances in the instance fleet, which determines
       * the allocation strategy.
       *
       *
       * The instance fleet configuration is available only in Amazon EMR releases 4.8.0 and later,
       * excluding 5.0.x versions. On-Demand Instances allocation strategy is available in Amazon EMR
       * releases 5.12.1 and later.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-instancefleetprovisioningspecifications.html#cfn-emr-instancefleetconfig-instancefleetprovisioningspecifications-ondemandspecification)
       */
      override fun onDemandSpecification(): Any? = unwrap(this).getOnDemandSpecification()

      /**
       * The launch specification for Spot instances in the fleet, which determines the defined
       * duration, provisioning timeout behavior, and allocation strategy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-instancefleetprovisioningspecifications.html#cfn-emr-instancefleetconfig-instancefleetprovisioningspecifications-spotspecification)
       */
      override fun spotSpecification(): Any? = unwrap(this).getSpotSpecification()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InstanceFleetProvisioningSpecificationsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty):
          InstanceFleetProvisioningSpecificationsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceFleetProvisioningSpecificationsProperty):
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty
    }
  }
}
