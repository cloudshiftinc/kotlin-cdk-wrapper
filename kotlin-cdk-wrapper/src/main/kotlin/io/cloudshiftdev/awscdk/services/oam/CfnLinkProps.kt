@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.oam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface CfnLinkProps {
  public fun labelTemplate(): String? = unwrap(this).getLabelTemplate()

  public fun resourceTypes(): List<String>

  public fun sinkIdentifier(): String

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  @CdkDslMarker
  public interface Builder {
    public fun labelTemplate(labelTemplate: String)

    public fun resourceTypes(resourceTypes: List<String>)

    public fun resourceTypes(vararg resourceTypes: String)

    public fun sinkIdentifier(sinkIdentifier: String)

    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.oam.CfnLinkProps.Builder =
        software.amazon.awscdk.services.oam.CfnLinkProps.builder()

    override fun labelTemplate(labelTemplate: String) {
      cdkBuilder.labelTemplate(labelTemplate)
    }

    override fun resourceTypes(resourceTypes: List<String>) {
      cdkBuilder.resourceTypes(resourceTypes)
    }

    override fun resourceTypes(vararg resourceTypes: String): Unit =
        resourceTypes(resourceTypes.toList())

    override fun sinkIdentifier(sinkIdentifier: String) {
      cdkBuilder.sinkIdentifier(sinkIdentifier)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.oam.CfnLinkProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.oam.CfnLinkProps,
  ) : CdkObject(cdkObject), CfnLinkProps {
    override fun labelTemplate(): String? = unwrap(this).getLabelTemplate()

    override fun resourceTypes(): List<String> = unwrap(this).getResourceTypes()

    override fun sinkIdentifier(): String = unwrap(this).getSinkIdentifier()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLinkProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.oam.CfnLinkProps): CfnLinkProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLinkProps): software.amazon.awscdk.services.oam.CfnLinkProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.oam.CfnLinkProps
  }
}
