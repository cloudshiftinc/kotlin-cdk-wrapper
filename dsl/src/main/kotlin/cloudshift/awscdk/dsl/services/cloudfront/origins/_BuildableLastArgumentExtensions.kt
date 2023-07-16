@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront.origins

import cloudshift.awscdk.dsl.services.cloudfront.OriginBindOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.OriginBindConfig
import software.amazon.awscdk.services.cloudfront.origins.HttpOrigin
import software.amazon.awscdk.services.cloudfront.origins.LoadBalancerV2Origin
import software.amazon.awscdk.services.cloudfront.origins.OriginGroup
import software.amazon.awscdk.services.cloudfront.origins.RestApiOrigin
import software.amazon.awscdk.services.cloudfront.origins.S3Origin
import software.constructs.Construct

public inline fun HttpOrigin.bind(arg0: Construct, block: OriginBindOptionsDsl.() -> Unit = {}):
    OriginBindConfig {
  val builder = OriginBindOptionsDsl()
  builder.apply(block)
  return bind(arg0,builder.build())
}

public inline fun LoadBalancerV2Origin.bind(arg0: Construct, block: OriginBindOptionsDsl.() -> Unit
    = {}): OriginBindConfig {
  val builder = OriginBindOptionsDsl()
  builder.apply(block)
  return bind(arg0,builder.build())
}

public inline fun OriginGroup.bind(arg0: Construct, block: OriginBindOptionsDsl.() -> Unit = {}):
    OriginBindConfig {
  val builder = OriginBindOptionsDsl()
  builder.apply(block)
  return bind(arg0,builder.build())
}

public inline fun RestApiOrigin.bind(arg0: Construct, block: OriginBindOptionsDsl.() -> Unit = {}):
    OriginBindConfig {
  val builder = OriginBindOptionsDsl()
  builder.apply(block)
  return bind(arg0,builder.build())
}

public inline fun S3Origin.bind(arg0: Construct, block: OriginBindOptionsDsl.() -> Unit = {}):
    OriginBindConfig {
  val builder = OriginBindOptionsDsl()
  builder.apply(block)
  return bind(arg0,builder.build())
}
