@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.iotfleetwise.CfnCampaign
import software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest
import software.amazon.awscdk.services.iotfleetwise.CfnFleet
import software.amazon.awscdk.services.iotfleetwise.CfnModelManifest
import software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog
import software.amazon.awscdk.services.iotfleetwise.CfnVehicle

public inline fun CfnCampaign.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnCampaign.setCollectionScheme(block: CfnCampaignCollectionSchemePropertyDsl.() -> Unit =
    {}) {
  val builder = CfnCampaignCollectionSchemePropertyDsl()
  builder.apply(block)
  return setCollectionScheme(builder.build())
}

public inline fun CfnDecoderManifest.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnFleet.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnModelManifest.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnSignalCatalog.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnSignalCatalog.setNodeCounts(block: CfnSignalCatalogNodeCountsPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnSignalCatalogNodeCountsPropertyDsl()
  builder.apply(block)
  return setNodeCounts(builder.build())
}

public inline fun CfnVehicle.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}
