@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigateway.ApiMappingOptions

/**
 * Options for creating an api mapping.
 *
 * Example:
 *
 * ```
 * Object acmCertificateForExampleCom;
 * RestApi restApi;
 * RestApi secondRestApi;
 * DomainName domain = DomainName.Builder.create(this, "custom-domain")
 * .domainName("example.com")
 * .certificate(acmCertificateForExampleCom)
 * .mapping(restApi)
 * .build();
 * domain.addApiMapping(secondRestApi.getDeploymentStage(), ApiMappingOptions.builder()
 * .basePath("orders/v2/api")
 * .build());
 * ```
 */
@CdkDslMarker
public class ApiMappingOptionsDsl {
  private val cdkBuilder: ApiMappingOptions.Builder = ApiMappingOptions.builder()

  /**
   * @param basePath The api path name that callers of the API must provide in the URL after the
   * domain name (e.g. `example.com/base-path`). If you specify this property, it can't be an empty
   * string.
   * If this is undefined, a mapping will be added for the empty path. Any request
   * that does not match a mapping will get sent to the API that has been mapped
   * to the empty path.
   */
  public fun basePath(basePath: String) {
    cdkBuilder.basePath(basePath)
  }

  public fun build(): ApiMappingOptions = cdkBuilder.build()
}
