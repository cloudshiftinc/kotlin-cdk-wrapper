@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.devicefarm

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a network profile.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.devicefarm.*;
 * CfnNetworkProfile cfnNetworkProfile = CfnNetworkProfile.Builder.create(this,
 * "MyCfnNetworkProfile")
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
public open class CfnNetworkProfile(
  cdkObject: software.amazon.awscdk.services.devicefarm.CfnNetworkProfile,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnNetworkProfileProps,
  ) :
      this(software.amazon.awscdk.services.devicefarm.CfnNetworkProfile(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnNetworkProfileProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnNetworkProfileProps.Builder.() -> Unit,
  ) : this(scope, id, CfnNetworkProfileProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the network profile.
   *
   * See [Amazon resource
   * names](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) in the *General
   * Reference guide* .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The description of the network profile.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the network profile.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The data throughput rate in bits per second, as an integer from 0 to 104857600.
   */
  public open fun downlinkBandwidthBits(): Number? = unwrap(this).getDownlinkBandwidthBits()

  /**
   * The data throughput rate in bits per second, as an integer from 0 to 104857600.
   */
  public open fun downlinkBandwidthBits(`value`: Number) {
    unwrap(this).setDownlinkBandwidthBits(`value`)
  }

  /**
   * Delay time for all packets to destination in milliseconds as an integer from 0 to 2000.
   */
  public open fun downlinkDelayMs(): Number? = unwrap(this).getDownlinkDelayMs()

  /**
   * Delay time for all packets to destination in milliseconds as an integer from 0 to 2000.
   */
  public open fun downlinkDelayMs(`value`: Number) {
    unwrap(this).setDownlinkDelayMs(`value`)
  }

  /**
   * Time variation in the delay of received packets in milliseconds as an integer from 0 to 2000.
   */
  public open fun downlinkJitterMs(): Number? = unwrap(this).getDownlinkJitterMs()

  /**
   * Time variation in the delay of received packets in milliseconds as an integer from 0 to 2000.
   */
  public open fun downlinkJitterMs(`value`: Number) {
    unwrap(this).setDownlinkJitterMs(`value`)
  }

  /**
   * Proportion of received packets that fail to arrive from 0 to 100 percent.
   */
  public open fun downlinkLossPercent(): Number? = unwrap(this).getDownlinkLossPercent()

  /**
   * Proportion of received packets that fail to arrive from 0 to 100 percent.
   */
  public open fun downlinkLossPercent(`value`: Number) {
    unwrap(this).setDownlinkLossPercent(`value`)
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
   * The name of the network profile.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the network profile.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the specified project.
   */
  public open fun projectArn(): String = unwrap(this).getProjectArn()

  /**
   * The Amazon Resource Name (ARN) of the specified project.
   */
  public open fun projectArn(`value`: String) {
    unwrap(this).setProjectArn(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The data throughput rate in bits per second, as an integer from 0 to 104857600.
   */
  public open fun uplinkBandwidthBits(): Number? = unwrap(this).getUplinkBandwidthBits()

  /**
   * The data throughput rate in bits per second, as an integer from 0 to 104857600.
   */
  public open fun uplinkBandwidthBits(`value`: Number) {
    unwrap(this).setUplinkBandwidthBits(`value`)
  }

  /**
   * Delay time for all packets to destination in milliseconds as an integer from 0 to 2000.
   */
  public open fun uplinkDelayMs(): Number? = unwrap(this).getUplinkDelayMs()

  /**
   * Delay time for all packets to destination in milliseconds as an integer from 0 to 2000.
   */
  public open fun uplinkDelayMs(`value`: Number) {
    unwrap(this).setUplinkDelayMs(`value`)
  }

  /**
   * Time variation in the delay of received packets in milliseconds as an integer from 0 to 2000.
   */
  public open fun uplinkJitterMs(): Number? = unwrap(this).getUplinkJitterMs()

  /**
   * Time variation in the delay of received packets in milliseconds as an integer from 0 to 2000.
   */
  public open fun uplinkJitterMs(`value`: Number) {
    unwrap(this).setUplinkJitterMs(`value`)
  }

  /**
   * Proportion of transmitted packets that fail to arrive from 0 to 100 percent.
   */
  public open fun uplinkLossPercent(): Number? = unwrap(this).getUplinkLossPercent()

  /**
   * Proportion of transmitted packets that fail to arrive from 0 to 100 percent.
   */
  public open fun uplinkLossPercent(`value`: Number) {
    unwrap(this).setUplinkLossPercent(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.devicefarm.CfnNetworkProfile].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the network profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-description)
     * @param description The description of the network profile. 
     */
    public fun description(description: String)

    /**
     * The data throughput rate in bits per second, as an integer from 0 to 104857600.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-downlinkbandwidthbits)
     * @param downlinkBandwidthBits The data throughput rate in bits per second, as an integer from
     * 0 to 104857600. 
     */
    public fun downlinkBandwidthBits(downlinkBandwidthBits: Number)

    /**
     * Delay time for all packets to destination in milliseconds as an integer from 0 to 2000.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-downlinkdelayms)
     * @param downlinkDelayMs Delay time for all packets to destination in milliseconds as an
     * integer from 0 to 2000. 
     */
    public fun downlinkDelayMs(downlinkDelayMs: Number)

    /**
     * Time variation in the delay of received packets in milliseconds as an integer from 0 to 2000.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-downlinkjitterms)
     * @param downlinkJitterMs Time variation in the delay of received packets in milliseconds as an
     * integer from 0 to 2000. 
     */
    public fun downlinkJitterMs(downlinkJitterMs: Number)

    /**
     * Proportion of received packets that fail to arrive from 0 to 100 percent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-downlinklosspercent)
     * @param downlinkLossPercent Proportion of received packets that fail to arrive from 0 to 100
     * percent. 
     */
    public fun downlinkLossPercent(downlinkLossPercent: Number)

    /**
     * The name of the network profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-name)
     * @param name The name of the network profile. 
     */
    public fun name(name: String)

    /**
     * The Amazon Resource Name (ARN) of the specified project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-projectarn)
     * @param projectArn The Amazon Resource Name (ARN) of the specified project. 
     */
    public fun projectArn(projectArn: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The data throughput rate in bits per second, as an integer from 0 to 104857600.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-uplinkbandwidthbits)
     * @param uplinkBandwidthBits The data throughput rate in bits per second, as an integer from 0
     * to 104857600. 
     */
    public fun uplinkBandwidthBits(uplinkBandwidthBits: Number)

    /**
     * Delay time for all packets to destination in milliseconds as an integer from 0 to 2000.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-uplinkdelayms)
     * @param uplinkDelayMs Delay time for all packets to destination in milliseconds as an integer
     * from 0 to 2000. 
     */
    public fun uplinkDelayMs(uplinkDelayMs: Number)

    /**
     * Time variation in the delay of received packets in milliseconds as an integer from 0 to 2000.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-uplinkjitterms)
     * @param uplinkJitterMs Time variation in the delay of received packets in milliseconds as an
     * integer from 0 to 2000. 
     */
    public fun uplinkJitterMs(uplinkJitterMs: Number)

    /**
     * Proportion of transmitted packets that fail to arrive from 0 to 100 percent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-uplinklosspercent)
     * @param uplinkLossPercent Proportion of transmitted packets that fail to arrive from 0 to 100
     * percent. 
     */
    public fun uplinkLossPercent(uplinkLossPercent: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.devicefarm.CfnNetworkProfile.Builder =
        software.amazon.awscdk.services.devicefarm.CfnNetworkProfile.Builder.create(scope, id)

    /**
     * The description of the network profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-description)
     * @param description The description of the network profile. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The data throughput rate in bits per second, as an integer from 0 to 104857600.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-downlinkbandwidthbits)
     * @param downlinkBandwidthBits The data throughput rate in bits per second, as an integer from
     * 0 to 104857600. 
     */
    override fun downlinkBandwidthBits(downlinkBandwidthBits: Number) {
      cdkBuilder.downlinkBandwidthBits(downlinkBandwidthBits)
    }

    /**
     * Delay time for all packets to destination in milliseconds as an integer from 0 to 2000.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-downlinkdelayms)
     * @param downlinkDelayMs Delay time for all packets to destination in milliseconds as an
     * integer from 0 to 2000. 
     */
    override fun downlinkDelayMs(downlinkDelayMs: Number) {
      cdkBuilder.downlinkDelayMs(downlinkDelayMs)
    }

    /**
     * Time variation in the delay of received packets in milliseconds as an integer from 0 to 2000.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-downlinkjitterms)
     * @param downlinkJitterMs Time variation in the delay of received packets in milliseconds as an
     * integer from 0 to 2000. 
     */
    override fun downlinkJitterMs(downlinkJitterMs: Number) {
      cdkBuilder.downlinkJitterMs(downlinkJitterMs)
    }

    /**
     * Proportion of received packets that fail to arrive from 0 to 100 percent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-downlinklosspercent)
     * @param downlinkLossPercent Proportion of received packets that fail to arrive from 0 to 100
     * percent. 
     */
    override fun downlinkLossPercent(downlinkLossPercent: Number) {
      cdkBuilder.downlinkLossPercent(downlinkLossPercent)
    }

    /**
     * The name of the network profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-name)
     * @param name The name of the network profile. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The Amazon Resource Name (ARN) of the specified project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-projectarn)
     * @param projectArn The Amazon Resource Name (ARN) of the specified project. 
     */
    override fun projectArn(projectArn: String) {
      cdkBuilder.projectArn(projectArn)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The data throughput rate in bits per second, as an integer from 0 to 104857600.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-uplinkbandwidthbits)
     * @param uplinkBandwidthBits The data throughput rate in bits per second, as an integer from 0
     * to 104857600. 
     */
    override fun uplinkBandwidthBits(uplinkBandwidthBits: Number) {
      cdkBuilder.uplinkBandwidthBits(uplinkBandwidthBits)
    }

    /**
     * Delay time for all packets to destination in milliseconds as an integer from 0 to 2000.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-uplinkdelayms)
     * @param uplinkDelayMs Delay time for all packets to destination in milliseconds as an integer
     * from 0 to 2000. 
     */
    override fun uplinkDelayMs(uplinkDelayMs: Number) {
      cdkBuilder.uplinkDelayMs(uplinkDelayMs)
    }

    /**
     * Time variation in the delay of received packets in milliseconds as an integer from 0 to 2000.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-uplinkjitterms)
     * @param uplinkJitterMs Time variation in the delay of received packets in milliseconds as an
     * integer from 0 to 2000. 
     */
    override fun uplinkJitterMs(uplinkJitterMs: Number) {
      cdkBuilder.uplinkJitterMs(uplinkJitterMs)
    }

    /**
     * Proportion of transmitted packets that fail to arrive from 0 to 100 percent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html#cfn-devicefarm-networkprofile-uplinklosspercent)
     * @param uplinkLossPercent Proportion of transmitted packets that fail to arrive from 0 to 100
     * percent. 
     */
    override fun uplinkLossPercent(uplinkLossPercent: Number) {
      cdkBuilder.uplinkLossPercent(uplinkLossPercent)
    }

    public fun build(): software.amazon.awscdk.services.devicefarm.CfnNetworkProfile =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.devicefarm.CfnNetworkProfile.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnNetworkProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnNetworkProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.devicefarm.CfnNetworkProfile):
        CfnNetworkProfile = CfnNetworkProfile(cdkObject)

    internal fun unwrap(wrapped: CfnNetworkProfile):
        software.amazon.awscdk.services.devicefarm.CfnNetworkProfile = wrapped.cdkObject as
        software.amazon.awscdk.services.devicefarm.CfnNetworkProfile
  }
}
