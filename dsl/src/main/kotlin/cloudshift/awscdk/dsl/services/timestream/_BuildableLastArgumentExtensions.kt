@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.timestream

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.timestream.CfnDatabase
import software.amazon.awscdk.services.timestream.CfnScheduledQuery
import software.amazon.awscdk.services.timestream.CfnTable

public inline fun CfnDatabase.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnScheduledQuery.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnScheduledQuery.setErrorReportConfiguration(block: CfnScheduledQueryErrorReportConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnScheduledQueryErrorReportConfigurationPropertyDsl()
  builder.apply(block)
  return setErrorReportConfiguration(builder.build())
}

public inline
    fun CfnScheduledQuery.setNotificationConfiguration(block: CfnScheduledQueryNotificationConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnScheduledQueryNotificationConfigurationPropertyDsl()
  builder.apply(block)
  return setNotificationConfiguration(builder.build())
}

public inline
    fun CfnScheduledQuery.setScheduleConfiguration(block: CfnScheduledQueryScheduleConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnScheduledQueryScheduleConfigurationPropertyDsl()
  builder.apply(block)
  return setScheduleConfiguration(builder.build())
}

public inline
    fun CfnScheduledQuery.setTargetConfiguration(block: CfnScheduledQueryTargetConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnScheduledQueryTargetConfigurationPropertyDsl()
  builder.apply(block)
  return setTargetConfiguration(builder.build())
}

public inline fun CfnTable.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}
