@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.pipes.CfnPipe

@CdkDslMarker
public class CfnPipeEcsEphemeralStoragePropertyDsl {
  private val cdkBuilder: CfnPipe.EcsEphemeralStorageProperty.Builder =
      CfnPipe.EcsEphemeralStorageProperty.builder()

  public fun sizeInGiB(sizeInGiB: Number) {
    cdkBuilder.sizeInGiB(sizeInGiB)
  }

  public fun build(): CfnPipe.EcsEphemeralStorageProperty = cdkBuilder.build()
}
