@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codepipeline.actions.S3SourceVariables

@CdkDslMarker
public class S3SourceVariablesDsl {
  private val cdkBuilder: S3SourceVariables.Builder = S3SourceVariables.builder()

  /**
   * @param eTag The e-tag of the S3 version of the object that triggered the build. 
   */
  public fun eTag(eTag: String) {
    cdkBuilder.eTag(eTag)
  }

  /**
   * @param versionId The identifier of the S3 version of the object that triggered the build. 
   */
  public fun versionId(versionId: String) {
    cdkBuilder.versionId(versionId)
  }

  public fun build(): S3SourceVariables = cdkBuilder.build()
}
