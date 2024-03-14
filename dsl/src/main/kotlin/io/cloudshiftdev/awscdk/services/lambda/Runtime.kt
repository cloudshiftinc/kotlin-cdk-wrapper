package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.DockerImage
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public open class Runtime internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.lambda.Runtime,
) : CdkObject(cdkObject) {
  /**
   * The bundling Docker image for this runtime.
   */
  public open fun bundlingImage(): DockerImage =
      unwrap(this).getBundlingImage().let(DockerImage::wrap)

  /**
   * The runtime family.
   */
  public open fun family(): RuntimeFamily? = unwrap(this).getFamily()?.let(RuntimeFamily::wrap)

  /**
   * Enabled for runtime enums that always target the latest available.
   */
  public open fun isVariable(): Boolean = unwrap(this).getIsVariable()

  /**
   * The name of this runtime, as expected by the Lambda resource.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * @param other 
   */
  public open fun runtimeEquals(other: Runtime): Boolean =
      unwrap(this).runtimeEquals(other.let(Runtime::unwrap))

  /**
   * Whether this runtime is integrated with and supported for profiling using Amazon CodeGuru
   * Profiler.
   */
  public open fun supportsCodeGuruProfiling(): Boolean = unwrap(this).getSupportsCodeGuruProfiling()

  /**
   * Whether the `ZipFile` (aka inline code) property can be used with this runtime.
   */
  public open fun supportsInlineCode(): Boolean = unwrap(this).getSupportsInlineCode()

  /**
   * Whether this runtime supports snapstart.
   */
  public open fun supportsSnapStart(): Boolean = unwrap(this).getSupportsSnapStart()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lambda.Runtime].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Docker image name to be used for bundling in this runtime.
     *
     * Default: - the latest docker image "amazon/public.ecr.aws/sam/build-<runtime>" from
     * https://gallery.ecr.aws
     *
     * @param bundlingDockerImage The Docker image name to be used for bundling in this runtime. 
     */
    public fun bundlingDockerImage(bundlingDockerImage: String)

    /**
     * Whether the runtime enum is meant to change over time, IE NODEJS_LATEST.
     *
     * Default: false
     *
     * @param isVariable Whether the runtime enum is meant to change over time, IE NODEJS_LATEST. 
     */
    public fun isVariable(isVariable: Boolean)

    /**
     * Whether this runtime is integrated with and supported for profiling using Amazon CodeGuru
     * Profiler.
     *
     * Default: false
     *
     * @param supportsCodeGuruProfiling Whether this runtime is integrated with and supported for
     * profiling using Amazon CodeGuru Profiler. 
     */
    public fun supportsCodeGuruProfiling(supportsCodeGuruProfiling: Boolean)

    /**
     * Whether the `ZipFile` (aka inline code) property can be used with this runtime.
     *
     * Default: false
     *
     * @param supportsInlineCode Whether the `ZipFile` (aka inline code) property can be used with
     * this runtime. 
     */
    public fun supportsInlineCode(supportsInlineCode: Boolean)

    /**
     * Whether this runtime supports SnapStart.
     *
     * Default: false
     *
     * @param supportsSnapStart Whether this runtime supports SnapStart. 
     */
    public fun supportsSnapStart(supportsSnapStart: Boolean)
  }

  private class BuilderImpl(
    name: String,
    family: software.amazon.awscdk.services.lambda.RuntimeFamily,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.Runtime.Builder =
        software.amazon.awscdk.services.lambda.Runtime.Builder.create(name, family)

    /**
     * The Docker image name to be used for bundling in this runtime.
     *
     * Default: - the latest docker image "amazon/public.ecr.aws/sam/build-<runtime>" from
     * https://gallery.ecr.aws
     *
     * @param bundlingDockerImage The Docker image name to be used for bundling in this runtime. 
     */
    override fun bundlingDockerImage(bundlingDockerImage: String) {
      cdkBuilder.bundlingDockerImage(bundlingDockerImage)
    }

    /**
     * Whether the runtime enum is meant to change over time, IE NODEJS_LATEST.
     *
     * Default: false
     *
     * @param isVariable Whether the runtime enum is meant to change over time, IE NODEJS_LATEST. 
     */
    override fun isVariable(isVariable: Boolean) {
      cdkBuilder.isVariable(isVariable)
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
    override fun supportsCodeGuruProfiling(supportsCodeGuruProfiling: Boolean) {
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
    override fun supportsInlineCode(supportsInlineCode: Boolean) {
      cdkBuilder.supportsInlineCode(supportsInlineCode)
    }

    /**
     * Whether this runtime supports SnapStart.
     *
     * Default: false
     *
     * @param supportsSnapStart Whether this runtime supports SnapStart. 
     */
    override fun supportsSnapStart(supportsSnapStart: Boolean) {
      cdkBuilder.supportsSnapStart(supportsSnapStart)
    }

    public fun build(): software.amazon.awscdk.services.lambda.Runtime = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      name: String,
      family: RuntimeFamily,
      block: Builder.() -> Unit = {},
    ): Runtime {
      val builderImpl = BuilderImpl(name, RuntimeFamily.unwrap(family))
      return Runtime(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.Runtime): Runtime =
        Runtime(cdkObject)

    internal fun unwrap(wrapped: Runtime): software.amazon.awscdk.services.lambda.Runtime =
        wrapped.cdkObject
  }
}
