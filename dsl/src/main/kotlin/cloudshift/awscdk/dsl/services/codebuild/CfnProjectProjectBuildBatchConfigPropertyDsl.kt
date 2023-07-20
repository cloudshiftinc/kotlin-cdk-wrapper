@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codebuild.CfnProject

@CdkDslMarker
public class CfnProjectProjectBuildBatchConfigPropertyDsl {
  private val cdkBuilder: CfnProject.ProjectBuildBatchConfigProperty.Builder =
      CfnProject.ProjectBuildBatchConfigProperty.builder()

  public fun batchReportMode(batchReportMode: String) {
    cdkBuilder.batchReportMode(batchReportMode)
  }

  public fun combineArtifacts(combineArtifacts: Boolean) {
    cdkBuilder.combineArtifacts(combineArtifacts)
  }

  public fun combineArtifacts(combineArtifacts: IResolvable) {
    cdkBuilder.combineArtifacts(combineArtifacts)
  }

  public fun restrictions(restrictions: IResolvable) {
    cdkBuilder.restrictions(restrictions)
  }

  public fun restrictions(restrictions: CfnProject.BatchRestrictionsProperty) {
    cdkBuilder.restrictions(restrictions)
  }

  public fun serviceRole(serviceRole: String) {
    cdkBuilder.serviceRole(serviceRole)
  }

  public fun timeoutInMins(timeoutInMins: Number) {
    cdkBuilder.timeoutInMins(timeoutInMins)
  }

  public fun build(): CfnProject.ProjectBuildBatchConfigProperty = cdkBuilder.build()
}
