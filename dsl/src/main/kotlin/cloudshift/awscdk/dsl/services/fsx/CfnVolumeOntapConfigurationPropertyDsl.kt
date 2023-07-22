@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fsx

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.fsx.CfnVolume

@CdkDslMarker
public class CfnVolumeOntapConfigurationPropertyDsl {
  private val cdkBuilder: CfnVolume.OntapConfigurationProperty.Builder =
      CfnVolume.OntapConfigurationProperty.builder()

  /**
   * @param copyTagsToBackups A boolean flag indicating whether tags for the volume should be copied
   * to backups.
   * This value defaults to false. If it's set to true, all tags for the volume are copied to all
   * automatic and user-initiated backups where the user doesn't specify tags. If this value is true,
   * and you specify one or more tags, only the specified tags are copied to backups. If you specify
   * one or more tags when creating a user-initiated backup, no tags are copied from the volume,
   * regardless of this value.
   */
  public fun copyTagsToBackups(copyTagsToBackups: String) {
    cdkBuilder.copyTagsToBackups(copyTagsToBackups)
  }

  /**
   * @param junctionPath Specifies the location in the SVM's namespace where the volume is mounted.
   *  The `JunctionPath` must have a leading forward slash, such as `/vol3` .
   */
  public fun junctionPath(junctionPath: String) {
    cdkBuilder.junctionPath(junctionPath)
  }

  /**
   * @param ontapVolumeType Specifies the type of volume you are creating. Valid values are the
   * following:.
   * * `RW` specifies a read/write volume. `RW` is the default.
   * * `DP` specifies a data-protection volume. A `DP` volume is read-only and can be used as the
   * destination of a NetApp SnapMirror relationship.
   *
   * For more information, see [Volume
   * types](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-types) in the *Amazon FSx for
   * NetApp ONTAP User Guide* .
   */
  public fun ontapVolumeType(ontapVolumeType: String) {
    cdkBuilder.ontapVolumeType(ontapVolumeType)
  }

  /**
   * @param securityStyle Specifies the security style for the volume.
   * If a volume's security style is not specified, it is automatically set to the root volume's
   * security style. The security style determines the type of permissions that FSx for ONTAP uses to
   * control data access. For more information, see [Volume security
   * style](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-volumes.html#volume-security-style)
   * in the *Amazon FSx for NetApp ONTAP User Guide* . Specify one of the following values:
   *
   * * `UNIX` if the file system is managed by a UNIX administrator, the majority of users are NFS
   * clients, and an application accessing the data uses a UNIX user as the service account.
   * * `NTFS` if the file system is managed by a Windows administrator, the majority of users are
   * SMB clients, and an application accessing the data uses a Windows user as the service account.
   * * `MIXED` if the file system is managed by both UNIX and Windows administrators and users
   * consist of both NFS and SMB clients.
   */
  public fun securityStyle(securityStyle: String) {
    cdkBuilder.securityStyle(securityStyle)
  }

  /**
   * @param sizeInMegabytes Specifies the size of the volume, in megabytes (MB), that you are
   * creating. 
   * Provide any whole number in the range of 20–104857600 to specify the size of the volume.
   */
  public fun sizeInMegabytes(sizeInMegabytes: String) {
    cdkBuilder.sizeInMegabytes(sizeInMegabytes)
  }

  /**
   * @param snapshotPolicy Specifies the snapshot policy for the volume. There are three built-in
   * snapshot policies:.
   * * `default` : This is the default policy. A maximum of six hourly snapshots taken five minutes
   * past the hour. A maximum of two daily snapshots taken Monday through Saturday at 10 minutes after
   * midnight. A maximum of two weekly snapshots taken every Sunday at 15 minutes after midnight.
   * * `default-1weekly` : This policy is the same as the `default` policy except that it only
   * retains one snapshot from the weekly schedule.
   * * `none` : This policy does not take any snapshots. This policy can be assigned to volumes to
   * prevent automatic snapshots from being taken.
   *
   * You can also provide the name of a custom policy that you created with the ONTAP CLI or REST
   * API.
   *
   * For more information, see [Snapshot
   * policies](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snapshots-ontap.html#snapshot-policies)
   * in the *Amazon FSx for NetApp ONTAP User Guide* .
   */
  public fun snapshotPolicy(snapshotPolicy: String) {
    cdkBuilder.snapshotPolicy(snapshotPolicy)
  }

  /**
   * @param storageEfficiencyEnabled Set to true to enable deduplication, compression, and
   * compaction storage efficiency features on the volume, or set to false to disable them.
   */
  public fun storageEfficiencyEnabled(storageEfficiencyEnabled: String) {
    cdkBuilder.storageEfficiencyEnabled(storageEfficiencyEnabled)
  }

  /**
   * @param storageVirtualMachineId Specifies the ONTAP SVM in which to create the volume. 
   */
  public fun storageVirtualMachineId(storageVirtualMachineId: String) {
    cdkBuilder.storageVirtualMachineId(storageVirtualMachineId)
  }

  /**
   * @param tieringPolicy Describes the data tiering policy for an ONTAP volume.
   * When enabled, Amazon FSx for ONTAP's intelligent tiering automatically transitions a volume's
   * data between the file system's primary storage and capacity pool storage based on your access
   * patterns.
   *
   * Valid tiering policies are the following:
   *
   * * `SNAPSHOT_ONLY` - (Default value) moves cold snapshots to the capacity pool storage tier.
   * * `AUTO` - moves cold user data and snapshots to the capacity pool storage tier based on your
   * access patterns.
   * * `ALL` - moves all user data blocks in both the active file system and Snapshot copies to the
   * storage pool tier.
   * * `NONE` - keeps a volume's data in the primary storage tier, preventing it from being moved to
   * the capacity pool tier.
   */
  public fun tieringPolicy(tieringPolicy: IResolvable) {
    cdkBuilder.tieringPolicy(tieringPolicy)
  }

  /**
   * @param tieringPolicy Describes the data tiering policy for an ONTAP volume.
   * When enabled, Amazon FSx for ONTAP's intelligent tiering automatically transitions a volume's
   * data between the file system's primary storage and capacity pool storage based on your access
   * patterns.
   *
   * Valid tiering policies are the following:
   *
   * * `SNAPSHOT_ONLY` - (Default value) moves cold snapshots to the capacity pool storage tier.
   * * `AUTO` - moves cold user data and snapshots to the capacity pool storage tier based on your
   * access patterns.
   * * `ALL` - moves all user data blocks in both the active file system and Snapshot copies to the
   * storage pool tier.
   * * `NONE` - keeps a volume's data in the primary storage tier, preventing it from being moved to
   * the capacity pool tier.
   */
  public fun tieringPolicy(tieringPolicy: CfnVolume.TieringPolicyProperty) {
    cdkBuilder.tieringPolicy(tieringPolicy)
  }

  public fun build(): CfnVolume.OntapConfigurationProperty = cdkBuilder.build()
}
