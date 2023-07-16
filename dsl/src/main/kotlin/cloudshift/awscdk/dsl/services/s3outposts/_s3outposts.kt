@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3outposts

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3outposts.CfnAccessPoint
import software.amazon.awscdk.services.s3outposts.CfnAccessPointProps
import software.amazon.awscdk.services.s3outposts.CfnBucket
import software.amazon.awscdk.services.s3outposts.CfnBucketPolicy
import software.amazon.awscdk.services.s3outposts.CfnBucketPolicyProps
import software.amazon.awscdk.services.s3outposts.CfnBucketProps
import software.amazon.awscdk.services.s3outposts.CfnEndpoint
import software.amazon.awscdk.services.s3outposts.CfnEndpointProps
import software.constructs.Construct

public object s3outposts {
  public inline fun cfnAccessPoint(
    scope: Construct,
    id: String,
    block: CfnAccessPointDsl.() -> Unit = {},
  ): CfnAccessPoint {
    val builder = CfnAccessPointDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAccessPointProps(block: CfnAccessPointPropsDsl.() -> Unit = {}):
      CfnAccessPointProps {
    val builder = CfnAccessPointPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAccessPointVpcConfigurationProperty(block: CfnAccessPointVpcConfigurationPropertyDsl.() -> Unit
      = {}): CfnAccessPoint.VpcConfigurationProperty {
    val builder = CfnAccessPointVpcConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBucket(
    scope: Construct,
    id: String,
    block: CfnBucketDsl.() -> Unit = {},
  ): CfnBucket {
    val builder = CfnBucketDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBucketAbortIncompleteMultipartUploadProperty(block: CfnBucketAbortIncompleteMultipartUploadPropertyDsl.() -> Unit
      = {}): CfnBucket.AbortIncompleteMultipartUploadProperty {
    val builder = CfnBucketAbortIncompleteMultipartUploadPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBucketFilterAndOperatorProperty(block: CfnBucketFilterAndOperatorPropertyDsl.() -> Unit
      = {}): CfnBucket.FilterAndOperatorProperty {
    val builder = CfnBucketFilterAndOperatorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBucketFilterProperty(block: CfnBucketFilterPropertyDsl.() -> Unit = {}):
      CfnBucket.FilterProperty {
    val builder = CfnBucketFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBucketFilterTagProperty(block: CfnBucketFilterTagPropertyDsl.() -> Unit =
      {}): CfnBucket.FilterTagProperty {
    val builder = CfnBucketFilterTagPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBucketLifecycleConfigurationProperty(block: CfnBucketLifecycleConfigurationPropertyDsl.() -> Unit
      = {}): CfnBucket.LifecycleConfigurationProperty {
    val builder = CfnBucketLifecycleConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBucketPolicy(
    scope: Construct,
    id: String,
    block: CfnBucketPolicyDsl.() -> Unit = {},
  ): CfnBucketPolicy {
    val builder = CfnBucketPolicyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBucketPolicyProps(block: CfnBucketPolicyPropsDsl.() -> Unit = {}):
      CfnBucketPolicyProps {
    val builder = CfnBucketPolicyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBucketProps(block: CfnBucketPropsDsl.() -> Unit = {}): CfnBucketProps {
    val builder = CfnBucketPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBucketRuleProperty(block: CfnBucketRulePropertyDsl.() -> Unit = {}):
      CfnBucket.RuleProperty {
    val builder = CfnBucketRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEndpoint(
    scope: Construct,
    id: String,
    block: CfnEndpointDsl.() -> Unit = {},
  ): CfnEndpoint {
    val builder = CfnEndpointDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEndpointNetworkInterfaceProperty(block: CfnEndpointNetworkInterfacePropertyDsl.() -> Unit
      = {}): CfnEndpoint.NetworkInterfaceProperty {
    val builder = CfnEndpointNetworkInterfacePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEndpointProps(block: CfnEndpointPropsDsl.() -> Unit = {}): CfnEndpointProps {
    val builder = CfnEndpointPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
