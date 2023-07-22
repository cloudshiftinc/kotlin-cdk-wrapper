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
  /**
   * The AWS::S3Outposts::AccessPoint resource specifies an access point and associates it with the
   * specified Amazon S3 on Outposts bucket.
   *
   * For more information, see [Managing data access with Amazon S3 access
   * points](https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-points.html) .
   *
   *
   * S3 on Outposts supports only VPC-style access points.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.s3outposts.*;
   * Object policy;
   * CfnAccessPoint cfnAccessPoint = CfnAccessPoint.Builder.create(this, "MyCfnAccessPoint")
   * .bucket("bucket")
   * .name("name")
   * .vpcConfiguration(VpcConfigurationProperty.builder()
   * .vpcId("vpcId")
   * .build())
   * // the properties below are optional
   * .policy(policy)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-accesspoint.html)
   */
  public inline fun cfnAccessPoint(
    scope: Construct,
    id: String,
    block: CfnAccessPointDsl.() -> Unit = {},
  ): CfnAccessPoint {
    val builder = CfnAccessPointDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnAccessPoint`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.s3outposts.*;
   * Object policy;
   * CfnAccessPointProps cfnAccessPointProps = CfnAccessPointProps.builder()
   * .bucket("bucket")
   * .name("name")
   * .vpcConfiguration(VpcConfigurationProperty.builder()
   * .vpcId("vpcId")
   * .build())
   * // the properties below are optional
   * .policy(policy)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-accesspoint.html)
   */
  public inline fun cfnAccessPointProps(block: CfnAccessPointPropsDsl.() -> Unit = {}):
      CfnAccessPointProps {
    val builder = CfnAccessPointPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Contains the virtual private cloud (VPC) configuration for the specified access point.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.s3outposts.*;
   * VpcConfigurationProperty vpcConfigurationProperty = VpcConfigurationProperty.builder()
   * .vpcId("vpcId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-accesspoint-vpcconfiguration.html)
   */
  public inline
      fun cfnAccessPointVpcConfigurationProperty(block: CfnAccessPointVpcConfigurationPropertyDsl.() -> Unit
      = {}): CfnAccessPoint.VpcConfigurationProperty {
    val builder = CfnAccessPointVpcConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The AWS::S3Outposts::Bucket resource specifies a new Amazon S3 on Outposts bucket.
   *
   * To create an S3 on Outposts bucket, you must have S3 on Outposts capacity provisioned on your
   * Outpost. For more information, see [Using Amazon S3 on
   * Outposts](https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html) .
   *
   * S3 on Outposts buckets support the following:
   *
   * * Tags
   * * Lifecycle configuration rules for deleting expired objects
   *
   * For a complete list of restrictions and Amazon S3 feature limitations on S3 on Outposts, see
   * [Amazon S3 on Outposts Restrictions and
   * Limitations](https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3OnOutpostsRestrictionsLimitations.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.s3outposts.*;
   * Object filter;
   * CfnBucket cfnBucket = CfnBucket.Builder.create(this, "MyCfnBucket")
   * .bucketName("bucketName")
   * .outpostId("outpostId")
   * // the properties below are optional
   * .lifecycleConfiguration(LifecycleConfigurationProperty.builder()
   * .rules(List.of(RuleProperty.builder()
   * .status("status")
   * // the properties below are optional
   * .abortIncompleteMultipartUpload(AbortIncompleteMultipartUploadProperty.builder()
   * .daysAfterInitiation(123)
   * .build())
   * .expirationDate("expirationDate")
   * .expirationInDays(123)
   * .filter(filter)
   * .id("id")
   * .build()))
   * .build())
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-bucket.html)
   */
  public inline fun cfnBucket(
    scope: Construct,
    id: String,
    block: CfnBucketDsl.() -> Unit = {},
  ): CfnBucket {
    val builder = CfnBucketDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Specifies the days since the initiation of an incomplete multipart upload that Amazon S3 on
   * Outposts waits before permanently removing all parts of the upload.
   *
   * For more information, see [Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle
   * Policy](https://docs.aws.amazon.com/AmazonS3/latest/userguide/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.s3outposts.*;
   * AbortIncompleteMultipartUploadProperty abortIncompleteMultipartUploadProperty =
   * AbortIncompleteMultipartUploadProperty.builder()
   * .daysAfterInitiation(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-bucket-abortincompletemultipartupload.html)
   */
  public inline
      fun cfnBucketAbortIncompleteMultipartUploadProperty(block: CfnBucketAbortIncompleteMultipartUploadPropertyDsl.() -> Unit
      = {}): CfnBucket.AbortIncompleteMultipartUploadProperty {
    val builder = CfnBucketAbortIncompleteMultipartUploadPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.s3outposts.*;
   * FilterAndOperatorProperty filterAndOperatorProperty = FilterAndOperatorProperty.builder()
   * .tags(List.of(FilterTagProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * // the properties below are optional
   * .prefix("prefix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-bucket-filterandoperator.html)
   */
  public inline
      fun cfnBucketFilterAndOperatorProperty(block: CfnBucketFilterAndOperatorPropertyDsl.() -> Unit
      = {}): CfnBucket.FilterAndOperatorProperty {
    val builder = CfnBucketFilterAndOperatorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.s3outposts.*;
   * FilterProperty filterProperty = FilterProperty.builder()
   * .andOperator(FilterAndOperatorProperty.builder()
   * .tags(List.of(FilterTagProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * // the properties below are optional
   * .prefix("prefix")
   * .build())
   * .prefix("prefix")
   * .tag(FilterTagProperty.builder()
   * .key("key")
   * .value("value")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-bucket-filter.html)
   */
  public inline fun cfnBucketFilterProperty(block: CfnBucketFilterPropertyDsl.() -> Unit = {}):
      CfnBucket.FilterProperty {
    val builder = CfnBucketFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.s3outposts.*;
   * FilterTagProperty filterTagProperty = FilterTagProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-bucket-filtertag.html)
   */
  public inline fun cfnBucketFilterTagProperty(block: CfnBucketFilterTagPropertyDsl.() -> Unit =
      {}): CfnBucket.FilterTagProperty {
    val builder = CfnBucketFilterTagPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The container for the lifecycle configuration for the objects stored in an S3 on Outposts
   * bucket.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.s3outposts.*;
   * Object filter;
   * LifecycleConfigurationProperty lifecycleConfigurationProperty =
   * LifecycleConfigurationProperty.builder()
   * .rules(List.of(RuleProperty.builder()
   * .status("status")
   * // the properties below are optional
   * .abortIncompleteMultipartUpload(AbortIncompleteMultipartUploadProperty.builder()
   * .daysAfterInitiation(123)
   * .build())
   * .expirationDate("expirationDate")
   * .expirationInDays(123)
   * .filter(filter)
   * .id("id")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-bucket-lifecycleconfiguration.html)
   */
  public inline
      fun cfnBucketLifecycleConfigurationProperty(block: CfnBucketLifecycleConfigurationPropertyDsl.() -> Unit
      = {}): CfnBucket.LifecycleConfigurationProperty {
    val builder = CfnBucketLifecycleConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * This resource applies a bucket policy to an Amazon S3 on Outposts bucket.
   *
   * If you are using an identity other than the root user of the AWS account that owns the S3 on
   * Outposts bucket, the calling identity must have the `s3-outposts:PutBucketPolicy` permissions on
   * the specified Outposts bucket and belong to the bucket owner's account in order to use this
   * resource.
   *
   * If you don't have `s3-outposts:PutBucketPolicy` permissions, S3 on Outposts returns a `403
   * Access Denied` error.
   *
   *
   * The root user of the AWS account that owns an Outposts bucket can *always* use this resource,
   * even if the policy explicitly denies the root user the ability to perform actions on this
   * resource.
   *
   *
   * For more information, see the AWS::IAM::Policy
   * [PolicyDocument](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-policydocument)
   * resource description in this guide and [Access Policy Language
   * Overview](https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-policy-language-overview.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.s3outposts.*;
   * Object policyDocument;
   * CfnBucketPolicy cfnBucketPolicy = CfnBucketPolicy.Builder.create(this, "MyCfnBucketPolicy")
   * .bucket("bucket")
   * .policyDocument(policyDocument)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-bucketpolicy.html)
   */
  public inline fun cfnBucketPolicy(
    scope: Construct,
    id: String,
    block: CfnBucketPolicyDsl.() -> Unit = {},
  ): CfnBucketPolicy {
    val builder = CfnBucketPolicyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnBucketPolicy`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.s3outposts.*;
   * Object policyDocument;
   * CfnBucketPolicyProps cfnBucketPolicyProps = CfnBucketPolicyProps.builder()
   * .bucket("bucket")
   * .policyDocument(policyDocument)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-bucketpolicy.html)
   */
  public inline fun cfnBucketPolicyProps(block: CfnBucketPolicyPropsDsl.() -> Unit = {}):
      CfnBucketPolicyProps {
    val builder = CfnBucketPolicyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnBucket`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.s3outposts.*;
   * Object filter;
   * CfnBucketProps cfnBucketProps = CfnBucketProps.builder()
   * .bucketName("bucketName")
   * .outpostId("outpostId")
   * // the properties below are optional
   * .lifecycleConfiguration(LifecycleConfigurationProperty.builder()
   * .rules(List.of(RuleProperty.builder()
   * .status("status")
   * // the properties below are optional
   * .abortIncompleteMultipartUpload(AbortIncompleteMultipartUploadProperty.builder()
   * .daysAfterInitiation(123)
   * .build())
   * .expirationDate("expirationDate")
   * .expirationInDays(123)
   * .filter(filter)
   * .id("id")
   * .build()))
   * .build())
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-bucket.html)
   */
  public inline fun cfnBucketProps(block: CfnBucketPropsDsl.() -> Unit = {}): CfnBucketProps {
    val builder = CfnBucketPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A container for an Amazon S3 on Outposts bucket lifecycle rule.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.s3outposts.*;
   * Object filter;
   * RuleProperty ruleProperty = RuleProperty.builder()
   * .status("status")
   * // the properties below are optional
   * .abortIncompleteMultipartUpload(AbortIncompleteMultipartUploadProperty.builder()
   * .daysAfterInitiation(123)
   * .build())
   * .expirationDate("expirationDate")
   * .expirationInDays(123)
   * .filter(filter)
   * .id("id")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-bucket-rule.html)
   */
  public inline fun cfnBucketRuleProperty(block: CfnBucketRulePropertyDsl.() -> Unit = {}):
      CfnBucket.RuleProperty {
    val builder = CfnBucketRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * This AWS::S3Outposts::Endpoint resource specifies an endpoint and associates it with the
   * specified Outpost.
   *
   * Amazon S3 on Outposts access points simplify managing data access at scale for shared datasets
   * in S3 on Outposts. S3 on Outposts uses endpoints to connect to S3 on Outposts buckets so that you
   * can perform actions within your virtual private cloud (VPC). For more information, see [Accessing
   * S3 on Outposts using VPC-only access
   * points](https://docs.aws.amazon.com/AmazonS3/latest/userguide/AccessingS3Outposts.html) .
   *
   *
   * It can take up to 5 minutes for this resource to be created.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.s3outposts.*;
   * CfnEndpoint cfnEndpoint = CfnEndpoint.Builder.create(this, "MyCfnEndpoint")
   * .outpostId("outpostId")
   * .securityGroupId("securityGroupId")
   * .subnetId("subnetId")
   * // the properties below are optional
   * .accessType("accessType")
   * .customerOwnedIpv4Pool("customerOwnedIpv4Pool")
   * .failedReason(FailedReasonProperty.builder()
   * .errorCode("errorCode")
   * .message("message")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-endpoint.html)
   */
  public inline fun cfnEndpoint(
    scope: Construct,
    id: String,
    block: CfnEndpointDsl.() -> Unit = {},
  ): CfnEndpoint {
    val builder = CfnEndpointDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.s3outposts.*;
   * FailedReasonProperty failedReasonProperty = FailedReasonProperty.builder()
   * .errorCode("errorCode")
   * .message("message")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-endpoint-failedreason.html)
   */
  public inline
      fun cfnEndpointFailedReasonProperty(block: CfnEndpointFailedReasonPropertyDsl.() -> Unit =
      {}): CfnEndpoint.FailedReasonProperty {
    val builder = CfnEndpointFailedReasonPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The container for the network interface.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.s3outposts.*;
   * NetworkInterfaceProperty networkInterfaceProperty = NetworkInterfaceProperty.builder()
   * .networkInterfaceId("networkInterfaceId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-endpoint-networkinterface.html)
   */
  public inline
      fun cfnEndpointNetworkInterfaceProperty(block: CfnEndpointNetworkInterfacePropertyDsl.() -> Unit
      = {}): CfnEndpoint.NetworkInterfaceProperty {
    val builder = CfnEndpointNetworkInterfacePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnEndpoint`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.s3outposts.*;
   * CfnEndpointProps cfnEndpointProps = CfnEndpointProps.builder()
   * .outpostId("outpostId")
   * .securityGroupId("securityGroupId")
   * .subnetId("subnetId")
   * // the properties below are optional
   * .accessType("accessType")
   * .customerOwnedIpv4Pool("customerOwnedIpv4Pool")
   * .failedReason(FailedReasonProperty.builder()
   * .errorCode("errorCode")
   * .message("message")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-endpoint.html)
   */
  public inline fun cfnEndpointProps(block: CfnEndpointPropsDsl.() -> Unit = {}): CfnEndpointProps {
    val builder = CfnEndpointPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
