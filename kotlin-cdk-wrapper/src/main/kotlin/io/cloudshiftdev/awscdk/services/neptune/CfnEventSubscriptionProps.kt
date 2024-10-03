@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.neptune

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnEventSubscription`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.neptune.*;
 * CfnEventSubscriptionProps cfnEventSubscriptionProps = CfnEventSubscriptionProps.builder()
 * .enabled(false)
 * .eventCategories(List.of("eventCategories"))
 * .snsTopicArn("snsTopicArn")
 * .sourceIds(List.of("sourceIds"))
 * .sourceType("sourceType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-eventsubscription.html)
 */
public interface CfnEventSubscriptionProps {
  /**
   * A Boolean value indicating if the subscription is enabled.
   *
   * True indicates the subscription is enabled.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-eventsubscription.html#cfn-neptune-eventsubscription-enabled)
   */
  public fun enabled(): Any? = unwrap(this).getEnabled()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-eventsubscription.html#cfn-neptune-eventsubscription-eventcategories)
   */
  public fun eventCategories(): List<String> = unwrap(this).getEventCategories() ?: emptyList()

  /**
   * The topic ARN of the event notification subscription.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-eventsubscription.html#cfn-neptune-eventsubscription-snstopicarn)
   */
  public fun snsTopicArn(): String? = unwrap(this).getSnsTopicArn()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-eventsubscription.html#cfn-neptune-eventsubscription-sourceids)
   */
  public fun sourceIds(): List<String> = unwrap(this).getSourceIds() ?: emptyList()

  /**
   * The source type for the event notification subscription.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-eventsubscription.html#cfn-neptune-eventsubscription-sourcetype)
   */
  public fun sourceType(): String? = unwrap(this).getSourceType()

  /**
   * A builder for [CfnEventSubscriptionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param enabled A Boolean value indicating if the subscription is enabled.
     * True indicates the subscription is enabled.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param enabled A Boolean value indicating if the subscription is enabled.
     * True indicates the subscription is enabled.
     */
    public fun enabled(enabled: IResolvable)

    /**
     * @param eventCategories the value to be set.
     */
    public fun eventCategories(eventCategories: List<String>)

    /**
     * @param eventCategories the value to be set.
     */
    public fun eventCategories(vararg eventCategories: String)

    /**
     * @param snsTopicArn The topic ARN of the event notification subscription.
     */
    public fun snsTopicArn(snsTopicArn: String)

    /**
     * @param sourceIds the value to be set.
     */
    public fun sourceIds(sourceIds: List<String>)

    /**
     * @param sourceIds the value to be set.
     */
    public fun sourceIds(vararg sourceIds: String)

    /**
     * @param sourceType The source type for the event notification subscription.
     */
    public fun sourceType(sourceType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.neptune.CfnEventSubscriptionProps.Builder =
        software.amazon.awscdk.services.neptune.CfnEventSubscriptionProps.builder()

    /**
     * @param enabled A Boolean value indicating if the subscription is enabled.
     * True indicates the subscription is enabled.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled A Boolean value indicating if the subscription is enabled.
     * True indicates the subscription is enabled.
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param eventCategories the value to be set.
     */
    override fun eventCategories(eventCategories: List<String>) {
      cdkBuilder.eventCategories(eventCategories)
    }

    /**
     * @param eventCategories the value to be set.
     */
    override fun eventCategories(vararg eventCategories: String): Unit =
        eventCategories(eventCategories.toList())

    /**
     * @param snsTopicArn The topic ARN of the event notification subscription.
     */
    override fun snsTopicArn(snsTopicArn: String) {
      cdkBuilder.snsTopicArn(snsTopicArn)
    }

    /**
     * @param sourceIds the value to be set.
     */
    override fun sourceIds(sourceIds: List<String>) {
      cdkBuilder.sourceIds(sourceIds)
    }

    /**
     * @param sourceIds the value to be set.
     */
    override fun sourceIds(vararg sourceIds: String): Unit = sourceIds(sourceIds.toList())

    /**
     * @param sourceType The source type for the event notification subscription.
     */
    override fun sourceType(sourceType: String) {
      cdkBuilder.sourceType(sourceType)
    }

    public fun build(): software.amazon.awscdk.services.neptune.CfnEventSubscriptionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.neptune.CfnEventSubscriptionProps,
  ) : CdkObject(cdkObject),
      CfnEventSubscriptionProps {
    /**
     * A Boolean value indicating if the subscription is enabled.
     *
     * True indicates the subscription is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-eventsubscription.html#cfn-neptune-eventsubscription-enabled)
     */
    override fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-eventsubscription.html#cfn-neptune-eventsubscription-eventcategories)
     */
    override fun eventCategories(): List<String> = unwrap(this).getEventCategories() ?: emptyList()

    /**
     * The topic ARN of the event notification subscription.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-eventsubscription.html#cfn-neptune-eventsubscription-snstopicarn)
     */
    override fun snsTopicArn(): String? = unwrap(this).getSnsTopicArn()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-eventsubscription.html#cfn-neptune-eventsubscription-sourceids)
     */
    override fun sourceIds(): List<String> = unwrap(this).getSourceIds() ?: emptyList()

    /**
     * The source type for the event notification subscription.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-eventsubscription.html#cfn-neptune-eventsubscription-sourcetype)
     */
    override fun sourceType(): String? = unwrap(this).getSourceType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEventSubscriptionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.neptune.CfnEventSubscriptionProps):
        CfnEventSubscriptionProps = CdkObjectWrappers.wrap(cdkObject) as? CfnEventSubscriptionProps
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEventSubscriptionProps):
        software.amazon.awscdk.services.neptune.CfnEventSubscriptionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.neptune.CfnEventSubscriptionProps
  }
}
