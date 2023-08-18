@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.connect

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnTaskTemplateProps

/**
 * Properties for defining a `CfnTaskTemplate`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
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
@CdkDslMarker
public class CfnTaskTemplatePropsDsl {
    private val cdkBuilder: CfnTaskTemplateProps.Builder = CfnTaskTemplateProps.builder()

    private val _defaults: MutableList<Any> = mutableListOf()

    private val _fields: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param clientToken A unique, case-sensitive identifier that you provide to ensure the
     *   idempotency of the request.
     */
    public fun clientToken(clientToken: String) {
        cdkBuilder.clientToken(clientToken)
    }

    /**
     * @param constraints Constraints that are applicable to the fields listed. The values can be
     *   represented in either JSON or YAML format. For an example of the JSON configuration, see
     *   *Examples* at the bottom of this page.
     */
    public fun constraints(constraints: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(constraints)
        cdkBuilder.constraints(builder.map)
    }

    /**
     * @param constraints Constraints that are applicable to the fields listed. The values can be
     *   represented in either JSON or YAML format. For an example of the JSON configuration, see
     *   *Examples* at the bottom of this page.
     */
    public fun constraints(constraints: Any) {
        cdkBuilder.constraints(constraints)
    }

    /**
     * @param contactFlowArn The Amazon Resource Name (ARN) of the flow that runs by default when a
     *   task is created by referencing this template. `ContactFlowArn` is not required when there
     *   is a field with `fieldType` = `QUICK_CONNECT` .
     */
    public fun contactFlowArn(contactFlowArn: String) {
        cdkBuilder.contactFlowArn(contactFlowArn)
    }

    /**
     * @param defaults The default values for fields when a task is created by referencing this
     *   template.
     */
    public fun defaults(vararg defaults: Any) {
        _defaults.addAll(listOf(*defaults))
    }

    /**
     * @param defaults The default values for fields when a task is created by referencing this
     *   template.
     */
    public fun defaults(defaults: Collection<Any>) {
        _defaults.addAll(defaults)
    }

    /**
     * @param defaults The default values for fields when a task is created by referencing this
     *   template.
     */
    public fun defaults(defaults: IResolvable) {
        cdkBuilder.defaults(defaults)
    }

    /** @param description The description of the task template. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param fields Fields that are part of the template. A template requires at least one field
     *   that has type `Name` .
     */
    public fun fields(vararg fields: Any) {
        _fields.addAll(listOf(*fields))
    }

    /**
     * @param fields Fields that are part of the template. A template requires at least one field
     *   that has type `Name` .
     */
    public fun fields(fields: Collection<Any>) {
        _fields.addAll(fields)
    }

    /**
     * @param fields Fields that are part of the template. A template requires at least one field
     *   that has type `Name` .
     */
    public fun fields(fields: IResolvable) {
        cdkBuilder.fields(fields)
    }

    /** @param instanceArn The Amazon Resource Name (ARN) of the Amazon Connect instance. */
    public fun instanceArn(instanceArn: String) {
        cdkBuilder.instanceArn(instanceArn)
    }

    /** @param name The name of the task template. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param status The status of the task template. */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    /** @param tags The tags used to organize, track, or control access for this resource. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags used to organize, track, or control access for this resource. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnTaskTemplateProps {
        if (_defaults.isNotEmpty()) cdkBuilder.defaults(_defaults)
        if (_fields.isNotEmpty()) cdkBuilder.fields(_fields)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
