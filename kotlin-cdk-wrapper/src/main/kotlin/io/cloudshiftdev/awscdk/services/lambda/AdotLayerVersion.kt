@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * An ADOT Lambda layer version that's specific to a lambda layer type and an architecture.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.lambda.AdotLambdaExecWrapper;
 * import io.cloudshiftdev.awscdk.services.lambda.AdotLayerVersion;
 * import io.cloudshiftdev.awscdk.services.lambda.AdotLambdaLayerJavaScriptSdkVersion;
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
public abstract class AdotLayerVersion(
  cdkObject: software.amazon.awscdk.services.lambda.AdotLayerVersion,
) : CdkObject(cdkObject) {
  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.AdotLayerVersion,
  ) : AdotLayerVersion(cdkObject)

  public companion object {
    public fun fromGenericLayerVersion(version: AdotLambdaLayerGenericVersion): AdotLayerVersion =
        software.amazon.awscdk.services.lambda.AdotLayerVersion.fromGenericLayerVersion(version.let(AdotLambdaLayerGenericVersion.Companion::unwrap)).let(AdotLayerVersion::wrap)

    public
        fun fromJavaAutoInstrumentationLayerVersion(version: AdotLambdaLayerJavaAutoInstrumentationVersion):
        AdotLayerVersion =
        software.amazon.awscdk.services.lambda.AdotLayerVersion.fromJavaAutoInstrumentationLayerVersion(version.let(AdotLambdaLayerJavaAutoInstrumentationVersion.Companion::unwrap)).let(AdotLayerVersion::wrap)

    public fun fromJavaScriptSdkLayerVersion(version: AdotLambdaLayerJavaScriptSdkVersion):
        AdotLayerVersion =
        software.amazon.awscdk.services.lambda.AdotLayerVersion.fromJavaScriptSdkLayerVersion(version.let(AdotLambdaLayerJavaScriptSdkVersion.Companion::unwrap)).let(AdotLayerVersion::wrap)

    public fun fromJavaSdkLayerVersion(version: AdotLambdaLayerJavaSdkVersion): AdotLayerVersion =
        software.amazon.awscdk.services.lambda.AdotLayerVersion.fromJavaSdkLayerVersion(version.let(AdotLambdaLayerJavaSdkVersion.Companion::unwrap)).let(AdotLayerVersion::wrap)

    public fun fromPythonSdkLayerVersion(version: AdotLambdaLayerPythonSdkVersion): AdotLayerVersion
        =
        software.amazon.awscdk.services.lambda.AdotLayerVersion.fromPythonSdkLayerVersion(version.let(AdotLambdaLayerPythonSdkVersion.Companion::unwrap)).let(AdotLayerVersion::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.AdotLayerVersion):
        AdotLayerVersion = CdkObjectWrappers.wrap(cdkObject) as? AdotLayerVersion ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AdotLayerVersion):
        software.amazon.awscdk.services.lambda.AdotLayerVersion = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.lambda.AdotLayerVersion
  }
}
