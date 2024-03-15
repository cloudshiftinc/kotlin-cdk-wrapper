@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.quicksight

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDataSet internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrConsumedSpiceCapacityInBytes(): IResolvable =
      unwrap(this).getAttrConsumedSpiceCapacityInBytes().let(IResolvable::wrap)

  public open fun attrCreatedTime(): String = unwrap(this).getAttrCreatedTime()

  public open fun attrLastUpdatedTime(): String = unwrap(this).getAttrLastUpdatedTime()

  public open fun attrOutputColumns(): IResolvable =
      unwrap(this).getAttrOutputColumns().let(IResolvable::wrap)

  public open fun awsAccountId(): String? = unwrap(this).getAwsAccountId()

  public open fun awsAccountId(`value`: String) {
    unwrap(this).setAwsAccountId(`value`)
  }

  public open fun columnGroups(): Any? = unwrap(this).getColumnGroups()

  public open fun columnGroups(`value`: IResolvable) {
    unwrap(this).setColumnGroups(`value`.let(IResolvable::unwrap))
  }

  public open fun columnGroups(__idx_ac66f0: List<Any>) {
    unwrap(this).setColumnGroups(__idx_ac66f0)
  }

  public open fun columnGroups(vararg __idx_ac66f0: Any): Unit = columnGroups(__idx_ac66f0.toList())

  public open fun columnLevelPermissionRules(): Any? = unwrap(this).getColumnLevelPermissionRules()

  public open fun columnLevelPermissionRules(`value`: IResolvable) {
    unwrap(this).setColumnLevelPermissionRules(`value`.let(IResolvable::unwrap))
  }

  public open fun columnLevelPermissionRules(__idx_ac66f0: List<Any>) {
    unwrap(this).setColumnLevelPermissionRules(__idx_ac66f0)
  }

  public open fun columnLevelPermissionRules(vararg __idx_ac66f0: Any): Unit =
      columnLevelPermissionRules(__idx_ac66f0.toList())

  public open fun dataSetId(): String? = unwrap(this).getDataSetId()

  public open fun dataSetId(`value`: String) {
    unwrap(this).setDataSetId(`value`)
  }

  public open fun dataSetRefreshProperties(): Any? = unwrap(this).getDataSetRefreshProperties()

  public open fun dataSetRefreshProperties(`value`: IResolvable) {
    unwrap(this).setDataSetRefreshProperties(`value`.let(IResolvable::unwrap))
  }

  public open fun dataSetRefreshProperties(`value`: DataSetRefreshPropertiesProperty) {
    unwrap(this).setDataSetRefreshProperties(`value`.let(DataSetRefreshPropertiesProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1f503b96cf7d203a59d4b2249b4db2d74bc982b921ba7891718737c1784d32ad")
  public open
      fun dataSetRefreshProperties(`value`: DataSetRefreshPropertiesProperty.Builder.() -> Unit):
      Unit = dataSetRefreshProperties(DataSetRefreshPropertiesProperty(`value`))

  public open fun dataSetUsageConfiguration(): Any? = unwrap(this).getDataSetUsageConfiguration()

  public open fun dataSetUsageConfiguration(`value`: IResolvable) {
    unwrap(this).setDataSetUsageConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun dataSetUsageConfiguration(`value`: DataSetUsageConfigurationProperty) {
    unwrap(this).setDataSetUsageConfiguration(`value`.let(DataSetUsageConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6f957a22a68080352e1e705f2ee0f7ad7178b0158c4ceba8d84bce512ad07911")
  public open
      fun dataSetUsageConfiguration(`value`: DataSetUsageConfigurationProperty.Builder.() -> Unit):
      Unit = dataSetUsageConfiguration(DataSetUsageConfigurationProperty(`value`))

  public open fun datasetParameters(): Any? = unwrap(this).getDatasetParameters()

  public open fun datasetParameters(`value`: IResolvable) {
    unwrap(this).setDatasetParameters(`value`.let(IResolvable::unwrap))
  }

  public open fun datasetParameters(__idx_ac66f0: List<Any>) {
    unwrap(this).setDatasetParameters(__idx_ac66f0)
  }

  public open fun datasetParameters(vararg __idx_ac66f0: Any): Unit =
      datasetParameters(__idx_ac66f0.toList())

  public open fun fieldFolders(): Any? = unwrap(this).getFieldFolders()

  public open fun fieldFolders(`value`: IResolvable) {
    unwrap(this).setFieldFolders(`value`.let(IResolvable::unwrap))
  }

  public open fun fieldFolders(__item_ac66f0: Map<String, Any>) {
    unwrap(this).setFieldFolders(__item_ac66f0)
  }

  public open fun importMode(): String? = unwrap(this).getImportMode()

  public open fun importMode(`value`: String) {
    unwrap(this).setImportMode(`value`)
  }

  public open fun ingestionWaitPolicy(): Any? = unwrap(this).getIngestionWaitPolicy()

  public open fun ingestionWaitPolicy(`value`: IResolvable) {
    unwrap(this).setIngestionWaitPolicy(`value`.let(IResolvable::unwrap))
  }

  public open fun ingestionWaitPolicy(`value`: IngestionWaitPolicyProperty) {
    unwrap(this).setIngestionWaitPolicy(`value`.let(IngestionWaitPolicyProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c3f6e273c2baf9557683876729f153f91af9ce7972d27ad4710224da906418b2")
  public open fun ingestionWaitPolicy(`value`: IngestionWaitPolicyProperty.Builder.() -> Unit): Unit
      = ingestionWaitPolicy(IngestionWaitPolicyProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun logicalTableMap(): Any? = unwrap(this).getLogicalTableMap()

  public open fun logicalTableMap(`value`: IResolvable) {
    unwrap(this).setLogicalTableMap(`value`.let(IResolvable::unwrap))
  }

  public open fun logicalTableMap(__item_ac66f0: Map<String, Any>) {
    unwrap(this).setLogicalTableMap(__item_ac66f0)
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun permissions(): Any? = unwrap(this).getPermissions()

  public open fun permissions(`value`: IResolvable) {
    unwrap(this).setPermissions(`value`.let(IResolvable::unwrap))
  }

  public open fun permissions(__idx_ac66f0: List<Any>) {
    unwrap(this).setPermissions(__idx_ac66f0)
  }

  public open fun permissions(vararg __idx_ac66f0: Any): Unit = permissions(__idx_ac66f0.toList())

  public open fun physicalTableMap(): Any? = unwrap(this).getPhysicalTableMap()

  public open fun physicalTableMap(`value`: IResolvable) {
    unwrap(this).setPhysicalTableMap(`value`.let(IResolvable::unwrap))
  }

  public open fun physicalTableMap(__item_ac66f0: Map<String, Any>) {
    unwrap(this).setPhysicalTableMap(__item_ac66f0)
  }

  public open fun rowLevelPermissionDataSet(): Any? = unwrap(this).getRowLevelPermissionDataSet()

  public open fun rowLevelPermissionDataSet(`value`: IResolvable) {
    unwrap(this).setRowLevelPermissionDataSet(`value`.let(IResolvable::unwrap))
  }

  public open fun rowLevelPermissionDataSet(`value`: RowLevelPermissionDataSetProperty) {
    unwrap(this).setRowLevelPermissionDataSet(`value`.let(RowLevelPermissionDataSetProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a96a5cfa4e111de0081543de481cee9778cd7ed81f95ad730ba579990c838528")
  public open
      fun rowLevelPermissionDataSet(`value`: RowLevelPermissionDataSetProperty.Builder.() -> Unit):
      Unit = rowLevelPermissionDataSet(RowLevelPermissionDataSetProperty(`value`))

  public open fun rowLevelPermissionTagConfiguration(): Any? =
      unwrap(this).getRowLevelPermissionTagConfiguration()

  public open fun rowLevelPermissionTagConfiguration(`value`: IResolvable) {
    unwrap(this).setRowLevelPermissionTagConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open
      fun rowLevelPermissionTagConfiguration(`value`: RowLevelPermissionTagConfigurationProperty) {
    unwrap(this).setRowLevelPermissionTagConfiguration(`value`.let(RowLevelPermissionTagConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2d4eee0adf41d378bf4e5491d261267bc89360347f50c68caed50561824909c2")
  public open
      fun rowLevelPermissionTagConfiguration(`value`: RowLevelPermissionTagConfigurationProperty.Builder.() -> Unit):
      Unit = rowLevelPermissionTagConfiguration(RowLevelPermissionTagConfigurationProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

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

    public fun dataSetRefreshProperties(dataSetRefreshProperties: DataSetRefreshPropertiesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1b11bbe24eafa6fe8be5693ba34a09f2b8c06e64b642fae3c4124b121a329b8e")
    public
        fun dataSetRefreshProperties(dataSetRefreshProperties: DataSetRefreshPropertiesProperty.Builder.() -> Unit)

    public fun dataSetUsageConfiguration(dataSetUsageConfiguration: IResolvable)

    public
        fun dataSetUsageConfiguration(dataSetUsageConfiguration: DataSetUsageConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e74504af1fbf07a0fcc56d906fa7a031042df28284b6663483e5b97999e74d86")
    public
        fun dataSetUsageConfiguration(dataSetUsageConfiguration: DataSetUsageConfigurationProperty.Builder.() -> Unit)

    public fun datasetParameters(datasetParameters: IResolvable)

    public fun datasetParameters(datasetParameters: List<Any>)

    public fun datasetParameters(vararg datasetParameters: Any)

    public fun fieldFolders(fieldFolders: IResolvable)

    public fun fieldFolders(fieldFolders: Map<String, Any>)

    public fun importMode(importMode: String)

    public fun ingestionWaitPolicy(ingestionWaitPolicy: IResolvable)

    public fun ingestionWaitPolicy(ingestionWaitPolicy: IngestionWaitPolicyProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2e9a06411827148f45b4562d2103434b0311c0f9d115d15413b42353b07b0dc6")
    public
        fun ingestionWaitPolicy(ingestionWaitPolicy: IngestionWaitPolicyProperty.Builder.() -> Unit)

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
        fun rowLevelPermissionDataSet(rowLevelPermissionDataSet: RowLevelPermissionDataSetProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72c8133ac76b705895da48093797a90a33b3f6b2239ca56e1b2b68b27d76ff3e")
    public
        fun rowLevelPermissionDataSet(rowLevelPermissionDataSet: RowLevelPermissionDataSetProperty.Builder.() -> Unit)

    public fun rowLevelPermissionTagConfiguration(rowLevelPermissionTagConfiguration: IResolvable)

    public
        fun rowLevelPermissionTagConfiguration(rowLevelPermissionTagConfiguration: RowLevelPermissionTagConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("48530a6bc1ae355140ee3d734117ed4ce35265abec30be91ecdfa5082105a3c9")
    public
        fun rowLevelPermissionTagConfiguration(rowLevelPermissionTagConfiguration: RowLevelPermissionTagConfigurationProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.quicksight.CfnDataSet.Builder =
        software.amazon.awscdk.services.quicksight.CfnDataSet.Builder.create(scope, id)

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
        fun dataSetRefreshProperties(dataSetRefreshProperties: DataSetRefreshPropertiesProperty) {
      cdkBuilder.dataSetRefreshProperties(dataSetRefreshProperties.let(DataSetRefreshPropertiesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1b11bbe24eafa6fe8be5693ba34a09f2b8c06e64b642fae3c4124b121a329b8e")
    override
        fun dataSetRefreshProperties(dataSetRefreshProperties: DataSetRefreshPropertiesProperty.Builder.() -> Unit):
        Unit = dataSetRefreshProperties(DataSetRefreshPropertiesProperty(dataSetRefreshProperties))

    override fun dataSetUsageConfiguration(dataSetUsageConfiguration: IResolvable) {
      cdkBuilder.dataSetUsageConfiguration(dataSetUsageConfiguration.let(IResolvable::unwrap))
    }

    override
        fun dataSetUsageConfiguration(dataSetUsageConfiguration: DataSetUsageConfigurationProperty) {
      cdkBuilder.dataSetUsageConfiguration(dataSetUsageConfiguration.let(DataSetUsageConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e74504af1fbf07a0fcc56d906fa7a031042df28284b6663483e5b97999e74d86")
    override
        fun dataSetUsageConfiguration(dataSetUsageConfiguration: DataSetUsageConfigurationProperty.Builder.() -> Unit):
        Unit =
        dataSetUsageConfiguration(DataSetUsageConfigurationProperty(dataSetUsageConfiguration))

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

    override fun ingestionWaitPolicy(ingestionWaitPolicy: IngestionWaitPolicyProperty) {
      cdkBuilder.ingestionWaitPolicy(ingestionWaitPolicy.let(IngestionWaitPolicyProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2e9a06411827148f45b4562d2103434b0311c0f9d115d15413b42353b07b0dc6")
    override
        fun ingestionWaitPolicy(ingestionWaitPolicy: IngestionWaitPolicyProperty.Builder.() -> Unit):
        Unit = ingestionWaitPolicy(IngestionWaitPolicyProperty(ingestionWaitPolicy))

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
        fun rowLevelPermissionDataSet(rowLevelPermissionDataSet: RowLevelPermissionDataSetProperty) {
      cdkBuilder.rowLevelPermissionDataSet(rowLevelPermissionDataSet.let(RowLevelPermissionDataSetProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72c8133ac76b705895da48093797a90a33b3f6b2239ca56e1b2b68b27d76ff3e")
    override
        fun rowLevelPermissionDataSet(rowLevelPermissionDataSet: RowLevelPermissionDataSetProperty.Builder.() -> Unit):
        Unit =
        rowLevelPermissionDataSet(RowLevelPermissionDataSetProperty(rowLevelPermissionDataSet))

    override
        fun rowLevelPermissionTagConfiguration(rowLevelPermissionTagConfiguration: IResolvable) {
      cdkBuilder.rowLevelPermissionTagConfiguration(rowLevelPermissionTagConfiguration.let(IResolvable::unwrap))
    }

    override
        fun rowLevelPermissionTagConfiguration(rowLevelPermissionTagConfiguration: RowLevelPermissionTagConfigurationProperty) {
      cdkBuilder.rowLevelPermissionTagConfiguration(rowLevelPermissionTagConfiguration.let(RowLevelPermissionTagConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("48530a6bc1ae355140ee3d734117ed4ce35265abec30be91ecdfa5082105a3c9")
    override
        fun rowLevelPermissionTagConfiguration(rowLevelPermissionTagConfiguration: RowLevelPermissionTagConfigurationProperty.Builder.() -> Unit):
        Unit =
        rowLevelPermissionTagConfiguration(RowLevelPermissionTagConfigurationProperty(rowLevelPermissionTagConfiguration))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.quicksight.CfnDataSet = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.quicksight.CfnDataSet.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDataSet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDataSet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet): CfnDataSet
        = CfnDataSet(cdkObject)

    internal fun unwrap(wrapped: CfnDataSet): software.amazon.awscdk.services.quicksight.CfnDataSet
        = wrapped.cdkObject
  }

  public interface ColumnGroupProperty {
    public fun geoSpatialColumnGroup(): Any? = unwrap(this).getGeoSpatialColumnGroup()

    @CdkDslMarker
    public interface Builder {
      public fun geoSpatialColumnGroup(geoSpatialColumnGroup: IResolvable)

      public fun geoSpatialColumnGroup(geoSpatialColumnGroup: GeoSpatialColumnGroupProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fbd4d291cd40db33396c220c06606a0b2373f738c9d3bde0ed15d8ffb7f3df7f")
      public
          fun geoSpatialColumnGroup(geoSpatialColumnGroup: GeoSpatialColumnGroupProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnGroupProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnGroupProperty.builder()

      override fun geoSpatialColumnGroup(geoSpatialColumnGroup: IResolvable) {
        cdkBuilder.geoSpatialColumnGroup(geoSpatialColumnGroup.let(IResolvable::unwrap))
      }

      override fun geoSpatialColumnGroup(geoSpatialColumnGroup: GeoSpatialColumnGroupProperty) {
        cdkBuilder.geoSpatialColumnGroup(geoSpatialColumnGroup.let(GeoSpatialColumnGroupProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fbd4d291cd40db33396c220c06606a0b2373f738c9d3bde0ed15d8ffb7f3df7f")
      override
          fun geoSpatialColumnGroup(geoSpatialColumnGroup: GeoSpatialColumnGroupProperty.Builder.() -> Unit):
          Unit = geoSpatialColumnGroup(GeoSpatialColumnGroupProperty(geoSpatialColumnGroup))

      public fun build(): software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnGroupProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnGroupProperty,
    ) : CdkObject(cdkObject), ColumnGroupProperty {
      override fun geoSpatialColumnGroup(): Any? = unwrap(this).getGeoSpatialColumnGroup()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ColumnGroupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnGroupProperty):
          ColumnGroupProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ColumnGroupProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnGroupProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnGroupProperty
    }
  }

  public interface InputColumnProperty {
    public fun name(): String

    public fun subType(): String? = unwrap(this).getSubType()

    public fun type(): String

    @CdkDslMarker
    public interface Builder {
      public fun name(name: String)

      public fun subType(subType: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.InputColumnProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.InputColumnProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun subType(subType: String) {
        cdkBuilder.subType(subType)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.quicksight.CfnDataSet.InputColumnProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.InputColumnProperty,
    ) : CdkObject(cdkObject), InputColumnProperty {
      override fun name(): String = unwrap(this).getName()

      override fun subType(): String? = unwrap(this).getSubType()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InputColumnProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.InputColumnProperty):
          InputColumnProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputColumnProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.InputColumnProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.InputColumnProperty
    }
  }

  public interface ColumnDescriptionProperty {
    public fun text(): String? = unwrap(this).getText()

    @CdkDslMarker
    public interface Builder {
      public fun text(text: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnDescriptionProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnDescriptionProperty.builder()

      override fun text(text: String) {
        cdkBuilder.text(text)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnDescriptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnDescriptionProperty,
    ) : CdkObject(cdkObject), ColumnDescriptionProperty {
      override fun text(): String? = unwrap(this).getText()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ColumnDescriptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnDescriptionProperty):
          ColumnDescriptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ColumnDescriptionProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnDescriptionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnDescriptionProperty
    }
  }

  public interface CalculatedColumnProperty {
    public fun columnId(): String

    public fun columnName(): String

    public fun expression(): String

    @CdkDslMarker
    public interface Builder {
      public fun columnId(columnId: String)

      public fun columnName(columnName: String)

      public fun expression(expression: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.CalculatedColumnProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.CalculatedColumnProperty.builder()

      override fun columnId(columnId: String) {
        cdkBuilder.columnId(columnId)
      }

      override fun columnName(columnName: String) {
        cdkBuilder.columnName(columnName)
      }

      override fun expression(expression: String) {
        cdkBuilder.expression(expression)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.CalculatedColumnProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.CalculatedColumnProperty,
    ) : CdkObject(cdkObject), CalculatedColumnProperty {
      override fun columnId(): String = unwrap(this).getColumnId()

      override fun columnName(): String = unwrap(this).getColumnName()

      override fun expression(): String = unwrap(this).getExpression()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CalculatedColumnProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.CalculatedColumnProperty):
          CalculatedColumnProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CalculatedColumnProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.CalculatedColumnProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.CalculatedColumnProperty
    }
  }

  public interface S3SourceProperty {
    public fun dataSourceArn(): String

    public fun inputColumns(): Any

    public fun uploadSettings(): Any? = unwrap(this).getUploadSettings()

    @CdkDslMarker
    public interface Builder {
      public fun dataSourceArn(dataSourceArn: String)

      public fun inputColumns(inputColumns: IResolvable)

      public fun inputColumns(inputColumns: List<Any>)

      public fun inputColumns(vararg inputColumns: Any)

      public fun uploadSettings(uploadSettings: IResolvable)

      public fun uploadSettings(uploadSettings: UploadSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7e1c99ab7c68549c21ceb18a313feb7b90a976e2a3bccae8689a7e49a2a353a4")
      public fun uploadSettings(uploadSettings: UploadSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.S3SourceProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.S3SourceProperty.builder()

      override fun dataSourceArn(dataSourceArn: String) {
        cdkBuilder.dataSourceArn(dataSourceArn)
      }

      override fun inputColumns(inputColumns: IResolvable) {
        cdkBuilder.inputColumns(inputColumns.let(IResolvable::unwrap))
      }

      override fun inputColumns(inputColumns: List<Any>) {
        cdkBuilder.inputColumns(inputColumns)
      }

      override fun inputColumns(vararg inputColumns: Any): Unit =
          inputColumns(inputColumns.toList())

      override fun uploadSettings(uploadSettings: IResolvable) {
        cdkBuilder.uploadSettings(uploadSettings.let(IResolvable::unwrap))
      }

      override fun uploadSettings(uploadSettings: UploadSettingsProperty) {
        cdkBuilder.uploadSettings(uploadSettings.let(UploadSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7e1c99ab7c68549c21ceb18a313feb7b90a976e2a3bccae8689a7e49a2a353a4")
      override fun uploadSettings(uploadSettings: UploadSettingsProperty.Builder.() -> Unit): Unit =
          uploadSettings(UploadSettingsProperty(uploadSettings))

      public fun build(): software.amazon.awscdk.services.quicksight.CfnDataSet.S3SourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.S3SourceProperty,
    ) : CdkObject(cdkObject), S3SourceProperty {
      override fun dataSourceArn(): String = unwrap(this).getDataSourceArn()

      override fun inputColumns(): Any = unwrap(this).getInputColumns()

      override fun uploadSettings(): Any? = unwrap(this).getUploadSettings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3SourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.S3SourceProperty):
          S3SourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3SourceProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.S3SourceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.S3SourceProperty
    }
  }

  public interface ResourcePermissionProperty {
    public fun actions(): List<String>

    public fun principal(): String

    @CdkDslMarker
    public interface Builder {
      public fun actions(actions: List<String>)

      public fun actions(vararg actions: String)

      public fun principal(principal: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.ResourcePermissionProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.ResourcePermissionProperty.builder()

      override fun actions(actions: List<String>) {
        cdkBuilder.actions(actions)
      }

      override fun actions(vararg actions: String): Unit = actions(actions.toList())

      override fun principal(principal: String) {
        cdkBuilder.principal(principal)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.ResourcePermissionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.ResourcePermissionProperty,
    ) : CdkObject(cdkObject), ResourcePermissionProperty {
      override fun actions(): List<String> = unwrap(this).getActions()

      override fun principal(): String = unwrap(this).getPrincipal()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResourcePermissionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.ResourcePermissionProperty):
          ResourcePermissionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourcePermissionProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.ResourcePermissionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.ResourcePermissionProperty
    }
  }

  public interface ColumnTagProperty {
    public fun columnDescription(): Any? = unwrap(this).getColumnDescription()

    public fun columnGeographicRole(): String? = unwrap(this).getColumnGeographicRole()

    @CdkDslMarker
    public interface Builder {
      public fun columnDescription(columnDescription: IResolvable)

      public fun columnDescription(columnDescription: ColumnDescriptionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("03e5e3ca560aa97d41df505842459bdeaf0cd70b1d1271d530ee23614738cf74")
      public fun columnDescription(columnDescription: ColumnDescriptionProperty.Builder.() -> Unit)

      public fun columnGeographicRole(columnGeographicRole: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnTagProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnTagProperty.builder()

      override fun columnDescription(columnDescription: IResolvable) {
        cdkBuilder.columnDescription(columnDescription.let(IResolvable::unwrap))
      }

      override fun columnDescription(columnDescription: ColumnDescriptionProperty) {
        cdkBuilder.columnDescription(columnDescription.let(ColumnDescriptionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("03e5e3ca560aa97d41df505842459bdeaf0cd70b1d1271d530ee23614738cf74")
      override
          fun columnDescription(columnDescription: ColumnDescriptionProperty.Builder.() -> Unit):
          Unit = columnDescription(ColumnDescriptionProperty(columnDescription))

      override fun columnGeographicRole(columnGeographicRole: String) {
        cdkBuilder.columnGeographicRole(columnGeographicRole)
      }

      public fun build(): software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnTagProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnTagProperty,
    ) : CdkObject(cdkObject), ColumnTagProperty {
      override fun columnDescription(): Any? = unwrap(this).getColumnDescription()

      override fun columnGeographicRole(): String? = unwrap(this).getColumnGeographicRole()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ColumnTagProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnTagProperty):
          ColumnTagProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ColumnTagProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnTagProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnTagProperty
    }
  }

  public interface DateTimeDatasetParameterDefaultValuesProperty {
    public fun staticValues(): List<String> = unwrap(this).getStaticValues() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun staticValues(staticValues: List<String>)

      public fun staticValues(vararg staticValues: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.DateTimeDatasetParameterDefaultValuesProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSet.DateTimeDatasetParameterDefaultValuesProperty.builder()

      override fun staticValues(staticValues: List<String>) {
        cdkBuilder.staticValues(staticValues)
      }

      override fun staticValues(vararg staticValues: String): Unit =
          staticValues(staticValues.toList())

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.DateTimeDatasetParameterDefaultValuesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.DateTimeDatasetParameterDefaultValuesProperty,
    ) : CdkObject(cdkObject), DateTimeDatasetParameterDefaultValuesProperty {
      override fun staticValues(): List<String> = unwrap(this).getStaticValues() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DateTimeDatasetParameterDefaultValuesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.DateTimeDatasetParameterDefaultValuesProperty):
          DateTimeDatasetParameterDefaultValuesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DateTimeDatasetParameterDefaultValuesProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.DateTimeDatasetParameterDefaultValuesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.DateTimeDatasetParameterDefaultValuesProperty
    }
  }

  public interface RowLevelPermissionTagRuleProperty {
    public fun columnName(): String

    public fun matchAllValue(): String? = unwrap(this).getMatchAllValue()

    public fun tagKey(): String

    public fun tagMultiValueDelimiter(): String? = unwrap(this).getTagMultiValueDelimiter()

    @CdkDslMarker
    public interface Builder {
      public fun columnName(columnName: String)

      public fun matchAllValue(matchAllValue: String)

      public fun tagKey(tagKey: String)

      public fun tagMultiValueDelimiter(tagMultiValueDelimiter: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.RowLevelPermissionTagRuleProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSet.RowLevelPermissionTagRuleProperty.builder()

      override fun columnName(columnName: String) {
        cdkBuilder.columnName(columnName)
      }

      override fun matchAllValue(matchAllValue: String) {
        cdkBuilder.matchAllValue(matchAllValue)
      }

      override fun tagKey(tagKey: String) {
        cdkBuilder.tagKey(tagKey)
      }

      override fun tagMultiValueDelimiter(tagMultiValueDelimiter: String) {
        cdkBuilder.tagMultiValueDelimiter(tagMultiValueDelimiter)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.RowLevelPermissionTagRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.RowLevelPermissionTagRuleProperty,
    ) : CdkObject(cdkObject), RowLevelPermissionTagRuleProperty {
      override fun columnName(): String = unwrap(this).getColumnName()

      override fun matchAllValue(): String? = unwrap(this).getMatchAllValue()

      override fun tagKey(): String = unwrap(this).getTagKey()

      override fun tagMultiValueDelimiter(): String? = unwrap(this).getTagMultiValueDelimiter()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RowLevelPermissionTagRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.RowLevelPermissionTagRuleProperty):
          RowLevelPermissionTagRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RowLevelPermissionTagRuleProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.RowLevelPermissionTagRuleProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.RowLevelPermissionTagRuleProperty
    }
  }

  public interface TransformOperationProperty {
    public fun castColumnTypeOperation(): Any? = unwrap(this).getCastColumnTypeOperation()

    public fun createColumnsOperation(): Any? = unwrap(this).getCreateColumnsOperation()

    public fun filterOperation(): Any? = unwrap(this).getFilterOperation()

    public fun overrideDatasetParameterOperation(): Any? =
        unwrap(this).getOverrideDatasetParameterOperation()

    public fun projectOperation(): Any? = unwrap(this).getProjectOperation()

    public fun renameColumnOperation(): Any? = unwrap(this).getRenameColumnOperation()

    public fun tagColumnOperation(): Any? = unwrap(this).getTagColumnOperation()

    @CdkDslMarker
    public interface Builder {
      public fun castColumnTypeOperation(castColumnTypeOperation: IResolvable)

      public fun castColumnTypeOperation(castColumnTypeOperation: CastColumnTypeOperationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eed6192ccc81b9d1e2ba7188ab20a8c6942e3e540378d23c73ed5b418ae69dbc")
      public
          fun castColumnTypeOperation(castColumnTypeOperation: CastColumnTypeOperationProperty.Builder.() -> Unit)

      public fun createColumnsOperation(createColumnsOperation: IResolvable)

      public fun createColumnsOperation(createColumnsOperation: CreateColumnsOperationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a1a600f06409b22e09c297d51a1d8063fe444a2cc35df8faa6d7612c921f25c")
      public
          fun createColumnsOperation(createColumnsOperation: CreateColumnsOperationProperty.Builder.() -> Unit)

      public fun filterOperation(filterOperation: IResolvable)

      public fun filterOperation(filterOperation: FilterOperationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8f4e4a130657fd54b048123fc35c452cc79ad12e12a6ee6133f286e6845f1598")
      public fun filterOperation(filterOperation: FilterOperationProperty.Builder.() -> Unit)

      public fun overrideDatasetParameterOperation(overrideDatasetParameterOperation: IResolvable)

      public
          fun overrideDatasetParameterOperation(overrideDatasetParameterOperation: OverrideDatasetParameterOperationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("21ab89056d9e1abb0f8cde30f2a70da44800cc1d476ede018f934876ae0ddc99")
      public
          fun overrideDatasetParameterOperation(overrideDatasetParameterOperation: OverrideDatasetParameterOperationProperty.Builder.() -> Unit)

      public fun projectOperation(projectOperation: IResolvable)

      public fun projectOperation(projectOperation: ProjectOperationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("800bbecc32a653d442f5adaa61f1c4fb785664a0c403c790fcd16c02c32774f1")
      public fun projectOperation(projectOperation: ProjectOperationProperty.Builder.() -> Unit)

      public fun renameColumnOperation(renameColumnOperation: IResolvable)

      public fun renameColumnOperation(renameColumnOperation: RenameColumnOperationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9e66963c9f5e77057bb144e2af341dcebdb67d6c055efb95d3db93b8eb933988")
      public
          fun renameColumnOperation(renameColumnOperation: RenameColumnOperationProperty.Builder.() -> Unit)

      public fun tagColumnOperation(tagColumnOperation: IResolvable)

      public fun tagColumnOperation(tagColumnOperation: TagColumnOperationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ffa3a41a8ce0be3fc3ac48146287259f6da2c6108486e8e158862d9beeae356e")
      public
          fun tagColumnOperation(tagColumnOperation: TagColumnOperationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.TransformOperationProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.TransformOperationProperty.builder()

      override fun castColumnTypeOperation(castColumnTypeOperation: IResolvable) {
        cdkBuilder.castColumnTypeOperation(castColumnTypeOperation.let(IResolvable::unwrap))
      }

      override
          fun castColumnTypeOperation(castColumnTypeOperation: CastColumnTypeOperationProperty) {
        cdkBuilder.castColumnTypeOperation(castColumnTypeOperation.let(CastColumnTypeOperationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eed6192ccc81b9d1e2ba7188ab20a8c6942e3e540378d23c73ed5b418ae69dbc")
      override
          fun castColumnTypeOperation(castColumnTypeOperation: CastColumnTypeOperationProperty.Builder.() -> Unit):
          Unit = castColumnTypeOperation(CastColumnTypeOperationProperty(castColumnTypeOperation))

      override fun createColumnsOperation(createColumnsOperation: IResolvable) {
        cdkBuilder.createColumnsOperation(createColumnsOperation.let(IResolvable::unwrap))
      }

      override fun createColumnsOperation(createColumnsOperation: CreateColumnsOperationProperty) {
        cdkBuilder.createColumnsOperation(createColumnsOperation.let(CreateColumnsOperationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a1a600f06409b22e09c297d51a1d8063fe444a2cc35df8faa6d7612c921f25c")
      override
          fun createColumnsOperation(createColumnsOperation: CreateColumnsOperationProperty.Builder.() -> Unit):
          Unit = createColumnsOperation(CreateColumnsOperationProperty(createColumnsOperation))

      override fun filterOperation(filterOperation: IResolvable) {
        cdkBuilder.filterOperation(filterOperation.let(IResolvable::unwrap))
      }

      override fun filterOperation(filterOperation: FilterOperationProperty) {
        cdkBuilder.filterOperation(filterOperation.let(FilterOperationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8f4e4a130657fd54b048123fc35c452cc79ad12e12a6ee6133f286e6845f1598")
      override fun filterOperation(filterOperation: FilterOperationProperty.Builder.() -> Unit):
          Unit = filterOperation(FilterOperationProperty(filterOperation))

      override
          fun overrideDatasetParameterOperation(overrideDatasetParameterOperation: IResolvable) {
        cdkBuilder.overrideDatasetParameterOperation(overrideDatasetParameterOperation.let(IResolvable::unwrap))
      }

      override
          fun overrideDatasetParameterOperation(overrideDatasetParameterOperation: OverrideDatasetParameterOperationProperty) {
        cdkBuilder.overrideDatasetParameterOperation(overrideDatasetParameterOperation.let(OverrideDatasetParameterOperationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("21ab89056d9e1abb0f8cde30f2a70da44800cc1d476ede018f934876ae0ddc99")
      override
          fun overrideDatasetParameterOperation(overrideDatasetParameterOperation: OverrideDatasetParameterOperationProperty.Builder.() -> Unit):
          Unit =
          overrideDatasetParameterOperation(OverrideDatasetParameterOperationProperty(overrideDatasetParameterOperation))

      override fun projectOperation(projectOperation: IResolvable) {
        cdkBuilder.projectOperation(projectOperation.let(IResolvable::unwrap))
      }

      override fun projectOperation(projectOperation: ProjectOperationProperty) {
        cdkBuilder.projectOperation(projectOperation.let(ProjectOperationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("800bbecc32a653d442f5adaa61f1c4fb785664a0c403c790fcd16c02c32774f1")
      override fun projectOperation(projectOperation: ProjectOperationProperty.Builder.() -> Unit):
          Unit = projectOperation(ProjectOperationProperty(projectOperation))

      override fun renameColumnOperation(renameColumnOperation: IResolvable) {
        cdkBuilder.renameColumnOperation(renameColumnOperation.let(IResolvable::unwrap))
      }

      override fun renameColumnOperation(renameColumnOperation: RenameColumnOperationProperty) {
        cdkBuilder.renameColumnOperation(renameColumnOperation.let(RenameColumnOperationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9e66963c9f5e77057bb144e2af341dcebdb67d6c055efb95d3db93b8eb933988")
      override
          fun renameColumnOperation(renameColumnOperation: RenameColumnOperationProperty.Builder.() -> Unit):
          Unit = renameColumnOperation(RenameColumnOperationProperty(renameColumnOperation))

      override fun tagColumnOperation(tagColumnOperation: IResolvable) {
        cdkBuilder.tagColumnOperation(tagColumnOperation.let(IResolvable::unwrap))
      }

      override fun tagColumnOperation(tagColumnOperation: TagColumnOperationProperty) {
        cdkBuilder.tagColumnOperation(tagColumnOperation.let(TagColumnOperationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ffa3a41a8ce0be3fc3ac48146287259f6da2c6108486e8e158862d9beeae356e")
      override
          fun tagColumnOperation(tagColumnOperation: TagColumnOperationProperty.Builder.() -> Unit):
          Unit = tagColumnOperation(TagColumnOperationProperty(tagColumnOperation))

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.TransformOperationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.TransformOperationProperty,
    ) : CdkObject(cdkObject), TransformOperationProperty {
      override fun castColumnTypeOperation(): Any? = unwrap(this).getCastColumnTypeOperation()

      override fun createColumnsOperation(): Any? = unwrap(this).getCreateColumnsOperation()

      override fun filterOperation(): Any? = unwrap(this).getFilterOperation()

      override fun overrideDatasetParameterOperation(): Any? =
          unwrap(this).getOverrideDatasetParameterOperation()

      override fun projectOperation(): Any? = unwrap(this).getProjectOperation()

      override fun renameColumnOperation(): Any? = unwrap(this).getRenameColumnOperation()

      override fun tagColumnOperation(): Any? = unwrap(this).getTagColumnOperation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TransformOperationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.TransformOperationProperty):
          TransformOperationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TransformOperationProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.TransformOperationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.TransformOperationProperty
    }
  }

  public interface FilterOperationProperty {
    public fun conditionExpression(): String

    @CdkDslMarker
    public interface Builder {
      public fun conditionExpression(conditionExpression: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.FilterOperationProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.FilterOperationProperty.builder()

      override fun conditionExpression(conditionExpression: String) {
        cdkBuilder.conditionExpression(conditionExpression)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.FilterOperationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.FilterOperationProperty,
    ) : CdkObject(cdkObject), FilterOperationProperty {
      override fun conditionExpression(): String = unwrap(this).getConditionExpression()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FilterOperationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.FilterOperationProperty):
          FilterOperationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterOperationProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.FilterOperationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.FilterOperationProperty
    }
  }

  public interface JoinKeyPropertiesProperty {
    public fun uniqueKey(): Any? = unwrap(this).getUniqueKey()

    @CdkDslMarker
    public interface Builder {
      public fun uniqueKey(uniqueKey: Boolean)

      public fun uniqueKey(uniqueKey: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.JoinKeyPropertiesProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.JoinKeyPropertiesProperty.builder()

      override fun uniqueKey(uniqueKey: Boolean) {
        cdkBuilder.uniqueKey(uniqueKey)
      }

      override fun uniqueKey(uniqueKey: IResolvable) {
        cdkBuilder.uniqueKey(uniqueKey.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.JoinKeyPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.JoinKeyPropertiesProperty,
    ) : CdkObject(cdkObject), JoinKeyPropertiesProperty {
      override fun uniqueKey(): Any? = unwrap(this).getUniqueKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): JoinKeyPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.JoinKeyPropertiesProperty):
          JoinKeyPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JoinKeyPropertiesProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.JoinKeyPropertiesProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.JoinKeyPropertiesProperty
    }
  }

  public interface DecimalDatasetParameterProperty {
    public fun defaultValues(): Any? = unwrap(this).getDefaultValues()

    public fun id(): String

    public fun name(): String

    public fun valueType(): String

    @CdkDslMarker
    public interface Builder {
      public fun defaultValues(defaultValues: IResolvable)

      public fun defaultValues(defaultValues: DecimalDatasetParameterDefaultValuesProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d4d4ff0f93eb81d978ccb9a0fffb48162c91f0195f969e7d66d43669aff10713")
      public
          fun defaultValues(defaultValues: DecimalDatasetParameterDefaultValuesProperty.Builder.() -> Unit)

      public fun id(id: String)

      public fun name(name: String)

      public fun valueType(valueType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.DecimalDatasetParameterProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSet.DecimalDatasetParameterProperty.builder()

      override fun defaultValues(defaultValues: IResolvable) {
        cdkBuilder.defaultValues(defaultValues.let(IResolvable::unwrap))
      }

      override fun defaultValues(defaultValues: DecimalDatasetParameterDefaultValuesProperty) {
        cdkBuilder.defaultValues(defaultValues.let(DecimalDatasetParameterDefaultValuesProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d4d4ff0f93eb81d978ccb9a0fffb48162c91f0195f969e7d66d43669aff10713")
      override
          fun defaultValues(defaultValues: DecimalDatasetParameterDefaultValuesProperty.Builder.() -> Unit):
          Unit = defaultValues(DecimalDatasetParameterDefaultValuesProperty(defaultValues))

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun valueType(valueType: String) {
        cdkBuilder.valueType(valueType)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.DecimalDatasetParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.DecimalDatasetParameterProperty,
    ) : CdkObject(cdkObject), DecimalDatasetParameterProperty {
      override fun defaultValues(): Any? = unwrap(this).getDefaultValues()

      override fun id(): String = unwrap(this).getId()

      override fun name(): String = unwrap(this).getName()

      override fun valueType(): String = unwrap(this).getValueType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DecimalDatasetParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.DecimalDatasetParameterProperty):
          DecimalDatasetParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DecimalDatasetParameterProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.DecimalDatasetParameterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.DecimalDatasetParameterProperty
    }
  }

  public interface GeoSpatialColumnGroupProperty {
    public fun columns(): List<String>

    public fun countryCode(): String? = unwrap(this).getCountryCode()

    public fun name(): String

    @CdkDslMarker
    public interface Builder {
      public fun columns(columns: List<String>)

      public fun columns(vararg columns: String)

      public fun countryCode(countryCode: String)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.GeoSpatialColumnGroupProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSet.GeoSpatialColumnGroupProperty.builder()

      override fun columns(columns: List<String>) {
        cdkBuilder.columns(columns)
      }

      override fun columns(vararg columns: String): Unit = columns(columns.toList())

      override fun countryCode(countryCode: String) {
        cdkBuilder.countryCode(countryCode)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.GeoSpatialColumnGroupProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.GeoSpatialColumnGroupProperty,
    ) : CdkObject(cdkObject), GeoSpatialColumnGroupProperty {
      override fun columns(): List<String> = unwrap(this).getColumns()

      override fun countryCode(): String? = unwrap(this).getCountryCode()

      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GeoSpatialColumnGroupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.GeoSpatialColumnGroupProperty):
          GeoSpatialColumnGroupProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GeoSpatialColumnGroupProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.GeoSpatialColumnGroupProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.GeoSpatialColumnGroupProperty
    }
  }

  public interface OverrideDatasetParameterOperationProperty {
    public fun newDefaultValues(): Any? = unwrap(this).getNewDefaultValues()

    public fun newParameterName(): String? = unwrap(this).getNewParameterName()

    public fun parameterName(): String

    @CdkDslMarker
    public interface Builder {
      public fun newDefaultValues(newDefaultValues: IResolvable)

      public fun newDefaultValues(newDefaultValues: NewDefaultValuesProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ef0f6263592a20f89b8c5dd1b0789a6f47f1a6ccbfd7db5534de3efc9541d2b6")
      public fun newDefaultValues(newDefaultValues: NewDefaultValuesProperty.Builder.() -> Unit)

      public fun newParameterName(newParameterName: String)

      public fun parameterName(parameterName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.OverrideDatasetParameterOperationProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSet.OverrideDatasetParameterOperationProperty.builder()

      override fun newDefaultValues(newDefaultValues: IResolvable) {
        cdkBuilder.newDefaultValues(newDefaultValues.let(IResolvable::unwrap))
      }

      override fun newDefaultValues(newDefaultValues: NewDefaultValuesProperty) {
        cdkBuilder.newDefaultValues(newDefaultValues.let(NewDefaultValuesProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ef0f6263592a20f89b8c5dd1b0789a6f47f1a6ccbfd7db5534de3efc9541d2b6")
      override fun newDefaultValues(newDefaultValues: NewDefaultValuesProperty.Builder.() -> Unit):
          Unit = newDefaultValues(NewDefaultValuesProperty(newDefaultValues))

      override fun newParameterName(newParameterName: String) {
        cdkBuilder.newParameterName(newParameterName)
      }

      override fun parameterName(parameterName: String) {
        cdkBuilder.parameterName(parameterName)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.OverrideDatasetParameterOperationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.OverrideDatasetParameterOperationProperty,
    ) : CdkObject(cdkObject), OverrideDatasetParameterOperationProperty {
      override fun newDefaultValues(): Any? = unwrap(this).getNewDefaultValues()

      override fun newParameterName(): String? = unwrap(this).getNewParameterName()

      override fun parameterName(): String = unwrap(this).getParameterName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          OverrideDatasetParameterOperationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.OverrideDatasetParameterOperationProperty):
          OverrideDatasetParameterOperationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OverrideDatasetParameterOperationProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.OverrideDatasetParameterOperationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.OverrideDatasetParameterOperationProperty
    }
  }

  public interface RowLevelPermissionDataSetProperty {
    public fun arn(): String

    public fun formatVersion(): String? = unwrap(this).getFormatVersion()

    public fun namespace(): String? = unwrap(this).getNamespace()

    public fun permissionPolicy(): String

    public fun status(): String? = unwrap(this).getStatus()

    @CdkDslMarker
    public interface Builder {
      public fun arn(arn: String)

      public fun formatVersion(formatVersion: String)

      public fun namespace(namespace: String)

      public fun permissionPolicy(permissionPolicy: String)

      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.RowLevelPermissionDataSetProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSet.RowLevelPermissionDataSetProperty.builder()

      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      override fun formatVersion(formatVersion: String) {
        cdkBuilder.formatVersion(formatVersion)
      }

      override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      override fun permissionPolicy(permissionPolicy: String) {
        cdkBuilder.permissionPolicy(permissionPolicy)
      }

      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.RowLevelPermissionDataSetProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.RowLevelPermissionDataSetProperty,
    ) : CdkObject(cdkObject), RowLevelPermissionDataSetProperty {
      override fun arn(): String = unwrap(this).getArn()

      override fun formatVersion(): String? = unwrap(this).getFormatVersion()

      override fun namespace(): String? = unwrap(this).getNamespace()

      override fun permissionPolicy(): String = unwrap(this).getPermissionPolicy()

      override fun status(): String? = unwrap(this).getStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RowLevelPermissionDataSetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.RowLevelPermissionDataSetProperty):
          RowLevelPermissionDataSetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RowLevelPermissionDataSetProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.RowLevelPermissionDataSetProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.RowLevelPermissionDataSetProperty
    }
  }

  public interface RelationalTableProperty {
    public fun catalog(): String? = unwrap(this).getCatalog()

    public fun dataSourceArn(): String

    public fun inputColumns(): Any

    public fun name(): String

    public fun schema(): String? = unwrap(this).getSchema()

    @CdkDslMarker
    public interface Builder {
      public fun catalog(catalog: String)

      public fun dataSourceArn(dataSourceArn: String)

      public fun inputColumns(inputColumns: IResolvable)

      public fun inputColumns(inputColumns: List<Any>)

      public fun inputColumns(vararg inputColumns: Any)

      public fun name(name: String)

      public fun schema(schema: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.RelationalTableProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.RelationalTableProperty.builder()

      override fun catalog(catalog: String) {
        cdkBuilder.catalog(catalog)
      }

      override fun dataSourceArn(dataSourceArn: String) {
        cdkBuilder.dataSourceArn(dataSourceArn)
      }

      override fun inputColumns(inputColumns: IResolvable) {
        cdkBuilder.inputColumns(inputColumns.let(IResolvable::unwrap))
      }

      override fun inputColumns(inputColumns: List<Any>) {
        cdkBuilder.inputColumns(inputColumns)
      }

      override fun inputColumns(vararg inputColumns: Any): Unit =
          inputColumns(inputColumns.toList())

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun schema(schema: String) {
        cdkBuilder.schema(schema)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.RelationalTableProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.RelationalTableProperty,
    ) : CdkObject(cdkObject), RelationalTableProperty {
      override fun catalog(): String? = unwrap(this).getCatalog()

      override fun dataSourceArn(): String = unwrap(this).getDataSourceArn()

      override fun inputColumns(): Any = unwrap(this).getInputColumns()

      override fun name(): String = unwrap(this).getName()

      override fun schema(): String? = unwrap(this).getSchema()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RelationalTableProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.RelationalTableProperty):
          RelationalTableProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RelationalTableProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.RelationalTableProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.RelationalTableProperty
    }
  }

  public interface LogicalTableProperty {
    public fun alias(): String

    public fun dataTransforms(): Any? = unwrap(this).getDataTransforms()

    public fun source(): Any

    @CdkDslMarker
    public interface Builder {
      public fun alias(alias: String)

      public fun dataTransforms(dataTransforms: IResolvable)

      public fun dataTransforms(dataTransforms: List<Any>)

      public fun dataTransforms(vararg dataTransforms: Any)

      public fun source(source: IResolvable)

      public fun source(source: LogicalTableSourceProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("985accfe8cb3d471c9f271f0ee7ccda2339d6feefba9b5a08cfc81a779ae5f57")
      public fun source(source: LogicalTableSourceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.LogicalTableProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.LogicalTableProperty.builder()

      override fun alias(alias: String) {
        cdkBuilder.alias(alias)
      }

      override fun dataTransforms(dataTransforms: IResolvable) {
        cdkBuilder.dataTransforms(dataTransforms.let(IResolvable::unwrap))
      }

      override fun dataTransforms(dataTransforms: List<Any>) {
        cdkBuilder.dataTransforms(dataTransforms)
      }

      override fun dataTransforms(vararg dataTransforms: Any): Unit =
          dataTransforms(dataTransforms.toList())

      override fun source(source: IResolvable) {
        cdkBuilder.source(source.let(IResolvable::unwrap))
      }

      override fun source(source: LogicalTableSourceProperty) {
        cdkBuilder.source(source.let(LogicalTableSourceProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("985accfe8cb3d471c9f271f0ee7ccda2339d6feefba9b5a08cfc81a779ae5f57")
      override fun source(source: LogicalTableSourceProperty.Builder.() -> Unit): Unit =
          source(LogicalTableSourceProperty(source))

      public fun build(): software.amazon.awscdk.services.quicksight.CfnDataSet.LogicalTableProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.LogicalTableProperty,
    ) : CdkObject(cdkObject), LogicalTableProperty {
      override fun alias(): String = unwrap(this).getAlias()

      override fun dataTransforms(): Any? = unwrap(this).getDataTransforms()

      override fun source(): Any = unwrap(this).getSource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LogicalTableProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.LogicalTableProperty):
          LogicalTableProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogicalTableProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.LogicalTableProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.LogicalTableProperty
    }
  }

  public interface UploadSettingsProperty {
    public fun containsHeader(): Any? = unwrap(this).getContainsHeader()

    public fun delimiter(): String? = unwrap(this).getDelimiter()

    public fun format(): String? = unwrap(this).getFormat()

    public fun startFromRow(): Number? = unwrap(this).getStartFromRow()

    public fun textQualifier(): String? = unwrap(this).getTextQualifier()

    @CdkDslMarker
    public interface Builder {
      public fun containsHeader(containsHeader: Boolean)

      public fun containsHeader(containsHeader: IResolvable)

      public fun delimiter(delimiter: String)

      public fun format(format: String)

      public fun startFromRow(startFromRow: Number)

      public fun textQualifier(textQualifier: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.UploadSettingsProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.UploadSettingsProperty.builder()

      override fun containsHeader(containsHeader: Boolean) {
        cdkBuilder.containsHeader(containsHeader)
      }

      override fun containsHeader(containsHeader: IResolvable) {
        cdkBuilder.containsHeader(containsHeader.let(IResolvable::unwrap))
      }

      override fun delimiter(delimiter: String) {
        cdkBuilder.delimiter(delimiter)
      }

      override fun format(format: String) {
        cdkBuilder.format(format)
      }

      override fun startFromRow(startFromRow: Number) {
        cdkBuilder.startFromRow(startFromRow)
      }

      override fun textQualifier(textQualifier: String) {
        cdkBuilder.textQualifier(textQualifier)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.UploadSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.UploadSettingsProperty,
    ) : CdkObject(cdkObject), UploadSettingsProperty {
      override fun containsHeader(): Any? = unwrap(this).getContainsHeader()

      override fun delimiter(): String? = unwrap(this).getDelimiter()

      override fun format(): String? = unwrap(this).getFormat()

      override fun startFromRow(): Number? = unwrap(this).getStartFromRow()

      override fun textQualifier(): String? = unwrap(this).getTextQualifier()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): UploadSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.UploadSettingsProperty):
          UploadSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UploadSettingsProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.UploadSettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.UploadSettingsProperty
    }
  }

  public interface DatasetParameterProperty {
    public fun dateTimeDatasetParameter(): Any? = unwrap(this).getDateTimeDatasetParameter()

    public fun decimalDatasetParameter(): Any? = unwrap(this).getDecimalDatasetParameter()

    public fun integerDatasetParameter(): Any? = unwrap(this).getIntegerDatasetParameter()

    public fun stringDatasetParameter(): Any? = unwrap(this).getStringDatasetParameter()

    @CdkDslMarker
    public interface Builder {
      public fun dateTimeDatasetParameter(dateTimeDatasetParameter: IResolvable)

      public
          fun dateTimeDatasetParameter(dateTimeDatasetParameter: DateTimeDatasetParameterProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b6330e56a4b08c037e5a0198b51c1a974e2d11af1bb08379c97c0f6aae67e16b")
      public
          fun dateTimeDatasetParameter(dateTimeDatasetParameter: DateTimeDatasetParameterProperty.Builder.() -> Unit)

      public fun decimalDatasetParameter(decimalDatasetParameter: IResolvable)

      public fun decimalDatasetParameter(decimalDatasetParameter: DecimalDatasetParameterProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1634e53f113aed724cabad720b0fa19f4e316e4b1f7116b4cf0999c1bfe2aae2")
      public
          fun decimalDatasetParameter(decimalDatasetParameter: DecimalDatasetParameterProperty.Builder.() -> Unit)

      public fun integerDatasetParameter(integerDatasetParameter: IResolvable)

      public fun integerDatasetParameter(integerDatasetParameter: IntegerDatasetParameterProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("40a5b0841ed1324c9c1a99dd407c95d8169daf3049187f30e0306f959955ebcb")
      public
          fun integerDatasetParameter(integerDatasetParameter: IntegerDatasetParameterProperty.Builder.() -> Unit)

      public fun stringDatasetParameter(stringDatasetParameter: IResolvable)

      public fun stringDatasetParameter(stringDatasetParameter: StringDatasetParameterProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e94bf3ec5d1ec0fc7536914e63dcc28a3d93ab61b8b6cf48eaa37438c83110e7")
      public
          fun stringDatasetParameter(stringDatasetParameter: StringDatasetParameterProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.DatasetParameterProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.DatasetParameterProperty.builder()

      override fun dateTimeDatasetParameter(dateTimeDatasetParameter: IResolvable) {
        cdkBuilder.dateTimeDatasetParameter(dateTimeDatasetParameter.let(IResolvable::unwrap))
      }

      override
          fun dateTimeDatasetParameter(dateTimeDatasetParameter: DateTimeDatasetParameterProperty) {
        cdkBuilder.dateTimeDatasetParameter(dateTimeDatasetParameter.let(DateTimeDatasetParameterProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b6330e56a4b08c037e5a0198b51c1a974e2d11af1bb08379c97c0f6aae67e16b")
      override
          fun dateTimeDatasetParameter(dateTimeDatasetParameter: DateTimeDatasetParameterProperty.Builder.() -> Unit):
          Unit =
          dateTimeDatasetParameter(DateTimeDatasetParameterProperty(dateTimeDatasetParameter))

      override fun decimalDatasetParameter(decimalDatasetParameter: IResolvable) {
        cdkBuilder.decimalDatasetParameter(decimalDatasetParameter.let(IResolvable::unwrap))
      }

      override
          fun decimalDatasetParameter(decimalDatasetParameter: DecimalDatasetParameterProperty) {
        cdkBuilder.decimalDatasetParameter(decimalDatasetParameter.let(DecimalDatasetParameterProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1634e53f113aed724cabad720b0fa19f4e316e4b1f7116b4cf0999c1bfe2aae2")
      override
          fun decimalDatasetParameter(decimalDatasetParameter: DecimalDatasetParameterProperty.Builder.() -> Unit):
          Unit = decimalDatasetParameter(DecimalDatasetParameterProperty(decimalDatasetParameter))

      override fun integerDatasetParameter(integerDatasetParameter: IResolvable) {
        cdkBuilder.integerDatasetParameter(integerDatasetParameter.let(IResolvable::unwrap))
      }

      override
          fun integerDatasetParameter(integerDatasetParameter: IntegerDatasetParameterProperty) {
        cdkBuilder.integerDatasetParameter(integerDatasetParameter.let(IntegerDatasetParameterProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("40a5b0841ed1324c9c1a99dd407c95d8169daf3049187f30e0306f959955ebcb")
      override
          fun integerDatasetParameter(integerDatasetParameter: IntegerDatasetParameterProperty.Builder.() -> Unit):
          Unit = integerDatasetParameter(IntegerDatasetParameterProperty(integerDatasetParameter))

      override fun stringDatasetParameter(stringDatasetParameter: IResolvable) {
        cdkBuilder.stringDatasetParameter(stringDatasetParameter.let(IResolvable::unwrap))
      }

      override fun stringDatasetParameter(stringDatasetParameter: StringDatasetParameterProperty) {
        cdkBuilder.stringDatasetParameter(stringDatasetParameter.let(StringDatasetParameterProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e94bf3ec5d1ec0fc7536914e63dcc28a3d93ab61b8b6cf48eaa37438c83110e7")
      override
          fun stringDatasetParameter(stringDatasetParameter: StringDatasetParameterProperty.Builder.() -> Unit):
          Unit = stringDatasetParameter(StringDatasetParameterProperty(stringDatasetParameter))

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.DatasetParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.DatasetParameterProperty,
    ) : CdkObject(cdkObject), DatasetParameterProperty {
      override fun dateTimeDatasetParameter(): Any? = unwrap(this).getDateTimeDatasetParameter()

      override fun decimalDatasetParameter(): Any? = unwrap(this).getDecimalDatasetParameter()

      override fun integerDatasetParameter(): Any? = unwrap(this).getIntegerDatasetParameter()

      override fun stringDatasetParameter(): Any? = unwrap(this).getStringDatasetParameter()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DatasetParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.DatasetParameterProperty):
          DatasetParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatasetParameterProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.DatasetParameterProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.DatasetParameterProperty
    }
  }

  public interface NewDefaultValuesProperty {
    public fun dateTimeStaticValues(): List<String> = unwrap(this).getDateTimeStaticValues() ?:
        emptyList()

    public fun decimalStaticValues(): Any? = unwrap(this).getDecimalStaticValues()

    public fun integerStaticValues(): Any? = unwrap(this).getIntegerStaticValues()

    public fun stringStaticValues(): List<String> = unwrap(this).getStringStaticValues() ?:
        emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun dateTimeStaticValues(dateTimeStaticValues: List<String>)

      public fun dateTimeStaticValues(vararg dateTimeStaticValues: String)

      public fun decimalStaticValues(decimalStaticValues: IResolvable)

      public fun decimalStaticValues(decimalStaticValues: List<Number>)

      public fun decimalStaticValues(vararg decimalStaticValues: Number)

      public fun integerStaticValues(integerStaticValues: IResolvable)

      public fun integerStaticValues(integerStaticValues: List<Number>)

      public fun integerStaticValues(vararg integerStaticValues: Number)

      public fun stringStaticValues(stringStaticValues: List<String>)

      public fun stringStaticValues(vararg stringStaticValues: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.NewDefaultValuesProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.NewDefaultValuesProperty.builder()

      override fun dateTimeStaticValues(dateTimeStaticValues: List<String>) {
        cdkBuilder.dateTimeStaticValues(dateTimeStaticValues)
      }

      override fun dateTimeStaticValues(vararg dateTimeStaticValues: String): Unit =
          dateTimeStaticValues(dateTimeStaticValues.toList())

      override fun decimalStaticValues(decimalStaticValues: IResolvable) {
        cdkBuilder.decimalStaticValues(decimalStaticValues.let(IResolvable::unwrap))
      }

      override fun decimalStaticValues(decimalStaticValues: List<Number>) {
        cdkBuilder.decimalStaticValues(decimalStaticValues)
      }

      override fun decimalStaticValues(vararg decimalStaticValues: Number): Unit =
          decimalStaticValues(decimalStaticValues.toList())

      override fun integerStaticValues(integerStaticValues: IResolvable) {
        cdkBuilder.integerStaticValues(integerStaticValues.let(IResolvable::unwrap))
      }

      override fun integerStaticValues(integerStaticValues: List<Number>) {
        cdkBuilder.integerStaticValues(integerStaticValues)
      }

      override fun integerStaticValues(vararg integerStaticValues: Number): Unit =
          integerStaticValues(integerStaticValues.toList())

      override fun stringStaticValues(stringStaticValues: List<String>) {
        cdkBuilder.stringStaticValues(stringStaticValues)
      }

      override fun stringStaticValues(vararg stringStaticValues: String): Unit =
          stringStaticValues(stringStaticValues.toList())

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.NewDefaultValuesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.NewDefaultValuesProperty,
    ) : CdkObject(cdkObject), NewDefaultValuesProperty {
      override fun dateTimeStaticValues(): List<String> = unwrap(this).getDateTimeStaticValues() ?:
          emptyList()

      override fun decimalStaticValues(): Any? = unwrap(this).getDecimalStaticValues()

      override fun integerStaticValues(): Any? = unwrap(this).getIntegerStaticValues()

      override fun stringStaticValues(): List<String> = unwrap(this).getStringStaticValues() ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NewDefaultValuesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.NewDefaultValuesProperty):
          NewDefaultValuesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NewDefaultValuesProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.NewDefaultValuesProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.NewDefaultValuesProperty
    }
  }

  public interface RowLevelPermissionTagConfigurationProperty {
    public fun status(): String? = unwrap(this).getStatus()

    public fun tagRuleConfigurations(): Any? = unwrap(this).getTagRuleConfigurations()

    public fun tagRules(): Any

    @CdkDslMarker
    public interface Builder {
      public fun status(status: String)

      public fun tagRuleConfigurations(tagRuleConfigurations: Any)

      public fun tagRules(tagRules: IResolvable)

      public fun tagRules(tagRules: List<Any>)

      public fun tagRules(vararg tagRules: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.RowLevelPermissionTagConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSet.RowLevelPermissionTagConfigurationProperty.builder()

      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      override fun tagRuleConfigurations(tagRuleConfigurations: Any) {
        cdkBuilder.tagRuleConfigurations(tagRuleConfigurations)
      }

      override fun tagRules(tagRules: IResolvable) {
        cdkBuilder.tagRules(tagRules.let(IResolvable::unwrap))
      }

      override fun tagRules(tagRules: List<Any>) {
        cdkBuilder.tagRules(tagRules)
      }

      override fun tagRules(vararg tagRules: Any): Unit = tagRules(tagRules.toList())

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.RowLevelPermissionTagConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.RowLevelPermissionTagConfigurationProperty,
    ) : CdkObject(cdkObject), RowLevelPermissionTagConfigurationProperty {
      override fun status(): String? = unwrap(this).getStatus()

      override fun tagRuleConfigurations(): Any? = unwrap(this).getTagRuleConfigurations()

      override fun tagRules(): Any = unwrap(this).getTagRules()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RowLevelPermissionTagConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.RowLevelPermissionTagConfigurationProperty):
          RowLevelPermissionTagConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RowLevelPermissionTagConfigurationProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.RowLevelPermissionTagConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.RowLevelPermissionTagConfigurationProperty
    }
  }

  public interface ColumnLevelPermissionRuleProperty {
    public fun columnNames(): List<String> = unwrap(this).getColumnNames() ?: emptyList()

    public fun principals(): List<String> = unwrap(this).getPrincipals() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun columnNames(columnNames: List<String>)

      public fun columnNames(vararg columnNames: String)

      public fun principals(principals: List<String>)

      public fun principals(vararg principals: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnLevelPermissionRuleProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnLevelPermissionRuleProperty.builder()

      override fun columnNames(columnNames: List<String>) {
        cdkBuilder.columnNames(columnNames)
      }

      override fun columnNames(vararg columnNames: String): Unit = columnNames(columnNames.toList())

      override fun principals(principals: List<String>) {
        cdkBuilder.principals(principals)
      }

      override fun principals(vararg principals: String): Unit = principals(principals.toList())

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnLevelPermissionRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnLevelPermissionRuleProperty,
    ) : CdkObject(cdkObject), ColumnLevelPermissionRuleProperty {
      override fun columnNames(): List<String> = unwrap(this).getColumnNames() ?: emptyList()

      override fun principals(): List<String> = unwrap(this).getPrincipals() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ColumnLevelPermissionRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnLevelPermissionRuleProperty):
          ColumnLevelPermissionRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ColumnLevelPermissionRuleProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnLevelPermissionRuleProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnLevelPermissionRuleProperty
    }
  }

  public interface IncrementalRefreshProperty {
    public fun lookbackWindow(): Any? = unwrap(this).getLookbackWindow()

    @CdkDslMarker
    public interface Builder {
      public fun lookbackWindow(lookbackWindow: IResolvable)

      public fun lookbackWindow(lookbackWindow: LookbackWindowProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d076a231dab6dc3cf3a9fb65a3c9a1529398d973f5242a3f7841ec7d88b58222")
      public fun lookbackWindow(lookbackWindow: LookbackWindowProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.IncrementalRefreshProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.IncrementalRefreshProperty.builder()

      override fun lookbackWindow(lookbackWindow: IResolvable) {
        cdkBuilder.lookbackWindow(lookbackWindow.let(IResolvable::unwrap))
      }

      override fun lookbackWindow(lookbackWindow: LookbackWindowProperty) {
        cdkBuilder.lookbackWindow(lookbackWindow.let(LookbackWindowProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d076a231dab6dc3cf3a9fb65a3c9a1529398d973f5242a3f7841ec7d88b58222")
      override fun lookbackWindow(lookbackWindow: LookbackWindowProperty.Builder.() -> Unit): Unit =
          lookbackWindow(LookbackWindowProperty(lookbackWindow))

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.IncrementalRefreshProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.IncrementalRefreshProperty,
    ) : CdkObject(cdkObject), IncrementalRefreshProperty {
      override fun lookbackWindow(): Any? = unwrap(this).getLookbackWindow()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IncrementalRefreshProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.IncrementalRefreshProperty):
          IncrementalRefreshProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IncrementalRefreshProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.IncrementalRefreshProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.IncrementalRefreshProperty
    }
  }

  public interface CastColumnTypeOperationProperty {
    public fun columnName(): String

    public fun format(): String? = unwrap(this).getFormat()

    public fun newColumnType(): String

    public fun subType(): String? = unwrap(this).getSubType()

    @CdkDslMarker
    public interface Builder {
      public fun columnName(columnName: String)

      public fun format(format: String)

      public fun newColumnType(newColumnType: String)

      public fun subType(subType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.CastColumnTypeOperationProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSet.CastColumnTypeOperationProperty.builder()

      override fun columnName(columnName: String) {
        cdkBuilder.columnName(columnName)
      }

      override fun format(format: String) {
        cdkBuilder.format(format)
      }

      override fun newColumnType(newColumnType: String) {
        cdkBuilder.newColumnType(newColumnType)
      }

      override fun subType(subType: String) {
        cdkBuilder.subType(subType)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.CastColumnTypeOperationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.CastColumnTypeOperationProperty,
    ) : CdkObject(cdkObject), CastColumnTypeOperationProperty {
      override fun columnName(): String = unwrap(this).getColumnName()

      override fun format(): String? = unwrap(this).getFormat()

      override fun newColumnType(): String = unwrap(this).getNewColumnType()

      override fun subType(): String? = unwrap(this).getSubType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CastColumnTypeOperationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.CastColumnTypeOperationProperty):
          CastColumnTypeOperationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CastColumnTypeOperationProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.CastColumnTypeOperationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.CastColumnTypeOperationProperty
    }
  }

  public interface DataSetRefreshPropertiesProperty {
    public fun refreshConfiguration(): Any? = unwrap(this).getRefreshConfiguration()

    @CdkDslMarker
    public interface Builder {
      public fun refreshConfiguration(refreshConfiguration: IResolvable)

      public fun refreshConfiguration(refreshConfiguration: RefreshConfigurationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d891b94496204b23a10ded06cb3c53dc1ea32e4458deafff5a702f6b82b61370")
      public
          fun refreshConfiguration(refreshConfiguration: RefreshConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.DataSetRefreshPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSet.DataSetRefreshPropertiesProperty.builder()

      override fun refreshConfiguration(refreshConfiguration: IResolvable) {
        cdkBuilder.refreshConfiguration(refreshConfiguration.let(IResolvable::unwrap))
      }

      override fun refreshConfiguration(refreshConfiguration: RefreshConfigurationProperty) {
        cdkBuilder.refreshConfiguration(refreshConfiguration.let(RefreshConfigurationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d891b94496204b23a10ded06cb3c53dc1ea32e4458deafff5a702f6b82b61370")
      override
          fun refreshConfiguration(refreshConfiguration: RefreshConfigurationProperty.Builder.() -> Unit):
          Unit = refreshConfiguration(RefreshConfigurationProperty(refreshConfiguration))

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.DataSetRefreshPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.DataSetRefreshPropertiesProperty,
    ) : CdkObject(cdkObject), DataSetRefreshPropertiesProperty {
      override fun refreshConfiguration(): Any? = unwrap(this).getRefreshConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataSetRefreshPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.DataSetRefreshPropertiesProperty):
          DataSetRefreshPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataSetRefreshPropertiesProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.DataSetRefreshPropertiesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.DataSetRefreshPropertiesProperty
    }
  }

  public interface IntegerDatasetParameterProperty {
    public fun defaultValues(): Any? = unwrap(this).getDefaultValues()

    public fun id(): String

    public fun name(): String

    public fun valueType(): String

    @CdkDslMarker
    public interface Builder {
      public fun defaultValues(defaultValues: IResolvable)

      public fun defaultValues(defaultValues: IntegerDatasetParameterDefaultValuesProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2daeb77ff7c0cbcf3bdf7652790fef761fdb217132b7eb4fe84902632c02b9d1")
      public
          fun defaultValues(defaultValues: IntegerDatasetParameterDefaultValuesProperty.Builder.() -> Unit)

      public fun id(id: String)

      public fun name(name: String)

      public fun valueType(valueType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.IntegerDatasetParameterProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSet.IntegerDatasetParameterProperty.builder()

      override fun defaultValues(defaultValues: IResolvable) {
        cdkBuilder.defaultValues(defaultValues.let(IResolvable::unwrap))
      }

      override fun defaultValues(defaultValues: IntegerDatasetParameterDefaultValuesProperty) {
        cdkBuilder.defaultValues(defaultValues.let(IntegerDatasetParameterDefaultValuesProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2daeb77ff7c0cbcf3bdf7652790fef761fdb217132b7eb4fe84902632c02b9d1")
      override
          fun defaultValues(defaultValues: IntegerDatasetParameterDefaultValuesProperty.Builder.() -> Unit):
          Unit = defaultValues(IntegerDatasetParameterDefaultValuesProperty(defaultValues))

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun valueType(valueType: String) {
        cdkBuilder.valueType(valueType)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.IntegerDatasetParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.IntegerDatasetParameterProperty,
    ) : CdkObject(cdkObject), IntegerDatasetParameterProperty {
      override fun defaultValues(): Any? = unwrap(this).getDefaultValues()

      override fun id(): String = unwrap(this).getId()

      override fun name(): String = unwrap(this).getName()

      override fun valueType(): String = unwrap(this).getValueType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IntegerDatasetParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.IntegerDatasetParameterProperty):
          IntegerDatasetParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IntegerDatasetParameterProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.IntegerDatasetParameterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.IntegerDatasetParameterProperty
    }
  }

  public interface DataSetUsageConfigurationProperty {
    public fun disableUseAsDirectQuerySource(): Any? =
        unwrap(this).getDisableUseAsDirectQuerySource()

    public fun disableUseAsImportedSource(): Any? = unwrap(this).getDisableUseAsImportedSource()

    @CdkDslMarker
    public interface Builder {
      public fun disableUseAsDirectQuerySource(disableUseAsDirectQuerySource: Boolean)

      public fun disableUseAsDirectQuerySource(disableUseAsDirectQuerySource: IResolvable)

      public fun disableUseAsImportedSource(disableUseAsImportedSource: Boolean)

      public fun disableUseAsImportedSource(disableUseAsImportedSource: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.DataSetUsageConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSet.DataSetUsageConfigurationProperty.builder()

      override fun disableUseAsDirectQuerySource(disableUseAsDirectQuerySource: Boolean) {
        cdkBuilder.disableUseAsDirectQuerySource(disableUseAsDirectQuerySource)
      }

      override fun disableUseAsDirectQuerySource(disableUseAsDirectQuerySource: IResolvable) {
        cdkBuilder.disableUseAsDirectQuerySource(disableUseAsDirectQuerySource.let(IResolvable::unwrap))
      }

      override fun disableUseAsImportedSource(disableUseAsImportedSource: Boolean) {
        cdkBuilder.disableUseAsImportedSource(disableUseAsImportedSource)
      }

      override fun disableUseAsImportedSource(disableUseAsImportedSource: IResolvable) {
        cdkBuilder.disableUseAsImportedSource(disableUseAsImportedSource.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.DataSetUsageConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.DataSetUsageConfigurationProperty,
    ) : CdkObject(cdkObject), DataSetUsageConfigurationProperty {
      override fun disableUseAsDirectQuerySource(): Any? =
          unwrap(this).getDisableUseAsDirectQuerySource()

      override fun disableUseAsImportedSource(): Any? = unwrap(this).getDisableUseAsImportedSource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DataSetUsageConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.DataSetUsageConfigurationProperty):
          DataSetUsageConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataSetUsageConfigurationProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.DataSetUsageConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.DataSetUsageConfigurationProperty
    }
  }

  public interface StringDatasetParameterDefaultValuesProperty {
    public fun staticValues(): List<String> = unwrap(this).getStaticValues() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun staticValues(staticValues: List<String>)

      public fun staticValues(vararg staticValues: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.StringDatasetParameterDefaultValuesProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSet.StringDatasetParameterDefaultValuesProperty.builder()

      override fun staticValues(staticValues: List<String>) {
        cdkBuilder.staticValues(staticValues)
      }

      override fun staticValues(vararg staticValues: String): Unit =
          staticValues(staticValues.toList())

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.StringDatasetParameterDefaultValuesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.StringDatasetParameterDefaultValuesProperty,
    ) : CdkObject(cdkObject), StringDatasetParameterDefaultValuesProperty {
      override fun staticValues(): List<String> = unwrap(this).getStaticValues() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          StringDatasetParameterDefaultValuesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.StringDatasetParameterDefaultValuesProperty):
          StringDatasetParameterDefaultValuesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StringDatasetParameterDefaultValuesProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.StringDatasetParameterDefaultValuesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.StringDatasetParameterDefaultValuesProperty
    }
  }

  public interface FieldFolderProperty {
    public fun columns(): List<String> = unwrap(this).getColumns() ?: emptyList()

    public fun description(): String? = unwrap(this).getDescription()

    @CdkDslMarker
    public interface Builder {
      public fun columns(columns: List<String>)

      public fun columns(vararg columns: String)

      public fun description(description: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.FieldFolderProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.FieldFolderProperty.builder()

      override fun columns(columns: List<String>) {
        cdkBuilder.columns(columns)
      }

      override fun columns(vararg columns: String): Unit = columns(columns.toList())

      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      public fun build(): software.amazon.awscdk.services.quicksight.CfnDataSet.FieldFolderProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.FieldFolderProperty,
    ) : CdkObject(cdkObject), FieldFolderProperty {
      override fun columns(): List<String> = unwrap(this).getColumns() ?: emptyList()

      override fun description(): String? = unwrap(this).getDescription()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FieldFolderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.FieldFolderProperty):
          FieldFolderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FieldFolderProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.FieldFolderProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.FieldFolderProperty
    }
  }

  public interface IngestionWaitPolicyProperty {
    public fun ingestionWaitTimeInHours(): Number? = unwrap(this).getIngestionWaitTimeInHours()

    public fun waitForSpiceIngestion(): Any? = unwrap(this).getWaitForSpiceIngestion()

    @CdkDslMarker
    public interface Builder {
      public fun ingestionWaitTimeInHours(ingestionWaitTimeInHours: Number)

      public fun waitForSpiceIngestion(waitForSpiceIngestion: Boolean)

      public fun waitForSpiceIngestion(waitForSpiceIngestion: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.IngestionWaitPolicyProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSet.IngestionWaitPolicyProperty.builder()

      override fun ingestionWaitTimeInHours(ingestionWaitTimeInHours: Number) {
        cdkBuilder.ingestionWaitTimeInHours(ingestionWaitTimeInHours)
      }

      override fun waitForSpiceIngestion(waitForSpiceIngestion: Boolean) {
        cdkBuilder.waitForSpiceIngestion(waitForSpiceIngestion)
      }

      override fun waitForSpiceIngestion(waitForSpiceIngestion: IResolvable) {
        cdkBuilder.waitForSpiceIngestion(waitForSpiceIngestion.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.IngestionWaitPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.IngestionWaitPolicyProperty,
    ) : CdkObject(cdkObject), IngestionWaitPolicyProperty {
      override fun ingestionWaitTimeInHours(): Number? = unwrap(this).getIngestionWaitTimeInHours()

      override fun waitForSpiceIngestion(): Any? = unwrap(this).getWaitForSpiceIngestion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IngestionWaitPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.IngestionWaitPolicyProperty):
          IngestionWaitPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IngestionWaitPolicyProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.IngestionWaitPolicyProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.IngestionWaitPolicyProperty
    }
  }

  public interface PhysicalTableProperty {
    public fun customSql(): Any? = unwrap(this).getCustomSql()

    public fun relationalTable(): Any? = unwrap(this).getRelationalTable()

    public fun s3Source(): Any? = unwrap(this).getS3Source()

    @CdkDslMarker
    public interface Builder {
      public fun customSql(customSql: IResolvable)

      public fun customSql(customSql: CustomSqlProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8de2d027c27adb7e5f1f7a599bce2a6399996a50fabec8fada20668496532c7c")
      public fun customSql(customSql: CustomSqlProperty.Builder.() -> Unit)

      public fun relationalTable(relationalTable: IResolvable)

      public fun relationalTable(relationalTable: RelationalTableProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("be2a184082d73e5397cfd6d7000e53e720afba2eab436dc45d9ec51f638b4d04")
      public fun relationalTable(relationalTable: RelationalTableProperty.Builder.() -> Unit)

      public fun s3Source(s3Source: IResolvable)

      public fun s3Source(s3Source: S3SourceProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5dfdad1d62a931b579a50d56da812a5bec396add755a6c823646e44fa76cd35f")
      public fun s3Source(s3Source: S3SourceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.PhysicalTableProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.PhysicalTableProperty.builder()

      override fun customSql(customSql: IResolvable) {
        cdkBuilder.customSql(customSql.let(IResolvable::unwrap))
      }

      override fun customSql(customSql: CustomSqlProperty) {
        cdkBuilder.customSql(customSql.let(CustomSqlProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8de2d027c27adb7e5f1f7a599bce2a6399996a50fabec8fada20668496532c7c")
      override fun customSql(customSql: CustomSqlProperty.Builder.() -> Unit): Unit =
          customSql(CustomSqlProperty(customSql))

      override fun relationalTable(relationalTable: IResolvable) {
        cdkBuilder.relationalTable(relationalTable.let(IResolvable::unwrap))
      }

      override fun relationalTable(relationalTable: RelationalTableProperty) {
        cdkBuilder.relationalTable(relationalTable.let(RelationalTableProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("be2a184082d73e5397cfd6d7000e53e720afba2eab436dc45d9ec51f638b4d04")
      override fun relationalTable(relationalTable: RelationalTableProperty.Builder.() -> Unit):
          Unit = relationalTable(RelationalTableProperty(relationalTable))

      override fun s3Source(s3Source: IResolvable) {
        cdkBuilder.s3Source(s3Source.let(IResolvable::unwrap))
      }

      override fun s3Source(s3Source: S3SourceProperty) {
        cdkBuilder.s3Source(s3Source.let(S3SourceProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5dfdad1d62a931b579a50d56da812a5bec396add755a6c823646e44fa76cd35f")
      override fun s3Source(s3Source: S3SourceProperty.Builder.() -> Unit): Unit =
          s3Source(S3SourceProperty(s3Source))

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.PhysicalTableProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.PhysicalTableProperty,
    ) : CdkObject(cdkObject), PhysicalTableProperty {
      override fun customSql(): Any? = unwrap(this).getCustomSql()

      override fun relationalTable(): Any? = unwrap(this).getRelationalTable()

      override fun s3Source(): Any? = unwrap(this).getS3Source()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PhysicalTableProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.PhysicalTableProperty):
          PhysicalTableProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PhysicalTableProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.PhysicalTableProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.PhysicalTableProperty
    }
  }

  public interface TagColumnOperationProperty {
    public fun columnName(): String

    public fun tags(): List<ColumnTagProperty>

    @CdkDslMarker
    public interface Builder {
      public fun columnName(columnName: String)

      public fun tags(tags: List<ColumnTagProperty>)

      public fun tags(vararg tags: ColumnTagProperty)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.TagColumnOperationProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.TagColumnOperationProperty.builder()

      override fun columnName(columnName: String) {
        cdkBuilder.columnName(columnName)
      }

      override fun tags(tags: List<ColumnTagProperty>) {
        cdkBuilder.tags(tags.map(ColumnTagProperty::unwrap))
      }

      override fun tags(vararg tags: ColumnTagProperty): Unit = tags(tags.toList())

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.TagColumnOperationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.TagColumnOperationProperty,
    ) : CdkObject(cdkObject), TagColumnOperationProperty {
      override fun columnName(): String = unwrap(this).getColumnName()

      override fun tags(): List<ColumnTagProperty> =
          unwrap(this).getTags().map(ColumnTagProperty::wrap)
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TagColumnOperationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.TagColumnOperationProperty):
          TagColumnOperationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagColumnOperationProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.TagColumnOperationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.TagColumnOperationProperty
    }
  }

  public interface RenameColumnOperationProperty {
    public fun columnName(): String

    public fun newColumnName(): String

    @CdkDslMarker
    public interface Builder {
      public fun columnName(columnName: String)

      public fun newColumnName(newColumnName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.RenameColumnOperationProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSet.RenameColumnOperationProperty.builder()

      override fun columnName(columnName: String) {
        cdkBuilder.columnName(columnName)
      }

      override fun newColumnName(newColumnName: String) {
        cdkBuilder.newColumnName(newColumnName)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.RenameColumnOperationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.RenameColumnOperationProperty,
    ) : CdkObject(cdkObject), RenameColumnOperationProperty {
      override fun columnName(): String = unwrap(this).getColumnName()

      override fun newColumnName(): String = unwrap(this).getNewColumnName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RenameColumnOperationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.RenameColumnOperationProperty):
          RenameColumnOperationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RenameColumnOperationProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.RenameColumnOperationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.RenameColumnOperationProperty
    }
  }

  public interface OutputColumnProperty {
    public fun description(): String? = unwrap(this).getDescription()

    public fun name(): String? = unwrap(this).getName()

    public fun subType(): String? = unwrap(this).getSubType()

    public fun type(): String? = unwrap(this).getType()

    @CdkDslMarker
    public interface Builder {
      public fun description(description: String)

      public fun name(name: String)

      public fun subType(subType: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.OutputColumnProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.OutputColumnProperty.builder()

      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun subType(subType: String) {
        cdkBuilder.subType(subType)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.quicksight.CfnDataSet.OutputColumnProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.OutputColumnProperty,
    ) : CdkObject(cdkObject), OutputColumnProperty {
      override fun description(): String? = unwrap(this).getDescription()

      override fun name(): String? = unwrap(this).getName()

      override fun subType(): String? = unwrap(this).getSubType()

      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OutputColumnProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.OutputColumnProperty):
          OutputColumnProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutputColumnProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.OutputColumnProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.OutputColumnProperty
    }
  }

  public interface JoinInstructionProperty {
    public fun leftJoinKeyProperties(): Any? = unwrap(this).getLeftJoinKeyProperties()

    public fun leftOperand(): String

    public fun onClause(): String

    public fun rightJoinKeyProperties(): Any? = unwrap(this).getRightJoinKeyProperties()

    public fun rightOperand(): String

    public fun type(): String

    @CdkDslMarker
    public interface Builder {
      public fun leftJoinKeyProperties(leftJoinKeyProperties: IResolvable)

      public fun leftJoinKeyProperties(leftJoinKeyProperties: JoinKeyPropertiesProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4f6bf66b353192d5d5f0d33473549da91857329984caf2c9af6d5b962e468cf3")
      public
          fun leftJoinKeyProperties(leftJoinKeyProperties: JoinKeyPropertiesProperty.Builder.() -> Unit)

      public fun leftOperand(leftOperand: String)

      public fun onClause(onClause: String)

      public fun rightJoinKeyProperties(rightJoinKeyProperties: IResolvable)

      public fun rightJoinKeyProperties(rightJoinKeyProperties: JoinKeyPropertiesProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4672d23539b90c146309955541614b7a84ca676bdc60189367ca70eb534eca8e")
      public
          fun rightJoinKeyProperties(rightJoinKeyProperties: JoinKeyPropertiesProperty.Builder.() -> Unit)

      public fun rightOperand(rightOperand: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.JoinInstructionProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.JoinInstructionProperty.builder()

      override fun leftJoinKeyProperties(leftJoinKeyProperties: IResolvable) {
        cdkBuilder.leftJoinKeyProperties(leftJoinKeyProperties.let(IResolvable::unwrap))
      }

      override fun leftJoinKeyProperties(leftJoinKeyProperties: JoinKeyPropertiesProperty) {
        cdkBuilder.leftJoinKeyProperties(leftJoinKeyProperties.let(JoinKeyPropertiesProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4f6bf66b353192d5d5f0d33473549da91857329984caf2c9af6d5b962e468cf3")
      override
          fun leftJoinKeyProperties(leftJoinKeyProperties: JoinKeyPropertiesProperty.Builder.() -> Unit):
          Unit = leftJoinKeyProperties(JoinKeyPropertiesProperty(leftJoinKeyProperties))

      override fun leftOperand(leftOperand: String) {
        cdkBuilder.leftOperand(leftOperand)
      }

      override fun onClause(onClause: String) {
        cdkBuilder.onClause(onClause)
      }

      override fun rightJoinKeyProperties(rightJoinKeyProperties: IResolvable) {
        cdkBuilder.rightJoinKeyProperties(rightJoinKeyProperties.let(IResolvable::unwrap))
      }

      override fun rightJoinKeyProperties(rightJoinKeyProperties: JoinKeyPropertiesProperty) {
        cdkBuilder.rightJoinKeyProperties(rightJoinKeyProperties.let(JoinKeyPropertiesProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4672d23539b90c146309955541614b7a84ca676bdc60189367ca70eb534eca8e")
      override
          fun rightJoinKeyProperties(rightJoinKeyProperties: JoinKeyPropertiesProperty.Builder.() -> Unit):
          Unit = rightJoinKeyProperties(JoinKeyPropertiesProperty(rightJoinKeyProperties))

      override fun rightOperand(rightOperand: String) {
        cdkBuilder.rightOperand(rightOperand)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.JoinInstructionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.JoinInstructionProperty,
    ) : CdkObject(cdkObject), JoinInstructionProperty {
      override fun leftJoinKeyProperties(): Any? = unwrap(this).getLeftJoinKeyProperties()

      override fun leftOperand(): String = unwrap(this).getLeftOperand()

      override fun onClause(): String = unwrap(this).getOnClause()

      override fun rightJoinKeyProperties(): Any? = unwrap(this).getRightJoinKeyProperties()

      override fun rightOperand(): String = unwrap(this).getRightOperand()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): JoinInstructionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.JoinInstructionProperty):
          JoinInstructionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JoinInstructionProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.JoinInstructionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.JoinInstructionProperty
    }
  }

  public interface ProjectOperationProperty {
    public fun projectedColumns(): List<String>

    @CdkDslMarker
    public interface Builder {
      public fun projectedColumns(projectedColumns: List<String>)

      public fun projectedColumns(vararg projectedColumns: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.ProjectOperationProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.ProjectOperationProperty.builder()

      override fun projectedColumns(projectedColumns: List<String>) {
        cdkBuilder.projectedColumns(projectedColumns)
      }

      override fun projectedColumns(vararg projectedColumns: String): Unit =
          projectedColumns(projectedColumns.toList())

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.ProjectOperationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.ProjectOperationProperty,
    ) : CdkObject(cdkObject), ProjectOperationProperty {
      override fun projectedColumns(): List<String> = unwrap(this).getProjectedColumns()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProjectOperationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.ProjectOperationProperty):
          ProjectOperationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProjectOperationProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.ProjectOperationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.ProjectOperationProperty
    }
  }

  public interface DecimalDatasetParameterDefaultValuesProperty {
    public fun staticValues(): Any? = unwrap(this).getStaticValues()

    @CdkDslMarker
    public interface Builder {
      public fun staticValues(staticValues: IResolvable)

      public fun staticValues(staticValues: List<Number>)

      public fun staticValues(vararg staticValues: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.DecimalDatasetParameterDefaultValuesProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSet.DecimalDatasetParameterDefaultValuesProperty.builder()

      override fun staticValues(staticValues: IResolvable) {
        cdkBuilder.staticValues(staticValues.let(IResolvable::unwrap))
      }

      override fun staticValues(staticValues: List<Number>) {
        cdkBuilder.staticValues(staticValues)
      }

      override fun staticValues(vararg staticValues: Number): Unit =
          staticValues(staticValues.toList())

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.DecimalDatasetParameterDefaultValuesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.DecimalDatasetParameterDefaultValuesProperty,
    ) : CdkObject(cdkObject), DecimalDatasetParameterDefaultValuesProperty {
      override fun staticValues(): Any? = unwrap(this).getStaticValues()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DecimalDatasetParameterDefaultValuesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.DecimalDatasetParameterDefaultValuesProperty):
          DecimalDatasetParameterDefaultValuesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DecimalDatasetParameterDefaultValuesProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.DecimalDatasetParameterDefaultValuesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.DecimalDatasetParameterDefaultValuesProperty
    }
  }

  public interface CreateColumnsOperationProperty {
    public fun columns(): Any

    @CdkDslMarker
    public interface Builder {
      public fun columns(columns: IResolvable)

      public fun columns(columns: List<Any>)

      public fun columns(vararg columns: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.CreateColumnsOperationProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSet.CreateColumnsOperationProperty.builder()

      override fun columns(columns: IResolvable) {
        cdkBuilder.columns(columns.let(IResolvable::unwrap))
      }

      override fun columns(columns: List<Any>) {
        cdkBuilder.columns(columns)
      }

      override fun columns(vararg columns: Any): Unit = columns(columns.toList())

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.CreateColumnsOperationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.CreateColumnsOperationProperty,
    ) : CdkObject(cdkObject), CreateColumnsOperationProperty {
      override fun columns(): Any = unwrap(this).getColumns()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CreateColumnsOperationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.CreateColumnsOperationProperty):
          CreateColumnsOperationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CreateColumnsOperationProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.CreateColumnsOperationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.CreateColumnsOperationProperty
    }
  }

  public interface CustomSqlProperty {
    public fun columns(): Any

    public fun dataSourceArn(): String

    public fun name(): String

    public fun sqlQuery(): String

    @CdkDslMarker
    public interface Builder {
      public fun columns(columns: IResolvable)

      public fun columns(columns: List<Any>)

      public fun columns(vararg columns: Any)

      public fun dataSourceArn(dataSourceArn: String)

      public fun name(name: String)

      public fun sqlQuery(sqlQuery: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.CustomSqlProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.CustomSqlProperty.builder()

      override fun columns(columns: IResolvable) {
        cdkBuilder.columns(columns.let(IResolvable::unwrap))
      }

      override fun columns(columns: List<Any>) {
        cdkBuilder.columns(columns)
      }

      override fun columns(vararg columns: Any): Unit = columns(columns.toList())

      override fun dataSourceArn(dataSourceArn: String) {
        cdkBuilder.dataSourceArn(dataSourceArn)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun sqlQuery(sqlQuery: String) {
        cdkBuilder.sqlQuery(sqlQuery)
      }

      public fun build(): software.amazon.awscdk.services.quicksight.CfnDataSet.CustomSqlProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.CustomSqlProperty,
    ) : CdkObject(cdkObject), CustomSqlProperty {
      override fun columns(): Any = unwrap(this).getColumns()

      override fun dataSourceArn(): String = unwrap(this).getDataSourceArn()

      override fun name(): String = unwrap(this).getName()

      override fun sqlQuery(): String = unwrap(this).getSqlQuery()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomSqlProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.CustomSqlProperty):
          CustomSqlProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomSqlProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.CustomSqlProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.CustomSqlProperty
    }
  }

  public interface LookbackWindowProperty {
    public fun columnName(): String? = unwrap(this).getColumnName()

    public fun size(): Number? = unwrap(this).getSize()

    public fun sizeUnit(): String? = unwrap(this).getSizeUnit()

    @CdkDslMarker
    public interface Builder {
      public fun columnName(columnName: String)

      public fun size(size: Number)

      public fun sizeUnit(sizeUnit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.LookbackWindowProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.LookbackWindowProperty.builder()

      override fun columnName(columnName: String) {
        cdkBuilder.columnName(columnName)
      }

      override fun size(size: Number) {
        cdkBuilder.size(size)
      }

      override fun sizeUnit(sizeUnit: String) {
        cdkBuilder.sizeUnit(sizeUnit)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.LookbackWindowProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.LookbackWindowProperty,
    ) : CdkObject(cdkObject), LookbackWindowProperty {
      override fun columnName(): String? = unwrap(this).getColumnName()

      override fun size(): Number? = unwrap(this).getSize()

      override fun sizeUnit(): String? = unwrap(this).getSizeUnit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LookbackWindowProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.LookbackWindowProperty):
          LookbackWindowProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LookbackWindowProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.LookbackWindowProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.LookbackWindowProperty
    }
  }

  public interface StringDatasetParameterProperty {
    public fun defaultValues(): Any? = unwrap(this).getDefaultValues()

    public fun id(): String

    public fun name(): String

    public fun valueType(): String

    @CdkDslMarker
    public interface Builder {
      public fun defaultValues(defaultValues: IResolvable)

      public fun defaultValues(defaultValues: StringDatasetParameterDefaultValuesProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3b730fe8fa5c0757a1266803319e3af2848421d9dbf9ce8d93af1f6b8fbffd1c")
      public
          fun defaultValues(defaultValues: StringDatasetParameterDefaultValuesProperty.Builder.() -> Unit)

      public fun id(id: String)

      public fun name(name: String)

      public fun valueType(valueType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.StringDatasetParameterProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSet.StringDatasetParameterProperty.builder()

      override fun defaultValues(defaultValues: IResolvable) {
        cdkBuilder.defaultValues(defaultValues.let(IResolvable::unwrap))
      }

      override fun defaultValues(defaultValues: StringDatasetParameterDefaultValuesProperty) {
        cdkBuilder.defaultValues(defaultValues.let(StringDatasetParameterDefaultValuesProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3b730fe8fa5c0757a1266803319e3af2848421d9dbf9ce8d93af1f6b8fbffd1c")
      override
          fun defaultValues(defaultValues: StringDatasetParameterDefaultValuesProperty.Builder.() -> Unit):
          Unit = defaultValues(StringDatasetParameterDefaultValuesProperty(defaultValues))

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun valueType(valueType: String) {
        cdkBuilder.valueType(valueType)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.StringDatasetParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.StringDatasetParameterProperty,
    ) : CdkObject(cdkObject), StringDatasetParameterProperty {
      override fun defaultValues(): Any? = unwrap(this).getDefaultValues()

      override fun id(): String = unwrap(this).getId()

      override fun name(): String = unwrap(this).getName()

      override fun valueType(): String = unwrap(this).getValueType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StringDatasetParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.StringDatasetParameterProperty):
          StringDatasetParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StringDatasetParameterProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.StringDatasetParameterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.StringDatasetParameterProperty
    }
  }

  public interface LogicalTableSourceProperty {
    public fun dataSetArn(): String? = unwrap(this).getDataSetArn()

    public fun joinInstruction(): Any? = unwrap(this).getJoinInstruction()

    public fun physicalTableId(): String? = unwrap(this).getPhysicalTableId()

    @CdkDslMarker
    public interface Builder {
      public fun dataSetArn(dataSetArn: String)

      public fun joinInstruction(joinInstruction: IResolvable)

      public fun joinInstruction(joinInstruction: JoinInstructionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e7ea6b5366702ab36457018199798fdc810eae14d8d5cdaf970720af73cb2df5")
      public fun joinInstruction(joinInstruction: JoinInstructionProperty.Builder.() -> Unit)

      public fun physicalTableId(physicalTableId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.LogicalTableSourceProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.LogicalTableSourceProperty.builder()

      override fun dataSetArn(dataSetArn: String) {
        cdkBuilder.dataSetArn(dataSetArn)
      }

      override fun joinInstruction(joinInstruction: IResolvable) {
        cdkBuilder.joinInstruction(joinInstruction.let(IResolvable::unwrap))
      }

      override fun joinInstruction(joinInstruction: JoinInstructionProperty) {
        cdkBuilder.joinInstruction(joinInstruction.let(JoinInstructionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e7ea6b5366702ab36457018199798fdc810eae14d8d5cdaf970720af73cb2df5")
      override fun joinInstruction(joinInstruction: JoinInstructionProperty.Builder.() -> Unit):
          Unit = joinInstruction(JoinInstructionProperty(joinInstruction))

      override fun physicalTableId(physicalTableId: String) {
        cdkBuilder.physicalTableId(physicalTableId)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.LogicalTableSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.LogicalTableSourceProperty,
    ) : CdkObject(cdkObject), LogicalTableSourceProperty {
      override fun dataSetArn(): String? = unwrap(this).getDataSetArn()

      override fun joinInstruction(): Any? = unwrap(this).getJoinInstruction()

      override fun physicalTableId(): String? = unwrap(this).getPhysicalTableId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LogicalTableSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.LogicalTableSourceProperty):
          LogicalTableSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogicalTableSourceProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.LogicalTableSourceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.LogicalTableSourceProperty
    }
  }

  public interface DateTimeDatasetParameterProperty {
    public fun defaultValues(): Any? = unwrap(this).getDefaultValues()

    public fun id(): String

    public fun name(): String

    public fun timeGranularity(): String? = unwrap(this).getTimeGranularity()

    public fun valueType(): String

    @CdkDslMarker
    public interface Builder {
      public fun defaultValues(defaultValues: IResolvable)

      public fun defaultValues(defaultValues: DateTimeDatasetParameterDefaultValuesProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("18c7ba88abd5d85c222d29ce524830651a4b6470b535202ff31fcd450f7e03c7")
      public
          fun defaultValues(defaultValues: DateTimeDatasetParameterDefaultValuesProperty.Builder.() -> Unit)

      public fun id(id: String)

      public fun name(name: String)

      public fun timeGranularity(timeGranularity: String)

      public fun valueType(valueType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.DateTimeDatasetParameterProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSet.DateTimeDatasetParameterProperty.builder()

      override fun defaultValues(defaultValues: IResolvable) {
        cdkBuilder.defaultValues(defaultValues.let(IResolvable::unwrap))
      }

      override fun defaultValues(defaultValues: DateTimeDatasetParameterDefaultValuesProperty) {
        cdkBuilder.defaultValues(defaultValues.let(DateTimeDatasetParameterDefaultValuesProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("18c7ba88abd5d85c222d29ce524830651a4b6470b535202ff31fcd450f7e03c7")
      override
          fun defaultValues(defaultValues: DateTimeDatasetParameterDefaultValuesProperty.Builder.() -> Unit):
          Unit = defaultValues(DateTimeDatasetParameterDefaultValuesProperty(defaultValues))

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun timeGranularity(timeGranularity: String) {
        cdkBuilder.timeGranularity(timeGranularity)
      }

      override fun valueType(valueType: String) {
        cdkBuilder.valueType(valueType)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.DateTimeDatasetParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.DateTimeDatasetParameterProperty,
    ) : CdkObject(cdkObject), DateTimeDatasetParameterProperty {
      override fun defaultValues(): Any? = unwrap(this).getDefaultValues()

      override fun id(): String = unwrap(this).getId()

      override fun name(): String = unwrap(this).getName()

      override fun timeGranularity(): String? = unwrap(this).getTimeGranularity()

      override fun valueType(): String = unwrap(this).getValueType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DateTimeDatasetParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.DateTimeDatasetParameterProperty):
          DateTimeDatasetParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DateTimeDatasetParameterProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.DateTimeDatasetParameterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.DateTimeDatasetParameterProperty
    }
  }

  public interface IntegerDatasetParameterDefaultValuesProperty {
    public fun staticValues(): Any? = unwrap(this).getStaticValues()

    @CdkDslMarker
    public interface Builder {
      public fun staticValues(staticValues: IResolvable)

      public fun staticValues(staticValues: List<Number>)

      public fun staticValues(vararg staticValues: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.IntegerDatasetParameterDefaultValuesProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSet.IntegerDatasetParameterDefaultValuesProperty.builder()

      override fun staticValues(staticValues: IResolvable) {
        cdkBuilder.staticValues(staticValues.let(IResolvable::unwrap))
      }

      override fun staticValues(staticValues: List<Number>) {
        cdkBuilder.staticValues(staticValues)
      }

      override fun staticValues(vararg staticValues: Number): Unit =
          staticValues(staticValues.toList())

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.IntegerDatasetParameterDefaultValuesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.IntegerDatasetParameterDefaultValuesProperty,
    ) : CdkObject(cdkObject), IntegerDatasetParameterDefaultValuesProperty {
      override fun staticValues(): Any? = unwrap(this).getStaticValues()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          IntegerDatasetParameterDefaultValuesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.IntegerDatasetParameterDefaultValuesProperty):
          IntegerDatasetParameterDefaultValuesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IntegerDatasetParameterDefaultValuesProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.IntegerDatasetParameterDefaultValuesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.IntegerDatasetParameterDefaultValuesProperty
    }
  }

  public interface RefreshConfigurationProperty {
    public fun incrementalRefresh(): Any? = unwrap(this).getIncrementalRefresh()

    @CdkDslMarker
    public interface Builder {
      public fun incrementalRefresh(incrementalRefresh: IResolvable)

      public fun incrementalRefresh(incrementalRefresh: IncrementalRefreshProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4cc1ee90b75ae38ef3dc53f2ef608e46b7e5bb8603b5a23b41319b65fd5c3eed")
      public
          fun incrementalRefresh(incrementalRefresh: IncrementalRefreshProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.RefreshConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSet.RefreshConfigurationProperty.builder()

      override fun incrementalRefresh(incrementalRefresh: IResolvable) {
        cdkBuilder.incrementalRefresh(incrementalRefresh.let(IResolvable::unwrap))
      }

      override fun incrementalRefresh(incrementalRefresh: IncrementalRefreshProperty) {
        cdkBuilder.incrementalRefresh(incrementalRefresh.let(IncrementalRefreshProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4cc1ee90b75ae38ef3dc53f2ef608e46b7e5bb8603b5a23b41319b65fd5c3eed")
      override
          fun incrementalRefresh(incrementalRefresh: IncrementalRefreshProperty.Builder.() -> Unit):
          Unit = incrementalRefresh(IncrementalRefreshProperty(incrementalRefresh))

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.RefreshConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.RefreshConfigurationProperty,
    ) : CdkObject(cdkObject), RefreshConfigurationProperty {
      override fun incrementalRefresh(): Any? = unwrap(this).getIncrementalRefresh()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RefreshConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.RefreshConfigurationProperty):
          RefreshConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RefreshConfigurationProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.RefreshConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.RefreshConfigurationProperty
    }
  }
}
