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

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pipes.CfnPipe
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnPipePipeSourceSelfManagedKafkaParametersPropertyDsl {
    private val cdkBuilder: CfnPipe.PipeSourceSelfManagedKafkaParametersProperty.Builder =
        CfnPipe.PipeSourceSelfManagedKafkaParametersProperty.builder()

    private val _additionalBootstrapServers: MutableList<String> = mutableListOf()

    public fun additionalBootstrapServers(vararg additionalBootstrapServers: String) {
        _additionalBootstrapServers.addAll(listOf(*additionalBootstrapServers))
    }

    public fun additionalBootstrapServers(additionalBootstrapServers: Collection<String>) {
        _additionalBootstrapServers.addAll(additionalBootstrapServers)
    }

    public fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
    }

    public fun consumerGroupId(consumerGroupId: String) {
        cdkBuilder.consumerGroupId(consumerGroupId)
    }

    public fun credentials(credentials: IResolvable) {
        cdkBuilder.credentials(credentials)
    }

    public fun credentials(credentials: CfnPipe.SelfManagedKafkaAccessConfigurationCredentialsProperty) {
        cdkBuilder.credentials(credentials)
    }

    public fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
        cdkBuilder.maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds)
    }

    public fun serverRootCaCertificate(serverRootCaCertificate: String) {
        cdkBuilder.serverRootCaCertificate(serverRootCaCertificate)
    }

    public fun startingPosition(startingPosition: String) {
        cdkBuilder.startingPosition(startingPosition)
    }

    public fun topicName(topicName: String) {
        cdkBuilder.topicName(topicName)
    }

    public fun vpc(vpc: IResolvable) {
        cdkBuilder.vpc(vpc)
    }

    public fun vpc(vpc: CfnPipe.SelfManagedKafkaAccessConfigurationVpcProperty) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): CfnPipe.PipeSourceSelfManagedKafkaParametersProperty {
        if (_additionalBootstrapServers.isNotEmpty()) {
            cdkBuilder.additionalBootstrapServers(_additionalBootstrapServers)
        }
        return cdkBuilder.build()
    }
}
