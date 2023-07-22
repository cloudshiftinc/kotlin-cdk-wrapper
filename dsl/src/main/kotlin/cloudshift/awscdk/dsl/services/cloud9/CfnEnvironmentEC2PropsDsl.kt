@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloud9

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2Props

@CdkDslMarker
public class CfnEnvironmentEC2PropsDsl {
  private val cdkBuilder: CfnEnvironmentEC2Props.Builder = CfnEnvironmentEC2Props.builder()

  private val _repositories: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param automaticStopTimeMinutes The number of minutes until the running instance is shut down
   * after the environment was last used.
   */
  public fun automaticStopTimeMinutes(automaticStopTimeMinutes: Number) {
    cdkBuilder.automaticStopTimeMinutes(automaticStopTimeMinutes)
  }

  /**
   * @param connectionType The connection type used for connecting to an Amazon EC2 environment.
   * Valid values are `CONNECT_SSH` (default) and `CONNECT_SSM` (connected through AWS Systems
   * Manager ).
   */
  public fun connectionType(connectionType: String) {
    cdkBuilder.connectionType(connectionType)
  }

  /**
   * @param description The description of the environment to create.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param imageId The identifier for the Amazon Machine Image (AMI) that's used to create the EC2
   * instance.
   * To choose an AMI for the instance, you must specify a valid AMI alias or a valid AWS Systems
   * Manager path.
   *
   * The default AMI is used if the parameter isn't explicitly assigned a value in the request.
   *
   * *AMI aliases*
   *
   * * *Amazon Linux (default): `amazonlinux-1-x86_64`*
   * * Amazon Linux 2: `amazonlinux-2-x86_64`
   * * Ubuntu 18.04: `ubuntu-18.04-x86_64`
   *
   * *SSM paths*
   *
   * * *Amazon Linux (default): `resolve:ssm:/aws/service/cloud9/amis/amazonlinux-1-x86_64`*
   * * Amazon Linux 2: `resolve:ssm:/aws/service/cloud9/amis/amazonlinux-2-x86_64`
   * * Ubuntu 18.04: `resolve:ssm:/aws/service/cloud9/amis/ubuntu-18.04-x86_64`
   */
  public fun imageId(imageId: String) {
    cdkBuilder.imageId(imageId)
  }

  /**
   * @param instanceType The type of instance to connect to the environment (for example, `t2.micro`
   * ). 
   */
  public fun instanceType(instanceType: String) {
    cdkBuilder.instanceType(instanceType)
  }

  /**
   * @param name The name of the environment.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param ownerArn The Amazon Resource Name (ARN) of the environment owner.
   * This ARN can be the ARN of any AWS Identity and Access Management principal. If this value is
   * not specified, the ARN defaults to this environment's creator.
   */
  public fun ownerArn(ownerArn: String) {
    cdkBuilder.ownerArn(ownerArn)
  }

  /**
   * @param repositories Any AWS CodeCommit source code repositories to be cloned into the
   * development environment.
   */
  public fun repositories(vararg repositories: Any) {
    _repositories.addAll(listOf(*repositories))
  }

  /**
   * @param repositories Any AWS CodeCommit source code repositories to be cloned into the
   * development environment.
   */
  public fun repositories(repositories: Collection<Any>) {
    _repositories.addAll(repositories)
  }

  /**
   * @param repositories Any AWS CodeCommit source code repositories to be cloned into the
   * development environment.
   */
  public fun repositories(repositories: IResolvable) {
    cdkBuilder.repositories(repositories)
  }

  /**
   * @param subnetId The ID of the subnet in Amazon Virtual Private Cloud (Amazon VPC) that AWS
   * Cloud9 will use to communicate with the Amazon Elastic Compute Cloud (Amazon EC2) instance.
   */
  public fun subnetId(subnetId: String) {
    cdkBuilder.subnetId(subnetId)
  }

  /**
   * @param tags An array of key-value pairs that will be associated with the new AWS Cloud9
   * development environment.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags An array of key-value pairs that will be associated with the new AWS Cloud9
   * development environment.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnEnvironmentEC2Props {
    if(_repositories.isNotEmpty()) cdkBuilder.repositories(_repositories)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
