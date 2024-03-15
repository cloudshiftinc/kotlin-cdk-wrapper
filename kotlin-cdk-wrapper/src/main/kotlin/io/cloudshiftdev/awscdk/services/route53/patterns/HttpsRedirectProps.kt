@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53.patterns

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.certificatemanager.ICertificate
import io.cloudshiftdev.awscdk.services.route53.IHostedZone
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface HttpsRedirectProps {
  public fun certificate(): ICertificate? = unwrap(this).getCertificate()?.let(ICertificate::wrap)

  public fun recordNames(): List<String> = unwrap(this).getRecordNames() ?: emptyList()

  public fun targetDomain(): String

  public fun zone(): IHostedZone

  @CdkDslMarker
  public interface Builder {
    public fun certificate(certificate: ICertificate)

    public fun recordNames(recordNames: List<String>)

    public fun recordNames(vararg recordNames: String)

    public fun targetDomain(targetDomain: String)

    public fun zone(zone: IHostedZone)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53.patterns.HttpsRedirectProps.Builder =
        software.amazon.awscdk.services.route53.patterns.HttpsRedirectProps.builder()

    override fun certificate(certificate: ICertificate) {
      cdkBuilder.certificate(certificate.let(ICertificate::unwrap))
    }

    override fun recordNames(recordNames: List<String>) {
      cdkBuilder.recordNames(recordNames)
    }

    override fun recordNames(vararg recordNames: String): Unit = recordNames(recordNames.toList())

    override fun targetDomain(targetDomain: String) {
      cdkBuilder.targetDomain(targetDomain)
    }

    override fun zone(zone: IHostedZone) {
      cdkBuilder.zone(zone.let(IHostedZone::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.route53.patterns.HttpsRedirectProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.route53.patterns.HttpsRedirectProps,
  ) : CdkObject(cdkObject), HttpsRedirectProps {
    override fun certificate(): ICertificate? =
        unwrap(this).getCertificate()?.let(ICertificate::wrap)

    override fun recordNames(): List<String> = unwrap(this).getRecordNames() ?: emptyList()

    override fun targetDomain(): String = unwrap(this).getTargetDomain()

    override fun zone(): IHostedZone = unwrap(this).getZone().let(IHostedZone::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpsRedirectProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53.patterns.HttpsRedirectProps):
        HttpsRedirectProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpsRedirectProps):
        software.amazon.awscdk.services.route53.patterns.HttpsRedirectProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.route53.patterns.HttpsRedirectProps
  }
}
