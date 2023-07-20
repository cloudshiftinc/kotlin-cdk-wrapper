@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.devopsguru

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.devopsguru.CfnResourceCollection

@CdkDslMarker
public class CfnResourceCollectionCloudFormationCollectionFilterPropertyDsl {
  private val cdkBuilder: CfnResourceCollection.CloudFormationCollectionFilterProperty.Builder =
      CfnResourceCollection.CloudFormationCollectionFilterProperty.builder()

  private val _stackNames: MutableList<String> = mutableListOf()

  public fun stackNames(vararg stackNames: String) {
    _stackNames.addAll(listOf(*stackNames))
  }

  public fun stackNames(stackNames: Collection<String>) {
    _stackNames.addAll(stackNames)
  }

  public fun build(): CfnResourceCollection.CloudFormationCollectionFilterProperty {
    if(_stackNames.isNotEmpty()) cdkBuilder.stackNames(_stackNames)
    return cdkBuilder.build()
  }
}
