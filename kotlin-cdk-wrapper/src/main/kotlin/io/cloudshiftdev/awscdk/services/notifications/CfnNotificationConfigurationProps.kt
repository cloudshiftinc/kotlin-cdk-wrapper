@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.notifications

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnNotificationConfiguration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.notifications.*;
 * CfnNotificationConfigurationProps cfnNotificationConfigurationProps =
 * CfnNotificationConfigurationProps.builder()
 * .description("description")
 * .name("name")
 * // the properties below are optional
 * .aggregationDuration("aggregationDuration")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-notificationconfiguration.html)
 */
public interface CfnNotificationConfigurationProps {
  /**
   * The aggregation preference of the `NotificationConfiguration` .
   *
   * * Values:
   * * `LONG`
   * * Aggregate notifications for long periods of time (12 hours).
   * * `SHORT`
   * * Aggregate notifications for short periods of time (5 minutes).
   * * `NONE`
   * * Don't aggregate notifications.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-notificationconfiguration.html#cfn-notifications-notificationconfiguration-aggregationduration)
   */
  public fun aggregationDuration(): String? = unwrap(this).getAggregationDuration()

  /**
   * The description of the `NotificationConfiguration` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-notificationconfiguration.html#cfn-notifications-notificationconfiguration-description)
   */
  public fun description(): String

  /**
   * The name of the `NotificationConfiguration` .
   *
   * Supports RFC 3986's unreserved characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-notificationconfiguration.html#cfn-notifications-notificationconfiguration-name)
   */
  public fun name(): String

  /**
   * A map of tags assigned to a `NotificationConfiguration` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-notificationconfiguration.html#cfn-notifications-notificationconfiguration-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnNotificationConfigurationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param aggregationDuration The aggregation preference of the `NotificationConfiguration` .
     * * Values:
     * * `LONG`
     * * Aggregate notifications for long periods of time (12 hours).
     * * `SHORT`
     * * Aggregate notifications for short periods of time (5 minutes).
     * * `NONE`
     * * Don't aggregate notifications.
     */
    public fun aggregationDuration(aggregationDuration: String)

    /**
     * @param description The description of the `NotificationConfiguration` . 
     */
    public fun description(description: String)

    /**
     * @param name The name of the `NotificationConfiguration` . 
     * Supports RFC 3986's unreserved characters.
     */
    public fun name(name: String)

    /**
     * @param tags A map of tags assigned to a `NotificationConfiguration` .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A map of tags assigned to a `NotificationConfiguration` .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.notifications.CfnNotificationConfigurationProps.Builder =
        software.amazon.awscdk.services.notifications.CfnNotificationConfigurationProps.builder()

    /**
     * @param aggregationDuration The aggregation preference of the `NotificationConfiguration` .
     * * Values:
     * * `LONG`
     * * Aggregate notifications for long periods of time (12 hours).
     * * `SHORT`
     * * Aggregate notifications for short periods of time (5 minutes).
     * * `NONE`
     * * Don't aggregate notifications.
     */
    override fun aggregationDuration(aggregationDuration: String) {
      cdkBuilder.aggregationDuration(aggregationDuration)
    }

    /**
     * @param description The description of the `NotificationConfiguration` . 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name of the `NotificationConfiguration` . 
     * Supports RFC 3986's unreserved characters.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags A map of tags assigned to a `NotificationConfiguration` .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A map of tags assigned to a `NotificationConfiguration` .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build():
        software.amazon.awscdk.services.notifications.CfnNotificationConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.notifications.CfnNotificationConfigurationProps,
  ) : CdkObject(cdkObject),
      CfnNotificationConfigurationProps {
    /**
     * The aggregation preference of the `NotificationConfiguration` .
     *
     * * Values:
     * * `LONG`
     * * Aggregate notifications for long periods of time (12 hours).
     * * `SHORT`
     * * Aggregate notifications for short periods of time (5 minutes).
     * * `NONE`
     * * Don't aggregate notifications.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-notificationconfiguration.html#cfn-notifications-notificationconfiguration-aggregationduration)
     */
    override fun aggregationDuration(): String? = unwrap(this).getAggregationDuration()

    /**
     * The description of the `NotificationConfiguration` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-notificationconfiguration.html#cfn-notifications-notificationconfiguration-description)
     */
    override fun description(): String = unwrap(this).getDescription()

    /**
     * The name of the `NotificationConfiguration` .
     *
     * Supports RFC 3986's unreserved characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-notificationconfiguration.html#cfn-notifications-notificationconfiguration-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * A map of tags assigned to a `NotificationConfiguration` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-notificationconfiguration.html#cfn-notifications-notificationconfiguration-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnNotificationConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.notifications.CfnNotificationConfigurationProps):
        CfnNotificationConfigurationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnNotificationConfigurationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnNotificationConfigurationProps):
        software.amazon.awscdk.services.notifications.CfnNotificationConfigurationProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.notifications.CfnNotificationConfigurationProps
  }
}
