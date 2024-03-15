@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sam

import io.cloudshiftdev.awscdk.CfnResource
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
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSimpleTable internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.sam.CfnSimpleTable,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun primaryKey(): Any? = unwrap(this).getPrimaryKey()

  public open fun primaryKey(`value`: IResolvable) {
    unwrap(this).setPrimaryKey(`value`.let(IResolvable::unwrap))
  }

  public open fun primaryKey(`value`: PrimaryKeyProperty) {
    unwrap(this).setPrimaryKey(`value`.let(PrimaryKeyProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("eb68715cdfb9dab8fa19c369e0c702b827e601bd03a92664fba07c6a2848022f")
  public open fun primaryKey(`value`: PrimaryKeyProperty.Builder.() -> Unit): Unit =
      primaryKey(PrimaryKeyProperty(`value`))

  public open fun provisionedThroughput(): Any? = unwrap(this).getProvisionedThroughput()

  public open fun provisionedThroughput(`value`: IResolvable) {
    unwrap(this).setProvisionedThroughput(`value`.let(IResolvable::unwrap))
  }

  public open fun provisionedThroughput(`value`: ProvisionedThroughputProperty) {
    unwrap(this).setProvisionedThroughput(`value`.let(ProvisionedThroughputProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("043aa132c3d356bc7170b4e5904926d95e402968dfaa379b1748536e6a6e2dba")
  public open fun provisionedThroughput(`value`: ProvisionedThroughputProperty.Builder.() -> Unit):
      Unit = provisionedThroughput(ProvisionedThroughputProperty(`value`))

  public open fun sseSpecification(): Any? = unwrap(this).getSseSpecification()

  public open fun sseSpecification(`value`: IResolvable) {
    unwrap(this).setSseSpecification(`value`.let(IResolvable::unwrap))
  }

  public open fun sseSpecification(`value`: SSESpecificationProperty) {
    unwrap(this).setSseSpecification(`value`.let(SSESpecificationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("67673f532fb7b0a8a4bce9874c5f6ccc738292de92107c11c9c819f2553221f2")
  public open fun sseSpecification(`value`: SSESpecificationProperty.Builder.() -> Unit): Unit =
      sseSpecification(SSESpecificationProperty(`value`))

  public open fun tableName(): String? = unwrap(this).getTableName()

  public open fun tableName(`value`: String) {
    unwrap(this).setTableName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun primaryKey(primaryKey: IResolvable)

    public fun primaryKey(primaryKey: PrimaryKeyProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee6b7873d058d3bb454df3c71cf29aa37e1b1fbf3f3ef8ac229f5a6201aab6f8")
    public fun primaryKey(primaryKey: PrimaryKeyProperty.Builder.() -> Unit)

    public fun provisionedThroughput(provisionedThroughput: IResolvable)

    public fun provisionedThroughput(provisionedThroughput: ProvisionedThroughputProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("54030f74ed583ac27ecc9c42b817af6e83602f7d08765c2442e7f8ed70c92655")
    public
        fun provisionedThroughput(provisionedThroughput: ProvisionedThroughputProperty.Builder.() -> Unit)

    public fun sseSpecification(sseSpecification: IResolvable)

    public fun sseSpecification(sseSpecification: SSESpecificationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("308875bca1ffe1a060923c76d3b60424613be8c4c737a576c2dd8a68fcec16ee")
    public fun sseSpecification(sseSpecification: SSESpecificationProperty.Builder.() -> Unit)

    public fun tableName(tableName: String)

    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sam.CfnSimpleTable.Builder =
        software.amazon.awscdk.services.sam.CfnSimpleTable.Builder.create(scope, id)

    override fun primaryKey(primaryKey: IResolvable) {
      cdkBuilder.primaryKey(primaryKey.let(IResolvable::unwrap))
    }

    override fun primaryKey(primaryKey: PrimaryKeyProperty) {
      cdkBuilder.primaryKey(primaryKey.let(PrimaryKeyProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee6b7873d058d3bb454df3c71cf29aa37e1b1fbf3f3ef8ac229f5a6201aab6f8")
    override fun primaryKey(primaryKey: PrimaryKeyProperty.Builder.() -> Unit): Unit =
        primaryKey(PrimaryKeyProperty(primaryKey))

    override fun provisionedThroughput(provisionedThroughput: IResolvable) {
      cdkBuilder.provisionedThroughput(provisionedThroughput.let(IResolvable::unwrap))
    }

    override fun provisionedThroughput(provisionedThroughput: ProvisionedThroughputProperty) {
      cdkBuilder.provisionedThroughput(provisionedThroughput.let(ProvisionedThroughputProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("54030f74ed583ac27ecc9c42b817af6e83602f7d08765c2442e7f8ed70c92655")
    override
        fun provisionedThroughput(provisionedThroughput: ProvisionedThroughputProperty.Builder.() -> Unit):
        Unit = provisionedThroughput(ProvisionedThroughputProperty(provisionedThroughput))

    override fun sseSpecification(sseSpecification: IResolvable) {
      cdkBuilder.sseSpecification(sseSpecification.let(IResolvable::unwrap))
    }

    override fun sseSpecification(sseSpecification: SSESpecificationProperty) {
      cdkBuilder.sseSpecification(sseSpecification.let(SSESpecificationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("308875bca1ffe1a060923c76d3b60424613be8c4c737a576c2dd8a68fcec16ee")
    override fun sseSpecification(sseSpecification: SSESpecificationProperty.Builder.() -> Unit):
        Unit = sseSpecification(SSESpecificationProperty(sseSpecification))

    override fun tableName(tableName: String) {
      cdkBuilder.tableName(tableName)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.sam.CfnSimpleTable = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sam.CfnSimpleTable.CFN_RESOURCE_TYPE_NAME

    public val REQUIRED_TRANSFORM: String =
        software.amazon.awscdk.services.sam.CfnSimpleTable.REQUIRED_TRANSFORM

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSimpleTable {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSimpleTable(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnSimpleTable): CfnSimpleTable
        = CfnSimpleTable(cdkObject)

    internal fun unwrap(wrapped: CfnSimpleTable): software.amazon.awscdk.services.sam.CfnSimpleTable
        = wrapped.cdkObject
  }

  public interface ProvisionedThroughputProperty {
    public fun readCapacityUnits(): Number? = unwrap(this).getReadCapacityUnits()

    public fun writeCapacityUnits(): Number

    @CdkDslMarker
    public interface Builder {
      public fun readCapacityUnits(readCapacityUnits: Number)

      public fun writeCapacityUnits(writeCapacityUnits: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnSimpleTable.ProvisionedThroughputProperty.Builder =
          software.amazon.awscdk.services.sam.CfnSimpleTable.ProvisionedThroughputProperty.builder()

      override fun readCapacityUnits(readCapacityUnits: Number) {
        cdkBuilder.readCapacityUnits(readCapacityUnits)
      }

      override fun writeCapacityUnits(writeCapacityUnits: Number) {
        cdkBuilder.writeCapacityUnits(writeCapacityUnits)
      }

      public fun build():
          software.amazon.awscdk.services.sam.CfnSimpleTable.ProvisionedThroughputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnSimpleTable.ProvisionedThroughputProperty,
    ) : CdkObject(cdkObject), ProvisionedThroughputProperty {
      override fun readCapacityUnits(): Number? = unwrap(this).getReadCapacityUnits()

      override fun writeCapacityUnits(): Number = unwrap(this).getWriteCapacityUnits()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProvisionedThroughputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnSimpleTable.ProvisionedThroughputProperty):
          ProvisionedThroughputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProvisionedThroughputProperty):
          software.amazon.awscdk.services.sam.CfnSimpleTable.ProvisionedThroughputProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnSimpleTable.ProvisionedThroughputProperty
    }
  }

  public interface PrimaryKeyProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun type(): String

    @CdkDslMarker
    public interface Builder {
      public fun name(name: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnSimpleTable.PrimaryKeyProperty.Builder =
          software.amazon.awscdk.services.sam.CfnSimpleTable.PrimaryKeyProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnSimpleTable.PrimaryKeyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.sam.CfnSimpleTable.PrimaryKeyProperty,
    ) : CdkObject(cdkObject), PrimaryKeyProperty {
      override fun name(): String? = unwrap(this).getName()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PrimaryKeyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnSimpleTable.PrimaryKeyProperty):
          PrimaryKeyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrimaryKeyProperty):
          software.amazon.awscdk.services.sam.CfnSimpleTable.PrimaryKeyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnSimpleTable.PrimaryKeyProperty
    }
  }

  public interface SSESpecificationProperty {
    public fun sseEnabled(): Any? = unwrap(this).getSseEnabled()

    @CdkDslMarker
    public interface Builder {
      public fun sseEnabled(sseEnabled: Boolean)

      public fun sseEnabled(sseEnabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnSimpleTable.SSESpecificationProperty.Builder =
          software.amazon.awscdk.services.sam.CfnSimpleTable.SSESpecificationProperty.builder()

      override fun sseEnabled(sseEnabled: Boolean) {
        cdkBuilder.sseEnabled(sseEnabled)
      }

      override fun sseEnabled(sseEnabled: IResolvable) {
        cdkBuilder.sseEnabled(sseEnabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.sam.CfnSimpleTable.SSESpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnSimpleTable.SSESpecificationProperty,
    ) : CdkObject(cdkObject), SSESpecificationProperty {
      override fun sseEnabled(): Any? = unwrap(this).getSseEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SSESpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnSimpleTable.SSESpecificationProperty):
          SSESpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SSESpecificationProperty):
          software.amazon.awscdk.services.sam.CfnSimpleTable.SSESpecificationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnSimpleTable.SSESpecificationProperty
    }
  }
}
