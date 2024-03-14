package io.cloudshiftdev.awscdk.services.wafv2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnWebACLAssociation internal constructor(
  private val cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACLAssociation,
) : CfnResource(cdkObject), IInspectable {
  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) of the resource to associate with the web ACL.
   */
  public open fun resourceArn(): String = unwrap(this).getResourceArn()

  /**
   * The Amazon Resource Name (ARN) of the resource to associate with the web ACL.
   */
  public open fun resourceArn(`value`: String) {
    unwrap(this).setResourceArn(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the web ACL that you want to associate with the resource.
   */
  public open fun webAclArn(): String = unwrap(this).getWebAclArn()

  /**
   * The Amazon Resource Name (ARN) of the web ACL that you want to associate with the resource.
   */
  public open fun webAclArn(`value`: String) {
    unwrap(this).setWebAclArn(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.wafv2.CfnWebACLAssociation].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param resourceArn The Amazon Resource Name (ARN) of the resource to associate with the web
     * ACL. 
     */
    public fun resourceArn(resourceArn: String)

    /**
     * The Amazon Resource Name (ARN) of the web ACL that you want to associate with the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webaclassociation.html#cfn-wafv2-webaclassociation-webaclarn)
     * @param webAclArn The Amazon Resource Name (ARN) of the web ACL that you want to associate
     * with the resource. 
     */
    public fun webAclArn(webAclArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.wafv2.CfnWebACLAssociation.Builder =
        software.amazon.awscdk.services.wafv2.CfnWebACLAssociation.Builder.create(scope, id)

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
     * @param resourceArn The Amazon Resource Name (ARN) of the resource to associate with the web
     * ACL. 
     */
    override fun resourceArn(resourceArn: String) {
      cdkBuilder.resourceArn(resourceArn)
    }

    /**
     * The Amazon Resource Name (ARN) of the web ACL that you want to associate with the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webaclassociation.html#cfn-wafv2-webaclassociation-webaclarn)
     * @param webAclArn The Amazon Resource Name (ARN) of the web ACL that you want to associate
     * with the resource. 
     */
    override fun webAclArn(webAclArn: String) {
      cdkBuilder.webAclArn(webAclArn)
    }

    public fun build(): software.amazon.awscdk.services.wafv2.CfnWebACLAssociation =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWebACLAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWebACLAssociation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnWebACLAssociation):
        CfnWebACLAssociation = CfnWebACLAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnWebACLAssociation):
        software.amazon.awscdk.services.wafv2.CfnWebACLAssociation = wrapped.cdkObject
  }
}
