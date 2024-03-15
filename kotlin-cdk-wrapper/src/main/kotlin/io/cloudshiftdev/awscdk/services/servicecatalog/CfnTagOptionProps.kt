@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CfnTagOptionProps {
  public fun active(): Any? = unwrap(this).getActive()

  public fun key(): String

  public fun `value`(): String

  @CdkDslMarker
  public interface Builder {
    public fun active(active: Boolean)

    public fun active(active: IResolvable)

    public fun key(key: String)

    public fun `value`(`value`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.servicecatalog.CfnTagOptionProps.Builder
        = software.amazon.awscdk.services.servicecatalog.CfnTagOptionProps.builder()

    override fun active(active: Boolean) {
      cdkBuilder.active(active)
    }

    override fun active(active: IResolvable) {
      cdkBuilder.active(active.let(IResolvable::unwrap))
    }

    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.CfnTagOptionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.servicecatalog.CfnTagOptionProps,
  ) : CdkObject(cdkObject), CfnTagOptionProps {
    override fun active(): Any? = unwrap(this).getActive()

    override fun key(): String = unwrap(this).getKey()

    override fun `value`(): String = unwrap(this).getValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTagOptionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnTagOptionProps):
        CfnTagOptionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTagOptionProps):
        software.amazon.awscdk.services.servicecatalog.CfnTagOptionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.servicecatalog.CfnTagOptionProps
  }
}
