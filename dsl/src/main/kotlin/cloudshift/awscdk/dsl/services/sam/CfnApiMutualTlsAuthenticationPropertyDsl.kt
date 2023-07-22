@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnApi

@CdkDslMarker
public class CfnApiMutualTlsAuthenticationPropertyDsl {
  private val cdkBuilder: CfnApi.MutualTlsAuthenticationProperty.Builder =
      CfnApi.MutualTlsAuthenticationProperty.builder()

  /**
   * @param truststoreUri the value to be set.
   */
  public fun truststoreUri(truststoreUri: String) {
    cdkBuilder.truststoreUri(truststoreUri)
  }

  /**
   * @param truststoreVersion the value to be set.
   */
  public fun truststoreVersion(truststoreVersion: String) {
    cdkBuilder.truststoreVersion(truststoreVersion)
  }

  public fun build(): CfnApi.MutualTlsAuthenticationProperty = cdkBuilder.build()
}
