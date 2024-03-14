package io.cloudshiftdev.awscdk.services.proton

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnEnvironmentAccountConnectionProps {
  /**
   * The Amazon Resource Name (ARN) of an IAM service role in the environment account.
   *
   * AWS Proton uses this role to provision infrastructure resources using CodeBuild-based
   * provisioning in the associated environment account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmentaccountconnection.html#cfn-proton-environmentaccountconnection-codebuildrolearn)
   */
  public fun codebuildRoleArn(): String? = unwrap(this).getCodebuildRoleArn()

  /**
   * The Amazon Resource Name (ARN) of the IAM service role that AWS Proton uses when provisioning
   * directly defined components in the associated environment account.
   *
   * It determines the scope of infrastructure that a component can provision in the account.
   *
   * The environment account connection must have a `componentRoleArn` to allow directly defined
   * components to be associated with any environments running in the account.
   *
   * For more information about components, see [AWS Proton
   * components](https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html) in the *AWS
   * Proton User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmentaccountconnection.html#cfn-proton-environmentaccountconnection-componentrolearn)
   */
  public fun componentRoleArn(): String? = unwrap(this).getComponentRoleArn()

  /**
   * The environment account that's connected to the environment account connection.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmentaccountconnection.html#cfn-proton-environmentaccountconnection-environmentaccountid)
   */
  public fun environmentAccountId(): String? = unwrap(this).getEnvironmentAccountId()

  /**
   * The name of the environment that's associated with the environment account connection.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmentaccountconnection.html#cfn-proton-environmentaccountconnection-environmentname)
   */
  public fun environmentName(): String? = unwrap(this).getEnvironmentName()

  /**
   * The ID of the management account that's connected to the environment account connection.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmentaccountconnection.html#cfn-proton-environmentaccountconnection-managementaccountid)
   */
  public fun managementAccountId(): String? = unwrap(this).getManagementAccountId()

  /**
   * The IAM service role that's associated with the environment account connection.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmentaccountconnection.html#cfn-proton-environmentaccountconnection-rolearn)
   */
  public fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * An optional list of metadata items that you can associate with the AWS Proton environment
   * account connection.
   *
   * A tag is a key-value pair.
   *
   * For more information, see [AWS Proton resources and
   * tagging](https://docs.aws.amazon.com/proton/latest/userguide/resources.html) in the *AWS Proton
   * User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmentaccountconnection.html#cfn-proton-environmentaccountconnection-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnEnvironmentAccountConnectionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param codebuildRoleArn The Amazon Resource Name (ARN) of an IAM service role in the
     * environment account.
     * AWS Proton uses this role to provision infrastructure resources using CodeBuild-based
     * provisioning in the associated environment account.
     */
    public fun codebuildRoleArn(codebuildRoleArn: String)

    /**
     * @param componentRoleArn The Amazon Resource Name (ARN) of the IAM service role that AWS
     * Proton uses when provisioning directly defined components in the associated environment account.
     * It determines the scope of infrastructure that a component can provision in the account.
     *
     * The environment account connection must have a `componentRoleArn` to allow directly defined
     * components to be associated with any environments running in the account.
     *
     * For more information about components, see [AWS Proton
     * components](https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html) in the *AWS
     * Proton User Guide* .
     */
    public fun componentRoleArn(componentRoleArn: String)

    /**
     * @param environmentAccountId The environment account that's connected to the environment
     * account connection.
     */
    public fun environmentAccountId(environmentAccountId: String)

    /**
     * @param environmentName The name of the environment that's associated with the environment
     * account connection.
     */
    public fun environmentName(environmentName: String)

    /**
     * @param managementAccountId The ID of the management account that's connected to the
     * environment account connection.
     */
    public fun managementAccountId(managementAccountId: String)

    /**
     * @param roleArn The IAM service role that's associated with the environment account
     * connection.
     */
    public fun roleArn(roleArn: String)

    /**
     * @param tags An optional list of metadata items that you can associate with the AWS Proton
     * environment account connection.
     * A tag is a key-value pair.
     *
     * For more information, see [AWS Proton resources and
     * tagging](https://docs.aws.amazon.com/proton/latest/userguide/resources.html) in the *AWS Proton
     * User Guide* .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An optional list of metadata items that you can associate with the AWS Proton
     * environment account connection.
     * A tag is a key-value pair.
     *
     * For more information, see [AWS Proton resources and
     * tagging](https://docs.aws.amazon.com/proton/latest/userguide/resources.html) in the *AWS Proton
     * User Guide* .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.proton.CfnEnvironmentAccountConnectionProps.Builder =
        software.amazon.awscdk.services.proton.CfnEnvironmentAccountConnectionProps.builder()

    /**
     * @param codebuildRoleArn The Amazon Resource Name (ARN) of an IAM service role in the
     * environment account.
     * AWS Proton uses this role to provision infrastructure resources using CodeBuild-based
     * provisioning in the associated environment account.
     */
    override fun codebuildRoleArn(codebuildRoleArn: String) {
      cdkBuilder.codebuildRoleArn(codebuildRoleArn)
    }

    /**
     * @param componentRoleArn The Amazon Resource Name (ARN) of the IAM service role that AWS
     * Proton uses when provisioning directly defined components in the associated environment account.
     * It determines the scope of infrastructure that a component can provision in the account.
     *
     * The environment account connection must have a `componentRoleArn` to allow directly defined
     * components to be associated with any environments running in the account.
     *
     * For more information about components, see [AWS Proton
     * components](https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html) in the *AWS
     * Proton User Guide* .
     */
    override fun componentRoleArn(componentRoleArn: String) {
      cdkBuilder.componentRoleArn(componentRoleArn)
    }

    /**
     * @param environmentAccountId The environment account that's connected to the environment
     * account connection.
     */
    override fun environmentAccountId(environmentAccountId: String) {
      cdkBuilder.environmentAccountId(environmentAccountId)
    }

    /**
     * @param environmentName The name of the environment that's associated with the environment
     * account connection.
     */
    override fun environmentName(environmentName: String) {
      cdkBuilder.environmentName(environmentName)
    }

    /**
     * @param managementAccountId The ID of the management account that's connected to the
     * environment account connection.
     */
    override fun managementAccountId(managementAccountId: String) {
      cdkBuilder.managementAccountId(managementAccountId)
    }

    /**
     * @param roleArn The IAM service role that's associated with the environment account
     * connection.
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param tags An optional list of metadata items that you can associate with the AWS Proton
     * environment account connection.
     * A tag is a key-value pair.
     *
     * For more information, see [AWS Proton resources and
     * tagging](https://docs.aws.amazon.com/proton/latest/userguide/resources.html) in the *AWS Proton
     * User Guide* .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An optional list of metadata items that you can associate with the AWS Proton
     * environment account connection.
     * A tag is a key-value pair.
     *
     * For more information, see [AWS Proton resources and
     * tagging](https://docs.aws.amazon.com/proton/latest/userguide/resources.html) in the *AWS Proton
     * User Guide* .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.proton.CfnEnvironmentAccountConnectionProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.proton.CfnEnvironmentAccountConnectionProps,
  ) : CdkObject(cdkObject), CfnEnvironmentAccountConnectionProps {
    /**
     * The Amazon Resource Name (ARN) of an IAM service role in the environment account.
     *
     * AWS Proton uses this role to provision infrastructure resources using CodeBuild-based
     * provisioning in the associated environment account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmentaccountconnection.html#cfn-proton-environmentaccountconnection-codebuildrolearn)
     */
    override fun codebuildRoleArn(): String? = unwrap(this).getCodebuildRoleArn()

    /**
     * The Amazon Resource Name (ARN) of the IAM service role that AWS Proton uses when provisioning
     * directly defined components in the associated environment account.
     *
     * It determines the scope of infrastructure that a component can provision in the account.
     *
     * The environment account connection must have a `componentRoleArn` to allow directly defined
     * components to be associated with any environments running in the account.
     *
     * For more information about components, see [AWS Proton
     * components](https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html) in the *AWS
     * Proton User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmentaccountconnection.html#cfn-proton-environmentaccountconnection-componentrolearn)
     */
    override fun componentRoleArn(): String? = unwrap(this).getComponentRoleArn()

    /**
     * The environment account that's connected to the environment account connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmentaccountconnection.html#cfn-proton-environmentaccountconnection-environmentaccountid)
     */
    override fun environmentAccountId(): String? = unwrap(this).getEnvironmentAccountId()

    /**
     * The name of the environment that's associated with the environment account connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmentaccountconnection.html#cfn-proton-environmentaccountconnection-environmentname)
     */
    override fun environmentName(): String? = unwrap(this).getEnvironmentName()

    /**
     * The ID of the management account that's connected to the environment account connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmentaccountconnection.html#cfn-proton-environmentaccountconnection-managementaccountid)
     */
    override fun managementAccountId(): String? = unwrap(this).getManagementAccountId()

    /**
     * The IAM service role that's associated with the environment account connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmentaccountconnection.html#cfn-proton-environmentaccountconnection-rolearn)
     */
    override fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * An optional list of metadata items that you can associate with the AWS Proton environment
     * account connection.
     *
     * A tag is a key-value pair.
     *
     * For more information, see [AWS Proton resources and
     * tagging](https://docs.aws.amazon.com/proton/latest/userguide/resources.html) in the *AWS Proton
     * User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmentaccountconnection.html#cfn-proton-environmentaccountconnection-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnEnvironmentAccountConnectionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.proton.CfnEnvironmentAccountConnectionProps):
        CfnEnvironmentAccountConnectionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEnvironmentAccountConnectionProps):
        software.amazon.awscdk.services.proton.CfnEnvironmentAccountConnectionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.proton.CfnEnvironmentAccountConnectionProps
  }
}
