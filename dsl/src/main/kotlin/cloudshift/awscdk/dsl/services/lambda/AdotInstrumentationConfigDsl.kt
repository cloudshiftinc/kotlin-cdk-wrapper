@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.lambda.AdotInstrumentationConfig
import software.amazon.awscdk.services.lambda.AdotLambdaExecWrapper
import software.amazon.awscdk.services.lambda.AdotLayerVersion

/**
 * Properties for an ADOT instrumentation in Lambda.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.lambda.AdotLambdaExecWrapper;
 * import software.amazon.awscdk.services.lambda.AdotLayerVersion;
 * import software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaScriptSdkVersion;
 * Function fn = Function.Builder.create(this, "MyFunction")
 * .runtime(Runtime.NODEJS_18_X)
 * .handler("index.handler")
 * .code(Code.fromInline("exports.handler = function(event, ctx, cb) { return cb(null, \"hi\"); }"))
 * .adotInstrumentation(AdotInstrumentationConfig.builder()
 * .layerVersion(AdotLayerVersion.fromJavaScriptSdkLayerVersion(AdotLambdaLayerJavaScriptSdkVersion.LATEST))
 * .execWrapper(AdotLambdaExecWrapper.REGULAR_HANDLER)
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class AdotInstrumentationConfigDsl {
    private val cdkBuilder: AdotInstrumentationConfig.Builder = AdotInstrumentationConfig.builder()

    /**
     * @param execWrapper The startup script to run, see ADOT documentation to pick the right script
     *   for your use case: https://aws-otel.github.io/docs/getting-started/lambda.
     */
    public fun execWrapper(execWrapper: AdotLambdaExecWrapper) {
        cdkBuilder.execWrapper(execWrapper)
    }

    /** @param layerVersion The ADOT Lambda layer. */
    public fun layerVersion(layerVersion: AdotLayerVersion) {
        cdkBuilder.layerVersion(layerVersion)
    }

    public fun build(): AdotInstrumentationConfig = cdkBuilder.build()
}
