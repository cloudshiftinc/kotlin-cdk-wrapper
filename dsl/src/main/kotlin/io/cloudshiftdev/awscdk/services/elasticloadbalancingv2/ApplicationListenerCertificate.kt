package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ApplicationListenerCertificate internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerCertificate,
) : CloudshiftdevConstructsConstruct(cdkObject) {
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
      cdkBuilder.certificates(certificates.map(IListenerCertificate::unwrap))
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
      cdkBuilder.listener(listener.let(IApplicationListener::unwrap))
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
        wrapped.cdkObject
  }
}
