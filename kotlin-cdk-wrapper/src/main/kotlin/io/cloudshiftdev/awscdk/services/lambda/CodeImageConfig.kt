@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CodeImageConfig {
  public fun cmd(): List<String> = unwrap(this).getCmd() ?: emptyList()

  public fun entrypoint(): List<String> = unwrap(this).getEntrypoint() ?: emptyList()

  public fun imageUri(): String

  public fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()

  @CdkDslMarker
  public interface Builder {
    public fun cmd(cmd: List<String>)

    public fun cmd(vararg cmd: String)

    public fun entrypoint(entrypoint: List<String>)

    public fun entrypoint(vararg entrypoint: String)

    public fun imageUri(imageUri: String)

    public fun workingDirectory(workingDirectory: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CodeImageConfig.Builder =
        software.amazon.awscdk.services.lambda.CodeImageConfig.builder()

    override fun cmd(cmd: List<String>) {
      cdkBuilder.cmd(cmd)
    }

    override fun cmd(vararg cmd: String): Unit = cmd(cmd.toList())

    override fun entrypoint(entrypoint: List<String>) {
      cdkBuilder.entrypoint(entrypoint)
    }

    override fun entrypoint(vararg entrypoint: String): Unit = entrypoint(entrypoint.toList())

    override fun imageUri(imageUri: String) {
      cdkBuilder.imageUri(imageUri)
    }

    override fun workingDirectory(workingDirectory: String) {
      cdkBuilder.workingDirectory(workingDirectory)
    }

    public fun build(): software.amazon.awscdk.services.lambda.CodeImageConfig = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.CodeImageConfig,
  ) : CdkObject(cdkObject), CodeImageConfig {
    override fun cmd(): List<String> = unwrap(this).getCmd() ?: emptyList()

    override fun entrypoint(): List<String> = unwrap(this).getEntrypoint() ?: emptyList()

    override fun imageUri(): String = unwrap(this).getImageUri()

    override fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CodeImageConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CodeImageConfig):
        CodeImageConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CodeImageConfig):
        software.amazon.awscdk.services.lambda.CodeImageConfig = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.lambda.CodeImageConfig
  }
}
