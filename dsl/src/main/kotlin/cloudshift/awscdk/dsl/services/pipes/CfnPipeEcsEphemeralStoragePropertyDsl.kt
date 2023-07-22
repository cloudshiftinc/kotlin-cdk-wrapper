@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.pipes.CfnPipe

@CdkDslMarker
public class CfnPipeEcsEphemeralStoragePropertyDsl {
  private val cdkBuilder: CfnPipe.EcsEphemeralStorageProperty.Builder =
      CfnPipe.EcsEphemeralStorageProperty.builder()

  /**
   * @param sizeInGiB The total amount, in GiB, of ephemeral storage to set for the task. 
   * The minimum supported value is `21` GiB and the maximum supported value is `200` GiB.
   */
  public fun sizeInGiB(sizeInGiB: Number) {
    cdkBuilder.sizeInGiB(sizeInGiB)
  }

  public fun build(): CfnPipe.EcsEphemeralStorageProperty = cdkBuilder.build()
}
