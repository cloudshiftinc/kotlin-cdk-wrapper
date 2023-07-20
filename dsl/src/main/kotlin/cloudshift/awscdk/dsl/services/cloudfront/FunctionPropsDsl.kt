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
import software.amazon.awscdk.services.cloudfront.FunctionCode
import software.amazon.awscdk.services.cloudfront.FunctionProps
import kotlin.String

@CdkDslMarker
public class FunctionPropsDsl {
    private val cdkBuilder: FunctionProps.Builder = FunctionProps.builder()

    public fun code(code: FunctionCode) {
        cdkBuilder.code(code)
    }

    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    public fun functionName(functionName: String) {
        cdkBuilder.functionName(functionName)
    }

    public fun build(): FunctionProps = cdkBuilder.build()
}
