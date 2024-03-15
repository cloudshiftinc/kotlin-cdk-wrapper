@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkObject

public abstract class MutualTlsValidationTrust internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appmesh.MutualTlsValidationTrust,
) : TlsValidationTrust(cdkObject) {
  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.MutualTlsValidationTrust,
  ) : MutualTlsValidationTrust(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.MutualTlsValidationTrust):
        MutualTlsValidationTrust = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MutualTlsValidationTrust):
        software.amazon.awscdk.services.appmesh.MutualTlsValidationTrust = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.MutualTlsValidationTrust
  }
}
