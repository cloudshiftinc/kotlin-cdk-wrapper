@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3express

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnDirectoryBucket`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3express.*;
 * CfnDirectoryBucketProps cfnDirectoryBucketProps = CfnDirectoryBucketProps.builder()
 * .dataRedundancy("dataRedundancy")
 * .locationName("locationName")
 * // the properties below are optional
 * .bucketEncryption(BucketEncryptionProperty.builder()
 * .serverSideEncryptionConfiguration(List.of(ServerSideEncryptionRuleProperty.builder()
 * .bucketKeyEnabled(false)
 * .serverSideEncryptionByDefault(ServerSideEncryptionByDefaultProperty.builder()
 * .sseAlgorithm("sseAlgorithm")
 * // the properties below are optional
 * .kmsMasterKeyId("kmsMasterKeyId")
 * .build())
 * .build()))
 * .build())
 * .bucketName("bucketName")
 * .lifecycleConfiguration(LifecycleConfigurationProperty.builder()
 * .rules(List.of(RuleProperty.builder()
 * .status("status")
 * // the properties below are optional
 * .abortIncompleteMultipartUpload(AbortIncompleteMultipartUploadProperty.builder()
 * .daysAfterInitiation(123)
 * .build())
 * .expirationInDays(123)
 * .id("id")
 * .objectSizeGreaterThan("objectSizeGreaterThan")
 * .objectSizeLessThan("objectSizeLessThan")
 * .prefix("prefix")
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-directorybucket.html)
 */
public interface CfnDirectoryBucketProps {
  /**
   * Specifies default encryption for a bucket using server-side encryption with Amazon S3 managed
   * keys (SSE-S3) or AWS KMS keys (SSE-KMS).
   *
   * For information about default encryption for directory buckets, see [Setting and monitoring
   * default encryption for directory
   * buckets](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-express-bucket-encryption.html)
   * in the *Amazon S3 User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-directorybucket.html#cfn-s3express-directorybucket-bucketencryption)
   */
  public fun bucketEncryption(): Any? = unwrap(this).getBucketEncryption()

  /**
   * A name for the bucket.
   *
   * The bucket name must contain only lowercase letters, numbers, and hyphens (-). A directory
   * bucket name must be unique in the chosen Availability Zone. The bucket name must also follow the
   * format `*bucket_base_name* -- *az_id* --x-s3` (for example, `*bucket_base_name* --
   * *usw2-az1* --x-s3` ). If you don't specify a name, AWS CloudFormation generates a unique ID and
   * uses that ID for the bucket name. For information about bucket naming restrictions, see [Directory
   * bucket naming
   * rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/directory-bucket-naming-rules.html)
   * in the *Amazon S3 User Guide* .
   *
   *
   * If you specify a name, you can't perform updates that require replacement of this resource. You
   * can perform updates that require no or some interruption. If you need to replace the resource,
   * specify a new name.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-directorybucket.html#cfn-s3express-directorybucket-bucketname)
   */
  public fun bucketName(): String? = unwrap(this).getBucketName()

  /**
   * The number of Zone (Availability Zone or Local Zone) that's used for redundancy for the bucket.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-directorybucket.html#cfn-s3express-directorybucket-dataredundancy)
   */
  public fun dataRedundancy(): String

  /**
   * Container for lifecycle rules. You can add as many as 1000 rules.
   *
   * For more information see, [Creating and managing a lifecycle configuration for directory
   * buckets](https://docs.aws.amazon.com/AmazonS3/latest/userguide/directory-buckets-objects-lifecycle.html)
   * in the *Amazon S3 User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-directorybucket.html#cfn-s3express-directorybucket-lifecycleconfiguration)
   */
  public fun lifecycleConfiguration(): Any? = unwrap(this).getLifecycleConfiguration()

  /**
   * The name of the location where the bucket will be created.
   *
   * For directory buckets, the name of the location is the Zone ID of the Availability Zone (AZ) or
   * Local Zone (LZ) where the bucket will be created. An example AZ ID value is `usw2-az1` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-directorybucket.html#cfn-s3express-directorybucket-locationname)
   */
  public fun locationName(): String

  /**
   * A builder for [CfnDirectoryBucketProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bucketEncryption Specifies default encryption for a bucket using server-side
     * encryption with Amazon S3 managed keys (SSE-S3) or AWS KMS keys (SSE-KMS).
     * For information about default encryption for directory buckets, see [Setting and monitoring
     * default encryption for directory
     * buckets](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-express-bucket-encryption.html)
     * in the *Amazon S3 User Guide* .
     */
    public fun bucketEncryption(bucketEncryption: IResolvable)

    /**
     * @param bucketEncryption Specifies default encryption for a bucket using server-side
     * encryption with Amazon S3 managed keys (SSE-S3) or AWS KMS keys (SSE-KMS).
     * For information about default encryption for directory buckets, see [Setting and monitoring
     * default encryption for directory
     * buckets](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-express-bucket-encryption.html)
     * in the *Amazon S3 User Guide* .
     */
    public fun bucketEncryption(bucketEncryption: CfnDirectoryBucket.BucketEncryptionProperty)

    /**
     * @param bucketEncryption Specifies default encryption for a bucket using server-side
     * encryption with Amazon S3 managed keys (SSE-S3) or AWS KMS keys (SSE-KMS).
     * For information about default encryption for directory buckets, see [Setting and monitoring
     * default encryption for directory
     * buckets](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-express-bucket-encryption.html)
     * in the *Amazon S3 User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("df03bd2695f56f9a7fb2168f49e43d6c4a1decb2ad6dac1883b61a732cc47b5b")
    public
        fun bucketEncryption(bucketEncryption: CfnDirectoryBucket.BucketEncryptionProperty.Builder.() -> Unit)

    /**
     * @param bucketName A name for the bucket.
     * The bucket name must contain only lowercase letters, numbers, and hyphens (-). A directory
     * bucket name must be unique in the chosen Availability Zone. The bucket name must also follow the
     * format `*bucket_base_name* -- *az_id* --x-s3` (for example, `*bucket_base_name* --
     * *usw2-az1* --x-s3` ). If you don't specify a name, AWS CloudFormation generates a unique ID and
     * uses that ID for the bucket name. For information about bucket naming restrictions, see
     * [Directory bucket naming
     * rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/directory-bucket-naming-rules.html)
     * in the *Amazon S3 User Guide* .
     *
     *
     * If you specify a name, you can't perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you need to replace the
     * resource, specify a new name.
     */
    public fun bucketName(bucketName: String)

    /**
     * @param dataRedundancy The number of Zone (Availability Zone or Local Zone) that's used for
     * redundancy for the bucket. 
     */
    public fun dataRedundancy(dataRedundancy: String)

    /**
     * @param lifecycleConfiguration Container for lifecycle rules. You can add as many as 1000
     * rules.
     * For more information see, [Creating and managing a lifecycle configuration for directory
     * buckets](https://docs.aws.amazon.com/AmazonS3/latest/userguide/directory-buckets-objects-lifecycle.html)
     * in the *Amazon S3 User Guide* .
     */
    public fun lifecycleConfiguration(lifecycleConfiguration: IResolvable)

    /**
     * @param lifecycleConfiguration Container for lifecycle rules. You can add as many as 1000
     * rules.
     * For more information see, [Creating and managing a lifecycle configuration for directory
     * buckets](https://docs.aws.amazon.com/AmazonS3/latest/userguide/directory-buckets-objects-lifecycle.html)
     * in the *Amazon S3 User Guide* .
     */
    public
        fun lifecycleConfiguration(lifecycleConfiguration: CfnDirectoryBucket.LifecycleConfigurationProperty)

    /**
     * @param lifecycleConfiguration Container for lifecycle rules. You can add as many as 1000
     * rules.
     * For more information see, [Creating and managing a lifecycle configuration for directory
     * buckets](https://docs.aws.amazon.com/AmazonS3/latest/userguide/directory-buckets-objects-lifecycle.html)
     * in the *Amazon S3 User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("33a6f948b1c19b37d1b35493eaf3a03cbca3f46b649e3ce4a5e2299eaf24e3fa")
    public
        fun lifecycleConfiguration(lifecycleConfiguration: CfnDirectoryBucket.LifecycleConfigurationProperty.Builder.() -> Unit)

    /**
     * @param locationName The name of the location where the bucket will be created. 
     * For directory buckets, the name of the location is the Zone ID of the Availability Zone (AZ)
     * or Local Zone (LZ) where the bucket will be created. An example AZ ID value is `usw2-az1` .
     */
    public fun locationName(locationName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.s3express.CfnDirectoryBucketProps.Builder =
        software.amazon.awscdk.services.s3express.CfnDirectoryBucketProps.builder()

    /**
     * @param bucketEncryption Specifies default encryption for a bucket using server-side
     * encryption with Amazon S3 managed keys (SSE-S3) or AWS KMS keys (SSE-KMS).
     * For information about default encryption for directory buckets, see [Setting and monitoring
     * default encryption for directory
     * buckets](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-express-bucket-encryption.html)
     * in the *Amazon S3 User Guide* .
     */
    override fun bucketEncryption(bucketEncryption: IResolvable) {
      cdkBuilder.bucketEncryption(bucketEncryption.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param bucketEncryption Specifies default encryption for a bucket using server-side
     * encryption with Amazon S3 managed keys (SSE-S3) or AWS KMS keys (SSE-KMS).
     * For information about default encryption for directory buckets, see [Setting and monitoring
     * default encryption for directory
     * buckets](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-express-bucket-encryption.html)
     * in the *Amazon S3 User Guide* .
     */
    override fun bucketEncryption(bucketEncryption: CfnDirectoryBucket.BucketEncryptionProperty) {
      cdkBuilder.bucketEncryption(bucketEncryption.let(CfnDirectoryBucket.BucketEncryptionProperty.Companion::unwrap))
    }

    /**
     * @param bucketEncryption Specifies default encryption for a bucket using server-side
     * encryption with Amazon S3 managed keys (SSE-S3) or AWS KMS keys (SSE-KMS).
     * For information about default encryption for directory buckets, see [Setting and monitoring
     * default encryption for directory
     * buckets](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-express-bucket-encryption.html)
     * in the *Amazon S3 User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("df03bd2695f56f9a7fb2168f49e43d6c4a1decb2ad6dac1883b61a732cc47b5b")
    override
        fun bucketEncryption(bucketEncryption: CfnDirectoryBucket.BucketEncryptionProperty.Builder.() -> Unit):
        Unit = bucketEncryption(CfnDirectoryBucket.BucketEncryptionProperty(bucketEncryption))

    /**
     * @param bucketName A name for the bucket.
     * The bucket name must contain only lowercase letters, numbers, and hyphens (-). A directory
     * bucket name must be unique in the chosen Availability Zone. The bucket name must also follow the
     * format `*bucket_base_name* -- *az_id* --x-s3` (for example, `*bucket_base_name* --
     * *usw2-az1* --x-s3` ). If you don't specify a name, AWS CloudFormation generates a unique ID and
     * uses that ID for the bucket name. For information about bucket naming restrictions, see
     * [Directory bucket naming
     * rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/directory-bucket-naming-rules.html)
     * in the *Amazon S3 User Guide* .
     *
     *
     * If you specify a name, you can't perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you need to replace the
     * resource, specify a new name.
     */
    override fun bucketName(bucketName: String) {
      cdkBuilder.bucketName(bucketName)
    }

    /**
     * @param dataRedundancy The number of Zone (Availability Zone or Local Zone) that's used for
     * redundancy for the bucket. 
     */
    override fun dataRedundancy(dataRedundancy: String) {
      cdkBuilder.dataRedundancy(dataRedundancy)
    }

    /**
     * @param lifecycleConfiguration Container for lifecycle rules. You can add as many as 1000
     * rules.
     * For more information see, [Creating and managing a lifecycle configuration for directory
     * buckets](https://docs.aws.amazon.com/AmazonS3/latest/userguide/directory-buckets-objects-lifecycle.html)
     * in the *Amazon S3 User Guide* .
     */
    override fun lifecycleConfiguration(lifecycleConfiguration: IResolvable) {
      cdkBuilder.lifecycleConfiguration(lifecycleConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param lifecycleConfiguration Container for lifecycle rules. You can add as many as 1000
     * rules.
     * For more information see, [Creating and managing a lifecycle configuration for directory
     * buckets](https://docs.aws.amazon.com/AmazonS3/latest/userguide/directory-buckets-objects-lifecycle.html)
     * in the *Amazon S3 User Guide* .
     */
    override
        fun lifecycleConfiguration(lifecycleConfiguration: CfnDirectoryBucket.LifecycleConfigurationProperty) {
      cdkBuilder.lifecycleConfiguration(lifecycleConfiguration.let(CfnDirectoryBucket.LifecycleConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param lifecycleConfiguration Container for lifecycle rules. You can add as many as 1000
     * rules.
     * For more information see, [Creating and managing a lifecycle configuration for directory
     * buckets](https://docs.aws.amazon.com/AmazonS3/latest/userguide/directory-buckets-objects-lifecycle.html)
     * in the *Amazon S3 User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("33a6f948b1c19b37d1b35493eaf3a03cbca3f46b649e3ce4a5e2299eaf24e3fa")
    override
        fun lifecycleConfiguration(lifecycleConfiguration: CfnDirectoryBucket.LifecycleConfigurationProperty.Builder.() -> Unit):
        Unit =
        lifecycleConfiguration(CfnDirectoryBucket.LifecycleConfigurationProperty(lifecycleConfiguration))

    /**
     * @param locationName The name of the location where the bucket will be created. 
     * For directory buckets, the name of the location is the Zone ID of the Availability Zone (AZ)
     * or Local Zone (LZ) where the bucket will be created. An example AZ ID value is `usw2-az1` .
     */
    override fun locationName(locationName: String) {
      cdkBuilder.locationName(locationName)
    }

    public fun build(): software.amazon.awscdk.services.s3express.CfnDirectoryBucketProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.s3express.CfnDirectoryBucketProps,
  ) : CdkObject(cdkObject),
      CfnDirectoryBucketProps {
    /**
     * Specifies default encryption for a bucket using server-side encryption with Amazon S3 managed
     * keys (SSE-S3) or AWS KMS keys (SSE-KMS).
     *
     * For information about default encryption for directory buckets, see [Setting and monitoring
     * default encryption for directory
     * buckets](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-express-bucket-encryption.html)
     * in the *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-directorybucket.html#cfn-s3express-directorybucket-bucketencryption)
     */
    override fun bucketEncryption(): Any? = unwrap(this).getBucketEncryption()

    /**
     * A name for the bucket.
     *
     * The bucket name must contain only lowercase letters, numbers, and hyphens (-). A directory
     * bucket name must be unique in the chosen Availability Zone. The bucket name must also follow the
     * format `*bucket_base_name* -- *az_id* --x-s3` (for example, `*bucket_base_name* --
     * *usw2-az1* --x-s3` ). If you don't specify a name, AWS CloudFormation generates a unique ID and
     * uses that ID for the bucket name. For information about bucket naming restrictions, see
     * [Directory bucket naming
     * rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/directory-bucket-naming-rules.html)
     * in the *Amazon S3 User Guide* .
     *
     *
     * If you specify a name, you can't perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you need to replace the
     * resource, specify a new name.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-directorybucket.html#cfn-s3express-directorybucket-bucketname)
     */
    override fun bucketName(): String? = unwrap(this).getBucketName()

    /**
     * The number of Zone (Availability Zone or Local Zone) that's used for redundancy for the
     * bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-directorybucket.html#cfn-s3express-directorybucket-dataredundancy)
     */
    override fun dataRedundancy(): String = unwrap(this).getDataRedundancy()

    /**
     * Container for lifecycle rules. You can add as many as 1000 rules.
     *
     * For more information see, [Creating and managing a lifecycle configuration for directory
     * buckets](https://docs.aws.amazon.com/AmazonS3/latest/userguide/directory-buckets-objects-lifecycle.html)
     * in the *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-directorybucket.html#cfn-s3express-directorybucket-lifecycleconfiguration)
     */
    override fun lifecycleConfiguration(): Any? = unwrap(this).getLifecycleConfiguration()

    /**
     * The name of the location where the bucket will be created.
     *
     * For directory buckets, the name of the location is the Zone ID of the Availability Zone (AZ)
     * or Local Zone (LZ) where the bucket will be created. An example AZ ID value is `usw2-az1` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-directorybucket.html#cfn-s3express-directorybucket-locationname)
     */
    override fun locationName(): String = unwrap(this).getLocationName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDirectoryBucketProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3express.CfnDirectoryBucketProps):
        CfnDirectoryBucketProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDirectoryBucketProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDirectoryBucketProps):
        software.amazon.awscdk.services.s3express.CfnDirectoryBucketProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.s3express.CfnDirectoryBucketProps
  }
}
