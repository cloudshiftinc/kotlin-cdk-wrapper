@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.kinesis

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.kinesis.StreamEncryption
import software.amazon.awscdk.services.kinesis.StreamMode
import software.amazon.awscdk.services.kinesis.StreamProps
import software.amazon.awscdk.services.kms.IKey

/**
 * Properties for a Kinesis Stream.
 *
 * Example:
 * ```
 * Key key = new Key(this, "MyKey");
 * Stream.Builder.create(this, "MyEncryptedStream")
 * .encryption(StreamEncryption.KMS)
 * .encryptionKey(key)
 * .build();
 * ```
 */
@CdkDslMarker
public class StreamPropsDsl {
    private val cdkBuilder: StreamProps.Builder = StreamProps.builder()

    /**
     * @param encryption The kind of server-side encryption to apply to this stream. If you choose
     *   KMS, you can specify a KMS key via `encryptionKey`. If encryption key is not specified, a
     *   key will automatically be created.
     */
    public fun encryption(encryption: StreamEncryption) {
        cdkBuilder.encryption(encryption)
    }

    /**
     * @param encryptionKey External KMS key to use for stream encryption. The 'encryption' property
     *   must be set to "Kms".
     */
    public fun encryptionKey(encryptionKey: IKey) {
        cdkBuilder.encryptionKey(encryptionKey)
    }

    /**
     * @param retentionPeriod The number of hours for the data records that are stored in shards to
     *   remain accessible.
     */
    public fun retentionPeriod(retentionPeriod: Duration) {
        cdkBuilder.retentionPeriod(retentionPeriod)
    }

    /**
     * @param shardCount The number of shards for the stream. Can only be provided if streamMode is
     *   Provisioned.
     */
    public fun shardCount(shardCount: Number) {
        cdkBuilder.shardCount(shardCount)
    }

    /** @param streamMode The capacity mode of this stream. */
    public fun streamMode(streamMode: StreamMode) {
        cdkBuilder.streamMode(streamMode)
    }

    /** @param streamName Enforces a particular physical stream name. */
    public fun streamName(streamName: String) {
        cdkBuilder.streamName(streamName)
    }

    public fun build(): StreamProps = cdkBuilder.build()
}
