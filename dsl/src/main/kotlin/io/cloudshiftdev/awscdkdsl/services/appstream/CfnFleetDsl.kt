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

package io.cloudshiftdev.awscdkdsl.services.appstream

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appstream.CfnFleet
import software.constructs.Construct

/**
 * The `AWS::AppStream::Fleet` resource creates a fleet for Amazon AppStream 2.0. A fleet consists
 * of streaming instances that run a specified image when using Always-On or On-Demand.
 *
 * Example:
 * ```
 * CfnFleet fleet = CfnFleet.Builder.create(this, "Fleet")
 * .instanceType("stream.standard.small")
 * .name("Fleet")
 * .computeCapacity(ComputeCapacityProperty.builder()
 * .desiredInstances(1)
 * .build())
 * .imageName("AppStream-AmazonLinux2-09-21-2022")
 * .build();
 * fleet.getCfnOptions().getCreationPolicy() = CfnCreationPolicy.builder()
 * .startFleet(true)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html)
 */
@CdkDslMarker
public class CfnFleetDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnFleet.Builder = CfnFleet.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _usbDeviceFilterStrings: MutableList<String> = mutableListOf()

    /**
     * The desired capacity for the fleet.
     *
     * This is not allowed for Elastic fleets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-computecapacity)
     *
     * @param computeCapacity The desired capacity for the fleet.
     */
    public fun computeCapacity(computeCapacity: IResolvable) {
        cdkBuilder.computeCapacity(computeCapacity)
    }

    /**
     * The desired capacity for the fleet.
     *
     * This is not allowed for Elastic fleets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-computecapacity)
     *
     * @param computeCapacity The desired capacity for the fleet.
     */
    public fun computeCapacity(computeCapacity: CfnFleet.ComputeCapacityProperty) {
        cdkBuilder.computeCapacity(computeCapacity)
    }

    /**
     * The description to display.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-description)
     *
     * @param description The description to display.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The amount of time that a streaming session remains active after users disconnect.
     *
     * If users try to reconnect to the streaming session after a disconnection or network
     * interruption within this time interval, they are connected to their previous session.
     * Otherwise, they are connected to a new session with a new streaming instance.
     *
     * Specify a value between 60 and 360000.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-disconnecttimeoutinseconds)
     *
     * @param disconnectTimeoutInSeconds The amount of time that a streaming session remains active
     *   after users disconnect.
     */
    public fun disconnectTimeoutInSeconds(disconnectTimeoutInSeconds: Number) {
        cdkBuilder.disconnectTimeoutInSeconds(disconnectTimeoutInSeconds)
    }

    /**
     * The fleet name to display.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-displayname)
     *
     * @param displayName The fleet name to display.
     */
    public fun displayName(displayName: String) {
        cdkBuilder.displayName(displayName)
    }

    /**
     * The name of the directory and organizational unit (OU) to use to join the fleet to a
     * Microsoft Active Directory domain.
     *
     * This is not allowed for Elastic fleets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-domainjoininfo)
     *
     * @param domainJoinInfo The name of the directory and organizational unit (OU) to use to join
     *   the fleet to a Microsoft Active Directory domain.
     */
    public fun domainJoinInfo(domainJoinInfo: IResolvable) {
        cdkBuilder.domainJoinInfo(domainJoinInfo)
    }

    /**
     * The name of the directory and organizational unit (OU) to use to join the fleet to a
     * Microsoft Active Directory domain.
     *
     * This is not allowed for Elastic fleets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-domainjoininfo)
     *
     * @param domainJoinInfo The name of the directory and organizational unit (OU) to use to join
     *   the fleet to a Microsoft Active Directory domain.
     */
    public fun domainJoinInfo(domainJoinInfo: CfnFleet.DomainJoinInfoProperty) {
        cdkBuilder.domainJoinInfo(domainJoinInfo)
    }

    /**
     * Enables or disables default internet access for the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-enabledefaultinternetaccess)
     *
     * @param enableDefaultInternetAccess Enables or disables default internet access for the fleet.
     */
    public fun enableDefaultInternetAccess(enableDefaultInternetAccess: Boolean) {
        cdkBuilder.enableDefaultInternetAccess(enableDefaultInternetAccess)
    }

    /**
     * Enables or disables default internet access for the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-enabledefaultinternetaccess)
     *
     * @param enableDefaultInternetAccess Enables or disables default internet access for the fleet.
     */
    public fun enableDefaultInternetAccess(enableDefaultInternetAccess: IResolvable) {
        cdkBuilder.enableDefaultInternetAccess(enableDefaultInternetAccess)
    }

    /**
     * The fleet type.
     * * **ALWAYS_ON** - Provides users with instant-on access to their apps. You are charged for
     *   all running instances in your fleet, even if no users are streaming apps.
     * * **ON_DEMAND** - Provide users with access to applications after they connect, which takes
     *   one to two minutes. You are charged for instance streaming when users are connected and a
     *   small hourly fee for instances that are not streaming apps.
     * * **ELASTIC** - The pool of streaming instances is managed by Amazon AppStream 2.0. When a
     *   user selects their application or desktop to launch, they will start streaming after the
     *   app block has been downloaded and mounted to a streaming instance.
     *
     * *Allowed Values* : `ALWAYS_ON` | `ELASTIC` | `ON_DEMAND`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-fleettype)
     *
     * @param fleetType The fleet type.
     */
    public fun fleetType(fleetType: String) {
        cdkBuilder.fleetType(fleetType)
    }

    /**
     * The ARN of the IAM role that is applied to the fleet.
     *
     * To assume a role, the fleet instance calls the AWS Security Token Service `AssumeRole` API
     * operation and passes the ARN of the role to use. The operation creates a new session with
     * temporary credentials. AppStream 2.0 retrieves the temporary credentials and creates the
     * *appstream_machine_role* credential profile on the instance.
     *
     * For more information, see
     * [Using an IAM Role to Grant Permissions to Applications and Scripts Running on AppStream 2.0 Streaming Instances](https://docs.aws.amazon.com/appstream2/latest/developerguide/using-iam-roles-to-grant-permissions-to-applications-scripts-streaming-instances.html)
     * in the *Amazon AppStream 2.0 Administration Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-iamrolearn)
     *
     * @param iamRoleArn The ARN of the IAM role that is applied to the fleet.
     */
    public fun iamRoleArn(iamRoleArn: String) {
        cdkBuilder.iamRoleArn(iamRoleArn)
    }

    /**
     * The amount of time that users can be idle (inactive) before they are disconnected from their
     * streaming session and the `DisconnectTimeoutInSeconds` time interval begins.
     *
     * Users are notified before they are disconnected due to inactivity. If they try to reconnect
     * to the streaming session before the time interval specified in `DisconnectTimeoutInSeconds`
     * elapses, they are connected to their previous session. Users are considered idle when they
     * stop providing keyboard or mouse input during their streaming session. File uploads and
     * downloads, audio in, audio out, and pixels changing do not qualify as user activity. If users
     * continue to be idle after the time interval in `IdleDisconnectTimeoutInSeconds` elapses, they
     * are disconnected.
     *
     * To prevent users from being disconnected due to inactivity, specify a value of 0. Otherwise,
     * specify a value between 60 and 36000.
     *
     * If you enable this feature, we recommend that you specify a value that corresponds exactly to
     * a whole number of minutes (for example, 60, 120, and 180). If you don't do this, the value is
     * rounded to the nearest minute. For example, if you specify a value of 70, users are
     * disconnected after 1 minute of inactivity. If you specify a value that is at the midpoint
     * between two different minutes, the value is rounded up. For example, if you specify a value
     * of 90, users are disconnected after 2 minutes of inactivity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-idledisconnecttimeoutinseconds)
     *
     * @param idleDisconnectTimeoutInSeconds The amount of time that users can be idle (inactive)
     *   before they are disconnected from their streaming session and the
     *   `DisconnectTimeoutInSeconds` time interval begins.
     */
    public fun idleDisconnectTimeoutInSeconds(idleDisconnectTimeoutInSeconds: Number) {
        cdkBuilder.idleDisconnectTimeoutInSeconds(idleDisconnectTimeoutInSeconds)
    }

    /**
     * The ARN of the public, private, or shared image to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-imagearn)
     *
     * @param imageArn The ARN of the public, private, or shared image to use.
     */
    public fun imageArn(imageArn: String) {
        cdkBuilder.imageArn(imageArn)
    }

    /**
     * The name of the image used to create the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-imagename)
     *
     * @param imageName The name of the image used to create the fleet.
     */
    public fun imageName(imageName: String) {
        cdkBuilder.imageName(imageName)
    }

    /**
     * The instance type to use when launching fleet instances. The following instance types are
     * available for non-Elastic fleets:.
     * * stream.standard.small
     * * stream.standard.medium
     * * stream.standard.large
     * * stream.compute.large
     * * stream.compute.xlarge
     * * stream.compute.2xlarge
     * * stream.compute.4xlarge
     * * stream.compute.8xlarge
     * * stream.memory.large
     * * stream.memory.xlarge
     * * stream.memory.2xlarge
     * * stream.memory.4xlarge
     * * stream.memory.8xlarge
     * * stream.memory.z1d.large
     * * stream.memory.z1d.xlarge
     * * stream.memory.z1d.2xlarge
     * * stream.memory.z1d.3xlarge
     * * stream.memory.z1d.6xlarge
     * * stream.memory.z1d.12xlarge
     * * stream.graphics-design.large
     * * stream.graphics-design.xlarge
     * * stream.graphics-design.2xlarge
     * * stream.graphics-design.4xlarge
     * * stream.graphics-desktop.2xlarge
     * * stream.graphics.g4dn.xlarge
     * * stream.graphics.g4dn.2xlarge
     * * stream.graphics.g4dn.4xlarge
     * * stream.graphics.g4dn.8xlarge
     * * stream.graphics.g4dn.12xlarge
     * * stream.graphics.g4dn.16xlarge
     * * stream.graphics-pro.4xlarge
     * * stream.graphics-pro.8xlarge
     * * stream.graphics-pro.16xlarge
     *
     * The following instance types are available for Elastic fleets:
     * * stream.standard.small
     * * stream.standard.medium
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-instancetype)
     *
     * @param instanceType The instance type to use when launching fleet instances. The following
     *   instance types are available for non-Elastic fleets:.
     */
    public fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
    }

    /**
     * The maximum number of concurrent sessions that can be run on an Elastic fleet.
     *
     * This setting is required for Elastic fleets, but is not used for other fleet types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-maxconcurrentsessions)
     *
     * @param maxConcurrentSessions The maximum number of concurrent sessions that can be run on an
     *   Elastic fleet.
     */
    public fun maxConcurrentSessions(maxConcurrentSessions: Number) {
        cdkBuilder.maxConcurrentSessions(maxConcurrentSessions)
    }

    /**
     * Max number of user sessions on an instance.
     *
     * This is applicable only for multi-session fleets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-maxsessionsperinstance)
     *
     * @param maxSessionsPerInstance Max number of user sessions on an instance.
     */
    public fun maxSessionsPerInstance(maxSessionsPerInstance: Number) {
        cdkBuilder.maxSessionsPerInstance(maxSessionsPerInstance)
    }

    /**
     * The maximum amount of time that a streaming session can remain active, in seconds.
     *
     * If users are still connected to a streaming instance five minutes before this limit is
     * reached, they are prompted to save any open documents before being disconnected. After this
     * time elapses, the instance is terminated and replaced by a new instance.
     *
     * Specify a value between 600 and 432000.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-maxuserdurationinseconds)
     *
     * @param maxUserDurationInSeconds The maximum amount of time that a streaming session can
     *   remain active, in seconds.
     */
    public fun maxUserDurationInSeconds(maxUserDurationInSeconds: Number) {
        cdkBuilder.maxUserDurationInSeconds(maxUserDurationInSeconds)
    }

    /**
     * A unique name for the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-name)
     *
     * @param name A unique name for the fleet.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The platform of the fleet.
     *
     * Platform is a required setting for Elastic fleets, and is not used for other fleet types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-platform)
     *
     * @param platform The platform of the fleet.
     */
    public fun platform(platform: String) {
        cdkBuilder.platform(platform)
    }

    /**
     * The S3 location of the session scripts configuration zip file.
     *
     * This only applies to Elastic fleets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-sessionscripts3location)
     *
     * @param sessionScriptS3Location The S3 location of the session scripts configuration zip file.
     */
    public fun sessionScriptS3Location(sessionScriptS3Location: IResolvable) {
        cdkBuilder.sessionScriptS3Location(sessionScriptS3Location)
    }

    /**
     * The S3 location of the session scripts configuration zip file.
     *
     * This only applies to Elastic fleets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-sessionscripts3location)
     *
     * @param sessionScriptS3Location The S3 location of the session scripts configuration zip file.
     */
    public fun sessionScriptS3Location(sessionScriptS3Location: CfnFleet.S3LocationProperty) {
        cdkBuilder.sessionScriptS3Location(sessionScriptS3Location)
    }

    /**
     * The AppStream 2.0 view that is displayed to your users when they stream from the fleet. When
     * `APP` is specified, only the windows of applications opened by users display. When `DESKTOP`
     * is specified, the standard desktop that is provided by the operating system displays.
     *
     * The default value is `APP` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-streamview)
     *
     * @param streamView The AppStream 2.0 view that is displayed to your users when they stream
     *   from the fleet. When `APP` is specified, only the windows of applications opened by users
     *   display. When `DESKTOP` is specified, the standard desktop that is provided by the
     *   operating system displays.
     */
    public fun streamView(streamView: String) {
        cdkBuilder.streamView(streamView)
    }

    /**
     * An array of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-tags)
     *
     * @param tags An array of key-value pairs.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An array of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-tags)
     *
     * @param tags An array of key-value pairs.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The USB device filter strings that specify which USB devices a user can redirect to the fleet
     * streaming session, when using the Windows native client.
     *
     * This is allowed but not required for Elastic fleets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-usbdevicefilterstrings)
     *
     * @param usbDeviceFilterStrings The USB device filter strings that specify which USB devices a
     *   user can redirect to the fleet streaming session, when using the Windows native client.
     */
    public fun usbDeviceFilterStrings(vararg usbDeviceFilterStrings: String) {
        _usbDeviceFilterStrings.addAll(listOf(*usbDeviceFilterStrings))
    }

    /**
     * The USB device filter strings that specify which USB devices a user can redirect to the fleet
     * streaming session, when using the Windows native client.
     *
     * This is allowed but not required for Elastic fleets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-usbdevicefilterstrings)
     *
     * @param usbDeviceFilterStrings The USB device filter strings that specify which USB devices a
     *   user can redirect to the fleet streaming session, when using the Windows native client.
     */
    public fun usbDeviceFilterStrings(usbDeviceFilterStrings: Collection<String>) {
        _usbDeviceFilterStrings.addAll(usbDeviceFilterStrings)
    }

    /**
     * The VPC configuration for the fleet.
     *
     * This is required for Elastic fleets, but not required for other fleet types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-vpcconfig)
     *
     * @param vpcConfig The VPC configuration for the fleet.
     */
    public fun vpcConfig(vpcConfig: IResolvable) {
        cdkBuilder.vpcConfig(vpcConfig)
    }

    /**
     * The VPC configuration for the fleet.
     *
     * This is required for Elastic fleets, but not required for other fleet types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-vpcconfig)
     *
     * @param vpcConfig The VPC configuration for the fleet.
     */
    public fun vpcConfig(vpcConfig: CfnFleet.VpcConfigProperty) {
        cdkBuilder.vpcConfig(vpcConfig)
    }

    public fun build(): CfnFleet {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_usbDeviceFilterStrings.isNotEmpty())
            cdkBuilder.usbDeviceFilterStrings(_usbDeviceFilterStrings)
        return cdkBuilder.build()
    }
}
