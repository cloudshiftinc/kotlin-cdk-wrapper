@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkObject

public interface IEventSourceDlq {
  public fun bind(arg0: IEventSourceMapping, arg1: IFunction): DlqDestinationConfig

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.IEventSourceDlq,
  ) : CdkObject(cdkObject), IEventSourceDlq {
    override fun bind(arg0: IEventSourceMapping, arg1: IFunction): DlqDestinationConfig =
        unwrap(this).bind(arg0.let(IEventSourceMapping::unwrap),
        arg1.let(IFunction::unwrap)).let(DlqDestinationConfig::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.IEventSourceDlq):
        IEventSourceDlq = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IEventSourceDlq):
        software.amazon.awscdk.services.lambda.IEventSourceDlq = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.lambda.IEventSourceDlq
  }
}
