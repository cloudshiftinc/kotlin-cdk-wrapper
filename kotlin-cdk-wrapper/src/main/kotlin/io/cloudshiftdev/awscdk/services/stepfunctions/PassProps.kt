@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface PassProps {
  public fun comment(): String? = unwrap(this).getComment()

  public fun inputPath(): String? = unwrap(this).getInputPath()

  public fun outputPath(): String? = unwrap(this).getOutputPath()

  public fun parameters(): Map<String, Any> = unwrap(this).getParameters() ?: emptyMap()

  public fun result(): Result? = unwrap(this).getResult()?.let(Result::wrap)

  public fun resultPath(): String? = unwrap(this).getResultPath()

  public fun stateName(): String? = unwrap(this).getStateName()

  @CdkDslMarker
  public interface Builder {
    public fun comment(comment: String)

    public fun inputPath(inputPath: String)

    public fun outputPath(outputPath: String)

    public fun parameters(parameters: Map<String, Any>)

    public fun result(result: Result)

    public fun resultPath(resultPath: String)

    public fun stateName(stateName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.PassProps.Builder =
        software.amazon.awscdk.services.stepfunctions.PassProps.builder()

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun inputPath(inputPath: String) {
      cdkBuilder.inputPath(inputPath)
    }

    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

    override fun parameters(parameters: Map<String, Any>) {
      cdkBuilder.parameters(parameters)
    }

    override fun result(result: Result) {
      cdkBuilder.result(result.let(Result::unwrap))
    }

    override fun resultPath(resultPath: String) {
      cdkBuilder.resultPath(resultPath)
    }

    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.PassProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.PassProps,
  ) : CdkObject(cdkObject), PassProps {
    override fun comment(): String? = unwrap(this).getComment()

    override fun inputPath(): String? = unwrap(this).getInputPath()

    override fun outputPath(): String? = unwrap(this).getOutputPath()

    override fun parameters(): Map<String, Any> = unwrap(this).getParameters() ?: emptyMap()

    override fun result(): Result? = unwrap(this).getResult()?.let(Result::wrap)

    override fun resultPath(): String? = unwrap(this).getResultPath()

    override fun stateName(): String? = unwrap(this).getStateName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PassProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.PassProps): PassProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: PassProps): software.amazon.awscdk.services.stepfunctions.PassProps
        = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.PassProps
  }
}
