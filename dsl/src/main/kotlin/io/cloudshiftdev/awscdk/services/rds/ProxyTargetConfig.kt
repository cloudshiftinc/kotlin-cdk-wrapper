package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

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
      cdkBuilder.dbClusters(dbClusters.map(IDatabaseCluster::unwrap))
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
      cdkBuilder.dbInstances(dbInstances.map(IDatabaseInstance::unwrap))
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

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.rds.ProxyTargetConfig,
  ) : ProxyTargetConfig {
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
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ProxyTargetConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.ProxyTargetConfig):
        ProxyTargetConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ProxyTargetConfig):
        software.amazon.awscdk.services.rds.ProxyTargetConfig = (wrapped as Wrapper).cdkObject
  }
}
