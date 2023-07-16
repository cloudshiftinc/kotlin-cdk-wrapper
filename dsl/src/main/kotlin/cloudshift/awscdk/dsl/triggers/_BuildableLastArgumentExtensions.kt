@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.triggers

import cloudshift.awscdk.dsl.services.cloudwatch.MetricOptionsDsl
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import cloudshift.awscdk.dsl.services.lambda.AliasOptionsDsl
import cloudshift.awscdk.dsl.services.lambda.EnvironmentOptionsDsl
import cloudshift.awscdk.dsl.services.lambda.EventInvokeConfigOptionsDsl
import cloudshift.awscdk.dsl.services.lambda.EventSourceMappingOptionsDsl
import cloudshift.awscdk.dsl.services.lambda.FunctionUrlOptionsDsl
import cloudshift.awscdk.dsl.services.lambda.PermissionDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.Metric
import software.amazon.awscdk.services.lambda.Alias
import software.amazon.awscdk.services.lambda.EventSourceMapping
import software.amazon.awscdk.services.lambda.Function
import software.amazon.awscdk.services.lambda.FunctionUrl
import software.amazon.awscdk.triggers.TriggerFunction

public inline fun TriggerFunction.addAlias(arg0: String, block: AliasOptionsDsl.() -> Unit = {}):
    Alias {
  val builder = AliasOptionsDsl()
  builder.apply(block)
  return addAlias(arg0,builder.build())
}

public inline fun TriggerFunction.addEnvironment(
  arg0: String,
  arg1: String,
  block: EnvironmentOptionsDsl.() -> Unit = {},
): Function {
  val builder = EnvironmentOptionsDsl()
  builder.apply(block)
  return addEnvironment(arg0,arg1,builder.build())
}

public inline fun TriggerFunction.addEventSourceMapping(arg0: String,
    block: EventSourceMappingOptionsDsl.() -> Unit = {}): EventSourceMapping {
  val builder = EventSourceMappingOptionsDsl()
  builder.apply(block)
  return addEventSourceMapping(arg0,builder.build())
}

public inline fun TriggerFunction.addFunctionUrl(block: FunctionUrlOptionsDsl.() -> Unit = {}):
    FunctionUrl {
  val builder = FunctionUrlOptionsDsl()
  builder.apply(block)
  return addFunctionUrl(builder.build())
}

public inline fun TriggerFunction.addPermission(arg0: String, block: PermissionDsl.() -> Unit =
    {}) {
  val builder = PermissionDsl()
  builder.apply(block)
  return addPermission(arg0,builder.build())
}

public inline fun TriggerFunction.addToRolePolicy(block: PolicyStatementDsl.() -> Unit = {}) {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToRolePolicy(builder.build())
}

public inline fun TriggerFunction.configureAsyncInvoke(block: EventInvokeConfigOptionsDsl.() -> Unit
    = {}) {
  val builder = EventInvokeConfigOptionsDsl()
  builder.apply(block)
  return configureAsyncInvoke(builder.build())
}

public inline fun TriggerFunction.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun TriggerFunction.metricDuration(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricDuration(builder.build())
}

public inline fun TriggerFunction.metricErrors(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricErrors(builder.build())
}

public inline fun TriggerFunction.metricInvocations(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricInvocations(builder.build())
}

public inline fun TriggerFunction.metricThrottles(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricThrottles(builder.build())
}
