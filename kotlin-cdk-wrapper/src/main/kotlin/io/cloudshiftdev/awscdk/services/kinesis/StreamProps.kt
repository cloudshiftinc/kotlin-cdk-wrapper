@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesis

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface StreamProps {
  public fun encryption(): StreamEncryption? =
      unwrap(this).getEncryption()?.let(StreamEncryption::wrap)

  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  public fun retentionPeriod(): Duration? = unwrap(this).getRetentionPeriod()?.let(Duration::wrap)

  public fun shardCount(): Number? = unwrap(this).getShardCount()

  public fun streamMode(): StreamMode? = unwrap(this).getStreamMode()?.let(StreamMode::wrap)

  public fun streamName(): String? = unwrap(this).getStreamName()

  @CdkDslMarker
  public interface Builder {
    public fun encryption(encryption: StreamEncryption)

    public fun encryptionKey(encryptionKey: IKey)

    public fun retentionPeriod(retentionPeriod: Duration)

    public fun shardCount(shardCount: Number)

    public fun streamMode(streamMode: StreamMode)

    public fun streamName(streamName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kinesis.StreamProps.Builder =
        software.amazon.awscdk.services.kinesis.StreamProps.builder()

    override fun encryption(encryption: StreamEncryption) {
      cdkBuilder.encryption(encryption.let(StreamEncryption::unwrap))
    }

    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    override fun retentionPeriod(retentionPeriod: Duration) {
      cdkBuilder.retentionPeriod(retentionPeriod.let(Duration::unwrap))
    }

    override fun shardCount(shardCount: Number) {
      cdkBuilder.shardCount(shardCount)
    }

    override fun streamMode(streamMode: StreamMode) {
      cdkBuilder.streamMode(streamMode.let(StreamMode::unwrap))
    }

    override fun streamName(streamName: String) {
      cdkBuilder.streamName(streamName)
    }

    public fun build(): software.amazon.awscdk.services.kinesis.StreamProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.kinesis.StreamProps,
  ) : CdkObject(cdkObject), StreamProps {
    override fun encryption(): StreamEncryption? =
        unwrap(this).getEncryption()?.let(StreamEncryption::wrap)

    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    override fun retentionPeriod(): Duration? =
        unwrap(this).getRetentionPeriod()?.let(Duration::wrap)

    override fun shardCount(): Number? = unwrap(this).getShardCount()

    override fun streamMode(): StreamMode? = unwrap(this).getStreamMode()?.let(StreamMode::wrap)

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
