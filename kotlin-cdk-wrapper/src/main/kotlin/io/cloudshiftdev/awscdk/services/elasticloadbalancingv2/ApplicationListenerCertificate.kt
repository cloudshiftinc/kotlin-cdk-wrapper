@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Add certificates to a listener.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.*;
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
public open class ApplicationListenerCertificate(
  cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerCertificate,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ApplicationListenerCertificateProps,
  ) :
      this(software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerCertificate(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(ApplicationListenerCertificateProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ApplicationListenerCertificateProps.Builder.() -> Unit,
  ) : this(scope, id, ApplicationListenerCertificateProps(props)
  )

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.ApplicationListenerCertificate].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Certificates to attach.
     *
     * Duplicates are not allowed.
     *
     * Default: - One of 'certificates' and 'certificateArns' is required.
     *
     * @param certificates Certificates to attach. 
     */
    public fun certificates(certificates: List<IListenerCertificate>)

    /**
     * Certificates to attach.
     *
     * Duplicates are not allowed.
     *
     * Default: - One of 'certificates' and 'certificateArns' is required.
     *
     * @param certificates Certificates to attach. 
     */
    public fun certificates(vararg certificates: IListenerCertificate)

    /**
     * The listener to attach the rule to.
     *
     * @param listener The listener to attach the rule to. 
     */
    public fun listener(listener: IApplicationListener)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerCertificate.Builder
        =
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerCertificate.Builder.create(scope,
        id)

    /**
     * Certificates to attach.
     *
     * Duplicates are not allowed.
     *
     * Default: - One of 'certificates' and 'certificateArns' is required.
     *
     * @param certificates Certificates to attach. 
     */
    override fun certificates(certificates: List<IListenerCertificate>) {
      cdkBuilder.certificates(certificates.map(IListenerCertificate.Companion::unwrap))
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
    override fun certificates(vararg certificates: IListenerCertificate): Unit =
        certificates(certificates.toList())

    /**
     * The listener to attach the rule to.
     *
     * @param listener The listener to attach the rule to. 
     */
    override fun listener(listener: IApplicationListener) {
      cdkBuilder.listener(listener.let(IApplicationListener.Companion::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerCertificate =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ApplicationListenerCertificate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ApplicationListenerCertificate(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerCertificate):
        ApplicationListenerCertificate = ApplicationListenerCertificate(cdkObject)

    internal fun unwrap(wrapped: ApplicationListenerCertificate):
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerCertificate =
        wrapped.cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerCertificate
  }
}
