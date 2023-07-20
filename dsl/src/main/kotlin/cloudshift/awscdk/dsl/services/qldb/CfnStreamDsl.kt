@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.qldb

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.qldb.CfnStream
import software.constructs.Construct

@CdkDslMarker
public class CfnStreamDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnStream.Builder = CfnStream.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun exclusiveEndTime(exclusiveEndTime: String) {
    cdkBuilder.exclusiveEndTime(exclusiveEndTime)
  }

  public fun inclusiveStartTime(inclusiveStartTime: String) {
    cdkBuilder.inclusiveStartTime(inclusiveStartTime)
  }

  public fun kinesisConfiguration(kinesisConfiguration: IResolvable) {
    cdkBuilder.kinesisConfiguration(kinesisConfiguration)
  }

  public fun kinesisConfiguration(kinesisConfiguration: CfnStream.KinesisConfigurationProperty) {
    cdkBuilder.kinesisConfiguration(kinesisConfiguration)
  }

  public fun ledgerName(ledgerName: String) {
    cdkBuilder.ledgerName(ledgerName)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun streamName(streamName: String) {
    cdkBuilder.streamName(streamName)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnStream {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
