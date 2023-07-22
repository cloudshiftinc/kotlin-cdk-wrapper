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
import software.amazon.awscdk.services.fsx.CfnFileSystem

/**
 * The configuration of an Amazon FSx for OpenZFS root volume.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.fsx.*;
 * RootVolumeConfigurationProperty rootVolumeConfigurationProperty =
 * RootVolumeConfigurationProperty.builder()
 * .copyTagsToSnapshots(false)
 * .dataCompressionType("dataCompressionType")
 * .nfsExports(List.of(NfsExportsProperty.builder()
 * .clientConfigurations(List.of(ClientConfigurationsProperty.builder()
 * .clients("clients")
 * .options(List.of("options"))
 * .build()))
 * .build()))
 * .readOnly(false)
 * .recordSizeKiB(123)
 * .userAndGroupQuotas(List.of(UserAndGroupQuotasProperty.builder()
 * .id(123)
 * .storageCapacityQuotaGiB(123)
 * .type("type")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-rootvolumeconfiguration.html)
 */
@CdkDslMarker
public class CfnFileSystemRootVolumeConfigurationPropertyDsl {
  private val cdkBuilder: CfnFileSystem.RootVolumeConfigurationProperty.Builder =
      CfnFileSystem.RootVolumeConfigurationProperty.builder()

  private val _nfsExports: MutableList<Any> = mutableListOf()

  private val _userAndGroupQuotas: MutableList<Any> = mutableListOf()

  /**
   * @param copyTagsToSnapshots A Boolean value indicating whether tags for the volume should be
   * copied to snapshots of the volume.
   * This value defaults to `false` . If it's set to `true` , all tags for the volume are copied to
   * snapshots where the user doesn't specify tags. If this value is `true` and you specify one or more
   * tags, only the specified tags are copied to snapshots. If you specify one or more tags when
   * creating the snapshot, no tags are copied from the volume, regardless of this value.
   */
  public fun copyTagsToSnapshots(copyTagsToSnapshots: Boolean) {
    cdkBuilder.copyTagsToSnapshots(copyTagsToSnapshots)
  }

  /**
   * @param copyTagsToSnapshots A Boolean value indicating whether tags for the volume should be
   * copied to snapshots of the volume.
   * This value defaults to `false` . If it's set to `true` , all tags for the volume are copied to
   * snapshots where the user doesn't specify tags. If this value is `true` and you specify one or more
   * tags, only the specified tags are copied to snapshots. If you specify one or more tags when
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
   * @param nfsExports The configuration object for mounting a file system.
   */
  public fun nfsExports(vararg nfsExports: Any) {
    _nfsExports.addAll(listOf(*nfsExports))
  }

  /**
   * @param nfsExports The configuration object for mounting a file system.
   */
  public fun nfsExports(nfsExports: Collection<Any>) {
    _nfsExports.addAll(nfsExports)
  }

  /**
   * @param nfsExports The configuration object for mounting a file system.
   */
  public fun nfsExports(nfsExports: IResolvable) {
    cdkBuilder.nfsExports(nfsExports)
  }

  /**
   * @param readOnly A Boolean value indicating whether the volume is read-only.
   * Setting this value to `true` can be useful after you have completed changes to a volume and no
   * longer want changes to occur.
   */
  public fun readOnly(readOnly: Boolean) {
    cdkBuilder.readOnly(readOnly)
  }

  /**
   * @param readOnly A Boolean value indicating whether the volume is read-only.
   * Setting this value to `true` can be useful after you have completed changes to a volume and no
   * longer want changes to occur.
   */
  public fun readOnly(readOnly: IResolvable) {
    cdkBuilder.readOnly(readOnly)
  }

  /**
   * @param recordSizeKiB Specifies the record size of an OpenZFS root volume, in kibibytes (KiB).
   * Valid values are 4, 8, 16, 32, 64, 128, 256, 512, or 1024 KiB. The default is 128 KiB. Most
   * workloads should use the default record size. Database workflows can benefit from a smaller record
   * size, while streaming workflows can benefit from a larger record size. For additional guidance on
   * setting a custom record size, see [Tips for maximizing
   * performance](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#performance-tips-zfs)
   * in the *Amazon FSx for OpenZFS User Guide* .
   */
  public fun recordSizeKiB(recordSizeKiB: Number) {
    cdkBuilder.recordSizeKiB(recordSizeKiB)
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

  public fun build(): CfnFileSystem.RootVolumeConfigurationProperty {
    if(_nfsExports.isNotEmpty()) cdkBuilder.nfsExports(_nfsExports)
    if(_userAndGroupQuotas.isNotEmpty()) cdkBuilder.userAndGroupQuotas(_userAndGroupQuotas)
    return cdkBuilder.build()
  }
}
