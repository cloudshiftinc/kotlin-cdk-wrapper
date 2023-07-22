@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.msk.CfnBatchScramSecretProps

@CdkDslMarker
public class CfnBatchScramSecretPropsDsl {
  private val cdkBuilder: CfnBatchScramSecretProps.Builder = CfnBatchScramSecretProps.builder()

  private val _secretArnList: MutableList<String> = mutableListOf()

  /**
   * @param clusterArn the value to be set. 
   */
  public fun clusterArn(clusterArn: String) {
    cdkBuilder.clusterArn(clusterArn)
  }

  /**
   * @param secretArnList the value to be set.
   */
  public fun secretArnList(vararg secretArnList: String) {
    _secretArnList.addAll(listOf(*secretArnList))
  }

  /**
   * @param secretArnList the value to be set.
   */
  public fun secretArnList(secretArnList: Collection<String>) {
    _secretArnList.addAll(secretArnList)
  }

  public fun build(): CfnBatchScramSecretProps {
    if(_secretArnList.isNotEmpty()) cdkBuilder.secretArnList(_secretArnList)
    return cdkBuilder.build()
  }
}
