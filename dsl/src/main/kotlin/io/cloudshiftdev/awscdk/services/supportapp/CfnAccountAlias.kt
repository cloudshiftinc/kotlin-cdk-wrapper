package io.cloudshiftdev.awscdk.services.supportapp

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAccountAlias internal constructor(
  private val cdkObject: software.amazon.awscdk.services.supportapp.CfnAccountAlias,
) : CfnResource(cdkObject), IInspectable {
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
    init {

    }

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
        software.amazon.awscdk.services.supportapp.CfnAccountAlias = wrapped.cdkObject
  }
}
