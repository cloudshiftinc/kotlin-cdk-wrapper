@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesis

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties for a Kinesis Stream.
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
public interface StreamProps {
  /**
   * The kind of server-side encryption to apply to this stream.
   *
   * If you choose KMS, you can specify a KMS key via `encryptionKey`. If
   * encryption key is not specified, a key will automatically be created.
   *
   * Default: - StreamEncryption.KMS if encrypted Streams are supported in the region
   * or StreamEncryption.UNENCRYPTED otherwise.
   * StreamEncryption.KMS if an encryption key is supplied through the encryptionKey property
   */
  public fun encryption(): StreamEncryption? =
      unwrap(this).getEncryption()?.let(StreamEncryption::wrap)

  /**
   * External KMS key to use for stream encryption.
   *
   * The 'encryption' property must be set to "Kms".
   *
   * Default: - Kinesis Data Streams master key ('/alias/aws/kinesis').
   * If encryption is set to StreamEncryption.KMS and this property is undefined, a new KMS key
   * will be created and associated with this stream.
   */
  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  /**
   * The number of hours for the data records that are stored in shards to remain accessible.
   *
   * Default: Duration.hours(24)
   */
  public fun retentionPeriod(): Duration? = unwrap(this).getRetentionPeriod()?.let(Duration::wrap)

  /**
   * The number of shards for the stream.
   *
   * Can only be provided if streamMode is Provisioned.
   *
   * Default: 1
   */
  public fun shardCount(): Number? = unwrap(this).getShardCount()

  /**
   * The capacity mode of this stream.
   *
   * Default: StreamMode.PROVISIONED
   */
  public fun streamMode(): StreamMode? = unwrap(this).getStreamMode()?.let(StreamMode::wrap)

  /**
   * Enforces a particular physical stream name.
   *
   * Default: <generated>
   */
  public fun streamName(): String? = unwrap(this).getStreamName()

  /**
   * A builder for [StreamProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param encryption The kind of server-side encryption to apply to this stream.
     * If you choose KMS, you can specify a KMS key via `encryptionKey`. If
     * encryption key is not specified, a key will automatically be created.
     */
    public fun encryption(encryption: StreamEncryption)

    /**
     * @param encryptionKey External KMS key to use for stream encryption.
     * The 'encryption' property must be set to "Kms".
     */
    public fun encryptionKey(encryptionKey: IKey)

    /**
     * @param retentionPeriod The number of hours for the data records that are stored in shards to
     * remain accessible.
     */
    public fun retentionPeriod(retentionPeriod: Duration)

    /**
     * @param shardCount The number of shards for the stream.
     * Can only be provided if streamMode is Provisioned.
     */
    public fun shardCount(shardCount: Number)

    /**
     * @param streamMode The capacity mode of this stream.
     */
    public fun streamMode(streamMode: StreamMode)

    /**
     * @param streamName Enforces a particular physical stream name.
     */
    public fun streamName(streamName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kinesis.StreamProps.Builder =
        software.amazon.awscdk.services.kinesis.StreamProps.builder()

    /**
     * @param encryption The kind of server-side encryption to apply to this stream.
     * If you choose KMS, you can specify a KMS key via `encryptionKey`. If
     * encryption key is not specified, a key will automatically be created.
     */
    override fun encryption(encryption: StreamEncryption) {
      cdkBuilder.encryption(encryption.let(StreamEncryption::unwrap))
    }

    /**
     * @param encryptionKey External KMS key to use for stream encryption.
     * The 'encryption' property must be set to "Kms".
     */
    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    /**
     * @param retentionPeriod The number of hours for the data records that are stored in shards to
     * remain accessible.
     */
    override fun retentionPeriod(retentionPeriod: Duration) {
      cdkBuilder.retentionPeriod(retentionPeriod.let(Duration::unwrap))
    }

    /**
     * @param shardCount The number of shards for the stream.
     * Can only be provided if streamMode is Provisioned.
     */
    override fun shardCount(shardCount: Number) {
      cdkBuilder.shardCount(shardCount)
    }

    /**
     * @param streamMode The capacity mode of this stream.
     */
    override fun streamMode(streamMode: StreamMode) {
      cdkBuilder.streamMode(streamMode.let(StreamMode::unwrap))
    }

    /**
     * @param streamName Enforces a particular physical stream name.
     */
    override fun streamName(streamName: String) {
      cdkBuilder.streamName(streamName)
    }

    public fun build(): software.amazon.awscdk.services.kinesis.StreamProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.kinesis.StreamProps,
  ) : CdkObject(cdkObject), StreamProps {
    /**
     * The kind of server-side encryption to apply to this stream.
     *
     * If you choose KMS, you can specify a KMS key via `encryptionKey`. If
     * encryption key is not specified, a key will automatically be created.
     *
     * Default: - StreamEncryption.KMS if encrypted Streams are supported in the region
     * or StreamEncryption.UNENCRYPTED otherwise.
     * StreamEncryption.KMS if an encryption key is supplied through the encryptionKey property
     */
    override fun encryption(): StreamEncryption? =
        unwrap(this).getEncryption()?.let(StreamEncryption::wrap)

    /**
     * External KMS key to use for stream encryption.
     *
     * The 'encryption' property must be set to "Kms".
     *
     * Default: - Kinesis Data Streams master key ('/alias/aws/kinesis').
     * If encryption is set to StreamEncryption.KMS and this property is undefined, a new KMS key
     * will be created and associated with this stream.
     */
    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    /**
     * The number of hours for the data records that are stored in shards to remain accessible.
     *
     * Default: Duration.hours(24)
     */
    override fun retentionPeriod(): Duration? =
        unwrap(this).getRetentionPeriod()?.let(Duration::wrap)

    /**
     * The number of shards for the stream.
     *
     * Can only be provided if streamMode is Provisioned.
     *
     * Default: 1
     */
    override fun shardCount(): Number? = unwrap(this).getShardCount()

    /**
     * The capacity mode of this stream.
     *
     * Default: StreamMode.PROVISIONED
     */
    override fun streamMode(): StreamMode? = unwrap(this).getStreamMode()?.let(StreamMode::wrap)

    /**
     * Enforces a particular physical stream name.
     *
     * Default: <generated>
     */
    override fun streamName(): String? = unwrap(this).getStreamName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StreamProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kinesis.StreamProps): StreamProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: StreamProps): software.amazon.awscdk.services.kinesis.StreamProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.kinesis.StreamProps
  }
}
