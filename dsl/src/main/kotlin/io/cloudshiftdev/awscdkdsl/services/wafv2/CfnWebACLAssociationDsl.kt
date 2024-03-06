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

package io.cloudshiftdev.awscdkdsl.services.wafv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.wafv2.CfnWebACLAssociation
import software.constructs.Construct

/**
 * This is the latest version of *AWS WAF* , named AWS WAF V2, released in November, 2019.
 *
 * For information, including how to migrate your AWS WAF resources from the prior release, see the
 * [AWS WAF developer guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html)
 * .
 *
 * Use a web ACL association to define an association between a web ACL and a regional application
 * resource, to protect the resource. A regional application can be an Application Load Balancer
 * (ALB), an Amazon API Gateway REST API, an AWS AppSync GraphQL API, an Amazon Cognito user pool,
 * an AWS App Runner service, or an AWS Verified Access instance.
 *
 * For Amazon CloudFront , don't use this resource. Instead, use your CloudFront distribution
 * configuration. To associate a web ACL with a distribution, provide the Amazon Resource Name (ARN)
 * of the `WebACL` to your CloudFront distribution configuration. To disassociate a web ACL, provide
 * an empty ARN. For information, see
 * [AWS::CloudFront::Distribution](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distribution.html)
 * .
 *
 * *Required permissions for customer-managed IAM policies*
 *
 * This call requires permissions that are specific to the protected resource type. For details, see
 * [Permissions for AssociateWebACL](https://docs.aws.amazon.com/waf/latest/developerguide/security_iam_service-with-iam.html#security_iam_action-AssociateWebACL)
 * in the *AWS WAF Developer Guide* .
 *
 * *Temporary inconsistencies during updates*
 *
 * When you create or change a web ACL or other AWS WAF resources, the changes take a small amount
 * of time to propagate to all areas where the resources are stored. The propagation time can be
 * from a few seconds to a number of minutes.
 *
 * The following are examples of the temporary inconsistencies that you might notice during change
 * propagation:
 * * After you create a web ACL, if you try to associate it with a resource, you might get an
 *   exception indicating that the web ACL is unavailable.
 * * After you add a rule group to a web ACL, the new rule group rules might be in effect in one
 *   area where the web ACL is used and not in another.
 * * After you change a rule action setting, you might see the old action in some places and the new
 *   action in others.
 * * After you add an IP address to an IP set that is in use in a blocking rule, the new address
 *   might be blocked in one area while still allowed in another.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * CfnWebACLAssociation cfnWebACLAssociation = CfnWebACLAssociation.Builder.create(this,
 * "MyCfnWebACLAssociation")
 * .resourceArn("resourceArn")
 * .webAclArn("webAclArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webaclassociation.html)
 */
@CdkDslMarker
public class CfnWebACLAssociationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnWebACLAssociation.Builder =
        CfnWebACLAssociation.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the resource to associate with the web ACL.
     *
     * The ARN must be in one of the following formats:
     * * For an Application Load Balancer: `arn: *partition* :elasticloadbalancing: *region* :
     *   *account-id* :loadbalancer/app/ *load-balancer-name* / *load-balancer-id*`
     * * For an Amazon API Gateway REST API: `arn: *partition* :apigateway: *region* ::/restapis/
     *   *api-id* /stages/ *stage-name*`
     * * For an AWS AppSync GraphQL API: `arn: *partition* :appsync: *region* : *account-id* :apis/
     *   *GraphQLApiId*`
     * * For an Amazon Cognito user pool: `arn: *partition* :cognito-idp: *region* : *account-id*
     *   :userpool/ *user-pool-id*`
     * * For an AWS App Runner service: `arn: *partition* :apprunner: *region* : *account-id*
     *   :service/ *apprunner-service-name* / *apprunner-service-id*`
     * * For an AWS Verified Access instance: `arn: *partition* :ec2: *region* : *account-id*
     *   :verified-access-instance/ *instance-id*`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webaclassociation.html#cfn-wafv2-webaclassociation-resourcearn)
     *
     * @param resourceArn The Amazon Resource Name (ARN) of the resource to associate with the web
     *   ACL.
     */
    public fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
    }

    /**
     * The Amazon Resource Name (ARN) of the web ACL that you want to associate with the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webaclassociation.html#cfn-wafv2-webaclassociation-webaclarn)
     *
     * @param webAclArn The Amazon Resource Name (ARN) of the web ACL that you want to associate
     *   with the resource.
     */
    public fun webAclArn(webAclArn: String) {
        cdkBuilder.webAclArn(webAclArn)
    }

    public fun build(): CfnWebACLAssociation = cdkBuilder.build()
}
