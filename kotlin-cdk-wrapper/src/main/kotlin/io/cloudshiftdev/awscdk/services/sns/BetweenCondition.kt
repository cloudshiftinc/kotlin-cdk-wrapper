@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit

/**
 * Between condition for a numeric attribute.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * Function fn;
 * Topic myTopic = new Topic(this, "MyTopic");
 * // Lambda should receive only message matching the following conditions on attributes:
 * // color: 'red' or 'orange' or begins with 'bl'
 * // size: anything but 'small' or 'medium'
 * // price: between 100 and 200 or greater than 300
 * // store: attribute must be present
 * myTopic.addSubscription(LambdaSubscription.Builder.create(fn)
 * .filterPolicy(Map.of(
 * "color", SubscriptionFilter.stringFilter(StringConditions.builder()
 * .allowlist(List.of("red", "orange"))
 * .matchPrefixes(List.of("bl"))
 * .matchSuffixes(List.of("ue"))
 * .build()),
 * "size", SubscriptionFilter.stringFilter(StringConditions.builder()
 * .denylist(List.of("small", "medium"))
 * .build()),
 * "price", SubscriptionFilter.numericFilter(NumericConditions.builder()
 * .between(BetweenCondition.builder().start(100).stop(200).build())
 * .greaterThan(300)
 * .build()),
 * "store", SubscriptionFilter.existsFilter()))
 * .build());
 * ```
 */
public interface BetweenCondition {
  /**
   * The start value.
   */
  public fun start(): Number

  /**
   * The stop value.
   */
  public fun stop(): Number

  /**
   * A builder for [BetweenCondition]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param start The start value. 
     */
    public fun start(start: Number)

    /**
     * @param stop The stop value. 
     */
    public fun stop(stop: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sns.BetweenCondition.Builder =
        software.amazon.awscdk.services.sns.BetweenCondition.builder()

    /**
     * @param start The start value. 
     */
    override fun start(start: Number) {
      cdkBuilder.start(start)
    }

    /**
     * @param stop The stop value. 
     */
    override fun stop(stop: Number) {
      cdkBuilder.stop(stop)
    }

    public fun build(): software.amazon.awscdk.services.sns.BetweenCondition = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.sns.BetweenCondition,
  ) : CdkObject(cdkObject), BetweenCondition {
    /**
     * The start value.
     */
    override fun start(): Number = unwrap(this).getStart()

    /**
     * The stop value.
     */
    override fun stop(): Number = unwrap(this).getStop()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BetweenCondition {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.BetweenCondition):
        BetweenCondition = CdkObjectWrappers.wrap(cdkObject) as? BetweenCondition ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: BetweenCondition):
        software.amazon.awscdk.services.sns.BetweenCondition = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.sns.BetweenCondition
  }
}
