@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * A Stack Synthesizer, obtained from `IReusableStackSynthesizer.`.
 *
 * Just a type alias with a very concrete contract.
 */
public interface IBoundStackSynthesizer : IStackSynthesizer {
  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.IBoundStackSynthesizer):
        IBoundStackSynthesizer = CdkObjectWrappers.wrap(cdkObject) as IBoundStackSynthesizer

    internal fun unwrap(wrapped: IBoundStackSynthesizer):
        software.amazon.awscdk.IBoundStackSynthesizer = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.IBoundStackSynthesizer
  }
}
