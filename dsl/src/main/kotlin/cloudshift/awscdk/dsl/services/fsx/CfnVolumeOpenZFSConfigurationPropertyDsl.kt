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

  public fun copyTagsToSnapshots(copyTagsToSnapshots: Boolean) {
    cdkBuilder.copyTagsToSnapshots(copyTagsToSnapshots)
  }

  public fun copyTagsToSnapshots(copyTagsToSnapshots: IResolvable) {
    cdkBuilder.copyTagsToSnapshots(copyTagsToSnapshots)
  }

  public fun dataCompressionType(dataCompressionType: String) {
    cdkBuilder.dataCompressionType(dataCompressionType)
  }

  public fun nfsExports(vararg nfsExports: Any) {
    _nfsExports.addAll(listOf(*nfsExports))
  }

  public fun nfsExports(nfsExports: Collection<Any>) {
    _nfsExports.addAll(nfsExports)
  }

  public fun nfsExports(nfsExports: IResolvable) {
    cdkBuilder.nfsExports(nfsExports)
  }

  public fun options(vararg options: String) {
    _options.addAll(listOf(*options))
  }

  public fun options(options: Collection<String>) {
    _options.addAll(options)
  }

  public fun originSnapshot(originSnapshot: IResolvable) {
    cdkBuilder.originSnapshot(originSnapshot)
  }

  public fun originSnapshot(originSnapshot: CfnVolume.OriginSnapshotProperty) {
    cdkBuilder.originSnapshot(originSnapshot)
  }

  public fun parentVolumeId(parentVolumeId: String) {
    cdkBuilder.parentVolumeId(parentVolumeId)
  }

  public fun readOnly(readOnly: Boolean) {
    cdkBuilder.readOnly(readOnly)
  }

  public fun readOnly(readOnly: IResolvable) {
    cdkBuilder.readOnly(readOnly)
  }

  public fun recordSizeKiB(recordSizeKiB: Number) {
    cdkBuilder.recordSizeKiB(recordSizeKiB)
  }

  public fun storageCapacityQuotaGiB(storageCapacityQuotaGiB: Number) {
    cdkBuilder.storageCapacityQuotaGiB(storageCapacityQuotaGiB)
  }

  public fun storageCapacityReservationGiB(storageCapacityReservationGiB: Number) {
    cdkBuilder.storageCapacityReservationGiB(storageCapacityReservationGiB)
  }

  public fun userAndGroupQuotas(vararg userAndGroupQuotas: Any) {
    _userAndGroupQuotas.addAll(listOf(*userAndGroupQuotas))
  }

  public fun userAndGroupQuotas(userAndGroupQuotas: Collection<Any>) {
    _userAndGroupQuotas.addAll(userAndGroupQuotas)
  }

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
