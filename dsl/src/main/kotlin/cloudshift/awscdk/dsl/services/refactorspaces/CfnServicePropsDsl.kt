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
import software.amazon.awscdk.services.refactorspaces.CfnServiceProps

/**
 * Properties for defining a `CfnService`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.refactorspaces.*;
 * CfnServiceProps cfnServiceProps = CfnServiceProps.builder()
 * .applicationIdentifier("applicationIdentifier")
 * .endpointType("endpointType")
 * .environmentIdentifier("environmentIdentifier")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .lambdaEndpoint(LambdaEndpointInputProperty.builder()
 * .arn("arn")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .urlEndpoint(UrlEndpointInputProperty.builder()
 * .url("url")
 * // the properties below are optional
 * .healthUrl("healthUrl")
 * .build())
 * .vpcId("vpcId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html)
 */
@CdkDslMarker
public class CfnServicePropsDsl {
  private val cdkBuilder: CfnServiceProps.Builder = CfnServiceProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param applicationIdentifier The unique identifier of the application. 
   */
  public fun applicationIdentifier(applicationIdentifier: String) {
    cdkBuilder.applicationIdentifier(applicationIdentifier)
  }

  /**
   * @param description A description of the service.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param endpointType The endpoint type of the service. 
   */
  public fun endpointType(endpointType: String) {
    cdkBuilder.endpointType(endpointType)
  }

  /**
   * @param environmentIdentifier The unique identifier of the environment. 
   */
  public fun environmentIdentifier(environmentIdentifier: String) {
    cdkBuilder.environmentIdentifier(environmentIdentifier)
  }

  /**
   * @param lambdaEndpoint A summary of the configuration for the AWS Lambda endpoint type.
   */
  public fun lambdaEndpoint(lambdaEndpoint: IResolvable) {
    cdkBuilder.lambdaEndpoint(lambdaEndpoint)
  }

  /**
   * @param lambdaEndpoint A summary of the configuration for the AWS Lambda endpoint type.
   */
  public fun lambdaEndpoint(lambdaEndpoint: CfnService.LambdaEndpointInputProperty) {
    cdkBuilder.lambdaEndpoint(lambdaEndpoint)
  }

  /**
   * @param name The name of the service. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param tags The tags assigned to the service.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags assigned to the service.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param urlEndpoint The summary of the configuration for the URL endpoint type.
   */
  public fun urlEndpoint(urlEndpoint: IResolvable) {
    cdkBuilder.urlEndpoint(urlEndpoint)
  }

  /**
   * @param urlEndpoint The summary of the configuration for the URL endpoint type.
   */
  public fun urlEndpoint(urlEndpoint: CfnService.UrlEndpointInputProperty) {
    cdkBuilder.urlEndpoint(urlEndpoint)
  }

  /**
   * @param vpcId The ID of the virtual private cloud (VPC).
   */
  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun build(): CfnServiceProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
