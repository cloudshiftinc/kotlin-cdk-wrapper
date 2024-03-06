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

package io.cloudshiftdev.awscdkdsl.services.osis

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.osis.CfnPipeline

/**
 * Options that specify the configuration of a persistent buffer.
 *
 * To configure how OpenSearch Ingestion encrypts this data, set the `EncryptionAtRestOptions` . For
 * more information, see
 * [Persistent buffering](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/osis-features-overview.html#persistent-buffering)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.osis.*;
 * BufferOptionsProperty bufferOptionsProperty = BufferOptionsProperty.builder()
 * .persistentBufferEnabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-osis-pipeline-bufferoptions.html)
 */
@CdkDslMarker
public class CfnPipelineBufferOptionsPropertyDsl {
    private val cdkBuilder: CfnPipeline.BufferOptionsProperty.Builder =
        CfnPipeline.BufferOptionsProperty.builder()

    /** @param persistentBufferEnabled Whether persistent buffering should be enabled. */
    public fun persistentBufferEnabled(persistentBufferEnabled: Boolean) {
        cdkBuilder.persistentBufferEnabled(persistentBufferEnabled)
    }

    /** @param persistentBufferEnabled Whether persistent buffering should be enabled. */
    public fun persistentBufferEnabled(persistentBufferEnabled: IResolvable) {
        cdkBuilder.persistentBufferEnabled(persistentBufferEnabled)
    }

    public fun build(): CfnPipeline.BufferOptionsProperty = cdkBuilder.build()
}
