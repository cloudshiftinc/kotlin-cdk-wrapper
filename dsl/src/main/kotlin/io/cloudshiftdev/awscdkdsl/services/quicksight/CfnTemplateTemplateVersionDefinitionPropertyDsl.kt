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

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The detailed definition of a template.
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-templateversiondefinition.html)
 */
@CdkDslMarker
public class CfnTemplateTemplateVersionDefinitionPropertyDsl {
    private val cdkBuilder: CfnTemplate.TemplateVersionDefinitionProperty.Builder =
        CfnTemplate.TemplateVersionDefinitionProperty.builder()

    private val _calculatedFields: MutableList<Any> = mutableListOf()

    private val _columnConfigurations: MutableList<Any> = mutableListOf()

    private val _dataSetConfigurations: MutableList<Any> = mutableListOf()

    private val _filterGroups: MutableList<Any> = mutableListOf()

    private val _parameterDeclarations: MutableList<Any> = mutableListOf()

    private val _sheets: MutableList<Any> = mutableListOf()

    /** @param analysisDefaults the value to be set. */
    public fun analysisDefaults(analysisDefaults: IResolvable) {
        cdkBuilder.analysisDefaults(analysisDefaults)
    }

    /** @param analysisDefaults the value to be set. */
    public fun analysisDefaults(analysisDefaults: CfnTemplate.AnalysisDefaultsProperty) {
        cdkBuilder.analysisDefaults(analysisDefaults)
    }

    /** @param calculatedFields An array of calculated field definitions for the template. */
    public fun calculatedFields(vararg calculatedFields: Any) {
        _calculatedFields.addAll(listOf(*calculatedFields))
    }

    /** @param calculatedFields An array of calculated field definitions for the template. */
    public fun calculatedFields(calculatedFields: Collection<Any>) {
        _calculatedFields.addAll(calculatedFields)
    }

    /** @param calculatedFields An array of calculated field definitions for the template. */
    public fun calculatedFields(calculatedFields: IResolvable) {
        cdkBuilder.calculatedFields(calculatedFields)
    }

    /**
     * @param columnConfigurations An array of template-level column configurations. Column
     *   configurations are used to set default formatting for a column that's used throughout a
     *   template.
     */
    public fun columnConfigurations(vararg columnConfigurations: Any) {
        _columnConfigurations.addAll(listOf(*columnConfigurations))
    }

    /**
     * @param columnConfigurations An array of template-level column configurations. Column
     *   configurations are used to set default formatting for a column that's used throughout a
     *   template.
     */
    public fun columnConfigurations(columnConfigurations: Collection<Any>) {
        _columnConfigurations.addAll(columnConfigurations)
    }

    /**
     * @param columnConfigurations An array of template-level column configurations. Column
     *   configurations are used to set default formatting for a column that's used throughout a
     *   template.
     */
    public fun columnConfigurations(columnConfigurations: IResolvable) {
        cdkBuilder.columnConfigurations(columnConfigurations)
    }

    /**
     * @param dataSetConfigurations An array of dataset configurations. These configurations define
     *   the required columns for each dataset used within a template.
     */
    public fun dataSetConfigurations(vararg dataSetConfigurations: Any) {
        _dataSetConfigurations.addAll(listOf(*dataSetConfigurations))
    }

    /**
     * @param dataSetConfigurations An array of dataset configurations. These configurations define
     *   the required columns for each dataset used within a template.
     */
    public fun dataSetConfigurations(dataSetConfigurations: Collection<Any>) {
        _dataSetConfigurations.addAll(dataSetConfigurations)
    }

    /**
     * @param dataSetConfigurations An array of dataset configurations. These configurations define
     *   the required columns for each dataset used within a template.
     */
    public fun dataSetConfigurations(dataSetConfigurations: IResolvable) {
        cdkBuilder.dataSetConfigurations(dataSetConfigurations)
    }

