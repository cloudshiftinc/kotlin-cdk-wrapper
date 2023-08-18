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

package io.cloudshiftdev.awscdkdsl.services.codebuild

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
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
