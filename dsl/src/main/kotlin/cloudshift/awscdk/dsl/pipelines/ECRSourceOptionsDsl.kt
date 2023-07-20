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

package cloudshift.awscdk.dsl.pipelines

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.pipelines.ECRSourceOptions
import kotlin.String

@CdkDslMarker
public class ECRSourceOptionsDsl {
    private val cdkBuilder: ECRSourceOptions.Builder = ECRSourceOptions.builder()

    public fun actionName(actionName: String) {
        cdkBuilder.actionName(actionName)
    }

    public fun imageTag(imageTag: String) {
        cdkBuilder.imageTag(imageTag)
    }

    public fun build(): ECRSourceOptions = cdkBuilder.build()
}
