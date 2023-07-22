@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The column group schema.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ColumnGroupSchemaProperty columnGroupSchemaProperty = ColumnGroupSchemaProperty.builder()
 * .columnGroupColumnSchemaList(List.of(ColumnGroupColumnSchemaProperty.builder()
 * .name("name")
 * .build()))
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-columngroupschema.html)
 */
@CdkDslMarker
public class CfnTemplateColumnGroupSchemaPropertyDsl {
  private val cdkBuilder: CfnTemplate.ColumnGroupSchemaProperty.Builder =
      CfnTemplate.ColumnGroupSchemaProperty.builder()

  private val _columnGroupColumnSchemaList: MutableList<Any> = mutableListOf()

  /**
   * @param columnGroupColumnSchemaList A structure containing the list of schemas for column group
   * columns.
   */
  public fun columnGroupColumnSchemaList(vararg columnGroupColumnSchemaList: Any) {
    _columnGroupColumnSchemaList.addAll(listOf(*columnGroupColumnSchemaList))
  }

  /**
   * @param columnGroupColumnSchemaList A structure containing the list of schemas for column group
   * columns.
   */
  public fun columnGroupColumnSchemaList(columnGroupColumnSchemaList: Collection<Any>) {
    _columnGroupColumnSchemaList.addAll(columnGroupColumnSchemaList)
  }

  /**
   * @param columnGroupColumnSchemaList A structure containing the list of schemas for column group
   * columns.
   */
  public fun columnGroupColumnSchemaList(columnGroupColumnSchemaList: IResolvable) {
    cdkBuilder.columnGroupColumnSchemaList(columnGroupColumnSchemaList)
  }

  /**
   * @param name The name of the column group schema.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnTemplate.ColumnGroupSchemaProperty {
    if(_columnGroupColumnSchemaList.isNotEmpty())
        cdkBuilder.columnGroupColumnSchemaList(_columnGroupColumnSchemaList)
    return cdkBuilder.build()
  }
}
