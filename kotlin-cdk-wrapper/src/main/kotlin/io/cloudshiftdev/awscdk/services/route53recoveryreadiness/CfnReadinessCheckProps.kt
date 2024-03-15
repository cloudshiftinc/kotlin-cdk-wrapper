@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53recoveryreadiness

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnReadinessCheckProps {
  public fun readinessCheckName(): String? = unwrap(this).getReadinessCheckName()

  public fun resourceSetName(): String? = unwrap(this).getResourceSetName()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun readinessCheckName(readinessCheckName: String)

    public fun resourceSetName(resourceSetName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheckProps.Builder =
        software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheckProps.builder()

    override fun readinessCheckName(readinessCheckName: String) {
      cdkBuilder.readinessCheckName(readinessCheckName)
    }

    override fun resourceSetName(resourceSetName: String) {
      cdkBuilder.resourceSetName(resourceSetName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build():
        software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheckProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheckProps,
  ) : CdkObject(cdkObject), CfnReadinessCheckProps {
    override fun readinessCheckName(): String? = unwrap(this).getReadinessCheckName()

    override fun resourceSetName(): String? = unwrap(this).getResourceSetName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnReadinessCheckProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheckProps):
        CfnReadinessCheckProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnReadinessCheckProps):
        software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheckProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheckProps
  }
}
