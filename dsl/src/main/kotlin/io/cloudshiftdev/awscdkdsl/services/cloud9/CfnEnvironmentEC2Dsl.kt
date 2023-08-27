@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.cloud9

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2
import software.constructs.Construct

/**
 * The `AWS::Cloud9::EnvironmentEC2` resource creates an Amazon EC2 development environment in AWS
 * Cloud9 .
 *
 * For more information, see
 * [Creating an Environment](https://docs.aws.amazon.com/cloud9/latest/user-guide/create-environment.html)
 * in the *AWS Cloud9 User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloud9.*;
 * CfnEnvironmentEC2 cfnEnvironmentEC2 = CfnEnvironmentEC2.Builder.create(this,
 * "MyCfnEnvironmentEC2")
 * .instanceType("instanceType")
 * // the properties below are optional
 * .automaticStopTimeMinutes(123)
 * .connectionType("connectionType")
 * .description("description")
 * .imageId("imageId")
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
@CdkDslMarker
public class CfnEnvironmentEC2Dsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnEnvironmentEC2.Builder = CfnEnvironmentEC2.Builder.create(scope, id)

    private val _repositories: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The number of minutes until the running instance is shut down after the environment was last
     * used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-automaticstoptimeminutes)
     *
     * @param automaticStopTimeMinutes The number of minutes until the running instance is shut down
     *   after the environment was last used.
     */
    public fun automaticStopTimeMinutes(automaticStopTimeMinutes: Number) {
        cdkBuilder.automaticStopTimeMinutes(automaticStopTimeMinutes)
    }

    /**
     * The connection type used for connecting to an Amazon EC2 environment.
     *
     * Valid values are `CONNECT_SSH` (default) and `CONNECT_SSM` (connected through AWS Systems
     * Manager ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-connectiontype)
     *
     * @param connectionType The connection type used for connecting to an Amazon EC2 environment.
     */
    public fun connectionType(connectionType: String) {
        cdkBuilder.connectionType(connectionType)
    }

    /**
     * The description of the environment to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-description)
     *
     * @param description The description of the environment to create.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The identifier for the Amazon Machine Image (AMI) that's used to create the EC2 instance.
     *
     * To choose an AMI for the instance, you must specify a valid AMI alias or a valid AWS Systems
     * Manager path.
     *
     * The default AMI is used if the parameter isn't explicitly assigned a value in the request.
     *
     * *AMI aliases*
     * * *Amazon Linux (default): `amazonlinux-1-x86_64`*
     * * Amazon Linux 2: `amazonlinux-2-x86_64`
     * * Ubuntu 18.04: `ubuntu-18.04-x86_64`
     * * Ubuntu 22.04: `ubuntu-22.04-x86_64`
     *
     * *SSM paths*
     * * *Amazon Linux (default): `resolve:ssm:/aws/service/cloud9/amis/amazonlinux-1-x86_64`*
     * * Amazon Linux 2: `resolve:ssm:/aws/service/cloud9/amis/amazonlinux-2-x86_64`
     * * Ubuntu 18.04: `resolve:ssm:/aws/service/cloud9/amis/ubuntu-18.04-x86_64`
     * * Ubuntu 22.04: `resolve:ssm:/aws/service/cloud9/amis/ubuntu-22.04-x86_64`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-imageid)
     *
     * @param imageId The identifier for the Amazon Machine Image (AMI) that's used to create the
     *   EC2 instance.
     */
    public fun imageId(imageId: String) {
        cdkBuilder.imageId(imageId)
    }

    /**
     * The type of instance to connect to the environment (for example, `t2.micro` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-instancetype)
     *
     * @param instanceType The type of instance to connect to the environment (for example,
     *   `t2.micro` ).
     */
    public fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
    }

    /**
     * The name of the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-name)
     *
     * @param name The name of the environment.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The Amazon Resource Name (ARN) of the environment owner.
     *
     * This ARN can be the ARN of any AWS Identity and Access Management principal. If this value is
     * not specified, the ARN defaults to this environment's creator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-ownerarn)
     *
     * @param ownerArn The Amazon Resource Name (ARN) of the environment owner.
     */
    public fun ownerArn(ownerArn: String) {
        cdkBuilder.ownerArn(ownerArn)
    }

    /**
     * Any AWS CodeCommit source code repositories to be cloned into the development environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-repositories)
     *
     * @param repositories Any AWS CodeCommit source code repositories to be cloned into the
     *   development environment.
     */
    public fun repositories(vararg repositories: Any) {
        _repositories.addAll(listOf(*repositories))
    }

    /**
     * Any AWS CodeCommit source code repositories to be cloned into the development environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-repositories)
     *
     * @param repositories Any AWS CodeCommit source code repositories to be cloned into the
     *   development environment.
     */
    public fun repositories(repositories: Collection<Any>) {
        _repositories.addAll(repositories)
    }

    /**
     * Any AWS CodeCommit source code repositories to be cloned into the development environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-repositories)
     *
     * @param repositories Any AWS CodeCommit source code repositories to be cloned into the
     *   development environment.
     */
    public fun repositories(repositories: IResolvable) {
        cdkBuilder.repositories(repositories)
    }

    /**
     * The ID of the subnet in Amazon Virtual Private Cloud (Amazon VPC) that AWS Cloud9 will use to
     * communicate with the Amazon Elastic Compute Cloud (Amazon EC2) instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-subnetid)
     *
     * @param subnetId The ID of the subnet in Amazon Virtual Private Cloud (Amazon VPC) that AWS
     *   Cloud9 will use to communicate with the Amazon Elastic Compute Cloud (Amazon EC2) instance.
     */
    public fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
    }

    /**
     * An array of key-value pairs that will be associated with the new AWS Cloud9 development
     * environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-tags)
     *
     * @param tags An array of key-value pairs that will be associated with the new AWS Cloud9
     *   development environment.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An array of key-value pairs that will be associated with the new AWS Cloud9 development
     * environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-tags)
     *
     * @param tags An array of key-value pairs that will be associated with the new AWS Cloud9
     *   development environment.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnEnvironmentEC2 {
        if (_repositories.isNotEmpty()) cdkBuilder.repositories(_repositories)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
