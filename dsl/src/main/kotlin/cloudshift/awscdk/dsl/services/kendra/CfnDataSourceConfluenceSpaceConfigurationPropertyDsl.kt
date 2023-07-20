@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource

@CdkDslMarker
public class CfnDataSourceConfluenceSpaceConfigurationPropertyDsl {
  private val cdkBuilder: CfnDataSource.ConfluenceSpaceConfigurationProperty.Builder =
      CfnDataSource.ConfluenceSpaceConfigurationProperty.builder()

  private val _excludeSpaces: MutableList<String> = mutableListOf()

  private val _includeSpaces: MutableList<String> = mutableListOf()

  private val _spaceFieldMappings: MutableList<Any> = mutableListOf()

  public fun crawlArchivedSpaces(crawlArchivedSpaces: Boolean) {
    cdkBuilder.crawlArchivedSpaces(crawlArchivedSpaces)
  }

  public fun crawlArchivedSpaces(crawlArchivedSpaces: IResolvable) {
    cdkBuilder.crawlArchivedSpaces(crawlArchivedSpaces)
  }

  public fun crawlPersonalSpaces(crawlPersonalSpaces: Boolean) {
    cdkBuilder.crawlPersonalSpaces(crawlPersonalSpaces)
  }

  public fun crawlPersonalSpaces(crawlPersonalSpaces: IResolvable) {
    cdkBuilder.crawlPersonalSpaces(crawlPersonalSpaces)
  }

  public fun excludeSpaces(vararg excludeSpaces: String) {
    _excludeSpaces.addAll(listOf(*excludeSpaces))
  }

  public fun excludeSpaces(excludeSpaces: Collection<String>) {
    _excludeSpaces.addAll(excludeSpaces)
  }

  public fun includeSpaces(vararg includeSpaces: String) {
    _includeSpaces.addAll(listOf(*includeSpaces))
  }

  public fun includeSpaces(includeSpaces: Collection<String>) {
    _includeSpaces.addAll(includeSpaces)
  }

  public fun spaceFieldMappings(vararg spaceFieldMappings: Any) {
    _spaceFieldMappings.addAll(listOf(*spaceFieldMappings))
  }

  public fun spaceFieldMappings(spaceFieldMappings: Collection<Any>) {
    _spaceFieldMappings.addAll(spaceFieldMappings)
  }

  public fun spaceFieldMappings(spaceFieldMappings: IResolvable) {
    cdkBuilder.spaceFieldMappings(spaceFieldMappings)
  }

  public fun build(): CfnDataSource.ConfluenceSpaceConfigurationProperty {
    if(_excludeSpaces.isNotEmpty()) cdkBuilder.excludeSpaces(_excludeSpaces)
    if(_includeSpaces.isNotEmpty()) cdkBuilder.includeSpaces(_includeSpaces)
    if(_spaceFieldMappings.isNotEmpty()) cdkBuilder.spaceFieldMappings(_spaceFieldMappings)
    return cdkBuilder.build()
  }
}
