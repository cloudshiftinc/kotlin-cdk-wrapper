@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.macie

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnFindingsFilterProps {
  public fun action(): String? = unwrap(this).getAction()

  public fun description(): String? = unwrap(this).getDescription()

  public fun findingCriteria(): Any

  public fun name(): String

  public fun position(): Number? = unwrap(this).getPosition()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun action(action: String)

    public fun description(description: String)

    public fun findingCriteria(findingCriteria: IResolvable)

    public fun findingCriteria(findingCriteria: CfnFindingsFilter.FindingCriteriaProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a384cddbb7a2add8aa2a25fd60456f867b63257250554df377a9d0c66ebd99c3")
    public
        fun findingCriteria(findingCriteria: CfnFindingsFilter.FindingCriteriaProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun position(position: Number)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.macie.CfnFindingsFilterProps.Builder =
        software.amazon.awscdk.services.macie.CfnFindingsFilterProps.builder()

    override fun action(action: String) {
      cdkBuilder.action(action)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun findingCriteria(findingCriteria: IResolvable) {
      cdkBuilder.findingCriteria(findingCriteria.let(IResolvable::unwrap))
    }

    override fun findingCriteria(findingCriteria: CfnFindingsFilter.FindingCriteriaProperty) {
      cdkBuilder.findingCriteria(findingCriteria.let(CfnFindingsFilter.FindingCriteriaProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a384cddbb7a2add8aa2a25fd60456f867b63257250554df377a9d0c66ebd99c3")
    override
        fun findingCriteria(findingCriteria: CfnFindingsFilter.FindingCriteriaProperty.Builder.() -> Unit):
        Unit = findingCriteria(CfnFindingsFilter.FindingCriteriaProperty(findingCriteria))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun position(position: Number) {
      cdkBuilder.position(position)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.macie.CfnFindingsFilterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.macie.CfnFindingsFilterProps,
  ) : CdkObject(cdkObject), CfnFindingsFilterProps {
    override fun action(): String? = unwrap(this).getAction()

    override fun description(): String? = unwrap(this).getDescription()

    override fun findingCriteria(): Any = unwrap(this).getFindingCriteria()

    override fun name(): String = unwrap(this).getName()

    override fun position(): Number? = unwrap(this).getPosition()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFindingsFilterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.macie.CfnFindingsFilterProps):
        CfnFindingsFilterProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFindingsFilterProps):
        software.amazon.awscdk.services.macie.CfnFindingsFilterProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.macie.CfnFindingsFilterProps
  }
}
