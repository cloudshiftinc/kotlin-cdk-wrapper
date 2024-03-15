@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnDomainNameProps {
  public fun certificateArn(): String? = unwrap(this).getCertificateArn()

  public fun domainName(): String? = unwrap(this).getDomainName()

  public fun endpointConfiguration(): Any? = unwrap(this).getEndpointConfiguration()

  public fun mutualTlsAuthentication(): Any? = unwrap(this).getMutualTlsAuthentication()

  public fun ownershipVerificationCertificateArn(): String? =
      unwrap(this).getOwnershipVerificationCertificateArn()

  public fun regionalCertificateArn(): String? = unwrap(this).getRegionalCertificateArn()

  public fun securityPolicy(): String? = unwrap(this).getSecurityPolicy()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun certificateArn(certificateArn: String)

    public fun domainName(domainName: String)

    public fun endpointConfiguration(endpointConfiguration: IResolvable)

    public
        fun endpointConfiguration(endpointConfiguration: CfnDomainName.EndpointConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9545139855e9992f03a82cc2b0e5a20d51b5a0111d1d159fad158643616bcc0c")
    public
        fun endpointConfiguration(endpointConfiguration: CfnDomainName.EndpointConfigurationProperty.Builder.() -> Unit)

    public fun mutualTlsAuthentication(mutualTlsAuthentication: IResolvable)

    public
        fun mutualTlsAuthentication(mutualTlsAuthentication: CfnDomainName.MutualTlsAuthenticationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("145c4f73fb42d205904d9df209384dc6ce42cd6e966150a4b750af766f36f918")
    public
        fun mutualTlsAuthentication(mutualTlsAuthentication: CfnDomainName.MutualTlsAuthenticationProperty.Builder.() -> Unit)

    public fun ownershipVerificationCertificateArn(ownershipVerificationCertificateArn: String)

    public fun regionalCertificateArn(regionalCertificateArn: String)

    public fun securityPolicy(securityPolicy: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnDomainNameProps.Builder =
        software.amazon.awscdk.services.apigateway.CfnDomainNameProps.builder()

    override fun certificateArn(certificateArn: String) {
      cdkBuilder.certificateArn(certificateArn)
    }

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    override fun endpointConfiguration(endpointConfiguration: IResolvable) {
      cdkBuilder.endpointConfiguration(endpointConfiguration.let(IResolvable::unwrap))
    }

    override
        fun endpointConfiguration(endpointConfiguration: CfnDomainName.EndpointConfigurationProperty) {
      cdkBuilder.endpointConfiguration(endpointConfiguration.let(CfnDomainName.EndpointConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9545139855e9992f03a82cc2b0e5a20d51b5a0111d1d159fad158643616bcc0c")
    override
        fun endpointConfiguration(endpointConfiguration: CfnDomainName.EndpointConfigurationProperty.Builder.() -> Unit):
        Unit =
        endpointConfiguration(CfnDomainName.EndpointConfigurationProperty(endpointConfiguration))

    override fun mutualTlsAuthentication(mutualTlsAuthentication: IResolvable) {
      cdkBuilder.mutualTlsAuthentication(mutualTlsAuthentication.let(IResolvable::unwrap))
    }

    override
        fun mutualTlsAuthentication(mutualTlsAuthentication: CfnDomainName.MutualTlsAuthenticationProperty) {
      cdkBuilder.mutualTlsAuthentication(mutualTlsAuthentication.let(CfnDomainName.MutualTlsAuthenticationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("145c4f73fb42d205904d9df209384dc6ce42cd6e966150a4b750af766f36f918")
    override
        fun mutualTlsAuthentication(mutualTlsAuthentication: CfnDomainName.MutualTlsAuthenticationProperty.Builder.() -> Unit):
        Unit =
        mutualTlsAuthentication(CfnDomainName.MutualTlsAuthenticationProperty(mutualTlsAuthentication))

    override fun ownershipVerificationCertificateArn(ownershipVerificationCertificateArn: String) {
      cdkBuilder.ownershipVerificationCertificateArn(ownershipVerificationCertificateArn)
    }

    override fun regionalCertificateArn(regionalCertificateArn: String) {
      cdkBuilder.regionalCertificateArn(regionalCertificateArn)
    }

    override fun securityPolicy(securityPolicy: String) {
      cdkBuilder.securityPolicy(securityPolicy)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.apigateway.CfnDomainNameProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.CfnDomainNameProps,
  ) : CdkObject(cdkObject), CfnDomainNameProps {
    override fun certificateArn(): String? = unwrap(this).getCertificateArn()

    override fun domainName(): String? = unwrap(this).getDomainName()

    override fun endpointConfiguration(): Any? = unwrap(this).getEndpointConfiguration()

    override fun mutualTlsAuthentication(): Any? = unwrap(this).getMutualTlsAuthentication()

    override fun ownershipVerificationCertificateArn(): String? =
        unwrap(this).getOwnershipVerificationCertificateArn()

    override fun regionalCertificateArn(): String? = unwrap(this).getRegionalCertificateArn()

    override fun securityPolicy(): String? = unwrap(this).getSecurityPolicy()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDomainNameProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnDomainNameProps):
        CfnDomainNameProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDomainNameProps):
        software.amazon.awscdk.services.apigateway.CfnDomainNameProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.CfnDomainNameProps
  }
}
