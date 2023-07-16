@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy

@CdkDslMarker
public class CfnOriginRequestPolicyCookiesConfigPropertyDsl {
  private val cdkBuilder: CfnOriginRequestPolicy.CookiesConfigProperty.Builder =
      CfnOriginRequestPolicy.CookiesConfigProperty.builder()

  private val _cookies: MutableList<String> = mutableListOf()

  public fun cookieBehavior(cookieBehavior: String) {
    cdkBuilder.cookieBehavior(cookieBehavior)
  }

  public fun cookies(vararg cookies: String) {
    _cookies.addAll(listOf(*cookies))
  }

  public fun cookies(cookies: Collection<String>) {
    _cookies.addAll(cookies)
  }

  public fun build(): CfnOriginRequestPolicy.CookiesConfigProperty {
    if(_cookies.isNotEmpty()) cdkBuilder.cookies(_cookies)
    return cdkBuilder.build()
  }
}
