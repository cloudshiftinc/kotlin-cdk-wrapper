@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.applicationinsights

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.applicationinsights.CfnApplication

@CdkDslMarker
public class CfnApplicationJMXPrometheusExporterPropertyDsl {
  private val cdkBuilder: CfnApplication.JMXPrometheusExporterProperty.Builder =
      CfnApplication.JMXPrometheusExporterProperty.builder()

  /**
   * @param hostPort The host and port to connect to through remote JMX.
   * Only one of `jmxURL` and `hostPort` can be specified.
   */
  public fun hostPort(hostPort: String) {
    cdkBuilder.hostPort(hostPort)
  }

  /**
   * @param jmxurl The complete JMX URL to connect to.
   */
  public fun jmxurl(jmxurl: String) {
    cdkBuilder.jmxurl(jmxurl)
  }

  /**
   * @param prometheusPort The target port to send Prometheus metrics to.
   * If not specified, the default port `9404` is used.
   */
  public fun prometheusPort(prometheusPort: String) {
    cdkBuilder.prometheusPort(prometheusPort)
  }

  public fun build(): CfnApplication.JMXPrometheusExporterProperty = cdkBuilder.build()
}
