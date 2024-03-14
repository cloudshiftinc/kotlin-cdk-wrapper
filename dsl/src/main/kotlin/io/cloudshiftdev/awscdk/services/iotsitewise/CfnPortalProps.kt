package io.cloudshiftdev.awscdk.services.iotsitewise

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnPortalProps {
  /**
   * Contains the configuration information of an alarm created in an AWS IoT SiteWise Monitor
   * portal.
   *
   * You can use the alarm to monitor an asset property and get notified when the asset property
   * value is outside a specified range. For more information, see [Monitoring with
   * alarms](https://docs.aws.amazon.com/iot-sitewise/latest/appguide/monitor-alarms.html) in the *AWS
   * IoT SiteWise Application Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-portal.html#cfn-iotsitewise-portal-alarms)
   */
  public fun alarms(): Any? = unwrap(this).getAlarms()

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
   */
  public fun notificationSenderEmail(): String? = unwrap(this).getNotificationSenderEmail()

  /**
   * The service to use to authenticate users to the portal. Choose from the following options:.
   *
   * * `SSO` – The portal uses AWS IAM Identity Center to authenticate users and manage user
   * permissions. Before you can create a portal that uses IAM Identity Center , you must enable IAM
   * Identity Center . For more information, see [Enabling IAM Identity
   * Center](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-get-started.html#mon-gs-sso)
   * in the *AWS IoT SiteWise User Guide* . This option is only available in AWS Regions other than the
   * China Regions.
   * * `IAM` – The portal uses AWS Identity and Access Management ( IAM ) to authenticate users and
   * manage user permissions.
   *
   * You can't change this value after you create a portal.
   *
   * Default: `SSO`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-portal.html#cfn-iotsitewise-portal-portalauthmode)
   */
  public fun portalAuthMode(): String? = unwrap(this).getPortalAuthMode()

  /**
   * The AWS administrator's contact email address.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-portal.html#cfn-iotsitewise-portal-portalcontactemail)
   */
  public fun portalContactEmail(): String

  /**
   * A description for the portal.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-portal.html#cfn-iotsitewise-portal-portaldescription)
   */
  public fun portalDescription(): String? = unwrap(this).getPortalDescription()

  /**
   * A friendly name for the portal.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-portal.html#cfn-iotsitewise-portal-portalname)
   */
  public fun portalName(): String

  /**
   * The [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) of a
   * service role that allows the portal's users to access your AWS IoT SiteWise resources on your
   * behalf. For more information, see [Using service roles for AWS IoT SiteWise
   * Monitor](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html) in
   * the *AWS IoT SiteWise User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-portal.html#cfn-iotsitewise-portal-rolearn)
   */
  public fun roleArn(): String

  /**
   * A list of key-value pairs that contain metadata for the portal.
   *
   * For more information, see [Tagging your AWS IoT SiteWise
   * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
   * *AWS IoT SiteWise User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-portal.html#cfn-iotsitewise-portal-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnPortalProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param alarms Contains the configuration information of an alarm created in an AWS IoT
     * SiteWise Monitor portal.
     * You can use the alarm to monitor an asset property and get notified when the asset property
     * value is outside a specified range. For more information, see [Monitoring with
     * alarms](https://docs.aws.amazon.com/iot-sitewise/latest/appguide/monitor-alarms.html) in the
     * *AWS IoT SiteWise Application Guide* .
     */
    public fun alarms(alarms: Any)

    /**
     * @param notificationSenderEmail The email address that sends alarm notifications.
     *
     * If you use the [AWS IoT Events managed Lambda
     * function](https://docs.aws.amazon.com/iotevents/latest/developerguide/lambda-support.html) to
     * manage your emails, you must [verify the sender email address in Amazon
     * SES](https://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-email-addresses.html) .
     */
    public fun notificationSenderEmail(notificationSenderEmail: String)

    /**
     * @param portalAuthMode The service to use to authenticate users to the portal. Choose from the
     * following options:.
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
     */
    public fun portalAuthMode(portalAuthMode: String)

    /**
     * @param portalContactEmail The AWS administrator's contact email address. 
     */
    public fun portalContactEmail(portalContactEmail: String)

    /**
     * @param portalDescription A description for the portal.
     */
    public fun portalDescription(portalDescription: String)

    /**
     * @param portalName A friendly name for the portal. 
     */
    public fun portalName(portalName: String)

    /**
     * @param roleArn The
     * [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) of a service
     * role that allows the portal's users to access your AWS IoT SiteWise resources on your behalf.
     * For more information, see [Using service roles for AWS IoT SiteWise
     * Monitor](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html) in
     * the *AWS IoT SiteWise User Guide* . 
     */
    public fun roleArn(roleArn: String)

    /**
     * @param tags A list of key-value pairs that contain metadata for the portal.
     * For more information, see [Tagging your AWS IoT SiteWise
     * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
     * *AWS IoT SiteWise User Guide* .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of key-value pairs that contain metadata for the portal.
     * For more information, see [Tagging your AWS IoT SiteWise
     * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
     * *AWS IoT SiteWise User Guide* .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotsitewise.CfnPortalProps.Builder =
        software.amazon.awscdk.services.iotsitewise.CfnPortalProps.builder()

    /**
     * @param alarms Contains the configuration information of an alarm created in an AWS IoT
     * SiteWise Monitor portal.
     * You can use the alarm to monitor an asset property and get notified when the asset property
     * value is outside a specified range. For more information, see [Monitoring with
     * alarms](https://docs.aws.amazon.com/iot-sitewise/latest/appguide/monitor-alarms.html) in the
     * *AWS IoT SiteWise Application Guide* .
     */
    override fun alarms(alarms: Any) {
      cdkBuilder.alarms(alarms)
    }

    /**
     * @param notificationSenderEmail The email address that sends alarm notifications.
     *
     * If you use the [AWS IoT Events managed Lambda
     * function](https://docs.aws.amazon.com/iotevents/latest/developerguide/lambda-support.html) to
     * manage your emails, you must [verify the sender email address in Amazon
     * SES](https://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-email-addresses.html) .
     */
    override fun notificationSenderEmail(notificationSenderEmail: String) {
      cdkBuilder.notificationSenderEmail(notificationSenderEmail)
    }

    /**
     * @param portalAuthMode The service to use to authenticate users to the portal. Choose from the
     * following options:.
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
     */
    override fun portalAuthMode(portalAuthMode: String) {
      cdkBuilder.portalAuthMode(portalAuthMode)
    }

    /**
     * @param portalContactEmail The AWS administrator's contact email address. 
     */
    override fun portalContactEmail(portalContactEmail: String) {
      cdkBuilder.portalContactEmail(portalContactEmail)
    }

    /**
     * @param portalDescription A description for the portal.
     */
    override fun portalDescription(portalDescription: String) {
      cdkBuilder.portalDescription(portalDescription)
    }

    /**
     * @param portalName A friendly name for the portal. 
     */
    override fun portalName(portalName: String) {
      cdkBuilder.portalName(portalName)
    }

    /**
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
     * @param tags A list of key-value pairs that contain metadata for the portal.
     * For more information, see [Tagging your AWS IoT SiteWise
     * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
     * *AWS IoT SiteWise User Guide* .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A list of key-value pairs that contain metadata for the portal.
     * For more information, see [Tagging your AWS IoT SiteWise
     * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
     * *AWS IoT SiteWise User Guide* .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotsitewise.CfnPortalProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iotsitewise.CfnPortalProps,
  ) : CdkObject(cdkObject), CfnPortalProps {
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
     */
    override fun alarms(): Any? = unwrap(this).getAlarms()

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
     */
    override fun notificationSenderEmail(): String? = unwrap(this).getNotificationSenderEmail()

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
     */
    override fun portalAuthMode(): String? = unwrap(this).getPortalAuthMode()

    /**
     * The AWS administrator's contact email address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-portal.html#cfn-iotsitewise-portal-portalcontactemail)
     */
    override fun portalContactEmail(): String = unwrap(this).getPortalContactEmail()

    /**
     * A description for the portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-portal.html#cfn-iotsitewise-portal-portaldescription)
     */
    override fun portalDescription(): String? = unwrap(this).getPortalDescription()

    /**
     * A friendly name for the portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-portal.html#cfn-iotsitewise-portal-portalname)
     */
    override fun portalName(): String = unwrap(this).getPortalName()

    /**
     * The [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) of a
     * service role that allows the portal's users to access your AWS IoT SiteWise resources on your
     * behalf. For more information, see [Using service roles for AWS IoT SiteWise
     * Monitor](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html) in
     * the *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-portal.html#cfn-iotsitewise-portal-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * A list of key-value pairs that contain metadata for the portal.
     *
     * For more information, see [Tagging your AWS IoT SiteWise
     * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
     * *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-portal.html#cfn-iotsitewise-portal-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPortalProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnPortalProps):
        CfnPortalProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPortalProps):
        software.amazon.awscdk.services.iotsitewise.CfnPortalProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotsitewise.CfnPortalProps
  }
}
