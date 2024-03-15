@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ecr.IRepository
import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.awscdk.services.s3.assets.AssetOptions
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class Code internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.lambda.Code,
) : CdkObject(cdkObject) {
  public open fun bind(arg0: Construct): CodeConfig =
      unwrap(this).bind(arg0.let(Construct::unwrap)).let(CodeConfig::wrap)

  public open fun bindToResource(_resource: CfnResource) {
    unwrap(this).bindToResource(_resource.let(CfnResource::unwrap))
  }

  public open fun bindToResource(_resource: CfnResource, _options: ResourceBindOptions) {
    unwrap(this).bindToResource(_resource.let(CfnResource::unwrap),
        _options.let(ResourceBindOptions::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("83fd80fe1e3901a0f5645c4dd596ca04d5fabc7f1c05c24fc53008c232b144f1")
  public open fun bindToResource(_resource: CfnResource,
      _options: ResourceBindOptions.Builder.() -> Unit): Unit = bindToResource(_resource,
      ResourceBindOptions(_options))

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.Code,
  ) : Code(cdkObject)

  public companion object {
    public fun fromAsset(path: String): AssetCode =
        software.amazon.awscdk.services.lambda.Code.fromAsset(path).let(AssetCode::wrap)

    public fun fromAsset(path: String, options: AssetOptions): AssetCode =
        software.amazon.awscdk.services.lambda.Code.fromAsset(path,
        options.let(AssetOptions::unwrap)).let(AssetCode::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("482ed6c90255a0e03a6d17ca66757ec35db161e58b4e0672875b7a9a0c2f0349")
    public fun fromAsset(path: String, options: AssetOptions.Builder.() -> Unit): AssetCode =
        fromAsset(path, AssetOptions(options))

    public fun fromAssetImage(directory: String): AssetImageCode =
        software.amazon.awscdk.services.lambda.Code.fromAssetImage(directory).let(AssetImageCode::wrap)

    public fun fromAssetImage(directory: String, props: AssetImageCodeProps): AssetImageCode =
        software.amazon.awscdk.services.lambda.Code.fromAssetImage(directory,
        props.let(AssetImageCodeProps::unwrap)).let(AssetImageCode::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5d096922f964edb02ce125607a3ac9e055cfdef082088c11f7f28560c0ddce09")
    public fun fromAssetImage(directory: String, props: AssetImageCodeProps.Builder.() -> Unit):
        AssetImageCode = fromAssetImage(directory, AssetImageCodeProps(props))

    public fun fromBucket(bucket: IBucket, key: String): S3Code =
        software.amazon.awscdk.services.lambda.Code.fromBucket(bucket.let(IBucket::unwrap),
        key).let(S3Code::wrap)

    public fun fromBucket(
      bucket: IBucket,
      key: String,
      objectVersion: String,
    ): S3Code = software.amazon.awscdk.services.lambda.Code.fromBucket(bucket.let(IBucket::unwrap),
        key, objectVersion).let(S3Code::wrap)

    public fun fromCfnParameters(): CfnParametersCode =
        software.amazon.awscdk.services.lambda.Code.fromCfnParameters().let(CfnParametersCode::wrap)

    public fun fromCfnParameters(props: CfnParametersCodeProps): CfnParametersCode =
        software.amazon.awscdk.services.lambda.Code.fromCfnParameters(props.let(CfnParametersCodeProps::unwrap)).let(CfnParametersCode::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f942d49f88ca2fe998eddb89bc7e5353b2a9928f94e7daa6c5c5852e24b69c2d")
    public fun fromCfnParameters(props: CfnParametersCodeProps.Builder.() -> Unit):
        CfnParametersCode = fromCfnParameters(CfnParametersCodeProps(props))

    public fun fromDockerBuild(path: String): AssetCode =
        software.amazon.awscdk.services.lambda.Code.fromDockerBuild(path).let(AssetCode::wrap)

    public fun fromDockerBuild(path: String, options: DockerBuildAssetOptions): AssetCode =
        software.amazon.awscdk.services.lambda.Code.fromDockerBuild(path,
        options.let(DockerBuildAssetOptions::unwrap)).let(AssetCode::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("372495861b22df1668950d0a721b1f978c0a72ddc5b57b8449704ad4b68afca8")
    public fun fromDockerBuild(path: String, options: DockerBuildAssetOptions.Builder.() -> Unit):
        AssetCode = fromDockerBuild(path, DockerBuildAssetOptions(options))

    public fun fromEcrImage(repository: IRepository): EcrImageCode =
        software.amazon.awscdk.services.lambda.Code.fromEcrImage(repository.let(IRepository::unwrap)).let(EcrImageCode::wrap)

    public fun fromEcrImage(repository: IRepository, props: EcrImageCodeProps): EcrImageCode =
        software.amazon.awscdk.services.lambda.Code.fromEcrImage(repository.let(IRepository::unwrap),
        props.let(EcrImageCodeProps::unwrap)).let(EcrImageCode::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("333f15e8a17ec3ab2ad348015fcd8bc245011de756cdabf596035ba7d1ce157c")
    public fun fromEcrImage(repository: IRepository, props: EcrImageCodeProps.Builder.() -> Unit):
        EcrImageCode = fromEcrImage(repository, EcrImageCodeProps(props))

    public fun fromInline(code: String): InlineCode =
        software.amazon.awscdk.services.lambda.Code.fromInline(code).let(InlineCode::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.Code): Code =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Code): software.amazon.awscdk.services.lambda.Code = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.Code
  }
}
