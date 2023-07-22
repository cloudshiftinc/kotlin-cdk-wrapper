@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.quicksight.CfnDataSet

@CdkDslMarker
public class CfnDataSetFieldFolderPropertyDsl {
  private val cdkBuilder: CfnDataSet.FieldFolderProperty.Builder =
      CfnDataSet.FieldFolderProperty.builder()

  private val _columns: MutableList<String> = mutableListOf()

  /**
   * @param columns A folder has a list of columns.
   * A column can only be in one folder.
   */
  public fun columns(vararg columns: String) {
    _columns.addAll(listOf(*columns))
  }

  /**
   * @param columns A folder has a list of columns.
   * A column can only be in one folder.
   */
  public fun columns(columns: Collection<String>) {
    _columns.addAll(columns)
  }

  /**
   * @param description The description for a field folder.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun build(): CfnDataSet.FieldFolderProperty {
    if(_columns.isNotEmpty()) cdkBuilder.columns(_columns)
    return cdkBuilder.build()
  }
}
