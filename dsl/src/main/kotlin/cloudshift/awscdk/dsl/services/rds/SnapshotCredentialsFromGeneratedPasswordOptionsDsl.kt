@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.secretsmanager.ReplicaRegionDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.rds.SnapshotCredentialsFromGeneratedPasswordOptions
import software.amazon.awscdk.services.secretsmanager.ReplicaRegion

@CdkDslMarker
public class SnapshotCredentialsFromGeneratedPasswordOptionsDsl {
  private val cdkBuilder: SnapshotCredentialsFromGeneratedPasswordOptions.Builder =
      SnapshotCredentialsFromGeneratedPasswordOptions.builder()

  private val _replicaRegions: MutableList<ReplicaRegion> = mutableListOf()

  public fun encryptionKey(encryptionKey: IKey) {
    cdkBuilder.encryptionKey(encryptionKey)
  }

  public fun excludeCharacters(excludeCharacters: String) {
    cdkBuilder.excludeCharacters(excludeCharacters)
  }

  public fun replicaRegions(replicaRegions: ReplicaRegionDsl.() -> Unit) {
    _replicaRegions.add(ReplicaRegionDsl().apply(replicaRegions).build())
  }

  public fun replicaRegions(replicaRegions: Collection<ReplicaRegion>) {
    _replicaRegions.addAll(replicaRegions)
  }

  public fun build(): SnapshotCredentialsFromGeneratedPasswordOptions {
    if(_replicaRegions.isNotEmpty()) cdkBuilder.replicaRegions(_replicaRegions)
    return cdkBuilder.build()
  }
}
