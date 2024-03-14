package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import kotlin.String

public interface IListenerCertificate {
  public fun certificateArn(): String

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.IListenerCertificate,
  ) : IListenerCertificate {
    override fun certificateArn(): String = unwrap(this).getCertificateArn()
  }

  public companion object {
    init {

    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.IListenerCertificate):
        IListenerCertificate = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IListenerCertificate):
        software.amazon.awscdk.services.elasticloadbalancingv2.IListenerCertificate = (wrapped as
        Wrapper).cdkObject
  }
}
