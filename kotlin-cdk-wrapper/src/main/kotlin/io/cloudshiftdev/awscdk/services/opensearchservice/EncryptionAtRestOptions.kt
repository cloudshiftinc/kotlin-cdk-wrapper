@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opensearchservice

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Unit

/**
 * Whether the domain should encrypt data at rest, and if so, the AWS Key Management Service (KMS)
 * key to use.
 *
 * Can only be used to create a new domain,
 * not update an existing one. Requires Elasticsearch version 5.1 or later or OpenSearch version 1.0
 * or later.
 *
 * Example:
 *
 * ```
 * Domain domain = Domain.Builder.create(this, "Domain")
 * .version(EngineVersion.OPENSEARCH_1_0)
 * .enforceHttps(true)
 * .nodeToNodeEncryption(true)
 * .encryptionAtRest(EncryptionAtRestOptions.builder()
 * .enabled(true)
 * .build())
 * .fineGrainedAccessControl(AdvancedSecurityOptions.builder()
 * .masterUserName("master-user")
 * .samlAuthenticationEnabled(true)
 * .samlAuthenticationOptions(SAMLOptionsProperty.builder()
 * .idpEntityId("entity-id")
 * .idpMetadataContent("metadata-content-with-quotes-escaped")
 * .build())
 * .build())
 * .build();
 * ```
 */
public interface EncryptionAtRestOptions {
  /**
   * Specify true to enable encryption at rest.
   *
   * Default: - encryption at rest is disabled.
   */
  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  /**
   * Supply if using KMS key for encryption at rest.
   *
   * Default: - uses default aws/es KMS key.
   */
  public fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

  /**
   * A builder for [EncryptionAtRestOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param enabled Specify true to enable encryption at rest.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param kmsKey Supply if using KMS key for encryption at rest.
     */
    public fun kmsKey(kmsKey: IKey)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.opensearchservice.EncryptionAtRestOptions.Builder =
        software.amazon.awscdk.services.opensearchservice.EncryptionAtRestOptions.builder()

    /**
     * @param enabled Specify true to enable encryption at rest.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param kmsKey Supply if using KMS key for encryption at rest.
     */
    override fun kmsKey(kmsKey: IKey) {
      cdkBuilder.kmsKey(kmsKey.let(IKey::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.opensearchservice.EncryptionAtRestOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.opensearchservice.EncryptionAtRestOptions,
  ) : CdkObject(cdkObject), EncryptionAtRestOptions {
    /**
     * Specify true to enable encryption at rest.
     *
     * Default: - encryption at rest is disabled.
     */
    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    /**
     * Supply if using KMS key for encryption at rest.
     *
     * Default: - uses default aws/es KMS key.
     */
    override fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionAtRestOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.EncryptionAtRestOptions):
        EncryptionAtRestOptions = CdkObjectWrappers.wrap(cdkObject) as? EncryptionAtRestOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: EncryptionAtRestOptions):
        software.amazon.awscdk.services.opensearchservice.EncryptionAtRestOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.opensearchservice.EncryptionAtRestOptions
  }
}
