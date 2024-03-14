package io.cloudshiftdev.awscdk.services.iot1click

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDevice internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iot1click.CfnDevice,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The ARN of the device, such as
   * `arn:aws:iot1click:us-west-2:123456789012:devices/G030PX0312744DWM` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The unique identifier of the device.
   */
  public open fun attrDeviceId(): String = unwrap(this).getAttrDeviceId()

  /**
   * A Boolean value indicating whether the device is enabled ( `true` ) or not ( `false` ).
   */
  public open fun attrEnabled(): IResolvable = unwrap(this).getAttrEnabled().let(IResolvable::wrap)

  /**
   * The ID of the device, such as `G030PX0312744DWM` .
   */
  public open fun deviceId(): String = unwrap(this).getDeviceId()

  /**
   * The ID of the device, such as `G030PX0312744DWM` .
   */
  public open fun deviceId(`value`: String) {
    unwrap(this).setDeviceId(`value`)
  }

  /**
   * A Boolean value indicating whether the device is enabled ( `true` ) or not ( `false` ).
   */
  public open fun enabled(): Any = unwrap(this).getEnabled()

  /**
   * A Boolean value indicating whether the device is enabled ( `true` ) or not ( `false` ).
   */
  public open fun enabled(`value`: Boolean) {
    unwrap(this).setEnabled(`value`)
  }

  /**
   * A Boolean value indicating whether the device is enabled ( `true` ) or not ( `false` ).
   */
  public open fun enabled(`value`: IResolvable) {
    unwrap(this).setEnabled(`value`.let(IResolvable::unwrap))
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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iot1click.CfnDevice].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the device, such as `G030PX0312744DWM` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-device.html#cfn-iot1click-device-deviceid)
     * @param deviceId The ID of the device, such as `G030PX0312744DWM` . 
     */
    public fun deviceId(deviceId: String)

    /**
     * A Boolean value indicating whether the device is enabled ( `true` ) or not ( `false` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-device.html#cfn-iot1click-device-enabled)
     * @param enabled A Boolean value indicating whether the device is enabled ( `true` ) or not (
     * `false` ). 
     */
    public fun enabled(enabled: Boolean)

    /**
     * A Boolean value indicating whether the device is enabled ( `true` ) or not ( `false` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-device.html#cfn-iot1click-device-enabled)
     * @param enabled A Boolean value indicating whether the device is enabled ( `true` ) or not (
     * `false` ). 
     */
    public fun enabled(enabled: IResolvable)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot1click.CfnDevice.Builder =
        software.amazon.awscdk.services.iot1click.CfnDevice.Builder.create(scope, id)

    /**
     * The ID of the device, such as `G030PX0312744DWM` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-device.html#cfn-iot1click-device-deviceid)
     * @param deviceId The ID of the device, such as `G030PX0312744DWM` . 
     */
    override fun deviceId(deviceId: String) {
      cdkBuilder.deviceId(deviceId)
    }

    /**
     * A Boolean value indicating whether the device is enabled ( `true` ) or not ( `false` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-device.html#cfn-iot1click-device-enabled)
     * @param enabled A Boolean value indicating whether the device is enabled ( `true` ) or not (
     * `false` ). 
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * A Boolean value indicating whether the device is enabled ( `true` ) or not ( `false` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-device.html#cfn-iot1click-device-enabled)
     * @param enabled A Boolean value indicating whether the device is enabled ( `true` ) or not (
     * `false` ). 
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.iot1click.CfnDevice = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDevice {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDevice(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot1click.CfnDevice): CfnDevice =
        CfnDevice(cdkObject)

    internal fun unwrap(wrapped: CfnDevice): software.amazon.awscdk.services.iot1click.CfnDevice =
        wrapped.cdkObject
  }
}
