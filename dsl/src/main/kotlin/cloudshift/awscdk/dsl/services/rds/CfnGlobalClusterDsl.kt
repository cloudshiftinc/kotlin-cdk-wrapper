@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.rds.CfnGlobalCluster
import software.constructs.Construct

@CdkDslMarker
public class CfnGlobalClusterDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnGlobalCluster.Builder = CfnGlobalCluster.Builder.create(scope, id)

  public fun deletionProtection(deletionProtection: Boolean) {
    cdkBuilder.deletionProtection(deletionProtection)
  }

  public fun deletionProtection(deletionProtection: IResolvable) {
    cdkBuilder.deletionProtection(deletionProtection)
  }

  public fun engine(engine: String) {
    cdkBuilder.engine(engine)
  }

  public fun engineVersion(engineVersion: String) {
    cdkBuilder.engineVersion(engineVersion)
  }

  public fun globalClusterIdentifier(globalClusterIdentifier: String) {
    cdkBuilder.globalClusterIdentifier(globalClusterIdentifier)
  }

  public fun sourceDbClusterIdentifier(sourceDbClusterIdentifier: String) {
    cdkBuilder.sourceDbClusterIdentifier(sourceDbClusterIdentifier)
  }

  public fun storageEncrypted(storageEncrypted: Boolean) {
    cdkBuilder.storageEncrypted(storageEncrypted)
  }

  public fun storageEncrypted(storageEncrypted: IResolvable) {
    cdkBuilder.storageEncrypted(storageEncrypted)
  }

  public fun build(): CfnGlobalCluster = cdkBuilder.build()
}
