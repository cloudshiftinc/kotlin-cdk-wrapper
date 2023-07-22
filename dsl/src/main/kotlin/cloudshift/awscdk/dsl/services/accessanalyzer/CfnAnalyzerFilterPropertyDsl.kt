@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.accessanalyzer

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer

@CdkDslMarker
public class CfnAnalyzerFilterPropertyDsl {
  private val cdkBuilder: CfnAnalyzer.FilterProperty.Builder = CfnAnalyzer.FilterProperty.builder()

  private val _contains: MutableList<String> = mutableListOf()

  private val _eq: MutableList<String> = mutableListOf()

  private val _neq: MutableList<String> = mutableListOf()

  /**
   * @param contains A "contains" condition to match for the rule.
   */
  public fun contains(vararg contains: String) {
    _contains.addAll(listOf(*contains))
  }

  /**
   * @param contains A "contains" condition to match for the rule.
   */
  public fun contains(contains: Collection<String>) {
    _contains.addAll(contains)
  }

  /**
   * @param eq An "equals" condition to match for the rule.
   */
  public fun eq(vararg eq: String) {
    _eq.addAll(listOf(*eq))
  }

  /**
   * @param eq An "equals" condition to match for the rule.
   */
  public fun eq(eq: Collection<String>) {
    _eq.addAll(eq)
  }

  /**
   * @param exists An "exists" condition to match for the rule.
   */
  public fun exists(exists: Boolean) {
    cdkBuilder.exists(exists)
  }

  /**
   * @param exists An "exists" condition to match for the rule.
   */
  public fun exists(exists: IResolvable) {
    cdkBuilder.exists(exists)
  }

  /**
   * @param neq A "not equal" condition to match for the rule.
   */
  public fun neq(vararg neq: String) {
    _neq.addAll(listOf(*neq))
  }

  /**
   * @param neq A "not equal" condition to match for the rule.
   */
  public fun neq(neq: Collection<String>) {
    _neq.addAll(neq)
  }

  /**
   * @param property The property used to define the criteria in the filter for the rule. 
   */
  public fun `property`(`property`: String) {
    cdkBuilder.`property`(`property`)
  }

  public fun build(): CfnAnalyzer.FilterProperty {
    if(_contains.isNotEmpty()) cdkBuilder.contains(_contains)
    if(_eq.isNotEmpty()) cdkBuilder.eq(_eq)
    if(_neq.isNotEmpty()) cdkBuilder.neq(_neq)
    return cdkBuilder.build()
  }
}
