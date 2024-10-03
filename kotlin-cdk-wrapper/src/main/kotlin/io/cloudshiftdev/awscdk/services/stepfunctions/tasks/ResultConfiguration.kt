@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.s3.Location
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Location of query result along with S3 bucket configuration.
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
 * .bucketName("query-results-bucket")
 * .objectKey("folder")
 * .build())
 * .build())
 * .executionParameters(List.of("param1", "param2"))
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/athena/latest/APIReference/API_ResultConfiguration.html)
 */
public interface ResultConfiguration {
  /**
   * Encryption option used if enabled in S3.
   *
   * Default: - SSE_S3 encryption is enabled with default encryption key
   */
  public fun encryptionConfiguration(): EncryptionConfiguration? =
      unwrap(this).getEncryptionConfiguration()?.let(EncryptionConfiguration::wrap)

  /**
   * S3 path of query results.
   *
   * Example value: `s3://query-results-bucket/folder/`
   *
   * Default: - Query Result Location set in Athena settings for this workgroup
   */
  public fun outputLocation(): Location? = unwrap(this).getOutputLocation()?.let(Location::wrap)

  /**
   * A builder for [ResultConfiguration]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param encryptionConfiguration Encryption option used if enabled in S3.
     */
    public fun encryptionConfiguration(encryptionConfiguration: EncryptionConfiguration)

    /**
     * @param encryptionConfiguration Encryption option used if enabled in S3.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bee7008d40e5551ab7be6c4bf800ba632be586de8e46f75a362658c46ea1196a")
    public
        fun encryptionConfiguration(encryptionConfiguration: EncryptionConfiguration.Builder.() -> Unit)

    /**
     * @param outputLocation S3 path of query results.
     * Example value: `s3://query-results-bucket/folder/`
     */
    public fun outputLocation(outputLocation: Location)

    /**
     * @param outputLocation S3 path of query results.
     * Example value: `s3://query-results-bucket/folder/`
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("946c2aa2db98360f318aef4e7640a30dbef5168659f0b8d99722c1997ca1f670")
    public fun outputLocation(outputLocation: Location.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.ResultConfiguration.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.ResultConfiguration.builder()

    /**
     * @param encryptionConfiguration Encryption option used if enabled in S3.
     */
    override fun encryptionConfiguration(encryptionConfiguration: EncryptionConfiguration) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(EncryptionConfiguration.Companion::unwrap))
    }

    /**
     * @param encryptionConfiguration Encryption option used if enabled in S3.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bee7008d40e5551ab7be6c4bf800ba632be586de8e46f75a362658c46ea1196a")
    override
        fun encryptionConfiguration(encryptionConfiguration: EncryptionConfiguration.Builder.() -> Unit):
        Unit = encryptionConfiguration(EncryptionConfiguration(encryptionConfiguration))

    /**
     * @param outputLocation S3 path of query results.
     * Example value: `s3://query-results-bucket/folder/`
     */
    override fun outputLocation(outputLocation: Location) {
      cdkBuilder.outputLocation(outputLocation.let(Location.Companion::unwrap))
    }

    /**
     * @param outputLocation S3 path of query results.
     * Example value: `s3://query-results-bucket/folder/`
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("946c2aa2db98360f318aef4e7640a30dbef5168659f0b8d99722c1997ca1f670")
    override fun outputLocation(outputLocation: Location.Builder.() -> Unit): Unit =
        outputLocation(Location(outputLocation))

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.ResultConfiguration =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ResultConfiguration,
  ) : CdkObject(cdkObject),
      ResultConfiguration {
    /**
     * Encryption option used if enabled in S3.
     *
     * Default: - SSE_S3 encryption is enabled with default encryption key
     */
    override fun encryptionConfiguration(): EncryptionConfiguration? =
        unwrap(this).getEncryptionConfiguration()?.let(EncryptionConfiguration::wrap)

    /**
     * S3 path of query results.
     *
     * Example value: `s3://query-results-bucket/folder/`
     *
     * Default: - Query Result Location set in Athena settings for this workgroup
     */
    override fun outputLocation(): Location? = unwrap(this).getOutputLocation()?.let(Location::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ResultConfiguration {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ResultConfiguration):
        ResultConfiguration = CdkObjectWrappers.wrap(cdkObject) as? ResultConfiguration ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResultConfiguration):
        software.amazon.awscdk.services.stepfunctions.tasks.ResultConfiguration = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.ResultConfiguration
  }
}
