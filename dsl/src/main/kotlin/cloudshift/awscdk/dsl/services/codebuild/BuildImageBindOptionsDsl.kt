@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codebuild.BuildImageBindOptions

/**
 * Optional arguments to `IBuildImage.binder` - currently empty.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codebuild.*;
 * BuildImageBindOptions buildImageBindOptions = BuildImageBindOptions.builder().build();
 * ```
 */
@CdkDslMarker
public class BuildImageBindOptionsDsl {
  private val cdkBuilder: BuildImageBindOptions.Builder = BuildImageBindOptions.builder()

  public fun build(): BuildImageBindOptions = cdkBuilder.build()
}
