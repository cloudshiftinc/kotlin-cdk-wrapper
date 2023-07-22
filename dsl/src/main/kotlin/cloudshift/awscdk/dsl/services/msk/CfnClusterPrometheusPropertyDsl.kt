@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster

@CdkDslMarker
public class CfnClusterPrometheusPropertyDsl {
  private val cdkBuilder: CfnCluster.PrometheusProperty.Builder =
      CfnCluster.PrometheusProperty.builder()

  /**
   * @param jmxExporter Indicates whether you want to enable or disable the JMX Exporter.
   */
  public fun jmxExporter(jmxExporter: IResolvable) {
    cdkBuilder.jmxExporter(jmxExporter)
  }

  /**
   * @param jmxExporter Indicates whether you want to enable or disable the JMX Exporter.
   */
  public fun jmxExporter(jmxExporter: CfnCluster.JmxExporterProperty) {
    cdkBuilder.jmxExporter(jmxExporter)
  }

  /**
   * @param nodeExporter Indicates whether you want to enable or disable the Node Exporter.
   */
  public fun nodeExporter(nodeExporter: IResolvable) {
    cdkBuilder.nodeExporter(nodeExporter)
  }

  /**
   * @param nodeExporter Indicates whether you want to enable or disable the Node Exporter.
   */
  public fun nodeExporter(nodeExporter: CfnCluster.NodeExporterProperty) {
    cdkBuilder.nodeExporter(nodeExporter)
  }

  public fun build(): CfnCluster.PrometheusProperty = cdkBuilder.build()
}
