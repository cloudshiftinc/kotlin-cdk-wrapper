@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.notifications

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Configures a `NotificationHub` for AWS User Notifications .
 *
 * For more information about notification hub, see the [AWS User Notifications User
 * Guide](https://docs.aws.amazon.com/notifications/latest/userguide/notification-hubs.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.notifications.*;
 * CfnNotificationHub cfnNotificationHub = CfnNotificationHub.Builder.create(this,
 * "MyCfnNotificationHub")
 * .region("region")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-notificationhub.html)
 */
public open class CfnNotificationHub(
  cdkObject: software.amazon.awscdk.services.notifications.CfnNotificationHub,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnNotificationHubProps,
  ) :
      this(software.amazon.awscdk.services.notifications.CfnNotificationHub(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnNotificationHubProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnNotificationHubProps.Builder.() -> Unit,
  ) : this(scope, id, CfnNotificationHubProps(props)
  )

  /**
   * The date and time the `NotificationHubOverview` was created.
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   *
   */
  public open fun attrNotificationHubStatusSummary(): IResolvable =
      unwrap(this).getAttrNotificationHubStatusSummary().let(IResolvable::wrap)

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The `NotificationHub` Region.
   */
  public open fun region(): String = unwrap(this).getRegion()

  /**
   * The `NotificationHub` Region.
   */
  public open fun region(`value`: String) {
    unwrap(this).setRegion(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.notifications.CfnNotificationHub].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The `NotificationHub` Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-notificationhub.html#cfn-notifications-notificationhub-region)
     * @param region The `NotificationHub` Region. 
     */
    public fun region(region: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.notifications.CfnNotificationHub.Builder
        = software.amazon.awscdk.services.notifications.CfnNotificationHub.Builder.create(scope, id)

    /**
     * The `NotificationHub` Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-notificationhub.html#cfn-notifications-notificationhub-region)
     * @param region The `NotificationHub` Region. 
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public fun build(): software.amazon.awscdk.services.notifications.CfnNotificationHub =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.notifications.CfnNotificationHub.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnNotificationHub {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnNotificationHub(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.notifications.CfnNotificationHub):
        CfnNotificationHub = CfnNotificationHub(cdkObject)

    internal fun unwrap(wrapped: CfnNotificationHub):
        software.amazon.awscdk.services.notifications.CfnNotificationHub = wrapped.cdkObject as
        software.amazon.awscdk.services.notifications.CfnNotificationHub
  }

  /**
   * Provides additional information about the current `NotificationHub` status.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.notifications.*;
   * NotificationHubStatusSummaryProperty notificationHubStatusSummaryProperty =
   * NotificationHubStatusSummaryProperty.builder()
   * .notificationHubStatus("notificationHubStatus")
   * .notificationHubStatusReason("notificationHubStatusReason")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-notifications-notificationhub-notificationhubstatussummary.html)
   */
  public interface NotificationHubStatusSummaryProperty {
    /**
     * Indicates the current status of the `NotificationHub` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-notifications-notificationhub-notificationhubstatussummary.html#cfn-notifications-notificationhub-notificationhubstatussummary-notificationhubstatus)
     */
    public fun notificationHubStatus(): String

    /**
     * An explanation for the current status.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-notifications-notificationhub-notificationhubstatussummary.html#cfn-notifications-notificationhub-notificationhubstatussummary-notificationhubstatusreason)
     */
    public fun notificationHubStatusReason(): String

    /**
     * A builder for [NotificationHubStatusSummaryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param notificationHubStatus Indicates the current status of the `NotificationHub` . 
       */
      public fun notificationHubStatus(notificationHubStatus: String)

      /**
       * @param notificationHubStatusReason An explanation for the current status. 
       */
      public fun notificationHubStatusReason(notificationHubStatusReason: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.notifications.CfnNotificationHub.NotificationHubStatusSummaryProperty.Builder
          =
          software.amazon.awscdk.services.notifications.CfnNotificationHub.NotificationHubStatusSummaryProperty.builder()

      /**
       * @param notificationHubStatus Indicates the current status of the `NotificationHub` . 
       */
      override fun notificationHubStatus(notificationHubStatus: String) {
        cdkBuilder.notificationHubStatus(notificationHubStatus)
      }

      /**
       * @param notificationHubStatusReason An explanation for the current status. 
       */
      override fun notificationHubStatusReason(notificationHubStatusReason: String) {
        cdkBuilder.notificationHubStatusReason(notificationHubStatusReason)
      }

      public fun build():
          software.amazon.awscdk.services.notifications.CfnNotificationHub.NotificationHubStatusSummaryProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.notifications.CfnNotificationHub.NotificationHubStatusSummaryProperty,
    ) : CdkObject(cdkObject),
        NotificationHubStatusSummaryProperty {
      /**
       * Indicates the current status of the `NotificationHub` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-notifications-notificationhub-notificationhubstatussummary.html#cfn-notifications-notificationhub-notificationhubstatussummary-notificationhubstatus)
       */
      override fun notificationHubStatus(): String = unwrap(this).getNotificationHubStatus()

      /**
       * An explanation for the current status.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-notifications-notificationhub-notificationhubstatussummary.html#cfn-notifications-notificationhub-notificationhubstatussummary-notificationhubstatusreason)
       */
      override fun notificationHubStatusReason(): String =
          unwrap(this).getNotificationHubStatusReason()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          NotificationHubStatusSummaryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.notifications.CfnNotificationHub.NotificationHubStatusSummaryProperty):
          NotificationHubStatusSummaryProperty = CdkObjectWrappers.wrap(cdkObject) as?
          NotificationHubStatusSummaryProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: NotificationHubStatusSummaryProperty):
          software.amazon.awscdk.services.notifications.CfnNotificationHub.NotificationHubStatusSummaryProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.notifications.CfnNotificationHub.NotificationHubStatusSummaryProperty
    }
  }
}
