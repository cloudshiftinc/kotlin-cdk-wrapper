@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
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

public interface IBucket : IResource {
  public fun addEventNotification(
    arg0: EventType,
    arg1: IBucketNotificationDestination,
    arg2: NotificationKeyFilter,
  )

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1d0b56563701e92edca7104c6b251f88497ad21052ff4bd7384db69d23a3f01e")
  public fun addEventNotification(
    arg0: EventType,
    arg1: IBucketNotificationDestination,
    arg2: NotificationKeyFilter.Builder.() -> Unit,
  )

  public fun addObjectCreatedNotification(arg0: IBucketNotificationDestination,
      arg1: NotificationKeyFilter)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("659a47f023d44060464d0f8501d59228cd0a44f99bad56864cfec5fc46034cd0")
  public fun addObjectCreatedNotification(arg0: IBucketNotificationDestination,
      arg1: NotificationKeyFilter.Builder.() -> Unit)

  public fun addObjectRemovedNotification(arg0: IBucketNotificationDestination,
      arg1: NotificationKeyFilter)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ead0379c408a1a59ae83c035b9c29e8fa6206d8cf0f8e3797dd395f1b0845f96")
  public fun addObjectRemovedNotification(arg0: IBucketNotificationDestination,
      arg1: NotificationKeyFilter.Builder.() -> Unit)

  public fun addToResourcePolicy(arg0: PolicyStatement): AddToResourcePolicyResult

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
  public fun addToResourcePolicy(arg0: PolicyStatement.Builder.() -> Unit):
      AddToResourcePolicyResult

  public fun arnForObjects(arg0: String): String

  public fun bucketArn(): String

  public fun bucketDomainName(): String

  public fun bucketDualStackDomainName(): String

  public fun bucketName(): String

  public fun bucketRegionalDomainName(): String

  public fun bucketWebsiteDomainName(): String

  public fun bucketWebsiteUrl(): String

  public fun enableEventBridgeNotification()

  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  public fun grantDelete(arg0: IGrantable): Grant

  public fun grantDelete(arg0: IGrantable, arg1: Any): Grant

  public fun grantPublicAccess(arg0: String, arg1: String): Grant

  public fun grantPut(arg0: IGrantable): Grant

  public fun grantPut(arg0: IGrantable, arg1: Any): Grant

  public fun grantPutAcl(arg0: IGrantable): Grant

  public fun grantPutAcl(arg0: IGrantable, arg1: String): Grant

  public fun grantRead(arg0: IGrantable): Grant

  public fun grantRead(arg0: IGrantable, arg1: Any): Grant

  public fun grantReadWrite(arg0: IGrantable): Grant

  public fun grantReadWrite(arg0: IGrantable, arg1: Any): Grant

  public fun grantWrite(arg0: IGrantable): Grant

  public fun grantWrite(arg0: IGrantable, arg1: Any): Grant

  public fun grantWrite(
    arg0: IGrantable,
    arg1: Any,
    arg2: List<String>,
  ): Grant

  public fun isWebsite(): Boolean? = unwrap(this).getIsWebsite()

  public fun onCloudTrailEvent(arg0: String): Rule

  public fun onCloudTrailEvent(arg0: String, arg1: OnCloudTrailBucketEventOptions): Rule

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4cd0c76518d5116ba077bce52bf9e46be291fca8a4f15e4595ba45f13df8f9c6")
  public fun onCloudTrailEvent(arg0: String,
      arg1: OnCloudTrailBucketEventOptions.Builder.() -> Unit): Rule

  public fun onCloudTrailPutObject(arg0: String): Rule

  public fun onCloudTrailPutObject(arg0: String, arg1: OnCloudTrailBucketEventOptions): Rule

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2d5fed31203a03355b138b084c75d516f556d20849243c6ad278b804ab6338f9")
  public fun onCloudTrailPutObject(arg0: String,
      arg1: OnCloudTrailBucketEventOptions.Builder.() -> Unit): Rule

  public fun onCloudTrailWriteObject(arg0: String): Rule

