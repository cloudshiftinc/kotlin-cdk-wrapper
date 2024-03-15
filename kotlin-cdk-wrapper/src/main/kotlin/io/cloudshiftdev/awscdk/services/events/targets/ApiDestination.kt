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
import io.cloudshiftdev.awscdk.services.events.IApiDestination as CloudshiftdevAwscdkServicesEventsIApiDestination
import software.amazon.awscdk.services.events.IApiDestination as AmazonAwscdkServicesEventsIApiDestination

public open class ApiDestination internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.events.targets.ApiDestination,
) : CdkObject(cdkObject), IRuleTarget {
  public override fun bind(_rule: IRule): RuleTargetConfig =
      unwrap(this).bind(_rule.let(IRule::unwrap)).let(RuleTargetConfig::wrap)

  public override fun bind(_rule: IRule, _id: String): RuleTargetConfig =
      unwrap(this).bind(_rule.let(IRule::unwrap), _id).let(RuleTargetConfig::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun deadLetterQueue(deadLetterQueue: IQueue)

    public fun event(event: RuleTargetInput)

    public fun eventRole(eventRole: IRole)

    public fun headerParameters(headerParameters: Map<String, String>)

    public fun maxEventAge(maxEventAge: Duration)

    public fun pathParameterValues(pathParameterValues: List<String>)

    public fun pathParameterValues(vararg pathParameterValues: String)

    public fun queryStringParameters(queryStringParameters: Map<String, String>)

    public fun retryAttempts(retryAttempts: Number)
  }

  private class BuilderImpl(
    apiDestination: AmazonAwscdkServicesEventsIApiDestination,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.targets.ApiDestination.Builder =
        software.amazon.awscdk.services.events.targets.ApiDestination.Builder.create(apiDestination)

    override fun deadLetterQueue(deadLetterQueue: IQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue::unwrap))
    }

    override fun event(event: RuleTargetInput) {
      cdkBuilder.event(event.let(RuleTargetInput::unwrap))
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

    override fun pathParameterValues(pathParameterValues: List<String>) {
      cdkBuilder.pathParameterValues(pathParameterValues)
    }

    override fun pathParameterValues(vararg pathParameterValues: String): Unit =
        pathParameterValues(pathParameterValues.toList())

    override fun queryStringParameters(queryStringParameters: Map<String, String>) {
      cdkBuilder.queryStringParameters(queryStringParameters)
    }

    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    public fun build(): software.amazon.awscdk.services.events.targets.ApiDestination =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(apiDestination: CloudshiftdevAwscdkServicesEventsIApiDestination,
        block: Builder.() -> Unit = {}): ApiDestination {
      val builderImpl =
          BuilderImpl(CloudshiftdevAwscdkServicesEventsIApiDestination.unwrap(apiDestination))
      return ApiDestination(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.ApiDestination):
        ApiDestination = ApiDestination(cdkObject)

    internal fun unwrap(wrapped: ApiDestination):
        software.amazon.awscdk.services.events.targets.ApiDestination = wrapped.cdkObject
  }
}
