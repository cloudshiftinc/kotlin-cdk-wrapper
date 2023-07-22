@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.lightsail.CfnDistribution

@CdkDslMarker
public class CfnDistributionHeaderObjectPropertyDsl {
  private val cdkBuilder: CfnDistribution.HeaderObjectProperty.Builder =
      CfnDistribution.HeaderObjectProperty.builder()

  private val _headersAllowList: MutableList<String> = mutableListOf()

  /**
   * @param headersAllowList The specific headers to forward to your distribution's origin.
   */
  public fun headersAllowList(vararg headersAllowList: String) {
    _headersAllowList.addAll(listOf(*headersAllowList))
  }

  /**
   * @param headersAllowList The specific headers to forward to your distribution's origin.
   */
  public fun headersAllowList(headersAllowList: Collection<String>) {
    _headersAllowList.addAll(headersAllowList)
  }

  /**
   * @param option The headers that you want your distribution to forward to your origin.
   * Your distribution caches your content based on these headers.
   *
   * Use one of the following configurations for your distribution:
   *
   * * *`all`* - Forwards all headers to your origin..
   * * *`none`* - Forwards only the default headers.
   * * *`allow-list`* - Forwards only the headers that you specify using the `HeadersAllowList`
   * parameter.
   */
  public fun option(option: String) {
    cdkBuilder.option(option)
  }

  public fun build(): CfnDistribution.HeaderObjectProperty {
    if(_headersAllowList.isNotEmpty()) cdkBuilder.headersAllowList(_headersAllowList)
    return cdkBuilder.build()
  }
}
