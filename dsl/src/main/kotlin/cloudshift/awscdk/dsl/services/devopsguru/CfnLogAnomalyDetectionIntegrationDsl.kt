@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.devopsguru

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.devopsguru.CfnLogAnomalyDetectionIntegration
import software.constructs.Construct

@CdkDslMarker
public class CfnLogAnomalyDetectionIntegrationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnLogAnomalyDetectionIntegration.Builder =
      CfnLogAnomalyDetectionIntegration.Builder.create(scope, id)

  public fun build(): CfnLogAnomalyDetectionIntegration = cdkBuilder.build()
}
