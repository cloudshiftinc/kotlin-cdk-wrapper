@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion
import software.constructs.Construct

@CdkDslMarker
public class CfnLoggerDefinitionVersionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnLoggerDefinitionVersion.Builder =
      CfnLoggerDefinitionVersion.Builder.create(scope, id)

  private val _loggers: MutableList<Any> = mutableListOf()

  /**
   * The ID of the logger definition associated with this version.
   *
   * This value is a GUID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html#cfn-greengrass-loggerdefinitionversion-loggerdefinitionid)
   * @param loggerDefinitionId The ID of the logger definition associated with this version. 
   */
  public fun loggerDefinitionId(loggerDefinitionId: String) {
    cdkBuilder.loggerDefinitionId(loggerDefinitionId)
  }

  /**
   * The loggers in this version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html#cfn-greengrass-loggerdefinitionversion-loggers)
   * @param loggers The loggers in this version. 
   */
  public fun loggers(vararg loggers: Any) {
    _loggers.addAll(listOf(*loggers))
  }

  /**
   * The loggers in this version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html#cfn-greengrass-loggerdefinitionversion-loggers)
   * @param loggers The loggers in this version. 
   */
  public fun loggers(loggers: Collection<Any>) {
    _loggers.addAll(loggers)
  }

  /**
   * The loggers in this version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html#cfn-greengrass-loggerdefinitionversion-loggers)
   * @param loggers The loggers in this version. 
   */
  public fun loggers(loggers: IResolvable) {
    cdkBuilder.loggers(loggers)
  }

  public fun build(): CfnLoggerDefinitionVersion {
    if(_loggers.isNotEmpty()) cdkBuilder.loggers(_loggers)
    return cdkBuilder.build()
  }
}
