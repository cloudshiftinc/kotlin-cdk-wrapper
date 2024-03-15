@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface Hooks {
  public fun postDeploy(): List<String> = unwrap(this).getPostDeploy() ?: emptyList()

  public fun postDestroy(): List<String> = unwrap(this).getPostDestroy() ?: emptyList()

  public fun preDeploy(): List<String> = unwrap(this).getPreDeploy() ?: emptyList()

  public fun preDestroy(): List<String> = unwrap(this).getPreDestroy() ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun postDeploy(postDeploy: List<String>)

    public fun postDeploy(vararg postDeploy: String)

    public fun postDestroy(postDestroy: List<String>)

    public fun postDestroy(vararg postDestroy: String)

    public fun preDeploy(preDeploy: List<String>)

    public fun preDeploy(vararg preDeploy: String)

    public fun preDestroy(preDestroy: List<String>)

    public fun preDestroy(vararg preDestroy: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.Hooks.Builder =
        software.amazon.awscdk.cloudassembly.schema.Hooks.builder()

    override fun postDeploy(postDeploy: List<String>) {
      cdkBuilder.postDeploy(postDeploy)
    }

    override fun postDeploy(vararg postDeploy: String): Unit = postDeploy(postDeploy.toList())

    override fun postDestroy(postDestroy: List<String>) {
      cdkBuilder.postDestroy(postDestroy)
    }

    override fun postDestroy(vararg postDestroy: String): Unit = postDestroy(postDestroy.toList())

    override fun preDeploy(preDeploy: List<String>) {
      cdkBuilder.preDeploy(preDeploy)
    }

    override fun preDeploy(vararg preDeploy: String): Unit = preDeploy(preDeploy.toList())

    override fun preDestroy(preDestroy: List<String>) {
      cdkBuilder.preDestroy(preDestroy)
    }

    override fun preDestroy(vararg preDestroy: String): Unit = preDestroy(preDestroy.toList())

    public fun build(): software.amazon.awscdk.cloudassembly.schema.Hooks = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cloudassembly.schema.Hooks,
  ) : CdkObject(cdkObject), Hooks {
    override fun postDeploy(): List<String> = unwrap(this).getPostDeploy() ?: emptyList()

    override fun postDestroy(): List<String> = unwrap(this).getPostDestroy() ?: emptyList()

    override fun preDeploy(): List<String> = unwrap(this).getPreDeploy() ?: emptyList()

    override fun preDestroy(): List<String> = unwrap(this).getPreDestroy() ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Hooks {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.Hooks): Hooks =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Hooks): software.amazon.awscdk.cloudassembly.schema.Hooks =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.cloudassembly.schema.Hooks
  }
}
