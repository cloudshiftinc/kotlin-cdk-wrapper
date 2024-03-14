package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnOutput
import kotlin.Boolean
import kotlin.String

public open class StackOutputReference internal constructor(
  internal override val cdkObject: software.amazon.awscdk.pipelines.StackOutputReference,
) : CdkObject(cdkObject) {
  /**
   * Whether or not this stack output is being produced by the given Stack deployment.
   *
   * @param stack 
   */
  public open fun isProducedBy(stack: StackDeployment): Boolean =
      unwrap(this).isProducedBy(stack.let(StackDeployment::unwrap))

  /**
   * Output name of the producing stack.
   */
  public open fun outputName(): String = unwrap(this).getOutputName()

  /**
   * A human-readable description of the producing stack.
   */
  public open fun stackDescription(): String = unwrap(this).getStackDescription()

  public companion object {
    public fun fromCfnOutput(output: CfnOutput): StackOutputReference =
        software.amazon.awscdk.pipelines.StackOutputReference.fromCfnOutput(output.let(CfnOutput::unwrap)).let(StackOutputReference::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.StackOutputReference):
        StackOutputReference = StackOutputReference(cdkObject)

    internal fun unwrap(wrapped: StackOutputReference):
        software.amazon.awscdk.pipelines.StackOutputReference = wrapped.cdkObject
  }
}
