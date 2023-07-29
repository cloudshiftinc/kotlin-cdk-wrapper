@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket
import software.constructs.Construct

/**
 * The `AWS::S3::Bucket` resource creates an Amazon S3 bucket in the same AWS Region where you
 * create the AWS CloudFormation stack.
 *
 * To control how AWS CloudFormation handles the bucket when the stack is deleted, you can set a
 * deletion policy for your bucket. You can choose to *retain* the bucket or to *delete* the bucket.
 * For more information, see
 * [DeletionPolicy Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html)
 * .
 *
 * You can only delete empty buckets. Deletion fails for buckets that have contents.
 *
 * Example:
 * ```
 * CfnInclude cfnTemplate;
 * CfnBucket cfnBucket = (CfnBucket)cfnTemplate.getResource("Bucket");
 * Role role = Role.Builder.create(this, "Role")
 * .assumedBy(new AnyPrincipal())
 * .build();
 * role.addToPolicy(PolicyStatement.Builder.create()
 * .actions(List.of("s3:*"))
 * .resources(List.of(cfnBucket.getAttrArn()))
 * .build());
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html)
 */
@CdkDslMarker
public class CfnBucketDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnBucket.Builder = CfnBucket.Builder.create(scope, id)

    private val _analyticsConfigurations: MutableList<Any> = mutableListOf()

    private val _intelligentTieringConfigurations: MutableList<Any> = mutableListOf()

    private val _inventoryConfigurations: MutableList<Any> = mutableListOf()

    private val _metricsConfigurations: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * Configures the transfer acceleration state for an Amazon S3 bucket.
     *
     * For more information, see
     * [Amazon S3 Transfer Acceleration](https://docs.aws.amazon.com/AmazonS3/latest/dev/transfer-acceleration.html)
     * in the *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-accelerateconfiguration)
     *
     * @param accelerateConfiguration Configures the transfer acceleration state for an Amazon S3
     *   bucket.
     */
    public fun accelerateConfiguration(accelerateConfiguration: IResolvable) {
        cdkBuilder.accelerateConfiguration(accelerateConfiguration)
    }

    /**
     * Configures the transfer acceleration state for an Amazon S3 bucket.
     *
     * For more information, see
     * [Amazon S3 Transfer Acceleration](https://docs.aws.amazon.com/AmazonS3/latest/dev/transfer-acceleration.html)
     * in the *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-accelerateconfiguration)
     *
     * @param accelerateConfiguration Configures the transfer acceleration state for an Amazon S3
     *   bucket.
     */
    public fun accelerateConfiguration(
        accelerateConfiguration: CfnBucket.AccelerateConfigurationProperty
    ) {
        cdkBuilder.accelerateConfiguration(accelerateConfiguration)
    }

    /**
     * A canned access control list (ACL) that grants predefined permissions to the bucket.
     *
     * For more information about canned ACLs, see
     * [Canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) in
     * the *Amazon S3 User Guide* .
     *
     * Be aware that the syntax for this property differs from the information provided in the
     * *Amazon S3 User Guide* . The AccessControl property is case-sensitive and must be one of the
     * following values: Private, PublicRead, PublicReadWrite, AuthenticatedRead, LogDeliveryWrite,
     * BucketOwnerRead, BucketOwnerFullControl, or AwsExecRead.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-accesscontrol)
     *
     * @param accessControl A canned access control list (ACL) that grants predefined permissions to
     *   the bucket.
     */
    public fun accessControl(accessControl: String) {
        cdkBuilder.accessControl(accessControl)
    }

    /**
     * Specifies the configuration and any analyses for the analytics filter of an Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-analyticsconfigurations)
     *
     * @param analyticsConfigurations Specifies the configuration and any analyses for the analytics
     *   filter of an Amazon S3 bucket.
     */
    public fun analyticsConfigurations(vararg analyticsConfigurations: Any) {
        _analyticsConfigurations.addAll(listOf(*analyticsConfigurations))
    }

    /**
     * Specifies the configuration and any analyses for the analytics filter of an Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-analyticsconfigurations)
     *
     * @param analyticsConfigurations Specifies the configuration and any analyses for the analytics
     *   filter of an Amazon S3 bucket.
     */
    public fun analyticsConfigurations(analyticsConfigurations: Collection<Any>) {
        _analyticsConfigurations.addAll(analyticsConfigurations)
    }

    /**
     * Specifies the configuration and any analyses for the analytics filter of an Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-analyticsconfigurations)
     *
     * @param analyticsConfigurations Specifies the configuration and any analyses for the analytics
     *   filter of an Amazon S3 bucket.
     */
    public fun analyticsConfigurations(analyticsConfigurations: IResolvable) {
        cdkBuilder.analyticsConfigurations(analyticsConfigurations)
    }

    /**
     * Specifies default encryption for a bucket using server-side encryption with Amazon S3-managed
     * keys (SSE-S3), AWS KMS-managed keys (SSE-KMS), or dual-layer server-side encryption with
     * KMS-managed keys (DSSE-KMS).
     *
     * For information about the Amazon S3 default encryption feature, see
     * [Amazon S3 Default Encryption for S3 Buckets](https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html)
     * in the *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-bucketencryption)
     *
     * @param bucketEncryption Specifies default encryption for a bucket using server-side
     *   encryption with Amazon S3-managed keys (SSE-S3), AWS KMS-managed keys (SSE-KMS), or
     *   dual-layer server-side encryption with KMS-managed keys (DSSE-KMS).
     */
    public fun bucketEncryption(bucketEncryption: IResolvable) {
        cdkBuilder.bucketEncryption(bucketEncryption)
    }

    /**
     * Specifies default encryption for a bucket using server-side encryption with Amazon S3-managed
     * keys (SSE-S3), AWS KMS-managed keys (SSE-KMS), or dual-layer server-side encryption with
     * KMS-managed keys (DSSE-KMS).
     *
     * For information about the Amazon S3 default encryption feature, see
     * [Amazon S3 Default Encryption for S3 Buckets](https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html)
     * in the *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-bucketencryption)
     *
     * @param bucketEncryption Specifies default encryption for a bucket using server-side
     *   encryption with Amazon S3-managed keys (SSE-S3), AWS KMS-managed keys (SSE-KMS), or
     *   dual-layer server-side encryption with KMS-managed keys (DSSE-KMS).
     */
    public fun bucketEncryption(bucketEncryption: CfnBucket.BucketEncryptionProperty) {
        cdkBuilder.bucketEncryption(bucketEncryption)
    }

    /**
     * A name for the bucket.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique ID and uses that ID for
     * the bucket name. The bucket name must contain only lowercase letters, numbers, periods (.),
     * and dashes (-) and must follow
     * [Amazon S3 bucket restrictions and limitations](https://docs.aws.amazon.com/AmazonS3/latest/dev/BucketRestrictions.html)
     * . For more information, see
     * [Rules for naming Amazon S3 buckets](https://docs.aws.amazon.com/AmazonS3/latest/dev/BucketRestrictions.html#bucketnamingrules)
     * in the *Amazon S3 User Guide* .
     *
     * If you specify a name, you can't perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you need to replace the
     * resource, specify a new name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-bucketname)
     *
     * @param bucketName A name for the bucket.
     */
    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    /**
     * Describes the cross-origin access configuration for objects in an Amazon S3 bucket.
     *
     * For more information, see
     * [Enabling Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html)
     * in the *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-corsconfiguration)
     *
     * @param corsConfiguration Describes the cross-origin access configuration for objects in an
     *   Amazon S3 bucket.
     */
    public fun corsConfiguration(corsConfiguration: IResolvable) {
        cdkBuilder.corsConfiguration(corsConfiguration)
    }

    /**
     * Describes the cross-origin access configuration for objects in an Amazon S3 bucket.
     *
     * For more information, see
     * [Enabling Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html)
     * in the *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-corsconfiguration)
     *
     * @param corsConfiguration Describes the cross-origin access configuration for objects in an
     *   Amazon S3 bucket.
     */
    public fun corsConfiguration(corsConfiguration: CfnBucket.CorsConfigurationProperty) {
        cdkBuilder.corsConfiguration(corsConfiguration)
    }

    /**
     * Defines how Amazon S3 handles Intelligent-Tiering storage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-intelligenttieringconfigurations)
     *
     * @param intelligentTieringConfigurations Defines how Amazon S3 handles Intelligent-Tiering
     *   storage.
     */
    public fun intelligentTieringConfigurations(vararg intelligentTieringConfigurations: Any) {
        _intelligentTieringConfigurations.addAll(listOf(*intelligentTieringConfigurations))
    }

    /**
     * Defines how Amazon S3 handles Intelligent-Tiering storage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-intelligenttieringconfigurations)
     *
     * @param intelligentTieringConfigurations Defines how Amazon S3 handles Intelligent-Tiering
     *   storage.
     */
    public fun intelligentTieringConfigurations(intelligentTieringConfigurations: Collection<Any>) {
        _intelligentTieringConfigurations.addAll(intelligentTieringConfigurations)
    }

    /**
     * Defines how Amazon S3 handles Intelligent-Tiering storage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-intelligenttieringconfigurations)
     *
     * @param intelligentTieringConfigurations Defines how Amazon S3 handles Intelligent-Tiering
     *   storage.
     */
    public fun intelligentTieringConfigurations(intelligentTieringConfigurations: IResolvable) {
        cdkBuilder.intelligentTieringConfigurations(intelligentTieringConfigurations)
    }

    /**
     * Specifies the inventory configuration for an Amazon S3 bucket.
     *
     * For more information, see
     * [GET Bucket inventory](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETInventoryConfig.html)
     * in the *Amazon S3 API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-inventoryconfigurations)
     *
     * @param inventoryConfigurations Specifies the inventory configuration for an Amazon S3 bucket.
     */
    public fun inventoryConfigurations(vararg inventoryConfigurations: Any) {
        _inventoryConfigurations.addAll(listOf(*inventoryConfigurations))
    }

    /**
     * Specifies the inventory configuration for an Amazon S3 bucket.
     *
     * For more information, see
     * [GET Bucket inventory](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETInventoryConfig.html)
     * in the *Amazon S3 API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-inventoryconfigurations)
     *
     * @param inventoryConfigurations Specifies the inventory configuration for an Amazon S3 bucket.
     */
    public fun inventoryConfigurations(inventoryConfigurations: Collection<Any>) {
        _inventoryConfigurations.addAll(inventoryConfigurations)
    }

    /**
     * Specifies the inventory configuration for an Amazon S3 bucket.
     *
     * For more information, see
     * [GET Bucket inventory](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETInventoryConfig.html)
     * in the *Amazon S3 API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-inventoryconfigurations)
     *
     * @param inventoryConfigurations Specifies the inventory configuration for an Amazon S3 bucket.
     */
    public fun inventoryConfigurations(inventoryConfigurations: IResolvable) {
        cdkBuilder.inventoryConfigurations(inventoryConfigurations)
    }

    /**
     * Specifies the lifecycle configuration for objects in an Amazon S3 bucket.
     *
     * For more information, see
     * [Object Lifecycle Management](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html)
     * in the *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-lifecycleconfiguration)
     *
     * @param lifecycleConfiguration Specifies the lifecycle configuration for objects in an Amazon
     *   S3 bucket.
     */
    public fun lifecycleConfiguration(lifecycleConfiguration: IResolvable) {
        cdkBuilder.lifecycleConfiguration(lifecycleConfiguration)
    }

    /**
     * Specifies the lifecycle configuration for objects in an Amazon S3 bucket.
     *
     * For more information, see
     * [Object Lifecycle Management](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html)
     * in the *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-lifecycleconfiguration)
     *
     * @param lifecycleConfiguration Specifies the lifecycle configuration for objects in an Amazon
     *   S3 bucket.
     */
    public fun lifecycleConfiguration(
        lifecycleConfiguration: CfnBucket.LifecycleConfigurationProperty
    ) {
        cdkBuilder.lifecycleConfiguration(lifecycleConfiguration)
    }

    /**
     * Settings that define where logs are stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-loggingconfiguration)
     *
     * @param loggingConfiguration Settings that define where logs are stored.
     */
    public fun loggingConfiguration(loggingConfiguration: IResolvable) {
        cdkBuilder.loggingConfiguration(loggingConfiguration)
    }

    /**
     * Settings that define where logs are stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-loggingconfiguration)
     *
     * @param loggingConfiguration Settings that define where logs are stored.
     */
    public fun loggingConfiguration(loggingConfiguration: CfnBucket.LoggingConfigurationProperty) {
        cdkBuilder.loggingConfiguration(loggingConfiguration)
    }

    /**
     * Specifies a metrics configuration for the CloudWatch request metrics (specified by the
     * metrics configuration ID) from an Amazon S3 bucket.
     *
     * If you're updating an existing metrics configuration, note that this is a full replacement of
     * the existing metrics configuration. If you don't include the elements you want to keep, they
     * are erased. For more information, see
     * [PutBucketMetricsConfiguration](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTMetricConfiguration.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-metricsconfigurations)
     *
     * @param metricsConfigurations Specifies a metrics configuration for the CloudWatch request
     *   metrics (specified by the metrics configuration ID) from an Amazon S3 bucket.
     */
    public fun metricsConfigurations(vararg metricsConfigurations: Any) {
        _metricsConfigurations.addAll(listOf(*metricsConfigurations))
    }

    /**
     * Specifies a metrics configuration for the CloudWatch request metrics (specified by the
     * metrics configuration ID) from an Amazon S3 bucket.
     *
     * If you're updating an existing metrics configuration, note that this is a full replacement of
     * the existing metrics configuration. If you don't include the elements you want to keep, they
     * are erased. For more information, see
     * [PutBucketMetricsConfiguration](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTMetricConfiguration.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-metricsconfigurations)
     *
     * @param metricsConfigurations Specifies a metrics configuration for the CloudWatch request
     *   metrics (specified by the metrics configuration ID) from an Amazon S3 bucket.
     */
    public fun metricsConfigurations(metricsConfigurations: Collection<Any>) {
        _metricsConfigurations.addAll(metricsConfigurations)
    }

    /**
     * Specifies a metrics configuration for the CloudWatch request metrics (specified by the
     * metrics configuration ID) from an Amazon S3 bucket.
     *
     * If you're updating an existing metrics configuration, note that this is a full replacement of
     * the existing metrics configuration. If you don't include the elements you want to keep, they
     * are erased. For more information, see
     * [PutBucketMetricsConfiguration](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTMetricConfiguration.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-metricsconfigurations)
     *
     * @param metricsConfigurations Specifies a metrics configuration for the CloudWatch request
     *   metrics (specified by the metrics configuration ID) from an Amazon S3 bucket.
     */
    public fun metricsConfigurations(metricsConfigurations: IResolvable) {
        cdkBuilder.metricsConfigurations(metricsConfigurations)
    }

    /**
     * Configuration that defines how Amazon S3 handles bucket notifications.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-notificationconfiguration)
     *
     * @param notificationConfiguration Configuration that defines how Amazon S3 handles bucket
     *   notifications.
     */
    public fun notificationConfiguration(notificationConfiguration: IResolvable) {
        cdkBuilder.notificationConfiguration(notificationConfiguration)
    }

    /**
     * Configuration that defines how Amazon S3 handles bucket notifications.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-notificationconfiguration)
     *
     * @param notificationConfiguration Configuration that defines how Amazon S3 handles bucket
     *   notifications.
     */
    public fun notificationConfiguration(
        notificationConfiguration: CfnBucket.NotificationConfigurationProperty
    ) {
        cdkBuilder.notificationConfiguration(notificationConfiguration)
    }

    /**
     * Places an Object Lock configuration on the specified bucket.
     *
     * The rule specified in the Object Lock configuration will be applied by default to every new
     * object placed in the specified bucket. For more information, see
     * [Locking Objects](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html) .
     * * The `DefaultRetention` settings require both a mode and a period.
     * * The `DefaultRetention` period can be either `Days` or `Years` but you must select one. You
     *   cannot specify `Days` and `Years` at the same time.
     * * You can only enable Object Lock for new buckets. If you want to turn on Object Lock for an
     *   existing bucket, contact AWS Support.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-objectlockconfiguration)
     *
     * @param objectLockConfiguration Places an Object Lock configuration on the specified bucket.
     */
    public fun objectLockConfiguration(objectLockConfiguration: IResolvable) {
        cdkBuilder.objectLockConfiguration(objectLockConfiguration)
    }

    /**
     * Places an Object Lock configuration on the specified bucket.
     *
     * The rule specified in the Object Lock configuration will be applied by default to every new
     * object placed in the specified bucket. For more information, see
     * [Locking Objects](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html) .
     * * The `DefaultRetention` settings require both a mode and a period.
     * * The `DefaultRetention` period can be either `Days` or `Years` but you must select one. You
     *   cannot specify `Days` and `Years` at the same time.
     * * You can only enable Object Lock for new buckets. If you want to turn on Object Lock for an
     *   existing bucket, contact AWS Support.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-objectlockconfiguration)
     *
     * @param objectLockConfiguration Places an Object Lock configuration on the specified bucket.
     */
    public fun objectLockConfiguration(
        objectLockConfiguration: CfnBucket.ObjectLockConfigurationProperty
    ) {
        cdkBuilder.objectLockConfiguration(objectLockConfiguration)
    }

    /**
     * Indicates whether this bucket has an Object Lock configuration enabled.
     *
     * Enable `ObjectLockEnabled` when you apply `ObjectLockConfiguration` to a bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-objectlockenabled)
     *
     * @param objectLockEnabled Indicates whether this bucket has an Object Lock configuration
     *   enabled.
     */
    public fun objectLockEnabled(objectLockEnabled: Boolean) {
        cdkBuilder.objectLockEnabled(objectLockEnabled)
    }

    /**
     * Indicates whether this bucket has an Object Lock configuration enabled.
     *
     * Enable `ObjectLockEnabled` when you apply `ObjectLockConfiguration` to a bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-objectlockenabled)
     *
     * @param objectLockEnabled Indicates whether this bucket has an Object Lock configuration
     *   enabled.
     */
    public fun objectLockEnabled(objectLockEnabled: IResolvable) {
        cdkBuilder.objectLockEnabled(objectLockEnabled)
    }

    /**
     * Configuration that defines how Amazon S3 handles Object Ownership rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-ownershipcontrols)
     *
     * @param ownershipControls Configuration that defines how Amazon S3 handles Object Ownership
     *   rules.
     */
    public fun ownershipControls(ownershipControls: IResolvable) {
        cdkBuilder.ownershipControls(ownershipControls)
    }

    /**
     * Configuration that defines how Amazon S3 handles Object Ownership rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-ownershipcontrols)
     *
     * @param ownershipControls Configuration that defines how Amazon S3 handles Object Ownership
     *   rules.
     */
    public fun ownershipControls(ownershipControls: CfnBucket.OwnershipControlsProperty) {
        cdkBuilder.ownershipControls(ownershipControls)
    }

    /**
     * Configuration that defines how Amazon S3 handles public access.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-publicaccessblockconfiguration)
     *
     * @param publicAccessBlockConfiguration Configuration that defines how Amazon S3 handles public
     *   access.
     */
    public fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: IResolvable) {
        cdkBuilder.publicAccessBlockConfiguration(publicAccessBlockConfiguration)
    }

    /**
     * Configuration that defines how Amazon S3 handles public access.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-publicaccessblockconfiguration)
     *
     * @param publicAccessBlockConfiguration Configuration that defines how Amazon S3 handles public
     *   access.
     */
    public fun publicAccessBlockConfiguration(
        publicAccessBlockConfiguration: CfnBucket.PublicAccessBlockConfigurationProperty
    ) {
        cdkBuilder.publicAccessBlockConfiguration(publicAccessBlockConfiguration)
    }

    /**
     * Configuration for replicating objects in an S3 bucket.
     *
     * To enable replication, you must also enable versioning by using the `VersioningConfiguration`
     * property.
     *
     * Amazon S3 can store replicated objects in a single destination bucket or multiple destination
     * buckets. The destination bucket or buckets must already exist.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-replicationconfiguration)
     *
     * @param replicationConfiguration Configuration for replicating objects in an S3 bucket.
     */
    public fun replicationConfiguration(replicationConfiguration: IResolvable) {
        cdkBuilder.replicationConfiguration(replicationConfiguration)
    }

    /**
     * Configuration for replicating objects in an S3 bucket.
     *
     * To enable replication, you must also enable versioning by using the `VersioningConfiguration`
     * property.
     *
     * Amazon S3 can store replicated objects in a single destination bucket or multiple destination
     * buckets. The destination bucket or buckets must already exist.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-replicationconfiguration)
     *
     * @param replicationConfiguration Configuration for replicating objects in an S3 bucket.
     */
    public fun replicationConfiguration(
        replicationConfiguration: CfnBucket.ReplicationConfigurationProperty
    ) {
        cdkBuilder.replicationConfiguration(replicationConfiguration)
    }

    /**
     * An arbitrary set of tags (key-value pairs) for this S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-tags)
     *
     * @param tags An arbitrary set of tags (key-value pairs) for this S3 bucket.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An arbitrary set of tags (key-value pairs) for this S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-tags)
     *
     * @param tags An arbitrary set of tags (key-value pairs) for this S3 bucket.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * Enables multiple versions of all objects in this bucket.
     *
     * You might enable versioning to prevent objects from being deleted or overwritten by mistake
     * or to archive objects so that you can retrieve previous versions of them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-versioningconfiguration)
     *
     * @param versioningConfiguration Enables multiple versions of all objects in this bucket.
     */
    public fun versioningConfiguration(versioningConfiguration: IResolvable) {
        cdkBuilder.versioningConfiguration(versioningConfiguration)
    }

    /**
     * Enables multiple versions of all objects in this bucket.
     *
     * You might enable versioning to prevent objects from being deleted or overwritten by mistake
     * or to archive objects so that you can retrieve previous versions of them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-versioningconfiguration)
     *
     * @param versioningConfiguration Enables multiple versions of all objects in this bucket.
     */
    public fun versioningConfiguration(
        versioningConfiguration: CfnBucket.VersioningConfigurationProperty
    ) {
        cdkBuilder.versioningConfiguration(versioningConfiguration)
    }

    /**
     * Information used to configure the bucket as a static website.
     *
     * For more information, see
     * [Hosting Websites on Amazon S3](https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-websiteconfiguration)
     *
     * @param websiteConfiguration Information used to configure the bucket as a static website.
     */
    public fun websiteConfiguration(websiteConfiguration: IResolvable) {
        cdkBuilder.websiteConfiguration(websiteConfiguration)
    }

    /**
     * Information used to configure the bucket as a static website.
     *
     * For more information, see
     * [Hosting Websites on Amazon S3](https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-websiteconfiguration)
     *
     * @param websiteConfiguration Information used to configure the bucket as a static website.
     */
    public fun websiteConfiguration(websiteConfiguration: CfnBucket.WebsiteConfigurationProperty) {
        cdkBuilder.websiteConfiguration(websiteConfiguration)
    }

    public fun build(): CfnBucket {
        if (_analyticsConfigurations.isNotEmpty())
            cdkBuilder.analyticsConfigurations(_analyticsConfigurations)
        if (_intelligentTieringConfigurations.isNotEmpty())
            cdkBuilder.intelligentTieringConfigurations(_intelligentTieringConfigurations)
        if (_inventoryConfigurations.isNotEmpty())
            cdkBuilder.inventoryConfigurations(_inventoryConfigurations)
        if (_metricsConfigurations.isNotEmpty())
            cdkBuilder.metricsConfigurations(_metricsConfigurations)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
