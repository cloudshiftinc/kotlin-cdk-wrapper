@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource

@CdkDslMarker
public class CfnDataSourceWebCrawlerUrlsPropertyDsl {
  private val cdkBuilder: CfnDataSource.WebCrawlerUrlsProperty.Builder =
      CfnDataSource.WebCrawlerUrlsProperty.builder()

  public fun seedUrlConfiguration(seedUrlConfiguration: IResolvable) {
    cdkBuilder.seedUrlConfiguration(seedUrlConfiguration)
  }

  public
      fun seedUrlConfiguration(seedUrlConfiguration: CfnDataSource.WebCrawlerSeedUrlConfigurationProperty) {
    cdkBuilder.seedUrlConfiguration(seedUrlConfiguration)
  }

  public fun siteMapsConfiguration(siteMapsConfiguration: IResolvable) {
    cdkBuilder.siteMapsConfiguration(siteMapsConfiguration)
  }

  public
      fun siteMapsConfiguration(siteMapsConfiguration: CfnDataSource.WebCrawlerSiteMapsConfigurationProperty) {
    cdkBuilder.siteMapsConfiguration(siteMapsConfiguration)
  }

  public fun build(): CfnDataSource.WebCrawlerUrlsProperty = cdkBuilder.build()
}
