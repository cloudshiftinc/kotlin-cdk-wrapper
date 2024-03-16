@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * LambdaRuntimeProps lambdaRuntimeProps = LambdaRuntimeProps.builder()
 * .bundlingDockerImage("bundlingDockerImage")
 * .isVariable(false)
 * .supportsCodeGuruProfiling(false)
 * .supportsInlineCode(false)
 * .supportsSnapStart(false)
 * .build();
 * ```
 */
public interface LambdaRuntimeProps {
  /**
   * The Docker image name to be used for bundling in this runtime.
   *
   * Default: - the latest docker image "amazon/public.ecr.aws/sam/build-<runtime>" from
   * https://gallery.ecr.aws
   */
  public fun bundlingDockerImage(): String? = unwrap(this).getBundlingDockerImage()

  /**
   * Whether the runtime enum is meant to change over time, IE NODEJS_LATEST.
   *
   * Default: false
   */
  public fun isVariable(): Boolean? = unwrap(this).getIsVariable()

  /**
   * Whether this runtime is integrated with and supported for profiling using Amazon CodeGuru
   * Profiler.
   *
   * Default: false
   */
  public fun supportsCodeGuruProfiling(): Boolean? = unwrap(this).getSupportsCodeGuruProfiling()

  /**
   * Whether the `ZipFile` (aka inline code) property can be used with this runtime.
   *
   * Default: false
   */
  public fun supportsInlineCode(): Boolean? = unwrap(this).getSupportsInlineCode()

  /**
   * Whether this runtime supports SnapStart.
   *
   * Default: false
   */
  public fun supportsSnapStart(): Boolean? = unwrap(this).getSupportsSnapStart()

  /**
   * A builder for [LambdaRuntimeProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bundlingDockerImage The Docker image name to be used for bundling in this runtime.
     */
    public fun bundlingDockerImage(bundlingDockerImage: String)

    /**
     * @param isVariable Whether the runtime enum is meant to change over time, IE NODEJS_LATEST.
     */
    public fun isVariable(isVariable: Boolean)

    /**
     * @param supportsCodeGuruProfiling Whether this runtime is integrated with and supported for
     * profiling using Amazon CodeGuru Profiler.
     */
    public fun supportsCodeGuruProfiling(supportsCodeGuruProfiling: Boolean)

    /**
     * @param supportsInlineCode Whether the `ZipFile` (aka inline code) property can be used with
     * this runtime.
     */
    public fun supportsInlineCode(supportsInlineCode: Boolean)

    /**
     * @param supportsSnapStart Whether this runtime supports SnapStart.
     */
    public fun supportsSnapStart(supportsSnapStart: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.LambdaRuntimeProps.Builder =
        software.amazon.awscdk.services.lambda.LambdaRuntimeProps.builder()

    /**
     * @param bundlingDockerImage The Docker image name to be used for bundling in this runtime.
     */
    override fun bundlingDockerImage(bundlingDockerImage: String) {
      cdkBuilder.bundlingDockerImage(bundlingDockerImage)
    }

    /**
     * @param isVariable Whether the runtime enum is meant to change over time, IE NODEJS_LATEST.
     */
    override fun isVariable(isVariable: Boolean) {
      cdkBuilder.isVariable(isVariable)
    }

    /**
     * @param supportsCodeGuruProfiling Whether this runtime is integrated with and supported for
     * profiling using Amazon CodeGuru Profiler.
     */
    override fun supportsCodeGuruProfiling(supportsCodeGuruProfiling: Boolean) {
      cdkBuilder.supportsCodeGuruProfiling(supportsCodeGuruProfiling)
    }

    /**
     * @param supportsInlineCode Whether the `ZipFile` (aka inline code) property can be used with
     * this runtime.
     */
    override fun supportsInlineCode(supportsInlineCode: Boolean) {
      cdkBuilder.supportsInlineCode(supportsInlineCode)
    }

    /**
     * @param supportsSnapStart Whether this runtime supports SnapStart.
     */
    override fun supportsSnapStart(supportsSnapStart: Boolean) {
      cdkBuilder.supportsSnapStart(supportsSnapStart)
    }

    public fun build(): software.amazon.awscdk.services.lambda.LambdaRuntimeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.LambdaRuntimeProps,
  ) : CdkObject(cdkObject), LambdaRuntimeProps {
    /**
     * The Docker image name to be used for bundling in this runtime.
     *
     * Default: - the latest docker image "amazon/public.ecr.aws/sam/build-<runtime>" from
     * https://gallery.ecr.aws
     */
    override fun bundlingDockerImage(): String? = unwrap(this).getBundlingDockerImage()

    /**
     * Whether the runtime enum is meant to change over time, IE NODEJS_LATEST.
     *
     * Default: false
     */
    override fun isVariable(): Boolean? = unwrap(this).getIsVariable()

    /**
     * Whether this runtime is integrated with and supported for profiling using Amazon CodeGuru
     * Profiler.
     *
     * Default: false
     */
    override fun supportsCodeGuruProfiling(): Boolean? = unwrap(this).getSupportsCodeGuruProfiling()

    /**
     * Whether the `ZipFile` (aka inline code) property can be used with this runtime.
     *
     * Default: false
     */
    override fun supportsInlineCode(): Boolean? = unwrap(this).getSupportsInlineCode()

    /**
     * Whether this runtime supports SnapStart.
     *
     * Default: false
     */
    override fun supportsSnapStart(): Boolean? = unwrap(this).getSupportsSnapStart()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LambdaRuntimeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.LambdaRuntimeProps):
        LambdaRuntimeProps = CdkObjectWrappers.wrap(cdkObject) as LambdaRuntimeProps

    internal fun unwrap(wrapped: LambdaRuntimeProps):
        software.amazon.awscdk.services.lambda.LambdaRuntimeProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.lambda.LambdaRuntimeProps
  }
}
