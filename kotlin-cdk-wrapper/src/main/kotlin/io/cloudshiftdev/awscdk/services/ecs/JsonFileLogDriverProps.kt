@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface JsonFileLogDriverProps : BaseLogDriverProps {
  public fun compress(): Boolean? = unwrap(this).getCompress()

  public fun maxFile(): Number? = unwrap(this).getMaxFile()

  public fun maxSize(): String? = unwrap(this).getMaxSize()

  @CdkDslMarker
  public interface Builder {
    public fun compress(compress: Boolean)

    public fun env(env: List<String>)

    public fun env(vararg env: String)

    public fun envRegex(envRegex: String)

    public fun labels(labels: List<String>)

    public fun labels(vararg labels: String)

    public fun maxFile(maxFile: Number)

    public fun maxSize(maxSize: String)

    public fun tag(tag: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.JsonFileLogDriverProps.Builder =
        software.amazon.awscdk.services.ecs.JsonFileLogDriverProps.builder()

    override fun compress(compress: Boolean) {
      cdkBuilder.compress(compress)
    }

    override fun env(env: List<String>) {
      cdkBuilder.env(env)
    }

    override fun env(vararg env: String): Unit = env(env.toList())

    override fun envRegex(envRegex: String) {
      cdkBuilder.envRegex(envRegex)
    }

    override fun labels(labels: List<String>) {
      cdkBuilder.labels(labels)
    }

    override fun labels(vararg labels: String): Unit = labels(labels.toList())

    override fun maxFile(maxFile: Number) {
      cdkBuilder.maxFile(maxFile)
    }

    override fun maxSize(maxSize: String) {
      cdkBuilder.maxSize(maxSize)
    }

    override fun tag(tag: String) {
      cdkBuilder.tag(tag)
    }

    public fun build(): software.amazon.awscdk.services.ecs.JsonFileLogDriverProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.JsonFileLogDriverProps,
  ) : CdkObject(cdkObject), JsonFileLogDriverProps {
    override fun compress(): Boolean? = unwrap(this).getCompress()

    override fun env(): List<String> = unwrap(this).getEnv() ?: emptyList()

    override fun envRegex(): String? = unwrap(this).getEnvRegex()

    override fun labels(): List<String> = unwrap(this).getLabels() ?: emptyList()

    override fun maxFile(): Number? = unwrap(this).getMaxFile()

    override fun maxSize(): String? = unwrap(this).getMaxSize()

    override fun tag(): String? = unwrap(this).getTag()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): JsonFileLogDriverProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.JsonFileLogDriverProps):
        JsonFileLogDriverProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: JsonFileLogDriverProps):
        software.amazon.awscdk.services.ecs.JsonFileLogDriverProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.JsonFileLogDriverProps
  }
}
