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
import software.amazon.awscdk.services.refactorspaces.CfnService
import software.constructs.Construct

@CdkDslMarker
public class CfnServiceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnService.Builder = CfnService.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The unique identifier of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-applicationidentifier)
   * @param applicationIdentifier The unique identifier of the application. 
   */
  public fun applicationIdentifier(applicationIdentifier: String) {
    cdkBuilder.applicationIdentifier(applicationIdentifier)
  }

  /**
   * A description of the service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-description)
   * @param description A description of the service. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The endpoint type of the service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-endpointtype)
   * @param endpointType The endpoint type of the service. 
   */
  public fun endpointType(endpointType: String) {
    cdkBuilder.endpointType(endpointType)
  }

  /**
   * The unique identifier of the environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-environmentidentifier)
   * @param environmentIdentifier The unique identifier of the environment. 
   */
  public fun environmentIdentifier(environmentIdentifier: String) {
    cdkBuilder.environmentIdentifier(environmentIdentifier)
  }

  /**
   * A summary of the configuration for the AWS Lambda endpoint type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-lambdaendpoint)
   * @param lambdaEndpoint A summary of the configuration for the AWS Lambda endpoint type. 
   */
  public fun lambdaEndpoint(lambdaEndpoint: IResolvable) {
    cdkBuilder.lambdaEndpoint(lambdaEndpoint)
  }

  /**
   * A summary of the configuration for the AWS Lambda endpoint type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-lambdaendpoint)
   * @param lambdaEndpoint A summary of the configuration for the AWS Lambda endpoint type. 
   */
  public fun lambdaEndpoint(lambdaEndpoint: CfnService.LambdaEndpointInputProperty) {
    cdkBuilder.lambdaEndpoint(lambdaEndpoint)
  }

  /**
   * The name of the service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-name)
   * @param name The name of the service. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The tags assigned to the service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-tags)
   * @param tags The tags assigned to the service. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The tags assigned to the service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-tags)
   * @param tags The tags assigned to the service. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * The summary of the configuration for the URL endpoint type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-urlendpoint)
   * @param urlEndpoint The summary of the configuration for the URL endpoint type. 
   */
  public fun urlEndpoint(urlEndpoint: IResolvable) {
    cdkBuilder.urlEndpoint(urlEndpoint)
  }

  /**
   * The summary of the configuration for the URL endpoint type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-urlendpoint)
   * @param urlEndpoint The summary of the configuration for the URL endpoint type. 
   */
  public fun urlEndpoint(urlEndpoint: CfnService.UrlEndpointInputProperty) {
    cdkBuilder.urlEndpoint(urlEndpoint)
  }

  /**
   * The ID of the virtual private cloud (VPC).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-vpcid)
   * @param vpcId The ID of the virtual private cloud (VPC). 
   */
  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun build(): CfnService {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
