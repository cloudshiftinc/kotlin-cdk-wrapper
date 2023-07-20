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

package cloudshift.awscdk.dsl.assertions

import software.amazon.awscdk.assertions.MatchCapture
import software.amazon.awscdk.assertions.MatchFailure
import software.amazon.awscdk.assertions.TemplateParsingOptions
import kotlin.Unit

public object assertions {
    public inline fun matchCapture(block: MatchCaptureDsl.() -> Unit = {}): MatchCapture {
        val builder = MatchCaptureDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun matchFailure(block: MatchFailureDsl.() -> Unit = {}): MatchFailure {
        val builder = MatchFailureDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun templateParsingOptions(block: TemplateParsingOptionsDsl.() -> Unit = {}): TemplateParsingOptions {
        val builder = TemplateParsingOptionsDsl()
        builder.apply(block)
        return builder.build()
    }
}
