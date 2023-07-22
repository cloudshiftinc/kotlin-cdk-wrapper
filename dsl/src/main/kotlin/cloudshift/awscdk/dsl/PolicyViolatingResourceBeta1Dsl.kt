@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.PolicyViolatingResourceBeta1

/**
 * Resource violating a specific rule.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * PolicyViolatingResourceBeta1 policyViolatingResourceBeta1 =
 * PolicyViolatingResourceBeta1.builder()
 * .locations(List.of("locations"))
 * .resourceLogicalId("resourceLogicalId")
 * .templatePath("templatePath")
 * .build();
 * ```
 */
@CdkDslMarker
public class PolicyViolatingResourceBeta1Dsl {
  private val cdkBuilder: PolicyViolatingResourceBeta1.Builder =
      PolicyViolatingResourceBeta1.builder()

  private val _locations: MutableList<String> = mutableListOf()

  /**
   * @param locations The locations in the CloudFormation template that pose the violations. 
   */
  public fun locations(vararg locations: String) {
    _locations.addAll(listOf(*locations))
  }

  /**
   * @param locations The locations in the CloudFormation template that pose the violations. 
   */
  public fun locations(locations: Collection<String>) {
    _locations.addAll(locations)
  }

  /**
   * @param resourceLogicalId The logical ID of the resource in the CloudFormation template. 
   */
  public fun resourceLogicalId(resourceLogicalId: String) {
    cdkBuilder.resourceLogicalId(resourceLogicalId)
  }

  /**
   * @param templatePath The path to the CloudFormation template that contains this resource. 
   */
  public fun templatePath(templatePath: String) {
    cdkBuilder.templatePath(templatePath)
  }

  public fun build(): PolicyViolatingResourceBeta1 {
    if(_locations.isNotEmpty()) cdkBuilder.locations(_locations)
    return cdkBuilder.build()
  }
}
