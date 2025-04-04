@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.events.Rule
import io.cloudshiftdev.awscdk.services.iam.AddToResourcePolicyResult
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.constructs.Node
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 *
 */
public interface IBucket : IResource {
  /**
   * Adds a bucket notification event destination.
   *
   * Example:
   *
   * ```
   * Function myLambda;
   * Bucket bucket = new Bucket(this, "MyBucket");
   * bucket.addEventNotification(EventType.OBJECT_CREATED, new LambdaDestination(myLambda),
   * NotificationKeyFilter.builder().prefix("home/myusername/ *").build());
   * ```
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html)
   * @param event The event to trigger the notification. 
   * @param dest The notification destination (Lambda, SNS Topic or SQS Queue). 
   * @param filters S3 object key filter rules to determine which objects trigger this event. 
   */
  public fun addEventNotification(
    event: EventType,
    dest: IBucketNotificationDestination,
    vararg filters: NotificationKeyFilter,
  )

  /**
   * Adds a bucket notification event destination.
   *
   * Example:
   *
   * ```
   * Function myLambda;
   * Bucket bucket = new Bucket(this, "MyBucket");
   * bucket.addEventNotification(EventType.OBJECT_CREATED, new LambdaDestination(myLambda),
   * NotificationKeyFilter.builder().prefix("home/myusername/ *").build());
   * ```
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html)
   * @param event The event to trigger the notification. 
   * @param dest The notification destination (Lambda, SNS Topic or SQS Queue). 
   * @param filters S3 object key filter rules to determine which objects trigger this event. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1d0b56563701e92edca7104c6b251f88497ad21052ff4bd7384db69d23a3f01e")
  public fun addEventNotification(
    event: EventType,
    dest: IBucketNotificationDestination,
    filters: NotificationKeyFilter.Builder.() -> Unit,
  )

  /**
   * Subscribes a destination to receive notifications when an object is created in the bucket.
   *
   * This is identical to calling
   * `onEvent(s3.EventType.OBJECT_CREATED)`.
   *
   * @param dest The notification destination (see onEvent). 
   * @param filters Filters (see onEvent). 
   */
  public fun addObjectCreatedNotification(dest: IBucketNotificationDestination, vararg
      filters: NotificationKeyFilter)

  /**
   * Subscribes a destination to receive notifications when an object is created in the bucket.
   *
   * This is identical to calling
   * `onEvent(s3.EventType.OBJECT_CREATED)`.
   *
   * @param dest The notification destination (see onEvent). 
   * @param filters Filters (see onEvent). 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("659a47f023d44060464d0f8501d59228cd0a44f99bad56864cfec5fc46034cd0")
  public fun addObjectCreatedNotification(dest: IBucketNotificationDestination,
      filters: NotificationKeyFilter.Builder.() -> Unit)

  /**
   * Subscribes a destination to receive notifications when an object is removed from the bucket.
   *
   * This is identical to calling
   * `onEvent(EventType.OBJECT_REMOVED)`.
   *
   * @param dest The notification destination (see onEvent). 
   * @param filters Filters (see onEvent). 
   */
  public fun addObjectRemovedNotification(dest: IBucketNotificationDestination, vararg
      filters: NotificationKeyFilter)

  /**
   * Subscribes a destination to receive notifications when an object is removed from the bucket.
   *
   * This is identical to calling
   * `onEvent(EventType.OBJECT_REMOVED)`.
   *
   * @param dest The notification destination (see onEvent). 
   * @param filters Filters (see onEvent). 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ead0379c408a1a59ae83c035b9c29e8fa6206d8cf0f8e3797dd395f1b0845f96")
  public fun addObjectRemovedNotification(dest: IBucketNotificationDestination,
      filters: NotificationKeyFilter.Builder.() -> Unit)

  /**
   * Adds a statement to the resource policy for a principal (i.e. account/role/service) to perform
   * actions on this bucket and/or its contents. Use `bucketArn` and `arnForObjects(keys)` to obtain
   * ARNs for this bucket or objects.
   *
   * Note that the policy statement may or may not be added to the policy.
   * For example, when an `IBucket` is created from an existing bucket,
   * it's not possible to tell whether the bucket already has a policy
   * attached, let alone to re-use that policy to add more statements to it.
   * So it's safest to do nothing in these cases.
   *
   * @return metadata about the execution of this method. If the policy
   * was not added, the value of `statementAdded` will be `false`. You
   * should always check this value to make sure that the operation was
   * actually carried out. Otherwise, synthesis and deploy will terminate
   * silently, which may be confusing.
   * @param permission the policy statement to be added to the bucket's policy. 
   */
  public fun addToResourcePolicy(permission: PolicyStatement): AddToResourcePolicyResult

  /**
   * Adds a statement to the resource policy for a principal (i.e. account/role/service) to perform
   * actions on this bucket and/or its contents. Use `bucketArn` and `arnForObjects(keys)` to obtain
   * ARNs for this bucket or objects.
   *
   * Note that the policy statement may or may not be added to the policy.
   * For example, when an `IBucket` is created from an existing bucket,
   * it's not possible to tell whether the bucket already has a policy
   * attached, let alone to re-use that policy to add more statements to it.
   * So it's safest to do nothing in these cases.
   *
   * @return metadata about the execution of this method. If the policy
   * was not added, the value of `statementAdded` will be `false`. You
   * should always check this value to make sure that the operation was
   * actually carried out. Otherwise, synthesis and deploy will terminate
   * silently, which may be confusing.
   * @param permission the policy statement to be added to the bucket's policy. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
  public fun addToResourcePolicy(permission: PolicyStatement.Builder.() -> Unit):
      AddToResourcePolicyResult

  /**
   * Returns an ARN that represents all objects within the bucket that match the key pattern
   * specified.
   *
   * To represent all keys, specify `"*"`.
   *
   * @param keyPattern 
   */
  public fun arnForObjects(keyPattern: String): String

  /**
   * The ARN of the bucket.
   */
  public fun bucketArn(): String

  /**
   * The IPv4 DNS name of the specified bucket.
   */
  public fun bucketDomainName(): String

  /**
   * The IPv6 DNS name of the specified bucket.
   */
  public fun bucketDualStackDomainName(): String

  /**
   * The name of the bucket.
   */
  public fun bucketName(): String

  /**
   * The regional domain name of the specified bucket.
   */
  public fun bucketRegionalDomainName(): String

  /**
   * The Domain name of the static website.
   */
  public fun bucketWebsiteDomainName(): String

  /**
   * The URL of the static website.
   */
  public fun bucketWebsiteUrl(): String

  /**
   * Enables event bridge notification, causing all events below to be sent to EventBridge:.
   *
   * * Object Deleted (DeleteObject)
   * * Object Deleted (Lifecycle expiration)
   * * Object Restore Initiated
   * * Object Restore Completed
   * * Object Restore Expired
   * * Object Storage Class Changed
   * * Object Access Tier Changed
   * * Object ACL Updated
   * * Object Tags Added
   * * Object Tags Deleted
   */
  public fun enableEventBridgeNotification()

  /**
   * Optional KMS encryption key associated with this bucket.
   */
  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  /**
   * Grants s3:DeleteObject* permission to an IAM principal for objects in this bucket.
   *
   * @param identity The principal. 
   * @param objectsKeyPattern Restrict the permission to a certain key pattern (default '*').
   */
  public fun grantDelete(identity: IGrantable): Grant

  /**
   * Grants s3:DeleteObject* permission to an IAM principal for objects in this bucket.
   *
   * @param identity The principal. 
   * @param objectsKeyPattern Restrict the permission to a certain key pattern (default '*').
   */
  public fun grantDelete(identity: IGrantable, objectsKeyPattern: Any): Grant

