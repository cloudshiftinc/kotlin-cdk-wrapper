@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for a backend.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appmesh.*;
 * BackendConfig backendConfig = BackendConfig.builder()
 * .virtualServiceBackend(BackendProperty.builder()
 * .virtualService(VirtualServiceBackendProperty.builder()
 * .virtualServiceName("virtualServiceName")
 * // the properties below are optional
 * .clientPolicy(ClientPolicyProperty.builder()
 * .tls(ClientPolicyTlsProperty.builder()
 * .validation(TlsValidationContextProperty.builder()
 * .trust(TlsValidationContextTrustProperty.builder()
 * .acm(TlsValidationContextAcmTrustProperty.builder()
 * .certificateAuthorityArns(List.of("certificateAuthorityArns"))
 * .build())
 * .file(TlsValidationContextFileTrustProperty.builder()
 * .certificateChain("certificateChain")
 * .build())
 * .sds(TlsValidationContextSdsTrustProperty.builder()
 * .secretName("secretName")
 * .build())
 * .build())
 * // the properties below are optional
 * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
 * .match(SubjectAlternativeNameMatchersProperty.builder()
 * .exact(List.of("exact"))
 * .build())
 * .build())
 * .build())
 * // the properties below are optional
 * .certificate(ClientTlsCertificateProperty.builder()
 * .file(ListenerTlsFileCertificateProperty.builder()
 * .certificateChain("certificateChain")
 * .privateKey("privateKey")
 * .build())
 * .sds(ListenerTlsSdsCertificateProperty.builder()
 * .secretName("secretName")
 * .build())
 * .build())
 * .enforce(false)
 * .ports(List.of(123))
 * .build())
 * .build())
 * .build())
 * .build())
 * .build();
 * ```
 */
public interface BackendConfig {
  /**
   * Config for a Virtual Service backend.
   */
  public fun virtualServiceBackend(): CfnVirtualNode.BackendProperty

  /**
   * A builder for [BackendConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param virtualServiceBackend Config for a Virtual Service backend. 
     */
    public fun virtualServiceBackend(virtualServiceBackend: CfnVirtualNode.BackendProperty)

    /**
     * @param virtualServiceBackend Config for a Virtual Service backend. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f8a48ba3a11c5eea70902c736f67e3953db62e8cf30892e96e2975c4eec673f8")
    public
        fun virtualServiceBackend(virtualServiceBackend: CfnVirtualNode.BackendProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.BackendConfig.Builder =
        software.amazon.awscdk.services.appmesh.BackendConfig.builder()

    /**
     * @param virtualServiceBackend Config for a Virtual Service backend. 
     */
    override fun virtualServiceBackend(virtualServiceBackend: CfnVirtualNode.BackendProperty) {
      cdkBuilder.virtualServiceBackend(virtualServiceBackend.let(CfnVirtualNode.BackendProperty::unwrap))
    }

    /**
     * @param virtualServiceBackend Config for a Virtual Service backend. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f8a48ba3a11c5eea70902c736f67e3953db62e8cf30892e96e2975c4eec673f8")
    override
        fun virtualServiceBackend(virtualServiceBackend: CfnVirtualNode.BackendProperty.Builder.() -> Unit):
        Unit = virtualServiceBackend(CfnVirtualNode.BackendProperty(virtualServiceBackend))

    public fun build(): software.amazon.awscdk.services.appmesh.BackendConfig = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.BackendConfig,
  ) : CdkObject(cdkObject), BackendConfig {
    /**
     * Config for a Virtual Service backend.
     */
    override fun virtualServiceBackend(): CfnVirtualNode.BackendProperty =
        unwrap(this).getVirtualServiceBackend().let(CfnVirtualNode.BackendProperty::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BackendConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.BackendConfig):
        BackendConfig = CdkObjectWrappers.wrap(cdkObject) as BackendConfig

    internal fun unwrap(wrapped: BackendConfig):
        software.amazon.awscdk.services.appmesh.BackendConfig = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.appmesh.BackendConfig
  }
}
