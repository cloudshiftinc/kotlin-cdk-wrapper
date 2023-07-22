@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sso

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration
import software.constructs.Construct

@CdkDslMarker
public class CfnInstanceAccessControlAttributeConfigurationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnInstanceAccessControlAttributeConfiguration.Builder =
      CfnInstanceAccessControlAttributeConfiguration.Builder.create(scope, id)

  private val _accessControlAttributes: MutableList<Any> = mutableListOf()

  /**
   * Lists the attributes that are configured for ABAC in the specified IAM Identity Center
   * instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instanceaccesscontrolattributeconfiguration.html#cfn-sso-instanceaccesscontrolattributeconfiguration-accesscontrolattributes)
   * @param accessControlAttributes Lists the attributes that are configured for ABAC in the
   * specified IAM Identity Center instance. 
   */
  public fun accessControlAttributes(vararg accessControlAttributes: Any) {
    _accessControlAttributes.addAll(listOf(*accessControlAttributes))
  }

  /**
   * Lists the attributes that are configured for ABAC in the specified IAM Identity Center
   * instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instanceaccesscontrolattributeconfiguration.html#cfn-sso-instanceaccesscontrolattributeconfiguration-accesscontrolattributes)
   * @param accessControlAttributes Lists the attributes that are configured for ABAC in the
   * specified IAM Identity Center instance. 
   */
  public fun accessControlAttributes(accessControlAttributes: Collection<Any>) {
    _accessControlAttributes.addAll(accessControlAttributes)
  }

  /**
   * Lists the attributes that are configured for ABAC in the specified IAM Identity Center
   * instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instanceaccesscontrolattributeconfiguration.html#cfn-sso-instanceaccesscontrolattributeconfiguration-accesscontrolattributes)
   * @param accessControlAttributes Lists the attributes that are configured for ABAC in the
   * specified IAM Identity Center instance. 
   */
  public fun accessControlAttributes(accessControlAttributes: IResolvable) {
    cdkBuilder.accessControlAttributes(accessControlAttributes)
  }

  /**
   * (deprecated) The InstanceAccessControlAttributeConfiguration property has been deprecated but
   * is still supported for backwards compatibility purposes.
   *
   * We recomend that you use  AccessControlAttributes property instead.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instanceaccesscontrolattributeconfiguration.html#cfn-sso-instanceaccesscontrolattributeconfiguration-instanceaccesscontrolattributeconfiguration)
   * @deprecated this property has been deprecated
   * @param instanceAccessControlAttributeConfiguration The
   * InstanceAccessControlAttributeConfiguration property has been deprecated but is still supported
   * for backwards compatibility purposes. 
   */
  @Deprecated(message = "deprecated in CDK")
  public
      fun instanceAccessControlAttributeConfiguration(instanceAccessControlAttributeConfiguration: IResolvable) {
    cdkBuilder.instanceAccessControlAttributeConfiguration(instanceAccessControlAttributeConfiguration)
  }

  /**
   * (deprecated) The InstanceAccessControlAttributeConfiguration property has been deprecated but
   * is still supported for backwards compatibility purposes.
   *
   * We recomend that you use  AccessControlAttributes property instead.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instanceaccesscontrolattributeconfiguration.html#cfn-sso-instanceaccesscontrolattributeconfiguration-instanceaccesscontrolattributeconfiguration)
   * @deprecated this property has been deprecated
   * @param instanceAccessControlAttributeConfiguration The
   * InstanceAccessControlAttributeConfiguration property has been deprecated but is still supported
   * for backwards compatibility purposes. 
   */
  @Deprecated(message = "deprecated in CDK")
  public
      fun instanceAccessControlAttributeConfiguration(instanceAccessControlAttributeConfiguration: CfnInstanceAccessControlAttributeConfiguration.InstanceAccessControlAttributeConfigurationProperty) {
    cdkBuilder.instanceAccessControlAttributeConfiguration(instanceAccessControlAttributeConfiguration)
  }

  /**
   * The ARN of the IAM Identity Center instance under which the operation will be executed.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instanceaccesscontrolattributeconfiguration.html#cfn-sso-instanceaccesscontrolattributeconfiguration-instancearn)
   * @param instanceArn The ARN of the IAM Identity Center instance under which the operation will
   * be executed. 
   */
  public fun instanceArn(instanceArn: String) {
    cdkBuilder.instanceArn(instanceArn)
  }

  public fun build(): CfnInstanceAccessControlAttributeConfiguration {
    if(_accessControlAttributes.isNotEmpty())
        cdkBuilder.accessControlAttributes(_accessControlAttributes)
    return cdkBuilder.build()
  }
}
