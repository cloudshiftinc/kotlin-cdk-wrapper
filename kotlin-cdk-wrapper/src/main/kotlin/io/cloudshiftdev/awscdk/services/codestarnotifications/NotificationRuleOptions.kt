@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codestarnotifications

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Standard set of options for `notifyOnXxx` codestar notification handler on construct.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codestarnotifications.*;
 * NotificationRuleOptions notificationRuleOptions = NotificationRuleOptions.builder()
 * .detailType(DetailType.BASIC)
 * .enabled(false)
 * .notificationRuleName("notificationRuleName")
 * .build();
 * ```
 */
public interface NotificationRuleOptions {
  /**
   * The level of detail to include in the notifications for this resource.
   *
   * BASIC will include only the contents of the event as it would appear in AWS CloudWatch.
   * FULL will include any supplemental information provided by AWS CodeStar Notifications and/or
   * the service for the resource for which the notification is created.
   *
   * Default: DetailType.FULL
   */
  public fun detailType(): DetailType? = unwrap(this).getDetailType()?.let(DetailType::wrap)

  /**
   * The status of the notification rule.
   *
   * If the enabled is set to DISABLED, notifications aren't sent for the notification rule.
   *
   * Default: true
   */
  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  /**
   * The name for the notification rule.
   *
   * Notification rule names must be unique in your AWS account.
   *
   * Default: - generated from the `id`
   */
  public fun notificationRuleName(): String? = unwrap(this).getNotificationRuleName()

  /**
   * A builder for [NotificationRuleOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param detailType The level of detail to include in the notifications for this resource.
     * BASIC will include only the contents of the event as it would appear in AWS CloudWatch.
     * FULL will include any supplemental information provided by AWS CodeStar Notifications and/or
     * the service for the resource for which the notification is created.
     */
    public fun detailType(detailType: DetailType)

    /**
     * @param enabled The status of the notification rule.
     * If the enabled is set to DISABLED, notifications aren't sent for the notification rule.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param notificationRuleName The name for the notification rule.
     * Notification rule names must be unique in your AWS account.
     */
    public fun notificationRuleName(notificationRuleName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codestarnotifications.NotificationRuleOptions.Builder =
        software.amazon.awscdk.services.codestarnotifications.NotificationRuleOptions.builder()

    /**
     * @param detailType The level of detail to include in the notifications for this resource.
     * BASIC will include only the contents of the event as it would appear in AWS CloudWatch.
     * FULL will include any supplemental information provided by AWS CodeStar Notifications and/or
     * the service for the resource for which the notification is created.
     */
    override fun detailType(detailType: DetailType) {
      cdkBuilder.detailType(detailType.let(DetailType::unwrap))
    }

    /**
     * @param enabled The status of the notification rule.
     * If the enabled is set to DISABLED, notifications aren't sent for the notification rule.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param notificationRuleName The name for the notification rule.
     * Notification rule names must be unique in your AWS account.
     */
    override fun notificationRuleName(notificationRuleName: String) {
      cdkBuilder.notificationRuleName(notificationRuleName)
    }

    public fun build():
        software.amazon.awscdk.services.codestarnotifications.NotificationRuleOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codestarnotifications.NotificationRuleOptions,
  ) : CdkObject(cdkObject), NotificationRuleOptions {
    /**
     * The level of detail to include in the notifications for this resource.
     *
     * BASIC will include only the contents of the event as it would appear in AWS CloudWatch.
     * FULL will include any supplemental information provided by AWS CodeStar Notifications and/or
     * the service for the resource for which the notification is created.
     *
     * Default: DetailType.FULL
     */
    override fun detailType(): DetailType? = unwrap(this).getDetailType()?.let(DetailType::wrap)

    /**
     * The status of the notification rule.
     *
     * If the enabled is set to DISABLED, notifications aren't sent for the notification rule.
     *
     * Default: true
     */
    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    /**
     * The name for the notification rule.
     *
     * Notification rule names must be unique in your AWS account.
     *
     * Default: - generated from the `id`
     */
    override fun notificationRuleName(): String? = unwrap(this).getNotificationRuleName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NotificationRuleOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codestarnotifications.NotificationRuleOptions):
        NotificationRuleOptions = CdkObjectWrappers.wrap(cdkObject) as? NotificationRuleOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: NotificationRuleOptions):
        software.amazon.awscdk.services.codestarnotifications.NotificationRuleOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codestarnotifications.NotificationRuleOptions
  }
}
