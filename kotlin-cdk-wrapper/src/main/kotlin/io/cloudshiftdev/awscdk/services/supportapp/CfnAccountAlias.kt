@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.supportapp

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * You can use the `AWS::SupportApp::AccountAlias` resource to specify your AWS account when you
 * configure the AWS Support App in Slack.
 *
 * Your alias name appears on the AWS Support App page in the Support Center Console and in messages
 * from the AWS Support App. You can use this alias to identify the account you've configured with the
 * AWS Support App .
 *
 * For more information, see [AWS Support App in
 * Slack](https://docs.aws.amazon.com/awssupport/latest/user/aws-support-app-for-slack.html) in the
 * *AWS Support User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.supportapp.*;
 * CfnAccountAlias cfnAccountAlias = CfnAccountAlias.Builder.create(this, "MyCfnAccountAlias")
 * .accountAlias("accountAlias")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-accountalias.html)
 */
public open class CfnAccountAlias(
  cdkObject: software.amazon.awscdk.services.supportapp.CfnAccountAlias,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAccountAliasProps,
  ) :
      this(software.amazon.awscdk.services.supportapp.CfnAccountAlias(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnAccountAliasProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAccountAliasProps.Builder.() -> Unit,
  ) : this(scope, id, CfnAccountAliasProps(props)
  )

  /**
   * An alias or short name for an AWS account .
   */
  public open fun accountAlias(): String = unwrap(this).getAccountAlias()

  /**
   * An alias or short name for an AWS account .
   */
  public open fun accountAlias(`value`: String) {
    unwrap(this).setAccountAlias(`value`)
  }

  /**
   * The `AccountAlias` resource type has an attribute `AccountAliasResourceId` . You can use this
   * attribute to identify the resource.
   *
   * The `AccountAliasResourceId` will be `AccountAlias_for_accountId` . In this example,
   * `AccountAlias_for_` is the prefix and `accountId` is your AWS account number, such as
   * `AccountAlias_for_123456789012` .
   */
  public open fun attrAccountAliasResourceId(): String =
      unwrap(this).getAttrAccountAliasResourceId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.supportapp.CfnAccountAlias].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An alias or short name for an AWS account .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-accountalias.html#cfn-supportapp-accountalias-accountalias)
     * @param accountAlias An alias or short name for an AWS account . 
     */
    public fun accountAlias(accountAlias: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.supportapp.CfnAccountAlias.Builder =
        software.amazon.awscdk.services.supportapp.CfnAccountAlias.Builder.create(scope, id)

    /**
     * An alias or short name for an AWS account .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-accountalias.html#cfn-supportapp-accountalias-accountalias)
     * @param accountAlias An alias or short name for an AWS account . 
     */
    override fun accountAlias(accountAlias: String) {
      cdkBuilder.accountAlias(accountAlias)
    }

    public fun build(): software.amazon.awscdk.services.supportapp.CfnAccountAlias =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.supportapp.CfnAccountAlias.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAccountAlias {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAccountAlias(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.supportapp.CfnAccountAlias):
        CfnAccountAlias = CfnAccountAlias(cdkObject)

    internal fun unwrap(wrapped: CfnAccountAlias):
        software.amazon.awscdk.services.supportapp.CfnAccountAlias = wrapped.cdkObject as
        software.amazon.awscdk.services.supportapp.CfnAccountAlias
  }
}
