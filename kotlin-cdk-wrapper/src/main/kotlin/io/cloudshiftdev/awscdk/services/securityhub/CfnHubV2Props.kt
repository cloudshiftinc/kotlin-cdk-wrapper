@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.securityhub

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Properties for defining a `CfnHubV2`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.securityhub.*;
 * CfnHubV2Props cfnHubV2Props = CfnHubV2Props.builder()
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-hubv2.html)
 */
public interface CfnHubV2Props {
  /**
   * The tags to add to the hub V2 resource when you enable Security Hub.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-hubv2.html#cfn-securityhub-hubv2-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnHubV2Props]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param tags The tags to add to the hub V2 resource when you enable Security Hub.
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.securityhub.CfnHubV2Props.Builder =
        software.amazon.awscdk.services.securityhub.CfnHubV2Props.builder()

    /**
     * @param tags The tags to add to the hub V2 resource when you enable Security Hub.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.securityhub.CfnHubV2Props =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.securityhub.CfnHubV2Props,
  ) : CdkObject(cdkObject),
      CfnHubV2Props {
    /**
     * The tags to add to the hub V2 resource when you enable Security Hub.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-hubv2.html#cfn-securityhub-hubv2-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnHubV2Props {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnHubV2Props):
        CfnHubV2Props = CdkObjectWrappers.wrap(cdkObject) as? CfnHubV2Props ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnHubV2Props):
        software.amazon.awscdk.services.securityhub.CfnHubV2Props = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.securityhub.CfnHubV2Props
  }
}
