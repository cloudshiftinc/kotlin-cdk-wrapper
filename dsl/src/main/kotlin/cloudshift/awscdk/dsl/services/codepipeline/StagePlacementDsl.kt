@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codepipeline.IStage
import software.amazon.awscdk.services.codepipeline.StagePlacement

@CdkDslMarker
public class StagePlacementDsl {
  private val cdkBuilder: StagePlacement.Builder = StagePlacement.builder()

  /**
   * @param justAfter Inserts the new Stage as a child of the given Stage (changing its current
   * child Stage, if it had one).
   */
  public fun justAfter(justAfter: IStage) {
    cdkBuilder.justAfter(justAfter)
  }

  /**
   * @param rightBefore Inserts the new Stage as a parent of the given Stage (changing its current
   * parent Stage, if it had one).
   */
  public fun rightBefore(rightBefore: IStage) {
    cdkBuilder.rightBefore(rightBefore)
  }

  public fun build(): StagePlacement = cdkBuilder.build()
}
