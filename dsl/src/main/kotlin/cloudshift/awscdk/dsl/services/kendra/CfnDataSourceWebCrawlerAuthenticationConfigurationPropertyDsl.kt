@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource

@CdkDslMarker
public class CfnDataSourceWebCrawlerAuthenticationConfigurationPropertyDsl {
  private val cdkBuilder: CfnDataSource.WebCrawlerAuthenticationConfigurationProperty.Builder =
      CfnDataSource.WebCrawlerAuthenticationConfigurationProperty.builder()

  private val _basicAuthentication: MutableList<Any> = mutableListOf()

  public fun basicAuthentication(vararg basicAuthentication: Any) {
    _basicAuthentication.addAll(listOf(*basicAuthentication))
  }

  public fun basicAuthentication(basicAuthentication: Collection<Any>) {
    _basicAuthentication.addAll(basicAuthentication)
  }

  public fun basicAuthentication(basicAuthentication: IResolvable) {
    cdkBuilder.basicAuthentication(basicAuthentication)
  }

  public fun build(): CfnDataSource.WebCrawlerAuthenticationConfigurationProperty {
    if(_basicAuthentication.isNotEmpty()) cdkBuilder.basicAuthentication(_basicAuthentication)
    return cdkBuilder.build()
  }
}
