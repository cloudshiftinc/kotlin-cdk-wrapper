@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.dynamodb.ITable
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBaseProps
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface DynamoUpdateItemProps : TaskStateBaseProps {
  public fun conditionExpression(): String? = unwrap(this).getConditionExpression()

  public fun expressionAttributeNames(): Map<String, String> =
      unwrap(this).getExpressionAttributeNames() ?: emptyMap()

  public fun expressionAttributeValues(): Map<String, DynamoAttributeValue> =
      unwrap(this).getExpressionAttributeValues()?.mapValues{DynamoAttributeValue.wrap(it.value)} ?:
      emptyMap()

  public fun key(): Map<String, DynamoAttributeValue>

  public fun returnConsumedCapacity(): DynamoConsumedCapacity? =
      unwrap(this).getReturnConsumedCapacity()?.let(DynamoConsumedCapacity::wrap)

  public fun returnItemCollectionMetrics(): DynamoItemCollectionMetrics? =
      unwrap(this).getReturnItemCollectionMetrics()?.let(DynamoItemCollectionMetrics::wrap)

  public fun returnValues(): DynamoReturnValues? =
      unwrap(this).getReturnValues()?.let(DynamoReturnValues::wrap)

  public fun table(): ITable

  public fun updateExpression(): String? = unwrap(this).getUpdateExpression()

  @CdkDslMarker
  public interface Builder {
    public fun comment(comment: String)

    public fun conditionExpression(conditionExpression: String)

    public fun credentials(credentials: Credentials)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c7a8e1adc19818c45dac9d04093abf8f30d89e69913b9d918851c30f120a41d5")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    public fun expressionAttributeNames(expressionAttributeNames: Map<String, String>)

    public
        fun expressionAttributeValues(expressionAttributeValues: Map<String, DynamoAttributeValue>)

    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration)

    public fun heartbeatTimeout(heartbeatTimeout: Timeout)

    public fun inputPath(inputPath: String)

    public fun integrationPattern(integrationPattern: IntegrationPattern)

    public fun key(key: Map<String, DynamoAttributeValue>)

    public fun outputPath(outputPath: String)

    public fun resultPath(resultPath: String)

    public fun resultSelector(resultSelector: Map<String, Any>)

    public fun returnConsumedCapacity(returnConsumedCapacity: DynamoConsumedCapacity)

    public fun returnItemCollectionMetrics(returnItemCollectionMetrics: DynamoItemCollectionMetrics)

    public fun returnValues(returnValues: DynamoReturnValues)

    public fun stateName(stateName: String)

    public fun table(table: ITable)

    public fun taskTimeout(taskTimeout: Timeout)

    @Deprecated(message = "deprecated in CDK")
    public fun timeout(timeout: Duration)

    public fun updateExpression(updateExpression: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoUpdateItemProps.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoUpdateItemProps.builder()

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun conditionExpression(conditionExpression: String) {
      cdkBuilder.conditionExpression(conditionExpression)
    }

    override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c7a8e1adc19818c45dac9d04093abf8f30d89e69913b9d918851c30f120a41d5")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    override fun expressionAttributeNames(expressionAttributeNames: Map<String, String>) {
      cdkBuilder.expressionAttributeNames(expressionAttributeNames)
    }

    override
        fun expressionAttributeValues(expressionAttributeValues: Map<String, DynamoAttributeValue>) {
      cdkBuilder.expressionAttributeValues(expressionAttributeValues.mapValues{DynamoAttributeValue.unwrap(it.value)})
    }

    @Deprecated(message = "deprecated in CDK")
    override fun heartbeat(heartbeat: Duration) {
      cdkBuilder.heartbeat(heartbeat.let(Duration::unwrap))
    }

    override fun heartbeatTimeout(heartbeatTimeout: Timeout) {
      cdkBuilder.heartbeatTimeout(heartbeatTimeout.let(Timeout::unwrap))
    }

    override fun inputPath(inputPath: String) {
      cdkBuilder.inputPath(inputPath)
    }

    override fun integrationPattern(integrationPattern: IntegrationPattern) {
      cdkBuilder.integrationPattern(integrationPattern.let(IntegrationPattern::unwrap))
    }

    override fun key(key: Map<String, DynamoAttributeValue>) {
      cdkBuilder.key(key.mapValues{DynamoAttributeValue.unwrap(it.value)})
    }

    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

    override fun resultPath(resultPath: String) {
      cdkBuilder.resultPath(resultPath)
    }

    override fun resultSelector(resultSelector: Map<String, Any>) {
      cdkBuilder.resultSelector(resultSelector)
    }

    override fun returnConsumedCapacity(returnConsumedCapacity: DynamoConsumedCapacity) {
      cdkBuilder.returnConsumedCapacity(returnConsumedCapacity.let(DynamoConsumedCapacity::unwrap))
    }

    override
        fun returnItemCollectionMetrics(returnItemCollectionMetrics: DynamoItemCollectionMetrics) {
      cdkBuilder.returnItemCollectionMetrics(returnItemCollectionMetrics.let(DynamoItemCollectionMetrics::unwrap))
    }

    override fun returnValues(returnValues: DynamoReturnValues) {
      cdkBuilder.returnValues(returnValues.let(DynamoReturnValues::unwrap))
    }

    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    override fun table(table: ITable) {
      cdkBuilder.table(table.let(ITable::unwrap))
    }

    override fun taskTimeout(taskTimeout: Timeout) {
      cdkBuilder.taskTimeout(taskTimeout.let(Timeout::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    override fun updateExpression(updateExpression: String) {
      cdkBuilder.updateExpression(updateExpression)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.DynamoUpdateItemProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoUpdateItemProps,
  ) : CdkObject(cdkObject), DynamoUpdateItemProps {
    override fun comment(): String? = unwrap(this).getComment()

    override fun conditionExpression(): String? = unwrap(this).getConditionExpression()

    override fun credentials(): Credentials? = unwrap(this).getCredentials()?.let(Credentials::wrap)

    override fun expressionAttributeNames(): Map<String, String> =
        unwrap(this).getExpressionAttributeNames() ?: emptyMap()

    override fun expressionAttributeValues(): Map<String, DynamoAttributeValue> =
        unwrap(this).getExpressionAttributeValues()?.mapValues{DynamoAttributeValue.wrap(it.value)}
        ?: emptyMap()

    @Deprecated(message = "deprecated in CDK")
    override fun heartbeat(): Duration? = unwrap(this).getHeartbeat()?.let(Duration::wrap)

    override fun heartbeatTimeout(): Timeout? =
        unwrap(this).getHeartbeatTimeout()?.let(Timeout::wrap)

    override fun inputPath(): String? = unwrap(this).getInputPath()

    override fun integrationPattern(): IntegrationPattern? =
        unwrap(this).getIntegrationPattern()?.let(IntegrationPattern::wrap)

    override fun key(): Map<String, DynamoAttributeValue> =
        unwrap(this).getKey().mapValues{DynamoAttributeValue.wrap(it.value)}

    override fun outputPath(): String? = unwrap(this).getOutputPath()

    override fun resultPath(): String? = unwrap(this).getResultPath()

    override fun resultSelector(): Map<String, Any> = unwrap(this).getResultSelector() ?: emptyMap()

    override fun returnConsumedCapacity(): DynamoConsumedCapacity? =
        unwrap(this).getReturnConsumedCapacity()?.let(DynamoConsumedCapacity::wrap)

    override fun returnItemCollectionMetrics(): DynamoItemCollectionMetrics? =
        unwrap(this).getReturnItemCollectionMetrics()?.let(DynamoItemCollectionMetrics::wrap)

    override fun returnValues(): DynamoReturnValues? =
        unwrap(this).getReturnValues()?.let(DynamoReturnValues::wrap)

    override fun stateName(): String? = unwrap(this).getStateName()

    override fun table(): ITable = unwrap(this).getTable().let(ITable::wrap)

    override fun taskTimeout(): Timeout? = unwrap(this).getTaskTimeout()?.let(Timeout::wrap)

    @Deprecated(message = "deprecated in CDK")
    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    override fun updateExpression(): String? = unwrap(this).getUpdateExpression()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DynamoUpdateItemProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.DynamoUpdateItemProps):
        DynamoUpdateItemProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DynamoUpdateItemProps):
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoUpdateItemProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoUpdateItemProps
  }
}
