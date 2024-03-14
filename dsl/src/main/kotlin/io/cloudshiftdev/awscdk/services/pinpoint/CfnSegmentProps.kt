package io.cloudshiftdev.awscdk.services.pinpoint

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnSegmentProps {
  /**
   * The unique identifier for the Amazon Pinpoint application that the segment is associated with.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-segment.html#cfn-pinpoint-segment-applicationid)
   */
  public fun applicationId(): String

  /**
   * An array that defines the dimensions for the segment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-segment.html#cfn-pinpoint-segment-dimensions)
   */
  public fun dimensions(): Any? = unwrap(this).getDimensions()

  /**
   * The name of the segment.
   *
   *
   * A segment must have a name otherwise it will not appear in the Amazon Pinpoint console.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-segment.html#cfn-pinpoint-segment-name)
   */
  public fun name(): String

  /**
   * The segment group to use and the dimensions to apply to the group's base segments in order to
   * build the segment.
   *
   * A segment group can consist of zero or more base segments. Your request can include only one
   * segment group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-segment.html#cfn-pinpoint-segment-segmentgroups)
   */
  public fun segmentGroups(): Any? = unwrap(this).getSegmentGroups()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-segment.html#cfn-pinpoint-segment-tags)
   */
  public fun tags(): Any? = unwrap(this).getTags()

  /**
   * A builder for [CfnSegmentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicationId The unique identifier for the Amazon Pinpoint application that the
     * segment is associated with. 
     */
    public fun applicationId(applicationId: String)

    /**
     * @param dimensions An array that defines the dimensions for the segment.
     */
    public fun dimensions(dimensions: IResolvable)

    /**
     * @param dimensions An array that defines the dimensions for the segment.
     */
    public fun dimensions(dimensions: CfnSegment.SegmentDimensionsProperty)

    /**
     * @param dimensions An array that defines the dimensions for the segment.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5586c31ebf2690f0c69569a25a1fcc503547745efe9583b759143de46534e76a")
    public fun dimensions(dimensions: CfnSegment.SegmentDimensionsProperty.Builder.() -> Unit)

    /**
     * @param name The name of the segment. 
     *
     * A segment must have a name otherwise it will not appear in the Amazon Pinpoint console.
     */
    public fun name(name: String)

    /**
     * @param segmentGroups The segment group to use and the dimensions to apply to the group's base
     * segments in order to build the segment.
     * A segment group can consist of zero or more base segments. Your request can include only one
     * segment group.
     */
    public fun segmentGroups(segmentGroups: IResolvable)

    /**
     * @param segmentGroups The segment group to use and the dimensions to apply to the group's base
     * segments in order to build the segment.
     * A segment group can consist of zero or more base segments. Your request can include only one
     * segment group.
     */
    public fun segmentGroups(segmentGroups: CfnSegment.SegmentGroupsProperty)

    /**
     * @param segmentGroups The segment group to use and the dimensions to apply to the group's base
     * segments in order to build the segment.
     * A segment group can consist of zero or more base segments. Your request can include only one
     * segment group.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9f2c4ca59b4f3ad2c3375b04eb497d976bd9c820444202fff36d277b94fa34ea")
    public fun segmentGroups(segmentGroups: CfnSegment.SegmentGroupsProperty.Builder.() -> Unit)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnSegmentProps.Builder =
        software.amazon.awscdk.services.pinpoint.CfnSegmentProps.builder()

    /**
     * @param applicationId The unique identifier for the Amazon Pinpoint application that the
     * segment is associated with. 
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * @param dimensions An array that defines the dimensions for the segment.
     */
    override fun dimensions(dimensions: IResolvable) {
      cdkBuilder.dimensions(dimensions.let(IResolvable::unwrap))
    }

    /**
     * @param dimensions An array that defines the dimensions for the segment.
     */
    override fun dimensions(dimensions: CfnSegment.SegmentDimensionsProperty) {
      cdkBuilder.dimensions(dimensions.let(CfnSegment.SegmentDimensionsProperty::unwrap))
    }

    /**
     * @param dimensions An array that defines the dimensions for the segment.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5586c31ebf2690f0c69569a25a1fcc503547745efe9583b759143de46534e76a")
    override fun dimensions(dimensions: CfnSegment.SegmentDimensionsProperty.Builder.() -> Unit):
        Unit = dimensions(CfnSegment.SegmentDimensionsProperty(dimensions))

    /**
     * @param name The name of the segment. 
     *
     * A segment must have a name otherwise it will not appear in the Amazon Pinpoint console.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param segmentGroups The segment group to use and the dimensions to apply to the group's base
     * segments in order to build the segment.
     * A segment group can consist of zero or more base segments. Your request can include only one
     * segment group.
     */
    override fun segmentGroups(segmentGroups: IResolvable) {
      cdkBuilder.segmentGroups(segmentGroups.let(IResolvable::unwrap))
    }

    /**
     * @param segmentGroups The segment group to use and the dimensions to apply to the group's base
     * segments in order to build the segment.
     * A segment group can consist of zero or more base segments. Your request can include only one
     * segment group.
     */
    override fun segmentGroups(segmentGroups: CfnSegment.SegmentGroupsProperty) {
      cdkBuilder.segmentGroups(segmentGroups.let(CfnSegment.SegmentGroupsProperty::unwrap))
    }

    /**
     * @param segmentGroups The segment group to use and the dimensions to apply to the group's base
     * segments in order to build the segment.
     * A segment group can consist of zero or more base segments. Your request can include only one
     * segment group.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9f2c4ca59b4f3ad2c3375b04eb497d976bd9c820444202fff36d277b94fa34ea")
    override fun segmentGroups(segmentGroups: CfnSegment.SegmentGroupsProperty.Builder.() -> Unit):
        Unit = segmentGroups(CfnSegment.SegmentGroupsProperty(segmentGroups))

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnSegmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.pinpoint.CfnSegmentProps,
  ) : CdkObject(cdkObject), CfnSegmentProps {
    /**
     * The unique identifier for the Amazon Pinpoint application that the segment is associated
     * with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-segment.html#cfn-pinpoint-segment-applicationid)
     */
    override fun applicationId(): String = unwrap(this).getApplicationId()

    /**
     * An array that defines the dimensions for the segment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-segment.html#cfn-pinpoint-segment-dimensions)
     */
    override fun dimensions(): Any? = unwrap(this).getDimensions()

    /**
     * The name of the segment.
     *
     *
     * A segment must have a name otherwise it will not appear in the Amazon Pinpoint console.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-segment.html#cfn-pinpoint-segment-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The segment group to use and the dimensions to apply to the group's base segments in order to
     * build the segment.
     *
     * A segment group can consist of zero or more base segments. Your request can include only one
     * segment group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-segment.html#cfn-pinpoint-segment-segmentgroups)
     */
    override fun segmentGroups(): Any? = unwrap(this).getSegmentGroups()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-segment.html#cfn-pinpoint-segment-tags)
     */
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
