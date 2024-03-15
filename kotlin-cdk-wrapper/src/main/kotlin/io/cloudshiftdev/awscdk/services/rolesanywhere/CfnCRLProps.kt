@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rolesanywhere

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnCRLProps {
  public fun crlData(): String

  public fun enabled(): Any? = unwrap(this).getEnabled()

  public fun name(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun trustAnchorArn(): String? = unwrap(this).getTrustAnchorArn()

  @CdkDslMarker
  public interface Builder {
    public fun crlData(crlData: String)

    public fun enabled(enabled: Boolean)

    public fun enabled(enabled: IResolvable)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun trustAnchorArn(trustAnchorArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rolesanywhere.CfnCRLProps.Builder =
        software.amazon.awscdk.services.rolesanywhere.CfnCRLProps.builder()

    override fun crlData(crlData: String) {
      cdkBuilder.crlData(crlData)
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun trustAnchorArn(trustAnchorArn: String) {
      cdkBuilder.trustAnchorArn(trustAnchorArn)
    }

    public fun build(): software.amazon.awscdk.services.rolesanywhere.CfnCRLProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rolesanywhere.CfnCRLProps,
  ) : CdkObject(cdkObject), CfnCRLProps {
    override fun crlData(): String = unwrap(this).getCrlData()

    override fun enabled(): Any? = unwrap(this).getEnabled()

    override fun name(): String = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun trustAnchorArn(): String? = unwrap(this).getTrustAnchorArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCRLProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rolesanywhere.CfnCRLProps):
        CfnCRLProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCRLProps):
        software.amazon.awscdk.services.rolesanywhere.CfnCRLProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.rolesanywhere.CfnCRLProps
  }
}
