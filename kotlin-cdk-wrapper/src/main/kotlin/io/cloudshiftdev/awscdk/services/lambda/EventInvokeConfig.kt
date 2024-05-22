@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Configure options for asynchronous invocation on a version or an alias.
 *
 * By default, Lambda retries an asynchronous invocation twice if the function
 * returns an error. It retains events in a queue for up to six hours. When an
 * event fails all processing attempts or stays in the asynchronous invocation
 * queue for too long, Lambda discards it.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * IDestination destination;
 * Function function_;
 * EventInvokeConfig eventInvokeConfig = EventInvokeConfig.Builder.create(this,
 * "MyEventInvokeConfig")
 * .function(function_)
 * // the properties below are optional
 * .maxEventAge(Duration.minutes(30))
 * .onFailure(destination)
 * .onSuccess(destination)
 * .qualifier("qualifier")
 * .retryAttempts(123)
 * .build();
 * ```
 */
public open class EventInvokeConfig(
  cdkObject: software.amazon.awscdk.services.lambda.EventInvokeConfig,
) : Resource(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: EventInvokeConfigProps,
  ) :
      this(software.amazon.awscdk.services.lambda.EventInvokeConfig(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(EventInvokeConfigProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: EventInvokeConfigProps.Builder.() -> Unit,
  ) : this(scope, id, EventInvokeConfigProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lambda.EventInvokeConfig].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Lambda function.
     *
     * @param function The Lambda function. 
     */
    public fun function(function: IFunction)

    /**
     * The maximum age of a request that Lambda sends to a function for processing.
     *
     * Minimum: 60 seconds
     * Maximum: 6 hours
     *
     * Default: Duration.hours(6)
     *
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     * processing. 
     */
    public fun maxEventAge(maxEventAge: Duration)

    /**
     * The destination for failed invocations.
     *
     * Default: - no destination
     *
     * @param onFailure The destination for failed invocations. 
     */
    public fun onFailure(onFailure: IDestination)

    /**
     * The destination for successful invocations.
     *
     * Default: - no destination
     *
     * @param onSuccess The destination for successful invocations. 
     */
    public fun onSuccess(onSuccess: IDestination)

    /**
     * The qualifier.
     *
     * Default: - latest version
     *
     * @param qualifier The qualifier. 
     */
    public fun qualifier(qualifier: String)

    /**
     * The maximum number of times to retry when the function returns an error.
     *
     * Minimum: 0
     * Maximum: 2
     *
     * Default: 2
     *
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * 
     */
    public fun retryAttempts(retryAttempts: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.EventInvokeConfig.Builder =
        software.amazon.awscdk.services.lambda.EventInvokeConfig.Builder.create(scope, id)

    /**
     * The Lambda function.
     *
     * @param function The Lambda function. 
     */
    override fun function(function: IFunction) {
      cdkBuilder.function(function.let(IFunction.Companion::unwrap))
    }

    /**
     * The maximum age of a request that Lambda sends to a function for processing.
     *
     * Minimum: 60 seconds
     * Maximum: 6 hours
     *
     * Default: Duration.hours(6)
     *
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     * processing. 
     */
    override fun maxEventAge(maxEventAge: Duration) {
      cdkBuilder.maxEventAge(maxEventAge.let(Duration.Companion::unwrap))
    }

    /**
     * The destination for failed invocations.
     *
     * Default: - no destination
     *
     * @param onFailure The destination for failed invocations. 
     */
    override fun onFailure(onFailure: IDestination) {
      cdkBuilder.onFailure(onFailure.let(IDestination.Companion::unwrap))
    }

    /**
     * The destination for successful invocations.
     *
     * Default: - no destination
     *
     * @param onSuccess The destination for successful invocations. 
     */
    override fun onSuccess(onSuccess: IDestination) {
      cdkBuilder.onSuccess(onSuccess.let(IDestination.Companion::unwrap))
    }

    /**
     * The qualifier.
     *
     * Default: - latest version
     *
     * @param qualifier The qualifier. 
     */
    override fun qualifier(qualifier: String) {
      cdkBuilder.qualifier(qualifier)
    }

    /**
     * The maximum number of times to retry when the function returns an error.
     *
     * Minimum: 0
     * Maximum: 2
     *
     * Default: 2
     *
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * 
     */
    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    public fun build(): software.amazon.awscdk.services.lambda.EventInvokeConfig =
        cdkBuilder.build()
  }

  public companion object {
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
        software.amazon.awscdk.services.lambda.EventInvokeConfig = wrapped.cdkObject as
        software.amazon.awscdk.services.lambda.EventInvokeConfig
  }
}
