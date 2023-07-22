@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.eks.CfnCluster

@CdkDslMarker
public class CfnClusterEncryptionConfigPropertyDsl {
  private val cdkBuilder: CfnCluster.EncryptionConfigProperty.Builder =
      CfnCluster.EncryptionConfigProperty.builder()

  private val _resources: MutableList<String> = mutableListOf()

  /**
   * @param provider The encryption provider for the cluster.
   */
  public fun provider(provider: IResolvable) {
    cdkBuilder.provider(provider)
  }

  /**
   * @param provider The encryption provider for the cluster.
   */
  public fun provider(provider: CfnCluster.ProviderProperty) {
    cdkBuilder.provider(provider)
  }

  /**
   * @param resources Specifies the resources to be encrypted.
   * The only supported value is "secrets".
   */
  public fun resources(vararg resources: String) {
    _resources.addAll(listOf(*resources))
  }

  /**
   * @param resources Specifies the resources to be encrypted.
   * The only supported value is "secrets".
   */
  public fun resources(resources: Collection<String>) {
    _resources.addAll(resources)
  }

  public fun build(): CfnCluster.EncryptionConfigProperty {
    if(_resources.isNotEmpty()) cdkBuilder.resources(_resources)
    return cdkBuilder.build()
  }
}
