@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.applicationinsights

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.applicationinsights.CfnApplication

@CdkDslMarker
public class CfnApplicationHAClusterPrometheusExporterPropertyDsl {
  private val cdkBuilder: CfnApplication.HAClusterPrometheusExporterProperty.Builder =
      CfnApplication.HAClusterPrometheusExporterProperty.builder()

  public fun prometheusPort(prometheusPort: String) {
    cdkBuilder.prometheusPort(prometheusPort)
  }

  public fun build(): CfnApplication.HAClusterPrometheusExporterProperty = cdkBuilder.build()
}
