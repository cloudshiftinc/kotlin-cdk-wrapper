@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediastore

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.mediastore.CfnContainer

@CdkDslMarker
public class CfnContainerMetricPolicyRulePropertyDsl {
  private val cdkBuilder: CfnContainer.MetricPolicyRuleProperty.Builder =
      CfnContainer.MetricPolicyRuleProperty.builder()

  /**
   * @param objectGroup A path or file name that defines which objects to include in the group. 
   * Wildcards (*) are acceptable.
   */
  public fun objectGroup(objectGroup: String) {
    cdkBuilder.objectGroup(objectGroup)
  }

  /**
   * @param objectGroupName A name that allows you to refer to the object group. 
   */
  public fun objectGroupName(objectGroupName: String) {
    cdkBuilder.objectGroupName(objectGroupName)
  }

  public fun build(): CfnContainer.MetricPolicyRuleProperty = cdkBuilder.build()
}
