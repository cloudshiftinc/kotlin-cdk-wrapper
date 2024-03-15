@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.certificatemanager.ICertificate
import kotlin.String
import kotlin.Unit

public interface CustomDomainOptions {
  public fun certificate(): ICertificate

  public fun domainName(): String

  @CdkDslMarker
  public interface Builder {
    public fun certificate(certificate: ICertificate)

    public fun domainName(domainName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.CustomDomainOptions.Builder =
        software.amazon.awscdk.services.cognito.CustomDomainOptions.builder()

    override fun certificate(certificate: ICertificate) {
      cdkBuilder.certificate(certificate.let(ICertificate::unwrap))
    }

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    public fun build(): software.amazon.awscdk.services.cognito.CustomDomainOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.CustomDomainOptions,
  ) : CdkObject(cdkObject), CustomDomainOptions {
    override fun certificate(): ICertificate = unwrap(this).getCertificate().let(ICertificate::wrap)

    override fun domainName(): String = unwrap(this).getDomainName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CustomDomainOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CustomDomainOptions):
        CustomDomainOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CustomDomainOptions):
        software.amazon.awscdk.services.cognito.CustomDomainOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cognito.CustomDomainOptions
  }
}
