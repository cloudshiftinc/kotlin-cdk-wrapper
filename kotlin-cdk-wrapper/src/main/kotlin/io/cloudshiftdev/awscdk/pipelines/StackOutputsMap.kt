@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * Translate stack outputs to Codepipline variable references.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.pipelines.*;
 * PipelineBase pipelineBase;
 * StackOutputsMap stackOutputsMap = new StackOutputsMap(pipelineBase);
 * ```
 */
public open class StackOutputsMap(
  cdkObject: software.amazon.awscdk.pipelines.StackOutputsMap,
) : CdkObject(cdkObject) {
  public constructor(pipeline: PipelineBase) :
      this(software.amazon.awscdk.pipelines.StackOutputsMap(pipeline.let(PipelineBase.Companion::unwrap))
  )

  /**
   * Return the matching variable reference string for a StackOutputReference.
   *
   * @param x 
   */
  public open fun toCodePipeline(x: StackOutputReference): String =
      unwrap(this).toCodePipeline(x.let(StackOutputReference.Companion::unwrap))

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.StackOutputsMap): StackOutputsMap
        = StackOutputsMap(cdkObject)

    internal fun unwrap(wrapped: StackOutputsMap): software.amazon.awscdk.pipelines.StackOutputsMap
        = wrapped.cdkObject as software.amazon.awscdk.pipelines.StackOutputsMap
  }
}
