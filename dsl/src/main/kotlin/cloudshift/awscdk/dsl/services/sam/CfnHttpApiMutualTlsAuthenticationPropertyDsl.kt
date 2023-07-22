@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnHttpApi

@CdkDslMarker
public class CfnHttpApiMutualTlsAuthenticationPropertyDsl {
  private val cdkBuilder: CfnHttpApi.MutualTlsAuthenticationProperty.Builder =
      CfnHttpApi.MutualTlsAuthenticationProperty.builder()

  /**
   * @param truststoreUri the value to be set.
   */
  public fun truststoreUri(truststoreUri: String) {
    cdkBuilder.truststoreUri(truststoreUri)
  }

  /**
   * @param truststoreVersion the value to be set.
   */
  public fun truststoreVersion(truststoreVersion: Boolean) {
    cdkBuilder.truststoreVersion(truststoreVersion)
  }

  /**
   * @param truststoreVersion the value to be set.
   */
  public fun truststoreVersion(truststoreVersion: IResolvable) {
    cdkBuilder.truststoreVersion(truststoreVersion)
  }

  public fun build(): CfnHttpApi.MutualTlsAuthenticationProperty = cdkBuilder.build()
}
