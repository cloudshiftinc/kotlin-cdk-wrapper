@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.transfer

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnServerProps {
  public fun certificate(): String? = unwrap(this).getCertificate()

  public fun domain(): String? = unwrap(this).getDomain()

  public fun endpointDetails(): Any? = unwrap(this).getEndpointDetails()

  public fun endpointType(): String? = unwrap(this).getEndpointType()

  public fun identityProviderDetails(): Any? = unwrap(this).getIdentityProviderDetails()

  public fun identityProviderType(): String? = unwrap(this).getIdentityProviderType()

  public fun loggingRole(): String? = unwrap(this).getLoggingRole()

  public fun postAuthenticationLoginBanner(): String? =
      unwrap(this).getPostAuthenticationLoginBanner()

  public fun preAuthenticationLoginBanner(): String? =
      unwrap(this).getPreAuthenticationLoginBanner()

  public fun protocolDetails(): Any? = unwrap(this).getProtocolDetails()

  public fun protocols(): List<String> = unwrap(this).getProtocols() ?: emptyList()

  public fun s3StorageOptions(): Any? = unwrap(this).getS3StorageOptions()

  public fun securityPolicyName(): String? = unwrap(this).getSecurityPolicyName()

  public fun structuredLogDestinations(): List<String> = unwrap(this).getStructuredLogDestinations()
      ?: emptyList()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun workflowDetails(): Any? = unwrap(this).getWorkflowDetails()

  @CdkDslMarker
  public interface Builder {
    public fun certificate(certificate: String)

    public fun domain(domain: String)

    public fun endpointDetails(endpointDetails: IResolvable)

    public fun endpointDetails(endpointDetails: CfnServer.EndpointDetailsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3aad3feabd3aa90dc199f7e58e041a1812f6b7683c8b69f1f404a02867899694")
    public
        fun endpointDetails(endpointDetails: CfnServer.EndpointDetailsProperty.Builder.() -> Unit)

    public fun endpointType(endpointType: String)

    public fun identityProviderDetails(identityProviderDetails: IResolvable)

    public
        fun identityProviderDetails(identityProviderDetails: CfnServer.IdentityProviderDetailsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6667a8bdf89f0753feaef33b9217a294a51f08fbe0aa3ea2ee73f5f953743e1c")
    public
        fun identityProviderDetails(identityProviderDetails: CfnServer.IdentityProviderDetailsProperty.Builder.() -> Unit)

    public fun identityProviderType(identityProviderType: String)

    public fun loggingRole(loggingRole: String)

    public fun postAuthenticationLoginBanner(postAuthenticationLoginBanner: String)

    public fun preAuthenticationLoginBanner(preAuthenticationLoginBanner: String)

    public fun protocolDetails(protocolDetails: IResolvable)

    public fun protocolDetails(protocolDetails: CfnServer.ProtocolDetailsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5bbc3d66ee8227193a2ee88f5caa15361313225e1e0a66c9f32d77f54f8bcfcf")
    public
        fun protocolDetails(protocolDetails: CfnServer.ProtocolDetailsProperty.Builder.() -> Unit)

    public fun protocols(protocols: List<String>)

    public fun protocols(vararg protocols: String)

    public fun s3StorageOptions(s3StorageOptions: IResolvable)

    public fun s3StorageOptions(s3StorageOptions: CfnServer.S3StorageOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1d5c2ccf7baee0839a5a63d0df370c197c84eacbb07af1249ab365c0fe8f5e79")
    public
        fun s3StorageOptions(s3StorageOptions: CfnServer.S3StorageOptionsProperty.Builder.() -> Unit)

    public fun securityPolicyName(securityPolicyName: String)

    public fun structuredLogDestinations(structuredLogDestinations: List<String>)

    public fun structuredLogDestinations(vararg structuredLogDestinations: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun workflowDetails(workflowDetails: IResolvable)

    public fun workflowDetails(workflowDetails: CfnServer.WorkflowDetailsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ae894fabf61c848aa94abd87d00d72cf85150ed4e548ee128b3de4c0953f6892")
    public
        fun workflowDetails(workflowDetails: CfnServer.WorkflowDetailsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.transfer.CfnServerProps.Builder =
        software.amazon.awscdk.services.transfer.CfnServerProps.builder()

    override fun certificate(certificate: String) {
      cdkBuilder.certificate(certificate)
    }

    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    override fun endpointDetails(endpointDetails: IResolvable) {
      cdkBuilder.endpointDetails(endpointDetails.let(IResolvable::unwrap))
    }

    override fun endpointDetails(endpointDetails: CfnServer.EndpointDetailsProperty) {
      cdkBuilder.endpointDetails(endpointDetails.let(CfnServer.EndpointDetailsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3aad3feabd3aa90dc199f7e58e041a1812f6b7683c8b69f1f404a02867899694")
    override
        fun endpointDetails(endpointDetails: CfnServer.EndpointDetailsProperty.Builder.() -> Unit):
        Unit = endpointDetails(CfnServer.EndpointDetailsProperty(endpointDetails))

    override fun endpointType(endpointType: String) {
      cdkBuilder.endpointType(endpointType)
    }

    override fun identityProviderDetails(identityProviderDetails: IResolvable) {
      cdkBuilder.identityProviderDetails(identityProviderDetails.let(IResolvable::unwrap))
    }

    override
        fun identityProviderDetails(identityProviderDetails: CfnServer.IdentityProviderDetailsProperty) {
      cdkBuilder.identityProviderDetails(identityProviderDetails.let(CfnServer.IdentityProviderDetailsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6667a8bdf89f0753feaef33b9217a294a51f08fbe0aa3ea2ee73f5f953743e1c")
    override
        fun identityProviderDetails(identityProviderDetails: CfnServer.IdentityProviderDetailsProperty.Builder.() -> Unit):
        Unit =
        identityProviderDetails(CfnServer.IdentityProviderDetailsProperty(identityProviderDetails))

    override fun identityProviderType(identityProviderType: String) {
      cdkBuilder.identityProviderType(identityProviderType)
    }

    override fun loggingRole(loggingRole: String) {
      cdkBuilder.loggingRole(loggingRole)
    }

    override fun postAuthenticationLoginBanner(postAuthenticationLoginBanner: String) {
      cdkBuilder.postAuthenticationLoginBanner(postAuthenticationLoginBanner)
    }

    override fun preAuthenticationLoginBanner(preAuthenticationLoginBanner: String) {
      cdkBuilder.preAuthenticationLoginBanner(preAuthenticationLoginBanner)
    }

    override fun protocolDetails(protocolDetails: IResolvable) {
      cdkBuilder.protocolDetails(protocolDetails.let(IResolvable::unwrap))
    }

    override fun protocolDetails(protocolDetails: CfnServer.ProtocolDetailsProperty) {
      cdkBuilder.protocolDetails(protocolDetails.let(CfnServer.ProtocolDetailsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5bbc3d66ee8227193a2ee88f5caa15361313225e1e0a66c9f32d77f54f8bcfcf")
    override
        fun protocolDetails(protocolDetails: CfnServer.ProtocolDetailsProperty.Builder.() -> Unit):
        Unit = protocolDetails(CfnServer.ProtocolDetailsProperty(protocolDetails))

    override fun protocols(protocols: List<String>) {
      cdkBuilder.protocols(protocols)
    }

    override fun protocols(vararg protocols: String): Unit = protocols(protocols.toList())

    override fun s3StorageOptions(s3StorageOptions: IResolvable) {
      cdkBuilder.s3StorageOptions(s3StorageOptions.let(IResolvable::unwrap))
    }

    override fun s3StorageOptions(s3StorageOptions: CfnServer.S3StorageOptionsProperty) {
      cdkBuilder.s3StorageOptions(s3StorageOptions.let(CfnServer.S3StorageOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1d5c2ccf7baee0839a5a63d0df370c197c84eacbb07af1249ab365c0fe8f5e79")
    override
        fun s3StorageOptions(s3StorageOptions: CfnServer.S3StorageOptionsProperty.Builder.() -> Unit):
        Unit = s3StorageOptions(CfnServer.S3StorageOptionsProperty(s3StorageOptions))

    override fun securityPolicyName(securityPolicyName: String) {
      cdkBuilder.securityPolicyName(securityPolicyName)
    }

    override fun structuredLogDestinations(structuredLogDestinations: List<String>) {
      cdkBuilder.structuredLogDestinations(structuredLogDestinations)
    }

    override fun structuredLogDestinations(vararg structuredLogDestinations: String): Unit =
        structuredLogDestinations(structuredLogDestinations.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun workflowDetails(workflowDetails: IResolvable) {
      cdkBuilder.workflowDetails(workflowDetails.let(IResolvable::unwrap))
    }

    override fun workflowDetails(workflowDetails: CfnServer.WorkflowDetailsProperty) {
      cdkBuilder.workflowDetails(workflowDetails.let(CfnServer.WorkflowDetailsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ae894fabf61c848aa94abd87d00d72cf85150ed4e548ee128b3de4c0953f6892")
    override
        fun workflowDetails(workflowDetails: CfnServer.WorkflowDetailsProperty.Builder.() -> Unit):
        Unit = workflowDetails(CfnServer.WorkflowDetailsProperty(workflowDetails))

    public fun build(): software.amazon.awscdk.services.transfer.CfnServerProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.transfer.CfnServerProps,
  ) : CdkObject(cdkObject), CfnServerProps {
    override fun certificate(): String? = unwrap(this).getCertificate()

    override fun domain(): String? = unwrap(this).getDomain()

    override fun endpointDetails(): Any? = unwrap(this).getEndpointDetails()

    override fun endpointType(): String? = unwrap(this).getEndpointType()

    override fun identityProviderDetails(): Any? = unwrap(this).getIdentityProviderDetails()

    override fun identityProviderType(): String? = unwrap(this).getIdentityProviderType()

    override fun loggingRole(): String? = unwrap(this).getLoggingRole()

    override fun postAuthenticationLoginBanner(): String? =
        unwrap(this).getPostAuthenticationLoginBanner()

    override fun preAuthenticationLoginBanner(): String? =
        unwrap(this).getPreAuthenticationLoginBanner()

    override fun protocolDetails(): Any? = unwrap(this).getProtocolDetails()

    override fun protocols(): List<String> = unwrap(this).getProtocols() ?: emptyList()

    override fun s3StorageOptions(): Any? = unwrap(this).getS3StorageOptions()

    override fun securityPolicyName(): String? = unwrap(this).getSecurityPolicyName()

    override fun structuredLogDestinations(): List<String> =
        unwrap(this).getStructuredLogDestinations() ?: emptyList()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun workflowDetails(): Any? = unwrap(this).getWorkflowDetails()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnServerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnServerProps):
        CfnServerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnServerProps):
        software.amazon.awscdk.services.transfer.CfnServerProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.transfer.CfnServerProps
  }
}
