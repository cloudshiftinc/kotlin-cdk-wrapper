@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dlm

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

@CdkDslMarker
public class CfnLifecyclePolicyArchiveRulePropertyDsl {
  private val cdkBuilder: CfnLifecyclePolicy.ArchiveRuleProperty.Builder =
      CfnLifecyclePolicy.ArchiveRuleProperty.builder()

  /**
   * @param retainRule the value to be set. 
   */
  public fun retainRule(retainRule: IResolvable) {
    cdkBuilder.retainRule(retainRule)
  }

  /**
   * @param retainRule the value to be set. 
   */
  public fun retainRule(retainRule: CfnLifecyclePolicy.ArchiveRetainRuleProperty) {
    cdkBuilder.retainRule(retainRule)
  }

  public fun build(): CfnLifecyclePolicy.ArchiveRuleProperty = cdkBuilder.build()
}
