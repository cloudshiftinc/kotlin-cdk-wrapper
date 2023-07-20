@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster

@CdkDslMarker
public class CfnClusterPrometheusPropertyDsl {
  private val cdkBuilder: CfnCluster.PrometheusProperty.Builder =
      CfnCluster.PrometheusProperty.builder()

  public fun jmxExporter(jmxExporter: IResolvable) {
    cdkBuilder.jmxExporter(jmxExporter)
  }

  public fun jmxExporter(jmxExporter: CfnCluster.JmxExporterProperty) {
    cdkBuilder.jmxExporter(jmxExporter)
  }

  public fun nodeExporter(nodeExporter: IResolvable) {
    cdkBuilder.nodeExporter(nodeExporter)
  }

  public fun nodeExporter(nodeExporter: CfnCluster.NodeExporterProperty) {
    cdkBuilder.nodeExporter(nodeExporter)
  }

  public fun build(): CfnCluster.PrometheusProperty = cdkBuilder.build()
}
