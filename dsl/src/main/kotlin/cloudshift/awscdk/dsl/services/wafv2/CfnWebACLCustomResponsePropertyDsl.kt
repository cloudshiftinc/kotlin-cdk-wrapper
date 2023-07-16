@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL

@CdkDslMarker
public class CfnWebACLCustomResponsePropertyDsl {
  private val cdkBuilder: CfnWebACL.CustomResponseProperty.Builder =
      CfnWebACL.CustomResponseProperty.builder()

  private val _responseHeaders: MutableList<Any> = mutableListOf()

  public fun customResponseBodyKey(customResponseBodyKey: String) {
    cdkBuilder.customResponseBodyKey(customResponseBodyKey)
  }

  public fun responseCode(responseCode: Number) {
    cdkBuilder.responseCode(responseCode)
  }

  public fun responseHeaders(vararg responseHeaders: Any) {
    _responseHeaders.addAll(listOf(*responseHeaders))
  }

  public fun responseHeaders(responseHeaders: Collection<Any>) {
    _responseHeaders.addAll(responseHeaders)
  }

  public fun responseHeaders(responseHeaders: IResolvable) {
    cdkBuilder.responseHeaders(responseHeaders)
  }

  public fun build(): CfnWebACL.CustomResponseProperty {
    if(_responseHeaders.isNotEmpty()) cdkBuilder.responseHeaders(_responseHeaders)
    return cdkBuilder.build()
  }
}
