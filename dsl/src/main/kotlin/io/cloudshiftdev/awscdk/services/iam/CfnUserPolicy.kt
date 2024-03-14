package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnUserPolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iam.CfnUserPolicy,
) : CfnResource(cdkObject), IInspectable {
  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The policy document.
   */
  public open fun policyDocument(): Any? = unwrap(this).getPolicyDocument()

  /**
   * The policy document.
   */
  public open fun policyDocument(`value`: Any) {
    unwrap(this).setPolicyDocument(`value`)
  }

  /**
   * The name of the policy document.
   */
  public open fun policyName(): String = unwrap(this).getPolicyName()

  /**
   * The name of the policy document.
   */
  public open fun policyName(`value`: String) {
    unwrap(this).setPolicyName(`value`)
  }

  /**
   * The name of the user to associate the policy with.
   */
  public open fun userName(): String = unwrap(this).getUserName()

  /**
   * The name of the user to associate the policy with.
   */
  public open fun userName(`value`: String) {
    unwrap(this).setUserName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iam.CfnUserPolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The policy document.
     *
     * You must provide policies in JSON format in IAM. However, for AWS CloudFormation templates
     * formatted in YAML, you can provide the policy in JSON or YAML format. AWS CloudFormation always
     * converts a YAML policy to JSON format before submitting it to IAM.
     *
     * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) used to
     * validate this parameter is a string of characters consisting of the following:
     *
     * * Any printable ASCII character ranging from the space character ( `\u0020` ) through the end
     * of the ASCII character range
     * * The printable characters in the Basic Latin and Latin-1 Supplement character set (through
     * `\u00FF` )
     * * The special characters tab ( `\u0009` ), line feed ( `\u000A` ), and carriage return (
     * `\u000D` )
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-userpolicy.html#cfn-iam-userpolicy-policydocument)
     * @param policyDocument The policy document. 
     */
    public fun policyDocument(policyDocument: Any)

    /**
     * The name of the policy document.
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-userpolicy.html#cfn-iam-userpolicy-policyname)
     * @param policyName The name of the policy document. 
     */
    public fun policyName(policyName: String)

    /**
     * The name of the user to associate the policy with.
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-userpolicy.html#cfn-iam-userpolicy-username)
     * @param userName The name of the user to associate the policy with. 
     */
    public fun userName(userName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnUserPolicy.Builder =
        software.amazon.awscdk.services.iam.CfnUserPolicy.Builder.create(scope, id)

    /**
     * The policy document.
     *
     * You must provide policies in JSON format in IAM. However, for AWS CloudFormation templates
     * formatted in YAML, you can provide the policy in JSON or YAML format. AWS CloudFormation always
     * converts a YAML policy to JSON format before submitting it to IAM.
     *
     * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) used to
     * validate this parameter is a string of characters consisting of the following:
     *
     * * Any printable ASCII character ranging from the space character ( `\u0020` ) through the end
     * of the ASCII character range
     * * The printable characters in the Basic Latin and Latin-1 Supplement character set (through
     * `\u00FF` )
     * * The special characters tab ( `\u0009` ), line feed ( `\u000A` ), and carriage return (
     * `\u000D` )
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-userpolicy.html#cfn-iam-userpolicy-policydocument)
     * @param policyDocument The policy document. 
     */
    override fun policyDocument(policyDocument: Any) {
      cdkBuilder.policyDocument(policyDocument)
    }

    /**
     * The name of the policy document.
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-userpolicy.html#cfn-iam-userpolicy-policyname)
     * @param policyName The name of the policy document. 
     */
    override fun policyName(policyName: String) {
      cdkBuilder.policyName(policyName)
    }

    /**
     * The name of the user to associate the policy with.
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-userpolicy.html#cfn-iam-userpolicy-username)
     * @param userName The name of the user to associate the policy with. 
     */
    override fun userName(userName: String) {
      cdkBuilder.userName(userName)
    }

    public fun build(): software.amazon.awscdk.services.iam.CfnUserPolicy = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnUserPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnUserPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnUserPolicy): CfnUserPolicy =
        CfnUserPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnUserPolicy): software.amazon.awscdk.services.iam.CfnUserPolicy =
        wrapped.cdkObject
  }
}
