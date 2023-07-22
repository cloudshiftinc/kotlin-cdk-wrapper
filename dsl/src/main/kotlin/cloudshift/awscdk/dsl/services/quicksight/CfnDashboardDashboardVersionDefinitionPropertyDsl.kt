@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The contents of a dashboard.
 *
 * Example:
 *
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-dashboardversiondefinition.html)
 */
@CdkDslMarker
public class CfnDashboardDashboardVersionDefinitionPropertyDsl {
  private val cdkBuilder: CfnDashboard.DashboardVersionDefinitionProperty.Builder =
      CfnDashboard.DashboardVersionDefinitionProperty.builder()

  private val _calculatedFields: MutableList<Any> = mutableListOf()

  private val _columnConfigurations: MutableList<Any> = mutableListOf()

  private val _dataSetIdentifierDeclarations: MutableList<Any> = mutableListOf()

  private val _filterGroups: MutableList<Any> = mutableListOf()

  private val _parameterDeclarations: MutableList<Any> = mutableListOf()

  private val _sheets: MutableList<Any> = mutableListOf()

  /**
   * @param analysisDefaults the value to be set.
   */
  public fun analysisDefaults(analysisDefaults: IResolvable) {
    cdkBuilder.analysisDefaults(analysisDefaults)
  }

  /**
   * @param analysisDefaults the value to be set.
   */
  public fun analysisDefaults(analysisDefaults: CfnDashboard.AnalysisDefaultsProperty) {
    cdkBuilder.analysisDefaults(analysisDefaults)
  }

  /**
   * @param calculatedFields An array of calculated field definitions for the dashboard.
   */
  public fun calculatedFields(vararg calculatedFields: Any) {
    _calculatedFields.addAll(listOf(*calculatedFields))
  }

  /**
   * @param calculatedFields An array of calculated field definitions for the dashboard.
   */
  public fun calculatedFields(calculatedFields: Collection<Any>) {
    _calculatedFields.addAll(calculatedFields)
  }

  /**
   * @param calculatedFields An array of calculated field definitions for the dashboard.
   */
  public fun calculatedFields(calculatedFields: IResolvable) {
    cdkBuilder.calculatedFields(calculatedFields)
  }

  /**
   * @param columnConfigurations An array of dashboard-level column configurations.
   * Column configurations are used to set the default formatting for a column that is used
   * throughout a dashboard.
   */
  public fun columnConfigurations(vararg columnConfigurations: Any) {
    _columnConfigurations.addAll(listOf(*columnConfigurations))
  }

  /**
   * @param columnConfigurations An array of dashboard-level column configurations.
   * Column configurations are used to set the default formatting for a column that is used
   * throughout a dashboard.
   */
  public fun columnConfigurations(columnConfigurations: Collection<Any>) {
    _columnConfigurations.addAll(columnConfigurations)
  }

  /**
   * @param columnConfigurations An array of dashboard-level column configurations.
   * Column configurations are used to set the default formatting for a column that is used
   * throughout a dashboard.
   */
  public fun columnConfigurations(columnConfigurations: IResolvable) {
    cdkBuilder.columnConfigurations(columnConfigurations)
  }

  /**
   * @param dataSetIdentifierDeclarations An array of dataset identifier declarations. 
   * With this mapping,you can use dataset identifiers instead of dataset Amazon Resource Names
   * (ARNs) throughout the dashboard's sub-structures.
   */
  public fun dataSetIdentifierDeclarations(vararg dataSetIdentifierDeclarations: Any) {
    _dataSetIdentifierDeclarations.addAll(listOf(*dataSetIdentifierDeclarations))
  }

  /**
   * @param dataSetIdentifierDeclarations An array of dataset identifier declarations. 
   * With this mapping,you can use dataset identifiers instead of dataset Amazon Resource Names
   * (ARNs) throughout the dashboard's sub-structures.
   */
  public fun dataSetIdentifierDeclarations(dataSetIdentifierDeclarations: Collection<Any>) {
    _dataSetIdentifierDeclarations.addAll(dataSetIdentifierDeclarations)
  }

  /**
   * @param dataSetIdentifierDeclarations An array of dataset identifier declarations. 
   * With this mapping,you can use dataset identifiers instead of dataset Amazon Resource Names
   * (ARNs) throughout the dashboard's sub-structures.
   */
  public fun dataSetIdentifierDeclarations(dataSetIdentifierDeclarations: IResolvable) {
    cdkBuilder.dataSetIdentifierDeclarations(dataSetIdentifierDeclarations)
  }

