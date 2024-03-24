@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnTaskTemplate`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.connect.*;
 * Object constraints;
 * CfnTaskTemplateProps cfnTaskTemplateProps = CfnTaskTemplateProps.builder()
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
public interface CfnTaskTemplateProps {
  /**
   * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-clienttoken)
   */
  public fun clientToken(): String? = unwrap(this).getClientToken()

  /**
   * Constraints that are applicable to the fields listed.
   *
   * The values can be represented in either JSON or YAML format. For an example of the JSON
   * configuration, see *Examples* at the bottom of this page.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-constraints)
   */
  public fun constraints(): Any? = unwrap(this).getConstraints()

  /**
   * The Amazon Resource Name (ARN) of the flow that runs by default when a task is created by
   * referencing this template.
   *
   * `ContactFlowArn` is not required when there is a field with `fieldType` = `QUICK_CONNECT` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-contactflowarn)
   */
  public fun contactFlowArn(): String? = unwrap(this).getContactFlowArn()

  /**
   * The default values for fields when a task is created by referencing this template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-defaults)
   */
  public fun defaults(): Any? = unwrap(this).getDefaults()

  /**
   * The description of the task template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Fields that are part of the template.
   *
   * A template requires at least one field that has type `Name` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-fields)
   */
  public fun fields(): Any? = unwrap(this).getFields()

  /**
   * The Amazon Resource Name (ARN) of the Amazon Connect instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-instancearn)
   */
  public fun instanceArn(): String

  /**
   * The name of the task template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The status of the task template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-status)
   */
  public fun status(): String? = unwrap(this).getStatus()

  /**
   * The tags used to organize, track, or control access for this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnTaskTemplateProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param clientToken A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request.
     */
    public fun clientToken(clientToken: String)

    /**
     * @param constraints Constraints that are applicable to the fields listed.
     * The values can be represented in either JSON or YAML format. For an example of the JSON
     * configuration, see *Examples* at the bottom of this page.
     */
    public fun constraints(constraints: Any)

    /**
     * @param contactFlowArn The Amazon Resource Name (ARN) of the flow that runs by default when a
     * task is created by referencing this template.
     * `ContactFlowArn` is not required when there is a field with `fieldType` = `QUICK_CONNECT` .
     */
    public fun contactFlowArn(contactFlowArn: String)

    /**
     * @param defaults The default values for fields when a task is created by referencing this
     * template.
     */
    public fun defaults(defaults: IResolvable)

    /**
     * @param defaults The default values for fields when a task is created by referencing this
     * template.
     */
    public fun defaults(defaults: List<Any>)

    /**
     * @param defaults The default values for fields when a task is created by referencing this
     * template.
     */
    public fun defaults(vararg defaults: Any)

    /**
     * @param description The description of the task template.
     */
    public fun description(description: String)

    /**
     * @param fields Fields that are part of the template.
     * A template requires at least one field that has type `Name` .
     */
    public fun fields(fields: IResolvable)

    /**
     * @param fields Fields that are part of the template.
     * A template requires at least one field that has type `Name` .
     */
    public fun fields(fields: List<Any>)

    /**
     * @param fields Fields that are part of the template.
     * A template requires at least one field that has type `Name` .
     */
    public fun fields(vararg fields: Any)

    /**
     * @param instanceArn The Amazon Resource Name (ARN) of the Amazon Connect instance. 
     */
    public fun instanceArn(instanceArn: String)

    /**
     * @param name The name of the task template.
     */
    public fun name(name: String)

    /**
     * @param status The status of the task template.
     */
    public fun status(status: String)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnTaskTemplateProps.Builder =
        software.amazon.awscdk.services.connect.CfnTaskTemplateProps.builder()

    /**
     * @param clientToken A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request.
     */
    override fun clientToken(clientToken: String) {
      cdkBuilder.clientToken(clientToken)
    }

    /**
     * @param constraints Constraints that are applicable to the fields listed.
     * The values can be represented in either JSON or YAML format. For an example of the JSON
     * configuration, see *Examples* at the bottom of this page.
     */
    override fun constraints(constraints: Any) {
      cdkBuilder.constraints(constraints)
    }

    /**
     * @param contactFlowArn The Amazon Resource Name (ARN) of the flow that runs by default when a
     * task is created by referencing this template.
     * `ContactFlowArn` is not required when there is a field with `fieldType` = `QUICK_CONNECT` .
     */
    override fun contactFlowArn(contactFlowArn: String) {
      cdkBuilder.contactFlowArn(contactFlowArn)
    }

    /**
     * @param defaults The default values for fields when a task is created by referencing this
     * template.
     */
    override fun defaults(defaults: IResolvable) {
      cdkBuilder.defaults(defaults.let(IResolvable::unwrap))
    }

    /**
     * @param defaults The default values for fields when a task is created by referencing this
     * template.
     */
    override fun defaults(defaults: List<Any>) {
      cdkBuilder.defaults(defaults.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param defaults The default values for fields when a task is created by referencing this
     * template.
     */
    override fun defaults(vararg defaults: Any): Unit = defaults(defaults.toList())

    /**
     * @param description The description of the task template.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param fields Fields that are part of the template.
     * A template requires at least one field that has type `Name` .
     */
    override fun fields(fields: IResolvable) {
      cdkBuilder.fields(fields.let(IResolvable::unwrap))
    }

    /**
     * @param fields Fields that are part of the template.
     * A template requires at least one field that has type `Name` .
     */
    override fun fields(fields: List<Any>) {
      cdkBuilder.fields(fields.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param fields Fields that are part of the template.
     * A template requires at least one field that has type `Name` .
     */
    override fun fields(vararg fields: Any): Unit = fields(fields.toList())

    /**
     * @param instanceArn The Amazon Resource Name (ARN) of the Amazon Connect instance. 
     */
    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * @param name The name of the task template.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param status The status of the task template.
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.connect.CfnTaskTemplateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.connect.CfnTaskTemplateProps,
  ) : CdkObject(cdkObject), CfnTaskTemplateProps {
    /**
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the
     * request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-clienttoken)
     */
    override fun clientToken(): String? = unwrap(this).getClientToken()

    /**
     * Constraints that are applicable to the fields listed.
     *
     * The values can be represented in either JSON or YAML format. For an example of the JSON
     * configuration, see *Examples* at the bottom of this page.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-constraints)
     */
    override fun constraints(): Any? = unwrap(this).getConstraints()

    /**
     * The Amazon Resource Name (ARN) of the flow that runs by default when a task is created by
     * referencing this template.
     *
     * `ContactFlowArn` is not required when there is a field with `fieldType` = `QUICK_CONNECT` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-contactflowarn)
     */
    override fun contactFlowArn(): String? = unwrap(this).getContactFlowArn()

    /**
     * The default values for fields when a task is created by referencing this template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-defaults)
     */
    override fun defaults(): Any? = unwrap(this).getDefaults()

    /**
     * The description of the task template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Fields that are part of the template.
     *
     * A template requires at least one field that has type `Name` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-fields)
     */
    override fun fields(): Any? = unwrap(this).getFields()

    /**
     * The Amazon Resource Name (ARN) of the Amazon Connect instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-instancearn)
     */
    override fun instanceArn(): String = unwrap(this).getInstanceArn()

    /**
     * The name of the task template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The status of the task template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-status)
     */
    override fun status(): String? = unwrap(this).getStatus()

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTaskTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnTaskTemplateProps):
        CfnTaskTemplateProps = CdkObjectWrappers.wrap(cdkObject) as? CfnTaskTemplateProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTaskTemplateProps):
        software.amazon.awscdk.services.connect.CfnTaskTemplateProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.connect.CfnTaskTemplateProps
  }
}
