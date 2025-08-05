@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.synthetics

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.awscdk.services.s3.assets.AssetOptions
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * The code the canary should execute.
 *
 * Example:
 *
 * ```
 * Canary canary = Canary.Builder.create(this, "MyCanary")
 * .schedule(Schedule.rate(Duration.minutes(5)))
 * .test(Test.custom(CustomTestOptions.builder()
 * .code(Code.fromAsset(join(__dirname, "canary")))
 * .handler("index.handler")
 * .build()))
 * .runtime(Runtime.SYNTHETICS_NODEJS_PUPPETEER_7_0)
 * .resourcesToReplicateTags(List.of(ResourceToReplicateTags.LAMBDA_FUNCTION))
 * .build();
 * ```
 */
public abstract class Code(
  cdkObject: software.amazon.awscdk.services.synthetics.Code,
) : CdkObject(cdkObject) {
  /**
   * Called when the canary is initialized to allow this object to bind to the stack, add resources
   * and have fun.
   *
   * @return a bound `CodeConfig`.
   * @param scope The binding scope. 
   * @param handler 
   * @param family 
   * @param runtimeName
   */
  public open fun bind(
    scope: Construct,
    handler: String,
    family: RuntimeFamily,
  ): CodeConfig = unwrap(this).bind(scope.let(Construct.Companion::unwrap), handler,
      family.let(RuntimeFamily.Companion::unwrap)).let(CodeConfig::wrap)

  /**
   * Called when the canary is initialized to allow this object to bind to the stack, add resources
   * and have fun.
   *
   * @return a bound `CodeConfig`.
   * @param scope The binding scope. 
   * @param handler 
   * @param family 
   * @param runtimeName
   */
  public open fun bind(
    scope: Construct,
    handler: String,
    family: RuntimeFamily,
    runtimeName: String,
  ): CodeConfig = unwrap(this).bind(scope.let(Construct.Companion::unwrap), handler,
      family.let(RuntimeFamily.Companion::unwrap), runtimeName).let(CodeConfig::wrap)

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.synthetics.Code,
  ) : Code(cdkObject)

  public companion object {
    public fun fromAsset(assetPath: String): AssetCode =
        software.amazon.awscdk.services.synthetics.Code.fromAsset(assetPath).let(AssetCode::wrap)

    public fun fromAsset(assetPath: String, options: AssetOptions): AssetCode =
        software.amazon.awscdk.services.synthetics.Code.fromAsset(assetPath,
        options.let(AssetOptions.Companion::unwrap)).let(AssetCode::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8c5cc07349678d3efe0f26ff9e57f8d6a03858a592d9d2d949ef55416b24167c")
    public fun fromAsset(assetPath: String, options: AssetOptions.Builder.() -> Unit): AssetCode =
        fromAsset(assetPath, AssetOptions(options))

    public fun fromBucket(bucket: IBucket, key: String): S3Code =
        software.amazon.awscdk.services.synthetics.Code.fromBucket(bucket.let(IBucket.Companion::unwrap),
        key).let(S3Code::wrap)

    public fun fromBucket(
      bucket: IBucket,
      key: String,
      objectVersion: String,
    ): S3Code =
        software.amazon.awscdk.services.synthetics.Code.fromBucket(bucket.let(IBucket.Companion::unwrap),
        key, objectVersion).let(S3Code::wrap)

    public fun fromInline(code: String): InlineCode =
        software.amazon.awscdk.services.synthetics.Code.fromInline(code).let(InlineCode::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.Code): Code =
        CdkObjectWrappers.wrap(cdkObject) as? Code ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: Code): software.amazon.awscdk.services.synthetics.Code = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.services.synthetics.Code
  }
}
