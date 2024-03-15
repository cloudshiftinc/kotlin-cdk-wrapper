@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnTableProps {
  public fun catalogId(): String

  public fun databaseName(): String

  public fun openTableFormatInput(): Any? = unwrap(this).getOpenTableFormatInput()

  public fun tableInput(): Any

  @CdkDslMarker
  public interface Builder {
    public fun catalogId(catalogId: String)

    public fun databaseName(databaseName: String)

    public fun openTableFormatInput(openTableFormatInput: IResolvable)

    public fun openTableFormatInput(openTableFormatInput: CfnTable.OpenTableFormatInputProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("01f235bf0a53055ce97d121ace788757a4a27b13e570816d3ddd47c0c3664c25")
    public
        fun openTableFormatInput(openTableFormatInput: CfnTable.OpenTableFormatInputProperty.Builder.() -> Unit)

    public fun tableInput(tableInput: IResolvable)

    public fun tableInput(tableInput: CfnTable.TableInputProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("79055d6ca86f70c323755ae20b8465fcc2d5f57eda405e2de0830a81695767ae")
    public fun tableInput(tableInput: CfnTable.TableInputProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnTableProps.Builder =
        software.amazon.awscdk.services.glue.CfnTableProps.builder()

    override fun catalogId(catalogId: String) {
      cdkBuilder.catalogId(catalogId)
    }

    override fun databaseName(databaseName: String) {
      cdkBuilder.databaseName(databaseName)
    }

    override fun openTableFormatInput(openTableFormatInput: IResolvable) {
      cdkBuilder.openTableFormatInput(openTableFormatInput.let(IResolvable::unwrap))
    }

    override fun openTableFormatInput(openTableFormatInput: CfnTable.OpenTableFormatInputProperty) {
      cdkBuilder.openTableFormatInput(openTableFormatInput.let(CfnTable.OpenTableFormatInputProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("01f235bf0a53055ce97d121ace788757a4a27b13e570816d3ddd47c0c3664c25")
    override
        fun openTableFormatInput(openTableFormatInput: CfnTable.OpenTableFormatInputProperty.Builder.() -> Unit):
        Unit = openTableFormatInput(CfnTable.OpenTableFormatInputProperty(openTableFormatInput))

    override fun tableInput(tableInput: IResolvable) {
      cdkBuilder.tableInput(tableInput.let(IResolvable::unwrap))
    }

    override fun tableInput(tableInput: CfnTable.TableInputProperty) {
      cdkBuilder.tableInput(tableInput.let(CfnTable.TableInputProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("79055d6ca86f70c323755ae20b8465fcc2d5f57eda405e2de0830a81695767ae")
    override fun tableInput(tableInput: CfnTable.TableInputProperty.Builder.() -> Unit): Unit =
        tableInput(CfnTable.TableInputProperty(tableInput))

    public fun build(): software.amazon.awscdk.services.glue.CfnTableProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.glue.CfnTableProps,
  ) : CdkObject(cdkObject), CfnTableProps {
    override fun catalogId(): String = unwrap(this).getCatalogId()

    override fun databaseName(): String = unwrap(this).getDatabaseName()

    override fun openTableFormatInput(): Any? = unwrap(this).getOpenTableFormatInput()

    override fun tableInput(): Any = unwrap(this).getTableInput()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTableProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTableProps): CfnTableProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTableProps): software.amazon.awscdk.services.glue.CfnTableProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.glue.CfnTableProps
  }
}
