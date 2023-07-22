@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnTaskTemplate

@CdkDslMarker
public class CfnTaskTemplateFieldPropertyDsl {
  private val cdkBuilder: CfnTaskTemplate.FieldProperty.Builder =
      CfnTaskTemplate.FieldProperty.builder()

  private val _singleSelectOptions: MutableList<String> = mutableListOf()

  /**
   * @param description The description of the field.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param id The unique identifier for the field. 
   */
  public fun id(id: IResolvable) {
    cdkBuilder.id(id)
  }

  /**
   * @param id The unique identifier for the field. 
   */
  public fun id(id: CfnTaskTemplate.FieldIdentifierProperty) {
    cdkBuilder.id(id)
  }

  /**
   * @param singleSelectOptions A list of options for a single select field.
   */
  public fun singleSelectOptions(vararg singleSelectOptions: String) {
    _singleSelectOptions.addAll(listOf(*singleSelectOptions))
  }

  /**
   * @param singleSelectOptions A list of options for a single select field.
   */
  public fun singleSelectOptions(singleSelectOptions: Collection<String>) {
    _singleSelectOptions.addAll(singleSelectOptions)
  }

  /**
   * @param type Indicates the type of field. 
   * Following are the valid field types: `NAME` `DESCRIPTION` | `SCHEDULED_TIME` | `QUICK_CONNECT`
   * | `URL` | `NUMBER` | `TEXT` | `TEXT_AREA` | `DATE_TIME` | `BOOLEAN` | `SINGLE_SELECT` | `EMAIL`
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnTaskTemplate.FieldProperty {
    if(_singleSelectOptions.isNotEmpty()) cdkBuilder.singleSelectOptions(_singleSelectOptions)
    return cdkBuilder.build()
  }
}
