@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion
import software.constructs.Construct

@CdkDslMarker
public class CfnResourceDefinitionVersionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnResourceDefinitionVersion.Builder =
      CfnResourceDefinitionVersion.Builder.create(scope, id)

  private val _resources: MutableList<Any> = mutableListOf()

  /**
   * The ID of the resource definition associated with this version.
   *
   * This value is a GUID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinitionversion.html#cfn-greengrass-resourcedefinitionversion-resourcedefinitionid)
   * @param resourceDefinitionId The ID of the resource definition associated with this version. 
   */
  public fun resourceDefinitionId(resourceDefinitionId: String) {
    cdkBuilder.resourceDefinitionId(resourceDefinitionId)
  }

  /**
   * The resources in this version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinitionversion.html#cfn-greengrass-resourcedefinitionversion-resources)
   * @param resources The resources in this version. 
   */
  public fun resources(vararg resources: Any) {
    _resources.addAll(listOf(*resources))
  }

  /**
   * The resources in this version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinitionversion.html#cfn-greengrass-resourcedefinitionversion-resources)
   * @param resources The resources in this version. 
   */
  public fun resources(resources: Collection<Any>) {
    _resources.addAll(resources)
  }

  /**
   * The resources in this version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinitionversion.html#cfn-greengrass-resourcedefinitionversion-resources)
   * @param resources The resources in this version. 
   */
  public fun resources(resources: IResolvable) {
    cdkBuilder.resources(resources)
  }

  public fun build(): CfnResourceDefinitionVersion {
    if(_resources.isNotEmpty()) cdkBuilder.resources(_resources)
    return cdkBuilder.build()
  }
}
