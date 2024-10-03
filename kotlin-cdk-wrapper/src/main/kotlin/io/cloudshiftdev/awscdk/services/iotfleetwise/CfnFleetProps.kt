@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotfleetwise

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnFleet`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotfleetwise.*;
 * CfnFleetProps cfnFleetProps = CfnFleetProps.builder()
 * .id("id")
 * .signalCatalogArn("signalCatalogArn")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-fleet.html)
 */
public interface CfnFleetProps {
  /**
   * (Optional) A brief description of the fleet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-fleet.html#cfn-iotfleetwise-fleet-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The unique ID of the fleet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-fleet.html#cfn-iotfleetwise-fleet-id)
   */
  public fun id(): String

  /**
   * The ARN of the signal catalog associated with the fleet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-fleet.html#cfn-iotfleetwise-fleet-signalcatalogarn)
   */
  public fun signalCatalogArn(): String

  /**
   * (Optional) Metadata that can be used to manage the fleet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-fleet.html#cfn-iotfleetwise-fleet-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnFleetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description (Optional) A brief description of the fleet.
     */
    public fun description(description: String)

    /**
     * @param id The unique ID of the fleet. 
     */
    public fun id(id: String)

    /**
     * @param signalCatalogArn The ARN of the signal catalog associated with the fleet. 
     */
    public fun signalCatalogArn(signalCatalogArn: String)

    /**
     * @param tags (Optional) Metadata that can be used to manage the fleet.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags (Optional) Metadata that can be used to manage the fleet.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotfleetwise.CfnFleetProps.Builder =
        software.amazon.awscdk.services.iotfleetwise.CfnFleetProps.builder()

    /**
     * @param description (Optional) A brief description of the fleet.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param id The unique ID of the fleet. 
     */
    override fun id(id: String) {
      cdkBuilder.id(id)
    }

    /**
     * @param signalCatalogArn The ARN of the signal catalog associated with the fleet. 
     */
    override fun signalCatalogArn(signalCatalogArn: String) {
      cdkBuilder.signalCatalogArn(signalCatalogArn)
    }

    /**
     * @param tags (Optional) Metadata that can be used to manage the fleet.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags (Optional) Metadata that can be used to manage the fleet.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotfleetwise.CfnFleetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnFleetProps,
  ) : CdkObject(cdkObject),
      CfnFleetProps {
    /**
     * (Optional) A brief description of the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-fleet.html#cfn-iotfleetwise-fleet-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The unique ID of the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-fleet.html#cfn-iotfleetwise-fleet-id)
     */
    override fun id(): String = unwrap(this).getId()

    /**
     * The ARN of the signal catalog associated with the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-fleet.html#cfn-iotfleetwise-fleet-signalcatalogarn)
     */
    override fun signalCatalogArn(): String = unwrap(this).getSignalCatalogArn()

    /**
     * (Optional) Metadata that can be used to manage the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-fleet.html#cfn-iotfleetwise-fleet-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFleetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnFleetProps):
        CfnFleetProps = CdkObjectWrappers.wrap(cdkObject) as? CfnFleetProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFleetProps):
        software.amazon.awscdk.services.iotfleetwise.CfnFleetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotfleetwise.CfnFleetProps
  }
}
