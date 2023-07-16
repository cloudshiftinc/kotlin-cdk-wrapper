@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import cloudshift.awscdk.dsl.services.stepfunctions.CredentialsDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.iam.PolicyStatement
import software.amazon.awscdk.services.stepfunctions.Credentials
import software.amazon.awscdk.services.stepfunctions.IntegrationPattern
import software.amazon.awscdk.services.stepfunctions.Timeout
import software.amazon.awscdk.services.stepfunctions.tasks.CallAwsServiceProps

@CdkDslMarker
public class CallAwsServicePropsDsl {
  private val cdkBuilder: CallAwsServiceProps.Builder = CallAwsServiceProps.builder()

  private val _additionalIamStatements: MutableList<PolicyStatement> = mutableListOf()

  private val _iamResources: MutableList<String> = mutableListOf()

  public fun action(action: String) {
    cdkBuilder.action(action)
  }

  public fun additionalIamStatements(additionalIamStatements: PolicyStatementDsl.() -> Unit) {
    _additionalIamStatements.add(PolicyStatementDsl().apply(additionalIamStatements).build())
  }

  public fun additionalIamStatements(additionalIamStatements: Collection<PolicyStatement>) {
    _additionalIamStatements.addAll(additionalIamStatements)
  }

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

  public fun heartbeat(heartbeat: Duration) {
    cdkBuilder.heartbeat(heartbeat)
  }

  public fun heartbeatTimeout(heartbeatTimeout: Timeout) {
    cdkBuilder.heartbeatTimeout(heartbeatTimeout)
  }

  public fun iamAction(iamAction: String) {
    cdkBuilder.iamAction(iamAction)
  }

  public fun iamResources(vararg iamResources: String) {
    _iamResources.addAll(listOf(*iamResources))
  }

  public fun iamResources(iamResources: Collection<String>) {
    _iamResources.addAll(iamResources)
  }

  public fun inputPath(inputPath: String) {
    cdkBuilder.inputPath(inputPath)
  }

  public fun integrationPattern(integrationPattern: IntegrationPattern) {
    cdkBuilder.integrationPattern(integrationPattern)
  }

  public fun outputPath(outputPath: String) {
    cdkBuilder.outputPath(outputPath)
  }

  public fun parameters(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.parameters(builder.map)
  }

  public fun parameters(parameters: Map<String, *>) {
    cdkBuilder.parameters(parameters)
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

  public fun service(service: String) {
    cdkBuilder.service(service)
  }

  public fun taskTimeout(taskTimeout: Timeout) {
    cdkBuilder.taskTimeout(taskTimeout)
  }

  public fun timeout(timeout: Duration) {
    cdkBuilder.timeout(timeout)
  }

  public fun build(): CallAwsServiceProps {
    if(_additionalIamStatements.isNotEmpty())
        cdkBuilder.additionalIamStatements(_additionalIamStatements)
    if(_iamResources.isNotEmpty()) cdkBuilder.iamResources(_iamResources)
    return cdkBuilder.build()
  }
}
