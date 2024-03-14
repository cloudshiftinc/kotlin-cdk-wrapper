package io.cloudshiftdev.awscdk.services.lakeformation

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnTagAssociationProps {
  /**
   * A structure containing an LF-tag key-value pair.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tagassociation.html#cfn-lakeformation-tagassociation-lftags)
   */
  public fun lfTags(): Any

  /**
   * UTF-8 string (valid values: `DATABASE | TABLE` ).
   *
   * The resource for which the LF-tag policy applies.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tagassociation.html#cfn-lakeformation-tagassociation-resource)
   */
  public fun resource(): Any

  /**
   * A builder for [CfnTagAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param lfTags A structure containing an LF-tag key-value pair. 
     */
    public fun lfTags(lfTags: IResolvable)

    /**
     * @param lfTags A structure containing an LF-tag key-value pair. 
     */
    public fun lfTags(lfTags: List<Any>)

    /**
     * @param lfTags A structure containing an LF-tag key-value pair. 
     */
    public fun lfTags(vararg lfTags: Any)

    /**
     * @param resource UTF-8 string (valid values: `DATABASE | TABLE` ). 
     * The resource for which the LF-tag policy applies.
     */
    public fun resource(resource: IResolvable)

    /**
     * @param resource UTF-8 string (valid values: `DATABASE | TABLE` ). 
     * The resource for which the LF-tag policy applies.
     */
    public fun resource(resource: CfnTagAssociation.ResourceProperty)

    /**
     * @param resource UTF-8 string (valid values: `DATABASE | TABLE` ). 
     * The resource for which the LF-tag policy applies.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9cb3ccafffe663fac54400701dd637c69bc7557ba70562585034caeca7a270d4")
    public fun resource(resource: CfnTagAssociation.ResourceProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lakeformation.CfnTagAssociationProps.Builder =
        software.amazon.awscdk.services.lakeformation.CfnTagAssociationProps.builder()

    /**
     * @param lfTags A structure containing an LF-tag key-value pair. 
     */
    override fun lfTags(lfTags: IResolvable) {
      cdkBuilder.lfTags(lfTags.let(IResolvable::unwrap))
    }

    /**
     * @param lfTags A structure containing an LF-tag key-value pair. 
     */
    override fun lfTags(lfTags: List<Any>) {
      cdkBuilder.lfTags(lfTags)
    }

    /**
     * @param lfTags A structure containing an LF-tag key-value pair. 
     */
    override fun lfTags(vararg lfTags: Any): Unit = lfTags(lfTags.toList())

    /**
     * @param resource UTF-8 string (valid values: `DATABASE | TABLE` ). 
     * The resource for which the LF-tag policy applies.
     */
    override fun resource(resource: IResolvable) {
      cdkBuilder.resource(resource.let(IResolvable::unwrap))
    }

    /**
     * @param resource UTF-8 string (valid values: `DATABASE | TABLE` ). 
     * The resource for which the LF-tag policy applies.
     */
    override fun resource(resource: CfnTagAssociation.ResourceProperty) {
      cdkBuilder.resource(resource.let(CfnTagAssociation.ResourceProperty::unwrap))
    }

    /**
     * @param resource UTF-8 string (valid values: `DATABASE | TABLE` ). 
     * The resource for which the LF-tag policy applies.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9cb3ccafffe663fac54400701dd637c69bc7557ba70562585034caeca7a270d4")
    override fun resource(resource: CfnTagAssociation.ResourceProperty.Builder.() -> Unit): Unit =
        resource(CfnTagAssociation.ResourceProperty(resource))

    public fun build(): software.amazon.awscdk.services.lakeformation.CfnTagAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lakeformation.CfnTagAssociationProps,
  ) : CdkObject(cdkObject), CfnTagAssociationProps {
    /**
     * A structure containing an LF-tag key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tagassociation.html#cfn-lakeformation-tagassociation-lftags)
     */
    override fun lfTags(): Any = unwrap(this).getLfTags()

    /**
     * UTF-8 string (valid values: `DATABASE | TABLE` ).
     *
     * The resource for which the LF-tag policy applies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tagassociation.html#cfn-lakeformation-tagassociation-resource)
     */
    override fun resource(): Any = unwrap(this).getResource()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTagAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnTagAssociationProps):
        CfnTagAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTagAssociationProps):
        software.amazon.awscdk.services.lakeformation.CfnTagAssociationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lakeformation.CfnTagAssociationProps
  }
}
