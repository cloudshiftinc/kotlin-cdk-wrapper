@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apprunner

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apprunner.CfnService

@CdkDslMarker
public class CfnServiceSourceCodeVersionPropertyDsl {
  private val cdkBuilder: CfnService.SourceCodeVersionProperty.Builder =
      CfnService.SourceCodeVersionProperty.builder()

  /**
   * @param type The type of version identifier. 
   * For a git-based repository, branches represent versions.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  /**
   * @param value A source code version. 
   * For a git-based repository, a branch name maps to a specific version. App Runner uses the most
   * recent commit to the branch.
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnService.SourceCodeVersionProperty = cdkBuilder.build()
}
