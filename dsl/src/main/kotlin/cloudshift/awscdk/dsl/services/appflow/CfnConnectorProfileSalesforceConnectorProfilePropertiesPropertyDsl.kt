@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

@CdkDslMarker
public class CfnConnectorProfileSalesforceConnectorProfilePropertiesPropertyDsl {
  private val cdkBuilder: CfnConnectorProfile.SalesforceConnectorProfilePropertiesProperty.Builder =
      CfnConnectorProfile.SalesforceConnectorProfilePropertiesProperty.builder()

  /**
   * @param instanceUrl The location of the Salesforce resource.
   */
  public fun instanceUrl(instanceUrl: String) {
    cdkBuilder.instanceUrl(instanceUrl)
  }

  /**
   * @param isSandboxEnvironment Indicates whether the connector profile applies to a sandbox or
   * production environment.
   */
  public fun isSandboxEnvironment(isSandboxEnvironment: Boolean) {
    cdkBuilder.isSandboxEnvironment(isSandboxEnvironment)
  }

  /**
   * @param isSandboxEnvironment Indicates whether the connector profile applies to a sandbox or
   * production environment.
   */
  public fun isSandboxEnvironment(isSandboxEnvironment: IResolvable) {
    cdkBuilder.isSandboxEnvironment(isSandboxEnvironment)
  }

  /**
   * @param usePrivateLinkForMetadataAndAuthorization Indicates whether to make Metadata And
   * Authorization calls over Pivate Network.
   */
  public
      fun usePrivateLinkForMetadataAndAuthorization(usePrivateLinkForMetadataAndAuthorization: Boolean) {
    cdkBuilder.usePrivateLinkForMetadataAndAuthorization(usePrivateLinkForMetadataAndAuthorization)
  }

  /**
   * @param usePrivateLinkForMetadataAndAuthorization Indicates whether to make Metadata And
   * Authorization calls over Pivate Network.
   */
  public
      fun usePrivateLinkForMetadataAndAuthorization(usePrivateLinkForMetadataAndAuthorization: IResolvable) {
    cdkBuilder.usePrivateLinkForMetadataAndAuthorization(usePrivateLinkForMetadataAndAuthorization)
  }

  public fun build(): CfnConnectorProfile.SalesforceConnectorProfilePropertiesProperty =
      cdkBuilder.build()
}
