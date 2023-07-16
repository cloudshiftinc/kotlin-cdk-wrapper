@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codebuild.CfnProject

@CdkDslMarker
public class CfnProjectGitSubmodulesConfigPropertyDsl {
  private val cdkBuilder: CfnProject.GitSubmodulesConfigProperty.Builder =
      CfnProject.GitSubmodulesConfigProperty.builder()

  public fun fetchSubmodules(fetchSubmodules: Boolean) {
    cdkBuilder.fetchSubmodules(fetchSubmodules)
  }

  public fun fetchSubmodules(fetchSubmodules: IResolvable) {
    cdkBuilder.fetchSubmodules(fetchSubmodules)
  }

  public fun build(): CfnProject.GitSubmodulesConfigProperty = cdkBuilder.build()
}
