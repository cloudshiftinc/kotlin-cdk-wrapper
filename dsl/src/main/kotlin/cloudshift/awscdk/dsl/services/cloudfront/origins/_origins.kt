@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront.origins

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.RestApi
import software.amazon.awscdk.services.cloudfront.origins.HttpOrigin
import software.amazon.awscdk.services.cloudfront.origins.HttpOriginProps
import software.amazon.awscdk.services.cloudfront.origins.LoadBalancerV2Origin
import software.amazon.awscdk.services.cloudfront.origins.LoadBalancerV2OriginProps
import software.amazon.awscdk.services.cloudfront.origins.OriginGroup
import software.amazon.awscdk.services.cloudfront.origins.OriginGroupProps
import software.amazon.awscdk.services.cloudfront.origins.RestApiOrigin
import software.amazon.awscdk.services.cloudfront.origins.RestApiOriginProps
import software.amazon.awscdk.services.cloudfront.origins.S3Origin
import software.amazon.awscdk.services.cloudfront.origins.S3OriginProps
import software.amazon.awscdk.services.elasticloadbalancingv2.ILoadBalancerV2
import software.amazon.awscdk.services.s3.IBucket

public object origins {
  public inline fun httpOrigin(domainName: String, block: HttpOriginDsl.() -> Unit = {}):
      HttpOrigin {
    val builder = HttpOriginDsl(domainName)
    builder.apply(block)
    return builder.build()
  }

  public inline fun httpOriginProps(block: HttpOriginPropsDsl.() -> Unit = {}): HttpOriginProps {
    val builder = HttpOriginPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun loadBalancerV2Origin(loadBalancer: ILoadBalancerV2,
      block: LoadBalancerV2OriginDsl.() -> Unit = {}): LoadBalancerV2Origin {
    val builder = LoadBalancerV2OriginDsl(loadBalancer)
    builder.apply(block)
    return builder.build()
  }

  public inline fun loadBalancerV2OriginProps(block: LoadBalancerV2OriginPropsDsl.() -> Unit = {}):
      LoadBalancerV2OriginProps {
    val builder = LoadBalancerV2OriginPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun originGroup(block: OriginGroupDsl.() -> Unit = {}): OriginGroup {
    val builder = OriginGroupDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun originGroupProps(block: OriginGroupPropsDsl.() -> Unit = {}): OriginGroupProps {
    val builder = OriginGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun restApiOrigin(restApi: RestApi, block: RestApiOriginDsl.() -> Unit = {}):
      RestApiOrigin {
    val builder = RestApiOriginDsl(restApi)
    builder.apply(block)
    return builder.build()
  }

  public inline fun restApiOriginProps(block: RestApiOriginPropsDsl.() -> Unit = {}):
      RestApiOriginProps {
    val builder = RestApiOriginPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun s3Origin(bucket: IBucket, block: S3OriginDsl.() -> Unit = {}): S3Origin {
    val builder = S3OriginDsl(bucket)
    builder.apply(block)
    return builder.build()
  }

  public inline fun s3OriginProps(block: S3OriginPropsDsl.() -> Unit = {}): S3OriginProps {
    val builder = S3OriginPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
