@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnTaskTemplate
import software.constructs.Construct

/**
 * Specifies a task template for a Amazon Connect instance.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * Object constraints;
 * CfnTaskTemplate cfnTaskTemplate = CfnTaskTemplate.Builder.create(this, "MyCfnTaskTemplate")
 * .instanceArn("instanceArn")
 * // the properties below are optional
 * .clientToken("clientToken")
 * .constraints(constraints)
 * .contactFlowArn("contactFlowArn")
 * .defaults(List.of(DefaultFieldValueProperty.builder()
 * .defaultValue("defaultValue")
 * .id(FieldIdentifierProperty.builder()
 * .name("name")
 * .build())
 * .build()))
 * .description("description")
 * .fields(List.of(FieldProperty.builder()
 * .id(FieldIdentifierProperty.builder()
 * .name("name")
 * .build())
 * .type("type")
 * // the properties below are optional
 * .description("description")
 * .singleSelectOptions(List.of("singleSelectOptions"))
 * .build()))
 * .name("name")
 * .status("status")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html)
 */
@CdkDslMarker
public class CfnTaskTemplateDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnTaskTemplate.Builder = CfnTaskTemplate.Builder.create(scope, id)

  private val _defaults: MutableList<Any> = mutableListOf()

  private val _fields: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-clienttoken)
   * @param clientToken A unique, case-sensitive identifier that you provide to ensure the
   * idempotency of the request. 
   */
  public fun clientToken(clientToken: String) {
    cdkBuilder.clientToken(clientToken)
  }

  /**
   * Constraints that are applicable to the fields listed.
   *
   * The values can be represented in either JSON or YAML format. For an example of the JSON
   * configuration, see *Examples* at the bottom of this page.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-constraints)
   * @param constraints Constraints that are applicable to the fields listed. 
   */
  public fun constraints(constraints: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(constraints)
    cdkBuilder.constraints(builder.map)
  }

  /**
   * Constraints that are applicable to the fields listed.
   *
   * The values can be represented in either JSON or YAML format. For an example of the JSON
   * configuration, see *Examples* at the bottom of this page.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-constraints)
   * @param constraints Constraints that are applicable to the fields listed. 
   */
  public fun constraints(constraints: Any) {
    cdkBuilder.constraints(constraints)
  }

  /**
   * The Amazon Resource Name (ARN) of the flow that runs by default when a task is created by
   * referencing this template.
   *
   * `ContactFlowArn` is not required when there is a field with `fieldType` = `QUICK_CONNECT` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-contactflowarn)
   * @param contactFlowArn The Amazon Resource Name (ARN) of the flow that runs by default when a
   * task is created by referencing this template. 
   */
  public fun contactFlowArn(contactFlowArn: String) {
    cdkBuilder.contactFlowArn(contactFlowArn)
  }

  /**
   * The default values for fields when a task is created by referencing this template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-defaults)
   * @param defaults The default values for fields when a task is created by referencing this
   * template. 
   */
  public fun defaults(vararg defaults: Any) {
    _defaults.addAll(listOf(*defaults))
  }

  /**
   * The default values for fields when a task is created by referencing this template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-defaults)
   * @param defaults The default values for fields when a task is created by referencing this
   * template. 
   */
  public fun defaults(defaults: Collection<Any>) {
    _defaults.addAll(defaults)
  }

  /**
   * The default values for fields when a task is created by referencing this template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-defaults)
   * @param defaults The default values for fields when a task is created by referencing this
   * template. 
   */
  public fun defaults(defaults: IResolvable) {
    cdkBuilder.defaults(defaults)
  }

  /**
   * The description of the task template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-description)
   * @param description The description of the task template. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * Fields that are part of the template.
   *
   * A template requires at least one field that has type `Name` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-fields)
   * @param fields Fields that are part of the template. 
   */
  public fun fields(vararg fields: Any) {
    _fields.addAll(listOf(*fields))
  }

  /**
   * Fields that are part of the template.
   *
   * A template requires at least one field that has type `Name` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-fields)
   * @param fields Fields that are part of the template. 
   */
  public fun fields(fields: Collection<Any>) {
    _fields.addAll(fields)
  }

  /**
   * Fields that are part of the template.
   *
   * A template requires at least one field that has type `Name` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-fields)
   * @param fields Fields that are part of the template. 
   */
  public fun fields(fields: IResolvable) {
    cdkBuilder.fields(fields)
  }

  /**
   * The Amazon Resource Name (ARN) of the Amazon Connect instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-instancearn)
   * @param instanceArn The Amazon Resource Name (ARN) of the Amazon Connect instance. 
   */
  public fun instanceArn(instanceArn: String) {
    cdkBuilder.instanceArn(instanceArn)
  }

  /**
   * The name of the task template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-name)
   * @param name The name of the task template. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The status of the task template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-status)
   * @param status The status of the task template. 
   */
  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  /**
   * The tags used to organize, track, or control access for this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-tags)
   * @param tags The tags used to organize, track, or control access for this resource. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The tags used to organize, track, or control access for this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-tags)
   * @param tags The tags used to organize, track, or control access for this resource. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnTaskTemplate {
    if(_defaults.isNotEmpty()) cdkBuilder.defaults(_defaults)
    if(_fields.isNotEmpty()) cdkBuilder.fields(_fields)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
