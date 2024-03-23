@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.CfnOutput
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String

/**
 * A Reference to a Stack Output.
 *
 * Example:
 *
 * ```
 * public class MyLambdaStep extends Step implements ICodePipelineActionFactory {
 * private StackOutputReference stackOutputReference;
 * public MyLambdaStep(Function fn, CfnOutput stackOutput) {
 * super("MyLambdaStep");
 * this.stackOutputReference = StackOutputReference.fromCfnOutput(stackOutput);
 * }
 * public CodePipelineActionFactoryResult produceAction(IStage stage, ProduceActionOptions options)
 * {
 * stage.addAction(LambdaInvokeAction.Builder.create()
 * .actionName(options.getActionName())
 * .runOrder(options.getRunOrder())
 * // Map the reference to the variable name the CDK has generated for you.
 * .userParameters(Map.of("stackOutput",
 * options.stackOutputsMap.toCodePipeline(this.stackOutputReference)))
 * .lambda(this.fn)
 * .build());
 * return CodePipelineActionFactoryResult.builder().runOrdersConsumed(1).build();
 * }public get consumedStackOutputs(): pipelines.StackOutputReference[] {
 * return [this.stackOutputReference];
 * }
 * }
 * ```
 */
public open class StackOutputReference(
  cdkObject: software.amazon.awscdk.pipelines.StackOutputReference,
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
        software.amazon.awscdk.pipelines.StackOutputReference = wrapped.cdkObject as
        software.amazon.awscdk.pipelines.StackOutputReference
  }
}
