package io.cloudshiftdev.awscdk.services.synthetics

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.awscdk.services.s3.assets.AssetOptions
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class Code internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.synthetics.Code,
) : CdkObject(cdkObject) {
  /**
   * Called when the canary is initialized to allow this object to bind to the stack, add resources
   * and have fun.
   *
   * @return a bound `CodeConfig`.
   * @param scope The binding scope. 
   * @param handler 
   * @param family 
   */
  public open fun bind(
    scope: Construct,
    handler: String,
    family: RuntimeFamily,
  ): CodeConfig = unwrap(this).bind(scope.let(Construct::unwrap), handler,
      family.let(RuntimeFamily::unwrap)).let(CodeConfig::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.synthetics.Code,
  ) : Code(cdkObject)

  public companion object {
    public fun fromAsset(assetPath: String): AssetCode =
        software.amazon.awscdk.services.synthetics.Code.fromAsset(assetPath).let(AssetCode::wrap)

    public fun fromAsset(assetPath: String, options: AssetOptions): AssetCode =
        software.amazon.awscdk.services.synthetics.Code.fromAsset(assetPath,
        options.let(AssetOptions::unwrap)).let(AssetCode::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8c5cc07349678d3efe0f26ff9e57f8d6a03858a592d9d2d949ef55416b24167c")
    public fun fromAsset(assetPath: String, options: AssetOptions.Builder.() -> Unit): AssetCode =
        fromAsset(assetPath, AssetOptions(options))

    public fun fromBucket(bucket: IBucket, key: String): S3Code =
        software.amazon.awscdk.services.synthetics.Code.fromBucket(bucket.let(IBucket::unwrap),
        key).let(S3Code::wrap)

    public fun fromBucket(
      bucket: IBucket,
      key: String,
      objectVersion: String,
    ): S3Code =
        software.amazon.awscdk.services.synthetics.Code.fromBucket(bucket.let(IBucket::unwrap), key,
        objectVersion).let(S3Code::wrap)

    public fun fromInline(code: String): InlineCode =
        software.amazon.awscdk.services.synthetics.Code.fromInline(code).let(InlineCode::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.Code): Code =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Code): software.amazon.awscdk.services.synthetics.Code = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.services.synthetics.Code
  }
}