@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iottwinmaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iottwinmaker.CfnEntity

/**
 * The entity definition.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iottwinmaker.*;
 * DataTypeProperty dataTypeProperty_;
 * DataValueProperty dataValueProperty_;
 * Object relationshipValue;
 * DefinitionProperty definitionProperty = DefinitionProperty.builder()
 * .configuration(Map.of(
 * "configurationKey", "configuration"))
 * .dataType(DataTypeProperty.builder()
 * .allowedValues(List.of(DataValueProperty.builder()
 * .booleanValue(false)
 * .doubleValue(123)
 * .expression("expression")
 * .integerValue(123)
 * .listValue(List.of(dataValueProperty_))
 * .longValue(123)
 * .mapValue(Map.of(
 * "mapValueKey", dataValueProperty_))
 * .relationshipValue(relationshipValue)
 * .stringValue("stringValue")
 * .build()))
 * .nestedType(dataTypeProperty_)
 * .relationship(RelationshipProperty.builder()
 * .relationshipType("relationshipType")
 * .targetComponentTypeId("targetComponentTypeId")
 * .build())
 * .type("type")
 * .unitOfMeasure("unitOfMeasure")
 * .build())
 * .defaultValue(DataValueProperty.builder()
 * .booleanValue(false)
 * .doubleValue(123)
 * .expression("expression")
 * .integerValue(123)
 * .listValue(List.of(dataValueProperty_))
 * .longValue(123)
 * .mapValue(Map.of(
 * "mapValueKey", dataValueProperty_))
 * .relationshipValue(relationshipValue)
 * .stringValue("stringValue")
 * .build())
 * .isExternalId(false)
 * .isFinal(false)
 * .isImported(false)
 * .isInherited(false)
 * .isRequiredInEntity(false)
 * .isStoredExternally(false)
 * .isTimeSeries(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-definition.html)
 */
@CdkDslMarker
public class CfnEntityDefinitionPropertyDsl {
  private val cdkBuilder: CfnEntity.DefinitionProperty.Builder =
      CfnEntity.DefinitionProperty.builder()

  /**
   * @param configuration The configuration.
   */
  public fun configuration(configuration: Map<String, String>) {
    cdkBuilder.configuration(configuration)
  }

  /**
   * @param configuration The configuration.
   */
  public fun configuration(configuration: IResolvable) {
    cdkBuilder.configuration(configuration)
  }

  /**
   * @param dataType The data type.
   */
  public fun dataType(dataType: IResolvable) {
    cdkBuilder.dataType(dataType)
  }

  /**
   * @param dataType The data type.
   */
  public fun dataType(dataType: CfnEntity.DataTypeProperty) {
    cdkBuilder.dataType(dataType)
  }

  /**
   * @param defaultValue The default value.
   */
  public fun defaultValue(defaultValue: IResolvable) {
    cdkBuilder.defaultValue(defaultValue)
  }

  /**
   * @param defaultValue The default value.
   */
  public fun defaultValue(defaultValue: CfnEntity.DataValueProperty) {
    cdkBuilder.defaultValue(defaultValue)
  }

  /**
   * @param isExternalId Displays if the entity has a external Id.
   */
  public fun isExternalId(isExternalId: Boolean) {
    cdkBuilder.isExternalId(isExternalId)
  }

  /**
   * @param isExternalId Displays if the entity has a external Id.
   */
  public fun isExternalId(isExternalId: IResolvable) {
    cdkBuilder.isExternalId(isExternalId)
  }

  /**
   * @param isFinal Displays if the entity is final.
   */
  public fun isFinal(isFinal: Boolean) {
    cdkBuilder.isFinal(isFinal)
  }

  /**
   * @param isFinal Displays if the entity is final.
   */
  public fun isFinal(isFinal: IResolvable) {
    cdkBuilder.isFinal(isFinal)
  }

  /**
   * @param isImported Displays if the entity is imported.
   */
  public fun isImported(isImported: Boolean) {
    cdkBuilder.isImported(isImported)
  }

  /**
   * @param isImported Displays if the entity is imported.
   */
  public fun isImported(isImported: IResolvable) {
    cdkBuilder.isImported(isImported)
  }

  /**
   * @param isInherited Displays if the entity is inherited.
   */
  public fun isInherited(isInherited: Boolean) {
    cdkBuilder.isInherited(isInherited)
  }

  /**
   * @param isInherited Displays if the entity is inherited.
   */
  public fun isInherited(isInherited: IResolvable) {
    cdkBuilder.isInherited(isInherited)
  }

  /**
   * @param isRequiredInEntity Displays if the entity is a required entity.
   */
  public fun isRequiredInEntity(isRequiredInEntity: Boolean) {
    cdkBuilder.isRequiredInEntity(isRequiredInEntity)
  }

  /**
   * @param isRequiredInEntity Displays if the entity is a required entity.
   */
  public fun isRequiredInEntity(isRequiredInEntity: IResolvable) {
    cdkBuilder.isRequiredInEntity(isRequiredInEntity)
  }

  /**
   * @param isStoredExternally Displays if the entity is tored externally.
   */
  public fun isStoredExternally(isStoredExternally: Boolean) {
    cdkBuilder.isStoredExternally(isStoredExternally)
  }

  /**
   * @param isStoredExternally Displays if the entity is tored externally.
   */
  public fun isStoredExternally(isStoredExternally: IResolvable) {
    cdkBuilder.isStoredExternally(isStoredExternally)
  }

  /**
   * @param isTimeSeries Displays if the entity.
   */
  public fun isTimeSeries(isTimeSeries: Boolean) {
    cdkBuilder.isTimeSeries(isTimeSeries)
  }

  /**
   * @param isTimeSeries Displays if the entity.
   */
  public fun isTimeSeries(isTimeSeries: IResolvable) {
    cdkBuilder.isTimeSeries(isTimeSeries)
  }

  public fun build(): CfnEntity.DefinitionProperty = cdkBuilder.build()
}
