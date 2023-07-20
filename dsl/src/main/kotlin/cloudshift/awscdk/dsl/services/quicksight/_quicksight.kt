@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import software.amazon.awscdk.services.quicksight.CfnAnalysisProps
import software.amazon.awscdk.services.quicksight.CfnDashboard
import software.amazon.awscdk.services.quicksight.CfnDashboardProps
import software.amazon.awscdk.services.quicksight.CfnDataSet
import software.amazon.awscdk.services.quicksight.CfnDataSetProps
import software.amazon.awscdk.services.quicksight.CfnDataSource
import software.amazon.awscdk.services.quicksight.CfnDataSourceProps
import software.amazon.awscdk.services.quicksight.CfnRefreshSchedule
import software.amazon.awscdk.services.quicksight.CfnRefreshScheduleProps
import software.amazon.awscdk.services.quicksight.CfnTemplate
import software.amazon.awscdk.services.quicksight.CfnTemplateProps
import software.amazon.awscdk.services.quicksight.CfnTheme
import software.amazon.awscdk.services.quicksight.CfnThemeProps
import software.amazon.awscdk.services.quicksight.CfnTopic
import software.amazon.awscdk.services.quicksight.CfnTopicProps
import software.amazon.awscdk.services.quicksight.CfnVPCConnection
import software.amazon.awscdk.services.quicksight.CfnVPCConnectionProps
import software.constructs.Construct

public object quicksight {
  public inline fun cfnAnalysis(
    scope: Construct,
    id: String,
    block: CfnAnalysisDsl.() -> Unit = {},
  ): CfnAnalysis {
    val builder = CfnAnalysisDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisAggregationFunctionProperty(block: CfnAnalysisAggregationFunctionPropertyDsl.() -> Unit
      = {}): CfnAnalysis.AggregationFunctionProperty {
    val builder = CfnAnalysisAggregationFunctionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisAggregationSortConfigurationProperty(block: CfnAnalysisAggregationSortConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.AggregationSortConfigurationProperty {
    val builder = CfnAnalysisAggregationSortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisAnalysisDefaultsProperty(block: CfnAnalysisAnalysisDefaultsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.AnalysisDefaultsProperty {
    val builder = CfnAnalysisAnalysisDefaultsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisAnalysisDefinitionProperty(block: CfnAnalysisAnalysisDefinitionPropertyDsl.() -> Unit
      = {}): CfnAnalysis.AnalysisDefinitionProperty {
    val builder = CfnAnalysisAnalysisDefinitionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisAnalysisErrorProperty(block: CfnAnalysisAnalysisErrorPropertyDsl.() -> Unit =
      {}): CfnAnalysis.AnalysisErrorProperty {
    val builder = CfnAnalysisAnalysisErrorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisAnalysisSourceEntityProperty(block: CfnAnalysisAnalysisSourceEntityPropertyDsl.() -> Unit
      = {}): CfnAnalysis.AnalysisSourceEntityProperty {
    val builder = CfnAnalysisAnalysisSourceEntityPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisAnalysisSourceTemplateProperty(block: CfnAnalysisAnalysisSourceTemplatePropertyDsl.() -> Unit
      = {}): CfnAnalysis.AnalysisSourceTemplateProperty {
    val builder = CfnAnalysisAnalysisSourceTemplatePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisAnchorDateConfigurationProperty(block: CfnAnalysisAnchorDateConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.AnchorDateConfigurationProperty {
    val builder = CfnAnalysisAnchorDateConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisArcAxisConfigurationProperty(block: CfnAnalysisArcAxisConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ArcAxisConfigurationProperty {
    val builder = CfnAnalysisArcAxisConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisArcAxisDisplayRangeProperty(block: CfnAnalysisArcAxisDisplayRangePropertyDsl.() -> Unit
      = {}): CfnAnalysis.ArcAxisDisplayRangeProperty {
    val builder = CfnAnalysisArcAxisDisplayRangePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisArcConfigurationProperty(block: CfnAnalysisArcConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ArcConfigurationProperty {
    val builder = CfnAnalysisArcConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAnalysisArcOptionsProperty(block: CfnAnalysisArcOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ArcOptionsProperty {
    val builder = CfnAnalysisArcOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisAxisDataOptionsProperty(block: CfnAnalysisAxisDataOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.AxisDataOptionsProperty {
    val builder = CfnAnalysisAxisDataOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisAxisDisplayMinMaxRangeProperty(block: CfnAnalysisAxisDisplayMinMaxRangePropertyDsl.() -> Unit
      = {}): CfnAnalysis.AxisDisplayMinMaxRangeProperty {
    val builder = CfnAnalysisAxisDisplayMinMaxRangePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisAxisDisplayOptionsProperty(block: CfnAnalysisAxisDisplayOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.AxisDisplayOptionsProperty {
    val builder = CfnAnalysisAxisDisplayOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisAxisDisplayRangeProperty(block: CfnAnalysisAxisDisplayRangePropertyDsl.() -> Unit
      = {}): CfnAnalysis.AxisDisplayRangeProperty {
    val builder = CfnAnalysisAxisDisplayRangePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisAxisLabelOptionsProperty(block: CfnAnalysisAxisLabelOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.AxisLabelOptionsProperty {
    val builder = CfnAnalysisAxisLabelOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisAxisLabelReferenceOptionsProperty(block: CfnAnalysisAxisLabelReferenceOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.AxisLabelReferenceOptionsProperty {
    val builder = CfnAnalysisAxisLabelReferenceOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisAxisLinearScaleProperty(block: CfnAnalysisAxisLinearScalePropertyDsl.() -> Unit
      = {}): CfnAnalysis.AxisLinearScaleProperty {
    val builder = CfnAnalysisAxisLinearScalePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisAxisLogarithmicScaleProperty(block: CfnAnalysisAxisLogarithmicScalePropertyDsl.() -> Unit
      = {}): CfnAnalysis.AxisLogarithmicScaleProperty {
    val builder = CfnAnalysisAxisLogarithmicScalePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAnalysisAxisScaleProperty(block: CfnAnalysisAxisScalePropertyDsl.() -> Unit =
      {}): CfnAnalysis.AxisScaleProperty {
    val builder = CfnAnalysisAxisScalePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisAxisTickLabelOptionsProperty(block: CfnAnalysisAxisTickLabelOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.AxisTickLabelOptionsProperty {
    val builder = CfnAnalysisAxisTickLabelOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisBarChartAggregatedFieldWellsProperty(block: CfnAnalysisBarChartAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.BarChartAggregatedFieldWellsProperty {
    val builder = CfnAnalysisBarChartAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisBarChartConfigurationProperty(block: CfnAnalysisBarChartConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.BarChartConfigurationProperty {
    val builder = CfnAnalysisBarChartConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisBarChartFieldWellsProperty(block: CfnAnalysisBarChartFieldWellsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.BarChartFieldWellsProperty {
    val builder = CfnAnalysisBarChartFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisBarChartSortConfigurationProperty(block: CfnAnalysisBarChartSortConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.BarChartSortConfigurationProperty {
    val builder = CfnAnalysisBarChartSortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisBarChartVisualProperty(block: CfnAnalysisBarChartVisualPropertyDsl.() -> Unit =
      {}): CfnAnalysis.BarChartVisualProperty {
    val builder = CfnAnalysisBarChartVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisBinCountOptionsProperty(block: CfnAnalysisBinCountOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.BinCountOptionsProperty {
    val builder = CfnAnalysisBinCountOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisBinWidthOptionsProperty(block: CfnAnalysisBinWidthOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.BinWidthOptionsProperty {
    val builder = CfnAnalysisBinWidthOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisBodySectionConfigurationProperty(block: CfnAnalysisBodySectionConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.BodySectionConfigurationProperty {
    val builder = CfnAnalysisBodySectionConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisBodySectionContentProperty(block: CfnAnalysisBodySectionContentPropertyDsl.() -> Unit
      = {}): CfnAnalysis.BodySectionContentProperty {
    val builder = CfnAnalysisBodySectionContentPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisBoxPlotAggregatedFieldWellsProperty(block: CfnAnalysisBoxPlotAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.BoxPlotAggregatedFieldWellsProperty {
    val builder = CfnAnalysisBoxPlotAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisBoxPlotChartConfigurationProperty(block: CfnAnalysisBoxPlotChartConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.BoxPlotChartConfigurationProperty {
    val builder = CfnAnalysisBoxPlotChartConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisBoxPlotFieldWellsProperty(block: CfnAnalysisBoxPlotFieldWellsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.BoxPlotFieldWellsProperty {
    val builder = CfnAnalysisBoxPlotFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisBoxPlotOptionsProperty(block: CfnAnalysisBoxPlotOptionsPropertyDsl.() -> Unit =
      {}): CfnAnalysis.BoxPlotOptionsProperty {
    val builder = CfnAnalysisBoxPlotOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisBoxPlotSortConfigurationProperty(block: CfnAnalysisBoxPlotSortConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.BoxPlotSortConfigurationProperty {
    val builder = CfnAnalysisBoxPlotSortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisBoxPlotStyleOptionsProperty(block: CfnAnalysisBoxPlotStyleOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.BoxPlotStyleOptionsProperty {
    val builder = CfnAnalysisBoxPlotStyleOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisBoxPlotVisualProperty(block: CfnAnalysisBoxPlotVisualPropertyDsl.() -> Unit =
      {}): CfnAnalysis.BoxPlotVisualProperty {
    val builder = CfnAnalysisBoxPlotVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisCalculatedFieldProperty(block: CfnAnalysisCalculatedFieldPropertyDsl.() -> Unit
      = {}): CfnAnalysis.CalculatedFieldProperty {
    val builder = CfnAnalysisCalculatedFieldPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisCalculatedMeasureFieldProperty(block: CfnAnalysisCalculatedMeasureFieldPropertyDsl.() -> Unit
      = {}): CfnAnalysis.CalculatedMeasureFieldProperty {
    val builder = CfnAnalysisCalculatedMeasureFieldPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisCascadingControlConfigurationProperty(block: CfnAnalysisCascadingControlConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.CascadingControlConfigurationProperty {
    val builder = CfnAnalysisCascadingControlConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisCascadingControlSourceProperty(block: CfnAnalysisCascadingControlSourcePropertyDsl.() -> Unit
      = {}): CfnAnalysis.CascadingControlSourceProperty {
    val builder = CfnAnalysisCascadingControlSourcePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisCategoricalDimensionFieldProperty(block: CfnAnalysisCategoricalDimensionFieldPropertyDsl.() -> Unit
      = {}): CfnAnalysis.CategoricalDimensionFieldProperty {
    val builder = CfnAnalysisCategoricalDimensionFieldPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisCategoricalMeasureFieldProperty(block: CfnAnalysisCategoricalMeasureFieldPropertyDsl.() -> Unit
      = {}): CfnAnalysis.CategoricalMeasureFieldProperty {
    val builder = CfnAnalysisCategoricalMeasureFieldPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisCategoryDrillDownFilterProperty(block: CfnAnalysisCategoryDrillDownFilterPropertyDsl.() -> Unit
      = {}): CfnAnalysis.CategoryDrillDownFilterProperty {
    val builder = CfnAnalysisCategoryDrillDownFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisCategoryFilterConfigurationProperty(block: CfnAnalysisCategoryFilterConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.CategoryFilterConfigurationProperty {
    val builder = CfnAnalysisCategoryFilterConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisCategoryFilterProperty(block: CfnAnalysisCategoryFilterPropertyDsl.() -> Unit =
      {}): CfnAnalysis.CategoryFilterProperty {
    val builder = CfnAnalysisCategoryFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisChartAxisLabelOptionsProperty(block: CfnAnalysisChartAxisLabelOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ChartAxisLabelOptionsProperty {
    val builder = CfnAnalysisChartAxisLabelOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisClusterMarkerConfigurationProperty(block: CfnAnalysisClusterMarkerConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ClusterMarkerConfigurationProperty {
    val builder = CfnAnalysisClusterMarkerConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisClusterMarkerProperty(block: CfnAnalysisClusterMarkerPropertyDsl.() -> Unit =
      {}): CfnAnalysis.ClusterMarkerProperty {
    val builder = CfnAnalysisClusterMarkerPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAnalysisColorScaleProperty(block: CfnAnalysisColorScalePropertyDsl.() -> Unit
      = {}): CfnAnalysis.ColorScaleProperty {
    val builder = CfnAnalysisColorScalePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisColumnConfigurationProperty(block: CfnAnalysisColumnConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ColumnConfigurationProperty {
    val builder = CfnAnalysisColumnConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisColumnHierarchyProperty(block: CfnAnalysisColumnHierarchyPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ColumnHierarchyProperty {
    val builder = CfnAnalysisColumnHierarchyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisColumnIdentifierProperty(block: CfnAnalysisColumnIdentifierPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ColumnIdentifierProperty {
    val builder = CfnAnalysisColumnIdentifierPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAnalysisColumnSortProperty(block: CfnAnalysisColumnSortPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ColumnSortProperty {
    val builder = CfnAnalysisColumnSortPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisColumnTooltipItemProperty(block: CfnAnalysisColumnTooltipItemPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ColumnTooltipItemProperty {
    val builder = CfnAnalysisColumnTooltipItemPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisComboChartAggregatedFieldWellsProperty(block: CfnAnalysisComboChartAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ComboChartAggregatedFieldWellsProperty {
    val builder = CfnAnalysisComboChartAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisComboChartConfigurationProperty(block: CfnAnalysisComboChartConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ComboChartConfigurationProperty {
    val builder = CfnAnalysisComboChartConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisComboChartFieldWellsProperty(block: CfnAnalysisComboChartFieldWellsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ComboChartFieldWellsProperty {
    val builder = CfnAnalysisComboChartFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisComboChartSortConfigurationProperty(block: CfnAnalysisComboChartSortConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ComboChartSortConfigurationProperty {
    val builder = CfnAnalysisComboChartSortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisComboChartVisualProperty(block: CfnAnalysisComboChartVisualPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ComboChartVisualProperty {
    val builder = CfnAnalysisComboChartVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisComparisonConfigurationProperty(block: CfnAnalysisComparisonConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ComparisonConfigurationProperty {
    val builder = CfnAnalysisComparisonConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisComparisonFormatConfigurationProperty(block: CfnAnalysisComparisonFormatConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ComparisonFormatConfigurationProperty {
    val builder = CfnAnalysisComparisonFormatConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisComputationProperty(block: CfnAnalysisComputationPropertyDsl.() -> Unit = {}):
      CfnAnalysis.ComputationProperty {
    val builder = CfnAnalysisComputationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisConditionalFormattingColorProperty(block: CfnAnalysisConditionalFormattingColorPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ConditionalFormattingColorProperty {
    val builder = CfnAnalysisConditionalFormattingColorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisConditionalFormattingCustomIconConditionProperty(block: CfnAnalysisConditionalFormattingCustomIconConditionPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ConditionalFormattingCustomIconConditionProperty {
    val builder = CfnAnalysisConditionalFormattingCustomIconConditionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisConditionalFormattingCustomIconOptionsProperty(block: CfnAnalysisConditionalFormattingCustomIconOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ConditionalFormattingCustomIconOptionsProperty {
    val builder = CfnAnalysisConditionalFormattingCustomIconOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisConditionalFormattingGradientColorProperty(block: CfnAnalysisConditionalFormattingGradientColorPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ConditionalFormattingGradientColorProperty {
    val builder = CfnAnalysisConditionalFormattingGradientColorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisConditionalFormattingIconDisplayConfigurationProperty(block: CfnAnalysisConditionalFormattingIconDisplayConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ConditionalFormattingIconDisplayConfigurationProperty {
    val builder = CfnAnalysisConditionalFormattingIconDisplayConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisConditionalFormattingIconProperty(block: CfnAnalysisConditionalFormattingIconPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ConditionalFormattingIconProperty {
    val builder = CfnAnalysisConditionalFormattingIconPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisConditionalFormattingIconSetProperty(block: CfnAnalysisConditionalFormattingIconSetPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ConditionalFormattingIconSetProperty {
    val builder = CfnAnalysisConditionalFormattingIconSetPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisConditionalFormattingSolidColorProperty(block: CfnAnalysisConditionalFormattingSolidColorPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ConditionalFormattingSolidColorProperty {
    val builder = CfnAnalysisConditionalFormattingSolidColorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisContributionAnalysisDefaultProperty(block: CfnAnalysisContributionAnalysisDefaultPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ContributionAnalysisDefaultProperty {
    val builder = CfnAnalysisContributionAnalysisDefaultPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisCurrencyDisplayFormatConfigurationProperty(block: CfnAnalysisCurrencyDisplayFormatConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.CurrencyDisplayFormatConfigurationProperty {
    val builder = CfnAnalysisCurrencyDisplayFormatConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisCustomActionFilterOperationProperty(block: CfnAnalysisCustomActionFilterOperationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.CustomActionFilterOperationProperty {
    val builder = CfnAnalysisCustomActionFilterOperationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisCustomActionNavigationOperationProperty(block: CfnAnalysisCustomActionNavigationOperationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.CustomActionNavigationOperationProperty {
    val builder = CfnAnalysisCustomActionNavigationOperationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisCustomActionSetParametersOperationProperty(block: CfnAnalysisCustomActionSetParametersOperationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.CustomActionSetParametersOperationProperty {
    val builder = CfnAnalysisCustomActionSetParametersOperationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisCustomActionURLOperationProperty(block: CfnAnalysisCustomActionURLOperationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.CustomActionURLOperationProperty {
    val builder = CfnAnalysisCustomActionURLOperationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisCustomContentConfigurationProperty(block: CfnAnalysisCustomContentConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.CustomContentConfigurationProperty {
    val builder = CfnAnalysisCustomContentConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisCustomContentVisualProperty(block: CfnAnalysisCustomContentVisualPropertyDsl.() -> Unit
      = {}): CfnAnalysis.CustomContentVisualProperty {
    val builder = CfnAnalysisCustomContentVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisCustomFilterConfigurationProperty(block: CfnAnalysisCustomFilterConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.CustomFilterConfigurationProperty {
    val builder = CfnAnalysisCustomFilterConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisCustomFilterListConfigurationProperty(block: CfnAnalysisCustomFilterListConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.CustomFilterListConfigurationProperty {
    val builder = CfnAnalysisCustomFilterListConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisCustomNarrativeOptionsProperty(block: CfnAnalysisCustomNarrativeOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.CustomNarrativeOptionsProperty {
    val builder = CfnAnalysisCustomNarrativeOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisCustomParameterValuesProperty(block: CfnAnalysisCustomParameterValuesPropertyDsl.() -> Unit
      = {}): CfnAnalysis.CustomParameterValuesProperty {
    val builder = CfnAnalysisCustomParameterValuesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisCustomValuesConfigurationProperty(block: CfnAnalysisCustomValuesConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.CustomValuesConfigurationProperty {
    val builder = CfnAnalysisCustomValuesConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisDataBarsOptionsProperty(block: CfnAnalysisDataBarsOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.DataBarsOptionsProperty {
    val builder = CfnAnalysisDataBarsOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAnalysisDataColorProperty(block: CfnAnalysisDataColorPropertyDsl.() -> Unit =
      {}): CfnAnalysis.DataColorProperty {
    val builder = CfnAnalysisDataColorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisDataFieldSeriesItemProperty(block: CfnAnalysisDataFieldSeriesItemPropertyDsl.() -> Unit
      = {}): CfnAnalysis.DataFieldSeriesItemProperty {
    val builder = CfnAnalysisDataFieldSeriesItemPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisDataLabelOptionsProperty(block: CfnAnalysisDataLabelOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.DataLabelOptionsProperty {
    val builder = CfnAnalysisDataLabelOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisDataLabelTypeProperty(block: CfnAnalysisDataLabelTypePropertyDsl.() -> Unit =
      {}): CfnAnalysis.DataLabelTypeProperty {
    val builder = CfnAnalysisDataLabelTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisDataPathColorProperty(block: CfnAnalysisDataPathColorPropertyDsl.() -> Unit =
      {}): CfnAnalysis.DataPathColorProperty {
    val builder = CfnAnalysisDataPathColorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisDataPathLabelTypeProperty(block: CfnAnalysisDataPathLabelTypePropertyDsl.() -> Unit
      = {}): CfnAnalysis.DataPathLabelTypeProperty {
    val builder = CfnAnalysisDataPathLabelTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisDataPathSortProperty(block: CfnAnalysisDataPathSortPropertyDsl.() -> Unit =
      {}): CfnAnalysis.DataPathSortProperty {
    val builder = CfnAnalysisDataPathSortPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisDataPathValueProperty(block: CfnAnalysisDataPathValuePropertyDsl.() -> Unit =
      {}): CfnAnalysis.DataPathValueProperty {
    val builder = CfnAnalysisDataPathValuePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisDataSetIdentifierDeclarationProperty(block: CfnAnalysisDataSetIdentifierDeclarationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.DataSetIdentifierDeclarationProperty {
    val builder = CfnAnalysisDataSetIdentifierDeclarationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisDataSetReferenceProperty(block: CfnAnalysisDataSetReferencePropertyDsl.() -> Unit
      = {}): CfnAnalysis.DataSetReferenceProperty {
    val builder = CfnAnalysisDataSetReferencePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisDateAxisOptionsProperty(block: CfnAnalysisDateAxisOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.DateAxisOptionsProperty {
    val builder = CfnAnalysisDateAxisOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisDateDimensionFieldProperty(block: CfnAnalysisDateDimensionFieldPropertyDsl.() -> Unit
      = {}): CfnAnalysis.DateDimensionFieldProperty {
    val builder = CfnAnalysisDateDimensionFieldPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisDateMeasureFieldProperty(block: CfnAnalysisDateMeasureFieldPropertyDsl.() -> Unit
      = {}): CfnAnalysis.DateMeasureFieldProperty {
    val builder = CfnAnalysisDateMeasureFieldPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisDateTimeDefaultValuesProperty(block: CfnAnalysisDateTimeDefaultValuesPropertyDsl.() -> Unit
      = {}): CfnAnalysis.DateTimeDefaultValuesProperty {
    val builder = CfnAnalysisDateTimeDefaultValuesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisDateTimeFormatConfigurationProperty(block: CfnAnalysisDateTimeFormatConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.DateTimeFormatConfigurationProperty {
    val builder = CfnAnalysisDateTimeFormatConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisDateTimeHierarchyProperty(block: CfnAnalysisDateTimeHierarchyPropertyDsl.() -> Unit
      = {}): CfnAnalysis.DateTimeHierarchyProperty {
    val builder = CfnAnalysisDateTimeHierarchyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisDateTimeParameterDeclarationProperty(block: CfnAnalysisDateTimeParameterDeclarationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.DateTimeParameterDeclarationProperty {
    val builder = CfnAnalysisDateTimeParameterDeclarationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisDateTimeParameterProperty(block: CfnAnalysisDateTimeParameterPropertyDsl.() -> Unit
      = {}): CfnAnalysis.DateTimeParameterProperty {
    val builder = CfnAnalysisDateTimeParameterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisDateTimePickerControlDisplayOptionsProperty(block: CfnAnalysisDateTimePickerControlDisplayOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.DateTimePickerControlDisplayOptionsProperty {
    val builder = CfnAnalysisDateTimePickerControlDisplayOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisDateTimeValueWhenUnsetConfigurationProperty(block: CfnAnalysisDateTimeValueWhenUnsetConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.DateTimeValueWhenUnsetConfigurationProperty {
    val builder = CfnAnalysisDateTimeValueWhenUnsetConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisDecimalDefaultValuesProperty(block: CfnAnalysisDecimalDefaultValuesPropertyDsl.() -> Unit
      = {}): CfnAnalysis.DecimalDefaultValuesProperty {
    val builder = CfnAnalysisDecimalDefaultValuesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisDecimalParameterDeclarationProperty(block: CfnAnalysisDecimalParameterDeclarationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.DecimalParameterDeclarationProperty {
    val builder = CfnAnalysisDecimalParameterDeclarationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisDecimalParameterProperty(block: CfnAnalysisDecimalParameterPropertyDsl.() -> Unit
      = {}): CfnAnalysis.DecimalParameterProperty {
    val builder = CfnAnalysisDecimalParameterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisDecimalPlacesConfigurationProperty(block: CfnAnalysisDecimalPlacesConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.DecimalPlacesConfigurationProperty {
    val builder = CfnAnalysisDecimalPlacesConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisDecimalValueWhenUnsetConfigurationProperty(block: CfnAnalysisDecimalValueWhenUnsetConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.DecimalValueWhenUnsetConfigurationProperty {
    val builder = CfnAnalysisDecimalValueWhenUnsetConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisDefaultFreeFormLayoutConfigurationProperty(block: CfnAnalysisDefaultFreeFormLayoutConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.DefaultFreeFormLayoutConfigurationProperty {
    val builder = CfnAnalysisDefaultFreeFormLayoutConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisDefaultGridLayoutConfigurationProperty(block: CfnAnalysisDefaultGridLayoutConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.DefaultGridLayoutConfigurationProperty {
    val builder = CfnAnalysisDefaultGridLayoutConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisDefaultInteractiveLayoutConfigurationProperty(block: CfnAnalysisDefaultInteractiveLayoutConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.DefaultInteractiveLayoutConfigurationProperty {
    val builder = CfnAnalysisDefaultInteractiveLayoutConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisDefaultNewSheetConfigurationProperty(block: CfnAnalysisDefaultNewSheetConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.DefaultNewSheetConfigurationProperty {
    val builder = CfnAnalysisDefaultNewSheetConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisDefaultPaginatedLayoutConfigurationProperty(block: CfnAnalysisDefaultPaginatedLayoutConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.DefaultPaginatedLayoutConfigurationProperty {
    val builder = CfnAnalysisDefaultPaginatedLayoutConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisDefaultSectionBasedLayoutConfigurationProperty(block: CfnAnalysisDefaultSectionBasedLayoutConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.DefaultSectionBasedLayoutConfigurationProperty {
    val builder = CfnAnalysisDefaultSectionBasedLayoutConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisDestinationParameterValueConfigurationProperty(block: CfnAnalysisDestinationParameterValueConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.DestinationParameterValueConfigurationProperty {
    val builder = CfnAnalysisDestinationParameterValueConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisDimensionFieldProperty(block: CfnAnalysisDimensionFieldPropertyDsl.() -> Unit =
      {}): CfnAnalysis.DimensionFieldProperty {
    val builder = CfnAnalysisDimensionFieldPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisDonutCenterOptionsProperty(block: CfnAnalysisDonutCenterOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.DonutCenterOptionsProperty {
    val builder = CfnAnalysisDonutCenterOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisDonutOptionsProperty(block: CfnAnalysisDonutOptionsPropertyDsl.() -> Unit =
      {}): CfnAnalysis.DonutOptionsProperty {
    val builder = CfnAnalysisDonutOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisDrillDownFilterProperty(block: CfnAnalysisDrillDownFilterPropertyDsl.() -> Unit
      = {}): CfnAnalysis.DrillDownFilterProperty {
    val builder = CfnAnalysisDrillDownFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisDropDownControlDisplayOptionsProperty(block: CfnAnalysisDropDownControlDisplayOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.DropDownControlDisplayOptionsProperty {
    val builder = CfnAnalysisDropDownControlDisplayOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisDynamicDefaultValueProperty(block: CfnAnalysisDynamicDefaultValuePropertyDsl.() -> Unit
      = {}): CfnAnalysis.DynamicDefaultValueProperty {
    val builder = CfnAnalysisDynamicDefaultValuePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisEmptyVisualProperty(block: CfnAnalysisEmptyVisualPropertyDsl.() -> Unit = {}):
      CfnAnalysis.EmptyVisualProperty {
    val builder = CfnAnalysisEmptyVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAnalysisEntityProperty(block: CfnAnalysisEntityPropertyDsl.() -> Unit = {}):
      CfnAnalysis.EntityProperty {
    val builder = CfnAnalysisEntityPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisExcludePeriodConfigurationProperty(block: CfnAnalysisExcludePeriodConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ExcludePeriodConfigurationProperty {
    val builder = CfnAnalysisExcludePeriodConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisExplicitHierarchyProperty(block: CfnAnalysisExplicitHierarchyPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ExplicitHierarchyProperty {
    val builder = CfnAnalysisExplicitHierarchyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisFieldBasedTooltipProperty(block: CfnAnalysisFieldBasedTooltipPropertyDsl.() -> Unit
      = {}): CfnAnalysis.FieldBasedTooltipProperty {
    val builder = CfnAnalysisFieldBasedTooltipPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisFieldLabelTypeProperty(block: CfnAnalysisFieldLabelTypePropertyDsl.() -> Unit =
      {}): CfnAnalysis.FieldLabelTypeProperty {
    val builder = CfnAnalysisFieldLabelTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisFieldSeriesItemProperty(block: CfnAnalysisFieldSeriesItemPropertyDsl.() -> Unit
      = {}): CfnAnalysis.FieldSeriesItemProperty {
    val builder = CfnAnalysisFieldSeriesItemPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisFieldSortOptionsProperty(block: CfnAnalysisFieldSortOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.FieldSortOptionsProperty {
    val builder = CfnAnalysisFieldSortOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAnalysisFieldSortProperty(block: CfnAnalysisFieldSortPropertyDsl.() -> Unit =
      {}): CfnAnalysis.FieldSortProperty {
    val builder = CfnAnalysisFieldSortPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisFieldTooltipItemProperty(block: CfnAnalysisFieldTooltipItemPropertyDsl.() -> Unit
      = {}): CfnAnalysis.FieldTooltipItemProperty {
    val builder = CfnAnalysisFieldTooltipItemPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisFilledMapAggregatedFieldWellsProperty(block: CfnAnalysisFilledMapAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.FilledMapAggregatedFieldWellsProperty {
    val builder = CfnAnalysisFilledMapAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisFilledMapConditionalFormattingOptionProperty(block: CfnAnalysisFilledMapConditionalFormattingOptionPropertyDsl.() -> Unit
      = {}): CfnAnalysis.FilledMapConditionalFormattingOptionProperty {
    val builder = CfnAnalysisFilledMapConditionalFormattingOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisFilledMapConditionalFormattingProperty(block: CfnAnalysisFilledMapConditionalFormattingPropertyDsl.() -> Unit
      = {}): CfnAnalysis.FilledMapConditionalFormattingProperty {
    val builder = CfnAnalysisFilledMapConditionalFormattingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisFilledMapConfigurationProperty(block: CfnAnalysisFilledMapConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.FilledMapConfigurationProperty {
    val builder = CfnAnalysisFilledMapConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisFilledMapFieldWellsProperty(block: CfnAnalysisFilledMapFieldWellsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.FilledMapFieldWellsProperty {
    val builder = CfnAnalysisFilledMapFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisFilledMapShapeConditionalFormattingProperty(block: CfnAnalysisFilledMapShapeConditionalFormattingPropertyDsl.() -> Unit
      = {}): CfnAnalysis.FilledMapShapeConditionalFormattingProperty {
    val builder = CfnAnalysisFilledMapShapeConditionalFormattingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisFilledMapSortConfigurationProperty(block: CfnAnalysisFilledMapSortConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.FilledMapSortConfigurationProperty {
    val builder = CfnAnalysisFilledMapSortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisFilledMapVisualProperty(block: CfnAnalysisFilledMapVisualPropertyDsl.() -> Unit
      = {}): CfnAnalysis.FilledMapVisualProperty {
    val builder = CfnAnalysisFilledMapVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisFilterControlProperty(block: CfnAnalysisFilterControlPropertyDsl.() -> Unit =
      {}): CfnAnalysis.FilterControlProperty {
    val builder = CfnAnalysisFilterControlPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisFilterDateTimePickerControlProperty(block: CfnAnalysisFilterDateTimePickerControlPropertyDsl.() -> Unit
      = {}): CfnAnalysis.FilterDateTimePickerControlProperty {
    val builder = CfnAnalysisFilterDateTimePickerControlPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisFilterDropDownControlProperty(block: CfnAnalysisFilterDropDownControlPropertyDsl.() -> Unit
      = {}): CfnAnalysis.FilterDropDownControlProperty {
    val builder = CfnAnalysisFilterDropDownControlPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisFilterGroupProperty(block: CfnAnalysisFilterGroupPropertyDsl.() -> Unit = {}):
      CfnAnalysis.FilterGroupProperty {
    val builder = CfnAnalysisFilterGroupPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisFilterListConfigurationProperty(block: CfnAnalysisFilterListConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.FilterListConfigurationProperty {
    val builder = CfnAnalysisFilterListConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisFilterListControlProperty(block: CfnAnalysisFilterListControlPropertyDsl.() -> Unit
      = {}): CfnAnalysis.FilterListControlProperty {
    val builder = CfnAnalysisFilterListControlPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisFilterOperationSelectedFieldsConfigurationProperty(block: CfnAnalysisFilterOperationSelectedFieldsConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.FilterOperationSelectedFieldsConfigurationProperty {
    val builder = CfnAnalysisFilterOperationSelectedFieldsConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisFilterOperationTargetVisualsConfigurationProperty(block: CfnAnalysisFilterOperationTargetVisualsConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.FilterOperationTargetVisualsConfigurationProperty {
    val builder = CfnAnalysisFilterOperationTargetVisualsConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAnalysisFilterProperty(block: CfnAnalysisFilterPropertyDsl.() -> Unit = {}):
      CfnAnalysis.FilterProperty {
    val builder = CfnAnalysisFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisFilterRelativeDateTimeControlProperty(block: CfnAnalysisFilterRelativeDateTimeControlPropertyDsl.() -> Unit
      = {}): CfnAnalysis.FilterRelativeDateTimeControlProperty {
    val builder = CfnAnalysisFilterRelativeDateTimeControlPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisFilterScopeConfigurationProperty(block: CfnAnalysisFilterScopeConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.FilterScopeConfigurationProperty {
    val builder = CfnAnalysisFilterScopeConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisFilterSelectableValuesProperty(block: CfnAnalysisFilterSelectableValuesPropertyDsl.() -> Unit
      = {}): CfnAnalysis.FilterSelectableValuesProperty {
    val builder = CfnAnalysisFilterSelectableValuesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisFilterSliderControlProperty(block: CfnAnalysisFilterSliderControlPropertyDsl.() -> Unit
      = {}): CfnAnalysis.FilterSliderControlProperty {
    val builder = CfnAnalysisFilterSliderControlPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisFilterTextAreaControlProperty(block: CfnAnalysisFilterTextAreaControlPropertyDsl.() -> Unit
      = {}): CfnAnalysis.FilterTextAreaControlProperty {
    val builder = CfnAnalysisFilterTextAreaControlPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisFilterTextFieldControlProperty(block: CfnAnalysisFilterTextFieldControlPropertyDsl.() -> Unit
      = {}): CfnAnalysis.FilterTextFieldControlProperty {
    val builder = CfnAnalysisFilterTextFieldControlPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisFontConfigurationProperty(block: CfnAnalysisFontConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.FontConfigurationProperty {
    val builder = CfnAnalysisFontConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAnalysisFontSizeProperty(block: CfnAnalysisFontSizePropertyDsl.() -> Unit =
      {}): CfnAnalysis.FontSizeProperty {
    val builder = CfnAnalysisFontSizePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAnalysisFontWeightProperty(block: CfnAnalysisFontWeightPropertyDsl.() -> Unit
      = {}): CfnAnalysis.FontWeightProperty {
    val builder = CfnAnalysisFontWeightPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisForecastComputationProperty(block: CfnAnalysisForecastComputationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ForecastComputationProperty {
    val builder = CfnAnalysisForecastComputationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisForecastConfigurationProperty(block: CfnAnalysisForecastConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ForecastConfigurationProperty {
    val builder = CfnAnalysisForecastConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisForecastScenarioProperty(block: CfnAnalysisForecastScenarioPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ForecastScenarioProperty {
    val builder = CfnAnalysisForecastScenarioPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisFormatConfigurationProperty(block: CfnAnalysisFormatConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.FormatConfigurationProperty {
    val builder = CfnAnalysisFormatConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisFreeFormLayoutCanvasSizeOptionsProperty(block: CfnAnalysisFreeFormLayoutCanvasSizeOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.FreeFormLayoutCanvasSizeOptionsProperty {
    val builder = CfnAnalysisFreeFormLayoutCanvasSizeOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisFreeFormLayoutConfigurationProperty(block: CfnAnalysisFreeFormLayoutConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.FreeFormLayoutConfigurationProperty {
    val builder = CfnAnalysisFreeFormLayoutConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisFreeFormLayoutElementBackgroundStyleProperty(block: CfnAnalysisFreeFormLayoutElementBackgroundStylePropertyDsl.() -> Unit
      = {}): CfnAnalysis.FreeFormLayoutElementBackgroundStyleProperty {
    val builder = CfnAnalysisFreeFormLayoutElementBackgroundStylePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisFreeFormLayoutElementBorderStyleProperty(block: CfnAnalysisFreeFormLayoutElementBorderStylePropertyDsl.() -> Unit
      = {}): CfnAnalysis.FreeFormLayoutElementBorderStyleProperty {
    val builder = CfnAnalysisFreeFormLayoutElementBorderStylePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisFreeFormLayoutElementProperty(block: CfnAnalysisFreeFormLayoutElementPropertyDsl.() -> Unit
      = {}): CfnAnalysis.FreeFormLayoutElementProperty {
    val builder = CfnAnalysisFreeFormLayoutElementPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisFreeFormLayoutScreenCanvasSizeOptionsProperty(block: CfnAnalysisFreeFormLayoutScreenCanvasSizeOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.FreeFormLayoutScreenCanvasSizeOptionsProperty {
    val builder = CfnAnalysisFreeFormLayoutScreenCanvasSizeOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisFreeFormSectionLayoutConfigurationProperty(block: CfnAnalysisFreeFormSectionLayoutConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.FreeFormSectionLayoutConfigurationProperty {
    val builder = CfnAnalysisFreeFormSectionLayoutConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisFunnelChartAggregatedFieldWellsProperty(block: CfnAnalysisFunnelChartAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.FunnelChartAggregatedFieldWellsProperty {
    val builder = CfnAnalysisFunnelChartAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisFunnelChartConfigurationProperty(block: CfnAnalysisFunnelChartConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.FunnelChartConfigurationProperty {
    val builder = CfnAnalysisFunnelChartConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisFunnelChartDataLabelOptionsProperty(block: CfnAnalysisFunnelChartDataLabelOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.FunnelChartDataLabelOptionsProperty {
    val builder = CfnAnalysisFunnelChartDataLabelOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisFunnelChartFieldWellsProperty(block: CfnAnalysisFunnelChartFieldWellsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.FunnelChartFieldWellsProperty {
    val builder = CfnAnalysisFunnelChartFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisFunnelChartSortConfigurationProperty(block: CfnAnalysisFunnelChartSortConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.FunnelChartSortConfigurationProperty {
    val builder = CfnAnalysisFunnelChartSortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisFunnelChartVisualProperty(block: CfnAnalysisFunnelChartVisualPropertyDsl.() -> Unit
      = {}): CfnAnalysis.FunnelChartVisualProperty {
    val builder = CfnAnalysisFunnelChartVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisGaugeChartArcConditionalFormattingProperty(block: CfnAnalysisGaugeChartArcConditionalFormattingPropertyDsl.() -> Unit
      = {}): CfnAnalysis.GaugeChartArcConditionalFormattingProperty {
    val builder = CfnAnalysisGaugeChartArcConditionalFormattingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisGaugeChartConditionalFormattingOptionProperty(block: CfnAnalysisGaugeChartConditionalFormattingOptionPropertyDsl.() -> Unit
      = {}): CfnAnalysis.GaugeChartConditionalFormattingOptionProperty {
    val builder = CfnAnalysisGaugeChartConditionalFormattingOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisGaugeChartConditionalFormattingProperty(block: CfnAnalysisGaugeChartConditionalFormattingPropertyDsl.() -> Unit
      = {}): CfnAnalysis.GaugeChartConditionalFormattingProperty {
    val builder = CfnAnalysisGaugeChartConditionalFormattingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisGaugeChartConfigurationProperty(block: CfnAnalysisGaugeChartConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.GaugeChartConfigurationProperty {
    val builder = CfnAnalysisGaugeChartConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisGaugeChartFieldWellsProperty(block: CfnAnalysisGaugeChartFieldWellsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.GaugeChartFieldWellsProperty {
    val builder = CfnAnalysisGaugeChartFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisGaugeChartOptionsProperty(block: CfnAnalysisGaugeChartOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.GaugeChartOptionsProperty {
    val builder = CfnAnalysisGaugeChartOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisGaugeChartPrimaryValueConditionalFormattingProperty(block: CfnAnalysisGaugeChartPrimaryValueConditionalFormattingPropertyDsl.() -> Unit
      = {}): CfnAnalysis.GaugeChartPrimaryValueConditionalFormattingProperty {
    val builder = CfnAnalysisGaugeChartPrimaryValueConditionalFormattingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisGaugeChartVisualProperty(block: CfnAnalysisGaugeChartVisualPropertyDsl.() -> Unit
      = {}): CfnAnalysis.GaugeChartVisualProperty {
    val builder = CfnAnalysisGaugeChartVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisGeospatialCoordinateBoundsProperty(block: CfnAnalysisGeospatialCoordinateBoundsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.GeospatialCoordinateBoundsProperty {
    val builder = CfnAnalysisGeospatialCoordinateBoundsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisGeospatialHeatmapColorScaleProperty(block: CfnAnalysisGeospatialHeatmapColorScalePropertyDsl.() -> Unit
      = {}): CfnAnalysis.GeospatialHeatmapColorScaleProperty {
    val builder = CfnAnalysisGeospatialHeatmapColorScalePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisGeospatialHeatmapConfigurationProperty(block: CfnAnalysisGeospatialHeatmapConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.GeospatialHeatmapConfigurationProperty {
    val builder = CfnAnalysisGeospatialHeatmapConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisGeospatialHeatmapDataColorProperty(block: CfnAnalysisGeospatialHeatmapDataColorPropertyDsl.() -> Unit
      = {}): CfnAnalysis.GeospatialHeatmapDataColorProperty {
    val builder = CfnAnalysisGeospatialHeatmapDataColorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisGeospatialMapAggregatedFieldWellsProperty(block: CfnAnalysisGeospatialMapAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.GeospatialMapAggregatedFieldWellsProperty {
    val builder = CfnAnalysisGeospatialMapAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisGeospatialMapConfigurationProperty(block: CfnAnalysisGeospatialMapConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.GeospatialMapConfigurationProperty {
    val builder = CfnAnalysisGeospatialMapConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisGeospatialMapFieldWellsProperty(block: CfnAnalysisGeospatialMapFieldWellsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.GeospatialMapFieldWellsProperty {
    val builder = CfnAnalysisGeospatialMapFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisGeospatialMapStyleOptionsProperty(block: CfnAnalysisGeospatialMapStyleOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.GeospatialMapStyleOptionsProperty {
    val builder = CfnAnalysisGeospatialMapStyleOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisGeospatialMapVisualProperty(block: CfnAnalysisGeospatialMapVisualPropertyDsl.() -> Unit
      = {}): CfnAnalysis.GeospatialMapVisualProperty {
    val builder = CfnAnalysisGeospatialMapVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisGeospatialPointStyleOptionsProperty(block: CfnAnalysisGeospatialPointStyleOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.GeospatialPointStyleOptionsProperty {
    val builder = CfnAnalysisGeospatialPointStyleOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisGeospatialWindowOptionsProperty(block: CfnAnalysisGeospatialWindowOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.GeospatialWindowOptionsProperty {
    val builder = CfnAnalysisGeospatialWindowOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisGlobalTableBorderOptionsProperty(block: CfnAnalysisGlobalTableBorderOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.GlobalTableBorderOptionsProperty {
    val builder = CfnAnalysisGlobalTableBorderOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisGradientColorProperty(block: CfnAnalysisGradientColorPropertyDsl.() -> Unit =
      {}): CfnAnalysis.GradientColorProperty {
    val builder = CfnAnalysisGradientColorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisGradientStopProperty(block: CfnAnalysisGradientStopPropertyDsl.() -> Unit =
      {}): CfnAnalysis.GradientStopProperty {
    val builder = CfnAnalysisGradientStopPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisGridLayoutCanvasSizeOptionsProperty(block: CfnAnalysisGridLayoutCanvasSizeOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.GridLayoutCanvasSizeOptionsProperty {
    val builder = CfnAnalysisGridLayoutCanvasSizeOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisGridLayoutConfigurationProperty(block: CfnAnalysisGridLayoutConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.GridLayoutConfigurationProperty {
    val builder = CfnAnalysisGridLayoutConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisGridLayoutElementProperty(block: CfnAnalysisGridLayoutElementPropertyDsl.() -> Unit
      = {}): CfnAnalysis.GridLayoutElementProperty {
    val builder = CfnAnalysisGridLayoutElementPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisGridLayoutScreenCanvasSizeOptionsProperty(block: CfnAnalysisGridLayoutScreenCanvasSizeOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.GridLayoutScreenCanvasSizeOptionsProperty {
    val builder = CfnAnalysisGridLayoutScreenCanvasSizeOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisGrowthRateComputationProperty(block: CfnAnalysisGrowthRateComputationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.GrowthRateComputationProperty {
    val builder = CfnAnalysisGrowthRateComputationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisHeaderFooterSectionConfigurationProperty(block: CfnAnalysisHeaderFooterSectionConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.HeaderFooterSectionConfigurationProperty {
    val builder = CfnAnalysisHeaderFooterSectionConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisHeatMapAggregatedFieldWellsProperty(block: CfnAnalysisHeatMapAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.HeatMapAggregatedFieldWellsProperty {
    val builder = CfnAnalysisHeatMapAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisHeatMapConfigurationProperty(block: CfnAnalysisHeatMapConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.HeatMapConfigurationProperty {
    val builder = CfnAnalysisHeatMapConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisHeatMapFieldWellsProperty(block: CfnAnalysisHeatMapFieldWellsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.HeatMapFieldWellsProperty {
    val builder = CfnAnalysisHeatMapFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisHeatMapSortConfigurationProperty(block: CfnAnalysisHeatMapSortConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.HeatMapSortConfigurationProperty {
    val builder = CfnAnalysisHeatMapSortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisHeatMapVisualProperty(block: CfnAnalysisHeatMapVisualPropertyDsl.() -> Unit =
      {}): CfnAnalysis.HeatMapVisualProperty {
    val builder = CfnAnalysisHeatMapVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisHistogramAggregatedFieldWellsProperty(block: CfnAnalysisHistogramAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.HistogramAggregatedFieldWellsProperty {
    val builder = CfnAnalysisHistogramAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisHistogramBinOptionsProperty(block: CfnAnalysisHistogramBinOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.HistogramBinOptionsProperty {
    val builder = CfnAnalysisHistogramBinOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisHistogramConfigurationProperty(block: CfnAnalysisHistogramConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.HistogramConfigurationProperty {
    val builder = CfnAnalysisHistogramConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisHistogramFieldWellsProperty(block: CfnAnalysisHistogramFieldWellsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.HistogramFieldWellsProperty {
    val builder = CfnAnalysisHistogramFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisHistogramVisualProperty(block: CfnAnalysisHistogramVisualPropertyDsl.() -> Unit
      = {}): CfnAnalysis.HistogramVisualProperty {
    val builder = CfnAnalysisHistogramVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisInsightConfigurationProperty(block: CfnAnalysisInsightConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.InsightConfigurationProperty {
    val builder = CfnAnalysisInsightConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisInsightVisualProperty(block: CfnAnalysisInsightVisualPropertyDsl.() -> Unit =
      {}): CfnAnalysis.InsightVisualProperty {
    val builder = CfnAnalysisInsightVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisIntegerDefaultValuesProperty(block: CfnAnalysisIntegerDefaultValuesPropertyDsl.() -> Unit
      = {}): CfnAnalysis.IntegerDefaultValuesProperty {
    val builder = CfnAnalysisIntegerDefaultValuesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisIntegerParameterDeclarationProperty(block: CfnAnalysisIntegerParameterDeclarationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.IntegerParameterDeclarationProperty {
    val builder = CfnAnalysisIntegerParameterDeclarationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisIntegerParameterProperty(block: CfnAnalysisIntegerParameterPropertyDsl.() -> Unit
      = {}): CfnAnalysis.IntegerParameterProperty {
    val builder = CfnAnalysisIntegerParameterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisIntegerValueWhenUnsetConfigurationProperty(block: CfnAnalysisIntegerValueWhenUnsetConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.IntegerValueWhenUnsetConfigurationProperty {
    val builder = CfnAnalysisIntegerValueWhenUnsetConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisItemsLimitConfigurationProperty(block: CfnAnalysisItemsLimitConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ItemsLimitConfigurationProperty {
    val builder = CfnAnalysisItemsLimitConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisKPIConditionalFormattingOptionProperty(block: CfnAnalysisKPIConditionalFormattingOptionPropertyDsl.() -> Unit
      = {}): CfnAnalysis.KPIConditionalFormattingOptionProperty {
    val builder = CfnAnalysisKPIConditionalFormattingOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisKPIConditionalFormattingProperty(block: CfnAnalysisKPIConditionalFormattingPropertyDsl.() -> Unit
      = {}): CfnAnalysis.KPIConditionalFormattingProperty {
    val builder = CfnAnalysisKPIConditionalFormattingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisKPIConfigurationProperty(block: CfnAnalysisKPIConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.KPIConfigurationProperty {
    val builder = CfnAnalysisKPIConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisKPIFieldWellsProperty(block: CfnAnalysisKPIFieldWellsPropertyDsl.() -> Unit =
      {}): CfnAnalysis.KPIFieldWellsProperty {
    val builder = CfnAnalysisKPIFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAnalysisKPIOptionsProperty(block: CfnAnalysisKPIOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.KPIOptionsProperty {
    val builder = CfnAnalysisKPIOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisKPIPrimaryValueConditionalFormattingProperty(block: CfnAnalysisKPIPrimaryValueConditionalFormattingPropertyDsl.() -> Unit
      = {}): CfnAnalysis.KPIPrimaryValueConditionalFormattingProperty {
    val builder = CfnAnalysisKPIPrimaryValueConditionalFormattingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisKPIProgressBarConditionalFormattingProperty(block: CfnAnalysisKPIProgressBarConditionalFormattingPropertyDsl.() -> Unit
      = {}): CfnAnalysis.KPIProgressBarConditionalFormattingProperty {
    val builder = CfnAnalysisKPIProgressBarConditionalFormattingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisKPISortConfigurationProperty(block: CfnAnalysisKPISortConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.KPISortConfigurationProperty {
    val builder = CfnAnalysisKPISortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAnalysisKPIVisualProperty(block: CfnAnalysisKPIVisualPropertyDsl.() -> Unit =
      {}): CfnAnalysis.KPIVisualProperty {
    val builder = CfnAnalysisKPIVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisLabelOptionsProperty(block: CfnAnalysisLabelOptionsPropertyDsl.() -> Unit =
      {}): CfnAnalysis.LabelOptionsProperty {
    val builder = CfnAnalysisLabelOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisLayoutConfigurationProperty(block: CfnAnalysisLayoutConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.LayoutConfigurationProperty {
    val builder = CfnAnalysisLayoutConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAnalysisLayoutProperty(block: CfnAnalysisLayoutPropertyDsl.() -> Unit = {}):
      CfnAnalysis.LayoutProperty {
    val builder = CfnAnalysisLayoutPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisLegendOptionsProperty(block: CfnAnalysisLegendOptionsPropertyDsl.() -> Unit =
      {}): CfnAnalysis.LegendOptionsProperty {
    val builder = CfnAnalysisLegendOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisLineChartAggregatedFieldWellsProperty(block: CfnAnalysisLineChartAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.LineChartAggregatedFieldWellsProperty {
    val builder = CfnAnalysisLineChartAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisLineChartConfigurationProperty(block: CfnAnalysisLineChartConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.LineChartConfigurationProperty {
    val builder = CfnAnalysisLineChartConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisLineChartDefaultSeriesSettingsProperty(block: CfnAnalysisLineChartDefaultSeriesSettingsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.LineChartDefaultSeriesSettingsProperty {
    val builder = CfnAnalysisLineChartDefaultSeriesSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisLineChartFieldWellsProperty(block: CfnAnalysisLineChartFieldWellsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.LineChartFieldWellsProperty {
    val builder = CfnAnalysisLineChartFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisLineChartLineStyleSettingsProperty(block: CfnAnalysisLineChartLineStyleSettingsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.LineChartLineStyleSettingsProperty {
    val builder = CfnAnalysisLineChartLineStyleSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisLineChartMarkerStyleSettingsProperty(block: CfnAnalysisLineChartMarkerStyleSettingsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.LineChartMarkerStyleSettingsProperty {
    val builder = CfnAnalysisLineChartMarkerStyleSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisLineChartSeriesSettingsProperty(block: CfnAnalysisLineChartSeriesSettingsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.LineChartSeriesSettingsProperty {
    val builder = CfnAnalysisLineChartSeriesSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisLineChartSortConfigurationProperty(block: CfnAnalysisLineChartSortConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.LineChartSortConfigurationProperty {
    val builder = CfnAnalysisLineChartSortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisLineChartVisualProperty(block: CfnAnalysisLineChartVisualPropertyDsl.() -> Unit
      = {}): CfnAnalysis.LineChartVisualProperty {
    val builder = CfnAnalysisLineChartVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisLineSeriesAxisDisplayOptionsProperty(block: CfnAnalysisLineSeriesAxisDisplayOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.LineSeriesAxisDisplayOptionsProperty {
    val builder = CfnAnalysisLineSeriesAxisDisplayOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisListControlDisplayOptionsProperty(block: CfnAnalysisListControlDisplayOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ListControlDisplayOptionsProperty {
    val builder = CfnAnalysisListControlDisplayOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisListControlSearchOptionsProperty(block: CfnAnalysisListControlSearchOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ListControlSearchOptionsProperty {
    val builder = CfnAnalysisListControlSearchOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisListControlSelectAllOptionsProperty(block: CfnAnalysisListControlSelectAllOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ListControlSelectAllOptionsProperty {
    val builder = CfnAnalysisListControlSelectAllOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisLoadingAnimationProperty(block: CfnAnalysisLoadingAnimationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.LoadingAnimationProperty {
    val builder = CfnAnalysisLoadingAnimationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisLocalNavigationConfigurationProperty(block: CfnAnalysisLocalNavigationConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.LocalNavigationConfigurationProperty {
    val builder = CfnAnalysisLocalNavigationConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisLongFormatTextProperty(block: CfnAnalysisLongFormatTextPropertyDsl.() -> Unit =
      {}): CfnAnalysis.LongFormatTextProperty {
    val builder = CfnAnalysisLongFormatTextPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisMappedDataSetParameterProperty(block: CfnAnalysisMappedDataSetParameterPropertyDsl.() -> Unit
      = {}): CfnAnalysis.MappedDataSetParameterProperty {
    val builder = CfnAnalysisMappedDataSetParameterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisMaximumLabelTypeProperty(block: CfnAnalysisMaximumLabelTypePropertyDsl.() -> Unit
      = {}): CfnAnalysis.MaximumLabelTypeProperty {
    val builder = CfnAnalysisMaximumLabelTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisMaximumMinimumComputationProperty(block: CfnAnalysisMaximumMinimumComputationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.MaximumMinimumComputationProperty {
    val builder = CfnAnalysisMaximumMinimumComputationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisMeasureFieldProperty(block: CfnAnalysisMeasureFieldPropertyDsl.() -> Unit =
      {}): CfnAnalysis.MeasureFieldProperty {
    val builder = CfnAnalysisMeasureFieldPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisMetricComparisonComputationProperty(block: CfnAnalysisMetricComparisonComputationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.MetricComparisonComputationProperty {
    val builder = CfnAnalysisMetricComparisonComputationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisMinimumLabelTypeProperty(block: CfnAnalysisMinimumLabelTypePropertyDsl.() -> Unit
      = {}): CfnAnalysis.MinimumLabelTypeProperty {
    val builder = CfnAnalysisMinimumLabelTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisMissingDataConfigurationProperty(block: CfnAnalysisMissingDataConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.MissingDataConfigurationProperty {
    val builder = CfnAnalysisMissingDataConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisNegativeValueConfigurationProperty(block: CfnAnalysisNegativeValueConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.NegativeValueConfigurationProperty {
    val builder = CfnAnalysisNegativeValueConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisNullValueFormatConfigurationProperty(block: CfnAnalysisNullValueFormatConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.NullValueFormatConfigurationProperty {
    val builder = CfnAnalysisNullValueFormatConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisNumberDisplayFormatConfigurationProperty(block: CfnAnalysisNumberDisplayFormatConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.NumberDisplayFormatConfigurationProperty {
    val builder = CfnAnalysisNumberDisplayFormatConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisNumberFormatConfigurationProperty(block: CfnAnalysisNumberFormatConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.NumberFormatConfigurationProperty {
    val builder = CfnAnalysisNumberFormatConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisNumericAxisOptionsProperty(block: CfnAnalysisNumericAxisOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.NumericAxisOptionsProperty {
    val builder = CfnAnalysisNumericAxisOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisNumericEqualityDrillDownFilterProperty(block: CfnAnalysisNumericEqualityDrillDownFilterPropertyDsl.() -> Unit
      = {}): CfnAnalysis.NumericEqualityDrillDownFilterProperty {
    val builder = CfnAnalysisNumericEqualityDrillDownFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisNumericEqualityFilterProperty(block: CfnAnalysisNumericEqualityFilterPropertyDsl.() -> Unit
      = {}): CfnAnalysis.NumericEqualityFilterProperty {
    val builder = CfnAnalysisNumericEqualityFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisNumericFormatConfigurationProperty(block: CfnAnalysisNumericFormatConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.NumericFormatConfigurationProperty {
    val builder = CfnAnalysisNumericFormatConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisNumericRangeFilterProperty(block: CfnAnalysisNumericRangeFilterPropertyDsl.() -> Unit
      = {}): CfnAnalysis.NumericRangeFilterProperty {
    val builder = CfnAnalysisNumericRangeFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisNumericRangeFilterValueProperty(block: CfnAnalysisNumericRangeFilterValuePropertyDsl.() -> Unit
      = {}): CfnAnalysis.NumericRangeFilterValueProperty {
    val builder = CfnAnalysisNumericRangeFilterValuePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisNumericSeparatorConfigurationProperty(block: CfnAnalysisNumericSeparatorConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.NumericSeparatorConfigurationProperty {
    val builder = CfnAnalysisNumericSeparatorConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisNumericalAggregationFunctionProperty(block: CfnAnalysisNumericalAggregationFunctionPropertyDsl.() -> Unit
      = {}): CfnAnalysis.NumericalAggregationFunctionProperty {
    val builder = CfnAnalysisNumericalAggregationFunctionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisNumericalDimensionFieldProperty(block: CfnAnalysisNumericalDimensionFieldPropertyDsl.() -> Unit
      = {}): CfnAnalysis.NumericalDimensionFieldProperty {
    val builder = CfnAnalysisNumericalDimensionFieldPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisNumericalMeasureFieldProperty(block: CfnAnalysisNumericalMeasureFieldPropertyDsl.() -> Unit
      = {}): CfnAnalysis.NumericalMeasureFieldProperty {
    val builder = CfnAnalysisNumericalMeasureFieldPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisPaginationConfigurationProperty(block: CfnAnalysisPaginationConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.PaginationConfigurationProperty {
    val builder = CfnAnalysisPaginationConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisPanelConfigurationProperty(block: CfnAnalysisPanelConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.PanelConfigurationProperty {
    val builder = CfnAnalysisPanelConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisPanelTitleOptionsProperty(block: CfnAnalysisPanelTitleOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.PanelTitleOptionsProperty {
    val builder = CfnAnalysisPanelTitleOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisParameterControlProperty(block: CfnAnalysisParameterControlPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ParameterControlProperty {
    val builder = CfnAnalysisParameterControlPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisParameterDateTimePickerControlProperty(block: CfnAnalysisParameterDateTimePickerControlPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ParameterDateTimePickerControlProperty {
    val builder = CfnAnalysisParameterDateTimePickerControlPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisParameterDeclarationProperty(block: CfnAnalysisParameterDeclarationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ParameterDeclarationProperty {
    val builder = CfnAnalysisParameterDeclarationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisParameterDropDownControlProperty(block: CfnAnalysisParameterDropDownControlPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ParameterDropDownControlProperty {
    val builder = CfnAnalysisParameterDropDownControlPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisParameterListControlProperty(block: CfnAnalysisParameterListControlPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ParameterListControlProperty {
    val builder = CfnAnalysisParameterListControlPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisParameterSelectableValuesProperty(block: CfnAnalysisParameterSelectableValuesPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ParameterSelectableValuesProperty {
    val builder = CfnAnalysisParameterSelectableValuesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisParameterSliderControlProperty(block: CfnAnalysisParameterSliderControlPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ParameterSliderControlProperty {
    val builder = CfnAnalysisParameterSliderControlPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisParameterTextAreaControlProperty(block: CfnAnalysisParameterTextAreaControlPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ParameterTextAreaControlProperty {
    val builder = CfnAnalysisParameterTextAreaControlPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisParameterTextFieldControlProperty(block: CfnAnalysisParameterTextFieldControlPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ParameterTextFieldControlProperty {
    val builder = CfnAnalysisParameterTextFieldControlPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAnalysisParametersProperty(block: CfnAnalysisParametersPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ParametersProperty {
    val builder = CfnAnalysisParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisPercentVisibleRangeProperty(block: CfnAnalysisPercentVisibleRangePropertyDsl.() -> Unit
      = {}): CfnAnalysis.PercentVisibleRangeProperty {
    val builder = CfnAnalysisPercentVisibleRangePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisPercentageDisplayFormatConfigurationProperty(block: CfnAnalysisPercentageDisplayFormatConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.PercentageDisplayFormatConfigurationProperty {
    val builder = CfnAnalysisPercentageDisplayFormatConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisPercentileAggregationProperty(block: CfnAnalysisPercentileAggregationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.PercentileAggregationProperty {
    val builder = CfnAnalysisPercentileAggregationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisPeriodOverPeriodComputationProperty(block: CfnAnalysisPeriodOverPeriodComputationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.PeriodOverPeriodComputationProperty {
    val builder = CfnAnalysisPeriodOverPeriodComputationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisPeriodToDateComputationProperty(block: CfnAnalysisPeriodToDateComputationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.PeriodToDateComputationProperty {
    val builder = CfnAnalysisPeriodToDateComputationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisPieChartAggregatedFieldWellsProperty(block: CfnAnalysisPieChartAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.PieChartAggregatedFieldWellsProperty {
    val builder = CfnAnalysisPieChartAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisPieChartConfigurationProperty(block: CfnAnalysisPieChartConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.PieChartConfigurationProperty {
    val builder = CfnAnalysisPieChartConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisPieChartFieldWellsProperty(block: CfnAnalysisPieChartFieldWellsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.PieChartFieldWellsProperty {
    val builder = CfnAnalysisPieChartFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisPieChartSortConfigurationProperty(block: CfnAnalysisPieChartSortConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.PieChartSortConfigurationProperty {
    val builder = CfnAnalysisPieChartSortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisPieChartVisualProperty(block: CfnAnalysisPieChartVisualPropertyDsl.() -> Unit =
      {}): CfnAnalysis.PieChartVisualProperty {
    val builder = CfnAnalysisPieChartVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisPivotFieldSortOptionsProperty(block: CfnAnalysisPivotFieldSortOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.PivotFieldSortOptionsProperty {
    val builder = CfnAnalysisPivotFieldSortOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisPivotTableAggregatedFieldWellsProperty(block: CfnAnalysisPivotTableAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.PivotTableAggregatedFieldWellsProperty {
    val builder = CfnAnalysisPivotTableAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisPivotTableCellConditionalFormattingProperty(block: CfnAnalysisPivotTableCellConditionalFormattingPropertyDsl.() -> Unit
      = {}): CfnAnalysis.PivotTableCellConditionalFormattingProperty {
    val builder = CfnAnalysisPivotTableCellConditionalFormattingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisPivotTableConditionalFormattingOptionProperty(block: CfnAnalysisPivotTableConditionalFormattingOptionPropertyDsl.() -> Unit
      = {}): CfnAnalysis.PivotTableConditionalFormattingOptionProperty {
    val builder = CfnAnalysisPivotTableConditionalFormattingOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisPivotTableConditionalFormattingProperty(block: CfnAnalysisPivotTableConditionalFormattingPropertyDsl.() -> Unit
      = {}): CfnAnalysis.PivotTableConditionalFormattingProperty {
    val builder = CfnAnalysisPivotTableConditionalFormattingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisPivotTableConditionalFormattingScopeProperty(block: CfnAnalysisPivotTableConditionalFormattingScopePropertyDsl.() -> Unit
      = {}): CfnAnalysis.PivotTableConditionalFormattingScopeProperty {
    val builder = CfnAnalysisPivotTableConditionalFormattingScopePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisPivotTableConfigurationProperty(block: CfnAnalysisPivotTableConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.PivotTableConfigurationProperty {
    val builder = CfnAnalysisPivotTableConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisPivotTableDataPathOptionProperty(block: CfnAnalysisPivotTableDataPathOptionPropertyDsl.() -> Unit
      = {}): CfnAnalysis.PivotTableDataPathOptionProperty {
    val builder = CfnAnalysisPivotTableDataPathOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisPivotTableFieldCollapseStateOptionProperty(block: CfnAnalysisPivotTableFieldCollapseStateOptionPropertyDsl.() -> Unit
      = {}): CfnAnalysis.PivotTableFieldCollapseStateOptionProperty {
    val builder = CfnAnalysisPivotTableFieldCollapseStateOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisPivotTableFieldCollapseStateTargetProperty(block: CfnAnalysisPivotTableFieldCollapseStateTargetPropertyDsl.() -> Unit
      = {}): CfnAnalysis.PivotTableFieldCollapseStateTargetProperty {
    val builder = CfnAnalysisPivotTableFieldCollapseStateTargetPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisPivotTableFieldOptionProperty(block: CfnAnalysisPivotTableFieldOptionPropertyDsl.() -> Unit
      = {}): CfnAnalysis.PivotTableFieldOptionProperty {
    val builder = CfnAnalysisPivotTableFieldOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisPivotTableFieldOptionsProperty(block: CfnAnalysisPivotTableFieldOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.PivotTableFieldOptionsProperty {
    val builder = CfnAnalysisPivotTableFieldOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisPivotTableFieldSubtotalOptionsProperty(block: CfnAnalysisPivotTableFieldSubtotalOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.PivotTableFieldSubtotalOptionsProperty {
    val builder = CfnAnalysisPivotTableFieldSubtotalOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisPivotTableFieldWellsProperty(block: CfnAnalysisPivotTableFieldWellsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.PivotTableFieldWellsProperty {
    val builder = CfnAnalysisPivotTableFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisPivotTableOptionsProperty(block: CfnAnalysisPivotTableOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.PivotTableOptionsProperty {
    val builder = CfnAnalysisPivotTableOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisPivotTablePaginatedReportOptionsProperty(block: CfnAnalysisPivotTablePaginatedReportOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.PivotTablePaginatedReportOptionsProperty {
    val builder = CfnAnalysisPivotTablePaginatedReportOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisPivotTableSortByProperty(block: CfnAnalysisPivotTableSortByPropertyDsl.() -> Unit
      = {}): CfnAnalysis.PivotTableSortByProperty {
    val builder = CfnAnalysisPivotTableSortByPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisPivotTableSortConfigurationProperty(block: CfnAnalysisPivotTableSortConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.PivotTableSortConfigurationProperty {
    val builder = CfnAnalysisPivotTableSortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisPivotTableTotalOptionsProperty(block: CfnAnalysisPivotTableTotalOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.PivotTableTotalOptionsProperty {
    val builder = CfnAnalysisPivotTableTotalOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisPivotTableVisualProperty(block: CfnAnalysisPivotTableVisualPropertyDsl.() -> Unit
      = {}): CfnAnalysis.PivotTableVisualProperty {
    val builder = CfnAnalysisPivotTableVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisPivotTotalOptionsProperty(block: CfnAnalysisPivotTotalOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.PivotTotalOptionsProperty {
    val builder = CfnAnalysisPivotTotalOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisPredefinedHierarchyProperty(block: CfnAnalysisPredefinedHierarchyPropertyDsl.() -> Unit
      = {}): CfnAnalysis.PredefinedHierarchyProperty {
    val builder = CfnAnalysisPredefinedHierarchyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisProgressBarOptionsProperty(block: CfnAnalysisProgressBarOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ProgressBarOptionsProperty {
    val builder = CfnAnalysisProgressBarOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAnalysisProps(block: CfnAnalysisPropsDsl.() -> Unit = {}): CfnAnalysisProps {
    val builder = CfnAnalysisPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisRadarChartAggregatedFieldWellsProperty(block: CfnAnalysisRadarChartAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.RadarChartAggregatedFieldWellsProperty {
    val builder = CfnAnalysisRadarChartAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisRadarChartAreaStyleSettingsProperty(block: CfnAnalysisRadarChartAreaStyleSettingsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.RadarChartAreaStyleSettingsProperty {
    val builder = CfnAnalysisRadarChartAreaStyleSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisRadarChartConfigurationProperty(block: CfnAnalysisRadarChartConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.RadarChartConfigurationProperty {
    val builder = CfnAnalysisRadarChartConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisRadarChartFieldWellsProperty(block: CfnAnalysisRadarChartFieldWellsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.RadarChartFieldWellsProperty {
    val builder = CfnAnalysisRadarChartFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisRadarChartSeriesSettingsProperty(block: CfnAnalysisRadarChartSeriesSettingsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.RadarChartSeriesSettingsProperty {
    val builder = CfnAnalysisRadarChartSeriesSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisRadarChartSortConfigurationProperty(block: CfnAnalysisRadarChartSortConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.RadarChartSortConfigurationProperty {
    val builder = CfnAnalysisRadarChartSortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisRadarChartVisualProperty(block: CfnAnalysisRadarChartVisualPropertyDsl.() -> Unit
      = {}): CfnAnalysis.RadarChartVisualProperty {
    val builder = CfnAnalysisRadarChartVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisRangeEndsLabelTypeProperty(block: CfnAnalysisRangeEndsLabelTypePropertyDsl.() -> Unit
      = {}): CfnAnalysis.RangeEndsLabelTypeProperty {
    val builder = CfnAnalysisRangeEndsLabelTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisReferenceLineCustomLabelConfigurationProperty(block: CfnAnalysisReferenceLineCustomLabelConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ReferenceLineCustomLabelConfigurationProperty {
    val builder = CfnAnalysisReferenceLineCustomLabelConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisReferenceLineDataConfigurationProperty(block: CfnAnalysisReferenceLineDataConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ReferenceLineDataConfigurationProperty {
    val builder = CfnAnalysisReferenceLineDataConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisReferenceLineDynamicDataConfigurationProperty(block: CfnAnalysisReferenceLineDynamicDataConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ReferenceLineDynamicDataConfigurationProperty {
    val builder = CfnAnalysisReferenceLineDynamicDataConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisReferenceLineLabelConfigurationProperty(block: CfnAnalysisReferenceLineLabelConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ReferenceLineLabelConfigurationProperty {
    val builder = CfnAnalysisReferenceLineLabelConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisReferenceLineProperty(block: CfnAnalysisReferenceLinePropertyDsl.() -> Unit =
      {}): CfnAnalysis.ReferenceLineProperty {
    val builder = CfnAnalysisReferenceLinePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisReferenceLineStaticDataConfigurationProperty(block: CfnAnalysisReferenceLineStaticDataConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ReferenceLineStaticDataConfigurationProperty {
    val builder = CfnAnalysisReferenceLineStaticDataConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisReferenceLineStyleConfigurationProperty(block: CfnAnalysisReferenceLineStyleConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ReferenceLineStyleConfigurationProperty {
    val builder = CfnAnalysisReferenceLineStyleConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisReferenceLineValueLabelConfigurationProperty(block: CfnAnalysisReferenceLineValueLabelConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ReferenceLineValueLabelConfigurationProperty {
    val builder = CfnAnalysisReferenceLineValueLabelConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisRelativeDateTimeControlDisplayOptionsProperty(block: CfnAnalysisRelativeDateTimeControlDisplayOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.RelativeDateTimeControlDisplayOptionsProperty {
    val builder = CfnAnalysisRelativeDateTimeControlDisplayOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisRelativeDatesFilterProperty(block: CfnAnalysisRelativeDatesFilterPropertyDsl.() -> Unit
      = {}): CfnAnalysis.RelativeDatesFilterProperty {
    val builder = CfnAnalysisRelativeDatesFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisResourcePermissionProperty(block: CfnAnalysisResourcePermissionPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ResourcePermissionProperty {
    val builder = CfnAnalysisResourcePermissionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisRollingDateConfigurationProperty(block: CfnAnalysisRollingDateConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.RollingDateConfigurationProperty {
    val builder = CfnAnalysisRollingDateConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisRowAlternateColorOptionsProperty(block: CfnAnalysisRowAlternateColorOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.RowAlternateColorOptionsProperty {
    val builder = CfnAnalysisRowAlternateColorOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisSameSheetTargetVisualConfigurationProperty(block: CfnAnalysisSameSheetTargetVisualConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.SameSheetTargetVisualConfigurationProperty {
    val builder = CfnAnalysisSameSheetTargetVisualConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisSankeyDiagramAggregatedFieldWellsProperty(block: CfnAnalysisSankeyDiagramAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.SankeyDiagramAggregatedFieldWellsProperty {
    val builder = CfnAnalysisSankeyDiagramAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisSankeyDiagramChartConfigurationProperty(block: CfnAnalysisSankeyDiagramChartConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.SankeyDiagramChartConfigurationProperty {
    val builder = CfnAnalysisSankeyDiagramChartConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisSankeyDiagramFieldWellsProperty(block: CfnAnalysisSankeyDiagramFieldWellsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.SankeyDiagramFieldWellsProperty {
    val builder = CfnAnalysisSankeyDiagramFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisSankeyDiagramSortConfigurationProperty(block: CfnAnalysisSankeyDiagramSortConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.SankeyDiagramSortConfigurationProperty {
    val builder = CfnAnalysisSankeyDiagramSortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisSankeyDiagramVisualProperty(block: CfnAnalysisSankeyDiagramVisualPropertyDsl.() -> Unit
      = {}): CfnAnalysis.SankeyDiagramVisualProperty {
    val builder = CfnAnalysisSankeyDiagramVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisScatterPlotCategoricallyAggregatedFieldWellsProperty(block: CfnAnalysisScatterPlotCategoricallyAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ScatterPlotCategoricallyAggregatedFieldWellsProperty {
    val builder = CfnAnalysisScatterPlotCategoricallyAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisScatterPlotConfigurationProperty(block: CfnAnalysisScatterPlotConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ScatterPlotConfigurationProperty {
    val builder = CfnAnalysisScatterPlotConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisScatterPlotFieldWellsProperty(block: CfnAnalysisScatterPlotFieldWellsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ScatterPlotFieldWellsProperty {
    val builder = CfnAnalysisScatterPlotFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisScatterPlotUnaggregatedFieldWellsProperty(block: CfnAnalysisScatterPlotUnaggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ScatterPlotUnaggregatedFieldWellsProperty {
    val builder = CfnAnalysisScatterPlotUnaggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisScatterPlotVisualProperty(block: CfnAnalysisScatterPlotVisualPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ScatterPlotVisualProperty {
    val builder = CfnAnalysisScatterPlotVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisScrollBarOptionsProperty(block: CfnAnalysisScrollBarOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ScrollBarOptionsProperty {
    val builder = CfnAnalysisScrollBarOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisSecondaryValueOptionsProperty(block: CfnAnalysisSecondaryValueOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.SecondaryValueOptionsProperty {
    val builder = CfnAnalysisSecondaryValueOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisSectionAfterPageBreakProperty(block: CfnAnalysisSectionAfterPageBreakPropertyDsl.() -> Unit
      = {}): CfnAnalysis.SectionAfterPageBreakProperty {
    val builder = CfnAnalysisSectionAfterPageBreakPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisSectionBasedLayoutCanvasSizeOptionsProperty(block: CfnAnalysisSectionBasedLayoutCanvasSizeOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.SectionBasedLayoutCanvasSizeOptionsProperty {
    val builder = CfnAnalysisSectionBasedLayoutCanvasSizeOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisSectionBasedLayoutConfigurationProperty(block: CfnAnalysisSectionBasedLayoutConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.SectionBasedLayoutConfigurationProperty {
    val builder = CfnAnalysisSectionBasedLayoutConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisSectionBasedLayoutPaperCanvasSizeOptionsProperty(block: CfnAnalysisSectionBasedLayoutPaperCanvasSizeOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.SectionBasedLayoutPaperCanvasSizeOptionsProperty {
    val builder = CfnAnalysisSectionBasedLayoutPaperCanvasSizeOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisSectionLayoutConfigurationProperty(block: CfnAnalysisSectionLayoutConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.SectionLayoutConfigurationProperty {
    val builder = CfnAnalysisSectionLayoutConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisSectionPageBreakConfigurationProperty(block: CfnAnalysisSectionPageBreakConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.SectionPageBreakConfigurationProperty {
    val builder = CfnAnalysisSectionPageBreakConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisSectionStyleProperty(block: CfnAnalysisSectionStylePropertyDsl.() -> Unit =
      {}): CfnAnalysis.SectionStyleProperty {
    val builder = CfnAnalysisSectionStylePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisSelectedSheetsFilterScopeConfigurationProperty(block: CfnAnalysisSelectedSheetsFilterScopeConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.SelectedSheetsFilterScopeConfigurationProperty {
    val builder = CfnAnalysisSelectedSheetsFilterScopeConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAnalysisSeriesItemProperty(block: CfnAnalysisSeriesItemPropertyDsl.() -> Unit
      = {}): CfnAnalysis.SeriesItemProperty {
    val builder = CfnAnalysisSeriesItemPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisSetParameterValueConfigurationProperty(block: CfnAnalysisSetParameterValueConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.SetParameterValueConfigurationProperty {
    val builder = CfnAnalysisSetParameterValueConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisShapeConditionalFormatProperty(block: CfnAnalysisShapeConditionalFormatPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ShapeConditionalFormatProperty {
    val builder = CfnAnalysisShapeConditionalFormatPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisSheetControlLayoutConfigurationProperty(block: CfnAnalysisSheetControlLayoutConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.SheetControlLayoutConfigurationProperty {
    val builder = CfnAnalysisSheetControlLayoutConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisSheetControlLayoutProperty(block: CfnAnalysisSheetControlLayoutPropertyDsl.() -> Unit
      = {}): CfnAnalysis.SheetControlLayoutProperty {
    val builder = CfnAnalysisSheetControlLayoutPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisSheetDefinitionProperty(block: CfnAnalysisSheetDefinitionPropertyDsl.() -> Unit
      = {}): CfnAnalysis.SheetDefinitionProperty {
    val builder = CfnAnalysisSheetDefinitionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisSheetElementConfigurationOverridesProperty(block: CfnAnalysisSheetElementConfigurationOverridesPropertyDsl.() -> Unit
      = {}): CfnAnalysis.SheetElementConfigurationOverridesProperty {
    val builder = CfnAnalysisSheetElementConfigurationOverridesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisSheetElementRenderingRuleProperty(block: CfnAnalysisSheetElementRenderingRulePropertyDsl.() -> Unit
      = {}): CfnAnalysis.SheetElementRenderingRuleProperty {
    val builder = CfnAnalysisSheetElementRenderingRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAnalysisSheetProperty(block: CfnAnalysisSheetPropertyDsl.() -> Unit = {}):
      CfnAnalysis.SheetProperty {
    val builder = CfnAnalysisSheetPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisSheetTextBoxProperty(block: CfnAnalysisSheetTextBoxPropertyDsl.() -> Unit =
      {}): CfnAnalysis.SheetTextBoxProperty {
    val builder = CfnAnalysisSheetTextBoxPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisSheetVisualScopingConfigurationProperty(block: CfnAnalysisSheetVisualScopingConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.SheetVisualScopingConfigurationProperty {
    val builder = CfnAnalysisSheetVisualScopingConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisShortFormatTextProperty(block: CfnAnalysisShortFormatTextPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ShortFormatTextProperty {
    val builder = CfnAnalysisShortFormatTextPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisSimpleClusterMarkerProperty(block: CfnAnalysisSimpleClusterMarkerPropertyDsl.() -> Unit
      = {}): CfnAnalysis.SimpleClusterMarkerProperty {
    val builder = CfnAnalysisSimpleClusterMarkerPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisSliderControlDisplayOptionsProperty(block: CfnAnalysisSliderControlDisplayOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.SliderControlDisplayOptionsProperty {
    val builder = CfnAnalysisSliderControlDisplayOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisSmallMultiplesOptionsProperty(block: CfnAnalysisSmallMultiplesOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.SmallMultiplesOptionsProperty {
    val builder = CfnAnalysisSmallMultiplesOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAnalysisSpacingProperty(block: CfnAnalysisSpacingPropertyDsl.() -> Unit =
      {}): CfnAnalysis.SpacingProperty {
    val builder = CfnAnalysisSpacingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisStringDefaultValuesProperty(block: CfnAnalysisStringDefaultValuesPropertyDsl.() -> Unit
      = {}): CfnAnalysis.StringDefaultValuesProperty {
    val builder = CfnAnalysisStringDefaultValuesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisStringFormatConfigurationProperty(block: CfnAnalysisStringFormatConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.StringFormatConfigurationProperty {
    val builder = CfnAnalysisStringFormatConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisStringParameterDeclarationProperty(block: CfnAnalysisStringParameterDeclarationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.StringParameterDeclarationProperty {
    val builder = CfnAnalysisStringParameterDeclarationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisStringParameterProperty(block: CfnAnalysisStringParameterPropertyDsl.() -> Unit
      = {}): CfnAnalysis.StringParameterProperty {
    val builder = CfnAnalysisStringParameterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisStringValueWhenUnsetConfigurationProperty(block: CfnAnalysisStringValueWhenUnsetConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.StringValueWhenUnsetConfigurationProperty {
    val builder = CfnAnalysisStringValueWhenUnsetConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisSubtotalOptionsProperty(block: CfnAnalysisSubtotalOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.SubtotalOptionsProperty {
    val builder = CfnAnalysisSubtotalOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisTableAggregatedFieldWellsProperty(block: CfnAnalysisTableAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.TableAggregatedFieldWellsProperty {
    val builder = CfnAnalysisTableAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisTableBorderOptionsProperty(block: CfnAnalysisTableBorderOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.TableBorderOptionsProperty {
    val builder = CfnAnalysisTableBorderOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisTableCellConditionalFormattingProperty(block: CfnAnalysisTableCellConditionalFormattingPropertyDsl.() -> Unit
      = {}): CfnAnalysis.TableCellConditionalFormattingProperty {
    val builder = CfnAnalysisTableCellConditionalFormattingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisTableCellImageSizingConfigurationProperty(block: CfnAnalysisTableCellImageSizingConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.TableCellImageSizingConfigurationProperty {
    val builder = CfnAnalysisTableCellImageSizingConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisTableCellStyleProperty(block: CfnAnalysisTableCellStylePropertyDsl.() -> Unit =
      {}): CfnAnalysis.TableCellStyleProperty {
    val builder = CfnAnalysisTableCellStylePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisTableConditionalFormattingOptionProperty(block: CfnAnalysisTableConditionalFormattingOptionPropertyDsl.() -> Unit
      = {}): CfnAnalysis.TableConditionalFormattingOptionProperty {
    val builder = CfnAnalysisTableConditionalFormattingOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisTableConditionalFormattingProperty(block: CfnAnalysisTableConditionalFormattingPropertyDsl.() -> Unit
      = {}): CfnAnalysis.TableConditionalFormattingProperty {
    val builder = CfnAnalysisTableConditionalFormattingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisTableConfigurationProperty(block: CfnAnalysisTableConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.TableConfigurationProperty {
    val builder = CfnAnalysisTableConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisTableFieldCustomIconContentProperty(block: CfnAnalysisTableFieldCustomIconContentPropertyDsl.() -> Unit
      = {}): CfnAnalysis.TableFieldCustomIconContentProperty {
    val builder = CfnAnalysisTableFieldCustomIconContentPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisTableFieldCustomTextContentProperty(block: CfnAnalysisTableFieldCustomTextContentPropertyDsl.() -> Unit
      = {}): CfnAnalysis.TableFieldCustomTextContentProperty {
    val builder = CfnAnalysisTableFieldCustomTextContentPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisTableFieldImageConfigurationProperty(block: CfnAnalysisTableFieldImageConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.TableFieldImageConfigurationProperty {
    val builder = CfnAnalysisTableFieldImageConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisTableFieldLinkConfigurationProperty(block: CfnAnalysisTableFieldLinkConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.TableFieldLinkConfigurationProperty {
    val builder = CfnAnalysisTableFieldLinkConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisTableFieldLinkContentConfigurationProperty(block: CfnAnalysisTableFieldLinkContentConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.TableFieldLinkContentConfigurationProperty {
    val builder = CfnAnalysisTableFieldLinkContentConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisTableFieldOptionProperty(block: CfnAnalysisTableFieldOptionPropertyDsl.() -> Unit
      = {}): CfnAnalysis.TableFieldOptionProperty {
    val builder = CfnAnalysisTableFieldOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisTableFieldOptionsProperty(block: CfnAnalysisTableFieldOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.TableFieldOptionsProperty {
    val builder = CfnAnalysisTableFieldOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisTableFieldURLConfigurationProperty(block: CfnAnalysisTableFieldURLConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.TableFieldURLConfigurationProperty {
    val builder = CfnAnalysisTableFieldURLConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisTableFieldWellsProperty(block: CfnAnalysisTableFieldWellsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.TableFieldWellsProperty {
    val builder = CfnAnalysisTableFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisTableInlineVisualizationProperty(block: CfnAnalysisTableInlineVisualizationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.TableInlineVisualizationProperty {
    val builder = CfnAnalysisTableInlineVisualizationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisTableOptionsProperty(block: CfnAnalysisTableOptionsPropertyDsl.() -> Unit =
      {}): CfnAnalysis.TableOptionsProperty {
    val builder = CfnAnalysisTableOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisTablePaginatedReportOptionsProperty(block: CfnAnalysisTablePaginatedReportOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.TablePaginatedReportOptionsProperty {
    val builder = CfnAnalysisTablePaginatedReportOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisTableRowConditionalFormattingProperty(block: CfnAnalysisTableRowConditionalFormattingPropertyDsl.() -> Unit
      = {}): CfnAnalysis.TableRowConditionalFormattingProperty {
    val builder = CfnAnalysisTableRowConditionalFormattingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisTableSideBorderOptionsProperty(block: CfnAnalysisTableSideBorderOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.TableSideBorderOptionsProperty {
    val builder = CfnAnalysisTableSideBorderOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisTableSortConfigurationProperty(block: CfnAnalysisTableSortConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.TableSortConfigurationProperty {
    val builder = CfnAnalysisTableSortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisTableUnaggregatedFieldWellsProperty(block: CfnAnalysisTableUnaggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.TableUnaggregatedFieldWellsProperty {
    val builder = CfnAnalysisTableUnaggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisTableVisualProperty(block: CfnAnalysisTableVisualPropertyDsl.() -> Unit = {}):
      CfnAnalysis.TableVisualProperty {
    val builder = CfnAnalysisTableVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisTextAreaControlDisplayOptionsProperty(block: CfnAnalysisTextAreaControlDisplayOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.TextAreaControlDisplayOptionsProperty {
    val builder = CfnAnalysisTextAreaControlDisplayOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisTextConditionalFormatProperty(block: CfnAnalysisTextConditionalFormatPropertyDsl.() -> Unit
      = {}): CfnAnalysis.TextConditionalFormatProperty {
    val builder = CfnAnalysisTextConditionalFormatPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisTextControlPlaceholderOptionsProperty(block: CfnAnalysisTextControlPlaceholderOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.TextControlPlaceholderOptionsProperty {
    val builder = CfnAnalysisTextControlPlaceholderOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisTextFieldControlDisplayOptionsProperty(block: CfnAnalysisTextFieldControlDisplayOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.TextFieldControlDisplayOptionsProperty {
    val builder = CfnAnalysisTextFieldControlDisplayOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisThousandSeparatorOptionsProperty(block: CfnAnalysisThousandSeparatorOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.ThousandSeparatorOptionsProperty {
    val builder = CfnAnalysisThousandSeparatorOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisTimeBasedForecastPropertiesProperty(block: CfnAnalysisTimeBasedForecastPropertiesPropertyDsl.() -> Unit
      = {}): CfnAnalysis.TimeBasedForecastPropertiesProperty {
    val builder = CfnAnalysisTimeBasedForecastPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisTimeEqualityFilterProperty(block: CfnAnalysisTimeEqualityFilterPropertyDsl.() -> Unit
      = {}): CfnAnalysis.TimeEqualityFilterProperty {
    val builder = CfnAnalysisTimeEqualityFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisTimeRangeDrillDownFilterProperty(block: CfnAnalysisTimeRangeDrillDownFilterPropertyDsl.() -> Unit
      = {}): CfnAnalysis.TimeRangeDrillDownFilterProperty {
    val builder = CfnAnalysisTimeRangeDrillDownFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisTimeRangeFilterProperty(block: CfnAnalysisTimeRangeFilterPropertyDsl.() -> Unit
      = {}): CfnAnalysis.TimeRangeFilterProperty {
    val builder = CfnAnalysisTimeRangeFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisTimeRangeFilterValueProperty(block: CfnAnalysisTimeRangeFilterValuePropertyDsl.() -> Unit
      = {}): CfnAnalysis.TimeRangeFilterValueProperty {
    val builder = CfnAnalysisTimeRangeFilterValuePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisTooltipItemProperty(block: CfnAnalysisTooltipItemPropertyDsl.() -> Unit = {}):
      CfnAnalysis.TooltipItemProperty {
    val builder = CfnAnalysisTooltipItemPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisTooltipOptionsProperty(block: CfnAnalysisTooltipOptionsPropertyDsl.() -> Unit =
      {}): CfnAnalysis.TooltipOptionsProperty {
    val builder = CfnAnalysisTooltipOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisTopBottomFilterProperty(block: CfnAnalysisTopBottomFilterPropertyDsl.() -> Unit
      = {}): CfnAnalysis.TopBottomFilterProperty {
    val builder = CfnAnalysisTopBottomFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisTopBottomMoversComputationProperty(block: CfnAnalysisTopBottomMoversComputationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.TopBottomMoversComputationProperty {
    val builder = CfnAnalysisTopBottomMoversComputationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisTopBottomRankedComputationProperty(block: CfnAnalysisTopBottomRankedComputationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.TopBottomRankedComputationProperty {
    val builder = CfnAnalysisTopBottomRankedComputationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisTotalAggregationComputationProperty(block: CfnAnalysisTotalAggregationComputationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.TotalAggregationComputationProperty {
    val builder = CfnAnalysisTotalAggregationComputationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisTotalOptionsProperty(block: CfnAnalysisTotalOptionsPropertyDsl.() -> Unit =
      {}): CfnAnalysis.TotalOptionsProperty {
    val builder = CfnAnalysisTotalOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisTreeMapAggregatedFieldWellsProperty(block: CfnAnalysisTreeMapAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.TreeMapAggregatedFieldWellsProperty {
    val builder = CfnAnalysisTreeMapAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisTreeMapConfigurationProperty(block: CfnAnalysisTreeMapConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.TreeMapConfigurationProperty {
    val builder = CfnAnalysisTreeMapConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisTreeMapFieldWellsProperty(block: CfnAnalysisTreeMapFieldWellsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.TreeMapFieldWellsProperty {
    val builder = CfnAnalysisTreeMapFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisTreeMapSortConfigurationProperty(block: CfnAnalysisTreeMapSortConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.TreeMapSortConfigurationProperty {
    val builder = CfnAnalysisTreeMapSortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisTreeMapVisualProperty(block: CfnAnalysisTreeMapVisualPropertyDsl.() -> Unit =
      {}): CfnAnalysis.TreeMapVisualProperty {
    val builder = CfnAnalysisTreeMapVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisTrendArrowOptionsProperty(block: CfnAnalysisTrendArrowOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.TrendArrowOptionsProperty {
    val builder = CfnAnalysisTrendArrowOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisUnaggregatedFieldProperty(block: CfnAnalysisUnaggregatedFieldPropertyDsl.() -> Unit
      = {}): CfnAnalysis.UnaggregatedFieldProperty {
    val builder = CfnAnalysisUnaggregatedFieldPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisUniqueValuesComputationProperty(block: CfnAnalysisUniqueValuesComputationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.UniqueValuesComputationProperty {
    val builder = CfnAnalysisUniqueValuesComputationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisVisibleRangeOptionsProperty(block: CfnAnalysisVisibleRangeOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.VisibleRangeOptionsProperty {
    val builder = CfnAnalysisVisibleRangeOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisVisualCustomActionOperationProperty(block: CfnAnalysisVisualCustomActionOperationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.VisualCustomActionOperationProperty {
    val builder = CfnAnalysisVisualCustomActionOperationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisVisualCustomActionProperty(block: CfnAnalysisVisualCustomActionPropertyDsl.() -> Unit
      = {}): CfnAnalysis.VisualCustomActionProperty {
    val builder = CfnAnalysisVisualCustomActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisVisualPaletteProperty(block: CfnAnalysisVisualPalettePropertyDsl.() -> Unit =
      {}): CfnAnalysis.VisualPaletteProperty {
    val builder = CfnAnalysisVisualPalettePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAnalysisVisualProperty(block: CfnAnalysisVisualPropertyDsl.() -> Unit = {}):
      CfnAnalysis.VisualProperty {
    val builder = CfnAnalysisVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisVisualSubtitleLabelOptionsProperty(block: CfnAnalysisVisualSubtitleLabelOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.VisualSubtitleLabelOptionsProperty {
    val builder = CfnAnalysisVisualSubtitleLabelOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisVisualTitleLabelOptionsProperty(block: CfnAnalysisVisualTitleLabelOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.VisualTitleLabelOptionsProperty {
    val builder = CfnAnalysisVisualTitleLabelOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisWaterfallChartAggregatedFieldWellsProperty(block: CfnAnalysisWaterfallChartAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.WaterfallChartAggregatedFieldWellsProperty {
    val builder = CfnAnalysisWaterfallChartAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisWaterfallChartConfigurationProperty(block: CfnAnalysisWaterfallChartConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.WaterfallChartConfigurationProperty {
    val builder = CfnAnalysisWaterfallChartConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisWaterfallChartFieldWellsProperty(block: CfnAnalysisWaterfallChartFieldWellsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.WaterfallChartFieldWellsProperty {
    val builder = CfnAnalysisWaterfallChartFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisWaterfallChartOptionsProperty(block: CfnAnalysisWaterfallChartOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.WaterfallChartOptionsProperty {
    val builder = CfnAnalysisWaterfallChartOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisWaterfallChartSortConfigurationProperty(block: CfnAnalysisWaterfallChartSortConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.WaterfallChartSortConfigurationProperty {
    val builder = CfnAnalysisWaterfallChartSortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisWaterfallVisualProperty(block: CfnAnalysisWaterfallVisualPropertyDsl.() -> Unit
      = {}): CfnAnalysis.WaterfallVisualProperty {
    val builder = CfnAnalysisWaterfallVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisWhatIfPointScenarioProperty(block: CfnAnalysisWhatIfPointScenarioPropertyDsl.() -> Unit
      = {}): CfnAnalysis.WhatIfPointScenarioProperty {
    val builder = CfnAnalysisWhatIfPointScenarioPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisWhatIfRangeScenarioProperty(block: CfnAnalysisWhatIfRangeScenarioPropertyDsl.() -> Unit
      = {}): CfnAnalysis.WhatIfRangeScenarioProperty {
    val builder = CfnAnalysisWhatIfRangeScenarioPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisWordCloudAggregatedFieldWellsProperty(block: CfnAnalysisWordCloudAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.WordCloudAggregatedFieldWellsProperty {
    val builder = CfnAnalysisWordCloudAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisWordCloudChartConfigurationProperty(block: CfnAnalysisWordCloudChartConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.WordCloudChartConfigurationProperty {
    val builder = CfnAnalysisWordCloudChartConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisWordCloudFieldWellsProperty(block: CfnAnalysisWordCloudFieldWellsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.WordCloudFieldWellsProperty {
    val builder = CfnAnalysisWordCloudFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisWordCloudOptionsProperty(block: CfnAnalysisWordCloudOptionsPropertyDsl.() -> Unit
      = {}): CfnAnalysis.WordCloudOptionsProperty {
    val builder = CfnAnalysisWordCloudOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisWordCloudSortConfigurationProperty(block: CfnAnalysisWordCloudSortConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnalysis.WordCloudSortConfigurationProperty {
    val builder = CfnAnalysisWordCloudSortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalysisWordCloudVisualProperty(block: CfnAnalysisWordCloudVisualPropertyDsl.() -> Unit
      = {}): CfnAnalysis.WordCloudVisualProperty {
    val builder = CfnAnalysisWordCloudVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDashboard(
    scope: Construct,
    id: String,
    block: CfnDashboardDsl.() -> Unit = {},
  ): CfnDashboard {
    val builder = CfnDashboardDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardAdHocFilteringOptionProperty(block: CfnDashboardAdHocFilteringOptionPropertyDsl.() -> Unit
      = {}): CfnDashboard.AdHocFilteringOptionProperty {
    val builder = CfnDashboardAdHocFilteringOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardAggregationFunctionProperty(block: CfnDashboardAggregationFunctionPropertyDsl.() -> Unit
      = {}): CfnDashboard.AggregationFunctionProperty {
    val builder = CfnDashboardAggregationFunctionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardAggregationSortConfigurationProperty(block: CfnDashboardAggregationSortConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.AggregationSortConfigurationProperty {
    val builder = CfnDashboardAggregationSortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardAnalysisDefaultsProperty(block: CfnDashboardAnalysisDefaultsPropertyDsl.() -> Unit
      = {}): CfnDashboard.AnalysisDefaultsProperty {
    val builder = CfnDashboardAnalysisDefaultsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardAnchorDateConfigurationProperty(block: CfnDashboardAnchorDateConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.AnchorDateConfigurationProperty {
    val builder = CfnDashboardAnchorDateConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardArcAxisConfigurationProperty(block: CfnDashboardArcAxisConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.ArcAxisConfigurationProperty {
    val builder = CfnDashboardArcAxisConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardArcAxisDisplayRangeProperty(block: CfnDashboardArcAxisDisplayRangePropertyDsl.() -> Unit
      = {}): CfnDashboard.ArcAxisDisplayRangeProperty {
    val builder = CfnDashboardArcAxisDisplayRangePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardArcConfigurationProperty(block: CfnDashboardArcConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.ArcConfigurationProperty {
    val builder = CfnDashboardArcConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardArcOptionsProperty(block: CfnDashboardArcOptionsPropertyDsl.() -> Unit = {}):
      CfnDashboard.ArcOptionsProperty {
    val builder = CfnDashboardArcOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardAxisDataOptionsProperty(block: CfnDashboardAxisDataOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.AxisDataOptionsProperty {
    val builder = CfnDashboardAxisDataOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardAxisDisplayMinMaxRangeProperty(block: CfnDashboardAxisDisplayMinMaxRangePropertyDsl.() -> Unit
      = {}): CfnDashboard.AxisDisplayMinMaxRangeProperty {
    val builder = CfnDashboardAxisDisplayMinMaxRangePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardAxisDisplayOptionsProperty(block: CfnDashboardAxisDisplayOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.AxisDisplayOptionsProperty {
    val builder = CfnDashboardAxisDisplayOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardAxisDisplayRangeProperty(block: CfnDashboardAxisDisplayRangePropertyDsl.() -> Unit
      = {}): CfnDashboard.AxisDisplayRangeProperty {
    val builder = CfnDashboardAxisDisplayRangePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardAxisLabelOptionsProperty(block: CfnDashboardAxisLabelOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.AxisLabelOptionsProperty {
    val builder = CfnDashboardAxisLabelOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardAxisLabelReferenceOptionsProperty(block: CfnDashboardAxisLabelReferenceOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.AxisLabelReferenceOptionsProperty {
    val builder = CfnDashboardAxisLabelReferenceOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardAxisLinearScaleProperty(block: CfnDashboardAxisLinearScalePropertyDsl.() -> Unit
      = {}): CfnDashboard.AxisLinearScaleProperty {
    val builder = CfnDashboardAxisLinearScalePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardAxisLogarithmicScaleProperty(block: CfnDashboardAxisLogarithmicScalePropertyDsl.() -> Unit
      = {}): CfnDashboard.AxisLogarithmicScaleProperty {
    val builder = CfnDashboardAxisLogarithmicScalePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDashboardAxisScaleProperty(block: CfnDashboardAxisScalePropertyDsl.() -> Unit
      = {}): CfnDashboard.AxisScaleProperty {
    val builder = CfnDashboardAxisScalePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardAxisTickLabelOptionsProperty(block: CfnDashboardAxisTickLabelOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.AxisTickLabelOptionsProperty {
    val builder = CfnDashboardAxisTickLabelOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardBarChartAggregatedFieldWellsProperty(block: CfnDashboardBarChartAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnDashboard.BarChartAggregatedFieldWellsProperty {
    val builder = CfnDashboardBarChartAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardBarChartConfigurationProperty(block: CfnDashboardBarChartConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.BarChartConfigurationProperty {
    val builder = CfnDashboardBarChartConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardBarChartFieldWellsProperty(block: CfnDashboardBarChartFieldWellsPropertyDsl.() -> Unit
      = {}): CfnDashboard.BarChartFieldWellsProperty {
    val builder = CfnDashboardBarChartFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardBarChartSortConfigurationProperty(block: CfnDashboardBarChartSortConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.BarChartSortConfigurationProperty {
    val builder = CfnDashboardBarChartSortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardBarChartVisualProperty(block: CfnDashboardBarChartVisualPropertyDsl.() -> Unit
      = {}): CfnDashboard.BarChartVisualProperty {
    val builder = CfnDashboardBarChartVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardBinCountOptionsProperty(block: CfnDashboardBinCountOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.BinCountOptionsProperty {
    val builder = CfnDashboardBinCountOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardBinWidthOptionsProperty(block: CfnDashboardBinWidthOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.BinWidthOptionsProperty {
    val builder = CfnDashboardBinWidthOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardBodySectionConfigurationProperty(block: CfnDashboardBodySectionConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.BodySectionConfigurationProperty {
    val builder = CfnDashboardBodySectionConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardBodySectionContentProperty(block: CfnDashboardBodySectionContentPropertyDsl.() -> Unit
      = {}): CfnDashboard.BodySectionContentProperty {
    val builder = CfnDashboardBodySectionContentPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardBoxPlotAggregatedFieldWellsProperty(block: CfnDashboardBoxPlotAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnDashboard.BoxPlotAggregatedFieldWellsProperty {
    val builder = CfnDashboardBoxPlotAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardBoxPlotChartConfigurationProperty(block: CfnDashboardBoxPlotChartConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.BoxPlotChartConfigurationProperty {
    val builder = CfnDashboardBoxPlotChartConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardBoxPlotFieldWellsProperty(block: CfnDashboardBoxPlotFieldWellsPropertyDsl.() -> Unit
      = {}): CfnDashboard.BoxPlotFieldWellsProperty {
    val builder = CfnDashboardBoxPlotFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardBoxPlotOptionsProperty(block: CfnDashboardBoxPlotOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.BoxPlotOptionsProperty {
    val builder = CfnDashboardBoxPlotOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardBoxPlotSortConfigurationProperty(block: CfnDashboardBoxPlotSortConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.BoxPlotSortConfigurationProperty {
    val builder = CfnDashboardBoxPlotSortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardBoxPlotStyleOptionsProperty(block: CfnDashboardBoxPlotStyleOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.BoxPlotStyleOptionsProperty {
    val builder = CfnDashboardBoxPlotStyleOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardBoxPlotVisualProperty(block: CfnDashboardBoxPlotVisualPropertyDsl.() -> Unit =
      {}): CfnDashboard.BoxPlotVisualProperty {
    val builder = CfnDashboardBoxPlotVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardCalculatedFieldProperty(block: CfnDashboardCalculatedFieldPropertyDsl.() -> Unit
      = {}): CfnDashboard.CalculatedFieldProperty {
    val builder = CfnDashboardCalculatedFieldPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardCalculatedMeasureFieldProperty(block: CfnDashboardCalculatedMeasureFieldPropertyDsl.() -> Unit
      = {}): CfnDashboard.CalculatedMeasureFieldProperty {
    val builder = CfnDashboardCalculatedMeasureFieldPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardCascadingControlConfigurationProperty(block: CfnDashboardCascadingControlConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.CascadingControlConfigurationProperty {
    val builder = CfnDashboardCascadingControlConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardCascadingControlSourceProperty(block: CfnDashboardCascadingControlSourcePropertyDsl.() -> Unit
      = {}): CfnDashboard.CascadingControlSourceProperty {
    val builder = CfnDashboardCascadingControlSourcePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardCategoricalDimensionFieldProperty(block: CfnDashboardCategoricalDimensionFieldPropertyDsl.() -> Unit
      = {}): CfnDashboard.CategoricalDimensionFieldProperty {
    val builder = CfnDashboardCategoricalDimensionFieldPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardCategoricalMeasureFieldProperty(block: CfnDashboardCategoricalMeasureFieldPropertyDsl.() -> Unit
      = {}): CfnDashboard.CategoricalMeasureFieldProperty {
    val builder = CfnDashboardCategoricalMeasureFieldPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardCategoryDrillDownFilterProperty(block: CfnDashboardCategoryDrillDownFilterPropertyDsl.() -> Unit
      = {}): CfnDashboard.CategoryDrillDownFilterProperty {
    val builder = CfnDashboardCategoryDrillDownFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardCategoryFilterConfigurationProperty(block: CfnDashboardCategoryFilterConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.CategoryFilterConfigurationProperty {
    val builder = CfnDashboardCategoryFilterConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardCategoryFilterProperty(block: CfnDashboardCategoryFilterPropertyDsl.() -> Unit
      = {}): CfnDashboard.CategoryFilterProperty {
    val builder = CfnDashboardCategoryFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardChartAxisLabelOptionsProperty(block: CfnDashboardChartAxisLabelOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.ChartAxisLabelOptionsProperty {
    val builder = CfnDashboardChartAxisLabelOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardClusterMarkerConfigurationProperty(block: CfnDashboardClusterMarkerConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.ClusterMarkerConfigurationProperty {
    val builder = CfnDashboardClusterMarkerConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardClusterMarkerProperty(block: CfnDashboardClusterMarkerPropertyDsl.() -> Unit =
      {}): CfnDashboard.ClusterMarkerProperty {
    val builder = CfnDashboardClusterMarkerPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardColorScaleProperty(block: CfnDashboardColorScalePropertyDsl.() -> Unit = {}):
      CfnDashboard.ColorScaleProperty {
    val builder = CfnDashboardColorScalePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardColumnConfigurationProperty(block: CfnDashboardColumnConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.ColumnConfigurationProperty {
    val builder = CfnDashboardColumnConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardColumnHierarchyProperty(block: CfnDashboardColumnHierarchyPropertyDsl.() -> Unit
      = {}): CfnDashboard.ColumnHierarchyProperty {
    val builder = CfnDashboardColumnHierarchyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardColumnIdentifierProperty(block: CfnDashboardColumnIdentifierPropertyDsl.() -> Unit
      = {}): CfnDashboard.ColumnIdentifierProperty {
    val builder = CfnDashboardColumnIdentifierPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardColumnSortProperty(block: CfnDashboardColumnSortPropertyDsl.() -> Unit = {}):
      CfnDashboard.ColumnSortProperty {
    val builder = CfnDashboardColumnSortPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardColumnTooltipItemProperty(block: CfnDashboardColumnTooltipItemPropertyDsl.() -> Unit
      = {}): CfnDashboard.ColumnTooltipItemProperty {
    val builder = CfnDashboardColumnTooltipItemPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardComboChartAggregatedFieldWellsProperty(block: CfnDashboardComboChartAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnDashboard.ComboChartAggregatedFieldWellsProperty {
    val builder = CfnDashboardComboChartAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardComboChartConfigurationProperty(block: CfnDashboardComboChartConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.ComboChartConfigurationProperty {
    val builder = CfnDashboardComboChartConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardComboChartFieldWellsProperty(block: CfnDashboardComboChartFieldWellsPropertyDsl.() -> Unit
      = {}): CfnDashboard.ComboChartFieldWellsProperty {
    val builder = CfnDashboardComboChartFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardComboChartSortConfigurationProperty(block: CfnDashboardComboChartSortConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.ComboChartSortConfigurationProperty {
    val builder = CfnDashboardComboChartSortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardComboChartVisualProperty(block: CfnDashboardComboChartVisualPropertyDsl.() -> Unit
      = {}): CfnDashboard.ComboChartVisualProperty {
    val builder = CfnDashboardComboChartVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardComparisonConfigurationProperty(block: CfnDashboardComparisonConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.ComparisonConfigurationProperty {
    val builder = CfnDashboardComparisonConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardComparisonFormatConfigurationProperty(block: CfnDashboardComparisonFormatConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.ComparisonFormatConfigurationProperty {
    val builder = CfnDashboardComparisonFormatConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardComputationProperty(block: CfnDashboardComputationPropertyDsl.() -> Unit =
      {}): CfnDashboard.ComputationProperty {
    val builder = CfnDashboardComputationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardConditionalFormattingColorProperty(block: CfnDashboardConditionalFormattingColorPropertyDsl.() -> Unit
      = {}): CfnDashboard.ConditionalFormattingColorProperty {
    val builder = CfnDashboardConditionalFormattingColorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardConditionalFormattingCustomIconConditionProperty(block: CfnDashboardConditionalFormattingCustomIconConditionPropertyDsl.() -> Unit
      = {}): CfnDashboard.ConditionalFormattingCustomIconConditionProperty {
    val builder = CfnDashboardConditionalFormattingCustomIconConditionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardConditionalFormattingCustomIconOptionsProperty(block: CfnDashboardConditionalFormattingCustomIconOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.ConditionalFormattingCustomIconOptionsProperty {
    val builder = CfnDashboardConditionalFormattingCustomIconOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardConditionalFormattingGradientColorProperty(block: CfnDashboardConditionalFormattingGradientColorPropertyDsl.() -> Unit
      = {}): CfnDashboard.ConditionalFormattingGradientColorProperty {
    val builder = CfnDashboardConditionalFormattingGradientColorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardConditionalFormattingIconDisplayConfigurationProperty(block: CfnDashboardConditionalFormattingIconDisplayConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.ConditionalFormattingIconDisplayConfigurationProperty {
    val builder = CfnDashboardConditionalFormattingIconDisplayConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardConditionalFormattingIconProperty(block: CfnDashboardConditionalFormattingIconPropertyDsl.() -> Unit
      = {}): CfnDashboard.ConditionalFormattingIconProperty {
    val builder = CfnDashboardConditionalFormattingIconPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardConditionalFormattingIconSetProperty(block: CfnDashboardConditionalFormattingIconSetPropertyDsl.() -> Unit
      = {}): CfnDashboard.ConditionalFormattingIconSetProperty {
    val builder = CfnDashboardConditionalFormattingIconSetPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardConditionalFormattingSolidColorProperty(block: CfnDashboardConditionalFormattingSolidColorPropertyDsl.() -> Unit
      = {}): CfnDashboard.ConditionalFormattingSolidColorProperty {
    val builder = CfnDashboardConditionalFormattingSolidColorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardContributionAnalysisDefaultProperty(block: CfnDashboardContributionAnalysisDefaultPropertyDsl.() -> Unit
      = {}): CfnDashboard.ContributionAnalysisDefaultProperty {
    val builder = CfnDashboardContributionAnalysisDefaultPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardCurrencyDisplayFormatConfigurationProperty(block: CfnDashboardCurrencyDisplayFormatConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.CurrencyDisplayFormatConfigurationProperty {
    val builder = CfnDashboardCurrencyDisplayFormatConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardCustomActionFilterOperationProperty(block: CfnDashboardCustomActionFilterOperationPropertyDsl.() -> Unit
      = {}): CfnDashboard.CustomActionFilterOperationProperty {
    val builder = CfnDashboardCustomActionFilterOperationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardCustomActionNavigationOperationProperty(block: CfnDashboardCustomActionNavigationOperationPropertyDsl.() -> Unit
      = {}): CfnDashboard.CustomActionNavigationOperationProperty {
    val builder = CfnDashboardCustomActionNavigationOperationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardCustomActionSetParametersOperationProperty(block: CfnDashboardCustomActionSetParametersOperationPropertyDsl.() -> Unit
      = {}): CfnDashboard.CustomActionSetParametersOperationProperty {
    val builder = CfnDashboardCustomActionSetParametersOperationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardCustomActionURLOperationProperty(block: CfnDashboardCustomActionURLOperationPropertyDsl.() -> Unit
      = {}): CfnDashboard.CustomActionURLOperationProperty {
    val builder = CfnDashboardCustomActionURLOperationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardCustomContentConfigurationProperty(block: CfnDashboardCustomContentConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.CustomContentConfigurationProperty {
    val builder = CfnDashboardCustomContentConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardCustomContentVisualProperty(block: CfnDashboardCustomContentVisualPropertyDsl.() -> Unit
      = {}): CfnDashboard.CustomContentVisualProperty {
    val builder = CfnDashboardCustomContentVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardCustomFilterConfigurationProperty(block: CfnDashboardCustomFilterConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.CustomFilterConfigurationProperty {
    val builder = CfnDashboardCustomFilterConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardCustomFilterListConfigurationProperty(block: CfnDashboardCustomFilterListConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.CustomFilterListConfigurationProperty {
    val builder = CfnDashboardCustomFilterListConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardCustomNarrativeOptionsProperty(block: CfnDashboardCustomNarrativeOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.CustomNarrativeOptionsProperty {
    val builder = CfnDashboardCustomNarrativeOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardCustomParameterValuesProperty(block: CfnDashboardCustomParameterValuesPropertyDsl.() -> Unit
      = {}): CfnDashboard.CustomParameterValuesProperty {
    val builder = CfnDashboardCustomParameterValuesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardCustomValuesConfigurationProperty(block: CfnDashboardCustomValuesConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.CustomValuesConfigurationProperty {
    val builder = CfnDashboardCustomValuesConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardDashboardErrorProperty(block: CfnDashboardDashboardErrorPropertyDsl.() -> Unit
      = {}): CfnDashboard.DashboardErrorProperty {
    val builder = CfnDashboardDashboardErrorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardDashboardPublishOptionsProperty(block: CfnDashboardDashboardPublishOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.DashboardPublishOptionsProperty {
    val builder = CfnDashboardDashboardPublishOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardDashboardSourceEntityProperty(block: CfnDashboardDashboardSourceEntityPropertyDsl.() -> Unit
      = {}): CfnDashboard.DashboardSourceEntityProperty {
    val builder = CfnDashboardDashboardSourceEntityPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardDashboardSourceTemplateProperty(block: CfnDashboardDashboardSourceTemplatePropertyDsl.() -> Unit
      = {}): CfnDashboard.DashboardSourceTemplateProperty {
    val builder = CfnDashboardDashboardSourceTemplatePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardDashboardVersionDefinitionProperty(block: CfnDashboardDashboardVersionDefinitionPropertyDsl.() -> Unit
      = {}): CfnDashboard.DashboardVersionDefinitionProperty {
    val builder = CfnDashboardDashboardVersionDefinitionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardDashboardVersionProperty(block: CfnDashboardDashboardVersionPropertyDsl.() -> Unit
      = {}): CfnDashboard.DashboardVersionProperty {
    val builder = CfnDashboardDashboardVersionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardDashboardVisualPublishOptionsProperty(block: CfnDashboardDashboardVisualPublishOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.DashboardVisualPublishOptionsProperty {
    val builder = CfnDashboardDashboardVisualPublishOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardDataBarsOptionsProperty(block: CfnDashboardDataBarsOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.DataBarsOptionsProperty {
    val builder = CfnDashboardDataBarsOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDashboardDataColorProperty(block: CfnDashboardDataColorPropertyDsl.() -> Unit
      = {}): CfnDashboard.DataColorProperty {
    val builder = CfnDashboardDataColorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardDataFieldSeriesItemProperty(block: CfnDashboardDataFieldSeriesItemPropertyDsl.() -> Unit
      = {}): CfnDashboard.DataFieldSeriesItemProperty {
    val builder = CfnDashboardDataFieldSeriesItemPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardDataLabelOptionsProperty(block: CfnDashboardDataLabelOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.DataLabelOptionsProperty {
    val builder = CfnDashboardDataLabelOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardDataLabelTypeProperty(block: CfnDashboardDataLabelTypePropertyDsl.() -> Unit =
      {}): CfnDashboard.DataLabelTypeProperty {
    val builder = CfnDashboardDataLabelTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardDataPathColorProperty(block: CfnDashboardDataPathColorPropertyDsl.() -> Unit =
      {}): CfnDashboard.DataPathColorProperty {
    val builder = CfnDashboardDataPathColorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardDataPathLabelTypeProperty(block: CfnDashboardDataPathLabelTypePropertyDsl.() -> Unit
      = {}): CfnDashboard.DataPathLabelTypeProperty {
    val builder = CfnDashboardDataPathLabelTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardDataPathSortProperty(block: CfnDashboardDataPathSortPropertyDsl.() -> Unit =
      {}): CfnDashboard.DataPathSortProperty {
    val builder = CfnDashboardDataPathSortPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardDataPathValueProperty(block: CfnDashboardDataPathValuePropertyDsl.() -> Unit =
      {}): CfnDashboard.DataPathValueProperty {
    val builder = CfnDashboardDataPathValuePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardDataPointDrillUpDownOptionProperty(block: CfnDashboardDataPointDrillUpDownOptionPropertyDsl.() -> Unit
      = {}): CfnDashboard.DataPointDrillUpDownOptionProperty {
    val builder = CfnDashboardDataPointDrillUpDownOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardDataPointMenuLabelOptionProperty(block: CfnDashboardDataPointMenuLabelOptionPropertyDsl.() -> Unit
      = {}): CfnDashboard.DataPointMenuLabelOptionProperty {
    val builder = CfnDashboardDataPointMenuLabelOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardDataPointTooltipOptionProperty(block: CfnDashboardDataPointTooltipOptionPropertyDsl.() -> Unit
      = {}): CfnDashboard.DataPointTooltipOptionProperty {
    val builder = CfnDashboardDataPointTooltipOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardDataSetIdentifierDeclarationProperty(block: CfnDashboardDataSetIdentifierDeclarationPropertyDsl.() -> Unit
      = {}): CfnDashboard.DataSetIdentifierDeclarationProperty {
    val builder = CfnDashboardDataSetIdentifierDeclarationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardDataSetReferenceProperty(block: CfnDashboardDataSetReferencePropertyDsl.() -> Unit
      = {}): CfnDashboard.DataSetReferenceProperty {
    val builder = CfnDashboardDataSetReferencePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardDateAxisOptionsProperty(block: CfnDashboardDateAxisOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.DateAxisOptionsProperty {
    val builder = CfnDashboardDateAxisOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardDateDimensionFieldProperty(block: CfnDashboardDateDimensionFieldPropertyDsl.() -> Unit
      = {}): CfnDashboard.DateDimensionFieldProperty {
    val builder = CfnDashboardDateDimensionFieldPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardDateMeasureFieldProperty(block: CfnDashboardDateMeasureFieldPropertyDsl.() -> Unit
      = {}): CfnDashboard.DateMeasureFieldProperty {
    val builder = CfnDashboardDateMeasureFieldPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardDateTimeDefaultValuesProperty(block: CfnDashboardDateTimeDefaultValuesPropertyDsl.() -> Unit
      = {}): CfnDashboard.DateTimeDefaultValuesProperty {
    val builder = CfnDashboardDateTimeDefaultValuesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardDateTimeFormatConfigurationProperty(block: CfnDashboardDateTimeFormatConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.DateTimeFormatConfigurationProperty {
    val builder = CfnDashboardDateTimeFormatConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardDateTimeHierarchyProperty(block: CfnDashboardDateTimeHierarchyPropertyDsl.() -> Unit
      = {}): CfnDashboard.DateTimeHierarchyProperty {
    val builder = CfnDashboardDateTimeHierarchyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardDateTimeParameterDeclarationProperty(block: CfnDashboardDateTimeParameterDeclarationPropertyDsl.() -> Unit
      = {}): CfnDashboard.DateTimeParameterDeclarationProperty {
    val builder = CfnDashboardDateTimeParameterDeclarationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardDateTimeParameterProperty(block: CfnDashboardDateTimeParameterPropertyDsl.() -> Unit
      = {}): CfnDashboard.DateTimeParameterProperty {
    val builder = CfnDashboardDateTimeParameterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardDateTimePickerControlDisplayOptionsProperty(block: CfnDashboardDateTimePickerControlDisplayOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.DateTimePickerControlDisplayOptionsProperty {
    val builder = CfnDashboardDateTimePickerControlDisplayOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardDateTimeValueWhenUnsetConfigurationProperty(block: CfnDashboardDateTimeValueWhenUnsetConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.DateTimeValueWhenUnsetConfigurationProperty {
    val builder = CfnDashboardDateTimeValueWhenUnsetConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardDecimalDefaultValuesProperty(block: CfnDashboardDecimalDefaultValuesPropertyDsl.() -> Unit
      = {}): CfnDashboard.DecimalDefaultValuesProperty {
    val builder = CfnDashboardDecimalDefaultValuesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardDecimalParameterDeclarationProperty(block: CfnDashboardDecimalParameterDeclarationPropertyDsl.() -> Unit
      = {}): CfnDashboard.DecimalParameterDeclarationProperty {
    val builder = CfnDashboardDecimalParameterDeclarationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardDecimalParameterProperty(block: CfnDashboardDecimalParameterPropertyDsl.() -> Unit
      = {}): CfnDashboard.DecimalParameterProperty {
    val builder = CfnDashboardDecimalParameterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardDecimalPlacesConfigurationProperty(block: CfnDashboardDecimalPlacesConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.DecimalPlacesConfigurationProperty {
    val builder = CfnDashboardDecimalPlacesConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardDecimalValueWhenUnsetConfigurationProperty(block: CfnDashboardDecimalValueWhenUnsetConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.DecimalValueWhenUnsetConfigurationProperty {
    val builder = CfnDashboardDecimalValueWhenUnsetConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardDefaultFreeFormLayoutConfigurationProperty(block: CfnDashboardDefaultFreeFormLayoutConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.DefaultFreeFormLayoutConfigurationProperty {
    val builder = CfnDashboardDefaultFreeFormLayoutConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardDefaultGridLayoutConfigurationProperty(block: CfnDashboardDefaultGridLayoutConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.DefaultGridLayoutConfigurationProperty {
    val builder = CfnDashboardDefaultGridLayoutConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardDefaultInteractiveLayoutConfigurationProperty(block: CfnDashboardDefaultInteractiveLayoutConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.DefaultInteractiveLayoutConfigurationProperty {
    val builder = CfnDashboardDefaultInteractiveLayoutConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardDefaultNewSheetConfigurationProperty(block: CfnDashboardDefaultNewSheetConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.DefaultNewSheetConfigurationProperty {
    val builder = CfnDashboardDefaultNewSheetConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardDefaultPaginatedLayoutConfigurationProperty(block: CfnDashboardDefaultPaginatedLayoutConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.DefaultPaginatedLayoutConfigurationProperty {
    val builder = CfnDashboardDefaultPaginatedLayoutConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardDefaultSectionBasedLayoutConfigurationProperty(block: CfnDashboardDefaultSectionBasedLayoutConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.DefaultSectionBasedLayoutConfigurationProperty {
    val builder = CfnDashboardDefaultSectionBasedLayoutConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardDestinationParameterValueConfigurationProperty(block: CfnDashboardDestinationParameterValueConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.DestinationParameterValueConfigurationProperty {
    val builder = CfnDashboardDestinationParameterValueConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardDimensionFieldProperty(block: CfnDashboardDimensionFieldPropertyDsl.() -> Unit
      = {}): CfnDashboard.DimensionFieldProperty {
    val builder = CfnDashboardDimensionFieldPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardDonutCenterOptionsProperty(block: CfnDashboardDonutCenterOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.DonutCenterOptionsProperty {
    val builder = CfnDashboardDonutCenterOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardDonutOptionsProperty(block: CfnDashboardDonutOptionsPropertyDsl.() -> Unit =
      {}): CfnDashboard.DonutOptionsProperty {
    val builder = CfnDashboardDonutOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardDrillDownFilterProperty(block: CfnDashboardDrillDownFilterPropertyDsl.() -> Unit
      = {}): CfnDashboard.DrillDownFilterProperty {
    val builder = CfnDashboardDrillDownFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardDropDownControlDisplayOptionsProperty(block: CfnDashboardDropDownControlDisplayOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.DropDownControlDisplayOptionsProperty {
    val builder = CfnDashboardDropDownControlDisplayOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardDynamicDefaultValueProperty(block: CfnDashboardDynamicDefaultValuePropertyDsl.() -> Unit
      = {}): CfnDashboard.DynamicDefaultValueProperty {
    val builder = CfnDashboardDynamicDefaultValuePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardEmptyVisualProperty(block: CfnDashboardEmptyVisualPropertyDsl.() -> Unit =
      {}): CfnDashboard.EmptyVisualProperty {
    val builder = CfnDashboardEmptyVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDashboardEntityProperty(block: CfnDashboardEntityPropertyDsl.() -> Unit =
      {}): CfnDashboard.EntityProperty {
    val builder = CfnDashboardEntityPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardExcludePeriodConfigurationProperty(block: CfnDashboardExcludePeriodConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.ExcludePeriodConfigurationProperty {
    val builder = CfnDashboardExcludePeriodConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardExplicitHierarchyProperty(block: CfnDashboardExplicitHierarchyPropertyDsl.() -> Unit
      = {}): CfnDashboard.ExplicitHierarchyProperty {
    val builder = CfnDashboardExplicitHierarchyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardExportHiddenFieldsOptionProperty(block: CfnDashboardExportHiddenFieldsOptionPropertyDsl.() -> Unit
      = {}): CfnDashboard.ExportHiddenFieldsOptionProperty {
    val builder = CfnDashboardExportHiddenFieldsOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardExportToCSVOptionProperty(block: CfnDashboardExportToCSVOptionPropertyDsl.() -> Unit
      = {}): CfnDashboard.ExportToCSVOptionProperty {
    val builder = CfnDashboardExportToCSVOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardExportWithHiddenFieldsOptionProperty(block: CfnDashboardExportWithHiddenFieldsOptionPropertyDsl.() -> Unit
      = {}): CfnDashboard.ExportWithHiddenFieldsOptionProperty {
    val builder = CfnDashboardExportWithHiddenFieldsOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardFieldBasedTooltipProperty(block: CfnDashboardFieldBasedTooltipPropertyDsl.() -> Unit
      = {}): CfnDashboard.FieldBasedTooltipProperty {
    val builder = CfnDashboardFieldBasedTooltipPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardFieldLabelTypeProperty(block: CfnDashboardFieldLabelTypePropertyDsl.() -> Unit
      = {}): CfnDashboard.FieldLabelTypeProperty {
    val builder = CfnDashboardFieldLabelTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardFieldSeriesItemProperty(block: CfnDashboardFieldSeriesItemPropertyDsl.() -> Unit
      = {}): CfnDashboard.FieldSeriesItemProperty {
    val builder = CfnDashboardFieldSeriesItemPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardFieldSortOptionsProperty(block: CfnDashboardFieldSortOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.FieldSortOptionsProperty {
    val builder = CfnDashboardFieldSortOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDashboardFieldSortProperty(block: CfnDashboardFieldSortPropertyDsl.() -> Unit
      = {}): CfnDashboard.FieldSortProperty {
    val builder = CfnDashboardFieldSortPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardFieldTooltipItemProperty(block: CfnDashboardFieldTooltipItemPropertyDsl.() -> Unit
      = {}): CfnDashboard.FieldTooltipItemProperty {
    val builder = CfnDashboardFieldTooltipItemPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardFilledMapAggregatedFieldWellsProperty(block: CfnDashboardFilledMapAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnDashboard.FilledMapAggregatedFieldWellsProperty {
    val builder = CfnDashboardFilledMapAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardFilledMapConditionalFormattingOptionProperty(block: CfnDashboardFilledMapConditionalFormattingOptionPropertyDsl.() -> Unit
      = {}): CfnDashboard.FilledMapConditionalFormattingOptionProperty {
    val builder = CfnDashboardFilledMapConditionalFormattingOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardFilledMapConditionalFormattingProperty(block: CfnDashboardFilledMapConditionalFormattingPropertyDsl.() -> Unit
      = {}): CfnDashboard.FilledMapConditionalFormattingProperty {
    val builder = CfnDashboardFilledMapConditionalFormattingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardFilledMapConfigurationProperty(block: CfnDashboardFilledMapConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.FilledMapConfigurationProperty {
    val builder = CfnDashboardFilledMapConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardFilledMapFieldWellsProperty(block: CfnDashboardFilledMapFieldWellsPropertyDsl.() -> Unit
      = {}): CfnDashboard.FilledMapFieldWellsProperty {
    val builder = CfnDashboardFilledMapFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardFilledMapShapeConditionalFormattingProperty(block: CfnDashboardFilledMapShapeConditionalFormattingPropertyDsl.() -> Unit
      = {}): CfnDashboard.FilledMapShapeConditionalFormattingProperty {
    val builder = CfnDashboardFilledMapShapeConditionalFormattingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardFilledMapSortConfigurationProperty(block: CfnDashboardFilledMapSortConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.FilledMapSortConfigurationProperty {
    val builder = CfnDashboardFilledMapSortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardFilledMapVisualProperty(block: CfnDashboardFilledMapVisualPropertyDsl.() -> Unit
      = {}): CfnDashboard.FilledMapVisualProperty {
    val builder = CfnDashboardFilledMapVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardFilterControlProperty(block: CfnDashboardFilterControlPropertyDsl.() -> Unit =
      {}): CfnDashboard.FilterControlProperty {
    val builder = CfnDashboardFilterControlPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardFilterDateTimePickerControlProperty(block: CfnDashboardFilterDateTimePickerControlPropertyDsl.() -> Unit
      = {}): CfnDashboard.FilterDateTimePickerControlProperty {
    val builder = CfnDashboardFilterDateTimePickerControlPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardFilterDropDownControlProperty(block: CfnDashboardFilterDropDownControlPropertyDsl.() -> Unit
      = {}): CfnDashboard.FilterDropDownControlProperty {
    val builder = CfnDashboardFilterDropDownControlPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardFilterGroupProperty(block: CfnDashboardFilterGroupPropertyDsl.() -> Unit =
      {}): CfnDashboard.FilterGroupProperty {
    val builder = CfnDashboardFilterGroupPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardFilterListConfigurationProperty(block: CfnDashboardFilterListConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.FilterListConfigurationProperty {
    val builder = CfnDashboardFilterListConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardFilterListControlProperty(block: CfnDashboardFilterListControlPropertyDsl.() -> Unit
      = {}): CfnDashboard.FilterListControlProperty {
    val builder = CfnDashboardFilterListControlPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardFilterOperationSelectedFieldsConfigurationProperty(block: CfnDashboardFilterOperationSelectedFieldsConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.FilterOperationSelectedFieldsConfigurationProperty {
    val builder = CfnDashboardFilterOperationSelectedFieldsConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardFilterOperationTargetVisualsConfigurationProperty(block: CfnDashboardFilterOperationTargetVisualsConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.FilterOperationTargetVisualsConfigurationProperty {
    val builder = CfnDashboardFilterOperationTargetVisualsConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDashboardFilterProperty(block: CfnDashboardFilterPropertyDsl.() -> Unit =
      {}): CfnDashboard.FilterProperty {
    val builder = CfnDashboardFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardFilterRelativeDateTimeControlProperty(block: CfnDashboardFilterRelativeDateTimeControlPropertyDsl.() -> Unit
      = {}): CfnDashboard.FilterRelativeDateTimeControlProperty {
    val builder = CfnDashboardFilterRelativeDateTimeControlPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardFilterScopeConfigurationProperty(block: CfnDashboardFilterScopeConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.FilterScopeConfigurationProperty {
    val builder = CfnDashboardFilterScopeConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardFilterSelectableValuesProperty(block: CfnDashboardFilterSelectableValuesPropertyDsl.() -> Unit
      = {}): CfnDashboard.FilterSelectableValuesProperty {
    val builder = CfnDashboardFilterSelectableValuesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardFilterSliderControlProperty(block: CfnDashboardFilterSliderControlPropertyDsl.() -> Unit
      = {}): CfnDashboard.FilterSliderControlProperty {
    val builder = CfnDashboardFilterSliderControlPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardFilterTextAreaControlProperty(block: CfnDashboardFilterTextAreaControlPropertyDsl.() -> Unit
      = {}): CfnDashboard.FilterTextAreaControlProperty {
    val builder = CfnDashboardFilterTextAreaControlPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardFilterTextFieldControlProperty(block: CfnDashboardFilterTextFieldControlPropertyDsl.() -> Unit
      = {}): CfnDashboard.FilterTextFieldControlProperty {
    val builder = CfnDashboardFilterTextFieldControlPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardFontConfigurationProperty(block: CfnDashboardFontConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.FontConfigurationProperty {
    val builder = CfnDashboardFontConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDashboardFontSizeProperty(block: CfnDashboardFontSizePropertyDsl.() -> Unit =
      {}): CfnDashboard.FontSizeProperty {
    val builder = CfnDashboardFontSizePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardFontWeightProperty(block: CfnDashboardFontWeightPropertyDsl.() -> Unit = {}):
      CfnDashboard.FontWeightProperty {
    val builder = CfnDashboardFontWeightPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardForecastComputationProperty(block: CfnDashboardForecastComputationPropertyDsl.() -> Unit
      = {}): CfnDashboard.ForecastComputationProperty {
    val builder = CfnDashboardForecastComputationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardForecastConfigurationProperty(block: CfnDashboardForecastConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.ForecastConfigurationProperty {
    val builder = CfnDashboardForecastConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardForecastScenarioProperty(block: CfnDashboardForecastScenarioPropertyDsl.() -> Unit
      = {}): CfnDashboard.ForecastScenarioProperty {
    val builder = CfnDashboardForecastScenarioPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardFormatConfigurationProperty(block: CfnDashboardFormatConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.FormatConfigurationProperty {
    val builder = CfnDashboardFormatConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardFreeFormLayoutCanvasSizeOptionsProperty(block: CfnDashboardFreeFormLayoutCanvasSizeOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.FreeFormLayoutCanvasSizeOptionsProperty {
    val builder = CfnDashboardFreeFormLayoutCanvasSizeOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardFreeFormLayoutConfigurationProperty(block: CfnDashboardFreeFormLayoutConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.FreeFormLayoutConfigurationProperty {
    val builder = CfnDashboardFreeFormLayoutConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardFreeFormLayoutElementBackgroundStyleProperty(block: CfnDashboardFreeFormLayoutElementBackgroundStylePropertyDsl.() -> Unit
      = {}): CfnDashboard.FreeFormLayoutElementBackgroundStyleProperty {
    val builder = CfnDashboardFreeFormLayoutElementBackgroundStylePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardFreeFormLayoutElementBorderStyleProperty(block: CfnDashboardFreeFormLayoutElementBorderStylePropertyDsl.() -> Unit
      = {}): CfnDashboard.FreeFormLayoutElementBorderStyleProperty {
    val builder = CfnDashboardFreeFormLayoutElementBorderStylePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardFreeFormLayoutElementProperty(block: CfnDashboardFreeFormLayoutElementPropertyDsl.() -> Unit
      = {}): CfnDashboard.FreeFormLayoutElementProperty {
    val builder = CfnDashboardFreeFormLayoutElementPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardFreeFormLayoutScreenCanvasSizeOptionsProperty(block: CfnDashboardFreeFormLayoutScreenCanvasSizeOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.FreeFormLayoutScreenCanvasSizeOptionsProperty {
    val builder = CfnDashboardFreeFormLayoutScreenCanvasSizeOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardFreeFormSectionLayoutConfigurationProperty(block: CfnDashboardFreeFormSectionLayoutConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.FreeFormSectionLayoutConfigurationProperty {
    val builder = CfnDashboardFreeFormSectionLayoutConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardFunnelChartAggregatedFieldWellsProperty(block: CfnDashboardFunnelChartAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnDashboard.FunnelChartAggregatedFieldWellsProperty {
    val builder = CfnDashboardFunnelChartAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardFunnelChartConfigurationProperty(block: CfnDashboardFunnelChartConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.FunnelChartConfigurationProperty {
    val builder = CfnDashboardFunnelChartConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardFunnelChartDataLabelOptionsProperty(block: CfnDashboardFunnelChartDataLabelOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.FunnelChartDataLabelOptionsProperty {
    val builder = CfnDashboardFunnelChartDataLabelOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardFunnelChartFieldWellsProperty(block: CfnDashboardFunnelChartFieldWellsPropertyDsl.() -> Unit
      = {}): CfnDashboard.FunnelChartFieldWellsProperty {
    val builder = CfnDashboardFunnelChartFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardFunnelChartSortConfigurationProperty(block: CfnDashboardFunnelChartSortConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.FunnelChartSortConfigurationProperty {
    val builder = CfnDashboardFunnelChartSortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardFunnelChartVisualProperty(block: CfnDashboardFunnelChartVisualPropertyDsl.() -> Unit
      = {}): CfnDashboard.FunnelChartVisualProperty {
    val builder = CfnDashboardFunnelChartVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardGaugeChartArcConditionalFormattingProperty(block: CfnDashboardGaugeChartArcConditionalFormattingPropertyDsl.() -> Unit
      = {}): CfnDashboard.GaugeChartArcConditionalFormattingProperty {
    val builder = CfnDashboardGaugeChartArcConditionalFormattingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardGaugeChartConditionalFormattingOptionProperty(block: CfnDashboardGaugeChartConditionalFormattingOptionPropertyDsl.() -> Unit
      = {}): CfnDashboard.GaugeChartConditionalFormattingOptionProperty {
    val builder = CfnDashboardGaugeChartConditionalFormattingOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardGaugeChartConditionalFormattingProperty(block: CfnDashboardGaugeChartConditionalFormattingPropertyDsl.() -> Unit
      = {}): CfnDashboard.GaugeChartConditionalFormattingProperty {
    val builder = CfnDashboardGaugeChartConditionalFormattingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardGaugeChartConfigurationProperty(block: CfnDashboardGaugeChartConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.GaugeChartConfigurationProperty {
    val builder = CfnDashboardGaugeChartConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardGaugeChartFieldWellsProperty(block: CfnDashboardGaugeChartFieldWellsPropertyDsl.() -> Unit
      = {}): CfnDashboard.GaugeChartFieldWellsProperty {
    val builder = CfnDashboardGaugeChartFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardGaugeChartOptionsProperty(block: CfnDashboardGaugeChartOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.GaugeChartOptionsProperty {
    val builder = CfnDashboardGaugeChartOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardGaugeChartPrimaryValueConditionalFormattingProperty(block: CfnDashboardGaugeChartPrimaryValueConditionalFormattingPropertyDsl.() -> Unit
      = {}): CfnDashboard.GaugeChartPrimaryValueConditionalFormattingProperty {
    val builder = CfnDashboardGaugeChartPrimaryValueConditionalFormattingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardGaugeChartVisualProperty(block: CfnDashboardGaugeChartVisualPropertyDsl.() -> Unit
      = {}): CfnDashboard.GaugeChartVisualProperty {
    val builder = CfnDashboardGaugeChartVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardGeospatialCoordinateBoundsProperty(block: CfnDashboardGeospatialCoordinateBoundsPropertyDsl.() -> Unit
      = {}): CfnDashboard.GeospatialCoordinateBoundsProperty {
    val builder = CfnDashboardGeospatialCoordinateBoundsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardGeospatialHeatmapColorScaleProperty(block: CfnDashboardGeospatialHeatmapColorScalePropertyDsl.() -> Unit
      = {}): CfnDashboard.GeospatialHeatmapColorScaleProperty {
    val builder = CfnDashboardGeospatialHeatmapColorScalePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardGeospatialHeatmapConfigurationProperty(block: CfnDashboardGeospatialHeatmapConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.GeospatialHeatmapConfigurationProperty {
    val builder = CfnDashboardGeospatialHeatmapConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardGeospatialHeatmapDataColorProperty(block: CfnDashboardGeospatialHeatmapDataColorPropertyDsl.() -> Unit
      = {}): CfnDashboard.GeospatialHeatmapDataColorProperty {
    val builder = CfnDashboardGeospatialHeatmapDataColorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardGeospatialMapAggregatedFieldWellsProperty(block: CfnDashboardGeospatialMapAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnDashboard.GeospatialMapAggregatedFieldWellsProperty {
    val builder = CfnDashboardGeospatialMapAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardGeospatialMapConfigurationProperty(block: CfnDashboardGeospatialMapConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.GeospatialMapConfigurationProperty {
    val builder = CfnDashboardGeospatialMapConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardGeospatialMapFieldWellsProperty(block: CfnDashboardGeospatialMapFieldWellsPropertyDsl.() -> Unit
      = {}): CfnDashboard.GeospatialMapFieldWellsProperty {
    val builder = CfnDashboardGeospatialMapFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardGeospatialMapStyleOptionsProperty(block: CfnDashboardGeospatialMapStyleOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.GeospatialMapStyleOptionsProperty {
    val builder = CfnDashboardGeospatialMapStyleOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardGeospatialMapVisualProperty(block: CfnDashboardGeospatialMapVisualPropertyDsl.() -> Unit
      = {}): CfnDashboard.GeospatialMapVisualProperty {
    val builder = CfnDashboardGeospatialMapVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardGeospatialPointStyleOptionsProperty(block: CfnDashboardGeospatialPointStyleOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.GeospatialPointStyleOptionsProperty {
    val builder = CfnDashboardGeospatialPointStyleOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardGeospatialWindowOptionsProperty(block: CfnDashboardGeospatialWindowOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.GeospatialWindowOptionsProperty {
    val builder = CfnDashboardGeospatialWindowOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardGlobalTableBorderOptionsProperty(block: CfnDashboardGlobalTableBorderOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.GlobalTableBorderOptionsProperty {
    val builder = CfnDashboardGlobalTableBorderOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardGradientColorProperty(block: CfnDashboardGradientColorPropertyDsl.() -> Unit =
      {}): CfnDashboard.GradientColorProperty {
    val builder = CfnDashboardGradientColorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardGradientStopProperty(block: CfnDashboardGradientStopPropertyDsl.() -> Unit =
      {}): CfnDashboard.GradientStopProperty {
    val builder = CfnDashboardGradientStopPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardGridLayoutCanvasSizeOptionsProperty(block: CfnDashboardGridLayoutCanvasSizeOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.GridLayoutCanvasSizeOptionsProperty {
    val builder = CfnDashboardGridLayoutCanvasSizeOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardGridLayoutConfigurationProperty(block: CfnDashboardGridLayoutConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.GridLayoutConfigurationProperty {
    val builder = CfnDashboardGridLayoutConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardGridLayoutElementProperty(block: CfnDashboardGridLayoutElementPropertyDsl.() -> Unit
      = {}): CfnDashboard.GridLayoutElementProperty {
    val builder = CfnDashboardGridLayoutElementPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardGridLayoutScreenCanvasSizeOptionsProperty(block: CfnDashboardGridLayoutScreenCanvasSizeOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.GridLayoutScreenCanvasSizeOptionsProperty {
    val builder = CfnDashboardGridLayoutScreenCanvasSizeOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardGrowthRateComputationProperty(block: CfnDashboardGrowthRateComputationPropertyDsl.() -> Unit
      = {}): CfnDashboard.GrowthRateComputationProperty {
    val builder = CfnDashboardGrowthRateComputationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardHeaderFooterSectionConfigurationProperty(block: CfnDashboardHeaderFooterSectionConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.HeaderFooterSectionConfigurationProperty {
    val builder = CfnDashboardHeaderFooterSectionConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardHeatMapAggregatedFieldWellsProperty(block: CfnDashboardHeatMapAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnDashboard.HeatMapAggregatedFieldWellsProperty {
    val builder = CfnDashboardHeatMapAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardHeatMapConfigurationProperty(block: CfnDashboardHeatMapConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.HeatMapConfigurationProperty {
    val builder = CfnDashboardHeatMapConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardHeatMapFieldWellsProperty(block: CfnDashboardHeatMapFieldWellsPropertyDsl.() -> Unit
      = {}): CfnDashboard.HeatMapFieldWellsProperty {
    val builder = CfnDashboardHeatMapFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardHeatMapSortConfigurationProperty(block: CfnDashboardHeatMapSortConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.HeatMapSortConfigurationProperty {
    val builder = CfnDashboardHeatMapSortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardHeatMapVisualProperty(block: CfnDashboardHeatMapVisualPropertyDsl.() -> Unit =
      {}): CfnDashboard.HeatMapVisualProperty {
    val builder = CfnDashboardHeatMapVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardHistogramAggregatedFieldWellsProperty(block: CfnDashboardHistogramAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnDashboard.HistogramAggregatedFieldWellsProperty {
    val builder = CfnDashboardHistogramAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardHistogramBinOptionsProperty(block: CfnDashboardHistogramBinOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.HistogramBinOptionsProperty {
    val builder = CfnDashboardHistogramBinOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardHistogramConfigurationProperty(block: CfnDashboardHistogramConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.HistogramConfigurationProperty {
    val builder = CfnDashboardHistogramConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardHistogramFieldWellsProperty(block: CfnDashboardHistogramFieldWellsPropertyDsl.() -> Unit
      = {}): CfnDashboard.HistogramFieldWellsProperty {
    val builder = CfnDashboardHistogramFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardHistogramVisualProperty(block: CfnDashboardHistogramVisualPropertyDsl.() -> Unit
      = {}): CfnDashboard.HistogramVisualProperty {
    val builder = CfnDashboardHistogramVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardInsightConfigurationProperty(block: CfnDashboardInsightConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.InsightConfigurationProperty {
    val builder = CfnDashboardInsightConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardInsightVisualProperty(block: CfnDashboardInsightVisualPropertyDsl.() -> Unit =
      {}): CfnDashboard.InsightVisualProperty {
    val builder = CfnDashboardInsightVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardIntegerDefaultValuesProperty(block: CfnDashboardIntegerDefaultValuesPropertyDsl.() -> Unit
      = {}): CfnDashboard.IntegerDefaultValuesProperty {
    val builder = CfnDashboardIntegerDefaultValuesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardIntegerParameterDeclarationProperty(block: CfnDashboardIntegerParameterDeclarationPropertyDsl.() -> Unit
      = {}): CfnDashboard.IntegerParameterDeclarationProperty {
    val builder = CfnDashboardIntegerParameterDeclarationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardIntegerParameterProperty(block: CfnDashboardIntegerParameterPropertyDsl.() -> Unit
      = {}): CfnDashboard.IntegerParameterProperty {
    val builder = CfnDashboardIntegerParameterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardIntegerValueWhenUnsetConfigurationProperty(block: CfnDashboardIntegerValueWhenUnsetConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.IntegerValueWhenUnsetConfigurationProperty {
    val builder = CfnDashboardIntegerValueWhenUnsetConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardItemsLimitConfigurationProperty(block: CfnDashboardItemsLimitConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.ItemsLimitConfigurationProperty {
    val builder = CfnDashboardItemsLimitConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardKPIConditionalFormattingOptionProperty(block: CfnDashboardKPIConditionalFormattingOptionPropertyDsl.() -> Unit
      = {}): CfnDashboard.KPIConditionalFormattingOptionProperty {
    val builder = CfnDashboardKPIConditionalFormattingOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardKPIConditionalFormattingProperty(block: CfnDashboardKPIConditionalFormattingPropertyDsl.() -> Unit
      = {}): CfnDashboard.KPIConditionalFormattingProperty {
    val builder = CfnDashboardKPIConditionalFormattingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardKPIConfigurationProperty(block: CfnDashboardKPIConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.KPIConfigurationProperty {
    val builder = CfnDashboardKPIConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardKPIFieldWellsProperty(block: CfnDashboardKPIFieldWellsPropertyDsl.() -> Unit =
      {}): CfnDashboard.KPIFieldWellsProperty {
    val builder = CfnDashboardKPIFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardKPIOptionsProperty(block: CfnDashboardKPIOptionsPropertyDsl.() -> Unit = {}):
      CfnDashboard.KPIOptionsProperty {
    val builder = CfnDashboardKPIOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardKPIPrimaryValueConditionalFormattingProperty(block: CfnDashboardKPIPrimaryValueConditionalFormattingPropertyDsl.() -> Unit
      = {}): CfnDashboard.KPIPrimaryValueConditionalFormattingProperty {
    val builder = CfnDashboardKPIPrimaryValueConditionalFormattingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardKPIProgressBarConditionalFormattingProperty(block: CfnDashboardKPIProgressBarConditionalFormattingPropertyDsl.() -> Unit
      = {}): CfnDashboard.KPIProgressBarConditionalFormattingProperty {
    val builder = CfnDashboardKPIProgressBarConditionalFormattingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardKPISortConfigurationProperty(block: CfnDashboardKPISortConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.KPISortConfigurationProperty {
    val builder = CfnDashboardKPISortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDashboardKPIVisualProperty(block: CfnDashboardKPIVisualPropertyDsl.() -> Unit
      = {}): CfnDashboard.KPIVisualProperty {
    val builder = CfnDashboardKPIVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardLabelOptionsProperty(block: CfnDashboardLabelOptionsPropertyDsl.() -> Unit =
      {}): CfnDashboard.LabelOptionsProperty {
    val builder = CfnDashboardLabelOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardLayoutConfigurationProperty(block: CfnDashboardLayoutConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.LayoutConfigurationProperty {
    val builder = CfnDashboardLayoutConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDashboardLayoutProperty(block: CfnDashboardLayoutPropertyDsl.() -> Unit =
      {}): CfnDashboard.LayoutProperty {
    val builder = CfnDashboardLayoutPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardLegendOptionsProperty(block: CfnDashboardLegendOptionsPropertyDsl.() -> Unit =
      {}): CfnDashboard.LegendOptionsProperty {
    val builder = CfnDashboardLegendOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardLineChartAggregatedFieldWellsProperty(block: CfnDashboardLineChartAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnDashboard.LineChartAggregatedFieldWellsProperty {
    val builder = CfnDashboardLineChartAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardLineChartConfigurationProperty(block: CfnDashboardLineChartConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.LineChartConfigurationProperty {
    val builder = CfnDashboardLineChartConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardLineChartDefaultSeriesSettingsProperty(block: CfnDashboardLineChartDefaultSeriesSettingsPropertyDsl.() -> Unit
      = {}): CfnDashboard.LineChartDefaultSeriesSettingsProperty {
    val builder = CfnDashboardLineChartDefaultSeriesSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardLineChartFieldWellsProperty(block: CfnDashboardLineChartFieldWellsPropertyDsl.() -> Unit
      = {}): CfnDashboard.LineChartFieldWellsProperty {
    val builder = CfnDashboardLineChartFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardLineChartLineStyleSettingsProperty(block: CfnDashboardLineChartLineStyleSettingsPropertyDsl.() -> Unit
      = {}): CfnDashboard.LineChartLineStyleSettingsProperty {
    val builder = CfnDashboardLineChartLineStyleSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardLineChartMarkerStyleSettingsProperty(block: CfnDashboardLineChartMarkerStyleSettingsPropertyDsl.() -> Unit
      = {}): CfnDashboard.LineChartMarkerStyleSettingsProperty {
    val builder = CfnDashboardLineChartMarkerStyleSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardLineChartSeriesSettingsProperty(block: CfnDashboardLineChartSeriesSettingsPropertyDsl.() -> Unit
      = {}): CfnDashboard.LineChartSeriesSettingsProperty {
    val builder = CfnDashboardLineChartSeriesSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardLineChartSortConfigurationProperty(block: CfnDashboardLineChartSortConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.LineChartSortConfigurationProperty {
    val builder = CfnDashboardLineChartSortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardLineChartVisualProperty(block: CfnDashboardLineChartVisualPropertyDsl.() -> Unit
      = {}): CfnDashboard.LineChartVisualProperty {
    val builder = CfnDashboardLineChartVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardLineSeriesAxisDisplayOptionsProperty(block: CfnDashboardLineSeriesAxisDisplayOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.LineSeriesAxisDisplayOptionsProperty {
    val builder = CfnDashboardLineSeriesAxisDisplayOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardListControlDisplayOptionsProperty(block: CfnDashboardListControlDisplayOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.ListControlDisplayOptionsProperty {
    val builder = CfnDashboardListControlDisplayOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardListControlSearchOptionsProperty(block: CfnDashboardListControlSearchOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.ListControlSearchOptionsProperty {
    val builder = CfnDashboardListControlSearchOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardListControlSelectAllOptionsProperty(block: CfnDashboardListControlSelectAllOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.ListControlSelectAllOptionsProperty {
    val builder = CfnDashboardListControlSelectAllOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardLoadingAnimationProperty(block: CfnDashboardLoadingAnimationPropertyDsl.() -> Unit
      = {}): CfnDashboard.LoadingAnimationProperty {
    val builder = CfnDashboardLoadingAnimationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardLocalNavigationConfigurationProperty(block: CfnDashboardLocalNavigationConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.LocalNavigationConfigurationProperty {
    val builder = CfnDashboardLocalNavigationConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardLongFormatTextProperty(block: CfnDashboardLongFormatTextPropertyDsl.() -> Unit
      = {}): CfnDashboard.LongFormatTextProperty {
    val builder = CfnDashboardLongFormatTextPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardMappedDataSetParameterProperty(block: CfnDashboardMappedDataSetParameterPropertyDsl.() -> Unit
      = {}): CfnDashboard.MappedDataSetParameterProperty {
    val builder = CfnDashboardMappedDataSetParameterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardMaximumLabelTypeProperty(block: CfnDashboardMaximumLabelTypePropertyDsl.() -> Unit
      = {}): CfnDashboard.MaximumLabelTypeProperty {
    val builder = CfnDashboardMaximumLabelTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardMaximumMinimumComputationProperty(block: CfnDashboardMaximumMinimumComputationPropertyDsl.() -> Unit
      = {}): CfnDashboard.MaximumMinimumComputationProperty {
    val builder = CfnDashboardMaximumMinimumComputationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardMeasureFieldProperty(block: CfnDashboardMeasureFieldPropertyDsl.() -> Unit =
      {}): CfnDashboard.MeasureFieldProperty {
    val builder = CfnDashboardMeasureFieldPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardMetricComparisonComputationProperty(block: CfnDashboardMetricComparisonComputationPropertyDsl.() -> Unit
      = {}): CfnDashboard.MetricComparisonComputationProperty {
    val builder = CfnDashboardMetricComparisonComputationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardMinimumLabelTypeProperty(block: CfnDashboardMinimumLabelTypePropertyDsl.() -> Unit
      = {}): CfnDashboard.MinimumLabelTypeProperty {
    val builder = CfnDashboardMinimumLabelTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardMissingDataConfigurationProperty(block: CfnDashboardMissingDataConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.MissingDataConfigurationProperty {
    val builder = CfnDashboardMissingDataConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardNegativeValueConfigurationProperty(block: CfnDashboardNegativeValueConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.NegativeValueConfigurationProperty {
    val builder = CfnDashboardNegativeValueConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardNullValueFormatConfigurationProperty(block: CfnDashboardNullValueFormatConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.NullValueFormatConfigurationProperty {
    val builder = CfnDashboardNullValueFormatConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardNumberDisplayFormatConfigurationProperty(block: CfnDashboardNumberDisplayFormatConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.NumberDisplayFormatConfigurationProperty {
    val builder = CfnDashboardNumberDisplayFormatConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardNumberFormatConfigurationProperty(block: CfnDashboardNumberFormatConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.NumberFormatConfigurationProperty {
    val builder = CfnDashboardNumberFormatConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardNumericAxisOptionsProperty(block: CfnDashboardNumericAxisOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.NumericAxisOptionsProperty {
    val builder = CfnDashboardNumericAxisOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardNumericEqualityDrillDownFilterProperty(block: CfnDashboardNumericEqualityDrillDownFilterPropertyDsl.() -> Unit
      = {}): CfnDashboard.NumericEqualityDrillDownFilterProperty {
    val builder = CfnDashboardNumericEqualityDrillDownFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardNumericEqualityFilterProperty(block: CfnDashboardNumericEqualityFilterPropertyDsl.() -> Unit
      = {}): CfnDashboard.NumericEqualityFilterProperty {
    val builder = CfnDashboardNumericEqualityFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardNumericFormatConfigurationProperty(block: CfnDashboardNumericFormatConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.NumericFormatConfigurationProperty {
    val builder = CfnDashboardNumericFormatConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardNumericRangeFilterProperty(block: CfnDashboardNumericRangeFilterPropertyDsl.() -> Unit
      = {}): CfnDashboard.NumericRangeFilterProperty {
    val builder = CfnDashboardNumericRangeFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardNumericRangeFilterValueProperty(block: CfnDashboardNumericRangeFilterValuePropertyDsl.() -> Unit
      = {}): CfnDashboard.NumericRangeFilterValueProperty {
    val builder = CfnDashboardNumericRangeFilterValuePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardNumericSeparatorConfigurationProperty(block: CfnDashboardNumericSeparatorConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.NumericSeparatorConfigurationProperty {
    val builder = CfnDashboardNumericSeparatorConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardNumericalAggregationFunctionProperty(block: CfnDashboardNumericalAggregationFunctionPropertyDsl.() -> Unit
      = {}): CfnDashboard.NumericalAggregationFunctionProperty {
    val builder = CfnDashboardNumericalAggregationFunctionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardNumericalDimensionFieldProperty(block: CfnDashboardNumericalDimensionFieldPropertyDsl.() -> Unit
      = {}): CfnDashboard.NumericalDimensionFieldProperty {
    val builder = CfnDashboardNumericalDimensionFieldPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardNumericalMeasureFieldProperty(block: CfnDashboardNumericalMeasureFieldPropertyDsl.() -> Unit
      = {}): CfnDashboard.NumericalMeasureFieldProperty {
    val builder = CfnDashboardNumericalMeasureFieldPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardPaginationConfigurationProperty(block: CfnDashboardPaginationConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.PaginationConfigurationProperty {
    val builder = CfnDashboardPaginationConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardPanelConfigurationProperty(block: CfnDashboardPanelConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.PanelConfigurationProperty {
    val builder = CfnDashboardPanelConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardPanelTitleOptionsProperty(block: CfnDashboardPanelTitleOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.PanelTitleOptionsProperty {
    val builder = CfnDashboardPanelTitleOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardParameterControlProperty(block: CfnDashboardParameterControlPropertyDsl.() -> Unit
      = {}): CfnDashboard.ParameterControlProperty {
    val builder = CfnDashboardParameterControlPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardParameterDateTimePickerControlProperty(block: CfnDashboardParameterDateTimePickerControlPropertyDsl.() -> Unit
      = {}): CfnDashboard.ParameterDateTimePickerControlProperty {
    val builder = CfnDashboardParameterDateTimePickerControlPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardParameterDeclarationProperty(block: CfnDashboardParameterDeclarationPropertyDsl.() -> Unit
      = {}): CfnDashboard.ParameterDeclarationProperty {
    val builder = CfnDashboardParameterDeclarationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardParameterDropDownControlProperty(block: CfnDashboardParameterDropDownControlPropertyDsl.() -> Unit
      = {}): CfnDashboard.ParameterDropDownControlProperty {
    val builder = CfnDashboardParameterDropDownControlPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardParameterListControlProperty(block: CfnDashboardParameterListControlPropertyDsl.() -> Unit
      = {}): CfnDashboard.ParameterListControlProperty {
    val builder = CfnDashboardParameterListControlPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardParameterSelectableValuesProperty(block: CfnDashboardParameterSelectableValuesPropertyDsl.() -> Unit
      = {}): CfnDashboard.ParameterSelectableValuesProperty {
    val builder = CfnDashboardParameterSelectableValuesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardParameterSliderControlProperty(block: CfnDashboardParameterSliderControlPropertyDsl.() -> Unit
      = {}): CfnDashboard.ParameterSliderControlProperty {
    val builder = CfnDashboardParameterSliderControlPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardParameterTextAreaControlProperty(block: CfnDashboardParameterTextAreaControlPropertyDsl.() -> Unit
      = {}): CfnDashboard.ParameterTextAreaControlProperty {
    val builder = CfnDashboardParameterTextAreaControlPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardParameterTextFieldControlProperty(block: CfnDashboardParameterTextFieldControlPropertyDsl.() -> Unit
      = {}): CfnDashboard.ParameterTextFieldControlProperty {
    val builder = CfnDashboardParameterTextFieldControlPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardParametersProperty(block: CfnDashboardParametersPropertyDsl.() -> Unit = {}):
      CfnDashboard.ParametersProperty {
    val builder = CfnDashboardParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardPercentVisibleRangeProperty(block: CfnDashboardPercentVisibleRangePropertyDsl.() -> Unit
      = {}): CfnDashboard.PercentVisibleRangeProperty {
    val builder = CfnDashboardPercentVisibleRangePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardPercentageDisplayFormatConfigurationProperty(block: CfnDashboardPercentageDisplayFormatConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.PercentageDisplayFormatConfigurationProperty {
    val builder = CfnDashboardPercentageDisplayFormatConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardPercentileAggregationProperty(block: CfnDashboardPercentileAggregationPropertyDsl.() -> Unit
      = {}): CfnDashboard.PercentileAggregationProperty {
    val builder = CfnDashboardPercentileAggregationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardPeriodOverPeriodComputationProperty(block: CfnDashboardPeriodOverPeriodComputationPropertyDsl.() -> Unit
      = {}): CfnDashboard.PeriodOverPeriodComputationProperty {
    val builder = CfnDashboardPeriodOverPeriodComputationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardPeriodToDateComputationProperty(block: CfnDashboardPeriodToDateComputationPropertyDsl.() -> Unit
      = {}): CfnDashboard.PeriodToDateComputationProperty {
    val builder = CfnDashboardPeriodToDateComputationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardPieChartAggregatedFieldWellsProperty(block: CfnDashboardPieChartAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnDashboard.PieChartAggregatedFieldWellsProperty {
    val builder = CfnDashboardPieChartAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardPieChartConfigurationProperty(block: CfnDashboardPieChartConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.PieChartConfigurationProperty {
    val builder = CfnDashboardPieChartConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardPieChartFieldWellsProperty(block: CfnDashboardPieChartFieldWellsPropertyDsl.() -> Unit
      = {}): CfnDashboard.PieChartFieldWellsProperty {
    val builder = CfnDashboardPieChartFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardPieChartSortConfigurationProperty(block: CfnDashboardPieChartSortConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.PieChartSortConfigurationProperty {
    val builder = CfnDashboardPieChartSortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardPieChartVisualProperty(block: CfnDashboardPieChartVisualPropertyDsl.() -> Unit
      = {}): CfnDashboard.PieChartVisualProperty {
    val builder = CfnDashboardPieChartVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardPivotFieldSortOptionsProperty(block: CfnDashboardPivotFieldSortOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.PivotFieldSortOptionsProperty {
    val builder = CfnDashboardPivotFieldSortOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardPivotTableAggregatedFieldWellsProperty(block: CfnDashboardPivotTableAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnDashboard.PivotTableAggregatedFieldWellsProperty {
    val builder = CfnDashboardPivotTableAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardPivotTableCellConditionalFormattingProperty(block: CfnDashboardPivotTableCellConditionalFormattingPropertyDsl.() -> Unit
      = {}): CfnDashboard.PivotTableCellConditionalFormattingProperty {
    val builder = CfnDashboardPivotTableCellConditionalFormattingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardPivotTableConditionalFormattingOptionProperty(block: CfnDashboardPivotTableConditionalFormattingOptionPropertyDsl.() -> Unit
      = {}): CfnDashboard.PivotTableConditionalFormattingOptionProperty {
    val builder = CfnDashboardPivotTableConditionalFormattingOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardPivotTableConditionalFormattingProperty(block: CfnDashboardPivotTableConditionalFormattingPropertyDsl.() -> Unit
      = {}): CfnDashboard.PivotTableConditionalFormattingProperty {
    val builder = CfnDashboardPivotTableConditionalFormattingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardPivotTableConditionalFormattingScopeProperty(block: CfnDashboardPivotTableConditionalFormattingScopePropertyDsl.() -> Unit
      = {}): CfnDashboard.PivotTableConditionalFormattingScopeProperty {
    val builder = CfnDashboardPivotTableConditionalFormattingScopePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardPivotTableConfigurationProperty(block: CfnDashboardPivotTableConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.PivotTableConfigurationProperty {
    val builder = CfnDashboardPivotTableConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardPivotTableDataPathOptionProperty(block: CfnDashboardPivotTableDataPathOptionPropertyDsl.() -> Unit
      = {}): CfnDashboard.PivotTableDataPathOptionProperty {
    val builder = CfnDashboardPivotTableDataPathOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardPivotTableFieldCollapseStateOptionProperty(block: CfnDashboardPivotTableFieldCollapseStateOptionPropertyDsl.() -> Unit
      = {}): CfnDashboard.PivotTableFieldCollapseStateOptionProperty {
    val builder = CfnDashboardPivotTableFieldCollapseStateOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardPivotTableFieldCollapseStateTargetProperty(block: CfnDashboardPivotTableFieldCollapseStateTargetPropertyDsl.() -> Unit
      = {}): CfnDashboard.PivotTableFieldCollapseStateTargetProperty {
    val builder = CfnDashboardPivotTableFieldCollapseStateTargetPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardPivotTableFieldOptionProperty(block: CfnDashboardPivotTableFieldOptionPropertyDsl.() -> Unit
      = {}): CfnDashboard.PivotTableFieldOptionProperty {
    val builder = CfnDashboardPivotTableFieldOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardPivotTableFieldOptionsProperty(block: CfnDashboardPivotTableFieldOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.PivotTableFieldOptionsProperty {
    val builder = CfnDashboardPivotTableFieldOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardPivotTableFieldSubtotalOptionsProperty(block: CfnDashboardPivotTableFieldSubtotalOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.PivotTableFieldSubtotalOptionsProperty {
    val builder = CfnDashboardPivotTableFieldSubtotalOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardPivotTableFieldWellsProperty(block: CfnDashboardPivotTableFieldWellsPropertyDsl.() -> Unit
      = {}): CfnDashboard.PivotTableFieldWellsProperty {
    val builder = CfnDashboardPivotTableFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardPivotTableOptionsProperty(block: CfnDashboardPivotTableOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.PivotTableOptionsProperty {
    val builder = CfnDashboardPivotTableOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardPivotTablePaginatedReportOptionsProperty(block: CfnDashboardPivotTablePaginatedReportOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.PivotTablePaginatedReportOptionsProperty {
    val builder = CfnDashboardPivotTablePaginatedReportOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardPivotTableSortByProperty(block: CfnDashboardPivotTableSortByPropertyDsl.() -> Unit
      = {}): CfnDashboard.PivotTableSortByProperty {
    val builder = CfnDashboardPivotTableSortByPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardPivotTableSortConfigurationProperty(block: CfnDashboardPivotTableSortConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.PivotTableSortConfigurationProperty {
    val builder = CfnDashboardPivotTableSortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardPivotTableTotalOptionsProperty(block: CfnDashboardPivotTableTotalOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.PivotTableTotalOptionsProperty {
    val builder = CfnDashboardPivotTableTotalOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardPivotTableVisualProperty(block: CfnDashboardPivotTableVisualPropertyDsl.() -> Unit
      = {}): CfnDashboard.PivotTableVisualProperty {
    val builder = CfnDashboardPivotTableVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardPivotTotalOptionsProperty(block: CfnDashboardPivotTotalOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.PivotTotalOptionsProperty {
    val builder = CfnDashboardPivotTotalOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardPredefinedHierarchyProperty(block: CfnDashboardPredefinedHierarchyPropertyDsl.() -> Unit
      = {}): CfnDashboard.PredefinedHierarchyProperty {
    val builder = CfnDashboardPredefinedHierarchyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardProgressBarOptionsProperty(block: CfnDashboardProgressBarOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.ProgressBarOptionsProperty {
    val builder = CfnDashboardProgressBarOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDashboardProps(block: CfnDashboardPropsDsl.() -> Unit = {}):
      CfnDashboardProps {
    val builder = CfnDashboardPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardRadarChartAggregatedFieldWellsProperty(block: CfnDashboardRadarChartAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnDashboard.RadarChartAggregatedFieldWellsProperty {
    val builder = CfnDashboardRadarChartAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardRadarChartAreaStyleSettingsProperty(block: CfnDashboardRadarChartAreaStyleSettingsPropertyDsl.() -> Unit
      = {}): CfnDashboard.RadarChartAreaStyleSettingsProperty {
    val builder = CfnDashboardRadarChartAreaStyleSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardRadarChartConfigurationProperty(block: CfnDashboardRadarChartConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.RadarChartConfigurationProperty {
    val builder = CfnDashboardRadarChartConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardRadarChartFieldWellsProperty(block: CfnDashboardRadarChartFieldWellsPropertyDsl.() -> Unit
      = {}): CfnDashboard.RadarChartFieldWellsProperty {
    val builder = CfnDashboardRadarChartFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardRadarChartSeriesSettingsProperty(block: CfnDashboardRadarChartSeriesSettingsPropertyDsl.() -> Unit
      = {}): CfnDashboard.RadarChartSeriesSettingsProperty {
    val builder = CfnDashboardRadarChartSeriesSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardRadarChartSortConfigurationProperty(block: CfnDashboardRadarChartSortConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.RadarChartSortConfigurationProperty {
    val builder = CfnDashboardRadarChartSortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardRadarChartVisualProperty(block: CfnDashboardRadarChartVisualPropertyDsl.() -> Unit
      = {}): CfnDashboard.RadarChartVisualProperty {
    val builder = CfnDashboardRadarChartVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardRangeEndsLabelTypeProperty(block: CfnDashboardRangeEndsLabelTypePropertyDsl.() -> Unit
      = {}): CfnDashboard.RangeEndsLabelTypeProperty {
    val builder = CfnDashboardRangeEndsLabelTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardReferenceLineCustomLabelConfigurationProperty(block: CfnDashboardReferenceLineCustomLabelConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.ReferenceLineCustomLabelConfigurationProperty {
    val builder = CfnDashboardReferenceLineCustomLabelConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardReferenceLineDataConfigurationProperty(block: CfnDashboardReferenceLineDataConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.ReferenceLineDataConfigurationProperty {
    val builder = CfnDashboardReferenceLineDataConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardReferenceLineDynamicDataConfigurationProperty(block: CfnDashboardReferenceLineDynamicDataConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.ReferenceLineDynamicDataConfigurationProperty {
    val builder = CfnDashboardReferenceLineDynamicDataConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardReferenceLineLabelConfigurationProperty(block: CfnDashboardReferenceLineLabelConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.ReferenceLineLabelConfigurationProperty {
    val builder = CfnDashboardReferenceLineLabelConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardReferenceLineProperty(block: CfnDashboardReferenceLinePropertyDsl.() -> Unit =
      {}): CfnDashboard.ReferenceLineProperty {
    val builder = CfnDashboardReferenceLinePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardReferenceLineStaticDataConfigurationProperty(block: CfnDashboardReferenceLineStaticDataConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.ReferenceLineStaticDataConfigurationProperty {
    val builder = CfnDashboardReferenceLineStaticDataConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardReferenceLineStyleConfigurationProperty(block: CfnDashboardReferenceLineStyleConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.ReferenceLineStyleConfigurationProperty {
    val builder = CfnDashboardReferenceLineStyleConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardReferenceLineValueLabelConfigurationProperty(block: CfnDashboardReferenceLineValueLabelConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.ReferenceLineValueLabelConfigurationProperty {
    val builder = CfnDashboardReferenceLineValueLabelConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardRelativeDateTimeControlDisplayOptionsProperty(block: CfnDashboardRelativeDateTimeControlDisplayOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.RelativeDateTimeControlDisplayOptionsProperty {
    val builder = CfnDashboardRelativeDateTimeControlDisplayOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardRelativeDatesFilterProperty(block: CfnDashboardRelativeDatesFilterPropertyDsl.() -> Unit
      = {}): CfnDashboard.RelativeDatesFilterProperty {
    val builder = CfnDashboardRelativeDatesFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardResourcePermissionProperty(block: CfnDashboardResourcePermissionPropertyDsl.() -> Unit
      = {}): CfnDashboard.ResourcePermissionProperty {
    val builder = CfnDashboardResourcePermissionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardRollingDateConfigurationProperty(block: CfnDashboardRollingDateConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.RollingDateConfigurationProperty {
    val builder = CfnDashboardRollingDateConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardRowAlternateColorOptionsProperty(block: CfnDashboardRowAlternateColorOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.RowAlternateColorOptionsProperty {
    val builder = CfnDashboardRowAlternateColorOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardSameSheetTargetVisualConfigurationProperty(block: CfnDashboardSameSheetTargetVisualConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.SameSheetTargetVisualConfigurationProperty {
    val builder = CfnDashboardSameSheetTargetVisualConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardSankeyDiagramAggregatedFieldWellsProperty(block: CfnDashboardSankeyDiagramAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnDashboard.SankeyDiagramAggregatedFieldWellsProperty {
    val builder = CfnDashboardSankeyDiagramAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardSankeyDiagramChartConfigurationProperty(block: CfnDashboardSankeyDiagramChartConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.SankeyDiagramChartConfigurationProperty {
    val builder = CfnDashboardSankeyDiagramChartConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardSankeyDiagramFieldWellsProperty(block: CfnDashboardSankeyDiagramFieldWellsPropertyDsl.() -> Unit
      = {}): CfnDashboard.SankeyDiagramFieldWellsProperty {
    val builder = CfnDashboardSankeyDiagramFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardSankeyDiagramSortConfigurationProperty(block: CfnDashboardSankeyDiagramSortConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.SankeyDiagramSortConfigurationProperty {
    val builder = CfnDashboardSankeyDiagramSortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardSankeyDiagramVisualProperty(block: CfnDashboardSankeyDiagramVisualPropertyDsl.() -> Unit
      = {}): CfnDashboard.SankeyDiagramVisualProperty {
    val builder = CfnDashboardSankeyDiagramVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardScatterPlotCategoricallyAggregatedFieldWellsProperty(block: CfnDashboardScatterPlotCategoricallyAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnDashboard.ScatterPlotCategoricallyAggregatedFieldWellsProperty {
    val builder = CfnDashboardScatterPlotCategoricallyAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardScatterPlotConfigurationProperty(block: CfnDashboardScatterPlotConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.ScatterPlotConfigurationProperty {
    val builder = CfnDashboardScatterPlotConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardScatterPlotFieldWellsProperty(block: CfnDashboardScatterPlotFieldWellsPropertyDsl.() -> Unit
      = {}): CfnDashboard.ScatterPlotFieldWellsProperty {
    val builder = CfnDashboardScatterPlotFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardScatterPlotUnaggregatedFieldWellsProperty(block: CfnDashboardScatterPlotUnaggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnDashboard.ScatterPlotUnaggregatedFieldWellsProperty {
    val builder = CfnDashboardScatterPlotUnaggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardScatterPlotVisualProperty(block: CfnDashboardScatterPlotVisualPropertyDsl.() -> Unit
      = {}): CfnDashboard.ScatterPlotVisualProperty {
    val builder = CfnDashboardScatterPlotVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardScrollBarOptionsProperty(block: CfnDashboardScrollBarOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.ScrollBarOptionsProperty {
    val builder = CfnDashboardScrollBarOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardSecondaryValueOptionsProperty(block: CfnDashboardSecondaryValueOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.SecondaryValueOptionsProperty {
    val builder = CfnDashboardSecondaryValueOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardSectionAfterPageBreakProperty(block: CfnDashboardSectionAfterPageBreakPropertyDsl.() -> Unit
      = {}): CfnDashboard.SectionAfterPageBreakProperty {
    val builder = CfnDashboardSectionAfterPageBreakPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardSectionBasedLayoutCanvasSizeOptionsProperty(block: CfnDashboardSectionBasedLayoutCanvasSizeOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.SectionBasedLayoutCanvasSizeOptionsProperty {
    val builder = CfnDashboardSectionBasedLayoutCanvasSizeOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardSectionBasedLayoutConfigurationProperty(block: CfnDashboardSectionBasedLayoutConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.SectionBasedLayoutConfigurationProperty {
    val builder = CfnDashboardSectionBasedLayoutConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardSectionBasedLayoutPaperCanvasSizeOptionsProperty(block: CfnDashboardSectionBasedLayoutPaperCanvasSizeOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.SectionBasedLayoutPaperCanvasSizeOptionsProperty {
    val builder = CfnDashboardSectionBasedLayoutPaperCanvasSizeOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardSectionLayoutConfigurationProperty(block: CfnDashboardSectionLayoutConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.SectionLayoutConfigurationProperty {
    val builder = CfnDashboardSectionLayoutConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardSectionPageBreakConfigurationProperty(block: CfnDashboardSectionPageBreakConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.SectionPageBreakConfigurationProperty {
    val builder = CfnDashboardSectionPageBreakConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardSectionStyleProperty(block: CfnDashboardSectionStylePropertyDsl.() -> Unit =
      {}): CfnDashboard.SectionStyleProperty {
    val builder = CfnDashboardSectionStylePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardSelectedSheetsFilterScopeConfigurationProperty(block: CfnDashboardSelectedSheetsFilterScopeConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.SelectedSheetsFilterScopeConfigurationProperty {
    val builder = CfnDashboardSelectedSheetsFilterScopeConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardSeriesItemProperty(block: CfnDashboardSeriesItemPropertyDsl.() -> Unit = {}):
      CfnDashboard.SeriesItemProperty {
    val builder = CfnDashboardSeriesItemPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardSetParameterValueConfigurationProperty(block: CfnDashboardSetParameterValueConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.SetParameterValueConfigurationProperty {
    val builder = CfnDashboardSetParameterValueConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardShapeConditionalFormatProperty(block: CfnDashboardShapeConditionalFormatPropertyDsl.() -> Unit
      = {}): CfnDashboard.ShapeConditionalFormatProperty {
    val builder = CfnDashboardShapeConditionalFormatPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardSheetControlLayoutConfigurationProperty(block: CfnDashboardSheetControlLayoutConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.SheetControlLayoutConfigurationProperty {
    val builder = CfnDashboardSheetControlLayoutConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardSheetControlLayoutProperty(block: CfnDashboardSheetControlLayoutPropertyDsl.() -> Unit
      = {}): CfnDashboard.SheetControlLayoutProperty {
    val builder = CfnDashboardSheetControlLayoutPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardSheetControlsOptionProperty(block: CfnDashboardSheetControlsOptionPropertyDsl.() -> Unit
      = {}): CfnDashboard.SheetControlsOptionProperty {
    val builder = CfnDashboardSheetControlsOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardSheetDefinitionProperty(block: CfnDashboardSheetDefinitionPropertyDsl.() -> Unit
      = {}): CfnDashboard.SheetDefinitionProperty {
    val builder = CfnDashboardSheetDefinitionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardSheetElementConfigurationOverridesProperty(block: CfnDashboardSheetElementConfigurationOverridesPropertyDsl.() -> Unit
      = {}): CfnDashboard.SheetElementConfigurationOverridesProperty {
    val builder = CfnDashboardSheetElementConfigurationOverridesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardSheetElementRenderingRuleProperty(block: CfnDashboardSheetElementRenderingRulePropertyDsl.() -> Unit
      = {}): CfnDashboard.SheetElementRenderingRuleProperty {
    val builder = CfnDashboardSheetElementRenderingRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardSheetLayoutElementMaximizationOptionProperty(block: CfnDashboardSheetLayoutElementMaximizationOptionPropertyDsl.() -> Unit
      = {}): CfnDashboard.SheetLayoutElementMaximizationOptionProperty {
    val builder = CfnDashboardSheetLayoutElementMaximizationOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDashboardSheetProperty(block: CfnDashboardSheetPropertyDsl.() -> Unit = {}):
      CfnDashboard.SheetProperty {
    val builder = CfnDashboardSheetPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardSheetTextBoxProperty(block: CfnDashboardSheetTextBoxPropertyDsl.() -> Unit =
      {}): CfnDashboard.SheetTextBoxProperty {
    val builder = CfnDashboardSheetTextBoxPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardSheetVisualScopingConfigurationProperty(block: CfnDashboardSheetVisualScopingConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.SheetVisualScopingConfigurationProperty {
    val builder = CfnDashboardSheetVisualScopingConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardShortFormatTextProperty(block: CfnDashboardShortFormatTextPropertyDsl.() -> Unit
      = {}): CfnDashboard.ShortFormatTextProperty {
    val builder = CfnDashboardShortFormatTextPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardSimpleClusterMarkerProperty(block: CfnDashboardSimpleClusterMarkerPropertyDsl.() -> Unit
      = {}): CfnDashboard.SimpleClusterMarkerProperty {
    val builder = CfnDashboardSimpleClusterMarkerPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardSliderControlDisplayOptionsProperty(block: CfnDashboardSliderControlDisplayOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.SliderControlDisplayOptionsProperty {
    val builder = CfnDashboardSliderControlDisplayOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardSmallMultiplesOptionsProperty(block: CfnDashboardSmallMultiplesOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.SmallMultiplesOptionsProperty {
    val builder = CfnDashboardSmallMultiplesOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDashboardSpacingProperty(block: CfnDashboardSpacingPropertyDsl.() -> Unit =
      {}): CfnDashboard.SpacingProperty {
    val builder = CfnDashboardSpacingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardStringDefaultValuesProperty(block: CfnDashboardStringDefaultValuesPropertyDsl.() -> Unit
      = {}): CfnDashboard.StringDefaultValuesProperty {
    val builder = CfnDashboardStringDefaultValuesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardStringFormatConfigurationProperty(block: CfnDashboardStringFormatConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.StringFormatConfigurationProperty {
    val builder = CfnDashboardStringFormatConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardStringParameterDeclarationProperty(block: CfnDashboardStringParameterDeclarationPropertyDsl.() -> Unit
      = {}): CfnDashboard.StringParameterDeclarationProperty {
    val builder = CfnDashboardStringParameterDeclarationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardStringParameterProperty(block: CfnDashboardStringParameterPropertyDsl.() -> Unit
      = {}): CfnDashboard.StringParameterProperty {
    val builder = CfnDashboardStringParameterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardStringValueWhenUnsetConfigurationProperty(block: CfnDashboardStringValueWhenUnsetConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.StringValueWhenUnsetConfigurationProperty {
    val builder = CfnDashboardStringValueWhenUnsetConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardSubtotalOptionsProperty(block: CfnDashboardSubtotalOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.SubtotalOptionsProperty {
    val builder = CfnDashboardSubtotalOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardTableAggregatedFieldWellsProperty(block: CfnDashboardTableAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnDashboard.TableAggregatedFieldWellsProperty {
    val builder = CfnDashboardTableAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardTableBorderOptionsProperty(block: CfnDashboardTableBorderOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.TableBorderOptionsProperty {
    val builder = CfnDashboardTableBorderOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardTableCellConditionalFormattingProperty(block: CfnDashboardTableCellConditionalFormattingPropertyDsl.() -> Unit
      = {}): CfnDashboard.TableCellConditionalFormattingProperty {
    val builder = CfnDashboardTableCellConditionalFormattingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardTableCellImageSizingConfigurationProperty(block: CfnDashboardTableCellImageSizingConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.TableCellImageSizingConfigurationProperty {
    val builder = CfnDashboardTableCellImageSizingConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardTableCellStyleProperty(block: CfnDashboardTableCellStylePropertyDsl.() -> Unit
      = {}): CfnDashboard.TableCellStyleProperty {
    val builder = CfnDashboardTableCellStylePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardTableConditionalFormattingOptionProperty(block: CfnDashboardTableConditionalFormattingOptionPropertyDsl.() -> Unit
      = {}): CfnDashboard.TableConditionalFormattingOptionProperty {
    val builder = CfnDashboardTableConditionalFormattingOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardTableConditionalFormattingProperty(block: CfnDashboardTableConditionalFormattingPropertyDsl.() -> Unit
      = {}): CfnDashboard.TableConditionalFormattingProperty {
    val builder = CfnDashboardTableConditionalFormattingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardTableConfigurationProperty(block: CfnDashboardTableConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.TableConfigurationProperty {
    val builder = CfnDashboardTableConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardTableFieldCustomIconContentProperty(block: CfnDashboardTableFieldCustomIconContentPropertyDsl.() -> Unit
      = {}): CfnDashboard.TableFieldCustomIconContentProperty {
    val builder = CfnDashboardTableFieldCustomIconContentPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardTableFieldCustomTextContentProperty(block: CfnDashboardTableFieldCustomTextContentPropertyDsl.() -> Unit
      = {}): CfnDashboard.TableFieldCustomTextContentProperty {
    val builder = CfnDashboardTableFieldCustomTextContentPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardTableFieldImageConfigurationProperty(block: CfnDashboardTableFieldImageConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.TableFieldImageConfigurationProperty {
    val builder = CfnDashboardTableFieldImageConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardTableFieldLinkConfigurationProperty(block: CfnDashboardTableFieldLinkConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.TableFieldLinkConfigurationProperty {
    val builder = CfnDashboardTableFieldLinkConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardTableFieldLinkContentConfigurationProperty(block: CfnDashboardTableFieldLinkContentConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.TableFieldLinkContentConfigurationProperty {
    val builder = CfnDashboardTableFieldLinkContentConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardTableFieldOptionProperty(block: CfnDashboardTableFieldOptionPropertyDsl.() -> Unit
      = {}): CfnDashboard.TableFieldOptionProperty {
    val builder = CfnDashboardTableFieldOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardTableFieldOptionsProperty(block: CfnDashboardTableFieldOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.TableFieldOptionsProperty {
    val builder = CfnDashboardTableFieldOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardTableFieldURLConfigurationProperty(block: CfnDashboardTableFieldURLConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.TableFieldURLConfigurationProperty {
    val builder = CfnDashboardTableFieldURLConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardTableFieldWellsProperty(block: CfnDashboardTableFieldWellsPropertyDsl.() -> Unit
      = {}): CfnDashboard.TableFieldWellsProperty {
    val builder = CfnDashboardTableFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardTableInlineVisualizationProperty(block: CfnDashboardTableInlineVisualizationPropertyDsl.() -> Unit
      = {}): CfnDashboard.TableInlineVisualizationProperty {
    val builder = CfnDashboardTableInlineVisualizationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardTableOptionsProperty(block: CfnDashboardTableOptionsPropertyDsl.() -> Unit =
      {}): CfnDashboard.TableOptionsProperty {
    val builder = CfnDashboardTableOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardTablePaginatedReportOptionsProperty(block: CfnDashboardTablePaginatedReportOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.TablePaginatedReportOptionsProperty {
    val builder = CfnDashboardTablePaginatedReportOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardTableRowConditionalFormattingProperty(block: CfnDashboardTableRowConditionalFormattingPropertyDsl.() -> Unit
      = {}): CfnDashboard.TableRowConditionalFormattingProperty {
    val builder = CfnDashboardTableRowConditionalFormattingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardTableSideBorderOptionsProperty(block: CfnDashboardTableSideBorderOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.TableSideBorderOptionsProperty {
    val builder = CfnDashboardTableSideBorderOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardTableSortConfigurationProperty(block: CfnDashboardTableSortConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.TableSortConfigurationProperty {
    val builder = CfnDashboardTableSortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardTableUnaggregatedFieldWellsProperty(block: CfnDashboardTableUnaggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnDashboard.TableUnaggregatedFieldWellsProperty {
    val builder = CfnDashboardTableUnaggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardTableVisualProperty(block: CfnDashboardTableVisualPropertyDsl.() -> Unit =
      {}): CfnDashboard.TableVisualProperty {
    val builder = CfnDashboardTableVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardTextAreaControlDisplayOptionsProperty(block: CfnDashboardTextAreaControlDisplayOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.TextAreaControlDisplayOptionsProperty {
    val builder = CfnDashboardTextAreaControlDisplayOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardTextConditionalFormatProperty(block: CfnDashboardTextConditionalFormatPropertyDsl.() -> Unit
      = {}): CfnDashboard.TextConditionalFormatProperty {
    val builder = CfnDashboardTextConditionalFormatPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardTextControlPlaceholderOptionsProperty(block: CfnDashboardTextControlPlaceholderOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.TextControlPlaceholderOptionsProperty {
    val builder = CfnDashboardTextControlPlaceholderOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardTextFieldControlDisplayOptionsProperty(block: CfnDashboardTextFieldControlDisplayOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.TextFieldControlDisplayOptionsProperty {
    val builder = CfnDashboardTextFieldControlDisplayOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardThousandSeparatorOptionsProperty(block: CfnDashboardThousandSeparatorOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.ThousandSeparatorOptionsProperty {
    val builder = CfnDashboardThousandSeparatorOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardTimeBasedForecastPropertiesProperty(block: CfnDashboardTimeBasedForecastPropertiesPropertyDsl.() -> Unit
      = {}): CfnDashboard.TimeBasedForecastPropertiesProperty {
    val builder = CfnDashboardTimeBasedForecastPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardTimeEqualityFilterProperty(block: CfnDashboardTimeEqualityFilterPropertyDsl.() -> Unit
      = {}): CfnDashboard.TimeEqualityFilterProperty {
    val builder = CfnDashboardTimeEqualityFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardTimeRangeDrillDownFilterProperty(block: CfnDashboardTimeRangeDrillDownFilterPropertyDsl.() -> Unit
      = {}): CfnDashboard.TimeRangeDrillDownFilterProperty {
    val builder = CfnDashboardTimeRangeDrillDownFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardTimeRangeFilterProperty(block: CfnDashboardTimeRangeFilterPropertyDsl.() -> Unit
      = {}): CfnDashboard.TimeRangeFilterProperty {
    val builder = CfnDashboardTimeRangeFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardTimeRangeFilterValueProperty(block: CfnDashboardTimeRangeFilterValuePropertyDsl.() -> Unit
      = {}): CfnDashboard.TimeRangeFilterValueProperty {
    val builder = CfnDashboardTimeRangeFilterValuePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardTooltipItemProperty(block: CfnDashboardTooltipItemPropertyDsl.() -> Unit =
      {}): CfnDashboard.TooltipItemProperty {
    val builder = CfnDashboardTooltipItemPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardTooltipOptionsProperty(block: CfnDashboardTooltipOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.TooltipOptionsProperty {
    val builder = CfnDashboardTooltipOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardTopBottomFilterProperty(block: CfnDashboardTopBottomFilterPropertyDsl.() -> Unit
      = {}): CfnDashboard.TopBottomFilterProperty {
    val builder = CfnDashboardTopBottomFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardTopBottomMoversComputationProperty(block: CfnDashboardTopBottomMoversComputationPropertyDsl.() -> Unit
      = {}): CfnDashboard.TopBottomMoversComputationProperty {
    val builder = CfnDashboardTopBottomMoversComputationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardTopBottomRankedComputationProperty(block: CfnDashboardTopBottomRankedComputationPropertyDsl.() -> Unit
      = {}): CfnDashboard.TopBottomRankedComputationProperty {
    val builder = CfnDashboardTopBottomRankedComputationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardTotalAggregationComputationProperty(block: CfnDashboardTotalAggregationComputationPropertyDsl.() -> Unit
      = {}): CfnDashboard.TotalAggregationComputationProperty {
    val builder = CfnDashboardTotalAggregationComputationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardTotalOptionsProperty(block: CfnDashboardTotalOptionsPropertyDsl.() -> Unit =
      {}): CfnDashboard.TotalOptionsProperty {
    val builder = CfnDashboardTotalOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardTreeMapAggregatedFieldWellsProperty(block: CfnDashboardTreeMapAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnDashboard.TreeMapAggregatedFieldWellsProperty {
    val builder = CfnDashboardTreeMapAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardTreeMapConfigurationProperty(block: CfnDashboardTreeMapConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.TreeMapConfigurationProperty {
    val builder = CfnDashboardTreeMapConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardTreeMapFieldWellsProperty(block: CfnDashboardTreeMapFieldWellsPropertyDsl.() -> Unit
      = {}): CfnDashboard.TreeMapFieldWellsProperty {
    val builder = CfnDashboardTreeMapFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardTreeMapSortConfigurationProperty(block: CfnDashboardTreeMapSortConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.TreeMapSortConfigurationProperty {
    val builder = CfnDashboardTreeMapSortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardTreeMapVisualProperty(block: CfnDashboardTreeMapVisualPropertyDsl.() -> Unit =
      {}): CfnDashboard.TreeMapVisualProperty {
    val builder = CfnDashboardTreeMapVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardTrendArrowOptionsProperty(block: CfnDashboardTrendArrowOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.TrendArrowOptionsProperty {
    val builder = CfnDashboardTrendArrowOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardUnaggregatedFieldProperty(block: CfnDashboardUnaggregatedFieldPropertyDsl.() -> Unit
      = {}): CfnDashboard.UnaggregatedFieldProperty {
    val builder = CfnDashboardUnaggregatedFieldPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardUniqueValuesComputationProperty(block: CfnDashboardUniqueValuesComputationPropertyDsl.() -> Unit
      = {}): CfnDashboard.UniqueValuesComputationProperty {
    val builder = CfnDashboardUniqueValuesComputationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardVisibleRangeOptionsProperty(block: CfnDashboardVisibleRangeOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.VisibleRangeOptionsProperty {
    val builder = CfnDashboardVisibleRangeOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardVisualAxisSortOptionProperty(block: CfnDashboardVisualAxisSortOptionPropertyDsl.() -> Unit
      = {}): CfnDashboard.VisualAxisSortOptionProperty {
    val builder = CfnDashboardVisualAxisSortOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardVisualCustomActionOperationProperty(block: CfnDashboardVisualCustomActionOperationPropertyDsl.() -> Unit
      = {}): CfnDashboard.VisualCustomActionOperationProperty {
    val builder = CfnDashboardVisualCustomActionOperationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardVisualCustomActionProperty(block: CfnDashboardVisualCustomActionPropertyDsl.() -> Unit
      = {}): CfnDashboard.VisualCustomActionProperty {
    val builder = CfnDashboardVisualCustomActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardVisualMenuOptionProperty(block: CfnDashboardVisualMenuOptionPropertyDsl.() -> Unit
      = {}): CfnDashboard.VisualMenuOptionProperty {
    val builder = CfnDashboardVisualMenuOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardVisualPaletteProperty(block: CfnDashboardVisualPalettePropertyDsl.() -> Unit =
      {}): CfnDashboard.VisualPaletteProperty {
    val builder = CfnDashboardVisualPalettePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDashboardVisualProperty(block: CfnDashboardVisualPropertyDsl.() -> Unit =
      {}): CfnDashboard.VisualProperty {
    val builder = CfnDashboardVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardVisualSubtitleLabelOptionsProperty(block: CfnDashboardVisualSubtitleLabelOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.VisualSubtitleLabelOptionsProperty {
    val builder = CfnDashboardVisualSubtitleLabelOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardVisualTitleLabelOptionsProperty(block: CfnDashboardVisualTitleLabelOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.VisualTitleLabelOptionsProperty {
    val builder = CfnDashboardVisualTitleLabelOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardWaterfallChartAggregatedFieldWellsProperty(block: CfnDashboardWaterfallChartAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnDashboard.WaterfallChartAggregatedFieldWellsProperty {
    val builder = CfnDashboardWaterfallChartAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardWaterfallChartConfigurationProperty(block: CfnDashboardWaterfallChartConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.WaterfallChartConfigurationProperty {
    val builder = CfnDashboardWaterfallChartConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardWaterfallChartFieldWellsProperty(block: CfnDashboardWaterfallChartFieldWellsPropertyDsl.() -> Unit
      = {}): CfnDashboard.WaterfallChartFieldWellsProperty {
    val builder = CfnDashboardWaterfallChartFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardWaterfallChartOptionsProperty(block: CfnDashboardWaterfallChartOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.WaterfallChartOptionsProperty {
    val builder = CfnDashboardWaterfallChartOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardWaterfallChartSortConfigurationProperty(block: CfnDashboardWaterfallChartSortConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.WaterfallChartSortConfigurationProperty {
    val builder = CfnDashboardWaterfallChartSortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardWaterfallVisualProperty(block: CfnDashboardWaterfallVisualPropertyDsl.() -> Unit
      = {}): CfnDashboard.WaterfallVisualProperty {
    val builder = CfnDashboardWaterfallVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardWhatIfPointScenarioProperty(block: CfnDashboardWhatIfPointScenarioPropertyDsl.() -> Unit
      = {}): CfnDashboard.WhatIfPointScenarioProperty {
    val builder = CfnDashboardWhatIfPointScenarioPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardWhatIfRangeScenarioProperty(block: CfnDashboardWhatIfRangeScenarioPropertyDsl.() -> Unit
      = {}): CfnDashboard.WhatIfRangeScenarioProperty {
    val builder = CfnDashboardWhatIfRangeScenarioPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardWordCloudAggregatedFieldWellsProperty(block: CfnDashboardWordCloudAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnDashboard.WordCloudAggregatedFieldWellsProperty {
    val builder = CfnDashboardWordCloudAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardWordCloudChartConfigurationProperty(block: CfnDashboardWordCloudChartConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.WordCloudChartConfigurationProperty {
    val builder = CfnDashboardWordCloudChartConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardWordCloudFieldWellsProperty(block: CfnDashboardWordCloudFieldWellsPropertyDsl.() -> Unit
      = {}): CfnDashboard.WordCloudFieldWellsProperty {
    val builder = CfnDashboardWordCloudFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardWordCloudOptionsProperty(block: CfnDashboardWordCloudOptionsPropertyDsl.() -> Unit
      = {}): CfnDashboard.WordCloudOptionsProperty {
    val builder = CfnDashboardWordCloudOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardWordCloudSortConfigurationProperty(block: CfnDashboardWordCloudSortConfigurationPropertyDsl.() -> Unit
      = {}): CfnDashboard.WordCloudSortConfigurationProperty {
    val builder = CfnDashboardWordCloudSortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDashboardWordCloudVisualProperty(block: CfnDashboardWordCloudVisualPropertyDsl.() -> Unit
      = {}): CfnDashboard.WordCloudVisualProperty {
    val builder = CfnDashboardWordCloudVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDataSet(
    scope: Construct,
    id: String,
    block: CfnDataSetDsl.() -> Unit = {},
  ): CfnDataSet {
    val builder = CfnDataSetDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSetCalculatedColumnProperty(block: CfnDataSetCalculatedColumnPropertyDsl.() -> Unit
      = {}): CfnDataSet.CalculatedColumnProperty {
    val builder = CfnDataSetCalculatedColumnPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSetCastColumnTypeOperationProperty(block: CfnDataSetCastColumnTypeOperationPropertyDsl.() -> Unit
      = {}): CfnDataSet.CastColumnTypeOperationProperty {
    val builder = CfnDataSetCastColumnTypeOperationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSetColumnDescriptionProperty(block: CfnDataSetColumnDescriptionPropertyDsl.() -> Unit
      = {}): CfnDataSet.ColumnDescriptionProperty {
    val builder = CfnDataSetColumnDescriptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDataSetColumnGroupProperty(block: CfnDataSetColumnGroupPropertyDsl.() -> Unit
      = {}): CfnDataSet.ColumnGroupProperty {
    val builder = CfnDataSetColumnGroupPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSetColumnLevelPermissionRuleProperty(block: CfnDataSetColumnLevelPermissionRulePropertyDsl.() -> Unit
      = {}): CfnDataSet.ColumnLevelPermissionRuleProperty {
    val builder = CfnDataSetColumnLevelPermissionRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDataSetColumnTagProperty(block: CfnDataSetColumnTagPropertyDsl.() -> Unit =
      {}): CfnDataSet.ColumnTagProperty {
    val builder = CfnDataSetColumnTagPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSetCreateColumnsOperationProperty(block: CfnDataSetCreateColumnsOperationPropertyDsl.() -> Unit
      = {}): CfnDataSet.CreateColumnsOperationProperty {
    val builder = CfnDataSetCreateColumnsOperationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDataSetCustomSqlProperty(block: CfnDataSetCustomSqlPropertyDsl.() -> Unit =
      {}): CfnDataSet.CustomSqlProperty {
    val builder = CfnDataSetCustomSqlPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSetDataSetRefreshPropertiesProperty(block: CfnDataSetDataSetRefreshPropertiesPropertyDsl.() -> Unit
      = {}): CfnDataSet.DataSetRefreshPropertiesProperty {
    val builder = CfnDataSetDataSetRefreshPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSetDataSetUsageConfigurationProperty(block: CfnDataSetDataSetUsageConfigurationPropertyDsl.() -> Unit
      = {}): CfnDataSet.DataSetUsageConfigurationProperty {
    val builder = CfnDataSetDataSetUsageConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSetDatasetParameterProperty(block: CfnDataSetDatasetParameterPropertyDsl.() -> Unit
      = {}): CfnDataSet.DatasetParameterProperty {
    val builder = CfnDataSetDatasetParameterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSetDateTimeDatasetParameterDefaultValuesProperty(block: CfnDataSetDateTimeDatasetParameterDefaultValuesPropertyDsl.() -> Unit
      = {}): CfnDataSet.DateTimeDatasetParameterDefaultValuesProperty {
    val builder = CfnDataSetDateTimeDatasetParameterDefaultValuesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSetDateTimeDatasetParameterProperty(block: CfnDataSetDateTimeDatasetParameterPropertyDsl.() -> Unit
      = {}): CfnDataSet.DateTimeDatasetParameterProperty {
    val builder = CfnDataSetDateTimeDatasetParameterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSetDecimalDatasetParameterDefaultValuesProperty(block: CfnDataSetDecimalDatasetParameterDefaultValuesPropertyDsl.() -> Unit
      = {}): CfnDataSet.DecimalDatasetParameterDefaultValuesProperty {
    val builder = CfnDataSetDecimalDatasetParameterDefaultValuesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSetDecimalDatasetParameterProperty(block: CfnDataSetDecimalDatasetParameterPropertyDsl.() -> Unit
      = {}): CfnDataSet.DecimalDatasetParameterProperty {
    val builder = CfnDataSetDecimalDatasetParameterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDataSetFieldFolderProperty(block: CfnDataSetFieldFolderPropertyDsl.() -> Unit
      = {}): CfnDataSet.FieldFolderProperty {
    val builder = CfnDataSetFieldFolderPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSetFilterOperationProperty(block: CfnDataSetFilterOperationPropertyDsl.() -> Unit =
      {}): CfnDataSet.FilterOperationProperty {
    val builder = CfnDataSetFilterOperationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSetGeoSpatialColumnGroupProperty(block: CfnDataSetGeoSpatialColumnGroupPropertyDsl.() -> Unit
      = {}): CfnDataSet.GeoSpatialColumnGroupProperty {
    val builder = CfnDataSetGeoSpatialColumnGroupPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSetIncrementalRefreshProperty(block: CfnDataSetIncrementalRefreshPropertyDsl.() -> Unit
      = {}): CfnDataSet.IncrementalRefreshProperty {
    val builder = CfnDataSetIncrementalRefreshPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSetIngestionWaitPolicyProperty(block: CfnDataSetIngestionWaitPolicyPropertyDsl.() -> Unit
      = {}): CfnDataSet.IngestionWaitPolicyProperty {
    val builder = CfnDataSetIngestionWaitPolicyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDataSetInputColumnProperty(block: CfnDataSetInputColumnPropertyDsl.() -> Unit
      = {}): CfnDataSet.InputColumnProperty {
    val builder = CfnDataSetInputColumnPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSetIntegerDatasetParameterDefaultValuesProperty(block: CfnDataSetIntegerDatasetParameterDefaultValuesPropertyDsl.() -> Unit
      = {}): CfnDataSet.IntegerDatasetParameterDefaultValuesProperty {
    val builder = CfnDataSetIntegerDatasetParameterDefaultValuesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSetIntegerDatasetParameterProperty(block: CfnDataSetIntegerDatasetParameterPropertyDsl.() -> Unit
      = {}): CfnDataSet.IntegerDatasetParameterProperty {
    val builder = CfnDataSetIntegerDatasetParameterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSetJoinInstructionProperty(block: CfnDataSetJoinInstructionPropertyDsl.() -> Unit =
      {}): CfnDataSet.JoinInstructionProperty {
    val builder = CfnDataSetJoinInstructionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSetJoinKeyPropertiesProperty(block: CfnDataSetJoinKeyPropertiesPropertyDsl.() -> Unit
      = {}): CfnDataSet.JoinKeyPropertiesProperty {
    val builder = CfnDataSetJoinKeyPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSetLogicalTableProperty(block: CfnDataSetLogicalTablePropertyDsl.() -> Unit = {}):
      CfnDataSet.LogicalTableProperty {
    val builder = CfnDataSetLogicalTablePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSetLogicalTableSourceProperty(block: CfnDataSetLogicalTableSourcePropertyDsl.() -> Unit
      = {}): CfnDataSet.LogicalTableSourceProperty {
    val builder = CfnDataSetLogicalTableSourcePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSetLookbackWindowProperty(block: CfnDataSetLookbackWindowPropertyDsl.() -> Unit =
      {}): CfnDataSet.LookbackWindowProperty {
    val builder = CfnDataSetLookbackWindowPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSetNewDefaultValuesProperty(block: CfnDataSetNewDefaultValuesPropertyDsl.() -> Unit
      = {}): CfnDataSet.NewDefaultValuesProperty {
    val builder = CfnDataSetNewDefaultValuesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSetOutputColumnProperty(block: CfnDataSetOutputColumnPropertyDsl.() -> Unit = {}):
      CfnDataSet.OutputColumnProperty {
    val builder = CfnDataSetOutputColumnPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSetOverrideDatasetParameterOperationProperty(block: CfnDataSetOverrideDatasetParameterOperationPropertyDsl.() -> Unit
      = {}): CfnDataSet.OverrideDatasetParameterOperationProperty {
    val builder = CfnDataSetOverrideDatasetParameterOperationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSetPhysicalTableProperty(block: CfnDataSetPhysicalTablePropertyDsl.() -> Unit =
      {}): CfnDataSet.PhysicalTableProperty {
    val builder = CfnDataSetPhysicalTablePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSetProjectOperationProperty(block: CfnDataSetProjectOperationPropertyDsl.() -> Unit
      = {}): CfnDataSet.ProjectOperationProperty {
    val builder = CfnDataSetProjectOperationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDataSetProps(block: CfnDataSetPropsDsl.() -> Unit = {}): CfnDataSetProps {
    val builder = CfnDataSetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSetRefreshConfigurationProperty(block: CfnDataSetRefreshConfigurationPropertyDsl.() -> Unit
      = {}): CfnDataSet.RefreshConfigurationProperty {
    val builder = CfnDataSetRefreshConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSetRelationalTableProperty(block: CfnDataSetRelationalTablePropertyDsl.() -> Unit =
      {}): CfnDataSet.RelationalTableProperty {
    val builder = CfnDataSetRelationalTablePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSetRenameColumnOperationProperty(block: CfnDataSetRenameColumnOperationPropertyDsl.() -> Unit
      = {}): CfnDataSet.RenameColumnOperationProperty {
    val builder = CfnDataSetRenameColumnOperationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSetResourcePermissionProperty(block: CfnDataSetResourcePermissionPropertyDsl.() -> Unit
      = {}): CfnDataSet.ResourcePermissionProperty {
    val builder = CfnDataSetResourcePermissionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSetRowLevelPermissionDataSetProperty(block: CfnDataSetRowLevelPermissionDataSetPropertyDsl.() -> Unit
      = {}): CfnDataSet.RowLevelPermissionDataSetProperty {
    val builder = CfnDataSetRowLevelPermissionDataSetPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSetRowLevelPermissionTagConfigurationProperty(block: CfnDataSetRowLevelPermissionTagConfigurationPropertyDsl.() -> Unit
      = {}): CfnDataSet.RowLevelPermissionTagConfigurationProperty {
    val builder = CfnDataSetRowLevelPermissionTagConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSetRowLevelPermissionTagRuleProperty(block: CfnDataSetRowLevelPermissionTagRulePropertyDsl.() -> Unit
      = {}): CfnDataSet.RowLevelPermissionTagRuleProperty {
    val builder = CfnDataSetRowLevelPermissionTagRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDataSetS3SourceProperty(block: CfnDataSetS3SourcePropertyDsl.() -> Unit =
      {}): CfnDataSet.S3SourceProperty {
    val builder = CfnDataSetS3SourcePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSetStringDatasetParameterDefaultValuesProperty(block: CfnDataSetStringDatasetParameterDefaultValuesPropertyDsl.() -> Unit
      = {}): CfnDataSet.StringDatasetParameterDefaultValuesProperty {
    val builder = CfnDataSetStringDatasetParameterDefaultValuesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSetStringDatasetParameterProperty(block: CfnDataSetStringDatasetParameterPropertyDsl.() -> Unit
      = {}): CfnDataSet.StringDatasetParameterProperty {
    val builder = CfnDataSetStringDatasetParameterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSetTagColumnOperationProperty(block: CfnDataSetTagColumnOperationPropertyDsl.() -> Unit
      = {}): CfnDataSet.TagColumnOperationProperty {
    val builder = CfnDataSetTagColumnOperationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSetTransformOperationProperty(block: CfnDataSetTransformOperationPropertyDsl.() -> Unit
      = {}): CfnDataSet.TransformOperationProperty {
    val builder = CfnDataSetTransformOperationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSetUploadSettingsProperty(block: CfnDataSetUploadSettingsPropertyDsl.() -> Unit =
      {}): CfnDataSet.UploadSettingsProperty {
    val builder = CfnDataSetUploadSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDataSource(
    scope: Construct,
    id: String,
    block: CfnDataSourceDsl.() -> Unit = {},
  ): CfnDataSource {
    val builder = CfnDataSourceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSourceAmazonElasticsearchParametersProperty(block: CfnDataSourceAmazonElasticsearchParametersPropertyDsl.() -> Unit
      = {}): CfnDataSource.AmazonElasticsearchParametersProperty {
    val builder = CfnDataSourceAmazonElasticsearchParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSourceAmazonOpenSearchParametersProperty(block: CfnDataSourceAmazonOpenSearchParametersPropertyDsl.() -> Unit
      = {}): CfnDataSource.AmazonOpenSearchParametersProperty {
    val builder = CfnDataSourceAmazonOpenSearchParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSourceAthenaParametersProperty(block: CfnDataSourceAthenaParametersPropertyDsl.() -> Unit
      = {}): CfnDataSource.AthenaParametersProperty {
    val builder = CfnDataSourceAthenaParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSourceAuroraParametersProperty(block: CfnDataSourceAuroraParametersPropertyDsl.() -> Unit
      = {}): CfnDataSource.AuroraParametersProperty {
    val builder = CfnDataSourceAuroraParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSourceAuroraPostgreSqlParametersProperty(block: CfnDataSourceAuroraPostgreSqlParametersPropertyDsl.() -> Unit
      = {}): CfnDataSource.AuroraPostgreSqlParametersProperty {
    val builder = CfnDataSourceAuroraPostgreSqlParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSourceCredentialPairProperty(block: CfnDataSourceCredentialPairPropertyDsl.() -> Unit
      = {}): CfnDataSource.CredentialPairProperty {
    val builder = CfnDataSourceCredentialPairPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSourceDataSourceCredentialsProperty(block: CfnDataSourceDataSourceCredentialsPropertyDsl.() -> Unit
      = {}): CfnDataSource.DataSourceCredentialsProperty {
    val builder = CfnDataSourceDataSourceCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSourceDataSourceErrorInfoProperty(block: CfnDataSourceDataSourceErrorInfoPropertyDsl.() -> Unit
      = {}): CfnDataSource.DataSourceErrorInfoProperty {
    val builder = CfnDataSourceDataSourceErrorInfoPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSourceDataSourceParametersProperty(block: CfnDataSourceDataSourceParametersPropertyDsl.() -> Unit
      = {}): CfnDataSource.DataSourceParametersProperty {
    val builder = CfnDataSourceDataSourceParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSourceDatabricksParametersProperty(block: CfnDataSourceDatabricksParametersPropertyDsl.() -> Unit
      = {}): CfnDataSource.DatabricksParametersProperty {
    val builder = CfnDataSourceDatabricksParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSourceManifestFileLocationProperty(block: CfnDataSourceManifestFileLocationPropertyDsl.() -> Unit
      = {}): CfnDataSource.ManifestFileLocationProperty {
    val builder = CfnDataSourceManifestFileLocationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSourceMariaDbParametersProperty(block: CfnDataSourceMariaDbParametersPropertyDsl.() -> Unit
      = {}): CfnDataSource.MariaDbParametersProperty {
    val builder = CfnDataSourceMariaDbParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSourceMySqlParametersProperty(block: CfnDataSourceMySqlParametersPropertyDsl.() -> Unit
      = {}): CfnDataSource.MySqlParametersProperty {
    val builder = CfnDataSourceMySqlParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSourceOracleParametersProperty(block: CfnDataSourceOracleParametersPropertyDsl.() -> Unit
      = {}): CfnDataSource.OracleParametersProperty {
    val builder = CfnDataSourceOracleParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSourcePostgreSqlParametersProperty(block: CfnDataSourcePostgreSqlParametersPropertyDsl.() -> Unit
      = {}): CfnDataSource.PostgreSqlParametersProperty {
    val builder = CfnDataSourcePostgreSqlParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSourcePrestoParametersProperty(block: CfnDataSourcePrestoParametersPropertyDsl.() -> Unit
      = {}): CfnDataSource.PrestoParametersProperty {
    val builder = CfnDataSourcePrestoParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDataSourceProps(block: CfnDataSourcePropsDsl.() -> Unit = {}):
      CfnDataSourceProps {
    val builder = CfnDataSourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSourceRdsParametersProperty(block: CfnDataSourceRdsParametersPropertyDsl.() -> Unit
      = {}): CfnDataSource.RdsParametersProperty {
    val builder = CfnDataSourceRdsParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSourceRedshiftParametersProperty(block: CfnDataSourceRedshiftParametersPropertyDsl.() -> Unit
      = {}): CfnDataSource.RedshiftParametersProperty {
    val builder = CfnDataSourceRedshiftParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSourceResourcePermissionProperty(block: CfnDataSourceResourcePermissionPropertyDsl.() -> Unit
      = {}): CfnDataSource.ResourcePermissionProperty {
    val builder = CfnDataSourceResourcePermissionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSourceS3ParametersProperty(block: CfnDataSourceS3ParametersPropertyDsl.() -> Unit =
      {}): CfnDataSource.S3ParametersProperty {
    val builder = CfnDataSourceS3ParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSourceSnowflakeParametersProperty(block: CfnDataSourceSnowflakeParametersPropertyDsl.() -> Unit
      = {}): CfnDataSource.SnowflakeParametersProperty {
    val builder = CfnDataSourceSnowflakeParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSourceSparkParametersProperty(block: CfnDataSourceSparkParametersPropertyDsl.() -> Unit
      = {}): CfnDataSource.SparkParametersProperty {
    val builder = CfnDataSourceSparkParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSourceSqlServerParametersProperty(block: CfnDataSourceSqlServerParametersPropertyDsl.() -> Unit
      = {}): CfnDataSource.SqlServerParametersProperty {
    val builder = CfnDataSourceSqlServerParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSourceSslPropertiesProperty(block: CfnDataSourceSslPropertiesPropertyDsl.() -> Unit
      = {}): CfnDataSource.SslPropertiesProperty {
    val builder = CfnDataSourceSslPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSourceTeradataParametersProperty(block: CfnDataSourceTeradataParametersPropertyDsl.() -> Unit
      = {}): CfnDataSource.TeradataParametersProperty {
    val builder = CfnDataSourceTeradataParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSourceVpcConnectionPropertiesProperty(block: CfnDataSourceVpcConnectionPropertiesPropertyDsl.() -> Unit
      = {}): CfnDataSource.VpcConnectionPropertiesProperty {
    val builder = CfnDataSourceVpcConnectionPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRefreshSchedule(
    scope: Construct,
    id: String,
    block: CfnRefreshScheduleDsl.() -> Unit = {},
  ): CfnRefreshSchedule {
    val builder = CfnRefreshScheduleDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRefreshScheduleProps(block: CfnRefreshSchedulePropsDsl.() -> Unit = {}):
      CfnRefreshScheduleProps {
    val builder = CfnRefreshSchedulePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRefreshScheduleRefreshOnDayProperty(block: CfnRefreshScheduleRefreshOnDayPropertyDsl.() -> Unit
      = {}): CfnRefreshSchedule.RefreshOnDayProperty {
    val builder = CfnRefreshScheduleRefreshOnDayPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRefreshScheduleRefreshScheduleMapProperty(block: CfnRefreshScheduleRefreshScheduleMapPropertyDsl.() -> Unit
      = {}): CfnRefreshSchedule.RefreshScheduleMapProperty {
    val builder = CfnRefreshScheduleRefreshScheduleMapPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRefreshScheduleScheduleFrequencyProperty(block: CfnRefreshScheduleScheduleFrequencyPropertyDsl.() -> Unit
      = {}): CfnRefreshSchedule.ScheduleFrequencyProperty {
    val builder = CfnRefreshScheduleScheduleFrequencyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTemplate(
    scope: Construct,
    id: String,
    block: CfnTemplateDsl.() -> Unit = {},
  ): CfnTemplate {
    val builder = CfnTemplateDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateAggregationFunctionProperty(block: CfnTemplateAggregationFunctionPropertyDsl.() -> Unit
      = {}): CfnTemplate.AggregationFunctionProperty {
    val builder = CfnTemplateAggregationFunctionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateAggregationSortConfigurationProperty(block: CfnTemplateAggregationSortConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.AggregationSortConfigurationProperty {
    val builder = CfnTemplateAggregationSortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateAnalysisDefaultsProperty(block: CfnTemplateAnalysisDefaultsPropertyDsl.() -> Unit
      = {}): CfnTemplate.AnalysisDefaultsProperty {
    val builder = CfnTemplateAnalysisDefaultsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateAnchorDateConfigurationProperty(block: CfnTemplateAnchorDateConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.AnchorDateConfigurationProperty {
    val builder = CfnTemplateAnchorDateConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateArcAxisConfigurationProperty(block: CfnTemplateArcAxisConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.ArcAxisConfigurationProperty {
    val builder = CfnTemplateArcAxisConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateArcAxisDisplayRangeProperty(block: CfnTemplateArcAxisDisplayRangePropertyDsl.() -> Unit
      = {}): CfnTemplate.ArcAxisDisplayRangeProperty {
    val builder = CfnTemplateArcAxisDisplayRangePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateArcConfigurationProperty(block: CfnTemplateArcConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.ArcConfigurationProperty {
    val builder = CfnTemplateArcConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTemplateArcOptionsProperty(block: CfnTemplateArcOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.ArcOptionsProperty {
    val builder = CfnTemplateArcOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateAxisDataOptionsProperty(block: CfnTemplateAxisDataOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.AxisDataOptionsProperty {
    val builder = CfnTemplateAxisDataOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateAxisDisplayMinMaxRangeProperty(block: CfnTemplateAxisDisplayMinMaxRangePropertyDsl.() -> Unit
      = {}): CfnTemplate.AxisDisplayMinMaxRangeProperty {
    val builder = CfnTemplateAxisDisplayMinMaxRangePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateAxisDisplayOptionsProperty(block: CfnTemplateAxisDisplayOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.AxisDisplayOptionsProperty {
    val builder = CfnTemplateAxisDisplayOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateAxisDisplayRangeProperty(block: CfnTemplateAxisDisplayRangePropertyDsl.() -> Unit
      = {}): CfnTemplate.AxisDisplayRangeProperty {
    val builder = CfnTemplateAxisDisplayRangePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateAxisLabelOptionsProperty(block: CfnTemplateAxisLabelOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.AxisLabelOptionsProperty {
    val builder = CfnTemplateAxisLabelOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateAxisLabelReferenceOptionsProperty(block: CfnTemplateAxisLabelReferenceOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.AxisLabelReferenceOptionsProperty {
    val builder = CfnTemplateAxisLabelReferenceOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateAxisLinearScaleProperty(block: CfnTemplateAxisLinearScalePropertyDsl.() -> Unit
      = {}): CfnTemplate.AxisLinearScaleProperty {
    val builder = CfnTemplateAxisLinearScalePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateAxisLogarithmicScaleProperty(block: CfnTemplateAxisLogarithmicScalePropertyDsl.() -> Unit
      = {}): CfnTemplate.AxisLogarithmicScaleProperty {
    val builder = CfnTemplateAxisLogarithmicScalePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTemplateAxisScaleProperty(block: CfnTemplateAxisScalePropertyDsl.() -> Unit =
      {}): CfnTemplate.AxisScaleProperty {
    val builder = CfnTemplateAxisScalePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateAxisTickLabelOptionsProperty(block: CfnTemplateAxisTickLabelOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.AxisTickLabelOptionsProperty {
    val builder = CfnTemplateAxisTickLabelOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateBarChartAggregatedFieldWellsProperty(block: CfnTemplateBarChartAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnTemplate.BarChartAggregatedFieldWellsProperty {
    val builder = CfnTemplateBarChartAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateBarChartConfigurationProperty(block: CfnTemplateBarChartConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.BarChartConfigurationProperty {
    val builder = CfnTemplateBarChartConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateBarChartFieldWellsProperty(block: CfnTemplateBarChartFieldWellsPropertyDsl.() -> Unit
      = {}): CfnTemplate.BarChartFieldWellsProperty {
    val builder = CfnTemplateBarChartFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateBarChartSortConfigurationProperty(block: CfnTemplateBarChartSortConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.BarChartSortConfigurationProperty {
    val builder = CfnTemplateBarChartSortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateBarChartVisualProperty(block: CfnTemplateBarChartVisualPropertyDsl.() -> Unit =
      {}): CfnTemplate.BarChartVisualProperty {
    val builder = CfnTemplateBarChartVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateBinCountOptionsProperty(block: CfnTemplateBinCountOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.BinCountOptionsProperty {
    val builder = CfnTemplateBinCountOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateBinWidthOptionsProperty(block: CfnTemplateBinWidthOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.BinWidthOptionsProperty {
    val builder = CfnTemplateBinWidthOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateBodySectionConfigurationProperty(block: CfnTemplateBodySectionConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.BodySectionConfigurationProperty {
    val builder = CfnTemplateBodySectionConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateBodySectionContentProperty(block: CfnTemplateBodySectionContentPropertyDsl.() -> Unit
      = {}): CfnTemplate.BodySectionContentProperty {
    val builder = CfnTemplateBodySectionContentPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateBoxPlotAggregatedFieldWellsProperty(block: CfnTemplateBoxPlotAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnTemplate.BoxPlotAggregatedFieldWellsProperty {
    val builder = CfnTemplateBoxPlotAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateBoxPlotChartConfigurationProperty(block: CfnTemplateBoxPlotChartConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.BoxPlotChartConfigurationProperty {
    val builder = CfnTemplateBoxPlotChartConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateBoxPlotFieldWellsProperty(block: CfnTemplateBoxPlotFieldWellsPropertyDsl.() -> Unit
      = {}): CfnTemplate.BoxPlotFieldWellsProperty {
    val builder = CfnTemplateBoxPlotFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateBoxPlotOptionsProperty(block: CfnTemplateBoxPlotOptionsPropertyDsl.() -> Unit =
      {}): CfnTemplate.BoxPlotOptionsProperty {
    val builder = CfnTemplateBoxPlotOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateBoxPlotSortConfigurationProperty(block: CfnTemplateBoxPlotSortConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.BoxPlotSortConfigurationProperty {
    val builder = CfnTemplateBoxPlotSortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateBoxPlotStyleOptionsProperty(block: CfnTemplateBoxPlotStyleOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.BoxPlotStyleOptionsProperty {
    val builder = CfnTemplateBoxPlotStyleOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateBoxPlotVisualProperty(block: CfnTemplateBoxPlotVisualPropertyDsl.() -> Unit =
      {}): CfnTemplate.BoxPlotVisualProperty {
    val builder = CfnTemplateBoxPlotVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateCalculatedFieldProperty(block: CfnTemplateCalculatedFieldPropertyDsl.() -> Unit
      = {}): CfnTemplate.CalculatedFieldProperty {
    val builder = CfnTemplateCalculatedFieldPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateCalculatedMeasureFieldProperty(block: CfnTemplateCalculatedMeasureFieldPropertyDsl.() -> Unit
      = {}): CfnTemplate.CalculatedMeasureFieldProperty {
    val builder = CfnTemplateCalculatedMeasureFieldPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateCascadingControlConfigurationProperty(block: CfnTemplateCascadingControlConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.CascadingControlConfigurationProperty {
    val builder = CfnTemplateCascadingControlConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateCascadingControlSourceProperty(block: CfnTemplateCascadingControlSourcePropertyDsl.() -> Unit
      = {}): CfnTemplate.CascadingControlSourceProperty {
    val builder = CfnTemplateCascadingControlSourcePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateCategoricalDimensionFieldProperty(block: CfnTemplateCategoricalDimensionFieldPropertyDsl.() -> Unit
      = {}): CfnTemplate.CategoricalDimensionFieldProperty {
    val builder = CfnTemplateCategoricalDimensionFieldPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateCategoricalMeasureFieldProperty(block: CfnTemplateCategoricalMeasureFieldPropertyDsl.() -> Unit
      = {}): CfnTemplate.CategoricalMeasureFieldProperty {
    val builder = CfnTemplateCategoricalMeasureFieldPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateCategoryDrillDownFilterProperty(block: CfnTemplateCategoryDrillDownFilterPropertyDsl.() -> Unit
      = {}): CfnTemplate.CategoryDrillDownFilterProperty {
    val builder = CfnTemplateCategoryDrillDownFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateCategoryFilterConfigurationProperty(block: CfnTemplateCategoryFilterConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.CategoryFilterConfigurationProperty {
    val builder = CfnTemplateCategoryFilterConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateCategoryFilterProperty(block: CfnTemplateCategoryFilterPropertyDsl.() -> Unit =
      {}): CfnTemplate.CategoryFilterProperty {
    val builder = CfnTemplateCategoryFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateChartAxisLabelOptionsProperty(block: CfnTemplateChartAxisLabelOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.ChartAxisLabelOptionsProperty {
    val builder = CfnTemplateChartAxisLabelOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateClusterMarkerConfigurationProperty(block: CfnTemplateClusterMarkerConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.ClusterMarkerConfigurationProperty {
    val builder = CfnTemplateClusterMarkerConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateClusterMarkerProperty(block: CfnTemplateClusterMarkerPropertyDsl.() -> Unit =
      {}): CfnTemplate.ClusterMarkerProperty {
    val builder = CfnTemplateClusterMarkerPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTemplateColorScaleProperty(block: CfnTemplateColorScalePropertyDsl.() -> Unit
      = {}): CfnTemplate.ColorScaleProperty {
    val builder = CfnTemplateColorScalePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateColumnConfigurationProperty(block: CfnTemplateColumnConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.ColumnConfigurationProperty {
    val builder = CfnTemplateColumnConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateColumnGroupColumnSchemaProperty(block: CfnTemplateColumnGroupColumnSchemaPropertyDsl.() -> Unit
      = {}): CfnTemplate.ColumnGroupColumnSchemaProperty {
    val builder = CfnTemplateColumnGroupColumnSchemaPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateColumnGroupSchemaProperty(block: CfnTemplateColumnGroupSchemaPropertyDsl.() -> Unit
      = {}): CfnTemplate.ColumnGroupSchemaProperty {
    val builder = CfnTemplateColumnGroupSchemaPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateColumnHierarchyProperty(block: CfnTemplateColumnHierarchyPropertyDsl.() -> Unit
      = {}): CfnTemplate.ColumnHierarchyProperty {
    val builder = CfnTemplateColumnHierarchyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateColumnIdentifierProperty(block: CfnTemplateColumnIdentifierPropertyDsl.() -> Unit
      = {}): CfnTemplate.ColumnIdentifierProperty {
    val builder = CfnTemplateColumnIdentifierPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateColumnSchemaProperty(block: CfnTemplateColumnSchemaPropertyDsl.() -> Unit =
      {}): CfnTemplate.ColumnSchemaProperty {
    val builder = CfnTemplateColumnSchemaPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTemplateColumnSortProperty(block: CfnTemplateColumnSortPropertyDsl.() -> Unit
      = {}): CfnTemplate.ColumnSortProperty {
    val builder = CfnTemplateColumnSortPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateColumnTooltipItemProperty(block: CfnTemplateColumnTooltipItemPropertyDsl.() -> Unit
      = {}): CfnTemplate.ColumnTooltipItemProperty {
    val builder = CfnTemplateColumnTooltipItemPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateComboChartAggregatedFieldWellsProperty(block: CfnTemplateComboChartAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnTemplate.ComboChartAggregatedFieldWellsProperty {
    val builder = CfnTemplateComboChartAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateComboChartConfigurationProperty(block: CfnTemplateComboChartConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.ComboChartConfigurationProperty {
    val builder = CfnTemplateComboChartConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateComboChartFieldWellsProperty(block: CfnTemplateComboChartFieldWellsPropertyDsl.() -> Unit
      = {}): CfnTemplate.ComboChartFieldWellsProperty {
    val builder = CfnTemplateComboChartFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateComboChartSortConfigurationProperty(block: CfnTemplateComboChartSortConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.ComboChartSortConfigurationProperty {
    val builder = CfnTemplateComboChartSortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateComboChartVisualProperty(block: CfnTemplateComboChartVisualPropertyDsl.() -> Unit
      = {}): CfnTemplate.ComboChartVisualProperty {
    val builder = CfnTemplateComboChartVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateComparisonConfigurationProperty(block: CfnTemplateComparisonConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.ComparisonConfigurationProperty {
    val builder = CfnTemplateComparisonConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateComparisonFormatConfigurationProperty(block: CfnTemplateComparisonFormatConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.ComparisonFormatConfigurationProperty {
    val builder = CfnTemplateComparisonFormatConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateComputationProperty(block: CfnTemplateComputationPropertyDsl.() -> Unit = {}):
      CfnTemplate.ComputationProperty {
    val builder = CfnTemplateComputationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateConditionalFormattingColorProperty(block: CfnTemplateConditionalFormattingColorPropertyDsl.() -> Unit
      = {}): CfnTemplate.ConditionalFormattingColorProperty {
    val builder = CfnTemplateConditionalFormattingColorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateConditionalFormattingCustomIconConditionProperty(block: CfnTemplateConditionalFormattingCustomIconConditionPropertyDsl.() -> Unit
      = {}): CfnTemplate.ConditionalFormattingCustomIconConditionProperty {
    val builder = CfnTemplateConditionalFormattingCustomIconConditionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateConditionalFormattingCustomIconOptionsProperty(block: CfnTemplateConditionalFormattingCustomIconOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.ConditionalFormattingCustomIconOptionsProperty {
    val builder = CfnTemplateConditionalFormattingCustomIconOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateConditionalFormattingGradientColorProperty(block: CfnTemplateConditionalFormattingGradientColorPropertyDsl.() -> Unit
      = {}): CfnTemplate.ConditionalFormattingGradientColorProperty {
    val builder = CfnTemplateConditionalFormattingGradientColorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateConditionalFormattingIconDisplayConfigurationProperty(block: CfnTemplateConditionalFormattingIconDisplayConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.ConditionalFormattingIconDisplayConfigurationProperty {
    val builder = CfnTemplateConditionalFormattingIconDisplayConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateConditionalFormattingIconProperty(block: CfnTemplateConditionalFormattingIconPropertyDsl.() -> Unit
      = {}): CfnTemplate.ConditionalFormattingIconProperty {
    val builder = CfnTemplateConditionalFormattingIconPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateConditionalFormattingIconSetProperty(block: CfnTemplateConditionalFormattingIconSetPropertyDsl.() -> Unit
      = {}): CfnTemplate.ConditionalFormattingIconSetProperty {
    val builder = CfnTemplateConditionalFormattingIconSetPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateConditionalFormattingSolidColorProperty(block: CfnTemplateConditionalFormattingSolidColorPropertyDsl.() -> Unit
      = {}): CfnTemplate.ConditionalFormattingSolidColorProperty {
    val builder = CfnTemplateConditionalFormattingSolidColorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateContributionAnalysisDefaultProperty(block: CfnTemplateContributionAnalysisDefaultPropertyDsl.() -> Unit
      = {}): CfnTemplate.ContributionAnalysisDefaultProperty {
    val builder = CfnTemplateContributionAnalysisDefaultPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateCurrencyDisplayFormatConfigurationProperty(block: CfnTemplateCurrencyDisplayFormatConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.CurrencyDisplayFormatConfigurationProperty {
    val builder = CfnTemplateCurrencyDisplayFormatConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateCustomActionFilterOperationProperty(block: CfnTemplateCustomActionFilterOperationPropertyDsl.() -> Unit
      = {}): CfnTemplate.CustomActionFilterOperationProperty {
    val builder = CfnTemplateCustomActionFilterOperationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateCustomActionNavigationOperationProperty(block: CfnTemplateCustomActionNavigationOperationPropertyDsl.() -> Unit
      = {}): CfnTemplate.CustomActionNavigationOperationProperty {
    val builder = CfnTemplateCustomActionNavigationOperationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateCustomActionSetParametersOperationProperty(block: CfnTemplateCustomActionSetParametersOperationPropertyDsl.() -> Unit
      = {}): CfnTemplate.CustomActionSetParametersOperationProperty {
    val builder = CfnTemplateCustomActionSetParametersOperationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateCustomActionURLOperationProperty(block: CfnTemplateCustomActionURLOperationPropertyDsl.() -> Unit
      = {}): CfnTemplate.CustomActionURLOperationProperty {
    val builder = CfnTemplateCustomActionURLOperationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateCustomContentConfigurationProperty(block: CfnTemplateCustomContentConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.CustomContentConfigurationProperty {
    val builder = CfnTemplateCustomContentConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateCustomContentVisualProperty(block: CfnTemplateCustomContentVisualPropertyDsl.() -> Unit
      = {}): CfnTemplate.CustomContentVisualProperty {
    val builder = CfnTemplateCustomContentVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateCustomFilterConfigurationProperty(block: CfnTemplateCustomFilterConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.CustomFilterConfigurationProperty {
    val builder = CfnTemplateCustomFilterConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateCustomFilterListConfigurationProperty(block: CfnTemplateCustomFilterListConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.CustomFilterListConfigurationProperty {
    val builder = CfnTemplateCustomFilterListConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateCustomNarrativeOptionsProperty(block: CfnTemplateCustomNarrativeOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.CustomNarrativeOptionsProperty {
    val builder = CfnTemplateCustomNarrativeOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateCustomParameterValuesProperty(block: CfnTemplateCustomParameterValuesPropertyDsl.() -> Unit
      = {}): CfnTemplate.CustomParameterValuesProperty {
    val builder = CfnTemplateCustomParameterValuesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateCustomValuesConfigurationProperty(block: CfnTemplateCustomValuesConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.CustomValuesConfigurationProperty {
    val builder = CfnTemplateCustomValuesConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateDataBarsOptionsProperty(block: CfnTemplateDataBarsOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.DataBarsOptionsProperty {
    val builder = CfnTemplateDataBarsOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTemplateDataColorProperty(block: CfnTemplateDataColorPropertyDsl.() -> Unit =
      {}): CfnTemplate.DataColorProperty {
    val builder = CfnTemplateDataColorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateDataFieldSeriesItemProperty(block: CfnTemplateDataFieldSeriesItemPropertyDsl.() -> Unit
      = {}): CfnTemplate.DataFieldSeriesItemProperty {
    val builder = CfnTemplateDataFieldSeriesItemPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateDataLabelOptionsProperty(block: CfnTemplateDataLabelOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.DataLabelOptionsProperty {
    val builder = CfnTemplateDataLabelOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateDataLabelTypeProperty(block: CfnTemplateDataLabelTypePropertyDsl.() -> Unit =
      {}): CfnTemplate.DataLabelTypeProperty {
    val builder = CfnTemplateDataLabelTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateDataPathColorProperty(block: CfnTemplateDataPathColorPropertyDsl.() -> Unit =
      {}): CfnTemplate.DataPathColorProperty {
    val builder = CfnTemplateDataPathColorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateDataPathLabelTypeProperty(block: CfnTemplateDataPathLabelTypePropertyDsl.() -> Unit
      = {}): CfnTemplate.DataPathLabelTypeProperty {
    val builder = CfnTemplateDataPathLabelTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateDataPathSortProperty(block: CfnTemplateDataPathSortPropertyDsl.() -> Unit =
      {}): CfnTemplate.DataPathSortProperty {
    val builder = CfnTemplateDataPathSortPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateDataPathValueProperty(block: CfnTemplateDataPathValuePropertyDsl.() -> Unit =
      {}): CfnTemplate.DataPathValueProperty {
    val builder = CfnTemplateDataPathValuePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateDataSetConfigurationProperty(block: CfnTemplateDataSetConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.DataSetConfigurationProperty {
    val builder = CfnTemplateDataSetConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateDataSetReferenceProperty(block: CfnTemplateDataSetReferencePropertyDsl.() -> Unit
      = {}): CfnTemplate.DataSetReferenceProperty {
    val builder = CfnTemplateDataSetReferencePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateDataSetSchemaProperty(block: CfnTemplateDataSetSchemaPropertyDsl.() -> Unit =
      {}): CfnTemplate.DataSetSchemaProperty {
    val builder = CfnTemplateDataSetSchemaPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateDateAxisOptionsProperty(block: CfnTemplateDateAxisOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.DateAxisOptionsProperty {
    val builder = CfnTemplateDateAxisOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateDateDimensionFieldProperty(block: CfnTemplateDateDimensionFieldPropertyDsl.() -> Unit
      = {}): CfnTemplate.DateDimensionFieldProperty {
    val builder = CfnTemplateDateDimensionFieldPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateDateMeasureFieldProperty(block: CfnTemplateDateMeasureFieldPropertyDsl.() -> Unit
      = {}): CfnTemplate.DateMeasureFieldProperty {
    val builder = CfnTemplateDateMeasureFieldPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateDateTimeDefaultValuesProperty(block: CfnTemplateDateTimeDefaultValuesPropertyDsl.() -> Unit
      = {}): CfnTemplate.DateTimeDefaultValuesProperty {
    val builder = CfnTemplateDateTimeDefaultValuesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateDateTimeFormatConfigurationProperty(block: CfnTemplateDateTimeFormatConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.DateTimeFormatConfigurationProperty {
    val builder = CfnTemplateDateTimeFormatConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateDateTimeHierarchyProperty(block: CfnTemplateDateTimeHierarchyPropertyDsl.() -> Unit
      = {}): CfnTemplate.DateTimeHierarchyProperty {
    val builder = CfnTemplateDateTimeHierarchyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateDateTimeParameterDeclarationProperty(block: CfnTemplateDateTimeParameterDeclarationPropertyDsl.() -> Unit
      = {}): CfnTemplate.DateTimeParameterDeclarationProperty {
    val builder = CfnTemplateDateTimeParameterDeclarationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateDateTimePickerControlDisplayOptionsProperty(block: CfnTemplateDateTimePickerControlDisplayOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.DateTimePickerControlDisplayOptionsProperty {
    val builder = CfnTemplateDateTimePickerControlDisplayOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateDateTimeValueWhenUnsetConfigurationProperty(block: CfnTemplateDateTimeValueWhenUnsetConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.DateTimeValueWhenUnsetConfigurationProperty {
    val builder = CfnTemplateDateTimeValueWhenUnsetConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateDecimalDefaultValuesProperty(block: CfnTemplateDecimalDefaultValuesPropertyDsl.() -> Unit
      = {}): CfnTemplate.DecimalDefaultValuesProperty {
    val builder = CfnTemplateDecimalDefaultValuesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateDecimalParameterDeclarationProperty(block: CfnTemplateDecimalParameterDeclarationPropertyDsl.() -> Unit
      = {}): CfnTemplate.DecimalParameterDeclarationProperty {
    val builder = CfnTemplateDecimalParameterDeclarationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateDecimalPlacesConfigurationProperty(block: CfnTemplateDecimalPlacesConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.DecimalPlacesConfigurationProperty {
    val builder = CfnTemplateDecimalPlacesConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateDecimalValueWhenUnsetConfigurationProperty(block: CfnTemplateDecimalValueWhenUnsetConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.DecimalValueWhenUnsetConfigurationProperty {
    val builder = CfnTemplateDecimalValueWhenUnsetConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateDefaultFreeFormLayoutConfigurationProperty(block: CfnTemplateDefaultFreeFormLayoutConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.DefaultFreeFormLayoutConfigurationProperty {
    val builder = CfnTemplateDefaultFreeFormLayoutConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateDefaultGridLayoutConfigurationProperty(block: CfnTemplateDefaultGridLayoutConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.DefaultGridLayoutConfigurationProperty {
    val builder = CfnTemplateDefaultGridLayoutConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateDefaultInteractiveLayoutConfigurationProperty(block: CfnTemplateDefaultInteractiveLayoutConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.DefaultInteractiveLayoutConfigurationProperty {
    val builder = CfnTemplateDefaultInteractiveLayoutConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateDefaultNewSheetConfigurationProperty(block: CfnTemplateDefaultNewSheetConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.DefaultNewSheetConfigurationProperty {
    val builder = CfnTemplateDefaultNewSheetConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateDefaultPaginatedLayoutConfigurationProperty(block: CfnTemplateDefaultPaginatedLayoutConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.DefaultPaginatedLayoutConfigurationProperty {
    val builder = CfnTemplateDefaultPaginatedLayoutConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateDefaultSectionBasedLayoutConfigurationProperty(block: CfnTemplateDefaultSectionBasedLayoutConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.DefaultSectionBasedLayoutConfigurationProperty {
    val builder = CfnTemplateDefaultSectionBasedLayoutConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateDestinationParameterValueConfigurationProperty(block: CfnTemplateDestinationParameterValueConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.DestinationParameterValueConfigurationProperty {
    val builder = CfnTemplateDestinationParameterValueConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateDimensionFieldProperty(block: CfnTemplateDimensionFieldPropertyDsl.() -> Unit =
      {}): CfnTemplate.DimensionFieldProperty {
    val builder = CfnTemplateDimensionFieldPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateDonutCenterOptionsProperty(block: CfnTemplateDonutCenterOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.DonutCenterOptionsProperty {
    val builder = CfnTemplateDonutCenterOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateDonutOptionsProperty(block: CfnTemplateDonutOptionsPropertyDsl.() -> Unit =
      {}): CfnTemplate.DonutOptionsProperty {
    val builder = CfnTemplateDonutOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateDrillDownFilterProperty(block: CfnTemplateDrillDownFilterPropertyDsl.() -> Unit
      = {}): CfnTemplate.DrillDownFilterProperty {
    val builder = CfnTemplateDrillDownFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateDropDownControlDisplayOptionsProperty(block: CfnTemplateDropDownControlDisplayOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.DropDownControlDisplayOptionsProperty {
    val builder = CfnTemplateDropDownControlDisplayOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateDynamicDefaultValueProperty(block: CfnTemplateDynamicDefaultValuePropertyDsl.() -> Unit
      = {}): CfnTemplate.DynamicDefaultValueProperty {
    val builder = CfnTemplateDynamicDefaultValuePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateEmptyVisualProperty(block: CfnTemplateEmptyVisualPropertyDsl.() -> Unit = {}):
      CfnTemplate.EmptyVisualProperty {
    val builder = CfnTemplateEmptyVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTemplateEntityProperty(block: CfnTemplateEntityPropertyDsl.() -> Unit = {}):
      CfnTemplate.EntityProperty {
    val builder = CfnTemplateEntityPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateExcludePeriodConfigurationProperty(block: CfnTemplateExcludePeriodConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.ExcludePeriodConfigurationProperty {
    val builder = CfnTemplateExcludePeriodConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateExplicitHierarchyProperty(block: CfnTemplateExplicitHierarchyPropertyDsl.() -> Unit
      = {}): CfnTemplate.ExplicitHierarchyProperty {
    val builder = CfnTemplateExplicitHierarchyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateFieldBasedTooltipProperty(block: CfnTemplateFieldBasedTooltipPropertyDsl.() -> Unit
      = {}): CfnTemplate.FieldBasedTooltipProperty {
    val builder = CfnTemplateFieldBasedTooltipPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateFieldLabelTypeProperty(block: CfnTemplateFieldLabelTypePropertyDsl.() -> Unit =
      {}): CfnTemplate.FieldLabelTypeProperty {
    val builder = CfnTemplateFieldLabelTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateFieldSeriesItemProperty(block: CfnTemplateFieldSeriesItemPropertyDsl.() -> Unit
      = {}): CfnTemplate.FieldSeriesItemProperty {
    val builder = CfnTemplateFieldSeriesItemPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateFieldSortOptionsProperty(block: CfnTemplateFieldSortOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.FieldSortOptionsProperty {
    val builder = CfnTemplateFieldSortOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTemplateFieldSortProperty(block: CfnTemplateFieldSortPropertyDsl.() -> Unit =
      {}): CfnTemplate.FieldSortProperty {
    val builder = CfnTemplateFieldSortPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateFieldTooltipItemProperty(block: CfnTemplateFieldTooltipItemPropertyDsl.() -> Unit
      = {}): CfnTemplate.FieldTooltipItemProperty {
    val builder = CfnTemplateFieldTooltipItemPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateFilledMapAggregatedFieldWellsProperty(block: CfnTemplateFilledMapAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnTemplate.FilledMapAggregatedFieldWellsProperty {
    val builder = CfnTemplateFilledMapAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateFilledMapConditionalFormattingOptionProperty(block: CfnTemplateFilledMapConditionalFormattingOptionPropertyDsl.() -> Unit
      = {}): CfnTemplate.FilledMapConditionalFormattingOptionProperty {
    val builder = CfnTemplateFilledMapConditionalFormattingOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateFilledMapConditionalFormattingProperty(block: CfnTemplateFilledMapConditionalFormattingPropertyDsl.() -> Unit
      = {}): CfnTemplate.FilledMapConditionalFormattingProperty {
    val builder = CfnTemplateFilledMapConditionalFormattingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateFilledMapConfigurationProperty(block: CfnTemplateFilledMapConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.FilledMapConfigurationProperty {
    val builder = CfnTemplateFilledMapConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateFilledMapFieldWellsProperty(block: CfnTemplateFilledMapFieldWellsPropertyDsl.() -> Unit
      = {}): CfnTemplate.FilledMapFieldWellsProperty {
    val builder = CfnTemplateFilledMapFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateFilledMapShapeConditionalFormattingProperty(block: CfnTemplateFilledMapShapeConditionalFormattingPropertyDsl.() -> Unit
      = {}): CfnTemplate.FilledMapShapeConditionalFormattingProperty {
    val builder = CfnTemplateFilledMapShapeConditionalFormattingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateFilledMapSortConfigurationProperty(block: CfnTemplateFilledMapSortConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.FilledMapSortConfigurationProperty {
    val builder = CfnTemplateFilledMapSortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateFilledMapVisualProperty(block: CfnTemplateFilledMapVisualPropertyDsl.() -> Unit
      = {}): CfnTemplate.FilledMapVisualProperty {
    val builder = CfnTemplateFilledMapVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateFilterControlProperty(block: CfnTemplateFilterControlPropertyDsl.() -> Unit =
      {}): CfnTemplate.FilterControlProperty {
    val builder = CfnTemplateFilterControlPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateFilterDateTimePickerControlProperty(block: CfnTemplateFilterDateTimePickerControlPropertyDsl.() -> Unit
      = {}): CfnTemplate.FilterDateTimePickerControlProperty {
    val builder = CfnTemplateFilterDateTimePickerControlPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateFilterDropDownControlProperty(block: CfnTemplateFilterDropDownControlPropertyDsl.() -> Unit
      = {}): CfnTemplate.FilterDropDownControlProperty {
    val builder = CfnTemplateFilterDropDownControlPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateFilterGroupProperty(block: CfnTemplateFilterGroupPropertyDsl.() -> Unit = {}):
      CfnTemplate.FilterGroupProperty {
    val builder = CfnTemplateFilterGroupPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateFilterListConfigurationProperty(block: CfnTemplateFilterListConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.FilterListConfigurationProperty {
    val builder = CfnTemplateFilterListConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateFilterListControlProperty(block: CfnTemplateFilterListControlPropertyDsl.() -> Unit
      = {}): CfnTemplate.FilterListControlProperty {
    val builder = CfnTemplateFilterListControlPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateFilterOperationSelectedFieldsConfigurationProperty(block: CfnTemplateFilterOperationSelectedFieldsConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.FilterOperationSelectedFieldsConfigurationProperty {
    val builder = CfnTemplateFilterOperationSelectedFieldsConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateFilterOperationTargetVisualsConfigurationProperty(block: CfnTemplateFilterOperationTargetVisualsConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.FilterOperationTargetVisualsConfigurationProperty {
    val builder = CfnTemplateFilterOperationTargetVisualsConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTemplateFilterProperty(block: CfnTemplateFilterPropertyDsl.() -> Unit = {}):
      CfnTemplate.FilterProperty {
    val builder = CfnTemplateFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateFilterRelativeDateTimeControlProperty(block: CfnTemplateFilterRelativeDateTimeControlPropertyDsl.() -> Unit
      = {}): CfnTemplate.FilterRelativeDateTimeControlProperty {
    val builder = CfnTemplateFilterRelativeDateTimeControlPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateFilterScopeConfigurationProperty(block: CfnTemplateFilterScopeConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.FilterScopeConfigurationProperty {
    val builder = CfnTemplateFilterScopeConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateFilterSelectableValuesProperty(block: CfnTemplateFilterSelectableValuesPropertyDsl.() -> Unit
      = {}): CfnTemplate.FilterSelectableValuesProperty {
    val builder = CfnTemplateFilterSelectableValuesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateFilterSliderControlProperty(block: CfnTemplateFilterSliderControlPropertyDsl.() -> Unit
      = {}): CfnTemplate.FilterSliderControlProperty {
    val builder = CfnTemplateFilterSliderControlPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateFilterTextAreaControlProperty(block: CfnTemplateFilterTextAreaControlPropertyDsl.() -> Unit
      = {}): CfnTemplate.FilterTextAreaControlProperty {
    val builder = CfnTemplateFilterTextAreaControlPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateFilterTextFieldControlProperty(block: CfnTemplateFilterTextFieldControlPropertyDsl.() -> Unit
      = {}): CfnTemplate.FilterTextFieldControlProperty {
    val builder = CfnTemplateFilterTextFieldControlPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateFontConfigurationProperty(block: CfnTemplateFontConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.FontConfigurationProperty {
    val builder = CfnTemplateFontConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTemplateFontSizeProperty(block: CfnTemplateFontSizePropertyDsl.() -> Unit =
      {}): CfnTemplate.FontSizeProperty {
    val builder = CfnTemplateFontSizePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTemplateFontWeightProperty(block: CfnTemplateFontWeightPropertyDsl.() -> Unit
      = {}): CfnTemplate.FontWeightProperty {
    val builder = CfnTemplateFontWeightPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateForecastComputationProperty(block: CfnTemplateForecastComputationPropertyDsl.() -> Unit
      = {}): CfnTemplate.ForecastComputationProperty {
    val builder = CfnTemplateForecastComputationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateForecastConfigurationProperty(block: CfnTemplateForecastConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.ForecastConfigurationProperty {
    val builder = CfnTemplateForecastConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateForecastScenarioProperty(block: CfnTemplateForecastScenarioPropertyDsl.() -> Unit
      = {}): CfnTemplate.ForecastScenarioProperty {
    val builder = CfnTemplateForecastScenarioPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateFormatConfigurationProperty(block: CfnTemplateFormatConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.FormatConfigurationProperty {
    val builder = CfnTemplateFormatConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateFreeFormLayoutCanvasSizeOptionsProperty(block: CfnTemplateFreeFormLayoutCanvasSizeOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.FreeFormLayoutCanvasSizeOptionsProperty {
    val builder = CfnTemplateFreeFormLayoutCanvasSizeOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateFreeFormLayoutConfigurationProperty(block: CfnTemplateFreeFormLayoutConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.FreeFormLayoutConfigurationProperty {
    val builder = CfnTemplateFreeFormLayoutConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateFreeFormLayoutElementBackgroundStyleProperty(block: CfnTemplateFreeFormLayoutElementBackgroundStylePropertyDsl.() -> Unit
      = {}): CfnTemplate.FreeFormLayoutElementBackgroundStyleProperty {
    val builder = CfnTemplateFreeFormLayoutElementBackgroundStylePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateFreeFormLayoutElementBorderStyleProperty(block: CfnTemplateFreeFormLayoutElementBorderStylePropertyDsl.() -> Unit
      = {}): CfnTemplate.FreeFormLayoutElementBorderStyleProperty {
    val builder = CfnTemplateFreeFormLayoutElementBorderStylePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateFreeFormLayoutElementProperty(block: CfnTemplateFreeFormLayoutElementPropertyDsl.() -> Unit
      = {}): CfnTemplate.FreeFormLayoutElementProperty {
    val builder = CfnTemplateFreeFormLayoutElementPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateFreeFormLayoutScreenCanvasSizeOptionsProperty(block: CfnTemplateFreeFormLayoutScreenCanvasSizeOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.FreeFormLayoutScreenCanvasSizeOptionsProperty {
    val builder = CfnTemplateFreeFormLayoutScreenCanvasSizeOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateFreeFormSectionLayoutConfigurationProperty(block: CfnTemplateFreeFormSectionLayoutConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.FreeFormSectionLayoutConfigurationProperty {
    val builder = CfnTemplateFreeFormSectionLayoutConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateFunnelChartAggregatedFieldWellsProperty(block: CfnTemplateFunnelChartAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnTemplate.FunnelChartAggregatedFieldWellsProperty {
    val builder = CfnTemplateFunnelChartAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateFunnelChartConfigurationProperty(block: CfnTemplateFunnelChartConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.FunnelChartConfigurationProperty {
    val builder = CfnTemplateFunnelChartConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateFunnelChartDataLabelOptionsProperty(block: CfnTemplateFunnelChartDataLabelOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.FunnelChartDataLabelOptionsProperty {
    val builder = CfnTemplateFunnelChartDataLabelOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateFunnelChartFieldWellsProperty(block: CfnTemplateFunnelChartFieldWellsPropertyDsl.() -> Unit
      = {}): CfnTemplate.FunnelChartFieldWellsProperty {
    val builder = CfnTemplateFunnelChartFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateFunnelChartSortConfigurationProperty(block: CfnTemplateFunnelChartSortConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.FunnelChartSortConfigurationProperty {
    val builder = CfnTemplateFunnelChartSortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateFunnelChartVisualProperty(block: CfnTemplateFunnelChartVisualPropertyDsl.() -> Unit
      = {}): CfnTemplate.FunnelChartVisualProperty {
    val builder = CfnTemplateFunnelChartVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateGaugeChartArcConditionalFormattingProperty(block: CfnTemplateGaugeChartArcConditionalFormattingPropertyDsl.() -> Unit
      = {}): CfnTemplate.GaugeChartArcConditionalFormattingProperty {
    val builder = CfnTemplateGaugeChartArcConditionalFormattingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateGaugeChartConditionalFormattingOptionProperty(block: CfnTemplateGaugeChartConditionalFormattingOptionPropertyDsl.() -> Unit
      = {}): CfnTemplate.GaugeChartConditionalFormattingOptionProperty {
    val builder = CfnTemplateGaugeChartConditionalFormattingOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateGaugeChartConditionalFormattingProperty(block: CfnTemplateGaugeChartConditionalFormattingPropertyDsl.() -> Unit
      = {}): CfnTemplate.GaugeChartConditionalFormattingProperty {
    val builder = CfnTemplateGaugeChartConditionalFormattingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateGaugeChartConfigurationProperty(block: CfnTemplateGaugeChartConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.GaugeChartConfigurationProperty {
    val builder = CfnTemplateGaugeChartConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateGaugeChartFieldWellsProperty(block: CfnTemplateGaugeChartFieldWellsPropertyDsl.() -> Unit
      = {}): CfnTemplate.GaugeChartFieldWellsProperty {
    val builder = CfnTemplateGaugeChartFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateGaugeChartOptionsProperty(block: CfnTemplateGaugeChartOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.GaugeChartOptionsProperty {
    val builder = CfnTemplateGaugeChartOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateGaugeChartPrimaryValueConditionalFormattingProperty(block: CfnTemplateGaugeChartPrimaryValueConditionalFormattingPropertyDsl.() -> Unit
      = {}): CfnTemplate.GaugeChartPrimaryValueConditionalFormattingProperty {
    val builder = CfnTemplateGaugeChartPrimaryValueConditionalFormattingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateGaugeChartVisualProperty(block: CfnTemplateGaugeChartVisualPropertyDsl.() -> Unit
      = {}): CfnTemplate.GaugeChartVisualProperty {
    val builder = CfnTemplateGaugeChartVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateGeospatialCoordinateBoundsProperty(block: CfnTemplateGeospatialCoordinateBoundsPropertyDsl.() -> Unit
      = {}): CfnTemplate.GeospatialCoordinateBoundsProperty {
    val builder = CfnTemplateGeospatialCoordinateBoundsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateGeospatialHeatmapColorScaleProperty(block: CfnTemplateGeospatialHeatmapColorScalePropertyDsl.() -> Unit
      = {}): CfnTemplate.GeospatialHeatmapColorScaleProperty {
    val builder = CfnTemplateGeospatialHeatmapColorScalePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateGeospatialHeatmapConfigurationProperty(block: CfnTemplateGeospatialHeatmapConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.GeospatialHeatmapConfigurationProperty {
    val builder = CfnTemplateGeospatialHeatmapConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateGeospatialHeatmapDataColorProperty(block: CfnTemplateGeospatialHeatmapDataColorPropertyDsl.() -> Unit
      = {}): CfnTemplate.GeospatialHeatmapDataColorProperty {
    val builder = CfnTemplateGeospatialHeatmapDataColorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateGeospatialMapAggregatedFieldWellsProperty(block: CfnTemplateGeospatialMapAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnTemplate.GeospatialMapAggregatedFieldWellsProperty {
    val builder = CfnTemplateGeospatialMapAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateGeospatialMapConfigurationProperty(block: CfnTemplateGeospatialMapConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.GeospatialMapConfigurationProperty {
    val builder = CfnTemplateGeospatialMapConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateGeospatialMapFieldWellsProperty(block: CfnTemplateGeospatialMapFieldWellsPropertyDsl.() -> Unit
      = {}): CfnTemplate.GeospatialMapFieldWellsProperty {
    val builder = CfnTemplateGeospatialMapFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateGeospatialMapStyleOptionsProperty(block: CfnTemplateGeospatialMapStyleOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.GeospatialMapStyleOptionsProperty {
    val builder = CfnTemplateGeospatialMapStyleOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateGeospatialMapVisualProperty(block: CfnTemplateGeospatialMapVisualPropertyDsl.() -> Unit
      = {}): CfnTemplate.GeospatialMapVisualProperty {
    val builder = CfnTemplateGeospatialMapVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateGeospatialPointStyleOptionsProperty(block: CfnTemplateGeospatialPointStyleOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.GeospatialPointStyleOptionsProperty {
    val builder = CfnTemplateGeospatialPointStyleOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateGeospatialWindowOptionsProperty(block: CfnTemplateGeospatialWindowOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.GeospatialWindowOptionsProperty {
    val builder = CfnTemplateGeospatialWindowOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateGlobalTableBorderOptionsProperty(block: CfnTemplateGlobalTableBorderOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.GlobalTableBorderOptionsProperty {
    val builder = CfnTemplateGlobalTableBorderOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateGradientColorProperty(block: CfnTemplateGradientColorPropertyDsl.() -> Unit =
      {}): CfnTemplate.GradientColorProperty {
    val builder = CfnTemplateGradientColorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateGradientStopProperty(block: CfnTemplateGradientStopPropertyDsl.() -> Unit =
      {}): CfnTemplate.GradientStopProperty {
    val builder = CfnTemplateGradientStopPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateGridLayoutCanvasSizeOptionsProperty(block: CfnTemplateGridLayoutCanvasSizeOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.GridLayoutCanvasSizeOptionsProperty {
    val builder = CfnTemplateGridLayoutCanvasSizeOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateGridLayoutConfigurationProperty(block: CfnTemplateGridLayoutConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.GridLayoutConfigurationProperty {
    val builder = CfnTemplateGridLayoutConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateGridLayoutElementProperty(block: CfnTemplateGridLayoutElementPropertyDsl.() -> Unit
      = {}): CfnTemplate.GridLayoutElementProperty {
    val builder = CfnTemplateGridLayoutElementPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateGridLayoutScreenCanvasSizeOptionsProperty(block: CfnTemplateGridLayoutScreenCanvasSizeOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.GridLayoutScreenCanvasSizeOptionsProperty {
    val builder = CfnTemplateGridLayoutScreenCanvasSizeOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateGrowthRateComputationProperty(block: CfnTemplateGrowthRateComputationPropertyDsl.() -> Unit
      = {}): CfnTemplate.GrowthRateComputationProperty {
    val builder = CfnTemplateGrowthRateComputationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateHeaderFooterSectionConfigurationProperty(block: CfnTemplateHeaderFooterSectionConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.HeaderFooterSectionConfigurationProperty {
    val builder = CfnTemplateHeaderFooterSectionConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateHeatMapAggregatedFieldWellsProperty(block: CfnTemplateHeatMapAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnTemplate.HeatMapAggregatedFieldWellsProperty {
    val builder = CfnTemplateHeatMapAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateHeatMapConfigurationProperty(block: CfnTemplateHeatMapConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.HeatMapConfigurationProperty {
    val builder = CfnTemplateHeatMapConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateHeatMapFieldWellsProperty(block: CfnTemplateHeatMapFieldWellsPropertyDsl.() -> Unit
      = {}): CfnTemplate.HeatMapFieldWellsProperty {
    val builder = CfnTemplateHeatMapFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateHeatMapSortConfigurationProperty(block: CfnTemplateHeatMapSortConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.HeatMapSortConfigurationProperty {
    val builder = CfnTemplateHeatMapSortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateHeatMapVisualProperty(block: CfnTemplateHeatMapVisualPropertyDsl.() -> Unit =
      {}): CfnTemplate.HeatMapVisualProperty {
    val builder = CfnTemplateHeatMapVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateHistogramAggregatedFieldWellsProperty(block: CfnTemplateHistogramAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnTemplate.HistogramAggregatedFieldWellsProperty {
    val builder = CfnTemplateHistogramAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateHistogramBinOptionsProperty(block: CfnTemplateHistogramBinOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.HistogramBinOptionsProperty {
    val builder = CfnTemplateHistogramBinOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateHistogramConfigurationProperty(block: CfnTemplateHistogramConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.HistogramConfigurationProperty {
    val builder = CfnTemplateHistogramConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateHistogramFieldWellsProperty(block: CfnTemplateHistogramFieldWellsPropertyDsl.() -> Unit
      = {}): CfnTemplate.HistogramFieldWellsProperty {
    val builder = CfnTemplateHistogramFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateHistogramVisualProperty(block: CfnTemplateHistogramVisualPropertyDsl.() -> Unit
      = {}): CfnTemplate.HistogramVisualProperty {
    val builder = CfnTemplateHistogramVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateInsightConfigurationProperty(block: CfnTemplateInsightConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.InsightConfigurationProperty {
    val builder = CfnTemplateInsightConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateInsightVisualProperty(block: CfnTemplateInsightVisualPropertyDsl.() -> Unit =
      {}): CfnTemplate.InsightVisualProperty {
    val builder = CfnTemplateInsightVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateIntegerDefaultValuesProperty(block: CfnTemplateIntegerDefaultValuesPropertyDsl.() -> Unit
      = {}): CfnTemplate.IntegerDefaultValuesProperty {
    val builder = CfnTemplateIntegerDefaultValuesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateIntegerParameterDeclarationProperty(block: CfnTemplateIntegerParameterDeclarationPropertyDsl.() -> Unit
      = {}): CfnTemplate.IntegerParameterDeclarationProperty {
    val builder = CfnTemplateIntegerParameterDeclarationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateIntegerValueWhenUnsetConfigurationProperty(block: CfnTemplateIntegerValueWhenUnsetConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.IntegerValueWhenUnsetConfigurationProperty {
    val builder = CfnTemplateIntegerValueWhenUnsetConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateItemsLimitConfigurationProperty(block: CfnTemplateItemsLimitConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.ItemsLimitConfigurationProperty {
    val builder = CfnTemplateItemsLimitConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateKPIConditionalFormattingOptionProperty(block: CfnTemplateKPIConditionalFormattingOptionPropertyDsl.() -> Unit
      = {}): CfnTemplate.KPIConditionalFormattingOptionProperty {
    val builder = CfnTemplateKPIConditionalFormattingOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateKPIConditionalFormattingProperty(block: CfnTemplateKPIConditionalFormattingPropertyDsl.() -> Unit
      = {}): CfnTemplate.KPIConditionalFormattingProperty {
    val builder = CfnTemplateKPIConditionalFormattingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateKPIConfigurationProperty(block: CfnTemplateKPIConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.KPIConfigurationProperty {
    val builder = CfnTemplateKPIConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateKPIFieldWellsProperty(block: CfnTemplateKPIFieldWellsPropertyDsl.() -> Unit =
      {}): CfnTemplate.KPIFieldWellsProperty {
    val builder = CfnTemplateKPIFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTemplateKPIOptionsProperty(block: CfnTemplateKPIOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.KPIOptionsProperty {
    val builder = CfnTemplateKPIOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateKPIPrimaryValueConditionalFormattingProperty(block: CfnTemplateKPIPrimaryValueConditionalFormattingPropertyDsl.() -> Unit
      = {}): CfnTemplate.KPIPrimaryValueConditionalFormattingProperty {
    val builder = CfnTemplateKPIPrimaryValueConditionalFormattingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateKPIProgressBarConditionalFormattingProperty(block: CfnTemplateKPIProgressBarConditionalFormattingPropertyDsl.() -> Unit
      = {}): CfnTemplate.KPIProgressBarConditionalFormattingProperty {
    val builder = CfnTemplateKPIProgressBarConditionalFormattingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateKPISortConfigurationProperty(block: CfnTemplateKPISortConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.KPISortConfigurationProperty {
    val builder = CfnTemplateKPISortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTemplateKPIVisualProperty(block: CfnTemplateKPIVisualPropertyDsl.() -> Unit =
      {}): CfnTemplate.KPIVisualProperty {
    val builder = CfnTemplateKPIVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateLabelOptionsProperty(block: CfnTemplateLabelOptionsPropertyDsl.() -> Unit =
      {}): CfnTemplate.LabelOptionsProperty {
    val builder = CfnTemplateLabelOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateLayoutConfigurationProperty(block: CfnTemplateLayoutConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.LayoutConfigurationProperty {
    val builder = CfnTemplateLayoutConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTemplateLayoutProperty(block: CfnTemplateLayoutPropertyDsl.() -> Unit = {}):
      CfnTemplate.LayoutProperty {
    val builder = CfnTemplateLayoutPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateLegendOptionsProperty(block: CfnTemplateLegendOptionsPropertyDsl.() -> Unit =
      {}): CfnTemplate.LegendOptionsProperty {
    val builder = CfnTemplateLegendOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateLineChartAggregatedFieldWellsProperty(block: CfnTemplateLineChartAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnTemplate.LineChartAggregatedFieldWellsProperty {
    val builder = CfnTemplateLineChartAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateLineChartConfigurationProperty(block: CfnTemplateLineChartConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.LineChartConfigurationProperty {
    val builder = CfnTemplateLineChartConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateLineChartDefaultSeriesSettingsProperty(block: CfnTemplateLineChartDefaultSeriesSettingsPropertyDsl.() -> Unit
      = {}): CfnTemplate.LineChartDefaultSeriesSettingsProperty {
    val builder = CfnTemplateLineChartDefaultSeriesSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateLineChartFieldWellsProperty(block: CfnTemplateLineChartFieldWellsPropertyDsl.() -> Unit
      = {}): CfnTemplate.LineChartFieldWellsProperty {
    val builder = CfnTemplateLineChartFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateLineChartLineStyleSettingsProperty(block: CfnTemplateLineChartLineStyleSettingsPropertyDsl.() -> Unit
      = {}): CfnTemplate.LineChartLineStyleSettingsProperty {
    val builder = CfnTemplateLineChartLineStyleSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateLineChartMarkerStyleSettingsProperty(block: CfnTemplateLineChartMarkerStyleSettingsPropertyDsl.() -> Unit
      = {}): CfnTemplate.LineChartMarkerStyleSettingsProperty {
    val builder = CfnTemplateLineChartMarkerStyleSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateLineChartSeriesSettingsProperty(block: CfnTemplateLineChartSeriesSettingsPropertyDsl.() -> Unit
      = {}): CfnTemplate.LineChartSeriesSettingsProperty {
    val builder = CfnTemplateLineChartSeriesSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateLineChartSortConfigurationProperty(block: CfnTemplateLineChartSortConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.LineChartSortConfigurationProperty {
    val builder = CfnTemplateLineChartSortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateLineChartVisualProperty(block: CfnTemplateLineChartVisualPropertyDsl.() -> Unit
      = {}): CfnTemplate.LineChartVisualProperty {
    val builder = CfnTemplateLineChartVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateLineSeriesAxisDisplayOptionsProperty(block: CfnTemplateLineSeriesAxisDisplayOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.LineSeriesAxisDisplayOptionsProperty {
    val builder = CfnTemplateLineSeriesAxisDisplayOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateListControlDisplayOptionsProperty(block: CfnTemplateListControlDisplayOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.ListControlDisplayOptionsProperty {
    val builder = CfnTemplateListControlDisplayOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateListControlSearchOptionsProperty(block: CfnTemplateListControlSearchOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.ListControlSearchOptionsProperty {
    val builder = CfnTemplateListControlSearchOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateListControlSelectAllOptionsProperty(block: CfnTemplateListControlSelectAllOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.ListControlSelectAllOptionsProperty {
    val builder = CfnTemplateListControlSelectAllOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateLoadingAnimationProperty(block: CfnTemplateLoadingAnimationPropertyDsl.() -> Unit
      = {}): CfnTemplate.LoadingAnimationProperty {
    val builder = CfnTemplateLoadingAnimationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateLocalNavigationConfigurationProperty(block: CfnTemplateLocalNavigationConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.LocalNavigationConfigurationProperty {
    val builder = CfnTemplateLocalNavigationConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateLongFormatTextProperty(block: CfnTemplateLongFormatTextPropertyDsl.() -> Unit =
      {}): CfnTemplate.LongFormatTextProperty {
    val builder = CfnTemplateLongFormatTextPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateMappedDataSetParameterProperty(block: CfnTemplateMappedDataSetParameterPropertyDsl.() -> Unit
      = {}): CfnTemplate.MappedDataSetParameterProperty {
    val builder = CfnTemplateMappedDataSetParameterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateMaximumLabelTypeProperty(block: CfnTemplateMaximumLabelTypePropertyDsl.() -> Unit
      = {}): CfnTemplate.MaximumLabelTypeProperty {
    val builder = CfnTemplateMaximumLabelTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateMaximumMinimumComputationProperty(block: CfnTemplateMaximumMinimumComputationPropertyDsl.() -> Unit
      = {}): CfnTemplate.MaximumMinimumComputationProperty {
    val builder = CfnTemplateMaximumMinimumComputationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateMeasureFieldProperty(block: CfnTemplateMeasureFieldPropertyDsl.() -> Unit =
      {}): CfnTemplate.MeasureFieldProperty {
    val builder = CfnTemplateMeasureFieldPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateMetricComparisonComputationProperty(block: CfnTemplateMetricComparisonComputationPropertyDsl.() -> Unit
      = {}): CfnTemplate.MetricComparisonComputationProperty {
    val builder = CfnTemplateMetricComparisonComputationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateMinimumLabelTypeProperty(block: CfnTemplateMinimumLabelTypePropertyDsl.() -> Unit
      = {}): CfnTemplate.MinimumLabelTypeProperty {
    val builder = CfnTemplateMinimumLabelTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateMissingDataConfigurationProperty(block: CfnTemplateMissingDataConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.MissingDataConfigurationProperty {
    val builder = CfnTemplateMissingDataConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateNegativeValueConfigurationProperty(block: CfnTemplateNegativeValueConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.NegativeValueConfigurationProperty {
    val builder = CfnTemplateNegativeValueConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateNullValueFormatConfigurationProperty(block: CfnTemplateNullValueFormatConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.NullValueFormatConfigurationProperty {
    val builder = CfnTemplateNullValueFormatConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateNumberDisplayFormatConfigurationProperty(block: CfnTemplateNumberDisplayFormatConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.NumberDisplayFormatConfigurationProperty {
    val builder = CfnTemplateNumberDisplayFormatConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateNumberFormatConfigurationProperty(block: CfnTemplateNumberFormatConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.NumberFormatConfigurationProperty {
    val builder = CfnTemplateNumberFormatConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateNumericAxisOptionsProperty(block: CfnTemplateNumericAxisOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.NumericAxisOptionsProperty {
    val builder = CfnTemplateNumericAxisOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateNumericEqualityDrillDownFilterProperty(block: CfnTemplateNumericEqualityDrillDownFilterPropertyDsl.() -> Unit
      = {}): CfnTemplate.NumericEqualityDrillDownFilterProperty {
    val builder = CfnTemplateNumericEqualityDrillDownFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateNumericEqualityFilterProperty(block: CfnTemplateNumericEqualityFilterPropertyDsl.() -> Unit
      = {}): CfnTemplate.NumericEqualityFilterProperty {
    val builder = CfnTemplateNumericEqualityFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateNumericFormatConfigurationProperty(block: CfnTemplateNumericFormatConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.NumericFormatConfigurationProperty {
    val builder = CfnTemplateNumericFormatConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateNumericRangeFilterProperty(block: CfnTemplateNumericRangeFilterPropertyDsl.() -> Unit
      = {}): CfnTemplate.NumericRangeFilterProperty {
    val builder = CfnTemplateNumericRangeFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateNumericRangeFilterValueProperty(block: CfnTemplateNumericRangeFilterValuePropertyDsl.() -> Unit
      = {}): CfnTemplate.NumericRangeFilterValueProperty {
    val builder = CfnTemplateNumericRangeFilterValuePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateNumericSeparatorConfigurationProperty(block: CfnTemplateNumericSeparatorConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.NumericSeparatorConfigurationProperty {
    val builder = CfnTemplateNumericSeparatorConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateNumericalAggregationFunctionProperty(block: CfnTemplateNumericalAggregationFunctionPropertyDsl.() -> Unit
      = {}): CfnTemplate.NumericalAggregationFunctionProperty {
    val builder = CfnTemplateNumericalAggregationFunctionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateNumericalDimensionFieldProperty(block: CfnTemplateNumericalDimensionFieldPropertyDsl.() -> Unit
      = {}): CfnTemplate.NumericalDimensionFieldProperty {
    val builder = CfnTemplateNumericalDimensionFieldPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateNumericalMeasureFieldProperty(block: CfnTemplateNumericalMeasureFieldPropertyDsl.() -> Unit
      = {}): CfnTemplate.NumericalMeasureFieldProperty {
    val builder = CfnTemplateNumericalMeasureFieldPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplatePaginationConfigurationProperty(block: CfnTemplatePaginationConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.PaginationConfigurationProperty {
    val builder = CfnTemplatePaginationConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplatePanelConfigurationProperty(block: CfnTemplatePanelConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.PanelConfigurationProperty {
    val builder = CfnTemplatePanelConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplatePanelTitleOptionsProperty(block: CfnTemplatePanelTitleOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.PanelTitleOptionsProperty {
    val builder = CfnTemplatePanelTitleOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateParameterControlProperty(block: CfnTemplateParameterControlPropertyDsl.() -> Unit
      = {}): CfnTemplate.ParameterControlProperty {
    val builder = CfnTemplateParameterControlPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateParameterDateTimePickerControlProperty(block: CfnTemplateParameterDateTimePickerControlPropertyDsl.() -> Unit
      = {}): CfnTemplate.ParameterDateTimePickerControlProperty {
    val builder = CfnTemplateParameterDateTimePickerControlPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateParameterDeclarationProperty(block: CfnTemplateParameterDeclarationPropertyDsl.() -> Unit
      = {}): CfnTemplate.ParameterDeclarationProperty {
    val builder = CfnTemplateParameterDeclarationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateParameterDropDownControlProperty(block: CfnTemplateParameterDropDownControlPropertyDsl.() -> Unit
      = {}): CfnTemplate.ParameterDropDownControlProperty {
    val builder = CfnTemplateParameterDropDownControlPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateParameterListControlProperty(block: CfnTemplateParameterListControlPropertyDsl.() -> Unit
      = {}): CfnTemplate.ParameterListControlProperty {
    val builder = CfnTemplateParameterListControlPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateParameterSelectableValuesProperty(block: CfnTemplateParameterSelectableValuesPropertyDsl.() -> Unit
      = {}): CfnTemplate.ParameterSelectableValuesProperty {
    val builder = CfnTemplateParameterSelectableValuesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateParameterSliderControlProperty(block: CfnTemplateParameterSliderControlPropertyDsl.() -> Unit
      = {}): CfnTemplate.ParameterSliderControlProperty {
    val builder = CfnTemplateParameterSliderControlPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateParameterTextAreaControlProperty(block: CfnTemplateParameterTextAreaControlPropertyDsl.() -> Unit
      = {}): CfnTemplate.ParameterTextAreaControlProperty {
    val builder = CfnTemplateParameterTextAreaControlPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateParameterTextFieldControlProperty(block: CfnTemplateParameterTextFieldControlPropertyDsl.() -> Unit
      = {}): CfnTemplate.ParameterTextFieldControlProperty {
    val builder = CfnTemplateParameterTextFieldControlPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplatePercentVisibleRangeProperty(block: CfnTemplatePercentVisibleRangePropertyDsl.() -> Unit
      = {}): CfnTemplate.PercentVisibleRangeProperty {
    val builder = CfnTemplatePercentVisibleRangePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplatePercentageDisplayFormatConfigurationProperty(block: CfnTemplatePercentageDisplayFormatConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.PercentageDisplayFormatConfigurationProperty {
    val builder = CfnTemplatePercentageDisplayFormatConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplatePercentileAggregationProperty(block: CfnTemplatePercentileAggregationPropertyDsl.() -> Unit
      = {}): CfnTemplate.PercentileAggregationProperty {
    val builder = CfnTemplatePercentileAggregationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplatePeriodOverPeriodComputationProperty(block: CfnTemplatePeriodOverPeriodComputationPropertyDsl.() -> Unit
      = {}): CfnTemplate.PeriodOverPeriodComputationProperty {
    val builder = CfnTemplatePeriodOverPeriodComputationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplatePeriodToDateComputationProperty(block: CfnTemplatePeriodToDateComputationPropertyDsl.() -> Unit
      = {}): CfnTemplate.PeriodToDateComputationProperty {
    val builder = CfnTemplatePeriodToDateComputationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplatePieChartAggregatedFieldWellsProperty(block: CfnTemplatePieChartAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnTemplate.PieChartAggregatedFieldWellsProperty {
    val builder = CfnTemplatePieChartAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplatePieChartConfigurationProperty(block: CfnTemplatePieChartConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.PieChartConfigurationProperty {
    val builder = CfnTemplatePieChartConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplatePieChartFieldWellsProperty(block: CfnTemplatePieChartFieldWellsPropertyDsl.() -> Unit
      = {}): CfnTemplate.PieChartFieldWellsProperty {
    val builder = CfnTemplatePieChartFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplatePieChartSortConfigurationProperty(block: CfnTemplatePieChartSortConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.PieChartSortConfigurationProperty {
    val builder = CfnTemplatePieChartSortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplatePieChartVisualProperty(block: CfnTemplatePieChartVisualPropertyDsl.() -> Unit =
      {}): CfnTemplate.PieChartVisualProperty {
    val builder = CfnTemplatePieChartVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplatePivotFieldSortOptionsProperty(block: CfnTemplatePivotFieldSortOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.PivotFieldSortOptionsProperty {
    val builder = CfnTemplatePivotFieldSortOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplatePivotTableAggregatedFieldWellsProperty(block: CfnTemplatePivotTableAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnTemplate.PivotTableAggregatedFieldWellsProperty {
    val builder = CfnTemplatePivotTableAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplatePivotTableCellConditionalFormattingProperty(block: CfnTemplatePivotTableCellConditionalFormattingPropertyDsl.() -> Unit
      = {}): CfnTemplate.PivotTableCellConditionalFormattingProperty {
    val builder = CfnTemplatePivotTableCellConditionalFormattingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplatePivotTableConditionalFormattingOptionProperty(block: CfnTemplatePivotTableConditionalFormattingOptionPropertyDsl.() -> Unit
      = {}): CfnTemplate.PivotTableConditionalFormattingOptionProperty {
    val builder = CfnTemplatePivotTableConditionalFormattingOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplatePivotTableConditionalFormattingProperty(block: CfnTemplatePivotTableConditionalFormattingPropertyDsl.() -> Unit
      = {}): CfnTemplate.PivotTableConditionalFormattingProperty {
    val builder = CfnTemplatePivotTableConditionalFormattingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplatePivotTableConditionalFormattingScopeProperty(block: CfnTemplatePivotTableConditionalFormattingScopePropertyDsl.() -> Unit
      = {}): CfnTemplate.PivotTableConditionalFormattingScopeProperty {
    val builder = CfnTemplatePivotTableConditionalFormattingScopePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplatePivotTableConfigurationProperty(block: CfnTemplatePivotTableConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.PivotTableConfigurationProperty {
    val builder = CfnTemplatePivotTableConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplatePivotTableDataPathOptionProperty(block: CfnTemplatePivotTableDataPathOptionPropertyDsl.() -> Unit
      = {}): CfnTemplate.PivotTableDataPathOptionProperty {
    val builder = CfnTemplatePivotTableDataPathOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplatePivotTableFieldCollapseStateOptionProperty(block: CfnTemplatePivotTableFieldCollapseStateOptionPropertyDsl.() -> Unit
      = {}): CfnTemplate.PivotTableFieldCollapseStateOptionProperty {
    val builder = CfnTemplatePivotTableFieldCollapseStateOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplatePivotTableFieldCollapseStateTargetProperty(block: CfnTemplatePivotTableFieldCollapseStateTargetPropertyDsl.() -> Unit
      = {}): CfnTemplate.PivotTableFieldCollapseStateTargetProperty {
    val builder = CfnTemplatePivotTableFieldCollapseStateTargetPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplatePivotTableFieldOptionProperty(block: CfnTemplatePivotTableFieldOptionPropertyDsl.() -> Unit
      = {}): CfnTemplate.PivotTableFieldOptionProperty {
    val builder = CfnTemplatePivotTableFieldOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplatePivotTableFieldOptionsProperty(block: CfnTemplatePivotTableFieldOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.PivotTableFieldOptionsProperty {
    val builder = CfnTemplatePivotTableFieldOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplatePivotTableFieldSubtotalOptionsProperty(block: CfnTemplatePivotTableFieldSubtotalOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.PivotTableFieldSubtotalOptionsProperty {
    val builder = CfnTemplatePivotTableFieldSubtotalOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplatePivotTableFieldWellsProperty(block: CfnTemplatePivotTableFieldWellsPropertyDsl.() -> Unit
      = {}): CfnTemplate.PivotTableFieldWellsProperty {
    val builder = CfnTemplatePivotTableFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplatePivotTableOptionsProperty(block: CfnTemplatePivotTableOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.PivotTableOptionsProperty {
    val builder = CfnTemplatePivotTableOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplatePivotTablePaginatedReportOptionsProperty(block: CfnTemplatePivotTablePaginatedReportOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.PivotTablePaginatedReportOptionsProperty {
    val builder = CfnTemplatePivotTablePaginatedReportOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplatePivotTableSortByProperty(block: CfnTemplatePivotTableSortByPropertyDsl.() -> Unit
      = {}): CfnTemplate.PivotTableSortByProperty {
    val builder = CfnTemplatePivotTableSortByPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplatePivotTableSortConfigurationProperty(block: CfnTemplatePivotTableSortConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.PivotTableSortConfigurationProperty {
    val builder = CfnTemplatePivotTableSortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplatePivotTableTotalOptionsProperty(block: CfnTemplatePivotTableTotalOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.PivotTableTotalOptionsProperty {
    val builder = CfnTemplatePivotTableTotalOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplatePivotTableVisualProperty(block: CfnTemplatePivotTableVisualPropertyDsl.() -> Unit
      = {}): CfnTemplate.PivotTableVisualProperty {
    val builder = CfnTemplatePivotTableVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplatePivotTotalOptionsProperty(block: CfnTemplatePivotTotalOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.PivotTotalOptionsProperty {
    val builder = CfnTemplatePivotTotalOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplatePredefinedHierarchyProperty(block: CfnTemplatePredefinedHierarchyPropertyDsl.() -> Unit
      = {}): CfnTemplate.PredefinedHierarchyProperty {
    val builder = CfnTemplatePredefinedHierarchyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateProgressBarOptionsProperty(block: CfnTemplateProgressBarOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.ProgressBarOptionsProperty {
    val builder = CfnTemplateProgressBarOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTemplateProps(block: CfnTemplatePropsDsl.() -> Unit = {}): CfnTemplateProps {
    val builder = CfnTemplatePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateRadarChartAggregatedFieldWellsProperty(block: CfnTemplateRadarChartAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnTemplate.RadarChartAggregatedFieldWellsProperty {
    val builder = CfnTemplateRadarChartAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateRadarChartAreaStyleSettingsProperty(block: CfnTemplateRadarChartAreaStyleSettingsPropertyDsl.() -> Unit
      = {}): CfnTemplate.RadarChartAreaStyleSettingsProperty {
    val builder = CfnTemplateRadarChartAreaStyleSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateRadarChartConfigurationProperty(block: CfnTemplateRadarChartConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.RadarChartConfigurationProperty {
    val builder = CfnTemplateRadarChartConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateRadarChartFieldWellsProperty(block: CfnTemplateRadarChartFieldWellsPropertyDsl.() -> Unit
      = {}): CfnTemplate.RadarChartFieldWellsProperty {
    val builder = CfnTemplateRadarChartFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateRadarChartSeriesSettingsProperty(block: CfnTemplateRadarChartSeriesSettingsPropertyDsl.() -> Unit
      = {}): CfnTemplate.RadarChartSeriesSettingsProperty {
    val builder = CfnTemplateRadarChartSeriesSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateRadarChartSortConfigurationProperty(block: CfnTemplateRadarChartSortConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.RadarChartSortConfigurationProperty {
    val builder = CfnTemplateRadarChartSortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateRadarChartVisualProperty(block: CfnTemplateRadarChartVisualPropertyDsl.() -> Unit
      = {}): CfnTemplate.RadarChartVisualProperty {
    val builder = CfnTemplateRadarChartVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateRangeEndsLabelTypeProperty(block: CfnTemplateRangeEndsLabelTypePropertyDsl.() -> Unit
      = {}): CfnTemplate.RangeEndsLabelTypeProperty {
    val builder = CfnTemplateRangeEndsLabelTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateReferenceLineCustomLabelConfigurationProperty(block: CfnTemplateReferenceLineCustomLabelConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.ReferenceLineCustomLabelConfigurationProperty {
    val builder = CfnTemplateReferenceLineCustomLabelConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateReferenceLineDataConfigurationProperty(block: CfnTemplateReferenceLineDataConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.ReferenceLineDataConfigurationProperty {
    val builder = CfnTemplateReferenceLineDataConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateReferenceLineDynamicDataConfigurationProperty(block: CfnTemplateReferenceLineDynamicDataConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.ReferenceLineDynamicDataConfigurationProperty {
    val builder = CfnTemplateReferenceLineDynamicDataConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateReferenceLineLabelConfigurationProperty(block: CfnTemplateReferenceLineLabelConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.ReferenceLineLabelConfigurationProperty {
    val builder = CfnTemplateReferenceLineLabelConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateReferenceLineProperty(block: CfnTemplateReferenceLinePropertyDsl.() -> Unit =
      {}): CfnTemplate.ReferenceLineProperty {
    val builder = CfnTemplateReferenceLinePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateReferenceLineStaticDataConfigurationProperty(block: CfnTemplateReferenceLineStaticDataConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.ReferenceLineStaticDataConfigurationProperty {
    val builder = CfnTemplateReferenceLineStaticDataConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateReferenceLineStyleConfigurationProperty(block: CfnTemplateReferenceLineStyleConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.ReferenceLineStyleConfigurationProperty {
    val builder = CfnTemplateReferenceLineStyleConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateReferenceLineValueLabelConfigurationProperty(block: CfnTemplateReferenceLineValueLabelConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.ReferenceLineValueLabelConfigurationProperty {
    val builder = CfnTemplateReferenceLineValueLabelConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateRelativeDateTimeControlDisplayOptionsProperty(block: CfnTemplateRelativeDateTimeControlDisplayOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.RelativeDateTimeControlDisplayOptionsProperty {
    val builder = CfnTemplateRelativeDateTimeControlDisplayOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateRelativeDatesFilterProperty(block: CfnTemplateRelativeDatesFilterPropertyDsl.() -> Unit
      = {}): CfnTemplate.RelativeDatesFilterProperty {
    val builder = CfnTemplateRelativeDatesFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateResourcePermissionProperty(block: CfnTemplateResourcePermissionPropertyDsl.() -> Unit
      = {}): CfnTemplate.ResourcePermissionProperty {
    val builder = CfnTemplateResourcePermissionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateRollingDateConfigurationProperty(block: CfnTemplateRollingDateConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.RollingDateConfigurationProperty {
    val builder = CfnTemplateRollingDateConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateRowAlternateColorOptionsProperty(block: CfnTemplateRowAlternateColorOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.RowAlternateColorOptionsProperty {
    val builder = CfnTemplateRowAlternateColorOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateSameSheetTargetVisualConfigurationProperty(block: CfnTemplateSameSheetTargetVisualConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.SameSheetTargetVisualConfigurationProperty {
    val builder = CfnTemplateSameSheetTargetVisualConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateSankeyDiagramAggregatedFieldWellsProperty(block: CfnTemplateSankeyDiagramAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnTemplate.SankeyDiagramAggregatedFieldWellsProperty {
    val builder = CfnTemplateSankeyDiagramAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateSankeyDiagramChartConfigurationProperty(block: CfnTemplateSankeyDiagramChartConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.SankeyDiagramChartConfigurationProperty {
    val builder = CfnTemplateSankeyDiagramChartConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateSankeyDiagramFieldWellsProperty(block: CfnTemplateSankeyDiagramFieldWellsPropertyDsl.() -> Unit
      = {}): CfnTemplate.SankeyDiagramFieldWellsProperty {
    val builder = CfnTemplateSankeyDiagramFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateSankeyDiagramSortConfigurationProperty(block: CfnTemplateSankeyDiagramSortConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.SankeyDiagramSortConfigurationProperty {
    val builder = CfnTemplateSankeyDiagramSortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateSankeyDiagramVisualProperty(block: CfnTemplateSankeyDiagramVisualPropertyDsl.() -> Unit
      = {}): CfnTemplate.SankeyDiagramVisualProperty {
    val builder = CfnTemplateSankeyDiagramVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateScatterPlotCategoricallyAggregatedFieldWellsProperty(block: CfnTemplateScatterPlotCategoricallyAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnTemplate.ScatterPlotCategoricallyAggregatedFieldWellsProperty {
    val builder = CfnTemplateScatterPlotCategoricallyAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateScatterPlotConfigurationProperty(block: CfnTemplateScatterPlotConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.ScatterPlotConfigurationProperty {
    val builder = CfnTemplateScatterPlotConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateScatterPlotFieldWellsProperty(block: CfnTemplateScatterPlotFieldWellsPropertyDsl.() -> Unit
      = {}): CfnTemplate.ScatterPlotFieldWellsProperty {
    val builder = CfnTemplateScatterPlotFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateScatterPlotUnaggregatedFieldWellsProperty(block: CfnTemplateScatterPlotUnaggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnTemplate.ScatterPlotUnaggregatedFieldWellsProperty {
    val builder = CfnTemplateScatterPlotUnaggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateScatterPlotVisualProperty(block: CfnTemplateScatterPlotVisualPropertyDsl.() -> Unit
      = {}): CfnTemplate.ScatterPlotVisualProperty {
    val builder = CfnTemplateScatterPlotVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateScrollBarOptionsProperty(block: CfnTemplateScrollBarOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.ScrollBarOptionsProperty {
    val builder = CfnTemplateScrollBarOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateSecondaryValueOptionsProperty(block: CfnTemplateSecondaryValueOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.SecondaryValueOptionsProperty {
    val builder = CfnTemplateSecondaryValueOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateSectionAfterPageBreakProperty(block: CfnTemplateSectionAfterPageBreakPropertyDsl.() -> Unit
      = {}): CfnTemplate.SectionAfterPageBreakProperty {
    val builder = CfnTemplateSectionAfterPageBreakPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateSectionBasedLayoutCanvasSizeOptionsProperty(block: CfnTemplateSectionBasedLayoutCanvasSizeOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.SectionBasedLayoutCanvasSizeOptionsProperty {
    val builder = CfnTemplateSectionBasedLayoutCanvasSizeOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateSectionBasedLayoutConfigurationProperty(block: CfnTemplateSectionBasedLayoutConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.SectionBasedLayoutConfigurationProperty {
    val builder = CfnTemplateSectionBasedLayoutConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateSectionBasedLayoutPaperCanvasSizeOptionsProperty(block: CfnTemplateSectionBasedLayoutPaperCanvasSizeOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.SectionBasedLayoutPaperCanvasSizeOptionsProperty {
    val builder = CfnTemplateSectionBasedLayoutPaperCanvasSizeOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateSectionLayoutConfigurationProperty(block: CfnTemplateSectionLayoutConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.SectionLayoutConfigurationProperty {
    val builder = CfnTemplateSectionLayoutConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateSectionPageBreakConfigurationProperty(block: CfnTemplateSectionPageBreakConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.SectionPageBreakConfigurationProperty {
    val builder = CfnTemplateSectionPageBreakConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateSectionStyleProperty(block: CfnTemplateSectionStylePropertyDsl.() -> Unit =
      {}): CfnTemplate.SectionStyleProperty {
    val builder = CfnTemplateSectionStylePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateSelectedSheetsFilterScopeConfigurationProperty(block: CfnTemplateSelectedSheetsFilterScopeConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.SelectedSheetsFilterScopeConfigurationProperty {
    val builder = CfnTemplateSelectedSheetsFilterScopeConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTemplateSeriesItemProperty(block: CfnTemplateSeriesItemPropertyDsl.() -> Unit
      = {}): CfnTemplate.SeriesItemProperty {
    val builder = CfnTemplateSeriesItemPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateSetParameterValueConfigurationProperty(block: CfnTemplateSetParameterValueConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.SetParameterValueConfigurationProperty {
    val builder = CfnTemplateSetParameterValueConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateShapeConditionalFormatProperty(block: CfnTemplateShapeConditionalFormatPropertyDsl.() -> Unit
      = {}): CfnTemplate.ShapeConditionalFormatProperty {
    val builder = CfnTemplateShapeConditionalFormatPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateSheetControlLayoutConfigurationProperty(block: CfnTemplateSheetControlLayoutConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.SheetControlLayoutConfigurationProperty {
    val builder = CfnTemplateSheetControlLayoutConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateSheetControlLayoutProperty(block: CfnTemplateSheetControlLayoutPropertyDsl.() -> Unit
      = {}): CfnTemplate.SheetControlLayoutProperty {
    val builder = CfnTemplateSheetControlLayoutPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateSheetDefinitionProperty(block: CfnTemplateSheetDefinitionPropertyDsl.() -> Unit
      = {}): CfnTemplate.SheetDefinitionProperty {
    val builder = CfnTemplateSheetDefinitionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateSheetElementConfigurationOverridesProperty(block: CfnTemplateSheetElementConfigurationOverridesPropertyDsl.() -> Unit
      = {}): CfnTemplate.SheetElementConfigurationOverridesProperty {
    val builder = CfnTemplateSheetElementConfigurationOverridesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateSheetElementRenderingRuleProperty(block: CfnTemplateSheetElementRenderingRulePropertyDsl.() -> Unit
      = {}): CfnTemplate.SheetElementRenderingRuleProperty {
    val builder = CfnTemplateSheetElementRenderingRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTemplateSheetProperty(block: CfnTemplateSheetPropertyDsl.() -> Unit = {}):
      CfnTemplate.SheetProperty {
    val builder = CfnTemplateSheetPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateSheetTextBoxProperty(block: CfnTemplateSheetTextBoxPropertyDsl.() -> Unit =
      {}): CfnTemplate.SheetTextBoxProperty {
    val builder = CfnTemplateSheetTextBoxPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateSheetVisualScopingConfigurationProperty(block: CfnTemplateSheetVisualScopingConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.SheetVisualScopingConfigurationProperty {
    val builder = CfnTemplateSheetVisualScopingConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateShortFormatTextProperty(block: CfnTemplateShortFormatTextPropertyDsl.() -> Unit
      = {}): CfnTemplate.ShortFormatTextProperty {
    val builder = CfnTemplateShortFormatTextPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateSimpleClusterMarkerProperty(block: CfnTemplateSimpleClusterMarkerPropertyDsl.() -> Unit
      = {}): CfnTemplate.SimpleClusterMarkerProperty {
    val builder = CfnTemplateSimpleClusterMarkerPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateSliderControlDisplayOptionsProperty(block: CfnTemplateSliderControlDisplayOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.SliderControlDisplayOptionsProperty {
    val builder = CfnTemplateSliderControlDisplayOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateSmallMultiplesOptionsProperty(block: CfnTemplateSmallMultiplesOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.SmallMultiplesOptionsProperty {
    val builder = CfnTemplateSmallMultiplesOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTemplateSpacingProperty(block: CfnTemplateSpacingPropertyDsl.() -> Unit =
      {}): CfnTemplate.SpacingProperty {
    val builder = CfnTemplateSpacingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateStringDefaultValuesProperty(block: CfnTemplateStringDefaultValuesPropertyDsl.() -> Unit
      = {}): CfnTemplate.StringDefaultValuesProperty {
    val builder = CfnTemplateStringDefaultValuesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateStringFormatConfigurationProperty(block: CfnTemplateStringFormatConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.StringFormatConfigurationProperty {
    val builder = CfnTemplateStringFormatConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateStringParameterDeclarationProperty(block: CfnTemplateStringParameterDeclarationPropertyDsl.() -> Unit
      = {}): CfnTemplate.StringParameterDeclarationProperty {
    val builder = CfnTemplateStringParameterDeclarationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateStringValueWhenUnsetConfigurationProperty(block: CfnTemplateStringValueWhenUnsetConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.StringValueWhenUnsetConfigurationProperty {
    val builder = CfnTemplateStringValueWhenUnsetConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateSubtotalOptionsProperty(block: CfnTemplateSubtotalOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.SubtotalOptionsProperty {
    val builder = CfnTemplateSubtotalOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTableAggregatedFieldWellsProperty(block: CfnTemplateTableAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnTemplate.TableAggregatedFieldWellsProperty {
    val builder = CfnTemplateTableAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTableBorderOptionsProperty(block: CfnTemplateTableBorderOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.TableBorderOptionsProperty {
    val builder = CfnTemplateTableBorderOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTableCellConditionalFormattingProperty(block: CfnTemplateTableCellConditionalFormattingPropertyDsl.() -> Unit
      = {}): CfnTemplate.TableCellConditionalFormattingProperty {
    val builder = CfnTemplateTableCellConditionalFormattingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTableCellImageSizingConfigurationProperty(block: CfnTemplateTableCellImageSizingConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.TableCellImageSizingConfigurationProperty {
    val builder = CfnTemplateTableCellImageSizingConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTableCellStyleProperty(block: CfnTemplateTableCellStylePropertyDsl.() -> Unit =
      {}): CfnTemplate.TableCellStyleProperty {
    val builder = CfnTemplateTableCellStylePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTableConditionalFormattingOptionProperty(block: CfnTemplateTableConditionalFormattingOptionPropertyDsl.() -> Unit
      = {}): CfnTemplate.TableConditionalFormattingOptionProperty {
    val builder = CfnTemplateTableConditionalFormattingOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTableConditionalFormattingProperty(block: CfnTemplateTableConditionalFormattingPropertyDsl.() -> Unit
      = {}): CfnTemplate.TableConditionalFormattingProperty {
    val builder = CfnTemplateTableConditionalFormattingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTableConfigurationProperty(block: CfnTemplateTableConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.TableConfigurationProperty {
    val builder = CfnTemplateTableConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTableFieldCustomIconContentProperty(block: CfnTemplateTableFieldCustomIconContentPropertyDsl.() -> Unit
      = {}): CfnTemplate.TableFieldCustomIconContentProperty {
    val builder = CfnTemplateTableFieldCustomIconContentPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTableFieldCustomTextContentProperty(block: CfnTemplateTableFieldCustomTextContentPropertyDsl.() -> Unit
      = {}): CfnTemplate.TableFieldCustomTextContentProperty {
    val builder = CfnTemplateTableFieldCustomTextContentPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTableFieldImageConfigurationProperty(block: CfnTemplateTableFieldImageConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.TableFieldImageConfigurationProperty {
    val builder = CfnTemplateTableFieldImageConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTableFieldLinkConfigurationProperty(block: CfnTemplateTableFieldLinkConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.TableFieldLinkConfigurationProperty {
    val builder = CfnTemplateTableFieldLinkConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTableFieldLinkContentConfigurationProperty(block: CfnTemplateTableFieldLinkContentConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.TableFieldLinkContentConfigurationProperty {
    val builder = CfnTemplateTableFieldLinkContentConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTableFieldOptionProperty(block: CfnTemplateTableFieldOptionPropertyDsl.() -> Unit
      = {}): CfnTemplate.TableFieldOptionProperty {
    val builder = CfnTemplateTableFieldOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTableFieldOptionsProperty(block: CfnTemplateTableFieldOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.TableFieldOptionsProperty {
    val builder = CfnTemplateTableFieldOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTableFieldURLConfigurationProperty(block: CfnTemplateTableFieldURLConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.TableFieldURLConfigurationProperty {
    val builder = CfnTemplateTableFieldURLConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTableFieldWellsProperty(block: CfnTemplateTableFieldWellsPropertyDsl.() -> Unit
      = {}): CfnTemplate.TableFieldWellsProperty {
    val builder = CfnTemplateTableFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTableInlineVisualizationProperty(block: CfnTemplateTableInlineVisualizationPropertyDsl.() -> Unit
      = {}): CfnTemplate.TableInlineVisualizationProperty {
    val builder = CfnTemplateTableInlineVisualizationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTableOptionsProperty(block: CfnTemplateTableOptionsPropertyDsl.() -> Unit =
      {}): CfnTemplate.TableOptionsProperty {
    val builder = CfnTemplateTableOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTablePaginatedReportOptionsProperty(block: CfnTemplateTablePaginatedReportOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.TablePaginatedReportOptionsProperty {
    val builder = CfnTemplateTablePaginatedReportOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTableRowConditionalFormattingProperty(block: CfnTemplateTableRowConditionalFormattingPropertyDsl.() -> Unit
      = {}): CfnTemplate.TableRowConditionalFormattingProperty {
    val builder = CfnTemplateTableRowConditionalFormattingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTableSideBorderOptionsProperty(block: CfnTemplateTableSideBorderOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.TableSideBorderOptionsProperty {
    val builder = CfnTemplateTableSideBorderOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTableSortConfigurationProperty(block: CfnTemplateTableSortConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.TableSortConfigurationProperty {
    val builder = CfnTemplateTableSortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTableUnaggregatedFieldWellsProperty(block: CfnTemplateTableUnaggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnTemplate.TableUnaggregatedFieldWellsProperty {
    val builder = CfnTemplateTableUnaggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTableVisualProperty(block: CfnTemplateTableVisualPropertyDsl.() -> Unit = {}):
      CfnTemplate.TableVisualProperty {
    val builder = CfnTemplateTableVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTemplateErrorProperty(block: CfnTemplateTemplateErrorPropertyDsl.() -> Unit =
      {}): CfnTemplate.TemplateErrorProperty {
    val builder = CfnTemplateTemplateErrorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTemplateSourceAnalysisProperty(block: CfnTemplateTemplateSourceAnalysisPropertyDsl.() -> Unit
      = {}): CfnTemplate.TemplateSourceAnalysisProperty {
    val builder = CfnTemplateTemplateSourceAnalysisPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTemplateSourceEntityProperty(block: CfnTemplateTemplateSourceEntityPropertyDsl.() -> Unit
      = {}): CfnTemplate.TemplateSourceEntityProperty {
    val builder = CfnTemplateTemplateSourceEntityPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTemplateSourceTemplateProperty(block: CfnTemplateTemplateSourceTemplatePropertyDsl.() -> Unit
      = {}): CfnTemplate.TemplateSourceTemplateProperty {
    val builder = CfnTemplateTemplateSourceTemplatePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTemplateVersionDefinitionProperty(block: CfnTemplateTemplateVersionDefinitionPropertyDsl.() -> Unit
      = {}): CfnTemplate.TemplateVersionDefinitionProperty {
    val builder = CfnTemplateTemplateVersionDefinitionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTemplateVersionProperty(block: CfnTemplateTemplateVersionPropertyDsl.() -> Unit
      = {}): CfnTemplate.TemplateVersionProperty {
    val builder = CfnTemplateTemplateVersionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTextAreaControlDisplayOptionsProperty(block: CfnTemplateTextAreaControlDisplayOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.TextAreaControlDisplayOptionsProperty {
    val builder = CfnTemplateTextAreaControlDisplayOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTextConditionalFormatProperty(block: CfnTemplateTextConditionalFormatPropertyDsl.() -> Unit
      = {}): CfnTemplate.TextConditionalFormatProperty {
    val builder = CfnTemplateTextConditionalFormatPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTextControlPlaceholderOptionsProperty(block: CfnTemplateTextControlPlaceholderOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.TextControlPlaceholderOptionsProperty {
    val builder = CfnTemplateTextControlPlaceholderOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTextFieldControlDisplayOptionsProperty(block: CfnTemplateTextFieldControlDisplayOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.TextFieldControlDisplayOptionsProperty {
    val builder = CfnTemplateTextFieldControlDisplayOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateThousandSeparatorOptionsProperty(block: CfnTemplateThousandSeparatorOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.ThousandSeparatorOptionsProperty {
    val builder = CfnTemplateThousandSeparatorOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTimeBasedForecastPropertiesProperty(block: CfnTemplateTimeBasedForecastPropertiesPropertyDsl.() -> Unit
      = {}): CfnTemplate.TimeBasedForecastPropertiesProperty {
    val builder = CfnTemplateTimeBasedForecastPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTimeEqualityFilterProperty(block: CfnTemplateTimeEqualityFilterPropertyDsl.() -> Unit
      = {}): CfnTemplate.TimeEqualityFilterProperty {
    val builder = CfnTemplateTimeEqualityFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTimeRangeDrillDownFilterProperty(block: CfnTemplateTimeRangeDrillDownFilterPropertyDsl.() -> Unit
      = {}): CfnTemplate.TimeRangeDrillDownFilterProperty {
    val builder = CfnTemplateTimeRangeDrillDownFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTimeRangeFilterProperty(block: CfnTemplateTimeRangeFilterPropertyDsl.() -> Unit
      = {}): CfnTemplate.TimeRangeFilterProperty {
    val builder = CfnTemplateTimeRangeFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTimeRangeFilterValueProperty(block: CfnTemplateTimeRangeFilterValuePropertyDsl.() -> Unit
      = {}): CfnTemplate.TimeRangeFilterValueProperty {
    val builder = CfnTemplateTimeRangeFilterValuePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTooltipItemProperty(block: CfnTemplateTooltipItemPropertyDsl.() -> Unit = {}):
      CfnTemplate.TooltipItemProperty {
    val builder = CfnTemplateTooltipItemPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTooltipOptionsProperty(block: CfnTemplateTooltipOptionsPropertyDsl.() -> Unit =
      {}): CfnTemplate.TooltipOptionsProperty {
    val builder = CfnTemplateTooltipOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTopBottomFilterProperty(block: CfnTemplateTopBottomFilterPropertyDsl.() -> Unit
      = {}): CfnTemplate.TopBottomFilterProperty {
    val builder = CfnTemplateTopBottomFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTopBottomMoversComputationProperty(block: CfnTemplateTopBottomMoversComputationPropertyDsl.() -> Unit
      = {}): CfnTemplate.TopBottomMoversComputationProperty {
    val builder = CfnTemplateTopBottomMoversComputationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTopBottomRankedComputationProperty(block: CfnTemplateTopBottomRankedComputationPropertyDsl.() -> Unit
      = {}): CfnTemplate.TopBottomRankedComputationProperty {
    val builder = CfnTemplateTopBottomRankedComputationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTotalAggregationComputationProperty(block: CfnTemplateTotalAggregationComputationPropertyDsl.() -> Unit
      = {}): CfnTemplate.TotalAggregationComputationProperty {
    val builder = CfnTemplateTotalAggregationComputationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTotalOptionsProperty(block: CfnTemplateTotalOptionsPropertyDsl.() -> Unit =
      {}): CfnTemplate.TotalOptionsProperty {
    val builder = CfnTemplateTotalOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTreeMapAggregatedFieldWellsProperty(block: CfnTemplateTreeMapAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnTemplate.TreeMapAggregatedFieldWellsProperty {
    val builder = CfnTemplateTreeMapAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTreeMapConfigurationProperty(block: CfnTemplateTreeMapConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.TreeMapConfigurationProperty {
    val builder = CfnTemplateTreeMapConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTreeMapFieldWellsProperty(block: CfnTemplateTreeMapFieldWellsPropertyDsl.() -> Unit
      = {}): CfnTemplate.TreeMapFieldWellsProperty {
    val builder = CfnTemplateTreeMapFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTreeMapSortConfigurationProperty(block: CfnTemplateTreeMapSortConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.TreeMapSortConfigurationProperty {
    val builder = CfnTemplateTreeMapSortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTreeMapVisualProperty(block: CfnTemplateTreeMapVisualPropertyDsl.() -> Unit =
      {}): CfnTemplate.TreeMapVisualProperty {
    val builder = CfnTemplateTreeMapVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateTrendArrowOptionsProperty(block: CfnTemplateTrendArrowOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.TrendArrowOptionsProperty {
    val builder = CfnTemplateTrendArrowOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateUnaggregatedFieldProperty(block: CfnTemplateUnaggregatedFieldPropertyDsl.() -> Unit
      = {}): CfnTemplate.UnaggregatedFieldProperty {
    val builder = CfnTemplateUnaggregatedFieldPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateUniqueValuesComputationProperty(block: CfnTemplateUniqueValuesComputationPropertyDsl.() -> Unit
      = {}): CfnTemplate.UniqueValuesComputationProperty {
    val builder = CfnTemplateUniqueValuesComputationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateVisibleRangeOptionsProperty(block: CfnTemplateVisibleRangeOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.VisibleRangeOptionsProperty {
    val builder = CfnTemplateVisibleRangeOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateVisualCustomActionOperationProperty(block: CfnTemplateVisualCustomActionOperationPropertyDsl.() -> Unit
      = {}): CfnTemplate.VisualCustomActionOperationProperty {
    val builder = CfnTemplateVisualCustomActionOperationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateVisualCustomActionProperty(block: CfnTemplateVisualCustomActionPropertyDsl.() -> Unit
      = {}): CfnTemplate.VisualCustomActionProperty {
    val builder = CfnTemplateVisualCustomActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateVisualPaletteProperty(block: CfnTemplateVisualPalettePropertyDsl.() -> Unit =
      {}): CfnTemplate.VisualPaletteProperty {
    val builder = CfnTemplateVisualPalettePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTemplateVisualProperty(block: CfnTemplateVisualPropertyDsl.() -> Unit = {}):
      CfnTemplate.VisualProperty {
    val builder = CfnTemplateVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateVisualSubtitleLabelOptionsProperty(block: CfnTemplateVisualSubtitleLabelOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.VisualSubtitleLabelOptionsProperty {
    val builder = CfnTemplateVisualSubtitleLabelOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateVisualTitleLabelOptionsProperty(block: CfnTemplateVisualTitleLabelOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.VisualTitleLabelOptionsProperty {
    val builder = CfnTemplateVisualTitleLabelOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateWaterfallChartAggregatedFieldWellsProperty(block: CfnTemplateWaterfallChartAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnTemplate.WaterfallChartAggregatedFieldWellsProperty {
    val builder = CfnTemplateWaterfallChartAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateWaterfallChartConfigurationProperty(block: CfnTemplateWaterfallChartConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.WaterfallChartConfigurationProperty {
    val builder = CfnTemplateWaterfallChartConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateWaterfallChartFieldWellsProperty(block: CfnTemplateWaterfallChartFieldWellsPropertyDsl.() -> Unit
      = {}): CfnTemplate.WaterfallChartFieldWellsProperty {
    val builder = CfnTemplateWaterfallChartFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateWaterfallChartOptionsProperty(block: CfnTemplateWaterfallChartOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.WaterfallChartOptionsProperty {
    val builder = CfnTemplateWaterfallChartOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateWaterfallChartSortConfigurationProperty(block: CfnTemplateWaterfallChartSortConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.WaterfallChartSortConfigurationProperty {
    val builder = CfnTemplateWaterfallChartSortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateWaterfallVisualProperty(block: CfnTemplateWaterfallVisualPropertyDsl.() -> Unit
      = {}): CfnTemplate.WaterfallVisualProperty {
    val builder = CfnTemplateWaterfallVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateWhatIfPointScenarioProperty(block: CfnTemplateWhatIfPointScenarioPropertyDsl.() -> Unit
      = {}): CfnTemplate.WhatIfPointScenarioProperty {
    val builder = CfnTemplateWhatIfPointScenarioPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateWhatIfRangeScenarioProperty(block: CfnTemplateWhatIfRangeScenarioPropertyDsl.() -> Unit
      = {}): CfnTemplate.WhatIfRangeScenarioProperty {
    val builder = CfnTemplateWhatIfRangeScenarioPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateWordCloudAggregatedFieldWellsProperty(block: CfnTemplateWordCloudAggregatedFieldWellsPropertyDsl.() -> Unit
      = {}): CfnTemplate.WordCloudAggregatedFieldWellsProperty {
    val builder = CfnTemplateWordCloudAggregatedFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateWordCloudChartConfigurationProperty(block: CfnTemplateWordCloudChartConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.WordCloudChartConfigurationProperty {
    val builder = CfnTemplateWordCloudChartConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateWordCloudFieldWellsProperty(block: CfnTemplateWordCloudFieldWellsPropertyDsl.() -> Unit
      = {}): CfnTemplate.WordCloudFieldWellsProperty {
    val builder = CfnTemplateWordCloudFieldWellsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateWordCloudOptionsProperty(block: CfnTemplateWordCloudOptionsPropertyDsl.() -> Unit
      = {}): CfnTemplate.WordCloudOptionsProperty {
    val builder = CfnTemplateWordCloudOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateWordCloudSortConfigurationProperty(block: CfnTemplateWordCloudSortConfigurationPropertyDsl.() -> Unit
      = {}): CfnTemplate.WordCloudSortConfigurationProperty {
    val builder = CfnTemplateWordCloudSortConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTemplateWordCloudVisualProperty(block: CfnTemplateWordCloudVisualPropertyDsl.() -> Unit
      = {}): CfnTemplate.WordCloudVisualProperty {
    val builder = CfnTemplateWordCloudVisualPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTheme(
    scope: Construct,
    id: String,
    block: CfnThemeDsl.() -> Unit = {},
  ): CfnTheme {
    val builder = CfnThemeDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnThemeBorderStyleProperty(block: CfnThemeBorderStylePropertyDsl.() -> Unit =
      {}): CfnTheme.BorderStyleProperty {
    val builder = CfnThemeBorderStylePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnThemeDataColorPaletteProperty(block: CfnThemeDataColorPalettePropertyDsl.() -> Unit =
      {}): CfnTheme.DataColorPaletteProperty {
    val builder = CfnThemeDataColorPalettePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnThemeFontProperty(block: CfnThemeFontPropertyDsl.() -> Unit = {}):
      CfnTheme.FontProperty {
    val builder = CfnThemeFontPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnThemeGutterStyleProperty(block: CfnThemeGutterStylePropertyDsl.() -> Unit =
      {}): CfnTheme.GutterStyleProperty {
    val builder = CfnThemeGutterStylePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnThemeMarginStyleProperty(block: CfnThemeMarginStylePropertyDsl.() -> Unit =
      {}): CfnTheme.MarginStyleProperty {
    val builder = CfnThemeMarginStylePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnThemeProps(block: CfnThemePropsDsl.() -> Unit = {}): CfnThemeProps {
    val builder = CfnThemePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnThemeResourcePermissionProperty(block: CfnThemeResourcePermissionPropertyDsl.() -> Unit
      = {}): CfnTheme.ResourcePermissionProperty {
    val builder = CfnThemeResourcePermissionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnThemeSheetStyleProperty(block: CfnThemeSheetStylePropertyDsl.() -> Unit =
      {}): CfnTheme.SheetStyleProperty {
    val builder = CfnThemeSheetStylePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnThemeThemeConfigurationProperty(block: CfnThemeThemeConfigurationPropertyDsl.() -> Unit
      = {}): CfnTheme.ThemeConfigurationProperty {
    val builder = CfnThemeThemeConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnThemeThemeErrorProperty(block: CfnThemeThemeErrorPropertyDsl.() -> Unit =
      {}): CfnTheme.ThemeErrorProperty {
    val builder = CfnThemeThemeErrorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnThemeThemeVersionProperty(block: CfnThemeThemeVersionPropertyDsl.() -> Unit =
      {}): CfnTheme.ThemeVersionProperty {
    val builder = CfnThemeThemeVersionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnThemeTileLayoutStyleProperty(block: CfnThemeTileLayoutStylePropertyDsl.() -> Unit =
      {}): CfnTheme.TileLayoutStyleProperty {
    val builder = CfnThemeTileLayoutStylePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnThemeTileStyleProperty(block: CfnThemeTileStylePropertyDsl.() -> Unit = {}):
      CfnTheme.TileStyleProperty {
    val builder = CfnThemeTileStylePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnThemeTypographyProperty(block: CfnThemeTypographyPropertyDsl.() -> Unit =
      {}): CfnTheme.TypographyProperty {
    val builder = CfnThemeTypographyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnThemeUIColorPaletteProperty(block: CfnThemeUIColorPalettePropertyDsl.() -> Unit = {}):
      CfnTheme.UIColorPaletteProperty {
    val builder = CfnThemeUIColorPalettePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTopic(
    scope: Construct,
    id: String,
    block: CfnTopicDsl.() -> Unit = {},
  ): CfnTopic {
    val builder = CfnTopicDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTopicCellValueSynonymProperty(block: CfnTopicCellValueSynonymPropertyDsl.() -> Unit =
      {}): CfnTopic.CellValueSynonymProperty {
    val builder = CfnTopicCellValueSynonymPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTopicCollectiveConstantProperty(block: CfnTopicCollectiveConstantPropertyDsl.() -> Unit
      = {}): CfnTopic.CollectiveConstantProperty {
    val builder = CfnTopicCollectiveConstantPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTopicComparativeOrderProperty(block: CfnTopicComparativeOrderPropertyDsl.() -> Unit =
      {}): CfnTopic.ComparativeOrderProperty {
    val builder = CfnTopicComparativeOrderPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTopicDataAggregationProperty(block: CfnTopicDataAggregationPropertyDsl.() -> Unit =
      {}): CfnTopic.DataAggregationProperty {
    val builder = CfnTopicDataAggregationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTopicDatasetMetadataProperty(block: CfnTopicDatasetMetadataPropertyDsl.() -> Unit =
      {}): CfnTopic.DatasetMetadataProperty {
    val builder = CfnTopicDatasetMetadataPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTopicDefaultFormattingProperty(block: CfnTopicDefaultFormattingPropertyDsl.() -> Unit =
      {}): CfnTopic.DefaultFormattingProperty {
    val builder = CfnTopicDefaultFormattingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTopicDisplayFormatOptionsProperty(block: CfnTopicDisplayFormatOptionsPropertyDsl.() -> Unit
      = {}): CfnTopic.DisplayFormatOptionsProperty {
    val builder = CfnTopicDisplayFormatOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTopicNamedEntityDefinitionMetricProperty(block: CfnTopicNamedEntityDefinitionMetricPropertyDsl.() -> Unit
      = {}): CfnTopic.NamedEntityDefinitionMetricProperty {
    val builder = CfnTopicNamedEntityDefinitionMetricPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTopicNamedEntityDefinitionProperty(block: CfnTopicNamedEntityDefinitionPropertyDsl.() -> Unit
      = {}): CfnTopic.NamedEntityDefinitionProperty {
    val builder = CfnTopicNamedEntityDefinitionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTopicNegativeFormatProperty(block: CfnTopicNegativeFormatPropertyDsl.() -> Unit = {}):
      CfnTopic.NegativeFormatProperty {
    val builder = CfnTopicNegativeFormatPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTopicProps(block: CfnTopicPropsDsl.() -> Unit = {}): CfnTopicProps {
    val builder = CfnTopicPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTopicRangeConstantProperty(block: CfnTopicRangeConstantPropertyDsl.() -> Unit
      = {}): CfnTopic.RangeConstantProperty {
    val builder = CfnTopicRangeConstantPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTopicSemanticEntityTypeProperty(block: CfnTopicSemanticEntityTypePropertyDsl.() -> Unit
      = {}): CfnTopic.SemanticEntityTypeProperty {
    val builder = CfnTopicSemanticEntityTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTopicSemanticTypeProperty(block: CfnTopicSemanticTypePropertyDsl.() -> Unit =
      {}): CfnTopic.SemanticTypeProperty {
    val builder = CfnTopicSemanticTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTopicTopicCalculatedFieldProperty(block: CfnTopicTopicCalculatedFieldPropertyDsl.() -> Unit
      = {}): CfnTopic.TopicCalculatedFieldProperty {
    val builder = CfnTopicTopicCalculatedFieldPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTopicTopicCategoryFilterConstantProperty(block: CfnTopicTopicCategoryFilterConstantPropertyDsl.() -> Unit
      = {}): CfnTopic.TopicCategoryFilterConstantProperty {
    val builder = CfnTopicTopicCategoryFilterConstantPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTopicTopicCategoryFilterProperty(block: CfnTopicTopicCategoryFilterPropertyDsl.() -> Unit
      = {}): CfnTopic.TopicCategoryFilterProperty {
    val builder = CfnTopicTopicCategoryFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTopicTopicColumnProperty(block: CfnTopicTopicColumnPropertyDsl.() -> Unit =
      {}): CfnTopic.TopicColumnProperty {
    val builder = CfnTopicTopicColumnPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTopicTopicDateRangeFilterProperty(block: CfnTopicTopicDateRangeFilterPropertyDsl.() -> Unit
      = {}): CfnTopic.TopicDateRangeFilterProperty {
    val builder = CfnTopicTopicDateRangeFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTopicTopicFilterProperty(block: CfnTopicTopicFilterPropertyDsl.() -> Unit =
      {}): CfnTopic.TopicFilterProperty {
    val builder = CfnTopicTopicFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTopicTopicNamedEntityProperty(block: CfnTopicTopicNamedEntityPropertyDsl.() -> Unit =
      {}): CfnTopic.TopicNamedEntityProperty {
    val builder = CfnTopicTopicNamedEntityPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTopicTopicNumericEqualityFilterProperty(block: CfnTopicTopicNumericEqualityFilterPropertyDsl.() -> Unit
      = {}): CfnTopic.TopicNumericEqualityFilterProperty {
    val builder = CfnTopicTopicNumericEqualityFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTopicTopicNumericRangeFilterProperty(block: CfnTopicTopicNumericRangeFilterPropertyDsl.() -> Unit
      = {}): CfnTopic.TopicNumericRangeFilterProperty {
    val builder = CfnTopicTopicNumericRangeFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTopicTopicRangeFilterConstantProperty(block: CfnTopicTopicRangeFilterConstantPropertyDsl.() -> Unit
      = {}): CfnTopic.TopicRangeFilterConstantProperty {
    val builder = CfnTopicTopicRangeFilterConstantPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTopicTopicRelativeDateFilterProperty(block: CfnTopicTopicRelativeDateFilterPropertyDsl.() -> Unit
      = {}): CfnTopic.TopicRelativeDateFilterProperty {
    val builder = CfnTopicTopicRelativeDateFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTopicTopicSingularFilterConstantProperty(block: CfnTopicTopicSingularFilterConstantPropertyDsl.() -> Unit
      = {}): CfnTopic.TopicSingularFilterConstantProperty {
    val builder = CfnTopicTopicSingularFilterConstantPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVPCConnection(
    scope: Construct,
    id: String,
    block: CfnVPCConnectionDsl.() -> Unit = {},
  ): CfnVPCConnection {
    val builder = CfnVPCConnectionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnVPCConnectionNetworkInterfaceProperty(block: CfnVPCConnectionNetworkInterfacePropertyDsl.() -> Unit
      = {}): CfnVPCConnection.NetworkInterfaceProperty {
    val builder = CfnVPCConnectionNetworkInterfacePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVPCConnectionProps(block: CfnVPCConnectionPropsDsl.() -> Unit = {}):
      CfnVPCConnectionProps {
    val builder = CfnVPCConnectionPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
