@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy
import software.amazon.awscdk.services.iotsitewise.CfnAsset
import software.amazon.awscdk.services.iotsitewise.CfnAssetModel
import software.amazon.awscdk.services.iotsitewise.CfnDashboard
import software.amazon.awscdk.services.iotsitewise.CfnGateway
import software.amazon.awscdk.services.iotsitewise.CfnPortal
import software.amazon.awscdk.services.iotsitewise.CfnProject

public inline fun CfnAccessPolicy.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnAccessPolicy.setAccessPolicyIdentity(block: CfnAccessPolicyAccessPolicyIdentityPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnAccessPolicyAccessPolicyIdentityPropertyDsl()
  builder.apply(block)
  return setAccessPolicyIdentity(builder.build())
}

public inline
    fun CfnAccessPolicy.setAccessPolicyResource(block: CfnAccessPolicyAccessPolicyResourcePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnAccessPolicyAccessPolicyResourcePropertyDsl()
  builder.apply(block)
  return setAccessPolicyResource(builder.build())
}

public inline fun CfnAsset.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnAssetModel.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnDashboard.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnGateway.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnGateway.setGatewayPlatform(block: CfnGatewayGatewayPlatformPropertyDsl.() -> Unit = {}) {
  val builder = CfnGatewayGatewayPlatformPropertyDsl()
  builder.apply(block)
  return setGatewayPlatform(builder.build())
}

public inline fun CfnPortal.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnProject.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}
