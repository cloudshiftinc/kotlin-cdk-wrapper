@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for adding a set of certificates to a listener.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.*;
 * ApplicationListener applicationListener;
 * ListenerCertificate listenerCertificate;
 * ApplicationListenerCertificateProps applicationListenerCertificateProps =
 * ApplicationListenerCertificateProps.builder()
 * .listener(applicationListener)
 * // the properties below are optional
 * .certificates(List.of(listenerCertificate))
 * .build();
 * ```
 */
public interface ApplicationListenerCertificateProps {
  /**
   * Certificates to attach.
   *
   * Duplicates are not allowed.
   *
   * Default: - One of 'certificates' and 'certificateArns' is required.
   */
  public fun certificates(): List<IListenerCertificate> =
      unwrap(this).getCertificates()?.map(IListenerCertificate::wrap) ?: emptyList()

  /**
   * The listener to attach the rule to.
   */
  public fun listener(): IApplicationListener

  /**
   * A builder for [ApplicationListenerCertificateProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param certificates Certificates to attach.
     * Duplicates are not allowed.
     */
    public fun certificates(certificates: List<IListenerCertificate>)

    /**
     * @param certificates Certificates to attach.
     * Duplicates are not allowed.
     */
    public fun certificates(vararg certificates: IListenerCertificate)

    /**
     * @param listener The listener to attach the rule to. 
     */
    public fun listener(listener: IApplicationListener)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerCertificateProps.Builder
        =
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerCertificateProps.builder()

    /**
     * @param certificates Certificates to attach.
     * Duplicates are not allowed.
     */
    override fun certificates(certificates: List<IListenerCertificate>) {
      cdkBuilder.certificates(certificates.map(IListenerCertificate.Companion::unwrap))
    }

    /**
     * @param certificates Certificates to attach.
     * Duplicates are not allowed.
     */
    override fun certificates(vararg certificates: IListenerCertificate): Unit =
        certificates(certificates.toList())

    /**
     * @param listener The listener to attach the rule to. 
     */
    override fun listener(listener: IApplicationListener) {
      cdkBuilder.listener(listener.let(IApplicationListener.Companion::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerCertificateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerCertificateProps,
  ) : CdkObject(cdkObject), ApplicationListenerCertificateProps {
    /**
     * Certificates to attach.
     *
     * Duplicates are not allowed.
     *
     * Default: - One of 'certificates' and 'certificateArns' is required.
     */
    override fun certificates(): List<IListenerCertificate> =
        unwrap(this).getCertificates()?.map(IListenerCertificate::wrap) ?: emptyList()

    /**
     * The listener to attach the rule to.
     */
    override fun listener(): IApplicationListener =
        unwrap(this).getListener().let(IApplicationListener::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        ApplicationListenerCertificateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerCertificateProps):
        ApplicationListenerCertificateProps = CdkObjectWrappers.wrap(cdkObject) as?
        ApplicationListenerCertificateProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApplicationListenerCertificateProps):
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerCertificateProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerCertificateProps
  }
}
