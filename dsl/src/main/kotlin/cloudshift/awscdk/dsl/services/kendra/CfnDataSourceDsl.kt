@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource
import software.constructs.Construct

@CdkDslMarker
public class CfnDataSourceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDataSource.Builder = CfnDataSource.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public
      fun customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration: IResolvable) {
    cdkBuilder.customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration)
  }

  public
      fun customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration: CfnDataSource.CustomDocumentEnrichmentConfigurationProperty) {
    cdkBuilder.customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration)
  }

  public fun dataSourceConfiguration(dataSourceConfiguration: IResolvable) {
    cdkBuilder.dataSourceConfiguration(dataSourceConfiguration)
  }

  public
      fun dataSourceConfiguration(dataSourceConfiguration: CfnDataSource.DataSourceConfigurationProperty) {
    cdkBuilder.dataSourceConfiguration(dataSourceConfiguration)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun indexId(indexId: String) {
    cdkBuilder.indexId(indexId)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun schedule(schedule: String) {
    cdkBuilder.schedule(schedule)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnDataSource {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
