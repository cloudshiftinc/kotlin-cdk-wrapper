@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.resourcegroups

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnTagSyncTask`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.resourcegroups.*;
 * CfnTagSyncTaskProps cfnTagSyncTaskProps = CfnTagSyncTaskProps.builder()
 * .group("group")
 * .roleArn("roleArn")
 * .tagKey("tagKey")
 * .tagValue("tagValue")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourcegroups-tagsynctask.html)
 */
public interface CfnTagSyncTaskProps {
  /**
   * The Amazon resource name (ARN) or name of the application group for which you want to create a
   * tag-sync task.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourcegroups-tagsynctask.html#cfn-resourcegroups-tagsynctask-group)
   */
  public fun group(): String

  /**
   * The Amazon resource name (ARN) of the role assumed by the service to tag and untag resources on
   * your behalf.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourcegroups-tagsynctask.html#cfn-resourcegroups-tagsynctask-rolearn)
   */
  public fun roleArn(): String

  /**
   * The tag key.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourcegroups-tagsynctask.html#cfn-resourcegroups-tagsynctask-tagkey)
   */
  public fun tagKey(): String

  /**
   * The tag value.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourcegroups-tagsynctask.html#cfn-resourcegroups-tagsynctask-tagvalue)
   */
  public fun tagValue(): String

  /**
   * A builder for [CfnTagSyncTaskProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param group The Amazon resource name (ARN) or name of the application group for which you
     * want to create a tag-sync task. 
     */
    public fun group(group: String)

    /**
     * @param roleArn The Amazon resource name (ARN) of the role assumed by the service to tag and
     * untag resources on your behalf. 
     */
    public fun roleArn(roleArn: String)

    /**
     * @param tagKey The tag key. 
     */
    public fun tagKey(tagKey: String)

    /**
     * @param tagValue The tag value. 
     */
    public fun tagValue(tagValue: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.resourcegroups.CfnTagSyncTaskProps.Builder =
        software.amazon.awscdk.services.resourcegroups.CfnTagSyncTaskProps.builder()

    /**
     * @param group The Amazon resource name (ARN) or name of the application group for which you
     * want to create a tag-sync task. 
     */
    override fun group(group: String) {
      cdkBuilder.group(group)
    }

    /**
     * @param roleArn The Amazon resource name (ARN) of the role assumed by the service to tag and
     * untag resources on your behalf. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param tagKey The tag key. 
     */
    override fun tagKey(tagKey: String) {
      cdkBuilder.tagKey(tagKey)
    }

    /**
     * @param tagValue The tag value. 
     */
    override fun tagValue(tagValue: String) {
      cdkBuilder.tagValue(tagValue)
    }

    public fun build(): software.amazon.awscdk.services.resourcegroups.CfnTagSyncTaskProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.resourcegroups.CfnTagSyncTaskProps,
  ) : CdkObject(cdkObject),
      CfnTagSyncTaskProps {
    /**
     * The Amazon resource name (ARN) or name of the application group for which you want to create
     * a tag-sync task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourcegroups-tagsynctask.html#cfn-resourcegroups-tagsynctask-group)
     */
    override fun group(): String = unwrap(this).getGroup()

    /**
     * The Amazon resource name (ARN) of the role assumed by the service to tag and untag resources
     * on your behalf.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourcegroups-tagsynctask.html#cfn-resourcegroups-tagsynctask-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * The tag key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourcegroups-tagsynctask.html#cfn-resourcegroups-tagsynctask-tagkey)
     */
    override fun tagKey(): String = unwrap(this).getTagKey()

    /**
     * The tag value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourcegroups-tagsynctask.html#cfn-resourcegroups-tagsynctask-tagvalue)
     */
    override fun tagValue(): String = unwrap(this).getTagValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTagSyncTaskProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.resourcegroups.CfnTagSyncTaskProps):
        CfnTagSyncTaskProps = CdkObjectWrappers.wrap(cdkObject) as? CfnTagSyncTaskProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTagSyncTaskProps):
        software.amazon.awscdk.services.resourcegroups.CfnTagSyncTaskProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.resourcegroups.CfnTagSyncTaskProps
  }
}
