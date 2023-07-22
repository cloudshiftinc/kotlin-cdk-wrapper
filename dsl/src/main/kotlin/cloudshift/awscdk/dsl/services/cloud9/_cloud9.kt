@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloud9

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2
import software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2Props
import software.constructs.Construct

public object cloud9 {
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
  public inline fun cfnEnvironmentEC2(
    scope: Construct,
    id: String,
    block: CfnEnvironmentEC2Dsl.() -> Unit = {},
  ): CfnEnvironmentEC2 {
    val builder = CfnEnvironmentEC2Dsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnEnvironmentEC2`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.cloud9.*;
   * CfnEnvironmentEC2Props cfnEnvironmentEC2Props = CfnEnvironmentEC2Props.builder()
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
  public inline fun cfnEnvironmentEC2Props(block: CfnEnvironmentEC2PropsDsl.() -> Unit = {}):
      CfnEnvironmentEC2Props {
    val builder = CfnEnvironmentEC2PropsDsl()
    builder.apply(block)
    return builder.build()
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
   * import software.amazon.awscdk.services.cloud9.*;
   * RepositoryProperty repositoryProperty = RepositoryProperty.builder()
   * .pathComponent("pathComponent")
   * .repositoryUrl("repositoryUrl")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloud9-environmentec2-repository.html)
   */
  public inline
      fun cfnEnvironmentEC2RepositoryProperty(block: CfnEnvironmentEC2RepositoryPropertyDsl.() -> Unit
      = {}): CfnEnvironmentEC2.RepositoryProperty {
    val builder = CfnEnvironmentEC2RepositoryPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