  /**
   * @param filterGroups The filter definitions for a dashboard.
   * For more information, see [Filtering Data in Amazon
   * QuickSight](https://docs.aws.amazon.com/quicksight/latest/user/adding-a-filter.html) in the
   * *Amazon QuickSight User Guide* .
   */
  public fun filterGroups(vararg filterGroups: Any) {
    _filterGroups.addAll(listOf(*filterGroups))
  }

  /**
   * @param filterGroups The filter definitions for a dashboard.
   * For more information, see [Filtering Data in Amazon
   * QuickSight](https://docs.aws.amazon.com/quicksight/latest/user/adding-a-filter.html) in the
   * *Amazon QuickSight User Guide* .
   */
  public fun filterGroups(filterGroups: Collection<Any>) {
    _filterGroups.addAll(filterGroups)
  }

  /**
   * @param filterGroups The filter definitions for a dashboard.
   * For more information, see [Filtering Data in Amazon
   * QuickSight](https://docs.aws.amazon.com/quicksight/latest/user/adding-a-filter.html) in the
   * *Amazon QuickSight User Guide* .
   */
  public fun filterGroups(filterGroups: IResolvable) {
    cdkBuilder.filterGroups(filterGroups)
  }

  /**
   * @param parameterDeclarations The parameter declarations for a dashboard.
   * Parameters are named variables that can transfer a value for use by an action or an object.
   *
   * For more information, see [Parameters in Amazon
   * QuickSight](https://docs.aws.amazon.com/quicksight/latest/user/parameters-in-quicksight.html) in
   * the *Amazon QuickSight User Guide* .
   */
  public fun parameterDeclarations(vararg parameterDeclarations: Any) {
    _parameterDeclarations.addAll(listOf(*parameterDeclarations))
  }

  /**
   * @param parameterDeclarations The parameter declarations for a dashboard.
   * Parameters are named variables that can transfer a value for use by an action or an object.
   *
   * For more information, see [Parameters in Amazon
   * QuickSight](https://docs.aws.amazon.com/quicksight/latest/user/parameters-in-quicksight.html) in
   * the *Amazon QuickSight User Guide* .
   */
  public fun parameterDeclarations(parameterDeclarations: Collection<Any>) {
    _parameterDeclarations.addAll(parameterDeclarations)
  }

  /**
   * @param parameterDeclarations The parameter declarations for a dashboard.
   * Parameters are named variables that can transfer a value for use by an action or an object.
   *
   * For more information, see [Parameters in Amazon
   * QuickSight](https://docs.aws.amazon.com/quicksight/latest/user/parameters-in-quicksight.html) in
   * the *Amazon QuickSight User Guide* .
   */
  public fun parameterDeclarations(parameterDeclarations: IResolvable) {
    cdkBuilder.parameterDeclarations(parameterDeclarations)
  }

  /**
   * @param sheets An array of sheet definitions for a dashboard.
   */
  public fun sheets(vararg sheets: Any) {
    _sheets.addAll(listOf(*sheets))
  }

  /**
   * @param sheets An array of sheet definitions for a dashboard.
   */
  public fun sheets(sheets: Collection<Any>) {
    _sheets.addAll(sheets)
  }

  /**
   * @param sheets An array of sheet definitions for a dashboard.
   */
  public fun sheets(sheets: IResolvable) {
    cdkBuilder.sheets(sheets)
  }

  public fun build(): CfnDashboard.DashboardVersionDefinitionProperty {
    if(_calculatedFields.isNotEmpty()) cdkBuilder.calculatedFields(_calculatedFields)
    if(_columnConfigurations.isNotEmpty()) cdkBuilder.columnConfigurations(_columnConfigurations)
    if(_dataSetIdentifierDeclarations.isNotEmpty())
        cdkBuilder.dataSetIdentifierDeclarations(_dataSetIdentifierDeclarations)
    if(_filterGroups.isNotEmpty()) cdkBuilder.filterGroups(_filterGroups)
    if(_parameterDeclarations.isNotEmpty()) cdkBuilder.parameterDeclarations(_parameterDeclarations)
    if(_sheets.isNotEmpty()) cdkBuilder.sheets(_sheets)
    return cdkBuilder.build()
  }
}
