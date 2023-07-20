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

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.events.EventPatternDsl
import software.amazon.awscdk.services.events.EventPattern
import software.amazon.awscdk.services.events.IRuleTarget
import software.amazon.awscdk.services.s3.OnCloudTrailBucketEventOptions
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class OnCloudTrailBucketEventOptionsDsl {
    private val cdkBuilder: OnCloudTrailBucketEventOptions.Builder =
        OnCloudTrailBucketEventOptions.builder()

    private val _paths: MutableList<String> = mutableListOf()

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

    public fun paths(vararg paths: String) {
        _paths.addAll(listOf(*paths))
    }

    public fun paths(paths: Collection<String>) {
        _paths.addAll(paths)
    }

    public fun ruleName(ruleName: String) {
        cdkBuilder.ruleName(ruleName)
    }

    public fun target(target: IRuleTarget) {
        cdkBuilder.target(target)
    }

    public fun build(): OnCloudTrailBucketEventOptions {
        if (_paths.isNotEmpty()) cdkBuilder.paths(_paths)
        return cdkBuilder.build()
    }
}
