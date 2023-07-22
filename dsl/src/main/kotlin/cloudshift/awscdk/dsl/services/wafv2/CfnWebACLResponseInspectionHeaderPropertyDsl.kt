@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.wafv2.CfnWebACL

@CdkDslMarker
public class CfnWebACLResponseInspectionHeaderPropertyDsl {
  private val cdkBuilder: CfnWebACL.ResponseInspectionHeaderProperty.Builder =
      CfnWebACL.ResponseInspectionHeaderProperty.builder()

  private val _failureValues: MutableList<String> = mutableListOf()

  private val _successValues: MutableList<String> = mutableListOf()

  /**
   * @param failureValues Values in the response header with the specified name that indicate a
   * failed login attempt. 
   * To be counted as a failed login, the value must be an exact match, including case. Each value
   * must be unique among the success and failure values.
   *
   * JSON example: `"FailureValues": [ "LoginFailed", "Failed login" ]`
   */
  public fun failureValues(vararg failureValues: String) {
    _failureValues.addAll(listOf(*failureValues))
  }

  /**
   * @param failureValues Values in the response header with the specified name that indicate a
   * failed login attempt. 
   * To be counted as a failed login, the value must be an exact match, including case. Each value
   * must be unique among the success and failure values.
   *
   * JSON example: `"FailureValues": [ "LoginFailed", "Failed login" ]`
   */
  public fun failureValues(failureValues: Collection<String>) {
    _failureValues.addAll(failureValues)
  }

  /**
   * @param name The name of the header to match against. The name must be an exact match, including
   * case. 
   * JSON example: `"Name": [ "LoginResult" ]`
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param successValues Values in the response header with the specified name that indicate a
   * successful login attempt. 
   * To be counted as a successful login, the value must be an exact match, including case. Each
   * value must be unique among the success and failure values.
   *
   * JSON example: `"SuccessValues": [ "LoginPassed", "Successful login" ]`
   */
  public fun successValues(vararg successValues: String) {
    _successValues.addAll(listOf(*successValues))
  }

  /**
   * @param successValues Values in the response header with the specified name that indicate a
   * successful login attempt. 
   * To be counted as a successful login, the value must be an exact match, including case. Each
   * value must be unique among the success and failure values.
   *
   * JSON example: `"SuccessValues": [ "LoginPassed", "Successful login" ]`
   */
  public fun successValues(successValues: Collection<String>) {
    _successValues.addAll(successValues)
  }

  public fun build(): CfnWebACL.ResponseInspectionHeaderProperty {
    if(_failureValues.isNotEmpty()) cdkBuilder.failureValues(_failureValues)
    if(_successValues.isNotEmpty()) cdkBuilder.successValues(_successValues)
    return cdkBuilder.build()
  }
}
