@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.String
import kotlin.Unit

/**
 * TLS configuration for Service Connect service.
 *
 * Example:
 *
 * ```
 * Cluster cluster;
 * TaskDefinition taskDefinition;
 * IKey kmsKey;
 * IRole role;
 * FargateService service = FargateService.Builder.create(this, "FargateService")
 * .cluster(cluster)
 * .taskDefinition(taskDefinition)
 * .serviceConnectConfiguration(ServiceConnectProps.builder()
 * .services(List.of(ServiceConnectService.builder()
 * .tls(ServiceConnectTlsConfiguration.builder()
 * .role(role)
 * .kmsKey(kmsKey)
 * .awsPcaAuthorityArn("arn:aws:acm-pca:us-east-1:123456789012:certificate-authority/123456789012")
 * .build())
 * .portMappingName("api")
 * .build()))
 * .namespace("sample namespace")
 * .build())
 * .build();
 * ```
 */
public interface ServiceConnectTlsConfiguration {
  /**
   * The ARN of the certificate root authority that secures your service.
   *
   * Default: - none
   */
  public fun awsPcaAuthorityArn(): String? = unwrap(this).getAwsPcaAuthorityArn()

  /**
   * The KMS key used for encryption and decryption.
   *
   * Default: - none
   */
  public fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

  /**
   * The IAM role that's associated with the Service Connect TLS.
   *
   * Default: - none
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * A builder for [ServiceConnectTlsConfiguration]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param awsPcaAuthorityArn The ARN of the certificate root authority that secures your
     * service.
     */
    public fun awsPcaAuthorityArn(awsPcaAuthorityArn: String)

    /**
     * @param kmsKey The KMS key used for encryption and decryption.
     */
    public fun kmsKey(kmsKey: IKey)

    /**
     * @param role The IAM role that's associated with the Service Connect TLS.
     */
    public fun role(role: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.ServiceConnectTlsConfiguration.Builder =
        software.amazon.awscdk.services.ecs.ServiceConnectTlsConfiguration.builder()

    /**
     * @param awsPcaAuthorityArn The ARN of the certificate root authority that secures your
     * service.
     */
    override fun awsPcaAuthorityArn(awsPcaAuthorityArn: String) {
      cdkBuilder.awsPcaAuthorityArn(awsPcaAuthorityArn)
    }

    /**
     * @param kmsKey The KMS key used for encryption and decryption.
     */
    override fun kmsKey(kmsKey: IKey) {
      cdkBuilder.kmsKey(kmsKey.let(IKey.Companion::unwrap))
    }

    /**
     * @param role The IAM role that's associated with the Service Connect TLS.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.ServiceConnectTlsConfiguration =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecs.ServiceConnectTlsConfiguration,
  ) : CdkObject(cdkObject),
      ServiceConnectTlsConfiguration {
    /**
     * The ARN of the certificate root authority that secures your service.
     *
     * Default: - none
     */
    override fun awsPcaAuthorityArn(): String? = unwrap(this).getAwsPcaAuthorityArn()

    /**
     * The KMS key used for encryption and decryption.
     *
     * Default: - none
     */
    override fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

    /**
     * The IAM role that's associated with the Service Connect TLS.
     *
     * Default: - none
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ServiceConnectTlsConfiguration {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ServiceConnectTlsConfiguration):
        ServiceConnectTlsConfiguration = CdkObjectWrappers.wrap(cdkObject) as?
        ServiceConnectTlsConfiguration ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ServiceConnectTlsConfiguration):
        software.amazon.awscdk.services.ecs.ServiceConnectTlsConfiguration = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.ServiceConnectTlsConfiguration
  }
}
