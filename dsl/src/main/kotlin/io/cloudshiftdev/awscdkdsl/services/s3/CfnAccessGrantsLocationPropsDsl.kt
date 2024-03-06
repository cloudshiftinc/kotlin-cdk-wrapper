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
import software.amazon.awscdk.services.s3.CfnAccessGrantsLocationProps

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
@CdkDslMarker
public class CfnAccessGrantsLocationPropsDsl {
    private val cdkBuilder: CfnAccessGrantsLocationProps.Builder =
        CfnAccessGrantsLocationProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param iamRoleArn The Amazon Resource Name (ARN) of the IAM role for the registered location.
     *   S3 Access Grants assumes this role to manage access to the registered location.
     */
    public fun iamRoleArn(iamRoleArn: String) {
        cdkBuilder.iamRoleArn(iamRoleArn)
    }

    /**
     * @param locationScope The S3 URI path to the location that you are registering. The location
     *   scope can be the default S3 location `s3://` , the S3 path to a bucket, or the S3 path to a
     *   bucket and prefix. A prefix in S3 is a string of characters at the beginning of an object
     *   key name used to organize the objects that you store in your S3 buckets. For example,
     *   object key names that start with the `engineering/` prefix or object key names that start
     *   with the `marketing/campaigns/` prefix.
     */
    public fun locationScope(locationScope: String) {
        cdkBuilder.locationScope(locationScope)
    }

    /**
     * @param tags The AWS resource tags that you are adding to the S3 Access Grants location. Each
     *   tag is a label consisting of a user-defined key and value. Tags can help you manage,
     *   identify, organize, search for, and filter resources.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags The AWS resource tags that you are adding to the S3 Access Grants location. Each
     *   tag is a label consisting of a user-defined key and value. Tags can help you manage,
     *   identify, organize, search for, and filter resources.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnAccessGrantsLocationProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
