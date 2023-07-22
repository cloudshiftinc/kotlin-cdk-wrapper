@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlement
import software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlementProps

/**
 * Properties for defining a `CfnFlowEntitlement`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediaconnect.*;
 * CfnFlowEntitlementProps cfnFlowEntitlementProps = CfnFlowEntitlementProps.builder()
 * .description("description")
 * .flowArn("flowArn")
 * .name("name")
 * .subscribers(List.of("subscribers"))
 * // the properties below are optional
 * .dataTransferSubscriberFeePercent(123)
 * .encryption(EncryptionProperty.builder()
 * .algorithm("algorithm")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .constantInitializationVector("constantInitializationVector")
 * .deviceId("deviceId")
 * .keyType("keyType")
 * .region("region")
 * .resourceId("resourceId")
 * .secretArn("secretArn")
 * .url("url")
 * .build())
 * .entitlementStatus("entitlementStatus")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowentitlement.html)
 */
@CdkDslMarker
public class CfnFlowEntitlementPropsDsl {
  private val cdkBuilder: CfnFlowEntitlementProps.Builder = CfnFlowEntitlementProps.builder()

  private val _subscribers: MutableList<String> = mutableListOf()

  /**
   * @param dataTransferSubscriberFeePercent The percentage of the entitlement data transfer fee
   * that you want the subscriber to be responsible for.
   */
  public fun dataTransferSubscriberFeePercent(dataTransferSubscriberFeePercent: Number) {
    cdkBuilder.dataTransferSubscriberFeePercent(dataTransferSubscriberFeePercent)
  }

  /**
   * @param description A description of the entitlement. 
   * This description appears only on the MediaConnect console and is not visible outside of the
   * current AWS account.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param encryption The type of encryption that MediaConnect will use on the output that is
   * associated with the entitlement.
   */
  public fun encryption(encryption: IResolvable) {
    cdkBuilder.encryption(encryption)
  }

  /**
   * @param encryption The type of encryption that MediaConnect will use on the output that is
   * associated with the entitlement.
   */
  public fun encryption(encryption: CfnFlowEntitlement.EncryptionProperty) {
    cdkBuilder.encryption(encryption)
  }

  /**
   * @param entitlementStatus An indication of whether the new entitlement should be enabled or
   * disabled as soon as it is created.
   * If you don’t specify the entitlementStatus field in your request, MediaConnect sets it to
   * ENABLED.
   */
  public fun entitlementStatus(entitlementStatus: String) {
    cdkBuilder.entitlementStatus(entitlementStatus)
  }

  /**
   * @param flowArn The Amazon Resource Name (ARN) of the flow. 
   */
  public fun flowArn(flowArn: String) {
    cdkBuilder.flowArn(flowArn)
  }

  /**
   * @param name The name of the entitlement. 
   * This value must be unique within the current flow.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param subscribers The AWS account IDs that you want to share your content with. 
   * The receiving accounts (subscribers) will be allowed to create their own flows using your
   * content as the source.
   */
  public fun subscribers(vararg subscribers: String) {
    _subscribers.addAll(listOf(*subscribers))
  }

  /**
   * @param subscribers The AWS account IDs that you want to share your content with. 
   * The receiving accounts (subscribers) will be allowed to create their own flows using your
   * content as the source.
   */
  public fun subscribers(subscribers: Collection<String>) {
    _subscribers.addAll(subscribers)
  }

  public fun build(): CfnFlowEntitlementProps {
    if(_subscribers.isNotEmpty()) cdkBuilder.subscribers(_subscribers)
    return cdkBuilder.build()
  }
}