  /**
   * Allows unrestricted access to objects from this bucket.
   *
   * IMPORTANT: This permission allows anyone to perform actions on S3 objects
   * in this bucket, which is useful for when you configure your bucket as a
   * website and want everyone to be able to read objects in the bucket without
   * needing to authenticate.
   *
   * Without arguments, this method will grant read ("s3:GetObject") access to
   * all objects ("*") in the bucket.
   *
   * The method returns the `iam.Grant` object, which can then be modified
   * as needed. For example, you can add a condition that will restrict access only
   * to an IPv4 range like this:
   *
   * ```
   * const grant = bucket.grantPublicAccess();
   * grant.resourceStatement!.addCondition(‘IpAddress’, { “aws:SourceIp”: “54.240.143.0/24” });
   * ```
   *
   * @return The `iam.PolicyStatement` object, which can be used to apply e.g. conditions.
   * @param keyPrefix the prefix of S3 object keys (e.g. `home/ *`). Default is "*".
   * @param allowedActions the set of S3 actions to allow. 
   */
  public fun grantPublicAccess(keyPrefix: String, vararg allowedActions: String): Grant

  /**
   * Grants s3:PutObject* and s3:Abort* permissions for this bucket to an IAM principal.
   *
   * If encryption is used, permission to use the key to encrypt the contents
   * of written files will also be granted to the same principal.
   *
   * @param identity The principal. 
   * @param objectsKeyPattern Restrict the permission to a certain key pattern (default '*').
   */
  public fun grantPut(identity: IGrantable): Grant

  /**
   * Grants s3:PutObject* and s3:Abort* permissions for this bucket to an IAM principal.
   *
   * If encryption is used, permission to use the key to encrypt the contents
   * of written files will also be granted to the same principal.
   *
   * @param identity The principal. 
   * @param objectsKeyPattern Restrict the permission to a certain key pattern (default '*').
   */
  public fun grantPut(identity: IGrantable, objectsKeyPattern: Any): Grant

  /**
   * Grant the given IAM identity permissions to modify the ACLs of objects in the given Bucket.
   *
   * If your application has the '&#64;aws-cdk/aws-s3:grantWriteWithoutAcl' feature flag set,
   * calling `grantWrite` or `grantReadWrite` no longer grants permissions to modify the ACLs of the
   * objects;
   * in this case, if you need to modify object ACLs, call this method explicitly.
   *
   * @param identity The principal. 
   * @param objectsKeyPattern Restrict the permission to a certain key pattern (default '*').
   */
  public fun grantPutAcl(identity: IGrantable): Grant

  /**
   * Grant the given IAM identity permissions to modify the ACLs of objects in the given Bucket.
   *
   * If your application has the '&#64;aws-cdk/aws-s3:grantWriteWithoutAcl' feature flag set,
   * calling `grantWrite` or `grantReadWrite` no longer grants permissions to modify the ACLs of the
   * objects;
   * in this case, if you need to modify object ACLs, call this method explicitly.
   *
   * @param identity The principal. 
   * @param objectsKeyPattern Restrict the permission to a certain key pattern (default '*').
   */
  public fun grantPutAcl(identity: IGrantable, objectsKeyPattern: String): Grant

  /**
   * Grant read permissions for this bucket and it's contents to an IAM principal (Role/Group/User).
   *
   * If encryption is used, permission to use the key to decrypt the contents
   * of the bucket will also be granted to the same principal.
   *
   * @param identity The principal. 
   * @param objectsKeyPattern Restrict the permission to a certain key pattern (default '*').
   */
  public fun grantRead(identity: IGrantable): Grant

  /**
   * Grant read permissions for this bucket and it's contents to an IAM principal (Role/Group/User).
   *
   * If encryption is used, permission to use the key to decrypt the contents
   * of the bucket will also be granted to the same principal.
   *
   * @param identity The principal. 
   * @param objectsKeyPattern Restrict the permission to a certain key pattern (default '*').
   */
  public fun grantRead(identity: IGrantable, objectsKeyPattern: Any): Grant

  /**
   * Grants read/write permissions for this bucket and it's contents to an IAM principal
   * (Role/Group/User).
   *
   * If an encryption key is used, permission to use the key for
   * encrypt/decrypt will also be granted.
   *
   * Before CDK version 1.85.0, this method granted the `s3:PutObject*` permission that included
   * `s3:PutObjectAcl`,
   * which could be used to grant read/write object access to IAM principals in other accounts.
   * If you want to get rid of that behavior, update your CDK version to 1.85.0 or later,
   * and make sure the `&#64;aws-cdk/aws-s3:grantWriteWithoutAcl` feature flag is set to `true`
   * in the `context` key of your cdk.json file.
   * If you've already updated, but still need the principal to have permissions to modify the ACLs,
   * use the `grantPutAcl` method.
   *
   * @param identity The principal. 
   * @param objectsKeyPattern Restrict the permission to a certain key pattern (default '*').
   */
  public fun grantReadWrite(identity: IGrantable): Grant

  /**
   * Grants read/write permissions for this bucket and it's contents to an IAM principal
   * (Role/Group/User).
   *
   * If an encryption key is used, permission to use the key for
   * encrypt/decrypt will also be granted.
   *
   * Before CDK version 1.85.0, this method granted the `s3:PutObject*` permission that included
   * `s3:PutObjectAcl`,
   * which could be used to grant read/write object access to IAM principals in other accounts.
   * If you want to get rid of that behavior, update your CDK version to 1.85.0 or later,
   * and make sure the `&#64;aws-cdk/aws-s3:grantWriteWithoutAcl` feature flag is set to `true`
   * in the `context` key of your cdk.json file.
   * If you've already updated, but still need the principal to have permissions to modify the ACLs,
   * use the `grantPutAcl` method.
   *
   * @param identity The principal. 
   * @param objectsKeyPattern Restrict the permission to a certain key pattern (default '*').
   */
  public fun grantReadWrite(identity: IGrantable, objectsKeyPattern: Any): Grant

  /**
   * Grant write permissions to this bucket to an IAM principal.
   *
   * If encryption is used, permission to use the key to encrypt the contents
   * of written files will also be granted to the same principal.
   *
   * Before CDK version 1.85.0, this method granted the `s3:PutObject*` permission that included
   * `s3:PutObjectAcl`,
   * which could be used to grant read/write object access to IAM principals in other accounts.
   * If you want to get rid of that behavior, update your CDK version to 1.85.0 or later,
   * and make sure the `&#64;aws-cdk/aws-s3:grantWriteWithoutAcl` feature flag is set to `true`
   * in the `context` key of your cdk.json file.
   * If you've already updated, but still need the principal to have permissions to modify the ACLs,
   * use the `grantPutAcl` method.
   *
   * @param identity The principal. 
   * @param objectsKeyPattern Restrict the permission to a certain key pattern (default '*').
   * @param allowedActionPatterns Restrict the permissions to certain list of action patterns.
   */
  public fun grantWrite(identity: IGrantable): Grant

  /**
   * Grant write permissions to this bucket to an IAM principal.
   *
   * If encryption is used, permission to use the key to encrypt the contents
   * of written files will also be granted to the same principal.
   *
   * Before CDK version 1.85.0, this method granted the `s3:PutObject*` permission that included
   * `s3:PutObjectAcl`,
   * which could be used to grant read/write object access to IAM principals in other accounts.
   * If you want to get rid of that behavior, update your CDK version to 1.85.0 or later,
   * and make sure the `&#64;aws-cdk/aws-s3:grantWriteWithoutAcl` feature flag is set to `true`
   * in the `context` key of your cdk.json file.
   * If you've already updated, but still need the principal to have permissions to modify the ACLs,
   * use the `grantPutAcl` method.
   *
   * @param identity The principal. 
   * @param objectsKeyPattern Restrict the permission to a certain key pattern (default '*').
   * @param allowedActionPatterns Restrict the permissions to certain list of action patterns.
   */
  public fun grantWrite(identity: IGrantable, objectsKeyPattern: Any): Grant

  /**
   * Grant write permissions to this bucket to an IAM principal.
   *
   * If encryption is used, permission to use the key to encrypt the contents
   * of written files will also be granted to the same principal.
   *
   * Before CDK version 1.85.0, this method granted the `s3:PutObject*` permission that included
   * `s3:PutObjectAcl`,
   * which could be used to grant read/write object access to IAM principals in other accounts.
   * If you want to get rid of that behavior, update your CDK version to 1.85.0 or later,
   * and make sure the `&#64;aws-cdk/aws-s3:grantWriteWithoutAcl` feature flag is set to `true`
   * in the `context` key of your cdk.json file.
   * If you've already updated, but still need the principal to have permissions to modify the ACLs,
   * use the `grantPutAcl` method.
   *
   * @param identity The principal. 
   * @param objectsKeyPattern Restrict the permission to a certain key pattern (default '*').
   * @param allowedActionPatterns Restrict the permissions to certain list of action patterns.
   */
  public fun grantWrite(
    identity: IGrantable,
    objectsKeyPattern: Any,
    allowedActionPatterns: List<String>,
  ): Grant

