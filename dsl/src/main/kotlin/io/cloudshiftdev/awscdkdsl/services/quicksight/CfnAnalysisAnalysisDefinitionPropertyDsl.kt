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
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The definition of an analysis.
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-analysisdefinition.html)
 */
@CdkDslMarker
public class CfnAnalysisAnalysisDefinitionPropertyDsl {
    private val cdkBuilder: CfnAnalysis.AnalysisDefinitionProperty.Builder =
        CfnAnalysis.AnalysisDefinitionProperty.builder()

    private val _calculatedFields: MutableList<Any> = mutableListOf()

    private val _columnConfigurations: MutableList<Any> = mutableListOf()

    private val _dataSetIdentifierDeclarations: MutableList<Any> = mutableListOf()

    private val _filterGroups: MutableList<Any> = mutableListOf()

    private val _parameterDeclarations: MutableList<Any> = mutableListOf()

    private val _sheets: MutableList<Any> = mutableListOf()

    /** @param analysisDefaults the value to be set. */
    public fun analysisDefaults(analysisDefaults: IResolvable) {
        cdkBuilder.analysisDefaults(analysisDefaults)
    }

    /** @param analysisDefaults the value to be set. */
    public fun analysisDefaults(analysisDefaults: CfnAnalysis.AnalysisDefaultsProperty) {
        cdkBuilder.analysisDefaults(analysisDefaults)
    }

    /** @param calculatedFields An array of calculated field definitions for the analysis. */
    public fun calculatedFields(vararg calculatedFields: Any) {
        _calculatedFields.addAll(listOf(*calculatedFields))
    }

    /** @param calculatedFields An array of calculated field definitions for the analysis. */
    public fun calculatedFields(calculatedFields: Collection<Any>) {
        _calculatedFields.addAll(calculatedFields)
    }

    /** @param calculatedFields An array of calculated field definitions for the analysis. */
    public fun calculatedFields(calculatedFields: IResolvable) {
        cdkBuilder.calculatedFields(calculatedFields)
    }

    /**
     * @param columnConfigurations An array of analysis-level column configurations. Column
     *   configurations can be used to set default formatting for a column to be used throughout an
     *   analysis.
     */
    public fun columnConfigurations(vararg columnConfigurations: Any) {
        _columnConfigurations.addAll(listOf(*columnConfigurations))
    }

    /**
     * @param columnConfigurations An array of analysis-level column configurations. Column
     *   configurations can be used to set default formatting for a column to be used throughout an
     *   analysis.
     */
    public fun columnConfigurations(columnConfigurations: Collection<Any>) {
        _columnConfigurations.addAll(columnConfigurations)
    }

    /**
     * @param columnConfigurations An array of analysis-level column configurations. Column
     *   configurations can be used to set default formatting for a column to be used throughout an
     *   analysis.
     */
    public fun columnConfigurations(columnConfigurations: IResolvable) {
        cdkBuilder.columnConfigurations(columnConfigurations)
    }

    /**
     * @param dataSetIdentifierDeclarations An array of dataset identifier declarations. This
     *   mapping allows the usage of dataset identifiers instead of dataset ARNs throughout analysis
     *   sub-structures.
     */
    public fun dataSetIdentifierDeclarations(vararg dataSetIdentifierDeclarations: Any) {
        _dataSetIdentifierDeclarations.addAll(listOf(*dataSetIdentifierDeclarations))
    }

    /**
     * @param dataSetIdentifierDeclarations An array of dataset identifier declarations. This
     *   mapping allows the usage of dataset identifiers instead of dataset ARNs throughout analysis
     *   sub-structures.
     */
    public fun dataSetIdentifierDeclarations(dataSetIdentifierDeclarations: Collection<Any>) {
        _dataSetIdentifierDeclarations.addAll(dataSetIdentifierDeclarations)
    }

