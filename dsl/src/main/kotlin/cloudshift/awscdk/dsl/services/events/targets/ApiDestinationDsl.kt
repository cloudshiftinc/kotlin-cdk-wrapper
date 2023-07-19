@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events.targets

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.events.IApiDestination
import software.amazon.awscdk.services.events.RuleTargetInput
import software.amazon.awscdk.services.events.targets.ApiDestination
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.sqs.IQueue

@CdkDslMarker
public class ApiDestinationDsl(
  apiDestination: IApiDestination,
) {
  private val cdkBuilder: ApiDestination.Builder = ApiDestination.Builder.create(apiDestination)

  private val _pathParameterValues: MutableList<String> = mutableListOf()

  public fun deadLetterQueue(deadLetterQueue: IQueue) {
    cdkBuilder.deadLetterQueue(deadLetterQueue)
  }

  public fun event(event: RuleTargetInput) {
    cdkBuilder.event(event)
  }

  public fun eventRole(eventRole: IRole) {
    cdkBuilder.eventRole(eventRole)
  }

  public fun headerParameters(headerParameters: Map<String, String>) {
    cdkBuilder.headerParameters(headerParameters)
  }

  public fun maxEventAge(maxEventAge: Duration) {
    cdkBuilder.maxEventAge(maxEventAge)
  }

  public fun pathParameterValues(vararg pathParameterValues: String) {
    _pathParameterValues.addAll(listOf(*pathParameterValues))
  }

  public fun pathParameterValues(pathParameterValues: Collection<String>) {
    _pathParameterValues.addAll(pathParameterValues)
  }

  public fun queryStringParameters(queryStringParameters: Map<String, String>) {
    cdkBuilder.queryStringParameters(queryStringParameters)
  }

  public fun retryAttempts(retryAttempts: Number) {
    cdkBuilder.retryAttempts(retryAttempts)
  }

  public fun build(): ApiDestination {
    if(_pathParameterValues.isNotEmpty()) cdkBuilder.pathParameterValues(_pathParameterValues)
    return cdkBuilder.build()
  }
}
