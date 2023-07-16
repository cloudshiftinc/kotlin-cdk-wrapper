@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudtrail

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
import software.amazon.awscdk.services.cloudtrail.CfnTrail
import software.constructs.Construct

@CdkDslMarker
public class CfnTrailDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnTrail.Builder = CfnTrail.Builder.create(scope, id)

  private val _advancedEventSelectors: MutableList<Any> = mutableListOf()

  private val _eventSelectors: MutableList<Any> = mutableListOf()

  private val _insightSelectors: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun advancedEventSelectors(vararg advancedEventSelectors: Any) {
    _advancedEventSelectors.addAll(listOf(*advancedEventSelectors))
  }

  public fun advancedEventSelectors(advancedEventSelectors: Collection<Any>) {
    _advancedEventSelectors.addAll(advancedEventSelectors)
  }

  public fun advancedEventSelectors(advancedEventSelectors: IResolvable) {
    cdkBuilder.advancedEventSelectors(advancedEventSelectors)
  }

  public fun cloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn: String) {
    cdkBuilder.cloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn)
  }

  public fun cloudWatchLogsRoleArn(cloudWatchLogsRoleArn: String) {
    cdkBuilder.cloudWatchLogsRoleArn(cloudWatchLogsRoleArn)
  }

  public fun enableLogFileValidation(enableLogFileValidation: Boolean) {
    cdkBuilder.enableLogFileValidation(enableLogFileValidation)
  }

  public fun enableLogFileValidation(enableLogFileValidation: IResolvable) {
    cdkBuilder.enableLogFileValidation(enableLogFileValidation)
  }

  public fun eventSelectors(vararg eventSelectors: Any) {
    _eventSelectors.addAll(listOf(*eventSelectors))
  }

  public fun eventSelectors(eventSelectors: Collection<Any>) {
    _eventSelectors.addAll(eventSelectors)
  }

  public fun eventSelectors(eventSelectors: IResolvable) {
    cdkBuilder.eventSelectors(eventSelectors)
  }

  public fun includeGlobalServiceEvents(includeGlobalServiceEvents: Boolean) {
    cdkBuilder.includeGlobalServiceEvents(includeGlobalServiceEvents)
  }

  public fun includeGlobalServiceEvents(includeGlobalServiceEvents: IResolvable) {
    cdkBuilder.includeGlobalServiceEvents(includeGlobalServiceEvents)
  }

  public fun insightSelectors(vararg insightSelectors: Any) {
    _insightSelectors.addAll(listOf(*insightSelectors))
  }

  public fun insightSelectors(insightSelectors: Collection<Any>) {
    _insightSelectors.addAll(insightSelectors)
  }

  public fun insightSelectors(insightSelectors: IResolvable) {
    cdkBuilder.insightSelectors(insightSelectors)
  }

  public fun isLogging(isLogging: Boolean) {
    cdkBuilder.isLogging(isLogging)
  }

  public fun isLogging(isLogging: IResolvable) {
    cdkBuilder.isLogging(isLogging)
  }

  public fun isMultiRegionTrail(isMultiRegionTrail: Boolean) {
    cdkBuilder.isMultiRegionTrail(isMultiRegionTrail)
  }

  public fun isMultiRegionTrail(isMultiRegionTrail: IResolvable) {
    cdkBuilder.isMultiRegionTrail(isMultiRegionTrail)
  }

  public fun isOrganizationTrail(isOrganizationTrail: Boolean) {
    cdkBuilder.isOrganizationTrail(isOrganizationTrail)
  }

  public fun isOrganizationTrail(isOrganizationTrail: IResolvable) {
    cdkBuilder.isOrganizationTrail(isOrganizationTrail)
  }

  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  public fun s3BucketName(s3BucketName: String) {
    cdkBuilder.s3BucketName(s3BucketName)
  }

  public fun s3KeyPrefix(s3KeyPrefix: String) {
    cdkBuilder.s3KeyPrefix(s3KeyPrefix)
  }

  public fun snsTopicName(snsTopicName: String) {
    cdkBuilder.snsTopicName(snsTopicName)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun trailName(trailName: String) {
    cdkBuilder.trailName(trailName)
  }

  public fun build(): CfnTrail {
    if(_advancedEventSelectors.isNotEmpty())
        cdkBuilder.advancedEventSelectors(_advancedEventSelectors)
    if(_eventSelectors.isNotEmpty()) cdkBuilder.eventSelectors(_eventSelectors)
    if(_insightSelectors.isNotEmpty()) cdkBuilder.insightSelectors(_insightSelectors)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
