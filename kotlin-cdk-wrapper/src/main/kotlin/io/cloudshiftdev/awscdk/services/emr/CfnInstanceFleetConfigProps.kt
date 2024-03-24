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
 * Properties for defining a `CfnInstanceFleetConfig`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.emr.*;
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancefleetconfig.html)
 */
public interface CfnInstanceFleetConfigProps {
  /**
   * The unique identifier of the EMR cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancefleetconfig.html#cfn-emr-instancefleetconfig-clusterid)
   */
  public fun clusterId(): String

  /**
   * The node type that the instance fleet hosts.
   *
   * *Allowed Values* : TASK
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancefleetconfig.html#cfn-emr-instancefleetconfig-instancefleettype)
   */
  public fun instanceFleetType(): String

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
   */
  public fun instanceTypeConfigs(): Any? = unwrap(this).getInstanceTypeConfigs()

  /**
   * The launch specification for the instance fleet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancefleetconfig.html#cfn-emr-instancefleetconfig-launchspecifications)
   */
  public fun launchSpecifications(): Any? = unwrap(this).getLaunchSpecifications()

  /**
   * The friendly name of the instance fleet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancefleetconfig.html#cfn-emr-instancefleetconfig-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The target capacity of On-Demand units for the instance fleet, which determines how many
   * On-Demand instances to provision.
   *
   * When the instance fleet launches, Amazon EMR tries to provision On-Demand instances as
   * specified by `InstanceTypeConfig` . Each instance configuration has a specified `WeightedCapacity`
   * . When an On-Demand instance is provisioned, the `WeightedCapacity` units count toward the target
   * capacity. Amazon EMR provisions instances until the target capacity is totally fulfilled, even if
   * this results in an overage. For example, if there are 2 units remaining to fulfill capacity, and
   * Amazon EMR can only provision an instance with a `WeightedCapacity` of 5 units, the instance is
   * provisioned, and the target capacity is exceeded by 3 units.
   *
   *
   * If not specified or set to 0, only Spot instances are provisioned for the instance fleet using
   * `TargetSpotCapacity` . At least one of `TargetSpotCapacity` and `TargetOnDemandCapacity` should be
   * greater than 0. For a master instance fleet, only one of `TargetSpotCapacity` and
   * `TargetOnDemandCapacity` can be specified, and its value must be 1.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancefleetconfig.html#cfn-emr-instancefleetconfig-targetondemandcapacity)
   */
  public fun targetOnDemandCapacity(): Number? = unwrap(this).getTargetOnDemandCapacity()

  /**
   * The target capacity of Spot units for the instance fleet, which determines how many Spot
   * instances to provision.
   *
   * When the instance fleet launches, Amazon EMR tries to provision Spot instances as specified by
   * `InstanceTypeConfig` . Each instance configuration has a specified `WeightedCapacity` . When a
   * Spot instance is provisioned, the `WeightedCapacity` units count toward the target capacity.
   * Amazon EMR provisions instances until the target capacity is totally fulfilled, even if this
   * results in an overage. For example, if there are 2 units remaining to fulfill capacity, and Amazon
   * EMR can only provision an instance with a `WeightedCapacity` of 5 units, the instance is
   * provisioned, and the target capacity is exceeded by 3 units.
   *
   *
   * If not specified or set to 0, only On-Demand instances are provisioned for the instance fleet.
   * At least one of `TargetSpotCapacity` and `TargetOnDemandCapacity` should be greater than 0. For a
   * master instance fleet, only one of `TargetSpotCapacity` and `TargetOnDemandCapacity` can be
   * specified, and its value must be 1.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancefleetconfig.html#cfn-emr-instancefleetconfig-targetspotcapacity)
   */
  public fun targetSpotCapacity(): Number? = unwrap(this).getTargetSpotCapacity()

  /**
   * A builder for [CfnInstanceFleetConfigProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param clusterId The unique identifier of the EMR cluster. 
     */
    public fun clusterId(clusterId: String)

    /**
     * @param instanceFleetType The node type that the instance fleet hosts. 
     * *Allowed Values* : TASK
     */
    public fun instanceFleetType(instanceFleetType: String)

    /**
     * @param instanceTypeConfigs `InstanceTypeConfigs` determine the EC2 instances that Amazon EMR
     * attempts to provision to fulfill On-Demand and Spot target capacities.
     *
     * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later,
     * excluding 5.0.x versions.
     */
    public fun instanceTypeConfigs(instanceTypeConfigs: IResolvable)

    /**
     * @param instanceTypeConfigs `InstanceTypeConfigs` determine the EC2 instances that Amazon EMR
     * attempts to provision to fulfill On-Demand and Spot target capacities.
     *
     * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later,
     * excluding 5.0.x versions.
     */
    public fun instanceTypeConfigs(instanceTypeConfigs: List<Any>)

    /**
     * @param instanceTypeConfigs `InstanceTypeConfigs` determine the EC2 instances that Amazon EMR
     * attempts to provision to fulfill On-Demand and Spot target capacities.
     *
     * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later,
     * excluding 5.0.x versions.
     */
    public fun instanceTypeConfigs(vararg instanceTypeConfigs: Any)

    /**
     * @param launchSpecifications The launch specification for the instance fleet.
     */
    public fun launchSpecifications(launchSpecifications: IResolvable)

    /**
     * @param launchSpecifications The launch specification for the instance fleet.
     */
    public
        fun launchSpecifications(launchSpecifications: CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty)

    /**
     * @param launchSpecifications The launch specification for the instance fleet.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0cb8bce8d092d4eb1af0eb5107a3e18c525496dc61feee2b3c354bbc087ca708")
    public
        fun launchSpecifications(launchSpecifications: CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty.Builder.() -> Unit)

    /**
     * @param name The friendly name of the instance fleet.
     */
    public fun name(name: String)

