@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface ExportValueOptions {
  public fun description(): String? = unwrap(this).getDescription()

  public fun name(): String? = unwrap(this).getName()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.ExportValueOptions.Builder =
        software.amazon.awscdk.ExportValueOptions.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.ExportValueOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.ExportValueOptions,
  ) : CdkObject(cdkObject), ExportValueOptions {
    override fun description(): String? = unwrap(this).getDescription()

    override fun name(): String? = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ExportValueOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.ExportValueOptions): ExportValueOptions =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ExportValueOptions): software.amazon.awscdk.ExportValueOptions =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.ExportValueOptions
  }
}
