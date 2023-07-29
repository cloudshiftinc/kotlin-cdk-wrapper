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
import kotlin.Boolean
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnCluster

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
@CdkDslMarker
public class CfnClusterEbsConfigurationPropertyDsl {
    private val cdkBuilder: CfnCluster.EbsConfigurationProperty.Builder =
        CfnCluster.EbsConfigurationProperty.builder()

    private val _ebsBlockDeviceConfigs: MutableList<Any> = mutableListOf()

    /**
     * @param ebsBlockDeviceConfigs An array of Amazon EBS volume specifications attached to a
     *   cluster instance.
     */
    public fun ebsBlockDeviceConfigs(vararg ebsBlockDeviceConfigs: Any) {
        _ebsBlockDeviceConfigs.addAll(listOf(*ebsBlockDeviceConfigs))
    }

    /**
     * @param ebsBlockDeviceConfigs An array of Amazon EBS volume specifications attached to a
     *   cluster instance.
     */
    public fun ebsBlockDeviceConfigs(ebsBlockDeviceConfigs: Collection<Any>) {
        _ebsBlockDeviceConfigs.addAll(ebsBlockDeviceConfigs)
    }

    /**
     * @param ebsBlockDeviceConfigs An array of Amazon EBS volume specifications attached to a
     *   cluster instance.
     */
    public fun ebsBlockDeviceConfigs(ebsBlockDeviceConfigs: IResolvable) {
        cdkBuilder.ebsBlockDeviceConfigs(ebsBlockDeviceConfigs)
    }

    /** @param ebsOptimized Indicates whether an Amazon EBS volume is EBS-optimized. */
    public fun ebsOptimized(ebsOptimized: Boolean) {
        cdkBuilder.ebsOptimized(ebsOptimized)
    }

    /** @param ebsOptimized Indicates whether an Amazon EBS volume is EBS-optimized. */
    public fun ebsOptimized(ebsOptimized: IResolvable) {
        cdkBuilder.ebsOptimized(ebsOptimized)
    }

    public fun build(): CfnCluster.EbsConfigurationProperty {
        if (_ebsBlockDeviceConfigs.isNotEmpty())
            cdkBuilder.ebsBlockDeviceConfigs(_ebsBlockDeviceConfigs)
        return cdkBuilder.build()
    }
}
