@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster

@CdkDslMarker
public class CfnClusterOpenMonitoringPropertyDsl {
  private val cdkBuilder: CfnCluster.OpenMonitoringProperty.Builder =
      CfnCluster.OpenMonitoringProperty.builder()

  public fun prometheus(prometheus: IResolvable) {
    cdkBuilder.prometheus(prometheus)
  }

  public fun prometheus(prometheus: CfnCluster.PrometheusProperty) {
    cdkBuilder.prometheus(prometheus)
  }

  public fun build(): CfnCluster.OpenMonitoringProperty = cdkBuilder.build()
}
