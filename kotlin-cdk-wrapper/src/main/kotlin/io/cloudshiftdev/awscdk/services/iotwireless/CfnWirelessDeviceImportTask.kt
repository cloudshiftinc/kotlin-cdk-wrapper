@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotwireless

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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Information about an import task for wireless devices.
 *
 * When creating the resource, either create a single wireless device import task using the Sidewalk
 * manufacturing serial number (SMSN) of the wireless device, or create an import task for multiple
 * devices by specifying both the `DeviceCreationFile` and the `Role` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotwireless.*;
 * CfnWirelessDeviceImportTask cfnWirelessDeviceImportTask =
 * CfnWirelessDeviceImportTask.Builder.create(this, "MyCfnWirelessDeviceImportTask")
 * .destinationName("destinationName")
 * .sidewalk(SidewalkProperty.builder()
 * .deviceCreationFile("deviceCreationFile")
 * .deviceCreationFileList(List.of("deviceCreationFileList"))
 * .role("role")
 * .sidewalkManufacturingSn("sidewalkManufacturingSn")
 * .build())
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdeviceimporttask.html)
 */
public open class CfnWirelessDeviceImportTask internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTask,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The ARN (Amazon Resource Name) of the import task.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The date and time at which the wireless device import task was created.
   */
  public open fun attrCreationDate(): String = unwrap(this).getAttrCreationDate()

  /**
   * The summary information of count of wireless devices that failed to onboard to the import task.
   */
  public open fun attrFailedImportedDevicesCount(): Number =
      unwrap(this).getAttrFailedImportedDevicesCount()

  /**
   * The import task ID.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The summary information of count of wireless devices that are waiting for the control log to be
   * added to an import task.
   */
  public open fun attrInitializedImportedDevicesCount(): Number =
      unwrap(this).getAttrInitializedImportedDevicesCount()

  /**
   * The summary information of count of wireless devices that have been onboarded to the import
   * task.
   */
  public open fun attrOnboardedImportedDevicesCount(): Number =
      unwrap(this).getAttrOnboardedImportedDevicesCount()

  /**
   * The summary information of count of wireless devices that are waiting in the queue to be
   * onboarded to the import task.
   */
  public open fun attrPendingImportedDevicesCount(): Number =
      unwrap(this).getAttrPendingImportedDevicesCount()

  /**
   *
   */
  public open fun attrSidewalkDeviceCreationFileList(): List<String> =
      unwrap(this).getAttrSidewalkDeviceCreationFileList()

  /**
   * The status of a wireless device import task.
   *
   * The status can be `INITIALIZING` , `INITIALIZED` , `PENDING` , `COMPLETE` , `FAILED` , or
   * `DELETING` .
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The reason that provides additional information about the import task status.
   */
  public open fun attrStatusReason(): String = unwrap(this).getAttrStatusReason()

  /**
   * The name of the destination that describes the IoT rule to route messages from the Sidewalk
   * devices in the import task to other applications.
   */
  public open fun destinationName(): String = unwrap(this).getDestinationName()

  /**
   * The name of the destination that describes the IoT rule to route messages from the Sidewalk
   * devices in the import task to other applications.
   */
  public open fun destinationName(`value`: String) {
    unwrap(this).setDestinationName(`value`)
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
   * The Sidewalk-related information of the wireless device import task.
   */
  public open fun sidewalk(): Any = unwrap(this).getSidewalk()

  /**
   * The Sidewalk-related information of the wireless device import task.
   */
  public open fun sidewalk(`value`: IResolvable) {
    unwrap(this).setSidewalk(`value`.let(IResolvable::unwrap))
  }

  /**
   * The Sidewalk-related information of the wireless device import task.
   */
  public open fun sidewalk(`value`: SidewalkProperty) {
    unwrap(this).setSidewalk(`value`.let(SidewalkProperty::unwrap))
  }

  /**
   * The Sidewalk-related information of the wireless device import task.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f795bf524d146d57223cf1813dcf96f73cd0d35b8be75b71a849a32ac93efcc6")
  public open fun sidewalk(`value`: SidewalkProperty.Builder.() -> Unit): Unit =
      sidewalk(SidewalkProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Adds to or modifies the tags of the given resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Adds to or modifies the tags of the given resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Adds to or modifies the tags of the given resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.iotwireless.CfnWirelessDeviceImportTask].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the destination that describes the IoT rule to route messages from the Sidewalk
     * devices in the import task to other applications.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdeviceimporttask.html#cfn-iotwireless-wirelessdeviceimporttask-destinationname)
     * @param destinationName The name of the destination that describes the IoT rule to route
     * messages from the Sidewalk devices in the import task to other applications. 
     */
    public fun destinationName(destinationName: String)

    /**
     * The Sidewalk-related information of the wireless device import task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdeviceimporttask.html#cfn-iotwireless-wirelessdeviceimporttask-sidewalk)
     * @param sidewalk The Sidewalk-related information of the wireless device import task. 
     */
    public fun sidewalk(sidewalk: IResolvable)

    /**
     * The Sidewalk-related information of the wireless device import task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdeviceimporttask.html#cfn-iotwireless-wirelessdeviceimporttask-sidewalk)
     * @param sidewalk The Sidewalk-related information of the wireless device import task. 
     */
    public fun sidewalk(sidewalk: SidewalkProperty)

    /**
     * The Sidewalk-related information of the wireless device import task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdeviceimporttask.html#cfn-iotwireless-wirelessdeviceimporttask-sidewalk)
     * @param sidewalk The Sidewalk-related information of the wireless device import task. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("618b8fa4fb0220c54e94bd1ed512f164f5fbddbea8503e502a125a9aab7252d8")
    public fun sidewalk(sidewalk: SidewalkProperty.Builder.() -> Unit)

    /**
     * Adds to or modifies the tags of the given resource.
     *
     * Tags are metadata that you can use to manage a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdeviceimporttask.html#cfn-iotwireless-wirelessdeviceimporttask-tags)
     * @param tags Adds to or modifies the tags of the given resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Adds to or modifies the tags of the given resource.
     *
     * Tags are metadata that you can use to manage a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdeviceimporttask.html#cfn-iotwireless-wirelessdeviceimporttask-tags)
     * @param tags Adds to or modifies the tags of the given resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTask.Builder =
        software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTask.Builder.create(scope,
        id)

    /**
     * The name of the destination that describes the IoT rule to route messages from the Sidewalk
     * devices in the import task to other applications.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdeviceimporttask.html#cfn-iotwireless-wirelessdeviceimporttask-destinationname)
     * @param destinationName The name of the destination that describes the IoT rule to route
     * messages from the Sidewalk devices in the import task to other applications. 
     */
    override fun destinationName(destinationName: String) {
      cdkBuilder.destinationName(destinationName)
    }

    /**
     * The Sidewalk-related information of the wireless device import task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdeviceimporttask.html#cfn-iotwireless-wirelessdeviceimporttask-sidewalk)
     * @param sidewalk The Sidewalk-related information of the wireless device import task. 
     */
    override fun sidewalk(sidewalk: IResolvable) {
      cdkBuilder.sidewalk(sidewalk.let(IResolvable::unwrap))
    }

    /**
     * The Sidewalk-related information of the wireless device import task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdeviceimporttask.html#cfn-iotwireless-wirelessdeviceimporttask-sidewalk)
     * @param sidewalk The Sidewalk-related information of the wireless device import task. 
     */
    override fun sidewalk(sidewalk: SidewalkProperty) {
      cdkBuilder.sidewalk(sidewalk.let(SidewalkProperty::unwrap))
    }

    /**
     * The Sidewalk-related information of the wireless device import task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdeviceimporttask.html#cfn-iotwireless-wirelessdeviceimporttask-sidewalk)
     * @param sidewalk The Sidewalk-related information of the wireless device import task. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("618b8fa4fb0220c54e94bd1ed512f164f5fbddbea8503e502a125a9aab7252d8")
    override fun sidewalk(sidewalk: SidewalkProperty.Builder.() -> Unit): Unit =
        sidewalk(SidewalkProperty(sidewalk))

    /**
     * Adds to or modifies the tags of the given resource.
     *
     * Tags are metadata that you can use to manage a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdeviceimporttask.html#cfn-iotwireless-wirelessdeviceimporttask-tags)
     * @param tags Adds to or modifies the tags of the given resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Adds to or modifies the tags of the given resource.
     *
     * Tags are metadata that you can use to manage a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdeviceimporttask.html#cfn-iotwireless-wirelessdeviceimporttask-tags)
     * @param tags Adds to or modifies the tags of the given resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTask =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTask.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWirelessDeviceImportTask {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWirelessDeviceImportTask(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTask):
        CfnWirelessDeviceImportTask = CfnWirelessDeviceImportTask(cdkObject)

    internal fun unwrap(wrapped: CfnWirelessDeviceImportTask):
        software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTask = wrapped.cdkObject
  }

  /**
   * Sidewalk-related information about a wireless device import task.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotwireless.*;
   * SidewalkProperty sidewalkProperty = SidewalkProperty.builder()
   * .deviceCreationFile("deviceCreationFile")
   * .deviceCreationFileList(List.of("deviceCreationFileList"))
   * .role("role")
   * .sidewalkManufacturingSn("sidewalkManufacturingSn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdeviceimporttask-sidewalk.html)
   */
  public interface SidewalkProperty {
    /**
     * The CSV file contained in an S3 bucket that's used for adding devices to an import task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdeviceimporttask-sidewalk.html#cfn-iotwireless-wirelessdeviceimporttask-sidewalk-devicecreationfile)
     */
    public fun deviceCreationFile(): String? = unwrap(this).getDeviceCreationFile()

    /**
     * List of Sidewalk devices that are added to the import task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdeviceimporttask-sidewalk.html#cfn-iotwireless-wirelessdeviceimporttask-sidewalk-devicecreationfilelist)
     */
    public fun deviceCreationFileList(): List<String> = unwrap(this).getDeviceCreationFileList() ?:
        emptyList()

    /**
     * The IAM role that allows AWS IoT Wireless to access the CSV file in the S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdeviceimporttask-sidewalk.html#cfn-iotwireless-wirelessdeviceimporttask-sidewalk-role)
     */
    public fun role(): String? = unwrap(this).getRole()

    /**
     * The Sidewalk manufacturing serial number (SMSN) of the Sidewalk device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdeviceimporttask-sidewalk.html#cfn-iotwireless-wirelessdeviceimporttask-sidewalk-sidewalkmanufacturingsn)
     */
    public fun sidewalkManufacturingSn(): String? = unwrap(this).getSidewalkManufacturingSn()

    /**
     * A builder for [SidewalkProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param deviceCreationFile The CSV file contained in an S3 bucket that's used for adding
       * devices to an import task.
       */
      public fun deviceCreationFile(deviceCreationFile: String)

      /**
       * @param deviceCreationFileList List of Sidewalk devices that are added to the import task.
       */
      public fun deviceCreationFileList(deviceCreationFileList: List<String>)

      /**
       * @param deviceCreationFileList List of Sidewalk devices that are added to the import task.
       */
      public fun deviceCreationFileList(vararg deviceCreationFileList: String)

      /**
       * @param role The IAM role that allows AWS IoT Wireless to access the CSV file in the S3
       * bucket.
       */
      public fun role(role: String)

      /**
       * @param sidewalkManufacturingSn The Sidewalk manufacturing serial number (SMSN) of the
       * Sidewalk device.
       */
      public fun sidewalkManufacturingSn(sidewalkManufacturingSn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTask.SidewalkProperty.Builder
          =
          software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTask.SidewalkProperty.builder()

      /**
       * @param deviceCreationFile The CSV file contained in an S3 bucket that's used for adding
       * devices to an import task.
       */
      override fun deviceCreationFile(deviceCreationFile: String) {
        cdkBuilder.deviceCreationFile(deviceCreationFile)
      }

      /**
       * @param deviceCreationFileList List of Sidewalk devices that are added to the import task.
       */
      override fun deviceCreationFileList(deviceCreationFileList: List<String>) {
        cdkBuilder.deviceCreationFileList(deviceCreationFileList)
      }

      /**
       * @param deviceCreationFileList List of Sidewalk devices that are added to the import task.
       */
      override fun deviceCreationFileList(vararg deviceCreationFileList: String): Unit =
          deviceCreationFileList(deviceCreationFileList.toList())

      /**
       * @param role The IAM role that allows AWS IoT Wireless to access the CSV file in the S3
       * bucket.
       */
      override fun role(role: String) {
        cdkBuilder.role(role)
      }

      /**
       * @param sidewalkManufacturingSn The Sidewalk manufacturing serial number (SMSN) of the
       * Sidewalk device.
       */
      override fun sidewalkManufacturingSn(sidewalkManufacturingSn: String) {
        cdkBuilder.sidewalkManufacturingSn(sidewalkManufacturingSn)
      }

      public fun build():
          software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTask.SidewalkProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTask.SidewalkProperty,
    ) : CdkObject(cdkObject), SidewalkProperty {
      /**
       * The CSV file contained in an S3 bucket that's used for adding devices to an import task.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdeviceimporttask-sidewalk.html#cfn-iotwireless-wirelessdeviceimporttask-sidewalk-devicecreationfile)
       */
      override fun deviceCreationFile(): String? = unwrap(this).getDeviceCreationFile()

      /**
       * List of Sidewalk devices that are added to the import task.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdeviceimporttask-sidewalk.html#cfn-iotwireless-wirelessdeviceimporttask-sidewalk-devicecreationfilelist)
       */
      override fun deviceCreationFileList(): List<String> = unwrap(this).getDeviceCreationFileList()
          ?: emptyList()

      /**
       * The IAM role that allows AWS IoT Wireless to access the CSV file in the S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdeviceimporttask-sidewalk.html#cfn-iotwireless-wirelessdeviceimporttask-sidewalk-role)
       */
      override fun role(): String? = unwrap(this).getRole()

      /**
       * The Sidewalk manufacturing serial number (SMSN) of the Sidewalk device.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdeviceimporttask-sidewalk.html#cfn-iotwireless-wirelessdeviceimporttask-sidewalk-sidewalkmanufacturingsn)
       */
      override fun sidewalkManufacturingSn(): String? = unwrap(this).getSidewalkManufacturingSn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SidewalkProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTask.SidewalkProperty):
          SidewalkProperty = CdkObjectWrappers.wrap(cdkObject) as? SidewalkProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SidewalkProperty):
          software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTask.SidewalkProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTask.SidewalkProperty
    }
  }
}
