@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codebuild.BuildImageConfig

@CdkDslMarker
public class BuildImageConfigDsl {
    private val cdkBuilder: BuildImageConfig.Builder = BuildImageConfig.builder()

    public fun build(): BuildImageConfig = cdkBuilder.build()
}
