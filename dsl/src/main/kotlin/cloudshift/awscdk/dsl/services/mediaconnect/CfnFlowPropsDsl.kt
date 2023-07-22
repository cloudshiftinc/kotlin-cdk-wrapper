@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediaconnect.CfnFlow
import software.amazon.awscdk.services.mediaconnect.CfnFlowProps

/**
 * Properties for defining a `CfnFlow`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediaconnect.*;
 * CfnFlowProps cfnFlowProps = CfnFlowProps.builder()
 * .name("name")
 * .source(SourceProperty.builder()
 * .decryption(EncryptionProperty.builder()
 * .roleArn("roleArn")
 * // the properties below are optional
 * .algorithm("algorithm")
 * .constantInitializationVector("constantInitializationVector")
 * .deviceId("deviceId")
 * .keyType("keyType")
 * .region("region")
 * .resourceId("resourceId")
 * .secretArn("secretArn")
 * .url("url")
 * .build())
 * .description("description")
 * .entitlementArn("entitlementArn")
 * .gatewayBridgeSource(GatewayBridgeSourceProperty.builder()
 * .bridgeArn("bridgeArn")
 * // the properties below are optional
 * .vpcInterfaceAttachment(VpcInterfaceAttachmentProperty.builder()
 * .vpcInterfaceName("vpcInterfaceName")
 * .build())
 * .build())
 * .ingestIp("ingestIp")
 * .ingestPort(123)
 * .maxBitrate(123)
 * .maxLatency(123)
 * .minLatency(123)
 * .name("name")
 * .protocol("protocol")
 * .senderControlPort(123)
 * .senderIpAddress("senderIpAddress")
 * .sourceArn("sourceArn")
 * .sourceIngestPort("sourceIngestPort")
 * .sourceListenerAddress("sourceListenerAddress")
 * .sourceListenerPort(123)
 * .streamId("streamId")
 * .vpcInterfaceName("vpcInterfaceName")
 * .whitelistCidr("whitelistCidr")
 * .build())
 * // the properties below are optional
 * .availabilityZone("availabilityZone")
 * .sourceFailoverConfig(FailoverConfigProperty.builder()
 * .failoverMode("failoverMode")
 * .recoveryWindow(123)
 * .sourcePriority(SourcePriorityProperty.builder()
 * .primarySource("primarySource")
 * .build())
 * .state("state")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html)
 */
@CdkDslMarker
public class CfnFlowPropsDsl {
  private val cdkBuilder: CfnFlowProps.Builder = CfnFlowProps.builder()

  /**
   * @param availabilityZone The Availability Zone that you want to create the flow in.
   * These options are limited to the Availability Zones within the current AWS Region.
   */
  public fun availabilityZone(availabilityZone: String) {
    cdkBuilder.availabilityZone(availabilityZone)
  }

  /**
   * @param name The name of the flow. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param source The settings for the source that you want to use for the new flow. 
   */
  public fun source(source: IResolvable) {
    cdkBuilder.source(source)
  }

  /**
   * @param source The settings for the source that you want to use for the new flow. 
   */
  public fun source(source: CfnFlow.SourceProperty) {
    cdkBuilder.source(source)
  }

  /**
   * @param sourceFailoverConfig The settings for source failover.
   */
  public fun sourceFailoverConfig(sourceFailoverConfig: IResolvable) {
    cdkBuilder.sourceFailoverConfig(sourceFailoverConfig)
  }

  /**
   * @param sourceFailoverConfig The settings for source failover.
   */
  public fun sourceFailoverConfig(sourceFailoverConfig: CfnFlow.FailoverConfigProperty) {
    cdkBuilder.sourceFailoverConfig(sourceFailoverConfig)
  }

  public fun build(): CfnFlowProps = cdkBuilder.build()
}
