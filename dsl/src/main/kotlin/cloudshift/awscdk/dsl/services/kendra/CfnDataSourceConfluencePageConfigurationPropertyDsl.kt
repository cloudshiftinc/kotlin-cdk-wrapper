@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource

@CdkDslMarker
public class CfnDataSourceConfluencePageConfigurationPropertyDsl {
  private val cdkBuilder: CfnDataSource.ConfluencePageConfigurationProperty.Builder =
      CfnDataSource.ConfluencePageConfigurationProperty.builder()

  private val _pageFieldMappings: MutableList<Any> = mutableListOf()

  public fun pageFieldMappings(vararg pageFieldMappings: Any) {
    _pageFieldMappings.addAll(listOf(*pageFieldMappings))
  }

  public fun pageFieldMappings(pageFieldMappings: Collection<Any>) {
    _pageFieldMappings.addAll(pageFieldMappings)
  }

  public fun pageFieldMappings(pageFieldMappings: IResolvable) {
    cdkBuilder.pageFieldMappings(pageFieldMappings)
  }

  public fun build(): CfnDataSource.ConfluencePageConfigurationProperty {
    if(_pageFieldMappings.isNotEmpty()) cdkBuilder.pageFieldMappings(_pageFieldMappings)
    return cdkBuilder.build()
  }
}
