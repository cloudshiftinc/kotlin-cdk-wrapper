package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDataQualityRuleset internal constructor(
  private val cdkObject: software.amazon.awscdk.services.glue.CfnDataQualityRuleset,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun clientToken(): String? = unwrap(this).getClientToken()

  public open fun clientToken(`value`: String) {
    unwrap(this).setClientToken(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun ruleset(): String? = unwrap(this).getRuleset()

  public open fun ruleset(`value`: String) {
    unwrap(this).setRuleset(`value`)
  }

  public open fun tags(): Any? = unwrap(this).getTags()

  public open fun tags(`value`: Any) {
    unwrap(this).setTags(`value`)
  }

  public open fun targetTable(): Any? = unwrap(this).getTargetTable()

  public open fun targetTable(`value`: IResolvable) {
    unwrap(this).setTargetTable(`value`.let(IResolvable::unwrap))
  }

  public open fun targetTable(`value`: DataQualityTargetTableProperty) {
    unwrap(this).setTargetTable(`value`.let(DataQualityTargetTableProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8e0af79cecc806cfa4653b571f3e17a5500c5e03ca84b4cb157cf31f941ec204")
  public open fun targetTable(`value`: DataQualityTargetTableProperty.Builder.() -> Unit): Unit =
      targetTable(DataQualityTargetTableProperty(`value`))

  public interface Builder {
    public fun clientToken(clientToken: String)

    public fun description(description: String)

    public fun name(name: String)

    public fun ruleset(ruleset: String)

    public fun tags(tags: Any)

    public fun targetTable(targetTable: IResolvable)

    public fun targetTable(targetTable: DataQualityTargetTableProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6d1c2f10db8f3a409fb5d22a6fb506a0411855f3941cbc59f934a4c87a94eb52")
    public fun targetTable(targetTable: DataQualityTargetTableProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnDataQualityRuleset.Builder =
        software.amazon.awscdk.services.glue.CfnDataQualityRuleset.Builder.create(scope, id)

    override fun clientToken(clientToken: String) {
      cdkBuilder.clientToken(clientToken)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun ruleset(ruleset: String) {
      cdkBuilder.ruleset(ruleset)
    }

    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    override fun targetTable(targetTable: IResolvable) {
      cdkBuilder.targetTable(targetTable.let(IResolvable::unwrap))
    }

    override fun targetTable(targetTable: DataQualityTargetTableProperty) {
      cdkBuilder.targetTable(targetTable.let(DataQualityTargetTableProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6d1c2f10db8f3a409fb5d22a6fb506a0411855f3941cbc59f934a4c87a94eb52")
    override fun targetTable(targetTable: DataQualityTargetTableProperty.Builder.() -> Unit): Unit =
        targetTable(DataQualityTargetTableProperty(targetTable))

    public fun build(): software.amazon.awscdk.services.glue.CfnDataQualityRuleset =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDataQualityRuleset {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDataQualityRuleset(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnDataQualityRuleset):
        CfnDataQualityRuleset = CfnDataQualityRuleset(cdkObject)

    internal fun unwrap(wrapped: CfnDataQualityRuleset):
        software.amazon.awscdk.services.glue.CfnDataQualityRuleset = wrapped.cdkObject
  }

  public interface DataQualityTargetTableProperty {
    public fun databaseName(): String? = unwrap(this).getDatabaseName()

    public fun tableName(): String? = unwrap(this).getTableName()

    public interface Builder {
      public fun databaseName(databaseName: String)

      public fun tableName(tableName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnDataQualityRuleset.DataQualityTargetTableProperty.Builder
          =
          software.amazon.awscdk.services.glue.CfnDataQualityRuleset.DataQualityTargetTableProperty.builder()

      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      public fun build():
          software.amazon.awscdk.services.glue.CfnDataQualityRuleset.DataQualityTargetTableProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.glue.CfnDataQualityRuleset.DataQualityTargetTableProperty,
    ) : DataQualityTargetTableProperty {
      override fun databaseName(): String? = unwrap(this).getDatabaseName()

      override fun tableName(): String? = unwrap(this).getTableName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DataQualityTargetTableProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnDataQualityRuleset.DataQualityTargetTableProperty):
          DataQualityTargetTableProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataQualityTargetTableProperty):
          software.amazon.awscdk.services.glue.CfnDataQualityRuleset.DataQualityTargetTableProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
