@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.events.IRule
import io.cloudshiftdev.awscdk.services.events.IRuleTarget
import io.cloudshiftdev.awscdk.services.events.RuleTargetConfig
import io.cloudshiftdev.awscdk.services.events.RuleTargetInput
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.awscdk.services.apigateway.RestApi as CloudshiftdevAwscdkServicesApigatewayRestApi
import software.amazon.awscdk.services.apigateway.RestApi as AmazonAwscdkServicesApigatewayRestApi

public open class ApiGateway internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.events.targets.ApiGateway,
) : CdkObject(cdkObject), IRuleTarget {
  public override fun bind(rule: IRule): RuleTargetConfig =
      unwrap(this).bind(rule.let(IRule::unwrap)).let(RuleTargetConfig::wrap)

  public override fun bind(rule: IRule, _id: String): RuleTargetConfig =
      unwrap(this).bind(rule.let(IRule::unwrap), _id).let(RuleTargetConfig::wrap)

  public open fun restApi(): CloudshiftdevAwscdkServicesApigatewayRestApi =
      unwrap(this).getRestApi().let(CloudshiftdevAwscdkServicesApigatewayRestApi::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun deadLetterQueue(deadLetterQueue: IQueue)

    public fun eventRole(eventRole: IRole)

    public fun headerParameters(headerParameters: Map<String, String>)

    public fun maxEventAge(maxEventAge: Duration)

    public fun method(method: String)

    public fun path(path: String)

    public fun pathParameterValues(pathParameterValues: List<String>)

    public fun pathParameterValues(vararg pathParameterValues: String)

    public fun postBody(postBody: RuleTargetInput)

    public fun queryStringParameters(queryStringParameters: Map<String, String>)

    public fun retryAttempts(retryAttempts: Number)

    public fun stage(stage: String)
  }

  private class BuilderImpl(
    restApi: AmazonAwscdkServicesApigatewayRestApi,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.targets.ApiGateway.Builder =
        software.amazon.awscdk.services.events.targets.ApiGateway.Builder.create(restApi)

    override fun deadLetterQueue(deadLetterQueue: IQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue::unwrap))
    }

    override fun eventRole(eventRole: IRole) {
      cdkBuilder.eventRole(eventRole.let(IRole::unwrap))
    }

    override fun headerParameters(headerParameters: Map<String, String>) {
      cdkBuilder.headerParameters(headerParameters)
    }

    override fun maxEventAge(maxEventAge: Duration) {
      cdkBuilder.maxEventAge(maxEventAge.let(Duration::unwrap))
    }

    override fun method(method: String) {
      cdkBuilder.method(method)
    }

    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    override fun pathParameterValues(pathParameterValues: List<String>) {
      cdkBuilder.pathParameterValues(pathParameterValues)
    }

    override fun pathParameterValues(vararg pathParameterValues: String): Unit =
        pathParameterValues(pathParameterValues.toList())

    override fun postBody(postBody: RuleTargetInput) {
      cdkBuilder.postBody(postBody.let(RuleTargetInput::unwrap))
    }

    override fun queryStringParameters(queryStringParameters: Map<String, String>) {
      cdkBuilder.queryStringParameters(queryStringParameters)
    }

    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    override fun stage(stage: String) {
      cdkBuilder.stage(stage)
    }

    public fun build(): software.amazon.awscdk.services.events.targets.ApiGateway =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(restApi: CloudshiftdevAwscdkServicesApigatewayRestApi,
        block: Builder.() -> Unit = {}): ApiGateway {
      val builderImpl = BuilderImpl(CloudshiftdevAwscdkServicesApigatewayRestApi.unwrap(restApi))
      return ApiGateway(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.ApiGateway):
        ApiGateway = ApiGateway(cdkObject)

    internal fun unwrap(wrapped: ApiGateway):
        software.amazon.awscdk.services.events.targets.ApiGateway = wrapped.cdkObject
  }
}
