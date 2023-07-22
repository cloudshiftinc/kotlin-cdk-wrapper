@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnFeatureGroup

@CdkDslMarker
public class CfnFeatureGroupOnlineStoreConfigPropertyDsl {
  private val cdkBuilder: CfnFeatureGroup.OnlineStoreConfigProperty.Builder =
      CfnFeatureGroup.OnlineStoreConfigProperty.builder()

  /**
   * @param enableOnlineStore Turn `OnlineStore` off by specifying `False` for the
   * `EnableOnlineStore` flag.
   * Turn `OnlineStore` on by specifying `True` for the `EnableOnlineStore` flag.
   *
   * The default value is `False` .
   */
  public fun enableOnlineStore(enableOnlineStore: Boolean) {
    cdkBuilder.enableOnlineStore(enableOnlineStore)
  }

  /**
   * @param enableOnlineStore Turn `OnlineStore` off by specifying `False` for the
   * `EnableOnlineStore` flag.
   * Turn `OnlineStore` on by specifying `True` for the `EnableOnlineStore` flag.
   *
   * The default value is `False` .
   */
  public fun enableOnlineStore(enableOnlineStore: IResolvable) {
    cdkBuilder.enableOnlineStore(enableOnlineStore)
  }

  /**
   * @param securityConfig Use to specify KMS Key ID ( `KMSKeyId` ) for at-rest encryption of your
   * `OnlineStore` .
   */
  public fun securityConfig(securityConfig: IResolvable) {
    cdkBuilder.securityConfig(securityConfig)
  }

  /**
   * @param securityConfig Use to specify KMS Key ID ( `KMSKeyId` ) for at-rest encryption of your
   * `OnlineStore` .
   */
  public fun securityConfig(securityConfig: CfnFeatureGroup.OnlineStoreSecurityConfigProperty) {
    cdkBuilder.securityConfig(securityConfig)
  }

  public fun build(): CfnFeatureGroup.OnlineStoreConfigProperty = cdkBuilder.build()
}
