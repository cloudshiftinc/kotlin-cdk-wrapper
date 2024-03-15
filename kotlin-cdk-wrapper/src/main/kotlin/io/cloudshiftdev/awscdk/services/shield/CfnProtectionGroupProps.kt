@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.shield

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnProtectionGroupProps {
  public fun aggregation(): String

  public fun members(): List<String> = unwrap(this).getMembers() ?: emptyList()

  public fun pattern(): String

  public fun protectionGroupId(): String

  public fun resourceType(): String? = unwrap(this).getResourceType()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun aggregation(aggregation: String)

    public fun members(members: List<String>)

    public fun members(vararg members: String)

    public fun pattern(pattern: String)

    public fun protectionGroupId(protectionGroupId: String)

    public fun resourceType(resourceType: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.shield.CfnProtectionGroupProps.Builder =
        software.amazon.awscdk.services.shield.CfnProtectionGroupProps.builder()

    override fun aggregation(aggregation: String) {
      cdkBuilder.aggregation(aggregation)
    }

    override fun members(members: List<String>) {
      cdkBuilder.members(members)
    }

    override fun members(vararg members: String): Unit = members(members.toList())

    override fun pattern(pattern: String) {
      cdkBuilder.pattern(pattern)
    }

    override fun protectionGroupId(protectionGroupId: String) {
      cdkBuilder.protectionGroupId(protectionGroupId)
    }

    override fun resourceType(resourceType: String) {
      cdkBuilder.resourceType(resourceType)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.shield.CfnProtectionGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.shield.CfnProtectionGroupProps,
  ) : CdkObject(cdkObject), CfnProtectionGroupProps {
    override fun aggregation(): String = unwrap(this).getAggregation()

    override fun members(): List<String> = unwrap(this).getMembers() ?: emptyList()

    override fun pattern(): String = unwrap(this).getPattern()

    override fun protectionGroupId(): String = unwrap(this).getProtectionGroupId()

    override fun resourceType(): String? = unwrap(this).getResourceType()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnProtectionGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.shield.CfnProtectionGroupProps):
        CfnProtectionGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnProtectionGroupProps):
        software.amazon.awscdk.services.shield.CfnProtectionGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.shield.CfnProtectionGroupProps
  }
}
