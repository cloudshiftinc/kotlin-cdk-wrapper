@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster

@CdkDslMarker
public class CfnClusterTlsPropertyDsl {
  private val cdkBuilder: CfnCluster.TlsProperty.Builder = CfnCluster.TlsProperty.builder()

  private val _certificateAuthorityArnList: MutableList<String> = mutableListOf()

  /**
   * @param certificateAuthorityArnList List of AWS Private CA ARNs.
   */
  public fun certificateAuthorityArnList(vararg certificateAuthorityArnList: String) {
    _certificateAuthorityArnList.addAll(listOf(*certificateAuthorityArnList))
  }

  /**
   * @param certificateAuthorityArnList List of AWS Private CA ARNs.
   */
  public fun certificateAuthorityArnList(certificateAuthorityArnList: Collection<String>) {
    _certificateAuthorityArnList.addAll(certificateAuthorityArnList)
  }

  /**
   * @param enabled TLS authentication is enabled or not.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled TLS authentication is enabled or not.
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): CfnCluster.TlsProperty {
    if(_certificateAuthorityArnList.isNotEmpty())
        cdkBuilder.certificateAuthorityArnList(_certificateAuthorityArnList)
    return cdkBuilder.build()
  }
}