  public fun onCloudTrailWriteObject(arg0: String, arg1: OnCloudTrailBucketEventOptions): Rule

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d9fbb4bd9cce03262211658cf6196a3d7f430706c9dbdb268a27067a5fbe180e")
  public fun onCloudTrailWriteObject(arg0: String,
      arg1: OnCloudTrailBucketEventOptions.Builder.() -> Unit): Rule

  public fun policy(): BucketPolicy? = unwrap(this).getPolicy()?.let(BucketPolicy::wrap)

  public fun policy(`value`: BucketPolicy) {
    unwrap(this).setPolicy(`value`.let(BucketPolicy::unwrap))
  }

  public fun s3UrlForObject(): String

  public fun s3UrlForObject(arg0: String): String

  public fun transferAccelerationUrlForObject(): String

  public fun transferAccelerationUrlForObject(arg0: String): String

  public fun transferAccelerationUrlForObject(arg0: String, arg1: TransferAccelerationUrlOptions):
      String

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("286947e1f7e12ca5ce2cd4e12ab86eb7b46e333dff5a5f87636bcad53b3e0131")
  public fun transferAccelerationUrlForObject(arg0: String,
      arg1: TransferAccelerationUrlOptions.Builder.() -> Unit): String

  public fun urlForObject(): String

  public fun urlForObject(arg0: String): String

  public fun virtualHostedUrlForObject(): String

  public fun virtualHostedUrlForObject(arg0: String): String

