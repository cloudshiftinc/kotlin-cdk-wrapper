@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Adds a user to a group.
 *
 * A user who is in a group can present a preferred-role claim to an identity pool, and populates a
 * `cognito:groups` claim to their access and identity tokens.
 *
 *
 * Amazon Cognito evaluates AWS Identity and Access Management (IAM) policies in requests for this
 * API operation. For this operation, you must use IAM credentials to authorize requests, and you must
 * grant yourself the corresponding IAM permission in a policy.
 *
 * **Learn more** - [Signing AWS API
 * Requests](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html)
 *
 * * [Using the Amazon Cognito user pools API and user pool
 * endpoints](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html)
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cognito.*;
 * CfnUserPoolUserToGroupAttachment cfnUserPoolUserToGroupAttachment =
 * CfnUserPoolUserToGroupAttachment.Builder.create(this, "MyCfnUserPoolUserToGroupAttachment")
 * .groupName("groupName")
 * .username("username")
 * .userPoolId("userPoolId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolusertogroupattachment.html)
 */
public open class CfnUserPoolUserToGroupAttachment(
  cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachment,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnUserPoolUserToGroupAttachmentProps,
  ) :
      this(software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachment(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnUserPoolUserToGroupAttachmentProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnUserPoolUserToGroupAttachmentProps.Builder.() -> Unit,
  ) : this(scope, id, CfnUserPoolUserToGroupAttachmentProps(props)
  )

  /**
   * The name of the group that you want to add your user to.
   */
  public open fun groupName(): String = unwrap(this).getGroupName()

  /**
   * The name of the group that you want to add your user to.
   */
  public open fun groupName(`value`: String) {
    unwrap(this).setGroupName(`value`)
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
   * The user pool ID for the user pool.
   */
  public open fun userPoolId(): String = unwrap(this).getUserPoolId()

  /**
   * The user pool ID for the user pool.
   */
  public open fun userPoolId(`value`: String) {
    unwrap(this).setUserPoolId(`value`)
  }

  /**
   * The user's username.
   */
  public open fun username(): String = unwrap(this).getUsername()

  /**
   * The user's username.
   */
  public open fun username(`value`: String) {
    unwrap(this).setUsername(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.cognito.CfnUserPoolUserToGroupAttachment].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the group that you want to add your user to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolusertogroupattachment.html#cfn-cognito-userpoolusertogroupattachment-groupname)
     * @param groupName The name of the group that you want to add your user to. 
     */
    public fun groupName(groupName: String)

    /**
     * The user pool ID for the user pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolusertogroupattachment.html#cfn-cognito-userpoolusertogroupattachment-userpoolid)
     * @param userPoolId The user pool ID for the user pool. 
     */
    public fun userPoolId(userPoolId: String)

    /**
     * The user's username.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolusertogroupattachment.html#cfn-cognito-userpoolusertogroupattachment-username)
     * @param username The user's username. 
     */
    public fun username(username: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachment.Builder =
        software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachment.Builder.create(scope,
        id)

    /**
     * The name of the group that you want to add your user to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolusertogroupattachment.html#cfn-cognito-userpoolusertogroupattachment-groupname)
     * @param groupName The name of the group that you want to add your user to. 
     */
    override fun groupName(groupName: String) {
      cdkBuilder.groupName(groupName)
    }

    /**
     * The user pool ID for the user pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolusertogroupattachment.html#cfn-cognito-userpoolusertogroupattachment-userpoolid)
     * @param userPoolId The user pool ID for the user pool. 
     */
    override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    /**
     * The user's username.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolusertogroupattachment.html#cfn-cognito-userpoolusertogroupattachment-username)
     * @param username The user's username. 
     */
    override fun username(username: String) {
      cdkBuilder.username(username)
    }

    public fun build(): software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachment =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachment.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnUserPoolUserToGroupAttachment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnUserPoolUserToGroupAttachment(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachment):
        CfnUserPoolUserToGroupAttachment = CfnUserPoolUserToGroupAttachment(cdkObject)

    internal fun unwrap(wrapped: CfnUserPoolUserToGroupAttachment):
        software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachment = wrapped.cdkObject
        as software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachment
  }
}
