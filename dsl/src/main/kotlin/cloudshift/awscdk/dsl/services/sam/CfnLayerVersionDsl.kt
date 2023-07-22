@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnLayerVersion
import software.constructs.Construct

@CdkDslMarker
public class CfnLayerVersionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnLayerVersion.Builder = CfnLayerVersion.Builder.create(scope, id)

  private val _compatibleRuntimes: MutableList<String> = mutableListOf()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-layerversion.html#cfn-serverless-layerversion-compatibleruntimes)
   * @param compatibleRuntimes 
   */
  public fun compatibleRuntimes(vararg compatibleRuntimes: String) {
    _compatibleRuntimes.addAll(listOf(*compatibleRuntimes))
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-layerversion.html#cfn-serverless-layerversion-compatibleruntimes)
   * @param compatibleRuntimes 
   */
  public fun compatibleRuntimes(compatibleRuntimes: Collection<String>) {
    _compatibleRuntimes.addAll(compatibleRuntimes)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-layerversion.html#cfn-serverless-layerversion-contenturi)
   * @param contentUri 
   */
  public fun contentUri(contentUri: String) {
    cdkBuilder.contentUri(contentUri)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-layerversion.html#cfn-serverless-layerversion-contenturi)
   * @param contentUri 
   */
  public fun contentUri(contentUri: IResolvable) {
    cdkBuilder.contentUri(contentUri)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-layerversion.html#cfn-serverless-layerversion-contenturi)
   * @param contentUri 
   */
  public fun contentUri(contentUri: CfnLayerVersion.S3LocationProperty) {
    cdkBuilder.contentUri(contentUri)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-layerversion.html#cfn-serverless-layerversion-description)
   * @param description 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-layerversion.html#cfn-serverless-layerversion-layername)
   * @param layerName 
   */
  public fun layerName(layerName: String) {
    cdkBuilder.layerName(layerName)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-layerversion.html#cfn-serverless-layerversion-licenseinfo)
   * @param licenseInfo 
   */
  public fun licenseInfo(licenseInfo: String) {
    cdkBuilder.licenseInfo(licenseInfo)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-layerversion.html#cfn-serverless-layerversion-retentionpolicy)
   * @param retentionPolicy 
   */
  public fun retentionPolicy(retentionPolicy: String) {
    cdkBuilder.retentionPolicy(retentionPolicy)
  }

  public fun build(): CfnLayerVersion {
    if(_compatibleRuntimes.isNotEmpty()) cdkBuilder.compatibleRuntimes(_compatibleRuntimes)
    return cdkBuilder.build()
  }
}
