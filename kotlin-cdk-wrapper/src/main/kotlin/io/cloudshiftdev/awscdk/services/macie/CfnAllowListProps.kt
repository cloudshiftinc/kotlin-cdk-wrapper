@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.macie

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnAllowListProps {
  public fun criteria(): Any

  public fun description(): String? = unwrap(this).getDescription()

  public fun name(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun criteria(criteria: IResolvable)

    public fun criteria(criteria: CfnAllowList.CriteriaProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18794651586708edef5f5674e3ec4878c82fd42a25688d040a640943eb20f070")
    public fun criteria(criteria: CfnAllowList.CriteriaProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.macie.CfnAllowListProps.Builder =
        software.amazon.awscdk.services.macie.CfnAllowListProps.builder()

    override fun criteria(criteria: IResolvable) {
      cdkBuilder.criteria(criteria.let(IResolvable::unwrap))
    }

    override fun criteria(criteria: CfnAllowList.CriteriaProperty) {
      cdkBuilder.criteria(criteria.let(CfnAllowList.CriteriaProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18794651586708edef5f5674e3ec4878c82fd42a25688d040a640943eb20f070")
    override fun criteria(criteria: CfnAllowList.CriteriaProperty.Builder.() -> Unit): Unit =
        criteria(CfnAllowList.CriteriaProperty(criteria))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.macie.CfnAllowListProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.macie.CfnAllowListProps,
  ) : CdkObject(cdkObject), CfnAllowListProps {
    override fun criteria(): Any = unwrap(this).getCriteria()

    override fun description(): String? = unwrap(this).getDescription()

    override fun name(): String = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAllowListProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.macie.CfnAllowListProps):
        CfnAllowListProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAllowListProps):
        software.amazon.awscdk.services.macie.CfnAllowListProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.macie.CfnAllowListProps
  }
}
