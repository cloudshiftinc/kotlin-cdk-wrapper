@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticsearch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Unit

/**
 * (deprecated) Whether the domain should encrypt data at rest, and if so, the AWS Key Management
 * Service (KMS) key to use.
 *
 * Can only be used to create a new domain,
 * not update an existing one. Requires Elasticsearch version 5.1 or later.
 *
 * Example:
 *
 * ```
 * Domain domain = Domain.Builder.create(this, "Domain")
 * .version(ElasticsearchVersion.V7_1)
 * .enforceHttps(true)
 * .nodeToNodeEncryption(true)
 * .encryptionAtRest(EncryptionAtRestOptions.builder()
 * .enabled(true)
 * .build())
 * .fineGrainedAccessControl(AdvancedSecurityOptions.builder()
 * .masterUserName("master-user")
 * .build())
 * .build();
 * SecretValue masterUserPassword = domain.getMasterUserPassword();
 * ```
 *
 * @deprecated use opensearchservice module instead
 */
public interface EncryptionAtRestOptions {
  /**
   * (deprecated) Specify true to enable encryption at rest.
   *
   * Default: - encryption at rest is disabled.
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  /**
   * (deprecated) Supply if using KMS key for encryption at rest.
   *
   * Default: - uses default aws/es KMS key.
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

  /**
   * A builder for [EncryptionAtRestOptions]
   */
  @CdkDslMarker
  @Deprecated(message = "deprecated in CDK")
  public interface Builder {
    /**
     * @param enabled Specify true to enable encryption at rest.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun enabled(enabled: Boolean)

    /**
     * @param kmsKey Supply if using KMS key for encryption at rest.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun kmsKey(kmsKey: IKey)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticsearch.EncryptionAtRestOptions.Builder =
        software.amazon.awscdk.services.elasticsearch.EncryptionAtRestOptions.builder()

    /**
     * @param enabled Specify true to enable encryption at rest.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param kmsKey Supply if using KMS key for encryption at rest.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun kmsKey(kmsKey: IKey) {
      cdkBuilder.kmsKey(kmsKey.let(IKey.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.elasticsearch.EncryptionAtRestOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.elasticsearch.EncryptionAtRestOptions,
  ) : CdkObject(cdkObject), EncryptionAtRestOptions {
    /**
     * (deprecated) Specify true to enable encryption at rest.
     *
     * Default: - encryption at rest is disabled.
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    /**
     * (deprecated) Supply if using KMS key for encryption at rest.
     *
     * Default: - uses default aws/es KMS key.
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionAtRestOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.EncryptionAtRestOptions):
        EncryptionAtRestOptions = CdkObjectWrappers.wrap(cdkObject) as? EncryptionAtRestOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: EncryptionAtRestOptions):
        software.amazon.awscdk.services.elasticsearch.EncryptionAtRestOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticsearch.EncryptionAtRestOptions
  }
}
