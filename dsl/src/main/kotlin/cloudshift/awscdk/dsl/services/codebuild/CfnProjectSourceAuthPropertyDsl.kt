@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codebuild.CfnProject

@CdkDslMarker
public class CfnProjectSourceAuthPropertyDsl {
  private val cdkBuilder: CfnProject.SourceAuthProperty.Builder =
      CfnProject.SourceAuthProperty.builder()

  /**
   * @param resource The resource value that applies to the specified authorization type.
   *
   * This data type is used by the AWS CodeBuild console only.
   */
  public fun resource(resource: String) {
    cdkBuilder.resource(resource)
  }

  /**
   * @param type The authorization type to use. The only valid value is `OAUTH` , which represents
   * the OAuth authorization type. 
   *
   * This data type is used by the AWS CodeBuild console only.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnProject.SourceAuthProperty = cdkBuilder.build()
}
