@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.customerprofiles.CfnIntegration

/**
 * The configurations that control how Customer Profiles retrieves data from the source, Amazon
 * AppFlow.
 *
 * Customer Profiles uses this information to create an AppFlow flow on behalf of customers.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.customerprofiles.*;
 * FlowDefinitionProperty flowDefinitionProperty = FlowDefinitionProperty.builder()
 * .flowName("flowName")
 * .kmsArn("kmsArn")
 * .sourceFlowConfig(SourceFlowConfigProperty.builder()
 * .connectorType("connectorType")
 * .sourceConnectorProperties(SourceConnectorPropertiesProperty.builder()
 * .marketo(MarketoSourcePropertiesProperty.builder()
 * .object("object")
 * .build())
 * .s3(S3SourcePropertiesProperty.builder()
 * .bucketName("bucketName")
 * // the properties below are optional
 * .bucketPrefix("bucketPrefix")
 * .build())
 * .salesforce(SalesforceSourcePropertiesProperty.builder()
 * .object("object")
 * // the properties below are optional
 * .enableDynamicFieldUpdate(false)
 * .includeDeletedRecords(false)
 * .build())
 * .serviceNow(ServiceNowSourcePropertiesProperty.builder()
 * .object("object")
 * .build())
 * .zendesk(ZendeskSourcePropertiesProperty.builder()
 * .object("object")
 * .build())
 * .build())
 * // the properties below are optional
 * .connectorProfileName("connectorProfileName")
 * .incrementalPullConfig(IncrementalPullConfigProperty.builder()
 * .datetimeTypeFieldName("datetimeTypeFieldName")
 * .build())
 * .build())
 * .tasks(List.of(TaskProperty.builder()
 * .sourceFields(List.of("sourceFields"))
 * .taskType("taskType")
 * // the properties below are optional
 * .connectorOperator(ConnectorOperatorProperty.builder()
 * .marketo("marketo")
 * .s3("s3")
 * .salesforce("salesforce")
 * .serviceNow("serviceNow")
 * .zendesk("zendesk")
 * .build())
 * .destinationField("destinationField")
 * .taskProperties(List.of(TaskPropertiesMapProperty.builder()
 * .operatorPropertyKey("operatorPropertyKey")
 * .property("property")
 * .build()))
 * .build()))
 * .triggerConfig(TriggerConfigProperty.builder()
 * .triggerType("triggerType")
 * // the properties below are optional
 * .triggerProperties(TriggerPropertiesProperty.builder()
 * .scheduled(ScheduledTriggerPropertiesProperty.builder()
 * .scheduleExpression("scheduleExpression")
 * // the properties below are optional
 * .dataPullMode("dataPullMode")
 * .firstExecutionFrom(123)
 * .scheduleEndTime(123)
 * .scheduleOffset(123)
 * .scheduleStartTime(123)
 * .timezone("timezone")
 * .build())
 * .build())
 * .build())
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-flowdefinition.html)
 */
@CdkDslMarker
public class CfnIntegrationFlowDefinitionPropertyDsl {
  private val cdkBuilder: CfnIntegration.FlowDefinitionProperty.Builder =
      CfnIntegration.FlowDefinitionProperty.builder()

  private val _tasks: MutableList<Any> = mutableListOf()

  /**
   * @param description A description of the flow you want to create.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param flowName The specified name of the flow. 
   * Use underscores (_) or hyphens (-) only. Spaces are not allowed.
   */
  public fun flowName(flowName: String) {
    cdkBuilder.flowName(flowName)
  }

  /**
   * @param kmsArn The Amazon Resource Name (ARN) of the AWS Key Management Service (KMS) key you
   * provide for encryption. 
   */
  public fun kmsArn(kmsArn: String) {
    cdkBuilder.kmsArn(kmsArn)
  }

  /**
   * @param sourceFlowConfig The configuration that controls how Customer Profiles retrieves data
   * from the source. 
   */
  public fun sourceFlowConfig(sourceFlowConfig: IResolvable) {
    cdkBuilder.sourceFlowConfig(sourceFlowConfig)
  }

  /**
   * @param sourceFlowConfig The configuration that controls how Customer Profiles retrieves data
   * from the source. 
   */
  public fun sourceFlowConfig(sourceFlowConfig: CfnIntegration.SourceFlowConfigProperty) {
    cdkBuilder.sourceFlowConfig(sourceFlowConfig)
  }

  /**
   * @param tasks A list of tasks that Customer Profiles performs while transferring the data in the
   * flow run. 
   */
  public fun tasks(vararg tasks: Any) {
    _tasks.addAll(listOf(*tasks))
  }

  /**
   * @param tasks A list of tasks that Customer Profiles performs while transferring the data in the
   * flow run. 
   */
  public fun tasks(tasks: Collection<Any>) {
    _tasks.addAll(tasks)
  }

  /**
   * @param tasks A list of tasks that Customer Profiles performs while transferring the data in the
   * flow run. 
   */
  public fun tasks(tasks: IResolvable) {
    cdkBuilder.tasks(tasks)
  }

  /**
   * @param triggerConfig The trigger settings that determine how and when the flow runs. 
   */
  public fun triggerConfig(triggerConfig: IResolvable) {
    cdkBuilder.triggerConfig(triggerConfig)
  }

  /**
   * @param triggerConfig The trigger settings that determine how and when the flow runs. 
   */
  public fun triggerConfig(triggerConfig: CfnIntegration.TriggerConfigProperty) {
    cdkBuilder.triggerConfig(triggerConfig)
  }

  public fun build(): CfnIntegration.FlowDefinitionProperty {
    if(_tasks.isNotEmpty()) cdkBuilder.tasks(_tasks)
    return cdkBuilder.build()
  }
}
