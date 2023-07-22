@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.lambda.Runtime
import software.amazon.awscdk.services.lambda.RuntimeFamily

/**
 * Lambda function runtime environment.
 *
 * If you need to use a runtime name that doesn't exist as a static member, you
 * can instantiate a `Runtime` object, e.g: `new Runtime('nodejs99.99')`.
 *
 * Example:
 *
 * ```
 * import software.amazon.awscdk.services.signer.*;
 * SigningProfile signingProfile = SigningProfile.Builder.create(this, "SigningProfile")
 * .platform(Platform.AWS_LAMBDA_SHA384_ECDSA)
 * .build();
 * CodeSigningConfig codeSigningConfig = CodeSigningConfig.Builder.create(this, "CodeSigningConfig")
 * .signingProfiles(List.of(signingProfile))
 * .build();
 * Function.Builder.create(this, "Function")
 * .codeSigningConfig(codeSigningConfig)
 * .runtime(Runtime.NODEJS_18_X)
 * .handler("index.handler")
 * .code(Code.fromAsset(join(__dirname, "lambda-handler")))
 * .build();
 * ```
 */
@CdkDslMarker
public class RuntimeDsl(
  name: String,
  family: RuntimeFamily,
) {
  private val cdkBuilder: Runtime.Builder = Runtime.Builder.create(name, family)

  /**
   * The Docker image name to be used for bundling in this runtime.
   *
   * Default: - the latest docker image "amazon/public.ecr.aws/sam/build-<runtime>" from
   * https://gallery.ecr.aws
   *
   * @param bundlingDockerImage The Docker image name to be used for bundling in this runtime. 
   */
  public fun bundlingDockerImage(bundlingDockerImage: String) {
    cdkBuilder.bundlingDockerImage(bundlingDockerImage)
  }

  /**
   * Whether this runtime is integrated with and supported for profiling using Amazon CodeGuru
   * Profiler.
   *
   * Default: false
   *
   * @param supportsCodeGuruProfiling Whether this runtime is integrated with and supported for
   * profiling using Amazon CodeGuru Profiler. 
   */
  public fun supportsCodeGuruProfiling(supportsCodeGuruProfiling: Boolean) {
    cdkBuilder.supportsCodeGuruProfiling(supportsCodeGuruProfiling)
  }

  /**
   * Whether the `ZipFile` (aka inline code) property can be used with this runtime.
   *
   * Default: false
   *
   * @param supportsInlineCode Whether the `ZipFile` (aka inline code) property can be used with
   * this runtime. 
   */
  public fun supportsInlineCode(supportsInlineCode: Boolean) {
    cdkBuilder.supportsInlineCode(supportsInlineCode)
  }

  public fun build(): Runtime = cdkBuilder.build()
}
