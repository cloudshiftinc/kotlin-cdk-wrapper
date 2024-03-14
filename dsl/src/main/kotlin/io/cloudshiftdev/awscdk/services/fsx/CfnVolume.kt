package io.cloudshiftdev.awscdk.services.fsx

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

public open class CfnVolume internal constructor(
  private val cdkObject: software.amazon.awscdk.services.fsx.CfnVolume,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrResourceArn(): String = unwrap(this).getAttrResourceArn()

  public open fun attrUuid(): String = unwrap(this).getAttrUuid()

  public open fun attrVolumeId(): String = unwrap(this).getAttrVolumeId()

  public open fun backupId(): String? = unwrap(this).getBackupId()

  public open fun backupId(`value`: String) {
    unwrap(this).setBackupId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun ontapConfiguration(): Any? = unwrap(this).getOntapConfiguration()

  public open fun ontapConfiguration(`value`: IResolvable) {
    unwrap(this).setOntapConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun ontapConfiguration(`value`: OntapConfigurationProperty) {
    unwrap(this).setOntapConfiguration(`value`.let(OntapConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e226ead65916dc6418e24bc447fc81c273c60407d2c68df785effcb85f4e7103")
  public open fun ontapConfiguration(`value`: OntapConfigurationProperty.Builder.() -> Unit): Unit =
      ontapConfiguration(OntapConfigurationProperty(`value`))

  public open fun openZfsConfiguration(): Any? = unwrap(this).getOpenZfsConfiguration()

  public open fun openZfsConfiguration(`value`: IResolvable) {
    unwrap(this).setOpenZfsConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun openZfsConfiguration(`value`: OpenZFSConfigurationProperty) {
    unwrap(this).setOpenZfsConfiguration(`value`.let(OpenZFSConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5390a680a0692f0d9a74615accdc7d2da6fbfe41346a12b4edd06f8d33e4fafc")
  public open fun openZfsConfiguration(`value`: OpenZFSConfigurationProperty.Builder.() -> Unit):
      Unit = openZfsConfiguration(OpenZFSConfigurationProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun volumeType(): String? = unwrap(this).getVolumeType()

  public open fun volumeType(`value`: String) {
    unwrap(this).setVolumeType(`value`)
  }

  public interface Builder {
    public fun backupId(backupId: String) {
    }

    public fun name(name: String) {
    }

    public fun ontapConfiguration(ontapConfiguration: IResolvable) {
    }

    public fun ontapConfiguration(ontapConfiguration: OntapConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c7f93abf2c6dc6b60e818d642b6856ed2dc86d28371c220edf14d5a0e2c2ae3c")
    public
        fun ontapConfiguration(ontapConfiguration: OntapConfigurationProperty.Builder.() -> Unit) {
    }

    public fun openZfsConfiguration(openZfsConfiguration: IResolvable) {
    }

    public fun openZfsConfiguration(openZfsConfiguration: OpenZFSConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2795760a67c25337c26bca613fb21662b3dbcf7eac28bab4097f7b05e9a12196")
    public
        fun openZfsConfiguration(openZfsConfiguration: OpenZFSConfigurationProperty.Builder.() -> Unit) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun volumeType(volumeType: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.fsx.CfnVolume.Builder =
        software.amazon.awscdk.services.fsx.CfnVolume.Builder.create(scope, id)

    public override fun backupId(backupId: String) {
      cdkBuilder.backupId(backupId)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun ontapConfiguration(ontapConfiguration: IResolvable) {
      cdkBuilder.ontapConfiguration(ontapConfiguration.let(IResolvable::unwrap))
    }

    public override fun ontapConfiguration(ontapConfiguration: OntapConfigurationProperty) {
      cdkBuilder.ontapConfiguration(ontapConfiguration.let(OntapConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c7f93abf2c6dc6b60e818d642b6856ed2dc86d28371c220edf14d5a0e2c2ae3c")
    public override
        fun ontapConfiguration(ontapConfiguration: OntapConfigurationProperty.Builder.() -> Unit):
        Unit = ontapConfiguration(OntapConfigurationProperty(ontapConfiguration))

    public override fun openZfsConfiguration(openZfsConfiguration: IResolvable) {
      cdkBuilder.openZfsConfiguration(openZfsConfiguration.let(IResolvable::unwrap))
    }

    public override fun openZfsConfiguration(openZfsConfiguration: OpenZFSConfigurationProperty) {
      cdkBuilder.openZfsConfiguration(openZfsConfiguration.let(OpenZFSConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2795760a67c25337c26bca613fb21662b3dbcf7eac28bab4097f7b05e9a12196")
    public override
        fun openZfsConfiguration(openZfsConfiguration: OpenZFSConfigurationProperty.Builder.() -> Unit):
        Unit = openZfsConfiguration(OpenZFSConfigurationProperty(openZfsConfiguration))

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun volumeType(volumeType: String) {
      cdkBuilder.volumeType(volumeType)
    }

    public fun build(): software.amazon.awscdk.services.fsx.CfnVolume = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVolume {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVolume(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnVolume): CfnVolume =
        CfnVolume(cdkObject)

    internal fun unwrap(wrapped: CfnVolume): software.amazon.awscdk.services.fsx.CfnVolume =
        wrapped.cdkObject
  }

  public interface NfsExportsProperty {
    public fun clientConfigurations(): Any

    public interface Builder {
      public fun clientConfigurations(clientConfigurations: IResolvable) {
      }

      public fun clientConfigurations(clientConfigurations: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnVolume.NfsExportsProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnVolume.NfsExportsProperty.builder()

      public override fun clientConfigurations(clientConfigurations: IResolvable) {
        cdkBuilder.clientConfigurations(clientConfigurations.let(IResolvable::unwrap))
      }

      public override fun clientConfigurations(clientConfigurations: List<Any>) {
        cdkBuilder.clientConfigurations(clientConfigurations)
      }

      public fun build(): software.amazon.awscdk.services.fsx.CfnVolume.NfsExportsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.fsx.CfnVolume.NfsExportsProperty,
    ) : NfsExportsProperty {
      public override fun clientConfigurations(): Any = unwrap(this).getClientConfigurations()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NfsExportsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnVolume.NfsExportsProperty):
          NfsExportsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NfsExportsProperty):
          software.amazon.awscdk.services.fsx.CfnVolume.NfsExportsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AggregateConfigurationProperty {
    public fun aggregates(): List<String> = unwrap(this).getAggregates() ?: emptyList()

    public fun constituentsPerAggregate(): Number? = unwrap(this).getConstituentsPerAggregate()

    public interface Builder {
      public fun aggregates(aggregates: List<String>) {
      }

      public fun constituentsPerAggregate(constituentsPerAggregate: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnVolume.AggregateConfigurationProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnVolume.AggregateConfigurationProperty.builder()

      public override fun aggregates(aggregates: List<String>) {
        cdkBuilder.aggregates(aggregates)
      }

      public override fun constituentsPerAggregate(constituentsPerAggregate: Number) {
        cdkBuilder.constituentsPerAggregate(constituentsPerAggregate)
      }

      public fun build():
          software.amazon.awscdk.services.fsx.CfnVolume.AggregateConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.fsx.CfnVolume.AggregateConfigurationProperty,
    ) : AggregateConfigurationProperty {
      public override fun aggregates(): List<String> = unwrap(this).getAggregates() ?: emptyList()

      public override fun constituentsPerAggregate(): Number? =
          unwrap(this).getConstituentsPerAggregate()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AggregateConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnVolume.AggregateConfigurationProperty):
          AggregateConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AggregateConfigurationProperty):
          software.amazon.awscdk.services.fsx.CfnVolume.AggregateConfigurationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SnaplockRetentionPeriodProperty {
    public fun defaultRetention(): Any

    public fun maximumRetention(): Any

    public fun minimumRetention(): Any

    public interface Builder {
      public fun defaultRetention(defaultRetention: IResolvable) {
      }

      public fun defaultRetention(defaultRetention: RetentionPeriodProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8a42a5037103ecf76c0a9f00ef8c2fe089b7914680cc04cda363796f099e8bd4")
      public fun defaultRetention(defaultRetention: RetentionPeriodProperty.Builder.() -> Unit) {
      }

      public fun maximumRetention(maximumRetention: IResolvable) {
      }

      public fun maximumRetention(maximumRetention: RetentionPeriodProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("70d68515ae4f0204070f094fd7932b69f8841870d439504d18b4c3e586ee30a3")
      public fun maximumRetention(maximumRetention: RetentionPeriodProperty.Builder.() -> Unit) {
      }

      public fun minimumRetention(minimumRetention: IResolvable) {
      }

      public fun minimumRetention(minimumRetention: RetentionPeriodProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b577d436edea2397c35c744ca0cfd12f57db380f6daeca18cf04497f22097758")
      public fun minimumRetention(minimumRetention: RetentionPeriodProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnVolume.SnaplockRetentionPeriodProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnVolume.SnaplockRetentionPeriodProperty.builder()

      public override fun defaultRetention(defaultRetention: IResolvable) {
        cdkBuilder.defaultRetention(defaultRetention.let(IResolvable::unwrap))
      }

      public override fun defaultRetention(defaultRetention: RetentionPeriodProperty) {
        cdkBuilder.defaultRetention(defaultRetention.let(RetentionPeriodProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8a42a5037103ecf76c0a9f00ef8c2fe089b7914680cc04cda363796f099e8bd4")
      public override
          fun defaultRetention(defaultRetention: RetentionPeriodProperty.Builder.() -> Unit): Unit =
          defaultRetention(RetentionPeriodProperty(defaultRetention))

      public override fun maximumRetention(maximumRetention: IResolvable) {
        cdkBuilder.maximumRetention(maximumRetention.let(IResolvable::unwrap))
      }

      public override fun maximumRetention(maximumRetention: RetentionPeriodProperty) {
        cdkBuilder.maximumRetention(maximumRetention.let(RetentionPeriodProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("70d68515ae4f0204070f094fd7932b69f8841870d439504d18b4c3e586ee30a3")
      public override
          fun maximumRetention(maximumRetention: RetentionPeriodProperty.Builder.() -> Unit): Unit =
          maximumRetention(RetentionPeriodProperty(maximumRetention))

      public override fun minimumRetention(minimumRetention: IResolvable) {
        cdkBuilder.minimumRetention(minimumRetention.let(IResolvable::unwrap))
      }

      public override fun minimumRetention(minimumRetention: RetentionPeriodProperty) {
        cdkBuilder.minimumRetention(minimumRetention.let(RetentionPeriodProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b577d436edea2397c35c744ca0cfd12f57db380f6daeca18cf04497f22097758")
      public override
          fun minimumRetention(minimumRetention: RetentionPeriodProperty.Builder.() -> Unit): Unit =
          minimumRetention(RetentionPeriodProperty(minimumRetention))

      public fun build():
          software.amazon.awscdk.services.fsx.CfnVolume.SnaplockRetentionPeriodProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.fsx.CfnVolume.SnaplockRetentionPeriodProperty,
    ) : SnaplockRetentionPeriodProperty {
      public override fun defaultRetention(): Any = unwrap(this).getDefaultRetention()

      public override fun maximumRetention(): Any = unwrap(this).getMaximumRetention()

      public override fun minimumRetention(): Any = unwrap(this).getMinimumRetention()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SnaplockRetentionPeriodProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnVolume.SnaplockRetentionPeriodProperty):
          SnaplockRetentionPeriodProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SnaplockRetentionPeriodProperty):
          software.amazon.awscdk.services.fsx.CfnVolume.SnaplockRetentionPeriodProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface TieringPolicyProperty {
    public fun coolingPeriod(): Number? = unwrap(this).getCoolingPeriod()

    public fun name(): String? = unwrap(this).getName()

    public interface Builder {
      public fun coolingPeriod(coolingPeriod: Number) {
      }

      public fun name(name: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnVolume.TieringPolicyProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnVolume.TieringPolicyProperty.builder()

      public override fun coolingPeriod(coolingPeriod: Number) {
        cdkBuilder.coolingPeriod(coolingPeriod)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.fsx.CfnVolume.TieringPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.fsx.CfnVolume.TieringPolicyProperty,
    ) : TieringPolicyProperty {
      public override fun coolingPeriod(): Number? = unwrap(this).getCoolingPeriod()

      public override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TieringPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnVolume.TieringPolicyProperty):
          TieringPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TieringPolicyProperty):
          software.amazon.awscdk.services.fsx.CfnVolume.TieringPolicyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ClientConfigurationsProperty {
    public fun clients(): String

    public fun options(): List<String>

    public interface Builder {
      public fun clients(clients: String) {
      }

      public fun options(options: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnVolume.ClientConfigurationsProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnVolume.ClientConfigurationsProperty.builder()

      public override fun clients(clients: String) {
        cdkBuilder.clients(clients)
      }

      public override fun options(options: List<String>) {
        cdkBuilder.options(options)
      }

      public fun build(): software.amazon.awscdk.services.fsx.CfnVolume.ClientConfigurationsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.fsx.CfnVolume.ClientConfigurationsProperty,
    ) : ClientConfigurationsProperty {
      public override fun clients(): String = unwrap(this).getClients()

      public override fun options(): List<String> = unwrap(this).getOptions() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ClientConfigurationsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnVolume.ClientConfigurationsProperty):
          ClientConfigurationsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClientConfigurationsProperty):
          software.amazon.awscdk.services.fsx.CfnVolume.ClientConfigurationsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface UserAndGroupQuotasProperty {
    public fun id(): Number

    public fun storageCapacityQuotaGiB(): Number

    public fun type(): String

    public interface Builder {
      public fun id(id: Number) {
      }

      public fun storageCapacityQuotaGiB(storageCapacityQuotaGiB: Number) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnVolume.UserAndGroupQuotasProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnVolume.UserAndGroupQuotasProperty.builder()

      public override fun id(id: Number) {
        cdkBuilder.id(id)
      }

      public override fun storageCapacityQuotaGiB(storageCapacityQuotaGiB: Number) {
        cdkBuilder.storageCapacityQuotaGiB(storageCapacityQuotaGiB)
      }

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.fsx.CfnVolume.UserAndGroupQuotasProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.fsx.CfnVolume.UserAndGroupQuotasProperty,
    ) : UserAndGroupQuotasProperty {
      public override fun id(): Number = unwrap(this).getId()

      public override fun storageCapacityQuotaGiB(): Number =
          unwrap(this).getStorageCapacityQuotaGiB()

      public override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): UserAndGroupQuotasProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnVolume.UserAndGroupQuotasProperty):
          UserAndGroupQuotasProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UserAndGroupQuotasProperty):
          software.amazon.awscdk.services.fsx.CfnVolume.UserAndGroupQuotasProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface OriginSnapshotProperty {
    public fun copyStrategy(): String

    public fun snapshotArn(): String

    public interface Builder {
      public fun copyStrategy(copyStrategy: String) {
      }

      public fun snapshotArn(snapshotArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnVolume.OriginSnapshotProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnVolume.OriginSnapshotProperty.builder()

      public override fun copyStrategy(copyStrategy: String) {
        cdkBuilder.copyStrategy(copyStrategy)
      }

      public override fun snapshotArn(snapshotArn: String) {
        cdkBuilder.snapshotArn(snapshotArn)
      }

      public fun build(): software.amazon.awscdk.services.fsx.CfnVolume.OriginSnapshotProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.fsx.CfnVolume.OriginSnapshotProperty,
    ) : OriginSnapshotProperty {
      public override fun copyStrategy(): String = unwrap(this).getCopyStrategy()

      public override fun snapshotArn(): String = unwrap(this).getSnapshotArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OriginSnapshotProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnVolume.OriginSnapshotProperty):
          OriginSnapshotProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OriginSnapshotProperty):
          software.amazon.awscdk.services.fsx.CfnVolume.OriginSnapshotProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RetentionPeriodProperty {
    public fun type(): String

    public fun `value`(): Number? = unwrap(this).getValue()

    public interface Builder {
      public fun type(type: String) {
      }

      public fun `value`(`value`: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnVolume.RetentionPeriodProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnVolume.RetentionPeriodProperty.builder()

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.fsx.CfnVolume.RetentionPeriodProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.fsx.CfnVolume.RetentionPeriodProperty,
    ) : RetentionPeriodProperty {
      public override fun type(): String = unwrap(this).getType()

      public override fun `value`(): Number? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RetentionPeriodProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnVolume.RetentionPeriodProperty):
          RetentionPeriodProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RetentionPeriodProperty):
          software.amazon.awscdk.services.fsx.CfnVolume.RetentionPeriodProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AutocommitPeriodProperty {
    public fun type(): String

    public fun `value`(): Number? = unwrap(this).getValue()

    public interface Builder {
      public fun type(type: String) {
      }

      public fun `value`(`value`: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnVolume.AutocommitPeriodProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnVolume.AutocommitPeriodProperty.builder()

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.fsx.CfnVolume.AutocommitPeriodProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.fsx.CfnVolume.AutocommitPeriodProperty,
    ) : AutocommitPeriodProperty {
      public override fun type(): String = unwrap(this).getType()

      public override fun `value`(): Number? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AutocommitPeriodProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnVolume.AutocommitPeriodProperty):
          AutocommitPeriodProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutocommitPeriodProperty):
          software.amazon.awscdk.services.fsx.CfnVolume.AutocommitPeriodProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface OpenZFSConfigurationProperty {
    public fun copyTagsToSnapshots(): Any? = unwrap(this).getCopyTagsToSnapshots()

    public fun dataCompressionType(): String? = unwrap(this).getDataCompressionType()

    public fun nfsExports(): Any? = unwrap(this).getNfsExports()

    public fun options(): List<String> = unwrap(this).getOptions() ?: emptyList()

    public fun originSnapshot(): Any? = unwrap(this).getOriginSnapshot()

    public fun parentVolumeId(): String

    public fun readOnly(): Any? = unwrap(this).getReadOnly()

    public fun recordSizeKiB(): Number? = unwrap(this).getRecordSizeKiB()

    public fun storageCapacityQuotaGiB(): Number? = unwrap(this).getStorageCapacityQuotaGiB()

    public fun storageCapacityReservationGiB(): Number? =
        unwrap(this).getStorageCapacityReservationGiB()

    public fun userAndGroupQuotas(): Any? = unwrap(this).getUserAndGroupQuotas()

    public interface Builder {
      public fun copyTagsToSnapshots(copyTagsToSnapshots: Boolean) {
      }

      public fun copyTagsToSnapshots(copyTagsToSnapshots: IResolvable) {
      }

      public fun dataCompressionType(dataCompressionType: String) {
      }

      public fun nfsExports(nfsExports: IResolvable) {
      }

      public fun nfsExports(nfsExports: List<Any>) {
      }

      public fun options(options: List<String>) {
      }

      public fun originSnapshot(originSnapshot: IResolvable) {
      }

      public fun originSnapshot(originSnapshot: OriginSnapshotProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bc249c4485e28a5183f8f7c874ed1490b18c693d1ab99d945c20696f0af2a6cf")
      public fun originSnapshot(originSnapshot: OriginSnapshotProperty.Builder.() -> Unit) {
      }

      public fun parentVolumeId(parentVolumeId: String) {
      }

      public fun readOnly(readOnly: Boolean) {
      }

      public fun readOnly(readOnly: IResolvable) {
      }

      public fun recordSizeKiB(recordSizeKiB: Number) {
      }

      public fun storageCapacityQuotaGiB(storageCapacityQuotaGiB: Number) {
      }

      public fun storageCapacityReservationGiB(storageCapacityReservationGiB: Number) {
      }

      public fun userAndGroupQuotas(userAndGroupQuotas: IResolvable) {
      }

      public fun userAndGroupQuotas(userAndGroupQuotas: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnVolume.OpenZFSConfigurationProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnVolume.OpenZFSConfigurationProperty.builder()

      public override fun copyTagsToSnapshots(copyTagsToSnapshots: Boolean) {
        cdkBuilder.copyTagsToSnapshots(copyTagsToSnapshots)
      }

      public override fun copyTagsToSnapshots(copyTagsToSnapshots: IResolvable) {
        cdkBuilder.copyTagsToSnapshots(copyTagsToSnapshots.let(IResolvable::unwrap))
      }

      public override fun dataCompressionType(dataCompressionType: String) {
        cdkBuilder.dataCompressionType(dataCompressionType)
      }

      public override fun nfsExports(nfsExports: IResolvable) {
        cdkBuilder.nfsExports(nfsExports.let(IResolvable::unwrap))
      }

      public override fun nfsExports(nfsExports: List<Any>) {
        cdkBuilder.nfsExports(nfsExports)
      }

      public override fun options(options: List<String>) {
        cdkBuilder.options(options)
      }

      public override fun originSnapshot(originSnapshot: IResolvable) {
        cdkBuilder.originSnapshot(originSnapshot.let(IResolvable::unwrap))
      }

      public override fun originSnapshot(originSnapshot: OriginSnapshotProperty) {
        cdkBuilder.originSnapshot(originSnapshot.let(OriginSnapshotProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bc249c4485e28a5183f8f7c874ed1490b18c693d1ab99d945c20696f0af2a6cf")
      public override fun originSnapshot(originSnapshot: OriginSnapshotProperty.Builder.() -> Unit):
          Unit = originSnapshot(OriginSnapshotProperty(originSnapshot))

      public override fun parentVolumeId(parentVolumeId: String) {
        cdkBuilder.parentVolumeId(parentVolumeId)
      }

      public override fun readOnly(readOnly: Boolean) {
        cdkBuilder.readOnly(readOnly)
      }

      public override fun readOnly(readOnly: IResolvable) {
        cdkBuilder.readOnly(readOnly.let(IResolvable::unwrap))
      }

      public override fun recordSizeKiB(recordSizeKiB: Number) {
        cdkBuilder.recordSizeKiB(recordSizeKiB)
      }

      public override fun storageCapacityQuotaGiB(storageCapacityQuotaGiB: Number) {
        cdkBuilder.storageCapacityQuotaGiB(storageCapacityQuotaGiB)
      }

      public override fun storageCapacityReservationGiB(storageCapacityReservationGiB: Number) {
        cdkBuilder.storageCapacityReservationGiB(storageCapacityReservationGiB)
      }

      public override fun userAndGroupQuotas(userAndGroupQuotas: IResolvable) {
        cdkBuilder.userAndGroupQuotas(userAndGroupQuotas.let(IResolvable::unwrap))
      }

      public override fun userAndGroupQuotas(userAndGroupQuotas: List<Any>) {
        cdkBuilder.userAndGroupQuotas(userAndGroupQuotas)
      }

      public fun build(): software.amazon.awscdk.services.fsx.CfnVolume.OpenZFSConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.fsx.CfnVolume.OpenZFSConfigurationProperty,
    ) : OpenZFSConfigurationProperty {
      public override fun copyTagsToSnapshots(): Any? = unwrap(this).getCopyTagsToSnapshots()

      public override fun dataCompressionType(): String? = unwrap(this).getDataCompressionType()

      public override fun nfsExports(): Any? = unwrap(this).getNfsExports()

      public override fun options(): List<String> = unwrap(this).getOptions() ?: emptyList()

      public override fun originSnapshot(): Any? = unwrap(this).getOriginSnapshot()

      public override fun parentVolumeId(): String = unwrap(this).getParentVolumeId()

      public override fun readOnly(): Any? = unwrap(this).getReadOnly()

      public override fun recordSizeKiB(): Number? = unwrap(this).getRecordSizeKiB()

      public override fun storageCapacityQuotaGiB(): Number? =
          unwrap(this).getStorageCapacityQuotaGiB()

      public override fun storageCapacityReservationGiB(): Number? =
          unwrap(this).getStorageCapacityReservationGiB()

      public override fun userAndGroupQuotas(): Any? = unwrap(this).getUserAndGroupQuotas()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OpenZFSConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnVolume.OpenZFSConfigurationProperty):
          OpenZFSConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OpenZFSConfigurationProperty):
          software.amazon.awscdk.services.fsx.CfnVolume.OpenZFSConfigurationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface OntapConfigurationProperty {
    public fun aggregateConfiguration(): Any? = unwrap(this).getAggregateConfiguration()

    public fun copyTagsToBackups(): String? = unwrap(this).getCopyTagsToBackups()

    public fun junctionPath(): String? = unwrap(this).getJunctionPath()

    public fun ontapVolumeType(): String? = unwrap(this).getOntapVolumeType()

    public fun securityStyle(): String? = unwrap(this).getSecurityStyle()

    public fun sizeInBytes(): String? = unwrap(this).getSizeInBytes()

    public fun sizeInMegabytes(): String? = unwrap(this).getSizeInMegabytes()

    public fun snaplockConfiguration(): Any? = unwrap(this).getSnaplockConfiguration()

    public fun snapshotPolicy(): String? = unwrap(this).getSnapshotPolicy()

    public fun storageEfficiencyEnabled(): String? = unwrap(this).getStorageEfficiencyEnabled()

    public fun storageVirtualMachineId(): String

    public fun tieringPolicy(): Any? = unwrap(this).getTieringPolicy()

    public fun volumeStyle(): String? = unwrap(this).getVolumeStyle()

    public interface Builder {
      public fun aggregateConfiguration(aggregateConfiguration: IResolvable) {
      }

      public fun aggregateConfiguration(aggregateConfiguration: AggregateConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f2e35038a05291bc7b5e4d4ec460e91bcc4c33e6d99c2933b960da4bc04e2f6")
      public
          fun aggregateConfiguration(aggregateConfiguration: AggregateConfigurationProperty.Builder.() -> Unit) {
      }

      public fun copyTagsToBackups(copyTagsToBackups: String) {
      }

      public fun junctionPath(junctionPath: String) {
      }

      public fun ontapVolumeType(ontapVolumeType: String) {
      }

      public fun securityStyle(securityStyle: String) {
      }

      public fun sizeInBytes(sizeInBytes: String) {
      }

      public fun sizeInMegabytes(sizeInMegabytes: String) {
      }

      public fun snaplockConfiguration(snaplockConfiguration: IResolvable) {
      }

      public fun snaplockConfiguration(snaplockConfiguration: SnaplockConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e3189155e937a8748ec9578b393ceaaed4b149b540561354d82e7753ee30c01e")
      public
          fun snaplockConfiguration(snaplockConfiguration: SnaplockConfigurationProperty.Builder.() -> Unit) {
      }

      public fun snapshotPolicy(snapshotPolicy: String) {
      }

      public fun storageEfficiencyEnabled(storageEfficiencyEnabled: String) {
      }

      public fun storageVirtualMachineId(storageVirtualMachineId: String) {
      }

      public fun tieringPolicy(tieringPolicy: IResolvable) {
      }

      public fun tieringPolicy(tieringPolicy: TieringPolicyProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("69ed72f068811bbd74787e358b6614189a2ac6deb0d6047f15850ec03a5458df")
      public fun tieringPolicy(tieringPolicy: TieringPolicyProperty.Builder.() -> Unit) {
      }

      public fun volumeStyle(volumeStyle: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnVolume.OntapConfigurationProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnVolume.OntapConfigurationProperty.builder()

      public override fun aggregateConfiguration(aggregateConfiguration: IResolvable) {
        cdkBuilder.aggregateConfiguration(aggregateConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun aggregateConfiguration(aggregateConfiguration: AggregateConfigurationProperty) {
        cdkBuilder.aggregateConfiguration(aggregateConfiguration.let(AggregateConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f2e35038a05291bc7b5e4d4ec460e91bcc4c33e6d99c2933b960da4bc04e2f6")
      public override
          fun aggregateConfiguration(aggregateConfiguration: AggregateConfigurationProperty.Builder.() -> Unit):
          Unit = aggregateConfiguration(AggregateConfigurationProperty(aggregateConfiguration))

      public override fun copyTagsToBackups(copyTagsToBackups: String) {
        cdkBuilder.copyTagsToBackups(copyTagsToBackups)
      }

      public override fun junctionPath(junctionPath: String) {
        cdkBuilder.junctionPath(junctionPath)
      }

      public override fun ontapVolumeType(ontapVolumeType: String) {
        cdkBuilder.ontapVolumeType(ontapVolumeType)
      }

      public override fun securityStyle(securityStyle: String) {
        cdkBuilder.securityStyle(securityStyle)
      }

      public override fun sizeInBytes(sizeInBytes: String) {
        cdkBuilder.sizeInBytes(sizeInBytes)
      }

      public override fun sizeInMegabytes(sizeInMegabytes: String) {
        cdkBuilder.sizeInMegabytes(sizeInMegabytes)
      }

      public override fun snaplockConfiguration(snaplockConfiguration: IResolvable) {
        cdkBuilder.snaplockConfiguration(snaplockConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun snaplockConfiguration(snaplockConfiguration: SnaplockConfigurationProperty) {
        cdkBuilder.snaplockConfiguration(snaplockConfiguration.let(SnaplockConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e3189155e937a8748ec9578b393ceaaed4b149b540561354d82e7753ee30c01e")
      public override
          fun snaplockConfiguration(snaplockConfiguration: SnaplockConfigurationProperty.Builder.() -> Unit):
          Unit = snaplockConfiguration(SnaplockConfigurationProperty(snaplockConfiguration))

      public override fun snapshotPolicy(snapshotPolicy: String) {
        cdkBuilder.snapshotPolicy(snapshotPolicy)
      }

      public override fun storageEfficiencyEnabled(storageEfficiencyEnabled: String) {
        cdkBuilder.storageEfficiencyEnabled(storageEfficiencyEnabled)
      }

      public override fun storageVirtualMachineId(storageVirtualMachineId: String) {
        cdkBuilder.storageVirtualMachineId(storageVirtualMachineId)
      }

      public override fun tieringPolicy(tieringPolicy: IResolvable) {
        cdkBuilder.tieringPolicy(tieringPolicy.let(IResolvable::unwrap))
      }

      public override fun tieringPolicy(tieringPolicy: TieringPolicyProperty) {
        cdkBuilder.tieringPolicy(tieringPolicy.let(TieringPolicyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("69ed72f068811bbd74787e358b6614189a2ac6deb0d6047f15850ec03a5458df")
      public override fun tieringPolicy(tieringPolicy: TieringPolicyProperty.Builder.() -> Unit):
          Unit = tieringPolicy(TieringPolicyProperty(tieringPolicy))

      public override fun volumeStyle(volumeStyle: String) {
        cdkBuilder.volumeStyle(volumeStyle)
      }

      public fun build(): software.amazon.awscdk.services.fsx.CfnVolume.OntapConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.fsx.CfnVolume.OntapConfigurationProperty,
    ) : OntapConfigurationProperty {
      public override fun aggregateConfiguration(): Any? = unwrap(this).getAggregateConfiguration()

      public override fun copyTagsToBackups(): String? = unwrap(this).getCopyTagsToBackups()

      public override fun junctionPath(): String? = unwrap(this).getJunctionPath()

      public override fun ontapVolumeType(): String? = unwrap(this).getOntapVolumeType()

      public override fun securityStyle(): String? = unwrap(this).getSecurityStyle()

      public override fun sizeInBytes(): String? = unwrap(this).getSizeInBytes()

      public override fun sizeInMegabytes(): String? = unwrap(this).getSizeInMegabytes()

      public override fun snaplockConfiguration(): Any? = unwrap(this).getSnaplockConfiguration()

      public override fun snapshotPolicy(): String? = unwrap(this).getSnapshotPolicy()

      public override fun storageEfficiencyEnabled(): String? =
          unwrap(this).getStorageEfficiencyEnabled()

      public override fun storageVirtualMachineId(): String =
          unwrap(this).getStorageVirtualMachineId()

      public override fun tieringPolicy(): Any? = unwrap(this).getTieringPolicy()

      public override fun volumeStyle(): String? = unwrap(this).getVolumeStyle()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OntapConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnVolume.OntapConfigurationProperty):
          OntapConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OntapConfigurationProperty):
          software.amazon.awscdk.services.fsx.CfnVolume.OntapConfigurationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SnaplockConfigurationProperty {
    public fun auditLogVolume(): String? = unwrap(this).getAuditLogVolume()

    public fun autocommitPeriod(): Any? = unwrap(this).getAutocommitPeriod()

    public fun privilegedDelete(): String? = unwrap(this).getPrivilegedDelete()

    public fun retentionPeriod(): Any? = unwrap(this).getRetentionPeriod()

    public fun snaplockType(): String

    public fun volumeAppendModeEnabled(): String? = unwrap(this).getVolumeAppendModeEnabled()

    public interface Builder {
      public fun auditLogVolume(auditLogVolume: String) {
      }

      public fun autocommitPeriod(autocommitPeriod: IResolvable) {
      }

      public fun autocommitPeriod(autocommitPeriod: AutocommitPeriodProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1e380838e3a987f21415dc3377aa4154059ef18cd09877176abab3b5032cbcad")
      public fun autocommitPeriod(autocommitPeriod: AutocommitPeriodProperty.Builder.() -> Unit) {
      }

      public fun privilegedDelete(privilegedDelete: String) {
      }

      public fun retentionPeriod(retentionPeriod: IResolvable) {
      }

      public fun retentionPeriod(retentionPeriod: SnaplockRetentionPeriodProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eba54555f91b81d0befa4f324b3d5717910c6b7c9781cec5d99e84ac38898911")
      public
          fun retentionPeriod(retentionPeriod: SnaplockRetentionPeriodProperty.Builder.() -> Unit) {
      }

      public fun snaplockType(snaplockType: String) {
      }

      public fun volumeAppendModeEnabled(volumeAppendModeEnabled: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnVolume.SnaplockConfigurationProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnVolume.SnaplockConfigurationProperty.builder()

      public override fun auditLogVolume(auditLogVolume: String) {
        cdkBuilder.auditLogVolume(auditLogVolume)
      }

      public override fun autocommitPeriod(autocommitPeriod: IResolvable) {
        cdkBuilder.autocommitPeriod(autocommitPeriod.let(IResolvable::unwrap))
      }

      public override fun autocommitPeriod(autocommitPeriod: AutocommitPeriodProperty) {
        cdkBuilder.autocommitPeriod(autocommitPeriod.let(AutocommitPeriodProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1e380838e3a987f21415dc3377aa4154059ef18cd09877176abab3b5032cbcad")
      public override
          fun autocommitPeriod(autocommitPeriod: AutocommitPeriodProperty.Builder.() -> Unit): Unit
          = autocommitPeriod(AutocommitPeriodProperty(autocommitPeriod))

      public override fun privilegedDelete(privilegedDelete: String) {
        cdkBuilder.privilegedDelete(privilegedDelete)
      }

      public override fun retentionPeriod(retentionPeriod: IResolvable) {
        cdkBuilder.retentionPeriod(retentionPeriod.let(IResolvable::unwrap))
      }

      public override fun retentionPeriod(retentionPeriod: SnaplockRetentionPeriodProperty) {
        cdkBuilder.retentionPeriod(retentionPeriod.let(SnaplockRetentionPeriodProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eba54555f91b81d0befa4f324b3d5717910c6b7c9781cec5d99e84ac38898911")
      public override
          fun retentionPeriod(retentionPeriod: SnaplockRetentionPeriodProperty.Builder.() -> Unit):
          Unit = retentionPeriod(SnaplockRetentionPeriodProperty(retentionPeriod))

      public override fun snaplockType(snaplockType: String) {
        cdkBuilder.snaplockType(snaplockType)
      }

      public override fun volumeAppendModeEnabled(volumeAppendModeEnabled: String) {
        cdkBuilder.volumeAppendModeEnabled(volumeAppendModeEnabled)
      }

      public fun build():
          software.amazon.awscdk.services.fsx.CfnVolume.SnaplockConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.fsx.CfnVolume.SnaplockConfigurationProperty,
    ) : SnaplockConfigurationProperty {
      public override fun auditLogVolume(): String? = unwrap(this).getAuditLogVolume()

      public override fun autocommitPeriod(): Any? = unwrap(this).getAutocommitPeriod()

      public override fun privilegedDelete(): String? = unwrap(this).getPrivilegedDelete()

      public override fun retentionPeriod(): Any? = unwrap(this).getRetentionPeriod()

      public override fun snaplockType(): String = unwrap(this).getSnaplockType()

      public override fun volumeAppendModeEnabled(): String? =
          unwrap(this).getVolumeAppendModeEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SnaplockConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnVolume.SnaplockConfigurationProperty):
          SnaplockConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SnaplockConfigurationProperty):
          software.amazon.awscdk.services.fsx.CfnVolume.SnaplockConfigurationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
