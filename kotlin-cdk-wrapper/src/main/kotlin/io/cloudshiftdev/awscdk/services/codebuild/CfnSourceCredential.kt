@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Information about the credentials for a GitHub, GitHub Enterprise, or Bitbucket repository.
 *
 * We strongly recommend that you use AWS Secrets Manager to store your credentials. If you use
 * Secrets Manager , you must have secrets in your secrets manager. For more information, see [Using
 * Dynamic References to Specify Template
 * Values](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html#dynamic-references-secretsmanager)
 * .
 *
 *
 * For security purposes, do not use plain text in your AWS CloudFormation template to store your
 * credentials.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codebuild.*;
 * CfnSourceCredential cfnSourceCredential = CfnSourceCredential.Builder.create(this,
 * "MyCfnSourceCredential")
 * .authType("authType")
 * .serverType("serverType")
 * .token("token")
 * // the properties below are optional
 * .username("username")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-sourcecredential.html)
 */
public open class CfnSourceCredential internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codebuild.CfnSourceCredential,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSourceCredentialProps,
  ) :
      this(software.amazon.awscdk.services.codebuild.CfnSourceCredential(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnSourceCredentialProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSourceCredentialProps.Builder.() -> Unit,
  ) : this(scope, id, CfnSourceCredentialProps(props)
  )

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The type of authentication used by the credentials.
   */
  public open fun authType(): String = unwrap(this).getAuthType()

  /**
   * The type of authentication used by the credentials.
   */
  public open fun authType(`value`: String) {
    unwrap(this).setAuthType(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The type of source provider.
   */
  public open fun serverType(): String = unwrap(this).getServerType()

  /**
   * The type of source provider.
   */
  public open fun serverType(`value`: String) {
    unwrap(this).setServerType(`value`)
  }

  /**
   * For GitHub or GitHub Enterprise, this is the personal access token.
   */
  public open fun token(): String = unwrap(this).getToken()

  /**
   * For GitHub or GitHub Enterprise, this is the personal access token.
   */
  public open fun token(`value`: String) {
    unwrap(this).setToken(`value`)
  }

  /**
   * The Bitbucket username when the `authType` is BASIC_AUTH.
   */
  public open fun username(): String? = unwrap(this).getUsername()

  /**
   * The Bitbucket username when the `authType` is BASIC_AUTH.
   */
  public open fun username(`value`: String) {
    unwrap(this).setUsername(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codebuild.CfnSourceCredential].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The type of authentication used by the credentials.
     *
     * Valid options are OAUTH, BASIC_AUTH, or PERSONAL_ACCESS_TOKEN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-sourcecredential.html#cfn-codebuild-sourcecredential-authtype)
     * @param authType The type of authentication used by the credentials. 
     */
    public fun authType(authType: String)

    /**
     * The type of source provider.
     *
     * The valid options are GITHUB, GITHUB_ENTERPRISE, or BITBUCKET.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-sourcecredential.html#cfn-codebuild-sourcecredential-servertype)
     * @param serverType The type of source provider. 
     */
    public fun serverType(serverType: String)

    /**
     * For GitHub or GitHub Enterprise, this is the personal access token.
     *
     * For Bitbucket, this is the app password.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-sourcecredential.html#cfn-codebuild-sourcecredential-token)
     * @param token For GitHub or GitHub Enterprise, this is the personal access token. 
     */
    public fun token(token: String)

    /**
     * The Bitbucket username when the `authType` is BASIC_AUTH.
     *
     * This parameter is not valid for other types of source providers or connections.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-sourcecredential.html#cfn-codebuild-sourcecredential-username)
     * @param username The Bitbucket username when the `authType` is BASIC_AUTH. 
     */
    public fun username(username: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.CfnSourceCredential.Builder =
        software.amazon.awscdk.services.codebuild.CfnSourceCredential.Builder.create(scope, id)

    /**
     * The type of authentication used by the credentials.
     *
     * Valid options are OAUTH, BASIC_AUTH, or PERSONAL_ACCESS_TOKEN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-sourcecredential.html#cfn-codebuild-sourcecredential-authtype)
     * @param authType The type of authentication used by the credentials. 
     */
    override fun authType(authType: String) {
      cdkBuilder.authType(authType)
    }

    /**
     * The type of source provider.
     *
     * The valid options are GITHUB, GITHUB_ENTERPRISE, or BITBUCKET.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-sourcecredential.html#cfn-codebuild-sourcecredential-servertype)
     * @param serverType The type of source provider. 
     */
    override fun serverType(serverType: String) {
      cdkBuilder.serverType(serverType)
    }

    /**
     * For GitHub or GitHub Enterprise, this is the personal access token.
     *
     * For Bitbucket, this is the app password.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-sourcecredential.html#cfn-codebuild-sourcecredential-token)
     * @param token For GitHub or GitHub Enterprise, this is the personal access token. 
     */
    override fun token(token: String) {
      cdkBuilder.token(token)
    }

    /**
     * The Bitbucket username when the `authType` is BASIC_AUTH.
     *
     * This parameter is not valid for other types of source providers or connections.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-sourcecredential.html#cfn-codebuild-sourcecredential-username)
     * @param username The Bitbucket username when the `authType` is BASIC_AUTH. 
     */
    override fun username(username: String) {
      cdkBuilder.username(username)
    }

    public fun build(): software.amazon.awscdk.services.codebuild.CfnSourceCredential =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.codebuild.CfnSourceCredential.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSourceCredential {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSourceCredential(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnSourceCredential):
        CfnSourceCredential = CfnSourceCredential(cdkObject)

    internal fun unwrap(wrapped: CfnSourceCredential):
        software.amazon.awscdk.services.codebuild.CfnSourceCredential = wrapped.cdkObject
  }
}
