@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront.experimental

import cloudshift.awscdk.dsl.services.cloudwatch.MetricOptionsDsl
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import cloudshift.awscdk.dsl.services.lambda.AliasOptionsDsl
import cloudshift.awscdk.dsl.services.lambda.EventInvokeConfigOptionsDsl
import cloudshift.awscdk.dsl.services.lambda.EventSourceMappingOptionsDsl
import cloudshift.awscdk.dsl.services.lambda.FunctionUrlOptionsDsl
import cloudshift.awscdk.dsl.services.lambda.PermissionDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.experimental.EdgeFunction
import software.amazon.awscdk.services.cloudwatch.Metric
import software.amazon.awscdk.services.lambda.Alias
import software.amazon.awscdk.services.lambda.EventSourceMapping
import software.amazon.awscdk.services.lambda.FunctionUrl

public inline fun EdgeFunction.addAlias(aliasName: String, block: AliasOptionsDsl.() -> Unit = {}):
    Alias {
  val builder = AliasOptionsDsl()
  builder.apply(block)
  return addAlias(aliasName, builder.build())
}

public inline fun EdgeFunction.addEventSourceMapping(id: String,
    block: EventSourceMappingOptionsDsl.() -> Unit = {}): EventSourceMapping {
  val builder = EventSourceMappingOptionsDsl()
  builder.apply(block)
  return addEventSourceMapping(id, builder.build())
}

public inline fun EdgeFunction.addFunctionUrl(block: FunctionUrlOptionsDsl.() -> Unit = {}):
    FunctionUrl {
  val builder = FunctionUrlOptionsDsl()
  builder.apply(block)
  return addFunctionUrl(builder.build())
}

public inline fun EdgeFunction.addPermission(id: String, block: PermissionDsl.() -> Unit = {}) {
  val builder = PermissionDsl()
  builder.apply(block)
  return addPermission(id, builder.build())
}

public inline fun EdgeFunction.addToRolePolicy(block: PolicyStatementDsl.() -> Unit = {}) {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToRolePolicy(builder.build())
}

public inline fun EdgeFunction.configureAsyncInvoke(block: EventInvokeConfigOptionsDsl.() -> Unit =
    {}) {
  val builder = EventInvokeConfigOptionsDsl()
  builder.apply(block)
  return configureAsyncInvoke(builder.build())
}

public inline fun EdgeFunction.metric(metricName: String, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(metricName, builder.build())
}

public inline fun EdgeFunction.metricDuration(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricDuration(builder.build())
}

public inline fun EdgeFunction.metricErrors(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricErrors(builder.build())
}

public inline fun EdgeFunction.metricInvocations(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricInvocations(builder.build())
}

public inline fun EdgeFunction.metricThrottles(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricThrottles(builder.build())
}
