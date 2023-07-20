@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.quicksight.CfnTopic

@CdkDslMarker
public class CfnTopicCellValueSynonymPropertyDsl {
  private val cdkBuilder: CfnTopic.CellValueSynonymProperty.Builder =
      CfnTopic.CellValueSynonymProperty.builder()

  private val _synonyms: MutableList<String> = mutableListOf()

  public fun cellValue(cellValue: String) {
    cdkBuilder.cellValue(cellValue)
  }

  public fun synonyms(vararg synonyms: String) {
    _synonyms.addAll(listOf(*synonyms))
  }

  public fun synonyms(synonyms: Collection<String>) {
    _synonyms.addAll(synonyms)
  }

  public fun build(): CfnTopic.CellValueSynonymProperty {
    if(_synonyms.isNotEmpty()) cdkBuilder.synonyms(_synonyms)
    return cdkBuilder.build()
  }
}
