@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codebuild.CfnProject

@CdkDslMarker
public class CfnProjectSourceAuthPropertyDsl {
  private val cdkBuilder: CfnProject.SourceAuthProperty.Builder =
      CfnProject.SourceAuthProperty.builder()

  public fun resource(resource: String) {
    cdkBuilder.resource(resource)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnProject.SourceAuthProperty = cdkBuilder.build()
}
