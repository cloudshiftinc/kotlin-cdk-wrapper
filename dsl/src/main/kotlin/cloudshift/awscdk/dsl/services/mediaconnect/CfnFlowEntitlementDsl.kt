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

  public fun dataTransferSubscriberFeePercent(dataTransferSubscriberFeePercent: Number) {
    cdkBuilder.dataTransferSubscriberFeePercent(dataTransferSubscriberFeePercent)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun encryption(encryption: IResolvable) {
    cdkBuilder.encryption(encryption)
  }

  public fun encryption(encryption: CfnFlowEntitlement.EncryptionProperty) {
    cdkBuilder.encryption(encryption)
  }

  public fun entitlementStatus(entitlementStatus: String) {
    cdkBuilder.entitlementStatus(entitlementStatus)
  }

  public fun flowArn(flowArn: String) {
    cdkBuilder.flowArn(flowArn)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun subscribers(vararg subscribers: String) {
    _subscribers.addAll(listOf(*subscribers))
  }

  public fun subscribers(subscribers: Collection<String>) {
    _subscribers.addAll(subscribers)
  }

  public fun build(): CfnFlowEntitlement {
    if(_subscribers.isNotEmpty()) cdkBuilder.subscribers(_subscribers)
    return cdkBuilder.build()
  }
}
