@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codebuild.BuildImageConfig

/**
 * The return type from `IBuildImage.binder` - currently empty.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codebuild.*;
 * BuildImageConfig buildImageConfig = BuildImageConfig.builder().build();
 * ```
 */
@CdkDslMarker
public class BuildImageConfigDsl {
    private val cdkBuilder: BuildImageConfig.Builder = BuildImageConfig.builder()

    public fun build(): BuildImageConfig = cdkBuilder.build()
}
