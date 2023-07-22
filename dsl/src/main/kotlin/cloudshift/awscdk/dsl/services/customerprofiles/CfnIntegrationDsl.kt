@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.customerprofiles.CfnIntegration
import software.constructs.Construct

/**
 * Specifies an Amazon Connect Customer Profiles Integration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.customerprofiles.*;
 * CfnIntegration cfnIntegration = CfnIntegration.Builder.create(this, "MyCfnIntegration")
 * .domainName("domainName")
 * // the properties below are optional
 * .flowDefinition(FlowDefinitionProperty.builder()
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
 * .build())
 * .objectTypeName("objectTypeName")
 * .objectTypeNames(List.of(ObjectTypeMappingProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .uri("uri")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-integration.html)
 */
@CdkDslMarker
public class CfnIntegrationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnIntegration.Builder = CfnIntegration.Builder.create(scope, id)

  private val _objectTypeNames: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The unique name of the domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-integration.html#cfn-customerprofiles-integration-domainname)
   * @param domainName The unique name of the domain. 
   */
  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  /**
   * The configuration that controls how Customer Profiles retrieves data from the source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-integration.html#cfn-customerprofiles-integration-flowdefinition)
   * @param flowDefinition The configuration that controls how Customer Profiles retrieves data from
   * the source. 
   */
  public fun flowDefinition(flowDefinition: IResolvable) {
    cdkBuilder.flowDefinition(flowDefinition)
  }

  /**
   * The configuration that controls how Customer Profiles retrieves data from the source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-integration.html#cfn-customerprofiles-integration-flowdefinition)
   * @param flowDefinition The configuration that controls how Customer Profiles retrieves data from
   * the source. 
   */
  public fun flowDefinition(flowDefinition: CfnIntegration.FlowDefinitionProperty) {
    cdkBuilder.flowDefinition(flowDefinition)
  }

  /**
   * The name of the profile object type mapping to use.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-integration.html#cfn-customerprofiles-integration-objecttypename)
   * @param objectTypeName The name of the profile object type mapping to use. 
   */
  public fun objectTypeName(objectTypeName: String) {
    cdkBuilder.objectTypeName(objectTypeName)
  }

  /**
   * The object type mapping.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-integration.html#cfn-customerprofiles-integration-objecttypenames)
   * @param objectTypeNames The object type mapping. 
   */
  public fun objectTypeNames(vararg objectTypeNames: Any) {
    _objectTypeNames.addAll(listOf(*objectTypeNames))
  }

  /**
   * The object type mapping.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-integration.html#cfn-customerprofiles-integration-objecttypenames)
   * @param objectTypeNames The object type mapping. 
   */
  public fun objectTypeNames(objectTypeNames: Collection<Any>) {
    _objectTypeNames.addAll(objectTypeNames)
  }

  /**
   * The object type mapping.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-integration.html#cfn-customerprofiles-integration-objecttypenames)
   * @param objectTypeNames The object type mapping. 
   */
  public fun objectTypeNames(objectTypeNames: IResolvable) {
    cdkBuilder.objectTypeNames(objectTypeNames)
  }

  /**
   * The tags used to organize, track, or control access for this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-integration.html#cfn-customerprofiles-integration-tags)
   * @param tags The tags used to organize, track, or control access for this resource. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The tags used to organize, track, or control access for this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-integration.html#cfn-customerprofiles-integration-tags)
   * @param tags The tags used to organize, track, or control access for this resource. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * The URI of the S3 bucket or any other type of data source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-integration.html#cfn-customerprofiles-integration-uri)
   * @param uri The URI of the S3 bucket or any other type of data source. 
   */
  public fun uri(uri: String) {
    cdkBuilder.uri(uri)
  }

  public fun build(): CfnIntegration {
    if(_objectTypeNames.isNotEmpty()) cdkBuilder.objectTypeNames(_objectTypeNames)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
