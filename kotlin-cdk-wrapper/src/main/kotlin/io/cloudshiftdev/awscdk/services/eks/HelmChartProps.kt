@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.s3.assets.Asset
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Helm Chart properties.
 *
 * Example:
 *
 * ```
 * Cluster cluster;
 * // option 1: use a construct
 * // option 1: use a construct
 * HelmChart.Builder.create(this, "MyOCIChart")
 * .cluster(cluster)
 * .chart("some-chart")
 * .repository("oci://${ACCOUNT_ID}.dkr.ecr.${ACCOUNT_REGION}.amazonaws.com/${REPO_NAME}")
 * .namespace("oci")
 * .version("0.0.1")
 * .build();
 * ```
 */
public interface HelmChartProps : HelmChartOptions {
  /**
   * The EKS cluster to apply this configuration to.
   *
   * [disable-awslint:ref-via-interface]
   */
  public fun cluster(): ICluster

  /**
   * A builder for [HelmChartProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param atomic Whether or not Helm should treat this operation as atomic;.
     * if set, upgrade process rolls back changes
     * made in case of failed upgrade. The --wait flag will be set automatically if --atomic is
     * used.
     */
    public fun atomic(atomic: Boolean)

    /**
     * @param chart The name of the chart.
     * Either this or `chartAsset` must be specified.
     */
    public fun chart(chart: String)

    /**
     * @param chartAsset The chart in the form of an asset.
     * Either this or `chart` must be specified.
     */
    public fun chartAsset(chartAsset: Asset)

    /**
     * @param cluster The EKS cluster to apply this configuration to. 
     * [disable-awslint:ref-via-interface]
     */
    public fun cluster(cluster: ICluster)

    /**
     * @param createNamespace create namespace if not exist.
     */
    public fun createNamespace(createNamespace: Boolean)

    /**
     * @param namespace The Kubernetes namespace scope of the requests.
     */
    public fun namespace(namespace: String)

    /**
     * @param release The name of the release.
     */
    public fun release(release: String)

    /**
     * @param repository The repository which contains the chart.
     * For example: https://charts.helm.sh/stable/
     */
    public fun repository(repository: String)

    /**
     * @param skipCrds if set, no CRDs will be installed.
     */
    public fun skipCrds(skipCrds: Boolean)

    /**
     * @param timeout Amount of time to wait for any individual Kubernetes operation.
     * Maximum 15 minutes.
     */
    public fun timeout(timeout: Duration)

    /**
     * @param values The values to be used by the chart.
     * For nested values use a nested dictionary. For example:
     * values: {
     * installationCRDs: true,
     * webhook: { port: 9443 }
     * }
     */
    public fun values(values: Map<String, Any>)

    /**
     * @param version The chart version to install.
     */
    public fun version(version: String)

