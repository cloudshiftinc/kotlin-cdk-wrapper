package io.cloudshiftdev.awscdk.services.certificatemanager

import io.cloudshiftdev.awscdk.services.route53.IHostedZone
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface CertificationValidationProps {
  public fun hostedZone(): IHostedZone? = unwrap(this).getHostedZone()?.let(IHostedZone::wrap)

  public fun hostedZones(): Map<String, IHostedZone> = unwrap(this).getHostedZones()?.mapValues {
      IHostedZone.wrap(it.value)} ?: emptyMap()

  public fun method(): ValidationMethod? = unwrap(this).getMethod()?.let(ValidationMethod::wrap)

  public fun validationDomains(): Map<String, String> = unwrap(this).getValidationDomains() ?:
      emptyMap()

  public interface Builder {
    public fun hostedZone(hostedZone: IHostedZone) {
    }

    public fun hostedZones(hostedZones: Map<String, IHostedZone>) {
    }

    public fun method(method: ValidationMethod) {
    }

    public fun validationDomains(validationDomains: Map<String, String>) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.certificatemanager.CertificationValidationProps.Builder =
        software.amazon.awscdk.services.certificatemanager.CertificationValidationProps.builder()

    public override fun hostedZone(hostedZone: IHostedZone) {
      cdkBuilder.hostedZone(hostedZone.let(IHostedZone::unwrap))
    }

    public override fun hostedZones(hostedZones: Map<String, IHostedZone>) {
      cdkBuilder.hostedZones(hostedZones.mapValues { IHostedZone.unwrap(it.value)})
    }

    public override fun method(method: ValidationMethod) {
      cdkBuilder.method(method.let(ValidationMethod::unwrap))
    }

    public override fun validationDomains(validationDomains: Map<String, String>) {
      cdkBuilder.validationDomains(validationDomains)
    }

    public fun build():
        software.amazon.awscdk.services.certificatemanager.CertificationValidationProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.certificatemanager.CertificationValidationProps,
  ) : CertificationValidationProps {
    public override fun hostedZone(): IHostedZone? =
        unwrap(this).getHostedZone()?.let(IHostedZone::wrap)

    public override fun hostedZones(): Map<String, IHostedZone> =
        unwrap(this).getHostedZones()?.mapValues { IHostedZone.wrap(it.value)} ?: emptyMap()

    public override fun method(): ValidationMethod? =
        unwrap(this).getMethod()?.let(ValidationMethod::wrap)

    public override fun validationDomains(): Map<String, String> =
        unwrap(this).getValidationDomains() ?: emptyMap()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CertificationValidationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.certificatemanager.CertificationValidationProps):
        CertificationValidationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CertificationValidationProps):
        software.amazon.awscdk.services.certificatemanager.CertificationValidationProps = (wrapped
        as Wrapper).cdkObject
  }
}
