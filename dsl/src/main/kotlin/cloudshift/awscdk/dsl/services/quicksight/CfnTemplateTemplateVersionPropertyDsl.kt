@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * A version of a template.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TemplateVersionProperty templateVersionProperty = TemplateVersionProperty.builder()
 * .createdTime("createdTime")
 * .dataSetConfigurations(List.of(DataSetConfigurationProperty.builder()
 * .columnGroupSchemaList(List.of(ColumnGroupSchemaProperty.builder()
 * .columnGroupColumnSchemaList(List.of(ColumnGroupColumnSchemaProperty.builder()
 * .name("name")
 * .build()))
 * .name("name")
 * .build()))
 * .dataSetSchema(DataSetSchemaProperty.builder()
 * .columnSchemaList(List.of(ColumnSchemaProperty.builder()
 * .dataType("dataType")
 * .geographicRole("geographicRole")
 * .name("name")
 * .build()))
 * .build())
 * .placeholder("placeholder")
 * .build()))
 * .description("description")
 * .errors(List.of(TemplateErrorProperty.builder()
 * .message("message")
 * .type("type")
 * .violatedEntities(List.of(EntityProperty.builder()
 * .path("path")
 * .build()))
 * .build()))
 * .sheets(List.of(SheetProperty.builder()
 * .name("name")
 * .sheetId("sheetId")
 * .build()))
 * .sourceEntityArn("sourceEntityArn")
 * .status("status")
 * .themeArn("themeArn")
 * .versionNumber(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-templateversion.html)
 */
@CdkDslMarker
public class CfnTemplateTemplateVersionPropertyDsl {
    private val cdkBuilder: CfnTemplate.TemplateVersionProperty.Builder =
        CfnTemplate.TemplateVersionProperty.builder()

    private val _dataSetConfigurations: MutableList<Any> = mutableListOf()

    private val _errors: MutableList<Any> = mutableListOf()

    private val _sheets: MutableList<Any> = mutableListOf()

    /**
     * @param createdTime The time that this template version was created.
     */
    public fun createdTime(createdTime: String) {
        cdkBuilder.createdTime(createdTime)
    }

    /**
     * @param dataSetConfigurations Schema of the dataset identified by the placeholder.
     * Any dashboard created from this template should be bound to new datasets matching the same
     * schema described through this API operation.
     */
    public fun dataSetConfigurations(vararg dataSetConfigurations: Any) {
        _dataSetConfigurations.addAll(listOf(*dataSetConfigurations))
    }

    /**
     * @param dataSetConfigurations Schema of the dataset identified by the placeholder.
     * Any dashboard created from this template should be bound to new datasets matching the same
     * schema described through this API operation.
     */
    public fun dataSetConfigurations(dataSetConfigurations: Collection<Any>) {
        _dataSetConfigurations.addAll(dataSetConfigurations)
    }

    /**
     * @param dataSetConfigurations Schema of the dataset identified by the placeholder.
     * Any dashboard created from this template should be bound to new datasets matching the same
     * schema described through this API operation.
     */
    public fun dataSetConfigurations(dataSetConfigurations: IResolvable) {
        cdkBuilder.dataSetConfigurations(dataSetConfigurations)
    }

    /**
     * @param description The description of the template.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param errors Errors associated with this template version.
     */
    public fun errors(vararg errors: Any) {
        _errors.addAll(listOf(*errors))
    }

    /**
     * @param errors Errors associated with this template version.
     */
    public fun errors(errors: Collection<Any>) {
        _errors.addAll(errors)
    }

    /**
     * @param errors Errors associated with this template version.
     */
    public fun errors(errors: IResolvable) {
        cdkBuilder.errors(errors)
    }

    /**
     * @param sheets A list of the associated sheets with the unique identifier and name of each
     * sheet.
     */
    public fun sheets(vararg sheets: Any) {
        _sheets.addAll(listOf(*sheets))
    }

    /**
     * @param sheets A list of the associated sheets with the unique identifier and name of each
     * sheet.
     */
    public fun sheets(sheets: Collection<Any>) {
        _sheets.addAll(sheets)
    }

    /**
     * @param sheets A list of the associated sheets with the unique identifier and name of each
     * sheet.
     */
    public fun sheets(sheets: IResolvable) {
        cdkBuilder.sheets(sheets)
    }

    /**
     * @param sourceEntityArn The Amazon Resource Name (ARN) of an analysis or template that was used
     * to create this template.
     */
    public fun sourceEntityArn(sourceEntityArn: String) {
        cdkBuilder.sourceEntityArn(sourceEntityArn)
    }

    /**
     * @param status The status that is associated with the template.
     * * `CREATION_IN_PROGRESS`
     * * `CREATION_SUCCESSFUL`
     * * `CREATION_FAILED`
     * * `UPDATE_IN_PROGRESS`
     * * `UPDATE_SUCCESSFUL`
     * * `UPDATE_FAILED`
     * * `DELETED`
     */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    /**
     * @param themeArn The ARN of the theme associated with this version of the template.
     */
    public fun themeArn(themeArn: String) {
        cdkBuilder.themeArn(themeArn)
    }

    /**
     * @param versionNumber The version number of the template version.
     */
    public fun versionNumber(versionNumber: Number) {
        cdkBuilder.versionNumber(versionNumber)
    }

    public fun build(): CfnTemplate.TemplateVersionProperty {
        if (_dataSetConfigurations.isNotEmpty()) cdkBuilder.dataSetConfigurations(_dataSetConfigurations)
        if (_errors.isNotEmpty()) cdkBuilder.errors(_errors)
        if (_sheets.isNotEmpty()) cdkBuilder.sheets(_sheets)
        return cdkBuilder.build()
    }
}
