@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnDeliverySource`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * CfnDeliverySourceProps cfnDeliverySourceProps = CfnDeliverySourceProps.builder()
 * .name("name")
 * // the properties below are optional
 * .logType("logType")
 * .resourceArn("resourceArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverysource.html)
 */
public interface CfnDeliverySourceProps {
  /**
   * The type of log that the source is sending.
   *
   * For valid values for this parameter, see the documentation for the source service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverysource.html#cfn-logs-deliverysource-logtype)
   */
  public fun logType(): String? = unwrap(this).getLogType()

  /**
   * The unique name of the delivery source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverysource.html#cfn-logs-deliverysource-name)
   */
  public fun name(): String

  /**
   * The Amazon Resource Name (ARN) that uniquely identifies this delivery source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverysource.html#cfn-logs-deliverysource-resourcearn)
   */
  public fun resourceArn(): String? = unwrap(this).getResourceArn()

  /**
   * The tags that have been assigned to this delivery source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverysource.html#cfn-logs-deliverysource-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDeliverySourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param logType The type of log that the source is sending.
     * For valid values for this parameter, see the documentation for the source service.
     */
    public fun logType(logType: String)

    /**
     * @param name The unique name of the delivery source. 
     */
    public fun name(name: String)

    /**
     * @param resourceArn The Amazon Resource Name (ARN) that uniquely identifies this delivery
     * source.
     */
    public fun resourceArn(resourceArn: String)

    /**
     * @param tags The tags that have been assigned to this delivery source.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags that have been assigned to this delivery source.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnDeliverySourceProps.Builder =
        software.amazon.awscdk.services.logs.CfnDeliverySourceProps.builder()

    /**
     * @param logType The type of log that the source is sending.
     * For valid values for this parameter, see the documentation for the source service.
     */
    override fun logType(logType: String) {
      cdkBuilder.logType(logType)
    }

    /**
     * @param name The unique name of the delivery source. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param resourceArn The Amazon Resource Name (ARN) that uniquely identifies this delivery
     * source.
     */
    override fun resourceArn(resourceArn: String) {
      cdkBuilder.resourceArn(resourceArn)
    }

    /**
     * @param tags The tags that have been assigned to this delivery source.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags that have been assigned to this delivery source.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.logs.CfnDeliverySourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.logs.CfnDeliverySourceProps,
  ) : CdkObject(cdkObject), CfnDeliverySourceProps {
    /**
     * The type of log that the source is sending.
     *
     * For valid values for this parameter, see the documentation for the source service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverysource.html#cfn-logs-deliverysource-logtype)
     */
    override fun logType(): String? = unwrap(this).getLogType()

    /**
     * The unique name of the delivery source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverysource.html#cfn-logs-deliverysource-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The Amazon Resource Name (ARN) that uniquely identifies this delivery source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverysource.html#cfn-logs-deliverysource-resourcearn)
     */
    override fun resourceArn(): String? = unwrap(this).getResourceArn()

    /**
     * The tags that have been assigned to this delivery source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverysource.html#cfn-logs-deliverysource-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDeliverySourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnDeliverySourceProps):
        CfnDeliverySourceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDeliverySourceProps):
        software.amazon.awscdk.services.logs.CfnDeliverySourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.logs.CfnDeliverySourceProps
  }
}
