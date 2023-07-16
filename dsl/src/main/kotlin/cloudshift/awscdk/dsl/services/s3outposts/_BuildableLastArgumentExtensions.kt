@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3outposts

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.s3outposts.CfnAccessPoint
import software.amazon.awscdk.services.s3outposts.CfnBucket
import software.amazon.awscdk.services.s3outposts.CfnBucketPolicy
import software.amazon.awscdk.services.s3outposts.CfnEndpoint

public inline fun CfnAccessPoint.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnAccessPoint.setVpcConfiguration(block: CfnAccessPointVpcConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnAccessPointVpcConfigurationPropertyDsl()
  builder.apply(block)
  return setVpcConfiguration(builder.build())
}

public inline fun CfnBucket.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnBucket.setLifecycleConfiguration(block: CfnBucketLifecycleConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnBucketLifecycleConfigurationPropertyDsl()
  builder.apply(block)
  return setLifecycleConfiguration(builder.build())
}

public inline fun CfnBucketPolicy.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnEndpoint.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}