  /**
   * If this bucket has been configured for static website hosting.
   */
  public fun isWebsite(): Boolean? = unwrap(this).getIsWebsite()

  /**
   * Defines a CloudWatch event that triggers when something happens to this bucket.
   *
   * Requires that there exists at least one CloudTrail Trail in your account
   * that captures the event. This method will not create the Trail.
   *
   * @param id The id of the rule. 
   * @param options Options for adding the rule.
   */
  public fun onCloudTrailEvent(id: String): Rule

  /**
   * Defines a CloudWatch event that triggers when something happens to this bucket.
   *
   * Requires that there exists at least one CloudTrail Trail in your account
   * that captures the event. This method will not create the Trail.
   *
   * @param id The id of the rule. 
   * @param options Options for adding the rule.
   */
  public fun onCloudTrailEvent(id: String, options: OnCloudTrailBucketEventOptions): Rule

  /**
   * Defines a CloudWatch event that triggers when something happens to this bucket.
   *
   * Requires that there exists at least one CloudTrail Trail in your account
   * that captures the event. This method will not create the Trail.
   *
   * @param id The id of the rule. 
   * @param options Options for adding the rule.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4cd0c76518d5116ba077bce52bf9e46be291fca8a4f15e4595ba45f13df8f9c6")
  public fun onCloudTrailEvent(id: String,
      options: OnCloudTrailBucketEventOptions.Builder.() -> Unit): Rule

  /**
   * Defines an AWS CloudWatch event that triggers when an object is uploaded to the specified paths
   * (keys) in this bucket using the PutObject API call.
   *
   * Note that some tools like `aws s3 cp` will automatically use either
   * PutObject or the multipart upload API depending on the file size,
   * so using `onCloudTrailWriteObject` may be preferable.
   *
   * Requires that there exists at least one CloudTrail Trail in your account
   * that captures the event. This method will not create the Trail.
   *
   * @param id The id of the rule. 
   * @param options Options for adding the rule.
   */
  public fun onCloudTrailPutObject(id: String): Rule

  /**
   * Defines an AWS CloudWatch event that triggers when an object is uploaded to the specified paths
   * (keys) in this bucket using the PutObject API call.
   *
   * Note that some tools like `aws s3 cp` will automatically use either
   * PutObject or the multipart upload API depending on the file size,
   * so using `onCloudTrailWriteObject` may be preferable.
   *
   * Requires that there exists at least one CloudTrail Trail in your account
   * that captures the event. This method will not create the Trail.
   *
   * @param id The id of the rule. 
   * @param options Options for adding the rule.
   */
  public fun onCloudTrailPutObject(id: String, options: OnCloudTrailBucketEventOptions): Rule

  /**
   * Defines an AWS CloudWatch event that triggers when an object is uploaded to the specified paths
   * (keys) in this bucket using the PutObject API call.
   *
   * Note that some tools like `aws s3 cp` will automatically use either
   * PutObject or the multipart upload API depending on the file size,
   * so using `onCloudTrailWriteObject` may be preferable.
   *
   * Requires that there exists at least one CloudTrail Trail in your account
   * that captures the event. This method will not create the Trail.
   *
   * @param id The id of the rule. 
   * @param options Options for adding the rule.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2d5fed31203a03355b138b084c75d516f556d20849243c6ad278b804ab6338f9")
  public fun onCloudTrailPutObject(id: String,
      options: OnCloudTrailBucketEventOptions.Builder.() -> Unit): Rule

  /**
   * Defines an AWS CloudWatch event that triggers when an object at the specified paths (keys) in
   * this bucket are written to.
   *
   * This includes
   * the events PutObject, CopyObject, and CompleteMultipartUpload.
   *
   * Note that some tools like `aws s3 cp` will automatically use either
   * PutObject or the multipart upload API depending on the file size,
   * so using this method may be preferable to `onCloudTrailPutObject`.
   *
   * Requires that there exists at least one CloudTrail Trail in your account
   * that captures the event. This method will not create the Trail.
   *
   * @param id The id of the rule. 
   * @param options Options for adding the rule.
   */
  public fun onCloudTrailWriteObject(id: String): Rule

  /**
   * Defines an AWS CloudWatch event that triggers when an object at the specified paths (keys) in
   * this bucket are written to.
   *
   * This includes
   * the events PutObject, CopyObject, and CompleteMultipartUpload.
   *
   * Note that some tools like `aws s3 cp` will automatically use either
   * PutObject or the multipart upload API depending on the file size,
   * so using this method may be preferable to `onCloudTrailPutObject`.
   *
   * Requires that there exists at least one CloudTrail Trail in your account
   * that captures the event. This method will not create the Trail.
   *
   * @param id The id of the rule. 
   * @param options Options for adding the rule.
   */
  public fun onCloudTrailWriteObject(id: String, options: OnCloudTrailBucketEventOptions): Rule

  /**
   * Defines an AWS CloudWatch event that triggers when an object at the specified paths (keys) in
   * this bucket are written to.
   *
   * This includes
   * the events PutObject, CopyObject, and CompleteMultipartUpload.
   *
   * Note that some tools like `aws s3 cp` will automatically use either
   * PutObject or the multipart upload API depending on the file size,
   * so using this method may be preferable to `onCloudTrailPutObject`.
   *
   * Requires that there exists at least one CloudTrail Trail in your account
   * that captures the event. This method will not create the Trail.
   *
   * @param id The id of the rule. 
   * @param options Options for adding the rule.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d9fbb4bd9cce03262211658cf6196a3d7f430706c9dbdb268a27067a5fbe180e")
  public fun onCloudTrailWriteObject(id: String,
      options: OnCloudTrailBucketEventOptions.Builder.() -> Unit): Rule

  /**
   * The resource policy associated with this bucket.
   *
   * If `autoCreatePolicy` is true, a `BucketPolicy` will be created upon the
   * first call to addToResourcePolicy(s).
   */
  public fun policy(): BucketPolicy? = unwrap(this).getPolicy()?.let(BucketPolicy::wrap)

  /**
   * The resource policy associated with this bucket.
   *
   * If `autoCreatePolicy` is true, a `BucketPolicy` will be created upon the
   * first call to addToResourcePolicy(s).
   */
  public fun policy(`value`: BucketPolicy) {
    unwrap(this).setPolicy(`value`.let(BucketPolicy.Companion::unwrap))
  }

  /**
   * The S3 URL of an S3 object.
   *
   * For example:
   *
   * * `s3://onlybucket`
   * * `s3://bucket/key`
   *
   * @return an ObjectS3Url token
   * @param key The S3 key of the object.
   */
  public fun s3UrlForObject(): String

  /**
   * The S3 URL of an S3 object.
   *
   * For example:
   *
   * * `s3://onlybucket`
   * * `s3://bucket/key`
   *
   * @return an ObjectS3Url token
   * @param key The S3 key of the object.
   */
  public fun s3UrlForObject(key: String): String

  /**
   * The https Transfer Acceleration URL of an S3 object.
   *
   * Specify `dualStack: true` at the options
   * for dual-stack endpoint (connect to the bucket over IPv6). For example:
   *
   * * `https://bucket.s3-accelerate.amazonaws.com`
   * * `https://bucket.s3-accelerate.amazonaws.com/key`
   *
   * @return an TransferAccelerationUrl token
   * @param key The S3 key of the object.
   * @param options Options for generating URL.
   */
  public fun transferAccelerationUrlForObject(): String

  /**
   * The https Transfer Acceleration URL of an S3 object.
   *
   * Specify `dualStack: true` at the options
   * for dual-stack endpoint (connect to the bucket over IPv6). For example:
   *
   * * `https://bucket.s3-accelerate.amazonaws.com`
   * * `https://bucket.s3-accelerate.amazonaws.com/key`
   *
   * @return an TransferAccelerationUrl token
   * @param key The S3 key of the object.
   * @param options Options for generating URL.
   */
  public fun transferAccelerationUrlForObject(key: String): String

