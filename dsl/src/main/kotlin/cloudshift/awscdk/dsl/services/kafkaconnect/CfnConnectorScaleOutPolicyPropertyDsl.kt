@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kafkaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

/**
 * The scale-out policy for the connector.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kafkaconnect.*;
 * ScaleOutPolicyProperty scaleOutPolicyProperty = ScaleOutPolicyProperty.builder()
 * .cpuUtilizationPercentage(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-scaleoutpolicy.html)
 */
@CdkDslMarker
public class CfnConnectorScaleOutPolicyPropertyDsl {
  private val cdkBuilder: CfnConnector.ScaleOutPolicyProperty.Builder =
      CfnConnector.ScaleOutPolicyProperty.builder()

  /**
   * @param cpuUtilizationPercentage The CPU utilization percentage threshold at which you want
   * connector scale out to be triggered. 
   */
  public fun cpuUtilizationPercentage(cpuUtilizationPercentage: Number) {
    cdkBuilder.cpuUtilizationPercentage(cpuUtilizationPercentage)
  }

  public fun build(): CfnConnector.ScaleOutPolicyProperty = cdkBuilder.build()
}
