@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotsitewise

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
 * Properties for defining a `CfnGateway`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotsitewise.*;
 * CfnGatewayProps cfnGatewayProps = CfnGatewayProps.builder()
 * .gatewayName("gatewayName")
 * .gatewayPlatform(GatewayPlatformProperty.builder()
 * .greengrass(GreengrassProperty.builder()
 * .groupArn("groupArn")
 * .build())
 * .greengrassV2(GreengrassV2Property.builder()
 * .coreDeviceThingName("coreDeviceThingName")
 * .build())
 * .build())
 * // the properties below are optional
 * .gatewayCapabilitySummaries(List.of(GatewayCapabilitySummaryProperty.builder()
 * .capabilityNamespace("capabilityNamespace")
 * // the properties below are optional
 * .capabilityConfiguration("capabilityConfiguration")
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-gateway.html)
 */
public interface CfnGatewayProps {
  /**
   * A list of gateway capability summaries that each contain a namespace and status.
   *
   * Each gateway capability defines data sources for the gateway. To retrieve a capability
   * configuration's definition, use
   * [DescribeGatewayCapabilityConfiguration](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeGatewayCapabilityConfiguration.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-gateway.html#cfn-iotsitewise-gateway-gatewaycapabilitysummaries)
   */
  public fun gatewayCapabilitySummaries(): Any? = unwrap(this).getGatewayCapabilitySummaries()

  /**
   * A unique, friendly name for the gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-gateway.html#cfn-iotsitewise-gateway-gatewayname)
   */
  public fun gatewayName(): String

  /**
   * The gateway's platform.
   *
   * You can only specify one platform in a gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-gateway.html#cfn-iotsitewise-gateway-gatewayplatform)
   */
  public fun gatewayPlatform(): Any

  /**
   * A list of key-value pairs that contain metadata for the gateway.
   *
   * For more information, see [Tagging your AWS IoT SiteWise
   * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
   * *AWS IoT SiteWise User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-gateway.html#cfn-iotsitewise-gateway-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnGatewayProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param gatewayCapabilitySummaries A list of gateway capability summaries that each contain a
     * namespace and status.
     * Each gateway capability defines data sources for the gateway. To retrieve a capability
     * configuration's definition, use
     * [DescribeGatewayCapabilityConfiguration](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeGatewayCapabilityConfiguration.html)
     * .
     */
    public fun gatewayCapabilitySummaries(gatewayCapabilitySummaries: IResolvable)

    /**
     * @param gatewayCapabilitySummaries A list of gateway capability summaries that each contain a
     * namespace and status.
     * Each gateway capability defines data sources for the gateway. To retrieve a capability
     * configuration's definition, use
     * [DescribeGatewayCapabilityConfiguration](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeGatewayCapabilityConfiguration.html)
     * .
     */
    public fun gatewayCapabilitySummaries(gatewayCapabilitySummaries: List<Any>)

    /**
     * @param gatewayCapabilitySummaries A list of gateway capability summaries that each contain a
     * namespace and status.
     * Each gateway capability defines data sources for the gateway. To retrieve a capability
     * configuration's definition, use
     * [DescribeGatewayCapabilityConfiguration](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeGatewayCapabilityConfiguration.html)
     * .
     */
    public fun gatewayCapabilitySummaries(vararg gatewayCapabilitySummaries: Any)

    /**
     * @param gatewayName A unique, friendly name for the gateway. 
     */
    public fun gatewayName(gatewayName: String)

    /**
     * @param gatewayPlatform The gateway's platform. 
     * You can only specify one platform in a gateway.
     */
    public fun gatewayPlatform(gatewayPlatform: IResolvable)

    /**
     * @param gatewayPlatform The gateway's platform. 
     * You can only specify one platform in a gateway.
     */
    public fun gatewayPlatform(gatewayPlatform: CfnGateway.GatewayPlatformProperty)

    /**
     * @param gatewayPlatform The gateway's platform. 
     * You can only specify one platform in a gateway.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("daef7b497712a2c38abe2d8815aa9b78513e87f677531eb68e104625fd5cfd0a")
    public
        fun gatewayPlatform(gatewayPlatform: CfnGateway.GatewayPlatformProperty.Builder.() -> Unit)

    /**
     * @param tags A list of key-value pairs that contain metadata for the gateway.
     * For more information, see [Tagging your AWS IoT SiteWise
     * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
     * *AWS IoT SiteWise User Guide* .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of key-value pairs that contain metadata for the gateway.
     * For more information, see [Tagging your AWS IoT SiteWise
     * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
     * *AWS IoT SiteWise User Guide* .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotsitewise.CfnGatewayProps.Builder =
        software.amazon.awscdk.services.iotsitewise.CfnGatewayProps.builder()

    /**
     * @param gatewayCapabilitySummaries A list of gateway capability summaries that each contain a
     * namespace and status.
     * Each gateway capability defines data sources for the gateway. To retrieve a capability
     * configuration's definition, use
     * [DescribeGatewayCapabilityConfiguration](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeGatewayCapabilityConfiguration.html)
     * .
     */
    override fun gatewayCapabilitySummaries(gatewayCapabilitySummaries: IResolvable) {
      cdkBuilder.gatewayCapabilitySummaries(gatewayCapabilitySummaries.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param gatewayCapabilitySummaries A list of gateway capability summaries that each contain a
     * namespace and status.
     * Each gateway capability defines data sources for the gateway. To retrieve a capability
     * configuration's definition, use
     * [DescribeGatewayCapabilityConfiguration](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeGatewayCapabilityConfiguration.html)
     * .
     */
    override fun gatewayCapabilitySummaries(gatewayCapabilitySummaries: List<Any>) {
      cdkBuilder.gatewayCapabilitySummaries(gatewayCapabilitySummaries.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param gatewayCapabilitySummaries A list of gateway capability summaries that each contain a
     * namespace and status.
     * Each gateway capability defines data sources for the gateway. To retrieve a capability
     * configuration's definition, use
     * [DescribeGatewayCapabilityConfiguration](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeGatewayCapabilityConfiguration.html)
     * .
     */
    override fun gatewayCapabilitySummaries(vararg gatewayCapabilitySummaries: Any): Unit =
        gatewayCapabilitySummaries(gatewayCapabilitySummaries.toList())

    /**
     * @param gatewayName A unique, friendly name for the gateway. 
     */
    override fun gatewayName(gatewayName: String) {
      cdkBuilder.gatewayName(gatewayName)
    }

    /**
     * @param gatewayPlatform The gateway's platform. 
     * You can only specify one platform in a gateway.
     */
    override fun gatewayPlatform(gatewayPlatform: IResolvable) {
      cdkBuilder.gatewayPlatform(gatewayPlatform.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param gatewayPlatform The gateway's platform. 
     * You can only specify one platform in a gateway.
     */
    override fun gatewayPlatform(gatewayPlatform: CfnGateway.GatewayPlatformProperty) {
      cdkBuilder.gatewayPlatform(gatewayPlatform.let(CfnGateway.GatewayPlatformProperty.Companion::unwrap))
    }

    /**
     * @param gatewayPlatform The gateway's platform. 
     * You can only specify one platform in a gateway.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("daef7b497712a2c38abe2d8815aa9b78513e87f677531eb68e104625fd5cfd0a")
    override
        fun gatewayPlatform(gatewayPlatform: CfnGateway.GatewayPlatformProperty.Builder.() -> Unit):
        Unit = gatewayPlatform(CfnGateway.GatewayPlatformProperty(gatewayPlatform))

    /**
     * @param tags A list of key-value pairs that contain metadata for the gateway.
     * For more information, see [Tagging your AWS IoT SiteWise
     * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
     * *AWS IoT SiteWise User Guide* .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A list of key-value pairs that contain metadata for the gateway.
     * For more information, see [Tagging your AWS IoT SiteWise
     * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
     * *AWS IoT SiteWise User Guide* .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotsitewise.CfnGatewayProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iotsitewise.CfnGatewayProps,
  ) : CdkObject(cdkObject), CfnGatewayProps {
    /**
     * A list of gateway capability summaries that each contain a namespace and status.
     *
     * Each gateway capability defines data sources for the gateway. To retrieve a capability
     * configuration's definition, use
     * [DescribeGatewayCapabilityConfiguration](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeGatewayCapabilityConfiguration.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-gateway.html#cfn-iotsitewise-gateway-gatewaycapabilitysummaries)
     */
    override fun gatewayCapabilitySummaries(): Any? = unwrap(this).getGatewayCapabilitySummaries()

    /**
     * A unique, friendly name for the gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-gateway.html#cfn-iotsitewise-gateway-gatewayname)
     */
    override fun gatewayName(): String = unwrap(this).getGatewayName()

    /**
     * The gateway's platform.
     *
     * You can only specify one platform in a gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-gateway.html#cfn-iotsitewise-gateway-gatewayplatform)
     */
    override fun gatewayPlatform(): Any = unwrap(this).getGatewayPlatform()

    /**
     * A list of key-value pairs that contain metadata for the gateway.
     *
     * For more information, see [Tagging your AWS IoT SiteWise
     * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
     * *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-gateway.html#cfn-iotsitewise-gateway-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGatewayProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnGatewayProps):
        CfnGatewayProps = CdkObjectWrappers.wrap(cdkObject) as? CfnGatewayProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGatewayProps):
        software.amazon.awscdk.services.iotsitewise.CfnGatewayProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotsitewise.CfnGatewayProps
  }
}
