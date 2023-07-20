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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codebuild.CfnProject
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnProjectWebhookFilterPropertyDsl {
    private val cdkBuilder: CfnProject.WebhookFilterProperty.Builder =
        CfnProject.WebhookFilterProperty.builder()

    public fun excludeMatchedPattern(excludeMatchedPattern: Boolean) {
        cdkBuilder.excludeMatchedPattern(excludeMatchedPattern)
    }

    public fun excludeMatchedPattern(excludeMatchedPattern: IResolvable) {
        cdkBuilder.excludeMatchedPattern(excludeMatchedPattern)
    }

    public fun pattern(pattern: String) {
        cdkBuilder.pattern(pattern)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnProject.WebhookFilterProperty = cdkBuilder.build()
}
