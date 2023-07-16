@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.globalaccelerator.endpoints

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.services.ec2.IInstance
import software.amazon.awscdk.services.globalaccelerator.endpoints.InstanceEndpoint

@CdkDslMarker
public class InstanceEndpointDsl(
  arg0: IInstance,
) {
  private val cdkBuilder: InstanceEndpoint.Builder = InstanceEndpoint.Builder.create(arg0)

  public fun preserveClientIp(preserveClientIp: Boolean) {
    cdkBuilder.preserveClientIp(preserveClientIp)
  }

  public fun weight(weight: Number) {
    cdkBuilder.weight(weight)
  }

  public fun build(): InstanceEndpoint = cdkBuilder.build()
}
