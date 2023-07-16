@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnDatastore
import software.constructs.Construct

@CdkDslMarker
public class CfnDatastoreDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDatastore.Builder = CfnDatastore.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun datastoreName(datastoreName: String) {
    cdkBuilder.datastoreName(datastoreName)
  }

  public fun datastorePartitions(datastorePartitions: IResolvable) {
    cdkBuilder.datastorePartitions(datastorePartitions)
  }

  public fun datastorePartitions(datastorePartitions: CfnDatastore.DatastorePartitionsProperty) {
    cdkBuilder.datastorePartitions(datastorePartitions)
  }

  public fun datastoreStorage(datastoreStorage: IResolvable) {
    cdkBuilder.datastoreStorage(datastoreStorage)
  }

  public fun datastoreStorage(datastoreStorage: CfnDatastore.DatastoreStorageProperty) {
    cdkBuilder.datastoreStorage(datastoreStorage)
  }

  public fun fileFormatConfiguration(fileFormatConfiguration: IResolvable) {
    cdkBuilder.fileFormatConfiguration(fileFormatConfiguration)
  }

  public
      fun fileFormatConfiguration(fileFormatConfiguration: CfnDatastore.FileFormatConfigurationProperty) {
    cdkBuilder.fileFormatConfiguration(fileFormatConfiguration)
  }

  public fun retentionPeriod(retentionPeriod: IResolvable) {
    cdkBuilder.retentionPeriod(retentionPeriod)
  }

  public fun retentionPeriod(retentionPeriod: CfnDatastore.RetentionPeriodProperty) {
    cdkBuilder.retentionPeriod(retentionPeriod)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDatastore {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
