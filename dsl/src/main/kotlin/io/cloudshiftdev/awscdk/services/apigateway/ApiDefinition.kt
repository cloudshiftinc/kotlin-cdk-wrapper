package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.awscdk.services.s3.assets.AssetOptions
import io.cloudshiftdev.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class ApiDefinition internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigateway.ApiDefinition,
) {
  public open fun bind(arg0: Construct): ApiDefinitionConfig =
      unwrap(this).bind(arg0.let(Construct::unwrap)).let(ApiDefinitionConfig::wrap)

  public open fun bindAfterCreate(_scope: Construct, _restApi: IRestApi) {
    unwrap(this).bindAfterCreate(_scope.let(Construct::unwrap), _restApi.let(IRestApi::unwrap))
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigateway.ApiDefinition,
  ) : ApiDefinition(cdkObject)

  public companion object {
    public open fun fromAsset(`file`: String): AssetApiDefinition =
        software.amazon.awscdk.services.apigateway.ApiDefinition.fromAsset(`file`).let(AssetApiDefinition::wrap)

    public open fun fromAsset(`file`: String, options: AssetOptions): AssetApiDefinition =
        software.amazon.awscdk.services.apigateway.ApiDefinition.fromAsset(`file`,
        options.let(AssetOptions::unwrap)).let(AssetApiDefinition::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1fb7424fb7a8091c53e571077a35ba78a28ea3dcadc70091587f610eea2f9998")
    public open fun fromAsset(`file`: String, options: AssetOptions.Builder.() -> Unit):
        AssetApiDefinition = fromAsset(`file`, AssetOptions(options))

    public open fun fromBucket(bucket: IBucket, key: String): S3ApiDefinition =
        software.amazon.awscdk.services.apigateway.ApiDefinition.fromBucket(bucket.let(IBucket::unwrap),
        key).let(S3ApiDefinition::wrap)

    public open fun fromBucket(
      bucket: IBucket,
      key: String,
      objectVersion: String,
    ): S3ApiDefinition =
        software.amazon.awscdk.services.apigateway.ApiDefinition.fromBucket(bucket.let(IBucket::unwrap),
        key, objectVersion).let(S3ApiDefinition::wrap)

    public open fun fromInline(definition: Any): InlineApiDefinition =
        software.amazon.awscdk.services.apigateway.ApiDefinition.fromInline(definition).let(InlineApiDefinition::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.ApiDefinition):
        ApiDefinition = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApiDefinition):
        software.amazon.awscdk.services.apigateway.ApiDefinition = (wrapped as Wrapper).cdkObject
  }
}
