@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.services.stepfunctions.CredentialsDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.stepfunctions.Credentials
import software.amazon.awscdk.services.stepfunctions.IntegrationPattern
import software.amazon.awscdk.services.stepfunctions.TaskInput
import software.amazon.awscdk.services.stepfunctions.Timeout
import software.amazon.awscdk.services.stepfunctions.tasks.ProductionVariant
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateEndpointConfigProps

@CdkDslMarker
public class SageMakerCreateEndpointConfigPropsDsl {
  private val cdkBuilder: SageMakerCreateEndpointConfigProps.Builder =
      SageMakerCreateEndpointConfigProps.builder()

  private val _productionVariants: MutableList<ProductionVariant> = mutableListOf()

  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  public fun credentials(block: CredentialsDsl.() -> Unit = {}) {
    val builder = CredentialsDsl()
    builder.apply(block)
    cdkBuilder.credentials(builder.build())
  }

  public fun credentials(credentials: Credentials) {
    cdkBuilder.credentials(credentials)
  }

  public fun endpointConfigName(endpointConfigName: String) {
    cdkBuilder.endpointConfigName(endpointConfigName)
  }

  public fun heartbeat(heartbeat: Duration) {
    cdkBuilder.heartbeat(heartbeat)
  }

  public fun heartbeatTimeout(heartbeatTimeout: Timeout) {
    cdkBuilder.heartbeatTimeout(heartbeatTimeout)
  }

  public fun inputPath(inputPath: String) {
    cdkBuilder.inputPath(inputPath)
  }

  public fun integrationPattern(integrationPattern: IntegrationPattern) {
    cdkBuilder.integrationPattern(integrationPattern)
  }

  public fun kmsKey(kmsKey: IKey) {
    cdkBuilder.kmsKey(kmsKey)
  }

  public fun outputPath(outputPath: String) {
    cdkBuilder.outputPath(outputPath)
  }

  public fun productionVariants(productionVariants: ProductionVariantDsl.() -> Unit) {
    _productionVariants.add(ProductionVariantDsl().apply(productionVariants).build())
  }

  public fun productionVariants(productionVariants: Collection<ProductionVariant>) {
    _productionVariants.addAll(productionVariants)
  }

  public fun resultPath(resultPath: String) {
    cdkBuilder.resultPath(resultPath)
  }

  public fun resultSelector(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.resultSelector(builder.map)
  }

  public fun resultSelector(resultSelector: Map<String, *>) {
    cdkBuilder.resultSelector(resultSelector)
  }

  public fun tags(tags: TaskInput) {
    cdkBuilder.tags(tags)
  }

  public fun taskTimeout(taskTimeout: Timeout) {
    cdkBuilder.taskTimeout(taskTimeout)
  }

  public fun timeout(timeout: Duration) {
    cdkBuilder.timeout(timeout)
  }

  public fun build(): SageMakerCreateEndpointConfigProps {
    if(_productionVariants.isNotEmpty()) cdkBuilder.productionVariants(_productionVariants)
    return cdkBuilder.build()
  }
}
