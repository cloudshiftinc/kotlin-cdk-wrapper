@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.wafv2.CfnWebACL

@CdkDslMarker
public class CfnWebACLResponseInspectionJsonPropertyDsl {
  private val cdkBuilder: CfnWebACL.ResponseInspectionJsonProperty.Builder =
      CfnWebACL.ResponseInspectionJsonProperty.builder()

  private val _failureValues: MutableList<String> = mutableListOf()

  private val _successValues: MutableList<String> = mutableListOf()

  /**
   * @param failureValues Values for the specified identifier in the response JSON that indicate a
   * failed login attempt. 
   * To be counted as a failed login, the value must be an exact match, including case. Each value
   * must be unique among the success and failure values.
   *
   * JSON example: `"FailureValues": [ "False", "Failed" ]`
   */
  public fun failureValues(vararg failureValues: String) {
    _failureValues.addAll(listOf(*failureValues))
  }

  /**
   * @param failureValues Values for the specified identifier in the response JSON that indicate a
   * failed login attempt. 
   * To be counted as a failed login, the value must be an exact match, including case. Each value
   * must be unique among the success and failure values.
   *
   * JSON example: `"FailureValues": [ "False", "Failed" ]`
   */
  public fun failureValues(failureValues: Collection<String>) {
    _failureValues.addAll(failureValues)
  }

  /**
   * @param identifier The identifier for the value to match against in the JSON. 
   * The identifier must be an exact match, including case.
   *
   * JSON example: `"Identifier": [ "/login/success" ]`
   */
  public fun identifier(identifier: String) {
    cdkBuilder.identifier(identifier)
  }

  /**
   * @param successValues Values for the specified identifier in the response JSON that indicate a
   * successful login attempt. 
   * To be counted as a successful login, the value must be an exact match, including case. Each
   * value must be unique among the success and failure values.
   *
   * JSON example: `"SuccessValues": [ "True", "Succeeded" ]`
   */
  public fun successValues(vararg successValues: String) {
    _successValues.addAll(listOf(*successValues))
  }

  /**
   * @param successValues Values for the specified identifier in the response JSON that indicate a
   * successful login attempt. 
   * To be counted as a successful login, the value must be an exact match, including case. Each
   * value must be unique among the success and failure values.
   *
   * JSON example: `"SuccessValues": [ "True", "Succeeded" ]`
   */
  public fun successValues(successValues: Collection<String>) {
    _successValues.addAll(successValues)
  }

  public fun build(): CfnWebACL.ResponseInspectionJsonProperty {
    if(_failureValues.isNotEmpty()) cdkBuilder.failureValues(_failureValues)
    if(_successValues.isNotEmpty()) cdkBuilder.successValues(_successValues)
    return cdkBuilder.build()
  }
}
