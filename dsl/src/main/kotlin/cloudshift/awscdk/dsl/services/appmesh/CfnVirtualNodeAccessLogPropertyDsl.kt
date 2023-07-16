@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@CdkDslMarker
public class CfnVirtualNodeAccessLogPropertyDsl {
  private val cdkBuilder: CfnVirtualNode.AccessLogProperty.Builder =
      CfnVirtualNode.AccessLogProperty.builder()

  public fun `file`(`file`: IResolvable) {
    cdkBuilder.`file`(`file`)
  }

  public fun `file`(`file`: CfnVirtualNode.FileAccessLogProperty) {
    cdkBuilder.`file`(`file`)
  }

  public fun build(): CfnVirtualNode.AccessLogProperty = cdkBuilder.build()
}
