@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appstream

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
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
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::AppStream::Fleet` resource creates a fleet for Amazon AppStream 2.0. A fleet consists
 * of streaming instances that run a specified image when using Always-On or On-Demand.
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
public open class CfnFleet(
  cdkObject: software.amazon.awscdk.services.appstream.CfnFleet,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFleetProps,
  ) :
      this(software.amazon.awscdk.services.appstream.CfnFleet(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnFleetProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFleetProps.Builder.() -> Unit,
  ) : this(scope, id, CfnFleetProps(props)
  )

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The desired capacity for the fleet.
   */
  public open fun computeCapacity(): Any? = unwrap(this).getComputeCapacity()

  /**
   * The desired capacity for the fleet.
   */
  public open fun computeCapacity(`value`: IResolvable) {
    unwrap(this).setComputeCapacity(`value`.let(IResolvable::unwrap))
  }

  /**
   * The desired capacity for the fleet.
   */
  public open fun computeCapacity(`value`: ComputeCapacityProperty) {
    unwrap(this).setComputeCapacity(`value`.let(ComputeCapacityProperty::unwrap))
  }

  /**
   * The desired capacity for the fleet.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("37794d389c003b805ebbcbb90439be973e5b4f6ff10370330aa9c347dbedf486")
  public open fun computeCapacity(`value`: ComputeCapacityProperty.Builder.() -> Unit): Unit =
      computeCapacity(ComputeCapacityProperty(`value`))

  /**
   * The description to display.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description to display.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The amount of time that a streaming session remains active after users disconnect.
   */
  public open fun disconnectTimeoutInSeconds(): Number? =
      unwrap(this).getDisconnectTimeoutInSeconds()

  /**
   * The amount of time that a streaming session remains active after users disconnect.
   */
  public open fun disconnectTimeoutInSeconds(`value`: Number) {
    unwrap(this).setDisconnectTimeoutInSeconds(`value`)
  }

  /**
   * The fleet name to display.
   */
  public open fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * The fleet name to display.
   */
  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
  }

  /**
   * The name of the directory and organizational unit (OU) to use to join the fleet to a Microsoft
   * Active Directory domain.
   */
  public open fun domainJoinInfo(): Any? = unwrap(this).getDomainJoinInfo()

  /**
   * The name of the directory and organizational unit (OU) to use to join the fleet to a Microsoft
   * Active Directory domain.
   */
  public open fun domainJoinInfo(`value`: IResolvable) {
    unwrap(this).setDomainJoinInfo(`value`.let(IResolvable::unwrap))
  }

  /**
   * The name of the directory and organizational unit (OU) to use to join the fleet to a Microsoft
   * Active Directory domain.
   */
  public open fun domainJoinInfo(`value`: DomainJoinInfoProperty) {
    unwrap(this).setDomainJoinInfo(`value`.let(DomainJoinInfoProperty::unwrap))
  }

  /**
   * The name of the directory and organizational unit (OU) to use to join the fleet to a Microsoft
   * Active Directory domain.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5146570b4a221cdcb571ccc8df220f00846c2277e1d83775ee54d06e2b9eacde")
  public open fun domainJoinInfo(`value`: DomainJoinInfoProperty.Builder.() -> Unit): Unit =
      domainJoinInfo(DomainJoinInfoProperty(`value`))

  /**
   * Enables or disables default internet access for the fleet.
   */
  public open fun enableDefaultInternetAccess(): Any? =
      unwrap(this).getEnableDefaultInternetAccess()

  /**
   * Enables or disables default internet access for the fleet.
   */
  public open fun enableDefaultInternetAccess(`value`: Boolean) {
    unwrap(this).setEnableDefaultInternetAccess(`value`)
  }

  /**
   * Enables or disables default internet access for the fleet.
   */
  public open fun enableDefaultInternetAccess(`value`: IResolvable) {
    unwrap(this).setEnableDefaultInternetAccess(`value`.let(IResolvable::unwrap))
  }

  /**
   * The fleet type.
   */
  public open fun fleetType(): String? = unwrap(this).getFleetType()

  /**
   * The fleet type.
   */
  public open fun fleetType(`value`: String) {
    unwrap(this).setFleetType(`value`)
  }

  /**
   * The ARN of the IAM role that is applied to the fleet.
   */
  public open fun iamRoleArn(): String? = unwrap(this).getIamRoleArn()

  /**
   * The ARN of the IAM role that is applied to the fleet.
   */
  public open fun iamRoleArn(`value`: String) {
    unwrap(this).setIamRoleArn(`value`)
  }

  /**
   * The amount of time that users can be idle (inactive) before they are disconnected from their
   * streaming session and the `DisconnectTimeoutInSeconds` time interval begins.
   */
  public open fun idleDisconnectTimeoutInSeconds(): Number? =
      unwrap(this).getIdleDisconnectTimeoutInSeconds()

  /**
   * The amount of time that users can be idle (inactive) before they are disconnected from their
   * streaming session and the `DisconnectTimeoutInSeconds` time interval begins.
   */
  public open fun idleDisconnectTimeoutInSeconds(`value`: Number) {
    unwrap(this).setIdleDisconnectTimeoutInSeconds(`value`)
  }

  /**
   * The ARN of the public, private, or shared image to use.
   */
  public open fun imageArn(): String? = unwrap(this).getImageArn()

  /**
   * The ARN of the public, private, or shared image to use.
   */
  public open fun imageArn(`value`: String) {
    unwrap(this).setImageArn(`value`)
  }

  /**
   * The name of the image used to create the fleet.
   */
  public open fun imageName(): String? = unwrap(this).getImageName()

  /**
   * The name of the image used to create the fleet.
   */
  public open fun imageName(`value`: String) {
    unwrap(this).setImageName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The instance type to use when launching fleet instances.
   *
   * The following instance types are available for non-Elastic fleets:.
   */
  public open fun instanceType(): String = unwrap(this).getInstanceType()

  /**
   * The instance type to use when launching fleet instances.
   *
   * The following instance types are available for non-Elastic fleets:.
   */
  public open fun instanceType(`value`: String) {
    unwrap(this).setInstanceType(`value`)
  }

  /**
   * The maximum number of concurrent sessions that can be run on an Elastic fleet.
   */
  public open fun maxConcurrentSessions(): Number? = unwrap(this).getMaxConcurrentSessions()

  /**
   * The maximum number of concurrent sessions that can be run on an Elastic fleet.
   */
  public open fun maxConcurrentSessions(`value`: Number) {
    unwrap(this).setMaxConcurrentSessions(`value`)
  }

  /**
   * Max number of user sessions on an instance.
   */
  public open fun maxSessionsPerInstance(): Number? = unwrap(this).getMaxSessionsPerInstance()

  /**
   * Max number of user sessions on an instance.
   */
  public open fun maxSessionsPerInstance(`value`: Number) {
    unwrap(this).setMaxSessionsPerInstance(`value`)
  }

  /**
   * The maximum amount of time that a streaming session can remain active, in seconds.
   */
  public open fun maxUserDurationInSeconds(): Number? = unwrap(this).getMaxUserDurationInSeconds()

  /**
   * The maximum amount of time that a streaming session can remain active, in seconds.
   */
  public open fun maxUserDurationInSeconds(`value`: Number) {
    unwrap(this).setMaxUserDurationInSeconds(`value`)
  }

  /**
   * A unique name for the fleet.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * A unique name for the fleet.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The platform of the fleet.
   */
  public open fun platform(): String? = unwrap(this).getPlatform()

  /**
   * The platform of the fleet.
   */
  public open fun platform(`value`: String) {
    unwrap(this).setPlatform(`value`)
  }

  /**
   * The S3 location of the session scripts configuration zip file.
   */
  public open fun sessionScriptS3Location(): Any? = unwrap(this).getSessionScriptS3Location()

  /**
   * The S3 location of the session scripts configuration zip file.
   */
  public open fun sessionScriptS3Location(`value`: IResolvable) {
    unwrap(this).setSessionScriptS3Location(`value`.let(IResolvable::unwrap))
  }

  /**
   * The S3 location of the session scripts configuration zip file.
   */
  public open fun sessionScriptS3Location(`value`: S3LocationProperty) {
    unwrap(this).setSessionScriptS3Location(`value`.let(S3LocationProperty::unwrap))
  }

  /**
   * The S3 location of the session scripts configuration zip file.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("44157927f59c8da79ce284e6a0c98e47ff6dcf4ddeed75e94579d618da218d2b")
  public open fun sessionScriptS3Location(`value`: S3LocationProperty.Builder.() -> Unit): Unit =
      sessionScriptS3Location(S3LocationProperty(`value`))

  /**
   * The AppStream 2.0 view that is displayed to your users when they stream from the fleet. When
   * `APP` is specified, only the windows of applications opened by users display. When `DESKTOP` is
   * specified, the standard desktop that is provided by the operating system displays.
   */
  public open fun streamView(): String? = unwrap(this).getStreamView()

  /**
   * The AppStream 2.0 view that is displayed to your users when they stream from the fleet. When
   * `APP` is specified, only the windows of applications opened by users display. When `DESKTOP` is
   * specified, the standard desktop that is provided by the operating system displays.
   */
  public open fun streamView(`value`: String) {
    unwrap(this).setStreamView(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The USB device filter strings that specify which USB devices a user can redirect to the fleet
   * streaming session, when using the Windows native client.
   */
  public open fun usbDeviceFilterStrings(): List<String> = unwrap(this).getUsbDeviceFilterStrings()
      ?: emptyList()

  /**
   * The USB device filter strings that specify which USB devices a user can redirect to the fleet
   * streaming session, when using the Windows native client.
   */
  public open fun usbDeviceFilterStrings(`value`: List<String>) {
    unwrap(this).setUsbDeviceFilterStrings(`value`)
  }

  /**
   * The USB device filter strings that specify which USB devices a user can redirect to the fleet
   * streaming session, when using the Windows native client.
   */
  public open fun usbDeviceFilterStrings(vararg `value`: String): Unit =
      usbDeviceFilterStrings(`value`.toList())

  /**
   * The VPC configuration for the fleet.
   */
  public open fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

  /**
   * The VPC configuration for the fleet.
   */
  public open fun vpcConfig(`value`: IResolvable) {
    unwrap(this).setVpcConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * The VPC configuration for the fleet.
   */
  public open fun vpcConfig(`value`: VpcConfigProperty) {
    unwrap(this).setVpcConfig(`value`.let(VpcConfigProperty::unwrap))
  }

  /**
   * The VPC configuration for the fleet.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bed9f0abe9330a78431478fa3f56d00919170e6a4dd5c065ff36aae07d4966c9")
  public open fun vpcConfig(`value`: VpcConfigProperty.Builder.() -> Unit): Unit =
      vpcConfig(VpcConfigProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appstream.CfnFleet].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The desired capacity for the fleet.
     *
     * This is not allowed for Elastic fleets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-computecapacity)
     * @param computeCapacity The desired capacity for the fleet. 
     */
    public fun computeCapacity(computeCapacity: IResolvable)

    /**
     * The desired capacity for the fleet.
     *
     * This is not allowed for Elastic fleets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-computecapacity)
     * @param computeCapacity The desired capacity for the fleet. 
     */
    public fun computeCapacity(computeCapacity: ComputeCapacityProperty)

    /**
     * The desired capacity for the fleet.
     *
     * This is not allowed for Elastic fleets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-computecapacity)
     * @param computeCapacity The desired capacity for the fleet. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8195d41084fb0cc4bd88ec67ead8b8f66dc2e1cabaaef40f78689f2148083580")
    public fun computeCapacity(computeCapacity: ComputeCapacityProperty.Builder.() -> Unit)

    /**
     * The description to display.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-description)
     * @param description The description to display. 
     */
    public fun description(description: String)

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
     * @param disconnectTimeoutInSeconds The amount of time that a streaming session remains active
     * after users disconnect. 
     */
    public fun disconnectTimeoutInSeconds(disconnectTimeoutInSeconds: Number)

    /**
     * The fleet name to display.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-displayname)
     * @param displayName The fleet name to display. 
     */
    public fun displayName(displayName: String)

    /**
     * The name of the directory and organizational unit (OU) to use to join the fleet to a
     * Microsoft Active Directory domain.
     *
     * This is not allowed for Elastic fleets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-domainjoininfo)
     * @param domainJoinInfo The name of the directory and organizational unit (OU) to use to join
     * the fleet to a Microsoft Active Directory domain. 
     */
    public fun domainJoinInfo(domainJoinInfo: IResolvable)

    /**
     * The name of the directory and organizational unit (OU) to use to join the fleet to a
     * Microsoft Active Directory domain.
     *
     * This is not allowed for Elastic fleets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-domainjoininfo)
     * @param domainJoinInfo The name of the directory and organizational unit (OU) to use to join
     * the fleet to a Microsoft Active Directory domain. 
     */
    public fun domainJoinInfo(domainJoinInfo: DomainJoinInfoProperty)

    /**
     * The name of the directory and organizational unit (OU) to use to join the fleet to a
     * Microsoft Active Directory domain.
     *
     * This is not allowed for Elastic fleets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-domainjoininfo)
     * @param domainJoinInfo The name of the directory and organizational unit (OU) to use to join
     * the fleet to a Microsoft Active Directory domain. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("506b9b8d13972074c9bc025c0200159e6477bacb687a4372c8b938675473574d")
    public fun domainJoinInfo(domainJoinInfo: DomainJoinInfoProperty.Builder.() -> Unit)

    /**
     * Enables or disables default internet access for the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-enabledefaultinternetaccess)
     * @param enableDefaultInternetAccess Enables or disables default internet access for the fleet.
     * 
     */
    public fun enableDefaultInternetAccess(enableDefaultInternetAccess: Boolean)

    /**
     * Enables or disables default internet access for the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-enabledefaultinternetaccess)
     * @param enableDefaultInternetAccess Enables or disables default internet access for the fleet.
     * 
     */
    public fun enableDefaultInternetAccess(enableDefaultInternetAccess: IResolvable)

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
     * @param fleetType The fleet type. 
     */
    public fun fleetType(fleetType: String)

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
     * @param iamRoleArn The ARN of the IAM role that is applied to the fleet. 
     */
    public fun iamRoleArn(iamRoleArn: String)

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
     * @param idleDisconnectTimeoutInSeconds The amount of time that users can be idle (inactive)
     * before they are disconnected from their streaming session and the `DisconnectTimeoutInSeconds`
     * time interval begins. 
     */
    public fun idleDisconnectTimeoutInSeconds(idleDisconnectTimeoutInSeconds: Number)

    /**
     * The ARN of the public, private, or shared image to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-imagearn)
     * @param imageArn The ARN of the public, private, or shared image to use. 
     */
    public fun imageArn(imageArn: String)

    /**
     * The name of the image used to create the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-imagename)
     * @param imageName The name of the image used to create the fleet. 
     */
    public fun imageName(imageName: String)

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
     * @param instanceType The instance type to use when launching fleet instances. The following
     * instance types are available for non-Elastic fleets:. 
     */
    public fun instanceType(instanceType: String)

    /**
     * The maximum number of concurrent sessions that can be run on an Elastic fleet.
     *
     * This setting is required for Elastic fleets, but is not used for other fleet types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-maxconcurrentsessions)
     * @param maxConcurrentSessions The maximum number of concurrent sessions that can be run on an
     * Elastic fleet. 
     */
    public fun maxConcurrentSessions(maxConcurrentSessions: Number)

    /**
     * Max number of user sessions on an instance.
     *
     * This is applicable only for multi-session fleets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-maxsessionsperinstance)
     * @param maxSessionsPerInstance Max number of user sessions on an instance. 
     */
    public fun maxSessionsPerInstance(maxSessionsPerInstance: Number)

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
     * @param maxUserDurationInSeconds The maximum amount of time that a streaming session can
     * remain active, in seconds. 
     */
    public fun maxUserDurationInSeconds(maxUserDurationInSeconds: Number)

    /**
     * A unique name for the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-name)
     * @param name A unique name for the fleet. 
     */
    public fun name(name: String)

    /**
     * The platform of the fleet.
     *
     * Platform is a required setting for Elastic fleets, and is not used for other fleet types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-platform)
     * @param platform The platform of the fleet. 
     */
    public fun platform(platform: String)

    /**
     * The S3 location of the session scripts configuration zip file.
     *
     * This only applies to Elastic fleets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-sessionscripts3location)
     * @param sessionScriptS3Location The S3 location of the session scripts configuration zip file.
     * 
     */
    public fun sessionScriptS3Location(sessionScriptS3Location: IResolvable)

    /**
     * The S3 location of the session scripts configuration zip file.
     *
     * This only applies to Elastic fleets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-sessionscripts3location)
     * @param sessionScriptS3Location The S3 location of the session scripts configuration zip file.
     * 
     */
    public fun sessionScriptS3Location(sessionScriptS3Location: S3LocationProperty)

    /**
     * The S3 location of the session scripts configuration zip file.
     *
     * This only applies to Elastic fleets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-sessionscripts3location)
     * @param sessionScriptS3Location The S3 location of the session scripts configuration zip file.
     * 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("56683f90f907d5eb91d8a6af02a81d5f7bb017a32f5aec052db5ab5b82184de3")
    public
        fun sessionScriptS3Location(sessionScriptS3Location: S3LocationProperty.Builder.() -> Unit)

    /**
     * The AppStream 2.0 view that is displayed to your users when they stream from the fleet. When
     * `APP` is specified, only the windows of applications opened by users display. When `DESKTOP` is
     * specified, the standard desktop that is provided by the operating system displays.
     *
     * The default value is `APP` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-streamview)
     * @param streamView The AppStream 2.0 view that is displayed to your users when they stream
     * from the fleet. When `APP` is specified, only the windows of applications opened by users
     * display. When `DESKTOP` is specified, the standard desktop that is provided by the operating
     * system displays. 
     */
    public fun streamView(streamView: String)

    /**
     * An array of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-tags)
     * @param tags An array of key-value pairs. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-tags)
     * @param tags An array of key-value pairs. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The USB device filter strings that specify which USB devices a user can redirect to the fleet
     * streaming session, when using the Windows native client.
     *
     * This is allowed but not required for Elastic fleets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-usbdevicefilterstrings)
     * @param usbDeviceFilterStrings The USB device filter strings that specify which USB devices a
     * user can redirect to the fleet streaming session, when using the Windows native client. 
     */
    public fun usbDeviceFilterStrings(usbDeviceFilterStrings: List<String>)

    /**
     * The USB device filter strings that specify which USB devices a user can redirect to the fleet
     * streaming session, when using the Windows native client.
     *
     * This is allowed but not required for Elastic fleets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-usbdevicefilterstrings)
     * @param usbDeviceFilterStrings The USB device filter strings that specify which USB devices a
     * user can redirect to the fleet streaming session, when using the Windows native client. 
     */
    public fun usbDeviceFilterStrings(vararg usbDeviceFilterStrings: String)

    /**
     * The VPC configuration for the fleet.
     *
     * This is required for Elastic fleets, but not required for other fleet types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-vpcconfig)
     * @param vpcConfig The VPC configuration for the fleet. 
     */
    public fun vpcConfig(vpcConfig: IResolvable)

    /**
     * The VPC configuration for the fleet.
     *
     * This is required for Elastic fleets, but not required for other fleet types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-vpcconfig)
     * @param vpcConfig The VPC configuration for the fleet. 
     */
    public fun vpcConfig(vpcConfig: VpcConfigProperty)

    /**
     * The VPC configuration for the fleet.
     *
     * This is required for Elastic fleets, but not required for other fleet types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-vpcconfig)
     * @param vpcConfig The VPC configuration for the fleet. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("29106d013b41bf806200d4877f319de3dc036117dcc422d9d2682b4e9803ed0f")
    public fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appstream.CfnFleet.Builder =
        software.amazon.awscdk.services.appstream.CfnFleet.Builder.create(scope, id)

    /**
     * The desired capacity for the fleet.
     *
     * This is not allowed for Elastic fleets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-computecapacity)
     * @param computeCapacity The desired capacity for the fleet. 
     */
    override fun computeCapacity(computeCapacity: IResolvable) {
      cdkBuilder.computeCapacity(computeCapacity.let(IResolvable::unwrap))
    }

    /**
     * The desired capacity for the fleet.
     *
     * This is not allowed for Elastic fleets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-computecapacity)
     * @param computeCapacity The desired capacity for the fleet. 
     */
    override fun computeCapacity(computeCapacity: ComputeCapacityProperty) {
      cdkBuilder.computeCapacity(computeCapacity.let(ComputeCapacityProperty::unwrap))
    }

    /**
     * The desired capacity for the fleet.
     *
     * This is not allowed for Elastic fleets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-computecapacity)
     * @param computeCapacity The desired capacity for the fleet. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8195d41084fb0cc4bd88ec67ead8b8f66dc2e1cabaaef40f78689f2148083580")
    override fun computeCapacity(computeCapacity: ComputeCapacityProperty.Builder.() -> Unit): Unit
        = computeCapacity(ComputeCapacityProperty(computeCapacity))

    /**
     * The description to display.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-description)
     * @param description The description to display. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

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
     * @param disconnectTimeoutInSeconds The amount of time that a streaming session remains active
     * after users disconnect. 
     */
    override fun disconnectTimeoutInSeconds(disconnectTimeoutInSeconds: Number) {
      cdkBuilder.disconnectTimeoutInSeconds(disconnectTimeoutInSeconds)
    }

    /**
     * The fleet name to display.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-displayname)
     * @param displayName The fleet name to display. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * The name of the directory and organizational unit (OU) to use to join the fleet to a
     * Microsoft Active Directory domain.
     *
     * This is not allowed for Elastic fleets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-domainjoininfo)
     * @param domainJoinInfo The name of the directory and organizational unit (OU) to use to join
     * the fleet to a Microsoft Active Directory domain. 
     */
    override fun domainJoinInfo(domainJoinInfo: IResolvable) {
      cdkBuilder.domainJoinInfo(domainJoinInfo.let(IResolvable::unwrap))
    }

    /**
     * The name of the directory and organizational unit (OU) to use to join the fleet to a
     * Microsoft Active Directory domain.
     *
     * This is not allowed for Elastic fleets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-domainjoininfo)
     * @param domainJoinInfo The name of the directory and organizational unit (OU) to use to join
     * the fleet to a Microsoft Active Directory domain. 
     */
    override fun domainJoinInfo(domainJoinInfo: DomainJoinInfoProperty) {
      cdkBuilder.domainJoinInfo(domainJoinInfo.let(DomainJoinInfoProperty::unwrap))
    }

    /**
     * The name of the directory and organizational unit (OU) to use to join the fleet to a
     * Microsoft Active Directory domain.
     *
     * This is not allowed for Elastic fleets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-domainjoininfo)
     * @param domainJoinInfo The name of the directory and organizational unit (OU) to use to join
     * the fleet to a Microsoft Active Directory domain. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("506b9b8d13972074c9bc025c0200159e6477bacb687a4372c8b938675473574d")
    override fun domainJoinInfo(domainJoinInfo: DomainJoinInfoProperty.Builder.() -> Unit): Unit =
        domainJoinInfo(DomainJoinInfoProperty(domainJoinInfo))

    /**
     * Enables or disables default internet access for the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-enabledefaultinternetaccess)
     * @param enableDefaultInternetAccess Enables or disables default internet access for the fleet.
     * 
     */
    override fun enableDefaultInternetAccess(enableDefaultInternetAccess: Boolean) {
      cdkBuilder.enableDefaultInternetAccess(enableDefaultInternetAccess)
    }

    /**
     * Enables or disables default internet access for the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-enabledefaultinternetaccess)
     * @param enableDefaultInternetAccess Enables or disables default internet access for the fleet.
     * 
     */
    override fun enableDefaultInternetAccess(enableDefaultInternetAccess: IResolvable) {
      cdkBuilder.enableDefaultInternetAccess(enableDefaultInternetAccess.let(IResolvable::unwrap))
    }

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
     * @param fleetType The fleet type. 
     */
    override fun fleetType(fleetType: String) {
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
     * For more information, see [Using an IAM Role to Grant Permissions to Applications and Scripts
     * Running on AppStream 2.0 Streaming
     * Instances](https://docs.aws.amazon.com/appstream2/latest/developerguide/using-iam-roles-to-grant-permissions-to-applications-scripts-streaming-instances.html)
     * in the *Amazon AppStream 2.0 Administration Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-iamrolearn)
     * @param iamRoleArn The ARN of the IAM role that is applied to the fleet. 
     */
    override fun iamRoleArn(iamRoleArn: String) {
      cdkBuilder.iamRoleArn(iamRoleArn)
    }

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
     * @param idleDisconnectTimeoutInSeconds The amount of time that users can be idle (inactive)
     * before they are disconnected from their streaming session and the `DisconnectTimeoutInSeconds`
     * time interval begins. 
     */
    override fun idleDisconnectTimeoutInSeconds(idleDisconnectTimeoutInSeconds: Number) {
      cdkBuilder.idleDisconnectTimeoutInSeconds(idleDisconnectTimeoutInSeconds)
    }

    /**
     * The ARN of the public, private, or shared image to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-imagearn)
     * @param imageArn The ARN of the public, private, or shared image to use. 
     */
    override fun imageArn(imageArn: String) {
      cdkBuilder.imageArn(imageArn)
    }

    /**
     * The name of the image used to create the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-imagename)
     * @param imageName The name of the image used to create the fleet. 
     */
    override fun imageName(imageName: String) {
      cdkBuilder.imageName(imageName)
    }

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
     * @param instanceType The instance type to use when launching fleet instances. The following
     * instance types are available for non-Elastic fleets:. 
     */
    override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    /**
     * The maximum number of concurrent sessions that can be run on an Elastic fleet.
     *
     * This setting is required for Elastic fleets, but is not used for other fleet types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-maxconcurrentsessions)
     * @param maxConcurrentSessions The maximum number of concurrent sessions that can be run on an
     * Elastic fleet. 
     */
    override fun maxConcurrentSessions(maxConcurrentSessions: Number) {
      cdkBuilder.maxConcurrentSessions(maxConcurrentSessions)
    }

    /**
     * Max number of user sessions on an instance.
     *
     * This is applicable only for multi-session fleets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-maxsessionsperinstance)
     * @param maxSessionsPerInstance Max number of user sessions on an instance. 
     */
    override fun maxSessionsPerInstance(maxSessionsPerInstance: Number) {
      cdkBuilder.maxSessionsPerInstance(maxSessionsPerInstance)
    }

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
     * @param maxUserDurationInSeconds The maximum amount of time that a streaming session can
     * remain active, in seconds. 
     */
    override fun maxUserDurationInSeconds(maxUserDurationInSeconds: Number) {
      cdkBuilder.maxUserDurationInSeconds(maxUserDurationInSeconds)
    }

    /**
     * A unique name for the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-name)
     * @param name A unique name for the fleet. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The platform of the fleet.
     *
     * Platform is a required setting for Elastic fleets, and is not used for other fleet types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-platform)
     * @param platform The platform of the fleet. 
     */
    override fun platform(platform: String) {
      cdkBuilder.platform(platform)
    }

    /**
     * The S3 location of the session scripts configuration zip file.
     *
     * This only applies to Elastic fleets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-sessionscripts3location)
     * @param sessionScriptS3Location The S3 location of the session scripts configuration zip file.
     * 
     */
    override fun sessionScriptS3Location(sessionScriptS3Location: IResolvable) {
      cdkBuilder.sessionScriptS3Location(sessionScriptS3Location.let(IResolvable::unwrap))
    }

    /**
     * The S3 location of the session scripts configuration zip file.
     *
     * This only applies to Elastic fleets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-sessionscripts3location)
     * @param sessionScriptS3Location The S3 location of the session scripts configuration zip file.
     * 
     */
    override fun sessionScriptS3Location(sessionScriptS3Location: S3LocationProperty) {
      cdkBuilder.sessionScriptS3Location(sessionScriptS3Location.let(S3LocationProperty::unwrap))
    }

    /**
     * The S3 location of the session scripts configuration zip file.
     *
     * This only applies to Elastic fleets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-sessionscripts3location)
     * @param sessionScriptS3Location The S3 location of the session scripts configuration zip file.
     * 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("56683f90f907d5eb91d8a6af02a81d5f7bb017a32f5aec052db5ab5b82184de3")
    override
        fun sessionScriptS3Location(sessionScriptS3Location: S3LocationProperty.Builder.() -> Unit):
        Unit = sessionScriptS3Location(S3LocationProperty(sessionScriptS3Location))

    /**
     * The AppStream 2.0 view that is displayed to your users when they stream from the fleet. When
     * `APP` is specified, only the windows of applications opened by users display. When `DESKTOP` is
     * specified, the standard desktop that is provided by the operating system displays.
     *
     * The default value is `APP` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-streamview)
     * @param streamView The AppStream 2.0 view that is displayed to your users when they stream
     * from the fleet. When `APP` is specified, only the windows of applications opened by users
     * display. When `DESKTOP` is specified, the standard desktop that is provided by the operating
     * system displays. 
     */
    override fun streamView(streamView: String) {
      cdkBuilder.streamView(streamView)
    }

    /**
     * An array of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-tags)
     * @param tags An array of key-value pairs. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-tags)
     * @param tags An array of key-value pairs. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The USB device filter strings that specify which USB devices a user can redirect to the fleet
     * streaming session, when using the Windows native client.
     *
     * This is allowed but not required for Elastic fleets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-usbdevicefilterstrings)
     * @param usbDeviceFilterStrings The USB device filter strings that specify which USB devices a
     * user can redirect to the fleet streaming session, when using the Windows native client. 
     */
    override fun usbDeviceFilterStrings(usbDeviceFilterStrings: List<String>) {
      cdkBuilder.usbDeviceFilterStrings(usbDeviceFilterStrings)
    }

    /**
     * The USB device filter strings that specify which USB devices a user can redirect to the fleet
     * streaming session, when using the Windows native client.
     *
     * This is allowed but not required for Elastic fleets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-usbdevicefilterstrings)
     * @param usbDeviceFilterStrings The USB device filter strings that specify which USB devices a
     * user can redirect to the fleet streaming session, when using the Windows native client. 
     */
    override fun usbDeviceFilterStrings(vararg usbDeviceFilterStrings: String): Unit =
        usbDeviceFilterStrings(usbDeviceFilterStrings.toList())

    /**
     * The VPC configuration for the fleet.
     *
     * This is required for Elastic fleets, but not required for other fleet types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-vpcconfig)
     * @param vpcConfig The VPC configuration for the fleet. 
     */
    override fun vpcConfig(vpcConfig: IResolvable) {
      cdkBuilder.vpcConfig(vpcConfig.let(IResolvable::unwrap))
    }

    /**
     * The VPC configuration for the fleet.
     *
     * This is required for Elastic fleets, but not required for other fleet types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-vpcconfig)
     * @param vpcConfig The VPC configuration for the fleet. 
     */
    override fun vpcConfig(vpcConfig: VpcConfigProperty) {
      cdkBuilder.vpcConfig(vpcConfig.let(VpcConfigProperty::unwrap))
    }

    /**
     * The VPC configuration for the fleet.
     *
     * This is required for Elastic fleets, but not required for other fleet types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-vpcconfig)
     * @param vpcConfig The VPC configuration for the fleet. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("29106d013b41bf806200d4877f319de3dc036117dcc422d9d2682b4e9803ed0f")
    override fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit): Unit =
        vpcConfig(VpcConfigProperty(vpcConfig))

    public fun build(): software.amazon.awscdk.services.appstream.CfnFleet = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.appstream.CfnFleet.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFleet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFleet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnFleet): CfnFleet =
        CfnFleet(cdkObject)

    internal fun unwrap(wrapped: CfnFleet): software.amazon.awscdk.services.appstream.CfnFleet =
        wrapped.cdkObject as software.amazon.awscdk.services.appstream.CfnFleet
  }

  /**
   * The desired capacity for a fleet.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appstream.*;
   * ComputeCapacityProperty computeCapacityProperty = ComputeCapacityProperty.builder()
   * .desiredInstances(123)
   * .desiredSessions(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-computecapacity.html)
   */
  public interface ComputeCapacityProperty {
    /**
     * The desired number of streaming instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-computecapacity.html#cfn-appstream-fleet-computecapacity-desiredinstances)
     */
    public fun desiredInstances(): Number? = unwrap(this).getDesiredInstances()

    /**
     * The desired capacity in terms of number of user sessions, for the multi-session fleet.
     *
     * This is not allowed for single-session fleets.
     *
     * When you create a fleet, you must set define either the DesiredSessions or DesiredInstances
     * attribute, based on the type of fleet you create. You can’t define both attributes or leave both
     * attributes blank.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-computecapacity.html#cfn-appstream-fleet-computecapacity-desiredsessions)
     */
    public fun desiredSessions(): Number? = unwrap(this).getDesiredSessions()

    /**
     * A builder for [ComputeCapacityProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param desiredInstances The desired number of streaming instances.
       */
      public fun desiredInstances(desiredInstances: Number)

      /**
       * @param desiredSessions The desired capacity in terms of number of user sessions, for the
       * multi-session fleet.
       * This is not allowed for single-session fleets.
       *
       * When you create a fleet, you must set define either the DesiredSessions or DesiredInstances
       * attribute, based on the type of fleet you create. You can’t define both attributes or leave
       * both attributes blank.
       */
      public fun desiredSessions(desiredSessions: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appstream.CfnFleet.ComputeCapacityProperty.Builder =
          software.amazon.awscdk.services.appstream.CfnFleet.ComputeCapacityProperty.builder()

      /**
       * @param desiredInstances The desired number of streaming instances.
       */
      override fun desiredInstances(desiredInstances: Number) {
        cdkBuilder.desiredInstances(desiredInstances)
      }

      /**
       * @param desiredSessions The desired capacity in terms of number of user sessions, for the
       * multi-session fleet.
       * This is not allowed for single-session fleets.
       *
       * When you create a fleet, you must set define either the DesiredSessions or DesiredInstances
       * attribute, based on the type of fleet you create. You can’t define both attributes or leave
       * both attributes blank.
       */
      override fun desiredSessions(desiredSessions: Number) {
        cdkBuilder.desiredSessions(desiredSessions)
      }

      public fun build(): software.amazon.awscdk.services.appstream.CfnFleet.ComputeCapacityProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appstream.CfnFleet.ComputeCapacityProperty,
    ) : CdkObject(cdkObject), ComputeCapacityProperty {
      /**
       * The desired number of streaming instances.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-computecapacity.html#cfn-appstream-fleet-computecapacity-desiredinstances)
       */
      override fun desiredInstances(): Number? = unwrap(this).getDesiredInstances()

      /**
       * The desired capacity in terms of number of user sessions, for the multi-session fleet.
       *
       * This is not allowed for single-session fleets.
       *
       * When you create a fleet, you must set define either the DesiredSessions or DesiredInstances
       * attribute, based on the type of fleet you create. You can’t define both attributes or leave
       * both attributes blank.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-computecapacity.html#cfn-appstream-fleet-computecapacity-desiredsessions)
       */
      override fun desiredSessions(): Number? = unwrap(this).getDesiredSessions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ComputeCapacityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnFleet.ComputeCapacityProperty):
          ComputeCapacityProperty = CdkObjectWrappers.wrap(cdkObject) as? ComputeCapacityProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComputeCapacityProperty):
          software.amazon.awscdk.services.appstream.CfnFleet.ComputeCapacityProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appstream.CfnFleet.ComputeCapacityProperty
    }
  }

  /**
   * The name of the directory and organizational unit (OU) to use to join a fleet to a Microsoft
   * Active Directory domain.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appstream.*;
   * DomainJoinInfoProperty domainJoinInfoProperty = DomainJoinInfoProperty.builder()
   * .directoryName("directoryName")
   * .organizationalUnitDistinguishedName("organizationalUnitDistinguishedName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-domainjoininfo.html)
   */
  public interface DomainJoinInfoProperty {
    /**
     * The fully qualified name of the directory (for example, corp.example.com).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-domainjoininfo.html#cfn-appstream-fleet-domainjoininfo-directoryname)
     */
    public fun directoryName(): String? = unwrap(this).getDirectoryName()

    /**
     * The distinguished name of the organizational unit for computer accounts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-domainjoininfo.html#cfn-appstream-fleet-domainjoininfo-organizationalunitdistinguishedname)
     */
    public fun organizationalUnitDistinguishedName(): String? =
        unwrap(this).getOrganizationalUnitDistinguishedName()

    /**
     * A builder for [DomainJoinInfoProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param directoryName The fully qualified name of the directory (for example,
       * corp.example.com).
       */
      public fun directoryName(directoryName: String)

      /**
       * @param organizationalUnitDistinguishedName The distinguished name of the organizational
       * unit for computer accounts.
       */
      public fun organizationalUnitDistinguishedName(organizationalUnitDistinguishedName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appstream.CfnFleet.DomainJoinInfoProperty.Builder =
          software.amazon.awscdk.services.appstream.CfnFleet.DomainJoinInfoProperty.builder()

      /**
       * @param directoryName The fully qualified name of the directory (for example,
       * corp.example.com).
       */
      override fun directoryName(directoryName: String) {
        cdkBuilder.directoryName(directoryName)
      }

      /**
       * @param organizationalUnitDistinguishedName The distinguished name of the organizational
       * unit for computer accounts.
       */
      override
          fun organizationalUnitDistinguishedName(organizationalUnitDistinguishedName: String) {
        cdkBuilder.organizationalUnitDistinguishedName(organizationalUnitDistinguishedName)
      }

      public fun build(): software.amazon.awscdk.services.appstream.CfnFleet.DomainJoinInfoProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appstream.CfnFleet.DomainJoinInfoProperty,
    ) : CdkObject(cdkObject), DomainJoinInfoProperty {
      /**
       * The fully qualified name of the directory (for example, corp.example.com).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-domainjoininfo.html#cfn-appstream-fleet-domainjoininfo-directoryname)
       */
      override fun directoryName(): String? = unwrap(this).getDirectoryName()

      /**
       * The distinguished name of the organizational unit for computer accounts.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-domainjoininfo.html#cfn-appstream-fleet-domainjoininfo-organizationalunitdistinguishedname)
       */
      override fun organizationalUnitDistinguishedName(): String? =
          unwrap(this).getOrganizationalUnitDistinguishedName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DomainJoinInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnFleet.DomainJoinInfoProperty):
          DomainJoinInfoProperty = CdkObjectWrappers.wrap(cdkObject) as? DomainJoinInfoProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DomainJoinInfoProperty):
          software.amazon.awscdk.services.appstream.CfnFleet.DomainJoinInfoProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appstream.CfnFleet.DomainJoinInfoProperty
    }
  }

  /**
   * Describes the S3 location.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appstream.*;
   * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
   * .s3Bucket("s3Bucket")
   * .s3Key("s3Key")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-s3location.html)
   */
  public interface S3LocationProperty {
    /**
     * The S3 bucket of the S3 object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-s3location.html#cfn-appstream-fleet-s3location-s3bucket)
     */
    public fun s3Bucket(): String

    /**
     * The S3 key of the S3 object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-s3location.html#cfn-appstream-fleet-s3location-s3key)
     */
    public fun s3Key(): String

    /**
     * A builder for [S3LocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3Bucket The S3 bucket of the S3 object. 
       */
      public fun s3Bucket(s3Bucket: String)

      /**
       * @param s3Key The S3 key of the S3 object. 
       */
      public fun s3Key(s3Key: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appstream.CfnFleet.S3LocationProperty.Builder =
          software.amazon.awscdk.services.appstream.CfnFleet.S3LocationProperty.builder()

      /**
       * @param s3Bucket The S3 bucket of the S3 object. 
       */
      override fun s3Bucket(s3Bucket: String) {
        cdkBuilder.s3Bucket(s3Bucket)
      }

      /**
       * @param s3Key The S3 key of the S3 object. 
       */
      override fun s3Key(s3Key: String) {
        cdkBuilder.s3Key(s3Key)
      }

      public fun build(): software.amazon.awscdk.services.appstream.CfnFleet.S3LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appstream.CfnFleet.S3LocationProperty,
    ) : CdkObject(cdkObject), S3LocationProperty {
      /**
       * The S3 bucket of the S3 object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-s3location.html#cfn-appstream-fleet-s3location-s3bucket)
       */
      override fun s3Bucket(): String = unwrap(this).getS3Bucket()

      /**
       * The S3 key of the S3 object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-s3location.html#cfn-appstream-fleet-s3location-s3key)
       */
      override fun s3Key(): String = unwrap(this).getS3Key()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnFleet.S3LocationProperty):
          S3LocationProperty = CdkObjectWrappers.wrap(cdkObject) as? S3LocationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3LocationProperty):
          software.amazon.awscdk.services.appstream.CfnFleet.S3LocationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appstream.CfnFleet.S3LocationProperty
    }
  }

  /**
   * The VPC configuration information for the fleet.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appstream.*;
   * VpcConfigProperty vpcConfigProperty = VpcConfigProperty.builder()
   * .securityGroupIds(List.of("securityGroupIds"))
   * .subnetIds(List.of("subnetIds"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-vpcconfig.html)
   */
  public interface VpcConfigProperty {
    /**
     * The identifiers of the security groups for the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-vpcconfig.html#cfn-appstream-fleet-vpcconfig-securitygroupids)
     */
    public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

    /**
     * The identifiers of the subnets to which a network interface is attached from the fleet
     * instance.
     *
     * Fleet instances can use one or two subnets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-vpcconfig.html#cfn-appstream-fleet-vpcconfig-subnetids)
     */
    public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    /**
     * A builder for [VpcConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param securityGroupIds The identifiers of the security groups for the fleet.
       */
      public fun securityGroupIds(securityGroupIds: List<String>)

      /**
       * @param securityGroupIds The identifiers of the security groups for the fleet.
       */
      public fun securityGroupIds(vararg securityGroupIds: String)

      /**
       * @param subnetIds The identifiers of the subnets to which a network interface is attached
       * from the fleet instance.
       * Fleet instances can use one or two subnets.
       */
      public fun subnetIds(subnetIds: List<String>)

      /**
       * @param subnetIds The identifiers of the subnets to which a network interface is attached
       * from the fleet instance.
       * Fleet instances can use one or two subnets.
       */
      public fun subnetIds(vararg subnetIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appstream.CfnFleet.VpcConfigProperty.Builder =
          software.amazon.awscdk.services.appstream.CfnFleet.VpcConfigProperty.builder()

      /**
       * @param securityGroupIds The identifiers of the security groups for the fleet.
       */
      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      /**
       * @param securityGroupIds The identifiers of the security groups for the fleet.
       */
      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      /**
       * @param subnetIds The identifiers of the subnets to which a network interface is attached
       * from the fleet instance.
       * Fleet instances can use one or two subnets.
       */
      override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      /**
       * @param subnetIds The identifiers of the subnets to which a network interface is attached
       * from the fleet instance.
       * Fleet instances can use one or two subnets.
       */
      override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

      public fun build(): software.amazon.awscdk.services.appstream.CfnFleet.VpcConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appstream.CfnFleet.VpcConfigProperty,
    ) : CdkObject(cdkObject), VpcConfigProperty {
      /**
       * The identifiers of the security groups for the fleet.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-vpcconfig.html#cfn-appstream-fleet-vpcconfig-securitygroupids)
       */
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      /**
       * The identifiers of the subnets to which a network interface is attached from the fleet
       * instance.
       *
       * Fleet instances can use one or two subnets.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-vpcconfig.html#cfn-appstream-fleet-vpcconfig-subnetids)
       */
      override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnFleet.VpcConfigProperty):
          VpcConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? VpcConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigProperty):
          software.amazon.awscdk.services.appstream.CfnFleet.VpcConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appstream.CfnFleet.VpcConfigProperty
    }
  }
}
