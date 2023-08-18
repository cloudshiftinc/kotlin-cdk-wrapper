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
import software.amazon.awscdk.services.wafv2.CfnWebACLAssociationProps

/**
 * Properties for defining a `CfnWebACLAssociation`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * CfnWebACLAssociationProps cfnWebACLAssociationProps = CfnWebACLAssociationProps.builder()
 * .resourceArn("resourceArn")
 * .webAclArn("webAclArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webaclassociation.html)
 */
@CdkDslMarker
public class CfnWebACLAssociationPropsDsl {
    private val cdkBuilder: CfnWebACLAssociationProps.Builder = CfnWebACLAssociationProps.builder()

    /**
     * @param resourceArn The Amazon Resource Name (ARN) of the resource to associate with the web
     *   ACL. The ARN must be in one of the following formats:
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
     */
    public fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
    }

    /**
     * @param webAclArn The Amazon Resource Name (ARN) of the web ACL that you want to associate
     *   with the resource.
     */
    public fun webAclArn(webAclArn: String) {
        cdkBuilder.webAclArn(webAclArn)
    }

    public fun build(): CfnWebACLAssociationProps = cdkBuilder.build()
}
