@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cleanrooms

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnConfiguredTableProps {
  public fun allowedColumns(): List<String>

  public fun analysisMethod(): String

  public fun analysisRules(): Any? = unwrap(this).getAnalysisRules()

  public fun description(): String? = unwrap(this).getDescription()

  public fun name(): String

  public fun tableReference(): Any

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun allowedColumns(allowedColumns: List<String>)

    public fun allowedColumns(vararg allowedColumns: String)

    public fun analysisMethod(analysisMethod: String)

    public fun analysisRules(analysisRules: IResolvable)

    public fun analysisRules(analysisRules: List<Any>)

    public fun analysisRules(vararg analysisRules: Any)

    public fun description(description: String)

    public fun name(name: String)

    public fun tableReference(tableReference: IResolvable)

    public fun tableReference(tableReference: CfnConfiguredTable.TableReferenceProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ca098f05bb8739c47921256f2d37eebf1e64173c1e52eae729362962f3adab74")
    public
        fun tableReference(tableReference: CfnConfiguredTable.TableReferenceProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableProps.Builder =
        software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableProps.builder()

    override fun allowedColumns(allowedColumns: List<String>) {
      cdkBuilder.allowedColumns(allowedColumns)
    }

    override fun allowedColumns(vararg allowedColumns: String): Unit =
        allowedColumns(allowedColumns.toList())

    override fun analysisMethod(analysisMethod: String) {
      cdkBuilder.analysisMethod(analysisMethod)
    }

    override fun analysisRules(analysisRules: IResolvable) {
      cdkBuilder.analysisRules(analysisRules.let(IResolvable::unwrap))
    }

    override fun analysisRules(analysisRules: List<Any>) {
      cdkBuilder.analysisRules(analysisRules)
    }

    override fun analysisRules(vararg analysisRules: Any): Unit =
        analysisRules(analysisRules.toList())

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tableReference(tableReference: IResolvable) {
      cdkBuilder.tableReference(tableReference.let(IResolvable::unwrap))
    }

    override fun tableReference(tableReference: CfnConfiguredTable.TableReferenceProperty) {
      cdkBuilder.tableReference(tableReference.let(CfnConfiguredTable.TableReferenceProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ca098f05bb8739c47921256f2d37eebf1e64173c1e52eae729362962f3adab74")
    override
        fun tableReference(tableReference: CfnConfiguredTable.TableReferenceProperty.Builder.() -> Unit):
        Unit = tableReference(CfnConfiguredTable.TableReferenceProperty(tableReference))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableProps,
  ) : CdkObject(cdkObject), CfnConfiguredTableProps {
    override fun allowedColumns(): List<String> = unwrap(this).getAllowedColumns()

    override fun analysisMethod(): String = unwrap(this).getAnalysisMethod()

    override fun analysisRules(): Any? = unwrap(this).getAnalysisRules()

    override fun description(): String? = unwrap(this).getDescription()

    override fun name(): String = unwrap(this).getName()

    override fun tableReference(): Any = unwrap(this).getTableReference()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConfiguredTableProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableProps):
        CfnConfiguredTableProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConfiguredTableProps):
        software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableProps
  }
}
