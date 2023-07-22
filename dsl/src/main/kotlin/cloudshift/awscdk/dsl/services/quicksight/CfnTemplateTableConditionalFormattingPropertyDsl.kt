@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateTableConditionalFormattingPropertyDsl {
  private val cdkBuilder: CfnTemplate.TableConditionalFormattingProperty.Builder =
      CfnTemplate.TableConditionalFormattingProperty.builder()

  private val _conditionalFormattingOptions: MutableList<Any> = mutableListOf()

  /**
   * @param conditionalFormattingOptions Conditional formatting options for a `PivotTableVisual` .
   */
  public fun conditionalFormattingOptions(vararg conditionalFormattingOptions: Any) {
    _conditionalFormattingOptions.addAll(listOf(*conditionalFormattingOptions))
  }

  /**
   * @param conditionalFormattingOptions Conditional formatting options for a `PivotTableVisual` .
   */
  public fun conditionalFormattingOptions(conditionalFormattingOptions: Collection<Any>) {
    _conditionalFormattingOptions.addAll(conditionalFormattingOptions)
  }

  /**
   * @param conditionalFormattingOptions Conditional formatting options for a `PivotTableVisual` .
   */
  public fun conditionalFormattingOptions(conditionalFormattingOptions: IResolvable) {
    cdkBuilder.conditionalFormattingOptions(conditionalFormattingOptions)
  }

  public fun build(): CfnTemplate.TableConditionalFormattingProperty {
    if(_conditionalFormattingOptions.isNotEmpty())
        cdkBuilder.conditionalFormattingOptions(_conditionalFormattingOptions)
    return cdkBuilder.build()
  }
}
