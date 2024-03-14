package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.CdkObject

public abstract class SnapStartConf internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.lambda.SnapStartConf,
) : CdkObject(cdkObject) {
  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.SnapStartConf,
  ) : SnapStartConf(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.SnapStartConf):
        SnapStartConf = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SnapStartConf):
        software.amazon.awscdk.services.lambda.SnapStartConf = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.lambda.SnapStartConf
  }
}