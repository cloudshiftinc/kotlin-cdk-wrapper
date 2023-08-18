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
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pipes.CfnPipe

/**
 * The parameters for using a self-managed Apache Kafka stream as a source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pipes.*;
 * PipeSourceSelfManagedKafkaParametersProperty pipeSourceSelfManagedKafkaParametersProperty =
 * PipeSourceSelfManagedKafkaParametersProperty.builder()
 * .topicName("topicName")
 * // the properties below are optional
 * .additionalBootstrapServers(List.of("additionalBootstrapServers"))
 * .batchSize(123)
 * .consumerGroupId("consumerGroupId")
 * .credentials(SelfManagedKafkaAccessConfigurationCredentialsProperty.builder()
 * .basicAuth("basicAuth")
 * .clientCertificateTlsAuth("clientCertificateTlsAuth")
 * .saslScram256Auth("saslScram256Auth")
 * .saslScram512Auth("saslScram512Auth")
 * .build())
 * .maximumBatchingWindowInSeconds(123)
 * .serverRootCaCertificate("serverRootCaCertificate")
 * .startingPosition("startingPosition")
 * .vpc(SelfManagedKafkaAccessConfigurationVpcProperty.builder()
 * .securityGroup(List.of("securityGroup"))
 * .subnets(List.of("subnets"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourceselfmanagedkafkaparameters.html)
 */
@CdkDslMarker
public class CfnPipePipeSourceSelfManagedKafkaParametersPropertyDsl {
    private val cdkBuilder: CfnPipe.PipeSourceSelfManagedKafkaParametersProperty.Builder =
        CfnPipe.PipeSourceSelfManagedKafkaParametersProperty.builder()

    private val _additionalBootstrapServers: MutableList<String> = mutableListOf()

    /** @param additionalBootstrapServers An array of server URLs. */
    public fun additionalBootstrapServers(vararg additionalBootstrapServers: String) {
        _additionalBootstrapServers.addAll(listOf(*additionalBootstrapServers))
    }

    /** @param additionalBootstrapServers An array of server URLs. */
    public fun additionalBootstrapServers(additionalBootstrapServers: Collection<String>) {
        _additionalBootstrapServers.addAll(additionalBootstrapServers)
    }

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
    public fun credentials(
        credentials: CfnPipe.SelfManagedKafkaAccessConfigurationCredentialsProperty
    ) {
        cdkBuilder.credentials(credentials)
    }

    /** @param maximumBatchingWindowInSeconds The maximum length of a time to wait for events. */
    public fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
        cdkBuilder.maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds)
    }

    /**
     * @param serverRootCaCertificate The ARN of the Secrets Manager secret used for certification.
     */
    public fun serverRootCaCertificate(serverRootCaCertificate: String) {
        cdkBuilder.serverRootCaCertificate(serverRootCaCertificate)
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

    /**
     * @param vpc This structure specifies the VPC subnets and security groups for the stream, and
     *   whether a public IP address is to be used.
     */
    public fun vpc(vpc: IResolvable) {
        cdkBuilder.vpc(vpc)
    }

    /**
     * @param vpc This structure specifies the VPC subnets and security groups for the stream, and
     *   whether a public IP address is to be used.
     */
    public fun vpc(vpc: CfnPipe.SelfManagedKafkaAccessConfigurationVpcProperty) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): CfnPipe.PipeSourceSelfManagedKafkaParametersProperty {
        if (_additionalBootstrapServers.isNotEmpty())
            cdkBuilder.additionalBootstrapServers(_additionalBootstrapServers)
        return cdkBuilder.build()
    }
}
