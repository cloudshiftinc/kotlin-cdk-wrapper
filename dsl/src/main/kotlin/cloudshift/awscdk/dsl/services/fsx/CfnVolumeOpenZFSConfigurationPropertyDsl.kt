@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fsx

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.fsx.CfnVolume

@CdkDslMarker
public class CfnVolumeOpenZFSConfigurationPropertyDsl {
  private val cdkBuilder: CfnVolume.OpenZFSConfigurationProperty.Builder =
      CfnVolume.OpenZFSConfigurationProperty.builder()

  private val _nfsExports: MutableList<Any> = mutableListOf()

  private val _options: MutableList<String> = mutableListOf()

  private val _userAndGroupQuotas: MutableList<Any> = mutableListOf()

  /**
   * @param copyTagsToSnapshots A Boolean value indicating whether tags for the volume should be
   * copied to snapshots.
   * This value defaults to `false` . If it's set to `true` , all tags for the volume are copied to
   * snapshots where the user doesn't specify tags. If this value is `true` , and you specify one or
   * more tags, only the specified tags are copied to snapshots. If you specify one or more tags when
   * creating the snapshot, no tags are copied from the volume, regardless of this value.
   */
  public fun copyTagsToSnapshots(copyTagsToSnapshots: Boolean) {
    cdkBuilder.copyTagsToSnapshots(copyTagsToSnapshots)
  }

  /**
   * @param copyTagsToSnapshots A Boolean value indicating whether tags for the volume should be
   * copied to snapshots.
   * This value defaults to `false` . If it's set to `true` , all tags for the volume are copied to
   * snapshots where the user doesn't specify tags. If this value is `true` , and you specify one or
   * more tags, only the specified tags are copied to snapshots. If you specify one or more tags when
   * creating the snapshot, no tags are copied from the volume, regardless of this value.
   */
  public fun copyTagsToSnapshots(copyTagsToSnapshots: IResolvable) {
    cdkBuilder.copyTagsToSnapshots(copyTagsToSnapshots)
  }

  /**
   * @param dataCompressionType Specifies the method used to compress the data on the volume. The
   * compression type is `NONE` by default.
   * * `NONE` - Doesn't compress the data on the volume. `NONE` is the default.
   * * `ZSTD` - Compresses the data in the volume using the Zstandard (ZSTD) compression algorithm.
   * Compared to LZ4, Z-Standard provides a better compression ratio to minimize on-disk storage
   * utilization.
   * * `LZ4` - Compresses the data in the volume using the LZ4 compression algorithm. Compared to
   * Z-Standard, LZ4 is less compute-intensive and delivers higher write throughput speeds.
   */
  public fun dataCompressionType(dataCompressionType: String) {
    cdkBuilder.dataCompressionType(dataCompressionType)
  }

  /**
   * @param nfsExports The configuration object for mounting a Network File System (NFS) file
   * system.
   */
  public fun nfsExports(vararg nfsExports: Any) {
    _nfsExports.addAll(listOf(*nfsExports))
  }

  /**
   * @param nfsExports The configuration object for mounting a Network File System (NFS) file
   * system.
   */
  public fun nfsExports(nfsExports: Collection<Any>) {
    _nfsExports.addAll(nfsExports)
  }

  /**
   * @param nfsExports The configuration object for mounting a Network File System (NFS) file
   * system.
   */
  public fun nfsExports(nfsExports: IResolvable) {
    cdkBuilder.nfsExports(nfsExports)
  }

  /**
   * @param options To delete the volume's child volumes, snapshots, and clones, use the string
   * `DELETE_CHILD_VOLUMES_AND_SNAPSHOTS` .
   */
  public fun options(vararg options: String) {
    _options.addAll(listOf(*options))
  }

  /**
   * @param options To delete the volume's child volumes, snapshots, and clones, use the string
   * `DELETE_CHILD_VOLUMES_AND_SNAPSHOTS` .
   */
  public fun options(options: Collection<String>) {
    _options.addAll(options)
  }

  /**
   * @param originSnapshot The configuration object that specifies the snapshot to use as the origin
   * of the data for the volume.
   */
  public fun originSnapshot(originSnapshot: IResolvable) {
    cdkBuilder.originSnapshot(originSnapshot)
  }

  /**
   * @param originSnapshot The configuration object that specifies the snapshot to use as the origin
   * of the data for the volume.
   */
  public fun originSnapshot(originSnapshot: CfnVolume.OriginSnapshotProperty) {
    cdkBuilder.originSnapshot(originSnapshot)
  }

