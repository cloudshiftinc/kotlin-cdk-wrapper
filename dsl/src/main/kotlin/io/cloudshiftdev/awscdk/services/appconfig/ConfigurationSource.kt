package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.services.codepipeline.IPipeline
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import io.cloudshiftdev.awscdk.services.ssm.CfnDocument
import io.cloudshiftdev.awscdk.services.ssm.IParameter
import kotlin.String

public abstract class ConfigurationSource internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appconfig.ConfigurationSource,
) {
  /**
   * The KMS Key that encrypts the configuration.
   */
  public open fun key(): IKey? = unwrap(this).getKey()?.let(IKey::wrap)

  /**
   * The URI of the configuration source.
   */
  public open fun locationUri(): String = unwrap(this).getLocationUri()

  /**
   * The type of the configuration source.
   */
  public open fun type(): ConfigurationSourceType =
      unwrap(this).getType().let(ConfigurationSourceType::wrap)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appconfig.ConfigurationSource,
  ) : ConfigurationSource(cdkObject)

  public companion object {
    public fun fromBucket(bucket: IBucket, objectKey: String): ConfigurationSource =
        software.amazon.awscdk.services.appconfig.ConfigurationSource.fromBucket(bucket.let(IBucket::unwrap),
        objectKey).let(ConfigurationSource::wrap)

    public fun fromBucket(
      bucket: IBucket,
      objectKey: String,
      key: IKey,
    ): ConfigurationSource =
        software.amazon.awscdk.services.appconfig.ConfigurationSource.fromBucket(bucket.let(IBucket::unwrap),
        objectKey, key.let(IKey::unwrap)).let(ConfigurationSource::wrap)

    public fun fromCfnDocument(document: CfnDocument): ConfigurationSource =
        software.amazon.awscdk.services.appconfig.ConfigurationSource.fromCfnDocument(document.let(CfnDocument::unwrap)).let(ConfigurationSource::wrap)

    public fun fromParameter(parameter: IParameter): ConfigurationSource =
        software.amazon.awscdk.services.appconfig.ConfigurationSource.fromParameter(parameter.let(IParameter::unwrap)).let(ConfigurationSource::wrap)

    public fun fromParameter(parameter: IParameter, key: IKey): ConfigurationSource =
        software.amazon.awscdk.services.appconfig.ConfigurationSource.fromParameter(parameter.let(IParameter::unwrap),
        key.let(IKey::unwrap)).let(ConfigurationSource::wrap)

    public fun fromPipeline(pipeline: IPipeline): ConfigurationSource =
        software.amazon.awscdk.services.appconfig.ConfigurationSource.fromPipeline(pipeline.let(IPipeline::unwrap)).let(ConfigurationSource::wrap)

    public fun fromSecret(secret: ISecret): ConfigurationSource =
        software.amazon.awscdk.services.appconfig.ConfigurationSource.fromSecret(secret.let(ISecret::unwrap)).let(ConfigurationSource::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.ConfigurationSource):
        ConfigurationSource = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ConfigurationSource):
        software.amazon.awscdk.services.appconfig.ConfigurationSource = (wrapped as
        Wrapper).cdkObject
  }
}
