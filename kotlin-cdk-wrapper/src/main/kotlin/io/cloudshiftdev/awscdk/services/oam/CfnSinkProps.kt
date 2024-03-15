@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.oam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface CfnSinkProps {
  public fun name(): String

  public fun policy(): Any? = unwrap(this).getPolicy()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  @CdkDslMarker
  public interface Builder {
    public fun name(name: String)

    public fun policy(policy: Any)

    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.oam.CfnSinkProps.Builder =
        software.amazon.awscdk.services.oam.CfnSinkProps.builder()

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.oam.CfnSinkProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.oam.CfnSinkProps,
  ) : CdkObject(cdkObject), CfnSinkProps {
    override fun name(): String = unwrap(this).getName()

    override fun policy(): Any? = unwrap(this).getPolicy()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSinkProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.oam.CfnSinkProps): CfnSinkProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSinkProps): software.amazon.awscdk.services.oam.CfnSinkProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.oam.CfnSinkProps
  }
}
