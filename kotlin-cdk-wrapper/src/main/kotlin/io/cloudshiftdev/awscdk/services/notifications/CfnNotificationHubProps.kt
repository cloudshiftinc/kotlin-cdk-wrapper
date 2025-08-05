@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.notifications

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnNotificationHub`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.notifications.*;
 * CfnNotificationHubProps cfnNotificationHubProps = CfnNotificationHubProps.builder()
 * .region("region")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-notificationhub.html)
 */
public interface CfnNotificationHubProps {
  /**
   * The `NotificationHub` Region.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-notificationhub.html#cfn-notifications-notificationhub-region)
   */
  public fun region(): String

  /**
   * A builder for [CfnNotificationHubProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param region The `NotificationHub` Region. 
     */
    public fun region(region: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.notifications.CfnNotificationHubProps.Builder =
        software.amazon.awscdk.services.notifications.CfnNotificationHubProps.builder()

    /**
     * @param region The `NotificationHub` Region. 
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public fun build(): software.amazon.awscdk.services.notifications.CfnNotificationHubProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.notifications.CfnNotificationHubProps,
  ) : CdkObject(cdkObject),
      CfnNotificationHubProps {
    /**
     * The `NotificationHub` Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-notificationhub.html#cfn-notifications-notificationhub-region)
     */
    override fun region(): String = unwrap(this).getRegion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnNotificationHubProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.notifications.CfnNotificationHubProps):
        CfnNotificationHubProps = CdkObjectWrappers.wrap(cdkObject) as? CfnNotificationHubProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnNotificationHubProps):
        software.amazon.awscdk.services.notifications.CfnNotificationHubProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.notifications.CfnNotificationHubProps
  }
}
