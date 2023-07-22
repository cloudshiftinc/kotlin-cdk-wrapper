@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTopic

@CdkDslMarker
public class CfnTopicSemanticTypePropertyDsl {
  private val cdkBuilder: CfnTopic.SemanticTypeProperty.Builder =
      CfnTopic.SemanticTypeProperty.builder()

  private val _falseyCellValueSynonyms: MutableList<String> = mutableListOf()

  private val _truthyCellValueSynonyms: MutableList<String> = mutableListOf()

  /**
   * @param falseyCellValue The semantic type falsey cell value.
   */
  public fun falseyCellValue(falseyCellValue: String) {
    cdkBuilder.falseyCellValue(falseyCellValue)
  }

  /**
   * @param falseyCellValueSynonyms The other names or aliases for the false cell value.
   */
  public fun falseyCellValueSynonyms(vararg falseyCellValueSynonyms: String) {
    _falseyCellValueSynonyms.addAll(listOf(*falseyCellValueSynonyms))
  }

  /**
   * @param falseyCellValueSynonyms The other names or aliases for the false cell value.
   */
  public fun falseyCellValueSynonyms(falseyCellValueSynonyms: Collection<String>) {
    _falseyCellValueSynonyms.addAll(falseyCellValueSynonyms)
  }

  /**
   * @param subTypeName The semantic type sub type name.
   */
  public fun subTypeName(subTypeName: String) {
    cdkBuilder.subTypeName(subTypeName)
  }

  /**
   * @param truthyCellValue The semantic type truthy cell value.
   */
  public fun truthyCellValue(truthyCellValue: String) {
    cdkBuilder.truthyCellValue(truthyCellValue)
  }

  /**
   * @param truthyCellValueSynonyms The other names or aliases for the true cell value.
   */
  public fun truthyCellValueSynonyms(vararg truthyCellValueSynonyms: String) {
    _truthyCellValueSynonyms.addAll(listOf(*truthyCellValueSynonyms))
  }

  /**
   * @param truthyCellValueSynonyms The other names or aliases for the true cell value.
   */
  public fun truthyCellValueSynonyms(truthyCellValueSynonyms: Collection<String>) {
    _truthyCellValueSynonyms.addAll(truthyCellValueSynonyms)
  }

  /**
   * @param typeName The semantic type name.
   */
  public fun typeName(typeName: String) {
    cdkBuilder.typeName(typeName)
  }

  /**
   * @param typeParameters The semantic type parameters.
   */
  public fun typeParameters(typeParameters: Map<String, String>) {
    cdkBuilder.typeParameters(typeParameters)
  }

  /**
   * @param typeParameters The semantic type parameters.
   */
  public fun typeParameters(typeParameters: IResolvable) {
    cdkBuilder.typeParameters(typeParameters)
  }

  public fun build(): CfnTopic.SemanticTypeProperty {
    if(_falseyCellValueSynonyms.isNotEmpty())
        cdkBuilder.falseyCellValueSynonyms(_falseyCellValueSynonyms)
    if(_truthyCellValueSynonyms.isNotEmpty())
        cdkBuilder.truthyCellValueSynonyms(_truthyCellValueSynonyms)
    return cdkBuilder.build()
  }
}
