@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.wafv2.CfnWebACL

@CdkDslMarker
public class CfnWebACLResponseInspectionBodyContainsPropertyDsl {
  private val cdkBuilder: CfnWebACL.ResponseInspectionBodyContainsProperty.Builder =
      CfnWebACL.ResponseInspectionBodyContainsProperty.builder()

  private val _failureStrings: MutableList<String> = mutableListOf()

  private val _successStrings: MutableList<String> = mutableListOf()

  /**
   * @param failureStrings Strings in the body of the response that indicate a failed login attempt.
   * 
   * To be counted as a failed login, the string can be anywhere in the body and must be an exact
   * match, including case. Each string must be unique among the success and failure strings.
   *
   * JSON example: `"FailureStrings": [ "Login failed" ]`
   */
  public fun failureStrings(vararg failureStrings: String) {
    _failureStrings.addAll(listOf(*failureStrings))
  }

  /**
   * @param failureStrings Strings in the body of the response that indicate a failed login attempt.
   * 
   * To be counted as a failed login, the string can be anywhere in the body and must be an exact
   * match, including case. Each string must be unique among the success and failure strings.
   *
   * JSON example: `"FailureStrings": [ "Login failed" ]`
   */
  public fun failureStrings(failureStrings: Collection<String>) {
    _failureStrings.addAll(failureStrings)
  }

  /**
   * @param successStrings Strings in the body of the response that indicate a successful login
   * attempt. 
   * To be counted as a successful login, the string can be anywhere in the body and must be an
   * exact match, including case. Each string must be unique among the success and failure strings.
   *
   * JSON example: `"SuccessStrings": [ "Login successful", "Welcome to our site!" ]`
   */
  public fun successStrings(vararg successStrings: String) {
    _successStrings.addAll(listOf(*successStrings))
  }

  /**
   * @param successStrings Strings in the body of the response that indicate a successful login
   * attempt. 
   * To be counted as a successful login, the string can be anywhere in the body and must be an
   * exact match, including case. Each string must be unique among the success and failure strings.
   *
   * JSON example: `"SuccessStrings": [ "Login successful", "Welcome to our site!" ]`
   */
  public fun successStrings(successStrings: Collection<String>) {
    _successStrings.addAll(successStrings)
  }

  public fun build(): CfnWebACL.ResponseInspectionBodyContainsProperty {
    if(_failureStrings.isNotEmpty()) cdkBuilder.failureStrings(_failureStrings)
    if(_successStrings.isNotEmpty()) cdkBuilder.successStrings(_successStrings)
    return cdkBuilder.build()
  }
}
