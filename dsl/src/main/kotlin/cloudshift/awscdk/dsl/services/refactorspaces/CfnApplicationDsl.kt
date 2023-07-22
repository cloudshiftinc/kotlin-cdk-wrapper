@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.refactorspaces

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.refactorspaces.CfnApplication
import software.constructs.Construct

/**
 * Creates an AWS Migration Hub Refactor Spaces application.
 *
 * The account that owns the environment also owns the applications created inside the environment,
 * regardless of the account that creates the application. Refactor Spaces provisions an Amazon API
 * Gateway , API Gateway VPC link, and Network Load Balancer for the application proxy inside your
 * account.
 *
 * In environments created with a
 * [CreateEnvironment:NetworkFabricType](https://docs.aws.amazon.com/migrationhub-refactor-spaces/latest/APIReference/API_CreateEnvironment.html#migrationhubrefactorspaces-CreateEnvironment-request-NetworkFabricType)
 * of `NONE` you need to configure [VPC to VPC
 * connectivity](https://docs.aws.amazon.com/whitepapers/latest/aws-vpc-connectivity-options/amazon-vpc-to-amazon-vpc-connectivity-options.html)
 * between your service VPC and the application proxy VPC to route traffic through the application
 * proxy to a service with a private URL endpoint. For more information, see [Create an
 * application](https://docs.aws.amazon.com/migrationhub-refactor-spaces/latest/userguide/getting-started-create-application.html)
 * in the *Refactor Spaces User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.refactorspaces.*;
 * CfnApplication cfnApplication = CfnApplication.Builder.create(this, "MyCfnApplication")
 * .environmentIdentifier("environmentIdentifier")
 * .name("name")
 * .proxyType("proxyType")
 * .vpcId("vpcId")
 * // the properties below are optional
 * .apiGatewayProxy(ApiGatewayProxyInputProperty.builder()
 * .endpointType("endpointType")
 * .stageName("stageName")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-application.html)
 */
@CdkDslMarker
public class CfnApplicationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnApplication.Builder = CfnApplication.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The endpoint URL of the Amazon API Gateway proxy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-application.html#cfn-refactorspaces-application-apigatewayproxy)
   * @param apiGatewayProxy The endpoint URL of the Amazon API Gateway proxy. 
   */
  public fun apiGatewayProxy(apiGatewayProxy: IResolvable) {
    cdkBuilder.apiGatewayProxy(apiGatewayProxy)
  }

  /**
   * The endpoint URL of the Amazon API Gateway proxy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-application.html#cfn-refactorspaces-application-apigatewayproxy)
   * @param apiGatewayProxy The endpoint URL of the Amazon API Gateway proxy. 
   */
  public fun apiGatewayProxy(apiGatewayProxy: CfnApplication.ApiGatewayProxyInputProperty) {
    cdkBuilder.apiGatewayProxy(apiGatewayProxy)
  }

  /**
   * The unique identifier of the environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-application.html#cfn-refactorspaces-application-environmentidentifier)
   * @param environmentIdentifier The unique identifier of the environment. 
   */
  public fun environmentIdentifier(environmentIdentifier: String) {
    cdkBuilder.environmentIdentifier(environmentIdentifier)
  }

  /**
   * The name of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-application.html#cfn-refactorspaces-application-name)
   * @param name The name of the application. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The proxy type of the proxy created within the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-application.html#cfn-refactorspaces-application-proxytype)
   * @param proxyType The proxy type of the proxy created within the application. 
   */
  public fun proxyType(proxyType: String) {
    cdkBuilder.proxyType(proxyType)
  }

  /**
   * The tags assigned to the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-application.html#cfn-refactorspaces-application-tags)
   * @param tags The tags assigned to the application. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The tags assigned to the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-application.html#cfn-refactorspaces-application-tags)
   * @param tags The tags assigned to the application. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * The ID of the virtual private cloud (VPC).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-application.html#cfn-refactorspaces-application-vpcid)
   * @param vpcId The ID of the virtual private cloud (VPC). 
   */
  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun build(): CfnApplication {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
