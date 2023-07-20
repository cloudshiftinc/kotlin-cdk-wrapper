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

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.lambda.FunctionUrlAuthType
import software.amazon.awscdk.services.lambda.FunctionUrlCorsOptions
import software.amazon.awscdk.services.lambda.FunctionUrlOptions
import software.amazon.awscdk.services.lambda.InvokeMode
import kotlin.Unit

@CdkDslMarker
public class FunctionUrlOptionsDsl {
    private val cdkBuilder: FunctionUrlOptions.Builder = FunctionUrlOptions.builder()

    public fun authType(authType: FunctionUrlAuthType) {
        cdkBuilder.authType(authType)
    }

    public fun cors(block: FunctionUrlCorsOptionsDsl.() -> Unit = {}) {
        val builder = FunctionUrlCorsOptionsDsl()
        builder.apply(block)
        cdkBuilder.cors(builder.build())
    }

    public fun cors(cors: FunctionUrlCorsOptions) {
        cdkBuilder.cors(cors)
    }

    public fun invokeMode(invokeMode: InvokeMode) {
        cdkBuilder.invokeMode(invokeMode)
    }

    public fun build(): FunctionUrlOptions = cdkBuilder.build()
}
