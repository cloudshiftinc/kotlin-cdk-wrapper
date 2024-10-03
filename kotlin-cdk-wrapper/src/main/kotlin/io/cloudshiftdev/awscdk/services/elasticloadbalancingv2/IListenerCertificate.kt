@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * A certificate source for an ELBv2 listener.
 */
public interface IListenerCertificate {
  /**
   * The ARN of the certificate to use.
   */
  public fun certificateArn(): String

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.IListenerCertificate,
  ) : CdkObject(cdkObject),
      IListenerCertificate {
    /**
     * The ARN of the certificate to use.
     */
    override fun certificateArn(): String = unwrap(this).getCertificateArn()
  }

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.IListenerCertificate):
        IListenerCertificate = CdkObjectWrappers.wrap(cdkObject) as? IListenerCertificate ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IListenerCertificate):
        software.amazon.awscdk.services.elasticloadbalancingv2.IListenerCertificate = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.IListenerCertificate
  }
}
