@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codebuild.BuildImageBindOptions

@CdkDslMarker
public class BuildImageBindOptionsDsl {
  private val cdkBuilder: BuildImageBindOptions.Builder = BuildImageBindOptions.builder()

  public fun build(): BuildImageBindOptions = cdkBuilder.build()
}
