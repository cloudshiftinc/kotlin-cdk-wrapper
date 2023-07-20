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

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appsync.AppsyncFunctionAttributes
import kotlin.String

@CdkDslMarker
public class AppsyncFunctionAttributesDsl {
    private val cdkBuilder: AppsyncFunctionAttributes.Builder = AppsyncFunctionAttributes.builder()

    public fun functionArn(functionArn: String) {
        cdkBuilder.functionArn(functionArn)
    }

    public fun build(): AppsyncFunctionAttributes = cdkBuilder.build()
}
