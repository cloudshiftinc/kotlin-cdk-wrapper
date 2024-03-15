@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface AddHeaderProps {
  public fun name(): String

  public fun `value`(): String

  @CdkDslMarker
  public interface Builder {
    public fun name(name: String)

    public fun `value`(`value`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.actions.AddHeaderProps.Builder =
        software.amazon.awscdk.services.ses.actions.AddHeaderProps.builder()

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.ses.actions.AddHeaderProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.actions.AddHeaderProps,
  ) : CdkObject(cdkObject), AddHeaderProps {
    override fun name(): String = unwrap(this).getName()

    override fun `value`(): String = unwrap(this).getValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AddHeaderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.actions.AddHeaderProps):
        AddHeaderProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AddHeaderProps):
        software.amazon.awscdk.services.ses.actions.AddHeaderProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ses.actions.AddHeaderProps
  }
}
