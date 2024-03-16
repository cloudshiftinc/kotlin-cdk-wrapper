@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.wafv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnWebACLAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.wafv2.*;
 * CfnWebACLAssociationProps cfnWebACLAssociationProps = CfnWebACLAssociationProps.builder()
 * .resourceArn("resourceArn")
 * .webAclArn("webAclArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webaclassociation.html)
 */
public interface CfnWebACLAssociationProps {
  /**
   * The Amazon Resource Name (ARN) of the resource to associate with the web ACL.
   *
   * The ARN must be in one of the following formats:
   *
   * * For an Application Load Balancer: `arn: *partition* :elasticloadbalancing: *region* :
   * *account-id* :loadbalancer/app/ *load-balancer-name* / *load-balancer-id*`
   * * For an Amazon API Gateway REST API: `arn: *partition* :apigateway: *region* ::/restapis/
   * *api-id* /stages/ *stage-name*`
   * * For an AWS AppSync GraphQL API: `arn: *partition* :appsync: *region* : *account-id* :apis/
   * *GraphQLApiId*`
   * * For an Amazon Cognito user pool: `arn: *partition* :cognito-idp: *region* : *account-id*
   * :userpool/ *user-pool-id*`
   * * For an AWS App Runner service: `arn: *partition* :apprunner: *region* : *account-id*
   * :service/ *apprunner-service-name* / *apprunner-service-id*`
   * * For an AWS Verified Access instance: `arn: *partition* :ec2: *region* : *account-id*
   * :verified-access-instance/ *instance-id*`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webaclassociation.html#cfn-wafv2-webaclassociation-resourcearn)
   */
  public fun resourceArn(): String

  /**
   * The Amazon Resource Name (ARN) of the web ACL that you want to associate with the resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webaclassociation.html#cfn-wafv2-webaclassociation-webaclarn)
   */
  public fun webAclArn(): String

  /**
   * A builder for [CfnWebACLAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param resourceArn The Amazon Resource Name (ARN) of the resource to associate with the web
     * ACL. 
     * The ARN must be in one of the following formats:
     *
     * * For an Application Load Balancer: `arn: *partition* :elasticloadbalancing: *region* :
     * *account-id* :loadbalancer/app/ *load-balancer-name* / *load-balancer-id*`
     * * For an Amazon API Gateway REST API: `arn: *partition* :apigateway: *region* ::/restapis/
     * *api-id* /stages/ *stage-name*`
     * * For an AWS AppSync GraphQL API: `arn: *partition* :appsync: *region* : *account-id* :apis/
     * *GraphQLApiId*`
     * * For an Amazon Cognito user pool: `arn: *partition* :cognito-idp: *region* : *account-id*
     * :userpool/ *user-pool-id*`
     * * For an AWS App Runner service: `arn: *partition* :apprunner: *region* : *account-id*
     * :service/ *apprunner-service-name* / *apprunner-service-id*`
     * * For an AWS Verified Access instance: `arn: *partition* :ec2: *region* : *account-id*
     * :verified-access-instance/ *instance-id*`
     */
    public fun resourceArn(resourceArn: String)

    /**
     * @param webAclArn The Amazon Resource Name (ARN) of the web ACL that you want to associate
     * with the resource. 
     */
    public fun webAclArn(webAclArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.wafv2.CfnWebACLAssociationProps.Builder
        = software.amazon.awscdk.services.wafv2.CfnWebACLAssociationProps.builder()

    /**
     * @param resourceArn The Amazon Resource Name (ARN) of the resource to associate with the web
     * ACL. 
     * The ARN must be in one of the following formats:
     *
     * * For an Application Load Balancer: `arn: *partition* :elasticloadbalancing: *region* :
     * *account-id* :loadbalancer/app/ *load-balancer-name* / *load-balancer-id*`
     * * For an Amazon API Gateway REST API: `arn: *partition* :apigateway: *region* ::/restapis/
     * *api-id* /stages/ *stage-name*`
     * * For an AWS AppSync GraphQL API: `arn: *partition* :appsync: *region* : *account-id* :apis/
     * *GraphQLApiId*`
     * * For an Amazon Cognito user pool: `arn: *partition* :cognito-idp: *region* : *account-id*
     * :userpool/ *user-pool-id*`
     * * For an AWS App Runner service: `arn: *partition* :apprunner: *region* : *account-id*
     * :service/ *apprunner-service-name* / *apprunner-service-id*`
     * * For an AWS Verified Access instance: `arn: *partition* :ec2: *region* : *account-id*
     * :verified-access-instance/ *instance-id*`
     */
    override fun resourceArn(resourceArn: String) {
      cdkBuilder.resourceArn(resourceArn)
    }

    /**
     * @param webAclArn The Amazon Resource Name (ARN) of the web ACL that you want to associate
     * with the resource. 
     */
    override fun webAclArn(webAclArn: String) {
      cdkBuilder.webAclArn(webAclArn)
    }

    public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACLAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACLAssociationProps,
  ) : CdkObject(cdkObject), CfnWebACLAssociationProps {
    /**
     * The Amazon Resource Name (ARN) of the resource to associate with the web ACL.
     *
     * The ARN must be in one of the following formats:
     *
     * * For an Application Load Balancer: `arn: *partition* :elasticloadbalancing: *region* :
     * *account-id* :loadbalancer/app/ *load-balancer-name* / *load-balancer-id*`
     * * For an Amazon API Gateway REST API: `arn: *partition* :apigateway: *region* ::/restapis/
     * *api-id* /stages/ *stage-name*`
     * * For an AWS AppSync GraphQL API: `arn: *partition* :appsync: *region* : *account-id* :apis/
     * *GraphQLApiId*`
     * * For an Amazon Cognito user pool: `arn: *partition* :cognito-idp: *region* : *account-id*
     * :userpool/ *user-pool-id*`
     * * For an AWS App Runner service: `arn: *partition* :apprunner: *region* : *account-id*
     * :service/ *apprunner-service-name* / *apprunner-service-id*`
     * * For an AWS Verified Access instance: `arn: *partition* :ec2: *region* : *account-id*
     * :verified-access-instance/ *instance-id*`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webaclassociation.html#cfn-wafv2-webaclassociation-resourcearn)
     */
    override fun resourceArn(): String = unwrap(this).getResourceArn()

    /**
     * The Amazon Resource Name (ARN) of the web ACL that you want to associate with the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webaclassociation.html#cfn-wafv2-webaclassociation-webaclarn)
     */
    override fun webAclArn(): String = unwrap(this).getWebAclArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWebACLAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACLAssociationProps):
        CfnWebACLAssociationProps = CdkObjectWrappers.wrap(cdkObject) as CfnWebACLAssociationProps

    internal fun unwrap(wrapped: CfnWebACLAssociationProps):
        software.amazon.awscdk.services.wafv2.CfnWebACLAssociationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.wafv2.CfnWebACLAssociationProps
  }
}
