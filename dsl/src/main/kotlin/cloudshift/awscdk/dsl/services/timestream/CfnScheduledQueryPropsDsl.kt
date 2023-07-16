@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.timestream

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.timestream.CfnScheduledQuery
import software.amazon.awscdk.services.timestream.CfnScheduledQueryProps

@CdkDslMarker
public class CfnScheduledQueryPropsDsl {
  private val cdkBuilder: CfnScheduledQueryProps.Builder = CfnScheduledQueryProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun clientToken(clientToken: String) {
    cdkBuilder.clientToken(clientToken)
  }

  public fun errorReportConfiguration(errorReportConfiguration: IResolvable) {
    cdkBuilder.errorReportConfiguration(errorReportConfiguration)
  }

  public
      fun errorReportConfiguration(errorReportConfiguration: CfnScheduledQuery.ErrorReportConfigurationProperty) {
    cdkBuilder.errorReportConfiguration(errorReportConfiguration)
  }

  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  public fun notificationConfiguration(notificationConfiguration: IResolvable) {
    cdkBuilder.notificationConfiguration(notificationConfiguration)
  }

  public
      fun notificationConfiguration(notificationConfiguration: CfnScheduledQuery.NotificationConfigurationProperty) {
    cdkBuilder.notificationConfiguration(notificationConfiguration)
  }

  public fun queryString(queryString: String) {
    cdkBuilder.queryString(queryString)
  }

  public fun scheduleConfiguration(scheduleConfiguration: IResolvable) {
    cdkBuilder.scheduleConfiguration(scheduleConfiguration)
  }

  public
      fun scheduleConfiguration(scheduleConfiguration: CfnScheduledQuery.ScheduleConfigurationProperty) {
    cdkBuilder.scheduleConfiguration(scheduleConfiguration)
  }

  public fun scheduledQueryExecutionRoleArn(scheduledQueryExecutionRoleArn: String) {
    cdkBuilder.scheduledQueryExecutionRoleArn(scheduledQueryExecutionRoleArn)
  }

  public fun scheduledQueryName(scheduledQueryName: String) {
    cdkBuilder.scheduledQueryName(scheduledQueryName)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun targetConfiguration(targetConfiguration: IResolvable) {
    cdkBuilder.targetConfiguration(targetConfiguration)
  }

  public
      fun targetConfiguration(targetConfiguration: CfnScheduledQuery.TargetConfigurationProperty) {
    cdkBuilder.targetConfiguration(targetConfiguration)
  }

  public fun build(): CfnScheduledQueryProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
