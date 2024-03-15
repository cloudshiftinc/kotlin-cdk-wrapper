@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.guardduty

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnIPSetProps {
  public fun activate(): Any? = unwrap(this).getActivate()

  public fun detectorId(): String? = unwrap(this).getDetectorId()

  public fun format(): String

  public fun location(): String

  public fun name(): String? = unwrap(this).getName()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun activate(activate: Boolean)

    public fun activate(activate: IResolvable)

    public fun detectorId(detectorId: String)

    public fun format(format: String)

    public fun location(location: String)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.guardduty.CfnIPSetProps.Builder =
        software.amazon.awscdk.services.guardduty.CfnIPSetProps.builder()

    override fun activate(activate: Boolean) {
      cdkBuilder.activate(activate)
    }

    override fun activate(activate: IResolvable) {
      cdkBuilder.activate(activate.let(IResolvable::unwrap))
    }

    override fun detectorId(detectorId: String) {
      cdkBuilder.detectorId(detectorId)
    }

    override fun format(format: String) {
      cdkBuilder.format(format)
    }

    override fun location(location: String) {
      cdkBuilder.location(location)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.guardduty.CfnIPSetProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.guardduty.CfnIPSetProps,
  ) : CdkObject(cdkObject), CfnIPSetProps {
    override fun activate(): Any? = unwrap(this).getActivate()

    override fun detectorId(): String? = unwrap(this).getDetectorId()

    override fun format(): String = unwrap(this).getFormat()

    override fun location(): String = unwrap(this).getLocation()

    override fun name(): String? = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIPSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnIPSetProps):
        CfnIPSetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIPSetProps):
        software.amazon.awscdk.services.guardduty.CfnIPSetProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.guardduty.CfnIPSetProps
  }
}
