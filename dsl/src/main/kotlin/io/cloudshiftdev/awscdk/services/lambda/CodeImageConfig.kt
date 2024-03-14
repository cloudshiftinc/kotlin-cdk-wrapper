package io.cloudshiftdev.awscdk.services.lambda

import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CodeImageConfig {
  public fun cmd(): List<String> = unwrap(this).getCmd() ?: emptyList()

  public fun entrypoint(): List<String> = unwrap(this).getEntrypoint() ?: emptyList()

  public fun imageUri(): String

  public fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()

  public interface Builder {
    public fun cmd(cmd: List<String>) {
    }

    public fun entrypoint(entrypoint: List<String>) {
    }

    public fun imageUri(imageUri: String) {
    }

    public fun workingDirectory(workingDirectory: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CodeImageConfig.Builder =
        software.amazon.awscdk.services.lambda.CodeImageConfig.builder()

    public override fun cmd(cmd: List<String>) {
      cdkBuilder.cmd(cmd)
    }

    public override fun entrypoint(entrypoint: List<String>) {
      cdkBuilder.entrypoint(entrypoint)
    }

    public override fun imageUri(imageUri: String) {
      cdkBuilder.imageUri(imageUri)
    }

    public override fun workingDirectory(workingDirectory: String) {
      cdkBuilder.workingDirectory(workingDirectory)
    }

    public fun build(): software.amazon.awscdk.services.lambda.CodeImageConfig = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.lambda.CodeImageConfig,
  ) : CodeImageConfig {
    public override fun cmd(): List<String> = unwrap(this).getCmd() ?: emptyList()

    public override fun entrypoint(): List<String> = unwrap(this).getEntrypoint() ?: emptyList()

    public override fun imageUri(): String = unwrap(this).getImageUri()

    public override fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CodeImageConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CodeImageConfig):
        CodeImageConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CodeImageConfig):
        software.amazon.awscdk.services.lambda.CodeImageConfig = (wrapped as Wrapper).cdkObject
  }
}
