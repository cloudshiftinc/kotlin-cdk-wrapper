@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * An interface that represents the location of a specific object in an S3 Bucket.
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
 * .resultReuseConfigurationMaxAge(Duration.minutes(100))
 * .build();
 * ```
 */
public interface Location {
  /**
   * The name of the S3 Bucket the object is in.
   */
  public fun bucketName(): String

  /**
   * The path inside the Bucket where the object is located at.
   */
  public fun objectKey(): String

  /**
   * The S3 object version.
   */
  public fun objectVersion(): String? = unwrap(this).getObjectVersion()

  /**
   * A builder for [Location]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bucketName The name of the S3 Bucket the object is in. 
     */
    public fun bucketName(bucketName: String)

    /**
     * @param objectKey The path inside the Bucket where the object is located at. 
     */
    public fun objectKey(objectKey: String)

    /**
     * @param objectVersion The S3 object version.
     */
    public fun objectVersion(objectVersion: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.Location.Builder =
        software.amazon.awscdk.services.s3.Location.builder()

    /**
     * @param bucketName The name of the S3 Bucket the object is in. 
     */
    override fun bucketName(bucketName: String) {
      cdkBuilder.bucketName(bucketName)
    }

    /**
     * @param objectKey The path inside the Bucket where the object is located at. 
     */
    override fun objectKey(objectKey: String) {
      cdkBuilder.objectKey(objectKey)
    }

    /**
     * @param objectVersion The S3 object version.
     */
    override fun objectVersion(objectVersion: String) {
      cdkBuilder.objectVersion(objectVersion)
    }

    public fun build(): software.amazon.awscdk.services.s3.Location = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.s3.Location,
  ) : CdkObject(cdkObject),
      Location {
    /**
     * The name of the S3 Bucket the object is in.
     */
    override fun bucketName(): String = unwrap(this).getBucketName()

    /**
     * The path inside the Bucket where the object is located at.
     */
    override fun objectKey(): String = unwrap(this).getObjectKey()

    /**
     * The S3 object version.
     */
    override fun objectVersion(): String? = unwrap(this).getObjectVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Location {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.Location): Location =
        CdkObjectWrappers.wrap(cdkObject) as? Location ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: Location): software.amazon.awscdk.services.s3.Location = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.services.s3.Location
  }
}
