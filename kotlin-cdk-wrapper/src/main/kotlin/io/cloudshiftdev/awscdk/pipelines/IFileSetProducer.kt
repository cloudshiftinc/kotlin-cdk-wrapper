@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.common.CdkObject

public interface IFileSetProducer {
  public fun primaryOutput(): FileSet? = unwrap(this).getPrimaryOutput()?.let(FileSet::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.pipelines.IFileSetProducer,
  ) : CdkObject(cdkObject), IFileSetProducer {
    override fun primaryOutput(): FileSet? = unwrap(this).getPrimaryOutput()?.let(FileSet::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.IFileSetProducer):
        IFileSetProducer = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IFileSetProducer):
        software.amazon.awscdk.pipelines.IFileSetProducer = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.pipelines.IFileSetProducer
  }
}
