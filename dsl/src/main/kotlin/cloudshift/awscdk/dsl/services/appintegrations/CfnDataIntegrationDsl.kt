@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appintegrations

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appintegrations.CfnDataIntegration
import software.constructs.Construct

@CdkDslMarker
public class CfnDataIntegrationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDataIntegration.Builder = CfnDataIntegration.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun fileConfiguration(fileConfiguration: IResolvable) {
    cdkBuilder.fileConfiguration(fileConfiguration)
  }

  public fun fileConfiguration(fileConfiguration: CfnDataIntegration.FileConfigurationProperty) {
    cdkBuilder.fileConfiguration(fileConfiguration)
  }

  public fun kmsKey(kmsKey: String) {
    cdkBuilder.kmsKey(kmsKey)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun objectConfiguration(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.objectConfiguration(builder.map)
  }

  public fun objectConfiguration(objectConfiguration: Any) {
    cdkBuilder.objectConfiguration(objectConfiguration)
  }

  public fun scheduleConfig(scheduleConfig: IResolvable) {
    cdkBuilder.scheduleConfig(scheduleConfig)
  }

  public fun scheduleConfig(scheduleConfig: CfnDataIntegration.ScheduleConfigProperty) {
    cdkBuilder.scheduleConfig(scheduleConfig)
  }

  public fun sourceUri(sourceUri: String) {
    cdkBuilder.sourceUri(sourceUri)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDataIntegration {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