  /**
   * The https Transfer Acceleration URL of an S3 object.
   *
   * Specify `dualStack: true` at the options
   * for dual-stack endpoint (connect to the bucket over IPv6). For example:
   *
   * * `https://bucket.s3-accelerate.amazonaws.com`
   * * `https://bucket.s3-accelerate.amazonaws.com/key`
   *
   * @return an TransferAccelerationUrl token
   * @param key The S3 key of the object.
   * @param options Options for generating URL.
   */
  public fun transferAccelerationUrlForObject(key: String, options: TransferAccelerationUrlOptions):
      String

  /**
   * The https Transfer Acceleration URL of an S3 object.
   *
   * Specify `dualStack: true` at the options
   * for dual-stack endpoint (connect to the bucket over IPv6). For example:
   *
   * * `https://bucket.s3-accelerate.amazonaws.com`
   * * `https://bucket.s3-accelerate.amazonaws.com/key`
   *
   * @return an TransferAccelerationUrl token
   * @param key The S3 key of the object.
   * @param options Options for generating URL.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("286947e1f7e12ca5ce2cd4e12ab86eb7b46e333dff5a5f87636bcad53b3e0131")
  public fun transferAccelerationUrlForObject(key: String,
      options: TransferAccelerationUrlOptions.Builder.() -> Unit): String

  /**
   * The https URL of an S3 object. For example:.
   *
   * * `https://s3.us-west-1.amazonaws.com/onlybucket`
   * * `https://s3.us-west-1.amazonaws.com/bucket/key`
   * * `https://s3.cn-north-1.amazonaws.com.cn/china-bucket/mykey`
   *
   * @return an ObjectS3Url token
   * @param key The S3 key of the object.
   */
  public fun urlForObject(): String

  /**
   * The https URL of an S3 object. For example:.
   *
   * * `https://s3.us-west-1.amazonaws.com/onlybucket`
   * * `https://s3.us-west-1.amazonaws.com/bucket/key`
   * * `https://s3.cn-north-1.amazonaws.com.cn/china-bucket/mykey`
   *
   * @return an ObjectS3Url token
   * @param key The S3 key of the object.
   */
  public fun urlForObject(key: String): String

  /**
   * The virtual hosted-style URL of an S3 object. Specify `regional: false` at the options for
   * non-regional URL. For example:.
   *
   * * `https://only-bucket.s3.us-west-1.amazonaws.com`
   * * `https://bucket.s3.us-west-1.amazonaws.com/key`
   * * `https://bucket.s3.amazonaws.com/key`
   * * `https://china-bucket.s3.cn-north-1.amazonaws.com.cn/mykey`
   *
   * @return an ObjectS3Url token
   * @param key The S3 key of the object.
   * @param options Options for generating URL.
   */
  public fun virtualHostedUrlForObject(): String

  /**
   * The virtual hosted-style URL of an S3 object. Specify `regional: false` at the options for
   * non-regional URL. For example:.
   *
   * * `https://only-bucket.s3.us-west-1.amazonaws.com`
   * * `https://bucket.s3.us-west-1.amazonaws.com/key`
   * * `https://bucket.s3.amazonaws.com/key`
   * * `https://china-bucket.s3.cn-north-1.amazonaws.com.cn/mykey`
   *
   * @return an ObjectS3Url token
   * @param key The S3 key of the object.
   * @param options Options for generating URL.
   */
  public fun virtualHostedUrlForObject(key: String): String

  /**
   * The virtual hosted-style URL of an S3 object. Specify `regional: false` at the options for
   * non-regional URL. For example:.
   *
   * * `https://only-bucket.s3.us-west-1.amazonaws.com`
   * * `https://bucket.s3.us-west-1.amazonaws.com/key`
   * * `https://bucket.s3.amazonaws.com/key`
   * * `https://china-bucket.s3.cn-north-1.amazonaws.com.cn/mykey`
   *
   * @return an ObjectS3Url token
   * @param key The S3 key of the object.
   * @param options Options for generating URL.
   */
  public fun virtualHostedUrlForObject(key: String, options: VirtualHostedStyleUrlOptions): String

  /**
   * The virtual hosted-style URL of an S3 object. Specify `regional: false` at the options for
   * non-regional URL. For example:.
   *
   * * `https://only-bucket.s3.us-west-1.amazonaws.com`
   * * `https://bucket.s3.us-west-1.amazonaws.com/key`
   * * `https://bucket.s3.amazonaws.com/key`
   * * `https://china-bucket.s3.cn-north-1.amazonaws.com.cn/mykey`
   *
   * @return an ObjectS3Url token
   * @param key The S3 key of the object.
   * @param options Options for generating URL.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("caf339118414c1ca939dfa7b7d29d0a50714046a0bbf4ebdaa53c4943b6d6371")
  public fun virtualHostedUrlForObject(key: String,
      options: VirtualHostedStyleUrlOptions.Builder.() -> Unit): String

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.s3.IBucket,
  ) : CdkObject(cdkObject),
      IBucket {
    /**
     * Adds a bucket notification event destination.
     *
     * Example:
     *
     * ```
     * Function myLambda;
     * Bucket bucket = new Bucket(this, "MyBucket");
     * bucket.addEventNotification(EventType.OBJECT_CREATED, new LambdaDestination(myLambda),
     * NotificationKeyFilter.builder().prefix("home/myusername/ *").build());
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html)
     * @param event The event to trigger the notification. 
     * @param dest The notification destination (Lambda, SNS Topic or SQS Queue). 
     * @param filters S3 object key filter rules to determine which objects trigger this event. 
     */
    override fun addEventNotification(
      event: EventType,
      dest: IBucketNotificationDestination,
      vararg filters: NotificationKeyFilter,
    ) {
      unwrap(this).addEventNotification(event.let(EventType.Companion::unwrap),
          dest.let(IBucketNotificationDestination.Companion::unwrap),
          *filters.map{CdkObjectWrappers.unwrap(it) as
          software.amazon.awscdk.services.s3.NotificationKeyFilter}.toTypedArray())
    }

    /**
     * Adds a bucket notification event destination.
     *
     * Example:
     *
     * ```
     * Function myLambda;
     * Bucket bucket = new Bucket(this, "MyBucket");
     * bucket.addEventNotification(EventType.OBJECT_CREATED, new LambdaDestination(myLambda),
     * NotificationKeyFilter.builder().prefix("home/myusername/ *").build());
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html)
     * @param event The event to trigger the notification. 
     * @param dest The notification destination (Lambda, SNS Topic or SQS Queue). 
     * @param filters S3 object key filter rules to determine which objects trigger this event. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1d0b56563701e92edca7104c6b251f88497ad21052ff4bd7384db69d23a3f01e")
    override fun addEventNotification(
      event: EventType,
      dest: IBucketNotificationDestination,
      filters: NotificationKeyFilter.Builder.() -> Unit,
    ): Unit = addEventNotification(event, dest, NotificationKeyFilter(filters))

    /**
     * Subscribes a destination to receive notifications when an object is created in the bucket.
     *
     * This is identical to calling
     * `onEvent(s3.EventType.OBJECT_CREATED)`.
     *
     * @param dest The notification destination (see onEvent). 
     * @param filters Filters (see onEvent). 
     */
    override fun addObjectCreatedNotification(dest: IBucketNotificationDestination, vararg
        filters: NotificationKeyFilter) {
      unwrap(this).addObjectCreatedNotification(dest.let(IBucketNotificationDestination.Companion::unwrap),
          *filters.map{CdkObjectWrappers.unwrap(it) as
          software.amazon.awscdk.services.s3.NotificationKeyFilter}.toTypedArray())
    }

