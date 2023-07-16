@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.lambda.EventSourceMappingProps
import software.amazon.awscdk.services.lambda.IEventSourceDlq
import software.amazon.awscdk.services.lambda.IFunction
import software.amazon.awscdk.services.lambda.SourceAccessConfiguration
import software.amazon.awscdk.services.lambda.StartingPosition

@CdkDslMarker
public class EventSourceMappingPropsDsl {
  private val cdkBuilder: EventSourceMappingProps.Builder = EventSourceMappingProps.builder()

  private val _filters: MutableList<Map<String, *>> = mutableListOf()

  private val _kafkaBootstrapServers: MutableList<String> = mutableListOf()

  private val _sourceAccessConfigurations: MutableList<SourceAccessConfiguration> = mutableListOf()

  public fun batchSize(batchSize: Number) {
    cdkBuilder.batchSize(batchSize)
  }

  public fun bisectBatchOnError(bisectBatchOnError: Boolean) {
    cdkBuilder.bisectBatchOnError(bisectBatchOnError)
  }

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun eventSourceArn(eventSourceArn: String) {
    cdkBuilder.eventSourceArn(eventSourceArn)
  }

  public fun filters(vararg filters: Map<String, *>) {
    _filters.addAll(listOf(*filters))
  }

  public fun filters(filters: Collection<Map<String, *>>) {
    _filters.addAll(filters)
  }

  public fun kafkaBootstrapServers(vararg kafkaBootstrapServers: String) {
    _kafkaBootstrapServers.addAll(listOf(*kafkaBootstrapServers))
  }

  public fun kafkaBootstrapServers(kafkaBootstrapServers: Collection<String>) {
    _kafkaBootstrapServers.addAll(kafkaBootstrapServers)
  }

  public fun kafkaConsumerGroupId(kafkaConsumerGroupId: String) {
    cdkBuilder.kafkaConsumerGroupId(kafkaConsumerGroupId)
  }

  public fun kafkaTopic(kafkaTopic: String) {
    cdkBuilder.kafkaTopic(kafkaTopic)
  }

  public fun maxBatchingWindow(maxBatchingWindow: Duration) {
    cdkBuilder.maxBatchingWindow(maxBatchingWindow)
  }

  public fun maxConcurrency(maxConcurrency: Number) {
    cdkBuilder.maxConcurrency(maxConcurrency)
  }

  public fun maxRecordAge(maxRecordAge: Duration) {
    cdkBuilder.maxRecordAge(maxRecordAge)
  }

  public fun onFailure(onFailure: IEventSourceDlq) {
    cdkBuilder.onFailure(onFailure)
  }

  public fun parallelizationFactor(parallelizationFactor: Number) {
    cdkBuilder.parallelizationFactor(parallelizationFactor)
  }

  public fun reportBatchItemFailures(reportBatchItemFailures: Boolean) {
    cdkBuilder.reportBatchItemFailures(reportBatchItemFailures)
  }

  public fun retryAttempts(retryAttempts: Number) {
    cdkBuilder.retryAttempts(retryAttempts)
  }

  public
      fun sourceAccessConfigurations(sourceAccessConfigurations: SourceAccessConfigurationDsl.() -> Unit) {
    _sourceAccessConfigurations.add(SourceAccessConfigurationDsl().apply(sourceAccessConfigurations).build())
  }

  public
      fun sourceAccessConfigurations(sourceAccessConfigurations: Collection<SourceAccessConfiguration>) {
    _sourceAccessConfigurations.addAll(sourceAccessConfigurations)
  }

  public fun startingPosition(startingPosition: StartingPosition) {
    cdkBuilder.startingPosition(startingPosition)
  }

  public fun startingPositionTimestamp(startingPositionTimestamp: Number) {
    cdkBuilder.startingPositionTimestamp(startingPositionTimestamp)
  }

  public fun target(target: IFunction) {
    cdkBuilder.target(target)
  }

  public fun tumblingWindow(tumblingWindow: Duration) {
    cdkBuilder.tumblingWindow(tumblingWindow)
  }

  public fun build(): EventSourceMappingProps {
    if(_filters.isNotEmpty()) cdkBuilder.filters(_filters)
    if(_kafkaBootstrapServers.isNotEmpty()) cdkBuilder.kafkaBootstrapServers(_kafkaBootstrapServers)
    if(_sourceAccessConfigurations.isNotEmpty())
        cdkBuilder.sourceAccessConfigurations(_sourceAccessConfigurations)
    return cdkBuilder.build()
  }
}
