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

package io.cloudshiftdev.awscdkdsl.services.ecs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnService

/**
 * The configuration for a volume specified in the task definition as a volume that is configured at
 * launch time.
 *
 * Currently, the only supported volume type is an Amazon EBS volume.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * ServiceVolumeConfigurationProperty serviceVolumeConfigurationProperty =
 * ServiceVolumeConfigurationProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .managedEbsVolume(ServiceManagedEBSVolumeConfigurationProperty.builder()
 * .roleArn("roleArn")
 * // the properties below are optional
 * .encrypted(false)
 * .filesystemType("filesystemType")
 * .iops(123)
 * .kmsKeyId("kmsKeyId")
 * .sizeInGiB(123)
 * .snapshotId("snapshotId")
 * .tagSpecifications(List.of(EBSTagSpecificationProperty.builder()
 * .resourceType("resourceType")
 * // the properties below are optional
 * .propagateTags("propagateTags")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build()))
 * .throughput(123)
 * .volumeType("volumeType")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-servicevolumeconfiguration.html)
 */
@CdkDslMarker
public class CfnServiceServiceVolumeConfigurationPropertyDsl {
    private val cdkBuilder: CfnService.ServiceVolumeConfigurationProperty.Builder =
        CfnService.ServiceVolumeConfigurationProperty.builder()

    /**
     * @param managedEbsVolume The configuration for the Amazon EBS volume that Amazon ECS creates
     *   and manages on your behalf. These settings are used to create each Amazon EBS volume, with
     *   one volume created for each task in the service. The Amazon EBS volumes are visible in your
     *   account in the Amazon EC2 console once they are created.
     */
    public fun managedEbsVolume(managedEbsVolume: IResolvable) {
        cdkBuilder.managedEbsVolume(managedEbsVolume)
    }

    /**
     * @param managedEbsVolume The configuration for the Amazon EBS volume that Amazon ECS creates
     *   and manages on your behalf. These settings are used to create each Amazon EBS volume, with
     *   one volume created for each task in the service. The Amazon EBS volumes are visible in your
     *   account in the Amazon EC2 console once they are created.
     */
    public fun managedEbsVolume(
        managedEbsVolume: CfnService.ServiceManagedEBSVolumeConfigurationProperty
    ) {
        cdkBuilder.managedEbsVolume(managedEbsVolume)
    }

    /**
     * @param name The name of the volume. This value must match the volume name from the `Volume`
     *   object in the task definition.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnService.ServiceVolumeConfigurationProperty = cdkBuilder.build()
}
