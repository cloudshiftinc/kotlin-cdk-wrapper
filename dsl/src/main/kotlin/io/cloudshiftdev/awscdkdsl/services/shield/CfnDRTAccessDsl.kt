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

package io.cloudshiftdev.awscdkdsl.services.shield

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.shield.CfnDRTAccess
import software.constructs.Construct

/**
 * Provides permissions for the AWS Shield Advanced Shield response team (SRT) to access your
 * account and your resource protections, to help you mitigate potential distributed denial of
 * service (DDoS) attacks.
 *
 * *Configure `AWS::Shield::DRTAccess` for one account*
 *
 * To configure this resource through AWS CloudFormation , you must be subscribed to AWS Shield
 * Advanced . You can subscribe through the
 * [Shield Advanced console](https://docs.aws.amazon.com/wafv2/shieldv2#/) and through the APIs. For
 * more information, see
 * [Subscribe to AWS Shield Advanced](https://docs.aws.amazon.com/waf/latest/developerguide/enable-ddos-prem.html)
 * .
 *
 * See example templates for Shield Advanced in AWS CloudFormation at
 * [aws-samples/aws-shield-advanced-examples](https://docs.aws.amazon.com/https://github.com/aws-samples/aws-shield-advanced-examples)
 * .
 *
 * *Configure Shield Advanced using AWS CloudFormation and AWS Firewall Manager*
 *
 * You might be able to use Firewall Manager with AWS CloudFormation to configure Shield Advanced
 * across multiple accounts and protected resources. To do this, your accounts must be part of an
 * organization in AWS Organizations . You can use Firewall Manager to configure Shield Advanced
 * protections for any resource types except for Amazon Route 53 or AWS Global Accelerator .
 *
 * For an example of this, see the one-click configuration guidance published by the AWS technical
 * community at
 * [One-click deployment of Shield Advanced](https://docs.aws.amazon.com/https://youtu.be/LCA3FwMk_QE)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.shield.*;
 * CfnDRTAccess cfnDRTAccess = CfnDRTAccess.Builder.create(this, "MyCfnDRTAccess")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .logBucketList(List.of("logBucketList"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-drtaccess.html)
 */
@CdkDslMarker
public class CfnDRTAccessDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDRTAccess.Builder = CfnDRTAccess.Builder.create(scope, id)

    private val _logBucketList: MutableList<String> = mutableListOf()

    /**
     * Authorizes the Shield Response Team (SRT) to access the specified Amazon S3 bucket containing
     * log data such as Application Load Balancer access logs, CloudFront logs, or logs from third
     * party sources.
     *
     * You can associate up to 10 Amazon S3 buckets with your subscription.
     *
     * Use this to share information with the SRT that's not available in AWS WAF logs.
     *
     * To use the services of the SRT, you must be subscribed to the
     * [Business Support plan](https://docs.aws.amazon.com/premiumsupport/business-support/) or the
     * [Enterprise Support plan](https://docs.aws.amazon.com/premiumsupport/enterprise-support/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-drtaccess.html#cfn-shield-drtaccess-logbucketlist)
     *
     * @param logBucketList Authorizes the Shield Response Team (SRT) to access the specified Amazon
     *   S3 bucket containing log data such as Application Load Balancer access logs, CloudFront
     *   logs, or logs from third party sources.
     */
    public fun logBucketList(vararg logBucketList: String) {
        _logBucketList.addAll(listOf(*logBucketList))
    }

    /**
     * Authorizes the Shield Response Team (SRT) to access the specified Amazon S3 bucket containing
     * log data such as Application Load Balancer access logs, CloudFront logs, or logs from third
     * party sources.
     *
     * You can associate up to 10 Amazon S3 buckets with your subscription.
     *
     * Use this to share information with the SRT that's not available in AWS WAF logs.
     *
     * To use the services of the SRT, you must be subscribed to the
     * [Business Support plan](https://docs.aws.amazon.com/premiumsupport/business-support/) or the
     * [Enterprise Support plan](https://docs.aws.amazon.com/premiumsupport/enterprise-support/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-drtaccess.html#cfn-shield-drtaccess-logbucketlist)
     *
     * @param logBucketList Authorizes the Shield Response Team (SRT) to access the specified Amazon
     *   S3 bucket containing log data such as Application Load Balancer access logs, CloudFront
     *   logs, or logs from third party sources.
     */
    public fun logBucketList(logBucketList: Collection<String>) {
        _logBucketList.addAll(logBucketList)
    }

    /**
     * Authorizes the Shield Response Team (SRT) using the specified role, to access your AWS
     * account to assist with DDoS attack mitigation during potential attacks.
     *
     * This enables the SRT to inspect your AWS WAF configuration and logs and to create or update
     * AWS WAF rules and web ACLs.
     *
     * You can associate only one `RoleArn` with your subscription. If you submit this update for an
     * account that already has an associated role, the new `RoleArn` will replace the existing
     * `RoleArn` .
     *
     * This change requires the following:
     * * You must be subscribed to the
     *   [Business Support plan](https://docs.aws.amazon.com/premiumsupport/business-support/) or
     *   the
     *   [Enterprise Support plan](https://docs.aws.amazon.com/premiumsupport/enterprise-support/) .
     * * You must have the `iam:PassRole` permission. For more information, see
     *   [Granting a user permissions to pass a role to an AWS service](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_passrole.html)
     *   .
     * * The `AWSShieldDRTAccessPolicy` managed policy must be attached to the role that you specify
     *   in the request. You can access this policy in the IAM console at
     *   [AWSShieldDRTAccessPolicy](https://docs.aws.amazon.com/iam/home?#/policies/arn:aws:iam::aws:policy/service-role/AWSShieldDRTAccessPolicy)
     *   . For information, see
     *   [Adding and removing IAM identity permissions](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_manage-attach-detach.html)
     *   .
     * * The role must trust the service principal `drt.shield.amazonaws.com` . For information, see
     *   [IAM JSON policy elements: Principal](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html)
     *   .
     *
     * The SRT will have access only to your AWS WAF and Shield resources. By submitting this
     * request, you provide permissions to the SRT to inspect your AWS WAF and Shield configuration
     * and logs, and to create and update AWS WAF rules and web ACLs on your behalf. The SRT takes
     * these actions only if explicitly authorized by you.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-drtaccess.html#cfn-shield-drtaccess-rolearn)
     *
     * @param roleArn Authorizes the Shield Response Team (SRT) using the specified role, to access
     *   your AWS account to assist with DDoS attack mitigation during potential attacks.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnDRTAccess {
        if (_logBucketList.isNotEmpty()) cdkBuilder.logBucketList(_logBucketList)
        return cdkBuilder.build()
    }
}
