@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.kendra.CfnDataSource

@CdkDslMarker
public class CfnDataSourceWebCrawlerSiteMapsConfigurationPropertyDsl {
  private val cdkBuilder: CfnDataSource.WebCrawlerSiteMapsConfigurationProperty.Builder =
      CfnDataSource.WebCrawlerSiteMapsConfigurationProperty.builder()

  private val _siteMaps: MutableList<String> = mutableListOf()

  /**
   * @param siteMaps The list of sitemap URLs of the websites you want to crawl. 
   * The list can include a maximum of three sitemap URLs.
   */
  public fun siteMaps(vararg siteMaps: String) {
    _siteMaps.addAll(listOf(*siteMaps))
  }

  /**
   * @param siteMaps The list of sitemap URLs of the websites you want to crawl. 
   * The list can include a maximum of three sitemap URLs.
   */
  public fun siteMaps(siteMaps: Collection<String>) {
    _siteMaps.addAll(siteMaps)
  }

  public fun build(): CfnDataSource.WebCrawlerSiteMapsConfigurationProperty {
    if(_siteMaps.isNotEmpty()) cdkBuilder.siteMaps(_siteMaps)
    return cdkBuilder.build()
  }
}
