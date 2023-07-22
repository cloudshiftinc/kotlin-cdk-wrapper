@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.apigateway.CfnDomainName

/**
 * The `EndpointConfiguration` property type specifies the endpoint types of an Amazon API Gateway
 * domain name.
 *
 * `EndpointConfiguration` is a property of the
 * [AWS::ApiGateway::DomainName](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html)
 * resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
 * EndpointConfigurationProperty endpointConfigurationProperty =
 * EndpointConfigurationProperty.builder()
 * .types(List.of("types"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-domainname-endpointconfiguration.html)
 */
@CdkDslMarker
public class CfnDomainNameEndpointConfigurationPropertyDsl {
  private val cdkBuilder: CfnDomainName.EndpointConfigurationProperty.Builder =
      CfnDomainName.EndpointConfigurationProperty.builder()

  private val _types: MutableList<String> = mutableListOf()

  /**
   * @param types A list of endpoint types of an API (RestApi) or its custom domain name
   * (DomainName).
   * For an edge-optimized API and its custom domain name, the endpoint type is `"EDGE"` . For a
   * regional API and its custom domain name, the endpoint type is `REGIONAL` . For a private API, the
   * endpoint type is `PRIVATE` .
   */
  public fun types(vararg types: String) {
    _types.addAll(listOf(*types))
  }

  /**
   * @param types A list of endpoint types of an API (RestApi) or its custom domain name
   * (DomainName).
   * For an edge-optimized API and its custom domain name, the endpoint type is `"EDGE"` . For a
   * regional API and its custom domain name, the endpoint type is `REGIONAL` . For a private API, the
   * endpoint type is `PRIVATE` .
   */
  public fun types(types: Collection<String>) {
    _types.addAll(types)
  }

  public fun build(): CfnDomainName.EndpointConfigurationProperty {
    if(_types.isNotEmpty()) cdkBuilder.types(_types)
    return cdkBuilder.build()
  }
}
