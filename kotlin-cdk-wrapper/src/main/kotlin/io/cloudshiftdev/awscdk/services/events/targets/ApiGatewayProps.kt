@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.events.RuleTargetInput
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface ApiGatewayProps : TargetBaseProps {
  public fun eventRole(): IRole? = unwrap(this).getEventRole()?.let(IRole::wrap)

  public fun headerParameters(): Map<String, String> = unwrap(this).getHeaderParameters() ?:
      emptyMap()

  public fun method(): String? = unwrap(this).getMethod()

  public fun path(): String? = unwrap(this).getPath()

  public fun pathParameterValues(): List<String> = unwrap(this).getPathParameterValues() ?:
      emptyList()

  public fun postBody(): RuleTargetInput? = unwrap(this).getPostBody()?.let(RuleTargetInput::wrap)

  public fun queryStringParameters(): Map<String, String> = unwrap(this).getQueryStringParameters()
      ?: emptyMap()

  public fun stage(): String? = unwrap(this).getStage()

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

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.targets.ApiGatewayProps.Builder =
        software.amazon.awscdk.services.events.targets.ApiGatewayProps.builder()

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

    public fun build(): software.amazon.awscdk.services.events.targets.ApiGatewayProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.events.targets.ApiGatewayProps,
  ) : CdkObject(cdkObject), ApiGatewayProps {
    override fun deadLetterQueue(): IQueue? = unwrap(this).getDeadLetterQueue()?.let(IQueue::wrap)

    override fun eventRole(): IRole? = unwrap(this).getEventRole()?.let(IRole::wrap)

    override fun headerParameters(): Map<String, String> = unwrap(this).getHeaderParameters() ?:
        emptyMap()

    override fun maxEventAge(): Duration? = unwrap(this).getMaxEventAge()?.let(Duration::wrap)

    override fun method(): String? = unwrap(this).getMethod()

    override fun path(): String? = unwrap(this).getPath()

    override fun pathParameterValues(): List<String> = unwrap(this).getPathParameterValues() ?:
        emptyList()

    override fun postBody(): RuleTargetInput? =
        unwrap(this).getPostBody()?.let(RuleTargetInput::wrap)

    override fun queryStringParameters(): Map<String, String> =
        unwrap(this).getQueryStringParameters() ?: emptyMap()

    override fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()

    override fun stage(): String? = unwrap(this).getStage()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ApiGatewayProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.ApiGatewayProps):
        ApiGatewayProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApiGatewayProps):
        software.amazon.awscdk.services.events.targets.ApiGatewayProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.events.targets.ApiGatewayProps
  }
}
