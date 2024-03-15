@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opensearchserverless

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an OpenSearch Serverless-managed interface VPC endpoint.
 *
 * For more information, see [Access Amazon OpenSearch Serverless using an interface
 * endpoint](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-vpc.html)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.opensearchserverless.*;
 * CfnVpcEndpoint cfnVpcEndpoint = CfnVpcEndpoint.Builder.create(this, "MyCfnVpcEndpoint")
 * .name("name")
 * .subnetIds(List.of("subnetIds"))
 * .vpcId("vpcId")
 * // the properties below are optional
 * .securityGroupIds(List.of("securityGroupIds"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-vpcendpoint.html)
 */
public open class CfnVpcEndpoint internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.opensearchserverless.CfnVpcEndpoint,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The unique identifier of the endpoint.
   *
   * For example, `vpce-050f79086ee71ac05` .
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the endpoint.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the endpoint.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The unique identifiers of the security groups that define the ports, protocols, and sources for
   * inbound traffic that you are authorizing into your endpoint.
   */
  public open fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
      emptyList()

  /**
   * The unique identifiers of the security groups that define the ports, protocols, and sources for
   * inbound traffic that you are authorizing into your endpoint.
   */
  public open fun securityGroupIds(`value`: List<String>) {
    unwrap(this).setSecurityGroupIds(`value`)
  }

  /**
   * The unique identifiers of the security groups that define the ports, protocols, and sources for
   * inbound traffic that you are authorizing into your endpoint.
   */
  public open fun securityGroupIds(vararg `value`: String): Unit =
      securityGroupIds(`value`.toList())

  /**
   * The ID of the subnets from which you access OpenSearch Serverless.
   */
  public open fun subnetIds(): List<String> = unwrap(this).getSubnetIds()

  /**
   * The ID of the subnets from which you access OpenSearch Serverless.
   */
  public open fun subnetIds(`value`: List<String>) {
    unwrap(this).setSubnetIds(`value`)
  }

  /**
   * The ID of the subnets from which you access OpenSearch Serverless.
   */
  public open fun subnetIds(vararg `value`: String): Unit = subnetIds(`value`.toList())

  /**
   * The ID of the VPC from which you access OpenSearch Serverless.
   */
  public open fun vpcId(): String = unwrap(this).getVpcId()

  /**
   * The ID of the VPC from which you access OpenSearch Serverless.
   */
  public open fun vpcId(`value`: String) {
    unwrap(this).setVpcId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.opensearchserverless.CfnVpcEndpoint].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-vpcendpoint.html#cfn-opensearchserverless-vpcendpoint-name)
     * @param name The name of the endpoint. 
     */
    public fun name(name: String)

    /**
     * The unique identifiers of the security groups that define the ports, protocols, and sources
     * for inbound traffic that you are authorizing into your endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-vpcendpoint.html#cfn-opensearchserverless-vpcendpoint-securitygroupids)
     * @param securityGroupIds The unique identifiers of the security groups that define the ports,
     * protocols, and sources for inbound traffic that you are authorizing into your endpoint. 
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * The unique identifiers of the security groups that define the ports, protocols, and sources
     * for inbound traffic that you are authorizing into your endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-vpcendpoint.html#cfn-opensearchserverless-vpcendpoint-securitygroupids)
     * @param securityGroupIds The unique identifiers of the security groups that define the ports,
     * protocols, and sources for inbound traffic that you are authorizing into your endpoint. 
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * The ID of the subnets from which you access OpenSearch Serverless.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-vpcendpoint.html#cfn-opensearchserverless-vpcendpoint-subnetids)
     * @param subnetIds The ID of the subnets from which you access OpenSearch Serverless. 
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * The ID of the subnets from which you access OpenSearch Serverless.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-vpcendpoint.html#cfn-opensearchserverless-vpcendpoint-subnetids)
     * @param subnetIds The ID of the subnets from which you access OpenSearch Serverless. 
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * The ID of the VPC from which you access OpenSearch Serverless.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-vpcendpoint.html#cfn-opensearchserverless-vpcendpoint-vpcid)
     * @param vpcId The ID of the VPC from which you access OpenSearch Serverless. 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.opensearchserverless.CfnVpcEndpoint.Builder =
        software.amazon.awscdk.services.opensearchserverless.CfnVpcEndpoint.Builder.create(scope,
        id)

    /**
     * The name of the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-vpcendpoint.html#cfn-opensearchserverless-vpcendpoint-name)
     * @param name The name of the endpoint. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The unique identifiers of the security groups that define the ports, protocols, and sources
     * for inbound traffic that you are authorizing into your endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-vpcendpoint.html#cfn-opensearchserverless-vpcendpoint-securitygroupids)
     * @param securityGroupIds The unique identifiers of the security groups that define the ports,
     * protocols, and sources for inbound traffic that you are authorizing into your endpoint. 
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * The unique identifiers of the security groups that define the ports, protocols, and sources
     * for inbound traffic that you are authorizing into your endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-vpcendpoint.html#cfn-opensearchserverless-vpcendpoint-securitygroupids)
     * @param securityGroupIds The unique identifiers of the security groups that define the ports,
     * protocols, and sources for inbound traffic that you are authorizing into your endpoint. 
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * The ID of the subnets from which you access OpenSearch Serverless.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-vpcendpoint.html#cfn-opensearchserverless-vpcendpoint-subnetids)
     * @param subnetIds The ID of the subnets from which you access OpenSearch Serverless. 
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * The ID of the subnets from which you access OpenSearch Serverless.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-vpcendpoint.html#cfn-opensearchserverless-vpcendpoint-subnetids)
     * @param subnetIds The ID of the subnets from which you access OpenSearch Serverless. 
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * The ID of the VPC from which you access OpenSearch Serverless.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-vpcendpoint.html#cfn-opensearchserverless-vpcendpoint-vpcid)
     * @param vpcId The ID of the VPC from which you access OpenSearch Serverless. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.opensearchserverless.CfnVpcEndpoint =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.opensearchserverless.CfnVpcEndpoint.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVpcEndpoint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVpcEndpoint(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.opensearchserverless.CfnVpcEndpoint):
        CfnVpcEndpoint = CfnVpcEndpoint(cdkObject)

    internal fun unwrap(wrapped: CfnVpcEndpoint):
        software.amazon.awscdk.services.opensearchserverless.CfnVpcEndpoint = wrapped.cdkObject
  }
}
