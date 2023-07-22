@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnInstance
import software.constructs.Construct

/**
 * *This is a preview release for Amazon Connect . It is subject to change.*.
 *
 * Initiates an Amazon Connect instance with all the supported channels enabled. It does not attach
 * any storage, such as Amazon Simple Storage Service (Amazon S3) or Amazon Kinesis.
 *
 * Amazon Connect enforces a limit on the total number of instances that you can create or delete in
 * 30 days. If you exceed this limit, you will get an error message indicating there has been an
 * excessive number of attempts at creating or deleting instances. You must wait 30 days before you can
 * restart creating and deleting instances in your account.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * CfnInstance cfnInstance = CfnInstance.Builder.create(this, "MyCfnInstance")
 * .attributes(AttributesProperty.builder()
 * .inboundCalls(false)
 * .outboundCalls(false)
 * // the properties below are optional
 * .autoResolveBestVoices(false)
 * .contactflowLogs(false)
 * .contactLens(false)
 * .earlyMedia(false)
 * .useCustomTtsVoices(false)
 * .build())
 * .identityManagementType("identityManagementType")
 * // the properties below are optional
 * .directoryId("directoryId")
 * .instanceAlias("instanceAlias")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instance.html)
 */
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
