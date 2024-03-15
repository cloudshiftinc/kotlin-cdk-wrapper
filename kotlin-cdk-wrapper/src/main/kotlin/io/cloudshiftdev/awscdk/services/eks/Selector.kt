@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface Selector {
  public fun labels(): Map<String, String> = unwrap(this).getLabels() ?: emptyMap()

  public fun namespace(): String

  @CdkDslMarker
  public interface Builder {
    public fun labels(labels: Map<String, String>)

    public fun namespace(namespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.Selector.Builder =
        software.amazon.awscdk.services.eks.Selector.builder()

    override fun labels(labels: Map<String, String>) {
      cdkBuilder.labels(labels)
    }

    override fun namespace(namespace: String) {
      cdkBuilder.namespace(namespace)
    }

    public fun build(): software.amazon.awscdk.services.eks.Selector = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.Selector,
  ) : CdkObject(cdkObject), Selector {
    override fun labels(): Map<String, String> = unwrap(this).getLabels() ?: emptyMap()

    override fun namespace(): String = unwrap(this).getNamespace()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Selector {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.Selector): Selector =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Selector): software.amazon.awscdk.services.eks.Selector = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.services.eks.Selector
  }
}
