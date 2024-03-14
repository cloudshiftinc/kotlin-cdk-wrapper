package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.events.Rule
import io.cloudshiftdev.awscdk.services.iam.AddToResourcePolicyResult
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public abstract class BucketBase internal constructor(
  private val cdkObject: software.amazon.awscdk.services.s3.BucketBase,
) : Resource(cdkObject), IBucket {
  public override fun addEventNotification(
    event: EventType,
    dest: IBucketNotificationDestination,
    filters: NotificationKeyFilter,
  ) {
    unwrap(this).addEventNotification(event.let(EventType::unwrap),
        dest.let(IBucketNotificationDestination::unwrap),
        filters.let(NotificationKeyFilter::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1d0b56563701e92edca7104c6b251f88497ad21052ff4bd7384db69d23a3f01e")
  public override fun addEventNotification(
    event: EventType,
    dest: IBucketNotificationDestination,
    filters: NotificationKeyFilter.Builder.() -> Unit,
  ): Unit = addEventNotification(event, dest, NotificationKeyFilter(filters))

  public override fun addObjectCreatedNotification(dest: IBucketNotificationDestination,
      filters: NotificationKeyFilter) {
    unwrap(this).addObjectCreatedNotification(dest.let(IBucketNotificationDestination::unwrap),
        filters.let(NotificationKeyFilter::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("659a47f023d44060464d0f8501d59228cd0a44f99bad56864cfec5fc46034cd0")
  public override fun addObjectCreatedNotification(dest: IBucketNotificationDestination,
      filters: NotificationKeyFilter.Builder.() -> Unit): Unit = addObjectCreatedNotification(dest,
      NotificationKeyFilter(filters))

  public override fun addObjectRemovedNotification(dest: IBucketNotificationDestination,
      filters: NotificationKeyFilter) {
    unwrap(this).addObjectRemovedNotification(dest.let(IBucketNotificationDestination::unwrap),
        filters.let(NotificationKeyFilter::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ead0379c408a1a59ae83c035b9c29e8fa6206d8cf0f8e3797dd395f1b0845f96")
  public override fun addObjectRemovedNotification(dest: IBucketNotificationDestination,
      filters: NotificationKeyFilter.Builder.() -> Unit): Unit = addObjectRemovedNotification(dest,
      NotificationKeyFilter(filters))

  public override fun addToResourcePolicy(permission: PolicyStatement): AddToResourcePolicyResult =
      unwrap(this).addToResourcePolicy(permission.let(PolicyStatement::unwrap)).let(AddToResourcePolicyResult::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
  public override fun addToResourcePolicy(permission: PolicyStatement.Builder.() -> Unit):
      AddToResourcePolicyResult = addToResourcePolicy(PolicyStatement(permission))

  public override fun arnForObjects(keyPattern: String): String =
      unwrap(this).arnForObjects(keyPattern)

  public override fun bucketArn(): String = unwrap(this).getBucketArn()

  public override fun bucketDomainName(): String = unwrap(this).getBucketDomainName()

  public override fun bucketDualStackDomainName(): String =
      unwrap(this).getBucketDualStackDomainName()

  public override fun bucketName(): String = unwrap(this).getBucketName()

  public override fun bucketRegionalDomainName(): String =
      unwrap(this).getBucketRegionalDomainName()

  public override fun bucketWebsiteDomainName(): String = unwrap(this).getBucketWebsiteDomainName()

  public override fun bucketWebsiteUrl(): String = unwrap(this).getBucketWebsiteUrl()

  public override fun enableEventBridgeNotification() {
    unwrap(this).enableEventBridgeNotification()
  }

  public override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  public override fun grantDelete(identity: IGrantable): Grant =
      unwrap(this).grantDelete(identity.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun grantDelete(identity: IGrantable, objectsKeyPattern: Any): Grant =
      unwrap(this).grantDelete(identity.let(IGrantable::unwrap), objectsKeyPattern).let(Grant::wrap)

  public override fun grantPublicAccess(keyPrefix: String, allowedActions: String): Grant =
      unwrap(this).grantPublicAccess(keyPrefix, allowedActions).let(Grant::wrap)

  public override fun grantPut(identity: IGrantable): Grant =
      unwrap(this).grantPut(identity.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun grantPut(identity: IGrantable, objectsKeyPattern: Any): Grant =
      unwrap(this).grantPut(identity.let(IGrantable::unwrap), objectsKeyPattern).let(Grant::wrap)

  public override fun grantPutAcl(identity: IGrantable): Grant =
      unwrap(this).grantPutAcl(identity.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun grantPutAcl(identity: IGrantable, objectsKeyPattern: String): Grant =
      unwrap(this).grantPutAcl(identity.let(IGrantable::unwrap), objectsKeyPattern).let(Grant::wrap)

  public override fun grantRead(identity: IGrantable): Grant =
      unwrap(this).grantRead(identity.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun grantRead(identity: IGrantable, objectsKeyPattern: Any): Grant =
      unwrap(this).grantRead(identity.let(IGrantable::unwrap), objectsKeyPattern).let(Grant::wrap)

  public override fun grantReadWrite(identity: IGrantable): Grant =
      unwrap(this).grantReadWrite(identity.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun grantReadWrite(identity: IGrantable, objectsKeyPattern: Any): Grant =
      unwrap(this).grantReadWrite(identity.let(IGrantable::unwrap),
      objectsKeyPattern).let(Grant::wrap)

  public override fun grantWrite(identity: IGrantable): Grant =
      unwrap(this).grantWrite(identity.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun grantWrite(identity: IGrantable, objectsKeyPattern: Any): Grant =
      unwrap(this).grantWrite(identity.let(IGrantable::unwrap), objectsKeyPattern).let(Grant::wrap)

  public override fun grantWrite(
    identity: IGrantable,
    objectsKeyPattern: Any,
    allowedActionPatterns: List<String>,
  ): Grant = unwrap(this).grantWrite(identity.let(IGrantable::unwrap), objectsKeyPattern,
      allowedActionPatterns).let(Grant::wrap)

  public override fun isWebsite(): Boolean? = unwrap(this).getIsWebsite()

  public override fun onCloudTrailEvent(id: String): Rule =
      unwrap(this).onCloudTrailEvent(id).let(Rule::wrap)

  public override fun onCloudTrailEvent(id: String, options: OnCloudTrailBucketEventOptions): Rule =
      unwrap(this).onCloudTrailEvent(id,
      options.let(OnCloudTrailBucketEventOptions::unwrap)).let(Rule::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4cd0c76518d5116ba077bce52bf9e46be291fca8a4f15e4595ba45f13df8f9c6")
  public override fun onCloudTrailEvent(id: String,
      options: OnCloudTrailBucketEventOptions.Builder.() -> Unit): Rule = onCloudTrailEvent(id,
      OnCloudTrailBucketEventOptions(options))

  public override fun onCloudTrailPutObject(id: String): Rule =
      unwrap(this).onCloudTrailPutObject(id).let(Rule::wrap)

  public override fun onCloudTrailPutObject(id: String, options: OnCloudTrailBucketEventOptions):
      Rule = unwrap(this).onCloudTrailPutObject(id,
      options.let(OnCloudTrailBucketEventOptions::unwrap)).let(Rule::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2d5fed31203a03355b138b084c75d516f556d20849243c6ad278b804ab6338f9")
  public override fun onCloudTrailPutObject(id: String,
      options: OnCloudTrailBucketEventOptions.Builder.() -> Unit): Rule = onCloudTrailPutObject(id,
      OnCloudTrailBucketEventOptions(options))

  public override fun onCloudTrailWriteObject(id: String): Rule =
      unwrap(this).onCloudTrailWriteObject(id).let(Rule::wrap)

  public override fun onCloudTrailWriteObject(id: String, options: OnCloudTrailBucketEventOptions):
      Rule = unwrap(this).onCloudTrailWriteObject(id,
      options.let(OnCloudTrailBucketEventOptions::unwrap)).let(Rule::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d9fbb4bd9cce03262211658cf6196a3d7f430706c9dbdb268a27067a5fbe180e")
  public override fun onCloudTrailWriteObject(id: String,
      options: OnCloudTrailBucketEventOptions.Builder.() -> Unit): Rule =
      onCloudTrailWriteObject(id, OnCloudTrailBucketEventOptions(options))

  public override fun policy(): BucketPolicy? = unwrap(this).getPolicy()?.let(BucketPolicy::wrap)

  public override fun policy(arg0: BucketPolicy) {
    unwrap(this).setPolicy(arg0.let(BucketPolicy::unwrap))
  }

  public override fun s3UrlForObject(): String = unwrap(this).s3UrlForObject()

  public override fun s3UrlForObject(key: String): String = unwrap(this).s3UrlForObject(key)

  public override fun transferAccelerationUrlForObject(): String =
      unwrap(this).transferAccelerationUrlForObject()

  public override fun transferAccelerationUrlForObject(key: String): String =
      unwrap(this).transferAccelerationUrlForObject(key)

  public override fun transferAccelerationUrlForObject(key: String,
      options: TransferAccelerationUrlOptions): String =
      unwrap(this).transferAccelerationUrlForObject(key,
      options.let(TransferAccelerationUrlOptions::unwrap))

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("286947e1f7e12ca5ce2cd4e12ab86eb7b46e333dff5a5f87636bcad53b3e0131")
  public override fun transferAccelerationUrlForObject(key: String,
      options: TransferAccelerationUrlOptions.Builder.() -> Unit): String =
      transferAccelerationUrlForObject(key, TransferAccelerationUrlOptions(options))

  public override fun urlForObject(): String = unwrap(this).urlForObject()

  public override fun urlForObject(key: String): String = unwrap(this).urlForObject(key)

  public override fun virtualHostedUrlForObject(): String = unwrap(this).virtualHostedUrlForObject()

  public override fun virtualHostedUrlForObject(key: String): String =
      unwrap(this).virtualHostedUrlForObject(key)

  public override fun virtualHostedUrlForObject(key: String, options: VirtualHostedStyleUrlOptions):
      String = unwrap(this).virtualHostedUrlForObject(key,
      options.let(VirtualHostedStyleUrlOptions::unwrap))

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("caf339118414c1ca939dfa7b7d29d0a50714046a0bbf4ebdaa53c4943b6d6371")
  public override fun virtualHostedUrlForObject(key: String,
      options: VirtualHostedStyleUrlOptions.Builder.() -> Unit): String =
      virtualHostedUrlForObject(key, VirtualHostedStyleUrlOptions(options))

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.s3.BucketBase,
  ) : BucketBase(cdkObject)

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.BucketBase): BucketBase =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: BucketBase): software.amazon.awscdk.services.s3.BucketBase =
        (wrapped as Wrapper).cdkObject
  }
}
