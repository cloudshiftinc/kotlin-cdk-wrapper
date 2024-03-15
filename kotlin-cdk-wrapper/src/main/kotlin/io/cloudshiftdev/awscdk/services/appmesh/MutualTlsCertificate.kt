@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkObject

public abstract class MutualTlsCertificate internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appmesh.MutualTlsCertificate,
) : TlsCertificate(cdkObject) {
  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.MutualTlsCertificate,
  ) : MutualTlsCertificate(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.MutualTlsCertificate):
        MutualTlsCertificate = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MutualTlsCertificate):
        software.amazon.awscdk.services.appmesh.MutualTlsCertificate = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.MutualTlsCertificate
  }
}
