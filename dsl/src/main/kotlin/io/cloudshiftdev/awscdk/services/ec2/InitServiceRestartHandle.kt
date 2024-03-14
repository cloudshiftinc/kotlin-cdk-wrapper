package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject

public open class InitServiceRestartHandle internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.InitServiceRestartHandle,
) : CdkObject(cdkObject) {
  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.InitServiceRestartHandle):
        InitServiceRestartHandle = InitServiceRestartHandle(cdkObject)

    internal fun unwrap(wrapped: InitServiceRestartHandle):
        software.amazon.awscdk.services.ec2.InitServiceRestartHandle = wrapped.cdkObject
  }
}
