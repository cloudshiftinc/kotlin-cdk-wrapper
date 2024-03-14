package io.cloudshiftdev.awscdk.services.lambda

import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class ParamsAndSecretsLayerVersion internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lambda.ParamsAndSecretsLayerVersion,
) {
  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.lambda.ParamsAndSecretsLayerVersion,
  ) : ParamsAndSecretsLayerVersion(cdkObject)

  public companion object {
    public fun fromVersion(version: ParamsAndSecretsVersions): ParamsAndSecretsLayerVersion =
        software.amazon.awscdk.services.lambda.ParamsAndSecretsLayerVersion.fromVersion(version.let(ParamsAndSecretsVersions::unwrap)).let(ParamsAndSecretsLayerVersion::wrap)

    public fun fromVersion(version: ParamsAndSecretsVersions, options: ParamsAndSecretsOptions):
        ParamsAndSecretsLayerVersion =
        software.amazon.awscdk.services.lambda.ParamsAndSecretsLayerVersion.fromVersion(version.let(ParamsAndSecretsVersions::unwrap),
        options.let(ParamsAndSecretsOptions::unwrap)).let(ParamsAndSecretsLayerVersion::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f1b82c076f39ba30e00df9abcd79a9e4954d933bd2f8b2c77ba643a3cb00f202")
    public fun fromVersion(version: ParamsAndSecretsVersions,
        options: ParamsAndSecretsOptions.Builder.() -> Unit): ParamsAndSecretsLayerVersion =
        fromVersion(version, ParamsAndSecretsOptions(options))

    public fun fromVersionArn(arn: String): ParamsAndSecretsLayerVersion =
        software.amazon.awscdk.services.lambda.ParamsAndSecretsLayerVersion.fromVersionArn(arn).let(ParamsAndSecretsLayerVersion::wrap)

    public fun fromVersionArn(arn: String, options: ParamsAndSecretsOptions):
        ParamsAndSecretsLayerVersion =
        software.amazon.awscdk.services.lambda.ParamsAndSecretsLayerVersion.fromVersionArn(arn,
        options.let(ParamsAndSecretsOptions::unwrap)).let(ParamsAndSecretsLayerVersion::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3292c50e00e6ffb93a6b79c2d477463172c96cf17a9de19268d2294bfd3aadfd")
    public fun fromVersionArn(arn: String, options: ParamsAndSecretsOptions.Builder.() -> Unit):
        ParamsAndSecretsLayerVersion = fromVersionArn(arn, ParamsAndSecretsOptions(options))

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.ParamsAndSecretsLayerVersion):
        ParamsAndSecretsLayerVersion = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ParamsAndSecretsLayerVersion):
        software.amazon.awscdk.services.lambda.ParamsAndSecretsLayerVersion = (wrapped as
        Wrapper).cdkObject
  }
}
