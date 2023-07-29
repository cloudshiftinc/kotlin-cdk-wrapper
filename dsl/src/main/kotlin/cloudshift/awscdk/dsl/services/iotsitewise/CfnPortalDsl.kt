@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.iotsitewise.CfnPortal
import software.constructs.Construct

/**
 * Creates a portal, which can contain projects and dashboards.
 *
 * Before you can create a portal, you must enable IAM Identity Center . AWS IoT SiteWise Monitor
 * uses IAM Identity Center to manage user permissions. For more information, see
 * [Enabling IAM Identity Center](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-get-started.html#mon-gs-sso)
 * in the *AWS IoT SiteWise User Guide* .
 *
 * Before you can sign in to a new portal, you must add at least one IAM Identity Center user or
 * group to that portal. For more information, see
 * [Adding or removing portal administrators](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/administer-portals.html#portal-change-admins)
 * in the *AWS IoT SiteWise User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotsitewise.*;
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
@CdkDslMarker
public class CfnPortalDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnPortal.Builder = CfnPortal.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * Contains the configuration information of an alarm created in an AWS IoT SiteWise Monitor
     * portal.
     *
     * You can use the alarm to monitor an asset property and get notified when the asset property
     * value is outside a specified range. For more information, see
     * [Monitoring with alarms](https://docs.aws.amazon.com/iot-sitewise/latest/appguide/monitor-alarms.html)
     * in the *AWS IoT SiteWise Application Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-portal.html#cfn-iotsitewise-portal-alarms)
     *
     * @param alarms Contains the configuration information of an alarm created in an AWS IoT
     *   SiteWise Monitor portal.
     */
    public fun alarms(alarms: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(alarms)
        cdkBuilder.alarms(builder.map)
    }

    /**
     * Contains the configuration information of an alarm created in an AWS IoT SiteWise Monitor
     * portal.
     *
     * You can use the alarm to monitor an asset property and get notified when the asset property
     * value is outside a specified range. For more information, see
     * [Monitoring with alarms](https://docs.aws.amazon.com/iot-sitewise/latest/appguide/monitor-alarms.html)
     * in the *AWS IoT SiteWise Application Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-portal.html#cfn-iotsitewise-portal-alarms)
     *
     * @param alarms Contains the configuration information of an alarm created in an AWS IoT
     *   SiteWise Monitor portal.
     */
    public fun alarms(alarms: Any) {
        cdkBuilder.alarms(alarms)
    }

    /**
     * The email address that sends alarm notifications.
     *
     * If you use the
     * [AWS IoT Events managed Lambda function](https://docs.aws.amazon.com/iotevents/latest/developerguide/lambda-support.html)
     * to manage your emails, you must
     * [verify the sender email address in Amazon SES](https://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-email-addresses.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-portal.html#cfn-iotsitewise-portal-notificationsenderemail)
     *
     * @param notificationSenderEmail The email address that sends alarm notifications.
     */
    public fun notificationSenderEmail(notificationSenderEmail: String) {
        cdkBuilder.notificationSenderEmail(notificationSenderEmail)
    }

    /**
     * The service to use to authenticate users to the portal. Choose from the following options:.
     * * `SSO` – The portal uses AWS IAM Identity Center (successor to AWS Single Sign-On) to
     *   authenticate users and manage user permissions. Before you can create a portal that uses
     *   IAM Identity Center , you must enable IAM Identity Center . For more information, see
     *   [Enabling IAM Identity Center](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-get-started.html#mon-gs-sso)
     *   in the *AWS IoT SiteWise User Guide* . This option is only available in AWS Regions other
     *   than the China Regions.
     * * `IAM` – The portal uses AWS Identity and Access Management ( IAM ) to authenticate users
     *   and manage user permissions.
     *
     * You can't change this value after you create a portal.
     *
     * Default: `SSO`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-portal.html#cfn-iotsitewise-portal-portalauthmode)
     *
     * @param portalAuthMode The service to use to authenticate users to the portal. Choose from the
     *   following options:.
     */
    public fun portalAuthMode(portalAuthMode: String) {
        cdkBuilder.portalAuthMode(portalAuthMode)
    }

    /**
     * The AWS administrator's contact email address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-portal.html#cfn-iotsitewise-portal-portalcontactemail)
     *
     * @param portalContactEmail The AWS administrator's contact email address.
     */
    public fun portalContactEmail(portalContactEmail: String) {
        cdkBuilder.portalContactEmail(portalContactEmail)
    }

    /**
     * A description for the portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-portal.html#cfn-iotsitewise-portal-portaldescription)
     *
     * @param portalDescription A description for the portal.
     */
    public fun portalDescription(portalDescription: String) {
        cdkBuilder.portalDescription(portalDescription)
    }

    /**
     * A friendly name for the portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-portal.html#cfn-iotsitewise-portal-portalname)
     *
     * @param portalName A friendly name for the portal.
     */
    public fun portalName(portalName: String) {
        cdkBuilder.portalName(portalName)
    }

    /**
     * The [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) of a
     * service role that allows the portal's users to access your AWS IoT SiteWise resources on your
     * behalf. For more information, see
     * [Using service roles for AWS IoT SiteWise Monitor](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html)
     * in the *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-portal.html#cfn-iotsitewise-portal-rolearn)
     *
     * @param roleArn The
     *   [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) of a
     *   service role that allows the portal's users to access your AWS IoT SiteWise resources on
     *   your behalf. For more information, see
     *   [Using service roles for AWS IoT SiteWise Monitor](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-service-role.html)
     *   in the *AWS IoT SiteWise User Guide* .
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * A list of key-value pairs that contain metadata for the portal.
     *
     * For more information, see
     * [Tagging your AWS IoT SiteWise resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html)
     * in the *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-portal.html#cfn-iotsitewise-portal-tags)
     *
     * @param tags A list of key-value pairs that contain metadata for the portal.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * A list of key-value pairs that contain metadata for the portal.
     *
     * For more information, see
     * [Tagging your AWS IoT SiteWise resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html)
     * in the *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-portal.html#cfn-iotsitewise-portal-tags)
     *
     * @param tags A list of key-value pairs that contain metadata for the portal.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnPortal {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
