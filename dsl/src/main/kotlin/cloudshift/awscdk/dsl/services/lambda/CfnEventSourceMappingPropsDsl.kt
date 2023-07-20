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

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping
import software.amazon.awscdk.services.lambda.CfnEventSourceMappingProps
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnEventSourceMappingPropsDsl {
    private val cdkBuilder: CfnEventSourceMappingProps.Builder = CfnEventSourceMappingProps.builder()

    private val _functionResponseTypes: MutableList<String> = mutableListOf()

    private val _queues: MutableList<String> = mutableListOf()

    private val _sourceAccessConfigurations: MutableList<Any> = mutableListOf()

    private val _topics: MutableList<String> = mutableListOf()

    public fun amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig: IResolvable) {
        cdkBuilder.amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig)
    }

    public fun amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig: CfnEventSourceMapping.AmazonManagedKafkaEventSourceConfigProperty) {
        cdkBuilder.amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig)
    }

    public fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
    }

    public fun bisectBatchOnFunctionError(bisectBatchOnFunctionError: Boolean) {
        cdkBuilder.bisectBatchOnFunctionError(bisectBatchOnFunctionError)
    }

    public fun bisectBatchOnFunctionError(bisectBatchOnFunctionError: IResolvable) {
        cdkBuilder.bisectBatchOnFunctionError(bisectBatchOnFunctionError)
    }

    public fun destinationConfig(destinationConfig: IResolvable) {
        cdkBuilder.destinationConfig(destinationConfig)
    }

    public fun destinationConfig(destinationConfig: CfnEventSourceMapping.DestinationConfigProperty) {
        cdkBuilder.destinationConfig(destinationConfig)
    }

    public fun documentDbEventSourceConfig(documentDbEventSourceConfig: IResolvable) {
        cdkBuilder.documentDbEventSourceConfig(documentDbEventSourceConfig)
    }

    public fun documentDbEventSourceConfig(documentDbEventSourceConfig: CfnEventSourceMapping.DocumentDBEventSourceConfigProperty) {
        cdkBuilder.documentDbEventSourceConfig(documentDbEventSourceConfig)
    }

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun eventSourceArn(eventSourceArn: String) {
        cdkBuilder.eventSourceArn(eventSourceArn)
    }

    public fun filterCriteria(filterCriteria: IResolvable) {
        cdkBuilder.filterCriteria(filterCriteria)
    }

    public fun filterCriteria(filterCriteria: CfnEventSourceMapping.FilterCriteriaProperty) {
        cdkBuilder.filterCriteria(filterCriteria)
    }

    public fun functionName(functionName: String) {
        cdkBuilder.functionName(functionName)
    }

    public fun functionResponseTypes(vararg functionResponseTypes: String) {
        _functionResponseTypes.addAll(listOf(*functionResponseTypes))
    }

    public fun functionResponseTypes(functionResponseTypes: Collection<String>) {
        _functionResponseTypes.addAll(functionResponseTypes)
    }

    public fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
        cdkBuilder.maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds)
    }

    public fun maximumRecordAgeInSeconds(maximumRecordAgeInSeconds: Number) {
        cdkBuilder.maximumRecordAgeInSeconds(maximumRecordAgeInSeconds)
    }

    public fun maximumRetryAttempts(maximumRetryAttempts: Number) {
        cdkBuilder.maximumRetryAttempts(maximumRetryAttempts)
    }

    public fun parallelizationFactor(parallelizationFactor: Number) {
        cdkBuilder.parallelizationFactor(parallelizationFactor)
    }

    public fun queues(vararg queues: String) {
        _queues.addAll(listOf(*queues))
    }

    public fun queues(queues: Collection<String>) {
        _queues.addAll(queues)
    }

    public fun scalingConfig(scalingConfig: IResolvable) {
        cdkBuilder.scalingConfig(scalingConfig)
    }

    public fun scalingConfig(scalingConfig: CfnEventSourceMapping.ScalingConfigProperty) {
        cdkBuilder.scalingConfig(scalingConfig)
    }

    public fun selfManagedEventSource(selfManagedEventSource: IResolvable) {
        cdkBuilder.selfManagedEventSource(selfManagedEventSource)
    }

    public fun selfManagedEventSource(selfManagedEventSource: CfnEventSourceMapping.SelfManagedEventSourceProperty) {
        cdkBuilder.selfManagedEventSource(selfManagedEventSource)
    }

    public fun selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig: IResolvable) {
        cdkBuilder.selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig)
    }

    public fun selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig: CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty) {
        cdkBuilder.selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig)
    }

    public fun sourceAccessConfigurations(vararg sourceAccessConfigurations: Any) {
        _sourceAccessConfigurations.addAll(listOf(*sourceAccessConfigurations))
    }

    public fun sourceAccessConfigurations(sourceAccessConfigurations: Collection<Any>) {
        _sourceAccessConfigurations.addAll(sourceAccessConfigurations)
    }

    public fun sourceAccessConfigurations(sourceAccessConfigurations: IResolvable) {
        cdkBuilder.sourceAccessConfigurations(sourceAccessConfigurations)
    }

    public fun startingPosition(startingPosition: String) {
        cdkBuilder.startingPosition(startingPosition)
    }

    public fun startingPositionTimestamp(startingPositionTimestamp: Number) {
        cdkBuilder.startingPositionTimestamp(startingPositionTimestamp)
    }

    public fun topics(vararg topics: String) {
        _topics.addAll(listOf(*topics))
    }

    public fun topics(topics: Collection<String>) {
        _topics.addAll(topics)
    }

    public fun tumblingWindowInSeconds(tumblingWindowInSeconds: Number) {
        cdkBuilder.tumblingWindowInSeconds(tumblingWindowInSeconds)
    }

    public fun build(): CfnEventSourceMappingProps {
        if (_functionResponseTypes.isNotEmpty()) cdkBuilder.functionResponseTypes(_functionResponseTypes)
        if (_queues.isNotEmpty()) cdkBuilder.queues(_queues)
        if (_sourceAccessConfigurations.isNotEmpty()) {
            cdkBuilder.sourceAccessConfigurations(_sourceAccessConfigurations)
        }
        if (_topics.isNotEmpty()) cdkBuilder.topics(_topics)
        return cdkBuilder.build()
    }
}
