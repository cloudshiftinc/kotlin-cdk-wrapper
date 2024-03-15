@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnVerifiedAccessEndpointProps {
  public fun applicationDomain(): String

  public fun attachmentType(): String

  public fun description(): String? = unwrap(this).getDescription()

  public fun domainCertificateArn(): String

  public fun endpointDomainPrefix(): String

  public fun endpointType(): String

  public fun loadBalancerOptions(): Any? = unwrap(this).getLoadBalancerOptions()

  public fun networkInterfaceOptions(): Any? = unwrap(this).getNetworkInterfaceOptions()

  public fun policyDocument(): String? = unwrap(this).getPolicyDocument()

  public fun policyEnabled(): Any? = unwrap(this).getPolicyEnabled()

  public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

  public fun sseSpecification(): Any? = unwrap(this).getSseSpecification()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun verifiedAccessGroupId(): String

  @CdkDslMarker
  public interface Builder {
    public fun applicationDomain(applicationDomain: String)

    public fun attachmentType(attachmentType: String)

    public fun description(description: String)

    public fun domainCertificateArn(domainCertificateArn: String)

    public fun endpointDomainPrefix(endpointDomainPrefix: String)

    public fun endpointType(endpointType: String)

    public fun loadBalancerOptions(loadBalancerOptions: IResolvable)

    public
        fun loadBalancerOptions(loadBalancerOptions: CfnVerifiedAccessEndpoint.LoadBalancerOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("af1a30bc20d68e52b34c415f5bdbfa8a358832ebe36a95a91ba7eb9dc0987f42")
    public
        fun loadBalancerOptions(loadBalancerOptions: CfnVerifiedAccessEndpoint.LoadBalancerOptionsProperty.Builder.() -> Unit)

    public fun networkInterfaceOptions(networkInterfaceOptions: IResolvable)

    public
        fun networkInterfaceOptions(networkInterfaceOptions: CfnVerifiedAccessEndpoint.NetworkInterfaceOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2bd1675cbf46b3640af6411e4d791fbb5fb9c5f18ca9debf4f0d7007081a7bb9")
    public
        fun networkInterfaceOptions(networkInterfaceOptions: CfnVerifiedAccessEndpoint.NetworkInterfaceOptionsProperty.Builder.() -> Unit)

    public fun policyDocument(policyDocument: String)

    public fun policyEnabled(policyEnabled: Boolean)

    public fun policyEnabled(policyEnabled: IResolvable)

    public fun securityGroupIds(securityGroupIds: List<String>)

    public fun securityGroupIds(vararg securityGroupIds: String)

    public fun sseSpecification(sseSpecification: IResolvable)

    public
        fun sseSpecification(sseSpecification: CfnVerifiedAccessEndpoint.SseSpecificationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b96b07141474c138224c05865bfefe8a32246c8605b272d4743dbf4b60797c3d")
    public
        fun sseSpecification(sseSpecification: CfnVerifiedAccessEndpoint.SseSpecificationProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun verifiedAccessGroupId(verifiedAccessGroupId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpointProps.Builder =
        software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpointProps.builder()

    override fun applicationDomain(applicationDomain: String) {
      cdkBuilder.applicationDomain(applicationDomain)
    }

    override fun attachmentType(attachmentType: String) {
      cdkBuilder.attachmentType(attachmentType)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun domainCertificateArn(domainCertificateArn: String) {
      cdkBuilder.domainCertificateArn(domainCertificateArn)
    }

    override fun endpointDomainPrefix(endpointDomainPrefix: String) {
      cdkBuilder.endpointDomainPrefix(endpointDomainPrefix)
    }

    override fun endpointType(endpointType: String) {
      cdkBuilder.endpointType(endpointType)
    }

    override fun loadBalancerOptions(loadBalancerOptions: IResolvable) {
      cdkBuilder.loadBalancerOptions(loadBalancerOptions.let(IResolvable::unwrap))
    }

    override
        fun loadBalancerOptions(loadBalancerOptions: CfnVerifiedAccessEndpoint.LoadBalancerOptionsProperty) {
      cdkBuilder.loadBalancerOptions(loadBalancerOptions.let(CfnVerifiedAccessEndpoint.LoadBalancerOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("af1a30bc20d68e52b34c415f5bdbfa8a358832ebe36a95a91ba7eb9dc0987f42")
    override
        fun loadBalancerOptions(loadBalancerOptions: CfnVerifiedAccessEndpoint.LoadBalancerOptionsProperty.Builder.() -> Unit):
        Unit =
        loadBalancerOptions(CfnVerifiedAccessEndpoint.LoadBalancerOptionsProperty(loadBalancerOptions))

    override fun networkInterfaceOptions(networkInterfaceOptions: IResolvable) {
      cdkBuilder.networkInterfaceOptions(networkInterfaceOptions.let(IResolvable::unwrap))
    }

    override
        fun networkInterfaceOptions(networkInterfaceOptions: CfnVerifiedAccessEndpoint.NetworkInterfaceOptionsProperty) {
      cdkBuilder.networkInterfaceOptions(networkInterfaceOptions.let(CfnVerifiedAccessEndpoint.NetworkInterfaceOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2bd1675cbf46b3640af6411e4d791fbb5fb9c5f18ca9debf4f0d7007081a7bb9")
    override
        fun networkInterfaceOptions(networkInterfaceOptions: CfnVerifiedAccessEndpoint.NetworkInterfaceOptionsProperty.Builder.() -> Unit):
        Unit =
        networkInterfaceOptions(CfnVerifiedAccessEndpoint.NetworkInterfaceOptionsProperty(networkInterfaceOptions))

    override fun policyDocument(policyDocument: String) {
      cdkBuilder.policyDocument(policyDocument)
    }

    override fun policyEnabled(policyEnabled: Boolean) {
      cdkBuilder.policyEnabled(policyEnabled)
    }

    override fun policyEnabled(policyEnabled: IResolvable) {
      cdkBuilder.policyEnabled(policyEnabled.let(IResolvable::unwrap))
    }

    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    override fun sseSpecification(sseSpecification: IResolvable) {
      cdkBuilder.sseSpecification(sseSpecification.let(IResolvable::unwrap))
    }

    override
        fun sseSpecification(sseSpecification: CfnVerifiedAccessEndpoint.SseSpecificationProperty) {
      cdkBuilder.sseSpecification(sseSpecification.let(CfnVerifiedAccessEndpoint.SseSpecificationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b96b07141474c138224c05865bfefe8a32246c8605b272d4743dbf4b60797c3d")
    override
        fun sseSpecification(sseSpecification: CfnVerifiedAccessEndpoint.SseSpecificationProperty.Builder.() -> Unit):
        Unit =
        sseSpecification(CfnVerifiedAccessEndpoint.SseSpecificationProperty(sseSpecification))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun verifiedAccessGroupId(verifiedAccessGroupId: String) {
      cdkBuilder.verifiedAccessGroupId(verifiedAccessGroupId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpointProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpointProps,
  ) : CdkObject(cdkObject), CfnVerifiedAccessEndpointProps {
    override fun applicationDomain(): String = unwrap(this).getApplicationDomain()

    override fun attachmentType(): String = unwrap(this).getAttachmentType()

    override fun description(): String? = unwrap(this).getDescription()

    override fun domainCertificateArn(): String = unwrap(this).getDomainCertificateArn()

    override fun endpointDomainPrefix(): String = unwrap(this).getEndpointDomainPrefix()

    override fun endpointType(): String = unwrap(this).getEndpointType()

    override fun loadBalancerOptions(): Any? = unwrap(this).getLoadBalancerOptions()

    override fun networkInterfaceOptions(): Any? = unwrap(this).getNetworkInterfaceOptions()

    override fun policyDocument(): String? = unwrap(this).getPolicyDocument()

    override fun policyEnabled(): Any? = unwrap(this).getPolicyEnabled()

    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
        emptyList()

    override fun sseSpecification(): Any? = unwrap(this).getSseSpecification()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun verifiedAccessGroupId(): String = unwrap(this).getVerifiedAccessGroupId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVerifiedAccessEndpointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpointProps):
        CfnVerifiedAccessEndpointProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVerifiedAccessEndpointProps):
        software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpointProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpointProps
  }
}
