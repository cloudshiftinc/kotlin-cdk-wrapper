@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.customerprofiles.CfnObjectType

@CdkDslMarker
public class CfnObjectTypeKeyMapPropertyDsl {
  private val cdkBuilder: CfnObjectType.KeyMapProperty.Builder =
      CfnObjectType.KeyMapProperty.builder()

  private val _objectTypeKeyList: MutableList<Any> = mutableListOf()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun objectTypeKeyList(vararg objectTypeKeyList: Any) {
    _objectTypeKeyList.addAll(listOf(*objectTypeKeyList))
  }

  public fun objectTypeKeyList(objectTypeKeyList: Collection<Any>) {
    _objectTypeKeyList.addAll(objectTypeKeyList)
  }

  public fun objectTypeKeyList(objectTypeKeyList: IResolvable) {
    cdkBuilder.objectTypeKeyList(objectTypeKeyList)
  }

  public fun build(): CfnObjectType.KeyMapProperty {
    if(_objectTypeKeyList.isNotEmpty()) cdkBuilder.objectTypeKeyList(_objectTypeKeyList)
    return cdkBuilder.build()
  }
}
