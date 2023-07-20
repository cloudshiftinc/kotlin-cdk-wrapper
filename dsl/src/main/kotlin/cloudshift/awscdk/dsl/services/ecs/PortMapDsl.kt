@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ecs.AppProtocol
import software.amazon.awscdk.services.ecs.NetworkMode
import software.amazon.awscdk.services.ecs.PortMap
import software.amazon.awscdk.services.ecs.Protocol

@CdkDslMarker
public class PortMapDsl(
  networkmode: NetworkMode,
) {
  private val cdkBuilder: PortMap.Builder = PortMap.Builder.create(networkmode)

  public fun appProtocol(appProtocol: AppProtocol) {
    cdkBuilder.appProtocol(appProtocol)
  }

  public fun containerPort(containerPort: Number) {
    cdkBuilder.containerPort(containerPort)
  }

  public fun hostPort(hostPort: Number) {
    cdkBuilder.hostPort(hostPort)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun protocol(protocol: Protocol) {
    cdkBuilder.protocol(protocol)
  }

  public fun build(): PortMap = cdkBuilder.build()
}
