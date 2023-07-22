@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssmincidents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmincidents.CfnResponsePlan

/**
 * The `SsmAutomation` property type specifies details about the Systems Manager automation document
 * that will be used as a runbook during an incident.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssmincidents.*;
 * SsmAutomationProperty ssmAutomationProperty = SsmAutomationProperty.builder()
 * .documentName("documentName")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .documentVersion("documentVersion")
 * .dynamicParameters(List.of(DynamicSsmParameterProperty.builder()
 * .key("key")
 * .value(DynamicSsmParameterValueProperty.builder()
 * .variable("variable")
 * .build())
 * .build()))
 * .parameters(List.of(SsmParameterProperty.builder()
 * .key("key")
 * .values(List.of("values"))
 * .build()))
 * .targetAccount("targetAccount")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-ssmautomation.html)
 */
@CdkDslMarker
public class CfnResponsePlanSsmAutomationPropertyDsl {
  private val cdkBuilder: CfnResponsePlan.SsmAutomationProperty.Builder =
      CfnResponsePlan.SsmAutomationProperty.builder()

  private val _dynamicParameters: MutableList<Any> = mutableListOf()

  private val _parameters: MutableList<Any> = mutableListOf()

  /**
   * @param documentName The automation document's name. 
   */
  public fun documentName(documentName: String) {
    cdkBuilder.documentName(documentName)
  }

  /**
   * @param documentVersion The automation document's version to use when running.
   */
  public fun documentVersion(documentVersion: String) {
    cdkBuilder.documentVersion(documentVersion)
  }

  /**
   * @param dynamicParameters The key-value pairs to resolve dynamic parameter values when
   * processing a Systems Manager Automation runbook.
   */
  public fun dynamicParameters(vararg dynamicParameters: Any) {
    _dynamicParameters.addAll(listOf(*dynamicParameters))
  }

  /**
   * @param dynamicParameters The key-value pairs to resolve dynamic parameter values when
   * processing a Systems Manager Automation runbook.
   */
  public fun dynamicParameters(dynamicParameters: Collection<Any>) {
    _dynamicParameters.addAll(dynamicParameters)
  }

  /**
   * @param dynamicParameters The key-value pairs to resolve dynamic parameter values when
   * processing a Systems Manager Automation runbook.
   */
  public fun dynamicParameters(dynamicParameters: IResolvable) {
    cdkBuilder.dynamicParameters(dynamicParameters)
  }

  /**
   * @param parameters The key-value pair parameters to use when running the automation document.
   */
  public fun parameters(vararg parameters: Any) {
    _parameters.addAll(listOf(*parameters))
  }

  /**
   * @param parameters The key-value pair parameters to use when running the automation document.
   */
  public fun parameters(parameters: Collection<Any>) {
    _parameters.addAll(parameters)
  }

  /**
   * @param parameters The key-value pair parameters to use when running the automation document.
   */
  public fun parameters(parameters: IResolvable) {
    cdkBuilder.parameters(parameters)
  }

  /**
   * @param roleArn The Amazon Resource Name (ARN) of the role that the automation document will
   * assume when running commands. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * @param targetAccount The account that the automation document will be run in.
   * This can be in either the management account or an application account.
   */
  public fun targetAccount(targetAccount: String) {
    cdkBuilder.targetAccount(targetAccount)
  }

  public fun build(): CfnResponsePlan.SsmAutomationProperty {
    if(_dynamicParameters.isNotEmpty()) cdkBuilder.dynamicParameters(_dynamicParameters)
    if(_parameters.isNotEmpty()) cdkBuilder.parameters(_parameters)
    return cdkBuilder.build()
  }
}
