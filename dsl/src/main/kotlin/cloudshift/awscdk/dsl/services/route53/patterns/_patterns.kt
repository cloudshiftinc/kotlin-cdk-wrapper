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

package cloudshift.awscdk.dsl.services.route53.patterns

import software.amazon.awscdk.services.route53.patterns.HttpsRedirect
import software.amazon.awscdk.services.route53.patterns.HttpsRedirectProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object patterns {
    public inline fun httpsRedirect(
        scope: Construct,
        id: String,
        block: HttpsRedirectDsl.() -> Unit = {},
    ): HttpsRedirect {
        val builder = HttpsRedirectDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun httpsRedirectProps(block: HttpsRedirectPropsDsl.() -> Unit = {}): HttpsRedirectProps {
        val builder = HttpsRedirectPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
