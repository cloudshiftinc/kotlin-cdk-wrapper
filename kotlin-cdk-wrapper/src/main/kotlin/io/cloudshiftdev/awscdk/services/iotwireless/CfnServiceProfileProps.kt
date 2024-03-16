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
 * Properties for defining a `CfnServiceProfile`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotwireless.*;
 * CfnServiceProfileProps cfnServiceProfileProps = CfnServiceProfileProps.builder()
 * .loRaWan(LoRaWANServiceProfileProperty.builder()
 * .addGwMetadata(false)
 * .channelMask("channelMask")
 * .devStatusReqFreq(123)
 * .dlBucketSize(123)
 * .dlRate(123)
 * .dlRatePolicy("dlRatePolicy")
 * .drMax(123)
 * .drMin(123)
 * .hrAllowed(false)
 * .minGwDiversity(123)
 * .nwkGeoLoc(false)
 * .prAllowed(false)
 * .raAllowed(false)
 * .reportDevStatusBattery(false)
 * .reportDevStatusMargin(false)
 * .targetPer(123)
 * .ulBucketSize(123)
 * .ulRate(123)
 * .ulRatePolicy("ulRatePolicy")
 * .build())
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-serviceprofile.html)
 */
public interface CfnServiceProfileProps {
  /**
   * LoRaWAN service profile object.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-serviceprofile.html#cfn-iotwireless-serviceprofile-lorawan)
   */
  public fun loRaWan(): Any? = unwrap(this).getLoRaWan()

  /**
   * The name of the new resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-serviceprofile.html#cfn-iotwireless-serviceprofile-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The tags are an array of key-value pairs to attach to the specified resource.
   *
   * Tags can have a minimum of 0 and a maximum of 50 items.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-serviceprofile.html#cfn-iotwireless-serviceprofile-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnServiceProfileProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param loRaWan LoRaWAN service profile object.
     */
    public fun loRaWan(loRaWan: IResolvable)

    /**
     * @param loRaWan LoRaWAN service profile object.
     */
    public fun loRaWan(loRaWan: CfnServiceProfile.LoRaWANServiceProfileProperty)

    /**
     * @param loRaWan LoRaWAN service profile object.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6c47de0670d7063e8b0de3843c952b2697d1a15f5a3ed4e9f96781c7531fbed3")
    public fun loRaWan(loRaWan: CfnServiceProfile.LoRaWANServiceProfileProperty.Builder.() -> Unit)

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
        software.amazon.awscdk.services.iotwireless.CfnServiceProfileProps.Builder =
        software.amazon.awscdk.services.iotwireless.CfnServiceProfileProps.builder()

    /**
     * @param loRaWan LoRaWAN service profile object.
     */
    override fun loRaWan(loRaWan: IResolvable) {
      cdkBuilder.loRaWan(loRaWan.let(IResolvable::unwrap))
    }

    /**
     * @param loRaWan LoRaWAN service profile object.
     */
    override fun loRaWan(loRaWan: CfnServiceProfile.LoRaWANServiceProfileProperty) {
      cdkBuilder.loRaWan(loRaWan.let(CfnServiceProfile.LoRaWANServiceProfileProperty::unwrap))
    }

    /**
     * @param loRaWan LoRaWAN service profile object.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6c47de0670d7063e8b0de3843c952b2697d1a15f5a3ed4e9f96781c7531fbed3")
    override
        fun loRaWan(loRaWan: CfnServiceProfile.LoRaWANServiceProfileProperty.Builder.() -> Unit):
        Unit = loRaWan(CfnServiceProfile.LoRaWANServiceProfileProperty(loRaWan))

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

    public fun build(): software.amazon.awscdk.services.iotwireless.CfnServiceProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iotwireless.CfnServiceProfileProps,
  ) : CdkObject(cdkObject), CfnServiceProfileProps {
    /**
     * LoRaWAN service profile object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-serviceprofile.html#cfn-iotwireless-serviceprofile-lorawan)
     */
    override fun loRaWan(): Any? = unwrap(this).getLoRaWan()

    /**
     * The name of the new resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-serviceprofile.html#cfn-iotwireless-serviceprofile-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The tags are an array of key-value pairs to attach to the specified resource.
     *
     * Tags can have a minimum of 0 and a maximum of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-serviceprofile.html#cfn-iotwireless-serviceprofile-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnServiceProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnServiceProfileProps):
        CfnServiceProfileProps = CdkObjectWrappers.wrap(cdkObject) as CfnServiceProfileProps

    internal fun unwrap(wrapped: CfnServiceProfileProps):
        software.amazon.awscdk.services.iotwireless.CfnServiceProfileProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotwireless.CfnServiceProfileProps
  }
}
