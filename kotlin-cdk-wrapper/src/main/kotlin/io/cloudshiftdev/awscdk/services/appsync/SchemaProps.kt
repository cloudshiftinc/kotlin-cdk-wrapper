@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface SchemaProps {
  public fun filePath(): String

  @CdkDslMarker
  public interface Builder {
    public fun filePath(filePath: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.SchemaProps.Builder =
        software.amazon.awscdk.services.appsync.SchemaProps.builder()

    override fun filePath(filePath: String) {
      cdkBuilder.filePath(filePath)
    }

    public fun build(): software.amazon.awscdk.services.appsync.SchemaProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.SchemaProps,
  ) : CdkObject(cdkObject), SchemaProps {
    override fun filePath(): String = unwrap(this).getFilePath()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SchemaProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.SchemaProps): SchemaProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: SchemaProps): software.amazon.awscdk.services.appsync.SchemaProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.appsync.SchemaProps
  }
}