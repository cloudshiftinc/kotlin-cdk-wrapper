@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.workspacesthinclient

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Describes an environment.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.workspacesthinclient.*;
 * CfnEnvironment cfnEnvironment = CfnEnvironment.Builder.create(this, "MyCfnEnvironment")
 * .desktopArn("desktopArn")
 * // the properties below are optional
 * .desiredSoftwareSetId("desiredSoftwareSetId")
 * .desktopEndpoint("desktopEndpoint")
 * .deviceCreationTags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .kmsKeyArn("kmsKeyArn")
 * .maintenanceWindow(MaintenanceWindowProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .applyTimeOf("applyTimeOf")
 * .daysOfTheWeek(List.of("daysOfTheWeek"))
 * .endTimeHour(123)
 * .endTimeMinute(123)
 * .startTimeHour(123)
 * .startTimeMinute(123)
 * .build())
 * .name("name")
 * .softwareSetUpdateMode("softwareSetUpdateMode")
 * .softwareSetUpdateSchedule("softwareSetUpdateSchedule")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html)
 */
public open class CfnEnvironment(
  cdkObject: software.amazon.awscdk.services.workspacesthinclient.CfnEnvironment,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEnvironmentProps,
  ) :
      this(software.amazon.awscdk.services.workspacesthinclient.CfnEnvironment(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnEnvironmentProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEnvironmentProps.Builder.() -> Unit,
  ) : this(scope, id, CfnEnvironmentProps(props)
  )

  /**
   * The activation code to register a device to the environment.
   */
  public open fun attrActivationCode(): String = unwrap(this).getAttrActivationCode()

  /**
   * The Amazon Resource Name (ARN) of the environment.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The timestamp of when the environment was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The type of streaming desktop for the environment.
   */
  public open fun attrDesktopType(): String = unwrap(this).getAttrDesktopType()

  /**
   * Unique identifier of the environment.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The ID of the software set that is pending to be installed.
   */
  public open fun attrPendingSoftwareSetId(): String = unwrap(this).getAttrPendingSoftwareSetId()

  /**
   * The version of the software set that is pending to be installed.
   */
  public open fun attrPendingSoftwareSetVersion(): String =
      unwrap(this).getAttrPendingSoftwareSetVersion()

  /**
   * The number of devices registered to the environment.
   */
  public open fun attrRegisteredDevicesCount(): Number =
      unwrap(this).getAttrRegisteredDevicesCount()

  /**
   * Describes if the software currently installed on all devices in the environment is a supported
   * version.
   */
  public open fun attrSoftwareSetComplianceStatus(): String =
      unwrap(this).getAttrSoftwareSetComplianceStatus()

  /**
   * The timestamp of when the device was updated.
   */
  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The ID of the software set to apply.
   */
  public open fun desiredSoftwareSetId(): String? = unwrap(this).getDesiredSoftwareSetId()

  /**
   * The ID of the software set to apply.
   */
  public open fun desiredSoftwareSetId(`value`: String) {
    unwrap(this).setDesiredSoftwareSetId(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the desktop to stream from Amazon WorkSpaces, WorkSpaces Web,
   * or AppStream 2.0.
   */
  public open fun desktopArn(): String = unwrap(this).getDesktopArn()

  /**
   * The Amazon Resource Name (ARN) of the desktop to stream from Amazon WorkSpaces, WorkSpaces Web,
   * or AppStream 2.0.
   */
  public open fun desktopArn(`value`: String) {
    unwrap(this).setDesktopArn(`value`)
  }

  /**
   * The URL for the identity provider login (only for environments that use AppStream 2.0).
   */
  public open fun desktopEndpoint(): String? = unwrap(this).getDesktopEndpoint()

  /**
   * The URL for the identity provider login (only for environments that use AppStream 2.0).
   */
  public open fun desktopEndpoint(`value`: String) {
    unwrap(this).setDesktopEndpoint(`value`)
  }

  /**
   * The tag keys and optional values for the newly created devices for this environment.
   */
  public open fun deviceCreationTags(): Any? = unwrap(this).getDeviceCreationTags()

  /**
   * The tag keys and optional values for the newly created devices for this environment.
   */
  public open fun deviceCreationTags(`value`: IResolvable) {
    unwrap(this).setDeviceCreationTags(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The tag keys and optional values for the newly created devices for this environment.
   */
  public open fun deviceCreationTags(`value`: List<Any>) {
    unwrap(this).setDeviceCreationTags(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The tag keys and optional values for the newly created devices for this environment.
   */
  public open fun deviceCreationTags(vararg `value`: Any): Unit =
      deviceCreationTags(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) of the AWS Key Management Service key used to encrypt the
   * environment.
   */
  public open fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  /**
   * The Amazon Resource Name (ARN) of the AWS Key Management Service key used to encrypt the
   * environment.
   */
  public open fun kmsKeyArn(`value`: String) {
    unwrap(this).setKmsKeyArn(`value`)
  }

  /**
   * A specification for a time window to apply software updates.
   */
  public open fun maintenanceWindow(): Any? = unwrap(this).getMaintenanceWindow()

  /**
   * A specification for a time window to apply software updates.
   */
  public open fun maintenanceWindow(`value`: IResolvable) {
    unwrap(this).setMaintenanceWindow(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A specification for a time window to apply software updates.
   */
  public open fun maintenanceWindow(`value`: MaintenanceWindowProperty) {
    unwrap(this).setMaintenanceWindow(`value`.let(MaintenanceWindowProperty.Companion::unwrap))
  }

  /**
   * A specification for a time window to apply software updates.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f882a793f43a14871908b1f869b47e5df8b398cd450e624b48d62bbb4e2de483")
  public open fun maintenanceWindow(`value`: MaintenanceWindowProperty.Builder.() -> Unit): Unit =
      maintenanceWindow(MaintenanceWindowProperty(`value`))

  /**
   * The name of the environment.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the environment.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * An option to define which software updates to apply.
   */
  public open fun softwareSetUpdateMode(): String? = unwrap(this).getSoftwareSetUpdateMode()

  /**
   * An option to define which software updates to apply.
   */
  public open fun softwareSetUpdateMode(`value`: String) {
    unwrap(this).setSoftwareSetUpdateMode(`value`)
  }

  /**
   * An option to define if software updates should be applied within a maintenance window.
   */
  public open fun softwareSetUpdateSchedule(): String? = unwrap(this).getSoftwareSetUpdateSchedule()

  /**
   * An option to define if software updates should be applied within a maintenance window.
   */
  public open fun softwareSetUpdateSchedule(`value`: String) {
    unwrap(this).setSoftwareSetUpdateSchedule(`value`)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.workspacesthinclient.CfnEnvironment].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the software set to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-desiredsoftwaresetid)
     * @param desiredSoftwareSetId The ID of the software set to apply. 
     */
    public fun desiredSoftwareSetId(desiredSoftwareSetId: String)

    /**
     * The Amazon Resource Name (ARN) of the desktop to stream from Amazon WorkSpaces, WorkSpaces
     * Web, or AppStream 2.0.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-desktoparn)
     * @param desktopArn The Amazon Resource Name (ARN) of the desktop to stream from Amazon
     * WorkSpaces, WorkSpaces Web, or AppStream 2.0. 
     */
    public fun desktopArn(desktopArn: String)

    /**
     * The URL for the identity provider login (only for environments that use AppStream 2.0).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-desktopendpoint)
     * @param desktopEndpoint The URL for the identity provider login (only for environments that
     * use AppStream 2.0). 
     */
    public fun desktopEndpoint(desktopEndpoint: String)

    /**
     * The tag keys and optional values for the newly created devices for this environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-devicecreationtags)
     * @param deviceCreationTags The tag keys and optional values for the newly created devices for
     * this environment. 
     */
    public fun deviceCreationTags(deviceCreationTags: IResolvable)

    /**
     * The tag keys and optional values for the newly created devices for this environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-devicecreationtags)
     * @param deviceCreationTags The tag keys and optional values for the newly created devices for
     * this environment. 
     */
    public fun deviceCreationTags(deviceCreationTags: List<Any>)

    /**
     * The tag keys and optional values for the newly created devices for this environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-devicecreationtags)
     * @param deviceCreationTags The tag keys and optional values for the newly created devices for
     * this environment. 
     */
    public fun deviceCreationTags(vararg deviceCreationTags: Any)

    /**
     * The Amazon Resource Name (ARN) of the AWS Key Management Service key used to encrypt the
     * environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-kmskeyarn)
     * @param kmsKeyArn The Amazon Resource Name (ARN) of the AWS Key Management Service key used to
     * encrypt the environment. 
     */
    public fun kmsKeyArn(kmsKeyArn: String)

    /**
     * A specification for a time window to apply software updates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-maintenancewindow)
     * @param maintenanceWindow A specification for a time window to apply software updates. 
     */
    public fun maintenanceWindow(maintenanceWindow: IResolvable)

    /**
     * A specification for a time window to apply software updates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-maintenancewindow)
     * @param maintenanceWindow A specification for a time window to apply software updates. 
     */
    public fun maintenanceWindow(maintenanceWindow: MaintenanceWindowProperty)

    /**
     * A specification for a time window to apply software updates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-maintenancewindow)
     * @param maintenanceWindow A specification for a time window to apply software updates. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("519fda3457d6ed44d5fc04754070dfd2014c3c36808a6805fc980825a2fdd616")
    public fun maintenanceWindow(maintenanceWindow: MaintenanceWindowProperty.Builder.() -> Unit)

    /**
     * The name of the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-name)
     * @param name The name of the environment. 
     */
    public fun name(name: String)

    /**
     * An option to define which software updates to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-softwaresetupdatemode)
     * @param softwareSetUpdateMode An option to define which software updates to apply. 
     */
    public fun softwareSetUpdateMode(softwareSetUpdateMode: String)

    /**
     * An option to define if software updates should be applied within a maintenance window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-softwaresetupdateschedule)
     * @param softwareSetUpdateSchedule An option to define if software updates should be applied
     * within a maintenance window. 
     */
    public fun softwareSetUpdateSchedule(softwareSetUpdateSchedule: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.workspacesthinclient.CfnEnvironment.Builder =
        software.amazon.awscdk.services.workspacesthinclient.CfnEnvironment.Builder.create(scope,
        id)

    /**
     * The ID of the software set to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-desiredsoftwaresetid)
     * @param desiredSoftwareSetId The ID of the software set to apply. 
     */
    override fun desiredSoftwareSetId(desiredSoftwareSetId: String) {
      cdkBuilder.desiredSoftwareSetId(desiredSoftwareSetId)
    }

    /**
     * The Amazon Resource Name (ARN) of the desktop to stream from Amazon WorkSpaces, WorkSpaces
     * Web, or AppStream 2.0.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-desktoparn)
     * @param desktopArn The Amazon Resource Name (ARN) of the desktop to stream from Amazon
     * WorkSpaces, WorkSpaces Web, or AppStream 2.0. 
     */
    override fun desktopArn(desktopArn: String) {
      cdkBuilder.desktopArn(desktopArn)
    }

    /**
     * The URL for the identity provider login (only for environments that use AppStream 2.0).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-desktopendpoint)
     * @param desktopEndpoint The URL for the identity provider login (only for environments that
     * use AppStream 2.0). 
     */
    override fun desktopEndpoint(desktopEndpoint: String) {
      cdkBuilder.desktopEndpoint(desktopEndpoint)
    }

    /**
     * The tag keys and optional values for the newly created devices for this environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-devicecreationtags)
     * @param deviceCreationTags The tag keys and optional values for the newly created devices for
     * this environment. 
     */
    override fun deviceCreationTags(deviceCreationTags: IResolvable) {
      cdkBuilder.deviceCreationTags(deviceCreationTags.let(IResolvable.Companion::unwrap))
    }

    /**
     * The tag keys and optional values for the newly created devices for this environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-devicecreationtags)
     * @param deviceCreationTags The tag keys and optional values for the newly created devices for
     * this environment. 
     */
    override fun deviceCreationTags(deviceCreationTags: List<Any>) {
      cdkBuilder.deviceCreationTags(deviceCreationTags.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The tag keys and optional values for the newly created devices for this environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-devicecreationtags)
     * @param deviceCreationTags The tag keys and optional values for the newly created devices for
     * this environment. 
     */
    override fun deviceCreationTags(vararg deviceCreationTags: Any): Unit =
        deviceCreationTags(deviceCreationTags.toList())

    /**
     * The Amazon Resource Name (ARN) of the AWS Key Management Service key used to encrypt the
     * environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-kmskeyarn)
     * @param kmsKeyArn The Amazon Resource Name (ARN) of the AWS Key Management Service key used to
     * encrypt the environment. 
     */
    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /**
     * A specification for a time window to apply software updates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-maintenancewindow)
     * @param maintenanceWindow A specification for a time window to apply software updates. 
     */
    override fun maintenanceWindow(maintenanceWindow: IResolvable) {
      cdkBuilder.maintenanceWindow(maintenanceWindow.let(IResolvable.Companion::unwrap))
    }

    /**
     * A specification for a time window to apply software updates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-maintenancewindow)
     * @param maintenanceWindow A specification for a time window to apply software updates. 
     */
    override fun maintenanceWindow(maintenanceWindow: MaintenanceWindowProperty) {
      cdkBuilder.maintenanceWindow(maintenanceWindow.let(MaintenanceWindowProperty.Companion::unwrap))
    }

    /**
     * A specification for a time window to apply software updates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-maintenancewindow)
     * @param maintenanceWindow A specification for a time window to apply software updates. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("519fda3457d6ed44d5fc04754070dfd2014c3c36808a6805fc980825a2fdd616")
    override fun maintenanceWindow(maintenanceWindow: MaintenanceWindowProperty.Builder.() -> Unit):
        Unit = maintenanceWindow(MaintenanceWindowProperty(maintenanceWindow))

    /**
     * The name of the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-name)
     * @param name The name of the environment. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * An option to define which software updates to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-softwaresetupdatemode)
     * @param softwareSetUpdateMode An option to define which software updates to apply. 
     */
    override fun softwareSetUpdateMode(softwareSetUpdateMode: String) {
      cdkBuilder.softwareSetUpdateMode(softwareSetUpdateMode)
    }

    /**
     * An option to define if software updates should be applied within a maintenance window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-softwaresetupdateschedule)
     * @param softwareSetUpdateSchedule An option to define if software updates should be applied
     * within a maintenance window. 
     */
    override fun softwareSetUpdateSchedule(softwareSetUpdateSchedule: String) {
      cdkBuilder.softwareSetUpdateSchedule(softwareSetUpdateSchedule)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.workspacesthinclient.CfnEnvironment =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.workspacesthinclient.CfnEnvironment.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEnvironment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEnvironment(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.workspacesthinclient.CfnEnvironment):
        CfnEnvironment = CfnEnvironment(cdkObject)

    internal fun unwrap(wrapped: CfnEnvironment):
        software.amazon.awscdk.services.workspacesthinclient.CfnEnvironment = wrapped.cdkObject as
        software.amazon.awscdk.services.workspacesthinclient.CfnEnvironment
  }

  /**
   * Describes the maintenance window for a thin client device.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.workspacesthinclient.*;
   * MaintenanceWindowProperty maintenanceWindowProperty = MaintenanceWindowProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .applyTimeOf("applyTimeOf")
   * .daysOfTheWeek(List.of("daysOfTheWeek"))
   * .endTimeHour(123)
   * .endTimeMinute(123)
   * .startTimeHour(123)
   * .startTimeMinute(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesthinclient-environment-maintenancewindow.html)
   */
  public interface MaintenanceWindowProperty {
    /**
     * The option to set the maintenance window during the device local time or Universal
     * Coordinated Time (UTC).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesthinclient-environment-maintenancewindow.html#cfn-workspacesthinclient-environment-maintenancewindow-applytimeof)
     */
    public fun applyTimeOf(): String? = unwrap(this).getApplyTimeOf()

    /**
     * The days of the week during which the maintenance window is open.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesthinclient-environment-maintenancewindow.html#cfn-workspacesthinclient-environment-maintenancewindow-daysoftheweek)
     */
    public fun daysOfTheWeek(): List<String> = unwrap(this).getDaysOfTheWeek() ?: emptyList()

    /**
     * The hour for the maintenance window end ( `00` - `23` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesthinclient-environment-maintenancewindow.html#cfn-workspacesthinclient-environment-maintenancewindow-endtimehour)
     */
    public fun endTimeHour(): Number? = unwrap(this).getEndTimeHour()

    /**
     * The minutes for the maintenance window end ( `00` - `59` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesthinclient-environment-maintenancewindow.html#cfn-workspacesthinclient-environment-maintenancewindow-endtimeminute)
     */
    public fun endTimeMinute(): Number? = unwrap(this).getEndTimeMinute()

    /**
     * The hour for the maintenance window start ( `00` - `23` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesthinclient-environment-maintenancewindow.html#cfn-workspacesthinclient-environment-maintenancewindow-starttimehour)
     */
    public fun startTimeHour(): Number? = unwrap(this).getStartTimeHour()

    /**
     * The minutes past the hour for the maintenance window start ( `00` - `59` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesthinclient-environment-maintenancewindow.html#cfn-workspacesthinclient-environment-maintenancewindow-starttimeminute)
     */
    public fun startTimeMinute(): Number? = unwrap(this).getStartTimeMinute()

    /**
     * An option to select the default or custom maintenance window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesthinclient-environment-maintenancewindow.html#cfn-workspacesthinclient-environment-maintenancewindow-type)
     */
    public fun type(): String

    /**
     * A builder for [MaintenanceWindowProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param applyTimeOf The option to set the maintenance window during the device local time or
       * Universal Coordinated Time (UTC).
       */
      public fun applyTimeOf(applyTimeOf: String)

      /**
       * @param daysOfTheWeek The days of the week during which the maintenance window is open.
       */
      public fun daysOfTheWeek(daysOfTheWeek: List<String>)

      /**
       * @param daysOfTheWeek The days of the week during which the maintenance window is open.
       */
      public fun daysOfTheWeek(vararg daysOfTheWeek: String)

      /**
       * @param endTimeHour The hour for the maintenance window end ( `00` - `23` ).
       */
      public fun endTimeHour(endTimeHour: Number)

      /**
       * @param endTimeMinute The minutes for the maintenance window end ( `00` - `59` ).
       */
      public fun endTimeMinute(endTimeMinute: Number)

      /**
       * @param startTimeHour The hour for the maintenance window start ( `00` - `23` ).
       */
      public fun startTimeHour(startTimeHour: Number)

      /**
       * @param startTimeMinute The minutes past the hour for the maintenance window start ( `00` -
       * `59` ).
       */
      public fun startTimeMinute(startTimeMinute: Number)

      /**
       * @param type An option to select the default or custom maintenance window. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.workspacesthinclient.CfnEnvironment.MaintenanceWindowProperty.Builder
          =
          software.amazon.awscdk.services.workspacesthinclient.CfnEnvironment.MaintenanceWindowProperty.builder()

      /**
       * @param applyTimeOf The option to set the maintenance window during the device local time or
       * Universal Coordinated Time (UTC).
       */
      override fun applyTimeOf(applyTimeOf: String) {
        cdkBuilder.applyTimeOf(applyTimeOf)
      }

      /**
       * @param daysOfTheWeek The days of the week during which the maintenance window is open.
       */
      override fun daysOfTheWeek(daysOfTheWeek: List<String>) {
        cdkBuilder.daysOfTheWeek(daysOfTheWeek)
      }

      /**
       * @param daysOfTheWeek The days of the week during which the maintenance window is open.
       */
      override fun daysOfTheWeek(vararg daysOfTheWeek: String): Unit =
          daysOfTheWeek(daysOfTheWeek.toList())

      /**
       * @param endTimeHour The hour for the maintenance window end ( `00` - `23` ).
       */
      override fun endTimeHour(endTimeHour: Number) {
        cdkBuilder.endTimeHour(endTimeHour)
      }

      /**
       * @param endTimeMinute The minutes for the maintenance window end ( `00` - `59` ).
       */
      override fun endTimeMinute(endTimeMinute: Number) {
        cdkBuilder.endTimeMinute(endTimeMinute)
      }

      /**
       * @param startTimeHour The hour for the maintenance window start ( `00` - `23` ).
       */
      override fun startTimeHour(startTimeHour: Number) {
        cdkBuilder.startTimeHour(startTimeHour)
      }

      /**
       * @param startTimeMinute The minutes past the hour for the maintenance window start ( `00` -
       * `59` ).
       */
      override fun startTimeMinute(startTimeMinute: Number) {
        cdkBuilder.startTimeMinute(startTimeMinute)
      }

      /**
       * @param type An option to select the default or custom maintenance window. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.workspacesthinclient.CfnEnvironment.MaintenanceWindowProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.workspacesthinclient.CfnEnvironment.MaintenanceWindowProperty,
    ) : CdkObject(cdkObject),
        MaintenanceWindowProperty {
      /**
       * The option to set the maintenance window during the device local time or Universal
       * Coordinated Time (UTC).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesthinclient-environment-maintenancewindow.html#cfn-workspacesthinclient-environment-maintenancewindow-applytimeof)
       */
      override fun applyTimeOf(): String? = unwrap(this).getApplyTimeOf()

      /**
       * The days of the week during which the maintenance window is open.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesthinclient-environment-maintenancewindow.html#cfn-workspacesthinclient-environment-maintenancewindow-daysoftheweek)
       */
      override fun daysOfTheWeek(): List<String> = unwrap(this).getDaysOfTheWeek() ?: emptyList()

      /**
       * The hour for the maintenance window end ( `00` - `23` ).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesthinclient-environment-maintenancewindow.html#cfn-workspacesthinclient-environment-maintenancewindow-endtimehour)
       */
      override fun endTimeHour(): Number? = unwrap(this).getEndTimeHour()

      /**
       * The minutes for the maintenance window end ( `00` - `59` ).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesthinclient-environment-maintenancewindow.html#cfn-workspacesthinclient-environment-maintenancewindow-endtimeminute)
       */
      override fun endTimeMinute(): Number? = unwrap(this).getEndTimeMinute()

      /**
       * The hour for the maintenance window start ( `00` - `23` ).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesthinclient-environment-maintenancewindow.html#cfn-workspacesthinclient-environment-maintenancewindow-starttimehour)
       */
      override fun startTimeHour(): Number? = unwrap(this).getStartTimeHour()

      /**
       * The minutes past the hour for the maintenance window start ( `00` - `59` ).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesthinclient-environment-maintenancewindow.html#cfn-workspacesthinclient-environment-maintenancewindow-starttimeminute)
       */
      override fun startTimeMinute(): Number? = unwrap(this).getStartTimeMinute()

      /**
       * An option to select the default or custom maintenance window.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesthinclient-environment-maintenancewindow.html#cfn-workspacesthinclient-environment-maintenancewindow-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MaintenanceWindowProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.workspacesthinclient.CfnEnvironment.MaintenanceWindowProperty):
          MaintenanceWindowProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MaintenanceWindowProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MaintenanceWindowProperty):
          software.amazon.awscdk.services.workspacesthinclient.CfnEnvironment.MaintenanceWindowProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.workspacesthinclient.CfnEnvironment.MaintenanceWindowProperty
    }
  }
}
