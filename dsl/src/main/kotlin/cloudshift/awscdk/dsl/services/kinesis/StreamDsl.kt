@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesis

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.kinesis.Stream
import software.amazon.awscdk.services.kinesis.StreamEncryption
import software.amazon.awscdk.services.kinesis.StreamMode
import software.amazon.awscdk.services.kms.IKey
import software.constructs.Construct

@CdkDslMarker
public class StreamDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: Stream.Builder = Stream.Builder.create(scope, id)

  public fun encryption(encryption: StreamEncryption) {
    cdkBuilder.encryption(encryption)
  }

  public fun encryptionKey(encryptionKey: IKey) {
    cdkBuilder.encryptionKey(encryptionKey)
  }

  public fun retentionPeriod(retentionPeriod: Duration) {
    cdkBuilder.retentionPeriod(retentionPeriod)
  }

  public fun shardCount(shardCount: Number) {
    cdkBuilder.shardCount(shardCount)
  }

  public fun streamMode(streamMode: StreamMode) {
    cdkBuilder.streamMode(streamMode)
  }

  public fun streamName(streamName: String) {
    cdkBuilder.streamName(streamName)
  }

  public fun build(): Stream = cdkBuilder.build()
}
