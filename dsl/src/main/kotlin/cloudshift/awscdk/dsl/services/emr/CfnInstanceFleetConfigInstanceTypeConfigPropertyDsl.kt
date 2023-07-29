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

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnInstanceFleetConfig

/**
 * `InstanceType` config is a subproperty of `InstanceFleetConfig` .
 *
 * An instance type configuration specifies each instance type in an instance fleet. The
 * configuration determines the EC2 instances Amazon EMR attempts to provision to fulfill On-Demand
 * and Spot target capacities.
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
@CdkDslMarker
public class CfnInstanceFleetConfigInstanceTypeConfigPropertyDsl {
    private val cdkBuilder: CfnInstanceFleetConfig.InstanceTypeConfigProperty.Builder =
        CfnInstanceFleetConfig.InstanceTypeConfigProperty.builder()

    private val _configurations: MutableList<Any> = mutableListOf()

    /**
     * @param bidPrice The bid price for each Amazon EC2 Spot Instance type as defined by
     *   `InstanceType` . Expressed in USD. If neither `BidPrice` nor
     *   `BidPriceAsPercentageOfOnDemandPrice` is provided, `BidPriceAsPercentageOfOnDemandPrice`
     *   defaults to 100%.
     */
    public fun bidPrice(bidPrice: String) {
        cdkBuilder.bidPrice(bidPrice)
    }

    /**
     * @param bidPriceAsPercentageOfOnDemandPrice The bid price, as a percentage of On-Demand price,
     *   for each Amazon EC2 Spot Instance as defined by `InstanceType` . Expressed as a number (for
     *   example, 20 specifies 20%). If neither `BidPrice` nor `BidPriceAsPercentageOfOnDemandPrice`
     *   is provided, `BidPriceAsPercentageOfOnDemandPrice` defaults to 100%.
     */
    public fun bidPriceAsPercentageOfOnDemandPrice(bidPriceAsPercentageOfOnDemandPrice: Number) {
        cdkBuilder.bidPriceAsPercentageOfOnDemandPrice(bidPriceAsPercentageOfOnDemandPrice)
    }

    /**
     * @param configurations Amazon EMR releases 4.x or later. An optional configuration
     *   specification to be used when provisioning cluster instances, which can include
     *   configurations for applications and software bundled with Amazon EMR. A configuration
     *   consists of a classification, properties, and optional nested configurations. A
     *   classification refers to an application-specific configuration file. Properties are the
     *   settings you want to change in that file. For more information, see
     *   [Configuring Applications](https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-configure-apps.html)
     *   .
     */
    public fun configurations(vararg configurations: Any) {
        _configurations.addAll(listOf(*configurations))
    }

    /**
     * @param configurations Amazon EMR releases 4.x or later. An optional configuration
     *   specification to be used when provisioning cluster instances, which can include
     *   configurations for applications and software bundled with Amazon EMR. A configuration
     *   consists of a classification, properties, and optional nested configurations. A
     *   classification refers to an application-specific configuration file. Properties are the
     *   settings you want to change in that file. For more information, see
     *   [Configuring Applications](https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-configure-apps.html)
     *   .
     */
    public fun configurations(configurations: Collection<Any>) {
        _configurations.addAll(configurations)
    }

    /**
     * @param configurations Amazon EMR releases 4.x or later. An optional configuration
     *   specification to be used when provisioning cluster instances, which can include
     *   configurations for applications and software bundled with Amazon EMR. A configuration
     *   consists of a classification, properties, and optional nested configurations. A
     *   classification refers to an application-specific configuration file. Properties are the
     *   settings you want to change in that file. For more information, see
     *   [Configuring Applications](https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-configure-apps.html)
     *   .
     */
    public fun configurations(configurations: IResolvable) {
        cdkBuilder.configurations(configurations)
    }

    /** @param customAmiId The custom AMI ID to use for the instance type. */
    public fun customAmiId(customAmiId: String) {
        cdkBuilder.customAmiId(customAmiId)
    }

    /**
     * @param ebsConfiguration The configuration of Amazon Elastic Block Store (Amazon EBS) attached
     *   to each instance as defined by `InstanceType` .
     */
    public fun ebsConfiguration(ebsConfiguration: IResolvable) {
        cdkBuilder.ebsConfiguration(ebsConfiguration)
    }

    /**
     * @param ebsConfiguration The configuration of Amazon Elastic Block Store (Amazon EBS) attached
     *   to each instance as defined by `InstanceType` .
     */
    public fun ebsConfiguration(ebsConfiguration: CfnInstanceFleetConfig.EbsConfigurationProperty) {
        cdkBuilder.ebsConfiguration(ebsConfiguration)
    }

    /** @param instanceType An Amazon EC2 instance type, such as `m3.xlarge` . */
    public fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
    }

    /**
     * @param weightedCapacity The number of units that a provisioned instance of this type provides
     *   toward fulfilling the target capacities defined in `InstanceFleetConfig` . This value is 1
     *   for a master instance fleet, and must be 1 or greater for core and task instance fleets.
     *   Defaults to 1 if not specified.
     */
    public fun weightedCapacity(weightedCapacity: Number) {
        cdkBuilder.weightedCapacity(weightedCapacity)
    }

    public fun build(): CfnInstanceFleetConfig.InstanceTypeConfigProperty {
        if (_configurations.isNotEmpty()) cdkBuilder.configurations(_configurations)
        return cdkBuilder.build()
    }
}
