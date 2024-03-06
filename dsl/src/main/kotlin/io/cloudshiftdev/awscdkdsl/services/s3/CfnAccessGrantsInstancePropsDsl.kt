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
import software.amazon.awscdk.services.s3.CfnAccessGrantsInstanceProps

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
@CdkDslMarker
public class CfnAccessGrantsInstancePropsDsl {
    private val cdkBuilder: CfnAccessGrantsInstanceProps.Builder =
        CfnAccessGrantsInstanceProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param identityCenterArn If you would like to associate your S3 Access Grants instance with
     *   an AWS IAM Identity Center instance, use this field to pass the Amazon Resource Name (ARN)
     *   of the AWS IAM Identity Center instance that you are associating with your S3 Access Grants
     *   instance. An IAM Identity Center instance is your corporate identity directory that you
     *   added to the IAM Identity Center.
     */
    public fun identityCenterArn(identityCenterArn: String) {
        cdkBuilder.identityCenterArn(identityCenterArn)
    }

    /**
     * @param tags The AWS resource tags that you are adding to the S3 Access Grants instance. Each
     *   tag is a label consisting of a user-defined key and value. Tags can help you manage,
     *   identify, organize, search for, and filter resources.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags The AWS resource tags that you are adding to the S3 Access Grants instance. Each
     *   tag is a label consisting of a user-defined key and value. Tags can help you manage,
     *   identify, organize, search for, and filter resources.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnAccessGrantsInstanceProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
