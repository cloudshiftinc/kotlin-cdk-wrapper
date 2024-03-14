package io.cloudshiftdev.awscdk.services.cassandra

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTable internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cassandra.CfnTable,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun autoScalingSpecifications(): Any? = unwrap(this).getAutoScalingSpecifications()

  public open fun autoScalingSpecifications(`value`: IResolvable) {
    unwrap(this).setAutoScalingSpecifications(`value`.let(IResolvable::unwrap))
  }

  public open fun autoScalingSpecifications(`value`: AutoScalingSpecificationProperty) {
    unwrap(this).setAutoScalingSpecifications(`value`.let(AutoScalingSpecificationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c2130607010229356c6ba6443cdde6ad00f73c7283b808f06a148ca0a6b41056")
  public open
      fun autoScalingSpecifications(`value`: AutoScalingSpecificationProperty.Builder.() -> Unit):
      Unit = autoScalingSpecifications(AutoScalingSpecificationProperty(`value`))

  public open fun billingMode(): Any? = unwrap(this).getBillingMode()

  public open fun billingMode(`value`: IResolvable) {
    unwrap(this).setBillingMode(`value`.let(IResolvable::unwrap))
  }

  public open fun billingMode(`value`: BillingModeProperty) {
    unwrap(this).setBillingMode(`value`.let(BillingModeProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0566a41490d57e7aa3afa772835c7907b1626cd5ee4aa891045a85ac1f9ba0ad")
  public open fun billingMode(`value`: BillingModeProperty.Builder.() -> Unit): Unit =
      billingMode(BillingModeProperty(`value`))

  public open fun clientSideTimestampsEnabled(): Any? =
      unwrap(this).getClientSideTimestampsEnabled()

  public open fun clientSideTimestampsEnabled(`value`: Boolean) {
    unwrap(this).setClientSideTimestampsEnabled(`value`)
  }

  public open fun clientSideTimestampsEnabled(`value`: IResolvable) {
    unwrap(this).setClientSideTimestampsEnabled(`value`.let(IResolvable::unwrap))
  }

  public open fun clusteringKeyColumns(): Any? = unwrap(this).getClusteringKeyColumns()

  public open fun clusteringKeyColumns(`value`: IResolvable) {
    unwrap(this).setClusteringKeyColumns(`value`.let(IResolvable::unwrap))
  }

  public open fun clusteringKeyColumns(__idx_ac66f0: List<Any>) {
    unwrap(this).setClusteringKeyColumns(__idx_ac66f0)
  }

  public open fun defaultTimeToLive(): Number? = unwrap(this).getDefaultTimeToLive()

  public open fun defaultTimeToLive(`value`: Number) {
    unwrap(this).setDefaultTimeToLive(`value`)
  }

  public open fun encryptionSpecification(): Any? = unwrap(this).getEncryptionSpecification()

  public open fun encryptionSpecification(`value`: IResolvable) {
    unwrap(this).setEncryptionSpecification(`value`.let(IResolvable::unwrap))
  }

  public open fun encryptionSpecification(`value`: EncryptionSpecificationProperty) {
    unwrap(this).setEncryptionSpecification(`value`.let(EncryptionSpecificationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e766c2ecd0ddb7d8f1a183745a554c829bd9b747013a5954c5622a546f71ab55")
  public open
      fun encryptionSpecification(`value`: EncryptionSpecificationProperty.Builder.() -> Unit): Unit
      = encryptionSpecification(EncryptionSpecificationProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun keyspaceName(): String = unwrap(this).getKeyspaceName()

  public open fun keyspaceName(`value`: String) {
    unwrap(this).setKeyspaceName(`value`)
  }

  public open fun partitionKeyColumns(): Any = unwrap(this).getPartitionKeyColumns()

  public open fun partitionKeyColumns(`value`: IResolvable) {
    unwrap(this).setPartitionKeyColumns(`value`.let(IResolvable::unwrap))
  }

  public open fun partitionKeyColumns(__idx_ac66f0: List<Any>) {
    unwrap(this).setPartitionKeyColumns(__idx_ac66f0)
  }

  public open fun pointInTimeRecoveryEnabled(): Any? = unwrap(this).getPointInTimeRecoveryEnabled()

  public open fun pointInTimeRecoveryEnabled(`value`: Boolean) {
    unwrap(this).setPointInTimeRecoveryEnabled(`value`)
  }

  public open fun pointInTimeRecoveryEnabled(`value`: IResolvable) {
    unwrap(this).setPointInTimeRecoveryEnabled(`value`.let(IResolvable::unwrap))
  }

  public open fun regularColumns(): Any? = unwrap(this).getRegularColumns()

  public open fun regularColumns(`value`: IResolvable) {
    unwrap(this).setRegularColumns(`value`.let(IResolvable::unwrap))
  }

  public open fun regularColumns(__idx_ac66f0: List<Any>) {
    unwrap(this).setRegularColumns(__idx_ac66f0)
  }

  public open fun replicaSpecifications(): Any? = unwrap(this).getReplicaSpecifications()

  public open fun replicaSpecifications(`value`: IResolvable) {
    unwrap(this).setReplicaSpecifications(`value`.let(IResolvable::unwrap))
  }

  public open fun replicaSpecifications(__idx_ac66f0: List<Any>) {
    unwrap(this).setReplicaSpecifications(__idx_ac66f0)
  }

  public open fun tableName(): String? = unwrap(this).getTableName()

  public open fun tableName(`value`: String) {
    unwrap(this).setTableName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun autoScalingSpecifications(autoScalingSpecifications: IResolvable)

    public
        fun autoScalingSpecifications(autoScalingSpecifications: AutoScalingSpecificationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e766f231662dc2566d0ae3bc2db9b0911ac936f7599d5b543ca9610d4f970383")
    public
        fun autoScalingSpecifications(autoScalingSpecifications: AutoScalingSpecificationProperty.Builder.() -> Unit)

    public fun billingMode(billingMode: IResolvable)

    public fun billingMode(billingMode: BillingModeProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("67ee3519a80b06e9ad6c8f1ae08b363b5907d831f8e0d8fdf71b54ac1f4d6be4")
    public fun billingMode(billingMode: BillingModeProperty.Builder.() -> Unit)

    public fun clientSideTimestampsEnabled(clientSideTimestampsEnabled: Boolean)

    public fun clientSideTimestampsEnabled(clientSideTimestampsEnabled: IResolvable)

    public fun clusteringKeyColumns(clusteringKeyColumns: IResolvable)

    public fun clusteringKeyColumns(clusteringKeyColumns: List<Any>)

    public fun defaultTimeToLive(defaultTimeToLive: Number)

    public fun encryptionSpecification(encryptionSpecification: IResolvable)

    public fun encryptionSpecification(encryptionSpecification: EncryptionSpecificationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b052269454814355570c6aac83180d224f12e28d7e33efe86c977752a15163aa")
    public
        fun encryptionSpecification(encryptionSpecification: EncryptionSpecificationProperty.Builder.() -> Unit)

    public fun keyspaceName(keyspaceName: String)

    public fun partitionKeyColumns(partitionKeyColumns: IResolvable)

    public fun partitionKeyColumns(partitionKeyColumns: List<Any>)

    public fun pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled: Boolean)

    public fun pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled: IResolvable)

    public fun regularColumns(regularColumns: IResolvable)

    public fun regularColumns(regularColumns: List<Any>)

    public fun replicaSpecifications(replicaSpecifications: IResolvable)

    public fun replicaSpecifications(replicaSpecifications: List<Any>)

    public fun tableName(tableName: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cassandra.CfnTable.Builder =
        software.amazon.awscdk.services.cassandra.CfnTable.Builder.create(scope, id)

    override fun autoScalingSpecifications(autoScalingSpecifications: IResolvable) {
      cdkBuilder.autoScalingSpecifications(autoScalingSpecifications.let(IResolvable::unwrap))
    }

    override
        fun autoScalingSpecifications(autoScalingSpecifications: AutoScalingSpecificationProperty) {
      cdkBuilder.autoScalingSpecifications(autoScalingSpecifications.let(AutoScalingSpecificationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e766f231662dc2566d0ae3bc2db9b0911ac936f7599d5b543ca9610d4f970383")
    override
        fun autoScalingSpecifications(autoScalingSpecifications: AutoScalingSpecificationProperty.Builder.() -> Unit):
        Unit =
        autoScalingSpecifications(AutoScalingSpecificationProperty(autoScalingSpecifications))

    override fun billingMode(billingMode: IResolvable) {
      cdkBuilder.billingMode(billingMode.let(IResolvable::unwrap))
    }

    override fun billingMode(billingMode: BillingModeProperty) {
      cdkBuilder.billingMode(billingMode.let(BillingModeProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("67ee3519a80b06e9ad6c8f1ae08b363b5907d831f8e0d8fdf71b54ac1f4d6be4")
    override fun billingMode(billingMode: BillingModeProperty.Builder.() -> Unit): Unit =
        billingMode(BillingModeProperty(billingMode))

    override fun clientSideTimestampsEnabled(clientSideTimestampsEnabled: Boolean) {
      cdkBuilder.clientSideTimestampsEnabled(clientSideTimestampsEnabled)
    }

    override fun clientSideTimestampsEnabled(clientSideTimestampsEnabled: IResolvable) {
      cdkBuilder.clientSideTimestampsEnabled(clientSideTimestampsEnabled.let(IResolvable::unwrap))
    }

    override fun clusteringKeyColumns(clusteringKeyColumns: IResolvable) {
      cdkBuilder.clusteringKeyColumns(clusteringKeyColumns.let(IResolvable::unwrap))
    }

    override fun clusteringKeyColumns(clusteringKeyColumns: List<Any>) {
      cdkBuilder.clusteringKeyColumns(clusteringKeyColumns)
    }

    override fun defaultTimeToLive(defaultTimeToLive: Number) {
      cdkBuilder.defaultTimeToLive(defaultTimeToLive)
    }

    override fun encryptionSpecification(encryptionSpecification: IResolvable) {
      cdkBuilder.encryptionSpecification(encryptionSpecification.let(IResolvable::unwrap))
    }

    override fun encryptionSpecification(encryptionSpecification: EncryptionSpecificationProperty) {
      cdkBuilder.encryptionSpecification(encryptionSpecification.let(EncryptionSpecificationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b052269454814355570c6aac83180d224f12e28d7e33efe86c977752a15163aa")
    override
        fun encryptionSpecification(encryptionSpecification: EncryptionSpecificationProperty.Builder.() -> Unit):
        Unit = encryptionSpecification(EncryptionSpecificationProperty(encryptionSpecification))

    override fun keyspaceName(keyspaceName: String) {
      cdkBuilder.keyspaceName(keyspaceName)
    }

    override fun partitionKeyColumns(partitionKeyColumns: IResolvable) {
      cdkBuilder.partitionKeyColumns(partitionKeyColumns.let(IResolvable::unwrap))
    }

    override fun partitionKeyColumns(partitionKeyColumns: List<Any>) {
      cdkBuilder.partitionKeyColumns(partitionKeyColumns)
    }

    override fun pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled: Boolean) {
      cdkBuilder.pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled)
    }

    override fun pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled: IResolvable) {
      cdkBuilder.pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled.let(IResolvable::unwrap))
    }

    override fun regularColumns(regularColumns: IResolvable) {
      cdkBuilder.regularColumns(regularColumns.let(IResolvable::unwrap))
    }

    override fun regularColumns(regularColumns: List<Any>) {
      cdkBuilder.regularColumns(regularColumns)
    }

    override fun replicaSpecifications(replicaSpecifications: IResolvable) {
      cdkBuilder.replicaSpecifications(replicaSpecifications.let(IResolvable::unwrap))
    }

    override fun replicaSpecifications(replicaSpecifications: List<Any>) {
      cdkBuilder.replicaSpecifications(replicaSpecifications)
    }

    override fun tableName(tableName: String) {
      cdkBuilder.tableName(tableName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cassandra.CfnTable = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTable {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTable(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cassandra.CfnTable): CfnTable =
        CfnTable(cdkObject)

    internal fun unwrap(wrapped: CfnTable): software.amazon.awscdk.services.cassandra.CfnTable =
        wrapped.cdkObject
  }

  public interface ScalingPolicyProperty {
    public fun targetTrackingScalingPolicyConfiguration(): Any? =
        unwrap(this).getTargetTrackingScalingPolicyConfiguration()

    public interface Builder {
      public
          fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: IResolvable)

      public
          fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: TargetTrackingScalingPolicyConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8c0719136d5761003d3e30200cf94101b28345ce0596e84b87cc72daaeb879fb")
      public
          fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: TargetTrackingScalingPolicyConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cassandra.CfnTable.ScalingPolicyProperty.Builder =
          software.amazon.awscdk.services.cassandra.CfnTable.ScalingPolicyProperty.builder()

      override
          fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: IResolvable) {
        cdkBuilder.targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration.let(IResolvable::unwrap))
      }

      override
          fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: TargetTrackingScalingPolicyConfigurationProperty) {
        cdkBuilder.targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration.let(TargetTrackingScalingPolicyConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8c0719136d5761003d3e30200cf94101b28345ce0596e84b87cc72daaeb879fb")
      override
          fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: TargetTrackingScalingPolicyConfigurationProperty.Builder.() -> Unit):
          Unit =
          targetTrackingScalingPolicyConfiguration(TargetTrackingScalingPolicyConfigurationProperty(targetTrackingScalingPolicyConfiguration))

      public fun build(): software.amazon.awscdk.services.cassandra.CfnTable.ScalingPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cassandra.CfnTable.ScalingPolicyProperty,
    ) : ScalingPolicyProperty {
      override fun targetTrackingScalingPolicyConfiguration(): Any? =
          unwrap(this).getTargetTrackingScalingPolicyConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ScalingPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cassandra.CfnTable.ScalingPolicyProperty):
          ScalingPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalingPolicyProperty):
          software.amazon.awscdk.services.cassandra.CfnTable.ScalingPolicyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ClusteringKeyColumnProperty {
    public fun column(): Any

    public fun orderBy(): String? = unwrap(this).getOrderBy()

    public interface Builder {
      public fun column(column: IResolvable)

      public fun column(column: ColumnProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1719c3c601457175d08dcf7402b4c82cda20c2e09b59385102ee0c6f5af0e8cb")
      public fun column(column: ColumnProperty.Builder.() -> Unit)

      public fun orderBy(orderBy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cassandra.CfnTable.ClusteringKeyColumnProperty.Builder =
          software.amazon.awscdk.services.cassandra.CfnTable.ClusteringKeyColumnProperty.builder()

      override fun column(column: IResolvable) {
        cdkBuilder.column(column.let(IResolvable::unwrap))
      }

      override fun column(column: ColumnProperty) {
        cdkBuilder.column(column.let(ColumnProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1719c3c601457175d08dcf7402b4c82cda20c2e09b59385102ee0c6f5af0e8cb")
      override fun column(column: ColumnProperty.Builder.() -> Unit): Unit =
          column(ColumnProperty(column))

      override fun orderBy(orderBy: String) {
        cdkBuilder.orderBy(orderBy)
      }

      public fun build():
          software.amazon.awscdk.services.cassandra.CfnTable.ClusteringKeyColumnProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cassandra.CfnTable.ClusteringKeyColumnProperty,
    ) : ClusteringKeyColumnProperty {
      override fun column(): Any = unwrap(this).getColumn()

      override fun orderBy(): String? = unwrap(this).getOrderBy()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ClusteringKeyColumnProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cassandra.CfnTable.ClusteringKeyColumnProperty):
          ClusteringKeyColumnProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClusteringKeyColumnProperty):
          software.amazon.awscdk.services.cassandra.CfnTable.ClusteringKeyColumnProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface BillingModeProperty {
    public fun mode(): String

    public fun provisionedThroughput(): Any? = unwrap(this).getProvisionedThroughput()

    public interface Builder {
      public fun mode(mode: String)

      public fun provisionedThroughput(provisionedThroughput: IResolvable)

      public fun provisionedThroughput(provisionedThroughput: ProvisionedThroughputProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6229fc1deb4ce36008eb6519392ee66844b20166c36bebacd90cc6680480125e")
      public
          fun provisionedThroughput(provisionedThroughput: ProvisionedThroughputProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cassandra.CfnTable.BillingModeProperty.Builder =
          software.amazon.awscdk.services.cassandra.CfnTable.BillingModeProperty.builder()

      override fun mode(mode: String) {
        cdkBuilder.mode(mode)
      }

      override fun provisionedThroughput(provisionedThroughput: IResolvable) {
        cdkBuilder.provisionedThroughput(provisionedThroughput.let(IResolvable::unwrap))
      }

      override fun provisionedThroughput(provisionedThroughput: ProvisionedThroughputProperty) {
        cdkBuilder.provisionedThroughput(provisionedThroughput.let(ProvisionedThroughputProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6229fc1deb4ce36008eb6519392ee66844b20166c36bebacd90cc6680480125e")
      override
          fun provisionedThroughput(provisionedThroughput: ProvisionedThroughputProperty.Builder.() -> Unit):
          Unit = provisionedThroughput(ProvisionedThroughputProperty(provisionedThroughput))

      public fun build(): software.amazon.awscdk.services.cassandra.CfnTable.BillingModeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cassandra.CfnTable.BillingModeProperty,
    ) : BillingModeProperty {
      override fun mode(): String = unwrap(this).getMode()

      override fun provisionedThroughput(): Any? = unwrap(this).getProvisionedThroughput()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BillingModeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cassandra.CfnTable.BillingModeProperty):
          BillingModeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BillingModeProperty):
          software.amazon.awscdk.services.cassandra.CfnTable.BillingModeProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AutoScalingSpecificationProperty {
    public fun readCapacityAutoScaling(): Any? = unwrap(this).getReadCapacityAutoScaling()

    public fun writeCapacityAutoScaling(): Any? = unwrap(this).getWriteCapacityAutoScaling()

    public interface Builder {
      public fun readCapacityAutoScaling(readCapacityAutoScaling: IResolvable)

      public fun readCapacityAutoScaling(readCapacityAutoScaling: AutoScalingSettingProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("70e2f1cb5478a4cbae1d99c8d7df305cf0dcdd513f625d7ebc4c9c89e495ded8")
      public
          fun readCapacityAutoScaling(readCapacityAutoScaling: AutoScalingSettingProperty.Builder.() -> Unit)

      public fun writeCapacityAutoScaling(writeCapacityAutoScaling: IResolvable)

      public fun writeCapacityAutoScaling(writeCapacityAutoScaling: AutoScalingSettingProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fe683f396f3380315b3d21fe213e16fbe5bd7f327ac1abebef53993bc080cc5d")
      public
          fun writeCapacityAutoScaling(writeCapacityAutoScaling: AutoScalingSettingProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cassandra.CfnTable.AutoScalingSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.cassandra.CfnTable.AutoScalingSpecificationProperty.builder()

      override fun readCapacityAutoScaling(readCapacityAutoScaling: IResolvable) {
        cdkBuilder.readCapacityAutoScaling(readCapacityAutoScaling.let(IResolvable::unwrap))
      }

      override fun readCapacityAutoScaling(readCapacityAutoScaling: AutoScalingSettingProperty) {
        cdkBuilder.readCapacityAutoScaling(readCapacityAutoScaling.let(AutoScalingSettingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("70e2f1cb5478a4cbae1d99c8d7df305cf0dcdd513f625d7ebc4c9c89e495ded8")
      override
          fun readCapacityAutoScaling(readCapacityAutoScaling: AutoScalingSettingProperty.Builder.() -> Unit):
          Unit = readCapacityAutoScaling(AutoScalingSettingProperty(readCapacityAutoScaling))

      override fun writeCapacityAutoScaling(writeCapacityAutoScaling: IResolvable) {
        cdkBuilder.writeCapacityAutoScaling(writeCapacityAutoScaling.let(IResolvable::unwrap))
      }

      override fun writeCapacityAutoScaling(writeCapacityAutoScaling: AutoScalingSettingProperty) {
        cdkBuilder.writeCapacityAutoScaling(writeCapacityAutoScaling.let(AutoScalingSettingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fe683f396f3380315b3d21fe213e16fbe5bd7f327ac1abebef53993bc080cc5d")
      override
          fun writeCapacityAutoScaling(writeCapacityAutoScaling: AutoScalingSettingProperty.Builder.() -> Unit):
          Unit = writeCapacityAutoScaling(AutoScalingSettingProperty(writeCapacityAutoScaling))

      public fun build():
          software.amazon.awscdk.services.cassandra.CfnTable.AutoScalingSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cassandra.CfnTable.AutoScalingSpecificationProperty,
    ) : AutoScalingSpecificationProperty {
      override fun readCapacityAutoScaling(): Any? = unwrap(this).getReadCapacityAutoScaling()

      override fun writeCapacityAutoScaling(): Any? = unwrap(this).getWriteCapacityAutoScaling()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AutoScalingSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cassandra.CfnTable.AutoScalingSpecificationProperty):
          AutoScalingSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoScalingSpecificationProperty):
          software.amazon.awscdk.services.cassandra.CfnTable.AutoScalingSpecificationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TargetTrackingScalingPolicyConfigurationProperty {
    public fun disableScaleIn(): Any? = unwrap(this).getDisableScaleIn()

    public fun scaleInCooldown(): Number? = unwrap(this).getScaleInCooldown()

    public fun scaleOutCooldown(): Number? = unwrap(this).getScaleOutCooldown()

    public fun targetValue(): Number

    public interface Builder {
      public fun disableScaleIn(disableScaleIn: Boolean)

      public fun disableScaleIn(disableScaleIn: IResolvable)

      public fun scaleInCooldown(scaleInCooldown: Number)

      public fun scaleOutCooldown(scaleOutCooldown: Number)

      public fun targetValue(targetValue: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cassandra.CfnTable.TargetTrackingScalingPolicyConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.cassandra.CfnTable.TargetTrackingScalingPolicyConfigurationProperty.builder()

      override fun disableScaleIn(disableScaleIn: Boolean) {
        cdkBuilder.disableScaleIn(disableScaleIn)
      }

      override fun disableScaleIn(disableScaleIn: IResolvable) {
        cdkBuilder.disableScaleIn(disableScaleIn.let(IResolvable::unwrap))
      }

      override fun scaleInCooldown(scaleInCooldown: Number) {
        cdkBuilder.scaleInCooldown(scaleInCooldown)
      }

      override fun scaleOutCooldown(scaleOutCooldown: Number) {
        cdkBuilder.scaleOutCooldown(scaleOutCooldown)
      }

      override fun targetValue(targetValue: Number) {
        cdkBuilder.targetValue(targetValue)
      }

      public fun build():
          software.amazon.awscdk.services.cassandra.CfnTable.TargetTrackingScalingPolicyConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cassandra.CfnTable.TargetTrackingScalingPolicyConfigurationProperty,
    ) : TargetTrackingScalingPolicyConfigurationProperty {
      override fun disableScaleIn(): Any? = unwrap(this).getDisableScaleIn()

      override fun scaleInCooldown(): Number? = unwrap(this).getScaleInCooldown()

      override fun scaleOutCooldown(): Number? = unwrap(this).getScaleOutCooldown()

      override fun targetValue(): Number = unwrap(this).getTargetValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          TargetTrackingScalingPolicyConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cassandra.CfnTable.TargetTrackingScalingPolicyConfigurationProperty):
          TargetTrackingScalingPolicyConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetTrackingScalingPolicyConfigurationProperty):
          software.amazon.awscdk.services.cassandra.CfnTable.TargetTrackingScalingPolicyConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ReplicaSpecificationProperty {
    public fun readCapacityAutoScaling(): Any? = unwrap(this).getReadCapacityAutoScaling()

    public fun readCapacityUnits(): Number? = unwrap(this).getReadCapacityUnits()

    public fun region(): String

    public interface Builder {
      public fun readCapacityAutoScaling(readCapacityAutoScaling: IResolvable)

      public fun readCapacityAutoScaling(readCapacityAutoScaling: AutoScalingSettingProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e7c8a80c817160ff83e18bab565ddc70e61f3fc146dcbb78e6ed386045600db9")
      public
          fun readCapacityAutoScaling(readCapacityAutoScaling: AutoScalingSettingProperty.Builder.() -> Unit)

      public fun readCapacityUnits(readCapacityUnits: Number)

      public fun region(region: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cassandra.CfnTable.ReplicaSpecificationProperty.Builder =
          software.amazon.awscdk.services.cassandra.CfnTable.ReplicaSpecificationProperty.builder()

      override fun readCapacityAutoScaling(readCapacityAutoScaling: IResolvable) {
        cdkBuilder.readCapacityAutoScaling(readCapacityAutoScaling.let(IResolvable::unwrap))
      }

      override fun readCapacityAutoScaling(readCapacityAutoScaling: AutoScalingSettingProperty) {
        cdkBuilder.readCapacityAutoScaling(readCapacityAutoScaling.let(AutoScalingSettingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e7c8a80c817160ff83e18bab565ddc70e61f3fc146dcbb78e6ed386045600db9")
      override
          fun readCapacityAutoScaling(readCapacityAutoScaling: AutoScalingSettingProperty.Builder.() -> Unit):
          Unit = readCapacityAutoScaling(AutoScalingSettingProperty(readCapacityAutoScaling))

      override fun readCapacityUnits(readCapacityUnits: Number) {
        cdkBuilder.readCapacityUnits(readCapacityUnits)
      }

      override fun region(region: String) {
        cdkBuilder.region(region)
      }

      public fun build():
          software.amazon.awscdk.services.cassandra.CfnTable.ReplicaSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cassandra.CfnTable.ReplicaSpecificationProperty,
    ) : ReplicaSpecificationProperty {
      override fun readCapacityAutoScaling(): Any? = unwrap(this).getReadCapacityAutoScaling()

      override fun readCapacityUnits(): Number? = unwrap(this).getReadCapacityUnits()

      override fun region(): String = unwrap(this).getRegion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ReplicaSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cassandra.CfnTable.ReplicaSpecificationProperty):
          ReplicaSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReplicaSpecificationProperty):
          software.amazon.awscdk.services.cassandra.CfnTable.ReplicaSpecificationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface EncryptionSpecificationProperty {
    public fun encryptionType(): String

    public fun kmsKeyIdentifier(): String? = unwrap(this).getKmsKeyIdentifier()

    public interface Builder {
      public fun encryptionType(encryptionType: String)

      public fun kmsKeyIdentifier(kmsKeyIdentifier: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cassandra.CfnTable.EncryptionSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.cassandra.CfnTable.EncryptionSpecificationProperty.builder()

      override fun encryptionType(encryptionType: String) {
        cdkBuilder.encryptionType(encryptionType)
      }

      override fun kmsKeyIdentifier(kmsKeyIdentifier: String) {
        cdkBuilder.kmsKeyIdentifier(kmsKeyIdentifier)
      }

      public fun build():
          software.amazon.awscdk.services.cassandra.CfnTable.EncryptionSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cassandra.CfnTable.EncryptionSpecificationProperty,
    ) : EncryptionSpecificationProperty {
      override fun encryptionType(): String = unwrap(this).getEncryptionType()

      override fun kmsKeyIdentifier(): String? = unwrap(this).getKmsKeyIdentifier()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cassandra.CfnTable.EncryptionSpecificationProperty):
          EncryptionSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionSpecificationProperty):
          software.amazon.awscdk.services.cassandra.CfnTable.EncryptionSpecificationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AutoScalingSettingProperty {
    public fun autoScalingDisabled(): Any? = unwrap(this).getAutoScalingDisabled()

    public fun maximumUnits(): Number? = unwrap(this).getMaximumUnits()

    public fun minimumUnits(): Number? = unwrap(this).getMinimumUnits()

    public fun scalingPolicy(): Any? = unwrap(this).getScalingPolicy()

    public interface Builder {
      public fun autoScalingDisabled(autoScalingDisabled: Boolean)

      public fun autoScalingDisabled(autoScalingDisabled: IResolvable)

      public fun maximumUnits(maximumUnits: Number)

      public fun minimumUnits(minimumUnits: Number)

      public fun scalingPolicy(scalingPolicy: IResolvable)

      public fun scalingPolicy(scalingPolicy: ScalingPolicyProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("53d2bbef462e8fe3680a3f07236b4bd7c8adab847dcbe52a82a427c23baadb48")
      public fun scalingPolicy(scalingPolicy: ScalingPolicyProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cassandra.CfnTable.AutoScalingSettingProperty.Builder =
          software.amazon.awscdk.services.cassandra.CfnTable.AutoScalingSettingProperty.builder()

      override fun autoScalingDisabled(autoScalingDisabled: Boolean) {
        cdkBuilder.autoScalingDisabled(autoScalingDisabled)
      }

      override fun autoScalingDisabled(autoScalingDisabled: IResolvable) {
        cdkBuilder.autoScalingDisabled(autoScalingDisabled.let(IResolvable::unwrap))
      }

      override fun maximumUnits(maximumUnits: Number) {
        cdkBuilder.maximumUnits(maximumUnits)
      }

      override fun minimumUnits(minimumUnits: Number) {
        cdkBuilder.minimumUnits(minimumUnits)
      }

      override fun scalingPolicy(scalingPolicy: IResolvable) {
        cdkBuilder.scalingPolicy(scalingPolicy.let(IResolvable::unwrap))
      }

      override fun scalingPolicy(scalingPolicy: ScalingPolicyProperty) {
        cdkBuilder.scalingPolicy(scalingPolicy.let(ScalingPolicyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("53d2bbef462e8fe3680a3f07236b4bd7c8adab847dcbe52a82a427c23baadb48")
      override fun scalingPolicy(scalingPolicy: ScalingPolicyProperty.Builder.() -> Unit): Unit =
          scalingPolicy(ScalingPolicyProperty(scalingPolicy))

      public fun build():
          software.amazon.awscdk.services.cassandra.CfnTable.AutoScalingSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cassandra.CfnTable.AutoScalingSettingProperty,
    ) : AutoScalingSettingProperty {
      override fun autoScalingDisabled(): Any? = unwrap(this).getAutoScalingDisabled()

      override fun maximumUnits(): Number? = unwrap(this).getMaximumUnits()

      override fun minimumUnits(): Number? = unwrap(this).getMinimumUnits()

      override fun scalingPolicy(): Any? = unwrap(this).getScalingPolicy()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AutoScalingSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cassandra.CfnTable.AutoScalingSettingProperty):
          AutoScalingSettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoScalingSettingProperty):
          software.amazon.awscdk.services.cassandra.CfnTable.AutoScalingSettingProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ProvisionedThroughputProperty {
    public fun readCapacityUnits(): Number

    public fun writeCapacityUnits(): Number

    public interface Builder {
      public fun readCapacityUnits(readCapacityUnits: Number)

      public fun writeCapacityUnits(writeCapacityUnits: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cassandra.CfnTable.ProvisionedThroughputProperty.Builder =
          software.amazon.awscdk.services.cassandra.CfnTable.ProvisionedThroughputProperty.builder()

      override fun readCapacityUnits(readCapacityUnits: Number) {
        cdkBuilder.readCapacityUnits(readCapacityUnits)
      }

      override fun writeCapacityUnits(writeCapacityUnits: Number) {
        cdkBuilder.writeCapacityUnits(writeCapacityUnits)
      }

      public fun build():
          software.amazon.awscdk.services.cassandra.CfnTable.ProvisionedThroughputProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cassandra.CfnTable.ProvisionedThroughputProperty,
    ) : ProvisionedThroughputProperty {
      override fun readCapacityUnits(): Number = unwrap(this).getReadCapacityUnits()

      override fun writeCapacityUnits(): Number = unwrap(this).getWriteCapacityUnits()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ProvisionedThroughputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cassandra.CfnTable.ProvisionedThroughputProperty):
          ProvisionedThroughputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProvisionedThroughputProperty):
          software.amazon.awscdk.services.cassandra.CfnTable.ProvisionedThroughputProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ColumnProperty {
    public fun columnName(): String

    public fun columnType(): String

    public interface Builder {
      public fun columnName(columnName: String)

      public fun columnType(columnType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cassandra.CfnTable.ColumnProperty.Builder =
          software.amazon.awscdk.services.cassandra.CfnTable.ColumnProperty.builder()

      override fun columnName(columnName: String) {
        cdkBuilder.columnName(columnName)
      }

      override fun columnType(columnType: String) {
        cdkBuilder.columnType(columnType)
      }

      public fun build(): software.amazon.awscdk.services.cassandra.CfnTable.ColumnProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.cassandra.CfnTable.ColumnProperty,
    ) : ColumnProperty {
      override fun columnName(): String = unwrap(this).getColumnName()

      override fun columnType(): String = unwrap(this).getColumnType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ColumnProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cassandra.CfnTable.ColumnProperty):
          ColumnProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ColumnProperty):
          software.amazon.awscdk.services.cassandra.CfnTable.ColumnProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
