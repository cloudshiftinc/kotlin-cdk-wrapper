@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnGlobalTableProps {
  public fun attributeDefinitions(): Any

  public fun billingMode(): String? = unwrap(this).getBillingMode()

  public fun globalSecondaryIndexes(): Any? = unwrap(this).getGlobalSecondaryIndexes()

  public fun keySchema(): Any

  public fun localSecondaryIndexes(): Any? = unwrap(this).getLocalSecondaryIndexes()

  public fun replicas(): Any

  public fun sseSpecification(): Any? = unwrap(this).getSseSpecification()

  public fun streamSpecification(): Any? = unwrap(this).getStreamSpecification()

  public fun tableName(): String? = unwrap(this).getTableName()

  public fun timeToLiveSpecification(): Any? = unwrap(this).getTimeToLiveSpecification()

  public fun writeProvisionedThroughputSettings(): Any? =
      unwrap(this).getWriteProvisionedThroughputSettings()

  @CdkDslMarker
  public interface Builder {
    public fun attributeDefinitions(attributeDefinitions: IResolvable)

    public fun attributeDefinitions(attributeDefinitions: List<Any>)

    public fun attributeDefinitions(vararg attributeDefinitions: Any)

    public fun billingMode(billingMode: String)

    public fun globalSecondaryIndexes(globalSecondaryIndexes: IResolvable)

    public fun globalSecondaryIndexes(globalSecondaryIndexes: List<Any>)

    public fun globalSecondaryIndexes(vararg globalSecondaryIndexes: Any)

    public fun keySchema(keySchema: IResolvable)

    public fun keySchema(keySchema: List<Any>)

    public fun keySchema(vararg keySchema: Any)

    public fun localSecondaryIndexes(localSecondaryIndexes: IResolvable)

    public fun localSecondaryIndexes(localSecondaryIndexes: List<Any>)

    public fun localSecondaryIndexes(vararg localSecondaryIndexes: Any)

    public fun replicas(replicas: IResolvable)

    public fun replicas(replicas: List<Any>)

    public fun replicas(vararg replicas: Any)

    public fun sseSpecification(sseSpecification: IResolvable)

    public fun sseSpecification(sseSpecification: CfnGlobalTable.SSESpecificationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("09e1503ea99565c1db8e633f38c3a2fe8395ca4d2ede3fcbab2b7f5468da16fe")
    public
        fun sseSpecification(sseSpecification: CfnGlobalTable.SSESpecificationProperty.Builder.() -> Unit)

    public fun streamSpecification(streamSpecification: IResolvable)

    public fun streamSpecification(streamSpecification: CfnGlobalTable.StreamSpecificationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f4f9b31fb0659ae8acbde94b33870b3a9b0ea251163265714a8659f838ca2139")
    public
        fun streamSpecification(streamSpecification: CfnGlobalTable.StreamSpecificationProperty.Builder.() -> Unit)

    public fun tableName(tableName: String)

    public fun timeToLiveSpecification(timeToLiveSpecification: IResolvable)

    public
        fun timeToLiveSpecification(timeToLiveSpecification: CfnGlobalTable.TimeToLiveSpecificationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5d07074555f98035fd07bcadc9bbbe0e53b333c641fbf0359ddedec23f7e5be9")
    public
        fun timeToLiveSpecification(timeToLiveSpecification: CfnGlobalTable.TimeToLiveSpecificationProperty.Builder.() -> Unit)

    public fun writeProvisionedThroughputSettings(writeProvisionedThroughputSettings: IResolvable)

    public
        fun writeProvisionedThroughputSettings(writeProvisionedThroughputSettings: CfnGlobalTable.WriteProvisionedThroughputSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7a8836677ce2db7a810bf48b9e8c73d2a52c6d895be759c5c431b863602fc213")
    public
        fun writeProvisionedThroughputSettings(writeProvisionedThroughputSettings: CfnGlobalTable.WriteProvisionedThroughputSettingsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dynamodb.CfnGlobalTableProps.Builder =
        software.amazon.awscdk.services.dynamodb.CfnGlobalTableProps.builder()

    override fun attributeDefinitions(attributeDefinitions: IResolvable) {
      cdkBuilder.attributeDefinitions(attributeDefinitions.let(IResolvable::unwrap))
    }

    override fun attributeDefinitions(attributeDefinitions: List<Any>) {
      cdkBuilder.attributeDefinitions(attributeDefinitions)
    }

    override fun attributeDefinitions(vararg attributeDefinitions: Any): Unit =
        attributeDefinitions(attributeDefinitions.toList())

    override fun billingMode(billingMode: String) {
      cdkBuilder.billingMode(billingMode)
    }

    override fun globalSecondaryIndexes(globalSecondaryIndexes: IResolvable) {
      cdkBuilder.globalSecondaryIndexes(globalSecondaryIndexes.let(IResolvable::unwrap))
    }

    override fun globalSecondaryIndexes(globalSecondaryIndexes: List<Any>) {
      cdkBuilder.globalSecondaryIndexes(globalSecondaryIndexes)
    }

    override fun globalSecondaryIndexes(vararg globalSecondaryIndexes: Any): Unit =
        globalSecondaryIndexes(globalSecondaryIndexes.toList())

    override fun keySchema(keySchema: IResolvable) {
      cdkBuilder.keySchema(keySchema.let(IResolvable::unwrap))
    }

    override fun keySchema(keySchema: List<Any>) {
      cdkBuilder.keySchema(keySchema)
    }

    override fun keySchema(vararg keySchema: Any): Unit = keySchema(keySchema.toList())

    override fun localSecondaryIndexes(localSecondaryIndexes: IResolvable) {
      cdkBuilder.localSecondaryIndexes(localSecondaryIndexes.let(IResolvable::unwrap))
    }

    override fun localSecondaryIndexes(localSecondaryIndexes: List<Any>) {
      cdkBuilder.localSecondaryIndexes(localSecondaryIndexes)
    }

    override fun localSecondaryIndexes(vararg localSecondaryIndexes: Any): Unit =
        localSecondaryIndexes(localSecondaryIndexes.toList())

    override fun replicas(replicas: IResolvable) {
      cdkBuilder.replicas(replicas.let(IResolvable::unwrap))
    }

    override fun replicas(replicas: List<Any>) {
      cdkBuilder.replicas(replicas)
    }

    override fun replicas(vararg replicas: Any): Unit = replicas(replicas.toList())

    override fun sseSpecification(sseSpecification: IResolvable) {
      cdkBuilder.sseSpecification(sseSpecification.let(IResolvable::unwrap))
    }

    override fun sseSpecification(sseSpecification: CfnGlobalTable.SSESpecificationProperty) {
      cdkBuilder.sseSpecification(sseSpecification.let(CfnGlobalTable.SSESpecificationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("09e1503ea99565c1db8e633f38c3a2fe8395ca4d2ede3fcbab2b7f5468da16fe")
    override
        fun sseSpecification(sseSpecification: CfnGlobalTable.SSESpecificationProperty.Builder.() -> Unit):
        Unit = sseSpecification(CfnGlobalTable.SSESpecificationProperty(sseSpecification))

    override fun streamSpecification(streamSpecification: IResolvable) {
      cdkBuilder.streamSpecification(streamSpecification.let(IResolvable::unwrap))
    }

    override
        fun streamSpecification(streamSpecification: CfnGlobalTable.StreamSpecificationProperty) {
      cdkBuilder.streamSpecification(streamSpecification.let(CfnGlobalTable.StreamSpecificationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f4f9b31fb0659ae8acbde94b33870b3a9b0ea251163265714a8659f838ca2139")
    override
        fun streamSpecification(streamSpecification: CfnGlobalTable.StreamSpecificationProperty.Builder.() -> Unit):
        Unit = streamSpecification(CfnGlobalTable.StreamSpecificationProperty(streamSpecification))

    override fun tableName(tableName: String) {
      cdkBuilder.tableName(tableName)
    }

    override fun timeToLiveSpecification(timeToLiveSpecification: IResolvable) {
      cdkBuilder.timeToLiveSpecification(timeToLiveSpecification.let(IResolvable::unwrap))
    }

    override
        fun timeToLiveSpecification(timeToLiveSpecification: CfnGlobalTable.TimeToLiveSpecificationProperty) {
      cdkBuilder.timeToLiveSpecification(timeToLiveSpecification.let(CfnGlobalTable.TimeToLiveSpecificationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5d07074555f98035fd07bcadc9bbbe0e53b333c641fbf0359ddedec23f7e5be9")
    override
        fun timeToLiveSpecification(timeToLiveSpecification: CfnGlobalTable.TimeToLiveSpecificationProperty.Builder.() -> Unit):
        Unit =
        timeToLiveSpecification(CfnGlobalTable.TimeToLiveSpecificationProperty(timeToLiveSpecification))

    override
        fun writeProvisionedThroughputSettings(writeProvisionedThroughputSettings: IResolvable) {
      cdkBuilder.writeProvisionedThroughputSettings(writeProvisionedThroughputSettings.let(IResolvable::unwrap))
    }

    override
        fun writeProvisionedThroughputSettings(writeProvisionedThroughputSettings: CfnGlobalTable.WriteProvisionedThroughputSettingsProperty) {
      cdkBuilder.writeProvisionedThroughputSettings(writeProvisionedThroughputSettings.let(CfnGlobalTable.WriteProvisionedThroughputSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7a8836677ce2db7a810bf48b9e8c73d2a52c6d895be759c5c431b863602fc213")
    override
        fun writeProvisionedThroughputSettings(writeProvisionedThroughputSettings: CfnGlobalTable.WriteProvisionedThroughputSettingsProperty.Builder.() -> Unit):
        Unit =
        writeProvisionedThroughputSettings(CfnGlobalTable.WriteProvisionedThroughputSettingsProperty(writeProvisionedThroughputSettings))

    public fun build(): software.amazon.awscdk.services.dynamodb.CfnGlobalTableProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.dynamodb.CfnGlobalTableProps,
  ) : CdkObject(cdkObject), CfnGlobalTableProps {
    override fun attributeDefinitions(): Any = unwrap(this).getAttributeDefinitions()

    override fun billingMode(): String? = unwrap(this).getBillingMode()

    override fun globalSecondaryIndexes(): Any? = unwrap(this).getGlobalSecondaryIndexes()

    override fun keySchema(): Any = unwrap(this).getKeySchema()

    override fun localSecondaryIndexes(): Any? = unwrap(this).getLocalSecondaryIndexes()

    override fun replicas(): Any = unwrap(this).getReplicas()

    override fun sseSpecification(): Any? = unwrap(this).getSseSpecification()

    override fun streamSpecification(): Any? = unwrap(this).getStreamSpecification()

    override fun tableName(): String? = unwrap(this).getTableName()

    override fun timeToLiveSpecification(): Any? = unwrap(this).getTimeToLiveSpecification()

    override fun writeProvisionedThroughputSettings(): Any? =
        unwrap(this).getWriteProvisionedThroughputSettings()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGlobalTableProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnGlobalTableProps):
        CfnGlobalTableProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGlobalTableProps):
        software.amazon.awscdk.services.dynamodb.CfnGlobalTableProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.dynamodb.CfnGlobalTableProps
  }
}
