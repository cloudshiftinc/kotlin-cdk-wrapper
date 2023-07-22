@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3objectlambda

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPointPolicy
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPointPolicyProps
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPointProps
import software.constructs.Construct

public object s3objectlambda {
  /**
   * The `AWS::S3ObjectLambda::AccessPoint` resource specifies an Object Lambda Access Point used to
   * access a bucket.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.s3objectlambda.*;
   * Object contentTransformation;
   * CfnAccessPoint cfnAccessPoint = CfnAccessPoint.Builder.create(this, "MyCfnAccessPoint")
   * .objectLambdaConfiguration(ObjectLambdaConfigurationProperty.builder()
   * .supportingAccessPoint("supportingAccessPoint")
   * .transformationConfigurations(List.of(TransformationConfigurationProperty.builder()
   * .actions(List.of("actions"))
   * .contentTransformation(contentTransformation)
   * .build()))
   * // the properties below are optional
   * .allowedFeatures(List.of("allowedFeatures"))
   * .cloudWatchMetricsEnabled(false)
   * .build())
   * // the properties below are optional
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3objectlambda-accesspoint.html)
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
   * The alias of an Object Lambda Access Point.
   *
   * For more information, see [How to use a bucket-style alias for your S3 bucket Object Lambda
   * Access
   * Point](https://docs.aws.amazon.com/AmazonS3/latest/userguide/olap-use.html#ol-access-points-alias)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.s3objectlambda.*;
   * AliasProperty aliasProperty = AliasProperty.builder()
   * .status("status")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-alias.html)
   */
  public inline fun cfnAccessPointAliasProperty(block: CfnAccessPointAliasPropertyDsl.() -> Unit =
      {}): CfnAccessPoint.AliasProperty {
    val builder = CfnAccessPointAliasPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.s3objectlambda.*;
   * AwsLambdaProperty awsLambdaProperty = AwsLambdaProperty.builder()
   * .functionArn("functionArn")
   * // the properties below are optional
   * .functionPayload("functionPayload")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-awslambda.html)
   */
  public inline
      fun cfnAccessPointAwsLambdaProperty(block: CfnAccessPointAwsLambdaPropertyDsl.() -> Unit =
      {}): CfnAccessPoint.AwsLambdaProperty {
    val builder = CfnAccessPointAwsLambdaPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.s3objectlambda.*;
   * ContentTransformationProperty contentTransformationProperty =
   * ContentTransformationProperty.builder()
   * .awsLambda(AwsLambdaProperty.builder()
   * .functionArn("functionArn")
   * // the properties below are optional
   * .functionPayload("functionPayload")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-contenttransformation.html)
   */
  public inline
      fun cfnAccessPointContentTransformationProperty(block: CfnAccessPointContentTransformationPropertyDsl.() -> Unit
      = {}): CfnAccessPoint.ContentTransformationProperty {
    val builder = CfnAccessPointContentTransformationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A configuration used when creating an Object Lambda Access Point.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.s3objectlambda.*;
   * Object contentTransformation;
   * ObjectLambdaConfigurationProperty objectLambdaConfigurationProperty =
   * ObjectLambdaConfigurationProperty.builder()
   * .supportingAccessPoint("supportingAccessPoint")
   * .transformationConfigurations(List.of(TransformationConfigurationProperty.builder()
   * .actions(List.of("actions"))
   * .contentTransformation(contentTransformation)
   * .build()))
   * // the properties below are optional
   * .allowedFeatures(List.of("allowedFeatures"))
   * .cloudWatchMetricsEnabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-objectlambdaconfiguration.html)
   */
  public inline
      fun cfnAccessPointObjectLambdaConfigurationProperty(block: CfnAccessPointObjectLambdaConfigurationPropertyDsl.() -> Unit
      = {}): CfnAccessPoint.ObjectLambdaConfigurationProperty {
    val builder = CfnAccessPointObjectLambdaConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `AWS::S3ObjectLambda::AccessPointPolicy` resource specifies the Object Lambda Access Point
   * resource policy document.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.s3objectlambda.*;
   * Object policyDocument;
   * CfnAccessPointPolicy cfnAccessPointPolicy = CfnAccessPointPolicy.Builder.create(this,
   * "MyCfnAccessPointPolicy")
   * .objectLambdaAccessPoint("objectLambdaAccessPoint")
   * .policyDocument(policyDocument)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3objectlambda-accesspointpolicy.html)
   */
  public inline fun cfnAccessPointPolicy(
    scope: Construct,
    id: String,
    block: CfnAccessPointPolicyDsl.() -> Unit = {},
  ): CfnAccessPointPolicy {
    val builder = CfnAccessPointPolicyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnAccessPointPolicy`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.s3objectlambda.*;
   * Object policyDocument;
   * CfnAccessPointPolicyProps cfnAccessPointPolicyProps = CfnAccessPointPolicyProps.builder()
   * .objectLambdaAccessPoint("objectLambdaAccessPoint")
   * .policyDocument(policyDocument)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3objectlambda-accesspointpolicy.html)
   */
  public inline fun cfnAccessPointPolicyProps(block: CfnAccessPointPolicyPropsDsl.() -> Unit = {}):
      CfnAccessPointPolicyProps {
    val builder = CfnAccessPointPolicyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Indicates whether this access point policy is public.
   *
   * For more information about how Amazon S3 evaluates policies to determine whether they are
   * public, see [The Meaning of
   * "Public"](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status)
   * in the *Amazon S3 User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.s3objectlambda.*;
   * PolicyStatusProperty policyStatusProperty = PolicyStatusProperty.builder()
   * .isPublic(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-policystatus.html)
   */
  public inline
      fun cfnAccessPointPolicyStatusProperty(block: CfnAccessPointPolicyStatusPropertyDsl.() -> Unit
      = {}): CfnAccessPoint.PolicyStatusProperty {
    val builder = CfnAccessPointPolicyStatusPropertyDsl()
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
   * import software.amazon.awscdk.services.s3objectlambda.*;
   * Object contentTransformation;
   * CfnAccessPointProps cfnAccessPointProps = CfnAccessPointProps.builder()
   * .objectLambdaConfiguration(ObjectLambdaConfigurationProperty.builder()
   * .supportingAccessPoint("supportingAccessPoint")
   * .transformationConfigurations(List.of(TransformationConfigurationProperty.builder()
   * .actions(List.of("actions"))
   * .contentTransformation(contentTransformation)
   * .build()))
   * // the properties below are optional
   * .allowedFeatures(List.of("allowedFeatures"))
   * .cloudWatchMetricsEnabled(false)
   * .build())
   * // the properties below are optional
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3objectlambda-accesspoint.html)
   */
  public inline fun cfnAccessPointProps(block: CfnAccessPointPropsDsl.() -> Unit = {}):
      CfnAccessPointProps {
    val builder = CfnAccessPointPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `PublicAccessBlock` configuration that you want to apply to this Amazon S3 account.
   *
   * You can enable the configuration options in any combination. For more information about when
   * Amazon S3 considers a bucket or object public, see [The Meaning of
   * "Public"](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status)
   * in the *Amazon S3 User Guide* .
   *
   * This data type is not supported for Amazon S3 on Outposts.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.s3objectlambda.*;
   * PublicAccessBlockConfigurationProperty publicAccessBlockConfigurationProperty =
   * PublicAccessBlockConfigurationProperty.builder()
   * .blockPublicAcls(false)
   * .blockPublicPolicy(false)
   * .ignorePublicAcls(false)
   * .restrictPublicBuckets(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-publicaccessblockconfiguration.html)
   */
  public inline
      fun cfnAccessPointPublicAccessBlockConfigurationProperty(block: CfnAccessPointPublicAccessBlockConfigurationPropertyDsl.() -> Unit
      = {}): CfnAccessPoint.PublicAccessBlockConfigurationProperty {
    val builder = CfnAccessPointPublicAccessBlockConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A configuration used when creating an Object Lambda Access Point transformation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.s3objectlambda.*;
   * Object contentTransformation;
   * TransformationConfigurationProperty transformationConfigurationProperty =
   * TransformationConfigurationProperty.builder()
   * .actions(List.of("actions"))
   * .contentTransformation(contentTransformation)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-transformationconfiguration.html)
   */
  public inline
      fun cfnAccessPointTransformationConfigurationProperty(block: CfnAccessPointTransformationConfigurationPropertyDsl.() -> Unit
      = {}): CfnAccessPoint.TransformationConfigurationProperty {
    val builder = CfnAccessPointTransformationConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
