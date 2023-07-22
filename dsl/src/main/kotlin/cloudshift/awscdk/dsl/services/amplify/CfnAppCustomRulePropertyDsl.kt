@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplify

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.amplify.CfnApp

@CdkDslMarker
public class CfnAppCustomRulePropertyDsl {
  private val cdkBuilder: CfnApp.CustomRuleProperty.Builder = CfnApp.CustomRuleProperty.builder()

  /**
   * @param condition The condition for a URL rewrite or redirect rule, such as a country code.
   * *Length Constraints:* Minimum length of 0. Maximum length of 2048.
   *
   * *Pattern:* (?s).*
   */
  public fun condition(condition: String) {
    cdkBuilder.condition(condition)
  }

  /**
   * @param source The source pattern for a URL rewrite or redirect rule. 
   * *Length Constraints:* Minimum length of 1. Maximum length of 2048.
   *
   * *Pattern:* (?s).+
   */
  public fun source(source: String) {
    cdkBuilder.source(source)
  }

  /**
   * @param status The status code for a URL rewrite or redirect rule.
   * * **200** - Represents a 200 rewrite rule.
   * * **301** - Represents a 301 (moved pemanently) redirect rule. This and all future requests
   * should be directed to the target URL.
   * * **302** - Represents a 302 temporary redirect rule.
   * * **404** - Represents a 404 redirect rule.
   * * **404-200** - Represents a 404 rewrite rule.
   *
   * *Length Constraints:* Minimum length of 3. Maximum length of 7.
   *
   * *Pattern:* .{3,7}
   */
  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  /**
   * @param target The target pattern for a URL rewrite or redirect rule. 
   * *Length Constraints:* Minimum length of 1. Maximum length of 2048.
   *
   * *Pattern:* (?s).+
   */
  public fun target(target: String) {
    cdkBuilder.target(target)
  }

  public fun build(): CfnApp.CustomRuleProperty = cdkBuilder.build()
}
