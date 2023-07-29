@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.eks.HelmChart
import software.amazon.awscdk.services.eks.ICluster
import software.amazon.awscdk.services.s3.assets.Asset
import software.constructs.Construct

/**
 * Represents a helm chart within the Kubernetes system.
 *
 * Applies/deletes the resources using `kubectl` in sync with the resource.
 *
 * Example:
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
public class HelmChartDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: HelmChart.Builder = HelmChart.Builder.create(scope, id)

    /**
     * The name of the chart.
     *
     * Either this or `chartAsset` must be specified.
     *
     * Default: - No chart name. Implies `chartAsset` is used.
     *
     * @param chart The name of the chart.
     */
    public fun chart(chart: String) {
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
    public fun chartAsset(chartAsset: Asset) {
        cdkBuilder.chartAsset(chartAsset)
    }

    /**
     * The EKS cluster to apply this configuration to.
     *
     * [disable-awslint:ref-via-interface]
     *
     * @param cluster The EKS cluster to apply this configuration to.
     */
    public fun cluster(cluster: ICluster) {
        cdkBuilder.cluster(cluster)
    }

    /**
     * create namespace if not exist.
     *
     * Default: true
     *
     * @param createNamespace create namespace if not exist.
     */
    public fun createNamespace(createNamespace: Boolean) {
        cdkBuilder.createNamespace(createNamespace)
    }

    /**
     * The Kubernetes namespace scope of the requests.
     *
     * Default: default
     *
     * @param namespace The Kubernetes namespace scope of the requests.
     */
    public fun namespace(namespace: String) {
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
    public fun release(release: String) {
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
    public fun repository(repository: String) {
        cdkBuilder.repository(repository)
    }

    /**
     * if set, no CRDs will be installed.
     *
     * Default: - CRDs are installed if not already present
     *
     * @param skipCrds if set, no CRDs will be installed.
     */
    public fun skipCrds(skipCrds: Boolean) {
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
    public fun timeout(timeout: Duration) {
        cdkBuilder.timeout(timeout)
    }

    /**
     * The values to be used by the chart.
     *
     * For nested values use a nested dictionary. For example: values: { installationCRDs: true,
     * webhook: { port: 9443 } }
     *
     * Default: - No values are provided to the chart.
     *
     * @param values The values to be used by the chart.
     */
    public fun values(values: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(values)
        cdkBuilder.values(builder.map)
    }

    /**
     * The values to be used by the chart.
     *
     * For nested values use a nested dictionary. For example: values: { installationCRDs: true,
     * webhook: { port: 9443 } }
     *
     * Default: - No values are provided to the chart.
     *
     * @param values The values to be used by the chart.
     */
    public fun values(values: Map<String, Any>) {
        cdkBuilder.values(values)
    }

    /**
     * The chart version to install.
     *
     * Default: - If this is not specified, the latest version is installed
     *
     * @param version The chart version to install.
     */
    public fun version(version: String) {
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
     *   number of Pods of a Deployment, StatefulSet, or ReplicaSet are in a ready state before
     *   marking the release as successful.
     */
    public fun wait(wait: Boolean) {
        cdkBuilder.wait(wait)
    }

    public fun build(): HelmChart = cdkBuilder.build()
}