  public fun virtualHostedUrlForObject(arg0: String, arg1: VirtualHostedStyleUrlOptions): String

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("caf339118414c1ca939dfa7b7d29d0a50714046a0bbf4ebdaa53c4943b6d6371")
  public fun virtualHostedUrlForObject(arg0: String,
      arg1: VirtualHostedStyleUrlOptions.Builder.() -> Unit): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3.IBucket,
  ) : CdkObject(cdkObject), IBucket {
    override fun addEventNotification(
      arg0: EventType,
      arg1: IBucketNotificationDestination,
      arg2: NotificationKeyFilter,
    ) {
      unwrap(this).addEventNotification(arg0.let(EventType::unwrap),
          arg1.let(IBucketNotificationDestination::unwrap), arg2.let(NotificationKeyFilter::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1d0b56563701e92edca7104c6b251f88497ad21052ff4bd7384db69d23a3f01e")
    override fun addEventNotification(
      arg0: EventType,
      arg1: IBucketNotificationDestination,
      arg2: NotificationKeyFilter.Builder.() -> Unit,
    ): Unit = addEventNotification(arg0, arg1, NotificationKeyFilter(arg2))

    override fun addObjectCreatedNotification(arg0: IBucketNotificationDestination,
        arg1: NotificationKeyFilter) {
      unwrap(this).addObjectCreatedNotification(arg0.let(IBucketNotificationDestination::unwrap),
          arg1.let(NotificationKeyFilter::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("659a47f023d44060464d0f8501d59228cd0a44f99bad56864cfec5fc46034cd0")
    override fun addObjectCreatedNotification(arg0: IBucketNotificationDestination,
        arg1: NotificationKeyFilter.Builder.() -> Unit): Unit = addObjectCreatedNotification(arg0,
        NotificationKeyFilter(arg1))

    override fun addObjectRemovedNotification(arg0: IBucketNotificationDestination,
        arg1: NotificationKeyFilter) {
      unwrap(this).addObjectRemovedNotification(arg0.let(IBucketNotificationDestination::unwrap),
          arg1.let(NotificationKeyFilter::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ead0379c408a1a59ae83c035b9c29e8fa6206d8cf0f8e3797dd395f1b0845f96")
    override fun addObjectRemovedNotification(arg0: IBucketNotificationDestination,
        arg1: NotificationKeyFilter.Builder.() -> Unit): Unit = addObjectRemovedNotification(arg0,
        NotificationKeyFilter(arg1))

    override fun addToResourcePolicy(arg0: PolicyStatement): AddToResourcePolicyResult =
        unwrap(this).addToResourcePolicy(arg0.let(PolicyStatement::unwrap)).let(AddToResourcePolicyResult::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
    override fun addToResourcePolicy(arg0: PolicyStatement.Builder.() -> Unit):
        AddToResourcePolicyResult = addToResourcePolicy(PolicyStatement(arg0))

    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun arnForObjects(arg0: String): String = unwrap(this).arnForObjects(arg0)

    override fun bucketArn(): String = unwrap(this).getBucketArn()

    override fun bucketDomainName(): String = unwrap(this).getBucketDomainName()

    override fun bucketDualStackDomainName(): String = unwrap(this).getBucketDualStackDomainName()

    override fun bucketName(): String = unwrap(this).getBucketName()

    override fun bucketRegionalDomainName(): String = unwrap(this).getBucketRegionalDomainName()

    override fun bucketWebsiteDomainName(): String = unwrap(this).getBucketWebsiteDomainName()

    override fun bucketWebsiteUrl(): String = unwrap(this).getBucketWebsiteUrl()

    override fun enableEventBridgeNotification() {
      unwrap(this).enableEventBridgeNotification()
    }

    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun grantDelete(arg0: IGrantable): Grant =
        unwrap(this).grantDelete(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun grantDelete(arg0: IGrantable, arg1: Any): Grant =
        unwrap(this).grantDelete(arg0.let(IGrantable::unwrap), arg1).let(Grant::wrap)

    override fun grantPublicAccess(arg0: String, arg1: String): Grant =
        unwrap(this).grantPublicAccess(arg0, arg1).let(Grant::wrap)

    override fun grantPut(arg0: IGrantable): Grant =
        unwrap(this).grantPut(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun grantPut(arg0: IGrantable, arg1: Any): Grant =
        unwrap(this).grantPut(arg0.let(IGrantable::unwrap), arg1).let(Grant::wrap)

    override fun grantPutAcl(arg0: IGrantable): Grant =
        unwrap(this).grantPutAcl(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun grantPutAcl(arg0: IGrantable, arg1: String): Grant =
        unwrap(this).grantPutAcl(arg0.let(IGrantable::unwrap), arg1).let(Grant::wrap)

    override fun grantRead(arg0: IGrantable): Grant =
        unwrap(this).grantRead(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun grantRead(arg0: IGrantable, arg1: Any): Grant =
        unwrap(this).grantRead(arg0.let(IGrantable::unwrap), arg1).let(Grant::wrap)

    override fun grantReadWrite(arg0: IGrantable): Grant =
        unwrap(this).grantReadWrite(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun grantReadWrite(arg0: IGrantable, arg1: Any): Grant =
        unwrap(this).grantReadWrite(arg0.let(IGrantable::unwrap), arg1).let(Grant::wrap)

    override fun grantWrite(arg0: IGrantable): Grant =
        unwrap(this).grantWrite(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun grantWrite(arg0: IGrantable, arg1: Any): Grant =
        unwrap(this).grantWrite(arg0.let(IGrantable::unwrap), arg1).let(Grant::wrap)

    override fun grantWrite(
      arg0: IGrantable,
      arg1: Any,
      arg2: List<String>,
    ): Grant = unwrap(this).grantWrite(arg0.let(IGrantable::unwrap), arg1, arg2).let(Grant::wrap)

    override fun isWebsite(): Boolean? = unwrap(this).getIsWebsite()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun onCloudTrailEvent(arg0: String): Rule =
        unwrap(this).onCloudTrailEvent(arg0).let(Rule::wrap)

    override fun onCloudTrailEvent(arg0: String, arg1: OnCloudTrailBucketEventOptions): Rule =
        unwrap(this).onCloudTrailEvent(arg0,
        arg1.let(OnCloudTrailBucketEventOptions::unwrap)).let(Rule::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4cd0c76518d5116ba077bce52bf9e46be291fca8a4f15e4595ba45f13df8f9c6")
    override fun onCloudTrailEvent(arg0: String,
        arg1: OnCloudTrailBucketEventOptions.Builder.() -> Unit): Rule = onCloudTrailEvent(arg0,
        OnCloudTrailBucketEventOptions(arg1))

    override fun onCloudTrailPutObject(arg0: String): Rule =
        unwrap(this).onCloudTrailPutObject(arg0).let(Rule::wrap)

    override fun onCloudTrailPutObject(arg0: String, arg1: OnCloudTrailBucketEventOptions): Rule =
        unwrap(this).onCloudTrailPutObject(arg0,
        arg1.let(OnCloudTrailBucketEventOptions::unwrap)).let(Rule::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2d5fed31203a03355b138b084c75d516f556d20849243c6ad278b804ab6338f9")
    override fun onCloudTrailPutObject(arg0: String,
        arg1: OnCloudTrailBucketEventOptions.Builder.() -> Unit): Rule = onCloudTrailPutObject(arg0,
        OnCloudTrailBucketEventOptions(arg1))

    override fun onCloudTrailWriteObject(arg0: String): Rule =
        unwrap(this).onCloudTrailWriteObject(arg0).let(Rule::wrap)

    override fun onCloudTrailWriteObject(arg0: String, arg1: OnCloudTrailBucketEventOptions): Rule =
        unwrap(this).onCloudTrailWriteObject(arg0,
        arg1.let(OnCloudTrailBucketEventOptions::unwrap)).let(Rule::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d9fbb4bd9cce03262211658cf6196a3d7f430706c9dbdb268a27067a5fbe180e")
    override fun onCloudTrailWriteObject(arg0: String,
        arg1: OnCloudTrailBucketEventOptions.Builder.() -> Unit): Rule =
        onCloudTrailWriteObject(arg0, OnCloudTrailBucketEventOptions(arg1))

    override fun policy(): BucketPolicy? = unwrap(this).getPolicy()?.let(BucketPolicy::wrap)

    override fun policy(`value`: BucketPolicy) {
      unwrap(this).setPolicy(`value`.let(BucketPolicy::unwrap))
    }

    override fun s3UrlForObject(): String = unwrap(this).s3UrlForObject()

    override fun s3UrlForObject(arg0: String): String = unwrap(this).s3UrlForObject(arg0)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    override fun transferAccelerationUrlForObject(): String =
        unwrap(this).transferAccelerationUrlForObject()

    override fun transferAccelerationUrlForObject(arg0: String): String =
        unwrap(this).transferAccelerationUrlForObject(arg0)

    override fun transferAccelerationUrlForObject(arg0: String,
        arg1: TransferAccelerationUrlOptions): String =
        unwrap(this).transferAccelerationUrlForObject(arg0,
        arg1.let(TransferAccelerationUrlOptions::unwrap))

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("286947e1f7e12ca5ce2cd4e12ab86eb7b46e333dff5a5f87636bcad53b3e0131")
    override fun transferAccelerationUrlForObject(arg0: String,
        arg1: TransferAccelerationUrlOptions.Builder.() -> Unit): String =
        transferAccelerationUrlForObject(arg0, TransferAccelerationUrlOptions(arg1))

    override fun urlForObject(): String = unwrap(this).urlForObject()

    override fun urlForObject(arg0: String): String = unwrap(this).urlForObject(arg0)

    override fun virtualHostedUrlForObject(): String = unwrap(this).virtualHostedUrlForObject()

    override fun virtualHostedUrlForObject(arg0: String): String =
        unwrap(this).virtualHostedUrlForObject(arg0)

    override fun virtualHostedUrlForObject(arg0: String, arg1: VirtualHostedStyleUrlOptions): String
        = unwrap(this).virtualHostedUrlForObject(arg0,
        arg1.let(VirtualHostedStyleUrlOptions::unwrap))

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("caf339118414c1ca939dfa7b7d29d0a50714046a0bbf4ebdaa53c4943b6d6371")
    override fun virtualHostedUrlForObject(arg0: String,
        arg1: VirtualHostedStyleUrlOptions.Builder.() -> Unit): String =
        virtualHostedUrlForObject(arg0, VirtualHostedStyleUrlOptions(arg1))
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.IBucket): IBucket =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IBucket): software.amazon.awscdk.services.s3.IBucket = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.s3.IBucket
  }
}
