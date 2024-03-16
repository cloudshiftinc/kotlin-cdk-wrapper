@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * Interface for Stack Synthesizers that can be used for more than one stack.
 *
 * Regular `IStackSynthesizer` instances can only be bound to a Stack once.
 * `IReusableStackSynthesizer` instances.
 *
 * For backwards compatibility reasons, this class inherits from
 * `IStackSynthesizer`, but if an object implements `IReusableStackSynthesizer`,
 * no other methods than `reusableBind()` will be called.
 */
public interface IReusableStackSynthesizer : IStackSynthesizer {
  /**
   * Produce a bound Stack Synthesizer for the given stack.
   *
   * This method may be called more than once on the same object.
   *
   * @param stack 
   */
  public fun reusableBind(stack: Stack): IBoundStackSynthesizer

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.IReusableStackSynthesizer):
        IReusableStackSynthesizer = CdkObjectWrappers.wrap(cdkObject) as IReusableStackSynthesizer

    internal fun unwrap(wrapped: IReusableStackSynthesizer):
        software.amazon.awscdk.IReusableStackSynthesizer = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.IReusableStackSynthesizer
  }
}
