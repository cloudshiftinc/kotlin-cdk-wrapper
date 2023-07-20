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

package cloudshift.awscdk.dsl.services.ecr

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.events.EventPatternDsl
import software.amazon.awscdk.services.ecr.OnCloudTrailImagePushedOptions
import software.amazon.awscdk.services.events.EventPattern
import software.amazon.awscdk.services.events.IRuleTarget
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class OnCloudTrailImagePushedOptionsDsl {
    private val cdkBuilder: OnCloudTrailImagePushedOptions.Builder =
        OnCloudTrailImagePushedOptions.builder()

    public fun crossStackScope(crossStackScope: Construct) {
        cdkBuilder.crossStackScope(crossStackScope)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun eventPattern(block: EventPatternDsl.() -> Unit = {}) {
        val builder = EventPatternDsl()
        builder.apply(block)
        cdkBuilder.eventPattern(builder.build())
    }

    public fun eventPattern(eventPattern: EventPattern) {
        cdkBuilder.eventPattern(eventPattern)
    }

    public fun imageTag(imageTag: String) {
        cdkBuilder.imageTag(imageTag)
    }

    public fun ruleName(ruleName: String) {
        cdkBuilder.ruleName(ruleName)
    }

    public fun target(target: IRuleTarget) {
        cdkBuilder.target(target)
    }

    public fun build(): OnCloudTrailImagePushedOptions = cdkBuilder.build()
}
