@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.memorydb

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnUserProps {
  public fun accessString(): String? = unwrap(this).getAccessString()

  public fun authenticationMode(): Any? = unwrap(this).getAuthenticationMode()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun userName(): String

  @CdkDslMarker
  public interface Builder {
    public fun accessString(accessString: String)

    public fun authenticationMode(authenticationMode: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun userName(userName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.memorydb.CfnUserProps.Builder =
        software.amazon.awscdk.services.memorydb.CfnUserProps.builder()

    override fun accessString(accessString: String) {
      cdkBuilder.accessString(accessString)
    }

    override fun authenticationMode(authenticationMode: Any) {
      cdkBuilder.authenticationMode(authenticationMode)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun userName(userName: String) {
      cdkBuilder.userName(userName)
    }

    public fun build(): software.amazon.awscdk.services.memorydb.CfnUserProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.memorydb.CfnUserProps,
  ) : CdkObject(cdkObject), CfnUserProps {
    override fun accessString(): String? = unwrap(this).getAccessString()

    override fun authenticationMode(): Any? = unwrap(this).getAuthenticationMode()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun userName(): String = unwrap(this).getUserName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUserProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.memorydb.CfnUserProps):
        CfnUserProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserProps):
        software.amazon.awscdk.services.memorydb.CfnUserProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.memorydb.CfnUserProps
  }
}
