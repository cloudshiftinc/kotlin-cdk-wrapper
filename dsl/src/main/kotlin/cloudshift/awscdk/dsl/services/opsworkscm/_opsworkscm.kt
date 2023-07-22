@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opsworkscm

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.opsworkscm.CfnServer
import software.amazon.awscdk.services.opsworkscm.CfnServerProps
import software.constructs.Construct

public object opsworkscm {
  /**
   * The `AWS::OpsWorksCM::Server` resource creates an AWS OpsWorks for Chef Automate or OpsWorks
   * for Puppet Enterprise configuration management server.
   *
   * For more information, see [Create a Chef Automate Server in AWS
   * CloudFormation](https://docs.aws.amazon.com/opsworks/latest/userguide/opscm-create-server-cfn.html)
   * or [Create a Puppet Enterprise Master in AWS
   * CloudFormation](https://docs.aws.amazon.com/opsworks/latest/userguide/opspup-create-server-cfn.html)
   * in the *AWS OpsWorks User Guide* , and
   * [CreateServer](https://docs.aws.amazon.com/opsworks-cm/latest/APIReference/API_CreateServer.html)
   * in the *AWS OpsWorks CM API Reference* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.opsworkscm.*;
   * CfnServer cfnServer = CfnServer.Builder.create(this, "MyCfnServer")
   * .instanceProfileArn("instanceProfileArn")
   * .instanceType("instanceType")
   * .serviceRoleArn("serviceRoleArn")
   * // the properties below are optional
   * .associatePublicIpAddress(false)
   * .backupId("backupId")
   * .backupRetentionCount(123)
   * .customCertificate("customCertificate")
   * .customDomain("customDomain")
   * .customPrivateKey("customPrivateKey")
   * .disableAutomatedBackup(false)
   * .engine("engine")
   * .engineAttributes(List.of(EngineAttributeProperty.builder()
   * .name("name")
   * .value("value")
   * .build()))
   * .engineModel("engineModel")
   * .engineVersion("engineVersion")
   * .keyPair("keyPair")
   * .preferredBackupWindow("preferredBackupWindow")
   * .preferredMaintenanceWindow("preferredMaintenanceWindow")
   * .securityGroupIds(List.of("securityGroupIds"))
   * .serverName("serverName")
   * .subnetIds(List.of("subnetIds"))
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html)
   */
  public inline fun cfnServer(
    scope: Construct,
    id: String,
    block: CfnServerDsl.() -> Unit = {},
  ): CfnServer {
    val builder = CfnServerDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `EngineAttribute` property type specifies administrator credentials for an AWS OpsWorks for
   * Chef Automate or OpsWorks for Puppet Enterprise server.
   *
   * `EngineAttribute` is a property of the `AWS::OpsWorksCM::Server` resource type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.opsworkscm.*;
   * EngineAttributeProperty engineAttributeProperty = EngineAttributeProperty.builder()
   * .name("name")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworkscm-server-engineattribute.html)
   */
  public inline
      fun cfnServerEngineAttributeProperty(block: CfnServerEngineAttributePropertyDsl.() -> Unit =
      {}): CfnServer.EngineAttributeProperty {
    val builder = CfnServerEngineAttributePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnServer`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.opsworkscm.*;
   * CfnServerProps cfnServerProps = CfnServerProps.builder()
   * .instanceProfileArn("instanceProfileArn")
   * .instanceType("instanceType")
   * .serviceRoleArn("serviceRoleArn")
   * // the properties below are optional
   * .associatePublicIpAddress(false)
   * .backupId("backupId")
   * .backupRetentionCount(123)
   * .customCertificate("customCertificate")
   * .customDomain("customDomain")
   * .customPrivateKey("customPrivateKey")
   * .disableAutomatedBackup(false)
   * .engine("engine")
   * .engineAttributes(List.of(EngineAttributeProperty.builder()
   * .name("name")
   * .value("value")
   * .build()))
   * .engineModel("engineModel")
   * .engineVersion("engineVersion")
   * .keyPair("keyPair")
   * .preferredBackupWindow("preferredBackupWindow")
   * .preferredMaintenanceWindow("preferredMaintenanceWindow")
   * .securityGroupIds(List.of("securityGroupIds"))
   * .serverName("serverName")
   * .subnetIds(List.of("subnetIds"))
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html)
   */
  public inline fun cfnServerProps(block: CfnServerPropsDsl.() -> Unit = {}): CfnServerProps {
    val builder = CfnServerPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
