package io.cloudshiftdev.awscdk.services.vpclattice

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnAccessLogSubscriptionProps {
  /**
   * The Amazon Resource Name (ARN) of the destination.
   *
   * The supported destination types are CloudWatch Log groups, Kinesis Data Firehose delivery
   * streams, and Amazon S3 buckets.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-accesslogsubscription.html#cfn-vpclattice-accesslogsubscription-destinationarn)
   */
  public fun destinationArn(): String

  /**
   * The ID or Amazon Resource Name (ARN) of the service network or service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-accesslogsubscription.html#cfn-vpclattice-accesslogsubscription-resourceidentifier)
   */
  public fun resourceIdentifier(): String? = unwrap(this).getResourceIdentifier()

  /**
   * The tags for the access log subscription.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-accesslogsubscription.html#cfn-vpclattice-accesslogsubscription-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnAccessLogSubscriptionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param destinationArn The Amazon Resource Name (ARN) of the destination. 
     * The supported destination types are CloudWatch Log groups, Kinesis Data Firehose delivery
     * streams, and Amazon S3 buckets.
     */
    public fun destinationArn(destinationArn: String)

    /**
     * @param resourceIdentifier The ID or Amazon Resource Name (ARN) of the service network or
     * service.
     */
    public fun resourceIdentifier(resourceIdentifier: String)

    /**
     * @param tags The tags for the access log subscription.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags for the access log subscription.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.vpclattice.CfnAccessLogSubscriptionProps.Builder =
        software.amazon.awscdk.services.vpclattice.CfnAccessLogSubscriptionProps.builder()

    /**
     * @param destinationArn The Amazon Resource Name (ARN) of the destination. 
     * The supported destination types are CloudWatch Log groups, Kinesis Data Firehose delivery
     * streams, and Amazon S3 buckets.
     */
    override fun destinationArn(destinationArn: String) {
      cdkBuilder.destinationArn(destinationArn)
    }

    /**
     * @param resourceIdentifier The ID or Amazon Resource Name (ARN) of the service network or
     * service.
     */
    override fun resourceIdentifier(resourceIdentifier: String) {
      cdkBuilder.resourceIdentifier(resourceIdentifier)
    }

    /**
     * @param tags The tags for the access log subscription.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags for the access log subscription.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.vpclattice.CfnAccessLogSubscriptionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.vpclattice.CfnAccessLogSubscriptionProps,
  ) : CdkObject(cdkObject), CfnAccessLogSubscriptionProps {
    /**
     * The Amazon Resource Name (ARN) of the destination.
     *
     * The supported destination types are CloudWatch Log groups, Kinesis Data Firehose delivery
     * streams, and Amazon S3 buckets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-accesslogsubscription.html#cfn-vpclattice-accesslogsubscription-destinationarn)
     */
    override fun destinationArn(): String = unwrap(this).getDestinationArn()

    /**
     * The ID or Amazon Resource Name (ARN) of the service network or service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-accesslogsubscription.html#cfn-vpclattice-accesslogsubscription-resourceidentifier)
     */
    override fun resourceIdentifier(): String? = unwrap(this).getResourceIdentifier()

    /**
     * The tags for the access log subscription.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-accesslogsubscription.html#cfn-vpclattice-accesslogsubscription-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAccessLogSubscriptionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnAccessLogSubscriptionProps):
        CfnAccessLogSubscriptionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAccessLogSubscriptionProps):
        software.amazon.awscdk.services.vpclattice.CfnAccessLogSubscriptionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.vpclattice.CfnAccessLogSubscriptionProps
  }
}
