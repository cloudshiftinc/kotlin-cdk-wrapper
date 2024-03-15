@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.robomaker

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Properties for defining a `CfnFleet`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.robomaker.*;
 * CfnFleetProps cfnFleetProps = CfnFleetProps.builder()
 * .name("name")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-fleet.html)
 */
public interface CfnFleetProps {
  /**
   * The name of the fleet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-fleet.html#cfn-robomaker-fleet-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The list of all tags added to the fleet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-fleet.html#cfn-robomaker-fleet-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnFleetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name The name of the fleet.
     */
    public fun name(name: String)

    /**
     * @param tags The list of all tags added to the fleet.
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.robomaker.CfnFleetProps.Builder =
        software.amazon.awscdk.services.robomaker.CfnFleetProps.builder()

    /**
     * @param name The name of the fleet.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags The list of all tags added to the fleet.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.robomaker.CfnFleetProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.robomaker.CfnFleetProps,
  ) : CdkObject(cdkObject), CfnFleetProps {
    /**
     * The name of the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-fleet.html#cfn-robomaker-fleet-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The list of all tags added to the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-fleet.html#cfn-robomaker-fleet-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFleetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.robomaker.CfnFleetProps):
        CfnFleetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFleetProps):
        software.amazon.awscdk.services.robomaker.CfnFleetProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.robomaker.CfnFleetProps
  }
}
