@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.msk.CfnBatchScramSecret
import software.constructs.Construct

@CdkDslMarker
public class CfnBatchScramSecretDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnBatchScramSecret.Builder = CfnBatchScramSecret.Builder.create(scope,
      id)

  private val _secretArnList: MutableList<String> = mutableListOf()

  public fun clusterArn(clusterArn: String) {
    cdkBuilder.clusterArn(clusterArn)
  }

  public fun secretArnList(vararg secretArnList: String) {
    _secretArnList.addAll(listOf(*secretArnList))
  }

  public fun secretArnList(secretArnList: Collection<String>) {
    _secretArnList.addAll(secretArnList)
  }

  public fun build(): CfnBatchScramSecret {
    if(_secretArnList.isNotEmpty()) cdkBuilder.secretArnList(_secretArnList)
    return cdkBuilder.build()
  }
}
