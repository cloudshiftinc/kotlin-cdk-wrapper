@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnConnectionProps {
  public fun catalogId(): String

  public fun connectionInput(): Any

  @CdkDslMarker
  public interface Builder {
    public fun catalogId(catalogId: String)

    public fun connectionInput(connectionInput: IResolvable)

    public fun connectionInput(connectionInput: CfnConnection.ConnectionInputProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("228d8b18a12331284361a76bd08962f8e3d3275a3380f994908ea0a9f77d721e")
    public
        fun connectionInput(connectionInput: CfnConnection.ConnectionInputProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnConnectionProps.Builder =
        software.amazon.awscdk.services.glue.CfnConnectionProps.builder()

    override fun catalogId(catalogId: String) {
      cdkBuilder.catalogId(catalogId)
    }

    override fun connectionInput(connectionInput: IResolvable) {
      cdkBuilder.connectionInput(connectionInput.let(IResolvable::unwrap))
    }

    override fun connectionInput(connectionInput: CfnConnection.ConnectionInputProperty) {
      cdkBuilder.connectionInput(connectionInput.let(CfnConnection.ConnectionInputProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("228d8b18a12331284361a76bd08962f8e3d3275a3380f994908ea0a9f77d721e")
    override
        fun connectionInput(connectionInput: CfnConnection.ConnectionInputProperty.Builder.() -> Unit):
        Unit = connectionInput(CfnConnection.ConnectionInputProperty(connectionInput))

    public fun build(): software.amazon.awscdk.services.glue.CfnConnectionProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.glue.CfnConnectionProps,
  ) : CdkObject(cdkObject), CfnConnectionProps {
    override fun catalogId(): String = unwrap(this).getCatalogId()

    override fun connectionInput(): Any = unwrap(this).getConnectionInput()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConnectionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnConnectionProps):
        CfnConnectionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConnectionProps):
        software.amazon.awscdk.services.glue.CfnConnectionProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.glue.CfnConnectionProps
  }
}