    /**
     * @param dataSetIdentifierDeclarations An array of dataset identifier declarations. This
     *   mapping allows the usage of dataset identifiers instead of dataset ARNs throughout analysis
     *   sub-structures.
     */
    public fun dataSetIdentifierDeclarations(dataSetIdentifierDeclarations: IResolvable) {
        cdkBuilder.dataSetIdentifierDeclarations(dataSetIdentifierDeclarations)
    }

    /**
     * @param filterGroups Filter definitions for an analysis. For more information, see
     *   [Filtering Data in Amazon QuickSight](https://docs.aws.amazon.com/quicksight/latest/user/adding-a-filter.html)
     *   in the *Amazon QuickSight User Guide* .
     */
    public fun filterGroups(vararg filterGroups: Any) {
        _filterGroups.addAll(listOf(*filterGroups))
    }

    /**
     * @param filterGroups Filter definitions for an analysis. For more information, see
     *   [Filtering Data in Amazon QuickSight](https://docs.aws.amazon.com/quicksight/latest/user/adding-a-filter.html)
     *   in the *Amazon QuickSight User Guide* .
     */
    public fun filterGroups(filterGroups: Collection<Any>) {
        _filterGroups.addAll(filterGroups)
    }

    /**
     * @param filterGroups Filter definitions for an analysis. For more information, see
     *   [Filtering Data in Amazon QuickSight](https://docs.aws.amazon.com/quicksight/latest/user/adding-a-filter.html)
     *   in the *Amazon QuickSight User Guide* .
     */
    public fun filterGroups(filterGroups: IResolvable) {
        cdkBuilder.filterGroups(filterGroups)
    }

    /**
     * @param parameterDeclarations An array of parameter declarations for an analysis. Parameters
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
     * @param parameterDeclarations An array of parameter declarations for an analysis. Parameters
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
     * @param parameterDeclarations An array of parameter declarations for an analysis. Parameters
     *   are named variables that can transfer a value for use by an action or an object.
     *
     * For more information, see
     * [Parameters in Amazon QuickSight](https://docs.aws.amazon.com/quicksight/latest/user/parameters-in-quicksight.html)
     * in the *Amazon QuickSight User Guide* .
     */
    public fun parameterDeclarations(parameterDeclarations: IResolvable) {
        cdkBuilder.parameterDeclarations(parameterDeclarations)
    }

    /**
     * @param sheets An array of sheet definitions for an analysis. Each `SheetDefinition` provides
     *   detailed information about a sheet within this analysis.
     */
    public fun sheets(vararg sheets: Any) {
        _sheets.addAll(listOf(*sheets))
    }

    /**
     * @param sheets An array of sheet definitions for an analysis. Each `SheetDefinition` provides
     *   detailed information about a sheet within this analysis.
     */
    public fun sheets(sheets: Collection<Any>) {
        _sheets.addAll(sheets)
    }

    /**
     * @param sheets An array of sheet definitions for an analysis. Each `SheetDefinition` provides
     *   detailed information about a sheet within this analysis.
     */
    public fun sheets(sheets: IResolvable) {
        cdkBuilder.sheets(sheets)
    }

    public fun build(): CfnAnalysis.AnalysisDefinitionProperty {
        if (_calculatedFields.isNotEmpty()) cdkBuilder.calculatedFields(_calculatedFields)
        if (_columnConfigurations.isNotEmpty())
            cdkBuilder.columnConfigurations(_columnConfigurations)
        if (_dataSetIdentifierDeclarations.isNotEmpty())
            cdkBuilder.dataSetIdentifierDeclarations(_dataSetIdentifierDeclarations)
        if (_filterGroups.isNotEmpty()) cdkBuilder.filterGroups(_filterGroups)
        if (_parameterDeclarations.isNotEmpty())
            cdkBuilder.parameterDeclarations(_parameterDeclarations)
        if (_sheets.isNotEmpty()) cdkBuilder.sheets(_sheets)
        return cdkBuilder.build()
    }
}
