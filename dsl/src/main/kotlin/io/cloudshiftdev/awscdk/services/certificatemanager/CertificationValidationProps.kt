package io.cloudshiftdev.awscdk.services.certificatemanager

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.route53.IHostedZone
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface CertificationValidationProps {
  /**
   * Hosted zone to use for DNS validation.
   *
   * Default: - use email validation
   */
  public fun hostedZone(): IHostedZone? = unwrap(this).getHostedZone()?.let(IHostedZone::wrap)

  /**
   * A map of hosted zones to use for DNS validation.
   *
   * Default: - use `hostedZone`
   */
  public fun hostedZones(): Map<String, IHostedZone> =
      unwrap(this).getHostedZones()?.mapValues{IHostedZone.wrap(it.value)} ?: emptyMap()

  /**
   * Validation method.
   *
   * Default: ValidationMethod.EMAIL
   */
  public fun method(): ValidationMethod? = unwrap(this).getMethod()?.let(ValidationMethod::wrap)

  /**
   * Validation domains to use for email validation.
   *
   * Default: - Apex domain
   */
  public fun validationDomains(): Map<String, String> = unwrap(this).getValidationDomains() ?:
      emptyMap()

  /**
   * A builder for [CertificationValidationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param hostedZone Hosted zone to use for DNS validation.
     */
    public fun hostedZone(hostedZone: IHostedZone)

    /**
     * @param hostedZones A map of hosted zones to use for DNS validation.
     */
    public fun hostedZones(hostedZones: Map<String, IHostedZone>)

    /**
     * @param method Validation method.
     */
    public fun method(method: ValidationMethod)

    /**
     * @param validationDomains Validation domains to use for email validation.
     */
    public fun validationDomains(validationDomains: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.certificatemanager.CertificationValidationProps.Builder =
        software.amazon.awscdk.services.certificatemanager.CertificationValidationProps.builder()

    /**
     * @param hostedZone Hosted zone to use for DNS validation.
     */
    override fun hostedZone(hostedZone: IHostedZone) {
      cdkBuilder.hostedZone(hostedZone.let(IHostedZone::unwrap))
    }

    /**
     * @param hostedZones A map of hosted zones to use for DNS validation.
     */
    override fun hostedZones(hostedZones: Map<String, IHostedZone>) {
      cdkBuilder.hostedZones(hostedZones.mapValues{IHostedZone.unwrap(it.value)})
    }

    /**
     * @param method Validation method.
     */
    override fun method(method: ValidationMethod) {
      cdkBuilder.method(method.let(ValidationMethod::unwrap))
    }

    /**
     * @param validationDomains Validation domains to use for email validation.
     */
    override fun validationDomains(validationDomains: Map<String, String>) {
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
    /**
     * Hosted zone to use for DNS validation.
     *
     * Default: - use email validation
     */
    override fun hostedZone(): IHostedZone? = unwrap(this).getHostedZone()?.let(IHostedZone::wrap)

    /**
     * A map of hosted zones to use for DNS validation.
     *
     * Default: - use `hostedZone`
     */
    override fun hostedZones(): Map<String, IHostedZone> =
        unwrap(this).getHostedZones()?.mapValues{IHostedZone.wrap(it.value)} ?: emptyMap()

    /**
     * Validation method.
     *
     * Default: ValidationMethod.EMAIL
     */
    override fun method(): ValidationMethod? = unwrap(this).getMethod()?.let(ValidationMethod::wrap)

    /**
     * Validation domains to use for email validation.
     *
     * Default: - Apex domain
     */
    override fun validationDomains(): Map<String, String> = unwrap(this).getValidationDomains() ?:
        emptyMap()
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
