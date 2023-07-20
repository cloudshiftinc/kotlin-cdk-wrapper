@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3outposts

import kotlin.Unit
import software.amazon.awscdk.services.s3outposts.CfnAccessPoint
import software.amazon.awscdk.services.s3outposts.CfnBucket

public inline
    fun CfnBucket.setLifecycleConfiguration(block: CfnBucketLifecycleConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnBucketLifecycleConfigurationPropertyDsl()
  builder.apply(block)
  return setLifecycleConfiguration(builder.build())
}

public inline
    fun CfnAccessPoint.setVpcConfiguration(block: CfnAccessPointVpcConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnAccessPointVpcConfigurationPropertyDsl()
  builder.apply(block)
  return setVpcConfiguration(builder.build())
}
