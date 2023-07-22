@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL

@CdkDslMarker
public class CfnWebACLResponseInspectionStatusCodePropertyDsl {
  private val cdkBuilder: CfnWebACL.ResponseInspectionStatusCodeProperty.Builder =
      CfnWebACL.ResponseInspectionStatusCodeProperty.builder()

  private val _failureCodes: MutableList<Number> = mutableListOf()

  private val _successCodes: MutableList<Number> = mutableListOf()

  /**
   * @param failureCodes Status codes in the response that indicate a failed login attempt. 
   * To be counted as a failed login, the response status code must match one of these. Each code
   * must be unique among the success and failure status codes.
   *
   * JSON example: `"FailureCodes": [ 400, 404 ]`
   */
  public fun failureCodes(vararg failureCodes: Number) {
    _failureCodes.addAll(listOf(*failureCodes))
  }

  /**
   * @param failureCodes Status codes in the response that indicate a failed login attempt. 
   * To be counted as a failed login, the response status code must match one of these. Each code
   * must be unique among the success and failure status codes.
   *
   * JSON example: `"FailureCodes": [ 400, 404 ]`
   */
  public fun failureCodes(failureCodes: Collection<Number>) {
    _failureCodes.addAll(failureCodes)
  }

  /**
   * @param failureCodes Status codes in the response that indicate a failed login attempt. 
   * To be counted as a failed login, the response status code must match one of these. Each code
   * must be unique among the success and failure status codes.
   *
   * JSON example: `"FailureCodes": [ 400, 404 ]`
   */
  public fun failureCodes(failureCodes: IResolvable) {
    cdkBuilder.failureCodes(failureCodes)
  }

  /**
   * @param successCodes Status codes in the response that indicate a successful login attempt. 
   * To be counted as a successful login, the response status code must match one of these. Each
   * code must be unique among the success and failure status codes.
   *
   * JSON example: `"SuccessCodes": [ 200, 201 ]`
   */
  public fun successCodes(vararg successCodes: Number) {
    _successCodes.addAll(listOf(*successCodes))
  }

  /**
   * @param successCodes Status codes in the response that indicate a successful login attempt. 
   * To be counted as a successful login, the response status code must match one of these. Each
   * code must be unique among the success and failure status codes.
   *
   * JSON example: `"SuccessCodes": [ 200, 201 ]`
   */
  public fun successCodes(successCodes: Collection<Number>) {
    _successCodes.addAll(successCodes)
  }

  /**
   * @param successCodes Status codes in the response that indicate a successful login attempt. 
   * To be counted as a successful login, the response status code must match one of these. Each
   * code must be unique among the success and failure status codes.
   *
   * JSON example: `"SuccessCodes": [ 200, 201 ]`
   */
  public fun successCodes(successCodes: IResolvable) {
    cdkBuilder.successCodes(successCodes)
  }

  public fun build(): CfnWebACL.ResponseInspectionStatusCodeProperty {
    if(_failureCodes.isNotEmpty()) cdkBuilder.failureCodes(_failureCodes)
    if(_successCodes.isNotEmpty()) cdkBuilder.successCodes(_successCodes)
    return cdkBuilder.build()
  }
}
