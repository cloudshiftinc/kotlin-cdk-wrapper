@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnInstance
import software.constructs.Construct

@CdkDslMarker
public class CfnInstanceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnInstance.Builder = CfnInstance.Builder.create(scope, id)

  /**
   * A toggle for an individual feature at the instance level.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instance.html#cfn-connect-instance-attributes)
   * @param attributes A toggle for an individual feature at the instance level. 
   */
  public fun attributes(attributes: IResolvable) {
    cdkBuilder.attributes(attributes)
  }

  /**
   * A toggle for an individual feature at the instance level.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instance.html#cfn-connect-instance-attributes)
   * @param attributes A toggle for an individual feature at the instance level. 
   */
  public fun attributes(attributes: CfnInstance.AttributesProperty) {
    cdkBuilder.attributes(attributes)
  }

  /**
   * The identifier for the directory.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instance.html#cfn-connect-instance-directoryid)
   * @param directoryId The identifier for the directory. 
   */
  public fun directoryId(directoryId: String) {
    cdkBuilder.directoryId(directoryId)
  }

  /**
   * The identity management type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instance.html#cfn-connect-instance-identitymanagementtype)
   * @param identityManagementType The identity management type. 
   */
  public fun identityManagementType(identityManagementType: String) {
    cdkBuilder.identityManagementType(identityManagementType)
  }

  /**
   * The alias of instance.
   *
   * `InstanceAlias` is only required when `IdentityManagementType` is `CONNECT_MANAGED` or `SAML` .
   * `InstanceAlias` is not required when `IdentityManagementType` is `EXISTING_DIRECTORY` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instance.html#cfn-connect-instance-instancealias)
   * @param instanceAlias The alias of instance. 
   */
  public fun instanceAlias(instanceAlias: String) {
    cdkBuilder.instanceAlias(instanceAlias)
  }

  public fun build(): CfnInstance = cdkBuilder.build()
}
