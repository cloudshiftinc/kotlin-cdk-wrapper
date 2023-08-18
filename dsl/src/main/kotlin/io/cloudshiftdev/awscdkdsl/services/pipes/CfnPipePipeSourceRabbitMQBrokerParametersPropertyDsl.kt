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
 * The parameters for using a Rabbit MQ broker as a source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pipes.*;
 * PipeSourceRabbitMQBrokerParametersProperty pipeSourceRabbitMQBrokerParametersProperty =
 * PipeSourceRabbitMQBrokerParametersProperty.builder()
 * .credentials(MQBrokerAccessCredentialsProperty.builder()
 * .basicAuth("basicAuth")
 * .build())
 * .queueName("queueName")
 * // the properties below are optional
 * .batchSize(123)
 * .maximumBatchingWindowInSeconds(123)
 * .virtualHost("virtualHost")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcerabbitmqbrokerparameters.html)
 */
@CdkDslMarker
public class CfnPipePipeSourceRabbitMQBrokerParametersPropertyDsl {
    private val cdkBuilder: CfnPipe.PipeSourceRabbitMQBrokerParametersProperty.Builder =
        CfnPipe.PipeSourceRabbitMQBrokerParametersProperty.builder()

    /** @param batchSize The maximum number of records to include in each batch. */
    public fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
    }

    /** @param credentials The credentials needed to access the resource. */
    public fun credentials(credentials: IResolvable) {
        cdkBuilder.credentials(credentials)
    }

    /** @param credentials The credentials needed to access the resource. */
    public fun credentials(credentials: CfnPipe.MQBrokerAccessCredentialsProperty) {
        cdkBuilder.credentials(credentials)
    }

    /** @param maximumBatchingWindowInSeconds The maximum length of a time to wait for events. */
    public fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
        cdkBuilder.maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds)
    }

    /** @param queueName The name of the destination queue to consume. */
    public fun queueName(queueName: String) {
        cdkBuilder.queueName(queueName)
    }

    /** @param virtualHost The name of the virtual host associated with the source broker. */
    public fun virtualHost(virtualHost: String) {
        cdkBuilder.virtualHost(virtualHost)
    }

    public fun build(): CfnPipe.PipeSourceRabbitMQBrokerParametersProperty = cdkBuilder.build()
}
