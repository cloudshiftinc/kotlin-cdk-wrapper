@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlement
import software.constructs.Construct

@CdkDslMarker
public class CfnFlowEntitlementDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnFlowEntitlement.Builder = CfnFlowEntitlement.Builder.create(scope, id)

  private val _subscribers: MutableList<String> = mutableListOf()

  /**
   * The percentage of the entitlement data transfer fee that you want the subscriber to be
   * responsible for.
   *
   * Default: - 0
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowentitlement.html#cfn-mediaconnect-flowentitlement-datatransfersubscriberfeepercent)
   * @param dataTransferSubscriberFeePercent The percentage of the entitlement data transfer fee
   * that you want the subscriber to be responsible for. 
   */
  public fun dataTransferSubscriberFeePercent(dataTransferSubscriberFeePercent: Number) {
    cdkBuilder.dataTransferSubscriberFeePercent(dataTransferSubscriberFeePercent)
  }

  /**
   * A description of the entitlement.
   *
   * This description appears only on the MediaConnect console and is not visible outside of the
   * current AWS account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowentitlement.html#cfn-mediaconnect-flowentitlement-description)
   * @param description A description of the entitlement. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The type of encryption that MediaConnect will use on the output that is associated with the
   * entitlement.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowentitlement.html#cfn-mediaconnect-flowentitlement-encryption)
   * @param encryption The type of encryption that MediaConnect will use on the output that is
   * associated with the entitlement. 
   */
  public fun encryption(encryption: IResolvable) {
    cdkBuilder.encryption(encryption)
  }

  /**
   * The type of encryption that MediaConnect will use on the output that is associated with the
   * entitlement.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowentitlement.html#cfn-mediaconnect-flowentitlement-encryption)
   * @param encryption The type of encryption that MediaConnect will use on the output that is
   * associated with the entitlement. 
   */
  public fun encryption(encryption: CfnFlowEntitlement.EncryptionProperty) {
    cdkBuilder.encryption(encryption)
  }

  /**
   * An indication of whether the new entitlement should be enabled or disabled as soon as it is
   * created.
   *
   * If you don’t specify the entitlementStatus field in your request, MediaConnect sets it to
   * ENABLED.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowentitlement.html#cfn-mediaconnect-flowentitlement-entitlementstatus)
   * @param entitlementStatus An indication of whether the new entitlement should be enabled or
   * disabled as soon as it is created. 
   */
  public fun entitlementStatus(entitlementStatus: String) {
    cdkBuilder.entitlementStatus(entitlementStatus)
  }

  /**
   * The Amazon Resource Name (ARN) of the flow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowentitlement.html#cfn-mediaconnect-flowentitlement-flowarn)
   * @param flowArn The Amazon Resource Name (ARN) of the flow. 
   */
  public fun flowArn(flowArn: String) {
    cdkBuilder.flowArn(flowArn)
  }

  /**
   * The name of the entitlement.
   *
   * This value must be unique within the current flow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowentitlement.html#cfn-mediaconnect-flowentitlement-name)
   * @param name The name of the entitlement. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The AWS account IDs that you want to share your content with.
   *
   * The receiving accounts (subscribers) will be allowed to create their own flows using your
   * content as the source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowentitlement.html#cfn-mediaconnect-flowentitlement-subscribers)
   * @param subscribers The AWS account IDs that you want to share your content with. 
   */
  public fun subscribers(vararg subscribers: String) {
    _subscribers.addAll(listOf(*subscribers))
  }

  /**
   * The AWS account IDs that you want to share your content with.
   *
   * The receiving accounts (subscribers) will be allowed to create their own flows using your
   * content as the source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowentitlement.html#cfn-mediaconnect-flowentitlement-subscribers)
   * @param subscribers The AWS account IDs that you want to share your content with. 
   */
  public fun subscribers(subscribers: Collection<String>) {
    _subscribers.addAll(subscribers)
  }

  public fun build(): CfnFlowEntitlement {
    if(_subscribers.isNotEmpty()) cdkBuilder.subscribers(_subscribers)
    return cdkBuilder.build()
  }
}
