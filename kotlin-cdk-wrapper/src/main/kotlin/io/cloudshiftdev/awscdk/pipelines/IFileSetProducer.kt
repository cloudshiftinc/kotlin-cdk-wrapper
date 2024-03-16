@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * Any class that produces, or is itself, a `FileSet`.
 *
 * Steps implicitly produce a primary FileSet as an output.
 */
public interface IFileSetProducer {
  /**
   * The `FileSet` produced by this file set producer.
   *
   * Default: - This producer doesn't produce any file set
   */
  public fun primaryOutput(): FileSet? = unwrap(this).getPrimaryOutput()?.let(FileSet::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.IFileSetProducer):
        IFileSetProducer = CdkObjectWrappers.wrap(cdkObject) as IFileSetProducer

    internal fun unwrap(wrapped: IFileSetProducer):
        software.amazon.awscdk.pipelines.IFileSetProducer = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.pipelines.IFileSetProducer
  }
}
