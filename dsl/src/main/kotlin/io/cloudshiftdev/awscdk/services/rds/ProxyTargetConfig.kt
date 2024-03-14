package io.cloudshiftdev.awscdk.services.rds

import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface ProxyTargetConfig {
  public fun dbClusters(): List<IDatabaseCluster> =
      unwrap(this).getDbClusters()?.map(IDatabaseCluster::wrap) ?: emptyList()

  public fun dbInstances(): List<IDatabaseInstance> =
      unwrap(this).getDbInstances()?.map(IDatabaseInstance::wrap) ?: emptyList()

  public fun engineFamily(): String

  public interface Builder {
    public fun dbClusters(dbClusters: List<IDatabaseCluster>) {
    }

    public fun dbInstances(dbInstances: List<IDatabaseInstance>) {
    }

    public fun engineFamily(engineFamily: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.ProxyTargetConfig.Builder =
        software.amazon.awscdk.services.rds.ProxyTargetConfig.builder()

    public override fun dbClusters(dbClusters: List<IDatabaseCluster>) {
      cdkBuilder.dbClusters(dbClusters.map(IDatabaseCluster::unwrap))
    }

    public override fun dbInstances(dbInstances: List<IDatabaseInstance>) {
      cdkBuilder.dbInstances(dbInstances.map(IDatabaseInstance::unwrap))
    }

    public override fun engineFamily(engineFamily: String) {
      cdkBuilder.engineFamily(engineFamily)
    }

    public fun build(): software.amazon.awscdk.services.rds.ProxyTargetConfig = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.rds.ProxyTargetConfig,
  ) : ProxyTargetConfig {
    public override fun dbClusters(): List<IDatabaseCluster> =
        unwrap(this).getDbClusters()?.map(IDatabaseCluster::wrap) ?: emptyList()

    public override fun dbInstances(): List<IDatabaseInstance> =
        unwrap(this).getDbInstances()?.map(IDatabaseInstance::wrap) ?: emptyList()

    public override fun engineFamily(): String = unwrap(this).getEngineFamily()
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
