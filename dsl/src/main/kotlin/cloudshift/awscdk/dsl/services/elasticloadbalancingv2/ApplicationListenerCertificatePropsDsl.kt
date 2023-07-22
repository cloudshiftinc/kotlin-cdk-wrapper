@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerCertificateProps
import software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationListener
import software.amazon.awscdk.services.elasticloadbalancingv2.IListenerCertificate

/**
 * Properties for adding a set of certificates to a listener.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
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
@CdkDslMarker
public class ApplicationListenerCertificatePropsDsl {
  private val cdkBuilder: ApplicationListenerCertificateProps.Builder =
      ApplicationListenerCertificateProps.builder()

  private val _certificates: MutableList<IListenerCertificate> = mutableListOf()

  /**
   * @param certificates Certificates to attach.
   * Duplicates are not allowed.
   */
  public fun certificates(vararg certificates: IListenerCertificate) {
    _certificates.addAll(listOf(*certificates))
  }

  /**
   * @param certificates Certificates to attach.
   * Duplicates are not allowed.
   */
  public fun certificates(certificates: Collection<IListenerCertificate>) {
    _certificates.addAll(certificates)
  }

  /**
   * @param listener The listener to attach the rule to. 
   */
  public fun listener(listener: IApplicationListener) {
    cdkBuilder.listener(listener)
  }

  public fun build(): ApplicationListenerCertificateProps {
    if(_certificates.isNotEmpty()) cdkBuilder.certificates(_certificates)
    return cdkBuilder.build()
  }
}
