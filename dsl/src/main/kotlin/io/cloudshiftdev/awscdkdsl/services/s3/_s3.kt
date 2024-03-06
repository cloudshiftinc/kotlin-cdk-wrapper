@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.s3

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3.BlockPublicAccess
import software.amazon.awscdk.services.s3.BlockPublicAccessOptions
import software.amazon.awscdk.services.s3.Bucket
import software.amazon.awscdk.services.s3.BucketAttributes
import software.amazon.awscdk.services.s3.BucketMetrics
import software.amazon.awscdk.services.s3.BucketNotificationDestinationConfig
import software.amazon.awscdk.services.s3.BucketPolicy
import software.amazon.awscdk.services.s3.BucketPolicyProps
import software.amazon.awscdk.services.s3.BucketProps
import software.amazon.awscdk.services.s3.CfnAccessGrant
import software.amazon.awscdk.services.s3.CfnAccessGrantProps
import software.amazon.awscdk.services.s3.CfnAccessGrantsInstance
import software.amazon.awscdk.services.s3.CfnAccessGrantsInstanceProps
import software.amazon.awscdk.services.s3.CfnAccessGrantsLocation
import software.amazon.awscdk.services.s3.CfnAccessGrantsLocationProps
import software.amazon.awscdk.services.s3.CfnAccessPoint
import software.amazon.awscdk.services.s3.CfnAccessPointProps
import software.amazon.awscdk.services.s3.CfnBucket
import software.amazon.awscdk.services.s3.CfnBucketPolicy
import software.amazon.awscdk.services.s3.CfnBucketPolicyProps
import software.amazon.awscdk.services.s3.CfnBucketProps
import software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint
import software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicy
import software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicyProps
import software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointProps
import software.amazon.awscdk.services.s3.CfnStorageLens
import software.amazon.awscdk.services.s3.CfnStorageLensGroup
import software.amazon.awscdk.services.s3.CfnStorageLensGroupProps
import software.amazon.awscdk.services.s3.CfnStorageLensProps
import software.amazon.awscdk.services.s3.CorsRule
import software.amazon.awscdk.services.s3.IntelligentTieringConfiguration
import software.amazon.awscdk.services.s3.Inventory
import software.amazon.awscdk.services.s3.InventoryDestination
import software.amazon.awscdk.services.s3.LifecycleRule
import software.amazon.awscdk.services.s3.Location
import software.amazon.awscdk.services.s3.NoncurrentVersionTransition
import software.amazon.awscdk.services.s3.NotificationKeyFilter
import software.amazon.awscdk.services.s3.OnCloudTrailBucketEventOptions
import software.amazon.awscdk.services.s3.RedirectTarget
import software.amazon.awscdk.services.s3.RoutingRule
import software.amazon.awscdk.services.s3.RoutingRuleCondition
import software.amazon.awscdk.services.s3.Tag
import software.amazon.awscdk.services.s3.TransferAccelerationUrlOptions
import software.amazon.awscdk.services.s3.Transition
import software.amazon.awscdk.services.s3.VirtualHostedStyleUrlOptions
import software.constructs.Construct

