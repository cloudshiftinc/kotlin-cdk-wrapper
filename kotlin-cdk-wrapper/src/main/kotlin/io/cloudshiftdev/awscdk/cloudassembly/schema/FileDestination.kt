@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Where in S3 a file asset needs to be published.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cloudassembly.schema.*;
 * FileDestination fileDestination = FileDestination.builder()
 * .bucketName("bucketName")
 * .objectKey("objectKey")
 * // the properties below are optional
 * .assumeRoleArn("assumeRoleArn")
 * .assumeRoleExternalId("assumeRoleExternalId")
 * .region("region")
 * .build();
 * ```
 */
public interface FileDestination : AwsDestination {
  /**
   * The name of the bucket.
   */
  public fun bucketName(): String

  /**
   * The destination object key.
   */
  public fun objectKey(): String

  /**
   * A builder for [FileDestination]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assumeRoleArn The role that needs to be assumed while publishing this asset.
     */
    public fun assumeRoleArn(assumeRoleArn: String)

    /**
     * @param assumeRoleExternalId The ExternalId that needs to be supplied while assuming this
     * role.
     */
    public fun assumeRoleExternalId(assumeRoleExternalId: String)

    /**
     * @param bucketName The name of the bucket. 
     */
    public fun bucketName(bucketName: String)

    /**
     * @param objectKey The destination object key. 
     */
    public fun objectKey(objectKey: String)

    /**
     * @param region The region where this asset will need to be published.
     */
    public fun region(region: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.FileDestination.Builder =
        software.amazon.awscdk.cloudassembly.schema.FileDestination.builder()

    /**
     * @param assumeRoleArn The role that needs to be assumed while publishing this asset.
     */
    override fun assumeRoleArn(assumeRoleArn: String) {
      cdkBuilder.assumeRoleArn(assumeRoleArn)
    }

    /**
     * @param assumeRoleExternalId The ExternalId that needs to be supplied while assuming this
     * role.
     */
    override fun assumeRoleExternalId(assumeRoleExternalId: String) {
      cdkBuilder.assumeRoleExternalId(assumeRoleExternalId)
    }

    /**
     * @param bucketName The name of the bucket. 
     */
    override fun bucketName(bucketName: String) {
      cdkBuilder.bucketName(bucketName)
    }

    /**
     * @param objectKey The destination object key. 
     */
    override fun objectKey(objectKey: String) {
      cdkBuilder.objectKey(objectKey)
    }

    /**
     * @param region The region where this asset will need to be published.
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.FileDestination =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloudassembly.schema.FileDestination,
  ) : CdkObject(cdkObject), FileDestination {
    /**
     * The role that needs to be assumed while publishing this asset.
     *
     * Default: - No role will be assumed
     */
    override fun assumeRoleArn(): String? = unwrap(this).getAssumeRoleArn()

    /**
     * The ExternalId that needs to be supplied while assuming this role.
     *
     * Default: - No ExternalId will be supplied
     */
    override fun assumeRoleExternalId(): String? = unwrap(this).getAssumeRoleExternalId()

    /**
     * The name of the bucket.
     */
    override fun bucketName(): String = unwrap(this).getBucketName()

    /**
     * The destination object key.
     */
    override fun objectKey(): String = unwrap(this).getObjectKey()

    /**
     * The region where this asset will need to be published.
     *
     * Default: - Current region
     */
    override fun region(): String? = unwrap(this).getRegion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FileDestination {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.FileDestination):
        FileDestination = CdkObjectWrappers.wrap(cdkObject) as? FileDestination ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: FileDestination):
        software.amazon.awscdk.cloudassembly.schema.FileDestination = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloudassembly.schema.FileDestination
  }
}
