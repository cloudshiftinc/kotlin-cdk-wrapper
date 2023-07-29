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

package cloudshift.awscdk.dsl.services.fsx

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.fsx.CfnVolume
import software.amazon.awscdk.services.fsx.CfnVolumeProps

/**
 * Properties for defining a `CfnVolume`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.fsx.*;
 * CfnVolumeProps cfnVolumeProps = CfnVolumeProps.builder()
 * .name("name")
 * // the properties below are optional
 * .backupId("backupId")
 * .ontapConfiguration(OntapConfigurationProperty.builder()
 * .sizeInMegabytes("sizeInMegabytes")
 * .storageVirtualMachineId("storageVirtualMachineId")
 * // the properties below are optional
 * .copyTagsToBackups("copyTagsToBackups")
 * .junctionPath("junctionPath")
 * .ontapVolumeType("ontapVolumeType")
 * .securityStyle("securityStyle")
 * .snapshotPolicy("snapshotPolicy")
 * .storageEfficiencyEnabled("storageEfficiencyEnabled")
 * .tieringPolicy(TieringPolicyProperty.builder()
 * .coolingPeriod(123)
 * .name("name")
 * .build())
 * .build())
 * .openZfsConfiguration(OpenZFSConfigurationProperty.builder()
 * .parentVolumeId("parentVolumeId")
 * // the properties below are optional
 * .copyTagsToSnapshots(false)
 * .dataCompressionType("dataCompressionType")
 * .nfsExports(List.of(NfsExportsProperty.builder()
 * .clientConfigurations(List.of(ClientConfigurationsProperty.builder()
 * .clients("clients")
 * .options(List.of("options"))
 * .build()))
 * .build()))
 * .options(List.of("options"))
 * .originSnapshot(OriginSnapshotProperty.builder()
 * .copyStrategy("copyStrategy")
 * .snapshotArn("snapshotArn")
 * .build())
 * .readOnly(false)
 * .recordSizeKiB(123)
 * .storageCapacityQuotaGiB(123)
 * .storageCapacityReservationGiB(123)
 * .userAndGroupQuotas(List.of(UserAndGroupQuotasProperty.builder()
 * .id(123)
 * .storageCapacityQuotaGiB(123)
 * .type("type")
 * .build()))
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .volumeType("volumeType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-volume.html)
 */
@CdkDslMarker
public class CfnVolumePropsDsl {
    private val cdkBuilder: CfnVolumeProps.Builder = CfnVolumeProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param backupId Specifies the ID of the volume backup to use to create a new volume. */
    public fun backupId(backupId: String) {
        cdkBuilder.backupId(backupId)
    }

    /** @param name The name of the volume. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param ontapConfiguration The configuration of an Amazon FSx for NetApp ONTAP volume. */
    public fun ontapConfiguration(ontapConfiguration: IResolvable) {
        cdkBuilder.ontapConfiguration(ontapConfiguration)
    }

    /** @param ontapConfiguration The configuration of an Amazon FSx for NetApp ONTAP volume. */
    public fun ontapConfiguration(ontapConfiguration: CfnVolume.OntapConfigurationProperty) {
        cdkBuilder.ontapConfiguration(ontapConfiguration)
    }

    /** @param openZfsConfiguration The configuration of an Amazon FSx for OpenZFS volume. */
    public fun openZfsConfiguration(openZfsConfiguration: IResolvable) {
        cdkBuilder.openZfsConfiguration(openZfsConfiguration)
    }

    /** @param openZfsConfiguration The configuration of an Amazon FSx for OpenZFS volume. */
    public fun openZfsConfiguration(openZfsConfiguration: CfnVolume.OpenZFSConfigurationProperty) {
        cdkBuilder.openZfsConfiguration(openZfsConfiguration)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /** @param volumeType The type of the volume. */
    public fun volumeType(volumeType: String) {
        cdkBuilder.volumeType(volumeType)
    }

    public fun build(): CfnVolumeProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
