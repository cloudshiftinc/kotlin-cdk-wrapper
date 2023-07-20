@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.rds.IDatabaseCluster
import software.amazon.awscdk.services.rds.IDatabaseInstance
import software.amazon.awscdk.services.rds.ProxyTargetConfig

@CdkDslMarker
public class ProxyTargetConfigDsl {
  private val cdkBuilder: ProxyTargetConfig.Builder = ProxyTargetConfig.builder()

  private val _dbClusters: MutableList<IDatabaseCluster> = mutableListOf()

  private val _dbInstances: MutableList<IDatabaseInstance> = mutableListOf()

  public fun dbClusters(vararg dbClusters: IDatabaseCluster) {
    _dbClusters.addAll(listOf(*dbClusters))
  }

  public fun dbClusters(dbClusters: Collection<IDatabaseCluster>) {
    _dbClusters.addAll(dbClusters)
  }

  public fun dbInstances(vararg dbInstances: IDatabaseInstance) {
    _dbInstances.addAll(listOf(*dbInstances))
  }

  public fun dbInstances(dbInstances: Collection<IDatabaseInstance>) {
    _dbInstances.addAll(dbInstances)
  }

  public fun engineFamily(engineFamily: String) {
    cdkBuilder.engineFamily(engineFamily)
  }

  public fun build(): ProxyTargetConfig {
    if(_dbClusters.isNotEmpty()) cdkBuilder.dbClusters(_dbClusters)
    if(_dbInstances.isNotEmpty()) cdkBuilder.dbInstances(_dbInstances)
    return cdkBuilder.build()
  }
}
