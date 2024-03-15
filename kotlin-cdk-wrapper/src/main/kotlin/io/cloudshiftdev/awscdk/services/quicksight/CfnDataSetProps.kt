@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.quicksight

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnDataSetProps {
  public fun awsAccountId(): String? = unwrap(this).getAwsAccountId()

  public fun columnGroups(): Any? = unwrap(this).getColumnGroups()

  public fun columnLevelPermissionRules(): Any? = unwrap(this).getColumnLevelPermissionRules()

  public fun dataSetId(): String? = unwrap(this).getDataSetId()

  public fun dataSetRefreshProperties(): Any? = unwrap(this).getDataSetRefreshProperties()

  public fun dataSetUsageConfiguration(): Any? = unwrap(this).getDataSetUsageConfiguration()

  public fun datasetParameters(): Any? = unwrap(this).getDatasetParameters()

  public fun fieldFolders(): Any? = unwrap(this).getFieldFolders()

  public fun importMode(): String? = unwrap(this).getImportMode()

  public fun ingestionWaitPolicy(): Any? = unwrap(this).getIngestionWaitPolicy()

  public fun logicalTableMap(): Any? = unwrap(this).getLogicalTableMap()

  public fun name(): String? = unwrap(this).getName()

  public fun permissions(): Any? = unwrap(this).getPermissions()

  public fun physicalTableMap(): Any? = unwrap(this).getPhysicalTableMap()

  public fun rowLevelPermissionDataSet(): Any? = unwrap(this).getRowLevelPermissionDataSet()

  public fun rowLevelPermissionTagConfiguration(): Any? =
      unwrap(this).getRowLevelPermissionTagConfiguration()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun awsAccountId(awsAccountId: String)

    public fun columnGroups(columnGroups: IResolvable)

    public fun columnGroups(columnGroups: List<Any>)

    public fun columnGroups(vararg columnGroups: Any)

    public fun columnLevelPermissionRules(columnLevelPermissionRules: IResolvable)

    public fun columnLevelPermissionRules(columnLevelPermissionRules: List<Any>)

    public fun columnLevelPermissionRules(vararg columnLevelPermissionRules: Any)

    public fun dataSetId(dataSetId: String)

    public fun dataSetRefreshProperties(dataSetRefreshProperties: IResolvable)

    public
        fun dataSetRefreshProperties(dataSetRefreshProperties: CfnDataSet.DataSetRefreshPropertiesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a9bf6e51c2eced831f27659eb6226e7c4b7a68b8348c99fc118b1a277d76122e")
    public
        fun dataSetRefreshProperties(dataSetRefreshProperties: CfnDataSet.DataSetRefreshPropertiesProperty.Builder.() -> Unit)

    public fun dataSetUsageConfiguration(dataSetUsageConfiguration: IResolvable)

    public
        fun dataSetUsageConfiguration(dataSetUsageConfiguration: CfnDataSet.DataSetUsageConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f8edc77fbe1e7b74e1f3faa2046cc61567c7d98fedc78585d7898fff2d261eac")
    public
        fun dataSetUsageConfiguration(dataSetUsageConfiguration: CfnDataSet.DataSetUsageConfigurationProperty.Builder.() -> Unit)

    public fun datasetParameters(datasetParameters: IResolvable)

    public fun datasetParameters(datasetParameters: List<Any>)

    public fun datasetParameters(vararg datasetParameters: Any)

    public fun fieldFolders(fieldFolders: IResolvable)

    public fun fieldFolders(fieldFolders: Map<String, Any>)

    public fun importMode(importMode: String)

    public fun ingestionWaitPolicy(ingestionWaitPolicy: IResolvable)

    public fun ingestionWaitPolicy(ingestionWaitPolicy: CfnDataSet.IngestionWaitPolicyProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1eee46827dc2cba7bd8af15c0df6fc1acec0cfef69d747f0ab21ea507e2ada08")
    public
        fun ingestionWaitPolicy(ingestionWaitPolicy: CfnDataSet.IngestionWaitPolicyProperty.Builder.() -> Unit)

    public fun logicalTableMap(logicalTableMap: IResolvable)

    public fun logicalTableMap(logicalTableMap: Map<String, Any>)

    public fun name(name: String)

    public fun permissions(permissions: IResolvable)

    public fun permissions(permissions: List<Any>)

    public fun permissions(vararg permissions: Any)

    public fun physicalTableMap(physicalTableMap: IResolvable)

    public fun physicalTableMap(physicalTableMap: Map<String, Any>)

    public fun rowLevelPermissionDataSet(rowLevelPermissionDataSet: IResolvable)

    public
        fun rowLevelPermissionDataSet(rowLevelPermissionDataSet: CfnDataSet.RowLevelPermissionDataSetProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("51fa3948a50625f77a1d40d7c449907b848235af57823f7df6b9b5ef948188ed")
    public
        fun rowLevelPermissionDataSet(rowLevelPermissionDataSet: CfnDataSet.RowLevelPermissionDataSetProperty.Builder.() -> Unit)

    public fun rowLevelPermissionTagConfiguration(rowLevelPermissionTagConfiguration: IResolvable)

    public
        fun rowLevelPermissionTagConfiguration(rowLevelPermissionTagConfiguration: CfnDataSet.RowLevelPermissionTagConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fd244518233a53088afb8cdeab556894298d1bb628c3c80a13b0fed2d5f3d448")
    public
        fun rowLevelPermissionTagConfiguration(rowLevelPermissionTagConfiguration: CfnDataSet.RowLevelPermissionTagConfigurationProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.quicksight.CfnDataSetProps.Builder =
        software.amazon.awscdk.services.quicksight.CfnDataSetProps.builder()

    override fun awsAccountId(awsAccountId: String) {
      cdkBuilder.awsAccountId(awsAccountId)
    }

    override fun columnGroups(columnGroups: IResolvable) {
      cdkBuilder.columnGroups(columnGroups.let(IResolvable::unwrap))
    }

    override fun columnGroups(columnGroups: List<Any>) {
      cdkBuilder.columnGroups(columnGroups)
    }

    override fun columnGroups(vararg columnGroups: Any): Unit = columnGroups(columnGroups.toList())

    override fun columnLevelPermissionRules(columnLevelPermissionRules: IResolvable) {
      cdkBuilder.columnLevelPermissionRules(columnLevelPermissionRules.let(IResolvable::unwrap))
    }

    override fun columnLevelPermissionRules(columnLevelPermissionRules: List<Any>) {
      cdkBuilder.columnLevelPermissionRules(columnLevelPermissionRules)
    }

    override fun columnLevelPermissionRules(vararg columnLevelPermissionRules: Any): Unit =
        columnLevelPermissionRules(columnLevelPermissionRules.toList())

    override fun dataSetId(dataSetId: String) {
      cdkBuilder.dataSetId(dataSetId)
    }

    override fun dataSetRefreshProperties(dataSetRefreshProperties: IResolvable) {
      cdkBuilder.dataSetRefreshProperties(dataSetRefreshProperties.let(IResolvable::unwrap))
    }

    override
        fun dataSetRefreshProperties(dataSetRefreshProperties: CfnDataSet.DataSetRefreshPropertiesProperty) {
      cdkBuilder.dataSetRefreshProperties(dataSetRefreshProperties.let(CfnDataSet.DataSetRefreshPropertiesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a9bf6e51c2eced831f27659eb6226e7c4b7a68b8348c99fc118b1a277d76122e")
    override
        fun dataSetRefreshProperties(dataSetRefreshProperties: CfnDataSet.DataSetRefreshPropertiesProperty.Builder.() -> Unit):
        Unit =
        dataSetRefreshProperties(CfnDataSet.DataSetRefreshPropertiesProperty(dataSetRefreshProperties))

    override fun dataSetUsageConfiguration(dataSetUsageConfiguration: IResolvable) {
      cdkBuilder.dataSetUsageConfiguration(dataSetUsageConfiguration.let(IResolvable::unwrap))
    }

    override
        fun dataSetUsageConfiguration(dataSetUsageConfiguration: CfnDataSet.DataSetUsageConfigurationProperty) {
      cdkBuilder.dataSetUsageConfiguration(dataSetUsageConfiguration.let(CfnDataSet.DataSetUsageConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f8edc77fbe1e7b74e1f3faa2046cc61567c7d98fedc78585d7898fff2d261eac")
    override
        fun dataSetUsageConfiguration(dataSetUsageConfiguration: CfnDataSet.DataSetUsageConfigurationProperty.Builder.() -> Unit):
        Unit =
        dataSetUsageConfiguration(CfnDataSet.DataSetUsageConfigurationProperty(dataSetUsageConfiguration))

    override fun datasetParameters(datasetParameters: IResolvable) {
      cdkBuilder.datasetParameters(datasetParameters.let(IResolvable::unwrap))
    }

    override fun datasetParameters(datasetParameters: List<Any>) {
      cdkBuilder.datasetParameters(datasetParameters)
    }

    override fun datasetParameters(vararg datasetParameters: Any): Unit =
        datasetParameters(datasetParameters.toList())

    override fun fieldFolders(fieldFolders: IResolvable) {
      cdkBuilder.fieldFolders(fieldFolders.let(IResolvable::unwrap))
    }

    override fun fieldFolders(fieldFolders: Map<String, Any>) {
      cdkBuilder.fieldFolders(fieldFolders)
    }

    override fun importMode(importMode: String) {
      cdkBuilder.importMode(importMode)
    }

    override fun ingestionWaitPolicy(ingestionWaitPolicy: IResolvable) {
      cdkBuilder.ingestionWaitPolicy(ingestionWaitPolicy.let(IResolvable::unwrap))
    }

    override fun ingestionWaitPolicy(ingestionWaitPolicy: CfnDataSet.IngestionWaitPolicyProperty) {
      cdkBuilder.ingestionWaitPolicy(ingestionWaitPolicy.let(CfnDataSet.IngestionWaitPolicyProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1eee46827dc2cba7bd8af15c0df6fc1acec0cfef69d747f0ab21ea507e2ada08")
    override
        fun ingestionWaitPolicy(ingestionWaitPolicy: CfnDataSet.IngestionWaitPolicyProperty.Builder.() -> Unit):
        Unit = ingestionWaitPolicy(CfnDataSet.IngestionWaitPolicyProperty(ingestionWaitPolicy))

    override fun logicalTableMap(logicalTableMap: IResolvable) {
      cdkBuilder.logicalTableMap(logicalTableMap.let(IResolvable::unwrap))
    }

    override fun logicalTableMap(logicalTableMap: Map<String, Any>) {
      cdkBuilder.logicalTableMap(logicalTableMap)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun permissions(permissions: IResolvable) {
      cdkBuilder.permissions(permissions.let(IResolvable::unwrap))
    }

    override fun permissions(permissions: List<Any>) {
      cdkBuilder.permissions(permissions)
    }

    override fun permissions(vararg permissions: Any): Unit = permissions(permissions.toList())

    override fun physicalTableMap(physicalTableMap: IResolvable) {
      cdkBuilder.physicalTableMap(physicalTableMap.let(IResolvable::unwrap))
    }

    override fun physicalTableMap(physicalTableMap: Map<String, Any>) {
      cdkBuilder.physicalTableMap(physicalTableMap)
    }

    override fun rowLevelPermissionDataSet(rowLevelPermissionDataSet: IResolvable) {
      cdkBuilder.rowLevelPermissionDataSet(rowLevelPermissionDataSet.let(IResolvable::unwrap))
    }

    override
        fun rowLevelPermissionDataSet(rowLevelPermissionDataSet: CfnDataSet.RowLevelPermissionDataSetProperty) {
      cdkBuilder.rowLevelPermissionDataSet(rowLevelPermissionDataSet.let(CfnDataSet.RowLevelPermissionDataSetProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("51fa3948a50625f77a1d40d7c449907b848235af57823f7df6b9b5ef948188ed")
    override
        fun rowLevelPermissionDataSet(rowLevelPermissionDataSet: CfnDataSet.RowLevelPermissionDataSetProperty.Builder.() -> Unit):
        Unit =
        rowLevelPermissionDataSet(CfnDataSet.RowLevelPermissionDataSetProperty(rowLevelPermissionDataSet))

    override
        fun rowLevelPermissionTagConfiguration(rowLevelPermissionTagConfiguration: IResolvable) {
      cdkBuilder.rowLevelPermissionTagConfiguration(rowLevelPermissionTagConfiguration.let(IResolvable::unwrap))
    }

    override
        fun rowLevelPermissionTagConfiguration(rowLevelPermissionTagConfiguration: CfnDataSet.RowLevelPermissionTagConfigurationProperty) {
      cdkBuilder.rowLevelPermissionTagConfiguration(rowLevelPermissionTagConfiguration.let(CfnDataSet.RowLevelPermissionTagConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fd244518233a53088afb8cdeab556894298d1bb628c3c80a13b0fed2d5f3d448")
    override
        fun rowLevelPermissionTagConfiguration(rowLevelPermissionTagConfiguration: CfnDataSet.RowLevelPermissionTagConfigurationProperty.Builder.() -> Unit):
        Unit =
        rowLevelPermissionTagConfiguration(CfnDataSet.RowLevelPermissionTagConfigurationProperty(rowLevelPermissionTagConfiguration))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.quicksight.CfnDataSetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSetProps,
  ) : CdkObject(cdkObject), CfnDataSetProps {
    override fun awsAccountId(): String? = unwrap(this).getAwsAccountId()

    override fun columnGroups(): Any? = unwrap(this).getColumnGroups()

    override fun columnLevelPermissionRules(): Any? = unwrap(this).getColumnLevelPermissionRules()

    override fun dataSetId(): String? = unwrap(this).getDataSetId()

    override fun dataSetRefreshProperties(): Any? = unwrap(this).getDataSetRefreshProperties()

    override fun dataSetUsageConfiguration(): Any? = unwrap(this).getDataSetUsageConfiguration()

    override fun datasetParameters(): Any? = unwrap(this).getDatasetParameters()

    override fun fieldFolders(): Any? = unwrap(this).getFieldFolders()

    override fun importMode(): String? = unwrap(this).getImportMode()

    override fun ingestionWaitPolicy(): Any? = unwrap(this).getIngestionWaitPolicy()

    override fun logicalTableMap(): Any? = unwrap(this).getLogicalTableMap()

    override fun name(): String? = unwrap(this).getName()

    override fun permissions(): Any? = unwrap(this).getPermissions()

    override fun physicalTableMap(): Any? = unwrap(this).getPhysicalTableMap()

    override fun rowLevelPermissionDataSet(): Any? = unwrap(this).getRowLevelPermissionDataSet()

    override fun rowLevelPermissionTagConfiguration(): Any? =
        unwrap(this).getRowLevelPermissionTagConfiguration()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDataSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSetProps):
        CfnDataSetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDataSetProps):
        software.amazon.awscdk.services.quicksight.CfnDataSetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.quicksight.CfnDataSetProps
  }
}
