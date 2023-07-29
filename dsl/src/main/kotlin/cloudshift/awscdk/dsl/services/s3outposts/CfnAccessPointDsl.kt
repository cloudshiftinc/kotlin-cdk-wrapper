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

package cloudshift.awscdk.dsl.services.s3outposts

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3outposts.CfnAccessPoint
import software.constructs.Construct

/**
 * The AWS::S3Outposts::AccessPoint resource specifies an access point and associates it with the
 * specified Amazon S3 on Outposts bucket.
 *
 * For more information, see
 * [Managing data access with Amazon S3 access points](https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-points.html)
 * .
 *
 * S3 on Outposts supports only VPC-style access points.
 *
 * Example:
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
@CdkDslMarker
public class CfnAccessPointDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnAccessPoint.Builder = CfnAccessPoint.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the S3 on Outposts bucket that is associated with this
     * access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-accesspoint.html#cfn-s3outposts-accesspoint-bucket)
     *
     * @param bucket The Amazon Resource Name (ARN) of the S3 on Outposts bucket that is associated
     *   with this access point.
     */
    public fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
    }

    /**
     * The name of this access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-accesspoint.html#cfn-s3outposts-accesspoint-name)
     *
     * @param name The name of this access point.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The access point policy associated with this access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-accesspoint.html#cfn-s3outposts-accesspoint-policy)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-accesspoint.html#cfn-s3outposts-accesspoint-policy)
     *
     * @param policy The access point policy associated with this access point.
     */
    public fun policy(policy: Any) {
        cdkBuilder.policy(policy)
    }

    /**
     * The virtual private cloud (VPC) configuration for this access point, if one exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-accesspoint.html#cfn-s3outposts-accesspoint-vpcconfiguration)
     *
     * @param vpcConfiguration The virtual private cloud (VPC) configuration for this access point,
     *   if one exists.
     */
    public fun vpcConfiguration(vpcConfiguration: IResolvable) {
        cdkBuilder.vpcConfiguration(vpcConfiguration)
    }

    /**
     * The virtual private cloud (VPC) configuration for this access point, if one exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-accesspoint.html#cfn-s3outposts-accesspoint-vpcconfiguration)
     *
     * @param vpcConfiguration The virtual private cloud (VPC) configuration for this access point,
     *   if one exists.
     */
    public fun vpcConfiguration(vpcConfiguration: CfnAccessPoint.VpcConfigurationProperty) {
        cdkBuilder.vpcConfiguration(vpcConfiguration)
    }

    public fun build(): CfnAccessPoint = cdkBuilder.build()
}
