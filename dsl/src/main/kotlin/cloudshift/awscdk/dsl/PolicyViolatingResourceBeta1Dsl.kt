@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.PolicyViolatingResourceBeta1

@CdkDslMarker
public class PolicyViolatingResourceBeta1Dsl {
  private val cdkBuilder: PolicyViolatingResourceBeta1.Builder =
      PolicyViolatingResourceBeta1.builder()

  private val _locations: MutableList<String> = mutableListOf()

  public fun locations(vararg locations: String) {
    _locations.addAll(listOf(*locations))
  }

  public fun locations(locations: Collection<String>) {
    _locations.addAll(locations)
  }

  public fun resourceLogicalId(resourceLogicalId: String) {
    cdkBuilder.resourceLogicalId(resourceLogicalId)
  }

  public fun templatePath(templatePath: String) {
    cdkBuilder.templatePath(templatePath)
  }

  public fun build(): PolicyViolatingResourceBeta1 {
    if(_locations.isNotEmpty()) cdkBuilder.locations(_locations)
    return cdkBuilder.build()
  }
}
