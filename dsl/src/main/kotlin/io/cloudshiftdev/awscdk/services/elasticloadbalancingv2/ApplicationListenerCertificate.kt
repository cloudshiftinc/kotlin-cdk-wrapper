package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ApplicationListenerCertificate internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerCertificate,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public interface Builder {
    public fun certificates(certificates: List<IListenerCertificate>) {
    }

    public fun listener(listener: IApplicationListener) {
    }
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

    public override fun certificates(certificates: List<IListenerCertificate>) {
      cdkBuilder.certificates(certificates.map(IListenerCertificate::unwrap))
    }

    public override fun listener(listener: IApplicationListener) {
      cdkBuilder.listener(listener.let(IApplicationListener::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerCertificate =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

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
