@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotwireless

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnWirelessDeviceImportTask`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotwireless.*;
 * CfnWirelessDeviceImportTaskProps cfnWirelessDeviceImportTaskProps =
 * CfnWirelessDeviceImportTaskProps.builder()
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
public interface CfnWirelessDeviceImportTaskProps {
  /**
   * The name of the destination that describes the IoT rule to route messages from the Sidewalk
   * devices in the import task to other applications.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdeviceimporttask.html#cfn-iotwireless-wirelessdeviceimporttask-destinationname)
   */
  public fun destinationName(): String

  /**
   * The Sidewalk-related information of the wireless device import task.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdeviceimporttask.html#cfn-iotwireless-wirelessdeviceimporttask-sidewalk)
   */
  public fun sidewalk(): Any

  /**
   * Adds to or modifies the tags of the given resource.
   *
   * Tags are metadata that you can use to manage a resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdeviceimporttask.html#cfn-iotwireless-wirelessdeviceimporttask-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnWirelessDeviceImportTaskProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param destinationName The name of the destination that describes the IoT rule to route
     * messages from the Sidewalk devices in the import task to other applications. 
     */
    public fun destinationName(destinationName: String)

    /**
     * @param sidewalk The Sidewalk-related information of the wireless device import task. 
     */
    public fun sidewalk(sidewalk: IResolvable)

    /**
     * @param sidewalk The Sidewalk-related information of the wireless device import task. 
     */
    public fun sidewalk(sidewalk: CfnWirelessDeviceImportTask.SidewalkProperty)

    /**
     * @param sidewalk The Sidewalk-related information of the wireless device import task. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3acd147cb1564d5956888f90f52255eca986a3d8e64ae9bd2222b16e3e4dda45")
    public fun sidewalk(sidewalk: CfnWirelessDeviceImportTask.SidewalkProperty.Builder.() -> Unit)

    /**
     * @param tags Adds to or modifies the tags of the given resource.
     * Tags are metadata that you can use to manage a resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Adds to or modifies the tags of the given resource.
     * Tags are metadata that you can use to manage a resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTaskProps.Builder =
        software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTaskProps.builder()

    /**
     * @param destinationName The name of the destination that describes the IoT rule to route
     * messages from the Sidewalk devices in the import task to other applications. 
     */
    override fun destinationName(destinationName: String) {
      cdkBuilder.destinationName(destinationName)
    }

    /**
     * @param sidewalk The Sidewalk-related information of the wireless device import task. 
     */
    override fun sidewalk(sidewalk: IResolvable) {
      cdkBuilder.sidewalk(sidewalk.let(IResolvable::unwrap))
    }

    /**
     * @param sidewalk The Sidewalk-related information of the wireless device import task. 
     */
    override fun sidewalk(sidewalk: CfnWirelessDeviceImportTask.SidewalkProperty) {
      cdkBuilder.sidewalk(sidewalk.let(CfnWirelessDeviceImportTask.SidewalkProperty::unwrap))
    }

    /**
     * @param sidewalk The Sidewalk-related information of the wireless device import task. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3acd147cb1564d5956888f90f52255eca986a3d8e64ae9bd2222b16e3e4dda45")
    override
        fun sidewalk(sidewalk: CfnWirelessDeviceImportTask.SidewalkProperty.Builder.() -> Unit):
        Unit = sidewalk(CfnWirelessDeviceImportTask.SidewalkProperty(sidewalk))

    /**
     * @param tags Adds to or modifies the tags of the given resource.
     * Tags are metadata that you can use to manage a resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Adds to or modifies the tags of the given resource.
     * Tags are metadata that you can use to manage a resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTaskProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTaskProps,
  ) : CdkObject(cdkObject), CfnWirelessDeviceImportTaskProps {
    /**
     * The name of the destination that describes the IoT rule to route messages from the Sidewalk
     * devices in the import task to other applications.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdeviceimporttask.html#cfn-iotwireless-wirelessdeviceimporttask-destinationname)
     */
    override fun destinationName(): String = unwrap(this).getDestinationName()

    /**
     * The Sidewalk-related information of the wireless device import task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdeviceimporttask.html#cfn-iotwireless-wirelessdeviceimporttask-sidewalk)
     */
    override fun sidewalk(): Any = unwrap(this).getSidewalk()

    /**
     * Adds to or modifies the tags of the given resource.
     *
     * Tags are metadata that you can use to manage a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdeviceimporttask.html#cfn-iotwireless-wirelessdeviceimporttask-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWirelessDeviceImportTaskProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTaskProps):
        CfnWirelessDeviceImportTaskProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnWirelessDeviceImportTaskProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWirelessDeviceImportTaskProps):
        software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTaskProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTaskProps
  }
}
