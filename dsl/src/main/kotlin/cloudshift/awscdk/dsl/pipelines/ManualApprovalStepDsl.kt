@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.pipelines

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.pipelines.ManualApprovalStep

@CdkDslMarker
public class ManualApprovalStepDsl(
  id: String,
) {
  private val cdkBuilder: ManualApprovalStep.Builder = ManualApprovalStep.Builder.create(id)

  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  public fun build(): ManualApprovalStep = cdkBuilder.build()
}
