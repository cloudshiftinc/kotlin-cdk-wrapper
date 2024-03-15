@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface Host {
  public fun sourcePath(): String? = unwrap(this).getSourcePath()

  @CdkDslMarker
  public interface Builder {
    public fun sourcePath(sourcePath: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.Host.Builder =
        software.amazon.awscdk.services.ecs.Host.builder()

    override fun sourcePath(sourcePath: String) {
      cdkBuilder.sourcePath(sourcePath)
    }

    public fun build(): software.amazon.awscdk.services.ecs.Host = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.Host,
  ) : CdkObject(cdkObject), Host {
    override fun sourcePath(): String? = unwrap(this).getSourcePath()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Host {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.Host): Host =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Host): software.amazon.awscdk.services.ecs.Host = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.Host
  }
}
