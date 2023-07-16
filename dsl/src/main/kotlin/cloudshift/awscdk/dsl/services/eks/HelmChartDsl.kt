@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.eks.HelmChart
import software.amazon.awscdk.services.eks.ICluster
import software.amazon.awscdk.services.s3.assets.Asset
import software.constructs.Construct

@CdkDslMarker
public class HelmChartDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: HelmChart.Builder = HelmChart.Builder.create(scope, id)

  public fun chart(chart: String) {
    cdkBuilder.chart(chart)
  }

  public fun chartAsset(chartAsset: Asset) {
    cdkBuilder.chartAsset(chartAsset)
  }

  public fun cluster(cluster: ICluster) {
    cdkBuilder.cluster(cluster)
  }

  public fun createNamespace(createNamespace: Boolean) {
    cdkBuilder.createNamespace(createNamespace)
  }

  public fun namespace(namespace: String) {
    cdkBuilder.namespace(namespace)
  }

  public fun release(release: String) {
    cdkBuilder.release(release)
  }

  public fun repository(repository: String) {
    cdkBuilder.repository(repository)
  }

  public fun skipCrds(skipCrds: Boolean) {
    cdkBuilder.skipCrds(skipCrds)
  }

  public fun timeout(timeout: Duration) {
    cdkBuilder.timeout(timeout)
  }

  public fun values(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.values(builder.map)
  }

  public fun values(values: Map<String, *>) {
    cdkBuilder.values(values)
  }

  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun wait(wait: Boolean) {
    cdkBuilder.wait(wait)
  }

  public fun build(): HelmChart = cdkBuilder.build()
}
