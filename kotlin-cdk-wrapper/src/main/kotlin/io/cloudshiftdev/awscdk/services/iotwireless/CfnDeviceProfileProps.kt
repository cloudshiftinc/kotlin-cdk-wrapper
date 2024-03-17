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
 * Properties for defining a `CfnDeviceProfile`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotwireless.*;
 * CfnDeviceProfileProps cfnDeviceProfileProps = CfnDeviceProfileProps.builder()
 * .loRaWan(LoRaWANDeviceProfileProperty.builder()
 * .classBTimeout(123)
 * .classCTimeout(123)
 * .factoryPresetFreqsList(List.of(123))
 * .macVersion("macVersion")
 * .maxDutyCycle(123)
 * .maxEirp(123)
 * .pingSlotDr(123)
 * .pingSlotFreq(123)
 * .pingSlotPeriod(123)
 * .regParamsRevision("regParamsRevision")
 * .rfRegion("rfRegion")
 * .rxDataRate2(123)
 * .rxDelay1(123)
 * .rxDrOffset1(123)
 * .rxFreq2(123)
 * .supports32BitFCnt(false)
 * .supportsClassB(false)
 * .supportsClassC(false)
 * .supportsJoin(false)
 * .build())
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-deviceprofile.html)
 */
public interface CfnDeviceProfileProps {
  /**
   * LoRaWAN device profile object.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-deviceprofile.html#cfn-iotwireless-deviceprofile-lorawan)
   */
  public fun loRaWan(): Any? = unwrap(this).getLoRaWan()

  /**
   * The name of the new resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-deviceprofile.html#cfn-iotwireless-deviceprofile-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The tags are an array of key-value pairs to attach to the specified resource.
   *
   * Tags can have a minimum of 0 and a maximum of 50 items.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-deviceprofile.html#cfn-iotwireless-deviceprofile-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDeviceProfileProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param loRaWan LoRaWAN device profile object.
     */
    public fun loRaWan(loRaWan: IResolvable)

    /**
     * @param loRaWan LoRaWAN device profile object.
     */
    public fun loRaWan(loRaWan: CfnDeviceProfile.LoRaWANDeviceProfileProperty)

    /**
     * @param loRaWan LoRaWAN device profile object.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("595a3727c23a1184daf9a6f8e8410ca34edc0463ca895c71e469ac8c6c41b991")
    public fun loRaWan(loRaWan: CfnDeviceProfile.LoRaWANDeviceProfileProperty.Builder.() -> Unit)

    /**
     * @param name The name of the new resource.
     */
    public fun name(name: String)

    /**
     * @param tags The tags are an array of key-value pairs to attach to the specified resource.
     * Tags can have a minimum of 0 and a maximum of 50 items.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags are an array of key-value pairs to attach to the specified resource.
     * Tags can have a minimum of 0 and a maximum of 50 items.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iotwireless.CfnDeviceProfileProps.Builder =
        software.amazon.awscdk.services.iotwireless.CfnDeviceProfileProps.builder()

    /**
     * @param loRaWan LoRaWAN device profile object.
     */
    override fun loRaWan(loRaWan: IResolvable) {
      cdkBuilder.loRaWan(loRaWan.let(IResolvable::unwrap))
    }

    /**
     * @param loRaWan LoRaWAN device profile object.
     */
    override fun loRaWan(loRaWan: CfnDeviceProfile.LoRaWANDeviceProfileProperty) {
      cdkBuilder.loRaWan(loRaWan.let(CfnDeviceProfile.LoRaWANDeviceProfileProperty::unwrap))
    }

    /**
     * @param loRaWan LoRaWAN device profile object.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("595a3727c23a1184daf9a6f8e8410ca34edc0463ca895c71e469ac8c6c41b991")
    override fun loRaWan(loRaWan: CfnDeviceProfile.LoRaWANDeviceProfileProperty.Builder.() -> Unit):
        Unit = loRaWan(CfnDeviceProfile.LoRaWANDeviceProfileProperty(loRaWan))

    /**
     * @param name The name of the new resource.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags The tags are an array of key-value pairs to attach to the specified resource.
     * Tags can have a minimum of 0 and a maximum of 50 items.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags are an array of key-value pairs to attach to the specified resource.
     * Tags can have a minimum of 0 and a maximum of 50 items.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotwireless.CfnDeviceProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iotwireless.CfnDeviceProfileProps,
  ) : CdkObject(cdkObject), CfnDeviceProfileProps {
    /**
     * LoRaWAN device profile object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-deviceprofile.html#cfn-iotwireless-deviceprofile-lorawan)
     */
    override fun loRaWan(): Any? = unwrap(this).getLoRaWan()

    /**
     * The name of the new resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-deviceprofile.html#cfn-iotwireless-deviceprofile-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The tags are an array of key-value pairs to attach to the specified resource.
     *
     * Tags can have a minimum of 0 and a maximum of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-deviceprofile.html#cfn-iotwireless-deviceprofile-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDeviceProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnDeviceProfileProps):
        CfnDeviceProfileProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDeviceProfileProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDeviceProfileProps):
        software.amazon.awscdk.services.iotwireless.CfnDeviceProfileProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotwireless.CfnDeviceProfileProps
  }
}
