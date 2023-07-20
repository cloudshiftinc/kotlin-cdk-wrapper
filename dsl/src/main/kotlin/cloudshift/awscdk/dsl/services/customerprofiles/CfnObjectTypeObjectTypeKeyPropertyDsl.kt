@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.customerprofiles.CfnObjectType

@CdkDslMarker
public class CfnObjectTypeObjectTypeKeyPropertyDsl {
  private val cdkBuilder: CfnObjectType.ObjectTypeKeyProperty.Builder =
      CfnObjectType.ObjectTypeKeyProperty.builder()

  private val _fieldNames: MutableList<String> = mutableListOf()

  private val _standardIdentifiers: MutableList<String> = mutableListOf()

  public fun fieldNames(vararg fieldNames: String) {
    _fieldNames.addAll(listOf(*fieldNames))
  }

  public fun fieldNames(fieldNames: Collection<String>) {
    _fieldNames.addAll(fieldNames)
  }

  public fun standardIdentifiers(vararg standardIdentifiers: String) {
    _standardIdentifiers.addAll(listOf(*standardIdentifiers))
  }

  public fun standardIdentifiers(standardIdentifiers: Collection<String>) {
    _standardIdentifiers.addAll(standardIdentifiers)
  }

  public fun build(): CfnObjectType.ObjectTypeKeyProperty {
    if(_fieldNames.isNotEmpty()) cdkBuilder.fieldNames(_fieldNames)
    if(_standardIdentifiers.isNotEmpty()) cdkBuilder.standardIdentifiers(_standardIdentifiers)
    return cdkBuilder.build()
  }
}
