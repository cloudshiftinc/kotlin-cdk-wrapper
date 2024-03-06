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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.s3.CfnAccessGrantsLocation
import software.constructs.Construct

/**
 * The `AWS::S3::AccessGrantsLocation` resource creates the S3 data location that you would like to
 * register in your S3 Access Grants instance.
 *
 * Your S3 data must be in the same Region as your S3 Access Grants instance. The location can be
 * one of the following:
 * * The default S3 location `s3://`
 * * A bucket - `S3://&lt;bucket-name&gt;`
 * * A bucket and prefix - `S3://&lt;bucket-name&gt;/&lt;prefix&gt;`
 *
 * When you register a location, you must include the IAM role that has permission to manage the S3
 * location that you are registering. Give S3 Access Grants permission to assume this role
 * [using a policy](https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-grants-location.html)
 * . S3 Access Grants assumes this role to manage access to the location and to vend temporary
 * credentials to grantees or client applications.
 * * **Permissions** - You must have the `s3:CreateAccessGrantsLocation` permission to use this
 *   resource.
 * * **Additional Permissions** - You must also have the following permission for the specified IAM
 *   role: `iam:PassRole`
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
@CdkDslMarker
public class CfnAccessGrantsLocationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnAccessGrantsLocation.Builder =
        CfnAccessGrantsLocation.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The Amazon Resource Name (ARN) of the IAM role for the registered location.
     *
     * S3 Access Grants assumes this role to manage access to the registered location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrantslocation.html#cfn-s3-accessgrantslocation-iamrolearn)
     *
     * @param iamRoleArn The Amazon Resource Name (ARN) of the IAM role for the registered location.
     */
    public fun iamRoleArn(iamRoleArn: String) {
        cdkBuilder.iamRoleArn(iamRoleArn)
    }

    /**
     * The S3 URI path to the location that you are registering.
     *
     * The location scope can be the default S3 location `s3://` , the S3 path to a bucket, or the
     * S3 path to a bucket and prefix. A prefix in S3 is a string of characters at the beginning of
     * an object key name used to organize the objects that you store in your S3 buckets. For
     * example, object key names that start with the `engineering/` prefix or object key names that
     * start with the `marketing/campaigns/` prefix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrantslocation.html#cfn-s3-accessgrantslocation-locationscope)
     *
     * @param locationScope The S3 URI path to the location that you are registering.
     */
    public fun locationScope(locationScope: String) {
        cdkBuilder.locationScope(locationScope)
    }

    /**
     * The AWS resource tags that you are adding to the S3 Access Grants location.
     *
     * Each tag is a label consisting of a user-defined key and value. Tags can help you manage,
     * identify, organize, search for, and filter resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrantslocation.html#cfn-s3-accessgrantslocation-tags)
     *
     * @param tags The AWS resource tags that you are adding to the S3 Access Grants location.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The AWS resource tags that you are adding to the S3 Access Grants location.
     *
     * Each tag is a label consisting of a user-defined key and value. Tags can help you manage,
     * identify, organize, search for, and filter resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrantslocation.html#cfn-s3-accessgrantslocation-tags)
     *
     * @param tags The AWS resource tags that you are adding to the S3 Access Grants location.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnAccessGrantsLocation {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
