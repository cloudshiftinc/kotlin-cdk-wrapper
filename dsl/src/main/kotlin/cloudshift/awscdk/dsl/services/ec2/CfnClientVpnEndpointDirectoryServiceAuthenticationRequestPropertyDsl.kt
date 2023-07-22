@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint

@CdkDslMarker
public class CfnClientVpnEndpointDirectoryServiceAuthenticationRequestPropertyDsl {
  private val cdkBuilder: CfnClientVpnEndpoint.DirectoryServiceAuthenticationRequestProperty.Builder
      = CfnClientVpnEndpoint.DirectoryServiceAuthenticationRequestProperty.builder()

  /**
   * @param directoryId The ID of the Active Directory to be used for authentication. 
   */
  public fun directoryId(directoryId: String) {
    cdkBuilder.directoryId(directoryId)
  }

  public fun build(): CfnClientVpnEndpoint.DirectoryServiceAuthenticationRequestProperty =
      cdkBuilder.build()
}
