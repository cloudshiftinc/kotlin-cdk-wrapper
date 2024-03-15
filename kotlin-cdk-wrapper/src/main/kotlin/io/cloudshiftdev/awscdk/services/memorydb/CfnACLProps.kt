@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.memorydb

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnACLProps {
  public fun aclName(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun userNames(): List<String> = unwrap(this).getUserNames() ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun aclName(aclName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun userNames(userNames: List<String>)

    public fun userNames(vararg userNames: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.memorydb.CfnACLProps.Builder =
        software.amazon.awscdk.services.memorydb.CfnACLProps.builder()

    override fun aclName(aclName: String) {
      cdkBuilder.aclName(aclName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun userNames(userNames: List<String>) {
      cdkBuilder.userNames(userNames)
    }

    override fun userNames(vararg userNames: String): Unit = userNames(userNames.toList())

    public fun build(): software.amazon.awscdk.services.memorydb.CfnACLProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.memorydb.CfnACLProps,
  ) : CdkObject(cdkObject), CfnACLProps {
    override fun aclName(): String = unwrap(this).getAclName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun userNames(): List<String> = unwrap(this).getUserNames() ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnACLProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.memorydb.CfnACLProps): CfnACLProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnACLProps): software.amazon.awscdk.services.memorydb.CfnACLProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.memorydb.CfnACLProps
  }
}
