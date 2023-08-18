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
import kotlin.String
import software.amazon.awscdk.services.kinesis.StreamAttributes
import software.amazon.awscdk.services.kms.IKey

/**
 * A reference to a stream.
 *
 * The easiest way to instantiate is to call `stream.export()`. Then, the consumer can use
 * `Stream.import(this, ref)` and get a `Stream`.
 *
 * Example:
 * ```
 * IStream importedStream = Stream.fromStreamAttributes(this, "ImportedEncryptedStream",
 * StreamAttributes.builder()
 * .streamArn("arn:aws:kinesis:us-east-2:123456789012:stream/f3j09j2230j")
 * .encryptionKey(Key.fromKeyArn(this, "key",
 * "arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012"))
 * .build());
 * ```
 */
@CdkDslMarker
public class StreamAttributesDsl {
    private val cdkBuilder: StreamAttributes.Builder = StreamAttributes.builder()

    /**
     * @param encryptionKey The KMS key securing the contents of the stream if encryption is
     *   enabled.
     */
    public fun encryptionKey(encryptionKey: IKey) {
        cdkBuilder.encryptionKey(encryptionKey)
    }

    /** @param streamArn The ARN of the stream. */
    public fun streamArn(streamArn: String) {
        cdkBuilder.streamArn(streamArn)
    }

    public fun build(): StreamAttributes = cdkBuilder.build()
}
