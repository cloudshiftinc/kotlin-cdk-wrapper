@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnFlow

@CdkDslMarker
public class CfnFlowLookoutMetricsDestinationPropertiesPropertyDsl {
  private val cdkBuilder: CfnFlow.LookoutMetricsDestinationPropertiesProperty.Builder =
      CfnFlow.LookoutMetricsDestinationPropertiesProperty.builder()

  public fun `object`(`object`: String) {
    cdkBuilder.`object`(`object`)
  }

  public fun build(): CfnFlow.LookoutMetricsDestinationPropertiesProperty = cdkBuilder.build()
}
