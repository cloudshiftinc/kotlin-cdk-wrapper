@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.resourcegroups

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Onboards and syncs resources tagged with a specific tag key-value pair to an application.
 *
 * *Minimum permissions*
 *
 * To run this command, you must have the following permissions:
 *
 * * `resource-groups:StartTagSyncTask`
 * * `resource-groups:CreateGroup`
 * * `iam:PassRole` for the role you provide to create a tag-sync task
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.resourcegroups.*;
 * CfnTagSyncTask cfnTagSyncTask = CfnTagSyncTask.Builder.create(this, "MyCfnTagSyncTask")
 * .group("group")
 * .roleArn("roleArn")
 * .tagKey("tagKey")
 * .tagValue("tagValue")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourcegroups-tagsynctask.html)
 */
public open class CfnTagSyncTask(
  cdkObject: software.amazon.awscdk.services.resourcegroups.CfnTagSyncTask,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTagSyncTaskProps,
  ) :
      this(software.amazon.awscdk.services.resourcegroups.CfnTagSyncTask(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnTagSyncTaskProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTagSyncTaskProps.Builder.() -> Unit,
  ) : this(scope, id, CfnTagSyncTaskProps(props)
  )

  /**
   * The Amazon resource name (ARN) of the application group.
   */
  public open fun attrGroupArn(): String = unwrap(this).getAttrGroupArn()

  /**
   * The name of the application group.
   */
  public open fun attrGroupName(): String = unwrap(this).getAttrGroupName()

  /**
   * The status of the tag-sync task.
   *
   * Valid values include:
   *
   * * `ACTIVE` - The tag-sync task is actively managing resources in the application by adding or
   * removing the `awsApplication` tag from resources when they are tagged or untagged with the
   * specified tag key-value pair.
   * * `ERROR` - The tag-sync task is not actively managing resources in the application. Review the
   * `ErrorMessage` for more information about resolving the error.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The Amazon resource name (ARN) of the tag-sync task.
   */
  public open fun attrTaskArn(): String = unwrap(this).getAttrTaskArn()

  /**
   * The Amazon resource name (ARN) or name of the application group for which you want to create a
   * tag-sync task.
   */
  public open fun group(): String = unwrap(this).getGroup()

  /**
   * The Amazon resource name (ARN) or name of the application group for which you want to create a
   * tag-sync task.
   */
  public open fun group(`value`: String) {
    unwrap(this).setGroup(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The Amazon resource name (ARN) of the role assumed by the service to tag and untag resources on
   * your behalf.
   */
  public open fun roleArn(): String = unwrap(this).getRoleArn()

  /**
   * The Amazon resource name (ARN) of the role assumed by the service to tag and untag resources on
   * your behalf.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * The tag key.
   */
  public open fun tagKey(): String = unwrap(this).getTagKey()

  /**
   * The tag key.
   */
  public open fun tagKey(`value`: String) {
    unwrap(this).setTagKey(`value`)
  }

  /**
   * The tag value.
   */
  public open fun tagValue(): String = unwrap(this).getTagValue()

  /**
   * The tag value.
   */
  public open fun tagValue(`value`: String) {
    unwrap(this).setTagValue(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.resourcegroups.CfnTagSyncTask].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon resource name (ARN) or name of the application group for which you want to create
     * a tag-sync task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourcegroups-tagsynctask.html#cfn-resourcegroups-tagsynctask-group)
     * @param group The Amazon resource name (ARN) or name of the application group for which you
     * want to create a tag-sync task. 
     */
    public fun group(group: String)

    /**
     * The Amazon resource name (ARN) of the role assumed by the service to tag and untag resources
     * on your behalf.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourcegroups-tagsynctask.html#cfn-resourcegroups-tagsynctask-rolearn)
     * @param roleArn The Amazon resource name (ARN) of the role assumed by the service to tag and
     * untag resources on your behalf. 
     */
    public fun roleArn(roleArn: String)

    /**
     * The tag key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourcegroups-tagsynctask.html#cfn-resourcegroups-tagsynctask-tagkey)
     * @param tagKey The tag key. 
     */
    public fun tagKey(tagKey: String)

    /**
     * The tag value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourcegroups-tagsynctask.html#cfn-resourcegroups-tagsynctask-tagvalue)
     * @param tagValue The tag value. 
     */
    public fun tagValue(tagValue: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.resourcegroups.CfnTagSyncTask.Builder =
        software.amazon.awscdk.services.resourcegroups.CfnTagSyncTask.Builder.create(scope, id)

    /**
     * The Amazon resource name (ARN) or name of the application group for which you want to create
     * a tag-sync task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourcegroups-tagsynctask.html#cfn-resourcegroups-tagsynctask-group)
     * @param group The Amazon resource name (ARN) or name of the application group for which you
     * want to create a tag-sync task. 
     */
    override fun group(group: String) {
      cdkBuilder.group(group)
    }

    /**
     * The Amazon resource name (ARN) of the role assumed by the service to tag and untag resources
     * on your behalf.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourcegroups-tagsynctask.html#cfn-resourcegroups-tagsynctask-rolearn)
     * @param roleArn The Amazon resource name (ARN) of the role assumed by the service to tag and
     * untag resources on your behalf. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * The tag key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourcegroups-tagsynctask.html#cfn-resourcegroups-tagsynctask-tagkey)
     * @param tagKey The tag key. 
     */
    override fun tagKey(tagKey: String) {
      cdkBuilder.tagKey(tagKey)
    }

    /**
     * The tag value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourcegroups-tagsynctask.html#cfn-resourcegroups-tagsynctask-tagvalue)
     * @param tagValue The tag value. 
     */
    override fun tagValue(tagValue: String) {
      cdkBuilder.tagValue(tagValue)
    }

    public fun build(): software.amazon.awscdk.services.resourcegroups.CfnTagSyncTask =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.resourcegroups.CfnTagSyncTask.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTagSyncTask {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTagSyncTask(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.resourcegroups.CfnTagSyncTask):
        CfnTagSyncTask = CfnTagSyncTask(cdkObject)

    internal fun unwrap(wrapped: CfnTagSyncTask):
        software.amazon.awscdk.services.resourcegroups.CfnTagSyncTask = wrapped.cdkObject as
        software.amazon.awscdk.services.resourcegroups.CfnTagSyncTask
  }
}
