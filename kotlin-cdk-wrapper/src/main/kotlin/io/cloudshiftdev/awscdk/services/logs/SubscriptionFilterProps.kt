@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for a SubscriptionFilter.
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
public interface SubscriptionFilterProps : SubscriptionFilterOptions {
  /**
   * The log group to create the subscription on.
   */
  public fun logGroup(): ILogGroup

  /**
   * A builder for [SubscriptionFilterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param destination The destination to send the filtered events to. 
     * For example, a Kinesis stream or a Lambda function.
     */
    public fun destination(destination: ILogSubscriptionDestination)

    /**
     * @param distribution The method used to distribute log data to the destination.
     * This property can only be used with KinesisDestination.
     */
    public fun distribution(distribution: Distribution)

    /**
     * @param filterName The name of the subscription filter.
     */
    public fun filterName(filterName: String)

    /**
     * @param filterPattern Log events matching this pattern will be sent to the destination. 
     */
    public fun filterPattern(filterPattern: IFilterPattern)

    /**
     * @param logGroup The log group to create the subscription on. 
     */
    public fun logGroup(logGroup: ILogGroup)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.SubscriptionFilterProps.Builder =
        software.amazon.awscdk.services.logs.SubscriptionFilterProps.builder()

    /**
     * @param destination The destination to send the filtered events to. 
     * For example, a Kinesis stream or a Lambda function.
     */
    override fun destination(destination: ILogSubscriptionDestination) {
      cdkBuilder.destination(destination.let(ILogSubscriptionDestination.Companion::unwrap))
    }

    /**
     * @param distribution The method used to distribute log data to the destination.
     * This property can only be used with KinesisDestination.
     */
    override fun distribution(distribution: Distribution) {
      cdkBuilder.distribution(distribution.let(Distribution.Companion::unwrap))
    }

    /**
     * @param filterName The name of the subscription filter.
     */
    override fun filterName(filterName: String) {
      cdkBuilder.filterName(filterName)
    }

    /**
     * @param filterPattern Log events matching this pattern will be sent to the destination. 
     */
    override fun filterPattern(filterPattern: IFilterPattern) {
      cdkBuilder.filterPattern(filterPattern.let(IFilterPattern.Companion::unwrap))
    }

    /**
     * @param logGroup The log group to create the subscription on. 
     */
    override fun logGroup(logGroup: ILogGroup) {
      cdkBuilder.logGroup(logGroup.let(ILogGroup.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.logs.SubscriptionFilterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.SubscriptionFilterProps,
  ) : CdkObject(cdkObject),
      SubscriptionFilterProps {
    /**
     * The destination to send the filtered events to.
     *
     * For example, a Kinesis stream or a Lambda function.
     */
    override fun destination(): ILogSubscriptionDestination =
        unwrap(this).getDestination().let(ILogSubscriptionDestination::wrap)

    /**
     * The method used to distribute log data to the destination.
     *
     * This property can only be used with KinesisDestination.
     *
     * Default: Distribution.BY_LOG_STREAM
     */
    override fun distribution(): Distribution? =
        unwrap(this).getDistribution()?.let(Distribution::wrap)

    /**
     * The name of the subscription filter.
     *
     * Default: Automatically generated
     */
    override fun filterName(): String? = unwrap(this).getFilterName()

    /**
     * Log events matching this pattern will be sent to the destination.
     */
    override fun filterPattern(): IFilterPattern =
        unwrap(this).getFilterPattern().let(IFilterPattern::wrap)

    /**
     * The log group to create the subscription on.
     */
    override fun logGroup(): ILogGroup = unwrap(this).getLogGroup().let(ILogGroup::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SubscriptionFilterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.SubscriptionFilterProps):
        SubscriptionFilterProps = CdkObjectWrappers.wrap(cdkObject) as? SubscriptionFilterProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: SubscriptionFilterProps):
        software.amazon.awscdk.services.logs.SubscriptionFilterProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.logs.SubscriptionFilterProps
  }
}
