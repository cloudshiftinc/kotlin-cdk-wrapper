@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersion
import software.constructs.Construct

@CdkDslMarker
public class CfnCoreDefinitionVersionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnCoreDefinitionVersion.Builder =
      CfnCoreDefinitionVersion.Builder.create(scope, id)

  private val _cores: MutableList<Any> = mutableListOf()

  /**
   * The ID of the core definition associated with this version.
   *
   * This value is a GUID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinitionversion.html#cfn-greengrass-coredefinitionversion-coredefinitionid)
   * @param coreDefinitionId The ID of the core definition associated with this version. 
   */
  public fun coreDefinitionId(coreDefinitionId: String) {
    cdkBuilder.coreDefinitionId(coreDefinitionId)
  }

  /**
   * The Greengrass core in this version.
   *
   * Currently, the `Cores` property for a core definition version can contain only one core.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinitionversion.html#cfn-greengrass-coredefinitionversion-cores)
   * @param cores The Greengrass core in this version. 
   */
  public fun cores(vararg cores: Any) {
    _cores.addAll(listOf(*cores))
  }

  /**
   * The Greengrass core in this version.
   *
   * Currently, the `Cores` property for a core definition version can contain only one core.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinitionversion.html#cfn-greengrass-coredefinitionversion-cores)
   * @param cores The Greengrass core in this version. 
   */
  public fun cores(cores: Collection<Any>) {
    _cores.addAll(cores)
  }

  /**
   * The Greengrass core in this version.
   *
   * Currently, the `Cores` property for a core definition version can contain only one core.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinitionversion.html#cfn-greengrass-coredefinitionversion-cores)
   * @param cores The Greengrass core in this version. 
   */
  public fun cores(cores: IResolvable) {
    cdkBuilder.cores(cores)
  }

  public fun build(): CfnCoreDefinitionVersion {
    if(_cores.isNotEmpty()) cdkBuilder.cores(_cores)
    return cdkBuilder.build()
  }
}
