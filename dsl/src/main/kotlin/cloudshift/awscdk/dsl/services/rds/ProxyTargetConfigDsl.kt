@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.rds.IDatabaseCluster
import software.amazon.awscdk.services.rds.IDatabaseInstance
import software.amazon.awscdk.services.rds.ProxyTargetConfig

/**
 * The result of binding a `ProxyTarget` to a `DatabaseProxy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rds.*;
 * DatabaseCluster databaseCluster;
 * DatabaseInstance databaseInstance;
 * ProxyTargetConfig proxyTargetConfig = ProxyTargetConfig.builder()
 * .engineFamily("engineFamily")
 * // the properties below are optional
 * .dbClusters(List.of(databaseCluster))
 * .dbInstances(List.of(databaseInstance))
 * .build();
 * ```
 */
@CdkDslMarker
public class ProxyTargetConfigDsl {
  private val cdkBuilder: ProxyTargetConfig.Builder = ProxyTargetConfig.builder()

  private val _dbClusters: MutableList<IDatabaseCluster> = mutableListOf()

  private val _dbInstances: MutableList<IDatabaseInstance> = mutableListOf()

  /**
   * @param dbClusters The database clusters to which this proxy connects.
   * Either this or `dbInstances` will be set and the other `undefined`.
   */
  public fun dbClusters(vararg dbClusters: IDatabaseCluster) {
    _dbClusters.addAll(listOf(*dbClusters))
  }

  /**
   * @param dbClusters The database clusters to which this proxy connects.
   * Either this or `dbInstances` will be set and the other `undefined`.
   */
  public fun dbClusters(dbClusters: Collection<IDatabaseCluster>) {
    _dbClusters.addAll(dbClusters)
  }

  /**
   * @param dbInstances The database instances to which this proxy connects.
   * Either this or `dbClusters` will be set and the other `undefined`.
   */
  public fun dbInstances(vararg dbInstances: IDatabaseInstance) {
    _dbInstances.addAll(listOf(*dbInstances))
  }

  /**
   * @param dbInstances The database instances to which this proxy connects.
   * Either this or `dbClusters` will be set and the other `undefined`.
   */
  public fun dbInstances(dbInstances: Collection<IDatabaseInstance>) {
    _dbInstances.addAll(dbInstances)
  }

  /**
   * @param engineFamily The engine family of the database instance or cluster this proxy connects
   * with. 
   */
  public fun engineFamily(engineFamily: String) {
    cdkBuilder.engineFamily(engineFamily)
  }

  public fun build(): ProxyTargetConfig {
    if(_dbClusters.isNotEmpty()) cdkBuilder.dbClusters(_dbClusters)
    if(_dbInstances.isNotEmpty()) cdkBuilder.dbInstances(_dbInstances)
    return cdkBuilder.build()
  }
}
