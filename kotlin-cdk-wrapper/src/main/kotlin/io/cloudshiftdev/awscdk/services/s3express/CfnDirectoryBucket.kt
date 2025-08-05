@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3express

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::S3Express::DirectoryBucket` resource defines an Amazon S3 directory bucket in the same
 * AWS Region where you create the AWS CloudFormation stack.
 *
 * To control how AWS CloudFormation handles the bucket when the stack is deleted, you can set a
 * deletion policy for your bucket. You can choose to *retain* the bucket or to *delete* the bucket.
 * For more information, see [DeletionPolicy
 * attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html)
 * .
 *
 *
 * You can only delete empty buckets. Deletion fails for buckets that have contents.
 *
 *
 * * **Permissions** - The required permissions for CloudFormation to use are based on the
 * operations that are performed on the stack.
 * * Create
 * * s3express:CreateBucket
 * * s3express:ListAllMyDirectoryBuckets
 * * Read
 * * s3express:ListAllMyDirectoryBuckets
 * * ec2:DescribeAvailabilityZones
 * * Delete
 * * s3express:DeleteBucket
 * * s3express:ListAllMyDirectoryBuckets
 * * List
 * * s3express:ListAllMyDirectoryBuckets
 * * PutBucketEncryption
 * * s3express:PutEncryptionConfiguration
 * * To set a directory bucket default encryption with SSE-KMS, you must also have the
 * kms:GenerateDataKey and kms:Decrypt permissions in IAM identity-based policies and AWS KMS key
 * policies for the target AWS KMS key.
 * * GetBucketEncryption
 * * s3express:GetBucketEncryption
 * * DeleteBucketEncryption
 * * s3express:PutEncryptionConfiguration
 *
 * The following operations are related to `AWS::S3Express::DirectoryBucket` :
 *
 * * [CreateBucket](https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateBucket.html)
 * *
 * [ListDirectoryBuckets](https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListDirectoryBuckets.html)
 * * [DeleteBucket](https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucket.html)
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3express.*;
 * CfnDirectoryBucket cfnDirectoryBucket = CfnDirectoryBucket.Builder.create(this,
 * "MyCfnDirectoryBucket")
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
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-directorybucket.html)
 */
public open class CfnDirectoryBucket(
  cdkObject: software.amazon.awscdk.services.s3express.CfnDirectoryBucket,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDirectoryBucketProps,
  ) :
      this(software.amazon.awscdk.services.s3express.CfnDirectoryBucket(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDirectoryBucketProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDirectoryBucketProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDirectoryBucketProps(props)
  )

  /**
   * Returns the Amazon Resource Name (ARN) of the specified bucket.
   *
   * Example: `arn:aws:s3express: *us-west-2* : *account_id* :bucket/ *bucket_base_name* --
   * *usw2-az1* --x-s3`
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Returns the code for the Availability Zone or the Local Zone where the directory bucket was
   * created.
   *
   * Example value for an Availability Zone code: *us-east-1f*
   *
   *
   * An Availability Zone code might not represent the same physical location for different AWS
   * accounts. For more information, see [Availability Zones and
   * Regions](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-express-Endpoints.html) in the
   * *Amazon S3 User Guide* .
   */
  public open fun attrAvailabilityZoneName(): String = unwrap(this).getAttrAvailabilityZoneName()

  /**
   * Specifies default encryption for a bucket using server-side encryption with Amazon S3 managed
   * keys (SSE-S3) or AWS KMS keys (SSE-KMS).
   */
  public open fun bucketEncryption(): Any? = unwrap(this).getBucketEncryption()

  /**
   * Specifies default encryption for a bucket using server-side encryption with Amazon S3 managed
   * keys (SSE-S3) or AWS KMS keys (SSE-KMS).
   */
  public open fun bucketEncryption(`value`: IResolvable) {
    unwrap(this).setBucketEncryption(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies default encryption for a bucket using server-side encryption with Amazon S3 managed
   * keys (SSE-S3) or AWS KMS keys (SSE-KMS).
   */
  public open fun bucketEncryption(`value`: BucketEncryptionProperty) {
    unwrap(this).setBucketEncryption(`value`.let(BucketEncryptionProperty.Companion::unwrap))
  }

  /**
   * Specifies default encryption for a bucket using server-side encryption with Amazon S3 managed
   * keys (SSE-S3) or AWS KMS keys (SSE-KMS).
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1aa915d1b8b0f1959611a49d470c41d880fce9910f3089adf9032d2f20af3178")
  public open fun bucketEncryption(`value`: BucketEncryptionProperty.Builder.() -> Unit): Unit =
      bucketEncryption(BucketEncryptionProperty(`value`))

  /**
   * A name for the bucket.
   */
  public open fun bucketName(): String? = unwrap(this).getBucketName()

  /**
   * A name for the bucket.
   */
  public open fun bucketName(`value`: String) {
    unwrap(this).setBucketName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The number of Zone (Availability Zone or Local Zone) that's used for redundancy for the bucket.
   */
  public open fun dataRedundancy(): String = unwrap(this).getDataRedundancy()

  /**
   * The number of Zone (Availability Zone or Local Zone) that's used for redundancy for the bucket.
   */
  public open fun dataRedundancy(`value`: String) {
    unwrap(this).setDataRedundancy(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Container for lifecycle rules.
   *
   * You can add as many as 1000 rules.
   */
  public open fun lifecycleConfiguration(): Any? = unwrap(this).getLifecycleConfiguration()

  /**
   * Container for lifecycle rules.
   *
   * You can add as many as 1000 rules.
   */
  public open fun lifecycleConfiguration(`value`: IResolvable) {
    unwrap(this).setLifecycleConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Container for lifecycle rules.
   *
   * You can add as many as 1000 rules.
   */
  public open fun lifecycleConfiguration(`value`: LifecycleConfigurationProperty) {
    unwrap(this).setLifecycleConfiguration(`value`.let(LifecycleConfigurationProperty.Companion::unwrap))
  }

  /**
   * Container for lifecycle rules.
   *
   * You can add as many as 1000 rules.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3f6abb7cbf964cd97059d8500b88c4ac487a138681e2161765611190e1974e02")
  public open
      fun lifecycleConfiguration(`value`: LifecycleConfigurationProperty.Builder.() -> Unit): Unit =
      lifecycleConfiguration(LifecycleConfigurationProperty(`value`))

  /**
   * The name of the location where the bucket will be created.
   */
  public open fun locationName(): String = unwrap(this).getLocationName()

  /**
   * The name of the location where the bucket will be created.
   */
  public open fun locationName(`value`: String) {
    unwrap(this).setLocationName(`value`)
  }

  /**
   * An array of tags that you can apply to the S3 directory bucket.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An array of tags that you can apply to the S3 directory bucket.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An array of tags that you can apply to the S3 directory bucket.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.s3express.CfnDirectoryBucket].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param bucketEncryption Specifies default encryption for a bucket using server-side
     * encryption with Amazon S3 managed keys (SSE-S3) or AWS KMS keys (SSE-KMS). 
     */
    public fun bucketEncryption(bucketEncryption: IResolvable)

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
     * @param bucketEncryption Specifies default encryption for a bucket using server-side
     * encryption with Amazon S3 managed keys (SSE-S3) or AWS KMS keys (SSE-KMS). 
     */
    public fun bucketEncryption(bucketEncryption: BucketEncryptionProperty)

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
     * @param bucketEncryption Specifies default encryption for a bucket using server-side
     * encryption with Amazon S3 managed keys (SSE-S3) or AWS KMS keys (SSE-KMS). 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("30cd8751431fb82aa29cd4c4213b8bb826eda62029d79884a84bdc7cab1eb6e1")
    public fun bucketEncryption(bucketEncryption: BucketEncryptionProperty.Builder.() -> Unit)

    /**
     * A name for the bucket.
     *
     * The bucket name must contain only lowercase letters, numbers, and hyphens (-). A directory
     * bucket name must be unique in the chosen Zone (Availability Zone or Local Zone). The bucket name
     * must also follow the format `*bucket_base_name* -- *zone_id* --x-s3` (for example,
     * `*bucket_base_name* -- *usw2-az1* --x-s3` ). If you don't specify a name, AWS CloudFormation
     * generates a unique ID and uses that ID for the bucket name. For information about bucket naming
     * restrictions, see [Directory bucket naming
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
     * @param bucketName A name for the bucket. 
     */
    public fun bucketName(bucketName: String)

    /**
     * The number of Zone (Availability Zone or Local Zone) that's used for redundancy for the
     * bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-directorybucket.html#cfn-s3express-directorybucket-dataredundancy)
     * @param dataRedundancy The number of Zone (Availability Zone or Local Zone) that's used for
     * redundancy for the bucket. 
     */
    public fun dataRedundancy(dataRedundancy: String)

    /**
     * Container for lifecycle rules. You can add as many as 1000 rules.
     *
     * For more information see, [Creating and managing a lifecycle configuration for directory
     * buckets](https://docs.aws.amazon.com/AmazonS3/latest/userguide/directory-buckets-objects-lifecycle.html)
     * in the *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-directorybucket.html#cfn-s3express-directorybucket-lifecycleconfiguration)
     * @param lifecycleConfiguration Container for lifecycle rules. You can add as many as 1000
     * rules. 
     */
    public fun lifecycleConfiguration(lifecycleConfiguration: IResolvable)

    /**
     * Container for lifecycle rules. You can add as many as 1000 rules.
     *
     * For more information see, [Creating and managing a lifecycle configuration for directory
     * buckets](https://docs.aws.amazon.com/AmazonS3/latest/userguide/directory-buckets-objects-lifecycle.html)
     * in the *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-directorybucket.html#cfn-s3express-directorybucket-lifecycleconfiguration)
     * @param lifecycleConfiguration Container for lifecycle rules. You can add as many as 1000
     * rules. 
     */
    public fun lifecycleConfiguration(lifecycleConfiguration: LifecycleConfigurationProperty)

    /**
     * Container for lifecycle rules. You can add as many as 1000 rules.
     *
     * For more information see, [Creating and managing a lifecycle configuration for directory
     * buckets](https://docs.aws.amazon.com/AmazonS3/latest/userguide/directory-buckets-objects-lifecycle.html)
     * in the *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-directorybucket.html#cfn-s3express-directorybucket-lifecycleconfiguration)
     * @param lifecycleConfiguration Container for lifecycle rules. You can add as many as 1000
     * rules. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d3840549484f8dbd948622b9e14e67986dc6ac62698c91c9a002dc5819405e0")
    public
        fun lifecycleConfiguration(lifecycleConfiguration: LifecycleConfigurationProperty.Builder.() -> Unit)

    /**
     * The name of the location where the bucket will be created.
     *
     * For directory buckets, the name of the location is the Zone ID of the Availability Zone (AZ)
     * or Local Zone (LZ) where the bucket will be created. An example AZ ID value is `usw2-az1` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-directorybucket.html#cfn-s3express-directorybucket-locationname)
     * @param locationName The name of the location where the bucket will be created. 
     */
    public fun locationName(locationName: String)

    /**
     * An array of tags that you can apply to the S3 directory bucket.
     *
     * Tags are key-value pairs of metadata used to categorize and organize your buckets, track
     * costs, and control access. For more information, see [Using tags with directory
     * buckets](https://docs.aws.amazon.com/AmazonS3/latest/userguide/directory-buckets-tagging.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-directorybucket.html#cfn-s3express-directorybucket-tags)
     * @param tags An array of tags that you can apply to the S3 directory bucket. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of tags that you can apply to the S3 directory bucket.
     *
     * Tags are key-value pairs of metadata used to categorize and organize your buckets, track
     * costs, and control access. For more information, see [Using tags with directory
     * buckets](https://docs.aws.amazon.com/AmazonS3/latest/userguide/directory-buckets-tagging.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-directorybucket.html#cfn-s3express-directorybucket-tags)
     * @param tags An array of tags that you can apply to the S3 directory bucket. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3express.CfnDirectoryBucket.Builder =
        software.amazon.awscdk.services.s3express.CfnDirectoryBucket.Builder.create(scope, id)

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
     * @param bucketEncryption Specifies default encryption for a bucket using server-side
     * encryption with Amazon S3 managed keys (SSE-S3) or AWS KMS keys (SSE-KMS). 
     */
    override fun bucketEncryption(bucketEncryption: IResolvable) {
      cdkBuilder.bucketEncryption(bucketEncryption.let(IResolvable.Companion::unwrap))
    }

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
     * @param bucketEncryption Specifies default encryption for a bucket using server-side
     * encryption with Amazon S3 managed keys (SSE-S3) or AWS KMS keys (SSE-KMS). 
     */
    override fun bucketEncryption(bucketEncryption: BucketEncryptionProperty) {
      cdkBuilder.bucketEncryption(bucketEncryption.let(BucketEncryptionProperty.Companion::unwrap))
    }

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
     * @param bucketEncryption Specifies default encryption for a bucket using server-side
     * encryption with Amazon S3 managed keys (SSE-S3) or AWS KMS keys (SSE-KMS). 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("30cd8751431fb82aa29cd4c4213b8bb826eda62029d79884a84bdc7cab1eb6e1")
    override fun bucketEncryption(bucketEncryption: BucketEncryptionProperty.Builder.() -> Unit):
        Unit = bucketEncryption(BucketEncryptionProperty(bucketEncryption))

    /**
     * A name for the bucket.
     *
     * The bucket name must contain only lowercase letters, numbers, and hyphens (-). A directory
     * bucket name must be unique in the chosen Zone (Availability Zone or Local Zone). The bucket name
     * must also follow the format `*bucket_base_name* -- *zone_id* --x-s3` (for example,
     * `*bucket_base_name* -- *usw2-az1* --x-s3` ). If you don't specify a name, AWS CloudFormation
     * generates a unique ID and uses that ID for the bucket name. For information about bucket naming
     * restrictions, see [Directory bucket naming
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
     * @param bucketName A name for the bucket. 
     */
    override fun bucketName(bucketName: String) {
      cdkBuilder.bucketName(bucketName)
    }

    /**
     * The number of Zone (Availability Zone or Local Zone) that's used for redundancy for the
     * bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-directorybucket.html#cfn-s3express-directorybucket-dataredundancy)
     * @param dataRedundancy The number of Zone (Availability Zone or Local Zone) that's used for
     * redundancy for the bucket. 
     */
    override fun dataRedundancy(dataRedundancy: String) {
      cdkBuilder.dataRedundancy(dataRedundancy)
    }

    /**
     * Container for lifecycle rules. You can add as many as 1000 rules.
     *
     * For more information see, [Creating and managing a lifecycle configuration for directory
     * buckets](https://docs.aws.amazon.com/AmazonS3/latest/userguide/directory-buckets-objects-lifecycle.html)
     * in the *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-directorybucket.html#cfn-s3express-directorybucket-lifecycleconfiguration)
     * @param lifecycleConfiguration Container for lifecycle rules. You can add as many as 1000
     * rules. 
     */
    override fun lifecycleConfiguration(lifecycleConfiguration: IResolvable) {
      cdkBuilder.lifecycleConfiguration(lifecycleConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Container for lifecycle rules. You can add as many as 1000 rules.
     *
     * For more information see, [Creating and managing a lifecycle configuration for directory
     * buckets](https://docs.aws.amazon.com/AmazonS3/latest/userguide/directory-buckets-objects-lifecycle.html)
     * in the *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-directorybucket.html#cfn-s3express-directorybucket-lifecycleconfiguration)
     * @param lifecycleConfiguration Container for lifecycle rules. You can add as many as 1000
     * rules. 
     */
    override fun lifecycleConfiguration(lifecycleConfiguration: LifecycleConfigurationProperty) {
      cdkBuilder.lifecycleConfiguration(lifecycleConfiguration.let(LifecycleConfigurationProperty.Companion::unwrap))
    }

    /**
     * Container for lifecycle rules. You can add as many as 1000 rules.
     *
     * For more information see, [Creating and managing a lifecycle configuration for directory
     * buckets](https://docs.aws.amazon.com/AmazonS3/latest/userguide/directory-buckets-objects-lifecycle.html)
     * in the *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-directorybucket.html#cfn-s3express-directorybucket-lifecycleconfiguration)
     * @param lifecycleConfiguration Container for lifecycle rules. You can add as many as 1000
     * rules. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d3840549484f8dbd948622b9e14e67986dc6ac62698c91c9a002dc5819405e0")
    override
        fun lifecycleConfiguration(lifecycleConfiguration: LifecycleConfigurationProperty.Builder.() -> Unit):
        Unit = lifecycleConfiguration(LifecycleConfigurationProperty(lifecycleConfiguration))

    /**
     * The name of the location where the bucket will be created.
     *
     * For directory buckets, the name of the location is the Zone ID of the Availability Zone (AZ)
     * or Local Zone (LZ) where the bucket will be created. An example AZ ID value is `usw2-az1` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-directorybucket.html#cfn-s3express-directorybucket-locationname)
     * @param locationName The name of the location where the bucket will be created. 
     */
    override fun locationName(locationName: String) {
      cdkBuilder.locationName(locationName)
    }

    /**
     * An array of tags that you can apply to the S3 directory bucket.
     *
     * Tags are key-value pairs of metadata used to categorize and organize your buckets, track
     * costs, and control access. For more information, see [Using tags with directory
     * buckets](https://docs.aws.amazon.com/AmazonS3/latest/userguide/directory-buckets-tagging.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-directorybucket.html#cfn-s3express-directorybucket-tags)
     * @param tags An array of tags that you can apply to the S3 directory bucket. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An array of tags that you can apply to the S3 directory bucket.
     *
     * Tags are key-value pairs of metadata used to categorize and organize your buckets, track
     * costs, and control access. For more information, see [Using tags with directory
     * buckets](https://docs.aws.amazon.com/AmazonS3/latest/userguide/directory-buckets-tagging.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-directorybucket.html#cfn-s3express-directorybucket-tags)
     * @param tags An array of tags that you can apply to the S3 directory bucket. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.s3express.CfnDirectoryBucket =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.s3express.CfnDirectoryBucket.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDirectoryBucket {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDirectoryBucket(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3express.CfnDirectoryBucket):
        CfnDirectoryBucket = CfnDirectoryBucket(cdkObject)

    internal fun unwrap(wrapped: CfnDirectoryBucket):
        software.amazon.awscdk.services.s3express.CfnDirectoryBucket = wrapped.cdkObject as
        software.amazon.awscdk.services.s3express.CfnDirectoryBucket
  }

  /**
   * Specifies the days since the initiation of an incomplete multipart upload that Amazon S3 will
   * wait before permanently removing all parts of the upload.
   *
   * For more information, see [Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle
   * Configuration](https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config)
   * in the *Amazon S3 User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.s3express.*;
   * AbortIncompleteMultipartUploadProperty abortIncompleteMultipartUploadProperty =
   * AbortIncompleteMultipartUploadProperty.builder()
   * .daysAfterInitiation(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-directorybucket-abortincompletemultipartupload.html)
   */
  public interface AbortIncompleteMultipartUploadProperty {
    /**
     * Specifies the number of days after which Amazon S3 aborts an incomplete multipart upload.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-directorybucket-abortincompletemultipartupload.html#cfn-s3express-directorybucket-abortincompletemultipartupload-daysafterinitiation)
     */
    public fun daysAfterInitiation(): Number

    /**
     * A builder for [AbortIncompleteMultipartUploadProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param daysAfterInitiation Specifies the number of days after which Amazon S3 aborts an
       * incomplete multipart upload. 
       */
      public fun daysAfterInitiation(daysAfterInitiation: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3express.CfnDirectoryBucket.AbortIncompleteMultipartUploadProperty.Builder
          =
          software.amazon.awscdk.services.s3express.CfnDirectoryBucket.AbortIncompleteMultipartUploadProperty.builder()

      /**
       * @param daysAfterInitiation Specifies the number of days after which Amazon S3 aborts an
       * incomplete multipart upload. 
       */
      override fun daysAfterInitiation(daysAfterInitiation: Number) {
        cdkBuilder.daysAfterInitiation(daysAfterInitiation)
      }

      public fun build():
          software.amazon.awscdk.services.s3express.CfnDirectoryBucket.AbortIncompleteMultipartUploadProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.s3express.CfnDirectoryBucket.AbortIncompleteMultipartUploadProperty,
    ) : CdkObject(cdkObject),
        AbortIncompleteMultipartUploadProperty {
      /**
       * Specifies the number of days after which Amazon S3 aborts an incomplete multipart upload.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-directorybucket-abortincompletemultipartupload.html#cfn-s3express-directorybucket-abortincompletemultipartupload-daysafterinitiation)
       */
      override fun daysAfterInitiation(): Number = unwrap(this).getDaysAfterInitiation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AbortIncompleteMultipartUploadProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3express.CfnDirectoryBucket.AbortIncompleteMultipartUploadProperty):
          AbortIncompleteMultipartUploadProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AbortIncompleteMultipartUploadProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AbortIncompleteMultipartUploadProperty):
          software.amazon.awscdk.services.s3express.CfnDirectoryBucket.AbortIncompleteMultipartUploadProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.s3express.CfnDirectoryBucket.AbortIncompleteMultipartUploadProperty
    }
  }

  /**
   * Specifies default encryption for a bucket using server-side encryption with Amazon S3 managed
   * keys (SSE-S3) or AWS KMS keys (SSE-KMS).
   *
   * For information about default encryption for directory buckets, see [Setting and monitoring
   * default encryption for directory
   * buckets](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-express-bucket-encryption.html)
   * in the *Amazon S3 User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.s3express.*;
   * BucketEncryptionProperty bucketEncryptionProperty = BucketEncryptionProperty.builder()
   * .serverSideEncryptionConfiguration(List.of(ServerSideEncryptionRuleProperty.builder()
   * .bucketKeyEnabled(false)
   * .serverSideEncryptionByDefault(ServerSideEncryptionByDefaultProperty.builder()
   * .sseAlgorithm("sseAlgorithm")
   * // the properties below are optional
   * .kmsMasterKeyId("kmsMasterKeyId")
   * .build())
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-directorybucket-bucketencryption.html)
   */
  public interface BucketEncryptionProperty {
    /**
     * Specifies the default server-side-encryption configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-directorybucket-bucketencryption.html#cfn-s3express-directorybucket-bucketencryption-serversideencryptionconfiguration)
     */
    public fun serverSideEncryptionConfiguration(): Any

    /**
     * A builder for [BucketEncryptionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param serverSideEncryptionConfiguration Specifies the default server-side-encryption
       * configuration. 
       */
      public fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable)

      /**
       * @param serverSideEncryptionConfiguration Specifies the default server-side-encryption
       * configuration. 
       */
      public fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: List<Any>)

      /**
       * @param serverSideEncryptionConfiguration Specifies the default server-side-encryption
       * configuration. 
       */
      public fun serverSideEncryptionConfiguration(vararg serverSideEncryptionConfiguration: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3express.CfnDirectoryBucket.BucketEncryptionProperty.Builder
          =
          software.amazon.awscdk.services.s3express.CfnDirectoryBucket.BucketEncryptionProperty.builder()

      /**
       * @param serverSideEncryptionConfiguration Specifies the default server-side-encryption
       * configuration. 
       */
      override
          fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable) {
        cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param serverSideEncryptionConfiguration Specifies the default server-side-encryption
       * configuration. 
       */
      override fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: List<Any>) {
        cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param serverSideEncryptionConfiguration Specifies the default server-side-encryption
       * configuration. 
       */
      override fun serverSideEncryptionConfiguration(vararg serverSideEncryptionConfiguration: Any):
          Unit = serverSideEncryptionConfiguration(serverSideEncryptionConfiguration.toList())

      public fun build():
          software.amazon.awscdk.services.s3express.CfnDirectoryBucket.BucketEncryptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.s3express.CfnDirectoryBucket.BucketEncryptionProperty,
    ) : CdkObject(cdkObject),
        BucketEncryptionProperty {
      /**
       * Specifies the default server-side-encryption configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-directorybucket-bucketencryption.html#cfn-s3express-directorybucket-bucketencryption-serversideencryptionconfiguration)
       */
      override fun serverSideEncryptionConfiguration(): Any =
          unwrap(this).getServerSideEncryptionConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BucketEncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3express.CfnDirectoryBucket.BucketEncryptionProperty):
          BucketEncryptionProperty = CdkObjectWrappers.wrap(cdkObject) as? BucketEncryptionProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: BucketEncryptionProperty):
          software.amazon.awscdk.services.s3express.CfnDirectoryBucket.BucketEncryptionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.s3express.CfnDirectoryBucket.BucketEncryptionProperty
    }
  }

  /**
   * Container for lifecycle rules. You can add as many as 1000 rules.
   *
   * For more information see, [Creating and managing a lifecycle configuration for directory
   * buckets](https://docs.aws.amazon.com/AmazonS3/latest/userguide/directory-buckets-objects-lifecycle.html)
   * in the *Amazon S3 User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.s3express.*;
   * LifecycleConfigurationProperty lifecycleConfigurationProperty =
   * LifecycleConfigurationProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-directorybucket-lifecycleconfiguration.html)
   */
  public interface LifecycleConfigurationProperty {
    /**
     * A lifecycle rule for individual objects in an Amazon S3 Express bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-directorybucket-lifecycleconfiguration.html#cfn-s3express-directorybucket-lifecycleconfiguration-rules)
     */
    public fun rules(): Any

    /**
     * A builder for [LifecycleConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param rules A lifecycle rule for individual objects in an Amazon S3 Express bucket. 
       */
      public fun rules(rules: IResolvable)

      /**
       * @param rules A lifecycle rule for individual objects in an Amazon S3 Express bucket. 
       */
      public fun rules(rules: List<Any>)

      /**
       * @param rules A lifecycle rule for individual objects in an Amazon S3 Express bucket. 
       */
      public fun rules(vararg rules: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3express.CfnDirectoryBucket.LifecycleConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.s3express.CfnDirectoryBucket.LifecycleConfigurationProperty.builder()

      /**
       * @param rules A lifecycle rule for individual objects in an Amazon S3 Express bucket. 
       */
      override fun rules(rules: IResolvable) {
        cdkBuilder.rules(rules.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param rules A lifecycle rule for individual objects in an Amazon S3 Express bucket. 
       */
      override fun rules(rules: List<Any>) {
        cdkBuilder.rules(rules.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param rules A lifecycle rule for individual objects in an Amazon S3 Express bucket. 
       */
      override fun rules(vararg rules: Any): Unit = rules(rules.toList())

      public fun build():
          software.amazon.awscdk.services.s3express.CfnDirectoryBucket.LifecycleConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.s3express.CfnDirectoryBucket.LifecycleConfigurationProperty,
    ) : CdkObject(cdkObject),
        LifecycleConfigurationProperty {
      /**
       * A lifecycle rule for individual objects in an Amazon S3 Express bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-directorybucket-lifecycleconfiguration.html#cfn-s3express-directorybucket-lifecycleconfiguration-rules)
       */
      override fun rules(): Any = unwrap(this).getRules()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LifecycleConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3express.CfnDirectoryBucket.LifecycleConfigurationProperty):
          LifecycleConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LifecycleConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LifecycleConfigurationProperty):
          software.amazon.awscdk.services.s3express.CfnDirectoryBucket.LifecycleConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.s3express.CfnDirectoryBucket.LifecycleConfigurationProperty
    }
  }

  /**
   * Specifies lifecycle rules for an Amazon S3 bucket.
   *
   * For more information, see [Put Bucket Lifecycle
   * Configuration](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTlifecycle.html) in the
   * *Amazon S3 API Reference* . For examples, see [Put Bucket Lifecycle Configuration
   * Examples](https://docs.aws.amazon.com//AmazonS3/latest/API/API_PutBucketLifecycleConfiguration.html#API_PutBucketLifecycleConfiguration_Examples)
   * .
   *
   * You must specify at least one of the following properties: `AbortIncompleteMultipartUpload` ,
   * or `ExpirationInDays` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.s3express.*;
   * RuleProperty ruleProperty = RuleProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-directorybucket-rule.html)
   */
  public interface RuleProperty {
    /**
     * Specifies the days since the initiation of an incomplete multipart upload that Amazon S3 will
     * wait before permanently removing all parts of the upload.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-directorybucket-rule.html#cfn-s3express-directorybucket-rule-abortincompletemultipartupload)
     */
    public fun abortIncompleteMultipartUpload(): Any? =
        unwrap(this).getAbortIncompleteMultipartUpload()

    /**
     * Indicates the number of days after creation when objects are deleted from Amazon S3 and
     * Amazon S3 Glacier.
     *
     * If you specify an expiration and transition time, you must use the same time unit for both
     * properties (either in days or by date). The expiration time must also be later than the
     * transition time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-directorybucket-rule.html#cfn-s3express-directorybucket-rule-expirationindays)
     */
    public fun expirationInDays(): Number? = unwrap(this).getExpirationInDays()

    /**
     * Unique identifier for the rule.
     *
     * The value can't be longer than 255 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-directorybucket-rule.html#cfn-s3express-directorybucket-rule-id)
     */
    public fun id(): String? = unwrap(this).getId()

    /**
     * Specifies the minimum object size in bytes for this rule to apply to.
     *
     * Objects must be larger than this value in bytes. For more information about size based rules,
     * see [Lifecycle configuration using size-based
     * rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/lifecycle-configuration-examples.html#lc-size-rules)
     * in the *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-directorybucket-rule.html#cfn-s3express-directorybucket-rule-objectsizegreaterthan)
     */
    public fun objectSizeGreaterThan(): String? = unwrap(this).getObjectSizeGreaterThan()

    /**
     * Specifies the maximum object size in bytes for this rule to apply to.
     *
     * Objects must be smaller than this value in bytes. For more information about sized based
     * rules, see [Lifecycle configuration using size-based
     * rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/lifecycle-configuration-examples.html#lc-size-rules)
     * in the *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-directorybucket-rule.html#cfn-s3express-directorybucket-rule-objectsizelessthan)
     */
    public fun objectSizeLessThan(): String? = unwrap(this).getObjectSizeLessThan()

    /**
     * Object key prefix that identifies one or more objects to which this rule applies.
     *
     *
     * Replacement must be made for object keys containing special characters (such as carriage
     * returns) when using XML requests. For more information, see [XML related object key
     * constraints](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-directorybucket-rule.html#cfn-s3express-directorybucket-rule-prefix)
     */
    public fun prefix(): String? = unwrap(this).getPrefix()

    /**
     * If `Enabled` , the rule is currently being applied.
     *
     * If `Disabled` , the rule is not currently being applied.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-directorybucket-rule.html#cfn-s3express-directorybucket-rule-status)
     */
    public fun status(): String

    /**
     * A builder for [RuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param abortIncompleteMultipartUpload Specifies the days since the initiation of an
       * incomplete multipart upload that Amazon S3 will wait before permanently removing all parts of
       * the upload.
       */
      public fun abortIncompleteMultipartUpload(abortIncompleteMultipartUpload: IResolvable)

      /**
       * @param abortIncompleteMultipartUpload Specifies the days since the initiation of an
       * incomplete multipart upload that Amazon S3 will wait before permanently removing all parts of
       * the upload.
       */
      public
          fun abortIncompleteMultipartUpload(abortIncompleteMultipartUpload: AbortIncompleteMultipartUploadProperty)

      /**
       * @param abortIncompleteMultipartUpload Specifies the days since the initiation of an
       * incomplete multipart upload that Amazon S3 will wait before permanently removing all parts of
       * the upload.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("db85fdb175993929f30b19cbf3d1de9343501a83c6045a55d2f57d747dd26ef9")
      public
          fun abortIncompleteMultipartUpload(abortIncompleteMultipartUpload: AbortIncompleteMultipartUploadProperty.Builder.() -> Unit)

      /**
       * @param expirationInDays Indicates the number of days after creation when objects are
       * deleted from Amazon S3 and Amazon S3 Glacier.
       * If you specify an expiration and transition time, you must use the same time unit for both
       * properties (either in days or by date). The expiration time must also be later than the
       * transition time.
       */
      public fun expirationInDays(expirationInDays: Number)

      /**
       * @param id Unique identifier for the rule.
       * The value can't be longer than 255 characters.
       */
      public fun id(id: String)

      /**
       * @param objectSizeGreaterThan Specifies the minimum object size in bytes for this rule to
       * apply to.
       * Objects must be larger than this value in bytes. For more information about size based
       * rules, see [Lifecycle configuration using size-based
       * rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/lifecycle-configuration-examples.html#lc-size-rules)
       * in the *Amazon S3 User Guide* .
       */
      public fun objectSizeGreaterThan(objectSizeGreaterThan: String)

      /**
       * @param objectSizeLessThan Specifies the maximum object size in bytes for this rule to apply
       * to.
       * Objects must be smaller than this value in bytes. For more information about sized based
       * rules, see [Lifecycle configuration using size-based
       * rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/lifecycle-configuration-examples.html#lc-size-rules)
       * in the *Amazon S3 User Guide* .
       */
      public fun objectSizeLessThan(objectSizeLessThan: String)

      /**
       * @param prefix Object key prefix that identifies one or more objects to which this rule
       * applies.
       *
       * Replacement must be made for object keys containing special characters (such as carriage
       * returns) when using XML requests. For more information, see [XML related object key
       * constraints](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints)
       * .
       */
      public fun prefix(prefix: String)

      /**
       * @param status If `Enabled` , the rule is currently being applied. 
       * If `Disabled` , the rule is not currently being applied.
       */
      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3express.CfnDirectoryBucket.RuleProperty.Builder =
          software.amazon.awscdk.services.s3express.CfnDirectoryBucket.RuleProperty.builder()

      /**
       * @param abortIncompleteMultipartUpload Specifies the days since the initiation of an
       * incomplete multipart upload that Amazon S3 will wait before permanently removing all parts of
       * the upload.
       */
      override fun abortIncompleteMultipartUpload(abortIncompleteMultipartUpload: IResolvable) {
        cdkBuilder.abortIncompleteMultipartUpload(abortIncompleteMultipartUpload.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param abortIncompleteMultipartUpload Specifies the days since the initiation of an
       * incomplete multipart upload that Amazon S3 will wait before permanently removing all parts of
       * the upload.
       */
      override
          fun abortIncompleteMultipartUpload(abortIncompleteMultipartUpload: AbortIncompleteMultipartUploadProperty) {
        cdkBuilder.abortIncompleteMultipartUpload(abortIncompleteMultipartUpload.let(AbortIncompleteMultipartUploadProperty.Companion::unwrap))
      }

      /**
       * @param abortIncompleteMultipartUpload Specifies the days since the initiation of an
       * incomplete multipart upload that Amazon S3 will wait before permanently removing all parts of
       * the upload.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("db85fdb175993929f30b19cbf3d1de9343501a83c6045a55d2f57d747dd26ef9")
      override
          fun abortIncompleteMultipartUpload(abortIncompleteMultipartUpload: AbortIncompleteMultipartUploadProperty.Builder.() -> Unit):
          Unit =
          abortIncompleteMultipartUpload(AbortIncompleteMultipartUploadProperty(abortIncompleteMultipartUpload))

      /**
       * @param expirationInDays Indicates the number of days after creation when objects are
       * deleted from Amazon S3 and Amazon S3 Glacier.
       * If you specify an expiration and transition time, you must use the same time unit for both
       * properties (either in days or by date). The expiration time must also be later than the
       * transition time.
       */
      override fun expirationInDays(expirationInDays: Number) {
        cdkBuilder.expirationInDays(expirationInDays)
      }

      /**
       * @param id Unique identifier for the rule.
       * The value can't be longer than 255 characters.
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param objectSizeGreaterThan Specifies the minimum object size in bytes for this rule to
       * apply to.
       * Objects must be larger than this value in bytes. For more information about size based
       * rules, see [Lifecycle configuration using size-based
       * rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/lifecycle-configuration-examples.html#lc-size-rules)
       * in the *Amazon S3 User Guide* .
       */
      override fun objectSizeGreaterThan(objectSizeGreaterThan: String) {
        cdkBuilder.objectSizeGreaterThan(objectSizeGreaterThan)
      }

      /**
       * @param objectSizeLessThan Specifies the maximum object size in bytes for this rule to apply
       * to.
       * Objects must be smaller than this value in bytes. For more information about sized based
       * rules, see [Lifecycle configuration using size-based
       * rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/lifecycle-configuration-examples.html#lc-size-rules)
       * in the *Amazon S3 User Guide* .
       */
      override fun objectSizeLessThan(objectSizeLessThan: String) {
        cdkBuilder.objectSizeLessThan(objectSizeLessThan)
      }

      /**
       * @param prefix Object key prefix that identifies one or more objects to which this rule
       * applies.
       *
       * Replacement must be made for object keys containing special characters (such as carriage
       * returns) when using XML requests. For more information, see [XML related object key
       * constraints](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints)
       * .
       */
      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      /**
       * @param status If `Enabled` , the rule is currently being applied. 
       * If `Disabled` , the rule is not currently being applied.
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build(): software.amazon.awscdk.services.s3express.CfnDirectoryBucket.RuleProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.s3express.CfnDirectoryBucket.RuleProperty,
    ) : CdkObject(cdkObject),
        RuleProperty {
      /**
       * Specifies the days since the initiation of an incomplete multipart upload that Amazon S3
       * will wait before permanently removing all parts of the upload.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-directorybucket-rule.html#cfn-s3express-directorybucket-rule-abortincompletemultipartupload)
       */
      override fun abortIncompleteMultipartUpload(): Any? =
          unwrap(this).getAbortIncompleteMultipartUpload()

      /**
       * Indicates the number of days after creation when objects are deleted from Amazon S3 and
       * Amazon S3 Glacier.
       *
       * If you specify an expiration and transition time, you must use the same time unit for both
       * properties (either in days or by date). The expiration time must also be later than the
       * transition time.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-directorybucket-rule.html#cfn-s3express-directorybucket-rule-expirationindays)
       */
      override fun expirationInDays(): Number? = unwrap(this).getExpirationInDays()

      /**
       * Unique identifier for the rule.
       *
       * The value can't be longer than 255 characters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-directorybucket-rule.html#cfn-s3express-directorybucket-rule-id)
       */
      override fun id(): String? = unwrap(this).getId()

      /**
       * Specifies the minimum object size in bytes for this rule to apply to.
       *
       * Objects must be larger than this value in bytes. For more information about size based
       * rules, see [Lifecycle configuration using size-based
       * rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/lifecycle-configuration-examples.html#lc-size-rules)
       * in the *Amazon S3 User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-directorybucket-rule.html#cfn-s3express-directorybucket-rule-objectsizegreaterthan)
       */
      override fun objectSizeGreaterThan(): String? = unwrap(this).getObjectSizeGreaterThan()

      /**
       * Specifies the maximum object size in bytes for this rule to apply to.
       *
       * Objects must be smaller than this value in bytes. For more information about sized based
       * rules, see [Lifecycle configuration using size-based
       * rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/lifecycle-configuration-examples.html#lc-size-rules)
       * in the *Amazon S3 User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-directorybucket-rule.html#cfn-s3express-directorybucket-rule-objectsizelessthan)
       */
      override fun objectSizeLessThan(): String? = unwrap(this).getObjectSizeLessThan()

      /**
       * Object key prefix that identifies one or more objects to which this rule applies.
       *
       *
       * Replacement must be made for object keys containing special characters (such as carriage
       * returns) when using XML requests. For more information, see [XML related object key
       * constraints](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints)
       * .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-directorybucket-rule.html#cfn-s3express-directorybucket-rule-prefix)
       */
      override fun prefix(): String? = unwrap(this).getPrefix()

      /**
       * If `Enabled` , the rule is currently being applied.
       *
       * If `Disabled` , the rule is not currently being applied.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-directorybucket-rule.html#cfn-s3express-directorybucket-rule-status)
       */
      override fun status(): String = unwrap(this).getStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3express.CfnDirectoryBucket.RuleProperty):
          RuleProperty = CdkObjectWrappers.wrap(cdkObject) as? RuleProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleProperty):
          software.amazon.awscdk.services.s3express.CfnDirectoryBucket.RuleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3express.CfnDirectoryBucket.RuleProperty
    }
  }

  /**
   * Describes the default server-side encryption to apply to new objects in the bucket.
   *
   * If a PUT Object request doesn't specify any server-side encryption, this default encryption
   * will be applied. For more information, see
   * [PutBucketEncryption](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTencryption.html)
   * in the *Amazon S3 API Reference* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.s3express.*;
   * ServerSideEncryptionByDefaultProperty serverSideEncryptionByDefaultProperty =
   * ServerSideEncryptionByDefaultProperty.builder()
   * .sseAlgorithm("sseAlgorithm")
   * // the properties below are optional
   * .kmsMasterKeyId("kmsMasterKeyId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-directorybucket-serversideencryptionbydefault.html)
   */
  public interface ServerSideEncryptionByDefaultProperty {
    /**
     * AWS Key Management Service (KMS) customer managed key ID to use for the default encryption.
     *
     * This parameter is allowed only if `SSEAlgorithm` is set to `aws:kms` .
     *
     * You can specify this parameter with the key ID or the Amazon Resource Name (ARN) of the KMS
     * key. You can’t use the key alias of the KMS key.
     *
     * * Key ID: `1234abcd-12ab-34cd-56ef-1234567890ab`
     * * Key ARN: `arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab`
     *
     * If you are using encryption with cross-account or AWS service operations, you must use a
     * fully qualified KMS key ARN. For more information, see [Using encryption for cross-account
     * operations](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-express-bucket-encryption.html#s3-express-bucket-encryption-update-bucket-policy)
     * .
     *
     *
     * Your SSE-KMS configuration can only support 1 [customer managed
     * key](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#customer-cmk) per
     * directory bucket for the lifetime of the bucket. [AWS managed
     * key](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk) (
     * `aws/s3` ) isn't supported. Also, after you specify a customer managed key for SSE-KMS and
     * upload objects with this configuration, you can't override the customer managed key for your
     * SSE-KMS configuration. To use a new customer manager key for your data, we recommend copying
     * your existing objects to a new directory bucket with a new customer managed key. &gt; Amazon S3
     * only supports symmetric encryption KMS keys. For more information, see [Asymmetric keys in AWS
     * KMS](https://docs.aws.amazon.com//kms/latest/developerguide/symmetric-asymmetric.html) in the
     * *AWS Key Management Service Developer Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-directorybucket-serversideencryptionbydefault.html#cfn-s3express-directorybucket-serversideencryptionbydefault-kmsmasterkeyid)
     */
    public fun kmsMasterKeyId(): String? = unwrap(this).getKmsMasterKeyId()

    /**
     * Server-side encryption algorithm to use for the default encryption.
     *
     *
     * For directory buckets, there are only two supported values for server-side encryption:
     * `AES256` and `aws:kms` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-directorybucket-serversideencryptionbydefault.html#cfn-s3express-directorybucket-serversideencryptionbydefault-ssealgorithm)
     */
    public fun sseAlgorithm(): String

    /**
     * A builder for [ServerSideEncryptionByDefaultProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kmsMasterKeyId AWS Key Management Service (KMS) customer managed key ID to use for
       * the default encryption.
       * This parameter is allowed only if `SSEAlgorithm` is set to `aws:kms` .
       *
       * You can specify this parameter with the key ID or the Amazon Resource Name (ARN) of the KMS
       * key. You can’t use the key alias of the KMS key.
       *
       * * Key ID: `1234abcd-12ab-34cd-56ef-1234567890ab`
       * * Key ARN: `arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab`
       *
       * If you are using encryption with cross-account or AWS service operations, you must use a
       * fully qualified KMS key ARN. For more information, see [Using encryption for cross-account
       * operations](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-express-bucket-encryption.html#s3-express-bucket-encryption-update-bucket-policy)
       * .
       *
       *
       * Your SSE-KMS configuration can only support 1 [customer managed
       * key](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#customer-cmk) per
       * directory bucket for the lifetime of the bucket. [AWS managed
       * key](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk) (
       * `aws/s3` ) isn't supported. Also, after you specify a customer managed key for SSE-KMS and
       * upload objects with this configuration, you can't override the customer managed key for your
       * SSE-KMS configuration. To use a new customer manager key for your data, we recommend copying
       * your existing objects to a new directory bucket with a new customer managed key. &gt; Amazon
       * S3 only supports symmetric encryption KMS keys. For more information, see [Asymmetric keys in
       * AWS KMS](https://docs.aws.amazon.com//kms/latest/developerguide/symmetric-asymmetric.html) in
       * the *AWS Key Management Service Developer Guide* .
       */
      public fun kmsMasterKeyId(kmsMasterKeyId: String)

      /**
       * @param sseAlgorithm Server-side encryption algorithm to use for the default encryption. 
       *
       * For directory buckets, there are only two supported values for server-side encryption:
       * `AES256` and `aws:kms` .
       */
      public fun sseAlgorithm(sseAlgorithm: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3express.CfnDirectoryBucket.ServerSideEncryptionByDefaultProperty.Builder
          =
          software.amazon.awscdk.services.s3express.CfnDirectoryBucket.ServerSideEncryptionByDefaultProperty.builder()

      /**
       * @param kmsMasterKeyId AWS Key Management Service (KMS) customer managed key ID to use for
       * the default encryption.
       * This parameter is allowed only if `SSEAlgorithm` is set to `aws:kms` .
       *
       * You can specify this parameter with the key ID or the Amazon Resource Name (ARN) of the KMS
       * key. You can’t use the key alias of the KMS key.
       *
       * * Key ID: `1234abcd-12ab-34cd-56ef-1234567890ab`
       * * Key ARN: `arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab`
       *
       * If you are using encryption with cross-account or AWS service operations, you must use a
       * fully qualified KMS key ARN. For more information, see [Using encryption for cross-account
       * operations](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-express-bucket-encryption.html#s3-express-bucket-encryption-update-bucket-policy)
       * .
       *
       *
       * Your SSE-KMS configuration can only support 1 [customer managed
       * key](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#customer-cmk) per
       * directory bucket for the lifetime of the bucket. [AWS managed
       * key](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk) (
       * `aws/s3` ) isn't supported. Also, after you specify a customer managed key for SSE-KMS and
       * upload objects with this configuration, you can't override the customer managed key for your
       * SSE-KMS configuration. To use a new customer manager key for your data, we recommend copying
       * your existing objects to a new directory bucket with a new customer managed key. &gt; Amazon
       * S3 only supports symmetric encryption KMS keys. For more information, see [Asymmetric keys in
       * AWS KMS](https://docs.aws.amazon.com//kms/latest/developerguide/symmetric-asymmetric.html) in
       * the *AWS Key Management Service Developer Guide* .
       */
      override fun kmsMasterKeyId(kmsMasterKeyId: String) {
        cdkBuilder.kmsMasterKeyId(kmsMasterKeyId)
      }

      /**
       * @param sseAlgorithm Server-side encryption algorithm to use for the default encryption. 
       *
       * For directory buckets, there are only two supported values for server-side encryption:
       * `AES256` and `aws:kms` .
       */
      override fun sseAlgorithm(sseAlgorithm: String) {
        cdkBuilder.sseAlgorithm(sseAlgorithm)
      }

      public fun build():
          software.amazon.awscdk.services.s3express.CfnDirectoryBucket.ServerSideEncryptionByDefaultProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.s3express.CfnDirectoryBucket.ServerSideEncryptionByDefaultProperty,
    ) : CdkObject(cdkObject),
        ServerSideEncryptionByDefaultProperty {
      /**
       * AWS Key Management Service (KMS) customer managed key ID to use for the default encryption.
       *
       * This parameter is allowed only if `SSEAlgorithm` is set to `aws:kms` .
       *
       * You can specify this parameter with the key ID or the Amazon Resource Name (ARN) of the KMS
       * key. You can’t use the key alias of the KMS key.
       *
       * * Key ID: `1234abcd-12ab-34cd-56ef-1234567890ab`
       * * Key ARN: `arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab`
       *
       * If you are using encryption with cross-account or AWS service operations, you must use a
       * fully qualified KMS key ARN. For more information, see [Using encryption for cross-account
       * operations](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-express-bucket-encryption.html#s3-express-bucket-encryption-update-bucket-policy)
       * .
       *
       *
       * Your SSE-KMS configuration can only support 1 [customer managed
       * key](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#customer-cmk) per
       * directory bucket for the lifetime of the bucket. [AWS managed
       * key](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk) (
       * `aws/s3` ) isn't supported. Also, after you specify a customer managed key for SSE-KMS and
       * upload objects with this configuration, you can't override the customer managed key for your
       * SSE-KMS configuration. To use a new customer manager key for your data, we recommend copying
       * your existing objects to a new directory bucket with a new customer managed key. &gt; Amazon
       * S3 only supports symmetric encryption KMS keys. For more information, see [Asymmetric keys in
       * AWS KMS](https://docs.aws.amazon.com//kms/latest/developerguide/symmetric-asymmetric.html) in
       * the *AWS Key Management Service Developer Guide* .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-directorybucket-serversideencryptionbydefault.html#cfn-s3express-directorybucket-serversideencryptionbydefault-kmsmasterkeyid)
       */
      override fun kmsMasterKeyId(): String? = unwrap(this).getKmsMasterKeyId()

      /**
       * Server-side encryption algorithm to use for the default encryption.
       *
       *
       * For directory buckets, there are only two supported values for server-side encryption:
       * `AES256` and `aws:kms` .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-directorybucket-serversideencryptionbydefault.html#cfn-s3express-directorybucket-serversideencryptionbydefault-ssealgorithm)
       */
      override fun sseAlgorithm(): String = unwrap(this).getSseAlgorithm()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServerSideEncryptionByDefaultProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3express.CfnDirectoryBucket.ServerSideEncryptionByDefaultProperty):
          ServerSideEncryptionByDefaultProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ServerSideEncryptionByDefaultProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServerSideEncryptionByDefaultProperty):
          software.amazon.awscdk.services.s3express.CfnDirectoryBucket.ServerSideEncryptionByDefaultProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.s3express.CfnDirectoryBucket.ServerSideEncryptionByDefaultProperty
    }
  }

  /**
   * Specifies the default server-side encryption configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.s3express.*;
   * ServerSideEncryptionRuleProperty serverSideEncryptionRuleProperty =
   * ServerSideEncryptionRuleProperty.builder()
   * .bucketKeyEnabled(false)
   * .serverSideEncryptionByDefault(ServerSideEncryptionByDefaultProperty.builder()
   * .sseAlgorithm("sseAlgorithm")
   * // the properties below are optional
   * .kmsMasterKeyId("kmsMasterKeyId")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-directorybucket-serversideencryptionrule.html)
   */
  public interface ServerSideEncryptionRuleProperty {
    /**
     * Specifies whether Amazon S3 should use an S3 Bucket Key with server-side encryption using KMS
     * (SSE-KMS) for new objects in the bucket.
     *
     * S3 Bucket Keys are always enabled for `GET` and `PUT` operations on a directory bucket and
     * can’t be disabled. It's only allowed to set the `BucketKeyEnabled` element to `true` .
     *
     * S3 Bucket Keys aren't supported, when you copy SSE-KMS encrypted objects from general purpose
     * buckets to directory buckets, from directory buckets to general purpose buckets, or between
     * directory buckets, through
     * [CopyObject](https://docs.aws.amazon.com/AmazonS3/latest/API/API_CopyObject.html) ,
     * [UploadPartCopy](https://docs.aws.amazon.com/AmazonS3/latest/API/API_UploadPartCopy.html) , [the
     * Copy operation in Batch
     * Operations](https://docs.aws.amazon.com/AmazonS3/latest/userguide/directory-buckets-objects-Batch-Ops)
     * , or [the import jobs](https://docs.aws.amazon.com/AmazonS3/latest/userguide/create-import-job)
     * . In this case, Amazon S3 makes a call to AWS KMS every time a copy request is made for a
     * KMS-encrypted object.
     *
     * For more information, see [Amazon S3 Bucket
     * Keys](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-express-UsingKMSEncryption.html#s3-express-sse-kms-bucket-keys)
     * in the *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-directorybucket-serversideencryptionrule.html#cfn-s3express-directorybucket-serversideencryptionrule-bucketkeyenabled)
     */
    public fun bucketKeyEnabled(): Any? = unwrap(this).getBucketKeyEnabled()

    /**
     * Specifies the default server-side encryption to apply to new objects in the bucket.
     *
     * If a PUT Object request doesn't specify any server-side encryption, this default encryption
     * will be applied.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-directorybucket-serversideencryptionrule.html#cfn-s3express-directorybucket-serversideencryptionrule-serversideencryptionbydefault)
     */
    public fun serverSideEncryptionByDefault(): Any? =
        unwrap(this).getServerSideEncryptionByDefault()

    /**
     * A builder for [ServerSideEncryptionRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucketKeyEnabled Specifies whether Amazon S3 should use an S3 Bucket Key with
       * server-side encryption using KMS (SSE-KMS) for new objects in the bucket.
       * S3 Bucket Keys are always enabled for `GET` and `PUT` operations on a directory bucket and
       * can’t be disabled. It's only allowed to set the `BucketKeyEnabled` element to `true` .
       *
       * S3 Bucket Keys aren't supported, when you copy SSE-KMS encrypted objects from general
       * purpose buckets to directory buckets, from directory buckets to general purpose buckets, or
       * between directory buckets, through
       * [CopyObject](https://docs.aws.amazon.com/AmazonS3/latest/API/API_CopyObject.html) ,
       * [UploadPartCopy](https://docs.aws.amazon.com/AmazonS3/latest/API/API_UploadPartCopy.html) ,
       * [the Copy operation in Batch
       * Operations](https://docs.aws.amazon.com/AmazonS3/latest/userguide/directory-buckets-objects-Batch-Ops)
       * , or [the import
       * jobs](https://docs.aws.amazon.com/AmazonS3/latest/userguide/create-import-job) . In this case,
       * Amazon S3 makes a call to AWS KMS every time a copy request is made for a KMS-encrypted
       * object.
       *
       * For more information, see [Amazon S3 Bucket
       * Keys](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-express-UsingKMSEncryption.html#s3-express-sse-kms-bucket-keys)
       * in the *Amazon S3 User Guide* .
       */
      public fun bucketKeyEnabled(bucketKeyEnabled: Boolean)

      /**
       * @param bucketKeyEnabled Specifies whether Amazon S3 should use an S3 Bucket Key with
       * server-side encryption using KMS (SSE-KMS) for new objects in the bucket.
       * S3 Bucket Keys are always enabled for `GET` and `PUT` operations on a directory bucket and
       * can’t be disabled. It's only allowed to set the `BucketKeyEnabled` element to `true` .
       *
       * S3 Bucket Keys aren't supported, when you copy SSE-KMS encrypted objects from general
       * purpose buckets to directory buckets, from directory buckets to general purpose buckets, or
       * between directory buckets, through
       * [CopyObject](https://docs.aws.amazon.com/AmazonS3/latest/API/API_CopyObject.html) ,
       * [UploadPartCopy](https://docs.aws.amazon.com/AmazonS3/latest/API/API_UploadPartCopy.html) ,
       * [the Copy operation in Batch
       * Operations](https://docs.aws.amazon.com/AmazonS3/latest/userguide/directory-buckets-objects-Batch-Ops)
       * , or [the import
       * jobs](https://docs.aws.amazon.com/AmazonS3/latest/userguide/create-import-job) . In this case,
       * Amazon S3 makes a call to AWS KMS every time a copy request is made for a KMS-encrypted
       * object.
       *
       * For more information, see [Amazon S3 Bucket
       * Keys](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-express-UsingKMSEncryption.html#s3-express-sse-kms-bucket-keys)
       * in the *Amazon S3 User Guide* .
       */
      public fun bucketKeyEnabled(bucketKeyEnabled: IResolvable)

      /**
       * @param serverSideEncryptionByDefault Specifies the default server-side encryption to apply
       * to new objects in the bucket.
       * If a PUT Object request doesn't specify any server-side encryption, this default encryption
       * will be applied.
       */
      public fun serverSideEncryptionByDefault(serverSideEncryptionByDefault: IResolvable)

      /**
       * @param serverSideEncryptionByDefault Specifies the default server-side encryption to apply
       * to new objects in the bucket.
       * If a PUT Object request doesn't specify any server-side encryption, this default encryption
       * will be applied.
       */
      public
          fun serverSideEncryptionByDefault(serverSideEncryptionByDefault: ServerSideEncryptionByDefaultProperty)

      /**
       * @param serverSideEncryptionByDefault Specifies the default server-side encryption to apply
       * to new objects in the bucket.
       * If a PUT Object request doesn't specify any server-side encryption, this default encryption
       * will be applied.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("409c6f00a41ba4156a5bbd885253c366be6f0b199108cd1554245dad4e46929c")
      public
          fun serverSideEncryptionByDefault(serverSideEncryptionByDefault: ServerSideEncryptionByDefaultProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3express.CfnDirectoryBucket.ServerSideEncryptionRuleProperty.Builder
          =
          software.amazon.awscdk.services.s3express.CfnDirectoryBucket.ServerSideEncryptionRuleProperty.builder()

      /**
       * @param bucketKeyEnabled Specifies whether Amazon S3 should use an S3 Bucket Key with
       * server-side encryption using KMS (SSE-KMS) for new objects in the bucket.
       * S3 Bucket Keys are always enabled for `GET` and `PUT` operations on a directory bucket and
       * can’t be disabled. It's only allowed to set the `BucketKeyEnabled` element to `true` .
       *
       * S3 Bucket Keys aren't supported, when you copy SSE-KMS encrypted objects from general
       * purpose buckets to directory buckets, from directory buckets to general purpose buckets, or
       * between directory buckets, through
       * [CopyObject](https://docs.aws.amazon.com/AmazonS3/latest/API/API_CopyObject.html) ,
       * [UploadPartCopy](https://docs.aws.amazon.com/AmazonS3/latest/API/API_UploadPartCopy.html) ,
       * [the Copy operation in Batch
       * Operations](https://docs.aws.amazon.com/AmazonS3/latest/userguide/directory-buckets-objects-Batch-Ops)
       * , or [the import
       * jobs](https://docs.aws.amazon.com/AmazonS3/latest/userguide/create-import-job) . In this case,
       * Amazon S3 makes a call to AWS KMS every time a copy request is made for a KMS-encrypted
       * object.
       *
       * For more information, see [Amazon S3 Bucket
       * Keys](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-express-UsingKMSEncryption.html#s3-express-sse-kms-bucket-keys)
       * in the *Amazon S3 User Guide* .
       */
      override fun bucketKeyEnabled(bucketKeyEnabled: Boolean) {
        cdkBuilder.bucketKeyEnabled(bucketKeyEnabled)
      }

      /**
       * @param bucketKeyEnabled Specifies whether Amazon S3 should use an S3 Bucket Key with
       * server-side encryption using KMS (SSE-KMS) for new objects in the bucket.
       * S3 Bucket Keys are always enabled for `GET` and `PUT` operations on a directory bucket and
       * can’t be disabled. It's only allowed to set the `BucketKeyEnabled` element to `true` .
       *
       * S3 Bucket Keys aren't supported, when you copy SSE-KMS encrypted objects from general
       * purpose buckets to directory buckets, from directory buckets to general purpose buckets, or
       * between directory buckets, through
       * [CopyObject](https://docs.aws.amazon.com/AmazonS3/latest/API/API_CopyObject.html) ,
       * [UploadPartCopy](https://docs.aws.amazon.com/AmazonS3/latest/API/API_UploadPartCopy.html) ,
       * [the Copy operation in Batch
       * Operations](https://docs.aws.amazon.com/AmazonS3/latest/userguide/directory-buckets-objects-Batch-Ops)
       * , or [the import
       * jobs](https://docs.aws.amazon.com/AmazonS3/latest/userguide/create-import-job) . In this case,
       * Amazon S3 makes a call to AWS KMS every time a copy request is made for a KMS-encrypted
       * object.
       *
       * For more information, see [Amazon S3 Bucket
       * Keys](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-express-UsingKMSEncryption.html#s3-express-sse-kms-bucket-keys)
       * in the *Amazon S3 User Guide* .
       */
      override fun bucketKeyEnabled(bucketKeyEnabled: IResolvable) {
        cdkBuilder.bucketKeyEnabled(bucketKeyEnabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param serverSideEncryptionByDefault Specifies the default server-side encryption to apply
       * to new objects in the bucket.
       * If a PUT Object request doesn't specify any server-side encryption, this default encryption
       * will be applied.
       */
      override fun serverSideEncryptionByDefault(serverSideEncryptionByDefault: IResolvable) {
        cdkBuilder.serverSideEncryptionByDefault(serverSideEncryptionByDefault.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param serverSideEncryptionByDefault Specifies the default server-side encryption to apply
       * to new objects in the bucket.
       * If a PUT Object request doesn't specify any server-side encryption, this default encryption
       * will be applied.
       */
      override
          fun serverSideEncryptionByDefault(serverSideEncryptionByDefault: ServerSideEncryptionByDefaultProperty) {
        cdkBuilder.serverSideEncryptionByDefault(serverSideEncryptionByDefault.let(ServerSideEncryptionByDefaultProperty.Companion::unwrap))
      }

      /**
       * @param serverSideEncryptionByDefault Specifies the default server-side encryption to apply
       * to new objects in the bucket.
       * If a PUT Object request doesn't specify any server-side encryption, this default encryption
       * will be applied.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("409c6f00a41ba4156a5bbd885253c366be6f0b199108cd1554245dad4e46929c")
      override
          fun serverSideEncryptionByDefault(serverSideEncryptionByDefault: ServerSideEncryptionByDefaultProperty.Builder.() -> Unit):
          Unit =
          serverSideEncryptionByDefault(ServerSideEncryptionByDefaultProperty(serverSideEncryptionByDefault))

      public fun build():
          software.amazon.awscdk.services.s3express.CfnDirectoryBucket.ServerSideEncryptionRuleProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.s3express.CfnDirectoryBucket.ServerSideEncryptionRuleProperty,
    ) : CdkObject(cdkObject),
        ServerSideEncryptionRuleProperty {
      /**
       * Specifies whether Amazon S3 should use an S3 Bucket Key with server-side encryption using
       * KMS (SSE-KMS) for new objects in the bucket.
       *
       * S3 Bucket Keys are always enabled for `GET` and `PUT` operations on a directory bucket and
       * can’t be disabled. It's only allowed to set the `BucketKeyEnabled` element to `true` .
       *
       * S3 Bucket Keys aren't supported, when you copy SSE-KMS encrypted objects from general
       * purpose buckets to directory buckets, from directory buckets to general purpose buckets, or
       * between directory buckets, through
       * [CopyObject](https://docs.aws.amazon.com/AmazonS3/latest/API/API_CopyObject.html) ,
       * [UploadPartCopy](https://docs.aws.amazon.com/AmazonS3/latest/API/API_UploadPartCopy.html) ,
       * [the Copy operation in Batch
       * Operations](https://docs.aws.amazon.com/AmazonS3/latest/userguide/directory-buckets-objects-Batch-Ops)
       * , or [the import
       * jobs](https://docs.aws.amazon.com/AmazonS3/latest/userguide/create-import-job) . In this case,
       * Amazon S3 makes a call to AWS KMS every time a copy request is made for a KMS-encrypted
       * object.
       *
       * For more information, see [Amazon S3 Bucket
       * Keys](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-express-UsingKMSEncryption.html#s3-express-sse-kms-bucket-keys)
       * in the *Amazon S3 User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-directorybucket-serversideencryptionrule.html#cfn-s3express-directorybucket-serversideencryptionrule-bucketkeyenabled)
       */
      override fun bucketKeyEnabled(): Any? = unwrap(this).getBucketKeyEnabled()

      /**
       * Specifies the default server-side encryption to apply to new objects in the bucket.
       *
       * If a PUT Object request doesn't specify any server-side encryption, this default encryption
       * will be applied.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-directorybucket-serversideencryptionrule.html#cfn-s3express-directorybucket-serversideencryptionrule-serversideencryptionbydefault)
       */
      override fun serverSideEncryptionByDefault(): Any? =
          unwrap(this).getServerSideEncryptionByDefault()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ServerSideEncryptionRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3express.CfnDirectoryBucket.ServerSideEncryptionRuleProperty):
          ServerSideEncryptionRuleProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ServerSideEncryptionRuleProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServerSideEncryptionRuleProperty):
          software.amazon.awscdk.services.s3express.CfnDirectoryBucket.ServerSideEncryptionRuleProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.s3express.CfnDirectoryBucket.ServerSideEncryptionRuleProperty
    }
  }
}
