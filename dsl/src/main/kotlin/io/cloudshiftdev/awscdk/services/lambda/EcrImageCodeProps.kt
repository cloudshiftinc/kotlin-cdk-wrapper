package io.cloudshiftdev.awscdk.services.lambda

import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface EcrImageCodeProps {
  public fun cmd(): List<String> = unwrap(this).getCmd() ?: emptyList()

  public fun entrypoint(): List<String> = unwrap(this).getEntrypoint() ?: emptyList()

  @Deprecated(message = "deprecated in CDK")
  public fun tag(): String? = unwrap(this).getTag()

  public fun tagOrDigest(): String? = unwrap(this).getTagOrDigest()

  public fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()

  public interface Builder {
    public fun cmd(cmd: List<String>)

    public fun cmd(vararg cmd: String)

    public fun entrypoint(entrypoint: List<String>)

    public fun entrypoint(vararg entrypoint: String)

    @Deprecated(message = "deprecated in CDK")
    public fun tag(tag: String)

    public fun tagOrDigest(tagOrDigest: String)

    public fun workingDirectory(workingDirectory: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.EcrImageCodeProps.Builder =
        software.amazon.awscdk.services.lambda.EcrImageCodeProps.builder()

    override fun cmd(cmd: List<String>) {
      cdkBuilder.cmd(cmd)
    }

    override fun cmd(vararg cmd: String): Unit = cmd(cmd.toList())

    override fun entrypoint(entrypoint: List<String>) {
      cdkBuilder.entrypoint(entrypoint)
    }

    override fun entrypoint(vararg entrypoint: String): Unit = entrypoint(entrypoint.toList())

    @Deprecated(message = "deprecated in CDK")
    override fun tag(tag: String) {
      cdkBuilder.tag(tag)
    }

    override fun tagOrDigest(tagOrDigest: String) {
      cdkBuilder.tagOrDigest(tagOrDigest)
    }

    override fun workingDirectory(workingDirectory: String) {
      cdkBuilder.workingDirectory(workingDirectory)
    }

    public fun build(): software.amazon.awscdk.services.lambda.EcrImageCodeProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.lambda.EcrImageCodeProps,
  ) : EcrImageCodeProps {
    override fun cmd(): List<String> = unwrap(this).getCmd() ?: emptyList()

    override fun entrypoint(): List<String> = unwrap(this).getEntrypoint() ?: emptyList()

    @Deprecated(message = "deprecated in CDK")
    override fun tag(): String? = unwrap(this).getTag()

    override fun tagOrDigest(): String? = unwrap(this).getTagOrDigest()

    override fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): EcrImageCodeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.EcrImageCodeProps):
        EcrImageCodeProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EcrImageCodeProps):
        software.amazon.awscdk.services.lambda.EcrImageCodeProps = (wrapped as Wrapper).cdkObject
  }
}
