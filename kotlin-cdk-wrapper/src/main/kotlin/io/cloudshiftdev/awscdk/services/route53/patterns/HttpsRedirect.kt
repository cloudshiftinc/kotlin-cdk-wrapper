@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53.patterns

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.certificatemanager.ICertificate
import io.cloudshiftdev.awscdk.services.route53.IHostedZone
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class HttpsRedirect internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.route53.patterns.HttpsRedirect,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  @CdkDslMarker
  public interface Builder {
    public fun certificate(certificate: ICertificate)

    public fun recordNames(recordNames: List<String>)

    public fun recordNames(vararg recordNames: String)

    public fun targetDomain(targetDomain: String)

    public fun zone(zone: IHostedZone)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.patterns.HttpsRedirect.Builder =
        software.amazon.awscdk.services.route53.patterns.HttpsRedirect.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.route53.patterns.HttpsRedirect =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): HttpsRedirect {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return HttpsRedirect(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.patterns.HttpsRedirect):
        HttpsRedirect = HttpsRedirect(cdkObject)

    internal fun unwrap(wrapped: HttpsRedirect):
        software.amazon.awscdk.services.route53.patterns.HttpsRedirect = wrapped.cdkObject
  }
}
