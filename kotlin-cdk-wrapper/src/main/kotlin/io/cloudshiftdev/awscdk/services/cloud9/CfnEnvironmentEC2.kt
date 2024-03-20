@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloud9

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Cloud9::EnvironmentEC2` resource creates an Amazon EC2 development environment in AWS
 * Cloud9 .
 *
 * For more information, see [Creating an
 * Environment](https://docs.aws.amazon.com/cloud9/latest/user-guide/create-environment.html) in the
 * *AWS Cloud9 User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloud9.*;
 * CfnEnvironmentEC2 cfnEnvironmentEC2 = CfnEnvironmentEC2.Builder.create(this,
 * "MyCfnEnvironmentEC2")
 * .imageId("imageId")
 * .instanceType("instanceType")
 * // the properties below are optional
 * .automaticStopTimeMinutes(123)
 * .connectionType("connectionType")
 * .description("description")
 * .name("name")
 * .ownerArn("ownerArn")
 * .repositories(List.of(RepositoryProperty.builder()
 * .pathComponent("pathComponent")
 * .repositoryUrl("repositoryUrl")
 * .build()))
 * .subnetId("subnetId")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html)
 */
public open class CfnEnvironmentEC2 internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEnvironmentEC2Props,
  ) :
      this(software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnEnvironmentEC2Props::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEnvironmentEC2Props.Builder.() -> Unit,
  ) : this(scope, id, CfnEnvironmentEC2Props(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the development environment, such as
   * `arn:aws:cloud9:us-east-2:123456789012:environment:2bc3642873c342e485f7e0c561234567` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The name of the environment.
   */
  public open fun attrName(): String = unwrap(this).getAttrName()

  /**
   * The number of minutes until the running instance is shut down after the environment was last
   * used.
   */
  public open fun automaticStopTimeMinutes(): Number? = unwrap(this).getAutomaticStopTimeMinutes()

  /**
   * The number of minutes until the running instance is shut down after the environment was last
   * used.
   */
  public open fun automaticStopTimeMinutes(`value`: Number) {
    unwrap(this).setAutomaticStopTimeMinutes(`value`)
  }

  /**
   * The connection type used for connecting to an Amazon EC2 environment.
   */
  public open fun connectionType(): String? = unwrap(this).getConnectionType()

  /**
   * The connection type used for connecting to an Amazon EC2 environment.
   */
  public open fun connectionType(`value`: String) {
    unwrap(this).setConnectionType(`value`)
  }

  /**
   * The description of the environment to create.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the environment to create.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The identifier for the Amazon Machine Image (AMI) that's used to create the EC2 instance.
   */
  public open fun imageId(): String = unwrap(this).getImageId()

  /**
   * The identifier for the Amazon Machine Image (AMI) that's used to create the EC2 instance.
   */
  public open fun imageId(`value`: String) {
    unwrap(this).setImageId(`value`)
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
   * The type of instance to connect to the environment (for example, `t2.micro` ).
   */
  public open fun instanceType(): String = unwrap(this).getInstanceType()

  /**
   * The type of instance to connect to the environment (for example, `t2.micro` ).
   */
  public open fun instanceType(`value`: String) {
    unwrap(this).setInstanceType(`value`)
  }

  /**
   * The name of the environment.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the environment.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the environment owner.
   */
  public open fun ownerArn(): String? = unwrap(this).getOwnerArn()

  /**
   * The Amazon Resource Name (ARN) of the environment owner.
   */
  public open fun ownerArn(`value`: String) {
    unwrap(this).setOwnerArn(`value`)
  }

  /**
   * Any AWS CodeCommit source code repositories to be cloned into the development environment.
   */
  public open fun repositories(): Any? = unwrap(this).getRepositories()

  /**
   * Any AWS CodeCommit source code repositories to be cloned into the development environment.
   */
  public open fun repositories(`value`: IResolvable) {
    unwrap(this).setRepositories(`value`.let(IResolvable::unwrap))
  }

  /**
   * Any AWS CodeCommit source code repositories to be cloned into the development environment.
   */
  public open fun repositories(`value`: List<Any>) {
    unwrap(this).setRepositories(`value`)
  }

  /**
   * Any AWS CodeCommit source code repositories to be cloned into the development environment.
   */
  public open fun repositories(vararg `value`: Any): Unit = repositories(`value`.toList())

  /**
   * The ID of the subnet in Amazon Virtual Private Cloud (Amazon VPC) that AWS Cloud9 will use to
   * communicate with the Amazon Elastic Compute Cloud (Amazon EC2) instance.
   */
  public open fun subnetId(): String? = unwrap(this).getSubnetId()

  /**
   * The ID of the subnet in Amazon Virtual Private Cloud (Amazon VPC) that AWS Cloud9 will use to
   * communicate with the Amazon Elastic Compute Cloud (Amazon EC2) instance.
   */
  public open fun subnetId(`value`: String) {
    unwrap(this).setSubnetId(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs that will be associated with the new AWS Cloud9 development
   * environment.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs that will be associated with the new AWS Cloud9 development
   * environment.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs that will be associated with the new AWS Cloud9 development
   * environment.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloud9.CfnEnvironmentEC2].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The number of minutes until the running instance is shut down after the environment was last
     * used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-automaticstoptimeminutes)
     * @param automaticStopTimeMinutes The number of minutes until the running instance is shut down
     * after the environment was last used. 
     */
    public fun automaticStopTimeMinutes(automaticStopTimeMinutes: Number)

    /**
     * The connection type used for connecting to an Amazon EC2 environment.
     *
     * Valid values are `CONNECT_SSH` (default) and `CONNECT_SSM` (connected through AWS Systems
     * Manager ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-connectiontype)
     * @param connectionType The connection type used for connecting to an Amazon EC2 environment. 
     */
    public fun connectionType(connectionType: String)

    /**
     * The description of the environment to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-description)
     * @param description The description of the environment to create. 
     */
    public fun description(description: String)

    /**
     * The identifier for the Amazon Machine Image (AMI) that's used to create the EC2 instance.
     *
     * To choose an AMI for the instance, you must specify a valid AMI alias or a valid AWS Systems
     * Manager path.
     *
     * From December 04, 2023, you will be required to include the `ImageId` parameter for the
     * `CreateEnvironmentEC2` action. This change will be reflected across all direct methods of
     * communicating with the API, such as AWS SDK, AWS CLI and AWS CloudFormation. This change will
     * only affect direct API consumers, and not AWS Cloud9 console users.
     *
     * Since Ubuntu 18.04 has ended standard support as of May 31, 2023, we recommend you choose
     * Ubuntu 22.04.
     *
     * *AMI aliases*
     *
     * * Amazon Linux 2: `amazonlinux-2-x86_64`
     * * Amazon Linux 2023 (recommended): `amazonlinux-2023-x86_64`
     * * Ubuntu 18.04: `ubuntu-18.04-x86_64`
     * * Ubuntu 22.04: `ubuntu-22.04-x86_64`
     *
     * *SSM paths*
     *
     * * Amazon Linux 2: `resolve:ssm:/aws/service/cloud9/amis/amazonlinux-2-x86_64`
     * * Amazon Linux 2023 (recommended):
     * `resolve:ssm:/aws/service/cloud9/amis/amazonlinux-2023-x86_64`
     * * Ubuntu 18.04: `resolve:ssm:/aws/service/cloud9/amis/ubuntu-18.04-x86_64`
     * * Ubuntu 22.04: `resolve:ssm:/aws/service/cloud9/amis/ubuntu-22.04-x86_64`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-imageid)
     * @param imageId The identifier for the Amazon Machine Image (AMI) that's used to create the
     * EC2 instance. 
     */
    public fun imageId(imageId: String)

    /**
     * The type of instance to connect to the environment (for example, `t2.micro` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-instancetype)
     * @param instanceType The type of instance to connect to the environment (for example,
     * `t2.micro` ). 
     */
    public fun instanceType(instanceType: String)

    /**
     * The name of the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-name)
     * @param name The name of the environment. 
     */
    public fun name(name: String)

    /**
     * The Amazon Resource Name (ARN) of the environment owner.
     *
     * This ARN can be the ARN of any AWS Identity and Access Management principal. If this value is
     * not specified, the ARN defaults to this environment's creator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-ownerarn)
     * @param ownerArn The Amazon Resource Name (ARN) of the environment owner. 
     */
    public fun ownerArn(ownerArn: String)

    /**
     * Any AWS CodeCommit source code repositories to be cloned into the development environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-repositories)
     * @param repositories Any AWS CodeCommit source code repositories to be cloned into the
     * development environment. 
     */
    public fun repositories(repositories: IResolvable)

    /**
     * Any AWS CodeCommit source code repositories to be cloned into the development environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-repositories)
     * @param repositories Any AWS CodeCommit source code repositories to be cloned into the
     * development environment. 
     */
    public fun repositories(repositories: List<Any>)

    /**
     * Any AWS CodeCommit source code repositories to be cloned into the development environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-repositories)
     * @param repositories Any AWS CodeCommit source code repositories to be cloned into the
     * development environment. 
     */
    public fun repositories(vararg repositories: Any)

    /**
     * The ID of the subnet in Amazon Virtual Private Cloud (Amazon VPC) that AWS Cloud9 will use to
     * communicate with the Amazon Elastic Compute Cloud (Amazon EC2) instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-subnetid)
     * @param subnetId The ID of the subnet in Amazon Virtual Private Cloud (Amazon VPC) that AWS
     * Cloud9 will use to communicate with the Amazon Elastic Compute Cloud (Amazon EC2) instance. 
     */
    public fun subnetId(subnetId: String)

    /**
     * An array of key-value pairs that will be associated with the new AWS Cloud9 development
     * environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-tags)
     * @param tags An array of key-value pairs that will be associated with the new AWS Cloud9
     * development environment. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs that will be associated with the new AWS Cloud9 development
     * environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-tags)
     * @param tags An array of key-value pairs that will be associated with the new AWS Cloud9
     * development environment. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2.Builder =
        software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2.Builder.create(scope, id)

    /**
     * The number of minutes until the running instance is shut down after the environment was last
     * used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-automaticstoptimeminutes)
     * @param automaticStopTimeMinutes The number of minutes until the running instance is shut down
     * after the environment was last used. 
     */
    override fun automaticStopTimeMinutes(automaticStopTimeMinutes: Number) {
      cdkBuilder.automaticStopTimeMinutes(automaticStopTimeMinutes)
    }

    /**
     * The connection type used for connecting to an Amazon EC2 environment.
     *
     * Valid values are `CONNECT_SSH` (default) and `CONNECT_SSM` (connected through AWS Systems
     * Manager ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-connectiontype)
     * @param connectionType The connection type used for connecting to an Amazon EC2 environment. 
     */
    override fun connectionType(connectionType: String) {
      cdkBuilder.connectionType(connectionType)
    }

    /**
     * The description of the environment to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-description)
     * @param description The description of the environment to create. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The identifier for the Amazon Machine Image (AMI) that's used to create the EC2 instance.
     *
     * To choose an AMI for the instance, you must specify a valid AMI alias or a valid AWS Systems
     * Manager path.
     *
     * From December 04, 2023, you will be required to include the `ImageId` parameter for the
     * `CreateEnvironmentEC2` action. This change will be reflected across all direct methods of
     * communicating with the API, such as AWS SDK, AWS CLI and AWS CloudFormation. This change will
     * only affect direct API consumers, and not AWS Cloud9 console users.
     *
     * Since Ubuntu 18.04 has ended standard support as of May 31, 2023, we recommend you choose
     * Ubuntu 22.04.
     *
     * *AMI aliases*
     *
     * * Amazon Linux 2: `amazonlinux-2-x86_64`
     * * Amazon Linux 2023 (recommended): `amazonlinux-2023-x86_64`
     * * Ubuntu 18.04: `ubuntu-18.04-x86_64`
     * * Ubuntu 22.04: `ubuntu-22.04-x86_64`
     *
     * *SSM paths*
     *
     * * Amazon Linux 2: `resolve:ssm:/aws/service/cloud9/amis/amazonlinux-2-x86_64`
     * * Amazon Linux 2023 (recommended):
     * `resolve:ssm:/aws/service/cloud9/amis/amazonlinux-2023-x86_64`
     * * Ubuntu 18.04: `resolve:ssm:/aws/service/cloud9/amis/ubuntu-18.04-x86_64`
     * * Ubuntu 22.04: `resolve:ssm:/aws/service/cloud9/amis/ubuntu-22.04-x86_64`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-imageid)
     * @param imageId The identifier for the Amazon Machine Image (AMI) that's used to create the
     * EC2 instance. 
     */
    override fun imageId(imageId: String) {
      cdkBuilder.imageId(imageId)
    }

    /**
     * The type of instance to connect to the environment (for example, `t2.micro` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-instancetype)
     * @param instanceType The type of instance to connect to the environment (for example,
     * `t2.micro` ). 
     */
    override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    /**
     * The name of the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-name)
     * @param name The name of the environment. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The Amazon Resource Name (ARN) of the environment owner.
     *
     * This ARN can be the ARN of any AWS Identity and Access Management principal. If this value is
     * not specified, the ARN defaults to this environment's creator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-ownerarn)
     * @param ownerArn The Amazon Resource Name (ARN) of the environment owner. 
     */
    override fun ownerArn(ownerArn: String) {
      cdkBuilder.ownerArn(ownerArn)
    }

    /**
     * Any AWS CodeCommit source code repositories to be cloned into the development environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-repositories)
     * @param repositories Any AWS CodeCommit source code repositories to be cloned into the
     * development environment. 
     */
    override fun repositories(repositories: IResolvable) {
      cdkBuilder.repositories(repositories.let(IResolvable::unwrap))
    }

    /**
     * Any AWS CodeCommit source code repositories to be cloned into the development environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-repositories)
     * @param repositories Any AWS CodeCommit source code repositories to be cloned into the
     * development environment. 
     */
    override fun repositories(repositories: List<Any>) {
      cdkBuilder.repositories(repositories)
    }

    /**
     * Any AWS CodeCommit source code repositories to be cloned into the development environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-repositories)
     * @param repositories Any AWS CodeCommit source code repositories to be cloned into the
     * development environment. 
     */
    override fun repositories(vararg repositories: Any): Unit = repositories(repositories.toList())

    /**
     * The ID of the subnet in Amazon Virtual Private Cloud (Amazon VPC) that AWS Cloud9 will use to
     * communicate with the Amazon Elastic Compute Cloud (Amazon EC2) instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-subnetid)
     * @param subnetId The ID of the subnet in Amazon Virtual Private Cloud (Amazon VPC) that AWS
     * Cloud9 will use to communicate with the Amazon Elastic Compute Cloud (Amazon EC2) instance. 
     */
    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    /**
     * An array of key-value pairs that will be associated with the new AWS Cloud9 development
     * environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-tags)
     * @param tags An array of key-value pairs that will be associated with the new AWS Cloud9
     * development environment. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs that will be associated with the new AWS Cloud9 development
     * environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-tags)
     * @param tags An array of key-value pairs that will be associated with the new AWS Cloud9
     * development environment. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2 =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEnvironmentEC2 {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEnvironmentEC2(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2):
        CfnEnvironmentEC2 = CfnEnvironmentEC2(cdkObject)

    internal fun unwrap(wrapped: CfnEnvironmentEC2):
        software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2 = wrapped.cdkObject
  }

  /**
   * The `Repository` property type specifies an AWS CodeCommit source code repository to be cloned
   * into an AWS Cloud9 development environment.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloud9.*;
   * RepositoryProperty repositoryProperty = RepositoryProperty.builder()
   * .pathComponent("pathComponent")
   * .repositoryUrl("repositoryUrl")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloud9-environmentec2-repository.html)
   */
  public interface RepositoryProperty {
    /**
     * The path within the development environment's default file system location to clone the AWS
     * CodeCommit repository into.
     *
     * For example, `/REPOSITORY_NAME` would clone the repository into the
     * `/home/USER_NAME/environment/REPOSITORY_NAME` directory in the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloud9-environmentec2-repository.html#cfn-cloud9-environmentec2-repository-pathcomponent)
     */
    public fun pathComponent(): String

    /**
     * The clone URL of the AWS CodeCommit repository to be cloned.
     *
     * For example, for an AWS CodeCommit repository this might be
     * `https://git-codecommit.us-east-2.amazonaws.com/v1/repos/REPOSITORY_NAME` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloud9-environmentec2-repository.html#cfn-cloud9-environmentec2-repository-repositoryurl)
     */
    public fun repositoryUrl(): String

    /**
     * A builder for [RepositoryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param pathComponent The path within the development environment's default file system
       * location to clone the AWS CodeCommit repository into. 
       * For example, `/REPOSITORY_NAME` would clone the repository into the
       * `/home/USER_NAME/environment/REPOSITORY_NAME` directory in the environment.
       */
      public fun pathComponent(pathComponent: String)

      /**
       * @param repositoryUrl The clone URL of the AWS CodeCommit repository to be cloned. 
       * For example, for an AWS CodeCommit repository this might be
       * `https://git-codecommit.us-east-2.amazonaws.com/v1/repos/REPOSITORY_NAME` .
       */
      public fun repositoryUrl(repositoryUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2.RepositoryProperty.Builder =
          software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2.RepositoryProperty.builder()

      /**
       * @param pathComponent The path within the development environment's default file system
       * location to clone the AWS CodeCommit repository into. 
       * For example, `/REPOSITORY_NAME` would clone the repository into the
       * `/home/USER_NAME/environment/REPOSITORY_NAME` directory in the environment.
       */
      override fun pathComponent(pathComponent: String) {
        cdkBuilder.pathComponent(pathComponent)
      }

      /**
       * @param repositoryUrl The clone URL of the AWS CodeCommit repository to be cloned. 
       * For example, for an AWS CodeCommit repository this might be
       * `https://git-codecommit.us-east-2.amazonaws.com/v1/repos/REPOSITORY_NAME` .
       */
      override fun repositoryUrl(repositoryUrl: String) {
        cdkBuilder.repositoryUrl(repositoryUrl)
      }

      public fun build():
          software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2.RepositoryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2.RepositoryProperty,
    ) : CdkObject(cdkObject), RepositoryProperty {
      /**
       * The path within the development environment's default file system location to clone the AWS
       * CodeCommit repository into.
       *
       * For example, `/REPOSITORY_NAME` would clone the repository into the
       * `/home/USER_NAME/environment/REPOSITORY_NAME` directory in the environment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloud9-environmentec2-repository.html#cfn-cloud9-environmentec2-repository-pathcomponent)
       */
      override fun pathComponent(): String = unwrap(this).getPathComponent()

      /**
       * The clone URL of the AWS CodeCommit repository to be cloned.
       *
       * For example, for an AWS CodeCommit repository this might be
       * `https://git-codecommit.us-east-2.amazonaws.com/v1/repos/REPOSITORY_NAME` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloud9-environmentec2-repository.html#cfn-cloud9-environmentec2-repository-repositoryurl)
       */
      override fun repositoryUrl(): String = unwrap(this).getRepositoryUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RepositoryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2.RepositoryProperty):
          RepositoryProperty = CdkObjectWrappers.wrap(cdkObject) as? RepositoryProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RepositoryProperty):
          software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2.RepositoryProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2.RepositoryProperty
    }
  }
}
