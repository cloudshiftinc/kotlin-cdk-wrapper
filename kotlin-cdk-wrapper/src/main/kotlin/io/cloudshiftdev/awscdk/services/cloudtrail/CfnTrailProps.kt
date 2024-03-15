@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudtrail

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnTrailProps {
  public fun advancedEventSelectors(): Any? = unwrap(this).getAdvancedEventSelectors()

  public fun cloudWatchLogsLogGroupArn(): String? = unwrap(this).getCloudWatchLogsLogGroupArn()

  public fun cloudWatchLogsRoleArn(): String? = unwrap(this).getCloudWatchLogsRoleArn()

  public fun enableLogFileValidation(): Any? = unwrap(this).getEnableLogFileValidation()

  public fun eventSelectors(): Any? = unwrap(this).getEventSelectors()

  public fun includeGlobalServiceEvents(): Any? = unwrap(this).getIncludeGlobalServiceEvents()

  public fun insightSelectors(): Any? = unwrap(this).getInsightSelectors()

  public fun isLogging(): Any

  public fun isMultiRegionTrail(): Any? = unwrap(this).getIsMultiRegionTrail()

  public fun isOrganizationTrail(): Any? = unwrap(this).getIsOrganizationTrail()

  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public fun s3BucketName(): String

  public fun s3KeyPrefix(): String? = unwrap(this).getS3KeyPrefix()

  public fun snsTopicName(): String? = unwrap(this).getSnsTopicName()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun trailName(): String? = unwrap(this).getTrailName()

  @CdkDslMarker
  public interface Builder {
    public fun advancedEventSelectors(advancedEventSelectors: IResolvable)

    public fun advancedEventSelectors(advancedEventSelectors: List<Any>)

    public fun advancedEventSelectors(vararg advancedEventSelectors: Any)

    public fun cloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn: String)

    public fun cloudWatchLogsRoleArn(cloudWatchLogsRoleArn: String)

    public fun enableLogFileValidation(enableLogFileValidation: Boolean)

    public fun enableLogFileValidation(enableLogFileValidation: IResolvable)

    public fun eventSelectors(eventSelectors: IResolvable)

    public fun eventSelectors(eventSelectors: List<Any>)

    public fun eventSelectors(vararg eventSelectors: Any)

    public fun includeGlobalServiceEvents(includeGlobalServiceEvents: Boolean)

    public fun includeGlobalServiceEvents(includeGlobalServiceEvents: IResolvable)

    public fun insightSelectors(insightSelectors: IResolvable)

    public fun insightSelectors(insightSelectors: List<Any>)

    public fun insightSelectors(vararg insightSelectors: Any)

    public fun isLogging(isLogging: Boolean)

    public fun isLogging(isLogging: IResolvable)

    public fun isMultiRegionTrail(isMultiRegionTrail: Boolean)

    public fun isMultiRegionTrail(isMultiRegionTrail: IResolvable)

    public fun isOrganizationTrail(isOrganizationTrail: Boolean)

    public fun isOrganizationTrail(isOrganizationTrail: IResolvable)

    public fun kmsKeyId(kmsKeyId: String)

    public fun s3BucketName(s3BucketName: String)

    public fun s3KeyPrefix(s3KeyPrefix: String)

    public fun snsTopicName(snsTopicName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun trailName(trailName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudtrail.CfnTrailProps.Builder =
        software.amazon.awscdk.services.cloudtrail.CfnTrailProps.builder()

    override fun advancedEventSelectors(advancedEventSelectors: IResolvable) {
      cdkBuilder.advancedEventSelectors(advancedEventSelectors.let(IResolvable::unwrap))
    }

    override fun advancedEventSelectors(advancedEventSelectors: List<Any>) {
      cdkBuilder.advancedEventSelectors(advancedEventSelectors)
    }

    override fun advancedEventSelectors(vararg advancedEventSelectors: Any): Unit =
        advancedEventSelectors(advancedEventSelectors.toList())

    override fun cloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn: String) {
      cdkBuilder.cloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn)
    }

    override fun cloudWatchLogsRoleArn(cloudWatchLogsRoleArn: String) {
      cdkBuilder.cloudWatchLogsRoleArn(cloudWatchLogsRoleArn)
    }

    override fun enableLogFileValidation(enableLogFileValidation: Boolean) {
      cdkBuilder.enableLogFileValidation(enableLogFileValidation)
    }

    override fun enableLogFileValidation(enableLogFileValidation: IResolvable) {
      cdkBuilder.enableLogFileValidation(enableLogFileValidation.let(IResolvable::unwrap))
    }

    override fun eventSelectors(eventSelectors: IResolvable) {
      cdkBuilder.eventSelectors(eventSelectors.let(IResolvable::unwrap))
    }

    override fun eventSelectors(eventSelectors: List<Any>) {
      cdkBuilder.eventSelectors(eventSelectors)
    }

    override fun eventSelectors(vararg eventSelectors: Any): Unit =
        eventSelectors(eventSelectors.toList())

    override fun includeGlobalServiceEvents(includeGlobalServiceEvents: Boolean) {
      cdkBuilder.includeGlobalServiceEvents(includeGlobalServiceEvents)
    }

    override fun includeGlobalServiceEvents(includeGlobalServiceEvents: IResolvable) {
      cdkBuilder.includeGlobalServiceEvents(includeGlobalServiceEvents.let(IResolvable::unwrap))
    }

    override fun insightSelectors(insightSelectors: IResolvable) {
      cdkBuilder.insightSelectors(insightSelectors.let(IResolvable::unwrap))
    }

    override fun insightSelectors(insightSelectors: List<Any>) {
      cdkBuilder.insightSelectors(insightSelectors)
    }

    override fun insightSelectors(vararg insightSelectors: Any): Unit =
        insightSelectors(insightSelectors.toList())

    override fun isLogging(isLogging: Boolean) {
      cdkBuilder.isLogging(isLogging)
    }

    override fun isLogging(isLogging: IResolvable) {
      cdkBuilder.isLogging(isLogging.let(IResolvable::unwrap))
    }

    override fun isMultiRegionTrail(isMultiRegionTrail: Boolean) {
      cdkBuilder.isMultiRegionTrail(isMultiRegionTrail)
    }

    override fun isMultiRegionTrail(isMultiRegionTrail: IResolvable) {
      cdkBuilder.isMultiRegionTrail(isMultiRegionTrail.let(IResolvable::unwrap))
    }

    override fun isOrganizationTrail(isOrganizationTrail: Boolean) {
      cdkBuilder.isOrganizationTrail(isOrganizationTrail)
    }

    override fun isOrganizationTrail(isOrganizationTrail: IResolvable) {
      cdkBuilder.isOrganizationTrail(isOrganizationTrail.let(IResolvable::unwrap))
    }

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun s3BucketName(s3BucketName: String) {
      cdkBuilder.s3BucketName(s3BucketName)
    }

    override fun s3KeyPrefix(s3KeyPrefix: String) {
      cdkBuilder.s3KeyPrefix(s3KeyPrefix)
    }

    override fun snsTopicName(snsTopicName: String) {
      cdkBuilder.snsTopicName(snsTopicName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun trailName(trailName: String) {
      cdkBuilder.trailName(trailName)
    }

    public fun build(): software.amazon.awscdk.services.cloudtrail.CfnTrailProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudtrail.CfnTrailProps,
  ) : CdkObject(cdkObject), CfnTrailProps {
    override fun advancedEventSelectors(): Any? = unwrap(this).getAdvancedEventSelectors()

    override fun cloudWatchLogsLogGroupArn(): String? = unwrap(this).getCloudWatchLogsLogGroupArn()

    override fun cloudWatchLogsRoleArn(): String? = unwrap(this).getCloudWatchLogsRoleArn()

    override fun enableLogFileValidation(): Any? = unwrap(this).getEnableLogFileValidation()

    override fun eventSelectors(): Any? = unwrap(this).getEventSelectors()

    override fun includeGlobalServiceEvents(): Any? = unwrap(this).getIncludeGlobalServiceEvents()

    override fun insightSelectors(): Any? = unwrap(this).getInsightSelectors()

    override fun isLogging(): Any = unwrap(this).getIsLogging()

    override fun isMultiRegionTrail(): Any? = unwrap(this).getIsMultiRegionTrail()

    override fun isOrganizationTrail(): Any? = unwrap(this).getIsOrganizationTrail()

    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    override fun s3BucketName(): String = unwrap(this).getS3BucketName()

    override fun s3KeyPrefix(): String? = unwrap(this).getS3KeyPrefix()

    override fun snsTopicName(): String? = unwrap(this).getSnsTopicName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun trailName(): String? = unwrap(this).getTrailName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTrailProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.CfnTrailProps):
        CfnTrailProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTrailProps):
        software.amazon.awscdk.services.cloudtrail.CfnTrailProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cloudtrail.CfnTrailProps
  }
}
