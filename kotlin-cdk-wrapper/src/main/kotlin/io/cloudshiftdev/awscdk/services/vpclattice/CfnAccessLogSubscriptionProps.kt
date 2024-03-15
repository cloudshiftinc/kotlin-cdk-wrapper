@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.vpclattice

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnAccessLogSubscriptionProps {
  public fun destinationArn(): String

  public fun resourceIdentifier(): String? = unwrap(this).getResourceIdentifier()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun destinationArn(destinationArn: String)

    public fun resourceIdentifier(resourceIdentifier: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.vpclattice.CfnAccessLogSubscriptionProps.Builder =
        software.amazon.awscdk.services.vpclattice.CfnAccessLogSubscriptionProps.builder()

    override fun destinationArn(destinationArn: String) {
      cdkBuilder.destinationArn(destinationArn)
    }

    override fun resourceIdentifier(resourceIdentifier: String) {
      cdkBuilder.resourceIdentifier(resourceIdentifier)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.vpclattice.CfnAccessLogSubscriptionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.vpclattice.CfnAccessLogSubscriptionProps,
  ) : CdkObject(cdkObject), CfnAccessLogSubscriptionProps {
    override fun destinationArn(): String = unwrap(this).getDestinationArn()

    override fun resourceIdentifier(): String? = unwrap(this).getResourceIdentifier()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAccessLogSubscriptionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnAccessLogSubscriptionProps):
        CfnAccessLogSubscriptionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAccessLogSubscriptionProps):
        software.amazon.awscdk.services.vpclattice.CfnAccessLogSubscriptionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.vpclattice.CfnAccessLogSubscriptionProps
  }
}
