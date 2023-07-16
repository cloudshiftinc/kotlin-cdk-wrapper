@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codepipeline.IStage
import software.amazon.awscdk.services.codepipeline.StagePlacement

@CdkDslMarker
public class StagePlacementDsl {
  private val cdkBuilder: StagePlacement.Builder = StagePlacement.builder()

  public fun justAfter(justAfter: IStage) {
    cdkBuilder.justAfter(justAfter)
  }

  public fun rightBefore(rightBefore: IStage) {
    cdkBuilder.rightBefore(rightBefore)
  }

  public fun build(): StagePlacement = cdkBuilder.build()
}
