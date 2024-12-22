@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Unit

/**
 * Encryption Configuration of the S3 bucket.
 *
 * Example:
 *
 * ```
 * AthenaStartQueryExecution startQueryExecutionJob = AthenaStartQueryExecution.Builder.create(this,
 * "Start Athena Query")
 * .queryString(JsonPath.stringAt("$.queryString"))
 * .queryExecutionContext(QueryExecutionContext.builder()
 * .databaseName("mydatabase")
 * .build())
 * .resultConfiguration(ResultConfiguration.builder()
 * .encryptionConfiguration(EncryptionConfiguration.builder()
 * .encryptionOption(EncryptionOption.S3_MANAGED)
 * .build())
 * .outputLocation(Location.builder()
 * .bucketName("amzn-s3-demo-bucket")
 * .objectKey("folder")
 * .build())
 * .build())
 * .executionParameters(List.of("param1", "param2"))
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/athena/latest/APIReference/API_EncryptionConfiguration.html)
 */
public interface EncryptionConfiguration {
  /**
   * KMS key ARN or ID.
   *
   * Default: - No KMS key for Encryption Option SSE_S3 and default master key for Encryption Option
   * SSE_KMS and CSE_KMS
   */
  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  /**
   * Type of S3 server-side encryption enabled.
   *
   * Default: EncryptionOption.S3_MANAGED
   */
  public fun encryptionOption(): EncryptionOption

  /**
   * A builder for [EncryptionConfiguration]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param encryptionKey KMS key ARN or ID.
     */
    public fun encryptionKey(encryptionKey: IKey)

    /**
     * @param encryptionOption Type of S3 server-side encryption enabled. 
     */
    public fun encryptionOption(encryptionOption: EncryptionOption)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.EncryptionConfiguration.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.EncryptionConfiguration.builder()

    /**
     * @param encryptionKey KMS key ARN or ID.
     */
    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey.Companion::unwrap))
    }

    /**
     * @param encryptionOption Type of S3 server-side encryption enabled. 
     */
    override fun encryptionOption(encryptionOption: EncryptionOption) {
      cdkBuilder.encryptionOption(encryptionOption.let(EncryptionOption.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.EncryptionConfiguration
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EncryptionConfiguration,
  ) : CdkObject(cdkObject),
      EncryptionConfiguration {
    /**
     * KMS key ARN or ID.
     *
     * Default: - No KMS key for Encryption Option SSE_S3 and default master key for Encryption
     * Option SSE_KMS and CSE_KMS
     */
    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    /**
     * Type of S3 server-side encryption enabled.
     *
     * Default: EncryptionOption.S3_MANAGED
     */
    override fun encryptionOption(): EncryptionOption =
        unwrap(this).getEncryptionOption().let(EncryptionOption::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionConfiguration {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EncryptionConfiguration):
        EncryptionConfiguration = CdkObjectWrappers.wrap(cdkObject) as? EncryptionConfiguration ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: EncryptionConfiguration):
        software.amazon.awscdk.services.stepfunctions.tasks.EncryptionConfiguration = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.EncryptionConfiguration
  }
}
