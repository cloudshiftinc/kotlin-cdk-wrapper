package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
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

public open class CfnGlobalTable internal constructor(
  private val cdkObject: software.amazon.awscdk.services.dynamodb.CfnGlobalTable,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrStreamArn(): String = unwrap(this).getAttrStreamArn()

  public open fun attrTableId(): String = unwrap(this).getAttrTableId()

  public open fun attributeDefinitions(): Any = unwrap(this).getAttributeDefinitions()

  public open fun attributeDefinitions(`value`: IResolvable) {
    unwrap(this).setAttributeDefinitions(`value`.let(IResolvable::unwrap))
  }

  public open fun attributeDefinitions(__idx_ac66f0: List<Any>) {
    unwrap(this).setAttributeDefinitions(__idx_ac66f0)
  }

  public open fun billingMode(): String? = unwrap(this).getBillingMode()

  public open fun billingMode(`value`: String) {
    unwrap(this).setBillingMode(`value`)
  }

  public open fun globalSecondaryIndexes(): Any? = unwrap(this).getGlobalSecondaryIndexes()

  public open fun globalSecondaryIndexes(`value`: IResolvable) {
    unwrap(this).setGlobalSecondaryIndexes(`value`.let(IResolvable::unwrap))
  }

  public open fun globalSecondaryIndexes(__idx_ac66f0: List<Any>) {
    unwrap(this).setGlobalSecondaryIndexes(__idx_ac66f0)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun keySchema(): Any = unwrap(this).getKeySchema()

  public open fun keySchema(`value`: IResolvable) {
    unwrap(this).setKeySchema(`value`.let(IResolvable::unwrap))
  }

  public open fun keySchema(__idx_ac66f0: List<Any>) {
    unwrap(this).setKeySchema(__idx_ac66f0)
  }

  public open fun localSecondaryIndexes(): Any? = unwrap(this).getLocalSecondaryIndexes()

  public open fun localSecondaryIndexes(`value`: IResolvable) {
    unwrap(this).setLocalSecondaryIndexes(`value`.let(IResolvable::unwrap))
  }

  public open fun localSecondaryIndexes(__idx_ac66f0: List<Any>) {
    unwrap(this).setLocalSecondaryIndexes(__idx_ac66f0)
  }

  public open fun replicas(): Any = unwrap(this).getReplicas()

  public open fun replicas(`value`: IResolvable) {
    unwrap(this).setReplicas(`value`.let(IResolvable::unwrap))
  }

  public open fun replicas(__idx_ac66f0: List<Any>) {
    unwrap(this).setReplicas(__idx_ac66f0)
  }

  public open fun sseSpecification(): Any? = unwrap(this).getSseSpecification()

  public open fun sseSpecification(`value`: IResolvable) {
    unwrap(this).setSseSpecification(`value`.let(IResolvable::unwrap))
  }

  public open fun sseSpecification(`value`: SSESpecificationProperty) {
    unwrap(this).setSseSpecification(`value`.let(SSESpecificationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("009850ebf2cb40dfdc8e55915be65d846868fd39caf3420728817ce04bc8df4e")
  public open fun sseSpecification(`value`: SSESpecificationProperty.Builder.() -> Unit): Unit =
      sseSpecification(SSESpecificationProperty(`value`))

  public open fun streamSpecification(): Any? = unwrap(this).getStreamSpecification()

  public open fun streamSpecification(`value`: IResolvable) {
    unwrap(this).setStreamSpecification(`value`.let(IResolvable::unwrap))
  }

  public open fun streamSpecification(`value`: StreamSpecificationProperty) {
    unwrap(this).setStreamSpecification(`value`.let(StreamSpecificationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("127acd550a3bd4febf8e25734b8753d6b81e97499c8517a08d593a921d108d2e")
  public open fun streamSpecification(`value`: StreamSpecificationProperty.Builder.() -> Unit): Unit
      = streamSpecification(StreamSpecificationProperty(`value`))

  public open fun tableName(): String? = unwrap(this).getTableName()

  public open fun tableName(`value`: String) {
    unwrap(this).setTableName(`value`)
  }

  public open fun timeToLiveSpecification(): Any? = unwrap(this).getTimeToLiveSpecification()

  public open fun timeToLiveSpecification(`value`: IResolvable) {
    unwrap(this).setTimeToLiveSpecification(`value`.let(IResolvable::unwrap))
  }

  public open fun timeToLiveSpecification(`value`: TimeToLiveSpecificationProperty) {
    unwrap(this).setTimeToLiveSpecification(`value`.let(TimeToLiveSpecificationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e0d141a1a82665304a3e8c5b6a1c8076cffe3aa870ce7b93244d0485db3f9474")
  public open
      fun timeToLiveSpecification(`value`: TimeToLiveSpecificationProperty.Builder.() -> Unit): Unit
      = timeToLiveSpecification(TimeToLiveSpecificationProperty(`value`))

  public open fun writeProvisionedThroughputSettings(): Any? =
      unwrap(this).getWriteProvisionedThroughputSettings()

  public open fun writeProvisionedThroughputSettings(`value`: IResolvable) {
    unwrap(this).setWriteProvisionedThroughputSettings(`value`.let(IResolvable::unwrap))
  }

  public open
      fun writeProvisionedThroughputSettings(`value`: WriteProvisionedThroughputSettingsProperty) {
    unwrap(this).setWriteProvisionedThroughputSettings(`value`.let(WriteProvisionedThroughputSettingsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4ee7a98323f2bbc7c944a24648f6ececf5a9a5afeec9f4d7f15ef97fa8c786b6")
  public open
      fun writeProvisionedThroughputSettings(`value`: WriteProvisionedThroughputSettingsProperty.Builder.() -> Unit):
      Unit = writeProvisionedThroughputSettings(WriteProvisionedThroughputSettingsProperty(`value`))

  public interface Builder {
    public fun attributeDefinitions(attributeDefinitions: IResolvable)

    public fun attributeDefinitions(attributeDefinitions: List<Any>)

    public fun billingMode(billingMode: String)

    public fun globalSecondaryIndexes(globalSecondaryIndexes: IResolvable)

    public fun globalSecondaryIndexes(globalSecondaryIndexes: List<Any>)

    public fun keySchema(keySchema: IResolvable)

    public fun keySchema(keySchema: List<Any>)

    public fun localSecondaryIndexes(localSecondaryIndexes: IResolvable)

    public fun localSecondaryIndexes(localSecondaryIndexes: List<Any>)

    public fun replicas(replicas: IResolvable)

    public fun replicas(replicas: List<Any>)

    public fun sseSpecification(sseSpecification: IResolvable)

    public fun sseSpecification(sseSpecification: SSESpecificationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e3c60a5a5edef59c4aa4f7708c0e3623743921725f05f2842958316e110b799")
    public fun sseSpecification(sseSpecification: SSESpecificationProperty.Builder.() -> Unit)

    public fun streamSpecification(streamSpecification: IResolvable)

    public fun streamSpecification(streamSpecification: StreamSpecificationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bf76fd13563ee3ad08063f4ca6555e20c9c41a98390d54479d39d86db66f0d08")
    public
        fun streamSpecification(streamSpecification: StreamSpecificationProperty.Builder.() -> Unit)

    public fun tableName(tableName: String)

    public fun timeToLiveSpecification(timeToLiveSpecification: IResolvable)

    public fun timeToLiveSpecification(timeToLiveSpecification: TimeToLiveSpecificationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("553d4a95a52b82e6cecb813ae356cc9b60f0baf86543b023322ca814aebdc244")
    public
        fun timeToLiveSpecification(timeToLiveSpecification: TimeToLiveSpecificationProperty.Builder.() -> Unit)

    public fun writeProvisionedThroughputSettings(writeProvisionedThroughputSettings: IResolvable)

    public
        fun writeProvisionedThroughputSettings(writeProvisionedThroughputSettings: WriteProvisionedThroughputSettingsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dcd27e79c267566886db3ae75fe52c318618fb4fef3740f98057e7fb925594f8")
    public
        fun writeProvisionedThroughputSettings(writeProvisionedThroughputSettings: WriteProvisionedThroughputSettingsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dynamodb.CfnGlobalTable.Builder =
        software.amazon.awscdk.services.dynamodb.CfnGlobalTable.Builder.create(scope, id)

    override fun attributeDefinitions(attributeDefinitions: IResolvable) {
      cdkBuilder.attributeDefinitions(attributeDefinitions.let(IResolvable::unwrap))
    }

    override fun attributeDefinitions(attributeDefinitions: List<Any>) {
      cdkBuilder.attributeDefinitions(attributeDefinitions)
    }

    override fun billingMode(billingMode: String) {
      cdkBuilder.billingMode(billingMode)
    }

    override fun globalSecondaryIndexes(globalSecondaryIndexes: IResolvable) {
      cdkBuilder.globalSecondaryIndexes(globalSecondaryIndexes.let(IResolvable::unwrap))
    }

    override fun globalSecondaryIndexes(globalSecondaryIndexes: List<Any>) {
      cdkBuilder.globalSecondaryIndexes(globalSecondaryIndexes)
    }

    override fun keySchema(keySchema: IResolvable) {
      cdkBuilder.keySchema(keySchema.let(IResolvable::unwrap))
    }

    override fun keySchema(keySchema: List<Any>) {
      cdkBuilder.keySchema(keySchema)
    }

    override fun localSecondaryIndexes(localSecondaryIndexes: IResolvable) {
      cdkBuilder.localSecondaryIndexes(localSecondaryIndexes.let(IResolvable::unwrap))
    }

    override fun localSecondaryIndexes(localSecondaryIndexes: List<Any>) {
      cdkBuilder.localSecondaryIndexes(localSecondaryIndexes)
    }

    override fun replicas(replicas: IResolvable) {
      cdkBuilder.replicas(replicas.let(IResolvable::unwrap))
    }

    override fun replicas(replicas: List<Any>) {
      cdkBuilder.replicas(replicas)
    }

    override fun sseSpecification(sseSpecification: IResolvable) {
      cdkBuilder.sseSpecification(sseSpecification.let(IResolvable::unwrap))
    }

    override fun sseSpecification(sseSpecification: SSESpecificationProperty) {
      cdkBuilder.sseSpecification(sseSpecification.let(SSESpecificationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e3c60a5a5edef59c4aa4f7708c0e3623743921725f05f2842958316e110b799")
    override fun sseSpecification(sseSpecification: SSESpecificationProperty.Builder.() -> Unit):
        Unit = sseSpecification(SSESpecificationProperty(sseSpecification))

    override fun streamSpecification(streamSpecification: IResolvable) {
      cdkBuilder.streamSpecification(streamSpecification.let(IResolvable::unwrap))
    }

    override fun streamSpecification(streamSpecification: StreamSpecificationProperty) {
      cdkBuilder.streamSpecification(streamSpecification.let(StreamSpecificationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bf76fd13563ee3ad08063f4ca6555e20c9c41a98390d54479d39d86db66f0d08")
    override
        fun streamSpecification(streamSpecification: StreamSpecificationProperty.Builder.() -> Unit):
        Unit = streamSpecification(StreamSpecificationProperty(streamSpecification))

    override fun tableName(tableName: String) {
      cdkBuilder.tableName(tableName)
    }

    override fun timeToLiveSpecification(timeToLiveSpecification: IResolvable) {
      cdkBuilder.timeToLiveSpecification(timeToLiveSpecification.let(IResolvable::unwrap))
    }

    override fun timeToLiveSpecification(timeToLiveSpecification: TimeToLiveSpecificationProperty) {
      cdkBuilder.timeToLiveSpecification(timeToLiveSpecification.let(TimeToLiveSpecificationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("553d4a95a52b82e6cecb813ae356cc9b60f0baf86543b023322ca814aebdc244")
    override
        fun timeToLiveSpecification(timeToLiveSpecification: TimeToLiveSpecificationProperty.Builder.() -> Unit):
        Unit = timeToLiveSpecification(TimeToLiveSpecificationProperty(timeToLiveSpecification))

    override
        fun writeProvisionedThroughputSettings(writeProvisionedThroughputSettings: IResolvable) {
      cdkBuilder.writeProvisionedThroughputSettings(writeProvisionedThroughputSettings.let(IResolvable::unwrap))
    }

    override
        fun writeProvisionedThroughputSettings(writeProvisionedThroughputSettings: WriteProvisionedThroughputSettingsProperty) {
      cdkBuilder.writeProvisionedThroughputSettings(writeProvisionedThroughputSettings.let(WriteProvisionedThroughputSettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dcd27e79c267566886db3ae75fe52c318618fb4fef3740f98057e7fb925594f8")
    override
        fun writeProvisionedThroughputSettings(writeProvisionedThroughputSettings: WriteProvisionedThroughputSettingsProperty.Builder.() -> Unit):
        Unit =
        writeProvisionedThroughputSettings(WriteProvisionedThroughputSettingsProperty(writeProvisionedThroughputSettings))

    public fun build(): software.amazon.awscdk.services.dynamodb.CfnGlobalTable = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGlobalTable {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGlobalTable(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnGlobalTable):
        CfnGlobalTable = CfnGlobalTable(cdkObject)

    internal fun unwrap(wrapped: CfnGlobalTable):
        software.amazon.awscdk.services.dynamodb.CfnGlobalTable = wrapped.cdkObject
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
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.TargetTrackingScalingPolicyConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.TargetTrackingScalingPolicyConfigurationProperty.builder()

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
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.TargetTrackingScalingPolicyConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.TargetTrackingScalingPolicyConfigurationProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnGlobalTable.TargetTrackingScalingPolicyConfigurationProperty):
          TargetTrackingScalingPolicyConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetTrackingScalingPolicyConfigurationProperty):
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.TargetTrackingScalingPolicyConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface TimeToLiveSpecificationProperty {
    public fun attributeName(): String? = unwrap(this).getAttributeName()

    public fun enabled(): Any

    public interface Builder {
      public fun attributeName(attributeName: String)

      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.TimeToLiveSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.TimeToLiveSpecificationProperty.builder()

      override fun attributeName(attributeName: String) {
        cdkBuilder.attributeName(attributeName)
      }

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.TimeToLiveSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.TimeToLiveSpecificationProperty,
    ) : TimeToLiveSpecificationProperty {
      override fun attributeName(): String? = unwrap(this).getAttributeName()

      override fun enabled(): Any = unwrap(this).getEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TimeToLiveSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnGlobalTable.TimeToLiveSpecificationProperty):
          TimeToLiveSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimeToLiveSpecificationProperty):
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.TimeToLiveSpecificationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ProjectionProperty {
    public fun nonKeyAttributes(): List<String> = unwrap(this).getNonKeyAttributes() ?: emptyList()

    public fun projectionType(): String? = unwrap(this).getProjectionType()

    public interface Builder {
      public fun nonKeyAttributes(nonKeyAttributes: List<String>)

      public fun projectionType(projectionType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ProjectionProperty.Builder =
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ProjectionProperty.builder()

      override fun nonKeyAttributes(nonKeyAttributes: List<String>) {
        cdkBuilder.nonKeyAttributes(nonKeyAttributes)
      }

      override fun projectionType(projectionType: String) {
        cdkBuilder.projectionType(projectionType)
      }

      public fun build(): software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ProjectionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ProjectionProperty,
    ) : ProjectionProperty {
      override fun nonKeyAttributes(): List<String> = unwrap(this).getNonKeyAttributes() ?:
          emptyList()

      override fun projectionType(): String? = unwrap(this).getProjectionType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ProjectionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ProjectionProperty):
          ProjectionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProjectionProperty):
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ProjectionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface StreamSpecificationProperty {
    public fun streamViewType(): String

    public interface Builder {
      public fun streamViewType(streamViewType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.StreamSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.StreamSpecificationProperty.builder()

      override fun streamViewType(streamViewType: String) {
        cdkBuilder.streamViewType(streamViewType)
      }

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.StreamSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.StreamSpecificationProperty,
    ) : StreamSpecificationProperty {
      override fun streamViewType(): String = unwrap(this).getStreamViewType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StreamSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnGlobalTable.StreamSpecificationProperty):
          StreamSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StreamSpecificationProperty):
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.StreamSpecificationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CapacityAutoScalingSettingsProperty {
    public fun maxCapacity(): Number

    public fun minCapacity(): Number

    public fun seedCapacity(): Number? = unwrap(this).getSeedCapacity()

    public fun targetTrackingScalingPolicyConfiguration(): Any

    public interface Builder {
      public fun maxCapacity(maxCapacity: Number)

      public fun minCapacity(minCapacity: Number)

      public fun seedCapacity(seedCapacity: Number)

      public
          fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: IResolvable)

      public
          fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: TargetTrackingScalingPolicyConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1f7ea4f6856b22021951baf99d4ce0f93304688be99d2346a741288c2c10da04")
      public
          fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: TargetTrackingScalingPolicyConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.CapacityAutoScalingSettingsProperty.Builder
          =
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.CapacityAutoScalingSettingsProperty.builder()

      override fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
      }

      override fun minCapacity(minCapacity: Number) {
        cdkBuilder.minCapacity(minCapacity)
      }

      override fun seedCapacity(seedCapacity: Number) {
        cdkBuilder.seedCapacity(seedCapacity)
      }

      override
          fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: IResolvable) {
        cdkBuilder.targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration.let(IResolvable::unwrap))
      }

      override
          fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: TargetTrackingScalingPolicyConfigurationProperty) {
        cdkBuilder.targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration.let(TargetTrackingScalingPolicyConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1f7ea4f6856b22021951baf99d4ce0f93304688be99d2346a741288c2c10da04")
      override
          fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: TargetTrackingScalingPolicyConfigurationProperty.Builder.() -> Unit):
          Unit =
          targetTrackingScalingPolicyConfiguration(TargetTrackingScalingPolicyConfigurationProperty(targetTrackingScalingPolicyConfiguration))

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.CapacityAutoScalingSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.CapacityAutoScalingSettingsProperty,
    ) : CapacityAutoScalingSettingsProperty {
      override fun maxCapacity(): Number = unwrap(this).getMaxCapacity()

      override fun minCapacity(): Number = unwrap(this).getMinCapacity()

      override fun seedCapacity(): Number? = unwrap(this).getSeedCapacity()

      override fun targetTrackingScalingPolicyConfiguration(): Any =
          unwrap(this).getTargetTrackingScalingPolicyConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          CapacityAutoScalingSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnGlobalTable.CapacityAutoScalingSettingsProperty):
          CapacityAutoScalingSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CapacityAutoScalingSettingsProperty):
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.CapacityAutoScalingSettingsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ReplicaSpecificationProperty {
    public fun contributorInsightsSpecification(): Any? =
        unwrap(this).getContributorInsightsSpecification()

    public fun deletionProtectionEnabled(): Any? = unwrap(this).getDeletionProtectionEnabled()

    public fun globalSecondaryIndexes(): Any? = unwrap(this).getGlobalSecondaryIndexes()

    public fun kinesisStreamSpecification(): Any? = unwrap(this).getKinesisStreamSpecification()

    public fun pointInTimeRecoverySpecification(): Any? =
        unwrap(this).getPointInTimeRecoverySpecification()

    public fun readProvisionedThroughputSettings(): Any? =
        unwrap(this).getReadProvisionedThroughputSettings()

    public fun region(): String

    public fun sseSpecification(): Any? = unwrap(this).getSseSpecification()

    public fun tableClass(): String? = unwrap(this).getTableClass()

    public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    public interface Builder {
      public fun contributorInsightsSpecification(contributorInsightsSpecification: IResolvable)

      public
          fun contributorInsightsSpecification(contributorInsightsSpecification: ContributorInsightsSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("71eddb50b4ca206239d442b398ce7d5b94bef6a90f535461aa5e307c663646a5")
      public
          fun contributorInsightsSpecification(contributorInsightsSpecification: ContributorInsightsSpecificationProperty.Builder.() -> Unit)

      public fun deletionProtectionEnabled(deletionProtectionEnabled: Boolean)

      public fun deletionProtectionEnabled(deletionProtectionEnabled: IResolvable)

      public fun globalSecondaryIndexes(globalSecondaryIndexes: IResolvable)

      public fun globalSecondaryIndexes(globalSecondaryIndexes: List<Any>)

      public fun kinesisStreamSpecification(kinesisStreamSpecification: IResolvable)

      public
          fun kinesisStreamSpecification(kinesisStreamSpecification: KinesisStreamSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dfe666492aef08b9bfb79830c2e86567773fefbf4421b67635d60d734cb7a30d")
      public
          fun kinesisStreamSpecification(kinesisStreamSpecification: KinesisStreamSpecificationProperty.Builder.() -> Unit)

      public fun pointInTimeRecoverySpecification(pointInTimeRecoverySpecification: IResolvable)

      public
          fun pointInTimeRecoverySpecification(pointInTimeRecoverySpecification: PointInTimeRecoverySpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f6fbca7246bf04731ce2a3668cac30a7b66ce67cf84ef6014c3e35e0d159c98f")
      public
          fun pointInTimeRecoverySpecification(pointInTimeRecoverySpecification: PointInTimeRecoverySpecificationProperty.Builder.() -> Unit)

      public fun readProvisionedThroughputSettings(readProvisionedThroughputSettings: IResolvable)

      public
          fun readProvisionedThroughputSettings(readProvisionedThroughputSettings: ReadProvisionedThroughputSettingsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bfbd18a4232bd36618354d67c1805df58eec0f2b06c96d65883bdccc0fe3ed12")
      public
          fun readProvisionedThroughputSettings(readProvisionedThroughputSettings: ReadProvisionedThroughputSettingsProperty.Builder.() -> Unit)

      public fun region(region: String)

      public fun sseSpecification(sseSpecification: IResolvable)

      public fun sseSpecification(sseSpecification: ReplicaSSESpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8f77a65d920d46118eae66c2871a010c6cc389d9e38c8bbc4ed3970d089d3a40")
      public
          fun sseSpecification(sseSpecification: ReplicaSSESpecificationProperty.Builder.() -> Unit)

      public fun tableClass(tableClass: String)

      public fun tags(tags: List<CfnTag>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaSpecificationProperty.builder()

      override fun contributorInsightsSpecification(contributorInsightsSpecification: IResolvable) {
        cdkBuilder.contributorInsightsSpecification(contributorInsightsSpecification.let(IResolvable::unwrap))
      }

      override
          fun contributorInsightsSpecification(contributorInsightsSpecification: ContributorInsightsSpecificationProperty) {
        cdkBuilder.contributorInsightsSpecification(contributorInsightsSpecification.let(ContributorInsightsSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("71eddb50b4ca206239d442b398ce7d5b94bef6a90f535461aa5e307c663646a5")
      override
          fun contributorInsightsSpecification(contributorInsightsSpecification: ContributorInsightsSpecificationProperty.Builder.() -> Unit):
          Unit =
          contributorInsightsSpecification(ContributorInsightsSpecificationProperty(contributorInsightsSpecification))

      override fun deletionProtectionEnabled(deletionProtectionEnabled: Boolean) {
        cdkBuilder.deletionProtectionEnabled(deletionProtectionEnabled)
      }

      override fun deletionProtectionEnabled(deletionProtectionEnabled: IResolvable) {
        cdkBuilder.deletionProtectionEnabled(deletionProtectionEnabled.let(IResolvable::unwrap))
      }

      override fun globalSecondaryIndexes(globalSecondaryIndexes: IResolvable) {
        cdkBuilder.globalSecondaryIndexes(globalSecondaryIndexes.let(IResolvable::unwrap))
      }

      override fun globalSecondaryIndexes(globalSecondaryIndexes: List<Any>) {
        cdkBuilder.globalSecondaryIndexes(globalSecondaryIndexes)
      }

      override fun kinesisStreamSpecification(kinesisStreamSpecification: IResolvable) {
        cdkBuilder.kinesisStreamSpecification(kinesisStreamSpecification.let(IResolvable::unwrap))
      }

      override
          fun kinesisStreamSpecification(kinesisStreamSpecification: KinesisStreamSpecificationProperty) {
        cdkBuilder.kinesisStreamSpecification(kinesisStreamSpecification.let(KinesisStreamSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dfe666492aef08b9bfb79830c2e86567773fefbf4421b67635d60d734cb7a30d")
      override
          fun kinesisStreamSpecification(kinesisStreamSpecification: KinesisStreamSpecificationProperty.Builder.() -> Unit):
          Unit =
          kinesisStreamSpecification(KinesisStreamSpecificationProperty(kinesisStreamSpecification))

      override fun pointInTimeRecoverySpecification(pointInTimeRecoverySpecification: IResolvable) {
        cdkBuilder.pointInTimeRecoverySpecification(pointInTimeRecoverySpecification.let(IResolvable::unwrap))
      }

      override
          fun pointInTimeRecoverySpecification(pointInTimeRecoverySpecification: PointInTimeRecoverySpecificationProperty) {
        cdkBuilder.pointInTimeRecoverySpecification(pointInTimeRecoverySpecification.let(PointInTimeRecoverySpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f6fbca7246bf04731ce2a3668cac30a7b66ce67cf84ef6014c3e35e0d159c98f")
      override
          fun pointInTimeRecoverySpecification(pointInTimeRecoverySpecification: PointInTimeRecoverySpecificationProperty.Builder.() -> Unit):
          Unit =
          pointInTimeRecoverySpecification(PointInTimeRecoverySpecificationProperty(pointInTimeRecoverySpecification))

      override
          fun readProvisionedThroughputSettings(readProvisionedThroughputSettings: IResolvable) {
        cdkBuilder.readProvisionedThroughputSettings(readProvisionedThroughputSettings.let(IResolvable::unwrap))
      }

      override
          fun readProvisionedThroughputSettings(readProvisionedThroughputSettings: ReadProvisionedThroughputSettingsProperty) {
        cdkBuilder.readProvisionedThroughputSettings(readProvisionedThroughputSettings.let(ReadProvisionedThroughputSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bfbd18a4232bd36618354d67c1805df58eec0f2b06c96d65883bdccc0fe3ed12")
      override
          fun readProvisionedThroughputSettings(readProvisionedThroughputSettings: ReadProvisionedThroughputSettingsProperty.Builder.() -> Unit):
          Unit =
          readProvisionedThroughputSettings(ReadProvisionedThroughputSettingsProperty(readProvisionedThroughputSettings))

      override fun region(region: String) {
        cdkBuilder.region(region)
      }

      override fun sseSpecification(sseSpecification: IResolvable) {
        cdkBuilder.sseSpecification(sseSpecification.let(IResolvable::unwrap))
      }

      override fun sseSpecification(sseSpecification: ReplicaSSESpecificationProperty) {
        cdkBuilder.sseSpecification(sseSpecification.let(ReplicaSSESpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8f77a65d920d46118eae66c2871a010c6cc389d9e38c8bbc4ed3970d089d3a40")
      override
          fun sseSpecification(sseSpecification: ReplicaSSESpecificationProperty.Builder.() -> Unit):
          Unit = sseSpecification(ReplicaSSESpecificationProperty(sseSpecification))

      override fun tableClass(tableClass: String) {
        cdkBuilder.tableClass(tableClass)
      }

      override fun tags(tags: List<CfnTag>) {
        cdkBuilder.tags(tags.map(CfnTag::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaSpecificationProperty,
    ) : ReplicaSpecificationProperty {
      override fun contributorInsightsSpecification(): Any? =
          unwrap(this).getContributorInsightsSpecification()

      override fun deletionProtectionEnabled(): Any? = unwrap(this).getDeletionProtectionEnabled()

      override fun globalSecondaryIndexes(): Any? = unwrap(this).getGlobalSecondaryIndexes()

      override fun kinesisStreamSpecification(): Any? = unwrap(this).getKinesisStreamSpecification()

      override fun pointInTimeRecoverySpecification(): Any? =
          unwrap(this).getPointInTimeRecoverySpecification()

      override fun readProvisionedThroughputSettings(): Any? =
          unwrap(this).getReadProvisionedThroughputSettings()

      override fun region(): String = unwrap(this).getRegion()

      override fun sseSpecification(): Any? = unwrap(this).getSseSpecification()

      override fun tableClass(): String? = unwrap(this).getTableClass()

      override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ReplicaSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaSpecificationProperty):
          ReplicaSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReplicaSpecificationProperty):
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaSpecificationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ContributorInsightsSpecificationProperty {
    public fun enabled(): Any

    public interface Builder {
      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ContributorInsightsSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ContributorInsightsSpecificationProperty.builder()

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ContributorInsightsSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ContributorInsightsSpecificationProperty,
    ) : ContributorInsightsSpecificationProperty {
      override fun enabled(): Any = unwrap(this).getEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ContributorInsightsSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ContributorInsightsSpecificationProperty):
          ContributorInsightsSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContributorInsightsSpecificationProperty):
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ContributorInsightsSpecificationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface GlobalSecondaryIndexProperty {
    public fun indexName(): String

    public fun keySchema(): Any

    public fun projection(): Any

    public fun writeProvisionedThroughputSettings(): Any? =
        unwrap(this).getWriteProvisionedThroughputSettings()

    public interface Builder {
      public fun indexName(indexName: String)

      public fun keySchema(keySchema: IResolvable)

      public fun keySchema(keySchema: List<Any>)

      public fun projection(projection: IResolvable)

      public fun projection(projection: ProjectionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f58d5331a2b6e0e2a944808861029f8d5207b9bfe0b220f19868469cc21f4955")
      public fun projection(projection: ProjectionProperty.Builder.() -> Unit)

      public fun writeProvisionedThroughputSettings(writeProvisionedThroughputSettings: IResolvable)

      public
          fun writeProvisionedThroughputSettings(writeProvisionedThroughputSettings: WriteProvisionedThroughputSettingsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a0a9a3e1aa0c2088ddba833b9a25dc013a4c95a011c4e48781b132398f502f21")
      public
          fun writeProvisionedThroughputSettings(writeProvisionedThroughputSettings: WriteProvisionedThroughputSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.GlobalSecondaryIndexProperty.Builder
          =
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.GlobalSecondaryIndexProperty.builder()

      override fun indexName(indexName: String) {
        cdkBuilder.indexName(indexName)
      }

      override fun keySchema(keySchema: IResolvable) {
        cdkBuilder.keySchema(keySchema.let(IResolvable::unwrap))
      }

      override fun keySchema(keySchema: List<Any>) {
        cdkBuilder.keySchema(keySchema)
      }

      override fun projection(projection: IResolvable) {
        cdkBuilder.projection(projection.let(IResolvable::unwrap))
      }

      override fun projection(projection: ProjectionProperty) {
        cdkBuilder.projection(projection.let(ProjectionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f58d5331a2b6e0e2a944808861029f8d5207b9bfe0b220f19868469cc21f4955")
      override fun projection(projection: ProjectionProperty.Builder.() -> Unit): Unit =
          projection(ProjectionProperty(projection))

      override
          fun writeProvisionedThroughputSettings(writeProvisionedThroughputSettings: IResolvable) {
        cdkBuilder.writeProvisionedThroughputSettings(writeProvisionedThroughputSettings.let(IResolvable::unwrap))
      }

      override
          fun writeProvisionedThroughputSettings(writeProvisionedThroughputSettings: WriteProvisionedThroughputSettingsProperty) {
        cdkBuilder.writeProvisionedThroughputSettings(writeProvisionedThroughputSettings.let(WriteProvisionedThroughputSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a0a9a3e1aa0c2088ddba833b9a25dc013a4c95a011c4e48781b132398f502f21")
      override
          fun writeProvisionedThroughputSettings(writeProvisionedThroughputSettings: WriteProvisionedThroughputSettingsProperty.Builder.() -> Unit):
          Unit =
          writeProvisionedThroughputSettings(WriteProvisionedThroughputSettingsProperty(writeProvisionedThroughputSettings))

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.GlobalSecondaryIndexProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.GlobalSecondaryIndexProperty,
    ) : GlobalSecondaryIndexProperty {
      override fun indexName(): String = unwrap(this).getIndexName()

      override fun keySchema(): Any = unwrap(this).getKeySchema()

      override fun projection(): Any = unwrap(this).getProjection()

      override fun writeProvisionedThroughputSettings(): Any? =
          unwrap(this).getWriteProvisionedThroughputSettings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GlobalSecondaryIndexProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnGlobalTable.GlobalSecondaryIndexProperty):
          GlobalSecondaryIndexProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GlobalSecondaryIndexProperty):
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.GlobalSecondaryIndexProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ReplicaGlobalSecondaryIndexSpecificationProperty {
    public fun contributorInsightsSpecification(): Any? =
        unwrap(this).getContributorInsightsSpecification()

    public fun indexName(): String

    public fun readProvisionedThroughputSettings(): Any? =
        unwrap(this).getReadProvisionedThroughputSettings()

    public interface Builder {
      public fun contributorInsightsSpecification(contributorInsightsSpecification: IResolvable)

      public
          fun contributorInsightsSpecification(contributorInsightsSpecification: ContributorInsightsSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3afc9fdd202c3b1cd2eae6dba9b04577a438b37b5627db7f818ecda8d67c8d11")
      public
          fun contributorInsightsSpecification(contributorInsightsSpecification: ContributorInsightsSpecificationProperty.Builder.() -> Unit)

      public fun indexName(indexName: String)

      public fun readProvisionedThroughputSettings(readProvisionedThroughputSettings: IResolvable)

      public
          fun readProvisionedThroughputSettings(readProvisionedThroughputSettings: ReadProvisionedThroughputSettingsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("84995732399c653ddcc401adfea203e3db5a793d859860bd38d504b20c54e3ce")
      public
          fun readProvisionedThroughputSettings(readProvisionedThroughputSettings: ReadProvisionedThroughputSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaGlobalSecondaryIndexSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaGlobalSecondaryIndexSpecificationProperty.builder()

      override fun contributorInsightsSpecification(contributorInsightsSpecification: IResolvable) {
        cdkBuilder.contributorInsightsSpecification(contributorInsightsSpecification.let(IResolvable::unwrap))
      }

      override
          fun contributorInsightsSpecification(contributorInsightsSpecification: ContributorInsightsSpecificationProperty) {
        cdkBuilder.contributorInsightsSpecification(contributorInsightsSpecification.let(ContributorInsightsSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3afc9fdd202c3b1cd2eae6dba9b04577a438b37b5627db7f818ecda8d67c8d11")
      override
          fun contributorInsightsSpecification(contributorInsightsSpecification: ContributorInsightsSpecificationProperty.Builder.() -> Unit):
          Unit =
          contributorInsightsSpecification(ContributorInsightsSpecificationProperty(contributorInsightsSpecification))

      override fun indexName(indexName: String) {
        cdkBuilder.indexName(indexName)
      }

      override
          fun readProvisionedThroughputSettings(readProvisionedThroughputSettings: IResolvable) {
        cdkBuilder.readProvisionedThroughputSettings(readProvisionedThroughputSettings.let(IResolvable::unwrap))
      }

      override
          fun readProvisionedThroughputSettings(readProvisionedThroughputSettings: ReadProvisionedThroughputSettingsProperty) {
        cdkBuilder.readProvisionedThroughputSettings(readProvisionedThroughputSettings.let(ReadProvisionedThroughputSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("84995732399c653ddcc401adfea203e3db5a793d859860bd38d504b20c54e3ce")
      override
          fun readProvisionedThroughputSettings(readProvisionedThroughputSettings: ReadProvisionedThroughputSettingsProperty.Builder.() -> Unit):
          Unit =
          readProvisionedThroughputSettings(ReadProvisionedThroughputSettingsProperty(readProvisionedThroughputSettings))

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaGlobalSecondaryIndexSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaGlobalSecondaryIndexSpecificationProperty,
    ) : ReplicaGlobalSecondaryIndexSpecificationProperty {
      override fun contributorInsightsSpecification(): Any? =
          unwrap(this).getContributorInsightsSpecification()

      override fun indexName(): String = unwrap(this).getIndexName()

      override fun readProvisionedThroughputSettings(): Any? =
          unwrap(this).getReadProvisionedThroughputSettings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ReplicaGlobalSecondaryIndexSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaGlobalSecondaryIndexSpecificationProperty):
          ReplicaGlobalSecondaryIndexSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReplicaGlobalSecondaryIndexSpecificationProperty):
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaGlobalSecondaryIndexSpecificationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AttributeDefinitionProperty {
    public fun attributeName(): String

    public fun attributeType(): String

    public interface Builder {
      public fun attributeName(attributeName: String)

      public fun attributeType(attributeType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.AttributeDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.AttributeDefinitionProperty.builder()

      override fun attributeName(attributeName: String) {
        cdkBuilder.attributeName(attributeName)
      }

      override fun attributeType(attributeType: String) {
        cdkBuilder.attributeType(attributeType)
      }

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.AttributeDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.AttributeDefinitionProperty,
    ) : AttributeDefinitionProperty {
      override fun attributeName(): String = unwrap(this).getAttributeName()

      override fun attributeType(): String = unwrap(this).getAttributeType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AttributeDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnGlobalTable.AttributeDefinitionProperty):
          AttributeDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AttributeDefinitionProperty):
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.AttributeDefinitionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ReplicaSSESpecificationProperty {
    public fun kmsMasterKeyId(): String

    public interface Builder {
      public fun kmsMasterKeyId(kmsMasterKeyId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaSSESpecificationProperty.Builder
          =
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaSSESpecificationProperty.builder()

      override fun kmsMasterKeyId(kmsMasterKeyId: String) {
        cdkBuilder.kmsMasterKeyId(kmsMasterKeyId)
      }

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaSSESpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaSSESpecificationProperty,
    ) : ReplicaSSESpecificationProperty {
      override fun kmsMasterKeyId(): String = unwrap(this).getKmsMasterKeyId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ReplicaSSESpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaSSESpecificationProperty):
          ReplicaSSESpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReplicaSSESpecificationProperty):
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaSSESpecificationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SSESpecificationProperty {
    public fun sseEnabled(): Any

    public fun sseType(): String? = unwrap(this).getSseType()

    public interface Builder {
      public fun sseEnabled(sseEnabled: Boolean)

      public fun sseEnabled(sseEnabled: IResolvable)

      public fun sseType(sseType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.SSESpecificationProperty.Builder =
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.SSESpecificationProperty.builder()

      override fun sseEnabled(sseEnabled: Boolean) {
        cdkBuilder.sseEnabled(sseEnabled)
      }

      override fun sseEnabled(sseEnabled: IResolvable) {
        cdkBuilder.sseEnabled(sseEnabled.let(IResolvable::unwrap))
      }

      override fun sseType(sseType: String) {
        cdkBuilder.sseType(sseType)
      }

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.SSESpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.SSESpecificationProperty,
    ) : SSESpecificationProperty {
      override fun sseEnabled(): Any = unwrap(this).getSseEnabled()

      override fun sseType(): String? = unwrap(this).getSseType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SSESpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnGlobalTable.SSESpecificationProperty):
          SSESpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SSESpecificationProperty):
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.SSESpecificationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface KeySchemaProperty {
    public fun attributeName(): String

    public fun keyType(): String

    public interface Builder {
      public fun attributeName(attributeName: String)

      public fun keyType(keyType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.KeySchemaProperty.Builder =
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.KeySchemaProperty.builder()

      override fun attributeName(attributeName: String) {
        cdkBuilder.attributeName(attributeName)
      }

      override fun keyType(keyType: String) {
        cdkBuilder.keyType(keyType)
      }

      public fun build(): software.amazon.awscdk.services.dynamodb.CfnGlobalTable.KeySchemaProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.KeySchemaProperty,
    ) : KeySchemaProperty {
      override fun attributeName(): String = unwrap(this).getAttributeName()

      override fun keyType(): String = unwrap(this).getKeyType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KeySchemaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnGlobalTable.KeySchemaProperty):
          KeySchemaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KeySchemaProperty):
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.KeySchemaProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface WriteProvisionedThroughputSettingsProperty {
    public fun writeCapacityAutoScalingSettings(): Any? =
        unwrap(this).getWriteCapacityAutoScalingSettings()

    public interface Builder {
      public fun writeCapacityAutoScalingSettings(writeCapacityAutoScalingSettings: IResolvable)

      public
          fun writeCapacityAutoScalingSettings(writeCapacityAutoScalingSettings: CapacityAutoScalingSettingsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c030867d57291db5318e89e23ab5635491b7190a76bb37354a0ec87057c22946")
      public
          fun writeCapacityAutoScalingSettings(writeCapacityAutoScalingSettings: CapacityAutoScalingSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.WriteProvisionedThroughputSettingsProperty.Builder
          =
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.WriteProvisionedThroughputSettingsProperty.builder()

      override fun writeCapacityAutoScalingSettings(writeCapacityAutoScalingSettings: IResolvable) {
        cdkBuilder.writeCapacityAutoScalingSettings(writeCapacityAutoScalingSettings.let(IResolvable::unwrap))
      }

      override
          fun writeCapacityAutoScalingSettings(writeCapacityAutoScalingSettings: CapacityAutoScalingSettingsProperty) {
        cdkBuilder.writeCapacityAutoScalingSettings(writeCapacityAutoScalingSettings.let(CapacityAutoScalingSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c030867d57291db5318e89e23ab5635491b7190a76bb37354a0ec87057c22946")
      override
          fun writeCapacityAutoScalingSettings(writeCapacityAutoScalingSettings: CapacityAutoScalingSettingsProperty.Builder.() -> Unit):
          Unit =
          writeCapacityAutoScalingSettings(CapacityAutoScalingSettingsProperty(writeCapacityAutoScalingSettings))

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.WriteProvisionedThroughputSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.WriteProvisionedThroughputSettingsProperty,
    ) : WriteProvisionedThroughputSettingsProperty {
      override fun writeCapacityAutoScalingSettings(): Any? =
          unwrap(this).getWriteCapacityAutoScalingSettings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          WriteProvisionedThroughputSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnGlobalTable.WriteProvisionedThroughputSettingsProperty):
          WriteProvisionedThroughputSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WriteProvisionedThroughputSettingsProperty):
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.WriteProvisionedThroughputSettingsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface LocalSecondaryIndexProperty {
    public fun indexName(): String

    public fun keySchema(): Any

    public fun projection(): Any

    public interface Builder {
      public fun indexName(indexName: String)

      public fun keySchema(keySchema: IResolvable)

      public fun keySchema(keySchema: List<Any>)

      public fun projection(projection: IResolvable)

      public fun projection(projection: ProjectionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0e4589d72bff11e2c15ac41559d1db3d78d20953e627958ae218cee61bd0aea9")
      public fun projection(projection: ProjectionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.LocalSecondaryIndexProperty.Builder
          =
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.LocalSecondaryIndexProperty.builder()

      override fun indexName(indexName: String) {
        cdkBuilder.indexName(indexName)
      }

      override fun keySchema(keySchema: IResolvable) {
        cdkBuilder.keySchema(keySchema.let(IResolvable::unwrap))
      }

      override fun keySchema(keySchema: List<Any>) {
        cdkBuilder.keySchema(keySchema)
      }

      override fun projection(projection: IResolvable) {
        cdkBuilder.projection(projection.let(IResolvable::unwrap))
      }

      override fun projection(projection: ProjectionProperty) {
        cdkBuilder.projection(projection.let(ProjectionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0e4589d72bff11e2c15ac41559d1db3d78d20953e627958ae218cee61bd0aea9")
      override fun projection(projection: ProjectionProperty.Builder.() -> Unit): Unit =
          projection(ProjectionProperty(projection))

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.LocalSecondaryIndexProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.LocalSecondaryIndexProperty,
    ) : LocalSecondaryIndexProperty {
      override fun indexName(): String = unwrap(this).getIndexName()

      override fun keySchema(): Any = unwrap(this).getKeySchema()

      override fun projection(): Any = unwrap(this).getProjection()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LocalSecondaryIndexProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnGlobalTable.LocalSecondaryIndexProperty):
          LocalSecondaryIndexProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LocalSecondaryIndexProperty):
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.LocalSecondaryIndexProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface PointInTimeRecoverySpecificationProperty {
    public fun pointInTimeRecoveryEnabled(): Any? = unwrap(this).getPointInTimeRecoveryEnabled()

    public interface Builder {
      public fun pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled: Boolean)

      public fun pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.PointInTimeRecoverySpecificationProperty.Builder
          =
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.PointInTimeRecoverySpecificationProperty.builder()

      override fun pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled: Boolean) {
        cdkBuilder.pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled)
      }

      override fun pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled: IResolvable) {
        cdkBuilder.pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.PointInTimeRecoverySpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.PointInTimeRecoverySpecificationProperty,
    ) : PointInTimeRecoverySpecificationProperty {
      override fun pointInTimeRecoveryEnabled(): Any? = unwrap(this).getPointInTimeRecoveryEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          PointInTimeRecoverySpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnGlobalTable.PointInTimeRecoverySpecificationProperty):
          PointInTimeRecoverySpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PointInTimeRecoverySpecificationProperty):
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.PointInTimeRecoverySpecificationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ReadProvisionedThroughputSettingsProperty {
    public fun readCapacityAutoScalingSettings(): Any? =
        unwrap(this).getReadCapacityAutoScalingSettings()

    public fun readCapacityUnits(): Number? = unwrap(this).getReadCapacityUnits()

    public interface Builder {
      public fun readCapacityAutoScalingSettings(readCapacityAutoScalingSettings: IResolvable)

      public
          fun readCapacityAutoScalingSettings(readCapacityAutoScalingSettings: CapacityAutoScalingSettingsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a0af043491dcca202df6a740240dcabcc4cda2a11fa346d48efb3a2c47230a26")
      public
          fun readCapacityAutoScalingSettings(readCapacityAutoScalingSettings: CapacityAutoScalingSettingsProperty.Builder.() -> Unit)

      public fun readCapacityUnits(readCapacityUnits: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReadProvisionedThroughputSettingsProperty.Builder
          =
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReadProvisionedThroughputSettingsProperty.builder()

      override fun readCapacityAutoScalingSettings(readCapacityAutoScalingSettings: IResolvable) {
        cdkBuilder.readCapacityAutoScalingSettings(readCapacityAutoScalingSettings.let(IResolvable::unwrap))
      }

      override
          fun readCapacityAutoScalingSettings(readCapacityAutoScalingSettings: CapacityAutoScalingSettingsProperty) {
        cdkBuilder.readCapacityAutoScalingSettings(readCapacityAutoScalingSettings.let(CapacityAutoScalingSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a0af043491dcca202df6a740240dcabcc4cda2a11fa346d48efb3a2c47230a26")
      override
          fun readCapacityAutoScalingSettings(readCapacityAutoScalingSettings: CapacityAutoScalingSettingsProperty.Builder.() -> Unit):
          Unit =
          readCapacityAutoScalingSettings(CapacityAutoScalingSettingsProperty(readCapacityAutoScalingSettings))

      override fun readCapacityUnits(readCapacityUnits: Number) {
        cdkBuilder.readCapacityUnits(readCapacityUnits)
      }

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReadProvisionedThroughputSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReadProvisionedThroughputSettingsProperty,
    ) : ReadProvisionedThroughputSettingsProperty {
      override fun readCapacityAutoScalingSettings(): Any? =
          unwrap(this).getReadCapacityAutoScalingSettings()

      override fun readCapacityUnits(): Number? = unwrap(this).getReadCapacityUnits()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ReadProvisionedThroughputSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReadProvisionedThroughputSettingsProperty):
          ReadProvisionedThroughputSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReadProvisionedThroughputSettingsProperty):
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReadProvisionedThroughputSettingsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface KinesisStreamSpecificationProperty {
    public fun approximateCreationDateTimePrecision(): String? =
        unwrap(this).getApproximateCreationDateTimePrecision()

    public fun streamArn(): String

    public interface Builder {
      public fun approximateCreationDateTimePrecision(approximateCreationDateTimePrecision: String)

      public fun streamArn(streamArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.KinesisStreamSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.KinesisStreamSpecificationProperty.builder()

      override
          fun approximateCreationDateTimePrecision(approximateCreationDateTimePrecision: String) {
        cdkBuilder.approximateCreationDateTimePrecision(approximateCreationDateTimePrecision)
      }

      override fun streamArn(streamArn: String) {
        cdkBuilder.streamArn(streamArn)
      }

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.KinesisStreamSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.KinesisStreamSpecificationProperty,
    ) : KinesisStreamSpecificationProperty {
      override fun approximateCreationDateTimePrecision(): String? =
          unwrap(this).getApproximateCreationDateTimePrecision()

      override fun streamArn(): String = unwrap(this).getStreamArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          KinesisStreamSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnGlobalTable.KinesisStreamSpecificationProperty):
          KinesisStreamSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisStreamSpecificationProperty):
          software.amazon.awscdk.services.dynamodb.CfnGlobalTable.KinesisStreamSpecificationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
