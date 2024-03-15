@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.certificatemanager.ICertificate
import kotlin.String

public open class ListenerCertificate internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCertificate,
) : CdkObject(cdkObject), IListenerCertificate {
  public override fun certificateArn(): String = unwrap(this).getCertificateArn()

  public companion object {
    public fun fromArn(certificateArn: String): ListenerCertificate =
        software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCertificate.fromArn(certificateArn).let(ListenerCertificate::wrap)

    public fun fromCertificateManager(acmCertificate: ICertificate): ListenerCertificate =
        software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCertificate.fromCertificateManager(acmCertificate.let(ICertificate::unwrap)).let(ListenerCertificate::wrap)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCertificate):
        ListenerCertificate = ListenerCertificate(cdkObject)

    internal fun unwrap(wrapped: ListenerCertificate):
        software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCertificate =
        wrapped.cdkObject
  }
}