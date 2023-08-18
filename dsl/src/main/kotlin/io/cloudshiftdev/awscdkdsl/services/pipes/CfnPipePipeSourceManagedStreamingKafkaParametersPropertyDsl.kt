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

package io.cloudshiftdev.awscdkdsl.services.pipes

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pipes.CfnPipe

/**
 * The parameters for using an MSK stream as a source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pipes.*;
 * PipeSourceManagedStreamingKafkaParametersProperty
 * pipeSourceManagedStreamingKafkaParametersProperty =
 * PipeSourceManagedStreamingKafkaParametersProperty.builder()
 * .topicName("topicName")
 * // the properties below are optional
 * .batchSize(123)
 * .consumerGroupId("consumerGroupId")
 * .credentials(MSKAccessCredentialsProperty.builder()
 * .clientCertificateTlsAuth("clientCertificateTlsAuth")
 * .saslScram512Auth("saslScram512Auth")
 * .build())
 * .maximumBatchingWindowInSeconds(123)
 * .startingPosition("startingPosition")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcemanagedstreamingkafkaparameters.html)
 */
@CdkDslMarker
public class CfnPipePipeSourceManagedStreamingKafkaParametersPropertyDsl {
    private val cdkBuilder: CfnPipe.PipeSourceManagedStreamingKafkaParametersProperty.Builder =
        CfnPipe.PipeSourceManagedStreamingKafkaParametersProperty.builder()

    /** @param batchSize The maximum number of records to include in each batch. */
    public fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
    }

    /** @param consumerGroupId The name of the destination queue to consume. */
    public fun consumerGroupId(consumerGroupId: String) {
        cdkBuilder.consumerGroupId(consumerGroupId)
    }

    /** @param credentials The credentials needed to access the resource. */
    public fun credentials(credentials: IResolvable) {
        cdkBuilder.credentials(credentials)
    }

    /** @param credentials The credentials needed to access the resource. */
    public fun credentials(credentials: CfnPipe.MSKAccessCredentialsProperty) {
        cdkBuilder.credentials(credentials)
    }

    /** @param maximumBatchingWindowInSeconds The maximum length of a time to wait for events. */
    public fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
        cdkBuilder.maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds)
    }

    /**
     * @param startingPosition (Streams only) The position in a stream from which to start reading.
     */
    public fun startingPosition(startingPosition: String) {
        cdkBuilder.startingPosition(startingPosition)
    }

    /** @param topicName The name of the topic that the pipe will read from. */
    public fun topicName(topicName: String) {
        cdkBuilder.topicName(topicName)
    }

    public fun build(): CfnPipe.PipeSourceManagedStreamingKafkaParametersProperty =
        cdkBuilder.build()
}
