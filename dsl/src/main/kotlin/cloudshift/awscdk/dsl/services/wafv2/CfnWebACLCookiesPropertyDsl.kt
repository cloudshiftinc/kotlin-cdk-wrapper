@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL

@CdkDslMarker
public class CfnWebACLCookiesPropertyDsl {
  private val cdkBuilder: CfnWebACL.CookiesProperty.Builder = CfnWebACL.CookiesProperty.builder()

  public fun matchPattern(matchPattern: IResolvable) {
    cdkBuilder.matchPattern(matchPattern)
  }

  public fun matchPattern(matchPattern: CfnWebACL.CookieMatchPatternProperty) {
    cdkBuilder.matchPattern(matchPattern)
  }

  public fun matchScope(matchScope: String) {
    cdkBuilder.matchScope(matchScope)
  }

  public fun oversizeHandling(oversizeHandling: String) {
    cdkBuilder.oversizeHandling(oversizeHandling)
  }

  public fun build(): CfnWebACL.CookiesProperty = cdkBuilder.build()
}
