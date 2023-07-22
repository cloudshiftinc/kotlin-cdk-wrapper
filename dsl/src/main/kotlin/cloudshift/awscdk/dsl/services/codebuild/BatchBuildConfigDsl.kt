@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codebuild.BatchBuildConfig
import software.amazon.awscdk.services.iam.IRole

@CdkDslMarker
public class BatchBuildConfigDsl {
  private val cdkBuilder: BatchBuildConfig.Builder = BatchBuildConfig.builder()

  /**
   * @param role The IAM batch service Role of this Project. 
   */
  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  public fun build(): BatchBuildConfig = cdkBuilder.build()
}
