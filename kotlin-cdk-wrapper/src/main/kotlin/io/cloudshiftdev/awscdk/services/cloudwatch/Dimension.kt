@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit

public interface Dimension {
  public fun name(): String

  public fun `value`(): Any

  @CdkDslMarker
  public interface Builder {
    public fun name(name: String)

    public fun `value`(`value`: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.Dimension.Builder =
        software.amazon.awscdk.services.cloudwatch.Dimension.builder()

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun `value`(`value`: Any) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.Dimension = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.Dimension,
  ) : CdkObject(cdkObject), Dimension {
    override fun name(): String = unwrap(this).getName()

    override fun `value`(): Any = unwrap(this).getValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Dimension {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.Dimension): Dimension =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Dimension): software.amazon.awscdk.services.cloudwatch.Dimension =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.Dimension
  }
}
