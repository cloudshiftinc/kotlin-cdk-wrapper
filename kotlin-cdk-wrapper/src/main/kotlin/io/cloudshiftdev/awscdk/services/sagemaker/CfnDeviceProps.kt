@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

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
 * Properties for defining a `CfnDevice`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
 * CfnDeviceProps cfnDeviceProps = CfnDeviceProps.builder()
 * .deviceFleetName("deviceFleetName")
 * // the properties below are optional
 * .device(DeviceProperty.builder()
 * .deviceName("deviceName")
 * // the properties below are optional
 * .description("description")
 * .iotThingName("iotThingName")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-device.html)
 */
public interface CfnDeviceProps {
  /**
   * Edge device you want to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-device.html#cfn-sagemaker-device-device)
   */
  public fun device(): Any? = unwrap(this).getDevice()

  /**
   * The name of the fleet the device belongs to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-device.html#cfn-sagemaker-device-devicefleetname)
   */
  public fun deviceFleetName(): String

  /**
   * An array of key-value pairs that contain metadata to help you categorize and organize your
   * devices.
   *
   * Each tag consists of a key and a value, both of which you define.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-device.html#cfn-sagemaker-device-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDeviceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param device Edge device you want to create.
     */
    public fun device(device: IResolvable)

    /**
     * @param device Edge device you want to create.
     */
    public fun device(device: CfnDevice.DeviceProperty)

    /**
     * @param device Edge device you want to create.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e77015af47b1a3894f4fc64c339039463fb44600eb3022079ffd4771281e17cc")
    public fun device(device: CfnDevice.DeviceProperty.Builder.() -> Unit)

    /**
     * @param deviceFleetName The name of the fleet the device belongs to. 
     */
    public fun deviceFleetName(deviceFleetName: String)

    /**
     * @param tags An array of key-value pairs that contain metadata to help you categorize and
     * organize your devices.
     * Each tag consists of a key and a value, both of which you define.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs that contain metadata to help you categorize and
     * organize your devices.
     * Each tag consists of a key and a value, both of which you define.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnDeviceProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnDeviceProps.builder()

    /**
     * @param device Edge device you want to create.
     */
    override fun device(device: IResolvable) {
      cdkBuilder.device(device.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param device Edge device you want to create.
     */
    override fun device(device: CfnDevice.DeviceProperty) {
      cdkBuilder.device(device.let(CfnDevice.DeviceProperty.Companion::unwrap))
    }

    /**
     * @param device Edge device you want to create.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e77015af47b1a3894f4fc64c339039463fb44600eb3022079ffd4771281e17cc")
    override fun device(device: CfnDevice.DeviceProperty.Builder.() -> Unit): Unit =
        device(CfnDevice.DeviceProperty(device))

    /**
     * @param deviceFleetName The name of the fleet the device belongs to. 
     */
    override fun deviceFleetName(deviceFleetName: String) {
      cdkBuilder.deviceFleetName(deviceFleetName)
    }

    /**
     * @param tags An array of key-value pairs that contain metadata to help you categorize and
     * organize your devices.
     * Each tag consists of a key and a value, both of which you define.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of key-value pairs that contain metadata to help you categorize and
     * organize your devices.
     * Each tag consists of a key and a value, both of which you define.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnDeviceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.sagemaker.CfnDeviceProps,
  ) : CdkObject(cdkObject), CfnDeviceProps {
    /**
     * Edge device you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-device.html#cfn-sagemaker-device-device)
     */
    override fun device(): Any? = unwrap(this).getDevice()

    /**
     * The name of the fleet the device belongs to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-device.html#cfn-sagemaker-device-devicefleetname)
     */
    override fun deviceFleetName(): String = unwrap(this).getDeviceFleetName()

    /**
     * An array of key-value pairs that contain metadata to help you categorize and organize your
     * devices.
     *
     * Each tag consists of a key and a value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-device.html#cfn-sagemaker-device-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDeviceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDeviceProps):
        CfnDeviceProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDeviceProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDeviceProps):
        software.amazon.awscdk.services.sagemaker.CfnDeviceProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.sagemaker.CfnDeviceProps
  }
}
