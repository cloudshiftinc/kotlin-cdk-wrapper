package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class SubscriptionFilter internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.logs.SubscriptionFilter,
) : Resource(cdkObject) {
  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.logs.SubscriptionFilter].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The destination to send the filtered events to.
     *
     * For example, a Kinesis stream or a Lambda function.
     *
     * @param destination The destination to send the filtered events to. 
     */
    public fun destination(destination: ILogSubscriptionDestination)

    /**
     * The name of the subscription filter.
     *
     * Default: Automatically generated
     *
     * @param filterName The name of the subscription filter. 
     */
    public fun filterName(filterName: String)

    /**
     * Log events matching this pattern will be sent to the destination.
     *
     * @param filterPattern Log events matching this pattern will be sent to the destination. 
     */
    public fun filterPattern(filterPattern: IFilterPattern)

    /**
     * The log group to create the subscription on.
     *
     * @param logGroup The log group to create the subscription on. 
     */
    public fun logGroup(logGroup: ILogGroup)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.SubscriptionFilter.Builder =
        software.amazon.awscdk.services.logs.SubscriptionFilter.Builder.create(scope, id)

    /**
     * The destination to send the filtered events to.
     *
     * For example, a Kinesis stream or a Lambda function.
     *
     * @param destination The destination to send the filtered events to. 
     */
    override fun destination(destination: ILogSubscriptionDestination) {
      cdkBuilder.destination(destination.let(ILogSubscriptionDestination::unwrap))
    }

    /**
     * The name of the subscription filter.
     *
     * Default: Automatically generated
     *
     * @param filterName The name of the subscription filter. 
     */
    override fun filterName(filterName: String) {
      cdkBuilder.filterName(filterName)
    }

    /**
     * Log events matching this pattern will be sent to the destination.
     *
     * @param filterPattern Log events matching this pattern will be sent to the destination. 
     */
    override fun filterPattern(filterPattern: IFilterPattern) {
      cdkBuilder.filterPattern(filterPattern.let(IFilterPattern::unwrap))
    }

    /**
     * The log group to create the subscription on.
     *
     * @param logGroup The log group to create the subscription on. 
     */
    override fun logGroup(logGroup: ILogGroup) {
      cdkBuilder.logGroup(logGroup.let(ILogGroup::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.logs.SubscriptionFilter = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): SubscriptionFilter {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return SubscriptionFilter(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.SubscriptionFilter):
        SubscriptionFilter = SubscriptionFilter(cdkObject)

    internal fun unwrap(wrapped: SubscriptionFilter):
        software.amazon.awscdk.services.logs.SubscriptionFilter = wrapped.cdkObject
  }
}
