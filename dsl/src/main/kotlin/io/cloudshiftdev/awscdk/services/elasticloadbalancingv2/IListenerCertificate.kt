package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public interface IListenerCertificate {
  /**
   * The ARN of the certificate to use.
   */
  public fun certificateArn(): String

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.IListenerCertificate,
  ) : CdkObject(cdkObject), IListenerCertificate {
    /**
     * The ARN of the certificate to use.
     */
    override fun certificateArn(): String = unwrap(this).getCertificateArn()
  }

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.IListenerCertificate):
        IListenerCertificate = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IListenerCertificate):
        software.amazon.awscdk.services.elasticloadbalancingv2.IListenerCertificate = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.IListenerCertificate
  }
}
