@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.codepipeline.IPipeline
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import io.cloudshiftdev.awscdk.services.ssm.CfnDocument
import io.cloudshiftdev.awscdk.services.ssm.IParameter
import kotlin.String

public abstract class ConfigurationSource internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appconfig.ConfigurationSource,
) : CdkObject(cdkObject) {
  public open fun key(): IKey? = unwrap(this).getKey()?.let(IKey::wrap)

  public open fun locationUri(): String = unwrap(this).getLocationUri()

  public open fun type(): ConfigurationSourceType =
      unwrap(this).getType().let(ConfigurationSourceType::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appconfig.ConfigurationSource,
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
        CdkObject).cdkObject as software.amazon.awscdk.services.appconfig.ConfigurationSource
  }
}
