@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface ExecuteFileOptions {
  public fun arguments(): String? = unwrap(this).getArguments()

  public fun filePath(): String

  @CdkDslMarker
  public interface Builder {
    public fun arguments(arguments: String)

    public fun filePath(filePath: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.ExecuteFileOptions.Builder =
        software.amazon.awscdk.services.ec2.ExecuteFileOptions.builder()

    override fun arguments(arguments: String) {
      cdkBuilder.arguments(arguments)
    }

    override fun filePath(filePath: String) {
      cdkBuilder.filePath(filePath)
    }

    public fun build(): software.amazon.awscdk.services.ec2.ExecuteFileOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.ExecuteFileOptions,
  ) : CdkObject(cdkObject), ExecuteFileOptions {
    override fun arguments(): String? = unwrap(this).getArguments()

    override fun filePath(): String = unwrap(this).getFilePath()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ExecuteFileOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.ExecuteFileOptions):
        ExecuteFileOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ExecuteFileOptions):
        software.amazon.awscdk.services.ec2.ExecuteFileOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.ExecuteFileOptions
  }
}
