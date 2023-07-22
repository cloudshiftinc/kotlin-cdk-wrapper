@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerCertificate
import software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationListener
import software.amazon.awscdk.services.elasticloadbalancingv2.IListenerCertificate
import software.constructs.Construct

/**
 * Add certificates to a listener.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * ApplicationListener applicationListener;
 * ListenerCertificate listenerCertificate;
 * ApplicationListenerCertificate applicationListenerCertificate =
 * ApplicationListenerCertificate.Builder.create(this, "MyApplicationListenerCertificate")
 * .listener(applicationListener)
 * // the properties below are optional
 * .certificates(List.of(listenerCertificate))
 * .build();
 * ```
 */
@CdkDslMarker
public class ApplicationListenerCertificateDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: ApplicationListenerCertificate.Builder =
      ApplicationListenerCertificate.Builder.create(scope, id)

  private val _certificates: MutableList<IListenerCertificate> = mutableListOf()

  /**
   * Certificates to attach.
   *
   * Duplicates are not allowed.
   *
   * Default: - One of 'certificates' and 'certificateArns' is required.
   *
   * @param certificates Certificates to attach. 
   */
  public fun certificates(vararg certificates: IListenerCertificate) {
    _certificates.addAll(listOf(*certificates))
  }

  /**
   * Certificates to attach.
   *
   * Duplicates are not allowed.
   *
   * Default: - One of 'certificates' and 'certificateArns' is required.
   *
   * @param certificates Certificates to attach. 
   */
  public fun certificates(certificates: Collection<IListenerCertificate>) {
    _certificates.addAll(certificates)
  }

  /**
   * The listener to attach the rule to.
   *
   * @param listener The listener to attach the rule to. 
   */
  public fun listener(listener: IApplicationListener) {
    cdkBuilder.listener(listener)
  }

  public fun build(): ApplicationListenerCertificate {
    if(_certificates.isNotEmpty()) cdkBuilder.certificates(_certificates)
    return cdkBuilder.build()
  }
}
