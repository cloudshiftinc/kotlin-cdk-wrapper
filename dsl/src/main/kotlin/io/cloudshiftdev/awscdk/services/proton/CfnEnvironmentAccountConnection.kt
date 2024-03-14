package io.cloudshiftdev.awscdk.services.proton

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnEnvironmentAccountConnection internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.proton.CfnEnvironmentAccountConnection,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * Returns the environment account connection ARN.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Returns the environment account connection ID.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Returns the environment account connection status.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The Amazon Resource Name (ARN) of an IAM service role in the environment account.
   */
  public open fun codebuildRoleArn(): String? = unwrap(this).getCodebuildRoleArn()

  /**
   * The Amazon Resource Name (ARN) of an IAM service role in the environment account.
   */
  public open fun codebuildRoleArn(`value`: String) {
    unwrap(this).setCodebuildRoleArn(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the IAM service role that AWS Proton uses when provisioning
   * directly defined components in the associated environment account.
   */
  public open fun componentRoleArn(): String? = unwrap(this).getComponentRoleArn()

  /**
   * The Amazon Resource Name (ARN) of the IAM service role that AWS Proton uses when provisioning
   * directly defined components in the associated environment account.
   */
  public open fun componentRoleArn(`value`: String) {
    unwrap(this).setComponentRoleArn(`value`)
  }

  /**
   * The environment account that's connected to the environment account connection.
   */
  public open fun environmentAccountId(): String? = unwrap(this).getEnvironmentAccountId()

  /**
   * The environment account that's connected to the environment account connection.
   */
  public open fun environmentAccountId(`value`: String) {
    unwrap(this).setEnvironmentAccountId(`value`)
  }

  /**
   * The name of the environment that's associated with the environment account connection.
   */
  public open fun environmentName(): String? = unwrap(this).getEnvironmentName()

  /**
   * The name of the environment that's associated with the environment account connection.
   */
  public open fun environmentName(`value`: String) {
    unwrap(this).setEnvironmentName(`value`)
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
   * The ID of the management account that's connected to the environment account connection.
   */
  public open fun managementAccountId(): String? = unwrap(this).getManagementAccountId()

  /**
   * The ID of the management account that's connected to the environment account connection.
   */
  public open fun managementAccountId(`value`: String) {
    unwrap(this).setManagementAccountId(`value`)
  }

  /**
   * The IAM service role that's associated with the environment account connection.
   */
  public open fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * The IAM service role that's associated with the environment account connection.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An optional list of metadata items that you can associate with the AWS Proton environment
   * account connection.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An optional list of metadata items that you can associate with the AWS Proton environment
   * account connection.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An optional list of metadata items that you can associate with the AWS Proton environment
   * account connection.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.proton.CfnEnvironmentAccountConnection].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) of an IAM service role in the environment account.
     *
     * AWS Proton uses this role to provision infrastructure resources using CodeBuild-based
     * provisioning in the associated environment account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmentaccountconnection.html#cfn-proton-environmentaccountconnection-codebuildrolearn)
     * @param codebuildRoleArn The Amazon Resource Name (ARN) of an IAM service role in the
     * environment account. 
     */
    public fun codebuildRoleArn(codebuildRoleArn: String)

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
     * @param componentRoleArn The Amazon Resource Name (ARN) of the IAM service role that AWS
     * Proton uses when provisioning directly defined components in the associated environment account.
     * 
     */
    public fun componentRoleArn(componentRoleArn: String)

    /**
     * The environment account that's connected to the environment account connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmentaccountconnection.html#cfn-proton-environmentaccountconnection-environmentaccountid)
     * @param environmentAccountId The environment account that's connected to the environment
     * account connection. 
     */
    public fun environmentAccountId(environmentAccountId: String)

    /**
     * The name of the environment that's associated with the environment account connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmentaccountconnection.html#cfn-proton-environmentaccountconnection-environmentname)
     * @param environmentName The name of the environment that's associated with the environment
     * account connection. 
     */
    public fun environmentName(environmentName: String)

    /**
     * The ID of the management account that's connected to the environment account connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmentaccountconnection.html#cfn-proton-environmentaccountconnection-managementaccountid)
     * @param managementAccountId The ID of the management account that's connected to the
     * environment account connection. 
     */
    public fun managementAccountId(managementAccountId: String)

    /**
     * The IAM service role that's associated with the environment account connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmentaccountconnection.html#cfn-proton-environmentaccountconnection-rolearn)
     * @param roleArn The IAM service role that's associated with the environment account
     * connection. 
     */
    public fun roleArn(roleArn: String)

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
     * @param tags An optional list of metadata items that you can associate with the AWS Proton
     * environment account connection. 
     */
    public fun tags(tags: List<CfnTag>)

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
     * @param tags An optional list of metadata items that you can associate with the AWS Proton
     * environment account connection. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.proton.CfnEnvironmentAccountConnection.Builder =
        software.amazon.awscdk.services.proton.CfnEnvironmentAccountConnection.Builder.create(scope,
        id)

    /**
     * The Amazon Resource Name (ARN) of an IAM service role in the environment account.
     *
     * AWS Proton uses this role to provision infrastructure resources using CodeBuild-based
     * provisioning in the associated environment account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmentaccountconnection.html#cfn-proton-environmentaccountconnection-codebuildrolearn)
     * @param codebuildRoleArn The Amazon Resource Name (ARN) of an IAM service role in the
     * environment account. 
     */
    override fun codebuildRoleArn(codebuildRoleArn: String) {
      cdkBuilder.codebuildRoleArn(codebuildRoleArn)
    }

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
     * @param componentRoleArn The Amazon Resource Name (ARN) of the IAM service role that AWS
     * Proton uses when provisioning directly defined components in the associated environment account.
     * 
     */
    override fun componentRoleArn(componentRoleArn: String) {
      cdkBuilder.componentRoleArn(componentRoleArn)
    }

    /**
     * The environment account that's connected to the environment account connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmentaccountconnection.html#cfn-proton-environmentaccountconnection-environmentaccountid)
     * @param environmentAccountId The environment account that's connected to the environment
     * account connection. 
     */
    override fun environmentAccountId(environmentAccountId: String) {
      cdkBuilder.environmentAccountId(environmentAccountId)
    }

    /**
     * The name of the environment that's associated with the environment account connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmentaccountconnection.html#cfn-proton-environmentaccountconnection-environmentname)
     * @param environmentName The name of the environment that's associated with the environment
     * account connection. 
     */
    override fun environmentName(environmentName: String) {
      cdkBuilder.environmentName(environmentName)
    }

    /**
     * The ID of the management account that's connected to the environment account connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmentaccountconnection.html#cfn-proton-environmentaccountconnection-managementaccountid)
     * @param managementAccountId The ID of the management account that's connected to the
     * environment account connection. 
     */
    override fun managementAccountId(managementAccountId: String) {
      cdkBuilder.managementAccountId(managementAccountId)
    }

    /**
     * The IAM service role that's associated with the environment account connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmentaccountconnection.html#cfn-proton-environmentaccountconnection-rolearn)
     * @param roleArn The IAM service role that's associated with the environment account
     * connection. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

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
     * @param tags An optional list of metadata items that you can associate with the AWS Proton
     * environment account connection. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

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
     * @param tags An optional list of metadata items that you can associate with the AWS Proton
     * environment account connection. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.proton.CfnEnvironmentAccountConnection =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEnvironmentAccountConnection {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEnvironmentAccountConnection(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.proton.CfnEnvironmentAccountConnection):
        CfnEnvironmentAccountConnection = CfnEnvironmentAccountConnection(cdkObject)

    internal fun unwrap(wrapped: CfnEnvironmentAccountConnection):
        software.amazon.awscdk.services.proton.CfnEnvironmentAccountConnection = wrapped.cdkObject
  }
}
