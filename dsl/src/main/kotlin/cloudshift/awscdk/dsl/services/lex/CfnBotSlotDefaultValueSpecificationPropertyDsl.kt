@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotSlotDefaultValueSpecificationPropertyDsl {
  private val cdkBuilder: CfnBot.SlotDefaultValueSpecificationProperty.Builder =
      CfnBot.SlotDefaultValueSpecificationProperty.builder()

  private val _defaultValueList: MutableList<Any> = mutableListOf()

  /**
   * @param defaultValueList A list of default values. 
   * Amazon Lex chooses the default value to use in the order that they are presented in the list.
   */
  public fun defaultValueList(vararg defaultValueList: Any) {
    _defaultValueList.addAll(listOf(*defaultValueList))
  }

  /**
   * @param defaultValueList A list of default values. 
   * Amazon Lex chooses the default value to use in the order that they are presented in the list.
   */
  public fun defaultValueList(defaultValueList: Collection<Any>) {
    _defaultValueList.addAll(defaultValueList)
  }

  /**
   * @param defaultValueList A list of default values. 
   * Amazon Lex chooses the default value to use in the order that they are presented in the list.
   */
  public fun defaultValueList(defaultValueList: IResolvable) {
    cdkBuilder.defaultValueList(defaultValueList)
  }

  public fun build(): CfnBot.SlotDefaultValueSpecificationProperty {
    if(_defaultValueList.isNotEmpty()) cdkBuilder.defaultValueList(_defaultValueList)
    return cdkBuilder.build()
  }
}
