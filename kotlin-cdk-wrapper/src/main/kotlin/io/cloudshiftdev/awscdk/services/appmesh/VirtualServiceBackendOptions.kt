@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Represents the properties needed to define a Virtual Service backend.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appmesh.*;
 * MutualTlsCertificate mutualTlsCertificate;
 * SubjectAlternativeNames subjectAlternativeNames;
 * TlsValidationTrust tlsValidationTrust;
 * VirtualServiceBackendOptions virtualServiceBackendOptions =
 * VirtualServiceBackendOptions.builder()
 * .tlsClientPolicy(TlsClientPolicy.builder()
 * .validation(TlsValidation.builder()
 * .trust(tlsValidationTrust)
 * // the properties below are optional
 * .subjectAlternativeNames(subjectAlternativeNames)
 * .build())
 * // the properties below are optional
 * .enforce(false)
 * .mutualTlsCertificate(mutualTlsCertificate)
 * .ports(List.of(123))
 * .build())
 * .build();
 * ```
 */
public interface VirtualServiceBackendOptions {
  /**
   * TLS properties for  Client policy for the backend.
   *
   * Default: - none
   */
  public fun tlsClientPolicy(): TlsClientPolicy? =
      unwrap(this).getTlsClientPolicy()?.let(TlsClientPolicy::wrap)

  /**
   * A builder for [VirtualServiceBackendOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param tlsClientPolicy TLS properties for  Client policy for the backend.
     */
    public fun tlsClientPolicy(tlsClientPolicy: TlsClientPolicy)

    /**
     * @param tlsClientPolicy TLS properties for  Client policy for the backend.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7088fe453c32d32cf94952126da458090c76dae9149f3c2aedf01918c5d22594")
    public fun tlsClientPolicy(tlsClientPolicy: TlsClientPolicy.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appmesh.VirtualServiceBackendOptions.Builder =
        software.amazon.awscdk.services.appmesh.VirtualServiceBackendOptions.builder()

    /**
     * @param tlsClientPolicy TLS properties for  Client policy for the backend.
     */
    override fun tlsClientPolicy(tlsClientPolicy: TlsClientPolicy) {
      cdkBuilder.tlsClientPolicy(tlsClientPolicy.let(TlsClientPolicy::unwrap))
    }

    /**
     * @param tlsClientPolicy TLS properties for  Client policy for the backend.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7088fe453c32d32cf94952126da458090c76dae9149f3c2aedf01918c5d22594")
    override fun tlsClientPolicy(tlsClientPolicy: TlsClientPolicy.Builder.() -> Unit): Unit =
        tlsClientPolicy(TlsClientPolicy(tlsClientPolicy))

    public fun build(): software.amazon.awscdk.services.appmesh.VirtualServiceBackendOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appmesh.VirtualServiceBackendOptions,
  ) : CdkObject(cdkObject), VirtualServiceBackendOptions {
    /**
     * TLS properties for  Client policy for the backend.
     *
     * Default: - none
     */
    override fun tlsClientPolicy(): TlsClientPolicy? =
        unwrap(this).getTlsClientPolicy()?.let(TlsClientPolicy::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VirtualServiceBackendOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.VirtualServiceBackendOptions):
        VirtualServiceBackendOptions = CdkObjectWrappers.wrap(cdkObject) as?
        VirtualServiceBackendOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: VirtualServiceBackendOptions):
        software.amazon.awscdk.services.appmesh.VirtualServiceBackendOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.VirtualServiceBackendOptions
  }
}
