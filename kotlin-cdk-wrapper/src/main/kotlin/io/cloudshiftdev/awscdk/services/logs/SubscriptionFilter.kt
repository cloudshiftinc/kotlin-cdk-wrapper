@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A new Subscription on a CloudWatch log group.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.logs.destinations.*;
 * Function fn;
 * LogGroup logGroup;
 * SubscriptionFilter.Builder.create(this, "Subscription")
 * .logGroup(logGroup)
 * .destination(new LambdaDestination(fn))
 * .filterPattern(FilterPattern.allTerms("ERROR", "MainThread"))
 * .filterName("ErrorInMainThread")
 * .build();
 * ```
 */
public open class SubscriptionFilter(
  cdkObject: software.amazon.awscdk.services.logs.SubscriptionFilter,
) : Resource(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: SubscriptionFilterProps,
  ) :
      this(software.amazon.awscdk.services.logs.SubscriptionFilter(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(SubscriptionFilterProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: SubscriptionFilterProps.Builder.() -> Unit,
  ) : this(scope, id, SubscriptionFilterProps(props)
  )

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
     * The method used to distribute log data to the destination.
     *
     * This property can only be used with KinesisDestination.
     *
     * Default: Distribution.BY_LOG_STREAM
     *
     * @param distribution The method used to distribute log data to the destination. 
     */
    public fun distribution(distribution: Distribution)

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
      cdkBuilder.destination(destination.let(ILogSubscriptionDestination.Companion::unwrap))
    }

    /**
     * The method used to distribute log data to the destination.
     *
     * This property can only be used with KinesisDestination.
     *
     * Default: Distribution.BY_LOG_STREAM
     *
     * @param distribution The method used to distribute log data to the destination. 
     */
    override fun distribution(distribution: Distribution) {
      cdkBuilder.distribution(distribution.let(Distribution.Companion::unwrap))
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
      cdkBuilder.filterPattern(filterPattern.let(IFilterPattern.Companion::unwrap))
    }

    /**
     * The log group to create the subscription on.
     *
     * @param logGroup The log group to create the subscription on. 
     */
    override fun logGroup(logGroup: ILogGroup) {
      cdkBuilder.logGroup(logGroup.let(ILogGroup.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.logs.SubscriptionFilter = cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.logs.SubscriptionFilter.PROPERTY_INJECTION_ID

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
        software.amazon.awscdk.services.logs.SubscriptionFilter = wrapped.cdkObject as
        software.amazon.awscdk.services.logs.SubscriptionFilter
  }
}