    /**
     * Subscribes a destination to receive notifications when an object is created in the bucket.
     *
     * This is identical to calling
     * `onEvent(s3.EventType.OBJECT_CREATED)`.
     *
     * @param dest The notification destination (see onEvent). 
     * @param filters Filters (see onEvent). 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("659a47f023d44060464d0f8501d59228cd0a44f99bad56864cfec5fc46034cd0")
    override fun addObjectCreatedNotification(dest: IBucketNotificationDestination,
        filters: NotificationKeyFilter.Builder.() -> Unit): Unit =
        addObjectCreatedNotification(dest, NotificationKeyFilter(filters))

    /**
     * Subscribes a destination to receive notifications when an object is removed from the bucket.
     *
     * This is identical to calling
     * `onEvent(EventType.OBJECT_REMOVED)`.
     *
     * @param dest The notification destination (see onEvent). 
     * @param filters Filters (see onEvent). 
     */
    override fun addObjectRemovedNotification(dest: IBucketNotificationDestination, vararg
        filters: NotificationKeyFilter) {
      unwrap(this).addObjectRemovedNotification(dest.let(IBucketNotificationDestination.Companion::unwrap),
          *filters.map{CdkObjectWrappers.unwrap(it) as
          software.amazon.awscdk.services.s3.NotificationKeyFilter}.toTypedArray())
    }

    /**
     * Subscribes a destination to receive notifications when an object is removed from the bucket.
     *
     * This is identical to calling
     * `onEvent(EventType.OBJECT_REMOVED)`.
     *
     * @param dest The notification destination (see onEvent). 
     * @param filters Filters (see onEvent). 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ead0379c408a1a59ae83c035b9c29e8fa6206d8cf0f8e3797dd395f1b0845f96")
    override fun addObjectRemovedNotification(dest: IBucketNotificationDestination,
        filters: NotificationKeyFilter.Builder.() -> Unit): Unit =
        addObjectRemovedNotification(dest, NotificationKeyFilter(filters))

    /**
     * Adds a statement to the resource policy for a principal (i.e. account/role/service) to
     * perform actions on this bucket and/or its contents. Use `bucketArn` and `arnForObjects(keys)` to
     * obtain ARNs for this bucket or objects.
     *
     * Note that the policy statement may or may not be added to the policy.
     * For example, when an `IBucket` is created from an existing bucket,
     * it's not possible to tell whether the bucket already has a policy
     * attached, let alone to re-use that policy to add more statements to it.
     * So it's safest to do nothing in these cases.
     *
     * @return metadata about the execution of this method. If the policy
     * was not added, the value of `statementAdded` will be `false`. You
     * should always check this value to make sure that the operation was
     * actually carried out. Otherwise, synthesis and deploy will terminate
     * silently, which may be confusing.
     * @param permission the policy statement to be added to the bucket's policy. 
     */
    override fun addToResourcePolicy(permission: PolicyStatement): AddToResourcePolicyResult =
        unwrap(this).addToResourcePolicy(permission.let(PolicyStatement.Companion::unwrap)).let(AddToResourcePolicyResult::wrap)