    /**
     * @param wait Whether or not Helm should wait until all Pods, PVCs, Services, and minimum
     * number of Pods of a Deployment, StatefulSet, or ReplicaSet are in a ready state before marking
     * the release as successful.
     */
    public fun wait(wait: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.HelmChartProps.Builder =
        software.amazon.awscdk.services.eks.HelmChartProps.builder()

    /**
     * @param atomic Whether or not Helm should treat this operation as atomic;.
     * if set, upgrade process rolls back changes
     * made in case of failed upgrade. The --wait flag will be set automatically if --atomic is
     * used.
     */
    override fun atomic(atomic: Boolean) {
      cdkBuilder.atomic(atomic)
    }

    /**
     * @param chart The name of the chart.
     * Either this or `chartAsset` must be specified.
     */
    override fun chart(chart: String) {
      cdkBuilder.chart(chart)
    }

    /**
     * @param chartAsset The chart in the form of an asset.
     * Either this or `chart` must be specified.
     */
    override fun chartAsset(chartAsset: Asset) {
      cdkBuilder.chartAsset(chartAsset.let(Asset.Companion::unwrap))
    }

    /**
     * @param cluster The EKS cluster to apply this configuration to. 
     * [disable-awslint:ref-via-interface]
     */
    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster.Companion::unwrap))
    }

    /**
     * @param createNamespace create namespace if not exist.
     */
    override fun createNamespace(createNamespace: Boolean) {
      cdkBuilder.createNamespace(createNamespace)
    }

    /**
     * @param namespace The Kubernetes namespace scope of the requests.
     */
    override fun namespace(namespace: String) {
      cdkBuilder.namespace(namespace)
    }

    /**
     * @param release The name of the release.
     */
    override fun release(release: String) {
      cdkBuilder.release(release)
    }

    /**
     * @param repository The repository which contains the chart.
     * For example: https://charts.helm.sh/stable/
     */
    override fun repository(repository: String) {
      cdkBuilder.repository(repository)
    }

    /**
     * @param skipCrds if set, no CRDs will be installed.
     */
    override fun skipCrds(skipCrds: Boolean) {
      cdkBuilder.skipCrds(skipCrds)
    }

    /**
     * @param timeout Amount of time to wait for any individual Kubernetes operation.
     * Maximum 15 minutes.
     */
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration.Companion::unwrap))
    }

    /**
     * @param values The values to be used by the chart.
     * For nested values use a nested dictionary. For example:
     * values: {
     * installationCRDs: true,
     * webhook: { port: 9443 }
     * }
     */
    override fun values(values: Map<String, Any>) {
      cdkBuilder.values(values.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param version The chart version to install.
     */
    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    /**
     * @param wait Whether or not Helm should wait until all Pods, PVCs, Services, and minimum
     * number of Pods of a Deployment, StatefulSet, or ReplicaSet are in a ready state before marking
     * the release as successful.
     */
    override fun wait(wait: Boolean) {
      cdkBuilder.wait(wait)
    }

    public fun build(): software.amazon.awscdk.services.eks.HelmChartProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.eks.HelmChartProps,
  ) : CdkObject(cdkObject),
      HelmChartProps {
    /**
     * Whether or not Helm should treat this operation as atomic;
     *
     * if set, upgrade process rolls back changes
     * made in case of failed upgrade. The --wait flag will be set automatically if --atomic is
     * used.
     *
     * Default: false
     */
    override fun atomic(): Boolean? = unwrap(this).getAtomic()

    /**
     * The name of the chart.
     *
     * Either this or `chartAsset` must be specified.
     *
     * Default: - No chart name. Implies `chartAsset` is used.
     */
    override fun chart(): String? = unwrap(this).getChart()

    /**
     * The chart in the form of an asset.
     *
     * Either this or `chart` must be specified.
     *
     * Default: - No chart asset. Implies `chart` is used.
     */
    override fun chartAsset(): Asset? = unwrap(this).getChartAsset()?.let(Asset::wrap)

    /**
     * The EKS cluster to apply this configuration to.
     *
     * [disable-awslint:ref-via-interface]
     */
    override fun cluster(): ICluster = unwrap(this).getCluster().let(ICluster::wrap)

    /**
     * create namespace if not exist.
     *
     * Default: true
     */
    override fun createNamespace(): Boolean? = unwrap(this).getCreateNamespace()

    /**
     * The Kubernetes namespace scope of the requests.
     *
     * Default: default
     */
    override fun namespace(): String? = unwrap(this).getNamespace()

    /**
     * The name of the release.
     *
     * Default: - If no release name is given, it will use the last 53 characters of the node's
     * unique id.
     */
    override fun release(): String? = unwrap(this).getRelease()

    /**
     * The repository which contains the chart.
     *
     * For example: https://charts.helm.sh/stable/
     *
     * Default: - No repository will be used, which means that the chart needs to be an absolute
     * URL.
     */
    override fun repository(): String? = unwrap(this).getRepository()

    /**
     * if set, no CRDs will be installed.
     *
     * Default: - CRDs are installed if not already present
     */
    override fun skipCrds(): Boolean? = unwrap(this).getSkipCrds()

    /**
     * Amount of time to wait for any individual Kubernetes operation.
     *
     * Maximum 15 minutes.
     *
     * Default: Duration.minutes(5)
     */
    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

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
     */
    override fun values(): Map<String, Any> = unwrap(this).getValues() ?: emptyMap()

    /**
     * The chart version to install.
     *
     * Default: - If this is not specified, the latest version is installed
     */
    override fun version(): String? = unwrap(this).getVersion()

    /**
     * Whether or not Helm should wait until all Pods, PVCs, Services, and minimum number of Pods of
     * a Deployment, StatefulSet, or ReplicaSet are in a ready state before marking the release as
     * successful.
     *
     * Default: - Helm will not wait before marking release as successful
     */
    override fun wait(): Boolean? = unwrap(this).getWait()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HelmChartProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.HelmChartProps): HelmChartProps
        = CdkObjectWrappers.wrap(cdkObject) as? HelmChartProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: HelmChartProps): software.amazon.awscdk.services.eks.HelmChartProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.eks.HelmChartProps
  }
}
