@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * Interface representing a single processor in a CloudWatch Logs transformer.
 *
 * A log transformer is a series of processors, where each processor applies one type of
 * transformation
 * to the log events. The processors work one after another, in the order that they are listed, like
 * a pipeline.
 */
public interface IProcessor {
  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.IProcessor,
  ) : CdkObject(cdkObject),
      IProcessor

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.IProcessor): IProcessor =
        CdkObjectWrappers.wrap(cdkObject) as? IProcessor ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IProcessor): software.amazon.awscdk.services.logs.IProcessor =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.logs.IProcessor
  }
}
