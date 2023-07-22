@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.eks.HelmChartProps
import software.amazon.awscdk.services.eks.ICluster
import software.amazon.awscdk.services.s3.assets.Asset

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
@CdkDslMarker
public class HelmChartPropsDsl {
  private val cdkBuilder: HelmChartProps.Builder = HelmChartProps.builder()

  /**
   * @param chart The name of the chart.
   * Either this or `chartAsset` must be specified.
   */
  public fun chart(chart: String) {
    cdkBuilder.chart(chart)
  }

  /**
   * @param chartAsset The chart in the form of an asset.
   * Either this or `chart` must be specified.
   */
  public fun chartAsset(chartAsset: Asset) {
    cdkBuilder.chartAsset(chartAsset)
  }

  /**
   * @param cluster The EKS cluster to apply this configuration to. 
   * [disable-awslint:ref-via-interface]
   */
  public fun cluster(cluster: ICluster) {
    cdkBuilder.cluster(cluster)
  }

  /**
   * @param createNamespace create namespace if not exist.
   */
  public fun createNamespace(createNamespace: Boolean) {
    cdkBuilder.createNamespace(createNamespace)
  }

  /**
   * @param namespace The Kubernetes namespace scope of the requests.
   */
  public fun namespace(namespace: String) {
    cdkBuilder.namespace(namespace)
  }

  /**
   * @param release The name of the release.
   */
  public fun release(release: String) {
    cdkBuilder.release(release)
  }

  /**
   * @param repository The repository which contains the chart.
   * For example: https://charts.helm.sh/stable/
   */
  public fun repository(repository: String) {
    cdkBuilder.repository(repository)
  }

  /**
   * @param skipCrds if set, no CRDs will be installed.
   */
  public fun skipCrds(skipCrds: Boolean) {
    cdkBuilder.skipCrds(skipCrds)
  }

  /**
   * @param timeout Amount of time to wait for any individual Kubernetes operation.
   * Maximum 15 minutes.
   */
  public fun timeout(timeout: Duration) {
    cdkBuilder.timeout(timeout)
  }

  /**
   * @param values The values to be used by the chart.
   * For nested values use a nested dictionary. For example:
   * values: {
   * installationCRDs: true,
   * webhook: { port: 9443 }
   * }
   */
  public fun values(values: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(values)
    cdkBuilder.values(builder.map)
  }

  /**
   * @param values The values to be used by the chart.
   * For nested values use a nested dictionary. For example:
   * values: {
   * installationCRDs: true,
   * webhook: { port: 9443 }
   * }
   */
  public fun values(values: Map<String, Any>) {
    cdkBuilder.values(values)
  }

  /**
   * @param version The chart version to install.
   */
  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  /**
   * @param wait Whether or not Helm should wait until all Pods, PVCs, Services, and minimum number
   * of Pods of a Deployment, StatefulSet, or ReplicaSet are in a ready state before marking the
   * release as successful.
   */
  public fun wait(wait: Boolean) {
    cdkBuilder.wait(wait)
  }

  public fun build(): HelmChartProps = cdkBuilder.build()
}
