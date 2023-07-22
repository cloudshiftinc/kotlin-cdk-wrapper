@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.timestream

import kotlin.Unit
import software.amazon.awscdk.services.timestream.CfnScheduledQuery

/**
 * Configuration for error reporting.
 */
public inline
    fun CfnScheduledQuery.setErrorReportConfiguration(block: CfnScheduledQueryErrorReportConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnScheduledQueryErrorReportConfigurationPropertyDsl()
  builder.apply(block)
  return setErrorReportConfiguration(builder.build())
}

/**
 * Notification configuration for the scheduled query.
 */
public inline
    fun CfnScheduledQuery.setNotificationConfiguration(block: CfnScheduledQueryNotificationConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnScheduledQueryNotificationConfigurationPropertyDsl()
  builder.apply(block)
  return setNotificationConfiguration(builder.build())
}

/**
 * Schedule configuration.
 */
public inline
    fun CfnScheduledQuery.setScheduleConfiguration(block: CfnScheduledQueryScheduleConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnScheduledQueryScheduleConfigurationPropertyDsl()
  builder.apply(block)
  return setScheduleConfiguration(builder.build())
}

/**
 * Scheduled query target store configuration.
 */
public inline
    fun CfnScheduledQuery.setTargetConfiguration(block: CfnScheduledQueryTargetConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnScheduledQueryTargetConfigurationPropertyDsl()
  builder.apply(block)
  return setTargetConfiguration(builder.build())
}
