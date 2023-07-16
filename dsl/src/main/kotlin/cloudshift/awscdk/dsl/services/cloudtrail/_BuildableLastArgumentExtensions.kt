@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudtrail

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.cloudtrail.CfnChannel
import software.amazon.awscdk.services.cloudtrail.CfnEventDataStore
import software.amazon.awscdk.services.cloudtrail.CfnResourcePolicy
import software.amazon.awscdk.services.cloudtrail.CfnTrail
import software.amazon.awscdk.services.cloudtrail.DataResourceType
import software.amazon.awscdk.services.cloudtrail.S3EventSelector
import software.amazon.awscdk.services.cloudtrail.Trail
import software.amazon.awscdk.services.lambda.IFunction

public inline fun CfnChannel.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnEventDataStore.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnResourcePolicy.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnTrail.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun Trail.addEventSelector(
  arg0: DataResourceType,
  arg1: List<String>,
  block: AddEventSelectorOptionsDsl.() -> Unit = {},
) {
  val builder = AddEventSelectorOptionsDsl()
  builder.apply(block)
  return addEventSelector(arg0,arg1,builder.build())
}

public inline fun Trail.addLambdaEventSelector(arg0: List<IFunction>,
    block: AddEventSelectorOptionsDsl.() -> Unit = {}) {
  val builder = AddEventSelectorOptionsDsl()
  builder.apply(block)
  return addLambdaEventSelector(arg0,builder.build())
}

public inline fun Trail.addS3EventSelector(arg0: List<S3EventSelector>,
    block: AddEventSelectorOptionsDsl.() -> Unit = {}) {
  val builder = AddEventSelectorOptionsDsl()
  builder.apply(block)
  return addS3EventSelector(arg0,builder.build())
}

public inline fun Trail.logAllLambdaDataEvents(block: AddEventSelectorOptionsDsl.() -> Unit = {}) {
  val builder = AddEventSelectorOptionsDsl()
  builder.apply(block)
  return logAllLambdaDataEvents(builder.build())
}

public inline fun Trail.logAllS3DataEvents(block: AddEventSelectorOptionsDsl.() -> Unit = {}) {
  val builder = AddEventSelectorOptionsDsl()
  builder.apply(block)
  return logAllS3DataEvents(builder.build())
}
