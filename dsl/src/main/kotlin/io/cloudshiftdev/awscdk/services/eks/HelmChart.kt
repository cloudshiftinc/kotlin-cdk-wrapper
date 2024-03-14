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
  /**
   *
   */
  public open fun chart(): String? = unwrap(this).getChart()

  /**
   *
   */
  public open fun chartAsset(): Asset? = unwrap(this).getChartAsset()?.let(Asset::wrap)

  /**
   *
   */
  public open fun repository(): String? = unwrap(this).getRepository()

  /**
   *
   */
  public open fun version(): String? = unwrap(this).getVersion()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.eks.HelmChart].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the chart.
     *
     * Either this or `chartAsset` must be specified.
     *
     * Default: - No chart name. Implies `chartAsset` is used.
     *
     * @param chart The name of the chart. 
     */
    public fun chart(chart: String)

    /**
     * The chart in the form of an asset.
     *
     * Either this or `chart` must be specified.
     *
     * Default: - No chart asset. Implies `chart` is used.
     *
     * @param chartAsset The chart in the form of an asset. 
     */
    public fun chartAsset(chartAsset: Asset)

    /**
     * The EKS cluster to apply this configuration to.
     *
     * [disable-awslint:ref-via-interface]
     *
     * @param cluster The EKS cluster to apply this configuration to. 
     */
    public fun cluster(cluster: ICluster)

    /**
     * create namespace if not exist.
     *
     * Default: true
     *
     * @param createNamespace create namespace if not exist. 
     */
    public fun createNamespace(createNamespace: Boolean)

    /**
     * The Kubernetes namespace scope of the requests.
     *
     * Default: default
     *
     * @param namespace The Kubernetes namespace scope of the requests. 
     */
    public fun namespace(namespace: String)

    /**
     * The name of the release.
     *
     * Default: - If no release name is given, it will use the last 53 characters of the node's
     * unique id.
     *
     * @param release The name of the release. 
     */
    public fun release(release: String)

    /**
     * The repository which contains the chart.
     *
     * For example: https://charts.helm.sh/stable/
     *
     * Default: - No repository will be used, which means that the chart needs to be an absolute
     * URL.
     *
     * @param repository The repository which contains the chart. 
     */
    public fun repository(repository: String)

    /**
     * if set, no CRDs will be installed.
     *
     * Default: - CRDs are installed if not already present
     *
     * @param skipCrds if set, no CRDs will be installed. 
     */
    public fun skipCrds(skipCrds: Boolean)

    /**
     * Amount of time to wait for any individual Kubernetes operation.
     *
     * Maximum 15 minutes.
     *
     * Default: Duration.minutes(5)
     *
     * @param timeout Amount of time to wait for any individual Kubernetes operation. 
     */
    public fun timeout(timeout: Duration)

    /**
     * The values to be used by the chart.
     *
     * For nested values use a nested dictionary. For example:
     * values: {
     * installationCRDs: true,
     * webhook: { port: 9443 }
     * }
     *
     * Default: - No values are provided to the chart.
     *
     * @param values The values to be used by the chart. 
     */
    public fun values(values: Map<String, Any>)

    /**
     * The chart version to install.
     *
     * Default: - If this is not specified, the latest version is installed
     *
     * @param version The chart version to install. 
     */
    public fun version(version: String)

    /**
     * Whether or not Helm should wait until all Pods, PVCs, Services, and minimum number of Pods of
     * a Deployment, StatefulSet, or ReplicaSet are in a ready state before marking the release as
     * successful.
     *
     * Default: - Helm will not wait before marking release as successful
     *
     * @param wait Whether or not Helm should wait until all Pods, PVCs, Services, and minimum
     * number of Pods of a Deployment, StatefulSet, or ReplicaSet are in a ready state before marking
     * the release as successful. 
     */
    public fun wait(wait: Boolean)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.HelmChart.Builder =
        software.amazon.awscdk.services.eks.HelmChart.Builder.create(scope, id)

    /**
     * The name of the chart.
     *
     * Either this or `chartAsset` must be specified.
     *
     * Default: - No chart name. Implies `chartAsset` is used.
     *
     * @param chart The name of the chart. 
     */
    override fun chart(chart: String) {
      cdkBuilder.chart(chart)
    }

    /**
     * The chart in the form of an asset.
     *
     * Either this or `chart` must be specified.
     *
     * Default: - No chart asset. Implies `chart` is used.
     *
     * @param chartAsset The chart in the form of an asset. 
     */
    override fun chartAsset(chartAsset: Asset) {
      cdkBuilder.chartAsset(chartAsset.let(Asset::unwrap))
    }

    /**
     * The EKS cluster to apply this configuration to.
     *
     * [disable-awslint:ref-via-interface]
     *
     * @param cluster The EKS cluster to apply this configuration to. 
     */
    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    /**
     * create namespace if not exist.
     *
     * Default: true
     *
     * @param createNamespace create namespace if not exist. 
     */
    override fun createNamespace(createNamespace: Boolean) {
      cdkBuilder.createNamespace(createNamespace)
    }

    /**
     * The Kubernetes namespace scope of the requests.
     *
     * Default: default
     *
     * @param namespace The Kubernetes namespace scope of the requests. 
     */
    override fun namespace(namespace: String) {
      cdkBuilder.namespace(namespace)
    }

    /**
     * The name of the release.
     *
     * Default: - If no release name is given, it will use the last 53 characters of the node's
     * unique id.
     *
     * @param release The name of the release. 
     */
    override fun release(release: String) {
      cdkBuilder.release(release)
    }

    /**
     * The repository which contains the chart.
     *
     * For example: https://charts.helm.sh/stable/
     *
     * Default: - No repository will be used, which means that the chart needs to be an absolute
     * URL.
     *
     * @param repository The repository which contains the chart. 
     */
    override fun repository(repository: String) {
      cdkBuilder.repository(repository)
    }

    /**
     * if set, no CRDs will be installed.
     *
     * Default: - CRDs are installed if not already present
     *
     * @param skipCrds if set, no CRDs will be installed. 
     */
    override fun skipCrds(skipCrds: Boolean) {
      cdkBuilder.skipCrds(skipCrds)
    }

    /**
     * Amount of time to wait for any individual Kubernetes operation.
     *
     * Maximum 15 minutes.
     *
     * Default: Duration.minutes(5)
     *
     * @param timeout Amount of time to wait for any individual Kubernetes operation. 
     */
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    /**
     * The values to be used by the chart.
     *
     * For nested values use a nested dictionary. For example:
     * values: {
     * installationCRDs: true,
     * webhook: { port: 9443 }
     * }
     *
     * Default: - No values are provided to the chart.
     *
     * @param values The values to be used by the chart. 
     */
    override fun values(values: Map<String, Any>) {
      cdkBuilder.values(values)
    }

    /**
     * The chart version to install.
     *
     * Default: - If this is not specified, the latest version is installed
     *
     * @param version The chart version to install. 
     */
    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    /**
     * Whether or not Helm should wait until all Pods, PVCs, Services, and minimum number of Pods of
     * a Deployment, StatefulSet, or ReplicaSet are in a ready state before marking the release as
     * successful.
     *
     * Default: - Helm will not wait before marking release as successful
     *
     * @param wait Whether or not Helm should wait until all Pods, PVCs, Services, and minimum
     * number of Pods of a Deployment, StatefulSet, or ReplicaSet are in a ready state before marking
     * the release as successful. 
     */
    override fun wait(wait: Boolean) {
      cdkBuilder.wait(wait)
    }

    public fun build(): software.amazon.awscdk.services.eks.HelmChart = cdkBuilder.build()
  }

  public companion object {
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
