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

import kotlin.Unit
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import software.amazon.awscdk.services.quicksight.CfnDashboard
import software.amazon.awscdk.services.quicksight.CfnDataSet
import software.amazon.awscdk.services.quicksight.CfnDataSource
import software.amazon.awscdk.services.quicksight.CfnRefreshSchedule
import software.amazon.awscdk.services.quicksight.CfnTemplate
import software.amazon.awscdk.services.quicksight.CfnTheme

/**  */
public inline fun CfnAnalysis.setDefinition(
    block: CfnAnalysisAnalysisDefinitionPropertyDsl.() -> Unit = {}
) {
    val builder = CfnAnalysisAnalysisDefinitionPropertyDsl()
    builder.apply(block)
    return setDefinition(builder.build())
}

/** The parameter names and override values that you want to use. */
public inline fun CfnAnalysis.setParameters(
    block: CfnAnalysisParametersPropertyDsl.() -> Unit = {}
) {
    val builder = CfnAnalysisParametersPropertyDsl()
    builder.apply(block)
    return setParameters(builder.build())
}

/** A source entity to use for the analysis that you're creating. */
public inline fun CfnAnalysis.setSourceEntity(
    block: CfnAnalysisAnalysisSourceEntityPropertyDsl.() -> Unit = {}
) {
    val builder = CfnAnalysisAnalysisSourceEntityPropertyDsl()
    builder.apply(block)
    return setSourceEntity(builder.build())
}

/** Options for publishing the dashboard when you create it:. */
public inline fun CfnDashboard.setDashboardPublishOptions(
    block: CfnDashboardDashboardPublishOptionsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDashboardDashboardPublishOptionsPropertyDsl()
    builder.apply(block)
    return setDashboardPublishOptions(builder.build())
}

/**  */
public inline fun CfnDashboard.setDefinition(
    block: CfnDashboardDashboardVersionDefinitionPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDashboardDashboardVersionDefinitionPropertyDsl()
    builder.apply(block)
    return setDefinition(builder.build())
}

/**
 * The parameters for the creation of the dashboard, which you want to use to override the default
 * settings.
 */
public inline fun CfnDashboard.setParameters(
    block: CfnDashboardParametersPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDashboardParametersPropertyDsl()
    builder.apply(block)
    return setParameters(builder.build())
}

/** The entity that you are using as a source when you create the dashboard. */
public inline fun CfnDashboard.setSourceEntity(
    block: CfnDashboardDashboardSourceEntityPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDashboardDashboardSourceEntityPropertyDsl()
    builder.apply(block)
    return setSourceEntity(builder.build())
}

/** The dataset refresh properties for the dataset.</p>. */
public inline fun CfnDataSet.setDataSetRefreshProperties(
    block: CfnDataSetDataSetRefreshPropertiesPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDataSetDataSetRefreshPropertiesPropertyDsl()
    builder.apply(block)
    return setDataSetRefreshProperties(builder.build())
}

/** The usage configuration to apply to child datasets that reference this dataset as a source. */
public inline fun CfnDataSet.setDataSetUsageConfiguration(
    block: CfnDataSetDataSetUsageConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDataSetDataSetUsageConfigurationPropertyDsl()
    builder.apply(block)
    return setDataSetUsageConfiguration(builder.build())
}

/** The wait policy to use when creating or updating a Dataset. */
public inline fun CfnDataSet.setIngestionWaitPolicy(
    block: CfnDataSetIngestionWaitPolicyPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDataSetIngestionWaitPolicyPropertyDsl()
    builder.apply(block)
    return setIngestionWaitPolicy(builder.build())
}

/** The row-level security configuration for the data that you want to create. */
public inline fun CfnDataSet.setRowLevelPermissionDataSet(
    block: CfnDataSetRowLevelPermissionDataSetPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDataSetRowLevelPermissionDataSetPropertyDsl()
    builder.apply(block)
    return setRowLevelPermissionDataSet(builder.build())
}

/** The element you can use to define tags for row-level security. */
public inline fun CfnDataSet.setRowLevelPermissionTagConfiguration(
    block: CfnDataSetRowLevelPermissionTagConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDataSetRowLevelPermissionTagConfigurationPropertyDsl()
    builder.apply(block)
    return setRowLevelPermissionTagConfiguration(builder.build())
}

/** The credentials Amazon QuickSight that uses to connect to your underlying source. */
public inline fun CfnDataSource.setCredentials(
    block: CfnDataSourceDataSourceCredentialsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDataSourceDataSourceCredentialsPropertyDsl()
    builder.apply(block)
    return setCredentials(builder.build())
}

/** The parameters that Amazon QuickSight uses to connect to your underlying source. */
public inline fun CfnDataSource.setDataSourceParameters(
    block: CfnDataSourceDataSourceParametersPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDataSourceDataSourceParametersPropertyDsl()
    builder.apply(block)
    return setDataSourceParameters(builder.build())
}

/** Error information from the last update or the creation of the data source. */
public inline fun CfnDataSource.setErrorInfo(
    block: CfnDataSourceDataSourceErrorInfoPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDataSourceDataSourceErrorInfoPropertyDsl()
    builder.apply(block)
    return setErrorInfo(builder.build())
}

/**
 * Secure Socket Layer (SSL) properties that apply when Amazon QuickSight connects to your
 * underlying source.
 */
public inline fun CfnDataSource.setSslProperties(
    block: CfnDataSourceSslPropertiesPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDataSourceSslPropertiesPropertyDsl()
    builder.apply(block)
    return setSslProperties(builder.build())
}

/**
 * Use this parameter only when you want Amazon QuickSight to use a VPC connection when connecting
 * to your underlying source.
 */
public inline fun CfnDataSource.setVpcConnectionProperties(
    block: CfnDataSourceVpcConnectionPropertiesPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDataSourceVpcConnectionPropertiesPropertyDsl()
    builder.apply(block)
    return setVpcConnectionProperties(builder.build())
}

/** The refresh schedule of a dataset. */
public inline fun CfnRefreshSchedule.setSchedule(
    block: CfnRefreshScheduleRefreshScheduleMapPropertyDsl.() -> Unit = {}
) {
    val builder = CfnRefreshScheduleRefreshScheduleMapPropertyDsl()
    builder.apply(block)
    return setSchedule(builder.build())
}

/**  */
public inline fun CfnTemplate.setDefinition(
    block: CfnTemplateTemplateVersionDefinitionPropertyDsl.() -> Unit = {}
) {
    val builder = CfnTemplateTemplateVersionDefinitionPropertyDsl()
    builder.apply(block)
    return setDefinition(builder.build())
}

/** The entity that you are using as a source when you create the template. */
public inline fun CfnTemplate.setSourceEntity(
    block: CfnTemplateTemplateSourceEntityPropertyDsl.() -> Unit = {}
) {
    val builder = CfnTemplateTemplateSourceEntityPropertyDsl()
    builder.apply(block)
    return setSourceEntity(builder.build())
}

/** The theme configuration, which contains the theme display properties. */
public inline fun CfnTheme.setConfiguration(
    block: CfnThemeThemeConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnThemeThemeConfigurationPropertyDsl()
    builder.apply(block)
    return setConfiguration(builder.build())
}
