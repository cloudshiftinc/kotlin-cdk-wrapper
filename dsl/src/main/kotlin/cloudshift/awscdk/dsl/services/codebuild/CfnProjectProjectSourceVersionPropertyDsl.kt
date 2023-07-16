@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codebuild.CfnProject

@CdkDslMarker
public class CfnProjectProjectSourceVersionPropertyDsl {
  private val cdkBuilder: CfnProject.ProjectSourceVersionProperty.Builder =
      CfnProject.ProjectSourceVersionProperty.builder()

  public fun sourceIdentifier(sourceIdentifier: String) {
    cdkBuilder.sourceIdentifier(sourceIdentifier)
  }

  public fun sourceVersion(sourceVersion: String) {
    cdkBuilder.sourceVersion(sourceVersion)
  }

  public fun build(): CfnProject.ProjectSourceVersionProperty = cdkBuilder.build()
}
