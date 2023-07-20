@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.databrew

import software.amazon.awscdk.services.databrew.CfnDataset
import software.amazon.awscdk.services.databrew.CfnDatasetProps
import software.amazon.awscdk.services.databrew.CfnJob
import software.amazon.awscdk.services.databrew.CfnJobProps
import software.amazon.awscdk.services.databrew.CfnProject
import software.amazon.awscdk.services.databrew.CfnProjectProps
import software.amazon.awscdk.services.databrew.CfnRecipe
import software.amazon.awscdk.services.databrew.CfnRecipeProps
import software.amazon.awscdk.services.databrew.CfnRuleset
import software.amazon.awscdk.services.databrew.CfnRulesetProps
import software.amazon.awscdk.services.databrew.CfnSchedule
import software.amazon.awscdk.services.databrew.CfnScheduleProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object databrew {
    public inline fun cfnDataset(
        scope: Construct,
        id: String,
        block: CfnDatasetDsl.() -> Unit = {},
    ): CfnDataset {
        val builder = CfnDatasetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDatasetCsvOptionsProperty(
        block: CfnDatasetCsvOptionsPropertyDsl.() -> Unit =
            {},
    ): CfnDataset.CsvOptionsProperty {
        val builder = CfnDatasetCsvOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDatasetDataCatalogInputDefinitionProperty(
        block: CfnDatasetDataCatalogInputDefinitionPropertyDsl.() -> Unit =
            {},
    ): CfnDataset.DataCatalogInputDefinitionProperty {
        val builder = CfnDatasetDataCatalogInputDefinitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDatasetDatabaseInputDefinitionProperty(
        block: CfnDatasetDatabaseInputDefinitionPropertyDsl.() -> Unit =
            {},
    ): CfnDataset.DatabaseInputDefinitionProperty {
        val builder = CfnDatasetDatabaseInputDefinitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDatasetDatasetParameterProperty(
        block: CfnDatasetDatasetParameterPropertyDsl.() -> Unit =
            {},
    ): CfnDataset.DatasetParameterProperty {
        val builder = CfnDatasetDatasetParameterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDatasetDatetimeOptionsProperty(
        block: CfnDatasetDatetimeOptionsPropertyDsl.() -> Unit =
            {},
    ): CfnDataset.DatetimeOptionsProperty {
        val builder = CfnDatasetDatetimeOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDatasetExcelOptionsProperty(
        block: CfnDatasetExcelOptionsPropertyDsl.() -> Unit = {
        },
    ): CfnDataset.ExcelOptionsProperty {
        val builder = CfnDatasetExcelOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDatasetFilesLimitProperty(
        block: CfnDatasetFilesLimitPropertyDsl.() -> Unit =
            {},
    ): CfnDataset.FilesLimitProperty {
        val builder = CfnDatasetFilesLimitPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDatasetFilterExpressionProperty(
        block: CfnDatasetFilterExpressionPropertyDsl.() -> Unit =
            {},
    ): CfnDataset.FilterExpressionProperty {
        val builder = CfnDatasetFilterExpressionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDatasetFilterValueProperty(
        block: CfnDatasetFilterValuePropertyDsl.() -> Unit =
            {},
    ): CfnDataset.FilterValueProperty {
        val builder = CfnDatasetFilterValuePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDatasetFormatOptionsProperty(
        block: CfnDatasetFormatOptionsPropertyDsl.() -> Unit =
            {},
    ): CfnDataset.FormatOptionsProperty {
        val builder = CfnDatasetFormatOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDatasetInputProperty(block: CfnDatasetInputPropertyDsl.() -> Unit = {}): CfnDataset.InputProperty {
        val builder = CfnDatasetInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDatasetJsonOptionsProperty(
        block: CfnDatasetJsonOptionsPropertyDsl.() -> Unit =
            {},
    ): CfnDataset.JsonOptionsProperty {
        val builder = CfnDatasetJsonOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDatasetMetadataProperty(
        block: CfnDatasetMetadataPropertyDsl.() -> Unit =
            {},
    ): CfnDataset.MetadataProperty {
        val builder = CfnDatasetMetadataPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDatasetPathOptionsProperty(
        block: CfnDatasetPathOptionsPropertyDsl.() -> Unit =
            {},
    ): CfnDataset.PathOptionsProperty {
        val builder = CfnDatasetPathOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDatasetPathParameterProperty(
        block: CfnDatasetPathParameterPropertyDsl.() -> Unit =
            {},
    ): CfnDataset.PathParameterProperty {
        val builder = CfnDatasetPathParameterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDatasetProps(block: CfnDatasetPropsDsl.() -> Unit = {}): CfnDatasetProps {
        val builder = CfnDatasetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDatasetS3LocationProperty(
        block: CfnDatasetS3LocationPropertyDsl.() -> Unit =
            {},
    ): CfnDataset.S3LocationProperty {
        val builder = CfnDatasetS3LocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnJob(
        scope: Construct,
        id: String,
        block: CfnJobDsl.() -> Unit = {},
    ): CfnJob {
        val builder = CfnJobDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnJobAllowedStatisticsProperty(
        block: CfnJobAllowedStatisticsPropertyDsl.() -> Unit =
            {},
    ): CfnJob.AllowedStatisticsProperty {
        val builder = CfnJobAllowedStatisticsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnJobColumnSelectorProperty(
        block: CfnJobColumnSelectorPropertyDsl.() -> Unit =
            {},
    ): CfnJob.ColumnSelectorProperty {
        val builder = CfnJobColumnSelectorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnJobColumnStatisticsConfigurationProperty(
        block: CfnJobColumnStatisticsConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnJob.ColumnStatisticsConfigurationProperty {
        val builder = CfnJobColumnStatisticsConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnJobCsvOutputOptionsProperty(
        block: CfnJobCsvOutputOptionsPropertyDsl.() -> Unit = {
        },
    ): CfnJob.CsvOutputOptionsProperty {
        val builder = CfnJobCsvOutputOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnJobDataCatalogOutputProperty(
        block: CfnJobDataCatalogOutputPropertyDsl.() -> Unit =
            {},
    ): CfnJob.DataCatalogOutputProperty {
        val builder = CfnJobDataCatalogOutputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnJobDatabaseOutputProperty(
        block: CfnJobDatabaseOutputPropertyDsl.() -> Unit =
            {},
    ): CfnJob.DatabaseOutputProperty {
        val builder = CfnJobDatabaseOutputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnJobDatabaseTableOutputOptionsProperty(
        block: CfnJobDatabaseTableOutputOptionsPropertyDsl.() -> Unit =
            {},
    ): CfnJob.DatabaseTableOutputOptionsProperty {
        val builder = CfnJobDatabaseTableOutputOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnJobEntityDetectorConfigurationProperty(
        block: CfnJobEntityDetectorConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnJob.EntityDetectorConfigurationProperty {
        val builder = CfnJobEntityDetectorConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnJobJobSampleProperty(block: CfnJobJobSamplePropertyDsl.() -> Unit = {}): CfnJob.JobSampleProperty {
        val builder = CfnJobJobSamplePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnJobOutputFormatOptionsProperty(
        block: CfnJobOutputFormatOptionsPropertyDsl.() -> Unit =
            {},
    ): CfnJob.OutputFormatOptionsProperty {
        val builder = CfnJobOutputFormatOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnJobOutputLocationProperty(
        block: CfnJobOutputLocationPropertyDsl.() -> Unit =
            {},
    ): CfnJob.OutputLocationProperty {
        val builder = CfnJobOutputLocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnJobOutputProperty(block: CfnJobOutputPropertyDsl.() -> Unit = {}): CfnJob.OutputProperty {
        val builder = CfnJobOutputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnJobProfileConfigurationProperty(
        block: CfnJobProfileConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnJob.ProfileConfigurationProperty {
        val builder = CfnJobProfileConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnJobProps(block: CfnJobPropsDsl.() -> Unit = {}): CfnJobProps {
        val builder = CfnJobPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnJobRecipeProperty(block: CfnJobRecipePropertyDsl.() -> Unit = {}): CfnJob.RecipeProperty {
        val builder = CfnJobRecipePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnJobS3LocationProperty(block: CfnJobS3LocationPropertyDsl.() -> Unit = {}): CfnJob.S3LocationProperty {
        val builder = CfnJobS3LocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnJobS3TableOutputOptionsProperty(
        block: CfnJobS3TableOutputOptionsPropertyDsl.() -> Unit =
            {},
    ): CfnJob.S3TableOutputOptionsProperty {
        val builder = CfnJobS3TableOutputOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnJobStatisticOverrideProperty(
        block: CfnJobStatisticOverridePropertyDsl.() -> Unit =
            {},
    ): CfnJob.StatisticOverrideProperty {
        val builder = CfnJobStatisticOverridePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnJobStatisticsConfigurationProperty(
        block: CfnJobStatisticsConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnJob.StatisticsConfigurationProperty {
        val builder = CfnJobStatisticsConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnJobValidationConfigurationProperty(
        block: CfnJobValidationConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnJob.ValidationConfigurationProperty {
        val builder = CfnJobValidationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnProject(
        scope: Construct,
        id: String,
        block: CfnProjectDsl.() -> Unit = {},
    ): CfnProject {
        val builder = CfnProjectDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnProjectProps(block: CfnProjectPropsDsl.() -> Unit = {}): CfnProjectProps {
        val builder = CfnProjectPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnProjectSampleProperty(block: CfnProjectSamplePropertyDsl.() -> Unit = {}): CfnProject.SampleProperty {
        val builder = CfnProjectSamplePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRecipe(
        scope: Construct,
        id: String,
        block: CfnRecipeDsl.() -> Unit = {},
    ): CfnRecipe {
        val builder = CfnRecipeDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRecipeActionProperty(block: CfnRecipeActionPropertyDsl.() -> Unit = {}): CfnRecipe.ActionProperty {
        val builder = CfnRecipeActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRecipeConditionExpressionProperty(
        block: CfnRecipeConditionExpressionPropertyDsl.() -> Unit =
            {},
    ): CfnRecipe.ConditionExpressionProperty {
        val builder = CfnRecipeConditionExpressionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRecipeDataCatalogInputDefinitionProperty(
        block: CfnRecipeDataCatalogInputDefinitionPropertyDsl.() -> Unit =
            {},
    ): CfnRecipe.DataCatalogInputDefinitionProperty {
        val builder = CfnRecipeDataCatalogInputDefinitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRecipeInputProperty(block: CfnRecipeInputPropertyDsl.() -> Unit = {}): CfnRecipe.InputProperty {
        val builder = CfnRecipeInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRecipeProps(block: CfnRecipePropsDsl.() -> Unit = {}): CfnRecipeProps {
        val builder = CfnRecipePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRecipeRecipeParametersProperty(
        block: CfnRecipeRecipeParametersPropertyDsl.() -> Unit =
            {},
    ): CfnRecipe.RecipeParametersProperty {
        val builder = CfnRecipeRecipeParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRecipeRecipeStepProperty(
        block: CfnRecipeRecipeStepPropertyDsl.() -> Unit =
            {},
    ): CfnRecipe.RecipeStepProperty {
        val builder = CfnRecipeRecipeStepPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRecipeS3LocationProperty(
        block: CfnRecipeS3LocationPropertyDsl.() -> Unit =
            {},
    ): CfnRecipe.S3LocationProperty {
        val builder = CfnRecipeS3LocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRecipeSecondaryInputProperty(
        block: CfnRecipeSecondaryInputPropertyDsl.() -> Unit =
            {},
    ): CfnRecipe.SecondaryInputProperty {
        val builder = CfnRecipeSecondaryInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRuleset(
        scope: Construct,
        id: String,
        block: CfnRulesetDsl.() -> Unit = {},
    ): CfnRuleset {
        val builder = CfnRulesetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRulesetColumnSelectorProperty(
        block: CfnRulesetColumnSelectorPropertyDsl.() -> Unit =
            {},
    ): CfnRuleset.ColumnSelectorProperty {
        val builder = CfnRulesetColumnSelectorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRulesetProps(block: CfnRulesetPropsDsl.() -> Unit = {}): CfnRulesetProps {
        val builder = CfnRulesetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRulesetRuleProperty(block: CfnRulesetRulePropertyDsl.() -> Unit = {}): CfnRuleset.RuleProperty {
        val builder = CfnRulesetRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRulesetSubstitutionValueProperty(
        block: CfnRulesetSubstitutionValuePropertyDsl.() -> Unit =
            {},
    ): CfnRuleset.SubstitutionValueProperty {
        val builder = CfnRulesetSubstitutionValuePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRulesetThresholdProperty(
        block: CfnRulesetThresholdPropertyDsl.() -> Unit =
            {},
    ): CfnRuleset.ThresholdProperty {
        val builder = CfnRulesetThresholdPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSchedule(
        scope: Construct,
        id: String,
        block: CfnScheduleDsl.() -> Unit = {},
    ): CfnSchedule {
        val builder = CfnScheduleDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScheduleProps(block: CfnSchedulePropsDsl.() -> Unit = {}): CfnScheduleProps {
        val builder = CfnSchedulePropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
