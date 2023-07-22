@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.lambda.LambdaRuntimeProps

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * LambdaRuntimeProps lambdaRuntimeProps = LambdaRuntimeProps.builder()
 * .bundlingDockerImage("bundlingDockerImage")
 * .supportsCodeGuruProfiling(false)
 * .supportsInlineCode(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class LambdaRuntimePropsDsl {
  private val cdkBuilder: LambdaRuntimeProps.Builder = LambdaRuntimeProps.builder()

  /**
   * @param bundlingDockerImage The Docker image name to be used for bundling in this runtime.
   */
  public fun bundlingDockerImage(bundlingDockerImage: String) {
    cdkBuilder.bundlingDockerImage(bundlingDockerImage)
  }

  /**
   * @param supportsCodeGuruProfiling Whether this runtime is integrated with and supported for
   * profiling using Amazon CodeGuru Profiler.
   */
  public fun supportsCodeGuruProfiling(supportsCodeGuruProfiling: Boolean) {
    cdkBuilder.supportsCodeGuruProfiling(supportsCodeGuruProfiling)
  }

  /**
   * @param supportsInlineCode Whether the `ZipFile` (aka inline code) property can be used with
   * this runtime.
   */
  public fun supportsInlineCode(supportsInlineCode: Boolean) {
    cdkBuilder.supportsInlineCode(supportsInlineCode)
  }

  public fun build(): LambdaRuntimeProps = cdkBuilder.build()
}