public object s3 {
    /**
     * Example:
     * ```
     * Bucket bucket = Bucket.Builder.create(this, "MyBlockedBucket")
     * .blockPublicAccess(BlockPublicAccess.BLOCK_ALL)
     * .build();
     * ```
     */
    public inline fun blockPublicAccess(
        block: BlockPublicAccessDsl.() -> Unit = {}
    ): BlockPublicAccess {
        val builder = BlockPublicAccessDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * Bucket bucket = Bucket.Builder.create(this, "MyBlockedBucket")
     * .blockPublicAccess(BlockPublicAccess.Builder.create().blockPublicPolicy(true).build())
     * .build();
     * ```
     */
    public inline fun blockPublicAccessOptions(
        block: BlockPublicAccessOptionsDsl.() -> Unit = {}
    ): BlockPublicAccessOptions {
        val builder = BlockPublicAccessOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An S3 bucket with associated policy objects.
     *
     * This bucket does not yet have all features that exposed by the underlying BucketResource.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.RemovalPolicy;
     * Bucket.Builder.create(scope, "Bucket")
     * .blockPublicAccess(BlockPublicAccess.BLOCK_ALL)
     * .encryption(BucketEncryption.S3_MANAGED)
     * .enforceSSL(true)
     * .versioned(true)
     * .removalPolicy(RemovalPolicy.RETAIN)
     * .build();
     * ```
     */
    public inline fun bucket(
        scope: Construct,
        id: String,
        block: BucketDsl.() -> Unit = {},
    ): Bucket {
        val builder = BucketDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A reference to a bucket outside this stack.
     *
     * Example:
     * ```
     * Function myLambda;
     * IBucket bucket = Bucket.fromBucketAttributes(this, "ImportedBucket", BucketAttributes.builder()
     * .bucketArn("arn:aws:s3:::my-bucket")
     * .build());
     * // now you can just call methods on the bucket
     * bucket.addEventNotification(EventType.OBJECT_CREATED, new LambdaDestination(myLambda),
     * NotificationKeyFilter.builder()
     * .prefix("home/myusername/ *")
     * .build());
     * ```
     */
    public inline fun bucketAttributes(
        block: BucketAttributesDsl.() -> Unit = {}
    ): BucketAttributes {
        val builder = BucketAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a metrics configuration for the CloudWatch request metrics from an Amazon S3
     * bucket.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * Object tagFilters;
     * BucketMetrics bucketMetrics = BucketMetrics.builder()
     * .id("id")
     * // the properties below are optional
     * .prefix("prefix")
     * .tagFilters(Map.of(
     * "tagFiltersKey", tagFilters))
     * .build();
     * ```
     */
    public inline fun bucketMetrics(block: BucketMetricsDsl.() -> Unit = {}): BucketMetrics {
        val builder = BucketMetricsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents the properties of a notification destination.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * import software.constructs.*;
     * IDependable dependable;
     * BucketNotificationDestinationConfig bucketNotificationDestinationConfig =
     * BucketNotificationDestinationConfig.builder()
     * .arn("arn")
     * .type(BucketNotificationDestinationType.LAMBDA)
     * // the properties below are optional
     * .dependencies(List.of(dependable))
     * .build();
     * ```
     */
    public inline fun bucketNotificationDestinationConfig(
        block: BucketNotificationDestinationConfigDsl.() -> Unit = {}
    ): BucketNotificationDestinationConfig {
        val builder = BucketNotificationDestinationConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The bucket policy for an Amazon S3 bucket.
     *
     * Policies define the operations that are allowed on this resource.
     *
     * You almost never need to define this construct directly.
     *
     * All AWS resources that support resource policies have a method called
     * `addToResourcePolicy()`, which will automatically create a new resource policy if one doesn't
     * exist yet, otherwise it will add to the existing policy.
     *
     * Prefer to use `addToResourcePolicy()` instead.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.s3.*;
     * Bucket bucket;
     * BucketPolicy bucketPolicy = BucketPolicy.Builder.create(this, "MyBucketPolicy")
     * .bucket(bucket)
     * // the properties below are optional
     * .removalPolicy(RemovalPolicy.DESTROY)
     * .build();
     * ```
     */
    public inline fun bucketPolicy(
        scope: Construct,
        id: String,
        block: BucketPolicyDsl.() -> Unit = {},
    ): BucketPolicy {
        val builder = BucketPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.s3.*;
     * Bucket bucket;
     * BucketPolicyProps bucketPolicyProps = BucketPolicyProps.builder()
     * .bucket(bucket)
     * // the properties below are optional
     * .removalPolicy(RemovalPolicy.DESTROY)
     * .build();
     * ```
     */
    public inline fun bucketPolicyProps(
        block: BucketPolicyPropsDsl.() -> Unit = {}
    ): BucketPolicyProps {
        val builder = BucketPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * Bucket sourceBucket = Bucket.Builder.create(this, "MyBucket")
     * .versioned(true)
     * .build();
     * Pipeline pipeline = new Pipeline(this, "MyPipeline");
     * Artifact sourceOutput = new Artifact();
     * S3SourceAction sourceAction = S3SourceAction.Builder.create()
     * .actionName("S3Source")
     * .bucket(sourceBucket)
     * .bucketKey("path/to/file.zip")
     * .output(sourceOutput)
     * .build();
     * pipeline.addStage(StageOptions.builder()
     * .stageName("Source")
     * .actions(List.of(sourceAction))
     * .build());
     * ```
     */
    public inline fun bucketProps(block: BucketPropsDsl.() -> Unit = {}): BucketProps {
        val builder = BucketPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::S3::AccessGrant` resource creates an access grant that gives a grantee access to
     * your S3 data.
     *
     * The grantee can be an IAM user or role or a directory user, or group. Before you can create a
     * grant, you must have an S3 Access Grants instance in the same Region as the S3 data. You can
     * create an S3 Access Grants instance using the
     * [AWS::S3::AccessGrantsInstance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrantsinstance.html)
     * . You must also have registered at least one S3 data location in your S3 Access Grants
     * instance using
     * [AWS::S3::AccessGrantsLocation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrantslocation.html)
     * .
     * * **Permissions** - You must have the `s3:CreateAccessGrant` permission to use this resource.
     * * **Additional Permissions** - For any directory identity - `sso:DescribeInstance` and
     *   `sso:DescribeApplication`
     *
     * For directory users - `identitystore:DescribeUser`
     *
     * For directory groups - `identitystore:DescribeGroup`
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * CfnAccessGrant cfnAccessGrant = CfnAccessGrant.Builder.create(this, "MyCfnAccessGrant")
     * .accessGrantsLocationId("accessGrantsLocationId")
     * .grantee(GranteeProperty.builder()
     * .granteeIdentifier("granteeIdentifier")
     * .granteeType("granteeType")
     * .build())
     * .permission("permission")
     * // the properties below are optional
     * .accessGrantsLocationConfiguration(AccessGrantsLocationConfigurationProperty.builder()
     * .s3SubPrefix("s3SubPrefix")
     * .build())
     * .applicationArn("applicationArn")
     * .s3PrefixType("s3PrefixType")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrant.html)
     */
    public inline fun cfnAccessGrant(
        scope: Construct,
        id: String,
        block: CfnAccessGrantDsl.() -> Unit = {},
    ): CfnAccessGrant {
        val builder = CfnAccessGrantDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration options of the S3 Access Grants location.
     *
     * It contains the `S3SubPrefix` field. The grant scope, the data to which you are granting
     * access, is the result of appending the `Subprefix` field to the scope of the registered
     * location.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * AccessGrantsLocationConfigurationProperty accessGrantsLocationConfigurationProperty =
     * AccessGrantsLocationConfigurationProperty.builder()
     * .s3SubPrefix("s3SubPrefix")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accessgrant-accessgrantslocationconfiguration.html)
     */
    public inline fun cfnAccessGrantAccessGrantsLocationConfigurationProperty(
        block: CfnAccessGrantAccessGrantsLocationConfigurationPropertyDsl.() -> Unit = {}
    ): CfnAccessGrant.AccessGrantsLocationConfigurationProperty {
        val builder = CfnAccessGrantAccessGrantsLocationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The user, group, or role to which you are granting access.
     *
     * You can grant access to an IAM user or role. If you have added your corporate directory to
     * AWS IAM Identity Center and associated your Identity Center instance with your S3 Access
     * Grants instance, the grantee can also be a corporate directory user or group.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * GranteeProperty granteeProperty = GranteeProperty.builder()
     * .granteeIdentifier("granteeIdentifier")
     * .granteeType("granteeType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accessgrant-grantee.html)
     */
    public inline fun cfnAccessGrantGranteeProperty(
        block: CfnAccessGrantGranteePropertyDsl.() -> Unit = {}
    ): CfnAccessGrant.GranteeProperty {
        val builder = CfnAccessGrantGranteePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAccessGrant`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * CfnAccessGrantProps cfnAccessGrantProps = CfnAccessGrantProps.builder()
     * .accessGrantsLocationId("accessGrantsLocationId")
     * .grantee(GranteeProperty.builder()
     * .granteeIdentifier("granteeIdentifier")
     * .granteeType("granteeType")
     * .build())
     * .permission("permission")
     * // the properties below are optional
     * .accessGrantsLocationConfiguration(AccessGrantsLocationConfigurationProperty.builder()
     * .s3SubPrefix("s3SubPrefix")
     * .build())
     * .applicationArn("applicationArn")
     * .s3PrefixType("s3PrefixType")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrant.html)
     */
    public inline fun cfnAccessGrantProps(
        block: CfnAccessGrantPropsDsl.() -> Unit = {}
    ): CfnAccessGrantProps {
        val builder = CfnAccessGrantPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::S3::AccessGrantInstance` resource creates an S3 Access Grants instance, which
     * serves as a logical grouping for access grants.
     *
     * You can create one S3 Access Grants instance per Region per account.
     * * **Permissions** - You must have the `s3:CreateAccessGrantsInstance` permission to use this
     *   resource.
     * * **Additional Permissions** - To associate an IAM Identity Center instance with your S3
     *   Access Grants instance, you must also have the `sso:DescribeInstance` ,
     *   `sso:CreateApplication` , `sso:PutApplicationGrant` , and
     *   `sso:PutApplicationAuthenticationMethod` permissions.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * CfnAccessGrantsInstance cfnAccessGrantsInstance = CfnAccessGrantsInstance.Builder.create(this,
     * "MyCfnAccessGrantsInstance")
     * .identityCenterArn("identityCenterArn")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrantsinstance.html)
     */
    public inline fun cfnAccessGrantsInstance(
        scope: Construct,
        id: String,
        block: CfnAccessGrantsInstanceDsl.() -> Unit = {},
    ): CfnAccessGrantsInstance {
        val builder = CfnAccessGrantsInstanceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAccessGrantsInstance`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * CfnAccessGrantsInstanceProps cfnAccessGrantsInstanceProps =
     * CfnAccessGrantsInstanceProps.builder()
     * .identityCenterArn("identityCenterArn")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrantsinstance.html)
     */
    public inline fun cfnAccessGrantsInstanceProps(
        block: CfnAccessGrantsInstancePropsDsl.() -> Unit = {}
    ): CfnAccessGrantsInstanceProps {
        val builder = CfnAccessGrantsInstancePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::S3::AccessGrantsLocation` resource creates the S3 data location that you would like
     * to register in your S3 Access Grants instance.
     *
     * Your S3 data must be in the same Region as your S3 Access Grants instance. The location can
     * be one of the following:
     * * The default S3 location `s3://`
     * * A bucket - `S3://&lt;bucket-name&gt;`
     * * A bucket and prefix - `S3://&lt;bucket-name&gt;/&lt;prefix&gt;`
     *
     * When you register a location, you must include the IAM role that has permission to manage the
     * S3 location that you are registering. Give S3 Access Grants permission to assume this role
     * [using a policy](https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-grants-location.html)
     * . S3 Access Grants assumes this role to manage access to the location and to vend temporary
     * credentials to grantees or client applications.
     * * **Permissions** - You must have the `s3:CreateAccessGrantsLocation` permission to use this
     *   resource.
     * * **Additional Permissions** - You must also have the following permission for the specified
     *   IAM role: `iam:PassRole`
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * CfnAccessGrantsLocation cfnAccessGrantsLocation = CfnAccessGrantsLocation.Builder.create(this,
     * "MyCfnAccessGrantsLocation")
     * .iamRoleArn("iamRoleArn")
     * .locationScope("locationScope")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrantslocation.html)
     */
    public inline fun cfnAccessGrantsLocation(
        scope: Construct,
        id: String,
        block: CfnAccessGrantsLocationDsl.() -> Unit = {},
    ): CfnAccessGrantsLocation {
        val builder = CfnAccessGrantsLocationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAccessGrantsLocation`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * CfnAccessGrantsLocationProps cfnAccessGrantsLocationProps =
     * CfnAccessGrantsLocationProps.builder()
     * .iamRoleArn("iamRoleArn")
     * .locationScope("locationScope")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrantslocation.html)
     */
    public inline fun cfnAccessGrantsLocationProps(
        block: CfnAccessGrantsLocationPropsDsl.() -> Unit = {}
    ): CfnAccessGrantsLocationProps {
        val builder = CfnAccessGrantsLocationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The AWS::S3::AccessPoint resource is an Amazon S3 resource type that you can use to access
     * buckets.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * Object policy;
     * CfnAccessPoint cfnAccessPoint = CfnAccessPoint.Builder.create(this, "MyCfnAccessPoint")
     * .bucket("bucket")
     * // the properties below are optional
     * .bucketAccountId("bucketAccountId")
     * .name("name")
     * .policy(policy)
     * .publicAccessBlockConfiguration(PublicAccessBlockConfigurationProperty.builder()
     * .blockPublicAcls(false)
     * .blockPublicPolicy(false)
     * .ignorePublicAcls(false)
     * .restrictPublicBuckets(false)
     * .build())
     * .vpcConfiguration(VpcConfigurationProperty.builder()
     * .vpcId("vpcId")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html)
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
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * Object policy;
     * CfnAccessPointProps cfnAccessPointProps = CfnAccessPointProps.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .bucketAccountId("bucketAccountId")
     * .name("name")
     * .policy(policy)
     * .publicAccessBlockConfiguration(PublicAccessBlockConfigurationProperty.builder()
     * .blockPublicAcls(false)
     * .blockPublicPolicy(false)
     * .ignorePublicAcls(false)
     * .restrictPublicBuckets(false)
     * .build())
     * .vpcConfiguration(VpcConfigurationProperty.builder()
     * .vpcId("vpcId")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html)
     */
    public inline fun cfnAccessPointProps(
        block: CfnAccessPointPropsDsl.() -> Unit = {}
    ): CfnAccessPointProps {
        val builder = CfnAccessPointPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The PublicAccessBlock configuration that you want to apply to this Amazon S3 bucket.
     *
     * You can enable the configuration options in any combination. For more information about when
     * Amazon S3 considers a bucket or object public, see
     * [The Meaning of "Public"](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status)
     * in the *Amazon S3 User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * PublicAccessBlockConfigurationProperty publicAccessBlockConfigurationProperty =
     * PublicAccessBlockConfigurationProperty.builder()
     * .blockPublicAcls(false)
     * .blockPublicPolicy(false)
     * .ignorePublicAcls(false)
     * .restrictPublicBuckets(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accesspoint-publicaccessblockconfiguration.html)
     */
    public inline fun cfnAccessPointPublicAccessBlockConfigurationProperty(
        block: CfnAccessPointPublicAccessBlockConfigurationPropertyDsl.() -> Unit = {}
    ): CfnAccessPoint.PublicAccessBlockConfigurationProperty {
        val builder = CfnAccessPointPublicAccessBlockConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Virtual Private Cloud (VPC) configuration for this access point.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * VpcConfigurationProperty vpcConfigurationProperty = VpcConfigurationProperty.builder()
     * .vpcId("vpcId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accesspoint-vpcconfiguration.html)
     */
    public inline fun cfnAccessPointVpcConfigurationProperty(
        block: CfnAccessPointVpcConfigurationPropertyDsl.() -> Unit = {}
    ): CfnAccessPoint.VpcConfigurationProperty {
        val builder = CfnAccessPointVpcConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::S3::Bucket` resource creates an Amazon S3 bucket in the same AWS Region where you
     * create the AWS CloudFormation stack.
     *
     * To control how AWS CloudFormation handles the bucket when the stack is deleted, you can set a
     * deletion policy for your bucket. You can choose to *retain* the bucket or to *delete* the
     * bucket. For more information, see
     * [DeletionPolicy Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html)
     * .
     *
     * You can only delete empty buckets. Deletion fails for buckets that have contents.
     *
     * Example:
     * ```
     * CfnInclude cfnTemplate;
     * CfnBucket cfnBucket = (CfnBucket)cfnTemplate.getResource("Bucket");
     * Role role = Role.Builder.create(this, "Role")
     * .assumedBy(new AnyPrincipal())
     * .build();
     * role.addToPolicy(PolicyStatement.Builder.create()
     * .actions(List.of("s3:*"))
     * .resources(List.of(cfnBucket.getAttrArn()))
     * .build());
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html)
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
     * Specifies the days since the initiation of an incomplete multipart upload that Amazon S3 will
     * wait before permanently removing all parts of the upload.
     *
     * For more information, see
     * [Stopping Incomplete Multipart Uploads Using a Bucket Lifecycle Policy](https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config)
     * in the *Amazon S3 User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * AbortIncompleteMultipartUploadProperty abortIncompleteMultipartUploadProperty =
     * AbortIncompleteMultipartUploadProperty.builder()
     * .daysAfterInitiation(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-abortincompletemultipartupload.html)
     */
    public inline fun cfnBucketAbortIncompleteMultipartUploadProperty(
        block: CfnBucketAbortIncompleteMultipartUploadPropertyDsl.() -> Unit = {}
    ): CfnBucket.AbortIncompleteMultipartUploadProperty {
        val builder = CfnBucketAbortIncompleteMultipartUploadPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configures the transfer acceleration state for an Amazon S3 bucket.
     *
     * For more information, see
     * [Amazon S3 Transfer Acceleration](https://docs.aws.amazon.com/AmazonS3/latest/dev/transfer-acceleration.html)
     * in the *Amazon S3 User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * AccelerateConfigurationProperty accelerateConfigurationProperty =
     * AccelerateConfigurationProperty.builder()
     * .accelerationStatus("accelerationStatus")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-accelerateconfiguration.html)
     */
    public inline fun cfnBucketAccelerateConfigurationProperty(
        block: CfnBucketAccelerateConfigurationPropertyDsl.() -> Unit = {}
    ): CfnBucket.AccelerateConfigurationProperty {
        val builder = CfnBucketAccelerateConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specify this only in a cross-account scenario (where source and destination bucket owners are
     * not the same), and you want to change replica ownership to the AWS account that owns the
     * destination bucket.
     *
     * If this is not specified in the replication configuration, the replicas are owned by same AWS
     * account that owns the source object.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * AccessControlTranslationProperty accessControlTranslationProperty =
     * AccessControlTranslationProperty.builder()
     * .owner("owner")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-accesscontroltranslation.html)
     */
    public inline fun cfnBucketAccessControlTranslationProperty(
        block: CfnBucketAccessControlTranslationPropertyDsl.() -> Unit = {}
    ): CfnBucket.AccessControlTranslationProperty {
        val builder = CfnBucketAccessControlTranslationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the configuration and any analyses for the analytics filter of an Amazon S3 bucket.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * AnalyticsConfigurationProperty analyticsConfigurationProperty =
     * AnalyticsConfigurationProperty.builder()
     * .id("id")
     * .storageClassAnalysis(StorageClassAnalysisProperty.builder()
     * .dataExport(DataExportProperty.builder()
     * .destination(DestinationProperty.builder()
     * .bucketArn("bucketArn")
     * .format("format")
     * // the properties below are optional
     * .bucketAccountId("bucketAccountId")
     * .prefix("prefix")
     * .build())
     * .outputSchemaVersion("outputSchemaVersion")
     * .build())
     * .build())
     * // the properties below are optional
     * .prefix("prefix")
     * .tagFilters(List.of(TagFilterProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-analyticsconfiguration.html)
     */
    public inline fun cfnBucketAnalyticsConfigurationProperty(
        block: CfnBucketAnalyticsConfigurationPropertyDsl.() -> Unit = {}
    ): CfnBucket.AnalyticsConfigurationProperty {
        val builder = CfnBucketAnalyticsConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies default encryption for a bucket using server-side encryption with Amazon S3-managed
     * keys (SSE-S3), AWS KMS-managed keys (SSE-KMS), or dual-layer server-side encryption with
     * KMS-managed keys (DSSE-KMS).
     *
     * For information about the Amazon S3 default encryption feature, see
     * [Amazon S3 Default Encryption for S3 Buckets](https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html)
     * in the *Amazon S3 User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * BucketEncryptionProperty bucketEncryptionProperty = BucketEncryptionProperty.builder()
     * .serverSideEncryptionConfiguration(List.of(ServerSideEncryptionRuleProperty.builder()
     * .bucketKeyEnabled(false)
     * .serverSideEncryptionByDefault(ServerSideEncryptionByDefaultProperty.builder()
     * .sseAlgorithm("sseAlgorithm")
     * // the properties below are optional
     * .kmsMasterKeyId("kmsMasterKeyId")
     * .build())
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-bucketencryption.html)
     */
    public inline fun cfnBucketBucketEncryptionProperty(
        block: CfnBucketBucketEncryptionPropertyDsl.() -> Unit = {}
    ): CfnBucket.BucketEncryptionProperty {
        val builder = CfnBucketBucketEncryptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the cross-origin access configuration for objects in an Amazon S3 bucket.
     *
     * For more information, see
     * [Enabling Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html)
     * in the *Amazon S3 User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * CorsConfigurationProperty corsConfigurationProperty = CorsConfigurationProperty.builder()
     * .corsRules(List.of(CorsRuleProperty.builder()
     * .allowedMethods(List.of("allowedMethods"))
     * .allowedOrigins(List.of("allowedOrigins"))
     * // the properties below are optional
     * .allowedHeaders(List.of("allowedHeaders"))
     * .exposedHeaders(List.of("exposedHeaders"))
     * .id("id")
     * .maxAge(123)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-corsconfiguration.html)
     */
    public inline fun cfnBucketCorsConfigurationProperty(
        block: CfnBucketCorsConfigurationPropertyDsl.() -> Unit = {}
    ): CfnBucket.CorsConfigurationProperty {
        val builder = CfnBucketCorsConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a cross-origin access rule for an Amazon S3 bucket.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * CorsRuleProperty corsRuleProperty = CorsRuleProperty.builder()
     * .allowedMethods(List.of("allowedMethods"))
     * .allowedOrigins(List.of("allowedOrigins"))
     * // the properties below are optional
     * .allowedHeaders(List.of("allowedHeaders"))
     * .exposedHeaders(List.of("exposedHeaders"))
     * .id("id")
     * .maxAge(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-corsrule.html)
     */
    public inline fun cfnBucketCorsRuleProperty(
        block: CfnBucketCorsRulePropertyDsl.() -> Unit = {}
    ): CfnBucket.CorsRuleProperty {
        val builder = CfnBucketCorsRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies how data related to the storage class analysis for an Amazon S3 bucket should be
     * exported.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * DataExportProperty dataExportProperty = DataExportProperty.builder()
     * .destination(DestinationProperty.builder()
     * .bucketArn("bucketArn")
     * .format("format")
     * // the properties below are optional
     * .bucketAccountId("bucketAccountId")
     * .prefix("prefix")
     * .build())
     * .outputSchemaVersion("outputSchemaVersion")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-dataexport.html)
     */
    public inline fun cfnBucketDataExportProperty(
        block: CfnBucketDataExportPropertyDsl.() -> Unit = {}
    ): CfnBucket.DataExportProperty {
        val builder = CfnBucketDataExportPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The container element for specifying the default Object Lock retention settings for new
     * objects placed in the specified bucket.
     * * The `DefaultRetention` settings require both a mode and a period.
     * * The `DefaultRetention` period can be either `Days` or `Years` but you must select one. You
     *   cannot specify `Days` and `Years` at the same time.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * DefaultRetentionProperty defaultRetentionProperty = DefaultRetentionProperty.builder()
     * .days(123)
     * .mode("mode")
     * .years(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-defaultretention.html)
     */
    public inline fun cfnBucketDefaultRetentionProperty(
        block: CfnBucketDefaultRetentionPropertyDsl.() -> Unit = {}
    ): CfnBucket.DefaultRetentionProperty {
        val builder = CfnBucketDefaultRetentionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies whether Amazon S3 replicates delete markers.
     *
     * If you specify a `Filter` in your replication configuration, you must also include a
     * `DeleteMarkerReplication` element. If your `Filter` includes a `Tag` element, the
     * `DeleteMarkerReplication` `Status` must be set to Disabled, because Amazon S3 does not
     * support replicating delete markers for tag-based rules. For an example configuration, see
     * [Basic Rule Configuration](https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-config-min-rule-config)
     * .
     *
     * For more information about delete marker replication, see
     * [Basic Rule Configuration](https://docs.aws.amazon.com/AmazonS3/latest/dev/delete-marker-replication.html)
     * .
     *
     * If you are using an earlier version of the replication configuration, Amazon S3 handles
     * replication of delete markers differently. For more information, see
     * [Backward Compatibility](https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-backward-compat-considerations)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * DeleteMarkerReplicationProperty deleteMarkerReplicationProperty =
     * DeleteMarkerReplicationProperty.builder()
     * .status("status")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-deletemarkerreplication.html)
     */
    public inline fun cfnBucketDeleteMarkerReplicationProperty(
        block: CfnBucketDeleteMarkerReplicationPropertyDsl.() -> Unit = {}
    ): CfnBucket.DeleteMarkerReplicationProperty {
        val builder = CfnBucketDeleteMarkerReplicationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies information about where to publish analysis or configuration results for an Amazon
     * S3 bucket.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * DestinationProperty destinationProperty = DestinationProperty.builder()
     * .bucketArn("bucketArn")
     * .format("format")
     * // the properties below are optional
     * .bucketAccountId("bucketAccountId")
     * .prefix("prefix")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html)
     */
    public inline fun cfnBucketDestinationProperty(
        block: CfnBucketDestinationPropertyDsl.() -> Unit = {}
    ): CfnBucket.DestinationProperty {
        val builder = CfnBucketDestinationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies encryption-related information for an Amazon S3 bucket that is a destination for
     * replicated objects.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * EncryptionConfigurationProperty encryptionConfigurationProperty =
     * EncryptionConfigurationProperty.builder()
     * .replicaKmsKeyId("replicaKmsKeyId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-encryptionconfiguration.html)
     */
    public inline fun cfnBucketEncryptionConfigurationProperty(
        block: CfnBucketEncryptionConfigurationPropertyDsl.() -> Unit = {}
    ): CfnBucket.EncryptionConfigurationProperty {
        val builder = CfnBucketEncryptionConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Amazon S3 can send events to Amazon EventBridge whenever certain events happen in your
     * bucket, see
     * [Using EventBridge](https://docs.aws.amazon.com/AmazonS3/latest/userguide/EventBridge.html)
     * in the *Amazon S3 User Guide* .
     *
     * Unlike other destinations, delivery of events to EventBridge can be either enabled or
     * disabled for a bucket. If enabled, all events will be sent to EventBridge and you can use
     * EventBridge rules to route events to additional targets. For more information, see
     * [What Is Amazon EventBridge](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-what-is.html)
     * in the *Amazon EventBridge User Guide*
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * EventBridgeConfigurationProperty eventBridgeConfigurationProperty =
     * EventBridgeConfigurationProperty.builder()
     * .eventBridgeEnabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-eventbridgeconfiguration.html)
     */
    public inline fun cfnBucketEventBridgeConfigurationProperty(
        block: CfnBucketEventBridgeConfigurationPropertyDsl.() -> Unit = {}
    ): CfnBucket.EventBridgeConfigurationProperty {
        val builder = CfnBucketEventBridgeConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the Amazon S3 object key name to filter on.
     *
     * An object key name is the name assigned to an object in your Amazon S3 bucket. You specify
     * whether to filter on the suffix or prefix of the object key name. A prefix is a specific
     * string of characters at the beginning of an object key name, which you can use to organize
     * objects. For example, you can start the key names of related objects with a prefix, such as
     * `2023-` or `engineering/` . Then, you can use `FilterRule` to find objects in a bucket with
     * key names that have the same prefix. A suffix is similar to a prefix, but it is at the end of
     * the object key name instead of at the beginning.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * FilterRuleProperty filterRuleProperty = FilterRuleProperty.builder()
     * .name("name")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-filterrule.html)
     */
    public inline fun cfnBucketFilterRuleProperty(
        block: CfnBucketFilterRulePropertyDsl.() -> Unit = {}
    ): CfnBucket.FilterRuleProperty {
        val builder = CfnBucketFilterRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the S3 Intelligent-Tiering configuration for an Amazon S3 bucket.
     *
     * For information about the S3 Intelligent-Tiering storage class, see
     * [Storage class for automatically optimizing frequently and infrequently accessed objects](https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html#sc-dynamic-data-access)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * IntelligentTieringConfigurationProperty intelligentTieringConfigurationProperty =
     * IntelligentTieringConfigurationProperty.builder()
     * .id("id")
     * .status("status")
     * .tierings(List.of(TieringProperty.builder()
     * .accessTier("accessTier")
     * .days(123)
     * .build()))
     * // the properties below are optional
     * .prefix("prefix")
     * .tagFilters(List.of(TagFilterProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-intelligenttieringconfiguration.html)
     */
    public inline fun cfnBucketIntelligentTieringConfigurationProperty(
        block: CfnBucketIntelligentTieringConfigurationPropertyDsl.() -> Unit = {}
    ): CfnBucket.IntelligentTieringConfigurationProperty {
        val builder = CfnBucketIntelligentTieringConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the inventory configuration for an Amazon S3 bucket.
     *
     * For more information, see
     * [GET Bucket inventory](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETInventoryConfig.html)
     * in the *Amazon S3 API Reference* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * InventoryConfigurationProperty inventoryConfigurationProperty =
     * InventoryConfigurationProperty.builder()
     * .destination(DestinationProperty.builder()
     * .bucketArn("bucketArn")
     * .format("format")
     * // the properties below are optional
     * .bucketAccountId("bucketAccountId")
     * .prefix("prefix")
     * .build())
     * .enabled(false)
     * .id("id")
     * .includedObjectVersions("includedObjectVersions")
     * .scheduleFrequency("scheduleFrequency")
     * // the properties below are optional
     * .optionalFields(List.of("optionalFields"))
     * .prefix("prefix")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html)
     */
    public inline fun cfnBucketInventoryConfigurationProperty(
        block: CfnBucketInventoryConfigurationPropertyDsl.() -> Unit = {}
    ): CfnBucket.InventoryConfigurationProperty {
        val builder = CfnBucketInventoryConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the AWS Lambda functions to invoke and the events for which to invoke them.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * LambdaConfigurationProperty lambdaConfigurationProperty = LambdaConfigurationProperty.builder()
     * .event("event")
     * .function("function")
     * // the properties below are optional
     * .filter(NotificationFilterProperty.builder()
     * .s3Key(S3KeyFilterProperty.builder()
     * .rules(List.of(FilterRuleProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lambdaconfiguration.html)
     */
    public inline fun cfnBucketLambdaConfigurationProperty(
        block: CfnBucketLambdaConfigurationPropertyDsl.() -> Unit = {}
    ): CfnBucket.LambdaConfigurationProperty {
        val builder = CfnBucketLambdaConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the lifecycle configuration for objects in an Amazon S3 bucket.
     *
     * For more information, see
     * [Object Lifecycle Management](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html)
     * in the *Amazon S3 User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * LifecycleConfigurationProperty lifecycleConfigurationProperty =
     * LifecycleConfigurationProperty.builder()
     * .rules(List.of(RuleProperty.builder()
     * .status("status")
     * // the properties below are optional
     * .abortIncompleteMultipartUpload(AbortIncompleteMultipartUploadProperty.builder()
     * .daysAfterInitiation(123)
     * .build())
     * .expirationDate(new Date())
     * .expirationInDays(123)
     * .expiredObjectDeleteMarker(false)
     * .id("id")
     * .noncurrentVersionExpiration(NoncurrentVersionExpirationProperty.builder()
     * .noncurrentDays(123)
     * // the properties below are optional
     * .newerNoncurrentVersions(123)
     * .build())
     * .noncurrentVersionExpirationInDays(123)
     * .noncurrentVersionTransition(NoncurrentVersionTransitionProperty.builder()
     * .storageClass("storageClass")
     * .transitionInDays(123)
     * // the properties below are optional
     * .newerNoncurrentVersions(123)
     * .build())
     * .noncurrentVersionTransitions(List.of(NoncurrentVersionTransitionProperty.builder()
     * .storageClass("storageClass")
     * .transitionInDays(123)
     * // the properties below are optional
     * .newerNoncurrentVersions(123)
     * .build()))
     * .objectSizeGreaterThan(123)
     * .objectSizeLessThan(123)
     * .prefix("prefix")
     * .tagFilters(List.of(TagFilterProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .transition(TransitionProperty.builder()
     * .storageClass("storageClass")
     * // the properties below are optional
     * .transitionDate(new Date())
     * .transitionInDays(123)
     * .build())
     * .transitions(List.of(TransitionProperty.builder()
     * .storageClass("storageClass")
     * // the properties below are optional
     * .transitionDate(new Date())
     * .transitionInDays(123)
     * .build()))
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfiguration.html)
     */
    public inline fun cfnBucketLifecycleConfigurationProperty(
        block: CfnBucketLifecycleConfigurationPropertyDsl.() -> Unit = {}
    ): CfnBucket.LifecycleConfigurationProperty {
        val builder = CfnBucketLifecycleConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes where logs are stored and the prefix that Amazon S3 assigns to all log object keys
     * for a bucket.
     *
     * For examples and more information, see
     * [PUT Bucket logging](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTlogging.html)
     * in the *Amazon S3 API Reference* .
     *
     * To successfully complete the `AWS::S3::Bucket LoggingConfiguration` request, you must have
     * `s3:PutObject` and `s3:PutObjectAcl` in your IAM permissions.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * Object simplePrefix;
     * LoggingConfigurationProperty loggingConfigurationProperty =
     * LoggingConfigurationProperty.builder()
     * .destinationBucketName("destinationBucketName")
     * .logFilePrefix("logFilePrefix")
     * .targetObjectKeyFormat(TargetObjectKeyFormatProperty.builder()
     * .partitionedPrefix(PartitionedPrefixProperty.builder()
     * .partitionDateSource("partitionDateSource")
     * .build())
     * .simplePrefix(simplePrefix)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-loggingconfiguration.html)
     */
    public inline fun cfnBucketLoggingConfigurationProperty(
        block: CfnBucketLoggingConfigurationPropertyDsl.() -> Unit = {}
    ): CfnBucket.LoggingConfigurationProperty {
        val builder = CfnBucketLoggingConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a metrics configuration for the CloudWatch request metrics (specified by the
     * metrics configuration ID) from an Amazon S3 bucket.
     *
     * If you're updating an existing metrics configuration, note that this is a full replacement of
     * the existing metrics configuration. If you don't include the elements you want to keep, they
     * are erased. For examples, see
     * [AWS::S3::Bucket](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#aws-properties-s3-bucket--examples)
     * . For more information, see
     * [PUT Bucket metrics](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTMetricConfiguration.html)
     * in the *Amazon S3 API Reference* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * MetricsConfigurationProperty metricsConfigurationProperty =
     * MetricsConfigurationProperty.builder()
     * .id("id")
     * // the properties below are optional
     * .accessPointArn("accessPointArn")
     * .prefix("prefix")
     * .tagFilters(List.of(TagFilterProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metricsconfiguration.html)
     */
    public inline fun cfnBucketMetricsConfigurationProperty(
        block: CfnBucketMetricsConfigurationPropertyDsl.() -> Unit = {}
    ): CfnBucket.MetricsConfigurationProperty {
        val builder = CfnBucketMetricsConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A container specifying replication metrics-related settings enabling replication metrics and
     * events.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * MetricsProperty metricsProperty = MetricsProperty.builder()
     * .status("status")
     * // the properties below are optional
     * .eventThreshold(ReplicationTimeValueProperty.builder()
     * .minutes(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metrics.html)
     */
    public inline fun cfnBucketMetricsProperty(
        block: CfnBucketMetricsPropertyDsl.() -> Unit = {}
    ): CfnBucket.MetricsProperty {
        val builder = CfnBucketMetricsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies when noncurrent object versions expire.
     *
     * Upon expiration, Amazon S3 permanently deletes the noncurrent object versions. You set this
     * lifecycle configuration action on a bucket that has versioning enabled (or suspended) to
     * request that Amazon S3 delete noncurrent object versions at a specific period in the object's
     * lifetime. For more information about setting a lifecycle rule configuration, see
     * [AWS::S3::Bucket Rule](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * NoncurrentVersionExpirationProperty noncurrentVersionExpirationProperty =
     * NoncurrentVersionExpirationProperty.builder()
     * .noncurrentDays(123)
     * // the properties below are optional
     * .newerNoncurrentVersions(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-noncurrentversionexpiration.html)
     */
    public inline fun cfnBucketNoncurrentVersionExpirationProperty(
        block: CfnBucketNoncurrentVersionExpirationPropertyDsl.() -> Unit = {}
    ): CfnBucket.NoncurrentVersionExpirationProperty {
        val builder = CfnBucketNoncurrentVersionExpirationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Container for the transition rule that describes when noncurrent objects transition to the
     * `STANDARD_IA` , `ONEZONE_IA` , `INTELLIGENT_TIERING` , `GLACIER_IR` , `GLACIER` , or
     * `DEEP_ARCHIVE` storage class.
     *
     * If your bucket is versioning-enabled (or versioning is suspended), you can set this action to
     * request that Amazon S3 transition noncurrent object versions to the `STANDARD_IA` ,
     * `ONEZONE_IA` , `INTELLIGENT_TIERING` , `GLACIER_IR` , `GLACIER` , or `DEEP_ARCHIVE` storage
     * class at a specific period in the object's lifetime. If you specify this property, don't
     * specify the `NoncurrentVersionTransitions` property.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * NoncurrentVersionTransitionProperty noncurrentVersionTransitionProperty =
     * NoncurrentVersionTransitionProperty.builder()
     * .storageClass("storageClass")
     * .transitionInDays(123)
     * // the properties below are optional
     * .newerNoncurrentVersions(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-noncurrentversiontransition.html)
     */
    public inline fun cfnBucketNoncurrentVersionTransitionProperty(
        block: CfnBucketNoncurrentVersionTransitionPropertyDsl.() -> Unit = {}
    ): CfnBucket.NoncurrentVersionTransitionProperty {
        val builder = CfnBucketNoncurrentVersionTransitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the notification configuration for an Amazon S3 bucket.
     *
     * If you create the target resource and related permissions in the same template, you might
     * have a circular dependency.
     *
     * For example, you might use the `AWS::Lambda::Permission` resource to grant the bucket
     * permission to invoke an AWS Lambda function. However, AWS CloudFormation can't create the
     * bucket until the bucket has permission to invoke the function ( AWS CloudFormation checks
     * whether the bucket can invoke the function). If you're using Refs to pass the bucket name,
     * this leads to a circular dependency.
     *
     * To avoid this dependency, you can create all resources without specifying the notification
     * configuration. Then, update the stack with a notification configuration.
     *
     * For more information on permissions, see
     * [AWS::Lambda::Permission](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html)
     * and
     * [Granting Permissions to Publish Event Notification Messages to a Destination](https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html#grant-destinations-permissions-to-s3)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * NotificationConfigurationProperty notificationConfigurationProperty =
     * NotificationConfigurationProperty.builder()
     * .eventBridgeConfiguration(EventBridgeConfigurationProperty.builder()
     * .eventBridgeEnabled(false)
     * .build())
     * .lambdaConfigurations(List.of(LambdaConfigurationProperty.builder()
     * .event("event")
     * .function("function")
     * // the properties below are optional
     * .filter(NotificationFilterProperty.builder()
     * .s3Key(S3KeyFilterProperty.builder()
     * .rules(List.of(FilterRuleProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build())
     * .build())
     * .build()))
     * .queueConfigurations(List.of(QueueConfigurationProperty.builder()
     * .event("event")
     * .queue("queue")
     * // the properties below are optional
     * .filter(NotificationFilterProperty.builder()
     * .s3Key(S3KeyFilterProperty.builder()
     * .rules(List.of(FilterRuleProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build())
     * .build())
     * .build()))
     * .topicConfigurations(List.of(TopicConfigurationProperty.builder()
     * .event("event")
     * .topic("topic")
     * // the properties below are optional
     * .filter(NotificationFilterProperty.builder()
     * .s3Key(S3KeyFilterProperty.builder()
     * .rules(List.of(FilterRuleProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build())
     * .build())
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration.html)
     */
    public inline fun cfnBucketNotificationConfigurationProperty(
        block: CfnBucketNotificationConfigurationPropertyDsl.() -> Unit = {}
    ): CfnBucket.NotificationConfigurationProperty {
        val builder = CfnBucketNotificationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies object key name filtering rules.
     *
     * For information about key name filtering, see
     * [Configuring event notifications using object key name filtering](https://docs.aws.amazon.com/AmazonS3/latest/userguide/notification-how-to-filtering.html)
     * in the *Amazon S3 User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * NotificationFilterProperty notificationFilterProperty = NotificationFilterProperty.builder()
     * .s3Key(S3KeyFilterProperty.builder()
     * .rules(List.of(FilterRuleProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationfilter.html)
     */
    public inline fun cfnBucketNotificationFilterProperty(
        block: CfnBucketNotificationFilterPropertyDsl.() -> Unit = {}
    ): CfnBucket.NotificationFilterProperty {
        val builder = CfnBucketNotificationFilterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Places an Object Lock configuration on the specified bucket.
     *
     * The rule specified in the Object Lock configuration will be applied by default to every new
     * object placed in the specified bucket. For more information, see
     * [Locking Objects](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html) .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * ObjectLockConfigurationProperty objectLockConfigurationProperty =
     * ObjectLockConfigurationProperty.builder()
     * .objectLockEnabled("objectLockEnabled")
     * .rule(ObjectLockRuleProperty.builder()
     * .defaultRetention(DefaultRetentionProperty.builder()
     * .days(123)
     * .mode("mode")
     * .years(123)
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-objectlockconfiguration.html)
     */
    public inline fun cfnBucketObjectLockConfigurationProperty(
        block: CfnBucketObjectLockConfigurationPropertyDsl.() -> Unit = {}
    ): CfnBucket.ObjectLockConfigurationProperty {
        val builder = CfnBucketObjectLockConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the Object Lock rule for the specified object.
     *
     * Enable the this rule when you apply `ObjectLockConfiguration` to a bucket.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * ObjectLockRuleProperty objectLockRuleProperty = ObjectLockRuleProperty.builder()
     * .defaultRetention(DefaultRetentionProperty.builder()
     * .days(123)
     * .mode("mode")
     * .years(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-objectlockrule.html)
     */
    public inline fun cfnBucketObjectLockRuleProperty(
        block: CfnBucketObjectLockRulePropertyDsl.() -> Unit = {}
    ): CfnBucket.ObjectLockRuleProperty {
        val builder = CfnBucketObjectLockRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the container element for Object Ownership rules.
     *
     * S3 Object Ownership is an Amazon S3 bucket-level setting that you can use to disable access
     * control lists (ACLs) and take ownership of every object in your bucket, simplifying access
     * management for data stored in Amazon S3. For more information, see
     * [Controlling ownership of objects and disabling ACLs](https://docs.aws.amazon.com/AmazonS3/latest/userguide/about-object-ownership.html)
     * in the *Amazon S3 User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * OwnershipControlsProperty ownershipControlsProperty = OwnershipControlsProperty.builder()
     * .rules(List.of(OwnershipControlsRuleProperty.builder()
     * .objectOwnership("objectOwnership")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-ownershipcontrols.html)
     */
    public inline fun cfnBucketOwnershipControlsProperty(
        block: CfnBucketOwnershipControlsPropertyDsl.() -> Unit = {}
    ): CfnBucket.OwnershipControlsProperty {
        val builder = CfnBucketOwnershipControlsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an Object Ownership rule.
     *
     * S3 Object Ownership is an Amazon S3 bucket-level setting that you can use to disable access
     * control lists (ACLs) and take ownership of every object in your bucket, simplifying access
     * management for data stored in Amazon S3. For more information, see
     * [Controlling ownership of objects and disabling ACLs](https://docs.aws.amazon.com/AmazonS3/latest/userguide/about-object-ownership.html)
     * in the *Amazon S3 User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * OwnershipControlsRuleProperty ownershipControlsRuleProperty =
     * OwnershipControlsRuleProperty.builder()
     * .objectOwnership("objectOwnership")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-ownershipcontrolsrule.html)
     */
    public inline fun cfnBucketOwnershipControlsRuleProperty(
        block: CfnBucketOwnershipControlsRulePropertyDsl.() -> Unit = {}
    ): CfnBucket.OwnershipControlsRuleProperty {
        val builder = CfnBucketOwnershipControlsRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Amazon S3 keys for log objects are partitioned in the following format:.
     *
     * `[DestinationPrefix][SourceAccountId]/[SourceRegion]/[SourceBucket]/[YYYY]/[MM]/[DD]/[YYYY]-[MM]-[DD]-[hh]-[mm]-[ss]-[UniqueString]`
     *
     * PartitionedPrefix defaults to EventTime delivery when server access logs are delivered.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * PartitionedPrefixProperty partitionedPrefixProperty = PartitionedPrefixProperty.builder()
     * .partitionDateSource("partitionDateSource")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-partitionedprefix.html)
     */
    public inline fun cfnBucketPartitionedPrefixProperty(
        block: CfnBucketPartitionedPrefixPropertyDsl.() -> Unit = {}
    ): CfnBucket.PartitionedPrefixProperty {
        val builder = CfnBucketPartitionedPrefixPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Applies an Amazon S3 bucket policy to an Amazon S3 bucket.
     *
     * If you are using an identity other than the root user of the AWS account that owns the
     * bucket, the calling identity must have the `PutBucketPolicy` permissions on the specified
     * bucket and belong to the bucket owner's account in order to use this operation.
     *
     * If you don't have `PutBucketPolicy` permissions, Amazon S3 returns a `403 Access Denied`
     * error. If you have the correct permissions, but you're not using an identity that belongs to
     * the bucket owner's account, Amazon S3 returns a `405 Method Not Allowed` error.
     *
     * As a security precaution, the root user of the AWS account that owns a bucket can always use
     * this operation, even if the policy explicitly denies the root user the ability to perform
     * this action.
     *
     * For more information, see
     * [Bucket policy examples](https://docs.aws.amazon.com/AmazonS3/latest/userguide/example-bucket-policies.html)
     * .
     *
     * The following operations are related to `PutBucketPolicy` :
     * * [CreateBucket](https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateBucket.html)
     * * [DeleteBucket](https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucket.html)
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * Object policyDocument;
     * CfnBucketPolicy cfnBucketPolicy = CfnBucketPolicy.Builder.create(this, "MyCfnBucketPolicy")
     * .bucket("bucket")
     * .policyDocument(policyDocument)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucketpolicy.html)
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
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * Object policyDocument;
     * CfnBucketPolicyProps cfnBucketPolicyProps = CfnBucketPolicyProps.builder()
     * .bucket("bucket")
     * .policyDocument(policyDocument)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucketpolicy.html)
     */
    public inline fun cfnBucketPolicyProps(
        block: CfnBucketPolicyPropsDsl.() -> Unit = {}
    ): CfnBucketPolicyProps {
        val builder = CfnBucketPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnBucket`.
     *
     * Example:
     * ```
     * CfnBucket rawBucket = CfnBucket.Builder.create(this, "Bucket").build();
     * // -or-
     * CfnBucket rawBucketAlt = (CfnBucket)myBucket.getNode().getDefaultChild();
     * // then
     * rawBucket.getCfnOptions().getCondition() = CfnCondition.Builder.create(this,
     * "EnableBucket").build();
     * rawBucket.getCfnOptions().getMetadata() = Map.of(
     * "metadataKey", "MetadataValue");
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html)
     */
    public inline fun cfnBucketProps(block: CfnBucketPropsDsl.() -> Unit = {}): CfnBucketProps {
        val builder = CfnBucketPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The PublicAccessBlock configuration that you want to apply to this Amazon S3 bucket.
     *
     * You can enable the configuration options in any combination. For more information about when
     * Amazon S3 considers a bucket or object public, see
     * [The Meaning of "Public"](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status)
     * in the *Amazon S3 User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * PublicAccessBlockConfigurationProperty publicAccessBlockConfigurationProperty =
     * PublicAccessBlockConfigurationProperty.builder()
     * .blockPublicAcls(false)
     * .blockPublicPolicy(false)
     * .ignorePublicAcls(false)
     * .restrictPublicBuckets(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-publicaccessblockconfiguration.html)
     */
    public inline fun cfnBucketPublicAccessBlockConfigurationProperty(
        block: CfnBucketPublicAccessBlockConfigurationPropertyDsl.() -> Unit = {}
    ): CfnBucket.PublicAccessBlockConfigurationProperty {
        val builder = CfnBucketPublicAccessBlockConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the configuration for publishing messages to an Amazon Simple Queue Service (Amazon
     * SQS) queue when Amazon S3 detects specified events.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * QueueConfigurationProperty queueConfigurationProperty = QueueConfigurationProperty.builder()
     * .event("event")
     * .queue("queue")
     * // the properties below are optional
     * .filter(NotificationFilterProperty.builder()
     * .s3Key(S3KeyFilterProperty.builder()
     * .rules(List.of(FilterRuleProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-queueconfiguration.html)
     */
    public inline fun cfnBucketQueueConfigurationProperty(
        block: CfnBucketQueueConfigurationPropertyDsl.() -> Unit = {}
    ): CfnBucket.QueueConfigurationProperty {
        val builder = CfnBucketQueueConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the redirect behavior of all requests to a website endpoint of an Amazon S3 bucket.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * RedirectAllRequestsToProperty redirectAllRequestsToProperty =
     * RedirectAllRequestsToProperty.builder()
     * .hostName("hostName")
     * // the properties below are optional
     * .protocol("protocol")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-redirectallrequeststo.html)
     */
    public inline fun cfnBucketRedirectAllRequestsToProperty(
        block: CfnBucketRedirectAllRequestsToPropertyDsl.() -> Unit = {}
    ): CfnBucket.RedirectAllRequestsToProperty {
        val builder = CfnBucketRedirectAllRequestsToPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies how requests are redirected.
     *
     * In the event of an error, you can specify a different error code to return.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * RedirectRuleProperty redirectRuleProperty = RedirectRuleProperty.builder()
     * .hostName("hostName")
     * .httpRedirectCode("httpRedirectCode")
     * .protocol("protocol")
     * .replaceKeyPrefixWith("replaceKeyPrefixWith")
     * .replaceKeyWith("replaceKeyWith")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-redirectrule.html)
     */
    public inline fun cfnBucketRedirectRuleProperty(
        block: CfnBucketRedirectRulePropertyDsl.() -> Unit = {}
    ): CfnBucket.RedirectRuleProperty {
        val builder = CfnBucketRedirectRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A filter that you can specify for selection for modifications on replicas.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * ReplicaModificationsProperty replicaModificationsProperty =
     * ReplicaModificationsProperty.builder()
     * .status("status")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicamodifications.html)
     */
    public inline fun cfnBucketReplicaModificationsProperty(
        block: CfnBucketReplicaModificationsPropertyDsl.() -> Unit = {}
    ): CfnBucket.ReplicaModificationsProperty {
        val builder = CfnBucketReplicaModificationsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A container for replication rules.
     *
     * You can add up to 1,000 rules. The maximum size of a replication configuration is 2 MB. The
     * latest version of the replication configuration XML is V2. For more information about XML V2
     * replication configurations, see
     * [Replication configuration](https://docs.aws.amazon.com/AmazonS3/latest/userguide/replication-add-config.html)
     * in the *Amazon S3 User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * ReplicationConfigurationProperty replicationConfigurationProperty =
     * ReplicationConfigurationProperty.builder()
     * .role("role")
     * .rules(List.of(ReplicationRuleProperty.builder()
     * .destination(ReplicationDestinationProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .accessControlTranslation(AccessControlTranslationProperty.builder()
     * .owner("owner")
     * .build())
     * .account("account")
     * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
     * .replicaKmsKeyId("replicaKmsKeyId")
     * .build())
     * .metrics(MetricsProperty.builder()
     * .status("status")
     * // the properties below are optional
     * .eventThreshold(ReplicationTimeValueProperty.builder()
     * .minutes(123)
     * .build())
     * .build())
     * .replicationTime(ReplicationTimeProperty.builder()
     * .status("status")
     * .time(ReplicationTimeValueProperty.builder()
     * .minutes(123)
     * .build())
     * .build())
     * .storageClass("storageClass")
     * .build())
     * .status("status")
     * // the properties below are optional
     * .deleteMarkerReplication(DeleteMarkerReplicationProperty.builder()
     * .status("status")
     * .build())
     * .filter(ReplicationRuleFilterProperty.builder()
     * .and(ReplicationRuleAndOperatorProperty.builder()
     * .prefix("prefix")
     * .tagFilters(List.of(TagFilterProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build())
     * .prefix("prefix")
     * .tagFilter(TagFilterProperty.builder()
     * .key("key")
     * .value("value")
     * .build())
     * .build())
     * .id("id")
     * .prefix("prefix")
     * .priority(123)
     * .sourceSelectionCriteria(SourceSelectionCriteriaProperty.builder()
     * .replicaModifications(ReplicaModificationsProperty.builder()
     * .status("status")
     * .build())
     * .sseKmsEncryptedObjects(SseKmsEncryptedObjectsProperty.builder()
     * .status("status")
     * .build())
     * .build())
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration.html)
     */
    public inline fun cfnBucketReplicationConfigurationProperty(
        block: CfnBucketReplicationConfigurationPropertyDsl.() -> Unit = {}
    ): CfnBucket.ReplicationConfigurationProperty {
        val builder = CfnBucketReplicationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A container for information about the replication destination and its configurations
     * including enabling the S3 Replication Time Control (S3 RTC).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * ReplicationDestinationProperty replicationDestinationProperty =
     * ReplicationDestinationProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .accessControlTranslation(AccessControlTranslationProperty.builder()
     * .owner("owner")
     * .build())
     * .account("account")
     * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
     * .replicaKmsKeyId("replicaKmsKeyId")
     * .build())
     * .metrics(MetricsProperty.builder()
     * .status("status")
     * // the properties below are optional
     * .eventThreshold(ReplicationTimeValueProperty.builder()
     * .minutes(123)
     * .build())
     * .build())
     * .replicationTime(ReplicationTimeProperty.builder()
     * .status("status")
     * .time(ReplicationTimeValueProperty.builder()
     * .minutes(123)
     * .build())
     * .build())
     * .storageClass("storageClass")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationdestination.html)
     */
    public inline fun cfnBucketReplicationDestinationProperty(
        block: CfnBucketReplicationDestinationPropertyDsl.() -> Unit = {}
    ): CfnBucket.ReplicationDestinationProperty {
        val builder = CfnBucketReplicationDestinationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A container for specifying rule filters.
     *
     * The filters determine the subset of objects to which the rule applies. This element is
     * required only if you specify more than one filter.
     *
     * For example:
     * * If you specify both a `Prefix` and a `TagFilter` , wrap these filters in an `And` tag.
     * * If you specify a filter based on multiple tags, wrap the `TagFilter` elements in an `And`
     *   tag
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * ReplicationRuleAndOperatorProperty replicationRuleAndOperatorProperty =
     * ReplicationRuleAndOperatorProperty.builder()
     * .prefix("prefix")
     * .tagFilters(List.of(TagFilterProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationruleandoperator.html)
     */
    public inline fun cfnBucketReplicationRuleAndOperatorProperty(
        block: CfnBucketReplicationRuleAndOperatorPropertyDsl.() -> Unit = {}
    ): CfnBucket.ReplicationRuleAndOperatorProperty {
        val builder = CfnBucketReplicationRuleAndOperatorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A filter that identifies the subset of objects to which the replication rule applies.
     *
     * A `Filter` must specify exactly one `Prefix` , `TagFilter` , or an `And` child element.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * ReplicationRuleFilterProperty replicationRuleFilterProperty =
     * ReplicationRuleFilterProperty.builder()
     * .and(ReplicationRuleAndOperatorProperty.builder()
     * .prefix("prefix")
     * .tagFilters(List.of(TagFilterProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build())
     * .prefix("prefix")
     * .tagFilter(TagFilterProperty.builder()
     * .key("key")
     * .value("value")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationrulefilter.html)
     */
    public inline fun cfnBucketReplicationRuleFilterProperty(
        block: CfnBucketReplicationRuleFilterPropertyDsl.() -> Unit = {}
    ): CfnBucket.ReplicationRuleFilterProperty {
        val builder = CfnBucketReplicationRuleFilterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies which Amazon S3 objects to replicate and where to store the replicas.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * ReplicationRuleProperty replicationRuleProperty = ReplicationRuleProperty.builder()
     * .destination(ReplicationDestinationProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .accessControlTranslation(AccessControlTranslationProperty.builder()
     * .owner("owner")
     * .build())
     * .account("account")
     * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
     * .replicaKmsKeyId("replicaKmsKeyId")
     * .build())
     * .metrics(MetricsProperty.builder()
     * .status("status")
     * // the properties below are optional
     * .eventThreshold(ReplicationTimeValueProperty.builder()
     * .minutes(123)
     * .build())
     * .build())
     * .replicationTime(ReplicationTimeProperty.builder()
     * .status("status")
     * .time(ReplicationTimeValueProperty.builder()
     * .minutes(123)
     * .build())
     * .build())
     * .storageClass("storageClass")
     * .build())
     * .status("status")
     * // the properties below are optional
     * .deleteMarkerReplication(DeleteMarkerReplicationProperty.builder()
     * .status("status")
     * .build())
     * .filter(ReplicationRuleFilterProperty.builder()
     * .and(ReplicationRuleAndOperatorProperty.builder()
     * .prefix("prefix")
     * .tagFilters(List.of(TagFilterProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build())
     * .prefix("prefix")
     * .tagFilter(TagFilterProperty.builder()
     * .key("key")
     * .value("value")
     * .build())
     * .build())
     * .id("id")
     * .prefix("prefix")
     * .priority(123)
     * .sourceSelectionCriteria(SourceSelectionCriteriaProperty.builder()
     * .replicaModifications(ReplicaModificationsProperty.builder()
     * .status("status")
     * .build())
     * .sseKmsEncryptedObjects(SseKmsEncryptedObjectsProperty.builder()
     * .status("status")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationrule.html)
     */
    public inline fun cfnBucketReplicationRuleProperty(
        block: CfnBucketReplicationRulePropertyDsl.() -> Unit = {}
    ): CfnBucket.ReplicationRuleProperty {
        val builder = CfnBucketReplicationRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A container specifying S3 Replication Time Control (S3 RTC) related information, including
     * whether S3 RTC is enabled and the time when all objects and operations on objects must be
     * replicated.
     *
     * Must be specified together with a `Metrics` block.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * ReplicationTimeProperty replicationTimeProperty = ReplicationTimeProperty.builder()
     * .status("status")
     * .time(ReplicationTimeValueProperty.builder()
     * .minutes(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationtime.html)
     */
    public inline fun cfnBucketReplicationTimeProperty(
        block: CfnBucketReplicationTimePropertyDsl.() -> Unit = {}
    ): CfnBucket.ReplicationTimeProperty {
        val builder = CfnBucketReplicationTimePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A container specifying the time value for S3 Replication Time Control (S3 RTC) and
     * replication metrics `EventThreshold` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * ReplicationTimeValueProperty replicationTimeValueProperty =
     * ReplicationTimeValueProperty.builder()
     * .minutes(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationtimevalue.html)
     */
    public inline fun cfnBucketReplicationTimeValueProperty(
        block: CfnBucketReplicationTimeValuePropertyDsl.() -> Unit = {}
    ): CfnBucket.ReplicationTimeValueProperty {
        val builder = CfnBucketReplicationTimeValuePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A container for describing a condition that must be met for the specified redirect to apply.
     *
     * For example, 1. If request is for pages in the `/docs` folder, redirect to the `/documents`
     * folder. 2. If request results in HTTP error 4xx, redirect request to another host where you
     * might process the error.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * RoutingRuleConditionProperty routingRuleConditionProperty =
     * RoutingRuleConditionProperty.builder()
     * .httpErrorCodeReturnedEquals("httpErrorCodeReturnedEquals")
     * .keyPrefixEquals("keyPrefixEquals")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-routingrulecondition.html)
     */
    public inline fun cfnBucketRoutingRuleConditionProperty(
        block: CfnBucketRoutingRuleConditionPropertyDsl.() -> Unit = {}
    ): CfnBucket.RoutingRuleConditionProperty {
        val builder = CfnBucketRoutingRuleConditionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the redirect behavior and when a redirect is applied.
     *
     * For more information about routing rules, see
     * [Configuring advanced conditional redirects](https://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html#advanced-conditional-redirects)
     * in the *Amazon S3 User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * RoutingRuleProperty routingRuleProperty = RoutingRuleProperty.builder()
     * .redirectRule(RedirectRuleProperty.builder()
     * .hostName("hostName")
     * .httpRedirectCode("httpRedirectCode")
     * .protocol("protocol")
     * .replaceKeyPrefixWith("replaceKeyPrefixWith")
     * .replaceKeyWith("replaceKeyWith")
     * .build())
     * // the properties below are optional
     * .routingRuleCondition(RoutingRuleConditionProperty.builder()
     * .httpErrorCodeReturnedEquals("httpErrorCodeReturnedEquals")
     * .keyPrefixEquals("keyPrefixEquals")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-routingrule.html)
     */
    public inline fun cfnBucketRoutingRuleProperty(
        block: CfnBucketRoutingRulePropertyDsl.() -> Unit = {}
    ): CfnBucket.RoutingRuleProperty {
        val builder = CfnBucketRoutingRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies lifecycle rules for an Amazon S3 bucket.
     *
     * For more information, see
     * [Put Bucket Lifecycle Configuration](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTlifecycle.html)
     * in the *Amazon S3 API Reference* .
     *
     * You must specify at least one of the following properties: `AbortIncompleteMultipartUpload` ,
     * `ExpirationDate` , `ExpirationInDays` , `NoncurrentVersionExpirationInDays` ,
     * `NoncurrentVersionTransition` , `NoncurrentVersionTransitions` , `Transition` , or
     * `Transitions` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * RuleProperty ruleProperty = RuleProperty.builder()
     * .status("status")
     * // the properties below are optional
     * .abortIncompleteMultipartUpload(AbortIncompleteMultipartUploadProperty.builder()
     * .daysAfterInitiation(123)
     * .build())
     * .expirationDate(new Date())
     * .expirationInDays(123)
     * .expiredObjectDeleteMarker(false)
     * .id("id")
     * .noncurrentVersionExpiration(NoncurrentVersionExpirationProperty.builder()
     * .noncurrentDays(123)
     * // the properties below are optional
     * .newerNoncurrentVersions(123)
     * .build())
     * .noncurrentVersionExpirationInDays(123)
     * .noncurrentVersionTransition(NoncurrentVersionTransitionProperty.builder()
     * .storageClass("storageClass")
     * .transitionInDays(123)
     * // the properties below are optional
     * .newerNoncurrentVersions(123)
     * .build())
     * .noncurrentVersionTransitions(List.of(NoncurrentVersionTransitionProperty.builder()
     * .storageClass("storageClass")
     * .transitionInDays(123)
     * // the properties below are optional
     * .newerNoncurrentVersions(123)
     * .build()))
     * .objectSizeGreaterThan(123)
     * .objectSizeLessThan(123)
     * .prefix("prefix")
     * .tagFilters(List.of(TagFilterProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .transition(TransitionProperty.builder()
     * .storageClass("storageClass")
     * // the properties below are optional
     * .transitionDate(new Date())
     * .transitionInDays(123)
     * .build())
     * .transitions(List.of(TransitionProperty.builder()
     * .storageClass("storageClass")
     * // the properties below are optional
     * .transitionDate(new Date())
     * .transitionInDays(123)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-rule.html)
     */
    public inline fun cfnBucketRuleProperty(
        block: CfnBucketRulePropertyDsl.() -> Unit = {}
    ): CfnBucket.RuleProperty {
        val builder = CfnBucketRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A container for object key name prefix and suffix filtering rules.
     *
     * For more information about object key name filtering, see
     * [Configuring event notifications using object key name filtering](https://docs.aws.amazon.com/AmazonS3/latest/userguide/notification-how-to-filtering.html)
     * in the *Amazon S3 User Guide* .
     *
     * The same type of filter rule cannot be used more than once. For example, you cannot specify
     * two prefix rules.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * S3KeyFilterProperty s3KeyFilterProperty = S3KeyFilterProperty.builder()
     * .rules(List.of(FilterRuleProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-s3keyfilter.html)
     */
    public inline fun cfnBucketS3KeyFilterProperty(
        block: CfnBucketS3KeyFilterPropertyDsl.() -> Unit = {}
    ): CfnBucket.S3KeyFilterProperty {
        val builder = CfnBucketS3KeyFilterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the default server-side encryption to apply to new objects in the bucket.
     *
     * If a PUT Object request doesn't specify any server-side encryption, this default encryption
     * will be applied. If you don't specify a customer managed key at configuration, Amazon S3
     * automatically creates an AWS KMS key in your AWS account the first time that you add an
     * object encrypted with SSE-KMS to a bucket. By default, Amazon S3 uses this KMS key for
     * SSE-KMS. For more information, see
     * [PUT Bucket encryption](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTencryption.html)
     * in the *Amazon S3 API Reference* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * ServerSideEncryptionByDefaultProperty serverSideEncryptionByDefaultProperty =
     * ServerSideEncryptionByDefaultProperty.builder()
     * .sseAlgorithm("sseAlgorithm")
     * // the properties below are optional
     * .kmsMasterKeyId("kmsMasterKeyId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionbydefault.html)
     */
    public inline fun cfnBucketServerSideEncryptionByDefaultProperty(
        block: CfnBucketServerSideEncryptionByDefaultPropertyDsl.() -> Unit = {}
    ): CfnBucket.ServerSideEncryptionByDefaultProperty {
        val builder = CfnBucketServerSideEncryptionByDefaultPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the default server-side encryption configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * ServerSideEncryptionRuleProperty serverSideEncryptionRuleProperty =
     * ServerSideEncryptionRuleProperty.builder()
     * .bucketKeyEnabled(false)
     * .serverSideEncryptionByDefault(ServerSideEncryptionByDefaultProperty.builder()
     * .sseAlgorithm("sseAlgorithm")
     * // the properties below are optional
     * .kmsMasterKeyId("kmsMasterKeyId")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionrule.html)
     */
    public inline fun cfnBucketServerSideEncryptionRuleProperty(
        block: CfnBucketServerSideEncryptionRulePropertyDsl.() -> Unit = {}
    ): CfnBucket.ServerSideEncryptionRuleProperty {
        val builder = CfnBucketServerSideEncryptionRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A container that describes additional filters for identifying the source objects that you
     * want to replicate.
     *
     * You can choose to enable or disable the replication of these objects.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * SourceSelectionCriteriaProperty sourceSelectionCriteriaProperty =
     * SourceSelectionCriteriaProperty.builder()
     * .replicaModifications(ReplicaModificationsProperty.builder()
     * .status("status")
     * .build())
     * .sseKmsEncryptedObjects(SseKmsEncryptedObjectsProperty.builder()
     * .status("status")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-sourceselectioncriteria.html)
     */
    public inline fun cfnBucketSourceSelectionCriteriaProperty(
        block: CfnBucketSourceSelectionCriteriaPropertyDsl.() -> Unit = {}
    ): CfnBucket.SourceSelectionCriteriaProperty {
        val builder = CfnBucketSourceSelectionCriteriaPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A container for filter information for the selection of S3 objects encrypted with AWS KMS.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * SseKmsEncryptedObjectsProperty sseKmsEncryptedObjectsProperty =
     * SseKmsEncryptedObjectsProperty.builder()
     * .status("status")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-ssekmsencryptedobjects.html)
     */
    public inline fun cfnBucketSseKmsEncryptedObjectsProperty(
        block: CfnBucketSseKmsEncryptedObjectsPropertyDsl.() -> Unit = {}
    ): CfnBucket.SseKmsEncryptedObjectsProperty {
        val builder = CfnBucketSseKmsEncryptedObjectsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies data related to access patterns to be collected and made available to analyze the
     * tradeoffs between different storage classes for an Amazon S3 bucket.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * StorageClassAnalysisProperty storageClassAnalysisProperty =
     * StorageClassAnalysisProperty.builder()
     * .dataExport(DataExportProperty.builder()
     * .destination(DestinationProperty.builder()
     * .bucketArn("bucketArn")
     * .format("format")
     * // the properties below are optional
     * .bucketAccountId("bucketAccountId")
     * .prefix("prefix")
     * .build())
     * .outputSchemaVersion("outputSchemaVersion")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-storageclassanalysis.html)
     */
    public inline fun cfnBucketStorageClassAnalysisProperty(
        block: CfnBucketStorageClassAnalysisPropertyDsl.() -> Unit = {}
    ): CfnBucket.StorageClassAnalysisProperty {
        val builder = CfnBucketStorageClassAnalysisPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies tags to use to identify a subset of objects for an Amazon S3 bucket.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * TagFilterProperty tagFilterProperty = TagFilterProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-tagfilter.html)
     */
    public inline fun cfnBucketTagFilterProperty(
        block: CfnBucketTagFilterPropertyDsl.() -> Unit = {}
    ): CfnBucket.TagFilterProperty {
        val builder = CfnBucketTagFilterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Amazon S3 key format for log objects.
     *
     * Only one format, PartitionedPrefix or SimplePrefix, is allowed.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * Object simplePrefix;
     * TargetObjectKeyFormatProperty targetObjectKeyFormatProperty =
     * TargetObjectKeyFormatProperty.builder()
     * .partitionedPrefix(PartitionedPrefixProperty.builder()
     * .partitionDateSource("partitionDateSource")
     * .build())
     * .simplePrefix(simplePrefix)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-targetobjectkeyformat.html)
     */
    public inline fun cfnBucketTargetObjectKeyFormatProperty(
        block: CfnBucketTargetObjectKeyFormatPropertyDsl.() -> Unit = {}
    ): CfnBucket.TargetObjectKeyFormatProperty {
        val builder = CfnBucketTargetObjectKeyFormatPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The S3 Intelligent-Tiering storage class is designed to optimize storage costs by
     * automatically moving data to the most cost-effective storage access tier, without additional
     * operational overhead.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * TieringProperty tieringProperty = TieringProperty.builder()
     * .accessTier("accessTier")
     * .days(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-tiering.html)
     */
    public inline fun cfnBucketTieringProperty(
        block: CfnBucketTieringPropertyDsl.() -> Unit = {}
    ): CfnBucket.TieringProperty {
        val builder = CfnBucketTieringPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A container for specifying the configuration for publication of messages to an Amazon Simple
     * Notification Service (Amazon SNS) topic when Amazon S3 detects specified events.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * TopicConfigurationProperty topicConfigurationProperty = TopicConfigurationProperty.builder()
     * .event("event")
     * .topic("topic")
     * // the properties below are optional
     * .filter(NotificationFilterProperty.builder()
     * .s3Key(S3KeyFilterProperty.builder()
     * .rules(List.of(FilterRuleProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-topicconfiguration.html)
     */
    public inline fun cfnBucketTopicConfigurationProperty(
        block: CfnBucketTopicConfigurationPropertyDsl.() -> Unit = {}
    ): CfnBucket.TopicConfigurationProperty {
        val builder = CfnBucketTopicConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies when an object transitions to a specified storage class.
     *
     * For more information about Amazon S3 lifecycle configuration rules, see
     * [Transitioning Objects Using Amazon S3 Lifecycle](https://docs.aws.amazon.com/AmazonS3/latest/dev/lifecycle-transition-general-considerations.html)
     * in the *Amazon S3 User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * TransitionProperty transitionProperty = TransitionProperty.builder()
     * .storageClass("storageClass")
     * // the properties below are optional
     * .transitionDate(new Date())
     * .transitionInDays(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-transition.html)
     */
    public inline fun cfnBucketTransitionProperty(
        block: CfnBucketTransitionPropertyDsl.() -> Unit = {}
    ): CfnBucket.TransitionProperty {
        val builder = CfnBucketTransitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the versioning state of an Amazon S3 bucket.
     *
     * For more information, see
     * [PUT Bucket versioning](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTVersioningStatus.html)
     * in the *Amazon S3 API Reference* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * VersioningConfigurationProperty versioningConfigurationProperty =
     * VersioningConfigurationProperty.builder()
     * .status("status")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-versioningconfiguration.html)
     */
    public inline fun cfnBucketVersioningConfigurationProperty(
        block: CfnBucketVersioningConfigurationPropertyDsl.() -> Unit = {}
    ): CfnBucket.VersioningConfigurationProperty {
        val builder = CfnBucketVersioningConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies website configuration parameters for an Amazon S3 bucket.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * WebsiteConfigurationProperty websiteConfigurationProperty =
     * WebsiteConfigurationProperty.builder()
     * .errorDocument("errorDocument")
     * .indexDocument("indexDocument")
     * .redirectAllRequestsTo(RedirectAllRequestsToProperty.builder()
     * .hostName("hostName")
     * // the properties below are optional
     * .protocol("protocol")
     * .build())
     * .routingRules(List.of(RoutingRuleProperty.builder()
     * .redirectRule(RedirectRuleProperty.builder()
     * .hostName("hostName")
     * .httpRedirectCode("httpRedirectCode")
     * .protocol("protocol")
     * .replaceKeyPrefixWith("replaceKeyPrefixWith")
     * .replaceKeyWith("replaceKeyWith")
     * .build())
     * // the properties below are optional
     * .routingRuleCondition(RoutingRuleConditionProperty.builder()
     * .httpErrorCodeReturnedEquals("httpErrorCodeReturnedEquals")
     * .keyPrefixEquals("keyPrefixEquals")
     * .build())
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-websiteconfiguration.html)
     */
    public inline fun cfnBucketWebsiteConfigurationProperty(
        block: CfnBucketWebsiteConfigurationPropertyDsl.() -> Unit = {}
    ): CfnBucket.WebsiteConfigurationProperty {
        val builder = CfnBucketWebsiteConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::S3::MultiRegionAccessPoint` resource creates an Amazon S3 Multi-Region Access
     * Point.
     *
     * To learn more about Multi-Region Access Points, see
     * [Multi-Region Access Points in Amazon S3](https://docs.aws.amazon.com/AmazonS3/latest/userguide/MultiRegionAccessPoints.html)
     * in the in the *Amazon S3 User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * CfnMultiRegionAccessPoint cfnMultiRegionAccessPoint =
     * CfnMultiRegionAccessPoint.Builder.create(this, "MyCfnMultiRegionAccessPoint")
     * .regions(List.of(RegionProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .bucketAccountId("bucketAccountId")
     * .build()))
     * // the properties below are optional
     * .name("name")
     * .publicAccessBlockConfiguration(PublicAccessBlockConfigurationProperty.builder()
     * .blockPublicAcls(false)
     * .blockPublicPolicy(false)
     * .ignorePublicAcls(false)
     * .restrictPublicBuckets(false)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-multiregionaccesspoint.html)
     */
    public inline fun cfnMultiRegionAccessPoint(
        scope: Construct,
        id: String,
        block: CfnMultiRegionAccessPointDsl.() -> Unit = {},
    ): CfnMultiRegionAccessPoint {
        val builder = CfnMultiRegionAccessPointDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Applies an Amazon S3 access policy to an Amazon S3 Multi-Region Access Point.
     *
     * It is not possible to delete an access policy for a Multi-Region Access Point from the
     * CloudFormation template. When you attempt to delete the policy, CloudFormation updates the
     * policy using `DeletionPolicy:Retain` and `UpdateReplacePolicy:Retain` . CloudFormation
     * updates the policy to only allow access to the account that created the bucket.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * Object policy;
     * CfnMultiRegionAccessPointPolicy cfnMultiRegionAccessPointPolicy =
     * CfnMultiRegionAccessPointPolicy.Builder.create(this, "MyCfnMultiRegionAccessPointPolicy")
     * .mrapName("mrapName")
     * .policy(policy)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-multiregionaccesspointpolicy.html)
     */
    public inline fun cfnMultiRegionAccessPointPolicy(
        scope: Construct,
        id: String,
        block: CfnMultiRegionAccessPointPolicyDsl.() -> Unit = {},
    ): CfnMultiRegionAccessPointPolicy {
        val builder = CfnMultiRegionAccessPointPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The container element for a bucket's policy status.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * PolicyStatusProperty policyStatusProperty = PolicyStatusProperty.builder()
     * .isPublic("isPublic")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-multiregionaccesspointpolicy-policystatus.html)
     */
    public inline fun cfnMultiRegionAccessPointPolicyPolicyStatusProperty(
        block: CfnMultiRegionAccessPointPolicyPolicyStatusPropertyDsl.() -> Unit = {}
    ): CfnMultiRegionAccessPointPolicy.PolicyStatusProperty {
        val builder = CfnMultiRegionAccessPointPolicyPolicyStatusPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnMultiRegionAccessPointPolicy`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * Object policy;
     * CfnMultiRegionAccessPointPolicyProps cfnMultiRegionAccessPointPolicyProps =
     * CfnMultiRegionAccessPointPolicyProps.builder()
     * .mrapName("mrapName")
     * .policy(policy)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-multiregionaccesspointpolicy.html)
     */
    public inline fun cfnMultiRegionAccessPointPolicyProps(
        block: CfnMultiRegionAccessPointPolicyPropsDsl.() -> Unit = {}
    ): CfnMultiRegionAccessPointPolicyProps {
        val builder = CfnMultiRegionAccessPointPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnMultiRegionAccessPoint`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * CfnMultiRegionAccessPointProps cfnMultiRegionAccessPointProps =
     * CfnMultiRegionAccessPointProps.builder()
     * .regions(List.of(RegionProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .bucketAccountId("bucketAccountId")
     * .build()))
     * // the properties below are optional
     * .name("name")
     * .publicAccessBlockConfiguration(PublicAccessBlockConfigurationProperty.builder()
     * .blockPublicAcls(false)
     * .blockPublicPolicy(false)
     * .ignorePublicAcls(false)
     * .restrictPublicBuckets(false)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-multiregionaccesspoint.html)
     */
    public inline fun cfnMultiRegionAccessPointProps(
        block: CfnMultiRegionAccessPointPropsDsl.() -> Unit = {}
    ): CfnMultiRegionAccessPointProps {
        val builder = CfnMultiRegionAccessPointPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The PublicAccessBlock configuration that you want to apply to this Amazon S3 Multi-Region
     * Access Point.
     *
     * You can enable the configuration options in any combination. For more information about when
     * Amazon S3 considers an object public, see
     * [The Meaning of "Public"](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status)
     * in the *Amazon S3 User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * PublicAccessBlockConfigurationProperty publicAccessBlockConfigurationProperty =
     * PublicAccessBlockConfigurationProperty.builder()
     * .blockPublicAcls(false)
     * .blockPublicPolicy(false)
     * .ignorePublicAcls(false)
     * .restrictPublicBuckets(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-multiregionaccesspoint-publicaccessblockconfiguration.html)
     */
    public inline fun cfnMultiRegionAccessPointPublicAccessBlockConfigurationProperty(
        block: CfnMultiRegionAccessPointPublicAccessBlockConfigurationPropertyDsl.() -> Unit = {}
    ): CfnMultiRegionAccessPoint.PublicAccessBlockConfigurationProperty {
        val builder = CfnMultiRegionAccessPointPublicAccessBlockConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A bucket associated with a specific Region when creating Multi-Region Access Points.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * RegionProperty regionProperty = RegionProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .bucketAccountId("bucketAccountId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-multiregionaccesspoint-region.html)
     */
    public inline fun cfnMultiRegionAccessPointRegionProperty(
        block: CfnMultiRegionAccessPointRegionPropertyDsl.() -> Unit = {}
    ): CfnMultiRegionAccessPoint.RegionProperty {
        val builder = CfnMultiRegionAccessPointRegionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The AWS::S3::StorageLens resource creates an Amazon S3 Storage Lens configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * Object sses3;
     * CfnStorageLens cfnStorageLens = CfnStorageLens.Builder.create(this, "MyCfnStorageLens")
     * .storageLensConfiguration(StorageLensConfigurationProperty.builder()
     * .accountLevel(AccountLevelProperty.builder()
     * .bucketLevel(BucketLevelProperty.builder()
     * .activityMetrics(ActivityMetricsProperty.builder()
     * .isEnabled(false)
     * .build())
     * .advancedCostOptimizationMetrics(AdvancedCostOptimizationMetricsProperty.builder()
     * .isEnabled(false)
     * .build())
     * .advancedDataProtectionMetrics(AdvancedDataProtectionMetricsProperty.builder()
     * .isEnabled(false)
     * .build())
     * .detailedStatusCodesMetrics(DetailedStatusCodesMetricsProperty.builder()
     * .isEnabled(false)
     * .build())
     * .prefixLevel(PrefixLevelProperty.builder()
     * .storageMetrics(PrefixLevelStorageMetricsProperty.builder()
     * .isEnabled(false)
     * .selectionCriteria(SelectionCriteriaProperty.builder()
     * .delimiter("delimiter")
     * .maxDepth(123)
     * .minStorageBytesPercentage(123)
     * .build())
     * .build())
     * .build())
     * .build())
     * // the properties below are optional
     * .activityMetrics(ActivityMetricsProperty.builder()
     * .isEnabled(false)
     * .build())
     * .advancedCostOptimizationMetrics(AdvancedCostOptimizationMetricsProperty.builder()
     * .isEnabled(false)
     * .build())
     * .advancedDataProtectionMetrics(AdvancedDataProtectionMetricsProperty.builder()
     * .isEnabled(false)
     * .build())
     * .detailedStatusCodesMetrics(DetailedStatusCodesMetricsProperty.builder()
     * .isEnabled(false)
     * .build())
     * .storageLensGroupLevel(StorageLensGroupLevelProperty.builder()
     * .storageLensGroupSelectionCriteria(StorageLensGroupSelectionCriteriaProperty.builder()
     * .exclude(List.of("exclude"))
     * .include(List.of("include"))
     * .build())
     * .build())
     * .build())
     * .id("id")
     * .isEnabled(false)
     * // the properties below are optional
     * .awsOrg(AwsOrgProperty.builder()
     * .arn("arn")
     * .build())
     * .dataExport(DataExportProperty.builder()
     * .cloudWatchMetrics(CloudWatchMetricsProperty.builder()
     * .isEnabled(false)
     * .build())
     * .s3BucketDestination(S3BucketDestinationProperty.builder()
     * .accountId("accountId")
     * .arn("arn")
     * .format("format")
     * .outputSchemaVersion("outputSchemaVersion")
     * // the properties below are optional
     * .encryption(EncryptionProperty.builder()
     * .ssekms(SSEKMSProperty.builder()
     * .keyId("keyId")
     * .build())
     * .sses3(sses3)
     * .build())
     * .prefix("prefix")
     * .build())
     * .build())
     * .exclude(BucketsAndRegionsProperty.builder()
     * .buckets(List.of("buckets"))
     * .regions(List.of("regions"))
     * .build())
     * .include(BucketsAndRegionsProperty.builder()
     * .buckets(List.of("buckets"))
     * .regions(List.of("regions"))
     * .build())
     * .storageLensArn("storageLensArn")
     * .build())
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelens.html)
     */
    public inline fun cfnStorageLens(
        scope: Construct,
        id: String,
        block: CfnStorageLensDsl.() -> Unit = {},
    ): CfnStorageLens {
        val builder = CfnStorageLensDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * This resource contains the details of the account-level metrics for Amazon S3 Storage Lens.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * AccountLevelProperty accountLevelProperty = AccountLevelProperty.builder()
     * .bucketLevel(BucketLevelProperty.builder()
     * .activityMetrics(ActivityMetricsProperty.builder()
     * .isEnabled(false)
     * .build())
     * .advancedCostOptimizationMetrics(AdvancedCostOptimizationMetricsProperty.builder()
     * .isEnabled(false)
     * .build())
     * .advancedDataProtectionMetrics(AdvancedDataProtectionMetricsProperty.builder()
     * .isEnabled(false)
     * .build())
     * .detailedStatusCodesMetrics(DetailedStatusCodesMetricsProperty.builder()
     * .isEnabled(false)
     * .build())
     * .prefixLevel(PrefixLevelProperty.builder()
     * .storageMetrics(PrefixLevelStorageMetricsProperty.builder()
     * .isEnabled(false)
     * .selectionCriteria(SelectionCriteriaProperty.builder()
     * .delimiter("delimiter")
     * .maxDepth(123)
     * .minStorageBytesPercentage(123)
     * .build())
     * .build())
     * .build())
     * .build())
     * // the properties below are optional
     * .activityMetrics(ActivityMetricsProperty.builder()
     * .isEnabled(false)
     * .build())
     * .advancedCostOptimizationMetrics(AdvancedCostOptimizationMetricsProperty.builder()
     * .isEnabled(false)
     * .build())
     * .advancedDataProtectionMetrics(AdvancedDataProtectionMetricsProperty.builder()
     * .isEnabled(false)
     * .build())
     * .detailedStatusCodesMetrics(DetailedStatusCodesMetricsProperty.builder()
     * .isEnabled(false)
     * .build())
     * .storageLensGroupLevel(StorageLensGroupLevelProperty.builder()
     * .storageLensGroupSelectionCriteria(StorageLensGroupSelectionCriteriaProperty.builder()
     * .exclude(List.of("exclude"))
     * .include(List.of("include"))
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-accountlevel.html)
     */
    public inline fun cfnStorageLensAccountLevelProperty(
        block: CfnStorageLensAccountLevelPropertyDsl.() -> Unit = {}
    ): CfnStorageLens.AccountLevelProperty {
        val builder = CfnStorageLensAccountLevelPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This resource enables Amazon S3 Storage Lens activity metrics.
     *
     * Activity metrics show details about how your storage is requested, such as requests (for
     * example, All requests, Get requests, Put requests), bytes uploaded or downloaded, and errors.
     *
     * For more information, see
     * [Assessing your storage activity and usage with S3 Storage Lens](https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens.html)
     * in the *Amazon S3 User Guide* . For a complete list of metrics, see
     * [S3 Storage Lens metrics glossary](https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens_metrics_glossary.html)
     * in the *Amazon S3 User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * ActivityMetricsProperty activityMetricsProperty = ActivityMetricsProperty.builder()
     * .isEnabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-activitymetrics.html)
     */
    public inline fun cfnStorageLensActivityMetricsProperty(
        block: CfnStorageLensActivityMetricsPropertyDsl.() -> Unit = {}
    ): CfnStorageLens.ActivityMetricsProperty {
        val builder = CfnStorageLensActivityMetricsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This resource enables Amazon S3 Storage Lens advanced cost optimization metrics.
     *
     * Advanced cost optimization metrics provide insights that you can use to manage and optimize
     * your storage costs, for example, lifecycle rule counts for transitions, expirations, and
     * incomplete multipart uploads.
     *
     * For more information, see
     * [Assessing your storage activity and usage with S3 Storage Lens](https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens.html)
     * in the *Amazon S3 User Guide* . For a complete list of metrics, see
     * [S3 Storage Lens metrics glossary](https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens_metrics_glossary.html)
     * in the *Amazon S3 User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * AdvancedCostOptimizationMetricsProperty advancedCostOptimizationMetricsProperty =
     * AdvancedCostOptimizationMetricsProperty.builder()
     * .isEnabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-advancedcostoptimizationmetrics.html)
     */
    public inline fun cfnStorageLensAdvancedCostOptimizationMetricsProperty(
        block: CfnStorageLensAdvancedCostOptimizationMetricsPropertyDsl.() -> Unit = {}
    ): CfnStorageLens.AdvancedCostOptimizationMetricsProperty {
        val builder = CfnStorageLensAdvancedCostOptimizationMetricsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This resource enables Amazon S3 Storage Lens advanced data protection metrics.
     *
     * Advanced data protection metrics provide insights that you can use to perform audits and
     * protect your data, for example replication rule counts within and across Regions.
     *
     * For more information, see
     * [Assessing your storage activity and usage with S3 Storage Lens](https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens.html)
     * in the *Amazon S3 User Guide* . For a complete list of metrics, see
     * [S3 Storage Lens metrics glossary](https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens_metrics_glossary.html)
     * in the *Amazon S3 User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * AdvancedDataProtectionMetricsProperty advancedDataProtectionMetricsProperty =
     * AdvancedDataProtectionMetricsProperty.builder()
     * .isEnabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-advanceddataprotectionmetrics.html)
     */
    public inline fun cfnStorageLensAdvancedDataProtectionMetricsProperty(
        block: CfnStorageLensAdvancedDataProtectionMetricsPropertyDsl.() -> Unit = {}
    ): CfnStorageLens.AdvancedDataProtectionMetricsProperty {
        val builder = CfnStorageLensAdvancedDataProtectionMetricsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This resource contains the details of the AWS Organization for Amazon S3 Storage Lens.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * AwsOrgProperty awsOrgProperty = AwsOrgProperty.builder()
     * .arn("arn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-awsorg.html)
     */
    public inline fun cfnStorageLensAwsOrgProperty(
        block: CfnStorageLensAwsOrgPropertyDsl.() -> Unit = {}
    ): CfnStorageLens.AwsOrgProperty {
        val builder = CfnStorageLensAwsOrgPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A property for the bucket-level storage metrics for Amazon S3 Storage Lens.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * BucketLevelProperty bucketLevelProperty = BucketLevelProperty.builder()
     * .activityMetrics(ActivityMetricsProperty.builder()
     * .isEnabled(false)
     * .build())
     * .advancedCostOptimizationMetrics(AdvancedCostOptimizationMetricsProperty.builder()
     * .isEnabled(false)
     * .build())
     * .advancedDataProtectionMetrics(AdvancedDataProtectionMetricsProperty.builder()
     * .isEnabled(false)
     * .build())
     * .detailedStatusCodesMetrics(DetailedStatusCodesMetricsProperty.builder()
     * .isEnabled(false)
     * .build())
     * .prefixLevel(PrefixLevelProperty.builder()
     * .storageMetrics(PrefixLevelStorageMetricsProperty.builder()
     * .isEnabled(false)
     * .selectionCriteria(SelectionCriteriaProperty.builder()
     * .delimiter("delimiter")
     * .maxDepth(123)
     * .minStorageBytesPercentage(123)
     * .build())
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-bucketlevel.html)
     */
    public inline fun cfnStorageLensBucketLevelProperty(
        block: CfnStorageLensBucketLevelPropertyDsl.() -> Unit = {}
    ): CfnStorageLens.BucketLevelProperty {
        val builder = CfnStorageLensBucketLevelPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This resource contains the details of the buckets and Regions for the Amazon S3 Storage Lens
     * configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * BucketsAndRegionsProperty bucketsAndRegionsProperty = BucketsAndRegionsProperty.builder()
     * .buckets(List.of("buckets"))
     * .regions(List.of("regions"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-bucketsandregions.html)
     */
    public inline fun cfnStorageLensBucketsAndRegionsProperty(
        block: CfnStorageLensBucketsAndRegionsPropertyDsl.() -> Unit = {}
    ): CfnStorageLens.BucketsAndRegionsProperty {
        val builder = CfnStorageLensBucketsAndRegionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This resource enables the Amazon CloudWatch publishing option for Amazon S3 Storage Lens
     * metrics.
     *
     * For more information, see
     * [Monitor S3 Storage Lens metrics in CloudWatch](https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens_view_metrics_cloudwatch.html)
     * in the *Amazon S3 User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * CloudWatchMetricsProperty cloudWatchMetricsProperty = CloudWatchMetricsProperty.builder()
     * .isEnabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-cloudwatchmetrics.html)
     */
    public inline fun cfnStorageLensCloudWatchMetricsProperty(
        block: CfnStorageLensCloudWatchMetricsPropertyDsl.() -> Unit = {}
    ): CfnStorageLens.CloudWatchMetricsProperty {
        val builder = CfnStorageLensCloudWatchMetricsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This resource contains the details of the Amazon S3 Storage Lens metrics export.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * Object sses3;
     * DataExportProperty dataExportProperty = DataExportProperty.builder()
     * .cloudWatchMetrics(CloudWatchMetricsProperty.builder()
     * .isEnabled(false)
     * .build())
     * .s3BucketDestination(S3BucketDestinationProperty.builder()
     * .accountId("accountId")
     * .arn("arn")
     * .format("format")
     * .outputSchemaVersion("outputSchemaVersion")
     * // the properties below are optional
     * .encryption(EncryptionProperty.builder()
     * .ssekms(SSEKMSProperty.builder()
     * .keyId("keyId")
     * .build())
     * .sses3(sses3)
     * .build())
     * .prefix("prefix")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-dataexport.html)
     */
    public inline fun cfnStorageLensDataExportProperty(
        block: CfnStorageLensDataExportPropertyDsl.() -> Unit = {}
    ): CfnStorageLens.DataExportProperty {
        val builder = CfnStorageLensDataExportPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This resource enables Amazon S3 Storage Lens detailed status code metrics.
     *
     * Detailed status code metrics generate metrics for HTTP status codes, such as `200 OK` , `403
     * Forbidden` , `503 Service Unavailable` and others.
     *
     * For more information, see
     * [Assessing your storage activity and usage with S3 Storage Lens](https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens.html)
     * in the *Amazon S3 User Guide* . For a complete list of metrics, see
     * [S3 Storage Lens metrics glossary](https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens_metrics_glossary.html)
     * in the *Amazon S3 User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * DetailedStatusCodesMetricsProperty detailedStatusCodesMetricsProperty =
     * DetailedStatusCodesMetricsProperty.builder()
     * .isEnabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-detailedstatuscodesmetrics.html)
     */
    public inline fun cfnStorageLensDetailedStatusCodesMetricsProperty(
        block: CfnStorageLensDetailedStatusCodesMetricsPropertyDsl.() -> Unit = {}
    ): CfnStorageLens.DetailedStatusCodesMetricsProperty {
        val builder = CfnStorageLensDetailedStatusCodesMetricsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This resource contains the type of server-side encryption used to encrypt an Amazon S3
     * Storage Lens metrics export.
     *
     * For valid values, see the
     * [StorageLensDataExportEncryption](https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_StorageLensDataExportEncryption.html)
     * in the *Amazon S3 API Reference* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * Object sses3;
     * EncryptionProperty encryptionProperty = EncryptionProperty.builder()
     * .ssekms(SSEKMSProperty.builder()
     * .keyId("keyId")
     * .build())
     * .sses3(sses3)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-encryption.html)
     */
    public inline fun cfnStorageLensEncryptionProperty(
        block: CfnStorageLensEncryptionPropertyDsl.() -> Unit = {}
    ): CfnStorageLens.EncryptionProperty {
        val builder = CfnStorageLensEncryptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::S3::StorageLensGroup` resource creates an S3 Storage Lens group.
     *
     * A Storage Lens group is a custom grouping of objects that include filters for prefixes,
     * suffixes, object tags, object size, or object age. You can create an S3 Storage Lens group
     * that includes a single filter or multiple filter conditions. To specify multiple filter
     * conditions, you use `AND` or `OR` logical operators. For more information about S3 Storage
     * Lens groups, see
     * [Working with S3 Storage Lens groups](https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage-lens-groups-overview.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * CfnStorageLensGroup cfnStorageLensGroup = CfnStorageLensGroup.Builder.create(this,
     * "MyCfnStorageLensGroup")
     * .filter(FilterProperty.builder()
     * .and(AndProperty.builder()
     * .matchAnyPrefix(List.of("matchAnyPrefix"))
     * .matchAnySuffix(List.of("matchAnySuffix"))
     * .matchAnyTag(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .matchObjectAge(MatchObjectAgeProperty.builder()
     * .daysGreaterThan(123)
     * .daysLessThan(123)
     * .build())
     * .matchObjectSize(MatchObjectSizeProperty.builder()
     * .bytesGreaterThan(123)
     * .bytesLessThan(123)
     * .build())
     * .build())
     * .matchAnyPrefix(List.of("matchAnyPrefix"))
     * .matchAnySuffix(List.of("matchAnySuffix"))
     * .matchAnyTag(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .matchObjectAge(MatchObjectAgeProperty.builder()
     * .daysGreaterThan(123)
     * .daysLessThan(123)
     * .build())
     * .matchObjectSize(MatchObjectSizeProperty.builder()
     * .bytesGreaterThan(123)
     * .bytesLessThan(123)
     * .build())
     * .or(OrProperty.builder()
     * .matchAnyPrefix(List.of("matchAnyPrefix"))
     * .matchAnySuffix(List.of("matchAnySuffix"))
     * .matchAnyTag(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .matchObjectAge(MatchObjectAgeProperty.builder()
     * .daysGreaterThan(123)
     * .daysLessThan(123)
     * .build())
     * .matchObjectSize(MatchObjectSizeProperty.builder()
     * .bytesGreaterThan(123)
     * .bytesLessThan(123)
     * .build())
     * .build())
     * .build())
     * .name("name")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelensgroup.html)
     */
    public inline fun cfnStorageLensGroup(
        scope: Construct,
        id: String,
        block: CfnStorageLensGroupDsl.() -> Unit = {},
    ): CfnStorageLensGroup {
        val builder = CfnStorageLensGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * This resource is a logical operator that allows multiple filter conditions to be joined for
     * more complex comparisons of Storage Lens group data.
     *
     * Objects must match all of the listed filter conditions that are joined by the `And` logical
     * operator. Only one of each filter condition is allowed.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * AndProperty andProperty = AndProperty.builder()
     * .matchAnyPrefix(List.of("matchAnyPrefix"))
     * .matchAnySuffix(List.of("matchAnySuffix"))
     * .matchAnyTag(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .matchObjectAge(MatchObjectAgeProperty.builder()
     * .daysGreaterThan(123)
     * .daysLessThan(123)
     * .build())
     * .matchObjectSize(MatchObjectSizeProperty.builder()
     * .bytesGreaterThan(123)
     * .bytesLessThan(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-and.html)
     */
    public inline fun cfnStorageLensGroupAndProperty(
        block: CfnStorageLensGroupAndPropertyDsl.() -> Unit = {}
    ): CfnStorageLensGroup.AndProperty {
        val builder = CfnStorageLensGroupAndPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This resource sets the criteria for the Storage Lens group data that is displayed.
     *
     * For multiple filter conditions, the `AND` or `OR` logical operator is used.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * FilterProperty filterProperty = FilterProperty.builder()
     * .and(AndProperty.builder()
     * .matchAnyPrefix(List.of("matchAnyPrefix"))
     * .matchAnySuffix(List.of("matchAnySuffix"))
     * .matchAnyTag(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .matchObjectAge(MatchObjectAgeProperty.builder()
     * .daysGreaterThan(123)
     * .daysLessThan(123)
     * .build())
     * .matchObjectSize(MatchObjectSizeProperty.builder()
     * .bytesGreaterThan(123)
     * .bytesLessThan(123)
     * .build())
     * .build())
     * .matchAnyPrefix(List.of("matchAnyPrefix"))
     * .matchAnySuffix(List.of("matchAnySuffix"))
     * .matchAnyTag(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .matchObjectAge(MatchObjectAgeProperty.builder()
     * .daysGreaterThan(123)
     * .daysLessThan(123)
     * .build())
     * .matchObjectSize(MatchObjectSizeProperty.builder()
     * .bytesGreaterThan(123)
     * .bytesLessThan(123)
     * .build())
     * .or(OrProperty.builder()
     * .matchAnyPrefix(List.of("matchAnyPrefix"))
     * .matchAnySuffix(List.of("matchAnySuffix"))
     * .matchAnyTag(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .matchObjectAge(MatchObjectAgeProperty.builder()
     * .daysGreaterThan(123)
     * .daysLessThan(123)
     * .build())
     * .matchObjectSize(MatchObjectSizeProperty.builder()
     * .bytesGreaterThan(123)
     * .bytesLessThan(123)
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-filter.html)
     */
    public inline fun cfnStorageLensGroupFilterProperty(
        block: CfnStorageLensGroupFilterPropertyDsl.() -> Unit = {}
    ): CfnStorageLensGroup.FilterProperty {
        val builder = CfnStorageLensGroupFilterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This resource contains `DaysGreaterThan` and `DaysLessThan` to define the object age range
     * (minimum and maximum number of days).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * MatchObjectAgeProperty matchObjectAgeProperty = MatchObjectAgeProperty.builder()
     * .daysGreaterThan(123)
     * .daysLessThan(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-matchobjectage.html)
     */
    public inline fun cfnStorageLensGroupMatchObjectAgeProperty(
        block: CfnStorageLensGroupMatchObjectAgePropertyDsl.() -> Unit = {}
    ): CfnStorageLensGroup.MatchObjectAgeProperty {
        val builder = CfnStorageLensGroupMatchObjectAgePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This resource filters objects that match the specified object size range.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * MatchObjectSizeProperty matchObjectSizeProperty = MatchObjectSizeProperty.builder()
     * .bytesGreaterThan(123)
     * .bytesLessThan(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-matchobjectsize.html)
     */
    public inline fun cfnStorageLensGroupMatchObjectSizeProperty(
        block: CfnStorageLensGroupMatchObjectSizePropertyDsl.() -> Unit = {}
    ): CfnStorageLensGroup.MatchObjectSizeProperty {
        val builder = CfnStorageLensGroupMatchObjectSizePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This resource contains the `Or` logical operator, which allows multiple filter conditions to
     * be joined for more complex comparisons of Storage Lens group data.
     *
     * Objects can match any of the listed filter conditions that are joined by the `Or` logical
     * operator. Only one of each filter condition is allowed.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * OrProperty orProperty = OrProperty.builder()
     * .matchAnyPrefix(List.of("matchAnyPrefix"))
     * .matchAnySuffix(List.of("matchAnySuffix"))
     * .matchAnyTag(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .matchObjectAge(MatchObjectAgeProperty.builder()
     * .daysGreaterThan(123)
     * .daysLessThan(123)
     * .build())
     * .matchObjectSize(MatchObjectSizeProperty.builder()
     * .bytesGreaterThan(123)
     * .bytesLessThan(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelensgroup-or.html)
     */
    public inline fun cfnStorageLensGroupOrProperty(
        block: CfnStorageLensGroupOrPropertyDsl.() -> Unit = {}
    ): CfnStorageLensGroup.OrProperty {
        val builder = CfnStorageLensGroupOrPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnStorageLensGroup`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * CfnStorageLensGroupProps cfnStorageLensGroupProps = CfnStorageLensGroupProps.builder()
     * .filter(FilterProperty.builder()
     * .and(AndProperty.builder()
     * .matchAnyPrefix(List.of("matchAnyPrefix"))
     * .matchAnySuffix(List.of("matchAnySuffix"))
     * .matchAnyTag(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .matchObjectAge(MatchObjectAgeProperty.builder()
     * .daysGreaterThan(123)
     * .daysLessThan(123)
     * .build())
     * .matchObjectSize(MatchObjectSizeProperty.builder()
     * .bytesGreaterThan(123)
     * .bytesLessThan(123)
     * .build())
     * .build())
     * .matchAnyPrefix(List.of("matchAnyPrefix"))
     * .matchAnySuffix(List.of("matchAnySuffix"))
     * .matchAnyTag(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .matchObjectAge(MatchObjectAgeProperty.builder()
     * .daysGreaterThan(123)
     * .daysLessThan(123)
     * .build())
     * .matchObjectSize(MatchObjectSizeProperty.builder()
     * .bytesGreaterThan(123)
     * .bytesLessThan(123)
     * .build())
     * .or(OrProperty.builder()
     * .matchAnyPrefix(List.of("matchAnyPrefix"))
     * .matchAnySuffix(List.of("matchAnySuffix"))
     * .matchAnyTag(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .matchObjectAge(MatchObjectAgeProperty.builder()
     * .daysGreaterThan(123)
     * .daysLessThan(123)
     * .build())
     * .matchObjectSize(MatchObjectSizeProperty.builder()
     * .bytesGreaterThan(123)
     * .bytesLessThan(123)
     * .build())
     * .build())
     * .build())
     * .name("name")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelensgroup.html)
     */
    public inline fun cfnStorageLensGroupProps(
        block: CfnStorageLensGroupPropsDsl.() -> Unit = {}
    ): CfnStorageLensGroupProps {
        val builder = CfnStorageLensGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This resource contains the details of the prefix-level of the Amazon S3 Storage Lens.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * PrefixLevelProperty prefixLevelProperty = PrefixLevelProperty.builder()
     * .storageMetrics(PrefixLevelStorageMetricsProperty.builder()
     * .isEnabled(false)
     * .selectionCriteria(SelectionCriteriaProperty.builder()
     * .delimiter("delimiter")
     * .maxDepth(123)
     * .minStorageBytesPercentage(123)
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-prefixlevel.html)
     */
    public inline fun cfnStorageLensPrefixLevelProperty(
        block: CfnStorageLensPrefixLevelPropertyDsl.() -> Unit = {}
    ): CfnStorageLens.PrefixLevelProperty {
        val builder = CfnStorageLensPrefixLevelPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This resource contains the details of the prefix-level storage metrics for Amazon S3 Storage
     * Lens.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * PrefixLevelStorageMetricsProperty prefixLevelStorageMetricsProperty =
     * PrefixLevelStorageMetricsProperty.builder()
     * .isEnabled(false)
     * .selectionCriteria(SelectionCriteriaProperty.builder()
     * .delimiter("delimiter")
     * .maxDepth(123)
     * .minStorageBytesPercentage(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-prefixlevelstoragemetrics.html)
     */
    public inline fun cfnStorageLensPrefixLevelStorageMetricsProperty(
        block: CfnStorageLensPrefixLevelStorageMetricsPropertyDsl.() -> Unit = {}
    ): CfnStorageLens.PrefixLevelStorageMetricsProperty {
        val builder = CfnStorageLensPrefixLevelStorageMetricsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnStorageLens`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * Object sses3;
     * CfnStorageLensProps cfnStorageLensProps = CfnStorageLensProps.builder()
     * .storageLensConfiguration(StorageLensConfigurationProperty.builder()
     * .accountLevel(AccountLevelProperty.builder()
     * .bucketLevel(BucketLevelProperty.builder()
     * .activityMetrics(ActivityMetricsProperty.builder()
     * .isEnabled(false)
     * .build())
     * .advancedCostOptimizationMetrics(AdvancedCostOptimizationMetricsProperty.builder()
     * .isEnabled(false)
     * .build())
     * .advancedDataProtectionMetrics(AdvancedDataProtectionMetricsProperty.builder()
     * .isEnabled(false)
     * .build())
     * .detailedStatusCodesMetrics(DetailedStatusCodesMetricsProperty.builder()
     * .isEnabled(false)
     * .build())
     * .prefixLevel(PrefixLevelProperty.builder()
     * .storageMetrics(PrefixLevelStorageMetricsProperty.builder()
     * .isEnabled(false)
     * .selectionCriteria(SelectionCriteriaProperty.builder()
     * .delimiter("delimiter")
     * .maxDepth(123)
     * .minStorageBytesPercentage(123)
     * .build())
     * .build())
     * .build())
     * .build())
     * // the properties below are optional
     * .activityMetrics(ActivityMetricsProperty.builder()
     * .isEnabled(false)
     * .build())
     * .advancedCostOptimizationMetrics(AdvancedCostOptimizationMetricsProperty.builder()
     * .isEnabled(false)
     * .build())
     * .advancedDataProtectionMetrics(AdvancedDataProtectionMetricsProperty.builder()
     * .isEnabled(false)
     * .build())
     * .detailedStatusCodesMetrics(DetailedStatusCodesMetricsProperty.builder()
     * .isEnabled(false)
     * .build())
     * .storageLensGroupLevel(StorageLensGroupLevelProperty.builder()
     * .storageLensGroupSelectionCriteria(StorageLensGroupSelectionCriteriaProperty.builder()
     * .exclude(List.of("exclude"))
     * .include(List.of("include"))
     * .build())
     * .build())
     * .build())
     * .id("id")
     * .isEnabled(false)
     * // the properties below are optional
     * .awsOrg(AwsOrgProperty.builder()
     * .arn("arn")
     * .build())
     * .dataExport(DataExportProperty.builder()
     * .cloudWatchMetrics(CloudWatchMetricsProperty.builder()
     * .isEnabled(false)
     * .build())
     * .s3BucketDestination(S3BucketDestinationProperty.builder()
     * .accountId("accountId")
     * .arn("arn")
     * .format("format")
     * .outputSchemaVersion("outputSchemaVersion")
     * // the properties below are optional
     * .encryption(EncryptionProperty.builder()
     * .ssekms(SSEKMSProperty.builder()
     * .keyId("keyId")
     * .build())
     * .sses3(sses3)
     * .build())
     * .prefix("prefix")
     * .build())
     * .build())
     * .exclude(BucketsAndRegionsProperty.builder()
     * .buckets(List.of("buckets"))
     * .regions(List.of("regions"))
     * .build())
     * .include(BucketsAndRegionsProperty.builder()
     * .buckets(List.of("buckets"))
     * .regions(List.of("regions"))
     * .build())
     * .storageLensArn("storageLensArn")
     * .build())
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelens.html)
     */
    public inline fun cfnStorageLensProps(
        block: CfnStorageLensPropsDsl.() -> Unit = {}
    ): CfnStorageLensProps {
        val builder = CfnStorageLensPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This resource contains the details of the bucket where the Amazon S3 Storage Lens metrics
     * export will be placed.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * Object sses3;
     * S3BucketDestinationProperty s3BucketDestinationProperty = S3BucketDestinationProperty.builder()
     * .accountId("accountId")
     * .arn("arn")
     * .format("format")
     * .outputSchemaVersion("outputSchemaVersion")
     * // the properties below are optional
     * .encryption(EncryptionProperty.builder()
     * .ssekms(SSEKMSProperty.builder()
     * .keyId("keyId")
     * .build())
     * .sses3(sses3)
     * .build())
     * .prefix("prefix")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-s3bucketdestination.html)
     */
    public inline fun cfnStorageLensS3BucketDestinationProperty(
        block: CfnStorageLensS3BucketDestinationPropertyDsl.() -> Unit = {}
    ): CfnStorageLens.S3BucketDestinationProperty {
        val builder = CfnStorageLensS3BucketDestinationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the use of server-side encryption using an AWS Key Management Service key (SSE-KMS)
     * to encrypt the delivered S3 Storage Lens metrics export file.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * SSEKMSProperty sSEKMSProperty = SSEKMSProperty.builder()
     * .keyId("keyId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-ssekms.html)
     */
    public inline fun cfnStorageLensSSEKMSProperty(
        block: CfnStorageLensSSEKMSPropertyDsl.() -> Unit = {}
    ): CfnStorageLens.SSEKMSProperty {
        val builder = CfnStorageLensSSEKMSPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This resource contains the details of the Amazon S3 Storage Lens selection criteria.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * SelectionCriteriaProperty selectionCriteriaProperty = SelectionCriteriaProperty.builder()
     * .delimiter("delimiter")
     * .maxDepth(123)
     * .minStorageBytesPercentage(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-selectioncriteria.html)
     */
    public inline fun cfnStorageLensSelectionCriteriaProperty(
        block: CfnStorageLensSelectionCriteriaPropertyDsl.() -> Unit = {}
    ): CfnStorageLens.SelectionCriteriaProperty {
        val builder = CfnStorageLensSelectionCriteriaPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This is the property of the Amazon S3 Storage Lens configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * Object sses3;
     * StorageLensConfigurationProperty storageLensConfigurationProperty =
     * StorageLensConfigurationProperty.builder()
     * .accountLevel(AccountLevelProperty.builder()
     * .bucketLevel(BucketLevelProperty.builder()
     * .activityMetrics(ActivityMetricsProperty.builder()
     * .isEnabled(false)
     * .build())
     * .advancedCostOptimizationMetrics(AdvancedCostOptimizationMetricsProperty.builder()
     * .isEnabled(false)
     * .build())
     * .advancedDataProtectionMetrics(AdvancedDataProtectionMetricsProperty.builder()
     * .isEnabled(false)
     * .build())
     * .detailedStatusCodesMetrics(DetailedStatusCodesMetricsProperty.builder()
     * .isEnabled(false)
     * .build())
     * .prefixLevel(PrefixLevelProperty.builder()
     * .storageMetrics(PrefixLevelStorageMetricsProperty.builder()
     * .isEnabled(false)
     * .selectionCriteria(SelectionCriteriaProperty.builder()
     * .delimiter("delimiter")
     * .maxDepth(123)
     * .minStorageBytesPercentage(123)
     * .build())
     * .build())
     * .build())
     * .build())
     * // the properties below are optional
     * .activityMetrics(ActivityMetricsProperty.builder()
     * .isEnabled(false)
     * .build())
     * .advancedCostOptimizationMetrics(AdvancedCostOptimizationMetricsProperty.builder()
     * .isEnabled(false)
     * .build())
     * .advancedDataProtectionMetrics(AdvancedDataProtectionMetricsProperty.builder()
     * .isEnabled(false)
     * .build())
     * .detailedStatusCodesMetrics(DetailedStatusCodesMetricsProperty.builder()
     * .isEnabled(false)
     * .build())
     * .storageLensGroupLevel(StorageLensGroupLevelProperty.builder()
     * .storageLensGroupSelectionCriteria(StorageLensGroupSelectionCriteriaProperty.builder()
     * .exclude(List.of("exclude"))
     * .include(List.of("include"))
     * .build())
     * .build())
     * .build())
     * .id("id")
     * .isEnabled(false)
     * // the properties below are optional
     * .awsOrg(AwsOrgProperty.builder()
     * .arn("arn")
     * .build())
     * .dataExport(DataExportProperty.builder()
     * .cloudWatchMetrics(CloudWatchMetricsProperty.builder()
     * .isEnabled(false)
     * .build())
     * .s3BucketDestination(S3BucketDestinationProperty.builder()
     * .accountId("accountId")
     * .arn("arn")
     * .format("format")
     * .outputSchemaVersion("outputSchemaVersion")
     * // the properties below are optional
     * .encryption(EncryptionProperty.builder()
     * .ssekms(SSEKMSProperty.builder()
     * .keyId("keyId")
     * .build())
     * .sses3(sses3)
     * .build())
     * .prefix("prefix")
     * .build())
     * .build())
     * .exclude(BucketsAndRegionsProperty.builder()
     * .buckets(List.of("buckets"))
     * .regions(List.of("regions"))
     * .build())
     * .include(BucketsAndRegionsProperty.builder()
     * .buckets(List.of("buckets"))
     * .regions(List.of("regions"))
     * .build())
     * .storageLensArn("storageLensArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-storagelensconfiguration.html)
     */
    public inline fun cfnStorageLensStorageLensConfigurationProperty(
        block: CfnStorageLensStorageLensConfigurationPropertyDsl.() -> Unit = {}
    ): CfnStorageLens.StorageLensConfigurationProperty {
        val builder = CfnStorageLensStorageLensConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This resource determines the scope of Storage Lens group data that is displayed in the
     * Storage Lens dashboard.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * StorageLensGroupLevelProperty storageLensGroupLevelProperty =
     * StorageLensGroupLevelProperty.builder()
     * .storageLensGroupSelectionCriteria(StorageLensGroupSelectionCriteriaProperty.builder()
     * .exclude(List.of("exclude"))
     * .include(List.of("include"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-storagelensgrouplevel.html)
     */
    public inline fun cfnStorageLensStorageLensGroupLevelProperty(
        block: CfnStorageLensStorageLensGroupLevelPropertyDsl.() -> Unit = {}
    ): CfnStorageLens.StorageLensGroupLevelProperty {
        val builder = CfnStorageLensStorageLensGroupLevelPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This resource indicates which Storage Lens group ARNs to include or exclude in the Storage
     * Lens group aggregation.
     *
     * You can only attach Storage Lens groups to your dashboard if they're included in your Storage
     * Lens group aggregation. If this value is left null, then all Storage Lens groups are
     * selected.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * StorageLensGroupSelectionCriteriaProperty storageLensGroupSelectionCriteriaProperty =
     * StorageLensGroupSelectionCriteriaProperty.builder()
     * .exclude(List.of("exclude"))
     * .include(List.of("include"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-storagelensgroupselectioncriteria.html)
     */
    public inline fun cfnStorageLensStorageLensGroupSelectionCriteriaProperty(
        block: CfnStorageLensStorageLensGroupSelectionCriteriaPropertyDsl.() -> Unit = {}
    ): CfnStorageLens.StorageLensGroupSelectionCriteriaProperty {
        val builder = CfnStorageLensStorageLensGroupSelectionCriteriaPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a cross-origin access rule for an Amazon S3 bucket.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * CorsRule corsRule = CorsRule.builder()
     * .allowedMethods(List.of(HttpMethods.GET))
     * .allowedOrigins(List.of("allowedOrigins"))
     * // the properties below are optional
     * .allowedHeaders(List.of("allowedHeaders"))
     * .exposedHeaders(List.of("exposedHeaders"))
     * .id("id")
     * .maxAge(123)
     * .build();
     * ```
     */
    public inline fun corsRule(block: CorsRuleDsl.() -> Unit = {}): CorsRule {
        val builder = CorsRuleDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The intelligent tiering configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.s3.*;
     * IntelligentTieringConfiguration intelligentTieringConfiguration =
     * IntelligentTieringConfiguration.builder()
     * .name("name")
     * // the properties below are optional
     * .archiveAccessTierTime(Duration.minutes(30))
     * .deepArchiveAccessTierTime(Duration.minutes(30))
     * .prefix("prefix")
     * .tags(List.of(Tag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     */
    public inline fun intelligentTieringConfiguration(
        block: IntelligentTieringConfigurationDsl.() -> Unit = {}
    ): IntelligentTieringConfiguration {
        val builder = IntelligentTieringConfigurationDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the inventory configuration of an S3 Bucket.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * Bucket bucket;
     * Inventory inventory = Inventory.builder()
     * .destination(InventoryDestination.builder()
     * .bucket(bucket)
     * // the properties below are optional
     * .bucketOwner("bucketOwner")
     * .prefix("prefix")
     * .build())
     * // the properties below are optional
     * .enabled(false)
     * .format(InventoryFormat.CSV)
     * .frequency(InventoryFrequency.DAILY)
     * .includeObjectVersions(InventoryObjectVersion.ALL)
     * .inventoryId("inventoryId")
     * .objectsPrefix("objectsPrefix")
     * .optionalFields(List.of("optionalFields"))
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-inventory.html)
     */
    public inline fun inventory(block: InventoryDsl.() -> Unit = {}): Inventory {
        val builder = InventoryDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The destination of the inventory.
     *
     * Example:
     * ```
     * Bucket inventoryBucket = new Bucket(this, "InventoryBucket");
     * Bucket dataBucket = Bucket.Builder.create(this, "DataBucket")
     * .inventories(List.of(Inventory.builder()
     * .frequency(InventoryFrequency.DAILY)
     * .includeObjectVersions(InventoryObjectVersion.CURRENT)
     * .destination(InventoryDestination.builder()
     * .bucket(inventoryBucket)
     * .build())
     * .build(), Inventory.builder()
     * .frequency(InventoryFrequency.WEEKLY)
     * .includeObjectVersions(InventoryObjectVersion.ALL)
     * .destination(InventoryDestination.builder()
     * .bucket(inventoryBucket)
     * .prefix("with-all-versions")
     * .build())
     * .build()))
     * .build();
     * ```
     */
    public inline fun inventoryDestination(
        block: InventoryDestinationDsl.() -> Unit = {}
    ): InventoryDestination {
        val builder = InventoryDestinationDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Declaration of a Life cycle rule.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.s3.*;
     * StorageClass storageClass;
     * Object tagFilters;
     * LifecycleRule lifecycleRule = LifecycleRule.builder()
     * .abortIncompleteMultipartUploadAfter(Duration.minutes(30))
     * .enabled(false)
     * .expiration(Duration.minutes(30))
     * .expirationDate(new Date())
     * .expiredObjectDeleteMarker(false)
     * .id("id")
     * .noncurrentVersionExpiration(Duration.minutes(30))
     * .noncurrentVersionsToRetain(123)
     * .noncurrentVersionTransitions(List.of(NoncurrentVersionTransition.builder()
     * .storageClass(storageClass)
     * .transitionAfter(Duration.minutes(30))
     * // the properties below are optional
     * .noncurrentVersionsToRetain(123)
     * .build()))
     * .objectSizeGreaterThan(123)
     * .objectSizeLessThan(123)
     * .prefix("prefix")
     * .tagFilters(Map.of(
     * "tagFiltersKey", tagFilters))
     * .transitions(List.of(Transition.builder()
     * .storageClass(storageClass)
     * // the properties below are optional
     * .transitionAfter(Duration.minutes(30))
     * .transitionDate(new Date())
     * .build()))
     * .build();
     * ```
     */
    public inline fun lifecycleRule(block: LifecycleRuleDsl.() -> Unit = {}): LifecycleRule {
        val builder = LifecycleRuleDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An interface that represents the location of a specific object in an S3 Bucket.
     *
     * Example:
     * ```
     * Stack lambdaStack = new Stack(app, "LambdaStack");
     * CfnParametersCode lambdaCode = Code.fromCfnParameters();
     * Function.Builder.create(lambdaStack, "Lambda")
     * .code(lambdaCode)
     * .handler("index.handler")
     * .runtime(Runtime.NODEJS_LATEST)
     * .build();
     * // other resources that your Lambda needs, added to the lambdaStack...
     * Stack pipelineStack = new Stack(app, "PipelineStack");
     * Pipeline pipeline = Pipeline.Builder.create(pipelineStack, "Pipeline")
     * .crossAccountKeys(true)
     * .build();
     * // add the source code repository containing this code to your Pipeline,
     * // and the source code of the Lambda Function, if they're separate
     * Artifact cdkSourceOutput = new Artifact();
     * CodeCommitSourceAction cdkSourceAction = CodeCommitSourceAction.Builder.create()
     * .repository(Repository.Builder.create(pipelineStack, "CdkCodeRepo")
     * .repositoryName("CdkCodeRepo")
     * .build())
     * .actionName("CdkCode_Source")
     * .output(cdkSourceOutput)
     * .build();
     * Artifact lambdaSourceOutput = new Artifact();
     * CodeCommitSourceAction lambdaSourceAction = CodeCommitSourceAction.Builder.create()
     * .repository(Repository.Builder.create(pipelineStack, "LambdaCodeRepo")
     * .repositoryName("LambdaCodeRepo")
     * .build())
     * .actionName("LambdaCode_Source")
     * .output(lambdaSourceOutput)
     * .build();
     * pipeline.addStage(StageOptions.builder()
     * .stageName("Source")
     * .actions(List.of(cdkSourceAction, lambdaSourceAction))
     * .build());
     * // synthesize the Lambda CDK template, using CodeBuild
     * // the below values are just examples, assuming your CDK code is in TypeScript/JavaScript -
     * // adjust the build environment and/or commands accordingly
     * Project cdkBuildProject = Project.Builder.create(pipelineStack, "CdkBuildProject")
     * .environment(BuildEnvironment.builder()
     * .buildImage(LinuxBuildImage.STANDARD_7_0)
     * .build())
     * .buildSpec(BuildSpec.fromObject(Map.of(
     * "version", "0.2",
     * "phases", Map.of(
     * "install", Map.of(
     * "commands", "npm install"),
     * "build", Map.of(
     * "commands", List.of("npm run build", "npm run cdk synth LambdaStack -- -o ."))),
     * "artifacts", Map.of(
     * "files", "LambdaStack.template.yaml"))))
     * .build();
     * Artifact cdkBuildOutput = new Artifact();
     * CodeBuildAction cdkBuildAction = CodeBuildAction.Builder.create()
     * .actionName("CDK_Build")
     * .project(cdkBuildProject)
     * .input(cdkSourceOutput)
     * .outputs(List.of(cdkBuildOutput))
     * .build();
     * // build your Lambda code, using CodeBuild
     * // again, this example assumes your Lambda is written in TypeScript/JavaScript -
     * // make sure to adjust the build environment and/or commands if they don't match your specific
     * situation
     * Project lambdaBuildProject = Project.Builder.create(pipelineStack, "LambdaBuildProject")
     * .environment(BuildEnvironment.builder()
     * .buildImage(LinuxBuildImage.STANDARD_7_0)
     * .build())
     * .buildSpec(BuildSpec.fromObject(Map.of(
     * "version", "0.2",
     * "phases", Map.of(
     * "install", Map.of(
     * "commands", "npm install"),
     * "build", Map.of(
     * "commands", "npm run build")),
     * "artifacts", Map.of(
     * "files", List.of("index.js", "node_modules/ **&#47;*")))))
     * .build();
     * Artifact lambdaBuildOutput = new Artifact();
     * CodeBuildAction lambdaBuildAction = CodeBuildAction.Builder.create()
     * .actionName("Lambda_Build")
     * .project(lambdaBuildProject)
     * .input(lambdaSourceOutput)
     * .outputs(List.of(lambdaBuildOutput))
     * .build();
     * pipeline.addStage(StageOptions.builder()
     * .stageName("Build")
     * .actions(List.of(cdkBuildAction, lambdaBuildAction))
     * .build());
     * // finally, deploy your Lambda Stack
     * pipeline.addStage(StageOptions.builder()
     * .stageName("Deploy")
     * .actions(List.of(
     * CloudFormationCreateUpdateStackAction.Builder.create()
     * .actionName("Lambda_CFN_Deploy")
     * .templatePath(cdkBuildOutput.atPath("LambdaStack.template.yaml"))
     * .stackName("LambdaStackDeployedName")
     * .adminPermissions(true)
     * .parameterOverrides(lambdaCode.assign(lambdaBuildOutput.getS3Location()))
     * .extraInputs(List.of(lambdaBuildOutput))
     * .build()))
     * .build());
     * ```
     */
    public inline fun location(block: LocationDsl.() -> Unit = {}): Location {
        val builder = LocationDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes when noncurrent versions transition to a specified storage class.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.s3.*;
     * StorageClass storageClass;
     * NoncurrentVersionTransition noncurrentVersionTransition = NoncurrentVersionTransition.builder()
     * .storageClass(storageClass)
     * .transitionAfter(Duration.minutes(30))
     * // the properties below are optional
     * .noncurrentVersionsToRetain(123)
     * .build();
     * ```
     */
    public inline fun noncurrentVersionTransition(
        block: NoncurrentVersionTransitionDsl.() -> Unit = {}
    ): NoncurrentVersionTransition {
        val builder = NoncurrentVersionTransitionDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * Queue myQueue;
     * Bucket bucket = new Bucket(this, "MyBucket");
     * bucket.addEventNotification(EventType.OBJECT_REMOVED, new SqsDestination(myQueue),
     * NotificationKeyFilter.builder()
     * .prefix("foo/")
     * .suffix(".jpg")
     * .build());
     * ```
     */
    public inline fun notificationKeyFilter(
        block: NotificationKeyFilterDsl.() -> Unit = {}
    ): NotificationKeyFilter {
        val builder = NotificationKeyFilterDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for the onCloudTrailPutObject method.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * import software.amazon.awscdk.services.s3.*;
     * import software.constructs.*;
     * Construct construct;
     * Object detail;
     * IRuleTarget ruleTarget;
     * OnCloudTrailBucketEventOptions onCloudTrailBucketEventOptions =
     * OnCloudTrailBucketEventOptions.builder()
     * .crossStackScope(construct)
     * .description("description")
     * .eventPattern(EventPattern.builder()
     * .account(List.of("account"))
     * .detail(Map.of(
     * "detailKey", detail))
     * .detailType(List.of("detailType"))
     * .id(List.of("id"))
     * .region(List.of("region"))
     * .resources(List.of("resources"))
     * .source(List.of("source"))
     * .time(List.of("time"))
     * .version(List.of("version"))
     * .build())
     * .paths(List.of("paths"))
     * .ruleName("ruleName")
     * .target(ruleTarget)
     * .build();
     * ```
     */
    public inline fun onCloudTrailBucketEventOptions(
        block: OnCloudTrailBucketEventOptionsDsl.() -> Unit = {}
    ): OnCloudTrailBucketEventOptions {
        val builder = OnCloudTrailBucketEventOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a redirect behavior of all requests to a website endpoint of a bucket.
     *
     * Example:
     * ```
     * Bucket bucket = Bucket.Builder.create(this, "MyRedirectedBucket")
     * .websiteRedirect(RedirectTarget.builder().hostName("www.example.com").build())
     * .build();
     * ```
     */
    public inline fun redirectTarget(block: RedirectTargetDsl.() -> Unit = {}): RedirectTarget {
        val builder = RedirectTargetDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Rule that define when a redirect is applied and the redirect behavior.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * ReplaceKey replaceKey;
     * RoutingRule routingRule = RoutingRule.builder()
     * .condition(RoutingRuleCondition.builder()
     * .httpErrorCodeReturnedEquals("httpErrorCodeReturnedEquals")
     * .keyPrefixEquals("keyPrefixEquals")
     * .build())
     * .hostName("hostName")
     * .httpRedirectCode("httpRedirectCode")
     * .protocol(RedirectProtocol.HTTP)
     * .replaceKey(replaceKey)
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html)
     */
    public inline fun routingRule(block: RoutingRuleDsl.() -> Unit = {}): RoutingRule {
        val builder = RoutingRuleDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * Bucket bucket = Bucket.Builder.create(this, "MyRedirectedBucket")
     * .websiteRoutingRules(List.of(RoutingRule.builder()
     * .hostName("www.example.com")
     * .httpRedirectCode("302")
     * .protocol(RedirectProtocol.HTTPS)
     * .replaceKey(ReplaceKey.prefixWith("test/"))
     * .condition(RoutingRuleCondition.builder()
     * .httpErrorCodeReturnedEquals("200")
     * .keyPrefixEquals("prefix")
     * .build())
     * .build()))
     * .build();
     * ```
     */
    public inline fun routingRuleCondition(
        block: RoutingRuleConditionDsl.() -> Unit = {}
    ): RoutingRuleCondition {
        val builder = RoutingRuleConditionDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Tag.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * Tag tag = Tag.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     */
    public inline fun tag(block: TagDsl.() -> Unit = {}): Tag {
        val builder = TagDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for creating a Transfer Acceleration URL.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * TransferAccelerationUrlOptions transferAccelerationUrlOptions =
     * TransferAccelerationUrlOptions.builder()
     * .dualStack(false)
     * .build();
     * ```
     */
    public inline fun transferAccelerationUrlOptions(
        block: TransferAccelerationUrlOptionsDsl.() -> Unit = {}
    ): TransferAccelerationUrlOptions {
        val builder = TransferAccelerationUrlOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes when an object transitions to a specified storage class.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.s3.*;
     * StorageClass storageClass;
     * Transition transition = Transition.builder()
     * .storageClass(storageClass)
     * // the properties below are optional
     * .transitionAfter(Duration.minutes(30))
     * .transitionDate(new Date())
     * .build();
     * ```
     */
    public inline fun transition(block: TransitionDsl.() -> Unit = {}): Transition {
        val builder = TransitionDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for creating Virtual-Hosted style URL.
     *
     * Example:
     * ```
     * Bucket bucket = new Bucket(this, "MyBucket");
     * bucket.urlForObject("objectname"); // Path-Style URL
     * bucket.virtualHostedUrlForObject("objectname"); // Virtual Hosted-Style URL
     * bucket.virtualHostedUrlForObject("objectname",
     * VirtualHostedStyleUrlOptions.builder().regional(false).build());
     * ```
     */
    public inline fun virtualHostedStyleUrlOptions(
        block: VirtualHostedStyleUrlOptionsDsl.() -> Unit = {}
    ): VirtualHostedStyleUrlOptions {
        val builder = VirtualHostedStyleUrlOptionsDsl()
        builder.apply(block)
        return builder.build()
    }
}