    /**
     * @param filterGroups Filter definitions for a template. For more information, see
     *   [Filtering Data](https://docs.aws.amazon.com/quicksight/latest/user/filtering-visual-data.html)
     *   in the *Amazon QuickSight User Guide* .
     */
    public fun filterGroups(vararg filterGroups: Any) {
        _filterGroups.addAll(listOf(*filterGroups))
    }

    /**
     * @param filterGroups Filter definitions for a template. For more information, see
     *   [Filtering Data](https://docs.aws.amazon.com/quicksight/latest/user/filtering-visual-data.html)
     *   in the *Amazon QuickSight User Guide* .
     */
    public fun filterGroups(filterGroups: Collection<Any>) {
        _filterGroups.addAll(filterGroups)
    }

    /**
     * @param filterGroups Filter definitions for a template. For more information, see
     *   [Filtering Data](https://docs.aws.amazon.com/quicksight/latest/user/filtering-visual-data.html)
     *   in the *Amazon QuickSight User Guide* .
     */
    public fun filterGroups(filterGroups: IResolvable) {
        cdkBuilder.filterGroups(filterGroups)
    }

    /**
     * @param parameterDeclarations An array of parameter declarations for a template. *Parameters*
     *   are named variables that can transfer a value for use by an action or an object.
     *
     * For more information, see
     * [Parameters in Amazon QuickSight](https://docs.aws.amazon.com/quicksight/latest/user/parameters-in-quicksight.html)
     * in the *Amazon QuickSight User Guide* .
     */
    public fun parameterDeclarations(vararg parameterDeclarations: Any) {
        _parameterDeclarations.addAll(listOf(*parameterDeclarations))
    }

    /**
     * @param parameterDeclarations An array of parameter declarations for a template. *Parameters*
     *   are named variables that can transfer a value for use by an action or an object.
     *
     * For more information, see
     * [Parameters in Amazon QuickSight](https://docs.aws.amazon.com/quicksight/latest/user/parameters-in-quicksight.html)
     * in the *Amazon QuickSight User Guide* .
     */
    public fun parameterDeclarations(parameterDeclarations: Collection<Any>) {
        _parameterDeclarations.addAll(parameterDeclarations)
    }

    /**
     * @param parameterDeclarations An array of parameter declarations for a template. *Parameters*
     *   are named variables that can transfer a value for use by an action or an object.
     *
     * For more information, see
     * [Parameters in Amazon QuickSight](https://docs.aws.amazon.com/quicksight/latest/user/parameters-in-quicksight.html)
     * in the *Amazon QuickSight User Guide* .
     */
    public fun parameterDeclarations(parameterDeclarations: IResolvable) {
        cdkBuilder.parameterDeclarations(parameterDeclarations)
    }

    /** @param sheets An array of sheet definitions for a template. */
    public fun sheets(vararg sheets: Any) {
        _sheets.addAll(listOf(*sheets))
    }

    /** @param sheets An array of sheet definitions for a template. */
    public fun sheets(sheets: Collection<Any>) {
        _sheets.addAll(sheets)
    }

    /** @param sheets An array of sheet definitions for a template. */
    public fun sheets(sheets: IResolvable) {
        cdkBuilder.sheets(sheets)
    }

    public fun build(): CfnTemplate.TemplateVersionDefinitionProperty {
        if (_calculatedFields.isNotEmpty()) cdkBuilder.calculatedFields(_calculatedFields)
        if (_columnConfigurations.isNotEmpty())
            cdkBuilder.columnConfigurations(_columnConfigurations)
        if (_dataSetConfigurations.isNotEmpty())
            cdkBuilder.dataSetConfigurations(_dataSetConfigurations)
        if (_filterGroups.isNotEmpty()) cdkBuilder.filterGroups(_filterGroups)
        if (_parameterDeclarations.isNotEmpty())
            cdkBuilder.parameterDeclarations(_parameterDeclarations)
        if (_sheets.isNotEmpty()) cdkBuilder.sheets(_sheets)
        return cdkBuilder.build()
    }
}
