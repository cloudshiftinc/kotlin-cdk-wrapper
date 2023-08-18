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

package io.cloudshiftdev.awscdkdsl.services.omics

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.omics.CfnSequenceStore

/**
 * Server-side encryption (SSE) settings for a store.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.omics.*;
 * SseConfigProperty sseConfigProperty = SseConfigProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .keyArn("keyArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-sequencestore-sseconfig.html)
 */
@CdkDslMarker
public class CfnSequenceStoreSseConfigPropertyDsl {
    private val cdkBuilder: CfnSequenceStore.SseConfigProperty.Builder =
        CfnSequenceStore.SseConfigProperty.builder()

    /** @param keyArn An encryption key ARN. */
    public fun keyArn(keyArn: String) {
        cdkBuilder.keyArn(keyArn)
    }

    /** @param type The encryption type. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnSequenceStore.SseConfigProperty = cdkBuilder.build()
}
