@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesis

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesis.CfnStream
import software.amazon.awscdk.services.kinesis.CfnStreamProps

@CdkDslMarker
public class CfnStreamPropsDsl {
  private val cdkBuilder: CfnStreamProps.Builder = CfnStreamProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun retentionPeriodHours(retentionPeriodHours: Number) {
    cdkBuilder.retentionPeriodHours(retentionPeriodHours)
  }

  public fun shardCount(shardCount: Number) {
    cdkBuilder.shardCount(shardCount)
  }

  public fun streamEncryption(streamEncryption: IResolvable) {
    cdkBuilder.streamEncryption(streamEncryption)
  }

  public fun streamEncryption(streamEncryption: CfnStream.StreamEncryptionProperty) {
    cdkBuilder.streamEncryption(streamEncryption)
  }

  public fun streamModeDetails(streamModeDetails: IResolvable) {
    cdkBuilder.streamModeDetails(streamModeDetails)
  }

  public fun streamModeDetails(streamModeDetails: CfnStream.StreamModeDetailsProperty) {
    cdkBuilder.streamModeDetails(streamModeDetails)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnStreamProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
