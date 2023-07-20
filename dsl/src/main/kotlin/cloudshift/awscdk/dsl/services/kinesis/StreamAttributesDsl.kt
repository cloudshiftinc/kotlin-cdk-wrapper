@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.kinesis

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.kinesis.StreamAttributes
import software.amazon.awscdk.services.kms.IKey
import kotlin.String

@CdkDslMarker
public class StreamAttributesDsl {
    private val cdkBuilder: StreamAttributes.Builder = StreamAttributes.builder()

    public fun encryptionKey(encryptionKey: IKey) {
        cdkBuilder.encryptionKey(encryptionKey)
    }

    public fun streamArn(streamArn: String) {
        cdkBuilder.streamArn(streamArn)
    }

    public fun build(): StreamAttributes = cdkBuilder.build()
}
