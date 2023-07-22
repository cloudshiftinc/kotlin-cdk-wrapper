@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.systemsmanagersap

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.systemsmanagersap.CfnApplication
import software.amazon.awscdk.services.systemsmanagersap.CfnApplicationProps
import software.constructs.Construct

public object systemsmanagersap {
  /**
   * An SAP application registered with AWS Systems Manager for SAP.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.systemsmanagersap.*;
   * CfnApplication cfnApplication = CfnApplication.Builder.create(this, "MyCfnApplication")
   * .applicationId("applicationId")
   * .applicationType("applicationType")
   * // the properties below are optional
   * .credentials(List.of(CredentialProperty.builder()
   * .credentialType("credentialType")
   * .databaseName("databaseName")
   * .secretId("secretId")
   * .build()))
   * .instances(List.of("instances"))
   * .sapInstanceNumber("sapInstanceNumber")
   * .sid("sid")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html)
   */
  public inline fun cfnApplication(
    scope: Construct,
    id: String,
    block: CfnApplicationDsl.() -> Unit = {},
  ): CfnApplication {
    val builder = CfnApplicationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * The credentials of your SAP application.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.systemsmanagersap.*;
   * CredentialProperty credentialProperty = CredentialProperty.builder()
   * .credentialType("credentialType")
   * .databaseName("databaseName")
   * .secretId("secretId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-systemsmanagersap-application-credential.html)
   */
  public inline
      fun cfnApplicationCredentialProperty(block: CfnApplicationCredentialPropertyDsl.() -> Unit =
      {}): CfnApplication.CredentialProperty {
    val builder = CfnApplicationCredentialPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnApplication`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.systemsmanagersap.*;
   * CfnApplicationProps cfnApplicationProps = CfnApplicationProps.builder()
   * .applicationId("applicationId")
   * .applicationType("applicationType")
   * // the properties below are optional
   * .credentials(List.of(CredentialProperty.builder()
   * .credentialType("credentialType")
   * .databaseName("databaseName")
   * .secretId("secretId")
   * .build()))
   * .instances(List.of("instances"))
   * .sapInstanceNumber("sapInstanceNumber")
   * .sid("sid")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html)
   */
  public inline fun cfnApplicationProps(block: CfnApplicationPropsDsl.() -> Unit = {}):
      CfnApplicationProps {
    val builder = CfnApplicationPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
