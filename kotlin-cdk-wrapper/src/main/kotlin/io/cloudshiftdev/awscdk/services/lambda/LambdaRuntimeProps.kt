@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface LambdaRuntimeProps {
  public fun bundlingDockerImage(): String? = unwrap(this).getBundlingDockerImage()

  public fun isVariable(): Boolean? = unwrap(this).getIsVariable()

  public fun supportsCodeGuruProfiling(): Boolean? = unwrap(this).getSupportsCodeGuruProfiling()

  public fun supportsInlineCode(): Boolean? = unwrap(this).getSupportsInlineCode()

  public fun supportsSnapStart(): Boolean? = unwrap(this).getSupportsSnapStart()

  @CdkDslMarker
  public interface Builder {
    public fun bundlingDockerImage(bundlingDockerImage: String)

    public fun isVariable(isVariable: Boolean)

    public fun supportsCodeGuruProfiling(supportsCodeGuruProfiling: Boolean)

    public fun supportsInlineCode(supportsInlineCode: Boolean)

    public fun supportsSnapStart(supportsSnapStart: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.LambdaRuntimeProps.Builder =
        software.amazon.awscdk.services.lambda.LambdaRuntimeProps.builder()

    override fun bundlingDockerImage(bundlingDockerImage: String) {
      cdkBuilder.bundlingDockerImage(bundlingDockerImage)
    }

    override fun isVariable(isVariable: Boolean) {
      cdkBuilder.isVariable(isVariable)
    }

    override fun supportsCodeGuruProfiling(supportsCodeGuruProfiling: Boolean) {
      cdkBuilder.supportsCodeGuruProfiling(supportsCodeGuruProfiling)
    }

    override fun supportsInlineCode(supportsInlineCode: Boolean) {
      cdkBuilder.supportsInlineCode(supportsInlineCode)
    }

    override fun supportsSnapStart(supportsSnapStart: Boolean) {
      cdkBuilder.supportsSnapStart(supportsSnapStart)
    }

    public fun build(): software.amazon.awscdk.services.lambda.LambdaRuntimeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.LambdaRuntimeProps,
  ) : CdkObject(cdkObject), LambdaRuntimeProps {
    override fun bundlingDockerImage(): String? = unwrap(this).getBundlingDockerImage()

    override fun isVariable(): Boolean? = unwrap(this).getIsVariable()

    override fun supportsCodeGuruProfiling(): Boolean? = unwrap(this).getSupportsCodeGuruProfiling()

    override fun supportsInlineCode(): Boolean? = unwrap(this).getSupportsInlineCode()

    override fun supportsSnapStart(): Boolean? = unwrap(this).getSupportsSnapStart()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LambdaRuntimeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.LambdaRuntimeProps):
        LambdaRuntimeProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LambdaRuntimeProps):
        software.amazon.awscdk.services.lambda.LambdaRuntimeProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.lambda.LambdaRuntimeProps
  }
}
