@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkObject

public interface IEventSource {
  public fun bind(arg0: IFunction)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.IEventSource,
  ) : CdkObject(cdkObject), IEventSource {
    override fun bind(arg0: IFunction) {
      unwrap(this).bind(arg0.let(IFunction::unwrap))
    }
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.IEventSource): IEventSource
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IEventSource): software.amazon.awscdk.services.lambda.IEventSource
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.lambda.IEventSource
  }
}
