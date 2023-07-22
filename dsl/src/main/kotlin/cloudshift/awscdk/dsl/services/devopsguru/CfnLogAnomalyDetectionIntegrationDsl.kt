@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.devopsguru

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.devopsguru.CfnLogAnomalyDetectionIntegration
import software.constructs.Construct

/**
 * Information about the integration of DevOps Guru with CloudWatch log groups for log anomaly
 * detection.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.devopsguru.*;
 * CfnLogAnomalyDetectionIntegration cfnLogAnomalyDetectionIntegration =
 * CfnLogAnomalyDetectionIntegration.Builder.create(this,
 * "MyCfnLogAnomalyDetectionIntegration").build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devopsguru-loganomalydetectionintegration.html)
 */
@CdkDslMarker
public class CfnLogAnomalyDetectionIntegrationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnLogAnomalyDetectionIntegration.Builder =
      CfnLogAnomalyDetectionIntegration.Builder.create(scope, id)

  public fun build(): CfnLogAnomalyDetectionIntegration = cdkBuilder.build()
}
