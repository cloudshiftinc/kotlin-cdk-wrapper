@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.CfnInstance

@CdkDslMarker
public class CfnInstanceAssociationParameterPropertyDsl {
  private val cdkBuilder: CfnInstance.AssociationParameterProperty.Builder =
      CfnInstance.AssociationParameterProperty.builder()

  private val _value: MutableList<String> = mutableListOf()

  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  public fun `value`(vararg `value`: String) {
    _value.addAll(listOf(*`value`))
  }

  public fun `value`(`value`: Collection<String>) {
    _value.addAll(`value`)
  }

  public fun build(): CfnInstance.AssociationParameterProperty {
    if(_value.isNotEmpty()) cdkBuilder.`value`(_value)
    return cdkBuilder.build()
  }
}
