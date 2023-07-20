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

  public fun failureStrings(vararg failureStrings: String) {
    _failureStrings.addAll(listOf(*failureStrings))
  }

  public fun failureStrings(failureStrings: Collection<String>) {
    _failureStrings.addAll(failureStrings)
  }

  public fun successStrings(vararg successStrings: String) {
    _successStrings.addAll(listOf(*successStrings))
  }

  public fun successStrings(successStrings: Collection<String>) {
    _successStrings.addAll(successStrings)
  }

  public fun build(): CfnWebACL.ResponseInspectionBodyContainsProperty {
    if(_failureStrings.isNotEmpty()) cdkBuilder.failureStrings(_failureStrings)
    if(_successStrings.isNotEmpty()) cdkBuilder.successStrings(_successStrings)
    return cdkBuilder.build()
  }
}
