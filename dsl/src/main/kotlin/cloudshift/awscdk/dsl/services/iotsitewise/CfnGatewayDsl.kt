@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotsitewise.CfnGateway
import software.constructs.Construct

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
 * import software.amazon.awscdk.services.iotsitewise.*;
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
@CdkDslMarker
public class CfnGatewayDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnGateway.Builder = CfnGateway.Builder.create(scope, id)

  private val _gatewayCapabilitySummaries: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

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
  public fun gatewayCapabilitySummaries(vararg gatewayCapabilitySummaries: Any) {
    _gatewayCapabilitySummaries.addAll(listOf(*gatewayCapabilitySummaries))
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
  public fun gatewayCapabilitySummaries(gatewayCapabilitySummaries: Collection<Any>) {
    _gatewayCapabilitySummaries.addAll(gatewayCapabilitySummaries)
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
  public fun gatewayCapabilitySummaries(gatewayCapabilitySummaries: IResolvable) {
    cdkBuilder.gatewayCapabilitySummaries(gatewayCapabilitySummaries)
  }

  /**
   * A unique, friendly name for the gateway.
   *
   * The maximum length is 256 characters with the pattern `[^\u0000-\u001F\u007F]+` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-gateway.html#cfn-iotsitewise-gateway-gatewayname)
   * @param gatewayName A unique, friendly name for the gateway. 
   */
  public fun gatewayName(gatewayName: String) {
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
  public fun gatewayPlatform(gatewayPlatform: IResolvable) {
    cdkBuilder.gatewayPlatform(gatewayPlatform)
  }

  /**
   * The gateway's platform.
   *
   * You can only specify one platform in a gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-gateway.html#cfn-iotsitewise-gateway-gatewayplatform)
   * @param gatewayPlatform The gateway's platform. 
   */
  public fun gatewayPlatform(gatewayPlatform: CfnGateway.GatewayPlatformProperty) {
    cdkBuilder.gatewayPlatform(gatewayPlatform)
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
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
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
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnGateway {
    if(_gatewayCapabilitySummaries.isNotEmpty())
        cdkBuilder.gatewayCapabilitySummaries(_gatewayCapabilitySummaries)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
