@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecr

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import cloudshift.awscdk.dsl.services.events.OnEventOptionsDsl
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.ecr.CfnPublicRepository
import software.amazon.awscdk.services.ecr.CfnPullThroughCacheRule
import software.amazon.awscdk.services.ecr.CfnRegistryPolicy
import software.amazon.awscdk.services.ecr.CfnReplicationConfiguration
import software.amazon.awscdk.services.ecr.CfnRepository
import software.amazon.awscdk.services.ecr.Repository
import software.amazon.awscdk.services.events.Rule
import software.amazon.awscdk.services.iam.AddToResourcePolicyResult

public inline fun CfnPublicRepository.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnPullThroughCacheRule.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnRegistryPolicy.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnReplicationConfiguration.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnReplicationConfiguration.setReplicationConfiguration(block: CfnReplicationConfigurationReplicationConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnReplicationConfigurationReplicationConfigurationPropertyDsl()
  builder.apply(block)
  return setReplicationConfiguration(builder.build())
}

public inline fun CfnRepository.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnRepository.setEncryptionConfiguration(block: CfnRepositoryEncryptionConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnRepositoryEncryptionConfigurationPropertyDsl()
  builder.apply(block)
  return setEncryptionConfiguration(builder.build())
}

public inline
    fun CfnRepository.setImageScanningConfiguration(block: CfnRepositoryImageScanningConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnRepositoryImageScanningConfigurationPropertyDsl()
  builder.apply(block)
  return setImageScanningConfiguration(builder.build())
}

public inline
    fun CfnRepository.setLifecyclePolicy(block: CfnRepositoryLifecyclePolicyPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnRepositoryLifecyclePolicyPropertyDsl()
  builder.apply(block)
  return setLifecyclePolicy(builder.build())
}

public inline fun Repository.addLifecycleRule(block: LifecycleRuleDsl.() -> Unit = {}) {
  val builder = LifecycleRuleDsl()
  builder.apply(block)
  return addLifecycleRule(builder.build())
}

public inline fun Repository.addToResourcePolicy(block: PolicyStatementDsl.() -> Unit = {}):
    AddToResourcePolicyResult {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToResourcePolicy(builder.build())
}

public inline fun Repository.onCloudTrailEvent(arg0: String, block: OnEventOptionsDsl.() -> Unit =
    {}): Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onCloudTrailEvent(arg0,builder.build())
}

public inline fun Repository.onCloudTrailImagePushed(arg0: String,
    block: OnCloudTrailImagePushedOptionsDsl.() -> Unit = {}): Rule {
  val builder = OnCloudTrailImagePushedOptionsDsl()
  builder.apply(block)
  return onCloudTrailImagePushed(arg0,builder.build())
}

public inline fun Repository.onEvent(arg0: String, block: OnEventOptionsDsl.() -> Unit = {}): Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onEvent(arg0,builder.build())
}

public inline fun Repository.onImageScanCompleted(arg0: String,
    block: OnImageScanCompletedOptionsDsl.() -> Unit = {}): Rule {
  val builder = OnImageScanCompletedOptionsDsl()
  builder.apply(block)
  return onImageScanCompleted(arg0,builder.build())
}
