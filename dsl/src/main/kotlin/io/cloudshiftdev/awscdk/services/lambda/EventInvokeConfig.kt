package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class EventInvokeConfig internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lambda.EventInvokeConfig,
) : Resource(cdkObject) {
  public interface Builder {
    public fun function(function: IFunction) {
    }

    public fun maxEventAge(maxEventAge: Duration) {
    }

    public fun onFailure(onFailure: IDestination) {
    }

    public fun onSuccess(onSuccess: IDestination) {
    }

    public fun qualifier(qualifier: String) {
    }

    public fun retryAttempts(retryAttempts: Number) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.EventInvokeConfig.Builder =
        software.amazon.awscdk.services.lambda.EventInvokeConfig.Builder.create(scope, id)

    public override fun function(function: IFunction) {
      cdkBuilder.function(function.let(IFunction::unwrap))
    }

    public override fun maxEventAge(maxEventAge: Duration) {
      cdkBuilder.maxEventAge(maxEventAge.let(Duration::unwrap))
    }

    public override fun onFailure(onFailure: IDestination) {
      cdkBuilder.onFailure(onFailure.let(IDestination::unwrap))
    }

    public override fun onSuccess(onSuccess: IDestination) {
      cdkBuilder.onSuccess(onSuccess.let(IDestination::unwrap))
    }

    public override fun qualifier(qualifier: String) {
      cdkBuilder.qualifier(qualifier)
    }

    public override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    public fun build(): software.amazon.awscdk.services.lambda.EventInvokeConfig =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): EventInvokeConfig {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return EventInvokeConfig(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.EventInvokeConfig):
        EventInvokeConfig = EventInvokeConfig(cdkObject)

    internal fun unwrap(wrapped: EventInvokeConfig):
        software.amazon.awscdk.services.lambda.EventInvokeConfig = wrapped.cdkObject
  }
}
