@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.directoryservice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.directoryservice.CfnSimpleAD
import software.constructs.Construct

/**
 * The `AWS::DirectoryService::SimpleAD` resource specifies an AWS Directory Service Simple Active
 * Directory ( Simple AD ) in AWS so that your directory users and groups can access the AWS Management
 * Console and AWS applications using their existing credentials.
 *
 * Simple AD is a Microsoft Active Directory–compatible directory. For more information, see [Simple
 * Active
 * Directory](https://docs.aws.amazon.com/directoryservice/latest/admin-guide/directory_simple_ad.html)
 * in the *AWS Directory Service Admin Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.directoryservice.*;
 * CfnSimpleAD cfnSimpleAD = CfnSimpleAD.Builder.create(this, "MyCfnSimpleAD")
 * .name("name")
 * .size("size")
 * .vpcSettings(VpcSettingsProperty.builder()
 * .subnetIds(List.of("subnetIds"))
 * .vpcId("vpcId")
 * .build())
 * // the properties below are optional
 * .createAlias(false)
 * .description("description")
 * .enableSso(false)
 * .password("password")
 * .shortName("shortName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html)
 */
@CdkDslMarker
public class CfnSimpleADDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSimpleAD.Builder = CfnSimpleAD.Builder.create(scope, id)

  /**
   * If set to `true` , specifies an alias for a directory and assigns the alias to the directory.
   *
   * The alias is used to construct the access URL for the directory, such as
   * `http://&lt;alias&gt;.awsapps.com` . By default, this property is set to `false` .
   *
   *
   * After an alias has been created, it cannot be deleted or reused, so this operation should only
   * be used when absolutely necessary.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-createalias)
   * @param createAlias If set to `true` , specifies an alias for a directory and assigns the alias
   * to the directory. 
   */
  public fun createAlias(createAlias: Boolean) {
    cdkBuilder.createAlias(createAlias)
  }

  /**
   * If set to `true` , specifies an alias for a directory and assigns the alias to the directory.
   *
   * The alias is used to construct the access URL for the directory, such as
   * `http://&lt;alias&gt;.awsapps.com` . By default, this property is set to `false` .
   *
   *
   * After an alias has been created, it cannot be deleted or reused, so this operation should only
   * be used when absolutely necessary.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-createalias)
   * @param createAlias If set to `true` , specifies an alias for a directory and assigns the alias
   * to the directory. 
   */
  public fun createAlias(createAlias: IResolvable) {
    cdkBuilder.createAlias(createAlias)
  }

  /**
   * A description for the directory.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-description)
   * @param description A description for the directory. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * Whether to enable single sign-on for a directory.
   *
   * If you don't specify a value, AWS CloudFormation disables single sign-on by default.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-enablesso)
   * @param enableSso Whether to enable single sign-on for a directory. 
   */
  public fun enableSso(enableSso: Boolean) {
    cdkBuilder.enableSso(enableSso)
  }

  /**
   * Whether to enable single sign-on for a directory.
   *
   * If you don't specify a value, AWS CloudFormation disables single sign-on by default.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-enablesso)
   * @param enableSso Whether to enable single sign-on for a directory. 
   */
  public fun enableSso(enableSso: IResolvable) {
    cdkBuilder.enableSso(enableSso)
  }

  /**
   * The fully qualified name for the directory, such as `corp.example.com` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-name)
   * @param name The fully qualified name for the directory, such as `corp.example.com` . 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The password for the directory administrator.
   *
   * The directory creation process creates a directory administrator account with the user name
   * `Administrator` and this password.
   *
   * If you need to change the password for the administrator account, see the
   * [ResetUserPassword](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_ResetUserPassword.html)
   * API call in the *AWS Directory Service API Reference* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-password)
   * @param password The password for the directory administrator. 
   */
  public fun password(password: String) {
    cdkBuilder.password(password)
  }

  /**
   * The NetBIOS name of the directory, such as `CORP` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-shortname)
   * @param shortName The NetBIOS name of the directory, such as `CORP` . 
   */
  public fun shortName(shortName: String) {
    cdkBuilder.shortName(shortName)
  }

  /**
   * The size of the directory.
   *
   * For valid values, see
   * [CreateDirectory](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_CreateDirectory.html)
   * in the *AWS Directory Service API Reference* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-size)
   * @param size The size of the directory. 
   */
  public fun size(size: String) {
    cdkBuilder.size(size)
  }

  /**
   * A
   * [DirectoryVpcSettings](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_DirectoryVpcSettings.html)
   * object that contains additional information for the operation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-vpcsettings)
   * @param vpcSettings A
   * [DirectoryVpcSettings](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_DirectoryVpcSettings.html)
   * object that contains additional information for the operation. 
   */
  public fun vpcSettings(vpcSettings: IResolvable) {
    cdkBuilder.vpcSettings(vpcSettings)
  }

  /**
   * A
   * [DirectoryVpcSettings](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_DirectoryVpcSettings.html)
   * object that contains additional information for the operation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-vpcsettings)
   * @param vpcSettings A
   * [DirectoryVpcSettings](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_DirectoryVpcSettings.html)
   * object that contains additional information for the operation. 
   */
  public fun vpcSettings(vpcSettings: CfnSimpleAD.VpcSettingsProperty) {
    cdkBuilder.vpcSettings(vpcSettings)
  }

  public fun build(): CfnSimpleAD = cdkBuilder.build()
}
