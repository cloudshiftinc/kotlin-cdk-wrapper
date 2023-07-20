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

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cloudfront.FunctionAttributes
import kotlin.String

@CdkDslMarker
public class FunctionAttributesDsl {
    private val cdkBuilder: FunctionAttributes.Builder = FunctionAttributes.builder()

    public fun functionArn(functionArn: String) {
        cdkBuilder.functionArn(functionArn)
    }

    public fun functionName(functionName: String) {
        cdkBuilder.functionName(functionName)
    }

    public fun build(): FunctionAttributes = cdkBuilder.build()
}
