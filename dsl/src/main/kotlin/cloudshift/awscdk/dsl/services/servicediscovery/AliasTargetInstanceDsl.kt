@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.servicediscovery.AliasTargetInstance
import software.amazon.awscdk.services.servicediscovery.IService
import software.constructs.Construct

@CdkDslMarker
public class AliasTargetInstanceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: AliasTargetInstance.Builder = AliasTargetInstance.Builder.create(scope,
      id)

  public fun customAttributes(customAttributes: Map<String, String>) {
    cdkBuilder.customAttributes(customAttributes)
  }

  public fun dnsName(dnsName: String) {
    cdkBuilder.dnsName(dnsName)
  }

  public fun instanceId(instanceId: String) {
    cdkBuilder.instanceId(instanceId)
  }

  public fun service(service: IService) {
    cdkBuilder.service(service)
  }

  public fun build(): AliasTargetInstance = cdkBuilder.build()
}
