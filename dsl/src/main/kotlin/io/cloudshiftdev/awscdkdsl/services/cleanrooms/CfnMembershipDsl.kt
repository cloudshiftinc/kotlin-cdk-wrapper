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

package io.cloudshiftdev.awscdkdsl.services.cleanrooms

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cleanrooms.CfnMembership
import software.constructs.Construct

/**
 * Creates a membership for a specific collaboration identifier and joins the collaboration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cleanrooms.*;
 * CfnMembership cfnMembership = CfnMembership.Builder.create(this, "MyCfnMembership")
 * .collaborationIdentifier("collaborationIdentifier")
 * .queryLogStatus("queryLogStatus")
 * // the properties below are optional
 * .defaultResultConfiguration(MembershipProtectedQueryResultConfigurationProperty.builder()
 * .outputConfiguration(MembershipProtectedQueryOutputConfigurationProperty.builder()
 * .s3(ProtectedQueryS3OutputConfigurationProperty.builder()
 * .bucket("bucket")
 * .resultFormat("resultFormat")
 * // the properties below are optional
 * .keyPrefix("keyPrefix")
 * .build())
 * .build())
 * // the properties below are optional
 * .roleArn("roleArn")
 * .build())
 * .paymentConfiguration(MembershipPaymentConfigurationProperty.builder()
 * .queryCompute(MembershipQueryComputePaymentConfigProperty.builder()
 * .isResponsible(false)
 * .build())
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html)
 */
@CdkDslMarker
public class CfnMembershipDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnMembership.Builder = CfnMembership.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The unique ID for the associated collaboration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-collaborationidentifier)
     *
     * @param collaborationIdentifier The unique ID for the associated collaboration.
     */
    public fun collaborationIdentifier(collaborationIdentifier: String) {
        cdkBuilder.collaborationIdentifier(collaborationIdentifier)
    }

    /**
     * The default protected query result configuration as specified by the member who can receive
     * results.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-defaultresultconfiguration)
     *
     * @param defaultResultConfiguration The default protected query result configuration as
     *   specified by the member who can receive results.
     */
    public fun defaultResultConfiguration(defaultResultConfiguration: IResolvable) {
        cdkBuilder.defaultResultConfiguration(defaultResultConfiguration)
    }

    /**
     * The default protected query result configuration as specified by the member who can receive
     * results.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-defaultresultconfiguration)
     *
     * @param defaultResultConfiguration The default protected query result configuration as
     *   specified by the member who can receive results.
     */
    public fun defaultResultConfiguration(
        defaultResultConfiguration:
            CfnMembership.MembershipProtectedQueryResultConfigurationProperty
    ) {
        cdkBuilder.defaultResultConfiguration(defaultResultConfiguration)
    }

    /**
     * The payment responsibilities accepted by the collaboration member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-paymentconfiguration)
     *
     * @param paymentConfiguration The payment responsibilities accepted by the collaboration
     *   member.
     */
    public fun paymentConfiguration(paymentConfiguration: IResolvable) {
        cdkBuilder.paymentConfiguration(paymentConfiguration)
    }

    /**
     * The payment responsibilities accepted by the collaboration member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-paymentconfiguration)
     *
     * @param paymentConfiguration The payment responsibilities accepted by the collaboration
     *   member.
     */
    public fun paymentConfiguration(
        paymentConfiguration: CfnMembership.MembershipPaymentConfigurationProperty
    ) {
        cdkBuilder.paymentConfiguration(paymentConfiguration)
    }

    /**
     * An indicator as to whether query logging has been enabled or disabled for the membership.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-querylogstatus)
     *
     * @param queryLogStatus An indicator as to whether query logging has been enabled or disabled
     *   for the membership.
     */
    public fun queryLogStatus(queryLogStatus: String) {
        cdkBuilder.queryLogStatus(queryLogStatus)
    }

    /**
     * An optional label that you can assign to a resource when you create it.
     *
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-tags)
     *
     * @param tags An optional label that you can assign to a resource when you create it.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An optional label that you can assign to a resource when you create it.
     *
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-tags)
     *
     * @param tags An optional label that you can assign to a resource when you create it.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnMembership {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
