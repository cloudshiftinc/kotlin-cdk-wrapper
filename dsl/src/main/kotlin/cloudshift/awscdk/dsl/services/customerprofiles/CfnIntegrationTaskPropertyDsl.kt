@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.customerprofiles.CfnIntegration

@CdkDslMarker
public class CfnIntegrationTaskPropertyDsl {
  private val cdkBuilder: CfnIntegration.TaskProperty.Builder =
      CfnIntegration.TaskProperty.builder()

  private val _sourceFields: MutableList<String> = mutableListOf()

  private val _taskProperties: MutableList<Any> = mutableListOf()

  public fun connectorOperator(connectorOperator: IResolvable) {
    cdkBuilder.connectorOperator(connectorOperator)
  }

  public fun connectorOperator(connectorOperator: CfnIntegration.ConnectorOperatorProperty) {
    cdkBuilder.connectorOperator(connectorOperator)
  }

  public fun destinationField(destinationField: String) {
    cdkBuilder.destinationField(destinationField)
  }

  public fun sourceFields(vararg sourceFields: String) {
    _sourceFields.addAll(listOf(*sourceFields))
  }

  public fun sourceFields(sourceFields: Collection<String>) {
    _sourceFields.addAll(sourceFields)
  }

  public fun taskProperties(vararg taskProperties: Any) {
    _taskProperties.addAll(listOf(*taskProperties))
  }

  public fun taskProperties(taskProperties: Collection<Any>) {
    _taskProperties.addAll(taskProperties)
  }

  public fun taskProperties(taskProperties: IResolvable) {
    cdkBuilder.taskProperties(taskProperties)
  }

  public fun taskType(taskType: String) {
    cdkBuilder.taskType(taskType)
  }

  public fun build(): CfnIntegration.TaskProperty {
    if(_sourceFields.isNotEmpty()) cdkBuilder.sourceFields(_sourceFields)
    if(_taskProperties.isNotEmpty()) cdkBuilder.taskProperties(_taskProperties)
    return cdkBuilder.build()
  }
}
