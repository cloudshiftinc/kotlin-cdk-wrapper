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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfig

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
@CdkDslMarker
public class CfnInstanceGroupConfigEbsConfigurationPropertyDsl {
    private val cdkBuilder: CfnInstanceGroupConfig.EbsConfigurationProperty.Builder =
        CfnInstanceGroupConfig.EbsConfigurationProperty.builder()

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

    public fun build(): CfnInstanceGroupConfig.EbsConfigurationProperty {
        if (_ebsBlockDeviceConfigs.isNotEmpty())
            cdkBuilder.ebsBlockDeviceConfigs(_ebsBlockDeviceConfigs)
        return cdkBuilder.build()
    }
}
