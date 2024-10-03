@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * The result of binding a `ProxyTarget` to a `DatabaseProxy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rds.*;
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
public interface ProxyTargetConfig {
  /**
   * The database clusters to which this proxy connects.
   *
   * Either this or `dbInstances` will be set and the other `undefined`.
   *
   * Default: - `undefined` if `dbInstances` is set.
   */
  public fun dbClusters(): List<IDatabaseCluster> =
      unwrap(this).getDbClusters()?.map(IDatabaseCluster::wrap) ?: emptyList()

  /**
   * The database instances to which this proxy connects.
   *
   * Either this or `dbClusters` will be set and the other `undefined`.
   *
   * Default: - `undefined` if `dbClusters` is set.
   */
  public fun dbInstances(): List<IDatabaseInstance> =
      unwrap(this).getDbInstances()?.map(IDatabaseInstance::wrap) ?: emptyList()

  /**
   * The engine family of the database instance or cluster this proxy connects with.
   */
  public fun engineFamily(): String

  /**
   * A builder for [ProxyTargetConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dbClusters The database clusters to which this proxy connects.
     * Either this or `dbInstances` will be set and the other `undefined`.
     */
    public fun dbClusters(dbClusters: List<IDatabaseCluster>)

    /**
     * @param dbClusters The database clusters to which this proxy connects.
     * Either this or `dbInstances` will be set and the other `undefined`.
     */
    public fun dbClusters(vararg dbClusters: IDatabaseCluster)

    /**
     * @param dbInstances The database instances to which this proxy connects.
     * Either this or `dbClusters` will be set and the other `undefined`.
     */
    public fun dbInstances(dbInstances: List<IDatabaseInstance>)

    /**
     * @param dbInstances The database instances to which this proxy connects.
     * Either this or `dbClusters` will be set and the other `undefined`.
     */
    public fun dbInstances(vararg dbInstances: IDatabaseInstance)

    /**
     * @param engineFamily The engine family of the database instance or cluster this proxy connects
     * with. 
     */
    public fun engineFamily(engineFamily: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.ProxyTargetConfig.Builder =
        software.amazon.awscdk.services.rds.ProxyTargetConfig.builder()

    /**
     * @param dbClusters The database clusters to which this proxy connects.
     * Either this or `dbInstances` will be set and the other `undefined`.
     */
    override fun dbClusters(dbClusters: List<IDatabaseCluster>) {
      cdkBuilder.dbClusters(dbClusters.map(IDatabaseCluster.Companion::unwrap))
    }

    /**
     * @param dbClusters The database clusters to which this proxy connects.
     * Either this or `dbInstances` will be set and the other `undefined`.
     */
    override fun dbClusters(vararg dbClusters: IDatabaseCluster): Unit =
        dbClusters(dbClusters.toList())

    /**
     * @param dbInstances The database instances to which this proxy connects.
     * Either this or `dbClusters` will be set and the other `undefined`.
     */
    override fun dbInstances(dbInstances: List<IDatabaseInstance>) {
      cdkBuilder.dbInstances(dbInstances.map(IDatabaseInstance.Companion::unwrap))
    }

    /**
     * @param dbInstances The database instances to which this proxy connects.
     * Either this or `dbClusters` will be set and the other `undefined`.
     */
    override fun dbInstances(vararg dbInstances: IDatabaseInstance): Unit =
        dbInstances(dbInstances.toList())

    /**
     * @param engineFamily The engine family of the database instance or cluster this proxy connects
     * with. 
     */
    override fun engineFamily(engineFamily: String) {
      cdkBuilder.engineFamily(engineFamily)
    }

    public fun build(): software.amazon.awscdk.services.rds.ProxyTargetConfig = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rds.ProxyTargetConfig,
  ) : CdkObject(cdkObject),
      ProxyTargetConfig {
    /**
     * The database clusters to which this proxy connects.
     *
     * Either this or `dbInstances` will be set and the other `undefined`.
     *
     * Default: - `undefined` if `dbInstances` is set.
     */
    override fun dbClusters(): List<IDatabaseCluster> =
        unwrap(this).getDbClusters()?.map(IDatabaseCluster::wrap) ?: emptyList()

    /**
     * The database instances to which this proxy connects.
     *
     * Either this or `dbClusters` will be set and the other `undefined`.
     *
     * Default: - `undefined` if `dbClusters` is set.
     */
    override fun dbInstances(): List<IDatabaseInstance> =
        unwrap(this).getDbInstances()?.map(IDatabaseInstance::wrap) ?: emptyList()

    /**
     * The engine family of the database instance or cluster this proxy connects with.
     */
    override fun engineFamily(): String = unwrap(this).getEngineFamily()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ProxyTargetConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.ProxyTargetConfig):
        ProxyTargetConfig = CdkObjectWrappers.wrap(cdkObject) as? ProxyTargetConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ProxyTargetConfig):
        software.amazon.awscdk.services.rds.ProxyTargetConfig = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.rds.ProxyTargetConfig
  }
}
