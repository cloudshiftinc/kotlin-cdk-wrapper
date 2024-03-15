@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.devicefarm

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnNetworkProfile`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.devicefarm.*;
 * CfnNetworkProfileProps cfnNetworkProfileProps = CfnNetworkProfileProps.builder()
 * .name("name")
 * .projectArn("projectArn")
 * // the properties below are optional
 * .description("description")
 * .downlinkBandwidthBits(123)
 * .downlinkDelayMs(123)
 * .downlinkJitterMs(123)
 * .downlinkLossPercent(123)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .uplinkBandwidthBits(123)
 * .uplinkDelayMs(123)
 * .uplinkJitterMs(123)
 * .uplinkLossPercent(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html)
 */
public interface CfnNetworkProfileProps {
  /**
   * The description of the network profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The data throughput rate in bits per second, as an integer from 0 to 104857600.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-downlinkbandwidthbits)
   */
  public fun downlinkBandwidthBits(): Number? = unwrap(this).getDownlinkBandwidthBits()

  /**
   * Delay time for all packets to destination in milliseconds as an integer from 0 to 2000.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-downlinkdelayms)
   */
  public fun downlinkDelayMs(): Number? = unwrap(this).getDownlinkDelayMs()

  /**
   * Time variation in the delay of received packets in milliseconds as an integer from 0 to 2000.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-downlinkjitterms)
   */
  public fun downlinkJitterMs(): Number? = unwrap(this).getDownlinkJitterMs()

  /**
   * Proportion of received packets that fail to arrive from 0 to 100 percent.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-downlinklosspercent)
   */
  public fun downlinkLossPercent(): Number? = unwrap(this).getDownlinkLossPercent()

  /**
   * The name of the network profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-name)
   */
  public fun name(): String

  /**
   * The Amazon Resource Name (ARN) of the specified project.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-projectarn)
   */
  public fun projectArn(): String

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * in the *guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The data throughput rate in bits per second, as an integer from 0 to 104857600.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-uplinkbandwidthbits)
   */
  public fun uplinkBandwidthBits(): Number? = unwrap(this).getUplinkBandwidthBits()

  /**
   * Delay time for all packets to destination in milliseconds as an integer from 0 to 2000.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-uplinkdelayms)
   */
  public fun uplinkDelayMs(): Number? = unwrap(this).getUplinkDelayMs()

  /**
   * Time variation in the delay of received packets in milliseconds as an integer from 0 to 2000.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-uplinkjitterms)
   */
  public fun uplinkJitterMs(): Number? = unwrap(this).getUplinkJitterMs()

  /**
   * Proportion of transmitted packets that fail to arrive from 0 to 100 percent.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-uplinklosspercent)
   */
  public fun uplinkLossPercent(): Number? = unwrap(this).getUplinkLossPercent()

  /**
   * A builder for [CfnNetworkProfileProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the network profile.
     */
    public fun description(description: String)

    /**
     * @param downlinkBandwidthBits The data throughput rate in bits per second, as an integer from
     * 0 to 104857600.
     */
    public fun downlinkBandwidthBits(downlinkBandwidthBits: Number)

    /**
     * @param downlinkDelayMs Delay time for all packets to destination in milliseconds as an
     * integer from 0 to 2000.
     */
    public fun downlinkDelayMs(downlinkDelayMs: Number)

    /**
     * @param downlinkJitterMs Time variation in the delay of received packets in milliseconds as an
     * integer from 0 to 2000.
     */
    public fun downlinkJitterMs(downlinkJitterMs: Number)

    /**
     * @param downlinkLossPercent Proportion of received packets that fail to arrive from 0 to 100
     * percent.
     */
    public fun downlinkLossPercent(downlinkLossPercent: Number)

    /**
     * @param name The name of the network profile. 
     */
    public fun name(name: String)

    /**
     * @param projectArn The Amazon Resource Name (ARN) of the specified project. 
     */
    public fun projectArn(projectArn: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *guide* .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *guide* .
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param uplinkBandwidthBits The data throughput rate in bits per second, as an integer from 0
     * to 104857600.
     */
    public fun uplinkBandwidthBits(uplinkBandwidthBits: Number)

    /**
     * @param uplinkDelayMs Delay time for all packets to destination in milliseconds as an integer
     * from 0 to 2000.
     */
    public fun uplinkDelayMs(uplinkDelayMs: Number)

    /**
     * @param uplinkJitterMs Time variation in the delay of received packets in milliseconds as an
     * integer from 0 to 2000.
     */
    public fun uplinkJitterMs(uplinkJitterMs: Number)

    /**
     * @param uplinkLossPercent Proportion of transmitted packets that fail to arrive from 0 to 100
     * percent.
     */
    public fun uplinkLossPercent(uplinkLossPercent: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.devicefarm.CfnNetworkProfileProps.Builder =
        software.amazon.awscdk.services.devicefarm.CfnNetworkProfileProps.builder()

    /**
     * @param description The description of the network profile.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param downlinkBandwidthBits The data throughput rate in bits per second, as an integer from
     * 0 to 104857600.
     */
    override fun downlinkBandwidthBits(downlinkBandwidthBits: Number) {
      cdkBuilder.downlinkBandwidthBits(downlinkBandwidthBits)
    }

    /**
     * @param downlinkDelayMs Delay time for all packets to destination in milliseconds as an
     * integer from 0 to 2000.
     */
    override fun downlinkDelayMs(downlinkDelayMs: Number) {
      cdkBuilder.downlinkDelayMs(downlinkDelayMs)
    }

    /**
     * @param downlinkJitterMs Time variation in the delay of received packets in milliseconds as an
     * integer from 0 to 2000.
     */
    override fun downlinkJitterMs(downlinkJitterMs: Number) {
      cdkBuilder.downlinkJitterMs(downlinkJitterMs)
    }

    /**
     * @param downlinkLossPercent Proportion of received packets that fail to arrive from 0 to 100
     * percent.
     */
    override fun downlinkLossPercent(downlinkLossPercent: Number) {
      cdkBuilder.downlinkLossPercent(downlinkLossPercent)
    }

    /**
     * @param name The name of the network profile. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param projectArn The Amazon Resource Name (ARN) of the specified project. 
     */
    override fun projectArn(projectArn: String) {
      cdkBuilder.projectArn(projectArn)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *guide* .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *guide* .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param uplinkBandwidthBits The data throughput rate in bits per second, as an integer from 0
     * to 104857600.
     */
    override fun uplinkBandwidthBits(uplinkBandwidthBits: Number) {
      cdkBuilder.uplinkBandwidthBits(uplinkBandwidthBits)
    }

    /**
     * @param uplinkDelayMs Delay time for all packets to destination in milliseconds as an integer
     * from 0 to 2000.
     */
    override fun uplinkDelayMs(uplinkDelayMs: Number) {
      cdkBuilder.uplinkDelayMs(uplinkDelayMs)
    }

    /**
     * @param uplinkJitterMs Time variation in the delay of received packets in milliseconds as an
     * integer from 0 to 2000.
     */
    override fun uplinkJitterMs(uplinkJitterMs: Number) {
      cdkBuilder.uplinkJitterMs(uplinkJitterMs)
    }

    /**
     * @param uplinkLossPercent Proportion of transmitted packets that fail to arrive from 0 to 100
     * percent.
     */
    override fun uplinkLossPercent(uplinkLossPercent: Number) {
      cdkBuilder.uplinkLossPercent(uplinkLossPercent)
    }

    public fun build(): software.amazon.awscdk.services.devicefarm.CfnNetworkProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.devicefarm.CfnNetworkProfileProps,
  ) : CdkObject(cdkObject), CfnNetworkProfileProps {
    /**
     * The description of the network profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The data throughput rate in bits per second, as an integer from 0 to 104857600.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-downlinkbandwidthbits)
     */
    override fun downlinkBandwidthBits(): Number? = unwrap(this).getDownlinkBandwidthBits()

    /**
     * Delay time for all packets to destination in milliseconds as an integer from 0 to 2000.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-downlinkdelayms)
     */
    override fun downlinkDelayMs(): Number? = unwrap(this).getDownlinkDelayMs()

    /**
     * Time variation in the delay of received packets in milliseconds as an integer from 0 to 2000.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-downlinkjitterms)
     */
    override fun downlinkJitterMs(): Number? = unwrap(this).getDownlinkJitterMs()

    /**
     * Proportion of received packets that fail to arrive from 0 to 100 percent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-downlinklosspercent)
     */
    override fun downlinkLossPercent(): Number? = unwrap(this).getDownlinkLossPercent()

    /**
     * The name of the network profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The Amazon Resource Name (ARN) of the specified project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-projectarn)
     */
    override fun projectArn(): String = unwrap(this).getProjectArn()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The data throughput rate in bits per second, as an integer from 0 to 104857600.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-uplinkbandwidthbits)
     */
    override fun uplinkBandwidthBits(): Number? = unwrap(this).getUplinkBandwidthBits()

    /**
     * Delay time for all packets to destination in milliseconds as an integer from 0 to 2000.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-uplinkdelayms)
     */
    override fun uplinkDelayMs(): Number? = unwrap(this).getUplinkDelayMs()

    /**
     * Time variation in the delay of received packets in milliseconds as an integer from 0 to 2000.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-uplinkjitterms)
     */
    override fun uplinkJitterMs(): Number? = unwrap(this).getUplinkJitterMs()

    /**
     * Proportion of transmitted packets that fail to arrive from 0 to 100 percent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-uplinklosspercent)
     */
    override fun uplinkLossPercent(): Number? = unwrap(this).getUplinkLossPercent()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnNetworkProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.devicefarm.CfnNetworkProfileProps):
        CfnNetworkProfileProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnNetworkProfileProps):
        software.amazon.awscdk.services.devicefarm.CfnNetworkProfileProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.devicefarm.CfnNetworkProfileProps
  }
}
