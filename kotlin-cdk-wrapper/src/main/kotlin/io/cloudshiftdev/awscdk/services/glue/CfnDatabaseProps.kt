@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnDatabaseProps {
  public fun catalogId(): String

  public fun databaseInput(): Any

  @CdkDslMarker
  public interface Builder {
    public fun catalogId(catalogId: String)

    public fun databaseInput(databaseInput: IResolvable)

    public fun databaseInput(databaseInput: CfnDatabase.DatabaseInputProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3dc75074e2c37451f80d699516d33a089a9ef326bf074b07ded67c1d13231f51")
    public fun databaseInput(databaseInput: CfnDatabase.DatabaseInputProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnDatabaseProps.Builder =
        software.amazon.awscdk.services.glue.CfnDatabaseProps.builder()

    override fun catalogId(catalogId: String) {
      cdkBuilder.catalogId(catalogId)
    }

    override fun databaseInput(databaseInput: IResolvable) {
      cdkBuilder.databaseInput(databaseInput.let(IResolvable::unwrap))
    }

    override fun databaseInput(databaseInput: CfnDatabase.DatabaseInputProperty) {
      cdkBuilder.databaseInput(databaseInput.let(CfnDatabase.DatabaseInputProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3dc75074e2c37451f80d699516d33a089a9ef326bf074b07ded67c1d13231f51")
    override fun databaseInput(databaseInput: CfnDatabase.DatabaseInputProperty.Builder.() -> Unit):
        Unit = databaseInput(CfnDatabase.DatabaseInputProperty(databaseInput))

    public fun build(): software.amazon.awscdk.services.glue.CfnDatabaseProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.glue.CfnDatabaseProps,
  ) : CdkObject(cdkObject), CfnDatabaseProps {
    override fun catalogId(): String = unwrap(this).getCatalogId()

    override fun databaseInput(): Any = unwrap(this).getDatabaseInput()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDatabaseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnDatabaseProps):
        CfnDatabaseProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDatabaseProps):
        software.amazon.awscdk.services.glue.CfnDatabaseProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.glue.CfnDatabaseProps
  }
}
