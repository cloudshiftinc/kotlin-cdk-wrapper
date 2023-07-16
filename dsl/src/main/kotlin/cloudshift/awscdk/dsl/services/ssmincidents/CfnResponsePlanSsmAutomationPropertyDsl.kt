@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssmincidents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmincidents.CfnResponsePlan

@CdkDslMarker
public class CfnResponsePlanSsmAutomationPropertyDsl {
  private val cdkBuilder: CfnResponsePlan.SsmAutomationProperty.Builder =
      CfnResponsePlan.SsmAutomationProperty.builder()

  private val _dynamicParameters: MutableList<Any> = mutableListOf()

  private val _parameters: MutableList<Any> = mutableListOf()

  public fun documentName(documentName: String) {
    cdkBuilder.documentName(documentName)
  }

  public fun documentVersion(documentVersion: String) {
    cdkBuilder.documentVersion(documentVersion)
  }

  public fun dynamicParameters(vararg dynamicParameters: Any) {
    _dynamicParameters.addAll(listOf(*dynamicParameters))
  }

  public fun dynamicParameters(dynamicParameters: Collection<Any>) {
    _dynamicParameters.addAll(dynamicParameters)
  }

  public fun dynamicParameters(dynamicParameters: IResolvable) {
    cdkBuilder.dynamicParameters(dynamicParameters)
  }

  public fun parameters(vararg parameters: Any) {
    _parameters.addAll(listOf(*parameters))
  }

  public fun parameters(parameters: Collection<Any>) {
    _parameters.addAll(parameters)
  }

  public fun parameters(parameters: IResolvable) {
    cdkBuilder.parameters(parameters)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun targetAccount(targetAccount: String) {
    cdkBuilder.targetAccount(targetAccount)
  }

  public fun build(): CfnResponsePlan.SsmAutomationProperty {
    if(_dynamicParameters.isNotEmpty()) cdkBuilder.dynamicParameters(_dynamicParameters)
    if(_parameters.isNotEmpty()) cdkBuilder.parameters(_parameters)
    return cdkBuilder.build()
  }
}
