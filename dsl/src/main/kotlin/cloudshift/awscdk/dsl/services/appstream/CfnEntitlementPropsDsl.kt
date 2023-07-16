@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appstream.CfnEntitlementProps

@CdkDslMarker
public class CfnEntitlementPropsDsl {
  private val cdkBuilder: CfnEntitlementProps.Builder = CfnEntitlementProps.builder()

  private val _attributes: MutableList<Any> = mutableListOf()

  public fun appVisibility(appVisibility: String) {
    cdkBuilder.appVisibility(appVisibility)
  }

  public fun attributes(vararg attributes: Any) {
    _attributes.addAll(listOf(*attributes))
  }

  public fun attributes(attributes: Collection<Any>) {
    _attributes.addAll(attributes)
  }

  public fun attributes(attributes: IResolvable) {
    cdkBuilder.attributes(attributes)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun stackName(stackName: String) {
    cdkBuilder.stackName(stackName)
  }

  public fun build(): CfnEntitlementProps {
    if(_attributes.isNotEmpty()) cdkBuilder.attributes(_attributes)
    return cdkBuilder.build()
  }
}
