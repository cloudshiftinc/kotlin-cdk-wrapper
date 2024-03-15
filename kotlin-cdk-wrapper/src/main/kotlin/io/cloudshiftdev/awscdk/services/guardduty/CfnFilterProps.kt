@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.guardduty

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

public interface CfnFilterProps {
  public fun action(): String? = unwrap(this).getAction()

  public fun description(): String? = unwrap(this).getDescription()

  public fun detectorId(): String? = unwrap(this).getDetectorId()

  public fun findingCriteria(): Any

  public fun name(): String? = unwrap(this).getName()

  public fun rank(): Number? = unwrap(this).getRank()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun action(action: String)

    public fun description(description: String)

    public fun detectorId(detectorId: String)

    public fun findingCriteria(findingCriteria: IResolvable)

    public fun findingCriteria(findingCriteria: CfnFilter.FindingCriteriaProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("62b0234b603fd40e27555a85ab249fe4a9281b32d74f52ce2d1a858d42676099")
    public
        fun findingCriteria(findingCriteria: CfnFilter.FindingCriteriaProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun rank(rank: Number)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.guardduty.CfnFilterProps.Builder =
        software.amazon.awscdk.services.guardduty.CfnFilterProps.builder()

    override fun action(action: String) {
      cdkBuilder.action(action)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun detectorId(detectorId: String) {
      cdkBuilder.detectorId(detectorId)
    }

    override fun findingCriteria(findingCriteria: IResolvable) {
      cdkBuilder.findingCriteria(findingCriteria.let(IResolvable::unwrap))
    }

    override fun findingCriteria(findingCriteria: CfnFilter.FindingCriteriaProperty) {
      cdkBuilder.findingCriteria(findingCriteria.let(CfnFilter.FindingCriteriaProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("62b0234b603fd40e27555a85ab249fe4a9281b32d74f52ce2d1a858d42676099")
    override
        fun findingCriteria(findingCriteria: CfnFilter.FindingCriteriaProperty.Builder.() -> Unit):
        Unit = findingCriteria(CfnFilter.FindingCriteriaProperty(findingCriteria))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun rank(rank: Number) {
      cdkBuilder.rank(rank)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.guardduty.CfnFilterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.guardduty.CfnFilterProps,
  ) : CdkObject(cdkObject), CfnFilterProps {
    override fun action(): String? = unwrap(this).getAction()

    override fun description(): String? = unwrap(this).getDescription()

    override fun detectorId(): String? = unwrap(this).getDetectorId()

    override fun findingCriteria(): Any = unwrap(this).getFindingCriteria()

    override fun name(): String? = unwrap(this).getName()

    override fun rank(): Number? = unwrap(this).getRank()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFilterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnFilterProps):
        CfnFilterProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFilterProps):
        software.amazon.awscdk.services.guardduty.CfnFilterProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.guardduty.CfnFilterProps
  }
}
