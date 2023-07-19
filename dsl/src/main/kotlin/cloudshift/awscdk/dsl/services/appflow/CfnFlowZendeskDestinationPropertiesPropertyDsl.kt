@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnFlow

@CdkDslMarker
public class CfnFlowZendeskDestinationPropertiesPropertyDsl {
  private val cdkBuilder: CfnFlow.ZendeskDestinationPropertiesProperty.Builder =
      CfnFlow.ZendeskDestinationPropertiesProperty.builder()

  private val _idFieldNames: MutableList<String> = mutableListOf()

  public fun errorHandlingConfig(errorHandlingConfig: IResolvable) {
    cdkBuilder.errorHandlingConfig(errorHandlingConfig)
  }

  public fun errorHandlingConfig(errorHandlingConfig: CfnFlow.ErrorHandlingConfigProperty) {
    cdkBuilder.errorHandlingConfig(errorHandlingConfig)
  }

  public fun idFieldNames(vararg idFieldNames: String) {
    _idFieldNames.addAll(listOf(*idFieldNames))
  }

  public fun idFieldNames(idFieldNames: Collection<String>) {
    _idFieldNames.addAll(idFieldNames)
  }

  public fun `object`(`object`: String) {
    cdkBuilder.`object`(`object`)
  }

  public fun writeOperationType(writeOperationType: String) {
    cdkBuilder.writeOperationType(writeOperationType)
  }

  public fun build(): CfnFlow.ZendeskDestinationPropertiesProperty {
    if(_idFieldNames.isNotEmpty()) cdkBuilder.idFieldNames(_idFieldNames)
    return cdkBuilder.build()
  }
}
