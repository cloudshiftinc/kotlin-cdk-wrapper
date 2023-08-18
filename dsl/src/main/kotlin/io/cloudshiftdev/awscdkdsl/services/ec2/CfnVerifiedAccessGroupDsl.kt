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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroup
import software.constructs.Construct

/**
 * Describes a Verified Access group.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnVerifiedAccessGroup cfnVerifiedAccessGroup = CfnVerifiedAccessGroup.Builder.create(this,
 * "MyCfnVerifiedAccessGroup")
 * .verifiedAccessInstanceId("verifiedAccessInstanceId")
 * // the properties below are optional
 * .description("description")
 * .policyDocument("policyDocument")
 * .policyEnabled(false)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessgroup.html)
 */
@CdkDslMarker
public class CfnVerifiedAccessGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnVerifiedAccessGroup.Builder =
        CfnVerifiedAccessGroup.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * A description for the AWS Verified Access group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessgroup.html#cfn-ec2-verifiedaccessgroup-description)
     *
     * @param description A description for the AWS Verified Access group.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The Verified Access policy document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessgroup.html#cfn-ec2-verifiedaccessgroup-policydocument)
     *
     * @param policyDocument The Verified Access policy document.
     */
    public fun policyDocument(policyDocument: String) {
        cdkBuilder.policyDocument(policyDocument)
    }

    /**
     * The status of the Verified Access policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessgroup.html#cfn-ec2-verifiedaccessgroup-policyenabled)
     *
     * @param policyEnabled The status of the Verified Access policy.
     */
    public fun policyEnabled(policyEnabled: Boolean) {
        cdkBuilder.policyEnabled(policyEnabled)
    }

    /**
     * The status of the Verified Access policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessgroup.html#cfn-ec2-verifiedaccessgroup-policyenabled)
     *
     * @param policyEnabled The status of the Verified Access policy.
     */
    public fun policyEnabled(policyEnabled: IResolvable) {
        cdkBuilder.policyEnabled(policyEnabled)
    }

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessgroup.html#cfn-ec2-verifiedaccessgroup-tags)
     *
     * @param tags The tags.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessgroup.html#cfn-ec2-verifiedaccessgroup-tags)
     *
     * @param tags The tags.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The ID of the AWS Verified Access instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessgroup.html#cfn-ec2-verifiedaccessgroup-verifiedaccessinstanceid)
     *
     * @param verifiedAccessInstanceId The ID of the AWS Verified Access instance.
     */
    public fun verifiedAccessInstanceId(verifiedAccessInstanceId: String) {
        cdkBuilder.verifiedAccessInstanceId(verifiedAccessInstanceId)
    }

    public fun build(): CfnVerifiedAccessGroup {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
