package io.cloudshiftdev.awscdk.services.lambda

public abstract class AdotLayerVersion internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lambda.AdotLayerVersion,
) {
  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.lambda.AdotLayerVersion,
  ) : AdotLayerVersion(cdkObject)

  public companion object {
    public open fun fromGenericLayerVersion(version: AdotLambdaLayerGenericVersion):
        AdotLayerVersion =
        software.amazon.awscdk.services.lambda.AdotLayerVersion.fromGenericLayerVersion(version.let(AdotLambdaLayerGenericVersion::unwrap)).let(AdotLayerVersion::wrap)

    public open
        fun fromJavaAutoInstrumentationLayerVersion(version: AdotLambdaLayerJavaAutoInstrumentationVersion):
        AdotLayerVersion =
        software.amazon.awscdk.services.lambda.AdotLayerVersion.fromJavaAutoInstrumentationLayerVersion(version.let(AdotLambdaLayerJavaAutoInstrumentationVersion::unwrap)).let(AdotLayerVersion::wrap)

    public open fun fromJavaScriptSdkLayerVersion(version: AdotLambdaLayerJavaScriptSdkVersion):
        AdotLayerVersion =
        software.amazon.awscdk.services.lambda.AdotLayerVersion.fromJavaScriptSdkLayerVersion(version.let(AdotLambdaLayerJavaScriptSdkVersion::unwrap)).let(AdotLayerVersion::wrap)

    public open fun fromJavaSdkLayerVersion(version: AdotLambdaLayerJavaSdkVersion):
        AdotLayerVersion =
        software.amazon.awscdk.services.lambda.AdotLayerVersion.fromJavaSdkLayerVersion(version.let(AdotLambdaLayerJavaSdkVersion::unwrap)).let(AdotLayerVersion::wrap)

    public open fun fromPythonSdkLayerVersion(version: AdotLambdaLayerPythonSdkVersion):
        AdotLayerVersion =
        software.amazon.awscdk.services.lambda.AdotLayerVersion.fromPythonSdkLayerVersion(version.let(AdotLambdaLayerPythonSdkVersion::unwrap)).let(AdotLayerVersion::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.AdotLayerVersion):
        AdotLayerVersion = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AdotLayerVersion):
        software.amazon.awscdk.services.lambda.AdotLayerVersion = (wrapped as Wrapper).cdkObject
  }
}
