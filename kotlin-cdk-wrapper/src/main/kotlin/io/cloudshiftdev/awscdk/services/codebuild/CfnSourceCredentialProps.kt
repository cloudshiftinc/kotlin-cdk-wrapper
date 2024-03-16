@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnSourceCredential`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codebuild.*;
 * CfnSourceCredentialProps cfnSourceCredentialProps = CfnSourceCredentialProps.builder()
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
public interface CfnSourceCredentialProps {
  /**
   * The type of authentication used by the credentials.
   *
   * Valid options are OAUTH, BASIC_AUTH, or PERSONAL_ACCESS_TOKEN.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-sourcecredential.html#cfn-codebuild-sourcecredential-authtype)
   */
  public fun authType(): String

  /**
   * The type of source provider.
   *
   * The valid options are GITHUB, GITHUB_ENTERPRISE, or BITBUCKET.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-sourcecredential.html#cfn-codebuild-sourcecredential-servertype)
   */
  public fun serverType(): String

  /**
   * For GitHub or GitHub Enterprise, this is the personal access token.
   *
   * For Bitbucket, this is the app password.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-sourcecredential.html#cfn-codebuild-sourcecredential-token)
   */
  public fun token(): String

  /**
   * The Bitbucket username when the `authType` is BASIC_AUTH.
   *
   * This parameter is not valid for other types of source providers or connections.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-sourcecredential.html#cfn-codebuild-sourcecredential-username)
   */
  public fun username(): String? = unwrap(this).getUsername()

  /**
   * A builder for [CfnSourceCredentialProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authType The type of authentication used by the credentials. 
     * Valid options are OAUTH, BASIC_AUTH, or PERSONAL_ACCESS_TOKEN.
     */
    public fun authType(authType: String)

    /**
     * @param serverType The type of source provider. 
     * The valid options are GITHUB, GITHUB_ENTERPRISE, or BITBUCKET.
     */
    public fun serverType(serverType: String)

    /**
     * @param token For GitHub or GitHub Enterprise, this is the personal access token. 
     * For Bitbucket, this is the app password.
     */
    public fun token(token: String)

    /**
     * @param username The Bitbucket username when the `authType` is BASIC_AUTH.
     * This parameter is not valid for other types of source providers or connections.
     */
    public fun username(username: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codebuild.CfnSourceCredentialProps.Builder =
        software.amazon.awscdk.services.codebuild.CfnSourceCredentialProps.builder()

    /**
     * @param authType The type of authentication used by the credentials. 
     * Valid options are OAUTH, BASIC_AUTH, or PERSONAL_ACCESS_TOKEN.
     */
    override fun authType(authType: String) {
      cdkBuilder.authType(authType)
    }

    /**
     * @param serverType The type of source provider. 
     * The valid options are GITHUB, GITHUB_ENTERPRISE, or BITBUCKET.
     */
    override fun serverType(serverType: String) {
      cdkBuilder.serverType(serverType)
    }

    /**
     * @param token For GitHub or GitHub Enterprise, this is the personal access token. 
     * For Bitbucket, this is the app password.
     */
    override fun token(token: String) {
      cdkBuilder.token(token)
    }

    /**
     * @param username The Bitbucket username when the `authType` is BASIC_AUTH.
     * This parameter is not valid for other types of source providers or connections.
     */
    override fun username(username: String) {
      cdkBuilder.username(username)
    }

    public fun build(): software.amazon.awscdk.services.codebuild.CfnSourceCredentialProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codebuild.CfnSourceCredentialProps,
  ) : CdkObject(cdkObject), CfnSourceCredentialProps {
    /**
     * The type of authentication used by the credentials.
     *
     * Valid options are OAUTH, BASIC_AUTH, or PERSONAL_ACCESS_TOKEN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-sourcecredential.html#cfn-codebuild-sourcecredential-authtype)
     */
    override fun authType(): String = unwrap(this).getAuthType()

    /**
     * The type of source provider.
     *
     * The valid options are GITHUB, GITHUB_ENTERPRISE, or BITBUCKET.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-sourcecredential.html#cfn-codebuild-sourcecredential-servertype)
     */
    override fun serverType(): String = unwrap(this).getServerType()

    /**
     * For GitHub or GitHub Enterprise, this is the personal access token.
     *
     * For Bitbucket, this is the app password.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-sourcecredential.html#cfn-codebuild-sourcecredential-token)
     */
    override fun token(): String = unwrap(this).getToken()

    /**
     * The Bitbucket username when the `authType` is BASIC_AUTH.
     *
     * This parameter is not valid for other types of source providers or connections.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-sourcecredential.html#cfn-codebuild-sourcecredential-username)
     */
    override fun username(): String? = unwrap(this).getUsername()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSourceCredentialProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnSourceCredentialProps):
        CfnSourceCredentialProps = CdkObjectWrappers.wrap(cdkObject) as CfnSourceCredentialProps

    internal fun unwrap(wrapped: CfnSourceCredentialProps):
        software.amazon.awscdk.services.codebuild.CfnSourceCredentialProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.CfnSourceCredentialProps
  }
}
