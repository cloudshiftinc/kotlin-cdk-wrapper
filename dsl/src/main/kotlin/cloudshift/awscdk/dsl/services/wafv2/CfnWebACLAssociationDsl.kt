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

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.wafv2.CfnWebACLAssociation
import software.constructs.Construct

/**
 * This is the latest version of *AWS WAF* , named AWS WAF V2, released in November, 2019.
 *
 * For information, including how to migrate your AWS WAF resources from the prior release, see the
 * [AWS WAF Developer Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html)
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
 * When you create a web ACL or make changes to a web ACL or web ACL components, like rules and rule
 * groups, AWS WAF propagates the changes everywhere that the web ACL and its components are stored
 * and used. Your changes are applied within seconds, but there might be a brief period of
 * inconsistency when the changes have arrived in some places and not in others. So, for example, if
 * you change a rule action setting, the action might be the old action in one area and the new
 * action in another area. Or if you add an IP address to an IP set used in a blocking rule, the new
 * address might briefly be blocked in one area while still allowed in another. This temporary
 * inconsistency can occur when you first associate a web ACL with an AWS resource and when you
 * change a web ACL that is already associated with a resource. Generally, any inconsistencies of
 * this type last only a few seconds.
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