    /**
     * Adds a statement to the resource policy for a principal (i.e. account/role/service) to
     * perform actions on this bucket and/or its contents. Use `bucketArn` and `arnForObjects(keys)` to
     * obtain ARNs for this bucket or objects.
     *
     * Note that the policy statement may or may not be added to the policy.
     * For example, when an `IBucket` is created from an existing bucket,
     * it's not possible to tell whether the bucket already has a policy
     * attached, let alone to re-use that policy to add more statements to it.
     * So it's safest to do nothing in these cases.
     *
     * @return metadata about the execution of this method. If the policy
     * was not added, the value of `statementAdded` will be `false`. You
     * should always check this value to make sure that the operation was
     * actually carried out. Otherwise, synthesis and deploy will terminate
     * silently, which may be confusing.
     * @param permission the policy statement to be added to the bucket's policy. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
    override fun addToResourcePolicy(permission: PolicyStatement.Builder.() -> Unit):
        AddToResourcePolicyResult = addToResourcePolicy(PolicyStatement(permission))

    /**
     * Apply the given removal policy to this resource.
     *
     * The Removal Policy controls what happens to this resource when it stops
     * being managed by CloudFormation, either because you've removed it from the
     * CDK application or because you've made a change that requires the resource
     * to be replaced.
     *
     * The resource can be deleted (`RemovalPolicy.DESTROY`), or left in your AWS
     * account for data recovery and cleanup later (`RemovalPolicy.RETAIN`).
     *
     * @param policy 
     */
    override fun applyRemovalPolicy(policy: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy.Companion::unwrap))
    }

    /**
     * Returns an ARN that represents all objects within the bucket that match the key pattern
     * specified.
     *
     * To represent all keys, specify `"*"`.
     *
     * @param keyPattern 
     */
    override fun arnForObjects(keyPattern: String): String = unwrap(this).arnForObjects(keyPattern)

    /**
     * The ARN of the bucket.
     */
    override fun bucketArn(): String = unwrap(this).getBucketArn()

    /**
     * The IPv4 DNS name of the specified bucket.
     */
    override fun bucketDomainName(): String = unwrap(this).getBucketDomainName()

    /**
     * The IPv6 DNS name of the specified bucket.
     */
    override fun bucketDualStackDomainName(): String = unwrap(this).getBucketDualStackDomainName()

    /**
     * The name of the bucket.
     */
    override fun bucketName(): String = unwrap(this).getBucketName()

    /**
     * The regional domain name of the specified bucket.
     */
    override fun bucketRegionalDomainName(): String = unwrap(this).getBucketRegionalDomainName()

    /**
     * The Domain name of the static website.
     */
    override fun bucketWebsiteDomainName(): String = unwrap(this).getBucketWebsiteDomainName()

    /**
     * The URL of the static website.
     */
    override fun bucketWebsiteUrl(): String = unwrap(this).getBucketWebsiteUrl()

    /**
     * Enables event bridge notification, causing all events below to be sent to EventBridge:.
     *
     * * Object Deleted (DeleteObject)
     * * Object Deleted (Lifecycle expiration)
     * * Object Restore Initiated
     * * Object Restore Completed
     * * Object Restore Expired
     * * Object Storage Class Changed
     * * Object Access Tier Changed
     * * Object ACL Updated
     * * Object Tags Added
     * * Object Tags Deleted
     */
    override fun enableEventBridgeNotification() {
      unwrap(this).enableEventBridgeNotification()
    }

    /**
     * Optional KMS encryption key associated with this bucket.
     */
    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    /**
     * The environment this resource belongs to.
     *
     * For resources that are created and managed by the CDK
     * (generally, those created by creating new class instances like Role, Bucket, etc.),
     * this is always the same as the environment of the stack they belong to;
     * however, for imported resources
     * (those obtained from static methods like fromRoleArn, fromBucketName, etc.),
     * that might be different than the stack they were imported into.
     */
    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    /**
     * Grants s3:DeleteObject* permission to an IAM principal for objects in this bucket.
     *
     * @param identity The principal. 
     * @param objectsKeyPattern Restrict the permission to a certain key pattern (default '*').
     */
    override fun grantDelete(identity: IGrantable): Grant =
        unwrap(this).grantDelete(identity.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

    /**
     * Grants s3:DeleteObject* permission to an IAM principal for objects in this bucket.
     *
     * @param identity The principal. 
     * @param objectsKeyPattern Restrict the permission to a certain key pattern (default '*').
     */
    override fun grantDelete(identity: IGrantable, objectsKeyPattern: Any): Grant =
        unwrap(this).grantDelete(identity.let(IGrantable.Companion::unwrap),
        objectsKeyPattern).let(Grant::wrap)

    /**
     * Allows unrestricted access to objects from this bucket.
     *
     * IMPORTANT: This permission allows anyone to perform actions on S3 objects
     * in this bucket, which is useful for when you configure your bucket as a
     * website and want everyone to be able to read objects in the bucket without
     * needing to authenticate.
     *
     * Without arguments, this method will grant read ("s3:GetObject") access to
     * all objects ("*") in the bucket.
     *
     * The method returns the `iam.Grant` object, which can then be modified
     * as needed. For example, you can add a condition that will restrict access only
     * to an IPv4 range like this:
     *
     * ```
     * const grant = bucket.grantPublicAccess();
     * grant.resourceStatement!.addCondition(‘IpAddress’, { “aws:SourceIp”: “54.240.143.0/24” });
     * ```
     *
     * @return The `iam.PolicyStatement` object, which can be used to apply e.g. conditions.
     * @param keyPrefix the prefix of S3 object keys (e.g. `home/ *`). Default is "*".
     * @param allowedActions the set of S3 actions to allow. 
     */
    override fun grantPublicAccess(keyPrefix: String, vararg allowedActions: String): Grant =
        unwrap(this).grantPublicAccess(keyPrefix, *allowedActions.map{CdkObjectWrappers.unwrap(it)
        as String}.toTypedArray()).let(Grant::wrap)

    /**
     * Grants s3:PutObject* and s3:Abort* permissions for this bucket to an IAM principal.
     *
     * If encryption is used, permission to use the key to encrypt the contents
     * of written files will also be granted to the same principal.
     *
     * @param identity The principal. 
     * @param objectsKeyPattern Restrict the permission to a certain key pattern (default '*').
     */
    override fun grantPut(identity: IGrantable): Grant =
        unwrap(this).grantPut(identity.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

    /**
     * Grants s3:PutObject* and s3:Abort* permissions for this bucket to an IAM principal.
     *
     * If encryption is used, permission to use the key to encrypt the contents
     * of written files will also be granted to the same principal.
     *
     * @param identity The principal. 
     * @param objectsKeyPattern Restrict the permission to a certain key pattern (default '*').
     */
    override fun grantPut(identity: IGrantable, objectsKeyPattern: Any): Grant =
        unwrap(this).grantPut(identity.let(IGrantable.Companion::unwrap),
        objectsKeyPattern).let(Grant::wrap)

    /**
     * Grant the given IAM identity permissions to modify the ACLs of objects in the given Bucket.
     *
     * If your application has the '&#64;aws-cdk/aws-s3:grantWriteWithoutAcl' feature flag set,
     * calling `grantWrite` or `grantReadWrite` no longer grants permissions to modify the ACLs of
     * the objects;
     * in this case, if you need to modify object ACLs, call this method explicitly.
     *
     * @param identity The principal. 
     * @param objectsKeyPattern Restrict the permission to a certain key pattern (default '*').
     */
    override fun grantPutAcl(identity: IGrantable): Grant =
        unwrap(this).grantPutAcl(identity.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

    /**
     * Grant the given IAM identity permissions to modify the ACLs of objects in the given Bucket.
     *
     * If your application has the '&#64;aws-cdk/aws-s3:grantWriteWithoutAcl' feature flag set,
     * calling `grantWrite` or `grantReadWrite` no longer grants permissions to modify the ACLs of
     * the objects;
     * in this case, if you need to modify object ACLs, call this method explicitly.
     *
     * @param identity The principal. 
     * @param objectsKeyPattern Restrict the permission to a certain key pattern (default '*').
     */
    override fun grantPutAcl(identity: IGrantable, objectsKeyPattern: String): Grant =
        unwrap(this).grantPutAcl(identity.let(IGrantable.Companion::unwrap),
        objectsKeyPattern).let(Grant::wrap)

    /**
     * Grant read permissions for this bucket and it's contents to an IAM principal
     * (Role/Group/User).
     *
     * If encryption is used, permission to use the key to decrypt the contents
     * of the bucket will also be granted to the same principal.
     *
     * @param identity The principal. 
     * @param objectsKeyPattern Restrict the permission to a certain key pattern (default '*').
     */
    override fun grantRead(identity: IGrantable): Grant =
        unwrap(this).grantRead(identity.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

    /**
     * Grant read permissions for this bucket and it's contents to an IAM principal
     * (Role/Group/User).
     *
     * If encryption is used, permission to use the key to decrypt the contents
     * of the bucket will also be granted to the same principal.
     *
     * @param identity The principal. 
     * @param objectsKeyPattern Restrict the permission to a certain key pattern (default '*').
     */
    override fun grantRead(identity: IGrantable, objectsKeyPattern: Any): Grant =
        unwrap(this).grantRead(identity.let(IGrantable.Companion::unwrap),
        objectsKeyPattern).let(Grant::wrap)

    /**
     * Grants read/write permissions for this bucket and it's contents to an IAM principal
     * (Role/Group/User).
     *
     * If an encryption key is used, permission to use the key for
     * encrypt/decrypt will also be granted.
     *
     * Before CDK version 1.85.0, this method granted the `s3:PutObject*` permission that included
     * `s3:PutObjectAcl`,
     * which could be used to grant read/write object access to IAM principals in other accounts.
     * If you want to get rid of that behavior, update your CDK version to 1.85.0 or later,
     * and make sure the `&#64;aws-cdk/aws-s3:grantWriteWithoutAcl` feature flag is set to `true`
     * in the `context` key of your cdk.json file.
     * If you've already updated, but still need the principal to have permissions to modify the
     * ACLs,
     * use the `grantPutAcl` method.
     *
     * @param identity The principal. 
     * @param objectsKeyPattern Restrict the permission to a certain key pattern (default '*').
     */
    override fun grantReadWrite(identity: IGrantable): Grant =
        unwrap(this).grantReadWrite(identity.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

    /**
     * Grants read/write permissions for this bucket and it's contents to an IAM principal
     * (Role/Group/User).
     *
     * If an encryption key is used, permission to use the key for
     * encrypt/decrypt will also be granted.
     *
     * Before CDK version 1.85.0, this method granted the `s3:PutObject*` permission that included
     * `s3:PutObjectAcl`,
     * which could be used to grant read/write object access to IAM principals in other accounts.
     * If you want to get rid of that behavior, update your CDK version to 1.85.0 or later,
     * and make sure the `&#64;aws-cdk/aws-s3:grantWriteWithoutAcl` feature flag is set to `true`
     * in the `context` key of your cdk.json file.
     * If you've already updated, but still need the principal to have permissions to modify the
     * ACLs,
     * use the `grantPutAcl` method.
     *
     * @param identity The principal. 
     * @param objectsKeyPattern Restrict the permission to a certain key pattern (default '*').
     */
    override fun grantReadWrite(identity: IGrantable, objectsKeyPattern: Any): Grant =
        unwrap(this).grantReadWrite(identity.let(IGrantable.Companion::unwrap),
        objectsKeyPattern).let(Grant::wrap)

    /**
     * Grant write permissions to this bucket to an IAM principal.
     *
     * If encryption is used, permission to use the key to encrypt the contents
     * of written files will also be granted to the same principal.
     *
     * Before CDK version 1.85.0, this method granted the `s3:PutObject*` permission that included
     * `s3:PutObjectAcl`,
     * which could be used to grant read/write object access to IAM principals in other accounts.
     * If you want to get rid of that behavior, update your CDK version to 1.85.0 or later,
     * and make sure the `&#64;aws-cdk/aws-s3:grantWriteWithoutAcl` feature flag is set to `true`
     * in the `context` key of your cdk.json file.
     * If you've already updated, but still need the principal to have permissions to modify the
     * ACLs,
     * use the `grantPutAcl` method.
     *
     * @param identity The principal. 
     * @param objectsKeyPattern Restrict the permission to a certain key pattern (default '*').
     * @param allowedActionPatterns Restrict the permissions to certain list of action patterns.
     */
    override fun grantWrite(identity: IGrantable): Grant =
        unwrap(this).grantWrite(identity.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

    /**
     * Grant write permissions to this bucket to an IAM principal.
     *
     * If encryption is used, permission to use the key to encrypt the contents
     * of written files will also be granted to the same principal.
     *
     * Before CDK version 1.85.0, this method granted the `s3:PutObject*` permission that included
     * `s3:PutObjectAcl`,
     * which could be used to grant read/write object access to IAM principals in other accounts.
     * If you want to get rid of that behavior, update your CDK version to 1.85.0 or later,
     * and make sure the `&#64;aws-cdk/aws-s3:grantWriteWithoutAcl` feature flag is set to `true`
     * in the `context` key of your cdk.json file.
     * If you've already updated, but still need the principal to have permissions to modify the
     * ACLs,
     * use the `grantPutAcl` method.
     *
     * @param identity The principal. 
     * @param objectsKeyPattern Restrict the permission to a certain key pattern (default '*').
     * @param allowedActionPatterns Restrict the permissions to certain list of action patterns.
     */
    override fun grantWrite(identity: IGrantable, objectsKeyPattern: Any): Grant =
        unwrap(this).grantWrite(identity.let(IGrantable.Companion::unwrap),
        objectsKeyPattern).let(Grant::wrap)

    /**
     * Grant write permissions to this bucket to an IAM principal.
     *
     * If encryption is used, permission to use the key to encrypt the contents
     * of written files will also be granted to the same principal.
     *
     * Before CDK version 1.85.0, this method granted the `s3:PutObject*` permission that included
     * `s3:PutObjectAcl`,
     * which could be used to grant read/write object access to IAM principals in other accounts.
     * If you want to get rid of that behavior, update your CDK version to 1.85.0 or later,
     * and make sure the `&#64;aws-cdk/aws-s3:grantWriteWithoutAcl` feature flag is set to `true`
     * in the `context` key of your cdk.json file.
     * If you've already updated, but still need the principal to have permissions to modify the
     * ACLs,
     * use the `grantPutAcl` method.
     *
     * @param identity The principal. 
     * @param objectsKeyPattern Restrict the permission to a certain key pattern (default '*').
     * @param allowedActionPatterns Restrict the permissions to certain list of action patterns.
     */
    override fun grantWrite(
      identity: IGrantable,
      objectsKeyPattern: Any,
      allowedActionPatterns: List<String>,
    ): Grant = unwrap(this).grantWrite(identity.let(IGrantable.Companion::unwrap),
        objectsKeyPattern, allowedActionPatterns).let(Grant::wrap)

    /**
     * If this bucket has been configured for static website hosting.
     */
    override fun isWebsite(): Boolean? = unwrap(this).getIsWebsite()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * Defines a CloudWatch event that triggers when something happens to this bucket.
     *
     * Requires that there exists at least one CloudTrail Trail in your account
     * that captures the event. This method will not create the Trail.
     *
     * @param id The id of the rule. 
     * @param options Options for adding the rule.
     */
    override fun onCloudTrailEvent(id: String): Rule =
        unwrap(this).onCloudTrailEvent(id).let(Rule::wrap)

    /**
     * Defines a CloudWatch event that triggers when something happens to this bucket.
     *
     * Requires that there exists at least one CloudTrail Trail in your account
     * that captures the event. This method will not create the Trail.
     *
     * @param id The id of the rule. 
     * @param options Options for adding the rule.
     */
    override fun onCloudTrailEvent(id: String, options: OnCloudTrailBucketEventOptions): Rule =
        unwrap(this).onCloudTrailEvent(id,
        options.let(OnCloudTrailBucketEventOptions.Companion::unwrap)).let(Rule::wrap)

    /**
     * Defines a CloudWatch event that triggers when something happens to this bucket.
     *
     * Requires that there exists at least one CloudTrail Trail in your account
     * that captures the event. This method will not create the Trail.
     *
     * @param id The id of the rule. 
     * @param options Options for adding the rule.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4cd0c76518d5116ba077bce52bf9e46be291fca8a4f15e4595ba45f13df8f9c6")
    override fun onCloudTrailEvent(id: String,
        options: OnCloudTrailBucketEventOptions.Builder.() -> Unit): Rule = onCloudTrailEvent(id,
        OnCloudTrailBucketEventOptions(options))

    /**
     * Defines an AWS CloudWatch event that triggers when an object is uploaded to the specified
     * paths (keys) in this bucket using the PutObject API call.
     *
     * Note that some tools like `aws s3 cp` will automatically use either
     * PutObject or the multipart upload API depending on the file size,
     * so using `onCloudTrailWriteObject` may be preferable.
     *
     * Requires that there exists at least one CloudTrail Trail in your account
     * that captures the event. This method will not create the Trail.
     *
     * @param id The id of the rule. 
     * @param options Options for adding the rule.
     */
    override fun onCloudTrailPutObject(id: String): Rule =
        unwrap(this).onCloudTrailPutObject(id).let(Rule::wrap)

    /**
     * Defines an AWS CloudWatch event that triggers when an object is uploaded to the specified
     * paths (keys) in this bucket using the PutObject API call.
     *
     * Note that some tools like `aws s3 cp` will automatically use either
     * PutObject or the multipart upload API depending on the file size,
     * so using `onCloudTrailWriteObject` may be preferable.
     *
     * Requires that there exists at least one CloudTrail Trail in your account
     * that captures the event. This method will not create the Trail.
     *
     * @param id The id of the rule. 
     * @param options Options for adding the rule.
     */
    override fun onCloudTrailPutObject(id: String, options: OnCloudTrailBucketEventOptions): Rule =
        unwrap(this).onCloudTrailPutObject(id,
        options.let(OnCloudTrailBucketEventOptions.Companion::unwrap)).let(Rule::wrap)

    /**
     * Defines an AWS CloudWatch event that triggers when an object is uploaded to the specified
     * paths (keys) in this bucket using the PutObject API call.
     *
     * Note that some tools like `aws s3 cp` will automatically use either
     * PutObject or the multipart upload API depending on the file size,
     * so using `onCloudTrailWriteObject` may be preferable.
     *
     * Requires that there exists at least one CloudTrail Trail in your account
     * that captures the event. This method will not create the Trail.
     *
     * @param id The id of the rule. 
     * @param options Options for adding the rule.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2d5fed31203a03355b138b084c75d516f556d20849243c6ad278b804ab6338f9")
    override fun onCloudTrailPutObject(id: String,
        options: OnCloudTrailBucketEventOptions.Builder.() -> Unit): Rule =
        onCloudTrailPutObject(id, OnCloudTrailBucketEventOptions(options))

    /**
     * Defines an AWS CloudWatch event that triggers when an object at the specified paths (keys) in
     * this bucket are written to.
     *
     * This includes
     * the events PutObject, CopyObject, and CompleteMultipartUpload.
     *
     * Note that some tools like `aws s3 cp` will automatically use either
     * PutObject or the multipart upload API depending on the file size,
     * so using this method may be preferable to `onCloudTrailPutObject`.
     *
     * Requires that there exists at least one CloudTrail Trail in your account
     * that captures the event. This method will not create the Trail.
     *
     * @param id The id of the rule. 
     * @param options Options for adding the rule.
     */
    override fun onCloudTrailWriteObject(id: String): Rule =
        unwrap(this).onCloudTrailWriteObject(id).let(Rule::wrap)

    /**
     * Defines an AWS CloudWatch event that triggers when an object at the specified paths (keys) in
     * this bucket are written to.
     *
     * This includes
     * the events PutObject, CopyObject, and CompleteMultipartUpload.
     *
     * Note that some tools like `aws s3 cp` will automatically use either
     * PutObject or the multipart upload API depending on the file size,
     * so using this method may be preferable to `onCloudTrailPutObject`.
     *
     * Requires that there exists at least one CloudTrail Trail in your account
     * that captures the event. This method will not create the Trail.
     *
     * @param id The id of the rule. 
     * @param options Options for adding the rule.
     */
    override fun onCloudTrailWriteObject(id: String, options: OnCloudTrailBucketEventOptions): Rule
        = unwrap(this).onCloudTrailWriteObject(id,
        options.let(OnCloudTrailBucketEventOptions.Companion::unwrap)).let(Rule::wrap)

    /**
     * Defines an AWS CloudWatch event that triggers when an object at the specified paths (keys) in
     * this bucket are written to.
     *
     * This includes
     * the events PutObject, CopyObject, and CompleteMultipartUpload.
     *
     * Note that some tools like `aws s3 cp` will automatically use either
     * PutObject or the multipart upload API depending on the file size,
     * so using this method may be preferable to `onCloudTrailPutObject`.
     *
     * Requires that there exists at least one CloudTrail Trail in your account
     * that captures the event. This method will not create the Trail.
     *
     * @param id The id of the rule. 
     * @param options Options for adding the rule.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d9fbb4bd9cce03262211658cf6196a3d7f430706c9dbdb268a27067a5fbe180e")
    override fun onCloudTrailWriteObject(id: String,
        options: OnCloudTrailBucketEventOptions.Builder.() -> Unit): Rule =
        onCloudTrailWriteObject(id, OnCloudTrailBucketEventOptions(options))

    /**
     * The resource policy associated with this bucket.
     *
     * If `autoCreatePolicy` is true, a `BucketPolicy` will be created upon the
     * first call to addToResourcePolicy(s).
     */
    override fun policy(): BucketPolicy? = unwrap(this).getPolicy()?.let(BucketPolicy::wrap)

    /**
     * The resource policy associated with this bucket.
     *
     * If `autoCreatePolicy` is true, a `BucketPolicy` will be created upon the
     * first call to addToResourcePolicy(s).
     */
    override fun policy(`value`: BucketPolicy) {
      unwrap(this).setPolicy(`value`.let(BucketPolicy.Companion::unwrap))
    }

    /**
     * The S3 URL of an S3 object.
     *
     * For example:
     *
     * * `s3://onlybucket`
     * * `s3://bucket/key`
     *
     * @return an ObjectS3Url token
     * @param key The S3 key of the object.
     */
    override fun s3UrlForObject(): String = unwrap(this).s3UrlForObject()

    /**
     * The S3 URL of an S3 object.
     *
     * For example:
     *
     * * `s3://onlybucket`
     * * `s3://bucket/key`
     *
     * @return an ObjectS3Url token
     * @param key The S3 key of the object.
     */
    override fun s3UrlForObject(key: String): String = unwrap(this).s3UrlForObject(key)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    /**
     * The https Transfer Acceleration URL of an S3 object.
     *
     * Specify `dualStack: true` at the options
     * for dual-stack endpoint (connect to the bucket over IPv6). For example:
     *
     * * `https://bucket.s3-accelerate.amazonaws.com`
     * * `https://bucket.s3-accelerate.amazonaws.com/key`
     *
     * @return an TransferAccelerationUrl token
     * @param key The S3 key of the object.
     * @param options Options for generating URL.
     */
    override fun transferAccelerationUrlForObject(): String =
        unwrap(this).transferAccelerationUrlForObject()

    /**
     * The https Transfer Acceleration URL of an S3 object.
     *
     * Specify `dualStack: true` at the options
     * for dual-stack endpoint (connect to the bucket over IPv6). For example:
     *
     * * `https://bucket.s3-accelerate.amazonaws.com`
     * * `https://bucket.s3-accelerate.amazonaws.com/key`
     *
     * @return an TransferAccelerationUrl token
     * @param key The S3 key of the object.
     * @param options Options for generating URL.
     */
    override fun transferAccelerationUrlForObject(key: String): String =
        unwrap(this).transferAccelerationUrlForObject(key)

    /**
     * The https Transfer Acceleration URL of an S3 object.
     *
     * Specify `dualStack: true` at the options
     * for dual-stack endpoint (connect to the bucket over IPv6). For example:
     *
     * * `https://bucket.s3-accelerate.amazonaws.com`
     * * `https://bucket.s3-accelerate.amazonaws.com/key`
     *
     * @return an TransferAccelerationUrl token
     * @param key The S3 key of the object.
     * @param options Options for generating URL.
     */
    override fun transferAccelerationUrlForObject(key: String,
        options: TransferAccelerationUrlOptions): String =
        unwrap(this).transferAccelerationUrlForObject(key,
        options.let(TransferAccelerationUrlOptions.Companion::unwrap))

    /**
     * The https Transfer Acceleration URL of an S3 object.
     *
     * Specify `dualStack: true` at the options
     * for dual-stack endpoint (connect to the bucket over IPv6). For example:
     *
     * * `https://bucket.s3-accelerate.amazonaws.com`
     * * `https://bucket.s3-accelerate.amazonaws.com/key`
     *
     * @return an TransferAccelerationUrl token
     * @param key The S3 key of the object.
     * @param options Options for generating URL.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("286947e1f7e12ca5ce2cd4e12ab86eb7b46e333dff5a5f87636bcad53b3e0131")
    override fun transferAccelerationUrlForObject(key: String,
        options: TransferAccelerationUrlOptions.Builder.() -> Unit): String =
        transferAccelerationUrlForObject(key, TransferAccelerationUrlOptions(options))

    /**
     * The https URL of an S3 object. For example:.
     *
     * * `https://s3.us-west-1.amazonaws.com/onlybucket`
     * * `https://s3.us-west-1.amazonaws.com/bucket/key`
     * * `https://s3.cn-north-1.amazonaws.com.cn/china-bucket/mykey`
     *
     * @return an ObjectS3Url token
     * @param key The S3 key of the object.
     */
    override fun urlForObject(): String = unwrap(this).urlForObject()

    /**
     * The https URL of an S3 object. For example:.
     *
     * * `https://s3.us-west-1.amazonaws.com/onlybucket`
     * * `https://s3.us-west-1.amazonaws.com/bucket/key`
     * * `https://s3.cn-north-1.amazonaws.com.cn/china-bucket/mykey`
     *
     * @return an ObjectS3Url token
     * @param key The S3 key of the object.
     */
    override fun urlForObject(key: String): String = unwrap(this).urlForObject(key)

    /**
     * The virtual hosted-style URL of an S3 object. Specify `regional: false` at the options for
     * non-regional URL. For example:.
     *
     * * `https://only-bucket.s3.us-west-1.amazonaws.com`
     * * `https://bucket.s3.us-west-1.amazonaws.com/key`
     * * `https://bucket.s3.amazonaws.com/key`
     * * `https://china-bucket.s3.cn-north-1.amazonaws.com.cn/mykey`
     *
     * @return an ObjectS3Url token
     * @param key The S3 key of the object.
     * @param options Options for generating URL.
     */
    override fun virtualHostedUrlForObject(): String = unwrap(this).virtualHostedUrlForObject()

    /**
     * The virtual hosted-style URL of an S3 object. Specify `regional: false` at the options for
     * non-regional URL. For example:.
     *
     * * `https://only-bucket.s3.us-west-1.amazonaws.com`
     * * `https://bucket.s3.us-west-1.amazonaws.com/key`
     * * `https://bucket.s3.amazonaws.com/key`
     * * `https://china-bucket.s3.cn-north-1.amazonaws.com.cn/mykey`
     *
     * @return an ObjectS3Url token
     * @param key The S3 key of the object.
     * @param options Options for generating URL.
     */
    override fun virtualHostedUrlForObject(key: String): String =
        unwrap(this).virtualHostedUrlForObject(key)

    /**
     * The virtual hosted-style URL of an S3 object. Specify `regional: false` at the options for
     * non-regional URL. For example:.
     *
     * * `https://only-bucket.s3.us-west-1.amazonaws.com`
     * * `https://bucket.s3.us-west-1.amazonaws.com/key`
     * * `https://bucket.s3.amazonaws.com/key`
     * * `https://china-bucket.s3.cn-north-1.amazonaws.com.cn/mykey`
     *
     * @return an ObjectS3Url token
     * @param key The S3 key of the object.
     * @param options Options for generating URL.
     */
    override fun virtualHostedUrlForObject(key: String, options: VirtualHostedStyleUrlOptions):
        String = unwrap(this).virtualHostedUrlForObject(key,
        options.let(VirtualHostedStyleUrlOptions.Companion::unwrap))

    /**
     * The virtual hosted-style URL of an S3 object. Specify `regional: false` at the options for
     * non-regional URL. For example:.
     *
     * * `https://only-bucket.s3.us-west-1.amazonaws.com`
     * * `https://bucket.s3.us-west-1.amazonaws.com/key`
     * * `https://bucket.s3.amazonaws.com/key`
     * * `https://china-bucket.s3.cn-north-1.amazonaws.com.cn/mykey`
     *
     * @return an ObjectS3Url token
     * @param key The S3 key of the object.
     * @param options Options for generating URL.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("caf339118414c1ca939dfa7b7d29d0a50714046a0bbf4ebdaa53c4943b6d6371")
    override fun virtualHostedUrlForObject(key: String,
        options: VirtualHostedStyleUrlOptions.Builder.() -> Unit): String =
        virtualHostedUrlForObject(key, VirtualHostedStyleUrlOptions(options))
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.IBucket): IBucket =
        CdkObjectWrappers.wrap(cdkObject) as? IBucket ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IBucket): software.amazon.awscdk.services.s3.IBucket = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.s3.IBucket
  }
}
