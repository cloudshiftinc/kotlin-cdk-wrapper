package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public open class StackOutputsMap internal constructor(
  internal override val cdkObject: software.amazon.awscdk.pipelines.StackOutputsMap,
) : CdkObject(cdkObject) {
  /**
   * Return the matching variable reference string for a StackOutputReference.
   *
   * @param x 
   */
  public open fun toCodePipeline(x: StackOutputReference): String =
      unwrap(this).toCodePipeline(x.let(StackOutputReference::unwrap))

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.StackOutputsMap): StackOutputsMap
        = StackOutputsMap(cdkObject)

    internal fun unwrap(wrapped: StackOutputsMap): software.amazon.awscdk.pipelines.StackOutputsMap
        = wrapped.cdkObject
  }
}
