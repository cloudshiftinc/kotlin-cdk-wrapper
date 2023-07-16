@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.wafv2.CfnRuleGroup

@CdkDslMarker
public class CfnRuleGroupCustomResponseBodyPropertyDsl {
  private val cdkBuilder: CfnRuleGroup.CustomResponseBodyProperty.Builder =
      CfnRuleGroup.CustomResponseBodyProperty.builder()

  public fun content(content: String) {
    cdkBuilder.content(content)
  }

  public fun contentType(contentType: String) {
    cdkBuilder.contentType(contentType)
  }

  public fun build(): CfnRuleGroup.CustomResponseBodyProperty = cdkBuilder.build()
}
