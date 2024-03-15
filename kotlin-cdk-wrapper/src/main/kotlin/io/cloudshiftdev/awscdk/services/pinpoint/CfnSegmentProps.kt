@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pinpoint

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnSegmentProps {
  public fun applicationId(): String

  public fun dimensions(): Any? = unwrap(this).getDimensions()

  public fun name(): String

  public fun segmentGroups(): Any? = unwrap(this).getSegmentGroups()

  public fun tags(): Any? = unwrap(this).getTags()

  @CdkDslMarker
  public interface Builder {
    public fun applicationId(applicationId: String)

    public fun dimensions(dimensions: IResolvable)

    public fun dimensions(dimensions: CfnSegment.SegmentDimensionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5586c31ebf2690f0c69569a25a1fcc503547745efe9583b759143de46534e76a")
    public fun dimensions(dimensions: CfnSegment.SegmentDimensionsProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun segmentGroups(segmentGroups: IResolvable)

    public fun segmentGroups(segmentGroups: CfnSegment.SegmentGroupsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9f2c4ca59b4f3ad2c3375b04eb497d976bd9c820444202fff36d277b94fa34ea")
    public fun segmentGroups(segmentGroups: CfnSegment.SegmentGroupsProperty.Builder.() -> Unit)

    public fun tags(tags: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnSegmentProps.Builder =
        software.amazon.awscdk.services.pinpoint.CfnSegmentProps.builder()

    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    override fun dimensions(dimensions: IResolvable) {
      cdkBuilder.dimensions(dimensions.let(IResolvable::unwrap))
    }

    override fun dimensions(dimensions: CfnSegment.SegmentDimensionsProperty) {
      cdkBuilder.dimensions(dimensions.let(CfnSegment.SegmentDimensionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5586c31ebf2690f0c69569a25a1fcc503547745efe9583b759143de46534e76a")
    override fun dimensions(dimensions: CfnSegment.SegmentDimensionsProperty.Builder.() -> Unit):
        Unit = dimensions(CfnSegment.SegmentDimensionsProperty(dimensions))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun segmentGroups(segmentGroups: IResolvable) {
      cdkBuilder.segmentGroups(segmentGroups.let(IResolvable::unwrap))
    }

    override fun segmentGroups(segmentGroups: CfnSegment.SegmentGroupsProperty) {
      cdkBuilder.segmentGroups(segmentGroups.let(CfnSegment.SegmentGroupsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9f2c4ca59b4f3ad2c3375b04eb497d976bd9c820444202fff36d277b94fa34ea")
    override fun segmentGroups(segmentGroups: CfnSegment.SegmentGroupsProperty.Builder.() -> Unit):
        Unit = segmentGroups(CfnSegment.SegmentGroupsProperty(segmentGroups))

    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnSegmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.pinpoint.CfnSegmentProps,
  ) : CdkObject(cdkObject), CfnSegmentProps {
    override fun applicationId(): String = unwrap(this).getApplicationId()

    override fun dimensions(): Any? = unwrap(this).getDimensions()

    override fun name(): String = unwrap(this).getName()

    override fun segmentGroups(): Any? = unwrap(this).getSegmentGroups()

    override fun tags(): Any? = unwrap(this).getTags()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSegmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnSegmentProps):
        CfnSegmentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSegmentProps):
        software.amazon.awscdk.services.pinpoint.CfnSegmentProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.pinpoint.CfnSegmentProps
  }
}
