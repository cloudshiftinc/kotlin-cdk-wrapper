@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloud9

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnEnvironmentEC2`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloud9.*;
 * CfnEnvironmentEC2Props cfnEnvironmentEC2Props = CfnEnvironmentEC2Props.builder()
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
public interface CfnEnvironmentEC2Props {
  /**
   * The number of minutes until the running instance is shut down after the environment was last
   * used.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-automaticstoptimeminutes)
   */
  public fun automaticStopTimeMinutes(): Number? = unwrap(this).getAutomaticStopTimeMinutes()

  /**
   * The connection type used for connecting to an Amazon EC2 environment.
   *
   * Valid values are `CONNECT_SSH` (default) and `CONNECT_SSM` (connected through AWS Systems
   * Manager ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-connectiontype)
   */
  public fun connectionType(): String? = unwrap(this).getConnectionType()

  /**
   * The description of the environment to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The identifier for the Amazon Machine Image (AMI) that's used to create the EC2 instance.
   *
   * To choose an AMI for the instance, you must specify a valid AMI alias or a valid AWS Systems
   * Manager path.
   *
   * From December 04, 2023, you will be required to include the `ImageId` parameter for the
   * `CreateEnvironmentEC2` action. This change will be reflected across all direct methods of
   * communicating with the API, such as AWS SDK, AWS CLI and AWS CloudFormation. This change will only
   * affect direct API consumers, and not AWS Cloud9 console users.
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
   */
  public fun imageId(): String

  /**
   * The type of instance to connect to the environment (for example, `t2.micro` ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-instancetype)
   */
  public fun instanceType(): String

  /**
   * The name of the environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The Amazon Resource Name (ARN) of the environment owner.
   *
   * This ARN can be the ARN of any AWS Identity and Access Management principal. If this value is
   * not specified, the ARN defaults to this environment's creator.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-ownerarn)
   */
  public fun ownerArn(): String? = unwrap(this).getOwnerArn()

  /**
   * Any AWS CodeCommit source code repositories to be cloned into the development environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-repositories)
   */
  public fun repositories(): Any? = unwrap(this).getRepositories()

  /**
   * The ID of the subnet in Amazon Virtual Private Cloud (Amazon VPC) that AWS Cloud9 will use to
   * communicate with the Amazon Elastic Compute Cloud (Amazon EC2) instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-subnetid)
   */
  public fun subnetId(): String? = unwrap(this).getSubnetId()

  /**
   * An array of key-value pairs that will be associated with the new AWS Cloud9 development
   * environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnEnvironmentEC2Props]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param automaticStopTimeMinutes The number of minutes until the running instance is shut down
     * after the environment was last used.
     */
    public fun automaticStopTimeMinutes(automaticStopTimeMinutes: Number)

    /**
     * @param connectionType The connection type used for connecting to an Amazon EC2 environment.
     * Valid values are `CONNECT_SSH` (default) and `CONNECT_SSM` (connected through AWS Systems
     * Manager ).
     */
    public fun connectionType(connectionType: String)

    /**
     * @param description The description of the environment to create.
     */
    public fun description(description: String)

    /**
     * @param imageId The identifier for the Amazon Machine Image (AMI) that's used to create the
     * EC2 instance. 
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
     */
    public fun imageId(imageId: String)

    /**
     * @param instanceType The type of instance to connect to the environment (for example,
     * `t2.micro` ). 
     */
    public fun instanceType(instanceType: String)

    /**
     * @param name The name of the environment.
     */
    public fun name(name: String)

    /**
     * @param ownerArn The Amazon Resource Name (ARN) of the environment owner.
     * This ARN can be the ARN of any AWS Identity and Access Management principal. If this value is
     * not specified, the ARN defaults to this environment's creator.
     */
    public fun ownerArn(ownerArn: String)

    /**
     * @param repositories Any AWS CodeCommit source code repositories to be cloned into the
     * development environment.
     */
    public fun repositories(repositories: IResolvable)

    /**
     * @param repositories Any AWS CodeCommit source code repositories to be cloned into the
     * development environment.
     */
    public fun repositories(repositories: List<Any>)

    /**
     * @param repositories Any AWS CodeCommit source code repositories to be cloned into the
     * development environment.
     */
    public fun repositories(vararg repositories: Any)

    /**
     * @param subnetId The ID of the subnet in Amazon Virtual Private Cloud (Amazon VPC) that AWS
     * Cloud9 will use to communicate with the Amazon Elastic Compute Cloud (Amazon EC2) instance.
     */
    public fun subnetId(subnetId: String)

    /**
     * @param tags An array of key-value pairs that will be associated with the new AWS Cloud9
     * development environment.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs that will be associated with the new AWS Cloud9
     * development environment.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2Props.Builder =
        software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2Props.builder()

    /**
     * @param automaticStopTimeMinutes The number of minutes until the running instance is shut down
     * after the environment was last used.
     */
    override fun automaticStopTimeMinutes(automaticStopTimeMinutes: Number) {
      cdkBuilder.automaticStopTimeMinutes(automaticStopTimeMinutes)
    }

    /**
     * @param connectionType The connection type used for connecting to an Amazon EC2 environment.
     * Valid values are `CONNECT_SSH` (default) and `CONNECT_SSM` (connected through AWS Systems
     * Manager ).
     */
    override fun connectionType(connectionType: String) {
      cdkBuilder.connectionType(connectionType)
    }

    /**
     * @param description The description of the environment to create.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param imageId The identifier for the Amazon Machine Image (AMI) that's used to create the
     * EC2 instance. 
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
     */
    override fun imageId(imageId: String) {
      cdkBuilder.imageId(imageId)
    }

    /**
     * @param instanceType The type of instance to connect to the environment (for example,
     * `t2.micro` ). 
     */
    override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    /**
     * @param name The name of the environment.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param ownerArn The Amazon Resource Name (ARN) of the environment owner.
     * This ARN can be the ARN of any AWS Identity and Access Management principal. If this value is
     * not specified, the ARN defaults to this environment's creator.
     */
    override fun ownerArn(ownerArn: String) {
      cdkBuilder.ownerArn(ownerArn)
    }

    /**
     * @param repositories Any AWS CodeCommit source code repositories to be cloned into the
     * development environment.
     */
    override fun repositories(repositories: IResolvable) {
      cdkBuilder.repositories(repositories.let(IResolvable::unwrap))
    }

    /**
     * @param repositories Any AWS CodeCommit source code repositories to be cloned into the
     * development environment.
     */
    override fun repositories(repositories: List<Any>) {
      cdkBuilder.repositories(repositories)
    }

    /**
     * @param repositories Any AWS CodeCommit source code repositories to be cloned into the
     * development environment.
     */
    override fun repositories(vararg repositories: Any): Unit = repositories(repositories.toList())

    /**
     * @param subnetId The ID of the subnet in Amazon Virtual Private Cloud (Amazon VPC) that AWS
     * Cloud9 will use to communicate with the Amazon Elastic Compute Cloud (Amazon EC2) instance.
     */
    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    /**
     * @param tags An array of key-value pairs that will be associated with the new AWS Cloud9
     * development environment.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs that will be associated with the new AWS Cloud9
     * development environment.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2Props =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2Props,
  ) : CdkObject(cdkObject), CfnEnvironmentEC2Props {
    /**
     * The number of minutes until the running instance is shut down after the environment was last
     * used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-automaticstoptimeminutes)
     */
    override fun automaticStopTimeMinutes(): Number? = unwrap(this).getAutomaticStopTimeMinutes()

    /**
     * The connection type used for connecting to an Amazon EC2 environment.
     *
     * Valid values are `CONNECT_SSH` (default) and `CONNECT_SSM` (connected through AWS Systems
     * Manager ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-connectiontype)
     */
    override fun connectionType(): String? = unwrap(this).getConnectionType()

    /**
     * The description of the environment to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

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
     */
    override fun imageId(): String = unwrap(this).getImageId()

    /**
     * The type of instance to connect to the environment (for example, `t2.micro` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-instancetype)
     */
    override fun instanceType(): String = unwrap(this).getInstanceType()

    /**
     * The name of the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The Amazon Resource Name (ARN) of the environment owner.
     *
     * This ARN can be the ARN of any AWS Identity and Access Management principal. If this value is
     * not specified, the ARN defaults to this environment's creator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-ownerarn)
     */
    override fun ownerArn(): String? = unwrap(this).getOwnerArn()

    /**
     * Any AWS CodeCommit source code repositories to be cloned into the development environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-repositories)
     */
    override fun repositories(): Any? = unwrap(this).getRepositories()

    /**
     * The ID of the subnet in Amazon Virtual Private Cloud (Amazon VPC) that AWS Cloud9 will use to
     * communicate with the Amazon Elastic Compute Cloud (Amazon EC2) instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-subnetid)
     */
    override fun subnetId(): String? = unwrap(this).getSubnetId()

    /**
     * An array of key-value pairs that will be associated with the new AWS Cloud9 development
     * environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEnvironmentEC2Props {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2Props):
        CfnEnvironmentEC2Props = CdkObjectWrappers.wrap(cdkObject) as? CfnEnvironmentEC2Props ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEnvironmentEC2Props):
        software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2Props = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2Props
  }
}
