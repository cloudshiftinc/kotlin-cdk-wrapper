@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnTrafficRouting {
  public fun prodTrafficRoute(): CfnTrafficRoute

  public fun targetGroups(): List<String>

  public fun testTrafficRoute(): CfnTrafficRoute

  @CdkDslMarker
  public interface Builder {
    public fun prodTrafficRoute(prodTrafficRoute: CfnTrafficRoute)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b94fd5f03bfb4e60a7cbf6031b69823f75ec8d393f5fa6565c0d87afe2cd8500")
    public fun prodTrafficRoute(prodTrafficRoute: CfnTrafficRoute.Builder.() -> Unit)

    public fun targetGroups(targetGroups: List<String>)

    public fun targetGroups(vararg targetGroups: String)

    public fun testTrafficRoute(testTrafficRoute: CfnTrafficRoute)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0a362eb59dc5393738e0a537467bb3b34edd3167fe80250bba4a5aa5e5a75007")
    public fun testTrafficRoute(testTrafficRoute: CfnTrafficRoute.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnTrafficRouting.Builder =
        software.amazon.awscdk.CfnTrafficRouting.builder()

    override fun prodTrafficRoute(prodTrafficRoute: CfnTrafficRoute) {
      cdkBuilder.prodTrafficRoute(prodTrafficRoute.let(CfnTrafficRoute::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b94fd5f03bfb4e60a7cbf6031b69823f75ec8d393f5fa6565c0d87afe2cd8500")
    override fun prodTrafficRoute(prodTrafficRoute: CfnTrafficRoute.Builder.() -> Unit): Unit =
        prodTrafficRoute(CfnTrafficRoute(prodTrafficRoute))

    override fun targetGroups(targetGroups: List<String>) {
      cdkBuilder.targetGroups(targetGroups)
    }

    override fun targetGroups(vararg targetGroups: String): Unit =
        targetGroups(targetGroups.toList())

    override fun testTrafficRoute(testTrafficRoute: CfnTrafficRoute) {
      cdkBuilder.testTrafficRoute(testTrafficRoute.let(CfnTrafficRoute::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0a362eb59dc5393738e0a537467bb3b34edd3167fe80250bba4a5aa5e5a75007")
    override fun testTrafficRoute(testTrafficRoute: CfnTrafficRoute.Builder.() -> Unit): Unit =
        testTrafficRoute(CfnTrafficRoute(testTrafficRoute))

    public fun build(): software.amazon.awscdk.CfnTrafficRouting = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnTrafficRouting,
  ) : CdkObject(cdkObject), CfnTrafficRouting {
    override fun prodTrafficRoute(): CfnTrafficRoute =
        unwrap(this).getProdTrafficRoute().let(CfnTrafficRoute::wrap)

    override fun targetGroups(): List<String> = unwrap(this).getTargetGroups()

    override fun testTrafficRoute(): CfnTrafficRoute =
        unwrap(this).getTestTrafficRoute().let(CfnTrafficRoute::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTrafficRouting {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnTrafficRouting): CfnTrafficRouting =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTrafficRouting): software.amazon.awscdk.CfnTrafficRouting =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.CfnTrafficRouting
  }
}
