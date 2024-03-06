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

package io.cloudshiftdev.awscdkdsl.services.stepfunctions.tasks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

/**
 * The Amazon EBS configuration of a cluster instance.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.stepfunctions.tasks.*;
 * Size size;
 * EbsConfigurationProperty ebsConfigurationProperty = EbsConfigurationProperty.builder()
 * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
 * .volumeSpecification(VolumeSpecificationProperty.builder()
 * .volumeSize(size)
 * .volumeType(EmrCreateCluster.getEbsBlockDeviceVolumeType().GP3)
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
 * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_EbsConfiguration.html)
 */
@CdkDslMarker
public class EmrCreateClusterEbsConfigurationPropertyDsl {
    private val cdkBuilder: EmrCreateCluster.EbsConfigurationProperty.Builder =
        EmrCreateCluster.EbsConfigurationProperty.builder()

    private val _ebsBlockDeviceConfigs: MutableList<EmrCreateCluster.EbsBlockDeviceConfigProperty> =
        mutableListOf()

    /**
     * @param ebsBlockDeviceConfigs An array of Amazon EBS volume specifications attached to a
     *   cluster instance.
     */
    public fun ebsBlockDeviceConfigs(
        ebsBlockDeviceConfigs: EmrCreateClusterEbsBlockDeviceConfigPropertyDsl.() -> Unit
    ) {
        _ebsBlockDeviceConfigs.add(
            EmrCreateClusterEbsBlockDeviceConfigPropertyDsl().apply(ebsBlockDeviceConfigs).build()
        )
    }

    /**
     * @param ebsBlockDeviceConfigs An array of Amazon EBS volume specifications attached to a
     *   cluster instance.
     */
    public fun ebsBlockDeviceConfigs(
        ebsBlockDeviceConfigs: Collection<EmrCreateCluster.EbsBlockDeviceConfigProperty>
    ) {
        _ebsBlockDeviceConfigs.addAll(ebsBlockDeviceConfigs)
    }

    /** @param ebsOptimized Indicates whether an Amazon EBS volume is EBS-optimized. */
    public fun ebsOptimized(ebsOptimized: Boolean) {
        cdkBuilder.ebsOptimized(ebsOptimized)
    }

    public fun build(): EmrCreateCluster.EbsConfigurationProperty {
        if (_ebsBlockDeviceConfigs.isNotEmpty())
            cdkBuilder.ebsBlockDeviceConfigs(_ebsBlockDeviceConfigs)
        return cdkBuilder.build()
    }
}
