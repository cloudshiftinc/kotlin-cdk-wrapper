@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.lightsail.CfnDistribution

@CdkDslMarker
public class CfnDistributionCookieObjectPropertyDsl {
  private val cdkBuilder: CfnDistribution.CookieObjectProperty.Builder =
      CfnDistribution.CookieObjectProperty.builder()

  private val _cookiesAllowList: MutableList<String> = mutableListOf()

  /**
   * @param cookiesAllowList The specific cookies to forward to your distribution's origin.
   */
  public fun cookiesAllowList(vararg cookiesAllowList: String) {
    _cookiesAllowList.addAll(listOf(*cookiesAllowList))
  }

  /**
   * @param cookiesAllowList The specific cookies to forward to your distribution's origin.
   */
  public fun cookiesAllowList(cookiesAllowList: Collection<String>) {
    _cookiesAllowList.addAll(cookiesAllowList)
  }

  /**
   * @param option Specifies which cookies to forward to the distribution's origin for a cache
   * behavior.
   * Use one of the following configurations for your distribution:
   *
   * * *`all`* - Forwards all cookies to your origin.
   * * *`none`* - Doesn’t forward cookies to your origin.
   * * *`allow-list`* - Forwards only the cookies that you specify using the `CookiesAllowList`
   * parameter.
   */
  public fun option(option: String) {
    cdkBuilder.option(option)
  }

  public fun build(): CfnDistribution.CookieObjectProperty {
    if(_cookiesAllowList.isNotEmpty()) cdkBuilder.cookiesAllowList(_cookiesAllowList)
    return cdkBuilder.build()
  }
}
