@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.fsx

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
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVolume internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.fsx.CfnVolume,
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

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5390a680a0692f0d9a74615accdc7d2da6fbfe41346a12b4edd06f8d33e4fafc")
  public open fun openZfsConfiguration(`value`: OpenZFSConfigurationProperty.Builder.() -> Unit):
      Unit = openZfsConfiguration(OpenZFSConfigurationProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun volumeType(): String? = unwrap(this).getVolumeType()

  public open fun volumeType(`value`: String) {
    unwrap(this).setVolumeType(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun backupId(backupId: String)

    public fun name(name: String)

    public fun ontapConfiguration(ontapConfiguration: IResolvable)

    public fun ontapConfiguration(ontapConfiguration: OntapConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c7f93abf2c6dc6b60e818d642b6856ed2dc86d28371c220edf14d5a0e2c2ae3c")
    public fun ontapConfiguration(ontapConfiguration: OntapConfigurationProperty.Builder.() -> Unit)

    public fun openZfsConfiguration(openZfsConfiguration: IResolvable)

    public fun openZfsConfiguration(openZfsConfiguration: OpenZFSConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2795760a67c25337c26bca613fb21662b3dbcf7eac28bab4097f7b05e9a12196")
    public
        fun openZfsConfiguration(openZfsConfiguration: OpenZFSConfigurationProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun volumeType(volumeType: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.fsx.CfnVolume.Builder =
        software.amazon.awscdk.services.fsx.CfnVolume.Builder.create(scope, id)

    override fun backupId(backupId: String) {
      cdkBuilder.backupId(backupId)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun ontapConfiguration(ontapConfiguration: IResolvable) {
      cdkBuilder.ontapConfiguration(ontapConfiguration.let(IResolvable::unwrap))
    }

    override fun ontapConfiguration(ontapConfiguration: OntapConfigurationProperty) {
      cdkBuilder.ontapConfiguration(ontapConfiguration.let(OntapConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c7f93abf2c6dc6b60e818d642b6856ed2dc86d28371c220edf14d5a0e2c2ae3c")
    override
        fun ontapConfiguration(ontapConfiguration: OntapConfigurationProperty.Builder.() -> Unit):
        Unit = ontapConfiguration(OntapConfigurationProperty(ontapConfiguration))

    override fun openZfsConfiguration(openZfsConfiguration: IResolvable) {
      cdkBuilder.openZfsConfiguration(openZfsConfiguration.let(IResolvable::unwrap))
    }

    override fun openZfsConfiguration(openZfsConfiguration: OpenZFSConfigurationProperty) {
      cdkBuilder.openZfsConfiguration(openZfsConfiguration.let(OpenZFSConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2795760a67c25337c26bca613fb21662b3dbcf7eac28bab4097f7b05e9a12196")
    override
        fun openZfsConfiguration(openZfsConfiguration: OpenZFSConfigurationProperty.Builder.() -> Unit):
        Unit = openZfsConfiguration(OpenZFSConfigurationProperty(openZfsConfiguration))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun volumeType(volumeType: String) {
      cdkBuilder.volumeType(volumeType)
    }

    public fun build(): software.amazon.awscdk.services.fsx.CfnVolume = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.fsx.CfnVolume.CFN_RESOURCE_TYPE_NAME

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

    @CdkDslMarker
    public interface Builder {
      public fun clientConfigurations(clientConfigurations: IResolvable)

      public fun clientConfigurations(clientConfigurations: List<Any>)

      public fun clientConfigurations(vararg clientConfigurations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnVolume.NfsExportsProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnVolume.NfsExportsProperty.builder()

      override fun clientConfigurations(clientConfigurations: IResolvable) {
        cdkBuilder.clientConfigurations(clientConfigurations.let(IResolvable::unwrap))
      }

      override fun clientConfigurations(clientConfigurations: List<Any>) {
        cdkBuilder.clientConfigurations(clientConfigurations)
      }

      override fun clientConfigurations(vararg clientConfigurations: Any): Unit =
          clientConfigurations(clientConfigurations.toList())

      public fun build(): software.amazon.awscdk.services.fsx.CfnVolume.NfsExportsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.fsx.CfnVolume.NfsExportsProperty,
    ) : CdkObject(cdkObject), NfsExportsProperty {
      override fun clientConfigurations(): Any = unwrap(this).getClientConfigurations()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NfsExportsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnVolume.NfsExportsProperty):
          NfsExportsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NfsExportsProperty):
          software.amazon.awscdk.services.fsx.CfnVolume.NfsExportsProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.fsx.CfnVolume.NfsExportsProperty
    }
  }

  public interface AggregateConfigurationProperty {
    public fun aggregates(): List<String> = unwrap(this).getAggregates() ?: emptyList()

    public fun constituentsPerAggregate(): Number? = unwrap(this).getConstituentsPerAggregate()

    @CdkDslMarker
    public interface Builder {
      public fun aggregates(aggregates: List<String>)

      public fun aggregates(vararg aggregates: String)

      public fun constituentsPerAggregate(constituentsPerAggregate: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnVolume.AggregateConfigurationProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnVolume.AggregateConfigurationProperty.builder()

      override fun aggregates(aggregates: List<String>) {
        cdkBuilder.aggregates(aggregates)
      }

      override fun aggregates(vararg aggregates: String): Unit = aggregates(aggregates.toList())

      override fun constituentsPerAggregate(constituentsPerAggregate: Number) {
        cdkBuilder.constituentsPerAggregate(constituentsPerAggregate)
      }

      public fun build():
          software.amazon.awscdk.services.fsx.CfnVolume.AggregateConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.fsx.CfnVolume.AggregateConfigurationProperty,
    ) : CdkObject(cdkObject), AggregateConfigurationProperty {
      override fun aggregates(): List<String> = unwrap(this).getAggregates() ?: emptyList()

      override fun constituentsPerAggregate(): Number? = unwrap(this).getConstituentsPerAggregate()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AggregateConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnVolume.AggregateConfigurationProperty):
          AggregateConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AggregateConfigurationProperty):
          software.amazon.awscdk.services.fsx.CfnVolume.AggregateConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.fsx.CfnVolume.AggregateConfigurationProperty
    }
  }

  public interface SnaplockRetentionPeriodProperty {
    public fun defaultRetention(): Any

    public fun maximumRetention(): Any

    public fun minimumRetention(): Any

    @CdkDslMarker
    public interface Builder {
      public fun defaultRetention(defaultRetention: IResolvable)

      public fun defaultRetention(defaultRetention: RetentionPeriodProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8a42a5037103ecf76c0a9f00ef8c2fe089b7914680cc04cda363796f099e8bd4")
      public fun defaultRetention(defaultRetention: RetentionPeriodProperty.Builder.() -> Unit)

      public fun maximumRetention(maximumRetention: IResolvable)

      public fun maximumRetention(maximumRetention: RetentionPeriodProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("70d68515ae4f0204070f094fd7932b69f8841870d439504d18b4c3e586ee30a3")
      public fun maximumRetention(maximumRetention: RetentionPeriodProperty.Builder.() -> Unit)

      public fun minimumRetention(minimumRetention: IResolvable)

      public fun minimumRetention(minimumRetention: RetentionPeriodProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b577d436edea2397c35c744ca0cfd12f57db380f6daeca18cf04497f22097758")
      public fun minimumRetention(minimumRetention: RetentionPeriodProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnVolume.SnaplockRetentionPeriodProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnVolume.SnaplockRetentionPeriodProperty.builder()

      override fun defaultRetention(defaultRetention: IResolvable) {
        cdkBuilder.defaultRetention(defaultRetention.let(IResolvable::unwrap))
      }

      override fun defaultRetention(defaultRetention: RetentionPeriodProperty) {
        cdkBuilder.defaultRetention(defaultRetention.let(RetentionPeriodProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8a42a5037103ecf76c0a9f00ef8c2fe089b7914680cc04cda363796f099e8bd4")
      override fun defaultRetention(defaultRetention: RetentionPeriodProperty.Builder.() -> Unit):
          Unit = defaultRetention(RetentionPeriodProperty(defaultRetention))

      override fun maximumRetention(maximumRetention: IResolvable) {
        cdkBuilder.maximumRetention(maximumRetention.let(IResolvable::unwrap))
      }

      override fun maximumRetention(maximumRetention: RetentionPeriodProperty) {
        cdkBuilder.maximumRetention(maximumRetention.let(RetentionPeriodProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("70d68515ae4f0204070f094fd7932b69f8841870d439504d18b4c3e586ee30a3")
      override fun maximumRetention(maximumRetention: RetentionPeriodProperty.Builder.() -> Unit):
          Unit = maximumRetention(RetentionPeriodProperty(maximumRetention))

      override fun minimumRetention(minimumRetention: IResolvable) {
        cdkBuilder.minimumRetention(minimumRetention.let(IResolvable::unwrap))
      }

      override fun minimumRetention(minimumRetention: RetentionPeriodProperty) {
        cdkBuilder.minimumRetention(minimumRetention.let(RetentionPeriodProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b577d436edea2397c35c744ca0cfd12f57db380f6daeca18cf04497f22097758")
      override fun minimumRetention(minimumRetention: RetentionPeriodProperty.Builder.() -> Unit):
          Unit = minimumRetention(RetentionPeriodProperty(minimumRetention))

      public fun build():
          software.amazon.awscdk.services.fsx.CfnVolume.SnaplockRetentionPeriodProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.fsx.CfnVolume.SnaplockRetentionPeriodProperty,
    ) : CdkObject(cdkObject), SnaplockRetentionPeriodProperty {
      override fun defaultRetention(): Any = unwrap(this).getDefaultRetention()

      override fun maximumRetention(): Any = unwrap(this).getMaximumRetention()

      override fun minimumRetention(): Any = unwrap(this).getMinimumRetention()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SnaplockRetentionPeriodProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnVolume.SnaplockRetentionPeriodProperty):
          SnaplockRetentionPeriodProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SnaplockRetentionPeriodProperty):
          software.amazon.awscdk.services.fsx.CfnVolume.SnaplockRetentionPeriodProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.fsx.CfnVolume.SnaplockRetentionPeriodProperty
    }
  }

  public interface TieringPolicyProperty {
    public fun coolingPeriod(): Number? = unwrap(this).getCoolingPeriod()

    public fun name(): String? = unwrap(this).getName()

    @CdkDslMarker
    public interface Builder {
      public fun coolingPeriod(coolingPeriod: Number)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnVolume.TieringPolicyProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnVolume.TieringPolicyProperty.builder()

      override fun coolingPeriod(coolingPeriod: Number) {
        cdkBuilder.coolingPeriod(coolingPeriod)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.fsx.CfnVolume.TieringPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.fsx.CfnVolume.TieringPolicyProperty,
    ) : CdkObject(cdkObject), TieringPolicyProperty {
      override fun coolingPeriod(): Number? = unwrap(this).getCoolingPeriod()

      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TieringPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnVolume.TieringPolicyProperty):
          TieringPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TieringPolicyProperty):
          software.amazon.awscdk.services.fsx.CfnVolume.TieringPolicyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.fsx.CfnVolume.TieringPolicyProperty
    }
  }

  public interface ClientConfigurationsProperty {
    public fun clients(): String

    public fun options(): List<String>

    @CdkDslMarker
    public interface Builder {
      public fun clients(clients: String)

      public fun options(options: List<String>)

      public fun options(vararg options: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnVolume.ClientConfigurationsProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnVolume.ClientConfigurationsProperty.builder()

      override fun clients(clients: String) {
        cdkBuilder.clients(clients)
      }

      override fun options(options: List<String>) {
        cdkBuilder.options(options)
      }

      override fun options(vararg options: String): Unit = options(options.toList())

      public fun build(): software.amazon.awscdk.services.fsx.CfnVolume.ClientConfigurationsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.fsx.CfnVolume.ClientConfigurationsProperty,
    ) : CdkObject(cdkObject), ClientConfigurationsProperty {
      override fun clients(): String = unwrap(this).getClients()

      override fun options(): List<String> = unwrap(this).getOptions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ClientConfigurationsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnVolume.ClientConfigurationsProperty):
          ClientConfigurationsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClientConfigurationsProperty):
          software.amazon.awscdk.services.fsx.CfnVolume.ClientConfigurationsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.fsx.CfnVolume.ClientConfigurationsProperty
    }
  }

  public interface UserAndGroupQuotasProperty {
    public fun id(): Number

    public fun storageCapacityQuotaGiB(): Number

    public fun type(): String

    @CdkDslMarker
    public interface Builder {
      public fun id(id: Number)

      public fun storageCapacityQuotaGiB(storageCapacityQuotaGiB: Number)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnVolume.UserAndGroupQuotasProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnVolume.UserAndGroupQuotasProperty.builder()

      override fun id(id: Number) {
        cdkBuilder.id(id)
      }

      override fun storageCapacityQuotaGiB(storageCapacityQuotaGiB: Number) {
        cdkBuilder.storageCapacityQuotaGiB(storageCapacityQuotaGiB)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.fsx.CfnVolume.UserAndGroupQuotasProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.fsx.CfnVolume.UserAndGroupQuotasProperty,
    ) : CdkObject(cdkObject), UserAndGroupQuotasProperty {
      override fun id(): Number = unwrap(this).getId()

      override fun storageCapacityQuotaGiB(): Number = unwrap(this).getStorageCapacityQuotaGiB()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): UserAndGroupQuotasProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnVolume.UserAndGroupQuotasProperty):
          UserAndGroupQuotasProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UserAndGroupQuotasProperty):
          software.amazon.awscdk.services.fsx.CfnVolume.UserAndGroupQuotasProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.fsx.CfnVolume.UserAndGroupQuotasProperty
    }
  }

  public interface OriginSnapshotProperty {
    public fun copyStrategy(): String

    public fun snapshotArn(): String

    @CdkDslMarker
    public interface Builder {
      public fun copyStrategy(copyStrategy: String)

      public fun snapshotArn(snapshotArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnVolume.OriginSnapshotProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnVolume.OriginSnapshotProperty.builder()

      override fun copyStrategy(copyStrategy: String) {
        cdkBuilder.copyStrategy(copyStrategy)
      }

      override fun snapshotArn(snapshotArn: String) {
        cdkBuilder.snapshotArn(snapshotArn)
      }

      public fun build(): software.amazon.awscdk.services.fsx.CfnVolume.OriginSnapshotProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.fsx.CfnVolume.OriginSnapshotProperty,
    ) : CdkObject(cdkObject), OriginSnapshotProperty {
      override fun copyStrategy(): String = unwrap(this).getCopyStrategy()

      override fun snapshotArn(): String = unwrap(this).getSnapshotArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OriginSnapshotProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnVolume.OriginSnapshotProperty):
          OriginSnapshotProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OriginSnapshotProperty):
          software.amazon.awscdk.services.fsx.CfnVolume.OriginSnapshotProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.fsx.CfnVolume.OriginSnapshotProperty
    }
  }

  public interface RetentionPeriodProperty {
    public fun type(): String

    public fun `value`(): Number? = unwrap(this).getValue()

    @CdkDslMarker
    public interface Builder {
      public fun type(type: String)

      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnVolume.RetentionPeriodProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnVolume.RetentionPeriodProperty.builder()

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.fsx.CfnVolume.RetentionPeriodProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.fsx.CfnVolume.RetentionPeriodProperty,
    ) : CdkObject(cdkObject), RetentionPeriodProperty {
      override fun type(): String = unwrap(this).getType()

      override fun `value`(): Number? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RetentionPeriodProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnVolume.RetentionPeriodProperty):
          RetentionPeriodProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RetentionPeriodProperty):
          software.amazon.awscdk.services.fsx.CfnVolume.RetentionPeriodProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.fsx.CfnVolume.RetentionPeriodProperty
    }
  }

  public interface AutocommitPeriodProperty {
    public fun type(): String

    public fun `value`(): Number? = unwrap(this).getValue()

    @CdkDslMarker
    public interface Builder {
      public fun type(type: String)

      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnVolume.AutocommitPeriodProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnVolume.AutocommitPeriodProperty.builder()

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.fsx.CfnVolume.AutocommitPeriodProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.fsx.CfnVolume.AutocommitPeriodProperty,
    ) : CdkObject(cdkObject), AutocommitPeriodProperty {
      override fun type(): String = unwrap(this).getType()

      override fun `value`(): Number? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AutocommitPeriodProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnVolume.AutocommitPeriodProperty):
          AutocommitPeriodProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutocommitPeriodProperty):
          software.amazon.awscdk.services.fsx.CfnVolume.AutocommitPeriodProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.fsx.CfnVolume.AutocommitPeriodProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun copyTagsToSnapshots(copyTagsToSnapshots: Boolean)

      public fun copyTagsToSnapshots(copyTagsToSnapshots: IResolvable)

      public fun dataCompressionType(dataCompressionType: String)

      public fun nfsExports(nfsExports: IResolvable)

      public fun nfsExports(nfsExports: List<Any>)

      public fun nfsExports(vararg nfsExports: Any)

      public fun options(options: List<String>)

      public fun options(vararg options: String)

      public fun originSnapshot(originSnapshot: IResolvable)

      public fun originSnapshot(originSnapshot: OriginSnapshotProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bc249c4485e28a5183f8f7c874ed1490b18c693d1ab99d945c20696f0af2a6cf")
      public fun originSnapshot(originSnapshot: OriginSnapshotProperty.Builder.() -> Unit)

      public fun parentVolumeId(parentVolumeId: String)

      public fun readOnly(readOnly: Boolean)

      public fun readOnly(readOnly: IResolvable)

      public fun recordSizeKiB(recordSizeKiB: Number)

      public fun storageCapacityQuotaGiB(storageCapacityQuotaGiB: Number)

      public fun storageCapacityReservationGiB(storageCapacityReservationGiB: Number)

      public fun userAndGroupQuotas(userAndGroupQuotas: IResolvable)

      public fun userAndGroupQuotas(userAndGroupQuotas: List<Any>)

      public fun userAndGroupQuotas(vararg userAndGroupQuotas: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnVolume.OpenZFSConfigurationProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnVolume.OpenZFSConfigurationProperty.builder()

      override fun copyTagsToSnapshots(copyTagsToSnapshots: Boolean) {
        cdkBuilder.copyTagsToSnapshots(copyTagsToSnapshots)
      }

      override fun copyTagsToSnapshots(copyTagsToSnapshots: IResolvable) {
        cdkBuilder.copyTagsToSnapshots(copyTagsToSnapshots.let(IResolvable::unwrap))
      }

      override fun dataCompressionType(dataCompressionType: String) {
        cdkBuilder.dataCompressionType(dataCompressionType)
      }

      override fun nfsExports(nfsExports: IResolvable) {
        cdkBuilder.nfsExports(nfsExports.let(IResolvable::unwrap))
      }

      override fun nfsExports(nfsExports: List<Any>) {
        cdkBuilder.nfsExports(nfsExports)
      }

      override fun nfsExports(vararg nfsExports: Any): Unit = nfsExports(nfsExports.toList())

      override fun options(options: List<String>) {
        cdkBuilder.options(options)
      }

      override fun options(vararg options: String): Unit = options(options.toList())

      override fun originSnapshot(originSnapshot: IResolvable) {
        cdkBuilder.originSnapshot(originSnapshot.let(IResolvable::unwrap))
      }

      override fun originSnapshot(originSnapshot: OriginSnapshotProperty) {
        cdkBuilder.originSnapshot(originSnapshot.let(OriginSnapshotProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bc249c4485e28a5183f8f7c874ed1490b18c693d1ab99d945c20696f0af2a6cf")
      override fun originSnapshot(originSnapshot: OriginSnapshotProperty.Builder.() -> Unit): Unit =
          originSnapshot(OriginSnapshotProperty(originSnapshot))

      override fun parentVolumeId(parentVolumeId: String) {
        cdkBuilder.parentVolumeId(parentVolumeId)
      }

      override fun readOnly(readOnly: Boolean) {
        cdkBuilder.readOnly(readOnly)
      }

      override fun readOnly(readOnly: IResolvable) {
        cdkBuilder.readOnly(readOnly.let(IResolvable::unwrap))
      }

      override fun recordSizeKiB(recordSizeKiB: Number) {
        cdkBuilder.recordSizeKiB(recordSizeKiB)
      }

      override fun storageCapacityQuotaGiB(storageCapacityQuotaGiB: Number) {
        cdkBuilder.storageCapacityQuotaGiB(storageCapacityQuotaGiB)
      }

      override fun storageCapacityReservationGiB(storageCapacityReservationGiB: Number) {
        cdkBuilder.storageCapacityReservationGiB(storageCapacityReservationGiB)
      }

      override fun userAndGroupQuotas(userAndGroupQuotas: IResolvable) {
        cdkBuilder.userAndGroupQuotas(userAndGroupQuotas.let(IResolvable::unwrap))
      }

      override fun userAndGroupQuotas(userAndGroupQuotas: List<Any>) {
        cdkBuilder.userAndGroupQuotas(userAndGroupQuotas)
      }

      override fun userAndGroupQuotas(vararg userAndGroupQuotas: Any): Unit =
          userAndGroupQuotas(userAndGroupQuotas.toList())

      public fun build(): software.amazon.awscdk.services.fsx.CfnVolume.OpenZFSConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.fsx.CfnVolume.OpenZFSConfigurationProperty,
    ) : CdkObject(cdkObject), OpenZFSConfigurationProperty {
      override fun copyTagsToSnapshots(): Any? = unwrap(this).getCopyTagsToSnapshots()

      override fun dataCompressionType(): String? = unwrap(this).getDataCompressionType()

      override fun nfsExports(): Any? = unwrap(this).getNfsExports()

      override fun options(): List<String> = unwrap(this).getOptions() ?: emptyList()

      override fun originSnapshot(): Any? = unwrap(this).getOriginSnapshot()

      override fun parentVolumeId(): String = unwrap(this).getParentVolumeId()

      override fun readOnly(): Any? = unwrap(this).getReadOnly()

      override fun recordSizeKiB(): Number? = unwrap(this).getRecordSizeKiB()

      override fun storageCapacityQuotaGiB(): Number? = unwrap(this).getStorageCapacityQuotaGiB()

      override fun storageCapacityReservationGiB(): Number? =
          unwrap(this).getStorageCapacityReservationGiB()

      override fun userAndGroupQuotas(): Any? = unwrap(this).getUserAndGroupQuotas()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OpenZFSConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnVolume.OpenZFSConfigurationProperty):
          OpenZFSConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OpenZFSConfigurationProperty):
          software.amazon.awscdk.services.fsx.CfnVolume.OpenZFSConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.fsx.CfnVolume.OpenZFSConfigurationProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun aggregateConfiguration(aggregateConfiguration: IResolvable)

      public fun aggregateConfiguration(aggregateConfiguration: AggregateConfigurationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f2e35038a05291bc7b5e4d4ec460e91bcc4c33e6d99c2933b960da4bc04e2f6")
      public
          fun aggregateConfiguration(aggregateConfiguration: AggregateConfigurationProperty.Builder.() -> Unit)

      public fun copyTagsToBackups(copyTagsToBackups: String)

      public fun junctionPath(junctionPath: String)

      public fun ontapVolumeType(ontapVolumeType: String)

      public fun securityStyle(securityStyle: String)

      public fun sizeInBytes(sizeInBytes: String)

      public fun sizeInMegabytes(sizeInMegabytes: String)

      public fun snaplockConfiguration(snaplockConfiguration: IResolvable)

      public fun snaplockConfiguration(snaplockConfiguration: SnaplockConfigurationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e3189155e937a8748ec9578b393ceaaed4b149b540561354d82e7753ee30c01e")
      public
          fun snaplockConfiguration(snaplockConfiguration: SnaplockConfigurationProperty.Builder.() -> Unit)

      public fun snapshotPolicy(snapshotPolicy: String)

      public fun storageEfficiencyEnabled(storageEfficiencyEnabled: String)

      public fun storageVirtualMachineId(storageVirtualMachineId: String)

      public fun tieringPolicy(tieringPolicy: IResolvable)

      public fun tieringPolicy(tieringPolicy: TieringPolicyProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("69ed72f068811bbd74787e358b6614189a2ac6deb0d6047f15850ec03a5458df")
      public fun tieringPolicy(tieringPolicy: TieringPolicyProperty.Builder.() -> Unit)

      public fun volumeStyle(volumeStyle: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnVolume.OntapConfigurationProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnVolume.OntapConfigurationProperty.builder()

      override fun aggregateConfiguration(aggregateConfiguration: IResolvable) {
        cdkBuilder.aggregateConfiguration(aggregateConfiguration.let(IResolvable::unwrap))
      }

      override fun aggregateConfiguration(aggregateConfiguration: AggregateConfigurationProperty) {
        cdkBuilder.aggregateConfiguration(aggregateConfiguration.let(AggregateConfigurationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f2e35038a05291bc7b5e4d4ec460e91bcc4c33e6d99c2933b960da4bc04e2f6")
      override
          fun aggregateConfiguration(aggregateConfiguration: AggregateConfigurationProperty.Builder.() -> Unit):
          Unit = aggregateConfiguration(AggregateConfigurationProperty(aggregateConfiguration))

      override fun copyTagsToBackups(copyTagsToBackups: String) {
        cdkBuilder.copyTagsToBackups(copyTagsToBackups)
      }

      override fun junctionPath(junctionPath: String) {
        cdkBuilder.junctionPath(junctionPath)
      }

      override fun ontapVolumeType(ontapVolumeType: String) {
        cdkBuilder.ontapVolumeType(ontapVolumeType)
      }

      override fun securityStyle(securityStyle: String) {
        cdkBuilder.securityStyle(securityStyle)
      }

      override fun sizeInBytes(sizeInBytes: String) {
        cdkBuilder.sizeInBytes(sizeInBytes)
      }

      override fun sizeInMegabytes(sizeInMegabytes: String) {
        cdkBuilder.sizeInMegabytes(sizeInMegabytes)
      }

      override fun snaplockConfiguration(snaplockConfiguration: IResolvable) {
        cdkBuilder.snaplockConfiguration(snaplockConfiguration.let(IResolvable::unwrap))
      }

      override fun snaplockConfiguration(snaplockConfiguration: SnaplockConfigurationProperty) {
        cdkBuilder.snaplockConfiguration(snaplockConfiguration.let(SnaplockConfigurationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e3189155e937a8748ec9578b393ceaaed4b149b540561354d82e7753ee30c01e")
      override
          fun snaplockConfiguration(snaplockConfiguration: SnaplockConfigurationProperty.Builder.() -> Unit):
          Unit = snaplockConfiguration(SnaplockConfigurationProperty(snaplockConfiguration))

      override fun snapshotPolicy(snapshotPolicy: String) {
        cdkBuilder.snapshotPolicy(snapshotPolicy)
      }

      override fun storageEfficiencyEnabled(storageEfficiencyEnabled: String) {
        cdkBuilder.storageEfficiencyEnabled(storageEfficiencyEnabled)
      }

      override fun storageVirtualMachineId(storageVirtualMachineId: String) {
        cdkBuilder.storageVirtualMachineId(storageVirtualMachineId)
      }

      override fun tieringPolicy(tieringPolicy: IResolvable) {
        cdkBuilder.tieringPolicy(tieringPolicy.let(IResolvable::unwrap))
      }

      override fun tieringPolicy(tieringPolicy: TieringPolicyProperty) {
        cdkBuilder.tieringPolicy(tieringPolicy.let(TieringPolicyProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("69ed72f068811bbd74787e358b6614189a2ac6deb0d6047f15850ec03a5458df")
      override fun tieringPolicy(tieringPolicy: TieringPolicyProperty.Builder.() -> Unit): Unit =
          tieringPolicy(TieringPolicyProperty(tieringPolicy))

      override fun volumeStyle(volumeStyle: String) {
        cdkBuilder.volumeStyle(volumeStyle)
      }

      public fun build(): software.amazon.awscdk.services.fsx.CfnVolume.OntapConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.fsx.CfnVolume.OntapConfigurationProperty,
    ) : CdkObject(cdkObject), OntapConfigurationProperty {
      override fun aggregateConfiguration(): Any? = unwrap(this).getAggregateConfiguration()

      override fun copyTagsToBackups(): String? = unwrap(this).getCopyTagsToBackups()

      override fun junctionPath(): String? = unwrap(this).getJunctionPath()

      override fun ontapVolumeType(): String? = unwrap(this).getOntapVolumeType()

      override fun securityStyle(): String? = unwrap(this).getSecurityStyle()

      override fun sizeInBytes(): String? = unwrap(this).getSizeInBytes()

      override fun sizeInMegabytes(): String? = unwrap(this).getSizeInMegabytes()

      override fun snaplockConfiguration(): Any? = unwrap(this).getSnaplockConfiguration()

      override fun snapshotPolicy(): String? = unwrap(this).getSnapshotPolicy()

      override fun storageEfficiencyEnabled(): String? = unwrap(this).getStorageEfficiencyEnabled()

      override fun storageVirtualMachineId(): String = unwrap(this).getStorageVirtualMachineId()

      override fun tieringPolicy(): Any? = unwrap(this).getTieringPolicy()

      override fun volumeStyle(): String? = unwrap(this).getVolumeStyle()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OntapConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnVolume.OntapConfigurationProperty):
          OntapConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OntapConfigurationProperty):
          software.amazon.awscdk.services.fsx.CfnVolume.OntapConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.fsx.CfnVolume.OntapConfigurationProperty
    }
  }

  public interface SnaplockConfigurationProperty {
    public fun auditLogVolume(): String? = unwrap(this).getAuditLogVolume()

    public fun autocommitPeriod(): Any? = unwrap(this).getAutocommitPeriod()

    public fun privilegedDelete(): String? = unwrap(this).getPrivilegedDelete()

    public fun retentionPeriod(): Any? = unwrap(this).getRetentionPeriod()

    public fun snaplockType(): String

    public fun volumeAppendModeEnabled(): String? = unwrap(this).getVolumeAppendModeEnabled()

    @CdkDslMarker
    public interface Builder {
      public fun auditLogVolume(auditLogVolume: String)

      public fun autocommitPeriod(autocommitPeriod: IResolvable)

      public fun autocommitPeriod(autocommitPeriod: AutocommitPeriodProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1e380838e3a987f21415dc3377aa4154059ef18cd09877176abab3b5032cbcad")
      public fun autocommitPeriod(autocommitPeriod: AutocommitPeriodProperty.Builder.() -> Unit)

      public fun privilegedDelete(privilegedDelete: String)

      public fun retentionPeriod(retentionPeriod: IResolvable)

      public fun retentionPeriod(retentionPeriod: SnaplockRetentionPeriodProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eba54555f91b81d0befa4f324b3d5717910c6b7c9781cec5d99e84ac38898911")
      public
          fun retentionPeriod(retentionPeriod: SnaplockRetentionPeriodProperty.Builder.() -> Unit)

      public fun snaplockType(snaplockType: String)

      public fun volumeAppendModeEnabled(volumeAppendModeEnabled: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnVolume.SnaplockConfigurationProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnVolume.SnaplockConfigurationProperty.builder()

      override fun auditLogVolume(auditLogVolume: String) {
        cdkBuilder.auditLogVolume(auditLogVolume)
      }

      override fun autocommitPeriod(autocommitPeriod: IResolvable) {
        cdkBuilder.autocommitPeriod(autocommitPeriod.let(IResolvable::unwrap))
      }

      override fun autocommitPeriod(autocommitPeriod: AutocommitPeriodProperty) {
        cdkBuilder.autocommitPeriod(autocommitPeriod.let(AutocommitPeriodProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1e380838e3a987f21415dc3377aa4154059ef18cd09877176abab3b5032cbcad")
      override fun autocommitPeriod(autocommitPeriod: AutocommitPeriodProperty.Builder.() -> Unit):
          Unit = autocommitPeriod(AutocommitPeriodProperty(autocommitPeriod))

      override fun privilegedDelete(privilegedDelete: String) {
        cdkBuilder.privilegedDelete(privilegedDelete)
      }

      override fun retentionPeriod(retentionPeriod: IResolvable) {
        cdkBuilder.retentionPeriod(retentionPeriod.let(IResolvable::unwrap))
      }

      override fun retentionPeriod(retentionPeriod: SnaplockRetentionPeriodProperty) {
        cdkBuilder.retentionPeriod(retentionPeriod.let(SnaplockRetentionPeriodProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eba54555f91b81d0befa4f324b3d5717910c6b7c9781cec5d99e84ac38898911")
      override
          fun retentionPeriod(retentionPeriod: SnaplockRetentionPeriodProperty.Builder.() -> Unit):
          Unit = retentionPeriod(SnaplockRetentionPeriodProperty(retentionPeriod))

      override fun snaplockType(snaplockType: String) {
        cdkBuilder.snaplockType(snaplockType)
      }

      override fun volumeAppendModeEnabled(volumeAppendModeEnabled: String) {
        cdkBuilder.volumeAppendModeEnabled(volumeAppendModeEnabled)
      }

      public fun build():
          software.amazon.awscdk.services.fsx.CfnVolume.SnaplockConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.fsx.CfnVolume.SnaplockConfigurationProperty,
    ) : CdkObject(cdkObject), SnaplockConfigurationProperty {
      override fun auditLogVolume(): String? = unwrap(this).getAuditLogVolume()

      override fun autocommitPeriod(): Any? = unwrap(this).getAutocommitPeriod()

      override fun privilegedDelete(): String? = unwrap(this).getPrivilegedDelete()

      override fun retentionPeriod(): Any? = unwrap(this).getRetentionPeriod()

      override fun snaplockType(): String = unwrap(this).getSnaplockType()

      override fun volumeAppendModeEnabled(): String? = unwrap(this).getVolumeAppendModeEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SnaplockConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnVolume.SnaplockConfigurationProperty):
          SnaplockConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SnaplockConfigurationProperty):
          software.amazon.awscdk.services.fsx.CfnVolume.SnaplockConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.fsx.CfnVolume.SnaplockConfigurationProperty
    }
  }
}
