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

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnAccessPoint
import software.constructs.Construct

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
@CdkDslMarker
public class CfnAccessPointDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnAccessPoint.Builder = CfnAccessPoint.Builder.create(scope, id)

    /**
     * The name of the bucket associated with this access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-bucket)
     *
     * @param bucket The name of the bucket associated with this access point.
     */
    public fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
    }

    /**
     * The AWS account ID associated with the S3 bucket associated with this access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-bucketaccountid)
     *
     * @param bucketAccountId The AWS account ID associated with the S3 bucket associated with this
     *   access point.
     */
    public fun bucketAccountId(bucketAccountId: String) {
        cdkBuilder.bucketAccountId(bucketAccountId)
    }

    /**
     * The name of this access point.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique ID and uses that ID for
     * the access point name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-name)
     *
     * @param name The name of this access point.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The access point policy associated with this access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-policy)
     *
     * @param policy The access point policy associated with this access point.
     */
    public fun policy(policy: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(policy)
        cdkBuilder.policy(builder.map)
    }

    /**
     * The access point policy associated with this access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-policy)
     *
     * @param policy The access point policy associated with this access point.
     */
    public fun policy(policy: Any) {
        cdkBuilder.policy(policy)
    }

    /**
     * The PublicAccessBlock configuration that you want to apply to this Amazon S3 bucket.
     *
     * You can enable the configuration options in any combination. For more information about when
     * Amazon S3 considers a bucket or object public, see
     * [The Meaning of "Public"](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status)
     * in the *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-publicaccessblockconfiguration)
     *
     * @param publicAccessBlockConfiguration The PublicAccessBlock configuration that you want to
     *   apply to this Amazon S3 bucket.
     */
    public fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: IResolvable) {
        cdkBuilder.publicAccessBlockConfiguration(publicAccessBlockConfiguration)
    }

    /**
     * The PublicAccessBlock configuration that you want to apply to this Amazon S3 bucket.
     *
     * You can enable the configuration options in any combination. For more information about when
     * Amazon S3 considers a bucket or object public, see
     * [The Meaning of "Public"](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status)
     * in the *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-publicaccessblockconfiguration)
     *
     * @param publicAccessBlockConfiguration The PublicAccessBlock configuration that you want to
     *   apply to this Amazon S3 bucket.
     */
    public fun publicAccessBlockConfiguration(
        publicAccessBlockConfiguration: CfnAccessPoint.PublicAccessBlockConfigurationProperty
    ) {
        cdkBuilder.publicAccessBlockConfiguration(publicAccessBlockConfiguration)
    }

    /**
     * The Virtual Private Cloud (VPC) configuration for this access point, if one exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-vpcconfiguration)
     *
     * @param vpcConfiguration The Virtual Private Cloud (VPC) configuration for this access point,
     *   if one exists.
     */
    public fun vpcConfiguration(vpcConfiguration: IResolvable) {
        cdkBuilder.vpcConfiguration(vpcConfiguration)
    }

    /**
     * The Virtual Private Cloud (VPC) configuration for this access point, if one exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-vpcconfiguration)
     *
     * @param vpcConfiguration The Virtual Private Cloud (VPC) configuration for this access point,
     *   if one exists.
     */
    public fun vpcConfiguration(vpcConfiguration: CfnAccessPoint.VpcConfigurationProperty) {
        cdkBuilder.vpcConfiguration(vpcConfiguration)
    }

    public fun build(): CfnAccessPoint = cdkBuilder.build()
}
