@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cassandra

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnTableProps {
  public fun autoScalingSpecifications(): Any? = unwrap(this).getAutoScalingSpecifications()

  public fun billingMode(): Any? = unwrap(this).getBillingMode()

  public fun clientSideTimestampsEnabled(): Any? = unwrap(this).getClientSideTimestampsEnabled()

  public fun clusteringKeyColumns(): Any? = unwrap(this).getClusteringKeyColumns()

  public fun defaultTimeToLive(): Number? = unwrap(this).getDefaultTimeToLive()

  public fun encryptionSpecification(): Any? = unwrap(this).getEncryptionSpecification()

  public fun keyspaceName(): String

  public fun partitionKeyColumns(): Any

  public fun pointInTimeRecoveryEnabled(): Any? = unwrap(this).getPointInTimeRecoveryEnabled()

  public fun regularColumns(): Any? = unwrap(this).getRegularColumns()

  public fun replicaSpecifications(): Any? = unwrap(this).getReplicaSpecifications()

  public fun tableName(): String? = unwrap(this).getTableName()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun autoScalingSpecifications(autoScalingSpecifications: IResolvable)

    public
        fun autoScalingSpecifications(autoScalingSpecifications: CfnTable.AutoScalingSpecificationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b1ed334d8d048ad1a63723888ba6b52a5733fd3ca7d135585407a63652fbb423")
    public
        fun autoScalingSpecifications(autoScalingSpecifications: CfnTable.AutoScalingSpecificationProperty.Builder.() -> Unit)

    public fun billingMode(billingMode: IResolvable)

    public fun billingMode(billingMode: CfnTable.BillingModeProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fb8d6dbc6f6662222780a9bfad95d32dd40625124100e2249da324e1eed3c3b3")
    public fun billingMode(billingMode: CfnTable.BillingModeProperty.Builder.() -> Unit)

    public fun clientSideTimestampsEnabled(clientSideTimestampsEnabled: Boolean)

    public fun clientSideTimestampsEnabled(clientSideTimestampsEnabled: IResolvable)

    public fun clusteringKeyColumns(clusteringKeyColumns: IResolvable)

    public fun clusteringKeyColumns(clusteringKeyColumns: List<Any>)

    public fun clusteringKeyColumns(vararg clusteringKeyColumns: Any)

    public fun defaultTimeToLive(defaultTimeToLive: Number)

    public fun encryptionSpecification(encryptionSpecification: IResolvable)

    public
        fun encryptionSpecification(encryptionSpecification: CfnTable.EncryptionSpecificationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ced13bae27275c155e5090b60d17a496dae2ef4db4b0a95625f4b87fb275de61")
    public
        fun encryptionSpecification(encryptionSpecification: CfnTable.EncryptionSpecificationProperty.Builder.() -> Unit)

    public fun keyspaceName(keyspaceName: String)

    public fun partitionKeyColumns(partitionKeyColumns: IResolvable)

    public fun partitionKeyColumns(partitionKeyColumns: List<Any>)

    public fun partitionKeyColumns(vararg partitionKeyColumns: Any)

    public fun pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled: Boolean)

    public fun pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled: IResolvable)

    public fun regularColumns(regularColumns: IResolvable)

    public fun regularColumns(regularColumns: List<Any>)

    public fun regularColumns(vararg regularColumns: Any)

    public fun replicaSpecifications(replicaSpecifications: IResolvable)

    public fun replicaSpecifications(replicaSpecifications: List<Any>)

    public fun replicaSpecifications(vararg replicaSpecifications: Any)

    public fun tableName(tableName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cassandra.CfnTableProps.Builder =
        software.amazon.awscdk.services.cassandra.CfnTableProps.builder()

    override fun autoScalingSpecifications(autoScalingSpecifications: IResolvable) {
      cdkBuilder.autoScalingSpecifications(autoScalingSpecifications.let(IResolvable::unwrap))
    }

    override
        fun autoScalingSpecifications(autoScalingSpecifications: CfnTable.AutoScalingSpecificationProperty) {
      cdkBuilder.autoScalingSpecifications(autoScalingSpecifications.let(CfnTable.AutoScalingSpecificationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b1ed334d8d048ad1a63723888ba6b52a5733fd3ca7d135585407a63652fbb423")
    override
        fun autoScalingSpecifications(autoScalingSpecifications: CfnTable.AutoScalingSpecificationProperty.Builder.() -> Unit):
        Unit =
        autoScalingSpecifications(CfnTable.AutoScalingSpecificationProperty(autoScalingSpecifications))

    override fun billingMode(billingMode: IResolvable) {
      cdkBuilder.billingMode(billingMode.let(IResolvable::unwrap))
    }

    override fun billingMode(billingMode: CfnTable.BillingModeProperty) {
      cdkBuilder.billingMode(billingMode.let(CfnTable.BillingModeProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fb8d6dbc6f6662222780a9bfad95d32dd40625124100e2249da324e1eed3c3b3")
    override fun billingMode(billingMode: CfnTable.BillingModeProperty.Builder.() -> Unit): Unit =
        billingMode(CfnTable.BillingModeProperty(billingMode))

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

    override fun clusteringKeyColumns(vararg clusteringKeyColumns: Any): Unit =
        clusteringKeyColumns(clusteringKeyColumns.toList())

    override fun defaultTimeToLive(defaultTimeToLive: Number) {
      cdkBuilder.defaultTimeToLive(defaultTimeToLive)
    }

    override fun encryptionSpecification(encryptionSpecification: IResolvable) {
      cdkBuilder.encryptionSpecification(encryptionSpecification.let(IResolvable::unwrap))
    }

    override
        fun encryptionSpecification(encryptionSpecification: CfnTable.EncryptionSpecificationProperty) {
      cdkBuilder.encryptionSpecification(encryptionSpecification.let(CfnTable.EncryptionSpecificationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ced13bae27275c155e5090b60d17a496dae2ef4db4b0a95625f4b87fb275de61")
    override
        fun encryptionSpecification(encryptionSpecification: CfnTable.EncryptionSpecificationProperty.Builder.() -> Unit):
        Unit =
        encryptionSpecification(CfnTable.EncryptionSpecificationProperty(encryptionSpecification))

    override fun keyspaceName(keyspaceName: String) {
      cdkBuilder.keyspaceName(keyspaceName)
    }

    override fun partitionKeyColumns(partitionKeyColumns: IResolvable) {
      cdkBuilder.partitionKeyColumns(partitionKeyColumns.let(IResolvable::unwrap))
    }

    override fun partitionKeyColumns(partitionKeyColumns: List<Any>) {
      cdkBuilder.partitionKeyColumns(partitionKeyColumns)
    }

    override fun partitionKeyColumns(vararg partitionKeyColumns: Any): Unit =
        partitionKeyColumns(partitionKeyColumns.toList())

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

    override fun regularColumns(vararg regularColumns: Any): Unit =
        regularColumns(regularColumns.toList())

    override fun replicaSpecifications(replicaSpecifications: IResolvable) {
      cdkBuilder.replicaSpecifications(replicaSpecifications.let(IResolvable::unwrap))
    }

    override fun replicaSpecifications(replicaSpecifications: List<Any>) {
      cdkBuilder.replicaSpecifications(replicaSpecifications)
    }

    override fun replicaSpecifications(vararg replicaSpecifications: Any): Unit =
        replicaSpecifications(replicaSpecifications.toList())

    override fun tableName(tableName: String) {
      cdkBuilder.tableName(tableName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cassandra.CfnTableProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cassandra.CfnTableProps,
  ) : CdkObject(cdkObject), CfnTableProps {
    override fun autoScalingSpecifications(): Any? = unwrap(this).getAutoScalingSpecifications()

    override fun billingMode(): Any? = unwrap(this).getBillingMode()

    override fun clientSideTimestampsEnabled(): Any? = unwrap(this).getClientSideTimestampsEnabled()

    override fun clusteringKeyColumns(): Any? = unwrap(this).getClusteringKeyColumns()

    override fun defaultTimeToLive(): Number? = unwrap(this).getDefaultTimeToLive()

    override fun encryptionSpecification(): Any? = unwrap(this).getEncryptionSpecification()

    override fun keyspaceName(): String = unwrap(this).getKeyspaceName()

    override fun partitionKeyColumns(): Any = unwrap(this).getPartitionKeyColumns()

    override fun pointInTimeRecoveryEnabled(): Any? = unwrap(this).getPointInTimeRecoveryEnabled()

    override fun regularColumns(): Any? = unwrap(this).getRegularColumns()

    override fun replicaSpecifications(): Any? = unwrap(this).getReplicaSpecifications()

    override fun tableName(): String? = unwrap(this).getTableName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTableProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cassandra.CfnTableProps):
        CfnTableProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTableProps):
        software.amazon.awscdk.services.cassandra.CfnTableProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cassandra.CfnTableProps
  }
}
