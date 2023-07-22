@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.devopsguru

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.devopsguru.CfnLogAnomalyDetectionIntegrationProps

/**
 * Properties for defining a `CfnLogAnomalyDetectionIntegration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.devopsguru.*;
 * CfnLogAnomalyDetectionIntegrationProps cfnLogAnomalyDetectionIntegrationProps =
 * CfnLogAnomalyDetectionIntegrationProps.builder().build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devopsguru-loganomalydetectionintegration.html)
 */
@CdkDslMarker
public class CfnLogAnomalyDetectionIntegrationPropsDsl {
  private val cdkBuilder: CfnLogAnomalyDetectionIntegrationProps.Builder =
      CfnLogAnomalyDetectionIntegrationProps.builder()

  public fun build(): CfnLogAnomalyDetectionIntegrationProps = cdkBuilder.build()
}
