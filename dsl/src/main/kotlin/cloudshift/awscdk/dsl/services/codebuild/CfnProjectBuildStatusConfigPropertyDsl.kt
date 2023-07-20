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
import software.amazon.awscdk.services.codebuild.CfnProject
import kotlin.String

@CdkDslMarker
public class CfnProjectBuildStatusConfigPropertyDsl {
    private val cdkBuilder: CfnProject.BuildStatusConfigProperty.Builder =
        CfnProject.BuildStatusConfigProperty.builder()

    public fun context(context: String) {
        cdkBuilder.context(context)
    }

    public fun targetUrl(targetUrl: String) {
        cdkBuilder.targetUrl(targetUrl)
    }

    public fun build(): CfnProject.BuildStatusConfigProperty = cdkBuilder.build()
}
