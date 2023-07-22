@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnDistribution

@CdkDslMarker
public class CfnDistributionQueryStringObjectPropertyDsl {
  private val cdkBuilder: CfnDistribution.QueryStringObjectProperty.Builder =
      CfnDistribution.QueryStringObjectProperty.builder()

  private val _queryStringsAllowList: MutableList<String> = mutableListOf()

  /**
   * @param option Indicates whether the distribution forwards and caches based on query strings.
   */
  public fun option(option: Boolean) {
    cdkBuilder.option(option)
  }

  /**
   * @param option Indicates whether the distribution forwards and caches based on query strings.
   */
  public fun option(option: IResolvable) {
    cdkBuilder.option(option)
  }

  /**
   * @param queryStringsAllowList The specific query strings that the distribution forwards to the
   * origin.
   * Your distribution caches content based on the specified query strings.
   *
   * If the `option` parameter is true, then your distribution forwards all query strings,
   * regardless of what you specify using the `QueryStringsAllowList` parameter.
   */
  public fun queryStringsAllowList(vararg queryStringsAllowList: String) {
    _queryStringsAllowList.addAll(listOf(*queryStringsAllowList))
  }

  /**
   * @param queryStringsAllowList The specific query strings that the distribution forwards to the
   * origin.
   * Your distribution caches content based on the specified query strings.
   *
   * If the `option` parameter is true, then your distribution forwards all query strings,
   * regardless of what you specify using the `QueryStringsAllowList` parameter.
   */
  public fun queryStringsAllowList(queryStringsAllowList: Collection<String>) {
    _queryStringsAllowList.addAll(queryStringsAllowList)
  }

  public fun build(): CfnDistribution.QueryStringObjectProperty {
    if(_queryStringsAllowList.isNotEmpty()) cdkBuilder.queryStringsAllowList(_queryStringsAllowList)
    return cdkBuilder.build()
  }
}
