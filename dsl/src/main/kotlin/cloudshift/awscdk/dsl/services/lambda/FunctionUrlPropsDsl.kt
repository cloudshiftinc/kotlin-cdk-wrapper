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
import software.amazon.awscdk.services.lambda.FunctionUrlProps
import software.amazon.awscdk.services.lambda.IFunction
import software.amazon.awscdk.services.lambda.InvokeMode
import kotlin.Unit

@CdkDslMarker
public class FunctionUrlPropsDsl {
    private val cdkBuilder: FunctionUrlProps.Builder = FunctionUrlProps.builder()

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

    public fun function(function: IFunction) {
        cdkBuilder.function(function)
    }

    public fun invokeMode(invokeMode: InvokeMode) {
        cdkBuilder.invokeMode(invokeMode)
    }

    public fun build(): FunctionUrlProps = cdkBuilder.build()
}
