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

/**
 * A Kinesis stream.
 *
 * Can be encrypted with a KMS key.
 *
 * Example:
 *
 * ```
 * Key key = new Key(this, "MyKey");
 * Stream.Builder.create(this, "MyEncryptedStream")
 * .encryption(StreamEncryption.KMS)
 * .encryptionKey(key)
 * .build();
 * ```
 */
@CdkDslMarker
public class StreamDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: Stream.Builder = Stream.Builder.create(scope, id)

  /**
   * The kind of server-side encryption to apply to this stream.
   *
   * If you choose KMS, you can specify a KMS key via `encryptionKey`. If
   * encryption key is not specified, a key will automatically be created.
   *
   * Default: - StreamEncryption.KMS if encrypted Streams are supported in the region
   * or StreamEncryption.UNENCRYPTED otherwise.
   * StreamEncryption.KMS if an encryption key is supplied through the encryptionKey property
   *
   * @param encryption The kind of server-side encryption to apply to this stream. 
   */
  public fun encryption(encryption: StreamEncryption) {
    cdkBuilder.encryption(encryption)
  }

  /**
   * External KMS key to use for stream encryption.
   *
   * The 'encryption' property must be set to "Kms".
   *
   * Default: - Kinesis Data Streams master key ('/alias/aws/kinesis').
   * If encryption is set to StreamEncryption.KMS and this property is undefined, a new KMS key
   * will be created and associated with this stream.
   *
   * @param encryptionKey External KMS key to use for stream encryption. 
   */
  public fun encryptionKey(encryptionKey: IKey) {
    cdkBuilder.encryptionKey(encryptionKey)
  }

  /**
   * The number of hours for the data records that are stored in shards to remain accessible.
   *
   * Default: Duration.hours(24)
   *
   * @param retentionPeriod The number of hours for the data records that are stored in shards to
   * remain accessible. 
   */
  public fun retentionPeriod(retentionPeriod: Duration) {
    cdkBuilder.retentionPeriod(retentionPeriod)
  }

  /**
   * The number of shards for the stream.
   *
   * Can only be provided if streamMode is Provisioned.
   *
   * Default: 1
   *
   * @param shardCount The number of shards for the stream. 
   */
  public fun shardCount(shardCount: Number) {
    cdkBuilder.shardCount(shardCount)
  }

  /**
   * The capacity mode of this stream.
   *
   * Default: StreamMode.PROVISIONED
   *
   * @param streamMode The capacity mode of this stream. 
   */
  public fun streamMode(streamMode: StreamMode) {
    cdkBuilder.streamMode(streamMode)
  }

  /**
   * Enforces a particular physical stream name.
   *
   * Default: <generated>
   *
   * @param streamName Enforces a particular physical stream name. 
   */
  public fun streamName(streamName: String) {
    cdkBuilder.streamName(streamName)
  }

  public fun build(): Stream = cdkBuilder.build()
}
