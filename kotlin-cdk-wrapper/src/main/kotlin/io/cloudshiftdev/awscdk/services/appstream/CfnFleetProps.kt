@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appstream

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnFleet`.
 *
 * Example:
 *
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
public interface CfnFleetProps {
  /**
   * The desired capacity for the fleet.
   *
   * This is not allowed for Elastic fleets.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-computecapacity)
   */
  public fun computeCapacity(): Any? = unwrap(this).getComputeCapacity()

  /**
   * The description to display.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The amount of time that a streaming session remains active after users disconnect.
   *
   * If users try to reconnect to the streaming session after a disconnection or network
   * interruption within this time interval, they are connected to their previous session. Otherwise,
   * they are connected to a new session with a new streaming instance.
   *
   * Specify a value between 60 and 36000.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-disconnecttimeoutinseconds)
   */
  public fun disconnectTimeoutInSeconds(): Number? = unwrap(this).getDisconnectTimeoutInSeconds()

  /**
   * The fleet name to display.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-displayname)
   */
  public fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * The name of the directory and organizational unit (OU) to use to join the fleet to a Microsoft
   * Active Directory domain.
   *
   * This is not allowed for Elastic fleets.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-domainjoininfo)
   */
  public fun domainJoinInfo(): Any? = unwrap(this).getDomainJoinInfo()

  /**
   * Enables or disables default internet access for the fleet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-enabledefaultinternetaccess)
   */
  public fun enableDefaultInternetAccess(): Any? = unwrap(this).getEnableDefaultInternetAccess()

  /**
   * The fleet type.
   *
   * * **ALWAYS_ON** - Provides users with instant-on access to their apps. You are charged for all
   * running instances in your fleet, even if no users are streaming apps.
   * * **ON_DEMAND** - Provide users with access to applications after they connect, which takes one
   * to two minutes. You are charged for instance streaming when users are connected and a small hourly
   * fee for instances that are not streaming apps.
   * * **ELASTIC** - The pool of streaming instances is managed by Amazon AppStream 2.0. When a user
   * selects their application or desktop to launch, they will start streaming after the app block has
   * been downloaded and mounted to a streaming instance.
   *
   * *Allowed Values* : `ALWAYS_ON` | `ELASTIC` | `ON_DEMAND`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-fleettype)
   */
  public fun fleetType(): String? = unwrap(this).getFleetType()

  /**
   * The ARN of the IAM role that is applied to the fleet.
   *
   * To assume a role, the fleet instance calls the AWS Security Token Service `AssumeRole` API
   * operation and passes the ARN of the role to use. The operation creates a new session with
   * temporary credentials. AppStream 2.0 retrieves the temporary credentials and creates the
   * *appstream_machine_role* credential profile on the instance.
   *
   * For more information, see [Using an IAM Role to Grant Permissions to Applications and Scripts
   * Running on AppStream 2.0 Streaming
   * Instances](https://docs.aws.amazon.com/appstream2/latest/developerguide/using-iam-roles-to-grant-permissions-to-applications-scripts-streaming-instances.html)
   * in the *Amazon AppStream 2.0 Administration Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-iamrolearn)
   */
  public fun iamRoleArn(): String? = unwrap(this).getIamRoleArn()

  /**
   * The amount of time that users can be idle (inactive) before they are disconnected from their
   * streaming session and the `DisconnectTimeoutInSeconds` time interval begins.
   *
   * Users are notified before they are disconnected due to inactivity. If they try to reconnect to
   * the streaming session before the time interval specified in `DisconnectTimeoutInSeconds` elapses,
   * they are connected to their previous session. Users are considered idle when they stop providing
   * keyboard or mouse input during their streaming session. File uploads and downloads, audio in,
   * audio out, and pixels changing do not qualify as user activity. If users continue to be idle after
   * the time interval in `IdleDisconnectTimeoutInSeconds` elapses, they are disconnected.
   *
   * To prevent users from being disconnected due to inactivity, specify a value of 0. Otherwise,
   * specify a value between 60 and 36000.
   *
   * If you enable this feature, we recommend that you specify a value that corresponds exactly to a
   * whole number of minutes (for example, 60, 120, and 180). If you don't do this, the value is
   * rounded to the nearest minute. For example, if you specify a value of 70, users are disconnected
   * after 1 minute of inactivity. If you specify a value that is at the midpoint between two different
   * minutes, the value is rounded up. For example, if you specify a value of 90, users are
   * disconnected after 2 minutes of inactivity.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-idledisconnecttimeoutinseconds)
   */
  public fun idleDisconnectTimeoutInSeconds(): Number? =
      unwrap(this).getIdleDisconnectTimeoutInSeconds()

  /**
   * The ARN of the public, private, or shared image to use.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-imagearn)
   */
  public fun imageArn(): String? = unwrap(this).getImageArn()

  /**
   * The name of the image used to create the fleet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-imagename)
   */
  public fun imageName(): String? = unwrap(this).getImageName()

  /**
   * The instance type to use when launching fleet instances. The following instance types are
   * available for non-Elastic fleets:.
   *
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
   *
   * * stream.standard.small
   * * stream.standard.medium
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-instancetype)
   */
  public fun instanceType(): String

  /**
   * The maximum number of concurrent sessions that can be run on an Elastic fleet.
   *
   * This setting is required for Elastic fleets, but is not used for other fleet types.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-maxconcurrentsessions)
   */
  public fun maxConcurrentSessions(): Number? = unwrap(this).getMaxConcurrentSessions()

  /**
   * Max number of user sessions on an instance.
   *
   * This is applicable only for multi-session fleets.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-maxsessionsperinstance)
   */
  public fun maxSessionsPerInstance(): Number? = unwrap(this).getMaxSessionsPerInstance()

  /**
   * The maximum amount of time that a streaming session can remain active, in seconds.
   *
   * If users are still connected to a streaming instance five minutes before this limit is reached,
   * they are prompted to save any open documents before being disconnected. After this time elapses,
   * the instance is terminated and replaced by a new instance.
   *
   * Specify a value between 600 and 432000.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-maxuserdurationinseconds)
   */
  public fun maxUserDurationInSeconds(): Number? = unwrap(this).getMaxUserDurationInSeconds()

  /**
   * A unique name for the fleet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-name)
   */
  public fun name(): String

  /**
   * The platform of the fleet.
   *
   * Platform is a required setting for Elastic fleets, and is not used for other fleet types.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-platform)
   */
  public fun platform(): String? = unwrap(this).getPlatform()

  /**
   * The S3 location of the session scripts configuration zip file.
   *
   * This only applies to Elastic fleets.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-sessionscripts3location)
   */
  public fun sessionScriptS3Location(): Any? = unwrap(this).getSessionScriptS3Location()

  /**
   * The AppStream 2.0 view that is displayed to your users when they stream from the fleet. When
   * `APP` is specified, only the windows of applications opened by users display. When `DESKTOP` is
   * specified, the standard desktop that is provided by the operating system displays.
   *
   * The default value is `APP` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-streamview)
   */
  public fun streamView(): String? = unwrap(this).getStreamView()

  /**
   * An array of key-value pairs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The USB device filter strings that specify which USB devices a user can redirect to the fleet
   * streaming session, when using the Windows native client.
   *
   * This is allowed but not required for Elastic fleets.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-usbdevicefilterstrings)
   */
  public fun usbDeviceFilterStrings(): List<String> = unwrap(this).getUsbDeviceFilterStrings() ?:
      emptyList()

  /**
   * The VPC configuration for the fleet.
   *
   * This is required for Elastic fleets, but not required for other fleet types.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-vpcconfig)
   */
  public fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

  /**
   * A builder for [CfnFleetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param computeCapacity The desired capacity for the fleet.
     * This is not allowed for Elastic fleets.
     */
    public fun computeCapacity(computeCapacity: IResolvable)

    /**
     * @param computeCapacity The desired capacity for the fleet.
     * This is not allowed for Elastic fleets.
     */
    public fun computeCapacity(computeCapacity: CfnFleet.ComputeCapacityProperty)

    /**
     * @param computeCapacity The desired capacity for the fleet.
     * This is not allowed for Elastic fleets.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("73e9cdbabab83e85e1da25daa1a039334828818ddcfa6a02eaeda85ad4cb80da")
    public fun computeCapacity(computeCapacity: CfnFleet.ComputeCapacityProperty.Builder.() -> Unit)

    /**
     * @param description The description to display.
     */
    public fun description(description: String)

    /**
     * @param disconnectTimeoutInSeconds The amount of time that a streaming session remains active
     * after users disconnect.
     * If users try to reconnect to the streaming session after a disconnection or network
     * interruption within this time interval, they are connected to their previous session. Otherwise,
     * they are connected to a new session with a new streaming instance.
     *
     * Specify a value between 60 and 36000.
     */
    public fun disconnectTimeoutInSeconds(disconnectTimeoutInSeconds: Number)

    /**
     * @param displayName The fleet name to display.
     */
    public fun displayName(displayName: String)

    /**
     * @param domainJoinInfo The name of the directory and organizational unit (OU) to use to join
     * the fleet to a Microsoft Active Directory domain.
     * This is not allowed for Elastic fleets.
     */
    public fun domainJoinInfo(domainJoinInfo: IResolvable)

    /**
     * @param domainJoinInfo The name of the directory and organizational unit (OU) to use to join
     * the fleet to a Microsoft Active Directory domain.
     * This is not allowed for Elastic fleets.
     */
    public fun domainJoinInfo(domainJoinInfo: CfnFleet.DomainJoinInfoProperty)

    /**
     * @param domainJoinInfo The name of the directory and organizational unit (OU) to use to join
     * the fleet to a Microsoft Active Directory domain.
     * This is not allowed for Elastic fleets.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("308a5d79b8e903a24a9de1981c9ebfba808bd63632efd009682e5e28a601db69")
    public fun domainJoinInfo(domainJoinInfo: CfnFleet.DomainJoinInfoProperty.Builder.() -> Unit)

    /**
     * @param enableDefaultInternetAccess Enables or disables default internet access for the fleet.
     */
    public fun enableDefaultInternetAccess(enableDefaultInternetAccess: Boolean)

    /**
     * @param enableDefaultInternetAccess Enables or disables default internet access for the fleet.
     */
    public fun enableDefaultInternetAccess(enableDefaultInternetAccess: IResolvable)

    /**
     * @param fleetType The fleet type.
     * * **ALWAYS_ON** - Provides users with instant-on access to their apps. You are charged for
     * all running instances in your fleet, even if no users are streaming apps.
     * * **ON_DEMAND** - Provide users with access to applications after they connect, which takes
     * one to two minutes. You are charged for instance streaming when users are connected and a small
     * hourly fee for instances that are not streaming apps.
     * * **ELASTIC** - The pool of streaming instances is managed by Amazon AppStream 2.0. When a
     * user selects their application or desktop to launch, they will start streaming after the app
     * block has been downloaded and mounted to a streaming instance.
     *
     * *Allowed Values* : `ALWAYS_ON` | `ELASTIC` | `ON_DEMAND`
     */
    public fun fleetType(fleetType: String)

    /**
     * @param iamRoleArn The ARN of the IAM role that is applied to the fleet.
     * To assume a role, the fleet instance calls the AWS Security Token Service `AssumeRole` API
     * operation and passes the ARN of the role to use. The operation creates a new session with
     * temporary credentials. AppStream 2.0 retrieves the temporary credentials and creates the
     * *appstream_machine_role* credential profile on the instance.
     *
     * For more information, see [Using an IAM Role to Grant Permissions to Applications and Scripts
     * Running on AppStream 2.0 Streaming
     * Instances](https://docs.aws.amazon.com/appstream2/latest/developerguide/using-iam-roles-to-grant-permissions-to-applications-scripts-streaming-instances.html)
     * in the *Amazon AppStream 2.0 Administration Guide* .
     */
    public fun iamRoleArn(iamRoleArn: String)

    /**
     * @param idleDisconnectTimeoutInSeconds The amount of time that users can be idle (inactive)
     * before they are disconnected from their streaming session and the `DisconnectTimeoutInSeconds`
     * time interval begins.
     * Users are notified before they are disconnected due to inactivity. If they try to reconnect
     * to the streaming session before the time interval specified in `DisconnectTimeoutInSeconds`
     * elapses, they are connected to their previous session. Users are considered idle when they stop
     * providing keyboard or mouse input during their streaming session. File uploads and downloads,
     * audio in, audio out, and pixels changing do not qualify as user activity. If users continue to
     * be idle after the time interval in `IdleDisconnectTimeoutInSeconds` elapses, they are
     * disconnected.
     *
     * To prevent users from being disconnected due to inactivity, specify a value of 0. Otherwise,
     * specify a value between 60 and 36000.
     *
     * If you enable this feature, we recommend that you specify a value that corresponds exactly to
     * a whole number of minutes (for example, 60, 120, and 180). If you don't do this, the value is
     * rounded to the nearest minute. For example, if you specify a value of 70, users are disconnected
     * after 1 minute of inactivity. If you specify a value that is at the midpoint between two
     * different minutes, the value is rounded up. For example, if you specify a value of 90, users are
     * disconnected after 2 minutes of inactivity.
     */
    public fun idleDisconnectTimeoutInSeconds(idleDisconnectTimeoutInSeconds: Number)

    /**
     * @param imageArn The ARN of the public, private, or shared image to use.
     */
    public fun imageArn(imageArn: String)

    /**
     * @param imageName The name of the image used to create the fleet.
     */
    public fun imageName(imageName: String)

    /**
     * @param instanceType The instance type to use when launching fleet instances. The following
     * instance types are available for non-Elastic fleets:. 
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
     *
     * * stream.standard.small
     * * stream.standard.medium
     */
    public fun instanceType(instanceType: String)

    /**
     * @param maxConcurrentSessions The maximum number of concurrent sessions that can be run on an
     * Elastic fleet.
     * This setting is required for Elastic fleets, but is not used for other fleet types.
     */
    public fun maxConcurrentSessions(maxConcurrentSessions: Number)

    /**
     * @param maxSessionsPerInstance Max number of user sessions on an instance.
     * This is applicable only for multi-session fleets.
     */
    public fun maxSessionsPerInstance(maxSessionsPerInstance: Number)

    /**
     * @param maxUserDurationInSeconds The maximum amount of time that a streaming session can
     * remain active, in seconds.
     * If users are still connected to a streaming instance five minutes before this limit is
     * reached, they are prompted to save any open documents before being disconnected. After this time
     * elapses, the instance is terminated and replaced by a new instance.
     *
     * Specify a value between 600 and 432000.
     */
    public fun maxUserDurationInSeconds(maxUserDurationInSeconds: Number)

    /**
     * @param name A unique name for the fleet. 
     */
    public fun name(name: String)

    /**
     * @param platform The platform of the fleet.
     * Platform is a required setting for Elastic fleets, and is not used for other fleet types.
     */
    public fun platform(platform: String)

    /**
     * @param sessionScriptS3Location The S3 location of the session scripts configuration zip file.
     * This only applies to Elastic fleets.
     */
    public fun sessionScriptS3Location(sessionScriptS3Location: IResolvable)

    /**
     * @param sessionScriptS3Location The S3 location of the session scripts configuration zip file.
     * This only applies to Elastic fleets.
     */
    public fun sessionScriptS3Location(sessionScriptS3Location: CfnFleet.S3LocationProperty)

    /**
     * @param sessionScriptS3Location The S3 location of the session scripts configuration zip file.
     * This only applies to Elastic fleets.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad395e1e53e659550a6645eab8bfd307a269d1b76ba055229d82e95afca3e34d")
    public
        fun sessionScriptS3Location(sessionScriptS3Location: CfnFleet.S3LocationProperty.Builder.() -> Unit)

    /**
     * @param streamView The AppStream 2.0 view that is displayed to your users when they stream
     * from the fleet. When `APP` is specified, only the windows of applications opened by users
     * display. When `DESKTOP` is specified, the standard desktop that is provided by the operating
     * system displays.
     * The default value is `APP` .
     */
    public fun streamView(streamView: String)

    /**
     * @param tags An array of key-value pairs.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param usbDeviceFilterStrings The USB device filter strings that specify which USB devices a
     * user can redirect to the fleet streaming session, when using the Windows native client.
     * This is allowed but not required for Elastic fleets.
     */
    public fun usbDeviceFilterStrings(usbDeviceFilterStrings: List<String>)

    /**
     * @param usbDeviceFilterStrings The USB device filter strings that specify which USB devices a
     * user can redirect to the fleet streaming session, when using the Windows native client.
     * This is allowed but not required for Elastic fleets.
     */
    public fun usbDeviceFilterStrings(vararg usbDeviceFilterStrings: String)

    /**
     * @param vpcConfig The VPC configuration for the fleet.
     * This is required for Elastic fleets, but not required for other fleet types.
     */
    public fun vpcConfig(vpcConfig: IResolvable)

    /**
     * @param vpcConfig The VPC configuration for the fleet.
     * This is required for Elastic fleets, but not required for other fleet types.
     */
    public fun vpcConfig(vpcConfig: CfnFleet.VpcConfigProperty)

    /**
     * @param vpcConfig The VPC configuration for the fleet.
     * This is required for Elastic fleets, but not required for other fleet types.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3ab49971d1d1fc25990b8996f87906c689182b6a229ba0e8e9ff08455a1854f2")
    public fun vpcConfig(vpcConfig: CfnFleet.VpcConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appstream.CfnFleetProps.Builder =
        software.amazon.awscdk.services.appstream.CfnFleetProps.builder()

    /**
     * @param computeCapacity The desired capacity for the fleet.
     * This is not allowed for Elastic fleets.
     */
    override fun computeCapacity(computeCapacity: IResolvable) {
      cdkBuilder.computeCapacity(computeCapacity.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param computeCapacity The desired capacity for the fleet.
     * This is not allowed for Elastic fleets.
     */
    override fun computeCapacity(computeCapacity: CfnFleet.ComputeCapacityProperty) {
      cdkBuilder.computeCapacity(computeCapacity.let(CfnFleet.ComputeCapacityProperty.Companion::unwrap))
    }

    /**
     * @param computeCapacity The desired capacity for the fleet.
     * This is not allowed for Elastic fleets.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("73e9cdbabab83e85e1da25daa1a039334828818ddcfa6a02eaeda85ad4cb80da")
    override
        fun computeCapacity(computeCapacity: CfnFleet.ComputeCapacityProperty.Builder.() -> Unit):
        Unit = computeCapacity(CfnFleet.ComputeCapacityProperty(computeCapacity))

    /**
     * @param description The description to display.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param disconnectTimeoutInSeconds The amount of time that a streaming session remains active
     * after users disconnect.
     * If users try to reconnect to the streaming session after a disconnection or network
     * interruption within this time interval, they are connected to their previous session. Otherwise,
     * they are connected to a new session with a new streaming instance.
     *
     * Specify a value between 60 and 36000.
     */
    override fun disconnectTimeoutInSeconds(disconnectTimeoutInSeconds: Number) {
      cdkBuilder.disconnectTimeoutInSeconds(disconnectTimeoutInSeconds)
    }

    /**
     * @param displayName The fleet name to display.
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * @param domainJoinInfo The name of the directory and organizational unit (OU) to use to join
     * the fleet to a Microsoft Active Directory domain.
     * This is not allowed for Elastic fleets.
     */
    override fun domainJoinInfo(domainJoinInfo: IResolvable) {
      cdkBuilder.domainJoinInfo(domainJoinInfo.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param domainJoinInfo The name of the directory and organizational unit (OU) to use to join
     * the fleet to a Microsoft Active Directory domain.
     * This is not allowed for Elastic fleets.
     */
    override fun domainJoinInfo(domainJoinInfo: CfnFleet.DomainJoinInfoProperty) {
      cdkBuilder.domainJoinInfo(domainJoinInfo.let(CfnFleet.DomainJoinInfoProperty.Companion::unwrap))
    }

    /**
     * @param domainJoinInfo The name of the directory and organizational unit (OU) to use to join
     * the fleet to a Microsoft Active Directory domain.
     * This is not allowed for Elastic fleets.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("308a5d79b8e903a24a9de1981c9ebfba808bd63632efd009682e5e28a601db69")
    override fun domainJoinInfo(domainJoinInfo: CfnFleet.DomainJoinInfoProperty.Builder.() -> Unit):
        Unit = domainJoinInfo(CfnFleet.DomainJoinInfoProperty(domainJoinInfo))

    /**
     * @param enableDefaultInternetAccess Enables or disables default internet access for the fleet.
     */
    override fun enableDefaultInternetAccess(enableDefaultInternetAccess: Boolean) {
      cdkBuilder.enableDefaultInternetAccess(enableDefaultInternetAccess)
    }

    /**
     * @param enableDefaultInternetAccess Enables or disables default internet access for the fleet.
     */
    override fun enableDefaultInternetAccess(enableDefaultInternetAccess: IResolvable) {
      cdkBuilder.enableDefaultInternetAccess(enableDefaultInternetAccess.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param fleetType The fleet type.
     * * **ALWAYS_ON** - Provides users with instant-on access to their apps. You are charged for
     * all running instances in your fleet, even if no users are streaming apps.
     * * **ON_DEMAND** - Provide users with access to applications after they connect, which takes
     * one to two minutes. You are charged for instance streaming when users are connected and a small
     * hourly fee for instances that are not streaming apps.
     * * **ELASTIC** - The pool of streaming instances is managed by Amazon AppStream 2.0. When a
     * user selects their application or desktop to launch, they will start streaming after the app
     * block has been downloaded and mounted to a streaming instance.
     *
     * *Allowed Values* : `ALWAYS_ON` | `ELASTIC` | `ON_DEMAND`
     */
    override fun fleetType(fleetType: String) {
      cdkBuilder.fleetType(fleetType)
    }

    /**
     * @param iamRoleArn The ARN of the IAM role that is applied to the fleet.
     * To assume a role, the fleet instance calls the AWS Security Token Service `AssumeRole` API
     * operation and passes the ARN of the role to use. The operation creates a new session with
     * temporary credentials. AppStream 2.0 retrieves the temporary credentials and creates the
     * *appstream_machine_role* credential profile on the instance.
     *
     * For more information, see [Using an IAM Role to Grant Permissions to Applications and Scripts
     * Running on AppStream 2.0 Streaming
     * Instances](https://docs.aws.amazon.com/appstream2/latest/developerguide/using-iam-roles-to-grant-permissions-to-applications-scripts-streaming-instances.html)
     * in the *Amazon AppStream 2.0 Administration Guide* .
     */
    override fun iamRoleArn(iamRoleArn: String) {
      cdkBuilder.iamRoleArn(iamRoleArn)
    }

    /**
     * @param idleDisconnectTimeoutInSeconds The amount of time that users can be idle (inactive)
     * before they are disconnected from their streaming session and the `DisconnectTimeoutInSeconds`
     * time interval begins.
     * Users are notified before they are disconnected due to inactivity. If they try to reconnect
     * to the streaming session before the time interval specified in `DisconnectTimeoutInSeconds`
     * elapses, they are connected to their previous session. Users are considered idle when they stop
     * providing keyboard or mouse input during their streaming session. File uploads and downloads,
     * audio in, audio out, and pixels changing do not qualify as user activity. If users continue to
     * be idle after the time interval in `IdleDisconnectTimeoutInSeconds` elapses, they are
     * disconnected.
     *
     * To prevent users from being disconnected due to inactivity, specify a value of 0. Otherwise,
     * specify a value between 60 and 36000.
     *
     * If you enable this feature, we recommend that you specify a value that corresponds exactly to
     * a whole number of minutes (for example, 60, 120, and 180). If you don't do this, the value is
     * rounded to the nearest minute. For example, if you specify a value of 70, users are disconnected
     * after 1 minute of inactivity. If you specify a value that is at the midpoint between two
     * different minutes, the value is rounded up. For example, if you specify a value of 90, users are
     * disconnected after 2 minutes of inactivity.
     */
    override fun idleDisconnectTimeoutInSeconds(idleDisconnectTimeoutInSeconds: Number) {
      cdkBuilder.idleDisconnectTimeoutInSeconds(idleDisconnectTimeoutInSeconds)
    }

    /**
     * @param imageArn The ARN of the public, private, or shared image to use.
     */
    override fun imageArn(imageArn: String) {
      cdkBuilder.imageArn(imageArn)
    }

    /**
     * @param imageName The name of the image used to create the fleet.
     */
    override fun imageName(imageName: String) {
      cdkBuilder.imageName(imageName)
    }

    /**
     * @param instanceType The instance type to use when launching fleet instances. The following
     * instance types are available for non-Elastic fleets:. 
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
     *
     * * stream.standard.small
     * * stream.standard.medium
     */
    override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    /**
     * @param maxConcurrentSessions The maximum number of concurrent sessions that can be run on an
     * Elastic fleet.
     * This setting is required for Elastic fleets, but is not used for other fleet types.
     */
    override fun maxConcurrentSessions(maxConcurrentSessions: Number) {
      cdkBuilder.maxConcurrentSessions(maxConcurrentSessions)
    }

    /**
     * @param maxSessionsPerInstance Max number of user sessions on an instance.
     * This is applicable only for multi-session fleets.
     */
    override fun maxSessionsPerInstance(maxSessionsPerInstance: Number) {
      cdkBuilder.maxSessionsPerInstance(maxSessionsPerInstance)
    }

    /**
     * @param maxUserDurationInSeconds The maximum amount of time that a streaming session can
     * remain active, in seconds.
     * If users are still connected to a streaming instance five minutes before this limit is
     * reached, they are prompted to save any open documents before being disconnected. After this time
     * elapses, the instance is terminated and replaced by a new instance.
     *
     * Specify a value between 600 and 432000.
     */
    override fun maxUserDurationInSeconds(maxUserDurationInSeconds: Number) {
      cdkBuilder.maxUserDurationInSeconds(maxUserDurationInSeconds)
    }

    /**
     * @param name A unique name for the fleet. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param platform The platform of the fleet.
     * Platform is a required setting for Elastic fleets, and is not used for other fleet types.
     */
    override fun platform(platform: String) {
      cdkBuilder.platform(platform)
    }

    /**
     * @param sessionScriptS3Location The S3 location of the session scripts configuration zip file.
     * This only applies to Elastic fleets.
     */
    override fun sessionScriptS3Location(sessionScriptS3Location: IResolvable) {
      cdkBuilder.sessionScriptS3Location(sessionScriptS3Location.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param sessionScriptS3Location The S3 location of the session scripts configuration zip file.
     * This only applies to Elastic fleets.
     */
    override fun sessionScriptS3Location(sessionScriptS3Location: CfnFleet.S3LocationProperty) {
      cdkBuilder.sessionScriptS3Location(sessionScriptS3Location.let(CfnFleet.S3LocationProperty.Companion::unwrap))
    }

    /**
     * @param sessionScriptS3Location The S3 location of the session scripts configuration zip file.
     * This only applies to Elastic fleets.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad395e1e53e659550a6645eab8bfd307a269d1b76ba055229d82e95afca3e34d")
    override
        fun sessionScriptS3Location(sessionScriptS3Location: CfnFleet.S3LocationProperty.Builder.() -> Unit):
        Unit = sessionScriptS3Location(CfnFleet.S3LocationProperty(sessionScriptS3Location))

    /**
     * @param streamView The AppStream 2.0 view that is displayed to your users when they stream
     * from the fleet. When `APP` is specified, only the windows of applications opened by users
     * display. When `DESKTOP` is specified, the standard desktop that is provided by the operating
     * system displays.
     * The default value is `APP` .
     */
    override fun streamView(streamView: String) {
      cdkBuilder.streamView(streamView)
    }

    /**
     * @param tags An array of key-value pairs.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of key-value pairs.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param usbDeviceFilterStrings The USB device filter strings that specify which USB devices a
     * user can redirect to the fleet streaming session, when using the Windows native client.
     * This is allowed but not required for Elastic fleets.
     */
    override fun usbDeviceFilterStrings(usbDeviceFilterStrings: List<String>) {
      cdkBuilder.usbDeviceFilterStrings(usbDeviceFilterStrings)
    }

    /**
     * @param usbDeviceFilterStrings The USB device filter strings that specify which USB devices a
     * user can redirect to the fleet streaming session, when using the Windows native client.
     * This is allowed but not required for Elastic fleets.
     */
    override fun usbDeviceFilterStrings(vararg usbDeviceFilterStrings: String): Unit =
        usbDeviceFilterStrings(usbDeviceFilterStrings.toList())

    /**
     * @param vpcConfig The VPC configuration for the fleet.
     * This is required for Elastic fleets, but not required for other fleet types.
     */
    override fun vpcConfig(vpcConfig: IResolvable) {
      cdkBuilder.vpcConfig(vpcConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param vpcConfig The VPC configuration for the fleet.
     * This is required for Elastic fleets, but not required for other fleet types.
     */
    override fun vpcConfig(vpcConfig: CfnFleet.VpcConfigProperty) {
      cdkBuilder.vpcConfig(vpcConfig.let(CfnFleet.VpcConfigProperty.Companion::unwrap))
    }

    /**
     * @param vpcConfig The VPC configuration for the fleet.
     * This is required for Elastic fleets, but not required for other fleet types.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3ab49971d1d1fc25990b8996f87906c689182b6a229ba0e8e9ff08455a1854f2")
    override fun vpcConfig(vpcConfig: CfnFleet.VpcConfigProperty.Builder.() -> Unit): Unit =
        vpcConfig(CfnFleet.VpcConfigProperty(vpcConfig))

    public fun build(): software.amazon.awscdk.services.appstream.CfnFleetProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appstream.CfnFleetProps,
  ) : CdkObject(cdkObject),
      CfnFleetProps {
    /**
     * The desired capacity for the fleet.
     *
     * This is not allowed for Elastic fleets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-computecapacity)
     */
    override fun computeCapacity(): Any? = unwrap(this).getComputeCapacity()

    /**
     * The description to display.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The amount of time that a streaming session remains active after users disconnect.
     *
     * If users try to reconnect to the streaming session after a disconnection or network
     * interruption within this time interval, they are connected to their previous session. Otherwise,
     * they are connected to a new session with a new streaming instance.
     *
     * Specify a value between 60 and 36000.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-disconnecttimeoutinseconds)
     */
    override fun disconnectTimeoutInSeconds(): Number? =
        unwrap(this).getDisconnectTimeoutInSeconds()

    /**
     * The fleet name to display.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-displayname)
     */
    override fun displayName(): String? = unwrap(this).getDisplayName()

    /**
     * The name of the directory and organizational unit (OU) to use to join the fleet to a
     * Microsoft Active Directory domain.
     *
     * This is not allowed for Elastic fleets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-domainjoininfo)
     */
    override fun domainJoinInfo(): Any? = unwrap(this).getDomainJoinInfo()

    /**
     * Enables or disables default internet access for the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-enabledefaultinternetaccess)
     */
    override fun enableDefaultInternetAccess(): Any? = unwrap(this).getEnableDefaultInternetAccess()

    /**
     * The fleet type.
     *
     * * **ALWAYS_ON** - Provides users with instant-on access to their apps. You are charged for
     * all running instances in your fleet, even if no users are streaming apps.
     * * **ON_DEMAND** - Provide users with access to applications after they connect, which takes
     * one to two minutes. You are charged for instance streaming when users are connected and a small
     * hourly fee for instances that are not streaming apps.
     * * **ELASTIC** - The pool of streaming instances is managed by Amazon AppStream 2.0. When a
     * user selects their application or desktop to launch, they will start streaming after the app
     * block has been downloaded and mounted to a streaming instance.
     *
     * *Allowed Values* : `ALWAYS_ON` | `ELASTIC` | `ON_DEMAND`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-fleettype)
     */
    override fun fleetType(): String? = unwrap(this).getFleetType()

    /**
     * The ARN of the IAM role that is applied to the fleet.
     *
     * To assume a role, the fleet instance calls the AWS Security Token Service `AssumeRole` API
     * operation and passes the ARN of the role to use. The operation creates a new session with
     * temporary credentials. AppStream 2.0 retrieves the temporary credentials and creates the
     * *appstream_machine_role* credential profile on the instance.
     *
     * For more information, see [Using an IAM Role to Grant Permissions to Applications and Scripts
     * Running on AppStream 2.0 Streaming
     * Instances](https://docs.aws.amazon.com/appstream2/latest/developerguide/using-iam-roles-to-grant-permissions-to-applications-scripts-streaming-instances.html)
     * in the *Amazon AppStream 2.0 Administration Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-iamrolearn)
     */
    override fun iamRoleArn(): String? = unwrap(this).getIamRoleArn()

    /**
     * The amount of time that users can be idle (inactive) before they are disconnected from their
     * streaming session and the `DisconnectTimeoutInSeconds` time interval begins.
     *
     * Users are notified before they are disconnected due to inactivity. If they try to reconnect
     * to the streaming session before the time interval specified in `DisconnectTimeoutInSeconds`
     * elapses, they are connected to their previous session. Users are considered idle when they stop
     * providing keyboard or mouse input during their streaming session. File uploads and downloads,
     * audio in, audio out, and pixels changing do not qualify as user activity. If users continue to
     * be idle after the time interval in `IdleDisconnectTimeoutInSeconds` elapses, they are
     * disconnected.
     *
     * To prevent users from being disconnected due to inactivity, specify a value of 0. Otherwise,
     * specify a value between 60 and 36000.
     *
     * If you enable this feature, we recommend that you specify a value that corresponds exactly to
     * a whole number of minutes (for example, 60, 120, and 180). If you don't do this, the value is
     * rounded to the nearest minute. For example, if you specify a value of 70, users are disconnected
     * after 1 minute of inactivity. If you specify a value that is at the midpoint between two
     * different minutes, the value is rounded up. For example, if you specify a value of 90, users are
     * disconnected after 2 minutes of inactivity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-idledisconnecttimeoutinseconds)
     */
    override fun idleDisconnectTimeoutInSeconds(): Number? =
        unwrap(this).getIdleDisconnectTimeoutInSeconds()

    /**
     * The ARN of the public, private, or shared image to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-imagearn)
     */
    override fun imageArn(): String? = unwrap(this).getImageArn()

    /**
     * The name of the image used to create the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-imagename)
     */
    override fun imageName(): String? = unwrap(this).getImageName()

    /**
     * The instance type to use when launching fleet instances. The following instance types are
     * available for non-Elastic fleets:.
     *
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
     *
     * * stream.standard.small
     * * stream.standard.medium
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-instancetype)
     */
    override fun instanceType(): String = unwrap(this).getInstanceType()

    /**
     * The maximum number of concurrent sessions that can be run on an Elastic fleet.
     *
     * This setting is required for Elastic fleets, but is not used for other fleet types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-maxconcurrentsessions)
     */
    override fun maxConcurrentSessions(): Number? = unwrap(this).getMaxConcurrentSessions()

    /**
     * Max number of user sessions on an instance.
     *
     * This is applicable only for multi-session fleets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-maxsessionsperinstance)
     */
    override fun maxSessionsPerInstance(): Number? = unwrap(this).getMaxSessionsPerInstance()

    /**
     * The maximum amount of time that a streaming session can remain active, in seconds.
     *
     * If users are still connected to a streaming instance five minutes before this limit is
     * reached, they are prompted to save any open documents before being disconnected. After this time
     * elapses, the instance is terminated and replaced by a new instance.
     *
     * Specify a value between 600 and 432000.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-maxuserdurationinseconds)
     */
    override fun maxUserDurationInSeconds(): Number? = unwrap(this).getMaxUserDurationInSeconds()

    /**
     * A unique name for the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The platform of the fleet.
     *
     * Platform is a required setting for Elastic fleets, and is not used for other fleet types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-platform)
     */
    override fun platform(): String? = unwrap(this).getPlatform()

    /**
     * The S3 location of the session scripts configuration zip file.
     *
     * This only applies to Elastic fleets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-sessionscripts3location)
     */
    override fun sessionScriptS3Location(): Any? = unwrap(this).getSessionScriptS3Location()

    /**
     * The AppStream 2.0 view that is displayed to your users when they stream from the fleet. When
     * `APP` is specified, only the windows of applications opened by users display. When `DESKTOP` is
     * specified, the standard desktop that is provided by the operating system displays.
     *
     * The default value is `APP` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-streamview)
     */
    override fun streamView(): String? = unwrap(this).getStreamView()

    /**
     * An array of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The USB device filter strings that specify which USB devices a user can redirect to the fleet
     * streaming session, when using the Windows native client.
     *
     * This is allowed but not required for Elastic fleets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-usbdevicefilterstrings)
     */
    override fun usbDeviceFilterStrings(): List<String> = unwrap(this).getUsbDeviceFilterStrings()
        ?: emptyList()

    /**
     * The VPC configuration for the fleet.
     *
     * This is required for Elastic fleets, but not required for other fleet types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-vpcconfig)
     */
    override fun vpcConfig(): Any? = unwrap(this).getVpcConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFleetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnFleetProps):
        CfnFleetProps = CdkObjectWrappers.wrap(cdkObject) as? CfnFleetProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFleetProps):
        software.amazon.awscdk.services.appstream.CfnFleetProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appstream.CfnFleetProps
  }
}
