@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotsitewise

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a portal, which can contain projects and dashboards.
 *
 * Before you can create a portal, you must enable IAM Identity Center . AWS IoT SiteWise Monitor
 * uses IAM Identity Center to manage user permissions. For more information, see [Enabling IAM
 * Identity
 * Center](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-get-started.html#mon-gs-sso)
 * in the *AWS IoT SiteWise User Guide* .
 *
 *
 * Before you can sign in to a new portal, you must add at least one IAM Identity Center user or
 * group to that portal. For more information, see [Adding or removing portal
 * administrators](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/administer-portals.html#portal-change-admins)
 * in the *AWS IoT SiteWise User Guide* .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotsitewise.*;
 * Object alarms;
 * CfnPortal cfnPortal = CfnPortal.Builder.create(this, "MyCfnPortal")
 * .portalContactEmail("portalContactEmail")
 * .portalName("portalName")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .alarms(alarms)
 * .notificationSenderEmail("notificationSenderEmail")
 * .portalAuthMode("portalAuthMode")
 * .portalDescription("portalDescription")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-portal.html)
 */
public open class CfnPortal internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iotsitewise.CfnPortal,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * Contains the configuration information of an alarm created in an AWS IoT SiteWise Monitor
   * portal.
   */
  public open fun alarms(): Any? = unwrap(this).getAlarms()

  /**
   * Contains the configuration information of an alarm created in an AWS IoT SiteWise Monitor
   * portal.
   */
  public open fun alarms(`value`: Any) {
    unwrap(this).setAlarms(`value`)
  }

  /**
   * The [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) of the
   * portal, which has the following format.
   *
   * `arn:${Partition}:iotsitewise:${Region}:${Account}:portal/${PortalId}`
   */
  public open fun attrPortalArn(): String = unwrap(this).getAttrPortalArn()

  /**
   * The IAM Identity Center application generated client ID (used with IAM Identity Center APIs).
   */
  public open fun attrPortalClientId(): String = unwrap(this).getAttrPortalClientId()

  /**
   * The ID of the created portal.
   */
  public open fun attrPortalId(): String = unwrap(this).getAttrPortalId()

  /**
   * The public URL for the AWS IoT SiteWise Monitor portal.
   */
  public open fun attrPortalStartUrl(): String = unwrap(this).getAttrPortalStartUrl()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The email address that sends alarm notifications.
   */
  public open fun notificationSenderEmail(): String? = unwrap(this).getNotificationSenderEmail()

  /**
   * The email address that sends alarm notifications.
   */
  public open fun notificationSenderEmail(`value`: String) {
    unwrap(this).setNotificationSenderEmail(`value`)
  }

  /**
   * The service to use to authenticate users to the portal.
   *
   * Choose from the following options:.
   */
  public open fun portalAuthMode(): String? = unwrap(this).getPortalAuthMode()

  /**
   * The service to use to authenticate users to the portal.
   *
   * Choose from the following options:.
   */
  public open fun portalAuthMode(`value`: String) {
    unwrap(this).setPortalAuthMode(`value`)
  }

  /**
   * The AWS administrator's contact email address.
   */
  public open fun portalContactEmail(): String = unwrap(this).getPortalContactEmail()

  /**
   * The AWS administrator's contact email address.
   */
  public open fun portalContactEmail(`value`: String) {
    unwrap(this).setPortalContactEmail(`value`)
  }

  /**
   * A description for the portal.
   */
  public open fun portalDescription(): String? = unwrap(this).getPortalDescription()

  /**
   * A description for the portal.
   */
  public open fun portalDescription(`value`: String) {
    unwrap(this).setPortalDescription(`value`)
  }

  /**
   * A friendly name for the portal.
   */
  public open fun portalName(): String = unwrap(this).getPortalName()

  /**
   * A friendly name for the portal.
   */
  public open fun portalName(`value`: String) {
    unwrap(this).setPortalName(`value`)
  }

  /**
   * The [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) of a
   * service role that allows the portal's users to access your AWS IoT SiteWise resources on your
   * behalf. For more information, see [Using service roles for AWS IoT SiteWise
   * Monitor](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html) in
   * the *AWS IoT SiteWise User Guide* .
   */
  public open fun roleArn(): String = unwrap(this).getRoleArn()

  /**
   * The [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) of a
   * service role that allows the portal's users to access your AWS IoT SiteWise resources on your
   * behalf. For more information, see [Using service roles for AWS IoT SiteWise
   * Monitor](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html) in
   * the *AWS IoT SiteWise User Guide* .
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of key-value pairs that contain metadata for the portal.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of key-value pairs that contain metadata for the portal.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A list of key-value pairs that contain metadata for the portal.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iotsitewise.CfnPortal].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Contains the configuration information of an alarm created in an AWS IoT SiteWise Monitor
     * portal.
     *
     * You can use the alarm to monitor an asset property and get notified when the asset property
     * value is outside a specified range. For more information, see [Monitoring with
     * alarms](https://docs.aws.amazon.com/iot-sitewise/latest/appguide/monitor-alarms.html) in the
     * *AWS IoT SiteWise Application Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-portal.html#cfn-iotsitewise-portal-alarms)
     * @param alarms Contains the configuration information of an alarm created in an AWS IoT
     * SiteWise Monitor portal. 
     */
    public fun alarms(alarms: Any)

    /**
     * The email address that sends alarm notifications.
     *
     *
     * If you use the [AWS IoT Events managed Lambda
     * function](https://docs.aws.amazon.com/iotevents/latest/developerguide/lambda-support.html) to
     * manage your emails, you must [verify the sender email address in Amazon
     * SES](https://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-email-addresses.html) .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-portal.html#cfn-iotsitewise-portal-notificationsenderemail)
     * @param notificationSenderEmail The email address that sends alarm notifications. 
     */
    public fun notificationSenderEmail(notificationSenderEmail: String)

    /**
     * The service to use to authenticate users to the portal. Choose from the following options:.
     *
     * * `SSO` – The portal uses AWS IAM Identity Center to authenticate users and manage user
     * permissions. Before you can create a portal that uses IAM Identity Center , you must enable IAM
     * Identity Center . For more information, see [Enabling IAM Identity
     * Center](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-get-started.html#mon-gs-sso)
     * in the *AWS IoT SiteWise User Guide* . This option is only available in AWS Regions other than
     * the China Regions.
     * * `IAM` – The portal uses AWS Identity and Access Management ( IAM ) to authenticate users
     * and manage user permissions.
     *
     * You can't change this value after you create a portal.
     *
     * Default: `SSO`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-portal.html#cfn-iotsitewise-portal-portalauthmode)
     * @param portalAuthMode The service to use to authenticate users to the portal. Choose from the
     * following options:. 
     */
    public fun portalAuthMode(portalAuthMode: String)

    /**
     * The AWS administrator's contact email address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-portal.html#cfn-iotsitewise-portal-portalcontactemail)
     * @param portalContactEmail The AWS administrator's contact email address. 
     */
    public fun portalContactEmail(portalContactEmail: String)

    /**
     * A description for the portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-portal.html#cfn-iotsitewise-portal-portaldescription)
     * @param portalDescription A description for the portal. 
     */
    public fun portalDescription(portalDescription: String)

    /**
     * A friendly name for the portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-portal.html#cfn-iotsitewise-portal-portalname)
     * @param portalName A friendly name for the portal. 
     */
    public fun portalName(portalName: String)

    /**
     * The [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) of a
     * service role that allows the portal's users to access your AWS IoT SiteWise resources on your
     * behalf. For more information, see [Using service roles for AWS IoT SiteWise
     * Monitor](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html) in
     * the *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-portal.html#cfn-iotsitewise-portal-rolearn)
     * @param roleArn The
     * [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) of a service
     * role that allows the portal's users to access your AWS IoT SiteWise resources on your behalf.
     * For more information, see [Using service roles for AWS IoT SiteWise
     * Monitor](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html) in
     * the *AWS IoT SiteWise User Guide* . 
     */
    public fun roleArn(roleArn: String)

    /**
     * A list of key-value pairs that contain metadata for the portal.
     *
     * For more information, see [Tagging your AWS IoT SiteWise
     * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
     * *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-portal.html#cfn-iotsitewise-portal-tags)
     * @param tags A list of key-value pairs that contain metadata for the portal. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of key-value pairs that contain metadata for the portal.
     *
     * For more information, see [Tagging your AWS IoT SiteWise
     * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
     * *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-portal.html#cfn-iotsitewise-portal-tags)
     * @param tags A list of key-value pairs that contain metadata for the portal. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotsitewise.CfnPortal.Builder =
        software.amazon.awscdk.services.iotsitewise.CfnPortal.Builder.create(scope, id)

    /**
     * Contains the configuration information of an alarm created in an AWS IoT SiteWise Monitor
     * portal.
     *
     * You can use the alarm to monitor an asset property and get notified when the asset property
     * value is outside a specified range. For more information, see [Monitoring with
     * alarms](https://docs.aws.amazon.com/iot-sitewise/latest/appguide/monitor-alarms.html) in the
     * *AWS IoT SiteWise Application Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-portal.html#cfn-iotsitewise-portal-alarms)
     * @param alarms Contains the configuration information of an alarm created in an AWS IoT
     * SiteWise Monitor portal. 
     */
    override fun alarms(alarms: Any) {
      cdkBuilder.alarms(alarms)
    }

    /**
     * The email address that sends alarm notifications.
     *
     *
     * If you use the [AWS IoT Events managed Lambda
     * function](https://docs.aws.amazon.com/iotevents/latest/developerguide/lambda-support.html) to
     * manage your emails, you must [verify the sender email address in Amazon
     * SES](https://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-email-addresses.html) .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-portal.html#cfn-iotsitewise-portal-notificationsenderemail)
     * @param notificationSenderEmail The email address that sends alarm notifications. 
     */
    override fun notificationSenderEmail(notificationSenderEmail: String) {
      cdkBuilder.notificationSenderEmail(notificationSenderEmail)
    }

    /**
     * The service to use to authenticate users to the portal. Choose from the following options:.
     *
     * * `SSO` – The portal uses AWS IAM Identity Center to authenticate users and manage user
     * permissions. Before you can create a portal that uses IAM Identity Center , you must enable IAM
     * Identity Center . For more information, see [Enabling IAM Identity
     * Center](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-get-started.html#mon-gs-sso)
     * in the *AWS IoT SiteWise User Guide* . This option is only available in AWS Regions other than
     * the China Regions.
     * * `IAM` – The portal uses AWS Identity and Access Management ( IAM ) to authenticate users
     * and manage user permissions.
     *
     * You can't change this value after you create a portal.
     *
     * Default: `SSO`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-portal.html#cfn-iotsitewise-portal-portalauthmode)
     * @param portalAuthMode The service to use to authenticate users to the portal. Choose from the
     * following options:. 
     */
    override fun portalAuthMode(portalAuthMode: String) {
      cdkBuilder.portalAuthMode(portalAuthMode)
    }

    /**
     * The AWS administrator's contact email address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-portal.html#cfn-iotsitewise-portal-portalcontactemail)
     * @param portalContactEmail The AWS administrator's contact email address. 
     */
    override fun portalContactEmail(portalContactEmail: String) {
      cdkBuilder.portalContactEmail(portalContactEmail)
    }

    /**
     * A description for the portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-portal.html#cfn-iotsitewise-portal-portaldescription)
     * @param portalDescription A description for the portal. 
     */
    override fun portalDescription(portalDescription: String) {
      cdkBuilder.portalDescription(portalDescription)
    }

    /**
     * A friendly name for the portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-portal.html#cfn-iotsitewise-portal-portalname)
     * @param portalName A friendly name for the portal. 
     */
    override fun portalName(portalName: String) {
      cdkBuilder.portalName(portalName)
    }

    /**
     * The [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) of a
     * service role that allows the portal's users to access your AWS IoT SiteWise resources on your
     * behalf. For more information, see [Using service roles for AWS IoT SiteWise
     * Monitor](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html) in
     * the *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-portal.html#cfn-iotsitewise-portal-rolearn)
     * @param roleArn The
     * [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) of a service
     * role that allows the portal's users to access your AWS IoT SiteWise resources on your behalf.
     * For more information, see [Using service roles for AWS IoT SiteWise
     * Monitor](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html) in
     * the *AWS IoT SiteWise User Guide* . 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * A list of key-value pairs that contain metadata for the portal.
     *
     * For more information, see [Tagging your AWS IoT SiteWise
     * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
     * *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-portal.html#cfn-iotsitewise-portal-tags)
     * @param tags A list of key-value pairs that contain metadata for the portal. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A list of key-value pairs that contain metadata for the portal.
     *
     * For more information, see [Tagging your AWS IoT SiteWise
     * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
     * *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-portal.html#cfn-iotsitewise-portal-tags)
     * @param tags A list of key-value pairs that contain metadata for the portal. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotsitewise.CfnPortal = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iotsitewise.CfnPortal.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPortal {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPortal(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnPortal): CfnPortal =
        CfnPortal(cdkObject)

    internal fun unwrap(wrapped: CfnPortal): software.amazon.awscdk.services.iotsitewise.CfnPortal =
        wrapped.cdkObject
  }

  /**
   * Contains the configuration information of an alarm created in an AWS IoT SiteWise Monitor
   * portal.
   *
   * You can use the alarm to monitor an asset property and get notified when the asset property
   * value is outside a specified range. For more information, see [Monitoring with
   * alarms](https://docs.aws.amazon.com/iot-sitewise/latest/appguide/monitor-alarms.html) in the *AWS
   * IoT SiteWise Application Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotsitewise.*;
   * AlarmsProperty alarmsProperty = AlarmsProperty.builder()
   * .alarmRoleArn("alarmRoleArn")
   * .notificationLambdaArn("notificationLambdaArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-portal-alarms.html)
   */
  public interface AlarmsProperty {
    /**
     * The [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) of the
     * IAM role that allows the alarm to perform actions and access AWS resources and services, such as
     * AWS IoT Events .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-portal-alarms.html#cfn-iotsitewise-portal-alarms-alarmrolearn)
     */
    public fun alarmRoleArn(): String? = unwrap(this).getAlarmRoleArn()

    /**
     * The [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) of the
     * Lambda function that manages alarm notifications. For more information, see [Managing alarm
     * notifications](https://docs.aws.amazon.com/iotevents/latest/developerguide/lambda-support.html)
     * in the *AWS IoT Events Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-portal-alarms.html#cfn-iotsitewise-portal-alarms-notificationlambdaarn)
     */
    public fun notificationLambdaArn(): String? = unwrap(this).getNotificationLambdaArn()

    /**
     * A builder for [AlarmsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param alarmRoleArn The
       * [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) of the IAM
       * role that allows the alarm to perform actions and access AWS resources and services, such as
       * AWS IoT Events .
       */
      public fun alarmRoleArn(alarmRoleArn: String)

      /**
       * @param notificationLambdaArn The
       * [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) of the
       * Lambda function that manages alarm notifications. For more information, see [Managing alarm
       * notifications](https://docs.aws.amazon.com/iotevents/latest/developerguide/lambda-support.html)
       * in the *AWS IoT Events Developer Guide* .
       */
      public fun notificationLambdaArn(notificationLambdaArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnPortal.AlarmsProperty.Builder =
          software.amazon.awscdk.services.iotsitewise.CfnPortal.AlarmsProperty.builder()

      /**
       * @param alarmRoleArn The
       * [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) of the IAM
       * role that allows the alarm to perform actions and access AWS resources and services, such as
       * AWS IoT Events .
       */
      override fun alarmRoleArn(alarmRoleArn: String) {
        cdkBuilder.alarmRoleArn(alarmRoleArn)
      }

      /**
       * @param notificationLambdaArn The
       * [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) of the
       * Lambda function that manages alarm notifications. For more information, see [Managing alarm
       * notifications](https://docs.aws.amazon.com/iotevents/latest/developerguide/lambda-support.html)
       * in the *AWS IoT Events Developer Guide* .
       */
      override fun notificationLambdaArn(notificationLambdaArn: String) {
        cdkBuilder.notificationLambdaArn(notificationLambdaArn)
      }

      public fun build(): software.amazon.awscdk.services.iotsitewise.CfnPortal.AlarmsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.iotsitewise.CfnPortal.AlarmsProperty,
    ) : CdkObject(cdkObject), AlarmsProperty {
      /**
       * The [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) of
       * the IAM role that allows the alarm to perform actions and access AWS resources and services,
       * such as AWS IoT Events .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-portal-alarms.html#cfn-iotsitewise-portal-alarms-alarmrolearn)
       */
      override fun alarmRoleArn(): String? = unwrap(this).getAlarmRoleArn()

      /**
       * The [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) of
       * the Lambda function that manages alarm notifications. For more information, see [Managing
       * alarm
       * notifications](https://docs.aws.amazon.com/iotevents/latest/developerguide/lambda-support.html)
       * in the *AWS IoT Events Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-portal-alarms.html#cfn-iotsitewise-portal-alarms-notificationlambdaarn)
       */
      override fun notificationLambdaArn(): String? = unwrap(this).getNotificationLambdaArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AlarmsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnPortal.AlarmsProperty):
          AlarmsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AlarmsProperty):
          software.amazon.awscdk.services.iotsitewise.CfnPortal.AlarmsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotsitewise.CfnPortal.AlarmsProperty
    }
  }
}