  /**
   * @param parentVolumeId The ID of the volume to use as the parent volume of the volume that you
   * are creating. 
   */
  public fun parentVolumeId(parentVolumeId: String) {
    cdkBuilder.parentVolumeId(parentVolumeId)
  }

  /**
   * @param readOnly A Boolean value indicating whether the volume is read-only.
   */
  public fun readOnly(readOnly: Boolean) {
    cdkBuilder.readOnly(readOnly)
  }

  /**
   * @param readOnly A Boolean value indicating whether the volume is read-only.
   */
  public fun readOnly(readOnly: IResolvable) {
    cdkBuilder.readOnly(readOnly)
  }

  /**
   * @param recordSizeKiB Specifies the suggested block size for a volume in a ZFS dataset, in
   * kibibytes (KiB).
   * Valid values are 4, 8, 16, 32, 64, 128, 256, 512, or 1024 KiB. The default is 128 KiB. We
   * recommend using the default setting for the majority of use cases. Generally, workloads that write
   * in fixed small or large record sizes may benefit from setting a custom record size, like database
   * workloads (small record size) or media streaming workloads (large record size). For additional
   * guidance on when to set a custom record size, see [ZFS Record
   * size](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#record-size-performance)
   * in the *Amazon FSx for OpenZFS User Guide* .
   */
  public fun recordSizeKiB(recordSizeKiB: Number) {
    cdkBuilder.recordSizeKiB(recordSizeKiB)
  }

  /**
   * @param storageCapacityQuotaGiB Sets the maximum storage size in gibibytes (GiB) for the volume.
   * You can specify a quota that is larger than the storage on the parent volume. A volume quota
   * limits the amount of storage that the volume can consume to the configured amount, but does not
   * guarantee the space will be available on the parent volume. To guarantee quota space, you must
   * also set `StorageCapacityReservationGiB` . To *not* specify a storage capacity quota, set this to
   * `-1` .
   *
   * For more information, see [Volume
   * properties](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/managing-volumes.html#volume-properties)
   * in the *Amazon FSx for OpenZFS User Guide* .
   */
  public fun storageCapacityQuotaGiB(storageCapacityQuotaGiB: Number) {
    cdkBuilder.storageCapacityQuotaGiB(storageCapacityQuotaGiB)
  }

  /**
   * @param storageCapacityReservationGiB Specifies the amount of storage in gibibytes (GiB) to
   * reserve from the parent volume.
   * Setting `StorageCapacityReservationGiB` guarantees that the specified amount of storage space
   * on the parent volume will always be available for the volume. You can't reserve more storage than
   * the parent volume has. To *not* specify a storage capacity reservation, set this to `0` or `-1` .
   * For more information, see [Volume
   * properties](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/managing-volumes.html#volume-properties)
   * in the *Amazon FSx for OpenZFS User Guide* .
   */
  public fun storageCapacityReservationGiB(storageCapacityReservationGiB: Number) {
    cdkBuilder.storageCapacityReservationGiB(storageCapacityReservationGiB)
  }

  /**
   * @param userAndGroupQuotas An object specifying how much storage users or groups can use on the
   * volume.
   */
  public fun userAndGroupQuotas(vararg userAndGroupQuotas: Any) {
    _userAndGroupQuotas.addAll(listOf(*userAndGroupQuotas))
  }

  /**
   * @param userAndGroupQuotas An object specifying how much storage users or groups can use on the
   * volume.
   */
  public fun userAndGroupQuotas(userAndGroupQuotas: Collection<Any>) {
    _userAndGroupQuotas.addAll(userAndGroupQuotas)
  }

  /**
   * @param userAndGroupQuotas An object specifying how much storage users or groups can use on the
   * volume.
   */
  public fun userAndGroupQuotas(userAndGroupQuotas: IResolvable) {
    cdkBuilder.userAndGroupQuotas(userAndGroupQuotas)
  }

  public fun build(): CfnVolume.OpenZFSConfigurationProperty {
    if(_nfsExports.isNotEmpty()) cdkBuilder.nfsExports(_nfsExports)
    if(_options.isNotEmpty()) cdkBuilder.options(_options)
    if(_userAndGroupQuotas.isNotEmpty()) cdkBuilder.userAndGroupQuotas(_userAndGroupQuotas)
    return cdkBuilder.build()
  }
}
