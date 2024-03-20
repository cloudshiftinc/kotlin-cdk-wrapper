@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotsitewise

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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a gateway, which is a virtual or edge device that delivers industrial data streams from
 * local servers to AWS IoT SiteWise .
 *
 * For more information, see [Ingesting data using a
 * gateway](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/gateway-connector.html) in the
 * *AWS IoT SiteWise User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotsitewise.*;
 * CfnGateway cfnGateway = CfnGateway.Builder.create(this, "MyCfnGateway")
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
public open class CfnGateway internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iotsitewise.CfnGateway,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnGatewayProps,
  ) :
      this(software.amazon.awscdk.services.iotsitewise.CfnGateway(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnGatewayProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnGatewayProps.Builder.() -> Unit,
  ) : this(scope, id, CfnGatewayProps(props)
  )

  /**
   * The ID for the gateway.
   */
  public open fun attrGatewayId(): String = unwrap(this).getAttrGatewayId()

  /**
   * A list of gateway capability summaries that each contain a namespace and status.
   */
  public open fun gatewayCapabilitySummaries(): Any? = unwrap(this).getGatewayCapabilitySummaries()

  /**
   * A list of gateway capability summaries that each contain a namespace and status.
   */
  public open fun gatewayCapabilitySummaries(`value`: IResolvable) {
    unwrap(this).setGatewayCapabilitySummaries(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of gateway capability summaries that each contain a namespace and status.
   */
  public open fun gatewayCapabilitySummaries(`value`: List<Any>) {
    unwrap(this).setGatewayCapabilitySummaries(`value`)
  }

  /**
   * A list of gateway capability summaries that each contain a namespace and status.
   */
  public open fun gatewayCapabilitySummaries(vararg `value`: Any): Unit =
      gatewayCapabilitySummaries(`value`.toList())

  /**
   * A unique, friendly name for the gateway.
   */
  public open fun gatewayName(): String = unwrap(this).getGatewayName()

  /**
   * A unique, friendly name for the gateway.
   */
  public open fun gatewayName(`value`: String) {
    unwrap(this).setGatewayName(`value`)
  }

  /**
   * The gateway's platform.
   */
  public open fun gatewayPlatform(): Any = unwrap(this).getGatewayPlatform()

  /**
   * The gateway's platform.
   */
  public open fun gatewayPlatform(`value`: IResolvable) {
    unwrap(this).setGatewayPlatform(`value`.let(IResolvable::unwrap))
  }

  /**
   * The gateway's platform.
   */
  public open fun gatewayPlatform(`value`: GatewayPlatformProperty) {
    unwrap(this).setGatewayPlatform(`value`.let(GatewayPlatformProperty::unwrap))
  }

  /**
   * The gateway's platform.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("402fb47c15f58a9bbd48df590bf23601325404ee9bb7bbef81ee10a687daa8ed")
  public open fun gatewayPlatform(`value`: GatewayPlatformProperty.Builder.() -> Unit): Unit =
      gatewayPlatform(GatewayPlatformProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of key-value pairs that contain metadata for the gateway.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of key-value pairs that contain metadata for the gateway.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A list of key-value pairs that contain metadata for the gateway.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iotsitewise.CfnGateway].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A list of gateway capability summaries that each contain a namespace and status.
     *
     * Each gateway capability defines data sources for the gateway. To retrieve a capability
     * configuration's definition, use
     * [DescribeGatewayCapabilityConfiguration](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeGatewayCapabilityConfiguration.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-gateway.html#cfn-iotsitewise-gateway-gatewaycapabilitysummaries)
     * @param gatewayCapabilitySummaries A list of gateway capability summaries that each contain a
     * namespace and status. 
     */
    public fun gatewayCapabilitySummaries(gatewayCapabilitySummaries: IResolvable)

    /**
     * A list of gateway capability summaries that each contain a namespace and status.
     *
     * Each gateway capability defines data sources for the gateway. To retrieve a capability
     * configuration's definition, use
     * [DescribeGatewayCapabilityConfiguration](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeGatewayCapabilityConfiguration.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-gateway.html#cfn-iotsitewise-gateway-gatewaycapabilitysummaries)
     * @param gatewayCapabilitySummaries A list of gateway capability summaries that each contain a
     * namespace and status. 
     */
    public fun gatewayCapabilitySummaries(gatewayCapabilitySummaries: List<Any>)

    /**
     * A list of gateway capability summaries that each contain a namespace and status.
     *
     * Each gateway capability defines data sources for the gateway. To retrieve a capability
     * configuration's definition, use
     * [DescribeGatewayCapabilityConfiguration](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeGatewayCapabilityConfiguration.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-gateway.html#cfn-iotsitewise-gateway-gatewaycapabilitysummaries)
     * @param gatewayCapabilitySummaries A list of gateway capability summaries that each contain a
     * namespace and status. 
     */
    public fun gatewayCapabilitySummaries(vararg gatewayCapabilitySummaries: Any)

    /**
     * A unique, friendly name for the gateway.
     *
     * The maximum length is 256 characters with the pattern `[^\u0000-\u001F\u007F]+` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-gateway.html#cfn-iotsitewise-gateway-gatewayname)
     * @param gatewayName A unique, friendly name for the gateway. 
     */
    public fun gatewayName(gatewayName: String)

    /**
     * The gateway's platform.
     *
     * You can only specify one platform in a gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-gateway.html#cfn-iotsitewise-gateway-gatewayplatform)
     * @param gatewayPlatform The gateway's platform. 
     */
    public fun gatewayPlatform(gatewayPlatform: IResolvable)

    /**
     * The gateway's platform.
     *
     * You can only specify one platform in a gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-gateway.html#cfn-iotsitewise-gateway-gatewayplatform)
     * @param gatewayPlatform The gateway's platform. 
     */
    public fun gatewayPlatform(gatewayPlatform: GatewayPlatformProperty)

    /**
     * The gateway's platform.
     *
     * You can only specify one platform in a gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-gateway.html#cfn-iotsitewise-gateway-gatewayplatform)
     * @param gatewayPlatform The gateway's platform. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("67a83972075c055807843f542cb36a800b44e870144de9ea23f8102a70a276ed")
    public fun gatewayPlatform(gatewayPlatform: GatewayPlatformProperty.Builder.() -> Unit)

    /**
     * A list of key-value pairs that contain metadata for the gateway.
     *
     * For more information, see [Tagging your AWS IoT SiteWise
     * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
     * *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-gateway.html#cfn-iotsitewise-gateway-tags)
     * @param tags A list of key-value pairs that contain metadata for the gateway. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of key-value pairs that contain metadata for the gateway.
     *
     * For more information, see [Tagging your AWS IoT SiteWise
     * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
     * *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-gateway.html#cfn-iotsitewise-gateway-tags)
     * @param tags A list of key-value pairs that contain metadata for the gateway. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotsitewise.CfnGateway.Builder =
        software.amazon.awscdk.services.iotsitewise.CfnGateway.Builder.create(scope, id)

    /**
     * A list of gateway capability summaries that each contain a namespace and status.
     *
     * Each gateway capability defines data sources for the gateway. To retrieve a capability
     * configuration's definition, use
     * [DescribeGatewayCapabilityConfiguration](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeGatewayCapabilityConfiguration.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-gateway.html#cfn-iotsitewise-gateway-gatewaycapabilitysummaries)
     * @param gatewayCapabilitySummaries A list of gateway capability summaries that each contain a
     * namespace and status. 
     */
    override fun gatewayCapabilitySummaries(gatewayCapabilitySummaries: IResolvable) {
      cdkBuilder.gatewayCapabilitySummaries(gatewayCapabilitySummaries.let(IResolvable::unwrap))
    }

    /**
     * A list of gateway capability summaries that each contain a namespace and status.
     *
     * Each gateway capability defines data sources for the gateway. To retrieve a capability
     * configuration's definition, use
     * [DescribeGatewayCapabilityConfiguration](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeGatewayCapabilityConfiguration.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-gateway.html#cfn-iotsitewise-gateway-gatewaycapabilitysummaries)
     * @param gatewayCapabilitySummaries A list of gateway capability summaries that each contain a
     * namespace and status. 
     */
    override fun gatewayCapabilitySummaries(gatewayCapabilitySummaries: List<Any>) {
      cdkBuilder.gatewayCapabilitySummaries(gatewayCapabilitySummaries)
    }

    /**
     * A list of gateway capability summaries that each contain a namespace and status.
     *
     * Each gateway capability defines data sources for the gateway. To retrieve a capability
     * configuration's definition, use
     * [DescribeGatewayCapabilityConfiguration](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeGatewayCapabilityConfiguration.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-gateway.html#cfn-iotsitewise-gateway-gatewaycapabilitysummaries)
     * @param gatewayCapabilitySummaries A list of gateway capability summaries that each contain a
     * namespace and status. 
     */
    override fun gatewayCapabilitySummaries(vararg gatewayCapabilitySummaries: Any): Unit =
        gatewayCapabilitySummaries(gatewayCapabilitySummaries.toList())

    /**
     * A unique, friendly name for the gateway.
     *
     * The maximum length is 256 characters with the pattern `[^\u0000-\u001F\u007F]+` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-gateway.html#cfn-iotsitewise-gateway-gatewayname)
     * @param gatewayName A unique, friendly name for the gateway. 
     */
    override fun gatewayName(gatewayName: String) {
      cdkBuilder.gatewayName(gatewayName)
    }

    /**
     * The gateway's platform.
     *
     * You can only specify one platform in a gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-gateway.html#cfn-iotsitewise-gateway-gatewayplatform)
     * @param gatewayPlatform The gateway's platform. 
     */
    override fun gatewayPlatform(gatewayPlatform: IResolvable) {
      cdkBuilder.gatewayPlatform(gatewayPlatform.let(IResolvable::unwrap))
    }

    /**
     * The gateway's platform.
     *
     * You can only specify one platform in a gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-gateway.html#cfn-iotsitewise-gateway-gatewayplatform)
     * @param gatewayPlatform The gateway's platform. 
     */
    override fun gatewayPlatform(gatewayPlatform: GatewayPlatformProperty) {
      cdkBuilder.gatewayPlatform(gatewayPlatform.let(GatewayPlatformProperty::unwrap))
    }

    /**
     * The gateway's platform.
     *
     * You can only specify one platform in a gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-gateway.html#cfn-iotsitewise-gateway-gatewayplatform)
     * @param gatewayPlatform The gateway's platform. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("67a83972075c055807843f542cb36a800b44e870144de9ea23f8102a70a276ed")
    override fun gatewayPlatform(gatewayPlatform: GatewayPlatformProperty.Builder.() -> Unit): Unit
        = gatewayPlatform(GatewayPlatformProperty(gatewayPlatform))

    /**
     * A list of key-value pairs that contain metadata for the gateway.
     *
     * For more information, see [Tagging your AWS IoT SiteWise
     * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
     * *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-gateway.html#cfn-iotsitewise-gateway-tags)
     * @param tags A list of key-value pairs that contain metadata for the gateway. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A list of key-value pairs that contain metadata for the gateway.
     *
     * For more information, see [Tagging your AWS IoT SiteWise
     * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
     * *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-gateway.html#cfn-iotsitewise-gateway-tags)
     * @param tags A list of key-value pairs that contain metadata for the gateway. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotsitewise.CfnGateway = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iotsitewise.CfnGateway.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGateway {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGateway(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnGateway): CfnGateway
        = CfnGateway(cdkObject)

    internal fun unwrap(wrapped: CfnGateway): software.amazon.awscdk.services.iotsitewise.CfnGateway
        = wrapped.cdkObject
  }

  /**
   * Contains details for a gateway that runs on AWS IoT Greengrass V2 .
   *
   * To create a gateway that runs on AWS IoT Greengrass V2 , you must deploy the IoT SiteWise Edge
   * component to your gateway device. Your [Greengrass device
   * role](https://docs.aws.amazon.com/greengrass/v2/developerguide/device-service-role.html) must use
   * the `AWSIoTSiteWiseEdgeAccess` policy. For more information, see [Using AWS IoT SiteWise at the
   * edge](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/sw-gateways.html) in the *AWS IoT
   * SiteWise User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotsitewise.*;
   * GreengrassV2Property greengrassV2Property = GreengrassV2Property.builder()
   * .coreDeviceThingName("coreDeviceThingName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-gateway-greengrassv2.html)
   */
  public interface GreengrassV2Property {
    /**
     * The name of the AWS IoT thing for your AWS IoT Greengrass V2 core device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-gateway-greengrassv2.html#cfn-iotsitewise-gateway-greengrassv2-coredevicethingname)
     */
    public fun coreDeviceThingName(): String

    /**
     * A builder for [GreengrassV2Property]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param coreDeviceThingName The name of the AWS IoT thing for your AWS IoT Greengrass V2
       * core device. 
       */
      public fun coreDeviceThingName(coreDeviceThingName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnGateway.GreengrassV2Property.Builder =
          software.amazon.awscdk.services.iotsitewise.CfnGateway.GreengrassV2Property.builder()

      /**
       * @param coreDeviceThingName The name of the AWS IoT thing for your AWS IoT Greengrass V2
       * core device. 
       */
      override fun coreDeviceThingName(coreDeviceThingName: String) {
        cdkBuilder.coreDeviceThingName(coreDeviceThingName)
      }

      public fun build():
          software.amazon.awscdk.services.iotsitewise.CfnGateway.GreengrassV2Property =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotsitewise.CfnGateway.GreengrassV2Property,
    ) : CdkObject(cdkObject), GreengrassV2Property {
      /**
       * The name of the AWS IoT thing for your AWS IoT Greengrass V2 core device.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-gateway-greengrassv2.html#cfn-iotsitewise-gateway-greengrassv2-coredevicethingname)
       */
      override fun coreDeviceThingName(): String = unwrap(this).getCoreDeviceThingName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GreengrassV2Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnGateway.GreengrassV2Property):
          GreengrassV2Property = CdkObjectWrappers.wrap(cdkObject) as? GreengrassV2Property ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: GreengrassV2Property):
          software.amazon.awscdk.services.iotsitewise.CfnGateway.GreengrassV2Property = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotsitewise.CfnGateway.GreengrassV2Property
    }
  }

  /**
   * Contains details for a gateway that runs on AWS IoT Greengrass .
   *
   * To create a gateway that runs on AWS IoT Greengrass , you must add the IoT SiteWise connector
   * to a Greengrass group and deploy it. Your Greengrass group must also have permissions to upload
   * data to AWS IoT SiteWise . For more information, see [Ingesting data using a
   * gateway](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/gateway-connector.html) in the
   * *AWS IoT SiteWise User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotsitewise.*;
   * GreengrassProperty greengrassProperty = GreengrassProperty.builder()
   * .groupArn("groupArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-gateway-greengrass.html)
   */
  public interface GreengrassProperty {
    /**
     * The [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) of the
     * Greengrass group. For more information about how to find a group's ARN, see
     * [ListGroups](https://docs.aws.amazon.com/greengrass/latest/apireference/listgroups-get.html) and
     * [GetGroup](https://docs.aws.amazon.com/greengrass/latest/apireference/getgroup-get.html) in the
     * *AWS IoT Greengrass API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-gateway-greengrass.html#cfn-iotsitewise-gateway-greengrass-grouparn)
     */
    public fun groupArn(): String

    /**
     * A builder for [GreengrassProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param groupArn The
       * [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) of the
       * Greengrass group. For more information about how to find a group's ARN, see
       * [ListGroups](https://docs.aws.amazon.com/greengrass/latest/apireference/listgroups-get.html)
       * and [GetGroup](https://docs.aws.amazon.com/greengrass/latest/apireference/getgroup-get.html)
       * in the *AWS IoT Greengrass API Reference* . 
       */
      public fun groupArn(groupArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnGateway.GreengrassProperty.Builder =
          software.amazon.awscdk.services.iotsitewise.CfnGateway.GreengrassProperty.builder()

      /**
       * @param groupArn The
       * [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) of the
       * Greengrass group. For more information about how to find a group's ARN, see
       * [ListGroups](https://docs.aws.amazon.com/greengrass/latest/apireference/listgroups-get.html)
       * and [GetGroup](https://docs.aws.amazon.com/greengrass/latest/apireference/getgroup-get.html)
       * in the *AWS IoT Greengrass API Reference* . 
       */
      override fun groupArn(groupArn: String) {
        cdkBuilder.groupArn(groupArn)
      }

      public fun build(): software.amazon.awscdk.services.iotsitewise.CfnGateway.GreengrassProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotsitewise.CfnGateway.GreengrassProperty,
    ) : CdkObject(cdkObject), GreengrassProperty {
      /**
       * The [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) of
       * the Greengrass group. For more information about how to find a group's ARN, see
       * [ListGroups](https://docs.aws.amazon.com/greengrass/latest/apireference/listgroups-get.html)
       * and [GetGroup](https://docs.aws.amazon.com/greengrass/latest/apireference/getgroup-get.html)
       * in the *AWS IoT Greengrass API Reference* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-gateway-greengrass.html#cfn-iotsitewise-gateway-greengrass-grouparn)
       */
      override fun groupArn(): String = unwrap(this).getGroupArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GreengrassProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnGateway.GreengrassProperty):
          GreengrassProperty = CdkObjectWrappers.wrap(cdkObject) as? GreengrassProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: GreengrassProperty):
          software.amazon.awscdk.services.iotsitewise.CfnGateway.GreengrassProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotsitewise.CfnGateway.GreengrassProperty
    }
  }

  /**
   * Contains a gateway's platform information.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotsitewise.*;
   * GatewayPlatformProperty gatewayPlatformProperty = GatewayPlatformProperty.builder()
   * .greengrass(GreengrassProperty.builder()
   * .groupArn("groupArn")
   * .build())
   * .greengrassV2(GreengrassV2Property.builder()
   * .coreDeviceThingName("coreDeviceThingName")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-gateway-gatewayplatform.html)
   */
  public interface GatewayPlatformProperty {
    /**
     * A gateway that runs on AWS IoT Greengrass .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-gateway-gatewayplatform.html#cfn-iotsitewise-gateway-gatewayplatform-greengrass)
     */
    public fun greengrass(): Any? = unwrap(this).getGreengrass()

    /**
     * A gateway that runs on AWS IoT Greengrass V2 .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-gateway-gatewayplatform.html#cfn-iotsitewise-gateway-gatewayplatform-greengrassv2)
     */
    public fun greengrassV2(): Any? = unwrap(this).getGreengrassV2()

    /**
     * A builder for [GatewayPlatformProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param greengrass A gateway that runs on AWS IoT Greengrass .
       */
      public fun greengrass(greengrass: IResolvable)

      /**
       * @param greengrass A gateway that runs on AWS IoT Greengrass .
       */
      public fun greengrass(greengrass: GreengrassProperty)

      /**
       * @param greengrass A gateway that runs on AWS IoT Greengrass .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("565ec39735a4f1c8211fba5c507ef3bd4c8f5c3104cbe93f8ca532f41baac3da")
      public fun greengrass(greengrass: GreengrassProperty.Builder.() -> Unit)

      /**
       * @param greengrassV2 A gateway that runs on AWS IoT Greengrass V2 .
       */
      public fun greengrassV2(greengrassV2: IResolvable)

      /**
       * @param greengrassV2 A gateway that runs on AWS IoT Greengrass V2 .
       */
      public fun greengrassV2(greengrassV2: GreengrassV2Property)

      /**
       * @param greengrassV2 A gateway that runs on AWS IoT Greengrass V2 .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ca43a8bd608afed1919b0aedc0623e92dc59ed76e4674f3fb5a2b3b3450fd463")
      public fun greengrassV2(greengrassV2: GreengrassV2Property.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnGateway.GatewayPlatformProperty.Builder =
          software.amazon.awscdk.services.iotsitewise.CfnGateway.GatewayPlatformProperty.builder()

      /**
       * @param greengrass A gateway that runs on AWS IoT Greengrass .
       */
      override fun greengrass(greengrass: IResolvable) {
        cdkBuilder.greengrass(greengrass.let(IResolvable::unwrap))
      }

      /**
       * @param greengrass A gateway that runs on AWS IoT Greengrass .
       */
      override fun greengrass(greengrass: GreengrassProperty) {
        cdkBuilder.greengrass(greengrass.let(GreengrassProperty::unwrap))
      }

      /**
       * @param greengrass A gateway that runs on AWS IoT Greengrass .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("565ec39735a4f1c8211fba5c507ef3bd4c8f5c3104cbe93f8ca532f41baac3da")
      override fun greengrass(greengrass: GreengrassProperty.Builder.() -> Unit): Unit =
          greengrass(GreengrassProperty(greengrass))

      /**
       * @param greengrassV2 A gateway that runs on AWS IoT Greengrass V2 .
       */
      override fun greengrassV2(greengrassV2: IResolvable) {
        cdkBuilder.greengrassV2(greengrassV2.let(IResolvable::unwrap))
      }

      /**
       * @param greengrassV2 A gateway that runs on AWS IoT Greengrass V2 .
       */
      override fun greengrassV2(greengrassV2: GreengrassV2Property) {
        cdkBuilder.greengrassV2(greengrassV2.let(GreengrassV2Property::unwrap))
      }

      /**
       * @param greengrassV2 A gateway that runs on AWS IoT Greengrass V2 .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ca43a8bd608afed1919b0aedc0623e92dc59ed76e4674f3fb5a2b3b3450fd463")
      override fun greengrassV2(greengrassV2: GreengrassV2Property.Builder.() -> Unit): Unit =
          greengrassV2(GreengrassV2Property(greengrassV2))

      public fun build():
          software.amazon.awscdk.services.iotsitewise.CfnGateway.GatewayPlatformProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotsitewise.CfnGateway.GatewayPlatformProperty,
    ) : CdkObject(cdkObject), GatewayPlatformProperty {
      /**
       * A gateway that runs on AWS IoT Greengrass .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-gateway-gatewayplatform.html#cfn-iotsitewise-gateway-gatewayplatform-greengrass)
       */
      override fun greengrass(): Any? = unwrap(this).getGreengrass()

      /**
       * A gateway that runs on AWS IoT Greengrass V2 .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-gateway-gatewayplatform.html#cfn-iotsitewise-gateway-gatewayplatform-greengrassv2)
       */
      override fun greengrassV2(): Any? = unwrap(this).getGreengrassV2()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GatewayPlatformProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnGateway.GatewayPlatformProperty):
          GatewayPlatformProperty = CdkObjectWrappers.wrap(cdkObject) as? GatewayPlatformProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: GatewayPlatformProperty):
          software.amazon.awscdk.services.iotsitewise.CfnGateway.GatewayPlatformProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotsitewise.CfnGateway.GatewayPlatformProperty
    }
  }

  /**
   * Contains a summary of a gateway capability configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotsitewise.*;
   * GatewayCapabilitySummaryProperty gatewayCapabilitySummaryProperty =
   * GatewayCapabilitySummaryProperty.builder()
   * .capabilityNamespace("capabilityNamespace")
   * // the properties below are optional
   * .capabilityConfiguration("capabilityConfiguration")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-gateway-gatewaycapabilitysummary.html)
   */
  public interface GatewayCapabilitySummaryProperty {
    /**
     * The JSON document that defines the configuration for the gateway capability.
     *
     * For more information, see [Configuring data sources
     * (CLI)](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/configure-sources.html#configure-source-cli)
     * in the *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-gateway-gatewaycapabilitysummary.html#cfn-iotsitewise-gateway-gatewaycapabilitysummary-capabilityconfiguration)
     */
    public fun capabilityConfiguration(): String? = unwrap(this).getCapabilityConfiguration()

    /**
     * The namespace of the capability configuration.
     *
     * For example, if you configure OPC-UA sources from the AWS IoT SiteWise console, your OPC-UA
     * capability configuration has the namespace `iotsitewise:opcuacollector:version` , where
     * `version` is a number such as `1` .
     *
     * The maximum length is 512 characters with the pattern `^[a-zA-Z]+:[a-zA-Z]+:[0-9]+$` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-gateway-gatewaycapabilitysummary.html#cfn-iotsitewise-gateway-gatewaycapabilitysummary-capabilitynamespace)
     */
    public fun capabilityNamespace(): String

    /**
     * A builder for [GatewayCapabilitySummaryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param capabilityConfiguration The JSON document that defines the configuration for the
       * gateway capability.
       * For more information, see [Configuring data sources
       * (CLI)](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/configure-sources.html#configure-source-cli)
       * in the *AWS IoT SiteWise User Guide* .
       */
      public fun capabilityConfiguration(capabilityConfiguration: String)

      /**
       * @param capabilityNamespace The namespace of the capability configuration. 
       * For example, if you configure OPC-UA sources from the AWS IoT SiteWise console, your OPC-UA
       * capability configuration has the namespace `iotsitewise:opcuacollector:version` , where
       * `version` is a number such as `1` .
       *
       * The maximum length is 512 characters with the pattern `^[a-zA-Z]+:[a-zA-Z]+:[0-9]+$` .
       */
      public fun capabilityNamespace(capabilityNamespace: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnGateway.GatewayCapabilitySummaryProperty.Builder
          =
          software.amazon.awscdk.services.iotsitewise.CfnGateway.GatewayCapabilitySummaryProperty.builder()

      /**
       * @param capabilityConfiguration The JSON document that defines the configuration for the
       * gateway capability.
       * For more information, see [Configuring data sources
       * (CLI)](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/configure-sources.html#configure-source-cli)
       * in the *AWS IoT SiteWise User Guide* .
       */
      override fun capabilityConfiguration(capabilityConfiguration: String) {
        cdkBuilder.capabilityConfiguration(capabilityConfiguration)
      }

      /**
       * @param capabilityNamespace The namespace of the capability configuration. 
       * For example, if you configure OPC-UA sources from the AWS IoT SiteWise console, your OPC-UA
       * capability configuration has the namespace `iotsitewise:opcuacollector:version` , where
       * `version` is a number such as `1` .
       *
       * The maximum length is 512 characters with the pattern `^[a-zA-Z]+:[a-zA-Z]+:[0-9]+$` .
       */
      override fun capabilityNamespace(capabilityNamespace: String) {
        cdkBuilder.capabilityNamespace(capabilityNamespace)
      }

      public fun build():
          software.amazon.awscdk.services.iotsitewise.CfnGateway.GatewayCapabilitySummaryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotsitewise.CfnGateway.GatewayCapabilitySummaryProperty,
    ) : CdkObject(cdkObject), GatewayCapabilitySummaryProperty {
      /**
       * The JSON document that defines the configuration for the gateway capability.
       *
       * For more information, see [Configuring data sources
       * (CLI)](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/configure-sources.html#configure-source-cli)
       * in the *AWS IoT SiteWise User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-gateway-gatewaycapabilitysummary.html#cfn-iotsitewise-gateway-gatewaycapabilitysummary-capabilityconfiguration)
       */
      override fun capabilityConfiguration(): String? = unwrap(this).getCapabilityConfiguration()

      /**
       * The namespace of the capability configuration.
       *
       * For example, if you configure OPC-UA sources from the AWS IoT SiteWise console, your OPC-UA
       * capability configuration has the namespace `iotsitewise:opcuacollector:version` , where
       * `version` is a number such as `1` .
       *
       * The maximum length is 512 characters with the pattern `^[a-zA-Z]+:[a-zA-Z]+:[0-9]+$` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-gateway-gatewaycapabilitysummary.html#cfn-iotsitewise-gateway-gatewaycapabilitysummary-capabilitynamespace)
       */
      override fun capabilityNamespace(): String = unwrap(this).getCapabilityNamespace()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GatewayCapabilitySummaryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnGateway.GatewayCapabilitySummaryProperty):
          GatewayCapabilitySummaryProperty = CdkObjectWrappers.wrap(cdkObject) as?
          GatewayCapabilitySummaryProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: GatewayCapabilitySummaryProperty):
          software.amazon.awscdk.services.iotsitewise.CfnGateway.GatewayCapabilitySummaryProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotsitewise.CfnGateway.GatewayCapabilitySummaryProperty
    }
  }
}
