@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@CdkDslMarker
public class CfnVirtualNodeLoggingPropertyDsl {
  private val cdkBuilder: CfnVirtualNode.LoggingProperty.Builder =
      CfnVirtualNode.LoggingProperty.builder()

  /**
   * @param accessLog The access log configuration for a virtual node.
   */
  public fun accessLog(accessLog: IResolvable) {
    cdkBuilder.accessLog(accessLog)
  }

  /**
   * @param accessLog The access log configuration for a virtual node.
   */
  public fun accessLog(accessLog: CfnVirtualNode.AccessLogProperty) {
    cdkBuilder.accessLog(accessLog)
  }

  public fun build(): CfnVirtualNode.LoggingProperty = cdkBuilder.build()
}
