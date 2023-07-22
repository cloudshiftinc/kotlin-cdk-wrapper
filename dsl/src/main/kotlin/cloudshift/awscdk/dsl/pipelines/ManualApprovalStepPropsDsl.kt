@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.pipelines

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.pipelines.ManualApprovalStepProps

@CdkDslMarker
public class ManualApprovalStepPropsDsl {
  private val cdkBuilder: ManualApprovalStepProps.Builder = ManualApprovalStepProps.builder()

  /**
   * @param comment The comment to display with this manual approval.
   */
  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  public fun build(): ManualApprovalStepProps = cdkBuilder.build()
}
