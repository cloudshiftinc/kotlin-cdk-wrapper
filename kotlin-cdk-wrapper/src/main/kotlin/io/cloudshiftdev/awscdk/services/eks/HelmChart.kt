@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.s3.assets.Asset
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class HelmChart internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.eks.HelmChart,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public open fun chart(): String? = unwrap(this).getChart()

  public open fun chartAsset(): Asset? = unwrap(this).getChartAsset()?.let(Asset::wrap)

  public open fun repository(): String? = unwrap(this).getRepository()

  public open fun version(): String? = unwrap(this).getVersion()

  @CdkDslMarker
  public interface Builder {
    public fun chart(chart: String)

    public fun chartAsset(chartAsset: Asset)

    public fun cluster(cluster: ICluster)

    public fun createNamespace(createNamespace: Boolean)

    public fun namespace(namespace: String)

    public fun release(release: String)

    public fun repository(repository: String)

    public fun skipCrds(skipCrds: Boolean)

    public fun timeout(timeout: Duration)

    public fun values(values: Map<String, Any>)

    public fun version(version: String)

    public fun wait(wait: Boolean)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.HelmChart.Builder =
        software.amazon.awscdk.services.eks.HelmChart.Builder.create(scope, id)

    override fun chart(chart: String) {
      cdkBuilder.chart(chart)
    }

    override fun chartAsset(chartAsset: Asset) {
      cdkBuilder.chartAsset(chartAsset.let(Asset::unwrap))
    }

    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    override fun createNamespace(createNamespace: Boolean) {
      cdkBuilder.createNamespace(createNamespace)
    }

    override fun namespace(namespace: String) {
      cdkBuilder.namespace(namespace)
    }

    override fun release(release: String) {
      cdkBuilder.release(release)
    }

    override fun repository(repository: String) {
      cdkBuilder.repository(repository)
    }

    override fun skipCrds(skipCrds: Boolean) {
      cdkBuilder.skipCrds(skipCrds)
    }

    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    override fun values(values: Map<String, Any>) {
      cdkBuilder.values(values)
    }

    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    override fun wait(wait: Boolean) {
      cdkBuilder.wait(wait)
    }

    public fun build(): software.amazon.awscdk.services.eks.HelmChart = cdkBuilder.build()
  }

  public companion object {
    public val RESOURCE_TYPE: String = software.amazon.awscdk.services.eks.HelmChart.RESOURCE_TYPE

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): HelmChart {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return HelmChart(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.HelmChart): HelmChart =
        HelmChart(cdkObject)

    internal fun unwrap(wrapped: HelmChart): software.amazon.awscdk.services.eks.HelmChart =
        wrapped.cdkObject
  }
}
