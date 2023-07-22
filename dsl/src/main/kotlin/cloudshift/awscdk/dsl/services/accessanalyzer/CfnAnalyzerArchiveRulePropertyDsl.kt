@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.accessanalyzer

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer

@CdkDslMarker
public class CfnAnalyzerArchiveRulePropertyDsl {
  private val cdkBuilder: CfnAnalyzer.ArchiveRuleProperty.Builder =
      CfnAnalyzer.ArchiveRuleProperty.builder()

  private val _filter: MutableList<Any> = mutableListOf()

  /**
   * @param filter The criteria for the rule. 
   */
  public fun filter(vararg filter: Any) {
    _filter.addAll(listOf(*filter))
  }

  /**
   * @param filter The criteria for the rule. 
   */
  public fun filter(filter: Collection<Any>) {
    _filter.addAll(filter)
  }

  /**
   * @param filter The criteria for the rule. 
   */
  public fun filter(filter: IResolvable) {
    cdkBuilder.filter(filter)
  }

  /**
   * @param ruleName The name of the archive rule. 
   */
  public fun ruleName(ruleName: String) {
    cdkBuilder.ruleName(ruleName)
  }

  public fun build(): CfnAnalyzer.ArchiveRuleProperty {
    if(_filter.isNotEmpty()) cdkBuilder.filter(_filter)
    return cdkBuilder.build()
  }
}