    /**
     * @param targetOnDemandCapacity The target capacity of On-Demand units for the instance fleet,
     * which determines how many On-Demand instances to provision.
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
     */
    public fun targetOnDemandCapacity(targetOnDemandCapacity: Number)

    /**
     * @param targetSpotCapacity The target capacity of Spot units for the instance fleet, which
     * determines how many Spot instances to provision.
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
     */
    public fun targetSpotCapacity(targetSpotCapacity: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.emr.CfnInstanceFleetConfigProps.Builder
        = software.amazon.awscdk.services.emr.CfnInstanceFleetConfigProps.builder()

    /**
     * @param clusterId The unique identifier of the EMR cluster. 
     */
    override fun clusterId(clusterId: String) {
      cdkBuilder.clusterId(clusterId)
    }

    /**
     * @param instanceFleetType The node type that the instance fleet hosts. 
     * *Allowed Values* : TASK
     */
    override fun instanceFleetType(instanceFleetType: String) {
      cdkBuilder.instanceFleetType(instanceFleetType)
    }

    /**
     * @param instanceTypeConfigs `InstanceTypeConfigs` determine the EC2 instances that Amazon EMR
     * attempts to provision to fulfill On-Demand and Spot target capacities.
     *
     * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later,
     * excluding 5.0.x versions.
     */
    override fun instanceTypeConfigs(instanceTypeConfigs: IResolvable) {
      cdkBuilder.instanceTypeConfigs(instanceTypeConfigs.let(IResolvable::unwrap))
    }

    /**
     * @param instanceTypeConfigs `InstanceTypeConfigs` determine the EC2 instances that Amazon EMR
     * attempts to provision to fulfill On-Demand and Spot target capacities.
     *
     * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later,
     * excluding 5.0.x versions.
     */
    override fun instanceTypeConfigs(instanceTypeConfigs: List<Any>) {
      cdkBuilder.instanceTypeConfigs(instanceTypeConfigs.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param instanceTypeConfigs `InstanceTypeConfigs` determine the EC2 instances that Amazon EMR
     * attempts to provision to fulfill On-Demand and Spot target capacities.
     *
     * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later,
     * excluding 5.0.x versions.
     */
    override fun instanceTypeConfigs(vararg instanceTypeConfigs: Any): Unit =
        instanceTypeConfigs(instanceTypeConfigs.toList())

    /**
     * @param launchSpecifications The launch specification for the instance fleet.
     */
    override fun launchSpecifications(launchSpecifications: IResolvable) {
      cdkBuilder.launchSpecifications(launchSpecifications.let(IResolvable::unwrap))
    }

    /**
     * @param launchSpecifications The launch specification for the instance fleet.
     */
    override
        fun launchSpecifications(launchSpecifications: CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty) {
      cdkBuilder.launchSpecifications(launchSpecifications.let(CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty::unwrap))
    }

    /**
     * @param launchSpecifications The launch specification for the instance fleet.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0cb8bce8d092d4eb1af0eb5107a3e18c525496dc61feee2b3c354bbc087ca708")
    override
        fun launchSpecifications(launchSpecifications: CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty.Builder.() -> Unit):
        Unit =
        launchSpecifications(CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty(launchSpecifications))

    /**
     * @param name The friendly name of the instance fleet.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param targetOnDemandCapacity The target capacity of On-Demand units for the instance fleet,
     * which determines how many On-Demand instances to provision.
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
     */
    override fun targetOnDemandCapacity(targetOnDemandCapacity: Number) {
      cdkBuilder.targetOnDemandCapacity(targetOnDemandCapacity)
    }

    /**
     * @param targetSpotCapacity The target capacity of Spot units for the instance fleet, which
     * determines how many Spot instances to provision.
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
     */
    override fun targetSpotCapacity(targetSpotCapacity: Number) {
      cdkBuilder.targetSpotCapacity(targetSpotCapacity)
    }

    public fun build(): software.amazon.awscdk.services.emr.CfnInstanceFleetConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.emr.CfnInstanceFleetConfigProps,
  ) : CdkObject(cdkObject), CfnInstanceFleetConfigProps {
    /**
     * The unique identifier of the EMR cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancefleetconfig.html#cfn-emr-instancefleetconfig-clusterid)
     */
    override fun clusterId(): String = unwrap(this).getClusterId()

    /**
     * The node type that the instance fleet hosts.
     *
     * *Allowed Values* : TASK
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancefleetconfig.html#cfn-emr-instancefleetconfig-instancefleettype)
     */
    override fun instanceFleetType(): String = unwrap(this).getInstanceFleetType()

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
     */
    override fun instanceTypeConfigs(): Any? = unwrap(this).getInstanceTypeConfigs()

    /**
     * The launch specification for the instance fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancefleetconfig.html#cfn-emr-instancefleetconfig-launchspecifications)
     */
    override fun launchSpecifications(): Any? = unwrap(this).getLaunchSpecifications()

    /**
     * The friendly name of the instance fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancefleetconfig.html#cfn-emr-instancefleetconfig-name)
     */
    override fun name(): String? = unwrap(this).getName()

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
     */
    override fun targetOnDemandCapacity(): Number? = unwrap(this).getTargetOnDemandCapacity()

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
     */
    override fun targetSpotCapacity(): Number? = unwrap(this).getTargetSpotCapacity()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnInstanceFleetConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceFleetConfigProps):
        CfnInstanceFleetConfigProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnInstanceFleetConfigProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInstanceFleetConfigProps):
        software.amazon.awscdk.services.emr.CfnInstanceFleetConfigProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.emr.CfnInstanceFleetConfigProps
  }
}
