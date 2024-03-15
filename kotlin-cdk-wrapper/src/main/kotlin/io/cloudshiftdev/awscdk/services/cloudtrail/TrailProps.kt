@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudtrail

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import io.cloudshiftdev.awscdk.services.logs.RetentionDays
import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface TrailProps {
  public fun bucket(): IBucket? = unwrap(this).getBucket()?.let(IBucket::wrap)

  public fun cloudWatchLogGroup(): ILogGroup? =
      unwrap(this).getCloudWatchLogGroup()?.let(ILogGroup::wrap)

  public fun cloudWatchLogsRetention(): RetentionDays? =
      unwrap(this).getCloudWatchLogsRetention()?.let(RetentionDays::wrap)

  public fun enableFileValidation(): Boolean? = unwrap(this).getEnableFileValidation()

  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  public fun includeGlobalServiceEvents(): Boolean? = unwrap(this).getIncludeGlobalServiceEvents()

  public fun insightTypes(): List<InsightType> =
      unwrap(this).getInsightTypes()?.map(InsightType::wrap) ?: emptyList()

  public fun isMultiRegionTrail(): Boolean? = unwrap(this).getIsMultiRegionTrail()

  public fun isOrganizationTrail(): Boolean? = unwrap(this).getIsOrganizationTrail()

  public fun managementEvents(): ReadWriteType? =
      unwrap(this).getManagementEvents()?.let(ReadWriteType::wrap)

  public fun orgId(): String? = unwrap(this).getOrgId()

  public fun s3KeyPrefix(): String? = unwrap(this).getS3KeyPrefix()

  public fun sendToCloudWatchLogs(): Boolean? = unwrap(this).getSendToCloudWatchLogs()

  public fun snsTopic(): ITopic? = unwrap(this).getSnsTopic()?.let(ITopic::wrap)

  public fun trailName(): String? = unwrap(this).getTrailName()

  @CdkDslMarker
  public interface Builder {
    public fun bucket(bucket: IBucket)

    public fun cloudWatchLogGroup(cloudWatchLogGroup: ILogGroup)

    public fun cloudWatchLogsRetention(cloudWatchLogsRetention: RetentionDays)

    public fun enableFileValidation(enableFileValidation: Boolean)

    public fun encryptionKey(encryptionKey: IKey)

    public fun includeGlobalServiceEvents(includeGlobalServiceEvents: Boolean)

    public fun insightTypes(insightTypes: List<InsightType>)

    public fun insightTypes(vararg insightTypes: InsightType)

    public fun isMultiRegionTrail(isMultiRegionTrail: Boolean)

    public fun isOrganizationTrail(isOrganizationTrail: Boolean)

    public fun managementEvents(managementEvents: ReadWriteType)

    public fun orgId(orgId: String)

    public fun s3KeyPrefix(s3KeyPrefix: String)

    public fun sendToCloudWatchLogs(sendToCloudWatchLogs: Boolean)

    public fun snsTopic(snsTopic: ITopic)

    public fun trailName(trailName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudtrail.TrailProps.Builder =
        software.amazon.awscdk.services.cloudtrail.TrailProps.builder()

    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket::unwrap))
    }

    override fun cloudWatchLogGroup(cloudWatchLogGroup: ILogGroup) {
      cdkBuilder.cloudWatchLogGroup(cloudWatchLogGroup.let(ILogGroup::unwrap))
    }

    override fun cloudWatchLogsRetention(cloudWatchLogsRetention: RetentionDays) {
      cdkBuilder.cloudWatchLogsRetention(cloudWatchLogsRetention.let(RetentionDays::unwrap))
    }

    override fun enableFileValidation(enableFileValidation: Boolean) {
      cdkBuilder.enableFileValidation(enableFileValidation)
    }

    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    override fun includeGlobalServiceEvents(includeGlobalServiceEvents: Boolean) {
      cdkBuilder.includeGlobalServiceEvents(includeGlobalServiceEvents)
    }

    override fun insightTypes(insightTypes: List<InsightType>) {
      cdkBuilder.insightTypes(insightTypes.map(InsightType::unwrap))
    }

    override fun insightTypes(vararg insightTypes: InsightType): Unit =
        insightTypes(insightTypes.toList())

    override fun isMultiRegionTrail(isMultiRegionTrail: Boolean) {
      cdkBuilder.isMultiRegionTrail(isMultiRegionTrail)
    }

    override fun isOrganizationTrail(isOrganizationTrail: Boolean) {
      cdkBuilder.isOrganizationTrail(isOrganizationTrail)
    }

    override fun managementEvents(managementEvents: ReadWriteType) {
      cdkBuilder.managementEvents(managementEvents.let(ReadWriteType::unwrap))
    }

    override fun orgId(orgId: String) {
      cdkBuilder.orgId(orgId)
    }

    override fun s3KeyPrefix(s3KeyPrefix: String) {
      cdkBuilder.s3KeyPrefix(s3KeyPrefix)
    }

    override fun sendToCloudWatchLogs(sendToCloudWatchLogs: Boolean) {
      cdkBuilder.sendToCloudWatchLogs(sendToCloudWatchLogs)
    }

    override fun snsTopic(snsTopic: ITopic) {
      cdkBuilder.snsTopic(snsTopic.let(ITopic::unwrap))
    }

    override fun trailName(trailName: String) {
      cdkBuilder.trailName(trailName)
    }

    public fun build(): software.amazon.awscdk.services.cloudtrail.TrailProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudtrail.TrailProps,
  ) : CdkObject(cdkObject), TrailProps {
    override fun bucket(): IBucket? = unwrap(this).getBucket()?.let(IBucket::wrap)

    override fun cloudWatchLogGroup(): ILogGroup? =
        unwrap(this).getCloudWatchLogGroup()?.let(ILogGroup::wrap)

    override fun cloudWatchLogsRetention(): RetentionDays? =
        unwrap(this).getCloudWatchLogsRetention()?.let(RetentionDays::wrap)

    override fun enableFileValidation(): Boolean? = unwrap(this).getEnableFileValidation()

    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    override fun includeGlobalServiceEvents(): Boolean? =
        unwrap(this).getIncludeGlobalServiceEvents()

    override fun insightTypes(): List<InsightType> =
        unwrap(this).getInsightTypes()?.map(InsightType::wrap) ?: emptyList()

    override fun isMultiRegionTrail(): Boolean? = unwrap(this).getIsMultiRegionTrail()

    override fun isOrganizationTrail(): Boolean? = unwrap(this).getIsOrganizationTrail()

    override fun managementEvents(): ReadWriteType? =
        unwrap(this).getManagementEvents()?.let(ReadWriteType::wrap)

    override fun orgId(): String? = unwrap(this).getOrgId()

    override fun s3KeyPrefix(): String? = unwrap(this).getS3KeyPrefix()

    override fun sendToCloudWatchLogs(): Boolean? = unwrap(this).getSendToCloudWatchLogs()

    override fun snsTopic(): ITopic? = unwrap(this).getSnsTopic()?.let(ITopic::wrap)

    override fun trailName(): String? = unwrap(this).getTrailName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TrailProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.TrailProps): TrailProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TrailProps): software.amazon.awscdk.services.cloudtrail.TrailProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.cloudtrail.TrailProps
  }
}
