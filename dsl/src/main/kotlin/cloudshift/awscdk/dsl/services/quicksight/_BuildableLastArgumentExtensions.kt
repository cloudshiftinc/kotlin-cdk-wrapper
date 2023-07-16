@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import software.amazon.awscdk.services.quicksight.CfnDashboard
import software.amazon.awscdk.services.quicksight.CfnDataSet
import software.amazon.awscdk.services.quicksight.CfnDataSource
import software.amazon.awscdk.services.quicksight.CfnRefreshSchedule
import software.amazon.awscdk.services.quicksight.CfnTemplate
import software.amazon.awscdk.services.quicksight.CfnTheme
import software.amazon.awscdk.services.quicksight.CfnTopic
import software.amazon.awscdk.services.quicksight.CfnVPCConnection

public inline fun CfnAnalysis.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnAnalysis.setDefinition(block: CfnAnalysisAnalysisDefinitionPropertyDsl.() -> Unit = {}) {
  val builder = CfnAnalysisAnalysisDefinitionPropertyDsl()
  builder.apply(block)
  return setDefinition(builder.build())
}

public inline fun CfnAnalysis.setParameters(block: CfnAnalysisParametersPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnAnalysisParametersPropertyDsl()
  builder.apply(block)
  return setParameters(builder.build())
}

public inline
    fun CfnAnalysis.setSourceEntity(block: CfnAnalysisAnalysisSourceEntityPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnAnalysisAnalysisSourceEntityPropertyDsl()
  builder.apply(block)
  return setSourceEntity(builder.build())
}

public inline fun CfnDashboard.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnDashboard.setDashboardPublishOptions(block: CfnDashboardDashboardPublishOptionsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDashboardDashboardPublishOptionsPropertyDsl()
  builder.apply(block)
  return setDashboardPublishOptions(builder.build())
}

public inline
    fun CfnDashboard.setDefinition(block: CfnDashboardDashboardVersionDefinitionPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDashboardDashboardVersionDefinitionPropertyDsl()
  builder.apply(block)
  return setDefinition(builder.build())
}

public inline fun CfnDashboard.setParameters(block: CfnDashboardParametersPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnDashboardParametersPropertyDsl()
  builder.apply(block)
  return setParameters(builder.build())
}

public inline
    fun CfnDashboard.setSourceEntity(block: CfnDashboardDashboardSourceEntityPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDashboardDashboardSourceEntityPropertyDsl()
  builder.apply(block)
  return setSourceEntity(builder.build())
}

public inline fun CfnDataSet.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnDataSet.setDataSetRefreshProperties(block: CfnDataSetDataSetRefreshPropertiesPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDataSetDataSetRefreshPropertiesPropertyDsl()
  builder.apply(block)
  return setDataSetRefreshProperties(builder.build())
}

public inline
    fun CfnDataSet.setDataSetUsageConfiguration(block: CfnDataSetDataSetUsageConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDataSetDataSetUsageConfigurationPropertyDsl()
  builder.apply(block)
  return setDataSetUsageConfiguration(builder.build())
}

public inline
    fun CfnDataSet.setIngestionWaitPolicy(block: CfnDataSetIngestionWaitPolicyPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDataSetIngestionWaitPolicyPropertyDsl()
  builder.apply(block)
  return setIngestionWaitPolicy(builder.build())
}

public inline
    fun CfnDataSet.setRowLevelPermissionDataSet(block: CfnDataSetRowLevelPermissionDataSetPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDataSetRowLevelPermissionDataSetPropertyDsl()
  builder.apply(block)
  return setRowLevelPermissionDataSet(builder.build())
}

public inline
    fun CfnDataSet.setRowLevelPermissionTagConfiguration(block: CfnDataSetRowLevelPermissionTagConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDataSetRowLevelPermissionTagConfigurationPropertyDsl()
  builder.apply(block)
  return setRowLevelPermissionTagConfiguration(builder.build())
}

public inline fun CfnDataSource.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnDataSource.setCredentials(block: CfnDataSourceDataSourceCredentialsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDataSourceDataSourceCredentialsPropertyDsl()
  builder.apply(block)
  return setCredentials(builder.build())
}

public inline
    fun CfnDataSource.setDataSourceParameters(block: CfnDataSourceDataSourceParametersPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDataSourceDataSourceParametersPropertyDsl()
  builder.apply(block)
  return setDataSourceParameters(builder.build())
}

public inline
    fun CfnDataSource.setErrorInfo(block: CfnDataSourceDataSourceErrorInfoPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnDataSourceDataSourceErrorInfoPropertyDsl()
  builder.apply(block)
  return setErrorInfo(builder.build())
}

public inline
    fun CfnDataSource.setSslProperties(block: CfnDataSourceSslPropertiesPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnDataSourceSslPropertiesPropertyDsl()
  builder.apply(block)
  return setSslProperties(builder.build())
}

public inline
    fun CfnDataSource.setVpcConnectionProperties(block: CfnDataSourceVpcConnectionPropertiesPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDataSourceVpcConnectionPropertiesPropertyDsl()
  builder.apply(block)
  return setVpcConnectionProperties(builder.build())
}

public inline fun CfnRefreshSchedule.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnRefreshSchedule.setSchedule(block: CfnRefreshScheduleRefreshScheduleMapPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnRefreshScheduleRefreshScheduleMapPropertyDsl()
  builder.apply(block)
  return setSchedule(builder.build())
}

public inline fun CfnTemplate.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnTemplate.setDefinition(block: CfnTemplateTemplateVersionDefinitionPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnTemplateTemplateVersionDefinitionPropertyDsl()
  builder.apply(block)
  return setDefinition(builder.build())
}

public inline
    fun CfnTemplate.setSourceEntity(block: CfnTemplateTemplateSourceEntityPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnTemplateTemplateSourceEntityPropertyDsl()
  builder.apply(block)
  return setSourceEntity(builder.build())
}

public inline fun CfnTheme.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnTheme.setConfiguration(block: CfnThemeThemeConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnThemeThemeConfigurationPropertyDsl()
  builder.apply(block)
  return setConfiguration(builder.build())
}

public inline fun CfnTopic.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnVPCConnection.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}
